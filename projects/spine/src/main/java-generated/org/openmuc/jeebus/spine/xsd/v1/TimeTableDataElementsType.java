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
 * <p>Java class for TimeTableDataElementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeTableDataElementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="timeTableId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="timeSlotId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="recurrenceInformation" type="{http://docs.eebus.org/spine/xsd/v1}RecurrenceInformationElementsType" minOccurs="0"/&gt;
 *         &lt;element name="startTime" type="{http://docs.eebus.org/spine/xsd/v1}AbsoluteOrRecurringTimeElementsType" minOccurs="0"/&gt;
 *         &lt;element name="endTime" type="{http://docs.eebus.org/spine/xsd/v1}AbsoluteOrRecurringTimeElementsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeTableDataElementsType", propOrder = {
    "timeTableId",
    "timeSlotId",
    "recurrenceInformation",
    "startTime",
    "endTime"
})
@XmlSeeAlso({
    org.openmuc.jeebus.spine.xsd.v1.IncentiveTableIncentiveSlotElementsType.TimeInterval.class
})
public class TimeTableDataElementsType implements Cloneable, CopyTo, ToString
{

    protected ElementTagType timeTableId;
    protected ElementTagType timeSlotId;
    protected RecurrenceInformationElementsType recurrenceInformation;
    protected AbsoluteOrRecurringTimeElementsType startTime;
    protected AbsoluteOrRecurringTimeElementsType endTime;

    /**
     * Default no-arg constructor
     * 
     */
    public TimeTableDataElementsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public TimeTableDataElementsType(final ElementTagType timeTableId, final ElementTagType timeSlotId, final RecurrenceInformationElementsType recurrenceInformation, final AbsoluteOrRecurringTimeElementsType startTime, final AbsoluteOrRecurringTimeElementsType endTime) {
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
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getTimeTableId() {
        return timeTableId;
    }

    /**
     * Sets the value of the timeTableId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setTimeTableId(ElementTagType value) {
        this.timeTableId = value;
    }

    /**
     * Gets the value of the timeSlotId property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getTimeSlotId() {
        return timeSlotId;
    }

    /**
     * Sets the value of the timeSlotId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setTimeSlotId(ElementTagType value) {
        this.timeSlotId = value;
    }

    /**
     * Gets the value of the recurrenceInformation property.
     * 
     * @return
     *     possible object is
     *     {@link RecurrenceInformationElementsType }
     *     
     */
    public RecurrenceInformationElementsType getRecurrenceInformation() {
        return recurrenceInformation;
    }

    /**
     * Sets the value of the recurrenceInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecurrenceInformationElementsType }
     *     
     */
    public void setRecurrenceInformation(RecurrenceInformationElementsType value) {
        this.recurrenceInformation = value;
    }

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link AbsoluteOrRecurringTimeElementsType }
     *     
     */
    public AbsoluteOrRecurringTimeElementsType getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbsoluteOrRecurringTimeElementsType }
     *     
     */
    public void setStartTime(AbsoluteOrRecurringTimeElementsType value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the endTime property.
     * 
     * @return
     *     possible object is
     *     {@link AbsoluteOrRecurringTimeElementsType }
     *     
     */
    public AbsoluteOrRecurringTimeElementsType getEndTime() {
        return endTime;
    }

    /**
     * Sets the value of the endTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbsoluteOrRecurringTimeElementsType }
     *     
     */
    public void setEndTime(AbsoluteOrRecurringTimeElementsType value) {
        this.endTime = value;
    }

    /**
     * Sets the value of the timeTableId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public TimeTableDataElementsType withTimeTableId(ElementTagType value) {
        setTimeTableId(value);
        return this;
    }

    /**
     * Sets the value of the timeSlotId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public TimeTableDataElementsType withTimeSlotId(ElementTagType value) {
        setTimeSlotId(value);
        return this;
    }

    /**
     * Sets the value of the recurrenceInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecurrenceInformationElementsType }
     * @return
     *     The class instance
     */
    public TimeTableDataElementsType withRecurrenceInformation(RecurrenceInformationElementsType value) {
        setRecurrenceInformation(value);
        return this;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbsoluteOrRecurringTimeElementsType }
     * @return
     *     The class instance
     */
    public TimeTableDataElementsType withStartTime(AbsoluteOrRecurringTimeElementsType value) {
        setStartTime(value);
        return this;
    }

    /**
     * Sets the value of the endTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbsoluteOrRecurringTimeElementsType }
     * @return
     *     The class instance
     */
    public TimeTableDataElementsType withEndTime(AbsoluteOrRecurringTimeElementsType value) {
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
        if (draftCopy instanceof TimeTableDataElementsType) {
            final TimeTableDataElementsType copy = ((TimeTableDataElementsType) draftCopy);
            {
                Boolean timeTableIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.timeTableId!= null));
                if (timeTableIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceTimeTableId;
                    sourceTimeTableId = this.getTimeTableId();
                    ElementTagType copyTimeTableId = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "timeTableId", sourceTimeTableId), sourceTimeTableId, (this.timeTableId!= null)));
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
                    ElementTagType sourceTimeSlotId;
                    sourceTimeSlotId = this.getTimeSlotId();
                    ElementTagType copyTimeSlotId = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "timeSlotId", sourceTimeSlotId), sourceTimeSlotId, (this.timeSlotId!= null)));
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
                    RecurrenceInformationElementsType sourceRecurrenceInformation;
                    sourceRecurrenceInformation = this.getRecurrenceInformation();
                    RecurrenceInformationElementsType copyRecurrenceInformation = ((RecurrenceInformationElementsType) strategy.copy(LocatorUtils.property(locator, "recurrenceInformation", sourceRecurrenceInformation), sourceRecurrenceInformation, (this.recurrenceInformation!= null)));
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
                    AbsoluteOrRecurringTimeElementsType sourceStartTime;
                    sourceStartTime = this.getStartTime();
                    AbsoluteOrRecurringTimeElementsType copyStartTime = ((AbsoluteOrRecurringTimeElementsType) strategy.copy(LocatorUtils.property(locator, "startTime", sourceStartTime), sourceStartTime, (this.startTime!= null)));
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
                    AbsoluteOrRecurringTimeElementsType sourceEndTime;
                    sourceEndTime = this.getEndTime();
                    AbsoluteOrRecurringTimeElementsType copyEndTime = ((AbsoluteOrRecurringTimeElementsType) strategy.copy(LocatorUtils.property(locator, "endTime", sourceEndTime), sourceEndTime, (this.endTime!= null)));
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
        return new TimeTableDataElementsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TimeTableDataElementsType that = ((TimeTableDataElementsType) object);
        {
            ElementTagType leftTimeTableId;
            leftTimeTableId = this.getTimeTableId();
            ElementTagType rightTimeTableId;
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
            ElementTagType leftTimeSlotId;
            leftTimeSlotId = this.getTimeSlotId();
            ElementTagType rightTimeSlotId;
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
            RecurrenceInformationElementsType leftRecurrenceInformation;
            leftRecurrenceInformation = this.getRecurrenceInformation();
            RecurrenceInformationElementsType rightRecurrenceInformation;
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
            AbsoluteOrRecurringTimeElementsType leftStartTime;
            leftStartTime = this.getStartTime();
            AbsoluteOrRecurringTimeElementsType rightStartTime;
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
            AbsoluteOrRecurringTimeElementsType leftEndTime;
            leftEndTime = this.getEndTime();
            AbsoluteOrRecurringTimeElementsType rightEndTime;
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
            ElementTagType theTimeTableId;
            theTimeTableId = this.getTimeTableId();
            if (this.timeTableId!= null) {
                currentHashCode += theTimeTableId.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theTimeSlotId;
            theTimeSlotId = this.getTimeSlotId();
            if (this.timeSlotId!= null) {
                currentHashCode += theTimeSlotId.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            RecurrenceInformationElementsType theRecurrenceInformation;
            theRecurrenceInformation = this.getRecurrenceInformation();
            if (this.recurrenceInformation!= null) {
                currentHashCode += theRecurrenceInformation.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            AbsoluteOrRecurringTimeElementsType theStartTime;
            theStartTime = this.getStartTime();
            if (this.startTime!= null) {
                currentHashCode += theStartTime.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            AbsoluteOrRecurringTimeElementsType theEndTime;
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
            ElementTagType theTimeTableId;
            theTimeTableId = this.getTimeTableId();
            strategy.appendField(locator, this, "timeTableId", buffer, theTimeTableId, (this.timeTableId!= null));
        }
        {
            ElementTagType theTimeSlotId;
            theTimeSlotId = this.getTimeSlotId();
            strategy.appendField(locator, this, "timeSlotId", buffer, theTimeSlotId, (this.timeSlotId!= null));
        }
        {
            RecurrenceInformationElementsType theRecurrenceInformation;
            theRecurrenceInformation = this.getRecurrenceInformation();
            strategy.appendField(locator, this, "recurrenceInformation", buffer, theRecurrenceInformation, (this.recurrenceInformation!= null));
        }
        {
            AbsoluteOrRecurringTimeElementsType theStartTime;
            theStartTime = this.getStartTime();
            strategy.appendField(locator, this, "startTime", buffer, theStartTime, (this.startTime!= null));
        }
        {
            AbsoluteOrRecurringTimeElementsType theEndTime;
            theEndTime = this.getEndTime();
            strategy.appendField(locator, this, "endTime", buffer, theEndTime, (this.endTime!= null));
        }
        return buffer;
    }

}
