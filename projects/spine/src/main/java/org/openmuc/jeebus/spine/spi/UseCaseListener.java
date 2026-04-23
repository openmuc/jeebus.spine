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

import org.openmuc.jeebus.spine.api.UseCasePartner;

import java.util.List;

/**
 * This is THE new interface for registering listeners at the NodeManagement of SPINE
 * devices. It is called when the NodeManagement identifies a valid use case
 * partner.
 */
public interface UseCaseListener {
    /**
     * This method is called when the NodeManagement identifies one or more valid use
     * case partners.
     *
     * @param useCasePartners
     *     a list containing all found {@link UseCasePartner}s
     */
    void onUpdate(List<UseCasePartner> useCasePartners);
}
