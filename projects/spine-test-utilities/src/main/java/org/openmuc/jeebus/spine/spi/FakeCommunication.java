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

import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;

public class FakeCommunication extends Communication {
    private final String communicationAddress;
    private FakeCommunication partner;
    private boolean discoveryEnabled;
    protected boolean connected = false;
    private final Map<String, FakeConnection> connections = new ConcurrentHashMap<>();

    public FakeCommunication(String communicationAddress) {
        this.communicationAddress = communicationAddress;
    }

    @Override
    public void connect() {
        if (discoveryEnabled) {
            partner.addDevice(communicationAddress);
            addDevice(partner.getCommunicationAddress());
        }

        if (partner.getDevice() != null
            && partner.getDevice().getConnectionHandler() != null
            && this.getDevice() != null
            && this.getDevice().getConnectionHandler() != null
        ) {
            this.getDevice().getConnectionHandler().addAddressMapping(
                partner.getDevice().getAddress().getDevice(),
                partner.getCommunicationAddress()
            );
            partner.getDevice().getConnectionHandler().addAddressMapping(
                this.getDevice().getAddress().getDevice(),
                this.getCommunicationAddress()
            );
        }
        connected = true;
    }

    @Override
    public void disconnect() {
        connected = false;
    }

    @Override
    public boolean isConnected() {
        return connected;
    }

    @Override
    public SpineConnection open(String address) {
        throw new UnsupportedOperationException();
    }

    @Override
    public CompletableFuture<? extends SpineConnection> openConnection(
        String communicationAddress
    ) {
        if (this.isConnected()) {
            connections.putIfAbsent(
                this.communicationAddress,
                new FakeConnection(partner, this)
            );

            return CompletableFuture.completedFuture(
                connections.get(this.communicationAddress));
        }
        else {
            return CompletableFuture.failedFuture(new ExecutionException(
                "we are not connected",
                new IllegalStateException()
            ));
        }
    }

    public void setCommunicationPartner(FakeCommunication communicationPartner) {
        partner = communicationPartner;
    }

    public void enableDiscovery() {
        discoveryEnabled = true;
    }

    public String getCommunicationAddress() {
        return communicationAddress;
    }

    public Device getDevice() {
        return this.device;
    }

    @Override
    public void removeDevice(String communicationAddress) {

        String deviceAddress = device
            .getConnectionHandler()
            .getDeviceAddress(communicationAddress);

        if (deviceAddress != null) {

            device.getConnectionHandler().removeAddressMapping(communicationAddress);

            if (device.getNodeManagement() != null) {

                device
                    .getNodeManagement()
                    .notifyDisconnect(deviceAddress);

                device
                    .getNodeManagement()
                    .removeAddressMapping(communicationAddress);
            }
        }
    }
}