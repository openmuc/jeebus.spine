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
 * <p>Java class for SupplyConditionDataElementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SupplyConditionDataElementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="conditionId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="timestamp" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="eventType" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="originator" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="thresholdId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="thresholdPercentage" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberElementsType" minOccurs="0"/&gt;
 *         &lt;element name="relevantPeriod" type="{http://docs.eebus.org/spine/xsd/v1}TimePeriodElementsType" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="gridCondition" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupplyConditionDataElementsType", propOrder = {
    "conditionId",
    "timestamp",
    "eventType",
    "originator",
    "thresholdId",
    "thresholdPercentage",
    "relevantPeriod",
    "description",
    "gridCondition"
})
public class SupplyConditionDataElementsType implements Cloneable, CopyTo, ToString
{

    protected ElementTagType conditionId;
    protected ElementTagType timestamp;
    protected ElementTagType eventType;
    protected ElementTagType originator;
    protected ElementTagType thresholdId;
    protected ScaledNumberElementsType thresholdPercentage;
    protected TimePeriodElementsType relevantPeriod;
    protected ElementTagType description;
    protected ElementTagType gridCondition;

    /**
     * Default no-arg constructor
     * 
     */
    public SupplyConditionDataElementsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public SupplyConditionDataElementsType(final ElementTagType conditionId, final ElementTagType timestamp, final ElementTagType eventType, final ElementTagType originator, final ElementTagType thresholdId, final ScaledNumberElementsType thresholdPercentage, final TimePeriodElementsType relevantPeriod, final ElementTagType description, final ElementTagType gridCondition) {
        this.conditionId = conditionId;
        this.timestamp = timestamp;
        this.eventType = eventType;
        this.originator = originator;
        this.thresholdId = thresholdId;
        this.thresholdPercentage = thresholdPercentage;
        this.relevantPeriod = relevantPeriod;
        this.description = description;
        this.gridCondition = gridCondition;
    }

    /**
     * Gets the value of the conditionId property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getConditionId() {
        return conditionId;
    }

    /**
     * Sets the value of the conditionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setConditionId(ElementTagType value) {
        this.conditionId = value;
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
     * Gets the value of the eventType property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getEventType() {
        return eventType;
    }

    /**
     * Sets the value of the eventType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setEventType(ElementTagType value) {
        this.eventType = value;
    }

    /**
     * Gets the value of the originator property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getOriginator() {
        return originator;
    }

    /**
     * Sets the value of the originator property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setOriginator(ElementTagType value) {
        this.originator = value;
    }

    /**
     * Gets the value of the thresholdId property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getThresholdId() {
        return thresholdId;
    }

    /**
     * Sets the value of the thresholdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setThresholdId(ElementTagType value) {
        this.thresholdId = value;
    }

    /**
     * Gets the value of the thresholdPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link ScaledNumberElementsType }
     *     
     */
    public ScaledNumberElementsType getThresholdPercentage() {
        return thresholdPercentage;
    }

    /**
     * Sets the value of the thresholdPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberElementsType }
     *     
     */
    public void setThresholdPercentage(ScaledNumberElementsType value) {
        this.thresholdPercentage = value;
    }

    /**
     * Gets the value of the relevantPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodElementsType }
     *     
     */
    public TimePeriodElementsType getRelevantPeriod() {
        return relevantPeriod;
    }

    /**
     * Sets the value of the relevantPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodElementsType }
     *     
     */
    public void setRelevantPeriod(TimePeriodElementsType value) {
        this.relevantPeriod = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setDescription(ElementTagType value) {
        this.description = value;
    }

    /**
     * Gets the value of the gridCondition property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getGridCondition() {
        return gridCondition;
    }

    /**
     * Sets the value of the gridCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setGridCondition(ElementTagType value) {
        this.gridCondition = value;
    }

    /**
     * Sets the value of the conditionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public SupplyConditionDataElementsType withConditionId(ElementTagType value) {
        setConditionId(value);
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
    public SupplyConditionDataElementsType withTimestamp(ElementTagType value) {
        setTimestamp(value);
        return this;
    }

    /**
     * Sets the value of the eventType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public SupplyConditionDataElementsType withEventType(ElementTagType value) {
        setEventType(value);
        return this;
    }

    /**
     * Sets the value of the originator property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public SupplyConditionDataElementsType withOriginator(ElementTagType value) {
        setOriginator(value);
        return this;
    }

    /**
     * Sets the value of the thresholdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public SupplyConditionDataElementsType withThresholdId(ElementTagType value) {
        setThresholdId(value);
        return this;
    }

    /**
     * Sets the value of the thresholdPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberElementsType }
     * @return
     *     The class instance
     */
    public SupplyConditionDataElementsType withThresholdPercentage(ScaledNumberElementsType value) {
        setThresholdPercentage(value);
        return this;
    }

    /**
     * Sets the value of the relevantPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodElementsType }
     * @return
     *     The class instance
     */
    public SupplyConditionDataElementsType withRelevantPeriod(TimePeriodElementsType value) {
        setRelevantPeriod(value);
        return this;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public SupplyConditionDataElementsType withDescription(ElementTagType value) {
        setDescription(value);
        return this;
    }

    /**
     * Sets the value of the gridCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public SupplyConditionDataElementsType withGridCondition(ElementTagType value) {
        setGridCondition(value);
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
        if (draftCopy instanceof SupplyConditionDataElementsType) {
            final SupplyConditionDataElementsType copy = ((SupplyConditionDataElementsType) draftCopy);
            {
                Boolean conditionIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.conditionId!= null));
                if (conditionIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceConditionId;
                    sourceConditionId = this.getConditionId();
                    ElementTagType copyConditionId = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "conditionId", sourceConditionId), sourceConditionId, (this.conditionId!= null)));
                    copy.setConditionId(copyConditionId);
                } else {
                    if (conditionIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.conditionId = null;
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
                Boolean eventTypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.eventType!= null));
                if (eventTypeShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceEventType;
                    sourceEventType = this.getEventType();
                    ElementTagType copyEventType = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "eventType", sourceEventType), sourceEventType, (this.eventType!= null)));
                    copy.setEventType(copyEventType);
                } else {
                    if (eventTypeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.eventType = null;
                    }
                }
            }
            {
                Boolean originatorShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.originator!= null));
                if (originatorShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceOriginator;
                    sourceOriginator = this.getOriginator();
                    ElementTagType copyOriginator = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "originator", sourceOriginator), sourceOriginator, (this.originator!= null)));
                    copy.setOriginator(copyOriginator);
                } else {
                    if (originatorShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.originator = null;
                    }
                }
            }
            {
                Boolean thresholdIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.thresholdId!= null));
                if (thresholdIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceThresholdId;
                    sourceThresholdId = this.getThresholdId();
                    ElementTagType copyThresholdId = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "thresholdId", sourceThresholdId), sourceThresholdId, (this.thresholdId!= null)));
                    copy.setThresholdId(copyThresholdId);
                } else {
                    if (thresholdIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.thresholdId = null;
                    }
                }
            }
            {
                Boolean thresholdPercentageShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.thresholdPercentage!= null));
                if (thresholdPercentageShouldBeCopiedAndSet == Boolean.TRUE) {
                    ScaledNumberElementsType sourceThresholdPercentage;
                    sourceThresholdPercentage = this.getThresholdPercentage();
                    ScaledNumberElementsType copyThresholdPercentage = ((ScaledNumberElementsType) strategy.copy(LocatorUtils.property(locator, "thresholdPercentage", sourceThresholdPercentage), sourceThresholdPercentage, (this.thresholdPercentage!= null)));
                    copy.setThresholdPercentage(copyThresholdPercentage);
                } else {
                    if (thresholdPercentageShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.thresholdPercentage = null;
                    }
                }
            }
            {
                Boolean relevantPeriodShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.relevantPeriod!= null));
                if (relevantPeriodShouldBeCopiedAndSet == Boolean.TRUE) {
                    TimePeriodElementsType sourceRelevantPeriod;
                    sourceRelevantPeriod = this.getRelevantPeriod();
                    TimePeriodElementsType copyRelevantPeriod = ((TimePeriodElementsType) strategy.copy(LocatorUtils.property(locator, "relevantPeriod", sourceRelevantPeriod), sourceRelevantPeriod, (this.relevantPeriod!= null)));
                    copy.setRelevantPeriod(copyRelevantPeriod);
                } else {
                    if (relevantPeriodShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.relevantPeriod = null;
                    }
                }
            }
            {
                Boolean descriptionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.description!= null));
                if (descriptionShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceDescription;
                    sourceDescription = this.getDescription();
                    ElementTagType copyDescription = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "description", sourceDescription), sourceDescription, (this.description!= null)));
                    copy.setDescription(copyDescription);
                } else {
                    if (descriptionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.description = null;
                    }
                }
            }
            {
                Boolean gridConditionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.gridCondition!= null));
                if (gridConditionShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceGridCondition;
                    sourceGridCondition = this.getGridCondition();
                    ElementTagType copyGridCondition = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "gridCondition", sourceGridCondition), sourceGridCondition, (this.gridCondition!= null)));
                    copy.setGridCondition(copyGridCondition);
                } else {
                    if (gridConditionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.gridCondition = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new SupplyConditionDataElementsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final SupplyConditionDataElementsType that = ((SupplyConditionDataElementsType) object);
        {
            ElementTagType leftConditionId;
            leftConditionId = this.getConditionId();
            ElementTagType rightConditionId;
            rightConditionId = that.getConditionId();
            if (this.conditionId!= null) {
                if (that.conditionId!= null) {
                    if (!leftConditionId.equals(rightConditionId)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.conditionId!= null) {
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
            ElementTagType leftEventType;
            leftEventType = this.getEventType();
            ElementTagType rightEventType;
            rightEventType = that.getEventType();
            if (this.eventType!= null) {
                if (that.eventType!= null) {
                    if (!leftEventType.equals(rightEventType)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.eventType!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftOriginator;
            leftOriginator = this.getOriginator();
            ElementTagType rightOriginator;
            rightOriginator = that.getOriginator();
            if (this.originator!= null) {
                if (that.originator!= null) {
                    if (!leftOriginator.equals(rightOriginator)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.originator!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftThresholdId;
            leftThresholdId = this.getThresholdId();
            ElementTagType rightThresholdId;
            rightThresholdId = that.getThresholdId();
            if (this.thresholdId!= null) {
                if (that.thresholdId!= null) {
                    if (!leftThresholdId.equals(rightThresholdId)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.thresholdId!= null) {
                    return false;
                }
            }
        }
        {
            ScaledNumberElementsType leftThresholdPercentage;
            leftThresholdPercentage = this.getThresholdPercentage();
            ScaledNumberElementsType rightThresholdPercentage;
            rightThresholdPercentage = that.getThresholdPercentage();
            if (this.thresholdPercentage!= null) {
                if (that.thresholdPercentage!= null) {
                    if (!leftThresholdPercentage.equals(rightThresholdPercentage)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.thresholdPercentage!= null) {
                    return false;
                }
            }
        }
        {
            TimePeriodElementsType leftRelevantPeriod;
            leftRelevantPeriod = this.getRelevantPeriod();
            TimePeriodElementsType rightRelevantPeriod;
            rightRelevantPeriod = that.getRelevantPeriod();
            if (this.relevantPeriod!= null) {
                if (that.relevantPeriod!= null) {
                    if (!leftRelevantPeriod.equals(rightRelevantPeriod)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.relevantPeriod!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftDescription;
            leftDescription = this.getDescription();
            ElementTagType rightDescription;
            rightDescription = that.getDescription();
            if (this.description!= null) {
                if (that.description!= null) {
                    if (!leftDescription.equals(rightDescription)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.description!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftGridCondition;
            leftGridCondition = this.getGridCondition();
            ElementTagType rightGridCondition;
            rightGridCondition = that.getGridCondition();
            if (this.gridCondition!= null) {
                if (that.gridCondition!= null) {
                    if (!leftGridCondition.equals(rightGridCondition)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.gridCondition!= null) {
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
            ElementTagType theConditionId;
            theConditionId = this.getConditionId();
            if (this.conditionId!= null) {
                currentHashCode += theConditionId.hashCode();
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
            ElementTagType theEventType;
            theEventType = this.getEventType();
            if (this.eventType!= null) {
                currentHashCode += theEventType.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theOriginator;
            theOriginator = this.getOriginator();
            if (this.originator!= null) {
                currentHashCode += theOriginator.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theThresholdId;
            theThresholdId = this.getThresholdId();
            if (this.thresholdId!= null) {
                currentHashCode += theThresholdId.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ScaledNumberElementsType theThresholdPercentage;
            theThresholdPercentage = this.getThresholdPercentage();
            if (this.thresholdPercentage!= null) {
                currentHashCode += theThresholdPercentage.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            TimePeriodElementsType theRelevantPeriod;
            theRelevantPeriod = this.getRelevantPeriod();
            if (this.relevantPeriod!= null) {
                currentHashCode += theRelevantPeriod.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theDescription;
            theDescription = this.getDescription();
            if (this.description!= null) {
                currentHashCode += theDescription.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theGridCondition;
            theGridCondition = this.getGridCondition();
            if (this.gridCondition!= null) {
                currentHashCode += theGridCondition.hashCode();
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
            ElementTagType theConditionId;
            theConditionId = this.getConditionId();
            strategy.appendField(locator, this, "conditionId", buffer, theConditionId, (this.conditionId!= null));
        }
        {
            ElementTagType theTimestamp;
            theTimestamp = this.getTimestamp();
            strategy.appendField(locator, this, "timestamp", buffer, theTimestamp, (this.timestamp!= null));
        }
        {
            ElementTagType theEventType;
            theEventType = this.getEventType();
            strategy.appendField(locator, this, "eventType", buffer, theEventType, (this.eventType!= null));
        }
        {
            ElementTagType theOriginator;
            theOriginator = this.getOriginator();
            strategy.appendField(locator, this, "originator", buffer, theOriginator, (this.originator!= null));
        }
        {
            ElementTagType theThresholdId;
            theThresholdId = this.getThresholdId();
            strategy.appendField(locator, this, "thresholdId", buffer, theThresholdId, (this.thresholdId!= null));
        }
        {
            ScaledNumberElementsType theThresholdPercentage;
            theThresholdPercentage = this.getThresholdPercentage();
            strategy.appendField(locator, this, "thresholdPercentage", buffer, theThresholdPercentage, (this.thresholdPercentage!= null));
        }
        {
            TimePeriodElementsType theRelevantPeriod;
            theRelevantPeriod = this.getRelevantPeriod();
            strategy.appendField(locator, this, "relevantPeriod", buffer, theRelevantPeriod, (this.relevantPeriod!= null));
        }
        {
            ElementTagType theDescription;
            theDescription = this.getDescription();
            strategy.appendField(locator, this, "description", buffer, theDescription, (this.description!= null));
        }
        {
            ElementTagType theGridCondition;
            theGridCondition = this.getGridCondition();
            strategy.appendField(locator, this, "gridCondition", buffer, theGridCondition, (this.gridCondition!= null));
        }
        return buffer;
    }

}
