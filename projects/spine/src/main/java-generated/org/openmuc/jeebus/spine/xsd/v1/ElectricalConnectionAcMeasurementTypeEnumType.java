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
 * <p>Java class for ElectricalConnectionAcMeasurementTypeEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ElectricalConnectionAcMeasurementTypeEnumType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="real"/&gt;
 *     &lt;enumeration value="reactive"/&gt;
 *     &lt;enumeration value="apparent"/&gt;
 *     &lt;enumeration value="phase"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ElectricalConnectionAcMeasurementTypeEnumType")
@XmlEnum
public enum ElectricalConnectionAcMeasurementTypeEnumType {

    @XmlEnumValue("real")
    REAL("real"),
    @XmlEnumValue("reactive")
    REACTIVE("reactive"),
    @XmlEnumValue("apparent")
    APPARENT("apparent"),
    @XmlEnumValue("phase")
    PHASE("phase");
    private final String value;

    ElectricalConnectionAcMeasurementTypeEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ElectricalConnectionAcMeasurementTypeEnumType fromValue(String v) {
        for (ElectricalConnectionAcMeasurementTypeEnumType c: ElectricalConnectionAcMeasurementTypeEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
