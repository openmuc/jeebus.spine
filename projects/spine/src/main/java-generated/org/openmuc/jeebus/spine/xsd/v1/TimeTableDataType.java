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
import jakarta.xml.bind.annotation.XmlSeeAlso;
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
 * <p>Java class for TimeTableDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeTableDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="timeTableId" type="{http://docs.eebus.org/spine/xsd/v1}TimeTableIdType" minOccurs="0"/&gt;
 *         &lt;element name="timeSlotId" type="{http://docs.eebus.org/spine/xsd/v1}TimeSlotIdType" minOccurs="0"/&gt;
 *         &lt;element name="recurrenceInformation" type="{http://docs.eebus.org/spine/xsd/v1}RecurrenceInformationType" minOccurs="0"/&gt;
 *         &lt;element name="startTime" type="{http://docs.eebus.org/spine/xsd/v1}AbsoluteOrRecurringTimeType" minOccurs="0"/&gt;
 *         &lt;element name="endTime" type="{http://docs.eebus.org/spine/xsd/v1}AbsoluteOrRecurringTimeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeTableDataType", propOrder = {
    "timeTableId",
    "timeSlotId",
    "recurrenceInformation",
    "startTime",
    "endTime"
})
@XmlSeeAlso({
    org.openmuc.jeebus.spine.xsd.v1.IncentiveTableIncentiveSlotType.TimeInterval.class
})
public class TimeTableDataType implements Cloneable, CopyTo, ToString
{

    @XmlSchemaType(name = "unsignedInt")
    protected Long timeTableId;
    @XmlSchemaType(name = "unsignedInt")
    protected Long timeSlotId;
    protected RecurrenceInformationType recurrenceInformation;
    protected AbsoluteOrRecurringTimeType startTime;
    protected AbsoluteOrRecurringTimeType endTime;

    /**
     * Default no-arg constructor
     * 
     */
    public TimeTableDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public TimeTableDataType(final Long timeTableId, final Long timeSlotId, final RecurrenceInformationType recurrenceInformation, final AbsoluteOrRecurringTimeType startTime, final AbsoluteOrRecurringTimeType endTime) {
        this.timeTableId = timeTableId;
        this.timeSlotId = timeSlotId;
        this.recurrenceInformation = recurrenceInformation;
        this.startTime = startTime;
        this.endTime = endTime;
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
     * Gets the value of the recurrenceInformation property.
     * 
     * @return
     *     possible object is
     *     {@link RecurrenceInformationType }
     *     
     */
    public RecurrenceInformationType getRecurrenceInformation() {
        return recurrenceInformation;
    }

    /**
     * Sets the value of the recurrenceInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecurrenceInformationType }
     *     
     */
    public void setRecurrenceInformation(RecurrenceInformationType value) {
        this.recurrenceInformation = value;
    }

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link AbsoluteOrRecurringTimeType }
     *     
     */
    public AbsoluteOrRecurringTimeType getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbsoluteOrRecurringTimeType }
     *     
     */
    public void setStartTime(AbsoluteOrRecurringTimeType value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the endTime property.
     * 
     * @return
     *     possible object is
     *     {@link AbsoluteOrRecurringTimeType }
     *     
     */
    public AbsoluteOrRecurringTimeType getEndTime() {
        return endTime;
    }

    /**
     * Sets the value of the endTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbsoluteOrRecurringTimeType }
     *     
     */
    public void setEndTime(AbsoluteOrRecurringTimeType value) {
        this.endTime = value;
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
    public TimeTableDataType withTimeTableId(Long value) {
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
    public TimeTableDataType withTimeSlotId(Long value) {
        setTimeSlotId(value);
        return this;
    }

    /**
     * Sets the value of the recurrenceInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecurrenceInformationType }
     * @return
     *     The class instance
     */
    public TimeTableDataType withRecurrenceInformation(RecurrenceInformationType value) {
        setRecurrenceInformation(value);
        return this;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbsoluteOrRecurringTimeType }
     * @return
     *     The class instance
     */
    public TimeTableDataType withStartTime(AbsoluteOrRecurringTimeType value) {
        setStartTime(value);
        return this;
    }

    /**
     * Sets the value of the endTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbsoluteOrRecurringTimeType }
     * @return
     *     The class instance
     */
    public TimeTableDataType withEndTime(AbsoluteOrRecurringTimeType value) {
        setEndTime(value);
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
        if (draftCopy instanceof TimeTableDataType) {
            final TimeTableDataType copy = ((TimeTableDataType) draftCopy);
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
            {
                Boolean recurrenceInformationShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.recurrenceInformation!= null));
                if (recurrenceInformationShouldBeCopiedAndSet == Boolean.TRUE) {
                    RecurrenceInformationType sourceRecurrenceInformation;
                    sourceRecurrenceInformation = this.getRecurrenceInformation();
                    RecurrenceInformationType copyRecurrenceInformation = ((RecurrenceInformationType) strategy.copy(LocatorUtils.property(locator, "recurrenceInformation", sourceRecurrenceInformation), sourceRecurrenceInformation, (this.recurrenceInformation!= null)));
                    copy.setRecurrenceInformation(copyRecurrenceInformation);
                } else {
                    if (recurrenceInformationShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.recurrenceInformation = null;
                    }
                }
            }
            {
                Boolean startTimeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.startTime!= null));
                if (startTimeShouldBeCopiedAndSet == Boolean.TRUE) {
                    AbsoluteOrRecurringTimeType sourceStartTime;
                    sourceStartTime = this.getStartTime();
                    AbsoluteOrRecurringTimeType copyStartTime = ((AbsoluteOrRecurringTimeType) strategy.copy(LocatorUtils.property(locator, "startTime", sourceStartTime), sourceStartTime, (this.startTime!= null)));
                    copy.setStartTime(copyStartTime);
                } else {
                    if (startTimeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.startTime = null;
                    }
                }
            }
            {
                Boolean endTimeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.endTime!= null));
                if (endTimeShouldBeCopiedAndSet == Boolean.TRUE) {
                    AbsoluteOrRecurringTimeType sourceEndTime;
                    sourceEndTime = this.getEndTime();
                    AbsoluteOrRecurringTimeType copyEndTime = ((AbsoluteOrRecurringTimeType) strategy.copy(LocatorUtils.property(locator, "endTime", sourceEndTime), sourceEndTime, (this.endTime!= null)));
                    copy.setEndTime(copyEndTime);
                } else {
                    if (endTimeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.endTime = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new TimeTableDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TimeTableDataType that = ((TimeTableDataType) object);
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
        {
            RecurrenceInformationType leftRecurrenceInformation;
            leftRecurrenceInformation = this.getRecurrenceInformation();
            RecurrenceInformationType rightRecurrenceInformation;
            rightRecurrenceInformation = that.getRecurrenceInformation();
            if (this.recurrenceInformation!= null) {
                if (that.recurrenceInformation!= null) {
                    if (!leftRecurrenceInformation.equals(rightRecurrenceInformation)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.recurrenceInformation!= null) {
                    return false;
                }
            }
        }
        {
            AbsoluteOrRecurringTimeType leftStartTime;
            leftStartTime = this.getStartTime();
            AbsoluteOrRecurringTimeType rightStartTime;
            rightStartTime = that.getStartTime();
            if (this.startTime!= null) {
                if (that.startTime!= null) {
                    if (!leftStartTime.equals(rightStartTime)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.startTime!= null) {
                    return false;
                }
            }
        }
        {
            AbsoluteOrRecurringTimeType leftEndTime;
            leftEndTime = this.getEndTime();
            AbsoluteOrRecurringTimeType rightEndTime;
            rightEndTime = that.getEndTime();
            if (this.endTime!= null) {
                if (that.endTime!= null) {
                    if (!leftEndTime.equals(rightEndTime)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.endTime!= null) {
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
        {
            currentHashCode = (currentHashCode* 31);
            RecurrenceInformationType theRecurrenceInformation;
            theRecurrenceInformation = this.getRecurrenceInformation();
            if (this.recurrenceInformation!= null) {
                currentHashCode += theRecurrenceInformation.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            AbsoluteOrRecurringTimeType theStartTime;
            theStartTime = this.getStartTime();
            if (this.startTime!= null) {
                currentHashCode += theStartTime.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            AbsoluteOrRecurringTimeType theEndTime;
            theEndTime = this.getEndTime();
            if (this.endTime!= null) {
                currentHashCode += theEndTime.hashCode();
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
        {
            RecurrenceInformationType theRecurrenceInformation;
            theRecurrenceInformation = this.getRecurrenceInformation();
            strategy.appendField(locator, this, "recurrenceInformation", buffer, theRecurrenceInformation, (this.recurrenceInformation!= null));
        }
        {
            AbsoluteOrRecurringTimeType theStartTime;
            theStartTime = this.getStartTime();
            strategy.appendField(locator, this, "startTime", buffer, theStartTime, (this.startTime!= null));
        }
        {
            AbsoluteOrRecurringTimeType theEndTime;
            theEndTime = this.getEndTime();
            strategy.appendField(locator, this, "endTime", buffer, theEndTime, (this.endTime!= null));
        }
        return buffer;
    }

}
