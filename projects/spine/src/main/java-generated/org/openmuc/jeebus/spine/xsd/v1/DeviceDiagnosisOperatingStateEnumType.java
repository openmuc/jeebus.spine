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
 * <p>Java class for DeviceDiagnosisOperatingStateEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="DeviceDiagnosisOperatingStateEnumType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="normalOperation"/&gt;
 *     &lt;enumeration value="standby"/&gt;
 *     &lt;enumeration value="failure"/&gt;
 *     &lt;enumeration value="serviceNeeded"/&gt;
 *     &lt;enumeration value="overrideDetected"/&gt;
 *     &lt;enumeration value="inAlarm"/&gt;
 *     &lt;enumeration value="notReachable"/&gt;
 *     &lt;enumeration value="finished"/&gt;
 *     &lt;enumeration value="temporarilyNotReady"/&gt;
 *     &lt;enumeration value="off"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DeviceDiagnosisOperatingStateEnumType")
@XmlEnum
public enum DeviceDiagnosisOperatingStateEnumType {

    @XmlEnumValue("normalOperation")
    NORMAL_OPERATION("normalOperation"),
    @XmlEnumValue("standby")
    STANDBY("standby"),
    @XmlEnumValue("failure")
    FAILURE("failure"),
    @XmlEnumValue("serviceNeeded")
    SERVICE_NEEDED("serviceNeeded"),
    @XmlEnumValue("overrideDetected")
    OVERRIDE_DETECTED("overrideDetected"),
    @XmlEnumValue("inAlarm")
    IN_ALARM("inAlarm"),
    @XmlEnumValue("notReachable")
    NOT_REACHABLE("notReachable"),
    @XmlEnumValue("finished")
    FINISHED("finished"),
    @XmlEnumValue("temporarilyNotReady")
    TEMPORARILY_NOT_READY("temporarilyNotReady"),
    @XmlEnumValue("off")
    OFF("off");
    private final String value;

    DeviceDiagnosisOperatingStateEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DeviceDiagnosisOperatingStateEnumType fromValue(String v) {
        for (DeviceDiagnosisOperatingStateEnumType c: DeviceDiagnosisOperatingStateEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
