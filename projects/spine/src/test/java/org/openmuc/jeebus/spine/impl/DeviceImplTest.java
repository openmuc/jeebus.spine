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
import org.openmuc.jeebus.spine.TestUtilities;
import org.openmuc.jeebus.spine.api.Device;
import org.openmuc.jeebus.spine.api.Entity;
import org.openmuc.jeebus.spine.api.SpineException;
import org.openmuc.jeebus.spine.xsd.v1.EntityTypeEnumType;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.openmuc.jeebus.spine.TestUtilities.entityIndex;

public class DeviceImplTest {
    @Test
    public void deleteEntityDoesntBreakAddresses() throws SpineException {
        Device parent = TestUtilities.getGenericDeviceBuilder(
                    TestUtilities.REMOTE_COMM,
                    "device1")
            .addEntity()
                .setType(EntityTypeEnumType.COMPRESSOR)
                .applyToDevice()
            .addEntity()
                .setType(EntityTypeEnumType.FAN)
                .applyToDevice()
            .addEntity()
                .setType(EntityTypeEnumType.PUMP)
                .applyToDevice()
            .build();
        Entity compressor = parent.getEntity(1);
        assertThat(compressor.getType(), is(EntityTypeEnumType.COMPRESSOR));
        Entity fan = parent.getEntity(2);
        assertThat(fan.getType(), is(EntityTypeEnumType.FAN));
        Entity pump = parent.getEntity(3);
        assertThat(pump.getType(), is(EntityTypeEnumType.PUMP));

        Entity[] children = {compressor, fan, pump};

        // check that each child entity indeed lives at the index corresponding to its address
        for (Entity child : children) {
            assertThat(parent.getEntity(entityIndex(child)), is(child));
        }

        parent.deleteEntity(1); // remove compressor

        children = new Entity[]{fan, pump};

        // check that the entities still 'know' their correct addresses
        for (Entity child : children) {
            assertThat(parent.getEntity(entityIndex(child)), is(child));
        }
    }
}
