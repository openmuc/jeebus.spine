/********************************************************************************
 * Copyright (c) 2026 Fraunhofer ISE
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 ********************************************************************************/

package org.openmuc.jeebus.spine.spi.function;

/**
 * Immutable wrapper class to hold the run-time type information used by the generic
 * feature functions.
 * <p>
 * Also holds some methods that could almost be static but actually need the RTTI.
 *
 * @param <DATA>
 *     type of data that the feature function holds
 * @param <ELEMENTS>
 *     type of elements for the data
 */
public class DataFeatureFunctionTypeInfo<DATA, ELEMENTS> {
    private final Class<DATA> dataType;
    private final Class<ELEMENTS> elementsType;

    public DataFeatureFunctionTypeInfo(
        Class<DATA> dataType,
        Class<ELEMENTS> elementsType
    ) {
        this.dataType = dataType;
        this.elementsType = elementsType;
    }

    public Class<DATA> getDataType() {
        return dataType;
    }

    public Class<ELEMENTS> getElementsType() {
        return elementsType;
    }

}
