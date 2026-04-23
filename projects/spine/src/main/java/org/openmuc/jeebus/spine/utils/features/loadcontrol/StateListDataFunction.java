/********************************************************************************
 * Copyright (c) 2026 Fraunhofer ISE
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 ********************************************************************************/

package org.openmuc.jeebus.spine.utils.features.loadcontrol;

import org.openmuc.jeebus.spine.api.DataUpdateType;
import org.openmuc.jeebus.spine.api.DataValidationException;
import org.openmuc.jeebus.spine.api.SpineAcknowledgment;
import org.openmuc.jeebus.spine.api.SpineException;
import org.openmuc.jeebus.spine.api.options.ReadListCmdOption;
import org.openmuc.jeebus.spine.api.options.WriteListCmdOption;
import org.openmuc.jeebus.spine.impl.DataIdDescription;
import org.openmuc.jeebus.spine.spi.function.ListFeatureFunctionTypeInfo;
import org.openmuc.jeebus.spine.spi.function.StandardFunctionType;
import org.openmuc.jeebus.spine.xsd.v1.*;

import java.util.List;

@StandardFunctionType(
        type = FunctionEnumType.LOAD_CONTROL_STATE_LIST_DATA,
        featureType = FeatureTypeEnumType.LOAD_CONTROL)
public class StateListDataFunction extends LoadControlFeatureFunction<
    LoadControlStateDataType,
    LoadControlStateListDataType,
    LoadControlStateListDataSelectorsType,
    LoadControlStateDataElementsType
    > {

    public static final ListFeatureFunctionTypeInfo<LoadControlStateDataType,
        LoadControlStateListDataType,
        LoadControlStateListDataSelectorsType,
        LoadControlStateDataElementsType
        > TYPE_INFO = new ListFeatureFunctionTypeInfo<>(
        new DataIdDescription<>(
            LoadControlStateDataType.class,
            List.of("eventId") // TODO (reserved for future use)
        ),
        LoadControlStateListDataType.class,
        LoadControlStateListDataSelectorsType.class,
        LoadControlStateDataElementsType.class
    );

    public StateListDataFunction() {
        super(
                FunctionEnumType.LOAD_CONTROL_STATE_LIST_DATA.value(),
            TYPE_INFO
        );
        setReadable(true, true);
        setWritable(true, true);
    }

    @Override
    protected void validateData(LoadControlStateDataType loadControlStateDataType) throws
        DataValidationException {
        // TODO (reserved for future use)
    }

    @Override
    public SpineAcknowledgment call(CmdType cmd, FeatureAddressType sourceAddress) {
        return null;
    }

    @Override
    public void writeData(
        LoadControlStateDataType loadControlStateDataType,
        DataUpdateType dataUpdateType,
        Integer idx
    ) {

    }

    @Override
    protected void validateUpdateForMatchingData(
        LoadControlStateDataType update,
        List<LoadControlStateDataType> matchingData,
        WriteListCmdOption writeListCmdOption
    ) throws SpineException {
        // TODO (reserved for future use)
    }

    @Override
    protected void validateWriteCmdFull(
        List<LoadControlStateDataType> updateList,
        List<LoadControlStateListDataSelectorsType> loadControlStateListDataSelectorsTypes,
        LoadControlStateDataElementsType loadControlStateDataElementsType,
        WriteListCmdOption writeListCmdOption
    ) throws SpineException {
        validateIsRemoteControllable();
        // TODO (reserved for future use)
    }

    @Override
    protected void validateReadCmd(
        List<LoadControlStateListDataSelectorsType> loadControlStateListDataSelectorsTypes,
        LoadControlStateDataElementsType loadControlStateDataElementsType,
        ReadListCmdOption readListCmdOption
    ) throws SpineException {
        // TODO (reserved for future use)
    }
}
