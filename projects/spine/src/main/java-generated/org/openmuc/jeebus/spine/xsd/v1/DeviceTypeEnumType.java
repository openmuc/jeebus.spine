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
 * <p>Java class for DeviceTypeEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="DeviceTypeEnumType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Dishwasher"/&gt;
 *     &lt;enumeration value="Dryer"/&gt;
 *     &lt;enumeration value="EnvironmentSensor"/&gt;
 *     &lt;enumeration value="Generic"/&gt;
 *     &lt;enumeration value="HeatGenerationSystem"/&gt;
 *     &lt;enumeration value="HeatSinkSystem"/&gt;
 *     &lt;enumeration value="HeatStorageSystem"/&gt;
 *     &lt;enumeration value="HVACController"/&gt;
 *     &lt;enumeration value="SubMeter"/&gt;
 *     &lt;enumeration value="Washer"/&gt;
 *     &lt;enumeration value="ElectricitySupplySystem"/&gt;
 *     &lt;enumeration value="EnergyManagementSystem"/&gt;
 *     &lt;enumeration value="Inverter"/&gt;
 *     &lt;enumeration value="ChargingStation"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DeviceTypeEnumType")
@XmlEnum
public enum DeviceTypeEnumType {

    @XmlEnumValue("Dishwasher")
    DISHWASHER("Dishwasher"),
    @XmlEnumValue("Dryer")
    DRYER("Dryer"),
    @XmlEnumValue("EnvironmentSensor")
    ENVIRONMENT_SENSOR("EnvironmentSensor"),
    @XmlEnumValue("Generic")
    GENERIC("Generic"),
    @XmlEnumValue("HeatGenerationSystem")
    HEAT_GENERATION_SYSTEM("HeatGenerationSystem"),
    @XmlEnumValue("HeatSinkSystem")
    HEAT_SINK_SYSTEM("HeatSinkSystem"),
    @XmlEnumValue("HeatStorageSystem")
    HEAT_STORAGE_SYSTEM("HeatStorageSystem"),
    @XmlEnumValue("HVACController")
    HVAC_CONTROLLER("HVACController"),
    @XmlEnumValue("SubMeter")
    SUB_METER("SubMeter"),
    @XmlEnumValue("Washer")
    WASHER("Washer"),
    @XmlEnumValue("ElectricitySupplySystem")
    ELECTRICITY_SUPPLY_SYSTEM("ElectricitySupplySystem"),
    @XmlEnumValue("EnergyManagementSystem")
    ENERGY_MANAGEMENT_SYSTEM("EnergyManagementSystem"),
    @XmlEnumValue("Inverter")
    INVERTER("Inverter"),
    @XmlEnumValue("ChargingStation")
    CHARGING_STATION("ChargingStation");
    private final String value;

    DeviceTypeEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DeviceTypeEnumType fromValue(String v) {
        for (DeviceTypeEnumType c: DeviceTypeEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
