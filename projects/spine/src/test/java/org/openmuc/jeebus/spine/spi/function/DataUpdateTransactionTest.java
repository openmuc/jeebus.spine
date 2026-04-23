/********************************************************************************
 * Copyright (c) 2026 Fraunhofer ISE
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 ********************************************************************************/

package org.openmuc.jeebus.spine.spi.function;

import org.junit.jupiter.api.Test;
import org.openmuc.jeebus.spine.api.DataValidationException;
import org.openmuc.jeebus.spine.api.FeatureWrapper;
import org.openmuc.jeebus.spine.utils.features.measurement.MeasurementDescriptionListDataFunction;
import org.openmuc.jeebus.spine.utils.features.measurement.MeasurementFeature;
import org.openmuc.jeebus.spine.utils.features.measurement.MeasurementListDataFunction;
import org.openmuc.jeebus.spine.xsd.v1.MeasurementDataType;
import org.openmuc.jeebus.spine.xsd.v1.MeasurementDescriptionDataType;
import org.openmuc.jeebus.spine.xsd.v1.MeasurementTypeEnumType;
import org.openmuc.jeebus.spine.xsd.v1.ScaledNumberType;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

import static org.junit.jupiter.api.Assertions.*;

class DataUpdateTransactionTest {

    private static final AtomicBoolean ready = new AtomicBoolean(true);
    private static MeasurementListDataFunction dataFunction;
    private static MeasurementDescriptionListDataFunction descFunction;

    static class TestDataUpdateTransaction extends DataUpdateTransaction {

        @Override
        protected void run() throws DataValidationException {
            while (!ready.get()) {
                try {
                    Thread.sleep(100);
                }
                catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            super.run();
        }
    }

    @Test
    void testAddDataViaDataAdditionTransaction() throws DataValidationException {

        MeasurementFeature measurementFeature = FeatureWrapper.newFeature(MeasurementFeature.class);
        dataFunction = measurementFeature.addMeasurementListDataFunction();
        descFunction
            = measurementFeature.addMeasurementDescriptionListDataFunction();
        // new EntityBuilder().addFeature(measurementFeature);

        MeasurementDataType data1 = new MeasurementDataType();
        data1.setMeasurementId(1L);
        data1.setValue(new ScaledNumberType());
        data1.getValue().setNumber(1L);

        MeasurementDescriptionDataType desc1 = new MeasurementDescriptionDataType();
        desc1.setMeasurementId(1L);
        desc1.setMeasurementType(MeasurementTypeEnumType.ACCELERATION.value());

        DataValidationException exception = assertThrows(
            DataValidationException.class, () -> {
                dataFunction.addData(data1);
                descFunction.addData(desc1);
            }
        );
        assertTrue(exception
            .getMessage()
            .contains("value is set but measurementDescription is not set"));

        AtomicReference<Integer> data1Idx = new AtomicReference<>();
        AtomicReference<Integer> desc1Idx = new AtomicReference<>();

        // The solution is to add both with the DataAdditionTransaction class
        TestDataUpdateTransaction testDataAdditionTransaction
            = new TestDataUpdateTransaction();
        testDataAdditionTransaction.addSingleData(
            dataFunction,
            data1,
            data1Idx::set
        );
        testDataAdditionTransaction.addSingleData(
            descFunction,
            desc1,
            desc1Idx::set
        );
        testDataAdditionTransaction.runUpdate();

        MeasurementDataType dataCopy = dataFunction.getDataCopy(data1Idx.get());
        MeasurementDescriptionDataType descCopy
            = descFunction.getDataCopy(desc1Idx.get());

        assertEquals(1L, dataCopy.getMeasurementId());
        assertEquals(1L, dataCopy.getValue().getNumber());
        assertEquals(1L, descCopy.getMeasurementId());
        assertEquals(
            MeasurementTypeEnumType.ACCELERATION.value(),
            descCopy.getMeasurementType()
        );
    }

    @Test
    void testThreadSave() throws InterruptedException {

        // run testAddDataViaDataAdditionTransaction test but running the updates waits for ready to be set to true
        ready.set(false);
        Thread t1 = new Thread(() -> {
            try {
                testAddDataViaDataAdditionTransaction();
            }
            catch (DataValidationException e) {
                throw new RuntimeException(e);
            }
        });
        t1.start();

        Thread.sleep(500L);

        // addDataViaDataAdditionTransaction is still running and did not yet update the data but should lock the data
        // list so the following thread should have to wait until finished and afterward retrieve updated values
        Thread t2 = new Thread(() -> {
            MeasurementDataType dataCopy = dataFunction.getDataCopy(0);
            MeasurementDescriptionDataType descCopy = descFunction.getDataCopy(0);
            assertEquals(1L, dataCopy.getMeasurementId());
            assertEquals(1L, dataCopy.getValue().getNumber());
            assertEquals(1L, descCopy.getMeasurementId());
            assertEquals(
                MeasurementTypeEnumType.ACCELERATION.value(),
                descCopy.getMeasurementType()
            );
        });
        t2.start();

        // continue addDataViaDataAdditionTransaction test (t1) which should also make t2 continue
        ready.set(true);
    }
}