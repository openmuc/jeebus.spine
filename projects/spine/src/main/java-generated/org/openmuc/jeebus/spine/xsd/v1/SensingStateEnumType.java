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
 * <p>Java class for SensingStateEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="SensingStateEnumType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="on"/&gt;
 *     &lt;enumeration value="off"/&gt;
 *     &lt;enumeration value="toggle"/&gt;
 *     &lt;enumeration value="level"/&gt;
 *     &lt;enumeration value="levelUp"/&gt;
 *     &lt;enumeration value="levelDown"/&gt;
 *     &lt;enumeration value="levelStart"/&gt;
 *     &lt;enumeration value="levelStop"/&gt;
 *     &lt;enumeration value="levelAbsolute"/&gt;
 *     &lt;enumeration value="levelRelative"/&gt;
 *     &lt;enumeration value="levelPercentageAbsolute"/&gt;
 *     &lt;enumeration value="levelPercentageRelative"/&gt;
 *     &lt;enumeration value="pressed"/&gt;
 *     &lt;enumeration value="longPressed"/&gt;
 *     &lt;enumeration value="released"/&gt;
 *     &lt;enumeration value="changed"/&gt;
 *     &lt;enumeration value="started"/&gt;
 *     &lt;enumeration value="stopped"/&gt;
 *     &lt;enumeration value="paused"/&gt;
 *     &lt;enumeration value="middle"/&gt;
 *     &lt;enumeration value="up"/&gt;
 *     &lt;enumeration value="down"/&gt;
 *     &lt;enumeration value="forward"/&gt;
 *     &lt;enumeration value="backwards"/&gt;
 *     &lt;enumeration value="open"/&gt;
 *     &lt;enumeration value="closed"/&gt;
 *     &lt;enumeration value="opening"/&gt;
 *     &lt;enumeration value="closing"/&gt;
 *     &lt;enumeration value="high"/&gt;
 *     &lt;enumeration value="low"/&gt;
 *     &lt;enumeration value="day"/&gt;
 *     &lt;enumeration value="night"/&gt;
 *     &lt;enumeration value="detected"/&gt;
 *     &lt;enumeration value="notDetected"/&gt;
 *     &lt;enumeration value="alarmed"/&gt;
 *     &lt;enumeration value="notAlarmed"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SensingStateEnumType")
@XmlEnum
public enum SensingStateEnumType {

    @XmlEnumValue("on")
    ON("on"),
    @XmlEnumValue("off")
    OFF("off"),
    @XmlEnumValue("toggle")
    TOGGLE("toggle"),
    @XmlEnumValue("level")
    LEVEL("level"),
    @XmlEnumValue("levelUp")
    LEVEL_UP("levelUp"),
    @XmlEnumValue("levelDown")
    LEVEL_DOWN("levelDown"),
    @XmlEnumValue("levelStart")
    LEVEL_START("levelStart"),
    @XmlEnumValue("levelStop")
    LEVEL_STOP("levelStop"),
    @XmlEnumValue("levelAbsolute")
    LEVEL_ABSOLUTE("levelAbsolute"),
    @XmlEnumValue("levelRelative")
    LEVEL_RELATIVE("levelRelative"),
    @XmlEnumValue("levelPercentageAbsolute")
    LEVEL_PERCENTAGE_ABSOLUTE("levelPercentageAbsolute"),
    @XmlEnumValue("levelPercentageRelative")
    LEVEL_PERCENTAGE_RELATIVE("levelPercentageRelative"),
    @XmlEnumValue("pressed")
    PRESSED("pressed"),
    @XmlEnumValue("longPressed")
    LONG_PRESSED("longPressed"),
    @XmlEnumValue("released")
    RELEASED("released"),
    @XmlEnumValue("changed")
    CHANGED("changed"),
    @XmlEnumValue("started")
    STARTED("started"),
    @XmlEnumValue("stopped")
    STOPPED("stopped"),
    @XmlEnumValue("paused")
    PAUSED("paused"),
    @XmlEnumValue("middle")
    MIDDLE("middle"),
    @XmlEnumValue("up")
    UP("up"),
    @XmlEnumValue("down")
    DOWN("down"),
    @XmlEnumValue("forward")
    FORWARD("forward"),
    @XmlEnumValue("backwards")
    BACKWARDS("backwards"),
    @XmlEnumValue("open")
    OPEN("open"),
    @XmlEnumValue("closed")
    CLOSED("closed"),
    @XmlEnumValue("opening")
    OPENING("opening"),
    @XmlEnumValue("closing")
    CLOSING("closing"),
    @XmlEnumValue("high")
    HIGH("high"),
    @XmlEnumValue("low")
    LOW("low"),
    @XmlEnumValue("day")
    DAY("day"),
    @XmlEnumValue("night")
    NIGHT("night"),
    @XmlEnumValue("detected")
    DETECTED("detected"),
    @XmlEnumValue("notDetected")
    NOT_DETECTED("notDetected"),
    @XmlEnumValue("alarmed")
    ALARMED("alarmed"),
    @XmlEnumValue("notAlarmed")
    NOT_ALARMED("notAlarmed");
    private final String value;

    SensingStateEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SensingStateEnumType fromValue(String v) {
        for (SensingStateEnumType c: SensingStateEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
