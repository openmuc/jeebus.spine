/********************************************************************************
 * Copyright (c) 2026 Fraunhofer ISE
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 ********************************************************************************/

package org.openmuc.jeebus.spine.utils;

import org.junit.jupiter.api.Test;
import org.openmuc.jeebus.spine.xsd.v1.*;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.openmuc.jeebus.spine.spi.function.ReadListFeatureFunctionTest.*;

class SpineObjectsTest {

    @Test
    void testWriteDeleteElements() {
        MeasurementDescriptionDataType md1 = new MeasurementDescriptionDataType();
        md1.setMeasurementType(MeasurementTypeEnumType.ACCELERATION.value());
        md1.setLabel("someLabel");
        md1.setUnit("W");
        md1.setCalibrationValue(new ScaledNumberType());
        md1.getCalibrationValue().setNumber(1L);
        md1.getCalibrationValue().setScale((short) 1);

        MeasurementDescriptionDataType md2 = new MeasurementDescriptionDataType();
        md2.setMeasurementType(MeasurementTypeEnumType.ACCELERATION.value());
        md2.setCalibrationValue(new ScaledNumberType());
        md2.setUnit("V");
        md2.getCalibrationValue().setNumber(1L);
        md2.setDescription("someDescription");

        MeasurementDescriptionDataElementsType mde_exp
            = new MeasurementDescriptionDataElementsType();
        mde_exp.setCalibrationValue(new ScaledNumberElementsType());
        mde_exp.getCalibrationValue().setScale(new ElementTagType());
        mde_exp.setLabel(new ElementTagType());

        MeasurementDescriptionDataElementsType mde
            = new MeasurementDescriptionDataElementsType();
        SpineObjects.writeDeleteElements(mde, md1, md2);
        assertTrue(SpineObjects.dataEquals(mde, mde_exp));

        assertNotNull(mde.getCalibrationValue().getScale());
        assertNotNull(mde.getLabel());
        assertNull(mde.getCommodityType());
        assertNull(mde.getCalibrationValue().getNumber());
        assertNull(mde.getDescription());
        assertNull(mde.getMeasurementId());
        assertNull(mde.getUnit());
        assertNull(mde.getMeasurementType());
        assertNull(mde.getScopeType());
    }

    @Test
    void testDataEquals() {
        MeasurementDescriptionDataType m1 = new MeasurementDescriptionDataType();
        m1.setCalibrationValue(new ScaledNumberType());
        m1.getCalibrationValue().setNumber(1L);
        m1.setMeasurementId(5L);
        m1.setCommodityType(CommodityTypeEnumType.ELECTRICITY.value());

        MeasurementDescriptionDataType m2 = new MeasurementDescriptionDataType();
        m2.setCalibrationValue(new ScaledNumberType());
        m2.getCalibrationValue().setNumber(1L);
        m2.setMeasurementId(5L);
        m2.setCommodityType(CommodityTypeEnumType.ELECTRICITY.value());

        MeasurementDescriptionDataType m3 = SpineObjects.dataCopy(m2);

        MeasurementDescriptionDataType m4 = new MeasurementDescriptionDataType();
        m4.setCalibrationValue(new ScaledNumberType());
        m4.getCalibrationValue().setNumber(2L);
        m4.setMeasurementId(5L);
        m4.setCommodityType(CommodityTypeEnumType.ELECTRICITY.value());

        MeasurementDescriptionDataType m5 = new MeasurementDescriptionDataType();
        m5.setCalibrationValue(new ScaledNumberType());
        m5.getCalibrationValue().setNumber(1L);
        m5.setCommodityType(CommodityTypeEnumType.ELECTRICITY.value());

        MeasurementDescriptionDataType m6 = new MeasurementDescriptionDataType();
        m6.setCalibrationValue(new ScaledNumberType());
        m6.getCalibrationValue().setNumber(1L);
        m6.getCalibrationValue().setScale((short) 1);
        m6.setMeasurementId(5L);
        m6.setCommodityType(CommodityTypeEnumType.ELECTRICITY.value());

        assertTrue(SpineObjects.dataEquals(m1, m2));
        assertTrue(SpineObjects.dataEquals(m1, m3));
        assertTrue(SpineObjects.dataEquals(m2, m3));
        assertFalse(SpineObjects.dataEquals(m1, m4));
        assertFalse(SpineObjects.dataEquals(m1, m5));
        assertFalse(SpineObjects.dataEquals(m1, m6));

        MeasurementThresholdRelationDataType t1
            = new MeasurementThresholdRelationDataType();
        t1.getThresholdId().add(2L);
        t1.getThresholdId().add(1L);
        MeasurementThresholdRelationDataType t2
            = new MeasurementThresholdRelationDataType();
        t2.getThresholdId().add(2L);
        t2.getThresholdId().add(1L);
        MeasurementThresholdRelationDataType t3
            = new MeasurementThresholdRelationDataType();
        t3.getThresholdId().add(1L);
        t3.getThresholdId().add(1L);

        assertTrue(SpineObjects.dataEquals(t1, t2));
        assertFalse(SpineObjects.dataEquals(t1, t3));
    }

    @Test
    void testWriteForAllNoneNullProperties() {
        MeasurementThresholdRelationDataType t1
            = new MeasurementThresholdRelationDataType();
        t1.setMeasurementId(1L);
        t1.getThresholdId().add(2L);
        t1.getThresholdId().add(1L);
        MeasurementThresholdRelationDataType t2
            = new MeasurementThresholdRelationDataType();
        t2.getThresholdId().add(2L);
        t2.getThresholdId().add(3L);
        t2.getThresholdId().add(5L);
        SpineObjects.writeForAllNonNullProperties(t1, t2);

        assertEquals(3, t1.getThresholdId().size());
        assertEquals(1L, t1.getMeasurementId());
        assertEquals(2L, t1.getThresholdId().get(0));
        assertEquals(3L, t1.getThresholdId().get(1));
        assertEquals(5L, t1.getThresholdId().get(2));

        assertEquals(3, t2.getThresholdId().size());
        assertNull(t2.getMeasurementId());
        assertEquals(2L, t2.getThresholdId().get(0));
        assertEquals(3L, t2.getThresholdId().get(1));
        assertEquals(5L, t2.getThresholdId().get(2));
    }

    @Test
    public void testGetDataForSelectedElements() {
        List<MeasurementDescriptionDataType> mGivenData = getData();

        MeasurementDescriptionDataElementsType elements
            = new MeasurementDescriptionDataElementsType();
        elements.setMeasurementId(new ElementTagType());
        elements.setScopeType(new ElementTagType());

        List<MeasurementDescriptionDataType> mSelectedData = getSelectedTestData(
            getReadListFeatureFunction(), getSelectors());

        List<MeasurementDescriptionDataType> dataWithSelectedElements =
            SpineObjects.getDataListForTaggedElements(elements, mSelectedData);

        // selected elements
        assertEquals(
            mGivenData.get(0).getMeasurementId(),
            dataWithSelectedElements.get(0).getMeasurementId()
        );
        assertEquals(
            mGivenData.get(0).getScopeType(),
            dataWithSelectedElements.get(0).getScopeType()
        );
        assertEquals(
            mGivenData.get(1).getMeasurementId(),
            dataWithSelectedElements.get(1).getMeasurementId()
        );
        assertEquals(
            mGivenData.get(1).getScopeType(),
            dataWithSelectedElements.get(1).getScopeType()
        );

        // not selected elements (should be null)
        assertNull(dataWithSelectedElements.get(0).getCommodityType());
        assertNull(dataWithSelectedElements.get(0).getUnit());
        assertNull(dataWithSelectedElements.get(1).getCommodityType());
        assertNull(dataWithSelectedElements.get(1).getUnit());
    }

}