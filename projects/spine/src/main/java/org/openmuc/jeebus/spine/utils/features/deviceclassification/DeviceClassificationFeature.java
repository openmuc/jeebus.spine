/********************************************************************************
 * Copyright (c) 2026 Fraunhofer ISE
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 ********************************************************************************/

package org.openmuc.jeebus.spine.utils.features.deviceclassification;

import org.openmuc.jeebus.spine.api.Feature;
import org.openmuc.jeebus.spine.api.FeatureWrapper;
import org.openmuc.jeebus.spine.spi.FeaturePermission;
import org.openmuc.jeebus.spine.spi.FeatureType;
import org.openmuc.jeebus.spine.spi.KnownFeatureInformation;
import org.openmuc.jeebus.spine.spi.function.FeatureFunction;
import org.openmuc.jeebus.spine.xsd.v1.FeatureTypeEnumType;

@FeatureType(FeatureTypeEnumType.DEVICE_CLASSIFICATION)
public class DeviceClassificationFeature implements FeatureWrapper {
    private final Feature feature;
    private DeviceClassificationManufacturerDataFunction deviceClassificationManufacturerDataFunction;

    public DeviceClassificationFeature(Feature feature) {
        this.feature = feature;
    }

    public DeviceClassificationManufacturerDataFunction addDeviceClassificationManufacturerDataFunction() {
        return feature.getOrAddFunction(DeviceClassificationManufacturerDataFunction.class);
    }

    @Override
    public void updateFunction(FeatureFunction newFunction) {
        if (newFunction instanceof DeviceClassificationManufacturerDataFunction) {
            this.deviceClassificationManufacturerDataFunction = (DeviceClassificationManufacturerDataFunction) newFunction;
        }
    }

    @Override
    public Feature getFeature() {
        return feature;
    }

    public DeviceClassificationManufacturerDataFunction getDeviceClassificationManufacturerDataFunction() {
        return deviceClassificationManufacturerDataFunction;
    }

    public static class MetaInformation implements KnownFeatureInformation {
        @Override
        public FeatureWrapper create(Feature feature) {
            return feature.getType() == FeatureTypeEnumType.DEVICE_CLASSIFICATION
                ? new DeviceClassificationFeature(feature)
                : null;
        }

        @Override
        public FeatureTypeEnumType getFeatureType() {
            return FeatureTypeEnumType.DEVICE_CLASSIFICATION;
        }

        @Override
        public FeaturePermission defaultFeaturePermission() {
            return FeaturePermission.ALLOW_SUBSCRIBE;
        }
    }
}
