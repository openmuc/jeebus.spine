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

import org.openmuc.jeebus.spine.api.RequestResult;
import org.openmuc.jeebus.spine.api.SpineException;
import org.openmuc.jeebus.spine.spi.SpineSubscription;
import org.openmuc.jeebus.spine.xsd.v1.FeatureAddressType;
import org.openmuc.jeebus.spine.xsd.v1.FeatureTypeEnumType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.invoke.MethodHandles;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

class SubscriptionWrapper {
    private static final Logger LOG = LoggerFactory.getLogger(
        MethodHandles.lookup().lookupClass()
    );

    private final Set<SpineSubscription> subscriptions = new HashSet<>();
    private final FeatureAddressType remoteServerAddress;
    private final FeatureTypeEnumType featureType;
    private State state;

    public SubscriptionWrapper(
        SpineSubscription subscription,
        FeatureAddressType remoteServerAddress,
        FeatureTypeEnumType featureType,
        CompletableFuture<RequestResult> request
    ) {
        this.subscriptions.add(subscription);
        this.remoteServerAddress = remoteServerAddress;
        this.featureType = featureType;

        this.state = State.PENDING;
        request.whenComplete(this::handleCompletion);
    }

    private void handleCompletion(RequestResult result, Throwable throwable) {
        if (throwable != null) {
            if (throwable.getCause() instanceof SpineException) {
                SpineException spineException
                    = (SpineException) throwable.getCause();
                switch (spineException.getError()) {
                    case TIMEOUT: {
                        this.state = State.TIMEOUT;
                        break;
                    }
                    case COMMAND_REJECTED: {
                        this.state = State.REJECTED;
                        break;
                    }
                    default: {
                        this.state = State.UNSUCCESSFUL;
                        break;
                    }
                }
            }
            else {
                this.state = State.UNSUCCESSFUL;
            }
            LOG.error(
                "There was an exception completing subscription request {}",
                this,
                throwable
            );
        }
        else {
            this.state = State.SUCCESSFUL;
            LOG.debug("Subscription request completed successfully {}", this);
        }
    }

    @Override
    public String toString() {
        return "SubscriptionWrapper{" +
            "state=" + state +
            ", subscriptions=" + subscriptions +
            ", remoteServerAddress=" + remoteServerAddress +
            ", featureType=" + featureType +
            '}';
    }

    State getState() {
        return state;
    }

    public Set<SpineSubscription> getSubscriptions() {
        return Collections.unmodifiableSet(subscriptions);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        SubscriptionWrapper that = (SubscriptionWrapper) o;
        return remoteServerAddress.equals(that.remoteServerAddress)
            && featureType == that.featureType;
    }

    @Override
    public int hashCode() {
        int result = remoteServerAddress.hashCode();
        result = 31 * result + featureType.hashCode();
        return result;
    }

    public boolean addSubscription(SpineSubscription subscription) {
        return this.subscriptions.add(subscription);
    }

    public void retry(CompletableFuture<RequestResult> request) {
        this.state = State.PENDING;
        request.whenComplete(this::handleCompletion);
    }

    enum State {
        PENDING,
        SUCCESSFUL,
        UNSUCCESSFUL,
        REJECTED,
        TIMEOUT
    }
}
