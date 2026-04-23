/********************************************************************************
 * Copyright (c) 2026 Fraunhofer ISE
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 ********************************************************************************/

package org.openmuc.jeebus.spine.utils.features.measurement;

import org.openmuc.jeebus.spine.api.DataValidationException;
import org.openmuc.jeebus.spine.api.SpineAcknowledgment;
import org.openmuc.jeebus.spine.api.SpineException;
import org.openmuc.jeebus.spine.api.options.ReadListCmdOption;
import org.openmuc.jeebus.spine.impl.DataIdDescription;
import org.openmuc.jeebus.spine.spi.function.ListFeatureFunctionTypeInfo;
import org.openmuc.jeebus.spine.spi.function.StandardFunctionType;
import org.openmuc.jeebus.spine.xsd.v1.*;

import java.util.List;

@StandardFunctionType(
        type = FunctionEnumType.MEASUREMENT_THRESHOLD_RELATION_LIST_DATA,
        featureType = FeatureTypeEnumType.MEASUREMENT)
public class MeasurementThresholdRelationListDataFunction
    extends MeasurementFeatureFunction<
    MeasurementThresholdRelationDataType,
    MeasurementThresholdRelationListDataType,
    MeasurementThresholdRelationListDataSelectorsType,
    MeasurementThresholdRelationDataElementsType
    > {

    public static final ListFeatureFunctionTypeInfo<
        MeasurementThresholdRelationDataType,
        MeasurementThresholdRelationListDataType,
        MeasurementThresholdRelationListDataSelectorsType,
        MeasurementThresholdRelationDataElementsType
        > TYPE_INFO = new ListFeatureFunctionTypeInfo<>(
        new DataIdDescription<>(
            MeasurementThresholdRelationDataType.class,
            List.of("measurementId")
        ),
        MeasurementThresholdRelationListDataType.class,
        MeasurementThresholdRelationListDataSelectorsType.class,
        MeasurementThresholdRelationDataElementsType.class
    );

    public MeasurementThresholdRelationListDataFunction() {
        super(
            FunctionEnumType.MEASUREMENT_THRESHOLD_RELATION_LIST_DATA.value(),
            TYPE_INFO
        );
        setReadable(true, true);
    }

    @Override
    public SpineAcknowledgment call(CmdType cmd, FeatureAddressType sourceAddress) {
        throw new UnsupportedOperationException();
    }

    @Override
    protected void validateReadCmd(
        List<MeasurementThresholdRelationListDataSelectorsType> measurementThresholdRelationListDataSelectorsTypes,
        MeasurementThresholdRelationDataElementsType elements,
        ReadListCmdOption readListCmdOption
    )
        throws SpineException {
        // nothing to do
    }

    @Override
    protected void validateData(
        MeasurementThresholdRelationDataType measurementThresholdRelationDataType
    ) throws DataValidationException {
        // nothing to do
    }
}
