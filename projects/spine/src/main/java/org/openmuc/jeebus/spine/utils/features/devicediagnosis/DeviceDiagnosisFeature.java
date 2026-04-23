/********************************************************************************
 * Copyright (c) 2026 Fraunhofer ISE
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 ********************************************************************************/

package org.openmuc.jeebus.spine.utils.features.devicediagnosis;

import org.openmuc.jeebus.spine.api.Feature;
import org.openmuc.jeebus.spine.spi.FeaturePermission;
import org.openmuc.jeebus.spine.spi.FeatureType;
import org.openmuc.jeebus.spine.api.FeatureWrapper;
import org.openmuc.jeebus.spine.spi.KnownFeatureInformation;
import org.openmuc.jeebus.spine.spi.function.FeatureFunction;
import org.openmuc.jeebus.spine.xsd.v1.FeatureTypeEnumType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.ScheduledFuture;

@FeatureType(FeatureTypeEnumType.DEVICE_DIAGNOSIS)
public class DeviceDiagnosisFeature implements FeatureWrapper {
    private static final Logger LOGGER = LoggerFactory.getLogger(
        DeviceDiagnosisFeature.class);
    private HeartbeatDataFunction heartbeatDataFunction;
    private StateDataFunction stateDataFunction;
    private ServiceDataFunction serviceDataFunction;
    private final Feature feature;

    public DeviceDiagnosisFeature(Feature feature) {
        this.feature = feature;
    }

    public HeartbeatDataFunction addHeartBeatDataFunction(long timeoutSeconds) {
        feature.getOrAddFunction(HeartbeatDataFunction.class).setTimeoutSeconds(timeoutSeconds);
        return heartbeatDataFunction;
    }

    public StateDataFunction addStateDataFunction() {
        return feature.getOrAddFunction(StateDataFunction.class);
    }

    public ServiceDataFunction addServiceDataFunction() {
        return feature.getOrAddFunction(ServiceDataFunction.class);
    }

    public HeartbeatDataFunction getHeartbeatDataFunction() {
        return heartbeatDataFunction;
    }

    public StateDataFunction getStateDataFunction() {
        return stateDataFunction;
    }

    public ServiceDataFunction getServiceDataFunction() {
        return serviceDataFunction;
    }

    public ScheduledFuture<?> startHeartbeat() {
        LOGGER.debug("Device Diagnosis - starting heartbeat");
        return heartbeatDataFunction.startHeartbeat();
    }

    public void sendHeartbeat() {
        LOGGER.debug("Device Diagnosis - manually sending heartbeat");
        heartbeatDataFunction.increaseCounterAndNotifySubscribers();
    }

    @Override
    public void updateFunction(FeatureFunction newFunction) {
        if (newFunction instanceof HeartbeatDataFunction) {
            heartbeatDataFunction = (HeartbeatDataFunction) newFunction;
        } else if (newFunction instanceof ServiceDataFunction) {
            serviceDataFunction = (ServiceDataFunction) newFunction;
        } else if (newFunction instanceof StateDataFunction) {
            stateDataFunction = (StateDataFunction) newFunction;
        }
    }

    @Override
    public Feature getFeature() {
        return feature;
    }

    public static class MetaInformation implements KnownFeatureInformation {
        @Override
        public FeatureWrapper create(Feature feature) {
            return feature.getType() == FeatureTypeEnumType.DEVICE_DIAGNOSIS
                    ? new DeviceDiagnosisFeature(feature)
                    : null;
        }

        @Override
        public FeatureTypeEnumType getFeatureType() {
            return FeatureTypeEnumType.DEVICE_DIAGNOSIS;
        }

        @Override
        public FeaturePermission defaultFeaturePermission() {
            return FeaturePermission.ALLOW_SUBSCRIBE;
        }
    }
}
