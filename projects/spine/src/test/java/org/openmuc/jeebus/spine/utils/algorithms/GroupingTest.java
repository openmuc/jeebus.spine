/********************************************************************************
 * Copyright (c) 2026 Fraunhofer ISE
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 ********************************************************************************/

package org.openmuc.jeebus.spine.utils.algorithms;

import org.junit.jupiter.api.Test;
import org.openmuc.jeebus.spine.utils.SpineObjects;
import org.openmuc.jeebus.spine.xsd.v1.ElementTagType;
import org.openmuc.jeebus.spine.xsd.v1.MeasurementDescriptionDataElementsType;
import org.openmuc.jeebus.spine.xsd.v1.MeasurementDescriptionListDataSelectorsType;
import org.openmuc.jeebus.spine.xsd.v1.ScaledNumberElementsType;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class GroupingTest {

    @Test
    void testGroupDeletionSelectorsByIdenticalElements() {
        MeasurementDescriptionDataElementsType el1_group1
            = new MeasurementDescriptionDataElementsType();
        el1_group1.setDescription(new ElementTagType());
        el1_group1.setCalibrationValue(new ScaledNumberElementsType());
        el1_group1.getCalibrationValue().setNumber(new ElementTagType());

        MeasurementDescriptionDataElementsType el2_group1
            = new MeasurementDescriptionDataElementsType();
        el2_group1.setDescription(new ElementTagType());
        el2_group1.setCalibrationValue(new ScaledNumberElementsType());
        el2_group1.getCalibrationValue().setNumber(new ElementTagType());

        MeasurementDescriptionDataElementsType el3_group1
            = new MeasurementDescriptionDataElementsType();
        el3_group1.setDescription(new ElementTagType());
        el3_group1.setCalibrationValue(new ScaledNumberElementsType());
        el3_group1.getCalibrationValue().setNumber(new ElementTagType());

        MeasurementDescriptionDataElementsType el4_group2
            = new MeasurementDescriptionDataElementsType();
        el4_group2.setCalibrationValue(new ScaledNumberElementsType());
        el4_group2.getCalibrationValue().setNumber(new ElementTagType());

        MeasurementDescriptionDataElementsType el5_group2
            = new MeasurementDescriptionDataElementsType();
        el5_group2.setCalibrationValue(new ScaledNumberElementsType());
        el5_group2.getCalibrationValue().setNumber(new ElementTagType());

        MeasurementDescriptionDataElementsType el6_group3
            = new MeasurementDescriptionDataElementsType();
        el6_group3.setCalibrationValue(new ScaledNumberElementsType());
        el6_group3.getCalibrationValue().setNumber(new ElementTagType());
        el6_group3.setLabel(new ElementTagType());

        MeasurementDescriptionListDataSelectorsType sel1
            = new MeasurementDescriptionListDataSelectorsType();
        sel1.setMeasurementId(1L);

        MeasurementDescriptionListDataSelectorsType sel2
            = new MeasurementDescriptionListDataSelectorsType();
        sel2.setMeasurementId(2L);

        MeasurementDescriptionListDataSelectorsType sel3
            = new MeasurementDescriptionListDataSelectorsType();
        sel3.setMeasurementId(3L);

        MeasurementDescriptionListDataSelectorsType sel4
            = new MeasurementDescriptionListDataSelectorsType();
        sel4.setMeasurementId(4L);

        MeasurementDescriptionListDataSelectorsType sel5
            = new MeasurementDescriptionListDataSelectorsType();
        sel5.setMeasurementId(5L);

        MeasurementDescriptionListDataSelectorsType sel6
            = new MeasurementDescriptionListDataSelectorsType();
        sel6.setMeasurementId(6L);

        Map<MeasurementDescriptionDataElementsType, List<MeasurementDescriptionListDataSelectorsType>>
            grouped = Grouping.groupZipMap(
            List.of(
                el1_group1,
                el5_group2,
                el3_group1,
                el4_group2,
                el6_group3,
                el2_group1
            ), List.of(sel1, sel5, sel3, sel4, sel6, sel2), SpineObjects::dataEquals
        );

        assertEquals(3, grouped.size());

        Iterator<Map.Entry<MeasurementDescriptionDataElementsType, List<MeasurementDescriptionListDataSelectorsType>>>
            iterator = grouped.entrySet().iterator();
        Map.Entry<MeasurementDescriptionDataElementsType, List<MeasurementDescriptionListDataSelectorsType>>
            entry =
            iterator.next();

        assertNotNull(entry.getKey().getDescription());
        assertNotNull(entry.getKey().getCalibrationValue().getNumber());
        assertNull(entry.getKey().getLabel());
        assertEquals(3, entry.getValue().size());
        assertEquals(1L, entry.getValue().get(0).getMeasurementId());
        assertEquals(3L, entry.getValue().get(1).getMeasurementId());
        assertEquals(2L, entry.getValue().get(2).getMeasurementId());

        entry = iterator.next();

        assertNotNull(entry.getKey().getCalibrationValue().getNumber());
        assertNull(entry.getKey().getDescription());
        assertNull(entry.getKey().getLabel());
        assertEquals(2, entry.getValue().size());
        assertEquals(5L, entry.getValue().get(0).getMeasurementId());
        assertEquals(4L, entry.getValue().get(1).getMeasurementId());

        entry = iterator.next();

        assertNotNull(entry.getKey().getCalibrationValue().getNumber());
        assertNotNull(entry.getKey().getLabel());
        assertNull(entry.getKey().getDescription());
        assertEquals(1, entry.getValue().size());
        assertEquals(6L, entry.getValue().get(0).getMeasurementId());
    }

}