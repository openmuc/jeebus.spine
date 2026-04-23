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

import org.junit.jupiter.api.Test;
import org.openmuc.jeebus.spine.api.CommunicationPartnerFeatureRequirement;
import org.openmuc.jeebus.spine.api.PresenceIndication;
import org.openmuc.jeebus.spine.api.UseCasePartner;
import org.openmuc.jeebus.spine.spi.UseCaseListener;
import org.openmuc.jeebus.spine.xsd.v1.*;

import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.openmuc.jeebus.spine.api.PresenceIndication.*;
import static org.openmuc.jeebus.spine.xsd.v1.FeatureTypeEnumType.*;
import static org.openmuc.jeebus.spine.xsd.v1.FunctionEnumType.*;

class UseCaseDiscoveryWrapperTest {
    public static final NodeManagementDetailedDiscoveryDataType
        DETAILED_DISCOVERY_DATA = new NodeManagementDetailedDiscoveryDataType()
        .withEntityInformation(new NodeManagementDetailedDiscoveryEntityInformationType().withDescription(
            new NodeManagementDetailedDiscoveryEntityInformationType.Description().withEntityAddress(
                new EntityAddressType().withEntity(1L))))
        .withFeatureInformation(new NodeManagementDetailedDiscoveryFeatureInformationType().withDescription(
            new NodeManagementDetailedDiscoveryFeatureInformationType.Description()
                .withFeatureAddress(new FeatureAddressType().withEntity(1L))
                .withFeatureType(LOAD_CONTROL.value())
                .withRole(RoleType.SERVER)
                .withSupportedFunction(
                    new FunctionPropertyType().withFunction(
                        LOAD_CONTROL_LIMIT_LIST_DATA.value()),
                    new FunctionPropertyType().withFunction(
                        LOAD_CONTROL_LIMIT_DESCRIPTION_LIST_DATA.value())
                )));
    private final static String NAME = "limitationOfPowerConsumption";
    private static final Map<Long, PresenceIndication> SCENARIOS = Map.of(
        1L, MANDATORY,
        4L, RECOMMENDED
    );
    private static final Set<CommunicationPartnerFeatureRequirement>
        FEATURE_FUNCTION_REQUIREMENTS = Set.of(
        new CommunicationPartnerFeatureRequirement(
            LOAD_CONTROL, Map.of(
            LOAD_CONTROL_LIMIT_DESCRIPTION_LIST_DATA,
            Map.of(1L, MANDATORY),
            LOAD_CONTROL_LIMIT_LIST_DATA,
            Map.of(1L, MANDATORY)
        )
        ),
        new CommunicationPartnerFeatureRequirement(
            ELECTRICAL_CONNECTION, Map.of(
            ELECTRICAL_CONNECTION_CHARACTERISTIC_LIST_DATA,
            Map.of(4L, MANDATORY)
        )
        )
    );
    public static final String CS_ACTOR = "ControllableSystem";

    @Test
    public void testNotificationCompleteDiscovery() {
        MyUseCaseListener listener = new MyUseCaseListener();
        UseCaseDiscoveryWrapper wrapper = new UseCaseDiscoveryWrapper(
            listener,
            NAME,
            CS_ACTOR,
            SCENARIOS,
            FEATURE_FUNCTION_REQUIREMENTS
        );

        NodeManagementUseCaseDataType.UseCaseInformation useCaseInfo
            = new NodeManagementUseCaseDataType.UseCaseInformation()
            .withAddress(new FeatureAddressType().withEntity(1L))
            .withActor(CS_ACTOR)
            .withUseCaseSupport(new UseCaseSupportType()
                .withUseCaseAvailable(true)
                .withScenarioSupport(1L, 2L, 3L, 4L)
                .withUseCaseName(NAME)
            );

        wrapper.handleDiscovery(
            "test_comm",
            new NodeManagementUseCaseDataType().withUseCaseInformation(useCaseInfo),
            DETAILED_DISCOVERY_DATA
        );

        assertThat(listener.wasNotified(), is(true));
        assertThat(
            listener.getUseCasePartners().get(0).getCommunicationAddress(),
            is("test_comm")
        );
        assertThat(
            listener.getUseCasePartners().get(0).getUseCaseInfo(),
            is(useCaseInfo)
        );
        assertThat(
            listener.getUseCasePartners().get(0).getFeatureInfos().entrySet(),
            hasSize(1)
        );
        assertThat(
            listener.getUseCasePartners().get(0).getFeatureInfos(),
            hasKey(LOAD_CONTROL)
        );
    }

    @Test
    public void testDivergentAddresses() {
        MyUseCaseListener listener = new MyUseCaseListener();
        UseCaseDiscoveryWrapper wrapper = new UseCaseDiscoveryWrapper(
            listener,
            NAME,
            CS_ACTOR,
            SCENARIOS,
            FEATURE_FUNCTION_REQUIREMENTS
        );

        NodeManagementUseCaseDataType.UseCaseInformation useCaseInfo
            = new NodeManagementUseCaseDataType.UseCaseInformation()
            .withAddress(
                new FeatureAddressType().withEntity(1L).withDevice("some_device")
            )
            .withActor(CS_ACTOR)
            .withUseCaseSupport(new UseCaseSupportType()
                .withUseCaseAvailable(true)
                .withScenarioSupport(1L, 2L, 3L, 4L)
                .withUseCaseName(NAME)
            );

        wrapper.handleDiscovery(
            "test_comm",
            new NodeManagementUseCaseDataType().withUseCaseInformation(useCaseInfo),
            DETAILED_DISCOVERY_DATA
        );

        assertThat(listener.wasNotified(), is(true));
        assertThat(
            listener.getUseCasePartners().get(0).getCommunicationAddress(),
            is("test_comm")
        );
        assertThat(
            listener
                .getUseCasePartners()
                .get(0)
                .getUseCaseInfo()
                .getAddress()
                .getEntity(), is(List.of(1L))
        );
        assertThat(
            listener.getUseCasePartners().get(0).getFeatureInfos().entrySet(),
            hasSize(1)
        );
        assertThat(
            listener.getUseCasePartners().get(0).getFeatureInfos(),
            hasKey(LOAD_CONTROL)
        );
    }

    @Test
    public void testWrongUseCase() {
        MyUseCaseListener listener = new MyUseCaseListener();
        UseCaseDiscoveryWrapper wrapper = new UseCaseDiscoveryWrapper(
            listener,
            NAME,
            CS_ACTOR,
            SCENARIOS,
            FEATURE_FUNCTION_REQUIREMENTS
        );

        NodeManagementUseCaseDataType.UseCaseInformation useCaseInfo
            = new NodeManagementUseCaseDataType.UseCaseInformation()
            .withAddress(new FeatureAddressType().withEntity(1L))
            .withActor(CS_ACTOR)
            .withUseCaseSupport(new UseCaseSupportType()
                .withUseCaseAvailable(true)
                .withScenarioSupport(1L, 2L, 3L, 4L)
                .withUseCaseName("limitationOfPowerProduction")
            );

        wrapper.handleDiscovery(
            "test_comm",
            new NodeManagementUseCaseDataType().withUseCaseInformation(useCaseInfo),
            DETAILED_DISCOVERY_DATA
        );

        assertThat(listener.wasNotified(), is(false));
    }

    @Test
    public void testRecommendedFunction() {
        MyUseCaseListener listener = new MyUseCaseListener();
        UseCaseDiscoveryWrapper wrapper = new UseCaseDiscoveryWrapper(
            listener,
            NAME,
            CS_ACTOR,
            SCENARIOS,
            FEATURE_FUNCTION_REQUIREMENTS
        );

        wrapper.handleDiscovery(
            "test_comm",
            null,
            ((NodeManagementDetailedDiscoveryDataType) DETAILED_DISCOVERY_DATA.clone())
                .withFeatureInformation(new NodeManagementDetailedDiscoveryFeatureInformationType().withDescription(
                    new NodeManagementDetailedDiscoveryFeatureInformationType.Description()
                        .withFeatureAddress(new FeatureAddressType().withEntity(1L))
                        .withFeatureType(ELECTRICAL_CONNECTION.value())
                        .withRole(RoleType.SERVER)
                        .withSupportedFunction(
                            new FunctionPropertyType().withFunction(
                                ELECTRICAL_CONNECTION_CHARACTERISTIC_LIST_DATA.value())
                        )))
        );

        assertThat(listener.wasNotified(), is(true));
        assertThat(
            listener.getUseCasePartners().get(0).getCommunicationAddress(),
            is("test_comm")
        );
        assertThat(
            listener.getUseCasePartners().get(0).getUseCaseInfo(),
            is(nullValue())
        );
        assertThat(
            listener.getUseCasePartners().get(0).getFeatureInfos().entrySet(),
            hasSize(2)
        );
        assertThat(
            listener.getUseCasePartners().get(0).getFeatureInfos(),
            hasKey(LOAD_CONTROL)
        );
        assertThat(
            listener.getUseCasePartners().get(0).getFeatureInfos(),
            hasKey(ELECTRICAL_CONNECTION)
        );
    }

    @Test
    public void testNotificationOnlyDetailedDiscovery() {
        MyUseCaseListener listener = new MyUseCaseListener();
        UseCaseDiscoveryWrapper wrapper = new UseCaseDiscoveryWrapper(
            listener,
            NAME,
            CS_ACTOR,
            SCENARIOS,
            FEATURE_FUNCTION_REQUIREMENTS
        );

        wrapper.handleDiscovery(
            "test_comm",
            null,
            DETAILED_DISCOVERY_DATA
        );

        assertThat(listener.wasNotified(), is(true));
        assertThat(
            listener.getUseCasePartners().get(0).getCommunicationAddress(),
            is("test_comm")
        );
        assertThat(
            listener.getUseCasePartners().get(0).getUseCaseInfo(),
            is(nullValue())
        );
    }

    private static class MyUseCaseListener implements UseCaseListener {
        private boolean notified = false;
        private List<UseCasePartner> useCasePartners;

        public boolean wasNotified() {
            return notified;
        }

        @Override
        public void onUpdate(List<UseCasePartner> useCasePartners) {
            this.useCasePartners = useCasePartners;
            notified = true;
        }

        public List<UseCasePartner> getUseCasePartners() {
            return useCasePartners;
        }
    }
}