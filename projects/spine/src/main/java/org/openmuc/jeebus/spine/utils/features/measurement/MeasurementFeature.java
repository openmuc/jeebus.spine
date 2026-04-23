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

import org.openmuc.jeebus.spine.api.Feature;
import org.openmuc.jeebus.spine.spi.FeaturePermission;
import org.openmuc.jeebus.spine.spi.FeatureType;
import org.openmuc.jeebus.spine.api.FeatureWrapper;
import org.openmuc.jeebus.spine.spi.KnownFeatureInformation;
import org.openmuc.jeebus.spine.spi.function.FeatureFunction;
import org.openmuc.jeebus.spine.xsd.v1.FeatureTypeEnumType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@FeatureType(FeatureTypeEnumType.MEASUREMENT)
public class MeasurementFeature implements FeatureWrapper {
    private static final Logger LOGGER = LoggerFactory.getLogger(MeasurementFeature.class);

    private boolean strictMode;
    private final Feature feature;

    public boolean isStrictMode() {
        return strictMode;
    }

    private MeasurementListDataFunction measurementListDataFunction;
    private MeasurementDescriptionListDataFunction
        measurementDescriptionListDataFunction;
    private MeasurementConstraintsListDataFunction
        measurementConstraintsListDataFunction;
    private MeasurementSeriesListDataFunction measurementSeriesListDataFunction;
    private MeasurementThresholdRelationListDataFunction
        measurementThresholdRelationListDataFunction;

    public MeasurementFeature(Feature feature) {
        this.feature = feature;
    }

    public MeasurementListDataFunction getMeasurementListDataFunction() {
        return measurementListDataFunction;
    }

    public MeasurementDescriptionListDataFunction getMeasurementDescriptionListDataFunction() {
        return measurementDescriptionListDataFunction;
    }

    public MeasurementConstraintsListDataFunction getMeasurementConstraintsListDataFunction() {
        return measurementConstraintsListDataFunction;
    }

    public MeasurementSeriesListDataFunction getMeasurementSeriesListDataFunction() {
        return measurementSeriesListDataFunction;
    }

    public MeasurementThresholdRelationListDataFunction getMeasurementThresholdRelationListDataFunction() {
        return measurementThresholdRelationListDataFunction;
    }

    public MeasurementListDataFunction addMeasurementListDataFunction() {
        measurementListDataFunction = new MeasurementListDataFunction();
        getMeasurementListDataFunction().setMeasurementFeature(this);
        return getMeasurementListDataFunction();
    }

    public MeasurementDescriptionListDataFunction addMeasurementDescriptionListDataFunction() {
        measurementDescriptionListDataFunction
            = new MeasurementDescriptionListDataFunction();
        getMeasurementDescriptionListDataFunction().setMeasurementFeature(this);
        return getMeasurementDescriptionListDataFunction();
    }

    public MeasurementConstraintsListDataFunction addMeasurementConstraintsListDataFunction() {
        measurementConstraintsListDataFunction
            = new MeasurementConstraintsListDataFunction();
        getMeasurementConstraintsListDataFunction().setMeasurementFeature(this);
        return getMeasurementConstraintsListDataFunction();
    }

    public MeasurementSeriesListDataFunction addMeasurementSeriesListDataFunction() {
        measurementSeriesListDataFunction = new MeasurementSeriesListDataFunction();
        getMeasurementSeriesListDataFunction().setMeasurementFeature(this);
        return getMeasurementSeriesListDataFunction();
    }

    public MeasurementThresholdRelationListDataFunction addMeasurementThresholdRelationListDataFunction() {
        measurementThresholdRelationListDataFunction
            = new MeasurementThresholdRelationListDataFunction();
        getMeasurementThresholdRelationListDataFunction().setMeasurementFeature(this);
        return getMeasurementThresholdRelationListDataFunction();
    }

    /**
     * Set strictMode to true if any notify should fail when there are warnings from
     * the validation. Warnings occur for none held behaviour that is marked as
     * SHOULD in the SPINE or Use Case specification.
     *
     * @param strictMode
     *     true/false
     */
    public void setStrictMode(boolean strictMode) {
        this.strictMode = strictMode;
        if (measurementListDataFunction != null) {
            measurementListDataFunction.setStrictMode(strictMode);
        }
        if (measurementDescriptionListDataFunction != null) {
            measurementDescriptionListDataFunction.setStrictMode(strictMode);
        }
        if (measurementConstraintsListDataFunction != null) {
            measurementConstraintsListDataFunction.setStrictMode(strictMode);
        }
        if (measurementSeriesListDataFunction != null) {
            measurementSeriesListDataFunction.setStrictMode(strictMode);
        }
        if (measurementThresholdRelationListDataFunction != null) {
            measurementThresholdRelationListDataFunction.setStrictMode(
                strictMode);
        }
    }

    @Override
    public void updateFunction(FeatureFunction newFunction) {
        LOGGER.trace("updateFunction {}", newFunction.getFunctionName());
        if (newFunction instanceof MeasurementConstraintsListDataFunction) {
            if (measurementConstraintsListDataFunction != null) measurementConstraintsListDataFunction.setMeasurementFeature(null);
            measurementConstraintsListDataFunction = (MeasurementConstraintsListDataFunction) newFunction;
            measurementConstraintsListDataFunction.setMeasurementFeature(this);
        } else if (newFunction instanceof MeasurementDescriptionListDataFunction) {
            if (measurementDescriptionListDataFunction != null) measurementDescriptionListDataFunction.setMeasurementFeature(null);
            measurementDescriptionListDataFunction = (MeasurementDescriptionListDataFunction) newFunction;
            measurementDescriptionListDataFunction.setMeasurementFeature(this);
        } else if (newFunction instanceof MeasurementListDataFunction) {
            if (measurementListDataFunction != null) measurementListDataFunction.setMeasurementFeature(null);
            measurementListDataFunction = (MeasurementListDataFunction) newFunction;
            measurementListDataFunction.setMeasurementFeature(this);
        } else if (newFunction instanceof MeasurementSeriesListDataFunction) {
            if (measurementSeriesListDataFunction != null) measurementSeriesListDataFunction.setMeasurementFeature(null);
            measurementSeriesListDataFunction = (MeasurementSeriesListDataFunction) newFunction;
            measurementSeriesListDataFunction.setMeasurementFeature(this);
        } else if (newFunction instanceof MeasurementThresholdRelationListDataFunction) {
            if (measurementThresholdRelationListDataFunction != null) measurementThresholdRelationListDataFunction.setMeasurementFeature(null);
            measurementThresholdRelationListDataFunction = (MeasurementThresholdRelationListDataFunction) newFunction;
            measurementThresholdRelationListDataFunction.setMeasurementFeature(this);
        }
    }

    @Override
    public Feature getFeature() {
        return feature;
    }

    public static class MetaInformation implements KnownFeatureInformation {
        @Override
        public FeatureWrapper create(Feature feature) {
            return feature.getType() == FeatureTypeEnumType.MEASUREMENT
                    ? new MeasurementFeature(feature)
                    : null;
        }

        @Override
        public FeatureTypeEnumType getFeatureType() {
            return FeatureTypeEnumType.MEASUREMENT;
        }

        @Override
        public FeaturePermission defaultFeaturePermission() {
            return FeaturePermission.ALLOW_ALL;
        }
    }
}
