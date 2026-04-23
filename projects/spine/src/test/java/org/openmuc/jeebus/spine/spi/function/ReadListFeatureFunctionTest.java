/********************************************************************************
 * Copyright (c) 2026 Fraunhofer ISE
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 ********************************************************************************/

package org.openmuc.jeebus.spine.spi.function;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.openmuc.jeebus.spine.api.Error;
import org.openmuc.jeebus.spine.api.SpineAcknowledgment;
import org.openmuc.jeebus.spine.api.SpineException;
import org.openmuc.jeebus.spine.api.options.ReadListCmdOption;
import org.openmuc.jeebus.spine.impl.DataIdDescription;
import org.openmuc.jeebus.spine.utils.Selectors;
import org.openmuc.jeebus.spine.utils.SpineObjects;
import org.openmuc.jeebus.spine.utils.SpineUtilities;
import org.openmuc.jeebus.spine.xsd.v1.*;

import java.time.Instant;
import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;

import static java.time.temporal.ChronoUnit.*;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ReadListFeatureFunctionTest {

    private final ReadListFeatureFunction<
        MeasurementDescriptionDataType,
        MeasurementDescriptionListDataType,
        MeasurementDescriptionListDataSelectorsType,
        MeasurementDescriptionDataElementsType,
        ?
        > measDescReadListFeatureFunction = getReadListFeatureFunction();

    private final List<MeasurementDescriptionDataType> mGivenData = getData();

    private final List<MeasurementDescriptionListDataSelectorsType> mSelectors
        = getSelectors();

    public static ReadListFeatureFunction<
        MeasurementDescriptionDataType,
        MeasurementDescriptionListDataType,
        MeasurementDescriptionListDataSelectorsType,
        MeasurementDescriptionDataElementsType,
        ?
        > getReadListFeatureFunction() {
        ReadListFeatureFunction<
            MeasurementDescriptionDataType,
            MeasurementDescriptionListDataType,
            MeasurementDescriptionListDataSelectorsType,
            MeasurementDescriptionDataElementsType,
            ?
            > result = new ReadListFeatureFunction<>(
            "someName",
            new ListFeatureFunctionTypeInfo<>(
                new DataIdDescription<>(
                    MeasurementDescriptionDataType.class,
                    List.of("measurementId")
                ),
                MeasurementDescriptionListDataType.class,
                MeasurementDescriptionListDataSelectorsType.class,
                MeasurementDescriptionDataElementsType.class
            )
        ) {
            @Override
            protected void validateReadCmd(
                List<MeasurementDescriptionListDataSelectorsType> measurementDescriptionListDataSelectorsTypes,
                MeasurementDescriptionDataElementsType elements,
                ReadListCmdOption readListCmdOption
            ) {

            }

            @Override
            protected void validateData(MeasurementDescriptionDataType measurementDescriptionDataType) {

            }

            @Override
            protected void validateDataComplete(MeasurementDescriptionDataType measurementDescriptionDataType) {

            }

            @Override
            public SpineAcknowledgment write(
                CmdType cmd,
                FeatureAddressType sourceAddress
            ) {
                return null;
            }

            @Override
            public SpineAcknowledgment call(
                CmdType cmd,
                FeatureAddressType sourceAddress
            ) {
                return null;
            }
        };
        result.getDataListHolder().getDataList().clear();
        result.getDataListHolder()
            .getDataList()
            .addAll(getData());

        return result;
    }

    public static List<MeasurementDescriptionDataType> getData() {
        MeasurementDescriptionDataType sData = new MeasurementDescriptionDataType();
        sData.setMeasurementId(1L);
        sData.setCommodityType("someComm");
        MeasurementDescriptionDataType sData2 = new MeasurementDescriptionDataType();
        sData2.setMeasurementId(2L);
        sData2.setScopeType("someScope");
        sData2.setCommodityType("someOtherCom");
        sData2.setUnit("someUnit");

        MeasurementDescriptionDataType fData = new MeasurementDescriptionDataType();
        fData.setMeasurementId(3L);
        fData.setCommodityType("xyz");
        MeasurementDescriptionDataType fData2 = new MeasurementDescriptionDataType();
        fData2.setMeasurementId(4L);
        fData2.setScopeType("xyz");
        fData2.setCommodityType("someOtherCom");

        List<MeasurementDescriptionDataType> result = new ArrayList<>();
        result.add(sData);
        result.add(sData2);
        result.add(fData);
        result.add(fData2);

        return result;
    }

    public static List<MeasurementDescriptionListDataSelectorsType> getSelectors() {
        MeasurementDescriptionListDataSelectorsType selector
            = new MeasurementDescriptionListDataSelectorsType();
        selector.setMeasurementId(1L);
        selector.setCommodityType("someComm");

        MeasurementDescriptionListDataSelectorsType selector2
            = new MeasurementDescriptionListDataSelectorsType();
        selector2.setScopeType("someScope");
        selector2.setCommodityType("someOtherCom");

        List<MeasurementDescriptionListDataSelectorsType> result = new ArrayList<>();
        result.add(selector);
        result.add(selector2);

        return result;
    }

    public static ArrayList<MeasurementDescriptionDataType> getSelectedTestData(
        ReadListFeatureFunction<
            MeasurementDescriptionDataType,
            MeasurementDescriptionListDataType,
            MeasurementDescriptionListDataSelectorsType,
            MeasurementDescriptionDataElementsType,
            ?
            > function,
        List<MeasurementDescriptionListDataSelectorsType> selectors
    ) {
        return new ArrayList<>(
            Selectors.getSelectedData(
                    function.getDataListHolder().getDataList(),
                    selectors,
                    function.getTypeInfo()
                )
                .values());
    }

    @Test
    public void testFilterData() throws SpineException {

        MeasurementDescriptionDataElementsType elements
            = new MeasurementDescriptionDataElementsType();
        elements.setMeasurementId(new ElementTagType());
        elements.setScopeType(new ElementTagType());

        FilterType filter = new FilterType();
        filter.getMeasurementDescriptionListDataSelectors().addAll(mSelectors);
        filter.setMeasurementDescriptionDataElements(elements);

        List<MeasurementDescriptionDataType> filteredData
            = measDescReadListFeatureFunction.getDataListHolder()
            .readData(
                filter,
                measDescReadListFeatureFunction.getTypeInfo().getElementsType(),
                measDescReadListFeatureFunction::validateReadFilter
            );

        // selected elements
        assertEquals(
            mGivenData.get(0).getMeasurementId(),
            filteredData.get(0).getMeasurementId()
        );
        assertEquals(
            mGivenData.get(0).getScopeType(),
            filteredData.get(0).getScopeType()
        );
        assertEquals(
            mGivenData.get(1).getMeasurementId(),
            filteredData.get(1).getMeasurementId()
        );
        assertEquals(
            mGivenData.get(1).getScopeType(),
            filteredData.get(1).getScopeType()
        );

        // not selected elements (should be null)
        assertNull(filteredData.get(0).getCommodityType());
        assertNull(filteredData.get(0).getUnit());
        assertNull(filteredData.get(1).getCommodityType());
        assertNull(filteredData.get(1).getUnit());
    }

    @Test
    void testFilterDataWithAdditionalCondition() throws SpineException {

        Instant currentTime = Instant.now();

        PowerSequencePriceListDataSelectorsType selector
            = new PowerSequencePriceListDataSelectorsType();
        selector.setSequenceId(1L);
        TimestampIntervalType timestampInterval = new TimestampIntervalType();
        timestampInterval.setStartTime(currentTime.minus(1L, HOURS).toString());
        timestampInterval.setEndTime(currentTime.plus(1L, HOURS).toString());
        selector.setPotentialStartTimeInterval(timestampInterval);

        PowerSequencePriceListDataSelectorsType selector2
            = new PowerSequencePriceListDataSelectorsType();
        selector2.setSequenceId(2L);
        TimestampIntervalType timestampInterval2 = new TimestampIntervalType();
        timestampInterval2.setStartTime(currentTime.plus(10L, HOURS).toString());
        timestampInterval2.setEndTime(currentTime.plus(13L, HOURS).toString());
        selector2.setPotentialStartTimeInterval(timestampInterval2);

        PowerSequencePriceListDataSelectorsType selector3
            = new PowerSequencePriceListDataSelectorsType();
        selector3.setSequenceId(4L);

        List<PowerSequencePriceListDataSelectorsType> selectors = List.of(
            selector,
            selector2,
            selector3
        );

        List<PowerSequencePriceDataType> givenData
            = getPowerSequencePriceDataTypes(currentTime);

        FilterType filter = new FilterType();
        filter.getPowerSequencePriceListDataSelectors().addAll(selectors);

        ReadListFeatureFunction<PowerSequencePriceDataType, PowerSequencePriceListDataType,
            PowerSequencePriceListDataSelectorsType, PowerSequencePriceDataElementsType, ?>
            readListFeatureFunction;

        AtomicBoolean valid = new AtomicBoolean(true);

        readListFeatureFunction = new ReadListFeatureFunction<>(
            "someName",
            new ListFeatureFunctionTypeInfo<>(
                new DataIdDescription<>(
                    PowerSequencePriceDataType.class,
                    List.of("sequenceId")
                ), PowerSequencePriceListDataType.class,
                PowerSequencePriceListDataSelectorsType.class,
                PowerSequencePriceDataElementsType.class
            )
        ) {
            @Override
            protected void validateReadCmd(
                List<PowerSequencePriceListDataSelectorsType> powerSequencePriceListDataSelectorsTypes,
                PowerSequencePriceDataElementsType elements,
                ReadListCmdOption readListCmdOption
            )
                throws SpineException {
                if (!valid.get()) {
                    throw new SpineException(Error.COMMAND_REJECTED, "");
                }
            }

            @Override
            protected void validateData(PowerSequencePriceDataType powerSequencePriceDataType) {

            }

            @Override
            protected void validateDataComplete(PowerSequencePriceDataType powerSequencePriceDataType) {

            }

            @Override
            public SpineAcknowledgment write(
                CmdType cmd,
                FeatureAddressType sourceAddress
            ) {
                return null;
            }

            @Override
            public SpineAcknowledgment call(
                CmdType cmd,
                FeatureAddressType sourceAddress
            ) {
                return null;
            }
        };
        readListFeatureFunction.getDataListHolder().getDataList().clear();
        readListFeatureFunction.getDataListHolder().getDataList().addAll(givenData);

        List<PowerSequencePriceDataType> filteredData = readListFeatureFunction
            .readDataAndBuildReadReplyCmd(filter)
            .getPowerSequencePriceListData()
            .getPowerSequencePriceData();

        assertEquals(3, filteredData.size());

        assertEquals(
            givenData.get(0).getPotentialStartTime(),
            filteredData.get(0).getPotentialStartTime()
        );
        assertEquals(
            givenData.get(0).getSequenceId(),
            filteredData.get(0).getSequenceId()
        );
        assertEquals(
            givenData.get(0).getCurrency(),
            filteredData.get(0).getCurrency()
        );

        assertEquals(
            givenData.get(1).getPotentialStartTime(),
            filteredData.get(1).getPotentialStartTime()
        );
        assertEquals(
            givenData.get(1).getSequenceId(),
            filteredData.get(1).getSequenceId()
        );
        assertEquals(
            givenData.get(1).getCurrency(),
            filteredData.get(1).getCurrency()
        );

        assertEquals(
            givenData.get(2).getPotentialStartTime(),
            filteredData.get(2).getPotentialStartTime()
        );
        assertEquals(
            givenData.get(2).getSequenceId(),
            filteredData.get(2).getSequenceId()
        );
        assertEquals(
            givenData.get(2).getCurrency(),
            filteredData.get(2).getCurrency()
        );

        readListFeatureFunction
            .getAllowedReadCmdOptions()
            .remove(ReadListCmdOption.READ_BY_SELECTOR);
        assertThrows(
            SpineException.class,
            () -> readListFeatureFunction.readDataAndBuildReadReplyCmd(filter)
        );

        PowerSequencePriceDataElementsType elements
            = new PowerSequencePriceDataElementsType();
        elements.setSequenceId(new ElementTagType());
        elements.setCurrency(new ElementTagType());

        filter.setPowerSequencePriceDataElements(elements);

        List<PowerSequencePriceDataType> filteredData2 = readListFeatureFunction
            .readDataAndBuildReadReplyCmd(filter)
            .getPowerSequencePriceListData()
            .getPowerSequencePriceData();

        assertEquals(3, filteredData2.size());

        assertNull(filteredData2.get(0).getPotentialStartTime());
        assertEquals(
            givenData.get(0).getSequenceId(),
            filteredData2.get(0).getSequenceId()
        );
        assertEquals(
            givenData.get(0).getCurrency(),
            filteredData2.get(0).getCurrency()
        );

        assertNull(filteredData2.get(1).getPotentialStartTime());
        assertEquals(
            givenData.get(1).getSequenceId(),
            filteredData2.get(1).getSequenceId()
        );
        assertEquals(
            givenData.get(1).getCurrency(),
            filteredData2.get(1).getCurrency()
        );

        assertNull(filteredData2.get(2).getPotentialStartTime());
        assertEquals(
            givenData.get(2).getSequenceId(),
            filteredData2.get(2).getSequenceId()
        );
        assertEquals(
            givenData.get(2).getCurrency(),
            filteredData2.get(2).getCurrency()
        );

        readListFeatureFunction
            .getAllowedReadCmdOptions()
            .remove(ReadListCmdOption.READ_ELEMENTS_BY_SELECTOR);
        assertThrows(
            SpineException.class,
            () -> readListFeatureFunction.readDataAndBuildReadReplyCmd(filter)
        );

        readListFeatureFunction
            .getAllowedReadCmdOptions()
            .add(ReadListCmdOption.READ_ELEMENTS_BY_SELECTOR);
        valid.set(false);
        assertThrows(
            SpineException.class,
            () -> readListFeatureFunction.readDataAndBuildReadReplyCmd(filter)
        );
    }

    private static List<PowerSequencePriceDataType> getPowerSequencePriceDataTypes(
        Instant currentTime
    ) {
        PowerSequencePriceDataType sData = new PowerSequencePriceDataType();
        sData.setSequenceId(1L);
        sData.setPotentialStartTime(currentTime.plus(30, MINUTES).toString());
        sData.setCurrency("someCurrency");

        PowerSequencePriceDataType sData2 = new PowerSequencePriceDataType();
        sData2.setSequenceId(2L);
        sData2.setPotentialStartTime(currentTime.plus(11, HOURS).toString());
        sData2.setCurrency("someCurrency2");

        PowerSequencePriceDataType sData3 = new PowerSequencePriceDataType();
        sData3.setSequenceId(4L);
        sData3.setPotentialStartTime(currentTime.plus(50, HOURS).toString());
        sData3.setCurrency("someCurrency3");

        PowerSequencePriceDataType fData = new PowerSequencePriceDataType();
        fData.setSequenceId(1L);
        fData.setPotentialStartTime(currentTime.plus(11, HOURS).toString());

        PowerSequencePriceDataType fData2 = new PowerSequencePriceDataType();
        fData2.setSequenceId(2L);
        fData2.setPotentialStartTime(currentTime.plus(3, HOURS).toString());

        PowerSequencePriceDataType fData3 = new PowerSequencePriceDataType();
        fData3.setSequenceId(3L);
        fData3.setPotentialStartTime(currentTime.plus(0, MINUTES).toString());

        PowerSequencePriceDataType fData4 = new PowerSequencePriceDataType();
        fData4.setSequenceId(3L);
        fData4.setPotentialStartTime(currentTime.plus(11, HOURS).toString());

        return List.of(
            sData, sData2, sData3, fData, fData2, fData3, fData4
        );
    }

    @Test
    public void testFilterDataWithNestedElementsTypes() throws SpineException {
        DeviceConfigurationKeyValueDataType sData
            = new DeviceConfigurationKeyValueDataType();
        sData.setKeyId(1L);
        sData.setValue(new DeviceConfigurationKeyValueValueType());
        sData.getValue().setBoolean(false);
        sData.getValue().setInteger(1L);
        sData.setIsValueChangeable(true);

        DeviceConfigurationKeyValueDataType fData
            = new DeviceConfigurationKeyValueDataType();
        fData.setKeyId(2L);
        fData.setValue(new DeviceConfigurationKeyValueValueType());
        fData.getValue().setBoolean(true);
        fData.setIsValueChangeable(true);

        List<DeviceConfigurationKeyValueDataType> givenData = List.of(sData, fData);

        DeviceConfigurationKeyValueListDataSelectorsType selector =
            new DeviceConfigurationKeyValueListDataSelectorsType();
        selector.setKeyId(1L);

        DeviceConfigurationKeyValueDataElementsType elements
            = new DeviceConfigurationKeyValueDataElementsType();
        elements.setValue(new DeviceConfigurationKeyValueValueElementsType());
        elements.getValue().setBoolean(new ElementTagType());

        FilterType filter = new FilterType();
        filter.getDeviceConfigurationKeyValueListDataSelectors().add(selector);
        filter.setDeviceConfigurationKeyValueDataElements(elements);

        ReadListFeatureFunction<DeviceConfigurationKeyValueDataType,
            DeviceConfigurationKeyValueListDataType,
            DeviceConfigurationKeyValueListDataSelectorsType,
            DeviceConfigurationKeyValueDataElementsType, ?> readListFeatureFunction;

        readListFeatureFunction = new ReadListFeatureFunction<>(
            "someName",
            new ListFeatureFunctionTypeInfo<>(
                new DataIdDescription<>(
                    DeviceConfigurationKeyValueDataType.class,
                    List.of("keyId")
                ), DeviceConfigurationKeyValueListDataType.class,
                DeviceConfigurationKeyValueListDataSelectorsType.class,
                DeviceConfigurationKeyValueDataElementsType.class
            )
        ) {
            @Override
            protected void validateReadCmd(
                List<DeviceConfigurationKeyValueListDataSelectorsType> deviceConfigurationKeyValueListDataSelectorsTypes,
                DeviceConfigurationKeyValueDataElementsType elements,
                ReadListCmdOption readListCmdOption
            ) {

            }

            @Override
            protected void validateData(
                DeviceConfigurationKeyValueDataType deviceConfigurationKeyValueDataType
            ) {

            }

            @Override
            protected void validateDataComplete(DeviceConfigurationKeyValueDataType deviceConfigurationKeyValueDataType) {

            }

            @Override
            public SpineAcknowledgment call(
                CmdType cmd,
                FeatureAddressType sourceAddress
            ) {
                return null;
            }
        };
        readListFeatureFunction.getDataListHolder().getDataList().clear();
        readListFeatureFunction.getDataListHolder().getDataList().addAll(givenData);

        List<DeviceConfigurationKeyValueDataType> filteredData
            = readListFeatureFunction.getDataListHolder()
            .readData(
                filter,
                readListFeatureFunction.getTypeInfo().getElementsType(),
                readListFeatureFunction::validateReadFilter
            );

        assertEquals(1, filteredData.size());
        assertFalse(filteredData.get(0).getValue().getBoolean());
        assertNull(filteredData.get(0).getKeyId());
        assertNull(filteredData.get(0).getValue().getInteger());
    }

    @Test
    void testBuildReadReplyCmd() throws SpineException {
        FilterType filter = new FilterType();
        filter.setCmdControl(SpineUtilities.getPartialCmdControl());
        CmdType cmd = measDescReadListFeatureFunction.readDataAndBuildReadReplyCmd(
            filter);

        assertEquals("someName", cmd.getFunction());
        assertNotNull(cmd.getFilter().get(0).getCmdControl().getPartial());
        assertNotNull(cmd.getMeasurementDescriptionListData());
    }

    @Test
    void testGetDeletionElementsForSelectorsMap() {

        // ----------------------- unit is deleted
        MeasurementDescriptionDataType md1_group1
            = new MeasurementDescriptionDataType();
        md1_group1.setMeasurementId(1L);
        md1_group1.setDescription("someDescription");
        md1_group1.setUnit("W");

        MeasurementDescriptionDataType md1_group1_upd
            = new MeasurementDescriptionDataType();
        md1_group1_upd.setMeasurementId(1L);
        md1_group1_upd.setDescription("someDescription");

        // -----------------------

        MeasurementDescriptionDataType md3_group1
            = new MeasurementDescriptionDataType();
        md3_group1.setMeasurementId(3L);
        md3_group1.setUnit("D");
        md3_group1.setCalibrationValue(new ScaledNumberType());
        md3_group1.getCalibrationValue().setNumber(1L);
        md3_group1.getCalibrationValue().setScale((short) 1);

        MeasurementDescriptionDataType md3_group1_upd
            = new MeasurementDescriptionDataType();
        md3_group1_upd.setMeasurementId(3L);
        md3_group1_upd.setCalibrationValue(new ScaledNumberType());
        md3_group1_upd.getCalibrationValue().setNumber(1L);
        md3_group1_upd.getCalibrationValue().setScale((short) 1);

        // whole scaled number (calibration value) is deleted -----------------------

        MeasurementDescriptionDataType md2_group2
            = new MeasurementDescriptionDataType();
        md2_group2.setMeasurementId(2L);
        md2_group2.setCalibrationValue(new ScaledNumberType());
        md2_group2.getCalibrationValue().setNumber(1L);
        md2_group2.getCalibrationValue().setScale((short) 1);

        MeasurementDescriptionDataType md2_group2_upd
            = new MeasurementDescriptionDataType();
        md2_group2_upd.setMeasurementId(2L);
        md2_group2_upd.setDescription("someDescription");

        // scale is deleted -----------------------

        MeasurementDescriptionDataType md4_group3
            = new MeasurementDescriptionDataType();
        md4_group3.setMeasurementId(4L);
        md4_group3.setCalibrationValue(new ScaledNumberType());
        md4_group3.getCalibrationValue().setNumber(1L);
        md4_group3.getCalibrationValue().setScale((short) 1);

        MeasurementDescriptionDataType md4_group3_upd
            = new MeasurementDescriptionDataType();
        md4_group3_upd.setMeasurementId(4L);
        md4_group3_upd.setCalibrationValue(new ScaledNumberType());
        md4_group3_upd.getCalibrationValue().setNumber(1L);

        // -----------------------

        MeasurementDescriptionDataType md5_group3
            = new MeasurementDescriptionDataType();
        md5_group3.setMeasurementId(5L);
        md5_group3.setCalibrationValue(new ScaledNumberType());
        md5_group3.getCalibrationValue().setNumber(1L);
        md5_group3.getCalibrationValue().setScale((short) 1);

        MeasurementDescriptionDataType md5_group3_upd
            = new MeasurementDescriptionDataType();
        md5_group3_upd.setMeasurementId(5L);
        md5_group3_upd.setCalibrationValue(new ScaledNumberType());
        md5_group3_upd.getCalibrationValue().setNumber(1L);

        // no deletion -----------------------

        MeasurementDescriptionDataType md6_no_del
            = new MeasurementDescriptionDataType();
        md6_no_del.setMeasurementId(6L);
        md6_no_del.setCalibrationValue(new ScaledNumberType());
        md6_no_del.getCalibrationValue().setNumber(1L);
        md6_no_del.getCalibrationValue().setScale((short) 1);

        MeasurementDescriptionDataType md6_no_del_upd
            = new MeasurementDescriptionDataType();
        md6_no_del_upd.setMeasurementId(6L);
        md6_no_del_upd.setCalibrationValue(new ScaledNumberType());
        md6_no_del_upd.getCalibrationValue().setNumber(1L);
        md6_no_del_upd.getCalibrationValue().setScale((short) 1);

        Map<MeasurementDescriptionDataType, MeasurementDescriptionDataType>
            map = new LinkedHashMap<>();
        map.put(md1_group1, md1_group1_upd);
        map.put(md2_group2, md2_group2_upd);
        map.put(md3_group1, md3_group1_upd);
        map.put(md4_group3, md4_group3_upd);
        map.put(md5_group3, md5_group3_upd);
        map.put(md6_no_del, md6_no_del_upd);

        Map<MeasurementDescriptionDataElementsType, List<MeasurementDescriptionListDataSelectorsType>>
            resultMap
            = measDescReadListFeatureFunction.getDeletionElementsForSelectorsMap(map);

        assertEquals(3, resultMap.size());

        Iterator<Map.Entry<MeasurementDescriptionDataElementsType, List<MeasurementDescriptionListDataSelectorsType>>>
            iterator = resultMap.entrySet().iterator();
        Map.Entry<MeasurementDescriptionDataElementsType, List<MeasurementDescriptionListDataSelectorsType>>
            entry = iterator.next();

        assertNotNull(entry.getKey().getUnit());
        assertNull(entry.getKey().getCalibrationValue());
        assertEquals(2, entry.getValue().size());
        assertEquals(1L, entry.getValue().get(0).getMeasurementId());
        assertEquals(3L, entry.getValue().get(1).getMeasurementId());

        entry = iterator.next();

        assertNotNull(entry.getKey().getCalibrationValue().getNumber());
        assertNotNull(entry.getKey().getCalibrationValue().getScale());
        assertNull(entry.getKey().getUnit());
        assertEquals(1, entry.getValue().size());
        assertEquals(2L, entry.getValue().get(0).getMeasurementId());

        entry = iterator.next();

        assertNotNull(entry.getKey().getCalibrationValue().getScale());
        assertNull(entry.getKey().getCalibrationValue().getNumber());
        assertNull(entry.getKey().getUnit());
        assertEquals(2, entry.getValue().size());
        assertEquals(4L, entry.getValue().get(0).getMeasurementId());
        assertEquals(5L, entry.getValue().get(1).getMeasurementId());

    }

    @Test
    void testSetElements() {
        MeasurementDescriptionDataElementsType elements
            = new MeasurementDescriptionDataElementsType();
        elements.setLabel(new ElementTagType());
        FilterType filter = new FilterType();
        measDescReadListFeatureFunction.setElements(filter, elements);
        assertTrue(SpineObjects.dataEquals(
            elements,
            filter.getMeasurementDescriptionDataElements()
        ));
    }
}