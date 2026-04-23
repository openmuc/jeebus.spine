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

import org.openmuc.jeebus.spine.api.DataValidationException;
import org.openmuc.jeebus.spine.xsd.v1.DeviceConfigurationKeyValueTypeType;
import org.openmuc.jeebus.spine.xsd.v1.DeviceConfigurationKeyValueValueType;
import org.openmuc.jeebus.spine.xsd.v1.ScaledNumberType;

import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class DeviceConfigurationUtilities {

    static Object validateAndGetValueProperty(
        DeviceConfigurationKeyValueValueType value,
        boolean failOnMissing
    ) throws DataValidationException {

        List<Object> properties;
        try {
            properties = Arrays.stream(Introspector
                    .getBeanInfo(value.getClass(), Object.class)
                    .getPropertyDescriptors())
                .map(desc -> getValueSafely(desc, value))
                .filter(Objects::nonNull)
                .collect(Collectors.toList());

            if (properties.isEmpty() && failOnMissing) {
                throw new DataValidationException(
                    "DeviceConfigurationKeyValue must have a value set."
                );
            }
            else if (properties.size() > 1) {
                throw new DataValidationException(
                    "A DeviceConfigurationKeyValue SHALL only have one value of type "
                        + "DeviceConfigurationKeyValueValueType.");
            }
        }
        catch (IntrospectionException e) {
            // Should never happen
            throw new RuntimeException(e);
        }

        return properties.isEmpty() ? null : properties.get(0);
    }

    private static Object getValueSafely(
        PropertyDescriptor desc,
        DeviceConfigurationKeyValueValueType value
    ) {
        try {
            return desc.getReadMethod()
                .invoke(value);
        }
        catch (
            IllegalAccessException |
            InvocationTargetException e
        ) {
            // Should never happen
            throw new RuntimeException(e);
        }
    }

    static boolean matchesValueType(
        DeviceConfigurationKeyValueTypeType valueType,
        Object object
    ) {
        if (object == null) {
            return true;
        }
        switch (valueType) {
            case BOOLEAN:
                return object instanceof Boolean;
            case DATE:
            case DATE_TIME:
            case TIME:
                return object instanceof XMLGregorianCalendar;
            case DURATION:
                return object instanceof Duration;
            case STRING:
                return object instanceof String;
            case SCALED_NUMBER:
                return object instanceof ScaledNumberType;
            case INTEGER:
                return object instanceof Long;
        }
        return false;
    }
}
