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
 * <p>Java class for LoadControlEventDataElementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoadControlEventDataElementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="timestamp" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="eventId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="eventActionConsume" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="eventActionProduce" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="timePeriod" type="{http://docs.eebus.org/spine/xsd/v1}TimePeriodElementsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoadControlEventDataElementsType", propOrder = {
    "timestamp",
    "eventId",
    "eventActionConsume",
    "eventActionProduce",
    "timePeriod"
})
public class LoadControlEventDataElementsType implements Cloneable, CopyTo, ToString
{

    protected ElementTagType timestamp;
    protected ElementTagType eventId;
    protected ElementTagType eventActionConsume;
    protected ElementTagType eventActionProduce;
    protected TimePeriodElementsType timePeriod;

    /**
     * Default no-arg constructor
     * 
     */
    public LoadControlEventDataElementsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public LoadControlEventDataElementsType(final ElementTagType timestamp, final ElementTagType eventId, final ElementTagType eventActionConsume, final ElementTagType eventActionProduce, final TimePeriodElementsType timePeriod) {
        this.timestamp = timestamp;
        this.eventId = eventId;
        this.eventActionConsume = eventActionConsume;
        this.eventActionProduce = eventActionProduce;
        this.timePeriod = timePeriod;
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
     * Gets the value of the eventId property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getEventId() {
        return eventId;
    }

    /**
     * Sets the value of the eventId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setEventId(ElementTagType value) {
        this.eventId = value;
    }

    /**
     * Gets the value of the eventActionConsume property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getEventActionConsume() {
        return eventActionConsume;
    }

    /**
     * Sets the value of the eventActionConsume property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setEventActionConsume(ElementTagType value) {
        this.eventActionConsume = value;
    }

    /**
     * Gets the value of the eventActionProduce property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getEventActionProduce() {
        return eventActionProduce;
    }

    /**
     * Sets the value of the eventActionProduce property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setEventActionProduce(ElementTagType value) {
        this.eventActionProduce = value;
    }

    /**
     * Gets the value of the timePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodElementsType }
     *     
     */
    public TimePeriodElementsType getTimePeriod() {
        return timePeriod;
    }

    /**
     * Sets the value of the timePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodElementsType }
     *     
     */
    public void setTimePeriod(TimePeriodElementsType value) {
        this.timePeriod = value;
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
    public LoadControlEventDataElementsType withTimestamp(ElementTagType value) {
        setTimestamp(value);
        return this;
    }

    /**
     * Sets the value of the eventId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public LoadControlEventDataElementsType withEventId(ElementTagType value) {
        setEventId(value);
        return this;
    }

    /**
     * Sets the value of the eventActionConsume property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public LoadControlEventDataElementsType withEventActionConsume(ElementTagType value) {
        setEventActionConsume(value);
        return this;
    }

    /**
     * Sets the value of the eventActionProduce property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public LoadControlEventDataElementsType withEventActionProduce(ElementTagType value) {
        setEventActionProduce(value);
        return this;
    }

    /**
     * Sets the value of the timePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodElementsType }
     * @return
     *     The class instance
     */
    public LoadControlEventDataElementsType withTimePeriod(TimePeriodElementsType value) {
        setTimePeriod(value);
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
        if (draftCopy instanceof LoadControlEventDataElementsType) {
            final LoadControlEventDataElementsType copy = ((LoadControlEventDataElementsType) draftCopy);
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
                Boolean eventIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.eventId!= null));
                if (eventIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceEventId;
                    sourceEventId = this.getEventId();
                    ElementTagType copyEventId = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "eventId", sourceEventId), sourceEventId, (this.eventId!= null)));
                    copy.setEventId(copyEventId);
                } else {
                    if (eventIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.eventId = null;
                    }
                }
            }
            {
                Boolean eventActionConsumeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.eventActionConsume!= null));
                if (eventActionConsumeShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceEventActionConsume;
                    sourceEventActionConsume = this.getEventActionConsume();
                    ElementTagType copyEventActionConsume = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "eventActionConsume", sourceEventActionConsume), sourceEventActionConsume, (this.eventActionConsume!= null)));
                    copy.setEventActionConsume(copyEventActionConsume);
                } else {
                    if (eventActionConsumeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.eventActionConsume = null;
                    }
                }
            }
            {
                Boolean eventActionProduceShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.eventActionProduce!= null));
                if (eventActionProduceShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceEventActionProduce;
                    sourceEventActionProduce = this.getEventActionProduce();
                    ElementTagType copyEventActionProduce = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "eventActionProduce", sourceEventActionProduce), sourceEventActionProduce, (this.eventActionProduce!= null)));
                    copy.setEventActionProduce(copyEventActionProduce);
                } else {
                    if (eventActionProduceShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.eventActionProduce = null;
                    }
                }
            }
            {
                Boolean timePeriodShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.timePeriod!= null));
                if (timePeriodShouldBeCopiedAndSet == Boolean.TRUE) {
                    TimePeriodElementsType sourceTimePeriod;
                    sourceTimePeriod = this.getTimePeriod();
                    TimePeriodElementsType copyTimePeriod = ((TimePeriodElementsType) strategy.copy(LocatorUtils.property(locator, "timePeriod", sourceTimePeriod), sourceTimePeriod, (this.timePeriod!= null)));
                    copy.setTimePeriod(copyTimePeriod);
                } else {
                    if (timePeriodShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.timePeriod = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new LoadControlEventDataElementsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final LoadControlEventDataElementsType that = ((LoadControlEventDataElementsType) object);
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
            ElementTagType leftEventId;
            leftEventId = this.getEventId();
            ElementTagType rightEventId;
            rightEventId = that.getEventId();
            if (this.eventId!= null) {
                if (that.eventId!= null) {
                    if (!leftEventId.equals(rightEventId)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.eventId!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftEventActionConsume;
            leftEventActionConsume = this.getEventActionConsume();
            ElementTagType rightEventActionConsume;
            rightEventActionConsume = that.getEventActionConsume();
            if (this.eventActionConsume!= null) {
                if (that.eventActionConsume!= null) {
                    if (!leftEventActionConsume.equals(rightEventActionConsume)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.eventActionConsume!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftEventActionProduce;
            leftEventActionProduce = this.getEventActionProduce();
            ElementTagType rightEventActionProduce;
            rightEventActionProduce = that.getEventActionProduce();
            if (this.eventActionProduce!= null) {
                if (that.eventActionProduce!= null) {
                    if (!leftEventActionProduce.equals(rightEventActionProduce)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.eventActionProduce!= null) {
                    return false;
                }
            }
        }
        {
            TimePeriodElementsType leftTimePeriod;
            leftTimePeriod = this.getTimePeriod();
            TimePeriodElementsType rightTimePeriod;
            rightTimePeriod = that.getTimePeriod();
            if (this.timePeriod!= null) {
                if (that.timePeriod!= null) {
                    if (!leftTimePeriod.equals(rightTimePeriod)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.timePeriod!= null) {
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
            ElementTagType theEventId;
            theEventId = this.getEventId();
            if (this.eventId!= null) {
                currentHashCode += theEventId.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theEventActionConsume;
            theEventActionConsume = this.getEventActionConsume();
            if (this.eventActionConsume!= null) {
                currentHashCode += theEventActionConsume.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theEventActionProduce;
            theEventActionProduce = this.getEventActionProduce();
            if (this.eventActionProduce!= null) {
                currentHashCode += theEventActionProduce.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            TimePeriodElementsType theTimePeriod;
            theTimePeriod = this.getTimePeriod();
            if (this.timePeriod!= null) {
                currentHashCode += theTimePeriod.hashCode();
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
            ElementTagType theEventId;
            theEventId = this.getEventId();
            strategy.appendField(locator, this, "eventId", buffer, theEventId, (this.eventId!= null));
        }
        {
            ElementTagType theEventActionConsume;
            theEventActionConsume = this.getEventActionConsume();
            strategy.appendField(locator, this, "eventActionConsume", buffer, theEventActionConsume, (this.eventActionConsume!= null));
        }
        {
            ElementTagType theEventActionProduce;
            theEventActionProduce = this.getEventActionProduce();
            strategy.appendField(locator, this, "eventActionProduce", buffer, theEventActionProduce, (this.eventActionProduce!= null));
        }
        {
            TimePeriodElementsType theTimePeriod;
            theTimePeriod = this.getTimePeriod();
            strategy.appendField(locator, this, "timePeriod", buffer, theTimePeriod, (this.timePeriod!= null));
        }
        return buffer;
    }

}
