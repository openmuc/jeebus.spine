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
 * <p>Java class for FeatureMeasurementSpecificUsageEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="FeatureMeasurementSpecificUsageEnumType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Contact"/&gt;
 *     &lt;enumeration value="Electrical"/&gt;
 *     &lt;enumeration value="Heat"/&gt;
 *     &lt;enumeration value="Level"/&gt;
 *     &lt;enumeration value="Pressure"/&gt;
 *     &lt;enumeration value="Temperature"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FeatureMeasurementSpecificUsageEnumType")
@XmlEnum
public enum FeatureMeasurementSpecificUsageEnumType {

    @XmlEnumValue("Contact")
    CONTACT("Contact"),
    @XmlEnumValue("Electrical")
    ELECTRICAL("Electrical"),
    @XmlEnumValue("Heat")
    HEAT("Heat"),
    @XmlEnumValue("Level")
    LEVEL("Level"),
    @XmlEnumValue("Pressure")
    PRESSURE("Pressure"),
    @XmlEnumValue("Temperature")
    TEMPERATURE("Temperature");
    private final String value;

    FeatureMeasurementSpecificUsageEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FeatureMeasurementSpecificUsageEnumType fromValue(String v) {
        for (FeatureMeasurementSpecificUsageEnumType c: FeatureMeasurementSpecificUsageEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
