/********************************************************************************
 * Copyright (c) 2026 Fraunhofer ISE
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 ********************************************************************************/

package org.openmuc.jeebus.spine.utils.features.loadcontrol;

import org.openmuc.jeebus.spine.api.DataValidationException;
import org.openmuc.jeebus.spine.api.SpineAcknowledgment;
import org.openmuc.jeebus.spine.api.SpineException;
import org.openmuc.jeebus.spine.api.options.ReadSingleCmdOption;
import org.openmuc.jeebus.spine.spi.function.DataFeatureFunctionTypeInfo;
import org.openmuc.jeebus.spine.spi.function.ReadSingleFeatureFunction;
import org.openmuc.jeebus.spine.spi.function.StandardFunctionType;
import org.openmuc.jeebus.spine.xsd.v1.*;

@StandardFunctionType(
        type = FunctionEnumType.LOAD_CONTROL_NODE_DATA,
        featureType = FeatureTypeEnumType.LOAD_CONTROL)
public class NodeDataFunction extends ReadSingleFeatureFunction<
    LoadControlNodeDataType,
    LoadControlNodeDataElementsType,
    DataFeatureFunctionTypeInfo<
        LoadControlNodeDataType,
        LoadControlNodeDataElementsType
        >> {

    public NodeDataFunction() {
        super(
            FunctionEnumType.LOAD_CONTROL_NODE_DATA.value(),
            new DataFeatureFunctionTypeInfo<>(
                LoadControlNodeDataType.class,
                LoadControlNodeDataElementsType.class
            )
        );
        setReadable(true, true);
    }

    @Override
    protected void validateData(LoadControlNodeDataType data) throws
        DataValidationException {
        if (data.getIsNodeRemoteControllable() == null) {
            logger.warn("isNodeRemoteControllable should be set");
        }
    }

    @Override
    public SpineAcknowledgment call(CmdType cmd, FeatureAddressType sourceAddress) {
        return null;
    }

    @Override
    protected void validateReadCmd(
        LoadControlNodeDataElementsType loadControlNodeDataElementsType,
        ReadSingleCmdOption readListCmdOption
    ) throws SpineException {
        // nothing to do
    }

}
