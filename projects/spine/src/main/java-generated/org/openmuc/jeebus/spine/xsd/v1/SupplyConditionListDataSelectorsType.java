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
 * <p>Java class for SupplyConditionListDataSelectorsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SupplyConditionListDataSelectorsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="conditionId" type="{http://docs.eebus.org/spine/xsd/v1}ConditionIdType" minOccurs="0"/&gt;
 *         &lt;element name="timestampInterval" type="{http://docs.eebus.org/spine/xsd/v1}TimestampIntervalType" minOccurs="0"/&gt;
 *         &lt;element name="eventType" type="{http://docs.eebus.org/spine/xsd/v1}SupplyConditionEventTypeType" minOccurs="0"/&gt;
 *         &lt;element name="originator" type="{http://docs.eebus.org/spine/xsd/v1}SupplyConditionOriginatorType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupplyConditionListDataSelectorsType", propOrder = {
    "conditionId",
    "timestampInterval",
    "eventType",
    "originator"
})
public class SupplyConditionListDataSelectorsType implements Cloneable, CopyTo, ToString
{

    @XmlSchemaType(name = "unsignedInt")
    protected Long conditionId;
    protected TimestampIntervalType timestampInterval;
    protected String eventType;
    protected String originator;

    /**
     * Default no-arg constructor
     * 
     */
    public SupplyConditionListDataSelectorsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public SupplyConditionListDataSelectorsType(final Long conditionId, final TimestampIntervalType timestampInterval, final String eventType, final String originator) {
        this.conditionId = conditionId;
        this.timestampInterval = timestampInterval;
        this.eventType = eventType;
        this.originator = originator;
    }

    /**
     * Gets the value of the conditionId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getConditionId() {
        return conditionId;
    }

    /**
     * Sets the value of the conditionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setConditionId(Long value) {
        this.conditionId = value;
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
     * Gets the value of the eventType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventType() {
        return eventType;
    }

    /**
     * Sets the value of the eventType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventType(String value) {
        this.eventType = value;
    }

    /**
     * Gets the value of the originator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginator() {
        return originator;
    }

    /**
     * Sets the value of the originator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginator(String value) {
        this.originator = value;
    }

    /**
     * Sets the value of the conditionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     * @return
     *     The class instance
     */
    public SupplyConditionListDataSelectorsType withConditionId(Long value) {
        setConditionId(value);
        return this;
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
    public SupplyConditionListDataSelectorsType withTimestampInterval(TimestampIntervalType value) {
        setTimestampInterval(value);
        return this;
    }

    /**
     * Sets the value of the eventType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public SupplyConditionListDataSelectorsType withEventType(String value) {
        setEventType(value);
        return this;
    }

    /**
     * Sets the value of the originator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public SupplyConditionListDataSelectorsType withOriginator(String value) {
        setOriginator(value);
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
        if (draftCopy instanceof SupplyConditionListDataSelectorsType) {
            final SupplyConditionListDataSelectorsType copy = ((SupplyConditionListDataSelectorsType) draftCopy);
            {
                Boolean conditionIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.conditionId!= null));
                if (conditionIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceConditionId;
                    sourceConditionId = this.getConditionId();
                    Long copyConditionId = ((Long) strategy.copy(LocatorUtils.property(locator, "conditionId", sourceConditionId), sourceConditionId, (this.conditionId!= null)));
                    copy.setConditionId(copyConditionId);
                } else {
                    if (conditionIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.conditionId = null;
                    }
                }
            }
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
                Boolean eventTypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.eventType!= null));
                if (eventTypeShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceEventType;
                    sourceEventType = this.getEventType();
                    String copyEventType = ((String) strategy.copy(LocatorUtils.property(locator, "eventType", sourceEventType), sourceEventType, (this.eventType!= null)));
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
                    String sourceOriginator;
                    sourceOriginator = this.getOriginator();
                    String copyOriginator = ((String) strategy.copy(LocatorUtils.property(locator, "originator", sourceOriginator), sourceOriginator, (this.originator!= null)));
                    copy.setOriginator(copyOriginator);
                } else {
                    if (originatorShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.originator = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new SupplyConditionListDataSelectorsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final SupplyConditionListDataSelectorsType that = ((SupplyConditionListDataSelectorsType) object);
        {
            Long leftConditionId;
            leftConditionId = this.getConditionId();
            Long rightConditionId;
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
            String leftEventType;
            leftEventType = this.getEventType();
            String rightEventType;
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
            String leftOriginator;
            leftOriginator = this.getOriginator();
            String rightOriginator;
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
        return true;
    }

    @Override
    public int hashCode() {
        int currentHashCode = 1;
        {
            currentHashCode = (currentHashCode* 31);
            Long theConditionId;
            theConditionId = this.getConditionId();
            if (this.conditionId!= null) {
                currentHashCode += theConditionId.hashCode();
            }
        }
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
            String theEventType;
            theEventType = this.getEventType();
            if (this.eventType!= null) {
                currentHashCode += theEventType.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String theOriginator;
            theOriginator = this.getOriginator();
            if (this.originator!= null) {
                currentHashCode += theOriginator.hashCode();
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
            Long theConditionId;
            theConditionId = this.getConditionId();
            strategy.appendField(locator, this, "conditionId", buffer, theConditionId, (this.conditionId!= null));
        }
        {
            TimestampIntervalType theTimestampInterval;
            theTimestampInterval = this.getTimestampInterval();
            strategy.appendField(locator, this, "timestampInterval", buffer, theTimestampInterval, (this.timestampInterval!= null));
        }
        {
            String theEventType;
            theEventType = this.getEventType();
            strategy.appendField(locator, this, "eventType", buffer, theEventType, (this.eventType!= null));
        }
        {
            String theOriginator;
            theOriginator = this.getOriginator();
            strategy.appendField(locator, this, "originator", buffer, theOriginator, (this.originator!= null));
        }
        return buffer;
    }

}
