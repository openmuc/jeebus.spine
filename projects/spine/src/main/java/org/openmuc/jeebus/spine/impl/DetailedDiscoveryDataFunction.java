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

import org.openmuc.jeebus.spine.api.Entity;
import org.openmuc.jeebus.spine.api.EntityParent;
import org.openmuc.jeebus.spine.api.Feature;
import org.openmuc.jeebus.spine.api.SpineAcknowledgment;
import org.openmuc.jeebus.spine.spi.function.FeatureFunction;
import org.openmuc.jeebus.spine.utils.Filters;
import org.openmuc.jeebus.spine.xsd.v1.*;

import java.util.ArrayList;
import java.util.List;

class DetailedDiscoveryDataFunction extends FeatureFunction {
    protected DetailedDiscoveryDataFunction() {
        super(FunctionEnumType.NODE_MANAGEMENT_DETAILED_DISCOVERY_DATA.value());
        setReadable(true, false);
    }

    @Override
    public CmdType read(FilterType filter, FeatureAddressType sourceAddress) {
        CmdType cmd = new CmdType();

        List<NodeManagementDetailedDiscoveryDataSelectorsType.DeviceInformation>
            deviceSelectors = new ArrayList<>();
        List<NodeManagementDetailedDiscoveryDataSelectorsType.EntityInformation>
            entitySelectors = new ArrayList<>();
        List<NodeManagementDetailedDiscoveryDataSelectorsType.FeatureInformation>
            featureSelectors = new ArrayList<>();
        getSelectors(filter, deviceSelectors, entitySelectors, featureSelectors);

        NodeManagementDetailedDiscoveryDataType data
            = new NodeManagementDetailedDiscoveryDataType();

        if (entitySelectors.isEmpty() && featureSelectors.isEmpty()) {
            setDeviceInformation(data, deviceSelectors, getDeviceElements(filter));
        }
        if (deviceSelectors.isEmpty()) {
            setEntityAndFeatureInformation(
                feature.getDevice(),
                data,
                entitySelectors,
                getEntityElements(filter),
                featureSelectors,
                getFeatureElements(filter)
            );
        }

        cmd.setNodeManagementDetailedDiscoveryData(data);

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

    private void getSelectors(
        FilterType filter,
        List<NodeManagementDetailedDiscoveryDataSelectorsType.DeviceInformation> deviceSelectors,
        List<NodeManagementDetailedDiscoveryDataSelectorsType.EntityInformation> entitySelectors,
        List<NodeManagementDetailedDiscoveryDataSelectorsType.FeatureInformation> featureSelectors
    ) {
        if (filter != null) {
            List<NodeManagementDetailedDiscoveryDataSelectorsType> ddSelectors
                = Filters.getSelectors(
                filter,
                NodeManagementDetailedDiscoveryDataSelectorsType.class
            );
            if (!ddSelectors.isEmpty()) {
                NodeManagementDetailedDiscoveryDataSelectorsType ddSelector
                    = ddSelectors.get(0);
                if (ddSelector.getDeviceInformation() != null) {
                    deviceSelectors.add(ddSelector.getDeviceInformation());
                }
                if (ddSelector.getEntityInformation() != null) {
                    entitySelectors.add(ddSelector.getEntityInformation());
                }
                if (ddSelector.getFeatureInformation() != null) {
                    featureSelectors.add(ddSelector.getFeatureInformation());
                }
            }
        }
    }

    private void setDeviceInformation(
        NodeManagementDetailedDiscoveryDataType data,
        List<NodeManagementDetailedDiscoveryDataSelectorsType.DeviceInformation> deviceSelectors,
        NodeManagementDetailedDiscoveryDeviceInformationElementsType.Description deviceElements
    ) {
        NodeManagementSpecificationVersionListType svList
            = new NodeManagementSpecificationVersionListType();
        svList
            .getSpecificationVersion()
            .add(feature.getDevice().getSpecificationVersion());
        data.setSpecificationVersionList(svList);

        for (NodeManagementDetailedDiscoveryDataSelectorsType.DeviceInformation deviceSelector : deviceSelectors) {
            if (deviceSelector.getDeviceType() != null && !deviceSelector
                .getDeviceType()
                .equals(feature.getDevice().getType().value())
                || deviceSelector.getDeviceAddress() != null && !deviceSelector
                .getDeviceAddress()
                .getDevice()
                .equals(feature.getDevice().getAddress().getDevice())) {
                return;
            }
        }

        NodeManagementDetailedDiscoveryDeviceInformationType deviceInfo
            = new NodeManagementDetailedDiscoveryDeviceInformationType();
        NodeManagementDetailedDiscoveryDeviceInformationType.Description description
            = new NodeManagementDetailedDiscoveryDeviceInformationType.Description();
        if (deviceElements == null || deviceElements.getDeviceAddress() != null) {
            description.setDeviceAddress(feature.getDevice().getAddress());
        }
        if (deviceElements == null || deviceElements.getDeviceType() != null) {
            description.setDeviceType(feature.getDevice().getType().value());
        }
        if ((deviceElements == null || deviceElements.getLabel() != null) && feature
            .getDevice()
            .hasLabel()) {
            description.setLabel(feature.getDevice().getLabel());
        }
        if ((deviceElements == null || deviceElements.getDescription() != null)
            && feature.getDevice()
            .hasDescription()) {
            description.setDescription(feature.getDevice().getDescription());
        }
        if ((deviceElements == null || deviceElements.getNetworkFeatureSet() != null)
            && feature.getDevice().getCommunicationMode() != null) {
            description.setNetworkFeatureSet(feature
                .getDevice()
                .getCommunicationMode());
        }

        deviceInfo.setDescription(description);
        data.setDeviceInformation(deviceInfo);
    }

    private NodeManagementDetailedDiscoveryDeviceInformationElementsType.Description getDeviceElements(
        FilterType filter
    ) {
        if (filter != null
            && filter.getNodeManagementDetailedDiscoveryDataElements() != null
            && filter
            .getNodeManagementDetailedDiscoveryDataElements()
            .getDeviceInformation() != null) {
            return filter
                .getNodeManagementDetailedDiscoveryDataElements()
                .getDeviceInformation()
                .getDescription();
        }
        return null;
    }

    private void setEntityAndFeatureInformation(
        EntityParent entityParent, NodeManagementDetailedDiscoveryDataType data,
        List<NodeManagementDetailedDiscoveryDataSelectorsType.EntityInformation> entitySelectors,
        NodeManagementDetailedDiscoveryEntityInformationElementsType.Description entityElements,
        List<NodeManagementDetailedDiscoveryDataSelectorsType.FeatureInformation> featureSelectors,
        NodeManagementDetailedDiscoveryFeatureInformationElementsType.Description featureElements
    ) {
        for (Entity entity : entityParent.getEntities()) {
            if (featureSelectors.isEmpty()) {
                if (isEntitySelected(entity, entitySelectors)) {
                    setEntityInformation(entity, data, entityElements);
                }
                else {
                    if (isSubEntitySelected(entity, entitySelectors)) {
                        setEntityAndFeatureInformation(
                            entity,
                            data,
                            entitySelectors,
                            entityElements,
                            featureSelectors,
                            featureElements
                        );
                    }
                    continue;
                }
            }

            for (Feature feature : entity.getFeatures()) {
                setFeatureInformation(
                    (FeatureImpl) feature,
                    data,
                    featureSelectors,
                    featureElements
                );
            }

            // recursively set all sub entity and feature information
            setEntityAndFeatureInformation(
                entity,
                data,
                entitySelectors,
                entityElements,
                featureSelectors,
                featureElements
            );
        }
    }

    private boolean isSubEntitySelected(
        Entity entity,
        List<NodeManagementDetailedDiscoveryDataSelectorsType.EntityInformation> entitySelectors
    ) {
        for (NodeManagementDetailedDiscoveryDataSelectorsType.EntityInformation entitySelector : entitySelectors) {
            if (entitySelector.getEntityAddress() != null
                && entitySelector.getEntityAddress().getEntity().size() > entity
                .getAddress()
                .getEntity()
                .size()) {
                if (matchAddress(
                    getAsFeatureAddress(entitySelector.getEntityAddress()),
                    getAsFeatureAddress(entity.getAddress())
                )) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean isEntitySelected(
        Entity entity,
        List<NodeManagementDetailedDiscoveryDataSelectorsType.EntityInformation> entitySelectors
    ) {
        for (NodeManagementDetailedDiscoveryDataSelectorsType.EntityInformation entitySelector : entitySelectors) {
            if (entitySelector.getEntityType() != null && !entitySelector
                .getEntityType()
                .equals(entity.getType().value())
                || entitySelector.getEntityAddress() != null && !matchAddress(
                getAsFeatureAddress(entity.getAddress()),
                getAsFeatureAddress(entitySelector.getEntityAddress())
            )) {
                return false;
            }
        }
        return true;
    }

    private FeatureAddressType getAsFeatureAddress(EntityAddressType address) {
        FeatureAddressType featureAddress = new FeatureAddressType();
        featureAddress.setDevice(address.getDevice());
        featureAddress.getEntity().addAll(address.getEntity());
        return featureAddress;
    }

    private NodeManagementDetailedDiscoveryEntityInformationElementsType.Description getEntityElements(
        FilterType filter
    ) {
        if (filter != null
            && filter.getNodeManagementDetailedDiscoveryDataElements() != null
            && filter
            .getNodeManagementDetailedDiscoveryDataElements()
            .getEntityInformation() != null) {
            return filter
                .getNodeManagementDetailedDiscoveryDataElements()
                .getEntityInformation()
                .getDescription();
        }
        return null;
    }

    private NodeManagementDetailedDiscoveryFeatureInformationElementsType.Description getFeatureElements(
        FilterType filter
    ) {
        if (filter != null
            && filter.getNodeManagementDetailedDiscoveryDataElements() != null
            && filter
            .getNodeManagementDetailedDiscoveryDataElements()
            .getFeatureInformation() != null) {
            return filter
                .getNodeManagementDetailedDiscoveryDataElements()
                .getFeatureInformation()
                .getDescription();
        }
        return null;
    }

    private void setEntityInformation(
        Entity entity,
        NodeManagementDetailedDiscoveryDataType data,
        NodeManagementDetailedDiscoveryEntityInformationElementsType.Description entityElements
    ) {
        NodeManagementDetailedDiscoveryEntityInformationType entityInfo
            = new NodeManagementDetailedDiscoveryEntityInformationType();
        NodeManagementDetailedDiscoveryEntityInformationType.Description description
            = new NodeManagementDetailedDiscoveryEntityInformationType.Description();

        if ((entityElements == null || entityElements.getLastStateChange() != null)
            && ((EntityImpl) entity).hasLastStateChange()) {
            description.setLastStateChange(((EntityImpl) entity).getLastStateChange());
        }
        if (entityElements == null || entityElements.getEntityAddress() != null) {
            description.setEntityAddress(new EntityAddressType()
                .withEntity(entity.getAddress().getEntity()));
        }
        if (entityElements == null || entityElements.getEntityType() != null) {
            description.setEntityType(entity.getType().value());
        }
        if ((entityElements == null || entityElements.getDescription() != null)
            && entity.hasDescription()) {
            description.setDescription(entity.getDescription());
        }
        if ((entityElements == null || entityElements.getLabel() != null)
            && entity.hasLabel()) {
            description.setLabel(entity.getLabel());
        }

        entityInfo.setDescription(description);
        data.getEntityInformation().add(entityInfo);
    }

    private void setFeatureInformation(
        FeatureImpl feature, NodeManagementDetailedDiscoveryDataType data,
        List<NodeManagementDetailedDiscoveryDataSelectorsType.FeatureInformation> featureSelectors,
        NodeManagementDetailedDiscoveryFeatureInformationElementsType.Description featureElements
    ) {
        NodeManagementDetailedDiscoveryFeatureInformationType featureInfo
            = new NodeManagementDetailedDiscoveryFeatureInformationType();
        NodeManagementDetailedDiscoveryFeatureInformationType.Description description
            = new NodeManagementDetailedDiscoveryFeatureInformationType.Description();

        for (NodeManagementDetailedDiscoveryDataSelectorsType.FeatureInformation featureSelector : featureSelectors) {
            if (featureSelector.getFeatureType() != null && !featureSelector
                .getFeatureType()
                .equals(feature.getType().value())
                || featureSelector.getFeatureAddress() != null && !matchAddress(
                feature.getAddress(), featureSelector.getFeatureAddress())) {
                return;
            }
        }

        if (featureElements == null || featureElements.getFeatureAddress() != null) {
            description.setFeatureAddress(feature.getAddressWithoutDevice());
        }
        if (featureElements == null || featureElements.getFeatureType() != null) {
            description.setFeatureType(feature.getType().value());
        }
        if (featureElements == null || featureElements.getFeatureGroup() != null) {
            description.setFeatureGroup(feature.getGroup());
        }
        if (featureElements == null || featureElements.getDescription() != null) {
            description.setRole(feature.getRole());
        }
        if ((feature.getRole() == RoleType.SERVER
            || feature.getRole() == RoleType.SPECIAL) && (featureElements == null
            || featureElements.getSupportedFunction() != null)) {
            description
                .getSupportedFunction()
                .addAll(feature.getFunctionPropertyList());
        }
        if ((featureElements == null || featureElements.getLabel() != null)
            && feature.hasLabel()) {
            description.setLabel(feature.getLabel());
        }
        if ((featureElements == null || featureElements.getDescription() != null)
            && feature.hasDescription()) {
            description.setDescription(feature.getDescription());
        }
        if ((featureElements == null || featureElements.getLastStateChange() != null)
            && feature.hasLastStateChange()) {
            description.setLastStateChange(feature.getLastStateChange());
        }
        if ((featureElements == null
            || featureElements.getMinimumTrustLevel() != null)
            && feature.hasMinimumTrustLevel()) {
            description.setMinimumTrustLevel(feature.getMinimumTrustLevel());
        }

        featureInfo.setDescription(description);
        data.getFeatureInformation().add(featureInfo);
    }

    @Override
    public void close() {
        // do nothing
    }
}
