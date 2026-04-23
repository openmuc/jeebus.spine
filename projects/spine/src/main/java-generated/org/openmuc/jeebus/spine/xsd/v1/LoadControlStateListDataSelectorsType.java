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
 * <p>Java class for LoadControlStateListDataSelectorsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoadControlStateListDataSelectorsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="timestampInterval" type="{http://docs.eebus.org/spine/xsd/v1}TimestampIntervalType" minOccurs="0"/&gt;
 *         &lt;element name="eventId" type="{http://docs.eebus.org/spine/xsd/v1}LoadControlEventIdType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoadControlStateListDataSelectorsType", propOrder = {
    "timestampInterval",
    "eventId"
})
public class LoadControlStateListDataSelectorsType implements Cloneable, CopyTo, ToString
{

    protected TimestampIntervalType timestampInterval;
    @XmlSchemaType(name = "unsignedInt")
    protected Long eventId;

    /**
     * Default no-arg constructor
     * 
     */
    public LoadControlStateListDataSelectorsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public LoadControlStateListDataSelectorsType(final TimestampIntervalType timestampInterval, final Long eventId) {
        this.timestampInterval = timestampInterval;
        this.eventId = eventId;
    }

    /**
     * Gets the value of the timestampInterval property.
     * 
     * @return
     *     possible object is
     *     {@link TimestampIntervalType }
     *     
     */
    public TimestampIntervalType getTimestampInterval() {
        return timestampInterval;
    }

    /**
     * Sets the value of the timestampInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimestampIntervalType }
     *     
     */
    public void setTimestampInterval(TimestampIntervalType value) {
        this.timestampInterval = value;
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
     * Sets the value of the timestampInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimestampIntervalType }
     * @return
     *     The class instance
     */
    public LoadControlStateListDataSelectorsType withTimestampInterval(TimestampIntervalType value) {
        setTimestampInterval(value);
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
    public LoadControlStateListDataSelectorsType withEventId(Long value) {
        setEventId(value);
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
        if (draftCopy instanceof LoadControlStateListDataSelectorsType) {
            final LoadControlStateListDataSelectorsType copy = ((LoadControlStateListDataSelectorsType) draftCopy);
            {
                Boolean timestampIntervalShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.timestampInterval!= null));
                if (timestampIntervalShouldBeCopiedAndSet == Boolean.TRUE) {
                    TimestampIntervalType sourceTimestampInterval;
                    sourceTimestampInterval = this.getTimestampInterval();
                    TimestampIntervalType copyTimestampInterval = ((TimestampIntervalType) strategy.copy(LocatorUtils.property(locator, "timestampInterval", sourceTimestampInterval), sourceTimestampInterval, (this.timestampInterval!= null)));
                    copy.setTimestampInterval(copyTimestampInterval);
                } else {
                    if (timestampIntervalShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.timestampInterval = null;
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
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new LoadControlStateListDataSelectorsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final LoadControlStateListDataSelectorsType that = ((LoadControlStateListDataSelectorsType) object);
        {
            TimestampIntervalType leftTimestampInterval;
            leftTimestampInterval = this.getTimestampInterval();
            TimestampIntervalType rightTimestampInterval;
            rightTimestampInterval = that.getTimestampInterval();
            if (this.timestampInterval!= null) {
                if (that.timestampInterval!= null) {
                    if (!leftTimestampInterval.equals(rightTimestampInterval)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.timestampInterval!= null) {
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
        return true;
    }

    @Override
    public int hashCode() {
        int currentHashCode = 1;
        {
            currentHashCode = (currentHashCode* 31);
            TimestampIntervalType theTimestampInterval;
            theTimestampInterval = this.getTimestampInterval();
            if (this.timestampInterval!= null) {
                currentHashCode += theTimestampInterval.hashCode();
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
            TimestampIntervalType theTimestampInterval;
            theTimestampInterval = this.getTimestampInterval();
            strategy.appendField(locator, this, "timestampInterval", buffer, theTimestampInterval, (this.timestampInterval!= null));
        }
        {
            Long theEventId;
            theEventId = this.getEventId();
            strategy.appendField(locator, this, "eventId", buffer, theEventId, (this.eventId!= null));
        }
        return buffer;
    }

}
