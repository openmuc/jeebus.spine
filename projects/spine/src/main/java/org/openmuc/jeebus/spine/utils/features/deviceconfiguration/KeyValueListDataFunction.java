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

import org.openmuc.jeebus.spine.api.Error;
import org.openmuc.jeebus.spine.api.*;
import org.openmuc.jeebus.spine.api.options.ReadListCmdOption;
import org.openmuc.jeebus.spine.api.options.WriteListCmdOption;
import org.openmuc.jeebus.spine.impl.DataIdDescription;
import org.openmuc.jeebus.spine.spi.function.ListFeatureFunctionTypeInfo;
import org.openmuc.jeebus.spine.spi.function.ReadAndWriteListFeatureFunction;
import org.openmuc.jeebus.spine.spi.function.Snapshottable;
import org.openmuc.jeebus.spine.spi.function.StandardFunctionType;
import org.openmuc.jeebus.spine.utils.datatypes.ScaledNumberWrapper;
import org.openmuc.jeebus.spine.xsd.v1.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

import static org.openmuc.jeebus.spine.utils.features.deviceconfiguration.DeviceConfigurationUtilities.*;

@StandardFunctionType(
        type = FunctionEnumType.DEVICE_CONFIGURATION_KEY_VALUE_LIST_DATA,
        featureType = FeatureTypeEnumType.DEVICE_CONFIGURATION)
public class KeyValueListDataFunction extends ReadAndWriteListFeatureFunction<
    DeviceConfigurationKeyValueDataType,
    DeviceConfigurationKeyValueListDataType,
    DeviceConfigurationKeyValueListDataSelectorsType,
    DeviceConfigurationKeyValueDataElementsType,
    ListFeatureFunctionTypeInfo<
        DeviceConfigurationKeyValueDataType,
        DeviceConfigurationKeyValueListDataType,
        DeviceConfigurationKeyValueListDataSelectorsType,
        DeviceConfigurationKeyValueDataElementsType
        >> {

    public static final ListFeatureFunctionTypeInfo<
        DeviceConfigurationKeyValueDataType,
        DeviceConfigurationKeyValueListDataType,
        DeviceConfigurationKeyValueListDataSelectorsType,
        DeviceConfigurationKeyValueDataElementsType
        > TYPE_INFO = new ListFeatureFunctionTypeInfo<>(
        new DataIdDescription<>(
            DeviceConfigurationKeyValueDataType.class,
            List.of("keyId")
        ),
        DeviceConfigurationKeyValueListDataType.class,
        DeviceConfigurationKeyValueListDataSelectorsType.class,
        DeviceConfigurationKeyValueDataElementsType.class
    );

    private static final Logger LOGGER = LoggerFactory.getLogger(KeyValueListDataFunction.class);

    final Map<Long, RunningKeyValue> runningKeyValues = new HashMap<>();
    private DeviceConfigurationFeature parent;

    public KeyValueListDataFunction() {
        super(
            FunctionEnumType.DEVICE_CONFIGURATION_KEY_VALUE_LIST_DATA.value(),
            TYPE_INFO
        );
        setReadable(true, true);
        setWritable(true, true);
    }

    @Override
    public void writeData(
        DeviceConfigurationKeyValueDataType data,
        DataUpdateType dataUpdateType,
        Integer idx
    ) {
        RunningKeyValue keyValue = runningKeyValues.get(data.getKeyId());
        if (dataUpdateType == DataUpdateType.ADD_DATA) {
            if (keyValue == null) {
                keyValue = new RunningKeyValue(data.getKeyId(), feature.getFeatureWrapper(DeviceConfigurationFeature.class));
            }
        }
        keyValue.writeData(data, dataUpdateType);
    }

    @Override
    protected void validateUpdateForMatchingData(
        DeviceConfigurationKeyValueDataType update,
        List<DeviceConfigurationKeyValueDataType> matchingDataList,
        WriteListCmdOption writeListCmdOption
    ) throws SpineException {

        for (DeviceConfigurationKeyValueDataType matchingData : matchingDataList) {
            if (matchingData.getIsValueChangeable() == null
                || !matchingData.getIsValueChangeable()) {
                throw new SpineException(
                    Error.COMMAND_REJECTED,
                    "Received KeyValueListData write request for "
                        + "data with isValueChangeable not set or set to false."
                );
            }
        }
    }

    private Double getCalculatedScaledValue(DeviceConfigurationKeyValueDataType update) {
        try {
            return new ScaledNumberWrapper(update.getValue().getScaledNumber())
                .toDouble();
        }
        catch (IllegalArgumentException | NullPointerException e) {
            return null;
        }
    }

    @Override
    protected void validateData(DeviceConfigurationKeyValueDataType data)
        throws DataValidationException {
        if (data.getValue() == null) {
            throw new DataValidationException("KeyValueListData has no value.");
        }

        Object property = validateAndGetValueProperty(data.getValue(), true);

        RunningKeyValue runningKeyValue = runningKeyValues.get(data.getKeyId());
        if (runningKeyValue == null) {
            LOGGER.error("keyId {} not found in in running key values {}", data.getKeyId(), runningKeyValues);
            // if this ever happens it's almost certainly a bug
            throw new DataValidationException("No such keyvalue with keyId " + data.getKeyId());
        }


        DeviceConfigurationKeyValueDescriptionDataType description
            = runningKeyValue.getDescriptionCopy();

        if (description != null) {

            boolean hasIllegalValueType
                = !matchesValueType(description.getValueType(), property);

            if (hasIllegalValueType) {
                throw new DataValidationException(
                    "DeviceConfigurationKeyValueValue does not match description value type "
                        + description.getValueType()
                );
            }

            DeviceConfigurationKeyNameEnumType keyName;
            try {
                keyName
                    = DeviceConfigurationKeyNameEnumType.fromValue(description.getKeyName());
            }
            catch (IllegalArgumentException ignored) {
                keyName = null;
            }
            if (keyName != null) {
                validateKeyValueFromKeyName(keyName, data);
            }
        }
    }

    private void validateKeyValueFromKeyName(
        DeviceConfigurationKeyNameEnumType keyName,
        DeviceConfigurationKeyValueDataType data
    ) throws DataValidationException {

        if (data.getValue() == null) {
            // value is not set by this write request
            return;
        }

        Double scaledNumberValue = getCalculatedScaledValue(data);
        Boolean booleanValue = data.getValue().getBoolean();
        String stringValue = data.getValue().getString();

        Optional<DataValidationException> error = PermittedValues.valueAllowedForKeyOrError(
            keyName,
            data,
            scaledNumberValue,
            stringValue,
            booleanValue
        );

        if (error.isPresent()) throw error.get();
    }

    @Override
    protected void validateWriteCmdFull(
        List<DeviceConfigurationKeyValueDataType> updateList,
        List<DeviceConfigurationKeyValueListDataSelectorsType> selectorsList,
        DeviceConfigurationKeyValueDataElementsType elements,
        WriteListCmdOption writeListCmdOption
    ) throws SpineException {

    }

    @Override
    public SpineAcknowledgment call(CmdType cmd, FeatureAddressType sourceAddress) {
        throw new UnsupportedOperationException();
    }

    @Override
    protected void validateReadCmd(
        List<DeviceConfigurationKeyValueListDataSelectorsType> deviceConfigurationKeyValueListDataSelectorsTypes,
        DeviceConfigurationKeyValueDataElementsType elements,
        ReadListCmdOption readListCmdOption
    )
        throws SpineException {
        // nothing to do, no fields to validate
    }

    public void removeRunningKeyValue(RunningKeyValue keyValue) {
        runningKeyValues.remove(keyValue.getKeyId(), keyValue);
    }

    public void submitRunningKeyValue(RunningKeyValue keyValue) {
        RunningKeyValue present = runningKeyValues.put(keyValue.getKeyId(), keyValue);
        if (
            present != null
            && !Objects.equals(keyValue.toString(), present.toString())
        ) {
            LOGGER.warn("Added RunningKeyValue with keyId {} overwriting already existing keyvalue!", keyValue.getKeyId());
        }
    }

    public RunningKeyValue getKeyValueForKeyId(Long keyId) {
        return runningKeyValues.get(keyId);
    }

    public void setDeviceConfigurationFeature(DeviceConfigurationFeature parent) {
        this.parent = parent;
    }

    @Override
    public Snapshot takeSnapshot() {
        return super.takeSnapshot()
            .andThen(Snapshottable.resetMapEntries(() -> runningKeyValues));
    }
}
