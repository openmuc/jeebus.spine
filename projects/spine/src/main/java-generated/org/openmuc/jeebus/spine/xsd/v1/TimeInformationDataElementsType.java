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
 * <p>Java class for TimeInformationDataElementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeInformationDataElementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="utc" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="utcOffset" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="dayOfWeek" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="calendarWeek" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeInformationDataElementsType", propOrder = {
    "utc",
    "utcOffset",
    "dayOfWeek",
    "calendarWeek"
})
public class TimeInformationDataElementsType implements Cloneable, CopyTo, ToString
{

    protected ElementTagType utc;
    protected ElementTagType utcOffset;
    protected ElementTagType dayOfWeek;
    protected ElementTagType calendarWeek;

    /**
     * Default no-arg constructor
     * 
     */
    public TimeInformationDataElementsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public TimeInformationDataElementsType(final ElementTagType utc, final ElementTagType utcOffset, final ElementTagType dayOfWeek, final ElementTagType calendarWeek) {
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
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getUtc() {
        return utc;
    }

    /**
     * Sets the value of the utc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setUtc(ElementTagType value) {
        this.utc = value;
    }

    /**
     * Gets the value of the utcOffset property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getUtcOffset() {
        return utcOffset;
    }

    /**
     * Sets the value of the utcOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setUtcOffset(ElementTagType value) {
        this.utcOffset = value;
    }

    /**
     * Gets the value of the dayOfWeek property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getDayOfWeek() {
        return dayOfWeek;
    }

    /**
     * Sets the value of the dayOfWeek property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setDayOfWeek(ElementTagType value) {
        this.dayOfWeek = value;
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
     * Sets the value of the utc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public TimeInformationDataElementsType withUtc(ElementTagType value) {
        setUtc(value);
        return this;
    }

    /**
     * Sets the value of the utcOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public TimeInformationDataElementsType withUtcOffset(ElementTagType value) {
        setUtcOffset(value);
        return this;
    }

    /**
     * Sets the value of the dayOfWeek property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public TimeInformationDataElementsType withDayOfWeek(ElementTagType value) {
        setDayOfWeek(value);
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
    public TimeInformationDataElementsType withCalendarWeek(ElementTagType value) {
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
        if (draftCopy instanceof TimeInformationDataElementsType) {
            final TimeInformationDataElementsType copy = ((TimeInformationDataElementsType) draftCopy);
            {
                Boolean utcShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.utc!= null));
                if (utcShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceUtc;
                    sourceUtc = this.getUtc();
                    ElementTagType copyUtc = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "utc", sourceUtc), sourceUtc, (this.utc!= null)));
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
                    ElementTagType sourceUtcOffset;
                    sourceUtcOffset = this.getUtcOffset();
                    ElementTagType copyUtcOffset = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "utcOffset", sourceUtcOffset), sourceUtcOffset, (this.utcOffset!= null)));
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
                    ElementTagType sourceDayOfWeek;
                    sourceDayOfWeek = this.getDayOfWeek();
                    ElementTagType copyDayOfWeek = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "dayOfWeek", sourceDayOfWeek), sourceDayOfWeek, (this.dayOfWeek!= null)));
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
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new TimeInformationDataElementsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TimeInformationDataElementsType that = ((TimeInformationDataElementsType) object);
        {
            ElementTagType leftUtc;
            leftUtc = this.getUtc();
            ElementTagType rightUtc;
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
            ElementTagType leftUtcOffset;
            leftUtcOffset = this.getUtcOffset();
            ElementTagType rightUtcOffset;
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
            ElementTagType leftDayOfWeek;
            leftDayOfWeek = this.getDayOfWeek();
            ElementTagType rightDayOfWeek;
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
        return true;
    }

    @Override
    public int hashCode() {
        int currentHashCode = 1;
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theUtc;
            theUtc = this.getUtc();
            if (this.utc!= null) {
                currentHashCode += theUtc.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theUtcOffset;
            theUtcOffset = this.getUtcOffset();
            if (this.utcOffset!= null) {
                currentHashCode += theUtcOffset.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theDayOfWeek;
            theDayOfWeek = this.getDayOfWeek();
            if (this.dayOfWeek!= null) {
                currentHashCode += theDayOfWeek.hashCode();
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
            ElementTagType theUtc;
            theUtc = this.getUtc();
            strategy.appendField(locator, this, "utc", buffer, theUtc, (this.utc!= null));
        }
        {
            ElementTagType theUtcOffset;
            theUtcOffset = this.getUtcOffset();
            strategy.appendField(locator, this, "utcOffset", buffer, theUtcOffset, (this.utcOffset!= null));
        }
        {
            ElementTagType theDayOfWeek;
            theDayOfWeek = this.getDayOfWeek();
            strategy.appendField(locator, this, "dayOfWeek", buffer, theDayOfWeek, (this.dayOfWeek!= null));
        }
        {
            ElementTagType theCalendarWeek;
            theCalendarWeek = this.getCalendarWeek();
            strategy.appendField(locator, this, "calendarWeek", buffer, theCalendarWeek, (this.calendarWeek!= null));
        }
        return buffer;
    }

}
