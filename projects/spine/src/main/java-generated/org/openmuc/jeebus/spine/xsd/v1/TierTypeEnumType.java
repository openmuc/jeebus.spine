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
 * <p>Java class for TierTypeEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="TierTypeEnumType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="fixedCost"/&gt;
 *     &lt;enumeration value="dynamicCost"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TierTypeEnumType")
@XmlEnum
public enum TierTypeEnumType {

    @XmlEnumValue("fixedCost")
    FIXED_COST("fixedCost"),
    @XmlEnumValue("dynamicCost")
    DYNAMIC_COST("dynamicCost");
    private final String value;

    TierTypeEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TierTypeEnumType fromValue(String v) {
        for (TierTypeEnumType c: TierTypeEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
