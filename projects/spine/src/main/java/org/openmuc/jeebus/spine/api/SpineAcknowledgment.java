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

public class SpineAcknowledgment {
    private final Error error;
    private final String description;

    public SpineAcknowledgment(Error error, String description) {
        this.error = error;
        this.description = description;
    }

    public SpineAcknowledgment(Error error) {
        this.error = error;
        this.description = null;
    }

    public SpineException getThrowable() {
        return new SpineException(error, description);
    }

    /**
     * @param header
     *     the header of the acknowledgement message with all details set (e.g.
     *     msgCounter, msgCounterReference, etc.)
     * @return the acknowledgement as a <code>DatagramType</code>
     */
    public DatagramType getDatagram(HeaderType header) {
        DatagramType datagram = new DatagramType();
        datagram.setHeader(header);

        PayloadType payload = new PayloadType();
        CmdType cmd = new CmdType();
        ResultDataType resultData = new ResultDataType();
        resultData.setErrorNumber((long) error.ordinal());
        if (description != null && !description.isEmpty()) {
            resultData.setDescription(description);
        }
        cmd.setResultData(resultData);
        payload.getCmd().add(cmd);
        datagram.setPayload(payload);

        return datagram;
    }

    /**
     * @return true if the acknowledgment is positive, i.e. success was reported
     */
    public boolean isPositive() {
        return error.equals(Error.NO_ERROR);
    }

}
