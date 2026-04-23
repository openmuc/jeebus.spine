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

import org.junit.jupiter.api.Test;
import org.openmuc.jeebus.spine.api.DataUpdateType;
import org.openmuc.jeebus.spine.api.DataValidationException;
import org.openmuc.jeebus.spine.api.Feature;
import org.openmuc.jeebus.spine.utils.SpineObjects;
import org.openmuc.jeebus.spine.xsd.v1.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class DeviceConfigurationFeatureTest {
    @Test
    void testDeviceConfigurationFeatureKeyValue() throws DataValidationException {
        Feature feature = Feature.getBuilder().setType(FeatureTypeEnumType.DEVICE_CONFIGURATION).setRole(RoleType.SERVER).build();
        DeviceConfigurationFeature wrapper = feature.getFeatureWrapper(DeviceConfigurationFeature.class);
        wrapper.addKeyValueListDataFunction();
        wrapper.addKeyValueDescriptionListDataFunction();

        DeviceConfigurationKeyValueDataType data
            = new DeviceConfigurationKeyValueDataType();
        data.setValue(new DeviceConfigurationKeyValueValueType());
        data.getValue().setScaledNumber(new ScaledNumberType(123L, (short) 5));

        DeviceConfigurationKeyValueDescriptionDataType description =
            new DeviceConfigurationKeyValueDescriptionDataType();
        description.setValueType(DeviceConfigurationKeyValueTypeType.SCALED_NUMBER);
        description.setKeyName(DeviceConfigurationKeyNameEnumType.FAILSAFE_CONSUMPTION_ACTIVE_POWER_LIMIT.value());

        KeyValue keyValue = new KeyValueInitialData(
                data,
            description,
            null
        ).addToFeature(wrapper);

        assertThat(SpineObjects.dataEquals(keyValue.getDataCopy(), data), is(true));
    }
}