/********************************************************************************
 * Copyright (c) 2026 Fraunhofer ISE
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 ********************************************************************************/

package org.openmuc.jeebus.spine.utils.features.setpoint;

import org.openmuc.jeebus.spine.api.Feature;
import org.openmuc.jeebus.spine.api.FeatureWrapper;
import org.openmuc.jeebus.spine.spi.FeaturePermission;
import org.openmuc.jeebus.spine.spi.FeatureType;
import org.openmuc.jeebus.spine.spi.KnownFeatureInformation;
import org.openmuc.jeebus.spine.spi.function.FeatureFunction;
import org.openmuc.jeebus.spine.xsd.v1.FeatureTypeEnumType;

import java.util.concurrent.ScheduledExecutorService;

@FeatureType(FeatureTypeEnumType.SETPOINT)
public class SetpointFeature implements FeatureWrapper {
    private final Feature feature;
    private SetpointListDataFunction setpointListDataFunction;
    private SetpointConstraintsListDataFunction setpointConstraintsListDataFunction;
    private SetpointDescriptionListDataFunction setpointDescriptionListDataFunction;

    public SetpointFeature(Feature feature) { this.feature = feature;}

    public SetpointListDataFunction getSetpointListDataFunction() { return setpointListDataFunction;}

    public SetpointConstraintsListDataFunction getSetpointConstraintsListDataFunction() { return  setpointConstraintsListDataFunction;}

    public SetpointDescriptionListDataFunction getSetpointDescriptionListDataFunction() { return setpointDescriptionListDataFunction;}

    public SetpointListDataFunction addSetpointListDataFunction(
        ScheduledExecutorService executor
        ) {
        SetpointListDataFunction function = new SetpointListDataFunction(executor);
        feature.addFunction(function);
        function.setSetpointFeature(this);
        return function;
    }

    public SetpointConstraintsListDataFunction addSetpointConstraintsListDataFunction() {
        SetpointConstraintsListDataFunction function = feature.getOrAddFunction(SetpointConstraintsListDataFunction.class);
        function.setSetpointFeature(this);
        return function;
    }

    public SetpointDescriptionListDataFunction addSetpointDescriptionListDataFunction() {
        SetpointDescriptionListDataFunction function = feature.getOrAddFunction(SetpointDescriptionListDataFunction.class);
        function.setSetpointFeature(this);
        return function;
    }

    @Override
    public void updateFunction(FeatureFunction newFunction) {
        if (newFunction instanceof SetpointListDataFunction) {
            setpointListDataFunction = (SetpointListDataFunction) newFunction;
        }
        else if (newFunction instanceof SetpointConstraintsListDataFunction) {
            setpointConstraintsListDataFunction = (SetpointConstraintsListDataFunction) newFunction;
        }
        else if (newFunction instanceof SetpointDescriptionListDataFunction) {
            setpointDescriptionListDataFunction = (SetpointDescriptionListDataFunction) newFunction;
        }
        if (newFunction instanceof SetpointFeatureFunction<?, ?, ?, ?>) {
            ((SetpointFeatureFunction<?, ?, ?, ?>) newFunction).setSetpointFeature(this);
        }
    }

    @Override
    public Feature getFeature() {
        return feature;
    }

    public static class MetaInformation implements KnownFeatureInformation {
        @Override
        public FeatureWrapper create(Feature feature) {
            return feature.getType() == FeatureTypeEnumType.SETPOINT
                ? new SetpointFeature(feature)
                : null;
        }

        @Override
        public FeatureTypeEnumType getFeatureType() {
            return FeatureTypeEnumType.SETPOINT;
        }

        @Override
        public FeaturePermission defaultFeaturePermission() {
            return FeaturePermission.ALLOW_ALL;
        }

    }

}
