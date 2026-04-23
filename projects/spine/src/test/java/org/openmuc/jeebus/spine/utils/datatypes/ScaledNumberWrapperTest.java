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

import org.junit.jupiter.api.Test;
import org.openmuc.jeebus.spine.xsd.v1.ScaledNumberType;

import java.math.BigDecimal;
import java.math.BigInteger;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class ScaledNumberWrapperTest {

    @Test
    public void testCopyTo() {
        assertThat(
            new ScaledNumberWrapper(6, 8).copyTo(new ScaledNumberType()),
            is(new ScaledNumberType(6L, (short) 8))
        );
    }

    @Test
    void testFromDouble() {
        assertThat(
            new ScaledNumberWrapper(3000.12345, 0),
            is(new ScaledNumberWrapper(3000, 0))
        );
        assertThat(
            new ScaledNumberWrapper(3000.12345),
            is(new ScaledNumberWrapper(300012, -2))
        );
        assertThat(
            new ScaledNumberWrapper(0.12345),
            is(new ScaledNumberWrapper(12, -2))
        );
        assertThat(
            new ScaledNumberWrapper(3000.12345, 6),
            is(new ScaledNumberWrapper(3000123450L, -6))
        );
    }

    @Test
    public void testIsEqualTo() {
        assertThat(
            new ScaledNumberWrapper(100, 0)
                .isEqualTo(new ScaledNumberWrapper(1, 2)),
            is(true)
        );
        assertThat(
            new ScaledNumberWrapper(12345, 3)
                .isEqualTo(new ScaledNumberWrapper(123450, 2)),
            is(true)
        );
    }

    @Test
    public void testCompareTo() {
        assertThat(
            new ScaledNumberWrapper(1, 3)
                .compareTo(new ScaledNumberType(9L, (short) 2)),
            is(1)
        );
        assertThat(
            new ScaledNumberWrapper(1, 3)
                .compareTo(new ScaledNumberWrapper(1000, 0)),
            is(0)
        );
    }

    @Test
    public void testFromBigDecimal() {
        assertThat(
            new ScaledNumberWrapper(new BigDecimal(BigInteger.valueOf(50), -2)),
            is(new ScaledNumberWrapper(50, 2))
        );
        ScaledNumberWrapper dut = new ScaledNumberWrapper(70, 3);
        assertThat(
            new ScaledNumberWrapper(dut.toBigDecimal()),
            is(dut)
        );
    }

    @Test
    public void testToString() {
        assertThat(
            new ScaledNumberWrapper(1, 2),
            hasToString("100")
        );
        assertThat(
            new ScaledNumberWrapper(1, 2).toXsdType(),
            hasToString("ScaledNumberType[number=1, scale=2]")
        );
    }
}