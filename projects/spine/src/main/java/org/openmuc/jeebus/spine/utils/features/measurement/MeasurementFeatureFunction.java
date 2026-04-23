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

import org.openmuc.jeebus.spine.spi.function.ListFeatureFunctionTypeInfo;
import org.openmuc.jeebus.spine.spi.function.ReadListFeatureFunction;

public abstract class MeasurementFeatureFunction<DATA, DATA_LIST, SELECTOR, ELEMENTS>
    extends ReadListFeatureFunction<
    DATA,
    DATA_LIST,
    SELECTOR,
    ELEMENTS,
    ListFeatureFunctionTypeInfo<DATA, DATA_LIST, SELECTOR, ELEMENTS>
    > {

    private boolean strictMode = false;
    private MeasurementFeature feature;

    public MeasurementFeatureFunction(
        String functionName,
        ListFeatureFunctionTypeInfo<DATA, DATA_LIST, SELECTOR, ELEMENTS> typeInfo
    ) {
        super(functionName, typeInfo);
    }

    public boolean isStrictMode() {
        return strictMode;
    }

    public void setStrictMode(boolean strictMode) {
        this.strictMode = strictMode;
    }

    void setMeasurementFeature(MeasurementFeature feature) {
        this.feature = feature;
    }

    MeasurementFeature getFeature() {
        return feature;
    }
}
