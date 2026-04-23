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
 * <p>Java class for IdentificationTypeEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="IdentificationTypeEnumType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="eui48"/&gt;
 *     &lt;enumeration value="eui64"/&gt;
 *     &lt;enumeration value="userRfidTag"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "IdentificationTypeEnumType")
@XmlEnum
public enum IdentificationTypeEnumType {

    @XmlEnumValue("eui48")
    EUI_48("eui48"),
    @XmlEnumValue("eui64")
    EUI_64("eui64"),
    @XmlEnumValue("userRfidTag")
    USER_RFID_TAG("userRfidTag");
    private final String value;

    IdentificationTypeEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IdentificationTypeEnumType fromValue(String v) {
        for (IdentificationTypeEnumType c: IdentificationTypeEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
