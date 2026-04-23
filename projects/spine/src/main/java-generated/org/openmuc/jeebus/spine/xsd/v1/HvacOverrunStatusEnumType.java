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
 * <p>Java class for HvacOverrunStatusEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="HvacOverrunStatusEnumType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="active"/&gt;
 *     &lt;enumeration value="running"/&gt;
 *     &lt;enumeration value="finished"/&gt;
 *     &lt;enumeration value="inactive"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "HvacOverrunStatusEnumType")
@XmlEnum
public enum HvacOverrunStatusEnumType {

    @XmlEnumValue("active")
    ACTIVE("active"),
    @XmlEnumValue("running")
    RUNNING("running"),
    @XmlEnumValue("finished")
    FINISHED("finished"),
    @XmlEnumValue("inactive")
    INACTIVE("inactive");
    private final String value;

    HvacOverrunStatusEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HvacOverrunStatusEnumType fromValue(String v) {
        for (HvacOverrunStatusEnumType c: HvacOverrunStatusEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
