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
import org.openmuc.jeebus.spine.spi.function.FeatureFunction;
import org.openmuc.jeebus.spine.utils.Filters;
import org.openmuc.jeebus.spine.xsd.v1.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class DestinationListDataFunction extends FeatureFunction {
    private final List<List<NodeManagementDestinationDataType>> destinationDataLists
        = new ArrayList<>();
    private final Map<String, Integer> addressInterfaceMap = new HashMap<>();

    DestinationListDataFunction() {
        super(FunctionEnumType.NODE_MANAGEMENT_DESTINATION_LIST_DATA.value());
        setReadable(true, true);
    }

    @Override
    public CmdType read(FilterType filter, FeatureAddressType sourceAddress) {
        CmdType reply = new CmdType();
        List<NodeManagementDestinationDataType> destinationDataList
            = getDestinationDataList(sourceAddress.getDevice());
        NodeManagementDestinationListDataType destinationListData
            = new NodeManagementDestinationListDataType();
        if (filter != null) {
            List<NodeManagementDestinationListDataSelectorsType> selectors
                = Filters.getSelectors(
                filter,
                NodeManagementDestinationListDataSelectorsType.class
            );

            NodeManagementDestinationListDataSelectorsType selector
                = selectors.isEmpty() ? null : selectors.get(0);

            List<NodeManagementDestinationDataType> filteredList
                = filterDestinationDataList(
                selector,
                filter.getNodeManagementDestinationDataElements(),
                destinationDataList
            );
            destinationListData
                .getNodeManagementDestinationData()
                .addAll(filteredList);
        }
        else {
            destinationListData
                .getNodeManagementDestinationData()
                .addAll(destinationDataList);
        }
        reply.setNodeManagementDestinationListData(destinationListData);
        return reply;
    }

    @Override
    public SpineAcknowledgment write(CmdType cmd, FeatureAddressType sourceAddress) {
        throw new UnsupportedOperationException();
    }

    @Override
    public SpineAcknowledgment call(CmdType cmd, FeatureAddressType sourceAddress) {
        throw new UnsupportedOperationException();
    }

    private List<NodeManagementDestinationDataType> getDestinationDataList(String source) {
        List<NodeManagementDestinationDataType> destinationDataList
            = new ArrayList<>();
        String communicationAddress = feature
            .getDevice()
            .getConnectionHandler()
            .getCommunicationAddress(source);
        for (Map.Entry<String, Integer> addressInterfaceEntry : addressInterfaceMap.entrySet()) {
            if (!addressInterfaceEntry.getKey().equals(communicationAddress)) {
                destinationDataList.addAll(destinationDataLists.get(
                    addressInterfaceEntry.getValue()));
            }
        }
        return destinationDataList;
    }

    private List<NodeManagementDestinationDataType> filterDestinationDataList(
        NodeManagementDestinationListDataSelectorsType selector,
        NodeManagementDestinationDataElementsType elements,
        List<NodeManagementDestinationDataType> destinationDataList
    ) {
        List<NodeManagementDestinationDataType> filteredList = new ArrayList<>();
        for (NodeManagementDestinationDataType destinationData : destinationDataList) {
            if (isSelected(destinationData, selector)) {
                filteredList.add(filterDestinationDataElement(
                    destinationData,
                    elements
                ));
            }
        }
        return filteredList;
    }

    private boolean isSelected(
        NodeManagementDestinationDataType destinationData,
        NodeManagementDestinationListDataSelectorsType selector
    ) {
        return selector == null || (!isDeviceTypeWrong(destinationData, selector)
            && !isDeviceAddressWrong(
            destinationData, selector));
    }

    private NodeManagementDestinationDataType filterDestinationDataElement(
        NodeManagementDestinationDataType destinationData,
        NodeManagementDestinationDataElementsType elements
    ) {
        if (elements == null) {
            return destinationData;
        }
        NodeManagementDestinationDataType filteredDestinationData
            = new NodeManagementDestinationDataType();
        NodeManagementDestinationDataType.DeviceDescription filteredDescription
            = new NodeManagementDestinationDataType.DeviceDescription();
        if (elements.getDeviceDescription().getDeviceAddress() != null) {
            filteredDescription.setDeviceAddress(destinationData
                .getDeviceDescription()
                .getDeviceAddress());
        }
        if (elements.getDeviceDescription().getNetworkFeatureSet() != null
            || destinationData.getDeviceDescription().getNetworkFeatureSet()
            != null) {
            filteredDescription.setNetworkFeatureSet(destinationData
                .getDeviceDescription()
                .getNetworkFeatureSet());
        }
        if (elements.getDeviceDescription().getLastStateChange() != null
            || destinationData.getDeviceDescription().getLastStateChange() != null) {
            filteredDescription.setLastStateChange(destinationData
                .getDeviceDescription()
                .getLastStateChange());
        }
        if (elements.getDeviceDescription().getLabel() != null
            || destinationData.getDeviceDescription().getLabel() != null) {
            filteredDescription.setLabel(destinationData
                .getDeviceDescription()
                .getLabel());
        }
        filteredDestinationData.setDeviceDescription(filteredDescription);
        return filteredDestinationData;
    }

    private boolean isDeviceTypeWrong(
        NodeManagementDestinationDataType destinationData,
        NodeManagementDestinationListDataSelectorsType selector
    ) {
        return selector.getDeviceDescription().getDeviceType() != null && !selector
            .getDeviceDescription()
            .getDeviceType()
            .equals(destinationData.getDeviceDescription().getDeviceType());
    }

    private boolean isDeviceAddressWrong(
        NodeManagementDestinationDataType destinationData,
        NodeManagementDestinationListDataSelectorsType selector
    ) {
        return selector.getDeviceDescription().getDeviceAddress() != null
            && !selector.getDeviceDescription()
            .getDeviceAddress()
            .getDevice()
            .equals(destinationData
                .getDeviceDescription()
                .getDeviceAddress()
                .getDevice());
    }

    void addDevice(NodeManagementDetailedDiscoveryDeviceInformationType deviceInformation) {
        String communicationAddress = feature.getDevice()
            .getConnectionHandler()
            .getCommunicationAddress(deviceInformation
                .getDescription()
                .getDeviceAddress()
                .getDevice());
        Integer group = addressInterfaceMap.get(communicationAddress);
        if (group == null
            || deviceInformation.getDescription().getNetworkFeatureSet() == null
            || deviceInformation.getDescription()
            .getNetworkFeatureSet()
            .equals(NetworkManagementFeatureSetType.SIMPLE)) {
            return;
        }
        NodeManagementDestinationDataType destinationData
            = new NodeManagementDestinationDataType();
        NodeManagementDestinationDataType.DeviceDescription deviceDescription
            = getDeviceDescription(deviceInformation);
        destinationData.setDeviceDescription(deviceDescription);
        destinationDataLists.get(group).add(destinationData);
        notifySubscribersDeviceAdded(destinationData);
    }

    private static NodeManagementDestinationDataType.DeviceDescription getDeviceDescription(
        NodeManagementDetailedDiscoveryDeviceInformationType deviceInformation
    ) {
        NodeManagementDestinationDataType.DeviceDescription deviceDescription
            = new NodeManagementDestinationDataType.DeviceDescription();
        deviceDescription.setDeviceAddress(deviceInformation
            .getDescription()
            .getDeviceAddress());
        if (deviceInformation.getDescription().getNetworkFeatureSet() != null) {
            deviceDescription.setNetworkFeatureSet(deviceInformation
                .getDescription()
                .getNetworkFeatureSet());
        }
        deviceDescription.setLastStateChange(NetworkManagementStateChangeType.ADDED);
        if (deviceInformation.getDescription().getLabel() != null) {
            deviceDescription.setLabel(deviceInformation
                .getDescription()
                .getLabel());
        }
        return deviceDescription;
    }

    private void notifySubscribersDeviceAdded(NodeManagementDestinationDataType destinationData) {
        CmdType notifyCmd = new CmdType();
        notifyCmd.getFilter().add(getPartialFilter());
        notifyCmd.setFunction(getFunctionName());
        NodeManagementDestinationListDataType destinationListData
            = new NodeManagementDestinationListDataType();
        destinationListData.getNodeManagementDestinationData().add(destinationData);
        notifyCmd.setNodeManagementDestinationListData(destinationListData);
        feature.notifySubscribers(notifyCmd);
    }

    private FilterType getPartialFilter() {
        FilterType filter = new FilterType();
        CmdControlType cmdControl = new CmdControlType();
        cmdControl.setPartial(new ElementTagType());
        filter.setCmdControl(cmdControl);
        return filter;
    }

    boolean isRegistered(String source, String destination) {
        List<NodeManagementDestinationDataType> destinationDataList
            = getDestinationDataList(source);
        return destinationDataList.stream()
            .anyMatch(destinationData -> destination.equals(
                destinationData
                    .getDeviceDescription()
                    .getDeviceAddress()
                    .getDevice()));
    }

    public void mapAddressToCommunication(
        String communicationAddress,
        Integer communicationInterface
    ) {
        addressInterfaceMap.put(communicationAddress, communicationInterface);
    }

    public void deleteAddressMapping(String communicationAddress) {
        Integer group = addressInterfaceMap.remove(communicationAddress);
        if (group == null) {
            return;
        }
        String deviceAddress = feature
            .getDevice()
            .getConnectionHandler()
            .getDeviceAddress(
                communicationAddress);
        int destinationDataIndex = 0;
        for (NodeManagementDestinationDataType destinationData : destinationDataLists.get(
            group)) {
            if (destinationData
                .getDeviceDescription()
                .getDeviceAddress()
                .getDevice()
                .equals(deviceAddress)) {
                break;
            }
            destinationDataIndex++;
        }
        if (destinationDataIndex < destinationDataLists.get(group).size()) {
            NodeManagementDestinationDataType removed = destinationDataLists
                .get(group)
                .remove(destinationDataIndex);
            notifySubscribersDeviceRemoved(removed
                .getDeviceDescription()
                .getDeviceAddress());
        }
    }

    private void notifySubscribersDeviceRemoved(DeviceAddressType deviceAddress) {
        CmdType notifyCmd = new CmdType();
        notifyCmd.getFilter().add(getPartialFilter());
        notifyCmd.setFunction(getFunctionName());
        NodeManagementDestinationListDataType destinationListData
            = new NodeManagementDestinationListDataType();
        NodeManagementDestinationDataType destinationData
            = new NodeManagementDestinationDataType();
        destinationData.setDeviceDescription(new NodeManagementDestinationDataType.DeviceDescription());
        destinationData.getDeviceDescription().setDeviceAddress(deviceAddress);
        destinationData
            .getDeviceDescription()
            .setLastStateChange(NetworkManagementStateChangeType.REMOVED);
        destinationListData.getNodeManagementDestinationData().add(destinationData);
        notifyCmd.setNodeManagementDestinationListData(destinationListData);
        feature.notifySubscribers(notifyCmd);
    }

    public Integer createInterfaceGroup() {
        destinationDataLists.add(new ArrayList<>());
        return destinationDataLists.size() - 1;
    }

    @Override
    public void close() {
        // do nothing
    }
}
