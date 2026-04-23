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
 * <p>Java class for LoadControlEventStateEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="LoadControlEventStateEnumType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="eventAccepted"/&gt;
 *     &lt;enumeration value="eventStarted"/&gt;
 *     &lt;enumeration value="eventStopped"/&gt;
 *     &lt;enumeration value="eventRejected"/&gt;
 *     &lt;enumeration value="eventCancelled"/&gt;
 *     &lt;enumeration value="eventError"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LoadControlEventStateEnumType")
@XmlEnum
public enum LoadControlEventStateEnumType {

    @XmlEnumValue("eventAccepted")
    EVENT_ACCEPTED("eventAccepted"),
    @XmlEnumValue("eventStarted")
    EVENT_STARTED("eventStarted"),
    @XmlEnumValue("eventStopped")
    EVENT_STOPPED("eventStopped"),
    @XmlEnumValue("eventRejected")
    EVENT_REJECTED("eventRejected"),
    @XmlEnumValue("eventCancelled")
    EVENT_CANCELLED("eventCancelled"),
    @XmlEnumValue("eventError")
    EVENT_ERROR("eventError");
    private final String value;

    LoadControlEventStateEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LoadControlEventStateEnumType fromValue(String v) {
        for (LoadControlEventStateEnumType c: LoadControlEventStateEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
