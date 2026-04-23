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

import org.openmuc.jeebus.spine.api.Feature;
import org.openmuc.jeebus.spine.api.FeatureWrapper;
import org.openmuc.jeebus.spine.spi.FeaturePermission;
import org.openmuc.jeebus.spine.spi.FeatureType;
import org.openmuc.jeebus.spine.spi.KnownFeatureInformation;
import org.openmuc.jeebus.spine.spi.function.FeatureFunction;
import org.openmuc.jeebus.spine.xsd.v1.FeatureTypeEnumType;

@FeatureType(FeatureTypeEnumType.TIME_SERIES)
public class TimeSeriesFeature implements FeatureWrapper {
    private final Feature feature;

    private TimeSeriesDescriptionListDataFunction descriptionFunction;
    private TimeSeriesConstraintsListDataFunction constraintsFunction;
    private TimeSeriesListDataFunction dataFunction;

    public TimeSeriesFeature(Feature feature) {
        this.feature = feature;
    }

    @Override
    public void updateFunction(FeatureFunction newFunction) {
        if (newFunction instanceof TimeSeriesDescriptionListDataFunction) {
            descriptionFunction = (TimeSeriesDescriptionListDataFunction) newFunction;
        }
        else if (newFunction instanceof TimeSeriesConstraintsListDataFunction) {
            constraintsFunction = (TimeSeriesConstraintsListDataFunction) newFunction;
        }
        else if (newFunction instanceof TimeSeriesListDataFunction) {
            dataFunction = (TimeSeriesListDataFunction) newFunction;
        }
    }



    @Override
    public Feature getFeature() {
        return feature;
    }

    public TimeSeriesDescriptionListDataFunction getDescriptionFunction() {
        return descriptionFunction;
    }

    public TimeSeriesConstraintsListDataFunction getConstraintsFunction() {
        return constraintsFunction;
    }

    public TimeSeriesListDataFunction getDataFunction() {
        return dataFunction;
    }

    public static class MetaInformation implements KnownFeatureInformation {
        @Override
        public FeatureWrapper create(Feature feature) {
            return feature.getType() == FeatureTypeEnumType.TIME_SERIES
                ? new TimeSeriesFeature(feature)
                : null;
        }

        @Override
        public FeatureTypeEnumType getFeatureType() {
            return FeatureTypeEnumType.TIME_SERIES;
        }

        @Override
        public FeaturePermission defaultFeaturePermission() {
            return FeaturePermission.ALLOW_ALL;
        }
    }
}
