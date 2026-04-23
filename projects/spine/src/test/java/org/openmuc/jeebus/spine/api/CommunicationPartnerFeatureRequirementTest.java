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

import org.junit.jupiter.api.Test;
import org.openmuc.jeebus.spine.xsd.v1.FunctionEnumType;

import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.openmuc.jeebus.spine.api.PresenceIndication.*;
import static org.openmuc.jeebus.spine.xsd.v1.FeatureTypeEnumType.*;
import static org.openmuc.jeebus.spine.xsd.v1.FunctionEnumType.*;

class CommunicationPartnerFeatureRequirementTest {

    // This is from MPC tables 1 and 20.
    @Test
    void testGetAbsoluteRequirementsMpc() {
        CommunicationPartnerFeatureRequirement dut = new CommunicationPartnerFeatureRequirement(
            MEASUREMENT,
            Map.of(
                MEASUREMENT_DESCRIPTION_LIST_DATA, Map.of(
                    1L, MANDATORY,
                    2L, MANDATORY,
                    3L, MANDATORY,
                    4L, MANDATORY,
                    5L, MANDATORY
                ),
                MEASUREMENT_CONSTRAINTS_LIST_DATA, Map.of(
                    1L, RECOMMENDED,
                    2L, RECOMMENDED,
                    3L, RECOMMENDED,
                    4L, RECOMMENDED,
                    5L, MANDATORY
                ),
                MEASUREMENT_LIST_DATA, Map.of(
                    1L, MANDATORY,
                    2L, MANDATORY,
                    3L, MANDATORY,
                    4L, MANDATORY,
                    5L, MANDATORY
                )
            )
        );
        Map<FunctionEnumType, PresenceIndication> result
            = dut.getAbsoluteRequirements(Map.of(
            1L, MANDATORY,
            2L, OPTIONAL,
            3L, RECOMMENDED,
            4L, OPTIONAL,
            5L, OPTIONAL
        ));
        assertThat(
            result, is(equalTo(Map.of(
                MEASUREMENT_DESCRIPTION_LIST_DATA, MANDATORY,
                MEASUREMENT_CONSTRAINTS_LIST_DATA, RECOMMENDED,
                MEASUREMENT_LIST_DATA, MANDATORY
            )))
        );
    }

    // This is from LPC tables 2 and 21.
    @Test
    void testGetAbsoluteRequirementsLpc() {
        CommunicationPartnerFeatureRequirement dut = new CommunicationPartnerFeatureRequirement(
            ELECTRICAL_CONNECTION, Map.of(
            ELECTRICAL_CONNECTION_CHARACTERISTIC_LIST_DATA,
            Map.of(4L, MANDATORY)
        )
        );
        Map<FunctionEnumType, PresenceIndication> result
            = dut.getAbsoluteRequirements(
            Map.of(4L, RECOMMENDED)
        );
        assertThat(
            result, is(equalTo(
                Map.of(ELECTRICAL_CONNECTION_CHARACTERISTIC_LIST_DATA, RECOMMENDED)
            ))
        );
    }
}