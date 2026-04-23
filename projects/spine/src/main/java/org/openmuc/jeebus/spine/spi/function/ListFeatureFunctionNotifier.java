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

import org.openmuc.jeebus.spine.api.Feature;
import org.openmuc.jeebus.spine.utils.Filters;
import org.openmuc.jeebus.spine.xsd.v1.CmdControlType;
import org.openmuc.jeebus.spine.xsd.v1.CmdType;
import org.openmuc.jeebus.spine.xsd.v1.ElementTagType;
import org.openmuc.jeebus.spine.xsd.v1.FilterType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Delegate class that handles notifying subscribers when the data of a
 * {@link ReadListFeatureFunction} changes.
 *
 * @param <DATA>
 *     type of data that the feature function holds
 * @param <DATA_LIST>
 *     wrapper type for {@code List<DATA>}
 * @param <SELECTOR>
 *     type of selectors for data
 * @param <ELEMENTS>
 *     type of elements for data
 */
public class ListFeatureFunctionNotifier<DATA, DATA_LIST, SELECTOR, ELEMENTS> {
    protected static final Logger logger = LoggerFactory.getLogger(
        ListFeatureFunctionNotifier.class);
    public static final String FEATURE_NOT_ADDED_MESSAGE
        = "Feature was not added to entity yet. Skipping notify.";
    private final ReadListFeatureFunction<DATA, DATA_LIST, SELECTOR, ELEMENTS, ?>
        parent;
    private Feature feature;
    private final DataListHolder<DATA, SELECTOR> dataListHolder;
    private final ListFeatureFunctionTypeInfo<DATA, DATA_LIST, SELECTOR, ELEMENTS>
        typeInfo;

    public ListFeatureFunctionNotifier(
        ReadListFeatureFunction<DATA, DATA_LIST, SELECTOR, ELEMENTS, ?> parent,
        Feature feature,
        DataListHolder<DATA, SELECTOR> dataListHolder,
        ListFeatureFunctionTypeInfo<DATA, DATA_LIST, SELECTOR, ELEMENTS> typeInfo
    ) {
        this.parent = parent;
        this.feature = feature;
        this.dataListHolder = dataListHolder;
        this.typeInfo = typeInfo;
    }

    void notifySubscribersForDeletion(DATA deletedData) {
        notifySubscribersForDeletion(List.of(deletedData));
    }

    /**
     * Notifies subscribers when whole data entries were deleted.
     *
     * @param deletedDataList
     *     the list of data that was deleted.
     */
    void notifySubscribersForDeletion(List<DATA> deletedDataList) {
        // TODO: test this

        List<SELECTOR> selectorList
            = parent.createIdSelectorsForData(deletedDataList);

        CmdType cmd = new CmdType();
        cmd.setFunction(parent.getFunctionName());
        FilterType deleteFilter = new FilterType();
        deleteFilter.setCmdControl(new CmdControlType());
        deleteFilter.getCmdControl().setDelete(new ElementTagType());

        Filters.getSelectors(deleteFilter, typeInfo.getSelectorType())
            .addAll(selectorList);

        cmd.getFilter().add(deleteFilter);

        notifyIfNonnull(cmd);
    }

    void notifySubscribersForDataAddition(List<DATA> updateDataList) {
        Map<DATA, DATA> updateDataMap = new HashMap<>();
        updateDataList.forEach(
            data -> updateDataMap.put(null, data)
        );
        notifySubscribersForDataUpdate(updateDataMap);
    }

    /**
     * Uses {@link #notifySubscribersForDataUpdate(Map)} to notify subscribers about
     * given update
     *
     * @param update
     *     the update to add
     */
    void notifySubscribersForDataUpdate(DATA oldData, DATA update) {
        Map<DATA, DATA> updateDataMap = Map.of(oldData, update);
        notifySubscribersForDataUpdate(updateDataMap);
    }

    /**
     * Notifies subscribers for data that was updated. This will notify about all
     * elements that are set. If {@link ReadListFeatureFunction#isIdentifiableList},
     * only uses function body without any selectors / elements values that are
     * changed. If not {@link ReadListFeatureFunction#isIdentifiableList} any value
     * including null may be passed, the whole data list will be notified in this
     * case (According to SPINE 5.3.4.2 notifying for not identifiable list entries
     * is only possible by passing the whole list).
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

        CmdType cmd = new CmdType();
        cmd.setFunction(parent.getFunctionName());

        if (!parent.isIdentifiableList()) {
            typeInfo.setCmdDataList(cmd, dataListHolder.getFullCopy());
            notifyIfNonnull(cmd);
            return;
        }

        if (updateDataMap.isEmpty()) {
            logger.error(
                "May not notify identifiable list entry types with empty data list. Aborting notify.");
            return;
        }

        FilterType partialFilter = new FilterType();
        partialFilter.setCmdControl(new CmdControlType());
        partialFilter.getCmdControl().setPartial(new ElementTagType());
        cmd.getFilter().add(partialFilter);

        typeInfo.setCmdDataList(cmd, new ArrayList<>(updateDataMap.values()));

        Map<ELEMENTS, List<SELECTOR>> deletionMap
            = parent.getDeletionElementsForSelectorsMap(updateDataMap);

        if (deletionMap.size() == 1) {
            // if there is a distinct deletion of elements for a list of selectors, it can be notified with one msg
            FilterType deleteFilter = new FilterType();
            deleteFilter.setCmdControl(new CmdControlType());
            deleteFilter.getCmdControl().setDelete(new ElementTagType());
            Map.Entry<ELEMENTS, List<SELECTOR>> firstEntry = deletionMap.entrySet()
                .iterator()
                .next();
            Filters.getSelectors(deleteFilter, typeInfo.getSelectorType())
                .addAll(firstEntry.getValue());
            parent.setElements(deleteFilter, firstEntry.getKey());
            cmd.getFilter().add(deleteFilter);
        }
        if (feature != null) {
            feature.notifySubscribers(cmd);
        }
        else {
            logger.debug(FEATURE_NOT_ADDED_MESSAGE);
        }
        if (deletionMap.size() > 1) {
            // if deletion of elements cannot be put into one delete filter it must be notified more than once
            for (Map.Entry<ELEMENTS, List<SELECTOR>> deletion : deletionMap.entrySet()) {
                notifySubscribersForDeletion(deletion.getKey(), deletion.getValue());
            }
        }
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
        CmdType cmd = new CmdType();
        cmd.setFunction(parent.getFunctionName());
        FilterType deleteFilter = new FilterType();
        deleteFilter.setCmdControl(new CmdControlType());
        deleteFilter.getCmdControl().setDelete(new ElementTagType());
        Filters.getSelectors(deleteFilter, typeInfo.getSelectorType())
            .addAll(selectorList);
        parent.setElements(deleteFilter, elements);
        notifyIfNonnull(cmd);
    }

    private void notifyIfNonnull(CmdType cmd) {
        if (feature != null) {
            feature.notifySubscribers(cmd);
        }
        else {
            logger.debug(FEATURE_NOT_ADDED_MESSAGE);
        }
    }

    void notifySubscribers(CmdType cmd) {
        feature.notifySubscribers(cmd);
    }

    void setFeature(Feature feature) {
        this.feature = feature;
    }
}