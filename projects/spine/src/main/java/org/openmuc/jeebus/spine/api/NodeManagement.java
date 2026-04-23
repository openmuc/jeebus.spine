/********************************************************************************
 * Copyright (c) 2026 Fraunhofer ISE
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 ********************************************************************************/

package org.openmuc.jeebus.spine.api;

import org.openmuc.jeebus.ship.api.DisconnectReason;
import org.openmuc.jeebus.ship.api.ShipConnectionInterface;
import org.openmuc.jeebus.spine.impl.DeviceBuilder;
import org.openmuc.jeebus.spine.spi.DeviceListener;
import org.openmuc.jeebus.spine.spi.SpineSubscription;
import org.openmuc.jeebus.spine.spi.UseCaseListener;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

public interface NodeManagement extends Feature, FeatureWrapper {
    /**
     * Adds a listener which will get notified when the communication protocol
     * detects a new device. The received address can then be used to get information
     * with {@link #getFullDeviceInformationRequest(String)}.
     * <br>
     * When automatic detailed discovery is enabled
     * ({@link DeviceBuilder#withDiscoverDevices(boolean)}) the listener will be
     * called also with the device information.
     *
     * @param deviceListener
     *     the listener which will be notified about detected devices
     */
    void addDeviceListener(DeviceListener deviceListener);

    /**
     * Register a new UseCaseListener that is called when a remote device supports
     * the given use case as the given actor.
     * <p>
     * If a remote device does not support use case discovery, mandatory functions
     * are calculated using the given requirements to find an entity which supports
     * all mandatory FeatureFunctions for the execution of the use case.
     * <p>
     * TODO: Consider use case scenarios
     *
     * @param listener
     *     the listener to be called when a valid use case partner is found
     * @param useCase
     *     the use case to listen for
     * @param actor
     *     the use case actor to listen for
     * @param scenarioRequirements
     *     The scenarios with presence indicators to filter possible use case
     *     partners. In the Use Case Specifications, you can find this information in
     *     the "Scenario implementation requirements for Actors" tables.
     * @param communicationPartnerFeatureRequirements
     *     A set containing all features and functions linked to the scenarios that
     *     require their presence. In the Use Case Specifications, you can find this
     *     information in the "Feature Types and Functions used within this Use Case"
     *     tables.
     */
    void addUseCaseListener(
        UseCaseListener listener,
        String useCase,
        String actor,
        Map<Long, PresenceIndication> scenarioRequirements,
        Set<CommunicationPartnerFeatureRequirement> communicationPartnerFeatureRequirements
    );

    /**
     * Starts the automatic discovery process on the given communication address.
     * This includes full DetailedDiscovery, UseCaseDiscovery and a Subscription to
     * the remote devices NodeManagement.
     *
     * @param communicationAddress
     *     the communication address of a remote device.
     */
    void startDiscovery(String communicationAddress);

    /**
     * Executes a detailed discovery on the remote device. A successful discovery
     * automatically maps the discovered SPINE device address to its corresponding
     * communication address.
     *
     * @param communicationAddress
     *     the communication address of the remote device, i.e. not the SPINE device
     *     address
     * @return a CompletableFuture which is completed with the answer
     */
    CompletableFuture<RequestResult> getFullDeviceInformationRequest(String communicationAddress);

    /**
     * Reads supported UseCases of a remote device
     *
     * @param deviceAddress
     *     the SPINE device address part of the remote device
     * @param communicationAddress
     *     the communication address of the remote device, i.e. not the SPINE device
     *     address
     * @return a CompletableFuture which is completed with the answer
     */
    CompletableFuture<RequestResult> getFullUseCaseInformationRequest(
        String communicationAddress,
        String deviceAddress
    );

    CompletableFuture<RequestResult> getNodeManagementSubscriptionRequest(
        String communicationAddress,
        String deviceAddress,
        SpineSubscription listener
    );

    /**
     * Reads the subscription data the remote device registered with this device. The
     * returned
     * <code>CompletableFuture</code> is completed with a {@link SpineException} on
     * failure.
     *
     * @param deviceId
     *     the SPINE device address part of the remote device
     * @return a <code>CompletableFuture</code> which is completed with the answer
     */
    CompletableFuture<RequestResult> requestSubscriptionData(String deviceId);

    /**
     * Reads the binding data the remote device registered with this device. The
     * returned
     * <code>CompletableFuture</code> is completed with a {@link SpineException} on
     * failure.
     *
     * @param deviceId
     *     the SPINE device address part of the remote device
     * @return a <code>CompletableFuture</code> which is completed with the answer
     */
    CompletableFuture<RequestResult> requestBindingData(String deviceId);

    /**
     * Returns the destination list data of the remote device. The returned
     * <code>CompletableFuture</code> is completed with a {@link SpineException} on
     * failure.
     *
     * @param deviceId
     *     the SPINE device address part of the remote device
     * @return a <code>CompletableFuture</code> which is completed with the answer
     */
    CompletableFuture<RequestResult> requestDestinationListData(String deviceId);

    /**
     * Subscribes to the destination list data function of the remote device. The
     * returned
     * <code>CompletableFuture</code> is completed with a {@link SpineException} on
     * failure. If notifyFullRead is
     * <code>true</code> after a successful subscription a full read is executed on
     * the destination list data function. The reply is then passed to the
     * subscription as a notification. This means notification until the read reply
     * is received can be ignored.
     *
     * @param deviceId
     *     the SPINE device address part of the remote device
     * @param subscription
     *     the subscription which will be called with notifications
     * @param notifyFullRead
     *     true if a full read should be executed after successfully subscribing
     * @return a <code>CompletableFuture</code> which is completed with the answer
     */
    CompletableFuture<RequestResult> subscribeDestinationListData(
        String deviceId, SpineSubscription subscription, boolean notifyFullRead
    );

    /**
     * Assigns the given address to the given communication interface. The
     * communicationInterface parameter can be retrieved with
     * {@link NodeManagement#createInterfaceGroup()}. This method has no effect when
     * enhanced communication mode is disabled.
     *
     * @param communicationAddress
     *     the communication address which will be mapped to the communication
     *     interface
     * @param communicationInterface
     *     the communication interface received with
     *     {@link NodeManagement#createInterfaceGroup()}
     */
    void mapAddressToCommunication(
        String communicationAddress,
        Integer communicationInterface
    );

    /**
     * Creates a new interface group which communication addresses can be assigned
     * to. The destination list data function can then filter the destination list to
     * only contain destinations on different interfaces than the sender. This method
     * has no effect when enhanced communication mode is disabled.
     *
     * @return the unique id of the newly created group
     */
    Integer createInterfaceGroup();

    /**
     * Unmap the current communication interface from the given communication
     * address.
     *
     * @param communicationAddress
     *     the communication address which should be unmapped from the current
     *     communication interface
     */
    void removeAddressMapping(String communicationAddress);

    void notifyDisconnect(
        DisconnectReason disconnectReason,
        ShipConnectionInterface shipConnectionInterface
    );
}
