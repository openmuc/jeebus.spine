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
import org.openmuc.jeebus.spine.api.Feature;
import org.openmuc.jeebus.spine.api.SpineException;
import org.openmuc.jeebus.spine.api.FeatureWrapper;
import org.openmuc.jeebus.spine.utils.features.devicediagnosis.DeviceDiagnosisFeature;
import org.openmuc.jeebus.spine.utils.features.loadcontrol.LoadControlFeature;
import org.openmuc.jeebus.spine.utils.features.measurement.MeasurementFeature;
import org.openmuc.jeebus.spine.xsd.v1.EntityTypeEnumType;
import org.openmuc.jeebus.spine.xsd.v1.FeatureAddressType;
import org.openmuc.jeebus.spine.xsd.v1.FeatureTypeEnumType;
import org.openmuc.jeebus.spine.xsd.v1.RoleType;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.openmuc.jeebus.spine.xsd.v1.CmdClassifierType.*;

class FeatureImplTest {

    @Test
    void testGetEmptyDatagramWithHeader() {

        FeatureBuilder featureBuilder = TestUtilities.getGenericDeviceBuilder(
                TestUtilities.REMOTE_COMM,
                "device1"
            )
            .addEntity()
            .setType(EntityTypeEnumType.GENERIC)
            .addFeature();

        featureBuilder
            .setRole(RoleType.SPECIAL)
            .setType(FeatureTypeEnumType.GENERIC)
            .apply()
            .applyToDevice()
            .build();

        FeatureImpl feature = (FeatureImpl) featureBuilder.build();

        Device device2 = TestUtilities.getGenericDeviceBuilder(
            TestUtilities.LOCAL_COMM,
            "device2"
        ).build();

        FeatureAddressType destination = device2.getNodeManagement().getAddress();

        assertThat(
            feature.getEmptyDatagramWithHeader(
                destination,
                CALL
            ).getHeader().getAckRequest(),
            is(true)
        );

        assertThat(
            feature.getEmptyDatagramWithHeader(
                destination,
                WRITE
            ).getHeader().getAckRequest(),
            is(true)
        );

        assertThat(
            feature.getEmptyDatagramWithHeader(
                destination,
                READ
            ).getHeader().getAckRequest(),
            is(nullValue())
        );

        assertThat(
            feature.getEmptyDatagramWithHeader(
                destination,
                REPLY
            ).getHeader().getAckRequest(),
            is(nullValue())
        );

        assertThat(
            feature.getEmptyDatagramWithHeader(
                destination,
                NOTIFY
            ).getHeader().getAckRequest(),
            is(nullValue())
        );

        assertThat(
            feature.getEmptyDatagramWithHeader(
                destination,
                RESULT
            ).getHeader().getAckRequest(),
            is(nullValue())
        );
    }

    @Test
    public void deleteEntityDoesntBreakAddresses() throws SpineException {
        Entity parent = Entity.getBuilder()
                .setType(EntityTypeEnumType.GENERIC)
                .addEntity()
                .setType(EntityTypeEnumType.COMPRESSOR)
                .applyToEntity()
                .addEntity()
                .setType(EntityTypeEnumType.FAN)
                .applyToEntity()
                .addEntity()
                .setType(EntityTypeEnumType.PUMP)
                .applyToEntity()
                .build();
        Entity compressor = parent.getEntity(0);
        assertThat(compressor.getType(), is(EntityTypeEnumType.COMPRESSOR));
        Entity fan = parent.getEntity(1);
        assertThat(fan.getType(), is(EntityTypeEnumType.FAN));
        Entity pump = parent.getEntity(2);
        assertThat(pump.getType(), is(EntityTypeEnumType.PUMP));

        Entity[] children = {compressor, fan, pump};

        // check that each child entity indeed lives at the index corresponding to its address
        for (Entity child : children) {
            assertThat(parent.getEntity(TestUtilities.entityIndex(child)), is(child));
        }

        parent.deleteEntity(0); // remove compressor

        children = new Entity[]{fan, pump};

        // check that the entities still 'know' their correct addresses
        for (Entity child : children) {
            assertThat(parent.getEntity(TestUtilities.entityIndex(child)), is(child));
        }
    }

    /** this is basically the same as {@link #deleteEntityDoesntBreakAddresses()}, just for features this time
     */
    @Test
    public void deleteFeatureDoesntBreakAddresses() throws SpineException {
        Feature measurement = FeatureWrapper.newFeature(MeasurementFeature.class).getFeature();
        Feature loadControl = FeatureWrapper.newFeature(LoadControlFeature.class).getFeature();
        Feature deviceDiagnosis = FeatureWrapper.newFeature(DeviceDiagnosisFeature.class).getFeature();
        Entity parent = Entity.getBuilder()
                .setType(EntityTypeEnumType.GENERIC)
                .addFeature(measurement)
                .addFeature(loadControl)
                .addFeature(deviceDiagnosis)
                .build();

        Feature[] features =  {measurement, loadControl, deviceDiagnosis};

        for (Feature feature : features) {
            assertThat(parent.getFeature(featureIndex(feature)), is(feature));
        }

        parent.deleteFeature(0);

        features = new Feature[]{loadControl, deviceDiagnosis};

        for (Feature feature : features) {
            assertThat(parent.getFeature(featureIndex(feature)), is(feature));
        }
    }

    private static int featureIndex(Feature feature) {
        return (int) (long) feature.getAddress().getFeature();
    }
}
