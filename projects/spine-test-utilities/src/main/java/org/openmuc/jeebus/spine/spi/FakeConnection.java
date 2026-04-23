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

import org.openmuc.jeebus.spine.impl.parser.MessageParser;
import org.openmuc.jeebus.spine.xsd.v1.DatagramType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.openmuc.jeebus.spine.utils.SpineUtilities.simplifyDatagram;

public class FakeConnection implements SpineConnection {
    private final Communication partner;
    private final Communication device;
    private static final Logger LOGGER
        = LoggerFactory.getLogger(FakeConnection.class);

    static {
        MessageParser.enablePrettyPrint();
    }

    public FakeConnection(Communication partner, Communication device) {
        this.partner = partner;
        this.device = device;
    }

    @Override
    public void sendMessage(DatagramType datagram) {

        LOGGER.debug(simplifyDatagram(datagram));
        LOGGER.trace(
            "Sending message:\n{}",
            new String(MessageParser.toJson(datagram))
        );

        partner.onMessageReceived(new FakeConnection(device, partner), datagram);
    }

    @Override
    public String getCommunicationAddress() {
        return ((FakeCommunication) partner).address;
    }

    @Override
    public void close() {

    }
}
