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

import org.openmuc.jeebus.spine.api.SpineAcknowledgment;
import org.openmuc.jeebus.spine.api.SpineException;
import org.openmuc.jeebus.spine.spi.function.FeatureFunction;
import org.openmuc.jeebus.spine.xsd.v1.*;
import org.openmuc.jeebus.spine.xsd.v1.NodeManagementSubscriptionDataType.SubscriptionEntry;
import org.openmuc.jeebus.spine.xsd.v1.NodeManagementSubscriptionDeleteCallType.SubscriptionDelete;
import org.openmuc.jeebus.spine.xsd.v1.NodeManagementSubscriptionRequestCallType.SubscriptionRequest;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

class SubscriptionDataFunction extends FeatureFunction {
    private final Map<String, Set<SubscriptionEntry>>
        subscriptions = new ConcurrentHashMap<>();

    protected SubscriptionDataFunction() {
        super(FunctionEnumType.NODE_MANAGEMENT_SUBSCRIPTION_DATA.value());
        setReadable(true, false);
    }

    @Override
    public CmdType read(
        FilterType filter,
        FeatureAddressType sourceAddress
    ) {
        CmdType cmd = new CmdType();
        NodeManagementSubscriptionDataType data
            = new NodeManagementSubscriptionDataType();
        data.getSubscriptionEntry()
            .addAll(subscriptions.getOrDefault(
                sourceAddress.getDevice(),
                Collections.emptySet()
            ));
        cmd.setNodeManagementSubscriptionData(data);
        return cmd;
    }

    @Override
    public SpineAcknowledgment write(
        CmdType cmd,
        FeatureAddressType sourceAddress
    ) {
        throw new UnsupportedOperationException();
    }

    @Override
    public SpineAcknowledgment call(
        CmdType cmd,
        FeatureAddressType sourceAddress
    ) {
        throw new UnsupportedOperationException();
    }


    public void addSubscriptionEntry(
        FeatureAddressType client,
        FeatureAddressType server
    ) {
        addSubscriptionEntry(new SubscriptionRequest()
            .withClientAddress(client)
            .withServerAddress(server)
        );
    }

    void addSubscriptionEntry(SubscriptionRequest subscriptionRequest) {

        SubscriptionEntry subscriptionEntry = new SubscriptionEntry();
        subscriptionEntry.setClientAddress(subscriptionRequest.getClientAddress());
        subscriptionEntry.setServerAddress(subscriptionRequest.getServerAddress());

        String remoteDeviceId;
        if (Objects.equals(
            subscriptionRequest.getClientAddress().getDevice(),
            feature.getDevice().getAddress().getDevice()
        )) {
            remoteDeviceId = subscriptionRequest.getServerAddress().getDevice();
        }
        else {
            remoteDeviceId = subscriptionRequest.getClientAddress().getDevice();
        }
        if (!subscriptions.containsKey(remoteDeviceId)) {
            subscriptions.put(remoteDeviceId, new HashSet<>());
        }
        subscriptions.get(remoteDeviceId).add(subscriptionEntry);
    }

    void removeSubscriptionEntry(SubscriptionDelete subscriptionDelete)
        throws SpineException
    {
        Set<SubscriptionEntry> newEntryList = new HashSet<>();
        Set<SubscriptionEntry> deletedEntryList = new HashSet<>();
        String remoteDeviceId;
        if (subscriptionDelete
            .getClientAddress()
            .getDevice()
            .equals(feature.getDevice().getAddress().getDevice())) {
            remoteDeviceId = subscriptionDelete.getServerAddress().getDevice();
        }
        else {
            remoteDeviceId = subscriptionDelete.getClientAddress().getDevice();
        }
        for (SubscriptionEntry entry : subscriptions.getOrDefault(
            remoteDeviceId,
            Collections.emptySet()
        )) {
            if (matchAddress(
                entry.getServerAddress(),
                subscriptionDelete.getServerAddress()
            ) && matchAddress(
                entry.getClientAddress(), subscriptionDelete.getClientAddress())) {
                deletedEntryList.add(entry);
            }
            else {
                newEntryList.add(entry);
            }
        }
        subscriptions.put(remoteDeviceId, newEntryList);

        for (SubscriptionEntry entry : deletedEntryList) {
            if (entry
                .getServerAddress()
                .getDevice()
                .equals(feature.getDevice().getAddress().getDevice())) {
                ((FeatureImpl) feature
                    .getDevice()
                    .getFeature(entry.getServerAddress())).removeSubscriber(
                    entry.getClientAddress());
            }
        }
    }

    Map<String, Set<SubscriptionDelete>> deleteSubscriptions(
        FeatureAddressType featureAddress
    ) {
        Map<String, Set<SubscriptionDelete>> subscriptionDeletes = new HashMap<>();

        for (Map.Entry<String, Set<SubscriptionEntry>> deviceSubscriptions : subscriptions.entrySet()) {
            Set<SubscriptionEntry> newSubscriptionEntries = new HashSet<>();
            Set<SubscriptionDelete> releasedSubscriptions = new HashSet<>();
            for (SubscriptionEntry subscriptionEntry : deviceSubscriptions.getValue()) {
                if (matchAddress(
                    subscriptionEntry.getClientAddress(),
                    featureAddress
                ) || matchAddress(
                    subscriptionEntry.getServerAddress(), featureAddress)) {
                    SubscriptionDelete
                        subscriptionDelete
                        = new SubscriptionDelete();
                    subscriptionDelete.setClientAddress(subscriptionEntry.getClientAddress());
                    subscriptionDelete.setServerAddress(subscriptionEntry.getServerAddress());
                    releasedSubscriptions.add(subscriptionDelete);
                }
                else {
                    newSubscriptionEntries.add(subscriptionEntry);
                }
            }
            if (!releasedSubscriptions.isEmpty()) {
                subscriptionDeletes.put(
                    deviceSubscriptions.getKey(),
                    releasedSubscriptions
                );
                deviceSubscriptions.setValue(newSubscriptionEntries);
            }
        }
        return subscriptionDeletes;
    }

    @Override
    public void close() {
        // do nothing
    }
}
