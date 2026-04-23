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
 * <p>Java class for PowerTimeSlotValueTypeEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="PowerTimeSlotValueTypeEnumType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="power"/&gt;
 *     &lt;enumeration value="powerMin"/&gt;
 *     &lt;enumeration value="powerMax"/&gt;
 *     &lt;enumeration value="powerExpectedValue"/&gt;
 *     &lt;enumeration value="powerStandardDeviation"/&gt;
 *     &lt;enumeration value="powerSkewness"/&gt;
 *     &lt;enumeration value="energy"/&gt;
 *     &lt;enumeration value="energyMin"/&gt;
 *     &lt;enumeration value="energyMax"/&gt;
 *     &lt;enumeration value="energyExpectedValue"/&gt;
 *     &lt;enumeration value="energyStandardDeviation"/&gt;
 *     &lt;enumeration value="energySkewness"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PowerTimeSlotValueTypeEnumType")
@XmlEnum
public enum PowerTimeSlotValueTypeEnumType {

    @XmlEnumValue("power")
    POWER("power"),
    @XmlEnumValue("powerMin")
    POWER_MIN("powerMin"),
    @XmlEnumValue("powerMax")
    POWER_MAX("powerMax"),
    @XmlEnumValue("powerExpectedValue")
    POWER_EXPECTED_VALUE("powerExpectedValue"),
    @XmlEnumValue("powerStandardDeviation")
    POWER_STANDARD_DEVIATION("powerStandardDeviation"),
    @XmlEnumValue("powerSkewness")
    POWER_SKEWNESS("powerSkewness"),
    @XmlEnumValue("energy")
    ENERGY("energy"),
    @XmlEnumValue("energyMin")
    ENERGY_MIN("energyMin"),
    @XmlEnumValue("energyMax")
    ENERGY_MAX("energyMax"),
    @XmlEnumValue("energyExpectedValue")
    ENERGY_EXPECTED_VALUE("energyExpectedValue"),
    @XmlEnumValue("energyStandardDeviation")
    ENERGY_STANDARD_DEVIATION("energyStandardDeviation"),
    @XmlEnumValue("energySkewness")
    ENERGY_SKEWNESS("energySkewness");
    private final String value;

    PowerTimeSlotValueTypeEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PowerTimeSlotValueTypeEnumType fromValue(String v) {
        for (PowerTimeSlotValueTypeEnumType c: PowerTimeSlotValueTypeEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
