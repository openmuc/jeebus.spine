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
 * <p>Java class for DaysOfWeekType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DaysOfWeekType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="monday" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="tuesday" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="wednesday" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="thursday" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="friday" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="saturday" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="sunday" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DaysOfWeekType", propOrder = {
    "monday",
    "tuesday",
    "wednesday",
    "thursday",
    "friday",
    "saturday",
    "sunday"
})
public class DaysOfWeekType implements Cloneable, CopyTo, ToString
{

    protected ElementTagType monday;
    protected ElementTagType tuesday;
    protected ElementTagType wednesday;
    protected ElementTagType thursday;
    protected ElementTagType friday;
    protected ElementTagType saturday;
    protected ElementTagType sunday;

    /**
     * Default no-arg constructor
     * 
     */
    public DaysOfWeekType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public DaysOfWeekType(final ElementTagType monday, final ElementTagType tuesday, final ElementTagType wednesday, final ElementTagType thursday, final ElementTagType friday, final ElementTagType saturday, final ElementTagType sunday) {
        this.monday = monday;
        this.tuesday = tuesday;
        this.wednesday = wednesday;
        this.thursday = thursday;
        this.friday = friday;
        this.saturday = saturday;
        this.sunday = sunday;
    }

    /**
     * Gets the value of the monday property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getMonday() {
        return monday;
    }

    /**
     * Sets the value of the monday property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setMonday(ElementTagType value) {
        this.monday = value;
    }

    /**
     * Gets the value of the tuesday property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getTuesday() {
        return tuesday;
    }

    /**
     * Sets the value of the tuesday property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setTuesday(ElementTagType value) {
        this.tuesday = value;
    }

    /**
     * Gets the value of the wednesday property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getWednesday() {
        return wednesday;
    }

    /**
     * Sets the value of the wednesday property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setWednesday(ElementTagType value) {
        this.wednesday = value;
    }

    /**
     * Gets the value of the thursday property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getThursday() {
        return thursday;
    }

    /**
     * Sets the value of the thursday property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setThursday(ElementTagType value) {
        this.thursday = value;
    }

    /**
     * Gets the value of the friday property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getFriday() {
        return friday;
    }

    /**
     * Sets the value of the friday property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setFriday(ElementTagType value) {
        this.friday = value;
    }

    /**
     * Gets the value of the saturday property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getSaturday() {
        return saturday;
    }

    /**
     * Sets the value of the saturday property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setSaturday(ElementTagType value) {
        this.saturday = value;
    }

    /**
     * Gets the value of the sunday property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getSunday() {
        return sunday;
    }

    /**
     * Sets the value of the sunday property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setSunday(ElementTagType value) {
        this.sunday = value;
    }

    /**
     * Sets the value of the monday property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public DaysOfWeekType withMonday(ElementTagType value) {
        setMonday(value);
        return this;
    }

    /**
     * Sets the value of the tuesday property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public DaysOfWeekType withTuesday(ElementTagType value) {
        setTuesday(value);
        return this;
    }

    /**
     * Sets the value of the wednesday property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public DaysOfWeekType withWednesday(ElementTagType value) {
        setWednesday(value);
        return this;
    }

    /**
     * Sets the value of the thursday property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public DaysOfWeekType withThursday(ElementTagType value) {
        setThursday(value);
        return this;
    }

    /**
     * Sets the value of the friday property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public DaysOfWeekType withFriday(ElementTagType value) {
        setFriday(value);
        return this;
    }

    /**
     * Sets the value of the saturday property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public DaysOfWeekType withSaturday(ElementTagType value) {
        setSaturday(value);
        return this;
    }

    /**
     * Sets the value of the sunday property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public DaysOfWeekType withSunday(ElementTagType value) {
        setSunday(value);
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
        if (draftCopy instanceof DaysOfWeekType) {
            final DaysOfWeekType copy = ((DaysOfWeekType) draftCopy);
            {
                Boolean mondayShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.monday!= null));
                if (mondayShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceMonday;
                    sourceMonday = this.getMonday();
                    ElementTagType copyMonday = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "monday", sourceMonday), sourceMonday, (this.monday!= null)));
                    copy.setMonday(copyMonday);
                } else {
                    if (mondayShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.monday = null;
                    }
                }
            }
            {
                Boolean tuesdayShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.tuesday!= null));
                if (tuesdayShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceTuesday;
                    sourceTuesday = this.getTuesday();
                    ElementTagType copyTuesday = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "tuesday", sourceTuesday), sourceTuesday, (this.tuesday!= null)));
                    copy.setTuesday(copyTuesday);
                } else {
                    if (tuesdayShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.tuesday = null;
                    }
                }
            }
            {
                Boolean wednesdayShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.wednesday!= null));
                if (wednesdayShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceWednesday;
                    sourceWednesday = this.getWednesday();
                    ElementTagType copyWednesday = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "wednesday", sourceWednesday), sourceWednesday, (this.wednesday!= null)));
                    copy.setWednesday(copyWednesday);
                } else {
                    if (wednesdayShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.wednesday = null;
                    }
                }
            }
            {
                Boolean thursdayShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.thursday!= null));
                if (thursdayShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceThursday;
                    sourceThursday = this.getThursday();
                    ElementTagType copyThursday = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "thursday", sourceThursday), sourceThursday, (this.thursday!= null)));
                    copy.setThursday(copyThursday);
                } else {
                    if (thursdayShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.thursday = null;
                    }
                }
            }
            {
                Boolean fridayShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.friday!= null));
                if (fridayShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceFriday;
                    sourceFriday = this.getFriday();
                    ElementTagType copyFriday = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "friday", sourceFriday), sourceFriday, (this.friday!= null)));
                    copy.setFriday(copyFriday);
                } else {
                    if (fridayShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.friday = null;
                    }
                }
            }
            {
                Boolean saturdayShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.saturday!= null));
                if (saturdayShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceSaturday;
                    sourceSaturday = this.getSaturday();
                    ElementTagType copySaturday = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "saturday", sourceSaturday), sourceSaturday, (this.saturday!= null)));
                    copy.setSaturday(copySaturday);
                } else {
                    if (saturdayShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.saturday = null;
                    }
                }
            }
            {
                Boolean sundayShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.sunday!= null));
                if (sundayShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceSunday;
                    sourceSunday = this.getSunday();
                    ElementTagType copySunday = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "sunday", sourceSunday), sourceSunday, (this.sunday!= null)));
                    copy.setSunday(copySunday);
                } else {
                    if (sundayShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.sunday = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new DaysOfWeekType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DaysOfWeekType that = ((DaysOfWeekType) object);
        {
            ElementTagType leftMonday;
            leftMonday = this.getMonday();
            ElementTagType rightMonday;
            rightMonday = that.getMonday();
            if (this.monday!= null) {
                if (that.monday!= null) {
                    if (!leftMonday.equals(rightMonday)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.monday!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftTuesday;
            leftTuesday = this.getTuesday();
            ElementTagType rightTuesday;
            rightTuesday = that.getTuesday();
            if (this.tuesday!= null) {
                if (that.tuesday!= null) {
                    if (!leftTuesday.equals(rightTuesday)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.tuesday!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftWednesday;
            leftWednesday = this.getWednesday();
            ElementTagType rightWednesday;
            rightWednesday = that.getWednesday();
            if (this.wednesday!= null) {
                if (that.wednesday!= null) {
                    if (!leftWednesday.equals(rightWednesday)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.wednesday!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftThursday;
            leftThursday = this.getThursday();
            ElementTagType rightThursday;
            rightThursday = that.getThursday();
            if (this.thursday!= null) {
                if (that.thursday!= null) {
                    if (!leftThursday.equals(rightThursday)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.thursday!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftFriday;
            leftFriday = this.getFriday();
            ElementTagType rightFriday;
            rightFriday = that.getFriday();
            if (this.friday!= null) {
                if (that.friday!= null) {
                    if (!leftFriday.equals(rightFriday)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.friday!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftSaturday;
            leftSaturday = this.getSaturday();
            ElementTagType rightSaturday;
            rightSaturday = that.getSaturday();
            if (this.saturday!= null) {
                if (that.saturday!= null) {
                    if (!leftSaturday.equals(rightSaturday)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.saturday!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftSunday;
            leftSunday = this.getSunday();
            ElementTagType rightSunday;
            rightSunday = that.getSunday();
            if (this.sunday!= null) {
                if (that.sunday!= null) {
                    if (!leftSunday.equals(rightSunday)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.sunday!= null) {
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
            ElementTagType theMonday;
            theMonday = this.getMonday();
            if (this.monday!= null) {
                currentHashCode += theMonday.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theTuesday;
            theTuesday = this.getTuesday();
            if (this.tuesday!= null) {
                currentHashCode += theTuesday.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theWednesday;
            theWednesday = this.getWednesday();
            if (this.wednesday!= null) {
                currentHashCode += theWednesday.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theThursday;
            theThursday = this.getThursday();
            if (this.thursday!= null) {
                currentHashCode += theThursday.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theFriday;
            theFriday = this.getFriday();
            if (this.friday!= null) {
                currentHashCode += theFriday.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theSaturday;
            theSaturday = this.getSaturday();
            if (this.saturday!= null) {
                currentHashCode += theSaturday.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theSunday;
            theSunday = this.getSunday();
            if (this.sunday!= null) {
                currentHashCode += theSunday.hashCode();
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
            ElementTagType theMonday;
            theMonday = this.getMonday();
            strategy.appendField(locator, this, "monday", buffer, theMonday, (this.monday!= null));
        }
        {
            ElementTagType theTuesday;
            theTuesday = this.getTuesday();
            strategy.appendField(locator, this, "tuesday", buffer, theTuesday, (this.tuesday!= null));
        }
        {
            ElementTagType theWednesday;
            theWednesday = this.getWednesday();
            strategy.appendField(locator, this, "wednesday", buffer, theWednesday, (this.wednesday!= null));
        }
        {
            ElementTagType theThursday;
            theThursday = this.getThursday();
            strategy.appendField(locator, this, "thursday", buffer, theThursday, (this.thursday!= null));
        }
        {
            ElementTagType theFriday;
            theFriday = this.getFriday();
            strategy.appendField(locator, this, "friday", buffer, theFriday, (this.friday!= null));
        }
        {
            ElementTagType theSaturday;
            theSaturday = this.getSaturday();
            strategy.appendField(locator, this, "saturday", buffer, theSaturday, (this.saturday!= null));
        }
        {
            ElementTagType theSunday;
            theSunday = this.getSunday();
            strategy.appendField(locator, this, "sunday", buffer, theSunday, (this.sunday!= null));
        }
        return buffer;
    }

}
