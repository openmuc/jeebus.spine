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

import org.openmuc.jeebus.ship.api.ShipNodeConfiguration;
import org.openmuc.jeebus.shipspine.ShipCommunication;
import org.openmuc.jeebus.spine.api.Device;
import org.openmuc.jeebus.spine.xsd.v1.DeviceTypeEnumType;
import org.openmuc.jeebus.spine.xsd.v1.EntityTypeEnumType;

import static org.openmuc.jeebus.shipspine.ShipCommunication.ConnectClientsTo.TRUSTED;

public class MinimalExampleDevice {
    public static void main(String[] args) {
        char[] passphrase = "yourpassphrase".toCharArray();

        // Configure the new SHIP node
        ShipNodeConfiguration shipNodeConfiguration = new ShipNodeConfiguration(
            "0.0.0.0",
            5151,
            "/ship/",
            true,
            "EXAMPLEBRAND-EEB01M3EU-001122334455",
            "local.",
            "Dishwasher ExampleCompany EEB01M4EU",
            "exampleAlias",
            "keystore.jks",
            "CHANGEME".toCharArray(),
            "CHANGEME".toCharArray(),
            "CN=example name1",
            3650
        );

        // Create a new SHIP communication
        ShipCommunication shipCommunication = new ShipCommunication(
            shipNodeConfiguration
        ).withTrustedSkis(
            // Here you can pre-trust remote SHIP devices per SKIs
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
            .withId("d:_n:MinimalExample_123")
            /* Enable the automatic SPINE DetailedDiscovery + UseCaseDiscovery of
             * remote devices */
            .withDiscoverDevices(true)
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
