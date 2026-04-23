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

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

class SubscriptionDataFunction extends FeatureFunction {
    private final Map<String, List<NodeManagementSubscriptionDataType.SubscriptionEntry>>
        subscriptions = new ConcurrentHashMap<>();

    protected SubscriptionDataFunction() {
        super(FunctionEnumType.NODE_MANAGEMENT_SUBSCRIPTION_DATA.value());
        setReadable(true, false);
    }

    @Override
    public CmdType read(FilterType filter, FeatureAddressType sourceAddress) {
        CmdType cmd = new CmdType();
        NodeManagementSubscriptionDataType data
            = new NodeManagementSubscriptionDataType();
        data.getSubscriptionEntry()
            .addAll(subscriptions.getOrDefault(
                sourceAddress.getDevice(),
                Collections.emptyList()
            ));
        cmd.setNodeManagementSubscriptionData(data);
        return cmd;
    }

    @Override
    public SpineAcknowledgment write(CmdType cmd, FeatureAddressType sourceAddress) {
        throw new UnsupportedOperationException();
    }

    @Override
    public SpineAcknowledgment call(CmdType cmd, FeatureAddressType sourceAddress) {
        throw new UnsupportedOperationException();
    }

    void addSubscriptionEntry(NodeManagementSubscriptionRequestCallType.SubscriptionRequest subscriptionRequest) {
        NodeManagementSubscriptionDataType.SubscriptionEntry subscriptionEntry
            = new NodeManagementSubscriptionDataType.SubscriptionEntry();
        subscriptionEntry.setClientAddress(subscriptionRequest.getClientAddress());
        subscriptionEntry.setServerAddress(subscriptionRequest.getServerAddress());

        String remoteDeviceId;
        if (subscriptionRequest
            .getClientAddress()
            .getDevice()
            .equals(feature.getDevice().getAddress().getDevice())) {
            remoteDeviceId = subscriptionRequest.getServerAddress().getDevice();
        }
        else {
            remoteDeviceId = subscriptionRequest.getClientAddress().getDevice();
        }
        if (!subscriptions.containsKey(remoteDeviceId)) {
            subscriptions.put(remoteDeviceId, new ArrayList<>());
        }
        subscriptions.get(remoteDeviceId).add(subscriptionEntry);
    }

    void removeSubscriptionEntry(NodeManagementSubscriptionDeleteCallType.SubscriptionDelete subscriptionDelete)
        throws SpineException {
        List<NodeManagementSubscriptionDataType.SubscriptionEntry> newEntryList
            = new ArrayList<>();
        List<NodeManagementSubscriptionDataType.SubscriptionEntry> deletedEntryList
            = new ArrayList<>();
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
        for (NodeManagementSubscriptionDataType.SubscriptionEntry entry : subscriptions.getOrDefault(
            remoteDeviceId,
            Collections.emptyList()
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

        for (NodeManagementSubscriptionDataType.SubscriptionEntry entry : deletedEntryList) {
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

    Map<String, List<NodeManagementSubscriptionDeleteCallType.SubscriptionDelete>> deleteSubscriptions(
        FeatureAddressType featureAddress
    ) {
        Map<String, List<NodeManagementSubscriptionDeleteCallType.SubscriptionDelete>>
            subscriptionDeletes = new HashMap<>();
        for (Map.Entry<String, List<NodeManagementSubscriptionDataType.SubscriptionEntry>> deviceSubscriptions : subscriptions.entrySet()) {
            List<NodeManagementSubscriptionDataType.SubscriptionEntry>
                newSubscriptionEntries = new ArrayList<>();
            List<NodeManagementSubscriptionDeleteCallType.SubscriptionDelete>
                releasedSubscriptions = new ArrayList<>();
            for (NodeManagementSubscriptionDataType.SubscriptionEntry subscriptionEntry : deviceSubscriptions.getValue()) {
                if (matchAddress(
                    subscriptionEntry.getClientAddress(),
                    featureAddress
                ) || matchAddress(
                    subscriptionEntry.getServerAddress(), featureAddress)) {
                    NodeManagementSubscriptionDeleteCallType.SubscriptionDelete
                        subscriptionDelete
                        = new NodeManagementSubscriptionDeleteCallType.SubscriptionDelete();
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
