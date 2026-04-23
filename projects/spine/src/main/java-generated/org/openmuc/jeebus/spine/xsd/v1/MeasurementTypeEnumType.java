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
 * <p>Java class for MeasurementTypeEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="MeasurementTypeEnumType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="acceleration"/&gt;
 *     &lt;enumeration value="angle"/&gt;
 *     &lt;enumeration value="angularVelocity"/&gt;
 *     &lt;enumeration value="area"/&gt;
 *     &lt;enumeration value="atmosphericPressure"/&gt;
 *     &lt;enumeration value="capacity"/&gt;
 *     &lt;enumeration value="concentration"/&gt;
 *     &lt;enumeration value="count"/&gt;
 *     &lt;enumeration value="current"/&gt;
 *     &lt;enumeration value="density"/&gt;
 *     &lt;enumeration value="distance"/&gt;
 *     &lt;enumeration value="electricField"/&gt;
 *     &lt;enumeration value="energy"/&gt;
 *     &lt;enumeration value="force"/&gt;
 *     &lt;enumeration value="frequency"/&gt;
 *     &lt;enumeration value="harmonicDistortion"/&gt;
 *     &lt;enumeration value="heat"/&gt;
 *     &lt;enumeration value="heatFlux"/&gt;
 *     &lt;enumeration value="illuminance"/&gt;
 *     &lt;enumeration value="impulse"/&gt;
 *     &lt;enumeration value="level"/&gt;
 *     &lt;enumeration value="magneticField"/&gt;
 *     &lt;enumeration value="mass"/&gt;
 *     &lt;enumeration value="massFlow"/&gt;
 *     &lt;enumeration value="particles"/&gt;
 *     &lt;enumeration value="percentage"/&gt;
 *     &lt;enumeration value="power"/&gt;
 *     &lt;enumeration value="powerFactor"/&gt;
 *     &lt;enumeration value="pressure"/&gt;
 *     &lt;enumeration value="radonActivity"/&gt;
 *     &lt;enumeration value="relativeHumidity"/&gt;
 *     &lt;enumeration value="resistance"/&gt;
 *     &lt;enumeration value="solarRadiation"/&gt;
 *     &lt;enumeration value="speed"/&gt;
 *     &lt;enumeration value="temperature"/&gt;
 *     &lt;enumeration value="time"/&gt;
 *     &lt;enumeration value="torque"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="velocity"/&gt;
 *     &lt;enumeration value="voltage"/&gt;
 *     &lt;enumeration value="volume"/&gt;
 *     &lt;enumeration value="volumetricFlow"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MeasurementTypeEnumType")
@XmlEnum
public enum MeasurementTypeEnumType {

    @XmlEnumValue("acceleration")
    ACCELERATION("acceleration"),
    @XmlEnumValue("angle")
    ANGLE("angle"),
    @XmlEnumValue("angularVelocity")
    ANGULAR_VELOCITY("angularVelocity"),
    @XmlEnumValue("area")
    AREA("area"),
    @XmlEnumValue("atmosphericPressure")
    ATMOSPHERIC_PRESSURE("atmosphericPressure"),
    @XmlEnumValue("capacity")
    CAPACITY("capacity"),
    @XmlEnumValue("concentration")
    CONCENTRATION("concentration"),
    @XmlEnumValue("count")
    COUNT("count"),
    @XmlEnumValue("current")
    CURRENT("current"),
    @XmlEnumValue("density")
    DENSITY("density"),
    @XmlEnumValue("distance")
    DISTANCE("distance"),
    @XmlEnumValue("electricField")
    ELECTRIC_FIELD("electricField"),
    @XmlEnumValue("energy")
    ENERGY("energy"),
    @XmlEnumValue("force")
    FORCE("force"),
    @XmlEnumValue("frequency")
    FREQUENCY("frequency"),
    @XmlEnumValue("harmonicDistortion")
    HARMONIC_DISTORTION("harmonicDistortion"),
    @XmlEnumValue("heat")
    HEAT("heat"),
    @XmlEnumValue("heatFlux")
    HEAT_FLUX("heatFlux"),
    @XmlEnumValue("illuminance")
    ILLUMINANCE("illuminance"),
    @XmlEnumValue("impulse")
    IMPULSE("impulse"),
    @XmlEnumValue("level")
    LEVEL("level"),
    @XmlEnumValue("magneticField")
    MAGNETIC_FIELD("magneticField"),
    @XmlEnumValue("mass")
    MASS("mass"),
    @XmlEnumValue("massFlow")
    MASS_FLOW("massFlow"),
    @XmlEnumValue("particles")
    PARTICLES("particles"),
    @XmlEnumValue("percentage")
    PERCENTAGE("percentage"),
    @XmlEnumValue("power")
    POWER("power"),
    @XmlEnumValue("powerFactor")
    POWER_FACTOR("powerFactor"),
    @XmlEnumValue("pressure")
    PRESSURE("pressure"),
    @XmlEnumValue("radonActivity")
    RADON_ACTIVITY("radonActivity"),
    @XmlEnumValue("relativeHumidity")
    RELATIVE_HUMIDITY("relativeHumidity"),
    @XmlEnumValue("resistance")
    RESISTANCE("resistance"),
    @XmlEnumValue("solarRadiation")
    SOLAR_RADIATION("solarRadiation"),
    @XmlEnumValue("speed")
    SPEED("speed"),
    @XmlEnumValue("temperature")
    TEMPERATURE("temperature"),
    @XmlEnumValue("time")
    TIME("time"),
    @XmlEnumValue("torque")
    TORQUE("torque"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("velocity")
    VELOCITY("velocity"),
    @XmlEnumValue("voltage")
    VOLTAGE("voltage"),
    @XmlEnumValue("volume")
    VOLUME("volume"),
    @XmlEnumValue("volumetricFlow")
    VOLUMETRIC_FLOW("volumetricFlow");
    private final String value;

    MeasurementTypeEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MeasurementTypeEnumType fromValue(String v) {
        for (MeasurementTypeEnumType c: MeasurementTypeEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
