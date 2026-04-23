/********************************************************************************
 * Copyright (c) 2026 Fraunhofer ISE
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 ********************************************************************************/

package org.openmuc.jeebus.spine.api;

/**
 * In the SPINE protocol or the Use Case specifications, data is normally marked with
 * presence indicators marking whether the data is MANDATORY, RECOMMENDED or
 * OPTIONAL.
 * <p>
 * Refer to the "General presence indication definitions" chapters in the
 * specifications for further information.
 */
public enum PresenceIndication {
    /**
     * Abbreviation in Specifications: O <br> Requirement Keyword: MAY
     */
    OPTIONAL,
    /**
     * Abbreviation in Specifications: R <br> Requirement Keyword: SHOULD
     */
    RECOMMENDED,
    /**
     * Abbreviation in Specifications: M <br> Requirement Keyword: SHALL
     */
    MANDATORY;

    public static PresenceIndication min(
        PresenceIndication left,
        PresenceIndication right
    ) {
        return left.ordinal() < right.ordinal() ? left : right;
    }
}
