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

import org.openmuc.jeebus.spine.api.DataValidationException;
import org.openmuc.jeebus.spine.api.SpineAcknowledgment;
import org.openmuc.jeebus.spine.api.SpineException;
import org.openmuc.jeebus.spine.api.options.ReadListCmdOption;
import org.openmuc.jeebus.spine.impl.DataIdDescription;
import org.openmuc.jeebus.spine.spi.function.ListFeatureFunctionTypeInfo;
import org.openmuc.jeebus.spine.spi.function.ReadListFeatureFunction;
import org.openmuc.jeebus.spine.spi.function.StandardFunctionType;
import org.openmuc.jeebus.spine.xsd.v1.*;

import java.util.List;

import static org.openmuc.jeebus.spine.xsd.v1.FunctionEnumType.TIME_SERIES_DESCRIPTION_LIST_DATA;

@StandardFunctionType(
    type = TIME_SERIES_DESCRIPTION_LIST_DATA,
    featureType = FeatureTypeEnumType.TIME_SERIES
)
public class TimeSeriesDescriptionListDataFunction
    extends ReadListFeatureFunction<
        TimeSeriesDescriptionDataType,
        TimeSeriesDescriptionListDataType,
        TimeSeriesDescriptionListDataSelectorsType,
        TimeSeriesDescriptionDataElementsType,
        ListFeatureFunctionTypeInfo<
            TimeSeriesDescriptionDataType,
            TimeSeriesDescriptionListDataType,
            TimeSeriesDescriptionListDataSelectorsType,
            TimeSeriesDescriptionDataElementsType
>> {

    public static final ListFeatureFunctionTypeInfo<
        TimeSeriesDescriptionDataType,
        TimeSeriesDescriptionListDataType,
        TimeSeriesDescriptionListDataSelectorsType,
        TimeSeriesDescriptionDataElementsType
    > TYPE_INFO = new ListFeatureFunctionTypeInfo<>(
        new DataIdDescription<>(
            TimeSeriesDescriptionDataType.class,
            List.of("timeSeriesId")
        ),
        TimeSeriesDescriptionListDataType.class,
        TimeSeriesDescriptionListDataSelectorsType.class,
        TimeSeriesDescriptionDataElementsType.class
    );

    public TimeSeriesDescriptionListDataFunction() {
        super(
            TIME_SERIES_DESCRIPTION_LIST_DATA.value(),
            TYPE_INFO
        );
        setReadable(true, false);
        setWritable(false, false);
    }

    @Override
    protected void validateReadCmd(
        List<TimeSeriesDescriptionListDataSelectorsType> timeSeriesDescriptionListDataSelectorsTypes,
        TimeSeriesDescriptionDataElementsType timeSeriesDescriptionDataElementsType,
        ReadListCmdOption readListCmdOption
    ) throws SpineException {

    }

    @Override
    protected void validateData(TimeSeriesDescriptionDataType timeSeriesDescriptionDataType) throws
        DataValidationException {

    }

    @Override
    public SpineAcknowledgment call(CmdType cmd, FeatureAddressType sourceAddress) {
        return null;
    }
}
