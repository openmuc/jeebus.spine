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
 * <p>Java class for ThresholdTypeEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ThresholdTypeEnumType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="goodAbove"/&gt;
 *     &lt;enumeration value="badAbove"/&gt;
 *     &lt;enumeration value="goodBelow"/&gt;
 *     &lt;enumeration value="badBelow"/&gt;
 *     &lt;enumeration value="minValueThreshold"/&gt;
 *     &lt;enumeration value="maxValueThreshold"/&gt;
 *     &lt;enumeration value="minValueThresholdExtreme"/&gt;
 *     &lt;enumeration value="maxValueThresholdExtreme"/&gt;
 *     &lt;enumeration value="sagThreshold"/&gt;
 *     &lt;enumeration value="swellThreshold"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ThresholdTypeEnumType")
@XmlEnum
public enum ThresholdTypeEnumType {

    @XmlEnumValue("goodAbove")
    GOOD_ABOVE("goodAbove"),
    @XmlEnumValue("badAbove")
    BAD_ABOVE("badAbove"),
    @XmlEnumValue("goodBelow")
    GOOD_BELOW("goodBelow"),
    @XmlEnumValue("badBelow")
    BAD_BELOW("badBelow"),
    @XmlEnumValue("minValueThreshold")
    MIN_VALUE_THRESHOLD("minValueThreshold"),
    @XmlEnumValue("maxValueThreshold")
    MAX_VALUE_THRESHOLD("maxValueThreshold"),
    @XmlEnumValue("minValueThresholdExtreme")
    MIN_VALUE_THRESHOLD_EXTREME("minValueThresholdExtreme"),
    @XmlEnumValue("maxValueThresholdExtreme")
    MAX_VALUE_THRESHOLD_EXTREME("maxValueThresholdExtreme"),
    @XmlEnumValue("sagThreshold")
    SAG_THRESHOLD("sagThreshold"),
    @XmlEnumValue("swellThreshold")
    SWELL_THRESHOLD("swellThreshold");
    private final String value;

    ThresholdTypeEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ThresholdTypeEnumType fromValue(String v) {
        for (ThresholdTypeEnumType c: ThresholdTypeEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
