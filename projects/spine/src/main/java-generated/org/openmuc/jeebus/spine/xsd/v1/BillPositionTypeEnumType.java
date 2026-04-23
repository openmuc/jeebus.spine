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
 * <p>Java class for BillPositionTypeEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="BillPositionTypeEnumType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="gridElectricEnergy"/&gt;
 *     &lt;enumeration value="selfProducedElectricEnergy"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BillPositionTypeEnumType")
@XmlEnum
public enum BillPositionTypeEnumType {

    @XmlEnumValue("gridElectricEnergy")
    GRID_ELECTRIC_ENERGY("gridElectricEnergy"),
    @XmlEnumValue("selfProducedElectricEnergy")
    SELF_PRODUCED_ELECTRIC_ENERGY("selfProducedElectricEnergy");
    private final String value;

    BillPositionTypeEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BillPositionTypeEnumType fromValue(String v) {
        for (BillPositionTypeEnumType c: BillPositionTypeEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
