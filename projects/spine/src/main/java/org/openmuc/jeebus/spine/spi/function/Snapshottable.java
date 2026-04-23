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

import org.openmuc.jeebus.spine.utils.features.deviceconfiguration.RunningKeyValue;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Supplier;

/**
 * An object implementing this interface 'knows' how to make a snapshot of its
 * internal state that can later be restored. This is used by the transaction mechanism.
 */
public interface Snapshottable {
    /**
     * Take a snapshot of the current state.
     * @return a restorable snapshot
     */
    Snapshot takeSnapshot();

    /**
     * A snapshot of an object's full state, intended for use by the transaction
     * mechanism.
     */
    @FunctionalInterface
    interface Snapshot {
        /**
         * Restore the parent object to the snapshot state. This should be
         * an idempotent operation (i.e. calling {@code restore()} many times
         * in a row is the same as calling it just once).
         */
        void restore();

        /**
         * Chain multiple backups together.
         * @param then data to restore after this object
         * @return a combined backup that will restore the data of {@code this} and {@code then}.
         */
        default Snapshot andThen(Snapshot then) {
            return () -> {
                this.restore();
                then.restore();
            };
        }
    }

    /**
     * Snapshot the state of a map, resetting only actually changed entries when
     * restoring.
     * @param mapGetter accessor for the map
     * @return a snapshot of that map
     * @param <K> type of keys. Should be a suitable {@link HashMap} key.
     * @param <V> type of values
     */
    static <K, V> Snapshot resetMapEntries(Supplier<Map<K, V>> mapGetter) {
        HashMap<K, V> oldEntries = new HashMap<>(mapGetter.get());
        return () -> {
            Set<K> entriesToRemove = new HashSet<>();
            Map<K, V> theMap = mapGetter.get();
            for (Map.Entry<K, V> entry : theMap.entrySet()) {
                K key = entry.getKey();
                if (!oldEntries.containsKey(key)) {
                    entriesToRemove.add(key);
                }
                else {
                    V oldValue = oldEntries.get(key);
                    if (entry.getValue() != oldValue) {
                        entry.setValue(oldValue);
                    }
                }
            }
            for (K k : entriesToRemove) {
                theMap.remove(k);
            }
        };
    }
}
