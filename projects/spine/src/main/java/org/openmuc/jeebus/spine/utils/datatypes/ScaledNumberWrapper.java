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

import org.openmuc.jeebus.spine.xsd.v1.ScaledNumberType;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

import static java.util.Objects.requireNonNullElse;

/**
 * This is a wrapper for {@link ScaledNumberType} providing additional convenience
 * functions.
 * <p>
 * The numeric value is always calculated like this: {@code number * 10 ^ scale}
 */
public class ScaledNumberWrapper extends ScaledNumberType implements Comparable<ScaledNumberType> {

    /**
     * Creates a new wrapper instance assuming a default scale of {@code 0}.
     */
    public ScaledNumberWrapper() {
        super(null, (short) 0);
    }

    /**
     * Creates a new wrapper instance from the given ScaledNumberType.
     * Will assume a default of {@code 0} if the scale is {@code null}.
     * @param from the ScaledNumberType to wrap
     */
    public ScaledNumberWrapper(ScaledNumberType from) {
        if (from != null) {
            number = from.getNumber();
            scale = requireNonNullElse(from.getScale(), (short) 0);
        }
    }

    /**
     * @param number the number part.
     * @param scale the scale part. Will assume a default of {@code 0} if null.
     */
    public ScaledNumberWrapper(Long number, Short scale) {
        super(number, requireNonNullElse(scale, (short) 0));
    }

    /**
     * The default full-value constructor.
     * @param number the number part of the newly initialized instance.
     * @param scale the scale part of the newly initialized instance.
     */
    public ScaledNumberWrapper(long number, short scale) {
        super(number, scale);
    }

    /**
     * calls {@link ScaledNumberWrapper#ScaledNumberWrapper(long, short)}
     * casting the given int values accordingly
     */
    public ScaledNumberWrapper(int number, int scale) {
        this((long) number, scale);
    }

    /**
     * calls {@link ScaledNumberWrapper#ScaledNumberWrapper(long, short)}
     * casting the given int values accordingly
     */
    public ScaledNumberWrapper(long number, int scale) {
        this(number, (short) scale);
    }

    /**
     * Parses the given double value to a ScaledNumberWrapper with the given
     * precision.
     * The scale field of the returned ScaledNumber is always {@code (short) (-precision)}
     *
     * @param what the double to convert
     * @param precision the fractional part of the double is rounded to this number
     *     of digits
     */
    public ScaledNumberWrapper(double what, int precision) {
        this(
            new BigDecimal(what).setScale(
                precision,
                RoundingMode.HALF_UP
            ).unscaledValue().longValue(),
            handlePrecision(precision)
        );
    }

    private static short handlePrecision(int what) {
        if (what < 0) {
            throw new IllegalArgumentException("precision must be positive");
        }

        return (short) (-what);
    }

    /**
     * simply calls {@link ScaledNumberWrapper#ScaledNumberWrapper(double, int)} with
     * a precision of 2
     */
    public ScaledNumberWrapper(double what) {
        this(what, 2);
    }

    /**
     * Creates a new ScaledNumberWrapper from the given BigDecimal
     * @param what the BigDecimal to convert
     */
    public ScaledNumberWrapper(BigDecimal what) {
        this(
            what.unscaledValue().longValue(),
            -what.scale()
        );
    }

    /**
     * Parses the given String to a BigDecimal, then calls
     * {@link ScaledNumberWrapper#ScaledNumberWrapper(BigDecimal)}
     *
     * @param what the String to parse
     */
    public ScaledNumberWrapper(String what) {
        this(new BigDecimal(what));
    }

    /**
     * Initiates a new instance, assuming a default scale of {@code 0}
     * @param number the number part of the newly initialized instance
     */
    public ScaledNumberWrapper(long number) {
        this(number, 0);
    }

    /**
     * calls {@link ScaledNumberWrapper#ScaledNumberWrapper(long)}
     * casting the given int value accordingly
     */
    public ScaledNumberWrapper(int number) {
        this((long) number);
    }

    /**
     * simply calls {@link BigDecimal#toEngineeringString()}
     */
    @Override
    public String toString() {
        return toBigDecimal().toEngineeringString();
    }

    /**
     * @return a new ScaledNumberType instance with the same values
     */
    public ScaledNumberType toXsdType() {
        return new ScaledNumberType(number, scale);
    }

    /**
     * Returns the result of this instance as a double.
     * </p>
     * Warning: Floating-point precision errors are inevitable.
     * If precision is important in your calculations or comparisons,
     * use {@link ScaledNumberWrapper#toBigDecimal()} instead.
     *
     * @return {@code number * 10 ^ scale}
     */
    public double toDouble() {
        return number * Math.pow(10, scale);
    }

    /**
     * @return this instance as a BigDecimal
     */
    public BigDecimal toBigDecimal() {
        return new BigDecimal(
            BigInteger.valueOf(number),
            -scale
        );
    }

    /**
     * @return a new instance with a negated number part
     */
    public ScaledNumberWrapper negate() {
        return new ScaledNumberWrapper(-number, scale.shortValue());
    }

    @Override
    public ScaledNumberWrapper withNumber(Long value) {
        setNumber(value);
        return this;
    }

    public ScaledNumberWrapper withNumber(int value) {
        setNumber((long) value);
        return this;
    }

    @Override
    public ScaledNumberWrapper withScale(Short value) {
        setScale(value);
        return this;
    }

    public ScaledNumberWrapper withScale(int value) {
        setScale((short) value);
        return this;
    }

    @Override
    public ScaledNumberWrapper clone() {
        return new ScaledNumberWrapper((ScaledNumberType) super.clone());
    }

    public ScaledNumberType copyTo(ScaledNumberType target) {
        return (ScaledNumberType) toXsdType().copyTo(target);
    }

    @Override
    public int compareTo(ScaledNumberType other) {
        return toBigDecimal().compareTo(new BigDecimal(
            BigInteger.valueOf(other.getNumber()),
            -other.getScale()
        ));
    }

    /**
     * @param other the other object to compare
     * @return {@code this.compareTo(other) > 0}
     */
    public boolean isGreaterThan(ScaledNumberType other) {
        return this.compareTo(other) > 0;
    }

    /**
     * @param other the other object to compare
     * @return {@code this.compareTo(other) < 0}
     */
    public boolean isLessThan(ScaledNumberType other) {
        return this.compareTo(other) < 0;
    }

    /**
     * @param other the other object to compare
     * @return {@code this.compareTo(other) == 0}
     */
    public boolean isEqualTo(ScaledNumberType other) {
        return this.compareTo(other) == 0;
    }

}
