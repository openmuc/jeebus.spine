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
import org.openmuc.jeebus.spine.api.Device;
import org.openmuc.jeebus.spine.api.Error;
import org.openmuc.jeebus.spine.api.RequestResult;
import org.openmuc.jeebus.spine.api.SpineException;
import org.openmuc.jeebus.spine.xsd.v1.*;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import static org.openmuc.jeebus.spine.TestUtilities.*;

public class CommunicationTest {

    @BeforeEach
    void reset() {
        ASSERTING_FEATURE_FUNCTION.reset();
    }

    @Test
    void testRead() throws ExecutionException, InterruptedException, SpineException {
        Device server = getGenericServer();
        Device client = getGenericClient();
        CompletableFuture<RequestResult> future = client.getNodeManagement()
            .requestRead(SERVER_FEATURE_ADDRESS, getReadCmd());
        Assertions.assertEquals(
            "off",
            future.get().getCmd().getActuatorSwitchData().getFunction()
        );

    }

    private Device getGenericServer() {
        return addFeature(
            getGenericDeviceBuilder(
                REMOTE_COMM,
                REMOTE_DEVICE_ADDRESS
            ), RoleType.SERVER
        ).build();
    }

    private Device getGenericClient() {
        return addFeature(
            getGenericDeviceBuilder(LOCAL_COMM, LOCAL_DEVICE_ADDRESS),
            RoleType.CLIENT
        ).withDiscoverDevices(true).build();
    }

    private CmdType getReadCmd() {
        CmdType readCmd = new CmdType();
        readCmd.setActuatorSwitchData(new ActuatorSwitchDataType());
        return readCmd;
    }

    @Test
    void testWrite() throws SpineException, ExecutionException,
        InterruptedException {
        Device server = getGenericServer();
        Device client = getGenericClient();
        CmdType writeCmd = getWriteCmd();

        ASSERTING_FEATURE_FUNCTION.assertActiveAndReset(false);
        CompletableFuture<RequestResult> writeRequest = client
            .getFeature(CLIENT_FEATURE_ADDRESS)
            .requestWrite(SERVER_FEATURE_ADDRESS, writeCmd);
        // Write request is denied (binding required)
        ExecutionException e = Assertions.assertThrows(
            ExecutionException.class,
            writeRequest::get
        );
        Assertions.assertEquals(
            Error.BINDING_NECESSARY,
            ((SpineException) e.getCause()).getError()
        );
        ASSERTING_FEATURE_FUNCTION.assertActiveAndReset(false);

        CompletableFuture<RequestResult> bindingRequest = client
            .getFeature(CLIENT_FEATURE_ADDRESS)
            .requestBind(SERVER_FEATURE_ADDRESS, FeatureTypeEnumType.GENERIC);
        // Wait for binding completion
        bindingRequest.get();
        ASSERTING_FEATURE_FUNCTION.assertActiveAndReset(false);
        writeRequest = client
            .getFeature(CLIENT_FEATURE_ADDRESS)
            .requestWrite(SERVER_FEATURE_ADDRESS, writeCmd);
        writeRequest.get();
        ASSERTING_FEATURE_FUNCTION.assertActiveAndReset(true);
    }

    private CmdType getWriteCmd() {
        CmdType writeCmd = new CmdType();
        ActuatorSwitchDataType actuatorSwitchData = new ActuatorSwitchDataType();
        actuatorSwitchData.setFunction(ActuatorSwitchFctEnumType.ON.value());
        writeCmd.setActuatorSwitchData(actuatorSwitchData);
        return writeCmd;
    }

    @Test
    void testInvalidOperations() throws SpineException {
        ASSERTING_FEATURE_FUNCTION.disable();
        Device server = getGenericServer();
        Device client = getGenericClient();
        CmdType writeCmd = getWriteCmd();
        CmdType readCmd = getReadCmd();
        CompletableFuture<RequestResult> request = client
            .getFeature(CLIENT_FEATURE_ADDRESS)
            .requestRead(SERVER_FEATURE_ADDRESS, readCmd);
        ExecutionException e = Assertions.assertThrows(
            ExecutionException.class,
            request::get
        );
        Assertions.assertEquals(
            Error.COMMAND_NOT_SUPPORTED,
            ((SpineException) e.getCause()).getError()
        );

        request = client
            .getFeature(CLIENT_FEATURE_ADDRESS)
            .requestWrite(SERVER_FEATURE_ADDRESS, writeCmd);
        e = Assertions.assertThrows(ExecutionException.class, request::get);
        Assertions.assertEquals(
            Error.COMMAND_NOT_SUPPORTED,
            ((SpineException) e.getCause()).getError()
        );
    }
}
