/********************************************************************************
 * Copyright (c) 2026 Fraunhofer ISE
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 ********************************************************************************/

package org.openmuc.jeebus.spine.api.options;

public enum WriteListCmdOption {
    PARTIAL_WRITE_BY_FUNCTION_ID,
    PARTIAL_WRITE_BY_SELECTOR,
    DELETE_BY_SELECTOR,
    DELETE_ELEMENTS,
    DELETE_ELEMENTS_BY_SELECTOR,
    FULL_WRITE
}
