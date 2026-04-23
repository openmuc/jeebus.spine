/********************************************************************************
 * Copyright (c) 2026 Fraunhofer ISE
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 ********************************************************************************/

package org.openmuc.jeebus.spine.impl.parser;

import com.fasterxml.jackson.databind.JsonNode;
import org.junit.jupiter.api.Test;
import org.openmuc.jeebus.spine.utils.SpineUtilities;
import org.openmuc.jeebus.spine.utils.datatypes.ScaledNumberWrapper;
import org.openmuc.jeebus.spine.xsd.v1.*;

import java.io.IOException;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.openmuc.jeebus.spine.TestUtilities.fromResource;
import static org.openmuc.jeebus.spine.utils.SpineUtilities.*;
import static org.openmuc.jeebus.spine.xsd.v1.DeviceConfigurationKeyNameEnumType.*;
import static org.openmuc.jeebus.spine.xsd.v1.FunctionEnumType.DEVICE_CONFIGURATION_KEY_VALUE_DESCRIPTION_LIST_DATA;

class MessageParserTest {
    private static final String DD_REQUEST
        = fromResource("detailed-discovery-request.json");
    private static final String DD_REPLY
        = fromResource("detailed-discovery-reply.json");
    private static final String SELECTORS_JSON
        = fromResource("selectors.json");
    private static final String DELETE_WRITE_JSON
        = fromResource("delete-write.json");
    private static final String EMPTY_ARRAY_OF_OBJECTS_JSON
        = fromResource("empty-array-of-objects.json");
    private static final String EMPTY_ARRAY_OF_OBJECTS_WITH_UNKNOWN_PROPERTIES_JSON
        = fromResource("empty-array-of-objects-with-unknown-properties.json");

    private static final String DEVICE_ONE = "d:_i:12345_TestDevice_1";
    private static final String DEVICE_TWO = "d:_i:12345_TestDevice_2";

    @Test
    void testScaledNumbers() throws IOException {
        DatagramType expected = new DatagramType().withPayload(
            new PayloadType().withCmd(
                new CmdType().withLoadControlLimitListData(
                    new LoadControlLimitListDataType().withLoadControlLimitData(
                        new LoadControlLimitDataType().withValue(
                            new ScaledNumberType(1L, (short) 1))))));
        DatagramType actual = (DatagramType) expected.copyTo(new DatagramType());
        actual
            .getPayload()
            .getCmd()
            .get(0)
            .getLoadControlLimitListData()
            .getLoadControlLimitData()
            .get(0)
            .setValue(new ScaledNumberWrapper(1, 1));
        assertSameJson(
            MessageParser.toJson(expected),
            MessageParser.toJson(actual)
        );
    }

    @Test
    void testGetFunctionName() {
        DatagramType datagram = getSelectorsDatagram();
        CmdType cmd = datagram.getPayload().getCmd().get(0);
        assertEquals("deviceConfigurationKeyValueDescriptionListData", MessageParser.getFunctionName(cmd));

        datagram = MessageParser.fromJson(DD_REQUEST.getBytes(StandardCharsets.UTF_8));
        cmd = datagram.getPayload().getCmd().get(0);
        assertEquals("nodeManagementDetailedDiscoveryData", MessageParser.getFunctionName(cmd));
    }

    @Test
    void testEmptyArrayOfObjects() throws IOException {
        DatagramType datagram = MessageParser.fromJson(
            EMPTY_ARRAY_OF_OBJECTS_JSON.getBytes(StandardCharsets.UTF_8));
        // ^^^ shouldn't throw
        byte[] json = MessageParser.toJson(datagram);
        assertNotNull(json);
        assertSameJson(EMPTY_ARRAY_OF_OBJECTS_JSON, json);
        // also, should round-trip
    }

    @Test
    void testIgnoreUnknownProperties() {
        DatagramType datagram = MessageParser.fromJson(
            EMPTY_ARRAY_OF_OBJECTS_WITH_UNKNOWN_PROPERTIES_JSON.getBytes(
                StandardCharsets.UTF_8)
        );
        // ^^^ shouldn't throw

        DatagramType reference = MessageParser.fromJson(
            EMPTY_ARRAY_OF_OBJECTS_JSON.getBytes(StandardCharsets.UTF_8)
        );
        assertEquals(reference, datagram);
        // also, should result in the same value as
        // the json without those unknown properties
    }

    @Test
    void testDdRequestToJson() throws IOException {
        DatagramType datagram = new DatagramType();
        FeatureAddressType addressSource = getNodeManagementAddress();
        addressSource.setDevice(DEVICE_ONE);
        HeaderType header = getHeader(
            addressSource, getNodeManagementAddress(), CmdClassifierType.READ,
            BigInteger.ONE
        );
        header.setAckRequest(true);
        datagram.setHeader(header);
        PayloadType payload = getPayloadWithCmd();
        payload
            .getCmd()
            .get(0)
            .setNodeManagementDetailedDiscoveryData(new NodeManagementDetailedDiscoveryDataType());
        datagram.setPayload(payload);

        byte[] json = MessageParser.toJson(datagram);

        assertNotNull(json);
        assertSameJson(DD_REQUEST, json);
    }

    @Test
    void testDdReplyToJson() throws IOException {
        DatagramType datagram = new DatagramType();
        FeatureAddressType addressSource = getNodeManagementAddress();
        addressSource.setDevice(DEVICE_ONE);
        FeatureAddressType addressDestination = getNodeManagementAddress();
        addressDestination.setDevice(DEVICE_TWO);
        HeaderType header = getHeader(
            addressSource, addressDestination, CmdClassifierType.REPLY,
            BigInteger.valueOf(3)
        );
        header.setMsgCounterReference(BigInteger.ONE);
        datagram.setHeader(header);

        PayloadType payload = getPayloadWithCmd();
        NodeManagementDetailedDiscoveryDataType data
            = new NodeManagementDetailedDiscoveryDataType();
        data.setSpecificationVersionList(getSpecificationVersionList());
        data.setDeviceInformation(getDeviceInformation());
        addEntityInformation(data);
        addFeatureInformation(data);
        payload.getCmd().get(0).setNodeManagementDetailedDiscoveryData(data);
        datagram.setPayload(payload);

        byte[] json = MessageParser.toJson(datagram);

        assertThat(json, is(notNullValue()));
        assertSameJson(DD_REPLY, json);

        assertEquals(datagram, MessageParser.fromJson(DD_REPLY.getBytes(
            StandardCharsets.UTF_8)));
    }

    @Test
    void testSelectorsFromJson() {
        DatagramType actual = MessageParser.fromJson(SELECTORS_JSON.getBytes());

        List<DeviceConfigurationKeyValueDescriptionListDataSelectorsType> selectors
            = actual
            .getPayload()
            .getCmd()
            .get(0)
            .getFilter()
            .get(0)
            .getDeviceConfigurationKeyValueDescriptionListDataSelectors();

        assertThat(selectors, hasSize(2));
        assertThat(
            selectors,
            hasItem(hasProperty(
                "keyName",
                is(FAILSAFE_CONSUMPTION_ACTIVE_POWER_LIMIT.value())
            ))
        );
        assertThat(
            selectors,
            hasItem(hasProperty("keyName", is(FAILSAFE_DURATION_MINIMUM.value())))
        );
    }

    @Test
    public void testSelectorsToJson() throws IOException {
        DatagramType datagram = getSelectorsDatagram();

        byte[] json = MessageParser.toJson(datagram);

        assertThat(json, is(notNullValue()));
        assertSameJson(SELECTORS_JSON, json);
    }

    @Test
    public void testDeleteWriteToJson() throws IOException {
        DatagramType datagram
            = getDeleteWrite();

        byte[] json = MessageParser.toJson(datagram);

        assertThat(json, is(notNullValue()));
        assertSameJson(DELETE_WRITE_JSON, json);
    }

    @Test
    public void testDeleteWriteFromJson() {
        DatagramType result
            = MessageParser.fromJson(DELETE_WRITE_JSON.getBytes());

        assertThat(result, is(notNullValue()));

        CmdType cmd = result.getPayload().getCmd().get(0);
        List<FilterType> filters = getDeleteWrite()
            .getPayload()
            .getCmd()
            .get(0)
            .getFilter();

        assertThat(
            cmd.getFilter(),
            hasSize(2)
        );

        assertThat(
            cmd.getFilter(),
            hasItem(filters.get(0))
        );
        assertThat(
            cmd.getFilter(),
            hasItem(filters.get(1))
        );
    }

    private static DatagramType getDeleteWrite() {
        return new DatagramType()
            .withPayload(new PayloadType()
                .withCmd(new CmdType()
                    .withFunction("loadControlLimitListData")
                    .withFilter(
                        new FilterType()
                            .withCmdControl(getDeleteCmdControl())
                            .withLoadControlLimitListDataSelectors(
                                new LoadControlLimitListDataSelectorsType()
                                    .withLimitId(0L))
                            .withLoadControlLimitDataElements(
                                new LoadControlLimitDataElementsType()
                                    .withTimePeriod(new TimePeriodElementsType()
                                        .withEndTime(new ElementTagType()))),
                        new FilterType().withCmdControl(getPartialCmdControl())
                    )
                    .withLoadControlLimitListData(new LoadControlLimitListDataType()
                        .withLoadControlLimitData(new LoadControlLimitDataType()
                            .withLimitId(0L)
                            .withIsLimitActive(true)
                            .withValue(new ScaledNumberType()
                                .withNumber(5L)
                                .withScale((short) 3))))));
    }

    private FeatureAddressType getNodeManagementAddress() {
        return getFeatureAddressType(0L, 0L);
    }

    private HeaderType getHeader(
        FeatureAddressType addressSource, FeatureAddressType addressDestination,
        CmdClassifierType cmdClassifier, BigInteger msgCounter
    ) {
        HeaderType header = new HeaderType();
        header.setSpecificationVersion("1.3.0");
        header.setAddressSource(addressSource);
        header.setAddressDestination(addressDestination);
        header.setCmdClassifier(cmdClassifier);
        header.setMsgCounter(msgCounter);
        return header;
    }

    private PayloadType getPayloadWithCmd() {
        PayloadType payload = new PayloadType();
        payload.getCmd().add(new CmdType());
        return payload;
    }

    private FeatureAddressType getFeatureAddressType(long entityId, long featureId) {
        FeatureAddressType clientAddress = new FeatureAddressType();
        clientAddress.getEntity().add(entityId);
        clientAddress.setFeature(featureId);
        return clientAddress;
    }

    private NodeManagementSpecificationVersionListType getSpecificationVersionList() {
        NodeManagementSpecificationVersionListType specificationVersionList
            = new NodeManagementSpecificationVersionListType();
        SpecificationVersionDataType versionDataType
            = new SpecificationVersionDataType();
        versionDataType.setValue("1.3.0");
        specificationVersionList.getSpecificationVersion().add(versionDataType);
        return specificationVersionList;
    }

    private NodeManagementDetailedDiscoveryDeviceInformationType getDeviceInformation() {
        NodeManagementDetailedDiscoveryDeviceInformationType deviceInfo
            = new NodeManagementDetailedDiscoveryDeviceInformationType();
        NodeManagementDetailedDiscoveryDeviceInformationType.Description description
            = new NodeManagementDetailedDiscoveryDeviceInformationType.Description();
        DeviceAddressType address = new DeviceAddressType();
        address.setDevice(DEVICE_ONE);
        description.setDeviceAddress(address);
        description.setDeviceType(DeviceTypeEnumType.GENERIC.value());
        description.setNetworkFeatureSet(NetworkManagementFeatureSetType.SMART);
        description.setLastStateChange(NetworkManagementStateChangeType.ADDED);
        deviceInfo.setDescription(description);
        return deviceInfo;
    }

    private void addEntityInformation(NodeManagementDetailedDiscoveryDataType data) {
        NodeManagementDetailedDiscoveryEntityInformationType deviceInformationEntity
            = new NodeManagementDetailedDiscoveryEntityInformationType();
        NodeManagementDetailedDiscoveryEntityInformationType.Description
            deviceInformationEntityDescription
            = new NodeManagementDetailedDiscoveryEntityInformationType.Description();
        deviceInformationEntityDescription.setEntityType(EntityTypeEnumType.DEVICE_INFORMATION.value());
        EntityAddressType deviceInformationAddress = new EntityAddressType();
        deviceInformationAddress.getEntity().add(0L);
        deviceInformationEntityDescription.setEntityAddress(deviceInformationAddress);
        deviceInformationEntity.setDescription(deviceInformationEntityDescription);
        data.getEntityInformation().add(deviceInformationEntity);

        NodeManagementDetailedDiscoveryEntityInformationType heatPumpEntity
            = new NodeManagementDetailedDiscoveryEntityInformationType();
        NodeManagementDetailedDiscoveryEntityInformationType.Description
            heatPumpDescription
            = new NodeManagementDetailedDiscoveryEntityInformationType.Description();
        EntityAddressType heatPumpAddress = new EntityAddressType();
        heatPumpAddress.getEntity().add(1L);
        heatPumpDescription.setEntityAddress(heatPumpAddress);
        heatPumpDescription.setEntityType(EntityTypeEnumType.HEAT_PUMP_APPLIANCE.value());
        heatPumpEntity.setDescription(heatPumpDescription);
        data.getEntityInformation().add(heatPumpEntity);

        NodeManagementDetailedDiscoveryEntityInformationType subMeterEntity
            = new NodeManagementDetailedDiscoveryEntityInformationType();
        NodeManagementDetailedDiscoveryEntityInformationType.Description
            subMeterDescription
            = new NodeManagementDetailedDiscoveryEntityInformationType.Description();
        EntityAddressType subMeterAddress = new EntityAddressType();
        subMeterAddress.getEntity().add(2L);
        subMeterDescription.setEntityAddress(subMeterAddress);
        subMeterDescription.setEntityType(EntityTypeEnumType.SUB_METER_ELECTRICITY.value());
        subMeterEntity.setDescription(subMeterDescription);
        data.getEntityInformation().add(subMeterEntity);
    }

    private void addFeatureInformation(NodeManagementDetailedDiscoveryDataType data) {
        NodeManagementDetailedDiscoveryFeatureInformationType nodeManagement
            = new NodeManagementDetailedDiscoveryFeatureInformationType();
        NodeManagementDetailedDiscoveryFeatureInformationType.Description
            nodeManagementDescription
            = new NodeManagementDetailedDiscoveryFeatureInformationType.Description();
        nodeManagementDescription.setFeatureAddress(getNodeManagementAddress());
        nodeManagementDescription.setFeatureType(FeatureTypeEnumType.NODE_MANAGEMENT.value());
        nodeManagementDescription.setRole(RoleType.SPECIAL);
        nodeManagementDescription.getSupportedFunction()
            .add(getFunctionProperty(
                FunctionEnumType.NODE_MANAGEMENT_BINDING_DATA.value(),
                true,
                false,
                false,
                false
            ));
        nodeManagementDescription.getSupportedFunction()
            .add(getFunctionProperty(
                FunctionEnumType.NODE_MANAGEMENT_BINDING_DELETE_CALL.value(),
                false,
                false,
                false,
                false
            ));
        nodeManagementDescription.getSupportedFunction()
            .add(getFunctionProperty(
                FunctionEnumType.NODE_MANAGEMENT_BINDING_REQUEST_CALL.value(),
                false,
                false,
                false,
                false
            ));
        nodeManagementDescription.getSupportedFunction()
            .add(getFunctionProperty(
                FunctionEnumType.NODE_MANAGEMENT_DETAILED_DISCOVERY_DATA.value(),
                true,
                false,
                false,
                false
            ));
        nodeManagementDescription.getSupportedFunction()
            .add(getFunctionProperty(
                FunctionEnumType.NODE_MANAGEMENT_SUBSCRIPTION_DATA.value(),
                true,
                false,
                false,
                false
            ));
        nodeManagementDescription.getSupportedFunction()
            .add(getFunctionProperty(
                FunctionEnumType.NODE_MANAGEMENT_SUBSCRIPTION_DELETE_CALL.value(),
                false,
                false,
                false,
                false
            ));
        nodeManagementDescription.getSupportedFunction()
            .add(getFunctionProperty(
                FunctionEnumType.NODE_MANAGEMENT_SUBSCRIPTION_REQUEST_CALL.value(),
                false,
                false,
                false,
                false
            ));
        nodeManagementDescription.getSupportedFunction()
            .add(getFunctionProperty(
                FunctionEnumType.NODE_MANAGEMENT_USE_CASE_DATA.value(),
                true,
                false,
                false,
                false
            ));
        nodeManagement.setDescription(nodeManagementDescription);
        data.getFeatureInformation().add(nodeManagement);

        NodeManagementDetailedDiscoveryFeatureInformationType deviceClassification
            = new NodeManagementDetailedDiscoveryFeatureInformationType();
        NodeManagementDetailedDiscoveryFeatureInformationType.Description
            deviceClassificationDescription
            = new NodeManagementDetailedDiscoveryFeatureInformationType.Description();
        FeatureAddressType deviceClassificationAddress = getFeatureAddressType(
            0L,
            1L
        );
        deviceClassificationDescription.setFeatureAddress(deviceClassificationAddress);
        deviceClassificationDescription.setFeatureType(FeatureTypeEnumType.DEVICE_CLASSIFICATION.value());
        deviceClassificationDescription.setRole(RoleType.SERVER);
        deviceClassificationDescription.getSupportedFunction()
            .add(getFunctionProperty(
                FunctionEnumType.DEVICE_CLASSIFICATION_MANUFACTURER_DATA.value(),
                true,
                false,
                false,
                false
            ));
        deviceClassification.setDescription(deviceClassificationDescription);
        data.getFeatureInformation().add(deviceClassification);

        NodeManagementDetailedDiscoveryFeatureInformationType deviceClassification2
            = new NodeManagementDetailedDiscoveryFeatureInformationType();
        NodeManagementDetailedDiscoveryFeatureInformationType.Description
            deviceClassificationDescription2
            = new NodeManagementDetailedDiscoveryFeatureInformationType.Description();
        FeatureAddressType deviceClassificationAddress2 = getFeatureAddressType(
            1L,
            4L
        );
        deviceClassificationDescription2.setFeatureAddress(
            deviceClassificationAddress2);
        deviceClassificationDescription2.setFeatureType(FeatureTypeEnumType.DEVICE_CLASSIFICATION.value());
        deviceClassificationDescription2.setRole(RoleType.SERVER);
        deviceClassificationDescription2.getSupportedFunction()
            .add(getFunctionProperty(
                FunctionEnumType.DEVICE_CLASSIFICATION_MANUFACTURER_DATA.value(),
                true,
                true,
                false,
                false
            ));
        deviceClassification2.setDescription(deviceClassificationDescription2);
        data.getFeatureInformation().add(deviceClassification2);

        NodeManagementDetailedDiscoveryFeatureInformationType electricalConnection
            = new NodeManagementDetailedDiscoveryFeatureInformationType();
        NodeManagementDetailedDiscoveryFeatureInformationType.Description
            electricalConnectionDescription
            = new NodeManagementDetailedDiscoveryFeatureInformationType.Description();
        FeatureAddressType electricalConnectionAddress = getFeatureAddressType(
            1L,
            7L
        );
        electricalConnectionDescription.setFeatureAddress(electricalConnectionAddress);
        electricalConnectionDescription.setFeatureType(FeatureTypeEnumType.ELECTRICAL_CONNECTION.value());
        electricalConnectionDescription.setRole(RoleType.SERVER);
        electricalConnectionDescription.getSupportedFunction()
            .add(getFunctionProperty(
                FunctionEnumType.ELECTRICAL_CONNECTION_DESCRIPTION_LIST_DATA.value(),
                true,
                true,
                false,
                false
            ));
        electricalConnectionDescription.getSupportedFunction()
            .add(getFunctionProperty(
                FunctionEnumType.ELECTRICAL_CONNECTION_PARAMETER_DESCRIPTION_LIST_DATA.value(),
                true, true, false, false
            ));
        electricalConnectionDescription.getSupportedFunction()
            .add(getFunctionProperty(
                "electricalConnectionCharacteristicListData",
                true,
                true,
                false,
                false
            ));
        electricalConnection.setDescription(electricalConnectionDescription);
        data.getFeatureInformation().add(electricalConnection);

        NodeManagementDetailedDiscoveryFeatureInformationType loadControl
            = new NodeManagementDetailedDiscoveryFeatureInformationType();
        NodeManagementDetailedDiscoveryFeatureInformationType.Description
            loadControlDescription
            = new NodeManagementDetailedDiscoveryFeatureInformationType.Description();
        FeatureAddressType loadControlAddress = getFeatureAddressType(1L, 10L);
        loadControlDescription.setFeatureAddress(loadControlAddress);
        loadControlDescription.setFeatureType(FeatureTypeEnumType.LOAD_CONTROL.value());
        loadControlDescription.setRole(RoleType.SERVER);
        loadControlDescription.getSupportedFunction()
            .add(getFunctionProperty(
                FunctionEnumType.LOAD_CONTROL_LIMIT_DESCRIPTION_LIST_DATA.value(),
                true,
                true,
                false,
                false
            ));
        loadControlDescription.getSupportedFunction()
            .add(getFunctionProperty(
                FunctionEnumType.LOAD_CONTROL_LIMIT_LIST_DATA.value(),
                true,
                true,
                true,
                true
            ));
        loadControl.setDescription(loadControlDescription);
        data.getFeatureInformation().add(loadControl);

        NodeManagementDetailedDiscoveryFeatureInformationType measurement
            = new NodeManagementDetailedDiscoveryFeatureInformationType();
        NodeManagementDetailedDiscoveryFeatureInformationType.Description
            measurementDescription
            = new NodeManagementDetailedDiscoveryFeatureInformationType.Description();
        FeatureAddressType measurementAddress = getFeatureAddressType(1L, 11L);
        measurementDescription.setFeatureAddress(measurementAddress);
        measurementDescription.setFeatureType(FeatureTypeEnumType.MEASUREMENT.value());
        measurementDescription.setRole(RoleType.SERVER);
        measurementDescription.getSupportedFunction()
            .add(getFunctionProperty(
                FunctionEnumType.MEASUREMENT_CONSTRAINTS_LIST_DATA.value(),
                true,
                true,
                false,
                false
            ));
        measurementDescription.getSupportedFunction()
            .add(getFunctionProperty(
                FunctionEnumType.MEASUREMENT_DESCRIPTION_LIST_DATA.value(),
                true,
                true,
                false,
                false
            ));
        measurementDescription.getSupportedFunction()
            .add(getFunctionProperty(
                FunctionEnumType.MEASUREMENT_LIST_DATA.value(),
                true,
                true,
                false,
                false
            ));
        measurement.setDescription(measurementDescription);
        data.getFeatureInformation().add(measurement);

        NodeManagementDetailedDiscoveryFeatureInformationType deviceConfig
            = new NodeManagementDetailedDiscoveryFeatureInformationType();
        NodeManagementDetailedDiscoveryFeatureInformationType.Description
            deviceConfigDescription
            = new NodeManagementDetailedDiscoveryFeatureInformationType.Description();
        FeatureAddressType deviceConfigAddress = getFeatureAddressType(1L, 24L);
        deviceConfigDescription.setFeatureAddress(deviceConfigAddress);
        deviceConfigDescription.setFeatureType(FeatureTypeEnumType.DEVICE_CONFIGURATION.value());
        deviceConfigDescription.setRole(RoleType.SERVER);
        deviceConfigDescription.getSupportedFunction()
            .add(getFunctionProperty(
                DEVICE_CONFIGURATION_KEY_VALUE_DESCRIPTION_LIST_DATA.value(),
                true, true, false, false
            ));
        deviceConfigDescription.getSupportedFunction()
            .add(getFunctionProperty(
                FunctionEnumType.DEVICE_CONFIGURATION_KEY_VALUE_LIST_DATA.value(),
                true,
                true,
                true,
                true
            ));
        deviceConfig.setDescription(deviceConfigDescription);
        data.getFeatureInformation().add(deviceConfig);

        NodeManagementDetailedDiscoveryFeatureInformationType deviceDiagnosis
            = new NodeManagementDetailedDiscoveryFeatureInformationType();
        NodeManagementDetailedDiscoveryFeatureInformationType.Description
            deviceDiagnosisDescription
            = new NodeManagementDetailedDiscoveryFeatureInformationType.Description();
        FeatureAddressType deviceDiagnosisAddress = getFeatureAddressType(1L, 1000L);
        deviceDiagnosisDescription.setFeatureAddress(deviceDiagnosisAddress);
        deviceDiagnosisDescription.setFeatureType(FeatureTypeEnumType.DEVICE_DIAGNOSIS.value());
        deviceDiagnosisDescription.setRole(RoleType.SERVER);
        deviceDiagnosisDescription.setDescription("Device diagnosis server feature");
        deviceDiagnosisDescription.getSupportedFunction()
            .add(getFunctionProperty(
                FunctionEnumType.DEVICE_DIAGNOSIS_HEARTBEAT_DATA.value(),
                true,
                false,
                false,
                false
            ));
        deviceDiagnosisDescription.getSupportedFunction()
            .add(getFunctionProperty(
                FunctionEnumType.DEVICE_DIAGNOSIS_STATE_DATA.value(),
                true,
                false,
                false,
                false
            ));
        deviceDiagnosis.setDescription(deviceDiagnosisDescription);
        data.getFeatureInformation().add(deviceDiagnosis);

        NodeManagementDetailedDiscoveryFeatureInformationType client
            = new NodeManagementDetailedDiscoveryFeatureInformationType();
        NodeManagementDetailedDiscoveryFeatureInformationType.Description
            clientDescription
            = new NodeManagementDetailedDiscoveryFeatureInformationType.Description();
        FeatureAddressType clientAddress = getFeatureAddressType(1L, 1001L);
        clientDescription.setFeatureAddress(clientAddress);
        clientDescription.setFeatureType(FeatureTypeEnumType.GENERIC.value());
        clientDescription.setRole(RoleType.CLIENT);
        clientDescription.setDescription("Heartbeat device diagnosis client feature");
        client.setDescription(clientDescription);
        data.getFeatureInformation().add(client);

        NodeManagementDetailedDiscoveryFeatureInformationType deviceClassification3
            = new NodeManagementDetailedDiscoveryFeatureInformationType();
        NodeManagementDetailedDiscoveryFeatureInformationType.Description
            deviceClassificationDescription3
            = new NodeManagementDetailedDiscoveryFeatureInformationType.Description();
        deviceClassificationDescription3.setFeatureAddress(getFeatureAddressType(
            2L,
            4L
        ));
        deviceClassificationDescription3.setFeatureType(FeatureTypeEnumType.DEVICE_CLASSIFICATION.value());
        deviceClassificationDescription3.setRole(RoleType.SERVER);
        deviceClassificationDescription3.getSupportedFunction()
            .add(getFunctionProperty(
                FunctionEnumType.DEVICE_CLASSIFICATION_MANUFACTURER_DATA.value(),
                true,
                true,
                false,
                false
            ));
        deviceClassification3.setDescription(deviceClassificationDescription3);
        data.getFeatureInformation().add(deviceClassification3);

        NodeManagementDetailedDiscoveryFeatureInformationType electricalConnection2
            = new NodeManagementDetailedDiscoveryFeatureInformationType();
        NodeManagementDetailedDiscoveryFeatureInformationType.Description
            electricalConnectionDescription2
            = new NodeManagementDetailedDiscoveryFeatureInformationType.Description();
        electricalConnectionDescription2.setFeatureAddress(getFeatureAddressType(
            2L,
            7L
        ));
        electricalConnectionDescription2.setFeatureType(FeatureTypeEnumType.ELECTRICAL_CONNECTION.value());
        electricalConnectionDescription2.setRole(RoleType.SERVER);
        electricalConnectionDescription2.getSupportedFunction()
            .add(getFunctionProperty(
                FunctionEnumType.ELECTRICAL_CONNECTION_DESCRIPTION_LIST_DATA.value(),
                true,
                true,
                false,
                false
            ));
        electricalConnectionDescription2.getSupportedFunction()
            .add(getFunctionProperty(
                FunctionEnumType.ELECTRICAL_CONNECTION_PARAMETER_DESCRIPTION_LIST_DATA.value(),
                true, true, false, false
            ));
        electricalConnectionDescription2.getSupportedFunction()
            .add(getFunctionProperty(
                "electricalConnectionCharacteristicListData",
                true,
                true,
                false,
                false
            ));
        electricalConnection2.setDescription(electricalConnectionDescription2);
        data.getFeatureInformation().add(electricalConnection2);

        NodeManagementDetailedDiscoveryFeatureInformationType loadControl2
            = new NodeManagementDetailedDiscoveryFeatureInformationType();
        NodeManagementDetailedDiscoveryFeatureInformationType.Description
            loadControlDescription2
            = new NodeManagementDetailedDiscoveryFeatureInformationType.Description();
        loadControlDescription2.setFeatureAddress(getFeatureAddressType(2L, 10L));
        loadControlDescription2.setFeatureType(FeatureTypeEnumType.LOAD_CONTROL.value());
        loadControlDescription2.setRole(RoleType.SERVER);
        loadControlDescription2.getSupportedFunction()
            .add(getFunctionProperty(
                FunctionEnumType.LOAD_CONTROL_LIMIT_DESCRIPTION_LIST_DATA.value(),
                true,
                true,
                false,
                false
            ));
        loadControlDescription2.getSupportedFunction()
            .add(getFunctionProperty(
                FunctionEnumType.LOAD_CONTROL_LIMIT_LIST_DATA.value(),
                true,
                true,
                true,
                true
            ));
        loadControl2.setDescription(loadControlDescription2);
        data.getFeatureInformation().add(loadControl2);

        NodeManagementDetailedDiscoveryFeatureInformationType measurement2
            = new NodeManagementDetailedDiscoveryFeatureInformationType();
        NodeManagementDetailedDiscoveryFeatureInformationType.Description
            measurementDescription2
            = new NodeManagementDetailedDiscoveryFeatureInformationType.Description();
        measurementDescription2.setFeatureAddress(getFeatureAddressType(2L, 11L));
        measurementDescription2.setFeatureType(FeatureTypeEnumType.MEASUREMENT.value());
        measurementDescription2.setRole(RoleType.SERVER);
        measurementDescription2.getSupportedFunction()
            .add(getFunctionProperty(
                FunctionEnumType.MEASUREMENT_CONSTRAINTS_LIST_DATA.value(),
                true,
                true,
                false,
                false
            ));
        measurementDescription2.getSupportedFunction()
            .add(getFunctionProperty(
                FunctionEnumType.MEASUREMENT_DESCRIPTION_LIST_DATA.value(),
                true,
                true,
                false,
                false
            ));
        measurementDescription2.getSupportedFunction()
            .add(getFunctionProperty(
                FunctionEnumType.MEASUREMENT_LIST_DATA.value(),
                true,
                true,
                false,
                false
            ));
        measurement2.setDescription(measurementDescription2);
        data.getFeatureInformation().add(measurement2);

        NodeManagementDetailedDiscoveryFeatureInformationType deviceConfig2
            = new NodeManagementDetailedDiscoveryFeatureInformationType();
        NodeManagementDetailedDiscoveryFeatureInformationType.Description
            deviceConfigDescription2
            = new NodeManagementDetailedDiscoveryFeatureInformationType.Description();
        deviceConfigDescription2.setFeatureAddress(getFeatureAddressType(2L, 24L));
        deviceConfigDescription2.setFeatureType(FeatureTypeEnumType.DEVICE_CONFIGURATION.value());
        deviceConfigDescription2.setRole(RoleType.SERVER);
        deviceConfigDescription2.getSupportedFunction()
            .add(getFunctionProperty(
                DEVICE_CONFIGURATION_KEY_VALUE_DESCRIPTION_LIST_DATA.value(),
                true, true, false, false
            ));
        deviceConfigDescription2.getSupportedFunction()
            .add(getFunctionProperty(
                FunctionEnumType.DEVICE_CONFIGURATION_KEY_VALUE_LIST_DATA.value(),
                true,
                true,
                true,
                true
            ));
        deviceConfig2.setDescription(deviceConfigDescription2);
        data.getFeatureInformation().add(deviceConfig2);

        NodeManagementDetailedDiscoveryFeatureInformationType deviceDiagnosis2
            = new NodeManagementDetailedDiscoveryFeatureInformationType();
        NodeManagementDetailedDiscoveryFeatureInformationType.Description
            deviceDiagnosisDescription2
            = new NodeManagementDetailedDiscoveryFeatureInformationType.Description();
        deviceDiagnosisDescription2.setFeatureAddress(getFeatureAddressType(
            2L,
            1000L
        ));
        deviceDiagnosisDescription2.setFeatureType(FeatureTypeEnumType.DEVICE_DIAGNOSIS.value());
        deviceDiagnosisDescription2.setRole(RoleType.SERVER);
        deviceDiagnosisDescription2.setDescription("Device diagnosis server feature");
        deviceDiagnosisDescription2.getSupportedFunction()
            .add(getFunctionProperty(
                FunctionEnumType.DEVICE_DIAGNOSIS_HEARTBEAT_DATA.value(),
                true,
                false,
                false,
                false
            ));
        deviceDiagnosisDescription2.getSupportedFunction()
            .add(getFunctionProperty(
                FunctionEnumType.DEVICE_DIAGNOSIS_STATE_DATA.value(),
                true,
                false,
                false,
                false
            ));
        deviceDiagnosis2.setDescription(deviceDiagnosisDescription2);
        data.getFeatureInformation().add(deviceDiagnosis2);

        NodeManagementDetailedDiscoveryFeatureInformationType client2
            = new NodeManagementDetailedDiscoveryFeatureInformationType();
        NodeManagementDetailedDiscoveryFeatureInformationType.Description
            clientDescription2
            = new NodeManagementDetailedDiscoveryFeatureInformationType.Description();
        clientDescription2.setFeatureAddress(getFeatureAddressType(2L, 1001L));
        clientDescription2.setFeatureType(FeatureTypeEnumType.GENERIC.value());
        clientDescription2.setRole(RoleType.CLIENT);
        clientDescription2.setDescription("Heartbeat device diagnosis client feature");
        client2.setDescription(clientDescription2);
        data.getFeatureInformation().add(client2);
    }

    private FunctionPropertyType getFunctionProperty(
        String function, boolean read, boolean partialRead, boolean write,
        boolean partialWrite
    ) {
        FunctionPropertyType property = new FunctionPropertyType();
        property.setFunction(function);
        PossibleOperationsType operations = new PossibleOperationsType();
        if (read) {
            PossibleOperationsReadType readOperation
                = new PossibleOperationsReadType();
            if (partialRead) {
                readOperation.setPartial(new ElementTagType());
            }
            operations.setRead(readOperation);
        }
        if (write) {
            PossibleOperationsWriteType writeOperation
                = new PossibleOperationsWriteType();
            if (partialWrite) {
                writeOperation.setPartial(new ElementTagType());
            }
            operations.setWrite(writeOperation);
        }
        property.setPossibleOperations(operations);
        return property;
    }

    private static DatagramType getSelectorsDatagram() {
        DatagramType datagram = new DatagramType();
        PayloadType payload = new PayloadType();
        CmdType cmd = new CmdType().withFunction(
            DEVICE_CONFIGURATION_KEY_VALUE_DESCRIPTION_LIST_DATA.value());
        FilterType filter = new FilterType();

        DeviceConfigurationKeyValueDescriptionListDataSelectorsType limitSelect
            = new DeviceConfigurationKeyValueDescriptionListDataSelectorsType();
        limitSelect.setKeyName(FAILSAFE_CONSUMPTION_ACTIVE_POWER_LIMIT.value());

        DeviceConfigurationKeyValueDescriptionListDataSelectorsType durationSelect
            = new DeviceConfigurationKeyValueDescriptionListDataSelectorsType();
        durationSelect.setKeyName(FAILSAFE_DURATION_MINIMUM.value());

        filter
            .getDeviceConfigurationKeyValueDescriptionListDataSelectors()
            .addAll(List.of(
                limitSelect,
                durationSelect
            ));

        filter.withCmdControl(SpineUtilities.getPartialCmdControl());

        cmd.getFilter().add(filter);
        payload.getCmd().add(cmd);
        datagram.setPayload(payload);
        return datagram;
    }

    private static void assertSameJson(byte[] expected, byte[] actual) throws
        IOException {
        JsonNode expectedNode = MessageParser.objectMapper.readTree(expected);
        JsonNode actualNode = MessageParser.objectMapper.readTree(actual);


        assertEquals(expectedNode, actualNode);
    }

    private static void assertSameJson(String expected, byte[] actual) throws
        IOException {
        assertSameJson(expected.getBytes(StandardCharsets.UTF_8), actual);
    }

}