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

import org.openmuc.jeebus.spine.api.*;
import org.openmuc.jeebus.spine.api.Error;
import org.openmuc.jeebus.spine.impl.parser.MessageParser;
import org.openmuc.jeebus.spine.spi.BindingListener;
import org.openmuc.jeebus.spine.spi.FeaturePermission;
import org.openmuc.jeebus.spine.spi.SpineConnection;
import org.openmuc.jeebus.spine.spi.SpineSubscription;
import org.openmuc.jeebus.spine.spi.function.FeatureFunction;
import org.openmuc.jeebus.spine.xsd.v1.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;

import static org.openmuc.jeebus.spine.impl.SubscriptionWrapper.State.PENDING;
import static org.openmuc.jeebus.spine.impl.SubscriptionWrapper.State.SUCCESSFUL;
import static org.openmuc.jeebus.spine.xsd.v1.CmdClassifierType.*;

class FeatureImpl implements Feature {
    private static final Logger LOGGER = LoggerFactory.getLogger(Feature.class);
    private final Map<String, FeatureFunction> functions = new HashMap<>();
    private final FeatureAddressType address = new FeatureAddressType();
    private final List<FeatureAddressType> subscribers = new ArrayList<>();
    private final Map<String, SubscriptionWrapper> subscriptions
        = new ConcurrentHashMap<>();
    private final List<String> bindings = new ArrayList<>();
    private EntityImpl parent;
    private FeatureTypeEnumType featureType;
    private RoleType role;
    private String label = "";
    private String description = "";
    private FeaturePermission featurePermission = null;
    private String group;
    private NetworkManagementStateChangeType lastStateChange = null;
    private String minimumTrustLevel = null;
    private FeatureWrapper featureWrapper;

    private static final Set<CmdClassifierType> ACKNOWLEDGEMENT_REQUEST_WHITELIST
        = Set.of(WRITE, CALL);
    private final Set<BindingListener> bindingListeners = new HashSet<>();

    FeatureImpl() {
    }

    public boolean subscribe(NodeManagementSubscriptionRequestCallType.SubscriptionRequest subscriptionRequest) {
        LOGGER.debug("Processing subscription request {}", subscriptionRequest);
        try {
            checkTrustLevel(subscriptionRequest.getClientAddress());
        }
        catch (SpineException e) {
            return false;
        }
        if ((role.equals(RoleType.SERVER) || role.equals(RoleType.SPECIAL))
            && featurePermission != null
            && featurePermission.subscriptionAllowed(subscriptionRequest)) {
            subscribers.add(subscriptionRequest.getClientAddress());
            LOGGER.debug("Subscription request accepted.");
            return true;
        }
        LOGGER.info("Subscription request denied (role={})", role);
        if (featurePermission == null) {
            LOGGER.info("... because featurePermission is missing");
        }
        return false;
    }

    private void checkTrustLevel(FeatureAddressType clientAddress) throws
        SpineException {
        if (hasMinimumTrustLevel()
            && featurePermission != null
            && !featurePermission.isTrusted(
            clientAddress,
            minimumTrustLevel
        )) {
            throw new SpineException(
                Error.COMMAND_REJECTED,
                "Minimum trust level not gained"
            );
        }
    }

    boolean hasMinimumTrustLevel() {
        return minimumTrustLevel != null;
    }

    @Override
    public void addBindingListener(BindingListener listener) {
        this.bindingListeners.add(listener);
    }

    public boolean bind(NodeManagementBindingRequestCallType.BindingRequest bindingRequest) {
        try {
            checkTrustLevel(bindingRequest.getClientAddress());
        }
        catch (SpineException e) {
            return false;
        }
        if (
            (role.equals(RoleType.SERVER) || role.equals(RoleType.SPECIAL))
                && featurePermission != null
                && featurePermission.bindingAllowed(bindingRequest)
        ) {
            bindings.add(addressToString(bindingRequest.getClientAddress()));

            // Doing this in parallel since we don't want to get stuck here
            bindingListeners
                .parallelStream()
                .forEach(listener -> listener.onBind(
                    (NodeManagementBindingRequestCallType.BindingRequest) bindingRequest.clone()
                ));

            LOGGER.debug("Binding request accepted");
            return true;
        }
        LOGGER.debug("Binding request denied");
        return false;
    }

    private String addressToString(FeatureAddressType address) {
        StringBuilder addressString = new StringBuilder(address.getDevice() + ".");
        for (Long entityId : address.getEntity()) {
            addressString.append(entityId).append(".");
        }
        addressString.append(address.getFeature());

        return addressString.toString();
    }

    public void read(DatagramType datagram) {
        DatagramType answer = getEmptyDatagramWithHeader(
            datagram.getHeader().getAddressSource(),
            REPLY
        );
        try {
            checkTrustLevel(datagram.getHeader().getAddressSource());
            CmdType cmd = datagram.getPayload().getCmd().get(0);
            String functionName = MessageParser.getFunctionName(cmd);
            if (functionName != null) {
                FeatureFunction function = functions.get(functionName);
                if (Objects.isNull(function)) {
                    handleCommandOnNullFunction();
                }
                else if (!function.isReadable()) {
                    SpineAcknowledgment ack = new SpineAcknowledgment(
                        Error.COMMAND_NOT_SUPPORTED,
                        "Function + " + functionName + " does not support READ"
                    );
                    throw ack.getThrowable();
                }
                answer.getPayload()
                    .getCmd()
                    .add(function.read(
                        getFilter(cmd),
                        datagram.getHeader().getAddressSource()
                    ));
                answer
                    .getHeader()
                    .setMsgCounterReference(datagram.getHeader().getMsgCounter());
            }
            else {
                throw new SpineException(
                    Error.COMMAND_REJECTED,
                    "SPINE function is missing in datagram"
                );
            }
        }
        catch (SpineException e) {
            answer = e
                .getAcknowledgment()
                .getDatagram(getResultHeader(datagram.getHeader()));
        }
        reply(datagram.getHeader().getAddressSource(), answer);
    }

    protected DatagramType getEmptyDatagramWithHeader(
        FeatureAddressType destinationAddress,
        CmdClassifierType cmdClassifier
    ) {
        DatagramType datagram = new DatagramType();

        DeviceImpl device = (DeviceImpl) getDevice();
        HeaderType header = device.getHeader(destinationAddress, cmdClassifier);
        header.setAddressSource(getAddress());

        if (ACKNOWLEDGEMENT_REQUEST_WHITELIST.contains(cmdClassifier)) {
            header.setAckRequest(device.isAcknowledgmentEnabled());
        }
        datagram.setHeader(header);

        PayloadType payload = new PayloadType();
        datagram.setPayload(payload);

        return datagram;
    }

    private FilterType getFilter(CmdType cmd) {
        FilterType filter = null;
        if (!cmd.getFilter().isEmpty()) {
            filter = cmd.getFilter().get(0);
        }

        return filter;
    }

    protected void reply(FeatureAddressType destinationAddress, DatagramType reply) {
        if (Objects.equals(
            destinationAddress.getDevice(),
            getDevice().getAddress().getDevice()
        )) {
            getDevice().parseDatagram(reply);
            LOGGER.warn(
                "DeviceId of received message is the same as own DeviceId. Message will be dropped.");
            return;
        }
        SpineConnection connection = getDevice()
            .getConnectionHandler()
            .newConnection(getDevice()
                .getConnectionHandler()
                .getCommunicationAddress(destinationAddress.getDevice()));
        connection.sendMessage(reply);
    }

    public void write(DatagramType datagram) {
        DatagramType ackDatagram;
        boolean success = true;
        try {
            CmdType cmd = datagram.getPayload().getCmd().get(0);
            String functionName = MessageParser.getFunctionName(cmd);
            if (functionName != null) {
                checkTrustLevel(datagram.getHeader().getAddressSource());
                FeatureFunction function = functions.get(functionName);
                if (Objects.isNull(function)) {
                    handleCommandOnNullFunction();
                }
                else if (!function.isWritable()) {
                    SpineAcknowledgment ack = new SpineAcknowledgment(
                        Error.COMMAND_NOT_SUPPORTED,
                        "Function  not support WRITE"
                    );
                    throw ack.getThrowable();
                }
                if (function.bindingRequired() && !bindings.contains(
                    addressToString(datagram.getHeader().getAddressSource()))) {
                    SpineAcknowledgment ack
                        = new SpineAcknowledgment(Error.BINDING_NECESSARY, "");
                    throw ack.getThrowable();
                }
                SpineAcknowledgment ack = function.write(
                    datagram.getPayload().getCmd().get(0),
                    datagram.getHeader().getAddressSource()
                );

                if (!ack.isPositive()) {
                    throw ack.getThrowable();
                }

                ackDatagram = ack.getDatagram(getResultHeader(datagram.getHeader()));
            }
            else {
                throw new SpineException(
                    Error.COMMAND_REJECTED,
                    "SPINE function is missing in datagram"
                );
            }
        }
        catch (SpineException e) {
            ackDatagram = e
                .getAcknowledgment()
                .getDatagram(getResultHeader(datagram.getHeader()));
            success = false;
        }
        if (datagram.getHeader().getAckRequest()) {
            reply(datagram.getHeader().getAddressSource(), ackDatagram);
        }
        if (success) {
            notifySubscribers(datagram.getPayload().getCmd().get(0));
        }
    }

    protected HeaderType getResultHeader(HeaderType originalHeader) {
        HeaderType header = ((DeviceImpl) getDevice()).getHeader(
            originalHeader.getAddressSource(),
            RESULT
        );
        header.setAddressSource(getAddress());
        header.setMsgCounterReference(originalHeader.getMsgCounter());
        return header;
    }

    private boolean isFunction(String nodeName) {
        return !Objects.equals(nodeName, "function") && !Objects.equals(
            nodeName,
            "lastUpdateAt"
        ) && !Objects.equals(
            nodeName, "manufacturerSpecificExtension") && !Objects.equals(
            nodeName,
            "filter"
        );
    }

    public void call(DatagramType datagram) {
        DatagramType ackDatagram;
        try {
            CmdType cmd = datagram.getPayload().getCmd().get(0);
            String functionName = MessageParser.getFunctionName(cmd);
            if (functionName == null) {
                throw new SpineException(
                    Error.GENERAL_ERROR,
                    "Function name could not be found"
                );
            }
            FeatureFunction function = functions.get(functionName);
            if (function.isCallable()) {
                ackDatagram = function.call(
                    datagram.getPayload().getCmd().get(0),
                    datagram.getHeader().getAddressSource()
                ).getDatagram(getResultHeader(datagram.getHeader()));
            }
            else {
                throw new SpineException(
                    Error.COMMAND_REJECTED,
                    "Function does not support CALL"
                );
            }
        }
        catch (SpineException e) {
            ackDatagram = e
                .getAcknowledgment()
                .getDatagram(getResultHeader(datagram.getHeader()));
        }
        if (datagram.getHeader().getAckRequest()) {
            reply(datagram.getHeader().getAddressSource(), ackDatagram);
        }
    }

    public void notify(DatagramType datagram) {
        String address = addressToString(datagram
            .getHeader()
            .getAddressSource());
        if (subscriptions.containsKey(address)) {
            RequestResultImpl notification = new RequestResultImpl(datagram);
            subscriptions
                .get(address)
                .getSubscriptions()
                .forEach(sub -> sub.messageReceived(notification));
        }
        else {
            LOGGER.debug("No subscriptions for {} but got notification.", address);
        }
    }

    public FeatureAddressType getAddressWithoutDevice() {
        return address;
    }

    @Override
    public RoleType getRole() {
        return role;
    }

    void setRole(RoleType role) {
        this.role = role;
    }

    @Override
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

    @Override
    public boolean hasLabel() {
        return !label.isEmpty();
    }

    @Override
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
    public boolean hasDescription() {
        return !description.isEmpty();
    }

    @Override
    public void addFunction(FeatureFunction function) {
        if (functions.containsKey(function.getFunctionName())) {
            LOGGER.debug(
                "Function {} already exists and will be overridden",
                function.getFunctionName()
            );
        }
        function.setFeature(this);
        functions.put(function.getFunctionName(), function);
        if (featureWrapper != null) featureWrapper.updateFunction(function);
        if (getDevice() != null) {
            ((NodeManagementImpl) getDevice().getNodeManagement()).featureChanged(
                getAddress(),
                function.getFunctionName()
            );
        }
    }

    @Override
    public Device getDevice() {
        EntityImpl parent = getParent();
        return parent != null ? parent.getDevice() : null;
    }

    @Override
    public CompletableFuture<RequestResult> requestRead(
        FeatureAddressType address,
        CmdType cmd
    ) {
        return requestRead(address, cmd, null);
    }

    CompletableFuture<RequestResult> requestRead(
        FeatureAddressType address,
        CmdType cmd,
        String communicationAddress
    ) {
        return request(address, cmd, READ, communicationAddress);
    }

    private CompletableFuture<RequestResult> request(
        FeatureAddressType address,
        CmdType cmd,
        CmdClassifierType cmdClassifier,
        String communicationAddress
    ) {
        validateCmd(cmd);

        DatagramType datagram = completeDatagram(address, cmd, cmdClassifier);

        CompletableFuture<RequestResult> future
            = ((DeviceImpl) getDevice()).newRequest(datagram
            .getHeader()
            .getMsgCounter());

        send(address, communicationAddress, datagram);

        return future;
    }

    private void fireAndForget(
        FeatureAddressType address,
        CmdType cmd,
        CmdClassifierType cmdClassifier,
        String communicationAddress
    ) {
        validateCmd(cmd);

        DatagramType datagram = completeDatagram(address, cmd, cmdClassifier);

        send(address, communicationAddress, datagram);
    }

    private void send(
        FeatureAddressType address,
        String communicationAddress,
        DatagramType datagram
    ) {
        // TODO update this method when jship#85 finished
        /* Really, we should not be handling communication addresses in
         * SPINE at all (this has been discussed in various issues).
         *
         * But for now, we are.
         */
        ConnectionHandler connHandler = getDevice().getConnectionHandler();
        if (Objects.equals(
            address.getDevice(),
            getDevice().getAddress().getDevice()
        )) {
            getDevice().parseDatagram(datagram);
        }
        else {
            if (communicationAddress == null) {
                communicationAddress
                    = connHandler.getCommunicationAddress(address.getDevice());
                if (communicationAddress == null) {
                    /* One might think that, if we have no communication address,
                     * surely we cannot reach the destination device, and so we should
                     * exit early.
                     *
                     * One would be wrong: at the very least in the test
                     * suite, which uses a FakeCommunication implementation that does
                     * no networking, a communication address for the destination
                     * is not actually required. So all we can do is warn (and ignore
                     * the warning when it comes up in tests)
                     */
                    // if you came here because you saw this warning in tests, you
                    // can (probably) ignore it; see above explanation.
                    LOGGER.warn(
                        "Feature {} attempting to send to device {}, but could not find a communication address for that destination!",
                        this,
                        address.getDevice()
                    );
                }
            }
            SpineConnection connection = connHandler.newConnection(
                communicationAddress);
            connection.sendMessage(datagram);
        }
    }

    private DatagramType completeDatagram(
        FeatureAddressType address,
        CmdType cmd,
        CmdClassifierType cmdClassifier
    ) {
        DatagramType datagram = getEmptyDatagramWithHeader(address, cmdClassifier);
        datagram.getPayload().getCmd().add(cmd);
        return datagram;
    }

    private static void validateCmd(CmdType cmd) {
        String functionName = MessageParser.getFunctionName(cmd);
        if (functionName == null) {
            LOGGER.warn(
                "About to send datagram with missing function - this is out of spec and will almost surely"
                    + " result in an error message from the communication partner!"
            );
        }
        if (cmd.getFunction() == null && !cmd.getFilter().isEmpty()) {
            LOGGER.warn(
                "About to send message with filter but with field `function` not set"
                    + " - this is out of spec!"
            );
        }
    }

    @Override
    public CompletableFuture<RequestResult> requestWrite(
        FeatureAddressType address,
        CmdType cmd
    ) {
        return request(address, cmd, WRITE, null);
    }

    @Override
    public synchronized CompletableFuture<RequestResult> requestSubscription(
        FeatureAddressType address,
        FeatureTypeEnumType featureType,
        SpineSubscription subscription
    ) {
        String addressString = addressToString(address);
        if(subscriptions.containsKey(addressString)) {
            SubscriptionWrapper wrapper = subscriptions.get(addressString);
            LOGGER.debug("Found existing subscription for address {}", wrapper);
            wrapper.addSubscription(subscription);

            if (wrapper.getState() != PENDING && wrapper.getState() != SUCCESSFUL) {
                LOGGER.debug(
                    "Previous subscription request was unsuccessful. Retrying."
                );
                CompletableFuture<RequestResult> future
                    = makeSubscriptionRequest(address, featureType);
                wrapper.retry(future);
                return future;
            }

            SpineAcknowledgment ack = new SpineAcknowledgment(
                Error.NO_ERROR,
                "Reusing existing subscription"
            );
            HeaderType originalHeader = new HeaderType();
            originalHeader.setAddressSource(getAddress());
            originalHeader.setAddressDestination(address);
            return CompletableFuture.completedFuture(new RequestResultImpl(
                ack.getDatagram(getResultHeader(originalHeader))));
        }
        else {
            CompletableFuture<RequestResult> future = makeSubscriptionRequest(
                address,
                featureType
            );

            subscriptions.put(
                addressString,
                new SubscriptionWrapper(
                    subscription,
                    address,
                    featureType,
                    future
                )
            );

            return future;
        }
    }

    private CompletableFuture<RequestResult> makeSubscriptionRequest(
        FeatureAddressType address,
        FeatureTypeEnumType featureType
    ) {
        CmdType cmd = ((NodeManagementImpl) getDevice().getNodeManagement())
            .getSubscriptionRequest(
                getAddress(),
                address,
                featureType
            );
        return request(((NodeManagementImpl) getDevice().getNodeManagement())
                .getNodeManagementAddress(address.getDevice()),
            cmd,
            CALL,
            null
        );
    }

    @Override
    public CompletableFuture<RequestResult> requestBind(
        FeatureAddressType address,
        FeatureTypeEnumType featureType
    ) {
        NodeManagementImpl nodeManagement
            = (NodeManagementImpl) getDevice().getNodeManagement();
        CmdType cmd = nodeManagement.getBindingRequest(
            getAddress(),
            address,
            featureType
        );
        return request(
            nodeManagement.getNodeManagementAddress(address.getDevice()),
            cmd,
            CALL,
            null
        );
    }

    @Override
    public void releaseSubscription(FeatureAddressType address) {
        subscriptions.remove(addressToString(address));
        NodeManagementImpl nodeManagement
            = (NodeManagementImpl) getDevice().getNodeManagement();
        nodeManagement.sendSubscriptionRelease(getAddress(), address);
    }

    @Override
    public void releaseSubscriber(FeatureAddressType subscriberAddress) {
        removeSubscriber(subscriberAddress);
        NodeManagementImpl nodeManagement
            = (NodeManagementImpl) getDevice().getNodeManagement();
        nodeManagement.sendSubscriptionRelease(subscriberAddress, getAddress());
    }

    @Override
    public void releaseBoundClient(FeatureAddressType clientAddress) {
        if (role.equals(RoleType.CLIENT)) {
            throw new UnsupportedOperationException();
        }
        removeBinding(clientAddress);
        NodeManagementImpl nodeManagement
            = (NodeManagementImpl) getDevice().getNodeManagement();
        nodeManagement.sendBindingRelease(clientAddress, getAddress());
    }

    @Override
    public void releaseBoundServer(FeatureAddressType serverAddress) {
        if (role.equals(RoleType.SERVER)) {
            throw new UnsupportedOperationException();
        }
        NodeManagementImpl nodeManagement
            = (NodeManagementImpl) getDevice().getNodeManagement();
        nodeManagement.sendBindingRelease(getAddress(), serverAddress);
    }

    @Override
    public void notifySubscribers(FunctionEnumType function, FilterType filter) {
        CmdType cmd;
        try {
            cmd = functions.get(function.value()).read(filter, getAddress());
        }
        catch (SpineException e) {
            LOGGER.error("Failed to notify subscribers: {}", e.getMessage());
            return;
        }
        if (filter != null) {
            cmd.setFunction(function.value());
            FilterType notifyFilter = new FilterType();
            CmdControlType partialCmdControl = new CmdControlType();
            partialCmdControl.setPartial(new ElementTagType());
            notifyFilter.setCmdControl(partialCmdControl);
            cmd.getFilter().add(notifyFilter);
        }
        notifySubscribers(cmd);
    }

    @Override
    public void notifySubscribers(CmdType cmd) {
        List<FeatureAddressType> threadSafeCopy;
        synchronized (subscribers) {
            threadSafeCopy = new ArrayList<>(subscribers);
        }
        for (FeatureAddressType subscriberAddress : threadSafeCopy) {
            fireAndForget(subscriberAddress, cmd, NOTIFY, null);
        }
    }

    @Override
    public FeatureAddressType getAddress() {
        FeatureAddressType result = ((FeatureAddressType) address.clone());
        Device device = getDevice();
        if (device != null) {
            result.setDevice(device.getAddress().getDevice());
        }
        return result;
    }

    @Override
    public FeatureTypeEnumType getType() {
        return featureType;
    }

    void setType(FeatureTypeEnumType featureType) {
        this.featureType = featureType;
        featureWrapper = FeatureInformationService.getInstance().createFeatureWrapper(this);
    }

    void removeBinding(FeatureAddressType clientAddress) {
        bindings.removeIf(binding -> binding.equals(addressToString(clientAddress)));
    }

    public void removeSubscriber(FeatureAddressType subscriberAddress) {
        subscribers.removeIf(
            subscriber -> subscriber
                .getDevice()
                .equals(subscriberAddress.getDevice()) && subscriber.getFeature()
                .equals(subscriberAddress.getFeature()) && subscriber.getEntity()
                .equals(subscriberAddress.getEntity()
                ));
    }

    public CompletableFuture<RequestResult> requestSubscription(
        FeatureAddressType address,
        FeatureTypeEnumType featureType,
        SpineSubscription subscription,
        String communicationAddress
    ) {
        CmdType cmd
            = ((NodeManagementImpl) getDevice().getNodeManagement())
            .getSubscriptionRequest(
                getAddress(),
                address,
                featureType
        );
        CompletableFuture<RequestResult> future = request(
            ((NodeManagementImpl) getDevice().getNodeManagement())
                .getNodeManagementAddress(null),
            cmd,
            CALL,
            communicationAddress
        );
        future.thenAccept(result -> {
            address.setDevice(result.getSenderAddress().getDevice());
            subscriptions.put(
                addressToString(address),
                new SubscriptionWrapper(
                    subscription,
                    address,
                    featureType,
                    future
                )
            );
        });

        return future;
    }

    public CompletableFuture<RequestResult> requestCall(
        FeatureAddressType address,
        CmdType cmd
    ) {
        return request(address, cmd, CALL, null);
    }

    public Collection<FunctionPropertyType> getFunctionPropertyList() {
        List<FunctionPropertyType> functionProperties = new ArrayList<>();
        for (FeatureFunction featureFunction : functions.values()) {
            if (featureFunction.isReadable()
                || featureFunction.isWritable()
                || featureFunction.isCallable()) {
                functionProperties.add(featureFunction.getFunctionProperty());
            }
        }
        return functionProperties;
    }

    public boolean isCompleted() {
        return role != null && featureType != null;
    }

    void setParent(EntityImpl parent, long id) {
        address.getEntity().addAll(parent.getAddress().getEntity());
        address.setFeature(id);
        this.parent = parent;
    }

    void setFeaturePermission(FeaturePermission featurePermission) {
        this.featurePermission = featurePermission;
    }

    void completeAddress(EntityAddressType address) {
        this.address.getEntity().addAll(0, address.getEntity());
    }

    String getGroup() {
        return group;
    }

    void setGroup(String group) {
        this.group = group;
    }

    boolean hasLastStateChange() {
        return lastStateChange != null;
    }

    NetworkManagementStateChangeType getLastStateChange() {
        return lastStateChange;
    }

    void setLastStateChange(NetworkManagementStateChangeType lastStateChange) {
        this.lastStateChange = lastStateChange;
    }

    String getMinimumTrustLevel() {
        return minimumTrustLevel;
    }

    void setMinimumTrustLevel(String minimumTrustLevel) {
        this.minimumTrustLevel = minimumTrustLevel;
    }

    private static void handleCommandOnNullFunction() throws SpineException {
        SpineAcknowledgment ack = new SpineAcknowledgment(
            Error.COMMAND_NOT_SUPPORTED,
            "Function does not exist"
        );
        throw ack.getThrowable();
    }

    public EntityImpl getParent() {
        return parent;
    }


    @SuppressWarnings("unchecked")
    @Override
    public <T extends FeatureFunction> T getOrAddFunction(Class<? extends T> functionType) {
        Optional<FeatureFunction> found = functions.values().stream().filter(ff -> functionType.isAssignableFrom(ff.getClass())).findAny();
        if (found.isPresent()) return (T) found.get();
        T created;
        try {
            created = functionType.getDeclaredConstructor().newInstance();
        } catch (ReflectiveOperationException e){
            throw new IllegalArgumentException("No accessible nullary constructor on feature function type", e);
        }
        addFunction(created);
        return created;
    }

    @Override
    @SuppressWarnings("unchecked")
    public <T extends FeatureFunction> Optional<T> getFunction(Class<? extends T> functionType) {
        return (Optional<T>) functions.values().stream().filter(functionType::isInstance).findAny();
    }

    @Override
    public FeatureFunction getFunction(FunctionEnumType functionEnumType) {
        return getFunction(functionEnumType.value());
    }

    @Override
    public FeatureFunction getFunction(String function) {
        return functions.get(function);
    }

    @Override
    public FeatureWrapper getFeatureWrapper() {
        return featureWrapper;
    }

    @SuppressWarnings("unchecked")
    @Override
    public <T extends FeatureWrapper> T getFeatureWrapper(Class<T> wrapperClass) {
        if (wrapperClass.isInstance(featureWrapper)) return (T) featureWrapper;
        return null;
    }

    @Override
    public void shutdown() {
        for (FeatureFunction function : functions.values()) {
            function.close();
        }
    }

    @Override
    public String toString() {
        return "FeatureImpl{" +
                "functions=" + functions +
                ", address=" + address +
                ", subscribers=" + subscribers +
                ", featureType=" + featureType +
                ", role=" + role +
                ", label='" + label + '\'' +
                ", description='" + description + '\'' +
                ", group='" + group + '\'' +
                ", minimumTrustLevel='" + minimumTrustLevel + '\'' +
                ", featurePermission=" + featurePermission +
                ", bindings=" + bindings +
                '}';
    }
}
