/********************************************************************************
 * Copyright (c) 2026 Fraunhofer ISE
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 ********************************************************************************/

package org.openmuc.jeebus.spine;

import org.openmuc.jeebus.spine.api.Device;
import org.openmuc.jeebus.spine.api.Entity;
import org.openmuc.jeebus.spine.impl.DeviceBuilder;
import org.openmuc.jeebus.spine.impl.FeatureBuilder;
import org.openmuc.jeebus.spine.spi.*;
import org.openmuc.jeebus.spine.xsd.v1.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.*;
import java.util.concurrent.Callable;

public class TestUtilities {
    public static final String LOCAL_DEVICE_ADDRESS = "d:_n:Test-Device_0";
    public static final String LOCAL_COMM_ADDRESS = "localhost:1234";
    public static final FeatureAddressType CLIENT_FEATURE_ADDRESS
        = new FeatureAddressType(LOCAL_DEVICE_ADDRESS, new ArrayList<>(List.of(1L)), 0L);
    public static final String REMOTE_DEVICE_ADDRESS = "d:_n:Test-Device_1";
    public static final String REMOTE_COMM_ADDRESS = "localhost:1235";
    public static final FeatureAddressType SERVER_FEATURE_ADDRESS
        = new FeatureAddressType(REMOTE_DEVICE_ADDRESS, new ArrayList<>(List.of(1L)), 0L);
    public static final Communication LOCAL_COMM = new FakeCommunication(
        LOCAL_COMM_ADDRESS);
    public static final Communication REMOTE_COMM = new FakeCommunication(
        REMOTE_COMM_ADDRESS);
    public static final AssertingFeatureFunction ASSERTING_FEATURE_FUNCTION
        = new AssertingFeatureFunction();
    public static final AllowingFeaturePermission ALLOWING_FEATURE_PERMISSION
        = new AllowingFeaturePermission();
    public static final ChangeableFeaturePermission CHANGEABLE_FEATURE_PERMISSION
        = new ChangeableFeaturePermission();

    private static final Logger LOGGER = LoggerFactory.getLogger(TestUtilities.class);

    static {
        ((FakeCommunication) LOCAL_COMM).setCommunicationPartner((FakeCommunication) REMOTE_COMM);
        ((FakeCommunication) REMOTE_COMM).setCommunicationPartner((FakeCommunication) LOCAL_COMM);
        ((FakeCommunication) LOCAL_COMM).enableDiscovery();
    }

    public static DeviceBuilder getGenericDeviceBuilder(
        Communication comm,
        String deviceId
    ) {
        return Device
            .getBuilder()
            .withDiscoverDevices(false)
            .withDeviceType(DeviceTypeEnumType.GENERIC)
            .withCommunication(comm)
            .withId(deviceId);
    }

    public static DeviceBuilder addFeature(DeviceBuilder db, RoleType role, UseCase... useCases) {
        FeatureBuilder featureBuilder = db.addEntity()
            .setType(EntityTypeEnumType.GENERIC)
            .addFeature()
            .setRole(role)
            .setType(FeatureTypeEnumType.GENERIC)
            .setFeaturePermission(ALLOWING_FEATURE_PERMISSION);
        if (role.equals(RoleType.SERVER)) {
            featureBuilder.addFunction(ASSERTING_FEATURE_FUNCTION);
        }
        return featureBuilder.apply().withUseCases(useCases).applyToDevice();
    }

    public static UseCase getTestUseCase(RoleType role) {
        return new TestUseCase(role);
    }

    public static boolean addressesEqual(
        FeatureAddressType addressOne,
        FeatureAddressType addressTwo
    ) {
        boolean result = addressOne.getDevice().equals(addressTwo.getDevice()) && addressOne
            .getEntity()
            .equals(addressTwo.getEntity()) && addressOne
            .getFeature()
            .equals(addressTwo.getFeature());
        if (!result) {
            LOGGER.warn("unequal addresses: {} and {}", addressOne, addressTwo);
        }
        return result;
    }

    public static String fromResource(String where) {
        try {
            return new String(Objects
                .requireNonNull(ClassLoader.getSystemResourceAsStream(where))
                .readAllBytes());
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Throwable exceptionOf(Callable<?> callable) {
        try {
            callable.call();
            return null;
        } catch (Throwable t) {
            return t;
        }
    }

    public static int entityIndex(Entity entity) {
        List<Long> address = entity.getAddress().getEntity();
        return (int) (long) address.get(address.size()-1);

    }

    public static class AllowingFeaturePermission implements FeaturePermission {
        @Override
        public boolean bindingAllowed(NodeManagementBindingRequestCallType.BindingRequest bindingRequest) {
            return true;
        }

        @Override
        public boolean subscriptionAllowed(
            NodeManagementSubscriptionRequestCallType.SubscriptionRequest subscriptionRequest
        ) {
            return true;
        }
    }

    public static class TestUseCase implements UseCase {
        private final String ACTOR;
        private final FeatureAddressType USE_CASE_ADDRESS;
        private final String USE_CASE_NAME;

        public TestUseCase(RoleType role) {
            USE_CASE_NAME = "TestUseCase";
            if (role.equals(RoleType.CLIENT)) {
                ACTOR = "EV";
                USE_CASE_ADDRESS = CLIENT_FEATURE_ADDRESS;
            }
            else {
                ACTOR = "CEM";
                USE_CASE_ADDRESS = SERVER_FEATURE_ADDRESS;
            }
        }

        public TestUseCase(
            String ACTOR,
            FeatureAddressType USE_CASE_ADDRESS,
            String useCaseName
        ) {
            this.ACTOR = ACTOR;
            this.USE_CASE_ADDRESS = USE_CASE_ADDRESS;
            this.USE_CASE_NAME = useCaseName;
        }

        @Override
        public String getActor() {
            return ACTOR;
        }

        @Override
        public String getName() {
            return USE_CASE_NAME;
        }

        @Override
        public String getVersion() {
            return "1.0.0";
        }

        @Override
        public List<Long> getScenarioSupport() {
            return Arrays.asList(0L);
        }

        @Override
        public FeatureAddressType getAddress() {
            return USE_CASE_ADDRESS;
        }

        @Override
        public void setup() {
        }

        @Override
        public Set<FeatureRequirement> getFeatureRequirements(EntityTypeEnumType entityType) {
            return Set.of();
        }

        @Override
        public void close() {
        }
    }

    public static class ChangeableFeaturePermission implements FeaturePermission {
        public static final String MINIMUM_TRUST_LEVEL = "preconfiguredTrust";
        private final List<FeatureAddressType> trustedClients = new ArrayList<>();
        private boolean bindingAllowed = true;
        private boolean subscriptionAllowed = true;

        @Override
        public boolean bindingAllowed(NodeManagementBindingRequestCallType.BindingRequest bindingRequest) {
            return bindingAllowed;
        }

        @Override
        public boolean subscriptionAllowed(
            NodeManagementSubscriptionRequestCallType.SubscriptionRequest subscriptionRequest
        ) {
            return subscriptionAllowed;
        }

        @Override
        public boolean isTrusted(
            FeatureAddressType clientAddress,
            String minimumTrustLevel
        ) {
            return trustedClients.stream()
                .anyMatch(address -> minimumTrustLevel.equals(MINIMUM_TRUST_LEVEL)
                    && address.getDevice()
                    .equals(clientAddress.getDevice())
                    && address.getEntity().equals(clientAddress.getEntity())
                    && address.getFeature().equals(clientAddress.getFeature()));
        }

        public void trust(FeatureAddressType clientFeatureAddress) {
            trustedClients.add(clientFeatureAddress);
        }

        public void reset() {
            trustedClients.clear();
            bindingAllowed = true;
            subscriptionAllowed = true;
        }

        public void setBindingAllowed(boolean allowed) {
            bindingAllowed = allowed;
        }

        public void setSubscriptionAllowed(boolean allowed) {
            subscriptionAllowed = allowed;
        }
    }
}
