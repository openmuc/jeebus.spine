/********************************************************************************
 * Copyright (c) 2026 Fraunhofer ISE
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 ********************************************************************************/

package org.openmuc.jeebus.spine.api;

import org.awaitility.Awaitility;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openmuc.jeebus.spine.spi.AssertingDeviceListener;
import org.openmuc.jeebus.spine.spi.function.FeatureFunction;
import org.openmuc.jeebus.spine.xsd.v1.*;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

import static org.openmuc.jeebus.spine.TestUtilities.*;

class NodeManagementTest {

    private static final String DEVICE_DESCRIPTION = "JUnit Test Device";
    private static final String DEVICE_LABEL = "Test Device";
    private static final String ENTITY_DESCRIPTION = "JUnit Test Entity";
    private static final String ENTITY_LABEL = "Test Entity";
    private static final String FEATURE_DESCRIPTION = "JUnit Test Feature";
    private static final String FEATURE_LABEL = "Test Feature";
    private static final String FEATURE_GROUP = "#1";
    private static boolean subscriptionCalled = false;

    @BeforeEach
    void reset() {
        ASSERTING_FEATURE_FUNCTION.reset();
    }

    @Test
    void testAddDeviceListener() {
        AssertingDeviceListener deviceListener = new AssertingDeviceListener();
        Device remoteDevice = getGenericDeviceBuilder(
            REMOTE_COMM,
            REMOTE_DEVICE_ADDRESS
        ).build();
        Device device = getGenericDeviceBuilder(
            LOCAL_COMM,
            LOCAL_DEVICE_ADDRESS
        ).build();
        device.getNodeManagement().addDeviceListener(deviceListener);
        deviceListener.assertDeviceDetected(false);
        deviceListener.assertDeviceDiscovered(false);

        device.deviceDetected(REMOTE_COMM_ADDRESS);
        deviceListener.assertDeviceDetected(true);
        deviceListener.assertDeviceDiscovered(false);

        device
            .getNodeManagement()
            .getFullDeviceInformationRequest(REMOTE_COMM_ADDRESS);
        deviceListener.assertDeviceDiscovered(true);

        // automatic discovery
        deviceListener = new AssertingDeviceListener();
        deviceListener.assertDeviceDetected(false);
        deviceListener.assertDeviceDiscovered(false);
        device = getGenericDeviceBuilder(LOCAL_COMM, LOCAL_DEVICE_ADDRESS)
            .withDiscoverDevices(true)
            .addDeviceListener(deviceListener)
            .build();
        deviceListener.assertDeviceDetected(true);
        deviceListener.assertDeviceDiscovered(true);
    }

    @Test
    void testGetFullDeviceInformationRequest() throws ExecutionException,
        InterruptedException {
        Device server = getGenericDeviceBuilder(REMOTE_COMM, REMOTE_DEVICE_ADDRESS)
            .withDescription(DEVICE_DESCRIPTION)
            .withLabel(DEVICE_LABEL)
            .addEntity()
                .setType(EntityTypeEnumType.GENERIC)
                .setDescription(ENTITY_DESCRIPTION)
                .setLabel(ENTITY_LABEL)
                .addFeature()
                    .setType(FeatureTypeEnumType.GENERIC)
                    .setRole(RoleType.SERVER)
                    .setFeaturePermission(ALLOWING_FEATURE_PERMISSION)
                    .setDescription(FEATURE_DESCRIPTION)
                    .setLabel(FEATURE_LABEL)
                    .setFeatureGroup(FEATURE_GROUP)
                    .addFunction(ASSERTING_FEATURE_FUNCTION)
                    .apply()
                .applyToDevice()
            .build();
        Device client = getGenericDeviceBuilder(
            LOCAL_COMM,
            LOCAL_DEVICE_ADDRESS
        ).build();
        NodeManagementDetailedDiscoveryDataType detailedDiscoveryData = client
            .getNodeManagement()
            .getFullDeviceInformationRequest(REMOTE_COMM_ADDRESS)
            .get()
            .getCmd()
            .getNodeManagementDetailedDiscoveryData();
        assertDeviceInformationCorrect(detailedDiscoveryData.getDeviceInformation());
        assertEntityInformationCorrect(detailedDiscoveryData.getEntityInformation());
        assertFeatureInformationCorrect(detailedDiscoveryData.getFeatureInformation());
    }

    private void assertDeviceInformationCorrect(
        NodeManagementDetailedDiscoveryDeviceInformationType deviceInformation
    ) {
        Assertions.assertEquals(
            DEVICE_DESCRIPTION,
            deviceInformation.getDescription().getDescription()
        );
        Assertions.assertEquals(
            DEVICE_LABEL,
            deviceInformation.getDescription().getLabel()
        );
        Assertions.assertEquals(
            REMOTE_DEVICE_ADDRESS,
            deviceInformation.getDescription().getDeviceAddress().getDevice()
        );
        Assertions.assertEquals(
            DeviceTypeEnumType.GENERIC.value(),
            deviceInformation.getDescription().getDeviceType()
        );
    }

    private void assertEntityInformationCorrect(
        List<NodeManagementDetailedDiscoveryEntityInformationType> entityInformationList
    ) {
        Assertions.assertEquals(2, entityInformationList.size());

        NodeManagementDetailedDiscoveryEntityInformationType
            deviceInformationEntityInfo = entityInformationList.get(0);
        Assertions.assertEquals(
            EntityTypeEnumType.DEVICE_INFORMATION.value(),
            deviceInformationEntityInfo.getDescription().getEntityType()
        );
        Assertions.assertEquals(
            1,
            deviceInformationEntityInfo
                .getDescription()
                .getEntityAddress()
                .getEntity()
                .size()
        );
        Assertions.assertEquals(
            0,
            deviceInformationEntityInfo
                .getDescription()
                .getEntityAddress()
                .getEntity()
                .get(0)
        );

        NodeManagementDetailedDiscoveryEntityInformationType serverEntityInfo
            = entityInformationList.get(1);
        Assertions.assertEquals(
            EntityTypeEnumType.GENERIC.value(),
            serverEntityInfo.getDescription().getEntityType()
        );
        Assertions.assertEquals(
            1,
            serverEntityInfo.getDescription().getEntityAddress().getEntity().size()
        );
        Assertions.assertEquals(
            1,
            serverEntityInfo.getDescription().getEntityAddress().getEntity().get(0)
        );
        Assertions.assertEquals(
            ENTITY_DESCRIPTION,
            serverEntityInfo.getDescription().getDescription()
        );
        Assertions.assertEquals(
            ENTITY_LABEL,
            serverEntityInfo.getDescription().getLabel()
        );
    }

    private void assertFeatureInformationCorrect(
        List<NodeManagementDetailedDiscoveryFeatureInformationType> featureInformationList
    ) {
        Assertions.assertEquals(2, featureInformationList.size());

        NodeManagementDetailedDiscoveryFeatureInformationType
            nodeManagementFeatureInfo = featureInformationList.get(0);
        Assertions.assertEquals(
            FeatureTypeEnumType.NODE_MANAGEMENT.value(),
            nodeManagementFeatureInfo.getDescription().getFeatureType()
        );
        Assertions.assertEquals(
            1,
            nodeManagementFeatureInfo
                .getDescription()
                .getFeatureAddress()
                .getEntity()
                .size()
        );
        Assertions.assertEquals(
            0,
            nodeManagementFeatureInfo
                .getDescription()
                .getFeatureAddress()
                .getEntity()
                .get(0)
        );
        Assertions.assertEquals(
            0L,
            nodeManagementFeatureInfo
                .getDescription()
                .getFeatureAddress()
                .getFeature()
        );
        Assertions.assertEquals(
            RoleType.SPECIAL,
            nodeManagementFeatureInfo.getDescription().getRole()
        );
        List<FunctionPropertyType> nodeManagementFunctions
            = nodeManagementFeatureInfo
            .getDescription()
            .getSupportedFunction();
        Assertions.assertTrue(nodeManagementFunctions.stream()
            .anyMatch(functionProperty -> functionProperty.getFunction()
                .equals(FunctionEnumType.NODE_MANAGEMENT_BINDING_DATA.value())));
        Assertions.assertTrue(nodeManagementFunctions.stream()
            .anyMatch(functionProperty -> functionProperty.getFunction()
                .equals(FunctionEnumType.NODE_MANAGEMENT_SUBSCRIPTION_DATA.value())));
        Assertions.assertTrue(nodeManagementFunctions.stream()
            .anyMatch(functionProperty -> functionProperty.getFunction()
                .equals(FunctionEnumType.NODE_MANAGEMENT_USE_CASE_DATA.value())));
        Assertions.assertTrue(nodeManagementFunctions.stream()
            .anyMatch(functionProperty -> functionProperty.getFunction()
                .equals(FunctionEnumType.NODE_MANAGEMENT_DETAILED_DISCOVERY_DATA.value())));
        Assertions.assertTrue(nodeManagementFunctions.stream()
            .anyMatch(functionProperty -> functionProperty.getFunction()
                .equals(FunctionEnumType.NODE_MANAGEMENT_BINDING_REQUEST_CALL.value())));
        Assertions.assertTrue(nodeManagementFunctions.stream()
            .anyMatch(functionProperty -> functionProperty.getFunction()
                .equals(FunctionEnumType.NODE_MANAGEMENT_BINDING_DELETE_CALL.value())));
        Assertions.assertTrue(nodeManagementFunctions.stream()
            .anyMatch(functionProperty -> functionProperty.getFunction()
                .equals(FunctionEnumType.NODE_MANAGEMENT_SUBSCRIPTION_REQUEST_CALL.value())));
        Assertions.assertTrue(nodeManagementFunctions.stream()
            .anyMatch(functionProperty -> functionProperty.getFunction()
                .equals(FunctionEnumType.NODE_MANAGEMENT_SUBSCRIPTION_DELETE_CALL.value())));

        NodeManagementDetailedDiscoveryFeatureInformationType serverFeatureInfo
            = featureInformationList.get(1);
        Assertions.assertEquals(
            FeatureTypeEnumType.GENERIC.value(),
            serverFeatureInfo.getDescription().getFeatureType()
        );
        Assertions.assertEquals(
            SERVER_FEATURE_ADDRESS.getEntity(),
            serverFeatureInfo.getDescription().getFeatureAddress().getEntity()
        );
        Assertions.assertEquals(
            SERVER_FEATURE_ADDRESS.getFeature(),
            serverFeatureInfo.getDescription().getFeatureAddress().getFeature()
        );
        Assertions.assertEquals(
            FEATURE_DESCRIPTION,
            serverFeatureInfo.getDescription().getDescription()
        );
        Assertions.assertEquals(
            FEATURE_LABEL,
            serverFeatureInfo.getDescription().getLabel()
        );
        Assertions.assertEquals(
            FEATURE_GROUP,
            serverFeatureInfo.getDescription().getFeatureGroup()
        );
        Assertions.assertEquals(
            RoleType.SERVER,
            serverFeatureInfo.getDescription().getRole()
        );
        Assertions.assertEquals(
            1,
            serverFeatureInfo.getDescription().getSupportedFunction().size()
        );
        Assertions.assertEquals(
            FunctionEnumType.ACTUATOR_SWITCH_DATA.value(),
            serverFeatureInfo
                .getDescription()
                .getSupportedFunction()
                .get(0)
                .getFunction()
        );
    }

    @Test
    void testGetFullUseCaseInformationRequest() throws ExecutionException,
        InterruptedException {
        Device server = addFeature(
            getGenericDeviceBuilder(REMOTE_COMM, REMOTE_DEVICE_ADDRESS),
            RoleType.SERVER,
            getTestUseCase(RoleType.SERVER)
        ).build();
        Device client = addFeature(
            getGenericDeviceBuilder(LOCAL_COMM, LOCAL_DEVICE_ADDRESS),
            RoleType.CLIENT,
            getTestUseCase(RoleType.CLIENT)
        ).build();

        List<NodeManagementUseCaseDataType.UseCaseInformation> useCaseInformation
            = client.getNodeManagement()
            .getFullUseCaseInformationRequest(REMOTE_DEVICE_ADDRESS, null)
            .get()
            .getCmd()
            .getNodeManagementUseCaseData()
            .getUseCaseInformation();
        Assertions.assertTrue(addressesEqual(
            SERVER_FEATURE_ADDRESS,
            useCaseInformation.get(0).getAddress()
        ));
        Assertions.assertEquals("CEM", useCaseInformation.get(0).getActor());
        Assertions.assertEquals(
            "TestUseCase",
            useCaseInformation.get(0).getUseCaseSupport().get(0).getUseCaseName()
        );
        Assertions.assertEquals(
            "1.0.0",
            useCaseInformation.get(0).getUseCaseSupport().get(0).getUseCaseVersion()
        );
        Assertions.assertEquals(
            1,
            useCaseInformation
                .get(0)
                .getUseCaseSupport()
                .get(0)
                .getScenarioSupport()
                .size()
        );
        Assertions.assertEquals(
            0L,
            useCaseInformation
                .get(0)
                .getUseCaseSupport()
                .get(0)
                .getScenarioSupport()
                .get(0)
        );

        useCaseInformation = server.getNodeManagement()
            .getFullUseCaseInformationRequest(LOCAL_DEVICE_ADDRESS, null)
            .get()
            .getCmd()
            .getNodeManagementUseCaseData()
            .getUseCaseInformation();
        Assertions.assertTrue(addressesEqual(
            CLIENT_FEATURE_ADDRESS,
            useCaseInformation.get(0).getAddress()
        ));
        Assertions.assertEquals("EV", useCaseInformation.get(0).getActor());
        Assertions.assertEquals(
            "TestUseCase",
            useCaseInformation.get(0).getUseCaseSupport().get(0).getUseCaseName()
        );
        Assertions.assertEquals(
            "1.0.0",
            useCaseInformation.get(0).getUseCaseSupport().get(0).getUseCaseVersion()
        );
        Assertions.assertEquals(
            1,
            useCaseInformation
                .get(0)
                .getUseCaseSupport()
                .get(0)
                .getScenarioSupport()
                .size()
        );
        Assertions.assertEquals(
            0L,
            useCaseInformation
                .get(0)
                .getUseCaseSupport()
                .get(0)
                .getScenarioSupport()
                .get(0)
        );
    }

    @Test
    void testFeatureDeletion() throws SpineException, ExecutionException,
        InterruptedException {
        Device server = addFeature(
            getGenericDeviceBuilder(REMOTE_COMM, REMOTE_DEVICE_ADDRESS),
            RoleType.SERVER
        ).build();
        Device client = addFeature(
            getGenericDeviceBuilder(LOCAL_COMM, LOCAL_DEVICE_ADDRESS),
            RoleType.CLIENT
        ).withDiscoverDevices(true).build();

        client.getNodeManagement().requestSubscription(
            server.getNodeManagement().getAddress(),
            FeatureTypeEnumType.NODE_MANAGEMENT,
            this::assertFeatureDeleted
        ).get();
        server.getEntity(1).deleteFeature(0);
        Assertions.assertTrue(subscriptionCalled);
    }

    private void assertFeatureDeleted(RequestResult notification) {
        subscriptionCalled = true;
        NodeManagementDetailedDiscoveryDataType detailedDiscoveryData = notification
            .getCmd()
            .getNodeManagementDetailedDiscoveryData();
        Assertions.assertNull(detailedDiscoveryData.getDeviceInformation());
        Assertions.assertNotNull(detailedDiscoveryData.getEntityInformation());
        Assertions.assertEquals(
            1,
            detailedDiscoveryData.getEntityInformation().size()
        );
        Assertions.assertEquals(
            SERVER_FEATURE_ADDRESS.getEntity(),
            detailedDiscoveryData
                .getEntityInformation()
                .get(0)
                .getDescription()
                .getEntityAddress()
                .getEntity()
        );
        Assertions.assertEquals(
            NetworkManagementStateChangeType.MODIFIED,
            detailedDiscoveryData
                .getEntityInformation()
                .get(0)
                .getDescription()
                .getLastStateChange()
        );
        Assertions.assertNotNull(detailedDiscoveryData.getFeatureInformation());
        Assertions.assertEquals(
            1,
            detailedDiscoveryData.getFeatureInformation().size()
        );
        Assertions.assertEquals(
            SERVER_FEATURE_ADDRESS.getEntity(),
            detailedDiscoveryData
                .getFeatureInformation()
                .get(0)
                .getDescription()
                .getFeatureAddress()
                .getEntity()
        );
        Assertions.assertEquals(
            SERVER_FEATURE_ADDRESS.getFeature(),
            detailedDiscoveryData
                .getFeatureInformation()
                .get(0)
                .getDescription()
                .getFeatureAddress()
                .getFeature()
        );
        Assertions.assertEquals(
            NetworkManagementStateChangeType.REMOVED,
            detailedDiscoveryData
                .getFeatureInformation()
                .get(0)
                .getDescription()
                .getLastStateChange()
        );
    }

    @Test
    void testRuntimeChangeEntityAdded() throws ExecutionException,
        InterruptedException {
        Device server = addFeature(
            getGenericDeviceBuilder(REMOTE_COMM, REMOTE_DEVICE_ADDRESS),
            RoleType.SERVER
        ).build();
        Device client = addFeature(
            getGenericDeviceBuilder(LOCAL_COMM, LOCAL_DEVICE_ADDRESS),
            RoleType.CLIENT
        ).withDiscoverDevices(true).build();
        client.getNodeManagement().getNodeManagementSubscriptionRequest(
            REMOTE_COMM_ADDRESS,
            REMOTE_DEVICE_ADDRESS,
            // fixme fails (inconsistently)
            notification -> assertEntityAdded(notification
                .getCmd()
                .getNodeManagementDetailedDiscoveryData())
        ).get();
        Entity newEntity = Entity.getBuilder()
            .setType(EntityTypeEnumType.GENERIC)
            .addEntity()
            .setType(EntityTypeEnumType.GENERIC)
            .addFeature()
            .setType(FeatureTypeEnumType.GENERIC)
            .setRole(RoleType.SERVER)
            .apply()
            .applyToEntity()
            .addFeature()
            .setType(FeatureTypeEnumType.GENERIC)
            .setRole(RoleType.SERVER)
            .apply()
            .build();
        server.addEntity(newEntity);
    }

    private void assertEntityAdded(NodeManagementDetailedDiscoveryDataType deviceInfo) {
        Assertions.assertNull(deviceInfo.getDeviceInformation());
        Assertions.assertEquals(2, deviceInfo.getEntityInformation().size());
        NodeManagementDetailedDiscoveryEntityInformationType entityInfo = deviceInfo
            .getEntityInformation()
            .get(0);
        NodeManagementDetailedDiscoveryEntityInformationType subEntityInfo
            = deviceInfo.getEntityInformation().get(1);
        EntityAddressType entityAddress = entityInfo
            .getDescription()
            .getEntityAddress();
        EntityAddressType subEntityAddress = subEntityInfo
            .getDescription()
            .getEntityAddress();
        Assertions.assertEquals(1, entityAddress.getEntity().size());
        Assertions.assertEquals(2, entityAddress.getEntity().get(0));
        Assertions.assertEquals(2, subEntityAddress.getEntity().size());
        Assertions.assertEquals(2, subEntityAddress.getEntity().get(0));
        Assertions.assertEquals(0, subEntityAddress.getEntity().get(1));
        Assertions.assertEquals(
            NetworkManagementStateChangeType.ADDED,
            entityInfo.getDescription().getLastStateChange()
        );
        Assertions.assertEquals(
            EntityTypeEnumType.GENERIC.value(),
            entityInfo.getDescription().getEntityType()
        );
        Assertions.assertEquals(2, deviceInfo.getFeatureInformation().size());
        NodeManagementDetailedDiscoveryFeatureInformationType featureInfo
            = deviceInfo.getFeatureInformation().get(0);
        NodeManagementDetailedDiscoveryFeatureInformationType subFeatureInfo
            = deviceInfo.getFeatureInformation()
            .get(1);
        FeatureAddressType featureAddress = featureInfo
            .getDescription()
            .getFeatureAddress();
        FeatureAddressType subFeatureAddress = subFeatureInfo
            .getDescription()
            .getFeatureAddress();
        Assertions.assertEquals(1, featureAddress.getEntity().size());
        Assertions.assertEquals(2, featureAddress.getEntity().get(0));
        Assertions.assertEquals(2, subFeatureAddress.getEntity().size());
        Assertions.assertEquals(2, subFeatureAddress.getEntity().get(0));
        Assertions.assertEquals(0, subFeatureAddress.getEntity().get(1));
    }

    @Test
    void testRuntimeChangeEntityRemoved() throws ExecutionException,
        InterruptedException, SpineException {
        Device server = addFeature(
            getGenericDeviceBuilder(REMOTE_COMM, REMOTE_DEVICE_ADDRESS),
            RoleType.SERVER
        ).build();
        Device client = addFeature(
            getGenericDeviceBuilder(LOCAL_COMM, LOCAL_DEVICE_ADDRESS),
            RoleType.CLIENT
        ).withDiscoverDevices(true).build();
        AtomicBoolean gotNotification = new AtomicBoolean(false);
        client.getNodeManagement()
            .getNodeManagementSubscriptionRequest(
                REMOTE_COMM_ADDRESS,
                REMOTE_DEVICE_ADDRESS,
                notification -> {
                    assertEntityRemoved(notification
                            .getCmd()
                            .getNodeManagementDetailedDiscoveryData()
                    );
                    gotNotification.set(true);
                }
            ).get();
        server.deleteEntity(1);
        Awaitility.await().atMost(5, TimeUnit.SECONDS).until(gotNotification::get);
    }

    private void assertEntityRemoved(NodeManagementDetailedDiscoveryDataType deviceInfo) {
        Assertions.assertNull(deviceInfo.getDeviceInformation());
        Assertions.assertEquals(1, deviceInfo.getEntityInformation().size());
        NodeManagementDetailedDiscoveryEntityInformationType entityInfo = deviceInfo
            .getEntityInformation()
            .get(0);
        EntityAddressType entityAddress = entityInfo
            .getDescription()
            .getEntityAddress();
        Assertions.assertEquals(1, entityAddress.getEntity().size());
        Assertions.assertEquals(1, entityAddress.getEntity().get(0));
        Assertions.assertEquals(
            NetworkManagementStateChangeType.REMOVED,
            entityInfo.getDescription().getLastStateChange()
        );
    }

    @Test
    void testRuntimeChangeFeatureAdded() throws ExecutionException,
        InterruptedException, SpineException {
        Device server = addFeature(
            getGenericDeviceBuilder(REMOTE_COMM, REMOTE_DEVICE_ADDRESS),
            RoleType.SERVER
        ).build();
        Device client = addFeature(
            getGenericDeviceBuilder(LOCAL_COMM, LOCAL_DEVICE_ADDRESS),
            RoleType.CLIENT
        ).withDiscoverDevices(true).build();
        client.getNodeManagement().getNodeManagementSubscriptionRequest(
            REMOTE_COMM_ADDRESS,
            REMOTE_DEVICE_ADDRESS,
            notification -> assertFeatureAdded(notification
                .getCmd()
                .getNodeManagementDetailedDiscoveryData())
        ).get();
        Feature newFeature = Feature
            .getBuilder()
            .setType(FeatureTypeEnumType.GENERIC)
            .setRole(RoleType.SERVER)
            .build();
        server.getEntity(1).addFeature(newFeature);
    }

    private void assertFeatureAdded(NodeManagementDetailedDiscoveryDataType deviceInfo) {
        Assertions.assertNull(deviceInfo.getDeviceInformation());
        Assertions.assertEquals(1, deviceInfo.getEntityInformation().size());
        NodeManagementDetailedDiscoveryEntityInformationType entityInfo = deviceInfo
            .getEntityInformation()
            .get(0);
        Assertions.assertEquals(
            NetworkManagementStateChangeType.MODIFIED,
            entityInfo.getDescription().getLastStateChange()
        );
        Assertions.assertEquals(
            1,
            entityInfo.getDescription().getEntityAddress().getEntity().size()
        );
        Assertions.assertEquals(
            1,
            entityInfo.getDescription().getEntityAddress().getEntity().get(0)
        );

        Assertions.assertEquals(1, deviceInfo.getFeatureInformation().size());
        NodeManagementDetailedDiscoveryFeatureInformationType featureInfo
            = deviceInfo.getFeatureInformation().get(0);
        Assertions.assertEquals(
            NetworkManagementStateChangeType.ADDED,
            featureInfo.getDescription().getLastStateChange()
        );
        Assertions.assertEquals(
            1,
            featureInfo.getDescription().getFeatureAddress().getEntity().size()
        );
        Assertions.assertEquals(
            1,
            featureInfo.getDescription().getFeatureAddress().getEntity().get(0)
        );
        Assertions.assertEquals(
            1,
            featureInfo.getDescription().getFeatureAddress().getFeature()
        );
    }

    @Test
    void testRuntimeChangeFeatureDeleted() throws ExecutionException,
        InterruptedException, SpineException {
        Device server = addFeature(
            getGenericDeviceBuilder(REMOTE_COMM, REMOTE_DEVICE_ADDRESS),
            RoleType.SERVER
        ).build();
        Device client = addFeature(
            getGenericDeviceBuilder(LOCAL_COMM, LOCAL_DEVICE_ADDRESS),
            RoleType.CLIENT
        ).withDiscoverDevices(true).build();
        client.getNodeManagement().getNodeManagementSubscriptionRequest(
            REMOTE_COMM_ADDRESS,
            REMOTE_DEVICE_ADDRESS,
            notification -> assertFeatureDeleted(notification
                .getCmd()
                .getNodeManagementDetailedDiscoveryData())
        ).get();
        server.getEntity(1).deleteFeature(0);
    }

    private void assertFeatureDeleted(NodeManagementDetailedDiscoveryDataType deviceInfo) {
        Assertions.assertNull(deviceInfo.getDeviceInformation());
        Assertions.assertEquals(1, deviceInfo.getEntityInformation().size());
        NodeManagementDetailedDiscoveryEntityInformationType entityInfo = deviceInfo
            .getEntityInformation()
            .get(0);
        Assertions.assertEquals(
            NetworkManagementStateChangeType.MODIFIED,
            entityInfo.getDescription().getLastStateChange()
        );
        Assertions.assertEquals(
            1,
            entityInfo.getDescription().getEntityAddress().getEntity().size()
        );
        Assertions.assertEquals(
            1,
            entityInfo.getDescription().getEntityAddress().getEntity().get(0)
        );

        Assertions.assertEquals(1, deviceInfo.getFeatureInformation().size());
        NodeManagementDetailedDiscoveryFeatureInformationType featureInfo
            = deviceInfo.getFeatureInformation().get(0);
        Assertions.assertEquals(
            NetworkManagementStateChangeType.REMOVED,
            featureInfo.getDescription().getLastStateChange()
        );
        Assertions.assertEquals(
            1,
            featureInfo.getDescription().getFeatureAddress().getEntity().size()
        );
        Assertions.assertEquals(
            1,
            featureInfo.getDescription().getFeatureAddress().getEntity().get(0)
        );
        Assertions.assertEquals(
            0,
            featureInfo.getDescription().getFeatureAddress().getFeature()
        );
    }

    @Test
    void testRuntimeChangeFeatureModified() throws ExecutionException,
        InterruptedException, SpineException {
        Device server = addFeature(
            getGenericDeviceBuilder(REMOTE_COMM, REMOTE_DEVICE_ADDRESS),
            RoleType.SERVER
        ).build();
        Device client = addFeature(
            getGenericDeviceBuilder(LOCAL_COMM, LOCAL_DEVICE_ADDRESS),
            RoleType.CLIENT
        ).withDiscoverDevices(true).build();
        client.getNodeManagement().getNodeManagementSubscriptionRequest(
            REMOTE_COMM_ADDRESS,
            REMOTE_DEVICE_ADDRESS,
            notification -> assertFeatureModified(notification
                .getCmd()
                .getNodeManagementDetailedDiscoveryData())
        ).get();
        server.getFeature(SERVER_FEATURE_ADDRESS).addFunction(new TestFunction());
    }

    private void assertFeatureModified(NodeManagementDetailedDiscoveryDataType deviceInfo) {
        Assertions.assertNull(deviceInfo.getDeviceInformation());
        Assertions.assertEquals(1, deviceInfo.getEntityInformation().size());
        NodeManagementDetailedDiscoveryEntityInformationType entityInfo = deviceInfo
            .getEntityInformation()
            .get(0);
        Assertions.assertEquals(
            NetworkManagementStateChangeType.MODIFIED,
            entityInfo.getDescription().getLastStateChange()
        );
        Assertions.assertEquals(
            1,
            entityInfo.getDescription().getEntityAddress().getEntity().size()
        );
        Assertions.assertEquals(
            1,
            entityInfo.getDescription().getEntityAddress().getEntity().get(0)
        );

        Assertions.assertEquals(1, deviceInfo.getFeatureInformation().size());
        NodeManagementDetailedDiscoveryFeatureInformationType featureInfo
            = deviceInfo.getFeatureInformation().get(0);
        Assertions.assertEquals(
            NetworkManagementStateChangeType.MODIFIED,
            featureInfo.getDescription().getLastStateChange()
        );
        Assertions.assertEquals(
            1,
            featureInfo.getDescription().getFeatureAddress().getEntity().size()
        );
        Assertions.assertEquals(
            1,
            featureInfo.getDescription().getFeatureAddress().getEntity().get(0)
        );
        Assertions.assertEquals(
            0,
            featureInfo.getDescription().getFeatureAddress().getFeature()
        );
        Assertions.assertEquals(
            1,
            featureInfo.getDescription().getSupportedFunction().size()
        );
        Assertions.assertEquals(
            FunctionEnumType.RESULT_DATA.value(),
            featureInfo.getDescription().getSupportedFunction().get(0).getFunction()
        );
    }

    private static class TestFunction extends FeatureFunction {
        public TestFunction() {
            super(FunctionEnumType.RESULT_DATA.value());
            setReadable(true, false);
        }

        @Override
        public CmdType read(FilterType filter, FeatureAddressType sourceAddress) {
            return null;
        }

        @Override
        public SpineAcknowledgment write(
            CmdType cmd,
            FeatureAddressType sourceAddress
        ) {
            return null;
        }

        @Override
        public SpineAcknowledgment call(
            CmdType cmd,
            FeatureAddressType sourceAddress
        ) {
            return null;
        }

        @Override
        public void close() {
            // do nothing - fine for ordinary data functions
        }
    }
}