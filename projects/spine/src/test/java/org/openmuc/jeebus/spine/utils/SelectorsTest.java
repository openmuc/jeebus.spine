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

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openmuc.jeebus.spine.xsd.v1.MeasurementDescriptionDataType;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.openmuc.jeebus.spine.spi.function.ReadListFeatureFunctionTest.*;

class SelectorsTest {

    @Test
    void testSelectorEquals() {
        Assertions.assertTrue(Selectors.selectorFits(123L, 123L));
    }

    @Test
    void testGetSelectedData() {
        List<MeasurementDescriptionDataType> mSelectedData = getSelectedTestData(
            getReadListFeatureFunction(), getSelectors());

        assertEquals(2, mSelectedData.size());

        List<MeasurementDescriptionDataType> mGivenData = getData();

        assertEquals(
            mGivenData.get(0).getCommodityType(),
            mSelectedData.get(0).getCommodityType()
        );
        assertEquals(
            mGivenData.get(0).getMeasurementId(),
            mSelectedData.get(0).getMeasurementId()
        );
        assertEquals(
            mGivenData.get(0).getScopeType(),
            mSelectedData.get(0).getScopeType()
        );
        assertEquals(mGivenData.get(0).getUnit(), mSelectedData.get(0).getUnit());

        assertEquals(
            mGivenData.get(1).getCommodityType(),
            mSelectedData.get(1).getCommodityType()
        );
        assertEquals(
            mGivenData.get(1).getMeasurementId(),
            mSelectedData.get(1).getMeasurementId()
        );
        assertEquals(
            mGivenData.get(1).getScopeType(),
            mSelectedData.get(1).getScopeType()
        );
        assertEquals(mGivenData.get(1).getUnit(), mSelectedData.get(1).getUnit());
    }

}