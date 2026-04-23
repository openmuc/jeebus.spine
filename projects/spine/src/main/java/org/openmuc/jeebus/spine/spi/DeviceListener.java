/********************************************************************************
 * Copyright (c) 2026 Fraunhofer ISE
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 ********************************************************************************/

package org.openmuc.jeebus.spine.spi;

import org.openmuc.jeebus.spine.xsd.v1.NodeManagementDetailedDiscoveryDataType;

public interface DeviceListener {
    /**
     * @param communicationAddress
     *     the address on which a connection can be opened
     */
    void deviceDetected(String communicationAddress);

    /**
     * @param deviceInfo
     *     the DetailedDiscovery information received by the device
     */
    void deviceDiscovered(NodeManagementDetailedDiscoveryDataType deviceInfo);
}
