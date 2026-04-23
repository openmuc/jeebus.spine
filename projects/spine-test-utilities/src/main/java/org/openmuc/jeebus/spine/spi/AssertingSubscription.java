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
import org.openmuc.jeebus.spine.api.RequestResult;

public class AssertingSubscription implements SpineSubscription {
    boolean notified = false;

    @Override
    public void messageReceived(RequestResult notification) {
        notified = true;
    }

    public void assertNotifiedAndReset(boolean compare) {
        if (compare) {
            Assertions.assertTrue(notified);
        }
        else {
            Assertions.assertFalse(notified);
        }
        notified = false;
    }
}
