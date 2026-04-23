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
 * <p>Java class for FeatureSmartEnergyManagementPsSpecificUsageEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="FeatureSmartEnergyManagementPsSpecificUsageEnumType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FixedForecast"/&gt;
 *     &lt;enumeration value="FlexibleChosenForecast"/&gt;
 *     &lt;enumeration value="FlexibleOptionalForecast"/&gt;
 *     &lt;enumeration value="OptionalSequenceBasedImmediateControl"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FeatureSmartEnergyManagementPsSpecificUsageEnumType")
@XmlEnum
public enum FeatureSmartEnergyManagementPsSpecificUsageEnumType {

    @XmlEnumValue("FixedForecast")
    FIXED_FORECAST("FixedForecast"),
    @XmlEnumValue("FlexibleChosenForecast")
    FLEXIBLE_CHOSEN_FORECAST("FlexibleChosenForecast"),
    @XmlEnumValue("FlexibleOptionalForecast")
    FLEXIBLE_OPTIONAL_FORECAST("FlexibleOptionalForecast"),
    @XmlEnumValue("OptionalSequenceBasedImmediateControl")
    OPTIONAL_SEQUENCE_BASED_IMMEDIATE_CONTROL("OptionalSequenceBasedImmediateControl");
    private final String value;

    FeatureSmartEnergyManagementPsSpecificUsageEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FeatureSmartEnergyManagementPsSpecificUsageEnumType fromValue(String v) {
        for (FeatureSmartEnergyManagementPsSpecificUsageEnumType c: FeatureSmartEnergyManagementPsSpecificUsageEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
