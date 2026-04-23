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
 * <p>Java class for StateInformationFunctionalityEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="StateInformationFunctionalityEnumType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="externalOverrideFromGrid"/&gt;
 *     &lt;enumeration value="autonomousGridSupport"/&gt;
 *     &lt;enumeration value="islandingMode"/&gt;
 *     &lt;enumeration value="balancing"/&gt;
 *     &lt;enumeration value="trickleCharging"/&gt;
 *     &lt;enumeration value="calibration"/&gt;
 *     &lt;enumeration value="commissioningMissing"/&gt;
 *     &lt;enumeration value="sleeping"/&gt;
 *     &lt;enumeration value="starting"/&gt;
 *     &lt;enumeration value="mppt"/&gt;
 *     &lt;enumeration value="throttled"/&gt;
 *     &lt;enumeration value="shuttingDown"/&gt;
 *     &lt;enumeration value="manualShutdown"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "StateInformationFunctionalityEnumType")
@XmlEnum
public enum StateInformationFunctionalityEnumType {

    @XmlEnumValue("externalOverrideFromGrid")
    EXTERNAL_OVERRIDE_FROM_GRID("externalOverrideFromGrid"),
    @XmlEnumValue("autonomousGridSupport")
    AUTONOMOUS_GRID_SUPPORT("autonomousGridSupport"),
    @XmlEnumValue("islandingMode")
    ISLANDING_MODE("islandingMode"),
    @XmlEnumValue("balancing")
    BALANCING("balancing"),
    @XmlEnumValue("trickleCharging")
    TRICKLE_CHARGING("trickleCharging"),
    @XmlEnumValue("calibration")
    CALIBRATION("calibration"),
    @XmlEnumValue("commissioningMissing")
    COMMISSIONING_MISSING("commissioningMissing"),
    @XmlEnumValue("sleeping")
    SLEEPING("sleeping"),
    @XmlEnumValue("starting")
    STARTING("starting"),
    @XmlEnumValue("mppt")
    MPPT("mppt"),
    @XmlEnumValue("throttled")
    THROTTLED("throttled"),
    @XmlEnumValue("shuttingDown")
    SHUTTING_DOWN("shuttingDown"),
    @XmlEnumValue("manualShutdown")
    MANUAL_SHUTDOWN("manualShutdown");
    private final String value;

    StateInformationFunctionalityEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StateInformationFunctionalityEnumType fromValue(String v) {
        for (StateInformationFunctionalityEnumType c: StateInformationFunctionalityEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
