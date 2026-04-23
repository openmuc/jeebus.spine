/********************************************************************************
 * Copyright (c) 2026 Fraunhofer ISE
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 ********************************************************************************/

package org.openmuc.jeebus.spine.utils.features.electricalconnection;

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

@StandardFunctionType(
        type = FunctionEnumType.ELECTRICAL_CONNECTION_PARAMETER_DESCRIPTION_LIST_DATA,
        featureType = FeatureTypeEnumType.ELECTRICAL_CONNECTION)
public class ParameterDescriptionListDataFunction
    extends ReadAndWriteListFeatureFunction<
    ElectricalConnectionParameterDescriptionDataType,
    ElectricalConnectionParameterDescriptionListDataType,
    ElectricalConnectionParameterDescriptionListDataSelectorsType,
    ElectricalConnectionParameterDescriptionDataElementsType,
    ListFeatureFunctionTypeInfo<
        ElectricalConnectionParameterDescriptionDataType,
        ElectricalConnectionParameterDescriptionListDataType,
        ElectricalConnectionParameterDescriptionListDataSelectorsType,
        ElectricalConnectionParameterDescriptionDataElementsType
        >> {

    public static final ListFeatureFunctionTypeInfo<
        ElectricalConnectionParameterDescriptionDataType,
        ElectricalConnectionParameterDescriptionListDataType,
        ElectricalConnectionParameterDescriptionListDataSelectorsType,
        ElectricalConnectionParameterDescriptionDataElementsType
        > TYPE_INFO = new ListFeatureFunctionTypeInfo<>(
        new DataIdDescription<>(
            ElectricalConnectionParameterDescriptionDataType.class,
            List.of("electricalConnectionId", "parameterId")
        ),
        ElectricalConnectionParameterDescriptionListDataType.class,
        ElectricalConnectionParameterDescriptionListDataSelectorsType.class,
        ElectricalConnectionParameterDescriptionDataElementsType.class
    );

    public ParameterDescriptionListDataFunction() {
        super(
            FunctionEnumType.ELECTRICAL_CONNECTION_PARAMETER_DESCRIPTION_LIST_DATA.value(),
            TYPE_INFO
        );
        setReadable(true, true);
        setWritable(false, false);
    }

    @Override
    public SpineAcknowledgment call(CmdType cmd, FeatureAddressType sourceAddress) {
        return null;
    }

    @Override
    public void writeData(
        ElectricalConnectionParameterDescriptionDataType electricalConnectionParameterDescriptionDataType,
        DataUpdateType dataUpdateType, Integer idx
    ) {
        // TODO implement if needed
    }

    @Override
    protected void validateUpdateForMatchingData(
        ElectricalConnectionParameterDescriptionDataType update,
        List<ElectricalConnectionParameterDescriptionDataType> matchingData,
        WriteListCmdOption writeListCmdOption
    ) throws SpineException {
        // TODO implement if needed
    }

    @Override
    protected void validateWriteCmdFull(
        List<ElectricalConnectionParameterDescriptionDataType> updateList,
        List<ElectricalConnectionParameterDescriptionListDataSelectorsType> electricalConnectionParameterDescriptionListDataSelectorsTypes,
        ElectricalConnectionParameterDescriptionDataElementsType elements,
        WriteListCmdOption writeListCmdOption
    ) throws SpineException {
        // TODO implement if needed
    }

    @Override
    protected void validateReadCmd(
        List<ElectricalConnectionParameterDescriptionListDataSelectorsType> electricalConnectionParameterDescriptionListDataSelectorsTypes,
        ElectricalConnectionParameterDescriptionDataElementsType elements,
        ReadListCmdOption readListCmdOption
    )
        throws SpineException {
        // TODO implement if needed
    }

    @Override
    protected void validateData(
        ElectricalConnectionParameterDescriptionDataType electricalConnectionParameterDescriptionDataType
    )
        throws DataValidationException {
        // TODO implement if needed
    }
}
