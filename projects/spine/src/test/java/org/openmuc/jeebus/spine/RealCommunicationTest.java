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

import org.awaitility.Awaitility;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.openmuc.jeebus.ship.api.cert.KeyStoreCertificateStorage;
import org.openmuc.jeebus.ship.node.ShipConfig;
import org.openmuc.jeebus.shipspine.ShipCommunication;
import org.openmuc.jeebus.spine.api.Device;
import org.openmuc.jeebus.spine.api.Error;
import org.openmuc.jeebus.spine.api.RequestResult;
import org.openmuc.jeebus.spine.api.SpineException;
import org.openmuc.jeebus.spine.spi.Communication;
import org.openmuc.jeebus.spine.xsd.v1.*;

import java.util.Arrays;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

import static org.openmuc.jeebus.shipspine.ShipCommunication.ConnectClientsTo.NONE;
import static org.openmuc.jeebus.shipspine.ShipCommunication.ConnectClientsTo.TRUSTED;
import static org.openmuc.jeebus.spine.TestUtilities.*;
import static org.openmuc.jeebus.spine.xsd.v1.DeviceTypeEnumType.GENERIC;

/**
 * This test is similar to {@link CommunicationTest}, but runs over an actual
 * network connection. It checks that SHIP and the shipspine interaction work as
 * expected.
 * <p>
 * If this test fails and {@link CommunicationTest} doesn't, that means something
 * is wrong in SHIP and/or shipspine. If both fail, this test provides no additional
 * information.
 */
@Execution(ExecutionMode.SAME_THREAD)
public class RealCommunicationTest {

    private static final String SERVICE_DOMAIN = "real-comm-test.";

    public static final String LOCALHOST_0 = "localhost:0";

    private static final ShipConfig serverConf = ShipConfig.getBuilder()
        .withServerBindAddresses(LOCALHOST_0)
        .withId("EXAMPLEBRAND-EEB01M3EU-001122334455")
        .withMDnsServiceInstance("Dishwasher ExampleCompany EEB01M3EU")
        .withMDnsDomain(SERVICE_DOMAIN)
        .withCertificateStorage(new KeyStoreCertificateStorage(
            "test-keystore.jks",
            "testServer",
            getPassphrase(),
            getPassphrase()
        ))
        .withCertificateDistinguishedName("CN=example name")
        .withTrustedSkis("7a936d51b36b812abb872f6d8579c3948ed3852a")
        .withNetworkInterfaceScanInitialDelay(0)
        .build();

    private static final ShipConfig clientConf = ShipConfig.getBuilder()
        .withServerBindAddresses(LOCALHOST_0)
        .withId("EXAMPLEBRAND-EEB01M3EU-001122334456")
        .withMDnsServiceInstance("Dishwasher ExampleCompany EEB01M4EU")
        .withMDnsDomain(SERVICE_DOMAIN)
        .withCertificateStorage(new KeyStoreCertificateStorage(
            "test-keystore.jks",
            "testClient",
            getPassphrase(),
            getPassphrase()
        ))
        .withCertificateDistinguishedName("CN=example name")
        .withTrustedSkis("5eacb47f1755ac2e9ddffb86084aaf5a701ac826")
        .withNetworkInterfaceScanInitialDelay(0)
        .build();

    private static char[] getPassphrase() {
        char[] chars = "1vny1zlo1x8e1vnw1vn61x8g1zlu1vn4".toCharArray();
        return Arrays.copyOf(chars, chars.length);
    }

    private Communication serverComm;
    Device server;

    private Communication clientComm;
    Device client;


    private Device getGenericServer() {
        return Device
            .getBuilder()
            .withDeviceType(GENERIC)
            .withCommunication(serverComm)
            .withId(REMOTE_DEVICE_ADDRESS)
            .addEntity()
            .setType(EntityTypeEnumType.GENERIC)
            .addFeature()
            .setRole(RoleType.SERVER)
            .setType(FeatureTypeEnumType.GENERIC)
            .setFeaturePermission(ALLOWING_FEATURE_PERMISSION)
            .addFunction(ASSERTING_FEATURE_FUNCTION)
            .apply()
            .withUseCases()
            .applyToDevice()
            .withDiscoverDevices(true)
            .build();
    }

    private Device getGenericClient() {
        return Device
            .getBuilder()
            .withDeviceType(GENERIC)
            .withCommunication(clientComm)
            .withId(LOCAL_DEVICE_ADDRESS)
            .addEntity()
            .setType(EntityTypeEnumType.GENERIC)
            .addFeature()
            .setRole(RoleType.CLIENT)
            .setType(FeatureTypeEnumType.GENERIC)
            .setFeaturePermission(ALLOWING_FEATURE_PERMISSION)
            .apply()
            .withUseCases()
            .applyToDevice()
            .withDiscoverDevices(true)
            .build();
    }

    @BeforeEach
    void setup() {
        ASSERTING_FEATURE_FUNCTION.reset();

        // these SKIs are derived from the keys in test-keystore.jks, which is
        // checked into git, ensuring the SKIs don't change. If the keystore is
        // changed or regenerated for some reason, these SKIs will need to be changed.
        serverComm = new ShipCommunication(serverConf)
            .withConnectClientsTo(NONE);
        clientComm = new ShipCommunication(clientConf)
            .withConnectClientsTo(TRUSTED);

        server = getGenericServer();
        client = getGenericClient();
    }

    @AfterEach
    void teardown() {
        if (server != null) server.close();
        if (client != null) client.close();
    }

    /**
     * It can take a while until mDNS service discovery fires and the devices find
     * each other, so the tests have to wait until that is done.
     * @return whether the server and client have found each other.
     */
    private boolean devicesAreConnected() {
        return server.getConnectionHandler().getCommunicationAddress(LOCAL_DEVICE_ADDRESS) != null
            && client.getConnectionHandler().getCommunicationAddress(REMOTE_DEVICE_ADDRESS) != null;
    }

    @Test
    void testRead() throws ExecutionException, InterruptedException {
        Awaitility.await().atMost(10, TimeUnit.SECONDS).until(this::devicesAreConnected);
        CompletableFuture<RequestResult> future = client.getNodeManagement()
            .requestRead(SERVER_FEATURE_ADDRESS, getReadCmd());
        Assertions.assertEquals(
            "off",
            future.get().getCmd().getActuatorSwitchData().getFunction()
        );

    }

    private CmdType getReadCmd() {
        CmdType readCmd = new CmdType();
        readCmd.setActuatorSwitchData(new ActuatorSwitchDataType());
        return readCmd;
    }

    @Test
    void testWrite() throws SpineException, ExecutionException,
        InterruptedException {
        Awaitility.await().atMost(10, TimeUnit.SECONDS).until(this::devicesAreConnected);
        CmdType writeCmd = getWriteCmd();

        ASSERTING_FEATURE_FUNCTION.assertActiveAndReset(false);
        CompletableFuture<RequestResult> writeRequest = client
            .getFeature(TestUtilities.CLIENT_FEATURE_ADDRESS)
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
            .getFeature(TestUtilities.CLIENT_FEATURE_ADDRESS)
            .requestBind(SERVER_FEATURE_ADDRESS, FeatureTypeEnumType.GENERIC);
        // Wait for binding completion
        bindingRequest.get();
        ASSERTING_FEATURE_FUNCTION.assertActiveAndReset(false);
        writeRequest = client
            .getFeature(TestUtilities.CLIENT_FEATURE_ADDRESS)
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
        Awaitility.await().atMost(10, TimeUnit.SECONDS).until(this::devicesAreConnected);
        ASSERTING_FEATURE_FUNCTION.disable();
        CmdType writeCmd = getWriteCmd();
        CmdType readCmd = getReadCmd();
        CompletableFuture<RequestResult> request = client
            .getFeature(TestUtilities.CLIENT_FEATURE_ADDRESS)
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
            .getFeature(TestUtilities.CLIENT_FEATURE_ADDRESS)
            .requestWrite(SERVER_FEATURE_ADDRESS, writeCmd);
        e = Assertions.assertThrows(ExecutionException.class, request::get);
        Assertions.assertEquals(
            Error.COMMAND_NOT_SUPPORTED,
            ((SpineException) e.getCause()).getError()
        );
    }
}
