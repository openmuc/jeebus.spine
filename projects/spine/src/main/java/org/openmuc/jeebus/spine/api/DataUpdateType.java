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

/**
 * The type for which a listener is called.
 */
public enum DataUpdateType {
    /**
     * A Partial write command, a full write for existent data or a delete command
     * with set ELEMENTS.
     */
    UPDATE_DATA,
    /**
     * A delete write command with SELECTORS (without ELEMENTS) that fully deleted a
     * list entry.
     */
    DELETE_DATA,
    /**
     * A full write adds a new data entry.
     */
    ADD_DATA
}
