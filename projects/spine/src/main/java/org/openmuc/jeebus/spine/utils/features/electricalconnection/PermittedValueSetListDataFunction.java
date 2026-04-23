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
        type = FunctionEnumType.ELECTRICAL_CONNECTION_PERMITTED_VALUE_SET_LIST_DATA,
        featureType = FeatureTypeEnumType.ELECTRICAL_CONNECTION)
public class PermittedValueSetListDataFunction
    extends ReadAndWriteListFeatureFunction<
    ElectricalConnectionPermittedValueSetDataType,
    ElectricalConnectionPermittedValueSetListDataType,
    ElectricalConnectionPermittedValueSetListDataSelectorsType,
    ElectricalConnectionPermittedValueSetDataElementsType,
    ListFeatureFunctionTypeInfo<
        ElectricalConnectionPermittedValueSetDataType,
        ElectricalConnectionPermittedValueSetListDataType,
        ElectricalConnectionPermittedValueSetListDataSelectorsType,
        ElectricalConnectionPermittedValueSetDataElementsType
        >> {

    public static final ListFeatureFunctionTypeInfo<
        ElectricalConnectionPermittedValueSetDataType,
        ElectricalConnectionPermittedValueSetListDataType,
        ElectricalConnectionPermittedValueSetListDataSelectorsType,
        ElectricalConnectionPermittedValueSetDataElementsType
        > TYPE_INFO = new ListFeatureFunctionTypeInfo<>(
        new DataIdDescription<>(
            ElectricalConnectionPermittedValueSetDataType.class,
            List.of("electricalConnectionId")
        ),
        ElectricalConnectionPermittedValueSetListDataType.class,
        ElectricalConnectionPermittedValueSetListDataSelectorsType.class,
        ElectricalConnectionPermittedValueSetDataElementsType.class
    );

    public PermittedValueSetListDataFunction() {
        super(
            FunctionEnumType.ELECTRICAL_CONNECTION_PERMITTED_VALUE_SET_LIST_DATA.value(),
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
        ElectricalConnectionPermittedValueSetDataType electricalConnectionPermittedValueSetDataType,
        DataUpdateType dataUpdateType, Integer idx
    ) {
        // TODO implement if needed
    }

    @Override
    protected void validateUpdateForMatchingData(
        ElectricalConnectionPermittedValueSetDataType update,
        List<ElectricalConnectionPermittedValueSetDataType> matchingData,
        WriteListCmdOption writeListCmdOption
    ) throws SpineException {
        // TODO implement if needed
    }

    @Override
    protected void validateWriteCmdFull(
        List<ElectricalConnectionPermittedValueSetDataType> updateList,
        List<ElectricalConnectionPermittedValueSetListDataSelectorsType> electricalConnectionPermittedValueSetListDataSelectorsTypes,
        ElectricalConnectionPermittedValueSetDataElementsType elements,
        WriteListCmdOption writeListCmdOption
    ) throws SpineException {
        // TODO implement if needed
    }

    @Override
    protected void validateReadCmd(
        List<ElectricalConnectionPermittedValueSetListDataSelectorsType> electricalConnectionPermittedValueSetListDataSelectorsTypes,
        ElectricalConnectionPermittedValueSetDataElementsType elements,
        ReadListCmdOption readListCmdOption
    )
        throws SpineException {
        // TODO implement if needed
    }

    @Override
    protected void validateData(
        ElectricalConnectionPermittedValueSetDataType electricalConnectionPermittedValueSetDataType
    )
        throws DataValidationException {
        // TODO implement if needed
    }
}
