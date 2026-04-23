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
 * <p>Java class for GridConditionEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="GridConditionEnumType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="consumptionRed"/&gt;
 *     &lt;enumeration value="consumptionYellow"/&gt;
 *     &lt;enumeration value="good"/&gt;
 *     &lt;enumeration value="productionYellow"/&gt;
 *     &lt;enumeration value="productionRed"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GridConditionEnumType")
@XmlEnum
public enum GridConditionEnumType {

    @XmlEnumValue("consumptionRed")
    CONSUMPTION_RED("consumptionRed"),
    @XmlEnumValue("consumptionYellow")
    CONSUMPTION_YELLOW("consumptionYellow"),
    @XmlEnumValue("good")
    GOOD("good"),
    @XmlEnumValue("productionYellow")
    PRODUCTION_YELLOW("productionYellow"),
    @XmlEnumValue("productionRed")
    PRODUCTION_RED("productionRed");
    private final String value;

    GridConditionEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GridConditionEnumType fromValue(String v) {
        for (GridConditionEnumType c: GridConditionEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
