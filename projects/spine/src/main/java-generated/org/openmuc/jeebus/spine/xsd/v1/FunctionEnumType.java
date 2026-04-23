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
 * <p>Java class for FunctionEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="FunctionEnumType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="actuatorLevelData"/&gt;
 *     &lt;enumeration value="actuatorLevelDescriptionData"/&gt;
 *     &lt;enumeration value="actuatorSwitchData"/&gt;
 *     &lt;enumeration value="actuatorSwitchDescriptionData"/&gt;
 *     &lt;enumeration value="alarmListData"/&gt;
 *     &lt;enumeration value="bindingManagementDeleteCall"/&gt;
 *     &lt;enumeration value="bindingManagementEntryListData"/&gt;
 *     &lt;enumeration value="bindingManagementRequestCall"/&gt;
 *     &lt;enumeration value="dataTunnelingCall"/&gt;
 *     &lt;enumeration value="deviceClassificationManufacturerData"/&gt;
 *     &lt;enumeration value="deviceClassificationUserData"/&gt;
 *     &lt;enumeration value="deviceDiagnosisHeartbeatData"/&gt;
 *     &lt;enumeration value="deviceDiagnosisServiceData"/&gt;
 *     &lt;enumeration value="deviceDiagnosisStateData"/&gt;
 *     &lt;enumeration value="directControlActivityListData"/&gt;
 *     &lt;enumeration value="directControlDescriptionData"/&gt;
 *     &lt;enumeration value="electricalConnectionDescriptionListData"/&gt;
 *     &lt;enumeration value="electricalConnectionParameterDescriptionListData"/&gt;
 *     &lt;enumeration value="electricalConnectionStateListData"/&gt;
 *     &lt;enumeration value="hvacOperationModeDescriptionListData"/&gt;
 *     &lt;enumeration value="hvacOverrunDescriptionListData"/&gt;
 *     &lt;enumeration value="hvacOverrunListData"/&gt;
 *     &lt;enumeration value="hvacSystemFunctionDescriptionListData"/&gt;
 *     &lt;enumeration value="hvacSystemFunctionListData"/&gt;
 *     &lt;enumeration value="hvacSystemFunctionOperationModeRelationListData"/&gt;
 *     &lt;enumeration value="hvacSystemFunctionPowerSequenceRelationListData"/&gt;
 *     &lt;enumeration value="hvacSystemFunctionSetpointRelationListData"/&gt;
 *     &lt;enumeration value="loadControlEventListData"/&gt;
 *     &lt;enumeration value="loadControlStateListData"/&gt;
 *     &lt;enumeration value="measurementConstraintsListData"/&gt;
 *     &lt;enumeration value="measurementDescriptionListData"/&gt;
 *     &lt;enumeration value="measurementListData"/&gt;
 *     &lt;enumeration value="measurementThresholdRelationListData"/&gt;
 *     &lt;enumeration value="messagingListData"/&gt;
 *     &lt;enumeration value="networkManagementAbortCall"/&gt;
 *     &lt;enumeration value="networkManagementAddNodeCall"/&gt;
 *     &lt;enumeration value="networkManagementDeviceDescriptionListData"/&gt;
 *     &lt;enumeration value="networkManagementDiscoverCall"/&gt;
 *     &lt;enumeration value="networkManagementEntityDescriptionListData"/&gt;
 *     &lt;enumeration value="networkManagementFeatureDescriptionListData"/&gt;
 *     &lt;enumeration value="networkManagementJoiningModeData"/&gt;
 *     &lt;enumeration value="networkManagementModifyNodeCall"/&gt;
 *     &lt;enumeration value="networkManagementProcessStateData"/&gt;
 *     &lt;enumeration value="networkManagementRemoveNodeCall"/&gt;
 *     &lt;enumeration value="networkManagementReportCandidateData"/&gt;
 *     &lt;enumeration value="networkManagementScanNetworkCall"/&gt;
 *     &lt;enumeration value="nodeManagementBindingData"/&gt;
 *     &lt;enumeration value="nodeManagementBindingDeleteCall"/&gt;
 *     &lt;enumeration value="nodeManagementBindingRequestCall"/&gt;
 *     &lt;enumeration value="nodeManagementDestinationListData"/&gt;
 *     &lt;enumeration value="nodeManagementDetailedDiscoveryData"/&gt;
 *     &lt;enumeration value="nodeManagementSubscriptionData"/&gt;
 *     &lt;enumeration value="nodeManagementSubscriptionDeleteCall"/&gt;
 *     &lt;enumeration value="nodeManagementSubscriptionRequestCall"/&gt;
 *     &lt;enumeration value="operatingConstraintsDurationListData"/&gt;
 *     &lt;enumeration value="operatingConstraintsInterruptListData"/&gt;
 *     &lt;enumeration value="operatingConstraintsPowerDescriptionListData"/&gt;
 *     &lt;enumeration value="operatingConstraintsPowerLevelListData"/&gt;
 *     &lt;enumeration value="operatingConstraintsPowerRangeListData"/&gt;
 *     &lt;enumeration value="operatingConstraintsResumeImplicationListData"/&gt;
 *     &lt;enumeration value="powerSequenceAlternativesRelationListData"/&gt;
 *     &lt;enumeration value="powerSequenceDescriptionListData"/&gt;
 *     &lt;enumeration value="powerSequenceNodeScheduleInformationData"/&gt;
 *     &lt;enumeration value="powerSequencePriceCalculationRequestCall"/&gt;
 *     &lt;enumeration value="powerSequencePriceListData"/&gt;
 *     &lt;enumeration value="powerSequenceScheduleConfigurationRequestCall"/&gt;
 *     &lt;enumeration value="powerSequenceScheduleConstraintsListData"/&gt;
 *     &lt;enumeration value="powerSequenceScheduleListData"/&gt;
 *     &lt;enumeration value="powerSequenceSchedulePreferenceListData"/&gt;
 *     &lt;enumeration value="powerSequenceStateListData"/&gt;
 *     &lt;enumeration value="powerTimeSlotScheduleConstraintsListData"/&gt;
 *     &lt;enumeration value="powerTimeSlotScheduleListData"/&gt;
 *     &lt;enumeration value="powerTimeSlotValueListData"/&gt;
 *     &lt;enumeration value="resultData"/&gt;
 *     &lt;enumeration value="sensingDescriptionData"/&gt;
 *     &lt;enumeration value="sensingListData"/&gt;
 *     &lt;enumeration value="sessionIdentificationListData"/&gt;
 *     &lt;enumeration value="sessionMeasurementRelationListData"/&gt;
 *     &lt;enumeration value="setpointConstraintsListData"/&gt;
 *     &lt;enumeration value="setpointDescriptionListData"/&gt;
 *     &lt;enumeration value="setpointListData"/&gt;
 *     &lt;enumeration value="smartEnergyManagementPsConfigurationRequestCall"/&gt;
 *     &lt;enumeration value="smartEnergyManagementPsData"/&gt;
 *     &lt;enumeration value="smartEnergyManagementPsPriceCalculationRequestCall"/&gt;
 *     &lt;enumeration value="smartEnergyManagementPsPriceData"/&gt;
 *     &lt;enumeration value="specificationVersionListData"/&gt;
 *     &lt;enumeration value="subscriptionManagementDeleteCall"/&gt;
 *     &lt;enumeration value="subscriptionManagementEntryListData"/&gt;
 *     &lt;enumeration value="subscriptionManagementRequestCall"/&gt;
 *     &lt;enumeration value="supplyConditionDescriptionListData"/&gt;
 *     &lt;enumeration value="supplyConditionListData"/&gt;
 *     &lt;enumeration value="supplyConditionThresholdRelationListData"/&gt;
 *     &lt;enumeration value="taskManagementJobDescriptionListData"/&gt;
 *     &lt;enumeration value="taskManagementJobListData"/&gt;
 *     &lt;enumeration value="taskManagementJobRelationListData"/&gt;
 *     &lt;enumeration value="taskManagementOverviewData"/&gt;
 *     &lt;enumeration value="thresholdConstraintsListData"/&gt;
 *     &lt;enumeration value="thresholdDescriptionListData"/&gt;
 *     &lt;enumeration value="thresholdListData"/&gt;
 *     &lt;enumeration value="timeDistributorData"/&gt;
 *     &lt;enumeration value="timeDistributorEnquiryCall"/&gt;
 *     &lt;enumeration value="timeInformationData"/&gt;
 *     &lt;enumeration value="timePrecisionData"/&gt;
 *     &lt;enumeration value="timeTableConstraintsListData"/&gt;
 *     &lt;enumeration value="timeTableDescriptionListData"/&gt;
 *     &lt;enumeration value="timeTableListData"/&gt;
 *     &lt;enumeration value="deviceConfigurationKeyValueConstraintsListData"/&gt;
 *     &lt;enumeration value="deviceConfigurationKeyValueListData"/&gt;
 *     &lt;enumeration value="deviceConfigurationKeyValueDescriptionListData"/&gt;
 *     &lt;enumeration value="loadControlLimitConstraintsListData"/&gt;
 *     &lt;enumeration value="loadControlLimitDescriptionListData"/&gt;
 *     &lt;enumeration value="loadControlLimitListData"/&gt;
 *     &lt;enumeration value="loadControlNodeData"/&gt;
 *     &lt;enumeration value="timeSeriesConstraintsListData"/&gt;
 *     &lt;enumeration value="timeSeriesDescriptionListData"/&gt;
 *     &lt;enumeration value="timeSeriesListData"/&gt;
 *     &lt;enumeration value="tariffOverallConstraintsData"/&gt;
 *     &lt;enumeration value="tariffListData"/&gt;
 *     &lt;enumeration value="tariffBoundaryRelationListData"/&gt;
 *     &lt;enumeration value="tariffTierRelationListData"/&gt;
 *     &lt;enumeration value="tariffDescriptionListData"/&gt;
 *     &lt;enumeration value="tierBoundaryListData"/&gt;
 *     &lt;enumeration value="tierBoundaryDescriptionListData"/&gt;
 *     &lt;enumeration value="commodityListData"/&gt;
 *     &lt;enumeration value="tierListData"/&gt;
 *     &lt;enumeration value="tierIncentiveRelationListData"/&gt;
 *     &lt;enumeration value="tierDescriptionListData"/&gt;
 *     &lt;enumeration value="incentiveListData"/&gt;
 *     &lt;enumeration value="incentiveDescriptionListData"/&gt;
 *     &lt;enumeration value="incentiveTableData"/&gt;
 *     &lt;enumeration value="incentiveTableDescriptionData"/&gt;
 *     &lt;enumeration value="incentiveTableConstraintsData"/&gt;
 *     &lt;enumeration value="electricalConnectionPermittedValueSetListData"/&gt;
 *     &lt;enumeration value="useCaseInformationListData"/&gt;
 *     &lt;enumeration value="nodeManagementUseCaseData"/&gt;
 *     &lt;enumeration value="billConstraintsListData"/&gt;
 *     &lt;enumeration value="billDescriptionListData"/&gt;
 *     &lt;enumeration value="billListData"/&gt;
 *     &lt;enumeration value="identificationListData"/&gt;
 *     &lt;enumeration value="measurementSeriesListData"/&gt;
 *     &lt;enumeration value="electricalConnectionCharacteristicListData"/&gt;
 *     &lt;enumeration value="stateInformationListData"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FunctionEnumType")
@XmlEnum
public enum FunctionEnumType {

    @XmlEnumValue("actuatorLevelData")
    ACTUATOR_LEVEL_DATA("actuatorLevelData"),
    @XmlEnumValue("actuatorLevelDescriptionData")
    ACTUATOR_LEVEL_DESCRIPTION_DATA("actuatorLevelDescriptionData"),
    @XmlEnumValue("actuatorSwitchData")
    ACTUATOR_SWITCH_DATA("actuatorSwitchData"),
    @XmlEnumValue("actuatorSwitchDescriptionData")
    ACTUATOR_SWITCH_DESCRIPTION_DATA("actuatorSwitchDescriptionData"),
    @XmlEnumValue("alarmListData")
    ALARM_LIST_DATA("alarmListData"),
    @XmlEnumValue("bindingManagementDeleteCall")
    BINDING_MANAGEMENT_DELETE_CALL("bindingManagementDeleteCall"),
    @XmlEnumValue("bindingManagementEntryListData")
    BINDING_MANAGEMENT_ENTRY_LIST_DATA("bindingManagementEntryListData"),
    @XmlEnumValue("bindingManagementRequestCall")
    BINDING_MANAGEMENT_REQUEST_CALL("bindingManagementRequestCall"),
    @XmlEnumValue("dataTunnelingCall")
    DATA_TUNNELING_CALL("dataTunnelingCall"),
    @XmlEnumValue("deviceClassificationManufacturerData")
    DEVICE_CLASSIFICATION_MANUFACTURER_DATA("deviceClassificationManufacturerData"),
    @XmlEnumValue("deviceClassificationUserData")
    DEVICE_CLASSIFICATION_USER_DATA("deviceClassificationUserData"),
    @XmlEnumValue("deviceDiagnosisHeartbeatData")
    DEVICE_DIAGNOSIS_HEARTBEAT_DATA("deviceDiagnosisHeartbeatData"),
    @XmlEnumValue("deviceDiagnosisServiceData")
    DEVICE_DIAGNOSIS_SERVICE_DATA("deviceDiagnosisServiceData"),
    @XmlEnumValue("deviceDiagnosisStateData")
    DEVICE_DIAGNOSIS_STATE_DATA("deviceDiagnosisStateData"),
    @XmlEnumValue("directControlActivityListData")
    DIRECT_CONTROL_ACTIVITY_LIST_DATA("directControlActivityListData"),
    @XmlEnumValue("directControlDescriptionData")
    DIRECT_CONTROL_DESCRIPTION_DATA("directControlDescriptionData"),
    @XmlEnumValue("electricalConnectionDescriptionListData")
    ELECTRICAL_CONNECTION_DESCRIPTION_LIST_DATA("electricalConnectionDescriptionListData"),
    @XmlEnumValue("electricalConnectionParameterDescriptionListData")
    ELECTRICAL_CONNECTION_PARAMETER_DESCRIPTION_LIST_DATA("electricalConnectionParameterDescriptionListData"),
    @XmlEnumValue("electricalConnectionStateListData")
    ELECTRICAL_CONNECTION_STATE_LIST_DATA("electricalConnectionStateListData"),
    @XmlEnumValue("hvacOperationModeDescriptionListData")
    HVAC_OPERATION_MODE_DESCRIPTION_LIST_DATA("hvacOperationModeDescriptionListData"),
    @XmlEnumValue("hvacOverrunDescriptionListData")
    HVAC_OVERRUN_DESCRIPTION_LIST_DATA("hvacOverrunDescriptionListData"),
    @XmlEnumValue("hvacOverrunListData")
    HVAC_OVERRUN_LIST_DATA("hvacOverrunListData"),
    @XmlEnumValue("hvacSystemFunctionDescriptionListData")
    HVAC_SYSTEM_FUNCTION_DESCRIPTION_LIST_DATA("hvacSystemFunctionDescriptionListData"),
    @XmlEnumValue("hvacSystemFunctionListData")
    HVAC_SYSTEM_FUNCTION_LIST_DATA("hvacSystemFunctionListData"),
    @XmlEnumValue("hvacSystemFunctionOperationModeRelationListData")
    HVAC_SYSTEM_FUNCTION_OPERATION_MODE_RELATION_LIST_DATA("hvacSystemFunctionOperationModeRelationListData"),
    @XmlEnumValue("hvacSystemFunctionPowerSequenceRelationListData")
    HVAC_SYSTEM_FUNCTION_POWER_SEQUENCE_RELATION_LIST_DATA("hvacSystemFunctionPowerSequenceRelationListData"),
    @XmlEnumValue("hvacSystemFunctionSetpointRelationListData")
    HVAC_SYSTEM_FUNCTION_SETPOINT_RELATION_LIST_DATA("hvacSystemFunctionSetpointRelationListData"),
    @XmlEnumValue("loadControlEventListData")
    LOAD_CONTROL_EVENT_LIST_DATA("loadControlEventListData"),
    @XmlEnumValue("loadControlStateListData")
    LOAD_CONTROL_STATE_LIST_DATA("loadControlStateListData"),
    @XmlEnumValue("measurementConstraintsListData")
    MEASUREMENT_CONSTRAINTS_LIST_DATA("measurementConstraintsListData"),
    @XmlEnumValue("measurementDescriptionListData")
    MEASUREMENT_DESCRIPTION_LIST_DATA("measurementDescriptionListData"),
    @XmlEnumValue("measurementListData")
    MEASUREMENT_LIST_DATA("measurementListData"),
    @XmlEnumValue("measurementThresholdRelationListData")
    MEASUREMENT_THRESHOLD_RELATION_LIST_DATA("measurementThresholdRelationListData"),
    @XmlEnumValue("messagingListData")
    MESSAGING_LIST_DATA("messagingListData"),
    @XmlEnumValue("networkManagementAbortCall")
    NETWORK_MANAGEMENT_ABORT_CALL("networkManagementAbortCall"),
    @XmlEnumValue("networkManagementAddNodeCall")
    NETWORK_MANAGEMENT_ADD_NODE_CALL("networkManagementAddNodeCall"),
    @XmlEnumValue("networkManagementDeviceDescriptionListData")
    NETWORK_MANAGEMENT_DEVICE_DESCRIPTION_LIST_DATA("networkManagementDeviceDescriptionListData"),
    @XmlEnumValue("networkManagementDiscoverCall")
    NETWORK_MANAGEMENT_DISCOVER_CALL("networkManagementDiscoverCall"),
    @XmlEnumValue("networkManagementEntityDescriptionListData")
    NETWORK_MANAGEMENT_ENTITY_DESCRIPTION_LIST_DATA("networkManagementEntityDescriptionListData"),
    @XmlEnumValue("networkManagementFeatureDescriptionListData")
    NETWORK_MANAGEMENT_FEATURE_DESCRIPTION_LIST_DATA("networkManagementFeatureDescriptionListData"),
    @XmlEnumValue("networkManagementJoiningModeData")
    NETWORK_MANAGEMENT_JOINING_MODE_DATA("networkManagementJoiningModeData"),
    @XmlEnumValue("networkManagementModifyNodeCall")
    NETWORK_MANAGEMENT_MODIFY_NODE_CALL("networkManagementModifyNodeCall"),
    @XmlEnumValue("networkManagementProcessStateData")
    NETWORK_MANAGEMENT_PROCESS_STATE_DATA("networkManagementProcessStateData"),
    @XmlEnumValue("networkManagementRemoveNodeCall")
    NETWORK_MANAGEMENT_REMOVE_NODE_CALL("networkManagementRemoveNodeCall"),
    @XmlEnumValue("networkManagementReportCandidateData")
    NETWORK_MANAGEMENT_REPORT_CANDIDATE_DATA("networkManagementReportCandidateData"),
    @XmlEnumValue("networkManagementScanNetworkCall")
    NETWORK_MANAGEMENT_SCAN_NETWORK_CALL("networkManagementScanNetworkCall"),
    @XmlEnumValue("nodeManagementBindingData")
    NODE_MANAGEMENT_BINDING_DATA("nodeManagementBindingData"),
    @XmlEnumValue("nodeManagementBindingDeleteCall")
    NODE_MANAGEMENT_BINDING_DELETE_CALL("nodeManagementBindingDeleteCall"),
    @XmlEnumValue("nodeManagementBindingRequestCall")
    NODE_MANAGEMENT_BINDING_REQUEST_CALL("nodeManagementBindingRequestCall"),
    @XmlEnumValue("nodeManagementDestinationListData")
    NODE_MANAGEMENT_DESTINATION_LIST_DATA("nodeManagementDestinationListData"),
    @XmlEnumValue("nodeManagementDetailedDiscoveryData")
    NODE_MANAGEMENT_DETAILED_DISCOVERY_DATA("nodeManagementDetailedDiscoveryData"),
    @XmlEnumValue("nodeManagementSubscriptionData")
    NODE_MANAGEMENT_SUBSCRIPTION_DATA("nodeManagementSubscriptionData"),
    @XmlEnumValue("nodeManagementSubscriptionDeleteCall")
    NODE_MANAGEMENT_SUBSCRIPTION_DELETE_CALL("nodeManagementSubscriptionDeleteCall"),
    @XmlEnumValue("nodeManagementSubscriptionRequestCall")
    NODE_MANAGEMENT_SUBSCRIPTION_REQUEST_CALL("nodeManagementSubscriptionRequestCall"),
    @XmlEnumValue("operatingConstraintsDurationListData")
    OPERATING_CONSTRAINTS_DURATION_LIST_DATA("operatingConstraintsDurationListData"),
    @XmlEnumValue("operatingConstraintsInterruptListData")
    OPERATING_CONSTRAINTS_INTERRUPT_LIST_DATA("operatingConstraintsInterruptListData"),
    @XmlEnumValue("operatingConstraintsPowerDescriptionListData")
    OPERATING_CONSTRAINTS_POWER_DESCRIPTION_LIST_DATA("operatingConstraintsPowerDescriptionListData"),
    @XmlEnumValue("operatingConstraintsPowerLevelListData")
    OPERATING_CONSTRAINTS_POWER_LEVEL_LIST_DATA("operatingConstraintsPowerLevelListData"),
    @XmlEnumValue("operatingConstraintsPowerRangeListData")
    OPERATING_CONSTRAINTS_POWER_RANGE_LIST_DATA("operatingConstraintsPowerRangeListData"),
    @XmlEnumValue("operatingConstraintsResumeImplicationListData")
    OPERATING_CONSTRAINTS_RESUME_IMPLICATION_LIST_DATA("operatingConstraintsResumeImplicationListData"),
    @XmlEnumValue("powerSequenceAlternativesRelationListData")
    POWER_SEQUENCE_ALTERNATIVES_RELATION_LIST_DATA("powerSequenceAlternativesRelationListData"),
    @XmlEnumValue("powerSequenceDescriptionListData")
    POWER_SEQUENCE_DESCRIPTION_LIST_DATA("powerSequenceDescriptionListData"),
    @XmlEnumValue("powerSequenceNodeScheduleInformationData")
    POWER_SEQUENCE_NODE_SCHEDULE_INFORMATION_DATA("powerSequenceNodeScheduleInformationData"),
    @XmlEnumValue("powerSequencePriceCalculationRequestCall")
    POWER_SEQUENCE_PRICE_CALCULATION_REQUEST_CALL("powerSequencePriceCalculationRequestCall"),
    @XmlEnumValue("powerSequencePriceListData")
    POWER_SEQUENCE_PRICE_LIST_DATA("powerSequencePriceListData"),
    @XmlEnumValue("powerSequenceScheduleConfigurationRequestCall")
    POWER_SEQUENCE_SCHEDULE_CONFIGURATION_REQUEST_CALL("powerSequenceScheduleConfigurationRequestCall"),
    @XmlEnumValue("powerSequenceScheduleConstraintsListData")
    POWER_SEQUENCE_SCHEDULE_CONSTRAINTS_LIST_DATA("powerSequenceScheduleConstraintsListData"),
    @XmlEnumValue("powerSequenceScheduleListData")
    POWER_SEQUENCE_SCHEDULE_LIST_DATA("powerSequenceScheduleListData"),
    @XmlEnumValue("powerSequenceSchedulePreferenceListData")
    POWER_SEQUENCE_SCHEDULE_PREFERENCE_LIST_DATA("powerSequenceSchedulePreferenceListData"),
    @XmlEnumValue("powerSequenceStateListData")
    POWER_SEQUENCE_STATE_LIST_DATA("powerSequenceStateListData"),
    @XmlEnumValue("powerTimeSlotScheduleConstraintsListData")
    POWER_TIME_SLOT_SCHEDULE_CONSTRAINTS_LIST_DATA("powerTimeSlotScheduleConstraintsListData"),
    @XmlEnumValue("powerTimeSlotScheduleListData")
    POWER_TIME_SLOT_SCHEDULE_LIST_DATA("powerTimeSlotScheduleListData"),
    @XmlEnumValue("powerTimeSlotValueListData")
    POWER_TIME_SLOT_VALUE_LIST_DATA("powerTimeSlotValueListData"),
    @XmlEnumValue("resultData")
    RESULT_DATA("resultData"),
    @XmlEnumValue("sensingDescriptionData")
    SENSING_DESCRIPTION_DATA("sensingDescriptionData"),
    @XmlEnumValue("sensingListData")
    SENSING_LIST_DATA("sensingListData"),
    @XmlEnumValue("sessionIdentificationListData")
    SESSION_IDENTIFICATION_LIST_DATA("sessionIdentificationListData"),
    @XmlEnumValue("sessionMeasurementRelationListData")
    SESSION_MEASUREMENT_RELATION_LIST_DATA("sessionMeasurementRelationListData"),
    @XmlEnumValue("setpointConstraintsListData")
    SETPOINT_CONSTRAINTS_LIST_DATA("setpointConstraintsListData"),
    @XmlEnumValue("setpointDescriptionListData")
    SETPOINT_DESCRIPTION_LIST_DATA("setpointDescriptionListData"),
    @XmlEnumValue("setpointListData")
    SETPOINT_LIST_DATA("setpointListData"),
    @XmlEnumValue("smartEnergyManagementPsConfigurationRequestCall")
    SMART_ENERGY_MANAGEMENT_PS_CONFIGURATION_REQUEST_CALL("smartEnergyManagementPsConfigurationRequestCall"),
    @XmlEnumValue("smartEnergyManagementPsData")
    SMART_ENERGY_MANAGEMENT_PS_DATA("smartEnergyManagementPsData"),
    @XmlEnumValue("smartEnergyManagementPsPriceCalculationRequestCall")
    SMART_ENERGY_MANAGEMENT_PS_PRICE_CALCULATION_REQUEST_CALL("smartEnergyManagementPsPriceCalculationRequestCall"),
    @XmlEnumValue("smartEnergyManagementPsPriceData")
    SMART_ENERGY_MANAGEMENT_PS_PRICE_DATA("smartEnergyManagementPsPriceData"),
    @XmlEnumValue("specificationVersionListData")
    SPECIFICATION_VERSION_LIST_DATA("specificationVersionListData"),
    @XmlEnumValue("subscriptionManagementDeleteCall")
    SUBSCRIPTION_MANAGEMENT_DELETE_CALL("subscriptionManagementDeleteCall"),
    @XmlEnumValue("subscriptionManagementEntryListData")
    SUBSCRIPTION_MANAGEMENT_ENTRY_LIST_DATA("subscriptionManagementEntryListData"),
    @XmlEnumValue("subscriptionManagementRequestCall")
    SUBSCRIPTION_MANAGEMENT_REQUEST_CALL("subscriptionManagementRequestCall"),
    @XmlEnumValue("supplyConditionDescriptionListData")
    SUPPLY_CONDITION_DESCRIPTION_LIST_DATA("supplyConditionDescriptionListData"),
    @XmlEnumValue("supplyConditionListData")
    SUPPLY_CONDITION_LIST_DATA("supplyConditionListData"),
    @XmlEnumValue("supplyConditionThresholdRelationListData")
    SUPPLY_CONDITION_THRESHOLD_RELATION_LIST_DATA("supplyConditionThresholdRelationListData"),
    @XmlEnumValue("taskManagementJobDescriptionListData")
    TASK_MANAGEMENT_JOB_DESCRIPTION_LIST_DATA("taskManagementJobDescriptionListData"),
    @XmlEnumValue("taskManagementJobListData")
    TASK_MANAGEMENT_JOB_LIST_DATA("taskManagementJobListData"),
    @XmlEnumValue("taskManagementJobRelationListData")
    TASK_MANAGEMENT_JOB_RELATION_LIST_DATA("taskManagementJobRelationListData"),
    @XmlEnumValue("taskManagementOverviewData")
    TASK_MANAGEMENT_OVERVIEW_DATA("taskManagementOverviewData"),
    @XmlEnumValue("thresholdConstraintsListData")
    THRESHOLD_CONSTRAINTS_LIST_DATA("thresholdConstraintsListData"),
    @XmlEnumValue("thresholdDescriptionListData")
    THRESHOLD_DESCRIPTION_LIST_DATA("thresholdDescriptionListData"),
    @XmlEnumValue("thresholdListData")
    THRESHOLD_LIST_DATA("thresholdListData"),
    @XmlEnumValue("timeDistributorData")
    TIME_DISTRIBUTOR_DATA("timeDistributorData"),
    @XmlEnumValue("timeDistributorEnquiryCall")
    TIME_DISTRIBUTOR_ENQUIRY_CALL("timeDistributorEnquiryCall"),
    @XmlEnumValue("timeInformationData")
    TIME_INFORMATION_DATA("timeInformationData"),
    @XmlEnumValue("timePrecisionData")
    TIME_PRECISION_DATA("timePrecisionData"),
    @XmlEnumValue("timeTableConstraintsListData")
    TIME_TABLE_CONSTRAINTS_LIST_DATA("timeTableConstraintsListData"),
    @XmlEnumValue("timeTableDescriptionListData")
    TIME_TABLE_DESCRIPTION_LIST_DATA("timeTableDescriptionListData"),
    @XmlEnumValue("timeTableListData")
    TIME_TABLE_LIST_DATA("timeTableListData"),
    @XmlEnumValue("deviceConfigurationKeyValueConstraintsListData")
    DEVICE_CONFIGURATION_KEY_VALUE_CONSTRAINTS_LIST_DATA("deviceConfigurationKeyValueConstraintsListData"),
    @XmlEnumValue("deviceConfigurationKeyValueListData")
    DEVICE_CONFIGURATION_KEY_VALUE_LIST_DATA("deviceConfigurationKeyValueListData"),
    @XmlEnumValue("deviceConfigurationKeyValueDescriptionListData")
    DEVICE_CONFIGURATION_KEY_VALUE_DESCRIPTION_LIST_DATA("deviceConfigurationKeyValueDescriptionListData"),
    @XmlEnumValue("loadControlLimitConstraintsListData")
    LOAD_CONTROL_LIMIT_CONSTRAINTS_LIST_DATA("loadControlLimitConstraintsListData"),
    @XmlEnumValue("loadControlLimitDescriptionListData")
    LOAD_CONTROL_LIMIT_DESCRIPTION_LIST_DATA("loadControlLimitDescriptionListData"),
    @XmlEnumValue("loadControlLimitListData")
    LOAD_CONTROL_LIMIT_LIST_DATA("loadControlLimitListData"),
    @XmlEnumValue("loadControlNodeData")
    LOAD_CONTROL_NODE_DATA("loadControlNodeData"),
    @XmlEnumValue("timeSeriesConstraintsListData")
    TIME_SERIES_CONSTRAINTS_LIST_DATA("timeSeriesConstraintsListData"),
    @XmlEnumValue("timeSeriesDescriptionListData")
    TIME_SERIES_DESCRIPTION_LIST_DATA("timeSeriesDescriptionListData"),
    @XmlEnumValue("timeSeriesListData")
    TIME_SERIES_LIST_DATA("timeSeriesListData"),
    @XmlEnumValue("tariffOverallConstraintsData")
    TARIFF_OVERALL_CONSTRAINTS_DATA("tariffOverallConstraintsData"),
    @XmlEnumValue("tariffListData")
    TARIFF_LIST_DATA("tariffListData"),
    @XmlEnumValue("tariffBoundaryRelationListData")
    TARIFF_BOUNDARY_RELATION_LIST_DATA("tariffBoundaryRelationListData"),
    @XmlEnumValue("tariffTierRelationListData")
    TARIFF_TIER_RELATION_LIST_DATA("tariffTierRelationListData"),
    @XmlEnumValue("tariffDescriptionListData")
    TARIFF_DESCRIPTION_LIST_DATA("tariffDescriptionListData"),
    @XmlEnumValue("tierBoundaryListData")
    TIER_BOUNDARY_LIST_DATA("tierBoundaryListData"),
    @XmlEnumValue("tierBoundaryDescriptionListData")
    TIER_BOUNDARY_DESCRIPTION_LIST_DATA("tierBoundaryDescriptionListData"),
    @XmlEnumValue("commodityListData")
    COMMODITY_LIST_DATA("commodityListData"),
    @XmlEnumValue("tierListData")
    TIER_LIST_DATA("tierListData"),
    @XmlEnumValue("tierIncentiveRelationListData")
    TIER_INCENTIVE_RELATION_LIST_DATA("tierIncentiveRelationListData"),
    @XmlEnumValue("tierDescriptionListData")
    TIER_DESCRIPTION_LIST_DATA("tierDescriptionListData"),
    @XmlEnumValue("incentiveListData")
    INCENTIVE_LIST_DATA("incentiveListData"),
    @XmlEnumValue("incentiveDescriptionListData")
    INCENTIVE_DESCRIPTION_LIST_DATA("incentiveDescriptionListData"),
    @XmlEnumValue("incentiveTableData")
    INCENTIVE_TABLE_DATA("incentiveTableData"),
    @XmlEnumValue("incentiveTableDescriptionData")
    INCENTIVE_TABLE_DESCRIPTION_DATA("incentiveTableDescriptionData"),
    @XmlEnumValue("incentiveTableConstraintsData")
    INCENTIVE_TABLE_CONSTRAINTS_DATA("incentiveTableConstraintsData"),
    @XmlEnumValue("electricalConnectionPermittedValueSetListData")
    ELECTRICAL_CONNECTION_PERMITTED_VALUE_SET_LIST_DATA("electricalConnectionPermittedValueSetListData"),
    @XmlEnumValue("useCaseInformationListData")
    USE_CASE_INFORMATION_LIST_DATA("useCaseInformationListData"),
    @XmlEnumValue("nodeManagementUseCaseData")
    NODE_MANAGEMENT_USE_CASE_DATA("nodeManagementUseCaseData"),
    @XmlEnumValue("billConstraintsListData")
    BILL_CONSTRAINTS_LIST_DATA("billConstraintsListData"),
    @XmlEnumValue("billDescriptionListData")
    BILL_DESCRIPTION_LIST_DATA("billDescriptionListData"),
    @XmlEnumValue("billListData")
    BILL_LIST_DATA("billListData"),
    @XmlEnumValue("identificationListData")
    IDENTIFICATION_LIST_DATA("identificationListData"),
    @XmlEnumValue("measurementSeriesListData")
    MEASUREMENT_SERIES_LIST_DATA("measurementSeriesListData"),
    @XmlEnumValue("electricalConnectionCharacteristicListData")
    ELECTRICAL_CONNECTION_CHARACTERISTIC_LIST_DATA("electricalConnectionCharacteristicListData"),
    @XmlEnumValue("stateInformationListData")
    STATE_INFORMATION_LIST_DATA("stateInformationListData");
    private final String value;

    FunctionEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FunctionEnumType fromValue(String v) {
        for (FunctionEnumType c: FunctionEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
