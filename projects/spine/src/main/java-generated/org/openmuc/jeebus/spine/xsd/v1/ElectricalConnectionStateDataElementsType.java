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
 * <p>Java class for ElectricalConnectionStateDataElementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElectricalConnectionStateDataElementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="electricalConnectionId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="timestamp" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="currentEnergyMode" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="consumptionTime" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="productionTime" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="totalConsumptionTime" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="totalProductionTime" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElectricalConnectionStateDataElementsType", propOrder = {
    "electricalConnectionId",
    "timestamp",
    "currentEnergyMode",
    "consumptionTime",
    "productionTime",
    "totalConsumptionTime",
    "totalProductionTime"
})
public class ElectricalConnectionStateDataElementsType implements Cloneable, CopyTo, ToString
{

    protected ElementTagType electricalConnectionId;
    protected ElementTagType timestamp;
    protected ElementTagType currentEnergyMode;
    protected ElementTagType consumptionTime;
    protected ElementTagType productionTime;
    protected ElementTagType totalConsumptionTime;
    protected ElementTagType totalProductionTime;

    /**
     * Default no-arg constructor
     * 
     */
    public ElectricalConnectionStateDataElementsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public ElectricalConnectionStateDataElementsType(final ElementTagType electricalConnectionId, final ElementTagType timestamp, final ElementTagType currentEnergyMode, final ElementTagType consumptionTime, final ElementTagType productionTime, final ElementTagType totalConsumptionTime, final ElementTagType totalProductionTime) {
        this.electricalConnectionId = electricalConnectionId;
        this.timestamp = timestamp;
        this.currentEnergyMode = currentEnergyMode;
        this.consumptionTime = consumptionTime;
        this.productionTime = productionTime;
        this.totalConsumptionTime = totalConsumptionTime;
        this.totalProductionTime = totalProductionTime;
    }

    /**
     * Gets the value of the electricalConnectionId property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getElectricalConnectionId() {
        return electricalConnectionId;
    }

    /**
     * Sets the value of the electricalConnectionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setElectricalConnectionId(ElementTagType value) {
        this.electricalConnectionId = value;
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
     * Gets the value of the currentEnergyMode property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getCurrentEnergyMode() {
        return currentEnergyMode;
    }

    /**
     * Sets the value of the currentEnergyMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setCurrentEnergyMode(ElementTagType value) {
        this.currentEnergyMode = value;
    }

    /**
     * Gets the value of the consumptionTime property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getConsumptionTime() {
        return consumptionTime;
    }

    /**
     * Sets the value of the consumptionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setConsumptionTime(ElementTagType value) {
        this.consumptionTime = value;
    }

    /**
     * Gets the value of the productionTime property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getProductionTime() {
        return productionTime;
    }

    /**
     * Sets the value of the productionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setProductionTime(ElementTagType value) {
        this.productionTime = value;
    }

    /**
     * Gets the value of the totalConsumptionTime property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getTotalConsumptionTime() {
        return totalConsumptionTime;
    }

    /**
     * Sets the value of the totalConsumptionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setTotalConsumptionTime(ElementTagType value) {
        this.totalConsumptionTime = value;
    }

    /**
     * Gets the value of the totalProductionTime property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getTotalProductionTime() {
        return totalProductionTime;
    }

    /**
     * Sets the value of the totalProductionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setTotalProductionTime(ElementTagType value) {
        this.totalProductionTime = value;
    }

    /**
     * Sets the value of the electricalConnectionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public ElectricalConnectionStateDataElementsType withElectricalConnectionId(ElementTagType value) {
        setElectricalConnectionId(value);
        return this;
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
    public ElectricalConnectionStateDataElementsType withTimestamp(ElementTagType value) {
        setTimestamp(value);
        return this;
    }

    /**
     * Sets the value of the currentEnergyMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public ElectricalConnectionStateDataElementsType withCurrentEnergyMode(ElementTagType value) {
        setCurrentEnergyMode(value);
        return this;
    }

    /**
     * Sets the value of the consumptionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public ElectricalConnectionStateDataElementsType withConsumptionTime(ElementTagType value) {
        setConsumptionTime(value);
        return this;
    }

    /**
     * Sets the value of the productionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public ElectricalConnectionStateDataElementsType withProductionTime(ElementTagType value) {
        setProductionTime(value);
        return this;
    }

    /**
     * Sets the value of the totalConsumptionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public ElectricalConnectionStateDataElementsType withTotalConsumptionTime(ElementTagType value) {
        setTotalConsumptionTime(value);
        return this;
    }

    /**
     * Sets the value of the totalProductionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public ElectricalConnectionStateDataElementsType withTotalProductionTime(ElementTagType value) {
        setTotalProductionTime(value);
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
        if (draftCopy instanceof ElectricalConnectionStateDataElementsType) {
            final ElectricalConnectionStateDataElementsType copy = ((ElectricalConnectionStateDataElementsType) draftCopy);
            {
                Boolean electricalConnectionIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.electricalConnectionId!= null));
                if (electricalConnectionIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceElectricalConnectionId;
                    sourceElectricalConnectionId = this.getElectricalConnectionId();
                    ElementTagType copyElectricalConnectionId = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "electricalConnectionId", sourceElectricalConnectionId), sourceElectricalConnectionId, (this.electricalConnectionId!= null)));
                    copy.setElectricalConnectionId(copyElectricalConnectionId);
                } else {
                    if (electricalConnectionIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.electricalConnectionId = null;
                    }
                }
            }
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
                Boolean currentEnergyModeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.currentEnergyMode!= null));
                if (currentEnergyModeShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceCurrentEnergyMode;
                    sourceCurrentEnergyMode = this.getCurrentEnergyMode();
                    ElementTagType copyCurrentEnergyMode = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "currentEnergyMode", sourceCurrentEnergyMode), sourceCurrentEnergyMode, (this.currentEnergyMode!= null)));
                    copy.setCurrentEnergyMode(copyCurrentEnergyMode);
                } else {
                    if (currentEnergyModeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.currentEnergyMode = null;
                    }
                }
            }
            {
                Boolean consumptionTimeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.consumptionTime!= null));
                if (consumptionTimeShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceConsumptionTime;
                    sourceConsumptionTime = this.getConsumptionTime();
                    ElementTagType copyConsumptionTime = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "consumptionTime", sourceConsumptionTime), sourceConsumptionTime, (this.consumptionTime!= null)));
                    copy.setConsumptionTime(copyConsumptionTime);
                } else {
                    if (consumptionTimeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.consumptionTime = null;
                    }
                }
            }
            {
                Boolean productionTimeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.productionTime!= null));
                if (productionTimeShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceProductionTime;
                    sourceProductionTime = this.getProductionTime();
                    ElementTagType copyProductionTime = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "productionTime", sourceProductionTime), sourceProductionTime, (this.productionTime!= null)));
                    copy.setProductionTime(copyProductionTime);
                } else {
                    if (productionTimeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.productionTime = null;
                    }
                }
            }
            {
                Boolean totalConsumptionTimeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.totalConsumptionTime!= null));
                if (totalConsumptionTimeShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceTotalConsumptionTime;
                    sourceTotalConsumptionTime = this.getTotalConsumptionTime();
                    ElementTagType copyTotalConsumptionTime = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "totalConsumptionTime", sourceTotalConsumptionTime), sourceTotalConsumptionTime, (this.totalConsumptionTime!= null)));
                    copy.setTotalConsumptionTime(copyTotalConsumptionTime);
                } else {
                    if (totalConsumptionTimeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.totalConsumptionTime = null;
                    }
                }
            }
            {
                Boolean totalProductionTimeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.totalProductionTime!= null));
                if (totalProductionTimeShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceTotalProductionTime;
                    sourceTotalProductionTime = this.getTotalProductionTime();
                    ElementTagType copyTotalProductionTime = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "totalProductionTime", sourceTotalProductionTime), sourceTotalProductionTime, (this.totalProductionTime!= null)));
                    copy.setTotalProductionTime(copyTotalProductionTime);
                } else {
                    if (totalProductionTimeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.totalProductionTime = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new ElectricalConnectionStateDataElementsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ElectricalConnectionStateDataElementsType that = ((ElectricalConnectionStateDataElementsType) object);
        {
            ElementTagType leftElectricalConnectionId;
            leftElectricalConnectionId = this.getElectricalConnectionId();
            ElementTagType rightElectricalConnectionId;
            rightElectricalConnectionId = that.getElectricalConnectionId();
            if (this.electricalConnectionId!= null) {
                if (that.electricalConnectionId!= null) {
                    if (!leftElectricalConnectionId.equals(rightElectricalConnectionId)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.electricalConnectionId!= null) {
                    return false;
                }
            }
        }
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
            ElementTagType leftCurrentEnergyMode;
            leftCurrentEnergyMode = this.getCurrentEnergyMode();
            ElementTagType rightCurrentEnergyMode;
            rightCurrentEnergyMode = that.getCurrentEnergyMode();
            if (this.currentEnergyMode!= null) {
                if (that.currentEnergyMode!= null) {
                    if (!leftCurrentEnergyMode.equals(rightCurrentEnergyMode)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.currentEnergyMode!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftConsumptionTime;
            leftConsumptionTime = this.getConsumptionTime();
            ElementTagType rightConsumptionTime;
            rightConsumptionTime = that.getConsumptionTime();
            if (this.consumptionTime!= null) {
                if (that.consumptionTime!= null) {
                    if (!leftConsumptionTime.equals(rightConsumptionTime)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.consumptionTime!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftProductionTime;
            leftProductionTime = this.getProductionTime();
            ElementTagType rightProductionTime;
            rightProductionTime = that.getProductionTime();
            if (this.productionTime!= null) {
                if (that.productionTime!= null) {
                    if (!leftProductionTime.equals(rightProductionTime)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.productionTime!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftTotalConsumptionTime;
            leftTotalConsumptionTime = this.getTotalConsumptionTime();
            ElementTagType rightTotalConsumptionTime;
            rightTotalConsumptionTime = that.getTotalConsumptionTime();
            if (this.totalConsumptionTime!= null) {
                if (that.totalConsumptionTime!= null) {
                    if (!leftTotalConsumptionTime.equals(rightTotalConsumptionTime)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.totalConsumptionTime!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftTotalProductionTime;
            leftTotalProductionTime = this.getTotalProductionTime();
            ElementTagType rightTotalProductionTime;
            rightTotalProductionTime = that.getTotalProductionTime();
            if (this.totalProductionTime!= null) {
                if (that.totalProductionTime!= null) {
                    if (!leftTotalProductionTime.equals(rightTotalProductionTime)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.totalProductionTime!= null) {
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
            ElementTagType theElectricalConnectionId;
            theElectricalConnectionId = this.getElectricalConnectionId();
            if (this.electricalConnectionId!= null) {
                currentHashCode += theElectricalConnectionId.hashCode();
            }
        }
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
            ElementTagType theCurrentEnergyMode;
            theCurrentEnergyMode = this.getCurrentEnergyMode();
            if (this.currentEnergyMode!= null) {
                currentHashCode += theCurrentEnergyMode.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theConsumptionTime;
            theConsumptionTime = this.getConsumptionTime();
            if (this.consumptionTime!= null) {
                currentHashCode += theConsumptionTime.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theProductionTime;
            theProductionTime = this.getProductionTime();
            if (this.productionTime!= null) {
                currentHashCode += theProductionTime.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theTotalConsumptionTime;
            theTotalConsumptionTime = this.getTotalConsumptionTime();
            if (this.totalConsumptionTime!= null) {
                currentHashCode += theTotalConsumptionTime.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theTotalProductionTime;
            theTotalProductionTime = this.getTotalProductionTime();
            if (this.totalProductionTime!= null) {
                currentHashCode += theTotalProductionTime.hashCode();
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
            ElementTagType theElectricalConnectionId;
            theElectricalConnectionId = this.getElectricalConnectionId();
            strategy.appendField(locator, this, "electricalConnectionId", buffer, theElectricalConnectionId, (this.electricalConnectionId!= null));
        }
        {
            ElementTagType theTimestamp;
            theTimestamp = this.getTimestamp();
            strategy.appendField(locator, this, "timestamp", buffer, theTimestamp, (this.timestamp!= null));
        }
        {
            ElementTagType theCurrentEnergyMode;
            theCurrentEnergyMode = this.getCurrentEnergyMode();
            strategy.appendField(locator, this, "currentEnergyMode", buffer, theCurrentEnergyMode, (this.currentEnergyMode!= null));
        }
        {
            ElementTagType theConsumptionTime;
            theConsumptionTime = this.getConsumptionTime();
            strategy.appendField(locator, this, "consumptionTime", buffer, theConsumptionTime, (this.consumptionTime!= null));
        }
        {
            ElementTagType theProductionTime;
            theProductionTime = this.getProductionTime();
            strategy.appendField(locator, this, "productionTime", buffer, theProductionTime, (this.productionTime!= null));
        }
        {
            ElementTagType theTotalConsumptionTime;
            theTotalConsumptionTime = this.getTotalConsumptionTime();
            strategy.appendField(locator, this, "totalConsumptionTime", buffer, theTotalConsumptionTime, (this.totalConsumptionTime!= null));
        }
        {
            ElementTagType theTotalProductionTime;
            theTotalProductionTime = this.getTotalProductionTime();
            strategy.appendField(locator, this, "totalProductionTime", buffer, theTotalProductionTime, (this.totalProductionTime!= null));
        }
        return buffer;
    }

}
