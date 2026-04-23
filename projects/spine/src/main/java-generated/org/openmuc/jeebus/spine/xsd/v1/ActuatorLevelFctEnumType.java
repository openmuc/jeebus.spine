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
 * <p>Java class for ActuatorLevelFctEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ActuatorLevelFctEnumType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="start"/&gt;
 *     &lt;enumeration value="up"/&gt;
 *     &lt;enumeration value="down"/&gt;
 *     &lt;enumeration value="stop"/&gt;
 *     &lt;enumeration value="percentageAbsolute"/&gt;
 *     &lt;enumeration value="percentageRelative"/&gt;
 *     &lt;enumeration value="absolute"/&gt;
 *     &lt;enumeration value="relative"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActuatorLevelFctEnumType")
@XmlEnum
public enum ActuatorLevelFctEnumType {

    @XmlEnumValue("start")
    START("start"),
    @XmlEnumValue("up")
    UP("up"),
    @XmlEnumValue("down")
    DOWN("down"),
    @XmlEnumValue("stop")
    STOP("stop"),
    @XmlEnumValue("percentageAbsolute")
    PERCENTAGE_ABSOLUTE("percentageAbsolute"),
    @XmlEnumValue("percentageRelative")
    PERCENTAGE_RELATIVE("percentageRelative"),
    @XmlEnumValue("absolute")
    ABSOLUTE("absolute"),
    @XmlEnumValue("relative")
    RELATIVE("relative");
    private final String value;

    ActuatorLevelFctEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ActuatorLevelFctEnumType fromValue(String v) {
        for (ActuatorLevelFctEnumType c: ActuatorLevelFctEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
