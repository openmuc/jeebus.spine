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

import java.util.List;
import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;
import jakarta.xml.bind.annotation.adapters.HexBinaryAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.openmuc.jeebus.spine.xsd.v1 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Device_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "device");
    private final static QName _Entity_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "entity");
    private final static QName _Feature_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "feature");
    private final static QName _ThresholdData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "thresholdData");
    private final static QName _ThresholdDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "thresholdDataElements");
    private final static QName _ThresholdListData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "thresholdListData");
    private final static QName _ThresholdListDataSelectors_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "thresholdListDataSelectors");
    private final static QName _ThresholdConstraintsData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "thresholdConstraintsData");
    private final static QName _ThresholdConstraintsDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "thresholdConstraintsDataElements");
    private final static QName _ThresholdConstraintsListData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "thresholdConstraintsListData");
    private final static QName _ThresholdConstraintsListDataSelectors_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "thresholdConstraintsListDataSelectors");
    private final static QName _ThresholdDescriptionData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "thresholdDescriptionData");
    private final static QName _ThresholdDescriptionDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "thresholdDescriptionDataElements");
    private final static QName _ThresholdDescriptionListData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "thresholdDescriptionListData");
    private final static QName _ThresholdDescriptionListDataSelectors_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "thresholdDescriptionListDataSelectors");
    private final static QName _MeasurementData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "measurementData");
    private final static QName _MeasurementDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "measurementDataElements");
    private final static QName _MeasurementListData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "measurementListData");
    private final static QName _MeasurementListDataSelectors_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "measurementListDataSelectors");
    private final static QName _MeasurementSeriesData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "measurementSeriesData");
    private final static QName _MeasurementSeriesDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "measurementSeriesDataElements");
    private final static QName _MeasurementSeriesListData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "measurementSeriesListData");
    private final static QName _MeasurementSeriesListDataSelectors_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "measurementSeriesListDataSelectors");
    private final static QName _MeasurementConstraintsData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "measurementConstraintsData");
    private final static QName _MeasurementConstraintsDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "measurementConstraintsDataElements");
    private final static QName _MeasurementConstraintsListData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "measurementConstraintsListData");
    private final static QName _MeasurementConstraintsListDataSelectors_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "measurementConstraintsListDataSelectors");
    private final static QName _MeasurementDescriptionData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "measurementDescriptionData");
    private final static QName _MeasurementDescriptionDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "measurementDescriptionDataElements");
    private final static QName _MeasurementDescriptionListData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "measurementDescriptionListData");
    private final static QName _MeasurementDescriptionListDataSelectors_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "measurementDescriptionListDataSelectors");
    private final static QName _MeasurementThresholdRelationData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "measurementThresholdRelationData");
    private final static QName _MeasurementThresholdRelationDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "measurementThresholdRelationDataElements");
    private final static QName _MeasurementThresholdRelationListData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "measurementThresholdRelationListData");
    private final static QName _MeasurementThresholdRelationListDataSelectors_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "measurementThresholdRelationListDataSelectors");
    private final static QName _TimeSeriesData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "timeSeriesData");
    private final static QName _TimeSeriesDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "timeSeriesDataElements");
    private final static QName _TimeSeriesListData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "timeSeriesListData");
    private final static QName _TimeSeriesListDataSelectors_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "timeSeriesListDataSelectors");
    private final static QName _TimeSeriesDescriptionData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "timeSeriesDescriptionData");
    private final static QName _TimeSeriesDescriptionDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "timeSeriesDescriptionDataElements");
    private final static QName _TimeSeriesDescriptionListData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "timeSeriesDescriptionListData");
    private final static QName _TimeSeriesDescriptionListDataSelectors_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "timeSeriesDescriptionListDataSelectors");
    private final static QName _TimeSeriesConstraintsData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "timeSeriesConstraintsData");
    private final static QName _TimeSeriesConstraintsDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "timeSeriesConstraintsDataElements");
    private final static QName _TimeSeriesConstraintsListData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "timeSeriesConstraintsListData");
    private final static QName _TimeSeriesConstraintsListDataSelectors_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "timeSeriesConstraintsListDataSelectors");
    private final static QName _ActuatorSwitchData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "actuatorSwitchData");
    private final static QName _ActuatorSwitchDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "actuatorSwitchDataElements");
    private final static QName _ActuatorSwitchDescriptionData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "actuatorSwitchDescriptionData");
    private final static QName _ActuatorSwitchDescriptionDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "actuatorSwitchDescriptionDataElements");
    private final static QName _DeviceConfigurationKeyValueData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "deviceConfigurationKeyValueData");
    private final static QName _DeviceConfigurationKeyValueDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "deviceConfigurationKeyValueDataElements");
    private final static QName _DeviceConfigurationKeyValueListData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "deviceConfigurationKeyValueListData");
    private final static QName _DeviceConfigurationKeyValueListDataSelectors_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "deviceConfigurationKeyValueListDataSelectors");
    private final static QName _DeviceConfigurationKeyValueDescriptionData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "deviceConfigurationKeyValueDescriptionData");
    private final static QName _DeviceConfigurationKeyValueDescriptionDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "deviceConfigurationKeyValueDescriptionDataElements");
    private final static QName _DeviceConfigurationKeyValueDescriptionListData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "deviceConfigurationKeyValueDescriptionListData");
    private final static QName _DeviceConfigurationKeyValueDescriptionListDataSelectors_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "deviceConfigurationKeyValueDescriptionListDataSelectors");
    private final static QName _DeviceConfigurationKeyValueConstraintsData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "deviceConfigurationKeyValueConstraintsData");
    private final static QName _DeviceConfigurationKeyValueConstraintsDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "deviceConfigurationKeyValueConstraintsDataElements");
    private final static QName _DeviceConfigurationKeyValueConstraintsListData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "deviceConfigurationKeyValueConstraintsListData");
    private final static QName _DeviceConfigurationKeyValueConstraintsListDataSelectors_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "deviceConfigurationKeyValueConstraintsListDataSelectors");
    private final static QName _PowerTimeSlotScheduleData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "powerTimeSlotScheduleData");
    private final static QName _PowerTimeSlotScheduleDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "powerTimeSlotScheduleDataElements");
    private final static QName _PowerTimeSlotScheduleListData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "powerTimeSlotScheduleListData");
    private final static QName _PowerTimeSlotScheduleListDataSelectors_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "powerTimeSlotScheduleListDataSelectors");
    private final static QName _PowerTimeSlotValueData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "powerTimeSlotValueData");
    private final static QName _PowerTimeSlotValueDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "powerTimeSlotValueDataElements");
    private final static QName _PowerTimeSlotValueListData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "powerTimeSlotValueListData");
    private final static QName _PowerTimeSlotValueListDataSelectors_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "powerTimeSlotValueListDataSelectors");
    private final static QName _PowerTimeSlotScheduleConstraintsData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "powerTimeSlotScheduleConstraintsData");
    private final static QName _PowerTimeSlotScheduleConstraintsDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "powerTimeSlotScheduleConstraintsDataElements");
    private final static QName _PowerTimeSlotScheduleConstraintsListData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "powerTimeSlotScheduleConstraintsListData");
    private final static QName _PowerTimeSlotScheduleConstraintsListDataSelectors_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "powerTimeSlotScheduleConstraintsListDataSelectors");
    private final static QName _PowerSequenceAlternativesRelationData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "powerSequenceAlternativesRelationData");
    private final static QName _PowerSequenceAlternativesRelationDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "powerSequenceAlternativesRelationDataElements");
    private final static QName _PowerSequenceAlternativesRelationListData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "powerSequenceAlternativesRelationListData");
    private final static QName _PowerSequenceAlternativesRelationListDataSelectors_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "powerSequenceAlternativesRelationListDataSelectors");
    private final static QName _PowerSequenceDescriptionData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "powerSequenceDescriptionData");
    private final static QName _PowerSequenceDescriptionDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "powerSequenceDescriptionDataElements");
    private final static QName _PowerSequenceDescriptionListData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "powerSequenceDescriptionListData");
    private final static QName _PowerSequenceDescriptionListDataSelectors_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "powerSequenceDescriptionListDataSelectors");
    private final static QName _PowerSequenceStateData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "powerSequenceStateData");
    private final static QName _PowerSequenceStateDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "powerSequenceStateDataElements");
    private final static QName _PowerSequenceStateListData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "powerSequenceStateListData");
    private final static QName _PowerSequenceStateListDataSelectors_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "powerSequenceStateListDataSelectors");
    private final static QName _PowerSequenceScheduleData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "powerSequenceScheduleData");
    private final static QName _PowerSequenceScheduleDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "powerSequenceScheduleDataElements");
    private final static QName _PowerSequenceScheduleListData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "powerSequenceScheduleListData");
    private final static QName _PowerSequenceScheduleListDataSelectors_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "powerSequenceScheduleListDataSelectors");
    private final static QName _PowerSequenceScheduleConstraintsData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "powerSequenceScheduleConstraintsData");
    private final static QName _PowerSequenceScheduleConstraintsDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "powerSequenceScheduleConstraintsDataElements");
    private final static QName _PowerSequenceScheduleConstraintsListData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "powerSequenceScheduleConstraintsListData");
    private final static QName _PowerSequenceScheduleConstraintsListDataSelectors_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "powerSequenceScheduleConstraintsListDataSelectors");
    private final static QName _PowerSequencePriceData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "powerSequencePriceData");
    private final static QName _PowerSequencePriceDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "powerSequencePriceDataElements");
    private final static QName _PowerSequencePriceListData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "powerSequencePriceListData");
    private final static QName _PowerSequencePriceListDataSelectors_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "powerSequencePriceListDataSelectors");
    private final static QName _PowerSequenceSchedulePreferenceData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "powerSequenceSchedulePreferenceData");
    private final static QName _PowerSequenceSchedulePreferenceDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "powerSequenceSchedulePreferenceDataElements");
    private final static QName _PowerSequenceSchedulePreferenceListData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "powerSequenceSchedulePreferenceListData");
    private final static QName _PowerSequenceSchedulePreferenceListDataSelectors_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "powerSequenceSchedulePreferenceListDataSelectors");
    private final static QName _PowerSequenceNodeScheduleInformationData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "powerSequenceNodeScheduleInformationData");
    private final static QName _PowerSequenceNodeScheduleInformationDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "powerSequenceNodeScheduleInformationDataElements");
    private final static QName _PowerSequenceScheduleConfigurationRequestCall_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "powerSequenceScheduleConfigurationRequestCall");
    private final static QName _PowerSequenceScheduleConfigurationRequestCallElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "powerSequenceScheduleConfigurationRequestCallElements");
    private final static QName _PowerSequencePriceCalculationRequestCall_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "powerSequencePriceCalculationRequestCall");
    private final static QName _PowerSequencePriceCalculationRequestCallElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "powerSequencePriceCalculationRequestCallElements");
    private final static QName _DirectControlActivityData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "directControlActivityData");
    private final static QName _DirectControlActivityDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "directControlActivityDataElements");
    private final static QName _DirectControlActivityListData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "directControlActivityListData");
    private final static QName _DirectControlActivityListDataSelectors_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "directControlActivityListDataSelectors");
    private final static QName _DirectControlDescriptionData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "directControlDescriptionData");
    private final static QName _DirectControlDescriptionDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "directControlDescriptionDataElements");
    private final static QName _TimeTableData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "timeTableData");
    private final static QName _TimeTableDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "timeTableDataElements");
    private final static QName _TimeTableListData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "timeTableListData");
    private final static QName _TimeTableListDataSelectors_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "timeTableListDataSelectors");
    private final static QName _TimeTableConstraintsData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "timeTableConstraintsData");
    private final static QName _TimeTableConstraintsDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "timeTableConstraintsDataElements");
    private final static QName _TimeTableConstraintsListData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "timeTableConstraintsListData");
    private final static QName _TimeTableConstraintsListDataSelectors_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "timeTableConstraintsListDataSelectors");
    private final static QName _TimeTableDescriptionData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "timeTableDescriptionData");
    private final static QName _TimeTableDescriptionDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "timeTableDescriptionDataElements");
    private final static QName _TimeTableDescriptionListData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "timeTableDescriptionListData");
    private final static QName _TimeTableDescriptionListDataSelectors_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "timeTableDescriptionListDataSelectors");
    private final static QName _SetpointData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "setpointData");
    private final static QName _SetpointDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "setpointDataElements");
    private final static QName _SetpointListData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "setpointListData");
    private final static QName _SetpointListDataSelectors_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "setpointListDataSelectors");
    private final static QName _SetpointConstraintsData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "setpointConstraintsData");
    private final static QName _SetpointConstraintsDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "setpointConstraintsDataElements");
    private final static QName _SetpointConstraintsListData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "setpointConstraintsListData");
    private final static QName _SetpointConstraintsListDataSelectors_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "setpointConstraintsListDataSelectors");
    private final static QName _SetpointDescriptionData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "setpointDescriptionData");
    private final static QName _SetpointDescriptionDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "setpointDescriptionDataElements");
    private final static QName _SetpointDescriptionListData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "setpointDescriptionListData");
    private final static QName _SetpointDescriptionListDataSelectors_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "setpointDescriptionListDataSelectors");
    private final static QName _HvacSystemFunctionData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "hvacSystemFunctionData");
    private final static QName _HvacSystemFunctionDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "hvacSystemFunctionDataElements");
    private final static QName _HvacSystemFunctionListData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "hvacSystemFunctionListData");
    private final static QName _HvacSystemFunctionListDataSelectors_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "hvacSystemFunctionListDataSelectors");
    private final static QName _HvacSystemFunctionOperationModeRelationData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "hvacSystemFunctionOperationModeRelationData");
    private final static QName _HvacSystemFunctionOperationModeRelationDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "hvacSystemFunctionOperationModeRelationDataElements");
    private final static QName _HvacSystemFunctionOperationModeRelationListData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "hvacSystemFunctionOperationModeRelationListData");
    private final static QName _HvacSystemFunctionOperationModeRelationListDataSelectors_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "hvacSystemFunctionOperationModeRelationListDataSelectors");
    private final static QName _HvacSystemFunctionSetpointRelationData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "hvacSystemFunctionSetpointRelationData");
    private final static QName _HvacSystemFunctionSetpointRelationDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "hvacSystemFunctionSetpointRelationDataElements");
    private final static QName _HvacSystemFunctionSetpointRelationListData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "hvacSystemFunctionSetpointRelationListData");
    private final static QName _HvacSystemFunctionSetpointRelationListDataSelectors_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "hvacSystemFunctionSetpointRelationListDataSelectors");
    private final static QName _HvacSystemFunctionPowerSequenceRelationData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "hvacSystemFunctionPowerSequenceRelationData");
    private final static QName _HvacSystemFunctionPowerSequenceRelationDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "hvacSystemFunctionPowerSequenceRelationDataElements");
    private final static QName _HvacSystemFunctionPowerSequenceRelationListData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "hvacSystemFunctionPowerSequenceRelationListData");
    private final static QName _HvacSystemFunctionPowerSequenceRelationListDataSelectors_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "hvacSystemFunctionPowerSequenceRelationListDataSelectors");
    private final static QName _HvacSystemFunctionDescriptionData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "hvacSystemFunctionDescriptionData");
    private final static QName _HvacSystemFunctionDescriptionDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "hvacSystemFunctionDescriptionDataElements");
    private final static QName _HvacSystemFunctionDescriptionListData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "hvacSystemFunctionDescriptionListData");
    private final static QName _HvacSystemFunctionDescriptionListDataSelectors_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "hvacSystemFunctionDescriptionListDataSelectors");
    private final static QName _HvacOperationModeDescriptionData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "hvacOperationModeDescriptionData");
    private final static QName _HvacOperationModeDescriptionDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "hvacOperationModeDescriptionDataElements");
    private final static QName _HvacOperationModeDescriptionListData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "hvacOperationModeDescriptionListData");
    private final static QName _HvacOperationModeDescriptionListDataSelectors_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "hvacOperationModeDescriptionListDataSelectors");
    private final static QName _HvacOverrunData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "hvacOverrunData");
    private final static QName _HvacOverrunDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "hvacOverrunDataElements");
    private final static QName _HvacOverrunListData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "hvacOverrunListData");
    private final static QName _HvacOverrunListDataSelectors_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "hvacOverrunListDataSelectors");
    private final static QName _HvacOverrunDescriptionData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "hvacOverrunDescriptionData");
    private final static QName _HvacOverrunDescriptionDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "hvacOverrunDescriptionDataElements");
    private final static QName _HvacOverrunDescriptionListData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "hvacOverrunDescriptionListData");
    private final static QName _HvacOverrunDescriptionListDataSelectors_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "hvacOverrunDescriptionListDataSelectors");
    private final static QName _LoadControlNodeData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "loadControlNodeData");
    private final static QName _LoadControlNodeDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "loadControlNodeDataElements");
    private final static QName _LoadControlEventData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "loadControlEventData");
    private final static QName _LoadControlEventDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "loadControlEventDataElements");
    private final static QName _LoadControlEventListData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "loadControlEventListData");
    private final static QName _LoadControlEventListDataSelectors_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "loadControlEventListDataSelectors");
    private final static QName _LoadControlStateData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "loadControlStateData");
    private final static QName _LoadControlStateDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "loadControlStateDataElements");
    private final static QName _LoadControlStateListData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "loadControlStateListData");
    private final static QName _LoadControlStateListDataSelectors_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "loadControlStateListDataSelectors");
    private final static QName _LoadControlLimitData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "loadControlLimitData");
    private final static QName _LoadControlLimitDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "loadControlLimitDataElements");
    private final static QName _LoadControlLimitListData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "loadControlLimitListData");
    private final static QName _LoadControlLimitListDataSelectors_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "loadControlLimitListDataSelectors");
    private final static QName _LoadControlLimitConstraintsData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "loadControlLimitConstraintsData");
    private final static QName _LoadControlLimitConstraintsDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "loadControlLimitConstraintsDataElements");
    private final static QName _LoadControlLimitConstraintsListData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "loadControlLimitConstraintsListData");
    private final static QName _LoadControlLimitConstraintsListDataSelectors_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "loadControlLimitConstraintsListDataSelectors");
    private final static QName _LoadControlLimitDescriptionData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "loadControlLimitDescriptionData");
    private final static QName _LoadControlLimitDescriptionDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "loadControlLimitDescriptionDataElements");
    private final static QName _LoadControlLimitDescriptionListData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "loadControlLimitDescriptionListData");
    private final static QName _LoadControlLimitDescriptionListDataSelectors_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "loadControlLimitDescriptionListDataSelectors");
    private final static QName _TaskManagementJobData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "taskManagementJobData");
    private final static QName _TaskManagementJobDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "taskManagementJobDataElements");
    private final static QName _TaskManagementJobListData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "taskManagementJobListData");
    private final static QName _TaskManagementJobListDataSelectors_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "taskManagementJobListDataSelectors");
    private final static QName _TaskManagementJobRelationData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "taskManagementJobRelationData");
    private final static QName _TaskManagementJobRelationDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "taskManagementJobRelationDataElements");
    private final static QName _TaskManagementJobRelationListData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "taskManagementJobRelationListData");
    private final static QName _TaskManagementJobRelationListDataSelectors_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "taskManagementJobRelationListDataSelectors");
    private final static QName _TaskManagementJobDescriptionData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "taskManagementJobDescriptionData");
    private final static QName _TaskManagementJobDescriptionDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "taskManagementJobDescriptionDataElements");
    private final static QName _TaskManagementJobDescriptionListData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "taskManagementJobDescriptionListData");
    private final static QName _TaskManagementJobDescriptionListDataSelectors_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "taskManagementJobDescriptionListDataSelectors");
    private final static QName _TaskManagementOverviewData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "taskManagementOverviewData");
    private final static QName _TaskManagementOverviewDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "taskManagementOverviewDataElements");
    private final static QName _AlarmData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "alarmData");
    private final static QName _AlarmDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "alarmDataElements");
    private final static QName _AlarmListData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "alarmListData");
    private final static QName _AlarmListDataSelectors_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "alarmListDataSelectors");
    private final static QName _SupplyConditionData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "supplyConditionData");
    private final static QName _SupplyConditionDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "supplyConditionDataElements");
    private final static QName _SupplyConditionListData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "supplyConditionListData");
    private final static QName _SupplyConditionListDataSelectors_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "supplyConditionListDataSelectors");
    private final static QName _SupplyConditionDescriptionData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "supplyConditionDescriptionData");
    private final static QName _SupplyConditionDescriptionDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "supplyConditionDescriptionDataElements");
    private final static QName _SupplyConditionDescriptionListData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "supplyConditionDescriptionListData");
    private final static QName _SupplyConditionDescriptionListDataSelectors_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "supplyConditionDescriptionListDataSelectors");
    private final static QName _SupplyConditionThresholdRelationData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "supplyConditionThresholdRelationData");
    private final static QName _SupplyConditionThresholdRelationDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "supplyConditionThresholdRelationDataElements");
    private final static QName _SupplyConditionThresholdRelationListData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "supplyConditionThresholdRelationListData");
    private final static QName _SupplyConditionThresholdRelationListDataSelectors_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "supplyConditionThresholdRelationListDataSelectors");
    private final static QName _ResultData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "resultData");
    private final static QName _BindingManagementEntryData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "bindingManagementEntryData");
    private final static QName _BindingManagementEntryDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "bindingManagementEntryDataElements");
    private final static QName _BindingManagementEntryListData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "bindingManagementEntryListData");
    private final static QName _BindingManagementEntryListDataSelectors_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "bindingManagementEntryListDataSelectors");
    private final static QName _BindingManagementRequestCall_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "bindingManagementRequestCall");
    private final static QName _BindingManagementRequestCallElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "bindingManagementRequestCallElements");
    private final static QName _BindingManagementDeleteCall_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "bindingManagementDeleteCall");
    private final static QName _BindingManagementDeleteCallElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "bindingManagementDeleteCallElements");
    private final static QName _TariffOverallConstraintsData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "tariffOverallConstraintsData");
    private final static QName _TariffOverallConstraintsDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "tariffOverallConstraintsDataElements");
    private final static QName _TariffData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "tariffData");
    private final static QName _TariffDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "tariffDataElements");
    private final static QName _TariffListData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "tariffListData");
    private final static QName _TariffListDataSelectors_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "tariffListDataSelectors");
    private final static QName _TariffTierRelationData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "tariffTierRelationData");
    private final static QName _TariffTierRelationDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "tariffTierRelationDataElements");
    private final static QName _TariffTierRelationListData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "tariffTierRelationListData");
    private final static QName _TariffTierRelationListDataSelectors_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "tariffTierRelationListDataSelectors");
    private final static QName _TariffBoundaryRelationData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "tariffBoundaryRelationData");
    private final static QName _TariffBoundaryRelationDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "tariffBoundaryRelationDataElements");
    private final static QName _TariffBoundaryRelationListData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "tariffBoundaryRelationListData");
    private final static QName _TariffBoundaryRelationListDataSelectors_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "tariffBoundaryRelationListDataSelectors");
    private final static QName _TariffDescriptionData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "tariffDescriptionData");
    private final static QName _TariffDescriptionDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "tariffDescriptionDataElements");
    private final static QName _TariffDescriptionListData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "tariffDescriptionListData");
    private final static QName _TariffDescriptionListDataSelectors_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "tariffDescriptionListDataSelectors");
    private final static QName _TierBoundaryData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "tierBoundaryData");
    private final static QName _TierBoundaryDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "tierBoundaryDataElements");
    private final static QName _TierBoundaryListData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "tierBoundaryListData");
    private final static QName _TierBoundaryListDataSelectors_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "tierBoundaryListDataSelectors");
    private final static QName _TierBoundaryDescriptionData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "tierBoundaryDescriptionData");
    private final static QName _TierBoundaryDescriptionDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "tierBoundaryDescriptionDataElements");
    private final static QName _TierBoundaryDescriptionListData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "tierBoundaryDescriptionListData");
    private final static QName _TierBoundaryDescriptionListDataSelectors_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "tierBoundaryDescriptionListDataSelectors");
    private final static QName _CommodityData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "commodityData");
    private final static QName _CommodityDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "commodityDataElements");
    private final static QName _CommodityListData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "commodityListData");
    private final static QName _CommodityListDataSelectors_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "commodityListDataSelectors");
    private final static QName _TierData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "tierData");
    private final static QName _TierDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "tierDataElements");
    private final static QName _TierListData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "tierListData");
    private final static QName _TierListDataSelectors_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "tierListDataSelectors");
    private final static QName _TierIncentiveRelationData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "tierIncentiveRelationData");
    private final static QName _TierIncentiveRelationDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "tierIncentiveRelationDataElements");
    private final static QName _TierIncentiveRelationListData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "tierIncentiveRelationListData");
    private final static QName _TierIncentiveRelationListDataSelectors_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "tierIncentiveRelationListDataSelectors");
    private final static QName _TierDescriptionData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "tierDescriptionData");
    private final static QName _TierDescriptionDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "tierDescriptionDataElements");
    private final static QName _TierDescriptionListData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "tierDescriptionListData");
    private final static QName _TierDescriptionListDataSelectors_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "tierDescriptionListDataSelectors");
    private final static QName _IncentiveData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "incentiveData");
    private final static QName _IncentiveDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "incentiveDataElements");
    private final static QName _IncentiveListData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "incentiveListData");
    private final static QName _IncentiveListDataSelectors_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "incentiveListDataSelectors");
    private final static QName _IncentiveDescriptionData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "incentiveDescriptionData");
    private final static QName _IncentiveDescriptionDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "incentiveDescriptionDataElements");
    private final static QName _IncentiveDescriptionListData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "incentiveDescriptionListData");
    private final static QName _IncentiveDescriptionListDataSelectors_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "incentiveDescriptionListDataSelectors");
    private final static QName _ActuatorLevelData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "actuatorLevelData");
    private final static QName _ActuatorLevelDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "actuatorLevelDataElements");
    private final static QName _ActuatorLevelDescriptionData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "actuatorLevelDescriptionData");
    private final static QName _ActuatorLevelDescriptionDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "actuatorLevelDescriptionDataElements");
    private final static QName _IdentificationData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "identificationData");
    private final static QName _IdentificationDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "identificationDataElements");
    private final static QName _IdentificationListData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "identificationListData");
    private final static QName _IdentificationListDataSelectors_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "identificationListDataSelectors");
    private final static QName _SessionIdentificationData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "sessionIdentificationData");
    private final static QName _SessionIdentificationDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "sessionIdentificationDataElements");
    private final static QName _SessionIdentificationListData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "sessionIdentificationListData");
    private final static QName _SessionIdentificationListDataSelectors_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "sessionIdentificationListDataSelectors");
    private final static QName _SessionMeasurementRelationData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "sessionMeasurementRelationData");
    private final static QName _SessionMeasurementRelationDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "sessionMeasurementRelationDataElements");
    private final static QName _SessionMeasurementRelationListData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "sessionMeasurementRelationListData");
    private final static QName _SessionMeasurementRelationListDataSelectors_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "sessionMeasurementRelationListDataSelectors");
    private final static QName _BillData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "billData");
    private final static QName _BillDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "billDataElements");
    private final static QName _BillListData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "billListData");
    private final static QName _BillListDataSelectors_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "billListDataSelectors");
    private final static QName _BillConstraintsData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "billConstraintsData");
    private final static QName _BillConstraintsDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "billConstraintsDataElements");
    private final static QName _BillConstraintsListData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "billConstraintsListData");
    private final static QName _BillConstraintsListDataSelectors_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "billConstraintsListDataSelectors");
    private final static QName _BillDescriptionData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "billDescriptionData");
    private final static QName _BillDescriptionDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "billDescriptionDataElements");
    private final static QName _BillDescriptionListData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "billDescriptionListData");
    private final static QName _BillDescriptionListDataSelectors_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "billDescriptionListDataSelectors");
    private final static QName _DataTunnelingCall_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "dataTunnelingCall");
    private final static QName _DataTunnelingCallElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "dataTunnelingCallElements");
    private final static QName _DeviceClassificationManufacturerData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "deviceClassificationManufacturerData");
    private final static QName _DeviceClassificationManufacturerDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "deviceClassificationManufacturerDataElements");
    private final static QName _DeviceClassificationUserData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "deviceClassificationUserData");
    private final static QName _DeviceClassificationUserDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "deviceClassificationUserDataElements");
    private final static QName _DeviceDiagnosisStateData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "deviceDiagnosisStateData");
    private final static QName _DeviceDiagnosisStateDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "deviceDiagnosisStateDataElements");
    private final static QName _DeviceDiagnosisHeartbeatData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "deviceDiagnosisHeartbeatData");
    private final static QName _DeviceDiagnosisHeartbeatDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "deviceDiagnosisHeartbeatDataElements");
    private final static QName _DeviceDiagnosisServiceData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "deviceDiagnosisServiceData");
    private final static QName _DeviceDiagnosisServiceDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "deviceDiagnosisServiceDataElements");
    private final static QName _ElectricalConnectionParameterDescriptionData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "electricalConnectionParameterDescriptionData");
    private final static QName _ElectricalConnectionParameterDescriptionDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "electricalConnectionParameterDescriptionDataElements");
    private final static QName _ElectricalConnectionParameterDescriptionListData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "electricalConnectionParameterDescriptionListData");
    private final static QName _ElectricalConnectionParameterDescriptionListDataSelectors_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "electricalConnectionParameterDescriptionListDataSelectors");
    private final static QName _ElectricalConnectionPermittedValueSetData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "electricalConnectionPermittedValueSetData");
    private final static QName _ElectricalConnectionPermittedValueSetDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "electricalConnectionPermittedValueSetDataElements");
    private final static QName _ElectricalConnectionPermittedValueSetListData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "electricalConnectionPermittedValueSetListData");
    private final static QName _ElectricalConnectionPermittedValueSetListDataSelectors_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "electricalConnectionPermittedValueSetListDataSelectors");
    private final static QName _ElectricalConnectionCharacteristicData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "electricalConnectionCharacteristicData");
    private final static QName _ElectricalConnectionCharacteristicDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "electricalConnectionCharacteristicDataElements");
    private final static QName _ElectricalConnectionCharacteristicListData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "electricalConnectionCharacteristicListData");
    private final static QName _ElectricalConnectionCharacteristicListDataSelectors_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "electricalConnectionCharacteristicListDataSelectors");
    private final static QName _ElectricalConnectionStateData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "electricalConnectionStateData");
    private final static QName _ElectricalConnectionStateDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "electricalConnectionStateDataElements");
    private final static QName _ElectricalConnectionStateListData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "electricalConnectionStateListData");
    private final static QName _ElectricalConnectionStateListDataSelectors_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "electricalConnectionStateListDataSelectors");
    private final static QName _ElectricalConnectionDescriptionData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "electricalConnectionDescriptionData");
    private final static QName _ElectricalConnectionDescriptionDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "electricalConnectionDescriptionDataElements");
    private final static QName _ElectricalConnectionDescriptionListData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "electricalConnectionDescriptionListData");
    private final static QName _ElectricalConnectionDescriptionListDataSelectors_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "electricalConnectionDescriptionListDataSelectors");
    private final static QName _IncentiveTableData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "incentiveTableData");
    private final static QName _IncentiveTableDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "incentiveTableDataElements");
    private final static QName _IncentiveTableDataSelectors_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "incentiveTableDataSelectors");
    private final static QName _IncentiveTableDescriptionData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "incentiveTableDescriptionData");
    private final static QName _IncentiveTableDescriptionDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "incentiveTableDescriptionDataElements");
    private final static QName _IncentiveTableDescriptionDataSelectors_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "incentiveTableDescriptionDataSelectors");
    private final static QName _IncentiveTableConstraintsData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "incentiveTableConstraintsData");
    private final static QName _IncentiveTableConstraintsDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "incentiveTableConstraintsDataElements");
    private final static QName _IncentiveTableConstraintsDataSelectors_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "incentiveTableConstraintsDataSelectors");
    private final static QName _MessagingData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "messagingData");
    private final static QName _MessagingDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "messagingDataElements");
    private final static QName _MessagingListData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "messagingListData");
    private final static QName _MessagingListDataSelectors_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "messagingListDataSelectors");
    private final static QName _NetworkManagementAddNodeCall_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "networkManagementAddNodeCall");
    private final static QName _NetworkManagementAddNodeCallElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "networkManagementAddNodeCallElements");
    private final static QName _NetworkManagementRemoveNodeCall_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "networkManagementRemoveNodeCall");
    private final static QName _NetworkManagementRemoveNodeCallElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "networkManagementRemoveNodeCallElements");
    private final static QName _NetworkManagementModifyNodeCall_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "networkManagementModifyNodeCall");
    private final static QName _NetworkManagementModifyNodeCallElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "networkManagementModifyNodeCallElements");
    private final static QName _NetworkManagementScanNetworkCall_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "networkManagementScanNetworkCall");
    private final static QName _NetworkManagementScanNetworkCallElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "networkManagementScanNetworkCallElements");
    private final static QName _NetworkManagementDiscoverCall_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "networkManagementDiscoverCall");
    private final static QName _NetworkManagementDiscoverCallElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "networkManagementDiscoverCallElements");
    private final static QName _NetworkManagementAbortCall_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "networkManagementAbortCall");
    private final static QName _NetworkManagementAbortCallElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "networkManagementAbortCallElements");
    private final static QName _NetworkManagementProcessStateData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "networkManagementProcessStateData");
    private final static QName _NetworkManagementProcessStateDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "networkManagementProcessStateDataElements");
    private final static QName _NetworkManagementJoiningModeData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "networkManagementJoiningModeData");
    private final static QName _NetworkManagementJoiningModeDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "networkManagementJoiningModeDataElements");
    private final static QName _NetworkManagementReportCandidateData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "networkManagementReportCandidateData");
    private final static QName _NetworkManagementReportCandidateDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "networkManagementReportCandidateDataElements");
    private final static QName _NetworkManagementDeviceDescriptionData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "networkManagementDeviceDescriptionData");
    private final static QName _NetworkManagementDeviceDescriptionDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "networkManagementDeviceDescriptionDataElements");
    private final static QName _NetworkManagementDeviceDescriptionListData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "networkManagementDeviceDescriptionListData");
    private final static QName _NetworkManagementDeviceDescriptionListDataSelectors_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "networkManagementDeviceDescriptionListDataSelectors");
    private final static QName _NetworkManagementEntityDescriptionData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "networkManagementEntityDescriptionData");
    private final static QName _NetworkManagementEntityDescriptionDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "networkManagementEntityDescriptionDataElements");
    private final static QName _NetworkManagementEntityDescriptionListData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "networkManagementEntityDescriptionListData");
    private final static QName _NetworkManagementEntityDescriptionListDataSelectors_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "networkManagementEntityDescriptionListDataSelectors");
    private final static QName _NetworkManagementFeatureDescriptionData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "networkManagementFeatureDescriptionData");
    private final static QName _NetworkManagementFeatureDescriptionDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "networkManagementFeatureDescriptionDataElements");
    private final static QName _NetworkManagementFeatureDescriptionListData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "networkManagementFeatureDescriptionListData");
    private final static QName _NetworkManagementFeatureDescriptionListDataSelectors_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "networkManagementFeatureDescriptionListDataSelectors");
    private final static QName _SubscriptionManagementEntryData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "subscriptionManagementEntryData");
    private final static QName _SubscriptionManagementEntryDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "subscriptionManagementEntryDataElements");
    private final static QName _SubscriptionManagementEntryListData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "subscriptionManagementEntryListData");
    private final static QName _SubscriptionManagementEntryListDataSelectors_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "subscriptionManagementEntryListDataSelectors");
    private final static QName _SubscriptionManagementRequestCall_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "subscriptionManagementRequestCall");
    private final static QName _SubscriptionManagementRequestCallElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "subscriptionManagementRequestCallElements");
    private final static QName _SubscriptionManagementDeleteCall_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "subscriptionManagementDeleteCall");
    private final static QName _SubscriptionManagementDeleteCallElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "subscriptionManagementDeleteCallElements");
    private final static QName _SpecificationVersionData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "specificationVersionData");
    private final static QName _SpecificationVersionDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "specificationVersionDataElements");
    private final static QName _SpecificationVersionListData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "specificationVersionListData");
    private final static QName _SpecificationVersionListDataSelectors_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "specificationVersionListDataSelectors");
    private final static QName _UseCaseInformationData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "useCaseInformationData");
    private final static QName _UseCaseInformationDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "useCaseInformationDataElements");
    private final static QName _UseCaseInformationListData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "useCaseInformationListData");
    private final static QName _UseCaseInformationListDataSelectors_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "useCaseInformationListDataSelectors");
    private final static QName _NodeManagementDetailedDiscoveryData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "nodeManagementDetailedDiscoveryData");
    private final static QName _NodeManagementDetailedDiscoveryDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "nodeManagementDetailedDiscoveryDataElements");
    private final static QName _NodeManagementDetailedDiscoveryDataSelectors_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "nodeManagementDetailedDiscoveryDataSelectors");
    private final static QName _NodeManagementBindingData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "nodeManagementBindingData");
    private final static QName _NodeManagementBindingDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "nodeManagementBindingDataElements");
    private final static QName _NodeManagementBindingDataSelectors_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "nodeManagementBindingDataSelectors");
    private final static QName _NodeManagementBindingRequestCall_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "nodeManagementBindingRequestCall");
    private final static QName _NodeManagementBindingRequestCallElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "nodeManagementBindingRequestCallElements");
    private final static QName _NodeManagementBindingDeleteCall_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "nodeManagementBindingDeleteCall");
    private final static QName _NodeManagementBindingDeleteCallElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "nodeManagementBindingDeleteCallElements");
    private final static QName _NodeManagementSubscriptionData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "nodeManagementSubscriptionData");
    private final static QName _NodeManagementSubscriptionDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "nodeManagementSubscriptionDataElements");
    private final static QName _NodeManagementSubscriptionDataSelectors_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "nodeManagementSubscriptionDataSelectors");
    private final static QName _NodeManagementSubscriptionRequestCall_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "nodeManagementSubscriptionRequestCall");
    private final static QName _NodeManagementSubscriptionRequestCallElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "nodeManagementSubscriptionRequestCallElements");
    private final static QName _NodeManagementSubscriptionDeleteCall_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "nodeManagementSubscriptionDeleteCall");
    private final static QName _NodeManagementSubscriptionDeleteCallElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "nodeManagementSubscriptionDeleteCallElements");
    private final static QName _NodeManagementDestinationData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "nodeManagementDestinationData");
    private final static QName _NodeManagementDestinationDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "nodeManagementDestinationDataElements");
    private final static QName _NodeManagementDestinationListData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "nodeManagementDestinationListData");
    private final static QName _NodeManagementDestinationListDataSelectors_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "nodeManagementDestinationListDataSelectors");
    private final static QName _NodeManagementUseCaseData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "nodeManagementUseCaseData");
    private final static QName _NodeManagementUseCaseDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "nodeManagementUseCaseDataElements");
    private final static QName _NodeManagementUseCaseDataSelectors_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "nodeManagementUseCaseDataSelectors");
    private final static QName _OperatingConstraintsInterruptData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "operatingConstraintsInterruptData");
    private final static QName _OperatingConstraintsInterruptDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "operatingConstraintsInterruptDataElements");
    private final static QName _OperatingConstraintsInterruptListData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "operatingConstraintsInterruptListData");
    private final static QName _OperatingConstraintsInterruptListDataSelectors_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "operatingConstraintsInterruptListDataSelectors");
    private final static QName _OperatingConstraintsDurationData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "operatingConstraintsDurationData");
    private final static QName _OperatingConstraintsDurationDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "operatingConstraintsDurationDataElements");
    private final static QName _OperatingConstraintsDurationListData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "operatingConstraintsDurationListData");
    private final static QName _OperatingConstraintsDurationListDataSelectors_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "operatingConstraintsDurationListDataSelectors");
    private final static QName _OperatingConstraintsPowerDescriptionData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "operatingConstraintsPowerDescriptionData");
    private final static QName _OperatingConstraintsPowerDescriptionDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "operatingConstraintsPowerDescriptionDataElements");
    private final static QName _OperatingConstraintsPowerDescriptionListData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "operatingConstraintsPowerDescriptionListData");
    private final static QName _OperatingConstraintsPowerDescriptionListDataSelectors_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "operatingConstraintsPowerDescriptionListDataSelectors");
    private final static QName _OperatingConstraintsPowerRangeData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "operatingConstraintsPowerRangeData");
    private final static QName _OperatingConstraintsPowerRangeDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "operatingConstraintsPowerRangeDataElements");
    private final static QName _OperatingConstraintsPowerRangeListData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "operatingConstraintsPowerRangeListData");
    private final static QName _OperatingConstraintsPowerRangeListDataSelectors_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "operatingConstraintsPowerRangeListDataSelectors");
    private final static QName _OperatingConstraintsPowerLevelData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "operatingConstraintsPowerLevelData");
    private final static QName _OperatingConstraintsPowerLevelDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "operatingConstraintsPowerLevelDataElements");
    private final static QName _OperatingConstraintsPowerLevelListData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "operatingConstraintsPowerLevelListData");
    private final static QName _OperatingConstraintsPowerLevelListDataSelectors_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "operatingConstraintsPowerLevelListDataSelectors");
    private final static QName _OperatingConstraintsResumeImplicationData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "operatingConstraintsResumeImplicationData");
    private final static QName _OperatingConstraintsResumeImplicationDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "operatingConstraintsResumeImplicationDataElements");
    private final static QName _OperatingConstraintsResumeImplicationListData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "operatingConstraintsResumeImplicationListData");
    private final static QName _OperatingConstraintsResumeImplicationListDataSelectors_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "operatingConstraintsResumeImplicationListDataSelectors");
    private final static QName _SensingData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "sensingData");
    private final static QName _SensingDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "sensingDataElements");
    private final static QName _SensingListData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "sensingListData");
    private final static QName _SensingListDataSelectors_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "sensingListDataSelectors");
    private final static QName _SensingDescriptionData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "sensingDescriptionData");
    private final static QName _SensingDescriptionDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "sensingDescriptionDataElements");
    private final static QName _SmartEnergyManagementPsData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "smartEnergyManagementPsData");
    private final static QName _SmartEnergyManagementPsDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "smartEnergyManagementPsDataElements");
    private final static QName _SmartEnergyManagementPsDataSelectors_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "smartEnergyManagementPsDataSelectors");
    private final static QName _SmartEnergyManagementPsPriceData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "smartEnergyManagementPsPriceData");
    private final static QName _SmartEnergyManagementPsPriceDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "smartEnergyManagementPsPriceDataElements");
    private final static QName _SmartEnergyManagementPsPriceDataSelectors_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "smartEnergyManagementPsPriceDataSelectors");
    private final static QName _SmartEnergyManagementPsConfigurationRequestCall_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "smartEnergyManagementPsConfigurationRequestCall");
    private final static QName _SmartEnergyManagementPsConfigurationRequestCallElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "smartEnergyManagementPsConfigurationRequestCallElements");
    private final static QName _SmartEnergyManagementPsPriceCalculationRequestCall_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "smartEnergyManagementPsPriceCalculationRequestCall");
    private final static QName _SmartEnergyManagementPsPriceCalculationRequestCallElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "smartEnergyManagementPsPriceCalculationRequestCallElements");
    private final static QName _StateInformationData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "stateInformationData");
    private final static QName _StateInformationDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "stateInformationDataElements");
    private final static QName _StateInformationListData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "stateInformationListData");
    private final static QName _StateInformationListDataSelectors_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "stateInformationListDataSelectors");
    private final static QName _TimeInformationData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "timeInformationData");
    private final static QName _TimeInformationDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "timeInformationDataElements");
    private final static QName _TimeDistributorData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "timeDistributorData");
    private final static QName _TimeDistributorDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "timeDistributorDataElements");
    private final static QName _TimePrecisionData_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "timePrecisionData");
    private final static QName _TimePrecisionDataElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "timePrecisionDataElements");
    private final static QName _TimeDistributorEnquiryCall_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "timeDistributorEnquiryCall");
    private final static QName _TimeDistributorEnquiryCallElements_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "timeDistributorEnquiryCallElements");
    private final static QName _CmdClassifier_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "cmdClassifier");
    private final static QName _ManufacturerSpecificExtension_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "manufacturerSpecificExtension");
    private final static QName _LastUpdateAt_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "lastUpdateAt");
    private final static QName _Function_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "function");
    private final static QName _Filter_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "filter");
    private final static QName _CmdControl_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "cmdControl");
    private final static QName _Header_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "header");
    private final static QName _Payload_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "payload");
    private final static QName _Datagram_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "datagram");
    private final static QName _NetworkManagementFeatureDescriptionDataTypeSpecificUsage_QNAME = new QName("http://docs.eebus.org/spine/xsd/v1", "specificUsage");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.openmuc.jeebus.spine.xsd.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SmartEnergyManagementPsPowerTimeSlotValueListElementsType }
     * 
     */
    public SmartEnergyManagementPsPowerTimeSlotValueListElementsType createSmartEnergyManagementPsPowerTimeSlotValueListElementsType() {
        return new SmartEnergyManagementPsPowerTimeSlotValueListElementsType();
    }

    /**
     * Create an instance of {@link SmartEnergyManagementPsPowerTimeSlotElementsType }
     * 
     */
    public SmartEnergyManagementPsPowerTimeSlotElementsType createSmartEnergyManagementPsPowerTimeSlotElementsType() {
        return new SmartEnergyManagementPsPowerTimeSlotElementsType();
    }

    /**
     * Create an instance of {@link SmartEnergyManagementPsPowerSequenceElementsType }
     * 
     */
    public SmartEnergyManagementPsPowerSequenceElementsType createSmartEnergyManagementPsPowerSequenceElementsType() {
        return new SmartEnergyManagementPsPowerSequenceElementsType();
    }

    /**
     * Create an instance of {@link SmartEnergyManagementPsPowerTimeSlotValueListType }
     * 
     */
    public SmartEnergyManagementPsPowerTimeSlotValueListType createSmartEnergyManagementPsPowerTimeSlotValueListType() {
        return new SmartEnergyManagementPsPowerTimeSlotValueListType();
    }

    /**
     * Create an instance of {@link SmartEnergyManagementPsPowerTimeSlotType }
     * 
     */
    public SmartEnergyManagementPsPowerTimeSlotType createSmartEnergyManagementPsPowerTimeSlotType() {
        return new SmartEnergyManagementPsPowerTimeSlotType();
    }

    /**
     * Create an instance of {@link SmartEnergyManagementPsPowerSequenceType }
     * 
     */
    public SmartEnergyManagementPsPowerSequenceType createSmartEnergyManagementPsPowerSequenceType() {
        return new SmartEnergyManagementPsPowerSequenceType();
    }

    /**
     * Create an instance of {@link NodeManagementDetailedDiscoveryFeatureInformationElementsType }
     * 
     */
    public NodeManagementDetailedDiscoveryFeatureInformationElementsType createNodeManagementDetailedDiscoveryFeatureInformationElementsType() {
        return new NodeManagementDetailedDiscoveryFeatureInformationElementsType();
    }

    /**
     * Create an instance of {@link NodeManagementDetailedDiscoveryEntityInformationElementsType }
     * 
     */
    public NodeManagementDetailedDiscoveryEntityInformationElementsType createNodeManagementDetailedDiscoveryEntityInformationElementsType() {
        return new NodeManagementDetailedDiscoveryEntityInformationElementsType();
    }

    /**
     * Create an instance of {@link NodeManagementDetailedDiscoveryDeviceInformationElementsType }
     * 
     */
    public NodeManagementDetailedDiscoveryDeviceInformationElementsType createNodeManagementDetailedDiscoveryDeviceInformationElementsType() {
        return new NodeManagementDetailedDiscoveryDeviceInformationElementsType();
    }

    /**
     * Create an instance of {@link NodeManagementSpecificationVersionListElementsType }
     * 
     */
    public NodeManagementSpecificationVersionListElementsType createNodeManagementSpecificationVersionListElementsType() {
        return new NodeManagementSpecificationVersionListElementsType();
    }

    /**
     * Create an instance of {@link NodeManagementDetailedDiscoveryFeatureInformationType }
     * 
     */
    public NodeManagementDetailedDiscoveryFeatureInformationType createNodeManagementDetailedDiscoveryFeatureInformationType() {
        return new NodeManagementDetailedDiscoveryFeatureInformationType();
    }

    /**
     * Create an instance of {@link NodeManagementDetailedDiscoveryEntityInformationType }
     * 
     */
    public NodeManagementDetailedDiscoveryEntityInformationType createNodeManagementDetailedDiscoveryEntityInformationType() {
        return new NodeManagementDetailedDiscoveryEntityInformationType();
    }

    /**
     * Create an instance of {@link NodeManagementDetailedDiscoveryDeviceInformationType }
     * 
     */
    public NodeManagementDetailedDiscoveryDeviceInformationType createNodeManagementDetailedDiscoveryDeviceInformationType() {
        return new NodeManagementDetailedDiscoveryDeviceInformationType();
    }

    /**
     * Create an instance of {@link IncentiveTableConstraintsElementsType }
     * 
     */
    public IncentiveTableConstraintsElementsType createIncentiveTableConstraintsElementsType() {
        return new IncentiveTableConstraintsElementsType();
    }

    /**
     * Create an instance of {@link IncentiveTableConstraintsType }
     * 
     */
    public IncentiveTableConstraintsType createIncentiveTableConstraintsType() {
        return new IncentiveTableConstraintsType();
    }

    /**
     * Create an instance of {@link IncentiveTableDescriptionTierElementsType }
     * 
     */
    public IncentiveTableDescriptionTierElementsType createIncentiveTableDescriptionTierElementsType() {
        return new IncentiveTableDescriptionTierElementsType();
    }

    /**
     * Create an instance of {@link IncentiveTableDescriptionElementsType }
     * 
     */
    public IncentiveTableDescriptionElementsType createIncentiveTableDescriptionElementsType() {
        return new IncentiveTableDescriptionElementsType();
    }

    /**
     * Create an instance of {@link IncentiveTableDescriptionTierType }
     * 
     */
    public IncentiveTableDescriptionTierType createIncentiveTableDescriptionTierType() {
        return new IncentiveTableDescriptionTierType();
    }

    /**
     * Create an instance of {@link IncentiveTableDescriptionType }
     * 
     */
    public IncentiveTableDescriptionType createIncentiveTableDescriptionType() {
        return new IncentiveTableDescriptionType();
    }

    /**
     * Create an instance of {@link IncentiveTableTierElementsType }
     * 
     */
    public IncentiveTableTierElementsType createIncentiveTableTierElementsType() {
        return new IncentiveTableTierElementsType();
    }

    /**
     * Create an instance of {@link IncentiveTableIncentiveSlotElementsType }
     * 
     */
    public IncentiveTableIncentiveSlotElementsType createIncentiveTableIncentiveSlotElementsType() {
        return new IncentiveTableIncentiveSlotElementsType();
    }

    /**
     * Create an instance of {@link IncentiveTableElementsType }
     * 
     */
    public IncentiveTableElementsType createIncentiveTableElementsType() {
        return new IncentiveTableElementsType();
    }

    /**
     * Create an instance of {@link IncentiveTableTierType }
     * 
     */
    public IncentiveTableTierType createIncentiveTableTierType() {
        return new IncentiveTableTierType();
    }

    /**
     * Create an instance of {@link IncentiveTableIncentiveSlotType }
     * 
     */
    public IncentiveTableIncentiveSlotType createIncentiveTableIncentiveSlotType() {
        return new IncentiveTableIncentiveSlotType();
    }

    /**
     * Create an instance of {@link IncentiveTableType }
     * 
     */
    public IncentiveTableType createIncentiveTableType() {
        return new IncentiveTableType();
    }

    /**
     * Create an instance of {@link SmartEnergyManagementPsPriceCalculationRequestCallElementsType }
     * 
     */
    public SmartEnergyManagementPsPriceCalculationRequestCallElementsType createSmartEnergyManagementPsPriceCalculationRequestCallElementsType() {
        return new SmartEnergyManagementPsPriceCalculationRequestCallElementsType();
    }

    /**
     * Create an instance of {@link SmartEnergyManagementPsPriceCalculationRequestCallType }
     * 
     */
    public SmartEnergyManagementPsPriceCalculationRequestCallType createSmartEnergyManagementPsPriceCalculationRequestCallType() {
        return new SmartEnergyManagementPsPriceCalculationRequestCallType();
    }

    /**
     * Create an instance of {@link SmartEnergyManagementPsConfigurationRequestCallElementsType }
     * 
     */
    public SmartEnergyManagementPsConfigurationRequestCallElementsType createSmartEnergyManagementPsConfigurationRequestCallElementsType() {
        return new SmartEnergyManagementPsConfigurationRequestCallElementsType();
    }

    /**
     * Create an instance of {@link SmartEnergyManagementPsConfigurationRequestCallType }
     * 
     */
    public SmartEnergyManagementPsConfigurationRequestCallType createSmartEnergyManagementPsConfigurationRequestCallType() {
        return new SmartEnergyManagementPsConfigurationRequestCallType();
    }

    /**
     * Create an instance of {@link SmartEnergyManagementPsPriceDataSelectorsType }
     * 
     */
    public SmartEnergyManagementPsPriceDataSelectorsType createSmartEnergyManagementPsPriceDataSelectorsType() {
        return new SmartEnergyManagementPsPriceDataSelectorsType();
    }

    /**
     * Create an instance of {@link SmartEnergyManagementPsPriceDataElementsType }
     * 
     */
    public SmartEnergyManagementPsPriceDataElementsType createSmartEnergyManagementPsPriceDataElementsType() {
        return new SmartEnergyManagementPsPriceDataElementsType();
    }

    /**
     * Create an instance of {@link SmartEnergyManagementPsPriceDataType }
     * 
     */
    public SmartEnergyManagementPsPriceDataType createSmartEnergyManagementPsPriceDataType() {
        return new SmartEnergyManagementPsPriceDataType();
    }

    /**
     * Create an instance of {@link SmartEnergyManagementPsDataSelectorsType }
     * 
     */
    public SmartEnergyManagementPsDataSelectorsType createSmartEnergyManagementPsDataSelectorsType() {
        return new SmartEnergyManagementPsDataSelectorsType();
    }

    /**
     * Create an instance of {@link SmartEnergyManagementPsDataElementsType }
     * 
     */
    public SmartEnergyManagementPsDataElementsType createSmartEnergyManagementPsDataElementsType() {
        return new SmartEnergyManagementPsDataElementsType();
    }

    /**
     * Create an instance of {@link SmartEnergyManagementPsDataType }
     * 
     */
    public SmartEnergyManagementPsDataType createSmartEnergyManagementPsDataType() {
        return new SmartEnergyManagementPsDataType();
    }

    /**
     * Create an instance of {@link NodeManagementUseCaseDataSelectorsType }
     * 
     */
    public NodeManagementUseCaseDataSelectorsType createNodeManagementUseCaseDataSelectorsType() {
        return new NodeManagementUseCaseDataSelectorsType();
    }

    /**
     * Create an instance of {@link NodeManagementUseCaseDataElementsType }
     * 
     */
    public NodeManagementUseCaseDataElementsType createNodeManagementUseCaseDataElementsType() {
        return new NodeManagementUseCaseDataElementsType();
    }

    /**
     * Create an instance of {@link NodeManagementUseCaseDataType }
     * 
     */
    public NodeManagementUseCaseDataType createNodeManagementUseCaseDataType() {
        return new NodeManagementUseCaseDataType();
    }

    /**
     * Create an instance of {@link NodeManagementDestinationListDataSelectorsType }
     * 
     */
    public NodeManagementDestinationListDataSelectorsType createNodeManagementDestinationListDataSelectorsType() {
        return new NodeManagementDestinationListDataSelectorsType();
    }

    /**
     * Create an instance of {@link NodeManagementDestinationDataElementsType }
     * 
     */
    public NodeManagementDestinationDataElementsType createNodeManagementDestinationDataElementsType() {
        return new NodeManagementDestinationDataElementsType();
    }

    /**
     * Create an instance of {@link NodeManagementDestinationDataType }
     * 
     */
    public NodeManagementDestinationDataType createNodeManagementDestinationDataType() {
        return new NodeManagementDestinationDataType();
    }

    /**
     * Create an instance of {@link NodeManagementSubscriptionDeleteCallElementsType }
     * 
     */
    public NodeManagementSubscriptionDeleteCallElementsType createNodeManagementSubscriptionDeleteCallElementsType() {
        return new NodeManagementSubscriptionDeleteCallElementsType();
    }

    /**
     * Create an instance of {@link NodeManagementSubscriptionDeleteCallType }
     * 
     */
    public NodeManagementSubscriptionDeleteCallType createNodeManagementSubscriptionDeleteCallType() {
        return new NodeManagementSubscriptionDeleteCallType();
    }

    /**
     * Create an instance of {@link NodeManagementSubscriptionRequestCallElementsType }
     * 
     */
    public NodeManagementSubscriptionRequestCallElementsType createNodeManagementSubscriptionRequestCallElementsType() {
        return new NodeManagementSubscriptionRequestCallElementsType();
    }

    /**
     * Create an instance of {@link NodeManagementSubscriptionRequestCallType }
     * 
     */
    public NodeManagementSubscriptionRequestCallType createNodeManagementSubscriptionRequestCallType() {
        return new NodeManagementSubscriptionRequestCallType();
    }

    /**
     * Create an instance of {@link NodeManagementSubscriptionDataSelectorsType }
     * 
     */
    public NodeManagementSubscriptionDataSelectorsType createNodeManagementSubscriptionDataSelectorsType() {
        return new NodeManagementSubscriptionDataSelectorsType();
    }

    /**
     * Create an instance of {@link NodeManagementSubscriptionDataElementsType }
     * 
     */
    public NodeManagementSubscriptionDataElementsType createNodeManagementSubscriptionDataElementsType() {
        return new NodeManagementSubscriptionDataElementsType();
    }

    /**
     * Create an instance of {@link NodeManagementSubscriptionDataType }
     * 
     */
    public NodeManagementSubscriptionDataType createNodeManagementSubscriptionDataType() {
        return new NodeManagementSubscriptionDataType();
    }

    /**
     * Create an instance of {@link NodeManagementBindingDeleteCallElementsType }
     * 
     */
    public NodeManagementBindingDeleteCallElementsType createNodeManagementBindingDeleteCallElementsType() {
        return new NodeManagementBindingDeleteCallElementsType();
    }

    /**
     * Create an instance of {@link NodeManagementBindingDeleteCallType }
     * 
     */
    public NodeManagementBindingDeleteCallType createNodeManagementBindingDeleteCallType() {
        return new NodeManagementBindingDeleteCallType();
    }

    /**
     * Create an instance of {@link NodeManagementBindingRequestCallElementsType }
     * 
     */
    public NodeManagementBindingRequestCallElementsType createNodeManagementBindingRequestCallElementsType() {
        return new NodeManagementBindingRequestCallElementsType();
    }

    /**
     * Create an instance of {@link NodeManagementBindingRequestCallType }
     * 
     */
    public NodeManagementBindingRequestCallType createNodeManagementBindingRequestCallType() {
        return new NodeManagementBindingRequestCallType();
    }

    /**
     * Create an instance of {@link NodeManagementBindingDataSelectorsType }
     * 
     */
    public NodeManagementBindingDataSelectorsType createNodeManagementBindingDataSelectorsType() {
        return new NodeManagementBindingDataSelectorsType();
    }

    /**
     * Create an instance of {@link NodeManagementBindingDataElementsType }
     * 
     */
    public NodeManagementBindingDataElementsType createNodeManagementBindingDataElementsType() {
        return new NodeManagementBindingDataElementsType();
    }

    /**
     * Create an instance of {@link NodeManagementBindingDataType }
     * 
     */
    public NodeManagementBindingDataType createNodeManagementBindingDataType() {
        return new NodeManagementBindingDataType();
    }

    /**
     * Create an instance of {@link NodeManagementDetailedDiscoveryDataSelectorsType }
     * 
     */
    public NodeManagementDetailedDiscoveryDataSelectorsType createNodeManagementDetailedDiscoveryDataSelectorsType() {
        return new NodeManagementDetailedDiscoveryDataSelectorsType();
    }

    /**
     * Create an instance of {@link IncentiveTableConstraintsDataSelectorsType }
     * 
     */
    public IncentiveTableConstraintsDataSelectorsType createIncentiveTableConstraintsDataSelectorsType() {
        return new IncentiveTableConstraintsDataSelectorsType();
    }

    /**
     * Create an instance of {@link IncentiveTableDescriptionDataSelectorsType }
     * 
     */
    public IncentiveTableDescriptionDataSelectorsType createIncentiveTableDescriptionDataSelectorsType() {
        return new IncentiveTableDescriptionDataSelectorsType();
    }

    /**
     * Create an instance of {@link IncentiveTableDataSelectorsType }
     * 
     */
    public IncentiveTableDataSelectorsType createIncentiveTableDataSelectorsType() {
        return new IncentiveTableDataSelectorsType();
    }

    /**
     * Create an instance of {@link BillDataElementsType }
     * 
     */
    public BillDataElementsType createBillDataElementsType() {
        return new BillDataElementsType();
    }

    /**
     * Create an instance of {@link BillDataType }
     * 
     */
    public BillDataType createBillDataType() {
        return new BillDataType();
    }

    /**
     * Create an instance of {@link ThresholdDataType }
     * 
     */
    public ThresholdDataType createThresholdDataType() {
        return new ThresholdDataType();
    }

    /**
     * Create an instance of {@link ThresholdDataElementsType }
     * 
     */
    public ThresholdDataElementsType createThresholdDataElementsType() {
        return new ThresholdDataElementsType();
    }

    /**
     * Create an instance of {@link ThresholdListDataType }
     * 
     */
    public ThresholdListDataType createThresholdListDataType() {
        return new ThresholdListDataType();
    }

    /**
     * Create an instance of {@link ThresholdListDataSelectorsType }
     * 
     */
    public ThresholdListDataSelectorsType createThresholdListDataSelectorsType() {
        return new ThresholdListDataSelectorsType();
    }

    /**
     * Create an instance of {@link ThresholdConstraintsDataType }
     * 
     */
    public ThresholdConstraintsDataType createThresholdConstraintsDataType() {
        return new ThresholdConstraintsDataType();
    }

    /**
     * Create an instance of {@link ThresholdConstraintsDataElementsType }
     * 
     */
    public ThresholdConstraintsDataElementsType createThresholdConstraintsDataElementsType() {
        return new ThresholdConstraintsDataElementsType();
    }

    /**
     * Create an instance of {@link ThresholdConstraintsListDataType }
     * 
     */
    public ThresholdConstraintsListDataType createThresholdConstraintsListDataType() {
        return new ThresholdConstraintsListDataType();
    }

    /**
     * Create an instance of {@link ThresholdConstraintsListDataSelectorsType }
     * 
     */
    public ThresholdConstraintsListDataSelectorsType createThresholdConstraintsListDataSelectorsType() {
        return new ThresholdConstraintsListDataSelectorsType();
    }

    /**
     * Create an instance of {@link ThresholdDescriptionDataType }
     * 
     */
    public ThresholdDescriptionDataType createThresholdDescriptionDataType() {
        return new ThresholdDescriptionDataType();
    }

    /**
     * Create an instance of {@link ThresholdDescriptionDataElementsType }
     * 
     */
    public ThresholdDescriptionDataElementsType createThresholdDescriptionDataElementsType() {
        return new ThresholdDescriptionDataElementsType();
    }

    /**
     * Create an instance of {@link ThresholdDescriptionListDataType }
     * 
     */
    public ThresholdDescriptionListDataType createThresholdDescriptionListDataType() {
        return new ThresholdDescriptionListDataType();
    }

    /**
     * Create an instance of {@link ThresholdDescriptionListDataSelectorsType }
     * 
     */
    public ThresholdDescriptionListDataSelectorsType createThresholdDescriptionListDataSelectorsType() {
        return new ThresholdDescriptionListDataSelectorsType();
    }

    /**
     * Create an instance of {@link MeasurementDataType }
     * 
     */
    public MeasurementDataType createMeasurementDataType() {
        return new MeasurementDataType();
    }

    /**
     * Create an instance of {@link MeasurementDataElementsType }
     * 
     */
    public MeasurementDataElementsType createMeasurementDataElementsType() {
        return new MeasurementDataElementsType();
    }

    /**
     * Create an instance of {@link MeasurementListDataType }
     * 
     */
    public MeasurementListDataType createMeasurementListDataType() {
        return new MeasurementListDataType();
    }

    /**
     * Create an instance of {@link MeasurementListDataSelectorsType }
     * 
     */
    public MeasurementListDataSelectorsType createMeasurementListDataSelectorsType() {
        return new MeasurementListDataSelectorsType();
    }

    /**
     * Create an instance of {@link MeasurementSeriesDataType }
     * 
     */
    public MeasurementSeriesDataType createMeasurementSeriesDataType() {
        return new MeasurementSeriesDataType();
    }

    /**
     * Create an instance of {@link MeasurementSeriesDataElementsType }
     * 
     */
    public MeasurementSeriesDataElementsType createMeasurementSeriesDataElementsType() {
        return new MeasurementSeriesDataElementsType();
    }

    /**
     * Create an instance of {@link MeasurementSeriesListDataType }
     * 
     */
    public MeasurementSeriesListDataType createMeasurementSeriesListDataType() {
        return new MeasurementSeriesListDataType();
    }

    /**
     * Create an instance of {@link MeasurementSeriesListDataSelectorsType }
     * 
     */
    public MeasurementSeriesListDataSelectorsType createMeasurementSeriesListDataSelectorsType() {
        return new MeasurementSeriesListDataSelectorsType();
    }

    /**
     * Create an instance of {@link MeasurementConstraintsDataType }
     * 
     */
    public MeasurementConstraintsDataType createMeasurementConstraintsDataType() {
        return new MeasurementConstraintsDataType();
    }

    /**
     * Create an instance of {@link MeasurementConstraintsDataElementsType }
     * 
     */
    public MeasurementConstraintsDataElementsType createMeasurementConstraintsDataElementsType() {
        return new MeasurementConstraintsDataElementsType();
    }

    /**
     * Create an instance of {@link MeasurementConstraintsListDataType }
     * 
     */
    public MeasurementConstraintsListDataType createMeasurementConstraintsListDataType() {
        return new MeasurementConstraintsListDataType();
    }

    /**
     * Create an instance of {@link MeasurementConstraintsListDataSelectorsType }
     * 
     */
    public MeasurementConstraintsListDataSelectorsType createMeasurementConstraintsListDataSelectorsType() {
        return new MeasurementConstraintsListDataSelectorsType();
    }

    /**
     * Create an instance of {@link MeasurementDescriptionDataType }
     * 
     */
    public MeasurementDescriptionDataType createMeasurementDescriptionDataType() {
        return new MeasurementDescriptionDataType();
    }

    /**
     * Create an instance of {@link MeasurementDescriptionDataElementsType }
     * 
     */
    public MeasurementDescriptionDataElementsType createMeasurementDescriptionDataElementsType() {
        return new MeasurementDescriptionDataElementsType();
    }

    /**
     * Create an instance of {@link MeasurementDescriptionListDataType }
     * 
     */
    public MeasurementDescriptionListDataType createMeasurementDescriptionListDataType() {
        return new MeasurementDescriptionListDataType();
    }

    /**
     * Create an instance of {@link MeasurementDescriptionListDataSelectorsType }
     * 
     */
    public MeasurementDescriptionListDataSelectorsType createMeasurementDescriptionListDataSelectorsType() {
        return new MeasurementDescriptionListDataSelectorsType();
    }

    /**
     * Create an instance of {@link MeasurementThresholdRelationDataType }
     * 
     */
    public MeasurementThresholdRelationDataType createMeasurementThresholdRelationDataType() {
        return new MeasurementThresholdRelationDataType();
    }

    /**
     * Create an instance of {@link MeasurementThresholdRelationDataElementsType }
     * 
     */
    public MeasurementThresholdRelationDataElementsType createMeasurementThresholdRelationDataElementsType() {
        return new MeasurementThresholdRelationDataElementsType();
    }

    /**
     * Create an instance of {@link MeasurementThresholdRelationListDataType }
     * 
     */
    public MeasurementThresholdRelationListDataType createMeasurementThresholdRelationListDataType() {
        return new MeasurementThresholdRelationListDataType();
    }

    /**
     * Create an instance of {@link MeasurementThresholdRelationListDataSelectorsType }
     * 
     */
    public MeasurementThresholdRelationListDataSelectorsType createMeasurementThresholdRelationListDataSelectorsType() {
        return new MeasurementThresholdRelationListDataSelectorsType();
    }

    /**
     * Create an instance of {@link TimeSeriesDataType }
     * 
     */
    public TimeSeriesDataType createTimeSeriesDataType() {
        return new TimeSeriesDataType();
    }

    /**
     * Create an instance of {@link TimeSeriesDataElementsType }
     * 
     */
    public TimeSeriesDataElementsType createTimeSeriesDataElementsType() {
        return new TimeSeriesDataElementsType();
    }

    /**
     * Create an instance of {@link TimeSeriesListDataType }
     * 
     */
    public TimeSeriesListDataType createTimeSeriesListDataType() {
        return new TimeSeriesListDataType();
    }

    /**
     * Create an instance of {@link TimeSeriesListDataSelectorsType }
     * 
     */
    public TimeSeriesListDataSelectorsType createTimeSeriesListDataSelectorsType() {
        return new TimeSeriesListDataSelectorsType();
    }

    /**
     * Create an instance of {@link TimeSeriesDescriptionDataType }
     * 
     */
    public TimeSeriesDescriptionDataType createTimeSeriesDescriptionDataType() {
        return new TimeSeriesDescriptionDataType();
    }

    /**
     * Create an instance of {@link TimeSeriesDescriptionDataElementsType }
     * 
     */
    public TimeSeriesDescriptionDataElementsType createTimeSeriesDescriptionDataElementsType() {
        return new TimeSeriesDescriptionDataElementsType();
    }

    /**
     * Create an instance of {@link TimeSeriesDescriptionListDataType }
     * 
     */
    public TimeSeriesDescriptionListDataType createTimeSeriesDescriptionListDataType() {
        return new TimeSeriesDescriptionListDataType();
    }

    /**
     * Create an instance of {@link TimeSeriesDescriptionListDataSelectorsType }
     * 
     */
    public TimeSeriesDescriptionListDataSelectorsType createTimeSeriesDescriptionListDataSelectorsType() {
        return new TimeSeriesDescriptionListDataSelectorsType();
    }

    /**
     * Create an instance of {@link TimeSeriesConstraintsDataType }
     * 
     */
    public TimeSeriesConstraintsDataType createTimeSeriesConstraintsDataType() {
        return new TimeSeriesConstraintsDataType();
    }

    /**
     * Create an instance of {@link TimeSeriesConstraintsDataElementsType }
     * 
     */
    public TimeSeriesConstraintsDataElementsType createTimeSeriesConstraintsDataElementsType() {
        return new TimeSeriesConstraintsDataElementsType();
    }

    /**
     * Create an instance of {@link TimeSeriesConstraintsListDataType }
     * 
     */
    public TimeSeriesConstraintsListDataType createTimeSeriesConstraintsListDataType() {
        return new TimeSeriesConstraintsListDataType();
    }

    /**
     * Create an instance of {@link TimeSeriesConstraintsListDataSelectorsType }
     * 
     */
    public TimeSeriesConstraintsListDataSelectorsType createTimeSeriesConstraintsListDataSelectorsType() {
        return new TimeSeriesConstraintsListDataSelectorsType();
    }

    /**
     * Create an instance of {@link ActuatorSwitchDataType }
     * 
     */
    public ActuatorSwitchDataType createActuatorSwitchDataType() {
        return new ActuatorSwitchDataType();
    }

    /**
     * Create an instance of {@link ActuatorSwitchDataElementsType }
     * 
     */
    public ActuatorSwitchDataElementsType createActuatorSwitchDataElementsType() {
        return new ActuatorSwitchDataElementsType();
    }

    /**
     * Create an instance of {@link ActuatorSwitchDescriptionDataType }
     * 
     */
    public ActuatorSwitchDescriptionDataType createActuatorSwitchDescriptionDataType() {
        return new ActuatorSwitchDescriptionDataType();
    }

    /**
     * Create an instance of {@link ActuatorSwitchDescriptionDataElementsType }
     * 
     */
    public ActuatorSwitchDescriptionDataElementsType createActuatorSwitchDescriptionDataElementsType() {
        return new ActuatorSwitchDescriptionDataElementsType();
    }

    /**
     * Create an instance of {@link DeviceConfigurationKeyValueDataType }
     * 
     */
    public DeviceConfigurationKeyValueDataType createDeviceConfigurationKeyValueDataType() {
        return new DeviceConfigurationKeyValueDataType();
    }

    /**
     * Create an instance of {@link DeviceConfigurationKeyValueDataElementsType }
     * 
     */
    public DeviceConfigurationKeyValueDataElementsType createDeviceConfigurationKeyValueDataElementsType() {
        return new DeviceConfigurationKeyValueDataElementsType();
    }

    /**
     * Create an instance of {@link DeviceConfigurationKeyValueListDataType }
     * 
     */
    public DeviceConfigurationKeyValueListDataType createDeviceConfigurationKeyValueListDataType() {
        return new DeviceConfigurationKeyValueListDataType();
    }

    /**
     * Create an instance of {@link DeviceConfigurationKeyValueListDataSelectorsType }
     * 
     */
    public DeviceConfigurationKeyValueListDataSelectorsType createDeviceConfigurationKeyValueListDataSelectorsType() {
        return new DeviceConfigurationKeyValueListDataSelectorsType();
    }

    /**
     * Create an instance of {@link DeviceConfigurationKeyValueDescriptionDataType }
     * 
     */
    public DeviceConfigurationKeyValueDescriptionDataType createDeviceConfigurationKeyValueDescriptionDataType() {
        return new DeviceConfigurationKeyValueDescriptionDataType();
    }

    /**
     * Create an instance of {@link DeviceConfigurationKeyValueDescriptionDataElementsType }
     * 
     */
    public DeviceConfigurationKeyValueDescriptionDataElementsType createDeviceConfigurationKeyValueDescriptionDataElementsType() {
        return new DeviceConfigurationKeyValueDescriptionDataElementsType();
    }

    /**
     * Create an instance of {@link DeviceConfigurationKeyValueDescriptionListDataType }
     * 
     */
    public DeviceConfigurationKeyValueDescriptionListDataType createDeviceConfigurationKeyValueDescriptionListDataType() {
        return new DeviceConfigurationKeyValueDescriptionListDataType();
    }

    /**
     * Create an instance of {@link DeviceConfigurationKeyValueDescriptionListDataSelectorsType }
     * 
     */
    public DeviceConfigurationKeyValueDescriptionListDataSelectorsType createDeviceConfigurationKeyValueDescriptionListDataSelectorsType() {
        return new DeviceConfigurationKeyValueDescriptionListDataSelectorsType();
    }

    /**
     * Create an instance of {@link DeviceConfigurationKeyValueConstraintsDataType }
     * 
     */
    public DeviceConfigurationKeyValueConstraintsDataType createDeviceConfigurationKeyValueConstraintsDataType() {
        return new DeviceConfigurationKeyValueConstraintsDataType();
    }

    /**
     * Create an instance of {@link DeviceConfigurationKeyValueConstraintsDataElementsType }
     * 
     */
    public DeviceConfigurationKeyValueConstraintsDataElementsType createDeviceConfigurationKeyValueConstraintsDataElementsType() {
        return new DeviceConfigurationKeyValueConstraintsDataElementsType();
    }

    /**
     * Create an instance of {@link DeviceConfigurationKeyValueConstraintsListDataType }
     * 
     */
    public DeviceConfigurationKeyValueConstraintsListDataType createDeviceConfigurationKeyValueConstraintsListDataType() {
        return new DeviceConfigurationKeyValueConstraintsListDataType();
    }

    /**
     * Create an instance of {@link DeviceConfigurationKeyValueConstraintsListDataSelectorsType }
     * 
     */
    public DeviceConfigurationKeyValueConstraintsListDataSelectorsType createDeviceConfigurationKeyValueConstraintsListDataSelectorsType() {
        return new DeviceConfigurationKeyValueConstraintsListDataSelectorsType();
    }

    /**
     * Create an instance of {@link PowerTimeSlotScheduleDataType }
     * 
     */
    public PowerTimeSlotScheduleDataType createPowerTimeSlotScheduleDataType() {
        return new PowerTimeSlotScheduleDataType();
    }

    /**
     * Create an instance of {@link PowerTimeSlotScheduleDataElementsType }
     * 
     */
    public PowerTimeSlotScheduleDataElementsType createPowerTimeSlotScheduleDataElementsType() {
        return new PowerTimeSlotScheduleDataElementsType();
    }

    /**
     * Create an instance of {@link PowerTimeSlotScheduleListDataType }
     * 
     */
    public PowerTimeSlotScheduleListDataType createPowerTimeSlotScheduleListDataType() {
        return new PowerTimeSlotScheduleListDataType();
    }

    /**
     * Create an instance of {@link PowerTimeSlotScheduleListDataSelectorsType }
     * 
     */
    public PowerTimeSlotScheduleListDataSelectorsType createPowerTimeSlotScheduleListDataSelectorsType() {
        return new PowerTimeSlotScheduleListDataSelectorsType();
    }

    /**
     * Create an instance of {@link PowerTimeSlotValueDataType }
     * 
     */
    public PowerTimeSlotValueDataType createPowerTimeSlotValueDataType() {
        return new PowerTimeSlotValueDataType();
    }

    /**
     * Create an instance of {@link PowerTimeSlotValueDataElementsType }
     * 
     */
    public PowerTimeSlotValueDataElementsType createPowerTimeSlotValueDataElementsType() {
        return new PowerTimeSlotValueDataElementsType();
    }

    /**
     * Create an instance of {@link PowerTimeSlotValueListDataType }
     * 
     */
    public PowerTimeSlotValueListDataType createPowerTimeSlotValueListDataType() {
        return new PowerTimeSlotValueListDataType();
    }

    /**
     * Create an instance of {@link PowerTimeSlotValueListDataSelectorsType }
     * 
     */
    public PowerTimeSlotValueListDataSelectorsType createPowerTimeSlotValueListDataSelectorsType() {
        return new PowerTimeSlotValueListDataSelectorsType();
    }

    /**
     * Create an instance of {@link PowerTimeSlotScheduleConstraintsDataType }
     * 
     */
    public PowerTimeSlotScheduleConstraintsDataType createPowerTimeSlotScheduleConstraintsDataType() {
        return new PowerTimeSlotScheduleConstraintsDataType();
    }

    /**
     * Create an instance of {@link PowerTimeSlotScheduleConstraintsDataElementsType }
     * 
     */
    public PowerTimeSlotScheduleConstraintsDataElementsType createPowerTimeSlotScheduleConstraintsDataElementsType() {
        return new PowerTimeSlotScheduleConstraintsDataElementsType();
    }

    /**
     * Create an instance of {@link PowerTimeSlotScheduleConstraintsListDataType }
     * 
     */
    public PowerTimeSlotScheduleConstraintsListDataType createPowerTimeSlotScheduleConstraintsListDataType() {
        return new PowerTimeSlotScheduleConstraintsListDataType();
    }

    /**
     * Create an instance of {@link PowerTimeSlotScheduleConstraintsListDataSelectorsType }
     * 
     */
    public PowerTimeSlotScheduleConstraintsListDataSelectorsType createPowerTimeSlotScheduleConstraintsListDataSelectorsType() {
        return new PowerTimeSlotScheduleConstraintsListDataSelectorsType();
    }

    /**
     * Create an instance of {@link PowerSequenceAlternativesRelationDataType }
     * 
     */
    public PowerSequenceAlternativesRelationDataType createPowerSequenceAlternativesRelationDataType() {
        return new PowerSequenceAlternativesRelationDataType();
    }

    /**
     * Create an instance of {@link PowerSequenceAlternativesRelationDataElementsType }
     * 
     */
    public PowerSequenceAlternativesRelationDataElementsType createPowerSequenceAlternativesRelationDataElementsType() {
        return new PowerSequenceAlternativesRelationDataElementsType();
    }

    /**
     * Create an instance of {@link PowerSequenceAlternativesRelationListDataType }
     * 
     */
    public PowerSequenceAlternativesRelationListDataType createPowerSequenceAlternativesRelationListDataType() {
        return new PowerSequenceAlternativesRelationListDataType();
    }

    /**
     * Create an instance of {@link PowerSequenceAlternativesRelationListDataSelectorsType }
     * 
     */
    public PowerSequenceAlternativesRelationListDataSelectorsType createPowerSequenceAlternativesRelationListDataSelectorsType() {
        return new PowerSequenceAlternativesRelationListDataSelectorsType();
    }

    /**
     * Create an instance of {@link PowerSequenceDescriptionDataType }
     * 
     */
    public PowerSequenceDescriptionDataType createPowerSequenceDescriptionDataType() {
        return new PowerSequenceDescriptionDataType();
    }

    /**
     * Create an instance of {@link PowerSequenceDescriptionDataElementsType }
     * 
     */
    public PowerSequenceDescriptionDataElementsType createPowerSequenceDescriptionDataElementsType() {
        return new PowerSequenceDescriptionDataElementsType();
    }

    /**
     * Create an instance of {@link PowerSequenceDescriptionListDataType }
     * 
     */
    public PowerSequenceDescriptionListDataType createPowerSequenceDescriptionListDataType() {
        return new PowerSequenceDescriptionListDataType();
    }

    /**
     * Create an instance of {@link PowerSequenceDescriptionListDataSelectorsType }
     * 
     */
    public PowerSequenceDescriptionListDataSelectorsType createPowerSequenceDescriptionListDataSelectorsType() {
        return new PowerSequenceDescriptionListDataSelectorsType();
    }

    /**
     * Create an instance of {@link PowerSequenceStateDataType }
     * 
     */
    public PowerSequenceStateDataType createPowerSequenceStateDataType() {
        return new PowerSequenceStateDataType();
    }

    /**
     * Create an instance of {@link PowerSequenceStateDataElementsType }
     * 
     */
    public PowerSequenceStateDataElementsType createPowerSequenceStateDataElementsType() {
        return new PowerSequenceStateDataElementsType();
    }

    /**
     * Create an instance of {@link PowerSequenceStateListDataType }
     * 
     */
    public PowerSequenceStateListDataType createPowerSequenceStateListDataType() {
        return new PowerSequenceStateListDataType();
    }

    /**
     * Create an instance of {@link PowerSequenceStateListDataSelectorsType }
     * 
     */
    public PowerSequenceStateListDataSelectorsType createPowerSequenceStateListDataSelectorsType() {
        return new PowerSequenceStateListDataSelectorsType();
    }

    /**
     * Create an instance of {@link PowerSequenceScheduleDataType }
     * 
     */
    public PowerSequenceScheduleDataType createPowerSequenceScheduleDataType() {
        return new PowerSequenceScheduleDataType();
    }

    /**
     * Create an instance of {@link PowerSequenceScheduleDataElementsType }
     * 
     */
    public PowerSequenceScheduleDataElementsType createPowerSequenceScheduleDataElementsType() {
        return new PowerSequenceScheduleDataElementsType();
    }

    /**
     * Create an instance of {@link PowerSequenceScheduleListDataType }
     * 
     */
    public PowerSequenceScheduleListDataType createPowerSequenceScheduleListDataType() {
        return new PowerSequenceScheduleListDataType();
    }

    /**
     * Create an instance of {@link PowerSequenceScheduleListDataSelectorsType }
     * 
     */
    public PowerSequenceScheduleListDataSelectorsType createPowerSequenceScheduleListDataSelectorsType() {
        return new PowerSequenceScheduleListDataSelectorsType();
    }

    /**
     * Create an instance of {@link PowerSequenceScheduleConstraintsDataType }
     * 
     */
    public PowerSequenceScheduleConstraintsDataType createPowerSequenceScheduleConstraintsDataType() {
        return new PowerSequenceScheduleConstraintsDataType();
    }

    /**
     * Create an instance of {@link PowerSequenceScheduleConstraintsDataElementsType }
     * 
     */
    public PowerSequenceScheduleConstraintsDataElementsType createPowerSequenceScheduleConstraintsDataElementsType() {
        return new PowerSequenceScheduleConstraintsDataElementsType();
    }

    /**
     * Create an instance of {@link PowerSequenceScheduleConstraintsListDataType }
     * 
     */
    public PowerSequenceScheduleConstraintsListDataType createPowerSequenceScheduleConstraintsListDataType() {
        return new PowerSequenceScheduleConstraintsListDataType();
    }

    /**
     * Create an instance of {@link PowerSequenceScheduleConstraintsListDataSelectorsType }
     * 
     */
    public PowerSequenceScheduleConstraintsListDataSelectorsType createPowerSequenceScheduleConstraintsListDataSelectorsType() {
        return new PowerSequenceScheduleConstraintsListDataSelectorsType();
    }

    /**
     * Create an instance of {@link PowerSequencePriceDataType }
     * 
     */
    public PowerSequencePriceDataType createPowerSequencePriceDataType() {
        return new PowerSequencePriceDataType();
    }

    /**
     * Create an instance of {@link PowerSequencePriceDataElementsType }
     * 
     */
    public PowerSequencePriceDataElementsType createPowerSequencePriceDataElementsType() {
        return new PowerSequencePriceDataElementsType();
    }

    /**
     * Create an instance of {@link PowerSequencePriceListDataType }
     * 
     */
    public PowerSequencePriceListDataType createPowerSequencePriceListDataType() {
        return new PowerSequencePriceListDataType();
    }

    /**
     * Create an instance of {@link PowerSequencePriceListDataSelectorsType }
     * 
     */
    public PowerSequencePriceListDataSelectorsType createPowerSequencePriceListDataSelectorsType() {
        return new PowerSequencePriceListDataSelectorsType();
    }

    /**
     * Create an instance of {@link PowerSequenceSchedulePreferenceDataType }
     * 
     */
    public PowerSequenceSchedulePreferenceDataType createPowerSequenceSchedulePreferenceDataType() {
        return new PowerSequenceSchedulePreferenceDataType();
    }

    /**
     * Create an instance of {@link PowerSequenceSchedulePreferenceDataElementsType }
     * 
     */
    public PowerSequenceSchedulePreferenceDataElementsType createPowerSequenceSchedulePreferenceDataElementsType() {
        return new PowerSequenceSchedulePreferenceDataElementsType();
    }

    /**
     * Create an instance of {@link PowerSequenceSchedulePreferenceListDataType }
     * 
     */
    public PowerSequenceSchedulePreferenceListDataType createPowerSequenceSchedulePreferenceListDataType() {
        return new PowerSequenceSchedulePreferenceListDataType();
    }

    /**
     * Create an instance of {@link PowerSequenceSchedulePreferenceListDataSelectorsType }
     * 
     */
    public PowerSequenceSchedulePreferenceListDataSelectorsType createPowerSequenceSchedulePreferenceListDataSelectorsType() {
        return new PowerSequenceSchedulePreferenceListDataSelectorsType();
    }

    /**
     * Create an instance of {@link PowerSequenceNodeScheduleInformationDataType }
     * 
     */
    public PowerSequenceNodeScheduleInformationDataType createPowerSequenceNodeScheduleInformationDataType() {
        return new PowerSequenceNodeScheduleInformationDataType();
    }

    /**
     * Create an instance of {@link PowerSequenceNodeScheduleInformationDataElementsType }
     * 
     */
    public PowerSequenceNodeScheduleInformationDataElementsType createPowerSequenceNodeScheduleInformationDataElementsType() {
        return new PowerSequenceNodeScheduleInformationDataElementsType();
    }

    /**
     * Create an instance of {@link PowerSequenceScheduleConfigurationRequestCallType }
     * 
     */
    public PowerSequenceScheduleConfigurationRequestCallType createPowerSequenceScheduleConfigurationRequestCallType() {
        return new PowerSequenceScheduleConfigurationRequestCallType();
    }

    /**
     * Create an instance of {@link PowerSequenceScheduleConfigurationRequestCallElementsType }
     * 
     */
    public PowerSequenceScheduleConfigurationRequestCallElementsType createPowerSequenceScheduleConfigurationRequestCallElementsType() {
        return new PowerSequenceScheduleConfigurationRequestCallElementsType();
    }

    /**
     * Create an instance of {@link PowerSequencePriceCalculationRequestCallType }
     * 
     */
    public PowerSequencePriceCalculationRequestCallType createPowerSequencePriceCalculationRequestCallType() {
        return new PowerSequencePriceCalculationRequestCallType();
    }

    /**
     * Create an instance of {@link PowerSequencePriceCalculationRequestCallElementsType }
     * 
     */
    public PowerSequencePriceCalculationRequestCallElementsType createPowerSequencePriceCalculationRequestCallElementsType() {
        return new PowerSequencePriceCalculationRequestCallElementsType();
    }

    /**
     * Create an instance of {@link DirectControlActivityDataType }
     * 
     */
    public DirectControlActivityDataType createDirectControlActivityDataType() {
        return new DirectControlActivityDataType();
    }

    /**
     * Create an instance of {@link DirectControlActivityDataElementsType }
     * 
     */
    public DirectControlActivityDataElementsType createDirectControlActivityDataElementsType() {
        return new DirectControlActivityDataElementsType();
    }

    /**
     * Create an instance of {@link DirectControlActivityListDataType }
     * 
     */
    public DirectControlActivityListDataType createDirectControlActivityListDataType() {
        return new DirectControlActivityListDataType();
    }

    /**
     * Create an instance of {@link DirectControlActivityListDataSelectorsType }
     * 
     */
    public DirectControlActivityListDataSelectorsType createDirectControlActivityListDataSelectorsType() {
        return new DirectControlActivityListDataSelectorsType();
    }

    /**
     * Create an instance of {@link DirectControlDescriptionDataType }
     * 
     */
    public DirectControlDescriptionDataType createDirectControlDescriptionDataType() {
        return new DirectControlDescriptionDataType();
    }

    /**
     * Create an instance of {@link DirectControlDescriptionDataElementsType }
     * 
     */
    public DirectControlDescriptionDataElementsType createDirectControlDescriptionDataElementsType() {
        return new DirectControlDescriptionDataElementsType();
    }

    /**
     * Create an instance of {@link TimeTableDataType }
     * 
     */
    public TimeTableDataType createTimeTableDataType() {
        return new TimeTableDataType();
    }

    /**
     * Create an instance of {@link TimeTableDataElementsType }
     * 
     */
    public TimeTableDataElementsType createTimeTableDataElementsType() {
        return new TimeTableDataElementsType();
    }

    /**
     * Create an instance of {@link TimeTableListDataType }
     * 
     */
    public TimeTableListDataType createTimeTableListDataType() {
        return new TimeTableListDataType();
    }

    /**
     * Create an instance of {@link TimeTableListDataSelectorsType }
     * 
     */
    public TimeTableListDataSelectorsType createTimeTableListDataSelectorsType() {
        return new TimeTableListDataSelectorsType();
    }

    /**
     * Create an instance of {@link TimeTableConstraintsDataType }
     * 
     */
    public TimeTableConstraintsDataType createTimeTableConstraintsDataType() {
        return new TimeTableConstraintsDataType();
    }

    /**
     * Create an instance of {@link TimeTableConstraintsDataElementsType }
     * 
     */
    public TimeTableConstraintsDataElementsType createTimeTableConstraintsDataElementsType() {
        return new TimeTableConstraintsDataElementsType();
    }

    /**
     * Create an instance of {@link TimeTableConstraintsListDataType }
     * 
     */
    public TimeTableConstraintsListDataType createTimeTableConstraintsListDataType() {
        return new TimeTableConstraintsListDataType();
    }

    /**
     * Create an instance of {@link TimeTableConstraintsListDataSelectorsType }
     * 
     */
    public TimeTableConstraintsListDataSelectorsType createTimeTableConstraintsListDataSelectorsType() {
        return new TimeTableConstraintsListDataSelectorsType();
    }

    /**
     * Create an instance of {@link TimeTableDescriptionDataType }
     * 
     */
    public TimeTableDescriptionDataType createTimeTableDescriptionDataType() {
        return new TimeTableDescriptionDataType();
    }

    /**
     * Create an instance of {@link TimeTableDescriptionDataElementsType }
     * 
     */
    public TimeTableDescriptionDataElementsType createTimeTableDescriptionDataElementsType() {
        return new TimeTableDescriptionDataElementsType();
    }

    /**
     * Create an instance of {@link TimeTableDescriptionListDataType }
     * 
     */
    public TimeTableDescriptionListDataType createTimeTableDescriptionListDataType() {
        return new TimeTableDescriptionListDataType();
    }

    /**
     * Create an instance of {@link TimeTableDescriptionListDataSelectorsType }
     * 
     */
    public TimeTableDescriptionListDataSelectorsType createTimeTableDescriptionListDataSelectorsType() {
        return new TimeTableDescriptionListDataSelectorsType();
    }

    /**
     * Create an instance of {@link SetpointDataType }
     * 
     */
    public SetpointDataType createSetpointDataType() {
        return new SetpointDataType();
    }

    /**
     * Create an instance of {@link SetpointDataElementsType }
     * 
     */
    public SetpointDataElementsType createSetpointDataElementsType() {
        return new SetpointDataElementsType();
    }

    /**
     * Create an instance of {@link SetpointListDataType }
     * 
     */
    public SetpointListDataType createSetpointListDataType() {
        return new SetpointListDataType();
    }

    /**
     * Create an instance of {@link SetpointListDataSelectorsType }
     * 
     */
    public SetpointListDataSelectorsType createSetpointListDataSelectorsType() {
        return new SetpointListDataSelectorsType();
    }

    /**
     * Create an instance of {@link SetpointConstraintsDataType }
     * 
     */
    public SetpointConstraintsDataType createSetpointConstraintsDataType() {
        return new SetpointConstraintsDataType();
    }

    /**
     * Create an instance of {@link SetpointConstraintsDataElementsType }
     * 
     */
    public SetpointConstraintsDataElementsType createSetpointConstraintsDataElementsType() {
        return new SetpointConstraintsDataElementsType();
    }

    /**
     * Create an instance of {@link SetpointConstraintsListDataType }
     * 
     */
    public SetpointConstraintsListDataType createSetpointConstraintsListDataType() {
        return new SetpointConstraintsListDataType();
    }

    /**
     * Create an instance of {@link SetpointConstraintsListDataSelectorsType }
     * 
     */
    public SetpointConstraintsListDataSelectorsType createSetpointConstraintsListDataSelectorsType() {
        return new SetpointConstraintsListDataSelectorsType();
    }

    /**
     * Create an instance of {@link SetpointDescriptionDataType }
     * 
     */
    public SetpointDescriptionDataType createSetpointDescriptionDataType() {
        return new SetpointDescriptionDataType();
    }

    /**
     * Create an instance of {@link SetpointDescriptionDataElementsType }
     * 
     */
    public SetpointDescriptionDataElementsType createSetpointDescriptionDataElementsType() {
        return new SetpointDescriptionDataElementsType();
    }

    /**
     * Create an instance of {@link SetpointDescriptionListDataType }
     * 
     */
    public SetpointDescriptionListDataType createSetpointDescriptionListDataType() {
        return new SetpointDescriptionListDataType();
    }

    /**
     * Create an instance of {@link SetpointDescriptionListDataSelectorsType }
     * 
     */
    public SetpointDescriptionListDataSelectorsType createSetpointDescriptionListDataSelectorsType() {
        return new SetpointDescriptionListDataSelectorsType();
    }

    /**
     * Create an instance of {@link HvacSystemFunctionDataType }
     * 
     */
    public HvacSystemFunctionDataType createHvacSystemFunctionDataType() {
        return new HvacSystemFunctionDataType();
    }

    /**
     * Create an instance of {@link HvacSystemFunctionDataElementsType }
     * 
     */
    public HvacSystemFunctionDataElementsType createHvacSystemFunctionDataElementsType() {
        return new HvacSystemFunctionDataElementsType();
    }

    /**
     * Create an instance of {@link HvacSystemFunctionListDataType }
     * 
     */
    public HvacSystemFunctionListDataType createHvacSystemFunctionListDataType() {
        return new HvacSystemFunctionListDataType();
    }

    /**
     * Create an instance of {@link HvacSystemFunctionListDataSelectorsType }
     * 
     */
    public HvacSystemFunctionListDataSelectorsType createHvacSystemFunctionListDataSelectorsType() {
        return new HvacSystemFunctionListDataSelectorsType();
    }

    /**
     * Create an instance of {@link HvacSystemFunctionOperationModeRelationDataType }
     * 
     */
    public HvacSystemFunctionOperationModeRelationDataType createHvacSystemFunctionOperationModeRelationDataType() {
        return new HvacSystemFunctionOperationModeRelationDataType();
    }

    /**
     * Create an instance of {@link HvacSystemFunctionOperationModeRelationDataElementsType }
     * 
     */
    public HvacSystemFunctionOperationModeRelationDataElementsType createHvacSystemFunctionOperationModeRelationDataElementsType() {
        return new HvacSystemFunctionOperationModeRelationDataElementsType();
    }

    /**
     * Create an instance of {@link HvacSystemFunctionOperationModeRelationListDataType }
     * 
     */
    public HvacSystemFunctionOperationModeRelationListDataType createHvacSystemFunctionOperationModeRelationListDataType() {
        return new HvacSystemFunctionOperationModeRelationListDataType();
    }

    /**
     * Create an instance of {@link HvacSystemFunctionOperationModeRelationListDataSelectorsType }
     * 
     */
    public HvacSystemFunctionOperationModeRelationListDataSelectorsType createHvacSystemFunctionOperationModeRelationListDataSelectorsType() {
        return new HvacSystemFunctionOperationModeRelationListDataSelectorsType();
    }

    /**
     * Create an instance of {@link HvacSystemFunctionSetpointRelationDataType }
     * 
     */
    public HvacSystemFunctionSetpointRelationDataType createHvacSystemFunctionSetpointRelationDataType() {
        return new HvacSystemFunctionSetpointRelationDataType();
    }

    /**
     * Create an instance of {@link HvacSystemFunctionSetpointRelationDataElementsType }
     * 
     */
    public HvacSystemFunctionSetpointRelationDataElementsType createHvacSystemFunctionSetpointRelationDataElementsType() {
        return new HvacSystemFunctionSetpointRelationDataElementsType();
    }

    /**
     * Create an instance of {@link HvacSystemFunctionSetpointRelationListDataType }
     * 
     */
    public HvacSystemFunctionSetpointRelationListDataType createHvacSystemFunctionSetpointRelationListDataType() {
        return new HvacSystemFunctionSetpointRelationListDataType();
    }

    /**
     * Create an instance of {@link HvacSystemFunctionSetpointRelationListDataSelectorsType }
     * 
     */
    public HvacSystemFunctionSetpointRelationListDataSelectorsType createHvacSystemFunctionSetpointRelationListDataSelectorsType() {
        return new HvacSystemFunctionSetpointRelationListDataSelectorsType();
    }

    /**
     * Create an instance of {@link HvacSystemFunctionPowerSequenceRelationDataType }
     * 
     */
    public HvacSystemFunctionPowerSequenceRelationDataType createHvacSystemFunctionPowerSequenceRelationDataType() {
        return new HvacSystemFunctionPowerSequenceRelationDataType();
    }

    /**
     * Create an instance of {@link HvacSystemFunctionPowerSequenceRelationDataElementsType }
     * 
     */
    public HvacSystemFunctionPowerSequenceRelationDataElementsType createHvacSystemFunctionPowerSequenceRelationDataElementsType() {
        return new HvacSystemFunctionPowerSequenceRelationDataElementsType();
    }

    /**
     * Create an instance of {@link HvacSystemFunctionPowerSequenceRelationListDataType }
     * 
     */
    public HvacSystemFunctionPowerSequenceRelationListDataType createHvacSystemFunctionPowerSequenceRelationListDataType() {
        return new HvacSystemFunctionPowerSequenceRelationListDataType();
    }

    /**
     * Create an instance of {@link HvacSystemFunctionPowerSequenceRelationListDataSelectorsType }
     * 
     */
    public HvacSystemFunctionPowerSequenceRelationListDataSelectorsType createHvacSystemFunctionPowerSequenceRelationListDataSelectorsType() {
        return new HvacSystemFunctionPowerSequenceRelationListDataSelectorsType();
    }

    /**
     * Create an instance of {@link HvacSystemFunctionDescriptionDataType }
     * 
     */
    public HvacSystemFunctionDescriptionDataType createHvacSystemFunctionDescriptionDataType() {
        return new HvacSystemFunctionDescriptionDataType();
    }

    /**
     * Create an instance of {@link HvacSystemFunctionDescriptionDataElementsType }
     * 
     */
    public HvacSystemFunctionDescriptionDataElementsType createHvacSystemFunctionDescriptionDataElementsType() {
        return new HvacSystemFunctionDescriptionDataElementsType();
    }

    /**
     * Create an instance of {@link HvacSystemFunctionDescriptionListDataType }
     * 
     */
    public HvacSystemFunctionDescriptionListDataType createHvacSystemFunctionDescriptionListDataType() {
        return new HvacSystemFunctionDescriptionListDataType();
    }

    /**
     * Create an instance of {@link HvacSystemFunctionDescriptionListDataSelectorsType }
     * 
     */
    public HvacSystemFunctionDescriptionListDataSelectorsType createHvacSystemFunctionDescriptionListDataSelectorsType() {
        return new HvacSystemFunctionDescriptionListDataSelectorsType();
    }

    /**
     * Create an instance of {@link HvacOperationModeDescriptionDataType }
     * 
     */
    public HvacOperationModeDescriptionDataType createHvacOperationModeDescriptionDataType() {
        return new HvacOperationModeDescriptionDataType();
    }

    /**
     * Create an instance of {@link HvacOperationModeDescriptionDataElementsType }
     * 
     */
    public HvacOperationModeDescriptionDataElementsType createHvacOperationModeDescriptionDataElementsType() {
        return new HvacOperationModeDescriptionDataElementsType();
    }

    /**
     * Create an instance of {@link HvacOperationModeDescriptionListDataType }
     * 
     */
    public HvacOperationModeDescriptionListDataType createHvacOperationModeDescriptionListDataType() {
        return new HvacOperationModeDescriptionListDataType();
    }

    /**
     * Create an instance of {@link HvacOperationModeDescriptionListDataSelectorsType }
     * 
     */
    public HvacOperationModeDescriptionListDataSelectorsType createHvacOperationModeDescriptionListDataSelectorsType() {
        return new HvacOperationModeDescriptionListDataSelectorsType();
    }

    /**
     * Create an instance of {@link HvacOverrunDataType }
     * 
     */
    public HvacOverrunDataType createHvacOverrunDataType() {
        return new HvacOverrunDataType();
    }

    /**
     * Create an instance of {@link HvacOverrunDataElementsType }
     * 
     */
    public HvacOverrunDataElementsType createHvacOverrunDataElementsType() {
        return new HvacOverrunDataElementsType();
    }

    /**
     * Create an instance of {@link HvacOverrunListDataType }
     * 
     */
    public HvacOverrunListDataType createHvacOverrunListDataType() {
        return new HvacOverrunListDataType();
    }

    /**
     * Create an instance of {@link HvacOverrunListDataSelectorsType }
     * 
     */
    public HvacOverrunListDataSelectorsType createHvacOverrunListDataSelectorsType() {
        return new HvacOverrunListDataSelectorsType();
    }

    /**
     * Create an instance of {@link HvacOverrunDescriptionDataType }
     * 
     */
    public HvacOverrunDescriptionDataType createHvacOverrunDescriptionDataType() {
        return new HvacOverrunDescriptionDataType();
    }

    /**
     * Create an instance of {@link HvacOverrunDescriptionDataElementsType }
     * 
     */
    public HvacOverrunDescriptionDataElementsType createHvacOverrunDescriptionDataElementsType() {
        return new HvacOverrunDescriptionDataElementsType();
    }

    /**
     * Create an instance of {@link HvacOverrunDescriptionListDataType }
     * 
     */
    public HvacOverrunDescriptionListDataType createHvacOverrunDescriptionListDataType() {
        return new HvacOverrunDescriptionListDataType();
    }

    /**
     * Create an instance of {@link HvacOverrunDescriptionListDataSelectorsType }
     * 
     */
    public HvacOverrunDescriptionListDataSelectorsType createHvacOverrunDescriptionListDataSelectorsType() {
        return new HvacOverrunDescriptionListDataSelectorsType();
    }

    /**
     * Create an instance of {@link LoadControlNodeDataType }
     * 
     */
    public LoadControlNodeDataType createLoadControlNodeDataType() {
        return new LoadControlNodeDataType();
    }

    /**
     * Create an instance of {@link LoadControlNodeDataElementsType }
     * 
     */
    public LoadControlNodeDataElementsType createLoadControlNodeDataElementsType() {
        return new LoadControlNodeDataElementsType();
    }

    /**
     * Create an instance of {@link LoadControlEventDataType }
     * 
     */
    public LoadControlEventDataType createLoadControlEventDataType() {
        return new LoadControlEventDataType();
    }

    /**
     * Create an instance of {@link LoadControlEventDataElementsType }
     * 
     */
    public LoadControlEventDataElementsType createLoadControlEventDataElementsType() {
        return new LoadControlEventDataElementsType();
    }

    /**
     * Create an instance of {@link LoadControlEventListDataType }
     * 
     */
    public LoadControlEventListDataType createLoadControlEventListDataType() {
        return new LoadControlEventListDataType();
    }

    /**
     * Create an instance of {@link LoadControlEventListDataSelectorsType }
     * 
     */
    public LoadControlEventListDataSelectorsType createLoadControlEventListDataSelectorsType() {
        return new LoadControlEventListDataSelectorsType();
    }

    /**
     * Create an instance of {@link LoadControlStateDataType }
     * 
     */
    public LoadControlStateDataType createLoadControlStateDataType() {
        return new LoadControlStateDataType();
    }

    /**
     * Create an instance of {@link LoadControlStateDataElementsType }
     * 
     */
    public LoadControlStateDataElementsType createLoadControlStateDataElementsType() {
        return new LoadControlStateDataElementsType();
    }

    /**
     * Create an instance of {@link LoadControlStateListDataType }
     * 
     */
    public LoadControlStateListDataType createLoadControlStateListDataType() {
        return new LoadControlStateListDataType();
    }

    /**
     * Create an instance of {@link LoadControlStateListDataSelectorsType }
     * 
     */
    public LoadControlStateListDataSelectorsType createLoadControlStateListDataSelectorsType() {
        return new LoadControlStateListDataSelectorsType();
    }

    /**
     * Create an instance of {@link LoadControlLimitDataType }
     * 
     */
    public LoadControlLimitDataType createLoadControlLimitDataType() {
        return new LoadControlLimitDataType();
    }

    /**
     * Create an instance of {@link LoadControlLimitDataElementsType }
     * 
     */
    public LoadControlLimitDataElementsType createLoadControlLimitDataElementsType() {
        return new LoadControlLimitDataElementsType();
    }

    /**
     * Create an instance of {@link LoadControlLimitListDataType }
     * 
     */
    public LoadControlLimitListDataType createLoadControlLimitListDataType() {
        return new LoadControlLimitListDataType();
    }

    /**
     * Create an instance of {@link LoadControlLimitListDataSelectorsType }
     * 
     */
    public LoadControlLimitListDataSelectorsType createLoadControlLimitListDataSelectorsType() {
        return new LoadControlLimitListDataSelectorsType();
    }

    /**
     * Create an instance of {@link LoadControlLimitConstraintsDataType }
     * 
     */
    public LoadControlLimitConstraintsDataType createLoadControlLimitConstraintsDataType() {
        return new LoadControlLimitConstraintsDataType();
    }

    /**
     * Create an instance of {@link LoadControlLimitConstraintsDataElementsType }
     * 
     */
    public LoadControlLimitConstraintsDataElementsType createLoadControlLimitConstraintsDataElementsType() {
        return new LoadControlLimitConstraintsDataElementsType();
    }

    /**
     * Create an instance of {@link LoadControlLimitConstraintsListDataType }
     * 
     */
    public LoadControlLimitConstraintsListDataType createLoadControlLimitConstraintsListDataType() {
        return new LoadControlLimitConstraintsListDataType();
    }

    /**
     * Create an instance of {@link LoadControlLimitConstraintsListDataSelectorsType }
     * 
     */
    public LoadControlLimitConstraintsListDataSelectorsType createLoadControlLimitConstraintsListDataSelectorsType() {
        return new LoadControlLimitConstraintsListDataSelectorsType();
    }

    /**
     * Create an instance of {@link LoadControlLimitDescriptionDataType }
     * 
     */
    public LoadControlLimitDescriptionDataType createLoadControlLimitDescriptionDataType() {
        return new LoadControlLimitDescriptionDataType();
    }

    /**
     * Create an instance of {@link LoadControlLimitDescriptionDataElementsType }
     * 
     */
    public LoadControlLimitDescriptionDataElementsType createLoadControlLimitDescriptionDataElementsType() {
        return new LoadControlLimitDescriptionDataElementsType();
    }

    /**
     * Create an instance of {@link LoadControlLimitDescriptionListDataType }
     * 
     */
    public LoadControlLimitDescriptionListDataType createLoadControlLimitDescriptionListDataType() {
        return new LoadControlLimitDescriptionListDataType();
    }

    /**
     * Create an instance of {@link LoadControlLimitDescriptionListDataSelectorsType }
     * 
     */
    public LoadControlLimitDescriptionListDataSelectorsType createLoadControlLimitDescriptionListDataSelectorsType() {
        return new LoadControlLimitDescriptionListDataSelectorsType();
    }

    /**
     * Create an instance of {@link TaskManagementJobDataType }
     * 
     */
    public TaskManagementJobDataType createTaskManagementJobDataType() {
        return new TaskManagementJobDataType();
    }

    /**
     * Create an instance of {@link TaskManagementJobDataElementsType }
     * 
     */
    public TaskManagementJobDataElementsType createTaskManagementJobDataElementsType() {
        return new TaskManagementJobDataElementsType();
    }

    /**
     * Create an instance of {@link TaskManagementJobListDataType }
     * 
     */
    public TaskManagementJobListDataType createTaskManagementJobListDataType() {
        return new TaskManagementJobListDataType();
    }

    /**
     * Create an instance of {@link TaskManagementJobListDataSelectorsType }
     * 
     */
    public TaskManagementJobListDataSelectorsType createTaskManagementJobListDataSelectorsType() {
        return new TaskManagementJobListDataSelectorsType();
    }

    /**
     * Create an instance of {@link TaskManagementJobRelationDataType }
     * 
     */
    public TaskManagementJobRelationDataType createTaskManagementJobRelationDataType() {
        return new TaskManagementJobRelationDataType();
    }

    /**
     * Create an instance of {@link TaskManagementJobRelationDataElementsType }
     * 
     */
    public TaskManagementJobRelationDataElementsType createTaskManagementJobRelationDataElementsType() {
        return new TaskManagementJobRelationDataElementsType();
    }

    /**
     * Create an instance of {@link TaskManagementJobRelationListDataType }
     * 
     */
    public TaskManagementJobRelationListDataType createTaskManagementJobRelationListDataType() {
        return new TaskManagementJobRelationListDataType();
    }

    /**
     * Create an instance of {@link TaskManagementJobRelationListDataSelectorsType }
     * 
     */
    public TaskManagementJobRelationListDataSelectorsType createTaskManagementJobRelationListDataSelectorsType() {
        return new TaskManagementJobRelationListDataSelectorsType();
    }

    /**
     * Create an instance of {@link TaskManagementJobDescriptionDataType }
     * 
     */
    public TaskManagementJobDescriptionDataType createTaskManagementJobDescriptionDataType() {
        return new TaskManagementJobDescriptionDataType();
    }

    /**
     * Create an instance of {@link TaskManagementJobDescriptionDataElementsType }
     * 
     */
    public TaskManagementJobDescriptionDataElementsType createTaskManagementJobDescriptionDataElementsType() {
        return new TaskManagementJobDescriptionDataElementsType();
    }

    /**
     * Create an instance of {@link TaskManagementJobDescriptionListDataType }
     * 
     */
    public TaskManagementJobDescriptionListDataType createTaskManagementJobDescriptionListDataType() {
        return new TaskManagementJobDescriptionListDataType();
    }

    /**
     * Create an instance of {@link TaskManagementJobDescriptionListDataSelectorsType }
     * 
     */
    public TaskManagementJobDescriptionListDataSelectorsType createTaskManagementJobDescriptionListDataSelectorsType() {
        return new TaskManagementJobDescriptionListDataSelectorsType();
    }

    /**
     * Create an instance of {@link TaskManagementOverviewDataType }
     * 
     */
    public TaskManagementOverviewDataType createTaskManagementOverviewDataType() {
        return new TaskManagementOverviewDataType();
    }

    /**
     * Create an instance of {@link TaskManagementOverviewDataElementsType }
     * 
     */
    public TaskManagementOverviewDataElementsType createTaskManagementOverviewDataElementsType() {
        return new TaskManagementOverviewDataElementsType();
    }

    /**
     * Create an instance of {@link AlarmDataType }
     * 
     */
    public AlarmDataType createAlarmDataType() {
        return new AlarmDataType();
    }

    /**
     * Create an instance of {@link AlarmDataElementsType }
     * 
     */
    public AlarmDataElementsType createAlarmDataElementsType() {
        return new AlarmDataElementsType();
    }

    /**
     * Create an instance of {@link AlarmListDataType }
     * 
     */
    public AlarmListDataType createAlarmListDataType() {
        return new AlarmListDataType();
    }

    /**
     * Create an instance of {@link AlarmListDataSelectorsType }
     * 
     */
    public AlarmListDataSelectorsType createAlarmListDataSelectorsType() {
        return new AlarmListDataSelectorsType();
    }

    /**
     * Create an instance of {@link SupplyConditionDataType }
     * 
     */
    public SupplyConditionDataType createSupplyConditionDataType() {
        return new SupplyConditionDataType();
    }

    /**
     * Create an instance of {@link SupplyConditionDataElementsType }
     * 
     */
    public SupplyConditionDataElementsType createSupplyConditionDataElementsType() {
        return new SupplyConditionDataElementsType();
    }

    /**
     * Create an instance of {@link SupplyConditionListDataType }
     * 
     */
    public SupplyConditionListDataType createSupplyConditionListDataType() {
        return new SupplyConditionListDataType();
    }

    /**
     * Create an instance of {@link SupplyConditionListDataSelectorsType }
     * 
     */
    public SupplyConditionListDataSelectorsType createSupplyConditionListDataSelectorsType() {
        return new SupplyConditionListDataSelectorsType();
    }

    /**
     * Create an instance of {@link SupplyConditionDescriptionDataType }
     * 
     */
    public SupplyConditionDescriptionDataType createSupplyConditionDescriptionDataType() {
        return new SupplyConditionDescriptionDataType();
    }

    /**
     * Create an instance of {@link SupplyConditionDescriptionDataElementsType }
     * 
     */
    public SupplyConditionDescriptionDataElementsType createSupplyConditionDescriptionDataElementsType() {
        return new SupplyConditionDescriptionDataElementsType();
    }

    /**
     * Create an instance of {@link SupplyConditionDescriptionListDataType }
     * 
     */
    public SupplyConditionDescriptionListDataType createSupplyConditionDescriptionListDataType() {
        return new SupplyConditionDescriptionListDataType();
    }

    /**
     * Create an instance of {@link SupplyConditionDescriptionListDataSelectorsType }
     * 
     */
    public SupplyConditionDescriptionListDataSelectorsType createSupplyConditionDescriptionListDataSelectorsType() {
        return new SupplyConditionDescriptionListDataSelectorsType();
    }

    /**
     * Create an instance of {@link SupplyConditionThresholdRelationDataType }
     * 
     */
    public SupplyConditionThresholdRelationDataType createSupplyConditionThresholdRelationDataType() {
        return new SupplyConditionThresholdRelationDataType();
    }

    /**
     * Create an instance of {@link SupplyConditionThresholdRelationDataElementsType }
     * 
     */
    public SupplyConditionThresholdRelationDataElementsType createSupplyConditionThresholdRelationDataElementsType() {
        return new SupplyConditionThresholdRelationDataElementsType();
    }

    /**
     * Create an instance of {@link SupplyConditionThresholdRelationListDataType }
     * 
     */
    public SupplyConditionThresholdRelationListDataType createSupplyConditionThresholdRelationListDataType() {
        return new SupplyConditionThresholdRelationListDataType();
    }

    /**
     * Create an instance of {@link SupplyConditionThresholdRelationListDataSelectorsType }
     * 
     */
    public SupplyConditionThresholdRelationListDataSelectorsType createSupplyConditionThresholdRelationListDataSelectorsType() {
        return new SupplyConditionThresholdRelationListDataSelectorsType();
    }

    /**
     * Create an instance of {@link ResultDataType }
     * 
     */
    public ResultDataType createResultDataType() {
        return new ResultDataType();
    }

    /**
     * Create an instance of {@link BindingManagementEntryDataType }
     * 
     */
    public BindingManagementEntryDataType createBindingManagementEntryDataType() {
        return new BindingManagementEntryDataType();
    }

    /**
     * Create an instance of {@link BindingManagementEntryDataElementsType }
     * 
     */
    public BindingManagementEntryDataElementsType createBindingManagementEntryDataElementsType() {
        return new BindingManagementEntryDataElementsType();
    }

    /**
     * Create an instance of {@link BindingManagementEntryListDataType }
     * 
     */
    public BindingManagementEntryListDataType createBindingManagementEntryListDataType() {
        return new BindingManagementEntryListDataType();
    }

    /**
     * Create an instance of {@link BindingManagementEntryListDataSelectorsType }
     * 
     */
    public BindingManagementEntryListDataSelectorsType createBindingManagementEntryListDataSelectorsType() {
        return new BindingManagementEntryListDataSelectorsType();
    }

    /**
     * Create an instance of {@link BindingManagementRequestCallType }
     * 
     */
    public BindingManagementRequestCallType createBindingManagementRequestCallType() {
        return new BindingManagementRequestCallType();
    }

    /**
     * Create an instance of {@link BindingManagementRequestCallElementsType }
     * 
     */
    public BindingManagementRequestCallElementsType createBindingManagementRequestCallElementsType() {
        return new BindingManagementRequestCallElementsType();
    }

    /**
     * Create an instance of {@link BindingManagementDeleteCallType }
     * 
     */
    public BindingManagementDeleteCallType createBindingManagementDeleteCallType() {
        return new BindingManagementDeleteCallType();
    }

    /**
     * Create an instance of {@link BindingManagementDeleteCallElementsType }
     * 
     */
    public BindingManagementDeleteCallElementsType createBindingManagementDeleteCallElementsType() {
        return new BindingManagementDeleteCallElementsType();
    }

    /**
     * Create an instance of {@link TariffOverallConstraintsDataType }
     * 
     */
    public TariffOverallConstraintsDataType createTariffOverallConstraintsDataType() {
        return new TariffOverallConstraintsDataType();
    }

    /**
     * Create an instance of {@link TariffOverallConstraintsDataElementsType }
     * 
     */
    public TariffOverallConstraintsDataElementsType createTariffOverallConstraintsDataElementsType() {
        return new TariffOverallConstraintsDataElementsType();
    }

    /**
     * Create an instance of {@link TariffDataType }
     * 
     */
    public TariffDataType createTariffDataType() {
        return new TariffDataType();
    }

    /**
     * Create an instance of {@link TariffDataElementsType }
     * 
     */
    public TariffDataElementsType createTariffDataElementsType() {
        return new TariffDataElementsType();
    }

    /**
     * Create an instance of {@link TariffListDataType }
     * 
     */
    public TariffListDataType createTariffListDataType() {
        return new TariffListDataType();
    }

    /**
     * Create an instance of {@link TariffListDataSelectorsType }
     * 
     */
    public TariffListDataSelectorsType createTariffListDataSelectorsType() {
        return new TariffListDataSelectorsType();
    }

    /**
     * Create an instance of {@link TariffTierRelationDataType }
     * 
     */
    public TariffTierRelationDataType createTariffTierRelationDataType() {
        return new TariffTierRelationDataType();
    }

    /**
     * Create an instance of {@link TariffTierRelationDataElementsType }
     * 
     */
    public TariffTierRelationDataElementsType createTariffTierRelationDataElementsType() {
        return new TariffTierRelationDataElementsType();
    }

    /**
     * Create an instance of {@link TariffTierRelationListDataType }
     * 
     */
    public TariffTierRelationListDataType createTariffTierRelationListDataType() {
        return new TariffTierRelationListDataType();
    }

    /**
     * Create an instance of {@link TariffTierRelationListDataSelectorsType }
     * 
     */
    public TariffTierRelationListDataSelectorsType createTariffTierRelationListDataSelectorsType() {
        return new TariffTierRelationListDataSelectorsType();
    }

    /**
     * Create an instance of {@link TariffBoundaryRelationDataType }
     * 
     */
    public TariffBoundaryRelationDataType createTariffBoundaryRelationDataType() {
        return new TariffBoundaryRelationDataType();
    }

    /**
     * Create an instance of {@link TariffBoundaryRelationDataElementsType }
     * 
     */
    public TariffBoundaryRelationDataElementsType createTariffBoundaryRelationDataElementsType() {
        return new TariffBoundaryRelationDataElementsType();
    }

    /**
     * Create an instance of {@link TariffBoundaryRelationListDataType }
     * 
     */
    public TariffBoundaryRelationListDataType createTariffBoundaryRelationListDataType() {
        return new TariffBoundaryRelationListDataType();
    }

    /**
     * Create an instance of {@link TariffBoundaryRelationListDataSelectorsType }
     * 
     */
    public TariffBoundaryRelationListDataSelectorsType createTariffBoundaryRelationListDataSelectorsType() {
        return new TariffBoundaryRelationListDataSelectorsType();
    }

    /**
     * Create an instance of {@link TariffDescriptionDataType }
     * 
     */
    public TariffDescriptionDataType createTariffDescriptionDataType() {
        return new TariffDescriptionDataType();
    }

    /**
     * Create an instance of {@link TariffDescriptionDataElementsType }
     * 
     */
    public TariffDescriptionDataElementsType createTariffDescriptionDataElementsType() {
        return new TariffDescriptionDataElementsType();
    }

    /**
     * Create an instance of {@link TariffDescriptionListDataType }
     * 
     */
    public TariffDescriptionListDataType createTariffDescriptionListDataType() {
        return new TariffDescriptionListDataType();
    }

    /**
     * Create an instance of {@link TariffDescriptionListDataSelectorsType }
     * 
     */
    public TariffDescriptionListDataSelectorsType createTariffDescriptionListDataSelectorsType() {
        return new TariffDescriptionListDataSelectorsType();
    }

    /**
     * Create an instance of {@link TierBoundaryDataType }
     * 
     */
    public TierBoundaryDataType createTierBoundaryDataType() {
        return new TierBoundaryDataType();
    }

    /**
     * Create an instance of {@link TierBoundaryDataElementsType }
     * 
     */
    public TierBoundaryDataElementsType createTierBoundaryDataElementsType() {
        return new TierBoundaryDataElementsType();
    }

    /**
     * Create an instance of {@link TierBoundaryListDataType }
     * 
     */
    public TierBoundaryListDataType createTierBoundaryListDataType() {
        return new TierBoundaryListDataType();
    }

    /**
     * Create an instance of {@link TierBoundaryListDataSelectorsType }
     * 
     */
    public TierBoundaryListDataSelectorsType createTierBoundaryListDataSelectorsType() {
        return new TierBoundaryListDataSelectorsType();
    }

    /**
     * Create an instance of {@link TierBoundaryDescriptionDataType }
     * 
     */
    public TierBoundaryDescriptionDataType createTierBoundaryDescriptionDataType() {
        return new TierBoundaryDescriptionDataType();
    }

    /**
     * Create an instance of {@link TierBoundaryDescriptionDataElementsType }
     * 
     */
    public TierBoundaryDescriptionDataElementsType createTierBoundaryDescriptionDataElementsType() {
        return new TierBoundaryDescriptionDataElementsType();
    }

    /**
     * Create an instance of {@link TierBoundaryDescriptionListDataType }
     * 
     */
    public TierBoundaryDescriptionListDataType createTierBoundaryDescriptionListDataType() {
        return new TierBoundaryDescriptionListDataType();
    }

    /**
     * Create an instance of {@link TierBoundaryDescriptionListDataSelectorsType }
     * 
     */
    public TierBoundaryDescriptionListDataSelectorsType createTierBoundaryDescriptionListDataSelectorsType() {
        return new TierBoundaryDescriptionListDataSelectorsType();
    }

    /**
     * Create an instance of {@link CommodityDataType }
     * 
     */
    public CommodityDataType createCommodityDataType() {
        return new CommodityDataType();
    }

    /**
     * Create an instance of {@link CommodityDataElementsType }
     * 
     */
    public CommodityDataElementsType createCommodityDataElementsType() {
        return new CommodityDataElementsType();
    }

    /**
     * Create an instance of {@link CommodityListDataType }
     * 
     */
    public CommodityListDataType createCommodityListDataType() {
        return new CommodityListDataType();
    }

    /**
     * Create an instance of {@link CommodityListDataSelectorsType }
     * 
     */
    public CommodityListDataSelectorsType createCommodityListDataSelectorsType() {
        return new CommodityListDataSelectorsType();
    }

    /**
     * Create an instance of {@link TierDataType }
     * 
     */
    public TierDataType createTierDataType() {
        return new TierDataType();
    }

    /**
     * Create an instance of {@link TierDataElementsType }
     * 
     */
    public TierDataElementsType createTierDataElementsType() {
        return new TierDataElementsType();
    }

    /**
     * Create an instance of {@link TierListDataType }
     * 
     */
    public TierListDataType createTierListDataType() {
        return new TierListDataType();
    }

    /**
     * Create an instance of {@link TierListDataSelectorsType }
     * 
     */
    public TierListDataSelectorsType createTierListDataSelectorsType() {
        return new TierListDataSelectorsType();
    }

    /**
     * Create an instance of {@link TierIncentiveRelationDataType }
     * 
     */
    public TierIncentiveRelationDataType createTierIncentiveRelationDataType() {
        return new TierIncentiveRelationDataType();
    }

    /**
     * Create an instance of {@link TierIncentiveRelationDataElementsType }
     * 
     */
    public TierIncentiveRelationDataElementsType createTierIncentiveRelationDataElementsType() {
        return new TierIncentiveRelationDataElementsType();
    }

    /**
     * Create an instance of {@link TierIncentiveRelationListDataType }
     * 
     */
    public TierIncentiveRelationListDataType createTierIncentiveRelationListDataType() {
        return new TierIncentiveRelationListDataType();
    }

    /**
     * Create an instance of {@link TierIncentiveRelationListDataSelectorsType }
     * 
     */
    public TierIncentiveRelationListDataSelectorsType createTierIncentiveRelationListDataSelectorsType() {
        return new TierIncentiveRelationListDataSelectorsType();
    }

    /**
     * Create an instance of {@link TierDescriptionDataType }
     * 
     */
    public TierDescriptionDataType createTierDescriptionDataType() {
        return new TierDescriptionDataType();
    }

    /**
     * Create an instance of {@link TierDescriptionDataElementsType }
     * 
     */
    public TierDescriptionDataElementsType createTierDescriptionDataElementsType() {
        return new TierDescriptionDataElementsType();
    }

    /**
     * Create an instance of {@link TierDescriptionListDataType }
     * 
     */
    public TierDescriptionListDataType createTierDescriptionListDataType() {
        return new TierDescriptionListDataType();
    }

    /**
     * Create an instance of {@link TierDescriptionListDataSelectorsType }
     * 
     */
    public TierDescriptionListDataSelectorsType createTierDescriptionListDataSelectorsType() {
        return new TierDescriptionListDataSelectorsType();
    }

    /**
     * Create an instance of {@link IncentiveDataType }
     * 
     */
    public IncentiveDataType createIncentiveDataType() {
        return new IncentiveDataType();
    }

    /**
     * Create an instance of {@link IncentiveDataElementsType }
     * 
     */
    public IncentiveDataElementsType createIncentiveDataElementsType() {
        return new IncentiveDataElementsType();
    }

    /**
     * Create an instance of {@link IncentiveListDataType }
     * 
     */
    public IncentiveListDataType createIncentiveListDataType() {
        return new IncentiveListDataType();
    }

    /**
     * Create an instance of {@link IncentiveListDataSelectorsType }
     * 
     */
    public IncentiveListDataSelectorsType createIncentiveListDataSelectorsType() {
        return new IncentiveListDataSelectorsType();
    }

    /**
     * Create an instance of {@link IncentiveDescriptionDataType }
     * 
     */
    public IncentiveDescriptionDataType createIncentiveDescriptionDataType() {
        return new IncentiveDescriptionDataType();
    }

    /**
     * Create an instance of {@link IncentiveDescriptionDataElementsType }
     * 
     */
    public IncentiveDescriptionDataElementsType createIncentiveDescriptionDataElementsType() {
        return new IncentiveDescriptionDataElementsType();
    }

    /**
     * Create an instance of {@link IncentiveDescriptionListDataType }
     * 
     */
    public IncentiveDescriptionListDataType createIncentiveDescriptionListDataType() {
        return new IncentiveDescriptionListDataType();
    }

    /**
     * Create an instance of {@link IncentiveDescriptionListDataSelectorsType }
     * 
     */
    public IncentiveDescriptionListDataSelectorsType createIncentiveDescriptionListDataSelectorsType() {
        return new IncentiveDescriptionListDataSelectorsType();
    }

    /**
     * Create an instance of {@link ActuatorLevelDataType }
     * 
     */
    public ActuatorLevelDataType createActuatorLevelDataType() {
        return new ActuatorLevelDataType();
    }

    /**
     * Create an instance of {@link ActuatorLevelDataElementsType }
     * 
     */
    public ActuatorLevelDataElementsType createActuatorLevelDataElementsType() {
        return new ActuatorLevelDataElementsType();
    }

    /**
     * Create an instance of {@link ActuatorLevelDescriptionDataType }
     * 
     */
    public ActuatorLevelDescriptionDataType createActuatorLevelDescriptionDataType() {
        return new ActuatorLevelDescriptionDataType();
    }

    /**
     * Create an instance of {@link ActuatorLevelDescriptionDataElementsType }
     * 
     */
    public ActuatorLevelDescriptionDataElementsType createActuatorLevelDescriptionDataElementsType() {
        return new ActuatorLevelDescriptionDataElementsType();
    }

    /**
     * Create an instance of {@link IdentificationDataType }
     * 
     */
    public IdentificationDataType createIdentificationDataType() {
        return new IdentificationDataType();
    }

    /**
     * Create an instance of {@link IdentificationDataElementsType }
     * 
     */
    public IdentificationDataElementsType createIdentificationDataElementsType() {
        return new IdentificationDataElementsType();
    }

    /**
     * Create an instance of {@link IdentificationListDataType }
     * 
     */
    public IdentificationListDataType createIdentificationListDataType() {
        return new IdentificationListDataType();
    }

    /**
     * Create an instance of {@link IdentificationListDataSelectorsType }
     * 
     */
    public IdentificationListDataSelectorsType createIdentificationListDataSelectorsType() {
        return new IdentificationListDataSelectorsType();
    }

    /**
     * Create an instance of {@link SessionIdentificationDataType }
     * 
     */
    public SessionIdentificationDataType createSessionIdentificationDataType() {
        return new SessionIdentificationDataType();
    }

    /**
     * Create an instance of {@link SessionIdentificationDataElementsType }
     * 
     */
    public SessionIdentificationDataElementsType createSessionIdentificationDataElementsType() {
        return new SessionIdentificationDataElementsType();
    }

    /**
     * Create an instance of {@link SessionIdentificationListDataType }
     * 
     */
    public SessionIdentificationListDataType createSessionIdentificationListDataType() {
        return new SessionIdentificationListDataType();
    }

    /**
     * Create an instance of {@link SessionIdentificationListDataSelectorsType }
     * 
     */
    public SessionIdentificationListDataSelectorsType createSessionIdentificationListDataSelectorsType() {
        return new SessionIdentificationListDataSelectorsType();
    }

    /**
     * Create an instance of {@link SessionMeasurementRelationDataType }
     * 
     */
    public SessionMeasurementRelationDataType createSessionMeasurementRelationDataType() {
        return new SessionMeasurementRelationDataType();
    }

    /**
     * Create an instance of {@link SessionMeasurementRelationDataElementsType }
     * 
     */
    public SessionMeasurementRelationDataElementsType createSessionMeasurementRelationDataElementsType() {
        return new SessionMeasurementRelationDataElementsType();
    }

    /**
     * Create an instance of {@link SessionMeasurementRelationListDataType }
     * 
     */
    public SessionMeasurementRelationListDataType createSessionMeasurementRelationListDataType() {
        return new SessionMeasurementRelationListDataType();
    }

    /**
     * Create an instance of {@link SessionMeasurementRelationListDataSelectorsType }
     * 
     */
    public SessionMeasurementRelationListDataSelectorsType createSessionMeasurementRelationListDataSelectorsType() {
        return new SessionMeasurementRelationListDataSelectorsType();
    }

    /**
     * Create an instance of {@link BillListDataType }
     * 
     */
    public BillListDataType createBillListDataType() {
        return new BillListDataType();
    }

    /**
     * Create an instance of {@link BillListDataSelectorsType }
     * 
     */
    public BillListDataSelectorsType createBillListDataSelectorsType() {
        return new BillListDataSelectorsType();
    }

    /**
     * Create an instance of {@link BillConstraintsDataType }
     * 
     */
    public BillConstraintsDataType createBillConstraintsDataType() {
        return new BillConstraintsDataType();
    }

    /**
     * Create an instance of {@link BillConstraintsDataElementsType }
     * 
     */
    public BillConstraintsDataElementsType createBillConstraintsDataElementsType() {
        return new BillConstraintsDataElementsType();
    }

    /**
     * Create an instance of {@link BillConstraintsListDataType }
     * 
     */
    public BillConstraintsListDataType createBillConstraintsListDataType() {
        return new BillConstraintsListDataType();
    }

    /**
     * Create an instance of {@link BillConstraintsListDataSelectorsType }
     * 
     */
    public BillConstraintsListDataSelectorsType createBillConstraintsListDataSelectorsType() {
        return new BillConstraintsListDataSelectorsType();
    }

    /**
     * Create an instance of {@link BillDescriptionDataType }
     * 
     */
    public BillDescriptionDataType createBillDescriptionDataType() {
        return new BillDescriptionDataType();
    }

    /**
     * Create an instance of {@link BillDescriptionDataElementsType }
     * 
     */
    public BillDescriptionDataElementsType createBillDescriptionDataElementsType() {
        return new BillDescriptionDataElementsType();
    }

    /**
     * Create an instance of {@link BillDescriptionListDataType }
     * 
     */
    public BillDescriptionListDataType createBillDescriptionListDataType() {
        return new BillDescriptionListDataType();
    }

    /**
     * Create an instance of {@link BillDescriptionListDataSelectorsType }
     * 
     */
    public BillDescriptionListDataSelectorsType createBillDescriptionListDataSelectorsType() {
        return new BillDescriptionListDataSelectorsType();
    }

    /**
     * Create an instance of {@link DataTunnelingCallType }
     * 
     */
    public DataTunnelingCallType createDataTunnelingCallType() {
        return new DataTunnelingCallType();
    }

    /**
     * Create an instance of {@link DataTunnelingCallElementsType }
     * 
     */
    public DataTunnelingCallElementsType createDataTunnelingCallElementsType() {
        return new DataTunnelingCallElementsType();
    }

    /**
     * Create an instance of {@link DeviceClassificationManufacturerDataType }
     * 
     */
    public DeviceClassificationManufacturerDataType createDeviceClassificationManufacturerDataType() {
        return new DeviceClassificationManufacturerDataType();
    }

    /**
     * Create an instance of {@link DeviceClassificationManufacturerDataElementsType }
     * 
     */
    public DeviceClassificationManufacturerDataElementsType createDeviceClassificationManufacturerDataElementsType() {
        return new DeviceClassificationManufacturerDataElementsType();
    }

    /**
     * Create an instance of {@link DeviceClassificationUserDataType }
     * 
     */
    public DeviceClassificationUserDataType createDeviceClassificationUserDataType() {
        return new DeviceClassificationUserDataType();
    }

    /**
     * Create an instance of {@link DeviceClassificationUserDataElementsType }
     * 
     */
    public DeviceClassificationUserDataElementsType createDeviceClassificationUserDataElementsType() {
        return new DeviceClassificationUserDataElementsType();
    }

    /**
     * Create an instance of {@link DeviceDiagnosisStateDataType }
     * 
     */
    public DeviceDiagnosisStateDataType createDeviceDiagnosisStateDataType() {
        return new DeviceDiagnosisStateDataType();
    }

    /**
     * Create an instance of {@link DeviceDiagnosisStateDataElementsType }
     * 
     */
    public DeviceDiagnosisStateDataElementsType createDeviceDiagnosisStateDataElementsType() {
        return new DeviceDiagnosisStateDataElementsType();
    }

    /**
     * Create an instance of {@link DeviceDiagnosisHeartbeatDataType }
     * 
     */
    public DeviceDiagnosisHeartbeatDataType createDeviceDiagnosisHeartbeatDataType() {
        return new DeviceDiagnosisHeartbeatDataType();
    }

    /**
     * Create an instance of {@link DeviceDiagnosisHeartbeatDataElementsType }
     * 
     */
    public DeviceDiagnosisHeartbeatDataElementsType createDeviceDiagnosisHeartbeatDataElementsType() {
        return new DeviceDiagnosisHeartbeatDataElementsType();
    }

    /**
     * Create an instance of {@link DeviceDiagnosisServiceDataType }
     * 
     */
    public DeviceDiagnosisServiceDataType createDeviceDiagnosisServiceDataType() {
        return new DeviceDiagnosisServiceDataType();
    }

    /**
     * Create an instance of {@link DeviceDiagnosisServiceDataElementsType }
     * 
     */
    public DeviceDiagnosisServiceDataElementsType createDeviceDiagnosisServiceDataElementsType() {
        return new DeviceDiagnosisServiceDataElementsType();
    }

    /**
     * Create an instance of {@link ElectricalConnectionParameterDescriptionDataType }
     * 
     */
    public ElectricalConnectionParameterDescriptionDataType createElectricalConnectionParameterDescriptionDataType() {
        return new ElectricalConnectionParameterDescriptionDataType();
    }

    /**
     * Create an instance of {@link ElectricalConnectionParameterDescriptionDataElementsType }
     * 
     */
    public ElectricalConnectionParameterDescriptionDataElementsType createElectricalConnectionParameterDescriptionDataElementsType() {
        return new ElectricalConnectionParameterDescriptionDataElementsType();
    }

    /**
     * Create an instance of {@link ElectricalConnectionParameterDescriptionListDataType }
     * 
     */
    public ElectricalConnectionParameterDescriptionListDataType createElectricalConnectionParameterDescriptionListDataType() {
        return new ElectricalConnectionParameterDescriptionListDataType();
    }

    /**
     * Create an instance of {@link ElectricalConnectionParameterDescriptionListDataSelectorsType }
     * 
     */
    public ElectricalConnectionParameterDescriptionListDataSelectorsType createElectricalConnectionParameterDescriptionListDataSelectorsType() {
        return new ElectricalConnectionParameterDescriptionListDataSelectorsType();
    }

    /**
     * Create an instance of {@link ElectricalConnectionPermittedValueSetDataType }
     * 
     */
    public ElectricalConnectionPermittedValueSetDataType createElectricalConnectionPermittedValueSetDataType() {
        return new ElectricalConnectionPermittedValueSetDataType();
    }

    /**
     * Create an instance of {@link ElectricalConnectionPermittedValueSetDataElementsType }
     * 
     */
    public ElectricalConnectionPermittedValueSetDataElementsType createElectricalConnectionPermittedValueSetDataElementsType() {
        return new ElectricalConnectionPermittedValueSetDataElementsType();
    }

    /**
     * Create an instance of {@link ElectricalConnectionPermittedValueSetListDataType }
     * 
     */
    public ElectricalConnectionPermittedValueSetListDataType createElectricalConnectionPermittedValueSetListDataType() {
        return new ElectricalConnectionPermittedValueSetListDataType();
    }

    /**
     * Create an instance of {@link ElectricalConnectionPermittedValueSetListDataSelectorsType }
     * 
     */
    public ElectricalConnectionPermittedValueSetListDataSelectorsType createElectricalConnectionPermittedValueSetListDataSelectorsType() {
        return new ElectricalConnectionPermittedValueSetListDataSelectorsType();
    }

    /**
     * Create an instance of {@link ElectricalConnectionCharacteristicDataType }
     * 
     */
    public ElectricalConnectionCharacteristicDataType createElectricalConnectionCharacteristicDataType() {
        return new ElectricalConnectionCharacteristicDataType();
    }

    /**
     * Create an instance of {@link ElectricalConnectionCharacteristicDataElementsType }
     * 
     */
    public ElectricalConnectionCharacteristicDataElementsType createElectricalConnectionCharacteristicDataElementsType() {
        return new ElectricalConnectionCharacteristicDataElementsType();
    }

    /**
     * Create an instance of {@link ElectricalConnectionCharacteristicListDataType }
     * 
     */
    public ElectricalConnectionCharacteristicListDataType createElectricalConnectionCharacteristicListDataType() {
        return new ElectricalConnectionCharacteristicListDataType();
    }

    /**
     * Create an instance of {@link ElectricalConnectionCharacteristicListDataSelectorsType }
     * 
     */
    public ElectricalConnectionCharacteristicListDataSelectorsType createElectricalConnectionCharacteristicListDataSelectorsType() {
        return new ElectricalConnectionCharacteristicListDataSelectorsType();
    }

    /**
     * Create an instance of {@link ElectricalConnectionStateDataType }
     * 
     */
    public ElectricalConnectionStateDataType createElectricalConnectionStateDataType() {
        return new ElectricalConnectionStateDataType();
    }

    /**
     * Create an instance of {@link ElectricalConnectionStateDataElementsType }
     * 
     */
    public ElectricalConnectionStateDataElementsType createElectricalConnectionStateDataElementsType() {
        return new ElectricalConnectionStateDataElementsType();
    }

    /**
     * Create an instance of {@link ElectricalConnectionStateListDataType }
     * 
     */
    public ElectricalConnectionStateListDataType createElectricalConnectionStateListDataType() {
        return new ElectricalConnectionStateListDataType();
    }

    /**
     * Create an instance of {@link ElectricalConnectionStateListDataSelectorsType }
     * 
     */
    public ElectricalConnectionStateListDataSelectorsType createElectricalConnectionStateListDataSelectorsType() {
        return new ElectricalConnectionStateListDataSelectorsType();
    }

    /**
     * Create an instance of {@link ElectricalConnectionDescriptionDataType }
     * 
     */
    public ElectricalConnectionDescriptionDataType createElectricalConnectionDescriptionDataType() {
        return new ElectricalConnectionDescriptionDataType();
    }

    /**
     * Create an instance of {@link ElectricalConnectionDescriptionDataElementsType }
     * 
     */
    public ElectricalConnectionDescriptionDataElementsType createElectricalConnectionDescriptionDataElementsType() {
        return new ElectricalConnectionDescriptionDataElementsType();
    }

    /**
     * Create an instance of {@link ElectricalConnectionDescriptionListDataType }
     * 
     */
    public ElectricalConnectionDescriptionListDataType createElectricalConnectionDescriptionListDataType() {
        return new ElectricalConnectionDescriptionListDataType();
    }

    /**
     * Create an instance of {@link ElectricalConnectionDescriptionListDataSelectorsType }
     * 
     */
    public ElectricalConnectionDescriptionListDataSelectorsType createElectricalConnectionDescriptionListDataSelectorsType() {
        return new ElectricalConnectionDescriptionListDataSelectorsType();
    }

    /**
     * Create an instance of {@link IncentiveTableDataType }
     * 
     */
    public IncentiveTableDataType createIncentiveTableDataType() {
        return new IncentiveTableDataType();
    }

    /**
     * Create an instance of {@link IncentiveTableDataElementsType }
     * 
     */
    public IncentiveTableDataElementsType createIncentiveTableDataElementsType() {
        return new IncentiveTableDataElementsType();
    }

    /**
     * Create an instance of {@link IncentiveTableDescriptionDataType }
     * 
     */
    public IncentiveTableDescriptionDataType createIncentiveTableDescriptionDataType() {
        return new IncentiveTableDescriptionDataType();
    }

    /**
     * Create an instance of {@link IncentiveTableDescriptionDataElementsType }
     * 
     */
    public IncentiveTableDescriptionDataElementsType createIncentiveTableDescriptionDataElementsType() {
        return new IncentiveTableDescriptionDataElementsType();
    }

    /**
     * Create an instance of {@link IncentiveTableConstraintsDataType }
     * 
     */
    public IncentiveTableConstraintsDataType createIncentiveTableConstraintsDataType() {
        return new IncentiveTableConstraintsDataType();
    }

    /**
     * Create an instance of {@link IncentiveTableConstraintsDataElementsType }
     * 
     */
    public IncentiveTableConstraintsDataElementsType createIncentiveTableConstraintsDataElementsType() {
        return new IncentiveTableConstraintsDataElementsType();
    }

    /**
     * Create an instance of {@link MessagingDataType }
     * 
     */
    public MessagingDataType createMessagingDataType() {
        return new MessagingDataType();
    }

    /**
     * Create an instance of {@link MessagingDataElementsType }
     * 
     */
    public MessagingDataElementsType createMessagingDataElementsType() {
        return new MessagingDataElementsType();
    }

    /**
     * Create an instance of {@link MessagingListDataType }
     * 
     */
    public MessagingListDataType createMessagingListDataType() {
        return new MessagingListDataType();
    }

    /**
     * Create an instance of {@link MessagingListDataSelectorsType }
     * 
     */
    public MessagingListDataSelectorsType createMessagingListDataSelectorsType() {
        return new MessagingListDataSelectorsType();
    }

    /**
     * Create an instance of {@link NetworkManagementAddNodeCallType }
     * 
     */
    public NetworkManagementAddNodeCallType createNetworkManagementAddNodeCallType() {
        return new NetworkManagementAddNodeCallType();
    }

    /**
     * Create an instance of {@link NetworkManagementAddNodeCallElementsType }
     * 
     */
    public NetworkManagementAddNodeCallElementsType createNetworkManagementAddNodeCallElementsType() {
        return new NetworkManagementAddNodeCallElementsType();
    }

    /**
     * Create an instance of {@link NetworkManagementRemoveNodeCallType }
     * 
     */
    public NetworkManagementRemoveNodeCallType createNetworkManagementRemoveNodeCallType() {
        return new NetworkManagementRemoveNodeCallType();
    }

    /**
     * Create an instance of {@link NetworkManagementRemoveNodeCallElementsType }
     * 
     */
    public NetworkManagementRemoveNodeCallElementsType createNetworkManagementRemoveNodeCallElementsType() {
        return new NetworkManagementRemoveNodeCallElementsType();
    }

    /**
     * Create an instance of {@link NetworkManagementModifyNodeCallType }
     * 
     */
    public NetworkManagementModifyNodeCallType createNetworkManagementModifyNodeCallType() {
        return new NetworkManagementModifyNodeCallType();
    }

    /**
     * Create an instance of {@link NetworkManagementModifyNodeCallElementsType }
     * 
     */
    public NetworkManagementModifyNodeCallElementsType createNetworkManagementModifyNodeCallElementsType() {
        return new NetworkManagementModifyNodeCallElementsType();
    }

    /**
     * Create an instance of {@link NetworkManagementScanNetworkCallType }
     * 
     */
    public NetworkManagementScanNetworkCallType createNetworkManagementScanNetworkCallType() {
        return new NetworkManagementScanNetworkCallType();
    }

    /**
     * Create an instance of {@link NetworkManagementScanNetworkCallElementsType }
     * 
     */
    public NetworkManagementScanNetworkCallElementsType createNetworkManagementScanNetworkCallElementsType() {
        return new NetworkManagementScanNetworkCallElementsType();
    }

    /**
     * Create an instance of {@link NetworkManagementDiscoverCallType }
     * 
     */
    public NetworkManagementDiscoverCallType createNetworkManagementDiscoverCallType() {
        return new NetworkManagementDiscoverCallType();
    }

    /**
     * Create an instance of {@link NetworkManagementDiscoverCallElementsType }
     * 
     */
    public NetworkManagementDiscoverCallElementsType createNetworkManagementDiscoverCallElementsType() {
        return new NetworkManagementDiscoverCallElementsType();
    }

    /**
     * Create an instance of {@link NetworkManagementAbortCallType }
     * 
     */
    public NetworkManagementAbortCallType createNetworkManagementAbortCallType() {
        return new NetworkManagementAbortCallType();
    }

    /**
     * Create an instance of {@link NetworkManagementAbortCallElementsType }
     * 
     */
    public NetworkManagementAbortCallElementsType createNetworkManagementAbortCallElementsType() {
        return new NetworkManagementAbortCallElementsType();
    }

    /**
     * Create an instance of {@link NetworkManagementProcessStateDataType }
     * 
     */
    public NetworkManagementProcessStateDataType createNetworkManagementProcessStateDataType() {
        return new NetworkManagementProcessStateDataType();
    }

    /**
     * Create an instance of {@link NetworkManagementProcessStateDataElementsType }
     * 
     */
    public NetworkManagementProcessStateDataElementsType createNetworkManagementProcessStateDataElementsType() {
        return new NetworkManagementProcessStateDataElementsType();
    }

    /**
     * Create an instance of {@link NetworkManagementJoiningModeDataType }
     * 
     */
    public NetworkManagementJoiningModeDataType createNetworkManagementJoiningModeDataType() {
        return new NetworkManagementJoiningModeDataType();
    }

    /**
     * Create an instance of {@link NetworkManagementJoiningModeDataElementsType }
     * 
     */
    public NetworkManagementJoiningModeDataElementsType createNetworkManagementJoiningModeDataElementsType() {
        return new NetworkManagementJoiningModeDataElementsType();
    }

    /**
     * Create an instance of {@link NetworkManagementReportCandidateDataType }
     * 
     */
    public NetworkManagementReportCandidateDataType createNetworkManagementReportCandidateDataType() {
        return new NetworkManagementReportCandidateDataType();
    }

    /**
     * Create an instance of {@link NetworkManagementReportCandidateDataElementsType }
     * 
     */
    public NetworkManagementReportCandidateDataElementsType createNetworkManagementReportCandidateDataElementsType() {
        return new NetworkManagementReportCandidateDataElementsType();
    }

    /**
     * Create an instance of {@link NetworkManagementDeviceDescriptionDataType }
     * 
     */
    public NetworkManagementDeviceDescriptionDataType createNetworkManagementDeviceDescriptionDataType() {
        return new NetworkManagementDeviceDescriptionDataType();
    }

    /**
     * Create an instance of {@link NetworkManagementDeviceDescriptionDataElementsType }
     * 
     */
    public NetworkManagementDeviceDescriptionDataElementsType createNetworkManagementDeviceDescriptionDataElementsType() {
        return new NetworkManagementDeviceDescriptionDataElementsType();
    }

    /**
     * Create an instance of {@link NetworkManagementDeviceDescriptionListDataType }
     * 
     */
    public NetworkManagementDeviceDescriptionListDataType createNetworkManagementDeviceDescriptionListDataType() {
        return new NetworkManagementDeviceDescriptionListDataType();
    }

    /**
     * Create an instance of {@link NetworkManagementDeviceDescriptionListDataSelectorsType }
     * 
     */
    public NetworkManagementDeviceDescriptionListDataSelectorsType createNetworkManagementDeviceDescriptionListDataSelectorsType() {
        return new NetworkManagementDeviceDescriptionListDataSelectorsType();
    }

    /**
     * Create an instance of {@link NetworkManagementEntityDescriptionDataType }
     * 
     */
    public NetworkManagementEntityDescriptionDataType createNetworkManagementEntityDescriptionDataType() {
        return new NetworkManagementEntityDescriptionDataType();
    }

    /**
     * Create an instance of {@link NetworkManagementEntityDescriptionDataElementsType }
     * 
     */
    public NetworkManagementEntityDescriptionDataElementsType createNetworkManagementEntityDescriptionDataElementsType() {
        return new NetworkManagementEntityDescriptionDataElementsType();
    }

    /**
     * Create an instance of {@link NetworkManagementEntityDescriptionListDataType }
     * 
     */
    public NetworkManagementEntityDescriptionListDataType createNetworkManagementEntityDescriptionListDataType() {
        return new NetworkManagementEntityDescriptionListDataType();
    }

    /**
     * Create an instance of {@link NetworkManagementEntityDescriptionListDataSelectorsType }
     * 
     */
    public NetworkManagementEntityDescriptionListDataSelectorsType createNetworkManagementEntityDescriptionListDataSelectorsType() {
        return new NetworkManagementEntityDescriptionListDataSelectorsType();
    }

    /**
     * Create an instance of {@link NetworkManagementFeatureDescriptionDataType }
     * 
     */
    public NetworkManagementFeatureDescriptionDataType createNetworkManagementFeatureDescriptionDataType() {
        return new NetworkManagementFeatureDescriptionDataType();
    }

    /**
     * Create an instance of {@link NetworkManagementFeatureDescriptionDataElementsType }
     * 
     */
    public NetworkManagementFeatureDescriptionDataElementsType createNetworkManagementFeatureDescriptionDataElementsType() {
        return new NetworkManagementFeatureDescriptionDataElementsType();
    }

    /**
     * Create an instance of {@link NetworkManagementFeatureDescriptionListDataType }
     * 
     */
    public NetworkManagementFeatureDescriptionListDataType createNetworkManagementFeatureDescriptionListDataType() {
        return new NetworkManagementFeatureDescriptionListDataType();
    }

    /**
     * Create an instance of {@link NetworkManagementFeatureDescriptionListDataSelectorsType }
     * 
     */
    public NetworkManagementFeatureDescriptionListDataSelectorsType createNetworkManagementFeatureDescriptionListDataSelectorsType() {
        return new NetworkManagementFeatureDescriptionListDataSelectorsType();
    }

    /**
     * Create an instance of {@link SubscriptionManagementEntryDataType }
     * 
     */
    public SubscriptionManagementEntryDataType createSubscriptionManagementEntryDataType() {
        return new SubscriptionManagementEntryDataType();
    }

    /**
     * Create an instance of {@link SubscriptionManagementEntryDataElementsType }
     * 
     */
    public SubscriptionManagementEntryDataElementsType createSubscriptionManagementEntryDataElementsType() {
        return new SubscriptionManagementEntryDataElementsType();
    }

    /**
     * Create an instance of {@link SubscriptionManagementEntryListDataType }
     * 
     */
    public SubscriptionManagementEntryListDataType createSubscriptionManagementEntryListDataType() {
        return new SubscriptionManagementEntryListDataType();
    }

    /**
     * Create an instance of {@link SubscriptionManagementEntryListDataSelectorsType }
     * 
     */
    public SubscriptionManagementEntryListDataSelectorsType createSubscriptionManagementEntryListDataSelectorsType() {
        return new SubscriptionManagementEntryListDataSelectorsType();
    }

    /**
     * Create an instance of {@link SubscriptionManagementRequestCallType }
     * 
     */
    public SubscriptionManagementRequestCallType createSubscriptionManagementRequestCallType() {
        return new SubscriptionManagementRequestCallType();
    }

    /**
     * Create an instance of {@link SubscriptionManagementRequestCallElementsType }
     * 
     */
    public SubscriptionManagementRequestCallElementsType createSubscriptionManagementRequestCallElementsType() {
        return new SubscriptionManagementRequestCallElementsType();
    }

    /**
     * Create an instance of {@link SubscriptionManagementDeleteCallType }
     * 
     */
    public SubscriptionManagementDeleteCallType createSubscriptionManagementDeleteCallType() {
        return new SubscriptionManagementDeleteCallType();
    }

    /**
     * Create an instance of {@link SubscriptionManagementDeleteCallElementsType }
     * 
     */
    public SubscriptionManagementDeleteCallElementsType createSubscriptionManagementDeleteCallElementsType() {
        return new SubscriptionManagementDeleteCallElementsType();
    }

    /**
     * Create an instance of {@link SpecificationVersionDataType }
     * 
     */
    public SpecificationVersionDataType createSpecificationVersionDataType() {
        return new SpecificationVersionDataType();
    }

    /**
     * Create an instance of {@link SpecificationVersionDataElementsType }
     * 
     */
    public SpecificationVersionDataElementsType createSpecificationVersionDataElementsType() {
        return new SpecificationVersionDataElementsType();
    }

    /**
     * Create an instance of {@link SpecificationVersionListDataType }
     * 
     */
    public SpecificationVersionListDataType createSpecificationVersionListDataType() {
        return new SpecificationVersionListDataType();
    }

    /**
     * Create an instance of {@link SpecificationVersionListDataSelectorsType }
     * 
     */
    public SpecificationVersionListDataSelectorsType createSpecificationVersionListDataSelectorsType() {
        return new SpecificationVersionListDataSelectorsType();
    }

    /**
     * Create an instance of {@link UseCaseInformationDataType }
     * 
     */
    public UseCaseInformationDataType createUseCaseInformationDataType() {
        return new UseCaseInformationDataType();
    }

    /**
     * Create an instance of {@link UseCaseInformationDataElementsType }
     * 
     */
    public UseCaseInformationDataElementsType createUseCaseInformationDataElementsType() {
        return new UseCaseInformationDataElementsType();
    }

    /**
     * Create an instance of {@link UseCaseInformationListDataType }
     * 
     */
    public UseCaseInformationListDataType createUseCaseInformationListDataType() {
        return new UseCaseInformationListDataType();
    }

    /**
     * Create an instance of {@link UseCaseInformationListDataSelectorsType }
     * 
     */
    public UseCaseInformationListDataSelectorsType createUseCaseInformationListDataSelectorsType() {
        return new UseCaseInformationListDataSelectorsType();
    }

    /**
     * Create an instance of {@link NodeManagementDetailedDiscoveryDataType }
     * 
     */
    public NodeManagementDetailedDiscoveryDataType createNodeManagementDetailedDiscoveryDataType() {
        return new NodeManagementDetailedDiscoveryDataType();
    }

    /**
     * Create an instance of {@link NodeManagementDetailedDiscoveryDataElementsType }
     * 
     */
    public NodeManagementDetailedDiscoveryDataElementsType createNodeManagementDetailedDiscoveryDataElementsType() {
        return new NodeManagementDetailedDiscoveryDataElementsType();
    }

    /**
     * Create an instance of {@link NodeManagementDestinationListDataType }
     * 
     */
    public NodeManagementDestinationListDataType createNodeManagementDestinationListDataType() {
        return new NodeManagementDestinationListDataType();
    }

    /**
     * Create an instance of {@link OperatingConstraintsInterruptDataType }
     * 
     */
    public OperatingConstraintsInterruptDataType createOperatingConstraintsInterruptDataType() {
        return new OperatingConstraintsInterruptDataType();
    }

    /**
     * Create an instance of {@link OperatingConstraintsInterruptDataElementsType }
     * 
     */
    public OperatingConstraintsInterruptDataElementsType createOperatingConstraintsInterruptDataElementsType() {
        return new OperatingConstraintsInterruptDataElementsType();
    }

    /**
     * Create an instance of {@link OperatingConstraintsInterruptListDataType }
     * 
     */
    public OperatingConstraintsInterruptListDataType createOperatingConstraintsInterruptListDataType() {
        return new OperatingConstraintsInterruptListDataType();
    }

    /**
     * Create an instance of {@link OperatingConstraintsInterruptListDataSelectorsType }
     * 
     */
    public OperatingConstraintsInterruptListDataSelectorsType createOperatingConstraintsInterruptListDataSelectorsType() {
        return new OperatingConstraintsInterruptListDataSelectorsType();
    }

    /**
     * Create an instance of {@link OperatingConstraintsDurationDataType }
     * 
     */
    public OperatingConstraintsDurationDataType createOperatingConstraintsDurationDataType() {
        return new OperatingConstraintsDurationDataType();
    }

    /**
     * Create an instance of {@link OperatingConstraintsDurationDataElementsType }
     * 
     */
    public OperatingConstraintsDurationDataElementsType createOperatingConstraintsDurationDataElementsType() {
        return new OperatingConstraintsDurationDataElementsType();
    }

    /**
     * Create an instance of {@link OperatingConstraintsDurationListDataType }
     * 
     */
    public OperatingConstraintsDurationListDataType createOperatingConstraintsDurationListDataType() {
        return new OperatingConstraintsDurationListDataType();
    }

    /**
     * Create an instance of {@link OperatingConstraintsDurationListDataSelectorsType }
     * 
     */
    public OperatingConstraintsDurationListDataSelectorsType createOperatingConstraintsDurationListDataSelectorsType() {
        return new OperatingConstraintsDurationListDataSelectorsType();
    }

    /**
     * Create an instance of {@link OperatingConstraintsPowerDescriptionDataType }
     * 
     */
    public OperatingConstraintsPowerDescriptionDataType createOperatingConstraintsPowerDescriptionDataType() {
        return new OperatingConstraintsPowerDescriptionDataType();
    }

    /**
     * Create an instance of {@link OperatingConstraintsPowerDescriptionDataElementsType }
     * 
     */
    public OperatingConstraintsPowerDescriptionDataElementsType createOperatingConstraintsPowerDescriptionDataElementsType() {
        return new OperatingConstraintsPowerDescriptionDataElementsType();
    }

    /**
     * Create an instance of {@link OperatingConstraintsPowerDescriptionListDataType }
     * 
     */
    public OperatingConstraintsPowerDescriptionListDataType createOperatingConstraintsPowerDescriptionListDataType() {
        return new OperatingConstraintsPowerDescriptionListDataType();
    }

    /**
     * Create an instance of {@link OperatingConstraintsPowerDescriptionListDataSelectorsType }
     * 
     */
    public OperatingConstraintsPowerDescriptionListDataSelectorsType createOperatingConstraintsPowerDescriptionListDataSelectorsType() {
        return new OperatingConstraintsPowerDescriptionListDataSelectorsType();
    }

    /**
     * Create an instance of {@link OperatingConstraintsPowerRangeDataType }
     * 
     */
    public OperatingConstraintsPowerRangeDataType createOperatingConstraintsPowerRangeDataType() {
        return new OperatingConstraintsPowerRangeDataType();
    }

    /**
     * Create an instance of {@link OperatingConstraintsPowerRangeDataElementsType }
     * 
     */
    public OperatingConstraintsPowerRangeDataElementsType createOperatingConstraintsPowerRangeDataElementsType() {
        return new OperatingConstraintsPowerRangeDataElementsType();
    }

    /**
     * Create an instance of {@link OperatingConstraintsPowerRangeListDataType }
     * 
     */
    public OperatingConstraintsPowerRangeListDataType createOperatingConstraintsPowerRangeListDataType() {
        return new OperatingConstraintsPowerRangeListDataType();
    }

    /**
     * Create an instance of {@link OperatingConstraintsPowerRangeListDataSelectorsType }
     * 
     */
    public OperatingConstraintsPowerRangeListDataSelectorsType createOperatingConstraintsPowerRangeListDataSelectorsType() {
        return new OperatingConstraintsPowerRangeListDataSelectorsType();
    }

    /**
     * Create an instance of {@link OperatingConstraintsPowerLevelDataType }
     * 
     */
    public OperatingConstraintsPowerLevelDataType createOperatingConstraintsPowerLevelDataType() {
        return new OperatingConstraintsPowerLevelDataType();
    }

    /**
     * Create an instance of {@link OperatingConstraintsPowerLevelDataElementsType }
     * 
     */
    public OperatingConstraintsPowerLevelDataElementsType createOperatingConstraintsPowerLevelDataElementsType() {
        return new OperatingConstraintsPowerLevelDataElementsType();
    }

    /**
     * Create an instance of {@link OperatingConstraintsPowerLevelListDataType }
     * 
     */
    public OperatingConstraintsPowerLevelListDataType createOperatingConstraintsPowerLevelListDataType() {
        return new OperatingConstraintsPowerLevelListDataType();
    }

    /**
     * Create an instance of {@link OperatingConstraintsPowerLevelListDataSelectorsType }
     * 
     */
    public OperatingConstraintsPowerLevelListDataSelectorsType createOperatingConstraintsPowerLevelListDataSelectorsType() {
        return new OperatingConstraintsPowerLevelListDataSelectorsType();
    }

    /**
     * Create an instance of {@link OperatingConstraintsResumeImplicationDataType }
     * 
     */
    public OperatingConstraintsResumeImplicationDataType createOperatingConstraintsResumeImplicationDataType() {
        return new OperatingConstraintsResumeImplicationDataType();
    }

    /**
     * Create an instance of {@link OperatingConstraintsResumeImplicationDataElementsType }
     * 
     */
    public OperatingConstraintsResumeImplicationDataElementsType createOperatingConstraintsResumeImplicationDataElementsType() {
        return new OperatingConstraintsResumeImplicationDataElementsType();
    }

    /**
     * Create an instance of {@link OperatingConstraintsResumeImplicationListDataType }
     * 
     */
    public OperatingConstraintsResumeImplicationListDataType createOperatingConstraintsResumeImplicationListDataType() {
        return new OperatingConstraintsResumeImplicationListDataType();
    }

    /**
     * Create an instance of {@link OperatingConstraintsResumeImplicationListDataSelectorsType }
     * 
     */
    public OperatingConstraintsResumeImplicationListDataSelectorsType createOperatingConstraintsResumeImplicationListDataSelectorsType() {
        return new OperatingConstraintsResumeImplicationListDataSelectorsType();
    }

    /**
     * Create an instance of {@link SensingDataType }
     * 
     */
    public SensingDataType createSensingDataType() {
        return new SensingDataType();
    }

    /**
     * Create an instance of {@link SensingDataElementsType }
     * 
     */
    public SensingDataElementsType createSensingDataElementsType() {
        return new SensingDataElementsType();
    }

    /**
     * Create an instance of {@link SensingListDataType }
     * 
     */
    public SensingListDataType createSensingListDataType() {
        return new SensingListDataType();
    }

    /**
     * Create an instance of {@link SensingListDataSelectorsType }
     * 
     */
    public SensingListDataSelectorsType createSensingListDataSelectorsType() {
        return new SensingListDataSelectorsType();
    }

    /**
     * Create an instance of {@link SensingDescriptionDataType }
     * 
     */
    public SensingDescriptionDataType createSensingDescriptionDataType() {
        return new SensingDescriptionDataType();
    }

    /**
     * Create an instance of {@link SensingDescriptionDataElementsType }
     * 
     */
    public SensingDescriptionDataElementsType createSensingDescriptionDataElementsType() {
        return new SensingDescriptionDataElementsType();
    }

    /**
     * Create an instance of {@link StateInformationDataType }
     * 
     */
    public StateInformationDataType createStateInformationDataType() {
        return new StateInformationDataType();
    }

    /**
     * Create an instance of {@link StateInformationDataElementsType }
     * 
     */
    public StateInformationDataElementsType createStateInformationDataElementsType() {
        return new StateInformationDataElementsType();
    }

    /**
     * Create an instance of {@link StateInformationListDataType }
     * 
     */
    public StateInformationListDataType createStateInformationListDataType() {
        return new StateInformationListDataType();
    }

    /**
     * Create an instance of {@link StateInformationListDataSelectorsType }
     * 
     */
    public StateInformationListDataSelectorsType createStateInformationListDataSelectorsType() {
        return new StateInformationListDataSelectorsType();
    }

    /**
     * Create an instance of {@link TimeInformationDataType }
     * 
     */
    public TimeInformationDataType createTimeInformationDataType() {
        return new TimeInformationDataType();
    }

    /**
     * Create an instance of {@link TimeInformationDataElementsType }
     * 
     */
    public TimeInformationDataElementsType createTimeInformationDataElementsType() {
        return new TimeInformationDataElementsType();
    }

    /**
     * Create an instance of {@link TimeDistributorDataType }
     * 
     */
    public TimeDistributorDataType createTimeDistributorDataType() {
        return new TimeDistributorDataType();
    }

    /**
     * Create an instance of {@link TimeDistributorDataElementsType }
     * 
     */
    public TimeDistributorDataElementsType createTimeDistributorDataElementsType() {
        return new TimeDistributorDataElementsType();
    }

    /**
     * Create an instance of {@link TimePrecisionDataType }
     * 
     */
    public TimePrecisionDataType createTimePrecisionDataType() {
        return new TimePrecisionDataType();
    }

    /**
     * Create an instance of {@link TimePrecisionDataElementsType }
     * 
     */
    public TimePrecisionDataElementsType createTimePrecisionDataElementsType() {
        return new TimePrecisionDataElementsType();
    }

    /**
     * Create an instance of {@link TimeDistributorEnquiryCallType }
     * 
     */
    public TimeDistributorEnquiryCallType createTimeDistributorEnquiryCallType() {
        return new TimeDistributorEnquiryCallType();
    }

    /**
     * Create an instance of {@link TimeDistributorEnquiryCallElementsType }
     * 
     */
    public TimeDistributorEnquiryCallElementsType createTimeDistributorEnquiryCallElementsType() {
        return new TimeDistributorEnquiryCallElementsType();
    }

    /**
     * Create an instance of {@link FilterType }
     * 
     */
    public FilterType createFilterType() {
        return new FilterType();
    }

    /**
     * Create an instance of {@link CmdControlType }
     * 
     */
    public CmdControlType createCmdControlType() {
        return new CmdControlType();
    }

    /**
     * Create an instance of {@link HeaderType }
     * 
     */
    public HeaderType createHeaderType() {
        return new HeaderType();
    }

    /**
     * Create an instance of {@link PayloadType }
     * 
     */
    public PayloadType createPayloadType() {
        return new PayloadType();
    }

    /**
     * Create an instance of {@link DatagramType }
     * 
     */
    public DatagramType createDatagramType() {
        return new DatagramType();
    }

    /**
     * Create an instance of {@link ElementTagType }
     * 
     */
    public ElementTagType createElementTagType() {
        return new ElementTagType();
    }

    /**
     * Create an instance of {@link TimePeriodType }
     * 
     */
    public TimePeriodType createTimePeriodType() {
        return new TimePeriodType();
    }

    /**
     * Create an instance of {@link TimePeriodElementsType }
     * 
     */
    public TimePeriodElementsType createTimePeriodElementsType() {
        return new TimePeriodElementsType();
    }

    /**
     * Create an instance of {@link TimestampIntervalType }
     * 
     */
    public TimestampIntervalType createTimestampIntervalType() {
        return new TimestampIntervalType();
    }

    /**
     * Create an instance of {@link DaysOfWeekType }
     * 
     */
    public DaysOfWeekType createDaysOfWeekType() {
        return new DaysOfWeekType();
    }

    /**
     * Create an instance of {@link AbsoluteOrRecurringTimeType }
     * 
     */
    public AbsoluteOrRecurringTimeType createAbsoluteOrRecurringTimeType() {
        return new AbsoluteOrRecurringTimeType();
    }

    /**
     * Create an instance of {@link AbsoluteOrRecurringTimeElementsType }
     * 
     */
    public AbsoluteOrRecurringTimeElementsType createAbsoluteOrRecurringTimeElementsType() {
        return new AbsoluteOrRecurringTimeElementsType();
    }

    /**
     * Create an instance of {@link RecurrenceInformationType }
     * 
     */
    public RecurrenceInformationType createRecurrenceInformationType() {
        return new RecurrenceInformationType();
    }

    /**
     * Create an instance of {@link RecurrenceInformationElementsType }
     * 
     */
    public RecurrenceInformationElementsType createRecurrenceInformationElementsType() {
        return new RecurrenceInformationElementsType();
    }

    /**
     * Create an instance of {@link ScaledNumberRangeType }
     * 
     */
    public ScaledNumberRangeType createScaledNumberRangeType() {
        return new ScaledNumberRangeType();
    }

    /**
     * Create an instance of {@link ScaledNumberRangeElementsType }
     * 
     */
    public ScaledNumberRangeElementsType createScaledNumberRangeElementsType() {
        return new ScaledNumberRangeElementsType();
    }

    /**
     * Create an instance of {@link ScaledNumberSetType }
     * 
     */
    public ScaledNumberSetType createScaledNumberSetType() {
        return new ScaledNumberSetType();
    }

    /**
     * Create an instance of {@link ScaledNumberSetElementsType }
     * 
     */
    public ScaledNumberSetElementsType createScaledNumberSetElementsType() {
        return new ScaledNumberSetElementsType();
    }

    /**
     * Create an instance of {@link ScaledNumberType }
     * 
     */
    public ScaledNumberType createScaledNumberType() {
        return new ScaledNumberType();
    }

    /**
     * Create an instance of {@link ScaledNumberElementsType }
     * 
     */
    public ScaledNumberElementsType createScaledNumberElementsType() {
        return new ScaledNumberElementsType();
    }

    /**
     * Create an instance of {@link DeviceAddressType }
     * 
     */
    public DeviceAddressType createDeviceAddressType() {
        return new DeviceAddressType();
    }

    /**
     * Create an instance of {@link DeviceAddressElementsType }
     * 
     */
    public DeviceAddressElementsType createDeviceAddressElementsType() {
        return new DeviceAddressElementsType();
    }

    /**
     * Create an instance of {@link EntityAddressType }
     * 
     */
    public EntityAddressType createEntityAddressType() {
        return new EntityAddressType();
    }

    /**
     * Create an instance of {@link EntityAddressElementsType }
     * 
     */
    public EntityAddressElementsType createEntityAddressElementsType() {
        return new EntityAddressElementsType();
    }

    /**
     * Create an instance of {@link FeatureAddressType }
     * 
     */
    public FeatureAddressType createFeatureAddressType() {
        return new FeatureAddressType();
    }

    /**
     * Create an instance of {@link FeatureAddressElementsType }
     * 
     */
    public FeatureAddressElementsType createFeatureAddressElementsType() {
        return new FeatureAddressElementsType();
    }

    /**
     * Create an instance of {@link PossibleOperationsClassifierType }
     * 
     */
    public PossibleOperationsClassifierType createPossibleOperationsClassifierType() {
        return new PossibleOperationsClassifierType();
    }

    /**
     * Create an instance of {@link PossibleOperationsReadType }
     * 
     */
    public PossibleOperationsReadType createPossibleOperationsReadType() {
        return new PossibleOperationsReadType();
    }

    /**
     * Create an instance of {@link PossibleOperationsWriteType }
     * 
     */
    public PossibleOperationsWriteType createPossibleOperationsWriteType() {
        return new PossibleOperationsWriteType();
    }

    /**
     * Create an instance of {@link PossibleOperationsType }
     * 
     */
    public PossibleOperationsType createPossibleOperationsType() {
        return new PossibleOperationsType();
    }

    /**
     * Create an instance of {@link PossibleOperationsElementsType }
     * 
     */
    public PossibleOperationsElementsType createPossibleOperationsElementsType() {
        return new PossibleOperationsElementsType();
    }

    /**
     * Create an instance of {@link FunctionPropertyType }
     * 
     */
    public FunctionPropertyType createFunctionPropertyType() {
        return new FunctionPropertyType();
    }

    /**
     * Create an instance of {@link FunctionPropertyElementsType }
     * 
     */
    public FunctionPropertyElementsType createFunctionPropertyElementsType() {
        return new FunctionPropertyElementsType();
    }

    /**
     * Create an instance of {@link TimeSeriesSlotType }
     * 
     */
    public TimeSeriesSlotType createTimeSeriesSlotType() {
        return new TimeSeriesSlotType();
    }

    /**
     * Create an instance of {@link TimeSeriesSlotElementsType }
     * 
     */
    public TimeSeriesSlotElementsType createTimeSeriesSlotElementsType() {
        return new TimeSeriesSlotElementsType();
    }

    /**
     * Create an instance of {@link DeviceConfigurationKeyValueValueType }
     * 
     */
    public DeviceConfigurationKeyValueValueType createDeviceConfigurationKeyValueValueType() {
        return new DeviceConfigurationKeyValueValueType();
    }

    /**
     * Create an instance of {@link DeviceConfigurationKeyValueValueElementsType }
     * 
     */
    public DeviceConfigurationKeyValueValueElementsType createDeviceConfigurationKeyValueValueElementsType() {
        return new DeviceConfigurationKeyValueValueElementsType();
    }

    /**
     * Create an instance of {@link TaskManagementDirectControlRelatedType }
     * 
     */
    public TaskManagementDirectControlRelatedType createTaskManagementDirectControlRelatedType() {
        return new TaskManagementDirectControlRelatedType();
    }

    /**
     * Create an instance of {@link TaskManagementDirectControlRelatedElementsType }
     * 
     */
    public TaskManagementDirectControlRelatedElementsType createTaskManagementDirectControlRelatedElementsType() {
        return new TaskManagementDirectControlRelatedElementsType();
    }

    /**
     * Create an instance of {@link TaskManagementHvacRelatedType }
     * 
     */
    public TaskManagementHvacRelatedType createTaskManagementHvacRelatedType() {
        return new TaskManagementHvacRelatedType();
    }

    /**
     * Create an instance of {@link TaskManagementHvacRelatedElementsType }
     * 
     */
    public TaskManagementHvacRelatedElementsType createTaskManagementHvacRelatedElementsType() {
        return new TaskManagementHvacRelatedElementsType();
    }

    /**
     * Create an instance of {@link TaskManagementLoadControlReleatedType }
     * 
     */
    public TaskManagementLoadControlReleatedType createTaskManagementLoadControlReleatedType() {
        return new TaskManagementLoadControlReleatedType();
    }

    /**
     * Create an instance of {@link TaskManagementLoadControlReleatedElementsType }
     * 
     */
    public TaskManagementLoadControlReleatedElementsType createTaskManagementLoadControlReleatedElementsType() {
        return new TaskManagementLoadControlReleatedElementsType();
    }

    /**
     * Create an instance of {@link TaskManagementPowerSequencesRelatedType }
     * 
     */
    public TaskManagementPowerSequencesRelatedType createTaskManagementPowerSequencesRelatedType() {
        return new TaskManagementPowerSequencesRelatedType();
    }

    /**
     * Create an instance of {@link TaskManagementPowerSequencesRelatedElementsType }
     * 
     */
    public TaskManagementPowerSequencesRelatedElementsType createTaskManagementPowerSequencesRelatedElementsType() {
        return new TaskManagementPowerSequencesRelatedElementsType();
    }

    /**
     * Create an instance of {@link TaskManagementSmartEnergyManagementPsRelatedType }
     * 
     */
    public TaskManagementSmartEnergyManagementPsRelatedType createTaskManagementSmartEnergyManagementPsRelatedType() {
        return new TaskManagementSmartEnergyManagementPsRelatedType();
    }

    /**
     * Create an instance of {@link TaskManagementSmartEnergyManagementPsRelatedElementsType }
     * 
     */
    public TaskManagementSmartEnergyManagementPsRelatedElementsType createTaskManagementSmartEnergyManagementPsRelatedElementsType() {
        return new TaskManagementSmartEnergyManagementPsRelatedElementsType();
    }

    /**
     * Create an instance of {@link BillValueType }
     * 
     */
    public BillValueType createBillValueType() {
        return new BillValueType();
    }

    /**
     * Create an instance of {@link BillValueElementsType }
     * 
     */
    public BillValueElementsType createBillValueElementsType() {
        return new BillValueElementsType();
    }

    /**
     * Create an instance of {@link BillCostType }
     * 
     */
    public BillCostType createBillCostType() {
        return new BillCostType();
    }

    /**
     * Create an instance of {@link BillCostElementsType }
     * 
     */
    public BillCostElementsType createBillCostElementsType() {
        return new BillCostElementsType();
    }

    /**
     * Create an instance of {@link BillPositionType }
     * 
     */
    public BillPositionType createBillPositionType() {
        return new BillPositionType();
    }

    /**
     * Create an instance of {@link BillPositionElementsType }
     * 
     */
    public BillPositionElementsType createBillPositionElementsType() {
        return new BillPositionElementsType();
    }

    /**
     * Create an instance of {@link DataTunnelingHeaderType }
     * 
     */
    public DataTunnelingHeaderType createDataTunnelingHeaderType() {
        return new DataTunnelingHeaderType();
    }

    /**
     * Create an instance of {@link DataTunnelingHeaderElementsType }
     * 
     */
    public DataTunnelingHeaderElementsType createDataTunnelingHeaderElementsType() {
        return new DataTunnelingHeaderElementsType();
    }

    /**
     * Create an instance of {@link UseCaseSupportType }
     * 
     */
    public UseCaseSupportType createUseCaseSupportType() {
        return new UseCaseSupportType();
    }

    /**
     * Create an instance of {@link UseCaseSupportElementsType }
     * 
     */
    public UseCaseSupportElementsType createUseCaseSupportElementsType() {
        return new UseCaseSupportElementsType();
    }

    /**
     * Create an instance of {@link UseCaseSupportSelectorsType }
     * 
     */
    public UseCaseSupportSelectorsType createUseCaseSupportSelectorsType() {
        return new UseCaseSupportSelectorsType();
    }

    /**
     * Create an instance of {@link NodeManagementSpecificationVersionListType }
     * 
     */
    public NodeManagementSpecificationVersionListType createNodeManagementSpecificationVersionListType() {
        return new NodeManagementSpecificationVersionListType();
    }

    /**
     * Create an instance of {@link SmartEnergyManagementPsAlternativesRelationType }
     * 
     */
    public SmartEnergyManagementPsAlternativesRelationType createSmartEnergyManagementPsAlternativesRelationType() {
        return new SmartEnergyManagementPsAlternativesRelationType();
    }

    /**
     * Create an instance of {@link SmartEnergyManagementPsAlternativesType }
     * 
     */
    public SmartEnergyManagementPsAlternativesType createSmartEnergyManagementPsAlternativesType() {
        return new SmartEnergyManagementPsAlternativesType();
    }

    /**
     * Create an instance of {@link SmartEnergyManagementPsAlternativesRelationElementsType }
     * 
     */
    public SmartEnergyManagementPsAlternativesRelationElementsType createSmartEnergyManagementPsAlternativesRelationElementsType() {
        return new SmartEnergyManagementPsAlternativesRelationElementsType();
    }

    /**
     * Create an instance of {@link SmartEnergyManagementPsAlternativesElementsType }
     * 
     */
    public SmartEnergyManagementPsAlternativesElementsType createSmartEnergyManagementPsAlternativesElementsType() {
        return new SmartEnergyManagementPsAlternativesElementsType();
    }

    /**
     * Create an instance of {@link CmdType }
     * 
     */
    public CmdType createCmdType() {
        return new CmdType();
    }

    /**
     * Create an instance of {@link SmartEnergyManagementPsPowerTimeSlotValueListElementsType.Value }
     * 
     */
    public SmartEnergyManagementPsPowerTimeSlotValueListElementsType.Value createSmartEnergyManagementPsPowerTimeSlotValueListElementsTypeValue() {
        return new SmartEnergyManagementPsPowerTimeSlotValueListElementsType.Value();
    }

    /**
     * Create an instance of {@link SmartEnergyManagementPsPowerTimeSlotElementsType.Schedule }
     * 
     */
    public SmartEnergyManagementPsPowerTimeSlotElementsType.Schedule createSmartEnergyManagementPsPowerTimeSlotElementsTypeSchedule() {
        return new SmartEnergyManagementPsPowerTimeSlotElementsType.Schedule();
    }

    /**
     * Create an instance of {@link SmartEnergyManagementPsPowerTimeSlotElementsType.ScheduleConstraints }
     * 
     */
    public SmartEnergyManagementPsPowerTimeSlotElementsType.ScheduleConstraints createSmartEnergyManagementPsPowerTimeSlotElementsTypeScheduleConstraints() {
        return new SmartEnergyManagementPsPowerTimeSlotElementsType.ScheduleConstraints();
    }

    /**
     * Create an instance of {@link SmartEnergyManagementPsPowerSequenceElementsType.Description }
     * 
     */
    public SmartEnergyManagementPsPowerSequenceElementsType.Description createSmartEnergyManagementPsPowerSequenceElementsTypeDescription() {
        return new SmartEnergyManagementPsPowerSequenceElementsType.Description();
    }

    /**
     * Create an instance of {@link SmartEnergyManagementPsPowerSequenceElementsType.State }
     * 
     */
    public SmartEnergyManagementPsPowerSequenceElementsType.State createSmartEnergyManagementPsPowerSequenceElementsTypeState() {
        return new SmartEnergyManagementPsPowerSequenceElementsType.State();
    }

    /**
     * Create an instance of {@link SmartEnergyManagementPsPowerSequenceElementsType.Schedule }
     * 
     */
    public SmartEnergyManagementPsPowerSequenceElementsType.Schedule createSmartEnergyManagementPsPowerSequenceElementsTypeSchedule() {
        return new SmartEnergyManagementPsPowerSequenceElementsType.Schedule();
    }

    /**
     * Create an instance of {@link SmartEnergyManagementPsPowerSequenceElementsType.ScheduleConstraints }
     * 
     */
    public SmartEnergyManagementPsPowerSequenceElementsType.ScheduleConstraints createSmartEnergyManagementPsPowerSequenceElementsTypeScheduleConstraints() {
        return new SmartEnergyManagementPsPowerSequenceElementsType.ScheduleConstraints();
    }

    /**
     * Create an instance of {@link SmartEnergyManagementPsPowerSequenceElementsType.SchedulePreference }
     * 
     */
    public SmartEnergyManagementPsPowerSequenceElementsType.SchedulePreference createSmartEnergyManagementPsPowerSequenceElementsTypeSchedulePreference() {
        return new SmartEnergyManagementPsPowerSequenceElementsType.SchedulePreference();
    }

    /**
     * Create an instance of {@link SmartEnergyManagementPsPowerSequenceElementsType.OperatingConstraintsInterrupt }
     * 
     */
    public SmartEnergyManagementPsPowerSequenceElementsType.OperatingConstraintsInterrupt createSmartEnergyManagementPsPowerSequenceElementsTypeOperatingConstraintsInterrupt() {
        return new SmartEnergyManagementPsPowerSequenceElementsType.OperatingConstraintsInterrupt();
    }

    /**
     * Create an instance of {@link SmartEnergyManagementPsPowerSequenceElementsType.OperatingConstraintsDuration }
     * 
     */
    public SmartEnergyManagementPsPowerSequenceElementsType.OperatingConstraintsDuration createSmartEnergyManagementPsPowerSequenceElementsTypeOperatingConstraintsDuration() {
        return new SmartEnergyManagementPsPowerSequenceElementsType.OperatingConstraintsDuration();
    }

    /**
     * Create an instance of {@link SmartEnergyManagementPsPowerSequenceElementsType.OperatingConstraintsResumeImplication }
     * 
     */
    public SmartEnergyManagementPsPowerSequenceElementsType.OperatingConstraintsResumeImplication createSmartEnergyManagementPsPowerSequenceElementsTypeOperatingConstraintsResumeImplication() {
        return new SmartEnergyManagementPsPowerSequenceElementsType.OperatingConstraintsResumeImplication();
    }

    /**
     * Create an instance of {@link SmartEnergyManagementPsPowerTimeSlotValueListType.Value }
     * 
     */
    public SmartEnergyManagementPsPowerTimeSlotValueListType.Value createSmartEnergyManagementPsPowerTimeSlotValueListTypeValue() {
        return new SmartEnergyManagementPsPowerTimeSlotValueListType.Value();
    }

    /**
     * Create an instance of {@link SmartEnergyManagementPsPowerTimeSlotType.Schedule }
     * 
     */
    public SmartEnergyManagementPsPowerTimeSlotType.Schedule createSmartEnergyManagementPsPowerTimeSlotTypeSchedule() {
        return new SmartEnergyManagementPsPowerTimeSlotType.Schedule();
    }

    /**
     * Create an instance of {@link SmartEnergyManagementPsPowerTimeSlotType.ScheduleConstraints }
     * 
     */
    public SmartEnergyManagementPsPowerTimeSlotType.ScheduleConstraints createSmartEnergyManagementPsPowerTimeSlotTypeScheduleConstraints() {
        return new SmartEnergyManagementPsPowerTimeSlotType.ScheduleConstraints();
    }

    /**
     * Create an instance of {@link SmartEnergyManagementPsPowerSequenceType.Description }
     * 
     */
    public SmartEnergyManagementPsPowerSequenceType.Description createSmartEnergyManagementPsPowerSequenceTypeDescription() {
        return new SmartEnergyManagementPsPowerSequenceType.Description();
    }

    /**
     * Create an instance of {@link SmartEnergyManagementPsPowerSequenceType.State }
     * 
     */
    public SmartEnergyManagementPsPowerSequenceType.State createSmartEnergyManagementPsPowerSequenceTypeState() {
        return new SmartEnergyManagementPsPowerSequenceType.State();
    }

    /**
     * Create an instance of {@link SmartEnergyManagementPsPowerSequenceType.Schedule }
     * 
     */
    public SmartEnergyManagementPsPowerSequenceType.Schedule createSmartEnergyManagementPsPowerSequenceTypeSchedule() {
        return new SmartEnergyManagementPsPowerSequenceType.Schedule();
    }

    /**
     * Create an instance of {@link SmartEnergyManagementPsPowerSequenceType.ScheduleConstraints }
     * 
     */
    public SmartEnergyManagementPsPowerSequenceType.ScheduleConstraints createSmartEnergyManagementPsPowerSequenceTypeScheduleConstraints() {
        return new SmartEnergyManagementPsPowerSequenceType.ScheduleConstraints();
    }

    /**
     * Create an instance of {@link SmartEnergyManagementPsPowerSequenceType.SchedulePreference }
     * 
     */
    public SmartEnergyManagementPsPowerSequenceType.SchedulePreference createSmartEnergyManagementPsPowerSequenceTypeSchedulePreference() {
        return new SmartEnergyManagementPsPowerSequenceType.SchedulePreference();
    }

    /**
     * Create an instance of {@link SmartEnergyManagementPsPowerSequenceType.OperatingConstraintsInterrupt }
     * 
     */
    public SmartEnergyManagementPsPowerSequenceType.OperatingConstraintsInterrupt createSmartEnergyManagementPsPowerSequenceTypeOperatingConstraintsInterrupt() {
        return new SmartEnergyManagementPsPowerSequenceType.OperatingConstraintsInterrupt();
    }

    /**
     * Create an instance of {@link SmartEnergyManagementPsPowerSequenceType.OperatingConstraintsDuration }
     * 
     */
    public SmartEnergyManagementPsPowerSequenceType.OperatingConstraintsDuration createSmartEnergyManagementPsPowerSequenceTypeOperatingConstraintsDuration() {
        return new SmartEnergyManagementPsPowerSequenceType.OperatingConstraintsDuration();
    }

    /**
     * Create an instance of {@link SmartEnergyManagementPsPowerSequenceType.OperatingConstraintsResumeImplication }
     * 
     */
    public SmartEnergyManagementPsPowerSequenceType.OperatingConstraintsResumeImplication createSmartEnergyManagementPsPowerSequenceTypeOperatingConstraintsResumeImplication() {
        return new SmartEnergyManagementPsPowerSequenceType.OperatingConstraintsResumeImplication();
    }

    /**
     * Create an instance of {@link NodeManagementDetailedDiscoveryFeatureInformationElementsType.Description }
     * 
     */
    public NodeManagementDetailedDiscoveryFeatureInformationElementsType.Description createNodeManagementDetailedDiscoveryFeatureInformationElementsTypeDescription() {
        return new NodeManagementDetailedDiscoveryFeatureInformationElementsType.Description();
    }

    /**
     * Create an instance of {@link NodeManagementDetailedDiscoveryEntityInformationElementsType.Description }
     * 
     */
    public NodeManagementDetailedDiscoveryEntityInformationElementsType.Description createNodeManagementDetailedDiscoveryEntityInformationElementsTypeDescription() {
        return new NodeManagementDetailedDiscoveryEntityInformationElementsType.Description();
    }

    /**
     * Create an instance of {@link NodeManagementDetailedDiscoveryDeviceInformationElementsType.Description }
     * 
     */
    public NodeManagementDetailedDiscoveryDeviceInformationElementsType.Description createNodeManagementDetailedDiscoveryDeviceInformationElementsTypeDescription() {
        return new NodeManagementDetailedDiscoveryDeviceInformationElementsType.Description();
    }

    /**
     * Create an instance of {@link NodeManagementSpecificationVersionListElementsType.SpecificationVersion }
     * 
     */
    public NodeManagementSpecificationVersionListElementsType.SpecificationVersion createNodeManagementSpecificationVersionListElementsTypeSpecificationVersion() {
        return new NodeManagementSpecificationVersionListElementsType.SpecificationVersion();
    }

    /**
     * Create an instance of {@link NodeManagementDetailedDiscoveryFeatureInformationType.Description }
     * 
     */
    public NodeManagementDetailedDiscoveryFeatureInformationType.Description createNodeManagementDetailedDiscoveryFeatureInformationTypeDescription() {
        return new NodeManagementDetailedDiscoveryFeatureInformationType.Description();
    }

    /**
     * Create an instance of {@link NodeManagementDetailedDiscoveryEntityInformationType.Description }
     * 
     */
    public NodeManagementDetailedDiscoveryEntityInformationType.Description createNodeManagementDetailedDiscoveryEntityInformationTypeDescription() {
        return new NodeManagementDetailedDiscoveryEntityInformationType.Description();
    }

    /**
     * Create an instance of {@link NodeManagementDetailedDiscoveryDeviceInformationType.Description }
     * 
     */
    public NodeManagementDetailedDiscoveryDeviceInformationType.Description createNodeManagementDetailedDiscoveryDeviceInformationTypeDescription() {
        return new NodeManagementDetailedDiscoveryDeviceInformationType.Description();
    }

    /**
     * Create an instance of {@link IncentiveTableConstraintsElementsType.Tariff }
     * 
     */
    public IncentiveTableConstraintsElementsType.Tariff createIncentiveTableConstraintsElementsTypeTariff() {
        return new IncentiveTableConstraintsElementsType.Tariff();
    }

    /**
     * Create an instance of {@link IncentiveTableConstraintsElementsType.TariffConstraints }
     * 
     */
    public IncentiveTableConstraintsElementsType.TariffConstraints createIncentiveTableConstraintsElementsTypeTariffConstraints() {
        return new IncentiveTableConstraintsElementsType.TariffConstraints();
    }

    /**
     * Create an instance of {@link IncentiveTableConstraintsElementsType.IncentiveSlotConstraints }
     * 
     */
    public IncentiveTableConstraintsElementsType.IncentiveSlotConstraints createIncentiveTableConstraintsElementsTypeIncentiveSlotConstraints() {
        return new IncentiveTableConstraintsElementsType.IncentiveSlotConstraints();
    }

    /**
     * Create an instance of {@link IncentiveTableConstraintsType.Tariff }
     * 
     */
    public IncentiveTableConstraintsType.Tariff createIncentiveTableConstraintsTypeTariff() {
        return new IncentiveTableConstraintsType.Tariff();
    }

    /**
     * Create an instance of {@link IncentiveTableConstraintsType.TariffConstraints }
     * 
     */
    public IncentiveTableConstraintsType.TariffConstraints createIncentiveTableConstraintsTypeTariffConstraints() {
        return new IncentiveTableConstraintsType.TariffConstraints();
    }

    /**
     * Create an instance of {@link IncentiveTableConstraintsType.IncentiveSlotConstraints }
     * 
     */
    public IncentiveTableConstraintsType.IncentiveSlotConstraints createIncentiveTableConstraintsTypeIncentiveSlotConstraints() {
        return new IncentiveTableConstraintsType.IncentiveSlotConstraints();
    }

    /**
     * Create an instance of {@link IncentiveTableDescriptionTierElementsType.TierDescription }
     * 
     */
    public IncentiveTableDescriptionTierElementsType.TierDescription createIncentiveTableDescriptionTierElementsTypeTierDescription() {
        return new IncentiveTableDescriptionTierElementsType.TierDescription();
    }

    /**
     * Create an instance of {@link IncentiveTableDescriptionTierElementsType.BoundaryDescription }
     * 
     */
    public IncentiveTableDescriptionTierElementsType.BoundaryDescription createIncentiveTableDescriptionTierElementsTypeBoundaryDescription() {
        return new IncentiveTableDescriptionTierElementsType.BoundaryDescription();
    }

    /**
     * Create an instance of {@link IncentiveTableDescriptionTierElementsType.IncentiveDescription }
     * 
     */
    public IncentiveTableDescriptionTierElementsType.IncentiveDescription createIncentiveTableDescriptionTierElementsTypeIncentiveDescription() {
        return new IncentiveTableDescriptionTierElementsType.IncentiveDescription();
    }

    /**
     * Create an instance of {@link IncentiveTableDescriptionElementsType.TariffDescription }
     * 
     */
    public IncentiveTableDescriptionElementsType.TariffDescription createIncentiveTableDescriptionElementsTypeTariffDescription() {
        return new IncentiveTableDescriptionElementsType.TariffDescription();
    }

    /**
     * Create an instance of {@link IncentiveTableDescriptionTierType.TierDescription }
     * 
     */
    public IncentiveTableDescriptionTierType.TierDescription createIncentiveTableDescriptionTierTypeTierDescription() {
        return new IncentiveTableDescriptionTierType.TierDescription();
    }

    /**
     * Create an instance of {@link IncentiveTableDescriptionTierType.BoundaryDescription }
     * 
     */
    public IncentiveTableDescriptionTierType.BoundaryDescription createIncentiveTableDescriptionTierTypeBoundaryDescription() {
        return new IncentiveTableDescriptionTierType.BoundaryDescription();
    }

    /**
     * Create an instance of {@link IncentiveTableDescriptionTierType.IncentiveDescription }
     * 
     */
    public IncentiveTableDescriptionTierType.IncentiveDescription createIncentiveTableDescriptionTierTypeIncentiveDescription() {
        return new IncentiveTableDescriptionTierType.IncentiveDescription();
    }

    /**
     * Create an instance of {@link IncentiveTableDescriptionType.TariffDescription }
     * 
     */
    public IncentiveTableDescriptionType.TariffDescription createIncentiveTableDescriptionTypeTariffDescription() {
        return new IncentiveTableDescriptionType.TariffDescription();
    }

    /**
     * Create an instance of {@link IncentiveTableTierElementsType.Tier }
     * 
     */
    public IncentiveTableTierElementsType.Tier createIncentiveTableTierElementsTypeTier() {
        return new IncentiveTableTierElementsType.Tier();
    }

    /**
     * Create an instance of {@link IncentiveTableTierElementsType.Boundary }
     * 
     */
    public IncentiveTableTierElementsType.Boundary createIncentiveTableTierElementsTypeBoundary() {
        return new IncentiveTableTierElementsType.Boundary();
    }

    /**
     * Create an instance of {@link IncentiveTableTierElementsType.Incentive }
     * 
     */
    public IncentiveTableTierElementsType.Incentive createIncentiveTableTierElementsTypeIncentive() {
        return new IncentiveTableTierElementsType.Incentive();
    }

    /**
     * Create an instance of {@link IncentiveTableIncentiveSlotElementsType.TimeInterval }
     * 
     */
    public IncentiveTableIncentiveSlotElementsType.TimeInterval createIncentiveTableIncentiveSlotElementsTypeTimeInterval() {
        return new IncentiveTableIncentiveSlotElementsType.TimeInterval();
    }

    /**
     * Create an instance of {@link IncentiveTableElementsType.Tariff }
     * 
     */
    public IncentiveTableElementsType.Tariff createIncentiveTableElementsTypeTariff() {
        return new IncentiveTableElementsType.Tariff();
    }

    /**
     * Create an instance of {@link IncentiveTableTierType.Tier }
     * 
     */
    public IncentiveTableTierType.Tier createIncentiveTableTierTypeTier() {
        return new IncentiveTableTierType.Tier();
    }

    /**
     * Create an instance of {@link IncentiveTableTierType.Boundary }
     * 
     */
    public IncentiveTableTierType.Boundary createIncentiveTableTierTypeBoundary() {
        return new IncentiveTableTierType.Boundary();
    }

    /**
     * Create an instance of {@link IncentiveTableTierType.Incentive }
     * 
     */
    public IncentiveTableTierType.Incentive createIncentiveTableTierTypeIncentive() {
        return new IncentiveTableTierType.Incentive();
    }

    /**
     * Create an instance of {@link IncentiveTableIncentiveSlotType.TimeInterval }
     * 
     */
    public IncentiveTableIncentiveSlotType.TimeInterval createIncentiveTableIncentiveSlotTypeTimeInterval() {
        return new IncentiveTableIncentiveSlotType.TimeInterval();
    }

    /**
     * Create an instance of {@link IncentiveTableType.Tariff }
     * 
     */
    public IncentiveTableType.Tariff createIncentiveTableTypeTariff() {
        return new IncentiveTableType.Tariff();
    }

    /**
     * Create an instance of {@link SmartEnergyManagementPsPriceCalculationRequestCallElementsType.PriceCalculationRequest }
     * 
     */
    public SmartEnergyManagementPsPriceCalculationRequestCallElementsType.PriceCalculationRequest createSmartEnergyManagementPsPriceCalculationRequestCallElementsTypePriceCalculationRequest() {
        return new SmartEnergyManagementPsPriceCalculationRequestCallElementsType.PriceCalculationRequest();
    }

    /**
     * Create an instance of {@link SmartEnergyManagementPsPriceCalculationRequestCallType.PriceCalculationRequest }
     * 
     */
    public SmartEnergyManagementPsPriceCalculationRequestCallType.PriceCalculationRequest createSmartEnergyManagementPsPriceCalculationRequestCallTypePriceCalculationRequest() {
        return new SmartEnergyManagementPsPriceCalculationRequestCallType.PriceCalculationRequest();
    }

    /**
     * Create an instance of {@link SmartEnergyManagementPsConfigurationRequestCallElementsType.ScheduleConfigurationRequest }
     * 
     */
    public SmartEnergyManagementPsConfigurationRequestCallElementsType.ScheduleConfigurationRequest createSmartEnergyManagementPsConfigurationRequestCallElementsTypeScheduleConfigurationRequest() {
        return new SmartEnergyManagementPsConfigurationRequestCallElementsType.ScheduleConfigurationRequest();
    }

    /**
     * Create an instance of {@link SmartEnergyManagementPsConfigurationRequestCallType.ScheduleConfigurationRequest }
     * 
     */
    public SmartEnergyManagementPsConfigurationRequestCallType.ScheduleConfigurationRequest createSmartEnergyManagementPsConfigurationRequestCallTypeScheduleConfigurationRequest() {
        return new SmartEnergyManagementPsConfigurationRequestCallType.ScheduleConfigurationRequest();
    }

    /**
     * Create an instance of {@link SmartEnergyManagementPsPriceDataSelectorsType.Price }
     * 
     */
    public SmartEnergyManagementPsPriceDataSelectorsType.Price createSmartEnergyManagementPsPriceDataSelectorsTypePrice() {
        return new SmartEnergyManagementPsPriceDataSelectorsType.Price();
    }

    /**
     * Create an instance of {@link SmartEnergyManagementPsPriceDataElementsType.Price }
     * 
     */
    public SmartEnergyManagementPsPriceDataElementsType.Price createSmartEnergyManagementPsPriceDataElementsTypePrice() {
        return new SmartEnergyManagementPsPriceDataElementsType.Price();
    }

    /**
     * Create an instance of {@link SmartEnergyManagementPsPriceDataType.Price }
     * 
     */
    public SmartEnergyManagementPsPriceDataType.Price createSmartEnergyManagementPsPriceDataTypePrice() {
        return new SmartEnergyManagementPsPriceDataType.Price();
    }

    /**
     * Create an instance of {@link SmartEnergyManagementPsDataSelectorsType.AlternativesRelation }
     * 
     */
    public SmartEnergyManagementPsDataSelectorsType.AlternativesRelation createSmartEnergyManagementPsDataSelectorsTypeAlternativesRelation() {
        return new SmartEnergyManagementPsDataSelectorsType.AlternativesRelation();
    }

    /**
     * Create an instance of {@link SmartEnergyManagementPsDataSelectorsType.PowerSequenceDescription }
     * 
     */
    public SmartEnergyManagementPsDataSelectorsType.PowerSequenceDescription createSmartEnergyManagementPsDataSelectorsTypePowerSequenceDescription() {
        return new SmartEnergyManagementPsDataSelectorsType.PowerSequenceDescription();
    }

    /**
     * Create an instance of {@link SmartEnergyManagementPsDataSelectorsType.PowerTimeSlotSchedule }
     * 
     */
    public SmartEnergyManagementPsDataSelectorsType.PowerTimeSlotSchedule createSmartEnergyManagementPsDataSelectorsTypePowerTimeSlotSchedule() {
        return new SmartEnergyManagementPsDataSelectorsType.PowerTimeSlotSchedule();
    }

    /**
     * Create an instance of {@link SmartEnergyManagementPsDataSelectorsType.PowerTimeSlotValue }
     * 
     */
    public SmartEnergyManagementPsDataSelectorsType.PowerTimeSlotValue createSmartEnergyManagementPsDataSelectorsTypePowerTimeSlotValue() {
        return new SmartEnergyManagementPsDataSelectorsType.PowerTimeSlotValue();
    }

    /**
     * Create an instance of {@link SmartEnergyManagementPsDataElementsType.NodeScheduleInformation }
     * 
     */
    public SmartEnergyManagementPsDataElementsType.NodeScheduleInformation createSmartEnergyManagementPsDataElementsTypeNodeScheduleInformation() {
        return new SmartEnergyManagementPsDataElementsType.NodeScheduleInformation();
    }

    /**
     * Create an instance of {@link SmartEnergyManagementPsDataType.NodeScheduleInformation }
     * 
     */
    public SmartEnergyManagementPsDataType.NodeScheduleInformation createSmartEnergyManagementPsDataTypeNodeScheduleInformation() {
        return new SmartEnergyManagementPsDataType.NodeScheduleInformation();
    }

    /**
     * Create an instance of {@link NodeManagementUseCaseDataSelectorsType.UseCaseInformation }
     * 
     */
    public NodeManagementUseCaseDataSelectorsType.UseCaseInformation createNodeManagementUseCaseDataSelectorsTypeUseCaseInformation() {
        return new NodeManagementUseCaseDataSelectorsType.UseCaseInformation();
    }

    /**
     * Create an instance of {@link NodeManagementUseCaseDataElementsType.UseCaseInformation }
     * 
     */
    public NodeManagementUseCaseDataElementsType.UseCaseInformation createNodeManagementUseCaseDataElementsTypeUseCaseInformation() {
        return new NodeManagementUseCaseDataElementsType.UseCaseInformation();
    }

    /**
     * Create an instance of {@link NodeManagementUseCaseDataType.UseCaseInformation }
     * 
     */
    public NodeManagementUseCaseDataType.UseCaseInformation createNodeManagementUseCaseDataTypeUseCaseInformation() {
        return new NodeManagementUseCaseDataType.UseCaseInformation();
    }

    /**
     * Create an instance of {@link NodeManagementDestinationListDataSelectorsType.DeviceDescription }
     * 
     */
    public NodeManagementDestinationListDataSelectorsType.DeviceDescription createNodeManagementDestinationListDataSelectorsTypeDeviceDescription() {
        return new NodeManagementDestinationListDataSelectorsType.DeviceDescription();
    }

    /**
     * Create an instance of {@link NodeManagementDestinationDataElementsType.DeviceDescription }
     * 
     */
    public NodeManagementDestinationDataElementsType.DeviceDescription createNodeManagementDestinationDataElementsTypeDeviceDescription() {
        return new NodeManagementDestinationDataElementsType.DeviceDescription();
    }

    /**
     * Create an instance of {@link NodeManagementDestinationDataType.DeviceDescription }
     * 
     */
    public NodeManagementDestinationDataType.DeviceDescription createNodeManagementDestinationDataTypeDeviceDescription() {
        return new NodeManagementDestinationDataType.DeviceDescription();
    }

    /**
     * Create an instance of {@link NodeManagementSubscriptionDeleteCallElementsType.SubscriptionDelete }
     * 
     */
    public NodeManagementSubscriptionDeleteCallElementsType.SubscriptionDelete createNodeManagementSubscriptionDeleteCallElementsTypeSubscriptionDelete() {
        return new NodeManagementSubscriptionDeleteCallElementsType.SubscriptionDelete();
    }

    /**
     * Create an instance of {@link NodeManagementSubscriptionDeleteCallType.SubscriptionDelete }
     * 
     */
    public NodeManagementSubscriptionDeleteCallType.SubscriptionDelete createNodeManagementSubscriptionDeleteCallTypeSubscriptionDelete() {
        return new NodeManagementSubscriptionDeleteCallType.SubscriptionDelete();
    }

    /**
     * Create an instance of {@link NodeManagementSubscriptionRequestCallElementsType.SubscriptionRequest }
     * 
     */
    public NodeManagementSubscriptionRequestCallElementsType.SubscriptionRequest createNodeManagementSubscriptionRequestCallElementsTypeSubscriptionRequest() {
        return new NodeManagementSubscriptionRequestCallElementsType.SubscriptionRequest();
    }

    /**
     * Create an instance of {@link NodeManagementSubscriptionRequestCallType.SubscriptionRequest }
     * 
     */
    public NodeManagementSubscriptionRequestCallType.SubscriptionRequest createNodeManagementSubscriptionRequestCallTypeSubscriptionRequest() {
        return new NodeManagementSubscriptionRequestCallType.SubscriptionRequest();
    }

    /**
     * Create an instance of {@link NodeManagementSubscriptionDataSelectorsType.SubscriptionEntry }
     * 
     */
    public NodeManagementSubscriptionDataSelectorsType.SubscriptionEntry createNodeManagementSubscriptionDataSelectorsTypeSubscriptionEntry() {
        return new NodeManagementSubscriptionDataSelectorsType.SubscriptionEntry();
    }

    /**
     * Create an instance of {@link NodeManagementSubscriptionDataElementsType.SubscriptionEntry }
     * 
     */
    public NodeManagementSubscriptionDataElementsType.SubscriptionEntry createNodeManagementSubscriptionDataElementsTypeSubscriptionEntry() {
        return new NodeManagementSubscriptionDataElementsType.SubscriptionEntry();
    }

    /**
     * Create an instance of {@link NodeManagementSubscriptionDataType.SubscriptionEntry }
     * 
     */
    public NodeManagementSubscriptionDataType.SubscriptionEntry createNodeManagementSubscriptionDataTypeSubscriptionEntry() {
        return new NodeManagementSubscriptionDataType.SubscriptionEntry();
    }

    /**
     * Create an instance of {@link NodeManagementBindingDeleteCallElementsType.BindingDelete }
     * 
     */
    public NodeManagementBindingDeleteCallElementsType.BindingDelete createNodeManagementBindingDeleteCallElementsTypeBindingDelete() {
        return new NodeManagementBindingDeleteCallElementsType.BindingDelete();
    }

    /**
     * Create an instance of {@link NodeManagementBindingDeleteCallType.BindingDelete }
     * 
     */
    public NodeManagementBindingDeleteCallType.BindingDelete createNodeManagementBindingDeleteCallTypeBindingDelete() {
        return new NodeManagementBindingDeleteCallType.BindingDelete();
    }

    /**
     * Create an instance of {@link NodeManagementBindingRequestCallElementsType.BindingRequest }
     * 
     */
    public NodeManagementBindingRequestCallElementsType.BindingRequest createNodeManagementBindingRequestCallElementsTypeBindingRequest() {
        return new NodeManagementBindingRequestCallElementsType.BindingRequest();
    }

    /**
     * Create an instance of {@link NodeManagementBindingRequestCallType.BindingRequest }
     * 
     */
    public NodeManagementBindingRequestCallType.BindingRequest createNodeManagementBindingRequestCallTypeBindingRequest() {
        return new NodeManagementBindingRequestCallType.BindingRequest();
    }

    /**
     * Create an instance of {@link NodeManagementBindingDataSelectorsType.BindingEntry }
     * 
     */
    public NodeManagementBindingDataSelectorsType.BindingEntry createNodeManagementBindingDataSelectorsTypeBindingEntry() {
        return new NodeManagementBindingDataSelectorsType.BindingEntry();
    }

    /**
     * Create an instance of {@link NodeManagementBindingDataElementsType.BindingEntry }
     * 
     */
    public NodeManagementBindingDataElementsType.BindingEntry createNodeManagementBindingDataElementsTypeBindingEntry() {
        return new NodeManagementBindingDataElementsType.BindingEntry();
    }

    /**
     * Create an instance of {@link NodeManagementBindingDataType.BindingEntry }
     * 
     */
    public NodeManagementBindingDataType.BindingEntry createNodeManagementBindingDataTypeBindingEntry() {
        return new NodeManagementBindingDataType.BindingEntry();
    }

    /**
     * Create an instance of {@link NodeManagementDetailedDiscoveryDataSelectorsType.DeviceInformation }
     * 
     */
    public NodeManagementDetailedDiscoveryDataSelectorsType.DeviceInformation createNodeManagementDetailedDiscoveryDataSelectorsTypeDeviceInformation() {
        return new NodeManagementDetailedDiscoveryDataSelectorsType.DeviceInformation();
    }

    /**
     * Create an instance of {@link NodeManagementDetailedDiscoveryDataSelectorsType.EntityInformation }
     * 
     */
    public NodeManagementDetailedDiscoveryDataSelectorsType.EntityInformation createNodeManagementDetailedDiscoveryDataSelectorsTypeEntityInformation() {
        return new NodeManagementDetailedDiscoveryDataSelectorsType.EntityInformation();
    }

    /**
     * Create an instance of {@link NodeManagementDetailedDiscoveryDataSelectorsType.FeatureInformation }
     * 
     */
    public NodeManagementDetailedDiscoveryDataSelectorsType.FeatureInformation createNodeManagementDetailedDiscoveryDataSelectorsTypeFeatureInformation() {
        return new NodeManagementDetailedDiscoveryDataSelectorsType.FeatureInformation();
    }

    /**
     * Create an instance of {@link IncentiveTableConstraintsDataSelectorsType.Tariff }
     * 
     */
    public IncentiveTableConstraintsDataSelectorsType.Tariff createIncentiveTableConstraintsDataSelectorsTypeTariff() {
        return new IncentiveTableConstraintsDataSelectorsType.Tariff();
    }

    /**
     * Create an instance of {@link IncentiveTableDescriptionDataSelectorsType.TariffDescription }
     * 
     */
    public IncentiveTableDescriptionDataSelectorsType.TariffDescription createIncentiveTableDescriptionDataSelectorsTypeTariffDescription() {
        return new IncentiveTableDescriptionDataSelectorsType.TariffDescription();
    }

    /**
     * Create an instance of {@link IncentiveTableDataSelectorsType.Tariff }
     * 
     */
    public IncentiveTableDataSelectorsType.Tariff createIncentiveTableDataSelectorsTypeTariff() {
        return new IncentiveTableDataSelectorsType.Tariff();
    }

    /**
     * Create an instance of {@link BillDataElementsType.Total }
     * 
     */
    public BillDataElementsType.Total createBillDataElementsTypeTotal() {
        return new BillDataElementsType.Total();
    }

    /**
     * Create an instance of {@link BillDataElementsType.Position }
     * 
     */
    public BillDataElementsType.Position createBillDataElementsTypePosition() {
        return new BillDataElementsType.Position();
    }

    /**
     * Create an instance of {@link BillDataType.Total }
     * 
     */
    public BillDataType.Total createBillDataTypeTotal() {
        return new BillDataType.Total();
    }

    /**
     * Create an instance of {@link BillDataType.Position }
     * 
     */
    public BillDataType.Position createBillDataTypePosition() {
        return new BillDataType.Position();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "device")
    public JAXBElement<String> createDevice(String value) {
        return new JAXBElement<String>(_Device_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "entity")
    public JAXBElement<Long> createEntity(Long value) {
        return new JAXBElement<Long>(_Entity_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "feature")
    public JAXBElement<Long> createFeature(Long value) {
        return new JAXBElement<Long>(_Feature_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ThresholdDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ThresholdDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "thresholdData")
    public JAXBElement<ThresholdDataType> createThresholdData(ThresholdDataType value) {
        return new JAXBElement<ThresholdDataType>(_ThresholdData_QNAME, ThresholdDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ThresholdDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ThresholdDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "thresholdDataElements")
    public JAXBElement<ThresholdDataElementsType> createThresholdDataElements(ThresholdDataElementsType value) {
        return new JAXBElement<ThresholdDataElementsType>(_ThresholdDataElements_QNAME, ThresholdDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ThresholdListDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ThresholdListDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "thresholdListData")
    public JAXBElement<ThresholdListDataType> createThresholdListData(ThresholdListDataType value) {
        return new JAXBElement<ThresholdListDataType>(_ThresholdListData_QNAME, ThresholdListDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ThresholdListDataSelectorsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ThresholdListDataSelectorsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "thresholdListDataSelectors")
    public JAXBElement<ThresholdListDataSelectorsType> createThresholdListDataSelectors(ThresholdListDataSelectorsType value) {
        return new JAXBElement<ThresholdListDataSelectorsType>(_ThresholdListDataSelectors_QNAME, ThresholdListDataSelectorsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ThresholdConstraintsDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ThresholdConstraintsDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "thresholdConstraintsData")
    public JAXBElement<ThresholdConstraintsDataType> createThresholdConstraintsData(ThresholdConstraintsDataType value) {
        return new JAXBElement<ThresholdConstraintsDataType>(_ThresholdConstraintsData_QNAME, ThresholdConstraintsDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ThresholdConstraintsDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ThresholdConstraintsDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "thresholdConstraintsDataElements")
    public JAXBElement<ThresholdConstraintsDataElementsType> createThresholdConstraintsDataElements(ThresholdConstraintsDataElementsType value) {
        return new JAXBElement<ThresholdConstraintsDataElementsType>(_ThresholdConstraintsDataElements_QNAME, ThresholdConstraintsDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ThresholdConstraintsListDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ThresholdConstraintsListDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "thresholdConstraintsListData")
    public JAXBElement<ThresholdConstraintsListDataType> createThresholdConstraintsListData(ThresholdConstraintsListDataType value) {
        return new JAXBElement<ThresholdConstraintsListDataType>(_ThresholdConstraintsListData_QNAME, ThresholdConstraintsListDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ThresholdConstraintsListDataSelectorsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ThresholdConstraintsListDataSelectorsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "thresholdConstraintsListDataSelectors")
    public JAXBElement<ThresholdConstraintsListDataSelectorsType> createThresholdConstraintsListDataSelectors(ThresholdConstraintsListDataSelectorsType value) {
        return new JAXBElement<ThresholdConstraintsListDataSelectorsType>(_ThresholdConstraintsListDataSelectors_QNAME, ThresholdConstraintsListDataSelectorsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ThresholdDescriptionDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ThresholdDescriptionDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "thresholdDescriptionData")
    public JAXBElement<ThresholdDescriptionDataType> createThresholdDescriptionData(ThresholdDescriptionDataType value) {
        return new JAXBElement<ThresholdDescriptionDataType>(_ThresholdDescriptionData_QNAME, ThresholdDescriptionDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ThresholdDescriptionDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ThresholdDescriptionDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "thresholdDescriptionDataElements")
    public JAXBElement<ThresholdDescriptionDataElementsType> createThresholdDescriptionDataElements(ThresholdDescriptionDataElementsType value) {
        return new JAXBElement<ThresholdDescriptionDataElementsType>(_ThresholdDescriptionDataElements_QNAME, ThresholdDescriptionDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ThresholdDescriptionListDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ThresholdDescriptionListDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "thresholdDescriptionListData")
    public JAXBElement<ThresholdDescriptionListDataType> createThresholdDescriptionListData(ThresholdDescriptionListDataType value) {
        return new JAXBElement<ThresholdDescriptionListDataType>(_ThresholdDescriptionListData_QNAME, ThresholdDescriptionListDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ThresholdDescriptionListDataSelectorsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ThresholdDescriptionListDataSelectorsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "thresholdDescriptionListDataSelectors")
    public JAXBElement<ThresholdDescriptionListDataSelectorsType> createThresholdDescriptionListDataSelectors(ThresholdDescriptionListDataSelectorsType value) {
        return new JAXBElement<ThresholdDescriptionListDataSelectorsType>(_ThresholdDescriptionListDataSelectors_QNAME, ThresholdDescriptionListDataSelectorsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeasurementDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MeasurementDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "measurementData")
    public JAXBElement<MeasurementDataType> createMeasurementData(MeasurementDataType value) {
        return new JAXBElement<MeasurementDataType>(_MeasurementData_QNAME, MeasurementDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeasurementDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MeasurementDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "measurementDataElements")
    public JAXBElement<MeasurementDataElementsType> createMeasurementDataElements(MeasurementDataElementsType value) {
        return new JAXBElement<MeasurementDataElementsType>(_MeasurementDataElements_QNAME, MeasurementDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeasurementListDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MeasurementListDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "measurementListData")
    public JAXBElement<MeasurementListDataType> createMeasurementListData(MeasurementListDataType value) {
        return new JAXBElement<MeasurementListDataType>(_MeasurementListData_QNAME, MeasurementListDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeasurementListDataSelectorsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MeasurementListDataSelectorsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "measurementListDataSelectors")
    public JAXBElement<MeasurementListDataSelectorsType> createMeasurementListDataSelectors(MeasurementListDataSelectorsType value) {
        return new JAXBElement<MeasurementListDataSelectorsType>(_MeasurementListDataSelectors_QNAME, MeasurementListDataSelectorsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeasurementSeriesDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MeasurementSeriesDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "measurementSeriesData")
    public JAXBElement<MeasurementSeriesDataType> createMeasurementSeriesData(MeasurementSeriesDataType value) {
        return new JAXBElement<MeasurementSeriesDataType>(_MeasurementSeriesData_QNAME, MeasurementSeriesDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeasurementSeriesDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MeasurementSeriesDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "measurementSeriesDataElements")
    public JAXBElement<MeasurementSeriesDataElementsType> createMeasurementSeriesDataElements(MeasurementSeriesDataElementsType value) {
        return new JAXBElement<MeasurementSeriesDataElementsType>(_MeasurementSeriesDataElements_QNAME, MeasurementSeriesDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeasurementSeriesListDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MeasurementSeriesListDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "measurementSeriesListData")
    public JAXBElement<MeasurementSeriesListDataType> createMeasurementSeriesListData(MeasurementSeriesListDataType value) {
        return new JAXBElement<MeasurementSeriesListDataType>(_MeasurementSeriesListData_QNAME, MeasurementSeriesListDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeasurementSeriesListDataSelectorsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MeasurementSeriesListDataSelectorsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "measurementSeriesListDataSelectors")
    public JAXBElement<MeasurementSeriesListDataSelectorsType> createMeasurementSeriesListDataSelectors(MeasurementSeriesListDataSelectorsType value) {
        return new JAXBElement<MeasurementSeriesListDataSelectorsType>(_MeasurementSeriesListDataSelectors_QNAME, MeasurementSeriesListDataSelectorsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeasurementConstraintsDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MeasurementConstraintsDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "measurementConstraintsData")
    public JAXBElement<MeasurementConstraintsDataType> createMeasurementConstraintsData(MeasurementConstraintsDataType value) {
        return new JAXBElement<MeasurementConstraintsDataType>(_MeasurementConstraintsData_QNAME, MeasurementConstraintsDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeasurementConstraintsDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MeasurementConstraintsDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "measurementConstraintsDataElements")
    public JAXBElement<MeasurementConstraintsDataElementsType> createMeasurementConstraintsDataElements(MeasurementConstraintsDataElementsType value) {
        return new JAXBElement<MeasurementConstraintsDataElementsType>(_MeasurementConstraintsDataElements_QNAME, MeasurementConstraintsDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeasurementConstraintsListDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MeasurementConstraintsListDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "measurementConstraintsListData")
    public JAXBElement<MeasurementConstraintsListDataType> createMeasurementConstraintsListData(MeasurementConstraintsListDataType value) {
        return new JAXBElement<MeasurementConstraintsListDataType>(_MeasurementConstraintsListData_QNAME, MeasurementConstraintsListDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeasurementConstraintsListDataSelectorsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MeasurementConstraintsListDataSelectorsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "measurementConstraintsListDataSelectors")
    public JAXBElement<MeasurementConstraintsListDataSelectorsType> createMeasurementConstraintsListDataSelectors(MeasurementConstraintsListDataSelectorsType value) {
        return new JAXBElement<MeasurementConstraintsListDataSelectorsType>(_MeasurementConstraintsListDataSelectors_QNAME, MeasurementConstraintsListDataSelectorsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeasurementDescriptionDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MeasurementDescriptionDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "measurementDescriptionData")
    public JAXBElement<MeasurementDescriptionDataType> createMeasurementDescriptionData(MeasurementDescriptionDataType value) {
        return new JAXBElement<MeasurementDescriptionDataType>(_MeasurementDescriptionData_QNAME, MeasurementDescriptionDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeasurementDescriptionDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MeasurementDescriptionDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "measurementDescriptionDataElements")
    public JAXBElement<MeasurementDescriptionDataElementsType> createMeasurementDescriptionDataElements(MeasurementDescriptionDataElementsType value) {
        return new JAXBElement<MeasurementDescriptionDataElementsType>(_MeasurementDescriptionDataElements_QNAME, MeasurementDescriptionDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeasurementDescriptionListDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MeasurementDescriptionListDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "measurementDescriptionListData")
    public JAXBElement<MeasurementDescriptionListDataType> createMeasurementDescriptionListData(MeasurementDescriptionListDataType value) {
        return new JAXBElement<MeasurementDescriptionListDataType>(_MeasurementDescriptionListData_QNAME, MeasurementDescriptionListDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeasurementDescriptionListDataSelectorsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MeasurementDescriptionListDataSelectorsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "measurementDescriptionListDataSelectors")
    public JAXBElement<MeasurementDescriptionListDataSelectorsType> createMeasurementDescriptionListDataSelectors(MeasurementDescriptionListDataSelectorsType value) {
        return new JAXBElement<MeasurementDescriptionListDataSelectorsType>(_MeasurementDescriptionListDataSelectors_QNAME, MeasurementDescriptionListDataSelectorsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeasurementThresholdRelationDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MeasurementThresholdRelationDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "measurementThresholdRelationData")
    public JAXBElement<MeasurementThresholdRelationDataType> createMeasurementThresholdRelationData(MeasurementThresholdRelationDataType value) {
        return new JAXBElement<MeasurementThresholdRelationDataType>(_MeasurementThresholdRelationData_QNAME, MeasurementThresholdRelationDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeasurementThresholdRelationDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MeasurementThresholdRelationDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "measurementThresholdRelationDataElements")
    public JAXBElement<MeasurementThresholdRelationDataElementsType> createMeasurementThresholdRelationDataElements(MeasurementThresholdRelationDataElementsType value) {
        return new JAXBElement<MeasurementThresholdRelationDataElementsType>(_MeasurementThresholdRelationDataElements_QNAME, MeasurementThresholdRelationDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeasurementThresholdRelationListDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MeasurementThresholdRelationListDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "measurementThresholdRelationListData")
    public JAXBElement<MeasurementThresholdRelationListDataType> createMeasurementThresholdRelationListData(MeasurementThresholdRelationListDataType value) {
        return new JAXBElement<MeasurementThresholdRelationListDataType>(_MeasurementThresholdRelationListData_QNAME, MeasurementThresholdRelationListDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeasurementThresholdRelationListDataSelectorsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MeasurementThresholdRelationListDataSelectorsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "measurementThresholdRelationListDataSelectors")
    public JAXBElement<MeasurementThresholdRelationListDataSelectorsType> createMeasurementThresholdRelationListDataSelectors(MeasurementThresholdRelationListDataSelectorsType value) {
        return new JAXBElement<MeasurementThresholdRelationListDataSelectorsType>(_MeasurementThresholdRelationListDataSelectors_QNAME, MeasurementThresholdRelationListDataSelectorsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeSeriesDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TimeSeriesDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "timeSeriesData")
    public JAXBElement<TimeSeriesDataType> createTimeSeriesData(TimeSeriesDataType value) {
        return new JAXBElement<TimeSeriesDataType>(_TimeSeriesData_QNAME, TimeSeriesDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeSeriesDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TimeSeriesDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "timeSeriesDataElements")
    public JAXBElement<TimeSeriesDataElementsType> createTimeSeriesDataElements(TimeSeriesDataElementsType value) {
        return new JAXBElement<TimeSeriesDataElementsType>(_TimeSeriesDataElements_QNAME, TimeSeriesDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeSeriesListDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TimeSeriesListDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "timeSeriesListData")
    public JAXBElement<TimeSeriesListDataType> createTimeSeriesListData(TimeSeriesListDataType value) {
        return new JAXBElement<TimeSeriesListDataType>(_TimeSeriesListData_QNAME, TimeSeriesListDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeSeriesListDataSelectorsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TimeSeriesListDataSelectorsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "timeSeriesListDataSelectors")
    public JAXBElement<TimeSeriesListDataSelectorsType> createTimeSeriesListDataSelectors(TimeSeriesListDataSelectorsType value) {
        return new JAXBElement<TimeSeriesListDataSelectorsType>(_TimeSeriesListDataSelectors_QNAME, TimeSeriesListDataSelectorsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeSeriesDescriptionDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TimeSeriesDescriptionDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "timeSeriesDescriptionData")
    public JAXBElement<TimeSeriesDescriptionDataType> createTimeSeriesDescriptionData(TimeSeriesDescriptionDataType value) {
        return new JAXBElement<TimeSeriesDescriptionDataType>(_TimeSeriesDescriptionData_QNAME, TimeSeriesDescriptionDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeSeriesDescriptionDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TimeSeriesDescriptionDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "timeSeriesDescriptionDataElements")
    public JAXBElement<TimeSeriesDescriptionDataElementsType> createTimeSeriesDescriptionDataElements(TimeSeriesDescriptionDataElementsType value) {
        return new JAXBElement<TimeSeriesDescriptionDataElementsType>(_TimeSeriesDescriptionDataElements_QNAME, TimeSeriesDescriptionDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeSeriesDescriptionListDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TimeSeriesDescriptionListDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "timeSeriesDescriptionListData")
    public JAXBElement<TimeSeriesDescriptionListDataType> createTimeSeriesDescriptionListData(TimeSeriesDescriptionListDataType value) {
        return new JAXBElement<TimeSeriesDescriptionListDataType>(_TimeSeriesDescriptionListData_QNAME, TimeSeriesDescriptionListDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeSeriesDescriptionListDataSelectorsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TimeSeriesDescriptionListDataSelectorsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "timeSeriesDescriptionListDataSelectors")
    public JAXBElement<TimeSeriesDescriptionListDataSelectorsType> createTimeSeriesDescriptionListDataSelectors(TimeSeriesDescriptionListDataSelectorsType value) {
        return new JAXBElement<TimeSeriesDescriptionListDataSelectorsType>(_TimeSeriesDescriptionListDataSelectors_QNAME, TimeSeriesDescriptionListDataSelectorsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeSeriesConstraintsDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TimeSeriesConstraintsDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "timeSeriesConstraintsData")
    public JAXBElement<TimeSeriesConstraintsDataType> createTimeSeriesConstraintsData(TimeSeriesConstraintsDataType value) {
        return new JAXBElement<TimeSeriesConstraintsDataType>(_TimeSeriesConstraintsData_QNAME, TimeSeriesConstraintsDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeSeriesConstraintsDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TimeSeriesConstraintsDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "timeSeriesConstraintsDataElements")
    public JAXBElement<TimeSeriesConstraintsDataElementsType> createTimeSeriesConstraintsDataElements(TimeSeriesConstraintsDataElementsType value) {
        return new JAXBElement<TimeSeriesConstraintsDataElementsType>(_TimeSeriesConstraintsDataElements_QNAME, TimeSeriesConstraintsDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeSeriesConstraintsListDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TimeSeriesConstraintsListDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "timeSeriesConstraintsListData")
    public JAXBElement<TimeSeriesConstraintsListDataType> createTimeSeriesConstraintsListData(TimeSeriesConstraintsListDataType value) {
        return new JAXBElement<TimeSeriesConstraintsListDataType>(_TimeSeriesConstraintsListData_QNAME, TimeSeriesConstraintsListDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeSeriesConstraintsListDataSelectorsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TimeSeriesConstraintsListDataSelectorsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "timeSeriesConstraintsListDataSelectors")
    public JAXBElement<TimeSeriesConstraintsListDataSelectorsType> createTimeSeriesConstraintsListDataSelectors(TimeSeriesConstraintsListDataSelectorsType value) {
        return new JAXBElement<TimeSeriesConstraintsListDataSelectorsType>(_TimeSeriesConstraintsListDataSelectors_QNAME, TimeSeriesConstraintsListDataSelectorsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActuatorSwitchDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ActuatorSwitchDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "actuatorSwitchData")
    public JAXBElement<ActuatorSwitchDataType> createActuatorSwitchData(ActuatorSwitchDataType value) {
        return new JAXBElement<ActuatorSwitchDataType>(_ActuatorSwitchData_QNAME, ActuatorSwitchDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActuatorSwitchDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ActuatorSwitchDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "actuatorSwitchDataElements")
    public JAXBElement<ActuatorSwitchDataElementsType> createActuatorSwitchDataElements(ActuatorSwitchDataElementsType value) {
        return new JAXBElement<ActuatorSwitchDataElementsType>(_ActuatorSwitchDataElements_QNAME, ActuatorSwitchDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActuatorSwitchDescriptionDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ActuatorSwitchDescriptionDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "actuatorSwitchDescriptionData")
    public JAXBElement<ActuatorSwitchDescriptionDataType> createActuatorSwitchDescriptionData(ActuatorSwitchDescriptionDataType value) {
        return new JAXBElement<ActuatorSwitchDescriptionDataType>(_ActuatorSwitchDescriptionData_QNAME, ActuatorSwitchDescriptionDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActuatorSwitchDescriptionDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ActuatorSwitchDescriptionDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "actuatorSwitchDescriptionDataElements")
    public JAXBElement<ActuatorSwitchDescriptionDataElementsType> createActuatorSwitchDescriptionDataElements(ActuatorSwitchDescriptionDataElementsType value) {
        return new JAXBElement<ActuatorSwitchDescriptionDataElementsType>(_ActuatorSwitchDescriptionDataElements_QNAME, ActuatorSwitchDescriptionDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeviceConfigurationKeyValueDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeviceConfigurationKeyValueDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "deviceConfigurationKeyValueData")
    public JAXBElement<DeviceConfigurationKeyValueDataType> createDeviceConfigurationKeyValueData(DeviceConfigurationKeyValueDataType value) {
        return new JAXBElement<DeviceConfigurationKeyValueDataType>(_DeviceConfigurationKeyValueData_QNAME, DeviceConfigurationKeyValueDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeviceConfigurationKeyValueDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeviceConfigurationKeyValueDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "deviceConfigurationKeyValueDataElements")
    public JAXBElement<DeviceConfigurationKeyValueDataElementsType> createDeviceConfigurationKeyValueDataElements(DeviceConfigurationKeyValueDataElementsType value) {
        return new JAXBElement<DeviceConfigurationKeyValueDataElementsType>(_DeviceConfigurationKeyValueDataElements_QNAME, DeviceConfigurationKeyValueDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeviceConfigurationKeyValueListDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeviceConfigurationKeyValueListDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "deviceConfigurationKeyValueListData")
    public JAXBElement<DeviceConfigurationKeyValueListDataType> createDeviceConfigurationKeyValueListData(DeviceConfigurationKeyValueListDataType value) {
        return new JAXBElement<DeviceConfigurationKeyValueListDataType>(_DeviceConfigurationKeyValueListData_QNAME, DeviceConfigurationKeyValueListDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeviceConfigurationKeyValueListDataSelectorsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeviceConfigurationKeyValueListDataSelectorsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "deviceConfigurationKeyValueListDataSelectors")
    public JAXBElement<DeviceConfigurationKeyValueListDataSelectorsType> createDeviceConfigurationKeyValueListDataSelectors(DeviceConfigurationKeyValueListDataSelectorsType value) {
        return new JAXBElement<DeviceConfigurationKeyValueListDataSelectorsType>(_DeviceConfigurationKeyValueListDataSelectors_QNAME, DeviceConfigurationKeyValueListDataSelectorsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeviceConfigurationKeyValueDescriptionDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeviceConfigurationKeyValueDescriptionDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "deviceConfigurationKeyValueDescriptionData")
    public JAXBElement<DeviceConfigurationKeyValueDescriptionDataType> createDeviceConfigurationKeyValueDescriptionData(DeviceConfigurationKeyValueDescriptionDataType value) {
        return new JAXBElement<DeviceConfigurationKeyValueDescriptionDataType>(_DeviceConfigurationKeyValueDescriptionData_QNAME, DeviceConfigurationKeyValueDescriptionDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeviceConfigurationKeyValueDescriptionDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeviceConfigurationKeyValueDescriptionDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "deviceConfigurationKeyValueDescriptionDataElements")
    public JAXBElement<DeviceConfigurationKeyValueDescriptionDataElementsType> createDeviceConfigurationKeyValueDescriptionDataElements(DeviceConfigurationKeyValueDescriptionDataElementsType value) {
        return new JAXBElement<DeviceConfigurationKeyValueDescriptionDataElementsType>(_DeviceConfigurationKeyValueDescriptionDataElements_QNAME, DeviceConfigurationKeyValueDescriptionDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeviceConfigurationKeyValueDescriptionListDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeviceConfigurationKeyValueDescriptionListDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "deviceConfigurationKeyValueDescriptionListData")
    public JAXBElement<DeviceConfigurationKeyValueDescriptionListDataType> createDeviceConfigurationKeyValueDescriptionListData(DeviceConfigurationKeyValueDescriptionListDataType value) {
        return new JAXBElement<DeviceConfigurationKeyValueDescriptionListDataType>(_DeviceConfigurationKeyValueDescriptionListData_QNAME, DeviceConfigurationKeyValueDescriptionListDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeviceConfigurationKeyValueDescriptionListDataSelectorsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeviceConfigurationKeyValueDescriptionListDataSelectorsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "deviceConfigurationKeyValueDescriptionListDataSelectors")
    public JAXBElement<DeviceConfigurationKeyValueDescriptionListDataSelectorsType> createDeviceConfigurationKeyValueDescriptionListDataSelectors(DeviceConfigurationKeyValueDescriptionListDataSelectorsType value) {
        return new JAXBElement<DeviceConfigurationKeyValueDescriptionListDataSelectorsType>(_DeviceConfigurationKeyValueDescriptionListDataSelectors_QNAME, DeviceConfigurationKeyValueDescriptionListDataSelectorsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeviceConfigurationKeyValueConstraintsDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeviceConfigurationKeyValueConstraintsDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "deviceConfigurationKeyValueConstraintsData")
    public JAXBElement<DeviceConfigurationKeyValueConstraintsDataType> createDeviceConfigurationKeyValueConstraintsData(DeviceConfigurationKeyValueConstraintsDataType value) {
        return new JAXBElement<DeviceConfigurationKeyValueConstraintsDataType>(_DeviceConfigurationKeyValueConstraintsData_QNAME, DeviceConfigurationKeyValueConstraintsDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeviceConfigurationKeyValueConstraintsDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeviceConfigurationKeyValueConstraintsDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "deviceConfigurationKeyValueConstraintsDataElements")
    public JAXBElement<DeviceConfigurationKeyValueConstraintsDataElementsType> createDeviceConfigurationKeyValueConstraintsDataElements(DeviceConfigurationKeyValueConstraintsDataElementsType value) {
        return new JAXBElement<DeviceConfigurationKeyValueConstraintsDataElementsType>(_DeviceConfigurationKeyValueConstraintsDataElements_QNAME, DeviceConfigurationKeyValueConstraintsDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeviceConfigurationKeyValueConstraintsListDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeviceConfigurationKeyValueConstraintsListDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "deviceConfigurationKeyValueConstraintsListData")
    public JAXBElement<DeviceConfigurationKeyValueConstraintsListDataType> createDeviceConfigurationKeyValueConstraintsListData(DeviceConfigurationKeyValueConstraintsListDataType value) {
        return new JAXBElement<DeviceConfigurationKeyValueConstraintsListDataType>(_DeviceConfigurationKeyValueConstraintsListData_QNAME, DeviceConfigurationKeyValueConstraintsListDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeviceConfigurationKeyValueConstraintsListDataSelectorsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeviceConfigurationKeyValueConstraintsListDataSelectorsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "deviceConfigurationKeyValueConstraintsListDataSelectors")
    public JAXBElement<DeviceConfigurationKeyValueConstraintsListDataSelectorsType> createDeviceConfigurationKeyValueConstraintsListDataSelectors(DeviceConfigurationKeyValueConstraintsListDataSelectorsType value) {
        return new JAXBElement<DeviceConfigurationKeyValueConstraintsListDataSelectorsType>(_DeviceConfigurationKeyValueConstraintsListDataSelectors_QNAME, DeviceConfigurationKeyValueConstraintsListDataSelectorsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PowerTimeSlotScheduleDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PowerTimeSlotScheduleDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "powerTimeSlotScheduleData")
    public JAXBElement<PowerTimeSlotScheduleDataType> createPowerTimeSlotScheduleData(PowerTimeSlotScheduleDataType value) {
        return new JAXBElement<PowerTimeSlotScheduleDataType>(_PowerTimeSlotScheduleData_QNAME, PowerTimeSlotScheduleDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PowerTimeSlotScheduleDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PowerTimeSlotScheduleDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "powerTimeSlotScheduleDataElements")
    public JAXBElement<PowerTimeSlotScheduleDataElementsType> createPowerTimeSlotScheduleDataElements(PowerTimeSlotScheduleDataElementsType value) {
        return new JAXBElement<PowerTimeSlotScheduleDataElementsType>(_PowerTimeSlotScheduleDataElements_QNAME, PowerTimeSlotScheduleDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PowerTimeSlotScheduleListDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PowerTimeSlotScheduleListDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "powerTimeSlotScheduleListData")
    public JAXBElement<PowerTimeSlotScheduleListDataType> createPowerTimeSlotScheduleListData(PowerTimeSlotScheduleListDataType value) {
        return new JAXBElement<PowerTimeSlotScheduleListDataType>(_PowerTimeSlotScheduleListData_QNAME, PowerTimeSlotScheduleListDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PowerTimeSlotScheduleListDataSelectorsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PowerTimeSlotScheduleListDataSelectorsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "powerTimeSlotScheduleListDataSelectors")
    public JAXBElement<PowerTimeSlotScheduleListDataSelectorsType> createPowerTimeSlotScheduleListDataSelectors(PowerTimeSlotScheduleListDataSelectorsType value) {
        return new JAXBElement<PowerTimeSlotScheduleListDataSelectorsType>(_PowerTimeSlotScheduleListDataSelectors_QNAME, PowerTimeSlotScheduleListDataSelectorsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PowerTimeSlotValueDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PowerTimeSlotValueDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "powerTimeSlotValueData")
    public JAXBElement<PowerTimeSlotValueDataType> createPowerTimeSlotValueData(PowerTimeSlotValueDataType value) {
        return new JAXBElement<PowerTimeSlotValueDataType>(_PowerTimeSlotValueData_QNAME, PowerTimeSlotValueDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PowerTimeSlotValueDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PowerTimeSlotValueDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "powerTimeSlotValueDataElements")
    public JAXBElement<PowerTimeSlotValueDataElementsType> createPowerTimeSlotValueDataElements(PowerTimeSlotValueDataElementsType value) {
        return new JAXBElement<PowerTimeSlotValueDataElementsType>(_PowerTimeSlotValueDataElements_QNAME, PowerTimeSlotValueDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PowerTimeSlotValueListDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PowerTimeSlotValueListDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "powerTimeSlotValueListData")
    public JAXBElement<PowerTimeSlotValueListDataType> createPowerTimeSlotValueListData(PowerTimeSlotValueListDataType value) {
        return new JAXBElement<PowerTimeSlotValueListDataType>(_PowerTimeSlotValueListData_QNAME, PowerTimeSlotValueListDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PowerTimeSlotValueListDataSelectorsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PowerTimeSlotValueListDataSelectorsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "powerTimeSlotValueListDataSelectors")
    public JAXBElement<PowerTimeSlotValueListDataSelectorsType> createPowerTimeSlotValueListDataSelectors(PowerTimeSlotValueListDataSelectorsType value) {
        return new JAXBElement<PowerTimeSlotValueListDataSelectorsType>(_PowerTimeSlotValueListDataSelectors_QNAME, PowerTimeSlotValueListDataSelectorsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PowerTimeSlotScheduleConstraintsDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PowerTimeSlotScheduleConstraintsDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "powerTimeSlotScheduleConstraintsData")
    public JAXBElement<PowerTimeSlotScheduleConstraintsDataType> createPowerTimeSlotScheduleConstraintsData(PowerTimeSlotScheduleConstraintsDataType value) {
        return new JAXBElement<PowerTimeSlotScheduleConstraintsDataType>(_PowerTimeSlotScheduleConstraintsData_QNAME, PowerTimeSlotScheduleConstraintsDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PowerTimeSlotScheduleConstraintsDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PowerTimeSlotScheduleConstraintsDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "powerTimeSlotScheduleConstraintsDataElements")
    public JAXBElement<PowerTimeSlotScheduleConstraintsDataElementsType> createPowerTimeSlotScheduleConstraintsDataElements(PowerTimeSlotScheduleConstraintsDataElementsType value) {
        return new JAXBElement<PowerTimeSlotScheduleConstraintsDataElementsType>(_PowerTimeSlotScheduleConstraintsDataElements_QNAME, PowerTimeSlotScheduleConstraintsDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PowerTimeSlotScheduleConstraintsListDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PowerTimeSlotScheduleConstraintsListDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "powerTimeSlotScheduleConstraintsListData")
    public JAXBElement<PowerTimeSlotScheduleConstraintsListDataType> createPowerTimeSlotScheduleConstraintsListData(PowerTimeSlotScheduleConstraintsListDataType value) {
        return new JAXBElement<PowerTimeSlotScheduleConstraintsListDataType>(_PowerTimeSlotScheduleConstraintsListData_QNAME, PowerTimeSlotScheduleConstraintsListDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PowerTimeSlotScheduleConstraintsListDataSelectorsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PowerTimeSlotScheduleConstraintsListDataSelectorsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "powerTimeSlotScheduleConstraintsListDataSelectors")
    public JAXBElement<PowerTimeSlotScheduleConstraintsListDataSelectorsType> createPowerTimeSlotScheduleConstraintsListDataSelectors(PowerTimeSlotScheduleConstraintsListDataSelectorsType value) {
        return new JAXBElement<PowerTimeSlotScheduleConstraintsListDataSelectorsType>(_PowerTimeSlotScheduleConstraintsListDataSelectors_QNAME, PowerTimeSlotScheduleConstraintsListDataSelectorsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PowerSequenceAlternativesRelationDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PowerSequenceAlternativesRelationDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "powerSequenceAlternativesRelationData")
    public JAXBElement<PowerSequenceAlternativesRelationDataType> createPowerSequenceAlternativesRelationData(PowerSequenceAlternativesRelationDataType value) {
        return new JAXBElement<PowerSequenceAlternativesRelationDataType>(_PowerSequenceAlternativesRelationData_QNAME, PowerSequenceAlternativesRelationDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PowerSequenceAlternativesRelationDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PowerSequenceAlternativesRelationDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "powerSequenceAlternativesRelationDataElements")
    public JAXBElement<PowerSequenceAlternativesRelationDataElementsType> createPowerSequenceAlternativesRelationDataElements(PowerSequenceAlternativesRelationDataElementsType value) {
        return new JAXBElement<PowerSequenceAlternativesRelationDataElementsType>(_PowerSequenceAlternativesRelationDataElements_QNAME, PowerSequenceAlternativesRelationDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PowerSequenceAlternativesRelationListDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PowerSequenceAlternativesRelationListDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "powerSequenceAlternativesRelationListData")
    public JAXBElement<PowerSequenceAlternativesRelationListDataType> createPowerSequenceAlternativesRelationListData(PowerSequenceAlternativesRelationListDataType value) {
        return new JAXBElement<PowerSequenceAlternativesRelationListDataType>(_PowerSequenceAlternativesRelationListData_QNAME, PowerSequenceAlternativesRelationListDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PowerSequenceAlternativesRelationListDataSelectorsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PowerSequenceAlternativesRelationListDataSelectorsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "powerSequenceAlternativesRelationListDataSelectors")
    public JAXBElement<PowerSequenceAlternativesRelationListDataSelectorsType> createPowerSequenceAlternativesRelationListDataSelectors(PowerSequenceAlternativesRelationListDataSelectorsType value) {
        return new JAXBElement<PowerSequenceAlternativesRelationListDataSelectorsType>(_PowerSequenceAlternativesRelationListDataSelectors_QNAME, PowerSequenceAlternativesRelationListDataSelectorsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PowerSequenceDescriptionDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PowerSequenceDescriptionDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "powerSequenceDescriptionData")
    public JAXBElement<PowerSequenceDescriptionDataType> createPowerSequenceDescriptionData(PowerSequenceDescriptionDataType value) {
        return new JAXBElement<PowerSequenceDescriptionDataType>(_PowerSequenceDescriptionData_QNAME, PowerSequenceDescriptionDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PowerSequenceDescriptionDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PowerSequenceDescriptionDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "powerSequenceDescriptionDataElements")
    public JAXBElement<PowerSequenceDescriptionDataElementsType> createPowerSequenceDescriptionDataElements(PowerSequenceDescriptionDataElementsType value) {
        return new JAXBElement<PowerSequenceDescriptionDataElementsType>(_PowerSequenceDescriptionDataElements_QNAME, PowerSequenceDescriptionDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PowerSequenceDescriptionListDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PowerSequenceDescriptionListDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "powerSequenceDescriptionListData")
    public JAXBElement<PowerSequenceDescriptionListDataType> createPowerSequenceDescriptionListData(PowerSequenceDescriptionListDataType value) {
        return new JAXBElement<PowerSequenceDescriptionListDataType>(_PowerSequenceDescriptionListData_QNAME, PowerSequenceDescriptionListDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PowerSequenceDescriptionListDataSelectorsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PowerSequenceDescriptionListDataSelectorsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "powerSequenceDescriptionListDataSelectors")
    public JAXBElement<PowerSequenceDescriptionListDataSelectorsType> createPowerSequenceDescriptionListDataSelectors(PowerSequenceDescriptionListDataSelectorsType value) {
        return new JAXBElement<PowerSequenceDescriptionListDataSelectorsType>(_PowerSequenceDescriptionListDataSelectors_QNAME, PowerSequenceDescriptionListDataSelectorsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PowerSequenceStateDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PowerSequenceStateDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "powerSequenceStateData")
    public JAXBElement<PowerSequenceStateDataType> createPowerSequenceStateData(PowerSequenceStateDataType value) {
        return new JAXBElement<PowerSequenceStateDataType>(_PowerSequenceStateData_QNAME, PowerSequenceStateDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PowerSequenceStateDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PowerSequenceStateDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "powerSequenceStateDataElements")
    public JAXBElement<PowerSequenceStateDataElementsType> createPowerSequenceStateDataElements(PowerSequenceStateDataElementsType value) {
        return new JAXBElement<PowerSequenceStateDataElementsType>(_PowerSequenceStateDataElements_QNAME, PowerSequenceStateDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PowerSequenceStateListDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PowerSequenceStateListDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "powerSequenceStateListData")
    public JAXBElement<PowerSequenceStateListDataType> createPowerSequenceStateListData(PowerSequenceStateListDataType value) {
        return new JAXBElement<PowerSequenceStateListDataType>(_PowerSequenceStateListData_QNAME, PowerSequenceStateListDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PowerSequenceStateListDataSelectorsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PowerSequenceStateListDataSelectorsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "powerSequenceStateListDataSelectors")
    public JAXBElement<PowerSequenceStateListDataSelectorsType> createPowerSequenceStateListDataSelectors(PowerSequenceStateListDataSelectorsType value) {
        return new JAXBElement<PowerSequenceStateListDataSelectorsType>(_PowerSequenceStateListDataSelectors_QNAME, PowerSequenceStateListDataSelectorsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PowerSequenceScheduleDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PowerSequenceScheduleDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "powerSequenceScheduleData")
    public JAXBElement<PowerSequenceScheduleDataType> createPowerSequenceScheduleData(PowerSequenceScheduleDataType value) {
        return new JAXBElement<PowerSequenceScheduleDataType>(_PowerSequenceScheduleData_QNAME, PowerSequenceScheduleDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PowerSequenceScheduleDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PowerSequenceScheduleDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "powerSequenceScheduleDataElements")
    public JAXBElement<PowerSequenceScheduleDataElementsType> createPowerSequenceScheduleDataElements(PowerSequenceScheduleDataElementsType value) {
        return new JAXBElement<PowerSequenceScheduleDataElementsType>(_PowerSequenceScheduleDataElements_QNAME, PowerSequenceScheduleDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PowerSequenceScheduleListDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PowerSequenceScheduleListDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "powerSequenceScheduleListData")
    public JAXBElement<PowerSequenceScheduleListDataType> createPowerSequenceScheduleListData(PowerSequenceScheduleListDataType value) {
        return new JAXBElement<PowerSequenceScheduleListDataType>(_PowerSequenceScheduleListData_QNAME, PowerSequenceScheduleListDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PowerSequenceScheduleListDataSelectorsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PowerSequenceScheduleListDataSelectorsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "powerSequenceScheduleListDataSelectors")
    public JAXBElement<PowerSequenceScheduleListDataSelectorsType> createPowerSequenceScheduleListDataSelectors(PowerSequenceScheduleListDataSelectorsType value) {
        return new JAXBElement<PowerSequenceScheduleListDataSelectorsType>(_PowerSequenceScheduleListDataSelectors_QNAME, PowerSequenceScheduleListDataSelectorsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PowerSequenceScheduleConstraintsDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PowerSequenceScheduleConstraintsDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "powerSequenceScheduleConstraintsData")
    public JAXBElement<PowerSequenceScheduleConstraintsDataType> createPowerSequenceScheduleConstraintsData(PowerSequenceScheduleConstraintsDataType value) {
        return new JAXBElement<PowerSequenceScheduleConstraintsDataType>(_PowerSequenceScheduleConstraintsData_QNAME, PowerSequenceScheduleConstraintsDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PowerSequenceScheduleConstraintsDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PowerSequenceScheduleConstraintsDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "powerSequenceScheduleConstraintsDataElements")
    public JAXBElement<PowerSequenceScheduleConstraintsDataElementsType> createPowerSequenceScheduleConstraintsDataElements(PowerSequenceScheduleConstraintsDataElementsType value) {
        return new JAXBElement<PowerSequenceScheduleConstraintsDataElementsType>(_PowerSequenceScheduleConstraintsDataElements_QNAME, PowerSequenceScheduleConstraintsDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PowerSequenceScheduleConstraintsListDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PowerSequenceScheduleConstraintsListDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "powerSequenceScheduleConstraintsListData")
    public JAXBElement<PowerSequenceScheduleConstraintsListDataType> createPowerSequenceScheduleConstraintsListData(PowerSequenceScheduleConstraintsListDataType value) {
        return new JAXBElement<PowerSequenceScheduleConstraintsListDataType>(_PowerSequenceScheduleConstraintsListData_QNAME, PowerSequenceScheduleConstraintsListDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PowerSequenceScheduleConstraintsListDataSelectorsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PowerSequenceScheduleConstraintsListDataSelectorsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "powerSequenceScheduleConstraintsListDataSelectors")
    public JAXBElement<PowerSequenceScheduleConstraintsListDataSelectorsType> createPowerSequenceScheduleConstraintsListDataSelectors(PowerSequenceScheduleConstraintsListDataSelectorsType value) {
        return new JAXBElement<PowerSequenceScheduleConstraintsListDataSelectorsType>(_PowerSequenceScheduleConstraintsListDataSelectors_QNAME, PowerSequenceScheduleConstraintsListDataSelectorsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PowerSequencePriceDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PowerSequencePriceDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "powerSequencePriceData")
    public JAXBElement<PowerSequencePriceDataType> createPowerSequencePriceData(PowerSequencePriceDataType value) {
        return new JAXBElement<PowerSequencePriceDataType>(_PowerSequencePriceData_QNAME, PowerSequencePriceDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PowerSequencePriceDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PowerSequencePriceDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "powerSequencePriceDataElements")
    public JAXBElement<PowerSequencePriceDataElementsType> createPowerSequencePriceDataElements(PowerSequencePriceDataElementsType value) {
        return new JAXBElement<PowerSequencePriceDataElementsType>(_PowerSequencePriceDataElements_QNAME, PowerSequencePriceDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PowerSequencePriceListDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PowerSequencePriceListDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "powerSequencePriceListData")
    public JAXBElement<PowerSequencePriceListDataType> createPowerSequencePriceListData(PowerSequencePriceListDataType value) {
        return new JAXBElement<PowerSequencePriceListDataType>(_PowerSequencePriceListData_QNAME, PowerSequencePriceListDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PowerSequencePriceListDataSelectorsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PowerSequencePriceListDataSelectorsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "powerSequencePriceListDataSelectors")
    public JAXBElement<PowerSequencePriceListDataSelectorsType> createPowerSequencePriceListDataSelectors(PowerSequencePriceListDataSelectorsType value) {
        return new JAXBElement<PowerSequencePriceListDataSelectorsType>(_PowerSequencePriceListDataSelectors_QNAME, PowerSequencePriceListDataSelectorsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PowerSequenceSchedulePreferenceDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PowerSequenceSchedulePreferenceDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "powerSequenceSchedulePreferenceData")
    public JAXBElement<PowerSequenceSchedulePreferenceDataType> createPowerSequenceSchedulePreferenceData(PowerSequenceSchedulePreferenceDataType value) {
        return new JAXBElement<PowerSequenceSchedulePreferenceDataType>(_PowerSequenceSchedulePreferenceData_QNAME, PowerSequenceSchedulePreferenceDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PowerSequenceSchedulePreferenceDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PowerSequenceSchedulePreferenceDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "powerSequenceSchedulePreferenceDataElements")
    public JAXBElement<PowerSequenceSchedulePreferenceDataElementsType> createPowerSequenceSchedulePreferenceDataElements(PowerSequenceSchedulePreferenceDataElementsType value) {
        return new JAXBElement<PowerSequenceSchedulePreferenceDataElementsType>(_PowerSequenceSchedulePreferenceDataElements_QNAME, PowerSequenceSchedulePreferenceDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PowerSequenceSchedulePreferenceListDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PowerSequenceSchedulePreferenceListDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "powerSequenceSchedulePreferenceListData")
    public JAXBElement<PowerSequenceSchedulePreferenceListDataType> createPowerSequenceSchedulePreferenceListData(PowerSequenceSchedulePreferenceListDataType value) {
        return new JAXBElement<PowerSequenceSchedulePreferenceListDataType>(_PowerSequenceSchedulePreferenceListData_QNAME, PowerSequenceSchedulePreferenceListDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PowerSequenceSchedulePreferenceListDataSelectorsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PowerSequenceSchedulePreferenceListDataSelectorsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "powerSequenceSchedulePreferenceListDataSelectors")
    public JAXBElement<PowerSequenceSchedulePreferenceListDataSelectorsType> createPowerSequenceSchedulePreferenceListDataSelectors(PowerSequenceSchedulePreferenceListDataSelectorsType value) {
        return new JAXBElement<PowerSequenceSchedulePreferenceListDataSelectorsType>(_PowerSequenceSchedulePreferenceListDataSelectors_QNAME, PowerSequenceSchedulePreferenceListDataSelectorsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PowerSequenceNodeScheduleInformationDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PowerSequenceNodeScheduleInformationDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "powerSequenceNodeScheduleInformationData")
    public JAXBElement<PowerSequenceNodeScheduleInformationDataType> createPowerSequenceNodeScheduleInformationData(PowerSequenceNodeScheduleInformationDataType value) {
        return new JAXBElement<PowerSequenceNodeScheduleInformationDataType>(_PowerSequenceNodeScheduleInformationData_QNAME, PowerSequenceNodeScheduleInformationDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PowerSequenceNodeScheduleInformationDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PowerSequenceNodeScheduleInformationDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "powerSequenceNodeScheduleInformationDataElements")
    public JAXBElement<PowerSequenceNodeScheduleInformationDataElementsType> createPowerSequenceNodeScheduleInformationDataElements(PowerSequenceNodeScheduleInformationDataElementsType value) {
        return new JAXBElement<PowerSequenceNodeScheduleInformationDataElementsType>(_PowerSequenceNodeScheduleInformationDataElements_QNAME, PowerSequenceNodeScheduleInformationDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PowerSequenceScheduleConfigurationRequestCallType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PowerSequenceScheduleConfigurationRequestCallType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "powerSequenceScheduleConfigurationRequestCall")
    public JAXBElement<PowerSequenceScheduleConfigurationRequestCallType> createPowerSequenceScheduleConfigurationRequestCall(PowerSequenceScheduleConfigurationRequestCallType value) {
        return new JAXBElement<PowerSequenceScheduleConfigurationRequestCallType>(_PowerSequenceScheduleConfigurationRequestCall_QNAME, PowerSequenceScheduleConfigurationRequestCallType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PowerSequenceScheduleConfigurationRequestCallElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PowerSequenceScheduleConfigurationRequestCallElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "powerSequenceScheduleConfigurationRequestCallElements")
    public JAXBElement<PowerSequenceScheduleConfigurationRequestCallElementsType> createPowerSequenceScheduleConfigurationRequestCallElements(PowerSequenceScheduleConfigurationRequestCallElementsType value) {
        return new JAXBElement<PowerSequenceScheduleConfigurationRequestCallElementsType>(_PowerSequenceScheduleConfigurationRequestCallElements_QNAME, PowerSequenceScheduleConfigurationRequestCallElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PowerSequencePriceCalculationRequestCallType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PowerSequencePriceCalculationRequestCallType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "powerSequencePriceCalculationRequestCall")
    public JAXBElement<PowerSequencePriceCalculationRequestCallType> createPowerSequencePriceCalculationRequestCall(PowerSequencePriceCalculationRequestCallType value) {
        return new JAXBElement<PowerSequencePriceCalculationRequestCallType>(_PowerSequencePriceCalculationRequestCall_QNAME, PowerSequencePriceCalculationRequestCallType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PowerSequencePriceCalculationRequestCallElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PowerSequencePriceCalculationRequestCallElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "powerSequencePriceCalculationRequestCallElements")
    public JAXBElement<PowerSequencePriceCalculationRequestCallElementsType> createPowerSequencePriceCalculationRequestCallElements(PowerSequencePriceCalculationRequestCallElementsType value) {
        return new JAXBElement<PowerSequencePriceCalculationRequestCallElementsType>(_PowerSequencePriceCalculationRequestCallElements_QNAME, PowerSequencePriceCalculationRequestCallElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DirectControlActivityDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DirectControlActivityDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "directControlActivityData")
    public JAXBElement<DirectControlActivityDataType> createDirectControlActivityData(DirectControlActivityDataType value) {
        return new JAXBElement<DirectControlActivityDataType>(_DirectControlActivityData_QNAME, DirectControlActivityDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DirectControlActivityDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DirectControlActivityDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "directControlActivityDataElements")
    public JAXBElement<DirectControlActivityDataElementsType> createDirectControlActivityDataElements(DirectControlActivityDataElementsType value) {
        return new JAXBElement<DirectControlActivityDataElementsType>(_DirectControlActivityDataElements_QNAME, DirectControlActivityDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DirectControlActivityListDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DirectControlActivityListDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "directControlActivityListData")
    public JAXBElement<DirectControlActivityListDataType> createDirectControlActivityListData(DirectControlActivityListDataType value) {
        return new JAXBElement<DirectControlActivityListDataType>(_DirectControlActivityListData_QNAME, DirectControlActivityListDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DirectControlActivityListDataSelectorsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DirectControlActivityListDataSelectorsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "directControlActivityListDataSelectors")
    public JAXBElement<DirectControlActivityListDataSelectorsType> createDirectControlActivityListDataSelectors(DirectControlActivityListDataSelectorsType value) {
        return new JAXBElement<DirectControlActivityListDataSelectorsType>(_DirectControlActivityListDataSelectors_QNAME, DirectControlActivityListDataSelectorsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DirectControlDescriptionDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DirectControlDescriptionDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "directControlDescriptionData")
    public JAXBElement<DirectControlDescriptionDataType> createDirectControlDescriptionData(DirectControlDescriptionDataType value) {
        return new JAXBElement<DirectControlDescriptionDataType>(_DirectControlDescriptionData_QNAME, DirectControlDescriptionDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DirectControlDescriptionDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DirectControlDescriptionDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "directControlDescriptionDataElements")
    public JAXBElement<DirectControlDescriptionDataElementsType> createDirectControlDescriptionDataElements(DirectControlDescriptionDataElementsType value) {
        return new JAXBElement<DirectControlDescriptionDataElementsType>(_DirectControlDescriptionDataElements_QNAME, DirectControlDescriptionDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeTableDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TimeTableDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "timeTableData")
    public JAXBElement<TimeTableDataType> createTimeTableData(TimeTableDataType value) {
        return new JAXBElement<TimeTableDataType>(_TimeTableData_QNAME, TimeTableDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeTableDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TimeTableDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "timeTableDataElements")
    public JAXBElement<TimeTableDataElementsType> createTimeTableDataElements(TimeTableDataElementsType value) {
        return new JAXBElement<TimeTableDataElementsType>(_TimeTableDataElements_QNAME, TimeTableDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeTableListDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TimeTableListDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "timeTableListData")
    public JAXBElement<TimeTableListDataType> createTimeTableListData(TimeTableListDataType value) {
        return new JAXBElement<TimeTableListDataType>(_TimeTableListData_QNAME, TimeTableListDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeTableListDataSelectorsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TimeTableListDataSelectorsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "timeTableListDataSelectors")
    public JAXBElement<TimeTableListDataSelectorsType> createTimeTableListDataSelectors(TimeTableListDataSelectorsType value) {
        return new JAXBElement<TimeTableListDataSelectorsType>(_TimeTableListDataSelectors_QNAME, TimeTableListDataSelectorsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeTableConstraintsDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TimeTableConstraintsDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "timeTableConstraintsData")
    public JAXBElement<TimeTableConstraintsDataType> createTimeTableConstraintsData(TimeTableConstraintsDataType value) {
        return new JAXBElement<TimeTableConstraintsDataType>(_TimeTableConstraintsData_QNAME, TimeTableConstraintsDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeTableConstraintsDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TimeTableConstraintsDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "timeTableConstraintsDataElements")
    public JAXBElement<TimeTableConstraintsDataElementsType> createTimeTableConstraintsDataElements(TimeTableConstraintsDataElementsType value) {
        return new JAXBElement<TimeTableConstraintsDataElementsType>(_TimeTableConstraintsDataElements_QNAME, TimeTableConstraintsDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeTableConstraintsListDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TimeTableConstraintsListDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "timeTableConstraintsListData")
    public JAXBElement<TimeTableConstraintsListDataType> createTimeTableConstraintsListData(TimeTableConstraintsListDataType value) {
        return new JAXBElement<TimeTableConstraintsListDataType>(_TimeTableConstraintsListData_QNAME, TimeTableConstraintsListDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeTableConstraintsListDataSelectorsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TimeTableConstraintsListDataSelectorsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "timeTableConstraintsListDataSelectors")
    public JAXBElement<TimeTableConstraintsListDataSelectorsType> createTimeTableConstraintsListDataSelectors(TimeTableConstraintsListDataSelectorsType value) {
        return new JAXBElement<TimeTableConstraintsListDataSelectorsType>(_TimeTableConstraintsListDataSelectors_QNAME, TimeTableConstraintsListDataSelectorsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeTableDescriptionDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TimeTableDescriptionDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "timeTableDescriptionData")
    public JAXBElement<TimeTableDescriptionDataType> createTimeTableDescriptionData(TimeTableDescriptionDataType value) {
        return new JAXBElement<TimeTableDescriptionDataType>(_TimeTableDescriptionData_QNAME, TimeTableDescriptionDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeTableDescriptionDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TimeTableDescriptionDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "timeTableDescriptionDataElements")
    public JAXBElement<TimeTableDescriptionDataElementsType> createTimeTableDescriptionDataElements(TimeTableDescriptionDataElementsType value) {
        return new JAXBElement<TimeTableDescriptionDataElementsType>(_TimeTableDescriptionDataElements_QNAME, TimeTableDescriptionDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeTableDescriptionListDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TimeTableDescriptionListDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "timeTableDescriptionListData")
    public JAXBElement<TimeTableDescriptionListDataType> createTimeTableDescriptionListData(TimeTableDescriptionListDataType value) {
        return new JAXBElement<TimeTableDescriptionListDataType>(_TimeTableDescriptionListData_QNAME, TimeTableDescriptionListDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeTableDescriptionListDataSelectorsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TimeTableDescriptionListDataSelectorsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "timeTableDescriptionListDataSelectors")
    public JAXBElement<TimeTableDescriptionListDataSelectorsType> createTimeTableDescriptionListDataSelectors(TimeTableDescriptionListDataSelectorsType value) {
        return new JAXBElement<TimeTableDescriptionListDataSelectorsType>(_TimeTableDescriptionListDataSelectors_QNAME, TimeTableDescriptionListDataSelectorsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetpointDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SetpointDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "setpointData")
    public JAXBElement<SetpointDataType> createSetpointData(SetpointDataType value) {
        return new JAXBElement<SetpointDataType>(_SetpointData_QNAME, SetpointDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetpointDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SetpointDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "setpointDataElements")
    public JAXBElement<SetpointDataElementsType> createSetpointDataElements(SetpointDataElementsType value) {
        return new JAXBElement<SetpointDataElementsType>(_SetpointDataElements_QNAME, SetpointDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetpointListDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SetpointListDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "setpointListData")
    public JAXBElement<SetpointListDataType> createSetpointListData(SetpointListDataType value) {
        return new JAXBElement<SetpointListDataType>(_SetpointListData_QNAME, SetpointListDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetpointListDataSelectorsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SetpointListDataSelectorsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "setpointListDataSelectors")
    public JAXBElement<SetpointListDataSelectorsType> createSetpointListDataSelectors(SetpointListDataSelectorsType value) {
        return new JAXBElement<SetpointListDataSelectorsType>(_SetpointListDataSelectors_QNAME, SetpointListDataSelectorsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetpointConstraintsDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SetpointConstraintsDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "setpointConstraintsData")
    public JAXBElement<SetpointConstraintsDataType> createSetpointConstraintsData(SetpointConstraintsDataType value) {
        return new JAXBElement<SetpointConstraintsDataType>(_SetpointConstraintsData_QNAME, SetpointConstraintsDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetpointConstraintsDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SetpointConstraintsDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "setpointConstraintsDataElements")
    public JAXBElement<SetpointConstraintsDataElementsType> createSetpointConstraintsDataElements(SetpointConstraintsDataElementsType value) {
        return new JAXBElement<SetpointConstraintsDataElementsType>(_SetpointConstraintsDataElements_QNAME, SetpointConstraintsDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetpointConstraintsListDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SetpointConstraintsListDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "setpointConstraintsListData")
    public JAXBElement<SetpointConstraintsListDataType> createSetpointConstraintsListData(SetpointConstraintsListDataType value) {
        return new JAXBElement<SetpointConstraintsListDataType>(_SetpointConstraintsListData_QNAME, SetpointConstraintsListDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetpointConstraintsListDataSelectorsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SetpointConstraintsListDataSelectorsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "setpointConstraintsListDataSelectors")
    public JAXBElement<SetpointConstraintsListDataSelectorsType> createSetpointConstraintsListDataSelectors(SetpointConstraintsListDataSelectorsType value) {
        return new JAXBElement<SetpointConstraintsListDataSelectorsType>(_SetpointConstraintsListDataSelectors_QNAME, SetpointConstraintsListDataSelectorsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetpointDescriptionDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SetpointDescriptionDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "setpointDescriptionData")
    public JAXBElement<SetpointDescriptionDataType> createSetpointDescriptionData(SetpointDescriptionDataType value) {
        return new JAXBElement<SetpointDescriptionDataType>(_SetpointDescriptionData_QNAME, SetpointDescriptionDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetpointDescriptionDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SetpointDescriptionDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "setpointDescriptionDataElements")
    public JAXBElement<SetpointDescriptionDataElementsType> createSetpointDescriptionDataElements(SetpointDescriptionDataElementsType value) {
        return new JAXBElement<SetpointDescriptionDataElementsType>(_SetpointDescriptionDataElements_QNAME, SetpointDescriptionDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetpointDescriptionListDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SetpointDescriptionListDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "setpointDescriptionListData")
    public JAXBElement<SetpointDescriptionListDataType> createSetpointDescriptionListData(SetpointDescriptionListDataType value) {
        return new JAXBElement<SetpointDescriptionListDataType>(_SetpointDescriptionListData_QNAME, SetpointDescriptionListDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetpointDescriptionListDataSelectorsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SetpointDescriptionListDataSelectorsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "setpointDescriptionListDataSelectors")
    public JAXBElement<SetpointDescriptionListDataSelectorsType> createSetpointDescriptionListDataSelectors(SetpointDescriptionListDataSelectorsType value) {
        return new JAXBElement<SetpointDescriptionListDataSelectorsType>(_SetpointDescriptionListDataSelectors_QNAME, SetpointDescriptionListDataSelectorsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HvacSystemFunctionDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HvacSystemFunctionDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "hvacSystemFunctionData")
    public JAXBElement<HvacSystemFunctionDataType> createHvacSystemFunctionData(HvacSystemFunctionDataType value) {
        return new JAXBElement<HvacSystemFunctionDataType>(_HvacSystemFunctionData_QNAME, HvacSystemFunctionDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HvacSystemFunctionDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HvacSystemFunctionDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "hvacSystemFunctionDataElements")
    public JAXBElement<HvacSystemFunctionDataElementsType> createHvacSystemFunctionDataElements(HvacSystemFunctionDataElementsType value) {
        return new JAXBElement<HvacSystemFunctionDataElementsType>(_HvacSystemFunctionDataElements_QNAME, HvacSystemFunctionDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HvacSystemFunctionListDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HvacSystemFunctionListDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "hvacSystemFunctionListData")
    public JAXBElement<HvacSystemFunctionListDataType> createHvacSystemFunctionListData(HvacSystemFunctionListDataType value) {
        return new JAXBElement<HvacSystemFunctionListDataType>(_HvacSystemFunctionListData_QNAME, HvacSystemFunctionListDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HvacSystemFunctionListDataSelectorsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HvacSystemFunctionListDataSelectorsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "hvacSystemFunctionListDataSelectors")
    public JAXBElement<HvacSystemFunctionListDataSelectorsType> createHvacSystemFunctionListDataSelectors(HvacSystemFunctionListDataSelectorsType value) {
        return new JAXBElement<HvacSystemFunctionListDataSelectorsType>(_HvacSystemFunctionListDataSelectors_QNAME, HvacSystemFunctionListDataSelectorsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HvacSystemFunctionOperationModeRelationDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HvacSystemFunctionOperationModeRelationDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "hvacSystemFunctionOperationModeRelationData")
    public JAXBElement<HvacSystemFunctionOperationModeRelationDataType> createHvacSystemFunctionOperationModeRelationData(HvacSystemFunctionOperationModeRelationDataType value) {
        return new JAXBElement<HvacSystemFunctionOperationModeRelationDataType>(_HvacSystemFunctionOperationModeRelationData_QNAME, HvacSystemFunctionOperationModeRelationDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HvacSystemFunctionOperationModeRelationDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HvacSystemFunctionOperationModeRelationDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "hvacSystemFunctionOperationModeRelationDataElements")
    public JAXBElement<HvacSystemFunctionOperationModeRelationDataElementsType> createHvacSystemFunctionOperationModeRelationDataElements(HvacSystemFunctionOperationModeRelationDataElementsType value) {
        return new JAXBElement<HvacSystemFunctionOperationModeRelationDataElementsType>(_HvacSystemFunctionOperationModeRelationDataElements_QNAME, HvacSystemFunctionOperationModeRelationDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HvacSystemFunctionOperationModeRelationListDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HvacSystemFunctionOperationModeRelationListDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "hvacSystemFunctionOperationModeRelationListData")
    public JAXBElement<HvacSystemFunctionOperationModeRelationListDataType> createHvacSystemFunctionOperationModeRelationListData(HvacSystemFunctionOperationModeRelationListDataType value) {
        return new JAXBElement<HvacSystemFunctionOperationModeRelationListDataType>(_HvacSystemFunctionOperationModeRelationListData_QNAME, HvacSystemFunctionOperationModeRelationListDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HvacSystemFunctionOperationModeRelationListDataSelectorsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HvacSystemFunctionOperationModeRelationListDataSelectorsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "hvacSystemFunctionOperationModeRelationListDataSelectors")
    public JAXBElement<HvacSystemFunctionOperationModeRelationListDataSelectorsType> createHvacSystemFunctionOperationModeRelationListDataSelectors(HvacSystemFunctionOperationModeRelationListDataSelectorsType value) {
        return new JAXBElement<HvacSystemFunctionOperationModeRelationListDataSelectorsType>(_HvacSystemFunctionOperationModeRelationListDataSelectors_QNAME, HvacSystemFunctionOperationModeRelationListDataSelectorsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HvacSystemFunctionSetpointRelationDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HvacSystemFunctionSetpointRelationDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "hvacSystemFunctionSetpointRelationData")
    public JAXBElement<HvacSystemFunctionSetpointRelationDataType> createHvacSystemFunctionSetpointRelationData(HvacSystemFunctionSetpointRelationDataType value) {
        return new JAXBElement<HvacSystemFunctionSetpointRelationDataType>(_HvacSystemFunctionSetpointRelationData_QNAME, HvacSystemFunctionSetpointRelationDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HvacSystemFunctionSetpointRelationDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HvacSystemFunctionSetpointRelationDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "hvacSystemFunctionSetpointRelationDataElements")
    public JAXBElement<HvacSystemFunctionSetpointRelationDataElementsType> createHvacSystemFunctionSetpointRelationDataElements(HvacSystemFunctionSetpointRelationDataElementsType value) {
        return new JAXBElement<HvacSystemFunctionSetpointRelationDataElementsType>(_HvacSystemFunctionSetpointRelationDataElements_QNAME, HvacSystemFunctionSetpointRelationDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HvacSystemFunctionSetpointRelationListDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HvacSystemFunctionSetpointRelationListDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "hvacSystemFunctionSetpointRelationListData")
    public JAXBElement<HvacSystemFunctionSetpointRelationListDataType> createHvacSystemFunctionSetpointRelationListData(HvacSystemFunctionSetpointRelationListDataType value) {
        return new JAXBElement<HvacSystemFunctionSetpointRelationListDataType>(_HvacSystemFunctionSetpointRelationListData_QNAME, HvacSystemFunctionSetpointRelationListDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HvacSystemFunctionSetpointRelationListDataSelectorsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HvacSystemFunctionSetpointRelationListDataSelectorsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "hvacSystemFunctionSetpointRelationListDataSelectors")
    public JAXBElement<HvacSystemFunctionSetpointRelationListDataSelectorsType> createHvacSystemFunctionSetpointRelationListDataSelectors(HvacSystemFunctionSetpointRelationListDataSelectorsType value) {
        return new JAXBElement<HvacSystemFunctionSetpointRelationListDataSelectorsType>(_HvacSystemFunctionSetpointRelationListDataSelectors_QNAME, HvacSystemFunctionSetpointRelationListDataSelectorsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HvacSystemFunctionPowerSequenceRelationDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HvacSystemFunctionPowerSequenceRelationDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "hvacSystemFunctionPowerSequenceRelationData")
    public JAXBElement<HvacSystemFunctionPowerSequenceRelationDataType> createHvacSystemFunctionPowerSequenceRelationData(HvacSystemFunctionPowerSequenceRelationDataType value) {
        return new JAXBElement<HvacSystemFunctionPowerSequenceRelationDataType>(_HvacSystemFunctionPowerSequenceRelationData_QNAME, HvacSystemFunctionPowerSequenceRelationDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HvacSystemFunctionPowerSequenceRelationDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HvacSystemFunctionPowerSequenceRelationDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "hvacSystemFunctionPowerSequenceRelationDataElements")
    public JAXBElement<HvacSystemFunctionPowerSequenceRelationDataElementsType> createHvacSystemFunctionPowerSequenceRelationDataElements(HvacSystemFunctionPowerSequenceRelationDataElementsType value) {
        return new JAXBElement<HvacSystemFunctionPowerSequenceRelationDataElementsType>(_HvacSystemFunctionPowerSequenceRelationDataElements_QNAME, HvacSystemFunctionPowerSequenceRelationDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HvacSystemFunctionPowerSequenceRelationListDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HvacSystemFunctionPowerSequenceRelationListDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "hvacSystemFunctionPowerSequenceRelationListData")
    public JAXBElement<HvacSystemFunctionPowerSequenceRelationListDataType> createHvacSystemFunctionPowerSequenceRelationListData(HvacSystemFunctionPowerSequenceRelationListDataType value) {
        return new JAXBElement<HvacSystemFunctionPowerSequenceRelationListDataType>(_HvacSystemFunctionPowerSequenceRelationListData_QNAME, HvacSystemFunctionPowerSequenceRelationListDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HvacSystemFunctionPowerSequenceRelationListDataSelectorsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HvacSystemFunctionPowerSequenceRelationListDataSelectorsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "hvacSystemFunctionPowerSequenceRelationListDataSelectors")
    public JAXBElement<HvacSystemFunctionPowerSequenceRelationListDataSelectorsType> createHvacSystemFunctionPowerSequenceRelationListDataSelectors(HvacSystemFunctionPowerSequenceRelationListDataSelectorsType value) {
        return new JAXBElement<HvacSystemFunctionPowerSequenceRelationListDataSelectorsType>(_HvacSystemFunctionPowerSequenceRelationListDataSelectors_QNAME, HvacSystemFunctionPowerSequenceRelationListDataSelectorsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HvacSystemFunctionDescriptionDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HvacSystemFunctionDescriptionDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "hvacSystemFunctionDescriptionData")
    public JAXBElement<HvacSystemFunctionDescriptionDataType> createHvacSystemFunctionDescriptionData(HvacSystemFunctionDescriptionDataType value) {
        return new JAXBElement<HvacSystemFunctionDescriptionDataType>(_HvacSystemFunctionDescriptionData_QNAME, HvacSystemFunctionDescriptionDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HvacSystemFunctionDescriptionDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HvacSystemFunctionDescriptionDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "hvacSystemFunctionDescriptionDataElements")
    public JAXBElement<HvacSystemFunctionDescriptionDataElementsType> createHvacSystemFunctionDescriptionDataElements(HvacSystemFunctionDescriptionDataElementsType value) {
        return new JAXBElement<HvacSystemFunctionDescriptionDataElementsType>(_HvacSystemFunctionDescriptionDataElements_QNAME, HvacSystemFunctionDescriptionDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HvacSystemFunctionDescriptionListDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HvacSystemFunctionDescriptionListDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "hvacSystemFunctionDescriptionListData")
    public JAXBElement<HvacSystemFunctionDescriptionListDataType> createHvacSystemFunctionDescriptionListData(HvacSystemFunctionDescriptionListDataType value) {
        return new JAXBElement<HvacSystemFunctionDescriptionListDataType>(_HvacSystemFunctionDescriptionListData_QNAME, HvacSystemFunctionDescriptionListDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HvacSystemFunctionDescriptionListDataSelectorsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HvacSystemFunctionDescriptionListDataSelectorsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "hvacSystemFunctionDescriptionListDataSelectors")
    public JAXBElement<HvacSystemFunctionDescriptionListDataSelectorsType> createHvacSystemFunctionDescriptionListDataSelectors(HvacSystemFunctionDescriptionListDataSelectorsType value) {
        return new JAXBElement<HvacSystemFunctionDescriptionListDataSelectorsType>(_HvacSystemFunctionDescriptionListDataSelectors_QNAME, HvacSystemFunctionDescriptionListDataSelectorsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HvacOperationModeDescriptionDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HvacOperationModeDescriptionDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "hvacOperationModeDescriptionData")
    public JAXBElement<HvacOperationModeDescriptionDataType> createHvacOperationModeDescriptionData(HvacOperationModeDescriptionDataType value) {
        return new JAXBElement<HvacOperationModeDescriptionDataType>(_HvacOperationModeDescriptionData_QNAME, HvacOperationModeDescriptionDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HvacOperationModeDescriptionDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HvacOperationModeDescriptionDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "hvacOperationModeDescriptionDataElements")
    public JAXBElement<HvacOperationModeDescriptionDataElementsType> createHvacOperationModeDescriptionDataElements(HvacOperationModeDescriptionDataElementsType value) {
        return new JAXBElement<HvacOperationModeDescriptionDataElementsType>(_HvacOperationModeDescriptionDataElements_QNAME, HvacOperationModeDescriptionDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HvacOperationModeDescriptionListDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HvacOperationModeDescriptionListDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "hvacOperationModeDescriptionListData")
    public JAXBElement<HvacOperationModeDescriptionListDataType> createHvacOperationModeDescriptionListData(HvacOperationModeDescriptionListDataType value) {
        return new JAXBElement<HvacOperationModeDescriptionListDataType>(_HvacOperationModeDescriptionListData_QNAME, HvacOperationModeDescriptionListDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HvacOperationModeDescriptionListDataSelectorsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HvacOperationModeDescriptionListDataSelectorsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "hvacOperationModeDescriptionListDataSelectors")
    public JAXBElement<HvacOperationModeDescriptionListDataSelectorsType> createHvacOperationModeDescriptionListDataSelectors(HvacOperationModeDescriptionListDataSelectorsType value) {
        return new JAXBElement<HvacOperationModeDescriptionListDataSelectorsType>(_HvacOperationModeDescriptionListDataSelectors_QNAME, HvacOperationModeDescriptionListDataSelectorsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HvacOverrunDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HvacOverrunDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "hvacOverrunData")
    public JAXBElement<HvacOverrunDataType> createHvacOverrunData(HvacOverrunDataType value) {
        return new JAXBElement<HvacOverrunDataType>(_HvacOverrunData_QNAME, HvacOverrunDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HvacOverrunDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HvacOverrunDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "hvacOverrunDataElements")
    public JAXBElement<HvacOverrunDataElementsType> createHvacOverrunDataElements(HvacOverrunDataElementsType value) {
        return new JAXBElement<HvacOverrunDataElementsType>(_HvacOverrunDataElements_QNAME, HvacOverrunDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HvacOverrunListDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HvacOverrunListDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "hvacOverrunListData")
    public JAXBElement<HvacOverrunListDataType> createHvacOverrunListData(HvacOverrunListDataType value) {
        return new JAXBElement<HvacOverrunListDataType>(_HvacOverrunListData_QNAME, HvacOverrunListDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HvacOverrunListDataSelectorsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HvacOverrunListDataSelectorsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "hvacOverrunListDataSelectors")
    public JAXBElement<HvacOverrunListDataSelectorsType> createHvacOverrunListDataSelectors(HvacOverrunListDataSelectorsType value) {
        return new JAXBElement<HvacOverrunListDataSelectorsType>(_HvacOverrunListDataSelectors_QNAME, HvacOverrunListDataSelectorsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HvacOverrunDescriptionDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HvacOverrunDescriptionDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "hvacOverrunDescriptionData")
    public JAXBElement<HvacOverrunDescriptionDataType> createHvacOverrunDescriptionData(HvacOverrunDescriptionDataType value) {
        return new JAXBElement<HvacOverrunDescriptionDataType>(_HvacOverrunDescriptionData_QNAME, HvacOverrunDescriptionDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HvacOverrunDescriptionDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HvacOverrunDescriptionDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "hvacOverrunDescriptionDataElements")
    public JAXBElement<HvacOverrunDescriptionDataElementsType> createHvacOverrunDescriptionDataElements(HvacOverrunDescriptionDataElementsType value) {
        return new JAXBElement<HvacOverrunDescriptionDataElementsType>(_HvacOverrunDescriptionDataElements_QNAME, HvacOverrunDescriptionDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HvacOverrunDescriptionListDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HvacOverrunDescriptionListDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "hvacOverrunDescriptionListData")
    public JAXBElement<HvacOverrunDescriptionListDataType> createHvacOverrunDescriptionListData(HvacOverrunDescriptionListDataType value) {
        return new JAXBElement<HvacOverrunDescriptionListDataType>(_HvacOverrunDescriptionListData_QNAME, HvacOverrunDescriptionListDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HvacOverrunDescriptionListDataSelectorsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HvacOverrunDescriptionListDataSelectorsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "hvacOverrunDescriptionListDataSelectors")
    public JAXBElement<HvacOverrunDescriptionListDataSelectorsType> createHvacOverrunDescriptionListDataSelectors(HvacOverrunDescriptionListDataSelectorsType value) {
        return new JAXBElement<HvacOverrunDescriptionListDataSelectorsType>(_HvacOverrunDescriptionListDataSelectors_QNAME, HvacOverrunDescriptionListDataSelectorsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadControlNodeDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LoadControlNodeDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "loadControlNodeData")
    public JAXBElement<LoadControlNodeDataType> createLoadControlNodeData(LoadControlNodeDataType value) {
        return new JAXBElement<LoadControlNodeDataType>(_LoadControlNodeData_QNAME, LoadControlNodeDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadControlNodeDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LoadControlNodeDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "loadControlNodeDataElements")
    public JAXBElement<LoadControlNodeDataElementsType> createLoadControlNodeDataElements(LoadControlNodeDataElementsType value) {
        return new JAXBElement<LoadControlNodeDataElementsType>(_LoadControlNodeDataElements_QNAME, LoadControlNodeDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadControlEventDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LoadControlEventDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "loadControlEventData")
    public JAXBElement<LoadControlEventDataType> createLoadControlEventData(LoadControlEventDataType value) {
        return new JAXBElement<LoadControlEventDataType>(_LoadControlEventData_QNAME, LoadControlEventDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadControlEventDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LoadControlEventDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "loadControlEventDataElements")
    public JAXBElement<LoadControlEventDataElementsType> createLoadControlEventDataElements(LoadControlEventDataElementsType value) {
        return new JAXBElement<LoadControlEventDataElementsType>(_LoadControlEventDataElements_QNAME, LoadControlEventDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadControlEventListDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LoadControlEventListDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "loadControlEventListData")
    public JAXBElement<LoadControlEventListDataType> createLoadControlEventListData(LoadControlEventListDataType value) {
        return new JAXBElement<LoadControlEventListDataType>(_LoadControlEventListData_QNAME, LoadControlEventListDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadControlEventListDataSelectorsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LoadControlEventListDataSelectorsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "loadControlEventListDataSelectors")
    public JAXBElement<LoadControlEventListDataSelectorsType> createLoadControlEventListDataSelectors(LoadControlEventListDataSelectorsType value) {
        return new JAXBElement<LoadControlEventListDataSelectorsType>(_LoadControlEventListDataSelectors_QNAME, LoadControlEventListDataSelectorsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadControlStateDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LoadControlStateDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "loadControlStateData")
    public JAXBElement<LoadControlStateDataType> createLoadControlStateData(LoadControlStateDataType value) {
        return new JAXBElement<LoadControlStateDataType>(_LoadControlStateData_QNAME, LoadControlStateDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadControlStateDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LoadControlStateDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "loadControlStateDataElements")
    public JAXBElement<LoadControlStateDataElementsType> createLoadControlStateDataElements(LoadControlStateDataElementsType value) {
        return new JAXBElement<LoadControlStateDataElementsType>(_LoadControlStateDataElements_QNAME, LoadControlStateDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadControlStateListDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LoadControlStateListDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "loadControlStateListData")
    public JAXBElement<LoadControlStateListDataType> createLoadControlStateListData(LoadControlStateListDataType value) {
        return new JAXBElement<LoadControlStateListDataType>(_LoadControlStateListData_QNAME, LoadControlStateListDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadControlStateListDataSelectorsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LoadControlStateListDataSelectorsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "loadControlStateListDataSelectors")
    public JAXBElement<LoadControlStateListDataSelectorsType> createLoadControlStateListDataSelectors(LoadControlStateListDataSelectorsType value) {
        return new JAXBElement<LoadControlStateListDataSelectorsType>(_LoadControlStateListDataSelectors_QNAME, LoadControlStateListDataSelectorsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadControlLimitDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LoadControlLimitDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "loadControlLimitData")
    public JAXBElement<LoadControlLimitDataType> createLoadControlLimitData(LoadControlLimitDataType value) {
        return new JAXBElement<LoadControlLimitDataType>(_LoadControlLimitData_QNAME, LoadControlLimitDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadControlLimitDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LoadControlLimitDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "loadControlLimitDataElements")
    public JAXBElement<LoadControlLimitDataElementsType> createLoadControlLimitDataElements(LoadControlLimitDataElementsType value) {
        return new JAXBElement<LoadControlLimitDataElementsType>(_LoadControlLimitDataElements_QNAME, LoadControlLimitDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadControlLimitListDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LoadControlLimitListDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "loadControlLimitListData")
    public JAXBElement<LoadControlLimitListDataType> createLoadControlLimitListData(LoadControlLimitListDataType value) {
        return new JAXBElement<LoadControlLimitListDataType>(_LoadControlLimitListData_QNAME, LoadControlLimitListDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadControlLimitListDataSelectorsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LoadControlLimitListDataSelectorsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "loadControlLimitListDataSelectors")
    public JAXBElement<LoadControlLimitListDataSelectorsType> createLoadControlLimitListDataSelectors(LoadControlLimitListDataSelectorsType value) {
        return new JAXBElement<LoadControlLimitListDataSelectorsType>(_LoadControlLimitListDataSelectors_QNAME, LoadControlLimitListDataSelectorsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadControlLimitConstraintsDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LoadControlLimitConstraintsDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "loadControlLimitConstraintsData")
    public JAXBElement<LoadControlLimitConstraintsDataType> createLoadControlLimitConstraintsData(LoadControlLimitConstraintsDataType value) {
        return new JAXBElement<LoadControlLimitConstraintsDataType>(_LoadControlLimitConstraintsData_QNAME, LoadControlLimitConstraintsDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadControlLimitConstraintsDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LoadControlLimitConstraintsDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "loadControlLimitConstraintsDataElements")
    public JAXBElement<LoadControlLimitConstraintsDataElementsType> createLoadControlLimitConstraintsDataElements(LoadControlLimitConstraintsDataElementsType value) {
        return new JAXBElement<LoadControlLimitConstraintsDataElementsType>(_LoadControlLimitConstraintsDataElements_QNAME, LoadControlLimitConstraintsDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadControlLimitConstraintsListDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LoadControlLimitConstraintsListDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "loadControlLimitConstraintsListData")
    public JAXBElement<LoadControlLimitConstraintsListDataType> createLoadControlLimitConstraintsListData(LoadControlLimitConstraintsListDataType value) {
        return new JAXBElement<LoadControlLimitConstraintsListDataType>(_LoadControlLimitConstraintsListData_QNAME, LoadControlLimitConstraintsListDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadControlLimitConstraintsListDataSelectorsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LoadControlLimitConstraintsListDataSelectorsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "loadControlLimitConstraintsListDataSelectors")
    public JAXBElement<LoadControlLimitConstraintsListDataSelectorsType> createLoadControlLimitConstraintsListDataSelectors(LoadControlLimitConstraintsListDataSelectorsType value) {
        return new JAXBElement<LoadControlLimitConstraintsListDataSelectorsType>(_LoadControlLimitConstraintsListDataSelectors_QNAME, LoadControlLimitConstraintsListDataSelectorsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadControlLimitDescriptionDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LoadControlLimitDescriptionDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "loadControlLimitDescriptionData")
    public JAXBElement<LoadControlLimitDescriptionDataType> createLoadControlLimitDescriptionData(LoadControlLimitDescriptionDataType value) {
        return new JAXBElement<LoadControlLimitDescriptionDataType>(_LoadControlLimitDescriptionData_QNAME, LoadControlLimitDescriptionDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadControlLimitDescriptionDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LoadControlLimitDescriptionDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "loadControlLimitDescriptionDataElements")
    public JAXBElement<LoadControlLimitDescriptionDataElementsType> createLoadControlLimitDescriptionDataElements(LoadControlLimitDescriptionDataElementsType value) {
        return new JAXBElement<LoadControlLimitDescriptionDataElementsType>(_LoadControlLimitDescriptionDataElements_QNAME, LoadControlLimitDescriptionDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadControlLimitDescriptionListDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LoadControlLimitDescriptionListDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "loadControlLimitDescriptionListData")
    public JAXBElement<LoadControlLimitDescriptionListDataType> createLoadControlLimitDescriptionListData(LoadControlLimitDescriptionListDataType value) {
        return new JAXBElement<LoadControlLimitDescriptionListDataType>(_LoadControlLimitDescriptionListData_QNAME, LoadControlLimitDescriptionListDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadControlLimitDescriptionListDataSelectorsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LoadControlLimitDescriptionListDataSelectorsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "loadControlLimitDescriptionListDataSelectors")
    public JAXBElement<LoadControlLimitDescriptionListDataSelectorsType> createLoadControlLimitDescriptionListDataSelectors(LoadControlLimitDescriptionListDataSelectorsType value) {
        return new JAXBElement<LoadControlLimitDescriptionListDataSelectorsType>(_LoadControlLimitDescriptionListDataSelectors_QNAME, LoadControlLimitDescriptionListDataSelectorsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaskManagementJobDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TaskManagementJobDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "taskManagementJobData")
    public JAXBElement<TaskManagementJobDataType> createTaskManagementJobData(TaskManagementJobDataType value) {
        return new JAXBElement<TaskManagementJobDataType>(_TaskManagementJobData_QNAME, TaskManagementJobDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaskManagementJobDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TaskManagementJobDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "taskManagementJobDataElements")
    public JAXBElement<TaskManagementJobDataElementsType> createTaskManagementJobDataElements(TaskManagementJobDataElementsType value) {
        return new JAXBElement<TaskManagementJobDataElementsType>(_TaskManagementJobDataElements_QNAME, TaskManagementJobDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaskManagementJobListDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TaskManagementJobListDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "taskManagementJobListData")
    public JAXBElement<TaskManagementJobListDataType> createTaskManagementJobListData(TaskManagementJobListDataType value) {
        return new JAXBElement<TaskManagementJobListDataType>(_TaskManagementJobListData_QNAME, TaskManagementJobListDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaskManagementJobListDataSelectorsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TaskManagementJobListDataSelectorsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "taskManagementJobListDataSelectors")
    public JAXBElement<TaskManagementJobListDataSelectorsType> createTaskManagementJobListDataSelectors(TaskManagementJobListDataSelectorsType value) {
        return new JAXBElement<TaskManagementJobListDataSelectorsType>(_TaskManagementJobListDataSelectors_QNAME, TaskManagementJobListDataSelectorsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaskManagementJobRelationDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TaskManagementJobRelationDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "taskManagementJobRelationData")
    public JAXBElement<TaskManagementJobRelationDataType> createTaskManagementJobRelationData(TaskManagementJobRelationDataType value) {
        return new JAXBElement<TaskManagementJobRelationDataType>(_TaskManagementJobRelationData_QNAME, TaskManagementJobRelationDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaskManagementJobRelationDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TaskManagementJobRelationDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "taskManagementJobRelationDataElements")
    public JAXBElement<TaskManagementJobRelationDataElementsType> createTaskManagementJobRelationDataElements(TaskManagementJobRelationDataElementsType value) {
        return new JAXBElement<TaskManagementJobRelationDataElementsType>(_TaskManagementJobRelationDataElements_QNAME, TaskManagementJobRelationDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaskManagementJobRelationListDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TaskManagementJobRelationListDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "taskManagementJobRelationListData")
    public JAXBElement<TaskManagementJobRelationListDataType> createTaskManagementJobRelationListData(TaskManagementJobRelationListDataType value) {
        return new JAXBElement<TaskManagementJobRelationListDataType>(_TaskManagementJobRelationListData_QNAME, TaskManagementJobRelationListDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaskManagementJobRelationListDataSelectorsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TaskManagementJobRelationListDataSelectorsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "taskManagementJobRelationListDataSelectors")
    public JAXBElement<TaskManagementJobRelationListDataSelectorsType> createTaskManagementJobRelationListDataSelectors(TaskManagementJobRelationListDataSelectorsType value) {
        return new JAXBElement<TaskManagementJobRelationListDataSelectorsType>(_TaskManagementJobRelationListDataSelectors_QNAME, TaskManagementJobRelationListDataSelectorsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaskManagementJobDescriptionDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TaskManagementJobDescriptionDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "taskManagementJobDescriptionData")
    public JAXBElement<TaskManagementJobDescriptionDataType> createTaskManagementJobDescriptionData(TaskManagementJobDescriptionDataType value) {
        return new JAXBElement<TaskManagementJobDescriptionDataType>(_TaskManagementJobDescriptionData_QNAME, TaskManagementJobDescriptionDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaskManagementJobDescriptionDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TaskManagementJobDescriptionDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "taskManagementJobDescriptionDataElements")
    public JAXBElement<TaskManagementJobDescriptionDataElementsType> createTaskManagementJobDescriptionDataElements(TaskManagementJobDescriptionDataElementsType value) {
        return new JAXBElement<TaskManagementJobDescriptionDataElementsType>(_TaskManagementJobDescriptionDataElements_QNAME, TaskManagementJobDescriptionDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaskManagementJobDescriptionListDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TaskManagementJobDescriptionListDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "taskManagementJobDescriptionListData")
    public JAXBElement<TaskManagementJobDescriptionListDataType> createTaskManagementJobDescriptionListData(TaskManagementJobDescriptionListDataType value) {
        return new JAXBElement<TaskManagementJobDescriptionListDataType>(_TaskManagementJobDescriptionListData_QNAME, TaskManagementJobDescriptionListDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaskManagementJobDescriptionListDataSelectorsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TaskManagementJobDescriptionListDataSelectorsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "taskManagementJobDescriptionListDataSelectors")
    public JAXBElement<TaskManagementJobDescriptionListDataSelectorsType> createTaskManagementJobDescriptionListDataSelectors(TaskManagementJobDescriptionListDataSelectorsType value) {
        return new JAXBElement<TaskManagementJobDescriptionListDataSelectorsType>(_TaskManagementJobDescriptionListDataSelectors_QNAME, TaskManagementJobDescriptionListDataSelectorsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaskManagementOverviewDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TaskManagementOverviewDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "taskManagementOverviewData")
    public JAXBElement<TaskManagementOverviewDataType> createTaskManagementOverviewData(TaskManagementOverviewDataType value) {
        return new JAXBElement<TaskManagementOverviewDataType>(_TaskManagementOverviewData_QNAME, TaskManagementOverviewDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaskManagementOverviewDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TaskManagementOverviewDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "taskManagementOverviewDataElements")
    public JAXBElement<TaskManagementOverviewDataElementsType> createTaskManagementOverviewDataElements(TaskManagementOverviewDataElementsType value) {
        return new JAXBElement<TaskManagementOverviewDataElementsType>(_TaskManagementOverviewDataElements_QNAME, TaskManagementOverviewDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlarmDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AlarmDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "alarmData")
    public JAXBElement<AlarmDataType> createAlarmData(AlarmDataType value) {
        return new JAXBElement<AlarmDataType>(_AlarmData_QNAME, AlarmDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlarmDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AlarmDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "alarmDataElements")
    public JAXBElement<AlarmDataElementsType> createAlarmDataElements(AlarmDataElementsType value) {
        return new JAXBElement<AlarmDataElementsType>(_AlarmDataElements_QNAME, AlarmDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlarmListDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AlarmListDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "alarmListData")
    public JAXBElement<AlarmListDataType> createAlarmListData(AlarmListDataType value) {
        return new JAXBElement<AlarmListDataType>(_AlarmListData_QNAME, AlarmListDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlarmListDataSelectorsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AlarmListDataSelectorsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "alarmListDataSelectors")
    public JAXBElement<AlarmListDataSelectorsType> createAlarmListDataSelectors(AlarmListDataSelectorsType value) {
        return new JAXBElement<AlarmListDataSelectorsType>(_AlarmListDataSelectors_QNAME, AlarmListDataSelectorsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupplyConditionDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SupplyConditionDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "supplyConditionData")
    public JAXBElement<SupplyConditionDataType> createSupplyConditionData(SupplyConditionDataType value) {
        return new JAXBElement<SupplyConditionDataType>(_SupplyConditionData_QNAME, SupplyConditionDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupplyConditionDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SupplyConditionDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "supplyConditionDataElements")
    public JAXBElement<SupplyConditionDataElementsType> createSupplyConditionDataElements(SupplyConditionDataElementsType value) {
        return new JAXBElement<SupplyConditionDataElementsType>(_SupplyConditionDataElements_QNAME, SupplyConditionDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupplyConditionListDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SupplyConditionListDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "supplyConditionListData")
    public JAXBElement<SupplyConditionListDataType> createSupplyConditionListData(SupplyConditionListDataType value) {
        return new JAXBElement<SupplyConditionListDataType>(_SupplyConditionListData_QNAME, SupplyConditionListDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupplyConditionListDataSelectorsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SupplyConditionListDataSelectorsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "supplyConditionListDataSelectors")
    public JAXBElement<SupplyConditionListDataSelectorsType> createSupplyConditionListDataSelectors(SupplyConditionListDataSelectorsType value) {
        return new JAXBElement<SupplyConditionListDataSelectorsType>(_SupplyConditionListDataSelectors_QNAME, SupplyConditionListDataSelectorsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupplyConditionDescriptionDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SupplyConditionDescriptionDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "supplyConditionDescriptionData")
    public JAXBElement<SupplyConditionDescriptionDataType> createSupplyConditionDescriptionData(SupplyConditionDescriptionDataType value) {
        return new JAXBElement<SupplyConditionDescriptionDataType>(_SupplyConditionDescriptionData_QNAME, SupplyConditionDescriptionDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupplyConditionDescriptionDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SupplyConditionDescriptionDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "supplyConditionDescriptionDataElements")
    public JAXBElement<SupplyConditionDescriptionDataElementsType> createSupplyConditionDescriptionDataElements(SupplyConditionDescriptionDataElementsType value) {
        return new JAXBElement<SupplyConditionDescriptionDataElementsType>(_SupplyConditionDescriptionDataElements_QNAME, SupplyConditionDescriptionDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupplyConditionDescriptionListDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SupplyConditionDescriptionListDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "supplyConditionDescriptionListData")
    public JAXBElement<SupplyConditionDescriptionListDataType> createSupplyConditionDescriptionListData(SupplyConditionDescriptionListDataType value) {
        return new JAXBElement<SupplyConditionDescriptionListDataType>(_SupplyConditionDescriptionListData_QNAME, SupplyConditionDescriptionListDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupplyConditionDescriptionListDataSelectorsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SupplyConditionDescriptionListDataSelectorsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "supplyConditionDescriptionListDataSelectors")
    public JAXBElement<SupplyConditionDescriptionListDataSelectorsType> createSupplyConditionDescriptionListDataSelectors(SupplyConditionDescriptionListDataSelectorsType value) {
        return new JAXBElement<SupplyConditionDescriptionListDataSelectorsType>(_SupplyConditionDescriptionListDataSelectors_QNAME, SupplyConditionDescriptionListDataSelectorsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupplyConditionThresholdRelationDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SupplyConditionThresholdRelationDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "supplyConditionThresholdRelationData")
    public JAXBElement<SupplyConditionThresholdRelationDataType> createSupplyConditionThresholdRelationData(SupplyConditionThresholdRelationDataType value) {
        return new JAXBElement<SupplyConditionThresholdRelationDataType>(_SupplyConditionThresholdRelationData_QNAME, SupplyConditionThresholdRelationDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupplyConditionThresholdRelationDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SupplyConditionThresholdRelationDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "supplyConditionThresholdRelationDataElements")
    public JAXBElement<SupplyConditionThresholdRelationDataElementsType> createSupplyConditionThresholdRelationDataElements(SupplyConditionThresholdRelationDataElementsType value) {
        return new JAXBElement<SupplyConditionThresholdRelationDataElementsType>(_SupplyConditionThresholdRelationDataElements_QNAME, SupplyConditionThresholdRelationDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupplyConditionThresholdRelationListDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SupplyConditionThresholdRelationListDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "supplyConditionThresholdRelationListData")
    public JAXBElement<SupplyConditionThresholdRelationListDataType> createSupplyConditionThresholdRelationListData(SupplyConditionThresholdRelationListDataType value) {
        return new JAXBElement<SupplyConditionThresholdRelationListDataType>(_SupplyConditionThresholdRelationListData_QNAME, SupplyConditionThresholdRelationListDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupplyConditionThresholdRelationListDataSelectorsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SupplyConditionThresholdRelationListDataSelectorsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "supplyConditionThresholdRelationListDataSelectors")
    public JAXBElement<SupplyConditionThresholdRelationListDataSelectorsType> createSupplyConditionThresholdRelationListDataSelectors(SupplyConditionThresholdRelationListDataSelectorsType value) {
        return new JAXBElement<SupplyConditionThresholdRelationListDataSelectorsType>(_SupplyConditionThresholdRelationListDataSelectors_QNAME, SupplyConditionThresholdRelationListDataSelectorsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResultDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResultDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "resultData")
    public JAXBElement<ResultDataType> createResultData(ResultDataType value) {
        return new JAXBElement<ResultDataType>(_ResultData_QNAME, ResultDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BindingManagementEntryDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BindingManagementEntryDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "bindingManagementEntryData")
    public JAXBElement<BindingManagementEntryDataType> createBindingManagementEntryData(BindingManagementEntryDataType value) {
        return new JAXBElement<BindingManagementEntryDataType>(_BindingManagementEntryData_QNAME, BindingManagementEntryDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BindingManagementEntryDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BindingManagementEntryDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "bindingManagementEntryDataElements")
    public JAXBElement<BindingManagementEntryDataElementsType> createBindingManagementEntryDataElements(BindingManagementEntryDataElementsType value) {
        return new JAXBElement<BindingManagementEntryDataElementsType>(_BindingManagementEntryDataElements_QNAME, BindingManagementEntryDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BindingManagementEntryListDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BindingManagementEntryListDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "bindingManagementEntryListData")
    public JAXBElement<BindingManagementEntryListDataType> createBindingManagementEntryListData(BindingManagementEntryListDataType value) {
        return new JAXBElement<BindingManagementEntryListDataType>(_BindingManagementEntryListData_QNAME, BindingManagementEntryListDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BindingManagementEntryListDataSelectorsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BindingManagementEntryListDataSelectorsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "bindingManagementEntryListDataSelectors")
    public JAXBElement<BindingManagementEntryListDataSelectorsType> createBindingManagementEntryListDataSelectors(BindingManagementEntryListDataSelectorsType value) {
        return new JAXBElement<BindingManagementEntryListDataSelectorsType>(_BindingManagementEntryListDataSelectors_QNAME, BindingManagementEntryListDataSelectorsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BindingManagementRequestCallType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BindingManagementRequestCallType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "bindingManagementRequestCall")
    public JAXBElement<BindingManagementRequestCallType> createBindingManagementRequestCall(BindingManagementRequestCallType value) {
        return new JAXBElement<BindingManagementRequestCallType>(_BindingManagementRequestCall_QNAME, BindingManagementRequestCallType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BindingManagementRequestCallElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BindingManagementRequestCallElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "bindingManagementRequestCallElements")
    public JAXBElement<BindingManagementRequestCallElementsType> createBindingManagementRequestCallElements(BindingManagementRequestCallElementsType value) {
        return new JAXBElement<BindingManagementRequestCallElementsType>(_BindingManagementRequestCallElements_QNAME, BindingManagementRequestCallElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BindingManagementDeleteCallType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BindingManagementDeleteCallType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "bindingManagementDeleteCall")
    public JAXBElement<BindingManagementDeleteCallType> createBindingManagementDeleteCall(BindingManagementDeleteCallType value) {
        return new JAXBElement<BindingManagementDeleteCallType>(_BindingManagementDeleteCall_QNAME, BindingManagementDeleteCallType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BindingManagementDeleteCallElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BindingManagementDeleteCallElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "bindingManagementDeleteCallElements")
    public JAXBElement<BindingManagementDeleteCallElementsType> createBindingManagementDeleteCallElements(BindingManagementDeleteCallElementsType value) {
        return new JAXBElement<BindingManagementDeleteCallElementsType>(_BindingManagementDeleteCallElements_QNAME, BindingManagementDeleteCallElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TariffOverallConstraintsDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TariffOverallConstraintsDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "tariffOverallConstraintsData")
    public JAXBElement<TariffOverallConstraintsDataType> createTariffOverallConstraintsData(TariffOverallConstraintsDataType value) {
        return new JAXBElement<TariffOverallConstraintsDataType>(_TariffOverallConstraintsData_QNAME, TariffOverallConstraintsDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TariffOverallConstraintsDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TariffOverallConstraintsDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "tariffOverallConstraintsDataElements")
    public JAXBElement<TariffOverallConstraintsDataElementsType> createTariffOverallConstraintsDataElements(TariffOverallConstraintsDataElementsType value) {
        return new JAXBElement<TariffOverallConstraintsDataElementsType>(_TariffOverallConstraintsDataElements_QNAME, TariffOverallConstraintsDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TariffDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TariffDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "tariffData")
    public JAXBElement<TariffDataType> createTariffData(TariffDataType value) {
        return new JAXBElement<TariffDataType>(_TariffData_QNAME, TariffDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TariffDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TariffDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "tariffDataElements")
    public JAXBElement<TariffDataElementsType> createTariffDataElements(TariffDataElementsType value) {
        return new JAXBElement<TariffDataElementsType>(_TariffDataElements_QNAME, TariffDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TariffListDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TariffListDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "tariffListData")
    public JAXBElement<TariffListDataType> createTariffListData(TariffListDataType value) {
        return new JAXBElement<TariffListDataType>(_TariffListData_QNAME, TariffListDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TariffListDataSelectorsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TariffListDataSelectorsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "tariffListDataSelectors")
    public JAXBElement<TariffListDataSelectorsType> createTariffListDataSelectors(TariffListDataSelectorsType value) {
        return new JAXBElement<TariffListDataSelectorsType>(_TariffListDataSelectors_QNAME, TariffListDataSelectorsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TariffTierRelationDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TariffTierRelationDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "tariffTierRelationData")
    public JAXBElement<TariffTierRelationDataType> createTariffTierRelationData(TariffTierRelationDataType value) {
        return new JAXBElement<TariffTierRelationDataType>(_TariffTierRelationData_QNAME, TariffTierRelationDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TariffTierRelationDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TariffTierRelationDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "tariffTierRelationDataElements")
    public JAXBElement<TariffTierRelationDataElementsType> createTariffTierRelationDataElements(TariffTierRelationDataElementsType value) {
        return new JAXBElement<TariffTierRelationDataElementsType>(_TariffTierRelationDataElements_QNAME, TariffTierRelationDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TariffTierRelationListDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TariffTierRelationListDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "tariffTierRelationListData")
    public JAXBElement<TariffTierRelationListDataType> createTariffTierRelationListData(TariffTierRelationListDataType value) {
        return new JAXBElement<TariffTierRelationListDataType>(_TariffTierRelationListData_QNAME, TariffTierRelationListDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TariffTierRelationListDataSelectorsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TariffTierRelationListDataSelectorsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "tariffTierRelationListDataSelectors")
    public JAXBElement<TariffTierRelationListDataSelectorsType> createTariffTierRelationListDataSelectors(TariffTierRelationListDataSelectorsType value) {
        return new JAXBElement<TariffTierRelationListDataSelectorsType>(_TariffTierRelationListDataSelectors_QNAME, TariffTierRelationListDataSelectorsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TariffBoundaryRelationDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TariffBoundaryRelationDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "tariffBoundaryRelationData")
    public JAXBElement<TariffBoundaryRelationDataType> createTariffBoundaryRelationData(TariffBoundaryRelationDataType value) {
        return new JAXBElement<TariffBoundaryRelationDataType>(_TariffBoundaryRelationData_QNAME, TariffBoundaryRelationDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TariffBoundaryRelationDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TariffBoundaryRelationDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "tariffBoundaryRelationDataElements")
    public JAXBElement<TariffBoundaryRelationDataElementsType> createTariffBoundaryRelationDataElements(TariffBoundaryRelationDataElementsType value) {
        return new JAXBElement<TariffBoundaryRelationDataElementsType>(_TariffBoundaryRelationDataElements_QNAME, TariffBoundaryRelationDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TariffBoundaryRelationListDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TariffBoundaryRelationListDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "tariffBoundaryRelationListData")
    public JAXBElement<TariffBoundaryRelationListDataType> createTariffBoundaryRelationListData(TariffBoundaryRelationListDataType value) {
        return new JAXBElement<TariffBoundaryRelationListDataType>(_TariffBoundaryRelationListData_QNAME, TariffBoundaryRelationListDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TariffBoundaryRelationListDataSelectorsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TariffBoundaryRelationListDataSelectorsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "tariffBoundaryRelationListDataSelectors")
    public JAXBElement<TariffBoundaryRelationListDataSelectorsType> createTariffBoundaryRelationListDataSelectors(TariffBoundaryRelationListDataSelectorsType value) {
        return new JAXBElement<TariffBoundaryRelationListDataSelectorsType>(_TariffBoundaryRelationListDataSelectors_QNAME, TariffBoundaryRelationListDataSelectorsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TariffDescriptionDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TariffDescriptionDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "tariffDescriptionData")
    public JAXBElement<TariffDescriptionDataType> createTariffDescriptionData(TariffDescriptionDataType value) {
        return new JAXBElement<TariffDescriptionDataType>(_TariffDescriptionData_QNAME, TariffDescriptionDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TariffDescriptionDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TariffDescriptionDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "tariffDescriptionDataElements")
    public JAXBElement<TariffDescriptionDataElementsType> createTariffDescriptionDataElements(TariffDescriptionDataElementsType value) {
        return new JAXBElement<TariffDescriptionDataElementsType>(_TariffDescriptionDataElements_QNAME, TariffDescriptionDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TariffDescriptionListDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TariffDescriptionListDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "tariffDescriptionListData")
    public JAXBElement<TariffDescriptionListDataType> createTariffDescriptionListData(TariffDescriptionListDataType value) {
        return new JAXBElement<TariffDescriptionListDataType>(_TariffDescriptionListData_QNAME, TariffDescriptionListDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TariffDescriptionListDataSelectorsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TariffDescriptionListDataSelectorsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "tariffDescriptionListDataSelectors")
    public JAXBElement<TariffDescriptionListDataSelectorsType> createTariffDescriptionListDataSelectors(TariffDescriptionListDataSelectorsType value) {
        return new JAXBElement<TariffDescriptionListDataSelectorsType>(_TariffDescriptionListDataSelectors_QNAME, TariffDescriptionListDataSelectorsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TierBoundaryDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TierBoundaryDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "tierBoundaryData")
    public JAXBElement<TierBoundaryDataType> createTierBoundaryData(TierBoundaryDataType value) {
        return new JAXBElement<TierBoundaryDataType>(_TierBoundaryData_QNAME, TierBoundaryDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TierBoundaryDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TierBoundaryDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "tierBoundaryDataElements")
    public JAXBElement<TierBoundaryDataElementsType> createTierBoundaryDataElements(TierBoundaryDataElementsType value) {
        return new JAXBElement<TierBoundaryDataElementsType>(_TierBoundaryDataElements_QNAME, TierBoundaryDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TierBoundaryListDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TierBoundaryListDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "tierBoundaryListData")
    public JAXBElement<TierBoundaryListDataType> createTierBoundaryListData(TierBoundaryListDataType value) {
        return new JAXBElement<TierBoundaryListDataType>(_TierBoundaryListData_QNAME, TierBoundaryListDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TierBoundaryListDataSelectorsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TierBoundaryListDataSelectorsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "tierBoundaryListDataSelectors")
    public JAXBElement<TierBoundaryListDataSelectorsType> createTierBoundaryListDataSelectors(TierBoundaryListDataSelectorsType value) {
        return new JAXBElement<TierBoundaryListDataSelectorsType>(_TierBoundaryListDataSelectors_QNAME, TierBoundaryListDataSelectorsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TierBoundaryDescriptionDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TierBoundaryDescriptionDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "tierBoundaryDescriptionData")
    public JAXBElement<TierBoundaryDescriptionDataType> createTierBoundaryDescriptionData(TierBoundaryDescriptionDataType value) {
        return new JAXBElement<TierBoundaryDescriptionDataType>(_TierBoundaryDescriptionData_QNAME, TierBoundaryDescriptionDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TierBoundaryDescriptionDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TierBoundaryDescriptionDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "tierBoundaryDescriptionDataElements")
    public JAXBElement<TierBoundaryDescriptionDataElementsType> createTierBoundaryDescriptionDataElements(TierBoundaryDescriptionDataElementsType value) {
        return new JAXBElement<TierBoundaryDescriptionDataElementsType>(_TierBoundaryDescriptionDataElements_QNAME, TierBoundaryDescriptionDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TierBoundaryDescriptionListDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TierBoundaryDescriptionListDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "tierBoundaryDescriptionListData")
    public JAXBElement<TierBoundaryDescriptionListDataType> createTierBoundaryDescriptionListData(TierBoundaryDescriptionListDataType value) {
        return new JAXBElement<TierBoundaryDescriptionListDataType>(_TierBoundaryDescriptionListData_QNAME, TierBoundaryDescriptionListDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TierBoundaryDescriptionListDataSelectorsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TierBoundaryDescriptionListDataSelectorsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "tierBoundaryDescriptionListDataSelectors")
    public JAXBElement<TierBoundaryDescriptionListDataSelectorsType> createTierBoundaryDescriptionListDataSelectors(TierBoundaryDescriptionListDataSelectorsType value) {
        return new JAXBElement<TierBoundaryDescriptionListDataSelectorsType>(_TierBoundaryDescriptionListDataSelectors_QNAME, TierBoundaryDescriptionListDataSelectorsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CommodityDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CommodityDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "commodityData")
    public JAXBElement<CommodityDataType> createCommodityData(CommodityDataType value) {
        return new JAXBElement<CommodityDataType>(_CommodityData_QNAME, CommodityDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CommodityDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CommodityDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "commodityDataElements")
    public JAXBElement<CommodityDataElementsType> createCommodityDataElements(CommodityDataElementsType value) {
        return new JAXBElement<CommodityDataElementsType>(_CommodityDataElements_QNAME, CommodityDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CommodityListDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CommodityListDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "commodityListData")
    public JAXBElement<CommodityListDataType> createCommodityListData(CommodityListDataType value) {
        return new JAXBElement<CommodityListDataType>(_CommodityListData_QNAME, CommodityListDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CommodityListDataSelectorsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CommodityListDataSelectorsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "commodityListDataSelectors")
    public JAXBElement<CommodityListDataSelectorsType> createCommodityListDataSelectors(CommodityListDataSelectorsType value) {
        return new JAXBElement<CommodityListDataSelectorsType>(_CommodityListDataSelectors_QNAME, CommodityListDataSelectorsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TierDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TierDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "tierData")
    public JAXBElement<TierDataType> createTierData(TierDataType value) {
        return new JAXBElement<TierDataType>(_TierData_QNAME, TierDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TierDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TierDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "tierDataElements")
    public JAXBElement<TierDataElementsType> createTierDataElements(TierDataElementsType value) {
        return new JAXBElement<TierDataElementsType>(_TierDataElements_QNAME, TierDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TierListDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TierListDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "tierListData")
    public JAXBElement<TierListDataType> createTierListData(TierListDataType value) {
        return new JAXBElement<TierListDataType>(_TierListData_QNAME, TierListDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TierListDataSelectorsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TierListDataSelectorsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "tierListDataSelectors")
    public JAXBElement<TierListDataSelectorsType> createTierListDataSelectors(TierListDataSelectorsType value) {
        return new JAXBElement<TierListDataSelectorsType>(_TierListDataSelectors_QNAME, TierListDataSelectorsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TierIncentiveRelationDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TierIncentiveRelationDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "tierIncentiveRelationData")
    public JAXBElement<TierIncentiveRelationDataType> createTierIncentiveRelationData(TierIncentiveRelationDataType value) {
        return new JAXBElement<TierIncentiveRelationDataType>(_TierIncentiveRelationData_QNAME, TierIncentiveRelationDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TierIncentiveRelationDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TierIncentiveRelationDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "tierIncentiveRelationDataElements")
    public JAXBElement<TierIncentiveRelationDataElementsType> createTierIncentiveRelationDataElements(TierIncentiveRelationDataElementsType value) {
        return new JAXBElement<TierIncentiveRelationDataElementsType>(_TierIncentiveRelationDataElements_QNAME, TierIncentiveRelationDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TierIncentiveRelationListDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TierIncentiveRelationListDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "tierIncentiveRelationListData")
    public JAXBElement<TierIncentiveRelationListDataType> createTierIncentiveRelationListData(TierIncentiveRelationListDataType value) {
        return new JAXBElement<TierIncentiveRelationListDataType>(_TierIncentiveRelationListData_QNAME, TierIncentiveRelationListDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TierIncentiveRelationListDataSelectorsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TierIncentiveRelationListDataSelectorsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "tierIncentiveRelationListDataSelectors")
    public JAXBElement<TierIncentiveRelationListDataSelectorsType> createTierIncentiveRelationListDataSelectors(TierIncentiveRelationListDataSelectorsType value) {
        return new JAXBElement<TierIncentiveRelationListDataSelectorsType>(_TierIncentiveRelationListDataSelectors_QNAME, TierIncentiveRelationListDataSelectorsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TierDescriptionDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TierDescriptionDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "tierDescriptionData")
    public JAXBElement<TierDescriptionDataType> createTierDescriptionData(TierDescriptionDataType value) {
        return new JAXBElement<TierDescriptionDataType>(_TierDescriptionData_QNAME, TierDescriptionDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TierDescriptionDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TierDescriptionDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "tierDescriptionDataElements")
    public JAXBElement<TierDescriptionDataElementsType> createTierDescriptionDataElements(TierDescriptionDataElementsType value) {
        return new JAXBElement<TierDescriptionDataElementsType>(_TierDescriptionDataElements_QNAME, TierDescriptionDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TierDescriptionListDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TierDescriptionListDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "tierDescriptionListData")
    public JAXBElement<TierDescriptionListDataType> createTierDescriptionListData(TierDescriptionListDataType value) {
        return new JAXBElement<TierDescriptionListDataType>(_TierDescriptionListData_QNAME, TierDescriptionListDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TierDescriptionListDataSelectorsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TierDescriptionListDataSelectorsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "tierDescriptionListDataSelectors")
    public JAXBElement<TierDescriptionListDataSelectorsType> createTierDescriptionListDataSelectors(TierDescriptionListDataSelectorsType value) {
        return new JAXBElement<TierDescriptionListDataSelectorsType>(_TierDescriptionListDataSelectors_QNAME, TierDescriptionListDataSelectorsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IncentiveDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IncentiveDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "incentiveData")
    public JAXBElement<IncentiveDataType> createIncentiveData(IncentiveDataType value) {
        return new JAXBElement<IncentiveDataType>(_IncentiveData_QNAME, IncentiveDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IncentiveDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IncentiveDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "incentiveDataElements")
    public JAXBElement<IncentiveDataElementsType> createIncentiveDataElements(IncentiveDataElementsType value) {
        return new JAXBElement<IncentiveDataElementsType>(_IncentiveDataElements_QNAME, IncentiveDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IncentiveListDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IncentiveListDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "incentiveListData")
    public JAXBElement<IncentiveListDataType> createIncentiveListData(IncentiveListDataType value) {
        return new JAXBElement<IncentiveListDataType>(_IncentiveListData_QNAME, IncentiveListDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IncentiveListDataSelectorsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IncentiveListDataSelectorsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "incentiveListDataSelectors")
    public JAXBElement<IncentiveListDataSelectorsType> createIncentiveListDataSelectors(IncentiveListDataSelectorsType value) {
        return new JAXBElement<IncentiveListDataSelectorsType>(_IncentiveListDataSelectors_QNAME, IncentiveListDataSelectorsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IncentiveDescriptionDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IncentiveDescriptionDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "incentiveDescriptionData")
    public JAXBElement<IncentiveDescriptionDataType> createIncentiveDescriptionData(IncentiveDescriptionDataType value) {
        return new JAXBElement<IncentiveDescriptionDataType>(_IncentiveDescriptionData_QNAME, IncentiveDescriptionDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IncentiveDescriptionDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IncentiveDescriptionDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "incentiveDescriptionDataElements")
    public JAXBElement<IncentiveDescriptionDataElementsType> createIncentiveDescriptionDataElements(IncentiveDescriptionDataElementsType value) {
        return new JAXBElement<IncentiveDescriptionDataElementsType>(_IncentiveDescriptionDataElements_QNAME, IncentiveDescriptionDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IncentiveDescriptionListDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IncentiveDescriptionListDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "incentiveDescriptionListData")
    public JAXBElement<IncentiveDescriptionListDataType> createIncentiveDescriptionListData(IncentiveDescriptionListDataType value) {
        return new JAXBElement<IncentiveDescriptionListDataType>(_IncentiveDescriptionListData_QNAME, IncentiveDescriptionListDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IncentiveDescriptionListDataSelectorsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IncentiveDescriptionListDataSelectorsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "incentiveDescriptionListDataSelectors")
    public JAXBElement<IncentiveDescriptionListDataSelectorsType> createIncentiveDescriptionListDataSelectors(IncentiveDescriptionListDataSelectorsType value) {
        return new JAXBElement<IncentiveDescriptionListDataSelectorsType>(_IncentiveDescriptionListDataSelectors_QNAME, IncentiveDescriptionListDataSelectorsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActuatorLevelDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ActuatorLevelDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "actuatorLevelData")
    public JAXBElement<ActuatorLevelDataType> createActuatorLevelData(ActuatorLevelDataType value) {
        return new JAXBElement<ActuatorLevelDataType>(_ActuatorLevelData_QNAME, ActuatorLevelDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActuatorLevelDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ActuatorLevelDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "actuatorLevelDataElements")
    public JAXBElement<ActuatorLevelDataElementsType> createActuatorLevelDataElements(ActuatorLevelDataElementsType value) {
        return new JAXBElement<ActuatorLevelDataElementsType>(_ActuatorLevelDataElements_QNAME, ActuatorLevelDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActuatorLevelDescriptionDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ActuatorLevelDescriptionDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "actuatorLevelDescriptionData")
    public JAXBElement<ActuatorLevelDescriptionDataType> createActuatorLevelDescriptionData(ActuatorLevelDescriptionDataType value) {
        return new JAXBElement<ActuatorLevelDescriptionDataType>(_ActuatorLevelDescriptionData_QNAME, ActuatorLevelDescriptionDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActuatorLevelDescriptionDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ActuatorLevelDescriptionDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "actuatorLevelDescriptionDataElements")
    public JAXBElement<ActuatorLevelDescriptionDataElementsType> createActuatorLevelDescriptionDataElements(ActuatorLevelDescriptionDataElementsType value) {
        return new JAXBElement<ActuatorLevelDescriptionDataElementsType>(_ActuatorLevelDescriptionDataElements_QNAME, ActuatorLevelDescriptionDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdentificationDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IdentificationDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "identificationData")
    public JAXBElement<IdentificationDataType> createIdentificationData(IdentificationDataType value) {
        return new JAXBElement<IdentificationDataType>(_IdentificationData_QNAME, IdentificationDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdentificationDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IdentificationDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "identificationDataElements")
    public JAXBElement<IdentificationDataElementsType> createIdentificationDataElements(IdentificationDataElementsType value) {
        return new JAXBElement<IdentificationDataElementsType>(_IdentificationDataElements_QNAME, IdentificationDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdentificationListDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IdentificationListDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "identificationListData")
    public JAXBElement<IdentificationListDataType> createIdentificationListData(IdentificationListDataType value) {
        return new JAXBElement<IdentificationListDataType>(_IdentificationListData_QNAME, IdentificationListDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdentificationListDataSelectorsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IdentificationListDataSelectorsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "identificationListDataSelectors")
    public JAXBElement<IdentificationListDataSelectorsType> createIdentificationListDataSelectors(IdentificationListDataSelectorsType value) {
        return new JAXBElement<IdentificationListDataSelectorsType>(_IdentificationListDataSelectors_QNAME, IdentificationListDataSelectorsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SessionIdentificationDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SessionIdentificationDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "sessionIdentificationData")
    public JAXBElement<SessionIdentificationDataType> createSessionIdentificationData(SessionIdentificationDataType value) {
        return new JAXBElement<SessionIdentificationDataType>(_SessionIdentificationData_QNAME, SessionIdentificationDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SessionIdentificationDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SessionIdentificationDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "sessionIdentificationDataElements")
    public JAXBElement<SessionIdentificationDataElementsType> createSessionIdentificationDataElements(SessionIdentificationDataElementsType value) {
        return new JAXBElement<SessionIdentificationDataElementsType>(_SessionIdentificationDataElements_QNAME, SessionIdentificationDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SessionIdentificationListDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SessionIdentificationListDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "sessionIdentificationListData")
    public JAXBElement<SessionIdentificationListDataType> createSessionIdentificationListData(SessionIdentificationListDataType value) {
        return new JAXBElement<SessionIdentificationListDataType>(_SessionIdentificationListData_QNAME, SessionIdentificationListDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SessionIdentificationListDataSelectorsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SessionIdentificationListDataSelectorsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "sessionIdentificationListDataSelectors")
    public JAXBElement<SessionIdentificationListDataSelectorsType> createSessionIdentificationListDataSelectors(SessionIdentificationListDataSelectorsType value) {
        return new JAXBElement<SessionIdentificationListDataSelectorsType>(_SessionIdentificationListDataSelectors_QNAME, SessionIdentificationListDataSelectorsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SessionMeasurementRelationDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SessionMeasurementRelationDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "sessionMeasurementRelationData")
    public JAXBElement<SessionMeasurementRelationDataType> createSessionMeasurementRelationData(SessionMeasurementRelationDataType value) {
        return new JAXBElement<SessionMeasurementRelationDataType>(_SessionMeasurementRelationData_QNAME, SessionMeasurementRelationDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SessionMeasurementRelationDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SessionMeasurementRelationDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "sessionMeasurementRelationDataElements")
    public JAXBElement<SessionMeasurementRelationDataElementsType> createSessionMeasurementRelationDataElements(SessionMeasurementRelationDataElementsType value) {
        return new JAXBElement<SessionMeasurementRelationDataElementsType>(_SessionMeasurementRelationDataElements_QNAME, SessionMeasurementRelationDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SessionMeasurementRelationListDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SessionMeasurementRelationListDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "sessionMeasurementRelationListData")
    public JAXBElement<SessionMeasurementRelationListDataType> createSessionMeasurementRelationListData(SessionMeasurementRelationListDataType value) {
        return new JAXBElement<SessionMeasurementRelationListDataType>(_SessionMeasurementRelationListData_QNAME, SessionMeasurementRelationListDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SessionMeasurementRelationListDataSelectorsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SessionMeasurementRelationListDataSelectorsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "sessionMeasurementRelationListDataSelectors")
    public JAXBElement<SessionMeasurementRelationListDataSelectorsType> createSessionMeasurementRelationListDataSelectors(SessionMeasurementRelationListDataSelectorsType value) {
        return new JAXBElement<SessionMeasurementRelationListDataSelectorsType>(_SessionMeasurementRelationListDataSelectors_QNAME, SessionMeasurementRelationListDataSelectorsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BillDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BillDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "billData")
    public JAXBElement<BillDataType> createBillData(BillDataType value) {
        return new JAXBElement<BillDataType>(_BillData_QNAME, BillDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BillDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BillDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "billDataElements")
    public JAXBElement<BillDataElementsType> createBillDataElements(BillDataElementsType value) {
        return new JAXBElement<BillDataElementsType>(_BillDataElements_QNAME, BillDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BillListDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BillListDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "billListData")
    public JAXBElement<BillListDataType> createBillListData(BillListDataType value) {
        return new JAXBElement<BillListDataType>(_BillListData_QNAME, BillListDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BillListDataSelectorsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BillListDataSelectorsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "billListDataSelectors")
    public JAXBElement<BillListDataSelectorsType> createBillListDataSelectors(BillListDataSelectorsType value) {
        return new JAXBElement<BillListDataSelectorsType>(_BillListDataSelectors_QNAME, BillListDataSelectorsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BillConstraintsDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BillConstraintsDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "billConstraintsData")
    public JAXBElement<BillConstraintsDataType> createBillConstraintsData(BillConstraintsDataType value) {
        return new JAXBElement<BillConstraintsDataType>(_BillConstraintsData_QNAME, BillConstraintsDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BillConstraintsDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BillConstraintsDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "billConstraintsDataElements")
    public JAXBElement<BillConstraintsDataElementsType> createBillConstraintsDataElements(BillConstraintsDataElementsType value) {
        return new JAXBElement<BillConstraintsDataElementsType>(_BillConstraintsDataElements_QNAME, BillConstraintsDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BillConstraintsListDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BillConstraintsListDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "billConstraintsListData")
    public JAXBElement<BillConstraintsListDataType> createBillConstraintsListData(BillConstraintsListDataType value) {
        return new JAXBElement<BillConstraintsListDataType>(_BillConstraintsListData_QNAME, BillConstraintsListDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BillConstraintsListDataSelectorsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BillConstraintsListDataSelectorsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "billConstraintsListDataSelectors")
    public JAXBElement<BillConstraintsListDataSelectorsType> createBillConstraintsListDataSelectors(BillConstraintsListDataSelectorsType value) {
        return new JAXBElement<BillConstraintsListDataSelectorsType>(_BillConstraintsListDataSelectors_QNAME, BillConstraintsListDataSelectorsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BillDescriptionDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BillDescriptionDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "billDescriptionData")
    public JAXBElement<BillDescriptionDataType> createBillDescriptionData(BillDescriptionDataType value) {
        return new JAXBElement<BillDescriptionDataType>(_BillDescriptionData_QNAME, BillDescriptionDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BillDescriptionDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BillDescriptionDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "billDescriptionDataElements")
    public JAXBElement<BillDescriptionDataElementsType> createBillDescriptionDataElements(BillDescriptionDataElementsType value) {
        return new JAXBElement<BillDescriptionDataElementsType>(_BillDescriptionDataElements_QNAME, BillDescriptionDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BillDescriptionListDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BillDescriptionListDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "billDescriptionListData")
    public JAXBElement<BillDescriptionListDataType> createBillDescriptionListData(BillDescriptionListDataType value) {
        return new JAXBElement<BillDescriptionListDataType>(_BillDescriptionListData_QNAME, BillDescriptionListDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BillDescriptionListDataSelectorsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BillDescriptionListDataSelectorsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "billDescriptionListDataSelectors")
    public JAXBElement<BillDescriptionListDataSelectorsType> createBillDescriptionListDataSelectors(BillDescriptionListDataSelectorsType value) {
        return new JAXBElement<BillDescriptionListDataSelectorsType>(_BillDescriptionListDataSelectors_QNAME, BillDescriptionListDataSelectorsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataTunnelingCallType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DataTunnelingCallType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "dataTunnelingCall")
    public JAXBElement<DataTunnelingCallType> createDataTunnelingCall(DataTunnelingCallType value) {
        return new JAXBElement<DataTunnelingCallType>(_DataTunnelingCall_QNAME, DataTunnelingCallType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataTunnelingCallElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DataTunnelingCallElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "dataTunnelingCallElements")
    public JAXBElement<DataTunnelingCallElementsType> createDataTunnelingCallElements(DataTunnelingCallElementsType value) {
        return new JAXBElement<DataTunnelingCallElementsType>(_DataTunnelingCallElements_QNAME, DataTunnelingCallElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeviceClassificationManufacturerDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeviceClassificationManufacturerDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "deviceClassificationManufacturerData")
    public JAXBElement<DeviceClassificationManufacturerDataType> createDeviceClassificationManufacturerData(DeviceClassificationManufacturerDataType value) {
        return new JAXBElement<DeviceClassificationManufacturerDataType>(_DeviceClassificationManufacturerData_QNAME, DeviceClassificationManufacturerDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeviceClassificationManufacturerDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeviceClassificationManufacturerDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "deviceClassificationManufacturerDataElements")
    public JAXBElement<DeviceClassificationManufacturerDataElementsType> createDeviceClassificationManufacturerDataElements(DeviceClassificationManufacturerDataElementsType value) {
        return new JAXBElement<DeviceClassificationManufacturerDataElementsType>(_DeviceClassificationManufacturerDataElements_QNAME, DeviceClassificationManufacturerDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeviceClassificationUserDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeviceClassificationUserDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "deviceClassificationUserData")
    public JAXBElement<DeviceClassificationUserDataType> createDeviceClassificationUserData(DeviceClassificationUserDataType value) {
        return new JAXBElement<DeviceClassificationUserDataType>(_DeviceClassificationUserData_QNAME, DeviceClassificationUserDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeviceClassificationUserDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeviceClassificationUserDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "deviceClassificationUserDataElements")
    public JAXBElement<DeviceClassificationUserDataElementsType> createDeviceClassificationUserDataElements(DeviceClassificationUserDataElementsType value) {
        return new JAXBElement<DeviceClassificationUserDataElementsType>(_DeviceClassificationUserDataElements_QNAME, DeviceClassificationUserDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeviceDiagnosisStateDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeviceDiagnosisStateDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "deviceDiagnosisStateData")
    public JAXBElement<DeviceDiagnosisStateDataType> createDeviceDiagnosisStateData(DeviceDiagnosisStateDataType value) {
        return new JAXBElement<DeviceDiagnosisStateDataType>(_DeviceDiagnosisStateData_QNAME, DeviceDiagnosisStateDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeviceDiagnosisStateDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeviceDiagnosisStateDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "deviceDiagnosisStateDataElements")
    public JAXBElement<DeviceDiagnosisStateDataElementsType> createDeviceDiagnosisStateDataElements(DeviceDiagnosisStateDataElementsType value) {
        return new JAXBElement<DeviceDiagnosisStateDataElementsType>(_DeviceDiagnosisStateDataElements_QNAME, DeviceDiagnosisStateDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeviceDiagnosisHeartbeatDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeviceDiagnosisHeartbeatDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "deviceDiagnosisHeartbeatData")
    public JAXBElement<DeviceDiagnosisHeartbeatDataType> createDeviceDiagnosisHeartbeatData(DeviceDiagnosisHeartbeatDataType value) {
        return new JAXBElement<DeviceDiagnosisHeartbeatDataType>(_DeviceDiagnosisHeartbeatData_QNAME, DeviceDiagnosisHeartbeatDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeviceDiagnosisHeartbeatDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeviceDiagnosisHeartbeatDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "deviceDiagnosisHeartbeatDataElements")
    public JAXBElement<DeviceDiagnosisHeartbeatDataElementsType> createDeviceDiagnosisHeartbeatDataElements(DeviceDiagnosisHeartbeatDataElementsType value) {
        return new JAXBElement<DeviceDiagnosisHeartbeatDataElementsType>(_DeviceDiagnosisHeartbeatDataElements_QNAME, DeviceDiagnosisHeartbeatDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeviceDiagnosisServiceDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeviceDiagnosisServiceDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "deviceDiagnosisServiceData")
    public JAXBElement<DeviceDiagnosisServiceDataType> createDeviceDiagnosisServiceData(DeviceDiagnosisServiceDataType value) {
        return new JAXBElement<DeviceDiagnosisServiceDataType>(_DeviceDiagnosisServiceData_QNAME, DeviceDiagnosisServiceDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeviceDiagnosisServiceDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeviceDiagnosisServiceDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "deviceDiagnosisServiceDataElements")
    public JAXBElement<DeviceDiagnosisServiceDataElementsType> createDeviceDiagnosisServiceDataElements(DeviceDiagnosisServiceDataElementsType value) {
        return new JAXBElement<DeviceDiagnosisServiceDataElementsType>(_DeviceDiagnosisServiceDataElements_QNAME, DeviceDiagnosisServiceDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ElectricalConnectionParameterDescriptionDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ElectricalConnectionParameterDescriptionDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "electricalConnectionParameterDescriptionData")
    public JAXBElement<ElectricalConnectionParameterDescriptionDataType> createElectricalConnectionParameterDescriptionData(ElectricalConnectionParameterDescriptionDataType value) {
        return new JAXBElement<ElectricalConnectionParameterDescriptionDataType>(_ElectricalConnectionParameterDescriptionData_QNAME, ElectricalConnectionParameterDescriptionDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ElectricalConnectionParameterDescriptionDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ElectricalConnectionParameterDescriptionDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "electricalConnectionParameterDescriptionDataElements")
    public JAXBElement<ElectricalConnectionParameterDescriptionDataElementsType> createElectricalConnectionParameterDescriptionDataElements(ElectricalConnectionParameterDescriptionDataElementsType value) {
        return new JAXBElement<ElectricalConnectionParameterDescriptionDataElementsType>(_ElectricalConnectionParameterDescriptionDataElements_QNAME, ElectricalConnectionParameterDescriptionDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ElectricalConnectionParameterDescriptionListDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ElectricalConnectionParameterDescriptionListDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "electricalConnectionParameterDescriptionListData")
    public JAXBElement<ElectricalConnectionParameterDescriptionListDataType> createElectricalConnectionParameterDescriptionListData(ElectricalConnectionParameterDescriptionListDataType value) {
        return new JAXBElement<ElectricalConnectionParameterDescriptionListDataType>(_ElectricalConnectionParameterDescriptionListData_QNAME, ElectricalConnectionParameterDescriptionListDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ElectricalConnectionParameterDescriptionListDataSelectorsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ElectricalConnectionParameterDescriptionListDataSelectorsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "electricalConnectionParameterDescriptionListDataSelectors")
    public JAXBElement<ElectricalConnectionParameterDescriptionListDataSelectorsType> createElectricalConnectionParameterDescriptionListDataSelectors(ElectricalConnectionParameterDescriptionListDataSelectorsType value) {
        return new JAXBElement<ElectricalConnectionParameterDescriptionListDataSelectorsType>(_ElectricalConnectionParameterDescriptionListDataSelectors_QNAME, ElectricalConnectionParameterDescriptionListDataSelectorsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ElectricalConnectionPermittedValueSetDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ElectricalConnectionPermittedValueSetDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "electricalConnectionPermittedValueSetData")
    public JAXBElement<ElectricalConnectionPermittedValueSetDataType> createElectricalConnectionPermittedValueSetData(ElectricalConnectionPermittedValueSetDataType value) {
        return new JAXBElement<ElectricalConnectionPermittedValueSetDataType>(_ElectricalConnectionPermittedValueSetData_QNAME, ElectricalConnectionPermittedValueSetDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ElectricalConnectionPermittedValueSetDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ElectricalConnectionPermittedValueSetDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "electricalConnectionPermittedValueSetDataElements")
    public JAXBElement<ElectricalConnectionPermittedValueSetDataElementsType> createElectricalConnectionPermittedValueSetDataElements(ElectricalConnectionPermittedValueSetDataElementsType value) {
        return new JAXBElement<ElectricalConnectionPermittedValueSetDataElementsType>(_ElectricalConnectionPermittedValueSetDataElements_QNAME, ElectricalConnectionPermittedValueSetDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ElectricalConnectionPermittedValueSetListDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ElectricalConnectionPermittedValueSetListDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "electricalConnectionPermittedValueSetListData")
    public JAXBElement<ElectricalConnectionPermittedValueSetListDataType> createElectricalConnectionPermittedValueSetListData(ElectricalConnectionPermittedValueSetListDataType value) {
        return new JAXBElement<ElectricalConnectionPermittedValueSetListDataType>(_ElectricalConnectionPermittedValueSetListData_QNAME, ElectricalConnectionPermittedValueSetListDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ElectricalConnectionPermittedValueSetListDataSelectorsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ElectricalConnectionPermittedValueSetListDataSelectorsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "electricalConnectionPermittedValueSetListDataSelectors")
    public JAXBElement<ElectricalConnectionPermittedValueSetListDataSelectorsType> createElectricalConnectionPermittedValueSetListDataSelectors(ElectricalConnectionPermittedValueSetListDataSelectorsType value) {
        return new JAXBElement<ElectricalConnectionPermittedValueSetListDataSelectorsType>(_ElectricalConnectionPermittedValueSetListDataSelectors_QNAME, ElectricalConnectionPermittedValueSetListDataSelectorsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ElectricalConnectionCharacteristicDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ElectricalConnectionCharacteristicDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "electricalConnectionCharacteristicData")
    public JAXBElement<ElectricalConnectionCharacteristicDataType> createElectricalConnectionCharacteristicData(ElectricalConnectionCharacteristicDataType value) {
        return new JAXBElement<ElectricalConnectionCharacteristicDataType>(_ElectricalConnectionCharacteristicData_QNAME, ElectricalConnectionCharacteristicDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ElectricalConnectionCharacteristicDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ElectricalConnectionCharacteristicDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "electricalConnectionCharacteristicDataElements")
    public JAXBElement<ElectricalConnectionCharacteristicDataElementsType> createElectricalConnectionCharacteristicDataElements(ElectricalConnectionCharacteristicDataElementsType value) {
        return new JAXBElement<ElectricalConnectionCharacteristicDataElementsType>(_ElectricalConnectionCharacteristicDataElements_QNAME, ElectricalConnectionCharacteristicDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ElectricalConnectionCharacteristicListDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ElectricalConnectionCharacteristicListDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "electricalConnectionCharacteristicListData")
    public JAXBElement<ElectricalConnectionCharacteristicListDataType> createElectricalConnectionCharacteristicListData(ElectricalConnectionCharacteristicListDataType value) {
        return new JAXBElement<ElectricalConnectionCharacteristicListDataType>(_ElectricalConnectionCharacteristicListData_QNAME, ElectricalConnectionCharacteristicListDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ElectricalConnectionCharacteristicListDataSelectorsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ElectricalConnectionCharacteristicListDataSelectorsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "electricalConnectionCharacteristicListDataSelectors")
    public JAXBElement<ElectricalConnectionCharacteristicListDataSelectorsType> createElectricalConnectionCharacteristicListDataSelectors(ElectricalConnectionCharacteristicListDataSelectorsType value) {
        return new JAXBElement<ElectricalConnectionCharacteristicListDataSelectorsType>(_ElectricalConnectionCharacteristicListDataSelectors_QNAME, ElectricalConnectionCharacteristicListDataSelectorsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ElectricalConnectionStateDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ElectricalConnectionStateDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "electricalConnectionStateData")
    public JAXBElement<ElectricalConnectionStateDataType> createElectricalConnectionStateData(ElectricalConnectionStateDataType value) {
        return new JAXBElement<ElectricalConnectionStateDataType>(_ElectricalConnectionStateData_QNAME, ElectricalConnectionStateDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ElectricalConnectionStateDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ElectricalConnectionStateDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "electricalConnectionStateDataElements")
    public JAXBElement<ElectricalConnectionStateDataElementsType> createElectricalConnectionStateDataElements(ElectricalConnectionStateDataElementsType value) {
        return new JAXBElement<ElectricalConnectionStateDataElementsType>(_ElectricalConnectionStateDataElements_QNAME, ElectricalConnectionStateDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ElectricalConnectionStateListDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ElectricalConnectionStateListDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "electricalConnectionStateListData")
    public JAXBElement<ElectricalConnectionStateListDataType> createElectricalConnectionStateListData(ElectricalConnectionStateListDataType value) {
        return new JAXBElement<ElectricalConnectionStateListDataType>(_ElectricalConnectionStateListData_QNAME, ElectricalConnectionStateListDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ElectricalConnectionStateListDataSelectorsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ElectricalConnectionStateListDataSelectorsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "electricalConnectionStateListDataSelectors")
    public JAXBElement<ElectricalConnectionStateListDataSelectorsType> createElectricalConnectionStateListDataSelectors(ElectricalConnectionStateListDataSelectorsType value) {
        return new JAXBElement<ElectricalConnectionStateListDataSelectorsType>(_ElectricalConnectionStateListDataSelectors_QNAME, ElectricalConnectionStateListDataSelectorsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ElectricalConnectionDescriptionDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ElectricalConnectionDescriptionDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "electricalConnectionDescriptionData")
    public JAXBElement<ElectricalConnectionDescriptionDataType> createElectricalConnectionDescriptionData(ElectricalConnectionDescriptionDataType value) {
        return new JAXBElement<ElectricalConnectionDescriptionDataType>(_ElectricalConnectionDescriptionData_QNAME, ElectricalConnectionDescriptionDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ElectricalConnectionDescriptionDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ElectricalConnectionDescriptionDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "electricalConnectionDescriptionDataElements")
    public JAXBElement<ElectricalConnectionDescriptionDataElementsType> createElectricalConnectionDescriptionDataElements(ElectricalConnectionDescriptionDataElementsType value) {
        return new JAXBElement<ElectricalConnectionDescriptionDataElementsType>(_ElectricalConnectionDescriptionDataElements_QNAME, ElectricalConnectionDescriptionDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ElectricalConnectionDescriptionListDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ElectricalConnectionDescriptionListDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "electricalConnectionDescriptionListData")
    public JAXBElement<ElectricalConnectionDescriptionListDataType> createElectricalConnectionDescriptionListData(ElectricalConnectionDescriptionListDataType value) {
        return new JAXBElement<ElectricalConnectionDescriptionListDataType>(_ElectricalConnectionDescriptionListData_QNAME, ElectricalConnectionDescriptionListDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ElectricalConnectionDescriptionListDataSelectorsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ElectricalConnectionDescriptionListDataSelectorsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "electricalConnectionDescriptionListDataSelectors")
    public JAXBElement<ElectricalConnectionDescriptionListDataSelectorsType> createElectricalConnectionDescriptionListDataSelectors(ElectricalConnectionDescriptionListDataSelectorsType value) {
        return new JAXBElement<ElectricalConnectionDescriptionListDataSelectorsType>(_ElectricalConnectionDescriptionListDataSelectors_QNAME, ElectricalConnectionDescriptionListDataSelectorsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IncentiveTableDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IncentiveTableDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "incentiveTableData")
    public JAXBElement<IncentiveTableDataType> createIncentiveTableData(IncentiveTableDataType value) {
        return new JAXBElement<IncentiveTableDataType>(_IncentiveTableData_QNAME, IncentiveTableDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IncentiveTableDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IncentiveTableDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "incentiveTableDataElements")
    public JAXBElement<IncentiveTableDataElementsType> createIncentiveTableDataElements(IncentiveTableDataElementsType value) {
        return new JAXBElement<IncentiveTableDataElementsType>(_IncentiveTableDataElements_QNAME, IncentiveTableDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IncentiveTableDataSelectorsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IncentiveTableDataSelectorsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "incentiveTableDataSelectors")
    public JAXBElement<IncentiveTableDataSelectorsType> createIncentiveTableDataSelectors(IncentiveTableDataSelectorsType value) {
        return new JAXBElement<IncentiveTableDataSelectorsType>(_IncentiveTableDataSelectors_QNAME, IncentiveTableDataSelectorsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IncentiveTableDescriptionDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IncentiveTableDescriptionDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "incentiveTableDescriptionData")
    public JAXBElement<IncentiveTableDescriptionDataType> createIncentiveTableDescriptionData(IncentiveTableDescriptionDataType value) {
        return new JAXBElement<IncentiveTableDescriptionDataType>(_IncentiveTableDescriptionData_QNAME, IncentiveTableDescriptionDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IncentiveTableDescriptionDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IncentiveTableDescriptionDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "incentiveTableDescriptionDataElements")
    public JAXBElement<IncentiveTableDescriptionDataElementsType> createIncentiveTableDescriptionDataElements(IncentiveTableDescriptionDataElementsType value) {
        return new JAXBElement<IncentiveTableDescriptionDataElementsType>(_IncentiveTableDescriptionDataElements_QNAME, IncentiveTableDescriptionDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IncentiveTableDescriptionDataSelectorsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IncentiveTableDescriptionDataSelectorsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "incentiveTableDescriptionDataSelectors")
    public JAXBElement<IncentiveTableDescriptionDataSelectorsType> createIncentiveTableDescriptionDataSelectors(IncentiveTableDescriptionDataSelectorsType value) {
        return new JAXBElement<IncentiveTableDescriptionDataSelectorsType>(_IncentiveTableDescriptionDataSelectors_QNAME, IncentiveTableDescriptionDataSelectorsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IncentiveTableConstraintsDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IncentiveTableConstraintsDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "incentiveTableConstraintsData")
    public JAXBElement<IncentiveTableConstraintsDataType> createIncentiveTableConstraintsData(IncentiveTableConstraintsDataType value) {
        return new JAXBElement<IncentiveTableConstraintsDataType>(_IncentiveTableConstraintsData_QNAME, IncentiveTableConstraintsDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IncentiveTableConstraintsDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IncentiveTableConstraintsDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "incentiveTableConstraintsDataElements")
    public JAXBElement<IncentiveTableConstraintsDataElementsType> createIncentiveTableConstraintsDataElements(IncentiveTableConstraintsDataElementsType value) {
        return new JAXBElement<IncentiveTableConstraintsDataElementsType>(_IncentiveTableConstraintsDataElements_QNAME, IncentiveTableConstraintsDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IncentiveTableConstraintsDataSelectorsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IncentiveTableConstraintsDataSelectorsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "incentiveTableConstraintsDataSelectors")
    public JAXBElement<IncentiveTableConstraintsDataSelectorsType> createIncentiveTableConstraintsDataSelectors(IncentiveTableConstraintsDataSelectorsType value) {
        return new JAXBElement<IncentiveTableConstraintsDataSelectorsType>(_IncentiveTableConstraintsDataSelectors_QNAME, IncentiveTableConstraintsDataSelectorsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MessagingDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MessagingDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "messagingData")
    public JAXBElement<MessagingDataType> createMessagingData(MessagingDataType value) {
        return new JAXBElement<MessagingDataType>(_MessagingData_QNAME, MessagingDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MessagingDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MessagingDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "messagingDataElements")
    public JAXBElement<MessagingDataElementsType> createMessagingDataElements(MessagingDataElementsType value) {
        return new JAXBElement<MessagingDataElementsType>(_MessagingDataElements_QNAME, MessagingDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MessagingListDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MessagingListDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "messagingListData")
    public JAXBElement<MessagingListDataType> createMessagingListData(MessagingListDataType value) {
        return new JAXBElement<MessagingListDataType>(_MessagingListData_QNAME, MessagingListDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MessagingListDataSelectorsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MessagingListDataSelectorsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "messagingListDataSelectors")
    public JAXBElement<MessagingListDataSelectorsType> createMessagingListDataSelectors(MessagingListDataSelectorsType value) {
        return new JAXBElement<MessagingListDataSelectorsType>(_MessagingListDataSelectors_QNAME, MessagingListDataSelectorsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NetworkManagementAddNodeCallType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NetworkManagementAddNodeCallType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "networkManagementAddNodeCall")
    public JAXBElement<NetworkManagementAddNodeCallType> createNetworkManagementAddNodeCall(NetworkManagementAddNodeCallType value) {
        return new JAXBElement<NetworkManagementAddNodeCallType>(_NetworkManagementAddNodeCall_QNAME, NetworkManagementAddNodeCallType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NetworkManagementAddNodeCallElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NetworkManagementAddNodeCallElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "networkManagementAddNodeCallElements")
    public JAXBElement<NetworkManagementAddNodeCallElementsType> createNetworkManagementAddNodeCallElements(NetworkManagementAddNodeCallElementsType value) {
        return new JAXBElement<NetworkManagementAddNodeCallElementsType>(_NetworkManagementAddNodeCallElements_QNAME, NetworkManagementAddNodeCallElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NetworkManagementRemoveNodeCallType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NetworkManagementRemoveNodeCallType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "networkManagementRemoveNodeCall")
    public JAXBElement<NetworkManagementRemoveNodeCallType> createNetworkManagementRemoveNodeCall(NetworkManagementRemoveNodeCallType value) {
        return new JAXBElement<NetworkManagementRemoveNodeCallType>(_NetworkManagementRemoveNodeCall_QNAME, NetworkManagementRemoveNodeCallType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NetworkManagementRemoveNodeCallElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NetworkManagementRemoveNodeCallElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "networkManagementRemoveNodeCallElements")
    public JAXBElement<NetworkManagementRemoveNodeCallElementsType> createNetworkManagementRemoveNodeCallElements(NetworkManagementRemoveNodeCallElementsType value) {
        return new JAXBElement<NetworkManagementRemoveNodeCallElementsType>(_NetworkManagementRemoveNodeCallElements_QNAME, NetworkManagementRemoveNodeCallElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NetworkManagementModifyNodeCallType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NetworkManagementModifyNodeCallType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "networkManagementModifyNodeCall")
    public JAXBElement<NetworkManagementModifyNodeCallType> createNetworkManagementModifyNodeCall(NetworkManagementModifyNodeCallType value) {
        return new JAXBElement<NetworkManagementModifyNodeCallType>(_NetworkManagementModifyNodeCall_QNAME, NetworkManagementModifyNodeCallType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NetworkManagementModifyNodeCallElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NetworkManagementModifyNodeCallElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "networkManagementModifyNodeCallElements")
    public JAXBElement<NetworkManagementModifyNodeCallElementsType> createNetworkManagementModifyNodeCallElements(NetworkManagementModifyNodeCallElementsType value) {
        return new JAXBElement<NetworkManagementModifyNodeCallElementsType>(_NetworkManagementModifyNodeCallElements_QNAME, NetworkManagementModifyNodeCallElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NetworkManagementScanNetworkCallType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NetworkManagementScanNetworkCallType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "networkManagementScanNetworkCall")
    public JAXBElement<NetworkManagementScanNetworkCallType> createNetworkManagementScanNetworkCall(NetworkManagementScanNetworkCallType value) {
        return new JAXBElement<NetworkManagementScanNetworkCallType>(_NetworkManagementScanNetworkCall_QNAME, NetworkManagementScanNetworkCallType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NetworkManagementScanNetworkCallElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NetworkManagementScanNetworkCallElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "networkManagementScanNetworkCallElements")
    public JAXBElement<NetworkManagementScanNetworkCallElementsType> createNetworkManagementScanNetworkCallElements(NetworkManagementScanNetworkCallElementsType value) {
        return new JAXBElement<NetworkManagementScanNetworkCallElementsType>(_NetworkManagementScanNetworkCallElements_QNAME, NetworkManagementScanNetworkCallElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NetworkManagementDiscoverCallType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NetworkManagementDiscoverCallType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "networkManagementDiscoverCall")
    public JAXBElement<NetworkManagementDiscoverCallType> createNetworkManagementDiscoverCall(NetworkManagementDiscoverCallType value) {
        return new JAXBElement<NetworkManagementDiscoverCallType>(_NetworkManagementDiscoverCall_QNAME, NetworkManagementDiscoverCallType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NetworkManagementDiscoverCallElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NetworkManagementDiscoverCallElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "networkManagementDiscoverCallElements")
    public JAXBElement<NetworkManagementDiscoverCallElementsType> createNetworkManagementDiscoverCallElements(NetworkManagementDiscoverCallElementsType value) {
        return new JAXBElement<NetworkManagementDiscoverCallElementsType>(_NetworkManagementDiscoverCallElements_QNAME, NetworkManagementDiscoverCallElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NetworkManagementAbortCallType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NetworkManagementAbortCallType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "networkManagementAbortCall")
    public JAXBElement<NetworkManagementAbortCallType> createNetworkManagementAbortCall(NetworkManagementAbortCallType value) {
        return new JAXBElement<NetworkManagementAbortCallType>(_NetworkManagementAbortCall_QNAME, NetworkManagementAbortCallType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NetworkManagementAbortCallElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NetworkManagementAbortCallElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "networkManagementAbortCallElements")
    public JAXBElement<NetworkManagementAbortCallElementsType> createNetworkManagementAbortCallElements(NetworkManagementAbortCallElementsType value) {
        return new JAXBElement<NetworkManagementAbortCallElementsType>(_NetworkManagementAbortCallElements_QNAME, NetworkManagementAbortCallElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NetworkManagementProcessStateDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NetworkManagementProcessStateDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "networkManagementProcessStateData")
    public JAXBElement<NetworkManagementProcessStateDataType> createNetworkManagementProcessStateData(NetworkManagementProcessStateDataType value) {
        return new JAXBElement<NetworkManagementProcessStateDataType>(_NetworkManagementProcessStateData_QNAME, NetworkManagementProcessStateDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NetworkManagementProcessStateDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NetworkManagementProcessStateDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "networkManagementProcessStateDataElements")
    public JAXBElement<NetworkManagementProcessStateDataElementsType> createNetworkManagementProcessStateDataElements(NetworkManagementProcessStateDataElementsType value) {
        return new JAXBElement<NetworkManagementProcessStateDataElementsType>(_NetworkManagementProcessStateDataElements_QNAME, NetworkManagementProcessStateDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NetworkManagementJoiningModeDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NetworkManagementJoiningModeDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "networkManagementJoiningModeData")
    public JAXBElement<NetworkManagementJoiningModeDataType> createNetworkManagementJoiningModeData(NetworkManagementJoiningModeDataType value) {
        return new JAXBElement<NetworkManagementJoiningModeDataType>(_NetworkManagementJoiningModeData_QNAME, NetworkManagementJoiningModeDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NetworkManagementJoiningModeDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NetworkManagementJoiningModeDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "networkManagementJoiningModeDataElements")
    public JAXBElement<NetworkManagementJoiningModeDataElementsType> createNetworkManagementJoiningModeDataElements(NetworkManagementJoiningModeDataElementsType value) {
        return new JAXBElement<NetworkManagementJoiningModeDataElementsType>(_NetworkManagementJoiningModeDataElements_QNAME, NetworkManagementJoiningModeDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NetworkManagementReportCandidateDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NetworkManagementReportCandidateDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "networkManagementReportCandidateData")
    public JAXBElement<NetworkManagementReportCandidateDataType> createNetworkManagementReportCandidateData(NetworkManagementReportCandidateDataType value) {
        return new JAXBElement<NetworkManagementReportCandidateDataType>(_NetworkManagementReportCandidateData_QNAME, NetworkManagementReportCandidateDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NetworkManagementReportCandidateDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NetworkManagementReportCandidateDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "networkManagementReportCandidateDataElements")
    public JAXBElement<NetworkManagementReportCandidateDataElementsType> createNetworkManagementReportCandidateDataElements(NetworkManagementReportCandidateDataElementsType value) {
        return new JAXBElement<NetworkManagementReportCandidateDataElementsType>(_NetworkManagementReportCandidateDataElements_QNAME, NetworkManagementReportCandidateDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NetworkManagementDeviceDescriptionDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NetworkManagementDeviceDescriptionDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "networkManagementDeviceDescriptionData")
    public JAXBElement<NetworkManagementDeviceDescriptionDataType> createNetworkManagementDeviceDescriptionData(NetworkManagementDeviceDescriptionDataType value) {
        return new JAXBElement<NetworkManagementDeviceDescriptionDataType>(_NetworkManagementDeviceDescriptionData_QNAME, NetworkManagementDeviceDescriptionDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NetworkManagementDeviceDescriptionDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NetworkManagementDeviceDescriptionDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "networkManagementDeviceDescriptionDataElements")
    public JAXBElement<NetworkManagementDeviceDescriptionDataElementsType> createNetworkManagementDeviceDescriptionDataElements(NetworkManagementDeviceDescriptionDataElementsType value) {
        return new JAXBElement<NetworkManagementDeviceDescriptionDataElementsType>(_NetworkManagementDeviceDescriptionDataElements_QNAME, NetworkManagementDeviceDescriptionDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NetworkManagementDeviceDescriptionListDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NetworkManagementDeviceDescriptionListDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "networkManagementDeviceDescriptionListData")
    public JAXBElement<NetworkManagementDeviceDescriptionListDataType> createNetworkManagementDeviceDescriptionListData(NetworkManagementDeviceDescriptionListDataType value) {
        return new JAXBElement<NetworkManagementDeviceDescriptionListDataType>(_NetworkManagementDeviceDescriptionListData_QNAME, NetworkManagementDeviceDescriptionListDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NetworkManagementDeviceDescriptionListDataSelectorsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NetworkManagementDeviceDescriptionListDataSelectorsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "networkManagementDeviceDescriptionListDataSelectors")
    public JAXBElement<NetworkManagementDeviceDescriptionListDataSelectorsType> createNetworkManagementDeviceDescriptionListDataSelectors(NetworkManagementDeviceDescriptionListDataSelectorsType value) {
        return new JAXBElement<NetworkManagementDeviceDescriptionListDataSelectorsType>(_NetworkManagementDeviceDescriptionListDataSelectors_QNAME, NetworkManagementDeviceDescriptionListDataSelectorsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NetworkManagementEntityDescriptionDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NetworkManagementEntityDescriptionDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "networkManagementEntityDescriptionData")
    public JAXBElement<NetworkManagementEntityDescriptionDataType> createNetworkManagementEntityDescriptionData(NetworkManagementEntityDescriptionDataType value) {
        return new JAXBElement<NetworkManagementEntityDescriptionDataType>(_NetworkManagementEntityDescriptionData_QNAME, NetworkManagementEntityDescriptionDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NetworkManagementEntityDescriptionDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NetworkManagementEntityDescriptionDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "networkManagementEntityDescriptionDataElements")
    public JAXBElement<NetworkManagementEntityDescriptionDataElementsType> createNetworkManagementEntityDescriptionDataElements(NetworkManagementEntityDescriptionDataElementsType value) {
        return new JAXBElement<NetworkManagementEntityDescriptionDataElementsType>(_NetworkManagementEntityDescriptionDataElements_QNAME, NetworkManagementEntityDescriptionDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NetworkManagementEntityDescriptionListDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NetworkManagementEntityDescriptionListDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "networkManagementEntityDescriptionListData")
    public JAXBElement<NetworkManagementEntityDescriptionListDataType> createNetworkManagementEntityDescriptionListData(NetworkManagementEntityDescriptionListDataType value) {
        return new JAXBElement<NetworkManagementEntityDescriptionListDataType>(_NetworkManagementEntityDescriptionListData_QNAME, NetworkManagementEntityDescriptionListDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NetworkManagementEntityDescriptionListDataSelectorsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NetworkManagementEntityDescriptionListDataSelectorsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "networkManagementEntityDescriptionListDataSelectors")
    public JAXBElement<NetworkManagementEntityDescriptionListDataSelectorsType> createNetworkManagementEntityDescriptionListDataSelectors(NetworkManagementEntityDescriptionListDataSelectorsType value) {
        return new JAXBElement<NetworkManagementEntityDescriptionListDataSelectorsType>(_NetworkManagementEntityDescriptionListDataSelectors_QNAME, NetworkManagementEntityDescriptionListDataSelectorsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NetworkManagementFeatureDescriptionDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NetworkManagementFeatureDescriptionDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "networkManagementFeatureDescriptionData")
    public JAXBElement<NetworkManagementFeatureDescriptionDataType> createNetworkManagementFeatureDescriptionData(NetworkManagementFeatureDescriptionDataType value) {
        return new JAXBElement<NetworkManagementFeatureDescriptionDataType>(_NetworkManagementFeatureDescriptionData_QNAME, NetworkManagementFeatureDescriptionDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NetworkManagementFeatureDescriptionDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NetworkManagementFeatureDescriptionDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "networkManagementFeatureDescriptionDataElements")
    public JAXBElement<NetworkManagementFeatureDescriptionDataElementsType> createNetworkManagementFeatureDescriptionDataElements(NetworkManagementFeatureDescriptionDataElementsType value) {
        return new JAXBElement<NetworkManagementFeatureDescriptionDataElementsType>(_NetworkManagementFeatureDescriptionDataElements_QNAME, NetworkManagementFeatureDescriptionDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NetworkManagementFeatureDescriptionListDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NetworkManagementFeatureDescriptionListDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "networkManagementFeatureDescriptionListData")
    public JAXBElement<NetworkManagementFeatureDescriptionListDataType> createNetworkManagementFeatureDescriptionListData(NetworkManagementFeatureDescriptionListDataType value) {
        return new JAXBElement<NetworkManagementFeatureDescriptionListDataType>(_NetworkManagementFeatureDescriptionListData_QNAME, NetworkManagementFeatureDescriptionListDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NetworkManagementFeatureDescriptionListDataSelectorsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NetworkManagementFeatureDescriptionListDataSelectorsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "networkManagementFeatureDescriptionListDataSelectors")
    public JAXBElement<NetworkManagementFeatureDescriptionListDataSelectorsType> createNetworkManagementFeatureDescriptionListDataSelectors(NetworkManagementFeatureDescriptionListDataSelectorsType value) {
        return new JAXBElement<NetworkManagementFeatureDescriptionListDataSelectorsType>(_NetworkManagementFeatureDescriptionListDataSelectors_QNAME, NetworkManagementFeatureDescriptionListDataSelectorsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubscriptionManagementEntryDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SubscriptionManagementEntryDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "subscriptionManagementEntryData")
    public JAXBElement<SubscriptionManagementEntryDataType> createSubscriptionManagementEntryData(SubscriptionManagementEntryDataType value) {
        return new JAXBElement<SubscriptionManagementEntryDataType>(_SubscriptionManagementEntryData_QNAME, SubscriptionManagementEntryDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubscriptionManagementEntryDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SubscriptionManagementEntryDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "subscriptionManagementEntryDataElements")
    public JAXBElement<SubscriptionManagementEntryDataElementsType> createSubscriptionManagementEntryDataElements(SubscriptionManagementEntryDataElementsType value) {
        return new JAXBElement<SubscriptionManagementEntryDataElementsType>(_SubscriptionManagementEntryDataElements_QNAME, SubscriptionManagementEntryDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubscriptionManagementEntryListDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SubscriptionManagementEntryListDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "subscriptionManagementEntryListData")
    public JAXBElement<SubscriptionManagementEntryListDataType> createSubscriptionManagementEntryListData(SubscriptionManagementEntryListDataType value) {
        return new JAXBElement<SubscriptionManagementEntryListDataType>(_SubscriptionManagementEntryListData_QNAME, SubscriptionManagementEntryListDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubscriptionManagementEntryListDataSelectorsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SubscriptionManagementEntryListDataSelectorsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "subscriptionManagementEntryListDataSelectors")
    public JAXBElement<SubscriptionManagementEntryListDataSelectorsType> createSubscriptionManagementEntryListDataSelectors(SubscriptionManagementEntryListDataSelectorsType value) {
        return new JAXBElement<SubscriptionManagementEntryListDataSelectorsType>(_SubscriptionManagementEntryListDataSelectors_QNAME, SubscriptionManagementEntryListDataSelectorsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubscriptionManagementRequestCallType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SubscriptionManagementRequestCallType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "subscriptionManagementRequestCall")
    public JAXBElement<SubscriptionManagementRequestCallType> createSubscriptionManagementRequestCall(SubscriptionManagementRequestCallType value) {
        return new JAXBElement<SubscriptionManagementRequestCallType>(_SubscriptionManagementRequestCall_QNAME, SubscriptionManagementRequestCallType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubscriptionManagementRequestCallElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SubscriptionManagementRequestCallElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "subscriptionManagementRequestCallElements")
    public JAXBElement<SubscriptionManagementRequestCallElementsType> createSubscriptionManagementRequestCallElements(SubscriptionManagementRequestCallElementsType value) {
        return new JAXBElement<SubscriptionManagementRequestCallElementsType>(_SubscriptionManagementRequestCallElements_QNAME, SubscriptionManagementRequestCallElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubscriptionManagementDeleteCallType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SubscriptionManagementDeleteCallType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "subscriptionManagementDeleteCall")
    public JAXBElement<SubscriptionManagementDeleteCallType> createSubscriptionManagementDeleteCall(SubscriptionManagementDeleteCallType value) {
        return new JAXBElement<SubscriptionManagementDeleteCallType>(_SubscriptionManagementDeleteCall_QNAME, SubscriptionManagementDeleteCallType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubscriptionManagementDeleteCallElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SubscriptionManagementDeleteCallElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "subscriptionManagementDeleteCallElements")
    public JAXBElement<SubscriptionManagementDeleteCallElementsType> createSubscriptionManagementDeleteCallElements(SubscriptionManagementDeleteCallElementsType value) {
        return new JAXBElement<SubscriptionManagementDeleteCallElementsType>(_SubscriptionManagementDeleteCallElements_QNAME, SubscriptionManagementDeleteCallElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SpecificationVersionDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SpecificationVersionDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "specificationVersionData")
    public JAXBElement<SpecificationVersionDataType> createSpecificationVersionData(SpecificationVersionDataType value) {
        return new JAXBElement<SpecificationVersionDataType>(_SpecificationVersionData_QNAME, SpecificationVersionDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SpecificationVersionDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SpecificationVersionDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "specificationVersionDataElements")
    public JAXBElement<SpecificationVersionDataElementsType> createSpecificationVersionDataElements(SpecificationVersionDataElementsType value) {
        return new JAXBElement<SpecificationVersionDataElementsType>(_SpecificationVersionDataElements_QNAME, SpecificationVersionDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SpecificationVersionListDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SpecificationVersionListDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "specificationVersionListData")
    public JAXBElement<SpecificationVersionListDataType> createSpecificationVersionListData(SpecificationVersionListDataType value) {
        return new JAXBElement<SpecificationVersionListDataType>(_SpecificationVersionListData_QNAME, SpecificationVersionListDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SpecificationVersionListDataSelectorsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SpecificationVersionListDataSelectorsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "specificationVersionListDataSelectors")
    public JAXBElement<SpecificationVersionListDataSelectorsType> createSpecificationVersionListDataSelectors(SpecificationVersionListDataSelectorsType value) {
        return new JAXBElement<SpecificationVersionListDataSelectorsType>(_SpecificationVersionListDataSelectors_QNAME, SpecificationVersionListDataSelectorsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UseCaseInformationDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UseCaseInformationDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "useCaseInformationData")
    public JAXBElement<UseCaseInformationDataType> createUseCaseInformationData(UseCaseInformationDataType value) {
        return new JAXBElement<UseCaseInformationDataType>(_UseCaseInformationData_QNAME, UseCaseInformationDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UseCaseInformationDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UseCaseInformationDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "useCaseInformationDataElements")
    public JAXBElement<UseCaseInformationDataElementsType> createUseCaseInformationDataElements(UseCaseInformationDataElementsType value) {
        return new JAXBElement<UseCaseInformationDataElementsType>(_UseCaseInformationDataElements_QNAME, UseCaseInformationDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UseCaseInformationListDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UseCaseInformationListDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "useCaseInformationListData")
    public JAXBElement<UseCaseInformationListDataType> createUseCaseInformationListData(UseCaseInformationListDataType value) {
        return new JAXBElement<UseCaseInformationListDataType>(_UseCaseInformationListData_QNAME, UseCaseInformationListDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UseCaseInformationListDataSelectorsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UseCaseInformationListDataSelectorsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "useCaseInformationListDataSelectors")
    public JAXBElement<UseCaseInformationListDataSelectorsType> createUseCaseInformationListDataSelectors(UseCaseInformationListDataSelectorsType value) {
        return new JAXBElement<UseCaseInformationListDataSelectorsType>(_UseCaseInformationListDataSelectors_QNAME, UseCaseInformationListDataSelectorsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NodeManagementDetailedDiscoveryDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NodeManagementDetailedDiscoveryDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "nodeManagementDetailedDiscoveryData")
    public JAXBElement<NodeManagementDetailedDiscoveryDataType> createNodeManagementDetailedDiscoveryData(NodeManagementDetailedDiscoveryDataType value) {
        return new JAXBElement<NodeManagementDetailedDiscoveryDataType>(_NodeManagementDetailedDiscoveryData_QNAME, NodeManagementDetailedDiscoveryDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NodeManagementDetailedDiscoveryDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NodeManagementDetailedDiscoveryDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "nodeManagementDetailedDiscoveryDataElements")
    public JAXBElement<NodeManagementDetailedDiscoveryDataElementsType> createNodeManagementDetailedDiscoveryDataElements(NodeManagementDetailedDiscoveryDataElementsType value) {
        return new JAXBElement<NodeManagementDetailedDiscoveryDataElementsType>(_NodeManagementDetailedDiscoveryDataElements_QNAME, NodeManagementDetailedDiscoveryDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NodeManagementDetailedDiscoveryDataSelectorsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NodeManagementDetailedDiscoveryDataSelectorsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "nodeManagementDetailedDiscoveryDataSelectors")
    public JAXBElement<NodeManagementDetailedDiscoveryDataSelectorsType> createNodeManagementDetailedDiscoveryDataSelectors(NodeManagementDetailedDiscoveryDataSelectorsType value) {
        return new JAXBElement<NodeManagementDetailedDiscoveryDataSelectorsType>(_NodeManagementDetailedDiscoveryDataSelectors_QNAME, NodeManagementDetailedDiscoveryDataSelectorsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NodeManagementBindingDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NodeManagementBindingDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "nodeManagementBindingData")
    public JAXBElement<NodeManagementBindingDataType> createNodeManagementBindingData(NodeManagementBindingDataType value) {
        return new JAXBElement<NodeManagementBindingDataType>(_NodeManagementBindingData_QNAME, NodeManagementBindingDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NodeManagementBindingDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NodeManagementBindingDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "nodeManagementBindingDataElements")
    public JAXBElement<NodeManagementBindingDataElementsType> createNodeManagementBindingDataElements(NodeManagementBindingDataElementsType value) {
        return new JAXBElement<NodeManagementBindingDataElementsType>(_NodeManagementBindingDataElements_QNAME, NodeManagementBindingDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NodeManagementBindingDataSelectorsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NodeManagementBindingDataSelectorsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "nodeManagementBindingDataSelectors")
    public JAXBElement<NodeManagementBindingDataSelectorsType> createNodeManagementBindingDataSelectors(NodeManagementBindingDataSelectorsType value) {
        return new JAXBElement<NodeManagementBindingDataSelectorsType>(_NodeManagementBindingDataSelectors_QNAME, NodeManagementBindingDataSelectorsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NodeManagementBindingRequestCallType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NodeManagementBindingRequestCallType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "nodeManagementBindingRequestCall")
    public JAXBElement<NodeManagementBindingRequestCallType> createNodeManagementBindingRequestCall(NodeManagementBindingRequestCallType value) {
        return new JAXBElement<NodeManagementBindingRequestCallType>(_NodeManagementBindingRequestCall_QNAME, NodeManagementBindingRequestCallType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NodeManagementBindingRequestCallElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NodeManagementBindingRequestCallElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "nodeManagementBindingRequestCallElements")
    public JAXBElement<NodeManagementBindingRequestCallElementsType> createNodeManagementBindingRequestCallElements(NodeManagementBindingRequestCallElementsType value) {
        return new JAXBElement<NodeManagementBindingRequestCallElementsType>(_NodeManagementBindingRequestCallElements_QNAME, NodeManagementBindingRequestCallElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NodeManagementBindingDeleteCallType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NodeManagementBindingDeleteCallType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "nodeManagementBindingDeleteCall")
    public JAXBElement<NodeManagementBindingDeleteCallType> createNodeManagementBindingDeleteCall(NodeManagementBindingDeleteCallType value) {
        return new JAXBElement<NodeManagementBindingDeleteCallType>(_NodeManagementBindingDeleteCall_QNAME, NodeManagementBindingDeleteCallType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NodeManagementBindingDeleteCallElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NodeManagementBindingDeleteCallElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "nodeManagementBindingDeleteCallElements")
    public JAXBElement<NodeManagementBindingDeleteCallElementsType> createNodeManagementBindingDeleteCallElements(NodeManagementBindingDeleteCallElementsType value) {
        return new JAXBElement<NodeManagementBindingDeleteCallElementsType>(_NodeManagementBindingDeleteCallElements_QNAME, NodeManagementBindingDeleteCallElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NodeManagementSubscriptionDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NodeManagementSubscriptionDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "nodeManagementSubscriptionData")
    public JAXBElement<NodeManagementSubscriptionDataType> createNodeManagementSubscriptionData(NodeManagementSubscriptionDataType value) {
        return new JAXBElement<NodeManagementSubscriptionDataType>(_NodeManagementSubscriptionData_QNAME, NodeManagementSubscriptionDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NodeManagementSubscriptionDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NodeManagementSubscriptionDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "nodeManagementSubscriptionDataElements")
    public JAXBElement<NodeManagementSubscriptionDataElementsType> createNodeManagementSubscriptionDataElements(NodeManagementSubscriptionDataElementsType value) {
        return new JAXBElement<NodeManagementSubscriptionDataElementsType>(_NodeManagementSubscriptionDataElements_QNAME, NodeManagementSubscriptionDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NodeManagementSubscriptionDataSelectorsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NodeManagementSubscriptionDataSelectorsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "nodeManagementSubscriptionDataSelectors")
    public JAXBElement<NodeManagementSubscriptionDataSelectorsType> createNodeManagementSubscriptionDataSelectors(NodeManagementSubscriptionDataSelectorsType value) {
        return new JAXBElement<NodeManagementSubscriptionDataSelectorsType>(_NodeManagementSubscriptionDataSelectors_QNAME, NodeManagementSubscriptionDataSelectorsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NodeManagementSubscriptionRequestCallType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NodeManagementSubscriptionRequestCallType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "nodeManagementSubscriptionRequestCall")
    public JAXBElement<NodeManagementSubscriptionRequestCallType> createNodeManagementSubscriptionRequestCall(NodeManagementSubscriptionRequestCallType value) {
        return new JAXBElement<NodeManagementSubscriptionRequestCallType>(_NodeManagementSubscriptionRequestCall_QNAME, NodeManagementSubscriptionRequestCallType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NodeManagementSubscriptionRequestCallElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NodeManagementSubscriptionRequestCallElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "nodeManagementSubscriptionRequestCallElements")
    public JAXBElement<NodeManagementSubscriptionRequestCallElementsType> createNodeManagementSubscriptionRequestCallElements(NodeManagementSubscriptionRequestCallElementsType value) {
        return new JAXBElement<NodeManagementSubscriptionRequestCallElementsType>(_NodeManagementSubscriptionRequestCallElements_QNAME, NodeManagementSubscriptionRequestCallElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NodeManagementSubscriptionDeleteCallType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NodeManagementSubscriptionDeleteCallType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "nodeManagementSubscriptionDeleteCall")
    public JAXBElement<NodeManagementSubscriptionDeleteCallType> createNodeManagementSubscriptionDeleteCall(NodeManagementSubscriptionDeleteCallType value) {
        return new JAXBElement<NodeManagementSubscriptionDeleteCallType>(_NodeManagementSubscriptionDeleteCall_QNAME, NodeManagementSubscriptionDeleteCallType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NodeManagementSubscriptionDeleteCallElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NodeManagementSubscriptionDeleteCallElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "nodeManagementSubscriptionDeleteCallElements")
    public JAXBElement<NodeManagementSubscriptionDeleteCallElementsType> createNodeManagementSubscriptionDeleteCallElements(NodeManagementSubscriptionDeleteCallElementsType value) {
        return new JAXBElement<NodeManagementSubscriptionDeleteCallElementsType>(_NodeManagementSubscriptionDeleteCallElements_QNAME, NodeManagementSubscriptionDeleteCallElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NodeManagementDestinationDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NodeManagementDestinationDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "nodeManagementDestinationData")
    public JAXBElement<NodeManagementDestinationDataType> createNodeManagementDestinationData(NodeManagementDestinationDataType value) {
        return new JAXBElement<NodeManagementDestinationDataType>(_NodeManagementDestinationData_QNAME, NodeManagementDestinationDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NodeManagementDestinationDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NodeManagementDestinationDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "nodeManagementDestinationDataElements")
    public JAXBElement<NodeManagementDestinationDataElementsType> createNodeManagementDestinationDataElements(NodeManagementDestinationDataElementsType value) {
        return new JAXBElement<NodeManagementDestinationDataElementsType>(_NodeManagementDestinationDataElements_QNAME, NodeManagementDestinationDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NodeManagementDestinationListDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NodeManagementDestinationListDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "nodeManagementDestinationListData")
    public JAXBElement<NodeManagementDestinationListDataType> createNodeManagementDestinationListData(NodeManagementDestinationListDataType value) {
        return new JAXBElement<NodeManagementDestinationListDataType>(_NodeManagementDestinationListData_QNAME, NodeManagementDestinationListDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NodeManagementDestinationListDataSelectorsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NodeManagementDestinationListDataSelectorsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "nodeManagementDestinationListDataSelectors")
    public JAXBElement<NodeManagementDestinationListDataSelectorsType> createNodeManagementDestinationListDataSelectors(NodeManagementDestinationListDataSelectorsType value) {
        return new JAXBElement<NodeManagementDestinationListDataSelectorsType>(_NodeManagementDestinationListDataSelectors_QNAME, NodeManagementDestinationListDataSelectorsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NodeManagementUseCaseDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NodeManagementUseCaseDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "nodeManagementUseCaseData")
    public JAXBElement<NodeManagementUseCaseDataType> createNodeManagementUseCaseData(NodeManagementUseCaseDataType value) {
        return new JAXBElement<NodeManagementUseCaseDataType>(_NodeManagementUseCaseData_QNAME, NodeManagementUseCaseDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NodeManagementUseCaseDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NodeManagementUseCaseDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "nodeManagementUseCaseDataElements")
    public JAXBElement<NodeManagementUseCaseDataElementsType> createNodeManagementUseCaseDataElements(NodeManagementUseCaseDataElementsType value) {
        return new JAXBElement<NodeManagementUseCaseDataElementsType>(_NodeManagementUseCaseDataElements_QNAME, NodeManagementUseCaseDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NodeManagementUseCaseDataSelectorsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NodeManagementUseCaseDataSelectorsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "nodeManagementUseCaseDataSelectors")
    public JAXBElement<NodeManagementUseCaseDataSelectorsType> createNodeManagementUseCaseDataSelectors(NodeManagementUseCaseDataSelectorsType value) {
        return new JAXBElement<NodeManagementUseCaseDataSelectorsType>(_NodeManagementUseCaseDataSelectors_QNAME, NodeManagementUseCaseDataSelectorsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperatingConstraintsInterruptDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OperatingConstraintsInterruptDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "operatingConstraintsInterruptData")
    public JAXBElement<OperatingConstraintsInterruptDataType> createOperatingConstraintsInterruptData(OperatingConstraintsInterruptDataType value) {
        return new JAXBElement<OperatingConstraintsInterruptDataType>(_OperatingConstraintsInterruptData_QNAME, OperatingConstraintsInterruptDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperatingConstraintsInterruptDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OperatingConstraintsInterruptDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "operatingConstraintsInterruptDataElements")
    public JAXBElement<OperatingConstraintsInterruptDataElementsType> createOperatingConstraintsInterruptDataElements(OperatingConstraintsInterruptDataElementsType value) {
        return new JAXBElement<OperatingConstraintsInterruptDataElementsType>(_OperatingConstraintsInterruptDataElements_QNAME, OperatingConstraintsInterruptDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperatingConstraintsInterruptListDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OperatingConstraintsInterruptListDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "operatingConstraintsInterruptListData")
    public JAXBElement<OperatingConstraintsInterruptListDataType> createOperatingConstraintsInterruptListData(OperatingConstraintsInterruptListDataType value) {
        return new JAXBElement<OperatingConstraintsInterruptListDataType>(_OperatingConstraintsInterruptListData_QNAME, OperatingConstraintsInterruptListDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperatingConstraintsInterruptListDataSelectorsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OperatingConstraintsInterruptListDataSelectorsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "operatingConstraintsInterruptListDataSelectors")
    public JAXBElement<OperatingConstraintsInterruptListDataSelectorsType> createOperatingConstraintsInterruptListDataSelectors(OperatingConstraintsInterruptListDataSelectorsType value) {
        return new JAXBElement<OperatingConstraintsInterruptListDataSelectorsType>(_OperatingConstraintsInterruptListDataSelectors_QNAME, OperatingConstraintsInterruptListDataSelectorsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperatingConstraintsDurationDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OperatingConstraintsDurationDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "operatingConstraintsDurationData")
    public JAXBElement<OperatingConstraintsDurationDataType> createOperatingConstraintsDurationData(OperatingConstraintsDurationDataType value) {
        return new JAXBElement<OperatingConstraintsDurationDataType>(_OperatingConstraintsDurationData_QNAME, OperatingConstraintsDurationDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperatingConstraintsDurationDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OperatingConstraintsDurationDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "operatingConstraintsDurationDataElements")
    public JAXBElement<OperatingConstraintsDurationDataElementsType> createOperatingConstraintsDurationDataElements(OperatingConstraintsDurationDataElementsType value) {
        return new JAXBElement<OperatingConstraintsDurationDataElementsType>(_OperatingConstraintsDurationDataElements_QNAME, OperatingConstraintsDurationDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperatingConstraintsDurationListDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OperatingConstraintsDurationListDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "operatingConstraintsDurationListData")
    public JAXBElement<OperatingConstraintsDurationListDataType> createOperatingConstraintsDurationListData(OperatingConstraintsDurationListDataType value) {
        return new JAXBElement<OperatingConstraintsDurationListDataType>(_OperatingConstraintsDurationListData_QNAME, OperatingConstraintsDurationListDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperatingConstraintsDurationListDataSelectorsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OperatingConstraintsDurationListDataSelectorsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "operatingConstraintsDurationListDataSelectors")
    public JAXBElement<OperatingConstraintsDurationListDataSelectorsType> createOperatingConstraintsDurationListDataSelectors(OperatingConstraintsDurationListDataSelectorsType value) {
        return new JAXBElement<OperatingConstraintsDurationListDataSelectorsType>(_OperatingConstraintsDurationListDataSelectors_QNAME, OperatingConstraintsDurationListDataSelectorsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperatingConstraintsPowerDescriptionDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OperatingConstraintsPowerDescriptionDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "operatingConstraintsPowerDescriptionData")
    public JAXBElement<OperatingConstraintsPowerDescriptionDataType> createOperatingConstraintsPowerDescriptionData(OperatingConstraintsPowerDescriptionDataType value) {
        return new JAXBElement<OperatingConstraintsPowerDescriptionDataType>(_OperatingConstraintsPowerDescriptionData_QNAME, OperatingConstraintsPowerDescriptionDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperatingConstraintsPowerDescriptionDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OperatingConstraintsPowerDescriptionDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "operatingConstraintsPowerDescriptionDataElements")
    public JAXBElement<OperatingConstraintsPowerDescriptionDataElementsType> createOperatingConstraintsPowerDescriptionDataElements(OperatingConstraintsPowerDescriptionDataElementsType value) {
        return new JAXBElement<OperatingConstraintsPowerDescriptionDataElementsType>(_OperatingConstraintsPowerDescriptionDataElements_QNAME, OperatingConstraintsPowerDescriptionDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperatingConstraintsPowerDescriptionListDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OperatingConstraintsPowerDescriptionListDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "operatingConstraintsPowerDescriptionListData")
    public JAXBElement<OperatingConstraintsPowerDescriptionListDataType> createOperatingConstraintsPowerDescriptionListData(OperatingConstraintsPowerDescriptionListDataType value) {
        return new JAXBElement<OperatingConstraintsPowerDescriptionListDataType>(_OperatingConstraintsPowerDescriptionListData_QNAME, OperatingConstraintsPowerDescriptionListDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperatingConstraintsPowerDescriptionListDataSelectorsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OperatingConstraintsPowerDescriptionListDataSelectorsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "operatingConstraintsPowerDescriptionListDataSelectors")
    public JAXBElement<OperatingConstraintsPowerDescriptionListDataSelectorsType> createOperatingConstraintsPowerDescriptionListDataSelectors(OperatingConstraintsPowerDescriptionListDataSelectorsType value) {
        return new JAXBElement<OperatingConstraintsPowerDescriptionListDataSelectorsType>(_OperatingConstraintsPowerDescriptionListDataSelectors_QNAME, OperatingConstraintsPowerDescriptionListDataSelectorsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperatingConstraintsPowerRangeDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OperatingConstraintsPowerRangeDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "operatingConstraintsPowerRangeData")
    public JAXBElement<OperatingConstraintsPowerRangeDataType> createOperatingConstraintsPowerRangeData(OperatingConstraintsPowerRangeDataType value) {
        return new JAXBElement<OperatingConstraintsPowerRangeDataType>(_OperatingConstraintsPowerRangeData_QNAME, OperatingConstraintsPowerRangeDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperatingConstraintsPowerRangeDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OperatingConstraintsPowerRangeDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "operatingConstraintsPowerRangeDataElements")
    public JAXBElement<OperatingConstraintsPowerRangeDataElementsType> createOperatingConstraintsPowerRangeDataElements(OperatingConstraintsPowerRangeDataElementsType value) {
        return new JAXBElement<OperatingConstraintsPowerRangeDataElementsType>(_OperatingConstraintsPowerRangeDataElements_QNAME, OperatingConstraintsPowerRangeDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperatingConstraintsPowerRangeListDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OperatingConstraintsPowerRangeListDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "operatingConstraintsPowerRangeListData")
    public JAXBElement<OperatingConstraintsPowerRangeListDataType> createOperatingConstraintsPowerRangeListData(OperatingConstraintsPowerRangeListDataType value) {
        return new JAXBElement<OperatingConstraintsPowerRangeListDataType>(_OperatingConstraintsPowerRangeListData_QNAME, OperatingConstraintsPowerRangeListDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperatingConstraintsPowerRangeListDataSelectorsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OperatingConstraintsPowerRangeListDataSelectorsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "operatingConstraintsPowerRangeListDataSelectors")
    public JAXBElement<OperatingConstraintsPowerRangeListDataSelectorsType> createOperatingConstraintsPowerRangeListDataSelectors(OperatingConstraintsPowerRangeListDataSelectorsType value) {
        return new JAXBElement<OperatingConstraintsPowerRangeListDataSelectorsType>(_OperatingConstraintsPowerRangeListDataSelectors_QNAME, OperatingConstraintsPowerRangeListDataSelectorsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperatingConstraintsPowerLevelDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OperatingConstraintsPowerLevelDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "operatingConstraintsPowerLevelData")
    public JAXBElement<OperatingConstraintsPowerLevelDataType> createOperatingConstraintsPowerLevelData(OperatingConstraintsPowerLevelDataType value) {
        return new JAXBElement<OperatingConstraintsPowerLevelDataType>(_OperatingConstraintsPowerLevelData_QNAME, OperatingConstraintsPowerLevelDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperatingConstraintsPowerLevelDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OperatingConstraintsPowerLevelDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "operatingConstraintsPowerLevelDataElements")
    public JAXBElement<OperatingConstraintsPowerLevelDataElementsType> createOperatingConstraintsPowerLevelDataElements(OperatingConstraintsPowerLevelDataElementsType value) {
        return new JAXBElement<OperatingConstraintsPowerLevelDataElementsType>(_OperatingConstraintsPowerLevelDataElements_QNAME, OperatingConstraintsPowerLevelDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperatingConstraintsPowerLevelListDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OperatingConstraintsPowerLevelListDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "operatingConstraintsPowerLevelListData")
    public JAXBElement<OperatingConstraintsPowerLevelListDataType> createOperatingConstraintsPowerLevelListData(OperatingConstraintsPowerLevelListDataType value) {
        return new JAXBElement<OperatingConstraintsPowerLevelListDataType>(_OperatingConstraintsPowerLevelListData_QNAME, OperatingConstraintsPowerLevelListDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperatingConstraintsPowerLevelListDataSelectorsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OperatingConstraintsPowerLevelListDataSelectorsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "operatingConstraintsPowerLevelListDataSelectors")
    public JAXBElement<OperatingConstraintsPowerLevelListDataSelectorsType> createOperatingConstraintsPowerLevelListDataSelectors(OperatingConstraintsPowerLevelListDataSelectorsType value) {
        return new JAXBElement<OperatingConstraintsPowerLevelListDataSelectorsType>(_OperatingConstraintsPowerLevelListDataSelectors_QNAME, OperatingConstraintsPowerLevelListDataSelectorsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperatingConstraintsResumeImplicationDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OperatingConstraintsResumeImplicationDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "operatingConstraintsResumeImplicationData")
    public JAXBElement<OperatingConstraintsResumeImplicationDataType> createOperatingConstraintsResumeImplicationData(OperatingConstraintsResumeImplicationDataType value) {
        return new JAXBElement<OperatingConstraintsResumeImplicationDataType>(_OperatingConstraintsResumeImplicationData_QNAME, OperatingConstraintsResumeImplicationDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperatingConstraintsResumeImplicationDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OperatingConstraintsResumeImplicationDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "operatingConstraintsResumeImplicationDataElements")
    public JAXBElement<OperatingConstraintsResumeImplicationDataElementsType> createOperatingConstraintsResumeImplicationDataElements(OperatingConstraintsResumeImplicationDataElementsType value) {
        return new JAXBElement<OperatingConstraintsResumeImplicationDataElementsType>(_OperatingConstraintsResumeImplicationDataElements_QNAME, OperatingConstraintsResumeImplicationDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperatingConstraintsResumeImplicationListDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OperatingConstraintsResumeImplicationListDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "operatingConstraintsResumeImplicationListData")
    public JAXBElement<OperatingConstraintsResumeImplicationListDataType> createOperatingConstraintsResumeImplicationListData(OperatingConstraintsResumeImplicationListDataType value) {
        return new JAXBElement<OperatingConstraintsResumeImplicationListDataType>(_OperatingConstraintsResumeImplicationListData_QNAME, OperatingConstraintsResumeImplicationListDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperatingConstraintsResumeImplicationListDataSelectorsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OperatingConstraintsResumeImplicationListDataSelectorsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "operatingConstraintsResumeImplicationListDataSelectors")
    public JAXBElement<OperatingConstraintsResumeImplicationListDataSelectorsType> createOperatingConstraintsResumeImplicationListDataSelectors(OperatingConstraintsResumeImplicationListDataSelectorsType value) {
        return new JAXBElement<OperatingConstraintsResumeImplicationListDataSelectorsType>(_OperatingConstraintsResumeImplicationListDataSelectors_QNAME, OperatingConstraintsResumeImplicationListDataSelectorsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SensingDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SensingDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "sensingData")
    public JAXBElement<SensingDataType> createSensingData(SensingDataType value) {
        return new JAXBElement<SensingDataType>(_SensingData_QNAME, SensingDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SensingDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SensingDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "sensingDataElements")
    public JAXBElement<SensingDataElementsType> createSensingDataElements(SensingDataElementsType value) {
        return new JAXBElement<SensingDataElementsType>(_SensingDataElements_QNAME, SensingDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SensingListDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SensingListDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "sensingListData")
    public JAXBElement<SensingListDataType> createSensingListData(SensingListDataType value) {
        return new JAXBElement<SensingListDataType>(_SensingListData_QNAME, SensingListDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SensingListDataSelectorsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SensingListDataSelectorsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "sensingListDataSelectors")
    public JAXBElement<SensingListDataSelectorsType> createSensingListDataSelectors(SensingListDataSelectorsType value) {
        return new JAXBElement<SensingListDataSelectorsType>(_SensingListDataSelectors_QNAME, SensingListDataSelectorsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SensingDescriptionDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SensingDescriptionDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "sensingDescriptionData")
    public JAXBElement<SensingDescriptionDataType> createSensingDescriptionData(SensingDescriptionDataType value) {
        return new JAXBElement<SensingDescriptionDataType>(_SensingDescriptionData_QNAME, SensingDescriptionDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SensingDescriptionDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SensingDescriptionDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "sensingDescriptionDataElements")
    public JAXBElement<SensingDescriptionDataElementsType> createSensingDescriptionDataElements(SensingDescriptionDataElementsType value) {
        return new JAXBElement<SensingDescriptionDataElementsType>(_SensingDescriptionDataElements_QNAME, SensingDescriptionDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SmartEnergyManagementPsDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SmartEnergyManagementPsDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "smartEnergyManagementPsData")
    public JAXBElement<SmartEnergyManagementPsDataType> createSmartEnergyManagementPsData(SmartEnergyManagementPsDataType value) {
        return new JAXBElement<SmartEnergyManagementPsDataType>(_SmartEnergyManagementPsData_QNAME, SmartEnergyManagementPsDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SmartEnergyManagementPsDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SmartEnergyManagementPsDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "smartEnergyManagementPsDataElements")
    public JAXBElement<SmartEnergyManagementPsDataElementsType> createSmartEnergyManagementPsDataElements(SmartEnergyManagementPsDataElementsType value) {
        return new JAXBElement<SmartEnergyManagementPsDataElementsType>(_SmartEnergyManagementPsDataElements_QNAME, SmartEnergyManagementPsDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SmartEnergyManagementPsDataSelectorsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SmartEnergyManagementPsDataSelectorsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "smartEnergyManagementPsDataSelectors")
    public JAXBElement<SmartEnergyManagementPsDataSelectorsType> createSmartEnergyManagementPsDataSelectors(SmartEnergyManagementPsDataSelectorsType value) {
        return new JAXBElement<SmartEnergyManagementPsDataSelectorsType>(_SmartEnergyManagementPsDataSelectors_QNAME, SmartEnergyManagementPsDataSelectorsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SmartEnergyManagementPsPriceDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SmartEnergyManagementPsPriceDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "smartEnergyManagementPsPriceData")
    public JAXBElement<SmartEnergyManagementPsPriceDataType> createSmartEnergyManagementPsPriceData(SmartEnergyManagementPsPriceDataType value) {
        return new JAXBElement<SmartEnergyManagementPsPriceDataType>(_SmartEnergyManagementPsPriceData_QNAME, SmartEnergyManagementPsPriceDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SmartEnergyManagementPsPriceDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SmartEnergyManagementPsPriceDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "smartEnergyManagementPsPriceDataElements")
    public JAXBElement<SmartEnergyManagementPsPriceDataElementsType> createSmartEnergyManagementPsPriceDataElements(SmartEnergyManagementPsPriceDataElementsType value) {
        return new JAXBElement<SmartEnergyManagementPsPriceDataElementsType>(_SmartEnergyManagementPsPriceDataElements_QNAME, SmartEnergyManagementPsPriceDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SmartEnergyManagementPsPriceDataSelectorsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SmartEnergyManagementPsPriceDataSelectorsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "smartEnergyManagementPsPriceDataSelectors")
    public JAXBElement<SmartEnergyManagementPsPriceDataSelectorsType> createSmartEnergyManagementPsPriceDataSelectors(SmartEnergyManagementPsPriceDataSelectorsType value) {
        return new JAXBElement<SmartEnergyManagementPsPriceDataSelectorsType>(_SmartEnergyManagementPsPriceDataSelectors_QNAME, SmartEnergyManagementPsPriceDataSelectorsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SmartEnergyManagementPsConfigurationRequestCallType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SmartEnergyManagementPsConfigurationRequestCallType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "smartEnergyManagementPsConfigurationRequestCall")
    public JAXBElement<SmartEnergyManagementPsConfigurationRequestCallType> createSmartEnergyManagementPsConfigurationRequestCall(SmartEnergyManagementPsConfigurationRequestCallType value) {
        return new JAXBElement<SmartEnergyManagementPsConfigurationRequestCallType>(_SmartEnergyManagementPsConfigurationRequestCall_QNAME, SmartEnergyManagementPsConfigurationRequestCallType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SmartEnergyManagementPsConfigurationRequestCallElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SmartEnergyManagementPsConfigurationRequestCallElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "smartEnergyManagementPsConfigurationRequestCallElements")
    public JAXBElement<SmartEnergyManagementPsConfigurationRequestCallElementsType> createSmartEnergyManagementPsConfigurationRequestCallElements(SmartEnergyManagementPsConfigurationRequestCallElementsType value) {
        return new JAXBElement<SmartEnergyManagementPsConfigurationRequestCallElementsType>(_SmartEnergyManagementPsConfigurationRequestCallElements_QNAME, SmartEnergyManagementPsConfigurationRequestCallElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SmartEnergyManagementPsPriceCalculationRequestCallType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SmartEnergyManagementPsPriceCalculationRequestCallType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "smartEnergyManagementPsPriceCalculationRequestCall")
    public JAXBElement<SmartEnergyManagementPsPriceCalculationRequestCallType> createSmartEnergyManagementPsPriceCalculationRequestCall(SmartEnergyManagementPsPriceCalculationRequestCallType value) {
        return new JAXBElement<SmartEnergyManagementPsPriceCalculationRequestCallType>(_SmartEnergyManagementPsPriceCalculationRequestCall_QNAME, SmartEnergyManagementPsPriceCalculationRequestCallType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SmartEnergyManagementPsPriceCalculationRequestCallElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SmartEnergyManagementPsPriceCalculationRequestCallElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "smartEnergyManagementPsPriceCalculationRequestCallElements")
    public JAXBElement<SmartEnergyManagementPsPriceCalculationRequestCallElementsType> createSmartEnergyManagementPsPriceCalculationRequestCallElements(SmartEnergyManagementPsPriceCalculationRequestCallElementsType value) {
        return new JAXBElement<SmartEnergyManagementPsPriceCalculationRequestCallElementsType>(_SmartEnergyManagementPsPriceCalculationRequestCallElements_QNAME, SmartEnergyManagementPsPriceCalculationRequestCallElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StateInformationDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StateInformationDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "stateInformationData")
    public JAXBElement<StateInformationDataType> createStateInformationData(StateInformationDataType value) {
        return new JAXBElement<StateInformationDataType>(_StateInformationData_QNAME, StateInformationDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StateInformationDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StateInformationDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "stateInformationDataElements")
    public JAXBElement<StateInformationDataElementsType> createStateInformationDataElements(StateInformationDataElementsType value) {
        return new JAXBElement<StateInformationDataElementsType>(_StateInformationDataElements_QNAME, StateInformationDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StateInformationListDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StateInformationListDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "stateInformationListData")
    public JAXBElement<StateInformationListDataType> createStateInformationListData(StateInformationListDataType value) {
        return new JAXBElement<StateInformationListDataType>(_StateInformationListData_QNAME, StateInformationListDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StateInformationListDataSelectorsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StateInformationListDataSelectorsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "stateInformationListDataSelectors")
    public JAXBElement<StateInformationListDataSelectorsType> createStateInformationListDataSelectors(StateInformationListDataSelectorsType value) {
        return new JAXBElement<StateInformationListDataSelectorsType>(_StateInformationListDataSelectors_QNAME, StateInformationListDataSelectorsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeInformationDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TimeInformationDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "timeInformationData")
    public JAXBElement<TimeInformationDataType> createTimeInformationData(TimeInformationDataType value) {
        return new JAXBElement<TimeInformationDataType>(_TimeInformationData_QNAME, TimeInformationDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeInformationDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TimeInformationDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "timeInformationDataElements")
    public JAXBElement<TimeInformationDataElementsType> createTimeInformationDataElements(TimeInformationDataElementsType value) {
        return new JAXBElement<TimeInformationDataElementsType>(_TimeInformationDataElements_QNAME, TimeInformationDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeDistributorDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TimeDistributorDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "timeDistributorData")
    public JAXBElement<TimeDistributorDataType> createTimeDistributorData(TimeDistributorDataType value) {
        return new JAXBElement<TimeDistributorDataType>(_TimeDistributorData_QNAME, TimeDistributorDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeDistributorDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TimeDistributorDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "timeDistributorDataElements")
    public JAXBElement<TimeDistributorDataElementsType> createTimeDistributorDataElements(TimeDistributorDataElementsType value) {
        return new JAXBElement<TimeDistributorDataElementsType>(_TimeDistributorDataElements_QNAME, TimeDistributorDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimePrecisionDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TimePrecisionDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "timePrecisionData")
    public JAXBElement<TimePrecisionDataType> createTimePrecisionData(TimePrecisionDataType value) {
        return new JAXBElement<TimePrecisionDataType>(_TimePrecisionData_QNAME, TimePrecisionDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimePrecisionDataElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TimePrecisionDataElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "timePrecisionDataElements")
    public JAXBElement<TimePrecisionDataElementsType> createTimePrecisionDataElements(TimePrecisionDataElementsType value) {
        return new JAXBElement<TimePrecisionDataElementsType>(_TimePrecisionDataElements_QNAME, TimePrecisionDataElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeDistributorEnquiryCallType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TimeDistributorEnquiryCallType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "timeDistributorEnquiryCall")
    public JAXBElement<TimeDistributorEnquiryCallType> createTimeDistributorEnquiryCall(TimeDistributorEnquiryCallType value) {
        return new JAXBElement<TimeDistributorEnquiryCallType>(_TimeDistributorEnquiryCall_QNAME, TimeDistributorEnquiryCallType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeDistributorEnquiryCallElementsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TimeDistributorEnquiryCallElementsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "timeDistributorEnquiryCallElements")
    public JAXBElement<TimeDistributorEnquiryCallElementsType> createTimeDistributorEnquiryCallElements(TimeDistributorEnquiryCallElementsType value) {
        return new JAXBElement<TimeDistributorEnquiryCallElementsType>(_TimeDistributorEnquiryCallElements_QNAME, TimeDistributorEnquiryCallElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CmdClassifierType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CmdClassifierType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "cmdClassifier")
    public JAXBElement<CmdClassifierType> createCmdClassifier(CmdClassifierType value) {
        return new JAXBElement<CmdClassifierType>(_CmdClassifier_QNAME, CmdClassifierType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "manufacturerSpecificExtension")
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    public JAXBElement<byte[]> createManufacturerSpecificExtension(byte[] value) {
        return new JAXBElement<byte[]>(_ManufacturerSpecificExtension_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "lastUpdateAt")
    public JAXBElement<String> createLastUpdateAt(String value) {
        return new JAXBElement<String>(_LastUpdateAt_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "function")
    public JAXBElement<String> createFunction(String value) {
        return new JAXBElement<String>(_Function_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FilterType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FilterType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "filter")
    public JAXBElement<FilterType> createFilter(FilterType value) {
        return new JAXBElement<FilterType>(_Filter_QNAME, FilterType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CmdControlType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CmdControlType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "cmdControl")
    public JAXBElement<CmdControlType> createCmdControl(CmdControlType value) {
        return new JAXBElement<CmdControlType>(_CmdControl_QNAME, CmdControlType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HeaderType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HeaderType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "header")
    public JAXBElement<HeaderType> createHeader(HeaderType value) {
        return new JAXBElement<HeaderType>(_Header_QNAME, HeaderType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PayloadType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PayloadType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "payload")
    public JAXBElement<PayloadType> createPayload(PayloadType value) {
        return new JAXBElement<PayloadType>(_Payload_QNAME, PayloadType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatagramType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DatagramType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "datagram")
    public JAXBElement<DatagramType> createDatagram(DatagramType value) {
        return new JAXBElement<DatagramType>(_Datagram_QNAME, DatagramType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.eebus.org/spine/xsd/v1", name = "specificUsage", scope = NetworkManagementFeatureDescriptionDataType.class)
    public JAXBElement<List<String>> createNetworkManagementFeatureDescriptionDataTypeSpecificUsage(List<String> value) {
        return new JAXBElement<List<String>>(_NetworkManagementFeatureDescriptionDataTypeSpecificUsage_QNAME, ((Class) List.class), NetworkManagementFeatureDescriptionDataType.class, ((List<String> ) value));
    }

}
