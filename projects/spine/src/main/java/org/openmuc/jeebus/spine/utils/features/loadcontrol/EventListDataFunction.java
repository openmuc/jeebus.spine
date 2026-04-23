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
        type = FunctionEnumType.LOAD_CONTROL_EVENT_LIST_DATA,
        featureType = FeatureTypeEnumType.LOAD_CONTROL)
public class EventListDataFunction extends LoadControlFeatureFunction<
    LoadControlEventDataType,
    LoadControlEventListDataType,
    LoadControlEventListDataSelectorsType,
    LoadControlEventDataElementsType
    > {

    public static final ListFeatureFunctionTypeInfo<
        LoadControlEventDataType,
        LoadControlEventListDataType,
        LoadControlEventListDataSelectorsType,
        LoadControlEventDataElementsType
        > TYPE_INFO = new ListFeatureFunctionTypeInfo<>(
        new DataIdDescription<>(
            LoadControlEventDataType.class,
            List.of("eventId") // TODO (reserved for future use)
        ),
        LoadControlEventListDataType.class,
        LoadControlEventListDataSelectorsType.class,
        LoadControlEventDataElementsType.class
    );

    public EventListDataFunction(LoadControlFeature feature) {
        super(
                FunctionEnumType.LOAD_CONTROL_EVENT_LIST_DATA.value(),
            TYPE_INFO
        );
        setReadable(true, true);
        setWritable(true, true);
    }

    @Override
    protected void validateData(LoadControlEventDataType data) throws
        DataValidationException {
        // TODO (reserved for future use)
    }

    @Override
    public SpineAcknowledgment call(CmdType cmd, FeatureAddressType sourceAddress) {
        return null;
    }

    @Override
    public void writeData(
        LoadControlEventDataType loadControlEventDataType,
        DataUpdateType dataUpdateType,
        Integer idx
    ) {

    }

    @Override
    protected void validateUpdateForMatchingData(
        LoadControlEventDataType update,
        List<LoadControlEventDataType> matchingData,
        WriteListCmdOption writeListCmdOption
    ) throws SpineException {
        // TODO (reserved for future use)
    }

    @Override
    protected void validateWriteCmdFull(
        List<LoadControlEventDataType> updateList,
        List<LoadControlEventListDataSelectorsType> loadControlEventListDataSelectorsTypes,
        LoadControlEventDataElementsType loadControlEventDataElementsType,
        WriteListCmdOption writeListCmdOption
    ) throws SpineException {
        validateIsRemoteControllable();
        // TODO (reserved for future use)
    }

    @Override
    protected void validateReadCmd(
        List<LoadControlEventListDataSelectorsType> loadControlEventListDataSelectorsTypes,
        LoadControlEventDataElementsType loadControlEventDataElementsType,
        ReadListCmdOption readListCmdOption
    ) throws SpineException {
        // TODO (reserved for future use)
    }
}
