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
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.ThrowingSupplier;
import org.openmuc.jeebus.spine.api.Device;
import org.openmuc.jeebus.spine.api.Error;
import org.openmuc.jeebus.spine.api.RequestResult;
import org.openmuc.jeebus.spine.api.SpineException;
import org.openmuc.jeebus.spine.xsd.v1.*;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import static org.openmuc.jeebus.spine.TestUtilities.*;

class FeaturePermissionTest {

    @BeforeEach
    void reset() {
        CHANGEABLE_FEATURE_PERMISSION.reset();
        ASSERTING_FEATURE_FUNCTION.reset();
    }

    @Test
    void testMinimumTrustLevelGained() throws SpineException {
        Device server = getGenericDeviceBuilder(REMOTE_COMM, REMOTE_DEVICE_ADDRESS)
            .addEntity()
            .setType(EntityTypeEnumType.GENERIC)
            .addFeature()
            .setFeaturePermission(CHANGEABLE_FEATURE_PERMISSION)
            .setMinimumTrustLevel(ChangeableFeaturePermission.MINIMUM_TRUST_LEVEL)
            .setRole(RoleType.SERVER)
            .setType(FeatureTypeEnumType.GENERIC)
            .addFunction(ASSERTING_FEATURE_FUNCTION)
            .apply()
            .applyToDevice()
            .build();
        Device client = addFeature(
            getGenericDeviceBuilder(LOCAL_COMM, LOCAL_DEVICE_ADDRESS),
            RoleType.CLIENT
        ).withDiscoverDevices(true).build();
        CHANGEABLE_FEATURE_PERMISSION.trust(CLIENT_FEATURE_ADDRESS);
        CompletableFuture<RequestResult> readRequest = client
            .getFeature(CLIENT_FEATURE_ADDRESS)
            .requestRead(SERVER_FEATURE_ADDRESS, getReadCmd());
        Assertions.assertDoesNotThrow((ThrowingSupplier<RequestResult>) readRequest::get);
        CompletableFuture<RequestResult> subscriptionRequest = client
            .getFeature(CLIENT_FEATURE_ADDRESS)
            .requestSubscription(
                SERVER_FEATURE_ADDRESS, FeatureTypeEnumType.GENERIC, datagram -> {
                }
            );
        Assertions.assertDoesNotThrow((ThrowingSupplier<RequestResult>) subscriptionRequest::get);
        CompletableFuture<RequestResult> bindingRequest = client
            .getFeature(CLIENT_FEATURE_ADDRESS)
            .requestBind(SERVER_FEATURE_ADDRESS, FeatureTypeEnumType.GENERIC);
        Assertions.assertDoesNotThrow((ThrowingSupplier<RequestResult>) bindingRequest::get);
        CompletableFuture<RequestResult> writeRequest = client
            .getFeature(CLIENT_FEATURE_ADDRESS)
            .requestWrite(SERVER_FEATURE_ADDRESS, getWriteCmd());
        Assertions.assertDoesNotThrow((ThrowingSupplier<RequestResult>) writeRequest::get);
    }

    private CmdType getReadCmd() {
        CmdType readCmd = new CmdType();
        readCmd.setActuatorSwitchData(new ActuatorSwitchDataType());
        return readCmd;
    }

    private CmdType getWriteCmd() {
        CmdType writeCmd = new CmdType();
        ActuatorSwitchDataType actuatorSwitchData = new ActuatorSwitchDataType();
        actuatorSwitchData.setFunction(ActuatorSwitchFctEnumType.TOGGLE.value());
        writeCmd.setActuatorSwitchData(actuatorSwitchData);
        return writeCmd;
    }

    @Test
    void testMinimumTrustLevelNotGained() throws SpineException {
        Device server = getGenericDeviceBuilder(REMOTE_COMM, REMOTE_DEVICE_ADDRESS)
            .addEntity()
            .setType(EntityTypeEnumType.GENERIC)
            .addFeature()
            .setFeaturePermission(CHANGEABLE_FEATURE_PERMISSION)
            .setMinimumTrustLevel(ChangeableFeaturePermission.MINIMUM_TRUST_LEVEL)
            .setRole(RoleType.SERVER)
            .setType(FeatureTypeEnumType.GENERIC)
            .addFunction(ASSERTING_FEATURE_FUNCTION)
            .apply()
            .applyToDevice()
            .build();
        Device client = addFeature(
            getGenericDeviceBuilder(LOCAL_COMM, LOCAL_DEVICE_ADDRESS),
            RoleType.CLIENT
        ).withDiscoverDevices(true).build();
        CompletableFuture<RequestResult> readRequest = client
            .getFeature(CLIENT_FEATURE_ADDRESS)
            .requestRead(SERVER_FEATURE_ADDRESS, getReadCmd());
        SpineException exception = (SpineException) Assertions
            .assertThrows(ExecutionException.class, readRequest::get)
            .getCause();
        Assertions.assertEquals(Error.COMMAND_REJECTED, exception.getError());
        CompletableFuture<RequestResult> subscriptionRequest = client
            .getFeature(CLIENT_FEATURE_ADDRESS)
            .requestSubscription(
                SERVER_FEATURE_ADDRESS, FeatureTypeEnumType.GENERIC, datagram -> {
                }
            );
        exception = (SpineException) Assertions
            .assertThrows(ExecutionException.class, subscriptionRequest::get)
            .getCause();
        Assertions.assertEquals(Error.COMMAND_REJECTED, exception.getError());
        CompletableFuture<RequestResult> bindingRequest = client
            .getFeature(CLIENT_FEATURE_ADDRESS)
            .requestBind(SERVER_FEATURE_ADDRESS, FeatureTypeEnumType.GENERIC);
        exception = (SpineException) Assertions
            .assertThrows(ExecutionException.class, bindingRequest::get)
            .getCause();
        Assertions.assertEquals(Error.COMMAND_REJECTED, exception.getError());
        CompletableFuture<RequestResult> writeRequest = client
            .getFeature(CLIENT_FEATURE_ADDRESS)
            .requestWrite(SERVER_FEATURE_ADDRESS, getWriteCmd());
        exception = (SpineException) Assertions
            .assertThrows(ExecutionException.class, writeRequest::get)
            .getCause();
        Assertions.assertEquals(Error.COMMAND_REJECTED, exception.getError());
    }
}