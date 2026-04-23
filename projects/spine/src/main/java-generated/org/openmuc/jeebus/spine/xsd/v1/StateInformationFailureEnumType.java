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
 * <p>Java class for StateInformationFailureEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="StateInformationFailureEnumType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="inverterDefective"/&gt;
 *     &lt;enumeration value="batteryOvercurrentProtection"/&gt;
 *     &lt;enumeration value="pvStringOvercurrentProtection"/&gt;
 *     &lt;enumeration value="gridFault"/&gt;
 *     &lt;enumeration value="groundFault"/&gt;
 *     &lt;enumeration value="acDisconnected"/&gt;
 *     &lt;enumeration value="dcDisconnected"/&gt;
 *     &lt;enumeration value="cabinetOpen"/&gt;
 *     &lt;enumeration value="overTemperature"/&gt;
 *     &lt;enumeration value="underTemperature"/&gt;
 *     &lt;enumeration value="frequencyAboveLimit"/&gt;
 *     &lt;enumeration value="frequencyBelowLimit"/&gt;
 *     &lt;enumeration value="acVoltageAboveLimit"/&gt;
 *     &lt;enumeration value="acVoltageBelowLimit"/&gt;
 *     &lt;enumeration value="dcVoltageAboveLimit"/&gt;
 *     &lt;enumeration value="dcVoltageBelowLimit"/&gt;
 *     &lt;enumeration value="hardwareTestFailure"/&gt;
 *     &lt;enumeration value="genericInternalError"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "StateInformationFailureEnumType")
@XmlEnum
public enum StateInformationFailureEnumType {

    @XmlEnumValue("inverterDefective")
    INVERTER_DEFECTIVE("inverterDefective"),
    @XmlEnumValue("batteryOvercurrentProtection")
    BATTERY_OVERCURRENT_PROTECTION("batteryOvercurrentProtection"),
    @XmlEnumValue("pvStringOvercurrentProtection")
    PV_STRING_OVERCURRENT_PROTECTION("pvStringOvercurrentProtection"),
    @XmlEnumValue("gridFault")
    GRID_FAULT("gridFault"),
    @XmlEnumValue("groundFault")
    GROUND_FAULT("groundFault"),
    @XmlEnumValue("acDisconnected")
    AC_DISCONNECTED("acDisconnected"),
    @XmlEnumValue("dcDisconnected")
    DC_DISCONNECTED("dcDisconnected"),
    @XmlEnumValue("cabinetOpen")
    CABINET_OPEN("cabinetOpen"),
    @XmlEnumValue("overTemperature")
    OVER_TEMPERATURE("overTemperature"),
    @XmlEnumValue("underTemperature")
    UNDER_TEMPERATURE("underTemperature"),
    @XmlEnumValue("frequencyAboveLimit")
    FREQUENCY_ABOVE_LIMIT("frequencyAboveLimit"),
    @XmlEnumValue("frequencyBelowLimit")
    FREQUENCY_BELOW_LIMIT("frequencyBelowLimit"),
    @XmlEnumValue("acVoltageAboveLimit")
    AC_VOLTAGE_ABOVE_LIMIT("acVoltageAboveLimit"),
    @XmlEnumValue("acVoltageBelowLimit")
    AC_VOLTAGE_BELOW_LIMIT("acVoltageBelowLimit"),
    @XmlEnumValue("dcVoltageAboveLimit")
    DC_VOLTAGE_ABOVE_LIMIT("dcVoltageAboveLimit"),
    @XmlEnumValue("dcVoltageBelowLimit")
    DC_VOLTAGE_BELOW_LIMIT("dcVoltageBelowLimit"),
    @XmlEnumValue("hardwareTestFailure")
    HARDWARE_TEST_FAILURE("hardwareTestFailure"),
    @XmlEnumValue("genericInternalError")
    GENERIC_INTERNAL_ERROR("genericInternalError");
    private final String value;

    StateInformationFailureEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StateInformationFailureEnumType fromValue(String v) {
        for (StateInformationFailureEnumType c: StateInformationFailureEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
