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
import org.openmuc.jeebus.spine.utils.datatypes.ScaledNumberWrapper;
import org.openmuc.jeebus.spine.xsd.v1.*;

import java.time.Instant;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.Objects;

import static org.openmuc.jeebus.spine.utils.SpineUtilities.*;

@StandardFunctionType(
        type = FunctionEnumType.MEASUREMENT_LIST_DATA,
        featureType = FeatureTypeEnumType.MEASUREMENT)
public class MeasurementListDataFunction extends MeasurementFeatureFunction<
    MeasurementDataType,
    MeasurementListDataType,
    MeasurementListDataSelectorsType,
    MeasurementDataElementsType
    > {

    public static final ListFeatureFunctionTypeInfo<
        MeasurementDataType,
        MeasurementListDataType,
        MeasurementListDataSelectorsType,
        MeasurementDataElementsType
        > TYPE_INFO = new ListFeatureFunctionTypeInfo<>(
        new DataIdDescription<>(
            MeasurementDataType.class,
            List.of("measurementId"),
            List.of("timestamp")
        ),
        MeasurementListDataType.class,
        MeasurementListDataSelectorsType.class,
        MeasurementDataElementsType.class
    );

    public MeasurementListDataFunction() {
        super(FunctionEnumType.MEASUREMENT_LIST_DATA.value(), TYPE_INFO);
        setReadable(true, true);
    }

    @Override
    public SpineAcknowledgment call(CmdType cmd, FeatureAddressType sourceAddress) {
        throw new UnsupportedOperationException();
    }

    @Override
    protected void validateReadCmd(
        List<MeasurementListDataSelectorsType> selectorsTypeList,
        MeasurementDataElementsType elements, ReadListCmdOption readListCmdOption
    )
        throws SpineException {
    }

    @Override
    protected void validateData(MeasurementDataType data) throws
        DataValidationException {

        String vType = data.getValueType();
        String vSource = data.getValueSource();
        String vTendency = data.getValueTendency();
        String vState = data.getValueState();
        String vTimestamp = data.getTimestamp();

        MeasurementDescriptionDataType description =
            getFeature()
                .getMeasurementDescriptionListDataFunction()
                .getDataCopyForFirst(
                    d -> Objects.equals(
                        d.getMeasurementId(),
                        data.getMeasurementId()
                    )
                );

        if (vType != null && !isValidEnumValue(
            MeasurementValueTypeEnumType.class,
            vType
        )) {
            throw new DataValidationException("measurementData valueType "
                + vType
                + " is not a valid type");
        }

        if (data.getValue() != null) {
            if (description == null) {
                throw new DataValidationException(
                    "value is set but measurementDescription is not set");
            }
            else if (description.getMeasurementType() == null) {
                throw new DataValidationException(
                    "value is set but measurementType in measurementDescription is not "
                        + "set");
            }
        }

        if (vSource != null
            && !isValidEnumValue(MeasurementValueSourceEnumType.class, vSource)) {
            throw new DataValidationException("valueSource "
                + vSource
                + " is not a valid source");
        }
        if (vTendency != null
            && !isValidEnumValue(
            MeasurementValueTendencyEnumType.class,
            vTendency
        )) {
            throw new DataValidationException("valueTendency "
                + vTendency
                + " is not a valid tendency");
        }
        if (vState != null && !isValidEnumValue(
            MeasurementValueStateEnumType.class,
            vState
        )) {
            throw new DataValidationException("valueState "
                + vState
                + " is not a valid state");
        }

        if (vTimestamp != null) {
            try {
                Instant.parse(vTimestamp);
            }
            catch (DateTimeParseException e) {
                throw new DataValidationException(
                    "timestamp "
                        + vTimestamp
                        + " is not a valid xs:dateTime", e
                );
            }
        }

        if (data.getValue() == null && !Objects.equals(
            data.getValueState(),
            MeasurementValueStateEnumType.ERROR.value()
        )) {
            throw new DataValidationException(
                "value is not set but valueState is not set to error");
        }

        if (isStrictMode()) {
            validateRecommendedBehaviour(data);
        }

        if (getFeature().getMeasurementConstraintsListDataFunction() != null
            && isDataOutOfRange(data)
            && !Objects.equals(
            data.getValueState(),
            MeasurementValueStateEnumType.OUT_OF_RANGE.value()
        )) {
            throw new DataValidationException(
                "data is out of range but state was not set to out of range");
        }
    }

    /**
     * Checks if data is out of range and sets value state to out of range is so.
     *
     * @param data
     *     the data to check
     * @return if the data is out of range
     */
    public boolean checkAndSetDataOutOfRange(MeasurementDataType data) {
        if (isDataOutOfRange(data)) {
            data.setValueState(MeasurementValueStateEnumType.OUT_OF_RANGE.value());
            return true;
        }
        data.setValueState(MeasurementValueStateEnumType.NORMAL.value());
        return false;
    }

    private boolean isDataOutOfRange(MeasurementDataType data) {

        MeasurementConstraintsDataType constraints =
            getFeature()
                .getMeasurementConstraintsListDataFunction()
                .getDataCopyForFirst(
                    c -> Objects.equals(
                        c.getMeasurementId(),
                        data.getMeasurementId()
                    )
                );

        if (constraints == null) {
            return false;
        }

        ScaledNumberType scaledMin = constraints.getValueRangeMin();
        ScaledNumberType scaledMax = constraints.getValueRangeMax();
        double minValue = scaledMin == null ?
            Double.MIN_VALUE :
            new ScaledNumberWrapper(scaledMin).toDouble();
        double maxValue = scaledMax == null ?
            Double.MAX_VALUE :
            new ScaledNumberWrapper(scaledMax).toDouble();

        ScaledNumberType scaledValue = data.getValue();
        Double value = scaledValue == null ?
            null :
            new ScaledNumberWrapper(data.getValue()).toDouble();
        String valueType = data.getValueType();
        String valueValueType = MeasurementValueTypeEnumType.VALUE.value();
        String averageValueValueType
            = MeasurementValueTypeEnumType.AVERAGE_VALUE.value();

        if (value != null && (Objects.equals(valueType, valueValueType)
            || Objects.equals(
            valueType,
            averageValueValueType
        ))) {
            return value < minValue || value > maxValue;
        }

        return false;
    }

    protected void validateRecommendedBehaviour(MeasurementDataType data) throws
        DataValidationException {
        if (data.getValueType() == null) {
            throw new DataValidationException(
                "valueType is not set but is recommended (SHOULD)");
        }
    }
}
