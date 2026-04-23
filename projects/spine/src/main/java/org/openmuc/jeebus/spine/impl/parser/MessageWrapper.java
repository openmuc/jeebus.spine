/********************************************************************************
 * Copyright (c) 2026 Fraunhofer ISE
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 ********************************************************************************/

package org.openmuc.jeebus.spine.impl.parser;

import org.openmuc.jeebus.spine.xsd.v1.DatagramType;

/**
 * The message which actually get sent over the shipspine connection
 * have the following form:
 * <pre>
 * {
 *   "datagram": [
 *     /* fields of DatagramType &ast;/
 *   ]
 * }
 * </pre>
 *
 * This class corresponds to that outer JSON object.
 */
public class MessageWrapper {
    private DatagramType datagram;

    public MessageWrapper(){}

    public MessageWrapper(DatagramType datagram) {
        this.datagram = datagram;
    }

    public DatagramType getDatagram() {
        return datagram;
    }

    public void setDatagram(DatagramType datagram) {
        this.datagram = datagram;
    }
}
