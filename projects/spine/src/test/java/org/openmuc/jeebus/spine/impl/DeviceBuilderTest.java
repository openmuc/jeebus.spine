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

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openmuc.jeebus.spine.api.Device;
import org.openmuc.jeebus.spine.api.IncompleteBuildException;
import org.openmuc.jeebus.spine.api.SpineException;
import org.openmuc.jeebus.spine.spi.FakeCommunication;
import org.openmuc.jeebus.spine.xsd.v1.DeviceTypeEnumType;
import org.openmuc.jeebus.spine.xsd.v1.EntityTypeEnumType;

class DeviceBuilderTest {
    private static final FakeCommunication fakeCommunication;

    static {
        fakeCommunication = new FakeCommunication("test");
        FakeCommunication mockComm = new FakeCommunication("mock");
        mockComm.setDevice(new DeviceImpl());
        fakeCommunication.setCommunicationPartner(mockComm);
    }

    @Test
    void testIncompleteBuild() {
        // nothing set
        Assertions.assertThrows(
            IncompleteBuildException.class,
            () -> Device.getBuilder().build()
        );

        // Device id missing
        Assertions.assertThrows(
            IncompleteBuildException.class, () -> Device.getBuilder()
                .withDeviceType(DeviceTypeEnumType.GENERIC)
                .withCommunication(fakeCommunication)
                .build()
        );

        // Communication missing
        Assertions.assertThrows(
            IncompleteBuildException.class, () -> Device.getBuilder()
                .withId("d:_n:Test-Device_0")
                .withDeviceType(DeviceTypeEnumType.GENERIC)
                .build()
        );

        // Device type missing
        Assertions.assertThrows(
            IncompleteBuildException.class,
            () -> Device
                .getBuilder()
                .withId("d:_n:Test-Device_0")
                .withCommunication(fakeCommunication)
                .build()
        );

        // id and comm missing
        Assertions.assertThrows(
            IncompleteBuildException.class,
            () -> Device
                .getBuilder()
                .withDeviceType(DeviceTypeEnumType.GENERIC)
                .build()
        );

        // id and type missing
        Assertions.assertThrows(
            IncompleteBuildException.class,
            () -> Device.getBuilder().withCommunication(fakeCommunication).build()
        );

        // comm and type missing
        Assertions.assertThrows(
            IncompleteBuildException.class,
            () -> Device.getBuilder().withId("d:_i:1_Test").build()
        );
    }

    @Test
    void testNodeManagementAdded() throws SpineException {
        Device device = getGenericFakeDeviceBuilder().build();
        // Would throw SpineException if NodeManagement feature was not added properly
        Assertions.assertDoesNotThrow(device::getNodeManagement);

        // Only DeviceInformation entity was added
        Assertions.assertEquals(1, device.getEntities().size());

        // Only NodeManagement feature was added
        Assertions.assertEquals(1, device.getEntity(0).getFeatures().size());
    }

    @Test
    void testAddEntity() throws SpineException {
        Device device = getGenericFakeDeviceBuilder().addEntity()
            .setType(EntityTypeEnumType.GENERIC)
            .applyToDevice()
            .build();

        // DeviceInformation entity + manually added entity existent
        Assertions.assertEquals(2, device.getEntities().size());

        // Entity id is set to next available id (0L is DeviceInformation)
        Assertions.assertEquals(
            1L,
            device.getEntity(1).getAddress().getEntity().get(0)
        );
    }

    private DeviceBuilder getGenericFakeDeviceBuilder() {
        return Device.getBuilder()
            .withId("d:_n:Test-Device_0")
            .withDeviceType(DeviceTypeEnumType.GENERIC)
            .withCommunication(fakeCommunication);
    }
}