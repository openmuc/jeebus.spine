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
 * <p>Java class for LoadControlEventActionEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="LoadControlEventActionEnumType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="pause"/&gt;
 *     &lt;enumeration value="resume"/&gt;
 *     &lt;enumeration value="reduce"/&gt;
 *     &lt;enumeration value="increase"/&gt;
 *     &lt;enumeration value="emergency"/&gt;
 *     &lt;enumeration value="normal"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LoadControlEventActionEnumType")
@XmlEnum
public enum LoadControlEventActionEnumType {

    @XmlEnumValue("pause")
    PAUSE("pause"),
    @XmlEnumValue("resume")
    RESUME("resume"),
    @XmlEnumValue("reduce")
    REDUCE("reduce"),
    @XmlEnumValue("increase")
    INCREASE("increase"),
    @XmlEnumValue("emergency")
    EMERGENCY("emergency"),
    @XmlEnumValue("normal")
    NORMAL("normal");
    private final String value;

    LoadControlEventActionEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LoadControlEventActionEnumType fromValue(String v) {
        for (LoadControlEventActionEnumType c: LoadControlEventActionEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
