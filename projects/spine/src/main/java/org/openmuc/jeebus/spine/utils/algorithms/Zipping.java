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

import org.openmuc.jeebus.spine.utils.datatypes.Pair;

import java.util.Objects;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

/**
 * Utility class for algorithms that zip streams/collections together, i.e. produce a
 * new stream/collection consisting of tuples of elements taken from the input
 * streams/collections in lockstep.
 */
public class Zipping {
    private Zipping() {
    }

    /**
     * Combine elements from two streams in lockstep to produce a new stream. This is
     * a terminal operation.
     * <p>
     * If {@code streamA} produces values {@code foo1, foo2, foo3} in order, and
     * {@code streamB} produces values {@code bar1, bar2, bar3} in order, then
     * {@code zipMap(func, streamA, streamB} will produce the following values:
     * <ul>
     *  <li>{@code func.apply(foo1, bar1)},
     *  <li>{@code func.apply(foo2, bar2)},
     *  <li>{@code func.apply(foo3, bar3)},
     * </ul>
     * in order.
     * <p>
     * The output stream terminates when streamA or streamB terminates, whichever ends first.
     * <p>
     * {@code zipMap(func, streamA, streamB)} is equivalent to {@code zip(streamA, streamB).map(pair -> pair.consume(func))}.
     *
     * @param streamA
     *     Any stream of objects
     * @param streamB
     *     Any other stream of objects
     * @param func
     *     The function with which elements will be combined
     * @param <A>
     *     type of elements in {@code streamA}
     * @param <B>
     *     type of elements in {@code streamB}
     * @param <C>
     *     type of results
     * @return A combined stream
     */
    public static <A, B, C> Stream<C> zipMap(
        Stream<A> streamA,
        Stream<B> streamB,
        BiFunction<A, B, C> func
    ) {
        Objects.requireNonNull(func);
        Spliterator<A> firstSpliter = streamA.spliterator();
        Spliterator<B> secondSpliter = streamB.spliterator();
        boolean sized = firstSpliter.hasCharacteristics(Spliterator.SIZED)
            || secondSpliter.hasCharacteristics(Spliterator.SIZED);
        int characteristics = firstSpliter.characteristics()
            & secondSpliter.characteristics()
            & ~(Spliterator.DISTINCT | Spliterator.SORTED)
            | (sized ? Spliterator.SIZED : 0);
        long size = Math.min(
            firstSpliter.estimateSize(),
            secondSpliter.estimateSize()
        );
        Spliterator<C> outSpliter = new Spliterators.AbstractSpliterator<>(
            size,
            characteristics
        ) {
            @Override
            public boolean tryAdvance(Consumer<? super C> action) {
                return firstSpliter.tryAdvance(a -> secondSpliter.tryAdvance(b -> action.accept(
                    func.apply(a, b))));
            }
        };
        return StreamSupport.stream(
            outSpliter,
            streamA.isParallel() || streamB.isParallel()
        );
    }

    /**
     * Combine elements from two streams in lockstep to produce a new stream. This is
     * a terminal operation.
     * <p>
     * If {@code streamA} produces values {@code foo1, foo2, foo3} in order, and
     * {@code streamB} produces values {@code bar1, bar2, bar3} in order, then
     * {@code zip(streamA, streamB} will produce the following values:
     * <ul>
     *  <li>{@code Pair.of(foo1, bar1)},
     *  <li>{@code Pair.of(foo2, bar2)},
     *  <li>{@code Pair.of(foo3, bar3)},
     * </ul>
     * in order.
     * <p>
     * The output stream terminates when streamA or streamB terminates, whichever ends first.
     * <p>
     * {@code zipMap(func, streamA, streamB)} is equivalent to {@code zip(streamA, streamB).map(pair -> pair.consume(func))}.
     *
     * @param streamA
     *     Any stream of objects
     * @param streamB
     *     Any other stream of objects
     * @param <A>
     *     type of elements in {@code streamA}
     * @param <B>
     *     type of elements in {@code streamB}
     * @return A combined stream
     */
    public static <A, B> Stream<Pair<A, B>> zip(
        Stream<A> streamA,
        Stream<B> streamB
    ) {
        return zipMap(streamA, streamB, Pair::new);
    }

    /**
     * A specialization of {@link #zipMap(Stream, Stream, BiFunction)} where the
     * second stream just counts up from 0. Useful for accessing indices when
     * iterating over a collection.
     *
     * @param source
     *     The source stream.
     * @param func
     *     The function to combine indices and elements
     * @param <A>
     *     type of elements in {@code source}
     * @param <C>
     *     type of results
     * @return A stream of function results
     */
    public static <A, C> Stream<C> zipWithCount(
        Stream<A> source,
        BiFunction<A, Integer, C> func
    ) {
        return zipMap(source, Stream.iterate(0, x -> x + 1), func);
    }

    /**
     * Find indices in the source stream where the given predicate holds.
     *
     * @param source
     *     The source stream.
     * @param predicate
     *     The predicate to check. Also has access to the index.
     * @param <A>
     *     type of stream elements
     * @return A stream of indices where the predicate held.
     */
    public static <A> Stream<Integer> indicesWhere(
        Stream<A> source,
        BiPredicate<Integer, ? super A> predicate
    ) {
        return zipWithCount(
            source,
            (a, idx) -> predicate.test(idx, a) ?
                Stream.of(idx) :
                Stream.<Integer>of()
        )
            .flatMap(s -> s);
    }
}
