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
 * <p>Java class for DeviceConfigurationKeyNameEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="DeviceConfigurationKeyNameEnumType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="peakPowerOfPvSystem"/&gt;
 *     &lt;enumeration value="pvCurtailmentLimitFactor"/&gt;
 *     &lt;enumeration value="asymmetricChargingSupported"/&gt;
 *     &lt;enumeration value="communicationsStandard"/&gt;
 *     &lt;enumeration value="inverterGridCode"/&gt;
 *     &lt;enumeration value="pvStringAvailabilityStatus"/&gt;
 *     &lt;enumeration value="batteryAvailabilityStatus"/&gt;
 *     &lt;enumeration value="gridConnectionStatus"/&gt;
 *     &lt;enumeration value="timeToAcChargePowerMax"/&gt;
 *     &lt;enumeration value="timeToAcDischargePowerMax"/&gt;
 *     &lt;enumeration value="tilt"/&gt;
 *     &lt;enumeration value="azimuth"/&gt;
 *     &lt;enumeration value="batteryType"/&gt;
 *     &lt;enumeration value="maxCycleCountPerDay"/&gt;
 *     &lt;enumeration value="failsafeConsumptionActivePowerLimit"/&gt;
 *     &lt;enumeration value="failsafeProductionActivePowerLimit"/&gt;
 *     &lt;enumeration value="failsafePositiveReactivePowerLimit"/&gt;
 *     &lt;enumeration value="failsafeNegativeReactivePowerLimit"/&gt;
 *     &lt;enumeration value="failsafePositiveCosPhiLimit"/&gt;
 *     &lt;enumeration value="failsafeNegativeCosPhiLimit"/&gt;
 *     &lt;enumeration value="maxAcChargePower"/&gt;
 *     &lt;enumeration value="maxAcDischargePower"/&gt;
 *     &lt;enumeration value="maxDcChargePower"/&gt;
 *     &lt;enumeration value="maxDcDischargePower"/&gt;
 *     &lt;enumeration value="batteryActiveControlMode"/&gt;
 *     &lt;enumeration value="defaultAcPower"/&gt;
 *     &lt;enumeration value="defaultDcPower"/&gt;
 *     &lt;enumeration value="defaultPccPower"/&gt;
 *     &lt;enumeration value="failsafeAcPowerSetpoint"/&gt;
 *     &lt;enumeration value="failsafeDcPowerSetpoint"/&gt;
 *     &lt;enumeration value="failsafePccPowerSetpoint"/&gt;
 *     &lt;enumeration value="failsafeDurationMinimum"/&gt;
 *     &lt;enumeration value="dischargingBelowTargetEnergyRequestPermitted"/&gt;
 *     &lt;enumeration value="incentivesSimulationCyclesMax"/&gt;
 *     &lt;enumeration value="incentivesSimulationConcurrent"/&gt;
 *     &lt;enumeration value="incentivesTimeoutIncentiveRequest"/&gt;
 *     &lt;enumeration value="incentivesWaitIncentiveWriteable"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DeviceConfigurationKeyNameEnumType")
@XmlEnum
public enum DeviceConfigurationKeyNameEnumType {

    @XmlEnumValue("peakPowerOfPvSystem")
    PEAK_POWER_OF_PV_SYSTEM("peakPowerOfPvSystem"),
    @XmlEnumValue("pvCurtailmentLimitFactor")
    PV_CURTAILMENT_LIMIT_FACTOR("pvCurtailmentLimitFactor"),
    @XmlEnumValue("asymmetricChargingSupported")
    ASYMMETRIC_CHARGING_SUPPORTED("asymmetricChargingSupported"),
    @XmlEnumValue("communicationsStandard")
    COMMUNICATIONS_STANDARD("communicationsStandard"),
    @XmlEnumValue("inverterGridCode")
    INVERTER_GRID_CODE("inverterGridCode"),
    @XmlEnumValue("pvStringAvailabilityStatus")
    PV_STRING_AVAILABILITY_STATUS("pvStringAvailabilityStatus"),
    @XmlEnumValue("batteryAvailabilityStatus")
    BATTERY_AVAILABILITY_STATUS("batteryAvailabilityStatus"),
    @XmlEnumValue("gridConnectionStatus")
    GRID_CONNECTION_STATUS("gridConnectionStatus"),
    @XmlEnumValue("timeToAcChargePowerMax")
    TIME_TO_AC_CHARGE_POWER_MAX("timeToAcChargePowerMax"),
    @XmlEnumValue("timeToAcDischargePowerMax")
    TIME_TO_AC_DISCHARGE_POWER_MAX("timeToAcDischargePowerMax"),
    @XmlEnumValue("tilt")
    TILT("tilt"),
    @XmlEnumValue("azimuth")
    AZIMUTH("azimuth"),
    @XmlEnumValue("batteryType")
    BATTERY_TYPE("batteryType"),
    @XmlEnumValue("maxCycleCountPerDay")
    MAX_CYCLE_COUNT_PER_DAY("maxCycleCountPerDay"),
    @XmlEnumValue("failsafeConsumptionActivePowerLimit")
    FAILSAFE_CONSUMPTION_ACTIVE_POWER_LIMIT("failsafeConsumptionActivePowerLimit"),
    @XmlEnumValue("failsafeProductionActivePowerLimit")
    FAILSAFE_PRODUCTION_ACTIVE_POWER_LIMIT("failsafeProductionActivePowerLimit"),
    @XmlEnumValue("failsafePositiveReactivePowerLimit")
    FAILSAFE_POSITIVE_REACTIVE_POWER_LIMIT("failsafePositiveReactivePowerLimit"),
    @XmlEnumValue("failsafeNegativeReactivePowerLimit")
    FAILSAFE_NEGATIVE_REACTIVE_POWER_LIMIT("failsafeNegativeReactivePowerLimit"),
    @XmlEnumValue("failsafePositiveCosPhiLimit")
    FAILSAFE_POSITIVE_COS_PHI_LIMIT("failsafePositiveCosPhiLimit"),
    @XmlEnumValue("failsafeNegativeCosPhiLimit")
    FAILSAFE_NEGATIVE_COS_PHI_LIMIT("failsafeNegativeCosPhiLimit"),
    @XmlEnumValue("maxAcChargePower")
    MAX_AC_CHARGE_POWER("maxAcChargePower"),
    @XmlEnumValue("maxAcDischargePower")
    MAX_AC_DISCHARGE_POWER("maxAcDischargePower"),
    @XmlEnumValue("maxDcChargePower")
    MAX_DC_CHARGE_POWER("maxDcChargePower"),
    @XmlEnumValue("maxDcDischargePower")
    MAX_DC_DISCHARGE_POWER("maxDcDischargePower"),
    @XmlEnumValue("batteryActiveControlMode")
    BATTERY_ACTIVE_CONTROL_MODE("batteryActiveControlMode"),
    @XmlEnumValue("defaultAcPower")
    DEFAULT_AC_POWER("defaultAcPower"),
    @XmlEnumValue("defaultDcPower")
    DEFAULT_DC_POWER("defaultDcPower"),
    @XmlEnumValue("defaultPccPower")
    DEFAULT_PCC_POWER("defaultPccPower"),
    @XmlEnumValue("failsafeAcPowerSetpoint")
    FAILSAFE_AC_POWER_SETPOINT("failsafeAcPowerSetpoint"),
    @XmlEnumValue("failsafeDcPowerSetpoint")
    FAILSAFE_DC_POWER_SETPOINT("failsafeDcPowerSetpoint"),
    @XmlEnumValue("failsafePccPowerSetpoint")
    FAILSAFE_PCC_POWER_SETPOINT("failsafePccPowerSetpoint"),
    @XmlEnumValue("failsafeDurationMinimum")
    FAILSAFE_DURATION_MINIMUM("failsafeDurationMinimum"),
    @XmlEnumValue("dischargingBelowTargetEnergyRequestPermitted")
    DISCHARGING_BELOW_TARGET_ENERGY_REQUEST_PERMITTED("dischargingBelowTargetEnergyRequestPermitted"),
    @XmlEnumValue("incentivesSimulationCyclesMax")
    INCENTIVES_SIMULATION_CYCLES_MAX("incentivesSimulationCyclesMax"),
    @XmlEnumValue("incentivesSimulationConcurrent")
    INCENTIVES_SIMULATION_CONCURRENT("incentivesSimulationConcurrent"),
    @XmlEnumValue("incentivesTimeoutIncentiveRequest")
    INCENTIVES_TIMEOUT_INCENTIVE_REQUEST("incentivesTimeoutIncentiveRequest"),
    @XmlEnumValue("incentivesWaitIncentiveWriteable")
    INCENTIVES_WAIT_INCENTIVE_WRITEABLE("incentivesWaitIncentiveWriteable");
    private final String value;

    DeviceConfigurationKeyNameEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DeviceConfigurationKeyNameEnumType fromValue(String v) {
        for (DeviceConfigurationKeyNameEnumType c: DeviceConfigurationKeyNameEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
