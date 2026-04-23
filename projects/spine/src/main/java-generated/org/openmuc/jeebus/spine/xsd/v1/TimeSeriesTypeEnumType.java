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
 * <p>Java class for TimeSeriesTypeEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="TimeSeriesTypeEnumType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="plan"/&gt;
 *     &lt;enumeration value="singleDemand"/&gt;
 *     &lt;enumeration value="constraints"/&gt;
 *     &lt;enumeration value="energyRequest"/&gt;
 *     &lt;enumeration value="dischargingEnergyRequest"/&gt;
 *     &lt;enumeration value="consumptionLimitCurve"/&gt;
 *     &lt;enumeration value="productionLimitCurve"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TimeSeriesTypeEnumType")
@XmlEnum
public enum TimeSeriesTypeEnumType {

    @XmlEnumValue("plan")
    PLAN("plan"),
    @XmlEnumValue("singleDemand")
    SINGLE_DEMAND("singleDemand"),
    @XmlEnumValue("constraints")
    CONSTRAINTS("constraints"),
    @XmlEnumValue("energyRequest")
    ENERGY_REQUEST("energyRequest"),
    @XmlEnumValue("dischargingEnergyRequest")
    DISCHARGING_ENERGY_REQUEST("dischargingEnergyRequest"),
    @XmlEnumValue("consumptionLimitCurve")
    CONSUMPTION_LIMIT_CURVE("consumptionLimitCurve"),
    @XmlEnumValue("productionLimitCurve")
    PRODUCTION_LIMIT_CURVE("productionLimitCurve");
    private final String value;

    TimeSeriesTypeEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TimeSeriesTypeEnumType fromValue(String v) {
        for (TimeSeriesTypeEnumType c: TimeSeriesTypeEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
