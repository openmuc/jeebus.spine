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
 * <p>Java class for PowerSupplyConditionEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="PowerSupplyConditionEnumType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="good"/&gt;
 *     &lt;enumeration value="low"/&gt;
 *     &lt;enumeration value="critical"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="error"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PowerSupplyConditionEnumType")
@XmlEnum
public enum PowerSupplyConditionEnumType {

    @XmlEnumValue("good")
    GOOD("good"),
    @XmlEnumValue("low")
    LOW("low"),
    @XmlEnumValue("critical")
    CRITICAL("critical"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("error")
    ERROR("error");
    private final String value;

    PowerSupplyConditionEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PowerSupplyConditionEnumType fromValue(String v) {
        for (PowerSupplyConditionEnumType c: PowerSupplyConditionEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
