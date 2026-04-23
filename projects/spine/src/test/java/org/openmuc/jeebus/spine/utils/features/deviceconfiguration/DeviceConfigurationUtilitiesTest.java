/********************************************************************************
 * Copyright (c) 2026 Fraunhofer ISE
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 ********************************************************************************/

package org.openmuc.jeebus.spine.utils.features.deviceconfiguration;

import org.junit.jupiter.api.Test;
import org.openmuc.jeebus.spine.api.SpineException;
import org.openmuc.jeebus.spine.xsd.v1.DeviceConfigurationKeyValueTypeType;
import org.openmuc.jeebus.spine.xsd.v1.DeviceConfigurationKeyValueValueType;

import static org.junit.jupiter.api.Assertions.*;

class DeviceConfigurationUtilitiesTest {

    @Test
    void testValidateAndGetValueProperty() throws SpineException {
        DeviceConfigurationKeyValueValueType value
            = new DeviceConfigurationKeyValueValueType();
        assertThrows(
            SpineException.class,
            () -> DeviceConfigurationUtilities.validateAndGetValueProperty(
                value,
                true
            )
        );
        assertNull(DeviceConfigurationUtilities.validateAndGetValueProperty(
            value,
            false
        ));
        value.setBoolean(true);
        assertEquals(
            true, DeviceConfigurationUtilities.validateAndGetValueProperty(
                value,
                true
            )
        );
        value.setInteger(1L);
        assertThrows(
            SpineException.class,
            () -> DeviceConfigurationUtilities.validateAndGetValueProperty(
                value,
                true
            )
        );
        assertThrows(
            SpineException.class,
            () -> DeviceConfigurationUtilities.validateAndGetValueProperty(
                value,
                false
            )
        );
        value.setBoolean(null);
        assertEquals(
            1L, DeviceConfigurationUtilities.validateAndGetValueProperty(
                value,
                false
            )
        );

        assertTrue(
            DeviceConfigurationUtilities.matchesValueType(
                DeviceConfigurationKeyValueTypeType.INTEGER,
                1L
            )
        );

    }
}