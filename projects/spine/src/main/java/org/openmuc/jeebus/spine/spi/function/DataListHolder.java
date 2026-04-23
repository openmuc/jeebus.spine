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
import org.openmuc.jeebus.spine.api.validation.MatchingDataWriteListValidation;
import org.openmuc.jeebus.spine.impl.DataIdDescription;
import org.openmuc.jeebus.spine.spi.AdditionalSelectorCondition;
import org.openmuc.jeebus.spine.spi.AdditionalSelectorConditions;
import org.openmuc.jeebus.spine.utils.Filters;
import org.openmuc.jeebus.spine.utils.Selectors;
import org.openmuc.jeebus.spine.utils.SpineObjects;
import org.openmuc.jeebus.spine.utils.algorithms.Zipping;
import org.openmuc.jeebus.spine.utils.datatypes.Pair;
import org.openmuc.jeebus.spine.xsd.v1.FilterType;
import org.openmuc.jeebus.spine.xsd.v1.IncentiveListDataSelectorsType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Holder class that encapsulates access to the list of DATA objects used for
 * {@link ReadListFeatureFunction} and {@link ReadAndWriteListFeatureFunction}.
 * Implements many of the operations that just need to access the list and manipulate
 * its data.
 * <p>
 * Methods on this class perform no validation or notification. However, they take
 * functional interfaces as parameters, and/or return lists of notifications, so that
 * the feature functions can hook in validation and notification properly.
 *
 * @param <DATA>
 *     The type of data elements in the list.
 */
public class DataListHolder<DATA, SELECTOR> {
    private static final Logger logger
        = LoggerFactory.getLogger(DataListHolder.class);
    protected final List<DATA> dataList
        = Collections.synchronizedList(new ArrayList<>());
    private final ListFeatureFunctionTypeInfo<DATA, ?, SELECTOR, ?> typeInfo;

    public DataListHolder(ListFeatureFunctionTypeInfo<DATA, ?, SELECTOR, ?> typeInfo) {
        this.typeInfo = typeInfo;
    }

    /**
     * Filters a list of data objects by a given {@link FilterType} filter.
     * <b>IMPORTANT NOTE:</b> This method is able to filter for selector attributes
     * that match respective data
     * attributes by name and on which {@link Objects#equals} can be used to check if
     * a selector attribute matches the respective data attribute. There are some
     * selector attributes that implement different semantics, e.g.
     * {@link IncentiveListDataSelectorsType#getTimestampInterval()} which selects
     * data attribute values that are inside the given interval. If this is the case
     * for the Feature Function that is implemented, add a
     * {@link AdditionalSelectorCondition} to {@link AdditionalSelectorConditions}
     * which should implement the logic to check if given data matches given
     * selectors.
     *
     * @param filter
     *     the filter
     * @param validateReadFilter
     *     method by which to validate the filter parts
     * @return a list of data objects filtered by given filter for given selectorType
     * and given elementsObject
     * @throws SpineException
     *     if there are illegal selector types in the filter that are not of the
     *     given type
     */
    <ELEMENTS> List<DATA> readData(
        FilterType filter,
        Class<ELEMENTS> elementsType,
        ValidateReadFilter<SELECTOR, ELEMENTS> validateReadFilter
    ) throws SpineException {
        if (filter == null) {
            return dataList;
        }

        ELEMENTS elements = Filters.getElementsObject(filter, elementsType);

        List<SELECTOR> selectorList = Filters.getSelectors(
            filter,
            typeInfo.getSelectorType()
        );
        validateReadFilter.accept(selectorList, elements);
        List<DATA> selectedDataList
            = new ArrayList<>(getSelectedData(selectorList).values());
        return SpineObjects.getDataListForTaggedElements(elements, selectedDataList);
    }

    /**
     * Get a reference to the data holder's underlying list. Access to this is
     * necessary for tests and for the implementation of the transaction mechanism,
     * which is why this method exists at all.
     * <p>
     * Calling it from anywhere else is strongly discouraged, as this can compromise
     * the data integrity model of the feature functions.
     *
     * @return The underlying list of this data holder.
     */
    List<DATA> getDataList() {
        return dataList;
    }

    /**
     * Get a copy of the list entry at a specified index.
     *
     * @param idx
     *     The index to copy from
     * @return (a copy of) the entry at the given index.
     */
    public synchronized DATA getDataCopy(int idx) {
        return SpineObjects.dataCopy(dataList.get(idx));
    }

    /**
     * Returns a copy of the first found data for the given condition.
     *
     * @param predicate
     *     the condition
     * @return copy of the first found data, null if none is found
     */
    public synchronized DATA getDataCopyForFirst(Predicate<DATA> predicate) {
        DATA data = dataList.stream()
            .filter(predicate)
            .findFirst()
            .orElse(null);
        return data == null ? null : SpineObjects.dataCopy(data);
    }

    /**
     * Returns a list of data copies for data that matches given condition
     *
     * @param predicate
     *     the condition
     * @return list of data copies
     */
    public synchronized List<DATA> getDataCopiesFor(Predicate<DATA> predicate) {
        return dataList.stream()
            .filter(predicate)
            .map(SpineObjects::dataCopy)
            .collect(Collectors.toList());
    }

    public synchronized List<DATA> getDataCopies(List<Integer> idxList) {
        return idxList
            .stream()
            .map(dataList::get)
            .map(SpineObjects::dataCopy)
            .collect(Collectors.toList());
    }

    public List<DATA> getFullCopy() {
        return SpineObjects.deepCopyList(dataList);
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
    List<DataUpdate<DATA>> fullWrite(
        Map<DATA, Integer> fullWriteMatchingDataIdxMap,
        List<DATA> writeDataList,
        List<DATA> updateList,
        boolean isWriteForValidation
    ) {
        if (typeInfo.isIdentifiableList()) {
            return fullWriteForIdentifiableList(
                fullWriteMatchingDataIdxMap,
                writeDataList,
                isWriteForValidation
            );
        }
        else {
            // According to SPINE 5.3.4.1 non-identifiable lists can only be written as whole
            writeDataList.clear();
            writeDataList.addAll(updateList);
            if (!isWriteForValidation) {
                return Zipping
                    .zipWithCount(writeDataList.stream(), DataUpdate::added)
                    .collect(Collectors.toList());
            }
            else {
                return List.of();
            }
        }
    }

    /**
     * Executes a full write for the matchingData on the list held by this holder. If
     * the list is not identifiable this method will simply remove all data and add
     * the new data as defined by SPINE.
     *
     * @param fullWriteMatchingDataIdxMap
     *     the matching data map
     * @param updateList
     *     the update list given by the write command
     * @param isWriteForValidation
     *     if this write is only used for validation (no write listeners are called)
     */
    List<DataUpdate<DATA>> fullWrite(
        Map<DATA, Integer> fullWriteMatchingDataIdxMap, List<DATA> updateList,
        boolean isWriteForValidation
    ) {
        return fullWrite(
            fullWriteMatchingDataIdxMap,
            dataList,
            updateList,
            isWriteForValidation
        );
    }

    /**
     * Executes a full write for the matchingData on the given list to write on. This
     * is used for identifiable lists defined by
     * {@link ReadAndWriteListFeatureFunction#isIdentifiableList}.
     *
     * @param fullWriteMatchingDataIdxMap
     *     the matching data map
     * @param writeDataList
     *     the data list to write on
     * @param isWriteForValidation
     *     if this write is only used for validation (no write listeners are called)
     * @return a list of updates to notify about, or an empty list if
     * {@code isWriteForValidation == true}.
     */
    List<DataUpdate<DATA>> fullWriteForIdentifiableList(
        Map<DATA, Integer> fullWriteMatchingDataIdxMap, List<DATA> writeDataList,
        boolean isWriteForValidation
    ) {
        List<DataUpdate<DATA>> updates = new ArrayList<>();
        for (Map.Entry<DATA, Integer> entry : fullWriteMatchingDataIdxMap.entrySet()) {
            int idx = entry.getValue();
            DATA update = entry.getKey();
            if (idx == -1) {
                // data with id not yet existent, add data
                writeDataList.add(update);
                idx = dataList.size() - 1;
                if (!isWriteForValidation) {
                    updates.add(DataUpdate.added(update, idx));
                }
            }
            else {
                writeDataList.set(idx, update);
                if (!isWriteForValidation) {
                    updates.add(DataUpdate.updated(update, idx));
                }
            }
        }
        return updates;
    }

    /**
     * Executes a partial write on each data described by the given matchingData map
     * with the given update.
     *
     * @param matchingDataMap
     *     map of the matching data
     * @return a list of updates to (maybe) notify about
     */
    List<DataUpdate<DATA>> partialWrite(Map<DATA, List<Integer>> matchingDataMap) {
        List<DataUpdate<DATA>> updates = new ArrayList<>();
        for (Map.Entry<DATA, List<Integer>> entry : matchingDataMap.entrySet()) {
            for (Integer idx : entry.getValue()) {
                DATA data = dataList.get(idx);
                SpineObjects.writeForAllNonNullProperties(data, entry.getKey());

                updates.add(DataUpdate.updated(data, idx));
            }
        }
        return updates;
    }

    List<DataUpdate<DATA>> deleteSpecifiedIndices(int[] indices) {
        List<DataUpdate<DATA>> updates = new ArrayList<>(indices.length);
        for (int i = indices.length - 1; i >= 0; i--) {
            int idx = indices[i];
            DATA removedData = dataList.get(idx);
            dataList.set(idx, null);
            updates.add(DataUpdate.deleted(removedData, idx));
        }
        return updates;
    }

    Map<DATA, Integer> getMatchingDataForFullWrite(
        List<DATA> updateList,
        MatchingDataWriteListValidation<DATA> valid
    )
        throws SpineException {
        Map<DATA, Integer> matchingDataIdxMap = new HashMap<>();
        for (DATA update : updateList) {
            int matchingWritableIdx = IntStream
                .range(0, dataList.size())
                .filter(i -> typeInfo
                    .getDataIdDesc()
                    .dataMatchesForIdDescription(dataList.get(i), update))
                .findFirst()
                .orElse(-1);
            matchingDataIdxMap.put(update, matchingWritableIdx);
            List<DATA> matchingDataList = matchingWritableIdx == -1 ?
                new ArrayList<>()
                :
                List.of(dataList.get(matchingWritableIdx));

            List<DATA> matchingDataListCopy = SpineObjects.deepCopyList(
                matchingDataList);
            valid.validateUpdateForMatchingData(
                update,
                matchingDataListCopy,
                WriteListCmdOption.FULL_WRITE
            );
        }
        return matchingDataIdxMap;

    }

    List<DataUpdate<DATA>> deleteBy(Object elements, List<SELECTOR> selectors) {
        List<DataUpdate<DATA>> updates = new ArrayList<>();
        Map<Integer, DATA> selectedDataMap = Selectors.getSelectedData(
            dataList,
            selectors,
            typeInfo
        );
        for (Map.Entry<Integer, DATA> selectedDataEntry : selectedDataMap.entrySet()) {

            DATA dataCopy = SpineObjects.dataCopy(selectedDataEntry.getValue());
            SpineObjects.deleteElements(selectedDataEntry.getValue(), elements);

            updates.add(DataUpdate.updated(dataCopy, selectedDataEntry.getKey()));
        }
        return updates;
    }

    List<Integer> matchingIndices(Predicate<DATA> predicate) {
        return Zipping.indicesWhere(
                dataList.stream(),
                (idx, data) -> predicate.test(data)
            )
            .collect(Collectors.toList());
    }

    synchronized List<DATA> removeData(List<Integer> idxList) {
        List<DATA> removedData = new ArrayList<>(idxList.size());
        idxList.forEach(idx -> {
            removedData.add(dataList.get(idx));
            dataList.set(idx, null);
        });
        return removedData;
    }

    synchronized Map<DATA, DATA> updateData(Map<Integer, DATA> updateMap) {
        HashMap<DATA, DATA> updateDataMap = new HashMap<>(updateMap.size());
        for (Map.Entry<Integer, DATA> entry : updateMap.entrySet()) {
            updateDataMap.put(
                SpineObjects.dataCopy(dataList.get(entry.getKey())),
                entry.getValue()
            );
            dataList.set(entry.getKey(), SpineObjects.dataCopy(entry.getValue()));
        }
        return updateDataMap;
    }

    Map<Integer, DATA> getSelectedData(List<SELECTOR> selectorList) {
        return Selectors.getSelectedData(dataList, selectorList, typeInfo);
    }

    synchronized Pair<List<Integer>, Map<DATA, DATA>> addData(List<DATA> addDataList) {
        List<Integer> idxList = new ArrayList<>();
        Map<DATA, DATA> updateDataMap = new HashMap<>();
        for (DATA addData : addDataList) {
            updateDataMap.put(null, addData);
            dataList.add(addData);
            idxList.add(dataList.size() - 1);
        }
        return Pair.of(idxList, updateDataMap);
    }

    List<Integer> getDataForPartialWriteBySelector(
        FilterType partialFilter,
        DataIdDescription.IdValidationStatus dataValidStatus
    ) throws SpineException {
        List<Integer> matchingDataIdxList;
        if (dataValidStatus != DataIdDescription.IdValidationStatus.IDS_NULL) {
            throw new SpineException(
                Error.COMMAND_REJECTED,
                "Received partial write request with selectors "
                    + "for data type "
                    + typeInfo.getDataType().getSimpleName()
                    + " with data that has set ids."
            );
        }
        List<SELECTOR> selectorList = Filters.getSelectors(
            partialFilter,
            typeInfo.getSelectorType()
        );
        List<Integer> selectedDataIdxList = new ArrayList<>(getSelectedData(
            selectorList).keySet());
        // for each update the selected data shall be updated, usually one would only have one update in this
        // case
        if (selectedDataIdxList.isEmpty()) {
            logger.warn(
                "Could not find any data for received partial write request for data"
                    + " type {}. The Command will not have any effect.",
                typeInfo.getDataType().getSimpleName()
            );
        }
        matchingDataIdxList = selectedDataIdxList;
        return matchingDataIdxList;
    }

    List<Integer> getDataForPartialWriteByFunctionId(DATA update) throws
        SpineException {
        List<Integer> matchingDataIdxList;
        matchingDataIdxList = matchingIndices(data -> typeInfo
            .getDataIdDesc()
            .dataMatchesForIdDescription(data, update));
        if (matchingDataIdxList.isEmpty()) {
            throw new SpineException(
                Error.COMMAND_REJECTED, "Received write request of type "
                + typeInfo.getDataType().getSimpleName()
                + " for data with id that could not be found."
            );
        }
        if (matchingDataIdxList.size() > 1) {
            logger.error(
                "Found corrupted data for {} (multiple entries with same id)",
                typeInfo.getDataType().getSimpleName()
            );
            throw new SpineException(
                Error.GENERAL_ERROR, "Received write request of type "
                + typeInfo.getDataType().getSimpleName()
                + " for data with id and found multiple possible entries."
            );
        }
        return matchingDataIdxList;
    }

    /**
     * Executes a delete write by the given delete filter on the
     * {@link DataListHolder#dataList}.
     *
     * @param deleteFilter
     *     the delete filter to delete by
     * @param writeListCmdOption
     *     the {@link WriteListCmdOption} that defines what type of delete this is.
     * @throws SpineException
     *     if the validation fails
     */
    List<DataUpdate<DATA>> deleteData(
        FilterType deleteFilter,
        WriteListCmdOption writeListCmdOption
    ) throws SpineException {
        if (writeListCmdOption == WriteListCmdOption.DELETE_BY_SELECTOR) {
            int[] filteredDataIdxArr = getSelectedDataIdxListForFilter(deleteFilter);
            return deleteSpecifiedIndices(filteredDataIdxArr);
        }
        else if (writeListCmdOption == WriteListCmdOption.DELETE_ELEMENTS
            || writeListCmdOption
            == WriteListCmdOption.DELETE_ELEMENTS_BY_SELECTOR) {
            return deleteBy(
                Filters.getElementsObject(
                    deleteFilter,
                    typeInfo.getElementsType()
                ),
                Filters.getSelectors(
                    deleteFilter,
                    typeInfo.getSelectorType()
                )
            );
        }
        else {
            return List.of();
        }
    }

    /**
     * Gets the indexes of the selected data from the given filter for the
     * {@link DataListHolder#dataList}
     *
     * @param filter
     *     the given filter
     * @return index array
     * @throws SpineException
     *     if there is an illegal selector in the filter
     */
    int[] getSelectedDataIdxListForFilter(FilterType filter) throws SpineException {

        List<SELECTOR> selectorList = Filters.getSelectors(
            filter,
            typeInfo.getSelectorType()
        );
        if (selectorList.isEmpty()) {
            return new int[0];
        }
        return IntStream.range(0, dataList.size())
            .filter(i -> Selectors.dataMatchesAnySelector(
                dataList.get(i),
                selectorList,
                typeInfo
            ))
            .toArray();
    }
}