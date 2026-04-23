/********************************************************************************
 * Copyright (c) 2026 Fraunhofer ISE
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 ********************************************************************************/

package org.openmuc.jeebus.spine.api;

import org.openmuc.jeebus.spine.spi.SpineConnection;

import java.util.NoSuchElementException;

public interface ConnectionHandler {

    /**
     * Returns an open connection to the requested communication partner.
     *
     * @param address
     *     the address used in the communication protocol, i.e. not the SPINE device
     *     address. See {@link ConnectionHandler#getCommunicationAddress}
     * @return a connection to the requested device
     */
    SpineConnection newConnection(String address);

    /**
     * Returns the mapped communication address for the given SPINE device address.
     *
     * @param deviceAddress
     *     the device address used in SPINE
     * @return the address used in the communication protocol
     * @throws NoSuchElementException
     *     when no associated address is known
     */
    String getCommunicationAddress(String deviceAddress);

    /**
     * Register an open connection
     *
     * @param connection
     *     the connection that will be registered to be reused
     */
    void registerConnection(SpineConnection connection);

    /**
     * Associates the SPINE device address with the address used in the communication
     * protocol.
     *
     * @param deviceAddress
     *     the device address used in SPINE
     * @param communicationAddress
     *     the address used in the communication protocol
     */
    void addAddressMapping(String deviceAddress, String communicationAddress);

    /**
     * @param address
     *     the address used in the communication protocol, i.e. not the SPINE device
     *     address.
     */
    void removeAddressMapping(String address);

    /**
     * @param address
     *     the address used in the communication protocol, i.e. not the device
     *     address. See getCommunicationAddress.
     */
    void closeConnection(String address);

    String getDeviceAddress(String communicationAddress);
}
