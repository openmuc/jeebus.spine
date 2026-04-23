/********************************************************************************
 * Copyright (c) 2026 Fraunhofer ISE
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 ********************************************************************************/

package org.openmuc.jeebus.spine.api.validation;

import org.openmuc.jeebus.spine.api.SpineException;
import org.openmuc.jeebus.spine.api.options.ReadListCmdOption;

import java.util.List;

public interface ReadListValidation<SELECTOR, ELEMENTS> {
    void validateReadCmd(
        List<SELECTOR> selectorList,
        ELEMENTS elements,
        ReadListCmdOption readListCmdOption
    )
        throws SpineException;
}
