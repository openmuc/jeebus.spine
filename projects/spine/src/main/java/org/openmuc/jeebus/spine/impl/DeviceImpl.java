/********************************************************************************
 * Copyright (c) 2026 Fraunhofer ISE
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 ********************************************************************************/

package org.openmuc.jeebus.spine.impl;

import org.openmuc.jeebus.spine.api.Error;
import org.openmuc.jeebus.spine.api.*;
import org.openmuc.jeebus.spine.spi.Communication;
import org.openmuc.jeebus.spine.spi.SpineConnection;
import org.openmuc.jeebus.spine.spi.UseCase;
import org.openmuc.jeebus.spine.utils.NamedThreadFactory;
import org.openmuc.jeebus.spine.xsd.v1.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.math.BigInteger;
import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.prefs.Preferences;

import static org.openmuc.jeebus.spine.utils.SpineUtilities.getNowTimestamp;

class DeviceImpl implements EntityParent, Device {
    private static final Logger LOGGER = LoggerFactory.getLogger(Device.class);
    private static final int TIMEOUT = 30;
    private final SpecificationVersionDataType specificationVersion
        = new SpecificationVersionDataType();
    private final DeviceAddressType address = new DeviceAddressType();
    private final List<Entity> entities = new ArrayList<>();
    // fill gaps in list, when entities are removed
    // note: if the resulting address re-use causes problems this setup should be switched to a map
    // rather than a dense list
    private final Queue<Integer> nextEntityId = new PriorityQueue<>();
    private final Map<BigInteger, CompletableFuture<RequestResult>> requests
        = new HashMap<>();
    private final NodeManagementImpl nodeManagement;
    private final NamedThreadFactory namedThreadFactory = new NamedThreadFactory(
        "jeebus.spine DeviceImpl Timeout ");
    private final ScheduledExecutorService timeoutExecutorService
        = Executors.newSingleThreadScheduledExecutor(namedThreadFactory);
    private ConnectionHandlerImpl connHandler;
    private DeviceTypeEnumType deviceType;
    private boolean discoverDevices = true;
    private boolean acknowledgment = true;
    private final AtomicLong messageCounter = new AtomicLong();
    private final AtomicLong fileMessageCounter = new AtomicLong();
    private String label = "";
    private String description = "";
    private boolean automaticDestinationListDetection;
    private final Map<UseCase, Entity> activeUseCases = new HashMap<>();
    private transient Map<UseCase, Entity> activeUseCasesView;

    DeviceImpl() {
        NodeManagementImpl.addNodeManagement(this);
        nodeManagement = (NodeManagementImpl) getNodeManagement();
        specificationVersion.setValue("1.3.0");
        initMessageCounter();
    }

    @Override
    public NodeManagement getNodeManagement() {
        try {
            return (NodeManagement) getEntity(0).getFeature(0);
        }
        catch (SpineException e) {
            LOGGER.trace("NodeManagement instance does not exist!", e);
            return null;
        }
    }

    private void initMessageCounter() {
        Preferences preferences = Preferences.userNodeForPackage(DeviceImpl.class);
        messageCounter.set(preferences.getLong("messageCounter", -1000L));
        fileMessageCounter.set(messageCounter.get());
        messageCounter.addAndGet(1000L);
    }

    @Override
    public ConnectionHandler getConnectionHandler() {
        return connHandler;
    }

    @Override
    public DeviceAddressType getAddress() {
        return address;
    }

    @Override
    public void deviceDetected(String address) {
        LOGGER.info("New device detected with address: {}", address);

        nodeManagement.notifyDeviceAddressListeners(address);

        if (discoverDevices) {
            nodeManagement.startDiscovery(address);

            /* This is for chapter SPINE:7.2 Destination list */
            if (automaticDestinationListDetection) {
                nodeManagement.getFullDeviceInformationRequest(address)
                    .whenComplete((RequestResult result, Throwable e) -> {
                        if (e != null) {
                            LOGGER.error(
                                "Device at address {} reported an error: {}",
                                address,
                                e.getMessage()
                            );
                            LOGGER.trace("Detailed error report: ", e);
                        }
                        else {
                            nodeManagement.handleDestinationList(
                                result
                                    .getCmd()
                                    .getNodeManagementDetailedDiscoveryData(),
                                address
                            );
                        }
                    });
            }
        }
    }

    @Override
    public void parseDatagram(DatagramType datagram) {
        if (datagram.getHeader().getAddressDestination().getDevice() != null
            && !datagram.getHeader()
            .getAddressDestination()
            .getDevice()
            .equals(address.getDevice())) {
            forwardDatagram(datagram);
        }
        else {
            FeatureImpl feature;
            try {
                feature = (FeatureImpl) getFeature(datagram
                    .getHeader()
                    .getAddressDestination());
            }
            catch (SpineException e) {
                sendAcknowledgment(datagram, e);
                return;
            }
            switch (datagram.getHeader().getCmdClassifier()) {
                case READ:
                    feature.read(datagram);
                    break;
                case CALL:
                    feature.call(datagram);
                    break;
                case WRITE:
                    feature.write(datagram);
                    break;
                case NOTIFY:
                    feature.notify(datagram);
                    break;
                case RESULT:
                case REPLY:
                    tryRequestCompletion(datagram);
                    break;
            }
        }
    }

    @Override
    public SpecificationVersionDataType getSpecificationVersion() {
        return specificationVersion;
    }

    @Override
    public DeviceTypeEnumType getType() {
        return deviceType;
    }

    void setType(DeviceTypeEnumType deviceType) {
        this.deviceType = deviceType;
    }

    @Override
    public boolean hasDescription() {
        return !description.isEmpty();
    }

    @Override
    public boolean hasLabel() {
        return !label.isEmpty();
    }

    @Override
    public Feature getFeature(FeatureAddressType featureAddress) throws
        SpineException {
        EntityParent parent = this;
        for (Long entityId : featureAddress.getEntity()) {
            parent = parent.getEntity(entityId.intValue());
        }
        if (!parent.isDevice()) {
            return ((Entity) parent).getFeature(featureAddress
                .getFeature()
                .intValue());
        }
        return null;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        if (label.length() > 256) {
            LOGGER.warn(
                "Label has more than 256 characters. Receivers may shorten it.");
        }
        this.label = label;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        if (description.length() > 4096) {
            LOGGER.warn(
                "Description has more than 4096 characters. Receivers may shorten it.");
        }
        this.description = description;
    }

    @Override
    public NetworkManagementFeatureSetType getCommunicationMode() {
        return nodeManagement.getCommunicationMode();
    }

    void setCommunicationMode(NetworkManagementFeatureSetType mode) {
        nodeManagement.setCommunicationMode(mode);
    }

    private void forwardDatagram(DatagramType datagram) {
        if (nodeManagement.forwardingAllowed(datagram.getHeader())) {
            String commAddress = connHandler.getCommunicationAddress(
                datagram.getHeader().getAddressDestination().getDevice());
            if (commAddress == null) {
                SpineAcknowledgment ack
                    = new SpineAcknowledgment(Error.DESTINATION_UNKNOWN);
                forwardDatagram(ack.getDatagram(getResultHeader(datagram.getHeader())));
            }
            SpineConnection connection = connHandler.newConnection(commAddress);
            LOGGER.debug(
                "Forwarding datagram from {} to {}",
                datagram.getHeader().getAddressSource().getDevice(),
                datagram.getHeader().getAddressDestination().getDevice()
            );
            connection.sendMessage(datagram);

        }
    }

    private void sendAcknowledgment(DatagramType datagram, SpineException e) {
        DatagramType answer = e
            .getAcknowledgment()
            .getDatagram(datagram.getHeader());
        getConnectionHandler().newConnection(
                getConnectionHandler().getCommunicationAddress(datagram
                    .getHeader()
                    .getAddressSource()
                    .getDevice()))
            .sendMessage(answer);
    }

    private HeaderType getResultHeader(HeaderType originalMessageHeader) {
        HeaderType header = getHeader(
            originalMessageHeader.getAddressSource(),
            CmdClassifierType.RESULT
        );
        header.setAddressSource(getNodeManagement().getAddress());
        header.setMsgCounterReference(originalMessageHeader.getMsgCounter());
        return header;
    }

    private void tryRequestCompletion(DatagramType datagram) {
        synchronized (requests) {
            BigInteger msgCounterReference = datagram
                .getHeader()
                .getMsgCounterReference();
            CompletableFuture<RequestResult> request = requests.get(
                msgCounterReference);
            if (request == null) {
                LOGGER.error(
                    "Received datagram with invalid message counter reference ({})."
                        + "Message will be dropped.",
                    datagram.getHeader().getMsgCounterReference()
                );
                return;
            }
            if (isNegativeAck(datagram)) {
                request.completeExceptionally(getSpineException(datagram));
            }
            else {
                request.complete(new RequestResultImpl(datagram));
            }
            requests.remove(msgCounterReference);
        }
    }

    private boolean isNegativeAck(DatagramType datagram) {
        return datagram
            .getHeader()
            .getCmdClassifier()
            .equals(CmdClassifierType.RESULT)
            && datagram.getPayload().getCmd().get(0).getResultData().getErrorNumber()
            != 0;
    }

    private Throwable getSpineException(DatagramType datagram) {
        ResultDataType result = datagram
            .getPayload()
            .getCmd()
            .get(0)
            .getResultData();
        Error error = Error.values()[result.getErrorNumber().intValue()];
        return new SpineException(error, result.getDescription());
    }

    void setDiscoverDevices(boolean discoverDevices) {
        this.discoverDevices = discoverDevices;
    }

    void setCommunication(Communication communication) {
        connHandler = new ConnectionHandlerImpl(communication);
        communication.setDevice(this);
    }

    void setId(String id) {
        address.setDevice(id);
    }

    boolean isCompleted() {
        return connHandler != null
            && address.getDevice() != null
            && deviceType != null;
    }

    void connect() {
        ((ConnectionHandlerImpl) getConnectionHandler())
            .getCommunication()
            .connect();
    }

    /**
     * @param destinationAddress
     *     the address of the receiving SPINE feature
     * @param cmdClassifier
     *     the SPINE command (e.g. READ, WRITE, REPLY)
     * @return header prefilled with destination address, message counter and
     * specification version
     */
    HeaderType getHeader(
        FeatureAddressType destinationAddress,
        CmdClassifierType cmdClassifier
    ) {
        HeaderType header = new HeaderType();
        header.setAddressDestination(destinationAddress);

        synchronized (messageCounter) {
            messageCounter.incrementAndGet();
            BigInteger msgCounter = new BigInteger(Long.toUnsignedString(
                messageCounter.get()));
            if (messageCounter.get() >= fileMessageCounter.get() + 1000) {
                fileMessageCounter.set(messageCounter.get());
                Preferences
                    .userNodeForPackage(DeviceImpl.class)
                    .putLong("messageCounter", fileMessageCounter.get());
            }
            header.setMsgCounter(msgCounter);
        }
        header.setTimestamp(getNowTimestamp());
        header.setSpecificationVersion(specificationVersion.getValue());
        header.setCmdClassifier(cmdClassifier);
        return header;
    }

    @Override
    public int addEntity(Entity entity) {
        int id;
        if (nextEntityId.isEmpty()) {
            entities.add(entity);
            id = entities.size() - 1;
        }
        else {
            id = nextEntityId.remove();
            entities.set(id, entity);
        }
        ((EntityImpl) entity).setParent(this, id);
        if (isConnected()) {
            nodeManagement.entityAdded((EntityImpl) entity);
        }
        return id;
    }

    boolean isConnected() {
        ConnectionHandlerImpl handler
            = (ConnectionHandlerImpl) getConnectionHandler();
        return handler != null
            && handler.getCommunication().isConnected();
    }

    @Override
    public Entity getEntity(int index) throws SpineException {
        try {
            return entities.get(index);
        }
        catch (IndexOutOfBoundsException e) {
            throw new SpineException(
                Error.DESTINATION_UNKNOWN,
                "Requested entity does not exist."
            );
        }
    }

    @Override
    public void deleteEntity(int address) throws SpineException {
        Entity entity;
        try {
            entity = entities.set(address, null);
            if (address == entities.size()-1) {
                entities.remove(address);
            } else {
                nextEntityId.add(address);
            }
        }
        catch (IndexOutOfBoundsException e) {
            throw new SpineException(
                Error.DESTINATION_UNKNOWN,
                "To be deleted entity does not exist."
            );
        }
        if (entity instanceof Shutdownable) {
            ((Shutdownable) entity).close();
        }
        nodeManagement.entityRemoved(entity.getAddress());
    }

    @Override
    public EntityParent getParent() {
        return null;
    }

    @Override
    public Collection<Entity> getEntities() {
        return entities;
    }

    @Override
    public boolean isDevice() {
        return true;
    }

    @Override
    public DeviceImpl getDevice() {
        return this;
    }

    CompletableFuture<RequestResult> newRequest(BigInteger messageCounter) {
        CompletableFuture<RequestResult> future = new CompletableFuture<>();
        synchronized (requests) {
            requests.put(messageCounter, future);
        }
        timeoutExecutorService.schedule(
            () -> checkTimeout(future, messageCounter),
            TIMEOUT,
            TimeUnit.SECONDS
        );
        LOGGER.debug(
            "Registering new request with message counter {}",
            messageCounter
        );
        return future;
    }

    private void checkTimeout(
        CompletableFuture<RequestResult> future,
        BigInteger messageCounter
    ) {
        if (!future.isDone()) {
            LOGGER.error(
                "Request with message counter {} timed out.",
                messageCounter
            );
            future.completeExceptionally(new SpineException(
                Error.TIMEOUT,
                "Timeout while waiting for a reply"
            ));
            synchronized (requests) {
                requests.remove(messageCounter);
            }
        }
    }

    public boolean isAcknowledgmentEnabled() {
        return acknowledgment;
    }

    public void setAcknowledgment(boolean acknowledgment) {
        this.acknowledgment = acknowledgment;
    }

    void setAutomaticDestinationListDetection(boolean enabled) {
        automaticDestinationListDetection = enabled;
    }


    @Override
    public Map<UseCase, Entity> getUseCases() {
        if (activeUseCasesView == null)
            activeUseCasesView = Collections.unmodifiableMap(activeUseCases);
        return activeUseCasesView;
    }

    @Override
    public void close() {
        LOGGER.info("Shutting down device {}", this);
        ArrayDeque<Entity> entities = new ArrayDeque<>(getEntities());
        this.entities.clear();
        while (!entities.isEmpty()) {
            Entity e = entities.removeLast();
            entities.addAll(e.getEntities());
            e.getFeatures().forEach(Feature::shutdown);
        }
        for (CompletableFuture<RequestResult> request : requests.values()) {
            if (!request.isDone()) {
                request.completeExceptionally(new SpineException(
                    Error.GENERAL_ERROR,
                    "Device shutting down"
                ));
            }
        }
        // the only things running on this executor are timeouts, which we don't
        // need anymore after completing all requests, so they don't need to finish
        timeoutExecutorService.shutdownNow();
        requests.clear();

        // kill connection
        connHandler.shutdown();

        // drop active use cases
        for (UseCase useCase : activeUseCases.keySet()) {
            useCase.close();
        }
        activeUseCases.clear();
    }

    /**
     * Add a use case to the list of running use cases.
     *
     * @param entity the entity on which the use case is running
     * @param useCase the use case to add.
     */
    void registerUseCase(EntityImpl entity, UseCase useCase) {
        activeUseCases.put(useCase, entity);
    }

    @Override
    public String toString() {
        return "DeviceImpl{" +
                "address=" + address +
                ", entities=" + entities +
                ", nodeManagement=" + nodeManagement +
                ", deviceType=" + deviceType +
                ", discoverDevices=" + discoverDevices +
                ", acknowledgment=" + acknowledgment +
                ", fileMessageCounter=" + fileMessageCounter +
                ", label='" + label + '\'' +
                ", description='" + description + '\'' +
                ", automaticDestinationListDetection=" + automaticDestinationListDetection +
                ", activeUseCases=" + activeUseCases +
                ", messageCounter=" + messageCounter +
                '}';
    }

    public void setDiscoveryLogging(boolean enabled) {
        nodeManagement.setDiscoveryLogging(enabled);
    }

    public void setDiscoveryLogPath(File path) {
        nodeManagement.setDiscoveryLogPath(path);
    }
}
