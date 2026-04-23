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
 * <p>Java class for SupplyConditionOriginatorEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="SupplyConditionOriginatorEnumType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="externDSO"/&gt;
 *     &lt;enumeration value="externSupplier"/&gt;
 *     &lt;enumeration value="internalLimit"/&gt;
 *     &lt;enumeration value="internalService"/&gt;
 *     &lt;enumeration value="internalUser"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SupplyConditionOriginatorEnumType")
@XmlEnum
public enum SupplyConditionOriginatorEnumType {

    @XmlEnumValue("externDSO")
    EXTERN_DSO("externDSO"),
    @XmlEnumValue("externSupplier")
    EXTERN_SUPPLIER("externSupplier"),
    @XmlEnumValue("internalLimit")
    INTERNAL_LIMIT("internalLimit"),
    @XmlEnumValue("internalService")
    INTERNAL_SERVICE("internalService"),
    @XmlEnumValue("internalUser")
    INTERNAL_USER("internalUser");
    private final String value;

    SupplyConditionOriginatorEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SupplyConditionOriginatorEnumType fromValue(String v) {
        for (SupplyConditionOriginatorEnumType c: SupplyConditionOriginatorEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
