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

import org.openmuc.jeebus.spine.xsd.v1.CmdType;
import org.openmuc.jeebus.spine.xsd.v1.ElementTagType;

import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static java.util.stream.Collectors.toList;

/**
 * Utility class that bundles methods for generically copying, comparing, and writing
 * to generated SPINE objects.
 * <p>
 * Generics should be instantiated to generated SPINE objects only.
 */
public final class SpineObjects {
    /**
     * See <a
     * href=https://jakarta.ee/specifications/xml-binding/3.0/jakarta-xml-binding-spec-3.0.pdf#page=76>
     * jakarta-xml-binding (page 76/77)</a> for base types, where primitives are
     * always Objects here. Calendar and Duration are abstract, so they must be
     * checked differently than the others but are here for completion.
     */
    private static final List<Class<?>> BASE_DATA_TYPES = List.of(
        String.class,
        BigInteger.class,
        Integer.class,
        Long.class,
        Short.class,
        BigDecimal.class,
        Float.class,
        Double.class,
        Boolean.class,
        Byte.class,
        QName.class,
        XMLGregorianCalendar.class,
        Duration.class
    );

    /**
     * Utility class - no construction allowed
     */
    private SpineObjects() {
    }

    /**
     * This method copies the given data object but only sets elements (attributes)
     * that are tagged by the given elements.
     *
     * @param data
     *     the data object to copy
     * @param elements
     *     the elements that tags elements (attributes) to include
     * @param <T>
     *     data object type
     * @return a copy of the given data object that only holds tagged elements
     * (attributes)
     */
    @SuppressWarnings("unchecked")
    public static <T> T createNewDataWithTaggedElements(T data, Object elements) {
        {
            T newData;
            List<PropertyDescriptor> propertyDescriptors;
            try {
                newData = (T) data.getClass().getDeclaredConstructor().newInstance();
                propertyDescriptors = List.of(Introspector
                    .getBeanInfo(elements.getClass(), Object.class)
                    .getPropertyDescriptors());
            }
            catch (
                IntrospectionException |
                InvocationTargetException |
                InstantiationException |
                IllegalAccessException |
                NoSuchMethodException e
            ) {
                throw new RuntimeException(e);
            }
            propertyDescriptors.forEach(desc -> addTaggedElementsToNewData(
                desc,
                elements,
                data,
                newData
            ));
            return newData;
        }
    }

    /**
     * This method adds the given element (property) that is described by a
     * {@link PropertyDescriptor} to the given newData object if it is tagged by the
     * given elements. If the given property is of another type the
     * {@link SpineObjects#createNewDataWithTaggedElements(Object, Object)} method is
     * called (recursive) to again add all tagged elements for the object.
     *
     * @param desc
     *     the PropertyDescriptor that describes the element to add
     * @param elements
     *     the elements that tags elements (attributes) to include
     * @param data
     *     the old data object that is used to copy data from
     * @param newData
     *     the new data object to which the element (property) should be added
     * @param <T>
     *     data object type
     */
    private static <T> void addTaggedElementsToNewData(
        PropertyDescriptor desc, Object elements, T data,
        T newData
    ) {
        try {
            Method elementsGetter = desc.getReadMethod();
            Method elementsSetter = desc.getWriteMethod();

            Object elementsValue = elementsGetter.invoke(elements);
            if (elementsValue == null) {
                return;
            }

            Method selectedValueMethod = data
                .getClass()
                .getMethod(elementsGetter.getName());

            Object selectedValue = selectedValueMethod.invoke(data);

            if (!elementsValue.getClass().equals(ElementTagType.class)) {
                selectedValue = createNewDataWithTaggedElements(
                    selectedValue,
                    elementsValue
                );
            }
            if (XMLGregorianCalendar.class.isAssignableFrom(selectedValueMethod.getReturnType())) {
                // clone for deep copy, all other data types are immutable
                selectedValue = ((XMLGregorianCalendar) selectedValue).clone();
            }
            newData.getClass()
                .getMethod(
                    elementsSetter.getName(),
                    selectedValueMethod.getReturnType()
                )
                .invoke(newData, selectedValue);

        }
        catch (NoSuchMethodException |
               IllegalAccessException |
               InvocationTargetException e) {
            // should never happen
            throw new RuntimeException(e);
        }
    }

    /**
     * This method writes the given elements type by creating a
     * {@link ElementTagType} for every attribute that is null in the update and not
     * null in the old data. This is to be used to notify deletion of elements. The
     * method is recursive for attributes of the elements type that are not of type
     * {@link ElementTagType}. The first call of this method should always use an
     * instance of the {@code ELEMENTS} type and the given data should be of type
     * {@code DATA}.
     *
     * @param elements
     *     the elements type object to write
     * @param oldData
     *     the old data
     * @param updateData
     *     the new data
     * @return if any element was written
     */
    public static boolean writeDeleteElements(
        Object elements,
        Object oldData,
        Object updateData
    ) {
        boolean wasWritten = false;
        if (oldData.getClass() != updateData.getClass()) {
            throw new IllegalArgumentException(
                "Illegal call of writeDeleteElements with non equal data types.");
        }
        try {
            List<PropertyDescriptor> propertyDescriptors;
            propertyDescriptors = List.of(
                Introspector
                    .getBeanInfo(elements.getClass(), Object.class)
                    .getPropertyDescriptors()
            );
            for (PropertyDescriptor desc : propertyDescriptors) {
                Class<?> type = desc.getPropertyType();

                Method elementsGetter = desc.getReadMethod();

                Method elementsSetter = desc.getWriteMethod();

                Method dataGetter = oldData
                    .getClass()
                    .getMethod(elementsGetter.getName());

                Object oldSubData = dataGetter.invoke(oldData);
                Object subUpdateData = dataGetter.invoke(updateData);

                if (oldSubData == null) {
                    continue;
                }

                if (type == ElementTagType.class) {
                    if (subUpdateData == null) {
                        elementsSetter.invoke(elements, new ElementTagType());
                        wasWritten = true;
                    }
                }
                else {
                    Object subElements = elementsGetter
                        .getReturnType()
                        .getDeclaredConstructor()
                        .newInstance();
                    if (subUpdateData == null) {
                        // write all subElements
                        writeAllSubElements(subElements);
                        elementsSetter.invoke(elements, subElements);
                        wasWritten = true;
                    }
                    else {
                        boolean subElementsWasWritten = writeDeleteElements(
                            subElements,
                            oldSubData,
                            subUpdateData
                        );
                        if (subElementsWasWritten) {
                            elementsSetter.invoke(elements, subElements);
                            wasWritten = true;
                        }
                    }
                }
            }
        }
        catch (IntrospectionException | ReflectiveOperationException e) {
            // should never happen
            throw new RuntimeException(e);
        }

        return wasWritten;
    }

    /**
     * Takes an empty elementsType object and write all its attributes
     *
     * @param elements
     *     the elements type object
     */
    static void writeAllSubElements(Object elements) {
        try {
            List<PropertyDescriptor> propertyDescriptors;
            propertyDescriptors = List.of(
                Introspector
                    .getBeanInfo(elements.getClass(), Object.class)
                    .getPropertyDescriptors()
            );
            for (PropertyDescriptor desc : propertyDescriptors) {
                if (desc.getPropertyType() == ElementTagType.class) {
                    desc.getWriteMethod().invoke(elements, new ElementTagType());
                }
                else {
                    Object subElements = desc
                        .getPropertyType()
                        .getDeclaredConstructor()
                        .newInstance();
                    writeAllSubElements(subElements);
                    desc.getWriteMethod().invoke(elements, subElements);
                }
            }
        }
        catch (IntrospectionException | ReflectiveOperationException e) {
            // should never happen
            throw new RuntimeException(e);
        }
    }

    /**
     * Checks if data a equals data b. Shall only be used for generated SPINE
     * objects.
     *
     * @param a
     *     data object a
     * @param b
     *     data object b
     * @return if a and b are equals
     */
    public static boolean dataEquals(Object a, Object b) {

        if (a == null && b != null || a != null && b == null) {
            return false;
        }
        if (a == b) {
            return true;
        }
        if (a.getClass() != b.getClass()) {
            return false;
        }

        try {
            List<PropertyDescriptor> propertyDescriptors;
            propertyDescriptors = List.of(
                Introspector
                    .getBeanInfo(a.getClass(), Object.class)
                    .getPropertyDescriptors()
            );

            for (PropertyDescriptor desc : propertyDescriptors) {
                Class<?> type = desc.getPropertyType();
                Method getter = desc.getReadMethod();

                Object valueA = getter.invoke(a);
                Object valueB = getter.invoke(b);

                if (!valuesEqual(type, valueA, valueB)) {
                    return false;
                }
            }
            return true;
        }
        catch (IntrospectionException | ReflectiveOperationException e) {
            // should never happen
            throw new RuntimeException(e);
        }

    }

    /**
     * Check if property value a equals property value b.
     *
     * @param type
     *     the common type of a and b. This condition is not checked.
     * @param a
     *     property value a.
     * @param b
     *     property value b
     * @return whether a and b are equal
     */
    private static boolean valuesEqual(Class<?> type, Object a, Object b) {
        if (type == List.class) {
            List<?> valueAList = ((List<?>) a);
            List<?> valueBList = ((List<?>) b);
            if (valueAList.size() != valueBList.size()) {
                return false;
            }
            for (int i = 0; i < valueAList.size(); i++) {
                Object entryA = valueAList.get(i);
                Object entryB = valueBList.get(i);
                if (isBaseType(entryA.getClass()) && !Objects.equals(
                    entryA,
                    entryB
                )) {
                    return false;
                }
                else if (!dataEquals(entryA, entryB)) {
                    return false;
                }
            }
            return true;
        }
        else if (isBaseType(type) && !Objects.equals(a, b)) {
            return false;
        }
        else {
            return dataEquals(a, b);
        }
    }

    /**
     * Overwrites all attributes of the writeable by the base attributes of the
     * update that are not null in the update. Base values are defined by
     * {@link #BASE_DATA_TYPES}. For all other types this function will recursively
     * call itself (for none null objects) to update these with the same logic. NOTE:
     * the {@link #BASE_DATA_TYPES} list possibly may not be complete and should be
     * updated if this causes an issue.
     *
     * @param writable
     *     the writable object
     * @param update
     *     the update object
     */
    @SuppressWarnings("unchecked")
    public static void writeForAllNonNullProperties(Object writable, Object update) {
        try {
            List<PropertyDescriptor> propertyDescriptors;
            propertyDescriptors = List.of(
                Introspector
                    .getBeanInfo(writable.getClass(), Object.class)
                    .getPropertyDescriptors()
            );

            for (PropertyDescriptor desc : propertyDescriptors) {

                Class<?> type = desc.getPropertyType();
                Method getter = desc.getReadMethod();

                if (type == List.class) {
                    List<Object> updateValueList = ((List<Object>) getter.invoke(
                        update));
                    List<Object> writableValueList = ((List<Object>) getter.invoke(
                        writable));
                    writableValueList.clear();
                    for (Object updateValue : updateValueList) {
                        writableValueList.add(
                            updateValue(null, updateValue)
                        );
                    }
                }
                else {
                    Object writableValue = getter.invoke(writable);
                    Object updateValue = getter.invoke(update);
                    Method setter = desc.getWriteMethod();
                    setter.invoke(
                        writable,
                        updateValue(writableValue, updateValue)
                    );

                }
            }

        }
        catch (IntrospectionException | ReflectiveOperationException e) {
            // should never happen
            throw new RuntimeException(e);
        }
    }

    static Object updateValue(Object writableValue, Object updateValue) throws
        ReflectiveOperationException {

        if (updateValue == null) {
            return writableValue;
        }
        else if (XMLGregorianCalendar.class.isAssignableFrom(updateValue.getClass())) {
            // is not immutable, so must be cloned
            return ((XMLGregorianCalendar) updateValue).clone();
        }
        else if (isBaseType(updateValue.getClass())) {
            return updateValue;
        }
        else {
            if (writableValue == null) {
                // create empty object
                writableValue = updateValue
                    .getClass()
                    .getDeclaredConstructor()
                    .newInstance();
            }
            writeForAllNonNullProperties(writableValue, updateValue);
            return writableValue;
        }
    }

    static boolean isBaseType(Class<?> type) {
        return BASE_DATA_TYPES.contains(type)
            || Duration.class.isAssignableFrom(type)
            || XMLGregorianCalendar.class.isAssignableFrom(type)
            || type.isEnum();
    }

    /**
     * Create a deep copy of the given data and return it. Should only be used on
     * generated SPINE objects, or lists thereof.
     *
     * @param data
     *     the object to copy from
     * @param <T>
     *     the type of data to copy
     * @return a new copy of {@code data}
     */
    @SuppressWarnings("unchecked")
    public static <T> T dataCopy(T data) {
        if (data == null) {
            return null;
        }
        else if (data instanceof List) {
            List<?> dataList = (List<?>) data;
            return (T) deepCopyList(dataList);
        }
        else {
            try {
                T dataCopy = (T) data
                    .getClass()
                    .getDeclaredConstructor()
                    .newInstance();
                SpineObjects.writeForAllNonNullProperties(dataCopy, data);
                return dataCopy;
            }
            catch (ReflectiveOperationException e) {
                // Should never happen
                throw new RuntimeException(e);
            }
        }
    }

    public static <T> List<T> deepCopyList(List<T> data) {
        List<T> copy = new ArrayList<>(data.size());
        data.forEach(val -> copy.add(dataCopy(val)));
        return copy;
    }

    /**
     * Deletes the elements that are defined by the given elements in the given data
     * object.
     *
     * @param data
     *     the data to delete from
     * @param elements
     *     the elements that defines the elements to delete
     */
    public static void deleteElements(Object data, Object elements) {
        List<PropertyDescriptor> propertyDescriptors;
        try {
            propertyDescriptors = List.of(
                Introspector
                    .getBeanInfo(elements.getClass(), Object.class)
                    .getPropertyDescriptors()
            );
        }
        catch (Exception e) {
            // should never happen
            throw new RuntimeException(e);
        }
        propertyDescriptors.forEach(desc -> deleteElement(desc, data, elements));
    }

    /**
     * Deletes the element or sub elements that are described by the given
     * PropertyDescriptor and the elements from the given data object. This method
     * recursively calls {@link #deleteElements} if the given element type is not
     * {@link ElementTagType}.
     *
     * @param desc
     *     the PropertyDescriptor
     * @param data
     *     the data to delete from
     * @param elements
     *     the elements that describes the elements to delete
     */
    static void deleteElement(
        PropertyDescriptor desc,
        Object data,
        Object elements
    ) {
        try {
            Method elementsSetter = desc.getWriteMethod();
            Method elementsGetter = desc.getReadMethod();

            Object elementsValue = elementsGetter.invoke(elements);
            if (elementsValue == null) {
                return;
            }

            Method valueGetter = data.getClass().getMethod(elementsGetter.getName());

            if (!desc.getPropertyType().equals(ElementTagType.class)) {
                Object value = valueGetter.invoke(data);
                if (value != null) {
                    deleteElements(value, elementsValue);
                }
            }
            else {
                // delete
                data.getClass()
                    .getMethod(elementsSetter.getName(), valueGetter.getReturnType())
                    .invoke(data, (Object) null);
            }
        }
        catch (NoSuchMethodException |
               IllegalAccessException |
               InvocationTargetException e) {
            // should never happen
            throw new RuntimeException(e);
        }
    }

    /**
     * Returns the property descriptor for a given object type for the
     * {@link CmdType} class.
     *
     * @param dataListType
     *     the class object for DATA_LIST
     * @param <DATA_LIST>
     *     the data list type to look for
     * @return the property descriptor for given type
     */
    public static <DATA_LIST> PropertyDescriptor getDataListPropertyDescriptorForCmdType(
        Class<DATA_LIST> dataListType
    ) {
        List<PropertyDescriptor> propertyDescriptors;
        try {
            propertyDescriptors = List.of(
                Introspector
                    .getBeanInfo(CmdType.class, Object.class)
                    .getPropertyDescriptors()
            );
        }
        catch (IntrospectionException e) {
            // should never happen
            throw new RuntimeException(e);
        }
        return propertyDescriptors
            .stream()
            .filter(desc -> desc.getPropertyType().equals(dataListType))
            .findFirst()
            .orElseThrow(() -> new IllegalArgumentException(
                "class " + dataListType + " is not a valid cmdType data class"));
    }

    /**
     * This method filters the given data object list so that it returns a list of
     * data objects that only hold attributes tagged by the given elements. The
     * method <b>does not alter</b> the given data objects but instead creates a new
     * instance of each data object and adds only the tagged elements. If elements is
     * null the given dataList is returned.
     *
     * @param elements
     *     the elements that tags elements (attributes) to include
     * @param selectedData
     *     the data object list to filter
     * @param <DATA>
     *     type of data objects to process
     * @param <ELEMENTS>
     *     type of elements objects to check against
     * @return a list of data objects with only elements (attributes) set that are
     * tagged by the elements
     */
    public static <DATA, ELEMENTS> List<DATA> getDataListForTaggedElements(
        ELEMENTS elements,
        List<DATA> selectedData
    ) {

        if (elements == null) {
            return selectedData;
        }

        if (selectedData == null) {
            throw new IllegalArgumentException("dataList must not be null");
        }

        return selectedData.stream()
            .map(data -> createNewDataWithTaggedElements(data, elements))
            .collect(toList());
    }
}
