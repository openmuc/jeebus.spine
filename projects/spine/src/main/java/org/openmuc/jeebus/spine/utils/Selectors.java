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
import org.openmuc.jeebus.spine.api.options.ReadListCmdOption;
import org.openmuc.jeebus.spine.spi.AdditionalSelectorCondition;
import org.openmuc.jeebus.spine.spi.AdditionalSelectorConditions;
import org.openmuc.jeebus.spine.spi.function.ListFeatureFunctionTypeInfo;
import org.openmuc.jeebus.spine.utils.datatypes.Pair;
import org.openmuc.jeebus.spine.xsd.v1.MeasurementDescriptionDataType;
import org.openmuc.jeebus.spine.xsd.v1.MeasurementDescriptionListDataSelectorsType;

import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Utility class for working with selector types.
 */
public class Selectors {
    /**
     * disabled - utility class
     */
    private Selectors() {
    }

    /**
     * This method simplifies checking if values fit for a given selector. If a
     * selectorValue is null it is seen as not set and thus returns true.
     *
     * @param selector
     *     the value of the selector
     * @param actual
     *     the value of the element to compare to
     * @param <V>
     *     must be the same type
     * @return true if selector fits or if selector value is null
     */
    public static <V> boolean selectorFits(V selector, V actual) {
        return selector == null || Objects.equals(selector, actual);
    }

    /**
     * Splits given list into two new lists: elements of given type, and classes of
     * elements that didn't match.
     *
     * @param elements
     *     List to search through
     * @param selectorClass
     *     class to search for
     * @param <T>
     *     Type of elements to search for.
     * @return Classes of elements that didn't match, and elements that were found.
     * Either or both might be empty.
     */
    public static <T> Pair<List<Class<?>>, List<T>> splitByType(
        List<? super T> elements,
        Class<? extends T> selectorClass
    ) {
        List<T> foundInstances = new ArrayList<>();
        List<Class<?>> incorrectInstances = new ArrayList<>();
        elements.forEach(val -> {
            if (selectorClass.isInstance(val)) {
                foundInstances.add(selectorClass.cast(val));
            }
            else {
                incorrectInstances.add(val.getClass());
            }
        });
        return Pair.of(incorrectInstances, foundInstances);
    }

    /**
     * Generate a SpineException for illegal filter selectors.
     *
     * @param illegalSelectors
     *     the list of illegal filter selectors
     * @param expected
     *     the type of selector we were expecting
     * @return a SpineException complaining about illegal filter selectors, or null
     * if there were none.
     */
    public static SpineException errorForIllegalSelectors(
        List<Class<?>> illegalSelectors,
        String expected
    ) {
        if (!illegalSelectors.isEmpty()) {
            String fragment = illegalSelectors
                .stream()
                .map(Class::getSimpleName)
                .collect(Collectors.joining(", "));
            return new SpineException(
                Error.COMMAND_REJECTED, "Expected " + expected
                + " Got illegal filter selectors (SPINE:5.3.2): " + fragment
            );
        }
        return null;
    }

    /**
     * This method receives a {@link PropertyDescriptor} of a selector and uses it to
     * check if the given data object matches the selector property value. The
     * selector property matches if one of the following conditions apply:
     * <ol>
     *     <li>For the selector attribute there is a data attribute with the same name and both values are equal
     *     ({@link Objects#equals(Object, Object)}).</li>
     *     <li>The selector attribute value is null, meaning the selector attribute is not used.</li>
     *     <li>For the selector attribute there is no data attribute with the same name. This may happen either for
     *     attributes that are only used for internal logic or for attributes that use different selector semantics.
     *     Use {@link AdditionalSelectorCondition} for this case.</li>
     * </ol>
     *
     * @param desc
     *     the PropertyDescriptor of the selector
     * @param selector
     *     the given selector
     * @param data
     *     the data object to check
     * @return true if the property matches the selector conditions
     */
    private static <DATA, SELECTOR> boolean propertyMatchesSelector(
        PropertyDescriptor desc,
        SELECTOR selector,
        DATA data,
        Class<DATA> dataType
    ) {

        try {
            Method selectorGetter = desc.getReadMethod();
            String getterName = selectorGetter.getName();
            Object dataValue = dataType.getMethod(getterName).invoke(data);
            Object selectorValue = selectorGetter.invoke(selector);
            if (Selectors.selectorFits(selectorValue, dataValue)) {
                return true;
            }
        }
        catch (NoSuchMethodException |
               IllegalAccessException |
               InvocationTargetException ignored) {
            return true;
        }
        return false;
    }

    /**
     * This method checks if the given data object matches any of the given
     * selectors. A match is defined by following conditions:
     * <ol>
     *     <li>The given {@link AdditionalSelectorCondition} returns true. </li>
     *     <li>For all attributes of the selector the {@link #propertyMatchesSelector} method returns true.</li>
     * </ol>
     *
     * @param data
     *     the data object to check
     * @param selectorList
     *     list of selectors to use
     * @param typeInfo
     *     RTTI object
     * @param <DATA>
     *     type of data to check
     * @param <SELECTOR>
     *     type of selector to check with
     * @return true if the given data object matches any of the given selectors
     */
    public static <DATA, SELECTOR>
    boolean dataMatchesAnySelector(
        DATA data, List<SELECTOR> selectorList,
        ListFeatureFunctionTypeInfo<DATA, ?, SELECTOR, ?> typeInfo
    ) {

        if (data == null) {
            return false;
        }

        // checks if there is any match for which a selector fits the given data object
        return selectorList.stream().anyMatch(selector -> {
            List<PropertyDescriptor> propertyDescriptors;
            try {
                propertyDescriptors = List.of(
                    Introspector
                        .getBeanInfo(typeInfo.getSelectorType(), Object.class)
                        .getPropertyDescriptors()
                );
            }
            catch (IntrospectionException e) {
                // should never happen
                throw new RuntimeException(e);
            }
            boolean additionalSelectorConditionFits
                = AdditionalSelectorConditions.isSelected(
                typeInfo.getDataType(),
                typeInfo.getSelectorType(), data, selector
            );
            // check if all attributes match the selector
            boolean matchCondition = propertyDescriptors
                .stream()
                .allMatch(desc -> propertyMatchesSelector(
                    desc, selector, data,
                    typeInfo.getDataType()
                ));

            return additionalSelectorConditionFits && matchCondition;
        });
    }

    /**
     * Takes a list of selectors and a list of fitting data class objects (e.g. List
     * of {@link MeasurementDescriptionListDataSelectorsType}) and
     * {@link MeasurementDescriptionDataType}). Returns a map of data with its
     * indices for the given data objects with all the data objects that fit for at
     * least one of the selectors.
     *
     * @param dataList
     *     list of data to select from
     * @param selectorList
     *     list of selectors
     * @param typeInfo
     *     RTTI object
     * @param <DATA>
     *     type of data to select from
     * @param <SELECTOR>
     *     type of selector to use
     * @return map of the given data types with its indices that fit at least one
     * selector
     */
    public static <DATA, SELECTOR> Map<Integer, DATA> getSelectedData(
        List<DATA> dataList,
        List<SELECTOR> selectorList,
        ListFeatureFunctionTypeInfo<DATA, ?, SELECTOR, ?> typeInfo
    ) {

        Map<Integer, DATA> selectedDataIdxList = new HashMap<>();

        int idx = 0;
        for (DATA data : dataList) {

            if (selectorList.isEmpty() || dataMatchesAnySelector(
                data,
                selectorList,
                typeInfo
            )) {
                selectedDataIdxList.put(idx, data);
            }
            idx++;
        }
        return selectedDataIdxList;
    }

    public static <SELECTOR, ELEMENTS> ReadListCmdOption getReadListCmdOption(
        List<SELECTOR> selectorList,
        ELEMENTS elements
    ) {
        ReadListCmdOption readListCmdOption;
        if (selectorList.isEmpty()) {
            if (elements == null) {
                readListCmdOption = ReadListCmdOption.FULL_READ;
            }
            else {
                readListCmdOption = ReadListCmdOption.READ_ELEMENTS;
            }
        }
        else {
            if (elements == null) {
                readListCmdOption = ReadListCmdOption.READ_BY_SELECTOR;
            }
            else {
                readListCmdOption = ReadListCmdOption.READ_ELEMENTS_BY_SELECTOR;
            }
        }
        return readListCmdOption;
    }
}
