/********************************************************************************
 * Copyright (c) 2026 Fraunhofer ISE
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 ********************************************************************************/

package org.openmuc.jeebus.spine.utils.features.deviceconfiguration;

import org.openmuc.jeebus.spine.api.DataValidationException;
import org.openmuc.jeebus.spine.xsd.v1.DeviceConfigurationKeyNameEnumType;
import org.openmuc.jeebus.spine.xsd.v1.DeviceConfigurationKeyValueDataType;

import java.util.List;
import java.util.Optional;

public class PermittedValues {
    private PermittedValues () {}

    public static Optional<DataValidationException> valueAllowedForKeyOrError(
        DeviceConfigurationKeyNameEnumType keyName,
        DeviceConfigurationKeyValueDataType data,
        Double scaledNumberValue,
        String stringValue,
        Boolean booleanValue
    ) {
        List<String> allowedStrings;
        String invalidValueMsg = null;
        switch (keyName) {
            case PEAK_POWER_OF_PV_SYSTEM:
                if (scaledNumberValue == null || scaledNumberValue < 0) {
                    invalidValueMsg =
                        "ScaledNumberValue with keyName PEAK_POWER_OF_PV_SYSTEM must be set with value "
                            + ">= 0";
                }
                break;
            case PV_CURTAILMENT_LIMIT_FACTOR:
                if (scaledNumberValue == null
                    || scaledNumberValue < 0
                    || scaledNumberValue > 100) {
                    invalidValueMsg =
                        "ScaledNumberValue with keyName PEAK_POWER_OF_PV_SYSTEM must be set and in range "
                            + "of 0 to 100";
                }
                break;
            case COMMUNICATIONS_STANDARD:
                allowedStrings = List.of(
                    "iso15118-2ed1",
                    "iso15118-2ed2",
                    "iec61851"
                );
                if (stringValue == null || !allowedStrings.contains(stringValue)) {
                    invalidValueMsg =
                        "Value with keyName COMMUNICATIONS_STANDARD must be string and shall use one of"
                            + " the following: "
                            + allowedStrings;
                }
                break;
            case INVERTER_GRID_CODE:
                if (stringValue == null) {
                    invalidValueMsg
                        = "Value with keyName INVERTER_GRID_CODE must be string";
                }
                break;
            case PV_STRING_AVAILABILITY_STATUS:
                allowedStrings = List.of(
                    "Unknown",
                    "Disconnected",
                    "Connected",
                    "Available",
                    "In operation"
                );
                if (stringValue == null || !allowedStrings.contains(stringValue)) {
                    invalidValueMsg =
                        "Value with keyName PV_STRING_AVAILABILITY_STATUS must be string and shall use "
                            + "one of the following: "
                            + allowedStrings;
                }
                break;
            case BATTERY_AVAILABILITY_STATUS:
                allowedStrings = List.of(
                    "Unknown",
                    "Disconnected",
                    "Connected",
                    "Available",
                    "In operation"
                );
                if (stringValue == null || !allowedStrings.contains(stringValue)) {
                    invalidValueMsg =
                        "Value with keyName BATTERY_AVAILABILITY_STATUS must be string and shall use "
                            + "one of the following: "
                            + allowedStrings;
                }
                break;
            case GRID_CONNECTION_STATUS:
                allowedStrings = List.of("Unknown", "Disconnected", "Connected");
                if (stringValue == null || !allowedStrings.contains(stringValue)) {
                    invalidValueMsg =
                        "Value with keyName GRID_CONNECTION_STATUS must be string and shall use "
                            + "one of the following: "
                            + allowedStrings;
                }
                break;
            case TIME_TO_AC_CHARGE_POWER_MAX:
                if (scaledNumberValue == null || scaledNumberValue < 0) {
                    invalidValueMsg =
                        "ScaledNumberValue with keyName TIME_TO_AC_CHARGE_POWER_MAX must be set with "
                            + "value >= 0";
                }
                break;
            case TIME_TO_AC_DISCHARGE_POWER_MAX:
                if (scaledNumberValue == null || scaledNumberValue < 0) {
                    invalidValueMsg =
                        "ScaledNumberValue with keyName TIME_TO_AC_DISCHARGE_POWER_MAX must be set with "
                            + "value >= 0";
                }
                break;
            case BATTERY_TYPE:
                allowedStrings = List.of(
                    "liIon",
                    "leadAcid",
                    "redoxFlow",
                    "sodiumIon"
                );
                if (stringValue == null || !allowedStrings.contains(stringValue)) {
                    invalidValueMsg =
                        "Value with keyName BATTERY_TYPE must be string and shall use one of the "
                            + "following: "
                            + allowedStrings;
                }
                break;
            case MAX_CYCLE_COUNT_PER_DAY:
                if (scaledNumberValue == null || scaledNumberValue < 0) {
                    invalidValueMsg =
                        "ScaledNumberValue with keyName MAX_CYCLE_COUNT_PER_DAY must be set with "
                            + "value >= 0";
                }
                break;
            case BATTERY_ACTIVE_CONTROL_MODE:
                allowedStrings = List.of("Power", "PCC", "Auto");
                if (stringValue == null || !allowedStrings.contains(stringValue)) {
                    invalidValueMsg =
                        "Value with keyName BATTERY_ACTIVE_CONTROL_MODE must be string and shall use one "
                            + "of the following: "
                            + allowedStrings;
                }
                break;
            case FAILSAFE_DURATION_MINIMUM:
            case INCENTIVES_TIMEOUT_INCENTIVE_REQUEST:
                if (data.getValue().getDuration() == null) {
                    invalidValueMsg = "Value with keyName "
                        + keyName
                        + " must be duration type";
                }
                break;
            case INCENTIVES_WAIT_INCENTIVE_WRITEABLE:
            case INCENTIVES_SIMULATION_CYCLES_MAX:
                if (data.getValue().getInteger() == null) {
                    invalidValueMsg = "Value with keyName "
                        + keyName
                        + " must be integer";
                }
                break;
            case INCENTIVES_SIMULATION_CONCURRENT:
            case DISCHARGING_BELOW_TARGET_ENERGY_REQUEST_PERMITTED:
            case ASYMMETRIC_CHARGING_SUPPORTED:
                if (booleanValue == null) {
                    invalidValueMsg = "Value with keyName "
                        + keyName
                        + " must be boolean";
                }
                break;
            case FAILSAFE_AC_POWER_SETPOINT:
            case FAILSAFE_DC_POWER_SETPOINT:
            case FAILSAFE_PCC_POWER_SETPOINT:
            case DEFAULT_AC_POWER:
            case DEFAULT_DC_POWER:
            case DEFAULT_PCC_POWER:
            case FAILSAFE_PRODUCTION_ACTIVE_POWER_LIMIT:
            case FAILSAFE_POSITIVE_REACTIVE_POWER_LIMIT:
            case FAILSAFE_NEGATIVE_REACTIVE_POWER_LIMIT:
            case FAILSAFE_POSITIVE_COS_PHI_LIMIT:
            case FAILSAFE_NEGATIVE_COS_PHI_LIMIT:
            case MAX_AC_CHARGE_POWER:
            case MAX_AC_DISCHARGE_POWER:
            case MAX_DC_CHARGE_POWER:
            case MAX_DC_DISCHARGE_POWER:
            case FAILSAFE_CONSUMPTION_ACTIVE_POWER_LIMIT:
            case AZIMUTH:
            case TILT:
                if (scaledNumberValue == null) {
                    invalidValueMsg = "ScaledNumberValue with keyName "
                        + keyName
                        + " must be set";
                }
                break;
        }
        return invalidValueMsg == null ? Optional.empty() : Optional.of(new DataValidationException(invalidValueMsg));
    }
}
