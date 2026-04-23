/********************************************************************************
 * Copyright (c) 2026 Fraunhofer ISE
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 ********************************************************************************/

package org.openmuc.jeebus.spine.impl;

import org.openmuc.jeebus.spine.api.Entity;
import org.openmuc.jeebus.spine.api.Feature;
import org.openmuc.jeebus.spine.api.IncompleteBuildException;
import org.openmuc.jeebus.spine.spi.FeaturePermission;
import org.openmuc.jeebus.spine.spi.function.FeatureFunction;
import org.openmuc.jeebus.spine.xsd.v1.FeatureTypeEnumType;
import org.openmuc.jeebus.spine.xsd.v1.RoleType;

public class FeatureBuilder {
    private final EntityBuilder entityBuilder;
    private final FeatureImpl feature = new FeatureImpl();

    FeatureBuilder(EntityBuilder entityBuilder) {
        this.entityBuilder = entityBuilder;
    }

    public FeatureBuilder() {
        entityBuilder = null;
    }

    /**
     * This method must be called before calling {@link #apply()} or
     * {@link #build()}!
     *
     * @param featureType
     *     the type of the SPINE feature
     * @return the updated <code>FeatureBuilder</code>
     */
    public FeatureBuilder setType(FeatureTypeEnumType featureType) {
        feature.setType(featureType);
        return this;
    }

    /**
     * This method must be called before calling {@link #apply()} or
     * {@link #build()}!
     *
     * @param role
     *     <code>SERVER</code> if this feature offers SPINE functions,
     *     <code>CLIENT</code> if this feature uses
     *     other features' functions, <code>SPECIAL</code> if both
     * @return the updated <code>FeatureBuilder</code>
     */
    public FeatureBuilder setRole(RoleType role) {
        feature.setRole(role);
        return this;
    }

    /**
     * @param function
     *     the SPINE function to add
     * @return the updated <code>FeatureBuilder</code>
     */
    public FeatureBuilder addFunction(FeatureFunction function) {
        feature.addFunction(function);
        return this;
    }

    /**
     * @param description
     *     a string describing the new SPINE feature
     * @return the updated <code>FeatureBuilder</code>
     */
    public FeatureBuilder setDescription(String description) {
        feature.setDescription(description);
        return this;
    }

    /**
     * @param label
     *     a human-readable alias of the new SPINE feature
     * @return the updated <code>FeatureBuilder</code>
     */
    public FeatureBuilder setLabel(String label) {
        feature.setLabel(label);
        return this;
    }

    /**
     * @param group
     *     the group this feature belongs to
     * @return the updated <code>FeatureBuilder</code>
     * @throws IllegalArgumentException
     *     if group does not match pattern <code>(#[1-9][0-9]*)*</code>
     */
    public FeatureBuilder setFeatureGroup(String group) {
        String pattern = "(#[1-9][0-9]*)*";
        if (!group.matches(pattern)) {
            throw new IllegalArgumentException(group
                + " does not match pattern "
                + pattern);
        }
        feature.setGroup(group);
        return this;
    }

    /**
     * @param minimumTrustLevel
     *     the minimum trust level needed to access the feature
     * @return the updated <code>FeatureBuilder</code>
     */
    public FeatureBuilder setMinimumTrustLevel(String minimumTrustLevel) {
        feature.setMinimumTrustLevel(minimumTrustLevel);
        return this;
    }

    /**
     * Sets the permissions required to access, bind to and subscribe to the new
     * SPINE feature.
     *
     * @param featurePermission
     *     the rules for binding and subscription requests
     * @return the updated <code>FeatureBuilder</code>
     */
    public FeatureBuilder setFeaturePermission(FeaturePermission featurePermission) {
        feature.setFeaturePermission(featurePermission);
        return this;
    }

    /**
     * Builds this feature and adds it to the parent entity.
     *
     * @return the updated parent <code>EntityBuilder</code>
     * @throws IncompleteBuildException
     *     If mandatory information was not set
     *     ({@link #setType(FeatureTypeEnumType)}, {@link #setRole(RoleType)})
     * @throws UnsupportedOperationException
     *     If this FeatureBuilder was not created by
     *     {@link EntityBuilder#addFeature()}
     */
    public EntityBuilder apply() throws IncompleteBuildException {
        if (entityBuilder == null) {
            throw new UnsupportedOperationException();
        }
        if (!feature.isCompleted()) {
            throw new IncompleteBuildException(
                "Feature could not be built due to missing required information");
        }
        entityBuilder.addFeature(feature);
        return entityBuilder;
    }

    /**
     * Builds the SPINE feature. The new feature can then be added to a SPINE entity
     * at runtime with {@link Entity#addFeature(Feature)}
     * <br>
     * If mandatory information was not set ({@link #setType(FeatureTypeEnumType)},
     * {@link #setRole(RoleType)}) this operation throws an
     * <code>IncompleteBuildException</code>.
     *
     * @return the built SPINE feature
     * @throws IncompleteBuildException
     *     when the feature type and/or role was not set
     */
    public Feature build() throws IncompleteBuildException {
        if (!feature.isCompleted()) {
            throw new IncompleteBuildException(
                "Feature could not be built due to missing required information");
        }
        return feature;
    }
}
