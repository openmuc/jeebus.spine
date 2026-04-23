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
 * <p>Java class for ActuatorSwitchFctEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ActuatorSwitchFctEnumType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="on"/&gt;
 *     &lt;enumeration value="off"/&gt;
 *     &lt;enumeration value="toggle"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActuatorSwitchFctEnumType")
@XmlEnum
public enum ActuatorSwitchFctEnumType {

    @XmlEnumValue("on")
    ON("on"),
    @XmlEnumValue("off")
    OFF("off"),
    @XmlEnumValue("toggle")
    TOGGLE("toggle");
    private final String value;

    ActuatorSwitchFctEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ActuatorSwitchFctEnumType fromValue(String v) {
        for (ActuatorSwitchFctEnumType c: ActuatorSwitchFctEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
