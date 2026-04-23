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
 * <p>Java class for IncentiveTypeEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="IncentiveTypeEnumType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="absoluteCost"/&gt;
 *     &lt;enumeration value="relativeCost"/&gt;
 *     &lt;enumeration value="renewableEnergyPercentage"/&gt;
 *     &lt;enumeration value="co2Emission"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "IncentiveTypeEnumType")
@XmlEnum
public enum IncentiveTypeEnumType {

    @XmlEnumValue("absoluteCost")
    ABSOLUTE_COST("absoluteCost"),
    @XmlEnumValue("relativeCost")
    RELATIVE_COST("relativeCost"),
    @XmlEnumValue("renewableEnergyPercentage")
    RENEWABLE_ENERGY_PERCENTAGE("renewableEnergyPercentage"),
    @XmlEnumValue("co2Emission")
    CO_2_EMISSION("co2Emission");
    private final String value;

    IncentiveTypeEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IncentiveTypeEnumType fromValue(String v) {
        for (IncentiveTypeEnumType c: IncentiveTypeEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
