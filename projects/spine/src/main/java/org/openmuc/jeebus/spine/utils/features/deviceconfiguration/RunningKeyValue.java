/********************************************************************************
 * Copyright (c) 2026 Fraunhofer ISE
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 ********************************************************************************/

package org.openmuc.jeebus.spine.utils.features.deviceconfiguration;

import org.openmuc.jeebus.spine.api.DataUpdateType;
import org.openmuc.jeebus.spine.api.DataValidationException;
import org.openmuc.jeebus.spine.xsd.v1.DeviceConfigurationKeyValueConstraintsDataType;
import org.openmuc.jeebus.spine.xsd.v1.DeviceConfigurationKeyValueDataType;
import org.openmuc.jeebus.spine.xsd.v1.DeviceConfigurationKeyValueDescriptionDataType;

import java.util.HashSet;
import java.util.Set;

/**
 * Represents a KeyValue that actually exists on some feature functions currently.
 */
public class RunningKeyValue implements KeyValue {

    private final Long keyId;
    private final DeviceConfigurationFeature feature;
    private Integer dataIdx;
    private Integer constraintsIdx;
    private Integer descriptionIdx;

    private final Set<WriteDataListener> writeDataListeners = new HashSet<>();
    private boolean writeDataAllowed = true;
    private final Set<WriteDescriptionListener> writeDescriptionListeners
        = new HashSet<>();
    private boolean writeDescriptionDataAllowed = false;
    private final Set<WriteConstraintsListener> writeConstraintsListeners
        = new HashSet<>();
    private boolean writeConstraintsAllowed = false;

    @Override
    public DeviceConfigurationKeyValueDataType getDataCopy() {
        KeyValueListDataFunction function = feature.getKeyValueListDataFunction();
        return dataIdx != null && function != null
            ? function.getDataCopy(dataIdx)
            : null;
    }

    @Override
    public DeviceConfigurationKeyValueDescriptionDataType getDescriptionCopy() {
        KeyValueDescriptionListDataFunction function
            = feature.getKeyValueDescriptionListDataFunction();
        return descriptionIdx != null && function != null
            ? function.getDataCopy(descriptionIdx)
            : null;
    }

    @Override
    public DeviceConfigurationKeyValueConstraintsDataType getConstraintsCopy() {
        KeyValueConstraintsListDataFunction function
            = feature.getKeyValueConstraintsListDataFunction();
        return constraintsIdx != null && function != null
            ? function.getDataCopy(constraintsIdx)
            : null;
    }

    public Long getKeyId() {
        return keyId;
    }

    public void setData(DeviceConfigurationKeyValueDataType value)
        throws DataValidationException {
        if (dataIdx == null) {
            throw new DataValidationException(
                "Cannot set data due to missing data index");
        }
        feature.getKeyValueListDataFunction().updateData(dataIdx, value);
    }

    @FunctionalInterface
    public interface WriteDataListener {
        void writeData(
            DeviceConfigurationKeyValueDataType data,
            DataUpdateType dataUpdateType
        );

        WriteDataListener NOT_ALLOWED = (_d, _u) -> {
            throw new UnsupportedOperationException();
        };
        WriteDataListener IGNORE = (_d, _u) -> {
        };
    }

    @FunctionalInterface
    public interface WriteDescriptionListener {
        void writeDescriptionData(
            DeviceConfigurationKeyValueDescriptionDataType data,
            DataUpdateType dataUpdateType
        );

        WriteDescriptionListener NOT_ALLOWED = (_d, _u) -> {
            throw new UnsupportedOperationException();
        };
        WriteDescriptionListener IGNORE = (_d, _u) -> {
        };
    }

    @FunctionalInterface
    public interface WriteConstraintsListener {
        void writeConstraintsData(
            DeviceConfigurationKeyValueConstraintsDataType data,
            DataUpdateType dataUpdateType
        );

        WriteConstraintsListener NOT_ALLOWED = (_d, _u) -> {
            throw new UnsupportedOperationException();
        };
        WriteConstraintsListener IGNORE = (_d, _u) -> {
        };
    }

    RunningKeyValue(Long keyId, DeviceConfigurationFeature feature) {
        this.keyId = keyId;
        this.feature = feature;
    }

    public void setDataIdx(Integer dataIdx) {
        this.dataIdx = dataIdx;
    }

    public void setConstraintsIdx(Integer constraintsIdx) {
        this.constraintsIdx = constraintsIdx;
    }

    public void setDescriptionIdx(Integer descriptionIdx) {
        this.descriptionIdx = descriptionIdx;
    }

    public void setWriteDataAllowed(boolean writeDataAllowed) {
        this.writeDataAllowed = writeDataAllowed;
    }

    public void setWriteDescriptionDataAllowed(boolean writeDescriptionDataAllowed) {
        this.writeDescriptionDataAllowed = writeDescriptionDataAllowed;
    }

    public void setWriteConstraintsAllowed(boolean writeConstraintsAllowed) {
        this.writeConstraintsAllowed = writeConstraintsAllowed;
    }

    public void addWriteDataListener(WriteDataListener listener) {
        writeDataListeners.add(listener);
    }

    public void addWriteDescriptionListener(WriteDescriptionListener listener) {
        writeDescriptionListeners.add(listener);
    }

    public void addWriteConstraintsListener(WriteConstraintsListener listener) {
        writeConstraintsListeners.add(listener);
    }

    public void writeData(
        DeviceConfigurationKeyValueDataType data,
        DataUpdateType update
    ) {
        if (!writeDataAllowed) {
            throw new UnsupportedOperationException();
        }
        for (WriteDataListener listener : writeDataListeners) {
            listener.writeData(data, update);
        }
    }

    public void writeDescription(
        DeviceConfigurationKeyValueDescriptionDataType data,
        DataUpdateType update
    ) {
        if (!writeDescriptionDataAllowed) {
            throw new UnsupportedOperationException();
        }
        for (WriteDescriptionListener listener : writeDescriptionListeners) {
            listener.writeDescriptionData(data, update);
        }
    }

    public void writeConstraints(
        DeviceConfigurationKeyValueConstraintsDataType data,
        DataUpdateType update
    ) {
        if (!writeConstraintsAllowed) {
            throw new UnsupportedOperationException();
        }
        for (WriteConstraintsListener listener : writeConstraintsListeners) {
            listener.writeConstraintsData(data, update);
        }
    }

    @Override
    public String toString() {
        return "RunningKeyValue{" +
            "keyId=" + keyId +
            ", dataIdx=" + dataIdx +
            ", constraintsIdx=" + constraintsIdx +
            ", descriptionIdx=" + descriptionIdx +
            '}';
    }
}
