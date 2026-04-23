/********************************************************************************
 * Copyright (c) 2026 Fraunhofer ISE
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 ********************************************************************************/

package org.openmuc.jeebus.spine.utils.features.deviceclassification;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openmuc.jeebus.spine.api.DataValidationException;
import org.openmuc.jeebus.spine.api.Error;
import org.openmuc.jeebus.spine.api.Feature;
import org.openmuc.jeebus.spine.api.FeatureWrapper;
import org.openmuc.jeebus.spine.api.SpineException;
import org.openmuc.jeebus.spine.xsd.v1.*;

import static org.junit.jupiter.api.Assertions.*;

public class DeviceClassificationManufacturerDataFunctionTest {
    @Test
    void testRead() throws SpineException {
        DeviceClassificationFeature deviceClassificationFeature = FeatureWrapper.newFeature(
            DeviceClassificationFeature.class);

        DeviceClassificationManufacturerDataFunction deviceClassificationManufacturerDataFunction
            = deviceClassificationFeature.addDeviceClassificationManufacturerDataFunction();

        DeviceClassificationManufacturerDataType data = new DeviceClassificationManufacturerDataType();
        data.setBrandName("RandomBrand");
        data.setDeviceCode("0804199018122017");
        data.setDeviceName("RandomDevice");

        deviceClassificationManufacturerDataFunction.updateData(data);

        FilterType filter = new FilterType();
        filter.setCmdControl(new CmdControlType());
        filter.getCmdControl().setPartial(new ElementTagType());

        DeviceClassificationManufacturerDataElementsType element = new DeviceClassificationManufacturerDataElementsType();
        element.setBrandName(new ElementTagType());
        element.setDeviceCode(new ElementTagType());
        filter.setDeviceClassificationManufacturerDataElements(element);

        CmdType reply = deviceClassificationManufacturerDataFunction.read(filter, new FeatureAddressType());

        DeviceClassificationManufacturerDataType replyData = reply.getDeviceClassificationManufacturerData();


        assertEquals("RandomBrand", replyData.getBrandName());
        assertEquals("0804199018122017", replyData.getDeviceCode());
        assertNull(replyData.getDeviceName());

        reply = deviceClassificationManufacturerDataFunction.read(new FilterType(), new FeatureAddressType());
        replyData = reply.getDeviceClassificationManufacturerData();

        assertEquals("RandomBrand", replyData.getBrandName());
        assertEquals("0804199018122017", replyData.getDeviceCode());
        assertEquals("RandomDevice", replyData.getDeviceName());

        deviceClassificationManufacturerDataFunction.setUseCaseReadSingleDataValidation((elementType, readSingleCmdOption) ->
        {
          throw  new SpineException(Error.COMMAND_REJECTED, "");
        });

        assertThrows(SpineException.class, () -> {
            deviceClassificationManufacturerDataFunction.read(new FilterType(), new FeatureAddressType());
        });
    }
}
