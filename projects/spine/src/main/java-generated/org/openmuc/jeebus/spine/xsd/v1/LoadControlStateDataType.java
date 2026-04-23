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
 * <p>Java class for LoadControlStateDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoadControlStateDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="timestamp" type="{http://docs.eebus.org/spine/xsd/v1}AbsoluteOrRelativeTimeType" minOccurs="0"/&gt;
 *         &lt;element name="eventId" type="{http://docs.eebus.org/spine/xsd/v1}LoadControlEventIdType" minOccurs="0"/&gt;
 *         &lt;element name="eventStateConsume" type="{http://docs.eebus.org/spine/xsd/v1}LoadControlEventStateType" minOccurs="0"/&gt;
 *         &lt;element name="appliedEventActionConsume" type="{http://docs.eebus.org/spine/xsd/v1}LoadControlEventActionType" minOccurs="0"/&gt;
 *         &lt;element name="eventStateProduce" type="{http://docs.eebus.org/spine/xsd/v1}LoadControlEventStateType" minOccurs="0"/&gt;
 *         &lt;element name="appliedEventActionProduce" type="{http://docs.eebus.org/spine/xsd/v1}LoadControlEventActionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoadControlStateDataType", propOrder = {
    "timestamp",
    "eventId",
    "eventStateConsume",
    "appliedEventActionConsume",
    "eventStateProduce",
    "appliedEventActionProduce"
})
public class LoadControlStateDataType implements Cloneable, CopyTo, ToString
{

    protected String timestamp;
    @XmlSchemaType(name = "unsignedInt")
    protected Long eventId;
    protected String eventStateConsume;
    protected String appliedEventActionConsume;
    protected String eventStateProduce;
    protected String appliedEventActionProduce;

    /**
     * Default no-arg constructor
     * 
     */
    public LoadControlStateDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public LoadControlStateDataType(final String timestamp, final Long eventId, final String eventStateConsume, final String appliedEventActionConsume, final String eventStateProduce, final String appliedEventActionProduce) {
        this.timestamp = timestamp;
        this.eventId = eventId;
        this.eventStateConsume = eventStateConsume;
        this.appliedEventActionConsume = appliedEventActionConsume;
        this.eventStateProduce = eventStateProduce;
        this.appliedEventActionProduce = appliedEventActionProduce;
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
     * Gets the value of the eventStateConsume property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventStateConsume() {
        return eventStateConsume;
    }

    /**
     * Sets the value of the eventStateConsume property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventStateConsume(String value) {
        this.eventStateConsume = value;
    }

    /**
     * Gets the value of the appliedEventActionConsume property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppliedEventActionConsume() {
        return appliedEventActionConsume;
    }

    /**
     * Sets the value of the appliedEventActionConsume property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppliedEventActionConsume(String value) {
        this.appliedEventActionConsume = value;
    }

    /**
     * Gets the value of the eventStateProduce property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventStateProduce() {
        return eventStateProduce;
    }

    /**
     * Sets the value of the eventStateProduce property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventStateProduce(String value) {
        this.eventStateProduce = value;
    }

    /**
     * Gets the value of the appliedEventActionProduce property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppliedEventActionProduce() {
        return appliedEventActionProduce;
    }

    /**
     * Sets the value of the appliedEventActionProduce property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppliedEventActionProduce(String value) {
        this.appliedEventActionProduce = value;
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
    public LoadControlStateDataType withTimestamp(String value) {
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
    public LoadControlStateDataType withEventId(Long value) {
        setEventId(value);
        return this;
    }

    /**
     * Sets the value of the eventStateConsume property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public LoadControlStateDataType withEventStateConsume(String value) {
        setEventStateConsume(value);
        return this;
    }

    /**
     * Sets the value of the appliedEventActionConsume property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public LoadControlStateDataType withAppliedEventActionConsume(String value) {
        setAppliedEventActionConsume(value);
        return this;
    }

    /**
     * Sets the value of the eventStateProduce property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public LoadControlStateDataType withEventStateProduce(String value) {
        setEventStateProduce(value);
        return this;
    }

    /**
     * Sets the value of the appliedEventActionProduce property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public LoadControlStateDataType withAppliedEventActionProduce(String value) {
        setAppliedEventActionProduce(value);
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
        if (draftCopy instanceof LoadControlStateDataType) {
            final LoadControlStateDataType copy = ((LoadControlStateDataType) draftCopy);
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
                Boolean eventStateConsumeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.eventStateConsume!= null));
                if (eventStateConsumeShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceEventStateConsume;
                    sourceEventStateConsume = this.getEventStateConsume();
                    String copyEventStateConsume = ((String) strategy.copy(LocatorUtils.property(locator, "eventStateConsume", sourceEventStateConsume), sourceEventStateConsume, (this.eventStateConsume!= null)));
                    copy.setEventStateConsume(copyEventStateConsume);
                } else {
                    if (eventStateConsumeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.eventStateConsume = null;
                    }
                }
            }
            {
                Boolean appliedEventActionConsumeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.appliedEventActionConsume!= null));
                if (appliedEventActionConsumeShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceAppliedEventActionConsume;
                    sourceAppliedEventActionConsume = this.getAppliedEventActionConsume();
                    String copyAppliedEventActionConsume = ((String) strategy.copy(LocatorUtils.property(locator, "appliedEventActionConsume", sourceAppliedEventActionConsume), sourceAppliedEventActionConsume, (this.appliedEventActionConsume!= null)));
                    copy.setAppliedEventActionConsume(copyAppliedEventActionConsume);
                } else {
                    if (appliedEventActionConsumeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.appliedEventActionConsume = null;
                    }
                }
            }
            {
                Boolean eventStateProduceShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.eventStateProduce!= null));
                if (eventStateProduceShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceEventStateProduce;
                    sourceEventStateProduce = this.getEventStateProduce();
                    String copyEventStateProduce = ((String) strategy.copy(LocatorUtils.property(locator, "eventStateProduce", sourceEventStateProduce), sourceEventStateProduce, (this.eventStateProduce!= null)));
                    copy.setEventStateProduce(copyEventStateProduce);
                } else {
                    if (eventStateProduceShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.eventStateProduce = null;
                    }
                }
            }
            {
                Boolean appliedEventActionProduceShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.appliedEventActionProduce!= null));
                if (appliedEventActionProduceShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceAppliedEventActionProduce;
                    sourceAppliedEventActionProduce = this.getAppliedEventActionProduce();
                    String copyAppliedEventActionProduce = ((String) strategy.copy(LocatorUtils.property(locator, "appliedEventActionProduce", sourceAppliedEventActionProduce), sourceAppliedEventActionProduce, (this.appliedEventActionProduce!= null)));
                    copy.setAppliedEventActionProduce(copyAppliedEventActionProduce);
                } else {
                    if (appliedEventActionProduceShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.appliedEventActionProduce = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new LoadControlStateDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final LoadControlStateDataType that = ((LoadControlStateDataType) object);
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
            String leftEventStateConsume;
            leftEventStateConsume = this.getEventStateConsume();
            String rightEventStateConsume;
            rightEventStateConsume = that.getEventStateConsume();
            if (this.eventStateConsume!= null) {
                if (that.eventStateConsume!= null) {
                    if (!leftEventStateConsume.equals(rightEventStateConsume)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.eventStateConsume!= null) {
                    return false;
                }
            }
        }
        {
            String leftAppliedEventActionConsume;
            leftAppliedEventActionConsume = this.getAppliedEventActionConsume();
            String rightAppliedEventActionConsume;
            rightAppliedEventActionConsume = that.getAppliedEventActionConsume();
            if (this.appliedEventActionConsume!= null) {
                if (that.appliedEventActionConsume!= null) {
                    if (!leftAppliedEventActionConsume.equals(rightAppliedEventActionConsume)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.appliedEventActionConsume!= null) {
                    return false;
                }
            }
        }
        {
            String leftEventStateProduce;
            leftEventStateProduce = this.getEventStateProduce();
            String rightEventStateProduce;
            rightEventStateProduce = that.getEventStateProduce();
            if (this.eventStateProduce!= null) {
                if (that.eventStateProduce!= null) {
                    if (!leftEventStateProduce.equals(rightEventStateProduce)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.eventStateProduce!= null) {
                    return false;
                }
            }
        }
        {
            String leftAppliedEventActionProduce;
            leftAppliedEventActionProduce = this.getAppliedEventActionProduce();
            String rightAppliedEventActionProduce;
            rightAppliedEventActionProduce = that.getAppliedEventActionProduce();
            if (this.appliedEventActionProduce!= null) {
                if (that.appliedEventActionProduce!= null) {
                    if (!leftAppliedEventActionProduce.equals(rightAppliedEventActionProduce)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.appliedEventActionProduce!= null) {
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
            String theEventStateConsume;
            theEventStateConsume = this.getEventStateConsume();
            if (this.eventStateConsume!= null) {
                currentHashCode += theEventStateConsume.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String theAppliedEventActionConsume;
            theAppliedEventActionConsume = this.getAppliedEventActionConsume();
            if (this.appliedEventActionConsume!= null) {
                currentHashCode += theAppliedEventActionConsume.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String theEventStateProduce;
            theEventStateProduce = this.getEventStateProduce();
            if (this.eventStateProduce!= null) {
                currentHashCode += theEventStateProduce.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String theAppliedEventActionProduce;
            theAppliedEventActionProduce = this.getAppliedEventActionProduce();
            if (this.appliedEventActionProduce!= null) {
                currentHashCode += theAppliedEventActionProduce.hashCode();
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
            String theEventStateConsume;
            theEventStateConsume = this.getEventStateConsume();
            strategy.appendField(locator, this, "eventStateConsume", buffer, theEventStateConsume, (this.eventStateConsume!= null));
        }
        {
            String theAppliedEventActionConsume;
            theAppliedEventActionConsume = this.getAppliedEventActionConsume();
            strategy.appendField(locator, this, "appliedEventActionConsume", buffer, theAppliedEventActionConsume, (this.appliedEventActionConsume!= null));
        }
        {
            String theEventStateProduce;
            theEventStateProduce = this.getEventStateProduce();
            strategy.appendField(locator, this, "eventStateProduce", buffer, theEventStateProduce, (this.eventStateProduce!= null));
        }
        {
            String theAppliedEventActionProduce;
            theAppliedEventActionProduce = this.getAppliedEventActionProduce();
            strategy.appendField(locator, this, "appliedEventActionProduce", buffer, theAppliedEventActionProduce, (this.appliedEventActionProduce!= null));
        }
        return buffer;
    }

}
