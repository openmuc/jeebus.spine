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
import org.openmuc.jeebus.spine.api.options.ReadListCmdOption;
import org.openmuc.jeebus.spine.api.validation.ReadListValidation;
import org.openmuc.jeebus.spine.impl.DataIdDescription;
import org.openmuc.jeebus.spine.utils.Selectors;
import org.openmuc.jeebus.spine.utils.SpineObjects;
import org.openmuc.jeebus.spine.utils.SpineUtilities;
import org.openmuc.jeebus.spine.utils.algorithms.Grouping;
import org.openmuc.jeebus.spine.xsd.v1.CmdType;
import org.openmuc.jeebus.spine.xsd.v1.FeatureAddressType;
import org.openmuc.jeebus.spine.xsd.v1.FilterType;

import java.beans.PropertyDescriptor;
import java.util.*;
import java.util.function.Predicate;

public abstract class ReadListFeatureFunction<DATA, DATA_LIST, SELECTOR, ELEMENTS,
    TYPE extends ListFeatureFunctionTypeInfo<DATA, DATA_LIST, SELECTOR, ELEMENTS>>
    extends DataFeatureFunction<DATA, ELEMENTS, TYPE> {

    protected final DataListHolder<DATA, SELECTOR> dataListHolder;

    protected final ListFeatureFunctionNotifier<DATA, DATA_LIST, SELECTOR, ELEMENTS>
        listFeatureFunctionNotifier;

    protected Set<ReadListCmdOption> allowedReadListCmdOptions = EnumSet.allOf(
        ReadListCmdOption.class);

    private final List<ReadListValidation<SELECTOR, ELEMENTS>> useCaseReadListValidations = new ArrayList<>();

    protected Set<ReadListCmdOption> getAllowedReadCmdOptions() {
        return allowedReadListCmdOptions;
    }

    /**
     * Sets the {@link ReadListCmdOption} that are allowed to use for the given
     * data.
     *
     * @param allowedReadListCmdOptions
     *     allowed options
     */
    public void setAllowedReadCmdOptions(ReadListCmdOption... allowedReadListCmdOptions) {
        this.allowedReadListCmdOptions.retainAll(Set.of(allowedReadListCmdOptions));
    }

    /**
     * Sets a validation for the read command like {@link #validateReadCmd}. Should
     * be set by the Use Case Implementation. Throws {@link SpineException} if the
     * validation fails.
     *
     * @param useCaseReadListValidation
     *     functional interface function {@link ReadListValidation}
     */
    public void addUseCaseReadValidation(ReadListValidation<SELECTOR, ELEMENTS> useCaseReadListValidation) {
        this.useCaseReadListValidations.add(useCaseReadListValidation);
    }

    /**
     * Validates the read command. Must be implemented by the specific Feature
     * Function. Throws {@link SpineException} if the validation fails.
     *
     * @param selectorList
     *     the list of given selectors, may be empty
     * @param elements
     *     the elementsType object, may be null
     * @param readListCmdOption
     *     the CmdOption that was used by the request
     * @throws SpineException
     *     if the validation fails
     */
    protected abstract void validateReadCmd(
        List<SELECTOR> selectorList, ELEMENTS elements,
        ReadListCmdOption readListCmdOption
    )
        throws SpineException;

    /**
     * Constructs a ReadFeatureFunction. If FeatureFunction shall be none
     * identifiable use an empty {@link DataIdDescription} by using
     * {@link DataIdDescription#getNoneIdentifiableDataDescription(Class)}. This
     * class automatically executes read commands for the given Feature Function.
     * Additional validation of commands is done by abstract validation methods and
     * validation functions that may be set by the Use Case Implementation.
     *
     * @param functionName
     *     the name of the function
     * @param typeInfo
     *     the RTTI object
     */
    public ReadListFeatureFunction(String functionName, TYPE typeInfo) {
        super(functionName, typeInfo);
        this.dataListHolder = new DataListHolder<>(typeInfo);
        listFeatureFunctionNotifier = new ListFeatureFunctionNotifier<>(
            this, feature,
            getDataListHolder(), typeInfo
        );
    }

    @Override
    public CmdType read(FilterType filter, FeatureAddressType sourceAddress) throws
        SpineException {
        synchronized (dataListHolder) {
            if (!this.isReadable()) {
                throw new UnsupportedOperationException();
            }
            return readDataAndBuildReadReplyCmd(filter);
        }
    }

    @Override
    public SpineAcknowledgment write(
        CmdType cmd,
        FeatureAddressType sourceAddress
    ) throws SpineException {
        throw new UnsupportedOperationException();
    }

    @Override
    void validateDataComplete(DATA data) throws DataValidationException {
        if (getTypeInfo().isIdentifiableList()) {
            if (getTypeInfo().getDataIdDesc().validateData(data)
                != DataIdDescription.IdValidationStatus.VALID_ID) {
                throw new DataValidationException("data has missing ids");
            }
        }
        super.validateDataComplete(data);
    }

    public DATA getDataCopy(int idx) {
        return getDataListHolder().getDataCopy(idx);
    }

    /**
     * Returns a copy of the first found data for the given condition.
     *
     * @param predicate
     *     the condition
     * @return copy of the first found data, null if none is found
     */
    public DATA getDataCopyForFirst(Predicate<DATA> predicate) {
        return getDataListHolder().getDataCopyForFirst(predicate);
    }

    /**
     * Returns a list of data copies for data that matches given condition
     *
     * @param predicate
     *     the condition
     * @return list of data copies
     */
    public List<DATA> getDataCopiesFor(Predicate<DATA> predicate) {
        return getDataListHolder().getDataCopiesFor(predicate);
    }

    public List<DATA> getDataCopies(List<Integer> idxList) {
        return getDataListHolder().getDataCopies(idxList);
    }

    /**
     * Updates data at given index by changing to the given update data.
     *
     * @param idx
     *     the idx of the data that should be updated
     * @param update
     *     the update data
     * @throws DataValidationException
     *     if data validation fails
     */
    public void updateData(int idx, DATA update) throws DataValidationException {
        Map<Integer, DATA> updateMap = new HashMap<>();
        updateMap.put(idx, update);
        updateData(updateMap);
    }

    /**
     * Updates each of the data from the given map at given index by changing to the
     * given update data.
     *
     * @param updateMap
     *     map of updates with idx and data as entries
     * @throws DataValidationException
     *     if data validation fails
     */
    public void updateData(Map<Integer, DATA> updateMap) throws
        DataValidationException {
        synchronized (dataListHolder) {
            for (DATA update : updateMap.values()) {
                validateDataComplete(update);
            }
            listFeatureFunctionNotifier.notifySubscribersForDataUpdate(
                getDataListHolder().updateData(updateMap)
            );
        }
    }

    /**
     * Adds given data and notifies subscribers.
     *
     * @param addData
     *     data to add
     * @return idx of the added data
     * @throws DataValidationException
     *     if data validation fails
     */
    public int addData(DATA addData) throws DataValidationException {
        return addData(List.of(addData)).get(0);
    }

    /**
     * Adds given data and notifies subscribers.
     *
     * @param addDataList
     *     data to add
     * @return list of indices for each of the added data in order of the given list
     * @throws DataValidationException
     *     if data validation fails
     */
    public List<Integer> addData(List<DATA> addDataList) throws
        DataValidationException {
        synchronized (dataListHolder) {
            for (DATA addData : addDataList) {
                validateDataComplete(addData);
            }
            return getDataListHolder()
                .addData(addDataList)
                .consumeRight(this::notifySubscribersForDataUpdate);
        }
    }

    public void removeData(List<Integer> idxList) {
        synchronized (dataListHolder) {
            listFeatureFunctionNotifier.notifySubscribersForDeletion(
                getDataListHolder().removeData(idxList));
        }
    }

    public void removeData(int idx) {
        removeData(List.of(idx));
    }

    /**
     * Notifies subscribers when whole data entries were deleted.
     *
     * @param deletedDataList
     *     the list of data that was deleted.
     */
    void notifySubscribersForDeletion(List<DATA> deletedDataList) {
        // TODO: test this

        listFeatureFunctionNotifier.notifySubscribersForDeletion(deletedDataList);
    }

    List<SELECTOR> createIdSelectorsForData(List<DATA> dataList) {
        List<SELECTOR> selectorList = new ArrayList<>();
        try {
            for (DATA data : dataList) {
                for (PropertyDescriptor desc : getTypeInfo()
                    .getDataIdDesc()
                    .getAllIdPropertyDescriptors()) {
                    Object attribute = desc.getReadMethod()
                        .invoke(data);
                    SELECTOR selector = getTypeInfo()
                        .getSelectorType()
                        .getDeclaredConstructor().newInstance();
                    String writeMethodName = desc.getWriteMethod().getName();
                    getTypeInfo()
                        .getSelectorType()
                        .getMethod(writeMethodName, desc.getPropertyType())
                        .invoke(selector, attribute);
                    selectorList.add(selector);
                }
            }
            return selectorList;
        }
        catch (ReflectiveOperationException e) {
            /*
             TODO: Should not happen in theory assuming identifiers are base objects
              and always also included as attributes in the selector class.
              Check this and write tests!
            */
            throw new RuntimeException("Failed to create selectors from data.", e);
        }
    }

    void notifySubscribersForDataAddition(List<DATA> updateDataList) {
        listFeatureFunctionNotifier.notifySubscribersForDataAddition(updateDataList);
    }

    /**
     * Uses {@link #notifySubscribersForDataUpdate(Map)} to notify subscribers about
     * given update
     *
     * @param update
     *     the update to add
     */
    void notifySubscribersForDataUpdate(DATA oldData, DATA update) {
        listFeatureFunctionNotifier.notifySubscribersForDataUpdate(oldData, update);
    }

    /**
     * Notifies subscribers for data that was updated. This will notify about all
     * elements that are set. If {@link #isIdentifiableList}, only uses function body
     * without any selectors / elements values that are changed. If not
     * {@link #isIdentifiableList} any value including null may be passed, the whole
     * data list will be notified in this case (According to SPINE 5.3.4.2 notifying
     * for not identifiable list entries is only possible by passing the whole
     * list).
     * <p>
     * This method also notifies for data elements that were deleted (set to null in
     * the update). If for each data where elements were deleted, the exact same
     * elements were deleted, this will notify in one message. if not it will be
     * notified in multiple messages, as only one elementsType object may be set in a
     * filter for notifying.
     *
     * @param updateDataMap
     *     the list of new data entries
     */
    void notifySubscribersForDataUpdate(Map<DATA, DATA> updateDataMap) {

        listFeatureFunctionNotifier.notifySubscribersForDataUpdate(updateDataMap);
    }

    /**
     * Notifies subscribers about elements that were deleted for data that matches
     * the given selectors
     *
     * @param elements
     *     elements that were deleted
     * @param selectorList
     *     selectors that identify the deleted elements
     */
    void notifySubscribersForDeletion(
        ELEMENTS elements,
        List<SELECTOR> selectorList
    ) {
        listFeatureFunctionNotifier.notifySubscribersForDeletion(
            elements,
            selectorList
        );
    }

    /**
     * Takes a map with old data and update data and for each entry creates selectors
     * that identify the data by its id and an {@link ELEMENTS} type object that
     * determines which elements were deleted. Deleted elements are such elements
     * that are not null in the old data and null in the update data. This method
     * also groups entries when the created {@link ELEMENTS} type object equal to
     * another to minimize necessary notify messages.
     *
     * @param updateDataMap
     *     maps old data to its updated data
     * @return a map with elements and selectors that can be added to a filter for
     * notifying deletion
     */
    Map<ELEMENTS, List<SELECTOR>> getDeletionElementsForSelectorsMap(Map<DATA, DATA> updateDataMap) {

        List<ELEMENTS> elementsList = new ArrayList<>();
        List<SELECTOR> selectorList = new ArrayList<>();

        for (Map.Entry<DATA, DATA> entry : updateDataMap.entrySet()) {
            if (entry.getKey() == null) {
                // new data
                continue;
            }
            try {
                ELEMENTS elements = getTypeInfo().getElementsType()
                    .getDeclaredConstructor()
                    .newInstance();
                boolean wasWritten = SpineObjects.writeDeleteElements(
                    elements,
                    entry.getKey(),
                    entry.getValue()
                );
                if (!wasWritten) {
                    // if no element was written no deletion must be notified
                    continue;
                }
                SELECTOR selector
                    = createIdSelectorsForData(List.of(entry.getValue())).get(0);
                elementsList.add(elements);
                selectorList.add(selector);
            }
            catch (ReflectiveOperationException e) {
                throw new RuntimeException(e);
            }
        }

        return Grouping.groupZipMap(
            elementsList,
            selectorList,
            SpineObjects::dataEquals
        );
    }

    /**
     * This method is mainly used for read methods in Feature Functions. It filters
     * the data stored in {@link DataListHolder#dataList} via
     * {@link DataListHolder#readData} and builds a {@link CmdType} object that can
     * be directly returned by the Feature Function read method.
     *
     * @param filter
     *     the given filter
     * @return the {@link CmdType} object
     */
    CmdType readDataAndBuildReadReplyCmd(FilterType filter) throws SpineException {
        List<DATA> filteredDataList = getDataListHolder().readData(
            filter,
            getTypeInfo().getElementsType(), this::validateReadFilter
        );

        CmdType replyCmd = new CmdType();
        replyCmd.setFunction(getFunctionName());

        if (filter != null && filter.getCmdControl() != null
            && filter.getCmdControl().getPartial() != null) {
            FilterType replyFilter = new FilterType();
            replyFilter.setCmdControl(SpineUtilities.getPartialCmdControl());
            replyCmd.getFilter().add(replyFilter);
        }

        getTypeInfo().setCmdDataList(replyCmd, filteredDataList);

        return replyCmd;
    }

    /**
     * Validates the given selectors and elements. {@link #setAllowedReadCmdOptions}
     * may be used to set the allowed cmd options.
     *
     * @param selectorList
     *     list of given selectors
     * @param elements
     *     list of given elements
     * @throws SpineException
     *     if validation fails
     */
    void validateReadFilter(List<SELECTOR> selectorList, ELEMENTS elements) throws
        SpineException {
        ReadListCmdOption readListCmdOption = Selectors.getReadListCmdOption(
            selectorList,
            elements
        );
        if (!allowedReadListCmdOptions.contains(readListCmdOption)) {
            throw new SpineException(
                Error.COMMAND_NOT_SUPPORTED, "Received write request for data type "
                + getTypeInfo().getDataType().getSimpleName()
                + " with cmdOption that is not allowed: "
                + readListCmdOption
            );
        }
        validateReadCmd(selectorList, elements, readListCmdOption);
        for (ReadListValidation<SELECTOR, ELEMENTS> validation : useCaseReadListValidations) {
            validation.validateReadCmd(
                    selectorList,
                    elements,
                    readListCmdOption
            );
        }
    }

    boolean isIdentifiableList() {
        return getTypeInfo().isIdentifiableList();
    }

    @Override
    public void setFeature(Feature feature) {
        super.setFeature(feature);
        listFeatureFunctionNotifier.setFeature(feature);
    }

    DataListHolder<DATA, SELECTOR> getDataListHolder() {
        return dataListHolder;
    }

    /**
     * Called when a {@link DataUpdateTransaction} finishes so that the feature
     * function knows to (re)build auxiliary data structures, if it has any.
     * @param idxList the list of indices that were changed/added
     * @param dataList the new data at those indices
     */
    public void dataUpdatedByTransaction(List<Integer> idxList, List<DATA> dataList) {

    }

    @Override
    public Snapshottable.Snapshot takeSnapshot() {
        List<DATA> old = SpineObjects.deepCopyList(dataListHolder.getDataList());
        return () -> {
            List<DATA> dataList = dataListHolder.getDataList();
            dataList.clear();
            dataList.addAll(old);
        };
    }
}
