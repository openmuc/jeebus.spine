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

import org.openmuc.jeebus.ship.api.DisconnectReason;
import org.openmuc.jeebus.ship.api.ShipConnectionInterface;
import org.openmuc.jeebus.spine.api.*;
import org.openmuc.jeebus.spine.spi.*;
import org.openmuc.jeebus.spine.spi.function.FeatureFunction;
import org.openmuc.jeebus.spine.utils.NamedThreadFactory;
import org.openmuc.jeebus.spine.xsd.v1.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import static org.openmuc.jeebus.spine.xsd.v1.FunctionEnumType.*;

class NodeManagementImpl extends FeatureImpl implements NodeManagement {
    @SuppressWarnings("LoggerInitializedWithForeignClass")
    private static final Logger LOGGER
        = LoggerFactory.getLogger(NodeManagement.class);
    public static final FeaturePermission FEATURE_PERMISSION = new FeaturePermission() {
        @Override
        public boolean bindingAllowed(NodeManagementBindingRequestCallType.BindingRequest bindingRequest) {
            return false;
        }

        @Override
        public boolean subscriptionAllowed(
                NodeManagementSubscriptionRequestCallType.SubscriptionRequest subscriptionRequest
        ) {
            return true;
        }
    };

    private NetworkManagementFeatureSetType mode;

    private final Set<DeviceListener> deviceListeners = new HashSet<>();
    private final Set<UseCaseDiscoveryWrapper> useCaseListeners = new HashSet<>();

    private final List<EntityImpl> lastChangedEntities = new ArrayList<>();
    private final List<FeatureImpl> lastChangedFeatures = new ArrayList<>();

    private final NamedThreadFactory discoveryThreadFactory
        = new NamedThreadFactory("SpineDiscoveryRunner_");
    private final ConcurrentMap<String, Thread> discoveryMap = new ConcurrentHashMap<>();
    private final DiscoveryLogger discoveryLogger = new DiscoveryLogger();

    private NodeManagementImpl() {
        setRole(RoleType.SPECIAL);
        setType(FeatureTypeEnumType.NODE_MANAGEMENT);
        setFeaturePermission(FEATURE_PERMISSION);
        addFunction(new DetailedDiscoveryDataFunction());
        SubscriptionDataFunction subscriptionDataFunction
            = new SubscriptionDataFunction();
        addFunction(subscriptionDataFunction);
        addFunction(new SubscriptionRequestFunction(subscriptionDataFunction));
        addFunction(new SubscriptionDeleteFunction(subscriptionDataFunction));
        BindingDataFunction bindingDataFunction = new BindingDataFunction();
        addFunction(bindingDataFunction);
        addFunction(new BindingRequestFunction(bindingDataFunction));
        addFunction(new BindingDeleteFunction(bindingDataFunction));
        addFunction(new UseCaseDataFunction());
    }

    public static void addNodeManagement(Device device) {
        EntityBuilder eb = Entity
            .getBuilder()
            .setType(EntityTypeEnumType.DEVICE_INFORMATION);
        eb.addFeature(new NodeManagementImpl());
        device.addEntity(eb.build());
    }

    void sendSubscriptionRelease(
        FeatureAddressType clientAddress,
        FeatureAddressType serverAddress
    ) {
        CmdType subscriptionDeleteCmd = new CmdType();
        NodeManagementSubscriptionDeleteCallType deleteCall
            = new NodeManagementSubscriptionDeleteCallType();
        NodeManagementSubscriptionDeleteCallType.SubscriptionDelete subscription
            = new NodeManagementSubscriptionDeleteCallType.SubscriptionDelete();
        subscription.setClientAddress(clientAddress);
        subscription.setServerAddress(serverAddress);
        deleteCall.setSubscriptionDelete(subscription);
        subscriptionDeleteCmd.setNodeManagementSubscriptionDeleteCall(deleteCall);
        if (clientAddress.getDevice().equals(getDevice().getAddress().getDevice())) {
            if (!serverAddress
                .getDevice()
                .equals(getDevice().getAddress().getDevice())) {
                requestCall(
                    getNodeManagementAddress(serverAddress.getDevice()),
                    subscriptionDeleteCmd
                );
            }
            // no send necessary if subscription was device internal
        }
        else {
            requestCall(
                getNodeManagementAddress(clientAddress.getDevice()),
                subscriptionDeleteCmd
            );
        }
        try {
            ((SubscriptionDataFunction) getFunction(
                NODE_MANAGEMENT_SUBSCRIPTION_DATA)).removeSubscriptionEntry(
                subscription);
        }
        catch (SpineException e) {
            LOGGER.error("There was an error trying to release a subscription:", e);
        }
    }

    public FeatureAddressType getNodeManagementAddress(String device) {
        FeatureAddressType address = new FeatureAddressType();
        if (device != null) {
            address.setDevice(device);
        }
        address.getEntity().add(0L);
        address.setFeature(0L);
        return address;
    }

    void sendBindingRelease(
        FeatureAddressType clientAddress,
        FeatureAddressType serverAddress
    ) {
        CmdType bindingDeleteCmd = new CmdType();
        NodeManagementBindingDeleteCallType bindingDeleteCall
            = new NodeManagementBindingDeleteCallType();
        NodeManagementBindingDeleteCallType.BindingDelete bindingDelete
            = new NodeManagementBindingDeleteCallType.BindingDelete();
        bindingDelete.setClientAddress(clientAddress);
        bindingDelete.setServerAddress(serverAddress);
        bindingDeleteCall.setBindingDelete(bindingDelete);
        bindingDeleteCmd.setNodeManagementBindingDeleteCall(bindingDeleteCall);
        if (clientAddress.getDevice().equals(getDevice().getAddress().getDevice())) {
            if (!serverAddress
                .getDevice()
                .equals(getDevice().getAddress().getDevice())) {
                requestCall(
                    getNodeManagementAddress(serverAddress.getDevice()),
                    bindingDeleteCmd
                );
            }
            // no send necessary if binding was device internal
        }
        else {
            requestCall(
                getNodeManagementAddress(clientAddress.getDevice()),
                bindingDeleteCmd
            );
        }
        try {
            ((BindingDataFunction) getFunction(NODE_MANAGEMENT_BINDING_DATA)).deleteBinding(
                bindingDelete);
        }
        catch (SpineException e) {
            LOGGER.error("There was an error trying to release a binding:", e);
        }
    }

    void addUseCase(UseCase useCase) {
        ((UseCaseDataFunction) getFunction(NODE_MANAGEMENT_USE_CASE_DATA)).addUseCase(
            useCase);
    }

    public void notifyDeviceAddressListeners(String communicationAddress) {
        for (DeviceListener listener : deviceListeners) {
            listener.deviceDetected(communicationAddress);
        }
    }

    void featureAdded(FeatureAddressType address) {
        resetLastStateChanges();
        DetailedDiscoveryDataFunction ddFunction
            = (DetailedDiscoveryDataFunction) getFunction(
            NODE_MANAGEMENT_DETAILED_DISCOVERY_DATA);
        FeatureImpl feature;
        try {
            feature = (FeatureImpl) getDevice().getFeature(address);
        }
        catch (SpineException e) {
            throw new IllegalStateException("Added feature could not be found", e);
        }
        feature.setLastStateChange(NetworkManagementStateChangeType.ADDED);
        feature
            .getParent()
            .setLastStateChange(NetworkManagementStateChangeType.MODIFIED);
        lastChangedFeatures.add(feature);
        lastChangedEntities.add(feature.getParent());

        FilterType filter = new FilterType();
        filter.getNodeManagementDetailedDiscoveryDataSelectors()
            .add(getFeatureAddressSelector(address));
        filter.setCmdControl(getPartialCmdControl());
        CmdType cmd = ddFunction.read(filter, getAddress());
        filter = new FilterType();
        filter.setCmdControl(getPartialCmdControl());
        filter.getNodeManagementDetailedDiscoveryDataSelectors()
            .add(getEntityAddressSelector(feature.getParent().getAddress()));
        for (NodeManagementDetailedDiscoveryEntityInformationType entityInfo : ddFunction
            .read(filter, getAddress())
            .getNodeManagementDetailedDiscoveryData()
            .getEntityInformation()) {
            if (entityInfo
                .getDescription()
                .getLastStateChange()
                .equals(NetworkManagementStateChangeType.MODIFIED)) {
                cmd
                    .getNodeManagementDetailedDiscoveryData()
                    .getEntityInformation()
                    .add(entityInfo);
                break;
            }
        }
        cmd.setFunction(NODE_MANAGEMENT_DETAILED_DISCOVERY_DATA.value());

        notifySubscribers(cmd);
    }

    private void resetLastStateChanges() {
        for (EntityImpl entity : lastChangedEntities) {
            entity.setLastStateChange(null);
        }
        lastChangedEntities.clear();
        for (FeatureImpl feature : lastChangedFeatures) {
            feature.setLastStateChange(null);
        }
        lastChangedFeatures.clear();
    }

    private NodeManagementDetailedDiscoveryDataSelectorsType getFeatureAddressSelector(
        FeatureAddressType address
    ) {
        NodeManagementDetailedDiscoveryDataSelectorsType selector
            = new NodeManagementDetailedDiscoveryDataSelectorsType();
        NodeManagementDetailedDiscoveryDataSelectorsType.FeatureInformation info
            = new NodeManagementDetailedDiscoveryDataSelectorsType.FeatureInformation();
        info.setFeatureAddress(address);
        selector.setFeatureInformation(info);
        return selector;
    }

    private CmdControlType getPartialCmdControl() {
        CmdControlType cmdControl = new CmdControlType();
        cmdControl.setPartial(new ElementTagType());
        return cmdControl;
    }

    private NodeManagementDetailedDiscoveryDataSelectorsType getEntityAddressSelector(
        EntityAddressType address
    ) {
        NodeManagementDetailedDiscoveryDataSelectorsType selector
            = new NodeManagementDetailedDiscoveryDataSelectorsType();
        NodeManagementDetailedDiscoveryDataSelectorsType.EntityInformation info
            = new NodeManagementDetailedDiscoveryDataSelectorsType.EntityInformation();
        info.setEntityAddress(address);
        selector.setEntityInformation(info);
        return selector;
    }

    void entityAdded(EntityImpl entity) {
        entity.setLastStateChange(NetworkManagementStateChangeType.ADDED);
        FilterType filter = new FilterType();
        NodeManagementDetailedDiscoveryDataSelectorsType entitySelector
            = new NodeManagementDetailedDiscoveryDataSelectorsType();
        NodeManagementDetailedDiscoveryDataSelectorsType.EntityInformation
            entityInformation
            = new NodeManagementDetailedDiscoveryDataSelectorsType.EntityInformation();
        entityInformation.setEntityAddress(entity.getAddress());
        entitySelector.setEntityInformation(entityInformation);
        filter.getNodeManagementDetailedDiscoveryDataSelectors()
            .add(entitySelector);
        notifySubscribers(NODE_MANAGEMENT_DETAILED_DISCOVERY_DATA, filter);
        entity.setLastStateChange(null);
    }

    void entityRemoved(EntityAddressType address) {
        CmdType cmd = new CmdType();
        cmd.setFunction(NODE_MANAGEMENT_DETAILED_DISCOVERY_DATA.value());
        FilterType filter = new FilterType();
        filter.setCmdControl(getPartialCmdControl());
        cmd.getFilter().add(filter);
        NodeManagementDetailedDiscoveryDataType nodeManagementDetailedDiscoveryData
            = new NodeManagementDetailedDiscoveryDataType();
        nodeManagementDetailedDiscoveryData.getEntityInformation()
            .add(getEntityInformation(
                address,
                NetworkManagementStateChangeType.REMOVED
            ));
        cmd.setNodeManagementDetailedDiscoveryData(
            nodeManagementDetailedDiscoveryData);
        notifySubscribers(cmd);
    }

    private NodeManagementDetailedDiscoveryEntityInformationType getEntityInformation(
        EntityAddressType address,
        NetworkManagementStateChangeType change
    ) {
        NodeManagementDetailedDiscoveryEntityInformationType entityInformation
            = new NodeManagementDetailedDiscoveryEntityInformationType();
        NodeManagementDetailedDiscoveryEntityInformationType.Description description
            = new NodeManagementDetailedDiscoveryEntityInformationType.Description();
        description.setLastStateChange(change);
        description.setEntityAddress(address);
        entityInformation.setDescription(description);
        return entityInformation;
    }

    void featureRemoved(FeatureAddressType address) {
        releaseSubscriptions(address);
        releaseBindings(address);

        CmdType cmd = getFeatureChangeCmd(
            address,
            NetworkManagementStateChangeType.REMOVED
        );
        notifySubscribers(cmd);
    }

    private void releaseSubscriptions(FeatureAddressType address) {
        SubscriptionDataFunction subscriptionDataFunction
            = (SubscriptionDataFunction) getFunction(
            NODE_MANAGEMENT_SUBSCRIPTION_DATA);
        for (Map.Entry<String, List<NodeManagementSubscriptionDeleteCallType.SubscriptionDelete>> releasedSubscriptions : subscriptionDataFunction
            .deleteSubscriptions(
                address)
            .entrySet()) {
            CmdType subscriptionDeleteCmd = new CmdType();
            NodeManagementSubscriptionDeleteCallType deleteCall
                = new NodeManagementSubscriptionDeleteCallType();
            for (NodeManagementSubscriptionDeleteCallType.SubscriptionDelete subscriptionDelete : releasedSubscriptions.getValue()) {
                deleteCall.setSubscriptionDelete(subscriptionDelete);
                subscriptionDeleteCmd.setNodeManagementSubscriptionDeleteCall(
                    deleteCall);
                requestCall(
                    getNodeManagementAddress(releasedSubscriptions.getKey()),
                    subscriptionDeleteCmd
                );
            }
        }
    }

    private void releaseBindings(FeatureAddressType address) {
        BindingDataFunction bindingDataFunction
            = (BindingDataFunction) getFunction(
            NODE_MANAGEMENT_BINDING_DATA);
        for (Map.Entry<String, List<NodeManagementBindingDeleteCallType.BindingDelete>> releasedBindings : bindingDataFunction
            .deleteBindings(
                address)
            .entrySet()) {
            CmdType bindingDeleteCmd = new CmdType();
            NodeManagementBindingDeleteCallType bindingDeleteCall
                = new NodeManagementBindingDeleteCallType();
            for (NodeManagementBindingDeleteCallType.BindingDelete bindingDelete : releasedBindings.getValue()) {
                bindingDeleteCall.setBindingDelete(bindingDelete);
                bindingDeleteCmd.setNodeManagementBindingDeleteCall(bindingDeleteCall);
                requestCall(
                    getNodeManagementAddress(releasedBindings.getKey()),
                    bindingDeleteCmd
                );
            }
        }
    }

    private CmdType getFeatureChangeCmd(
        FeatureAddressType address,
        NetworkManagementStateChangeType change
    ) {
        CmdType cmd = new CmdType();
        cmd.setFunction(NODE_MANAGEMENT_DETAILED_DISCOVERY_DATA.value());
        FilterType filter = new FilterType();
        filter.setCmdControl(getPartialCmdControl());
        cmd.getFilter().add(filter);
        NodeManagementDetailedDiscoveryDataType
            nodeManagementDetailedDiscoveryDataType
            = new NodeManagementDetailedDiscoveryDataType();
        EntityAddressType entityAddress = new EntityAddressType();
        entityAddress.getEntity().addAll(address.getEntity());
        nodeManagementDetailedDiscoveryDataType.getEntityInformation()
            .add(getEntityInformation(
                entityAddress,
                NetworkManagementStateChangeType.MODIFIED
            ));
        address.setDevice(null);
        nodeManagementDetailedDiscoveryDataType
            .getFeatureInformation()
            .add(getFeatureInformation(address, change));
        cmd.setNodeManagementDetailedDiscoveryData(
            nodeManagementDetailedDiscoveryDataType);
        return cmd;
    }

    private NodeManagementDetailedDiscoveryFeatureInformationType getFeatureInformation(
        FeatureAddressType address,
        NetworkManagementStateChangeType change
    ) {
        NodeManagementDetailedDiscoveryFeatureInformationType featureInformation
            = new NodeManagementDetailedDiscoveryFeatureInformationType();
        NodeManagementDetailedDiscoveryFeatureInformationType.Description description
            = new NodeManagementDetailedDiscoveryFeatureInformationType.Description();
        description.setLastStateChange(change);
        description.setFeatureAddress(address);
        featureInformation.setDescription(description);
        return featureInformation;
    }

    void featureChanged(FeatureAddressType address, String functionName) {
        FeatureImpl feature;
        try {
            feature = (FeatureImpl) getDevice().getFeature(address);
        }
        catch (SpineException e) {
            throw new IllegalStateException(
                "Changed feature could not be found!",
                e
            );
        }
        FunctionPropertyType functionProp = null;
        for (FunctionPropertyType functionProperty : feature.getFunctionPropertyList()) {
            if (functionProperty.getFunction().equals(functionName)) {
                functionProp = functionProperty;
                break;
            }
        }
        if (functionProp != null) {
            CmdType cmd = getFeatureChangeCmd(
                address,
                NetworkManagementStateChangeType.MODIFIED
            );
            cmd.getNodeManagementDetailedDiscoveryData()
                .getFeatureInformation()
                .get(0)
                .getDescription()
                .getSupportedFunction()
                .add(functionProp);
            notifySubscribers(cmd);
        }
    }

    public void registerSubscriptionRequest(
        FeatureAddressType clientAddress,
        FeatureAddressType serverAddress,
        FeatureTypeEnumType serverFeatureType
    ) {
        NodeManagementSubscriptionRequestCallType.SubscriptionRequest
            subscriptionRequest = getSubscriptionRequest(
            clientAddress,
            serverAddress,
            serverFeatureType
        )
            .getNodeManagementSubscriptionRequestCall()
            .getSubscriptionRequest();

        ((SubscriptionDataFunction)
            getFunction(NODE_MANAGEMENT_SUBSCRIPTION_DATA))
            .addSubscriptionEntry(subscriptionRequest);
    }

    public CmdType getSubscriptionRequest(
        FeatureAddressType clientAddress,
        FeatureAddressType serverAddress,
        FeatureTypeEnumType serverFeatureType
    ) {
        NodeManagementSubscriptionRequestCallType subscriptionRequestCall
            = new NodeManagementSubscriptionRequestCallType();
        NodeManagementSubscriptionRequestCallType.SubscriptionRequest
            subscriptionRequest
            = new NodeManagementSubscriptionRequestCallType.SubscriptionRequest();
        subscriptionRequest.setClientAddress(clientAddress);
        subscriptionRequest.setServerAddress(serverAddress);
        subscriptionRequest.setServerFeatureType(serverFeatureType.value());
        subscriptionRequestCall.setSubscriptionRequest(subscriptionRequest);

        CmdType cmd = new CmdType();
        cmd.setNodeManagementSubscriptionRequestCall(subscriptionRequestCall);

        return cmd;
    }

    public CmdType getBindingRequest(
        FeatureAddressType clientAddress, FeatureAddressType serverAddress,
        FeatureTypeEnumType serverFeatureType
    ) {
        NodeManagementBindingRequestCallType bindingRequestCall
            = new NodeManagementBindingRequestCallType();
        NodeManagementBindingRequestCallType.BindingRequest bindingRequest
            = new NodeManagementBindingRequestCallType.BindingRequest();
        bindingRequest.setClientAddress(clientAddress);
        bindingRequest.setServerAddress(serverAddress);
        bindingRequest.setServerFeatureType(serverFeatureType.value());
        bindingRequestCall.setBindingRequest(bindingRequest);

        CmdType cmd = new CmdType();
        cmd.setNodeManagementBindingRequestCall(bindingRequestCall);

        ((BindingDataFunction) getFunction(NODE_MANAGEMENT_BINDING_DATA)).addBinding(
            bindingRequest);

        return cmd;
    }

    boolean forwardingAllowed(HeaderType header) {
        if (mode == null || mode.equals(NetworkManagementFeatureSetType.SIMPLE)) {
            return false;
        }
        DestinationListDataFunction function
            = (DestinationListDataFunction) getFunction(
            NODE_MANAGEMENT_DESTINATION_LIST_DATA);
        return function.isRegistered(
            header.getAddressSource().getDevice(),
            header.getAddressDestination().getDevice()
        );
    }

    void handleDestinationList(
        NodeManagementDetailedDiscoveryDataType detailedDiscoveryData,
        String intermediateDeviceAddress
    ) {
        if (detailedDiscoveryData != null
            && containsDestinationListDataFunction(detailedDiscoveryData)
        ) {
            subscribeDestinationListData(
                detailedDiscoveryData
                    .getDeviceInformation()
                    .getDescription()
                    .getDeviceAddress()
                    .getDevice(),
                notification -> parseDestinationList(
                    notification.getCmd().getNodeManagementDestinationListData(),
                    intermediateDeviceAddress
                ),
                true
            );
        }
    }

    private boolean containsDestinationListDataFunction(
        NodeManagementDetailedDiscoveryDataType detailedDiscoveryData
    ) {
        NodeManagementDetailedDiscoveryFeatureInformationType.Description
            nodeManagementDescription = getNodeManagementFeatureDescription(
            detailedDiscoveryData);
        if (nodeManagementDescription == null) {
            return false;
        }
        for (FunctionPropertyType functionProperty : nodeManagementDescription.getSupportedFunction()) {
            if (functionProperty.getFunction().equals(
                NODE_MANAGEMENT_DESTINATION_LIST_DATA.value())
                && functionProperty.getPossibleOperations().getRead() != null) {
                return true;
            }
        }
        return false;
    }

    private void parseDestinationList(
        NodeManagementDestinationListDataType destinationListData,
        String address
    ) {
        if (destinationListData != null) {
            for (NodeManagementDestinationDataType destinationData
                : destinationListData.getNodeManagementDestinationData()
            ) {
                if (destinationData.getDeviceDescription().getLastStateChange()
                    != null
                    && destinationData.getDeviceDescription()
                    .getLastStateChange()
                    .equals(NetworkManagementStateChangeType.REMOVED)) {
                    getDevice().getConnectionHandler().removeAddressMapping(address);
                }
                else if (destinationData.getDeviceDescription().getLastStateChange()
                    == null
                    || destinationData.getDeviceDescription()
                    .getLastStateChange()
                    .equals(NetworkManagementStateChangeType.ADDED)) {
                    getDevice().getConnectionHandler()
                        .addAddressMapping(
                            destinationData
                                .getDeviceDescription()
                                .getDeviceAddress()
                                .getDevice(),
                            address
                        );
                    getFullDeviceInformationRequest(
                        address,
                        destinationData
                            .getDeviceDescription()
                            .getDeviceAddress()
                            .getDevice()
                    );
                }
            }
        }
    }

    private NodeManagementDetailedDiscoveryFeatureInformationType.Description getNodeManagementFeatureDescription(
        NodeManagementDetailedDiscoveryDataType detailedDiscoveryData
    ) {
        for (NodeManagementDetailedDiscoveryFeatureInformationType featureInfo
            : detailedDiscoveryData.getFeatureInformation()
        ) {
            if (featureInfo
                .getDescription()
                .getFeatureType()
                .equals(FeatureTypeEnumType.NODE_MANAGEMENT.value())) {
                return featureInfo.getDescription();
            }
        }
        return null;
    }

    public CompletableFuture<RequestResult> getFullDeviceInformationRequest(
        String communicationAddress,
        String deviceAddress
    ) {
        LOGGER.debug(
            "{} Requesting device info",
            getDevice().getAddress().getDevice()
        );

        FeatureAddressType destinationAddress = getNodeManagementAddress(
            deviceAddress);

        CmdType cmd = new CmdType();
        cmd.setNodeManagementDetailedDiscoveryData(new NodeManagementDetailedDiscoveryDataType());

        CompletableFuture<RequestResult> future = requestRead(
            destinationAddress,
            cmd,
            communicationAddress
        );
        future = future.whenComplete((r, e) -> {
            if (r != null) {
                if (deviceAddress == null) {
                    String detectedDeviceAddress = r.getSenderAddress().getDevice();
                    LOGGER.debug(
                        "Detected SPINE device with address {} on communication address {}",
                        detectedDeviceAddress, communicationAddress
                    );
                    getDevice()
                        .getConnectionHandler()
                        .addAddressMapping(
                            detectedDeviceAddress,
                            communicationAddress
                        );
                }
                notifyDeviceDiscoveryListeners(r
                    .getCmd()
                    .getNodeManagementDetailedDiscoveryData());
            }
        });
        return future;
    }

    public void notifyDeviceDiscoveryListeners(
        NodeManagementDetailedDiscoveryDataType detailedDiscoveryData
    ) {
        for (DeviceListener listener : deviceListeners) {
            listener.deviceDiscovered(detailedDiscoveryData);
        }
    }

    public NetworkManagementFeatureSetType getCommunicationMode() {
        return mode;
    }

    void setCommunicationMode(NetworkManagementFeatureSetType mode) {
        this.mode = mode;
        if (!mode.equals(NetworkManagementFeatureSetType.SIMPLE)) {
            addFunction(new DestinationListDataFunction());
            addDeviceListener(new DeviceListener() {
                @Override
                public void deviceDetected(String communicationAddress) {
                }

                @Override
                public void deviceDiscovered(NodeManagementDetailedDiscoveryDataType deviceInfo) {
                    DestinationListDataFunction function
                        = (DestinationListDataFunction) getFunction(
                        NODE_MANAGEMENT_DESTINATION_LIST_DATA);
                    function.addDevice(deviceInfo.getDeviceInformation());
                }
            });
        }
    }

    @Override
    public void addDeviceListener(DeviceListener deviceListener) {
        deviceListeners.add(deviceListener);
    }

    @Override
    public void addUseCaseListener(
        UseCaseListener listener,
        String useCase,
        String actor,
        Map<Long, PresenceIndication> scenarioRequirements,
        Set<CommunicationPartnerFeatureRequirement> communicationPartnerFeatureRequirements
    ) {
        UseCaseDiscoveryWrapper wrapper = new UseCaseDiscoveryWrapper(
            listener,
            useCase,
            actor,
            scenarioRequirements,
                communicationPartnerFeatureRequirements
        );
        useCaseListeners.add(wrapper);
    }

    @Override
    public CompletableFuture<RequestResult> getFullDeviceInformationRequest(String communicationAddress) {
        return getFullDeviceInformationRequest(communicationAddress, null);
    }

    @Override
    public CompletableFuture<RequestResult> getFullUseCaseInformationRequest(
        String communicationAddress,
        String deviceAddress
    ) {
        LOGGER.debug(
            "Requesting supported Use Cases of device {} at address {}",
            deviceAddress,
            communicationAddress
        );

        FeatureAddressType destinationAddress = getNodeManagementAddress(
            deviceAddress);

        CmdType cmd = new CmdType();
        cmd.setNodeManagementUseCaseData(new NodeManagementUseCaseDataType());

        return requestRead(destinationAddress, cmd, communicationAddress);
    }

    @Override
    public CompletableFuture<RequestResult> getNodeManagementSubscriptionRequest(
        String communicationAddress,
        String deviceAddress,
        SpineSubscription listener
    ) {
        return requestSubscription(
            getNodeManagementAddress(deviceAddress),
            FeatureTypeEnumType.NODE_MANAGEMENT,
            listener,
            communicationAddress
        );
    }

    @Override
    public CompletableFuture<RequestResult> requestSubscriptionData(String deviceId) {
        CmdType readCmd = new CmdType();
        readCmd.setNodeManagementSubscriptionData(new NodeManagementSubscriptionDataType());
        return requestRead(getNodeManagementAddress(deviceId), readCmd);
    }

    @Override
    public CompletableFuture<RequestResult> requestBindingData(String deviceId) {
        CmdType readCmd = new CmdType();
        readCmd.setNodeManagementBindingData(new NodeManagementBindingDataType());
        return requestRead(getNodeManagementAddress(deviceId), readCmd);
    }

    @Override
    public CompletableFuture<RequestResult> requestDestinationListData(String deviceId) {
        CmdType readCmd = new CmdType();
        readCmd.setNodeManagementDestinationListData(new NodeManagementDestinationListDataType());
        return requestRead(getNodeManagementAddress(deviceId), readCmd);
    }

    @Override
    public CompletableFuture<RequestResult> subscribeDestinationListData(
        String deviceId,
        SpineSubscription subscription, boolean notifyFullRead
    ) {
        CompletableFuture<RequestResult> future = requestSubscription(
            getNodeManagementAddress(deviceId),
            FeatureTypeEnumType.NODE_MANAGEMENT, subscription
        );
        if (notifyFullRead) {
            return future.whenComplete((ack, e) -> {
                if (ack != null) {
                    requestDestinationListData(deviceId).whenComplete((result, ex) -> {
                        if (result != null) {
                            subscription.messageReceived(result);
                        }
                    });
                }
            });
        }
        return future;
    }

    @Override
    public void mapAddressToCommunication(
        String communicationAddress,
        Integer communicationInterface
    ) {
        DestinationListDataFunction function
            = (DestinationListDataFunction) getFunction(
            NODE_MANAGEMENT_DESTINATION_LIST_DATA);
        function.mapAddressToCommunication(
            communicationAddress,
            communicationInterface
        );
    }

    @Override
    public Integer createInterfaceGroup() {
        DestinationListDataFunction function
            = (DestinationListDataFunction) getFunction(
            NODE_MANAGEMENT_DESTINATION_LIST_DATA);
        return function.createInterfaceGroup();
    }

    @Override
    public void removeAddressMapping(String communicationAddress) {
        DestinationListDataFunction function
            = (DestinationListDataFunction) getFunction(
            NODE_MANAGEMENT_DESTINATION_LIST_DATA);
        function.deleteAddressMapping(communicationAddress);
    }

    @Override
    public void notifyDisconnect(
        DisconnectReason disconnectReason,
        ShipConnectionInterface shipConnectionInterface
    ) {
        // TODO: stop use case execution on disconnected remote devices
    }

    @Override
    public void startDiscovery(String communicationAddress) {
        discoveryMap.compute(communicationAddress, (addr, existing) -> {
            if (existing != null) {
                LOGGER.debug(
                    "NodeManagement.startDiscovery was called for {} "
                        + "but a discovery thread is already running: {}",
                    addr,
                    existing.getName()
                );
                return existing;
            } else {
                Discovery discovery = new Discovery(communicationAddress, this);

                Thread thread = discoveryThreadFactory.newThread(discovery);
                thread.start();
                return thread;
            }
        });
    }

    Set<UseCaseDiscoveryWrapper> getCurrentUseCaseListeners() {
        return useCaseListeners;
    }

    @Override
    public void updateFunction(FeatureFunction newFunction) {

    }

    @Override
    public Feature getFeature() {
        return this;
    }

    public void setDiscoveryLogging(boolean enabled) {
        this.discoveryLogger.setEnabled(enabled);
    }

    public void setDiscoveryLogPath(File path) {
        discoveryLogger.setLogPath(path);
    }

    public DiscoveryLogger getDiscoveryLogger() {
        return discoveryLogger;
    }

    public static class MetaInformation implements KnownFeatureInformation {
        @Override
        public FeatureTypeEnumType getFeatureType() {
            return FeatureTypeEnumType.NODE_MANAGEMENT;
        }

        @Override
        public FeatureWrapper create(Feature feature) {
            if (! (feature instanceof NodeManagement))
                throw new IllegalArgumentException();
            return ((NodeManagement) feature);
        }

        @Override
        public FeaturePermission defaultFeaturePermission() {
            return FEATURE_PERMISSION;
        }
    }
}
