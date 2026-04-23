/********************************************************************************
 * Copyright (c) 2026 Fraunhofer ISE
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 ********************************************************************************/

package org.openmuc.jeebus.spine.utils.features.loadcontrol;

import org.openmuc.jeebus.spine.api.Feature;
import org.openmuc.jeebus.spine.spi.FeaturePermission;
import org.openmuc.jeebus.spine.spi.FeatureType;
import org.openmuc.jeebus.spine.api.FeatureWrapper;
import org.openmuc.jeebus.spine.spi.KnownFeatureInformation;
import org.openmuc.jeebus.spine.spi.function.FeatureFunction;
import org.openmuc.jeebus.spine.xsd.v1.FeatureTypeEnumType;

import java.util.concurrent.ScheduledExecutorService;

@FeatureType(FeatureTypeEnumType.LOAD_CONTROL)
public class LoadControlFeature implements FeatureWrapper {

    private final Feature feature;
    private NodeDataFunction nodeDataFunction;
    private LimitListDataFunction limitListDataFunction;
    private LimitConstraintsDataFunction limitConstraintsDataFunction;
    private LimitDescriptionFunction limitDescriptionFunction;
    private StateListDataFunction stateListDataFunction;
    private EventListDataFunction eventListDataFunction;

    public LoadControlFeature(Feature feature) {
        this.feature = feature;
    }

    public NodeDataFunction getNodeDataFunction() {
        return nodeDataFunction;
    }

    public LimitListDataFunction getLimitListDataFunction() {
        return limitListDataFunction;
    }

    public LimitConstraintsDataFunction getLimitConstraintsDataFunction() {
        return limitConstraintsDataFunction;
    }

    public LimitDescriptionFunction getLimitDescriptionFunction() {
        return limitDescriptionFunction;
    }

    public StateListDataFunction getStateListDataFunction() {
        return stateListDataFunction;
    }

    public EventListDataFunction getEventListDataFunction() {
        return eventListDataFunction;
    }

    public NodeDataFunction addNodeDataFunction() {
        return feature.getOrAddFunction(NodeDataFunction.class);
    }

    public LimitListDataFunction addLimitListDataFunction() {
        LimitListDataFunction function = feature.getOrAddFunction(LimitListDataFunction.class);
        function.setLoadControlFeature(this);
        return function;
    }

    public LimitListDataFunction addLimitListDataFunction(ScheduledExecutorService executor) {
        LimitListDataFunction function = new LimitListDataFunction(executor);
        feature.addFunction(function);
        function.setLoadControlFeature(this);
        return function;
    }

    public LimitConstraintsDataFunction addLimitConstraintsDataFunction() {
        LimitConstraintsDataFunction function = feature.getOrAddFunction(LimitConstraintsDataFunction.class);
        function.setLoadControlFeature(this);
        return function;
    }

    public LimitDescriptionFunction addLimitDescriptionFunction() {
        LimitDescriptionFunction function = feature.getOrAddFunction(LimitDescriptionFunction.class);
        function.setLoadControlFeature(this);
        return function;
    }

    public StateListDataFunction addStateListDataFunction() {
        StateListDataFunction function = feature.getOrAddFunction(StateListDataFunction.class);
        function.setLoadControlFeature(this);
        return function;
    }

    public EventListDataFunction addEventListDataFunction() {
        EventListDataFunction function = feature.getOrAddFunction(EventListDataFunction.class);
        function.setLoadControlFeature(this);
        return function;
    }

    @Override
    public void updateFunction(FeatureFunction newFunction) {
        if (newFunction instanceof EventListDataFunction) {
            eventListDataFunction = (EventListDataFunction) newFunction;
        } else if (newFunction instanceof LimitConstraintsDataFunction) {
            limitConstraintsDataFunction = (LimitConstraintsDataFunction) newFunction;
        } else if (newFunction instanceof LimitDescriptionFunction) {
            limitDescriptionFunction = (LimitDescriptionFunction) newFunction;
        } else if (newFunction instanceof LimitListDataFunction) {
            limitListDataFunction = (LimitListDataFunction) newFunction;
        } else if (newFunction instanceof NodeDataFunction) {
            nodeDataFunction = (NodeDataFunction) newFunction;
        } else if (newFunction instanceof StateListDataFunction) {
            stateListDataFunction = (StateListDataFunction) newFunction;
        }
        if (newFunction instanceof LoadControlFeatureFunction<?, ?, ?, ?>) {
            ((LoadControlFeatureFunction<?,?,?,?>) newFunction).setLoadControlFeature(this);
        }
    }

    @Override
    public Feature getFeature() {
        return feature;
    }

    public static class MetaInformation implements KnownFeatureInformation {
        @Override
        public FeatureWrapper create(Feature feature) {
            return feature.getType() == FeatureTypeEnumType.LOAD_CONTROL
                    ? new LoadControlFeature(feature)
                    : null;
        }

        @Override
        public FeatureTypeEnumType getFeatureType() {
            return FeatureTypeEnumType.LOAD_CONTROL;
        }

        @Override
        public FeaturePermission defaultFeaturePermission() {
            return FeaturePermission.ALLOW_ALL;
        }
    }
}
