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

import org.openmuc.jeebus.spine.impl.DeviceBuilder;
import org.openmuc.jeebus.spine.impl.EntityBuilder;
import org.openmuc.jeebus.spine.spi.UseCase;
import org.openmuc.jeebus.spine.xsd.v1.EntityAddressType;
import org.openmuc.jeebus.spine.xsd.v1.EntityTypeEnumType;
import org.openmuc.jeebus.spine.xsd.v1.FeatureAddressType;

import java.util.Collection;

public interface Entity extends EntityParent {
    /**
     * The returned builder builds a SPINE entity which can be added to an existing
     * SPINE device at runtime with {@link Device#addEntity(Entity)}.
     * <br>
     * This method shall not be used to set up a device with an entity. For this
     * purpose {@link DeviceBuilder#addEntity()} shall be used.
     *
     * @return a new <code>EntityBuilder</code> object to create a new SPINE entity
     */
    static EntityBuilder getBuilder() {
        return new EntityBuilder();
    }

    /**
     * Returns the address of this entity relative to the parent device.
     * <br>
     * The list returned by {@link EntityAddressType#getEntity()} contains the
     * address parts of all entity parents in order
     *
     * @return the entity address
     */
    EntityAddressType getStaticAddress();

    /**
     * Returns the complete address of this entity, its parent entities and device.
     * <br>
     * The list returned by {@link EntityAddressType#getEntity()} contains the
     * address parts of all entity parents in order
     *
     * @return the entity address
     */
    EntityAddressType getAddress();

    /**
     * @return the type of this entity
     */
    EntityTypeEnumType getType();

    /**
     * @return true if this entity has a description set and false otherwise
     */
    boolean hasDescription();

    /**
     * @return true if this entity has a label set and false otherwise
     */
    boolean hasLabel();

    /**
     * @return the description set or the empty string if no label was set
     */
    String getDescription();

    /**
     * Adds a feature to this entity at runtime. After the feature was added the
     * {@link NodeManagement} instance notifies subscribers about the change.
     *
     * @param feature
     *     the feature built with {@link Feature#getBuilder()}
     * @return the feature address part of the added feature
     */
    int addFeature(Feature feature);

    /**
     * @param address
     *     the feature address part of the feature address
     *     {@link FeatureAddressType#getFeature()}. Note that this implementation
     *     limits feature addresses to {@link Integer#MAX_VALUE}
     * @return the feature with the given address
     * @throws SpineException
     *     when no feature with the given address exists
     */
    Feature getFeature(int address) throws SpineException;

    /**
     * @param address
     *     the feature address part of the feature address
     *     {@link FeatureAddressType#getFeature()}. Note that this implementation
     *     limits feature addresses to {@link Integer#MAX_VALUE}
     * @throws SpineException
     *     when no feature with the given address exists
     */
    void deleteFeature(int address) throws SpineException;

    /**
     * @return all features of this entity excluding features of sub-entities
     */
    Collection<Feature> getFeatures();

    /**
     * @return the label set or the empty string if no label was set
     */
    String getLabel();

    /**
     * Add a use case to this entity. This will also add any features and functions needed by the use case (declared via
     * {@link UseCase#getFeatureRequirements(EntityTypeEnumType)}) and fill any {@link org.openmuc.jeebus.spine.spi.Inject}
     * fields of the use case.
     * @param useCase the use case to add.
     */
    void addUseCase(UseCase useCase);
}
