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

import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.openmuc.jeebus.spine.api.Device;
import org.openmuc.jeebus.spine.api.RequestResult;
import org.openmuc.jeebus.spine.api.SpineException;
import org.openmuc.jeebus.spine.spi.AssertingSubscription;
import org.openmuc.jeebus.spine.xsd.v1.*;
import org.openmuc.jeebus.spine.xsd.v1.NodeManagementSubscriptionDataType.SubscriptionEntry;

import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.parallel.ExecutionMode.SAME_THREAD;
import static org.openmuc.jeebus.spine.TestUtilities.*;
import static org.openmuc.jeebus.spine.impl.SubscriptionWrapper.State.SUCCESSFUL;
import static org.openmuc.jeebus.spine.xsd.v1.FeatureTypeEnumType.GENERIC;
import static org.openmuc.jeebus.spine.xsd.v1.RoleType.CLIENT;
import static org.openmuc.jeebus.spine.xsd.v1.RoleType.SERVER;

@Execution(SAME_THREAD)
public class SubscriptionTest {
    private static final AssertingSubscription SUBSCRIPTION
        = new AssertingSubscription();
    private Device server;
    private Device client;

    @BeforeEach
    void setupDevices() {
        server = addFeature(
            getGenericDeviceBuilder(
                REMOTE_COMM,
                REMOTE_DEVICE_ADDRESS
            ),
            SERVER
        ).withDiscoverDevices(false).build();

        client = addFeature(
            getGenericDeviceBuilder(
                LOCAL_COMM,
                LOCAL_DEVICE_ADDRESS
            ),
            CLIENT
        ).withDiscoverDevices(false).build();
    }

    @Test
    void testSubscriptionCreation() throws SpineException, ExecutionException,
        InterruptedException {
        client.getFeature(CLIENT_FEATURE_ADDRESS)
            .requestSubscription(
                SERVER_FEATURE_ADDRESS,
                GENERIC,
                SUBSCRIPTION
            );

        assertDeviceRegisteredSubscription(client, server, true);
        assertDeviceRegisteredSubscription(server, client, true);
    }

    @Test
    void testDoubleSubscription() throws SpineException, ExecutionException,
        InterruptedException {
        CompletableFuture<RequestResult> firstRequest = client
            .getFeature(CLIENT_FEATURE_ADDRESS)
            .requestSubscription(
                SERVER_FEATURE_ADDRESS,
                GENERIC,
                SUBSCRIPTION
            );

        CompletableFuture<RequestResult> secondRequest = client
            .getFeature(CLIENT_FEATURE_ADDRESS)
            .requestSubscription(
                SERVER_FEATURE_ADDRESS,
                GENERIC,
                new AssertingSubscription()
            );

        // A double-subscription should not return an exception
        BigInteger secondCounter = secondRequest
            .get()
            .getDatagram()
            .getHeader()
            .getMsgCounter();

        assertThat(
            firstRequest.get().getDatagram().getHeader().getMsgCounter(),
            is(not(secondCounter))
        );

        assertDeviceRegisteredSubscription(client, server, true);
        assertDeviceRegisteredSubscription(client, server, true);

        CompletableFuture<RequestResult> subscriptionReadRequest = server
            .getNodeManagement()
            .requestSubscriptionData(client.getAddress().getDevice());

        NodeManagementSubscriptionDataType subscriptionData = subscriptionReadRequest
            .get()
            .getCmd()
            .getNodeManagementSubscriptionData();

        List<SubscriptionEntry> result
            = subscriptionData
            .getSubscriptionEntry()
            .stream()
            .filter(subscription -> addressEquals(
                subscription.getClientAddress(),
                CLIENT_FEATURE_ADDRESS
            ) && addressEquals(
                subscription.getServerAddress(), SERVER_FEATURE_ADDRESS))
            .collect(
                Collectors.toList()
            );

        assertThat(result, hasSize(1));
    }

    private void assertDeviceRegisteredSubscription(
        Device requestingDevice,
        Device deviceUnderTest,
        boolean compare
    ) throws InterruptedException, ExecutionException {

        CompletableFuture<RequestResult> subscriptionReadRequest = requestingDevice
            .getNodeManagement()
            .requestSubscriptionData(deviceUnderTest.getAddress().getDevice());

        NodeManagementSubscriptionDataType subscriptionData = subscriptionReadRequest
            .get()
            .getCmd()
            .getNodeManagementSubscriptionData();

        MatcherAssert.assertThat(
            containsSubscription(subscriptionData),
            is(compare)
        );
    }

    private boolean containsSubscription(NodeManagementSubscriptionDataType subscriptionData) {
        if (subscriptionData != null
            && subscriptionData.getSubscriptionEntry() != null) {
            for (SubscriptionEntry subscription : subscriptionData.getSubscriptionEntry()) {
                if (addressEquals(
                    subscription.getClientAddress(),
                    CLIENT_FEATURE_ADDRESS
                ) && addressEquals(
                    subscription.getServerAddress(), SERVER_FEATURE_ADDRESS)) {
                    return true;
                }
            }

        }
        return false;
    }

    private boolean addressEquals(
        FeatureAddressType addressOne,
        FeatureAddressType addressTwo
    ) {
        return addressOne.getDevice().equals(addressTwo.getDevice()) && addressOne
            .getEntity()
            .equals(addressTwo.getEntity()) && addressOne
            .getFeature()
            .equals(addressTwo.getFeature());
    }

    @Test
    void testNotify() throws SpineException {
        client.getFeature(CLIENT_FEATURE_ADDRESS)
            .requestSubscription(
                SERVER_FEATURE_ADDRESS,
                GENERIC,
                SUBSCRIPTION
            );

        server
            .getFeature(SERVER_FEATURE_ADDRESS)
            .notifySubscribers(FunctionEnumType.ACTUATOR_SWITCH_DATA, null);
        SUBSCRIPTION.assertNotifiedAndReset(true);
    }

    @Test
    void testSubscriptionDeletion() throws SpineException, ExecutionException,
        InterruptedException {
        client.getFeature(CLIENT_FEATURE_ADDRESS)
            .requestSubscription(
                SERVER_FEATURE_ADDRESS,
                GENERIC,
                SUBSCRIPTION
            );

        client
            .getFeature(CLIENT_FEATURE_ADDRESS)
            .releaseSubscription(SERVER_FEATURE_ADDRESS);
        assertDeviceRegisteredSubscription(client, server, false);
        assertDeviceRegisteredSubscription(server, client, false);
        server
            .getFeature(SERVER_FEATURE_ADDRESS)
            .notifySubscribers(FunctionEnumType.ACTUATOR_SWITCH_DATA, null);
        SUBSCRIPTION.assertNotifiedAndReset(false);

        client.getFeature(CLIENT_FEATURE_ADDRESS)
            .requestSubscription(
                SERVER_FEATURE_ADDRESS,
                GENERIC,
                SUBSCRIPTION
            );
        server
            .getFeature(SERVER_FEATURE_ADDRESS)
            .releaseSubscriber(CLIENT_FEATURE_ADDRESS);
        assertDeviceRegisteredSubscription(client, server, false);
        assertDeviceRegisteredSubscription(server, client, false);
        server
            .getFeature(SERVER_FEATURE_ADDRESS)
            .notifySubscribers(FunctionEnumType.ACTUATOR_SWITCH_DATA, null);
        SUBSCRIPTION.assertNotifiedAndReset(false);
    }

    @Test
    void testSubscriptionDeletionOnServerFeatureRemoval()
        throws SpineException, ExecutionException, InterruptedException {
        client.getFeature(CLIENT_FEATURE_ADDRESS)
            .requestSubscription(
                SERVER_FEATURE_ADDRESS,
                GENERIC,
                SUBSCRIPTION
            );

        server.getEntity(1).deleteFeature(0);
        assertDeviceRegisteredSubscription(server, client, false);
        assertDeviceRegisteredSubscription(client, server, false);
    }

    @Test
    void testSubscriptionDeletionOnClientFeatureRemoval()
        throws SpineException, ExecutionException, InterruptedException {
        client.getFeature(CLIENT_FEATURE_ADDRESS)
            .requestSubscription(
                SERVER_FEATURE_ADDRESS,
                GENERIC,
                SUBSCRIPTION
            );

        client.getEntity(1).deleteFeature(0);
        assertDeviceRegisteredSubscription(server, client, false);
        assertDeviceRegisteredSubscription(client, server, false);
    }

    @Test
    public void testSubscriptionCreationByWrapper() throws SpineException {
        client.getFeature(CLIENT_FEATURE_ADDRESS)
            .requestSubscription(
                SERVER_FEATURE_ADDRESS,
                GENERIC,
                SUBSCRIPTION
            ).join();

        SubscriptionWrapper wrapper = ((FeatureImpl) client
            .getFeature(CLIENT_FEATURE_ADDRESS))
            .getSubscription(SERVER_FEATURE_ADDRESS);

        assertThat(
            wrapper.getState(),
            is(SUCCESSFUL)
        );
        assertThat(
            wrapper.getSubscriptions(),
            hasSize(1)
        );
        assertThat(
            wrapper.getSubscriptions(),
            hasItem(SUBSCRIPTION)
        );

    }

    @Test
    public void testSubscriptionDeletionOnDisconnect() throws SpineException {
        client.getFeature(CLIENT_FEATURE_ADDRESS)
            .requestSubscription(
                SERVER_FEATURE_ADDRESS,
                GENERIC,
                SUBSCRIPTION
            ).join();

        assertThat(
            ((FeatureImpl) client.getFeature(CLIENT_FEATURE_ADDRESS))
                .getSubscription(SERVER_FEATURE_ADDRESS),
            is(notNullValue())
        );

        server.close();
        assertThat(
            client
                .getDevice()
                .getNodeManagement()
                .getFunction(FunctionEnumType.NODE_MANAGEMENT_SUBSCRIPTION_DATA)
                .read(null, SERVER_FEATURE_ADDRESS)
                .getNodeManagementSubscriptionData()
                .getSubscriptionEntry(),
            hasSize(0)
        );

        assertThat(
            ((FeatureImpl) client.getFeature(CLIENT_FEATURE_ADDRESS))
                .getSubscription(SERVER_FEATURE_ADDRESS),
            is(nullValue())
        );
    }

    @Test
    public void testDoubleSubscriptionByWrapper() throws SpineException {

        CompletableFuture.allOf(
            client.getFeature(CLIENT_FEATURE_ADDRESS)
                .requestSubscription(
                    SERVER_FEATURE_ADDRESS,
                    GENERIC,
                    SUBSCRIPTION
                ),
            client.getFeature(CLIENT_FEATURE_ADDRESS)
                .requestSubscription(
                    SERVER_FEATURE_ADDRESS,
                    GENERIC,
                    notification -> {}
                )
        ).join();

        assertThat(
            ((FeatureImpl) client.getFeature(CLIENT_FEATURE_ADDRESS))
                .getSubscription(SERVER_FEATURE_ADDRESS),
            is(notNullValue())
        );

        assertThat(
            ((FeatureImpl) client.getFeature(CLIENT_FEATURE_ADDRESS))
                .getSubscription(SERVER_FEATURE_ADDRESS).getSubscriptions(),
            hasSize(2)
        );
    }

}
