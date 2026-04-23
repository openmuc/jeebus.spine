/********************************************************************************
 * Copyright (c) 2026 Fraunhofer ISE
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 ********************************************************************************/

package org.openmuc.jeebus.spine.utils.datatypes;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * Simple generic datatype that holds a pair of values. This already exists in many
 * utility libraries, but none of them are dependencies of this project, so it was
 * simpler to implement it manually.
 *
 * @param <L>
 *     the type of values in the left slot
 * @param <R>
 *     the type of values in the right slot
 */
public final class Pair<L, R> implements Serializable {
    /**
     * The left value.
     */
    public final L leftVal;
    /**
     * The right value.
     */
    public final R rightVal;

    /**
     * Construct a pair from a right value and a left value.
     *
     * @param leftVal
     *     The left value.
     * @param rightVal
     *     The right value.
     */
    public Pair(L leftVal, R rightVal) {
        this.leftVal = leftVal;
        this.rightVal = rightVal;
    }

    /**
     * Getter for {@link #leftVal}
     *
     * @return {@link #leftVal}
     */
    public L getLeft() {
        return leftVal;
    }

    /**
     * Getter for {@link #rightVal}
     *
     * @return {@link #rightVal}
     */
    public R getRight() {
        return rightVal;
    }

    /**
     * Visitor method: apply a {@link BiFunction} to the values held in this pair.
     *
     * @param func
     *     The function to apply
     * @param <T>
     *     result type
     * @return {@code func.apply(leftVal, rightVal}
     */
    public <T> T visit(BiFunction<? super L, ? super R, T> func) {
        return func.apply(leftVal, rightVal);
    }

    /**
     * Eliminator method: apply a consumer to one value and return the other.
     *
     * @param action
     *     Action to perform with the right value.
     * @return The left value.
     */
    public L consumeRight(Consumer<R> action) {
        action.accept(rightVal);
        return leftVal;
    }

    /**
     * Static factory method.
     *
     * @param leftVal
     *     The left value
     * @param rightVal
     *     The right value
     * @param <L>
     *     type of left value
     * @param <R>
     *     type of right value
     * @return A {@link Pair} object with the given values
     */
    public static <L, R> Pair<L, R> of(L leftVal, R rightVal) {
        return new Pair<>(leftVal, rightVal);
    }

    /**
     * Eliminator method: apply the given function to the left value, and throw the
     * returned exception if nonnull. Otherwise, return the right value.
     *
     * @param thrower
     *     A function to (maybe) create an exception.
     * @param <E>
     *     type of exception that might be thrown
     * @return {@link #rightVal}, if no exception was thrown.
     * @throws E
     *     {@code thrower.apply(leftVal)}, if nonnull.
     */
    public <E extends Throwable> R leftToError(Function<L, E> thrower) throws E {
        E exception = thrower.apply(leftVal);
        if (exception != null) {
            throw exception;
        }
        return rightVal;
    }

    /**
     * Standard {@code equals()} method for POD objects.
     *
     * @param o
     *     the object to compare to
     * @return whether this object and the other object represent the same value.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Pair<?, ?> pair = (Pair<?, ?>) o;
        return Objects.equals(leftVal, pair.leftVal) && Objects.equals(
            rightVal,
            pair.rightVal
        );
    }

    /**
     * Standard {@code hashCode()} method for POD objects. Combines the hash codes of
     * {@link #leftVal} and {@link #rightVal}.
     *
     * @return The hash code of this object.
     */
    @Override
    public int hashCode() {
        return Objects.hash(leftVal, rightVal);
    }

    public Map.Entry<L, R> asEntry() {
        return new AbstractMap.SimpleImmutableEntry<>(leftVal, rightVal);
    }
}
