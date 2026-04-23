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

import org.openmuc.jeebus.spine.xsd.v1.CmdType;
import org.openmuc.jeebus.spine.xsd.v1.ResultDataType;

public class SpineException extends Exception {
    private final Error error;
    private final String description;

    public SpineException(Error error, String message, Throwable cause) {
        super(formatMessage(error, message), cause);
        this.description = message;
        this.error = error;
    }

    public SpineException(Error error, String message) {
        super(formatMessage(error, message));
        this.description = message;
        this.error = error;
    }

    public SpineAcknowledgment getAcknowledgment() {
        return new SpineAcknowledgment(error, description);
    }

    private CmdType getCmd() {
        CmdType cmd = new CmdType();
        ResultDataType resultData = new ResultDataType();
        resultData.setErrorNumber((long) error.ordinal());
        resultData.setDescription(getMessage());
        cmd.setResultData(resultData);
        return cmd;
    }

    public Error getError() {
        return error;
    }

    private static String formatMessage(Error error, String message) {
        return String.format(
            "Error Number %s (%s): %s",
            error.ordinal(),
            error.name(),
            message
        );
    }

}
