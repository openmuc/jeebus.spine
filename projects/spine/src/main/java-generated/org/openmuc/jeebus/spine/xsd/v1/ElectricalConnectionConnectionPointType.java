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
 * <p>Java class for ElectricalConnectionConnectionPointType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ElectricalConnectionConnectionPointType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="grid"/&gt;
 *     &lt;enumeration value="home"/&gt;
 *     &lt;enumeration value="pv"/&gt;
 *     &lt;enumeration value="sd"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ElectricalConnectionConnectionPointType")
@XmlEnum
public enum ElectricalConnectionConnectionPointType {

    @XmlEnumValue("grid")
    GRID("grid"),
    @XmlEnumValue("home")
    HOME("home"),
    @XmlEnumValue("pv")
    PV("pv"),
    @XmlEnumValue("sd")
    SD("sd"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    ElectricalConnectionConnectionPointType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ElectricalConnectionConnectionPointType fromValue(String v) {
        for (ElectricalConnectionConnectionPointType c: ElectricalConnectionConnectionPointType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
