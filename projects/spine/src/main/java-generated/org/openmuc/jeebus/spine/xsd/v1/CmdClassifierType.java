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
 * <p>Java class for CmdClassifierType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="CmdClassifierType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="read"/&gt;
 *     &lt;enumeration value="reply"/&gt;
 *     &lt;enumeration value="notify"/&gt;
 *     &lt;enumeration value="write"/&gt;
 *     &lt;enumeration value="call"/&gt;
 *     &lt;enumeration value="result"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CmdClassifierType")
@XmlEnum
public enum CmdClassifierType {

    @XmlEnumValue("read")
    READ("read"),
    @XmlEnumValue("reply")
    REPLY("reply"),
    @XmlEnumValue("notify")
    NOTIFY("notify"),
    @XmlEnumValue("write")
    WRITE("write"),
    @XmlEnumValue("call")
    CALL("call"),
    @XmlEnumValue("result")
    RESULT("result");
    private final String value;

    CmdClassifierType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CmdClassifierType fromValue(String v) {
        for (CmdClassifierType c: CmdClassifierType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
