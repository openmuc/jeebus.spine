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

import org.openmuc.jeebus.spine.api.Error;
import org.openmuc.jeebus.spine.api.SpineException;
import org.openmuc.jeebus.spine.spi.function.ListFeatureFunctionTypeInfo;
import org.openmuc.jeebus.spine.spi.function.ReadAndWriteListFeatureFunction;

import java.util.Optional;

public abstract class LoadControlFeatureFunction<DATA, DATA_LIST, SELECTOR, ELEMENTS>
    extends ReadAndWriteListFeatureFunction<
    DATA,
    DATA_LIST,
    SELECTOR,
    ELEMENTS,
    ListFeatureFunctionTypeInfo<DATA, DATA_LIST, SELECTOR, ELEMENTS
        >> {

    protected LoadControlFeature loadControlFeature;

    LoadControlFeatureFunction(
        String functionName,
        ListFeatureFunctionTypeInfo<DATA, DATA_LIST, SELECTOR, ELEMENTS> typeInfo
    ) {
        super(functionName, typeInfo);
        setReadable(true, true);
        setWritable(true, true);
    }

    public void validateIsRemoteControllable() throws SpineException {
        Optional<NodeDataFunction> nodeDataFunction = feature.getFunction(NodeDataFunction.class);
        if (nodeDataFunction.isPresent()
            && nodeDataFunction.get().getDataCopy() != null
            && nodeDataFunction.get().getDataCopy().getIsNodeRemoteControllable()
        ) {
            throw new SpineException(
                Error.COMMAND_REJECTED,
                "Feature is set to be not remote controllable"
            );
        }
    }

    public void setLoadControlFeature(LoadControlFeature loadControlFeature) {
        this.loadControlFeature = loadControlFeature;
    }
}
