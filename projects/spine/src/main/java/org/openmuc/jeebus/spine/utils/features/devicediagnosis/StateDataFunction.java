/********************************************************************************
 * Copyright (c) 2026 Fraunhofer ISE
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 ********************************************************************************/

package org.openmuc.jeebus.spine.utils.features.devicediagnosis;

import org.openmuc.jeebus.spine.api.DataValidationException;
import org.openmuc.jeebus.spine.api.SpineAcknowledgment;
import org.openmuc.jeebus.spine.api.SpineException;
import org.openmuc.jeebus.spine.api.options.ReadSingleCmdOption;
import org.openmuc.jeebus.spine.spi.function.DataFeatureFunctionTypeInfo;
import org.openmuc.jeebus.spine.spi.function.ReadSingleFeatureFunction;
import org.openmuc.jeebus.spine.spi.function.StandardFunctionType;
import org.openmuc.jeebus.spine.xsd.v1.*;

import static org.openmuc.jeebus.spine.utils.SpineUtilities.isValidEnumValue;

@StandardFunctionType(
        type = FunctionEnumType.DEVICE_DIAGNOSIS_STATE_DATA,
        featureType = FeatureTypeEnumType.DEVICE_DIAGNOSIS)
public class StateDataFunction extends ReadSingleFeatureFunction<
    DeviceDiagnosisStateDataType,
    DeviceDiagnosisServiceDataElementsType,
    DataFeatureFunctionTypeInfo<
        DeviceDiagnosisStateDataType,
        DeviceDiagnosisServiceDataElementsType
        >> {

    public static final DataFeatureFunctionTypeInfo<
        DeviceDiagnosisStateDataType,
        DeviceDiagnosisServiceDataElementsType
        > TYPE_INFO = new DataFeatureFunctionTypeInfo<>(
        DeviceDiagnosisStateDataType.class,
        DeviceDiagnosisServiceDataElementsType.class
    );

    public StateDataFunction() {
        super(
            FunctionEnumType.DEVICE_DIAGNOSIS_STATE_DATA.value(),
            TYPE_INFO
        );
        setReadable(true, true);
    }

    @Override
    protected void validateReadCmd(
        DeviceDiagnosisServiceDataElementsType elementsType,
        ReadSingleCmdOption readListCmdOption
    ) throws SpineException {
        // none
    }

    @Override
    public SpineAcknowledgment call(CmdType cmd, FeatureAddressType sourceAddress) {
        return null;
    }

    @Override
    protected void validateData(DeviceDiagnosisStateDataType data)
        throws DataValidationException {
        if (data.getPowerSupplyCondition() != null &&
            !isValidEnumValue(
                PowerSupplyConditionEnumType.class,
                data.getPowerSupplyCondition()
            )) {
            throw new DataValidationException("Invalid powerSupplyCondition");

        }
        if (data.getOperatingState() != null && !isValidEnumValue(
            DeviceDiagnosisOperatingStateEnumType.class,
            data.getOperatingState()
        )) {
            throw new DataValidationException("Invalid operatingState");
        }
        if (data.getVendorStateCode() != null
            && data.getVendorStateCode().length() > 128) {
            logger.warn("VendorStateCode is longer than 128 characters.");
        }
        if (data.getLastErrorCode() != null
            && data.getLastErrorCode().length() > 128) {
            logger.warn("LastErrorCode is longer than 128 characters.");
        }
    }
}
