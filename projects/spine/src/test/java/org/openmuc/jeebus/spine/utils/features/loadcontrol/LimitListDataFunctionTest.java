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

import org.jmock.lib.concurrent.DeterministicScheduler;
import org.junit.jupiter.api.Test;
import org.openmuc.jeebus.spine.api.SpineException;
import org.openmuc.jeebus.spine.api.FeatureWrapper;
import org.openmuc.jeebus.spine.xsd.v1.*;

import java.time.Instant;
import java.util.concurrent.TimeUnit;

import static java.time.temporal.ChronoUnit.MINUTES;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class LimitListDataFunctionTest {

    @Test
    void testExpirationRelative() throws SpineException {
        testExpirationAbstract("PT20M");
    }

    @Test
    void testExpirationAbsolute() throws SpineException {
        testExpirationAbstract(
            Instant
                .now()
                .plus(20, MINUTES)
                .toString()
        );
    }

    void testExpirationAbstract(String endTime) throws SpineException {

        LoadControlLimitDataType data = new LoadControlLimitDataType();
        data.setLimitId(0L);
        data.setValue(new ScaledNumberType());
        data.getValue().setNumber(1L);
        data.getValue().setScale((short) 12);
        data.setIsLimitChangeable(true);
        data.setIsLimitActive(true);

        LoadControlLimitDataType update = new LoadControlLimitDataType();
        update.setLimitId(0L);
        update.setIsLimitActive(true);
        update.setValue(new ScaledNumberType());
        update.getValue().setNumber(1L);
        update.setTimePeriod(new TimePeriodType());
        update.getTimePeriod().setEndTime(endTime);

        LoadControlFeature loadControlFeature = FeatureWrapper.newFeature(LoadControlFeature.class);

        DeterministicScheduler executor = new DeterministicScheduler();

        LimitListDataFunction limitListDataFunction
            = loadControlFeature.addLimitListDataFunction(executor);

        limitListDataFunction.addData(data);
        limitListDataFunction.updateAndScheduleStartAndExpiration(0, update);

        assertThat(
            limitListDataFunction.getDataCopy(0).getIsLimitActive(),
            is(true)
        );
        executor.tick(20, TimeUnit.of(MINUTES));
        assertThat(
            limitListDataFunction.getDataCopy(0).getIsLimitActive(),
            is(false)
        );
        assertThat(
            limitListDataFunction.getDataCopy(0).getTimePeriod(),
            is(nullValue())
        );

        CmdType cmd = new CmdType();
        cmd.setFunction(FunctionEnumType.LOAD_CONTROL_LIMIT_LIST_DATA.value());
        cmd.setLoadControlLimitListData(new LoadControlLimitListDataType());
        cmd.getLoadControlLimitListData().getLoadControlLimitData().add(update);
        limitListDataFunction.write(cmd, new FeatureAddressType());

        assertThat(
            limitListDataFunction.getDataCopy(0).getIsLimitActive(),
            is(true)
        );
        executor.tick(20, TimeUnit.of(MINUTES));
        assertThat(
            limitListDataFunction.getDataCopy(0).getIsLimitActive(),
            is(false)
        );
        assertThat(
            limitListDataFunction.getDataCopy(0).getTimePeriod(),
            is(nullValue())
        );
    }
}