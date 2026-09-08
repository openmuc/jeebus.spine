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
import org.openmuc.jeebus.ship.node.ShipConfig;
import org.openmuc.jeebus.ship.util.ShipUtilities;
import org.openmuc.jeebus.spine.impl.parser.MessageParser;
import org.openmuc.jeebus.spine.spi.Communication;
import org.openmuc.jeebus.spine.spi.SpineConnection;
import org.openmuc.jeebus.spine.utils.SpineUtilities;
import org.openmuc.jeebus.spine.xsd.v1.CmdClassifierType;
import org.openmuc.jeebus.spine.xsd.v1.DatagramType;
import org.openmuc.jeebus.spine.xsd.v1.FeatureAddressType;
import org.openmuc.jeebus.spine.xsd.v1.HeaderType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.Inet4Address;
import java.net.InetSocketAddress;
import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.ExecutionException;
import java.util.function.Function;

import static org.openmuc.jeebus.ship.api.DisconnectReason.ERROR;
import static org.openmuc.jeebus.ship.util.ShipUtilities.beautify;
import static org.openmuc.jeebus.ship.util.ShipUtilities.safelyParseSocketAddress;
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

    private final ShipConnectionHandler shipConnectionHandler
        = new ShipConnectionHandler();
    private final ShipConfig shipConfig;
    private Ship ship;
    private final Map<String, Set<ShipService>> serviceMap
        = new ConcurrentSkipListMap<>();

    private boolean connected;
    private ConnectClientsTo connectClientsTo = ALL;

    public ShipCommunication(ShipConfig shipConfig) {
        this.shipConfig = shipConfig;
    }

    @Override
    public void connect() {
        LOGGER.info("Connecting SPINE to SHIP");
        ship = new Ship(shipConfig, shipConnectionHandler);

        connected = true;
    }

    @Override
    public void disconnect() {
        if (ship != null) {
            try {
                ship.close();
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
        try {
            return connectToFirstAvailable(
                Collections.singleton(safelyParseSocketAddress(address)).iterator(),
                "ship",
                null,
                null
            )
                .thenApply(ShipSpineConnection::new)
                .whenComplete(this::handleConnectionFuture)
                .get();
        }
        catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public CompletableFuture<? extends SpineConnection> openConnection(
        String communicationAddress
    ) {

        LOGGER.trace("Opening connection to {} with SHIP", communicationAddress);

        if (serviceMap.containsKey(communicationAddress)) {

            ShipService someService = serviceMap
                .get(communicationAddress)
                .stream()
                .findAny()
                .orElseThrow();

            Iterator<InetSocketAddress> sockets = serviceMap
                .get(communicationAddress)
                .stream()
                .map(ShipService::getSocketAddresses)
                .flatMap(Collection::stream)
                .distinct()
                // Try Inet4Addresses first
                .sorted((left, right) -> Boolean.compare(
                    right.getAddress() instanceof Inet4Address,
                    left.getAddress() instanceof Inet4Address
                ))
                .iterator();

            return connectToFirstAvailable(
                sockets,
                someService.getPath(),
                someService.getShipId(),
                someService.getSki()
            )
                .thenApply(ShipSpineConnection::new)
                .whenComplete((this::handleConnectionFuture));
        }
        else {
            // TODO: maybe try and filter the current SHIP services
            //  although they should have been reported at this point...
            throw new IllegalStateException(
                "Opening connection to unidentified SHIP device "
                    +communicationAddress
                    +" is not supported."
            );
        }
    }

    private CompletableFuture<ShipConnectionInterface> connectToFirstAvailable(
        Iterator<InetSocketAddress> sockets,
        String path,
        String expectedShipId,
        String expectedSki
    ) {
        if (!sockets.hasNext()) {
            return CompletableFuture.failedFuture(
                new IllegalStateException(
                    "None of the sockets in their SHIP service yielded a successful connection."
                        +expectedShipId
                )
            );
        }

        InetSocketAddress socket = sockets.next();

        return ship.openConnection(socket, path, expectedShipId, expectedSki)
            .handle((connection, throwable) -> {
                if (throwable == null && connection != null) {
                    return CompletableFuture.completedFuture(connection);
                }
                LOGGER.warn(
                    "Could not connect to {}. Trying the next socket if available.",
                    beautify(socket)
                );
                LOGGER.info("Exception was:", throwable);
                return connectToFirstAvailable(sockets, path, expectedShipId, expectedSki);
            })
            .thenCompose(Function.identity());
    }

    /**
     * Returns the hex string that represents the SKI value of the local ship node
     * @return Hex string representing SKI value
     */
    public String getOwnSki() {
        return ship.getOwnSki();
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

    private void handleConnectionFuture(
        ShipSpineConnection connection,
        Throwable error
    ) {
        if (error == null && connection != null) {
            device.getConnectionHandler().registerConnection(connection);
            addDevice(connection.getCommunicationAddress());
        }
    }

    private class ShipConnectionHandler implements ConnectionHandler {

        @Override
        public void onMessageReceived(
            byte[] shipMessage,
            byte[] payload,
            ShipConnectionInterface shipConnection
        ) {
            DatagramType datagram = MessageParser.fromJson(payload);

            LOGGER.debug(
                "receiving {} {} from {}",
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
                    .map(HeaderType::getAddressSource)
                    .map(FeatureAddressType::getDevice)
                    .orElse(null)
            );

            if (datagram != null) {
                ShipCommunication.super.onMessageReceived(
                    new ShipSpineConnection(shipConnection),
                    datagram
                );
            }
        }

        @Override
        public void onDisconnect(
            DisconnectReason disconnectReason,
            ShipConnectionInterface shipConnectionInterface
        ) {
            if (disconnectReason.equals(ERROR)) {
                LOGGER.error(
                    "Connection to {} lost!",
                    shipConnectionInterface.getRemoteId()
                );
            }

            removeDevice(shipConnectionInterface.getRemoteId());
        }

        @Override
        public void serviceAdded(ShipService service) {
            if (!Objects.equals(service.getSki(), ship.getOwnSki())) {

                if (serviceMap.containsKey(service.getShipId())) {
                    serviceMap.get(service.getShipId()).add(service);
                }
                else {
                    serviceMap.put(
                        service.getShipId(),
                        new ConcurrentSkipListSet<>(Collections.singleton(service))
                    );
                }

                if (connectClientsTo == ALL
                    || connectClientsTo == TRUSTED
                    && ship.trusts(service.getSki())) {

                    device
                        .getConnectionHandler()
                        .newConnection(service.getShipId());
                }
            }
        }

        @Override
        public void serviceRemoved(ShipService service) {

            if (serviceMap.containsKey(service.getShipId())) {
                serviceMap.get(service.getShipId()).remove(service);
            }
        }

        @Override
        public void clientConnected(final ShipConnectionInterface connection) {
            device
                .getConnectionHandler()
                .registerConnection(new ShipSpineConnection(connection));

            addDevice(connection.getRemoteId());
        }
    }
}
