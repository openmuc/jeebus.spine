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
 * <p>Java class for LoadControlCategoryEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="LoadControlCategoryEnumType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="obligation"/&gt;
 *     &lt;enumeration value="recommendation"/&gt;
 *     &lt;enumeration value="optimization"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LoadControlCategoryEnumType")
@XmlEnum
public enum LoadControlCategoryEnumType {

    @XmlEnumValue("obligation")
    OBLIGATION("obligation"),
    @XmlEnumValue("recommendation")
    RECOMMENDATION("recommendation"),
    @XmlEnumValue("optimization")
    OPTIMIZATION("optimization");
    private final String value;

    LoadControlCategoryEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LoadControlCategoryEnumType fromValue(String v) {
        for (LoadControlCategoryEnumType c: LoadControlCategoryEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
