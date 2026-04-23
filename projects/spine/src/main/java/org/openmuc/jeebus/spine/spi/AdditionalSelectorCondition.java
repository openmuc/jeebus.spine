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

import org.openmuc.jeebus.spine.xsd.v1.IncentiveListDataSelectorsType;

/**
 * This functional interface is to be used by
 * {@link AdditionalSelectorConditions#register} if an additional condition is needed
 * to check if data matches a selector. Almost all selector attributes are used to
 * check if the respective data value is equal to the selector value. There are some
 * selector attributes that use different semantics like for example
 * {@link IncentiveListDataSelectorsType#getTimestampInterval()} which holds a time
 * interval that cannot simply be checked by equality. In such a case implement this
 * interface to return true if the given data D matches the given selector S
 * explicitly for this condition. All other attributes will still be checked by the
 * filter method.
 *
 * @param <DATA>
 *     type of data that this condition checks
 * @param <SELECTOR>
 *     type of selector that this condition is for
 */
public interface AdditionalSelectorCondition<DATA, SELECTOR> {
    boolean isSelected(DATA data, SELECTOR selector);
}
