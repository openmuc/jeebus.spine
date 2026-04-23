/********************************************************************************
 * Copyright (c) 2026 Fraunhofer ISE
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 ********************************************************************************/

package org.openmuc.jeebus.spine.xsd.v1;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TierBoundaryTypeEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="TierBoundaryTypeEnumType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="powerBoundary"/&gt;
 *     &lt;enumeration value="energyBoundary"/&gt;
 *     &lt;enumeration value="countBoundary"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TierBoundaryTypeEnumType")
@XmlEnum
public enum TierBoundaryTypeEnumType {

    @XmlEnumValue("powerBoundary")
    POWER_BOUNDARY("powerBoundary"),
    @XmlEnumValue("energyBoundary")
    ENERGY_BOUNDARY("energyBoundary"),
    @XmlEnumValue("countBoundary")
    COUNT_BOUNDARY("countBoundary");
    private final String value;

    TierBoundaryTypeEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TierBoundaryTypeEnumType fromValue(String v) {
        for (TierBoundaryTypeEnumType c: TierBoundaryTypeEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
