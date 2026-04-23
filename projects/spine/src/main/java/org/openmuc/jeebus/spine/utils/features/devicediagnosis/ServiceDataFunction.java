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

@StandardFunctionType(
        type = FunctionEnumType.DEVICE_DIAGNOSIS_SERVICE_DATA,
        featureType = FeatureTypeEnumType.DEVICE_DIAGNOSIS)
public class ServiceDataFunction extends ReadSingleFeatureFunction<
    DeviceDiagnosisServiceDataType,
    DeviceDiagnosisServiceDataElementsType,
    DataFeatureFunctionTypeInfo<
        DeviceDiagnosisServiceDataType,
        DeviceDiagnosisServiceDataElementsType
        >> {

    public static final DataFeatureFunctionTypeInfo<
        DeviceDiagnosisServiceDataType,
        DeviceDiagnosisServiceDataElementsType
        > TYPE_INFO = new DataFeatureFunctionTypeInfo<>(
        DeviceDiagnosisServiceDataType.class,
        DeviceDiagnosisServiceDataElementsType.class
    );

    public ServiceDataFunction() {
        super(
            FunctionEnumType.DEVICE_DIAGNOSIS_SERVICE_DATA.value(),
            TYPE_INFO
        );
        setReadable(true, true);
    }

    @Override
    protected void validateData(DeviceDiagnosisServiceDataType deviceDiagnosisServiceDataType)
        throws DataValidationException {
        // none
    }

    @Override
    public SpineAcknowledgment call(CmdType cmd, FeatureAddressType sourceAddress) {
        return null;
    }

    @Override
    protected void validateReadCmd(
        DeviceDiagnosisServiceDataElementsType elements,
        ReadSingleCmdOption readListCmdOption
    ) throws SpineException {
        // none
    }
}
