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
 * <p>Java class for ElectricalConnectionCharacteristicTypeEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ElectricalConnectionCharacteristicTypeEnumType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="powerConsumptionMin"/&gt;
 *     &lt;enumeration value="powerConsumptionMax"/&gt;
 *     &lt;enumeration value="powerConsumptionNominalMin"/&gt;
 *     &lt;enumeration value="powerConsumptionNominalMax"/&gt;
 *     &lt;enumeration value="powerProductionMin"/&gt;
 *     &lt;enumeration value="powerProductionMax"/&gt;
 *     &lt;enumeration value="powerProductionNominalMin"/&gt;
 *     &lt;enumeration value="powerProductionNominalMax"/&gt;
 *     &lt;enumeration value="energyCapacityNominalMax"/&gt;
 *     &lt;enumeration value="contractualConsumptionNominalMax"/&gt;
 *     &lt;enumeration value="contractualProductionNominalMax"/&gt;
 *     &lt;enumeration value="apparentPowerProductionNominalMax"/&gt;
 *     &lt;enumeration value="apparentPowerConsumptionNominalMax"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ElectricalConnectionCharacteristicTypeEnumType")
@XmlEnum
public enum ElectricalConnectionCharacteristicTypeEnumType {

    @XmlEnumValue("powerConsumptionMin")
    POWER_CONSUMPTION_MIN("powerConsumptionMin"),
    @XmlEnumValue("powerConsumptionMax")
    POWER_CONSUMPTION_MAX("powerConsumptionMax"),
    @XmlEnumValue("powerConsumptionNominalMin")
    POWER_CONSUMPTION_NOMINAL_MIN("powerConsumptionNominalMin"),
    @XmlEnumValue("powerConsumptionNominalMax")
    POWER_CONSUMPTION_NOMINAL_MAX("powerConsumptionNominalMax"),
    @XmlEnumValue("powerProductionMin")
    POWER_PRODUCTION_MIN("powerProductionMin"),
    @XmlEnumValue("powerProductionMax")
    POWER_PRODUCTION_MAX("powerProductionMax"),
    @XmlEnumValue("powerProductionNominalMin")
    POWER_PRODUCTION_NOMINAL_MIN("powerProductionNominalMin"),
    @XmlEnumValue("powerProductionNominalMax")
    POWER_PRODUCTION_NOMINAL_MAX("powerProductionNominalMax"),
    @XmlEnumValue("energyCapacityNominalMax")
    ENERGY_CAPACITY_NOMINAL_MAX("energyCapacityNominalMax"),
    @XmlEnumValue("contractualConsumptionNominalMax")
    CONTRACTUAL_CONSUMPTION_NOMINAL_MAX("contractualConsumptionNominalMax"),
    @XmlEnumValue("contractualProductionNominalMax")
    CONTRACTUAL_PRODUCTION_NOMINAL_MAX("contractualProductionNominalMax"),
    @XmlEnumValue("apparentPowerProductionNominalMax")
    APPARENT_POWER_PRODUCTION_NOMINAL_MAX("apparentPowerProductionNominalMax"),
    @XmlEnumValue("apparentPowerConsumptionNominalMax")
    APPARENT_POWER_CONSUMPTION_NOMINAL_MAX("apparentPowerConsumptionNominalMax");
    private final String value;

    ElectricalConnectionCharacteristicTypeEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ElectricalConnectionCharacteristicTypeEnumType fromValue(String v) {
        for (ElectricalConnectionCharacteristicTypeEnumType c: ElectricalConnectionCharacteristicTypeEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
