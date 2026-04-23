/********************************************************************************
 * Copyright (c) 2026 Fraunhofer ISE
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 ********************************************************************************/

package org.openmuc.jeebus.spine;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;

/**
 * Tests if a string is equal to another string, ignoring any changes in whitespace.
 */
public class IsEqualIgnoringWhiteSpace extends TypeSafeMatcher<String> {

    private final String string;

    public IsEqualIgnoringWhiteSpace(String string) {
        if (string == null) {
            throw new IllegalArgumentException("Non-null value required");
        }
        this.string = string;
    }

    @Override
    public boolean matchesSafely(String item) {
        return removeSpaces(string).equals(removeSpaces(item));
    }

    @Override
    public void describeMismatchSafely(
        String item,
        Description mismatchDescription
    ) {
        mismatchDescription.appendText("was ").appendValue(item);
    }

    @Override
    public void describeTo(Description description) {
        description.appendText("a string equal to ")
            .appendValue(string)
            .appendText(" ignoring white spaces");
    }

    public String removeSpaces(String toBeStripped) {
        return toBeStripped.replaceAll("\\s+", "");
    }

    /**
     * Creates a matcher of {@link String} that matches when the examined string is
     * equal to the specified expectedString, when whitespace differences are
     * ignored.
     *
     * @param expectedString
     *     the expected value of matched strings
     */
    public static Matcher<String> equalToIgnoringWhiteSpace(String expectedString) {
        return new IsEqualIgnoringWhiteSpace(expectedString);
    }
}

