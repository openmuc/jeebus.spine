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
import org.openmuc.jeebus.spine.xsd.v1.NodeManagementSubscriptionRequestCallType.SubscriptionRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Objects;

class SubscriptionRequestFunction extends FeatureFunction {
    private static final Logger LOGGER = LoggerFactory.getLogger(
        SubscriptionRequestFunction.class);
    private final SubscriptionDataFunction subscriptionDataFunction;

    SubscriptionRequestFunction(SubscriptionDataFunction subscriptionDataFunction) {
        super(FunctionEnumType.NODE_MANAGEMENT_SUBSCRIPTION_REQUEST_CALL.value());
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
        SubscriptionRequest subscriptionRequest = cmd
            .getNodeManagementSubscriptionRequestCall()
            .getSubscriptionRequest();

        FeatureImpl feature;
        try {
            feature = (FeatureImpl) this.feature
                .getDevice()
                .getFeature(subscriptionRequest.getServerAddress());
        }
        catch (SpineException e) {
            return e.getAcknowledgment();
        }

        if (
            // ServerFeatureTypes are optional according to SPINE:7.4.2
            subscriptionRequest.getServerFeatureType() != null
            && !Objects.equals(
                feature.getType().value(),
                subscriptionRequest.getServerFeatureType()
        )) {
            LOGGER.warn(
                "ServerFeatureType mismatch: {} expects {} but is {}",
                sourceAddress.getDevice(),
                subscriptionRequest.getServerFeatureType(),
                feature.getType().value()
            );
        }

        if (feature.subscribe(subscriptionRequest)) {
            subscriptionDataFunction.addSubscriptionEntry(subscriptionRequest);
            return new SpineAcknowledgment(Error.NO_ERROR);
        }
        else {
            LOGGER.warn(
                "Subscription from device {} denied",
                subscriptionRequest.getClientAddress().getDevice()
            );
            return new SpineAcknowledgment(
                Error.COMMAND_REJECTED,
                "Subscription request denied"
            );
        }
    }

    @Override
    public void close() {
        // do nothing
    }
}
