/********************************************************************************
 * Copyright (c) 2026 Fraunhofer ISE
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 ********************************************************************************/

package org.openmuc.jeebus.spine.impl;

import org.junit.jupiter.api.Test;
import org.openmuc.jeebus.spine.xsd.v1.MeasurementConstraintsDataType;
import org.openmuc.jeebus.spine.xsd.v1.MeasurementDataType;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DataIdDescriptionTest {
    @Test
    public void testValidId() {
        assertDoesNotThrow(() -> new DataIdDescription<>(
            MeasurementConstraintsDataType.class,
            List.of("measurementId")
        ));

        assertDoesNotThrow(() -> new DataIdDescription<>(
            MeasurementDataType.class,
            List.of("measurementId"),
            List.of("timestamp")
        ));
    }

    @Test
    public void testInvalidId() {
        assertThrows(
            IllegalArgumentException.class,
            () -> new DataIdDescription<>(
                MeasurementConstraintsDataType.class,
                List.of("someWrongName")
            )
        );
    }
}