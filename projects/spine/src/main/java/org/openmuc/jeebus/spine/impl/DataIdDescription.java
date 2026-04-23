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

import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Collectors;

public class DataIdDescription<DATA> {

    public enum IdValidationStatus {
        VALID_ID,
        IDS_NULL,
        INVALID
    }

    private final List<PropertyDescriptor> idAttributePropertyDescriptors;
    private final List<PropertyDescriptor> optionalSubIdAttributePropertyDescriptors;

    private final Class<DATA> dataType;

    public List<PropertyDescriptor> getIdAttributePropertyDescriptors() {
        return idAttributePropertyDescriptors;
    }

    public List<PropertyDescriptor> getOptionalSubIdAttributePropertyDescriptors() {
        return optionalSubIdAttributePropertyDescriptors;
    }

    public List<PropertyDescriptor> getAllIdPropertyDescriptors() {
        List<PropertyDescriptor> allIdList = new ArrayList<>(
            idAttributePropertyDescriptors);
        allIdList.addAll(optionalSubIdAttributePropertyDescriptors);
        return allIdList;
    }

    public Class<DATA> getDataType() {
        return dataType;
    }

    public static <D> DataIdDescription<D> getNoneIdentifiableDataDescription(Class<D> dataType) {
        return new DataIdDescription<>(dataType, new ArrayList<>());
    }

    /**
     * Defines the names of the attributes that uniquely identify data objects from a
     * Feature Function data list (SPINE protocol spec 5.3.4.6) and stores the
     * {@link PropertyDescriptor}s for each attribute.
     *
     * @param dataType
     *     type of the data
     * @param idNames
     *     list of mandatory primary and sub ids
     */
    public DataIdDescription(Class<DATA> dataType, List<String> idNames) {
        this(dataType, idNames, new ArrayList<>());
    }

    /**
     * Defines the names of the attributes that uniquely identify data objects from a
     * Feature Function data list (SPINE protocol spec 5.3.4.6) and optional sub
     * identifiers that may be used to sub identify a FeatureFunction and stores the
     * {@link PropertyDescriptor}s for each attribute. TODO add Foreign Identifier
     *
     * @param dataType
     *     type of the data
     * @param idNames
     *     list of mandatory primary and sub ids
     * @param optionalSubIdNames
     *     list of sub ids that are optional
     */
    public DataIdDescription(
        Class<DATA> dataType, List<String> idNames,
        List<String> optionalSubIdNames
    ) {
        this.dataType = dataType;
        this.idAttributePropertyDescriptors = new ArrayList<>();
        this.optionalSubIdAttributePropertyDescriptors = new ArrayList<>();
        List<PropertyDescriptor> propertyDescriptors;
        try {
            propertyDescriptors = List.of(
                Introspector.getBeanInfo(dataType).getPropertyDescriptors()
            );
        }
        catch (IntrospectionException e) {
            // should never happen
            throw new RuntimeException(e);
        }
        for (PropertyDescriptor desc : propertyDescriptors) {
            for (String id : idNames) {
                if (Objects.equals(desc.getName(), id)) {
                    this.idAttributePropertyDescriptors.add(desc);
                    break;
                }
            }
            for (String subId : optionalSubIdNames) {
                if (Objects.equals(desc.getName(), subId)) {
                    this.optionalSubIdAttributePropertyDescriptors.add(desc);
                    break;
                }
            }
        }
        // In case for any given id no propertyDescriptor was found
        if (this.idAttributePropertyDescriptors.size()
            + this.optionalSubIdAttributePropertyDescriptors.size()
            != idNames.size() + optionalSubIdNames.size()) {
            throw new IllegalArgumentException(
                "Invalid SPINE identifier initialized for dataType: "
                    + dataType.getName());
        }
    }

    private Object getValueFromDesc(PropertyDescriptor desc, DATA data) {
        Method getter;
        Object value;
        try {
            getter = desc.getReadMethod();
            value = getter.invoke(data);
        }
        catch (IllegalAccessException | InvocationTargetException e) {
            // Should never happen
            throw new RuntimeException(e);
        }
        return value;
    }

    /**
     * Validates if given data is valid for this id description.
     * <ul>
     *     <li>Return {@link IdValidationStatus#VALID_ID}: all mandatory ids are set and any number of optional sub
     *     ids are set</li>
     *     <li>Return {@link IdValidationStatus#IDS_NULL}: all mandatory and optional sub ids are null</li>
     *     <li>Return {@link IdValidationStatus#INVALID}: not all mandatory ids are set and not all ids are null</li>
     * </ul>
     * For invalid data return 2.
     *
     * @param data
     *     data to validate
     * @return if given data is valid for this id description.
     */
    public IdValidationStatus validateData(DATA data) {
        List<Object> idValues = idAttributePropertyDescriptors.stream()
            .map(desc -> getValueFromDesc(desc, data))
            .collect(Collectors.toList());

        List<Object> subIdValues = optionalSubIdAttributePropertyDescriptors.stream()
            .map(desc -> getValueFromDesc(desc, data))
            .collect(Collectors.toList());

        if (idValues.stream().anyMatch(Objects::nonNull)) {
            // if any mandatory id is defined all mandatory ids must be defined
            return idValues.stream().noneMatch(Objects::isNull) ?
                IdValidationStatus.VALID_ID :
                IdValidationStatus.INVALID;
        }
        else {
            // if no mandatory id is defined secondary id must also not be defined
            return subIdValues.stream().allMatch(Objects::isNull) ?
                IdValidationStatus.IDS_NULL :
                IdValidationStatus.INVALID;
        }
    }

    /**
     * Checks if the ids of writable match the ids of update. This also returns true
     * in any case if all ids of update are null.
     *
     * @param writable
     *     the writable
     * @param update
     *     the update for the writable
     * @return if the ids of writable match or all ids of update or ids of update are
     * all null
     */
    public boolean dataMatchesForIdDescription(DATA writable, DATA update) {

        if (writable == null) {
            return false;
        }

        AtomicBoolean updateHasNoId = new AtomicBoolean(true);
        boolean actualMatch = getAllIdPropertyDescriptors()
            .stream()
            .allMatch(desc -> {
                Method idGetter;
                Object writableIdValue;
                Object updateIdValue;
                try {
                    idGetter = desc.getReadMethod();
                    writableIdValue = idGetter.invoke(writable);
                    updateIdValue = idGetter.invoke(update);
                }
                catch (IllegalAccessException | InvocationTargetException e) {
                    // Should never happen
                    throw new RuntimeException(e);
                }
                if (updateIdValue != null) {
                    updateHasNoId.set(false);
                }
                return Objects.equals(writableIdValue, updateIdValue);
            });

        return actualMatch || updateHasNoId.get();
    }
}
