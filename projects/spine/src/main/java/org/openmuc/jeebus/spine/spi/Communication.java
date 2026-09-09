/********************************************************************************
 * Copyright (c) 2026 Fraunhofer ISE
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 ********************************************************************************/

package org.openmuc.jeebus.spine.spi;

import org.openmuc.jeebus.spine.api.Device;
import org.openmuc.jeebus.spine.xsd.v1.DatagramType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.CompletableFuture;

public abstract class Communication {
    private static final Logger LOGGER
        = LoggerFactory.getLogger(Communication.class);
    protected Device device;

    /**
     * Connects to the network, i.e. makes the communication layer available
     */
    public abstract void connect();

    /**
     * Disconnects from the network, i.e. terminates the communication layer
     */
    public abstract void disconnect();

    /**
     * Is the communication layer currently connected to the network?
     */
    public abstract boolean isConnected();

    /**
     * @param address
     *     the address used in the communication protocol, i.e. not the SPINE device
     *     address. Must be a valid String representation of a SocketAddress
     * @return a connection to the requested device
     * @deprecated since 4.1.0. Please use
     * {@link Communication#openConnection(String)} instead
     */
    @Deprecated(since = "4.1.0")
    public abstract SpineConnection open(String address);

    /**
     * @param communicationAddress
     *     the unique identifier for a device in a communication protocol. For SHIP
     *     this is the SHIP ID.
     * @return a CompletableFuture that completes with an Interface to represent this
     * particular connection to another SPINE device, or fails if the connection
     * attempt was unsuccessful
     */
    public abstract CompletableFuture<? extends SpineConnection> openConnection(
        String communicationAddress
    );

    public void setDevice(Device device) {
        this.device = device;
    }

    /**
     * @param connection
     *     the connection associated to the received message
     * @param datagram
     *     the received message
     */
    public void onMessageReceived(
        SpineConnection connection,
        DatagramType datagram
    ) {
        device.getConnectionHandler().registerConnection(connection);
        if (datagram.getHeader().getAddressSource().getDevice() != null) {
            device.getConnectionHandler()
                .addAddressMapping(
                    datagram.getHeader().getAddressSource().getDevice(),
                    connection.getCommunicationAddress()
                );
        }
        else {
            LOGGER.warn("AddressSource did not contain a device address");
        }
        device.parseDatagram(datagram);
    }

    /**
     * Notifies device listeners of this device and starts the detailed discovery
     * process if enabled
     *
     * @param communicationAddress
     *     the address of a newly discovered device
     */
    public void addDevice(String communicationAddress) {
        device.deviceDetected(communicationAddress);
    }

    public void removeDevice(String communicationAddress) {

        String deviceAddress = device
            .getConnectionHandler()
            .getDeviceAddress(communicationAddress);

        device
            .getConnectionHandler()
            .closeConnection(communicationAddress);

        device.getConnectionHandler().removeAddressMapping(communicationAddress);

        device
            .getNodeManagement()
            .notifyDisconnect(deviceAddress);

        device.getNodeManagement().removeAddressMapping(communicationAddress);
    }
}
