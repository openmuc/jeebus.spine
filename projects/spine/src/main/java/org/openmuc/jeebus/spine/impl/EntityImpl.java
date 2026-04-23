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

import org.openmuc.jeebus.spine.api.Error;
import org.openmuc.jeebus.spine.api.*;
import org.openmuc.jeebus.spine.spi.*;
import org.openmuc.jeebus.spine.spi.function.FeatureFunction;
import org.openmuc.jeebus.spine.utils.datatypes.Pair;
import org.openmuc.jeebus.spine.xsd.v1.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

class EntityImpl implements Entity, EntityParent {
    private static final Logger LOGGER = LoggerFactory.getLogger(Entity.class);

    private final EntityAddressType address = new EntityAddressType();
    private final List<Entity> subEntities = new ArrayList<>();
    private final List<Feature> features = new ArrayList<>();
    //private final TypeBasedMap<Feature> featuresByType = new TypeBasedMap<Feature>(Feature.class);
    private final Map<FeatureTypeEnumType, Feature> featuresMap = new HashMap<>();
    // fill gaps in list, when features are removed
    // note: if the resulting address re-use causes problems this setup should be switched to a map
    // rather than a dense list
    private final Queue<Integer> nextEntityId = new PriorityQueue<>();
    private final Queue<Integer> nextFeatureId = new PriorityQueue<>();
    private EntityTypeEnumType entityType;
    private EntityParent parent;
    private String label = "";
    private String description = "";
    private NetworkManagementStateChangeType lastStateChange = null;

    EntityImpl() {}

    @Override
    public int addEntity(Entity entity) {
        int id;
        if (nextEntityId.isEmpty()) {
            subEntities.add(entity);
            id = subEntities.size() - 1;
        }
        else {
            id = nextEntityId.remove();
            subEntities.set(id, entity);
        }
        ((EntityImpl) entity).setParent(this, id);
        if (parent != null) {
            ((NodeManagementImpl) getDevice().getNodeManagement()).entityAdded((EntityImpl) entity);
        }
        return id;
    }

    @Override
    public Entity getEntity(int index) throws SpineException {
        try {
            return subEntities.get(index);
        }
        catch (IndexOutOfBoundsException e) {
            throw new SpineException(
                Error.DESTINATION_UNKNOWN,
                "Requested entity does not exist."
            );
        }
    }

    @Override
    public void deleteEntity(int address) throws SpineException {
        Entity entity;
        try {
            entity = subEntities.set(address, null);
            if (address == subEntities.size()-1) {
                subEntities.remove(address);
            } else {
                nextEntityId.add(address);
            }
        }
        catch (IndexOutOfBoundsException e) {
            throw new SpineException(
                Error.DESTINATION_UNKNOWN,
                "To be deleted entity does not exist."
            );
        }
        if (entity instanceof Shutdownable) {
            ((Shutdownable) entity).close();
        }
        if (parent != null) {
            ((NodeManagementImpl) getDevice().getNodeManagement()).entityRemoved(entity.getAddress());
        }
    }

    @Override
    public EntityParent getParent() {
        return parent;
    }

    @Override
    public Collection<Entity> getEntities() {
        return subEntities;
    }

    @Override
    public boolean isDevice() {
        return false;
    }

    @Override
    public Device getDevice() {
        return parent == null ? null : parent.getDevice();
    }

    void setParent(EntityParent parent, long id) {
        if (!parent.isDevice()) {
            address
                .getEntity()
                .addAll(0, ((EntityImpl) parent).getAddress().getEntity());
        }
        address.getEntity().add(id);
        for (Entity subEntity : subEntities) {
            ((EntityImpl) subEntity).completeAddress(address);
        }
        for (Feature feature : features) {
            ((FeatureImpl) feature).completeAddress(address);
        }
        this.parent = parent;
    }

    private void completeAddress(EntityAddressType address) {
        this.address.getEntity().addAll(0, address.getEntity());
        for (Entity subEntity : subEntities) {
            ((EntityImpl) subEntity).completeAddress(address);
        }
        for (Feature feature : features) {
            ((FeatureImpl) feature).completeAddress(address);
        }
    }

    @Override
    public EntityAddressType getStaticAddress() {
        return getAddress().withDevice(getDevice().getAddress().getDevice());
    }

    public EntityAddressType getAddress() {
        return address;
    }

    @Override
    public EntityTypeEnumType getType() {
        return entityType;
    }

    void setType(EntityTypeEnumType entityType) {
        this.entityType = entityType;
    }

    @Override
    public boolean hasDescription() {
        return !description.isEmpty();
    }

    @Override
    public boolean hasLabel() {
        return !label.isEmpty();
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public int addFeature(Feature feature) {
        FeatureImpl featureImpl = (FeatureImpl) feature;
        int id = addFeature(featureImpl);
        featureImpl.setParent(this, id);
        if (parent != null) {
            ((NodeManagementImpl) getDevice().getNodeManagement()).featureAdded(
                featureImpl.getAddress());
        }
        return id;
    }

    int addFeature(FeatureImpl feature) {
        int id;
        if (nextFeatureId.isEmpty()) {
            features.add(feature);
            id = features.size() - 1;
        }
        else {
            id = nextFeatureId.remove();
            features.set(id, feature);
        }
        // TODO check if this feature was already present and figure out what to do in that case
        // overwrite? error? warning? silently? exception?
        featuresMap.put(feature.getType(), feature);
        return id;
    }

    @Override
    public Feature getFeature(int address) throws SpineException {
        try {
            return features.get(address);
        }
        catch (IndexOutOfBoundsException e) {
            throw new SpineException(
                Error.DESTINATION_UNKNOWN,
                "Requested feature does not exist."
            );
        }
    }

    @Override
    public void deleteFeature(int address) throws SpineException {
        Feature feature;
        try {
//            feature = features.remove(address);
            feature = features.set(address, null);
            if (address == features.size()-1) {
                features.remove(address);
            } else {
                nextFeatureId.add(address);
            }
        }
        catch (IndexOutOfBoundsException e) {
            throw new SpineException(
                Error.DESTINATION_UNKNOWN,
                "To be deleted feature does not exist."
            );
        }
        featuresMap.remove(feature.getType());
        //featuresByType.removeValue(feature);
        if (parent != null) {
            ((NodeManagementImpl) getDevice().getNodeManagement()).featureRemoved(feature.getAddress());
        }
    }

    @Override
    public Collection<Feature> getFeatures() {
        return features;
    }

    @Override
    public String getLabel() {
        return label;
    }

    void setLabel(String label) {
        if (label.length() > 256) {
            LOGGER.warn(
                "Label has more than 256 characters. Receivers may shorten it."
            );
        }
        this.label = label;
    }

    void setDescription(String description) {
        if (description.length() > 4096) {
            LOGGER.warn(
                "Description has more than 4096 characters."
                    + " Receivers may shorten it."
            );
        }
        this.description = description;
    }

    boolean isCompleted() {
        return entityType != null;
    }

    boolean hasLastStateChange() {
        return lastStateChange != null;
    }

    NetworkManagementStateChangeType getLastStateChange() {
        return lastStateChange;
    }

    void setLastStateChange(NetworkManagementStateChangeType lastStateChange) {
        this.lastStateChange = lastStateChange;
    }

    /**
     * Add needed features and feature functions for a given use case, and also fill its {@link Inject} fields
     * @param useCase the use case whose requirements shall be satisfied
     */
    void addFeaturesForUseCase(UseCase useCase) {
        AllowedEntityTypes allowed = useCase.getClass().getAnnotation(AllowedEntityTypes.class);
        if (allowed == null) {
            LOGGER.debug("Missing allowed-entity-types annotation on use case {}, skipping check.", useCase.getClass().getSimpleName());
        } else if (!Arrays.asList(allowed.value()).contains(getType())) {
            throw new IllegalArgumentException(String.format("Use case %s does not allow entity type %s!", useCase.getClass().getSimpleName(), getType()));
        }

        Set<FeatureRequirement> requirements = useCase.getFeatureRequirements(entityType);
        requirements.forEach(this::satisfyFeatureRequirement);
        List<FeatureTypeEnumType> missingFeatures = UseCaseInjection.injectFeaturesIntoUseCase(useCase, this);
        boolean anyMissing = false;
        for (FeatureTypeEnumType missing : missingFeatures) {
            Optional<FeatureRequirement> match = requirements.stream().filter(req -> req.getFeatureType() == missing).findAny();
            if (match.isPresent()) {
                LOGGER.error("missing required feature of type {} (role {})", missing, match.get().getFeatureRole());
                anyMissing = true;
            }
        }
        if (anyMissing) {
            throw new IllegalStateException("Entity is missing features required by use case "+useCase+", this is a programmer error!");
        }

    }

    /**
     * Ensure that this entity satisfies the given feature requirement, by adding the feature if needed and creating the
     * feature functions if needed.
     * @param requirement the feature requirement to satisfy.
     */
    public void satisfyFeatureRequirement(FeatureRequirement requirement) {
        if (requirement.getFeatureType() == FeatureTypeEnumType.NODE_MANAGEMENT) {
            // node management has its own bespoke handling so we just skip it here
            return;
        }
        Pair<FeatureTypeEnumType, RoleType> key = Pair.of(requirement.getFeatureType(), requirement.getFeatureRole());
        Feature existing = featuresMap.get(requirement.getFeatureType());
        if (existing == null) {
            KnownFeatureInformation info = FeatureInformationService.getInstance().getFeatureInformation(requirement.getFeatureType());
            FeatureBuilder builder = Feature.getBuilder()
                    .setType(requirement.getFeatureType())
                    .setRole(requirement.getFeatureRole());
            if (info != null) builder.setFeaturePermission(info.defaultFeaturePermission());
            addFeature(existing = builder.build());
        } else if (existing.getRole() != requirement.getFeatureRole()) {
            LOGGER.warn("Use case expected feature <{} {}> but already present feature has wrong role {}!", requirement.getFeatureType(), requirement.getFeatureRole(), existing.getRole());
        }
        for (Class<? extends FeatureFunction> functionType : requirement.getFeatureFunctions()) {
            existing.getOrAddFunction(functionType);  // ignore return value, we're just creating it
        }
    }

    /**
     * Get the feature with specified type and role.
     *
     * @param type the feature type to look for
     * @return the feature with the given type and role, or null if absent.
     */
    public Feature getFeatureByType(FeatureTypeEnumType type) {
        return featuresMap.get(type);
    }

    @Override
    public void addUseCase(UseCase useCase) {
        addFeaturesForUseCase(useCase);
        useCase.setup();
        ((NodeManagementImpl) getDevice().getNodeManagement()).addUseCase(useCase);
        ((DeviceImpl) getDevice()).registerUseCase(this, useCase);
    }

    @Override
    public String toString() {
        return "EntityImpl{" +
                "address=" + address +
                ", subEntities=" + subEntities +
                ", features=" + features +
                ", label='" + label + '\'' +
                ", description='" + description + '\'' +
                ", entityType=" + entityType +
                '}';
    }
}
