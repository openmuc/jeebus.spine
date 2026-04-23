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
 * <p>Java class for ScopeTypeEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ScopeTypeEnumType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ac"/&gt;
 *     &lt;enumeration value="acCosPhiGrid"/&gt;
 *     &lt;enumeration value="acCurrentA"/&gt;
 *     &lt;enumeration value="acCurrentB"/&gt;
 *     &lt;enumeration value="acCurrentC"/&gt;
 *     &lt;enumeration value="acFrequencyGrid"/&gt;
 *     &lt;enumeration value="acPowerA"/&gt;
 *     &lt;enumeration value="acPowerB"/&gt;
 *     &lt;enumeration value="acPowerC"/&gt;
 *     &lt;enumeration value="acPowerLimitPct"/&gt;
 *     &lt;enumeration value="acPowerTotal"/&gt;
 *     &lt;enumeration value="acVoltageA"/&gt;
 *     &lt;enumeration value="acVoltageB"/&gt;
 *     &lt;enumeration value="acVoltageC"/&gt;
 *     &lt;enumeration value="acYieldDay"/&gt;
 *     &lt;enumeration value="acYieldTotal"/&gt;
 *     &lt;enumeration value="dcCurrent"/&gt;
 *     &lt;enumeration value="dcPower"/&gt;
 *     &lt;enumeration value="dcString1"/&gt;
 *     &lt;enumeration value="dcString2"/&gt;
 *     &lt;enumeration value="dcString3"/&gt;
 *     &lt;enumeration value="dcString4"/&gt;
 *     &lt;enumeration value="dcString5"/&gt;
 *     &lt;enumeration value="dcString6"/&gt;
 *     &lt;enumeration value="dcTotal"/&gt;
 *     &lt;enumeration value="dcVoltage"/&gt;
 *     &lt;enumeration value="dhwTemperature"/&gt;
 *     &lt;enumeration value="flowTemperature"/&gt;
 *     &lt;enumeration value="outsideAirTemperature"/&gt;
 *     &lt;enumeration value="returnTemperature"/&gt;
 *     &lt;enumeration value="roomAirTemperature"/&gt;
 *     &lt;enumeration value="charge"/&gt;
 *     &lt;enumeration value="stateOfCharge"/&gt;
 *     &lt;enumeration value="discharge"/&gt;
 *     &lt;enumeration value="gridConsumption"/&gt;
 *     &lt;enumeration value="gridFeedIn"/&gt;
 *     &lt;enumeration value="selfConsumption"/&gt;
 *     &lt;enumeration value="overloadProtection"/&gt;
 *     &lt;enumeration value="acPower"/&gt;
 *     &lt;enumeration value="acEnergy"/&gt;
 *     &lt;enumeration value="acCurrent"/&gt;
 *     &lt;enumeration value="acVoltage"/&gt;
 *     &lt;enumeration value="batteryControl"/&gt;
 *     &lt;enumeration value="simpleIncentiveTable"/&gt;
 *     &lt;enumeration value="stateOfHealth"/&gt;
 *     &lt;enumeration value="travelRange"/&gt;
 *     &lt;enumeration value="nominalEnergyCapacity"/&gt;
 *     &lt;enumeration value="acPowerReal"/&gt;
 *     &lt;enumeration value="acPowerApparent"/&gt;
 *     &lt;enumeration value="acPowerReactive"/&gt;
 *     &lt;enumeration value="acYieldMonth"/&gt;
 *     &lt;enumeration value="acYieldYear"/&gt;
 *     &lt;enumeration value="acFrequency"/&gt;
 *     &lt;enumeration value="acCosPhi"/&gt;
 *     &lt;enumeration value="dcEnergy"/&gt;
 *     &lt;enumeration value="insulationResistance"/&gt;
 *     &lt;enumeration value="stateOfEnergy"/&gt;
 *     &lt;enumeration value="useableCapacity"/&gt;
 *     &lt;enumeration value="dcChargeEnergy"/&gt;
 *     &lt;enumeration value="dcDischargeEnergy"/&gt;
 *     &lt;enumeration value="loadCycleCount"/&gt;
 *     &lt;enumeration value="componentTemperature"/&gt;
 *     &lt;enumeration value="gridLimit"/&gt;
 *     &lt;enumeration value="gridLimitFallback"/&gt;
 *     &lt;enumeration value="acPowerApparentTotal"/&gt;
 *     &lt;enumeration value="acPowerReactiveTotal"/&gt;
 *     &lt;enumeration value="acCurrentTotal"/&gt;
 *     &lt;enumeration value="acEnergyConsumed"/&gt;
 *     &lt;enumeration value="acEnergyProduced"/&gt;
 *     &lt;enumeration value="batteryAcPower"/&gt;
 *     &lt;enumeration value="batteryAcPowerPhaseSpecific"/&gt;
 *     &lt;enumeration value="batteryDcPower"/&gt;
 *     &lt;enumeration value="pccPower"/&gt;
 *     &lt;enumeration value="activePowerLimit"/&gt;
 *     &lt;enumeration value="activePowerLimitPercentage"/&gt;
 *     &lt;enumeration value="simpleCommittedIncentiveTable"/&gt;
 *     &lt;enumeration value="simplePreliminaryIncentiveTable"/&gt;
 *     &lt;enumeration value="committedPowerPlan"/&gt;
 *     &lt;enumeration value="preliminaryPowerPlan"/&gt;
 *     &lt;enumeration value="incentiveTableEnConsWithPoETF"/&gt;
 *     &lt;enumeration value="incentiveTableEnProdWithPoETF"/&gt;
 *     &lt;enumeration value="incentiveTableEnConsWithPoE"/&gt;
 *     &lt;enumeration value="incentiveTableEnProdWithPoE"/&gt;
 *     &lt;enumeration value="incentiveTableEnConsWithTF"/&gt;
 *     &lt;enumeration value="incentiveTableEnProdWithTF"/&gt;
 *     &lt;enumeration value="activePowerForecast"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ScopeTypeEnumType")
@XmlEnum
public enum ScopeTypeEnumType {

    @XmlEnumValue("ac")
    AC("ac"),
    @XmlEnumValue("acCosPhiGrid")
    AC_COS_PHI_GRID("acCosPhiGrid"),
    @XmlEnumValue("acCurrentA")
    AC_CURRENT_A("acCurrentA"),
    @XmlEnumValue("acCurrentB")
    AC_CURRENT_B("acCurrentB"),
    @XmlEnumValue("acCurrentC")
    AC_CURRENT_C("acCurrentC"),
    @XmlEnumValue("acFrequencyGrid")
    AC_FREQUENCY_GRID("acFrequencyGrid"),
    @XmlEnumValue("acPowerA")
    AC_POWER_A("acPowerA"),
    @XmlEnumValue("acPowerB")
    AC_POWER_B("acPowerB"),
    @XmlEnumValue("acPowerC")
    AC_POWER_C("acPowerC"),
    @XmlEnumValue("acPowerLimitPct")
    AC_POWER_LIMIT_PCT("acPowerLimitPct"),
    @XmlEnumValue("acPowerTotal")
    AC_POWER_TOTAL("acPowerTotal"),
    @XmlEnumValue("acVoltageA")
    AC_VOLTAGE_A("acVoltageA"),
    @XmlEnumValue("acVoltageB")
    AC_VOLTAGE_B("acVoltageB"),
    @XmlEnumValue("acVoltageC")
    AC_VOLTAGE_C("acVoltageC"),
    @XmlEnumValue("acYieldDay")
    AC_YIELD_DAY("acYieldDay"),
    @XmlEnumValue("acYieldTotal")
    AC_YIELD_TOTAL("acYieldTotal"),
    @XmlEnumValue("dcCurrent")
    DC_CURRENT("dcCurrent"),
    @XmlEnumValue("dcPower")
    DC_POWER("dcPower"),
    @XmlEnumValue("dcString1")
    DC_STRING_1("dcString1"),
    @XmlEnumValue("dcString2")
    DC_STRING_2("dcString2"),
    @XmlEnumValue("dcString3")
    DC_STRING_3("dcString3"),
    @XmlEnumValue("dcString4")
    DC_STRING_4("dcString4"),
    @XmlEnumValue("dcString5")
    DC_STRING_5("dcString5"),
    @XmlEnumValue("dcString6")
    DC_STRING_6("dcString6"),
    @XmlEnumValue("dcTotal")
    DC_TOTAL("dcTotal"),
    @XmlEnumValue("dcVoltage")
    DC_VOLTAGE("dcVoltage"),
    @XmlEnumValue("dhwTemperature")
    DHW_TEMPERATURE("dhwTemperature"),
    @XmlEnumValue("flowTemperature")
    FLOW_TEMPERATURE("flowTemperature"),
    @XmlEnumValue("outsideAirTemperature")
    OUTSIDE_AIR_TEMPERATURE("outsideAirTemperature"),
    @XmlEnumValue("returnTemperature")
    RETURN_TEMPERATURE("returnTemperature"),
    @XmlEnumValue("roomAirTemperature")
    ROOM_AIR_TEMPERATURE("roomAirTemperature"),
    @XmlEnumValue("charge")
    CHARGE("charge"),
    @XmlEnumValue("stateOfCharge")
    STATE_OF_CHARGE("stateOfCharge"),
    @XmlEnumValue("discharge")
    DISCHARGE("discharge"),
    @XmlEnumValue("gridConsumption")
    GRID_CONSUMPTION("gridConsumption"),
    @XmlEnumValue("gridFeedIn")
    GRID_FEED_IN("gridFeedIn"),
    @XmlEnumValue("selfConsumption")
    SELF_CONSUMPTION("selfConsumption"),
    @XmlEnumValue("overloadProtection")
    OVERLOAD_PROTECTION("overloadProtection"),
    @XmlEnumValue("acPower")
    AC_POWER("acPower"),
    @XmlEnumValue("acEnergy")
    AC_ENERGY("acEnergy"),
    @XmlEnumValue("acCurrent")
    AC_CURRENT("acCurrent"),
    @XmlEnumValue("acVoltage")
    AC_VOLTAGE("acVoltage"),
    @XmlEnumValue("batteryControl")
    BATTERY_CONTROL("batteryControl"),
    @XmlEnumValue("simpleIncentiveTable")
    SIMPLE_INCENTIVE_TABLE("simpleIncentiveTable"),
    @XmlEnumValue("stateOfHealth")
    STATE_OF_HEALTH("stateOfHealth"),
    @XmlEnumValue("travelRange")
    TRAVEL_RANGE("travelRange"),
    @XmlEnumValue("nominalEnergyCapacity")
    NOMINAL_ENERGY_CAPACITY("nominalEnergyCapacity"),
    @XmlEnumValue("acPowerReal")
    AC_POWER_REAL("acPowerReal"),
    @XmlEnumValue("acPowerApparent")
    AC_POWER_APPARENT("acPowerApparent"),
    @XmlEnumValue("acPowerReactive")
    AC_POWER_REACTIVE("acPowerReactive"),
    @XmlEnumValue("acYieldMonth")
    AC_YIELD_MONTH("acYieldMonth"),
    @XmlEnumValue("acYieldYear")
    AC_YIELD_YEAR("acYieldYear"),
    @XmlEnumValue("acFrequency")
    AC_FREQUENCY("acFrequency"),
    @XmlEnumValue("acCosPhi")
    AC_COS_PHI("acCosPhi"),
    @XmlEnumValue("dcEnergy")
    DC_ENERGY("dcEnergy"),
    @XmlEnumValue("insulationResistance")
    INSULATION_RESISTANCE("insulationResistance"),
    @XmlEnumValue("stateOfEnergy")
    STATE_OF_ENERGY("stateOfEnergy"),
    @XmlEnumValue("useableCapacity")
    USEABLE_CAPACITY("useableCapacity"),
    @XmlEnumValue("dcChargeEnergy")
    DC_CHARGE_ENERGY("dcChargeEnergy"),
    @XmlEnumValue("dcDischargeEnergy")
    DC_DISCHARGE_ENERGY("dcDischargeEnergy"),
    @XmlEnumValue("loadCycleCount")
    LOAD_CYCLE_COUNT("loadCycleCount"),
    @XmlEnumValue("componentTemperature")
    COMPONENT_TEMPERATURE("componentTemperature"),
    @XmlEnumValue("gridLimit")
    GRID_LIMIT("gridLimit"),
    @XmlEnumValue("gridLimitFallback")
    GRID_LIMIT_FALLBACK("gridLimitFallback"),
    @XmlEnumValue("acPowerApparentTotal")
    AC_POWER_APPARENT_TOTAL("acPowerApparentTotal"),
    @XmlEnumValue("acPowerReactiveTotal")
    AC_POWER_REACTIVE_TOTAL("acPowerReactiveTotal"),
    @XmlEnumValue("acCurrentTotal")
    AC_CURRENT_TOTAL("acCurrentTotal"),
    @XmlEnumValue("acEnergyConsumed")
    AC_ENERGY_CONSUMED("acEnergyConsumed"),
    @XmlEnumValue("acEnergyProduced")
    AC_ENERGY_PRODUCED("acEnergyProduced"),
    @XmlEnumValue("batteryAcPower")
    BATTERY_AC_POWER("batteryAcPower"),
    @XmlEnumValue("batteryAcPowerPhaseSpecific")
    BATTERY_AC_POWER_PHASE_SPECIFIC("batteryAcPowerPhaseSpecific"),
    @XmlEnumValue("batteryDcPower")
    BATTERY_DC_POWER("batteryDcPower"),
    @XmlEnumValue("pccPower")
    PCC_POWER("pccPower"),
    @XmlEnumValue("activePowerLimit")
    ACTIVE_POWER_LIMIT("activePowerLimit"),
    @XmlEnumValue("activePowerLimitPercentage")
    ACTIVE_POWER_LIMIT_PERCENTAGE("activePowerLimitPercentage"),
    @XmlEnumValue("simpleCommittedIncentiveTable")
    SIMPLE_COMMITTED_INCENTIVE_TABLE("simpleCommittedIncentiveTable"),
    @XmlEnumValue("simplePreliminaryIncentiveTable")
    SIMPLE_PRELIMINARY_INCENTIVE_TABLE("simplePreliminaryIncentiveTable"),
    @XmlEnumValue("committedPowerPlan")
    COMMITTED_POWER_PLAN("committedPowerPlan"),
    @XmlEnumValue("preliminaryPowerPlan")
    PRELIMINARY_POWER_PLAN("preliminaryPowerPlan"),
    @XmlEnumValue("incentiveTableEnConsWithPoETF")
    INCENTIVE_TABLE_EN_CONS_WITH_PO_ETF("incentiveTableEnConsWithPoETF"),
    @XmlEnumValue("incentiveTableEnProdWithPoETF")
    INCENTIVE_TABLE_EN_PROD_WITH_PO_ETF("incentiveTableEnProdWithPoETF"),
    @XmlEnumValue("incentiveTableEnConsWithPoE")
    INCENTIVE_TABLE_EN_CONS_WITH_PO_E("incentiveTableEnConsWithPoE"),
    @XmlEnumValue("incentiveTableEnProdWithPoE")
    INCENTIVE_TABLE_EN_PROD_WITH_PO_E("incentiveTableEnProdWithPoE"),
    @XmlEnumValue("incentiveTableEnConsWithTF")
    INCENTIVE_TABLE_EN_CONS_WITH_TF("incentiveTableEnConsWithTF"),
    @XmlEnumValue("incentiveTableEnProdWithTF")
    INCENTIVE_TABLE_EN_PROD_WITH_TF("incentiveTableEnProdWithTF"),
    @XmlEnumValue("activePowerForecast")
    ACTIVE_POWER_FORECAST("activePowerForecast");
    private final String value;

    ScopeTypeEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ScopeTypeEnumType fromValue(String v) {
        for (ScopeTypeEnumType c: ScopeTypeEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
