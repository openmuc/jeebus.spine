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
 * <p>Java class for TaskManagementJobSourceEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="TaskManagementJobSourceEnumType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="internalMechanism"/&gt;
 *     &lt;enumeration value="userInteraction"/&gt;
 *     &lt;enumeration value="externalConfiguration"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TaskManagementJobSourceEnumType")
@XmlEnum
public enum TaskManagementJobSourceEnumType {

    @XmlEnumValue("internalMechanism")
    INTERNAL_MECHANISM("internalMechanism"),
    @XmlEnumValue("userInteraction")
    USER_INTERACTION("userInteraction"),
    @XmlEnumValue("externalConfiguration")
    EXTERNAL_CONFIGURATION("externalConfiguration");
    private final String value;

    TaskManagementJobSourceEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TaskManagementJobSourceEnumType fromValue(String v) {
        for (TaskManagementJobSourceEnumType c: TaskManagementJobSourceEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
