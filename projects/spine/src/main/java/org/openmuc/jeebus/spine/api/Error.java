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

public enum Error {
    NO_ERROR,
    GENERAL_ERROR,
    TIMEOUT,
    OVERLOAD,
    DESTINATION_UNKNOWN,
    DESTINATION_UNREACHABLE,
    COMMAND_NOT_SUPPORTED,
    COMMAND_REJECTED,
    RESTRICTED_FUNCTION_COMBINATION_UNSUPPORTED,
    BINDING_NECESSARY
}
