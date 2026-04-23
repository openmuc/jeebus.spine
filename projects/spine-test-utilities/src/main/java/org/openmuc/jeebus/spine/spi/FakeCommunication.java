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

public class FakeCommunication extends Communication {
    final String address;
    private FakeCommunication partner;
    private boolean discoveryEnabled;
    private boolean connected = false;

    public FakeCommunication(String address) {
        this.address = address;
    }

    @Override
    public void connect() {
        if (discoveryEnabled) {
            partner.addDevice(address);
            addDevice(partner.address);
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
        return new FakeConnection(partner, this);
    }

    public void setCommunicationPartner(FakeCommunication communicationPartner) {
        partner = communicationPartner;
    }

    public void enableDiscovery() {
        discoveryEnabled = true;
    }
}