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
 * <p>Java class for ElectricalConnectionPhaseNameEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ElectricalConnectionPhaseNameEnumType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="a"/&gt;
 *     &lt;enumeration value="b"/&gt;
 *     &lt;enumeration value="c"/&gt;
 *     &lt;enumeration value="ab"/&gt;
 *     &lt;enumeration value="bc"/&gt;
 *     &lt;enumeration value="ac"/&gt;
 *     &lt;enumeration value="abc"/&gt;
 *     &lt;enumeration value="neutral"/&gt;
 *     &lt;enumeration value="ground"/&gt;
 *     &lt;enumeration value="none"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ElectricalConnectionPhaseNameEnumType")
@XmlEnum
public enum ElectricalConnectionPhaseNameEnumType {

    @XmlEnumValue("a")
    A("a"),
    @XmlEnumValue("b")
    B("b"),
    @XmlEnumValue("c")
    C("c"),
    @XmlEnumValue("ab")
    AB("ab"),
    @XmlEnumValue("bc")
    BC("bc"),
    @XmlEnumValue("ac")
    AC("ac"),
    @XmlEnumValue("abc")
    ABC("abc"),
    @XmlEnumValue("neutral")
    NEUTRAL("neutral"),
    @XmlEnumValue("ground")
    GROUND("ground"),
    @XmlEnumValue("none")
    NONE("none");
    private final String value;

    ElectricalConnectionPhaseNameEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ElectricalConnectionPhaseNameEnumType fromValue(String v) {
        for (ElectricalConnectionPhaseNameEnumType c: ElectricalConnectionPhaseNameEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
