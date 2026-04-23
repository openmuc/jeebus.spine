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

public class DataValidationException extends SpineException {
    public DataValidationException(String message) {
        super(Error.COMMAND_REJECTED, message);
    }

    public DataValidationException(String message, Throwable cause) {
        super(Error.COMMAND_REJECTED, message, cause);
    }
}
