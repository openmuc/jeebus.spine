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
 * <p>Java class for DeviceDiagnosisStateDataElementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeviceDiagnosisStateDataElementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="timestamp" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="operatingState" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="vendorStateCode" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="lastErrorCode" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="upTime" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="totalUpTime" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="powerSupplyCondition" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceDiagnosisStateDataElementsType", propOrder = {
    "timestamp",
    "operatingState",
    "vendorStateCode",
    "lastErrorCode",
    "upTime",
    "totalUpTime",
    "powerSupplyCondition"
})
public class DeviceDiagnosisStateDataElementsType implements Cloneable, CopyTo, ToString
{

    protected ElementTagType timestamp;
    protected ElementTagType operatingState;
    protected ElementTagType vendorStateCode;
    protected ElementTagType lastErrorCode;
    protected ElementTagType upTime;
    protected ElementTagType totalUpTime;
    protected ElementTagType powerSupplyCondition;

    /**
     * Default no-arg constructor
     * 
     */
    public DeviceDiagnosisStateDataElementsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public DeviceDiagnosisStateDataElementsType(final ElementTagType timestamp, final ElementTagType operatingState, final ElementTagType vendorStateCode, final ElementTagType lastErrorCode, final ElementTagType upTime, final ElementTagType totalUpTime, final ElementTagType powerSupplyCondition) {
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
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setTimestamp(ElementTagType value) {
        this.timestamp = value;
    }

    /**
     * Gets the value of the operatingState property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getOperatingState() {
        return operatingState;
    }

    /**
     * Sets the value of the operatingState property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setOperatingState(ElementTagType value) {
        this.operatingState = value;
    }

    /**
     * Gets the value of the vendorStateCode property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getVendorStateCode() {
        return vendorStateCode;
    }

    /**
     * Sets the value of the vendorStateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setVendorStateCode(ElementTagType value) {
        this.vendorStateCode = value;
    }

    /**
     * Gets the value of the lastErrorCode property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getLastErrorCode() {
        return lastErrorCode;
    }

    /**
     * Sets the value of the lastErrorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setLastErrorCode(ElementTagType value) {
        this.lastErrorCode = value;
    }

    /**
     * Gets the value of the upTime property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getUpTime() {
        return upTime;
    }

    /**
     * Sets the value of the upTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setUpTime(ElementTagType value) {
        this.upTime = value;
    }

    /**
     * Gets the value of the totalUpTime property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getTotalUpTime() {
        return totalUpTime;
    }

    /**
     * Sets the value of the totalUpTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setTotalUpTime(ElementTagType value) {
        this.totalUpTime = value;
    }

    /**
     * Gets the value of the powerSupplyCondition property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getPowerSupplyCondition() {
        return powerSupplyCondition;
    }

    /**
     * Sets the value of the powerSupplyCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setPowerSupplyCondition(ElementTagType value) {
        this.powerSupplyCondition = value;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public DeviceDiagnosisStateDataElementsType withTimestamp(ElementTagType value) {
        setTimestamp(value);
        return this;
    }

    /**
     * Sets the value of the operatingState property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public DeviceDiagnosisStateDataElementsType withOperatingState(ElementTagType value) {
        setOperatingState(value);
        return this;
    }

    /**
     * Sets the value of the vendorStateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public DeviceDiagnosisStateDataElementsType withVendorStateCode(ElementTagType value) {
        setVendorStateCode(value);
        return this;
    }

    /**
     * Sets the value of the lastErrorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public DeviceDiagnosisStateDataElementsType withLastErrorCode(ElementTagType value) {
        setLastErrorCode(value);
        return this;
    }

    /**
     * Sets the value of the upTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public DeviceDiagnosisStateDataElementsType withUpTime(ElementTagType value) {
        setUpTime(value);
        return this;
    }

    /**
     * Sets the value of the totalUpTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public DeviceDiagnosisStateDataElementsType withTotalUpTime(ElementTagType value) {
        setTotalUpTime(value);
        return this;
    }

    /**
     * Sets the value of the powerSupplyCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public DeviceDiagnosisStateDataElementsType withPowerSupplyCondition(ElementTagType value) {
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
        if (draftCopy instanceof DeviceDiagnosisStateDataElementsType) {
            final DeviceDiagnosisStateDataElementsType copy = ((DeviceDiagnosisStateDataElementsType) draftCopy);
            {
                Boolean timestampShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.timestamp!= null));
                if (timestampShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceTimestamp;
                    sourceTimestamp = this.getTimestamp();
                    ElementTagType copyTimestamp = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "timestamp", sourceTimestamp), sourceTimestamp, (this.timestamp!= null)));
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
                    ElementTagType sourceOperatingState;
                    sourceOperatingState = this.getOperatingState();
                    ElementTagType copyOperatingState = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "operatingState", sourceOperatingState), sourceOperatingState, (this.operatingState!= null)));
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
                    ElementTagType sourceVendorStateCode;
                    sourceVendorStateCode = this.getVendorStateCode();
                    ElementTagType copyVendorStateCode = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "vendorStateCode", sourceVendorStateCode), sourceVendorStateCode, (this.vendorStateCode!= null)));
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
                    ElementTagType sourceLastErrorCode;
                    sourceLastErrorCode = this.getLastErrorCode();
                    ElementTagType copyLastErrorCode = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "lastErrorCode", sourceLastErrorCode), sourceLastErrorCode, (this.lastErrorCode!= null)));
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
                    ElementTagType sourceUpTime;
                    sourceUpTime = this.getUpTime();
                    ElementTagType copyUpTime = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "upTime", sourceUpTime), sourceUpTime, (this.upTime!= null)));
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
                    ElementTagType sourceTotalUpTime;
                    sourceTotalUpTime = this.getTotalUpTime();
                    ElementTagType copyTotalUpTime = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "totalUpTime", sourceTotalUpTime), sourceTotalUpTime, (this.totalUpTime!= null)));
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
                    ElementTagType sourcePowerSupplyCondition;
                    sourcePowerSupplyCondition = this.getPowerSupplyCondition();
                    ElementTagType copyPowerSupplyCondition = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "powerSupplyCondition", sourcePowerSupplyCondition), sourcePowerSupplyCondition, (this.powerSupplyCondition!= null)));
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
        return new DeviceDiagnosisStateDataElementsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DeviceDiagnosisStateDataElementsType that = ((DeviceDiagnosisStateDataElementsType) object);
        {
            ElementTagType leftTimestamp;
            leftTimestamp = this.getTimestamp();
            ElementTagType rightTimestamp;
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
            ElementTagType leftOperatingState;
            leftOperatingState = this.getOperatingState();
            ElementTagType rightOperatingState;
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
            ElementTagType leftVendorStateCode;
            leftVendorStateCode = this.getVendorStateCode();
            ElementTagType rightVendorStateCode;
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
            ElementTagType leftLastErrorCode;
            leftLastErrorCode = this.getLastErrorCode();
            ElementTagType rightLastErrorCode;
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
            ElementTagType leftUpTime;
            leftUpTime = this.getUpTime();
            ElementTagType rightUpTime;
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
            ElementTagType leftTotalUpTime;
            leftTotalUpTime = this.getTotalUpTime();
            ElementTagType rightTotalUpTime;
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
            ElementTagType leftPowerSupplyCondition;
            leftPowerSupplyCondition = this.getPowerSupplyCondition();
            ElementTagType rightPowerSupplyCondition;
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
            ElementTagType theTimestamp;
            theTimestamp = this.getTimestamp();
            if (this.timestamp!= null) {
                currentHashCode += theTimestamp.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theOperatingState;
            theOperatingState = this.getOperatingState();
            if (this.operatingState!= null) {
                currentHashCode += theOperatingState.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theVendorStateCode;
            theVendorStateCode = this.getVendorStateCode();
            if (this.vendorStateCode!= null) {
                currentHashCode += theVendorStateCode.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theLastErrorCode;
            theLastErrorCode = this.getLastErrorCode();
            if (this.lastErrorCode!= null) {
                currentHashCode += theLastErrorCode.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theUpTime;
            theUpTime = this.getUpTime();
            if (this.upTime!= null) {
                currentHashCode += theUpTime.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theTotalUpTime;
            theTotalUpTime = this.getTotalUpTime();
            if (this.totalUpTime!= null) {
                currentHashCode += theTotalUpTime.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType thePowerSupplyCondition;
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
            ElementTagType theTimestamp;
            theTimestamp = this.getTimestamp();
            strategy.appendField(locator, this, "timestamp", buffer, theTimestamp, (this.timestamp!= null));
        }
        {
            ElementTagType theOperatingState;
            theOperatingState = this.getOperatingState();
            strategy.appendField(locator, this, "operatingState", buffer, theOperatingState, (this.operatingState!= null));
        }
        {
            ElementTagType theVendorStateCode;
            theVendorStateCode = this.getVendorStateCode();
            strategy.appendField(locator, this, "vendorStateCode", buffer, theVendorStateCode, (this.vendorStateCode!= null));
        }
        {
            ElementTagType theLastErrorCode;
            theLastErrorCode = this.getLastErrorCode();
            strategy.appendField(locator, this, "lastErrorCode", buffer, theLastErrorCode, (this.lastErrorCode!= null));
        }
        {
            ElementTagType theUpTime;
            theUpTime = this.getUpTime();
            strategy.appendField(locator, this, "upTime", buffer, theUpTime, (this.upTime!= null));
        }
        {
            ElementTagType theTotalUpTime;
            theTotalUpTime = this.getTotalUpTime();
            strategy.appendField(locator, this, "totalUpTime", buffer, theTotalUpTime, (this.totalUpTime!= null));
        }
        {
            ElementTagType thePowerSupplyCondition;
            thePowerSupplyCondition = this.getPowerSupplyCondition();
            strategy.appendField(locator, this, "powerSupplyCondition", buffer, thePowerSupplyCondition, (this.powerSupplyCondition!= null));
        }
        return buffer;
    }

}
