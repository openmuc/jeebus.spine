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
 * <p>Java class for TimeTableListDataSelectorsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeTableListDataSelectorsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="timeTableId" type="{http://docs.eebus.org/spine/xsd/v1}TimeTableIdType" minOccurs="0"/&gt;
 *         &lt;element name="timeSlotId" type="{http://docs.eebus.org/spine/xsd/v1}TimeSlotIdType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeTableListDataSelectorsType", propOrder = {
    "timeTableId",
    "timeSlotId"
})
public class TimeTableListDataSelectorsType implements Cloneable, CopyTo, ToString
{

    @XmlSchemaType(name = "unsignedInt")
    protected Long timeTableId;
    @XmlSchemaType(name = "unsignedInt")
    protected Long timeSlotId;

    /**
     * Default no-arg constructor
     * 
     */
    public TimeTableListDataSelectorsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public TimeTableListDataSelectorsType(final Long timeTableId, final Long timeSlotId) {
        this.timeTableId = timeTableId;
        this.timeSlotId = timeSlotId;
    }

    /**
     * Gets the value of the timeTableId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTimeTableId() {
        return timeTableId;
    }

    /**
     * Sets the value of the timeTableId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTimeTableId(Long value) {
        this.timeTableId = value;
    }

    /**
     * Gets the value of the timeSlotId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTimeSlotId() {
        return timeSlotId;
    }

    /**
     * Sets the value of the timeSlotId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTimeSlotId(Long value) {
        this.timeSlotId = value;
    }

    /**
     * Sets the value of the timeTableId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     * @return
     *     The class instance
     */
    public TimeTableListDataSelectorsType withTimeTableId(Long value) {
        setTimeTableId(value);
        return this;
    }

    /**
     * Sets the value of the timeSlotId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     * @return
     *     The class instance
     */
    public TimeTableListDataSelectorsType withTimeSlotId(Long value) {
        setTimeSlotId(value);
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
        if (draftCopy instanceof TimeTableListDataSelectorsType) {
            final TimeTableListDataSelectorsType copy = ((TimeTableListDataSelectorsType) draftCopy);
            {
                Boolean timeTableIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.timeTableId!= null));
                if (timeTableIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceTimeTableId;
                    sourceTimeTableId = this.getTimeTableId();
                    Long copyTimeTableId = ((Long) strategy.copy(LocatorUtils.property(locator, "timeTableId", sourceTimeTableId), sourceTimeTableId, (this.timeTableId!= null)));
                    copy.setTimeTableId(copyTimeTableId);
                } else {
                    if (timeTableIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.timeTableId = null;
                    }
                }
            }
            {
                Boolean timeSlotIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.timeSlotId!= null));
                if (timeSlotIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceTimeSlotId;
                    sourceTimeSlotId = this.getTimeSlotId();
                    Long copyTimeSlotId = ((Long) strategy.copy(LocatorUtils.property(locator, "timeSlotId", sourceTimeSlotId), sourceTimeSlotId, (this.timeSlotId!= null)));
                    copy.setTimeSlotId(copyTimeSlotId);
                } else {
                    if (timeSlotIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.timeSlotId = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new TimeTableListDataSelectorsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TimeTableListDataSelectorsType that = ((TimeTableListDataSelectorsType) object);
        {
            Long leftTimeTableId;
            leftTimeTableId = this.getTimeTableId();
            Long rightTimeTableId;
            rightTimeTableId = that.getTimeTableId();
            if (this.timeTableId!= null) {
                if (that.timeTableId!= null) {
                    if (!leftTimeTableId.equals(rightTimeTableId)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.timeTableId!= null) {
                    return false;
                }
            }
        }
        {
            Long leftTimeSlotId;
            leftTimeSlotId = this.getTimeSlotId();
            Long rightTimeSlotId;
            rightTimeSlotId = that.getTimeSlotId();
            if (this.timeSlotId!= null) {
                if (that.timeSlotId!= null) {
                    if (!leftTimeSlotId.equals(rightTimeSlotId)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.timeSlotId!= null) {
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
            Long theTimeTableId;
            theTimeTableId = this.getTimeTableId();
            if (this.timeTableId!= null) {
                currentHashCode += theTimeTableId.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            Long theTimeSlotId;
            theTimeSlotId = this.getTimeSlotId();
            if (this.timeSlotId!= null) {
                currentHashCode += theTimeSlotId.hashCode();
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
            Long theTimeTableId;
            theTimeTableId = this.getTimeTableId();
            strategy.appendField(locator, this, "timeTableId", buffer, theTimeTableId, (this.timeTableId!= null));
        }
        {
            Long theTimeSlotId;
            theTimeSlotId = this.getTimeSlotId();
            strategy.appendField(locator, this, "timeSlotId", buffer, theTimeSlotId, (this.timeSlotId!= null));
        }
        return buffer;
    }

}
