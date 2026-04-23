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

import org.openmuc.jeebus.spine.utils.SpineUtilities;
import org.openmuc.jeebus.spine.utils.datatypes.Pair;
import org.openmuc.jeebus.spine.xsd.v1.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * Registry class for {@link AdditionalSelectorCondition}. Any new selector types
 * with a condition other than {@link java.util.Objects#equals} should be added to
 * this class' static initializer.
 * <p>
 * This supersedes the previous mechanism where {@link AdditionalSelectorCondition}s
 * needed to be explicitly added by each use case. Reverting to the previous
 * mechanism may prove necessary if a selector type is found which requires different
 * conditions for different use cases. To help detect such a case should it occur,
 * {@link #register(Class, Class, AdditionalSelectorCondition)} will throw an error
 * if multiple conditions are registered for the same type.
 * <p>
 * Currently registered selector and data types are:
 * <ul>
 *     <li>{@link TimestampIntervalType} selected by {@link TimestampIntervalType}</li>
 *     <li>{@link PowerSequencePriceDataType} selected by {@link PowerSequencePriceListDataSelectorsType}</li>
 *     <li>{@link IncentiveDataType} selected by {@link IncentiveListDataSelectorsType}</li>
 * </ul>
 */
public class AdditionalSelectorConditions {
    private static final Logger LOGGER = LoggerFactory.getLogger(
        AdditionalSelectorConditions.class);

    /**
     * Utility class - no instances for you!
     */
    private AdditionalSelectorConditions() {
    }

    /**
     * Invariant: {@code Pair.of(Class<D>, Class<S>)} is mapped to an
     * {@code AdditionalSelectorCondition<D,S>}. This makes the map dependently
     * typed, which cannot be expressed in the Java type system. Accessors should
     * make sure to maintain this condition on pain of {@link ClassCastException}.
     */
    private static final Map<Pair<Class<?>, Class<?>>, AdditionalSelectorCondition<?, ?>>
        registry = new HashMap<>();

    static {
        register(
            String.class,
            TimestampIntervalType.class,
            SpineUtilities::timestampIsInInterval
        );
        register(
            PowerSequencePriceDataType.class,
            PowerSequencePriceListDataSelectorsType.class,
            (d, s) ->
                SpineUtilities.timestampIsInInterval(
                    d.getPotentialStartTime(),
                    s.getPotentialStartTimeInterval()
                )
        );
        register(
            IncentiveDataType.class, IncentiveListDataSelectorsType.class, (d, s) ->
                SpineUtilities.timestampIsInInterval(
                    d.getTimestamp(),
                    s.getTimestampInterval()
                )
        );
        // If you register another selector type, remember to add it to the class javadoc!
    }

    /**
     * Register an {@link AdditionalSelectorCondition} for the selector type
     * {@link SELECTOR} and the data type {@link DATA}. Throws an error if there was
     * already a different condition registered for those types.
     *
     * @param dataClass
     *     class object for {@link DATA}
     * @param selectorClass
     *     class object for {@link SELECTOR}
     * @param condition
     *     The condition to register.
     * @param <DATA>
     *     type of data that the condition checks
     * @param <SELECTOR>
     *     type of selector that the condition is for
     */
    public static <DATA, SELECTOR> void register(
        Class<DATA> dataClass,
        Class<SELECTOR> selectorClass,
        AdditionalSelectorCondition<DATA, SELECTOR> condition
    ) {
        Pair<Class<?>, Class<?>> key = Pair.of(dataClass, selectorClass);
        AdditionalSelectorCondition<?, ?> old = registry.get(key);
        if (old != null) {
            if (old == condition) {
                LOGGER.warn(
                    "Duplicate AdditionalSelectorCondition registration for ({}, {}) -> {}",
                    dataClass,
                    selectorClass,
                    condition
                );
            }
            else {
                throw new IllegalStateException(String.format(
                    "Can't register more than one AdditionalSelectorCondition for data type %s and selector type %s",
                    dataClass.getSimpleName(),
                    selectorClass.getSimpleName()
                ));
            }
        }
        else {
            registry.put(key, condition);
        }
    }

    /**
     * Retrieve an {@link AdditionalSelectorCondition} from the registry and check it
     * against the provided selector and data.
     *
     * @param dataClass
     *     class object for {@link DATA}
     * @param selectorClass
     *     class object for {@link SELECTOR}
     * @param data
     *     data to select
     * @param selector
     *     selector to select with
     * @param <DATA>
     *     type of data to select
     * @param <SELECTOR>
     *     type of selector to select with
     * @return whether the found condition matches, or true if no condition was
     * found.
     */
    @SuppressWarnings("unchecked")
    public static <DATA, SELECTOR> boolean isSelected(
        Class<DATA> dataClass,
        Class<SELECTOR> selectorClass,
        DATA data,
        SELECTOR selector
    ) {
        AdditionalSelectorCondition<DATA, SELECTOR> condition
            = (AdditionalSelectorCondition<DATA, SELECTOR>) registry.get(Pair.of(
            dataClass,
            selectorClass
        ));
        return condition == null || condition.isSelected(data, selector);
    }
}
