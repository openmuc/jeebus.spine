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

import org.junit.jupiter.api.Assertions;
import org.openmuc.jeebus.spine.xsd.v1.NodeManagementDetailedDiscoveryDataType;

import java.util.concurrent.TimeUnit;

import static org.awaitility.Awaitility.await;
import static org.openmuc.jeebus.spine.TestUtilities.*;

public class AssertingDeviceListener implements DeviceListener {
    private boolean deviceDetected = false;
    private boolean deviceDiscovered = false;

    @Override
    public void deviceDetected(String communicationAddress) {
        if (communicationAddress.equals(REMOTE_COMM_ADDRESS)) {
            deviceDetected = true;
        }
    }

    @Override
    public void deviceDiscovered(NodeManagementDetailedDiscoveryDataType deviceInfo) {
        if (deviceInfo.getDeviceInformation()
            .getDescription()
            .getDeviceAddress()
            .getDevice()
            .equals(REMOTE_DEVICE_ADDRESS)) {
            deviceDiscovered = true;
        }
    }

    public void assertDeviceDetected(boolean compare) {
        if (compare) {
            Assertions.assertTrue(deviceDetected);
        }
        else {
            Assertions.assertFalse(deviceDetected);
        }
    }

    public void assertDeviceDiscovered(boolean compare) {
        // DeviceDiscovery is asynchronous now, so we have to wait.
        await().atMost(1, TimeUnit.SECONDS).until(() -> deviceDiscovered == compare);
    }
}
