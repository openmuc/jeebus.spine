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
import jakarta.xml.bind.annotation.XmlSchemaType;
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
 * <p>Java class for ElectricalConnectionStateDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElectricalConnectionStateDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="electricalConnectionId" type="{http://docs.eebus.org/spine/xsd/v1}ElectricalConnectionIdType" minOccurs="0"/&gt;
 *         &lt;element name="timestamp" type="{http://docs.eebus.org/spine/xsd/v1}AbsoluteOrRelativeTimeType" minOccurs="0"/&gt;
 *         &lt;element name="currentEnergyMode" type="{http://docs.eebus.org/spine/xsd/v1}EnergyModeType" minOccurs="0"/&gt;
 *         &lt;element name="consumptionTime" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *         &lt;element name="productionTime" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *         &lt;element name="totalConsumptionTime" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *         &lt;element name="totalProductionTime" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElectricalConnectionStateDataType", propOrder = {
    "electricalConnectionId",
    "timestamp",
    "currentEnergyMode",
    "consumptionTime",
    "productionTime",
    "totalConsumptionTime",
    "totalProductionTime"
})
public class ElectricalConnectionStateDataType implements Cloneable, CopyTo, ToString
{

    @XmlSchemaType(name = "unsignedInt")
    protected Long electricalConnectionId;
    protected String timestamp;
    protected String currentEnergyMode;
    protected Duration consumptionTime;
    protected Duration productionTime;
    protected Duration totalConsumptionTime;
    protected Duration totalProductionTime;

    /**
     * Default no-arg constructor
     * 
     */
    public ElectricalConnectionStateDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public ElectricalConnectionStateDataType(final Long electricalConnectionId, final String timestamp, final String currentEnergyMode, final Duration consumptionTime, final Duration productionTime, final Duration totalConsumptionTime, final Duration totalProductionTime) {
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
     *     {@link Long }
     *     
     */
    public Long getElectricalConnectionId() {
        return electricalConnectionId;
    }

    /**
     * Sets the value of the electricalConnectionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setElectricalConnectionId(Long value) {
        this.electricalConnectionId = value;
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
     * Gets the value of the currentEnergyMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentEnergyMode() {
        return currentEnergyMode;
    }

    /**
     * Sets the value of the currentEnergyMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentEnergyMode(String value) {
        this.currentEnergyMode = value;
    }

    /**
     * Gets the value of the consumptionTime property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getConsumptionTime() {
        return consumptionTime;
    }

    /**
     * Sets the value of the consumptionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setConsumptionTime(Duration value) {
        this.consumptionTime = value;
    }

    /**
     * Gets the value of the productionTime property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getProductionTime() {
        return productionTime;
    }

    /**
     * Sets the value of the productionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setProductionTime(Duration value) {
        this.productionTime = value;
    }

    /**
     * Gets the value of the totalConsumptionTime property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getTotalConsumptionTime() {
        return totalConsumptionTime;
    }

    /**
     * Sets the value of the totalConsumptionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setTotalConsumptionTime(Duration value) {
        this.totalConsumptionTime = value;
    }

    /**
     * Gets the value of the totalProductionTime property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getTotalProductionTime() {
        return totalProductionTime;
    }

    /**
     * Sets the value of the totalProductionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setTotalProductionTime(Duration value) {
        this.totalProductionTime = value;
    }

    /**
     * Sets the value of the electricalConnectionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     * @return
     *     The class instance
     */
    public ElectricalConnectionStateDataType withElectricalConnectionId(Long value) {
        setElectricalConnectionId(value);
        return this;
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
    public ElectricalConnectionStateDataType withTimestamp(String value) {
        setTimestamp(value);
        return this;
    }

    /**
     * Sets the value of the currentEnergyMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public ElectricalConnectionStateDataType withCurrentEnergyMode(String value) {
        setCurrentEnergyMode(value);
        return this;
    }

    /**
     * Sets the value of the consumptionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     * @return
     *     The class instance
     */
    public ElectricalConnectionStateDataType withConsumptionTime(Duration value) {
        setConsumptionTime(value);
        return this;
    }

    /**
     * Sets the value of the productionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     * @return
     *     The class instance
     */
    public ElectricalConnectionStateDataType withProductionTime(Duration value) {
        setProductionTime(value);
        return this;
    }

    /**
     * Sets the value of the totalConsumptionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     * @return
     *     The class instance
     */
    public ElectricalConnectionStateDataType withTotalConsumptionTime(Duration value) {
        setTotalConsumptionTime(value);
        return this;
    }

    /**
     * Sets the value of the totalProductionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     * @return
     *     The class instance
     */
    public ElectricalConnectionStateDataType withTotalProductionTime(Duration value) {
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
        if (draftCopy instanceof ElectricalConnectionStateDataType) {
            final ElectricalConnectionStateDataType copy = ((ElectricalConnectionStateDataType) draftCopy);
            {
                Boolean electricalConnectionIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.electricalConnectionId!= null));
                if (electricalConnectionIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceElectricalConnectionId;
                    sourceElectricalConnectionId = this.getElectricalConnectionId();
                    Long copyElectricalConnectionId = ((Long) strategy.copy(LocatorUtils.property(locator, "electricalConnectionId", sourceElectricalConnectionId), sourceElectricalConnectionId, (this.electricalConnectionId!= null)));
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
                Boolean currentEnergyModeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.currentEnergyMode!= null));
                if (currentEnergyModeShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceCurrentEnergyMode;
                    sourceCurrentEnergyMode = this.getCurrentEnergyMode();
                    String copyCurrentEnergyMode = ((String) strategy.copy(LocatorUtils.property(locator, "currentEnergyMode", sourceCurrentEnergyMode), sourceCurrentEnergyMode, (this.currentEnergyMode!= null)));
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
                    Duration sourceConsumptionTime;
                    sourceConsumptionTime = this.getConsumptionTime();
                    Duration copyConsumptionTime = ((Duration) strategy.copy(LocatorUtils.property(locator, "consumptionTime", sourceConsumptionTime), sourceConsumptionTime, (this.consumptionTime!= null)));
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
                    Duration sourceProductionTime;
                    sourceProductionTime = this.getProductionTime();
                    Duration copyProductionTime = ((Duration) strategy.copy(LocatorUtils.property(locator, "productionTime", sourceProductionTime), sourceProductionTime, (this.productionTime!= null)));
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
                    Duration sourceTotalConsumptionTime;
                    sourceTotalConsumptionTime = this.getTotalConsumptionTime();
                    Duration copyTotalConsumptionTime = ((Duration) strategy.copy(LocatorUtils.property(locator, "totalConsumptionTime", sourceTotalConsumptionTime), sourceTotalConsumptionTime, (this.totalConsumptionTime!= null)));
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
                    Duration sourceTotalProductionTime;
                    sourceTotalProductionTime = this.getTotalProductionTime();
                    Duration copyTotalProductionTime = ((Duration) strategy.copy(LocatorUtils.property(locator, "totalProductionTime", sourceTotalProductionTime), sourceTotalProductionTime, (this.totalProductionTime!= null)));
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
        return new ElectricalConnectionStateDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ElectricalConnectionStateDataType that = ((ElectricalConnectionStateDataType) object);
        {
            Long leftElectricalConnectionId;
            leftElectricalConnectionId = this.getElectricalConnectionId();
            Long rightElectricalConnectionId;
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
            String leftCurrentEnergyMode;
            leftCurrentEnergyMode = this.getCurrentEnergyMode();
            String rightCurrentEnergyMode;
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
            Duration leftConsumptionTime;
            leftConsumptionTime = this.getConsumptionTime();
            Duration rightConsumptionTime;
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
            Duration leftProductionTime;
            leftProductionTime = this.getProductionTime();
            Duration rightProductionTime;
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
            Duration leftTotalConsumptionTime;
            leftTotalConsumptionTime = this.getTotalConsumptionTime();
            Duration rightTotalConsumptionTime;
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
            Duration leftTotalProductionTime;
            leftTotalProductionTime = this.getTotalProductionTime();
            Duration rightTotalProductionTime;
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
            Long theElectricalConnectionId;
            theElectricalConnectionId = this.getElectricalConnectionId();
            if (this.electricalConnectionId!= null) {
                currentHashCode += theElectricalConnectionId.hashCode();
            }
        }
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
            String theCurrentEnergyMode;
            theCurrentEnergyMode = this.getCurrentEnergyMode();
            if (this.currentEnergyMode!= null) {
                currentHashCode += theCurrentEnergyMode.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            Duration theConsumptionTime;
            theConsumptionTime = this.getConsumptionTime();
            if (this.consumptionTime!= null) {
                currentHashCode += theConsumptionTime.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            Duration theProductionTime;
            theProductionTime = this.getProductionTime();
            if (this.productionTime!= null) {
                currentHashCode += theProductionTime.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            Duration theTotalConsumptionTime;
            theTotalConsumptionTime = this.getTotalConsumptionTime();
            if (this.totalConsumptionTime!= null) {
                currentHashCode += theTotalConsumptionTime.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            Duration theTotalProductionTime;
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
            Long theElectricalConnectionId;
            theElectricalConnectionId = this.getElectricalConnectionId();
            strategy.appendField(locator, this, "electricalConnectionId", buffer, theElectricalConnectionId, (this.electricalConnectionId!= null));
        }
        {
            String theTimestamp;
            theTimestamp = this.getTimestamp();
            strategy.appendField(locator, this, "timestamp", buffer, theTimestamp, (this.timestamp!= null));
        }
        {
            String theCurrentEnergyMode;
            theCurrentEnergyMode = this.getCurrentEnergyMode();
            strategy.appendField(locator, this, "currentEnergyMode", buffer, theCurrentEnergyMode, (this.currentEnergyMode!= null));
        }
        {
            Duration theConsumptionTime;
            theConsumptionTime = this.getConsumptionTime();
            strategy.appendField(locator, this, "consumptionTime", buffer, theConsumptionTime, (this.consumptionTime!= null));
        }
        {
            Duration theProductionTime;
            theProductionTime = this.getProductionTime();
            strategy.appendField(locator, this, "productionTime", buffer, theProductionTime, (this.productionTime!= null));
        }
        {
            Duration theTotalConsumptionTime;
            theTotalConsumptionTime = this.getTotalConsumptionTime();
            strategy.appendField(locator, this, "totalConsumptionTime", buffer, theTotalConsumptionTime, (this.totalConsumptionTime!= null));
        }
        {
            Duration theTotalProductionTime;
            theTotalProductionTime = this.getTotalProductionTime();
            strategy.appendField(locator, this, "totalProductionTime", buffer, theTotalProductionTime, (this.totalProductionTime!= null));
        }
        return buffer;
    }

}
