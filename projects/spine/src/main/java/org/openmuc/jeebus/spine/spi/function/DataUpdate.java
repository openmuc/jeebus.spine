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

import org.openmuc.jeebus.spine.api.DataUpdateType;
import org.openmuc.jeebus.spine.utils.SpineObjects;

/**
 * Data class that holds the parameters to
 * {@link ReadAndWriteListFeatureFunction#writeData(Object, DataUpdateType,
 * Integer)}.
 *
 * @param <DATA>
 *     type of data that was updated
 */
public class DataUpdate<DATA> {
    private final DATA data;
    private final DataUpdateType updateType;
    private final Integer idx;

    /**
     * @param removedData
     *     the data that was deleted
     * @param idx
     *     index where at the data was removed for the feature function
     * @return a DataUpdate object describing the deletion
     */
    public static <DATA> DataUpdate<DATA> deleted(DATA removedData, int idx) {
        return new DataUpdate<>(
            SpineObjects.dataCopy(removedData),
            DataUpdateType.DELETE_DATA,
            idx
        );
    }

    /**
     * @param data
     *     the data that was updated (copy of the original data)
     * @param idx
     *     index where at the data was added for the feature function
     * @return a DataUpdate object describing the update
     */
    public static <DATA> DataUpdate<DATA> updated(DATA data, Integer idx) {
        return new DataUpdate<>(
            SpineObjects.dataCopy(data),
            DataUpdateType.UPDATE_DATA,
            idx
        );
    }

    /**
     * @param data
     *     the data that was added
     * @param idx
     *     index where at the data was added for the feature function
     * @return a DataUpdate object describing the update
     */
    public static <DATA> DataUpdate<DATA> added(DATA data, int idx) {
        return new DataUpdate<>(
            SpineObjects.dataCopy(data),
            DataUpdateType.ADD_DATA,
            idx
        );
    }

    public DATA getData() {
        return data;
    }

    public DataUpdateType getUpdateType() {
        return updateType;
    }

    public Integer getIdx() {
        return idx;
    }

    public DataUpdate(DATA data, DataUpdateType updateType, Integer idx) {
        this.data = data;
        this.updateType = updateType;
        this.idx = idx;
    }
}
