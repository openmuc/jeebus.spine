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

import org.openmuc.jeebus.spine.xsd.v1.FeatureAddressType;
import org.openmuc.jeebus.spine.xsd.v1.NodeManagementBindingRequestCallType;
import org.openmuc.jeebus.spine.xsd.v1.NodeManagementSubscriptionRequestCallType;

public interface FeaturePermission {
    /**
     * @param bindingRequest
     *     the binding request
     * @return true if request is permitted, false otherwise
     */
    boolean bindingAllowed(NodeManagementBindingRequestCallType.BindingRequest bindingRequest);

    /**
     * @param subscriptionRequest
     *     the subscription request
     * @return true if request is permitted, false otherwise
     */
    boolean subscriptionAllowed(NodeManagementSubscriptionRequestCallType.SubscriptionRequest subscriptionRequest);

    /**
     * @param clientAddress
     *     the address of the client feature
     * @param minimumTrustLevel
     *     the minimum trust level set on the accessed feature
     * @return if the client is allowed to access the features this permission
     * belongs to
     */
    default boolean isTrusted(
        FeatureAddressType clientAddress,
        String minimumTrustLevel
    ) {
        return true;
    }

    FeaturePermission ALLOW_ALL = new FeaturePermission() {
        @Override
        public boolean bindingAllowed(NodeManagementBindingRequestCallType.BindingRequest bindingRequest) {
            return true;
        }

        @Override
        public boolean subscriptionAllowed(NodeManagementSubscriptionRequestCallType.SubscriptionRequest subscriptionRequest) {
            return true;
        }

        @Override
        public String toString() {
            return "ALLOW_ALL";
        }
    };

    FeaturePermission ALLOW_SUBSCRIBE = new FeaturePermission() {
        @Override
        public boolean bindingAllowed(NodeManagementBindingRequestCallType.BindingRequest bindingRequest) {
            return false;
        }

        @Override
        public boolean subscriptionAllowed(NodeManagementSubscriptionRequestCallType.SubscriptionRequest subscriptionRequest) {
            return true;
        }

        @Override
        public String toString() {
            return "ALLOW_SUBSCRIBE";
        }
    };

    FeaturePermission ALLOW_NOTHING = new FeaturePermission() {
        @Override
        public boolean bindingAllowed(NodeManagementBindingRequestCallType.BindingRequest bindingRequest) {
            return false;
        }

        @Override
        public boolean subscriptionAllowed(NodeManagementSubscriptionRequestCallType.SubscriptionRequest subscriptionRequest) {
            return false;
        }

        @Override
        public String toString() {
            return "ALLOW_NOTHING";
        }
    };
}
