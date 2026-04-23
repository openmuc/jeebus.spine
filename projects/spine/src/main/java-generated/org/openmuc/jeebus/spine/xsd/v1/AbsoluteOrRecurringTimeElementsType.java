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
 * <p>Java class for AbsoluteOrRecurringTimeElementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbsoluteOrRecurringTimeElementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dateTime" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="month" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="dayOfMonth" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="calendarWeek" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="dayOfWeekOccurrence" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="daysOfWeek" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="time" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="relative" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbsoluteOrRecurringTimeElementsType", propOrder = {
    "dateTime",
    "month",
    "dayOfMonth",
    "calendarWeek",
    "dayOfWeekOccurrence",
    "daysOfWeek",
    "time",
    "relative"
})
public class AbsoluteOrRecurringTimeElementsType implements Cloneable, CopyTo, ToString
{

    protected ElementTagType dateTime;
    protected ElementTagType month;
    protected ElementTagType dayOfMonth;
    protected ElementTagType calendarWeek;
    protected ElementTagType dayOfWeekOccurrence;
    protected ElementTagType daysOfWeek;
    protected ElementTagType time;
    protected ElementTagType relative;

    /**
     * Default no-arg constructor
     * 
     */
    public AbsoluteOrRecurringTimeElementsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public AbsoluteOrRecurringTimeElementsType(final ElementTagType dateTime, final ElementTagType month, final ElementTagType dayOfMonth, final ElementTagType calendarWeek, final ElementTagType dayOfWeekOccurrence, final ElementTagType daysOfWeek, final ElementTagType time, final ElementTagType relative) {
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
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getDateTime() {
        return dateTime;
    }

    /**
     * Sets the value of the dateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setDateTime(ElementTagType value) {
        this.dateTime = value;
    }

    /**
     * Gets the value of the month property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getMonth() {
        return month;
    }

    /**
     * Sets the value of the month property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setMonth(ElementTagType value) {
        this.month = value;
    }

    /**
     * Gets the value of the dayOfMonth property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getDayOfMonth() {
        return dayOfMonth;
    }

    /**
     * Sets the value of the dayOfMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setDayOfMonth(ElementTagType value) {
        this.dayOfMonth = value;
    }

    /**
     * Gets the value of the calendarWeek property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getCalendarWeek() {
        return calendarWeek;
    }

    /**
     * Sets the value of the calendarWeek property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setCalendarWeek(ElementTagType value) {
        this.calendarWeek = value;
    }

    /**
     * Gets the value of the dayOfWeekOccurrence property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getDayOfWeekOccurrence() {
        return dayOfWeekOccurrence;
    }

    /**
     * Sets the value of the dayOfWeekOccurrence property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setDayOfWeekOccurrence(ElementTagType value) {
        this.dayOfWeekOccurrence = value;
    }

    /**
     * Gets the value of the daysOfWeek property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getDaysOfWeek() {
        return daysOfWeek;
    }

    /**
     * Sets the value of the daysOfWeek property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setDaysOfWeek(ElementTagType value) {
        this.daysOfWeek = value;
    }

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setTime(ElementTagType value) {
        this.time = value;
    }

    /**
     * Gets the value of the relative property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getRelative() {
        return relative;
    }

    /**
     * Sets the value of the relative property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setRelative(ElementTagType value) {
        this.relative = value;
    }

    /**
     * Sets the value of the dateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public AbsoluteOrRecurringTimeElementsType withDateTime(ElementTagType value) {
        setDateTime(value);
        return this;
    }

    /**
     * Sets the value of the month property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public AbsoluteOrRecurringTimeElementsType withMonth(ElementTagType value) {
        setMonth(value);
        return this;
    }

    /**
     * Sets the value of the dayOfMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public AbsoluteOrRecurringTimeElementsType withDayOfMonth(ElementTagType value) {
        setDayOfMonth(value);
        return this;
    }

    /**
     * Sets the value of the calendarWeek property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public AbsoluteOrRecurringTimeElementsType withCalendarWeek(ElementTagType value) {
        setCalendarWeek(value);
        return this;
    }

    /**
     * Sets the value of the dayOfWeekOccurrence property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public AbsoluteOrRecurringTimeElementsType withDayOfWeekOccurrence(ElementTagType value) {
        setDayOfWeekOccurrence(value);
        return this;
    }

    /**
     * Sets the value of the daysOfWeek property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public AbsoluteOrRecurringTimeElementsType withDaysOfWeek(ElementTagType value) {
        setDaysOfWeek(value);
        return this;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public AbsoluteOrRecurringTimeElementsType withTime(ElementTagType value) {
        setTime(value);
        return this;
    }

    /**
     * Sets the value of the relative property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public AbsoluteOrRecurringTimeElementsType withRelative(ElementTagType value) {
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
        if (draftCopy instanceof AbsoluteOrRecurringTimeElementsType) {
            final AbsoluteOrRecurringTimeElementsType copy = ((AbsoluteOrRecurringTimeElementsType) draftCopy);
            {
                Boolean dateTimeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.dateTime!= null));
                if (dateTimeShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceDateTime;
                    sourceDateTime = this.getDateTime();
                    ElementTagType copyDateTime = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "dateTime", sourceDateTime), sourceDateTime, (this.dateTime!= null)));
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
                    ElementTagType sourceMonth;
                    sourceMonth = this.getMonth();
                    ElementTagType copyMonth = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "month", sourceMonth), sourceMonth, (this.month!= null)));
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
                    ElementTagType sourceDayOfMonth;
                    sourceDayOfMonth = this.getDayOfMonth();
                    ElementTagType copyDayOfMonth = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "dayOfMonth", sourceDayOfMonth), sourceDayOfMonth, (this.dayOfMonth!= null)));
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
                    ElementTagType sourceCalendarWeek;
                    sourceCalendarWeek = this.getCalendarWeek();
                    ElementTagType copyCalendarWeek = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "calendarWeek", sourceCalendarWeek), sourceCalendarWeek, (this.calendarWeek!= null)));
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
                    ElementTagType sourceDayOfWeekOccurrence;
                    sourceDayOfWeekOccurrence = this.getDayOfWeekOccurrence();
                    ElementTagType copyDayOfWeekOccurrence = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "dayOfWeekOccurrence", sourceDayOfWeekOccurrence), sourceDayOfWeekOccurrence, (this.dayOfWeekOccurrence!= null)));
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
                    ElementTagType sourceDaysOfWeek;
                    sourceDaysOfWeek = this.getDaysOfWeek();
                    ElementTagType copyDaysOfWeek = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "daysOfWeek", sourceDaysOfWeek), sourceDaysOfWeek, (this.daysOfWeek!= null)));
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
                    ElementTagType sourceTime;
                    sourceTime = this.getTime();
                    ElementTagType copyTime = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "time", sourceTime), sourceTime, (this.time!= null)));
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
                    ElementTagType sourceRelative;
                    sourceRelative = this.getRelative();
                    ElementTagType copyRelative = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "relative", sourceRelative), sourceRelative, (this.relative!= null)));
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
        return new AbsoluteOrRecurringTimeElementsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final AbsoluteOrRecurringTimeElementsType that = ((AbsoluteOrRecurringTimeElementsType) object);
        {
            ElementTagType leftDateTime;
            leftDateTime = this.getDateTime();
            ElementTagType rightDateTime;
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
            ElementTagType leftMonth;
            leftMonth = this.getMonth();
            ElementTagType rightMonth;
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
            ElementTagType leftDayOfMonth;
            leftDayOfMonth = this.getDayOfMonth();
            ElementTagType rightDayOfMonth;
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
            ElementTagType leftCalendarWeek;
            leftCalendarWeek = this.getCalendarWeek();
            ElementTagType rightCalendarWeek;
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
            ElementTagType leftDayOfWeekOccurrence;
            leftDayOfWeekOccurrence = this.getDayOfWeekOccurrence();
            ElementTagType rightDayOfWeekOccurrence;
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
            ElementTagType leftDaysOfWeek;
            leftDaysOfWeek = this.getDaysOfWeek();
            ElementTagType rightDaysOfWeek;
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
            ElementTagType leftTime;
            leftTime = this.getTime();
            ElementTagType rightTime;
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
            ElementTagType leftRelative;
            leftRelative = this.getRelative();
            ElementTagType rightRelative;
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
            ElementTagType theDateTime;
            theDateTime = this.getDateTime();
            if (this.dateTime!= null) {
                currentHashCode += theDateTime.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theMonth;
            theMonth = this.getMonth();
            if (this.month!= null) {
                currentHashCode += theMonth.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theDayOfMonth;
            theDayOfMonth = this.getDayOfMonth();
            if (this.dayOfMonth!= null) {
                currentHashCode += theDayOfMonth.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theCalendarWeek;
            theCalendarWeek = this.getCalendarWeek();
            if (this.calendarWeek!= null) {
                currentHashCode += theCalendarWeek.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theDayOfWeekOccurrence;
            theDayOfWeekOccurrence = this.getDayOfWeekOccurrence();
            if (this.dayOfWeekOccurrence!= null) {
                currentHashCode += theDayOfWeekOccurrence.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theDaysOfWeek;
            theDaysOfWeek = this.getDaysOfWeek();
            if (this.daysOfWeek!= null) {
                currentHashCode += theDaysOfWeek.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theTime;
            theTime = this.getTime();
            if (this.time!= null) {
                currentHashCode += theTime.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theRelative;
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
            ElementTagType theDateTime;
            theDateTime = this.getDateTime();
            strategy.appendField(locator, this, "dateTime", buffer, theDateTime, (this.dateTime!= null));
        }
        {
            ElementTagType theMonth;
            theMonth = this.getMonth();
            strategy.appendField(locator, this, "month", buffer, theMonth, (this.month!= null));
        }
        {
            ElementTagType theDayOfMonth;
            theDayOfMonth = this.getDayOfMonth();
            strategy.appendField(locator, this, "dayOfMonth", buffer, theDayOfMonth, (this.dayOfMonth!= null));
        }
        {
            ElementTagType theCalendarWeek;
            theCalendarWeek = this.getCalendarWeek();
            strategy.appendField(locator, this, "calendarWeek", buffer, theCalendarWeek, (this.calendarWeek!= null));
        }
        {
            ElementTagType theDayOfWeekOccurrence;
            theDayOfWeekOccurrence = this.getDayOfWeekOccurrence();
            strategy.appendField(locator, this, "dayOfWeekOccurrence", buffer, theDayOfWeekOccurrence, (this.dayOfWeekOccurrence!= null));
        }
        {
            ElementTagType theDaysOfWeek;
            theDaysOfWeek = this.getDaysOfWeek();
            strategy.appendField(locator, this, "daysOfWeek", buffer, theDaysOfWeek, (this.daysOfWeek!= null));
        }
        {
            ElementTagType theTime;
            theTime = this.getTime();
            strategy.appendField(locator, this, "time", buffer, theTime, (this.time!= null));
        }
        {
            ElementTagType theRelative;
            theRelative = this.getRelative();
            strategy.appendField(locator, this, "relative", buffer, theRelative, (this.relative!= null));
        }
        return buffer;
    }

}
