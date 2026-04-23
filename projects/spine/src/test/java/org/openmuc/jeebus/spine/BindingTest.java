/********************************************************************************
 * Copyright (c) 2026 Fraunhofer ISE
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 ********************************************************************************/

package org.openmuc.jeebus.spine;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.ThrowingSupplier;
import org.openmuc.jeebus.spine.api.Device;
import org.openmuc.jeebus.spine.api.RequestResult;
import org.openmuc.jeebus.spine.api.SpineException;
import org.openmuc.jeebus.spine.xsd.v1.FeatureAddressType;
import org.openmuc.jeebus.spine.xsd.v1.FeatureTypeEnumType;
import org.openmuc.jeebus.spine.xsd.v1.NodeManagementBindingDataType;
import org.openmuc.jeebus.spine.xsd.v1.RoleType;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import static org.openmuc.jeebus.spine.TestUtilities.*;

public class BindingTest {
    private Device client;
    private Device server;

    @BeforeEach
    void setupDevices() {
        server = addFeature(
            getGenericDeviceBuilder(
                REMOTE_COMM,
                REMOTE_DEVICE_ADDRESS
            ), RoleType.SERVER
        ).build();
        client = addFeature(
            getGenericDeviceBuilder(
                LOCAL_COMM,
                LOCAL_DEVICE_ADDRESS
            ).withDiscoverDevices(true),
            RoleType.CLIENT
        ).build();
    }

    @Test
    void testBindingCreation() throws SpineException, ExecutionException,
        InterruptedException {
        CompletableFuture<RequestResult> bindingRequest = client
            .getFeature(CLIENT_FEATURE_ADDRESS)
            .requestBind(SERVER_FEATURE_ADDRESS, FeatureTypeEnumType.GENERIC);
        Assertions.assertDoesNotThrow((ThrowingSupplier<RequestResult>) bindingRequest::get);
        assertDeviceRegisteredBinding(client, server, true);
        assertDeviceRegisteredBinding(server, client, true);
    }

    private void assertDeviceRegisteredBinding(
        Device requestingDevice,
        Device deviceUnderTest,
        boolean compare
    )
        throws ExecutionException, InterruptedException {
        CompletableFuture<RequestResult> bindingReadRequest = requestingDevice
            .getNodeManagement()
            .requestBindingData(deviceUnderTest.getAddress().getDevice());
        NodeManagementBindingDataType bindingData = bindingReadRequest
            .get()
            .getCmd()
            .getNodeManagementBindingData();
        if (compare) {
            Assertions.assertTrue(containsBinding(bindingData));
        }
        else {
            Assertions.assertFalse(containsBinding(bindingData));
        }
    }

    private boolean containsBinding(NodeManagementBindingDataType bindingData) {
        if (bindingData != null && bindingData.getBindingEntry() != null) {
            for (NodeManagementBindingDataType.BindingEntry binding : bindingData.getBindingEntry()) {
                if (addressEquals(binding.getClientAddress(), CLIENT_FEATURE_ADDRESS)
                    && addressEquals(
                    binding.getServerAddress(), SERVER_FEATURE_ADDRESS)) {
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
    void testBindingDeletion() throws SpineException, ExecutionException,
        InterruptedException {
        client
            .getFeature(CLIENT_FEATURE_ADDRESS)
            .requestBind(SERVER_FEATURE_ADDRESS, FeatureTypeEnumType.GENERIC);

        client
            .getFeature(CLIENT_FEATURE_ADDRESS)
            .releaseBoundServer(SERVER_FEATURE_ADDRESS);
        assertDeviceRegisteredBinding(client, server, false);
        assertDeviceRegisteredBinding(server, client, false);

        client
            .getFeature(CLIENT_FEATURE_ADDRESS)
            .requestBind(SERVER_FEATURE_ADDRESS, FeatureTypeEnumType.GENERIC);
        server
            .getFeature(SERVER_FEATURE_ADDRESS)
            .releaseBoundClient(CLIENT_FEATURE_ADDRESS);
        assertDeviceRegisteredBinding(client, server, false);
        assertDeviceRegisteredBinding(server, client, false);
    }

    @Test
    void testBindingDeletionOnServerFeatureRemoval() throws SpineException,
        ExecutionException, InterruptedException {
        client
            .getFeature(CLIENT_FEATURE_ADDRESS)
            .requestBind(SERVER_FEATURE_ADDRESS, FeatureTypeEnumType.GENERIC);
        server.getEntity(1).deleteFeature(0);
        assertDeviceRegisteredBinding(server, client, false);
        assertDeviceRegisteredBinding(client, server, false);
    }

    @Test
    void testBindingDeletionOnClientFeatureRemoval() throws SpineException,
        ExecutionException, InterruptedException {
        client
            .getFeature(CLIENT_FEATURE_ADDRESS)
            .requestBind(SERVER_FEATURE_ADDRESS, FeatureTypeEnumType.GENERIC);
        client.getEntity(1).deleteFeature(0);
        assertDeviceRegisteredBinding(server, client, false);
        assertDeviceRegisteredBinding(client, server, false);
    }
}
