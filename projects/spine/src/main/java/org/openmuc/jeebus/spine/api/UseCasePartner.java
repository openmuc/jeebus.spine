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

import org.openmuc.jeebus.spine.xsd.v1.*;

import java.util.Map;

/**
 * This class encapsulates a complete set of information on a valid, remote Use Case
 * partner.
 */
public class UseCasePartner {
    private final String communicationAddress;
    private final NodeManagementDetailedDiscoveryDeviceInformationType deviceInfo;
    private final NodeManagementDetailedDiscoveryEntityInformationType entityInfo;

    private final Map<FeatureTypeEnumType, NodeManagementDetailedDiscoveryFeatureInformationType>
        featureInfos;
    private final NodeManagementUseCaseDataType.UseCaseInformation useCaseInfo;

    public UseCasePartner(
        String communicationAddress,
        NodeManagementDetailedDiscoveryDeviceInformationType deviceInfo,
        NodeManagementDetailedDiscoveryEntityInformationType entityInfo,
        Map<FeatureTypeEnumType, NodeManagementDetailedDiscoveryFeatureInformationType> featureInfos,
        NodeManagementUseCaseDataType.UseCaseInformation useCaseInfo
    ) {
        this.communicationAddress = communicationAddress;
        this.deviceInfo = deviceInfo;
        this.entityInfo = entityInfo;
        this.featureInfos = featureInfos;
        this.useCaseInfo = useCaseInfo;
    }

    /**
     * @param type
     *     the type of the needed Feature.
     * @return the remote address of the Feature with the given type or null if there
     * is no such Feature.
     */
    public FeatureAddressType getCompleteFeatureAddress(FeatureTypeEnumType type) {
        return featureInfos.containsKey(type)
            ? new FeatureAddressType()
            .withDevice(deviceInfo.getDescription().getDeviceAddress().getDevice())
            .withEntity(entityInfo.getDescription().getEntityAddress().getEntity())
            .withFeature(featureInfos
                .get(type)
                .getDescription()
                .getFeatureAddress()
                .getFeature())
            : null;
    }

    /**
     * @return the address you can use at our NodeManagement to communicate with the
     * remote device
     */
    public String getCommunicationAddress() {
        return communicationAddress;
    }

    /**
     * @return the device information of the remote SPINE device
     */
    public NodeManagementDetailedDiscoveryDeviceInformationType getDeviceInfo() {
        return deviceInfo;
    }

    /**
     * @return the entity information of the remote entity supporting the use case
     */
    public NodeManagementDetailedDiscoveryEntityInformationType getEntityInfo() {
        return entityInfo;
    }

    /**
     * This may contain incomplete addresses. It is recommended to use
     * {@link #getCompleteFeatureAddress(FeatureTypeEnumType)} instead.
     *
     * @return information on the features of the remote entity concerning the use
     * case.
     */
    public Map<FeatureTypeEnumType, NodeManagementDetailedDiscoveryFeatureInformationType> getFeatureInfos() {
        return featureInfos;
    }

    /**
     * It is recommended to check the "UseCaseAvailable" flag to see whether the use
     * case is actually available right now. May be null if the remote device does
     * not support use case discovery.
     *
     * @return the use case information of the remote entity supporting the use case.
     */
    public NodeManagementUseCaseDataType.UseCaseInformation getUseCaseInfo() {
        return useCaseInfo;
    }

}
