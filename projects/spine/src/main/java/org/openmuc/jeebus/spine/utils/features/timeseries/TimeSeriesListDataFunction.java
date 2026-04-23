/********************************************************************************
 * Copyright (c) 2026 Fraunhofer ISE
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 ********************************************************************************/

package org.openmuc.jeebus.spine.utils.features.timeseries;

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

import static org.openmuc.jeebus.spine.xsd.v1.FunctionEnumType.TIME_SERIES_LIST_DATA;

@StandardFunctionType(
    type = TIME_SERIES_LIST_DATA,
    featureType = FeatureTypeEnumType.TIME_SERIES
)
public class TimeSeriesListDataFunction
    extends ReadAndWriteListFeatureFunction<
        TimeSeriesDataType,
        TimeSeriesListDataType,
        TimeSeriesListDataSelectorsType,
        TimeSeriesDataElementsType,
        ListFeatureFunctionTypeInfo<
            TimeSeriesDataType,
            TimeSeriesListDataType,
            TimeSeriesListDataSelectorsType,
            TimeSeriesDataElementsType
>> {

    public static final ListFeatureFunctionTypeInfo<
        TimeSeriesDataType,
        TimeSeriesListDataType,
        TimeSeriesListDataSelectorsType,
        TimeSeriesDataElementsType
    > TYPE_INFO = new ListFeatureFunctionTypeInfo<>(
        new DataIdDescription<>(
            TimeSeriesDataType.class,
            List.of("timeSeriesId")
        ),
        TimeSeriesListDataType.class,
        TimeSeriesListDataSelectorsType.class,
        TimeSeriesDataElementsType.class
    );

    public TimeSeriesListDataFunction() {
        super(
            TIME_SERIES_LIST_DATA.value(),
            TYPE_INFO
        );
        setReadable(true, false);
        setWritable(true, true);
    }

    @Override
    protected void validateReadCmd(
        List<TimeSeriesListDataSelectorsType> timeSeriesListDataSelectorsTypes,
        TimeSeriesDataElementsType timeSeriesDataElementsType,
        ReadListCmdOption readListCmdOption
    ) throws SpineException {

    }

    @Override
    protected void validateData(TimeSeriesDataType timeSeriesDataType) throws
        DataValidationException {

    }

    @Override
    public SpineAcknowledgment call(CmdType cmd, FeatureAddressType sourceAddress) {
        return null;
    }

    @Override
    public void writeData(
        TimeSeriesDataType timeSeriesDataType,
        DataUpdateType dataUpdateType,
        Integer idx
    ) {

    }

    @Override
    protected void validateUpdateForMatchingData(
        TimeSeriesDataType update,
        List<TimeSeriesDataType> matchingData,
        WriteListCmdOption writeListCmdOption
    ) throws SpineException {

    }

    @Override
    protected void validateWriteCmdFull(
        List<TimeSeriesDataType> updateList,
        List<TimeSeriesListDataSelectorsType> timeSeriesListDataSelectorsTypes,
        TimeSeriesDataElementsType timeSeriesDataElementsType,
        WriteListCmdOption writeListCmdOption
    ) throws SpineException {

    }
}
