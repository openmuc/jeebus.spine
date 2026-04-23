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
import org.openmuc.jeebus.spine.spi.FeatureType;
import org.openmuc.jeebus.spine.api.FeatureWrapper;
import org.openmuc.jeebus.spine.spi.Inject;
import org.openmuc.jeebus.spine.spi.UseCase;
import org.openmuc.jeebus.spine.spi.function.FeatureFunction;
import org.openmuc.jeebus.spine.spi.function.StandardFunctionType;
import org.openmuc.jeebus.spine.xsd.v1.FeatureTypeEnumType;
import org.openmuc.jeebus.spine.xsd.v1.FunctionEnumType;
import org.openmuc.jeebus.spine.xsd.v1.RoleType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Looks for {@link Inject} fields in use cases and pushes the appropriate data into them.
 */
public final class UseCaseInjection {
    private static final Logger LOGGER = LoggerFactory.getLogger(UseCaseInjection.class);
    private static final Map<Class<?>, UseCaseInjection> fieldsToInject = new ConcurrentHashMap<>();

    final Map<FeatureFunctionKey, Set<Field>> featureFunctionFields;
    final Map<Inject, Set<Field>> featureFields;
    final Set<Field> featureWrapperFields;
    final Field entityField;

    private UseCaseInjection(Map<FeatureFunctionKey, Set<Field>> featureFunctionFields, Map<Inject, Set<Field>> featureFields, Set<Field> featureWrapperFields, Field entityField) {
        this.featureFunctionFields = featureFunctionFields;
        this.featureFields = featureFields;
        this.featureWrapperFields = featureWrapperFields;
        this.entityField = entityField;
    }

    private static class FeatureFunctionKey {
        final Class<? extends FeatureFunction> functionClass;
        final FunctionEnumType functionType;
        final FeatureTypeEnumType featureType;
        final RoleType role;

        private FeatureFunctionKey(Class<? extends FeatureFunction> functionClass, FunctionEnumType functionType, FeatureTypeEnumType featureType, RoleType role) {
            this.functionClass = functionClass;
            this.functionType = functionType;
            this.featureType = featureType;
            this.role = role;
        }

        @Override
        public boolean equals(Object o) {
            if (!(o instanceof FeatureFunctionKey)) return false;
            FeatureFunctionKey that = (FeatureFunctionKey) o;
            return Objects.equals(functionClass, that.functionClass) && functionType == that.functionType && featureType == that.featureType && role == that.role;
        }

        @Override
        public int hashCode() {
            return Objects.hash(functionClass, functionType, featureType, role);
        }
    }

    /**
     * Look through the given use case, find all fields with an {@link Inject} annotation, and push the appropriate
     * data into them.
     * @param useCase the use case that will be injected with data
     * @param entity the entity from which the data will be sourced
     * @return feature types for which an {@link Inject} annotation requested data, but it was not present on the entity
     */
    static List<FeatureTypeEnumType> injectFeaturesIntoUseCase(UseCase useCase, EntityImpl entity) {
        return getInjectableFields(useCase.getClass()).inject(useCase, entity);
    }

    /**
     * Actually inject the data from an entity into a use case.
     * @param useCase the use case that will be injected with data
     * @param entity the entity from which the data will be sourced
     * @return feature types for which an {@link Inject} annotation requested data, but it was not present on the entity
     */
    private List<FeatureTypeEnumType> inject(UseCase useCase, EntityImpl entity) {
        injectEntity(useCase, entity);
        List<FeatureTypeEnumType> missing = injectFunctions(useCase, entity);
        missing.addAll(injectFeatures(useCase, entity));
        missing.addAll(injectFeatureWrappers(useCase, entity));
        return missing;
    }

    /**
     * Inject the entity itself into the {@code @Inject Entity} field
     * @param useCase the use case that is being injected
     * @param entity the entity to add
     */
    private void injectEntity(UseCase useCase, EntityImpl entity) {
        if (entityField != null) {
            try {
                entityField.set(useCase, entity);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);  // hopefully we catch these before we get here
            }
        } else {
            LOGGER.info("Missing @Inject Entity field!");
        }
    }

    /**
     * Inject the feature functions into {@code @Inject SpecificFeatureFunctionClass} fields.
     * @param useCase the use case being injected
     * @param entity the entity bearing the feature function
     * @return feature types for which there was an {@link Inject} annotation but the entity did not have that feature
     */
    private ArrayList<FeatureTypeEnumType> injectFunctions(UseCase useCase, EntityImpl entity) {
        ArrayList<FeatureTypeEnumType> missingFeatures = new ArrayList<>();
        for (Map.Entry<FeatureFunctionKey, Set<Field>> entry : featureFunctionFields.entrySet()) {
            FeatureFunctionKey key = entry.getKey();
            Class<? extends FeatureFunction> functionClass = key.functionClass;
            // NPE = programmer error (missing annotation) = crash desired
            FeatureTypeEnumType featureType = key.featureType;
            FeatureImpl feature = (FeatureImpl) entity.getFeatureByType(featureType);
            if (feature == null) {
                LOGGER.warn("Could not find feature with type {} for injection, skipping!", featureType);
                missingFeatures.add(featureType);
                continue;
            }
            Optional<? extends FeatureFunction> function = feature.getFunction(functionClass);
            if (function.isEmpty()) continue;
            for (Field field : entry.getValue()) {
                try {
                    field.set(useCase, function.get());
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);  // hopefully we catch these before we get here
                }
            }
        }
        return missingFeatures;
    }

    /**
     * Inject features into the {@code @Inject(FeatureTypeEnumType.FOO) Feature} fields.
     * @param useCase the use case being injected
     * @param entity the entity bearing the features
     * @return feature types for which there was an {@link Inject} annotation but the entity did not have that feature
     */
    private List<FeatureTypeEnumType> injectFeatures(UseCase useCase, EntityImpl entity) {
        ArrayList<FeatureTypeEnumType> missing = new ArrayList<>();
        for (var entry : featureFields.entrySet()) {
            Inject annotation = entry.getKey();
            FeatureTypeEnumType featureType = annotation.value();
            Feature feature = entity.getFeatureByType(featureType);
            if (feature == null) {
                missing.add(featureType);
                continue;
            }
            for (Field field : entry.getValue()) {
                try {
                    field.set(useCase, feature);
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);  // hopefully we catch these before we get here
                }
            }
        }
        return missing;
    }

    /**
     * Inject feature wrappers into the {@code @Inject SpecificFeatureWrapperClass} fields.
     * @param useCase the use case being injected
     * @param entity the entity bearing the features
     * @return feature types for which there was an {@link Inject} annotation but the entity did not have that feature
     */
    private List<FeatureTypeEnumType> injectFeatureWrappers(UseCase useCase, EntityImpl entity) {
        List<FeatureTypeEnumType> missing = new ArrayList<>();
        for (Field fld : featureWrapperFields) {
            FeatureType annotation = fld.getType().getAnnotation(FeatureType.class);
            if (annotation == null) {
                LOGGER.warn("Missing @FeatureType annotation on class {}, can't inject!", fld.getType());
                continue;
            }
            Feature feature = entity.getFeatureByType(annotation.value());
            if (feature == null) {
                missing.add(annotation.value());
                continue;
            }
            FeatureWrapper wrapper = feature.getFeatureWrapper();
            if (!fld.getType().isInstance(wrapper)) {
                throw new IllegalStateException();
            }
            try {
                fld.set(useCase, wrapper);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);    // hopefully we catch these before we get here
            }
        }
        return missing;
    }

    /**
     * Look up the injectable field information for a given use case class, or create it if not present.
     * @param useCaseClass a use case class
     * @return a collection of {@link Inject}-annotated fields and their metadata.
     */
    private static UseCaseInjection getInjectableFields(Class<? extends UseCase> useCaseClass) {
        return fieldsToInject.computeIfAbsent(useCaseClass, UseCaseInjection::scanUseCaseFields);
    }

    /**
     * Scan a class for {@link Inject}-annotated fields and collect the results.
     * @param useCaseClass the class to scan
     * @return a collection of {@link Inject}-annotated fields and their metadata.
     */
    private static UseCaseInjection scanUseCaseFields(Class<?> useCaseClass) {
        Field entityField = null;
        Map<FeatureFunctionKey, Set<Field>> featureFunctionFields = new HashMap<>();
        Map<Inject, Set<Field>> featureFields = new HashMap<>();
        Set<Field> featureWrapperFields = new HashSet<>();

        for (Class<?> current = useCaseClass; current != Object.class; current = current.getSuperclass()) {
            Field[] classFields = current.getDeclaredFields();
            // find all the injectable fields, check they're correct, and store them for the next call
            // done all in this method so that we only have to do a single traversal over the fields
            for (Field field : classFields) {
                Inject annotation = field.getAnnotation(Inject.class);
                if (annotation == null) continue;
                if (field.getType() == Entity.class) {
                    entityField = field;
                } else if (field.getType() == Feature.class) {
                    featureFields.computeIfAbsent(annotation, _k -> new HashSet<>()).add(field);
                } else if (FeatureFunction.class.isAssignableFrom(field.getType())) {
                    @SuppressWarnings("unchecked")  // ^^^^^^^ checked right there
                    Class<? extends FeatureFunction> functionClass = (Class<? extends FeatureFunction>) field.getType();
                    StandardFunctionType functionAnnotation = functionClass.getAnnotation(StandardFunctionType.class);
                    if (functionAnnotation == null) {
                        throw new RuntimeException("Function class " + functionClass.getSimpleName() + " is missing @StandardFunctionType annotation!");
                    }
                    FeatureFunctionKey key = new FeatureFunctionKey(functionClass, functionAnnotation.type(), functionAnnotation.featureType(), annotation.role());
                    featureFunctionFields.computeIfAbsent(key, _k -> new HashSet<>()).add(field);
                } else if (FeatureWrapper.class.isAssignableFrom(field.getType())) {
                    // ^^^^^^^ checked right there
                    featureWrapperFields.add(field);
                } else {
                    LOGGER.warn("@Inject annotation found on field {}, but its type has no defined inject behavior!", field);
                    continue;
                }
                checkFieldIsValid(field);
                field.setAccessible(true);
            }
            // if we got here then none of the checkFieldIsValid calls had a complaint
        }
        return fromCollections(featureFunctionFields, featureFields, featureWrapperFields, entityField);
    }

    /**
     * Wrapper around {@link UseCaseInjection#UseCaseInjection(Map, Map, Set, Field)} that makes sure to freeze the
     * collections first.
     * @param featureFunctionFields the fields that will receive a feature function
     * @param featureFields the fields that will receive a feature
     * @param featureWrapperFields the fields that will receive a feature wrapper
     * @param entityField the field that will receive the entity
     * @return a record of all the injectable fields
     */
    private static UseCaseInjection fromCollections(
            Map<FeatureFunctionKey, Set<Field>> featureFunctionFields,
            Map<Inject, Set<Field>> featureFields,
            Set<Field> featureWrapperFields,
            Field entityField
    ) {
        for (var entry : featureFunctionFields.entrySet()) {
            entry.setValue(Collections.unmodifiableSet(entry.getValue()));
        }
        featureFunctionFields = Collections.unmodifiableMap(featureFunctionFields);
        for (var entry : featureFields.entrySet()) {
            entry.setValue(Collections.unmodifiableSet(entry.getValue()));
        }
        featureFields = Collections.unmodifiableMap(featureFields);
        featureWrapperFields = Collections.unmodifiableSet(featureWrapperFields);
        return new UseCaseInjection(featureFunctionFields, featureFields, featureWrapperFields, entityField);
    }

    /**
     * Check that the given field is valid, i.e. not final.
     *
     * @param field the field to check
     */
    static private void checkFieldIsValid(Field field) {
        int mods = field.getModifiers();
        if (Modifier.isFinal(mods)) {
            throw new IllegalArgumentException("Field " + field + " with @Inject annotation is final!");
        }
    }

}
