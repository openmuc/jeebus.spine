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

import org.openmuc.jeebus.spine.xsd.v1.*;

public interface RequestResult {
    /**
     * Returns the complete datagram the request was answered with.
     *
     * @return the answered request datagram
     */
    DatagramType getDatagram();

    /**
     * Returns the cmd part of the datagram the request was answered with.
     *
     * @return the cmd part of the datagram answer
     */
    CmdType getCmd();

    /**
     * Returns the address of the sender who answered the request. This is equivalent
     * to {@link HeaderType#getAddressSource()}
     *
     * @return the address of the sender of the answer
     */
    FeatureAddressType getSenderAddress();

    /**
     * Returns the result data of the request. This is equivalent to
     * {@link CmdType#getResultData()}
     *
     * @return the result data of the request
     */
     ResultDataType getResultData();
}
