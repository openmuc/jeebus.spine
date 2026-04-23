/********************************************************************************
 * Copyright (c) 2026 Fraunhofer ISE
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 ********************************************************************************/

package org.openmuc.jeebus.spine.api;

import org.openmuc.jeebus.spine.spi.FeatureType;
import org.openmuc.jeebus.spine.spi.function.FeatureFunction;
import org.openmuc.jeebus.spine.xsd.v1.RoleType;

/**
 * A wrapper around a {@link Feature}. Wrappers typically will have methods for retrieving specific feature functions,
 * and may also facilitate communication between feature functions that need to communicate with each other.
 */
public interface FeatureWrapper {
    /**
     * Let the wrapper know that a new function was added to its associated feature.
     * @param newFunction the function that was added
     * @implSpec implementors should check the new function's type, and do nothing if the function is associated
     *           with a different feature type.
     */
    void updateFunction(FeatureFunction newFunction);

    /**
     * @return the underlying feature for this wrapper.
     */
    Feature getFeature();

    /**
     * Create a new feature together with a wrapper.
     * @param wrapperClass The class of the wrapper; this determines the feature type as well.
     * @return A feature wrapper of the given type, wrapping a new feature.
     * @param <T> the wrapper type
     */
    @SuppressWarnings("unchecked")
    static <T extends FeatureWrapper> T newFeature(Class<T> wrapperClass) {
        FeatureType annotation = wrapperClass.getAnnotation(FeatureType.class);
        if (annotation == null)
            throw new IllegalArgumentException("Missing @FeatureType annotation for feature wrapper class " + wrapperClass);
        return (T) Feature.getBuilder().setType(annotation.value()).setRole(RoleType.SERVER).build().getFeatureWrapper();
    }
}
