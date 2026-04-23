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

import javax.xml.datatype.Duration;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;
import org.jvnet.jaxb.lang.CopyStrategy;
import org.jvnet.jaxb.lang.CopyTo;
import org.jvnet.jaxb.lang.JAXBCopyStrategy;
import org.jvnet.jaxb.lang.ToString;
import org.jvnet.jaxb.lang.ToStringStrategy;
import org.jvnet.jaxb.locator.ObjectLocator;
import org.jvnet.jaxb.locator.util.LocatorUtils;
import org.openmuc.jeebus.spine.impl.parser.CustomToStringStrategy;


/**
 * <p>Java class for DeviceDiagnosisStateDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeviceDiagnosisStateDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="timestamp" type="{http://docs.eebus.org/spine/xsd/v1}AbsoluteOrRelativeTimeType" minOccurs="0"/&gt;
 *         &lt;element name="operatingState" type="{http://docs.eebus.org/spine/xsd/v1}DeviceDiagnosisOperatingStateType" minOccurs="0"/&gt;
 *         &lt;element name="vendorStateCode" type="{http://docs.eebus.org/spine/xsd/v1}VendorStateCodeType" minOccurs="0"/&gt;
 *         &lt;element name="lastErrorCode" type="{http://docs.eebus.org/spine/xsd/v1}LastErrorCodeType" minOccurs="0"/&gt;
 *         &lt;element name="upTime" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *         &lt;element name="totalUpTime" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *         &lt;element name="powerSupplyCondition" type="{http://docs.eebus.org/spine/xsd/v1}PowerSupplyConditionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceDiagnosisStateDataType", propOrder = {
    "timestamp",
    "operatingState",
    "vendorStateCode",
    "lastErrorCode",
    "upTime",
    "totalUpTime",
    "powerSupplyCondition"
})
public class DeviceDiagnosisStateDataType implements Cloneable, CopyTo, ToString
{

    protected String timestamp;
    protected String operatingState;
    protected String vendorStateCode;
    protected String lastErrorCode;
    protected Duration upTime;
    protected Duration totalUpTime;
    protected String powerSupplyCondition;

    /**
     * Default no-arg constructor
     * 
     */
    public DeviceDiagnosisStateDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public DeviceDiagnosisStateDataType(final String timestamp, final String operatingState, final String vendorStateCode, final String lastErrorCode, final Duration upTime, final Duration totalUpTime, final String powerSupplyCondition) {
        this.timestamp = timestamp;
        this.operatingState = operatingState;
        this.vendorStateCode = vendorStateCode;
        this.lastErrorCode = lastErrorCode;
        this.upTime = upTime;
        this.totalUpTime = totalUpTime;
        this.powerSupplyCondition = powerSupplyCondition;
    }

    /**
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimestamp(String value) {
        this.timestamp = value;
    }

    /**
     * Gets the value of the operatingState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatingState() {
        return operatingState;
    }

    /**
     * Sets the value of the operatingState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatingState(String value) {
        this.operatingState = value;
    }

    /**
     * Gets the value of the vendorStateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorStateCode() {
        return vendorStateCode;
    }

    /**
     * Sets the value of the vendorStateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorStateCode(String value) {
        this.vendorStateCode = value;
    }

    /**
     * Gets the value of the lastErrorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastErrorCode() {
        return lastErrorCode;
    }

    /**
     * Sets the value of the lastErrorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastErrorCode(String value) {
        this.lastErrorCode = value;
    }

    /**
     * Gets the value of the upTime property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getUpTime() {
        return upTime;
    }

    /**
     * Sets the value of the upTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setUpTime(Duration value) {
        this.upTime = value;
    }

    /**
     * Gets the value of the totalUpTime property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getTotalUpTime() {
        return totalUpTime;
    }

    /**
     * Sets the value of the totalUpTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setTotalUpTime(Duration value) {
        this.totalUpTime = value;
    }

    /**
     * Gets the value of the powerSupplyCondition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPowerSupplyCondition() {
        return powerSupplyCondition;
    }

    /**
     * Sets the value of the powerSupplyCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPowerSupplyCondition(String value) {
        this.powerSupplyCondition = value;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public DeviceDiagnosisStateDataType withTimestamp(String value) {
        setTimestamp(value);
        return this;
    }

    /**
     * Sets the value of the operatingState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public DeviceDiagnosisStateDataType withOperatingState(String value) {
        setOperatingState(value);
        return this;
    }

    /**
     * Sets the value of the vendorStateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public DeviceDiagnosisStateDataType withVendorStateCode(String value) {
        setVendorStateCode(value);
        return this;
    }

    /**
     * Sets the value of the lastErrorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public DeviceDiagnosisStateDataType withLastErrorCode(String value) {
        setLastErrorCode(value);
        return this;
    }

    /**
     * Sets the value of the upTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     * @return
     *     The class instance
     */
    public DeviceDiagnosisStateDataType withUpTime(Duration value) {
        setUpTime(value);
        return this;
    }

    /**
     * Sets the value of the totalUpTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     * @return
     *     The class instance
     */
    public DeviceDiagnosisStateDataType withTotalUpTime(Duration value) {
        setTotalUpTime(value);
        return this;
    }

    /**
     * Sets the value of the powerSupplyCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public DeviceDiagnosisStateDataType withPowerSupplyCondition(String value) {
        setPowerSupplyCondition(value);
        return this;
    }

    @Override
    public Object clone() {
        return copyTo(createNewInstance());
    }

    @Override
    public Object copyTo(Object target) {
        final CopyStrategy strategy = JAXBCopyStrategy.getInstance();
        return copyTo(null, target, strategy);
    }

    @Override
    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof DeviceDiagnosisStateDataType) {
            final DeviceDiagnosisStateDataType copy = ((DeviceDiagnosisStateDataType) draftCopy);
            {
                Boolean timestampShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.timestamp!= null));
                if (timestampShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceTimestamp;
                    sourceTimestamp = this.getTimestamp();
                    String copyTimestamp = ((String) strategy.copy(LocatorUtils.property(locator, "timestamp", sourceTimestamp), sourceTimestamp, (this.timestamp!= null)));
                    copy.setTimestamp(copyTimestamp);
                } else {
                    if (timestampShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.timestamp = null;
                    }
                }
            }
            {
                Boolean operatingStateShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.operatingState!= null));
                if (operatingStateShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceOperatingState;
                    sourceOperatingState = this.getOperatingState();
                    String copyOperatingState = ((String) strategy.copy(LocatorUtils.property(locator, "operatingState", sourceOperatingState), sourceOperatingState, (this.operatingState!= null)));
                    copy.setOperatingState(copyOperatingState);
                } else {
                    if (operatingStateShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.operatingState = null;
                    }
                }
            }
            {
                Boolean vendorStateCodeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.vendorStateCode!= null));
                if (vendorStateCodeShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceVendorStateCode;
                    sourceVendorStateCode = this.getVendorStateCode();
                    String copyVendorStateCode = ((String) strategy.copy(LocatorUtils.property(locator, "vendorStateCode", sourceVendorStateCode), sourceVendorStateCode, (this.vendorStateCode!= null)));
                    copy.setVendorStateCode(copyVendorStateCode);
                } else {
                    if (vendorStateCodeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.vendorStateCode = null;
                    }
                }
            }
            {
                Boolean lastErrorCodeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.lastErrorCode!= null));
                if (lastErrorCodeShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceLastErrorCode;
                    sourceLastErrorCode = this.getLastErrorCode();
                    String copyLastErrorCode = ((String) strategy.copy(LocatorUtils.property(locator, "lastErrorCode", sourceLastErrorCode), sourceLastErrorCode, (this.lastErrorCode!= null)));
                    copy.setLastErrorCode(copyLastErrorCode);
                } else {
                    if (lastErrorCodeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.lastErrorCode = null;
                    }
                }
            }
            {
                Boolean upTimeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.upTime!= null));
                if (upTimeShouldBeCopiedAndSet == Boolean.TRUE) {
                    Duration sourceUpTime;
                    sourceUpTime = this.getUpTime();
                    Duration copyUpTime = ((Duration) strategy.copy(LocatorUtils.property(locator, "upTime", sourceUpTime), sourceUpTime, (this.upTime!= null)));
                    copy.setUpTime(copyUpTime);
                } else {
                    if (upTimeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.upTime = null;
                    }
                }
            }
            {
                Boolean totalUpTimeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.totalUpTime!= null));
                if (totalUpTimeShouldBeCopiedAndSet == Boolean.TRUE) {
                    Duration sourceTotalUpTime;
                    sourceTotalUpTime = this.getTotalUpTime();
                    Duration copyTotalUpTime = ((Duration) strategy.copy(LocatorUtils.property(locator, "totalUpTime", sourceTotalUpTime), sourceTotalUpTime, (this.totalUpTime!= null)));
                    copy.setTotalUpTime(copyTotalUpTime);
                } else {
                    if (totalUpTimeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.totalUpTime = null;
                    }
                }
            }
            {
                Boolean powerSupplyConditionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.powerSupplyCondition!= null));
                if (powerSupplyConditionShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourcePowerSupplyCondition;
                    sourcePowerSupplyCondition = this.getPowerSupplyCondition();
                    String copyPowerSupplyCondition = ((String) strategy.copy(LocatorUtils.property(locator, "powerSupplyCondition", sourcePowerSupplyCondition), sourcePowerSupplyCondition, (this.powerSupplyCondition!= null)));
                    copy.setPowerSupplyCondition(copyPowerSupplyCondition);
                } else {
                    if (powerSupplyConditionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.powerSupplyCondition = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new DeviceDiagnosisStateDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DeviceDiagnosisStateDataType that = ((DeviceDiagnosisStateDataType) object);
        {
            String leftTimestamp;
            leftTimestamp = this.getTimestamp();
            String rightTimestamp;
            rightTimestamp = that.getTimestamp();
            if (this.timestamp!= null) {
                if (that.timestamp!= null) {
                    if (!leftTimestamp.equals(rightTimestamp)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.timestamp!= null) {
                    return false;
                }
            }
        }
        {
            String leftOperatingState;
            leftOperatingState = this.getOperatingState();
            String rightOperatingState;
            rightOperatingState = that.getOperatingState();
            if (this.operatingState!= null) {
                if (that.operatingState!= null) {
                    if (!leftOperatingState.equals(rightOperatingState)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.operatingState!= null) {
                    return false;
                }
            }
        }
        {
            String leftVendorStateCode;
            leftVendorStateCode = this.getVendorStateCode();
            String rightVendorStateCode;
            rightVendorStateCode = that.getVendorStateCode();
            if (this.vendorStateCode!= null) {
                if (that.vendorStateCode!= null) {
                    if (!leftVendorStateCode.equals(rightVendorStateCode)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.vendorStateCode!= null) {
                    return false;
                }
            }
        }
        {
            String leftLastErrorCode;
            leftLastErrorCode = this.getLastErrorCode();
            String rightLastErrorCode;
            rightLastErrorCode = that.getLastErrorCode();
            if (this.lastErrorCode!= null) {
                if (that.lastErrorCode!= null) {
                    if (!leftLastErrorCode.equals(rightLastErrorCode)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.lastErrorCode!= null) {
                    return false;
                }
            }
        }
        {
            Duration leftUpTime;
            leftUpTime = this.getUpTime();
            Duration rightUpTime;
            rightUpTime = that.getUpTime();
            if (this.upTime!= null) {
                if (that.upTime!= null) {
                    if (!leftUpTime.equals(rightUpTime)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.upTime!= null) {
                    return false;
                }
            }
        }
        {
            Duration leftTotalUpTime;
            leftTotalUpTime = this.getTotalUpTime();
            Duration rightTotalUpTime;
            rightTotalUpTime = that.getTotalUpTime();
            if (this.totalUpTime!= null) {
                if (that.totalUpTime!= null) {
                    if (!leftTotalUpTime.equals(rightTotalUpTime)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.totalUpTime!= null) {
                    return false;
                }
            }
        }
        {
            String leftPowerSupplyCondition;
            leftPowerSupplyCondition = this.getPowerSupplyCondition();
            String rightPowerSupplyCondition;
            rightPowerSupplyCondition = that.getPowerSupplyCondition();
            if (this.powerSupplyCondition!= null) {
                if (that.powerSupplyCondition!= null) {
                    if (!leftPowerSupplyCondition.equals(rightPowerSupplyCondition)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.powerSupplyCondition!= null) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        int currentHashCode = 1;
        {
            currentHashCode = (currentHashCode* 31);
            String theTimestamp;
            theTimestamp = this.getTimestamp();
            if (this.timestamp!= null) {
                currentHashCode += theTimestamp.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String theOperatingState;
            theOperatingState = this.getOperatingState();
            if (this.operatingState!= null) {
                currentHashCode += theOperatingState.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String theVendorStateCode;
            theVendorStateCode = this.getVendorStateCode();
            if (this.vendorStateCode!= null) {
                currentHashCode += theVendorStateCode.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String theLastErrorCode;
            theLastErrorCode = this.getLastErrorCode();
            if (this.lastErrorCode!= null) {
                currentHashCode += theLastErrorCode.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            Duration theUpTime;
            theUpTime = this.getUpTime();
            if (this.upTime!= null) {
                currentHashCode += theUpTime.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            Duration theTotalUpTime;
            theTotalUpTime = this.getTotalUpTime();
            if (this.totalUpTime!= null) {
                currentHashCode += theTotalUpTime.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String thePowerSupplyCondition;
            thePowerSupplyCondition = this.getPowerSupplyCondition();
            if (this.powerSupplyCondition!= null) {
                currentHashCode += thePowerSupplyCondition.hashCode();
            }
        }
        return currentHashCode;
    }

    @Override
    public String toString() {
        final ToStringStrategy strategy = new CustomToStringStrategy();
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    @Override
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        {
            String theTimestamp;
            theTimestamp = this.getTimestamp();
            strategy.appendField(locator, this, "timestamp", buffer, theTimestamp, (this.timestamp!= null));
        }
        {
            String theOperatingState;
            theOperatingState = this.getOperatingState();
            strategy.appendField(locator, this, "operatingState", buffer, theOperatingState, (this.operatingState!= null));
        }
        {
            String theVendorStateCode;
            theVendorStateCode = this.getVendorStateCode();
            strategy.appendField(locator, this, "vendorStateCode", buffer, theVendorStateCode, (this.vendorStateCode!= null));
        }
        {
            String theLastErrorCode;
            theLastErrorCode = this.getLastErrorCode();
            strategy.appendField(locator, this, "lastErrorCode", buffer, theLastErrorCode, (this.lastErrorCode!= null));
        }
        {
            Duration theUpTime;
            theUpTime = this.getUpTime();
            strategy.appendField(locator, this, "upTime", buffer, theUpTime, (this.upTime!= null));
        }
        {
            Duration theTotalUpTime;
            theTotalUpTime = this.getTotalUpTime();
            strategy.appendField(locator, this, "totalUpTime", buffer, theTotalUpTime, (this.totalUpTime!= null));
        }
        {
            String thePowerSupplyCondition;
            thePowerSupplyCondition = this.getPowerSupplyCondition();
            strategy.appendField(locator, this, "powerSupplyCondition", buffer, thePowerSupplyCondition, (this.powerSupplyCondition!= null));
        }
        return buffer;
    }

}
