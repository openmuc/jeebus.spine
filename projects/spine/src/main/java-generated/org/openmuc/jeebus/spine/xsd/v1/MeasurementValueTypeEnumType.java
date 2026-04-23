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
 * <p>Java class for MeasurementValueTypeEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="MeasurementValueTypeEnumType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="value"/&gt;
 *     &lt;enumeration value="averageValue"/&gt;
 *     &lt;enumeration value="minValue"/&gt;
 *     &lt;enumeration value="maxValue"/&gt;
 *     &lt;enumeration value="standardDeviation"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MeasurementValueTypeEnumType")
@XmlEnum
public enum MeasurementValueTypeEnumType {

    @XmlEnumValue("value")
    VALUE("value"),
    @XmlEnumValue("averageValue")
    AVERAGE_VALUE("averageValue"),
    @XmlEnumValue("minValue")
    MIN_VALUE("minValue"),
    @XmlEnumValue("maxValue")
    MAX_VALUE("maxValue"),
    @XmlEnumValue("standardDeviation")
    STANDARD_DEVIATION("standardDeviation");
    private final String value;

    MeasurementValueTypeEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MeasurementValueTypeEnumType fromValue(String v) {
        for (MeasurementValueTypeEnumType c: MeasurementValueTypeEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
