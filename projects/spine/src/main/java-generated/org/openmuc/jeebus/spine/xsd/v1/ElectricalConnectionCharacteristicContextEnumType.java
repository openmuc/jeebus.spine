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
 * <p>Java class for ElectricalConnectionCharacteristicContextEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ElectricalConnectionCharacteristicContextEnumType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="device"/&gt;
 *     &lt;enumeration value="entity"/&gt;
 *     &lt;enumeration value="inverter"/&gt;
 *     &lt;enumeration value="pvString"/&gt;
 *     &lt;enumeration value="battery"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ElectricalConnectionCharacteristicContextEnumType")
@XmlEnum
public enum ElectricalConnectionCharacteristicContextEnumType {

    @XmlEnumValue("device")
    DEVICE("device"),
    @XmlEnumValue("entity")
    ENTITY("entity"),
    @XmlEnumValue("inverter")
    INVERTER("inverter"),
    @XmlEnumValue("pvString")
    PV_STRING("pvString"),
    @XmlEnumValue("battery")
    BATTERY("battery");
    private final String value;

    ElectricalConnectionCharacteristicContextEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ElectricalConnectionCharacteristicContextEnumType fromValue(String v) {
        for (ElectricalConnectionCharacteristicContextEnumType c: ElectricalConnectionCharacteristicContextEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
