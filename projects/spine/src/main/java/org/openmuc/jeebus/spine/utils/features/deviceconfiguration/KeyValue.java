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

import org.openmuc.jeebus.spine.xsd.v1.DeviceConfigurationKeyValueConstraintsDataType;
import org.openmuc.jeebus.spine.xsd.v1.DeviceConfigurationKeyValueDataType;
import org.openmuc.jeebus.spine.xsd.v1.DeviceConfigurationKeyValueDescriptionDataType;

public interface KeyValue {
    DeviceConfigurationKeyValueDataType getDataCopy();

    DeviceConfigurationKeyValueDescriptionDataType getDescriptionCopy();

    DeviceConfigurationKeyValueConstraintsDataType getConstraintsCopy();
}
