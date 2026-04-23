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
import org.openmuc.jeebus.spine.utils.datatypes.ScaledNumberWrapper;
import org.openmuc.jeebus.spine.xsd.v1.*;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@StandardFunctionType(
    type = FunctionEnumType.LOAD_CONTROL_LIMIT_CONSTRAINTS_LIST_DATA,
    featureType = FeatureTypeEnumType.LOAD_CONTROL)
public class LimitConstraintsDataFunction extends LoadControlFeatureFunction<
    LoadControlLimitConstraintsDataType,
    LoadControlLimitConstraintsListDataType,
    LoadControlLimitConstraintsListDataSelectorsType,
    LoadControlLimitConstraintsDataElementsType
> {

    public static final ListFeatureFunctionTypeInfo<
        LoadControlLimitConstraintsDataType,
        LoadControlLimitConstraintsListDataType,
        LoadControlLimitConstraintsListDataSelectorsType,
        LoadControlLimitConstraintsDataElementsType
    > TYPE_INFO = new ListFeatureFunctionTypeInfo<>(
        new DataIdDescription<>(
            LoadControlLimitConstraintsDataType.class,
            List.of("limitId")
        ),
        LoadControlLimitConstraintsListDataType.class,
        LoadControlLimitConstraintsListDataSelectorsType.class,
        LoadControlLimitConstraintsDataElementsType.class
    );

    public LimitConstraintsDataFunction() {
        super(
            FunctionEnumType.LOAD_CONTROL_LIMIT_CONSTRAINTS_LIST_DATA.value(),
            TYPE_INFO
        );
    }

    @Override
    protected void validateData(LoadControlLimitConstraintsDataType constraints)
        throws DataValidationException {

        if (constraints.getValueRangeMin() == null) {
            logger.warn("valueRangeMin is not set");
        }
        Optional<LimitListDataFunction> limitFunction = feature.getFunction(
            LimitListDataFunction.class
        );
        if (limitFunction.isPresent()) {
            validateLimitFitsConstraints(
                limitFunction.get().getDataCopyForFirst(
                    d -> Objects.equals(d.getLimitId(), constraints.getLimitId())),
                constraints
            );
        }
    }

    @Override
    public SpineAcknowledgment call(CmdType cmd, FeatureAddressType sourceAddress) {
        return null;
    }

    @Override
    public void writeData(
        LoadControlLimitConstraintsDataType loadControlLimitConstraintsDataType,
        DataUpdateType dataUpdateType, Integer idx
    ) {

    }

    @Override
    protected void validateUpdateForMatchingData(
        LoadControlLimitConstraintsDataType update,
        List<LoadControlLimitConstraintsDataType> matchingData,
        WriteListCmdOption writeListCmdOption
    ) throws SpineException {

    }

    @Override
    protected void validateWriteCmdFull(
        List<LoadControlLimitConstraintsDataType> updateList,
        List<LoadControlLimitConstraintsListDataSelectorsType> loadControlLimitConstraintsListDataSelectorsTypes,
        LoadControlLimitConstraintsDataElementsType loadControlLimitConstraintsDataElementsType,
        WriteListCmdOption writeListCmdOption
    ) throws SpineException {

    }

    @Override
    protected void validateReadCmd(
        List<LoadControlLimitConstraintsListDataSelectorsType> loadControlLimitConstraintsListDataSelectorsTypes,
        LoadControlLimitConstraintsDataElementsType loadControlLimitConstraintsDataElementsType,
        ReadListCmdOption readListCmdOption
    ) throws SpineException {

    }

    void validateLimitFitsConstraints(
        LoadControlLimitDataType data,
        LoadControlLimitConstraintsDataType constraints
    ) throws DataValidationException {
        if (data == null || constraints == null || data.getValue() == null) {
            return;
        }
        try {
            double valueRangeMin = constraints.getValueRangeMin() == null ?
                Float.MIN_VALUE :
                new ScaledNumberWrapper(constraints.getValueRangeMin()).toDouble();
            double valueRangeMax = constraints.getValueRangeMax() == null ?
                Float.MAX_VALUE :
                new ScaledNumberWrapper(constraints.getValueRangeMax()).toDouble();
            double value = new ScaledNumberWrapper(data.getValue()).toDouble();

            if (value < valueRangeMin || value > valueRangeMax) {
                throw new DataValidationException("value: "
                    + value
                    + " out of range for constraints: valueRangeMin = "
                    + valueRangeMin
                    + ", valueRangeMax = "
                    + valueRangeMax);
            }
        }
        catch (IllegalArgumentException e) {
            throw new DataValidationException(
                "some scaled number types do not have a number",
                e
            );
        }
    }
}
