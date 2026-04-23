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
 * <p>Java class for TimeInformationDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeInformationDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="utc" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="utcOffset" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *         &lt;element name="dayOfWeek" type="{http://docs.eebus.org/spine/xsd/v1}DayOfWeekType" minOccurs="0"/&gt;
 *         &lt;element name="calendarWeek" type="{http://docs.eebus.org/spine/xsd/v1}CalendarWeekType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeInformationDataType", propOrder = {
    "utc",
    "utcOffset",
    "dayOfWeek",
    "calendarWeek"
})
public class TimeInformationDataType implements Cloneable, CopyTo, ToString
{

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar utc;
    protected Duration utcOffset;
    @XmlSchemaType(name = "string")
    protected DayOfWeekType dayOfWeek;
    @XmlSchemaType(name = "unsignedByte")
    protected Short calendarWeek;

    /**
     * Default no-arg constructor
     * 
     */
    public TimeInformationDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public TimeInformationDataType(final XMLGregorianCalendar utc, final Duration utcOffset, final DayOfWeekType dayOfWeek, final Short calendarWeek) {
        this.utc = utc;
        this.utcOffset = utcOffset;
        this.dayOfWeek = dayOfWeek;
        this.calendarWeek = calendarWeek;
    }

    /**
     * Gets the value of the utc property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUtc() {
        return utc;
    }

    /**
     * Sets the value of the utc property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUtc(XMLGregorianCalendar value) {
        this.utc = value;
    }

    /**
     * Gets the value of the utcOffset property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getUtcOffset() {
        return utcOffset;
    }

    /**
     * Sets the value of the utcOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setUtcOffset(Duration value) {
        this.utcOffset = value;
    }

    /**
     * Gets the value of the dayOfWeek property.
     * 
     * @return
     *     possible object is
     *     {@link DayOfWeekType }
     *     
     */
    public DayOfWeekType getDayOfWeek() {
        return dayOfWeek;
    }

    /**
     * Sets the value of the dayOfWeek property.
     * 
     * @param value
     *     allowed object is
     *     {@link DayOfWeekType }
     *     
     */
    public void setDayOfWeek(DayOfWeekType value) {
        this.dayOfWeek = value;
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
     * Sets the value of the utc property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     * @return
     *     The class instance
     */
    public TimeInformationDataType withUtc(XMLGregorianCalendar value) {
        setUtc(value);
        return this;
    }

    /**
     * Sets the value of the utcOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     * @return
     *     The class instance
     */
    public TimeInformationDataType withUtcOffset(Duration value) {
        setUtcOffset(value);
        return this;
    }

    /**
     * Sets the value of the dayOfWeek property.
     * 
     * @param value
     *     allowed object is
     *     {@link DayOfWeekType }
     * @return
     *     The class instance
     */
    public TimeInformationDataType withDayOfWeek(DayOfWeekType value) {
        setDayOfWeek(value);
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
    public TimeInformationDataType withCalendarWeek(Short value) {
        setCalendarWeek(value);
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
        if (draftCopy instanceof TimeInformationDataType) {
            final TimeInformationDataType copy = ((TimeInformationDataType) draftCopy);
            {
                Boolean utcShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.utc!= null));
                if (utcShouldBeCopiedAndSet == Boolean.TRUE) {
                    XMLGregorianCalendar sourceUtc;
                    sourceUtc = this.getUtc();
                    XMLGregorianCalendar copyUtc = ((XMLGregorianCalendar) strategy.copy(LocatorUtils.property(locator, "utc", sourceUtc), sourceUtc, (this.utc!= null)));
                    copy.setUtc(copyUtc);
                } else {
                    if (utcShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.utc = null;
                    }
                }
            }
            {
                Boolean utcOffsetShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.utcOffset!= null));
                if (utcOffsetShouldBeCopiedAndSet == Boolean.TRUE) {
                    Duration sourceUtcOffset;
                    sourceUtcOffset = this.getUtcOffset();
                    Duration copyUtcOffset = ((Duration) strategy.copy(LocatorUtils.property(locator, "utcOffset", sourceUtcOffset), sourceUtcOffset, (this.utcOffset!= null)));
                    copy.setUtcOffset(copyUtcOffset);
                } else {
                    if (utcOffsetShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.utcOffset = null;
                    }
                }
            }
            {
                Boolean dayOfWeekShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.dayOfWeek!= null));
                if (dayOfWeekShouldBeCopiedAndSet == Boolean.TRUE) {
                    DayOfWeekType sourceDayOfWeek;
                    sourceDayOfWeek = this.getDayOfWeek();
                    DayOfWeekType copyDayOfWeek = ((DayOfWeekType) strategy.copy(LocatorUtils.property(locator, "dayOfWeek", sourceDayOfWeek), sourceDayOfWeek, (this.dayOfWeek!= null)));
                    copy.setDayOfWeek(copyDayOfWeek);
                } else {
                    if (dayOfWeekShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.dayOfWeek = null;
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
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new TimeInformationDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TimeInformationDataType that = ((TimeInformationDataType) object);
        {
            XMLGregorianCalendar leftUtc;
            leftUtc = this.getUtc();
            XMLGregorianCalendar rightUtc;
            rightUtc = that.getUtc();
            if (this.utc!= null) {
                if (that.utc!= null) {
                    if (!leftUtc.equals(rightUtc)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.utc!= null) {
                    return false;
                }
            }
        }
        {
            Duration leftUtcOffset;
            leftUtcOffset = this.getUtcOffset();
            Duration rightUtcOffset;
            rightUtcOffset = that.getUtcOffset();
            if (this.utcOffset!= null) {
                if (that.utcOffset!= null) {
                    if (!leftUtcOffset.equals(rightUtcOffset)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.utcOffset!= null) {
                    return false;
                }
            }
        }
        {
            DayOfWeekType leftDayOfWeek;
            leftDayOfWeek = this.getDayOfWeek();
            DayOfWeekType rightDayOfWeek;
            rightDayOfWeek = that.getDayOfWeek();
            if (this.dayOfWeek!= null) {
                if (that.dayOfWeek!= null) {
                    if (!leftDayOfWeek.equals(rightDayOfWeek)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.dayOfWeek!= null) {
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
        return true;
    }

    @Override
    public int hashCode() {
        int currentHashCode = 1;
        {
            currentHashCode = (currentHashCode* 31);
            XMLGregorianCalendar theUtc;
            theUtc = this.getUtc();
            if (this.utc!= null) {
                currentHashCode += theUtc.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            Duration theUtcOffset;
            theUtcOffset = this.getUtcOffset();
            if (this.utcOffset!= null) {
                currentHashCode += theUtcOffset.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            DayOfWeekType theDayOfWeek;
            theDayOfWeek = this.getDayOfWeek();
            if (this.dayOfWeek!= null) {
                currentHashCode += theDayOfWeek.hashCode();
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
            XMLGregorianCalendar theUtc;
            theUtc = this.getUtc();
            strategy.appendField(locator, this, "utc", buffer, theUtc, (this.utc!= null));
        }
        {
            Duration theUtcOffset;
            theUtcOffset = this.getUtcOffset();
            strategy.appendField(locator, this, "utcOffset", buffer, theUtcOffset, (this.utcOffset!= null));
        }
        {
            DayOfWeekType theDayOfWeek;
            theDayOfWeek = this.getDayOfWeek();
            strategy.appendField(locator, this, "dayOfWeek", buffer, theDayOfWeek, (this.dayOfWeek!= null));
        }
        {
            Short theCalendarWeek;
            theCalendarWeek = this.getCalendarWeek();
            strategy.appendField(locator, this, "calendarWeek", buffer, theCalendarWeek, (this.calendarWeek!= null));
        }
        return buffer;
    }

}
