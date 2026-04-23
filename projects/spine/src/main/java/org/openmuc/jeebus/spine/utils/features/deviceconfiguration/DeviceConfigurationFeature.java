/********************************************************************************
 * Copyright (c) 2026 Fraunhofer ISE
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 ********************************************************************************/

package org.openmuc.jeebus.spine.utils.features.deviceconfiguration;

import org.openmuc.jeebus.spine.api.Feature;
import org.openmuc.jeebus.spine.api.FeatureWrapper;
import org.openmuc.jeebus.spine.spi.FeaturePermission;
import org.openmuc.jeebus.spine.spi.FeatureType;
import org.openmuc.jeebus.spine.spi.KnownFeatureInformation;
import org.openmuc.jeebus.spine.spi.function.FeatureFunction;
import org.openmuc.jeebus.spine.xsd.v1.DeviceConfigurationKeyNameEnumType;
import org.openmuc.jeebus.spine.xsd.v1.FeatureTypeEnumType;

import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

@FeatureType(FeatureTypeEnumType.DEVICE_CONFIGURATION)
public class DeviceConfigurationFeature implements FeatureWrapper {

    private static final AtomicLong nextKeyId = new AtomicLong(1);
    //    private final static Logger LOGGER = LoggerFactory.getLogger(
//        DeviceConfigurationFeature.class);
    private final Feature feature;

    private KeyValueListDataFunction keyValueListDataFunction = null;
    private KeyValueDescriptionListDataFunction keyValueDescriptionListDataFunction
        = null;
    private KeyValueConstraintsListDataFunction keyValueConstraintsListDataFunction
        = null;

    public DeviceConfigurationFeature(Feature feature) {
        this.feature = feature;
    }

    static long getNextKeyId() {
        return nextKeyId.getAndIncrement();
    }

    public KeyValueListDataFunction getKeyValueListDataFunction() {
        return keyValueListDataFunction;
    }

    public KeyValueDescriptionListDataFunction getKeyValueDescriptionListDataFunction() {
        return keyValueDescriptionListDataFunction;
    }

    public KeyValueConstraintsListDataFunction getKeyValueConstraintsListDataFunction() {
        return keyValueConstraintsListDataFunction;
    }

    @Override
    public void updateFunction(FeatureFunction newFunction) {
        if (newFunction instanceof KeyValueListDataFunction) {
            if (keyValueListDataFunction != null) keyValueListDataFunction.setDeviceConfigurationFeature(null);
            keyValueListDataFunction = (KeyValueListDataFunction) newFunction;
            keyValueListDataFunction.setDeviceConfigurationFeature(this);
        } else if (newFunction instanceof KeyValueDescriptionListDataFunction) {
            if (keyValueDescriptionListDataFunction != null) keyValueDescriptionListDataFunction.setDeviceConfigurationFeature(null);
            keyValueDescriptionListDataFunction = (KeyValueDescriptionListDataFunction) newFunction;
            keyValueDescriptionListDataFunction.setDeviceConfigurationFeature(this);
        } else if (newFunction instanceof KeyValueConstraintsListDataFunction) {
            if (keyValueConstraintsListDataFunction != null) keyValueConstraintsListDataFunction.setDeviceConfigurationFeature(null);
            keyValueConstraintsListDataFunction = (KeyValueConstraintsListDataFunction) newFunction;
            keyValueConstraintsListDataFunction.setDeviceConfigurationFeature(this);
        }
    }

    @Override
    public Feature getFeature() {
        return feature;
    }

    public KeyValueListDataFunction addKeyValueListDataFunction() {
        return feature.getOrAddFunction(KeyValueListDataFunction.class);
    }

    public KeyValueDescriptionListDataFunction addKeyValueDescriptionListDataFunction() {
        return feature.getOrAddFunction(KeyValueDescriptionListDataFunction.class);
    }

    public KeyValueConstraintsListDataFunction addKeyValueConstraintsListDataFunction() {
        return feature.getOrAddFunction(KeyValueConstraintsListDataFunction.class);
    }

//    public void removeKeyValue(Long keyId) throws DataValidationException {
//        // FIXME this just lets things compile for now
//    }

    public void submitRunningKeyValue(RunningKeyValue keyValue) {
        keyValueListDataFunction.submitRunningKeyValue(keyValue);
    }

    public void removeRunningKeyValue(RunningKeyValue keyValue) {
        keyValueListDataFunction.removeRunningKeyValue(keyValue);
    }

    public RunningKeyValue getKeyValueForKeyId(Long keyId) {
        return keyValueListDataFunction.getKeyValueForKeyId(keyId);
    }

    public Optional<RunningKeyValue> getKeyValueForKeyName(DeviceConfigurationKeyNameEnumType needle) {
        return keyValueListDataFunction.runningKeyValues.values().stream().filter( kv ->
                kv.getDescriptionCopy().getKeyName().equals(needle.value())
        ).findAny();
    }

    public static class MetaInformation implements KnownFeatureInformation {
        @Override
        public FeatureWrapper create(Feature feature) {
            return feature.getType() == FeatureTypeEnumType.DEVICE_CONFIGURATION
                    ? new DeviceConfigurationFeature(feature)
                    : null;
        }

        @Override
        public FeatureTypeEnumType getFeatureType() {
            return FeatureTypeEnumType.DEVICE_CONFIGURATION;
        }

        @Override
        public FeaturePermission defaultFeaturePermission() {
            return FeaturePermission.ALLOW_ALL;
        }
    }
}
