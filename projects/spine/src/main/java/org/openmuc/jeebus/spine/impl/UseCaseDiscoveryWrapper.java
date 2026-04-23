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

import org.openmuc.jeebus.spine.api.CommunicationPartnerFeatureRequirement;
import org.openmuc.jeebus.spine.api.PresenceIndication;
import org.openmuc.jeebus.spine.api.UseCasePartner;
import org.openmuc.jeebus.spine.spi.UseCaseListener;
import org.openmuc.jeebus.spine.xsd.v1.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.invoke.MethodHandles;
import java.util.*;
import java.util.function.Function;

import static java.util.AbstractMap.Entry;
import static java.util.AbstractMap.SimpleEntry;
import static java.util.Collections.emptySet;
import static java.util.stream.Collectors.*;
import static org.openmuc.jeebus.spine.api.PresenceIndication.MANDATORY;
import static org.openmuc.jeebus.spine.utils.SpineUtilities.extractEntityAddress;
import static org.openmuc.jeebus.spine.xsd.v1.RoleType.SERVER;

public class UseCaseDiscoveryWrapper {
    private static final Logger LOGGER
        = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
    private final UseCaseListener listener;
    private final String useCase;
    private final String actor;
    private final Map<String, Set<String>> mandatoryFunctions;
    private final Map<FeatureTypeEnumType, Map<FunctionEnumType, PresenceIndication>>
        absoluteRequirements;

    public UseCaseDiscoveryWrapper(
        UseCaseListener listener,
        String useCase,
        String actor,
        Map<Long, PresenceIndication> scenarioRequirements,
        Set<CommunicationPartnerFeatureRequirement> communicationPartnerFeatureRequirements
    ) {
        this.listener = listener;
        this.useCase = useCase;
        this.actor = actor;

        absoluteRequirements = communicationPartnerFeatureRequirements
            .stream()
            .collect(toMap(
                CommunicationPartnerFeatureRequirement::getType,
                featureRequirement -> featureRequirement
                    .getAbsoluteRequirements(scenarioRequirements)
        ));

        mandatoryFunctions = absoluteRequirements
            .entrySet()
            .stream()
            .map(feature -> new SimpleEntry<>(
                feature.getKey().value(),
                feature
                    .getValue()
                    .entrySet()
                    .stream()
                    .filter(function ->
                        MANDATORY.equals(function.getValue()))
                    .map(Entry::getKey)
                    .map(FunctionEnumType::value)
                    .collect(toSet())
            ))
            .filter(entry -> !entry.getValue().isEmpty())
            .collect(toMap(
                Entry::getKey,
                Entry::getValue
            ));
    }

    public Boolean handleDiscovery(
        String communicationAddress,
        NodeManagementUseCaseDataType useCaseData,
        NodeManagementDetailedDiscoveryDataType detailedDiscoveryData
    ) {
        boolean result = false;

        Map<EntityAddressType, List<NodeManagementDetailedDiscoveryFeatureInformationType>>
            partnerEntities;
        Map<EntityAddressType, NodeManagementDetailedDiscoveryEntityInformationType>
            entityInfos;
        Map<EntityAddressType, List<NodeManagementUseCaseDataType.UseCaseInformation>>
            useCaseInfos;

        if (Objects.isNull(useCaseData) && Objects.nonNull(mandatoryFunctions)) {
            useCaseInfos = Collections.emptyMap();
            partnerEntities = findPartnerEntities(detailedDiscoveryData);
        }
        else {
            useCaseInfos = findPartnerUseCaseInfos(useCaseData);

            if (useCaseInfos.isEmpty()) {
                return result;
            }

            partnerEntities = findPartnerEntitiesByAddresses(
                detailedDiscoveryData,
                useCaseInfos.keySet()
            );
        }
        entityInfos = mapEntityAddressToInfo(detailedDiscoveryData, partnerEntities);

        List<UseCasePartner> useCasePartners = partnerEntities
            .keySet()
            .stream()
            .filter(Objects::nonNull)
            .flatMap(address -> {
                List<NodeManagementUseCaseDataType.UseCaseInformation> useCaseInfo = findUseCaseInfos(address, useCaseInfos);
                return useCaseInfo.stream().map(info ->
                        new UseCasePartner(
                                communicationAddress,
                                detailedDiscoveryData.getDeviceInformation(),
                                entityInfos.get(address),
                                mapTypesToFeatures(partnerEntities.get(address)),
                                info
                        ));
            })
            .collect(toList());

        if (useCasePartners.isEmpty()) {
            return false;
        }
        else {
            listener.onUpdate(useCasePartners);
            return true;
        }
    }

    /**
     * Filters the given {@link NodeManagementUseCaseDataType} for valid use case
     * partners.
     *
     * @param useCaseData
     *     the data to filter
     * @return a Map of Entity Adresses to UseCaseInformations of valid use case
     * partners
     */
    private Map<EntityAddressType, List<NodeManagementUseCaseDataType.UseCaseInformation>> findPartnerUseCaseInfos(
        NodeManagementUseCaseDataType useCaseData
    ) {
        return useCaseData
            .getUseCaseInformation()
            .stream()
            .filter(info -> Objects.equals(info.getActor(), actor))
            .filter(info -> info.getUseCaseSupport()
                .stream()
                .anyMatch(this::filterUseCaseSupport))
            .collect(groupingBy(info -> extractEntityAddress(info.getAddress()))
            );
    }

    private boolean filterUseCaseSupport(UseCaseSupportType useCaseSupportType) {
        boolean result = Objects.equals(
            useCaseSupportType.getUseCaseName(),
            useCase
        );
        if (result && Boolean.FALSE.equals(useCaseSupportType.getUseCaseAvailable())) {
            LOGGER.info(
                "A remote device supports use case {} but it is currently not available.",
                useCase
            );
            result = false;
        }
        return result;
    }

    private Map<EntityAddressType, List<NodeManagementDetailedDiscoveryFeatureInformationType>> findPartnerEntities(
        NodeManagementDetailedDiscoveryDataType detailedDiscoveryData
    ) {
        return detailedDiscoveryData
            .getFeatureInformation()
            .stream()
            .filter(feature ->
                SERVER.equals(feature.getDescription().getRole())
            )
            .filter(feature -> absoluteRequirements.containsKey(
                FeatureTypeEnumType.fromValue(feature
                    .getDescription()
                    .getFeatureType())
            ))
            .collect(groupingBy(feature -> extractEntityAddress(feature
                .getDescription()
                .getFeatureAddress()
            )))
            .entrySet()
            .stream()
            .filter(entry -> areAllMandatoryFeaturesPresent(entry.getValue()))
            .filter(entry -> entry
                .getValue()
                .stream()
                .allMatch(this::areAllMandatoryFunctionsPresent))
            .collect(toMap(
                Entry::getKey,
                Entry::getValue
            ));
    }

    private boolean areAllMandatoryFeaturesPresent(List<NodeManagementDetailedDiscoveryFeatureInformationType> features) {
        return features.stream()
            .map(feature -> feature
                .getDescription()
                .getFeatureType()
            )
            .collect(toSet()).containsAll(mandatoryFunctions.keySet());
    }

    private boolean areAllMandatoryFunctionsPresent(
        NodeManagementDetailedDiscoveryFeatureInformationType featureInfo
    ) {
        String feature = featureInfo.getDescription().getFeatureType();
        return featureInfo
            .getDescription()
            .getSupportedFunction()
            .stream()
            .map(FunctionPropertyType::getFunction)
            .collect(toSet())
            .containsAll(mandatoryFunctions.getOrDefault(feature, emptySet()));
    }

    private Map<FeatureTypeEnumType, NodeManagementDetailedDiscoveryFeatureInformationType> mapTypesToFeatures(
        List<NodeManagementDetailedDiscoveryFeatureInformationType> features
    ) {
        return features
            .stream()
            .filter(feature ->
                SERVER.equals(feature.getDescription().getRole())
            )
            .collect(toMap(
                feature -> FeatureTypeEnumType
                    .fromValue(feature.getDescription().getFeatureType()),
                Function.identity(),
                this::mergeFeatures
            ));
    }

    private NodeManagementDetailedDiscoveryFeatureInformationType mergeFeatures(
        NodeManagementDetailedDiscoveryFeatureInformationType feature1,
        NodeManagementDetailedDiscoveryFeatureInformationType feature2
    ) {
        LOGGER.warn(
            "There are multiple server features with the same featureType on the"
                + " same entity. Trying to filter by supported functions."
        );
        NodeManagementDetailedDiscoveryFeatureInformationType result = null;
        if (areAllMandatoryFunctionsPresent(feature1)) {
            result = feature1;
        }
        if (areAllMandatoryFunctionsPresent(feature2)) {
            result = feature2;
        }

        if (Objects.nonNull(result)) {
            LOGGER.info("A feature supports all mandatory functions:\n{}", result);
        }
        else {
            result = feature1.getDescription().getSupportedFunction().size()
                > feature2.getDescription().getSupportedFunction().size()
                    ? feature1
                    : feature2;
            LOGGER.warn(
                "Neither feature supports all mandatory functions."
                    + " Taking the one supporting more functions and hoping"
                    + " for the best:\n{}",
                result
            );
        }
        return result;
    }

    private Map<EntityAddressType, List<NodeManagementDetailedDiscoveryFeatureInformationType>> findPartnerEntitiesByAddresses(
        NodeManagementDetailedDiscoveryDataType detailedDiscoveryData,
        Set<EntityAddressType> entityAddresses
    ) {
        Set<EntityAddressType> validAddresses = entityAddresses
            .stream()
            .filter(address -> Objects.nonNull(address.getEntity())
                && !address.getEntity().isEmpty()
            )
            .collect(toSet());

        return detailedDiscoveryData
            .getFeatureInformation()
            .stream()
            .filter(info -> validAddresses.contains(
                extractEntityAddress(info.getDescription().getFeatureAddress()
            )))
            .collect(
                groupingBy(info ->
                    extractEntityAddress(info.getDescription().getFeatureAddress()
        )));
    }

    // return list is either singleton(null), or some number of non-null values
    private List<NodeManagementUseCaseDataType.UseCaseInformation> findUseCaseInfos(
        EntityAddressType address,
        Map<EntityAddressType, List<NodeManagementUseCaseDataType.UseCaseInformation>> useCaseInfos
    ) {
        /* This is necessary because some implementations omit entity addresses in
         * their UseCaseDiscovery, only stating their device address.
         * As this is allowed according to the EEBus Initiative,
         * we need to be able to deal with it. */
        EntityAddressType onlyDevice
            = new EntityAddressType().withDevice(address.getDevice());

        if (Objects.nonNull(useCaseInfos) && !useCaseInfos.isEmpty()) {
            List<NodeManagementUseCaseDataType.UseCaseInformation> infos = null;
            if (useCaseInfos.containsKey(address)) {
                infos = useCaseInfos.get(address);
            }
            else if (useCaseInfos.containsKey(onlyDevice)) {
                LOGGER.warn(
                    "Address of a use case information only contained the device part."
                        + " Attempting to fix this by filtering DetailedDiscovery."
                        + " Yet, proper use case execution may not be possible: {}",
                    address
                );
                infos = useCaseInfos.get(onlyDevice);
            }
            if (infos != null) {
                return infos.stream().map(info -> fixUseCaseInfo(address, info)).collect(toList());
            }
        }
        return Collections.singletonList(null);
    }

    private NodeManagementUseCaseDataType.UseCaseInformation fixUseCaseInfo(
        EntityAddressType address,
        NodeManagementUseCaseDataType.UseCaseInformation info
    ) {
        return new NodeManagementUseCaseDataType.UseCaseInformation()
            .withActor(
                info.getActor())
            .withAddress(new FeatureAddressType()
                .withDevice(address.getDevice())
                .withEntity(address.getEntity()))
            .withUseCaseSupport(info
                .getUseCaseSupport()
                .stream()
                .filter(support -> Objects.equals(support.getUseCaseName(), useCase))
                .collect(toSet()));
    }

    private static Map<EntityAddressType, NodeManagementDetailedDiscoveryEntityInformationType> mapEntityAddressToInfo(
        NodeManagementDetailedDiscoveryDataType detailedDiscoveryData,
        Map<EntityAddressType, List<NodeManagementDetailedDiscoveryFeatureInformationType>> partnerEntities
    ) {
        return detailedDiscoveryData
            .getEntityInformation()
            .stream()
            .filter(info -> partnerEntities.containsKey(
                extractEntityAddress(info.getDescription().getEntityAddress())
            ))
            .collect(toMap(
                info ->
                    extractEntityAddress(info.getDescription().getEntityAddress()),
                Function.identity(),
                (first, second) -> second
            ));
    }
}
