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
import org.openmuc.jeebus.spine.utils.algorithms.Zipping;
import org.openmuc.jeebus.spine.xsd.v1.*;

import java.util.List;

@StandardFunctionType(
        type = FunctionEnumType.DEVICE_CONFIGURATION_KEY_VALUE_DESCRIPTION_LIST_DATA,
        featureType = FeatureTypeEnumType.DEVICE_CONFIGURATION)
public class KeyValueDescriptionListDataFunction
    extends ReadAndWriteListFeatureFunction<
    DeviceConfigurationKeyValueDescriptionDataType,
    DeviceConfigurationKeyValueDescriptionListDataType,
    DeviceConfigurationKeyValueDescriptionListDataSelectorsType,
    DeviceConfigurationKeyValueDescriptionDataElementsType,
    ListFeatureFunctionTypeInfo<
        DeviceConfigurationKeyValueDescriptionDataType,
        DeviceConfigurationKeyValueDescriptionListDataType,
        DeviceConfigurationKeyValueDescriptionListDataSelectorsType,
        DeviceConfigurationKeyValueDescriptionDataElementsType
        >> {

    public static final ListFeatureFunctionTypeInfo<
        DeviceConfigurationKeyValueDescriptionDataType,
        DeviceConfigurationKeyValueDescriptionListDataType,
        DeviceConfigurationKeyValueDescriptionListDataSelectorsType,
        DeviceConfigurationKeyValueDescriptionDataElementsType
        > TYPE_INFO = new ListFeatureFunctionTypeInfo<>(
        new DataIdDescription<>(
            DeviceConfigurationKeyValueDescriptionDataType.class,
            List.of("keyId")
        ),
        DeviceConfigurationKeyValueDescriptionListDataType.class,
        DeviceConfigurationKeyValueDescriptionListDataSelectorsType.class,
        DeviceConfigurationKeyValueDescriptionDataElementsType.class
    );

    private DeviceConfigurationFeature parent;

    public KeyValueDescriptionListDataFunction() {
        super(
            FunctionEnumType.DEVICE_CONFIGURATION_KEY_VALUE_DESCRIPTION_LIST_DATA.value(),
            TYPE_INFO
        );
        setReadable(true, true);
        setWritable(true, true);
    }

    @Override
    public void writeData(
        DeviceConfigurationKeyValueDescriptionDataType data,
        DataUpdateType dataUpdateType, Integer idx
    ) {
        parent.getKeyValueForKeyId(data.getKeyId())
            .writeDescription(data, dataUpdateType);
    }

    @Override
    protected void validateUpdateForMatchingData(
        DeviceConfigurationKeyValueDescriptionDataType update,
        List<DeviceConfigurationKeyValueDescriptionDataType> matchingData,
        WriteListCmdOption writeListCmdOption
    ) throws SpineException {

    }

    @Override
    protected void validateWriteCmdFull(
        List<DeviceConfigurationKeyValueDescriptionDataType> updateList,
        List<DeviceConfigurationKeyValueDescriptionListDataSelectorsType> deviceConfigurationKeyValueDescriptionListDataSelectorsTypes,
        DeviceConfigurationKeyValueDescriptionDataElementsType elements,
        WriteListCmdOption writeListCmdOption
    ) throws SpineException {

    }

    @Override
    protected void validateData(DeviceConfigurationKeyValueDescriptionDataType data) throws
        DataValidationException {
        try {
            DeviceConfigurationKeyNameEnumType.fromValue(data.getKeyName());
        }
        catch (IllegalArgumentException e) {
            throw new DataValidationException(
                "KeyValueDescriptionData has unknown KeyName.", e);
        }
    }

    @Override
    public SpineAcknowledgment call(CmdType cmd, FeatureAddressType sourceAddress) {
        throw new UnsupportedOperationException();
    }

    @Override
    protected void validateReadCmd(
        List<DeviceConfigurationKeyValueDescriptionListDataSelectorsType> selectorList,
        DeviceConfigurationKeyValueDescriptionDataElementsType elements,
        ReadListCmdOption readListCmdOption
    )
        throws SpineException {
        // no function validation needed
    }

    public void setDeviceConfigurationFeature(DeviceConfigurationFeature parent) {
        this.parent = parent;
    }

    @Override
    public void dataUpdatedByTransaction(
        List<Integer> idxList,
        List<DeviceConfigurationKeyValueDescriptionDataType> deviceConfigurationKeyValueDescriptionDataTypes
    ) {
        Zipping.zip(idxList.stream(), deviceConfigurationKeyValueDescriptionDataTypes.stream()).forEach(pair -> {
            DeviceConfigurationKeyValueDescriptionDataType data = pair.getRight();
            RunningKeyValue keyValue = parent.getKeyValueForKeyId(data.getKeyId());
            if (keyValue == null) {
                keyValue = new RunningKeyValue(data.getKeyId(), parent);
            }
            keyValue.setDescriptionIdx(pair.getLeft());
            parent.submitRunningKeyValue(keyValue);
        });
    }
}
