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

import org.openmuc.jeebus.spine.api.RequestResult;
import org.openmuc.jeebus.spine.xsd.v1.CmdType;
import org.openmuc.jeebus.spine.xsd.v1.DatagramType;
import org.openmuc.jeebus.spine.xsd.v1.FeatureAddressType;
import org.openmuc.jeebus.spine.xsd.v1.ResultDataType;

class RequestResultImpl implements RequestResult {
    private final DatagramType datagram;

    RequestResultImpl(DatagramType d) {
        datagram = d;
    }

    @Override
    public DatagramType getDatagram() {
        return datagram;
    }

    @Override
    public CmdType getCmd() {
        if (datagram != null) {
            return datagram.getPayload().getCmd().get(0);
        }
        return null;
    }

    @Override
    public FeatureAddressType getSenderAddress() {
        if (datagram != null) {
            return datagram.getHeader().getAddressSource();
        }
        return null;
    }

    @Override
    public ResultDataType getResultData() {
        if (datagram != null) {
            return datagram.getPayload().getCmd().get(0).getResultData();
        }
        return null;
    }
}
