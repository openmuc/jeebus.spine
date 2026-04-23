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
 * <p>Java class for CommodityTypeEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="CommodityTypeEnumType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="electricity"/&gt;
 *     &lt;enumeration value="gas"/&gt;
 *     &lt;enumeration value="oil"/&gt;
 *     &lt;enumeration value="water"/&gt;
 *     &lt;enumeration value="wasteWater"/&gt;
 *     &lt;enumeration value="domesticHotWater"/&gt;
 *     &lt;enumeration value="heatingWater"/&gt;
 *     &lt;enumeration value="steam"/&gt;
 *     &lt;enumeration value="heat"/&gt;
 *     &lt;enumeration value="coolingLoad"/&gt;
 *     &lt;enumeration value="air"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CommodityTypeEnumType")
@XmlEnum
public enum CommodityTypeEnumType {

    @XmlEnumValue("electricity")
    ELECTRICITY("electricity"),
    @XmlEnumValue("gas")
    GAS("gas"),
    @XmlEnumValue("oil")
    OIL("oil"),
    @XmlEnumValue("water")
    WATER("water"),
    @XmlEnumValue("wasteWater")
    WASTE_WATER("wasteWater"),
    @XmlEnumValue("domesticHotWater")
    DOMESTIC_HOT_WATER("domesticHotWater"),
    @XmlEnumValue("heatingWater")
    HEATING_WATER("heatingWater"),
    @XmlEnumValue("steam")
    STEAM("steam"),
    @XmlEnumValue("heat")
    HEAT("heat"),
    @XmlEnumValue("coolingLoad")
    COOLING_LOAD("coolingLoad"),
    @XmlEnumValue("air")
    AIR("air");
    private final String value;

    CommodityTypeEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CommodityTypeEnumType fromValue(String v) {
        for (CommodityTypeEnumType c: CommodityTypeEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
