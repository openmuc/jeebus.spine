/********************************************************************************
 * Copyright (c) 2026 Fraunhofer ISE
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 ********************************************************************************/

package org.openmuc.jeebus.spine.impl;

import org.openmuc.jeebus.spine.api.Error;
import org.openmuc.jeebus.spine.api.SpineAcknowledgment;
import org.openmuc.jeebus.spine.api.SpineException;
import org.openmuc.jeebus.spine.spi.function.FeatureFunction;
import org.openmuc.jeebus.spine.xsd.v1.*;

class SubscriptionDeleteFunction extends FeatureFunction {
    private final SubscriptionDataFunction subscriptionDataFunction;

    SubscriptionDeleteFunction(SubscriptionDataFunction subscriptionDataFunction) {
        super(FunctionEnumType.NODE_MANAGEMENT_SUBSCRIPTION_DELETE_CALL.value());
        this.subscriptionDataFunction = subscriptionDataFunction;
        setCallable(true);
    }

    @Override
    public CmdType read(FilterType filter, FeatureAddressType sourceAddress) {
        throw new UnsupportedOperationException();
    }

    @Override
    public SpineAcknowledgment write(CmdType cmd, FeatureAddressType sourceAddress) {
        throw new UnsupportedOperationException();
    }

    @Override
    public SpineAcknowledgment call(CmdType cmd, FeatureAddressType sourceAddress) {
        NodeManagementSubscriptionDeleteCallType.SubscriptionDelete delete = cmd
            .getNodeManagementSubscriptionDeleteCall()
            .getSubscriptionDelete();
        try {
            subscriptionDataFunction.removeSubscriptionEntry(delete);
            return new SpineAcknowledgment(Error.NO_ERROR);
        }
        catch (SpineException e) {
            return e.getAcknowledgment();
        }
    }

    @Override
    public void close() {
        // do nothing
    }
}
