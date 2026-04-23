/********************************************************************************
 * Copyright (c) 2026 Fraunhofer ISE
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 ********************************************************************************/

package org.openmuc.jeebus.spine.impl.parser;

import org.jvnet.jaxb.lang.JAXBToStringStrategy;
import org.jvnet.jaxb.locator.ObjectLocator;

import static org.jvnet.jaxb.locator.util.LocatorUtils.property;

public class CustomToStringStrategy extends JAXBToStringStrategy {

    @Override
    protected void appendClassName(StringBuilder buffer, Object object) {
        buffer.append(getShortClassName(object.getClass()));
    }

    public static final CustomToStringStrategy INSTANCE
        = new CustomToStringStrategy();

    public static CustomToStringStrategy getInstance() {
        return INSTANCE;
    }

    @Override
    public boolean isUseDefaultFieldValueMarkers() {
        return false;
    }

    public boolean isUseIdentityHashCode() {
        return false;
    }

    @Override
    public StringBuilder appendField(
        ObjectLocator parentLocator,
        Object parent,
        String fieldName,
        StringBuilder stringBuilder,
        Object value,
        boolean valueSet
    ) {
        if (valueSet) {
            appendFieldStart(
                parentLocator,
                parent,
                fieldName,
                stringBuilder,
                valueSet
            );
            append(property(parentLocator, fieldName, value), stringBuilder, value);
            appendFieldEnd(
                parentLocator,
                parent,
                fieldName,
                stringBuilder,
                valueSet
            );
        }
        return stringBuilder;
    }
}
