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
    type = FunctionEnumType.LOAD_CONTROL_LIMIT_DESCRIPTION_LIST_DATA,
    featureType = FeatureTypeEnumType.LOAD_CONTROL
)
public class LimitDescriptionFunction extends LoadControlFeatureFunction<
    LoadControlLimitDescriptionDataType,
    LoadControlLimitDescriptionListDataType,
    LoadControlLimitDescriptionListDataSelectorsType,
    LoadControlLimitDescriptionDataElementsType
    > {

    public static final ListFeatureFunctionTypeInfo<
        LoadControlLimitDescriptionDataType,
        LoadControlLimitDescriptionListDataType,
        LoadControlLimitDescriptionListDataSelectorsType,
        LoadControlLimitDescriptionDataElementsType
    > TYPE_INFO = new ListFeatureFunctionTypeInfo<>(

        new DataIdDescription<>(
            LoadControlLimitDescriptionDataType.class,
            List.of("limitId")
        ),
        LoadControlLimitDescriptionListDataType.class,
        LoadControlLimitDescriptionListDataSelectorsType.class,
        LoadControlLimitDescriptionDataElementsType.class
    );

    public LimitDescriptionFunction() {
        super(
            FunctionEnumType.LOAD_CONTROL_LIMIT_DESCRIPTION_LIST_DATA.value(),
            TYPE_INFO
        );
    }

    @Override
    protected void validateData(LoadControlLimitDescriptionDataType data) throws
        DataValidationException {
        if (data.getLimitType() == null) {
            throw new DataValidationException("limitType must be set");
        }
        if (data.getLimitCategory() == null) {
            logger.warn("limitCategory is not set");
        }
        if (data.getLimitDirection() == null) {
            logger.warn("limitDirection is not set");
        }
        if (data.getUnit() == null) {
            logger.warn("unit is not set");
        }
        if (data.getLabel() != null && data.getLabel().length() > 256) {
            logger.warn("label is longer than 256 characters");
        }
        if (data.getDescription() != null && data.getDescription().length() > 4096) {
            logger.warn("description is longer than 4096 characters");
        }
    }

    @Override
    public SpineAcknowledgment call(CmdType cmd, FeatureAddressType sourceAddress) {
        return null;
    }

    @Override
    public void writeData(
        LoadControlLimitDescriptionDataType loadControlLimitDescriptionDataType,
        DataUpdateType dataUpdateType,
        Integer idx
    ) {
        try {
            this.addData(loadControlLimitDescriptionDataType);
        }
        catch (DataValidationException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void validateUpdateForMatchingData(
        LoadControlLimitDescriptionDataType update,
        List<LoadControlLimitDescriptionDataType> matchingData,
        WriteListCmdOption writeListCmdOption
    ) throws SpineException {

    }

    @Override
    protected void validateWriteCmdFull(
        List<LoadControlLimitDescriptionDataType> updateList,
        List<LoadControlLimitDescriptionListDataSelectorsType> loadControlLimitDescriptionListDataSelectorsTypes,
        LoadControlLimitDescriptionDataElementsType loadControlLimitDescriptionDataElementsType,
        WriteListCmdOption writeListCmdOption
    ) throws SpineException {

    }

    @Override
    protected void validateReadCmd(
        List<LoadControlLimitDescriptionListDataSelectorsType> loadControlLimitDescriptionListDataSelectorsTypes,
        LoadControlLimitDescriptionDataElementsType loadControlLimitDescriptionDataElementsType,
        ReadListCmdOption readListCmdOption
    ) throws SpineException {

    }
}
