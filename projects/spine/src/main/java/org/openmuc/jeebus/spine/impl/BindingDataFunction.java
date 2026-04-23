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

class BindingDataFunction extends FeatureFunction {
    private final Map<String, List<NodeManagementBindingDataType.BindingEntry>>
        bindings = new ConcurrentHashMap<>();

    protected BindingDataFunction() {
        super(FunctionEnumType.NODE_MANAGEMENT_BINDING_DATA.value());
        setReadable(true, false);
    }

    @Override
    public CmdType read(FilterType filter, FeatureAddressType sourceAddress) {
        CmdType cmd = new CmdType();

        NodeManagementBindingDataType bindingData
            = new NodeManagementBindingDataType();
        bindingData
            .getBindingEntry()
            .addAll(bindings.getOrDefault(
                sourceAddress.getDevice(),
                Collections.emptyList()
            ));

        cmd.setNodeManagementBindingData(bindingData);

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

    void addBinding(NodeManagementBindingRequestCallType.BindingRequest bindingRequest) {
        NodeManagementBindingDataType.BindingEntry bindingEntry
            = new NodeManagementBindingDataType.BindingEntry();
        bindingEntry.setClientAddress(bindingRequest.getClientAddress());
        bindingEntry.setServerAddress(bindingRequest.getServerAddress());

        String remoteDeviceId;
        if (bindingRequest
            .getClientAddress()
            .getDevice()
            .equals(feature.getDevice().getAddress().getDevice())) {
            remoteDeviceId = bindingRequest.getServerAddress().getDevice();
        }
        else {
            remoteDeviceId = bindingRequest.getClientAddress().getDevice();
        }
        List<NodeManagementBindingDataType.BindingEntry> entries =
                bindings.computeIfAbsent(remoteDeviceId, _k -> Collections.synchronizedList(new ArrayList<>()));
        synchronized (entries) {
            entries.add(bindingEntry);
        }
    }

    void deleteBinding(NodeManagementBindingDeleteCallType.BindingDelete bindingDelete) throws
        SpineException {
        List<NodeManagementBindingDataType.BindingEntry> newEntryList
            = new ArrayList<>();
        List<NodeManagementBindingDataType.BindingEntry> deletedEntryList
            = new ArrayList<>();
        String remoteDeviceId;
        if (bindingDelete
            .getClientAddress()
            .getDevice()
            .equals(feature.getDevice().getAddress().getDevice())) {
            remoteDeviceId = bindingDelete.getServerAddress().getDevice();
        }
        else {
            remoteDeviceId = bindingDelete.getClientAddress().getDevice();
        }
        for (NodeManagementBindingDataType.BindingEntry entry : bindings.getOrDefault(
            remoteDeviceId,
            Collections.emptyList()
        )) {
            if (matchAddress(
                entry.getServerAddress(),
                bindingDelete.getServerAddress()
            ) && matchAddress(
                entry.getClientAddress(), bindingDelete.getClientAddress())) {
                deletedEntryList.add(entry);
            }
            else {
                newEntryList.add(entry);
            }
        }
        bindings.put(remoteDeviceId, newEntryList);

        for (NodeManagementBindingDataType.BindingEntry entry : deletedEntryList) {
            if (entry
                .getServerAddress()
                .getDevice()
                .equals(feature.getDevice().getAddress().getDevice())) {
                ((FeatureImpl) feature
                    .getDevice()
                    .getFeature(entry.getServerAddress())).removeBinding(
                    entry.getClientAddress());
            }
        }
    }

    Map<String, List<NodeManagementBindingDeleteCallType.BindingDelete>> deleteBindings(
        FeatureAddressType featureAddress
    ) {
        Map<String, List<NodeManagementBindingDeleteCallType.BindingDelete>>
            bindingDeletions = new HashMap<>();
        for (Map.Entry<String, List<NodeManagementBindingDataType.BindingEntry>> bindingEntries : bindings.entrySet()) {
            List<NodeManagementBindingDeleteCallType.BindingDelete> releasedBindings
                = new ArrayList<>();
            List<NodeManagementBindingDataType.BindingEntry> newBindingEntries
                = new ArrayList<>();
            for (NodeManagementBindingDataType.BindingEntry binding : bindingEntries.getValue()) {
                if (matchAddress(binding.getClientAddress(), featureAddress)
                    || matchAddress(
                    binding.getServerAddress(),
                    featureAddress
                )) {
                    NodeManagementBindingDeleteCallType.BindingDelete bindingDelete
                        = new NodeManagementBindingDeleteCallType.BindingDelete();
                    bindingDelete.setServerAddress(binding.getServerAddress());
                    bindingDelete.setClientAddress(binding.getClientAddress());
                    releasedBindings.add(bindingDelete);
                }
                else {
                    newBindingEntries.add(binding);
                }
            }
            if (!releasedBindings.isEmpty()) {
                bindingDeletions.put(bindingEntries.getKey(), releasedBindings);
                bindingEntries.setValue(newBindingEntries);
            }
        }
        return bindingDeletions;
    }

    @Override
    public void close() {
        // do nothing
    }
}
