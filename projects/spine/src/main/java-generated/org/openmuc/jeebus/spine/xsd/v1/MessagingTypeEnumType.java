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
 * <p>Java class for MessagingTypeEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="MessagingTypeEnumType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="logging"/&gt;
 *     &lt;enumeration value="information"/&gt;
 *     &lt;enumeration value="warning"/&gt;
 *     &lt;enumeration value="alarm"/&gt;
 *     &lt;enumeration value="emergency"/&gt;
 *     &lt;enumeration value="obsolete"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MessagingTypeEnumType")
@XmlEnum
public enum MessagingTypeEnumType {

    @XmlEnumValue("logging")
    LOGGING("logging"),
    @XmlEnumValue("information")
    INFORMATION("information"),
    @XmlEnumValue("warning")
    WARNING("warning"),
    @XmlEnumValue("alarm")
    ALARM("alarm"),
    @XmlEnumValue("emergency")
    EMERGENCY("emergency"),
    @XmlEnumValue("obsolete")
    OBSOLETE("obsolete");
    private final String value;

    MessagingTypeEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MessagingTypeEnumType fromValue(String v) {
        for (MessagingTypeEnumType c: MessagingTypeEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
