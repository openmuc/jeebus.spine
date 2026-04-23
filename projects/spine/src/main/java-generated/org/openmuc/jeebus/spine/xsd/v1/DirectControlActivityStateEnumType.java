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
 * <p>Java class for DirectControlActivityStateEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="DirectControlActivityStateEnumType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="running"/&gt;
 *     &lt;enumeration value="paused"/&gt;
 *     &lt;enumeration value="inactive"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DirectControlActivityStateEnumType")
@XmlEnum
public enum DirectControlActivityStateEnumType {

    @XmlEnumValue("running")
    RUNNING("running"),
    @XmlEnumValue("paused")
    PAUSED("paused"),
    @XmlEnumValue("inactive")
    INACTIVE("inactive");
    private final String value;

    DirectControlActivityStateEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DirectControlActivityStateEnumType fromValue(String v) {
        for (DirectControlActivityStateEnumType c: DirectControlActivityStateEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
