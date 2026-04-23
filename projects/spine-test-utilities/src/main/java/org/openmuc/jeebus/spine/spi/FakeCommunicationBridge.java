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

public class FakeCommunicationBridge extends FakeCommunication {
    private FakeCommunication partnerOne;
    private FakeCommunication partnerTwo;

    public FakeCommunicationBridge(String address) {
        super(address);
    }

    @Override
    public void connect() {
        Integer interfaceOne = device.getNodeManagement().createInterfaceGroup();
        device
            .getNodeManagement()
            .mapAddressToCommunication(partnerOne.address, interfaceOne);
        Integer interfaceTwo = device.getNodeManagement().createInterfaceGroup();
        device
            .getNodeManagement()
            .mapAddressToCommunication(partnerTwo.address, interfaceTwo);
    }

    @Override
    public SpineConnection open(String address) {
        if (address.equals(partnerOne.address)) {
            return new FakeConnection(partnerOne, this);
        }
        return new FakeConnection(partnerTwo, this);
    }

    public void connectPartnerTwo() {
        partnerTwo.addDevice(address);
        addDevice(partnerTwo.address);
    }

    public void setCommunicationPartners(
        FakeCommunication partnerOne,
        FakeCommunication partnerTwo
    ) {
        this.partnerOne = partnerOne;
        this.partnerTwo = partnerTwo;
    }
}
