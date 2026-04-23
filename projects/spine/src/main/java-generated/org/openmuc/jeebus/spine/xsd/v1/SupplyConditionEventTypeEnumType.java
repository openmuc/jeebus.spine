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
 * <p>Java class for SupplyConditionEventTypeEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="SupplyConditionEventTypeEnumType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="thesholdExceeded"/&gt;
 *     &lt;enumeration value="fallenBelowThreshold"/&gt;
 *     &lt;enumeration value="supplyInterrupt"/&gt;
 *     &lt;enumeration value="releaseOfLimitations"/&gt;
 *     &lt;enumeration value="otherProblem"/&gt;
 *     &lt;enumeration value="gridConditionUpdate"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SupplyConditionEventTypeEnumType")
@XmlEnum
public enum SupplyConditionEventTypeEnumType {

    @XmlEnumValue("thesholdExceeded")
    THESHOLD_EXCEEDED("thesholdExceeded"),
    @XmlEnumValue("fallenBelowThreshold")
    FALLEN_BELOW_THRESHOLD("fallenBelowThreshold"),
    @XmlEnumValue("supplyInterrupt")
    SUPPLY_INTERRUPT("supplyInterrupt"),
    @XmlEnumValue("releaseOfLimitations")
    RELEASE_OF_LIMITATIONS("releaseOfLimitations"),
    @XmlEnumValue("otherProblem")
    OTHER_PROBLEM("otherProblem"),
    @XmlEnumValue("gridConditionUpdate")
    GRID_CONDITION_UPDATE("gridConditionUpdate");
    private final String value;

    SupplyConditionEventTypeEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SupplyConditionEventTypeEnumType fromValue(String v) {
        for (SupplyConditionEventTypeEnumType c: SupplyConditionEventTypeEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
