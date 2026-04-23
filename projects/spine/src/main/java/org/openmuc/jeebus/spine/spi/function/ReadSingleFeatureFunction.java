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

import org.openmuc.jeebus.spine.api.DataValidationException;
import org.openmuc.jeebus.spine.api.Error;
import org.openmuc.jeebus.spine.api.SpineAcknowledgment;
import org.openmuc.jeebus.spine.api.SpineException;
import org.openmuc.jeebus.spine.api.options.ReadSingleCmdOption;
import org.openmuc.jeebus.spine.api.validation.DataValidation;
import org.openmuc.jeebus.spine.api.validation.ReadSingleDataValidation;
import org.openmuc.jeebus.spine.utils.Filters;
import org.openmuc.jeebus.spine.utils.SpineObjects;
import org.openmuc.jeebus.spine.utils.SpineUtilities;
import org.openmuc.jeebus.spine.xsd.v1.*;

import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

public abstract class ReadSingleFeatureFunction<DATA, ELEMENTS, TYPE extends DataFeatureFunctionTypeInfo<DATA, ELEMENTS>>
    extends DataFeatureFunction<DATA, ELEMENTS, TYPE> {

    protected DATA data;
    protected final Object dataLock = new Object();

    protected final Set<ReadSingleCmdOption> allowedReadCmdOptions =
        EnumSet.allOf(ReadSingleCmdOption.class);

    public ReadSingleFeatureFunction(String functionName, TYPE typeInfo) {
        super(functionName, typeInfo);
    }

    public Set<ReadSingleCmdOption> getAllowedReadCmdOptions() {
        return allowedReadCmdOptions;
    }

    public void setAllowedReadCmdOptions(ReadSingleCmdOption... allowedReadCmdOptions) {
        this.allowedReadCmdOptions.retainAll(Set.of(allowedReadCmdOptions));
    }

    DATA readData(FilterType filter) throws SpineException {
        if (filter == null) {
            return data;
        }
        if (data == null) {
            throw new SpineException(Error.COMMAND_REJECTED, "No data found");
        }

        ELEMENTS elements = Filters.getElementsObject(
            filter,
            getTypeInfo().getElementsType()
        );
        validateReadFilter(elements);
        return getDataForTaggedElements(elements);
    }

    /**
     * From the given elements creates a data object that only holds defined
     * elements
     *
     * @param elements
     *     the elements to set
     * @return a new data object with only given elements set
     */
    DATA getDataForTaggedElements(ELEMENTS elements) {
        if (elements == null) {
            return data;
        }
        return SpineObjects.createNewDataWithTaggedElements(data, elements);
    }

    /**
     * Validates the read filter.
     *
     * @param elements
     *     the elements from the read filter
     * @throws SpineException
     *     if validation fails
     */
    void validateReadFilter(ELEMENTS elements) throws SpineException {
        ReadSingleCmdOption readSingleCmdOption;
        if (elements == null) {
            readSingleCmdOption = ReadSingleCmdOption.FULL_READ;
        }
        else {
            readSingleCmdOption = ReadSingleCmdOption.READ_ELEMENTS;
        }
        if (!allowedReadCmdOptions.contains(readSingleCmdOption)) {
            throw new SpineException(
                Error.COMMAND_NOT_SUPPORTED, "Received write request for data type "
                + getTypeInfo().getDataType().getSimpleName()
                + " with cmdOption that is not allowed: "
                + readSingleCmdOption
            );
        }
        validateReadCmd(elements, readSingleCmdOption);
        useCaseReadListValidation.validateReadCmd(elements, readSingleCmdOption);
    }

    @Override
    public CmdType read(FilterType filter, FeatureAddressType sourceAddress) throws
        SpineException {
        synchronized (dataLock) {
            if (!this.isReadable()) {
                throw new UnsupportedOperationException();
            }
            return readDataAndBuildReadReplyCmd(filter);
        }
    }

    CmdType readDataAndBuildReadReplyCmd(FilterType filter) throws SpineException {
        DATA data = readData(filter);

        CmdType replyCmd = new CmdType();
        replyCmd.setFunction(getFunctionName());

        if (filter != null && filter.getCmdControl() != null
            && filter.getCmdControl().getPartial() != null) {
            FilterType replyFilter = new FilterType();
            replyFilter.setCmdControl(SpineUtilities.getPartialCmdControl());
            replyCmd.getFilter().add(replyFilter);
        }

        setCmdData(replyCmd, data);

        return replyCmd;
    }

    @Override
    public SpineAcknowledgment write(
        CmdType cmd,
        FeatureAddressType sourceAddress
    ) throws SpineException {
        throw new UnsupportedOperationException();
    }

    private ReadSingleDataValidation<ELEMENTS> useCaseReadListValidation
        = (elements, readCmdOption) -> {
        // placeholder if not set
    };

    public void setUseCaseReadSingleDataValidation(
        ReadSingleDataValidation<ELEMENTS> useCaseReadListValidation
    ) {
        this.useCaseReadListValidation = useCaseReadListValidation;
    }

    protected abstract void validateReadCmd(
        ELEMENTS elements,
        ReadSingleCmdOption readListCmdOption
    )
        throws SpineException;

    /**
     * Updates the data for the given update. Validates the update before and throws
     * DataValidationException if invalid. Notifies subscribers on successful update.
     * Any elements that are set to null in the update will be notified as deleted.
     *
     * @param update
     *     the update
     * @throws DataValidationException
     *     if data validation fails
     */
    public void updateData(DATA update) throws DataValidationException {
        synchronized (dataLock) {
            DATA dataCopy = SpineObjects.dataCopy(update);
            validateData(dataCopy);
            for (DataValidation<DATA> dv : getUseCaseDataValidations()) {
                    dv.validateData(dataCopy);
            }
             DATA oldDataCopy = SpineObjects.dataCopy(data);
            data = dataCopy;
            notifySubscribersForDataUpdate(oldDataCopy, dataCopy);
        }
    }

    /**
     * Notifies subscribers for update. Checks if elements were deleted and if so
     * also notifies deletion of elements.
     *
     * @param oldData
     *     the data before the update
     * @param updateData
     *     the updated data
     */
    void notifySubscribersForDataUpdate(DATA oldData, DATA updateData) {

        CmdType cmd = new CmdType();
        cmd.setFunction(getFunctionName());
        FilterType partialFilter = new FilterType();
        partialFilter.setCmdControl(new CmdControlType());
        partialFilter.getCmdControl().setPartial(new ElementTagType());
        cmd.getFilter().add(partialFilter);

        setCmdData(cmd, updateData);
        if (oldData != null) {
            try {
                ELEMENTS elements = getTypeInfo()
                    .getElementsType()
                    .getDeclaredConstructor()
                    .newInstance();
                boolean wasWritten = SpineObjects.writeDeleteElements(
                    elements,
                    oldData,
                    updateData
                );
                if (wasWritten) {
                    FilterType deleteFilter = new FilterType();
                    deleteFilter.setCmdControl(new CmdControlType());
                    deleteFilter.getCmdControl().setDelete(new ElementTagType());
                    setElements(deleteFilter, elements);
                    cmd.getFilter().add(deleteFilter);
                }
            }
            catch (ReflectiveOperationException e) {
                throw new RuntimeException(e);
            }
        }

        if (feature != null) {
            feature.notifySubscribers(cmd);
        }
    }

    /**
     * Returns a data copy of the current data.
     *
     * @return data copy
     */
    public DATA getDataCopy() {
        synchronized (dataLock) {
            if (data == null) {
                return null;
            }
            return SpineObjects.dataCopy(data);
        }
    }

    /**
     * Sets the data for the given {@link CmdType} object.
     *
     * @param cmd
     *     the cmd to add to
     * @param data
     *     the data to add
     */
    void setCmdData(CmdType cmd, DATA data) {
        try {
            List<PropertyDescriptor> propertyDescriptors = List.of(
                Introspector
                    .getBeanInfo(CmdType.class, Object.class)
                    .getPropertyDescriptors()
            );
            PropertyDescriptor propertyDescriptor = propertyDescriptors.stream()
                .filter(desc -> desc
                    .getPropertyType()
                    .equals(getTypeInfo().getDataType()))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException(
                    "class "
                        + getTypeInfo().getDataType()
                        + " is not a valid cmdType data class"));

            propertyDescriptor
                .getWriteMethod()
                .invoke(cmd, data);
        }
        catch (IntrospectionException |
               IllegalAccessException |
               InvocationTargetException e) {
            // Should never happen, public write method must exist for generated classes
            throw new RuntimeException(e);
        }
    }

    void setData(DATA data) {
        this.data = data;
    }

    Object getDataLock() {
        return dataLock;
    }

    @Override
    public Snapshottable.Snapshot takeSnapshot() {
        DATA old = data;
        return () -> data = old;
    }
}
