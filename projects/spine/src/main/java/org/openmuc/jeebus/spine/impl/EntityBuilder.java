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

import org.openmuc.jeebus.spine.api.Device;
import org.openmuc.jeebus.spine.api.Entity;
import org.openmuc.jeebus.spine.api.Feature;
import org.openmuc.jeebus.spine.api.IncompleteBuildException;
import org.openmuc.jeebus.spine.spi.UseCase;
import org.openmuc.jeebus.spine.xsd.v1.EntityAddressType;
import org.openmuc.jeebus.spine.xsd.v1.EntityTypeEnumType;

import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class EntityBuilder {

    private static final String ENTITY_INCOMPLETE_MESSAGE
        = "Entity could not be built due to missing required information";
    private final DeviceBuilder deviceBuilder;
    private final EntityImpl entity = new EntityImpl();
    private final EntityBuilder parentEntityBuilder;

    private final Set<UseCase> useCases = new HashSet<>();

    EntityBuilder(DeviceBuilder deviceBuilder) {
        parentEntityBuilder = null;
        this.deviceBuilder = deviceBuilder;
    }

    EntityBuilder(EntityBuilder entityBuilder) {
        deviceBuilder = null;
        this.parentEntityBuilder = entityBuilder;
    }

    public EntityBuilder() {
        deviceBuilder = null;
        parentEntityBuilder = null;
    }

    /**
     * This method must be called before calling {@link #applyToDevice()},
     * {@link #applyToEntity()} or {@link #build()}!
     *
     * @param entityType
     *     the type of the SPINE entity
     * @return the updated <code>EntityBuilder</code>
     */
    public EntityBuilder setType(EntityTypeEnumType entityType) {
        entity.setType(entityType);
        return this;
    }

    /**
     * Creates a new EntityBuilder instance. The sub-entity can then be fluently
     * added to this entity with {@link #applyToEntity()}
     *
     * @return a new EntityBuilder instance
     */
    public EntityBuilder addEntity() {
        return new EntityBuilder(this);
    }

    /**
     * Creates a new FeatureBuilder instance. The feature can then be fluently added
     * to this entity with {@link FeatureBuilder#apply()}.
     *
     * @return a new FeatureBuilder instance
     */
    public FeatureBuilder addFeature() {
        return new FeatureBuilder(this);
    }

    public EntityBuilder addFeature(Feature feature) {
        entity.addFeature(feature);
        return this;
    }

    /**
     * @param description
     *     a string describing the new SPINE entity
     * @return the updated <code>EntityBuilder</code>
     */
    public EntityBuilder setDescription(String description) {
        entity.setDescription(description);
        return this;
    }

    /**
     * @param label
     *     a human-readable alias of the new SPINE entity
     * @return the updated <code>EntityBuilder</code>
     */
    public EntityBuilder setLabel(String label) {
        entity.setLabel(label);
        return this;
    }

    /**
     * Builds this entity and adds it to the parent entity.
     * <br>
     * If this EntityBuilder was not created from another EntityBuilder this throws
     * <code>UnsupportedOperationException</code>.
     * <br>
     * If mandatory information was not set ({@link #setType(EntityTypeEnumType)})
     * this operation throws an
     * <code>IncompleteBuildException</code>.
     *
     * @return the updated parent <code>EntityBuilder</code>
     */
    public EntityBuilder applyToEntity() {
        if (parentEntityBuilder == null) {
            throw new UnsupportedOperationException();
        }
        if (!entity.isCompleted()) {
            throw new IncompleteBuildException(ENTITY_INCOMPLETE_MESSAGE);
        }
        completeUseCases();
        parentEntityBuilder.addEntity(entity);
        return parentEntityBuilder;
    }

    /**
     * Convenience method for calling {@link EntityBuilder#applyToDevice()} and
     * getting the address of the new {@link Entity}.
     *
     * @return the complete static {link {@link EntityAddressType}} of the new
     * {@link Entity}
     */
    public EntityAddressType applyAndGetStaticAddress() {
        this.applyToDevice();
        return entity.getStaticAddress();
    }

    void addEntity(Entity subEntity) {
        entity.addEntity(subEntity);
    }

    /**
     * Builds this entity and adds it to the parent device.
     * <br>
     * If this EntityBuilder was not created from a DeviceBuilder this throws
     * <code>UnsupportedOperationException</code>.
     * <br>
     * If mandatory information was not set ({@link #setType(EntityTypeEnumType)})
     * this operation throws an
     * <code>IncompleteBuildException</code>.
     *
     * @return the updated parent <code>DeviceBuilder</code>
     */
    public DeviceBuilder applyToDevice() {
        if (deviceBuilder == null) {
            throw new UnsupportedOperationException();
        }
        if (!entity.isCompleted()) {
            throw new IncompleteBuildException(ENTITY_INCOMPLETE_MESSAGE);
        }
        completeUseCases();
        deviceBuilder.addEntity(entity);
        return deviceBuilder;
    }

    /**
     * Add a use case that will run on this entity.
     * @param useCase The use case to add
     * @return this builder
     */
    public EntityBuilder addUseCase(UseCase useCase) {
        useCases.add(useCase);
        return this;
    }

    /**
     * Add several uses cases that will run on this entity
     * @param useCases the use cases to add
     * @return this builder
     */
    public EntityBuilder withUseCases(UseCase... useCases) {
        for (UseCase useCase : useCases) {
            addUseCase(useCase);
        }
        return this;
    }

    /**
     * Remove a use case previously added to this entity
     * @param useCase the use case to remove
     * @return this builder
     */
    public EntityBuilder removeUseCase(UseCase useCase) {
        useCases.remove(useCase);
        return this;
    }

    /**
     * Remove a use case previously added to this entity
     * @param name name of the use case to remove
     * @return this builder
     */
    public EntityBuilder removeUseCase(String name) {
        String lowerName = name.toLowerCase(Locale.ROOT);
        useCases.removeIf(u -> u.getName().toLowerCase(Locale.ROOT).equals(lowerName));
        return this;
    }

    /**
     * Remove a use case previously added to this entity
     * @param cls class of the use case to remove
     * @return this builder
     */
    public EntityBuilder removeUseCase(Class<? extends UseCase> cls) {
        useCases.removeIf(cls::isInstance);
        return this;
    }

    public long getLastAddedFeatureId() {
        return entity.getFeatures().size() - 1;
    }

    /**
     * Builds the SPINE entity. The new entity can then be added to a SPINE device or
     * entity at runtime with {@link Device#addEntity(Entity)} or
     * {@link Entity#addEntity(Entity)}
     * <br>
     * If mandatory information was not set ({@link #setType(EntityTypeEnumType)})
     * this operation throws and
     * <code>IncompleteBuildException</code>.
     *
     * @return the built SPINE entity
     * @throws IncompleteBuildException
     *     when the entity type was not set
     */
    public Entity build() throws IncompleteBuildException {
        if (!entity.isCompleted()) {
            throw new IncompleteBuildException(ENTITY_INCOMPLETE_MESSAGE);
        }
        completeUseCases();
        return entity;
    }

    /**
     * Actually add features needed for the use cases that will live on this entity
     */
    private void completeUseCases() {
        for (UseCase useCase : useCases) {
            entity.addFeaturesForUseCase(useCase);
            if (deviceBuilder != null) {
                deviceBuilder.addEntityUseCase(useCase, entity);
            }}
    }
}
