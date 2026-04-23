/********************************************************************************
 * Copyright (c) 2026 Fraunhofer ISE
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 ********************************************************************************/

package org.openmuc.jeebus.spine.utils.features.loadcontrol;

import org.junit.jupiter.api.Test;
import org.openmuc.jeebus.spine.api.SpineException;
import org.openmuc.jeebus.spine.utils.SpineUtilities;
import org.openmuc.jeebus.spine.xsd.v1.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.openmuc.jeebus.spine.api.DataUpdateType.ADD_DATA;
import static org.openmuc.jeebus.spine.xsd.v1.EnergyDirectionEnumType.*;
import static org.openmuc.jeebus.spine.xsd.v1.LoadControlCategoryEnumType.OBLIGATION;
import static org.openmuc.jeebus.spine.xsd.v1.LoadControlLimitTypeEnumType.SIGN_DEPENDENT_ABS_VALUE_LIMIT;
import static org.openmuc.jeebus.spine.xsd.v1.ScopeTypeEnumType.ACTIVE_POWER_LIMIT;

class LimitDescriptionFunctionTest {
    @Test
    public void testSelectors() throws SpineException {
        LimitDescriptionFunction dut = new LimitDescriptionFunction();

        dut.writeData(
            getDescriptionDataType()
                .withLimitDirection(CONSUME.value())
                .withLimitId(0L),
            ADD_DATA,
            0
        );
        dut.writeData(
            getDescriptionDataType()
                .withLimitDirection(PRODUCE.value())
                .withLimitId(1L),
            ADD_DATA,
            1
        );

        CmdType result = dut.read(
            new FilterType()
                .withCmdControl(SpineUtilities.getPartialCmdControl())
                .withLoadControlLimitDescriptionListDataSelectors(
                    new LoadControlLimitDescriptionListDataSelectorsType()
                        .withLimitDirection(PRODUCE.value())
                        .withLimitType(SIGN_DEPENDENT_ABS_VALUE_LIMIT.value())
                        .withScopeType(ACTIVE_POWER_LIMIT.value())),
            new FeatureAddressType()
        );

        assertThat(
            result
                .getLoadControlLimitDescriptionListData()
                .getLoadControlLimitDescriptionData(),
            hasSize(1)
        );
        assertThat(
            result
                .getLoadControlLimitDescriptionListData()
                .getLoadControlLimitDescriptionData()
                .get(0)
                .getLimitDirection(),
            is(PRODUCE.value())
        );
    }

    private static LoadControlLimitDescriptionDataType getDescriptionDataType() {
        return new LoadControlLimitDescriptionDataType()
            .withLimitType(SIGN_DEPENDENT_ABS_VALUE_LIMIT.value())
            .withScopeType(ACTIVE_POWER_LIMIT.value())
            .withLimitCategory(OBLIGATION.value())
            .withMeasurementId(0L)
            .withUnit("W");
    }
}