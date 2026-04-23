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
import org.openmuc.jeebus.spine.api.SpineAcknowledgment;
import org.openmuc.jeebus.spine.api.SpineException;
import org.openmuc.jeebus.spine.api.options.ReadSingleCmdOption;
import org.openmuc.jeebus.spine.api.options.WriteSingleCmdOption;
import org.openmuc.jeebus.spine.xsd.v1.*;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

public class ReadAndWriteSingleFeatureFunctionTest {

    private final ReadAndWriteSingleFeatureFunction<
        DeviceDiagnosisServiceDataType,
        DeviceDiagnosisServiceDataElementsType,
        DataFeatureFunctionTypeInfo<
            DeviceDiagnosisServiceDataType,
            DeviceDiagnosisServiceDataElementsType
            >> featureFunction = new ReadAndWriteSingleFeatureFunction<>(
        "someName",
        new DataFeatureFunctionTypeInfo<>(
            DeviceDiagnosisServiceDataType.class,
            DeviceDiagnosisServiceDataElementsType.class
        )
    ) {

        @Override
        protected void validateReadCmd(
            DeviceDiagnosisServiceDataElementsType elementsType,
            ReadSingleCmdOption readListCmdOption
        ) {

        }

        @Override
        void writeData(DeviceDiagnosisServiceDataType deviceDiagnosisServiceDataType) {

        }

        @Override
        void validateWriteCmd(
            DeviceDiagnosisServiceDataType update,
            DeviceDiagnosisServiceDataElementsType elementsType,
            WriteSingleCmdOption writeListCmdOption
        ) {

        }

        @Override
        public SpineAcknowledgment call(
            CmdType cmd,
            FeatureAddressType sourceAddress
        ) {
            return null;
        }

        @Override
        protected void validateData(DeviceDiagnosisServiceDataType deviceDiagnosisServiceDataType) {

        }
    };

    @Test
    void testWrite() throws SpineException {
        DeviceDiagnosisServiceDataType data = new DeviceDiagnosisServiceDataType();
        data.setBootCounter(BigInteger.ONE);
        data.setNextService("someService");
        data.setTimestamp("someTimeStamp");
        featureFunction.updateData(data);

        DeviceDiagnosisServiceDataType update = new DeviceDiagnosisServiceDataType();
        update.setBootCounter(BigInteger.TWO);
        update.setInstallationTime("someTime");

        CmdType writeCmd = new CmdType();
        FilterType partialFilter = new FilterType();
        partialFilter.setCmdControl(new CmdControlType());
        partialFilter.getCmdControl().setPartial(new ElementTagType());

        FilterType deleteFilter = new FilterType();
        deleteFilter.setCmdControl(new CmdControlType());
        deleteFilter.getCmdControl().setDelete(new ElementTagType());
        DeviceDiagnosisServiceDataElementsType elements
            = new DeviceDiagnosisServiceDataElementsType();
        elements.setTimestamp(new ElementTagType());
        deleteFilter.setDeviceDiagnosisServiceDataElements(elements);

        writeCmd.getFilter().add(partialFilter);
        writeCmd.getFilter().add(deleteFilter);
        writeCmd.setFunction("someName");
        writeCmd.setDeviceDiagnosisServiceData(update);

        featureFunction.write(writeCmd, new FeatureAddressType());

        assertEquals("someService", featureFunction.data.getNextService());
        assertEquals(BigInteger.TWO, featureFunction.data.getBootCounter());
        assertEquals("someTime", featureFunction.data.getInstallationTime());
        assertNull(featureFunction.data.getTimestamp());
    }
}
