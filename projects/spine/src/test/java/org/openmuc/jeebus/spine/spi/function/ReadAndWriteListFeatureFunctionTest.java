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

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openmuc.jeebus.spine.api.DataUpdateType;
import org.openmuc.jeebus.spine.api.SpineAcknowledgment;
import org.openmuc.jeebus.spine.api.SpineException;
import org.openmuc.jeebus.spine.api.options.ReadListCmdOption;
import org.openmuc.jeebus.spine.api.options.WriteListCmdOption;
import org.openmuc.jeebus.spine.impl.DataIdDescription;
import org.openmuc.jeebus.spine.impl.EntityBuilder;
import org.openmuc.jeebus.spine.utils.Filters;
import org.openmuc.jeebus.spine.utils.SpineObjects;
import org.openmuc.jeebus.spine.xsd.v1.*;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;
import static org.openmuc.jeebus.spine.impl.DataIdDescription.getNoneIdentifiableDataDescription;

class ReadAndWriteListFeatureFunctionTest {

    private ReadAndWriteListFeatureFunction<
        DeviceConfigurationKeyValueDataType,
        DeviceConfigurationKeyValueListDataType,
        DeviceConfigurationKeyValueListDataSelectorsType,
        DeviceConfigurationKeyValueDataElementsType,
        ?
        > deviceReadAndWriteUtility;

    private TestReadAndWriteFeatureFunction measurementReadAndWriteFeatureFunction;

    private final List<MeasurementDataType> measurementData = new ArrayList<>();
    private int updateDataCallCount;
    private int deleteDataCallCount;
    private int addDataCallCount;

    ReadAndWriteListFeatureFunction<
        DeviceConfigurationKeyValueDataType,
        DeviceConfigurationKeyValueListDataType,
        DeviceConfigurationKeyValueListDataSelectorsType,
        DeviceConfigurationKeyValueDataElementsType,
        ?
        > getDeviceReadAndWriteUtility() {
        return deviceReadAndWriteUtility;
    }

    TestReadAndWriteFeatureFunction getMeasurementReadAndWriteFeatureFunction() {
        return measurementReadAndWriteFeatureFunction;
    }

    List<MeasurementDataType> getMeasurementData() {
        return measurementData;
    }

    int getUpdateDataCallCount() {
        return updateDataCallCount;
    }

    int getDeleteDataCallCount() {
        return deleteDataCallCount;
    }

    int getAddDataCallCount() {
        return addDataCallCount;
    }

    public interface InsideWriteDataListAssertion {
        void assertion();
    }

    class TestReadAndWriteFeatureFunction extends ReadAndWriteListFeatureFunction<
        MeasurementDataType,
        MeasurementListDataType,
        MeasurementListDataSelectorsType,
        MeasurementDataElementsType,
        ListFeatureFunctionTypeInfo<
            MeasurementDataType,
            MeasurementListDataType,
            MeasurementListDataSelectorsType,
            MeasurementDataElementsType
            >> {

        private final AtomicBoolean wait = new AtomicBoolean(false);
        private final AtomicBoolean finished = new AtomicBoolean(false);
        private InsideWriteDataListAssertion assertion = () -> {
        };

        public TestReadAndWriteFeatureFunction() {
            super(
                "someName",
                new ListFeatureFunctionTypeInfo<>(
                    new DataIdDescription<>(
                        MeasurementDataType.class,
                        List.of("measurementId"),
                        List.of("valueType")
                    ),
                    MeasurementListDataType.class,
                    MeasurementListDataSelectorsType.class,
                    MeasurementDataElementsType.class
                )
            );
        }

        @Override
        public void writeDataList(CmdType cmd) throws SpineException {
            while (getWait().get()) {
                try {
                    Thread.sleep(100);
                }
                catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            getAssertion().assertion();
            super.writeDataList(cmd);
            getFinished().set(true);
        }

        @Override
        protected void validateReadCmd(
            List<MeasurementListDataSelectorsType> selectorsTypeList,
            MeasurementDataElementsType elements, ReadListCmdOption readListCmdOption
        ) {

        }

        @Override
        protected void validateData(MeasurementDataType measurementDataType) {

        }

        @Override
        public void writeData(
            MeasurementDataType measurementDataType,
            DataUpdateType dataUpdateType,
            Integer idx
        ) {
            switch (dataUpdateType) {
                case UPDATE_DATA:
                    updateDataCallCount = getUpdateDataCallCount() + 1;
                    break;
                case DELETE_DATA:
                    deleteDataCallCount = getDeleteDataCallCount() + 1;
                    break;
                case ADD_DATA:
                    addDataCallCount = getAddDataCallCount() + 1;
                    break;
            }
        }

        @Override
        protected void validateUpdateForMatchingData(
            MeasurementDataType update,
            List<MeasurementDataType> matchingData,
            WriteListCmdOption writeListCmdOption
        ) {

        }

        @Override
        protected void validateWriteCmdFull(
            List<MeasurementDataType> updateList,
            List<MeasurementListDataSelectorsType> selectorsTypeList,
            MeasurementDataElementsType elements,
            WriteListCmdOption writeListCmdOption
        ) {

        }

        @Override
        public SpineAcknowledgment call(
            CmdType cmd,
            FeatureAddressType sourceAddress
        ) {
            return null;
        }

        AtomicBoolean getWait() {
            return wait;
        }

        AtomicBoolean getFinished() {
            return finished;
        }

        InsideWriteDataListAssertion getAssertion() {
            return assertion;
        }

        void setAssertion(InsideWriteDataListAssertion assertion) {
            this.assertion = assertion;
        }
    }

    @BeforeEach
    void init() {

        updateDataCallCount = 0;
        deleteDataCallCount = 0;
        addDataCallCount = 0;

        DataIdDescription<DeviceConfigurationKeyValueDataType>
            deviceConfigKeyDescription = new DataIdDescription<>(
            DeviceConfigurationKeyValueDataType.class,
            List.of("keyId")
        );

        deviceReadAndWriteUtility = new ReadAndWriteListFeatureFunction<>(
            "someName",
            new ListFeatureFunctionTypeInfo<>(
                deviceConfigKeyDescription,
                DeviceConfigurationKeyValueListDataType.class,
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
            public void writeData(
                DeviceConfigurationKeyValueDataType deviceConfigurationKeyValueDataType,
                DataUpdateType dataUpdateType,
                Integer idx
            ) {
                switch (dataUpdateType) {
                    case UPDATE_DATA:
                        updateDataCallCount = getUpdateDataCallCount() + 1;
                        break;
                    case DELETE_DATA:
                        deleteDataCallCount = getDeleteDataCallCount() + 1;
                        break;
                    case ADD_DATA:
                        addDataCallCount = getAddDataCallCount() + 1;
                        break;
                }
            }

            @Override
            protected void validateUpdateForMatchingData(
                DeviceConfigurationKeyValueDataType update,
                List<DeviceConfigurationKeyValueDataType> matchingData,
                WriteListCmdOption writeListCmdOption
            ) {

            }

            @Override
            protected void validateWriteCmdFull(
                List<DeviceConfigurationKeyValueDataType> updateList,
                List<DeviceConfigurationKeyValueListDataSelectorsType> deviceConfigurationKeyValueListDataSelectorsTypes,
                DeviceConfigurationKeyValueDataElementsType elements,
                WriteListCmdOption writeListCmdOption
            ) {

            }

            @Override
            public SpineAcknowledgment call(
                CmdType cmd, FeatureAddressType sourceAddress
            ) {
                return null;
            }
        };

        getMeasurementData().add(new MeasurementDataType());
        getMeasurementData().get(0).setMeasurementId(1L);
        getMeasurementData().get(0).setValue(new ScaledNumberType());
        getMeasurementData().get(0).getValue().setNumber(1L);
        getMeasurementData()
            .get(0)
            .setValueType(MeasurementValueTypeEnumType.VALUE.value());
        getMeasurementData()
            .get(0)
            .setValueSource(MeasurementValueSourceEnumType.MEASURED_VALUE.value());
        getMeasurementData().get(0).setEvaluationPeriod(new TimePeriodType());
        getMeasurementData().get(0).getEvaluationPeriod().setStartTime("1");
        getMeasurementData().get(0).getEvaluationPeriod().setEndTime("2");

        getMeasurementData().add(new MeasurementDataType());
        getMeasurementData().get(1).setMeasurementId(1L);
        getMeasurementData().get(1).setValue(new ScaledNumberType());
        getMeasurementData().get(1).getValue().setNumber(2L);
        getMeasurementData()
            .get(1)
            .setValueType(MeasurementValueTypeEnumType.AVERAGE_VALUE.value());
        getMeasurementData()
            .get(1)
            .setValueSource(MeasurementValueSourceEnumType.EMPIRICAL_VALUE.value());

        getMeasurementData().add(new MeasurementDataType());
        getMeasurementData().get(2).setMeasurementId(2L);
        getMeasurementData().get(2).setValue(new ScaledNumberType());
        getMeasurementData().get(2).getValue().setNumber(3L);
        getMeasurementData()
            .get(2)
            .setValueSource(MeasurementValueSourceEnumType.CALCULATED_VALUE.value());

        measurementReadAndWriteFeatureFunction
            = new TestReadAndWriteFeatureFunction();
        EntityBuilder entityBuilder = new EntityBuilder();
        entityBuilder
            .addFeature()
            .addFunction(getMeasurementReadAndWriteFeatureFunction());
        getMeasurementReadAndWriteFeatureFunction()
            .getDataListHolder()
            .getDataList()
            .addAll(getMeasurementData());
        getMeasurementReadAndWriteFeatureFunction().addUseCaseWriteValidationFull(
            this::writeValidation);
    }

    void writeValidation(
        List<MeasurementDataType> dataList,
        List<MeasurementListDataSelectorsType> selectorsList,
        MeasurementDataElementsType elements,
        WriteListCmdOption writeListCmdOption
    ) {

    }

    @Test
    void testWriteForAllNoneNullProperties() {

        DeviceConfigurationKeyValueDataType data
            = new DeviceConfigurationKeyValueDataType();
        data.setValue(new DeviceConfigurationKeyValueValueType());
        data.getValue().setInteger(1L);
        data.getValue().setBoolean(true);
        data.setIsValueChangeable(true);

        DeviceConfigurationKeyValueDataType update
            = new DeviceConfigurationKeyValueDataType();
        update.setValue(new DeviceConfigurationKeyValueValueType());
        update.getValue().setInteger(2L);
        SpineObjects.writeForAllNonNullProperties(data, update);

        assertEquals(2L, data.getValue().getInteger());
        assertEquals(true, data.getValue().getBoolean());
        assertEquals(true, data.getIsValueChangeable());

        update.getValue().setBoolean(false);
        SpineObjects.writeForAllNonNullProperties(data, update);
        assertEquals(2L, data.getValue().getInteger());
        assertEquals(false, data.getValue().getBoolean());
        assertEquals(true, data.getIsValueChangeable());

        DeviceConfigurationKeyValueDataType data2
            = new DeviceConfigurationKeyValueDataType();
        data2.setValue(new DeviceConfigurationKeyValueValueType());

        XMLGregorianCalendar baseDate = DatatypeFactory
            .newDefaultInstance()
            .newXMLGregorianCalendarDate(
                2000,
                2,
                2,
                2
            );
        data2.getValue().setDate(baseDate);

        DeviceConfigurationKeyValueDataType update2
            = new DeviceConfigurationKeyValueDataType();
        update2.setValue(new DeviceConfigurationKeyValueValueType());
        XMLGregorianCalendar dateUpdate = DatatypeFactory
            .newDefaultInstance()
            .newXMLGregorianCalendarDate(
                1999,
                9,
                9,
                9
            );

        update2.getValue().setDate(dateUpdate);
        Duration durationUpdate = DatatypeFactory
            .newDefaultInstance()
            .newDuration(2L);
        update2.getValue().setDuration(durationUpdate);
        SpineObjects.writeForAllNonNullProperties(data2, update2);

        assertEquals(data2.getValue().getDate(), dateUpdate);
        assertEquals(2000, baseDate.getYear());
        dateUpdate.setYear(2001);
        assertEquals(2000, baseDate.getYear());
        assertEquals(data2.getValue().getDuration(), durationUpdate);
    }

    @Test
    void testGetFilter() throws SpineException {
        CmdType cmdType = new CmdType();
        cmdType.getFilter().add(new FilterType());
        cmdType.getFilter().get(0).setCmdControl(new CmdControlType());

        assertNull(Filters.getDeleteFilter(cmdType));

        cmdType.getFilter().get(0).getCmdControl().setDelete(new ElementTagType());
        assertNotNull(Filters.getDeleteFilter(cmdType));

        cmdType.getFilter().add(new FilterType());
        cmdType.getFilter().get(1).setCmdControl(new CmdControlType());
        cmdType.getFilter().get(1).getCmdControl().setDelete(new ElementTagType());
        assertThrows(SpineException.class, () -> Filters.getDeleteFilter(cmdType));

        cmdType.getFilter().add(new FilterType());
        cmdType.getFilter().get(2).setCmdControl(new CmdControlType());
        cmdType.getFilter().get(2).getCmdControl().setPartial(new ElementTagType());
        assertNotNull(Filters.getPartialWriteFilter(cmdType));

        cmdType.getFilter().add(new FilterType());
        cmdType.getFilter().get(3).setCmdControl(new CmdControlType());
        cmdType.getFilter().get(3).getCmdControl().setPartial(new ElementTagType());
        assertThrows(
            SpineException.class,
            () -> Filters.getPartialWriteFilter(cmdType)
        );
    }

    @Test
    void testDataMatchesForKeyDescription() {
        DeviceConfigurationKeyValueDataType writable
            = new DeviceConfigurationKeyValueDataType();
        writable.setKeyId(1L);
        DeviceConfigurationKeyValueDataType update
            = new DeviceConfigurationKeyValueDataType();

        assertTrue(getDeviceReadAndWriteUtility()
            .getTypeInfo()
            .getDataIdDesc()
            .dataMatchesForIdDescription(writable, update));
        update.setKeyId(1L);

        assertTrue(getDeviceReadAndWriteUtility()
            .getTypeInfo()
            .getDataIdDesc()
            .dataMatchesForIdDescription(writable, update));
        update.setKeyId(2L);

        assertFalse(getDeviceReadAndWriteUtility()
            .getTypeInfo()
            .getDataIdDesc()
            .dataMatchesForIdDescription(writable, update));

        MeasurementDataType writable2 = new MeasurementDataType();
        writable2.setMeasurementId(1L);
        MeasurementDataType update2 = new MeasurementDataType();

        assertTrue(getMeasurementReadAndWriteFeatureFunction()
            .getTypeInfo()
            .getDataIdDesc()
            .dataMatchesForIdDescription(writable2, update2));
        update2.setMeasurementId(1L);

        assertTrue(getMeasurementReadAndWriteFeatureFunction()
            .getTypeInfo()
            .getDataIdDesc()
            .dataMatchesForIdDescription(writable2, update2));
        update2.setMeasurementId(2L);

        assertFalse(getMeasurementReadAndWriteFeatureFunction()
            .getTypeInfo()
            .getDataIdDesc()
            .dataMatchesForIdDescription(writable2, update2));

        writable2.setValueType(MeasurementValueTypeEnumType.AVERAGE_VALUE.value());
        update2.setMeasurementId(1L);

        assertFalse(getMeasurementReadAndWriteFeatureFunction()
            .getTypeInfo()
            .getDataIdDesc()
            .dataMatchesForIdDescription(writable2, update2));
        update2.setValueType(MeasurementValueTypeEnumType.VALUE.value());

        assertFalse(getMeasurementReadAndWriteFeatureFunction()
            .getTypeInfo()
            .getDataIdDesc()
            .dataMatchesForIdDescription(writable2, update2));
        update2.setValueType(MeasurementValueTypeEnumType.AVERAGE_VALUE.value());

        assertTrue(getMeasurementReadAndWriteFeatureFunction()
            .getTypeInfo()
            .getDataIdDesc()
            .dataMatchesForIdDescription(writable2, update2));
    }

    @Test
    void testValidateAllowedCmdOptions() throws SpineException {
        getDeviceReadAndWriteUtility()
            .getAllowedWriteCmdOptions()
            .remove(WriteListCmdOption.DELETE_ELEMENTS_BY_SELECTOR);
        WriteListCmdOption deleteOption = WriteListCmdOption.DELETE_ELEMENTS;
        getDeviceReadAndWriteUtility().validateAllowedCmdOptions(null, deleteOption);
        getDeviceReadAndWriteUtility()
            .getAllowedWriteCmdOptions()
            .remove(WriteListCmdOption.DELETE_ELEMENTS);
        assertThrows(
            SpineException.class,
            () -> getDeviceReadAndWriteUtility().validateAllowedCmdOptions(
                null,
                deleteOption
            )
        );
    }

    @Test
    void testValidatePartialWriteDataAndGetMatchingData() throws SpineException {
        List<MeasurementDataType> updateList = new ArrayList<>();
        updateList.add(new MeasurementDataType());
        updateList.get(0).setMeasurementId(1L);
        updateList.get(0).setValueType(MeasurementValueTypeEnumType.VALUE.value());
        updateList.add(new MeasurementDataType());
        updateList.get(1).setMeasurementId(1L);
        updateList
            .get(1)
            .setValueType(MeasurementValueTypeEnumType.AVERAGE_VALUE.value());

        WriteListCmdOption writeOption
            = WriteListCmdOption.PARTIAL_WRITE_BY_FUNCTION_ID;

        FilterType partialFilter = new FilterType();

        Map<MeasurementDataType, List<MeasurementDataType>> dataMap
            = new HashMap<>();
        getMeasurementReadAndWriteFeatureFunction()
            .validatePartialWriteDataAndGetMatchingData(
                updateList,
                writeOption,
                partialFilter
            )
            .forEach((key, value) -> {
                List<MeasurementDataType> dataList = value
                    .stream()
                    .map(idx -> getMeasurementReadAndWriteFeatureFunction()
                        .getDataListHolder()
                        .getDataList()
                        .get(idx))
                    .collect(Collectors.toList());
                dataMap.put(key, dataList);
            });
        assertEquals(dataMap.size(), updateList.size());
        assertTrue(dataMap
            .entrySet()
            .stream()
            .anyMatch(entry -> entry.getKey().getMeasurementId().equals(1L)
                && entry
                .getKey()
                .getValueType()
                .equals(MeasurementValueTypeEnumType.VALUE.value())
                && entry.getValue().size() == 1
                && entry.getValue().get(0).getValue().getNumber() == 1L));
        assertTrue(dataMap
            .entrySet()
            .stream()
            .anyMatch(entry -> entry.getKey().getMeasurementId().equals(1L)
                && entry
                .getKey()
                .getValueType()
                .equals(MeasurementValueTypeEnumType.AVERAGE_VALUE.value())
                && entry.getValue().size() == 1
                && entry.getValue().get(0).getValue().getNumber() == 2L));

        updateList.get(1).setMeasurementId(2L);
        assertThrows(
            SpineException.class,
            () -> getMeasurementReadAndWriteFeatureFunction().validatePartialWriteDataAndGetMatchingData(
                updateList,
                writeOption,
                partialFilter
            )
        );
    }

    List<MeasurementListDataSelectorsType> getSelectorList() {
        List<MeasurementListDataSelectorsType> selectorList = new ArrayList<>();
        selectorList.add(new MeasurementListDataSelectorsType());
        selectorList.add(new MeasurementListDataSelectorsType());
        selectorList.get(0).setValueType(MeasurementValueTypeEnumType.VALUE.value());
        selectorList.get(0).setMeasurementId(1L);
        selectorList.get(1).setMeasurementId(2L);
        return selectorList;
    }

    MeasurementDataType getChangeData() {
        MeasurementDataType changeData = new MeasurementDataType();
        changeData.setEvaluationPeriod(new TimePeriodType());
        changeData.getEvaluationPeriod().setStartTime("100");
        changeData.setValue(new ScaledNumberType());
        changeData.getValue().setNumber(100L);
        changeData.setValueTendency("someTendency");
        return changeData;
    }

    @Test
    void testWriteDataListForSelectors() throws SpineException {

        CmdType cmd = new CmdType();
        cmd.getFilter().add(new FilterType());
        cmd.getFilter().get(0).setCmdControl(new CmdControlType());
        cmd.getFilter().get(0).getCmdControl().setPartial(new ElementTagType());
        cmd
            .getFilter()
            .get(0)
            .getMeasurementListDataSelectors()
            .addAll(getSelectorList());

        cmd.setMeasurementListData(new MeasurementListDataType());
        cmd.getMeasurementListData().getMeasurementData().add(getChangeData());

        getMeasurementReadAndWriteFeatureFunction().writeDataList(cmd);
        List<MeasurementDataType> dataList
            = getMeasurementReadAndWriteFeatureFunction()
            .getDataListHolder()
            .getDataList();

        assertEquals(2, getUpdateDataCallCount());

        // update data 0 and 2 are selected
        assertEquals("100", dataList.get(0).getEvaluationPeriod().getStartTime());
        assertEquals("someTendency", dataList.get(0).getValueTendency());
        assertEquals(100L, dataList.get(0).getValue().getNumber());

        assertEquals("100", dataList.get(2).getEvaluationPeriod().getStartTime());
        assertEquals("someTendency", dataList.get(2).getValueTendency());
        assertEquals(100L, dataList.get(2).getValue().getNumber());

        // old values
        assertEquals("2", dataList.get(0).getEvaluationPeriod().getEndTime());
        assertEquals(1L, dataList.get(0).getMeasurementId());
        assertEquals(
            MeasurementValueTypeEnumType.VALUE.value(),
            dataList.get(0).getValueType()
        );
        assertEquals(
            MeasurementValueSourceEnumType.MEASURED_VALUE.value(),
            dataList.get(0).getValueSource()
        );
        assertNull(dataList.get(0).getTimestamp());
        assertNull(dataList.get(0).getValueState());

        assertEquals(1L, dataList.get(1).getMeasurementId());
        assertEquals(2L, dataList.get(1).getValue().getNumber());
        assertEquals(
            MeasurementValueTypeEnumType.AVERAGE_VALUE.value(),
            dataList.get(1).getValueType()
        );
        assertEquals(
            MeasurementValueSourceEnumType.EMPIRICAL_VALUE.value(),
            dataList.get(1).getValueSource()
        );
        assertNull(dataList.get(1).getEvaluationPeriod());
        assertNull(dataList.get(1).getValue().getScale());
        assertNull(dataList.get(1).getTimestamp());
        assertNull(dataList.get(1).getValueState());
        assertNull(dataList.get(1).getValueTendency());

        assertEquals(2L, dataList.get(2).getMeasurementId());
        assertNull(dataList.get(2).getValueType());
        assertEquals(
            MeasurementValueSourceEnumType.CALCULATED_VALUE.value(),
            dataList.get(2).getValueSource()
        );
        assertNull(dataList.get(2).getEvaluationPeriod().getEndTime());
        assertNull(dataList.get(2).getTimestamp());
        assertNull(dataList.get(2).getValueState());

        // ids may not be set if selectors are used
        cmd
            .getMeasurementListData()
            .getMeasurementData()
            .get(0)
            .setMeasurementId(1L);
        assertThrows(
            SpineException.class,
            () -> getMeasurementReadAndWriteFeatureFunction().writeDataList(cmd)
        );
        cmd
            .getMeasurementListData()
            .getMeasurementData()
            .get(0)
            .setMeasurementId(null);

        getMeasurementReadAndWriteFeatureFunction()
            .getAllowedWriteCmdOptions()
            .remove(WriteListCmdOption.PARTIAL_WRITE_BY_SELECTOR);
        assertThrows(
            SpineException.class,
            () -> getMeasurementReadAndWriteFeatureFunction().writeDataList(cmd)
        );

        getMeasurementReadAndWriteFeatureFunction()
            .getAllowedWriteCmdOptions()
            .add(WriteListCmdOption.PARTIAL_WRITE_BY_SELECTOR);

        assertEquals(2, getUpdateDataCallCount());
    }

    void assertNoneSelectedValuesSame() {
        List<MeasurementDataType> dataList
            = getMeasurementReadAndWriteFeatureFunction()
            .getDataListHolder()
            .getDataList();
        assertEquals(1L, dataList.get(1).getMeasurementId());
        assertEquals(2L, dataList.get(1).getValue().getNumber());
        assertEquals(
            MeasurementValueTypeEnumType.AVERAGE_VALUE.value(),
            dataList.get(1).getValueType()
        );
        assertEquals(
            MeasurementValueSourceEnumType.EMPIRICAL_VALUE.value(),
            dataList.get(1).getValueSource()
        );
        assertNull(dataList.get(1).getEvaluationPeriod());
        assertNull(dataList.get(1).getValue().getScale());
        assertNull(dataList.get(1).getTimestamp());
        assertNull(dataList.get(1).getValueState());
        assertNull(dataList.get(1).getValueTendency());
    }

    @Test
    void testDeleteDataElementsForSelectors() throws SpineException {

        CmdType cmd = new CmdType();
        cmd.getFilter().add(new FilterType());
        cmd.getFilter().get(0).setCmdControl(new CmdControlType());
        cmd.getFilter().get(0).getCmdControl().setDelete(new ElementTagType());

        MeasurementDataElementsType elements = new MeasurementDataElementsType();
        elements.setEvaluationPeriod(new TimePeriodElementsType());
        elements.getEvaluationPeriod().setStartTime(new ElementTagType());
        elements.setValueSource(new ElementTagType());

        cmd.getFilter().get(0).setMeasurementDataElements(elements);
        cmd
            .getFilter()
            .get(0)
            .getMeasurementListDataSelectors()
            .addAll(getSelectorList());

        getMeasurementReadAndWriteFeatureFunction().writeDataList(cmd);
        List<MeasurementDataType> dataList
            = getMeasurementReadAndWriteFeatureFunction()
            .getDataListHolder()
            .getDataList();

        assertEquals(2, getUpdateDataCallCount());

        // deleted
        assertNull(dataList.get(0).getEvaluationPeriod().getStartTime());
        assertNull(dataList.get(0).getValueSource());

        // old values
        assertEquals(
            MeasurementValueTypeEnumType.VALUE.value(),
            dataList.get(0).getValueType()
        );
        assertEquals("2", dataList.get(0).getEvaluationPeriod().getEndTime());
        assertEquals(1L, dataList.get(0).getMeasurementId());
        assertEquals(1L, dataList.get(0).getValue().getNumber());
        assertNull(dataList.get(0).getValue().getScale());
        assertNull(dataList.get(0).getTimestamp());
        assertNull(dataList.get(0).getValueState());
        assertNull(dataList.get(0).getValueTendency());

        assertEquals(2L, dataList.get(2).getMeasurementId());
        assertEquals(3L, dataList.get(2).getValue().getNumber());
        assertNull(dataList.get(2).getEvaluationPeriod());

        assertNoneSelectedValuesSame();

        elements.setMeasurementId(new ElementTagType());
        assertThrows(
            SpineException.class,
            () -> getMeasurementReadAndWriteFeatureFunction().writeDataList(cmd)
        );
        elements.setMeasurementId(null);
        elements.setValueType(new ElementTagType());
        assertThrows(
            SpineException.class,
            () -> getMeasurementReadAndWriteFeatureFunction().writeDataList(cmd)
        );
        elements.setValueType(null);

        assertEquals(2, getUpdateDataCallCount());
    }

    @Test
    void testDeleteDataElements() throws SpineException {
        CmdType cmd = new CmdType();
        cmd.getFilter().add(new FilterType());
        cmd.getFilter().get(0).setCmdControl(new CmdControlType());
        cmd.getFilter().get(0).getCmdControl().setDelete(new ElementTagType());

        MeasurementDataElementsType elements = new MeasurementDataElementsType();
        elements.setEvaluationPeriod(new TimePeriodElementsType());
        elements.getEvaluationPeriod().setStartTime(new ElementTagType());
        elements.setValueSource(new ElementTagType());

        cmd.getFilter().get(0).setMeasurementDataElements(elements);

        getMeasurementReadAndWriteFeatureFunction().writeDataList(cmd);
        List<MeasurementDataType> dataList
            = getMeasurementReadAndWriteFeatureFunction()
            .getDataListHolder()
            .getDataList();

        assertEquals(3, getUpdateDataCallCount());

        // deleted
        assertNull(dataList.get(0).getEvaluationPeriod().getStartTime());
        assertNull(dataList.get(0).getValueSource());

        assertNull(dataList.get(1).getValueSource());

        assertNull(dataList.get(2).getValueSource());

        // old values
        assertEquals("2", dataList.get(0).getEvaluationPeriod().getEndTime());
        assertEquals(1, dataList.get(0).getValue().getNumber());
        assertEquals(1L, dataList.get(0).getMeasurementId());
        assertEquals(
            MeasurementValueTypeEnumType.VALUE.value(),
            dataList.get(0).getValueType()
        );
        assertNull(dataList.get(0).getValueTendency());
        assertNull(dataList.get(0).getTimestamp());
        assertNull(dataList.get(0).getValueState());

        assertEquals(3, dataList.get(2).getValue().getNumber());
        assertEquals(2L, dataList.get(2).getMeasurementId());
        assertNull(dataList.get(2).getValueType());
        assertNull(dataList.get(2).getEvaluationPeriod());
        assertNull(dataList.get(2).getTimestamp());
        assertNull(dataList.get(2).getValueState());

        assertEquals(1L, dataList.get(1).getMeasurementId());
        assertEquals(2L, dataList.get(1).getValue().getNumber());
        assertEquals(
            MeasurementValueTypeEnumType.AVERAGE_VALUE.value(),
            dataList.get(1).getValueType()
        );
        assertNull(dataList.get(1).getEvaluationPeriod());
        assertNull(dataList.get(1).getValue().getScale());
        assertNull(dataList.get(1).getTimestamp());
        assertNull(dataList.get(1).getValueState());
        assertNull(dataList.get(1).getValueTendency());
    }

    @Test
    void testDeleteForSelectors() throws SpineException {
        CmdType cmd = new CmdType();
        cmd.getFilter().add(new FilterType());
        cmd.getFilter().get(0).setCmdControl(new CmdControlType());
        cmd.getFilter().get(0).getCmdControl().setDelete(new ElementTagType());

        cmd
            .getFilter()
            .get(0)
            .getMeasurementListDataSelectors()
            .addAll(getSelectorList());

        getMeasurementReadAndWriteFeatureFunction().writeDataList(cmd);

        assertEquals(0, getUpdateDataCallCount());
        assertEquals(2, getDeleteDataCallCount());

        List<MeasurementDataType> dataList
            = getMeasurementReadAndWriteFeatureFunction()
            .getDataListHolder()
            .getDataList();

        assertNull(dataList.get(0));
        assertNull(dataList.get(2));
        assertEquals(1, dataList.get(1).getMeasurementId());
        assertEquals(
            MeasurementValueTypeEnumType.AVERAGE_VALUE.value(),
            dataList.get(1).getValueType()
        );
    }

    @Test
    void testWriteDataListForId() throws SpineException {

        CmdType cmd = new CmdType();
        cmd.getFilter().add(new FilterType());
        cmd.getFilter().get(0).setCmdControl(new CmdControlType());
        cmd.getFilter().get(0).getCmdControl().setPartial(new ElementTagType());

        cmd.setMeasurementListData(new MeasurementListDataType());
        cmd.getMeasurementListData().getMeasurementData().add(getChangeData());
        cmd
            .getMeasurementListData()
            .getMeasurementData()
            .get(0)
            .setMeasurementId(1L);
        cmd.getMeasurementListData()
            .getMeasurementData()
            .get(0)
            .setValueType(MeasurementValueTypeEnumType.VALUE.value());
        cmd.getMeasurementListData().getMeasurementData().add(getChangeData());
        cmd
            .getMeasurementListData()
            .getMeasurementData()
            .get(1)
            .setMeasurementId(2L);

        getMeasurementReadAndWriteFeatureFunction().writeDataList(cmd);
        List<MeasurementDataType> dataList
            = getMeasurementReadAndWriteFeatureFunction()
            .getDataListHolder()
            .getDataList();

        assertEquals(2, getUpdateDataCallCount());

        // update data 0 and 2 are selected
        assertEquals("100", dataList.get(0).getEvaluationPeriod().getStartTime());
        assertEquals("someTendency", dataList.get(0).getValueTendency());
        assertEquals(100L, dataList.get(0).getValue().getNumber());

        assertEquals("100", dataList.get(2).getEvaluationPeriod().getStartTime());
        assertEquals("someTendency", dataList.get(2).getValueTendency());
        assertEquals(100L, dataList.get(2).getValue().getNumber());

        // old values
        assertEquals("2", dataList.get(0).getEvaluationPeriod().getEndTime());
        assertEquals(1L, dataList.get(0).getMeasurementId());
        assertEquals(
            MeasurementValueTypeEnumType.VALUE.value(),
            dataList.get(0).getValueType()
        );
        assertEquals(
            MeasurementValueSourceEnumType.MEASURED_VALUE.value(),
            dataList.get(0).getValueSource()
        );
        assertNull(dataList.get(0).getTimestamp());
        assertNull(dataList.get(0).getValueState());

        assertNull(dataList.get(2).getEvaluationPeriod().getEndTime());
        assertEquals(2L, dataList.get(2).getMeasurementId());
        assertEquals(
            MeasurementValueSourceEnumType.CALCULATED_VALUE.value(),
            dataList.get(2).getValueSource()
        );
        assertNull(dataList.get(2).getValueType());
        assertNull(dataList.get(2).getTimestamp());
        assertNull(dataList.get(2).getValueState());

        assertNoneSelectedValuesSame();

        cmd
            .getFilter()
            .get(0)
            .setMeasurementDataElements(new MeasurementDataElementsType());

        assertThrows(
            SpineException.class,
            () -> getMeasurementReadAndWriteFeatureFunction().writeDataList(cmd)
        );

        assertEquals(2, getUpdateDataCallCount());
    }

    @Test
    void testFullWrite() throws SpineException {

        CmdType cmd = new CmdType();
        cmd.getFilter().add(new FilterType());
        cmd.getFilter().get(0).setCmdControl(new CmdControlType());

        cmd.setMeasurementListData(new MeasurementListDataType());
        cmd.getMeasurementListData().getMeasurementData().add(getChangeData());
        cmd
            .getMeasurementListData()
            .getMeasurementData()
            .get(0)
            .setMeasurementId(1L);
        cmd.getMeasurementListData()
            .getMeasurementData()
            .get(0)
            .setValueType(MeasurementValueTypeEnumType.VALUE.value());
        cmd.getMeasurementListData().getMeasurementData().add(getChangeData());
        cmd
            .getMeasurementListData()
            .getMeasurementData()
            .get(1)
            .setMeasurementId(2L);
        cmd.getMeasurementListData().getMeasurementData().add(getChangeData());
        cmd
            .getMeasurementListData()
            .getMeasurementData()
            .get(2)
            .setMeasurementId(3L);

        getMeasurementReadAndWriteFeatureFunction().writeDataList(cmd);
        List<MeasurementDataType> dataList
            = getMeasurementReadAndWriteFeatureFunction()
            .getDataListHolder()
            .getDataList();

        assertEquals(1, getAddDataCallCount());
        assertEquals(2, getUpdateDataCallCount());

        assertEquals(4, dataList.size());

        // update data 0 and 2 are selected
        assertEquals(1, dataList.get(0).getMeasurementId());
        assertEquals(
            MeasurementValueTypeEnumType.VALUE.value(),
            dataList.get(0).getValueType()
        );
        assertEquals("100", dataList.get(0).getEvaluationPeriod().getStartTime());
        assertEquals("someTendency", dataList.get(0).getValueTendency());
        assertEquals(100L, dataList.get(0).getValue().getNumber());
        assertNull(dataList.get(0).getEvaluationPeriod().getEndTime());
        assertNull(dataList.get(0).getValueSource());
        assertNull(dataList.get(0).getTimestamp());
        assertNull(dataList.get(0).getValueState());

        assertEquals(2, dataList.get(2).getMeasurementId());
        assertEquals("100", dataList.get(2).getEvaluationPeriod().getStartTime());
        assertEquals("someTendency", dataList.get(2).getValueTendency());
        assertEquals(100L, dataList.get(2).getValue().getNumber());
        assertNull(dataList.get(2).getValueType());
        assertNull(dataList.get(2).getEvaluationPeriod().getEndTime());
        assertNull(dataList.get(2).getValueSource());
        assertNull(dataList.get(2).getTimestamp());
        assertNull(dataList.get(2).getValueState());

        assertEquals(3, dataList.get(3).getMeasurementId());
        assertEquals("100", dataList.get(3).getEvaluationPeriod().getStartTime());
        assertEquals("someTendency", dataList.get(3).getValueTendency());
        assertEquals(100L, dataList.get(3).getValue().getNumber());
        assertNull(dataList.get(3).getValueType());
        assertNull(dataList.get(3).getEvaluationPeriod().getEndTime());
        assertNull(dataList.get(3).getValueSource());
        assertNull(dataList.get(3).getTimestamp());
        assertNull(dataList.get(3).getValueState());

        assertNoneSelectedValuesSame();
    }

    @Test
    void testFullWriteForNoneIdentifiableList() throws SpineException {
        CmdType cmd = new CmdType();
        cmd.getFilter().add(new FilterType());
        cmd.getFilter().get(0).setCmdControl(new CmdControlType());

        cmd.setMeasurementListData(new MeasurementListDataType());
        cmd.getMeasurementListData().getMeasurementData().add(getChangeData());
        cmd
            .getMeasurementListData()
            .getMeasurementData()
            .get(0)
            .setMeasurementId(99L);
        cmd.getMeasurementListData()
            .getMeasurementData()
            .get(0)
            .setValueType(MeasurementValueTypeEnumType.MAX_VALUE.value());
        cmd.getMeasurementListData().getMeasurementData().add(getChangeData());
        cmd
            .getMeasurementListData()
            .getMeasurementData()
            .get(1)
            .setMeasurementId(100L);

        ReadAndWriteListFeatureFunction<MeasurementDataType, MeasurementListDataType, MeasurementListDataSelectorsType,
            MeasurementDataElementsType, ?>
            noneIdMeasurementReadAndWriteListFeatureFunction =
            new ReadAndWriteListFeatureFunction<>(
                "someName",
                new ListFeatureFunctionTypeInfo<>(
                    getNoneIdentifiableDataDescription(MeasurementDataType.class),
                    MeasurementListDataType.class,
                    MeasurementListDataSelectorsType.class,
                    MeasurementDataElementsType.class
                )
            ) {
                @Override
                protected void validateReadCmd(
                    List<MeasurementListDataSelectorsType> selectorsTypeList,
                    MeasurementDataElementsType elements,
                    ReadListCmdOption readCmdOption
                ) {

                }

                @Override
                protected void validateData(MeasurementDataType measurementDataType) {

                }

                @Override
                public void writeData(
                    MeasurementDataType measurementDataType,
                    DataUpdateType writeCmdListenerCallType, Integer idx
                ) {

                }

                @Override
                protected void validateUpdateForMatchingData(
                    MeasurementDataType update,
                    List<MeasurementDataType> matchingData,
                    WriteListCmdOption writeCmdOption
                ) {

                }

                @Override
                protected void validateWriteCmdFull(
                    List<MeasurementDataType> updateList,
                    List<MeasurementListDataSelectorsType> selectorsTypeList,
                    MeasurementDataElementsType elements,
                    WriteListCmdOption writeCmdOption
                ) {

                }

                @Override
                public SpineAcknowledgment call(
                    CmdType cmd,
                    FeatureAddressType sourceAddress
                ) {
                    return null;
                }
            };

        noneIdMeasurementReadAndWriteListFeatureFunction
            .getDataListHolder()
            .getDataList().clear();
        noneIdMeasurementReadAndWriteListFeatureFunction
            .getDataListHolder()
            .getDataList().addAll(
                getMeasurementData());
        noneIdMeasurementReadAndWriteListFeatureFunction.writeDataList(cmd);

        List<MeasurementDataType> dataList
            = noneIdMeasurementReadAndWriteListFeatureFunction
            .getDataListHolder()
            .getDataList();

        assertEquals(2, dataList.size());
        assertEquals(99, dataList.get(0).getMeasurementId());
        assertEquals(
            MeasurementValueTypeEnumType.MAX_VALUE.value(),
            dataList.get(0).getValueType()
        );
        assertEquals(100, dataList.get(1).getMeasurementId());
        assertNull(dataList.get(1).getValueType());
    }

    @Test
    void testCopyData() {
        MeasurementDataType dataCopy
            = SpineObjects.dataCopy(getMeasurementData().get(0));
        dataCopy.getValue().setNumber(99L);
        dataCopy.setMeasurementId(99L);
        dataCopy.setEvaluationPeriod(null);

        List<MeasurementDataType> dataList
            = getMeasurementReadAndWriteFeatureFunction()
            .getDataListHolder()
            .getDataList();

        assertNotEquals(
            dataList.get(0).getValue().getNumber(),
            dataCopy.getValue().getNumber()
        );
        assertNotEquals(
            dataList.get(0).getMeasurementId(),
            dataCopy.getMeasurementId()
        );
        assertNotEquals(
            dataList.get(0).getEvaluationPeriod(),
            dataCopy.getEvaluationPeriod()
        );
        assertEquals(dataList.get(0).getValueType(), dataCopy.getValueType());
    }

    @Test
    void testThreadSave() throws InterruptedException {
        CmdType cmd = new CmdType();
        cmd.getFilter().add(new FilterType());
        cmd.getFilter().get(0).setCmdControl(new CmdControlType());
        cmd.getFilter().get(0).getCmdControl().setDelete(new ElementTagType());
        cmd
            .getFilter()
            .get(0)
            .getMeasurementListDataSelectors()
            .addAll(getSelectorList());

        getMeasurementReadAndWriteFeatureFunction().getWait().set(true);
        MeasurementDataType dataCopy
            = getMeasurementReadAndWriteFeatureFunction().getDataCopy(0);

        Thread t1 = new Thread(() -> {
            try {
                getMeasurementReadAndWriteFeatureFunction().write(
                    cmd,
                    new FeatureAddressType()
                );
            }
            catch (SpineException e) {
                throw new RuntimeException(e);
            }
        });
        t1.start();

        Thread t2 = new Thread(() -> {
            try {
                try {
                    // this gives the main thread enough time to check the assertion
                    Thread.sleep(200);
                }
                catch (InterruptedException e) {
                    //ignored
                }
                dataCopy.getValue().setNumber(9999L);
                getMeasurementReadAndWriteFeatureFunction().updateData(1, dataCopy);
            }
            catch (SpineException e) {
                throw new RuntimeException(e);
            }
        });
        t2.start();

        List<MeasurementDataType> dataList
            = getMeasurementReadAndWriteFeatureFunction()
            .getDataListHolder()
            .getDataList();
        getMeasurementReadAndWriteFeatureFunction().setAssertion(() -> {
            assertNotNull(dataList.get(0));
            assertNotNull(dataList.get(2));
            assertEquals(2L, dataList.get(1).getValue().getNumber());
        });

        Thread.sleep(1000);
        getMeasurementReadAndWriteFeatureFunction().getWait().set(false);

        while (!getMeasurementReadAndWriteFeatureFunction().getFinished().get()) {
            Thread.sleep(100);
        }

        // make the threads finish - this should make the test less flaky
        t1.join();
        t2.join();

        assertNull(dataList.get(0));
        assertNull(dataList.get(2));
        assertEquals(9999L, dataList.get(1).getValue().getNumber());
    }
}