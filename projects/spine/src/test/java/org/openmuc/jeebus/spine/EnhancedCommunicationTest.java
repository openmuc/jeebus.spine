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

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openmuc.jeebus.spine.api.Device;
import org.openmuc.jeebus.spine.impl.DeviceBuilder;
import org.openmuc.jeebus.spine.spi.*;
import org.openmuc.jeebus.spine.xsd.v1.DeviceTypeEnumType;
import org.openmuc.jeebus.spine.xsd.v1.NetworkManagementFeatureSetType;
import org.openmuc.jeebus.spine.xsd.v1.RoleType;

import static org.openmuc.jeebus.spine.TestUtilities.*;

public class EnhancedCommunicationTest {
    private static final String BRIDGE_COMM_ADDRESS = "localhost:1236";
    private static final String BRIDGE_DEVICE_ADDRESS = "d:_n:Bridge_0";
    private static FakeCommunication clientComm;
    private static FakeCommunication serverComm;
    private static FakeCommunicationBridge gatewayComm;

    @BeforeAll
    static void setupCommunication() {
        clientComm = new FakeCommunication(LOCAL_COMM_ADDRESS);
        clientComm.enableDiscovery();
        serverComm = new FakeCommunication(REMOTE_COMM_ADDRESS);
        gatewayComm = new FakeCommunicationBridge(BRIDGE_COMM_ADDRESS);
        gatewayComm.setCommunicationPartners(clientComm, serverComm);
        clientComm.setCommunicationPartner(gatewayComm);
        serverComm.setCommunicationPartner(gatewayComm);
    }

    private Device getForwardingDevice(NetworkManagementFeatureSetType commMode) {
        DeviceBuilder db = getGenericDeviceBuilder(
            gatewayComm,
            BRIDGE_DEVICE_ADDRESS
        );
        db
            .withCommunication(gatewayComm)
            .withDeviceType(DeviceTypeEnumType.GENERIC)
            .withId(BRIDGE_DEVICE_ADDRESS);
        db.withCommunicationMode(commMode).withDiscoverDevices(true);
        return db.build();
    }

    @Test
    void testSimpleDevicesNotForwarded() {
        AssertingDeviceListener dl = new AssertingDeviceListener();
        Device router = getForwardingDevice(NetworkManagementFeatureSetType.ROUTER);
        Device client = addFeature(
            getGenericDeviceBuilder(clientComm, LOCAL_DEVICE_ADDRESS),
            RoleType.CLIENT
        ).withDiscoverDevices(true)
            .withCommunicationMode(NetworkManagementFeatureSetType.SMART)
            .withAutomaticDestinationListDetection(true)
            .addDeviceListener(dl)
            .build();
        Device server = addFeature(
            getGenericDeviceBuilder(serverComm, REMOTE_DEVICE_ADDRESS),
            RoleType.SERVER
        ).withCommunicationMode(NetworkManagementFeatureSetType.SIMPLE).build();
        gatewayComm.connectPartnerTwo(); // simulate connection of router to server
        dl.assertDeviceDiscovered(false);
    }

    @Test
    void testSimpleDeviceDoesNotCheckDestinationList() {
        AssertingDeviceListener dl = new AssertingDeviceListener();
        Device router = getForwardingDevice(NetworkManagementFeatureSetType.ROUTER);
        Device client = addFeature(
            getGenericDeviceBuilder(clientComm, LOCAL_DEVICE_ADDRESS),
            RoleType.CLIENT
        ).withDiscoverDevices(true)
            .withCommunicationMode(NetworkManagementFeatureSetType.SIMPLE)
            .withAutomaticDestinationListDetection(true)  // no effect with SIMPLE
            .addDeviceListener(dl)
            .build();
        Device server = addFeature(
            getGenericDeviceBuilder(serverComm, REMOTE_DEVICE_ADDRESS),
            RoleType.SERVER
        ).withCommunicationMode(NetworkManagementFeatureSetType.SMART).build();
        gatewayComm.connectPartnerTwo(); // simulate connection of router to server
        dl.assertDeviceDiscovered(false);
    }

}
