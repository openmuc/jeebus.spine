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

import org.openmuc.jeebus.spine.xsd.v1.FeatureTypeEnumType;
import org.openmuc.jeebus.spine.xsd.v1.FunctionEnumType;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import static org.openmuc.jeebus.spine.api.PresenceIndication.min;

// TODO: consider read/write/partial operations

/**
 * This class maps features and functions to the Use Case scenarios that require
 * their presence.
 * <p>
 * In the Use Case Specifications, you can find this information in the "Feature
 * Types and Functions used within this Use Case" tables.
 */
public class CommunicationPartnerFeatureRequirement {
    private final FeatureTypeEnumType type;
    private final Map<FunctionEnumType, Map<Long, PresenceIndication>>
        requirements;

    public CommunicationPartnerFeatureRequirement(
        FeatureTypeEnumType type,
        Map<FunctionEnumType, Map<Long, PresenceIndication>> functionRequirements
    ) {
        this.type = type;
        this.requirements = functionRequirements;
    }

    public FeatureTypeEnumType getType() {
        return type;
    }

    public Map<FunctionEnumType, Map<Long, PresenceIndication>> getRelativeRequirements() {
        return requirements;
    }

    /**
     * @param scenarioRequirements
     *     a Map linking the available scenario numbers to their PresenceIndicators
     * @return a map linking all functions contained in this object to their
     * PresenceIndications according to the given scenarioRequirements
     */
    public Map<FunctionEnumType, PresenceIndication> getAbsoluteRequirements(
        Map<Long, PresenceIndication> scenarioRequirements
    ) {
        Map<FunctionEnumType, Map<PresenceIndication, Set<Long>>>
            scenarioByRequirement = requirements
            .keySet()
            .stream()
            .collect(Collectors.toMap(
                Function.identity(),
                function -> requirements
                    .get(function)
                    .keySet()
                    .stream()
                    .collect(Collectors.groupingBy(
                        scenarioRequirements::get,
                        Collectors.toSet()
                    ))
            ));

        return scenarioByRequirement
            .entrySet()
            .stream()
            .collect(
                Collectors.toMap(
                    Entry::getKey,
                    entry ->
                        entry
                            .getValue()
                            .entrySet()
                            .stream()
                            .max(Entry.comparingByKey())
                            .orElseThrow()
                            .getValue()
                            .stream()
                            .map(scenario -> min(
                                requirements
                                    .get(entry.getKey())
                                    .get(scenario),
                                scenarioRequirements.get(scenario)
                            ))
                            .max(Enum::compareTo)
                            .orElseThrow()
                ));
    }

}
