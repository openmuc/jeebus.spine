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
import org.openmuc.jeebus.spine.api.options.WriteListCmdOption;
import org.openmuc.jeebus.spine.spi.function.StandardFunctionType;
import org.openmuc.jeebus.spine.api.DataValidationException;
import org.openmuc.jeebus.spine.api.SpineAcknowledgment;
import org.openmuc.jeebus.spine.api.SpineException;
import org.openmuc.jeebus.spine.api.options.ReadListCmdOption;
import org.openmuc.jeebus.spine.impl.DataIdDescription;
import org.openmuc.jeebus.spine.spi.function.ListFeatureFunctionTypeInfo;
import org.openmuc.jeebus.spine.xsd.v1.*;

import java.util.List;

@StandardFunctionType(
    type = FunctionEnumType.SETPOINT_CONSTRAINTS_LIST_DATA,
    featureType = FeatureTypeEnumType.SETPOINT
)
public class SetpointConstraintsListDataFunction
    extends SetpointFeatureFunction<
    SetpointConstraintsDataType,
    SetpointConstraintsListDataType,
    SetpointConstraintsListDataSelectorsType,
    SetpointConstraintsDataElementsType
    >{

    public static final ListFeatureFunctionTypeInfo<
        SetpointConstraintsDataType,
        SetpointConstraintsListDataType,
        SetpointConstraintsListDataSelectorsType,
        SetpointConstraintsDataElementsType
        > TYPE_INFO = new ListFeatureFunctionTypeInfo<>(
            new DataIdDescription<>(
                SetpointConstraintsDataType.class,
                List.of("setpointId")
            ),
        SetpointConstraintsListDataType.class,
        SetpointConstraintsListDataSelectorsType.class,
        SetpointConstraintsDataElementsType.class
    );

    public SetpointConstraintsListDataFunction() {
        super(FunctionEnumType.SETPOINT_CONSTRAINTS_LIST_DATA.value(), TYPE_INFO);
    }
    @Override
    public SpineAcknowledgment call(CmdType cmd, FeatureAddressType sourceAddress) {
        throw new UnsupportedOperationException();
    }

    @Override
    protected void validateReadCmd(
        List<SetpointConstraintsListDataSelectorsType> setpointConstraintsListDataSelectorsTypes,
        SetpointConstraintsDataElementsType elements,
        ReadListCmdOption readListCmdOption
    ) throws SpineException {

    }

    @Override
    protected void validateData(SetpointConstraintsDataType constraints)
        throws DataValidationException {
        if (constraints.getSetpointRangeMin() == null){
            logger.warn("Constraint SetpointRangeMin not set");
        } else {
        if (constraints.getSetpointRangeMin().getScale() == null){
            logger.warn("SetpointRangeMin scale not set, default of 0 will be applied");
            }
        }
        if (constraints.getSetpointRangeMax() == null) {
            logger.warn("Constraint SetpointRangeMax not set");
        } else {
            if (constraints.getSetpointRangeMax().getScale() == null) {
                logger.warn(
                    "SetpointRangeMax scale not set, default of 0 will be applied");
            }
        }
        if (constraints.getSetpointStepSize() == null){
            logger.warn("Constraint SetpointStepSize not set");
        }
    }

    @Override
    public void writeData(
        SetpointConstraintsDataType constraintsDataType,
        DataUpdateType dataUpdateType,
        Integer idx
    ) {
        // TODO: Implement if needed
    }

    @Override
    protected void validateUpdateForMatchingData(
        SetpointConstraintsDataType update,
        List<SetpointConstraintsDataType> matchingData,
        WriteListCmdOption writeListCmdOption
    ) throws SpineException {

    }

    @Override
    protected void validateWriteCmdFull(
        List<SetpointConstraintsDataType> updateList,
        List<SetpointConstraintsListDataSelectorsType> setpointConstraintsListDataSelectorsTypes,
        SetpointConstraintsDataElementsType setpointConstraintsDataElementsType,
        WriteListCmdOption writeListCmdOption
    ) throws SpineException {

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
}
