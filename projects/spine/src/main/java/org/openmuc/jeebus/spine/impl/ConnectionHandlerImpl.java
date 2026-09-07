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

import org.openmuc.jeebus.spine.api.ConnectionHandler;
import org.openmuc.jeebus.spine.spi.Communication;
import org.openmuc.jeebus.spine.spi.SpineConnection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;

class ConnectionHandlerImpl implements ConnectionHandler {
    private static final Logger LOGGER
        = LoggerFactory.getLogger(ConnectionHandler.class);
    private final Communication communication;
    private final Map<String, SpineConnection> connections = new HashMap<>();
    private final Map<String, String> addressMap = new HashMap<>();

    public ConnectionHandlerImpl(Communication communication) {
        this.communication = communication;
    }

    @Override
    public SpineConnection newConnection(String address) {
        SpineConnection connection = null;
        if (connections.containsKey(address)) {
            LOGGER.trace("{} : Reusing registered connection to device", address);
            connection = connections.get(address);
        }
        else {
            LOGGER.debug("{} : Opening new connection to device", address);
            try {
                connection = getCommunication().openConnection(address).get();
                connections.put(address, connection);
            }
            catch (ExecutionException | InterruptedException e) {
                LOGGER.error("Could not open any connection to {}", address, e);
            }
        }
        return connection;
    }

    @Override
    public String getCommunicationAddress(String deviceAddress) {
        return addressMap.get(deviceAddress);
    }

    @Override
    public void registerConnection(SpineConnection connection) {
        synchronized (this) {
            connections.put(connection.getCommunicationAddress(), connection);
        }
    }

    @Override
    public void addAddressMapping(
        String deviceAddress,
        String communicationAddress
    ) {
        addressMap.put(deviceAddress, communicationAddress);
    }

    @Override
    public void removeAddressMapping(String address) {
        synchronized (this) {
            closeConnection(address);
            String deviceAddress = "";
            for (Map.Entry<String, String> entry : addressMap.entrySet()) {
                if (Objects.equals(entry.getValue(), address)) {
                    deviceAddress = entry.getKey();
                    break;
                }
            }
            addressMap.remove(deviceAddress);
        }
    }

    @Override
    public void closeConnection(String address) {
        LOGGER.debug("{} : Closing connection", address);
        SpineConnection connection = connections.remove(address);
        if (connection != null) {
            connection.close();
        }
    }

    @Override
    public String getDeviceAddress(String communicationAddress) {
        for (Map.Entry<String, String> addressMapping : addressMap.entrySet()) {
            if (addressMapping.getValue().equals(communicationAddress)) {
                return addressMapping.getKey();
            }
        }
        return null;
    }

    Communication getCommunication() {
        return communication;
    }

    public void shutdown() {
        synchronized (this) {
            for (SpineConnection conn : connections.values()) {
                closeConnection(conn.getCommunicationAddress());
            }
            connections.clear();
            addressMap.clear();
            communication.disconnect();
        }
    }
}
