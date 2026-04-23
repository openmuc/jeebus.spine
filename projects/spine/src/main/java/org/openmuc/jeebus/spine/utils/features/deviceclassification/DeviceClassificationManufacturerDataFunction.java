/********************************************************************************
 * Copyright (c) 2026 Fraunhofer ISE
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 ********************************************************************************/

package org.openmuc.jeebus.spine.utils.features.deviceclassification;

import org.openmuc.jeebus.spine.api.DataValidationException;
import org.openmuc.jeebus.spine.api.SpineAcknowledgment;
import org.openmuc.jeebus.spine.api.SpineException;
import org.openmuc.jeebus.spine.api.options.ReadSingleCmdOption;
import org.openmuc.jeebus.spine.spi.function.DataFeatureFunctionTypeInfo;
import org.openmuc.jeebus.spine.spi.function.ReadSingleFeatureFunction;
import org.openmuc.jeebus.spine.spi.function.StandardFunctionType;
import org.openmuc.jeebus.spine.xsd.v1.*;

@StandardFunctionType(
    type = FunctionEnumType.DEVICE_CLASSIFICATION_MANUFACTURER_DATA,
    featureType = FeatureTypeEnumType.DEVICE_CLASSIFICATION
)
public class DeviceClassificationManufacturerDataFunction extends ReadSingleFeatureFunction<
    DeviceClassificationManufacturerDataType,
    DeviceClassificationManufacturerDataElementsType,
    DataFeatureFunctionTypeInfo<
        DeviceClassificationManufacturerDataType,
        DeviceClassificationManufacturerDataElementsType
    >> {

    public DeviceClassificationManufacturerDataFunction() {
        super(
            FunctionEnumType.DEVICE_CLASSIFICATION_MANUFACTURER_DATA.value(),
            new DataFeatureFunctionTypeInfo<>(
                DeviceClassificationManufacturerDataType.class,
                DeviceClassificationManufacturerDataElementsType.class
            )
        );
        setReadable(true, true);
    }

    @Override
    protected void validateReadCmd(
        DeviceClassificationManufacturerDataElementsType deviceClassificationManufacturerDataElementsType,
        ReadSingleCmdOption readListCmdOption
    ) throws SpineException {

    }

    @Override
    protected void validateData(DeviceClassificationManufacturerDataType deviceClassificationManufacturerDataType) throws
        DataValidationException {
    }

    @Override
    public SpineAcknowledgment call(CmdType cmd, FeatureAddressType sourceAddress) {
        return null;
    }
}
