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
import org.openmuc.jeebus.spine.api.SpineAcknowledgment;
import org.openmuc.jeebus.spine.api.SpineException;
import org.openmuc.jeebus.spine.api.WriteSingleDataListener;
import org.openmuc.jeebus.spine.api.options.WriteSingleCmdOption;
import org.openmuc.jeebus.spine.api.validation.WriteSingleDataValidation;
import org.openmuc.jeebus.spine.utils.Filters;
import org.openmuc.jeebus.spine.utils.SpineObjects;
import org.openmuc.jeebus.spine.xsd.v1.CmdType;
import org.openmuc.jeebus.spine.xsd.v1.FeatureAddressType;
import org.openmuc.jeebus.spine.xsd.v1.FilterType;

import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.util.ArrayList;
import java.util.List;

public abstract class ReadAndWriteSingleFeatureFunction<DATA, ELEMENTS, TYPE extends DataFeatureFunctionTypeInfo<DATA, ELEMENTS>>
    extends
    ReadSingleFeatureFunction<DATA, ELEMENTS, TYPE> {
    public ReadAndWriteSingleFeatureFunction(String functionName, TYPE typeInfo) {
        super(functionName, typeInfo);
    }

    private final List<WriteSingleDataListener<DATA>> useCaseWriteSingleDataListeners = new ArrayList<>();

    private final List<WriteSingleDataValidation<DATA, ELEMENTS>> useCaseWriteValidations = new ArrayList<>();

    public void addUseCaseWriteValidation(
        WriteSingleDataValidation<DATA, ELEMENTS> useCaseWriteValidation
    ) {
        this.useCaseWriteValidations.add(useCaseWriteValidation);
    }

    public void addUseCaseWriteDataListener(
        WriteSingleDataListener<DATA> useCaseWriteSingleDataListener
    ) {
        this.useCaseWriteSingleDataListeners.add(useCaseWriteSingleDataListener);
    }

    abstract void writeData(DATA data);

    abstract void validateWriteCmd(
        DATA update, ELEMENTS elements,
        WriteSingleCmdOption writeListCmdOption
    )
        throws SpineException;

    @Override
    public SpineAcknowledgment write(
        CmdType cmd,
        FeatureAddressType sourceAddress
    ) throws SpineException {
        synchronized (dataLock) {
            writeData(cmd);
            return new SpineAcknowledgment(Error.NO_ERROR);
        }
    }

    /**
     * Writes the data for given Command.
     *
     * @param cmd
     *     the given Command
     * @throws SpineException
     *     if validation fails
     */
    void writeData(CmdType cmd) throws SpineException {
        FilterType deleteFilter = Filters.getDeleteFilter(cmd);
        FilterType partialFilter = Filters.getPartialWriteFilter(cmd);
        DATA update = getUpdateFromCmd(cmd);

        WriteSingleCmdOption writeSingleCmdOption = validateWriteCmd(
            partialFilter,
            deleteFilter,
            update
        );

        if (writeSingleCmdOption == WriteSingleCmdOption.PARTIAL_WRITE) {
            SpineObjects.writeForAllNonNullProperties(data, update);
        }
        if (deleteFilter != null) {
            SpineObjects.deleteElements(
                data, Filters.getElementsObject(
                    deleteFilter,
                    getTypeInfo().getElementsType()
                )
            );
        }
        if (writeSingleCmdOption == WriteSingleCmdOption.FULL_WRITE) {
            data = update;
        }
        writeData(data);
        for (WriteSingleDataListener<DATA> listener : useCaseWriteSingleDataListeners) {
            listener.writeData(data);
        }
    }

    /**
     * Validates the given Write Command for its filters and update data.
     *
     * @param partialFilter
     *     the partial filer
     * @param deleteFilter
     *     the delete filter
     * @param update
     *     the update data
     * @return what {@link WriteSingleCmdOption} was used, if used, else null
     * @throws SpineException
     *     if validation fails
     */
    private WriteSingleCmdOption validateWriteCmd(
        FilterType partialFilter,
        FilterType deleteFilter,
        DATA update
    )
        throws SpineException {
        WriteSingleCmdOption writeSingleCmdOption = null;

        if (partialFilter != null) {
            writeSingleCmdOption = WriteSingleCmdOption.PARTIAL_WRITE;
            validatePartialWrite(update, partialFilter);
            validateWriteCmd(
                update,
                Filters.getElementsObject(
                    partialFilter,
                    getTypeInfo().getElementsType()
                ),
                writeSingleCmdOption
            );
            for (WriteSingleDataValidation<DATA, ELEMENTS> validation : useCaseWriteValidations) {
                validation.validateWriteCmdFull(
                        update,
                        Filters.getElementsObject(
                                partialFilter,
                                getTypeInfo().getElementsType()
                        ),
                        writeSingleCmdOption
                );
            }
        }

        if (deleteFilter != null) {
            validateDelete(update, deleteFilter);
            validateWriteCmd(
                update,
                Filters.getElementsObject(
                    deleteFilter,
                    getTypeInfo().getElementsType()
                ),
                WriteSingleCmdOption.DELETE_ELEMENTS
            );
            for (WriteSingleDataValidation<DATA, ELEMENTS> validation : useCaseWriteValidations) {
                validation.validateWriteCmdFull(
                        update,
                        Filters.getElementsObject(
                                deleteFilter,
                                getTypeInfo().getElementsType()
                        ),
                        WriteSingleCmdOption.DELETE_ELEMENTS
                );
            }
        }

        if (partialFilter == null && deleteFilter == null) {
            writeSingleCmdOption = WriteSingleCmdOption.FULL_WRITE;
        }

        return writeSingleCmdOption;
    }

    private void validateDelete(DATA update, FilterType deleteFilter) throws
        SpineException {
        boolean deleteElementsPresent = Filters.getElementsObject(
            deleteFilter,
            getTypeInfo().getElementsType()
        ) != null;
        if (!deleteElementsPresent) {
            throw new SpineException(
                Error.COMMAND_REJECTED,
                "Received delete write request for single data function "
                    + "without any elements set to delete"
            );
        }
    }

    private void validatePartialWrite(DATA update, FilterType partialFilter) throws
        SpineException {
        if (update == null) {
            throw new SpineException(
                Error.COMMAND_REJECTED, "Received write request for data type "
                + getTypeInfo().getDataType().getSimpleName()
                + " without any change data."
            );
        }
        boolean writeElementsPresent = Filters.getElementsObject(
            partialFilter,
            getTypeInfo().getElementsType()
        ) != null;

        if (writeElementsPresent) {
            throw new SpineException(
                Error.COMMAND_REJECTED,
                "Received partial write request for data type "
                    + getTypeInfo().getDataType().getSimpleName()
                    + " with <ELEMENTS> types."
            );
        }
    }

    @SuppressWarnings("unchecked")
    private DATA getUpdateFromCmd(CmdType cmd) {
        try {

            PropertyDescriptor desc = getDataPropertyDescriptorForCmdType();
            return (DATA) desc.getReadMethod()
                .invoke(cmd);

        }
        catch (ReflectiveOperationException e) {
            // Should never happen, public write method must exist for generated classes
            throw new RuntimeException(e);
        }
    }

    PropertyDescriptor getDataPropertyDescriptorForCmdType() {
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
            .filter(desc -> desc
                .getPropertyType()
                .equals(getTypeInfo().getDataType()))
            .findFirst()
            .orElseThrow(() -> new IllegalArgumentException(
                "class "
                    + getTypeInfo().getDataType()
                    + " is not a valid cmdType data class"));
    }
}
