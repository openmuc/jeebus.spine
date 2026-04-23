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
 * <p>Java class for HvacOverrunTypeEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="HvacOverrunTypeEnumType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="oneTimeDhw"/&gt;
 *     &lt;enumeration value="party"/&gt;
 *     &lt;enumeration value="sgReadyCondition1"/&gt;
 *     &lt;enumeration value="sgReadyCondition3"/&gt;
 *     &lt;enumeration value="sgReadyCondition4"/&gt;
 *     &lt;enumeration value="oneDayAway"/&gt;
 *     &lt;enumeration value="oneDayAtHome"/&gt;
 *     &lt;enumeration value="oneTimeVentilation"/&gt;
 *     &lt;enumeration value="hvacSystemOff"/&gt;
 *     &lt;enumeration value="valveKick"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "HvacOverrunTypeEnumType")
@XmlEnum
public enum HvacOverrunTypeEnumType {

    @XmlEnumValue("oneTimeDhw")
    ONE_TIME_DHW("oneTimeDhw"),
    @XmlEnumValue("party")
    PARTY("party"),
    @XmlEnumValue("sgReadyCondition1")
    SG_READY_CONDITION_1("sgReadyCondition1"),
    @XmlEnumValue("sgReadyCondition3")
    SG_READY_CONDITION_3("sgReadyCondition3"),
    @XmlEnumValue("sgReadyCondition4")
    SG_READY_CONDITION_4("sgReadyCondition4"),
    @XmlEnumValue("oneDayAway")
    ONE_DAY_AWAY("oneDayAway"),
    @XmlEnumValue("oneDayAtHome")
    ONE_DAY_AT_HOME("oneDayAtHome"),
    @XmlEnumValue("oneTimeVentilation")
    ONE_TIME_VENTILATION("oneTimeVentilation"),
    @XmlEnumValue("hvacSystemOff")
    HVAC_SYSTEM_OFF("hvacSystemOff"),
    @XmlEnumValue("valveKick")
    VALVE_KICK("valveKick");
    private final String value;

    HvacOverrunTypeEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HvacOverrunTypeEnumType fromValue(String v) {
        for (HvacOverrunTypeEnumType c: HvacOverrunTypeEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
