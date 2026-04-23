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
 * <p>Java class for PowerSourceEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="PowerSourceEnumType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="mainsSinglePhase"/&gt;
 *     &lt;enumeration value="mains3Phase"/&gt;
 *     &lt;enumeration value="battery"/&gt;
 *     &lt;enumeration value="dc"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PowerSourceEnumType")
@XmlEnum
public enum PowerSourceEnumType {

    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("mainsSinglePhase")
    MAINS_SINGLE_PHASE("mainsSinglePhase"),
    @XmlEnumValue("mains3Phase")
    MAINS_3_PHASE("mains3Phase"),
    @XmlEnumValue("battery")
    BATTERY("battery"),
    @XmlEnumValue("dc")
    DC("dc");
    private final String value;

    PowerSourceEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PowerSourceEnumType fromValue(String v) {
        for (PowerSourceEnumType c: PowerSourceEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
