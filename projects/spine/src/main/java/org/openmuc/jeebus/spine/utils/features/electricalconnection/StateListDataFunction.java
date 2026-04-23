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
        type = FunctionEnumType.LOAD_CONTROL_STATE_LIST_DATA,
        featureType = FeatureTypeEnumType.ELECTRICAL_CONNECTION)
public class StateListDataFunction extends ReadAndWriteListFeatureFunction<
    ElectricalConnectionStateDataType,
    ElectricalConnectionStateListDataType,
    ElectricalConnectionStateListDataSelectorsType,
    ElectricalConnectionStateDataElementsType,
    ListFeatureFunctionTypeInfo<
        ElectricalConnectionStateDataType,
        ElectricalConnectionStateListDataType,
        ElectricalConnectionStateListDataSelectorsType,
        ElectricalConnectionStateDataElementsType
        >> {

    public static final ListFeatureFunctionTypeInfo<ElectricalConnectionStateDataType,
        ElectricalConnectionStateListDataType,
        ElectricalConnectionStateListDataSelectorsType,
        ElectricalConnectionStateDataElementsType
        > TYPE_INFO = new ListFeatureFunctionTypeInfo<>(
        new DataIdDescription<>(
            ElectricalConnectionStateDataType.class,
            List.of("electricalConnectionId")
        ),
        ElectricalConnectionStateListDataType.class,
        ElectricalConnectionStateListDataSelectorsType.class,
        ElectricalConnectionStateDataElementsType.class
    );

    public StateListDataFunction() {
        super(
            FunctionEnumType.ELECTRICAL_CONNECTION_STATE_LIST_DATA.value(),
            TYPE_INFO
        );
    }

    @Override
    public SpineAcknowledgment call(CmdType cmd, FeatureAddressType sourceAddress) {
        return null;
    }

    @Override
    public void writeData(
        ElectricalConnectionStateDataType electricalConnectionStateDataType,
        DataUpdateType dataUpdateType, Integer idx
    ) {
        // TODO implement if needed
    }

    @Override
    protected void validateUpdateForMatchingData(
        ElectricalConnectionStateDataType update,
        List<ElectricalConnectionStateDataType> matchingData,
        WriteListCmdOption writeListCmdOption
    ) throws SpineException {
        // TODO implement if needed
    }

    @Override
    protected void validateWriteCmdFull(
        List<ElectricalConnectionStateDataType> updateList,
        List<ElectricalConnectionStateListDataSelectorsType> electricalConnectionStateListDataSelectorsTypes,
        ElectricalConnectionStateDataElementsType elements,
        WriteListCmdOption writeListCmdOption
    ) throws SpineException {
        // TODO implement if needed
    }

    @Override
    protected void validateReadCmd(
        List<ElectricalConnectionStateListDataSelectorsType> electricalConnectionStateListDataSelectorsTypes,
        ElectricalConnectionStateDataElementsType elements,
        ReadListCmdOption readListCmdOption
    )
        throws SpineException {
        // TODO implement if needed
    }

    @Override
    protected void validateData(ElectricalConnectionStateDataType electricalConnectionStateDataType)
        throws DataValidationException {
        // TODO implement if needed
    }
}
