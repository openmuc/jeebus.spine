/********************************************************************************
 * Copyright (c) 2026 Fraunhofer ISE
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 ********************************************************************************/

package org.openmuc.jeebus.spine.xsd.v1;

import org.junit.jupiter.api.Test;
import org.openmuc.jeebus.spine.utils.SpineUtilities;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class FeatureAddressTypeTest {
    @Test
    public void testEquality() {
        FeatureAddressType address = new FeatureAddressType()
            .withDevice("toaster")
            .withEntity(List.of(1L))
            .withFeature(1L);

        assertThat(
            address,
            is(equalTo((EntityAddressType) address))
        );
        assertThat(
            address,
            is(not(equalTo(SpineUtilities.extractEntityAddress(address))))
        );
        assertThat(
            address,
            is(equalTo(new FeatureAddressType()
                .withDevice("toaster")
                .withEntity(List.of(1L))
                .withFeature(1L)))
        );
        assertThat(
            address,
            is(not(equalTo(new EntityAddressType()
                .withDevice("toaster")
                .withEntity(List.of(1L)))))
        );
    }
}