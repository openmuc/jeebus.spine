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
import org.openmuc.jeebus.spine.xsd.v1.CmdClassifierType;
import org.openmuc.jeebus.spine.xsd.v1.DatagramType;
import org.openmuc.jeebus.spine.xsd.v1.FeatureAddressType;
import org.openmuc.jeebus.spine.xsd.v1.HeaderType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Optional;

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
            Optional
                .ofNullable(datagram)
                .map(DatagramType::getHeader)
                .map(HeaderType::getCmdClassifier)
                .map(CmdClassifierType::value)
                .orElse(null),
            SpineUtilities.simplifyCmds(datagram),
            Optional
                .ofNullable(datagram)
                .map(DatagramType::getHeader)
                .map(HeaderType::getAddressDestination)
                .map(FeatureAddressType::getDevice)
                .orElse(null)
        );

        byte[] payload = MessageParser.toJson(datagram);
        shipConnection.sendMsg(payload);
    }

    @Override
    public String getCommunicationAddress() {
        return shipConnection.getRemoteId();
    }

    @Override
    public void close() {
        shipConnection.close();
    }
}
