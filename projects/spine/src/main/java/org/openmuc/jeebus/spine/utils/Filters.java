/********************************************************************************
 * Copyright (c) 2026 Fraunhofer ISE
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 ********************************************************************************/

package org.openmuc.jeebus.spine.utils;

import org.openmuc.jeebus.spine.api.Error;
import org.openmuc.jeebus.spine.api.SpineException;
import org.openmuc.jeebus.spine.xsd.v1.CmdType;
import org.openmuc.jeebus.spine.xsd.v1.FilterType;

import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Utility class for working with {@link FilterType}s.
 */
public class Filters {
    /**
     * disabled - utility class
     */
    private Filters() {
    }

    /**
     * Get the Delete Filter of a given command. Throws Spine Exception if there is
     * more than one Delete Filter.
     *
     * @param cmd
     *     given command
     * @return the Partial Filter
     */
    public static FilterType getDeleteFilter(CmdType cmd) throws SpineException {
        List<FilterType> filterList = cmd.getFilter()
            .stream()
            .filter(item -> item.getCmdControl().getDelete() != null)
            .collect(Collectors.toList());
        if (filterList.size() > 1) {
            throw new SpineException(
                Error.COMMAND_REJECTED,
                "Given CmdType has more than one Delete Filter"
            );
        }
        else {
            return filterList.size() == 1 ? filterList.get(0) : null;
        }
    }

    /**
     * Get the Partial Write Filter of a given command. Throws Spine Exception if
     * there is more than one Partial Filter.
     *
     * @param cmd
     *     given command
     * @return the Partial Filter
     * @throws SpineException
     *     if there is more than one filter
     */
    public static FilterType getPartialWriteFilter(CmdType cmd) throws
        SpineException {
        List<FilterType> filterList = cmd.getFilter()
            .stream()
            .filter(item -> item.getCmdControl().getPartial() != null)
            .collect(Collectors.toList());
        if (filterList.size() > 1) {
            throw new SpineException(
                Error.COMMAND_REJECTED,
                "Given CmdType has more than one Partial Filter"
            );
        }
        else {
            return filterList.size() == 1 ? filterList.get(0) : null;
        }
    }

    /**
     * Finds the selectors list of the given type for a given selector type.
     *
     * @param filter
     *     filter to get the selectors from
     * @param selectorType
     *     class object for {@link SELECTOR}
     * @param <SELECTOR>
     *     the type of selector to look for
     * @return the list of selectors of the given type
     */
    @SuppressWarnings("unchecked")
    public static <SELECTOR> List<SELECTOR> getSelectors(
        FilterType filter,
        Class<SELECTOR> selectorType
    ) {

        PropertyDescriptor selectorsObjectDesc
            = getSelectorsPropertyDescriptor(filter, selectorType)
            .orElseThrow(() -> new IllegalArgumentException(
                "class " + selectorType + " is not a valid selectorType class")
            );

        try {
            return (List<SELECTOR>) selectorsObjectDesc
                .getReadMethod()
                .invoke(filter);
        }
        catch (IllegalAccessException | InvocationTargetException e) {
            // should never happen
            throw new RuntimeException(e);
        }
    }

    private static <SELECTOR> Optional<PropertyDescriptor> getSelectorsPropertyDescriptor(
        FilterType filter,
        Class<SELECTOR> selectorType
    ) {
        if (filter == null) {
            throw new IllegalArgumentException("filter must not be null");
        }

        List<PropertyDescriptor> propertyDescriptors;
        try {
            propertyDescriptors = List.of(
                Introspector.getBeanInfo(filter.getClass()).getPropertyDescriptors()
            );
        }
        catch (IntrospectionException e) {
            // should never happen
            throw new RuntimeException(e);
        }

        String simpleName = selectorType.getSimpleName();
        String fieldName = simpleName.substring(0, 1).toLowerCase()
            + simpleName.substring(1, simpleName.length() - 4);

        return propertyDescriptors
            .stream()
            .filter(desc ->
                Objects.equals(desc.getPropertyType(), List.class)
                    /* This is ugly. However, due to java type erasure we cannot access
                     * generic type information at runtime with the Introspector. */
                    && Objects.equals(fieldName, desc.getName())
            )
            .findFirst();
    }

    /**
     * Finds the elements object of the given type for a given {@link FilterType}.
     * Can be null.
     *
     * @param filter
     *     the filter to search in
     * @param elementsType
     *     class object for {@link ELEMENTS}
     * @param <ELEMENTS>
     *     the type of elements to look for
     * @return the elements object of the given type, can be null
     */
    @SuppressWarnings("unchecked")
    public static <ELEMENTS> ELEMENTS getElementsObject(
        FilterType filter,
        Class<ELEMENTS> elementsType
    ) {
        List<PropertyDescriptor> propertyDescriptors;
        try {
            propertyDescriptors = List.of(
                Introspector
                    .getBeanInfo(filter.getClass(), Object.class)
                    .getPropertyDescriptors()
            );
        }
        catch (IntrospectionException e) {
            // should never happen
            throw new RuntimeException(e);
        }
        PropertyDescriptor elementsObjectDesc = propertyDescriptors
            .stream()
            .filter(desc -> desc.getPropertyType().equals(elementsType))
            .findFirst()
            .orElseThrow(() -> new IllegalArgumentException(
                "class " + elementsType + " is not a valid elementsType class"));

        try {
            return (ELEMENTS) elementsObjectDesc.getReadMethod().invoke(filter);
        }
        catch (IllegalAccessException | InvocationTargetException e) {
            // should never happen
            throw new RuntimeException(e);
        }

    }
}
