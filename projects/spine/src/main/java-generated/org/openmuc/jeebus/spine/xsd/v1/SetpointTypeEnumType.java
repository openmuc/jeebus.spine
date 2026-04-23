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
 * <p>Java class for SetpointTypeEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="SetpointTypeEnumType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="valueAbsolute"/&gt;
 *     &lt;enumeration value="valueRelative"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SetpointTypeEnumType")
@XmlEnum
public enum SetpointTypeEnumType {

    @XmlEnumValue("valueAbsolute")
    VALUE_ABSOLUTE("valueAbsolute"),
    @XmlEnumValue("valueRelative")
    VALUE_RELATIVE("valueRelative");
    private final String value;

    SetpointTypeEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SetpointTypeEnumType fromValue(String v) {
        for (SetpointTypeEnumType c: SetpointTypeEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
