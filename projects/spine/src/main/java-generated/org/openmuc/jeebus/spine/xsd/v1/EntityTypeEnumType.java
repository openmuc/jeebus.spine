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
 * <p>Java class for EntityTypeEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="EntityTypeEnumType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Battery"/&gt;
 *     &lt;enumeration value="Compressor"/&gt;
 *     &lt;enumeration value="DeviceInformation"/&gt;
 *     &lt;enumeration value="DHWCircuit"/&gt;
 *     &lt;enumeration value="DHWStorage"/&gt;
 *     &lt;enumeration value="Dishwasher"/&gt;
 *     &lt;enumeration value="Dryer"/&gt;
 *     &lt;enumeration value="ElectricalImmersionHeater"/&gt;
 *     &lt;enumeration value="Fan"/&gt;
 *     &lt;enumeration value="GasHeatingAppliance"/&gt;
 *     &lt;enumeration value="Generic"/&gt;
 *     &lt;enumeration value="HeatingBufferStorage"/&gt;
 *     &lt;enumeration value="HeatingCircuit"/&gt;
 *     &lt;enumeration value="HeatingObject"/&gt;
 *     &lt;enumeration value="HeatingZone"/&gt;
 *     &lt;enumeration value="HeatPumpAppliance"/&gt;
 *     &lt;enumeration value="HeatSinkCircuit"/&gt;
 *     &lt;enumeration value="HeatSourceCircuit"/&gt;
 *     &lt;enumeration value="HeatSourceUnit"/&gt;
 *     &lt;enumeration value="HVACController"/&gt;
 *     &lt;enumeration value="HVACRoom"/&gt;
 *     &lt;enumeration value="InstantDHWHeater"/&gt;
 *     &lt;enumeration value="Inverter"/&gt;
 *     &lt;enumeration value="OilHeatingAppliance"/&gt;
 *     &lt;enumeration value="Pump"/&gt;
 *     &lt;enumeration value="RefrigerantCircuit"/&gt;
 *     &lt;enumeration value="SmartEnergyAppliance"/&gt;
 *     &lt;enumeration value="SolarDHWStorage"/&gt;
 *     &lt;enumeration value="SolarThermalCircuit"/&gt;
 *     &lt;enumeration value="SubMeterElectricity"/&gt;
 *     &lt;enumeration value="TemperatureSensor"/&gt;
 *     &lt;enumeration value="Washer"/&gt;
 *     &lt;enumeration value="BatterySystem"/&gt;
 *     &lt;enumeration value="ElectricityGenerationSystem"/&gt;
 *     &lt;enumeration value="ElectricityStorageSystem"/&gt;
 *     &lt;enumeration value="GridConnectionPointOfPremises"/&gt;
 *     &lt;enumeration value="Household"/&gt;
 *     &lt;enumeration value="PVSystem"/&gt;
 *     &lt;enumeration value="EV"/&gt;
 *     &lt;enumeration value="EVSE"/&gt;
 *     &lt;enumeration value="ChargingOutlet"/&gt;
 *     &lt;enumeration value="CEM"/&gt;
 *     &lt;enumeration value="PV"/&gt;
 *     &lt;enumeration value="PVESHybrid"/&gt;
 *     &lt;enumeration value="ElectricalStorage"/&gt;
 *     &lt;enumeration value="PVString"/&gt;
 *     &lt;enumeration value="GridGuard"/&gt;
 *     &lt;enumeration value="ControllableSystem"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EntityTypeEnumType")
@XmlEnum
public enum EntityTypeEnumType {

    @XmlEnumValue("Battery")
    BATTERY("Battery"),
    @XmlEnumValue("Compressor")
    COMPRESSOR("Compressor"),
    @XmlEnumValue("DeviceInformation")
    DEVICE_INFORMATION("DeviceInformation"),
    @XmlEnumValue("DHWCircuit")
    DHW_CIRCUIT("DHWCircuit"),
    @XmlEnumValue("DHWStorage")
    DHW_STORAGE("DHWStorage"),
    @XmlEnumValue("Dishwasher")
    DISHWASHER("Dishwasher"),
    @XmlEnumValue("Dryer")
    DRYER("Dryer"),
    @XmlEnumValue("ElectricalImmersionHeater")
    ELECTRICAL_IMMERSION_HEATER("ElectricalImmersionHeater"),
    @XmlEnumValue("Fan")
    FAN("Fan"),
    @XmlEnumValue("GasHeatingAppliance")
    GAS_HEATING_APPLIANCE("GasHeatingAppliance"),
    @XmlEnumValue("Generic")
    GENERIC("Generic"),
    @XmlEnumValue("HeatingBufferStorage")
    HEATING_BUFFER_STORAGE("HeatingBufferStorage"),
    @XmlEnumValue("HeatingCircuit")
    HEATING_CIRCUIT("HeatingCircuit"),
    @XmlEnumValue("HeatingObject")
    HEATING_OBJECT("HeatingObject"),
    @XmlEnumValue("HeatingZone")
    HEATING_ZONE("HeatingZone"),
    @XmlEnumValue("HeatPumpAppliance")
    HEAT_PUMP_APPLIANCE("HeatPumpAppliance"),
    @XmlEnumValue("HeatSinkCircuit")
    HEAT_SINK_CIRCUIT("HeatSinkCircuit"),
    @XmlEnumValue("HeatSourceCircuit")
    HEAT_SOURCE_CIRCUIT("HeatSourceCircuit"),
    @XmlEnumValue("HeatSourceUnit")
    HEAT_SOURCE_UNIT("HeatSourceUnit"),
    @XmlEnumValue("HVACController")
    HVAC_CONTROLLER("HVACController"),
    @XmlEnumValue("HVACRoom")
    HVAC_ROOM("HVACRoom"),
    @XmlEnumValue("InstantDHWHeater")
    INSTANT_DHW_HEATER("InstantDHWHeater"),
    @XmlEnumValue("Inverter")
    INVERTER("Inverter"),
    @XmlEnumValue("OilHeatingAppliance")
    OIL_HEATING_APPLIANCE("OilHeatingAppliance"),
    @XmlEnumValue("Pump")
    PUMP("Pump"),
    @XmlEnumValue("RefrigerantCircuit")
    REFRIGERANT_CIRCUIT("RefrigerantCircuit"),
    @XmlEnumValue("SmartEnergyAppliance")
    SMART_ENERGY_APPLIANCE("SmartEnergyAppliance"),
    @XmlEnumValue("SolarDHWStorage")
    SOLAR_DHW_STORAGE("SolarDHWStorage"),
    @XmlEnumValue("SolarThermalCircuit")
    SOLAR_THERMAL_CIRCUIT("SolarThermalCircuit"),
    @XmlEnumValue("SubMeterElectricity")
    SUB_METER_ELECTRICITY("SubMeterElectricity"),
    @XmlEnumValue("TemperatureSensor")
    TEMPERATURE_SENSOR("TemperatureSensor"),
    @XmlEnumValue("Washer")
    WASHER("Washer"),
    @XmlEnumValue("BatterySystem")
    BATTERY_SYSTEM("BatterySystem"),
    @XmlEnumValue("ElectricityGenerationSystem")
    ELECTRICITY_GENERATION_SYSTEM("ElectricityGenerationSystem"),
    @XmlEnumValue("ElectricityStorageSystem")
    ELECTRICITY_STORAGE_SYSTEM("ElectricityStorageSystem"),
    @XmlEnumValue("GridConnectionPointOfPremises")
    GRID_CONNECTION_POINT_OF_PREMISES("GridConnectionPointOfPremises"),
    @XmlEnumValue("Household")
    HOUSEHOLD("Household"),
    @XmlEnumValue("PVSystem")
    PV_SYSTEM("PVSystem"),
    EV("EV"),
    EVSE("EVSE"),
    @XmlEnumValue("ChargingOutlet")
    CHARGING_OUTLET("ChargingOutlet"),
    CEM("CEM"),
    PV("PV"),
    @XmlEnumValue("PVESHybrid")
    PVES_HYBRID("PVESHybrid"),
    @XmlEnumValue("ElectricalStorage")
    ELECTRICAL_STORAGE("ElectricalStorage"),
    @XmlEnumValue("PVString")
    PV_STRING("PVString"),
    @XmlEnumValue("GridGuard")
    GRID_GUARD("GridGuard"),
    @XmlEnumValue("ControllableSystem")
    CONTROLLABLE_SYSTEM("ControllableSystem");
    private final String value;

    EntityTypeEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EntityTypeEnumType fromValue(String v) {
        for (EntityTypeEnumType c: EntityTypeEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
