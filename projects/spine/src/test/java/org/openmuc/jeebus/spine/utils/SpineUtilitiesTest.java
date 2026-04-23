/********************************************************************************
 * Copyright (c) 2026 Fraunhofer ISE
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 ********************************************************************************/

package org.openmuc.jeebus.spine.utils;

import org.junit.jupiter.api.Test;
import org.openmuc.jeebus.spine.xsd.v1.MeasurementValueStateEnumType;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.openmuc.jeebus.spine.utils.SpineUtilities.isValidEnumValue;

class SpineUtilitiesTest {

    @Test
    void testIsValidEnumValue() {
        assertTrue(isValidEnumValue(
            MeasurementValueStateEnumType.class,
            "outOfRange"
        ));
    }

    @Test
    void testCalender() {
        XMLGregorianCalendar g1 = DatatypeFactory
            .newDefaultInstance()
            .newXMLGregorianCalendarDate(
                1999,
                9,
                9,
                9
            );
        XMLGregorianCalendar g2 = (XMLGregorianCalendar) g1.clone();

        assertThat(
            List.of(g1.getClass(), g2.getClass()),
            everyItem(is(typeCompatibleWith(
                XMLGregorianCalendar.class)))
        );
    }

}