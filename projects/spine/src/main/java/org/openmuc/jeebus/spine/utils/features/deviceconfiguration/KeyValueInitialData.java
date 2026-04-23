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

import org.openmuc.jeebus.spine.api.DataValidationException;
import org.openmuc.jeebus.spine.spi.function.DataUpdateTransaction;
import org.openmuc.jeebus.spine.xsd.v1.DeviceConfigurationKeyValueConstraintsDataType;
import org.openmuc.jeebus.spine.xsd.v1.DeviceConfigurationKeyValueDataType;
import org.openmuc.jeebus.spine.xsd.v1.DeviceConfigurationKeyValueDescriptionDataType;

public class KeyValueInitialData {
    private final DeviceConfigurationKeyValueDataType data;
    private final DeviceConfigurationKeyValueDescriptionDataType description;
    private final DeviceConfigurationKeyValueConstraintsDataType constraints;

    public KeyValueInitialData(
        DeviceConfigurationKeyValueDataType data,
        DeviceConfigurationKeyValueDescriptionDataType description,
        DeviceConfigurationKeyValueConstraintsDataType constraints
    ) {
        this.data = data;
        this.description = description;
        this.constraints = constraints;
    }

    public KeyValueInitialData() {
        this(null, null, null);
    }

    public KeyValueInitialData withData(DeviceConfigurationKeyValueDataType data) {
        noKeyId(data.getKeyId());
        return new KeyValueInitialData((DeviceConfigurationKeyValueDataType) data.clone(), description, constraints);
    }

    public KeyValueInitialData withDescription(DeviceConfigurationKeyValueDescriptionDataType description) {
        noKeyId(description.getKeyId());
        return new KeyValueInitialData(data,
            (DeviceConfigurationKeyValueDescriptionDataType) description.clone(), constraints);
    }

    public KeyValueInitialData withConstraints(DeviceConfigurationKeyValueConstraintsDataType constraints) {
        noKeyId(constraints.getKeyId());
        return new KeyValueInitialData(data, description,
            (DeviceConfigurationKeyValueConstraintsDataType) constraints.clone()
        );
    }

    public RunningKeyValue addToFeature(DeviceConfigurationFeature feature) throws
        DataValidationException {
        Long keyId = DeviceConfigurationFeature.getNextKeyId();
        RunningKeyValue result = new RunningKeyValue(keyId, feature);
        DataUpdateTransaction runner = new DataUpdateTransaction();
        if (description != null) {
            if (feature.getKeyValueDescriptionListDataFunction()
                == null) {
                throw new IllegalArgumentException(
                    "Cannot add description, because descriptionFunction is not set in feature.");
            }
            else {
                runner.addSingleData(
                    feature.getKeyValueDescriptionListDataFunction(),
                    description.withKeyId(keyId),
                    result::setDescriptionIdx
                );
            }
        }
        if (constraints != null) {
            if (feature.getKeyValueConstraintsListDataFunction()
                == null) {
                throw new IllegalArgumentException(
                    "Cannot add constraints, because constraintsFunction is not set in feature.");
            }
            else {
                runner.addSingleData(
                    feature.getKeyValueConstraintsListDataFunction(),
                    constraints.withKeyId(keyId),
                    result::setConstraintsIdx
                );
            }
        }

        if (data != null) {
            if (feature.getKeyValueListDataFunction() == null) {
                throw new IllegalArgumentException(
                    "Cannot add data, because dataFunction is not set in feature.");
            }
            else {
                runner.addSingleData(
                    feature.getKeyValueListDataFunction(),
                    data.withKeyId(keyId),
                    result::setDataIdx
                );
            }
        }
        feature.submitRunningKeyValue(result);
        try {
            runner.runUpdate();
        } catch (DataValidationException e) {
            feature.removeRunningKeyValue(result);
            throw e;
        }


        return result;
    }

    private static void noKeyId(Long keyId) throws IllegalArgumentException {
        if (keyId != null)
            throw new IllegalArgumentException("Initial data for KeyValues should not contain key ID (a key ID will be automatically assigned when the KeyValue is added to a feature)");
    }
}
