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
import org.openmuc.jeebus.spine.api.*;
import org.openmuc.jeebus.spine.api.options.WriteListCmdOption;
import org.openmuc.jeebus.spine.api.validation.MatchingDataWriteListValidation;
import org.openmuc.jeebus.spine.api.validation.WriteListValidationFull;
import org.openmuc.jeebus.spine.impl.DataIdDescription;
import org.openmuc.jeebus.spine.utils.Filters;
import org.openmuc.jeebus.spine.utils.SpineObjects;
import org.openmuc.jeebus.spine.xsd.v1.*;

import java.util.*;

public abstract class ReadAndWriteListFeatureFunction<DATA, DATA_LIST, SELECTOR, ELEMENTS,
    TYPE extends ListFeatureFunctionTypeInfo<DATA, DATA_LIST, SELECTOR, ELEMENTS>>
    extends ReadListFeatureFunction<DATA, DATA_LIST, SELECTOR, ELEMENTS, TYPE> {

    private static class ValidationResult<DATA> {
        WriteListCmdOption writeListCmdOption;
        WriteListCmdOption deleteCmdOption;
        Map<DATA, List<Integer>> partialWriteMatchingDataMap = new HashMap<>();
        Map<DATA, Integer> fullWriteMatchingDataIdxMap = new HashMap<>();
    }

    // By default, all Write Options are allowed
    private final Set<WriteListCmdOption> allowedWriteListCmdOptions = EnumSet.allOf(
        WriteListCmdOption.class);

    private final List<WriteListValidationFull<DATA, SELECTOR, ELEMENTS>>
            useCaseWriteValidationsFull = new ArrayList<>();
    private final List<MatchingDataWriteListValidation<DATA>>
            useCaseMatchingDataWriteListValidations = new ArrayList<>();

    protected final List<WriteDataListListener<DATA>> useCaseWriteDataListListeners = new ArrayList<>();

    /**
     * Validates the read command like {@link #validateUpdateForMatchingData}. Should
     * be set by the Use Case Implementation.
     * <p>
     * The function <b>MUST</b> check only data relevant to the particular use case, and consider all other data as valid.
     *
     * @param useCaseMatchingDataWriteListValidation
     *     the {@link MatchingDataWriteListValidation} functional interface function
     */
    public void addUseCaseMatchingDataWriteValidation(
        MatchingDataWriteListValidation<DATA> useCaseMatchingDataWriteListValidation
    ) {
        this.useCaseMatchingDataWriteListValidations.add(useCaseMatchingDataWriteListValidation);
    }

    /**
     * Validates the write command like {@link #validateWriteCmd}. Should be set by
     * the Use Case Implementation.
     * <p>
     * The function <b>MUST</b> check only data relevant to the particular use case, and consider all other data as valid.
     *
     * @param writeValidationFull
     *     the {@link WriteListValidationFull} function interface function
     */
    public void addUseCaseWriteValidationFull(
        WriteListValidationFull<DATA, SELECTOR, ELEMENTS> writeValidationFull
    ) {
        this.useCaseWriteValidationsFull.add(writeValidationFull);
    }

    /**
     * Adds a listener that is called when changes were made to any data. It is the responsibility of the listener
     * to only check data that it actually cares about.
     *
     * @param useCaseWriteDataListListener
     *     the listener
     */
    public void addUseCaseWriteDataListener(WriteDataListListener<DATA> useCaseWriteDataListListener) {
        this.useCaseWriteDataListListeners.add(useCaseWriteDataListListener);
    }

    public Set<WriteListCmdOption> getAllowedWriteCmdOptions() {
        return allowedWriteListCmdOptions;
    }

    /**
     * Sets the allowed {@link WriteListCmdOption}s defined by the
     * FeatureFunction/Use Case.
     *
     * @param allowedCmdWriteOptions
     *     the allowed {@link WriteListCmdOption}s
     */
    public void setAllowedWriteCmdOptions(WriteListCmdOption... allowedCmdWriteOptions) {
        this.allowedWriteListCmdOptions.retainAll(Set.of(allowedCmdWriteOptions));
    }

    /**
     * Called when changes were made to any data.
     *
     * @param data
     *     the data that was updated (copy of the original data), fully deleted or
     *     newly added
     * @param dataUpdateType
     *     if the data shall be updated, deleted or newly added
     * @param idx
     *     index where at the data was added for this feature function
     */
    public abstract void writeData(
        DATA data,
        DataUpdateType dataUpdateType,
        Integer idx
    );

    /**
     * Validates each update data for its matching data that is changed by the update
     * data. This is called for each update data on partial or full write. Must be
     * implemented by the specific Feature Function.
     *
     * @param update
     *     the given update
     * @param matchingData
     *     the data that is to be changed by the update
     * @param writeListCmdOption
     *     the {@link WriteListCmdOption} that is used
     * @throws SpineException
     *     if the validation fails
     */
    protected abstract void validateUpdateForMatchingData(
        DATA update, List<DATA> matchingData,
        WriteListCmdOption writeListCmdOption
    )
        throws SpineException;

    /**
     * Validates a write command by taking the full update data list, selector list,
     * elementsType object and the {@link WriteListCmdOption} that is used. This may
     * be called twice for one command if both Delete and Write are used. Must be
     * implemented by the specific Feature Function.
     *
     * @param updateList
     *     the full update data list (can be null on DELETE writeCmdOption)
     * @param selectorList
     *     the full selector list of the command, may be empty
     * @param elements
     *     the elementsType object, may be null
     * @param writeListCmdOption
     *     the {@link WriteListCmdOption} that is used
     * @throws SpineException
     *     if the validation fails
     */
    protected abstract void validateWriteCmdFull(
        List<DATA> updateList, List<SELECTOR> selectorList,
        ELEMENTS elements,
        WriteListCmdOption writeListCmdOption
    )
        throws SpineException;

    /**
     * Constructs a ReadAndWriteFeatureFunction. If FeatureFunction shall be none
     * identifiable use an empty {@link DataIdDescription} by using
     * {@link DataIdDescription#getNoneIdentifiableDataDescription(Class)}. This
     * class automatically executes read and write commands for the given Feature
     * Function. Additional validation of commands is done by abstract validation
     * methods and validation functions that may be set by the Use Case
     * Implementation.
     *
     * @param functionName
     *     the name of the function
     * @param typeInfo
     *     the RTTI object for this feature function
     */
    public ReadAndWriteListFeatureFunction(String functionName, TYPE typeInfo) {
        super(functionName, typeInfo);
    }

    @Override
    public SpineAcknowledgment write(
        CmdType cmd,
        FeatureAddressType sourceAddress
    ) throws SpineException {
        synchronized (dataListHolder) {
            writeDataList(cmd);
            return new SpineAcknowledgment(Error.NO_ERROR);
        }
    }

    /**
     * Deletes data entries for selectors and notifies subscribers that data entries
     * were deleted.
     *
     * @param selectorList
     *     list of selectors for which data should be deleted
     * @throws DataValidationException
     *     if the given selectors are invalid
     */
    public void deleteDataEntriesBySelector(List<SELECTOR> selectorList) throws
        DataValidationException {
        synchronized (dataListHolder) {
            CmdType cmd = new CmdType();
            cmd.setFunction(getFunctionName());

            FilterType filter = new FilterType();
            Filters.getSelectors(filter, getTypeInfo().getSelectorType())
                .addAll(selectorList);

            try {
                getTypeInfo().validateDeleteFilterAndGetCmdOption(filter);
                dataListHolder
                    .deleteData(filter, WriteListCmdOption.DELETE_BY_SELECTOR)
                    .forEach(this::callWriteData);

            }
            catch (SpineException e) {
                throw new DataValidationException(
                    "Given selectors are not valid to delete by",
                    e
                );
            }

            FilterType partialFilter = new FilterType();
            partialFilter.setCmdControl(new CmdControlType());
            partialFilter.getCmdControl().setPartial(new ElementTagType());
            Filters.getSelectors(partialFilter, getTypeInfo().getSelectorType())
                .addAll(selectorList);

            cmd.getFilter().add(partialFilter);

            listFeatureFunctionNotifier.notifySubscribers(cmd);
        }
    }

    /**
     * First validates the cmd for given CmdOptions as described in SPINE spec
     * 5.3.4.2 and then executes write if validation succeeds. Additionally, runs
     * write validator set by {@link #addUseCaseWriteValidationFull}. Notifies
     * subscribers on successful write.
     *
     * @param cmd
     *     the given write cmd
     * @throws SpineException
     *     if write cmd validation fails
     */
    void writeDataList(CmdType cmd) throws SpineException {
        FilterType deleteFilter = Filters.getDeleteFilter(cmd);
        FilterType partialFilter = Filters.getPartialWriteFilter(cmd);
        List<DATA> updateList = getTypeInfo().getUpdateListFromCmd(cmd);

        // validate first (retrieve matching data for efficiency in validation)
        ValidationResult<DATA> vResult = validateWriteCmd(
            partialFilter,
            deleteFilter,
            updateList
        );

        partialWrite(vResult.partialWriteMatchingDataMap);
        dataListHolder
            .deleteData(deleteFilter, vResult.deleteCmdOption)
            .forEach(this::callWriteData);

        if (vResult.writeListCmdOption == WriteListCmdOption.FULL_WRITE) {
            dataListHolder
                .fullWrite(vResult.fullWriteMatchingDataIdxMap, updateList, false)
                .forEach(this::callWriteData);
        }
    }

    /**
     * Validates the write command for its partial filter, delete filter and data.
     * First calls write validation for as describes in the SPINE specification and
     * the SPINE resource specification validation implemented by the explicit
     * FeatureFunction ({@link #validateWriteCmdFull} and
     * {@link #validateUpdateForMatchingData}). Then calls UseCase validation that
     * may be set by the UseCase implementation ({@link #useCaseWriteValidationsFull}
     * and {@link #useCaseMatchingDataWriteListValidations}).
     *
     * @param partialFilter
     *     the partial filter to validate
     * @param deleteFilter
     *     the delete filter to validate
     * @param updateList
     *     the update data list
     * @return a {@link ValidationResult} containing the used
     * {@link WriteListCmdOption}s for delete / partial write and 2 maps that specify
     * matching data for given filters (partial or full write).
     * @throws SpineException
     *     if the validation fails
     */
    ValidationResult<DATA> validateWriteCmd(
        FilterType partialFilter,
        FilterType deleteFilter,
        List<DATA> updateList
    )
        throws SpineException {

        ValidationResult<DATA> vResult = new ValidationResult<>();

        if (partialFilter != null) {
            vResult.writeListCmdOption
                = getTypeInfo().validatePartialWriteFilterAndGetCmdOption(
                partialFilter);

            callValidateWriteCmdFull(
                updateList,
                Filters.getSelectors(
                    partialFilter,
                    getTypeInfo().getSelectorType()
                ),
                Filters.getElementsObject(
                    partialFilter,
                    getTypeInfo().getElementsType()
                ),
                vResult.writeListCmdOption
            );
            vResult.partialWriteMatchingDataMap
                = validatePartialWriteDataAndGetMatchingData(
                updateList,
                vResult.writeListCmdOption,
                partialFilter
            );
        }

        if (deleteFilter != null) {
            vResult.deleteCmdOption
                = getTypeInfo().validateDeleteFilterAndGetCmdOption(deleteFilter);

            callValidateWriteCmdFull(
                null,
                Filters.getSelectors(
                    deleteFilter,
                    getTypeInfo().getSelectorType()
                ),
                Filters.getElementsObject(
                    deleteFilter,
                    getTypeInfo().getElementsType()
                ),
                vResult.deleteCmdOption
            );
        }

        if (partialFilter == null && deleteFilter == null) {
            vResult.writeListCmdOption = WriteListCmdOption.FULL_WRITE;
            callValidateWriteCmdFull(
                updateList,
                new ArrayList<>(),
                null,
                vResult.writeListCmdOption
            );
            if (getTypeInfo().isIdentifiableList()) {
                vResult.fullWriteMatchingDataIdxMap
                    = validateFullWriteDataAndGetMatchingData(updateList);
            }
        }

        validateAllowedCmdOptions(
            vResult.writeListCmdOption,
            vResult.deleteCmdOption
        );

        return vResult;
    }

    /**
     * Call {@link #validateWriteCmdFull(List, List, Object, WriteListCmdOption)} and
     * {@link #useCaseWriteValidationsFull}.
     */
    private void callValidateWriteCmdFull(
        List<DATA> updateList,
        List<SELECTOR> selectors,
        ELEMENTS elements,
        WriteListCmdOption vResult
    )
        throws SpineException {
        validateWriteCmdFull(
            updateList,
            selectors,
            elements,
            vResult
        );
        for (WriteListValidationFull<DATA, SELECTOR, ELEMENTS> validation : useCaseWriteValidationsFull) {
            validation.validateWriteCmdFull(
                    updateList,
                    selectors,
                    elements,
                    vResult
            );
        }
    }

    /**
     * This method validates a partial write by applying the given update to the
     * given matching data (copies) and validating each resulting data.
     *
     * @param update
     *     the update
     * @param matchingDataCopyList
     *     a list of copies of the matching data
     * @throws SpineException
     *     if the validation fails
     */
    void validateDataForPartialWrite(
        DATA update,
        List<DATA> matchingDataCopyList
    ) throws SpineException {
        matchingDataCopyList.forEach(dataCopy -> SpineObjects.writeForAllNonNullProperties(
            dataCopy,
            update
        ));
        for (DATA copiedResultData : matchingDataCopyList) {
            validateDataComplete(copiedResultData);
        }
    }

    /**
     * Validates each update data for a full write by creating a deep copy of the
     * matching data and applying the update on it.
     *
     * @param matchingDataIdxMap
     *     map for full write with indices for matching data
     * @param updateList
     *     the given update list by the write command
     * @throws SpineException
     *     if the validation fails
     */
    void validateDataForFullWrite(
        Map<DATA, Integer> matchingDataIdxMap,
        List<DATA> updateList
    )
        throws SpineException {
        List<DATA> copiedResultDataList = dataListHolder.getFullCopy();
        fullWrite(matchingDataIdxMap, copiedResultDataList, updateList, true);
        for (DATA copiedResultData : copiedResultDataList) {
            validateDataComplete(copiedResultData);
        }
    }

    /**
     * Executes a full write for the matchingData on the given list to write on. If
     * the list is not identifiable this method will simply remove all data and add
     * the new data as defined by SPINE.
     *
     * @param fullWriteMatchingDataIdxMap
     *     the matching data map
     * @param writeDataList
     *     the data list to write on
     * @param updateList
     *     the update list given by the write command
     * @param isWriteForValidation
     *     if this write is only used for validation (no write listeners are called)
     */
    void fullWrite(
        Map<DATA, Integer> fullWriteMatchingDataIdxMap,
        List<DATA> writeDataList,
        List<DATA> updateList,
        boolean isWriteForValidation
    ) {
        dataListHolder
            .fullWrite(
                fullWriteMatchingDataIdxMap,
                writeDataList,
                updateList,
                isWriteForValidation
            )
            .forEach(this::callWriteData);
    }

    /**
     * Executes a partial write on each data described by the given matchingData map
     * with the given update.
     *
     * @param matchingDataMap
     *     map of the matching data
     */
    void partialWrite(Map<DATA, List<Integer>> matchingDataMap) {
        dataListHolder.partialWrite(matchingDataMap).forEach(this::callWriteData);
    }

    /**
     * Validates given update data list for a full write and creates a map with
     * indices for matching data from {@link DataListHolder#dataList}.
     *
     * @param updateList
     *     the update list given by the write command
     * @return map with indices for matching data
     * @throws SpineException
     *     if the validation fails
     */
    Map<DATA, Integer> validateFullWriteDataAndGetMatchingData(List<DATA> updateList)
        throws SpineException {

        Map<DATA, Integer> matchingDataIdxMap;

        getTypeInfo().validateWriteIds(updateList);
        matchingDataIdxMap = dataListHolder.getMatchingDataForFullWrite(
            updateList, (update, matchingDataList, writeListCmdOption) ->
                callValidateUpdateForMatchingData(
                    writeListCmdOption,
                    update,
                    matchingDataList
                )
        );

        validateDataForFullWrite(matchingDataIdxMap, updateList);

        return matchingDataIdxMap;
    }

    /**
     * Iterates through the update data list and validates if each data object is
     * valid. If valid returns map that holds matching data from
     * {@link #writeDataList} for each update data. Update data is invalid if:
     * <ul>
     *     <li>data has invalid ids (see {@link DataIdDescription#validateData})</li>
     *     <li>{@link WriteListCmdOption#PARTIAL_WRITE_BY_FUNCTION_ID} is used by the command and no data was found for
     *     given id values.</li>
     *     <li>{@link WriteListCmdOption#PARTIAL_WRITE_BY_SELECTOR} is used by the command and data has set ids.</li>
     * </ul>
     *
     * @param updateList
     *     list of update data
     * @param writeListCmdOption
     *     given write cmd option
     * @param partialFilter
     *     partial filter
     * @return matching data for each update
     * @throws SpineException
     *     if invalid
     */
    Map<DATA, List<Integer>> validatePartialWriteDataAndGetMatchingData(
        List<DATA> updateList,
        WriteListCmdOption writeListCmdOption,
        FilterType partialFilter
    )
        throws SpineException {

        if (updateList.isEmpty()) {
            throw new SpineException(
                Error.COMMAND_REJECTED, "Received write request for data type "
                + getTypeInfo().getDataType().getSimpleName()
                + " without any change data."
            );
        }

        Map<DATA, List<Integer>> matchingDataMap = new HashMap<>();

        for (DATA update : updateList) {
            DataIdDescription.IdValidationStatus dataValidStatus
                = getTypeInfo().validateDataIdsForWrite(update);

            List<Integer> matchingDataIdxList;
            switch (writeListCmdOption) {
                case PARTIAL_WRITE_BY_FUNCTION_ID:
                    matchingDataIdxList
                        = dataListHolder.getDataForPartialWriteByFunctionId(update);
                    break;
                case PARTIAL_WRITE_BY_SELECTOR:
                    matchingDataIdxList
                        = dataListHolder.getDataForPartialWriteBySelector(
                        partialFilter,
                        dataValidStatus
                    );
                    break;
                default:
                    // Should never happen
                    throw new IllegalArgumentException(
                        "May not call partial write validation if cmdOption is no partial.");
            }

            matchingDataMap.put(update, matchingDataIdxList);

            List<DATA> matchingDataListCopy = dataListHolder.getDataCopies(
                matchingDataIdxList);

            callValidateUpdateForMatchingData(
                writeListCmdOption,
                update,
                matchingDataListCopy
            );
            // validation of each update with its matching data
            validateDataForPartialWrite(update, matchingDataListCopy);
        }

        // validation for each data on its own

        return matchingDataMap;
    }

    private void callValidateUpdateForMatchingData(
        WriteListCmdOption writeListCmdOption,
        DATA update,
        List<DATA> matchingDataListCopy
    ) throws SpineException {
        validateUpdateForMatchingData(
            update,
            matchingDataListCopy,
            writeListCmdOption
        );
        for (MatchingDataWriteListValidation<DATA> validation : useCaseMatchingDataWriteListValidations) {
            validation.validateUpdateForMatchingData(
                    update,
                    matchingDataListCopy,
                    writeListCmdOption
            );
        }
    }

    /**
     * Checks if the given cmd options contain an option that is not in the
     * {@link #allowedWriteListCmdOptions}. Throws {@link SpineException} if there
     * are invalid options. Valid cmdOptions are given by SPINE spec 5.3.4.2 and are
     * here defined by {@link WriteListCmdOption}. Feature Functions may have
     * restricted allowed options, which can be set by
     * {@link #setAllowedWriteCmdOptions}.
     *
     * @param writeListCmdOption
     *     writeCmdOption
     * @param deleteCmdOption
     *     deleteCmdOption
     * @throws SpineException
     *     if there are invalid options
     */
    void validateAllowedCmdOptions(
        WriteListCmdOption writeListCmdOption,
        WriteListCmdOption deleteCmdOption
    )
        throws SpineException {
        List<WriteListCmdOption> invalidOptions = new ArrayList<>();
        if (writeListCmdOption != null && !allowedWriteListCmdOptions.contains(
            writeListCmdOption)) {
            invalidOptions.add(writeListCmdOption);
        }
        if (deleteCmdOption != null && !allowedWriteListCmdOptions.contains(
            deleteCmdOption)) {
            invalidOptions.add(deleteCmdOption);
        }
        if (!invalidOptions.isEmpty()) {
            throw new SpineException(
                Error.COMMAND_NOT_SUPPORTED, "Received write request for data type "
                + getTypeInfo().getDataType().getSimpleName()
                + " with cmdOption options that are not allowed: \n"
                + Arrays.toString(invalidOptions.toArray())
            );
        }
    }

    /**
     * Call the {@link #writeData(Object, DataUpdateType, Integer)} and
     * {@link #useCaseWriteDataListListeners} listeners.
     *
     * @param data
     *     the data that was updated (copy of the original data), fully deleted or
     *     newly added
     * @param dataUpdateType
     *     if the data shall be updated, deleted or newly added
     * @param idx
     *     index where at the data was added for this feature function
     */
    void callWriteData(DATA data, DataUpdateType dataUpdateType, Integer idx) {
        writeData(data, dataUpdateType, idx);
        useCaseWriteDataListListeners.forEach(l -> l.writeData(data, dataUpdateType, idx));
    }

    /**
     * Call {@link #callWriteData(Object, DataUpdateType, Integer)} with the values
     * from the parameter.
     *
     * @param update
     *     Object containing arguments to
     *     {@link #callWriteData(Object, DataUpdateType, Integer)}
     */
    void callWriteData(DataUpdate<DATA> update) {
        callWriteData(update.getData(), update.getUpdateType(), update.getIdx());
    }

}
