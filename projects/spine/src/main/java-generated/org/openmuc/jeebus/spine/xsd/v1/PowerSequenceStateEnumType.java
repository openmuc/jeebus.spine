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
 * <p>Java class for PowerSequenceStateEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="PowerSequenceStateEnumType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="running"/&gt;
 *     &lt;enumeration value="paused"/&gt;
 *     &lt;enumeration value="scheduled"/&gt;
 *     &lt;enumeration value="scheduledPaused"/&gt;
 *     &lt;enumeration value="pending"/&gt;
 *     &lt;enumeration value="inactive"/&gt;
 *     &lt;enumeration value="completed"/&gt;
 *     &lt;enumeration value="invalid"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PowerSequenceStateEnumType")
@XmlEnum
public enum PowerSequenceStateEnumType {

    @XmlEnumValue("running")
    RUNNING("running"),
    @XmlEnumValue("paused")
    PAUSED("paused"),
    @XmlEnumValue("scheduled")
    SCHEDULED("scheduled"),
    @XmlEnumValue("scheduledPaused")
    SCHEDULED_PAUSED("scheduledPaused"),
    @XmlEnumValue("pending")
    PENDING("pending"),
    @XmlEnumValue("inactive")
    INACTIVE("inactive"),
    @XmlEnumValue("completed")
    COMPLETED("completed"),
    @XmlEnumValue("invalid")
    INVALID("invalid");
    private final String value;

    PowerSequenceStateEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PowerSequenceStateEnumType fromValue(String v) {
        for (PowerSequenceStateEnumType c: PowerSequenceStateEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
