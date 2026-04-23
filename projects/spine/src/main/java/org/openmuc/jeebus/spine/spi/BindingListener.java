/********************************************************************************
 * Copyright (c) 2026 Fraunhofer ISE
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 ********************************************************************************/

package org.openmuc.jeebus.spine.spi;

import org.openmuc.jeebus.spine.api.Feature;
import org.openmuc.jeebus.spine.xsd.v1.NodeManagementBindingRequestCallType;

/**
 * A listener interface meant to be registered at a {@link Feature}.
 */
public interface BindingListener {

    /**
     * @param request
     *     the successful
     */
    void onBind(NodeManagementBindingRequestCallType.BindingRequest request);
}
