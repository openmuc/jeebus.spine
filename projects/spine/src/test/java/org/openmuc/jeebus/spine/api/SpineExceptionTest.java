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

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SpineExceptionTest {

    @Test
    void testGetMessage() {
        SpineException exception = new SpineException(
            Error.COMMAND_REJECTED,
            "You're not my supervisor!"
        );

        assertEquals(
            "Error Number 7 (COMMAND_REJECTED): You're not my supervisor!",
            exception.getMessage()
        );
    }

    @Test
    void testFromAcknowledgement() {
        SpineException exception = new SpineAcknowledgment(
            Error.COMMAND_REJECTED,
            "You're not my supervisor!"
        ).getThrowable();

        assertEquals(
            "Error Number 7 (COMMAND_REJECTED): You're not my supervisor!",
            exception.getMessage()
        );
    }

    @Test
    void testRoundtrip() {
        SpineException exception = new SpineException(
            Error.COMMAND_REJECTED,
            "You're not my supervisor!"
        ).getAcknowledgment().getThrowable();

        assertEquals(
            "Error Number 7 (COMMAND_REJECTED): You're not my supervisor!",
            exception.getMessage()
        );
    }

}