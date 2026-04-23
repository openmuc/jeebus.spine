/********************************************************************************
 * Copyright (c) 2026 Fraunhofer ISE
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 ********************************************************************************/

package org.openmuc.jeebus.spine.spi.function;

import org.openmuc.jeebus.spine.api.Error;
import org.openmuc.jeebus.spine.api.SpineException;
import org.openmuc.jeebus.spine.api.options.WriteListCmdOption;
import org.openmuc.jeebus.spine.impl.DataIdDescription;
import org.openmuc.jeebus.spine.utils.Filters;
import org.openmuc.jeebus.spine.utils.SpineObjects;
import org.openmuc.jeebus.spine.xsd.v1.CmdType;
import org.openmuc.jeebus.spine.xsd.v1.FilterType;

import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/**
 * RTTI class for {@link ReadListFeatureFunction} and
 * {@link ReadAndWriteListFeatureFunction}.
 */
public class ListFeatureFunctionTypeInfo<DATA, DATA_LIST, SELECTOR, ELEMENTS>
    extends DataFeatureFunctionTypeInfo<DATA, ELEMENTS> {

    private final Class<DATA_LIST> dataListType;
    private final Class<SELECTOR> selectorType;
    private final DataIdDescription<DATA> dataIdDesc;

    private final boolean isIdentifiableList;

    /**
     * The class object for {@link DATA} is obtained from {@code dataIdDesc}.
     *
     * @param dataIdDesc
     *     description of IDs for {@link DATA}, containing the class object for
     *     {@link DATA}.
     * @param dataListType
     *     class object for {@link DATA_LIST}
     * @param selectorType
     *     class object for {@link SELECTOR}
     * @param elementsType
     *     class object for {@link ELEMENTS}
     */
    public ListFeatureFunctionTypeInfo(
        DataIdDescription<DATA> dataIdDesc,
        Class<DATA_LIST> dataListType,
        Class<SELECTOR> selectorType,
        Class<ELEMENTS> elementsType
    ) {
        super(dataIdDesc.getDataType(), elementsType);
        if (dataIdDesc.getAllIdPropertyDescriptors().isEmpty()) {
            dataIdDesc = null;
            isIdentifiableList = false;
        }
        else {
            isIdentifiableList = true;
        }

        this.dataListType = dataListType;
        this.selectorType = selectorType;
        this.dataIdDesc = dataIdDesc;
    }

    /**
     * Takes a list of {@link DATA} type objects and sets / adds it to the
     * {@link DATA_LIST} type object in the given cmd.
     *
     * @param cmd
     *     the given {@link CmdType} to add data to
     * @param dataList
     *     the data list to add
     */
    public void setCmdDataList(CmdType cmd, List<DATA> dataList) {
        DATA_LIST replyDataListType = buildListDataType(dataList);
        try {
            SpineObjects.getDataListPropertyDescriptorForCmdType(dataListType)
                .getWriteMethod()
                .invoke(cmd, replyDataListType);
        }
        catch (IllegalAccessException | InvocationTargetException e) {
            // Should never happen, public write method must exist for generated classes
            throw new RuntimeException(e);
        }
    }

    /**
     * Builds and returns the {@link DATA_LIST} type object for a given {@link DATA}
     * type list.
     *
     * @param dataList
     *     list of data
     * @return {@link DATA_LIST} type object
     */
    @SuppressWarnings("unchecked")
    public DATA_LIST buildListDataType(List<DATA> dataList) {

        try {
            DATA_LIST dataListTypeObject = dataListType
                .getDeclaredConstructor()
                .newInstance();
            List<PropertyDescriptor> propertyDescriptors = List.of(
                Introspector
                    .getBeanInfo(dataListType, Object.class)
                    .getPropertyDescriptors()
            );
            List<DATA> dataListAttributeVal = (List<DATA>) propertyDescriptors
                .stream()
                .filter(desc -> desc.getPropertyType().equals(List.class))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new)
                .getReadMethod()
                .invoke(dataListTypeObject);
            dataListAttributeVal.addAll(dataList);
            return dataListTypeObject;

        }
        catch (IllegalAccessException |
               InvocationTargetException |
               NoSuchMethodException |
               IntrospectionException |
               InstantiationException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Validates the Delete Filter and defines which {@link WriteListCmdOption} the
     * given cmd uses for its Delete Filter. Throws SpineException if the Delete
     * Filter is invalid.
     *
     * @param deleteFilter
     *     the Delete Filter
     * @throws SpineException
     *     if invalid
     */
    WriteListCmdOption validateDeleteFilterAndGetCmdOption(FilterType deleteFilter)
        throws SpineException {

        WriteListCmdOption deleteOption;

        boolean deleteSelectorsPresent = !Filters
            .getSelectors(deleteFilter, selectorType)
            .isEmpty();
        boolean deleteElementsPresent = Filters.getElementsObject(
            deleteFilter,
            getElementsType()
        ) != null;

        if (deleteSelectorsPresent && deleteElementsPresent) {
            deleteOption = WriteListCmdOption.DELETE_ELEMENTS_BY_SELECTOR;
        }
        else if (deleteSelectorsPresent) {
            deleteOption = WriteListCmdOption.DELETE_BY_SELECTOR;
        }
        else if (deleteElementsPresent) {
            deleteOption = WriteListCmdOption.DELETE_ELEMENTS;
        }
        else {
            throw new SpineException(
                Error.COMMAND_REJECTED,
                "Received delete write request for data type "
                    + getDataType().getSimpleName()
                    + " with neither Selectors nor Elements."
            );
        }

        if (deleteElementsPresent && isIdentifiableList) {
            ELEMENTS elements = Filters.getElementsObject(
                deleteFilter,
                getElementsType()
            );
            for (PropertyDescriptor desc : dataIdDesc.getAllIdPropertyDescriptors()) {
                Object idElementValue;
                try {
                    idElementValue = getElementsType()
                        .getMethod(desc.getReadMethod().getName())
                        .invoke(elements);
                }
                catch (IllegalAccessException |
                       InvocationTargetException |
                       NoSuchMethodException e) {
                    // should never happen
                    throw new RuntimeException(e);
                }
                if (idElementValue != null) {
                    throw new SpineException(
                        Error.COMMAND_REJECTED,
                        "Received delete write request for data type "
                            + getDataType().getSimpleName()
                            + " with identifier elements set. May not delete identifiers."
                    );
                }
            }
        }

        return deleteOption;
    }

    /**
     * Validates the Partial Write Filter and defines which
     * {@link WriteListCmdOption} the given cmd uses for its Partial Filter. Throws
     * SpineException if the Partial Filter is invalid.
     *
     * @param partialFilter
     *     the Partial Filter
     * @throws SpineException
     *     if invalid
     */
    WriteListCmdOption validatePartialWriteFilterAndGetCmdOption(FilterType partialFilter)
        throws SpineException {
        WriteListCmdOption writeListCmdOption;

        boolean writeSelectorsPresent =
            !Filters.getSelectors(partialFilter, selectorType).isEmpty();
        boolean writeElementsPresent =
            Filters.getElementsObject(partialFilter, getElementsType()) != null;

        if (writeElementsPresent) {
            throw new SpineException(
                Error.COMMAND_REJECTED,
                "Received partial write request for data type "
                    + getDataType().getSimpleName() + " with <ELEMENTS> types."
            );
        }
        else if (writeSelectorsPresent) {
            writeListCmdOption = WriteListCmdOption.PARTIAL_WRITE_BY_SELECTOR;
        }
        else if (!isIdentifiableList) {
            throw new SpineException(
                Error.COMMAND_REJECTED,
                "Received partial write request without <SELECTORS> for "
                    + "data type "
                    + getDataType().getSimpleName()
                    + ", which is not identifiable."
            );
        }
        else {
            writeListCmdOption = WriteListCmdOption.PARTIAL_WRITE_BY_FUNCTION_ID;
        }
        return writeListCmdOption;
    }

    /**
     * Check that the given data has valid IDs for a write request.
     *
     * @param data
     *     the data to check
     * @throws SpineException
     *     if the given data has invalid or nonexistent IDs.
     */
    void validateWriteId(DATA data) throws SpineException {
        switch (dataIdDesc.validateData(data)) {
            case IDS_NULL:
            case INVALID:
                throw new SpineException(
                    Error.COMMAND_REJECTED,
                    "Received full write request for data type "
                        + getDataType().getSimpleName()
                        + " with invalid or not existent ids."
                );
            default: // ok, do nothing
        }
    }

    /**
     * Check that each of the given data items has valid IDs for a write request.
     *
     * @param dataList
     *     the data to check
     * @throws SpineException
     *     if any of the given datas has invalid or nonexistent IDs.
     * @implNote Calls {@link #validateWriteId(Object)} on each of the datas.
     */
    void validateWriteIds(List<DATA> dataList) throws SpineException {
        for (DATA data : dataList) {
            validateWriteId(data);
        }
    }

    /**
     * Retrieve the update data list from the given write command
     *
     * @param cmd
     *     the given write command
     * @return the update data list
     */
    @SuppressWarnings("unchecked")
    public List<DATA> getUpdateListFromCmd(CmdType cmd) {

        try {
            PropertyDescriptor desc1
                = SpineObjects.getDataListPropertyDescriptorForCmdType(dataListType);
            DATA_LIST dataListTypeObject = (DATA_LIST) desc1.getReadMethod()
                .invoke(cmd);
            if (dataListTypeObject == null) {
                return new ArrayList<>();
            }

            List<PropertyDescriptor> propertyDescriptors = List.of(
                Introspector
                    .getBeanInfo(dataListType, Object.class)
                    .getPropertyDescriptors()
            );

            PropertyDescriptor dataListDesc = propertyDescriptors
                .stream()
                .filter(desc -> desc.getPropertyType().equals(List.class))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);

            return (List<DATA>) dataListDesc
                .getReadMethod()
                .invoke(dataListTypeObject);

        }
        catch (ReflectiveOperationException | IntrospectionException e) {
            // Should never happen, public write method must exist for generated classes
            throw new RuntimeException(e);
        }
    }

    DataIdDescription.IdValidationStatus validateDataIdsForWrite(DATA data) throws
        SpineException {
        DataIdDescription.IdValidationStatus dataValidStatus = isIdentifiableList ?
            dataIdDesc.validateData(data) :
            null;

        if (dataValidStatus == DataIdDescription.IdValidationStatus.INVALID) {
            throw new SpineException(
                Error.COMMAND_REJECTED, "Received write request for data type "
                + getDataType().getSimpleName() + " with invalid ids."
            );
        }
        return dataValidStatus;
    }

    public boolean isIdentifiableList() {
        return isIdentifiableList;
    }

    DataIdDescription<DATA> getDataIdDesc() {
        return dataIdDesc;
    }

    public Class<SELECTOR> getSelectorType() {
        return selectorType;
    }
}