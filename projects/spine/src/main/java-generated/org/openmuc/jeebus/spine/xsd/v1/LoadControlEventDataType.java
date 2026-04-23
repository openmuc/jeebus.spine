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
 * <p>Java class for LoadControlEventDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoadControlEventDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="timestamp" type="{http://docs.eebus.org/spine/xsd/v1}AbsoluteOrRelativeTimeType" minOccurs="0"/&gt;
 *         &lt;element name="eventId" type="{http://docs.eebus.org/spine/xsd/v1}LoadControlEventIdType" minOccurs="0"/&gt;
 *         &lt;element name="eventActionConsume" type="{http://docs.eebus.org/spine/xsd/v1}LoadControlEventActionType" minOccurs="0"/&gt;
 *         &lt;element name="eventActionProduce" type="{http://docs.eebus.org/spine/xsd/v1}LoadControlEventActionType" minOccurs="0"/&gt;
 *         &lt;element name="timePeriod" type="{http://docs.eebus.org/spine/xsd/v1}TimePeriodType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoadControlEventDataType", propOrder = {
    "timestamp",
    "eventId",
    "eventActionConsume",
    "eventActionProduce",
    "timePeriod"
})
public class LoadControlEventDataType implements Cloneable, CopyTo, ToString
{

    protected String timestamp;
    @XmlSchemaType(name = "unsignedInt")
    protected Long eventId;
    protected String eventActionConsume;
    protected String eventActionProduce;
    protected TimePeriodType timePeriod;

    /**
     * Default no-arg constructor
     * 
     */
    public LoadControlEventDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public LoadControlEventDataType(final String timestamp, final Long eventId, final String eventActionConsume, final String eventActionProduce, final TimePeriodType timePeriod) {
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
     * Gets the value of the eventId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEventId() {
        return eventId;
    }

    /**
     * Sets the value of the eventId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEventId(Long value) {
        this.eventId = value;
    }

    /**
     * Gets the value of the eventActionConsume property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventActionConsume() {
        return eventActionConsume;
    }

    /**
     * Sets the value of the eventActionConsume property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventActionConsume(String value) {
        this.eventActionConsume = value;
    }

    /**
     * Gets the value of the eventActionProduce property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventActionProduce() {
        return eventActionProduce;
    }

    /**
     * Sets the value of the eventActionProduce property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventActionProduce(String value) {
        this.eventActionProduce = value;
    }

    /**
     * Gets the value of the timePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodType }
     *     
     */
    public TimePeriodType getTimePeriod() {
        return timePeriod;
    }

    /**
     * Sets the value of the timePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodType }
     *     
     */
    public void setTimePeriod(TimePeriodType value) {
        this.timePeriod = value;
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
    public LoadControlEventDataType withTimestamp(String value) {
        setTimestamp(value);
        return this;
    }

    /**
     * Sets the value of the eventId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     * @return
     *     The class instance
     */
    public LoadControlEventDataType withEventId(Long value) {
        setEventId(value);
        return this;
    }

    /**
     * Sets the value of the eventActionConsume property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public LoadControlEventDataType withEventActionConsume(String value) {
        setEventActionConsume(value);
        return this;
    }

    /**
     * Sets the value of the eventActionProduce property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public LoadControlEventDataType withEventActionProduce(String value) {
        setEventActionProduce(value);
        return this;
    }

    /**
     * Sets the value of the timePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodType }
     * @return
     *     The class instance
     */
    public LoadControlEventDataType withTimePeriod(TimePeriodType value) {
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
        if (draftCopy instanceof LoadControlEventDataType) {
            final LoadControlEventDataType copy = ((LoadControlEventDataType) draftCopy);
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
                Boolean eventIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.eventId!= null));
                if (eventIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceEventId;
                    sourceEventId = this.getEventId();
                    Long copyEventId = ((Long) strategy.copy(LocatorUtils.property(locator, "eventId", sourceEventId), sourceEventId, (this.eventId!= null)));
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
                    String sourceEventActionConsume;
                    sourceEventActionConsume = this.getEventActionConsume();
                    String copyEventActionConsume = ((String) strategy.copy(LocatorUtils.property(locator, "eventActionConsume", sourceEventActionConsume), sourceEventActionConsume, (this.eventActionConsume!= null)));
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
                    String sourceEventActionProduce;
                    sourceEventActionProduce = this.getEventActionProduce();
                    String copyEventActionProduce = ((String) strategy.copy(LocatorUtils.property(locator, "eventActionProduce", sourceEventActionProduce), sourceEventActionProduce, (this.eventActionProduce!= null)));
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
                    TimePeriodType sourceTimePeriod;
                    sourceTimePeriod = this.getTimePeriod();
                    TimePeriodType copyTimePeriod = ((TimePeriodType) strategy.copy(LocatorUtils.property(locator, "timePeriod", sourceTimePeriod), sourceTimePeriod, (this.timePeriod!= null)));
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
        return new LoadControlEventDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final LoadControlEventDataType that = ((LoadControlEventDataType) object);
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
            Long leftEventId;
            leftEventId = this.getEventId();
            Long rightEventId;
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
            String leftEventActionConsume;
            leftEventActionConsume = this.getEventActionConsume();
            String rightEventActionConsume;
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
            String leftEventActionProduce;
            leftEventActionProduce = this.getEventActionProduce();
            String rightEventActionProduce;
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
            TimePeriodType leftTimePeriod;
            leftTimePeriod = this.getTimePeriod();
            TimePeriodType rightTimePeriod;
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
            String theTimestamp;
            theTimestamp = this.getTimestamp();
            if (this.timestamp!= null) {
                currentHashCode += theTimestamp.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            Long theEventId;
            theEventId = this.getEventId();
            if (this.eventId!= null) {
                currentHashCode += theEventId.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String theEventActionConsume;
            theEventActionConsume = this.getEventActionConsume();
            if (this.eventActionConsume!= null) {
                currentHashCode += theEventActionConsume.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String theEventActionProduce;
            theEventActionProduce = this.getEventActionProduce();
            if (this.eventActionProduce!= null) {
                currentHashCode += theEventActionProduce.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            TimePeriodType theTimePeriod;
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
            String theTimestamp;
            theTimestamp = this.getTimestamp();
            strategy.appendField(locator, this, "timestamp", buffer, theTimestamp, (this.timestamp!= null));
        }
        {
            Long theEventId;
            theEventId = this.getEventId();
            strategy.appendField(locator, this, "eventId", buffer, theEventId, (this.eventId!= null));
        }
        {
            String theEventActionConsume;
            theEventActionConsume = this.getEventActionConsume();
            strategy.appendField(locator, this, "eventActionConsume", buffer, theEventActionConsume, (this.eventActionConsume!= null));
        }
        {
            String theEventActionProduce;
            theEventActionProduce = this.getEventActionProduce();
            strategy.appendField(locator, this, "eventActionProduce", buffer, theEventActionProduce, (this.eventActionProduce!= null));
        }
        {
            TimePeriodType theTimePeriod;
            theTimePeriod = this.getTimePeriod();
            strategy.appendField(locator, this, "timePeriod", buffer, theTimePeriod, (this.timePeriod!= null));
        }
        return buffer;
    }

}
