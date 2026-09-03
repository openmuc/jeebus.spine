/********************************************************************************
 * Copyright (c) 2026 Fraunhofer ISE
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 ********************************************************************************/

package org.openmuc.jeebus.spine.demo;

import org.openmuc.jeebus.ship.api.cert.KeyStoreCertificateStorage;
import org.openmuc.jeebus.ship.node.ShipConfig;
import org.openmuc.jeebus.shipspine.ShipCommunication;
import org.openmuc.jeebus.spine.api.Device;
import org.openmuc.jeebus.spine.xsd.v1.DeviceTypeEnumType;
import org.openmuc.jeebus.spine.xsd.v1.EntityTypeEnumType;

import static org.openmuc.jeebus.shipspine.ShipCommunication.ConnectClientsTo.TRUSTED;

public class MinimalExampleDevice {
    public static void main(String[] args) {

        // Configure the new SHIP node
        ShipConfig shipConfig = ShipConfig.getBuilder()
            .withServerBindAddresses("localhost:5151")
            .withId("JEEBUS-MINIMAL-EXAMPLE-1")
            .withMDnsServiceInstance("jEEBus Minimal Example 1")
            .withCertificateStorage(new KeyStoreCertificateStorage("keystore.jks"))
            .withCertificateDistinguishedName("CN=example name1")
            .withTrustedSkis(
                // Here you can pre-trust remote SHIP devices per SKIs
            )
            .build();

        // Create a new SHIP communication
        ShipCommunication shipCommunication = new ShipCommunication(
            shipConfig
        ).withConnectClientsTo(
            TRUSTED // Configure which SHIP devices to connect to (ALL, TRUSTED, NONE)
        );

        // Create a new SPINE device using the builder class
        Device device = Device
            .getBuilder()
            // Set the SPINE device type
            .withDeviceType(DeviceTypeEnumType.GENERIC)
            // Set SHIP as the communication protocol
            .withCommunication(shipCommunication)
            // Set the SPINE device ID
            .withId("d:_n:JeebusMinimalExample_1")
            .addEntity()
                .setType(EntityTypeEnumType.GENERIC)
                .withUseCases(
                    /* Here you can add supported EEBus Use Cases to the device.
                     * These must implement the UseCase interface. */
                    new ExampleUseCase()
                )
                .applyToDevice()
            .build();
    }
}
