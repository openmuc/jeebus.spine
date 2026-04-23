/********************************************************************************
 * Copyright (c) 2026 Fraunhofer ISE
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 ********************************************************************************/

package org.openmuc.jeebus.shipspine;

import org.openmuc.jeebus.ship.api.ShipConnectionInterface;
import org.openmuc.jeebus.spine.impl.parser.MessageParser;
import org.openmuc.jeebus.spine.spi.SpineConnection;
import org.openmuc.jeebus.spine.utils.SpineUtilities;
import org.openmuc.jeebus.spine.xsd.v1.DatagramType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ShipSpineConnection implements SpineConnection {
    private static final Logger LOGGER
        = LoggerFactory.getLogger(ShipSpineConnection.class);

    private final ShipConnectionInterface shipConnection;

    public ShipSpineConnection(ShipConnectionInterface shipConnection) {
        this.shipConnection = shipConnection;
    }

    @Override
    public void sendMessage(DatagramType datagram) {
        LOGGER.debug(
            "sending {} {} to {}",
            datagram.getHeader().getCmdClassifier().value(),
            SpineUtilities.simplifyCmds(datagram),
            datagram.getHeader().getAddressDestination().getDevice()
        );

        byte[] payload = MessageParser.toJson(datagram);
        shipConnection.sendMsg(payload);
    }

    @Override
    public String getCommunicationAddress() {
        return shipConnection.getRemoteAddress();
    }

    @Override
    public void close() {
        shipConnection.close();
    }
}
