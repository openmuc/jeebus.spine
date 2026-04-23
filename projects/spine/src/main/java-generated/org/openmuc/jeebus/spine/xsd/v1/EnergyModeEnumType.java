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
 * <p>Java class for EnergyModeEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="EnergyModeEnumType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="consume"/&gt;
 *     &lt;enumeration value="produce"/&gt;
 *     &lt;enumeration value="idle"/&gt;
 *     &lt;enumeration value="auto"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EnergyModeEnumType")
@XmlEnum
public enum EnergyModeEnumType {

    @XmlEnumValue("consume")
    CONSUME("consume"),
    @XmlEnumValue("produce")
    PRODUCE("produce"),
    @XmlEnumValue("idle")
    IDLE("idle"),
    @XmlEnumValue("auto")
    AUTO("auto");
    private final String value;

    EnergyModeEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnergyModeEnumType fromValue(String v) {
        for (EnergyModeEnumType c: EnergyModeEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
