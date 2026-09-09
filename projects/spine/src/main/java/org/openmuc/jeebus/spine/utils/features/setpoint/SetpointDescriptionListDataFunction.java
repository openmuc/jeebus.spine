/********************************************************************************
 * Copyright (c) 2026 Fraunhofer ISE
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 ********************************************************************************/

package org.openmuc.jeebus.spine.utils.features.setpoint;

import org.openmuc.jeebus.spine.api.DataUpdateType;
import org.openmuc.jeebus.spine.api.DataValidationException;
import org.openmuc.jeebus.spine.api.SpineAcknowledgment;
import org.openmuc.jeebus.spine.api.SpineException;
import org.openmuc.jeebus.spine.api.options.ReadListCmdOption;
import org.openmuc.jeebus.spine.api.options.WriteListCmdOption;
import org.openmuc.jeebus.spine.impl.DataIdDescription;
import org.openmuc.jeebus.spine.spi.function.ListFeatureFunctionTypeInfo;
import org.openmuc.jeebus.spine.xsd.v1.*;

import java.util.List;

public class SetpointDescriptionListDataFunction extends SetpointFeatureFunction<
    SetpointDescriptionDataType,
    SetpointDescriptionListDataType,
    SetpointDescriptionListDataSelectorsType,
    SetpointDescriptionDataElementsType
    > {
    public static final ListFeatureFunctionTypeInfo<
        SetpointDescriptionDataType,
        SetpointDescriptionListDataType,
        SetpointDescriptionListDataSelectorsType,
        SetpointDescriptionDataElementsType>
        TYPE_INFO = new ListFeatureFunctionTypeInfo<>(
        new DataIdDescription<>(SetpointDescriptionDataType.class,
            List.of("setpointId")),
        SetpointDescriptionListDataType.class,
        SetpointDescriptionListDataSelectorsType.class,
        SetpointDescriptionDataElementsType.class
    );

    public SetpointDescriptionListDataFunction() {
        super(FunctionEnumType.SETPOINT_DESCRIPTION_LIST_DATA.value(), TYPE_INFO);
    }



    @Override
    protected void validateWriteCmdFull(
        List<SetpointDataType> updateList,
        List<SetpointListDataSelectorsType> setpointListDataSelectorsTypes,
        SetpointDataElementsType setpointDataElementsType,
        WriteListCmdOption writeListCmdOption
    ) throws SpineException {

    }

    @Override
    protected void validateReadCmd(
        List<SetpointListDataSelectorsType> setpointListDataSelectorTypes,
        SetpointDataElementsType setpointDataElementsType,
        ReadListCmdOption readListCmdOption
    ) throws SpineException {

    }

    @Override
    public SpineAcknowledgment call(CmdType cmd, FeatureAddressType sourceAddress) {
        return null;
    }

    @Override
    public void writeData(
        SetpointDescriptionDataType setpointDescriptionDataType,
        DataUpdateType dataUpdateType,
        Integer idx
    ) {

    }
    @Override
    protected void validateUpdateForMatchingData(
        SetpointDescriptionDataType update,
        List<SetpointDescriptionDataType> matchingData,
        WriteListCmdOption writeListCmdOption
    ) throws SpineException {

    }

    @Override
    protected void validateWriteCmdFull(
        List<SetpointDescriptionDataType> updateList,
        List<SetpointDescriptionListDataSelectorsType> setpointDescriptionListDataSelectorsTypes,
        SetpointDescriptionDataElementsType setpointDescriptionDataElementsType,
        WriteListCmdOption writeListCmdOption
    ) throws SpineException {

    }

    @Override
    protected void validateReadCmd(
        List<SetpointDescriptionListDataSelectorsType> setpointDescriptionListDataSelectorsTypes,
        SetpointDescriptionDataElementsType setpointDescriptionDataElementsType,
        ReadListCmdOption readListCmdOption
    ) throws SpineException {

    }

    @Override
    protected void validateData(SetpointDescriptionDataType setpointDescriptionDataType) throws
        DataValidationException {

    }
}
