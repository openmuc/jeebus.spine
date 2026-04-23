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

import org.openmuc.jeebus.spine.xsd.v1.DatagramType;

public interface SpineConnection {
    /**
     * Sends a message to the connected device
     *
     * @param datagram
     *     message payload
     */
    void sendMessage(DatagramType datagram);

    /**
     * @return the address of the communication partner used in the communication
     * protocol
     */
    String getCommunicationAddress();

    void close();
}
