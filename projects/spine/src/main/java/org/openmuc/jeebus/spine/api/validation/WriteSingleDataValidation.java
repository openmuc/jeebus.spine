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
import org.openmuc.jeebus.spine.api.options.WriteSingleCmdOption;

public interface WriteSingleDataValidation<DATA, ELEMENTS> {
    void validateWriteCmdFull(
        DATA update,
        ELEMENTS elements,
        WriteSingleCmdOption writeListCmdOption
    )
        throws SpineException;
}
