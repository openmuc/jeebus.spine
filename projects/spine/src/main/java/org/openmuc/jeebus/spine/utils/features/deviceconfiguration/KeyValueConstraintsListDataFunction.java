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

import org.openmuc.jeebus.spine.api.DataUpdateType;
import org.openmuc.jeebus.spine.api.DataValidationException;
import org.openmuc.jeebus.spine.api.SpineAcknowledgment;
import org.openmuc.jeebus.spine.api.SpineException;
import org.openmuc.jeebus.spine.api.options.ReadListCmdOption;
import org.openmuc.jeebus.spine.api.options.WriteListCmdOption;
import org.openmuc.jeebus.spine.impl.DataIdDescription;
import org.openmuc.jeebus.spine.spi.function.ListFeatureFunctionTypeInfo;
import org.openmuc.jeebus.spine.spi.function.ReadAndWriteListFeatureFunction;
import org.openmuc.jeebus.spine.spi.function.StandardFunctionType;
import org.openmuc.jeebus.spine.xsd.v1.*;

import java.util.List;

import static org.openmuc.jeebus.spine.utils.features.deviceconfiguration.DeviceConfigurationUtilities.*;

@StandardFunctionType(
        type = FunctionEnumType.DEVICE_CONFIGURATION_KEY_VALUE_CONSTRAINTS_LIST_DATA,
        featureType = FeatureTypeEnumType.DEVICE_CONFIGURATION)
public class KeyValueConstraintsListDataFunction
    extends ReadAndWriteListFeatureFunction<
    DeviceConfigurationKeyValueConstraintsDataType,
    DeviceConfigurationKeyValueConstraintsListDataType,
    DeviceConfigurationKeyValueConstraintsListDataSelectorsType,
    DeviceConfigurationKeyValueConstraintsDataElementsType,
    ListFeatureFunctionTypeInfo<
        DeviceConfigurationKeyValueConstraintsDataType,
        DeviceConfigurationKeyValueConstraintsListDataType,
        DeviceConfigurationKeyValueConstraintsListDataSelectorsType,
        DeviceConfigurationKeyValueConstraintsDataElementsType
        >> {

    public static final ListFeatureFunctionTypeInfo<
        DeviceConfigurationKeyValueConstraintsDataType,
        DeviceConfigurationKeyValueConstraintsListDataType,
        DeviceConfigurationKeyValueConstraintsListDataSelectorsType,
        DeviceConfigurationKeyValueConstraintsDataElementsType
        > TYPE_INFO = new ListFeatureFunctionTypeInfo<>(
        new DataIdDescription<>(
            DeviceConfigurationKeyValueConstraintsDataType.class,
            List.of("keyId")
        ),
        DeviceConfigurationKeyValueConstraintsListDataType.class,
        DeviceConfigurationKeyValueConstraintsListDataSelectorsType.class,
        DeviceConfigurationKeyValueConstraintsDataElementsType.class
    );

    private DeviceConfigurationFeature parent;

    public KeyValueConstraintsListDataFunction() {
        super(
            FunctionEnumType.DEVICE_CONFIGURATION_KEY_VALUE_CONSTRAINTS_LIST_DATA.value(),
            TYPE_INFO
        );
        setReadable(true, true);
        setWritable(true, true);
    }

    @Override
    public SpineAcknowledgment call(CmdType cmd, FeatureAddressType sourceAddress) {
        return null;
    }

    @Override
    public void writeData(
        DeviceConfigurationKeyValueConstraintsDataType data,
        DataUpdateType dataUpdateType, Integer idx
    ) {
        parent.getKeyValueForKeyId(data.getKeyId()).writeConstraints(data, dataUpdateType);
    }

    @Override
    protected void validateUpdateForMatchingData(
        DeviceConfigurationKeyValueConstraintsDataType update,
        List<DeviceConfigurationKeyValueConstraintsDataType> matchingDataList,
        WriteListCmdOption writeListCmdOption
    ) throws SpineException {

    }

    @Override
    protected void validateWriteCmdFull(
        List<DeviceConfigurationKeyValueConstraintsDataType> updateList,
        List<DeviceConfigurationKeyValueConstraintsListDataSelectorsType> deviceConfigurationKeyValueConstraintsListDataSelectorsTypes,
        DeviceConfigurationKeyValueConstraintsDataElementsType elements,
        WriteListCmdOption writeListCmdOption
    ) throws SpineException {

    }

    @Override
    protected void validateData(
        DeviceConfigurationKeyValueConstraintsDataType data
    )
        throws DataValidationException {

        DeviceConfigurationKeyValueDescriptionDataType description
            = parent.getKeyValueForKeyId(data.getKeyId())
            .getDescriptionCopy();

        Object minProperty = validateAndGetValueProperty(
            data.getValueRangeMin(),
            false
        );
        Object maxProperty = validateAndGetValueProperty(
            data.getValueRangeMin(),
            false
        );
        Object valueStepSize = validateAndGetValueProperty(
            data.getValueRangeMin(),
            false
        );

        if (description != null) {
            boolean hasIllegalValueType =
                !matchesValueType(description.getValueType(), minProperty)
                    || !matchesValueType(description.getValueType(), maxProperty)
                    || !matchesValueType(description.getValueType(), valueStepSize);

            if (hasIllegalValueType) {
                throw new DataValidationException(
                    "KeyValueConstraintsListData write has value type that does not "
                        + "match the data description value type.");
            }
        }
    }

    @Override
    protected void validateReadCmd(
        List<DeviceConfigurationKeyValueConstraintsListDataSelectorsType> selectorList,
        DeviceConfigurationKeyValueConstraintsDataElementsType elements,
        ReadListCmdOption readListCmdOption
    )
        throws SpineException {
        // no function validation needed
    }

    public void setDeviceConfigurationFeature(DeviceConfigurationFeature parent) {
        this.parent = parent;
    }
}
