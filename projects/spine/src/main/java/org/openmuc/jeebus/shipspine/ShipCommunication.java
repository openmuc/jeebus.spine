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

import org.openmuc.jeebus.ship.api.*;
import org.openmuc.jeebus.spine.impl.parser.MessageParser;
import org.openmuc.jeebus.spine.spi.Communication;
import org.openmuc.jeebus.spine.spi.SpineConnection;
import org.openmuc.jeebus.spine.utils.SpineUtilities;
import org.openmuc.jeebus.spine.xsd.v1.DatagramType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;

import static org.openmuc.jeebus.shipspine.ShipCommunication.ConnectClientsTo.ALL;
import static org.openmuc.jeebus.shipspine.ShipCommunication.ConnectClientsTo.TRUSTED;

public class ShipCommunication extends Communication {
    /**
    * Client connection behavior when a remote SHIP service is discovered
    */
    public enum ConnectClientsTo {
        /**
         * Do not connect to any SHIP server
         */
        NONE,
        /**
         * only to SHIP server with trusted SKI
         */
        TRUSTED,
        /**
         * connect to all SHIP servers
         */
        ALL
    }

    private static final Logger LOGGER
        = LoggerFactory.getLogger(ShipCommunication.class);
    private final ConnectionHandler connectionHandler;
    private final ShipNodeConfiguration nodeConf;
    private boolean connected;
    private Ship ship;
    private Set<String> skisToTrust = Set.of();
    private boolean autoAcceptMode = false;
    private ConnectClientsTo connectClientsTo = ALL;

    public ShipCommunication(ShipNodeConfiguration nodeConf) {
        this.nodeConf = nodeConf;
        connectionHandler = new ConnectionHandler() {

            @Override
            public void onMessageReceived(
                byte[] shipMessage,
                byte[] payload,
                ShipConnectionInterface shipConnection
            ) {
                DatagramType datagram = MessageParser.fromJson(payload);

                LOGGER.debug(
                    "receiving {} {} from {}",
                    datagram.getHeader().getCmdClassifier().value(),
                    SpineUtilities.simplifyCmds(datagram),
                    datagram.getHeader().getAddressSource().getDevice()
                );

                ShipCommunication.this.onMessageReceived(
                    new ShipSpineConnection(shipConnection),
                    datagram
                );
            }

            @Override
            public void onDisconnect(
                DisconnectReason disconnectReason,
                ShipConnectionInterface shipConnectionInterface
            ) {
                if (disconnectReason.equals(DisconnectReason.ERROR)) {
                    LOGGER.error(
                        "Connection to {} lost!",
                        shipConnectionInterface.getRemoteAddress()
                    );
                }
                device
                    .getConnectionHandler()
                    .closeConnection(shipConnectionInterface.getRemoteAddress());
                device
                    .getNodeManagement()
                    .notifyDisconnect(disconnectReason, shipConnectionInterface);
            }

            @Override
            public void serviceAdded(String ip, String ski) {
                if (ski.equals(ship.getOwnSki())) {
                    LOGGER.trace("Detected own SHIP service, ignoring it.");
                }
                else {
                    LOGGER.debug(
                        "Ship service with address {} detected. Public key: {}",
                        ip,
                        ski
                    );

                    if(
                        connectClientsTo == ALL
                        || connectClientsTo == TRUSTED && skisToTrust.contains(ski)
                    ) {
                        device.getConnectionHandler().newConnection(ip);
                    }
                }
            }

            @Override
            public void serviceRemoved(String ip) {
                LOGGER.debug("Ship service with address {} removed.", ip);
                removeDevice(ip);
            }

            @Override
            public void connectionDataExchangeEnabled(String ip) {
                addDevice(ip);
            }
        };
    }

    @Override
    public void connect() {
        LOGGER.trace("Connecting to SHIP");
        ship = new Ship(nodeConf, connectionHandler);

        skisToTrust.forEach(ship::addTrustedSki);

        if (autoAcceptMode) {
            ship.setAutoAcceptMode();
        }

        ship.setClientConnectedCB(ship::runConnectionDataPreparation);

        connected = true;
    }

    @Override
    public void disconnect() {
        if (ship != null) {
            try {
                ship.shutDown();
            }
            catch (IOException e) {
                LOGGER.trace("Error while shutting down SHIP", e);
            }
        }
        connected = false;
    }

    @Override
    public boolean isConnected() {
        return connected;
    }

    @Override
    public SpineConnection open(String address) {
        LOGGER.trace("Opening connection to {} with SHIP", address);
        return new ShipSpineConnection(ship.openConnection(address));
    }

    /**
     * Returns the hex string that represents the SKI value of the local ship node
     * @return Hex string representing SKI value
     */
    public String getOwnSki() {
        return ship.getOwnSki();
    }

    /**
     * @param skis
     *     a collection of SKIs of remote SHIP devices to trust
     * @return the updated {@link ShipCommunication}
     */
    public ShipCommunication withTrustedSkis(String... skis) {
        this.skisToTrust = Set.of(skis);
        if (Objects.nonNull(ship)) {
            skisToTrust.forEach(ship::addTrustedSki);
        }
        return this;
    }

    /**
     * @param skis
     *     a collection of SKIs of remote SHIP devices to trust
     * @return the updated {@link ShipCommunication}
     */
    public ShipCommunication withTrustedSkis(Set<String> skis) {
        this.skisToTrust = skis;
        if (Objects.nonNull(ship)) {
            skisToTrust.forEach(ship::addTrustedSki);
        }
        return this;
    }

    /**
     * @param autoAcceptMode
     *     if true, enables the auto accept mode on the SHIP server
     * @return the updated {@link ShipCommunication}
     * @see Ship#setAutoAcceptMode()
     */
    public ShipCommunication withAutoAcceptMode(boolean autoAcceptMode) {
        this.autoAcceptMode = autoAcceptMode;
        if (Objects.nonNull(ship) && autoAcceptMode) {
            ship.setAutoAcceptMode();
        }
        return this;
    }

    /**
     * @param connectClientsTo
     *     determines which remote SHIP servers to connect SHIP clients to
     * @return the updated {@link ShipCommunication}
     */
    public ShipCommunication withConnectClientsTo(ConnectClientsTo connectClientsTo) {
        this.connectClientsTo = connectClientsTo;
        return this;
    }

    public List<ShipConnectionInfoSnapshot> getConnectionInfos() {
        if (Objects.nonNull(ship)) {
            return ship.getConnectionInfos();
        } else {
            return new ArrayList<>();
        }
    }
}
