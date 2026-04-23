/********************************************************************************
 * Copyright (c) 2026 Fraunhofer ISE
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 ********************************************************************************/

package org.openmuc.jeebus.spine.utils.algorithms;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiPredicate;

/**
 * Utility class for algorithms that group collection elements together.
 */
public class Grouping {
    /**
     * Utility class - no instances for you!
     */
    private Grouping() {
    }

    /**
     * Group list elements according to the given equality predicate, storing the
     * groups as lists of indices into the original list.
     *
     * @param elements
     *     The list to work on.
     * @param equals
     *     The equality predicate to use. For best results, this should be an
     *     equivalence relation.
     * @param <T>
     *     type of list elements
     * @return the list of groups
     */
    public static <T> List<List<Integer>> groupIndices(
        List<T> elements,
        BiPredicate<? super T, ? super T> equals
    ) {
        List<List<Integer>> groups = new ArrayList<>();
        for (int i = 0; i < elements.size(); i++) {
            boolean exists = false;
            for (List<Integer> group : groups) {
                if (equals.test(elements.get(i), elements.get(group.get(0)))) {
                    group.add(i);
                    exists = true;
                    break;
                }
            }
            if (!exists) {
                List<Integer> newGroup = new ArrayList<>();
                groups.add(newGroup);
                newGroup.add(i);
            }
        }

        return groups;
    }

    /**
     * Construct a map from a grouped list of keys and a list of values. The key for
     * each map entry is the first element of a group, and the value is a list of all
     * values at the indices of the group.
     *
     * @param groupIndices
     *     Indices of group in {@code keys}
     * @param keys
     *     List of keys
     * @param vals
     *     List of values
     * @param <K>
     *     type of keys
     * @param <V>
     *     type of values
     * @return Multimap from keys to values
     */
    public static <K, V> Map<K, List<V>> groupZipMapFromIndices(
        List<List<Integer>> groupIndices,
        List<K> keys,
        List<V> vals
    ) {
        // ordered map so unit tests can be consistent
        LinkedHashMap<K, List<V>> result = new LinkedHashMap<>();
        for (List<Integer> group : groupIndices) {
            K entryKey = keys.get(group.get(0));
            List<V> entryVals = new ArrayList<>(group.size());
            for (int idx : group) {
                entryVals.add(vals.get(idx));
            }
            result.put(entryKey, entryVals);
        }
        return result;
    }

    /**
     * Construct a multimap from a list of keys and a list of values. The lists
     * should be of equal length. Each key is mapped to the value at the same index,
     * and keys are collated according to the given predicate.
     *
     * @param keys
     *     List of keys
     * @param vals
     *     List of values
     * @param equals
     *     The equality predicate to use. For best results, this should be an
     *     equivalence relation.
     * @param <K>
     *     type of keys
     * @param <V>
     *     type of values
     * @return Multimap from keys to values
     */
    public static <K, V> Map<K, List<V>> groupZipMap(
        List<K> keys,
        List<V> vals,
        BiPredicate<? super K, ? super K> equals
    ) {
        return groupZipMapFromIndices(groupIndices(keys, equals), keys, vals);
    }
}
