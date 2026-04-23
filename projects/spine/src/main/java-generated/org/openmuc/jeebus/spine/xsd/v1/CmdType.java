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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.HexBinaryAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.jvnet.jaxb.lang.CopyStrategy;
import org.jvnet.jaxb.lang.CopyTo;
import org.jvnet.jaxb.lang.JAXBCopyStrategy;
import org.jvnet.jaxb.lang.ToString;
import org.jvnet.jaxb.lang.ToStringStrategy;
import org.jvnet.jaxb.locator.ObjectLocator;
import org.jvnet.jaxb.locator.util.LocatorUtils;
import org.openmuc.jeebus.spine.impl.parser.CustomToStringStrategy;


/**
 * <p>Java class for CmdType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CmdType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://docs.eebus.org/spine/xsd/v1}PayloadContributionGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CmdType", propOrder = {
    "function",
    "filter",
    "actuatorLevelData",
    "actuatorLevelDescriptionData",
    "actuatorSwitchData",
    "actuatorSwitchDescriptionData",
    "alarmListData",
    "billConstraintsListData",
    "billDescriptionListData",
    "billListData",
    "bindingManagementDeleteCall",
    "bindingManagementEntryListData",
    "bindingManagementRequestCall",
    "commodityListData",
    "dataTunnelingCall",
    "deviceClassificationManufacturerData",
    "deviceClassificationUserData",
    "deviceConfigurationKeyValueConstraintsListData",
    "deviceConfigurationKeyValueDescriptionListData",
    "deviceConfigurationKeyValueListData",
    "deviceDiagnosisHeartbeatData",
    "deviceDiagnosisServiceData",
    "deviceDiagnosisStateData",
    "directControlActivityListData",
    "directControlDescriptionData",
    "electricalConnectionCharacteristicListData",
    "electricalConnectionDescriptionListData",
    "electricalConnectionParameterDescriptionListData",
    "electricalConnectionPermittedValueSetListData",
    "electricalConnectionStateListData",
    "hvacOperationModeDescriptionListData",
    "hvacOverrunDescriptionListData",
    "hvacOverrunListData",
    "hvacSystemFunctionDescriptionListData",
    "hvacSystemFunctionListData",
    "hvacSystemFunctionOperationModeRelationListData",
    "hvacSystemFunctionPowerSequenceRelationListData",
    "hvacSystemFunctionSetpointRelationListData",
    "identificationListData",
    "incentiveDescriptionListData",
    "incentiveListData",
    "incentiveTableConstraintsData",
    "incentiveTableData",
    "incentiveTableDescriptionData",
    "loadControlEventListData",
    "loadControlLimitConstraintsListData",
    "loadControlLimitDescriptionListData",
    "loadControlLimitListData",
    "loadControlNodeData",
    "loadControlStateListData",
    "measurementConstraintsListData",
    "measurementDescriptionListData",
    "measurementListData",
    "measurementSeriesListData",
    "measurementThresholdRelationListData",
    "messagingListData",
    "networkManagementAbortCall",
    "networkManagementAddNodeCall",
    "networkManagementDeviceDescriptionListData",
    "networkManagementDiscoverCall",
    "networkManagementEntityDescriptionListData",
    "networkManagementFeatureDescriptionListData",
    "networkManagementJoiningModeData",
    "networkManagementModifyNodeCall",
    "networkManagementProcessStateData",
    "networkManagementRemoveNodeCall",
    "networkManagementReportCandidateData",
    "networkManagementScanNetworkCall",
    "nodeManagementBindingData",
    "nodeManagementBindingDeleteCall",
    "nodeManagementBindingRequestCall",
    "nodeManagementDestinationListData",
    "nodeManagementDetailedDiscoveryData",
    "nodeManagementSubscriptionData",
    "nodeManagementSubscriptionDeleteCall",
    "nodeManagementSubscriptionRequestCall",
    "nodeManagementUseCaseData",
    "operatingConstraintsDurationListData",
    "operatingConstraintsInterruptListData",
    "operatingConstraintsPowerDescriptionListData",
    "operatingConstraintsPowerLevelListData",
    "operatingConstraintsPowerRangeListData",
    "operatingConstraintsResumeImplicationListData",
    "powerSequenceAlternativesRelationListData",
    "powerSequenceDescriptionListData",
    "powerSequenceNodeScheduleInformationData",
    "powerSequencePriceCalculationRequestCall",
    "powerSequencePriceListData",
    "powerSequenceScheduleConfigurationRequestCall",
    "powerSequenceScheduleConstraintsListData",
    "powerSequenceScheduleListData",
    "powerSequenceSchedulePreferenceListData",
    "powerSequenceStateListData",
    "powerTimeSlotScheduleConstraintsListData",
    "powerTimeSlotScheduleListData",
    "powerTimeSlotValueListData",
    "resultData",
    "sensingDescriptionData",
    "sensingListData",
    "sessionIdentificationListData",
    "sessionMeasurementRelationListData",
    "setpointConstraintsListData",
    "setpointDescriptionListData",
    "setpointListData",
    "smartEnergyManagementPsConfigurationRequestCall",
    "smartEnergyManagementPsData",
    "smartEnergyManagementPsPriceCalculationRequestCall",
    "smartEnergyManagementPsPriceData",
    "specificationVersionListData",
    "stateInformationListData",
    "subscriptionManagementDeleteCall",
    "subscriptionManagementEntryListData",
    "subscriptionManagementRequestCall",
    "supplyConditionDescriptionListData",
    "supplyConditionListData",
    "supplyConditionThresholdRelationListData",
    "tariffBoundaryRelationListData",
    "tariffDescriptionListData",
    "tariffListData",
    "tariffOverallConstraintsData",
    "tariffTierRelationListData",
    "taskManagementJobDescriptionListData",
    "taskManagementJobListData",
    "taskManagementJobRelationListData",
    "taskManagementOverviewData",
    "thresholdConstraintsListData",
    "thresholdDescriptionListData",
    "thresholdListData",
    "tierBoundaryDescriptionListData",
    "tierBoundaryListData",
    "tierDescriptionListData",
    "tierIncentiveRelationListData",
    "tierListData",
    "timeDistributorData",
    "timeDistributorEnquiryCall",
    "timeInformationData",
    "timePrecisionData",
    "timeSeriesConstraintsListData",
    "timeSeriesDescriptionListData",
    "timeSeriesListData",
    "timeTableConstraintsListData",
    "timeTableDescriptionListData",
    "timeTableListData",
    "useCaseInformationListData",
    "manufacturerSpecificExtension",
    "lastUpdateAt"
})
public class CmdType implements Cloneable, CopyTo, ToString
{

    protected String function;
    protected List<FilterType> filter;
    protected ActuatorLevelDataType actuatorLevelData;
    protected ActuatorLevelDescriptionDataType actuatorLevelDescriptionData;
    protected ActuatorSwitchDataType actuatorSwitchData;
    protected ActuatorSwitchDescriptionDataType actuatorSwitchDescriptionData;
    protected AlarmListDataType alarmListData;
    protected BillConstraintsListDataType billConstraintsListData;
    protected BillDescriptionListDataType billDescriptionListData;
    protected BillListDataType billListData;
    protected BindingManagementDeleteCallType bindingManagementDeleteCall;
    protected BindingManagementEntryListDataType bindingManagementEntryListData;
    protected BindingManagementRequestCallType bindingManagementRequestCall;
    protected CommodityListDataType commodityListData;
    protected DataTunnelingCallType dataTunnelingCall;
    protected DeviceClassificationManufacturerDataType deviceClassificationManufacturerData;
    protected DeviceClassificationUserDataType deviceClassificationUserData;
    protected DeviceConfigurationKeyValueConstraintsListDataType deviceConfigurationKeyValueConstraintsListData;
    protected DeviceConfigurationKeyValueDescriptionListDataType deviceConfigurationKeyValueDescriptionListData;
    protected DeviceConfigurationKeyValueListDataType deviceConfigurationKeyValueListData;
    protected DeviceDiagnosisHeartbeatDataType deviceDiagnosisHeartbeatData;
    protected DeviceDiagnosisServiceDataType deviceDiagnosisServiceData;
    protected DeviceDiagnosisStateDataType deviceDiagnosisStateData;
    protected DirectControlActivityListDataType directControlActivityListData;
    protected DirectControlDescriptionDataType directControlDescriptionData;
    protected ElectricalConnectionCharacteristicListDataType electricalConnectionCharacteristicListData;
    protected ElectricalConnectionDescriptionListDataType electricalConnectionDescriptionListData;
    protected ElectricalConnectionParameterDescriptionListDataType electricalConnectionParameterDescriptionListData;
    protected ElectricalConnectionPermittedValueSetListDataType electricalConnectionPermittedValueSetListData;
    protected ElectricalConnectionStateListDataType electricalConnectionStateListData;
    protected HvacOperationModeDescriptionListDataType hvacOperationModeDescriptionListData;
    protected HvacOverrunDescriptionListDataType hvacOverrunDescriptionListData;
    protected HvacOverrunListDataType hvacOverrunListData;
    protected HvacSystemFunctionDescriptionListDataType hvacSystemFunctionDescriptionListData;
    protected HvacSystemFunctionListDataType hvacSystemFunctionListData;
    protected HvacSystemFunctionOperationModeRelationListDataType hvacSystemFunctionOperationModeRelationListData;
    protected HvacSystemFunctionPowerSequenceRelationListDataType hvacSystemFunctionPowerSequenceRelationListData;
    protected HvacSystemFunctionSetpointRelationListDataType hvacSystemFunctionSetpointRelationListData;
    protected IdentificationListDataType identificationListData;
    protected IncentiveDescriptionListDataType incentiveDescriptionListData;
    protected IncentiveListDataType incentiveListData;
    protected IncentiveTableConstraintsDataType incentiveTableConstraintsData;
    protected IncentiveTableDataType incentiveTableData;
    protected IncentiveTableDescriptionDataType incentiveTableDescriptionData;
    protected LoadControlEventListDataType loadControlEventListData;
    protected LoadControlLimitConstraintsListDataType loadControlLimitConstraintsListData;
    protected LoadControlLimitDescriptionListDataType loadControlLimitDescriptionListData;
    protected LoadControlLimitListDataType loadControlLimitListData;
    protected LoadControlNodeDataType loadControlNodeData;
    protected LoadControlStateListDataType loadControlStateListData;
    protected MeasurementConstraintsListDataType measurementConstraintsListData;
    protected MeasurementDescriptionListDataType measurementDescriptionListData;
    protected MeasurementListDataType measurementListData;
    protected MeasurementSeriesListDataType measurementSeriesListData;
    protected MeasurementThresholdRelationListDataType measurementThresholdRelationListData;
    protected MessagingListDataType messagingListData;
    protected NetworkManagementAbortCallType networkManagementAbortCall;
    protected NetworkManagementAddNodeCallType networkManagementAddNodeCall;
    protected NetworkManagementDeviceDescriptionListDataType networkManagementDeviceDescriptionListData;
    protected NetworkManagementDiscoverCallType networkManagementDiscoverCall;
    protected NetworkManagementEntityDescriptionListDataType networkManagementEntityDescriptionListData;
    protected NetworkManagementFeatureDescriptionListDataType networkManagementFeatureDescriptionListData;
    protected NetworkManagementJoiningModeDataType networkManagementJoiningModeData;
    protected NetworkManagementModifyNodeCallType networkManagementModifyNodeCall;
    protected NetworkManagementProcessStateDataType networkManagementProcessStateData;
    protected NetworkManagementRemoveNodeCallType networkManagementRemoveNodeCall;
    protected NetworkManagementReportCandidateDataType networkManagementReportCandidateData;
    protected NetworkManagementScanNetworkCallType networkManagementScanNetworkCall;
    protected NodeManagementBindingDataType nodeManagementBindingData;
    protected NodeManagementBindingDeleteCallType nodeManagementBindingDeleteCall;
    protected NodeManagementBindingRequestCallType nodeManagementBindingRequestCall;
    protected NodeManagementDestinationListDataType nodeManagementDestinationListData;
    protected NodeManagementDetailedDiscoveryDataType nodeManagementDetailedDiscoveryData;
    protected NodeManagementSubscriptionDataType nodeManagementSubscriptionData;
    protected NodeManagementSubscriptionDeleteCallType nodeManagementSubscriptionDeleteCall;
    protected NodeManagementSubscriptionRequestCallType nodeManagementSubscriptionRequestCall;
    protected NodeManagementUseCaseDataType nodeManagementUseCaseData;
    protected OperatingConstraintsDurationListDataType operatingConstraintsDurationListData;
    protected OperatingConstraintsInterruptListDataType operatingConstraintsInterruptListData;
    protected OperatingConstraintsPowerDescriptionListDataType operatingConstraintsPowerDescriptionListData;
    protected OperatingConstraintsPowerLevelListDataType operatingConstraintsPowerLevelListData;
    protected OperatingConstraintsPowerRangeListDataType operatingConstraintsPowerRangeListData;
    protected OperatingConstraintsResumeImplicationListDataType operatingConstraintsResumeImplicationListData;
    protected PowerSequenceAlternativesRelationListDataType powerSequenceAlternativesRelationListData;
    protected PowerSequenceDescriptionListDataType powerSequenceDescriptionListData;
    protected PowerSequenceNodeScheduleInformationDataType powerSequenceNodeScheduleInformationData;
    protected PowerSequencePriceCalculationRequestCallType powerSequencePriceCalculationRequestCall;
    protected PowerSequencePriceListDataType powerSequencePriceListData;
    protected PowerSequenceScheduleConfigurationRequestCallType powerSequenceScheduleConfigurationRequestCall;
    protected PowerSequenceScheduleConstraintsListDataType powerSequenceScheduleConstraintsListData;
    protected PowerSequenceScheduleListDataType powerSequenceScheduleListData;
    protected PowerSequenceSchedulePreferenceListDataType powerSequenceSchedulePreferenceListData;
    protected PowerSequenceStateListDataType powerSequenceStateListData;
    protected PowerTimeSlotScheduleConstraintsListDataType powerTimeSlotScheduleConstraintsListData;
    protected PowerTimeSlotScheduleListDataType powerTimeSlotScheduleListData;
    protected PowerTimeSlotValueListDataType powerTimeSlotValueListData;
    protected ResultDataType resultData;
    protected SensingDescriptionDataType sensingDescriptionData;
    protected SensingListDataType sensingListData;
    protected SessionIdentificationListDataType sessionIdentificationListData;
    protected SessionMeasurementRelationListDataType sessionMeasurementRelationListData;
    protected SetpointConstraintsListDataType setpointConstraintsListData;
    protected SetpointDescriptionListDataType setpointDescriptionListData;
    protected SetpointListDataType setpointListData;
    protected SmartEnergyManagementPsConfigurationRequestCallType smartEnergyManagementPsConfigurationRequestCall;
    protected SmartEnergyManagementPsDataType smartEnergyManagementPsData;
    protected SmartEnergyManagementPsPriceCalculationRequestCallType smartEnergyManagementPsPriceCalculationRequestCall;
    protected SmartEnergyManagementPsPriceDataType smartEnergyManagementPsPriceData;
    protected SpecificationVersionListDataType specificationVersionListData;
    protected StateInformationListDataType stateInformationListData;
    protected SubscriptionManagementDeleteCallType subscriptionManagementDeleteCall;
    protected SubscriptionManagementEntryListDataType subscriptionManagementEntryListData;
    protected SubscriptionManagementRequestCallType subscriptionManagementRequestCall;
    protected SupplyConditionDescriptionListDataType supplyConditionDescriptionListData;
    protected SupplyConditionListDataType supplyConditionListData;
    protected SupplyConditionThresholdRelationListDataType supplyConditionThresholdRelationListData;
    protected TariffBoundaryRelationListDataType tariffBoundaryRelationListData;
    protected TariffDescriptionListDataType tariffDescriptionListData;
    protected TariffListDataType tariffListData;
    protected TariffOverallConstraintsDataType tariffOverallConstraintsData;
    protected TariffTierRelationListDataType tariffTierRelationListData;
    protected TaskManagementJobDescriptionListDataType taskManagementJobDescriptionListData;
    protected TaskManagementJobListDataType taskManagementJobListData;
    protected TaskManagementJobRelationListDataType taskManagementJobRelationListData;
    protected TaskManagementOverviewDataType taskManagementOverviewData;
    protected ThresholdConstraintsListDataType thresholdConstraintsListData;
    protected ThresholdDescriptionListDataType thresholdDescriptionListData;
    protected ThresholdListDataType thresholdListData;
    protected TierBoundaryDescriptionListDataType tierBoundaryDescriptionListData;
    protected TierBoundaryListDataType tierBoundaryListData;
    protected TierDescriptionListDataType tierDescriptionListData;
    protected TierIncentiveRelationListDataType tierIncentiveRelationListData;
    protected TierListDataType tierListData;
    protected TimeDistributorDataType timeDistributorData;
    protected TimeDistributorEnquiryCallType timeDistributorEnquiryCall;
    protected TimeInformationDataType timeInformationData;
    protected TimePrecisionDataType timePrecisionData;
    protected TimeSeriesConstraintsListDataType timeSeriesConstraintsListData;
    protected TimeSeriesDescriptionListDataType timeSeriesDescriptionListData;
    protected TimeSeriesListDataType timeSeriesListData;
    protected TimeTableConstraintsListDataType timeTableConstraintsListData;
    protected TimeTableDescriptionListDataType timeTableDescriptionListData;
    protected TimeTableListDataType timeTableListData;
    protected UseCaseInformationListDataType useCaseInformationListData;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] manufacturerSpecificExtension;
    protected String lastUpdateAt;

    /**
     * Default no-arg constructor
     * 
     */
    public CmdType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public CmdType(final String function, final List<FilterType> filter, final ActuatorLevelDataType actuatorLevelData, final ActuatorLevelDescriptionDataType actuatorLevelDescriptionData, final ActuatorSwitchDataType actuatorSwitchData, final ActuatorSwitchDescriptionDataType actuatorSwitchDescriptionData, final AlarmListDataType alarmListData, final BillConstraintsListDataType billConstraintsListData, final BillDescriptionListDataType billDescriptionListData, final BillListDataType billListData, final BindingManagementDeleteCallType bindingManagementDeleteCall, final BindingManagementEntryListDataType bindingManagementEntryListData, final BindingManagementRequestCallType bindingManagementRequestCall, final CommodityListDataType commodityListData, final DataTunnelingCallType dataTunnelingCall, final DeviceClassificationManufacturerDataType deviceClassificationManufacturerData, final DeviceClassificationUserDataType deviceClassificationUserData, final DeviceConfigurationKeyValueConstraintsListDataType deviceConfigurationKeyValueConstraintsListData, final DeviceConfigurationKeyValueDescriptionListDataType deviceConfigurationKeyValueDescriptionListData, final DeviceConfigurationKeyValueListDataType deviceConfigurationKeyValueListData, final DeviceDiagnosisHeartbeatDataType deviceDiagnosisHeartbeatData, final DeviceDiagnosisServiceDataType deviceDiagnosisServiceData, final DeviceDiagnosisStateDataType deviceDiagnosisStateData, final DirectControlActivityListDataType directControlActivityListData, final DirectControlDescriptionDataType directControlDescriptionData, final ElectricalConnectionCharacteristicListDataType electricalConnectionCharacteristicListData, final ElectricalConnectionDescriptionListDataType electricalConnectionDescriptionListData, final ElectricalConnectionParameterDescriptionListDataType electricalConnectionParameterDescriptionListData, final ElectricalConnectionPermittedValueSetListDataType electricalConnectionPermittedValueSetListData, final ElectricalConnectionStateListDataType electricalConnectionStateListData, final HvacOperationModeDescriptionListDataType hvacOperationModeDescriptionListData, final HvacOverrunDescriptionListDataType hvacOverrunDescriptionListData, final HvacOverrunListDataType hvacOverrunListData, final HvacSystemFunctionDescriptionListDataType hvacSystemFunctionDescriptionListData, final HvacSystemFunctionListDataType hvacSystemFunctionListData, final HvacSystemFunctionOperationModeRelationListDataType hvacSystemFunctionOperationModeRelationListData, final HvacSystemFunctionPowerSequenceRelationListDataType hvacSystemFunctionPowerSequenceRelationListData, final HvacSystemFunctionSetpointRelationListDataType hvacSystemFunctionSetpointRelationListData, final IdentificationListDataType identificationListData, final IncentiveDescriptionListDataType incentiveDescriptionListData, final IncentiveListDataType incentiveListData, final IncentiveTableConstraintsDataType incentiveTableConstraintsData, final IncentiveTableDataType incentiveTableData, final IncentiveTableDescriptionDataType incentiveTableDescriptionData, final LoadControlEventListDataType loadControlEventListData, final LoadControlLimitConstraintsListDataType loadControlLimitConstraintsListData, final LoadControlLimitDescriptionListDataType loadControlLimitDescriptionListData, final LoadControlLimitListDataType loadControlLimitListData, final LoadControlNodeDataType loadControlNodeData, final LoadControlStateListDataType loadControlStateListData, final MeasurementConstraintsListDataType measurementConstraintsListData, final MeasurementDescriptionListDataType measurementDescriptionListData, final MeasurementListDataType measurementListData, final MeasurementSeriesListDataType measurementSeriesListData, final MeasurementThresholdRelationListDataType measurementThresholdRelationListData, final MessagingListDataType messagingListData, final NetworkManagementAbortCallType networkManagementAbortCall, final NetworkManagementAddNodeCallType networkManagementAddNodeCall, final NetworkManagementDeviceDescriptionListDataType networkManagementDeviceDescriptionListData, final NetworkManagementDiscoverCallType networkManagementDiscoverCall, final NetworkManagementEntityDescriptionListDataType networkManagementEntityDescriptionListData, final NetworkManagementFeatureDescriptionListDataType networkManagementFeatureDescriptionListData, final NetworkManagementJoiningModeDataType networkManagementJoiningModeData, final NetworkManagementModifyNodeCallType networkManagementModifyNodeCall, final NetworkManagementProcessStateDataType networkManagementProcessStateData, final NetworkManagementRemoveNodeCallType networkManagementRemoveNodeCall, final NetworkManagementReportCandidateDataType networkManagementReportCandidateData, final NetworkManagementScanNetworkCallType networkManagementScanNetworkCall, final NodeManagementBindingDataType nodeManagementBindingData, final NodeManagementBindingDeleteCallType nodeManagementBindingDeleteCall, final NodeManagementBindingRequestCallType nodeManagementBindingRequestCall, final NodeManagementDestinationListDataType nodeManagementDestinationListData, final NodeManagementDetailedDiscoveryDataType nodeManagementDetailedDiscoveryData, final NodeManagementSubscriptionDataType nodeManagementSubscriptionData, final NodeManagementSubscriptionDeleteCallType nodeManagementSubscriptionDeleteCall, final NodeManagementSubscriptionRequestCallType nodeManagementSubscriptionRequestCall, final NodeManagementUseCaseDataType nodeManagementUseCaseData, final OperatingConstraintsDurationListDataType operatingConstraintsDurationListData, final OperatingConstraintsInterruptListDataType operatingConstraintsInterruptListData, final OperatingConstraintsPowerDescriptionListDataType operatingConstraintsPowerDescriptionListData, final OperatingConstraintsPowerLevelListDataType operatingConstraintsPowerLevelListData, final OperatingConstraintsPowerRangeListDataType operatingConstraintsPowerRangeListData, final OperatingConstraintsResumeImplicationListDataType operatingConstraintsResumeImplicationListData, final PowerSequenceAlternativesRelationListDataType powerSequenceAlternativesRelationListData, final PowerSequenceDescriptionListDataType powerSequenceDescriptionListData, final PowerSequenceNodeScheduleInformationDataType powerSequenceNodeScheduleInformationData, final PowerSequencePriceCalculationRequestCallType powerSequencePriceCalculationRequestCall, final PowerSequencePriceListDataType powerSequencePriceListData, final PowerSequenceScheduleConfigurationRequestCallType powerSequenceScheduleConfigurationRequestCall, final PowerSequenceScheduleConstraintsListDataType powerSequenceScheduleConstraintsListData, final PowerSequenceScheduleListDataType powerSequenceScheduleListData, final PowerSequenceSchedulePreferenceListDataType powerSequenceSchedulePreferenceListData, final PowerSequenceStateListDataType powerSequenceStateListData, final PowerTimeSlotScheduleConstraintsListDataType powerTimeSlotScheduleConstraintsListData, final PowerTimeSlotScheduleListDataType powerTimeSlotScheduleListData, final PowerTimeSlotValueListDataType powerTimeSlotValueListData, final ResultDataType resultData, final SensingDescriptionDataType sensingDescriptionData, final SensingListDataType sensingListData, final SessionIdentificationListDataType sessionIdentificationListData, final SessionMeasurementRelationListDataType sessionMeasurementRelationListData, final SetpointConstraintsListDataType setpointConstraintsListData, final SetpointDescriptionListDataType setpointDescriptionListData, final SetpointListDataType setpointListData, final SmartEnergyManagementPsConfigurationRequestCallType smartEnergyManagementPsConfigurationRequestCall, final SmartEnergyManagementPsDataType smartEnergyManagementPsData, final SmartEnergyManagementPsPriceCalculationRequestCallType smartEnergyManagementPsPriceCalculationRequestCall, final SmartEnergyManagementPsPriceDataType smartEnergyManagementPsPriceData, final SpecificationVersionListDataType specificationVersionListData, final StateInformationListDataType stateInformationListData, final SubscriptionManagementDeleteCallType subscriptionManagementDeleteCall, final SubscriptionManagementEntryListDataType subscriptionManagementEntryListData, final SubscriptionManagementRequestCallType subscriptionManagementRequestCall, final SupplyConditionDescriptionListDataType supplyConditionDescriptionListData, final SupplyConditionListDataType supplyConditionListData, final SupplyConditionThresholdRelationListDataType supplyConditionThresholdRelationListData, final TariffBoundaryRelationListDataType tariffBoundaryRelationListData, final TariffDescriptionListDataType tariffDescriptionListData, final TariffListDataType tariffListData, final TariffOverallConstraintsDataType tariffOverallConstraintsData, final TariffTierRelationListDataType tariffTierRelationListData, final TaskManagementJobDescriptionListDataType taskManagementJobDescriptionListData, final TaskManagementJobListDataType taskManagementJobListData, final TaskManagementJobRelationListDataType taskManagementJobRelationListData, final TaskManagementOverviewDataType taskManagementOverviewData, final ThresholdConstraintsListDataType thresholdConstraintsListData, final ThresholdDescriptionListDataType thresholdDescriptionListData, final ThresholdListDataType thresholdListData, final TierBoundaryDescriptionListDataType tierBoundaryDescriptionListData, final TierBoundaryListDataType tierBoundaryListData, final TierDescriptionListDataType tierDescriptionListData, final TierIncentiveRelationListDataType tierIncentiveRelationListData, final TierListDataType tierListData, final TimeDistributorDataType timeDistributorData, final TimeDistributorEnquiryCallType timeDistributorEnquiryCall, final TimeInformationDataType timeInformationData, final TimePrecisionDataType timePrecisionData, final TimeSeriesConstraintsListDataType timeSeriesConstraintsListData, final TimeSeriesDescriptionListDataType timeSeriesDescriptionListData, final TimeSeriesListDataType timeSeriesListData, final TimeTableConstraintsListDataType timeTableConstraintsListData, final TimeTableDescriptionListDataType timeTableDescriptionListData, final TimeTableListDataType timeTableListData, final UseCaseInformationListDataType useCaseInformationListData, final byte[] manufacturerSpecificExtension, final String lastUpdateAt) {
        this.function = function;
        this.filter = filter;
        this.actuatorLevelData = actuatorLevelData;
        this.actuatorLevelDescriptionData = actuatorLevelDescriptionData;
        this.actuatorSwitchData = actuatorSwitchData;
        this.actuatorSwitchDescriptionData = actuatorSwitchDescriptionData;
        this.alarmListData = alarmListData;
        this.billConstraintsListData = billConstraintsListData;
        this.billDescriptionListData = billDescriptionListData;
        this.billListData = billListData;
        this.bindingManagementDeleteCall = bindingManagementDeleteCall;
        this.bindingManagementEntryListData = bindingManagementEntryListData;
        this.bindingManagementRequestCall = bindingManagementRequestCall;
        this.commodityListData = commodityListData;
        this.dataTunnelingCall = dataTunnelingCall;
        this.deviceClassificationManufacturerData = deviceClassificationManufacturerData;
        this.deviceClassificationUserData = deviceClassificationUserData;
        this.deviceConfigurationKeyValueConstraintsListData = deviceConfigurationKeyValueConstraintsListData;
        this.deviceConfigurationKeyValueDescriptionListData = deviceConfigurationKeyValueDescriptionListData;
        this.deviceConfigurationKeyValueListData = deviceConfigurationKeyValueListData;
        this.deviceDiagnosisHeartbeatData = deviceDiagnosisHeartbeatData;
        this.deviceDiagnosisServiceData = deviceDiagnosisServiceData;
        this.deviceDiagnosisStateData = deviceDiagnosisStateData;
        this.directControlActivityListData = directControlActivityListData;
        this.directControlDescriptionData = directControlDescriptionData;
        this.electricalConnectionCharacteristicListData = electricalConnectionCharacteristicListData;
        this.electricalConnectionDescriptionListData = electricalConnectionDescriptionListData;
        this.electricalConnectionParameterDescriptionListData = electricalConnectionParameterDescriptionListData;
        this.electricalConnectionPermittedValueSetListData = electricalConnectionPermittedValueSetListData;
        this.electricalConnectionStateListData = electricalConnectionStateListData;
        this.hvacOperationModeDescriptionListData = hvacOperationModeDescriptionListData;
        this.hvacOverrunDescriptionListData = hvacOverrunDescriptionListData;
        this.hvacOverrunListData = hvacOverrunListData;
        this.hvacSystemFunctionDescriptionListData = hvacSystemFunctionDescriptionListData;
        this.hvacSystemFunctionListData = hvacSystemFunctionListData;
        this.hvacSystemFunctionOperationModeRelationListData = hvacSystemFunctionOperationModeRelationListData;
        this.hvacSystemFunctionPowerSequenceRelationListData = hvacSystemFunctionPowerSequenceRelationListData;
        this.hvacSystemFunctionSetpointRelationListData = hvacSystemFunctionSetpointRelationListData;
        this.identificationListData = identificationListData;
        this.incentiveDescriptionListData = incentiveDescriptionListData;
        this.incentiveListData = incentiveListData;
        this.incentiveTableConstraintsData = incentiveTableConstraintsData;
        this.incentiveTableData = incentiveTableData;
        this.incentiveTableDescriptionData = incentiveTableDescriptionData;
        this.loadControlEventListData = loadControlEventListData;
        this.loadControlLimitConstraintsListData = loadControlLimitConstraintsListData;
        this.loadControlLimitDescriptionListData = loadControlLimitDescriptionListData;
        this.loadControlLimitListData = loadControlLimitListData;
        this.loadControlNodeData = loadControlNodeData;
        this.loadControlStateListData = loadControlStateListData;
        this.measurementConstraintsListData = measurementConstraintsListData;
        this.measurementDescriptionListData = measurementDescriptionListData;
        this.measurementListData = measurementListData;
        this.measurementSeriesListData = measurementSeriesListData;
        this.measurementThresholdRelationListData = measurementThresholdRelationListData;
        this.messagingListData = messagingListData;
        this.networkManagementAbortCall = networkManagementAbortCall;
        this.networkManagementAddNodeCall = networkManagementAddNodeCall;
        this.networkManagementDeviceDescriptionListData = networkManagementDeviceDescriptionListData;
        this.networkManagementDiscoverCall = networkManagementDiscoverCall;
        this.networkManagementEntityDescriptionListData = networkManagementEntityDescriptionListData;
        this.networkManagementFeatureDescriptionListData = networkManagementFeatureDescriptionListData;
        this.networkManagementJoiningModeData = networkManagementJoiningModeData;
        this.networkManagementModifyNodeCall = networkManagementModifyNodeCall;
        this.networkManagementProcessStateData = networkManagementProcessStateData;
        this.networkManagementRemoveNodeCall = networkManagementRemoveNodeCall;
        this.networkManagementReportCandidateData = networkManagementReportCandidateData;
        this.networkManagementScanNetworkCall = networkManagementScanNetworkCall;
        this.nodeManagementBindingData = nodeManagementBindingData;
        this.nodeManagementBindingDeleteCall = nodeManagementBindingDeleteCall;
        this.nodeManagementBindingRequestCall = nodeManagementBindingRequestCall;
        this.nodeManagementDestinationListData = nodeManagementDestinationListData;
        this.nodeManagementDetailedDiscoveryData = nodeManagementDetailedDiscoveryData;
        this.nodeManagementSubscriptionData = nodeManagementSubscriptionData;
        this.nodeManagementSubscriptionDeleteCall = nodeManagementSubscriptionDeleteCall;
        this.nodeManagementSubscriptionRequestCall = nodeManagementSubscriptionRequestCall;
        this.nodeManagementUseCaseData = nodeManagementUseCaseData;
        this.operatingConstraintsDurationListData = operatingConstraintsDurationListData;
        this.operatingConstraintsInterruptListData = operatingConstraintsInterruptListData;
        this.operatingConstraintsPowerDescriptionListData = operatingConstraintsPowerDescriptionListData;
        this.operatingConstraintsPowerLevelListData = operatingConstraintsPowerLevelListData;
        this.operatingConstraintsPowerRangeListData = operatingConstraintsPowerRangeListData;
        this.operatingConstraintsResumeImplicationListData = operatingConstraintsResumeImplicationListData;
        this.powerSequenceAlternativesRelationListData = powerSequenceAlternativesRelationListData;
        this.powerSequenceDescriptionListData = powerSequenceDescriptionListData;
        this.powerSequenceNodeScheduleInformationData = powerSequenceNodeScheduleInformationData;
        this.powerSequencePriceCalculationRequestCall = powerSequencePriceCalculationRequestCall;
        this.powerSequencePriceListData = powerSequencePriceListData;
        this.powerSequenceScheduleConfigurationRequestCall = powerSequenceScheduleConfigurationRequestCall;
        this.powerSequenceScheduleConstraintsListData = powerSequenceScheduleConstraintsListData;
        this.powerSequenceScheduleListData = powerSequenceScheduleListData;
        this.powerSequenceSchedulePreferenceListData = powerSequenceSchedulePreferenceListData;
        this.powerSequenceStateListData = powerSequenceStateListData;
        this.powerTimeSlotScheduleConstraintsListData = powerTimeSlotScheduleConstraintsListData;
        this.powerTimeSlotScheduleListData = powerTimeSlotScheduleListData;
        this.powerTimeSlotValueListData = powerTimeSlotValueListData;
        this.resultData = resultData;
        this.sensingDescriptionData = sensingDescriptionData;
        this.sensingListData = sensingListData;
        this.sessionIdentificationListData = sessionIdentificationListData;
        this.sessionMeasurementRelationListData = sessionMeasurementRelationListData;
        this.setpointConstraintsListData = setpointConstraintsListData;
        this.setpointDescriptionListData = setpointDescriptionListData;
        this.setpointListData = setpointListData;
        this.smartEnergyManagementPsConfigurationRequestCall = smartEnergyManagementPsConfigurationRequestCall;
        this.smartEnergyManagementPsData = smartEnergyManagementPsData;
        this.smartEnergyManagementPsPriceCalculationRequestCall = smartEnergyManagementPsPriceCalculationRequestCall;
        this.smartEnergyManagementPsPriceData = smartEnergyManagementPsPriceData;
        this.specificationVersionListData = specificationVersionListData;
        this.stateInformationListData = stateInformationListData;
        this.subscriptionManagementDeleteCall = subscriptionManagementDeleteCall;
        this.subscriptionManagementEntryListData = subscriptionManagementEntryListData;
        this.subscriptionManagementRequestCall = subscriptionManagementRequestCall;
        this.supplyConditionDescriptionListData = supplyConditionDescriptionListData;
        this.supplyConditionListData = supplyConditionListData;
        this.supplyConditionThresholdRelationListData = supplyConditionThresholdRelationListData;
        this.tariffBoundaryRelationListData = tariffBoundaryRelationListData;
        this.tariffDescriptionListData = tariffDescriptionListData;
        this.tariffListData = tariffListData;
        this.tariffOverallConstraintsData = tariffOverallConstraintsData;
        this.tariffTierRelationListData = tariffTierRelationListData;
        this.taskManagementJobDescriptionListData = taskManagementJobDescriptionListData;
        this.taskManagementJobListData = taskManagementJobListData;
        this.taskManagementJobRelationListData = taskManagementJobRelationListData;
        this.taskManagementOverviewData = taskManagementOverviewData;
        this.thresholdConstraintsListData = thresholdConstraintsListData;
        this.thresholdDescriptionListData = thresholdDescriptionListData;
        this.thresholdListData = thresholdListData;
        this.tierBoundaryDescriptionListData = tierBoundaryDescriptionListData;
        this.tierBoundaryListData = tierBoundaryListData;
        this.tierDescriptionListData = tierDescriptionListData;
        this.tierIncentiveRelationListData = tierIncentiveRelationListData;
        this.tierListData = tierListData;
        this.timeDistributorData = timeDistributorData;
        this.timeDistributorEnquiryCall = timeDistributorEnquiryCall;
        this.timeInformationData = timeInformationData;
        this.timePrecisionData = timePrecisionData;
        this.timeSeriesConstraintsListData = timeSeriesConstraintsListData;
        this.timeSeriesDescriptionListData = timeSeriesDescriptionListData;
        this.timeSeriesListData = timeSeriesListData;
        this.timeTableConstraintsListData = timeTableConstraintsListData;
        this.timeTableDescriptionListData = timeTableDescriptionListData;
        this.timeTableListData = timeTableListData;
        this.useCaseInformationListData = useCaseInformationListData;
        this.manufacturerSpecificExtension = manufacturerSpecificExtension;
        this.lastUpdateAt = lastUpdateAt;
    }

    /**
     * Gets the value of the function property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFunction() {
        return function;
    }

    /**
     * Sets the value of the function property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFunction(String value) {
        this.function = value;
    }

    /**
     * Gets the value of the filter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the filter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFilter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FilterType }
     * 
     * 
     */
    public List<FilterType> getFilter() {
        if (filter == null) {
            filter = new ArrayList<FilterType>();
        }
        return this.filter;
    }

    /**
     * Gets the value of the actuatorLevelData property.
     * 
     * @return
     *     possible object is
     *     {@link ActuatorLevelDataType }
     *     
     */
    public ActuatorLevelDataType getActuatorLevelData() {
        return actuatorLevelData;
    }

    /**
     * Sets the value of the actuatorLevelData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActuatorLevelDataType }
     *     
     */
    public void setActuatorLevelData(ActuatorLevelDataType value) {
        this.actuatorLevelData = value;
    }

    /**
     * Gets the value of the actuatorLevelDescriptionData property.
     * 
     * @return
     *     possible object is
     *     {@link ActuatorLevelDescriptionDataType }
     *     
     */
    public ActuatorLevelDescriptionDataType getActuatorLevelDescriptionData() {
        return actuatorLevelDescriptionData;
    }

    /**
     * Sets the value of the actuatorLevelDescriptionData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActuatorLevelDescriptionDataType }
     *     
     */
    public void setActuatorLevelDescriptionData(ActuatorLevelDescriptionDataType value) {
        this.actuatorLevelDescriptionData = value;
    }

    /**
     * Gets the value of the actuatorSwitchData property.
     * 
     * @return
     *     possible object is
     *     {@link ActuatorSwitchDataType }
     *     
     */
    public ActuatorSwitchDataType getActuatorSwitchData() {
        return actuatorSwitchData;
    }

    /**
     * Sets the value of the actuatorSwitchData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActuatorSwitchDataType }
     *     
     */
    public void setActuatorSwitchData(ActuatorSwitchDataType value) {
        this.actuatorSwitchData = value;
    }

    /**
     * Gets the value of the actuatorSwitchDescriptionData property.
     * 
     * @return
     *     possible object is
     *     {@link ActuatorSwitchDescriptionDataType }
     *     
     */
    public ActuatorSwitchDescriptionDataType getActuatorSwitchDescriptionData() {
        return actuatorSwitchDescriptionData;
    }

    /**
     * Sets the value of the actuatorSwitchDescriptionData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActuatorSwitchDescriptionDataType }
     *     
     */
    public void setActuatorSwitchDescriptionData(ActuatorSwitchDescriptionDataType value) {
        this.actuatorSwitchDescriptionData = value;
    }

    /**
     * Gets the value of the alarmListData property.
     * 
     * @return
     *     possible object is
     *     {@link AlarmListDataType }
     *     
     */
    public AlarmListDataType getAlarmListData() {
        return alarmListData;
    }

    /**
     * Sets the value of the alarmListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlarmListDataType }
     *     
     */
    public void setAlarmListData(AlarmListDataType value) {
        this.alarmListData = value;
    }

    /**
     * Gets the value of the billConstraintsListData property.
     * 
     * @return
     *     possible object is
     *     {@link BillConstraintsListDataType }
     *     
     */
    public BillConstraintsListDataType getBillConstraintsListData() {
        return billConstraintsListData;
    }

    /**
     * Sets the value of the billConstraintsListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillConstraintsListDataType }
     *     
     */
    public void setBillConstraintsListData(BillConstraintsListDataType value) {
        this.billConstraintsListData = value;
    }

    /**
     * Gets the value of the billDescriptionListData property.
     * 
     * @return
     *     possible object is
     *     {@link BillDescriptionListDataType }
     *     
     */
    public BillDescriptionListDataType getBillDescriptionListData() {
        return billDescriptionListData;
    }

    /**
     * Sets the value of the billDescriptionListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillDescriptionListDataType }
     *     
     */
    public void setBillDescriptionListData(BillDescriptionListDataType value) {
        this.billDescriptionListData = value;
    }

    /**
     * Gets the value of the billListData property.
     * 
     * @return
     *     possible object is
     *     {@link BillListDataType }
     *     
     */
    public BillListDataType getBillListData() {
        return billListData;
    }

    /**
     * Sets the value of the billListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillListDataType }
     *     
     */
    public void setBillListData(BillListDataType value) {
        this.billListData = value;
    }

    /**
     * Gets the value of the bindingManagementDeleteCall property.
     * 
     * @return
     *     possible object is
     *     {@link BindingManagementDeleteCallType }
     *     
     */
    public BindingManagementDeleteCallType getBindingManagementDeleteCall() {
        return bindingManagementDeleteCall;
    }

    /**
     * Sets the value of the bindingManagementDeleteCall property.
     * 
     * @param value
     *     allowed object is
     *     {@link BindingManagementDeleteCallType }
     *     
     */
    public void setBindingManagementDeleteCall(BindingManagementDeleteCallType value) {
        this.bindingManagementDeleteCall = value;
    }

    /**
     * Gets the value of the bindingManagementEntryListData property.
     * 
     * @return
     *     possible object is
     *     {@link BindingManagementEntryListDataType }
     *     
     */
    public BindingManagementEntryListDataType getBindingManagementEntryListData() {
        return bindingManagementEntryListData;
    }

    /**
     * Sets the value of the bindingManagementEntryListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link BindingManagementEntryListDataType }
     *     
     */
    public void setBindingManagementEntryListData(BindingManagementEntryListDataType value) {
        this.bindingManagementEntryListData = value;
    }

    /**
     * Gets the value of the bindingManagementRequestCall property.
     * 
     * @return
     *     possible object is
     *     {@link BindingManagementRequestCallType }
     *     
     */
    public BindingManagementRequestCallType getBindingManagementRequestCall() {
        return bindingManagementRequestCall;
    }

    /**
     * Sets the value of the bindingManagementRequestCall property.
     * 
     * @param value
     *     allowed object is
     *     {@link BindingManagementRequestCallType }
     *     
     */
    public void setBindingManagementRequestCall(BindingManagementRequestCallType value) {
        this.bindingManagementRequestCall = value;
    }

    /**
     * Gets the value of the commodityListData property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityListDataType }
     *     
     */
    public CommodityListDataType getCommodityListData() {
        return commodityListData;
    }

    /**
     * Sets the value of the commodityListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityListDataType }
     *     
     */
    public void setCommodityListData(CommodityListDataType value) {
        this.commodityListData = value;
    }

    /**
     * Gets the value of the dataTunnelingCall property.
     * 
     * @return
     *     possible object is
     *     {@link DataTunnelingCallType }
     *     
     */
    public DataTunnelingCallType getDataTunnelingCall() {
        return dataTunnelingCall;
    }

    /**
     * Sets the value of the dataTunnelingCall property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataTunnelingCallType }
     *     
     */
    public void setDataTunnelingCall(DataTunnelingCallType value) {
        this.dataTunnelingCall = value;
    }

    /**
     * Gets the value of the deviceClassificationManufacturerData property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceClassificationManufacturerDataType }
     *     
     */
    public DeviceClassificationManufacturerDataType getDeviceClassificationManufacturerData() {
        return deviceClassificationManufacturerData;
    }

    /**
     * Sets the value of the deviceClassificationManufacturerData property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceClassificationManufacturerDataType }
     *     
     */
    public void setDeviceClassificationManufacturerData(DeviceClassificationManufacturerDataType value) {
        this.deviceClassificationManufacturerData = value;
    }

    /**
     * Gets the value of the deviceClassificationUserData property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceClassificationUserDataType }
     *     
     */
    public DeviceClassificationUserDataType getDeviceClassificationUserData() {
        return deviceClassificationUserData;
    }

    /**
     * Sets the value of the deviceClassificationUserData property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceClassificationUserDataType }
     *     
     */
    public void setDeviceClassificationUserData(DeviceClassificationUserDataType value) {
        this.deviceClassificationUserData = value;
    }

    /**
     * Gets the value of the deviceConfigurationKeyValueConstraintsListData property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceConfigurationKeyValueConstraintsListDataType }
     *     
     */
    public DeviceConfigurationKeyValueConstraintsListDataType getDeviceConfigurationKeyValueConstraintsListData() {
        return deviceConfigurationKeyValueConstraintsListData;
    }

    /**
     * Sets the value of the deviceConfigurationKeyValueConstraintsListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceConfigurationKeyValueConstraintsListDataType }
     *     
     */
    public void setDeviceConfigurationKeyValueConstraintsListData(DeviceConfigurationKeyValueConstraintsListDataType value) {
        this.deviceConfigurationKeyValueConstraintsListData = value;
    }

    /**
     * Gets the value of the deviceConfigurationKeyValueDescriptionListData property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceConfigurationKeyValueDescriptionListDataType }
     *     
     */
    public DeviceConfigurationKeyValueDescriptionListDataType getDeviceConfigurationKeyValueDescriptionListData() {
        return deviceConfigurationKeyValueDescriptionListData;
    }

    /**
     * Sets the value of the deviceConfigurationKeyValueDescriptionListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceConfigurationKeyValueDescriptionListDataType }
     *     
     */
    public void setDeviceConfigurationKeyValueDescriptionListData(DeviceConfigurationKeyValueDescriptionListDataType value) {
        this.deviceConfigurationKeyValueDescriptionListData = value;
    }

    /**
     * Gets the value of the deviceConfigurationKeyValueListData property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceConfigurationKeyValueListDataType }
     *     
     */
    public DeviceConfigurationKeyValueListDataType getDeviceConfigurationKeyValueListData() {
        return deviceConfigurationKeyValueListData;
    }

    /**
     * Sets the value of the deviceConfigurationKeyValueListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceConfigurationKeyValueListDataType }
     *     
     */
    public void setDeviceConfigurationKeyValueListData(DeviceConfigurationKeyValueListDataType value) {
        this.deviceConfigurationKeyValueListData = value;
    }

    /**
     * Gets the value of the deviceDiagnosisHeartbeatData property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceDiagnosisHeartbeatDataType }
     *     
     */
    public DeviceDiagnosisHeartbeatDataType getDeviceDiagnosisHeartbeatData() {
        return deviceDiagnosisHeartbeatData;
    }

    /**
     * Sets the value of the deviceDiagnosisHeartbeatData property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceDiagnosisHeartbeatDataType }
     *     
     */
    public void setDeviceDiagnosisHeartbeatData(DeviceDiagnosisHeartbeatDataType value) {
        this.deviceDiagnosisHeartbeatData = value;
    }

    /**
     * Gets the value of the deviceDiagnosisServiceData property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceDiagnosisServiceDataType }
     *     
     */
    public DeviceDiagnosisServiceDataType getDeviceDiagnosisServiceData() {
        return deviceDiagnosisServiceData;
    }

    /**
     * Sets the value of the deviceDiagnosisServiceData property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceDiagnosisServiceDataType }
     *     
     */
    public void setDeviceDiagnosisServiceData(DeviceDiagnosisServiceDataType value) {
        this.deviceDiagnosisServiceData = value;
    }

    /**
     * Gets the value of the deviceDiagnosisStateData property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceDiagnosisStateDataType }
     *     
     */
    public DeviceDiagnosisStateDataType getDeviceDiagnosisStateData() {
        return deviceDiagnosisStateData;
    }

    /**
     * Sets the value of the deviceDiagnosisStateData property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceDiagnosisStateDataType }
     *     
     */
    public void setDeviceDiagnosisStateData(DeviceDiagnosisStateDataType value) {
        this.deviceDiagnosisStateData = value;
    }

    /**
     * Gets the value of the directControlActivityListData property.
     * 
     * @return
     *     possible object is
     *     {@link DirectControlActivityListDataType }
     *     
     */
    public DirectControlActivityListDataType getDirectControlActivityListData() {
        return directControlActivityListData;
    }

    /**
     * Sets the value of the directControlActivityListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectControlActivityListDataType }
     *     
     */
    public void setDirectControlActivityListData(DirectControlActivityListDataType value) {
        this.directControlActivityListData = value;
    }

    /**
     * Gets the value of the directControlDescriptionData property.
     * 
     * @return
     *     possible object is
     *     {@link DirectControlDescriptionDataType }
     *     
     */
    public DirectControlDescriptionDataType getDirectControlDescriptionData() {
        return directControlDescriptionData;
    }

    /**
     * Sets the value of the directControlDescriptionData property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectControlDescriptionDataType }
     *     
     */
    public void setDirectControlDescriptionData(DirectControlDescriptionDataType value) {
        this.directControlDescriptionData = value;
    }

    /**
     * Gets the value of the electricalConnectionCharacteristicListData property.
     * 
     * @return
     *     possible object is
     *     {@link ElectricalConnectionCharacteristicListDataType }
     *     
     */
    public ElectricalConnectionCharacteristicListDataType getElectricalConnectionCharacteristicListData() {
        return electricalConnectionCharacteristicListData;
    }

    /**
     * Sets the value of the electricalConnectionCharacteristicListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElectricalConnectionCharacteristicListDataType }
     *     
     */
    public void setElectricalConnectionCharacteristicListData(ElectricalConnectionCharacteristicListDataType value) {
        this.electricalConnectionCharacteristicListData = value;
    }

    /**
     * Gets the value of the electricalConnectionDescriptionListData property.
     * 
     * @return
     *     possible object is
     *     {@link ElectricalConnectionDescriptionListDataType }
     *     
     */
    public ElectricalConnectionDescriptionListDataType getElectricalConnectionDescriptionListData() {
        return electricalConnectionDescriptionListData;
    }

    /**
     * Sets the value of the electricalConnectionDescriptionListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElectricalConnectionDescriptionListDataType }
     *     
     */
    public void setElectricalConnectionDescriptionListData(ElectricalConnectionDescriptionListDataType value) {
        this.electricalConnectionDescriptionListData = value;
    }

    /**
     * Gets the value of the electricalConnectionParameterDescriptionListData property.
     * 
     * @return
     *     possible object is
     *     {@link ElectricalConnectionParameterDescriptionListDataType }
     *     
     */
    public ElectricalConnectionParameterDescriptionListDataType getElectricalConnectionParameterDescriptionListData() {
        return electricalConnectionParameterDescriptionListData;
    }

    /**
     * Sets the value of the electricalConnectionParameterDescriptionListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElectricalConnectionParameterDescriptionListDataType }
     *     
     */
    public void setElectricalConnectionParameterDescriptionListData(ElectricalConnectionParameterDescriptionListDataType value) {
        this.electricalConnectionParameterDescriptionListData = value;
    }

    /**
     * Gets the value of the electricalConnectionPermittedValueSetListData property.
     * 
     * @return
     *     possible object is
     *     {@link ElectricalConnectionPermittedValueSetListDataType }
     *     
     */
    public ElectricalConnectionPermittedValueSetListDataType getElectricalConnectionPermittedValueSetListData() {
        return electricalConnectionPermittedValueSetListData;
    }

    /**
     * Sets the value of the electricalConnectionPermittedValueSetListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElectricalConnectionPermittedValueSetListDataType }
     *     
     */
    public void setElectricalConnectionPermittedValueSetListData(ElectricalConnectionPermittedValueSetListDataType value) {
        this.electricalConnectionPermittedValueSetListData = value;
    }

    /**
     * Gets the value of the electricalConnectionStateListData property.
     * 
     * @return
     *     possible object is
     *     {@link ElectricalConnectionStateListDataType }
     *     
     */
    public ElectricalConnectionStateListDataType getElectricalConnectionStateListData() {
        return electricalConnectionStateListData;
    }

    /**
     * Sets the value of the electricalConnectionStateListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElectricalConnectionStateListDataType }
     *     
     */
    public void setElectricalConnectionStateListData(ElectricalConnectionStateListDataType value) {
        this.electricalConnectionStateListData = value;
    }

    /**
     * Gets the value of the hvacOperationModeDescriptionListData property.
     * 
     * @return
     *     possible object is
     *     {@link HvacOperationModeDescriptionListDataType }
     *     
     */
    public HvacOperationModeDescriptionListDataType getHvacOperationModeDescriptionListData() {
        return hvacOperationModeDescriptionListData;
    }

    /**
     * Sets the value of the hvacOperationModeDescriptionListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link HvacOperationModeDescriptionListDataType }
     *     
     */
    public void setHvacOperationModeDescriptionListData(HvacOperationModeDescriptionListDataType value) {
        this.hvacOperationModeDescriptionListData = value;
    }

    /**
     * Gets the value of the hvacOverrunDescriptionListData property.
     * 
     * @return
     *     possible object is
     *     {@link HvacOverrunDescriptionListDataType }
     *     
     */
    public HvacOverrunDescriptionListDataType getHvacOverrunDescriptionListData() {
        return hvacOverrunDescriptionListData;
    }

    /**
     * Sets the value of the hvacOverrunDescriptionListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link HvacOverrunDescriptionListDataType }
     *     
     */
    public void setHvacOverrunDescriptionListData(HvacOverrunDescriptionListDataType value) {
        this.hvacOverrunDescriptionListData = value;
    }

    /**
     * Gets the value of the hvacOverrunListData property.
     * 
     * @return
     *     possible object is
     *     {@link HvacOverrunListDataType }
     *     
     */
    public HvacOverrunListDataType getHvacOverrunListData() {
        return hvacOverrunListData;
    }

    /**
     * Sets the value of the hvacOverrunListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link HvacOverrunListDataType }
     *     
     */
    public void setHvacOverrunListData(HvacOverrunListDataType value) {
        this.hvacOverrunListData = value;
    }

    /**
     * Gets the value of the hvacSystemFunctionDescriptionListData property.
     * 
     * @return
     *     possible object is
     *     {@link HvacSystemFunctionDescriptionListDataType }
     *     
     */
    public HvacSystemFunctionDescriptionListDataType getHvacSystemFunctionDescriptionListData() {
        return hvacSystemFunctionDescriptionListData;
    }

    /**
     * Sets the value of the hvacSystemFunctionDescriptionListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link HvacSystemFunctionDescriptionListDataType }
     *     
     */
    public void setHvacSystemFunctionDescriptionListData(HvacSystemFunctionDescriptionListDataType value) {
        this.hvacSystemFunctionDescriptionListData = value;
    }

    /**
     * Gets the value of the hvacSystemFunctionListData property.
     * 
     * @return
     *     possible object is
     *     {@link HvacSystemFunctionListDataType }
     *     
     */
    public HvacSystemFunctionListDataType getHvacSystemFunctionListData() {
        return hvacSystemFunctionListData;
    }

    /**
     * Sets the value of the hvacSystemFunctionListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link HvacSystemFunctionListDataType }
     *     
     */
    public void setHvacSystemFunctionListData(HvacSystemFunctionListDataType value) {
        this.hvacSystemFunctionListData = value;
    }

    /**
     * Gets the value of the hvacSystemFunctionOperationModeRelationListData property.
     * 
     * @return
     *     possible object is
     *     {@link HvacSystemFunctionOperationModeRelationListDataType }
     *     
     */
    public HvacSystemFunctionOperationModeRelationListDataType getHvacSystemFunctionOperationModeRelationListData() {
        return hvacSystemFunctionOperationModeRelationListData;
    }

    /**
     * Sets the value of the hvacSystemFunctionOperationModeRelationListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link HvacSystemFunctionOperationModeRelationListDataType }
     *     
     */
    public void setHvacSystemFunctionOperationModeRelationListData(HvacSystemFunctionOperationModeRelationListDataType value) {
        this.hvacSystemFunctionOperationModeRelationListData = value;
    }

    /**
     * Gets the value of the hvacSystemFunctionPowerSequenceRelationListData property.
     * 
     * @return
     *     possible object is
     *     {@link HvacSystemFunctionPowerSequenceRelationListDataType }
     *     
     */
    public HvacSystemFunctionPowerSequenceRelationListDataType getHvacSystemFunctionPowerSequenceRelationListData() {
        return hvacSystemFunctionPowerSequenceRelationListData;
    }

    /**
     * Sets the value of the hvacSystemFunctionPowerSequenceRelationListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link HvacSystemFunctionPowerSequenceRelationListDataType }
     *     
     */
    public void setHvacSystemFunctionPowerSequenceRelationListData(HvacSystemFunctionPowerSequenceRelationListDataType value) {
        this.hvacSystemFunctionPowerSequenceRelationListData = value;
    }

    /**
     * Gets the value of the hvacSystemFunctionSetpointRelationListData property.
     * 
     * @return
     *     possible object is
     *     {@link HvacSystemFunctionSetpointRelationListDataType }
     *     
     */
    public HvacSystemFunctionSetpointRelationListDataType getHvacSystemFunctionSetpointRelationListData() {
        return hvacSystemFunctionSetpointRelationListData;
    }

    /**
     * Sets the value of the hvacSystemFunctionSetpointRelationListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link HvacSystemFunctionSetpointRelationListDataType }
     *     
     */
    public void setHvacSystemFunctionSetpointRelationListData(HvacSystemFunctionSetpointRelationListDataType value) {
        this.hvacSystemFunctionSetpointRelationListData = value;
    }

    /**
     * Gets the value of the identificationListData property.
     * 
     * @return
     *     possible object is
     *     {@link IdentificationListDataType }
     *     
     */
    public IdentificationListDataType getIdentificationListData() {
        return identificationListData;
    }

    /**
     * Sets the value of the identificationListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificationListDataType }
     *     
     */
    public void setIdentificationListData(IdentificationListDataType value) {
        this.identificationListData = value;
    }

    /**
     * Gets the value of the incentiveDescriptionListData property.
     * 
     * @return
     *     possible object is
     *     {@link IncentiveDescriptionListDataType }
     *     
     */
    public IncentiveDescriptionListDataType getIncentiveDescriptionListData() {
        return incentiveDescriptionListData;
    }

    /**
     * Sets the value of the incentiveDescriptionListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncentiveDescriptionListDataType }
     *     
     */
    public void setIncentiveDescriptionListData(IncentiveDescriptionListDataType value) {
        this.incentiveDescriptionListData = value;
    }

    /**
     * Gets the value of the incentiveListData property.
     * 
     * @return
     *     possible object is
     *     {@link IncentiveListDataType }
     *     
     */
    public IncentiveListDataType getIncentiveListData() {
        return incentiveListData;
    }

    /**
     * Sets the value of the incentiveListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncentiveListDataType }
     *     
     */
    public void setIncentiveListData(IncentiveListDataType value) {
        this.incentiveListData = value;
    }

    /**
     * Gets the value of the incentiveTableConstraintsData property.
     * 
     * @return
     *     possible object is
     *     {@link IncentiveTableConstraintsDataType }
     *     
     */
    public IncentiveTableConstraintsDataType getIncentiveTableConstraintsData() {
        return incentiveTableConstraintsData;
    }

    /**
     * Sets the value of the incentiveTableConstraintsData property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncentiveTableConstraintsDataType }
     *     
     */
    public void setIncentiveTableConstraintsData(IncentiveTableConstraintsDataType value) {
        this.incentiveTableConstraintsData = value;
    }

    /**
     * Gets the value of the incentiveTableData property.
     * 
     * @return
     *     possible object is
     *     {@link IncentiveTableDataType }
     *     
     */
    public IncentiveTableDataType getIncentiveTableData() {
        return incentiveTableData;
    }

    /**
     * Sets the value of the incentiveTableData property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncentiveTableDataType }
     *     
     */
    public void setIncentiveTableData(IncentiveTableDataType value) {
        this.incentiveTableData = value;
    }

    /**
     * Gets the value of the incentiveTableDescriptionData property.
     * 
     * @return
     *     possible object is
     *     {@link IncentiveTableDescriptionDataType }
     *     
     */
    public IncentiveTableDescriptionDataType getIncentiveTableDescriptionData() {
        return incentiveTableDescriptionData;
    }

    /**
     * Sets the value of the incentiveTableDescriptionData property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncentiveTableDescriptionDataType }
     *     
     */
    public void setIncentiveTableDescriptionData(IncentiveTableDescriptionDataType value) {
        this.incentiveTableDescriptionData = value;
    }

    /**
     * Gets the value of the loadControlEventListData property.
     * 
     * @return
     *     possible object is
     *     {@link LoadControlEventListDataType }
     *     
     */
    public LoadControlEventListDataType getLoadControlEventListData() {
        return loadControlEventListData;
    }

    /**
     * Sets the value of the loadControlEventListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadControlEventListDataType }
     *     
     */
    public void setLoadControlEventListData(LoadControlEventListDataType value) {
        this.loadControlEventListData = value;
    }

    /**
     * Gets the value of the loadControlLimitConstraintsListData property.
     * 
     * @return
     *     possible object is
     *     {@link LoadControlLimitConstraintsListDataType }
     *     
     */
    public LoadControlLimitConstraintsListDataType getLoadControlLimitConstraintsListData() {
        return loadControlLimitConstraintsListData;
    }

    /**
     * Sets the value of the loadControlLimitConstraintsListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadControlLimitConstraintsListDataType }
     *     
     */
    public void setLoadControlLimitConstraintsListData(LoadControlLimitConstraintsListDataType value) {
        this.loadControlLimitConstraintsListData = value;
    }

    /**
     * Gets the value of the loadControlLimitDescriptionListData property.
     * 
     * @return
     *     possible object is
     *     {@link LoadControlLimitDescriptionListDataType }
     *     
     */
    public LoadControlLimitDescriptionListDataType getLoadControlLimitDescriptionListData() {
        return loadControlLimitDescriptionListData;
    }

    /**
     * Sets the value of the loadControlLimitDescriptionListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadControlLimitDescriptionListDataType }
     *     
     */
    public void setLoadControlLimitDescriptionListData(LoadControlLimitDescriptionListDataType value) {
        this.loadControlLimitDescriptionListData = value;
    }

    /**
     * Gets the value of the loadControlLimitListData property.
     * 
     * @return
     *     possible object is
     *     {@link LoadControlLimitListDataType }
     *     
     */
    public LoadControlLimitListDataType getLoadControlLimitListData() {
        return loadControlLimitListData;
    }

    /**
     * Sets the value of the loadControlLimitListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadControlLimitListDataType }
     *     
     */
    public void setLoadControlLimitListData(LoadControlLimitListDataType value) {
        this.loadControlLimitListData = value;
    }

    /**
     * Gets the value of the loadControlNodeData property.
     * 
     * @return
     *     possible object is
     *     {@link LoadControlNodeDataType }
     *     
     */
    public LoadControlNodeDataType getLoadControlNodeData() {
        return loadControlNodeData;
    }

    /**
     * Sets the value of the loadControlNodeData property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadControlNodeDataType }
     *     
     */
    public void setLoadControlNodeData(LoadControlNodeDataType value) {
        this.loadControlNodeData = value;
    }

    /**
     * Gets the value of the loadControlStateListData property.
     * 
     * @return
     *     possible object is
     *     {@link LoadControlStateListDataType }
     *     
     */
    public LoadControlStateListDataType getLoadControlStateListData() {
        return loadControlStateListData;
    }

    /**
     * Sets the value of the loadControlStateListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadControlStateListDataType }
     *     
     */
    public void setLoadControlStateListData(LoadControlStateListDataType value) {
        this.loadControlStateListData = value;
    }

    /**
     * Gets the value of the measurementConstraintsListData property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementConstraintsListDataType }
     *     
     */
    public MeasurementConstraintsListDataType getMeasurementConstraintsListData() {
        return measurementConstraintsListData;
    }

    /**
     * Sets the value of the measurementConstraintsListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementConstraintsListDataType }
     *     
     */
    public void setMeasurementConstraintsListData(MeasurementConstraintsListDataType value) {
        this.measurementConstraintsListData = value;
    }

    /**
     * Gets the value of the measurementDescriptionListData property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementDescriptionListDataType }
     *     
     */
    public MeasurementDescriptionListDataType getMeasurementDescriptionListData() {
        return measurementDescriptionListData;
    }

    /**
     * Sets the value of the measurementDescriptionListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementDescriptionListDataType }
     *     
     */
    public void setMeasurementDescriptionListData(MeasurementDescriptionListDataType value) {
        this.measurementDescriptionListData = value;
    }

    /**
     * Gets the value of the measurementListData property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementListDataType }
     *     
     */
    public MeasurementListDataType getMeasurementListData() {
        return measurementListData;
    }

    /**
     * Sets the value of the measurementListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementListDataType }
     *     
     */
    public void setMeasurementListData(MeasurementListDataType value) {
        this.measurementListData = value;
    }

    /**
     * Gets the value of the measurementSeriesListData property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementSeriesListDataType }
     *     
     */
    public MeasurementSeriesListDataType getMeasurementSeriesListData() {
        return measurementSeriesListData;
    }

    /**
     * Sets the value of the measurementSeriesListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementSeriesListDataType }
     *     
     */
    public void setMeasurementSeriesListData(MeasurementSeriesListDataType value) {
        this.measurementSeriesListData = value;
    }

    /**
     * Gets the value of the measurementThresholdRelationListData property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementThresholdRelationListDataType }
     *     
     */
    public MeasurementThresholdRelationListDataType getMeasurementThresholdRelationListData() {
        return measurementThresholdRelationListData;
    }

    /**
     * Sets the value of the measurementThresholdRelationListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementThresholdRelationListDataType }
     *     
     */
    public void setMeasurementThresholdRelationListData(MeasurementThresholdRelationListDataType value) {
        this.measurementThresholdRelationListData = value;
    }

    /**
     * Gets the value of the messagingListData property.
     * 
     * @return
     *     possible object is
     *     {@link MessagingListDataType }
     *     
     */
    public MessagingListDataType getMessagingListData() {
        return messagingListData;
    }

    /**
     * Sets the value of the messagingListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessagingListDataType }
     *     
     */
    public void setMessagingListData(MessagingListDataType value) {
        this.messagingListData = value;
    }

    /**
     * Gets the value of the networkManagementAbortCall property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkManagementAbortCallType }
     *     
     */
    public NetworkManagementAbortCallType getNetworkManagementAbortCall() {
        return networkManagementAbortCall;
    }

    /**
     * Sets the value of the networkManagementAbortCall property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkManagementAbortCallType }
     *     
     */
    public void setNetworkManagementAbortCall(NetworkManagementAbortCallType value) {
        this.networkManagementAbortCall = value;
    }

    /**
     * Gets the value of the networkManagementAddNodeCall property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkManagementAddNodeCallType }
     *     
     */
    public NetworkManagementAddNodeCallType getNetworkManagementAddNodeCall() {
        return networkManagementAddNodeCall;
    }

    /**
     * Sets the value of the networkManagementAddNodeCall property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkManagementAddNodeCallType }
     *     
     */
    public void setNetworkManagementAddNodeCall(NetworkManagementAddNodeCallType value) {
        this.networkManagementAddNodeCall = value;
    }

    /**
     * Gets the value of the networkManagementDeviceDescriptionListData property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkManagementDeviceDescriptionListDataType }
     *     
     */
    public NetworkManagementDeviceDescriptionListDataType getNetworkManagementDeviceDescriptionListData() {
        return networkManagementDeviceDescriptionListData;
    }

    /**
     * Sets the value of the networkManagementDeviceDescriptionListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkManagementDeviceDescriptionListDataType }
     *     
     */
    public void setNetworkManagementDeviceDescriptionListData(NetworkManagementDeviceDescriptionListDataType value) {
        this.networkManagementDeviceDescriptionListData = value;
    }

    /**
     * Gets the value of the networkManagementDiscoverCall property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkManagementDiscoverCallType }
     *     
     */
    public NetworkManagementDiscoverCallType getNetworkManagementDiscoverCall() {
        return networkManagementDiscoverCall;
    }

    /**
     * Sets the value of the networkManagementDiscoverCall property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkManagementDiscoverCallType }
     *     
     */
    public void setNetworkManagementDiscoverCall(NetworkManagementDiscoverCallType value) {
        this.networkManagementDiscoverCall = value;
    }

    /**
     * Gets the value of the networkManagementEntityDescriptionListData property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkManagementEntityDescriptionListDataType }
     *     
     */
    public NetworkManagementEntityDescriptionListDataType getNetworkManagementEntityDescriptionListData() {
        return networkManagementEntityDescriptionListData;
    }

    /**
     * Sets the value of the networkManagementEntityDescriptionListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkManagementEntityDescriptionListDataType }
     *     
     */
    public void setNetworkManagementEntityDescriptionListData(NetworkManagementEntityDescriptionListDataType value) {
        this.networkManagementEntityDescriptionListData = value;
    }

    /**
     * Gets the value of the networkManagementFeatureDescriptionListData property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkManagementFeatureDescriptionListDataType }
     *     
     */
    public NetworkManagementFeatureDescriptionListDataType getNetworkManagementFeatureDescriptionListData() {
        return networkManagementFeatureDescriptionListData;
    }

    /**
     * Sets the value of the networkManagementFeatureDescriptionListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkManagementFeatureDescriptionListDataType }
     *     
     */
    public void setNetworkManagementFeatureDescriptionListData(NetworkManagementFeatureDescriptionListDataType value) {
        this.networkManagementFeatureDescriptionListData = value;
    }

    /**
     * Gets the value of the networkManagementJoiningModeData property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkManagementJoiningModeDataType }
     *     
     */
    public NetworkManagementJoiningModeDataType getNetworkManagementJoiningModeData() {
        return networkManagementJoiningModeData;
    }

    /**
     * Sets the value of the networkManagementJoiningModeData property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkManagementJoiningModeDataType }
     *     
     */
    public void setNetworkManagementJoiningModeData(NetworkManagementJoiningModeDataType value) {
        this.networkManagementJoiningModeData = value;
    }

    /**
     * Gets the value of the networkManagementModifyNodeCall property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkManagementModifyNodeCallType }
     *     
     */
    public NetworkManagementModifyNodeCallType getNetworkManagementModifyNodeCall() {
        return networkManagementModifyNodeCall;
    }

    /**
     * Sets the value of the networkManagementModifyNodeCall property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkManagementModifyNodeCallType }
     *     
     */
    public void setNetworkManagementModifyNodeCall(NetworkManagementModifyNodeCallType value) {
        this.networkManagementModifyNodeCall = value;
    }

    /**
     * Gets the value of the networkManagementProcessStateData property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkManagementProcessStateDataType }
     *     
     */
    public NetworkManagementProcessStateDataType getNetworkManagementProcessStateData() {
        return networkManagementProcessStateData;
    }

    /**
     * Sets the value of the networkManagementProcessStateData property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkManagementProcessStateDataType }
     *     
     */
    public void setNetworkManagementProcessStateData(NetworkManagementProcessStateDataType value) {
        this.networkManagementProcessStateData = value;
    }

    /**
     * Gets the value of the networkManagementRemoveNodeCall property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkManagementRemoveNodeCallType }
     *     
     */
    public NetworkManagementRemoveNodeCallType getNetworkManagementRemoveNodeCall() {
        return networkManagementRemoveNodeCall;
    }

    /**
     * Sets the value of the networkManagementRemoveNodeCall property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkManagementRemoveNodeCallType }
     *     
     */
    public void setNetworkManagementRemoveNodeCall(NetworkManagementRemoveNodeCallType value) {
        this.networkManagementRemoveNodeCall = value;
    }

    /**
     * Gets the value of the networkManagementReportCandidateData property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkManagementReportCandidateDataType }
     *     
     */
    public NetworkManagementReportCandidateDataType getNetworkManagementReportCandidateData() {
        return networkManagementReportCandidateData;
    }

    /**
     * Sets the value of the networkManagementReportCandidateData property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkManagementReportCandidateDataType }
     *     
     */
    public void setNetworkManagementReportCandidateData(NetworkManagementReportCandidateDataType value) {
        this.networkManagementReportCandidateData = value;
    }

    /**
     * Gets the value of the networkManagementScanNetworkCall property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkManagementScanNetworkCallType }
     *     
     */
    public NetworkManagementScanNetworkCallType getNetworkManagementScanNetworkCall() {
        return networkManagementScanNetworkCall;
    }

    /**
     * Sets the value of the networkManagementScanNetworkCall property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkManagementScanNetworkCallType }
     *     
     */
    public void setNetworkManagementScanNetworkCall(NetworkManagementScanNetworkCallType value) {
        this.networkManagementScanNetworkCall = value;
    }

    /**
     * Gets the value of the nodeManagementBindingData property.
     * 
     * @return
     *     possible object is
     *     {@link NodeManagementBindingDataType }
     *     
     */
    public NodeManagementBindingDataType getNodeManagementBindingData() {
        return nodeManagementBindingData;
    }

    /**
     * Sets the value of the nodeManagementBindingData property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeManagementBindingDataType }
     *     
     */
    public void setNodeManagementBindingData(NodeManagementBindingDataType value) {
        this.nodeManagementBindingData = value;
    }

    /**
     * Gets the value of the nodeManagementBindingDeleteCall property.
     * 
     * @return
     *     possible object is
     *     {@link NodeManagementBindingDeleteCallType }
     *     
     */
    public NodeManagementBindingDeleteCallType getNodeManagementBindingDeleteCall() {
        return nodeManagementBindingDeleteCall;
    }

    /**
     * Sets the value of the nodeManagementBindingDeleteCall property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeManagementBindingDeleteCallType }
     *     
     */
    public void setNodeManagementBindingDeleteCall(NodeManagementBindingDeleteCallType value) {
        this.nodeManagementBindingDeleteCall = value;
    }

    /**
     * Gets the value of the nodeManagementBindingRequestCall property.
     * 
     * @return
     *     possible object is
     *     {@link NodeManagementBindingRequestCallType }
     *     
     */
    public NodeManagementBindingRequestCallType getNodeManagementBindingRequestCall() {
        return nodeManagementBindingRequestCall;
    }

    /**
     * Sets the value of the nodeManagementBindingRequestCall property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeManagementBindingRequestCallType }
     *     
     */
    public void setNodeManagementBindingRequestCall(NodeManagementBindingRequestCallType value) {
        this.nodeManagementBindingRequestCall = value;
    }

    /**
     * Gets the value of the nodeManagementDestinationListData property.
     * 
     * @return
     *     possible object is
     *     {@link NodeManagementDestinationListDataType }
     *     
     */
    public NodeManagementDestinationListDataType getNodeManagementDestinationListData() {
        return nodeManagementDestinationListData;
    }

    /**
     * Sets the value of the nodeManagementDestinationListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeManagementDestinationListDataType }
     *     
     */
    public void setNodeManagementDestinationListData(NodeManagementDestinationListDataType value) {
        this.nodeManagementDestinationListData = value;
    }

    /**
     * Gets the value of the nodeManagementDetailedDiscoveryData property.
     * 
     * @return
     *     possible object is
     *     {@link NodeManagementDetailedDiscoveryDataType }
     *     
     */
    public NodeManagementDetailedDiscoveryDataType getNodeManagementDetailedDiscoveryData() {
        return nodeManagementDetailedDiscoveryData;
    }

    /**
     * Sets the value of the nodeManagementDetailedDiscoveryData property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeManagementDetailedDiscoveryDataType }
     *     
     */
    public void setNodeManagementDetailedDiscoveryData(NodeManagementDetailedDiscoveryDataType value) {
        this.nodeManagementDetailedDiscoveryData = value;
    }

    /**
     * Gets the value of the nodeManagementSubscriptionData property.
     * 
     * @return
     *     possible object is
     *     {@link NodeManagementSubscriptionDataType }
     *     
     */
    public NodeManagementSubscriptionDataType getNodeManagementSubscriptionData() {
        return nodeManagementSubscriptionData;
    }

    /**
     * Sets the value of the nodeManagementSubscriptionData property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeManagementSubscriptionDataType }
     *     
     */
    public void setNodeManagementSubscriptionData(NodeManagementSubscriptionDataType value) {
        this.nodeManagementSubscriptionData = value;
    }

    /**
     * Gets the value of the nodeManagementSubscriptionDeleteCall property.
     * 
     * @return
     *     possible object is
     *     {@link NodeManagementSubscriptionDeleteCallType }
     *     
     */
    public NodeManagementSubscriptionDeleteCallType getNodeManagementSubscriptionDeleteCall() {
        return nodeManagementSubscriptionDeleteCall;
    }

    /**
     * Sets the value of the nodeManagementSubscriptionDeleteCall property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeManagementSubscriptionDeleteCallType }
     *     
     */
    public void setNodeManagementSubscriptionDeleteCall(NodeManagementSubscriptionDeleteCallType value) {
        this.nodeManagementSubscriptionDeleteCall = value;
    }

    /**
     * Gets the value of the nodeManagementSubscriptionRequestCall property.
     * 
     * @return
     *     possible object is
     *     {@link NodeManagementSubscriptionRequestCallType }
     *     
     */
    public NodeManagementSubscriptionRequestCallType getNodeManagementSubscriptionRequestCall() {
        return nodeManagementSubscriptionRequestCall;
    }

    /**
     * Sets the value of the nodeManagementSubscriptionRequestCall property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeManagementSubscriptionRequestCallType }
     *     
     */
    public void setNodeManagementSubscriptionRequestCall(NodeManagementSubscriptionRequestCallType value) {
        this.nodeManagementSubscriptionRequestCall = value;
    }

    /**
     * Gets the value of the nodeManagementUseCaseData property.
     * 
     * @return
     *     possible object is
     *     {@link NodeManagementUseCaseDataType }
     *     
     */
    public NodeManagementUseCaseDataType getNodeManagementUseCaseData() {
        return nodeManagementUseCaseData;
    }

    /**
     * Sets the value of the nodeManagementUseCaseData property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeManagementUseCaseDataType }
     *     
     */
    public void setNodeManagementUseCaseData(NodeManagementUseCaseDataType value) {
        this.nodeManagementUseCaseData = value;
    }

    /**
     * Gets the value of the operatingConstraintsDurationListData property.
     * 
     * @return
     *     possible object is
     *     {@link OperatingConstraintsDurationListDataType }
     *     
     */
    public OperatingConstraintsDurationListDataType getOperatingConstraintsDurationListData() {
        return operatingConstraintsDurationListData;
    }

    /**
     * Sets the value of the operatingConstraintsDurationListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatingConstraintsDurationListDataType }
     *     
     */
    public void setOperatingConstraintsDurationListData(OperatingConstraintsDurationListDataType value) {
        this.operatingConstraintsDurationListData = value;
    }

    /**
     * Gets the value of the operatingConstraintsInterruptListData property.
     * 
     * @return
     *     possible object is
     *     {@link OperatingConstraintsInterruptListDataType }
     *     
     */
    public OperatingConstraintsInterruptListDataType getOperatingConstraintsInterruptListData() {
        return operatingConstraintsInterruptListData;
    }

    /**
     * Sets the value of the operatingConstraintsInterruptListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatingConstraintsInterruptListDataType }
     *     
     */
    public void setOperatingConstraintsInterruptListData(OperatingConstraintsInterruptListDataType value) {
        this.operatingConstraintsInterruptListData = value;
    }

    /**
     * Gets the value of the operatingConstraintsPowerDescriptionListData property.
     * 
     * @return
     *     possible object is
     *     {@link OperatingConstraintsPowerDescriptionListDataType }
     *     
     */
    public OperatingConstraintsPowerDescriptionListDataType getOperatingConstraintsPowerDescriptionListData() {
        return operatingConstraintsPowerDescriptionListData;
    }

    /**
     * Sets the value of the operatingConstraintsPowerDescriptionListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatingConstraintsPowerDescriptionListDataType }
     *     
     */
    public void setOperatingConstraintsPowerDescriptionListData(OperatingConstraintsPowerDescriptionListDataType value) {
        this.operatingConstraintsPowerDescriptionListData = value;
    }

    /**
     * Gets the value of the operatingConstraintsPowerLevelListData property.
     * 
     * @return
     *     possible object is
     *     {@link OperatingConstraintsPowerLevelListDataType }
     *     
     */
    public OperatingConstraintsPowerLevelListDataType getOperatingConstraintsPowerLevelListData() {
        return operatingConstraintsPowerLevelListData;
    }

    /**
     * Sets the value of the operatingConstraintsPowerLevelListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatingConstraintsPowerLevelListDataType }
     *     
     */
    public void setOperatingConstraintsPowerLevelListData(OperatingConstraintsPowerLevelListDataType value) {
        this.operatingConstraintsPowerLevelListData = value;
    }

    /**
     * Gets the value of the operatingConstraintsPowerRangeListData property.
     * 
     * @return
     *     possible object is
     *     {@link OperatingConstraintsPowerRangeListDataType }
     *     
     */
    public OperatingConstraintsPowerRangeListDataType getOperatingConstraintsPowerRangeListData() {
        return operatingConstraintsPowerRangeListData;
    }

    /**
     * Sets the value of the operatingConstraintsPowerRangeListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatingConstraintsPowerRangeListDataType }
     *     
     */
    public void setOperatingConstraintsPowerRangeListData(OperatingConstraintsPowerRangeListDataType value) {
        this.operatingConstraintsPowerRangeListData = value;
    }

    /**
     * Gets the value of the operatingConstraintsResumeImplicationListData property.
     * 
     * @return
     *     possible object is
     *     {@link OperatingConstraintsResumeImplicationListDataType }
     *     
     */
    public OperatingConstraintsResumeImplicationListDataType getOperatingConstraintsResumeImplicationListData() {
        return operatingConstraintsResumeImplicationListData;
    }

    /**
     * Sets the value of the operatingConstraintsResumeImplicationListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatingConstraintsResumeImplicationListDataType }
     *     
     */
    public void setOperatingConstraintsResumeImplicationListData(OperatingConstraintsResumeImplicationListDataType value) {
        this.operatingConstraintsResumeImplicationListData = value;
    }

    /**
     * Gets the value of the powerSequenceAlternativesRelationListData property.
     * 
     * @return
     *     possible object is
     *     {@link PowerSequenceAlternativesRelationListDataType }
     *     
     */
    public PowerSequenceAlternativesRelationListDataType getPowerSequenceAlternativesRelationListData() {
        return powerSequenceAlternativesRelationListData;
    }

    /**
     * Sets the value of the powerSequenceAlternativesRelationListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PowerSequenceAlternativesRelationListDataType }
     *     
     */
    public void setPowerSequenceAlternativesRelationListData(PowerSequenceAlternativesRelationListDataType value) {
        this.powerSequenceAlternativesRelationListData = value;
    }

    /**
     * Gets the value of the powerSequenceDescriptionListData property.
     * 
     * @return
     *     possible object is
     *     {@link PowerSequenceDescriptionListDataType }
     *     
     */
    public PowerSequenceDescriptionListDataType getPowerSequenceDescriptionListData() {
        return powerSequenceDescriptionListData;
    }

    /**
     * Sets the value of the powerSequenceDescriptionListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PowerSequenceDescriptionListDataType }
     *     
     */
    public void setPowerSequenceDescriptionListData(PowerSequenceDescriptionListDataType value) {
        this.powerSequenceDescriptionListData = value;
    }

    /**
     * Gets the value of the powerSequenceNodeScheduleInformationData property.
     * 
     * @return
     *     possible object is
     *     {@link PowerSequenceNodeScheduleInformationDataType }
     *     
     */
    public PowerSequenceNodeScheduleInformationDataType getPowerSequenceNodeScheduleInformationData() {
        return powerSequenceNodeScheduleInformationData;
    }

    /**
     * Sets the value of the powerSequenceNodeScheduleInformationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PowerSequenceNodeScheduleInformationDataType }
     *     
     */
    public void setPowerSequenceNodeScheduleInformationData(PowerSequenceNodeScheduleInformationDataType value) {
        this.powerSequenceNodeScheduleInformationData = value;
    }

    /**
     * Gets the value of the powerSequencePriceCalculationRequestCall property.
     * 
     * @return
     *     possible object is
     *     {@link PowerSequencePriceCalculationRequestCallType }
     *     
     */
    public PowerSequencePriceCalculationRequestCallType getPowerSequencePriceCalculationRequestCall() {
        return powerSequencePriceCalculationRequestCall;
    }

    /**
     * Sets the value of the powerSequencePriceCalculationRequestCall property.
     * 
     * @param value
     *     allowed object is
     *     {@link PowerSequencePriceCalculationRequestCallType }
     *     
     */
    public void setPowerSequencePriceCalculationRequestCall(PowerSequencePriceCalculationRequestCallType value) {
        this.powerSequencePriceCalculationRequestCall = value;
    }

    /**
     * Gets the value of the powerSequencePriceListData property.
     * 
     * @return
     *     possible object is
     *     {@link PowerSequencePriceListDataType }
     *     
     */
    public PowerSequencePriceListDataType getPowerSequencePriceListData() {
        return powerSequencePriceListData;
    }

    /**
     * Sets the value of the powerSequencePriceListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PowerSequencePriceListDataType }
     *     
     */
    public void setPowerSequencePriceListData(PowerSequencePriceListDataType value) {
        this.powerSequencePriceListData = value;
    }

    /**
     * Gets the value of the powerSequenceScheduleConfigurationRequestCall property.
     * 
     * @return
     *     possible object is
     *     {@link PowerSequenceScheduleConfigurationRequestCallType }
     *     
     */
    public PowerSequenceScheduleConfigurationRequestCallType getPowerSequenceScheduleConfigurationRequestCall() {
        return powerSequenceScheduleConfigurationRequestCall;
    }

    /**
     * Sets the value of the powerSequenceScheduleConfigurationRequestCall property.
     * 
     * @param value
     *     allowed object is
     *     {@link PowerSequenceScheduleConfigurationRequestCallType }
     *     
     */
    public void setPowerSequenceScheduleConfigurationRequestCall(PowerSequenceScheduleConfigurationRequestCallType value) {
        this.powerSequenceScheduleConfigurationRequestCall = value;
    }

    /**
     * Gets the value of the powerSequenceScheduleConstraintsListData property.
     * 
     * @return
     *     possible object is
     *     {@link PowerSequenceScheduleConstraintsListDataType }
     *     
     */
    public PowerSequenceScheduleConstraintsListDataType getPowerSequenceScheduleConstraintsListData() {
        return powerSequenceScheduleConstraintsListData;
    }

    /**
     * Sets the value of the powerSequenceScheduleConstraintsListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PowerSequenceScheduleConstraintsListDataType }
     *     
     */
    public void setPowerSequenceScheduleConstraintsListData(PowerSequenceScheduleConstraintsListDataType value) {
        this.powerSequenceScheduleConstraintsListData = value;
    }

    /**
     * Gets the value of the powerSequenceScheduleListData property.
     * 
     * @return
     *     possible object is
     *     {@link PowerSequenceScheduleListDataType }
     *     
     */
    public PowerSequenceScheduleListDataType getPowerSequenceScheduleListData() {
        return powerSequenceScheduleListData;
    }

    /**
     * Sets the value of the powerSequenceScheduleListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PowerSequenceScheduleListDataType }
     *     
     */
    public void setPowerSequenceScheduleListData(PowerSequenceScheduleListDataType value) {
        this.powerSequenceScheduleListData = value;
    }

    /**
     * Gets the value of the powerSequenceSchedulePreferenceListData property.
     * 
     * @return
     *     possible object is
     *     {@link PowerSequenceSchedulePreferenceListDataType }
     *     
     */
    public PowerSequenceSchedulePreferenceListDataType getPowerSequenceSchedulePreferenceListData() {
        return powerSequenceSchedulePreferenceListData;
    }

    /**
     * Sets the value of the powerSequenceSchedulePreferenceListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PowerSequenceSchedulePreferenceListDataType }
     *     
     */
    public void setPowerSequenceSchedulePreferenceListData(PowerSequenceSchedulePreferenceListDataType value) {
        this.powerSequenceSchedulePreferenceListData = value;
    }

    /**
     * Gets the value of the powerSequenceStateListData property.
     * 
     * @return
     *     possible object is
     *     {@link PowerSequenceStateListDataType }
     *     
     */
    public PowerSequenceStateListDataType getPowerSequenceStateListData() {
        return powerSequenceStateListData;
    }

    /**
     * Sets the value of the powerSequenceStateListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PowerSequenceStateListDataType }
     *     
     */
    public void setPowerSequenceStateListData(PowerSequenceStateListDataType value) {
        this.powerSequenceStateListData = value;
    }

    /**
     * Gets the value of the powerTimeSlotScheduleConstraintsListData property.
     * 
     * @return
     *     possible object is
     *     {@link PowerTimeSlotScheduleConstraintsListDataType }
     *     
     */
    public PowerTimeSlotScheduleConstraintsListDataType getPowerTimeSlotScheduleConstraintsListData() {
        return powerTimeSlotScheduleConstraintsListData;
    }

    /**
     * Sets the value of the powerTimeSlotScheduleConstraintsListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PowerTimeSlotScheduleConstraintsListDataType }
     *     
     */
    public void setPowerTimeSlotScheduleConstraintsListData(PowerTimeSlotScheduleConstraintsListDataType value) {
        this.powerTimeSlotScheduleConstraintsListData = value;
    }

    /**
     * Gets the value of the powerTimeSlotScheduleListData property.
     * 
     * @return
     *     possible object is
     *     {@link PowerTimeSlotScheduleListDataType }
     *     
     */
    public PowerTimeSlotScheduleListDataType getPowerTimeSlotScheduleListData() {
        return powerTimeSlotScheduleListData;
    }

    /**
     * Sets the value of the powerTimeSlotScheduleListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PowerTimeSlotScheduleListDataType }
     *     
     */
    public void setPowerTimeSlotScheduleListData(PowerTimeSlotScheduleListDataType value) {
        this.powerTimeSlotScheduleListData = value;
    }

    /**
     * Gets the value of the powerTimeSlotValueListData property.
     * 
     * @return
     *     possible object is
     *     {@link PowerTimeSlotValueListDataType }
     *     
     */
    public PowerTimeSlotValueListDataType getPowerTimeSlotValueListData() {
        return powerTimeSlotValueListData;
    }

    /**
     * Sets the value of the powerTimeSlotValueListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PowerTimeSlotValueListDataType }
     *     
     */
    public void setPowerTimeSlotValueListData(PowerTimeSlotValueListDataType value) {
        this.powerTimeSlotValueListData = value;
    }

    /**
     * Gets the value of the resultData property.
     * 
     * @return
     *     possible object is
     *     {@link ResultDataType }
     *     
     */
    public ResultDataType getResultData() {
        return resultData;
    }

    /**
     * Sets the value of the resultData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultDataType }
     *     
     */
    public void setResultData(ResultDataType value) {
        this.resultData = value;
    }

    /**
     * Gets the value of the sensingDescriptionData property.
     * 
     * @return
     *     possible object is
     *     {@link SensingDescriptionDataType }
     *     
     */
    public SensingDescriptionDataType getSensingDescriptionData() {
        return sensingDescriptionData;
    }

    /**
     * Sets the value of the sensingDescriptionData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SensingDescriptionDataType }
     *     
     */
    public void setSensingDescriptionData(SensingDescriptionDataType value) {
        this.sensingDescriptionData = value;
    }

    /**
     * Gets the value of the sensingListData property.
     * 
     * @return
     *     possible object is
     *     {@link SensingListDataType }
     *     
     */
    public SensingListDataType getSensingListData() {
        return sensingListData;
    }

    /**
     * Sets the value of the sensingListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SensingListDataType }
     *     
     */
    public void setSensingListData(SensingListDataType value) {
        this.sensingListData = value;
    }

    /**
     * Gets the value of the sessionIdentificationListData property.
     * 
     * @return
     *     possible object is
     *     {@link SessionIdentificationListDataType }
     *     
     */
    public SessionIdentificationListDataType getSessionIdentificationListData() {
        return sessionIdentificationListData;
    }

    /**
     * Sets the value of the sessionIdentificationListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SessionIdentificationListDataType }
     *     
     */
    public void setSessionIdentificationListData(SessionIdentificationListDataType value) {
        this.sessionIdentificationListData = value;
    }

    /**
     * Gets the value of the sessionMeasurementRelationListData property.
     * 
     * @return
     *     possible object is
     *     {@link SessionMeasurementRelationListDataType }
     *     
     */
    public SessionMeasurementRelationListDataType getSessionMeasurementRelationListData() {
        return sessionMeasurementRelationListData;
    }

    /**
     * Sets the value of the sessionMeasurementRelationListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SessionMeasurementRelationListDataType }
     *     
     */
    public void setSessionMeasurementRelationListData(SessionMeasurementRelationListDataType value) {
        this.sessionMeasurementRelationListData = value;
    }

    /**
     * Gets the value of the setpointConstraintsListData property.
     * 
     * @return
     *     possible object is
     *     {@link SetpointConstraintsListDataType }
     *     
     */
    public SetpointConstraintsListDataType getSetpointConstraintsListData() {
        return setpointConstraintsListData;
    }

    /**
     * Sets the value of the setpointConstraintsListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SetpointConstraintsListDataType }
     *     
     */
    public void setSetpointConstraintsListData(SetpointConstraintsListDataType value) {
        this.setpointConstraintsListData = value;
    }

    /**
     * Gets the value of the setpointDescriptionListData property.
     * 
     * @return
     *     possible object is
     *     {@link SetpointDescriptionListDataType }
     *     
     */
    public SetpointDescriptionListDataType getSetpointDescriptionListData() {
        return setpointDescriptionListData;
    }

    /**
     * Sets the value of the setpointDescriptionListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SetpointDescriptionListDataType }
     *     
     */
    public void setSetpointDescriptionListData(SetpointDescriptionListDataType value) {
        this.setpointDescriptionListData = value;
    }

    /**
     * Gets the value of the setpointListData property.
     * 
     * @return
     *     possible object is
     *     {@link SetpointListDataType }
     *     
     */
    public SetpointListDataType getSetpointListData() {
        return setpointListData;
    }

    /**
     * Sets the value of the setpointListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SetpointListDataType }
     *     
     */
    public void setSetpointListData(SetpointListDataType value) {
        this.setpointListData = value;
    }

    /**
     * Gets the value of the smartEnergyManagementPsConfigurationRequestCall property.
     * 
     * @return
     *     possible object is
     *     {@link SmartEnergyManagementPsConfigurationRequestCallType }
     *     
     */
    public SmartEnergyManagementPsConfigurationRequestCallType getSmartEnergyManagementPsConfigurationRequestCall() {
        return smartEnergyManagementPsConfigurationRequestCall;
    }

    /**
     * Sets the value of the smartEnergyManagementPsConfigurationRequestCall property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmartEnergyManagementPsConfigurationRequestCallType }
     *     
     */
    public void setSmartEnergyManagementPsConfigurationRequestCall(SmartEnergyManagementPsConfigurationRequestCallType value) {
        this.smartEnergyManagementPsConfigurationRequestCall = value;
    }

    /**
     * Gets the value of the smartEnergyManagementPsData property.
     * 
     * @return
     *     possible object is
     *     {@link SmartEnergyManagementPsDataType }
     *     
     */
    public SmartEnergyManagementPsDataType getSmartEnergyManagementPsData() {
        return smartEnergyManagementPsData;
    }

    /**
     * Sets the value of the smartEnergyManagementPsData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmartEnergyManagementPsDataType }
     *     
     */
    public void setSmartEnergyManagementPsData(SmartEnergyManagementPsDataType value) {
        this.smartEnergyManagementPsData = value;
    }

    /**
     * Gets the value of the smartEnergyManagementPsPriceCalculationRequestCall property.
     * 
     * @return
     *     possible object is
     *     {@link SmartEnergyManagementPsPriceCalculationRequestCallType }
     *     
     */
    public SmartEnergyManagementPsPriceCalculationRequestCallType getSmartEnergyManagementPsPriceCalculationRequestCall() {
        return smartEnergyManagementPsPriceCalculationRequestCall;
    }

    /**
     * Sets the value of the smartEnergyManagementPsPriceCalculationRequestCall property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmartEnergyManagementPsPriceCalculationRequestCallType }
     *     
     */
    public void setSmartEnergyManagementPsPriceCalculationRequestCall(SmartEnergyManagementPsPriceCalculationRequestCallType value) {
        this.smartEnergyManagementPsPriceCalculationRequestCall = value;
    }

    /**
     * Gets the value of the smartEnergyManagementPsPriceData property.
     * 
     * @return
     *     possible object is
     *     {@link SmartEnergyManagementPsPriceDataType }
     *     
     */
    public SmartEnergyManagementPsPriceDataType getSmartEnergyManagementPsPriceData() {
        return smartEnergyManagementPsPriceData;
    }

    /**
     * Sets the value of the smartEnergyManagementPsPriceData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmartEnergyManagementPsPriceDataType }
     *     
     */
    public void setSmartEnergyManagementPsPriceData(SmartEnergyManagementPsPriceDataType value) {
        this.smartEnergyManagementPsPriceData = value;
    }

    /**
     * Gets the value of the specificationVersionListData property.
     * 
     * @return
     *     possible object is
     *     {@link SpecificationVersionListDataType }
     *     
     */
    public SpecificationVersionListDataType getSpecificationVersionListData() {
        return specificationVersionListData;
    }

    /**
     * Sets the value of the specificationVersionListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecificationVersionListDataType }
     *     
     */
    public void setSpecificationVersionListData(SpecificationVersionListDataType value) {
        this.specificationVersionListData = value;
    }

    /**
     * Gets the value of the stateInformationListData property.
     * 
     * @return
     *     possible object is
     *     {@link StateInformationListDataType }
     *     
     */
    public StateInformationListDataType getStateInformationListData() {
        return stateInformationListData;
    }

    /**
     * Sets the value of the stateInformationListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link StateInformationListDataType }
     *     
     */
    public void setStateInformationListData(StateInformationListDataType value) {
        this.stateInformationListData = value;
    }

    /**
     * Gets the value of the subscriptionManagementDeleteCall property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionManagementDeleteCallType }
     *     
     */
    public SubscriptionManagementDeleteCallType getSubscriptionManagementDeleteCall() {
        return subscriptionManagementDeleteCall;
    }

    /**
     * Sets the value of the subscriptionManagementDeleteCall property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionManagementDeleteCallType }
     *     
     */
    public void setSubscriptionManagementDeleteCall(SubscriptionManagementDeleteCallType value) {
        this.subscriptionManagementDeleteCall = value;
    }

    /**
     * Gets the value of the subscriptionManagementEntryListData property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionManagementEntryListDataType }
     *     
     */
    public SubscriptionManagementEntryListDataType getSubscriptionManagementEntryListData() {
        return subscriptionManagementEntryListData;
    }

    /**
     * Sets the value of the subscriptionManagementEntryListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionManagementEntryListDataType }
     *     
     */
    public void setSubscriptionManagementEntryListData(SubscriptionManagementEntryListDataType value) {
        this.subscriptionManagementEntryListData = value;
    }

    /**
     * Gets the value of the subscriptionManagementRequestCall property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionManagementRequestCallType }
     *     
     */
    public SubscriptionManagementRequestCallType getSubscriptionManagementRequestCall() {
        return subscriptionManagementRequestCall;
    }

    /**
     * Sets the value of the subscriptionManagementRequestCall property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionManagementRequestCallType }
     *     
     */
    public void setSubscriptionManagementRequestCall(SubscriptionManagementRequestCallType value) {
        this.subscriptionManagementRequestCall = value;
    }

    /**
     * Gets the value of the supplyConditionDescriptionListData property.
     * 
     * @return
     *     possible object is
     *     {@link SupplyConditionDescriptionListDataType }
     *     
     */
    public SupplyConditionDescriptionListDataType getSupplyConditionDescriptionListData() {
        return supplyConditionDescriptionListData;
    }

    /**
     * Sets the value of the supplyConditionDescriptionListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplyConditionDescriptionListDataType }
     *     
     */
    public void setSupplyConditionDescriptionListData(SupplyConditionDescriptionListDataType value) {
        this.supplyConditionDescriptionListData = value;
    }

    /**
     * Gets the value of the supplyConditionListData property.
     * 
     * @return
     *     possible object is
     *     {@link SupplyConditionListDataType }
     *     
     */
    public SupplyConditionListDataType getSupplyConditionListData() {
        return supplyConditionListData;
    }

    /**
     * Sets the value of the supplyConditionListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplyConditionListDataType }
     *     
     */
    public void setSupplyConditionListData(SupplyConditionListDataType value) {
        this.supplyConditionListData = value;
    }

    /**
     * Gets the value of the supplyConditionThresholdRelationListData property.
     * 
     * @return
     *     possible object is
     *     {@link SupplyConditionThresholdRelationListDataType }
     *     
     */
    public SupplyConditionThresholdRelationListDataType getSupplyConditionThresholdRelationListData() {
        return supplyConditionThresholdRelationListData;
    }

    /**
     * Sets the value of the supplyConditionThresholdRelationListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplyConditionThresholdRelationListDataType }
     *     
     */
    public void setSupplyConditionThresholdRelationListData(SupplyConditionThresholdRelationListDataType value) {
        this.supplyConditionThresholdRelationListData = value;
    }

    /**
     * Gets the value of the tariffBoundaryRelationListData property.
     * 
     * @return
     *     possible object is
     *     {@link TariffBoundaryRelationListDataType }
     *     
     */
    public TariffBoundaryRelationListDataType getTariffBoundaryRelationListData() {
        return tariffBoundaryRelationListData;
    }

    /**
     * Sets the value of the tariffBoundaryRelationListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TariffBoundaryRelationListDataType }
     *     
     */
    public void setTariffBoundaryRelationListData(TariffBoundaryRelationListDataType value) {
        this.tariffBoundaryRelationListData = value;
    }

    /**
     * Gets the value of the tariffDescriptionListData property.
     * 
     * @return
     *     possible object is
     *     {@link TariffDescriptionListDataType }
     *     
     */
    public TariffDescriptionListDataType getTariffDescriptionListData() {
        return tariffDescriptionListData;
    }

    /**
     * Sets the value of the tariffDescriptionListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TariffDescriptionListDataType }
     *     
     */
    public void setTariffDescriptionListData(TariffDescriptionListDataType value) {
        this.tariffDescriptionListData = value;
    }

    /**
     * Gets the value of the tariffListData property.
     * 
     * @return
     *     possible object is
     *     {@link TariffListDataType }
     *     
     */
    public TariffListDataType getTariffListData() {
        return tariffListData;
    }

    /**
     * Sets the value of the tariffListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TariffListDataType }
     *     
     */
    public void setTariffListData(TariffListDataType value) {
        this.tariffListData = value;
    }

    /**
     * Gets the value of the tariffOverallConstraintsData property.
     * 
     * @return
     *     possible object is
     *     {@link TariffOverallConstraintsDataType }
     *     
     */
    public TariffOverallConstraintsDataType getTariffOverallConstraintsData() {
        return tariffOverallConstraintsData;
    }

    /**
     * Sets the value of the tariffOverallConstraintsData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TariffOverallConstraintsDataType }
     *     
     */
    public void setTariffOverallConstraintsData(TariffOverallConstraintsDataType value) {
        this.tariffOverallConstraintsData = value;
    }

    /**
     * Gets the value of the tariffTierRelationListData property.
     * 
     * @return
     *     possible object is
     *     {@link TariffTierRelationListDataType }
     *     
     */
    public TariffTierRelationListDataType getTariffTierRelationListData() {
        return tariffTierRelationListData;
    }

    /**
     * Sets the value of the tariffTierRelationListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TariffTierRelationListDataType }
     *     
     */
    public void setTariffTierRelationListData(TariffTierRelationListDataType value) {
        this.tariffTierRelationListData = value;
    }

    /**
     * Gets the value of the taskManagementJobDescriptionListData property.
     * 
     * @return
     *     possible object is
     *     {@link TaskManagementJobDescriptionListDataType }
     *     
     */
    public TaskManagementJobDescriptionListDataType getTaskManagementJobDescriptionListData() {
        return taskManagementJobDescriptionListData;
    }

    /**
     * Sets the value of the taskManagementJobDescriptionListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskManagementJobDescriptionListDataType }
     *     
     */
    public void setTaskManagementJobDescriptionListData(TaskManagementJobDescriptionListDataType value) {
        this.taskManagementJobDescriptionListData = value;
    }

    /**
     * Gets the value of the taskManagementJobListData property.
     * 
     * @return
     *     possible object is
     *     {@link TaskManagementJobListDataType }
     *     
     */
    public TaskManagementJobListDataType getTaskManagementJobListData() {
        return taskManagementJobListData;
    }

    /**
     * Sets the value of the taskManagementJobListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskManagementJobListDataType }
     *     
     */
    public void setTaskManagementJobListData(TaskManagementJobListDataType value) {
        this.taskManagementJobListData = value;
    }

    /**
     * Gets the value of the taskManagementJobRelationListData property.
     * 
     * @return
     *     possible object is
     *     {@link TaskManagementJobRelationListDataType }
     *     
     */
    public TaskManagementJobRelationListDataType getTaskManagementJobRelationListData() {
        return taskManagementJobRelationListData;
    }

    /**
     * Sets the value of the taskManagementJobRelationListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskManagementJobRelationListDataType }
     *     
     */
    public void setTaskManagementJobRelationListData(TaskManagementJobRelationListDataType value) {
        this.taskManagementJobRelationListData = value;
    }

    /**
     * Gets the value of the taskManagementOverviewData property.
     * 
     * @return
     *     possible object is
     *     {@link TaskManagementOverviewDataType }
     *     
     */
    public TaskManagementOverviewDataType getTaskManagementOverviewData() {
        return taskManagementOverviewData;
    }

    /**
     * Sets the value of the taskManagementOverviewData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskManagementOverviewDataType }
     *     
     */
    public void setTaskManagementOverviewData(TaskManagementOverviewDataType value) {
        this.taskManagementOverviewData = value;
    }

    /**
     * Gets the value of the thresholdConstraintsListData property.
     * 
     * @return
     *     possible object is
     *     {@link ThresholdConstraintsListDataType }
     *     
     */
    public ThresholdConstraintsListDataType getThresholdConstraintsListData() {
        return thresholdConstraintsListData;
    }

    /**
     * Sets the value of the thresholdConstraintsListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThresholdConstraintsListDataType }
     *     
     */
    public void setThresholdConstraintsListData(ThresholdConstraintsListDataType value) {
        this.thresholdConstraintsListData = value;
    }

    /**
     * Gets the value of the thresholdDescriptionListData property.
     * 
     * @return
     *     possible object is
     *     {@link ThresholdDescriptionListDataType }
     *     
     */
    public ThresholdDescriptionListDataType getThresholdDescriptionListData() {
        return thresholdDescriptionListData;
    }

    /**
     * Sets the value of the thresholdDescriptionListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThresholdDescriptionListDataType }
     *     
     */
    public void setThresholdDescriptionListData(ThresholdDescriptionListDataType value) {
        this.thresholdDescriptionListData = value;
    }

    /**
     * Gets the value of the thresholdListData property.
     * 
     * @return
     *     possible object is
     *     {@link ThresholdListDataType }
     *     
     */
    public ThresholdListDataType getThresholdListData() {
        return thresholdListData;
    }

    /**
     * Sets the value of the thresholdListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThresholdListDataType }
     *     
     */
    public void setThresholdListData(ThresholdListDataType value) {
        this.thresholdListData = value;
    }

    /**
     * Gets the value of the tierBoundaryDescriptionListData property.
     * 
     * @return
     *     possible object is
     *     {@link TierBoundaryDescriptionListDataType }
     *     
     */
    public TierBoundaryDescriptionListDataType getTierBoundaryDescriptionListData() {
        return tierBoundaryDescriptionListData;
    }

    /**
     * Sets the value of the tierBoundaryDescriptionListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TierBoundaryDescriptionListDataType }
     *     
     */
    public void setTierBoundaryDescriptionListData(TierBoundaryDescriptionListDataType value) {
        this.tierBoundaryDescriptionListData = value;
    }

    /**
     * Gets the value of the tierBoundaryListData property.
     * 
     * @return
     *     possible object is
     *     {@link TierBoundaryListDataType }
     *     
     */
    public TierBoundaryListDataType getTierBoundaryListData() {
        return tierBoundaryListData;
    }

    /**
     * Sets the value of the tierBoundaryListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TierBoundaryListDataType }
     *     
     */
    public void setTierBoundaryListData(TierBoundaryListDataType value) {
        this.tierBoundaryListData = value;
    }

    /**
     * Gets the value of the tierDescriptionListData property.
     * 
     * @return
     *     possible object is
     *     {@link TierDescriptionListDataType }
     *     
     */
    public TierDescriptionListDataType getTierDescriptionListData() {
        return tierDescriptionListData;
    }

    /**
     * Sets the value of the tierDescriptionListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TierDescriptionListDataType }
     *     
     */
    public void setTierDescriptionListData(TierDescriptionListDataType value) {
        this.tierDescriptionListData = value;
    }

    /**
     * Gets the value of the tierIncentiveRelationListData property.
     * 
     * @return
     *     possible object is
     *     {@link TierIncentiveRelationListDataType }
     *     
     */
    public TierIncentiveRelationListDataType getTierIncentiveRelationListData() {
        return tierIncentiveRelationListData;
    }

    /**
     * Sets the value of the tierIncentiveRelationListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TierIncentiveRelationListDataType }
     *     
     */
    public void setTierIncentiveRelationListData(TierIncentiveRelationListDataType value) {
        this.tierIncentiveRelationListData = value;
    }

    /**
     * Gets the value of the tierListData property.
     * 
     * @return
     *     possible object is
     *     {@link TierListDataType }
     *     
     */
    public TierListDataType getTierListData() {
        return tierListData;
    }

    /**
     * Sets the value of the tierListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TierListDataType }
     *     
     */
    public void setTierListData(TierListDataType value) {
        this.tierListData = value;
    }

    /**
     * Gets the value of the timeDistributorData property.
     * 
     * @return
     *     possible object is
     *     {@link TimeDistributorDataType }
     *     
     */
    public TimeDistributorDataType getTimeDistributorData() {
        return timeDistributorData;
    }

    /**
     * Sets the value of the timeDistributorData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeDistributorDataType }
     *     
     */
    public void setTimeDistributorData(TimeDistributorDataType value) {
        this.timeDistributorData = value;
    }

    /**
     * Gets the value of the timeDistributorEnquiryCall property.
     * 
     * @return
     *     possible object is
     *     {@link TimeDistributorEnquiryCallType }
     *     
     */
    public TimeDistributorEnquiryCallType getTimeDistributorEnquiryCall() {
        return timeDistributorEnquiryCall;
    }

    /**
     * Sets the value of the timeDistributorEnquiryCall property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeDistributorEnquiryCallType }
     *     
     */
    public void setTimeDistributorEnquiryCall(TimeDistributorEnquiryCallType value) {
        this.timeDistributorEnquiryCall = value;
    }

    /**
     * Gets the value of the timeInformationData property.
     * 
     * @return
     *     possible object is
     *     {@link TimeInformationDataType }
     *     
     */
    public TimeInformationDataType getTimeInformationData() {
        return timeInformationData;
    }

    /**
     * Sets the value of the timeInformationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeInformationDataType }
     *     
     */
    public void setTimeInformationData(TimeInformationDataType value) {
        this.timeInformationData = value;
    }

    /**
     * Gets the value of the timePrecisionData property.
     * 
     * @return
     *     possible object is
     *     {@link TimePrecisionDataType }
     *     
     */
    public TimePrecisionDataType getTimePrecisionData() {
        return timePrecisionData;
    }

    /**
     * Sets the value of the timePrecisionData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePrecisionDataType }
     *     
     */
    public void setTimePrecisionData(TimePrecisionDataType value) {
        this.timePrecisionData = value;
    }

    /**
     * Gets the value of the timeSeriesConstraintsListData property.
     * 
     * @return
     *     possible object is
     *     {@link TimeSeriesConstraintsListDataType }
     *     
     */
    public TimeSeriesConstraintsListDataType getTimeSeriesConstraintsListData() {
        return timeSeriesConstraintsListData;
    }

    /**
     * Sets the value of the timeSeriesConstraintsListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeSeriesConstraintsListDataType }
     *     
     */
    public void setTimeSeriesConstraintsListData(TimeSeriesConstraintsListDataType value) {
        this.timeSeriesConstraintsListData = value;
    }

    /**
     * Gets the value of the timeSeriesDescriptionListData property.
     * 
     * @return
     *     possible object is
     *     {@link TimeSeriesDescriptionListDataType }
     *     
     */
    public TimeSeriesDescriptionListDataType getTimeSeriesDescriptionListData() {
        return timeSeriesDescriptionListData;
    }

    /**
     * Sets the value of the timeSeriesDescriptionListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeSeriesDescriptionListDataType }
     *     
     */
    public void setTimeSeriesDescriptionListData(TimeSeriesDescriptionListDataType value) {
        this.timeSeriesDescriptionListData = value;
    }

    /**
     * Gets the value of the timeSeriesListData property.
     * 
     * @return
     *     possible object is
     *     {@link TimeSeriesListDataType }
     *     
     */
    public TimeSeriesListDataType getTimeSeriesListData() {
        return timeSeriesListData;
    }

    /**
     * Sets the value of the timeSeriesListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeSeriesListDataType }
     *     
     */
    public void setTimeSeriesListData(TimeSeriesListDataType value) {
        this.timeSeriesListData = value;
    }

    /**
     * Gets the value of the timeTableConstraintsListData property.
     * 
     * @return
     *     possible object is
     *     {@link TimeTableConstraintsListDataType }
     *     
     */
    public TimeTableConstraintsListDataType getTimeTableConstraintsListData() {
        return timeTableConstraintsListData;
    }

    /**
     * Sets the value of the timeTableConstraintsListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeTableConstraintsListDataType }
     *     
     */
    public void setTimeTableConstraintsListData(TimeTableConstraintsListDataType value) {
        this.timeTableConstraintsListData = value;
    }

    /**
     * Gets the value of the timeTableDescriptionListData property.
     * 
     * @return
     *     possible object is
     *     {@link TimeTableDescriptionListDataType }
     *     
     */
    public TimeTableDescriptionListDataType getTimeTableDescriptionListData() {
        return timeTableDescriptionListData;
    }

    /**
     * Sets the value of the timeTableDescriptionListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeTableDescriptionListDataType }
     *     
     */
    public void setTimeTableDescriptionListData(TimeTableDescriptionListDataType value) {
        this.timeTableDescriptionListData = value;
    }

    /**
     * Gets the value of the timeTableListData property.
     * 
     * @return
     *     possible object is
     *     {@link TimeTableListDataType }
     *     
     */
    public TimeTableListDataType getTimeTableListData() {
        return timeTableListData;
    }

    /**
     * Sets the value of the timeTableListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeTableListDataType }
     *     
     */
    public void setTimeTableListData(TimeTableListDataType value) {
        this.timeTableListData = value;
    }

    /**
     * Gets the value of the useCaseInformationListData property.
     * 
     * @return
     *     possible object is
     *     {@link UseCaseInformationListDataType }
     *     
     */
    public UseCaseInformationListDataType getUseCaseInformationListData() {
        return useCaseInformationListData;
    }

    /**
     * Sets the value of the useCaseInformationListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link UseCaseInformationListDataType }
     *     
     */
    public void setUseCaseInformationListData(UseCaseInformationListDataType value) {
        this.useCaseInformationListData = value;
    }

    /**
     * Gets the value of the manufacturerSpecificExtension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getManufacturerSpecificExtension() {
        return manufacturerSpecificExtension;
    }

    /**
     * Sets the value of the manufacturerSpecificExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturerSpecificExtension(byte[] value) {
        this.manufacturerSpecificExtension = value;
    }

    /**
     * Gets the value of the lastUpdateAt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastUpdateAt() {
        return lastUpdateAt;
    }

    /**
     * Sets the value of the lastUpdateAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastUpdateAt(String value) {
        this.lastUpdateAt = value;
    }

    /**
     * Sets the value of the function property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public CmdType withFunction(String value) {
        setFunction(value);
        return this;
    }

    /**
     * Adds objects to the list of Filter using add method
     * 
     * @param values
     *     objects to add to the list Filter
     * @return
     *     The class instance
     */
    public CmdType withFilter(FilterType... values) {
        if (values!= null) {
            for (FilterType value: values) {
                getFilter().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of Filter using addAll method
     * 
     * @param values
     *     objects to add to the list Filter
     * @return
     *     The class instance
     */
    public CmdType withFilter(Collection<FilterType> values) {
        if (values!= null) {
            getFilter().addAll(values);
        }
        return this;
    }

    /**
     * Sets the value of the actuatorLevelData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActuatorLevelDataType }
     * @return
     *     The class instance
     */
    public CmdType withActuatorLevelData(ActuatorLevelDataType value) {
        setActuatorLevelData(value);
        return this;
    }

    /**
     * Sets the value of the actuatorLevelDescriptionData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActuatorLevelDescriptionDataType }
     * @return
     *     The class instance
     */
    public CmdType withActuatorLevelDescriptionData(ActuatorLevelDescriptionDataType value) {
        setActuatorLevelDescriptionData(value);
        return this;
    }

    /**
     * Sets the value of the actuatorSwitchData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActuatorSwitchDataType }
     * @return
     *     The class instance
     */
    public CmdType withActuatorSwitchData(ActuatorSwitchDataType value) {
        setActuatorSwitchData(value);
        return this;
    }

    /**
     * Sets the value of the actuatorSwitchDescriptionData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActuatorSwitchDescriptionDataType }
     * @return
     *     The class instance
     */
    public CmdType withActuatorSwitchDescriptionData(ActuatorSwitchDescriptionDataType value) {
        setActuatorSwitchDescriptionData(value);
        return this;
    }

    /**
     * Sets the value of the alarmListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlarmListDataType }
     * @return
     *     The class instance
     */
    public CmdType withAlarmListData(AlarmListDataType value) {
        setAlarmListData(value);
        return this;
    }

    /**
     * Sets the value of the billConstraintsListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillConstraintsListDataType }
     * @return
     *     The class instance
     */
    public CmdType withBillConstraintsListData(BillConstraintsListDataType value) {
        setBillConstraintsListData(value);
        return this;
    }

    /**
     * Sets the value of the billDescriptionListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillDescriptionListDataType }
     * @return
     *     The class instance
     */
    public CmdType withBillDescriptionListData(BillDescriptionListDataType value) {
        setBillDescriptionListData(value);
        return this;
    }

    /**
     * Sets the value of the billListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillListDataType }
     * @return
     *     The class instance
     */
    public CmdType withBillListData(BillListDataType value) {
        setBillListData(value);
        return this;
    }

    /**
     * Sets the value of the bindingManagementDeleteCall property.
     * 
     * @param value
     *     allowed object is
     *     {@link BindingManagementDeleteCallType }
     * @return
     *     The class instance
     */
    public CmdType withBindingManagementDeleteCall(BindingManagementDeleteCallType value) {
        setBindingManagementDeleteCall(value);
        return this;
    }

    /**
     * Sets the value of the bindingManagementEntryListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link BindingManagementEntryListDataType }
     * @return
     *     The class instance
     */
    public CmdType withBindingManagementEntryListData(BindingManagementEntryListDataType value) {
        setBindingManagementEntryListData(value);
        return this;
    }

    /**
     * Sets the value of the bindingManagementRequestCall property.
     * 
     * @param value
     *     allowed object is
     *     {@link BindingManagementRequestCallType }
     * @return
     *     The class instance
     */
    public CmdType withBindingManagementRequestCall(BindingManagementRequestCallType value) {
        setBindingManagementRequestCall(value);
        return this;
    }

    /**
     * Sets the value of the commodityListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityListDataType }
     * @return
     *     The class instance
     */
    public CmdType withCommodityListData(CommodityListDataType value) {
        setCommodityListData(value);
        return this;
    }

    /**
     * Sets the value of the dataTunnelingCall property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataTunnelingCallType }
     * @return
     *     The class instance
     */
    public CmdType withDataTunnelingCall(DataTunnelingCallType value) {
        setDataTunnelingCall(value);
        return this;
    }

    /**
     * Sets the value of the deviceClassificationManufacturerData property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceClassificationManufacturerDataType }
     * @return
     *     The class instance
     */
    public CmdType withDeviceClassificationManufacturerData(DeviceClassificationManufacturerDataType value) {
        setDeviceClassificationManufacturerData(value);
        return this;
    }

    /**
     * Sets the value of the deviceClassificationUserData property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceClassificationUserDataType }
     * @return
     *     The class instance
     */
    public CmdType withDeviceClassificationUserData(DeviceClassificationUserDataType value) {
        setDeviceClassificationUserData(value);
        return this;
    }

    /**
     * Sets the value of the deviceConfigurationKeyValueConstraintsListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceConfigurationKeyValueConstraintsListDataType }
     * @return
     *     The class instance
     */
    public CmdType withDeviceConfigurationKeyValueConstraintsListData(DeviceConfigurationKeyValueConstraintsListDataType value) {
        setDeviceConfigurationKeyValueConstraintsListData(value);
        return this;
    }

    /**
     * Sets the value of the deviceConfigurationKeyValueDescriptionListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceConfigurationKeyValueDescriptionListDataType }
     * @return
     *     The class instance
     */
    public CmdType withDeviceConfigurationKeyValueDescriptionListData(DeviceConfigurationKeyValueDescriptionListDataType value) {
        setDeviceConfigurationKeyValueDescriptionListData(value);
        return this;
    }

    /**
     * Sets the value of the deviceConfigurationKeyValueListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceConfigurationKeyValueListDataType }
     * @return
     *     The class instance
     */
    public CmdType withDeviceConfigurationKeyValueListData(DeviceConfigurationKeyValueListDataType value) {
        setDeviceConfigurationKeyValueListData(value);
        return this;
    }

    /**
     * Sets the value of the deviceDiagnosisHeartbeatData property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceDiagnosisHeartbeatDataType }
     * @return
     *     The class instance
     */
    public CmdType withDeviceDiagnosisHeartbeatData(DeviceDiagnosisHeartbeatDataType value) {
        setDeviceDiagnosisHeartbeatData(value);
        return this;
    }

    /**
     * Sets the value of the deviceDiagnosisServiceData property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceDiagnosisServiceDataType }
     * @return
     *     The class instance
     */
    public CmdType withDeviceDiagnosisServiceData(DeviceDiagnosisServiceDataType value) {
        setDeviceDiagnosisServiceData(value);
        return this;
    }

    /**
     * Sets the value of the deviceDiagnosisStateData property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceDiagnosisStateDataType }
     * @return
     *     The class instance
     */
    public CmdType withDeviceDiagnosisStateData(DeviceDiagnosisStateDataType value) {
        setDeviceDiagnosisStateData(value);
        return this;
    }

    /**
     * Sets the value of the directControlActivityListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectControlActivityListDataType }
     * @return
     *     The class instance
     */
    public CmdType withDirectControlActivityListData(DirectControlActivityListDataType value) {
        setDirectControlActivityListData(value);
        return this;
    }

    /**
     * Sets the value of the directControlDescriptionData property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectControlDescriptionDataType }
     * @return
     *     The class instance
     */
    public CmdType withDirectControlDescriptionData(DirectControlDescriptionDataType value) {
        setDirectControlDescriptionData(value);
        return this;
    }

    /**
     * Sets the value of the electricalConnectionCharacteristicListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElectricalConnectionCharacteristicListDataType }
     * @return
     *     The class instance
     */
    public CmdType withElectricalConnectionCharacteristicListData(ElectricalConnectionCharacteristicListDataType value) {
        setElectricalConnectionCharacteristicListData(value);
        return this;
    }

    /**
     * Sets the value of the electricalConnectionDescriptionListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElectricalConnectionDescriptionListDataType }
     * @return
     *     The class instance
     */
    public CmdType withElectricalConnectionDescriptionListData(ElectricalConnectionDescriptionListDataType value) {
        setElectricalConnectionDescriptionListData(value);
        return this;
    }

    /**
     * Sets the value of the electricalConnectionParameterDescriptionListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElectricalConnectionParameterDescriptionListDataType }
     * @return
     *     The class instance
     */
    public CmdType withElectricalConnectionParameterDescriptionListData(ElectricalConnectionParameterDescriptionListDataType value) {
        setElectricalConnectionParameterDescriptionListData(value);
        return this;
    }

    /**
     * Sets the value of the electricalConnectionPermittedValueSetListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElectricalConnectionPermittedValueSetListDataType }
     * @return
     *     The class instance
     */
    public CmdType withElectricalConnectionPermittedValueSetListData(ElectricalConnectionPermittedValueSetListDataType value) {
        setElectricalConnectionPermittedValueSetListData(value);
        return this;
    }

    /**
     * Sets the value of the electricalConnectionStateListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElectricalConnectionStateListDataType }
     * @return
     *     The class instance
     */
    public CmdType withElectricalConnectionStateListData(ElectricalConnectionStateListDataType value) {
        setElectricalConnectionStateListData(value);
        return this;
    }

    /**
     * Sets the value of the hvacOperationModeDescriptionListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link HvacOperationModeDescriptionListDataType }
     * @return
     *     The class instance
     */
    public CmdType withHvacOperationModeDescriptionListData(HvacOperationModeDescriptionListDataType value) {
        setHvacOperationModeDescriptionListData(value);
        return this;
    }

    /**
     * Sets the value of the hvacOverrunDescriptionListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link HvacOverrunDescriptionListDataType }
     * @return
     *     The class instance
     */
    public CmdType withHvacOverrunDescriptionListData(HvacOverrunDescriptionListDataType value) {
        setHvacOverrunDescriptionListData(value);
        return this;
    }

    /**
     * Sets the value of the hvacOverrunListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link HvacOverrunListDataType }
     * @return
     *     The class instance
     */
    public CmdType withHvacOverrunListData(HvacOverrunListDataType value) {
        setHvacOverrunListData(value);
        return this;
    }

    /**
     * Sets the value of the hvacSystemFunctionDescriptionListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link HvacSystemFunctionDescriptionListDataType }
     * @return
     *     The class instance
     */
    public CmdType withHvacSystemFunctionDescriptionListData(HvacSystemFunctionDescriptionListDataType value) {
        setHvacSystemFunctionDescriptionListData(value);
        return this;
    }

    /**
     * Sets the value of the hvacSystemFunctionListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link HvacSystemFunctionListDataType }
     * @return
     *     The class instance
     */
    public CmdType withHvacSystemFunctionListData(HvacSystemFunctionListDataType value) {
        setHvacSystemFunctionListData(value);
        return this;
    }

    /**
     * Sets the value of the hvacSystemFunctionOperationModeRelationListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link HvacSystemFunctionOperationModeRelationListDataType }
     * @return
     *     The class instance
     */
    public CmdType withHvacSystemFunctionOperationModeRelationListData(HvacSystemFunctionOperationModeRelationListDataType value) {
        setHvacSystemFunctionOperationModeRelationListData(value);
        return this;
    }

    /**
     * Sets the value of the hvacSystemFunctionPowerSequenceRelationListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link HvacSystemFunctionPowerSequenceRelationListDataType }
     * @return
     *     The class instance
     */
    public CmdType withHvacSystemFunctionPowerSequenceRelationListData(HvacSystemFunctionPowerSequenceRelationListDataType value) {
        setHvacSystemFunctionPowerSequenceRelationListData(value);
        return this;
    }

    /**
     * Sets the value of the hvacSystemFunctionSetpointRelationListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link HvacSystemFunctionSetpointRelationListDataType }
     * @return
     *     The class instance
     */
    public CmdType withHvacSystemFunctionSetpointRelationListData(HvacSystemFunctionSetpointRelationListDataType value) {
        setHvacSystemFunctionSetpointRelationListData(value);
        return this;
    }

    /**
     * Sets the value of the identificationListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificationListDataType }
     * @return
     *     The class instance
     */
    public CmdType withIdentificationListData(IdentificationListDataType value) {
        setIdentificationListData(value);
        return this;
    }

    /**
     * Sets the value of the incentiveDescriptionListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncentiveDescriptionListDataType }
     * @return
     *     The class instance
     */
    public CmdType withIncentiveDescriptionListData(IncentiveDescriptionListDataType value) {
        setIncentiveDescriptionListData(value);
        return this;
    }

    /**
     * Sets the value of the incentiveListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncentiveListDataType }
     * @return
     *     The class instance
     */
    public CmdType withIncentiveListData(IncentiveListDataType value) {
        setIncentiveListData(value);
        return this;
    }

    /**
     * Sets the value of the incentiveTableConstraintsData property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncentiveTableConstraintsDataType }
     * @return
     *     The class instance
     */
    public CmdType withIncentiveTableConstraintsData(IncentiveTableConstraintsDataType value) {
        setIncentiveTableConstraintsData(value);
        return this;
    }

    /**
     * Sets the value of the incentiveTableData property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncentiveTableDataType }
     * @return
     *     The class instance
     */
    public CmdType withIncentiveTableData(IncentiveTableDataType value) {
        setIncentiveTableData(value);
        return this;
    }

    /**
     * Sets the value of the incentiveTableDescriptionData property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncentiveTableDescriptionDataType }
     * @return
     *     The class instance
     */
    public CmdType withIncentiveTableDescriptionData(IncentiveTableDescriptionDataType value) {
        setIncentiveTableDescriptionData(value);
        return this;
    }

    /**
     * Sets the value of the loadControlEventListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadControlEventListDataType }
     * @return
     *     The class instance
     */
    public CmdType withLoadControlEventListData(LoadControlEventListDataType value) {
        setLoadControlEventListData(value);
        return this;
    }

    /**
     * Sets the value of the loadControlLimitConstraintsListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadControlLimitConstraintsListDataType }
     * @return
     *     The class instance
     */
    public CmdType withLoadControlLimitConstraintsListData(LoadControlLimitConstraintsListDataType value) {
        setLoadControlLimitConstraintsListData(value);
        return this;
    }

    /**
     * Sets the value of the loadControlLimitDescriptionListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadControlLimitDescriptionListDataType }
     * @return
     *     The class instance
     */
    public CmdType withLoadControlLimitDescriptionListData(LoadControlLimitDescriptionListDataType value) {
        setLoadControlLimitDescriptionListData(value);
        return this;
    }

    /**
     * Sets the value of the loadControlLimitListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadControlLimitListDataType }
     * @return
     *     The class instance
     */
    public CmdType withLoadControlLimitListData(LoadControlLimitListDataType value) {
        setLoadControlLimitListData(value);
        return this;
    }

    /**
     * Sets the value of the loadControlNodeData property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadControlNodeDataType }
     * @return
     *     The class instance
     */
    public CmdType withLoadControlNodeData(LoadControlNodeDataType value) {
        setLoadControlNodeData(value);
        return this;
    }

    /**
     * Sets the value of the loadControlStateListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadControlStateListDataType }
     * @return
     *     The class instance
     */
    public CmdType withLoadControlStateListData(LoadControlStateListDataType value) {
        setLoadControlStateListData(value);
        return this;
    }

    /**
     * Sets the value of the measurementConstraintsListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementConstraintsListDataType }
     * @return
     *     The class instance
     */
    public CmdType withMeasurementConstraintsListData(MeasurementConstraintsListDataType value) {
        setMeasurementConstraintsListData(value);
        return this;
    }

    /**
     * Sets the value of the measurementDescriptionListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementDescriptionListDataType }
     * @return
     *     The class instance
     */
    public CmdType withMeasurementDescriptionListData(MeasurementDescriptionListDataType value) {
        setMeasurementDescriptionListData(value);
        return this;
    }

    /**
     * Sets the value of the measurementListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementListDataType }
     * @return
     *     The class instance
     */
    public CmdType withMeasurementListData(MeasurementListDataType value) {
        setMeasurementListData(value);
        return this;
    }

    /**
     * Sets the value of the measurementSeriesListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementSeriesListDataType }
     * @return
     *     The class instance
     */
    public CmdType withMeasurementSeriesListData(MeasurementSeriesListDataType value) {
        setMeasurementSeriesListData(value);
        return this;
    }

    /**
     * Sets the value of the measurementThresholdRelationListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementThresholdRelationListDataType }
     * @return
     *     The class instance
     */
    public CmdType withMeasurementThresholdRelationListData(MeasurementThresholdRelationListDataType value) {
        setMeasurementThresholdRelationListData(value);
        return this;
    }

    /**
     * Sets the value of the messagingListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessagingListDataType }
     * @return
     *     The class instance
     */
    public CmdType withMessagingListData(MessagingListDataType value) {
        setMessagingListData(value);
        return this;
    }

    /**
     * Sets the value of the networkManagementAbortCall property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkManagementAbortCallType }
     * @return
     *     The class instance
     */
    public CmdType withNetworkManagementAbortCall(NetworkManagementAbortCallType value) {
        setNetworkManagementAbortCall(value);
        return this;
    }

    /**
     * Sets the value of the networkManagementAddNodeCall property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkManagementAddNodeCallType }
     * @return
     *     The class instance
     */
    public CmdType withNetworkManagementAddNodeCall(NetworkManagementAddNodeCallType value) {
        setNetworkManagementAddNodeCall(value);
        return this;
    }

    /**
     * Sets the value of the networkManagementDeviceDescriptionListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkManagementDeviceDescriptionListDataType }
     * @return
     *     The class instance
     */
    public CmdType withNetworkManagementDeviceDescriptionListData(NetworkManagementDeviceDescriptionListDataType value) {
        setNetworkManagementDeviceDescriptionListData(value);
        return this;
    }

    /**
     * Sets the value of the networkManagementDiscoverCall property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkManagementDiscoverCallType }
     * @return
     *     The class instance
     */
    public CmdType withNetworkManagementDiscoverCall(NetworkManagementDiscoverCallType value) {
        setNetworkManagementDiscoverCall(value);
        return this;
    }

    /**
     * Sets the value of the networkManagementEntityDescriptionListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkManagementEntityDescriptionListDataType }
     * @return
     *     The class instance
     */
    public CmdType withNetworkManagementEntityDescriptionListData(NetworkManagementEntityDescriptionListDataType value) {
        setNetworkManagementEntityDescriptionListData(value);
        return this;
    }

    /**
     * Sets the value of the networkManagementFeatureDescriptionListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkManagementFeatureDescriptionListDataType }
     * @return
     *     The class instance
     */
    public CmdType withNetworkManagementFeatureDescriptionListData(NetworkManagementFeatureDescriptionListDataType value) {
        setNetworkManagementFeatureDescriptionListData(value);
        return this;
    }

    /**
     * Sets the value of the networkManagementJoiningModeData property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkManagementJoiningModeDataType }
     * @return
     *     The class instance
     */
    public CmdType withNetworkManagementJoiningModeData(NetworkManagementJoiningModeDataType value) {
        setNetworkManagementJoiningModeData(value);
        return this;
    }

    /**
     * Sets the value of the networkManagementModifyNodeCall property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkManagementModifyNodeCallType }
     * @return
     *     The class instance
     */
    public CmdType withNetworkManagementModifyNodeCall(NetworkManagementModifyNodeCallType value) {
        setNetworkManagementModifyNodeCall(value);
        return this;
    }

    /**
     * Sets the value of the networkManagementProcessStateData property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkManagementProcessStateDataType }
     * @return
     *     The class instance
     */
    public CmdType withNetworkManagementProcessStateData(NetworkManagementProcessStateDataType value) {
        setNetworkManagementProcessStateData(value);
        return this;
    }

    /**
     * Sets the value of the networkManagementRemoveNodeCall property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkManagementRemoveNodeCallType }
     * @return
     *     The class instance
     */
    public CmdType withNetworkManagementRemoveNodeCall(NetworkManagementRemoveNodeCallType value) {
        setNetworkManagementRemoveNodeCall(value);
        return this;
    }

    /**
     * Sets the value of the networkManagementReportCandidateData property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkManagementReportCandidateDataType }
     * @return
     *     The class instance
     */
    public CmdType withNetworkManagementReportCandidateData(NetworkManagementReportCandidateDataType value) {
        setNetworkManagementReportCandidateData(value);
        return this;
    }

    /**
     * Sets the value of the networkManagementScanNetworkCall property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkManagementScanNetworkCallType }
     * @return
     *     The class instance
     */
    public CmdType withNetworkManagementScanNetworkCall(NetworkManagementScanNetworkCallType value) {
        setNetworkManagementScanNetworkCall(value);
        return this;
    }

    /**
     * Sets the value of the nodeManagementBindingData property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeManagementBindingDataType }
     * @return
     *     The class instance
     */
    public CmdType withNodeManagementBindingData(NodeManagementBindingDataType value) {
        setNodeManagementBindingData(value);
        return this;
    }

    /**
     * Sets the value of the nodeManagementBindingDeleteCall property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeManagementBindingDeleteCallType }
     * @return
     *     The class instance
     */
    public CmdType withNodeManagementBindingDeleteCall(NodeManagementBindingDeleteCallType value) {
        setNodeManagementBindingDeleteCall(value);
        return this;
    }

    /**
     * Sets the value of the nodeManagementBindingRequestCall property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeManagementBindingRequestCallType }
     * @return
     *     The class instance
     */
    public CmdType withNodeManagementBindingRequestCall(NodeManagementBindingRequestCallType value) {
        setNodeManagementBindingRequestCall(value);
        return this;
    }

    /**
     * Sets the value of the nodeManagementDestinationListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeManagementDestinationListDataType }
     * @return
     *     The class instance
     */
    public CmdType withNodeManagementDestinationListData(NodeManagementDestinationListDataType value) {
        setNodeManagementDestinationListData(value);
        return this;
    }

    /**
     * Sets the value of the nodeManagementDetailedDiscoveryData property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeManagementDetailedDiscoveryDataType }
     * @return
     *     The class instance
     */
    public CmdType withNodeManagementDetailedDiscoveryData(NodeManagementDetailedDiscoveryDataType value) {
        setNodeManagementDetailedDiscoveryData(value);
        return this;
    }

    /**
     * Sets the value of the nodeManagementSubscriptionData property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeManagementSubscriptionDataType }
     * @return
     *     The class instance
     */
    public CmdType withNodeManagementSubscriptionData(NodeManagementSubscriptionDataType value) {
        setNodeManagementSubscriptionData(value);
        return this;
    }

    /**
     * Sets the value of the nodeManagementSubscriptionDeleteCall property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeManagementSubscriptionDeleteCallType }
     * @return
     *     The class instance
     */
    public CmdType withNodeManagementSubscriptionDeleteCall(NodeManagementSubscriptionDeleteCallType value) {
        setNodeManagementSubscriptionDeleteCall(value);
        return this;
    }

    /**
     * Sets the value of the nodeManagementSubscriptionRequestCall property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeManagementSubscriptionRequestCallType }
     * @return
     *     The class instance
     */
    public CmdType withNodeManagementSubscriptionRequestCall(NodeManagementSubscriptionRequestCallType value) {
        setNodeManagementSubscriptionRequestCall(value);
        return this;
    }

    /**
     * Sets the value of the nodeManagementUseCaseData property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeManagementUseCaseDataType }
     * @return
     *     The class instance
     */
    public CmdType withNodeManagementUseCaseData(NodeManagementUseCaseDataType value) {
        setNodeManagementUseCaseData(value);
        return this;
    }

    /**
     * Sets the value of the operatingConstraintsDurationListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatingConstraintsDurationListDataType }
     * @return
     *     The class instance
     */
    public CmdType withOperatingConstraintsDurationListData(OperatingConstraintsDurationListDataType value) {
        setOperatingConstraintsDurationListData(value);
        return this;
    }

    /**
     * Sets the value of the operatingConstraintsInterruptListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatingConstraintsInterruptListDataType }
     * @return
     *     The class instance
     */
    public CmdType withOperatingConstraintsInterruptListData(OperatingConstraintsInterruptListDataType value) {
        setOperatingConstraintsInterruptListData(value);
        return this;
    }

    /**
     * Sets the value of the operatingConstraintsPowerDescriptionListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatingConstraintsPowerDescriptionListDataType }
     * @return
     *     The class instance
     */
    public CmdType withOperatingConstraintsPowerDescriptionListData(OperatingConstraintsPowerDescriptionListDataType value) {
        setOperatingConstraintsPowerDescriptionListData(value);
        return this;
    }

    /**
     * Sets the value of the operatingConstraintsPowerLevelListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatingConstraintsPowerLevelListDataType }
     * @return
     *     The class instance
     */
    public CmdType withOperatingConstraintsPowerLevelListData(OperatingConstraintsPowerLevelListDataType value) {
        setOperatingConstraintsPowerLevelListData(value);
        return this;
    }

    /**
     * Sets the value of the operatingConstraintsPowerRangeListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatingConstraintsPowerRangeListDataType }
     * @return
     *     The class instance
     */
    public CmdType withOperatingConstraintsPowerRangeListData(OperatingConstraintsPowerRangeListDataType value) {
        setOperatingConstraintsPowerRangeListData(value);
        return this;
    }

    /**
     * Sets the value of the operatingConstraintsResumeImplicationListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatingConstraintsResumeImplicationListDataType }
     * @return
     *     The class instance
     */
    public CmdType withOperatingConstraintsResumeImplicationListData(OperatingConstraintsResumeImplicationListDataType value) {
        setOperatingConstraintsResumeImplicationListData(value);
        return this;
    }

    /**
     * Sets the value of the powerSequenceAlternativesRelationListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PowerSequenceAlternativesRelationListDataType }
     * @return
     *     The class instance
     */
    public CmdType withPowerSequenceAlternativesRelationListData(PowerSequenceAlternativesRelationListDataType value) {
        setPowerSequenceAlternativesRelationListData(value);
        return this;
    }

    /**
     * Sets the value of the powerSequenceDescriptionListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PowerSequenceDescriptionListDataType }
     * @return
     *     The class instance
     */
    public CmdType withPowerSequenceDescriptionListData(PowerSequenceDescriptionListDataType value) {
        setPowerSequenceDescriptionListData(value);
        return this;
    }

    /**
     * Sets the value of the powerSequenceNodeScheduleInformationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PowerSequenceNodeScheduleInformationDataType }
     * @return
     *     The class instance
     */
    public CmdType withPowerSequenceNodeScheduleInformationData(PowerSequenceNodeScheduleInformationDataType value) {
        setPowerSequenceNodeScheduleInformationData(value);
        return this;
    }

    /**
     * Sets the value of the powerSequencePriceCalculationRequestCall property.
     * 
     * @param value
     *     allowed object is
     *     {@link PowerSequencePriceCalculationRequestCallType }
     * @return
     *     The class instance
     */
    public CmdType withPowerSequencePriceCalculationRequestCall(PowerSequencePriceCalculationRequestCallType value) {
        setPowerSequencePriceCalculationRequestCall(value);
        return this;
    }

    /**
     * Sets the value of the powerSequencePriceListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PowerSequencePriceListDataType }
     * @return
     *     The class instance
     */
    public CmdType withPowerSequencePriceListData(PowerSequencePriceListDataType value) {
        setPowerSequencePriceListData(value);
        return this;
    }

    /**
     * Sets the value of the powerSequenceScheduleConfigurationRequestCall property.
     * 
     * @param value
     *     allowed object is
     *     {@link PowerSequenceScheduleConfigurationRequestCallType }
     * @return
     *     The class instance
     */
    public CmdType withPowerSequenceScheduleConfigurationRequestCall(PowerSequenceScheduleConfigurationRequestCallType value) {
        setPowerSequenceScheduleConfigurationRequestCall(value);
        return this;
    }

    /**
     * Sets the value of the powerSequenceScheduleConstraintsListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PowerSequenceScheduleConstraintsListDataType }
     * @return
     *     The class instance
     */
    public CmdType withPowerSequenceScheduleConstraintsListData(PowerSequenceScheduleConstraintsListDataType value) {
        setPowerSequenceScheduleConstraintsListData(value);
        return this;
    }

    /**
     * Sets the value of the powerSequenceScheduleListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PowerSequenceScheduleListDataType }
     * @return
     *     The class instance
     */
    public CmdType withPowerSequenceScheduleListData(PowerSequenceScheduleListDataType value) {
        setPowerSequenceScheduleListData(value);
        return this;
    }

    /**
     * Sets the value of the powerSequenceSchedulePreferenceListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PowerSequenceSchedulePreferenceListDataType }
     * @return
     *     The class instance
     */
    public CmdType withPowerSequenceSchedulePreferenceListData(PowerSequenceSchedulePreferenceListDataType value) {
        setPowerSequenceSchedulePreferenceListData(value);
        return this;
    }

    /**
     * Sets the value of the powerSequenceStateListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PowerSequenceStateListDataType }
     * @return
     *     The class instance
     */
    public CmdType withPowerSequenceStateListData(PowerSequenceStateListDataType value) {
        setPowerSequenceStateListData(value);
        return this;
    }

    /**
     * Sets the value of the powerTimeSlotScheduleConstraintsListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PowerTimeSlotScheduleConstraintsListDataType }
     * @return
     *     The class instance
     */
    public CmdType withPowerTimeSlotScheduleConstraintsListData(PowerTimeSlotScheduleConstraintsListDataType value) {
        setPowerTimeSlotScheduleConstraintsListData(value);
        return this;
    }

    /**
     * Sets the value of the powerTimeSlotScheduleListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PowerTimeSlotScheduleListDataType }
     * @return
     *     The class instance
     */
    public CmdType withPowerTimeSlotScheduleListData(PowerTimeSlotScheduleListDataType value) {
        setPowerTimeSlotScheduleListData(value);
        return this;
    }

    /**
     * Sets the value of the powerTimeSlotValueListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PowerTimeSlotValueListDataType }
     * @return
     *     The class instance
     */
    public CmdType withPowerTimeSlotValueListData(PowerTimeSlotValueListDataType value) {
        setPowerTimeSlotValueListData(value);
        return this;
    }

    /**
     * Sets the value of the resultData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultDataType }
     * @return
     *     The class instance
     */
    public CmdType withResultData(ResultDataType value) {
        setResultData(value);
        return this;
    }

    /**
     * Sets the value of the sensingDescriptionData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SensingDescriptionDataType }
     * @return
     *     The class instance
     */
    public CmdType withSensingDescriptionData(SensingDescriptionDataType value) {
        setSensingDescriptionData(value);
        return this;
    }

    /**
     * Sets the value of the sensingListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SensingListDataType }
     * @return
     *     The class instance
     */
    public CmdType withSensingListData(SensingListDataType value) {
        setSensingListData(value);
        return this;
    }

    /**
     * Sets the value of the sessionIdentificationListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SessionIdentificationListDataType }
     * @return
     *     The class instance
     */
    public CmdType withSessionIdentificationListData(SessionIdentificationListDataType value) {
        setSessionIdentificationListData(value);
        return this;
    }

    /**
     * Sets the value of the sessionMeasurementRelationListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SessionMeasurementRelationListDataType }
     * @return
     *     The class instance
     */
    public CmdType withSessionMeasurementRelationListData(SessionMeasurementRelationListDataType value) {
        setSessionMeasurementRelationListData(value);
        return this;
    }

    /**
     * Sets the value of the setpointConstraintsListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SetpointConstraintsListDataType }
     * @return
     *     The class instance
     */
    public CmdType withSetpointConstraintsListData(SetpointConstraintsListDataType value) {
        setSetpointConstraintsListData(value);
        return this;
    }

    /**
     * Sets the value of the setpointDescriptionListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SetpointDescriptionListDataType }
     * @return
     *     The class instance
     */
    public CmdType withSetpointDescriptionListData(SetpointDescriptionListDataType value) {
        setSetpointDescriptionListData(value);
        return this;
    }

    /**
     * Sets the value of the setpointListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SetpointListDataType }
     * @return
     *     The class instance
     */
    public CmdType withSetpointListData(SetpointListDataType value) {
        setSetpointListData(value);
        return this;
    }

    /**
     * Sets the value of the smartEnergyManagementPsConfigurationRequestCall property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmartEnergyManagementPsConfigurationRequestCallType }
     * @return
     *     The class instance
     */
    public CmdType withSmartEnergyManagementPsConfigurationRequestCall(SmartEnergyManagementPsConfigurationRequestCallType value) {
        setSmartEnergyManagementPsConfigurationRequestCall(value);
        return this;
    }

    /**
     * Sets the value of the smartEnergyManagementPsData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmartEnergyManagementPsDataType }
     * @return
     *     The class instance
     */
    public CmdType withSmartEnergyManagementPsData(SmartEnergyManagementPsDataType value) {
        setSmartEnergyManagementPsData(value);
        return this;
    }

    /**
     * Sets the value of the smartEnergyManagementPsPriceCalculationRequestCall property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmartEnergyManagementPsPriceCalculationRequestCallType }
     * @return
     *     The class instance
     */
    public CmdType withSmartEnergyManagementPsPriceCalculationRequestCall(SmartEnergyManagementPsPriceCalculationRequestCallType value) {
        setSmartEnergyManagementPsPriceCalculationRequestCall(value);
        return this;
    }

    /**
     * Sets the value of the smartEnergyManagementPsPriceData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmartEnergyManagementPsPriceDataType }
     * @return
     *     The class instance
     */
    public CmdType withSmartEnergyManagementPsPriceData(SmartEnergyManagementPsPriceDataType value) {
        setSmartEnergyManagementPsPriceData(value);
        return this;
    }

    /**
     * Sets the value of the specificationVersionListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecificationVersionListDataType }
     * @return
     *     The class instance
     */
    public CmdType withSpecificationVersionListData(SpecificationVersionListDataType value) {
        setSpecificationVersionListData(value);
        return this;
    }

    /**
     * Sets the value of the stateInformationListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link StateInformationListDataType }
     * @return
     *     The class instance
     */
    public CmdType withStateInformationListData(StateInformationListDataType value) {
        setStateInformationListData(value);
        return this;
    }

    /**
     * Sets the value of the subscriptionManagementDeleteCall property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionManagementDeleteCallType }
     * @return
     *     The class instance
     */
    public CmdType withSubscriptionManagementDeleteCall(SubscriptionManagementDeleteCallType value) {
        setSubscriptionManagementDeleteCall(value);
        return this;
    }

    /**
     * Sets the value of the subscriptionManagementEntryListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionManagementEntryListDataType }
     * @return
     *     The class instance
     */
    public CmdType withSubscriptionManagementEntryListData(SubscriptionManagementEntryListDataType value) {
        setSubscriptionManagementEntryListData(value);
        return this;
    }

    /**
     * Sets the value of the subscriptionManagementRequestCall property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionManagementRequestCallType }
     * @return
     *     The class instance
     */
    public CmdType withSubscriptionManagementRequestCall(SubscriptionManagementRequestCallType value) {
        setSubscriptionManagementRequestCall(value);
        return this;
    }

    /**
     * Sets the value of the supplyConditionDescriptionListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplyConditionDescriptionListDataType }
     * @return
     *     The class instance
     */
    public CmdType withSupplyConditionDescriptionListData(SupplyConditionDescriptionListDataType value) {
        setSupplyConditionDescriptionListData(value);
        return this;
    }

    /**
     * Sets the value of the supplyConditionListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplyConditionListDataType }
     * @return
     *     The class instance
     */
    public CmdType withSupplyConditionListData(SupplyConditionListDataType value) {
        setSupplyConditionListData(value);
        return this;
    }

    /**
     * Sets the value of the supplyConditionThresholdRelationListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplyConditionThresholdRelationListDataType }
     * @return
     *     The class instance
     */
    public CmdType withSupplyConditionThresholdRelationListData(SupplyConditionThresholdRelationListDataType value) {
        setSupplyConditionThresholdRelationListData(value);
        return this;
    }

    /**
     * Sets the value of the tariffBoundaryRelationListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TariffBoundaryRelationListDataType }
     * @return
     *     The class instance
     */
    public CmdType withTariffBoundaryRelationListData(TariffBoundaryRelationListDataType value) {
        setTariffBoundaryRelationListData(value);
        return this;
    }

    /**
     * Sets the value of the tariffDescriptionListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TariffDescriptionListDataType }
     * @return
     *     The class instance
     */
    public CmdType withTariffDescriptionListData(TariffDescriptionListDataType value) {
        setTariffDescriptionListData(value);
        return this;
    }

    /**
     * Sets the value of the tariffListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TariffListDataType }
     * @return
     *     The class instance
     */
    public CmdType withTariffListData(TariffListDataType value) {
        setTariffListData(value);
        return this;
    }

    /**
     * Sets the value of the tariffOverallConstraintsData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TariffOverallConstraintsDataType }
     * @return
     *     The class instance
     */
    public CmdType withTariffOverallConstraintsData(TariffOverallConstraintsDataType value) {
        setTariffOverallConstraintsData(value);
        return this;
    }

    /**
     * Sets the value of the tariffTierRelationListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TariffTierRelationListDataType }
     * @return
     *     The class instance
     */
    public CmdType withTariffTierRelationListData(TariffTierRelationListDataType value) {
        setTariffTierRelationListData(value);
        return this;
    }

    /**
     * Sets the value of the taskManagementJobDescriptionListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskManagementJobDescriptionListDataType }
     * @return
     *     The class instance
     */
    public CmdType withTaskManagementJobDescriptionListData(TaskManagementJobDescriptionListDataType value) {
        setTaskManagementJobDescriptionListData(value);
        return this;
    }

    /**
     * Sets the value of the taskManagementJobListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskManagementJobListDataType }
     * @return
     *     The class instance
     */
    public CmdType withTaskManagementJobListData(TaskManagementJobListDataType value) {
        setTaskManagementJobListData(value);
        return this;
    }

    /**
     * Sets the value of the taskManagementJobRelationListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskManagementJobRelationListDataType }
     * @return
     *     The class instance
     */
    public CmdType withTaskManagementJobRelationListData(TaskManagementJobRelationListDataType value) {
        setTaskManagementJobRelationListData(value);
        return this;
    }

    /**
     * Sets the value of the taskManagementOverviewData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskManagementOverviewDataType }
     * @return
     *     The class instance
     */
    public CmdType withTaskManagementOverviewData(TaskManagementOverviewDataType value) {
        setTaskManagementOverviewData(value);
        return this;
    }

    /**
     * Sets the value of the thresholdConstraintsListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThresholdConstraintsListDataType }
     * @return
     *     The class instance
     */
    public CmdType withThresholdConstraintsListData(ThresholdConstraintsListDataType value) {
        setThresholdConstraintsListData(value);
        return this;
    }

    /**
     * Sets the value of the thresholdDescriptionListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThresholdDescriptionListDataType }
     * @return
     *     The class instance
     */
    public CmdType withThresholdDescriptionListData(ThresholdDescriptionListDataType value) {
        setThresholdDescriptionListData(value);
        return this;
    }

    /**
     * Sets the value of the thresholdListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThresholdListDataType }
     * @return
     *     The class instance
     */
    public CmdType withThresholdListData(ThresholdListDataType value) {
        setThresholdListData(value);
        return this;
    }

    /**
     * Sets the value of the tierBoundaryDescriptionListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TierBoundaryDescriptionListDataType }
     * @return
     *     The class instance
     */
    public CmdType withTierBoundaryDescriptionListData(TierBoundaryDescriptionListDataType value) {
        setTierBoundaryDescriptionListData(value);
        return this;
    }

    /**
     * Sets the value of the tierBoundaryListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TierBoundaryListDataType }
     * @return
     *     The class instance
     */
    public CmdType withTierBoundaryListData(TierBoundaryListDataType value) {
        setTierBoundaryListData(value);
        return this;
    }

    /**
     * Sets the value of the tierDescriptionListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TierDescriptionListDataType }
     * @return
     *     The class instance
     */
    public CmdType withTierDescriptionListData(TierDescriptionListDataType value) {
        setTierDescriptionListData(value);
        return this;
    }

    /**
     * Sets the value of the tierIncentiveRelationListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TierIncentiveRelationListDataType }
     * @return
     *     The class instance
     */
    public CmdType withTierIncentiveRelationListData(TierIncentiveRelationListDataType value) {
        setTierIncentiveRelationListData(value);
        return this;
    }

    /**
     * Sets the value of the tierListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TierListDataType }
     * @return
     *     The class instance
     */
    public CmdType withTierListData(TierListDataType value) {
        setTierListData(value);
        return this;
    }

    /**
     * Sets the value of the timeDistributorData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeDistributorDataType }
     * @return
     *     The class instance
     */
    public CmdType withTimeDistributorData(TimeDistributorDataType value) {
        setTimeDistributorData(value);
        return this;
    }

    /**
     * Sets the value of the timeDistributorEnquiryCall property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeDistributorEnquiryCallType }
     * @return
     *     The class instance
     */
    public CmdType withTimeDistributorEnquiryCall(TimeDistributorEnquiryCallType value) {
        setTimeDistributorEnquiryCall(value);
        return this;
    }

    /**
     * Sets the value of the timeInformationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeInformationDataType }
     * @return
     *     The class instance
     */
    public CmdType withTimeInformationData(TimeInformationDataType value) {
        setTimeInformationData(value);
        return this;
    }

    /**
     * Sets the value of the timePrecisionData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePrecisionDataType }
     * @return
     *     The class instance
     */
    public CmdType withTimePrecisionData(TimePrecisionDataType value) {
        setTimePrecisionData(value);
        return this;
    }

    /**
     * Sets the value of the timeSeriesConstraintsListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeSeriesConstraintsListDataType }
     * @return
     *     The class instance
     */
    public CmdType withTimeSeriesConstraintsListData(TimeSeriesConstraintsListDataType value) {
        setTimeSeriesConstraintsListData(value);
        return this;
    }

    /**
     * Sets the value of the timeSeriesDescriptionListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeSeriesDescriptionListDataType }
     * @return
     *     The class instance
     */
    public CmdType withTimeSeriesDescriptionListData(TimeSeriesDescriptionListDataType value) {
        setTimeSeriesDescriptionListData(value);
        return this;
    }

    /**
     * Sets the value of the timeSeriesListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeSeriesListDataType }
     * @return
     *     The class instance
     */
    public CmdType withTimeSeriesListData(TimeSeriesListDataType value) {
        setTimeSeriesListData(value);
        return this;
    }

    /**
     * Sets the value of the timeTableConstraintsListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeTableConstraintsListDataType }
     * @return
     *     The class instance
     */
    public CmdType withTimeTableConstraintsListData(TimeTableConstraintsListDataType value) {
        setTimeTableConstraintsListData(value);
        return this;
    }

    /**
     * Sets the value of the timeTableDescriptionListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeTableDescriptionListDataType }
     * @return
     *     The class instance
     */
    public CmdType withTimeTableDescriptionListData(TimeTableDescriptionListDataType value) {
        setTimeTableDescriptionListData(value);
        return this;
    }

    /**
     * Sets the value of the timeTableListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeTableListDataType }
     * @return
     *     The class instance
     */
    public CmdType withTimeTableListData(TimeTableListDataType value) {
        setTimeTableListData(value);
        return this;
    }

    /**
     * Sets the value of the useCaseInformationListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link UseCaseInformationListDataType }
     * @return
     *     The class instance
     */
    public CmdType withUseCaseInformationListData(UseCaseInformationListDataType value) {
        setUseCaseInformationListData(value);
        return this;
    }

    /**
     * Sets the value of the manufacturerSpecificExtension property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     * @return
     *     The class instance
     */
    public CmdType withManufacturerSpecificExtension(byte[] value) {
        setManufacturerSpecificExtension(value);
        return this;
    }

    /**
     * Sets the value of the lastUpdateAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public CmdType withLastUpdateAt(String value) {
        setLastUpdateAt(value);
        return this;
    }

    @Override
    public Object clone() {
        return copyTo(createNewInstance());
    }

    @Override
    public Object copyTo(Object target) {
        final CopyStrategy strategy = JAXBCopyStrategy.getInstance();
        return copyTo(null, target, strategy);
    }

    @Override
    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof CmdType) {
            final CmdType copy = ((CmdType) draftCopy);
            {
                Boolean functionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.function!= null));
                if (functionShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceFunction;
                    sourceFunction = this.getFunction();
                    String copyFunction = ((String) strategy.copy(LocatorUtils.property(locator, "function", sourceFunction), sourceFunction, (this.function!= null)));
                    copy.setFunction(copyFunction);
                } else {
                    if (functionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.function = null;
                    }
                }
            }
            {
                Boolean filterShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.filter!= null)&&(!this.filter.isEmpty())));
                if (filterShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<FilterType> sourceFilter;
                    sourceFilter = (((this.filter!= null)&&(!this.filter.isEmpty()))?this.getFilter():null);
                    @SuppressWarnings("unchecked")
                    List<FilterType> copyFilter = ((List<FilterType> ) strategy.copy(LocatorUtils.property(locator, "filter", sourceFilter), sourceFilter, ((this.filter!= null)&&(!this.filter.isEmpty()))));
                    copy.filter = null;
                    if (copyFilter!= null) {
                        List<FilterType> uniqueFilterl = copy.getFilter();
                        uniqueFilterl.addAll(copyFilter);
                    }
                } else {
                    if (filterShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.filter = null;
                    }
                }
            }
            {
                Boolean actuatorLevelDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.actuatorLevelData!= null));
                if (actuatorLevelDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    ActuatorLevelDataType sourceActuatorLevelData;
                    sourceActuatorLevelData = this.getActuatorLevelData();
                    ActuatorLevelDataType copyActuatorLevelData = ((ActuatorLevelDataType) strategy.copy(LocatorUtils.property(locator, "actuatorLevelData", sourceActuatorLevelData), sourceActuatorLevelData, (this.actuatorLevelData!= null)));
                    copy.setActuatorLevelData(copyActuatorLevelData);
                } else {
                    if (actuatorLevelDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.actuatorLevelData = null;
                    }
                }
            }
            {
                Boolean actuatorLevelDescriptionDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.actuatorLevelDescriptionData!= null));
                if (actuatorLevelDescriptionDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    ActuatorLevelDescriptionDataType sourceActuatorLevelDescriptionData;
                    sourceActuatorLevelDescriptionData = this.getActuatorLevelDescriptionData();
                    ActuatorLevelDescriptionDataType copyActuatorLevelDescriptionData = ((ActuatorLevelDescriptionDataType) strategy.copy(LocatorUtils.property(locator, "actuatorLevelDescriptionData", sourceActuatorLevelDescriptionData), sourceActuatorLevelDescriptionData, (this.actuatorLevelDescriptionData!= null)));
                    copy.setActuatorLevelDescriptionData(copyActuatorLevelDescriptionData);
                } else {
                    if (actuatorLevelDescriptionDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.actuatorLevelDescriptionData = null;
                    }
                }
            }
            {
                Boolean actuatorSwitchDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.actuatorSwitchData!= null));
                if (actuatorSwitchDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    ActuatorSwitchDataType sourceActuatorSwitchData;
                    sourceActuatorSwitchData = this.getActuatorSwitchData();
                    ActuatorSwitchDataType copyActuatorSwitchData = ((ActuatorSwitchDataType) strategy.copy(LocatorUtils.property(locator, "actuatorSwitchData", sourceActuatorSwitchData), sourceActuatorSwitchData, (this.actuatorSwitchData!= null)));
                    copy.setActuatorSwitchData(copyActuatorSwitchData);
                } else {
                    if (actuatorSwitchDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.actuatorSwitchData = null;
                    }
                }
            }
            {
                Boolean actuatorSwitchDescriptionDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.actuatorSwitchDescriptionData!= null));
                if (actuatorSwitchDescriptionDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    ActuatorSwitchDescriptionDataType sourceActuatorSwitchDescriptionData;
                    sourceActuatorSwitchDescriptionData = this.getActuatorSwitchDescriptionData();
                    ActuatorSwitchDescriptionDataType copyActuatorSwitchDescriptionData = ((ActuatorSwitchDescriptionDataType) strategy.copy(LocatorUtils.property(locator, "actuatorSwitchDescriptionData", sourceActuatorSwitchDescriptionData), sourceActuatorSwitchDescriptionData, (this.actuatorSwitchDescriptionData!= null)));
                    copy.setActuatorSwitchDescriptionData(copyActuatorSwitchDescriptionData);
                } else {
                    if (actuatorSwitchDescriptionDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.actuatorSwitchDescriptionData = null;
                    }
                }
            }
            {
                Boolean alarmListDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.alarmListData!= null));
                if (alarmListDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    AlarmListDataType sourceAlarmListData;
                    sourceAlarmListData = this.getAlarmListData();
                    AlarmListDataType copyAlarmListData = ((AlarmListDataType) strategy.copy(LocatorUtils.property(locator, "alarmListData", sourceAlarmListData), sourceAlarmListData, (this.alarmListData!= null)));
                    copy.setAlarmListData(copyAlarmListData);
                } else {
                    if (alarmListDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.alarmListData = null;
                    }
                }
            }
            {
                Boolean billConstraintsListDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.billConstraintsListData!= null));
                if (billConstraintsListDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    BillConstraintsListDataType sourceBillConstraintsListData;
                    sourceBillConstraintsListData = this.getBillConstraintsListData();
                    BillConstraintsListDataType copyBillConstraintsListData = ((BillConstraintsListDataType) strategy.copy(LocatorUtils.property(locator, "billConstraintsListData", sourceBillConstraintsListData), sourceBillConstraintsListData, (this.billConstraintsListData!= null)));
                    copy.setBillConstraintsListData(copyBillConstraintsListData);
                } else {
                    if (billConstraintsListDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.billConstraintsListData = null;
                    }
                }
            }
            {
                Boolean billDescriptionListDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.billDescriptionListData!= null));
                if (billDescriptionListDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    BillDescriptionListDataType sourceBillDescriptionListData;
                    sourceBillDescriptionListData = this.getBillDescriptionListData();
                    BillDescriptionListDataType copyBillDescriptionListData = ((BillDescriptionListDataType) strategy.copy(LocatorUtils.property(locator, "billDescriptionListData", sourceBillDescriptionListData), sourceBillDescriptionListData, (this.billDescriptionListData!= null)));
                    copy.setBillDescriptionListData(copyBillDescriptionListData);
                } else {
                    if (billDescriptionListDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.billDescriptionListData = null;
                    }
                }
            }
            {
                Boolean billListDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.billListData!= null));
                if (billListDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    BillListDataType sourceBillListData;
                    sourceBillListData = this.getBillListData();
                    BillListDataType copyBillListData = ((BillListDataType) strategy.copy(LocatorUtils.property(locator, "billListData", sourceBillListData), sourceBillListData, (this.billListData!= null)));
                    copy.setBillListData(copyBillListData);
                } else {
                    if (billListDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.billListData = null;
                    }
                }
            }
            {
                Boolean bindingManagementDeleteCallShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.bindingManagementDeleteCall!= null));
                if (bindingManagementDeleteCallShouldBeCopiedAndSet == Boolean.TRUE) {
                    BindingManagementDeleteCallType sourceBindingManagementDeleteCall;
                    sourceBindingManagementDeleteCall = this.getBindingManagementDeleteCall();
                    BindingManagementDeleteCallType copyBindingManagementDeleteCall = ((BindingManagementDeleteCallType) strategy.copy(LocatorUtils.property(locator, "bindingManagementDeleteCall", sourceBindingManagementDeleteCall), sourceBindingManagementDeleteCall, (this.bindingManagementDeleteCall!= null)));
                    copy.setBindingManagementDeleteCall(copyBindingManagementDeleteCall);
                } else {
                    if (bindingManagementDeleteCallShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.bindingManagementDeleteCall = null;
                    }
                }
            }
            {
                Boolean bindingManagementEntryListDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.bindingManagementEntryListData!= null));
                if (bindingManagementEntryListDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    BindingManagementEntryListDataType sourceBindingManagementEntryListData;
                    sourceBindingManagementEntryListData = this.getBindingManagementEntryListData();
                    BindingManagementEntryListDataType copyBindingManagementEntryListData = ((BindingManagementEntryListDataType) strategy.copy(LocatorUtils.property(locator, "bindingManagementEntryListData", sourceBindingManagementEntryListData), sourceBindingManagementEntryListData, (this.bindingManagementEntryListData!= null)));
                    copy.setBindingManagementEntryListData(copyBindingManagementEntryListData);
                } else {
                    if (bindingManagementEntryListDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.bindingManagementEntryListData = null;
                    }
                }
            }
            {
                Boolean bindingManagementRequestCallShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.bindingManagementRequestCall!= null));
                if (bindingManagementRequestCallShouldBeCopiedAndSet == Boolean.TRUE) {
                    BindingManagementRequestCallType sourceBindingManagementRequestCall;
                    sourceBindingManagementRequestCall = this.getBindingManagementRequestCall();
                    BindingManagementRequestCallType copyBindingManagementRequestCall = ((BindingManagementRequestCallType) strategy.copy(LocatorUtils.property(locator, "bindingManagementRequestCall", sourceBindingManagementRequestCall), sourceBindingManagementRequestCall, (this.bindingManagementRequestCall!= null)));
                    copy.setBindingManagementRequestCall(copyBindingManagementRequestCall);
                } else {
                    if (bindingManagementRequestCallShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.bindingManagementRequestCall = null;
                    }
                }
            }
            {
                Boolean commodityListDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.commodityListData!= null));
                if (commodityListDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    CommodityListDataType sourceCommodityListData;
                    sourceCommodityListData = this.getCommodityListData();
                    CommodityListDataType copyCommodityListData = ((CommodityListDataType) strategy.copy(LocatorUtils.property(locator, "commodityListData", sourceCommodityListData), sourceCommodityListData, (this.commodityListData!= null)));
                    copy.setCommodityListData(copyCommodityListData);
                } else {
                    if (commodityListDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.commodityListData = null;
                    }
                }
            }
            {
                Boolean dataTunnelingCallShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.dataTunnelingCall!= null));
                if (dataTunnelingCallShouldBeCopiedAndSet == Boolean.TRUE) {
                    DataTunnelingCallType sourceDataTunnelingCall;
                    sourceDataTunnelingCall = this.getDataTunnelingCall();
                    DataTunnelingCallType copyDataTunnelingCall = ((DataTunnelingCallType) strategy.copy(LocatorUtils.property(locator, "dataTunnelingCall", sourceDataTunnelingCall), sourceDataTunnelingCall, (this.dataTunnelingCall!= null)));
                    copy.setDataTunnelingCall(copyDataTunnelingCall);
                } else {
                    if (dataTunnelingCallShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.dataTunnelingCall = null;
                    }
                }
            }
            {
                Boolean deviceClassificationManufacturerDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.deviceClassificationManufacturerData!= null));
                if (deviceClassificationManufacturerDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    DeviceClassificationManufacturerDataType sourceDeviceClassificationManufacturerData;
                    sourceDeviceClassificationManufacturerData = this.getDeviceClassificationManufacturerData();
                    DeviceClassificationManufacturerDataType copyDeviceClassificationManufacturerData = ((DeviceClassificationManufacturerDataType) strategy.copy(LocatorUtils.property(locator, "deviceClassificationManufacturerData", sourceDeviceClassificationManufacturerData), sourceDeviceClassificationManufacturerData, (this.deviceClassificationManufacturerData!= null)));
                    copy.setDeviceClassificationManufacturerData(copyDeviceClassificationManufacturerData);
                } else {
                    if (deviceClassificationManufacturerDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.deviceClassificationManufacturerData = null;
                    }
                }
            }
            {
                Boolean deviceClassificationUserDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.deviceClassificationUserData!= null));
                if (deviceClassificationUserDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    DeviceClassificationUserDataType sourceDeviceClassificationUserData;
                    sourceDeviceClassificationUserData = this.getDeviceClassificationUserData();
                    DeviceClassificationUserDataType copyDeviceClassificationUserData = ((DeviceClassificationUserDataType) strategy.copy(LocatorUtils.property(locator, "deviceClassificationUserData", sourceDeviceClassificationUserData), sourceDeviceClassificationUserData, (this.deviceClassificationUserData!= null)));
                    copy.setDeviceClassificationUserData(copyDeviceClassificationUserData);
                } else {
                    if (deviceClassificationUserDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.deviceClassificationUserData = null;
                    }
                }
            }
            {
                Boolean deviceConfigurationKeyValueConstraintsListDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.deviceConfigurationKeyValueConstraintsListData!= null));
                if (deviceConfigurationKeyValueConstraintsListDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    DeviceConfigurationKeyValueConstraintsListDataType sourceDeviceConfigurationKeyValueConstraintsListData;
                    sourceDeviceConfigurationKeyValueConstraintsListData = this.getDeviceConfigurationKeyValueConstraintsListData();
                    DeviceConfigurationKeyValueConstraintsListDataType copyDeviceConfigurationKeyValueConstraintsListData = ((DeviceConfigurationKeyValueConstraintsListDataType) strategy.copy(LocatorUtils.property(locator, "deviceConfigurationKeyValueConstraintsListData", sourceDeviceConfigurationKeyValueConstraintsListData), sourceDeviceConfigurationKeyValueConstraintsListData, (this.deviceConfigurationKeyValueConstraintsListData!= null)));
                    copy.setDeviceConfigurationKeyValueConstraintsListData(copyDeviceConfigurationKeyValueConstraintsListData);
                } else {
                    if (deviceConfigurationKeyValueConstraintsListDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.deviceConfigurationKeyValueConstraintsListData = null;
                    }
                }
            }
            {
                Boolean deviceConfigurationKeyValueDescriptionListDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.deviceConfigurationKeyValueDescriptionListData!= null));
                if (deviceConfigurationKeyValueDescriptionListDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    DeviceConfigurationKeyValueDescriptionListDataType sourceDeviceConfigurationKeyValueDescriptionListData;
                    sourceDeviceConfigurationKeyValueDescriptionListData = this.getDeviceConfigurationKeyValueDescriptionListData();
                    DeviceConfigurationKeyValueDescriptionListDataType copyDeviceConfigurationKeyValueDescriptionListData = ((DeviceConfigurationKeyValueDescriptionListDataType) strategy.copy(LocatorUtils.property(locator, "deviceConfigurationKeyValueDescriptionListData", sourceDeviceConfigurationKeyValueDescriptionListData), sourceDeviceConfigurationKeyValueDescriptionListData, (this.deviceConfigurationKeyValueDescriptionListData!= null)));
                    copy.setDeviceConfigurationKeyValueDescriptionListData(copyDeviceConfigurationKeyValueDescriptionListData);
                } else {
                    if (deviceConfigurationKeyValueDescriptionListDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.deviceConfigurationKeyValueDescriptionListData = null;
                    }
                }
            }
            {
                Boolean deviceConfigurationKeyValueListDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.deviceConfigurationKeyValueListData!= null));
                if (deviceConfigurationKeyValueListDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    DeviceConfigurationKeyValueListDataType sourceDeviceConfigurationKeyValueListData;
                    sourceDeviceConfigurationKeyValueListData = this.getDeviceConfigurationKeyValueListData();
                    DeviceConfigurationKeyValueListDataType copyDeviceConfigurationKeyValueListData = ((DeviceConfigurationKeyValueListDataType) strategy.copy(LocatorUtils.property(locator, "deviceConfigurationKeyValueListData", sourceDeviceConfigurationKeyValueListData), sourceDeviceConfigurationKeyValueListData, (this.deviceConfigurationKeyValueListData!= null)));
                    copy.setDeviceConfigurationKeyValueListData(copyDeviceConfigurationKeyValueListData);
                } else {
                    if (deviceConfigurationKeyValueListDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.deviceConfigurationKeyValueListData = null;
                    }
                }
            }
            {
                Boolean deviceDiagnosisHeartbeatDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.deviceDiagnosisHeartbeatData!= null));
                if (deviceDiagnosisHeartbeatDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    DeviceDiagnosisHeartbeatDataType sourceDeviceDiagnosisHeartbeatData;
                    sourceDeviceDiagnosisHeartbeatData = this.getDeviceDiagnosisHeartbeatData();
                    DeviceDiagnosisHeartbeatDataType copyDeviceDiagnosisHeartbeatData = ((DeviceDiagnosisHeartbeatDataType) strategy.copy(LocatorUtils.property(locator, "deviceDiagnosisHeartbeatData", sourceDeviceDiagnosisHeartbeatData), sourceDeviceDiagnosisHeartbeatData, (this.deviceDiagnosisHeartbeatData!= null)));
                    copy.setDeviceDiagnosisHeartbeatData(copyDeviceDiagnosisHeartbeatData);
                } else {
                    if (deviceDiagnosisHeartbeatDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.deviceDiagnosisHeartbeatData = null;
                    }
                }
            }
            {
                Boolean deviceDiagnosisServiceDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.deviceDiagnosisServiceData!= null));
                if (deviceDiagnosisServiceDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    DeviceDiagnosisServiceDataType sourceDeviceDiagnosisServiceData;
                    sourceDeviceDiagnosisServiceData = this.getDeviceDiagnosisServiceData();
                    DeviceDiagnosisServiceDataType copyDeviceDiagnosisServiceData = ((DeviceDiagnosisServiceDataType) strategy.copy(LocatorUtils.property(locator, "deviceDiagnosisServiceData", sourceDeviceDiagnosisServiceData), sourceDeviceDiagnosisServiceData, (this.deviceDiagnosisServiceData!= null)));
                    copy.setDeviceDiagnosisServiceData(copyDeviceDiagnosisServiceData);
                } else {
                    if (deviceDiagnosisServiceDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.deviceDiagnosisServiceData = null;
                    }
                }
            }
            {
                Boolean deviceDiagnosisStateDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.deviceDiagnosisStateData!= null));
                if (deviceDiagnosisStateDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    DeviceDiagnosisStateDataType sourceDeviceDiagnosisStateData;
                    sourceDeviceDiagnosisStateData = this.getDeviceDiagnosisStateData();
                    DeviceDiagnosisStateDataType copyDeviceDiagnosisStateData = ((DeviceDiagnosisStateDataType) strategy.copy(LocatorUtils.property(locator, "deviceDiagnosisStateData", sourceDeviceDiagnosisStateData), sourceDeviceDiagnosisStateData, (this.deviceDiagnosisStateData!= null)));
                    copy.setDeviceDiagnosisStateData(copyDeviceDiagnosisStateData);
                } else {
                    if (deviceDiagnosisStateDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.deviceDiagnosisStateData = null;
                    }
                }
            }
            {
                Boolean directControlActivityListDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.directControlActivityListData!= null));
                if (directControlActivityListDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    DirectControlActivityListDataType sourceDirectControlActivityListData;
                    sourceDirectControlActivityListData = this.getDirectControlActivityListData();
                    DirectControlActivityListDataType copyDirectControlActivityListData = ((DirectControlActivityListDataType) strategy.copy(LocatorUtils.property(locator, "directControlActivityListData", sourceDirectControlActivityListData), sourceDirectControlActivityListData, (this.directControlActivityListData!= null)));
                    copy.setDirectControlActivityListData(copyDirectControlActivityListData);
                } else {
                    if (directControlActivityListDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.directControlActivityListData = null;
                    }
                }
            }
            {
                Boolean directControlDescriptionDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.directControlDescriptionData!= null));
                if (directControlDescriptionDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    DirectControlDescriptionDataType sourceDirectControlDescriptionData;
                    sourceDirectControlDescriptionData = this.getDirectControlDescriptionData();
                    DirectControlDescriptionDataType copyDirectControlDescriptionData = ((DirectControlDescriptionDataType) strategy.copy(LocatorUtils.property(locator, "directControlDescriptionData", sourceDirectControlDescriptionData), sourceDirectControlDescriptionData, (this.directControlDescriptionData!= null)));
                    copy.setDirectControlDescriptionData(copyDirectControlDescriptionData);
                } else {
                    if (directControlDescriptionDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.directControlDescriptionData = null;
                    }
                }
            }
            {
                Boolean electricalConnectionCharacteristicListDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.electricalConnectionCharacteristicListData!= null));
                if (electricalConnectionCharacteristicListDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElectricalConnectionCharacteristicListDataType sourceElectricalConnectionCharacteristicListData;
                    sourceElectricalConnectionCharacteristicListData = this.getElectricalConnectionCharacteristicListData();
                    ElectricalConnectionCharacteristicListDataType copyElectricalConnectionCharacteristicListData = ((ElectricalConnectionCharacteristicListDataType) strategy.copy(LocatorUtils.property(locator, "electricalConnectionCharacteristicListData", sourceElectricalConnectionCharacteristicListData), sourceElectricalConnectionCharacteristicListData, (this.electricalConnectionCharacteristicListData!= null)));
                    copy.setElectricalConnectionCharacteristicListData(copyElectricalConnectionCharacteristicListData);
                } else {
                    if (electricalConnectionCharacteristicListDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.electricalConnectionCharacteristicListData = null;
                    }
                }
            }
            {
                Boolean electricalConnectionDescriptionListDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.electricalConnectionDescriptionListData!= null));
                if (electricalConnectionDescriptionListDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElectricalConnectionDescriptionListDataType sourceElectricalConnectionDescriptionListData;
                    sourceElectricalConnectionDescriptionListData = this.getElectricalConnectionDescriptionListData();
                    ElectricalConnectionDescriptionListDataType copyElectricalConnectionDescriptionListData = ((ElectricalConnectionDescriptionListDataType) strategy.copy(LocatorUtils.property(locator, "electricalConnectionDescriptionListData", sourceElectricalConnectionDescriptionListData), sourceElectricalConnectionDescriptionListData, (this.electricalConnectionDescriptionListData!= null)));
                    copy.setElectricalConnectionDescriptionListData(copyElectricalConnectionDescriptionListData);
                } else {
                    if (electricalConnectionDescriptionListDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.electricalConnectionDescriptionListData = null;
                    }
                }
            }
            {
                Boolean electricalConnectionParameterDescriptionListDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.electricalConnectionParameterDescriptionListData!= null));
                if (electricalConnectionParameterDescriptionListDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElectricalConnectionParameterDescriptionListDataType sourceElectricalConnectionParameterDescriptionListData;
                    sourceElectricalConnectionParameterDescriptionListData = this.getElectricalConnectionParameterDescriptionListData();
                    ElectricalConnectionParameterDescriptionListDataType copyElectricalConnectionParameterDescriptionListData = ((ElectricalConnectionParameterDescriptionListDataType) strategy.copy(LocatorUtils.property(locator, "electricalConnectionParameterDescriptionListData", sourceElectricalConnectionParameterDescriptionListData), sourceElectricalConnectionParameterDescriptionListData, (this.electricalConnectionParameterDescriptionListData!= null)));
                    copy.setElectricalConnectionParameterDescriptionListData(copyElectricalConnectionParameterDescriptionListData);
                } else {
                    if (electricalConnectionParameterDescriptionListDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.electricalConnectionParameterDescriptionListData = null;
                    }
                }
            }
            {
                Boolean electricalConnectionPermittedValueSetListDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.electricalConnectionPermittedValueSetListData!= null));
                if (electricalConnectionPermittedValueSetListDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElectricalConnectionPermittedValueSetListDataType sourceElectricalConnectionPermittedValueSetListData;
                    sourceElectricalConnectionPermittedValueSetListData = this.getElectricalConnectionPermittedValueSetListData();
                    ElectricalConnectionPermittedValueSetListDataType copyElectricalConnectionPermittedValueSetListData = ((ElectricalConnectionPermittedValueSetListDataType) strategy.copy(LocatorUtils.property(locator, "electricalConnectionPermittedValueSetListData", sourceElectricalConnectionPermittedValueSetListData), sourceElectricalConnectionPermittedValueSetListData, (this.electricalConnectionPermittedValueSetListData!= null)));
                    copy.setElectricalConnectionPermittedValueSetListData(copyElectricalConnectionPermittedValueSetListData);
                } else {
                    if (electricalConnectionPermittedValueSetListDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.electricalConnectionPermittedValueSetListData = null;
                    }
                }
            }
            {
                Boolean electricalConnectionStateListDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.electricalConnectionStateListData!= null));
                if (electricalConnectionStateListDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElectricalConnectionStateListDataType sourceElectricalConnectionStateListData;
                    sourceElectricalConnectionStateListData = this.getElectricalConnectionStateListData();
                    ElectricalConnectionStateListDataType copyElectricalConnectionStateListData = ((ElectricalConnectionStateListDataType) strategy.copy(LocatorUtils.property(locator, "electricalConnectionStateListData", sourceElectricalConnectionStateListData), sourceElectricalConnectionStateListData, (this.electricalConnectionStateListData!= null)));
                    copy.setElectricalConnectionStateListData(copyElectricalConnectionStateListData);
                } else {
                    if (electricalConnectionStateListDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.electricalConnectionStateListData = null;
                    }
                }
            }
            {
                Boolean hvacOperationModeDescriptionListDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.hvacOperationModeDescriptionListData!= null));
                if (hvacOperationModeDescriptionListDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    HvacOperationModeDescriptionListDataType sourceHvacOperationModeDescriptionListData;
                    sourceHvacOperationModeDescriptionListData = this.getHvacOperationModeDescriptionListData();
                    HvacOperationModeDescriptionListDataType copyHvacOperationModeDescriptionListData = ((HvacOperationModeDescriptionListDataType) strategy.copy(LocatorUtils.property(locator, "hvacOperationModeDescriptionListData", sourceHvacOperationModeDescriptionListData), sourceHvacOperationModeDescriptionListData, (this.hvacOperationModeDescriptionListData!= null)));
                    copy.setHvacOperationModeDescriptionListData(copyHvacOperationModeDescriptionListData);
                } else {
                    if (hvacOperationModeDescriptionListDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.hvacOperationModeDescriptionListData = null;
                    }
                }
            }
            {
                Boolean hvacOverrunDescriptionListDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.hvacOverrunDescriptionListData!= null));
                if (hvacOverrunDescriptionListDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    HvacOverrunDescriptionListDataType sourceHvacOverrunDescriptionListData;
                    sourceHvacOverrunDescriptionListData = this.getHvacOverrunDescriptionListData();
                    HvacOverrunDescriptionListDataType copyHvacOverrunDescriptionListData = ((HvacOverrunDescriptionListDataType) strategy.copy(LocatorUtils.property(locator, "hvacOverrunDescriptionListData", sourceHvacOverrunDescriptionListData), sourceHvacOverrunDescriptionListData, (this.hvacOverrunDescriptionListData!= null)));
                    copy.setHvacOverrunDescriptionListData(copyHvacOverrunDescriptionListData);
                } else {
                    if (hvacOverrunDescriptionListDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.hvacOverrunDescriptionListData = null;
                    }
                }
            }
            {
                Boolean hvacOverrunListDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.hvacOverrunListData!= null));
                if (hvacOverrunListDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    HvacOverrunListDataType sourceHvacOverrunListData;
                    sourceHvacOverrunListData = this.getHvacOverrunListData();
                    HvacOverrunListDataType copyHvacOverrunListData = ((HvacOverrunListDataType) strategy.copy(LocatorUtils.property(locator, "hvacOverrunListData", sourceHvacOverrunListData), sourceHvacOverrunListData, (this.hvacOverrunListData!= null)));
                    copy.setHvacOverrunListData(copyHvacOverrunListData);
                } else {
                    if (hvacOverrunListDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.hvacOverrunListData = null;
                    }
                }
            }
            {
                Boolean hvacSystemFunctionDescriptionListDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.hvacSystemFunctionDescriptionListData!= null));
                if (hvacSystemFunctionDescriptionListDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    HvacSystemFunctionDescriptionListDataType sourceHvacSystemFunctionDescriptionListData;
                    sourceHvacSystemFunctionDescriptionListData = this.getHvacSystemFunctionDescriptionListData();
                    HvacSystemFunctionDescriptionListDataType copyHvacSystemFunctionDescriptionListData = ((HvacSystemFunctionDescriptionListDataType) strategy.copy(LocatorUtils.property(locator, "hvacSystemFunctionDescriptionListData", sourceHvacSystemFunctionDescriptionListData), sourceHvacSystemFunctionDescriptionListData, (this.hvacSystemFunctionDescriptionListData!= null)));
                    copy.setHvacSystemFunctionDescriptionListData(copyHvacSystemFunctionDescriptionListData);
                } else {
                    if (hvacSystemFunctionDescriptionListDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.hvacSystemFunctionDescriptionListData = null;
                    }
                }
            }
            {
                Boolean hvacSystemFunctionListDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.hvacSystemFunctionListData!= null));
                if (hvacSystemFunctionListDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    HvacSystemFunctionListDataType sourceHvacSystemFunctionListData;
                    sourceHvacSystemFunctionListData = this.getHvacSystemFunctionListData();
                    HvacSystemFunctionListDataType copyHvacSystemFunctionListData = ((HvacSystemFunctionListDataType) strategy.copy(LocatorUtils.property(locator, "hvacSystemFunctionListData", sourceHvacSystemFunctionListData), sourceHvacSystemFunctionListData, (this.hvacSystemFunctionListData!= null)));
                    copy.setHvacSystemFunctionListData(copyHvacSystemFunctionListData);
                } else {
                    if (hvacSystemFunctionListDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.hvacSystemFunctionListData = null;
                    }
                }
            }
            {
                Boolean hvacSystemFunctionOperationModeRelationListDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.hvacSystemFunctionOperationModeRelationListData!= null));
                if (hvacSystemFunctionOperationModeRelationListDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    HvacSystemFunctionOperationModeRelationListDataType sourceHvacSystemFunctionOperationModeRelationListData;
                    sourceHvacSystemFunctionOperationModeRelationListData = this.getHvacSystemFunctionOperationModeRelationListData();
                    HvacSystemFunctionOperationModeRelationListDataType copyHvacSystemFunctionOperationModeRelationListData = ((HvacSystemFunctionOperationModeRelationListDataType) strategy.copy(LocatorUtils.property(locator, "hvacSystemFunctionOperationModeRelationListData", sourceHvacSystemFunctionOperationModeRelationListData), sourceHvacSystemFunctionOperationModeRelationListData, (this.hvacSystemFunctionOperationModeRelationListData!= null)));
                    copy.setHvacSystemFunctionOperationModeRelationListData(copyHvacSystemFunctionOperationModeRelationListData);
                } else {
                    if (hvacSystemFunctionOperationModeRelationListDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.hvacSystemFunctionOperationModeRelationListData = null;
                    }
                }
            }
            {
                Boolean hvacSystemFunctionPowerSequenceRelationListDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.hvacSystemFunctionPowerSequenceRelationListData!= null));
                if (hvacSystemFunctionPowerSequenceRelationListDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    HvacSystemFunctionPowerSequenceRelationListDataType sourceHvacSystemFunctionPowerSequenceRelationListData;
                    sourceHvacSystemFunctionPowerSequenceRelationListData = this.getHvacSystemFunctionPowerSequenceRelationListData();
                    HvacSystemFunctionPowerSequenceRelationListDataType copyHvacSystemFunctionPowerSequenceRelationListData = ((HvacSystemFunctionPowerSequenceRelationListDataType) strategy.copy(LocatorUtils.property(locator, "hvacSystemFunctionPowerSequenceRelationListData", sourceHvacSystemFunctionPowerSequenceRelationListData), sourceHvacSystemFunctionPowerSequenceRelationListData, (this.hvacSystemFunctionPowerSequenceRelationListData!= null)));
                    copy.setHvacSystemFunctionPowerSequenceRelationListData(copyHvacSystemFunctionPowerSequenceRelationListData);
                } else {
                    if (hvacSystemFunctionPowerSequenceRelationListDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.hvacSystemFunctionPowerSequenceRelationListData = null;
                    }
                }
            }
            {
                Boolean hvacSystemFunctionSetpointRelationListDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.hvacSystemFunctionSetpointRelationListData!= null));
                if (hvacSystemFunctionSetpointRelationListDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    HvacSystemFunctionSetpointRelationListDataType sourceHvacSystemFunctionSetpointRelationListData;
                    sourceHvacSystemFunctionSetpointRelationListData = this.getHvacSystemFunctionSetpointRelationListData();
                    HvacSystemFunctionSetpointRelationListDataType copyHvacSystemFunctionSetpointRelationListData = ((HvacSystemFunctionSetpointRelationListDataType) strategy.copy(LocatorUtils.property(locator, "hvacSystemFunctionSetpointRelationListData", sourceHvacSystemFunctionSetpointRelationListData), sourceHvacSystemFunctionSetpointRelationListData, (this.hvacSystemFunctionSetpointRelationListData!= null)));
                    copy.setHvacSystemFunctionSetpointRelationListData(copyHvacSystemFunctionSetpointRelationListData);
                } else {
                    if (hvacSystemFunctionSetpointRelationListDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.hvacSystemFunctionSetpointRelationListData = null;
                    }
                }
            }
            {
                Boolean identificationListDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.identificationListData!= null));
                if (identificationListDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    IdentificationListDataType sourceIdentificationListData;
                    sourceIdentificationListData = this.getIdentificationListData();
                    IdentificationListDataType copyIdentificationListData = ((IdentificationListDataType) strategy.copy(LocatorUtils.property(locator, "identificationListData", sourceIdentificationListData), sourceIdentificationListData, (this.identificationListData!= null)));
                    copy.setIdentificationListData(copyIdentificationListData);
                } else {
                    if (identificationListDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.identificationListData = null;
                    }
                }
            }
            {
                Boolean incentiveDescriptionListDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.incentiveDescriptionListData!= null));
                if (incentiveDescriptionListDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    IncentiveDescriptionListDataType sourceIncentiveDescriptionListData;
                    sourceIncentiveDescriptionListData = this.getIncentiveDescriptionListData();
                    IncentiveDescriptionListDataType copyIncentiveDescriptionListData = ((IncentiveDescriptionListDataType) strategy.copy(LocatorUtils.property(locator, "incentiveDescriptionListData", sourceIncentiveDescriptionListData), sourceIncentiveDescriptionListData, (this.incentiveDescriptionListData!= null)));
                    copy.setIncentiveDescriptionListData(copyIncentiveDescriptionListData);
                } else {
                    if (incentiveDescriptionListDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.incentiveDescriptionListData = null;
                    }
                }
            }
            {
                Boolean incentiveListDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.incentiveListData!= null));
                if (incentiveListDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    IncentiveListDataType sourceIncentiveListData;
                    sourceIncentiveListData = this.getIncentiveListData();
                    IncentiveListDataType copyIncentiveListData = ((IncentiveListDataType) strategy.copy(LocatorUtils.property(locator, "incentiveListData", sourceIncentiveListData), sourceIncentiveListData, (this.incentiveListData!= null)));
                    copy.setIncentiveListData(copyIncentiveListData);
                } else {
                    if (incentiveListDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.incentiveListData = null;
                    }
                }
            }
            {
                Boolean incentiveTableConstraintsDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.incentiveTableConstraintsData!= null));
                if (incentiveTableConstraintsDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    IncentiveTableConstraintsDataType sourceIncentiveTableConstraintsData;
                    sourceIncentiveTableConstraintsData = this.getIncentiveTableConstraintsData();
                    IncentiveTableConstraintsDataType copyIncentiveTableConstraintsData = ((IncentiveTableConstraintsDataType) strategy.copy(LocatorUtils.property(locator, "incentiveTableConstraintsData", sourceIncentiveTableConstraintsData), sourceIncentiveTableConstraintsData, (this.incentiveTableConstraintsData!= null)));
                    copy.setIncentiveTableConstraintsData(copyIncentiveTableConstraintsData);
                } else {
                    if (incentiveTableConstraintsDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.incentiveTableConstraintsData = null;
                    }
                }
            }
            {
                Boolean incentiveTableDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.incentiveTableData!= null));
                if (incentiveTableDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    IncentiveTableDataType sourceIncentiveTableData;
                    sourceIncentiveTableData = this.getIncentiveTableData();
                    IncentiveTableDataType copyIncentiveTableData = ((IncentiveTableDataType) strategy.copy(LocatorUtils.property(locator, "incentiveTableData", sourceIncentiveTableData), sourceIncentiveTableData, (this.incentiveTableData!= null)));
                    copy.setIncentiveTableData(copyIncentiveTableData);
                } else {
                    if (incentiveTableDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.incentiveTableData = null;
                    }
                }
            }
            {
                Boolean incentiveTableDescriptionDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.incentiveTableDescriptionData!= null));
                if (incentiveTableDescriptionDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    IncentiveTableDescriptionDataType sourceIncentiveTableDescriptionData;
                    sourceIncentiveTableDescriptionData = this.getIncentiveTableDescriptionData();
                    IncentiveTableDescriptionDataType copyIncentiveTableDescriptionData = ((IncentiveTableDescriptionDataType) strategy.copy(LocatorUtils.property(locator, "incentiveTableDescriptionData", sourceIncentiveTableDescriptionData), sourceIncentiveTableDescriptionData, (this.incentiveTableDescriptionData!= null)));
                    copy.setIncentiveTableDescriptionData(copyIncentiveTableDescriptionData);
                } else {
                    if (incentiveTableDescriptionDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.incentiveTableDescriptionData = null;
                    }
                }
            }
            {
                Boolean loadControlEventListDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.loadControlEventListData!= null));
                if (loadControlEventListDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    LoadControlEventListDataType sourceLoadControlEventListData;
                    sourceLoadControlEventListData = this.getLoadControlEventListData();
                    LoadControlEventListDataType copyLoadControlEventListData = ((LoadControlEventListDataType) strategy.copy(LocatorUtils.property(locator, "loadControlEventListData", sourceLoadControlEventListData), sourceLoadControlEventListData, (this.loadControlEventListData!= null)));
                    copy.setLoadControlEventListData(copyLoadControlEventListData);
                } else {
                    if (loadControlEventListDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.loadControlEventListData = null;
                    }
                }
            }
            {
                Boolean loadControlLimitConstraintsListDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.loadControlLimitConstraintsListData!= null));
                if (loadControlLimitConstraintsListDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    LoadControlLimitConstraintsListDataType sourceLoadControlLimitConstraintsListData;
                    sourceLoadControlLimitConstraintsListData = this.getLoadControlLimitConstraintsListData();
                    LoadControlLimitConstraintsListDataType copyLoadControlLimitConstraintsListData = ((LoadControlLimitConstraintsListDataType) strategy.copy(LocatorUtils.property(locator, "loadControlLimitConstraintsListData", sourceLoadControlLimitConstraintsListData), sourceLoadControlLimitConstraintsListData, (this.loadControlLimitConstraintsListData!= null)));
                    copy.setLoadControlLimitConstraintsListData(copyLoadControlLimitConstraintsListData);
                } else {
                    if (loadControlLimitConstraintsListDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.loadControlLimitConstraintsListData = null;
                    }
                }
            }
            {
                Boolean loadControlLimitDescriptionListDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.loadControlLimitDescriptionListData!= null));
                if (loadControlLimitDescriptionListDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    LoadControlLimitDescriptionListDataType sourceLoadControlLimitDescriptionListData;
                    sourceLoadControlLimitDescriptionListData = this.getLoadControlLimitDescriptionListData();
                    LoadControlLimitDescriptionListDataType copyLoadControlLimitDescriptionListData = ((LoadControlLimitDescriptionListDataType) strategy.copy(LocatorUtils.property(locator, "loadControlLimitDescriptionListData", sourceLoadControlLimitDescriptionListData), sourceLoadControlLimitDescriptionListData, (this.loadControlLimitDescriptionListData!= null)));
                    copy.setLoadControlLimitDescriptionListData(copyLoadControlLimitDescriptionListData);
                } else {
                    if (loadControlLimitDescriptionListDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.loadControlLimitDescriptionListData = null;
                    }
                }
            }
            {
                Boolean loadControlLimitListDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.loadControlLimitListData!= null));
                if (loadControlLimitListDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    LoadControlLimitListDataType sourceLoadControlLimitListData;
                    sourceLoadControlLimitListData = this.getLoadControlLimitListData();
                    LoadControlLimitListDataType copyLoadControlLimitListData = ((LoadControlLimitListDataType) strategy.copy(LocatorUtils.property(locator, "loadControlLimitListData", sourceLoadControlLimitListData), sourceLoadControlLimitListData, (this.loadControlLimitListData!= null)));
                    copy.setLoadControlLimitListData(copyLoadControlLimitListData);
                } else {
                    if (loadControlLimitListDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.loadControlLimitListData = null;
                    }
                }
            }
            {
                Boolean loadControlNodeDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.loadControlNodeData!= null));
                if (loadControlNodeDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    LoadControlNodeDataType sourceLoadControlNodeData;
                    sourceLoadControlNodeData = this.getLoadControlNodeData();
                    LoadControlNodeDataType copyLoadControlNodeData = ((LoadControlNodeDataType) strategy.copy(LocatorUtils.property(locator, "loadControlNodeData", sourceLoadControlNodeData), sourceLoadControlNodeData, (this.loadControlNodeData!= null)));
                    copy.setLoadControlNodeData(copyLoadControlNodeData);
                } else {
                    if (loadControlNodeDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.loadControlNodeData = null;
                    }
                }
            }
            {
                Boolean loadControlStateListDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.loadControlStateListData!= null));
                if (loadControlStateListDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    LoadControlStateListDataType sourceLoadControlStateListData;
                    sourceLoadControlStateListData = this.getLoadControlStateListData();
                    LoadControlStateListDataType copyLoadControlStateListData = ((LoadControlStateListDataType) strategy.copy(LocatorUtils.property(locator, "loadControlStateListData", sourceLoadControlStateListData), sourceLoadControlStateListData, (this.loadControlStateListData!= null)));
                    copy.setLoadControlStateListData(copyLoadControlStateListData);
                } else {
                    if (loadControlStateListDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.loadControlStateListData = null;
                    }
                }
            }
            {
                Boolean measurementConstraintsListDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.measurementConstraintsListData!= null));
                if (measurementConstraintsListDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    MeasurementConstraintsListDataType sourceMeasurementConstraintsListData;
                    sourceMeasurementConstraintsListData = this.getMeasurementConstraintsListData();
                    MeasurementConstraintsListDataType copyMeasurementConstraintsListData = ((MeasurementConstraintsListDataType) strategy.copy(LocatorUtils.property(locator, "measurementConstraintsListData", sourceMeasurementConstraintsListData), sourceMeasurementConstraintsListData, (this.measurementConstraintsListData!= null)));
                    copy.setMeasurementConstraintsListData(copyMeasurementConstraintsListData);
                } else {
                    if (measurementConstraintsListDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.measurementConstraintsListData = null;
                    }
                }
            }
            {
                Boolean measurementDescriptionListDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.measurementDescriptionListData!= null));
                if (measurementDescriptionListDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    MeasurementDescriptionListDataType sourceMeasurementDescriptionListData;
                    sourceMeasurementDescriptionListData = this.getMeasurementDescriptionListData();
                    MeasurementDescriptionListDataType copyMeasurementDescriptionListData = ((MeasurementDescriptionListDataType) strategy.copy(LocatorUtils.property(locator, "measurementDescriptionListData", sourceMeasurementDescriptionListData), sourceMeasurementDescriptionListData, (this.measurementDescriptionListData!= null)));
                    copy.setMeasurementDescriptionListData(copyMeasurementDescriptionListData);
                } else {
                    if (measurementDescriptionListDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.measurementDescriptionListData = null;
                    }
                }
            }
            {
                Boolean measurementListDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.measurementListData!= null));
                if (measurementListDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    MeasurementListDataType sourceMeasurementListData;
                    sourceMeasurementListData = this.getMeasurementListData();
                    MeasurementListDataType copyMeasurementListData = ((MeasurementListDataType) strategy.copy(LocatorUtils.property(locator, "measurementListData", sourceMeasurementListData), sourceMeasurementListData, (this.measurementListData!= null)));
                    copy.setMeasurementListData(copyMeasurementListData);
                } else {
                    if (measurementListDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.measurementListData = null;
                    }
                }
            }
            {
                Boolean measurementSeriesListDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.measurementSeriesListData!= null));
                if (measurementSeriesListDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    MeasurementSeriesListDataType sourceMeasurementSeriesListData;
                    sourceMeasurementSeriesListData = this.getMeasurementSeriesListData();
                    MeasurementSeriesListDataType copyMeasurementSeriesListData = ((MeasurementSeriesListDataType) strategy.copy(LocatorUtils.property(locator, "measurementSeriesListData", sourceMeasurementSeriesListData), sourceMeasurementSeriesListData, (this.measurementSeriesListData!= null)));
                    copy.setMeasurementSeriesListData(copyMeasurementSeriesListData);
                } else {
                    if (measurementSeriesListDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.measurementSeriesListData = null;
                    }
                }
            }
            {
                Boolean measurementThresholdRelationListDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.measurementThresholdRelationListData!= null));
                if (measurementThresholdRelationListDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    MeasurementThresholdRelationListDataType sourceMeasurementThresholdRelationListData;
                    sourceMeasurementThresholdRelationListData = this.getMeasurementThresholdRelationListData();
                    MeasurementThresholdRelationListDataType copyMeasurementThresholdRelationListData = ((MeasurementThresholdRelationListDataType) strategy.copy(LocatorUtils.property(locator, "measurementThresholdRelationListData", sourceMeasurementThresholdRelationListData), sourceMeasurementThresholdRelationListData, (this.measurementThresholdRelationListData!= null)));
                    copy.setMeasurementThresholdRelationListData(copyMeasurementThresholdRelationListData);
                } else {
                    if (measurementThresholdRelationListDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.measurementThresholdRelationListData = null;
                    }
                }
            }
            {
                Boolean messagingListDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.messagingListData!= null));
                if (messagingListDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    MessagingListDataType sourceMessagingListData;
                    sourceMessagingListData = this.getMessagingListData();
                    MessagingListDataType copyMessagingListData = ((MessagingListDataType) strategy.copy(LocatorUtils.property(locator, "messagingListData", sourceMessagingListData), sourceMessagingListData, (this.messagingListData!= null)));
                    copy.setMessagingListData(copyMessagingListData);
                } else {
                    if (messagingListDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.messagingListData = null;
                    }
                }
            }
            {
                Boolean networkManagementAbortCallShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.networkManagementAbortCall!= null));
                if (networkManagementAbortCallShouldBeCopiedAndSet == Boolean.TRUE) {
                    NetworkManagementAbortCallType sourceNetworkManagementAbortCall;
                    sourceNetworkManagementAbortCall = this.getNetworkManagementAbortCall();
                    NetworkManagementAbortCallType copyNetworkManagementAbortCall = ((NetworkManagementAbortCallType) strategy.copy(LocatorUtils.property(locator, "networkManagementAbortCall", sourceNetworkManagementAbortCall), sourceNetworkManagementAbortCall, (this.networkManagementAbortCall!= null)));
                    copy.setNetworkManagementAbortCall(copyNetworkManagementAbortCall);
                } else {
                    if (networkManagementAbortCallShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.networkManagementAbortCall = null;
                    }
                }
            }
            {
                Boolean networkManagementAddNodeCallShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.networkManagementAddNodeCall!= null));
                if (networkManagementAddNodeCallShouldBeCopiedAndSet == Boolean.TRUE) {
                    NetworkManagementAddNodeCallType sourceNetworkManagementAddNodeCall;
                    sourceNetworkManagementAddNodeCall = this.getNetworkManagementAddNodeCall();
                    NetworkManagementAddNodeCallType copyNetworkManagementAddNodeCall = ((NetworkManagementAddNodeCallType) strategy.copy(LocatorUtils.property(locator, "networkManagementAddNodeCall", sourceNetworkManagementAddNodeCall), sourceNetworkManagementAddNodeCall, (this.networkManagementAddNodeCall!= null)));
                    copy.setNetworkManagementAddNodeCall(copyNetworkManagementAddNodeCall);
                } else {
                    if (networkManagementAddNodeCallShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.networkManagementAddNodeCall = null;
                    }
                }
            }
            {
                Boolean networkManagementDeviceDescriptionListDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.networkManagementDeviceDescriptionListData!= null));
                if (networkManagementDeviceDescriptionListDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    NetworkManagementDeviceDescriptionListDataType sourceNetworkManagementDeviceDescriptionListData;
                    sourceNetworkManagementDeviceDescriptionListData = this.getNetworkManagementDeviceDescriptionListData();
                    NetworkManagementDeviceDescriptionListDataType copyNetworkManagementDeviceDescriptionListData = ((NetworkManagementDeviceDescriptionListDataType) strategy.copy(LocatorUtils.property(locator, "networkManagementDeviceDescriptionListData", sourceNetworkManagementDeviceDescriptionListData), sourceNetworkManagementDeviceDescriptionListData, (this.networkManagementDeviceDescriptionListData!= null)));
                    copy.setNetworkManagementDeviceDescriptionListData(copyNetworkManagementDeviceDescriptionListData);
                } else {
                    if (networkManagementDeviceDescriptionListDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.networkManagementDeviceDescriptionListData = null;
                    }
                }
            }
            {
                Boolean networkManagementDiscoverCallShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.networkManagementDiscoverCall!= null));
                if (networkManagementDiscoverCallShouldBeCopiedAndSet == Boolean.TRUE) {
                    NetworkManagementDiscoverCallType sourceNetworkManagementDiscoverCall;
                    sourceNetworkManagementDiscoverCall = this.getNetworkManagementDiscoverCall();
                    NetworkManagementDiscoverCallType copyNetworkManagementDiscoverCall = ((NetworkManagementDiscoverCallType) strategy.copy(LocatorUtils.property(locator, "networkManagementDiscoverCall", sourceNetworkManagementDiscoverCall), sourceNetworkManagementDiscoverCall, (this.networkManagementDiscoverCall!= null)));
                    copy.setNetworkManagementDiscoverCall(copyNetworkManagementDiscoverCall);
                } else {
                    if (networkManagementDiscoverCallShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.networkManagementDiscoverCall = null;
                    }
                }
            }
            {
                Boolean networkManagementEntityDescriptionListDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.networkManagementEntityDescriptionListData!= null));
                if (networkManagementEntityDescriptionListDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    NetworkManagementEntityDescriptionListDataType sourceNetworkManagementEntityDescriptionListData;
                    sourceNetworkManagementEntityDescriptionListData = this.getNetworkManagementEntityDescriptionListData();
                    NetworkManagementEntityDescriptionListDataType copyNetworkManagementEntityDescriptionListData = ((NetworkManagementEntityDescriptionListDataType) strategy.copy(LocatorUtils.property(locator, "networkManagementEntityDescriptionListData", sourceNetworkManagementEntityDescriptionListData), sourceNetworkManagementEntityDescriptionListData, (this.networkManagementEntityDescriptionListData!= null)));
                    copy.setNetworkManagementEntityDescriptionListData(copyNetworkManagementEntityDescriptionListData);
                } else {
                    if (networkManagementEntityDescriptionListDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.networkManagementEntityDescriptionListData = null;
                    }
                }
            }
            {
                Boolean networkManagementFeatureDescriptionListDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.networkManagementFeatureDescriptionListData!= null));
                if (networkManagementFeatureDescriptionListDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    NetworkManagementFeatureDescriptionListDataType sourceNetworkManagementFeatureDescriptionListData;
                    sourceNetworkManagementFeatureDescriptionListData = this.getNetworkManagementFeatureDescriptionListData();
                    NetworkManagementFeatureDescriptionListDataType copyNetworkManagementFeatureDescriptionListData = ((NetworkManagementFeatureDescriptionListDataType) strategy.copy(LocatorUtils.property(locator, "networkManagementFeatureDescriptionListData", sourceNetworkManagementFeatureDescriptionListData), sourceNetworkManagementFeatureDescriptionListData, (this.networkManagementFeatureDescriptionListData!= null)));
                    copy.setNetworkManagementFeatureDescriptionListData(copyNetworkManagementFeatureDescriptionListData);
                } else {
                    if (networkManagementFeatureDescriptionListDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.networkManagementFeatureDescriptionListData = null;
                    }
                }
            }
            {
                Boolean networkManagementJoiningModeDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.networkManagementJoiningModeData!= null));
                if (networkManagementJoiningModeDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    NetworkManagementJoiningModeDataType sourceNetworkManagementJoiningModeData;
                    sourceNetworkManagementJoiningModeData = this.getNetworkManagementJoiningModeData();
                    NetworkManagementJoiningModeDataType copyNetworkManagementJoiningModeData = ((NetworkManagementJoiningModeDataType) strategy.copy(LocatorUtils.property(locator, "networkManagementJoiningModeData", sourceNetworkManagementJoiningModeData), sourceNetworkManagementJoiningModeData, (this.networkManagementJoiningModeData!= null)));
                    copy.setNetworkManagementJoiningModeData(copyNetworkManagementJoiningModeData);
                } else {
                    if (networkManagementJoiningModeDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.networkManagementJoiningModeData = null;
                    }
                }
            }
            {
                Boolean networkManagementModifyNodeCallShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.networkManagementModifyNodeCall!= null));
                if (networkManagementModifyNodeCallShouldBeCopiedAndSet == Boolean.TRUE) {
                    NetworkManagementModifyNodeCallType sourceNetworkManagementModifyNodeCall;
                    sourceNetworkManagementModifyNodeCall = this.getNetworkManagementModifyNodeCall();
                    NetworkManagementModifyNodeCallType copyNetworkManagementModifyNodeCall = ((NetworkManagementModifyNodeCallType) strategy.copy(LocatorUtils.property(locator, "networkManagementModifyNodeCall", sourceNetworkManagementModifyNodeCall), sourceNetworkManagementModifyNodeCall, (this.networkManagementModifyNodeCall!= null)));
                    copy.setNetworkManagementModifyNodeCall(copyNetworkManagementModifyNodeCall);
                } else {
                    if (networkManagementModifyNodeCallShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.networkManagementModifyNodeCall = null;
                    }
                }
            }
            {
                Boolean networkManagementProcessStateDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.networkManagementProcessStateData!= null));
                if (networkManagementProcessStateDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    NetworkManagementProcessStateDataType sourceNetworkManagementProcessStateData;
                    sourceNetworkManagementProcessStateData = this.getNetworkManagementProcessStateData();
                    NetworkManagementProcessStateDataType copyNetworkManagementProcessStateData = ((NetworkManagementProcessStateDataType) strategy.copy(LocatorUtils.property(locator, "networkManagementProcessStateData", sourceNetworkManagementProcessStateData), sourceNetworkManagementProcessStateData, (this.networkManagementProcessStateData!= null)));
                    copy.setNetworkManagementProcessStateData(copyNetworkManagementProcessStateData);
                } else {
                    if (networkManagementProcessStateDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.networkManagementProcessStateData = null;
                    }
                }
            }
            {
                Boolean networkManagementRemoveNodeCallShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.networkManagementRemoveNodeCall!= null));
                if (networkManagementRemoveNodeCallShouldBeCopiedAndSet == Boolean.TRUE) {
                    NetworkManagementRemoveNodeCallType sourceNetworkManagementRemoveNodeCall;
                    sourceNetworkManagementRemoveNodeCall = this.getNetworkManagementRemoveNodeCall();
                    NetworkManagementRemoveNodeCallType copyNetworkManagementRemoveNodeCall = ((NetworkManagementRemoveNodeCallType) strategy.copy(LocatorUtils.property(locator, "networkManagementRemoveNodeCall", sourceNetworkManagementRemoveNodeCall), sourceNetworkManagementRemoveNodeCall, (this.networkManagementRemoveNodeCall!= null)));
                    copy.setNetworkManagementRemoveNodeCall(copyNetworkManagementRemoveNodeCall);
                } else {
                    if (networkManagementRemoveNodeCallShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.networkManagementRemoveNodeCall = null;
                    }
                }
            }
            {
                Boolean networkManagementReportCandidateDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.networkManagementReportCandidateData!= null));
                if (networkManagementReportCandidateDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    NetworkManagementReportCandidateDataType sourceNetworkManagementReportCandidateData;
                    sourceNetworkManagementReportCandidateData = this.getNetworkManagementReportCandidateData();
                    NetworkManagementReportCandidateDataType copyNetworkManagementReportCandidateData = ((NetworkManagementReportCandidateDataType) strategy.copy(LocatorUtils.property(locator, "networkManagementReportCandidateData", sourceNetworkManagementReportCandidateData), sourceNetworkManagementReportCandidateData, (this.networkManagementReportCandidateData!= null)));
                    copy.setNetworkManagementReportCandidateData(copyNetworkManagementReportCandidateData);
                } else {
                    if (networkManagementReportCandidateDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.networkManagementReportCandidateData = null;
                    }
                }
            }
            {
                Boolean networkManagementScanNetworkCallShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.networkManagementScanNetworkCall!= null));
                if (networkManagementScanNetworkCallShouldBeCopiedAndSet == Boolean.TRUE) {
                    NetworkManagementScanNetworkCallType sourceNetworkManagementScanNetworkCall;
                    sourceNetworkManagementScanNetworkCall = this.getNetworkManagementScanNetworkCall();
                    NetworkManagementScanNetworkCallType copyNetworkManagementScanNetworkCall = ((NetworkManagementScanNetworkCallType) strategy.copy(LocatorUtils.property(locator, "networkManagementScanNetworkCall", sourceNetworkManagementScanNetworkCall), sourceNetworkManagementScanNetworkCall, (this.networkManagementScanNetworkCall!= null)));
                    copy.setNetworkManagementScanNetworkCall(copyNetworkManagementScanNetworkCall);
                } else {
                    if (networkManagementScanNetworkCallShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.networkManagementScanNetworkCall = null;
                    }
                }
            }
            {
                Boolean nodeManagementBindingDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.nodeManagementBindingData!= null));
                if (nodeManagementBindingDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    NodeManagementBindingDataType sourceNodeManagementBindingData;
                    sourceNodeManagementBindingData = this.getNodeManagementBindingData();
                    NodeManagementBindingDataType copyNodeManagementBindingData = ((NodeManagementBindingDataType) strategy.copy(LocatorUtils.property(locator, "nodeManagementBindingData", sourceNodeManagementBindingData), sourceNodeManagementBindingData, (this.nodeManagementBindingData!= null)));
                    copy.setNodeManagementBindingData(copyNodeManagementBindingData);
                } else {
                    if (nodeManagementBindingDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.nodeManagementBindingData = null;
                    }
                }
            }
            {
                Boolean nodeManagementBindingDeleteCallShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.nodeManagementBindingDeleteCall!= null));
                if (nodeManagementBindingDeleteCallShouldBeCopiedAndSet == Boolean.TRUE) {
                    NodeManagementBindingDeleteCallType sourceNodeManagementBindingDeleteCall;
                    sourceNodeManagementBindingDeleteCall = this.getNodeManagementBindingDeleteCall();
                    NodeManagementBindingDeleteCallType copyNodeManagementBindingDeleteCall = ((NodeManagementBindingDeleteCallType) strategy.copy(LocatorUtils.property(locator, "nodeManagementBindingDeleteCall", sourceNodeManagementBindingDeleteCall), sourceNodeManagementBindingDeleteCall, (this.nodeManagementBindingDeleteCall!= null)));
                    copy.setNodeManagementBindingDeleteCall(copyNodeManagementBindingDeleteCall);
                } else {
                    if (nodeManagementBindingDeleteCallShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.nodeManagementBindingDeleteCall = null;
                    }
                }
            }
            {
                Boolean nodeManagementBindingRequestCallShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.nodeManagementBindingRequestCall!= null));
                if (nodeManagementBindingRequestCallShouldBeCopiedAndSet == Boolean.TRUE) {
                    NodeManagementBindingRequestCallType sourceNodeManagementBindingRequestCall;
                    sourceNodeManagementBindingRequestCall = this.getNodeManagementBindingRequestCall();
                    NodeManagementBindingRequestCallType copyNodeManagementBindingRequestCall = ((NodeManagementBindingRequestCallType) strategy.copy(LocatorUtils.property(locator, "nodeManagementBindingRequestCall", sourceNodeManagementBindingRequestCall), sourceNodeManagementBindingRequestCall, (this.nodeManagementBindingRequestCall!= null)));
                    copy.setNodeManagementBindingRequestCall(copyNodeManagementBindingRequestCall);
                } else {
                    if (nodeManagementBindingRequestCallShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.nodeManagementBindingRequestCall = null;
                    }
                }
            }
            {
                Boolean nodeManagementDestinationListDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.nodeManagementDestinationListData!= null));
                if (nodeManagementDestinationListDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    NodeManagementDestinationListDataType sourceNodeManagementDestinationListData;
                    sourceNodeManagementDestinationListData = this.getNodeManagementDestinationListData();
                    NodeManagementDestinationListDataType copyNodeManagementDestinationListData = ((NodeManagementDestinationListDataType) strategy.copy(LocatorUtils.property(locator, "nodeManagementDestinationListData", sourceNodeManagementDestinationListData), sourceNodeManagementDestinationListData, (this.nodeManagementDestinationListData!= null)));
                    copy.setNodeManagementDestinationListData(copyNodeManagementDestinationListData);
                } else {
                    if (nodeManagementDestinationListDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.nodeManagementDestinationListData = null;
                    }
                }
            }
            {
                Boolean nodeManagementDetailedDiscoveryDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.nodeManagementDetailedDiscoveryData!= null));
                if (nodeManagementDetailedDiscoveryDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    NodeManagementDetailedDiscoveryDataType sourceNodeManagementDetailedDiscoveryData;
                    sourceNodeManagementDetailedDiscoveryData = this.getNodeManagementDetailedDiscoveryData();
                    NodeManagementDetailedDiscoveryDataType copyNodeManagementDetailedDiscoveryData = ((NodeManagementDetailedDiscoveryDataType) strategy.copy(LocatorUtils.property(locator, "nodeManagementDetailedDiscoveryData", sourceNodeManagementDetailedDiscoveryData), sourceNodeManagementDetailedDiscoveryData, (this.nodeManagementDetailedDiscoveryData!= null)));
                    copy.setNodeManagementDetailedDiscoveryData(copyNodeManagementDetailedDiscoveryData);
                } else {
                    if (nodeManagementDetailedDiscoveryDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.nodeManagementDetailedDiscoveryData = null;
                    }
                }
            }
            {
                Boolean nodeManagementSubscriptionDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.nodeManagementSubscriptionData!= null));
                if (nodeManagementSubscriptionDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    NodeManagementSubscriptionDataType sourceNodeManagementSubscriptionData;
                    sourceNodeManagementSubscriptionData = this.getNodeManagementSubscriptionData();
                    NodeManagementSubscriptionDataType copyNodeManagementSubscriptionData = ((NodeManagementSubscriptionDataType) strategy.copy(LocatorUtils.property(locator, "nodeManagementSubscriptionData", sourceNodeManagementSubscriptionData), sourceNodeManagementSubscriptionData, (this.nodeManagementSubscriptionData!= null)));
                    copy.setNodeManagementSubscriptionData(copyNodeManagementSubscriptionData);
                } else {
                    if (nodeManagementSubscriptionDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.nodeManagementSubscriptionData = null;
                    }
                }
            }
            {
                Boolean nodeManagementSubscriptionDeleteCallShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.nodeManagementSubscriptionDeleteCall!= null));
                if (nodeManagementSubscriptionDeleteCallShouldBeCopiedAndSet == Boolean.TRUE) {
                    NodeManagementSubscriptionDeleteCallType sourceNodeManagementSubscriptionDeleteCall;
                    sourceNodeManagementSubscriptionDeleteCall = this.getNodeManagementSubscriptionDeleteCall();
                    NodeManagementSubscriptionDeleteCallType copyNodeManagementSubscriptionDeleteCall = ((NodeManagementSubscriptionDeleteCallType) strategy.copy(LocatorUtils.property(locator, "nodeManagementSubscriptionDeleteCall", sourceNodeManagementSubscriptionDeleteCall), sourceNodeManagementSubscriptionDeleteCall, (this.nodeManagementSubscriptionDeleteCall!= null)));
                    copy.setNodeManagementSubscriptionDeleteCall(copyNodeManagementSubscriptionDeleteCall);
                } else {
                    if (nodeManagementSubscriptionDeleteCallShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.nodeManagementSubscriptionDeleteCall = null;
                    }
                }
            }
            {
                Boolean nodeManagementSubscriptionRequestCallShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.nodeManagementSubscriptionRequestCall!= null));
                if (nodeManagementSubscriptionRequestCallShouldBeCopiedAndSet == Boolean.TRUE) {
                    NodeManagementSubscriptionRequestCallType sourceNodeManagementSubscriptionRequestCall;
                    sourceNodeManagementSubscriptionRequestCall = this.getNodeManagementSubscriptionRequestCall();
                    NodeManagementSubscriptionRequestCallType copyNodeManagementSubscriptionRequestCall = ((NodeManagementSubscriptionRequestCallType) strategy.copy(LocatorUtils.property(locator, "nodeManagementSubscriptionRequestCall", sourceNodeManagementSubscriptionRequestCall), sourceNodeManagementSubscriptionRequestCall, (this.nodeManagementSubscriptionRequestCall!= null)));
                    copy.setNodeManagementSubscriptionRequestCall(copyNodeManagementSubscriptionRequestCall);
                } else {
                    if (nodeManagementSubscriptionRequestCallShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.nodeManagementSubscriptionRequestCall = null;
                    }
                }
            }
            {
                Boolean nodeManagementUseCaseDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.nodeManagementUseCaseData!= null));
                if (nodeManagementUseCaseDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    NodeManagementUseCaseDataType sourceNodeManagementUseCaseData;
                    sourceNodeManagementUseCaseData = this.getNodeManagementUseCaseData();
                    NodeManagementUseCaseDataType copyNodeManagementUseCaseData = ((NodeManagementUseCaseDataType) strategy.copy(LocatorUtils.property(locator, "nodeManagementUseCaseData", sourceNodeManagementUseCaseData), sourceNodeManagementUseCaseData, (this.nodeManagementUseCaseData!= null)));
                    copy.setNodeManagementUseCaseData(copyNodeManagementUseCaseData);
                } else {
                    if (nodeManagementUseCaseDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.nodeManagementUseCaseData = null;
                    }
                }
            }
            {
                Boolean operatingConstraintsDurationListDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.operatingConstraintsDurationListData!= null));
                if (operatingConstraintsDurationListDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    OperatingConstraintsDurationListDataType sourceOperatingConstraintsDurationListData;
                    sourceOperatingConstraintsDurationListData = this.getOperatingConstraintsDurationListData();
                    OperatingConstraintsDurationListDataType copyOperatingConstraintsDurationListData = ((OperatingConstraintsDurationListDataType) strategy.copy(LocatorUtils.property(locator, "operatingConstraintsDurationListData", sourceOperatingConstraintsDurationListData), sourceOperatingConstraintsDurationListData, (this.operatingConstraintsDurationListData!= null)));
                    copy.setOperatingConstraintsDurationListData(copyOperatingConstraintsDurationListData);
                } else {
                    if (operatingConstraintsDurationListDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.operatingConstraintsDurationListData = null;
                    }
                }
            }
            {
                Boolean operatingConstraintsInterruptListDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.operatingConstraintsInterruptListData!= null));
                if (operatingConstraintsInterruptListDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    OperatingConstraintsInterruptListDataType sourceOperatingConstraintsInterruptListData;
                    sourceOperatingConstraintsInterruptListData = this.getOperatingConstraintsInterruptListData();
                    OperatingConstraintsInterruptListDataType copyOperatingConstraintsInterruptListData = ((OperatingConstraintsInterruptListDataType) strategy.copy(LocatorUtils.property(locator, "operatingConstraintsInterruptListData", sourceOperatingConstraintsInterruptListData), sourceOperatingConstraintsInterruptListData, (this.operatingConstraintsInterruptListData!= null)));
                    copy.setOperatingConstraintsInterruptListData(copyOperatingConstraintsInterruptListData);
                } else {
                    if (operatingConstraintsInterruptListDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.operatingConstraintsInterruptListData = null;
                    }
                }
            }
            {
                Boolean operatingConstraintsPowerDescriptionListDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.operatingConstraintsPowerDescriptionListData!= null));
                if (operatingConstraintsPowerDescriptionListDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    OperatingConstraintsPowerDescriptionListDataType sourceOperatingConstraintsPowerDescriptionListData;
                    sourceOperatingConstraintsPowerDescriptionListData = this.getOperatingConstraintsPowerDescriptionListData();
                    OperatingConstraintsPowerDescriptionListDataType copyOperatingConstraintsPowerDescriptionListData = ((OperatingConstraintsPowerDescriptionListDataType) strategy.copy(LocatorUtils.property(locator, "operatingConstraintsPowerDescriptionListData", sourceOperatingConstraintsPowerDescriptionListData), sourceOperatingConstraintsPowerDescriptionListData, (this.operatingConstraintsPowerDescriptionListData!= null)));
                    copy.setOperatingConstraintsPowerDescriptionListData(copyOperatingConstraintsPowerDescriptionListData);
                } else {
                    if (operatingConstraintsPowerDescriptionListDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.operatingConstraintsPowerDescriptionListData = null;
                    }
                }
            }
            {
                Boolean operatingConstraintsPowerLevelListDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.operatingConstraintsPowerLevelListData!= null));
                if (operatingConstraintsPowerLevelListDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    OperatingConstraintsPowerLevelListDataType sourceOperatingConstraintsPowerLevelListData;
                    sourceOperatingConstraintsPowerLevelListData = this.getOperatingConstraintsPowerLevelListData();
                    OperatingConstraintsPowerLevelListDataType copyOperatingConstraintsPowerLevelListData = ((OperatingConstraintsPowerLevelListDataType) strategy.copy(LocatorUtils.property(locator, "operatingConstraintsPowerLevelListData", sourceOperatingConstraintsPowerLevelListData), sourceOperatingConstraintsPowerLevelListData, (this.operatingConstraintsPowerLevelListData!= null)));
                    copy.setOperatingConstraintsPowerLevelListData(copyOperatingConstraintsPowerLevelListData);
                } else {
                    if (operatingConstraintsPowerLevelListDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.operatingConstraintsPowerLevelListData = null;
                    }
                }
            }
            {
                Boolean operatingConstraintsPowerRangeListDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.operatingConstraintsPowerRangeListData!= null));
                if (operatingConstraintsPowerRangeListDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    OperatingConstraintsPowerRangeListDataType sourceOperatingConstraintsPowerRangeListData;
                    sourceOperatingConstraintsPowerRangeListData = this.getOperatingConstraintsPowerRangeListData();
                    OperatingConstraintsPowerRangeListDataType copyOperatingConstraintsPowerRangeListData = ((OperatingConstraintsPowerRangeListDataType) strategy.copy(LocatorUtils.property(locator, "operatingConstraintsPowerRangeListData", sourceOperatingConstraintsPowerRangeListData), sourceOperatingConstraintsPowerRangeListData, (this.operatingConstraintsPowerRangeListData!= null)));
                    copy.setOperatingConstraintsPowerRangeListData(copyOperatingConstraintsPowerRangeListData);
                } else {
                    if (operatingConstraintsPowerRangeListDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.operatingConstraintsPowerRangeListData = null;
                    }
                }
            }
            {
                Boolean operatingConstraintsResumeImplicationListDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.operatingConstraintsResumeImplicationListData!= null));
                if (operatingConstraintsResumeImplicationListDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    OperatingConstraintsResumeImplicationListDataType sourceOperatingConstraintsResumeImplicationListData;
                    sourceOperatingConstraintsResumeImplicationListData = this.getOperatingConstraintsResumeImplicationListData();
                    OperatingConstraintsResumeImplicationListDataType copyOperatingConstraintsResumeImplicationListData = ((OperatingConstraintsResumeImplicationListDataType) strategy.copy(LocatorUtils.property(locator, "operatingConstraintsResumeImplicationListData", sourceOperatingConstraintsResumeImplicationListData), sourceOperatingConstraintsResumeImplicationListData, (this.operatingConstraintsResumeImplicationListData!= null)));
                    copy.setOperatingConstraintsResumeImplicationListData(copyOperatingConstraintsResumeImplicationListData);
                } else {
                    if (operatingConstraintsResumeImplicationListDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.operatingConstraintsResumeImplicationListData = null;
                    }
                }
            }
            {
                Boolean powerSequenceAlternativesRelationListDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.powerSequenceAlternativesRelationListData!= null));
                if (powerSequenceAlternativesRelationListDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    PowerSequenceAlternativesRelationListDataType sourcePowerSequenceAlternativesRelationListData;
                    sourcePowerSequenceAlternativesRelationListData = this.getPowerSequenceAlternativesRelationListData();
                    PowerSequenceAlternativesRelationListDataType copyPowerSequenceAlternativesRelationListData = ((PowerSequenceAlternativesRelationListDataType) strategy.copy(LocatorUtils.property(locator, "powerSequenceAlternativesRelationListData", sourcePowerSequenceAlternativesRelationListData), sourcePowerSequenceAlternativesRelationListData, (this.powerSequenceAlternativesRelationListData!= null)));
                    copy.setPowerSequenceAlternativesRelationListData(copyPowerSequenceAlternativesRelationListData);
                } else {
                    if (powerSequenceAlternativesRelationListDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.powerSequenceAlternativesRelationListData = null;
                    }
                }
            }
            {
                Boolean powerSequenceDescriptionListDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.powerSequenceDescriptionListData!= null));
                if (powerSequenceDescriptionListDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    PowerSequenceDescriptionListDataType sourcePowerSequenceDescriptionListData;
                    sourcePowerSequenceDescriptionListData = this.getPowerSequenceDescriptionListData();
                    PowerSequenceDescriptionListDataType copyPowerSequenceDescriptionListData = ((PowerSequenceDescriptionListDataType) strategy.copy(LocatorUtils.property(locator, "powerSequenceDescriptionListData", sourcePowerSequenceDescriptionListData), sourcePowerSequenceDescriptionListData, (this.powerSequenceDescriptionListData!= null)));
                    copy.setPowerSequenceDescriptionListData(copyPowerSequenceDescriptionListData);
                } else {
                    if (powerSequenceDescriptionListDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.powerSequenceDescriptionListData = null;
                    }
                }
            }
            {
                Boolean powerSequenceNodeScheduleInformationDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.powerSequenceNodeScheduleInformationData!= null));
                if (powerSequenceNodeScheduleInformationDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    PowerSequenceNodeScheduleInformationDataType sourcePowerSequenceNodeScheduleInformationData;
                    sourcePowerSequenceNodeScheduleInformationData = this.getPowerSequenceNodeScheduleInformationData();
                    PowerSequenceNodeScheduleInformationDataType copyPowerSequenceNodeScheduleInformationData = ((PowerSequenceNodeScheduleInformationDataType) strategy.copy(LocatorUtils.property(locator, "powerSequenceNodeScheduleInformationData", sourcePowerSequenceNodeScheduleInformationData), sourcePowerSequenceNodeScheduleInformationData, (this.powerSequenceNodeScheduleInformationData!= null)));
                    copy.setPowerSequenceNodeScheduleInformationData(copyPowerSequenceNodeScheduleInformationData);
                } else {
                    if (powerSequenceNodeScheduleInformationDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.powerSequenceNodeScheduleInformationData = null;
                    }
                }
            }
            {
                Boolean powerSequencePriceCalculationRequestCallShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.powerSequencePriceCalculationRequestCall!= null));
                if (powerSequencePriceCalculationRequestCallShouldBeCopiedAndSet == Boolean.TRUE) {
                    PowerSequencePriceCalculationRequestCallType sourcePowerSequencePriceCalculationRequestCall;
                    sourcePowerSequencePriceCalculationRequestCall = this.getPowerSequencePriceCalculationRequestCall();
                    PowerSequencePriceCalculationRequestCallType copyPowerSequencePriceCalculationRequestCall = ((PowerSequencePriceCalculationRequestCallType) strategy.copy(LocatorUtils.property(locator, "powerSequencePriceCalculationRequestCall", sourcePowerSequencePriceCalculationRequestCall), sourcePowerSequencePriceCalculationRequestCall, (this.powerSequencePriceCalculationRequestCall!= null)));
                    copy.setPowerSequencePriceCalculationRequestCall(copyPowerSequencePriceCalculationRequestCall);
                } else {
                    if (powerSequencePriceCalculationRequestCallShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.powerSequencePriceCalculationRequestCall = null;
                    }
                }
            }
            {
                Boolean powerSequencePriceListDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.powerSequencePriceListData!= null));
                if (powerSequencePriceListDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    PowerSequencePriceListDataType sourcePowerSequencePriceListData;
                    sourcePowerSequencePriceListData = this.getPowerSequencePriceListData();
                    PowerSequencePriceListDataType copyPowerSequencePriceListData = ((PowerSequencePriceListDataType) strategy.copy(LocatorUtils.property(locator, "powerSequencePriceListData", sourcePowerSequencePriceListData), sourcePowerSequencePriceListData, (this.powerSequencePriceListData!= null)));
                    copy.setPowerSequencePriceListData(copyPowerSequencePriceListData);
                } else {
                    if (powerSequencePriceListDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.powerSequencePriceListData = null;
                    }
                }
            }
            {
                Boolean powerSequenceScheduleConfigurationRequestCallShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.powerSequenceScheduleConfigurationRequestCall!= null));
                if (powerSequenceScheduleConfigurationRequestCallShouldBeCopiedAndSet == Boolean.TRUE) {
                    PowerSequenceScheduleConfigurationRequestCallType sourcePowerSequenceScheduleConfigurationRequestCall;
                    sourcePowerSequenceScheduleConfigurationRequestCall = this.getPowerSequenceScheduleConfigurationRequestCall();
                    PowerSequenceScheduleConfigurationRequestCallType copyPowerSequenceScheduleConfigurationRequestCall = ((PowerSequenceScheduleConfigurationRequestCallType) strategy.copy(LocatorUtils.property(locator, "powerSequenceScheduleConfigurationRequestCall", sourcePowerSequenceScheduleConfigurationRequestCall), sourcePowerSequenceScheduleConfigurationRequestCall, (this.powerSequenceScheduleConfigurationRequestCall!= null)));
                    copy.setPowerSequenceScheduleConfigurationRequestCall(copyPowerSequenceScheduleConfigurationRequestCall);
                } else {
                    if (powerSequenceScheduleConfigurationRequestCallShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.powerSequenceScheduleConfigurationRequestCall = null;
                    }
                }
            }
            {
                Boolean powerSequenceScheduleConstraintsListDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.powerSequenceScheduleConstraintsListData!= null));
                if (powerSequenceScheduleConstraintsListDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    PowerSequenceScheduleConstraintsListDataType sourcePowerSequenceScheduleConstraintsListData;
                    sourcePowerSequenceScheduleConstraintsListData = this.getPowerSequenceScheduleConstraintsListData();
                    PowerSequenceScheduleConstraintsListDataType copyPowerSequenceScheduleConstraintsListData = ((PowerSequenceScheduleConstraintsListDataType) strategy.copy(LocatorUtils.property(locator, "powerSequenceScheduleConstraintsListData", sourcePowerSequenceScheduleConstraintsListData), sourcePowerSequenceScheduleConstraintsListData, (this.powerSequenceScheduleConstraintsListData!= null)));
                    copy.setPowerSequenceScheduleConstraintsListData(copyPowerSequenceScheduleConstraintsListData);
                } else {
                    if (powerSequenceScheduleConstraintsListDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.powerSequenceScheduleConstraintsListData = null;
                    }
                }
            }
            {
                Boolean powerSequenceScheduleListDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.powerSequenceScheduleListData!= null));
                if (powerSequenceScheduleListDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    PowerSequenceScheduleListDataType sourcePowerSequenceScheduleListData;
                    sourcePowerSequenceScheduleListData = this.getPowerSequenceScheduleListData();
                    PowerSequenceScheduleListDataType copyPowerSequenceScheduleListData = ((PowerSequenceScheduleListDataType) strategy.copy(LocatorUtils.property(locator, "powerSequenceScheduleListData", sourcePowerSequenceScheduleListData), sourcePowerSequenceScheduleListData, (this.powerSequenceScheduleListData!= null)));
                    copy.setPowerSequenceScheduleListData(copyPowerSequenceScheduleListData);
                } else {
                    if (powerSequenceScheduleListDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.powerSequenceScheduleListData = null;
                    }
                }
            }
            {
                Boolean powerSequenceSchedulePreferenceListDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.powerSequenceSchedulePreferenceListData!= null));
                if (powerSequenceSchedulePreferenceListDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    PowerSequenceSchedulePreferenceListDataType sourcePowerSequenceSchedulePreferenceListData;
                    sourcePowerSequenceSchedulePreferenceListData = this.getPowerSequenceSchedulePreferenceListData();
                    PowerSequenceSchedulePreferenceListDataType copyPowerSequenceSchedulePreferenceListData = ((PowerSequenceSchedulePreferenceListDataType) strategy.copy(LocatorUtils.property(locator, "powerSequenceSchedulePreferenceListData", sourcePowerSequenceSchedulePreferenceListData), sourcePowerSequenceSchedulePreferenceListData, (this.powerSequenceSchedulePreferenceListData!= null)));
                    copy.setPowerSequenceSchedulePreferenceListData(copyPowerSequenceSchedulePreferenceListData);
                } else {
                    if (powerSequenceSchedulePreferenceListDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.powerSequenceSchedulePreferenceListData = null;
                    }
                }
            }
            {
                Boolean powerSequenceStateListDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.powerSequenceStateListData!= null));
                if (powerSequenceStateListDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    PowerSequenceStateListDataType sourcePowerSequenceStateListData;
                    sourcePowerSequenceStateListData = this.getPowerSequenceStateListData();
                    PowerSequenceStateListDataType copyPowerSequenceStateListData = ((PowerSequenceStateListDataType) strategy.copy(LocatorUtils.property(locator, "powerSequenceStateListData", sourcePowerSequenceStateListData), sourcePowerSequenceStateListData, (this.powerSequenceStateListData!= null)));
                    copy.setPowerSequenceStateListData(copyPowerSequenceStateListData);
                } else {
                    if (powerSequenceStateListDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.powerSequenceStateListData = null;
                    }
                }
            }
            {
                Boolean powerTimeSlotScheduleConstraintsListDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.powerTimeSlotScheduleConstraintsListData!= null));
                if (powerTimeSlotScheduleConstraintsListDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    PowerTimeSlotScheduleConstraintsListDataType sourcePowerTimeSlotScheduleConstraintsListData;
                    sourcePowerTimeSlotScheduleConstraintsListData = this.getPowerTimeSlotScheduleConstraintsListData();
                    PowerTimeSlotScheduleConstraintsListDataType copyPowerTimeSlotScheduleConstraintsListData = ((PowerTimeSlotScheduleConstraintsListDataType) strategy.copy(LocatorUtils.property(locator, "powerTimeSlotScheduleConstraintsListData", sourcePowerTimeSlotScheduleConstraintsListData), sourcePowerTimeSlotScheduleConstraintsListData, (this.powerTimeSlotScheduleConstraintsListData!= null)));
                    copy.setPowerTimeSlotScheduleConstraintsListData(copyPowerTimeSlotScheduleConstraintsListData);
                } else {
                    if (powerTimeSlotScheduleConstraintsListDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.powerTimeSlotScheduleConstraintsListData = null;
                    }
                }
            }
            {
                Boolean powerTimeSlotScheduleListDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.powerTimeSlotScheduleListData!= null));
                if (powerTimeSlotScheduleListDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    PowerTimeSlotScheduleListDataType sourcePowerTimeSlotScheduleListData;
                    sourcePowerTimeSlotScheduleListData = this.getPowerTimeSlotScheduleListData();
                    PowerTimeSlotScheduleListDataType copyPowerTimeSlotScheduleListData = ((PowerTimeSlotScheduleListDataType) strategy.copy(LocatorUtils.property(locator, "powerTimeSlotScheduleListData", sourcePowerTimeSlotScheduleListData), sourcePowerTimeSlotScheduleListData, (this.powerTimeSlotScheduleListData!= null)));
                    copy.setPowerTimeSlotScheduleListData(copyPowerTimeSlotScheduleListData);
                } else {
                    if (powerTimeSlotScheduleListDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.powerTimeSlotScheduleListData = null;
                    }
                }
            }
            {
                Boolean powerTimeSlotValueListDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.powerTimeSlotValueListData!= null));
                if (powerTimeSlotValueListDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    PowerTimeSlotValueListDataType sourcePowerTimeSlotValueListData;
                    sourcePowerTimeSlotValueListData = this.getPowerTimeSlotValueListData();
                    PowerTimeSlotValueListDataType copyPowerTimeSlotValueListData = ((PowerTimeSlotValueListDataType) strategy.copy(LocatorUtils.property(locator, "powerTimeSlotValueListData", sourcePowerTimeSlotValueListData), sourcePowerTimeSlotValueListData, (this.powerTimeSlotValueListData!= null)));
                    copy.setPowerTimeSlotValueListData(copyPowerTimeSlotValueListData);
                } else {
                    if (powerTimeSlotValueListDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.powerTimeSlotValueListData = null;
                    }
                }
            }
            {
                Boolean resultDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.resultData!= null));
                if (resultDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    ResultDataType sourceResultData;
                    sourceResultData = this.getResultData();
                    ResultDataType copyResultData = ((ResultDataType) strategy.copy(LocatorUtils.property(locator, "resultData", sourceResultData), sourceResultData, (this.resultData!= null)));
                    copy.setResultData(copyResultData);
                } else {
                    if (resultDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.resultData = null;
                    }
                }
            }
            {
                Boolean sensingDescriptionDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.sensingDescriptionData!= null));
                if (sensingDescriptionDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    SensingDescriptionDataType sourceSensingDescriptionData;
                    sourceSensingDescriptionData = this.getSensingDescriptionData();
                    SensingDescriptionDataType copySensingDescriptionData = ((SensingDescriptionDataType) strategy.copy(LocatorUtils.property(locator, "sensingDescriptionData", sourceSensingDescriptionData), sourceSensingDescriptionData, (this.sensingDescriptionData!= null)));
                    copy.setSensingDescriptionData(copySensingDescriptionData);
                } else {
                    if (sensingDescriptionDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.sensingDescriptionData = null;
                    }
                }
            }
            {
                Boolean sensingListDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.sensingListData!= null));
                if (sensingListDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    SensingListDataType sourceSensingListData;
                    sourceSensingListData = this.getSensingListData();
                    SensingListDataType copySensingListData = ((SensingListDataType) strategy.copy(LocatorUtils.property(locator, "sensingListData", sourceSensingListData), sourceSensingListData, (this.sensingListData!= null)));
                    copy.setSensingListData(copySensingListData);
                } else {
                    if (sensingListDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.sensingListData = null;
                    }
                }
            }
            {
                Boolean sessionIdentificationListDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.sessionIdentificationListData!= null));
                if (sessionIdentificationListDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    SessionIdentificationListDataType sourceSessionIdentificationListData;
                    sourceSessionIdentificationListData = this.getSessionIdentificationListData();
                    SessionIdentificationListDataType copySessionIdentificationListData = ((SessionIdentificationListDataType) strategy.copy(LocatorUtils.property(locator, "sessionIdentificationListData", sourceSessionIdentificationListData), sourceSessionIdentificationListData, (this.sessionIdentificationListData!= null)));
                    copy.setSessionIdentificationListData(copySessionIdentificationListData);
                } else {
                    if (sessionIdentificationListDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.sessionIdentificationListData = null;
                    }
                }
            }
            {
                Boolean sessionMeasurementRelationListDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.sessionMeasurementRelationListData!= null));
                if (sessionMeasurementRelationListDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    SessionMeasurementRelationListDataType sourceSessionMeasurementRelationListData;
                    sourceSessionMeasurementRelationListData = this.getSessionMeasurementRelationListData();
                    SessionMeasurementRelationListDataType copySessionMeasurementRelationListData = ((SessionMeasurementRelationListDataType) strategy.copy(LocatorUtils.property(locator, "sessionMeasurementRelationListData", sourceSessionMeasurementRelationListData), sourceSessionMeasurementRelationListData, (this.sessionMeasurementRelationListData!= null)));
                    copy.setSessionMeasurementRelationListData(copySessionMeasurementRelationListData);
                } else {
                    if (sessionMeasurementRelationListDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.sessionMeasurementRelationListData = null;
                    }
                }
            }
            {
                Boolean setpointConstraintsListDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.setpointConstraintsListData!= null));
                if (setpointConstraintsListDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    SetpointConstraintsListDataType sourceSetpointConstraintsListData;
                    sourceSetpointConstraintsListData = this.getSetpointConstraintsListData();
                    SetpointConstraintsListDataType copySetpointConstraintsListData = ((SetpointConstraintsListDataType) strategy.copy(LocatorUtils.property(locator, "setpointConstraintsListData", sourceSetpointConstraintsListData), sourceSetpointConstraintsListData, (this.setpointConstraintsListData!= null)));
                    copy.setSetpointConstraintsListData(copySetpointConstraintsListData);
                } else {
                    if (setpointConstraintsListDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.setpointConstraintsListData = null;
                    }
                }
            }
            {
                Boolean setpointDescriptionListDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.setpointDescriptionListData!= null));
                if (setpointDescriptionListDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    SetpointDescriptionListDataType sourceSetpointDescriptionListData;
                    sourceSetpointDescriptionListData = this.getSetpointDescriptionListData();
                    SetpointDescriptionListDataType copySetpointDescriptionListData = ((SetpointDescriptionListDataType) strategy.copy(LocatorUtils.property(locator, "setpointDescriptionListData", sourceSetpointDescriptionListData), sourceSetpointDescriptionListData, (this.setpointDescriptionListData!= null)));
                    copy.setSetpointDescriptionListData(copySetpointDescriptionListData);
                } else {
                    if (setpointDescriptionListDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.setpointDescriptionListData = null;
                    }
                }
            }
            {
                Boolean setpointListDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.setpointListData!= null));
                if (setpointListDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    SetpointListDataType sourceSetpointListData;
                    sourceSetpointListData = this.getSetpointListData();
                    SetpointListDataType copySetpointListData = ((SetpointListDataType) strategy.copy(LocatorUtils.property(locator, "setpointListData", sourceSetpointListData), sourceSetpointListData, (this.setpointListData!= null)));
                    copy.setSetpointListData(copySetpointListData);
                } else {
                    if (setpointListDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.setpointListData = null;
                    }
                }
            }
            {
                Boolean smartEnergyManagementPsConfigurationRequestCallShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.smartEnergyManagementPsConfigurationRequestCall!= null));
                if (smartEnergyManagementPsConfigurationRequestCallShouldBeCopiedAndSet == Boolean.TRUE) {
                    SmartEnergyManagementPsConfigurationRequestCallType sourceSmartEnergyManagementPsConfigurationRequestCall;
                    sourceSmartEnergyManagementPsConfigurationRequestCall = this.getSmartEnergyManagementPsConfigurationRequestCall();
                    SmartEnergyManagementPsConfigurationRequestCallType copySmartEnergyManagementPsConfigurationRequestCall = ((SmartEnergyManagementPsConfigurationRequestCallType) strategy.copy(LocatorUtils.property(locator, "smartEnergyManagementPsConfigurationRequestCall", sourceSmartEnergyManagementPsConfigurationRequestCall), sourceSmartEnergyManagementPsConfigurationRequestCall, (this.smartEnergyManagementPsConfigurationRequestCall!= null)));
                    copy.setSmartEnergyManagementPsConfigurationRequestCall(copySmartEnergyManagementPsConfigurationRequestCall);
                } else {
                    if (smartEnergyManagementPsConfigurationRequestCallShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.smartEnergyManagementPsConfigurationRequestCall = null;
                    }
                }
            }
            {
                Boolean smartEnergyManagementPsDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.smartEnergyManagementPsData!= null));
                if (smartEnergyManagementPsDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    SmartEnergyManagementPsDataType sourceSmartEnergyManagementPsData;
                    sourceSmartEnergyManagementPsData = this.getSmartEnergyManagementPsData();
                    SmartEnergyManagementPsDataType copySmartEnergyManagementPsData = ((SmartEnergyManagementPsDataType) strategy.copy(LocatorUtils.property(locator, "smartEnergyManagementPsData", sourceSmartEnergyManagementPsData), sourceSmartEnergyManagementPsData, (this.smartEnergyManagementPsData!= null)));
                    copy.setSmartEnergyManagementPsData(copySmartEnergyManagementPsData);
                } else {
                    if (smartEnergyManagementPsDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.smartEnergyManagementPsData = null;
                    }
                }
            }
            {
                Boolean smartEnergyManagementPsPriceCalculationRequestCallShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.smartEnergyManagementPsPriceCalculationRequestCall!= null));
                if (smartEnergyManagementPsPriceCalculationRequestCallShouldBeCopiedAndSet == Boolean.TRUE) {
                    SmartEnergyManagementPsPriceCalculationRequestCallType sourceSmartEnergyManagementPsPriceCalculationRequestCall;
                    sourceSmartEnergyManagementPsPriceCalculationRequestCall = this.getSmartEnergyManagementPsPriceCalculationRequestCall();
                    SmartEnergyManagementPsPriceCalculationRequestCallType copySmartEnergyManagementPsPriceCalculationRequestCall = ((SmartEnergyManagementPsPriceCalculationRequestCallType) strategy.copy(LocatorUtils.property(locator, "smartEnergyManagementPsPriceCalculationRequestCall", sourceSmartEnergyManagementPsPriceCalculationRequestCall), sourceSmartEnergyManagementPsPriceCalculationRequestCall, (this.smartEnergyManagementPsPriceCalculationRequestCall!= null)));
                    copy.setSmartEnergyManagementPsPriceCalculationRequestCall(copySmartEnergyManagementPsPriceCalculationRequestCall);
                } else {
                    if (smartEnergyManagementPsPriceCalculationRequestCallShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.smartEnergyManagementPsPriceCalculationRequestCall = null;
                    }
                }
            }
            {
                Boolean smartEnergyManagementPsPriceDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.smartEnergyManagementPsPriceData!= null));
                if (smartEnergyManagementPsPriceDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    SmartEnergyManagementPsPriceDataType sourceSmartEnergyManagementPsPriceData;
                    sourceSmartEnergyManagementPsPriceData = this.getSmartEnergyManagementPsPriceData();
                    SmartEnergyManagementPsPriceDataType copySmartEnergyManagementPsPriceData = ((SmartEnergyManagementPsPriceDataType) strategy.copy(LocatorUtils.property(locator, "smartEnergyManagementPsPriceData", sourceSmartEnergyManagementPsPriceData), sourceSmartEnergyManagementPsPriceData, (this.smartEnergyManagementPsPriceData!= null)));
                    copy.setSmartEnergyManagementPsPriceData(copySmartEnergyManagementPsPriceData);
                } else {
                    if (smartEnergyManagementPsPriceDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.smartEnergyManagementPsPriceData = null;
                    }
                }
            }
            {
                Boolean specificationVersionListDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.specificationVersionListData!= null));
                if (specificationVersionListDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    SpecificationVersionListDataType sourceSpecificationVersionListData;
                    sourceSpecificationVersionListData = this.getSpecificationVersionListData();
                    SpecificationVersionListDataType copySpecificationVersionListData = ((SpecificationVersionListDataType) strategy.copy(LocatorUtils.property(locator, "specificationVersionListData", sourceSpecificationVersionListData), sourceSpecificationVersionListData, (this.specificationVersionListData!= null)));
                    copy.setSpecificationVersionListData(copySpecificationVersionListData);
                } else {
                    if (specificationVersionListDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.specificationVersionListData = null;
                    }
                }
            }
            {
                Boolean stateInformationListDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.stateInformationListData!= null));
                if (stateInformationListDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    StateInformationListDataType sourceStateInformationListData;
                    sourceStateInformationListData = this.getStateInformationListData();
                    StateInformationListDataType copyStateInformationListData = ((StateInformationListDataType) strategy.copy(LocatorUtils.property(locator, "stateInformationListData", sourceStateInformationListData), sourceStateInformationListData, (this.stateInformationListData!= null)));
                    copy.setStateInformationListData(copyStateInformationListData);
                } else {
                    if (stateInformationListDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.stateInformationListData = null;
                    }
                }
            }
            {
                Boolean subscriptionManagementDeleteCallShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.subscriptionManagementDeleteCall!= null));
                if (subscriptionManagementDeleteCallShouldBeCopiedAndSet == Boolean.TRUE) {
                    SubscriptionManagementDeleteCallType sourceSubscriptionManagementDeleteCall;
                    sourceSubscriptionManagementDeleteCall = this.getSubscriptionManagementDeleteCall();
                    SubscriptionManagementDeleteCallType copySubscriptionManagementDeleteCall = ((SubscriptionManagementDeleteCallType) strategy.copy(LocatorUtils.property(locator, "subscriptionManagementDeleteCall", sourceSubscriptionManagementDeleteCall), sourceSubscriptionManagementDeleteCall, (this.subscriptionManagementDeleteCall!= null)));
                    copy.setSubscriptionManagementDeleteCall(copySubscriptionManagementDeleteCall);
                } else {
                    if (subscriptionManagementDeleteCallShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.subscriptionManagementDeleteCall = null;
                    }
                }
            }
            {
                Boolean subscriptionManagementEntryListDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.subscriptionManagementEntryListData!= null));
                if (subscriptionManagementEntryListDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    SubscriptionManagementEntryListDataType sourceSubscriptionManagementEntryListData;
                    sourceSubscriptionManagementEntryListData = this.getSubscriptionManagementEntryListData();
                    SubscriptionManagementEntryListDataType copySubscriptionManagementEntryListData = ((SubscriptionManagementEntryListDataType) strategy.copy(LocatorUtils.property(locator, "subscriptionManagementEntryListData", sourceSubscriptionManagementEntryListData), sourceSubscriptionManagementEntryListData, (this.subscriptionManagementEntryListData!= null)));
                    copy.setSubscriptionManagementEntryListData(copySubscriptionManagementEntryListData);
                } else {
                    if (subscriptionManagementEntryListDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.subscriptionManagementEntryListData = null;
                    }
                }
            }
            {
                Boolean subscriptionManagementRequestCallShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.subscriptionManagementRequestCall!= null));
                if (subscriptionManagementRequestCallShouldBeCopiedAndSet == Boolean.TRUE) {
                    SubscriptionManagementRequestCallType sourceSubscriptionManagementRequestCall;
                    sourceSubscriptionManagementRequestCall = this.getSubscriptionManagementRequestCall();
                    SubscriptionManagementRequestCallType copySubscriptionManagementRequestCall = ((SubscriptionManagementRequestCallType) strategy.copy(LocatorUtils.property(locator, "subscriptionManagementRequestCall", sourceSubscriptionManagementRequestCall), sourceSubscriptionManagementRequestCall, (this.subscriptionManagementRequestCall!= null)));
                    copy.setSubscriptionManagementRequestCall(copySubscriptionManagementRequestCall);
                } else {
                    if (subscriptionManagementRequestCallShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.subscriptionManagementRequestCall = null;
                    }
                }
            }
            {
                Boolean supplyConditionDescriptionListDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.supplyConditionDescriptionListData!= null));
                if (supplyConditionDescriptionListDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    SupplyConditionDescriptionListDataType sourceSupplyConditionDescriptionListData;
                    sourceSupplyConditionDescriptionListData = this.getSupplyConditionDescriptionListData();
                    SupplyConditionDescriptionListDataType copySupplyConditionDescriptionListData = ((SupplyConditionDescriptionListDataType) strategy.copy(LocatorUtils.property(locator, "supplyConditionDescriptionListData", sourceSupplyConditionDescriptionListData), sourceSupplyConditionDescriptionListData, (this.supplyConditionDescriptionListData!= null)));
                    copy.setSupplyConditionDescriptionListData(copySupplyConditionDescriptionListData);
                } else {
                    if (supplyConditionDescriptionListDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.supplyConditionDescriptionListData = null;
                    }
                }
            }
            {
                Boolean supplyConditionListDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.supplyConditionListData!= null));
                if (supplyConditionListDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    SupplyConditionListDataType sourceSupplyConditionListData;
                    sourceSupplyConditionListData = this.getSupplyConditionListData();
                    SupplyConditionListDataType copySupplyConditionListData = ((SupplyConditionListDataType) strategy.copy(LocatorUtils.property(locator, "supplyConditionListData", sourceSupplyConditionListData), sourceSupplyConditionListData, (this.supplyConditionListData!= null)));
                    copy.setSupplyConditionListData(copySupplyConditionListData);
                } else {
                    if (supplyConditionListDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.supplyConditionListData = null;
                    }
                }
            }
            {
                Boolean supplyConditionThresholdRelationListDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.supplyConditionThresholdRelationListData!= null));
                if (supplyConditionThresholdRelationListDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    SupplyConditionThresholdRelationListDataType sourceSupplyConditionThresholdRelationListData;
                    sourceSupplyConditionThresholdRelationListData = this.getSupplyConditionThresholdRelationListData();
                    SupplyConditionThresholdRelationListDataType copySupplyConditionThresholdRelationListData = ((SupplyConditionThresholdRelationListDataType) strategy.copy(LocatorUtils.property(locator, "supplyConditionThresholdRelationListData", sourceSupplyConditionThresholdRelationListData), sourceSupplyConditionThresholdRelationListData, (this.supplyConditionThresholdRelationListData!= null)));
                    copy.setSupplyConditionThresholdRelationListData(copySupplyConditionThresholdRelationListData);
                } else {
                    if (supplyConditionThresholdRelationListDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.supplyConditionThresholdRelationListData = null;
                    }
                }
            }
            {
                Boolean tariffBoundaryRelationListDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.tariffBoundaryRelationListData!= null));
                if (tariffBoundaryRelationListDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    TariffBoundaryRelationListDataType sourceTariffBoundaryRelationListData;
                    sourceTariffBoundaryRelationListData = this.getTariffBoundaryRelationListData();
                    TariffBoundaryRelationListDataType copyTariffBoundaryRelationListData = ((TariffBoundaryRelationListDataType) strategy.copy(LocatorUtils.property(locator, "tariffBoundaryRelationListData", sourceTariffBoundaryRelationListData), sourceTariffBoundaryRelationListData, (this.tariffBoundaryRelationListData!= null)));
                    copy.setTariffBoundaryRelationListData(copyTariffBoundaryRelationListData);
                } else {
                    if (tariffBoundaryRelationListDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.tariffBoundaryRelationListData = null;
                    }
                }
            }
            {
                Boolean tariffDescriptionListDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.tariffDescriptionListData!= null));
                if (tariffDescriptionListDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    TariffDescriptionListDataType sourceTariffDescriptionListData;
                    sourceTariffDescriptionListData = this.getTariffDescriptionListData();
                    TariffDescriptionListDataType copyTariffDescriptionListData = ((TariffDescriptionListDataType) strategy.copy(LocatorUtils.property(locator, "tariffDescriptionListData", sourceTariffDescriptionListData), sourceTariffDescriptionListData, (this.tariffDescriptionListData!= null)));
                    copy.setTariffDescriptionListData(copyTariffDescriptionListData);
                } else {
                    if (tariffDescriptionListDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.tariffDescriptionListData = null;
                    }
                }
            }
            {
                Boolean tariffListDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.tariffListData!= null));
                if (tariffListDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    TariffListDataType sourceTariffListData;
                    sourceTariffListData = this.getTariffListData();
                    TariffListDataType copyTariffListData = ((TariffListDataType) strategy.copy(LocatorUtils.property(locator, "tariffListData", sourceTariffListData), sourceTariffListData, (this.tariffListData!= null)));
                    copy.setTariffListData(copyTariffListData);
                } else {
                    if (tariffListDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.tariffListData = null;
                    }
                }
            }
            {
                Boolean tariffOverallConstraintsDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.tariffOverallConstraintsData!= null));
                if (tariffOverallConstraintsDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    TariffOverallConstraintsDataType sourceTariffOverallConstraintsData;
                    sourceTariffOverallConstraintsData = this.getTariffOverallConstraintsData();
                    TariffOverallConstraintsDataType copyTariffOverallConstraintsData = ((TariffOverallConstraintsDataType) strategy.copy(LocatorUtils.property(locator, "tariffOverallConstraintsData", sourceTariffOverallConstraintsData), sourceTariffOverallConstraintsData, (this.tariffOverallConstraintsData!= null)));
                    copy.setTariffOverallConstraintsData(copyTariffOverallConstraintsData);
                } else {
                    if (tariffOverallConstraintsDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.tariffOverallConstraintsData = null;
                    }
                }
            }
            {
                Boolean tariffTierRelationListDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.tariffTierRelationListData!= null));
                if (tariffTierRelationListDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    TariffTierRelationListDataType sourceTariffTierRelationListData;
                    sourceTariffTierRelationListData = this.getTariffTierRelationListData();
                    TariffTierRelationListDataType copyTariffTierRelationListData = ((TariffTierRelationListDataType) strategy.copy(LocatorUtils.property(locator, "tariffTierRelationListData", sourceTariffTierRelationListData), sourceTariffTierRelationListData, (this.tariffTierRelationListData!= null)));
                    copy.setTariffTierRelationListData(copyTariffTierRelationListData);
                } else {
                    if (tariffTierRelationListDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.tariffTierRelationListData = null;
                    }
                }
            }
            {
                Boolean taskManagementJobDescriptionListDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.taskManagementJobDescriptionListData!= null));
                if (taskManagementJobDescriptionListDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    TaskManagementJobDescriptionListDataType sourceTaskManagementJobDescriptionListData;
                    sourceTaskManagementJobDescriptionListData = this.getTaskManagementJobDescriptionListData();
                    TaskManagementJobDescriptionListDataType copyTaskManagementJobDescriptionListData = ((TaskManagementJobDescriptionListDataType) strategy.copy(LocatorUtils.property(locator, "taskManagementJobDescriptionListData", sourceTaskManagementJobDescriptionListData), sourceTaskManagementJobDescriptionListData, (this.taskManagementJobDescriptionListData!= null)));
                    copy.setTaskManagementJobDescriptionListData(copyTaskManagementJobDescriptionListData);
                } else {
                    if (taskManagementJobDescriptionListDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.taskManagementJobDescriptionListData = null;
                    }
                }
            }
            {
                Boolean taskManagementJobListDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.taskManagementJobListData!= null));
                if (taskManagementJobListDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    TaskManagementJobListDataType sourceTaskManagementJobListData;
                    sourceTaskManagementJobListData = this.getTaskManagementJobListData();
                    TaskManagementJobListDataType copyTaskManagementJobListData = ((TaskManagementJobListDataType) strategy.copy(LocatorUtils.property(locator, "taskManagementJobListData", sourceTaskManagementJobListData), sourceTaskManagementJobListData, (this.taskManagementJobListData!= null)));
                    copy.setTaskManagementJobListData(copyTaskManagementJobListData);
                } else {
                    if (taskManagementJobListDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.taskManagementJobListData = null;
                    }
                }
            }
            {
                Boolean taskManagementJobRelationListDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.taskManagementJobRelationListData!= null));
                if (taskManagementJobRelationListDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    TaskManagementJobRelationListDataType sourceTaskManagementJobRelationListData;
                    sourceTaskManagementJobRelationListData = this.getTaskManagementJobRelationListData();
                    TaskManagementJobRelationListDataType copyTaskManagementJobRelationListData = ((TaskManagementJobRelationListDataType) strategy.copy(LocatorUtils.property(locator, "taskManagementJobRelationListData", sourceTaskManagementJobRelationListData), sourceTaskManagementJobRelationListData, (this.taskManagementJobRelationListData!= null)));
                    copy.setTaskManagementJobRelationListData(copyTaskManagementJobRelationListData);
                } else {
                    if (taskManagementJobRelationListDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.taskManagementJobRelationListData = null;
                    }
                }
            }
            {
                Boolean taskManagementOverviewDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.taskManagementOverviewData!= null));
                if (taskManagementOverviewDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    TaskManagementOverviewDataType sourceTaskManagementOverviewData;
                    sourceTaskManagementOverviewData = this.getTaskManagementOverviewData();
                    TaskManagementOverviewDataType copyTaskManagementOverviewData = ((TaskManagementOverviewDataType) strategy.copy(LocatorUtils.property(locator, "taskManagementOverviewData", sourceTaskManagementOverviewData), sourceTaskManagementOverviewData, (this.taskManagementOverviewData!= null)));
                    copy.setTaskManagementOverviewData(copyTaskManagementOverviewData);
                } else {
                    if (taskManagementOverviewDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.taskManagementOverviewData = null;
                    }
                }
            }
            {
                Boolean thresholdConstraintsListDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.thresholdConstraintsListData!= null));
                if (thresholdConstraintsListDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    ThresholdConstraintsListDataType sourceThresholdConstraintsListData;
                    sourceThresholdConstraintsListData = this.getThresholdConstraintsListData();
                    ThresholdConstraintsListDataType copyThresholdConstraintsListData = ((ThresholdConstraintsListDataType) strategy.copy(LocatorUtils.property(locator, "thresholdConstraintsListData", sourceThresholdConstraintsListData), sourceThresholdConstraintsListData, (this.thresholdConstraintsListData!= null)));
                    copy.setThresholdConstraintsListData(copyThresholdConstraintsListData);
                } else {
                    if (thresholdConstraintsListDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.thresholdConstraintsListData = null;
                    }
                }
            }
            {
                Boolean thresholdDescriptionListDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.thresholdDescriptionListData!= null));
                if (thresholdDescriptionListDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    ThresholdDescriptionListDataType sourceThresholdDescriptionListData;
                    sourceThresholdDescriptionListData = this.getThresholdDescriptionListData();
                    ThresholdDescriptionListDataType copyThresholdDescriptionListData = ((ThresholdDescriptionListDataType) strategy.copy(LocatorUtils.property(locator, "thresholdDescriptionListData", sourceThresholdDescriptionListData), sourceThresholdDescriptionListData, (this.thresholdDescriptionListData!= null)));
                    copy.setThresholdDescriptionListData(copyThresholdDescriptionListData);
                } else {
                    if (thresholdDescriptionListDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.thresholdDescriptionListData = null;
                    }
                }
            }
            {
                Boolean thresholdListDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.thresholdListData!= null));
                if (thresholdListDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    ThresholdListDataType sourceThresholdListData;
                    sourceThresholdListData = this.getThresholdListData();
                    ThresholdListDataType copyThresholdListData = ((ThresholdListDataType) strategy.copy(LocatorUtils.property(locator, "thresholdListData", sourceThresholdListData), sourceThresholdListData, (this.thresholdListData!= null)));
                    copy.setThresholdListData(copyThresholdListData);
                } else {
                    if (thresholdListDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.thresholdListData = null;
                    }
                }
            }
            {
                Boolean tierBoundaryDescriptionListDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.tierBoundaryDescriptionListData!= null));
                if (tierBoundaryDescriptionListDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    TierBoundaryDescriptionListDataType sourceTierBoundaryDescriptionListData;
                    sourceTierBoundaryDescriptionListData = this.getTierBoundaryDescriptionListData();
                    TierBoundaryDescriptionListDataType copyTierBoundaryDescriptionListData = ((TierBoundaryDescriptionListDataType) strategy.copy(LocatorUtils.property(locator, "tierBoundaryDescriptionListData", sourceTierBoundaryDescriptionListData), sourceTierBoundaryDescriptionListData, (this.tierBoundaryDescriptionListData!= null)));
                    copy.setTierBoundaryDescriptionListData(copyTierBoundaryDescriptionListData);
                } else {
                    if (tierBoundaryDescriptionListDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.tierBoundaryDescriptionListData = null;
                    }
                }
            }
            {
                Boolean tierBoundaryListDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.tierBoundaryListData!= null));
                if (tierBoundaryListDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    TierBoundaryListDataType sourceTierBoundaryListData;
                    sourceTierBoundaryListData = this.getTierBoundaryListData();
                    TierBoundaryListDataType copyTierBoundaryListData = ((TierBoundaryListDataType) strategy.copy(LocatorUtils.property(locator, "tierBoundaryListData", sourceTierBoundaryListData), sourceTierBoundaryListData, (this.tierBoundaryListData!= null)));
                    copy.setTierBoundaryListData(copyTierBoundaryListData);
                } else {
                    if (tierBoundaryListDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.tierBoundaryListData = null;
                    }
                }
            }
            {
                Boolean tierDescriptionListDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.tierDescriptionListData!= null));
                if (tierDescriptionListDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    TierDescriptionListDataType sourceTierDescriptionListData;
                    sourceTierDescriptionListData = this.getTierDescriptionListData();
                    TierDescriptionListDataType copyTierDescriptionListData = ((TierDescriptionListDataType) strategy.copy(LocatorUtils.property(locator, "tierDescriptionListData", sourceTierDescriptionListData), sourceTierDescriptionListData, (this.tierDescriptionListData!= null)));
                    copy.setTierDescriptionListData(copyTierDescriptionListData);
                } else {
                    if (tierDescriptionListDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.tierDescriptionListData = null;
                    }
                }
            }
            {
                Boolean tierIncentiveRelationListDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.tierIncentiveRelationListData!= null));
                if (tierIncentiveRelationListDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    TierIncentiveRelationListDataType sourceTierIncentiveRelationListData;
                    sourceTierIncentiveRelationListData = this.getTierIncentiveRelationListData();
                    TierIncentiveRelationListDataType copyTierIncentiveRelationListData = ((TierIncentiveRelationListDataType) strategy.copy(LocatorUtils.property(locator, "tierIncentiveRelationListData", sourceTierIncentiveRelationListData), sourceTierIncentiveRelationListData, (this.tierIncentiveRelationListData!= null)));
                    copy.setTierIncentiveRelationListData(copyTierIncentiveRelationListData);
                } else {
                    if (tierIncentiveRelationListDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.tierIncentiveRelationListData = null;
                    }
                }
            }
            {
                Boolean tierListDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.tierListData!= null));
                if (tierListDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    TierListDataType sourceTierListData;
                    sourceTierListData = this.getTierListData();
                    TierListDataType copyTierListData = ((TierListDataType) strategy.copy(LocatorUtils.property(locator, "tierListData", sourceTierListData), sourceTierListData, (this.tierListData!= null)));
                    copy.setTierListData(copyTierListData);
                } else {
                    if (tierListDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.tierListData = null;
                    }
                }
            }
            {
                Boolean timeDistributorDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.timeDistributorData!= null));
                if (timeDistributorDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    TimeDistributorDataType sourceTimeDistributorData;
                    sourceTimeDistributorData = this.getTimeDistributorData();
                    TimeDistributorDataType copyTimeDistributorData = ((TimeDistributorDataType) strategy.copy(LocatorUtils.property(locator, "timeDistributorData", sourceTimeDistributorData), sourceTimeDistributorData, (this.timeDistributorData!= null)));
                    copy.setTimeDistributorData(copyTimeDistributorData);
                } else {
                    if (timeDistributorDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.timeDistributorData = null;
                    }
                }
            }
            {
                Boolean timeDistributorEnquiryCallShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.timeDistributorEnquiryCall!= null));
                if (timeDistributorEnquiryCallShouldBeCopiedAndSet == Boolean.TRUE) {
                    TimeDistributorEnquiryCallType sourceTimeDistributorEnquiryCall;
                    sourceTimeDistributorEnquiryCall = this.getTimeDistributorEnquiryCall();
                    TimeDistributorEnquiryCallType copyTimeDistributorEnquiryCall = ((TimeDistributorEnquiryCallType) strategy.copy(LocatorUtils.property(locator, "timeDistributorEnquiryCall", sourceTimeDistributorEnquiryCall), sourceTimeDistributorEnquiryCall, (this.timeDistributorEnquiryCall!= null)));
                    copy.setTimeDistributorEnquiryCall(copyTimeDistributorEnquiryCall);
                } else {
                    if (timeDistributorEnquiryCallShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.timeDistributorEnquiryCall = null;
                    }
                }
            }
            {
                Boolean timeInformationDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.timeInformationData!= null));
                if (timeInformationDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    TimeInformationDataType sourceTimeInformationData;
                    sourceTimeInformationData = this.getTimeInformationData();
                    TimeInformationDataType copyTimeInformationData = ((TimeInformationDataType) strategy.copy(LocatorUtils.property(locator, "timeInformationData", sourceTimeInformationData), sourceTimeInformationData, (this.timeInformationData!= null)));
                    copy.setTimeInformationData(copyTimeInformationData);
                } else {
                    if (timeInformationDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.timeInformationData = null;
                    }
                }
            }
            {
                Boolean timePrecisionDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.timePrecisionData!= null));
                if (timePrecisionDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    TimePrecisionDataType sourceTimePrecisionData;
                    sourceTimePrecisionData = this.getTimePrecisionData();
                    TimePrecisionDataType copyTimePrecisionData = ((TimePrecisionDataType) strategy.copy(LocatorUtils.property(locator, "timePrecisionData", sourceTimePrecisionData), sourceTimePrecisionData, (this.timePrecisionData!= null)));
                    copy.setTimePrecisionData(copyTimePrecisionData);
                } else {
                    if (timePrecisionDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.timePrecisionData = null;
                    }
                }
            }
            {
                Boolean timeSeriesConstraintsListDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.timeSeriesConstraintsListData!= null));
                if (timeSeriesConstraintsListDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    TimeSeriesConstraintsListDataType sourceTimeSeriesConstraintsListData;
                    sourceTimeSeriesConstraintsListData = this.getTimeSeriesConstraintsListData();
                    TimeSeriesConstraintsListDataType copyTimeSeriesConstraintsListData = ((TimeSeriesConstraintsListDataType) strategy.copy(LocatorUtils.property(locator, "timeSeriesConstraintsListData", sourceTimeSeriesConstraintsListData), sourceTimeSeriesConstraintsListData, (this.timeSeriesConstraintsListData!= null)));
                    copy.setTimeSeriesConstraintsListData(copyTimeSeriesConstraintsListData);
                } else {
                    if (timeSeriesConstraintsListDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.timeSeriesConstraintsListData = null;
                    }
                }
            }
            {
                Boolean timeSeriesDescriptionListDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.timeSeriesDescriptionListData!= null));
                if (timeSeriesDescriptionListDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    TimeSeriesDescriptionListDataType sourceTimeSeriesDescriptionListData;
                    sourceTimeSeriesDescriptionListData = this.getTimeSeriesDescriptionListData();
                    TimeSeriesDescriptionListDataType copyTimeSeriesDescriptionListData = ((TimeSeriesDescriptionListDataType) strategy.copy(LocatorUtils.property(locator, "timeSeriesDescriptionListData", sourceTimeSeriesDescriptionListData), sourceTimeSeriesDescriptionListData, (this.timeSeriesDescriptionListData!= null)));
                    copy.setTimeSeriesDescriptionListData(copyTimeSeriesDescriptionListData);
                } else {
                    if (timeSeriesDescriptionListDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.timeSeriesDescriptionListData = null;
                    }
                }
            }
            {
                Boolean timeSeriesListDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.timeSeriesListData!= null));
                if (timeSeriesListDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    TimeSeriesListDataType sourceTimeSeriesListData;
                    sourceTimeSeriesListData = this.getTimeSeriesListData();
                    TimeSeriesListDataType copyTimeSeriesListData = ((TimeSeriesListDataType) strategy.copy(LocatorUtils.property(locator, "timeSeriesListData", sourceTimeSeriesListData), sourceTimeSeriesListData, (this.timeSeriesListData!= null)));
                    copy.setTimeSeriesListData(copyTimeSeriesListData);
                } else {
                    if (timeSeriesListDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.timeSeriesListData = null;
                    }
                }
            }
            {
                Boolean timeTableConstraintsListDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.timeTableConstraintsListData!= null));
                if (timeTableConstraintsListDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    TimeTableConstraintsListDataType sourceTimeTableConstraintsListData;
                    sourceTimeTableConstraintsListData = this.getTimeTableConstraintsListData();
                    TimeTableConstraintsListDataType copyTimeTableConstraintsListData = ((TimeTableConstraintsListDataType) strategy.copy(LocatorUtils.property(locator, "timeTableConstraintsListData", sourceTimeTableConstraintsListData), sourceTimeTableConstraintsListData, (this.timeTableConstraintsListData!= null)));
                    copy.setTimeTableConstraintsListData(copyTimeTableConstraintsListData);
                } else {
                    if (timeTableConstraintsListDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.timeTableConstraintsListData = null;
                    }
                }
            }
            {
                Boolean timeTableDescriptionListDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.timeTableDescriptionListData!= null));
                if (timeTableDescriptionListDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    TimeTableDescriptionListDataType sourceTimeTableDescriptionListData;
                    sourceTimeTableDescriptionListData = this.getTimeTableDescriptionListData();
                    TimeTableDescriptionListDataType copyTimeTableDescriptionListData = ((TimeTableDescriptionListDataType) strategy.copy(LocatorUtils.property(locator, "timeTableDescriptionListData", sourceTimeTableDescriptionListData), sourceTimeTableDescriptionListData, (this.timeTableDescriptionListData!= null)));
                    copy.setTimeTableDescriptionListData(copyTimeTableDescriptionListData);
                } else {
                    if (timeTableDescriptionListDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.timeTableDescriptionListData = null;
                    }
                }
            }
            {
                Boolean timeTableListDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.timeTableListData!= null));
                if (timeTableListDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    TimeTableListDataType sourceTimeTableListData;
                    sourceTimeTableListData = this.getTimeTableListData();
                    TimeTableListDataType copyTimeTableListData = ((TimeTableListDataType) strategy.copy(LocatorUtils.property(locator, "timeTableListData", sourceTimeTableListData), sourceTimeTableListData, (this.timeTableListData!= null)));
                    copy.setTimeTableListData(copyTimeTableListData);
                } else {
                    if (timeTableListDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.timeTableListData = null;
                    }
                }
            }
            {
                Boolean useCaseInformationListDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.useCaseInformationListData!= null));
                if (useCaseInformationListDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    UseCaseInformationListDataType sourceUseCaseInformationListData;
                    sourceUseCaseInformationListData = this.getUseCaseInformationListData();
                    UseCaseInformationListDataType copyUseCaseInformationListData = ((UseCaseInformationListDataType) strategy.copy(LocatorUtils.property(locator, "useCaseInformationListData", sourceUseCaseInformationListData), sourceUseCaseInformationListData, (this.useCaseInformationListData!= null)));
                    copy.setUseCaseInformationListData(copyUseCaseInformationListData);
                } else {
                    if (useCaseInformationListDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.useCaseInformationListData = null;
                    }
                }
            }
            {
                Boolean manufacturerSpecificExtensionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.manufacturerSpecificExtension!= null));
                if (manufacturerSpecificExtensionShouldBeCopiedAndSet == Boolean.TRUE) {
                    byte[] sourceManufacturerSpecificExtension;
                    sourceManufacturerSpecificExtension = this.getManufacturerSpecificExtension();
                    byte[] copyManufacturerSpecificExtension = ((byte[]) strategy.copy(LocatorUtils.property(locator, "manufacturerSpecificExtension", sourceManufacturerSpecificExtension), sourceManufacturerSpecificExtension, (this.manufacturerSpecificExtension!= null)));
                    copy.setManufacturerSpecificExtension(copyManufacturerSpecificExtension);
                } else {
                    if (manufacturerSpecificExtensionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.manufacturerSpecificExtension = null;
                    }
                }
            }
            {
                Boolean lastUpdateAtShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.lastUpdateAt!= null));
                if (lastUpdateAtShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceLastUpdateAt;
                    sourceLastUpdateAt = this.getLastUpdateAt();
                    String copyLastUpdateAt = ((String) strategy.copy(LocatorUtils.property(locator, "lastUpdateAt", sourceLastUpdateAt), sourceLastUpdateAt, (this.lastUpdateAt!= null)));
                    copy.setLastUpdateAt(copyLastUpdateAt);
                } else {
                    if (lastUpdateAtShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.lastUpdateAt = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new CmdType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final CmdType that = ((CmdType) object);
        {
            String leftFunction;
            leftFunction = this.getFunction();
            String rightFunction;
            rightFunction = that.getFunction();
            if (this.function!= null) {
                if (that.function!= null) {
                    if (!leftFunction.equals(rightFunction)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.function!= null) {
                    return false;
                }
            }
        }
        {
            List<FilterType> leftFilter;
            leftFilter = (((this.filter!= null)&&(!this.filter.isEmpty()))?this.getFilter():null);
            List<FilterType> rightFilter;
            rightFilter = (((that.filter!= null)&&(!that.filter.isEmpty()))?that.getFilter():null);
            if ((this.filter!= null)&&(!this.filter.isEmpty())) {
                if ((that.filter!= null)&&(!that.filter.isEmpty())) {
                    if (!leftFilter.equals(rightFilter)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.filter!= null)&&(!that.filter.isEmpty())) {
                    return false;
                }
            }
        }
        {
            ActuatorLevelDataType leftActuatorLevelData;
            leftActuatorLevelData = this.getActuatorLevelData();
            ActuatorLevelDataType rightActuatorLevelData;
            rightActuatorLevelData = that.getActuatorLevelData();
            if (this.actuatorLevelData!= null) {
                if (that.actuatorLevelData!= null) {
                    if (!leftActuatorLevelData.equals(rightActuatorLevelData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.actuatorLevelData!= null) {
                    return false;
                }
            }
        }
        {
            ActuatorLevelDescriptionDataType leftActuatorLevelDescriptionData;
            leftActuatorLevelDescriptionData = this.getActuatorLevelDescriptionData();
            ActuatorLevelDescriptionDataType rightActuatorLevelDescriptionData;
            rightActuatorLevelDescriptionData = that.getActuatorLevelDescriptionData();
            if (this.actuatorLevelDescriptionData!= null) {
                if (that.actuatorLevelDescriptionData!= null) {
                    if (!leftActuatorLevelDescriptionData.equals(rightActuatorLevelDescriptionData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.actuatorLevelDescriptionData!= null) {
                    return false;
                }
            }
        }
        {
            ActuatorSwitchDataType leftActuatorSwitchData;
            leftActuatorSwitchData = this.getActuatorSwitchData();
            ActuatorSwitchDataType rightActuatorSwitchData;
            rightActuatorSwitchData = that.getActuatorSwitchData();
            if (this.actuatorSwitchData!= null) {
                if (that.actuatorSwitchData!= null) {
                    if (!leftActuatorSwitchData.equals(rightActuatorSwitchData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.actuatorSwitchData!= null) {
                    return false;
                }
            }
        }
        {
            ActuatorSwitchDescriptionDataType leftActuatorSwitchDescriptionData;
            leftActuatorSwitchDescriptionData = this.getActuatorSwitchDescriptionData();
            ActuatorSwitchDescriptionDataType rightActuatorSwitchDescriptionData;
            rightActuatorSwitchDescriptionData = that.getActuatorSwitchDescriptionData();
            if (this.actuatorSwitchDescriptionData!= null) {
                if (that.actuatorSwitchDescriptionData!= null) {
                    if (!leftActuatorSwitchDescriptionData.equals(rightActuatorSwitchDescriptionData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.actuatorSwitchDescriptionData!= null) {
                    return false;
                }
            }
        }
        {
            AlarmListDataType leftAlarmListData;
            leftAlarmListData = this.getAlarmListData();
            AlarmListDataType rightAlarmListData;
            rightAlarmListData = that.getAlarmListData();
            if (this.alarmListData!= null) {
                if (that.alarmListData!= null) {
                    if (!leftAlarmListData.equals(rightAlarmListData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.alarmListData!= null) {
                    return false;
                }
            }
        }
        {
            BillConstraintsListDataType leftBillConstraintsListData;
            leftBillConstraintsListData = this.getBillConstraintsListData();
            BillConstraintsListDataType rightBillConstraintsListData;
            rightBillConstraintsListData = that.getBillConstraintsListData();
            if (this.billConstraintsListData!= null) {
                if (that.billConstraintsListData!= null) {
                    if (!leftBillConstraintsListData.equals(rightBillConstraintsListData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.billConstraintsListData!= null) {
                    return false;
                }
            }
        }
        {
            BillDescriptionListDataType leftBillDescriptionListData;
            leftBillDescriptionListData = this.getBillDescriptionListData();
            BillDescriptionListDataType rightBillDescriptionListData;
            rightBillDescriptionListData = that.getBillDescriptionListData();
            if (this.billDescriptionListData!= null) {
                if (that.billDescriptionListData!= null) {
                    if (!leftBillDescriptionListData.equals(rightBillDescriptionListData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.billDescriptionListData!= null) {
                    return false;
                }
            }
        }
        {
            BillListDataType leftBillListData;
            leftBillListData = this.getBillListData();
            BillListDataType rightBillListData;
            rightBillListData = that.getBillListData();
            if (this.billListData!= null) {
                if (that.billListData!= null) {
                    if (!leftBillListData.equals(rightBillListData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.billListData!= null) {
                    return false;
                }
            }
        }
        {
            BindingManagementDeleteCallType leftBindingManagementDeleteCall;
            leftBindingManagementDeleteCall = this.getBindingManagementDeleteCall();
            BindingManagementDeleteCallType rightBindingManagementDeleteCall;
            rightBindingManagementDeleteCall = that.getBindingManagementDeleteCall();
            if (this.bindingManagementDeleteCall!= null) {
                if (that.bindingManagementDeleteCall!= null) {
                    if (!leftBindingManagementDeleteCall.equals(rightBindingManagementDeleteCall)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.bindingManagementDeleteCall!= null) {
                    return false;
                }
            }
        }
        {
            BindingManagementEntryListDataType leftBindingManagementEntryListData;
            leftBindingManagementEntryListData = this.getBindingManagementEntryListData();
            BindingManagementEntryListDataType rightBindingManagementEntryListData;
            rightBindingManagementEntryListData = that.getBindingManagementEntryListData();
            if (this.bindingManagementEntryListData!= null) {
                if (that.bindingManagementEntryListData!= null) {
                    if (!leftBindingManagementEntryListData.equals(rightBindingManagementEntryListData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.bindingManagementEntryListData!= null) {
                    return false;
                }
            }
        }
        {
            BindingManagementRequestCallType leftBindingManagementRequestCall;
            leftBindingManagementRequestCall = this.getBindingManagementRequestCall();
            BindingManagementRequestCallType rightBindingManagementRequestCall;
            rightBindingManagementRequestCall = that.getBindingManagementRequestCall();
            if (this.bindingManagementRequestCall!= null) {
                if (that.bindingManagementRequestCall!= null) {
                    if (!leftBindingManagementRequestCall.equals(rightBindingManagementRequestCall)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.bindingManagementRequestCall!= null) {
                    return false;
                }
            }
        }
        {
            CommodityListDataType leftCommodityListData;
            leftCommodityListData = this.getCommodityListData();
            CommodityListDataType rightCommodityListData;
            rightCommodityListData = that.getCommodityListData();
            if (this.commodityListData!= null) {
                if (that.commodityListData!= null) {
                    if (!leftCommodityListData.equals(rightCommodityListData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.commodityListData!= null) {
                    return false;
                }
            }
        }
        {
            DataTunnelingCallType leftDataTunnelingCall;
            leftDataTunnelingCall = this.getDataTunnelingCall();
            DataTunnelingCallType rightDataTunnelingCall;
            rightDataTunnelingCall = that.getDataTunnelingCall();
            if (this.dataTunnelingCall!= null) {
                if (that.dataTunnelingCall!= null) {
                    if (!leftDataTunnelingCall.equals(rightDataTunnelingCall)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.dataTunnelingCall!= null) {
                    return false;
                }
            }
        }
        {
            DeviceClassificationManufacturerDataType leftDeviceClassificationManufacturerData;
            leftDeviceClassificationManufacturerData = this.getDeviceClassificationManufacturerData();
            DeviceClassificationManufacturerDataType rightDeviceClassificationManufacturerData;
            rightDeviceClassificationManufacturerData = that.getDeviceClassificationManufacturerData();
            if (this.deviceClassificationManufacturerData!= null) {
                if (that.deviceClassificationManufacturerData!= null) {
                    if (!leftDeviceClassificationManufacturerData.equals(rightDeviceClassificationManufacturerData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.deviceClassificationManufacturerData!= null) {
                    return false;
                }
            }
        }
        {
            DeviceClassificationUserDataType leftDeviceClassificationUserData;
            leftDeviceClassificationUserData = this.getDeviceClassificationUserData();
            DeviceClassificationUserDataType rightDeviceClassificationUserData;
            rightDeviceClassificationUserData = that.getDeviceClassificationUserData();
            if (this.deviceClassificationUserData!= null) {
                if (that.deviceClassificationUserData!= null) {
                    if (!leftDeviceClassificationUserData.equals(rightDeviceClassificationUserData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.deviceClassificationUserData!= null) {
                    return false;
                }
            }
        }
        {
            DeviceConfigurationKeyValueConstraintsListDataType leftDeviceConfigurationKeyValueConstraintsListData;
            leftDeviceConfigurationKeyValueConstraintsListData = this.getDeviceConfigurationKeyValueConstraintsListData();
            DeviceConfigurationKeyValueConstraintsListDataType rightDeviceConfigurationKeyValueConstraintsListData;
            rightDeviceConfigurationKeyValueConstraintsListData = that.getDeviceConfigurationKeyValueConstraintsListData();
            if (this.deviceConfigurationKeyValueConstraintsListData!= null) {
                if (that.deviceConfigurationKeyValueConstraintsListData!= null) {
                    if (!leftDeviceConfigurationKeyValueConstraintsListData.equals(rightDeviceConfigurationKeyValueConstraintsListData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.deviceConfigurationKeyValueConstraintsListData!= null) {
                    return false;
                }
            }
        }
        {
            DeviceConfigurationKeyValueDescriptionListDataType leftDeviceConfigurationKeyValueDescriptionListData;
            leftDeviceConfigurationKeyValueDescriptionListData = this.getDeviceConfigurationKeyValueDescriptionListData();
            DeviceConfigurationKeyValueDescriptionListDataType rightDeviceConfigurationKeyValueDescriptionListData;
            rightDeviceConfigurationKeyValueDescriptionListData = that.getDeviceConfigurationKeyValueDescriptionListData();
            if (this.deviceConfigurationKeyValueDescriptionListData!= null) {
                if (that.deviceConfigurationKeyValueDescriptionListData!= null) {
                    if (!leftDeviceConfigurationKeyValueDescriptionListData.equals(rightDeviceConfigurationKeyValueDescriptionListData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.deviceConfigurationKeyValueDescriptionListData!= null) {
                    return false;
                }
            }
        }
        {
            DeviceConfigurationKeyValueListDataType leftDeviceConfigurationKeyValueListData;
            leftDeviceConfigurationKeyValueListData = this.getDeviceConfigurationKeyValueListData();
            DeviceConfigurationKeyValueListDataType rightDeviceConfigurationKeyValueListData;
            rightDeviceConfigurationKeyValueListData = that.getDeviceConfigurationKeyValueListData();
            if (this.deviceConfigurationKeyValueListData!= null) {
                if (that.deviceConfigurationKeyValueListData!= null) {
                    if (!leftDeviceConfigurationKeyValueListData.equals(rightDeviceConfigurationKeyValueListData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.deviceConfigurationKeyValueListData!= null) {
                    return false;
                }
            }
        }
        {
            DeviceDiagnosisHeartbeatDataType leftDeviceDiagnosisHeartbeatData;
            leftDeviceDiagnosisHeartbeatData = this.getDeviceDiagnosisHeartbeatData();
            DeviceDiagnosisHeartbeatDataType rightDeviceDiagnosisHeartbeatData;
            rightDeviceDiagnosisHeartbeatData = that.getDeviceDiagnosisHeartbeatData();
            if (this.deviceDiagnosisHeartbeatData!= null) {
                if (that.deviceDiagnosisHeartbeatData!= null) {
                    if (!leftDeviceDiagnosisHeartbeatData.equals(rightDeviceDiagnosisHeartbeatData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.deviceDiagnosisHeartbeatData!= null) {
                    return false;
                }
            }
        }
        {
            DeviceDiagnosisServiceDataType leftDeviceDiagnosisServiceData;
            leftDeviceDiagnosisServiceData = this.getDeviceDiagnosisServiceData();
            DeviceDiagnosisServiceDataType rightDeviceDiagnosisServiceData;
            rightDeviceDiagnosisServiceData = that.getDeviceDiagnosisServiceData();
            if (this.deviceDiagnosisServiceData!= null) {
                if (that.deviceDiagnosisServiceData!= null) {
                    if (!leftDeviceDiagnosisServiceData.equals(rightDeviceDiagnosisServiceData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.deviceDiagnosisServiceData!= null) {
                    return false;
                }
            }
        }
        {
            DeviceDiagnosisStateDataType leftDeviceDiagnosisStateData;
            leftDeviceDiagnosisStateData = this.getDeviceDiagnosisStateData();
            DeviceDiagnosisStateDataType rightDeviceDiagnosisStateData;
            rightDeviceDiagnosisStateData = that.getDeviceDiagnosisStateData();
            if (this.deviceDiagnosisStateData!= null) {
                if (that.deviceDiagnosisStateData!= null) {
                    if (!leftDeviceDiagnosisStateData.equals(rightDeviceDiagnosisStateData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.deviceDiagnosisStateData!= null) {
                    return false;
                }
            }
        }
        {
            DirectControlActivityListDataType leftDirectControlActivityListData;
            leftDirectControlActivityListData = this.getDirectControlActivityListData();
            DirectControlActivityListDataType rightDirectControlActivityListData;
            rightDirectControlActivityListData = that.getDirectControlActivityListData();
            if (this.directControlActivityListData!= null) {
                if (that.directControlActivityListData!= null) {
                    if (!leftDirectControlActivityListData.equals(rightDirectControlActivityListData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.directControlActivityListData!= null) {
                    return false;
                }
            }
        }
        {
            DirectControlDescriptionDataType leftDirectControlDescriptionData;
            leftDirectControlDescriptionData = this.getDirectControlDescriptionData();
            DirectControlDescriptionDataType rightDirectControlDescriptionData;
            rightDirectControlDescriptionData = that.getDirectControlDescriptionData();
            if (this.directControlDescriptionData!= null) {
                if (that.directControlDescriptionData!= null) {
                    if (!leftDirectControlDescriptionData.equals(rightDirectControlDescriptionData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.directControlDescriptionData!= null) {
                    return false;
                }
            }
        }
        {
            ElectricalConnectionCharacteristicListDataType leftElectricalConnectionCharacteristicListData;
            leftElectricalConnectionCharacteristicListData = this.getElectricalConnectionCharacteristicListData();
            ElectricalConnectionCharacteristicListDataType rightElectricalConnectionCharacteristicListData;
            rightElectricalConnectionCharacteristicListData = that.getElectricalConnectionCharacteristicListData();
            if (this.electricalConnectionCharacteristicListData!= null) {
                if (that.electricalConnectionCharacteristicListData!= null) {
                    if (!leftElectricalConnectionCharacteristicListData.equals(rightElectricalConnectionCharacteristicListData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.electricalConnectionCharacteristicListData!= null) {
                    return false;
                }
            }
        }
        {
            ElectricalConnectionDescriptionListDataType leftElectricalConnectionDescriptionListData;
            leftElectricalConnectionDescriptionListData = this.getElectricalConnectionDescriptionListData();
            ElectricalConnectionDescriptionListDataType rightElectricalConnectionDescriptionListData;
            rightElectricalConnectionDescriptionListData = that.getElectricalConnectionDescriptionListData();
            if (this.electricalConnectionDescriptionListData!= null) {
                if (that.electricalConnectionDescriptionListData!= null) {
                    if (!leftElectricalConnectionDescriptionListData.equals(rightElectricalConnectionDescriptionListData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.electricalConnectionDescriptionListData!= null) {
                    return false;
                }
            }
        }
        {
            ElectricalConnectionParameterDescriptionListDataType leftElectricalConnectionParameterDescriptionListData;
            leftElectricalConnectionParameterDescriptionListData = this.getElectricalConnectionParameterDescriptionListData();
            ElectricalConnectionParameterDescriptionListDataType rightElectricalConnectionParameterDescriptionListData;
            rightElectricalConnectionParameterDescriptionListData = that.getElectricalConnectionParameterDescriptionListData();
            if (this.electricalConnectionParameterDescriptionListData!= null) {
                if (that.electricalConnectionParameterDescriptionListData!= null) {
                    if (!leftElectricalConnectionParameterDescriptionListData.equals(rightElectricalConnectionParameterDescriptionListData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.electricalConnectionParameterDescriptionListData!= null) {
                    return false;
                }
            }
        }
        {
            ElectricalConnectionPermittedValueSetListDataType leftElectricalConnectionPermittedValueSetListData;
            leftElectricalConnectionPermittedValueSetListData = this.getElectricalConnectionPermittedValueSetListData();
            ElectricalConnectionPermittedValueSetListDataType rightElectricalConnectionPermittedValueSetListData;
            rightElectricalConnectionPermittedValueSetListData = that.getElectricalConnectionPermittedValueSetListData();
            if (this.electricalConnectionPermittedValueSetListData!= null) {
                if (that.electricalConnectionPermittedValueSetListData!= null) {
                    if (!leftElectricalConnectionPermittedValueSetListData.equals(rightElectricalConnectionPermittedValueSetListData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.electricalConnectionPermittedValueSetListData!= null) {
                    return false;
                }
            }
        }
        {
            ElectricalConnectionStateListDataType leftElectricalConnectionStateListData;
            leftElectricalConnectionStateListData = this.getElectricalConnectionStateListData();
            ElectricalConnectionStateListDataType rightElectricalConnectionStateListData;
            rightElectricalConnectionStateListData = that.getElectricalConnectionStateListData();
            if (this.electricalConnectionStateListData!= null) {
                if (that.electricalConnectionStateListData!= null) {
                    if (!leftElectricalConnectionStateListData.equals(rightElectricalConnectionStateListData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.electricalConnectionStateListData!= null) {
                    return false;
                }
            }
        }
        {
            HvacOperationModeDescriptionListDataType leftHvacOperationModeDescriptionListData;
            leftHvacOperationModeDescriptionListData = this.getHvacOperationModeDescriptionListData();
            HvacOperationModeDescriptionListDataType rightHvacOperationModeDescriptionListData;
            rightHvacOperationModeDescriptionListData = that.getHvacOperationModeDescriptionListData();
            if (this.hvacOperationModeDescriptionListData!= null) {
                if (that.hvacOperationModeDescriptionListData!= null) {
                    if (!leftHvacOperationModeDescriptionListData.equals(rightHvacOperationModeDescriptionListData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.hvacOperationModeDescriptionListData!= null) {
                    return false;
                }
            }
        }
        {
            HvacOverrunDescriptionListDataType leftHvacOverrunDescriptionListData;
            leftHvacOverrunDescriptionListData = this.getHvacOverrunDescriptionListData();
            HvacOverrunDescriptionListDataType rightHvacOverrunDescriptionListData;
            rightHvacOverrunDescriptionListData = that.getHvacOverrunDescriptionListData();
            if (this.hvacOverrunDescriptionListData!= null) {
                if (that.hvacOverrunDescriptionListData!= null) {
                    if (!leftHvacOverrunDescriptionListData.equals(rightHvacOverrunDescriptionListData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.hvacOverrunDescriptionListData!= null) {
                    return false;
                }
            }
        }
        {
            HvacOverrunListDataType leftHvacOverrunListData;
            leftHvacOverrunListData = this.getHvacOverrunListData();
            HvacOverrunListDataType rightHvacOverrunListData;
            rightHvacOverrunListData = that.getHvacOverrunListData();
            if (this.hvacOverrunListData!= null) {
                if (that.hvacOverrunListData!= null) {
                    if (!leftHvacOverrunListData.equals(rightHvacOverrunListData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.hvacOverrunListData!= null) {
                    return false;
                }
            }
        }
        {
            HvacSystemFunctionDescriptionListDataType leftHvacSystemFunctionDescriptionListData;
            leftHvacSystemFunctionDescriptionListData = this.getHvacSystemFunctionDescriptionListData();
            HvacSystemFunctionDescriptionListDataType rightHvacSystemFunctionDescriptionListData;
            rightHvacSystemFunctionDescriptionListData = that.getHvacSystemFunctionDescriptionListData();
            if (this.hvacSystemFunctionDescriptionListData!= null) {
                if (that.hvacSystemFunctionDescriptionListData!= null) {
                    if (!leftHvacSystemFunctionDescriptionListData.equals(rightHvacSystemFunctionDescriptionListData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.hvacSystemFunctionDescriptionListData!= null) {
                    return false;
                }
            }
        }
        {
            HvacSystemFunctionListDataType leftHvacSystemFunctionListData;
            leftHvacSystemFunctionListData = this.getHvacSystemFunctionListData();
            HvacSystemFunctionListDataType rightHvacSystemFunctionListData;
            rightHvacSystemFunctionListData = that.getHvacSystemFunctionListData();
            if (this.hvacSystemFunctionListData!= null) {
                if (that.hvacSystemFunctionListData!= null) {
                    if (!leftHvacSystemFunctionListData.equals(rightHvacSystemFunctionListData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.hvacSystemFunctionListData!= null) {
                    return false;
                }
            }
        }
        {
            HvacSystemFunctionOperationModeRelationListDataType leftHvacSystemFunctionOperationModeRelationListData;
            leftHvacSystemFunctionOperationModeRelationListData = this.getHvacSystemFunctionOperationModeRelationListData();
            HvacSystemFunctionOperationModeRelationListDataType rightHvacSystemFunctionOperationModeRelationListData;
            rightHvacSystemFunctionOperationModeRelationListData = that.getHvacSystemFunctionOperationModeRelationListData();
            if (this.hvacSystemFunctionOperationModeRelationListData!= null) {
                if (that.hvacSystemFunctionOperationModeRelationListData!= null) {
                    if (!leftHvacSystemFunctionOperationModeRelationListData.equals(rightHvacSystemFunctionOperationModeRelationListData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.hvacSystemFunctionOperationModeRelationListData!= null) {
                    return false;
                }
            }
        }
        {
            HvacSystemFunctionPowerSequenceRelationListDataType leftHvacSystemFunctionPowerSequenceRelationListData;
            leftHvacSystemFunctionPowerSequenceRelationListData = this.getHvacSystemFunctionPowerSequenceRelationListData();
            HvacSystemFunctionPowerSequenceRelationListDataType rightHvacSystemFunctionPowerSequenceRelationListData;
            rightHvacSystemFunctionPowerSequenceRelationListData = that.getHvacSystemFunctionPowerSequenceRelationListData();
            if (this.hvacSystemFunctionPowerSequenceRelationListData!= null) {
                if (that.hvacSystemFunctionPowerSequenceRelationListData!= null) {
                    if (!leftHvacSystemFunctionPowerSequenceRelationListData.equals(rightHvacSystemFunctionPowerSequenceRelationListData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.hvacSystemFunctionPowerSequenceRelationListData!= null) {
                    return false;
                }
            }
        }
        {
            HvacSystemFunctionSetpointRelationListDataType leftHvacSystemFunctionSetpointRelationListData;
            leftHvacSystemFunctionSetpointRelationListData = this.getHvacSystemFunctionSetpointRelationListData();
            HvacSystemFunctionSetpointRelationListDataType rightHvacSystemFunctionSetpointRelationListData;
            rightHvacSystemFunctionSetpointRelationListData = that.getHvacSystemFunctionSetpointRelationListData();
            if (this.hvacSystemFunctionSetpointRelationListData!= null) {
                if (that.hvacSystemFunctionSetpointRelationListData!= null) {
                    if (!leftHvacSystemFunctionSetpointRelationListData.equals(rightHvacSystemFunctionSetpointRelationListData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.hvacSystemFunctionSetpointRelationListData!= null) {
                    return false;
                }
            }
        }
        {
            IdentificationListDataType leftIdentificationListData;
            leftIdentificationListData = this.getIdentificationListData();
            IdentificationListDataType rightIdentificationListData;
            rightIdentificationListData = that.getIdentificationListData();
            if (this.identificationListData!= null) {
                if (that.identificationListData!= null) {
                    if (!leftIdentificationListData.equals(rightIdentificationListData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.identificationListData!= null) {
                    return false;
                }
            }
        }
        {
            IncentiveDescriptionListDataType leftIncentiveDescriptionListData;
            leftIncentiveDescriptionListData = this.getIncentiveDescriptionListData();
            IncentiveDescriptionListDataType rightIncentiveDescriptionListData;
            rightIncentiveDescriptionListData = that.getIncentiveDescriptionListData();
            if (this.incentiveDescriptionListData!= null) {
                if (that.incentiveDescriptionListData!= null) {
                    if (!leftIncentiveDescriptionListData.equals(rightIncentiveDescriptionListData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.incentiveDescriptionListData!= null) {
                    return false;
                }
            }
        }
        {
            IncentiveListDataType leftIncentiveListData;
            leftIncentiveListData = this.getIncentiveListData();
            IncentiveListDataType rightIncentiveListData;
            rightIncentiveListData = that.getIncentiveListData();
            if (this.incentiveListData!= null) {
                if (that.incentiveListData!= null) {
                    if (!leftIncentiveListData.equals(rightIncentiveListData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.incentiveListData!= null) {
                    return false;
                }
            }
        }
        {
            IncentiveTableConstraintsDataType leftIncentiveTableConstraintsData;
            leftIncentiveTableConstraintsData = this.getIncentiveTableConstraintsData();
            IncentiveTableConstraintsDataType rightIncentiveTableConstraintsData;
            rightIncentiveTableConstraintsData = that.getIncentiveTableConstraintsData();
            if (this.incentiveTableConstraintsData!= null) {
                if (that.incentiveTableConstraintsData!= null) {
                    if (!leftIncentiveTableConstraintsData.equals(rightIncentiveTableConstraintsData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.incentiveTableConstraintsData!= null) {
                    return false;
                }
            }
        }
        {
            IncentiveTableDataType leftIncentiveTableData;
            leftIncentiveTableData = this.getIncentiveTableData();
            IncentiveTableDataType rightIncentiveTableData;
            rightIncentiveTableData = that.getIncentiveTableData();
            if (this.incentiveTableData!= null) {
                if (that.incentiveTableData!= null) {
                    if (!leftIncentiveTableData.equals(rightIncentiveTableData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.incentiveTableData!= null) {
                    return false;
                }
            }
        }
        {
            IncentiveTableDescriptionDataType leftIncentiveTableDescriptionData;
            leftIncentiveTableDescriptionData = this.getIncentiveTableDescriptionData();
            IncentiveTableDescriptionDataType rightIncentiveTableDescriptionData;
            rightIncentiveTableDescriptionData = that.getIncentiveTableDescriptionData();
            if (this.incentiveTableDescriptionData!= null) {
                if (that.incentiveTableDescriptionData!= null) {
                    if (!leftIncentiveTableDescriptionData.equals(rightIncentiveTableDescriptionData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.incentiveTableDescriptionData!= null) {
                    return false;
                }
            }
        }
        {
            LoadControlEventListDataType leftLoadControlEventListData;
            leftLoadControlEventListData = this.getLoadControlEventListData();
            LoadControlEventListDataType rightLoadControlEventListData;
            rightLoadControlEventListData = that.getLoadControlEventListData();
            if (this.loadControlEventListData!= null) {
                if (that.loadControlEventListData!= null) {
                    if (!leftLoadControlEventListData.equals(rightLoadControlEventListData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.loadControlEventListData!= null) {
                    return false;
                }
            }
        }
        {
            LoadControlLimitConstraintsListDataType leftLoadControlLimitConstraintsListData;
            leftLoadControlLimitConstraintsListData = this.getLoadControlLimitConstraintsListData();
            LoadControlLimitConstraintsListDataType rightLoadControlLimitConstraintsListData;
            rightLoadControlLimitConstraintsListData = that.getLoadControlLimitConstraintsListData();
            if (this.loadControlLimitConstraintsListData!= null) {
                if (that.loadControlLimitConstraintsListData!= null) {
                    if (!leftLoadControlLimitConstraintsListData.equals(rightLoadControlLimitConstraintsListData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.loadControlLimitConstraintsListData!= null) {
                    return false;
                }
            }
        }
        {
            LoadControlLimitDescriptionListDataType leftLoadControlLimitDescriptionListData;
            leftLoadControlLimitDescriptionListData = this.getLoadControlLimitDescriptionListData();
            LoadControlLimitDescriptionListDataType rightLoadControlLimitDescriptionListData;
            rightLoadControlLimitDescriptionListData = that.getLoadControlLimitDescriptionListData();
            if (this.loadControlLimitDescriptionListData!= null) {
                if (that.loadControlLimitDescriptionListData!= null) {
                    if (!leftLoadControlLimitDescriptionListData.equals(rightLoadControlLimitDescriptionListData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.loadControlLimitDescriptionListData!= null) {
                    return false;
                }
            }
        }
        {
            LoadControlLimitListDataType leftLoadControlLimitListData;
            leftLoadControlLimitListData = this.getLoadControlLimitListData();
            LoadControlLimitListDataType rightLoadControlLimitListData;
            rightLoadControlLimitListData = that.getLoadControlLimitListData();
            if (this.loadControlLimitListData!= null) {
                if (that.loadControlLimitListData!= null) {
                    if (!leftLoadControlLimitListData.equals(rightLoadControlLimitListData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.loadControlLimitListData!= null) {
                    return false;
                }
            }
        }
        {
            LoadControlNodeDataType leftLoadControlNodeData;
            leftLoadControlNodeData = this.getLoadControlNodeData();
            LoadControlNodeDataType rightLoadControlNodeData;
            rightLoadControlNodeData = that.getLoadControlNodeData();
            if (this.loadControlNodeData!= null) {
                if (that.loadControlNodeData!= null) {
                    if (!leftLoadControlNodeData.equals(rightLoadControlNodeData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.loadControlNodeData!= null) {
                    return false;
                }
            }
        }
        {
            LoadControlStateListDataType leftLoadControlStateListData;
            leftLoadControlStateListData = this.getLoadControlStateListData();
            LoadControlStateListDataType rightLoadControlStateListData;
            rightLoadControlStateListData = that.getLoadControlStateListData();
            if (this.loadControlStateListData!= null) {
                if (that.loadControlStateListData!= null) {
                    if (!leftLoadControlStateListData.equals(rightLoadControlStateListData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.loadControlStateListData!= null) {
                    return false;
                }
            }
        }
        {
            MeasurementConstraintsListDataType leftMeasurementConstraintsListData;
            leftMeasurementConstraintsListData = this.getMeasurementConstraintsListData();
            MeasurementConstraintsListDataType rightMeasurementConstraintsListData;
            rightMeasurementConstraintsListData = that.getMeasurementConstraintsListData();
            if (this.measurementConstraintsListData!= null) {
                if (that.measurementConstraintsListData!= null) {
                    if (!leftMeasurementConstraintsListData.equals(rightMeasurementConstraintsListData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.measurementConstraintsListData!= null) {
                    return false;
                }
            }
        }
        {
            MeasurementDescriptionListDataType leftMeasurementDescriptionListData;
            leftMeasurementDescriptionListData = this.getMeasurementDescriptionListData();
            MeasurementDescriptionListDataType rightMeasurementDescriptionListData;
            rightMeasurementDescriptionListData = that.getMeasurementDescriptionListData();
            if (this.measurementDescriptionListData!= null) {
                if (that.measurementDescriptionListData!= null) {
                    if (!leftMeasurementDescriptionListData.equals(rightMeasurementDescriptionListData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.measurementDescriptionListData!= null) {
                    return false;
                }
            }
        }
        {
            MeasurementListDataType leftMeasurementListData;
            leftMeasurementListData = this.getMeasurementListData();
            MeasurementListDataType rightMeasurementListData;
            rightMeasurementListData = that.getMeasurementListData();
            if (this.measurementListData!= null) {
                if (that.measurementListData!= null) {
                    if (!leftMeasurementListData.equals(rightMeasurementListData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.measurementListData!= null) {
                    return false;
                }
            }
        }
        {
            MeasurementSeriesListDataType leftMeasurementSeriesListData;
            leftMeasurementSeriesListData = this.getMeasurementSeriesListData();
            MeasurementSeriesListDataType rightMeasurementSeriesListData;
            rightMeasurementSeriesListData = that.getMeasurementSeriesListData();
            if (this.measurementSeriesListData!= null) {
                if (that.measurementSeriesListData!= null) {
                    if (!leftMeasurementSeriesListData.equals(rightMeasurementSeriesListData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.measurementSeriesListData!= null) {
                    return false;
                }
            }
        }
        {
            MeasurementThresholdRelationListDataType leftMeasurementThresholdRelationListData;
            leftMeasurementThresholdRelationListData = this.getMeasurementThresholdRelationListData();
            MeasurementThresholdRelationListDataType rightMeasurementThresholdRelationListData;
            rightMeasurementThresholdRelationListData = that.getMeasurementThresholdRelationListData();
            if (this.measurementThresholdRelationListData!= null) {
                if (that.measurementThresholdRelationListData!= null) {
                    if (!leftMeasurementThresholdRelationListData.equals(rightMeasurementThresholdRelationListData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.measurementThresholdRelationListData!= null) {
                    return false;
                }
            }
        }
        {
            MessagingListDataType leftMessagingListData;
            leftMessagingListData = this.getMessagingListData();
            MessagingListDataType rightMessagingListData;
            rightMessagingListData = that.getMessagingListData();
            if (this.messagingListData!= null) {
                if (that.messagingListData!= null) {
                    if (!leftMessagingListData.equals(rightMessagingListData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.messagingListData!= null) {
                    return false;
                }
            }
        }
        {
            NetworkManagementAbortCallType leftNetworkManagementAbortCall;
            leftNetworkManagementAbortCall = this.getNetworkManagementAbortCall();
            NetworkManagementAbortCallType rightNetworkManagementAbortCall;
            rightNetworkManagementAbortCall = that.getNetworkManagementAbortCall();
            if (this.networkManagementAbortCall!= null) {
                if (that.networkManagementAbortCall!= null) {
                    if (!leftNetworkManagementAbortCall.equals(rightNetworkManagementAbortCall)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.networkManagementAbortCall!= null) {
                    return false;
                }
            }
        }
        {
            NetworkManagementAddNodeCallType leftNetworkManagementAddNodeCall;
            leftNetworkManagementAddNodeCall = this.getNetworkManagementAddNodeCall();
            NetworkManagementAddNodeCallType rightNetworkManagementAddNodeCall;
            rightNetworkManagementAddNodeCall = that.getNetworkManagementAddNodeCall();
            if (this.networkManagementAddNodeCall!= null) {
                if (that.networkManagementAddNodeCall!= null) {
                    if (!leftNetworkManagementAddNodeCall.equals(rightNetworkManagementAddNodeCall)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.networkManagementAddNodeCall!= null) {
                    return false;
                }
            }
        }
        {
            NetworkManagementDeviceDescriptionListDataType leftNetworkManagementDeviceDescriptionListData;
            leftNetworkManagementDeviceDescriptionListData = this.getNetworkManagementDeviceDescriptionListData();
            NetworkManagementDeviceDescriptionListDataType rightNetworkManagementDeviceDescriptionListData;
            rightNetworkManagementDeviceDescriptionListData = that.getNetworkManagementDeviceDescriptionListData();
            if (this.networkManagementDeviceDescriptionListData!= null) {
                if (that.networkManagementDeviceDescriptionListData!= null) {
                    if (!leftNetworkManagementDeviceDescriptionListData.equals(rightNetworkManagementDeviceDescriptionListData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.networkManagementDeviceDescriptionListData!= null) {
                    return false;
                }
            }
        }
        {
            NetworkManagementDiscoverCallType leftNetworkManagementDiscoverCall;
            leftNetworkManagementDiscoverCall = this.getNetworkManagementDiscoverCall();
            NetworkManagementDiscoverCallType rightNetworkManagementDiscoverCall;
            rightNetworkManagementDiscoverCall = that.getNetworkManagementDiscoverCall();
            if (this.networkManagementDiscoverCall!= null) {
                if (that.networkManagementDiscoverCall!= null) {
                    if (!leftNetworkManagementDiscoverCall.equals(rightNetworkManagementDiscoverCall)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.networkManagementDiscoverCall!= null) {
                    return false;
                }
            }
        }
        {
            NetworkManagementEntityDescriptionListDataType leftNetworkManagementEntityDescriptionListData;
            leftNetworkManagementEntityDescriptionListData = this.getNetworkManagementEntityDescriptionListData();
            NetworkManagementEntityDescriptionListDataType rightNetworkManagementEntityDescriptionListData;
            rightNetworkManagementEntityDescriptionListData = that.getNetworkManagementEntityDescriptionListData();
            if (this.networkManagementEntityDescriptionListData!= null) {
                if (that.networkManagementEntityDescriptionListData!= null) {
                    if (!leftNetworkManagementEntityDescriptionListData.equals(rightNetworkManagementEntityDescriptionListData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.networkManagementEntityDescriptionListData!= null) {
                    return false;
                }
            }
        }
        {
            NetworkManagementFeatureDescriptionListDataType leftNetworkManagementFeatureDescriptionListData;
            leftNetworkManagementFeatureDescriptionListData = this.getNetworkManagementFeatureDescriptionListData();
            NetworkManagementFeatureDescriptionListDataType rightNetworkManagementFeatureDescriptionListData;
            rightNetworkManagementFeatureDescriptionListData = that.getNetworkManagementFeatureDescriptionListData();
            if (this.networkManagementFeatureDescriptionListData!= null) {
                if (that.networkManagementFeatureDescriptionListData!= null) {
                    if (!leftNetworkManagementFeatureDescriptionListData.equals(rightNetworkManagementFeatureDescriptionListData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.networkManagementFeatureDescriptionListData!= null) {
                    return false;
                }
            }
        }
        {
            NetworkManagementJoiningModeDataType leftNetworkManagementJoiningModeData;
            leftNetworkManagementJoiningModeData = this.getNetworkManagementJoiningModeData();
            NetworkManagementJoiningModeDataType rightNetworkManagementJoiningModeData;
            rightNetworkManagementJoiningModeData = that.getNetworkManagementJoiningModeData();
            if (this.networkManagementJoiningModeData!= null) {
                if (that.networkManagementJoiningModeData!= null) {
                    if (!leftNetworkManagementJoiningModeData.equals(rightNetworkManagementJoiningModeData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.networkManagementJoiningModeData!= null) {
                    return false;
                }
            }
        }
        {
            NetworkManagementModifyNodeCallType leftNetworkManagementModifyNodeCall;
            leftNetworkManagementModifyNodeCall = this.getNetworkManagementModifyNodeCall();
            NetworkManagementModifyNodeCallType rightNetworkManagementModifyNodeCall;
            rightNetworkManagementModifyNodeCall = that.getNetworkManagementModifyNodeCall();
            if (this.networkManagementModifyNodeCall!= null) {
                if (that.networkManagementModifyNodeCall!= null) {
                    if (!leftNetworkManagementModifyNodeCall.equals(rightNetworkManagementModifyNodeCall)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.networkManagementModifyNodeCall!= null) {
                    return false;
                }
            }
        }
        {
            NetworkManagementProcessStateDataType leftNetworkManagementProcessStateData;
            leftNetworkManagementProcessStateData = this.getNetworkManagementProcessStateData();
            NetworkManagementProcessStateDataType rightNetworkManagementProcessStateData;
            rightNetworkManagementProcessStateData = that.getNetworkManagementProcessStateData();
            if (this.networkManagementProcessStateData!= null) {
                if (that.networkManagementProcessStateData!= null) {
                    if (!leftNetworkManagementProcessStateData.equals(rightNetworkManagementProcessStateData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.networkManagementProcessStateData!= null) {
                    return false;
                }
            }
        }
        {
            NetworkManagementRemoveNodeCallType leftNetworkManagementRemoveNodeCall;
            leftNetworkManagementRemoveNodeCall = this.getNetworkManagementRemoveNodeCall();
            NetworkManagementRemoveNodeCallType rightNetworkManagementRemoveNodeCall;
            rightNetworkManagementRemoveNodeCall = that.getNetworkManagementRemoveNodeCall();
            if (this.networkManagementRemoveNodeCall!= null) {
                if (that.networkManagementRemoveNodeCall!= null) {
                    if (!leftNetworkManagementRemoveNodeCall.equals(rightNetworkManagementRemoveNodeCall)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.networkManagementRemoveNodeCall!= null) {
                    return false;
                }
            }
        }
        {
            NetworkManagementReportCandidateDataType leftNetworkManagementReportCandidateData;
            leftNetworkManagementReportCandidateData = this.getNetworkManagementReportCandidateData();
            NetworkManagementReportCandidateDataType rightNetworkManagementReportCandidateData;
            rightNetworkManagementReportCandidateData = that.getNetworkManagementReportCandidateData();
            if (this.networkManagementReportCandidateData!= null) {
                if (that.networkManagementReportCandidateData!= null) {
                    if (!leftNetworkManagementReportCandidateData.equals(rightNetworkManagementReportCandidateData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.networkManagementReportCandidateData!= null) {
                    return false;
                }
            }
        }
        {
            NetworkManagementScanNetworkCallType leftNetworkManagementScanNetworkCall;
            leftNetworkManagementScanNetworkCall = this.getNetworkManagementScanNetworkCall();
            NetworkManagementScanNetworkCallType rightNetworkManagementScanNetworkCall;
            rightNetworkManagementScanNetworkCall = that.getNetworkManagementScanNetworkCall();
            if (this.networkManagementScanNetworkCall!= null) {
                if (that.networkManagementScanNetworkCall!= null) {
                    if (!leftNetworkManagementScanNetworkCall.equals(rightNetworkManagementScanNetworkCall)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.networkManagementScanNetworkCall!= null) {
                    return false;
                }
            }
        }
        {
            NodeManagementBindingDataType leftNodeManagementBindingData;
            leftNodeManagementBindingData = this.getNodeManagementBindingData();
            NodeManagementBindingDataType rightNodeManagementBindingData;
            rightNodeManagementBindingData = that.getNodeManagementBindingData();
            if (this.nodeManagementBindingData!= null) {
                if (that.nodeManagementBindingData!= null) {
                    if (!leftNodeManagementBindingData.equals(rightNodeManagementBindingData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.nodeManagementBindingData!= null) {
                    return false;
                }
            }
        }
        {
            NodeManagementBindingDeleteCallType leftNodeManagementBindingDeleteCall;
            leftNodeManagementBindingDeleteCall = this.getNodeManagementBindingDeleteCall();
            NodeManagementBindingDeleteCallType rightNodeManagementBindingDeleteCall;
            rightNodeManagementBindingDeleteCall = that.getNodeManagementBindingDeleteCall();
            if (this.nodeManagementBindingDeleteCall!= null) {
                if (that.nodeManagementBindingDeleteCall!= null) {
                    if (!leftNodeManagementBindingDeleteCall.equals(rightNodeManagementBindingDeleteCall)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.nodeManagementBindingDeleteCall!= null) {
                    return false;
                }
            }
        }
        {
            NodeManagementBindingRequestCallType leftNodeManagementBindingRequestCall;
            leftNodeManagementBindingRequestCall = this.getNodeManagementBindingRequestCall();
            NodeManagementBindingRequestCallType rightNodeManagementBindingRequestCall;
            rightNodeManagementBindingRequestCall = that.getNodeManagementBindingRequestCall();
            if (this.nodeManagementBindingRequestCall!= null) {
                if (that.nodeManagementBindingRequestCall!= null) {
                    if (!leftNodeManagementBindingRequestCall.equals(rightNodeManagementBindingRequestCall)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.nodeManagementBindingRequestCall!= null) {
                    return false;
                }
            }
        }
        {
            NodeManagementDestinationListDataType leftNodeManagementDestinationListData;
            leftNodeManagementDestinationListData = this.getNodeManagementDestinationListData();
            NodeManagementDestinationListDataType rightNodeManagementDestinationListData;
            rightNodeManagementDestinationListData = that.getNodeManagementDestinationListData();
            if (this.nodeManagementDestinationListData!= null) {
                if (that.nodeManagementDestinationListData!= null) {
                    if (!leftNodeManagementDestinationListData.equals(rightNodeManagementDestinationListData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.nodeManagementDestinationListData!= null) {
                    return false;
                }
            }
        }
        {
            NodeManagementDetailedDiscoveryDataType leftNodeManagementDetailedDiscoveryData;
            leftNodeManagementDetailedDiscoveryData = this.getNodeManagementDetailedDiscoveryData();
            NodeManagementDetailedDiscoveryDataType rightNodeManagementDetailedDiscoveryData;
            rightNodeManagementDetailedDiscoveryData = that.getNodeManagementDetailedDiscoveryData();
            if (this.nodeManagementDetailedDiscoveryData!= null) {
                if (that.nodeManagementDetailedDiscoveryData!= null) {
                    if (!leftNodeManagementDetailedDiscoveryData.equals(rightNodeManagementDetailedDiscoveryData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.nodeManagementDetailedDiscoveryData!= null) {
                    return false;
                }
            }
        }
        {
            NodeManagementSubscriptionDataType leftNodeManagementSubscriptionData;
            leftNodeManagementSubscriptionData = this.getNodeManagementSubscriptionData();
            NodeManagementSubscriptionDataType rightNodeManagementSubscriptionData;
            rightNodeManagementSubscriptionData = that.getNodeManagementSubscriptionData();
            if (this.nodeManagementSubscriptionData!= null) {
                if (that.nodeManagementSubscriptionData!= null) {
                    if (!leftNodeManagementSubscriptionData.equals(rightNodeManagementSubscriptionData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.nodeManagementSubscriptionData!= null) {
                    return false;
                }
            }
        }
        {
            NodeManagementSubscriptionDeleteCallType leftNodeManagementSubscriptionDeleteCall;
            leftNodeManagementSubscriptionDeleteCall = this.getNodeManagementSubscriptionDeleteCall();
            NodeManagementSubscriptionDeleteCallType rightNodeManagementSubscriptionDeleteCall;
            rightNodeManagementSubscriptionDeleteCall = that.getNodeManagementSubscriptionDeleteCall();
            if (this.nodeManagementSubscriptionDeleteCall!= null) {
                if (that.nodeManagementSubscriptionDeleteCall!= null) {
                    if (!leftNodeManagementSubscriptionDeleteCall.equals(rightNodeManagementSubscriptionDeleteCall)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.nodeManagementSubscriptionDeleteCall!= null) {
                    return false;
                }
            }
        }
        {
            NodeManagementSubscriptionRequestCallType leftNodeManagementSubscriptionRequestCall;
            leftNodeManagementSubscriptionRequestCall = this.getNodeManagementSubscriptionRequestCall();
            NodeManagementSubscriptionRequestCallType rightNodeManagementSubscriptionRequestCall;
            rightNodeManagementSubscriptionRequestCall = that.getNodeManagementSubscriptionRequestCall();
            if (this.nodeManagementSubscriptionRequestCall!= null) {
                if (that.nodeManagementSubscriptionRequestCall!= null) {
                    if (!leftNodeManagementSubscriptionRequestCall.equals(rightNodeManagementSubscriptionRequestCall)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.nodeManagementSubscriptionRequestCall!= null) {
                    return false;
                }
            }
        }
        {
            NodeManagementUseCaseDataType leftNodeManagementUseCaseData;
            leftNodeManagementUseCaseData = this.getNodeManagementUseCaseData();
            NodeManagementUseCaseDataType rightNodeManagementUseCaseData;
            rightNodeManagementUseCaseData = that.getNodeManagementUseCaseData();
            if (this.nodeManagementUseCaseData!= null) {
                if (that.nodeManagementUseCaseData!= null) {
                    if (!leftNodeManagementUseCaseData.equals(rightNodeManagementUseCaseData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.nodeManagementUseCaseData!= null) {
                    return false;
                }
            }
        }
        {
            OperatingConstraintsDurationListDataType leftOperatingConstraintsDurationListData;
            leftOperatingConstraintsDurationListData = this.getOperatingConstraintsDurationListData();
            OperatingConstraintsDurationListDataType rightOperatingConstraintsDurationListData;
            rightOperatingConstraintsDurationListData = that.getOperatingConstraintsDurationListData();
            if (this.operatingConstraintsDurationListData!= null) {
                if (that.operatingConstraintsDurationListData!= null) {
                    if (!leftOperatingConstraintsDurationListData.equals(rightOperatingConstraintsDurationListData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.operatingConstraintsDurationListData!= null) {
                    return false;
                }
            }
        }
        {
            OperatingConstraintsInterruptListDataType leftOperatingConstraintsInterruptListData;
            leftOperatingConstraintsInterruptListData = this.getOperatingConstraintsInterruptListData();
            OperatingConstraintsInterruptListDataType rightOperatingConstraintsInterruptListData;
            rightOperatingConstraintsInterruptListData = that.getOperatingConstraintsInterruptListData();
            if (this.operatingConstraintsInterruptListData!= null) {
                if (that.operatingConstraintsInterruptListData!= null) {
                    if (!leftOperatingConstraintsInterruptListData.equals(rightOperatingConstraintsInterruptListData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.operatingConstraintsInterruptListData!= null) {
                    return false;
                }
            }
        }
        {
            OperatingConstraintsPowerDescriptionListDataType leftOperatingConstraintsPowerDescriptionListData;
            leftOperatingConstraintsPowerDescriptionListData = this.getOperatingConstraintsPowerDescriptionListData();
            OperatingConstraintsPowerDescriptionListDataType rightOperatingConstraintsPowerDescriptionListData;
            rightOperatingConstraintsPowerDescriptionListData = that.getOperatingConstraintsPowerDescriptionListData();
            if (this.operatingConstraintsPowerDescriptionListData!= null) {
                if (that.operatingConstraintsPowerDescriptionListData!= null) {
                    if (!leftOperatingConstraintsPowerDescriptionListData.equals(rightOperatingConstraintsPowerDescriptionListData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.operatingConstraintsPowerDescriptionListData!= null) {
                    return false;
                }
            }
        }
        {
            OperatingConstraintsPowerLevelListDataType leftOperatingConstraintsPowerLevelListData;
            leftOperatingConstraintsPowerLevelListData = this.getOperatingConstraintsPowerLevelListData();
            OperatingConstraintsPowerLevelListDataType rightOperatingConstraintsPowerLevelListData;
            rightOperatingConstraintsPowerLevelListData = that.getOperatingConstraintsPowerLevelListData();
            if (this.operatingConstraintsPowerLevelListData!= null) {
                if (that.operatingConstraintsPowerLevelListData!= null) {
                    if (!leftOperatingConstraintsPowerLevelListData.equals(rightOperatingConstraintsPowerLevelListData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.operatingConstraintsPowerLevelListData!= null) {
                    return false;
                }
            }
        }
        {
            OperatingConstraintsPowerRangeListDataType leftOperatingConstraintsPowerRangeListData;
            leftOperatingConstraintsPowerRangeListData = this.getOperatingConstraintsPowerRangeListData();
            OperatingConstraintsPowerRangeListDataType rightOperatingConstraintsPowerRangeListData;
            rightOperatingConstraintsPowerRangeListData = that.getOperatingConstraintsPowerRangeListData();
            if (this.operatingConstraintsPowerRangeListData!= null) {
                if (that.operatingConstraintsPowerRangeListData!= null) {
                    if (!leftOperatingConstraintsPowerRangeListData.equals(rightOperatingConstraintsPowerRangeListData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.operatingConstraintsPowerRangeListData!= null) {
                    return false;
                }
            }
        }
        {
            OperatingConstraintsResumeImplicationListDataType leftOperatingConstraintsResumeImplicationListData;
            leftOperatingConstraintsResumeImplicationListData = this.getOperatingConstraintsResumeImplicationListData();
            OperatingConstraintsResumeImplicationListDataType rightOperatingConstraintsResumeImplicationListData;
            rightOperatingConstraintsResumeImplicationListData = that.getOperatingConstraintsResumeImplicationListData();
            if (this.operatingConstraintsResumeImplicationListData!= null) {
                if (that.operatingConstraintsResumeImplicationListData!= null) {
                    if (!leftOperatingConstraintsResumeImplicationListData.equals(rightOperatingConstraintsResumeImplicationListData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.operatingConstraintsResumeImplicationListData!= null) {
                    return false;
                }
            }
        }
        {
            PowerSequenceAlternativesRelationListDataType leftPowerSequenceAlternativesRelationListData;
            leftPowerSequenceAlternativesRelationListData = this.getPowerSequenceAlternativesRelationListData();
            PowerSequenceAlternativesRelationListDataType rightPowerSequenceAlternativesRelationListData;
            rightPowerSequenceAlternativesRelationListData = that.getPowerSequenceAlternativesRelationListData();
            if (this.powerSequenceAlternativesRelationListData!= null) {
                if (that.powerSequenceAlternativesRelationListData!= null) {
                    if (!leftPowerSequenceAlternativesRelationListData.equals(rightPowerSequenceAlternativesRelationListData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.powerSequenceAlternativesRelationListData!= null) {
                    return false;
                }
            }
        }
        {
            PowerSequenceDescriptionListDataType leftPowerSequenceDescriptionListData;
            leftPowerSequenceDescriptionListData = this.getPowerSequenceDescriptionListData();
            PowerSequenceDescriptionListDataType rightPowerSequenceDescriptionListData;
            rightPowerSequenceDescriptionListData = that.getPowerSequenceDescriptionListData();
            if (this.powerSequenceDescriptionListData!= null) {
                if (that.powerSequenceDescriptionListData!= null) {
                    if (!leftPowerSequenceDescriptionListData.equals(rightPowerSequenceDescriptionListData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.powerSequenceDescriptionListData!= null) {
                    return false;
                }
            }
        }
        {
            PowerSequenceNodeScheduleInformationDataType leftPowerSequenceNodeScheduleInformationData;
            leftPowerSequenceNodeScheduleInformationData = this.getPowerSequenceNodeScheduleInformationData();
            PowerSequenceNodeScheduleInformationDataType rightPowerSequenceNodeScheduleInformationData;
            rightPowerSequenceNodeScheduleInformationData = that.getPowerSequenceNodeScheduleInformationData();
            if (this.powerSequenceNodeScheduleInformationData!= null) {
                if (that.powerSequenceNodeScheduleInformationData!= null) {
                    if (!leftPowerSequenceNodeScheduleInformationData.equals(rightPowerSequenceNodeScheduleInformationData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.powerSequenceNodeScheduleInformationData!= null) {
                    return false;
                }
            }
        }
        {
            PowerSequencePriceCalculationRequestCallType leftPowerSequencePriceCalculationRequestCall;
            leftPowerSequencePriceCalculationRequestCall = this.getPowerSequencePriceCalculationRequestCall();
            PowerSequencePriceCalculationRequestCallType rightPowerSequencePriceCalculationRequestCall;
            rightPowerSequencePriceCalculationRequestCall = that.getPowerSequencePriceCalculationRequestCall();
            if (this.powerSequencePriceCalculationRequestCall!= null) {
                if (that.powerSequencePriceCalculationRequestCall!= null) {
                    if (!leftPowerSequencePriceCalculationRequestCall.equals(rightPowerSequencePriceCalculationRequestCall)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.powerSequencePriceCalculationRequestCall!= null) {
                    return false;
                }
            }
        }
        {
            PowerSequencePriceListDataType leftPowerSequencePriceListData;
            leftPowerSequencePriceListData = this.getPowerSequencePriceListData();
            PowerSequencePriceListDataType rightPowerSequencePriceListData;
            rightPowerSequencePriceListData = that.getPowerSequencePriceListData();
            if (this.powerSequencePriceListData!= null) {
                if (that.powerSequencePriceListData!= null) {
                    if (!leftPowerSequencePriceListData.equals(rightPowerSequencePriceListData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.powerSequencePriceListData!= null) {
                    return false;
                }
            }
        }
        {
            PowerSequenceScheduleConfigurationRequestCallType leftPowerSequenceScheduleConfigurationRequestCall;
            leftPowerSequenceScheduleConfigurationRequestCall = this.getPowerSequenceScheduleConfigurationRequestCall();
            PowerSequenceScheduleConfigurationRequestCallType rightPowerSequenceScheduleConfigurationRequestCall;
            rightPowerSequenceScheduleConfigurationRequestCall = that.getPowerSequenceScheduleConfigurationRequestCall();
            if (this.powerSequenceScheduleConfigurationRequestCall!= null) {
                if (that.powerSequenceScheduleConfigurationRequestCall!= null) {
                    if (!leftPowerSequenceScheduleConfigurationRequestCall.equals(rightPowerSequenceScheduleConfigurationRequestCall)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.powerSequenceScheduleConfigurationRequestCall!= null) {
                    return false;
                }
            }
        }
        {
            PowerSequenceScheduleConstraintsListDataType leftPowerSequenceScheduleConstraintsListData;
            leftPowerSequenceScheduleConstraintsListData = this.getPowerSequenceScheduleConstraintsListData();
            PowerSequenceScheduleConstraintsListDataType rightPowerSequenceScheduleConstraintsListData;
            rightPowerSequenceScheduleConstraintsListData = that.getPowerSequenceScheduleConstraintsListData();
            if (this.powerSequenceScheduleConstraintsListData!= null) {
                if (that.powerSequenceScheduleConstraintsListData!= null) {
                    if (!leftPowerSequenceScheduleConstraintsListData.equals(rightPowerSequenceScheduleConstraintsListData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.powerSequenceScheduleConstraintsListData!= null) {
                    return false;
                }
            }
        }
        {
            PowerSequenceScheduleListDataType leftPowerSequenceScheduleListData;
            leftPowerSequenceScheduleListData = this.getPowerSequenceScheduleListData();
            PowerSequenceScheduleListDataType rightPowerSequenceScheduleListData;
            rightPowerSequenceScheduleListData = that.getPowerSequenceScheduleListData();
            if (this.powerSequenceScheduleListData!= null) {
                if (that.powerSequenceScheduleListData!= null) {
                    if (!leftPowerSequenceScheduleListData.equals(rightPowerSequenceScheduleListData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.powerSequenceScheduleListData!= null) {
                    return false;
                }
            }
        }
        {
            PowerSequenceSchedulePreferenceListDataType leftPowerSequenceSchedulePreferenceListData;
            leftPowerSequenceSchedulePreferenceListData = this.getPowerSequenceSchedulePreferenceListData();
            PowerSequenceSchedulePreferenceListDataType rightPowerSequenceSchedulePreferenceListData;
            rightPowerSequenceSchedulePreferenceListData = that.getPowerSequenceSchedulePreferenceListData();
            if (this.powerSequenceSchedulePreferenceListData!= null) {
                if (that.powerSequenceSchedulePreferenceListData!= null) {
                    if (!leftPowerSequenceSchedulePreferenceListData.equals(rightPowerSequenceSchedulePreferenceListData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.powerSequenceSchedulePreferenceListData!= null) {
                    return false;
                }
            }
        }
        {
            PowerSequenceStateListDataType leftPowerSequenceStateListData;
            leftPowerSequenceStateListData = this.getPowerSequenceStateListData();
            PowerSequenceStateListDataType rightPowerSequenceStateListData;
            rightPowerSequenceStateListData = that.getPowerSequenceStateListData();
            if (this.powerSequenceStateListData!= null) {
                if (that.powerSequenceStateListData!= null) {
                    if (!leftPowerSequenceStateListData.equals(rightPowerSequenceStateListData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.powerSequenceStateListData!= null) {
                    return false;
                }
            }
        }
        {
            PowerTimeSlotScheduleConstraintsListDataType leftPowerTimeSlotScheduleConstraintsListData;
            leftPowerTimeSlotScheduleConstraintsListData = this.getPowerTimeSlotScheduleConstraintsListData();
            PowerTimeSlotScheduleConstraintsListDataType rightPowerTimeSlotScheduleConstraintsListData;
            rightPowerTimeSlotScheduleConstraintsListData = that.getPowerTimeSlotScheduleConstraintsListData();
            if (this.powerTimeSlotScheduleConstraintsListData!= null) {
                if (that.powerTimeSlotScheduleConstraintsListData!= null) {
                    if (!leftPowerTimeSlotScheduleConstraintsListData.equals(rightPowerTimeSlotScheduleConstraintsListData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.powerTimeSlotScheduleConstraintsListData!= null) {
                    return false;
                }
            }
        }
        {
            PowerTimeSlotScheduleListDataType leftPowerTimeSlotScheduleListData;
            leftPowerTimeSlotScheduleListData = this.getPowerTimeSlotScheduleListData();
            PowerTimeSlotScheduleListDataType rightPowerTimeSlotScheduleListData;
            rightPowerTimeSlotScheduleListData = that.getPowerTimeSlotScheduleListData();
            if (this.powerTimeSlotScheduleListData!= null) {
                if (that.powerTimeSlotScheduleListData!= null) {
                    if (!leftPowerTimeSlotScheduleListData.equals(rightPowerTimeSlotScheduleListData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.powerTimeSlotScheduleListData!= null) {
                    return false;
                }
            }
        }
        {
            PowerTimeSlotValueListDataType leftPowerTimeSlotValueListData;
            leftPowerTimeSlotValueListData = this.getPowerTimeSlotValueListData();
            PowerTimeSlotValueListDataType rightPowerTimeSlotValueListData;
            rightPowerTimeSlotValueListData = that.getPowerTimeSlotValueListData();
            if (this.powerTimeSlotValueListData!= null) {
                if (that.powerTimeSlotValueListData!= null) {
                    if (!leftPowerTimeSlotValueListData.equals(rightPowerTimeSlotValueListData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.powerTimeSlotValueListData!= null) {
                    return false;
                }
            }
        }
        {
            ResultDataType leftResultData;
            leftResultData = this.getResultData();
            ResultDataType rightResultData;
            rightResultData = that.getResultData();
            if (this.resultData!= null) {
                if (that.resultData!= null) {
                    if (!leftResultData.equals(rightResultData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.resultData!= null) {
                    return false;
                }
            }
        }
        {
            SensingDescriptionDataType leftSensingDescriptionData;
            leftSensingDescriptionData = this.getSensingDescriptionData();
            SensingDescriptionDataType rightSensingDescriptionData;
            rightSensingDescriptionData = that.getSensingDescriptionData();
            if (this.sensingDescriptionData!= null) {
                if (that.sensingDescriptionData!= null) {
                    if (!leftSensingDescriptionData.equals(rightSensingDescriptionData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.sensingDescriptionData!= null) {
                    return false;
                }
            }
        }
        {
            SensingListDataType leftSensingListData;
            leftSensingListData = this.getSensingListData();
            SensingListDataType rightSensingListData;
            rightSensingListData = that.getSensingListData();
            if (this.sensingListData!= null) {
                if (that.sensingListData!= null) {
                    if (!leftSensingListData.equals(rightSensingListData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.sensingListData!= null) {
                    return false;
                }
            }
        }
        {
            SessionIdentificationListDataType leftSessionIdentificationListData;
            leftSessionIdentificationListData = this.getSessionIdentificationListData();
            SessionIdentificationListDataType rightSessionIdentificationListData;
            rightSessionIdentificationListData = that.getSessionIdentificationListData();
            if (this.sessionIdentificationListData!= null) {
                if (that.sessionIdentificationListData!= null) {
                    if (!leftSessionIdentificationListData.equals(rightSessionIdentificationListData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.sessionIdentificationListData!= null) {
                    return false;
                }
            }
        }
        {
            SessionMeasurementRelationListDataType leftSessionMeasurementRelationListData;
            leftSessionMeasurementRelationListData = this.getSessionMeasurementRelationListData();
            SessionMeasurementRelationListDataType rightSessionMeasurementRelationListData;
            rightSessionMeasurementRelationListData = that.getSessionMeasurementRelationListData();
            if (this.sessionMeasurementRelationListData!= null) {
                if (that.sessionMeasurementRelationListData!= null) {
                    if (!leftSessionMeasurementRelationListData.equals(rightSessionMeasurementRelationListData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.sessionMeasurementRelationListData!= null) {
                    return false;
                }
            }
        }
        {
            SetpointConstraintsListDataType leftSetpointConstraintsListData;
            leftSetpointConstraintsListData = this.getSetpointConstraintsListData();
            SetpointConstraintsListDataType rightSetpointConstraintsListData;
            rightSetpointConstraintsListData = that.getSetpointConstraintsListData();
            if (this.setpointConstraintsListData!= null) {
                if (that.setpointConstraintsListData!= null) {
                    if (!leftSetpointConstraintsListData.equals(rightSetpointConstraintsListData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.setpointConstraintsListData!= null) {
                    return false;
                }
            }
        }
        {
            SetpointDescriptionListDataType leftSetpointDescriptionListData;
            leftSetpointDescriptionListData = this.getSetpointDescriptionListData();
            SetpointDescriptionListDataType rightSetpointDescriptionListData;
            rightSetpointDescriptionListData = that.getSetpointDescriptionListData();
            if (this.setpointDescriptionListData!= null) {
                if (that.setpointDescriptionListData!= null) {
                    if (!leftSetpointDescriptionListData.equals(rightSetpointDescriptionListData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.setpointDescriptionListData!= null) {
                    return false;
                }
            }
        }
        {
            SetpointListDataType leftSetpointListData;
            leftSetpointListData = this.getSetpointListData();
            SetpointListDataType rightSetpointListData;
            rightSetpointListData = that.getSetpointListData();
            if (this.setpointListData!= null) {
                if (that.setpointListData!= null) {
                    if (!leftSetpointListData.equals(rightSetpointListData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.setpointListData!= null) {
                    return false;
                }
            }
        }
        {
            SmartEnergyManagementPsConfigurationRequestCallType leftSmartEnergyManagementPsConfigurationRequestCall;
            leftSmartEnergyManagementPsConfigurationRequestCall = this.getSmartEnergyManagementPsConfigurationRequestCall();
            SmartEnergyManagementPsConfigurationRequestCallType rightSmartEnergyManagementPsConfigurationRequestCall;
            rightSmartEnergyManagementPsConfigurationRequestCall = that.getSmartEnergyManagementPsConfigurationRequestCall();
            if (this.smartEnergyManagementPsConfigurationRequestCall!= null) {
                if (that.smartEnergyManagementPsConfigurationRequestCall!= null) {
                    if (!leftSmartEnergyManagementPsConfigurationRequestCall.equals(rightSmartEnergyManagementPsConfigurationRequestCall)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.smartEnergyManagementPsConfigurationRequestCall!= null) {
                    return false;
                }
            }
        }
        {
            SmartEnergyManagementPsDataType leftSmartEnergyManagementPsData;
            leftSmartEnergyManagementPsData = this.getSmartEnergyManagementPsData();
            SmartEnergyManagementPsDataType rightSmartEnergyManagementPsData;
            rightSmartEnergyManagementPsData = that.getSmartEnergyManagementPsData();
            if (this.smartEnergyManagementPsData!= null) {
                if (that.smartEnergyManagementPsData!= null) {
                    if (!leftSmartEnergyManagementPsData.equals(rightSmartEnergyManagementPsData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.smartEnergyManagementPsData!= null) {
                    return false;
                }
            }
        }
        {
            SmartEnergyManagementPsPriceCalculationRequestCallType leftSmartEnergyManagementPsPriceCalculationRequestCall;
            leftSmartEnergyManagementPsPriceCalculationRequestCall = this.getSmartEnergyManagementPsPriceCalculationRequestCall();
            SmartEnergyManagementPsPriceCalculationRequestCallType rightSmartEnergyManagementPsPriceCalculationRequestCall;
            rightSmartEnergyManagementPsPriceCalculationRequestCall = that.getSmartEnergyManagementPsPriceCalculationRequestCall();
            if (this.smartEnergyManagementPsPriceCalculationRequestCall!= null) {
                if (that.smartEnergyManagementPsPriceCalculationRequestCall!= null) {
                    if (!leftSmartEnergyManagementPsPriceCalculationRequestCall.equals(rightSmartEnergyManagementPsPriceCalculationRequestCall)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.smartEnergyManagementPsPriceCalculationRequestCall!= null) {
                    return false;
                }
            }
        }
        {
            SmartEnergyManagementPsPriceDataType leftSmartEnergyManagementPsPriceData;
            leftSmartEnergyManagementPsPriceData = this.getSmartEnergyManagementPsPriceData();
            SmartEnergyManagementPsPriceDataType rightSmartEnergyManagementPsPriceData;
            rightSmartEnergyManagementPsPriceData = that.getSmartEnergyManagementPsPriceData();
            if (this.smartEnergyManagementPsPriceData!= null) {
                if (that.smartEnergyManagementPsPriceData!= null) {
                    if (!leftSmartEnergyManagementPsPriceData.equals(rightSmartEnergyManagementPsPriceData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.smartEnergyManagementPsPriceData!= null) {
                    return false;
                }
            }
        }
        {
            SpecificationVersionListDataType leftSpecificationVersionListData;
            leftSpecificationVersionListData = this.getSpecificationVersionListData();
            SpecificationVersionListDataType rightSpecificationVersionListData;
            rightSpecificationVersionListData = that.getSpecificationVersionListData();
            if (this.specificationVersionListData!= null) {
                if (that.specificationVersionListData!= null) {
                    if (!leftSpecificationVersionListData.equals(rightSpecificationVersionListData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.specificationVersionListData!= null) {
                    return false;
                }
            }
        }
        {
            StateInformationListDataType leftStateInformationListData;
            leftStateInformationListData = this.getStateInformationListData();
            StateInformationListDataType rightStateInformationListData;
            rightStateInformationListData = that.getStateInformationListData();
            if (this.stateInformationListData!= null) {
                if (that.stateInformationListData!= null) {
                    if (!leftStateInformationListData.equals(rightStateInformationListData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.stateInformationListData!= null) {
                    return false;
                }
            }
        }
        {
            SubscriptionManagementDeleteCallType leftSubscriptionManagementDeleteCall;
            leftSubscriptionManagementDeleteCall = this.getSubscriptionManagementDeleteCall();
            SubscriptionManagementDeleteCallType rightSubscriptionManagementDeleteCall;
            rightSubscriptionManagementDeleteCall = that.getSubscriptionManagementDeleteCall();
            if (this.subscriptionManagementDeleteCall!= null) {
                if (that.subscriptionManagementDeleteCall!= null) {
                    if (!leftSubscriptionManagementDeleteCall.equals(rightSubscriptionManagementDeleteCall)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.subscriptionManagementDeleteCall!= null) {
                    return false;
                }
            }
        }
        {
            SubscriptionManagementEntryListDataType leftSubscriptionManagementEntryListData;
            leftSubscriptionManagementEntryListData = this.getSubscriptionManagementEntryListData();
            SubscriptionManagementEntryListDataType rightSubscriptionManagementEntryListData;
            rightSubscriptionManagementEntryListData = that.getSubscriptionManagementEntryListData();
            if (this.subscriptionManagementEntryListData!= null) {
                if (that.subscriptionManagementEntryListData!= null) {
                    if (!leftSubscriptionManagementEntryListData.equals(rightSubscriptionManagementEntryListData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.subscriptionManagementEntryListData!= null) {
                    return false;
                }
            }
        }
        {
            SubscriptionManagementRequestCallType leftSubscriptionManagementRequestCall;
            leftSubscriptionManagementRequestCall = this.getSubscriptionManagementRequestCall();
            SubscriptionManagementRequestCallType rightSubscriptionManagementRequestCall;
            rightSubscriptionManagementRequestCall = that.getSubscriptionManagementRequestCall();
            if (this.subscriptionManagementRequestCall!= null) {
                if (that.subscriptionManagementRequestCall!= null) {
                    if (!leftSubscriptionManagementRequestCall.equals(rightSubscriptionManagementRequestCall)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.subscriptionManagementRequestCall!= null) {
                    return false;
                }
            }
        }
        {
            SupplyConditionDescriptionListDataType leftSupplyConditionDescriptionListData;
            leftSupplyConditionDescriptionListData = this.getSupplyConditionDescriptionListData();
            SupplyConditionDescriptionListDataType rightSupplyConditionDescriptionListData;
            rightSupplyConditionDescriptionListData = that.getSupplyConditionDescriptionListData();
            if (this.supplyConditionDescriptionListData!= null) {
                if (that.supplyConditionDescriptionListData!= null) {
                    if (!leftSupplyConditionDescriptionListData.equals(rightSupplyConditionDescriptionListData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.supplyConditionDescriptionListData!= null) {
                    return false;
                }
            }
        }
        {
            SupplyConditionListDataType leftSupplyConditionListData;
            leftSupplyConditionListData = this.getSupplyConditionListData();
            SupplyConditionListDataType rightSupplyConditionListData;
            rightSupplyConditionListData = that.getSupplyConditionListData();
            if (this.supplyConditionListData!= null) {
                if (that.supplyConditionListData!= null) {
                    if (!leftSupplyConditionListData.equals(rightSupplyConditionListData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.supplyConditionListData!= null) {
                    return false;
                }
            }
        }
        {
            SupplyConditionThresholdRelationListDataType leftSupplyConditionThresholdRelationListData;
            leftSupplyConditionThresholdRelationListData = this.getSupplyConditionThresholdRelationListData();
            SupplyConditionThresholdRelationListDataType rightSupplyConditionThresholdRelationListData;
            rightSupplyConditionThresholdRelationListData = that.getSupplyConditionThresholdRelationListData();
            if (this.supplyConditionThresholdRelationListData!= null) {
                if (that.supplyConditionThresholdRelationListData!= null) {
                    if (!leftSupplyConditionThresholdRelationListData.equals(rightSupplyConditionThresholdRelationListData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.supplyConditionThresholdRelationListData!= null) {
                    return false;
                }
            }
        }
        {
            TariffBoundaryRelationListDataType leftTariffBoundaryRelationListData;
            leftTariffBoundaryRelationListData = this.getTariffBoundaryRelationListData();
            TariffBoundaryRelationListDataType rightTariffBoundaryRelationListData;
            rightTariffBoundaryRelationListData = that.getTariffBoundaryRelationListData();
            if (this.tariffBoundaryRelationListData!= null) {
                if (that.tariffBoundaryRelationListData!= null) {
                    if (!leftTariffBoundaryRelationListData.equals(rightTariffBoundaryRelationListData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.tariffBoundaryRelationListData!= null) {
                    return false;
                }
            }
        }
        {
            TariffDescriptionListDataType leftTariffDescriptionListData;
            leftTariffDescriptionListData = this.getTariffDescriptionListData();
            TariffDescriptionListDataType rightTariffDescriptionListData;
            rightTariffDescriptionListData = that.getTariffDescriptionListData();
            if (this.tariffDescriptionListData!= null) {
                if (that.tariffDescriptionListData!= null) {
                    if (!leftTariffDescriptionListData.equals(rightTariffDescriptionListData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.tariffDescriptionListData!= null) {
                    return false;
                }
            }
        }
        {
            TariffListDataType leftTariffListData;
            leftTariffListData = this.getTariffListData();
            TariffListDataType rightTariffListData;
            rightTariffListData = that.getTariffListData();
            if (this.tariffListData!= null) {
                if (that.tariffListData!= null) {
                    if (!leftTariffListData.equals(rightTariffListData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.tariffListData!= null) {
                    return false;
                }
            }
        }
        {
            TariffOverallConstraintsDataType leftTariffOverallConstraintsData;
            leftTariffOverallConstraintsData = this.getTariffOverallConstraintsData();
            TariffOverallConstraintsDataType rightTariffOverallConstraintsData;
            rightTariffOverallConstraintsData = that.getTariffOverallConstraintsData();
            if (this.tariffOverallConstraintsData!= null) {
                if (that.tariffOverallConstraintsData!= null) {
                    if (!leftTariffOverallConstraintsData.equals(rightTariffOverallConstraintsData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.tariffOverallConstraintsData!= null) {
                    return false;
                }
            }
        }
        {
            TariffTierRelationListDataType leftTariffTierRelationListData;
            leftTariffTierRelationListData = this.getTariffTierRelationListData();
            TariffTierRelationListDataType rightTariffTierRelationListData;
            rightTariffTierRelationListData = that.getTariffTierRelationListData();
            if (this.tariffTierRelationListData!= null) {
                if (that.tariffTierRelationListData!= null) {
                    if (!leftTariffTierRelationListData.equals(rightTariffTierRelationListData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.tariffTierRelationListData!= null) {
                    return false;
                }
            }
        }
        {
            TaskManagementJobDescriptionListDataType leftTaskManagementJobDescriptionListData;
            leftTaskManagementJobDescriptionListData = this.getTaskManagementJobDescriptionListData();
            TaskManagementJobDescriptionListDataType rightTaskManagementJobDescriptionListData;
            rightTaskManagementJobDescriptionListData = that.getTaskManagementJobDescriptionListData();
            if (this.taskManagementJobDescriptionListData!= null) {
                if (that.taskManagementJobDescriptionListData!= null) {
                    if (!leftTaskManagementJobDescriptionListData.equals(rightTaskManagementJobDescriptionListData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.taskManagementJobDescriptionListData!= null) {
                    return false;
                }
            }
        }
        {
            TaskManagementJobListDataType leftTaskManagementJobListData;
            leftTaskManagementJobListData = this.getTaskManagementJobListData();
            TaskManagementJobListDataType rightTaskManagementJobListData;
            rightTaskManagementJobListData = that.getTaskManagementJobListData();
            if (this.taskManagementJobListData!= null) {
                if (that.taskManagementJobListData!= null) {
                    if (!leftTaskManagementJobListData.equals(rightTaskManagementJobListData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.taskManagementJobListData!= null) {
                    return false;
                }
            }
        }
        {
            TaskManagementJobRelationListDataType leftTaskManagementJobRelationListData;
            leftTaskManagementJobRelationListData = this.getTaskManagementJobRelationListData();
            TaskManagementJobRelationListDataType rightTaskManagementJobRelationListData;
            rightTaskManagementJobRelationListData = that.getTaskManagementJobRelationListData();
            if (this.taskManagementJobRelationListData!= null) {
                if (that.taskManagementJobRelationListData!= null) {
                    if (!leftTaskManagementJobRelationListData.equals(rightTaskManagementJobRelationListData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.taskManagementJobRelationListData!= null) {
                    return false;
                }
            }
        }
        {
            TaskManagementOverviewDataType leftTaskManagementOverviewData;
            leftTaskManagementOverviewData = this.getTaskManagementOverviewData();
            TaskManagementOverviewDataType rightTaskManagementOverviewData;
            rightTaskManagementOverviewData = that.getTaskManagementOverviewData();
            if (this.taskManagementOverviewData!= null) {
                if (that.taskManagementOverviewData!= null) {
                    if (!leftTaskManagementOverviewData.equals(rightTaskManagementOverviewData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.taskManagementOverviewData!= null) {
                    return false;
                }
            }
        }
        {
            ThresholdConstraintsListDataType leftThresholdConstraintsListData;
            leftThresholdConstraintsListData = this.getThresholdConstraintsListData();
            ThresholdConstraintsListDataType rightThresholdConstraintsListData;
            rightThresholdConstraintsListData = that.getThresholdConstraintsListData();
            if (this.thresholdConstraintsListData!= null) {
                if (that.thresholdConstraintsListData!= null) {
                    if (!leftThresholdConstraintsListData.equals(rightThresholdConstraintsListData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.thresholdConstraintsListData!= null) {
                    return false;
                }
            }
        }
        {
            ThresholdDescriptionListDataType leftThresholdDescriptionListData;
            leftThresholdDescriptionListData = this.getThresholdDescriptionListData();
            ThresholdDescriptionListDataType rightThresholdDescriptionListData;
            rightThresholdDescriptionListData = that.getThresholdDescriptionListData();
            if (this.thresholdDescriptionListData!= null) {
                if (that.thresholdDescriptionListData!= null) {
                    if (!leftThresholdDescriptionListData.equals(rightThresholdDescriptionListData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.thresholdDescriptionListData!= null) {
                    return false;
                }
            }
        }
        {
            ThresholdListDataType leftThresholdListData;
            leftThresholdListData = this.getThresholdListData();
            ThresholdListDataType rightThresholdListData;
            rightThresholdListData = that.getThresholdListData();
            if (this.thresholdListData!= null) {
                if (that.thresholdListData!= null) {
                    if (!leftThresholdListData.equals(rightThresholdListData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.thresholdListData!= null) {
                    return false;
                }
            }
        }
        {
            TierBoundaryDescriptionListDataType leftTierBoundaryDescriptionListData;
            leftTierBoundaryDescriptionListData = this.getTierBoundaryDescriptionListData();
            TierBoundaryDescriptionListDataType rightTierBoundaryDescriptionListData;
            rightTierBoundaryDescriptionListData = that.getTierBoundaryDescriptionListData();
            if (this.tierBoundaryDescriptionListData!= null) {
                if (that.tierBoundaryDescriptionListData!= null) {
                    if (!leftTierBoundaryDescriptionListData.equals(rightTierBoundaryDescriptionListData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.tierBoundaryDescriptionListData!= null) {
                    return false;
                }
            }
        }
        {
            TierBoundaryListDataType leftTierBoundaryListData;
            leftTierBoundaryListData = this.getTierBoundaryListData();
            TierBoundaryListDataType rightTierBoundaryListData;
            rightTierBoundaryListData = that.getTierBoundaryListData();
            if (this.tierBoundaryListData!= null) {
                if (that.tierBoundaryListData!= null) {
                    if (!leftTierBoundaryListData.equals(rightTierBoundaryListData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.tierBoundaryListData!= null) {
                    return false;
                }
            }
        }
        {
            TierDescriptionListDataType leftTierDescriptionListData;
            leftTierDescriptionListData = this.getTierDescriptionListData();
            TierDescriptionListDataType rightTierDescriptionListData;
            rightTierDescriptionListData = that.getTierDescriptionListData();
            if (this.tierDescriptionListData!= null) {
                if (that.tierDescriptionListData!= null) {
                    if (!leftTierDescriptionListData.equals(rightTierDescriptionListData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.tierDescriptionListData!= null) {
                    return false;
                }
            }
        }
        {
            TierIncentiveRelationListDataType leftTierIncentiveRelationListData;
            leftTierIncentiveRelationListData = this.getTierIncentiveRelationListData();
            TierIncentiveRelationListDataType rightTierIncentiveRelationListData;
            rightTierIncentiveRelationListData = that.getTierIncentiveRelationListData();
            if (this.tierIncentiveRelationListData!= null) {
                if (that.tierIncentiveRelationListData!= null) {
                    if (!leftTierIncentiveRelationListData.equals(rightTierIncentiveRelationListData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.tierIncentiveRelationListData!= null) {
                    return false;
                }
            }
        }
        {
            TierListDataType leftTierListData;
            leftTierListData = this.getTierListData();
            TierListDataType rightTierListData;
            rightTierListData = that.getTierListData();
            if (this.tierListData!= null) {
                if (that.tierListData!= null) {
                    if (!leftTierListData.equals(rightTierListData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.tierListData!= null) {
                    return false;
                }
            }
        }
        {
            TimeDistributorDataType leftTimeDistributorData;
            leftTimeDistributorData = this.getTimeDistributorData();
            TimeDistributorDataType rightTimeDistributorData;
            rightTimeDistributorData = that.getTimeDistributorData();
            if (this.timeDistributorData!= null) {
                if (that.timeDistributorData!= null) {
                    if (!leftTimeDistributorData.equals(rightTimeDistributorData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.timeDistributorData!= null) {
                    return false;
                }
            }
        }
        {
            TimeDistributorEnquiryCallType leftTimeDistributorEnquiryCall;
            leftTimeDistributorEnquiryCall = this.getTimeDistributorEnquiryCall();
            TimeDistributorEnquiryCallType rightTimeDistributorEnquiryCall;
            rightTimeDistributorEnquiryCall = that.getTimeDistributorEnquiryCall();
            if (this.timeDistributorEnquiryCall!= null) {
                if (that.timeDistributorEnquiryCall!= null) {
                    if (!leftTimeDistributorEnquiryCall.equals(rightTimeDistributorEnquiryCall)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.timeDistributorEnquiryCall!= null) {
                    return false;
                }
            }
        }
        {
            TimeInformationDataType leftTimeInformationData;
            leftTimeInformationData = this.getTimeInformationData();
            TimeInformationDataType rightTimeInformationData;
            rightTimeInformationData = that.getTimeInformationData();
            if (this.timeInformationData!= null) {
                if (that.timeInformationData!= null) {
                    if (!leftTimeInformationData.equals(rightTimeInformationData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.timeInformationData!= null) {
                    return false;
                }
            }
        }
        {
            TimePrecisionDataType leftTimePrecisionData;
            leftTimePrecisionData = this.getTimePrecisionData();
            TimePrecisionDataType rightTimePrecisionData;
            rightTimePrecisionData = that.getTimePrecisionData();
            if (this.timePrecisionData!= null) {
                if (that.timePrecisionData!= null) {
                    if (!leftTimePrecisionData.equals(rightTimePrecisionData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.timePrecisionData!= null) {
                    return false;
                }
            }
        }
        {
            TimeSeriesConstraintsListDataType leftTimeSeriesConstraintsListData;
            leftTimeSeriesConstraintsListData = this.getTimeSeriesConstraintsListData();
            TimeSeriesConstraintsListDataType rightTimeSeriesConstraintsListData;
            rightTimeSeriesConstraintsListData = that.getTimeSeriesConstraintsListData();
            if (this.timeSeriesConstraintsListData!= null) {
                if (that.timeSeriesConstraintsListData!= null) {
                    if (!leftTimeSeriesConstraintsListData.equals(rightTimeSeriesConstraintsListData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.timeSeriesConstraintsListData!= null) {
                    return false;
                }
            }
        }
        {
            TimeSeriesDescriptionListDataType leftTimeSeriesDescriptionListData;
            leftTimeSeriesDescriptionListData = this.getTimeSeriesDescriptionListData();
            TimeSeriesDescriptionListDataType rightTimeSeriesDescriptionListData;
            rightTimeSeriesDescriptionListData = that.getTimeSeriesDescriptionListData();
            if (this.timeSeriesDescriptionListData!= null) {
                if (that.timeSeriesDescriptionListData!= null) {
                    if (!leftTimeSeriesDescriptionListData.equals(rightTimeSeriesDescriptionListData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.timeSeriesDescriptionListData!= null) {
                    return false;
                }
            }
        }
        {
            TimeSeriesListDataType leftTimeSeriesListData;
            leftTimeSeriesListData = this.getTimeSeriesListData();
            TimeSeriesListDataType rightTimeSeriesListData;
            rightTimeSeriesListData = that.getTimeSeriesListData();
            if (this.timeSeriesListData!= null) {
                if (that.timeSeriesListData!= null) {
                    if (!leftTimeSeriesListData.equals(rightTimeSeriesListData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.timeSeriesListData!= null) {
                    return false;
                }
            }
        }
        {
            TimeTableConstraintsListDataType leftTimeTableConstraintsListData;
            leftTimeTableConstraintsListData = this.getTimeTableConstraintsListData();
            TimeTableConstraintsListDataType rightTimeTableConstraintsListData;
            rightTimeTableConstraintsListData = that.getTimeTableConstraintsListData();
            if (this.timeTableConstraintsListData!= null) {
                if (that.timeTableConstraintsListData!= null) {
                    if (!leftTimeTableConstraintsListData.equals(rightTimeTableConstraintsListData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.timeTableConstraintsListData!= null) {
                    return false;
                }
            }
        }
        {
            TimeTableDescriptionListDataType leftTimeTableDescriptionListData;
            leftTimeTableDescriptionListData = this.getTimeTableDescriptionListData();
            TimeTableDescriptionListDataType rightTimeTableDescriptionListData;
            rightTimeTableDescriptionListData = that.getTimeTableDescriptionListData();
            if (this.timeTableDescriptionListData!= null) {
                if (that.timeTableDescriptionListData!= null) {
                    if (!leftTimeTableDescriptionListData.equals(rightTimeTableDescriptionListData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.timeTableDescriptionListData!= null) {
                    return false;
                }
            }
        }
        {
            TimeTableListDataType leftTimeTableListData;
            leftTimeTableListData = this.getTimeTableListData();
            TimeTableListDataType rightTimeTableListData;
            rightTimeTableListData = that.getTimeTableListData();
            if (this.timeTableListData!= null) {
                if (that.timeTableListData!= null) {
                    if (!leftTimeTableListData.equals(rightTimeTableListData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.timeTableListData!= null) {
                    return false;
                }
            }
        }
        {
            UseCaseInformationListDataType leftUseCaseInformationListData;
            leftUseCaseInformationListData = this.getUseCaseInformationListData();
            UseCaseInformationListDataType rightUseCaseInformationListData;
            rightUseCaseInformationListData = that.getUseCaseInformationListData();
            if (this.useCaseInformationListData!= null) {
                if (that.useCaseInformationListData!= null) {
                    if (!leftUseCaseInformationListData.equals(rightUseCaseInformationListData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.useCaseInformationListData!= null) {
                    return false;
                }
            }
        }
        {
            byte[] leftManufacturerSpecificExtension;
            leftManufacturerSpecificExtension = this.getManufacturerSpecificExtension();
            byte[] rightManufacturerSpecificExtension;
            rightManufacturerSpecificExtension = that.getManufacturerSpecificExtension();
            if (this.manufacturerSpecificExtension!= null) {
                if (that.manufacturerSpecificExtension!= null) {
                    if (!Arrays.equals(leftManufacturerSpecificExtension, rightManufacturerSpecificExtension)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.manufacturerSpecificExtension!= null) {
                    return false;
                }
            }
        }
        {
            String leftLastUpdateAt;
            leftLastUpdateAt = this.getLastUpdateAt();
            String rightLastUpdateAt;
            rightLastUpdateAt = that.getLastUpdateAt();
            if (this.lastUpdateAt!= null) {
                if (that.lastUpdateAt!= null) {
                    if (!leftLastUpdateAt.equals(rightLastUpdateAt)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.lastUpdateAt!= null) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        int currentHashCode = 1;
        {
            currentHashCode = (currentHashCode* 31);
            String theFunction;
            theFunction = this.getFunction();
            if (this.function!= null) {
                currentHashCode += theFunction.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            List<FilterType> theFilter;
            theFilter = (((this.filter!= null)&&(!this.filter.isEmpty()))?this.getFilter():null);
            if ((this.filter!= null)&&(!this.filter.isEmpty())) {
                currentHashCode += theFilter.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ActuatorLevelDataType theActuatorLevelData;
            theActuatorLevelData = this.getActuatorLevelData();
            if (this.actuatorLevelData!= null) {
                currentHashCode += theActuatorLevelData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ActuatorLevelDescriptionDataType theActuatorLevelDescriptionData;
            theActuatorLevelDescriptionData = this.getActuatorLevelDescriptionData();
            if (this.actuatorLevelDescriptionData!= null) {
                currentHashCode += theActuatorLevelDescriptionData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ActuatorSwitchDataType theActuatorSwitchData;
            theActuatorSwitchData = this.getActuatorSwitchData();
            if (this.actuatorSwitchData!= null) {
                currentHashCode += theActuatorSwitchData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ActuatorSwitchDescriptionDataType theActuatorSwitchDescriptionData;
            theActuatorSwitchDescriptionData = this.getActuatorSwitchDescriptionData();
            if (this.actuatorSwitchDescriptionData!= null) {
                currentHashCode += theActuatorSwitchDescriptionData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            AlarmListDataType theAlarmListData;
            theAlarmListData = this.getAlarmListData();
            if (this.alarmListData!= null) {
                currentHashCode += theAlarmListData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            BillConstraintsListDataType theBillConstraintsListData;
            theBillConstraintsListData = this.getBillConstraintsListData();
            if (this.billConstraintsListData!= null) {
                currentHashCode += theBillConstraintsListData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            BillDescriptionListDataType theBillDescriptionListData;
            theBillDescriptionListData = this.getBillDescriptionListData();
            if (this.billDescriptionListData!= null) {
                currentHashCode += theBillDescriptionListData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            BillListDataType theBillListData;
            theBillListData = this.getBillListData();
            if (this.billListData!= null) {
                currentHashCode += theBillListData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            BindingManagementDeleteCallType theBindingManagementDeleteCall;
            theBindingManagementDeleteCall = this.getBindingManagementDeleteCall();
            if (this.bindingManagementDeleteCall!= null) {
                currentHashCode += theBindingManagementDeleteCall.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            BindingManagementEntryListDataType theBindingManagementEntryListData;
            theBindingManagementEntryListData = this.getBindingManagementEntryListData();
            if (this.bindingManagementEntryListData!= null) {
                currentHashCode += theBindingManagementEntryListData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            BindingManagementRequestCallType theBindingManagementRequestCall;
            theBindingManagementRequestCall = this.getBindingManagementRequestCall();
            if (this.bindingManagementRequestCall!= null) {
                currentHashCode += theBindingManagementRequestCall.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            CommodityListDataType theCommodityListData;
            theCommodityListData = this.getCommodityListData();
            if (this.commodityListData!= null) {
                currentHashCode += theCommodityListData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            DataTunnelingCallType theDataTunnelingCall;
            theDataTunnelingCall = this.getDataTunnelingCall();
            if (this.dataTunnelingCall!= null) {
                currentHashCode += theDataTunnelingCall.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            DeviceClassificationManufacturerDataType theDeviceClassificationManufacturerData;
            theDeviceClassificationManufacturerData = this.getDeviceClassificationManufacturerData();
            if (this.deviceClassificationManufacturerData!= null) {
                currentHashCode += theDeviceClassificationManufacturerData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            DeviceClassificationUserDataType theDeviceClassificationUserData;
            theDeviceClassificationUserData = this.getDeviceClassificationUserData();
            if (this.deviceClassificationUserData!= null) {
                currentHashCode += theDeviceClassificationUserData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            DeviceConfigurationKeyValueConstraintsListDataType theDeviceConfigurationKeyValueConstraintsListData;
            theDeviceConfigurationKeyValueConstraintsListData = this.getDeviceConfigurationKeyValueConstraintsListData();
            if (this.deviceConfigurationKeyValueConstraintsListData!= null) {
                currentHashCode += theDeviceConfigurationKeyValueConstraintsListData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            DeviceConfigurationKeyValueDescriptionListDataType theDeviceConfigurationKeyValueDescriptionListData;
            theDeviceConfigurationKeyValueDescriptionListData = this.getDeviceConfigurationKeyValueDescriptionListData();
            if (this.deviceConfigurationKeyValueDescriptionListData!= null) {
                currentHashCode += theDeviceConfigurationKeyValueDescriptionListData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            DeviceConfigurationKeyValueListDataType theDeviceConfigurationKeyValueListData;
            theDeviceConfigurationKeyValueListData = this.getDeviceConfigurationKeyValueListData();
            if (this.deviceConfigurationKeyValueListData!= null) {
                currentHashCode += theDeviceConfigurationKeyValueListData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            DeviceDiagnosisHeartbeatDataType theDeviceDiagnosisHeartbeatData;
            theDeviceDiagnosisHeartbeatData = this.getDeviceDiagnosisHeartbeatData();
            if (this.deviceDiagnosisHeartbeatData!= null) {
                currentHashCode += theDeviceDiagnosisHeartbeatData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            DeviceDiagnosisServiceDataType theDeviceDiagnosisServiceData;
            theDeviceDiagnosisServiceData = this.getDeviceDiagnosisServiceData();
            if (this.deviceDiagnosisServiceData!= null) {
                currentHashCode += theDeviceDiagnosisServiceData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            DeviceDiagnosisStateDataType theDeviceDiagnosisStateData;
            theDeviceDiagnosisStateData = this.getDeviceDiagnosisStateData();
            if (this.deviceDiagnosisStateData!= null) {
                currentHashCode += theDeviceDiagnosisStateData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            DirectControlActivityListDataType theDirectControlActivityListData;
            theDirectControlActivityListData = this.getDirectControlActivityListData();
            if (this.directControlActivityListData!= null) {
                currentHashCode += theDirectControlActivityListData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            DirectControlDescriptionDataType theDirectControlDescriptionData;
            theDirectControlDescriptionData = this.getDirectControlDescriptionData();
            if (this.directControlDescriptionData!= null) {
                currentHashCode += theDirectControlDescriptionData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElectricalConnectionCharacteristicListDataType theElectricalConnectionCharacteristicListData;
            theElectricalConnectionCharacteristicListData = this.getElectricalConnectionCharacteristicListData();
            if (this.electricalConnectionCharacteristicListData!= null) {
                currentHashCode += theElectricalConnectionCharacteristicListData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElectricalConnectionDescriptionListDataType theElectricalConnectionDescriptionListData;
            theElectricalConnectionDescriptionListData = this.getElectricalConnectionDescriptionListData();
            if (this.electricalConnectionDescriptionListData!= null) {
                currentHashCode += theElectricalConnectionDescriptionListData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElectricalConnectionParameterDescriptionListDataType theElectricalConnectionParameterDescriptionListData;
            theElectricalConnectionParameterDescriptionListData = this.getElectricalConnectionParameterDescriptionListData();
            if (this.electricalConnectionParameterDescriptionListData!= null) {
                currentHashCode += theElectricalConnectionParameterDescriptionListData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElectricalConnectionPermittedValueSetListDataType theElectricalConnectionPermittedValueSetListData;
            theElectricalConnectionPermittedValueSetListData = this.getElectricalConnectionPermittedValueSetListData();
            if (this.electricalConnectionPermittedValueSetListData!= null) {
                currentHashCode += theElectricalConnectionPermittedValueSetListData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElectricalConnectionStateListDataType theElectricalConnectionStateListData;
            theElectricalConnectionStateListData = this.getElectricalConnectionStateListData();
            if (this.electricalConnectionStateListData!= null) {
                currentHashCode += theElectricalConnectionStateListData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            HvacOperationModeDescriptionListDataType theHvacOperationModeDescriptionListData;
            theHvacOperationModeDescriptionListData = this.getHvacOperationModeDescriptionListData();
            if (this.hvacOperationModeDescriptionListData!= null) {
                currentHashCode += theHvacOperationModeDescriptionListData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            HvacOverrunDescriptionListDataType theHvacOverrunDescriptionListData;
            theHvacOverrunDescriptionListData = this.getHvacOverrunDescriptionListData();
            if (this.hvacOverrunDescriptionListData!= null) {
                currentHashCode += theHvacOverrunDescriptionListData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            HvacOverrunListDataType theHvacOverrunListData;
            theHvacOverrunListData = this.getHvacOverrunListData();
            if (this.hvacOverrunListData!= null) {
                currentHashCode += theHvacOverrunListData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            HvacSystemFunctionDescriptionListDataType theHvacSystemFunctionDescriptionListData;
            theHvacSystemFunctionDescriptionListData = this.getHvacSystemFunctionDescriptionListData();
            if (this.hvacSystemFunctionDescriptionListData!= null) {
                currentHashCode += theHvacSystemFunctionDescriptionListData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            HvacSystemFunctionListDataType theHvacSystemFunctionListData;
            theHvacSystemFunctionListData = this.getHvacSystemFunctionListData();
            if (this.hvacSystemFunctionListData!= null) {
                currentHashCode += theHvacSystemFunctionListData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            HvacSystemFunctionOperationModeRelationListDataType theHvacSystemFunctionOperationModeRelationListData;
            theHvacSystemFunctionOperationModeRelationListData = this.getHvacSystemFunctionOperationModeRelationListData();
            if (this.hvacSystemFunctionOperationModeRelationListData!= null) {
                currentHashCode += theHvacSystemFunctionOperationModeRelationListData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            HvacSystemFunctionPowerSequenceRelationListDataType theHvacSystemFunctionPowerSequenceRelationListData;
            theHvacSystemFunctionPowerSequenceRelationListData = this.getHvacSystemFunctionPowerSequenceRelationListData();
            if (this.hvacSystemFunctionPowerSequenceRelationListData!= null) {
                currentHashCode += theHvacSystemFunctionPowerSequenceRelationListData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            HvacSystemFunctionSetpointRelationListDataType theHvacSystemFunctionSetpointRelationListData;
            theHvacSystemFunctionSetpointRelationListData = this.getHvacSystemFunctionSetpointRelationListData();
            if (this.hvacSystemFunctionSetpointRelationListData!= null) {
                currentHashCode += theHvacSystemFunctionSetpointRelationListData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            IdentificationListDataType theIdentificationListData;
            theIdentificationListData = this.getIdentificationListData();
            if (this.identificationListData!= null) {
                currentHashCode += theIdentificationListData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            IncentiveDescriptionListDataType theIncentiveDescriptionListData;
            theIncentiveDescriptionListData = this.getIncentiveDescriptionListData();
            if (this.incentiveDescriptionListData!= null) {
                currentHashCode += theIncentiveDescriptionListData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            IncentiveListDataType theIncentiveListData;
            theIncentiveListData = this.getIncentiveListData();
            if (this.incentiveListData!= null) {
                currentHashCode += theIncentiveListData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            IncentiveTableConstraintsDataType theIncentiveTableConstraintsData;
            theIncentiveTableConstraintsData = this.getIncentiveTableConstraintsData();
            if (this.incentiveTableConstraintsData!= null) {
                currentHashCode += theIncentiveTableConstraintsData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            IncentiveTableDataType theIncentiveTableData;
            theIncentiveTableData = this.getIncentiveTableData();
            if (this.incentiveTableData!= null) {
                currentHashCode += theIncentiveTableData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            IncentiveTableDescriptionDataType theIncentiveTableDescriptionData;
            theIncentiveTableDescriptionData = this.getIncentiveTableDescriptionData();
            if (this.incentiveTableDescriptionData!= null) {
                currentHashCode += theIncentiveTableDescriptionData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            LoadControlEventListDataType theLoadControlEventListData;
            theLoadControlEventListData = this.getLoadControlEventListData();
            if (this.loadControlEventListData!= null) {
                currentHashCode += theLoadControlEventListData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            LoadControlLimitConstraintsListDataType theLoadControlLimitConstraintsListData;
            theLoadControlLimitConstraintsListData = this.getLoadControlLimitConstraintsListData();
            if (this.loadControlLimitConstraintsListData!= null) {
                currentHashCode += theLoadControlLimitConstraintsListData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            LoadControlLimitDescriptionListDataType theLoadControlLimitDescriptionListData;
            theLoadControlLimitDescriptionListData = this.getLoadControlLimitDescriptionListData();
            if (this.loadControlLimitDescriptionListData!= null) {
                currentHashCode += theLoadControlLimitDescriptionListData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            LoadControlLimitListDataType theLoadControlLimitListData;
            theLoadControlLimitListData = this.getLoadControlLimitListData();
            if (this.loadControlLimitListData!= null) {
                currentHashCode += theLoadControlLimitListData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            LoadControlNodeDataType theLoadControlNodeData;
            theLoadControlNodeData = this.getLoadControlNodeData();
            if (this.loadControlNodeData!= null) {
                currentHashCode += theLoadControlNodeData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            LoadControlStateListDataType theLoadControlStateListData;
            theLoadControlStateListData = this.getLoadControlStateListData();
            if (this.loadControlStateListData!= null) {
                currentHashCode += theLoadControlStateListData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            MeasurementConstraintsListDataType theMeasurementConstraintsListData;
            theMeasurementConstraintsListData = this.getMeasurementConstraintsListData();
            if (this.measurementConstraintsListData!= null) {
                currentHashCode += theMeasurementConstraintsListData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            MeasurementDescriptionListDataType theMeasurementDescriptionListData;
            theMeasurementDescriptionListData = this.getMeasurementDescriptionListData();
            if (this.measurementDescriptionListData!= null) {
                currentHashCode += theMeasurementDescriptionListData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            MeasurementListDataType theMeasurementListData;
            theMeasurementListData = this.getMeasurementListData();
            if (this.measurementListData!= null) {
                currentHashCode += theMeasurementListData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            MeasurementSeriesListDataType theMeasurementSeriesListData;
            theMeasurementSeriesListData = this.getMeasurementSeriesListData();
            if (this.measurementSeriesListData!= null) {
                currentHashCode += theMeasurementSeriesListData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            MeasurementThresholdRelationListDataType theMeasurementThresholdRelationListData;
            theMeasurementThresholdRelationListData = this.getMeasurementThresholdRelationListData();
            if (this.measurementThresholdRelationListData!= null) {
                currentHashCode += theMeasurementThresholdRelationListData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            MessagingListDataType theMessagingListData;
            theMessagingListData = this.getMessagingListData();
            if (this.messagingListData!= null) {
                currentHashCode += theMessagingListData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            NetworkManagementAbortCallType theNetworkManagementAbortCall;
            theNetworkManagementAbortCall = this.getNetworkManagementAbortCall();
            if (this.networkManagementAbortCall!= null) {
                currentHashCode += theNetworkManagementAbortCall.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            NetworkManagementAddNodeCallType theNetworkManagementAddNodeCall;
            theNetworkManagementAddNodeCall = this.getNetworkManagementAddNodeCall();
            if (this.networkManagementAddNodeCall!= null) {
                currentHashCode += theNetworkManagementAddNodeCall.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            NetworkManagementDeviceDescriptionListDataType theNetworkManagementDeviceDescriptionListData;
            theNetworkManagementDeviceDescriptionListData = this.getNetworkManagementDeviceDescriptionListData();
            if (this.networkManagementDeviceDescriptionListData!= null) {
                currentHashCode += theNetworkManagementDeviceDescriptionListData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            NetworkManagementDiscoverCallType theNetworkManagementDiscoverCall;
            theNetworkManagementDiscoverCall = this.getNetworkManagementDiscoverCall();
            if (this.networkManagementDiscoverCall!= null) {
                currentHashCode += theNetworkManagementDiscoverCall.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            NetworkManagementEntityDescriptionListDataType theNetworkManagementEntityDescriptionListData;
            theNetworkManagementEntityDescriptionListData = this.getNetworkManagementEntityDescriptionListData();
            if (this.networkManagementEntityDescriptionListData!= null) {
                currentHashCode += theNetworkManagementEntityDescriptionListData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            NetworkManagementFeatureDescriptionListDataType theNetworkManagementFeatureDescriptionListData;
            theNetworkManagementFeatureDescriptionListData = this.getNetworkManagementFeatureDescriptionListData();
            if (this.networkManagementFeatureDescriptionListData!= null) {
                currentHashCode += theNetworkManagementFeatureDescriptionListData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            NetworkManagementJoiningModeDataType theNetworkManagementJoiningModeData;
            theNetworkManagementJoiningModeData = this.getNetworkManagementJoiningModeData();
            if (this.networkManagementJoiningModeData!= null) {
                currentHashCode += theNetworkManagementJoiningModeData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            NetworkManagementModifyNodeCallType theNetworkManagementModifyNodeCall;
            theNetworkManagementModifyNodeCall = this.getNetworkManagementModifyNodeCall();
            if (this.networkManagementModifyNodeCall!= null) {
                currentHashCode += theNetworkManagementModifyNodeCall.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            NetworkManagementProcessStateDataType theNetworkManagementProcessStateData;
            theNetworkManagementProcessStateData = this.getNetworkManagementProcessStateData();
            if (this.networkManagementProcessStateData!= null) {
                currentHashCode += theNetworkManagementProcessStateData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            NetworkManagementRemoveNodeCallType theNetworkManagementRemoveNodeCall;
            theNetworkManagementRemoveNodeCall = this.getNetworkManagementRemoveNodeCall();
            if (this.networkManagementRemoveNodeCall!= null) {
                currentHashCode += theNetworkManagementRemoveNodeCall.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            NetworkManagementReportCandidateDataType theNetworkManagementReportCandidateData;
            theNetworkManagementReportCandidateData = this.getNetworkManagementReportCandidateData();
            if (this.networkManagementReportCandidateData!= null) {
                currentHashCode += theNetworkManagementReportCandidateData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            NetworkManagementScanNetworkCallType theNetworkManagementScanNetworkCall;
            theNetworkManagementScanNetworkCall = this.getNetworkManagementScanNetworkCall();
            if (this.networkManagementScanNetworkCall!= null) {
                currentHashCode += theNetworkManagementScanNetworkCall.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            NodeManagementBindingDataType theNodeManagementBindingData;
            theNodeManagementBindingData = this.getNodeManagementBindingData();
            if (this.nodeManagementBindingData!= null) {
                currentHashCode += theNodeManagementBindingData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            NodeManagementBindingDeleteCallType theNodeManagementBindingDeleteCall;
            theNodeManagementBindingDeleteCall = this.getNodeManagementBindingDeleteCall();
            if (this.nodeManagementBindingDeleteCall!= null) {
                currentHashCode += theNodeManagementBindingDeleteCall.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            NodeManagementBindingRequestCallType theNodeManagementBindingRequestCall;
            theNodeManagementBindingRequestCall = this.getNodeManagementBindingRequestCall();
            if (this.nodeManagementBindingRequestCall!= null) {
                currentHashCode += theNodeManagementBindingRequestCall.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            NodeManagementDestinationListDataType theNodeManagementDestinationListData;
            theNodeManagementDestinationListData = this.getNodeManagementDestinationListData();
            if (this.nodeManagementDestinationListData!= null) {
                currentHashCode += theNodeManagementDestinationListData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            NodeManagementDetailedDiscoveryDataType theNodeManagementDetailedDiscoveryData;
            theNodeManagementDetailedDiscoveryData = this.getNodeManagementDetailedDiscoveryData();
            if (this.nodeManagementDetailedDiscoveryData!= null) {
                currentHashCode += theNodeManagementDetailedDiscoveryData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            NodeManagementSubscriptionDataType theNodeManagementSubscriptionData;
            theNodeManagementSubscriptionData = this.getNodeManagementSubscriptionData();
            if (this.nodeManagementSubscriptionData!= null) {
                currentHashCode += theNodeManagementSubscriptionData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            NodeManagementSubscriptionDeleteCallType theNodeManagementSubscriptionDeleteCall;
            theNodeManagementSubscriptionDeleteCall = this.getNodeManagementSubscriptionDeleteCall();
            if (this.nodeManagementSubscriptionDeleteCall!= null) {
                currentHashCode += theNodeManagementSubscriptionDeleteCall.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            NodeManagementSubscriptionRequestCallType theNodeManagementSubscriptionRequestCall;
            theNodeManagementSubscriptionRequestCall = this.getNodeManagementSubscriptionRequestCall();
            if (this.nodeManagementSubscriptionRequestCall!= null) {
                currentHashCode += theNodeManagementSubscriptionRequestCall.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            NodeManagementUseCaseDataType theNodeManagementUseCaseData;
            theNodeManagementUseCaseData = this.getNodeManagementUseCaseData();
            if (this.nodeManagementUseCaseData!= null) {
                currentHashCode += theNodeManagementUseCaseData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            OperatingConstraintsDurationListDataType theOperatingConstraintsDurationListData;
            theOperatingConstraintsDurationListData = this.getOperatingConstraintsDurationListData();
            if (this.operatingConstraintsDurationListData!= null) {
                currentHashCode += theOperatingConstraintsDurationListData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            OperatingConstraintsInterruptListDataType theOperatingConstraintsInterruptListData;
            theOperatingConstraintsInterruptListData = this.getOperatingConstraintsInterruptListData();
            if (this.operatingConstraintsInterruptListData!= null) {
                currentHashCode += theOperatingConstraintsInterruptListData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            OperatingConstraintsPowerDescriptionListDataType theOperatingConstraintsPowerDescriptionListData;
            theOperatingConstraintsPowerDescriptionListData = this.getOperatingConstraintsPowerDescriptionListData();
            if (this.operatingConstraintsPowerDescriptionListData!= null) {
                currentHashCode += theOperatingConstraintsPowerDescriptionListData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            OperatingConstraintsPowerLevelListDataType theOperatingConstraintsPowerLevelListData;
            theOperatingConstraintsPowerLevelListData = this.getOperatingConstraintsPowerLevelListData();
            if (this.operatingConstraintsPowerLevelListData!= null) {
                currentHashCode += theOperatingConstraintsPowerLevelListData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            OperatingConstraintsPowerRangeListDataType theOperatingConstraintsPowerRangeListData;
            theOperatingConstraintsPowerRangeListData = this.getOperatingConstraintsPowerRangeListData();
            if (this.operatingConstraintsPowerRangeListData!= null) {
                currentHashCode += theOperatingConstraintsPowerRangeListData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            OperatingConstraintsResumeImplicationListDataType theOperatingConstraintsResumeImplicationListData;
            theOperatingConstraintsResumeImplicationListData = this.getOperatingConstraintsResumeImplicationListData();
            if (this.operatingConstraintsResumeImplicationListData!= null) {
                currentHashCode += theOperatingConstraintsResumeImplicationListData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            PowerSequenceAlternativesRelationListDataType thePowerSequenceAlternativesRelationListData;
            thePowerSequenceAlternativesRelationListData = this.getPowerSequenceAlternativesRelationListData();
            if (this.powerSequenceAlternativesRelationListData!= null) {
                currentHashCode += thePowerSequenceAlternativesRelationListData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            PowerSequenceDescriptionListDataType thePowerSequenceDescriptionListData;
            thePowerSequenceDescriptionListData = this.getPowerSequenceDescriptionListData();
            if (this.powerSequenceDescriptionListData!= null) {
                currentHashCode += thePowerSequenceDescriptionListData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            PowerSequenceNodeScheduleInformationDataType thePowerSequenceNodeScheduleInformationData;
            thePowerSequenceNodeScheduleInformationData = this.getPowerSequenceNodeScheduleInformationData();
            if (this.powerSequenceNodeScheduleInformationData!= null) {
                currentHashCode += thePowerSequenceNodeScheduleInformationData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            PowerSequencePriceCalculationRequestCallType thePowerSequencePriceCalculationRequestCall;
            thePowerSequencePriceCalculationRequestCall = this.getPowerSequencePriceCalculationRequestCall();
            if (this.powerSequencePriceCalculationRequestCall!= null) {
                currentHashCode += thePowerSequencePriceCalculationRequestCall.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            PowerSequencePriceListDataType thePowerSequencePriceListData;
            thePowerSequencePriceListData = this.getPowerSequencePriceListData();
            if (this.powerSequencePriceListData!= null) {
                currentHashCode += thePowerSequencePriceListData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            PowerSequenceScheduleConfigurationRequestCallType thePowerSequenceScheduleConfigurationRequestCall;
            thePowerSequenceScheduleConfigurationRequestCall = this.getPowerSequenceScheduleConfigurationRequestCall();
            if (this.powerSequenceScheduleConfigurationRequestCall!= null) {
                currentHashCode += thePowerSequenceScheduleConfigurationRequestCall.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            PowerSequenceScheduleConstraintsListDataType thePowerSequenceScheduleConstraintsListData;
            thePowerSequenceScheduleConstraintsListData = this.getPowerSequenceScheduleConstraintsListData();
            if (this.powerSequenceScheduleConstraintsListData!= null) {
                currentHashCode += thePowerSequenceScheduleConstraintsListData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            PowerSequenceScheduleListDataType thePowerSequenceScheduleListData;
            thePowerSequenceScheduleListData = this.getPowerSequenceScheduleListData();
            if (this.powerSequenceScheduleListData!= null) {
                currentHashCode += thePowerSequenceScheduleListData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            PowerSequenceSchedulePreferenceListDataType thePowerSequenceSchedulePreferenceListData;
            thePowerSequenceSchedulePreferenceListData = this.getPowerSequenceSchedulePreferenceListData();
            if (this.powerSequenceSchedulePreferenceListData!= null) {
                currentHashCode += thePowerSequenceSchedulePreferenceListData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            PowerSequenceStateListDataType thePowerSequenceStateListData;
            thePowerSequenceStateListData = this.getPowerSequenceStateListData();
            if (this.powerSequenceStateListData!= null) {
                currentHashCode += thePowerSequenceStateListData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            PowerTimeSlotScheduleConstraintsListDataType thePowerTimeSlotScheduleConstraintsListData;
            thePowerTimeSlotScheduleConstraintsListData = this.getPowerTimeSlotScheduleConstraintsListData();
            if (this.powerTimeSlotScheduleConstraintsListData!= null) {
                currentHashCode += thePowerTimeSlotScheduleConstraintsListData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            PowerTimeSlotScheduleListDataType thePowerTimeSlotScheduleListData;
            thePowerTimeSlotScheduleListData = this.getPowerTimeSlotScheduleListData();
            if (this.powerTimeSlotScheduleListData!= null) {
                currentHashCode += thePowerTimeSlotScheduleListData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            PowerTimeSlotValueListDataType thePowerTimeSlotValueListData;
            thePowerTimeSlotValueListData = this.getPowerTimeSlotValueListData();
            if (this.powerTimeSlotValueListData!= null) {
                currentHashCode += thePowerTimeSlotValueListData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ResultDataType theResultData;
            theResultData = this.getResultData();
            if (this.resultData!= null) {
                currentHashCode += theResultData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            SensingDescriptionDataType theSensingDescriptionData;
            theSensingDescriptionData = this.getSensingDescriptionData();
            if (this.sensingDescriptionData!= null) {
                currentHashCode += theSensingDescriptionData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            SensingListDataType theSensingListData;
            theSensingListData = this.getSensingListData();
            if (this.sensingListData!= null) {
                currentHashCode += theSensingListData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            SessionIdentificationListDataType theSessionIdentificationListData;
            theSessionIdentificationListData = this.getSessionIdentificationListData();
            if (this.sessionIdentificationListData!= null) {
                currentHashCode += theSessionIdentificationListData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            SessionMeasurementRelationListDataType theSessionMeasurementRelationListData;
            theSessionMeasurementRelationListData = this.getSessionMeasurementRelationListData();
            if (this.sessionMeasurementRelationListData!= null) {
                currentHashCode += theSessionMeasurementRelationListData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            SetpointConstraintsListDataType theSetpointConstraintsListData;
            theSetpointConstraintsListData = this.getSetpointConstraintsListData();
            if (this.setpointConstraintsListData!= null) {
                currentHashCode += theSetpointConstraintsListData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            SetpointDescriptionListDataType theSetpointDescriptionListData;
            theSetpointDescriptionListData = this.getSetpointDescriptionListData();
            if (this.setpointDescriptionListData!= null) {
                currentHashCode += theSetpointDescriptionListData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            SetpointListDataType theSetpointListData;
            theSetpointListData = this.getSetpointListData();
            if (this.setpointListData!= null) {
                currentHashCode += theSetpointListData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            SmartEnergyManagementPsConfigurationRequestCallType theSmartEnergyManagementPsConfigurationRequestCall;
            theSmartEnergyManagementPsConfigurationRequestCall = this.getSmartEnergyManagementPsConfigurationRequestCall();
            if (this.smartEnergyManagementPsConfigurationRequestCall!= null) {
                currentHashCode += theSmartEnergyManagementPsConfigurationRequestCall.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            SmartEnergyManagementPsDataType theSmartEnergyManagementPsData;
            theSmartEnergyManagementPsData = this.getSmartEnergyManagementPsData();
            if (this.smartEnergyManagementPsData!= null) {
                currentHashCode += theSmartEnergyManagementPsData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            SmartEnergyManagementPsPriceCalculationRequestCallType theSmartEnergyManagementPsPriceCalculationRequestCall;
            theSmartEnergyManagementPsPriceCalculationRequestCall = this.getSmartEnergyManagementPsPriceCalculationRequestCall();
            if (this.smartEnergyManagementPsPriceCalculationRequestCall!= null) {
                currentHashCode += theSmartEnergyManagementPsPriceCalculationRequestCall.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            SmartEnergyManagementPsPriceDataType theSmartEnergyManagementPsPriceData;
            theSmartEnergyManagementPsPriceData = this.getSmartEnergyManagementPsPriceData();
            if (this.smartEnergyManagementPsPriceData!= null) {
                currentHashCode += theSmartEnergyManagementPsPriceData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            SpecificationVersionListDataType theSpecificationVersionListData;
            theSpecificationVersionListData = this.getSpecificationVersionListData();
            if (this.specificationVersionListData!= null) {
                currentHashCode += theSpecificationVersionListData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            StateInformationListDataType theStateInformationListData;
            theStateInformationListData = this.getStateInformationListData();
            if (this.stateInformationListData!= null) {
                currentHashCode += theStateInformationListData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            SubscriptionManagementDeleteCallType theSubscriptionManagementDeleteCall;
            theSubscriptionManagementDeleteCall = this.getSubscriptionManagementDeleteCall();
            if (this.subscriptionManagementDeleteCall!= null) {
                currentHashCode += theSubscriptionManagementDeleteCall.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            SubscriptionManagementEntryListDataType theSubscriptionManagementEntryListData;
            theSubscriptionManagementEntryListData = this.getSubscriptionManagementEntryListData();
            if (this.subscriptionManagementEntryListData!= null) {
                currentHashCode += theSubscriptionManagementEntryListData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            SubscriptionManagementRequestCallType theSubscriptionManagementRequestCall;
            theSubscriptionManagementRequestCall = this.getSubscriptionManagementRequestCall();
            if (this.subscriptionManagementRequestCall!= null) {
                currentHashCode += theSubscriptionManagementRequestCall.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            SupplyConditionDescriptionListDataType theSupplyConditionDescriptionListData;
            theSupplyConditionDescriptionListData = this.getSupplyConditionDescriptionListData();
            if (this.supplyConditionDescriptionListData!= null) {
                currentHashCode += theSupplyConditionDescriptionListData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            SupplyConditionListDataType theSupplyConditionListData;
            theSupplyConditionListData = this.getSupplyConditionListData();
            if (this.supplyConditionListData!= null) {
                currentHashCode += theSupplyConditionListData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            SupplyConditionThresholdRelationListDataType theSupplyConditionThresholdRelationListData;
            theSupplyConditionThresholdRelationListData = this.getSupplyConditionThresholdRelationListData();
            if (this.supplyConditionThresholdRelationListData!= null) {
                currentHashCode += theSupplyConditionThresholdRelationListData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            TariffBoundaryRelationListDataType theTariffBoundaryRelationListData;
            theTariffBoundaryRelationListData = this.getTariffBoundaryRelationListData();
            if (this.tariffBoundaryRelationListData!= null) {
                currentHashCode += theTariffBoundaryRelationListData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            TariffDescriptionListDataType theTariffDescriptionListData;
            theTariffDescriptionListData = this.getTariffDescriptionListData();
            if (this.tariffDescriptionListData!= null) {
                currentHashCode += theTariffDescriptionListData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            TariffListDataType theTariffListData;
            theTariffListData = this.getTariffListData();
            if (this.tariffListData!= null) {
                currentHashCode += theTariffListData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            TariffOverallConstraintsDataType theTariffOverallConstraintsData;
            theTariffOverallConstraintsData = this.getTariffOverallConstraintsData();
            if (this.tariffOverallConstraintsData!= null) {
                currentHashCode += theTariffOverallConstraintsData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            TariffTierRelationListDataType theTariffTierRelationListData;
            theTariffTierRelationListData = this.getTariffTierRelationListData();
            if (this.tariffTierRelationListData!= null) {
                currentHashCode += theTariffTierRelationListData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            TaskManagementJobDescriptionListDataType theTaskManagementJobDescriptionListData;
            theTaskManagementJobDescriptionListData = this.getTaskManagementJobDescriptionListData();
            if (this.taskManagementJobDescriptionListData!= null) {
                currentHashCode += theTaskManagementJobDescriptionListData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            TaskManagementJobListDataType theTaskManagementJobListData;
            theTaskManagementJobListData = this.getTaskManagementJobListData();
            if (this.taskManagementJobListData!= null) {
                currentHashCode += theTaskManagementJobListData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            TaskManagementJobRelationListDataType theTaskManagementJobRelationListData;
            theTaskManagementJobRelationListData = this.getTaskManagementJobRelationListData();
            if (this.taskManagementJobRelationListData!= null) {
                currentHashCode += theTaskManagementJobRelationListData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            TaskManagementOverviewDataType theTaskManagementOverviewData;
            theTaskManagementOverviewData = this.getTaskManagementOverviewData();
            if (this.taskManagementOverviewData!= null) {
                currentHashCode += theTaskManagementOverviewData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ThresholdConstraintsListDataType theThresholdConstraintsListData;
            theThresholdConstraintsListData = this.getThresholdConstraintsListData();
            if (this.thresholdConstraintsListData!= null) {
                currentHashCode += theThresholdConstraintsListData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ThresholdDescriptionListDataType theThresholdDescriptionListData;
            theThresholdDescriptionListData = this.getThresholdDescriptionListData();
            if (this.thresholdDescriptionListData!= null) {
                currentHashCode += theThresholdDescriptionListData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ThresholdListDataType theThresholdListData;
            theThresholdListData = this.getThresholdListData();
            if (this.thresholdListData!= null) {
                currentHashCode += theThresholdListData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            TierBoundaryDescriptionListDataType theTierBoundaryDescriptionListData;
            theTierBoundaryDescriptionListData = this.getTierBoundaryDescriptionListData();
            if (this.tierBoundaryDescriptionListData!= null) {
                currentHashCode += theTierBoundaryDescriptionListData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            TierBoundaryListDataType theTierBoundaryListData;
            theTierBoundaryListData = this.getTierBoundaryListData();
            if (this.tierBoundaryListData!= null) {
                currentHashCode += theTierBoundaryListData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            TierDescriptionListDataType theTierDescriptionListData;
            theTierDescriptionListData = this.getTierDescriptionListData();
            if (this.tierDescriptionListData!= null) {
                currentHashCode += theTierDescriptionListData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            TierIncentiveRelationListDataType theTierIncentiveRelationListData;
            theTierIncentiveRelationListData = this.getTierIncentiveRelationListData();
            if (this.tierIncentiveRelationListData!= null) {
                currentHashCode += theTierIncentiveRelationListData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            TierListDataType theTierListData;
            theTierListData = this.getTierListData();
            if (this.tierListData!= null) {
                currentHashCode += theTierListData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            TimeDistributorDataType theTimeDistributorData;
            theTimeDistributorData = this.getTimeDistributorData();
            if (this.timeDistributorData!= null) {
                currentHashCode += theTimeDistributorData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            TimeDistributorEnquiryCallType theTimeDistributorEnquiryCall;
            theTimeDistributorEnquiryCall = this.getTimeDistributorEnquiryCall();
            if (this.timeDistributorEnquiryCall!= null) {
                currentHashCode += theTimeDistributorEnquiryCall.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            TimeInformationDataType theTimeInformationData;
            theTimeInformationData = this.getTimeInformationData();
            if (this.timeInformationData!= null) {
                currentHashCode += theTimeInformationData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            TimePrecisionDataType theTimePrecisionData;
            theTimePrecisionData = this.getTimePrecisionData();
            if (this.timePrecisionData!= null) {
                currentHashCode += theTimePrecisionData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            TimeSeriesConstraintsListDataType theTimeSeriesConstraintsListData;
            theTimeSeriesConstraintsListData = this.getTimeSeriesConstraintsListData();
            if (this.timeSeriesConstraintsListData!= null) {
                currentHashCode += theTimeSeriesConstraintsListData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            TimeSeriesDescriptionListDataType theTimeSeriesDescriptionListData;
            theTimeSeriesDescriptionListData = this.getTimeSeriesDescriptionListData();
            if (this.timeSeriesDescriptionListData!= null) {
                currentHashCode += theTimeSeriesDescriptionListData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            TimeSeriesListDataType theTimeSeriesListData;
            theTimeSeriesListData = this.getTimeSeriesListData();
            if (this.timeSeriesListData!= null) {
                currentHashCode += theTimeSeriesListData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            TimeTableConstraintsListDataType theTimeTableConstraintsListData;
            theTimeTableConstraintsListData = this.getTimeTableConstraintsListData();
            if (this.timeTableConstraintsListData!= null) {
                currentHashCode += theTimeTableConstraintsListData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            TimeTableDescriptionListDataType theTimeTableDescriptionListData;
            theTimeTableDescriptionListData = this.getTimeTableDescriptionListData();
            if (this.timeTableDescriptionListData!= null) {
                currentHashCode += theTimeTableDescriptionListData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            TimeTableListDataType theTimeTableListData;
            theTimeTableListData = this.getTimeTableListData();
            if (this.timeTableListData!= null) {
                currentHashCode += theTimeTableListData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            UseCaseInformationListDataType theUseCaseInformationListData;
            theUseCaseInformationListData = this.getUseCaseInformationListData();
            if (this.useCaseInformationListData!= null) {
                currentHashCode += theUseCaseInformationListData.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            byte[] theManufacturerSpecificExtension;
            theManufacturerSpecificExtension = this.getManufacturerSpecificExtension();
            currentHashCode += Arrays.hashCode(theManufacturerSpecificExtension);
        }
        {
            currentHashCode = (currentHashCode* 31);
            String theLastUpdateAt;
            theLastUpdateAt = this.getLastUpdateAt();
            if (this.lastUpdateAt!= null) {
                currentHashCode += theLastUpdateAt.hashCode();
            }
        }
        return currentHashCode;
    }

    @Override
    public String toString() {
        final ToStringStrategy strategy = new CustomToStringStrategy();
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    @Override
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        {
            String theFunction;
            theFunction = this.getFunction();
            strategy.appendField(locator, this, "function", buffer, theFunction, (this.function!= null));
        }
        {
            List<FilterType> theFilter;
            theFilter = (((this.filter!= null)&&(!this.filter.isEmpty()))?this.getFilter():null);
            strategy.appendField(locator, this, "filter", buffer, theFilter, ((this.filter!= null)&&(!this.filter.isEmpty())));
        }
        {
            ActuatorLevelDataType theActuatorLevelData;
            theActuatorLevelData = this.getActuatorLevelData();
            strategy.appendField(locator, this, "actuatorLevelData", buffer, theActuatorLevelData, (this.actuatorLevelData!= null));
        }
        {
            ActuatorLevelDescriptionDataType theActuatorLevelDescriptionData;
            theActuatorLevelDescriptionData = this.getActuatorLevelDescriptionData();
            strategy.appendField(locator, this, "actuatorLevelDescriptionData", buffer, theActuatorLevelDescriptionData, (this.actuatorLevelDescriptionData!= null));
        }
        {
            ActuatorSwitchDataType theActuatorSwitchData;
            theActuatorSwitchData = this.getActuatorSwitchData();
            strategy.appendField(locator, this, "actuatorSwitchData", buffer, theActuatorSwitchData, (this.actuatorSwitchData!= null));
        }
        {
            ActuatorSwitchDescriptionDataType theActuatorSwitchDescriptionData;
            theActuatorSwitchDescriptionData = this.getActuatorSwitchDescriptionData();
            strategy.appendField(locator, this, "actuatorSwitchDescriptionData", buffer, theActuatorSwitchDescriptionData, (this.actuatorSwitchDescriptionData!= null));
        }
        {
            AlarmListDataType theAlarmListData;
            theAlarmListData = this.getAlarmListData();
            strategy.appendField(locator, this, "alarmListData", buffer, theAlarmListData, (this.alarmListData!= null));
        }
        {
            BillConstraintsListDataType theBillConstraintsListData;
            theBillConstraintsListData = this.getBillConstraintsListData();
            strategy.appendField(locator, this, "billConstraintsListData", buffer, theBillConstraintsListData, (this.billConstraintsListData!= null));
        }
        {
            BillDescriptionListDataType theBillDescriptionListData;
            theBillDescriptionListData = this.getBillDescriptionListData();
            strategy.appendField(locator, this, "billDescriptionListData", buffer, theBillDescriptionListData, (this.billDescriptionListData!= null));
        }
        {
            BillListDataType theBillListData;
            theBillListData = this.getBillListData();
            strategy.appendField(locator, this, "billListData", buffer, theBillListData, (this.billListData!= null));
        }
        {
            BindingManagementDeleteCallType theBindingManagementDeleteCall;
            theBindingManagementDeleteCall = this.getBindingManagementDeleteCall();
            strategy.appendField(locator, this, "bindingManagementDeleteCall", buffer, theBindingManagementDeleteCall, (this.bindingManagementDeleteCall!= null));
        }
        {
            BindingManagementEntryListDataType theBindingManagementEntryListData;
            theBindingManagementEntryListData = this.getBindingManagementEntryListData();
            strategy.appendField(locator, this, "bindingManagementEntryListData", buffer, theBindingManagementEntryListData, (this.bindingManagementEntryListData!= null));
        }
        {
            BindingManagementRequestCallType theBindingManagementRequestCall;
            theBindingManagementRequestCall = this.getBindingManagementRequestCall();
            strategy.appendField(locator, this, "bindingManagementRequestCall", buffer, theBindingManagementRequestCall, (this.bindingManagementRequestCall!= null));
        }
        {
            CommodityListDataType theCommodityListData;
            theCommodityListData = this.getCommodityListData();
            strategy.appendField(locator, this, "commodityListData", buffer, theCommodityListData, (this.commodityListData!= null));
        }
        {
            DataTunnelingCallType theDataTunnelingCall;
            theDataTunnelingCall = this.getDataTunnelingCall();
            strategy.appendField(locator, this, "dataTunnelingCall", buffer, theDataTunnelingCall, (this.dataTunnelingCall!= null));
        }
        {
            DeviceClassificationManufacturerDataType theDeviceClassificationManufacturerData;
            theDeviceClassificationManufacturerData = this.getDeviceClassificationManufacturerData();
            strategy.appendField(locator, this, "deviceClassificationManufacturerData", buffer, theDeviceClassificationManufacturerData, (this.deviceClassificationManufacturerData!= null));
        }
        {
            DeviceClassificationUserDataType theDeviceClassificationUserData;
            theDeviceClassificationUserData = this.getDeviceClassificationUserData();
            strategy.appendField(locator, this, "deviceClassificationUserData", buffer, theDeviceClassificationUserData, (this.deviceClassificationUserData!= null));
        }
        {
            DeviceConfigurationKeyValueConstraintsListDataType theDeviceConfigurationKeyValueConstraintsListData;
            theDeviceConfigurationKeyValueConstraintsListData = this.getDeviceConfigurationKeyValueConstraintsListData();
            strategy.appendField(locator, this, "deviceConfigurationKeyValueConstraintsListData", buffer, theDeviceConfigurationKeyValueConstraintsListData, (this.deviceConfigurationKeyValueConstraintsListData!= null));
        }
        {
            DeviceConfigurationKeyValueDescriptionListDataType theDeviceConfigurationKeyValueDescriptionListData;
            theDeviceConfigurationKeyValueDescriptionListData = this.getDeviceConfigurationKeyValueDescriptionListData();
            strategy.appendField(locator, this, "deviceConfigurationKeyValueDescriptionListData", buffer, theDeviceConfigurationKeyValueDescriptionListData, (this.deviceConfigurationKeyValueDescriptionListData!= null));
        }
        {
            DeviceConfigurationKeyValueListDataType theDeviceConfigurationKeyValueListData;
            theDeviceConfigurationKeyValueListData = this.getDeviceConfigurationKeyValueListData();
            strategy.appendField(locator, this, "deviceConfigurationKeyValueListData", buffer, theDeviceConfigurationKeyValueListData, (this.deviceConfigurationKeyValueListData!= null));
        }
        {
            DeviceDiagnosisHeartbeatDataType theDeviceDiagnosisHeartbeatData;
            theDeviceDiagnosisHeartbeatData = this.getDeviceDiagnosisHeartbeatData();
            strategy.appendField(locator, this, "deviceDiagnosisHeartbeatData", buffer, theDeviceDiagnosisHeartbeatData, (this.deviceDiagnosisHeartbeatData!= null));
        }
        {
            DeviceDiagnosisServiceDataType theDeviceDiagnosisServiceData;
            theDeviceDiagnosisServiceData = this.getDeviceDiagnosisServiceData();
            strategy.appendField(locator, this, "deviceDiagnosisServiceData", buffer, theDeviceDiagnosisServiceData, (this.deviceDiagnosisServiceData!= null));
        }
        {
            DeviceDiagnosisStateDataType theDeviceDiagnosisStateData;
            theDeviceDiagnosisStateData = this.getDeviceDiagnosisStateData();
            strategy.appendField(locator, this, "deviceDiagnosisStateData", buffer, theDeviceDiagnosisStateData, (this.deviceDiagnosisStateData!= null));
        }
        {
            DirectControlActivityListDataType theDirectControlActivityListData;
            theDirectControlActivityListData = this.getDirectControlActivityListData();
            strategy.appendField(locator, this, "directControlActivityListData", buffer, theDirectControlActivityListData, (this.directControlActivityListData!= null));
        }
        {
            DirectControlDescriptionDataType theDirectControlDescriptionData;
            theDirectControlDescriptionData = this.getDirectControlDescriptionData();
            strategy.appendField(locator, this, "directControlDescriptionData", buffer, theDirectControlDescriptionData, (this.directControlDescriptionData!= null));
        }
        {
            ElectricalConnectionCharacteristicListDataType theElectricalConnectionCharacteristicListData;
            theElectricalConnectionCharacteristicListData = this.getElectricalConnectionCharacteristicListData();
            strategy.appendField(locator, this, "electricalConnectionCharacteristicListData", buffer, theElectricalConnectionCharacteristicListData, (this.electricalConnectionCharacteristicListData!= null));
        }
        {
            ElectricalConnectionDescriptionListDataType theElectricalConnectionDescriptionListData;
            theElectricalConnectionDescriptionListData = this.getElectricalConnectionDescriptionListData();
            strategy.appendField(locator, this, "electricalConnectionDescriptionListData", buffer, theElectricalConnectionDescriptionListData, (this.electricalConnectionDescriptionListData!= null));
        }
        {
            ElectricalConnectionParameterDescriptionListDataType theElectricalConnectionParameterDescriptionListData;
            theElectricalConnectionParameterDescriptionListData = this.getElectricalConnectionParameterDescriptionListData();
            strategy.appendField(locator, this, "electricalConnectionParameterDescriptionListData", buffer, theElectricalConnectionParameterDescriptionListData, (this.electricalConnectionParameterDescriptionListData!= null));
        }
        {
            ElectricalConnectionPermittedValueSetListDataType theElectricalConnectionPermittedValueSetListData;
            theElectricalConnectionPermittedValueSetListData = this.getElectricalConnectionPermittedValueSetListData();
            strategy.appendField(locator, this, "electricalConnectionPermittedValueSetListData", buffer, theElectricalConnectionPermittedValueSetListData, (this.electricalConnectionPermittedValueSetListData!= null));
        }
        {
            ElectricalConnectionStateListDataType theElectricalConnectionStateListData;
            theElectricalConnectionStateListData = this.getElectricalConnectionStateListData();
            strategy.appendField(locator, this, "electricalConnectionStateListData", buffer, theElectricalConnectionStateListData, (this.electricalConnectionStateListData!= null));
        }
        {
            HvacOperationModeDescriptionListDataType theHvacOperationModeDescriptionListData;
            theHvacOperationModeDescriptionListData = this.getHvacOperationModeDescriptionListData();
            strategy.appendField(locator, this, "hvacOperationModeDescriptionListData", buffer, theHvacOperationModeDescriptionListData, (this.hvacOperationModeDescriptionListData!= null));
        }
        {
            HvacOverrunDescriptionListDataType theHvacOverrunDescriptionListData;
            theHvacOverrunDescriptionListData = this.getHvacOverrunDescriptionListData();
            strategy.appendField(locator, this, "hvacOverrunDescriptionListData", buffer, theHvacOverrunDescriptionListData, (this.hvacOverrunDescriptionListData!= null));
        }
        {
            HvacOverrunListDataType theHvacOverrunListData;
            theHvacOverrunListData = this.getHvacOverrunListData();
            strategy.appendField(locator, this, "hvacOverrunListData", buffer, theHvacOverrunListData, (this.hvacOverrunListData!= null));
        }
        {
            HvacSystemFunctionDescriptionListDataType theHvacSystemFunctionDescriptionListData;
            theHvacSystemFunctionDescriptionListData = this.getHvacSystemFunctionDescriptionListData();
            strategy.appendField(locator, this, "hvacSystemFunctionDescriptionListData", buffer, theHvacSystemFunctionDescriptionListData, (this.hvacSystemFunctionDescriptionListData!= null));
        }
        {
            HvacSystemFunctionListDataType theHvacSystemFunctionListData;
            theHvacSystemFunctionListData = this.getHvacSystemFunctionListData();
            strategy.appendField(locator, this, "hvacSystemFunctionListData", buffer, theHvacSystemFunctionListData, (this.hvacSystemFunctionListData!= null));
        }
        {
            HvacSystemFunctionOperationModeRelationListDataType theHvacSystemFunctionOperationModeRelationListData;
            theHvacSystemFunctionOperationModeRelationListData = this.getHvacSystemFunctionOperationModeRelationListData();
            strategy.appendField(locator, this, "hvacSystemFunctionOperationModeRelationListData", buffer, theHvacSystemFunctionOperationModeRelationListData, (this.hvacSystemFunctionOperationModeRelationListData!= null));
        }
        {
            HvacSystemFunctionPowerSequenceRelationListDataType theHvacSystemFunctionPowerSequenceRelationListData;
            theHvacSystemFunctionPowerSequenceRelationListData = this.getHvacSystemFunctionPowerSequenceRelationListData();
            strategy.appendField(locator, this, "hvacSystemFunctionPowerSequenceRelationListData", buffer, theHvacSystemFunctionPowerSequenceRelationListData, (this.hvacSystemFunctionPowerSequenceRelationListData!= null));
        }
        {
            HvacSystemFunctionSetpointRelationListDataType theHvacSystemFunctionSetpointRelationListData;
            theHvacSystemFunctionSetpointRelationListData = this.getHvacSystemFunctionSetpointRelationListData();
            strategy.appendField(locator, this, "hvacSystemFunctionSetpointRelationListData", buffer, theHvacSystemFunctionSetpointRelationListData, (this.hvacSystemFunctionSetpointRelationListData!= null));
        }
        {
            IdentificationListDataType theIdentificationListData;
            theIdentificationListData = this.getIdentificationListData();
            strategy.appendField(locator, this, "identificationListData", buffer, theIdentificationListData, (this.identificationListData!= null));
        }
        {
            IncentiveDescriptionListDataType theIncentiveDescriptionListData;
            theIncentiveDescriptionListData = this.getIncentiveDescriptionListData();
            strategy.appendField(locator, this, "incentiveDescriptionListData", buffer, theIncentiveDescriptionListData, (this.incentiveDescriptionListData!= null));
        }
        {
            IncentiveListDataType theIncentiveListData;
            theIncentiveListData = this.getIncentiveListData();
            strategy.appendField(locator, this, "incentiveListData", buffer, theIncentiveListData, (this.incentiveListData!= null));
        }
        {
            IncentiveTableConstraintsDataType theIncentiveTableConstraintsData;
            theIncentiveTableConstraintsData = this.getIncentiveTableConstraintsData();
            strategy.appendField(locator, this, "incentiveTableConstraintsData", buffer, theIncentiveTableConstraintsData, (this.incentiveTableConstraintsData!= null));
        }
        {
            IncentiveTableDataType theIncentiveTableData;
            theIncentiveTableData = this.getIncentiveTableData();
            strategy.appendField(locator, this, "incentiveTableData", buffer, theIncentiveTableData, (this.incentiveTableData!= null));
        }
        {
            IncentiveTableDescriptionDataType theIncentiveTableDescriptionData;
            theIncentiveTableDescriptionData = this.getIncentiveTableDescriptionData();
            strategy.appendField(locator, this, "incentiveTableDescriptionData", buffer, theIncentiveTableDescriptionData, (this.incentiveTableDescriptionData!= null));
        }
        {
            LoadControlEventListDataType theLoadControlEventListData;
            theLoadControlEventListData = this.getLoadControlEventListData();
            strategy.appendField(locator, this, "loadControlEventListData", buffer, theLoadControlEventListData, (this.loadControlEventListData!= null));
        }
        {
            LoadControlLimitConstraintsListDataType theLoadControlLimitConstraintsListData;
            theLoadControlLimitConstraintsListData = this.getLoadControlLimitConstraintsListData();
            strategy.appendField(locator, this, "loadControlLimitConstraintsListData", buffer, theLoadControlLimitConstraintsListData, (this.loadControlLimitConstraintsListData!= null));
        }
        {
            LoadControlLimitDescriptionListDataType theLoadControlLimitDescriptionListData;
            theLoadControlLimitDescriptionListData = this.getLoadControlLimitDescriptionListData();
            strategy.appendField(locator, this, "loadControlLimitDescriptionListData", buffer, theLoadControlLimitDescriptionListData, (this.loadControlLimitDescriptionListData!= null));
        }
        {
            LoadControlLimitListDataType theLoadControlLimitListData;
            theLoadControlLimitListData = this.getLoadControlLimitListData();
            strategy.appendField(locator, this, "loadControlLimitListData", buffer, theLoadControlLimitListData, (this.loadControlLimitListData!= null));
        }
        {
            LoadControlNodeDataType theLoadControlNodeData;
            theLoadControlNodeData = this.getLoadControlNodeData();
            strategy.appendField(locator, this, "loadControlNodeData", buffer, theLoadControlNodeData, (this.loadControlNodeData!= null));
        }
        {
            LoadControlStateListDataType theLoadControlStateListData;
            theLoadControlStateListData = this.getLoadControlStateListData();
            strategy.appendField(locator, this, "loadControlStateListData", buffer, theLoadControlStateListData, (this.loadControlStateListData!= null));
        }
        {
            MeasurementConstraintsListDataType theMeasurementConstraintsListData;
            theMeasurementConstraintsListData = this.getMeasurementConstraintsListData();
            strategy.appendField(locator, this, "measurementConstraintsListData", buffer, theMeasurementConstraintsListData, (this.measurementConstraintsListData!= null));
        }
        {
            MeasurementDescriptionListDataType theMeasurementDescriptionListData;
            theMeasurementDescriptionListData = this.getMeasurementDescriptionListData();
            strategy.appendField(locator, this, "measurementDescriptionListData", buffer, theMeasurementDescriptionListData, (this.measurementDescriptionListData!= null));
        }
        {
            MeasurementListDataType theMeasurementListData;
            theMeasurementListData = this.getMeasurementListData();
            strategy.appendField(locator, this, "measurementListData", buffer, theMeasurementListData, (this.measurementListData!= null));
        }
        {
            MeasurementSeriesListDataType theMeasurementSeriesListData;
            theMeasurementSeriesListData = this.getMeasurementSeriesListData();
            strategy.appendField(locator, this, "measurementSeriesListData", buffer, theMeasurementSeriesListData, (this.measurementSeriesListData!= null));
        }
        {
            MeasurementThresholdRelationListDataType theMeasurementThresholdRelationListData;
            theMeasurementThresholdRelationListData = this.getMeasurementThresholdRelationListData();
            strategy.appendField(locator, this, "measurementThresholdRelationListData", buffer, theMeasurementThresholdRelationListData, (this.measurementThresholdRelationListData!= null));
        }
        {
            MessagingListDataType theMessagingListData;
            theMessagingListData = this.getMessagingListData();
            strategy.appendField(locator, this, "messagingListData", buffer, theMessagingListData, (this.messagingListData!= null));
        }
        {
            NetworkManagementAbortCallType theNetworkManagementAbortCall;
            theNetworkManagementAbortCall = this.getNetworkManagementAbortCall();
            strategy.appendField(locator, this, "networkManagementAbortCall", buffer, theNetworkManagementAbortCall, (this.networkManagementAbortCall!= null));
        }
        {
            NetworkManagementAddNodeCallType theNetworkManagementAddNodeCall;
            theNetworkManagementAddNodeCall = this.getNetworkManagementAddNodeCall();
            strategy.appendField(locator, this, "networkManagementAddNodeCall", buffer, theNetworkManagementAddNodeCall, (this.networkManagementAddNodeCall!= null));
        }
        {
            NetworkManagementDeviceDescriptionListDataType theNetworkManagementDeviceDescriptionListData;
            theNetworkManagementDeviceDescriptionListData = this.getNetworkManagementDeviceDescriptionListData();
            strategy.appendField(locator, this, "networkManagementDeviceDescriptionListData", buffer, theNetworkManagementDeviceDescriptionListData, (this.networkManagementDeviceDescriptionListData!= null));
        }
        {
            NetworkManagementDiscoverCallType theNetworkManagementDiscoverCall;
            theNetworkManagementDiscoverCall = this.getNetworkManagementDiscoverCall();
            strategy.appendField(locator, this, "networkManagementDiscoverCall", buffer, theNetworkManagementDiscoverCall, (this.networkManagementDiscoverCall!= null));
        }
        {
            NetworkManagementEntityDescriptionListDataType theNetworkManagementEntityDescriptionListData;
            theNetworkManagementEntityDescriptionListData = this.getNetworkManagementEntityDescriptionListData();
            strategy.appendField(locator, this, "networkManagementEntityDescriptionListData", buffer, theNetworkManagementEntityDescriptionListData, (this.networkManagementEntityDescriptionListData!= null));
        }
        {
            NetworkManagementFeatureDescriptionListDataType theNetworkManagementFeatureDescriptionListData;
            theNetworkManagementFeatureDescriptionListData = this.getNetworkManagementFeatureDescriptionListData();
            strategy.appendField(locator, this, "networkManagementFeatureDescriptionListData", buffer, theNetworkManagementFeatureDescriptionListData, (this.networkManagementFeatureDescriptionListData!= null));
        }
        {
            NetworkManagementJoiningModeDataType theNetworkManagementJoiningModeData;
            theNetworkManagementJoiningModeData = this.getNetworkManagementJoiningModeData();
            strategy.appendField(locator, this, "networkManagementJoiningModeData", buffer, theNetworkManagementJoiningModeData, (this.networkManagementJoiningModeData!= null));
        }
        {
            NetworkManagementModifyNodeCallType theNetworkManagementModifyNodeCall;
            theNetworkManagementModifyNodeCall = this.getNetworkManagementModifyNodeCall();
            strategy.appendField(locator, this, "networkManagementModifyNodeCall", buffer, theNetworkManagementModifyNodeCall, (this.networkManagementModifyNodeCall!= null));
        }
        {
            NetworkManagementProcessStateDataType theNetworkManagementProcessStateData;
            theNetworkManagementProcessStateData = this.getNetworkManagementProcessStateData();
            strategy.appendField(locator, this, "networkManagementProcessStateData", buffer, theNetworkManagementProcessStateData, (this.networkManagementProcessStateData!= null));
        }
        {
            NetworkManagementRemoveNodeCallType theNetworkManagementRemoveNodeCall;
            theNetworkManagementRemoveNodeCall = this.getNetworkManagementRemoveNodeCall();
            strategy.appendField(locator, this, "networkManagementRemoveNodeCall", buffer, theNetworkManagementRemoveNodeCall, (this.networkManagementRemoveNodeCall!= null));
        }
        {
            NetworkManagementReportCandidateDataType theNetworkManagementReportCandidateData;
            theNetworkManagementReportCandidateData = this.getNetworkManagementReportCandidateData();
            strategy.appendField(locator, this, "networkManagementReportCandidateData", buffer, theNetworkManagementReportCandidateData, (this.networkManagementReportCandidateData!= null));
        }
        {
            NetworkManagementScanNetworkCallType theNetworkManagementScanNetworkCall;
            theNetworkManagementScanNetworkCall = this.getNetworkManagementScanNetworkCall();
            strategy.appendField(locator, this, "networkManagementScanNetworkCall", buffer, theNetworkManagementScanNetworkCall, (this.networkManagementScanNetworkCall!= null));
        }
        {
            NodeManagementBindingDataType theNodeManagementBindingData;
            theNodeManagementBindingData = this.getNodeManagementBindingData();
            strategy.appendField(locator, this, "nodeManagementBindingData", buffer, theNodeManagementBindingData, (this.nodeManagementBindingData!= null));
        }
        {
            NodeManagementBindingDeleteCallType theNodeManagementBindingDeleteCall;
            theNodeManagementBindingDeleteCall = this.getNodeManagementBindingDeleteCall();
            strategy.appendField(locator, this, "nodeManagementBindingDeleteCall", buffer, theNodeManagementBindingDeleteCall, (this.nodeManagementBindingDeleteCall!= null));
        }
        {
            NodeManagementBindingRequestCallType theNodeManagementBindingRequestCall;
            theNodeManagementBindingRequestCall = this.getNodeManagementBindingRequestCall();
            strategy.appendField(locator, this, "nodeManagementBindingRequestCall", buffer, theNodeManagementBindingRequestCall, (this.nodeManagementBindingRequestCall!= null));
        }
        {
            NodeManagementDestinationListDataType theNodeManagementDestinationListData;
            theNodeManagementDestinationListData = this.getNodeManagementDestinationListData();
            strategy.appendField(locator, this, "nodeManagementDestinationListData", buffer, theNodeManagementDestinationListData, (this.nodeManagementDestinationListData!= null));
        }
        {
            NodeManagementDetailedDiscoveryDataType theNodeManagementDetailedDiscoveryData;
            theNodeManagementDetailedDiscoveryData = this.getNodeManagementDetailedDiscoveryData();
            strategy.appendField(locator, this, "nodeManagementDetailedDiscoveryData", buffer, theNodeManagementDetailedDiscoveryData, (this.nodeManagementDetailedDiscoveryData!= null));
        }
        {
            NodeManagementSubscriptionDataType theNodeManagementSubscriptionData;
            theNodeManagementSubscriptionData = this.getNodeManagementSubscriptionData();
            strategy.appendField(locator, this, "nodeManagementSubscriptionData", buffer, theNodeManagementSubscriptionData, (this.nodeManagementSubscriptionData!= null));
        }
        {
            NodeManagementSubscriptionDeleteCallType theNodeManagementSubscriptionDeleteCall;
            theNodeManagementSubscriptionDeleteCall = this.getNodeManagementSubscriptionDeleteCall();
            strategy.appendField(locator, this, "nodeManagementSubscriptionDeleteCall", buffer, theNodeManagementSubscriptionDeleteCall, (this.nodeManagementSubscriptionDeleteCall!= null));
        }
        {
            NodeManagementSubscriptionRequestCallType theNodeManagementSubscriptionRequestCall;
            theNodeManagementSubscriptionRequestCall = this.getNodeManagementSubscriptionRequestCall();
            strategy.appendField(locator, this, "nodeManagementSubscriptionRequestCall", buffer, theNodeManagementSubscriptionRequestCall, (this.nodeManagementSubscriptionRequestCall!= null));
        }
        {
            NodeManagementUseCaseDataType theNodeManagementUseCaseData;
            theNodeManagementUseCaseData = this.getNodeManagementUseCaseData();
            strategy.appendField(locator, this, "nodeManagementUseCaseData", buffer, theNodeManagementUseCaseData, (this.nodeManagementUseCaseData!= null));
        }
        {
            OperatingConstraintsDurationListDataType theOperatingConstraintsDurationListData;
            theOperatingConstraintsDurationListData = this.getOperatingConstraintsDurationListData();
            strategy.appendField(locator, this, "operatingConstraintsDurationListData", buffer, theOperatingConstraintsDurationListData, (this.operatingConstraintsDurationListData!= null));
        }
        {
            OperatingConstraintsInterruptListDataType theOperatingConstraintsInterruptListData;
            theOperatingConstraintsInterruptListData = this.getOperatingConstraintsInterruptListData();
            strategy.appendField(locator, this, "operatingConstraintsInterruptListData", buffer, theOperatingConstraintsInterruptListData, (this.operatingConstraintsInterruptListData!= null));
        }
        {
            OperatingConstraintsPowerDescriptionListDataType theOperatingConstraintsPowerDescriptionListData;
            theOperatingConstraintsPowerDescriptionListData = this.getOperatingConstraintsPowerDescriptionListData();
            strategy.appendField(locator, this, "operatingConstraintsPowerDescriptionListData", buffer, theOperatingConstraintsPowerDescriptionListData, (this.operatingConstraintsPowerDescriptionListData!= null));
        }
        {
            OperatingConstraintsPowerLevelListDataType theOperatingConstraintsPowerLevelListData;
            theOperatingConstraintsPowerLevelListData = this.getOperatingConstraintsPowerLevelListData();
            strategy.appendField(locator, this, "operatingConstraintsPowerLevelListData", buffer, theOperatingConstraintsPowerLevelListData, (this.operatingConstraintsPowerLevelListData!= null));
        }
        {
            OperatingConstraintsPowerRangeListDataType theOperatingConstraintsPowerRangeListData;
            theOperatingConstraintsPowerRangeListData = this.getOperatingConstraintsPowerRangeListData();
            strategy.appendField(locator, this, "operatingConstraintsPowerRangeListData", buffer, theOperatingConstraintsPowerRangeListData, (this.operatingConstraintsPowerRangeListData!= null));
        }
        {
            OperatingConstraintsResumeImplicationListDataType theOperatingConstraintsResumeImplicationListData;
            theOperatingConstraintsResumeImplicationListData = this.getOperatingConstraintsResumeImplicationListData();
            strategy.appendField(locator, this, "operatingConstraintsResumeImplicationListData", buffer, theOperatingConstraintsResumeImplicationListData, (this.operatingConstraintsResumeImplicationListData!= null));
        }
        {
            PowerSequenceAlternativesRelationListDataType thePowerSequenceAlternativesRelationListData;
            thePowerSequenceAlternativesRelationListData = this.getPowerSequenceAlternativesRelationListData();
            strategy.appendField(locator, this, "powerSequenceAlternativesRelationListData", buffer, thePowerSequenceAlternativesRelationListData, (this.powerSequenceAlternativesRelationListData!= null));
        }
        {
            PowerSequenceDescriptionListDataType thePowerSequenceDescriptionListData;
            thePowerSequenceDescriptionListData = this.getPowerSequenceDescriptionListData();
            strategy.appendField(locator, this, "powerSequenceDescriptionListData", buffer, thePowerSequenceDescriptionListData, (this.powerSequenceDescriptionListData!= null));
        }
        {
            PowerSequenceNodeScheduleInformationDataType thePowerSequenceNodeScheduleInformationData;
            thePowerSequenceNodeScheduleInformationData = this.getPowerSequenceNodeScheduleInformationData();
            strategy.appendField(locator, this, "powerSequenceNodeScheduleInformationData", buffer, thePowerSequenceNodeScheduleInformationData, (this.powerSequenceNodeScheduleInformationData!= null));
        }
        {
            PowerSequencePriceCalculationRequestCallType thePowerSequencePriceCalculationRequestCall;
            thePowerSequencePriceCalculationRequestCall = this.getPowerSequencePriceCalculationRequestCall();
            strategy.appendField(locator, this, "powerSequencePriceCalculationRequestCall", buffer, thePowerSequencePriceCalculationRequestCall, (this.powerSequencePriceCalculationRequestCall!= null));
        }
        {
            PowerSequencePriceListDataType thePowerSequencePriceListData;
            thePowerSequencePriceListData = this.getPowerSequencePriceListData();
            strategy.appendField(locator, this, "powerSequencePriceListData", buffer, thePowerSequencePriceListData, (this.powerSequencePriceListData!= null));
        }
        {
            PowerSequenceScheduleConfigurationRequestCallType thePowerSequenceScheduleConfigurationRequestCall;
            thePowerSequenceScheduleConfigurationRequestCall = this.getPowerSequenceScheduleConfigurationRequestCall();
            strategy.appendField(locator, this, "powerSequenceScheduleConfigurationRequestCall", buffer, thePowerSequenceScheduleConfigurationRequestCall, (this.powerSequenceScheduleConfigurationRequestCall!= null));
        }
        {
            PowerSequenceScheduleConstraintsListDataType thePowerSequenceScheduleConstraintsListData;
            thePowerSequenceScheduleConstraintsListData = this.getPowerSequenceScheduleConstraintsListData();
            strategy.appendField(locator, this, "powerSequenceScheduleConstraintsListData", buffer, thePowerSequenceScheduleConstraintsListData, (this.powerSequenceScheduleConstraintsListData!= null));
        }
        {
            PowerSequenceScheduleListDataType thePowerSequenceScheduleListData;
            thePowerSequenceScheduleListData = this.getPowerSequenceScheduleListData();
            strategy.appendField(locator, this, "powerSequenceScheduleListData", buffer, thePowerSequenceScheduleListData, (this.powerSequenceScheduleListData!= null));
        }
        {
            PowerSequenceSchedulePreferenceListDataType thePowerSequenceSchedulePreferenceListData;
            thePowerSequenceSchedulePreferenceListData = this.getPowerSequenceSchedulePreferenceListData();
            strategy.appendField(locator, this, "powerSequenceSchedulePreferenceListData", buffer, thePowerSequenceSchedulePreferenceListData, (this.powerSequenceSchedulePreferenceListData!= null));
        }
        {
            PowerSequenceStateListDataType thePowerSequenceStateListData;
            thePowerSequenceStateListData = this.getPowerSequenceStateListData();
            strategy.appendField(locator, this, "powerSequenceStateListData", buffer, thePowerSequenceStateListData, (this.powerSequenceStateListData!= null));
        }
        {
            PowerTimeSlotScheduleConstraintsListDataType thePowerTimeSlotScheduleConstraintsListData;
            thePowerTimeSlotScheduleConstraintsListData = this.getPowerTimeSlotScheduleConstraintsListData();
            strategy.appendField(locator, this, "powerTimeSlotScheduleConstraintsListData", buffer, thePowerTimeSlotScheduleConstraintsListData, (this.powerTimeSlotScheduleConstraintsListData!= null));
        }
        {
            PowerTimeSlotScheduleListDataType thePowerTimeSlotScheduleListData;
            thePowerTimeSlotScheduleListData = this.getPowerTimeSlotScheduleListData();
            strategy.appendField(locator, this, "powerTimeSlotScheduleListData", buffer, thePowerTimeSlotScheduleListData, (this.powerTimeSlotScheduleListData!= null));
        }
        {
            PowerTimeSlotValueListDataType thePowerTimeSlotValueListData;
            thePowerTimeSlotValueListData = this.getPowerTimeSlotValueListData();
            strategy.appendField(locator, this, "powerTimeSlotValueListData", buffer, thePowerTimeSlotValueListData, (this.powerTimeSlotValueListData!= null));
        }
        {
            ResultDataType theResultData;
            theResultData = this.getResultData();
            strategy.appendField(locator, this, "resultData", buffer, theResultData, (this.resultData!= null));
        }
        {
            SensingDescriptionDataType theSensingDescriptionData;
            theSensingDescriptionData = this.getSensingDescriptionData();
            strategy.appendField(locator, this, "sensingDescriptionData", buffer, theSensingDescriptionData, (this.sensingDescriptionData!= null));
        }
        {
            SensingListDataType theSensingListData;
            theSensingListData = this.getSensingListData();
            strategy.appendField(locator, this, "sensingListData", buffer, theSensingListData, (this.sensingListData!= null));
        }
        {
            SessionIdentificationListDataType theSessionIdentificationListData;
            theSessionIdentificationListData = this.getSessionIdentificationListData();
            strategy.appendField(locator, this, "sessionIdentificationListData", buffer, theSessionIdentificationListData, (this.sessionIdentificationListData!= null));
        }
        {
            SessionMeasurementRelationListDataType theSessionMeasurementRelationListData;
            theSessionMeasurementRelationListData = this.getSessionMeasurementRelationListData();
            strategy.appendField(locator, this, "sessionMeasurementRelationListData", buffer, theSessionMeasurementRelationListData, (this.sessionMeasurementRelationListData!= null));
        }
        {
            SetpointConstraintsListDataType theSetpointConstraintsListData;
            theSetpointConstraintsListData = this.getSetpointConstraintsListData();
            strategy.appendField(locator, this, "setpointConstraintsListData", buffer, theSetpointConstraintsListData, (this.setpointConstraintsListData!= null));
        }
        {
            SetpointDescriptionListDataType theSetpointDescriptionListData;
            theSetpointDescriptionListData = this.getSetpointDescriptionListData();
            strategy.appendField(locator, this, "setpointDescriptionListData", buffer, theSetpointDescriptionListData, (this.setpointDescriptionListData!= null));
        }
        {
            SetpointListDataType theSetpointListData;
            theSetpointListData = this.getSetpointListData();
            strategy.appendField(locator, this, "setpointListData", buffer, theSetpointListData, (this.setpointListData!= null));
        }
        {
            SmartEnergyManagementPsConfigurationRequestCallType theSmartEnergyManagementPsConfigurationRequestCall;
            theSmartEnergyManagementPsConfigurationRequestCall = this.getSmartEnergyManagementPsConfigurationRequestCall();
            strategy.appendField(locator, this, "smartEnergyManagementPsConfigurationRequestCall", buffer, theSmartEnergyManagementPsConfigurationRequestCall, (this.smartEnergyManagementPsConfigurationRequestCall!= null));
        }
        {
            SmartEnergyManagementPsDataType theSmartEnergyManagementPsData;
            theSmartEnergyManagementPsData = this.getSmartEnergyManagementPsData();
            strategy.appendField(locator, this, "smartEnergyManagementPsData", buffer, theSmartEnergyManagementPsData, (this.smartEnergyManagementPsData!= null));
        }
        {
            SmartEnergyManagementPsPriceCalculationRequestCallType theSmartEnergyManagementPsPriceCalculationRequestCall;
            theSmartEnergyManagementPsPriceCalculationRequestCall = this.getSmartEnergyManagementPsPriceCalculationRequestCall();
            strategy.appendField(locator, this, "smartEnergyManagementPsPriceCalculationRequestCall", buffer, theSmartEnergyManagementPsPriceCalculationRequestCall, (this.smartEnergyManagementPsPriceCalculationRequestCall!= null));
        }
        {
            SmartEnergyManagementPsPriceDataType theSmartEnergyManagementPsPriceData;
            theSmartEnergyManagementPsPriceData = this.getSmartEnergyManagementPsPriceData();
            strategy.appendField(locator, this, "smartEnergyManagementPsPriceData", buffer, theSmartEnergyManagementPsPriceData, (this.smartEnergyManagementPsPriceData!= null));
        }
        {
            SpecificationVersionListDataType theSpecificationVersionListData;
            theSpecificationVersionListData = this.getSpecificationVersionListData();
            strategy.appendField(locator, this, "specificationVersionListData", buffer, theSpecificationVersionListData, (this.specificationVersionListData!= null));
        }
        {
            StateInformationListDataType theStateInformationListData;
            theStateInformationListData = this.getStateInformationListData();
            strategy.appendField(locator, this, "stateInformationListData", buffer, theStateInformationListData, (this.stateInformationListData!= null));
        }
        {
            SubscriptionManagementDeleteCallType theSubscriptionManagementDeleteCall;
            theSubscriptionManagementDeleteCall = this.getSubscriptionManagementDeleteCall();
            strategy.appendField(locator, this, "subscriptionManagementDeleteCall", buffer, theSubscriptionManagementDeleteCall, (this.subscriptionManagementDeleteCall!= null));
        }
        {
            SubscriptionManagementEntryListDataType theSubscriptionManagementEntryListData;
            theSubscriptionManagementEntryListData = this.getSubscriptionManagementEntryListData();
            strategy.appendField(locator, this, "subscriptionManagementEntryListData", buffer, theSubscriptionManagementEntryListData, (this.subscriptionManagementEntryListData!= null));
        }
        {
            SubscriptionManagementRequestCallType theSubscriptionManagementRequestCall;
            theSubscriptionManagementRequestCall = this.getSubscriptionManagementRequestCall();
            strategy.appendField(locator, this, "subscriptionManagementRequestCall", buffer, theSubscriptionManagementRequestCall, (this.subscriptionManagementRequestCall!= null));
        }
        {
            SupplyConditionDescriptionListDataType theSupplyConditionDescriptionListData;
            theSupplyConditionDescriptionListData = this.getSupplyConditionDescriptionListData();
            strategy.appendField(locator, this, "supplyConditionDescriptionListData", buffer, theSupplyConditionDescriptionListData, (this.supplyConditionDescriptionListData!= null));
        }
        {
            SupplyConditionListDataType theSupplyConditionListData;
            theSupplyConditionListData = this.getSupplyConditionListData();
            strategy.appendField(locator, this, "supplyConditionListData", buffer, theSupplyConditionListData, (this.supplyConditionListData!= null));
        }
        {
            SupplyConditionThresholdRelationListDataType theSupplyConditionThresholdRelationListData;
            theSupplyConditionThresholdRelationListData = this.getSupplyConditionThresholdRelationListData();
            strategy.appendField(locator, this, "supplyConditionThresholdRelationListData", buffer, theSupplyConditionThresholdRelationListData, (this.supplyConditionThresholdRelationListData!= null));
        }
        {
            TariffBoundaryRelationListDataType theTariffBoundaryRelationListData;
            theTariffBoundaryRelationListData = this.getTariffBoundaryRelationListData();
            strategy.appendField(locator, this, "tariffBoundaryRelationListData", buffer, theTariffBoundaryRelationListData, (this.tariffBoundaryRelationListData!= null));
        }
        {
            TariffDescriptionListDataType theTariffDescriptionListData;
            theTariffDescriptionListData = this.getTariffDescriptionListData();
            strategy.appendField(locator, this, "tariffDescriptionListData", buffer, theTariffDescriptionListData, (this.tariffDescriptionListData!= null));
        }
        {
            TariffListDataType theTariffListData;
            theTariffListData = this.getTariffListData();
            strategy.appendField(locator, this, "tariffListData", buffer, theTariffListData, (this.tariffListData!= null));
        }
        {
            TariffOverallConstraintsDataType theTariffOverallConstraintsData;
            theTariffOverallConstraintsData = this.getTariffOverallConstraintsData();
            strategy.appendField(locator, this, "tariffOverallConstraintsData", buffer, theTariffOverallConstraintsData, (this.tariffOverallConstraintsData!= null));
        }
        {
            TariffTierRelationListDataType theTariffTierRelationListData;
            theTariffTierRelationListData = this.getTariffTierRelationListData();
            strategy.appendField(locator, this, "tariffTierRelationListData", buffer, theTariffTierRelationListData, (this.tariffTierRelationListData!= null));
        }
        {
            TaskManagementJobDescriptionListDataType theTaskManagementJobDescriptionListData;
            theTaskManagementJobDescriptionListData = this.getTaskManagementJobDescriptionListData();
            strategy.appendField(locator, this, "taskManagementJobDescriptionListData", buffer, theTaskManagementJobDescriptionListData, (this.taskManagementJobDescriptionListData!= null));
        }
        {
            TaskManagementJobListDataType theTaskManagementJobListData;
            theTaskManagementJobListData = this.getTaskManagementJobListData();
            strategy.appendField(locator, this, "taskManagementJobListData", buffer, theTaskManagementJobListData, (this.taskManagementJobListData!= null));
        }
        {
            TaskManagementJobRelationListDataType theTaskManagementJobRelationListData;
            theTaskManagementJobRelationListData = this.getTaskManagementJobRelationListData();
            strategy.appendField(locator, this, "taskManagementJobRelationListData", buffer, theTaskManagementJobRelationListData, (this.taskManagementJobRelationListData!= null));
        }
        {
            TaskManagementOverviewDataType theTaskManagementOverviewData;
            theTaskManagementOverviewData = this.getTaskManagementOverviewData();
            strategy.appendField(locator, this, "taskManagementOverviewData", buffer, theTaskManagementOverviewData, (this.taskManagementOverviewData!= null));
        }
        {
            ThresholdConstraintsListDataType theThresholdConstraintsListData;
            theThresholdConstraintsListData = this.getThresholdConstraintsListData();
            strategy.appendField(locator, this, "thresholdConstraintsListData", buffer, theThresholdConstraintsListData, (this.thresholdConstraintsListData!= null));
        }
        {
            ThresholdDescriptionListDataType theThresholdDescriptionListData;
            theThresholdDescriptionListData = this.getThresholdDescriptionListData();
            strategy.appendField(locator, this, "thresholdDescriptionListData", buffer, theThresholdDescriptionListData, (this.thresholdDescriptionListData!= null));
        }
        {
            ThresholdListDataType theThresholdListData;
            theThresholdListData = this.getThresholdListData();
            strategy.appendField(locator, this, "thresholdListData", buffer, theThresholdListData, (this.thresholdListData!= null));
        }
        {
            TierBoundaryDescriptionListDataType theTierBoundaryDescriptionListData;
            theTierBoundaryDescriptionListData = this.getTierBoundaryDescriptionListData();
            strategy.appendField(locator, this, "tierBoundaryDescriptionListData", buffer, theTierBoundaryDescriptionListData, (this.tierBoundaryDescriptionListData!= null));
        }
        {
            TierBoundaryListDataType theTierBoundaryListData;
            theTierBoundaryListData = this.getTierBoundaryListData();
            strategy.appendField(locator, this, "tierBoundaryListData", buffer, theTierBoundaryListData, (this.tierBoundaryListData!= null));
        }
        {
            TierDescriptionListDataType theTierDescriptionListData;
            theTierDescriptionListData = this.getTierDescriptionListData();
            strategy.appendField(locator, this, "tierDescriptionListData", buffer, theTierDescriptionListData, (this.tierDescriptionListData!= null));
        }
        {
            TierIncentiveRelationListDataType theTierIncentiveRelationListData;
            theTierIncentiveRelationListData = this.getTierIncentiveRelationListData();
            strategy.appendField(locator, this, "tierIncentiveRelationListData", buffer, theTierIncentiveRelationListData, (this.tierIncentiveRelationListData!= null));
        }
        {
            TierListDataType theTierListData;
            theTierListData = this.getTierListData();
            strategy.appendField(locator, this, "tierListData", buffer, theTierListData, (this.tierListData!= null));
        }
        {
            TimeDistributorDataType theTimeDistributorData;
            theTimeDistributorData = this.getTimeDistributorData();
            strategy.appendField(locator, this, "timeDistributorData", buffer, theTimeDistributorData, (this.timeDistributorData!= null));
        }
        {
            TimeDistributorEnquiryCallType theTimeDistributorEnquiryCall;
            theTimeDistributorEnquiryCall = this.getTimeDistributorEnquiryCall();
            strategy.appendField(locator, this, "timeDistributorEnquiryCall", buffer, theTimeDistributorEnquiryCall, (this.timeDistributorEnquiryCall!= null));
        }
        {
            TimeInformationDataType theTimeInformationData;
            theTimeInformationData = this.getTimeInformationData();
            strategy.appendField(locator, this, "timeInformationData", buffer, theTimeInformationData, (this.timeInformationData!= null));
        }
        {
            TimePrecisionDataType theTimePrecisionData;
            theTimePrecisionData = this.getTimePrecisionData();
            strategy.appendField(locator, this, "timePrecisionData", buffer, theTimePrecisionData, (this.timePrecisionData!= null));
        }
        {
            TimeSeriesConstraintsListDataType theTimeSeriesConstraintsListData;
            theTimeSeriesConstraintsListData = this.getTimeSeriesConstraintsListData();
            strategy.appendField(locator, this, "timeSeriesConstraintsListData", buffer, theTimeSeriesConstraintsListData, (this.timeSeriesConstraintsListData!= null));
        }
        {
            TimeSeriesDescriptionListDataType theTimeSeriesDescriptionListData;
            theTimeSeriesDescriptionListData = this.getTimeSeriesDescriptionListData();
            strategy.appendField(locator, this, "timeSeriesDescriptionListData", buffer, theTimeSeriesDescriptionListData, (this.timeSeriesDescriptionListData!= null));
        }
        {
            TimeSeriesListDataType theTimeSeriesListData;
            theTimeSeriesListData = this.getTimeSeriesListData();
            strategy.appendField(locator, this, "timeSeriesListData", buffer, theTimeSeriesListData, (this.timeSeriesListData!= null));
        }
        {
            TimeTableConstraintsListDataType theTimeTableConstraintsListData;
            theTimeTableConstraintsListData = this.getTimeTableConstraintsListData();
            strategy.appendField(locator, this, "timeTableConstraintsListData", buffer, theTimeTableConstraintsListData, (this.timeTableConstraintsListData!= null));
        }
        {
            TimeTableDescriptionListDataType theTimeTableDescriptionListData;
            theTimeTableDescriptionListData = this.getTimeTableDescriptionListData();
            strategy.appendField(locator, this, "timeTableDescriptionListData", buffer, theTimeTableDescriptionListData, (this.timeTableDescriptionListData!= null));
        }
        {
            TimeTableListDataType theTimeTableListData;
            theTimeTableListData = this.getTimeTableListData();
            strategy.appendField(locator, this, "timeTableListData", buffer, theTimeTableListData, (this.timeTableListData!= null));
        }
        {
            UseCaseInformationListDataType theUseCaseInformationListData;
            theUseCaseInformationListData = this.getUseCaseInformationListData();
            strategy.appendField(locator, this, "useCaseInformationListData", buffer, theUseCaseInformationListData, (this.useCaseInformationListData!= null));
        }
        {
            byte[] theManufacturerSpecificExtension;
            theManufacturerSpecificExtension = this.getManufacturerSpecificExtension();
            strategy.appendField(locator, this, "manufacturerSpecificExtension", buffer, theManufacturerSpecificExtension, (this.manufacturerSpecificExtension!= null));
        }
        {
            String theLastUpdateAt;
            theLastUpdateAt = this.getLastUpdateAt();
            strategy.appendField(locator, this, "lastUpdateAt", buffer, theLastUpdateAt, (this.lastUpdateAt!= null));
        }
        return buffer;
    }

}
