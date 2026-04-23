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
 * <p>Java class for ElectricalConnectionMeasurandVariantEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ElectricalConnectionMeasurandVariantEnumType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="amplitude"/&gt;
 *     &lt;enumeration value="rms"/&gt;
 *     &lt;enumeration value="instantaneous"/&gt;
 *     &lt;enumeration value="angle"/&gt;
 *     &lt;enumeration value="cosPhi"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ElectricalConnectionMeasurandVariantEnumType")
@XmlEnum
public enum ElectricalConnectionMeasurandVariantEnumType {

    @XmlEnumValue("amplitude")
    AMPLITUDE("amplitude"),
    @XmlEnumValue("rms")
    RMS("rms"),
    @XmlEnumValue("instantaneous")
    INSTANTANEOUS("instantaneous"),
    @XmlEnumValue("angle")
    ANGLE("angle"),
    @XmlEnumValue("cosPhi")
    COS_PHI("cosPhi");
    private final String value;

    ElectricalConnectionMeasurandVariantEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ElectricalConnectionMeasurandVariantEnumType fromValue(String v) {
        for (ElectricalConnectionMeasurandVariantEnumType c: ElectricalConnectionMeasurandVariantEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
