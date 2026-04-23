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

import static org.openmuc.jeebus.spine.utils.SpineUtilities.isValidEnumValue;

@StandardFunctionType(
    type = FunctionEnumType.MEASUREMENT_DESCRIPTION_LIST_DATA,
    featureType = FeatureTypeEnumType.MEASUREMENT
)
public class MeasurementDescriptionListDataFunction
    extends MeasurementFeatureFunction<
    MeasurementDescriptionDataType,
    MeasurementDescriptionListDataType,
    MeasurementDescriptionListDataSelectorsType,
    MeasurementDescriptionDataElementsType
    > {

    public static final ListFeatureFunctionTypeInfo<
        MeasurementDescriptionDataType,
        MeasurementDescriptionListDataType,
        MeasurementDescriptionListDataSelectorsType,
        MeasurementDescriptionDataElementsType
        > TYPE_INFO = new ListFeatureFunctionTypeInfo<>(
        new DataIdDescription<>(
            MeasurementDescriptionDataType.class,
            List.of("measurementId")
        ),
        MeasurementDescriptionListDataType.class,
        MeasurementDescriptionListDataSelectorsType.class,
        MeasurementDescriptionDataElementsType.class
    );

    public MeasurementDescriptionListDataFunction() {
        super(FunctionEnumType.MEASUREMENT_DESCRIPTION_LIST_DATA.value(), TYPE_INFO);
        setReadable(true, true);
    }

    @Override
    public SpineAcknowledgment call(CmdType cmd, FeatureAddressType sourceAddress) {
        throw new UnsupportedOperationException();
    }

    @Override
    protected void validateReadCmd(
        List<MeasurementDescriptionListDataSelectorsType> measurementDescriptionListDataSelectorsTypes,
        MeasurementDescriptionDataElementsType elements,
        ReadListCmdOption readListCmdOption
    )
        throws SpineException {

    }

    @Override
    protected void validateData(MeasurementDescriptionDataType data)
        throws DataValidationException {
        String mType = data.getMeasurementType();
        if (mType != null && !isValidEnumValue(
            MeasurementTypeEnumType.class,
            mType
        )) {
            throw new DataValidationException("measurementType "
                + mType
                + " is not a valid type");
        }
    }
}
