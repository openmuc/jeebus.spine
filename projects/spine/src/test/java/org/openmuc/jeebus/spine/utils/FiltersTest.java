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

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openmuc.jeebus.spine.api.SpineException;
import org.openmuc.jeebus.spine.spi.function.ReadListFeatureFunction;
import org.openmuc.jeebus.spine.xsd.v1.*;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.openmuc.jeebus.spine.spi.function.ReadListFeatureFunctionTest.getReadListFeatureFunction;

class FiltersTest {

    private final ReadListFeatureFunction<
        MeasurementDescriptionDataType,
        MeasurementDescriptionListDataType,
        MeasurementDescriptionListDataSelectorsType,
        MeasurementDescriptionDataElementsType,
        ?
        > measDescReadListFeatureFunction = getReadListFeatureFunction();

    @Test
    void testGetSelectorsFromFilter() {
        FilterType filter = new FilterType();
        filter
            .getMeasurementDescriptionListDataSelectors()
            .add(new MeasurementDescriptionListDataSelectorsType());
        filter
            .getMeasurementDescriptionListDataSelectors()
            .add(new MeasurementDescriptionListDataSelectorsType());

        List<MeasurementDescriptionListDataSelectorsType> selectors =
            Filters.getSelectors(
                filter,
                measDescReadListFeatureFunction.getTypeInfo().getSelectorType()
            );
        assertEquals(2, selectors.size());
    }

    @Test
    // TODO
    @Disabled(
        "I don't think throwing Exceptions is the right way to deal with "
            + "illegal selectors. It is more reliable to just ignore them and implement "
            + "a warning."
    )
    void testFalseGetSelectorsFromFilter() {
        FilterType filter = new FilterType();
        filter
            .getMeasurementDescriptionListDataSelectors()
            .add(new MeasurementDescriptionListDataSelectorsType());
        filter
            .getMeasurementDescriptionListDataSelectors()
            .add(new MeasurementDescriptionListDataSelectorsType());
        filter.getAlarmListDataSelectors().add(new AlarmListDataSelectorsType());
        filter.getBillListDataSelectors().add(new BillListDataSelectorsType());
        assertThrows(
            SpineException.class,
            () -> Filters.getSelectors(
                filter,
                measDescReadListFeatureFunction.getTypeInfo().getSelectorType()
            )
        );
    }

    @Test
    void testGetElementsObjectFromFilter() {
        FilterType filter = new FilterType();
        MeasurementDescriptionDataElementsType elements
            = new MeasurementDescriptionDataElementsType();
        elements.setMeasurementId(new ElementTagType());
        filter.setMeasurementDescriptionDataElements(elements);

        MeasurementDescriptionDataElementsType foundElements =
            Filters.getElementsObject(
                filter,
                measDescReadListFeatureFunction.getTypeInfo().getElementsType()
            );
        assertNull(foundElements.getCommodityType());
        assertNotNull(foundElements.getMeasurementId());
    }

}