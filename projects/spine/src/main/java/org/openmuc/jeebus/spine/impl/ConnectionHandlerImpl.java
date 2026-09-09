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

import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;

class ConnectionHandlerImpl implements ConnectionHandler {
    private static final Logger LOGGER
        = LoggerFactory.getLogger(ConnectionHandler.class);
    private final Communication communication;
    private final Map<String, SpineConnection> connections = new ConcurrentHashMap<>();
    private final Map<String, String> addressMap = new ConcurrentHashMap<>();

    public ConnectionHandlerImpl(Communication communication) {
        this.communication = communication;
    }

    @Override
    public SpineConnection newConnection(String address) {
        SpineConnection connection = null;
        if (address != null && connections.containsKey(address)) {
            LOGGER.trace("{} : Reusing registered connection to device", address);
            connection = connections.get(address);
        }
        else {
            LOGGER.debug("{} : Opening new connection to device", address);
            try {
                connection = getCommunication().openConnection(address).get();
                if (address != null) {
                    connections.put(address, connection);
                }
            }
            catch (ExecutionException | InterruptedException e) {
                LOGGER.error("Could not open any connection to {}", address, e);
            }
        }
        return connection;
    }

    @Override
    public String getCommunicationAddress(String deviceAddress) {
        return deviceAddress != null ? addressMap.get(deviceAddress) : null;
    }

    @Override
    public void registerConnection(SpineConnection connection) {
        connections.put(connection.getCommunicationAddress(), connection);
    }

    @Override
    public void addAddressMapping(
        String deviceAddress,
        String communicationAddress
    ) {
        if (deviceAddress != null && communicationAddress != null) {
            addressMap.put(deviceAddress, communicationAddress);
        }
    }

    @Override
    public void removeAddressMapping(String communicationAddress) {
        closeConnection(communicationAddress);
        String deviceAddress = getDeviceAddress(communicationAddress);
        if (deviceAddress != null) {
            addressMap.remove(deviceAddress);
        }
    }

    @Override
    public void closeConnection(String address) {
        if (address != null) {
            SpineConnection connection = connections.remove(address);
            if (connection != null) {
                connection.close();
                LOGGER.debug("{} : removed connection", address);
            }
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
        connections
            .values()
            .stream()
            .filter(Objects::nonNull)
            .map(SpineConnection::getCommunicationAddress)
            .forEach(this::closeConnection);

        connections.clear();
        addressMap.clear();
        communication.disconnect();
    }
}
