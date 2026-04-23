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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DataUpdateTransaction {

    private final static Logger logger = LoggerFactory.getLogger(
        DataUpdateTransaction.class);

    List<ListFeatureFunctionAddDataTransaction<?>> getListAddTransactionList() {
        return listAddTransactionList;
    }

    List<SingleFeatureFunctionUpdateDataTransaction<?>> getSingleUpdateTransactionList() {
        return singleUpdateTransactionList;
    }

    boolean isFinished() {
        return finished;
    }

    // TODO implement update and delete methods for lists
    public enum UpdateType {
        ADD,
        UPDATE,
        DELETE
    }

    private static class SingleFeatureFunctionUpdateDataTransaction<DATA> {
        private final ReadSingleFeatureFunction<DATA, ?, ?> featureFunction;
        private final DATA update;
        private DATA oldData;
        private Snapshottable.Snapshot backup;

        public SingleFeatureFunctionUpdateDataTransaction(
            ReadSingleFeatureFunction<DATA, ?, ?> featureFunction,
            DATA update
        ) {
            this.featureFunction = featureFunction;
            this.update = update;
        }

        void createBackup() {
            oldData = getFeatureFunction().getDataCopy();
            backup = getFeatureFunction().takeSnapshot();
        }

        void updateData() {
            getFeatureFunction().setData(update);
        }

        void rollback() {
            backup.restore();
        }

        void validate() throws DataValidationException {
            getFeatureFunction().validateData(update);
        }

        void notifySubscribers() {
            getFeatureFunction().notifySubscribersForDataUpdate(oldData, update);
        }

        ReadSingleFeatureFunction<DATA, ?, ?> getFeatureFunction() {
            return featureFunction;
        }
    }

    private static class ListFeatureFunctionAddDataTransaction<DATA> {

        private final ReadListFeatureFunction<DATA, ?, ?, ?, ?> featureFunction;
        private final List<DATA> dataList;
        private Snapshottable.Snapshot backup;
        private List<Integer> idxList;
        private final AfterUpdateListCall afterAddListCall;

        public ListFeatureFunctionAddDataTransaction(
            ReadListFeatureFunction<DATA, ?, ?, ?, ?> featureFunction,
            List<DATA> dataList,
            AfterUpdateListCall afterAddListCall
        ) {
            this.featureFunction = featureFunction;
            this.dataList = dataList;
            this.afterAddListCall = afterAddListCall;
        }

        void createBackup() {
            List<Integer> idxList = new ArrayList<>();
            backup = getFeatureFunction().takeSnapshot();
            this.idxList = idxList;
        }

        void addData() {
            for (DATA addData : dataList) {
                getFeatureFunction().getDataListHolder().getDataList().add(addData);
                idxList.add(getFeatureFunction()
                    .getDataListHolder()
                    .getDataList()
                    .size() - 1);
            }
            getFeatureFunction().dataUpdatedByTransaction(idxList, dataList);
        }

        void rollback() {
            backup.restore();
        }

        void validate() throws DataValidationException {
            for (DATA update : dataList) {
                getFeatureFunction().validateDataComplete(update);
            }
        }

        void notifySubscribers() {
            afterAddListCall.setIdxList(idxList);
            getFeatureFunction().notifySubscribersForDataAddition(dataList);
        }

        ReadListFeatureFunction<DATA, ?, ?, ?, ?> getFeatureFunction() {
            return featureFunction;
        }
    }

    private final List<ListFeatureFunctionAddDataTransaction<?>>
        listAddTransactionList = new ArrayList<>();
    private final List<SingleFeatureFunctionUpdateDataTransaction<?>>
        singleUpdateTransactionList = new ArrayList<>();

    private boolean finished = false;

    public interface AfterUpdateListCall {
        void setIdxList(List<Integer> idxList);
    }

    public interface AfterUpdateSingleCall {
        void setIdxList(Integer idx);
    }

    /**
     * Create an instance of this class to add data for multiple feature functions
     * with validation happening for the state after all data is added. Runs update
     * only after when {@link #runUpdate()} is called. Notifies subscribers for each
     * update.
     */
    public DataUpdateTransaction() {
    }

    /**
     * Add a single data object to the given function for this transaction. Each call
     * of this method notifies the subscribers separately for the added data when
     * {@link #runUpdate()} is called.
     *
     * @param featureFunction
     *     the feature function to add the data to
     * @param data
     *     the data to add
     * @param afterUpdateListCall
     *     method that is called with the index where the data was added to in the
     *     feature function when {@link #runUpdate()} is called
     * @param <DATA>
     *     the data type of the feature function
     */
    public <DATA> void addSingleData(
        ReadListFeatureFunction<DATA, ?, ?, ?, ?> featureFunction,
        DATA data,
        AfterUpdateSingleCall afterUpdateListCall
    ) {
        addDataList(
            featureFunction,
            List.of(data),
            idxList -> afterUpdateListCall.setIdxList(idxList.get(0))
        );
    }

    public <DATA> void addSingleData(
        ReadSingleFeatureFunction<DATA, ?, ?> featureFunction,
        DATA update
    ) {
        getSingleUpdateTransactionList().add(
            new SingleFeatureFunctionUpdateDataTransaction<>(featureFunction, update)
        );
    }

    /**
     * Add a list of data objects that should be added to the feature function for
     * this transaction. Notifies subscribers once for the added data when
     * {@link #runUpdate()} is called.
     *
     * @param featureFunction
     *     the feature function to add the data to
     * @param dataList
     *     the data to add
     * @param afterUpdateListCall
     *     method that is called with a list of indices where the data was added to
     *     in the feature function when {@link #runUpdate()} is called (in order of
     *     the given data list)
     * @param <DATA>
     *     the data type of the feature function
     */
    public <DATA> void addDataList(
        ReadListFeatureFunction<DATA, ?, ?, ?, ?> featureFunction,
        List<DATA> dataList,
        AfterUpdateListCall afterUpdateListCall
    ) {
        if (isFinished()) {
            throw new IllegalStateException(
                "Cannot add update. UpdateRunner was already run.");
        }
        if (dataList.isEmpty()) {
            logger.warn("Tried to add empty update data list to update runner.");
            return;
        }
        getListAddTransactionList().add(
            new ListFeatureFunctionAddDataTransaction<>(
                featureFunction,
                dataList,
                afterUpdateListCall
            )
        );
    }

    /**
     * Runs the update by adding the new data, validating it and notifying the
     * subscribers. If validation fails the whole transaction will terminate without
     * any data changed.
     *
     * @throws DataValidationException
     *     if the validation fails
     */
    public void runUpdate() throws DataValidationException {

        if (getListAddTransactionList().isEmpty()) {
            logger.warn("Tried to run update for empty update list.");
            return;
        }
        finished = true;
        LinkedList<List<?>> dataListsToSyncOn = new LinkedList<>();
        LinkedList<Object> singleDataLocksToSyncOn = new LinkedList<>();
        getListAddTransactionList().forEach(
            listAddTransaction -> dataListsToSyncOn.add(listAddTransaction
                .getFeatureFunction()
                .getDataListHolder()
                .getDataList())
        );
        getSingleUpdateTransactionList().forEach(
            singleUpdateTransaction -> singleDataLocksToSyncOn.add(
                singleUpdateTransaction.getFeatureFunction().getDataLock())
        );
        runUpdateInSync(dataListsToSyncOn, singleDataLocksToSyncOn);
    }

    /**
     * Synchronize on all the data that will be updated via this transaction.
     *
     * @param dataListsToSyncOn
     *     dataLists from list functions to sync on
     * @param singleDataLocksToSyncOn
     *     data object locks from single data functions to lock on
     * @throws DataValidationException
     *     if data validation fails
     */
    private void runUpdateInSync(
        LinkedList<List<?>> dataListsToSyncOn,
        LinkedList<Object> singleDataLocksToSyncOn
    )
        throws DataValidationException {
        if (dataListsToSyncOn.isEmpty() && singleDataLocksToSyncOn.isEmpty()) {
            run();
        }
        else {
            if (!dataListsToSyncOn.isEmpty()) {
                synchronized (dataListsToSyncOn.pop()) {
                    runUpdateInSync(dataListsToSyncOn, singleDataLocksToSyncOn);
                }
            }
            else {
                synchronized (singleDataLocksToSyncOn.pop()) {
                    runUpdateInSync(dataListsToSyncOn, singleDataLocksToSyncOn);
                }
            }
        }
    }

    void run() throws DataValidationException {
        getListAddTransactionList().forEach(ListFeatureFunctionAddDataTransaction::createBackup);
        getSingleUpdateTransactionList().forEach(
            SingleFeatureFunctionUpdateDataTransaction::createBackup);
        getListAddTransactionList().forEach(ListFeatureFunctionAddDataTransaction::addData);
        getSingleUpdateTransactionList().forEach(
            SingleFeatureFunctionUpdateDataTransaction::updateData);

        try {
            for (ListFeatureFunctionAddDataTransaction<?> listTransaction : getListAddTransactionList()) {
                listTransaction.validate();
            }
            for (SingleFeatureFunctionUpdateDataTransaction<?> singleDataTransaction : getSingleUpdateTransactionList()) {
                singleDataTransaction.validate();
            }
        }
        catch (DataValidationException e) {
            getListAddTransactionList().forEach(ListFeatureFunctionAddDataTransaction::rollback);
            throw e;
        }
        getListAddTransactionList().forEach(ListFeatureFunctionAddDataTransaction::notifySubscribers);
        getSingleUpdateTransactionList().forEach(
            SingleFeatureFunctionUpdateDataTransaction::notifySubscribers);
    }
}
