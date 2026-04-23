/********************************************************************************
 * Copyright (c) 2026 Fraunhofer ISE
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 ********************************************************************************/

package org.openmuc.jeebus.spine.utils.features.devicediagnosis;

import org.junit.jupiter.api.Test;
import org.openmuc.jeebus.spine.api.Error;
import org.openmuc.jeebus.spine.api.SpineException;
import org.openmuc.jeebus.spine.api.FeatureWrapper;
import org.openmuc.jeebus.spine.xsd.v1.*;

import javax.xml.datatype.DatatypeFactory;
import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class DeviceDiagnosisServiceDataFunctionTest {

    @Test
    void testReadData() throws SpineException {
        DeviceDiagnosisFeature deviceDiagnosisFeature = FeatureWrapper.newFeature(DeviceDiagnosisFeature.class);
        ServiceDataFunction serviceDataFunction
            = deviceDiagnosisFeature.addServiceDataFunction();
        DeviceDiagnosisServiceDataType data = new DeviceDiagnosisServiceDataType();
        data.setBootCounter(BigInteger.valueOf(1));
        String timestamp = DatatypeFactory
            .newDefaultInstance()
            .newXMLGregorianCalendarDate(2000, 1, 1, 1)
            .toString();
        data.setTimestamp(timestamp);
        serviceDataFunction.updateData(data);
        FilterType filter = new FilterType();
        filter.setCmdControl(new CmdControlType());
        filter.getCmdControl().setPartial(new ElementTagType());
        DeviceDiagnosisServiceDataElementsType elements1
            = new DeviceDiagnosisServiceDataElementsType();
        elements1.setBootCounter(new ElementTagType());
        filter.setDeviceDiagnosisServiceDataElements(elements1);
        CmdType reply = serviceDataFunction.read(filter, new FeatureAddressType());

        // partial read
        DeviceDiagnosisServiceDataType replyData
            = reply.getDeviceDiagnosisServiceData();
        assertEquals(BigInteger.valueOf(1), replyData.getBootCounter());
        assertNull(replyData.getTimestamp());

        // full read
        reply = serviceDataFunction.read(new FilterType(), new FeatureAddressType());
        replyData = reply.getDeviceDiagnosisServiceData();
        assertEquals(BigInteger.valueOf(1), replyData.getBootCounter());
        assertEquals(timestamp, replyData.getTimestamp());

        serviceDataFunction.setUseCaseReadSingleDataValidation((elementsType, readSingleCmdOption) -> {
            throw new SpineException(Error.COMMAND_REJECTED, "");
        });

        assertThrows(
            SpineException.class, () -> {
                serviceDataFunction.read(new FilterType(), new FeatureAddressType());
            }
        );
    }
}