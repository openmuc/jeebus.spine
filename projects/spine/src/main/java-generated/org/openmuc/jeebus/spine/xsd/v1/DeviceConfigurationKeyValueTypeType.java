/********************************************************************************
 * Copyright (c) 2026 Fraunhofer ISE
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 ********************************************************************************/

package org.openmuc.jeebus.spine.xsd.v1;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeviceConfigurationKeyValueTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="DeviceConfigurationKeyValueTypeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="boolean"/&gt;
 *     &lt;enumeration value="date"/&gt;
 *     &lt;enumeration value="dateTime"/&gt;
 *     &lt;enumeration value="duration"/&gt;
 *     &lt;enumeration value="string"/&gt;
 *     &lt;enumeration value="time"/&gt;
 *     &lt;enumeration value="scaledNumber"/&gt;
 *     &lt;enumeration value="integer"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DeviceConfigurationKeyValueTypeType")
@XmlEnum
public enum DeviceConfigurationKeyValueTypeType {

    @XmlEnumValue("boolean")
    BOOLEAN("boolean"),
    @XmlEnumValue("date")
    DATE("date"),
    @XmlEnumValue("dateTime")
    DATE_TIME("dateTime"),
    @XmlEnumValue("duration")
    DURATION("duration"),
    @XmlEnumValue("string")
    STRING("string"),
    @XmlEnumValue("time")
    TIME("time"),
    @XmlEnumValue("scaledNumber")
    SCALED_NUMBER("scaledNumber"),
    @XmlEnumValue("integer")
    INTEGER("integer");
    private final String value;

    DeviceConfigurationKeyValueTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DeviceConfigurationKeyValueTypeType fromValue(String v) {
        for (DeviceConfigurationKeyValueTypeType c: DeviceConfigurationKeyValueTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
