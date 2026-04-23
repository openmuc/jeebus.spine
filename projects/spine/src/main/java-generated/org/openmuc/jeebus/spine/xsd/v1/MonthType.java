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
 * <p>Java class for MonthType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="MonthType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="january"/&gt;
 *     &lt;enumeration value="february"/&gt;
 *     &lt;enumeration value="march"/&gt;
 *     &lt;enumeration value="april"/&gt;
 *     &lt;enumeration value="may"/&gt;
 *     &lt;enumeration value="june"/&gt;
 *     &lt;enumeration value="july"/&gt;
 *     &lt;enumeration value="august"/&gt;
 *     &lt;enumeration value="september"/&gt;
 *     &lt;enumeration value="october"/&gt;
 *     &lt;enumeration value="november"/&gt;
 *     &lt;enumeration value="december"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MonthType")
@XmlEnum
public enum MonthType {

    @XmlEnumValue("january")
    JANUARY("january"),
    @XmlEnumValue("february")
    FEBRUARY("february"),
    @XmlEnumValue("march")
    MARCH("march"),
    @XmlEnumValue("april")
    APRIL("april"),
    @XmlEnumValue("may")
    MAY("may"),
    @XmlEnumValue("june")
    JUNE("june"),
    @XmlEnumValue("july")
    JULY("july"),
    @XmlEnumValue("august")
    AUGUST("august"),
    @XmlEnumValue("september")
    SEPTEMBER("september"),
    @XmlEnumValue("october")
    OCTOBER("october"),
    @XmlEnumValue("november")
    NOVEMBER("november"),
    @XmlEnumValue("december")
    DECEMBER("december");
    private final String value;

    MonthType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MonthType fromValue(String v) {
        for (MonthType c: MonthType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
