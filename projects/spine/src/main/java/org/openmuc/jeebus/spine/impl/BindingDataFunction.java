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
import org.openmuc.jeebus.spine.xsd.v1.NodeManagementBindingDataType.BindingEntry;
import org.openmuc.jeebus.spine.xsd.v1.NodeManagementBindingDeleteCallType.BindingDelete;
import org.openmuc.jeebus.spine.xsd.v1.NodeManagementBindingRequestCallType.BindingRequest;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

class BindingDataFunction extends FeatureFunction {
    private final Map<String, Set<BindingEntry>>
        bindings = new ConcurrentHashMap<>();

    protected BindingDataFunction() {
        super(FunctionEnumType.NODE_MANAGEMENT_BINDING_DATA.value());
        setReadable(true, false);
    }

    @Override
    public CmdType read(
        FilterType filter,
        FeatureAddressType sourceAddress
    ) {
        CmdType cmd = new CmdType();

        NodeManagementBindingDataType bindingData
            = new NodeManagementBindingDataType();
        bindingData
            .getBindingEntry()
            .addAll(bindings.getOrDefault(
                sourceAddress.getDevice(),
                Collections.emptySet()
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

    void addBinding(BindingRequest bindingRequest) {
        BindingEntry bindingEntry = new BindingEntry();
        bindingEntry.setClientAddress(bindingRequest.getClientAddress());
        bindingEntry.setServerAddress(bindingRequest.getServerAddress());

        String remoteDeviceId;
        if (Objects.equals(
            bindingRequest.getClientAddress().getDevice(),
            feature.getDevice().getAddress().getDevice()
        )) {
            remoteDeviceId = bindingRequest.getServerAddress().getDevice();
        }
        else {
            remoteDeviceId = bindingRequest.getClientAddress().getDevice();
        }
        if(!bindings.containsKey(remoteDeviceId)) {
            bindings.put(remoteDeviceId, new HashSet<>());
        }
        bindings.get(remoteDeviceId).add(bindingEntry);
    }

    void deleteBinding(BindingDelete bindingDelete) throws SpineException {
        Set<BindingEntry> newEntries = new HashSet<>();
        Set<BindingEntry> deletedEntries = new HashSet<>();
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
        for (BindingEntry entry : bindings.getOrDefault(
            remoteDeviceId,
            Collections.emptySet()
        )) {
            if (matchAddress(
                entry.getServerAddress(),
                bindingDelete.getServerAddress()
            ) && matchAddress(
                entry.getClientAddress(), bindingDelete.getClientAddress())) {
                deletedEntries.add(entry);
            }
            else {
                newEntries.add(entry);
            }
        }
        bindings.put(remoteDeviceId, newEntries);

        for (BindingEntry entry : deletedEntries) {
            if (Objects.equals(
                entry.getServerAddress().getDevice(),
                feature.getDevice().getAddress().getDevice()
            )) {
                ((FeatureImpl) feature.getDevice()
                    .findFeature(entry.getServerAddress()).orElseThrow())
                    .removeBinding(entry.getClientAddress());
            }
        }
    }

    Map<String, Set<BindingDelete>> deleteBindings(
        FeatureAddressType featureAddress
    ) {
        Map<String, Set<BindingDelete>> bindingDeletions = new HashMap<>();
        for (Map.Entry<String, Set<BindingEntry>> bindingEntries : bindings.entrySet()) {
            Set<BindingDelete> releasedBindings = new HashSet<>();
            Set<BindingEntry> newBindingEntries = new HashSet<>();
            for (BindingEntry binding : bindingEntries.getValue()) {
                if (matchAddress(binding.getClientAddress(), featureAddress)
                    || matchAddress(
                    binding.getServerAddress(),
                    featureAddress
                )) {
                    BindingDelete bindingDelete = new BindingDelete();
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

    void removeBindings(String deviceAddress) {
        Optional.ofNullable(bindings.remove(deviceAddress))
            .ifPresent(entries -> entries.forEach(this::releaseServerBinding));
    }

    private void releaseServerBinding(BindingEntry binding) {
        this.feature.getDevice().findFeature(binding.getServerAddress())
            .ifPresent(found ->
                found.releaseBoundClient(binding.getClientAddress()));
    }

    @Override
    public void close() {
        // do nothing
    }
}
