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

import org.openmuc.jeebus.spine.api.Error;
import org.openmuc.jeebus.spine.api.SpineAcknowledgment;
import org.openmuc.jeebus.spine.api.SpineException;
import org.openmuc.jeebus.spine.spi.function.FeatureFunction;
import org.openmuc.jeebus.spine.xsd.v1.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class BindingRequestFunction extends FeatureFunction {
    private static final Logger LOGGER = LoggerFactory.getLogger(
        BindingRequestFunction.class);
    private final BindingDataFunction bindingDataFunction;

    BindingRequestFunction(BindingDataFunction bindingDataFunction) {
        super(FunctionEnumType.NODE_MANAGEMENT_BINDING_REQUEST_CALL.value());
        this.bindingDataFunction = bindingDataFunction;
        setCallable(true);
    }

    @Override
    public CmdType read(FilterType filter, FeatureAddressType sourceAddress) {
        throw new UnsupportedOperationException();
    }

    @Override
    public SpineAcknowledgment write(CmdType cmd, FeatureAddressType sourceAddress) {
        throw new UnsupportedOperationException();
    }

    @Override
    public SpineAcknowledgment call(CmdType cmd, FeatureAddressType sourceAddress) {
        NodeManagementBindingRequestCallType.BindingRequest bindingRequest = cmd
            .getNodeManagementBindingRequestCall()
            .getBindingRequest();
        FeatureImpl feature;
        try {
            feature = (FeatureImpl) this.feature
                .getDevice()
                .getFeature(bindingRequest.getServerAddress());
        }
        catch (SpineException e) {
            return e.getAcknowledgment();
        }
        if (feature.getType().value().equals(bindingRequest.getServerFeatureType())
            && feature.bind(bindingRequest)
        ) {
            bindingDataFunction.addBinding(bindingRequest);
            return new SpineAcknowledgment(Error.NO_ERROR);
        }
        else {
            LOGGER.debug(
                "Binding from device {} denied",
                bindingRequest.getClientAddress().getDevice()
            );
            return new SpineAcknowledgment(
                Error.COMMAND_REJECTED,
                "Binding request denied"
            );
        }
    }

    @Override
    public void close() {
        // do nothing
    }
}
