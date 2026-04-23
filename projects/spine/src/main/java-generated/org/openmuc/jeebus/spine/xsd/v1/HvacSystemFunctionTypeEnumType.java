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
 * <p>Java class for HvacSystemFunctionTypeEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="HvacSystemFunctionTypeEnumType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="heating"/&gt;
 *     &lt;enumeration value="cooling"/&gt;
 *     &lt;enumeration value="ventilation"/&gt;
 *     &lt;enumeration value="dhw"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "HvacSystemFunctionTypeEnumType")
@XmlEnum
public enum HvacSystemFunctionTypeEnumType {

    @XmlEnumValue("heating")
    HEATING("heating"),
    @XmlEnumValue("cooling")
    COOLING("cooling"),
    @XmlEnumValue("ventilation")
    VENTILATION("ventilation"),
    @XmlEnumValue("dhw")
    DHW("dhw");
    private final String value;

    HvacSystemFunctionTypeEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HvacSystemFunctionTypeEnumType fromValue(String v) {
        for (HvacSystemFunctionTypeEnumType c: HvacSystemFunctionTypeEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
