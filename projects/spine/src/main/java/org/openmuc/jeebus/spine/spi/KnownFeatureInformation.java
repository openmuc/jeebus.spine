/********************************************************************************
 * Copyright (c) 2026 Fraunhofer ISE
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 ********************************************************************************/

package org.openmuc.jeebus.spine.spi;

import org.openmuc.jeebus.spine.api.Feature;
import org.openmuc.jeebus.spine.api.FeatureWrapper;
import org.openmuc.jeebus.spine.spi.function.FeatureFunction;
import org.openmuc.jeebus.spine.xsd.v1.FeatureTypeEnumType;

/**
 * Information about a specific known feature and its implementation
 */
public interface KnownFeatureInformation {
    /**
     * Which feature type is being implemented
     * @return the feature type being implemented
     */
    FeatureTypeEnumType getFeatureType();

    /**
     * Create a wrapper around the given feature
     * @param feature the feature to wrapper
     * @return a FeatureWrapper specific to this feature type
     */
    FeatureWrapper create(Feature feature);

    /**
     * The default FeaturePermission for this feature type
     * @return default feature permission
     */
    FeaturePermission defaultFeaturePermission();

    /**
     * Information for the {@link FeatureTypeEnumType#GENERIC} feature type (which has no special implementation).
     */
    class Generic implements KnownFeatureInformation {
        @Override
        public FeatureTypeEnumType getFeatureType() {
            return FeatureTypeEnumType.GENERIC;
        }

        @Override
        public FeatureWrapper create(Feature feature) {
            Feature feature1 = feature;
            return new FeatureWrapper() {
                private final Feature feature = feature1;

                @Override
                public void updateFunction(FeatureFunction newFunction) {

                }

                @Override
                public Feature getFeature() {
                    return feature;
                }
            };
        }

        @Override
        public FeaturePermission defaultFeaturePermission() {
            return null;
        }

    }
}
