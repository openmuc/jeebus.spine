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
 * <p>Java class for TimeSlotTimeModeEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="TimeSlotTimeModeEnumType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="absolute"/&gt;
 *     &lt;enumeration value="recurring"/&gt;
 *     &lt;enumeration value="both"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TimeSlotTimeModeEnumType")
@XmlEnum
public enum TimeSlotTimeModeEnumType {

    @XmlEnumValue("absolute")
    ABSOLUTE("absolute"),
    @XmlEnumValue("recurring")
    RECURRING("recurring"),
    @XmlEnumValue("both")
    BOTH("both");
    private final String value;

    TimeSlotTimeModeEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TimeSlotTimeModeEnumType fromValue(String v) {
        for (TimeSlotTimeModeEnumType c: TimeSlotTimeModeEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
