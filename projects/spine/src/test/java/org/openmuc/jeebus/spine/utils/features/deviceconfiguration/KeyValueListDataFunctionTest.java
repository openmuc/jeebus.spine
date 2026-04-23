/********************************************************************************
 * Copyright (c) 2026 Fraunhofer ISE
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 ********************************************************************************/

package org.openmuc.jeebus.spine.utils.features.deviceconfiguration;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.openmuc.jeebus.spine.api.DataValidationException;
import org.openmuc.jeebus.spine.api.Feature;
import org.openmuc.jeebus.spine.spi.function.DataUpdateTransaction;
import org.openmuc.jeebus.spine.xsd.v1.*;

import java.util.List;

import static net.obvj.junit.utils.matchers.ExceptionMatcher.throwsException;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.openmuc.jeebus.spine.xsd.v1.DeviceConfigurationKeyNameEnumType.PV_CURTAILMENT_LIMIT_FACTOR;

@Execution(ExecutionMode.SAME_THREAD)
class KeyValueListDataFunctionTest {

    private static KeyValueListDataFunction keyValueListDataFunction;
    private static RunningKeyValue kv;
    private static KeyValueDescriptionListDataFunction
        keyValueDescriptionListDataFunction;

    @BeforeEach
    public void SetUp() throws DataValidationException {
        Feature feature = Feature
            .getBuilder()
            .setType(FeatureTypeEnumType.DEVICE_CONFIGURATION)
            .setRole(RoleType.SERVER)
            .build();
        DeviceConfigurationFeature wrapper = feature.getFeatureWrapper(
            DeviceConfigurationFeature.class);

        keyValueListDataFunction = wrapper.addKeyValueListDataFunction();
        keyValueDescriptionListDataFunction
            = wrapper.addKeyValueDescriptionListDataFunction();

        kv = new KeyValueInitialData(
            new DeviceConfigurationKeyValueDataType(
                null,
                new DeviceConfigurationKeyValueValueType().withString(
                    "leadAcid"),
                true
            ),
            new DeviceConfigurationKeyValueDescriptionDataType(
                null,
                DeviceConfigurationKeyNameEnumType.BATTERY_TYPE.value(),
                DeviceConfigurationKeyValueTypeType.STRING,
                null,
                null,
                null
            ),
            null
        ).addToFeature(wrapper);
    }

    @Test
    void testValidateData() {
        assertThat(
            () -> keyValueListDataFunction.validateData(
                new DeviceConfigurationKeyValueDataType(
                    kv.getKeyId(),
                    new DeviceConfigurationKeyValueValueType().withBoolean(false),
                    true
                )),
            throwsException(DataValidationException.class)
                .withMessage(
                    "Error Number 7 (COMMAND_REJECTED): "
                        + "DeviceConfigurationKeyValueValue does not match"
                        + " description value type STRING"
                )
        );
    }

    @Test
    void testInit() {
        DataUpdateTransaction dataUpdateTransaction = new DataUpdateTransaction();

        dataUpdateTransaction.addSingleData(
            keyValueDescriptionListDataFunction,
            new DeviceConfigurationKeyValueDescriptionDataType()
                .withKeyId(2L)
                .withKeyName(PV_CURTAILMENT_LIMIT_FACTOR.value())
                .withValueType(DeviceConfigurationKeyValueTypeType.SCALED_NUMBER)
                .withUnit("pct"),
            (e) -> {}
        );

        dataUpdateTransaction.addSingleData(
            keyValueListDataFunction,
            new DeviceConfigurationKeyValueDataType()
                .withKeyId(2L)
                .withValue(new DeviceConfigurationKeyValueValueType().withString("abc")),
            (e) -> {}
        );

        assertThat(
            dataUpdateTransaction::runUpdate,
            throwsException(DataValidationException.class)
                .withMessage(
                    "Error Number 7 (COMMAND_REJECTED):"
                        + " DeviceConfigurationKeyValueValue does not match"
                        + " description value type SCALED_NUMBER"
                )
        );
    }

    @Test
    public void testWrite() {
        assertThat(
            () -> keyValueListDataFunction.write(
                new CmdType().withDeviceConfigurationKeyValueListData(
                    new DeviceConfigurationKeyValueListDataType(List.of(
                        new DeviceConfigurationKeyValueDataType(
                            kv.getKeyId(),
                            new DeviceConfigurationKeyValueValueType().withInteger(
                                42L),
                            true
                        )
                    ))),
                new FeatureAddressType()
            ),
            throwsException(DataValidationException.class)
                .withMessage(
                    "Error Number 7 (COMMAND_REJECTED):"
                        + " DeviceConfigurationKeyValueValue does not match"
                        + " description value type STRING"
                )
        );
    }
}