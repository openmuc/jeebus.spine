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
 * <p>Java class for MeasurementValueSourceEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="MeasurementValueSourceEnumType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="measuredValue"/&gt;
 *     &lt;enumeration value="calculatedValue"/&gt;
 *     &lt;enumeration value="empiricalValue"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MeasurementValueSourceEnumType")
@XmlEnum
public enum MeasurementValueSourceEnumType {

    @XmlEnumValue("measuredValue")
    MEASURED_VALUE("measuredValue"),
    @XmlEnumValue("calculatedValue")
    CALCULATED_VALUE("calculatedValue"),
    @XmlEnumValue("empiricalValue")
    EMPIRICAL_VALUE("empiricalValue");
    private final String value;

    MeasurementValueSourceEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MeasurementValueSourceEnumType fromValue(String v) {
        for (MeasurementValueSourceEnumType c: MeasurementValueSourceEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
