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
 * <p>Java class for SensingTypeEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="SensingTypeEnumType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="switch"/&gt;
 *     &lt;enumeration value="button"/&gt;
 *     &lt;enumeration value="level"/&gt;
 *     &lt;enumeration value="levelSwitch"/&gt;
 *     &lt;enumeration value="windowHandle"/&gt;
 *     &lt;enumeration value="contactSensor"/&gt;
 *     &lt;enumeration value="occupancySensor"/&gt;
 *     &lt;enumeration value="motionDetector"/&gt;
 *     &lt;enumeration value="fireDetector"/&gt;
 *     &lt;enumeration value="smokeDetector"/&gt;
 *     &lt;enumeration value="heatDetector"/&gt;
 *     &lt;enumeration value="waterDetector"/&gt;
 *     &lt;enumeration value="gasDetector"/&gt;
 *     &lt;enumeration value="alarmSensor"/&gt;
 *     &lt;enumeration value="powerAlarmSensor"/&gt;
 *     &lt;enumeration value="dayNightIndicator"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SensingTypeEnumType")
@XmlEnum
public enum SensingTypeEnumType {

    @XmlEnumValue("switch")
    SWITCH("switch"),
    @XmlEnumValue("button")
    BUTTON("button"),
    @XmlEnumValue("level")
    LEVEL("level"),
    @XmlEnumValue("levelSwitch")
    LEVEL_SWITCH("levelSwitch"),
    @XmlEnumValue("windowHandle")
    WINDOW_HANDLE("windowHandle"),
    @XmlEnumValue("contactSensor")
    CONTACT_SENSOR("contactSensor"),
    @XmlEnumValue("occupancySensor")
    OCCUPANCY_SENSOR("occupancySensor"),
    @XmlEnumValue("motionDetector")
    MOTION_DETECTOR("motionDetector"),
    @XmlEnumValue("fireDetector")
    FIRE_DETECTOR("fireDetector"),
    @XmlEnumValue("smokeDetector")
    SMOKE_DETECTOR("smokeDetector"),
    @XmlEnumValue("heatDetector")
    HEAT_DETECTOR("heatDetector"),
    @XmlEnumValue("waterDetector")
    WATER_DETECTOR("waterDetector"),
    @XmlEnumValue("gasDetector")
    GAS_DETECTOR("gasDetector"),
    @XmlEnumValue("alarmSensor")
    ALARM_SENSOR("alarmSensor"),
    @XmlEnumValue("powerAlarmSensor")
    POWER_ALARM_SENSOR("powerAlarmSensor"),
    @XmlEnumValue("dayNightIndicator")
    DAY_NIGHT_INDICATOR("dayNightIndicator");
    private final String value;

    SensingTypeEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SensingTypeEnumType fromValue(String v) {
        for (SensingTypeEnumType c: SensingTypeEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
