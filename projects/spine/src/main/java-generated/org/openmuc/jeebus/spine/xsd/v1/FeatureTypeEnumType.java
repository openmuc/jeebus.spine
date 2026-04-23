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
 * <p>Java class for FeatureTypeEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="FeatureTypeEnumType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ActuatorLevel"/&gt;
 *     &lt;enumeration value="ActuatorSwitch"/&gt;
 *     &lt;enumeration value="Alarm"/&gt;
 *     &lt;enumeration value="DataTunneling"/&gt;
 *     &lt;enumeration value="DeviceClassification"/&gt;
 *     &lt;enumeration value="DeviceDiagnosis"/&gt;
 *     &lt;enumeration value="DirectControl"/&gt;
 *     &lt;enumeration value="ElectricalConnection"/&gt;
 *     &lt;enumeration value="Generic"/&gt;
 *     &lt;enumeration value="HVAC"/&gt;
 *     &lt;enumeration value="LoadControl"/&gt;
 *     &lt;enumeration value="Measurement"/&gt;
 *     &lt;enumeration value="Messaging"/&gt;
 *     &lt;enumeration value="NetworkManagement"/&gt;
 *     &lt;enumeration value="NodeManagement"/&gt;
 *     &lt;enumeration value="OperatingConstraints"/&gt;
 *     &lt;enumeration value="PowerSequences"/&gt;
 *     &lt;enumeration value="Sensing"/&gt;
 *     &lt;enumeration value="Setpoint"/&gt;
 *     &lt;enumeration value="SmartEnergyManagementPs"/&gt;
 *     &lt;enumeration value="TaskManagement"/&gt;
 *     &lt;enumeration value="Threshold"/&gt;
 *     &lt;enumeration value="TimeInformation"/&gt;
 *     &lt;enumeration value="TimeTable"/&gt;
 *     &lt;enumeration value="DeviceConfiguration"/&gt;
 *     &lt;enumeration value="SupplyCondition"/&gt;
 *     &lt;enumeration value="TimeSeries"/&gt;
 *     &lt;enumeration value="TariffInformation"/&gt;
 *     &lt;enumeration value="IncentiveTable"/&gt;
 *     &lt;enumeration value="Bill"/&gt;
 *     &lt;enumeration value="Identification"/&gt;
 *     &lt;enumeration value="StateInformation"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FeatureTypeEnumType")
@XmlEnum
public enum FeatureTypeEnumType {

    @XmlEnumValue("ActuatorLevel")
    ACTUATOR_LEVEL("ActuatorLevel"),
    @XmlEnumValue("ActuatorSwitch")
    ACTUATOR_SWITCH("ActuatorSwitch"),
    @XmlEnumValue("Alarm")
    ALARM("Alarm"),
    @XmlEnumValue("DataTunneling")
    DATA_TUNNELING("DataTunneling"),
    @XmlEnumValue("DeviceClassification")
    DEVICE_CLASSIFICATION("DeviceClassification"),
    @XmlEnumValue("DeviceDiagnosis")
    DEVICE_DIAGNOSIS("DeviceDiagnosis"),
    @XmlEnumValue("DirectControl")
    DIRECT_CONTROL("DirectControl"),
    @XmlEnumValue("ElectricalConnection")
    ELECTRICAL_CONNECTION("ElectricalConnection"),
    @XmlEnumValue("Generic")
    GENERIC("Generic"),
    HVAC("HVAC"),
    @XmlEnumValue("LoadControl")
    LOAD_CONTROL("LoadControl"),
    @XmlEnumValue("Measurement")
    MEASUREMENT("Measurement"),
    @XmlEnumValue("Messaging")
    MESSAGING("Messaging"),
    @XmlEnumValue("NetworkManagement")
    NETWORK_MANAGEMENT("NetworkManagement"),
    @XmlEnumValue("NodeManagement")
    NODE_MANAGEMENT("NodeManagement"),
    @XmlEnumValue("OperatingConstraints")
    OPERATING_CONSTRAINTS("OperatingConstraints"),
    @XmlEnumValue("PowerSequences")
    POWER_SEQUENCES("PowerSequences"),
    @XmlEnumValue("Sensing")
    SENSING("Sensing"),
    @XmlEnumValue("Setpoint")
    SETPOINT("Setpoint"),
    @XmlEnumValue("SmartEnergyManagementPs")
    SMART_ENERGY_MANAGEMENT_PS("SmartEnergyManagementPs"),
    @XmlEnumValue("TaskManagement")
    TASK_MANAGEMENT("TaskManagement"),
    @XmlEnumValue("Threshold")
    THRESHOLD("Threshold"),
    @XmlEnumValue("TimeInformation")
    TIME_INFORMATION("TimeInformation"),
    @XmlEnumValue("TimeTable")
    TIME_TABLE("TimeTable"),
    @XmlEnumValue("DeviceConfiguration")
    DEVICE_CONFIGURATION("DeviceConfiguration"),
    @XmlEnumValue("SupplyCondition")
    SUPPLY_CONDITION("SupplyCondition"),
    @XmlEnumValue("TimeSeries")
    TIME_SERIES("TimeSeries"),
    @XmlEnumValue("TariffInformation")
    TARIFF_INFORMATION("TariffInformation"),
    @XmlEnumValue("IncentiveTable")
    INCENTIVE_TABLE("IncentiveTable"),
    @XmlEnumValue("Bill")
    BILL("Bill"),
    @XmlEnumValue("Identification")
    IDENTIFICATION("Identification"),
    @XmlEnumValue("StateInformation")
    STATE_INFORMATION("StateInformation");
    private final String value;

    FeatureTypeEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FeatureTypeEnumType fromValue(String v) {
        for (FeatureTypeEnumType c: FeatureTypeEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
