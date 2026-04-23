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
import javax.xml.datatype.XMLGregorianCalendar;
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
 * <p>Java class for AbsoluteOrRecurringTimeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbsoluteOrRecurringTimeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="month" type="{http://docs.eebus.org/spine/xsd/v1}MonthType" minOccurs="0"/&gt;
 *         &lt;element name="dayOfMonth" type="{http://docs.eebus.org/spine/xsd/v1}DayOfMonthType" minOccurs="0"/&gt;
 *         &lt;element name="calendarWeek" type="{http://docs.eebus.org/spine/xsd/v1}CalendarWeekType" minOccurs="0"/&gt;
 *         &lt;element name="dayOfWeekOccurrence" type="{http://docs.eebus.org/spine/xsd/v1}OccurrenceType" minOccurs="0"/&gt;
 *         &lt;element name="daysOfWeek" type="{http://docs.eebus.org/spine/xsd/v1}DaysOfWeekType" minOccurs="0"/&gt;
 *         &lt;element name="time" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/&gt;
 *         &lt;element name="relative" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbsoluteOrRecurringTimeType", propOrder = {
    "dateTime",
    "month",
    "dayOfMonth",
    "calendarWeek",
    "dayOfWeekOccurrence",
    "daysOfWeek",
    "time",
    "relative"
})
public class AbsoluteOrRecurringTimeType implements Cloneable, CopyTo, ToString
{

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTime;
    @XmlSchemaType(name = "string")
    protected MonthType month;
    @XmlSchemaType(name = "unsignedByte")
    protected Short dayOfMonth;
    @XmlSchemaType(name = "unsignedByte")
    protected Short calendarWeek;
    protected String dayOfWeekOccurrence;
    protected DaysOfWeekType daysOfWeek;
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar time;
    protected Duration relative;

    /**
     * Default no-arg constructor
     * 
     */
    public AbsoluteOrRecurringTimeType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public AbsoluteOrRecurringTimeType(final XMLGregorianCalendar dateTime, final MonthType month, final Short dayOfMonth, final Short calendarWeek, final String dayOfWeekOccurrence, final DaysOfWeekType daysOfWeek, final XMLGregorianCalendar time, final Duration relative) {
        this.dateTime = dateTime;
        this.month = month;
        this.dayOfMonth = dayOfMonth;
        this.calendarWeek = calendarWeek;
        this.dayOfWeekOccurrence = dayOfWeekOccurrence;
        this.daysOfWeek = daysOfWeek;
        this.time = time;
        this.relative = relative;
    }

    /**
     * Gets the value of the dateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateTime() {
        return dateTime;
    }

    /**
     * Sets the value of the dateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateTime(XMLGregorianCalendar value) {
        this.dateTime = value;
    }

    /**
     * Gets the value of the month property.
     * 
     * @return
     *     possible object is
     *     {@link MonthType }
     *     
     */
    public MonthType getMonth() {
        return month;
    }

    /**
     * Sets the value of the month property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonthType }
     *     
     */
    public void setMonth(MonthType value) {
        this.month = value;
    }

    /**
     * Gets the value of the dayOfMonth property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getDayOfMonth() {
        return dayOfMonth;
    }

    /**
     * Sets the value of the dayOfMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setDayOfMonth(Short value) {
        this.dayOfMonth = value;
    }

    /**
     * Gets the value of the calendarWeek property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getCalendarWeek() {
        return calendarWeek;
    }

    /**
     * Sets the value of the calendarWeek property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setCalendarWeek(Short value) {
        this.calendarWeek = value;
    }

    /**
     * Gets the value of the dayOfWeekOccurrence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDayOfWeekOccurrence() {
        return dayOfWeekOccurrence;
    }

    /**
     * Sets the value of the dayOfWeekOccurrence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDayOfWeekOccurrence(String value) {
        this.dayOfWeekOccurrence = value;
    }

    /**
     * Gets the value of the daysOfWeek property.
     * 
     * @return
     *     possible object is
     *     {@link DaysOfWeekType }
     *     
     */
    public DaysOfWeekType getDaysOfWeek() {
        return daysOfWeek;
    }

    /**
     * Sets the value of the daysOfWeek property.
     * 
     * @param value
     *     allowed object is
     *     {@link DaysOfWeekType }
     *     
     */
    public void setDaysOfWeek(DaysOfWeekType value) {
        this.daysOfWeek = value;
    }

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTime(XMLGregorianCalendar value) {
        this.time = value;
    }

    /**
     * Gets the value of the relative property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getRelative() {
        return relative;
    }

    /**
     * Sets the value of the relative property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setRelative(Duration value) {
        this.relative = value;
    }

    /**
     * Sets the value of the dateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     * @return
     *     The class instance
     */
    public AbsoluteOrRecurringTimeType withDateTime(XMLGregorianCalendar value) {
        setDateTime(value);
        return this;
    }

    /**
     * Sets the value of the month property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonthType }
     * @return
     *     The class instance
     */
    public AbsoluteOrRecurringTimeType withMonth(MonthType value) {
        setMonth(value);
        return this;
    }

    /**
     * Sets the value of the dayOfMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     * @return
     *     The class instance
     */
    public AbsoluteOrRecurringTimeType withDayOfMonth(Short value) {
        setDayOfMonth(value);
        return this;
    }

    /**
     * Sets the value of the calendarWeek property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     * @return
     *     The class instance
     */
    public AbsoluteOrRecurringTimeType withCalendarWeek(Short value) {
        setCalendarWeek(value);
        return this;
    }

    /**
     * Sets the value of the dayOfWeekOccurrence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public AbsoluteOrRecurringTimeType withDayOfWeekOccurrence(String value) {
        setDayOfWeekOccurrence(value);
        return this;
    }

    /**
     * Sets the value of the daysOfWeek property.
     * 
     * @param value
     *     allowed object is
     *     {@link DaysOfWeekType }
     * @return
     *     The class instance
     */
    public AbsoluteOrRecurringTimeType withDaysOfWeek(DaysOfWeekType value) {
        setDaysOfWeek(value);
        return this;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     * @return
     *     The class instance
     */
    public AbsoluteOrRecurringTimeType withTime(XMLGregorianCalendar value) {
        setTime(value);
        return this;
    }

    /**
     * Sets the value of the relative property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     * @return
     *     The class instance
     */
    public AbsoluteOrRecurringTimeType withRelative(Duration value) {
        setRelative(value);
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
        if (draftCopy instanceof AbsoluteOrRecurringTimeType) {
            final AbsoluteOrRecurringTimeType copy = ((AbsoluteOrRecurringTimeType) draftCopy);
            {
                Boolean dateTimeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.dateTime!= null));
                if (dateTimeShouldBeCopiedAndSet == Boolean.TRUE) {
                    XMLGregorianCalendar sourceDateTime;
                    sourceDateTime = this.getDateTime();
                    XMLGregorianCalendar copyDateTime = ((XMLGregorianCalendar) strategy.copy(LocatorUtils.property(locator, "dateTime", sourceDateTime), sourceDateTime, (this.dateTime!= null)));
                    copy.setDateTime(copyDateTime);
                } else {
                    if (dateTimeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.dateTime = null;
                    }
                }
            }
            {
                Boolean monthShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.month!= null));
                if (monthShouldBeCopiedAndSet == Boolean.TRUE) {
                    MonthType sourceMonth;
                    sourceMonth = this.getMonth();
                    MonthType copyMonth = ((MonthType) strategy.copy(LocatorUtils.property(locator, "month", sourceMonth), sourceMonth, (this.month!= null)));
                    copy.setMonth(copyMonth);
                } else {
                    if (monthShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.month = null;
                    }
                }
            }
            {
                Boolean dayOfMonthShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.dayOfMonth!= null));
                if (dayOfMonthShouldBeCopiedAndSet == Boolean.TRUE) {
                    Short sourceDayOfMonth;
                    sourceDayOfMonth = this.getDayOfMonth();
                    Short copyDayOfMonth = ((Short) strategy.copy(LocatorUtils.property(locator, "dayOfMonth", sourceDayOfMonth), sourceDayOfMonth, (this.dayOfMonth!= null)));
                    copy.setDayOfMonth(copyDayOfMonth);
                } else {
                    if (dayOfMonthShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.dayOfMonth = null;
                    }
                }
            }
            {
                Boolean calendarWeekShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.calendarWeek!= null));
                if (calendarWeekShouldBeCopiedAndSet == Boolean.TRUE) {
                    Short sourceCalendarWeek;
                    sourceCalendarWeek = this.getCalendarWeek();
                    Short copyCalendarWeek = ((Short) strategy.copy(LocatorUtils.property(locator, "calendarWeek", sourceCalendarWeek), sourceCalendarWeek, (this.calendarWeek!= null)));
                    copy.setCalendarWeek(copyCalendarWeek);
                } else {
                    if (calendarWeekShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.calendarWeek = null;
                    }
                }
            }
            {
                Boolean dayOfWeekOccurrenceShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.dayOfWeekOccurrence!= null));
                if (dayOfWeekOccurrenceShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceDayOfWeekOccurrence;
                    sourceDayOfWeekOccurrence = this.getDayOfWeekOccurrence();
                    String copyDayOfWeekOccurrence = ((String) strategy.copy(LocatorUtils.property(locator, "dayOfWeekOccurrence", sourceDayOfWeekOccurrence), sourceDayOfWeekOccurrence, (this.dayOfWeekOccurrence!= null)));
                    copy.setDayOfWeekOccurrence(copyDayOfWeekOccurrence);
                } else {
                    if (dayOfWeekOccurrenceShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.dayOfWeekOccurrence = null;
                    }
                }
            }
            {
                Boolean daysOfWeekShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.daysOfWeek!= null));
                if (daysOfWeekShouldBeCopiedAndSet == Boolean.TRUE) {
                    DaysOfWeekType sourceDaysOfWeek;
                    sourceDaysOfWeek = this.getDaysOfWeek();
                    DaysOfWeekType copyDaysOfWeek = ((DaysOfWeekType) strategy.copy(LocatorUtils.property(locator, "daysOfWeek", sourceDaysOfWeek), sourceDaysOfWeek, (this.daysOfWeek!= null)));
                    copy.setDaysOfWeek(copyDaysOfWeek);
                } else {
                    if (daysOfWeekShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.daysOfWeek = null;
                    }
                }
            }
            {
                Boolean timeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.time!= null));
                if (timeShouldBeCopiedAndSet == Boolean.TRUE) {
                    XMLGregorianCalendar sourceTime;
                    sourceTime = this.getTime();
                    XMLGregorianCalendar copyTime = ((XMLGregorianCalendar) strategy.copy(LocatorUtils.property(locator, "time", sourceTime), sourceTime, (this.time!= null)));
                    copy.setTime(copyTime);
                } else {
                    if (timeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.time = null;
                    }
                }
            }
            {
                Boolean relativeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.relative!= null));
                if (relativeShouldBeCopiedAndSet == Boolean.TRUE) {
                    Duration sourceRelative;
                    sourceRelative = this.getRelative();
                    Duration copyRelative = ((Duration) strategy.copy(LocatorUtils.property(locator, "relative", sourceRelative), sourceRelative, (this.relative!= null)));
                    copy.setRelative(copyRelative);
                } else {
                    if (relativeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.relative = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new AbsoluteOrRecurringTimeType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final AbsoluteOrRecurringTimeType that = ((AbsoluteOrRecurringTimeType) object);
        {
            XMLGregorianCalendar leftDateTime;
            leftDateTime = this.getDateTime();
            XMLGregorianCalendar rightDateTime;
            rightDateTime = that.getDateTime();
            if (this.dateTime!= null) {
                if (that.dateTime!= null) {
                    if (!leftDateTime.equals(rightDateTime)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.dateTime!= null) {
                    return false;
                }
            }
        }
        {
            MonthType leftMonth;
            leftMonth = this.getMonth();
            MonthType rightMonth;
            rightMonth = that.getMonth();
            if (this.month!= null) {
                if (that.month!= null) {
                    if (!leftMonth.equals(rightMonth)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.month!= null) {
                    return false;
                }
            }
        }
        {
            Short leftDayOfMonth;
            leftDayOfMonth = this.getDayOfMonth();
            Short rightDayOfMonth;
            rightDayOfMonth = that.getDayOfMonth();
            if (this.dayOfMonth!= null) {
                if (that.dayOfMonth!= null) {
                    if (!leftDayOfMonth.equals(rightDayOfMonth)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.dayOfMonth!= null) {
                    return false;
                }
            }
        }
        {
            Short leftCalendarWeek;
            leftCalendarWeek = this.getCalendarWeek();
            Short rightCalendarWeek;
            rightCalendarWeek = that.getCalendarWeek();
            if (this.calendarWeek!= null) {
                if (that.calendarWeek!= null) {
                    if (!leftCalendarWeek.equals(rightCalendarWeek)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.calendarWeek!= null) {
                    return false;
                }
            }
        }
        {
            String leftDayOfWeekOccurrence;
            leftDayOfWeekOccurrence = this.getDayOfWeekOccurrence();
            String rightDayOfWeekOccurrence;
            rightDayOfWeekOccurrence = that.getDayOfWeekOccurrence();
            if (this.dayOfWeekOccurrence!= null) {
                if (that.dayOfWeekOccurrence!= null) {
                    if (!leftDayOfWeekOccurrence.equals(rightDayOfWeekOccurrence)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.dayOfWeekOccurrence!= null) {
                    return false;
                }
            }
        }
        {
            DaysOfWeekType leftDaysOfWeek;
            leftDaysOfWeek = this.getDaysOfWeek();
            DaysOfWeekType rightDaysOfWeek;
            rightDaysOfWeek = that.getDaysOfWeek();
            if (this.daysOfWeek!= null) {
                if (that.daysOfWeek!= null) {
                    if (!leftDaysOfWeek.equals(rightDaysOfWeek)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.daysOfWeek!= null) {
                    return false;
                }
            }
        }
        {
            XMLGregorianCalendar leftTime;
            leftTime = this.getTime();
            XMLGregorianCalendar rightTime;
            rightTime = that.getTime();
            if (this.time!= null) {
                if (that.time!= null) {
                    if (!leftTime.equals(rightTime)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.time!= null) {
                    return false;
                }
            }
        }
        {
            Duration leftRelative;
            leftRelative = this.getRelative();
            Duration rightRelative;
            rightRelative = that.getRelative();
            if (this.relative!= null) {
                if (that.relative!= null) {
                    if (!leftRelative.equals(rightRelative)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.relative!= null) {
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
            XMLGregorianCalendar theDateTime;
            theDateTime = this.getDateTime();
            if (this.dateTime!= null) {
                currentHashCode += theDateTime.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            MonthType theMonth;
            theMonth = this.getMonth();
            if (this.month!= null) {
                currentHashCode += theMonth.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            Short theDayOfMonth;
            theDayOfMonth = this.getDayOfMonth();
            if (this.dayOfMonth!= null) {
                currentHashCode += theDayOfMonth.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            Short theCalendarWeek;
            theCalendarWeek = this.getCalendarWeek();
            if (this.calendarWeek!= null) {
                currentHashCode += theCalendarWeek.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String theDayOfWeekOccurrence;
            theDayOfWeekOccurrence = this.getDayOfWeekOccurrence();
            if (this.dayOfWeekOccurrence!= null) {
                currentHashCode += theDayOfWeekOccurrence.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            DaysOfWeekType theDaysOfWeek;
            theDaysOfWeek = this.getDaysOfWeek();
            if (this.daysOfWeek!= null) {
                currentHashCode += theDaysOfWeek.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            XMLGregorianCalendar theTime;
            theTime = this.getTime();
            if (this.time!= null) {
                currentHashCode += theTime.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            Duration theRelative;
            theRelative = this.getRelative();
            if (this.relative!= null) {
                currentHashCode += theRelative.hashCode();
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
            XMLGregorianCalendar theDateTime;
            theDateTime = this.getDateTime();
            strategy.appendField(locator, this, "dateTime", buffer, theDateTime, (this.dateTime!= null));
        }
        {
            MonthType theMonth;
            theMonth = this.getMonth();
            strategy.appendField(locator, this, "month", buffer, theMonth, (this.month!= null));
        }
        {
            Short theDayOfMonth;
            theDayOfMonth = this.getDayOfMonth();
            strategy.appendField(locator, this, "dayOfMonth", buffer, theDayOfMonth, (this.dayOfMonth!= null));
        }
        {
            Short theCalendarWeek;
            theCalendarWeek = this.getCalendarWeek();
            strategy.appendField(locator, this, "calendarWeek", buffer, theCalendarWeek, (this.calendarWeek!= null));
        }
        {
            String theDayOfWeekOccurrence;
            theDayOfWeekOccurrence = this.getDayOfWeekOccurrence();
            strategy.appendField(locator, this, "dayOfWeekOccurrence", buffer, theDayOfWeekOccurrence, (this.dayOfWeekOccurrence!= null));
        }
        {
            DaysOfWeekType theDaysOfWeek;
            theDaysOfWeek = this.getDaysOfWeek();
            strategy.appendField(locator, this, "daysOfWeek", buffer, theDaysOfWeek, (this.daysOfWeek!= null));
        }
        {
            XMLGregorianCalendar theTime;
            theTime = this.getTime();
            strategy.appendField(locator, this, "time", buffer, theTime, (this.time!= null));
        }
        {
            Duration theRelative;
            theRelative = this.getRelative();
            strategy.appendField(locator, this, "relative", buffer, theRelative, (this.relative!= null));
        }
        return buffer;
    }

}
