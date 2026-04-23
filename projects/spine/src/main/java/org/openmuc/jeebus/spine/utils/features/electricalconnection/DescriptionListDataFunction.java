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

import static org.openmuc.jeebus.spine.xsd.v1.FunctionEnumType.ELECTRICAL_CONNECTION_DESCRIPTION_LIST_DATA;

@StandardFunctionType(
    type = ELECTRICAL_CONNECTION_DESCRIPTION_LIST_DATA,
    featureType = FeatureTypeEnumType.ELECTRICAL_CONNECTION
)
public class DescriptionListDataFunction extends ReadAndWriteListFeatureFunction<
    ElectricalConnectionDescriptionDataType,
    ElectricalConnectionDescriptionListDataType,
    ElectricalConnectionDescriptionListDataSelectorsType,
    ElectricalConnectionDescriptionDataElementsType,
    ListFeatureFunctionTypeInfo<
        ElectricalConnectionDescriptionDataType,
        ElectricalConnectionDescriptionListDataType,
        ElectricalConnectionDescriptionListDataSelectorsType,
        ElectricalConnectionDescriptionDataElementsType
>> {

    public static final ListFeatureFunctionTypeInfo<
        ElectricalConnectionDescriptionDataType,
        ElectricalConnectionDescriptionListDataType,
        ElectricalConnectionDescriptionListDataSelectorsType,
        ElectricalConnectionDescriptionDataElementsType
    > TYPE_INFO = new ListFeatureFunctionTypeInfo<>(
        new DataIdDescription<>(
            ElectricalConnectionDescriptionDataType.class,
            List.of("electricalConnectionId")
        ),
        ElectricalConnectionDescriptionListDataType.class,
        ElectricalConnectionDescriptionListDataSelectorsType.class,
        ElectricalConnectionDescriptionDataElementsType.class
    );

    public DescriptionListDataFunction() {
        super(
            ELECTRICAL_CONNECTION_DESCRIPTION_LIST_DATA.value(),
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
        ElectricalConnectionDescriptionDataType electricalConnectionDescriptionDataType,
        DataUpdateType dataUpdateType, Integer idx
    ) {
        // TODO Implement if needed
    }

    @Override
    protected void validateUpdateForMatchingData(
        ElectricalConnectionDescriptionDataType update,
        List<ElectricalConnectionDescriptionDataType> matchingData,
        WriteListCmdOption writeListCmdOption
    ) throws SpineException {
        // TODO Implement if needed
    }

    @Override
    protected void validateWriteCmdFull(
        List<ElectricalConnectionDescriptionDataType> updateList,
        List<ElectricalConnectionDescriptionListDataSelectorsType> electricalConnectionDescriptionListDataSelectorsTypes,
        ElectricalConnectionDescriptionDataElementsType elements,
        WriteListCmdOption writeListCmdOption
    ) throws SpineException {
        // TODO Implement if needed
    }

    @Override
    protected void validateReadCmd(
        List<ElectricalConnectionDescriptionListDataSelectorsType> electricalConnectionDescriptionListDataSelectorsTypes,
        ElectricalConnectionDescriptionDataElementsType elements,
        ReadListCmdOption readListCmdOption
    )
        throws SpineException {
        // TODO Implement if needed
    }

    @Override
    protected void validateData(
        ElectricalConnectionDescriptionDataType electricalConnectionDescriptionDataType
    )
        throws DataValidationException {
        // TODO Implement if needed
    }
}
