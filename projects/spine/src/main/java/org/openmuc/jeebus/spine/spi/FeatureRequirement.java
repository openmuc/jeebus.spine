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

import org.openmuc.jeebus.spine.spi.function.FeatureFunction;
import org.openmuc.jeebus.spine.xsd.v1.FeatureTypeEnumType;
import org.openmuc.jeebus.spine.xsd.v1.RoleType;

import java.util.List;
import java.util.Objects;

/**
 * A requirement for a feature that must be present on the entity which a use case is running on.
 */
public final class FeatureRequirement {
    private final FeatureTypeEnumType featureType;
    private final RoleType featureRole;
    private final List<Class<? extends FeatureFunction>> featureFunctions;

    /**
     * The generic client feature that is needed by the client actor of most use cases
     */
    public static FeatureRequirement GENERIC_CLIENT = new FeatureRequirement(FeatureTypeEnumType.GENERIC, RoleType.CLIENT);

    @SafeVarargs
    public FeatureRequirement(FeatureTypeEnumType feature, RoleType featureRole, Class<? extends FeatureFunction>... featureFunctions) {
        this.featureType = feature;
        this.featureRole = featureRole;
        this.featureFunctions = List.of(featureFunctions);
    }

    /**
     * @return which feature functions must be present on the required feature
     */
    public List<Class<? extends FeatureFunction>> getFeatureFunctions() {
        return featureFunctions;
    }

    /**
     * @return which feature type is required
     */
    public FeatureTypeEnumType getFeatureType() {
        return featureType;
    }

    /**
     * @return which role the required feature must have
     */
    public RoleType getFeatureRole() {
        return featureRole;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof FeatureRequirement)) return false;
        FeatureRequirement that = (FeatureRequirement) o;
        return featureType == that.featureType && featureRole == that.featureRole && Objects.equals(featureFunctions, that.featureFunctions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(featureType, featureRole, featureFunctions);
    }

    @Override
    public String toString() {
        return "FeatureRequirement{" +
                "featureType=" + featureType +
                ", featureRole=" + featureRole +
                ", featureFunctions=" + featureFunctions +
                '}';
    }
}
