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
 * <p>Java class for BillCostTypeEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="BillCostTypeEnumType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="absolutePrice"/&gt;
 *     &lt;enumeration value="relativePrice"/&gt;
 *     &lt;enumeration value="co2Emission"/&gt;
 *     &lt;enumeration value="renewableEnergy"/&gt;
 *     &lt;enumeration value="radioactiveWaste"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BillCostTypeEnumType")
@XmlEnum
public enum BillCostTypeEnumType {

    @XmlEnumValue("absolutePrice")
    ABSOLUTE_PRICE("absolutePrice"),
    @XmlEnumValue("relativePrice")
    RELATIVE_PRICE("relativePrice"),
    @XmlEnumValue("co2Emission")
    CO_2_EMISSION("co2Emission"),
    @XmlEnumValue("renewableEnergy")
    RENEWABLE_ENERGY("renewableEnergy"),
    @XmlEnumValue("radioactiveWaste")
    RADIOACTIVE_WASTE("radioactiveWaste");
    private final String value;

    BillCostTypeEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BillCostTypeEnumType fromValue(String v) {
        for (BillCostTypeEnumType c: BillCostTypeEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
