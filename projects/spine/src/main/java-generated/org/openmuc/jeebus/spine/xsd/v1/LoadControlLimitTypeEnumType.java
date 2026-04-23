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
 * <p>Java class for LoadControlLimitTypeEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="LoadControlLimitTypeEnumType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="minValueLimit"/&gt;
 *     &lt;enumeration value="maxValueLimit"/&gt;
 *     &lt;enumeration value="signDependentAbsValueLimit"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LoadControlLimitTypeEnumType")
@XmlEnum
public enum LoadControlLimitTypeEnumType {

    @XmlEnumValue("minValueLimit")
    MIN_VALUE_LIMIT("minValueLimit"),
    @XmlEnumValue("maxValueLimit")
    MAX_VALUE_LIMIT("maxValueLimit"),
    @XmlEnumValue("signDependentAbsValueLimit")
    SIGN_DEPENDENT_ABS_VALUE_LIMIT("signDependentAbsValueLimit");
    private final String value;

    LoadControlLimitTypeEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LoadControlLimitTypeEnumType fromValue(String v) {
        for (LoadControlLimitTypeEnumType c: LoadControlLimitTypeEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
