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
import jakarta.xml.bind.annotation.XmlElement;
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
 * <p>Java class for DeviceConfigurationKeyValueValueElementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeviceConfigurationKeyValueValueElementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="boolean" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="date" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="dateTime" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="duration" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="string" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="time" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="scaledNumber" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberElementsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceConfigurationKeyValueValueElementsType", propOrder = {
    "_boolean",
    "date",
    "dateTime",
    "duration",
    "string",
    "time",
    "scaledNumber"
})
public class DeviceConfigurationKeyValueValueElementsType implements Cloneable, CopyTo, ToString
{

    @XmlElement(name = "boolean")
    protected ElementTagType _boolean;
    protected ElementTagType date;
    protected ElementTagType dateTime;
    protected ElementTagType duration;
    protected ElementTagType string;
    protected ElementTagType time;
    protected ScaledNumberElementsType scaledNumber;

    /**
     * Default no-arg constructor
     * 
     */
    public DeviceConfigurationKeyValueValueElementsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public DeviceConfigurationKeyValueValueElementsType(final ElementTagType _boolean, final ElementTagType date, final ElementTagType dateTime, final ElementTagType duration, final ElementTagType string, final ElementTagType time, final ScaledNumberElementsType scaledNumber) {
        this._boolean = _boolean;
        this.date = date;
        this.dateTime = dateTime;
        this.duration = duration;
        this.string = string;
        this.time = time;
        this.scaledNumber = scaledNumber;
    }

    /**
     * Gets the value of the boolean property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getBoolean() {
        return _boolean;
    }

    /**
     * Sets the value of the boolean property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setBoolean(ElementTagType value) {
        this._boolean = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setDate(ElementTagType value) {
        this.date = value;
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
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setDuration(ElementTagType value) {
        this.duration = value;
    }

    /**
     * Gets the value of the string property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getString() {
        return string;
    }

    /**
     * Sets the value of the string property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setString(ElementTagType value) {
        this.string = value;
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
     * Gets the value of the scaledNumber property.
     * 
     * @return
     *     possible object is
     *     {@link ScaledNumberElementsType }
     *     
     */
    public ScaledNumberElementsType getScaledNumber() {
        return scaledNumber;
    }

    /**
     * Sets the value of the scaledNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberElementsType }
     *     
     */
    public void setScaledNumber(ScaledNumberElementsType value) {
        this.scaledNumber = value;
    }

    /**
     * Sets the value of the boolean property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public DeviceConfigurationKeyValueValueElementsType withBoolean(ElementTagType value) {
        setBoolean(value);
        return this;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public DeviceConfigurationKeyValueValueElementsType withDate(ElementTagType value) {
        setDate(value);
        return this;
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
    public DeviceConfigurationKeyValueValueElementsType withDateTime(ElementTagType value) {
        setDateTime(value);
        return this;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public DeviceConfigurationKeyValueValueElementsType withDuration(ElementTagType value) {
        setDuration(value);
        return this;
    }

    /**
     * Sets the value of the string property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public DeviceConfigurationKeyValueValueElementsType withString(ElementTagType value) {
        setString(value);
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
    public DeviceConfigurationKeyValueValueElementsType withTime(ElementTagType value) {
        setTime(value);
        return this;
    }

    /**
     * Sets the value of the scaledNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberElementsType }
     * @return
     *     The class instance
     */
    public DeviceConfigurationKeyValueValueElementsType withScaledNumber(ScaledNumberElementsType value) {
        setScaledNumber(value);
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
        if (draftCopy instanceof DeviceConfigurationKeyValueValueElementsType) {
            final DeviceConfigurationKeyValueValueElementsType copy = ((DeviceConfigurationKeyValueValueElementsType) draftCopy);
            {
                Boolean _booleanShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this._boolean!= null));
                if (_booleanShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceBoolean;
                    sourceBoolean = this.getBoolean();
                    ElementTagType copyBoolean = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "_boolean", sourceBoolean), sourceBoolean, (this._boolean!= null)));
                    copy.setBoolean(copyBoolean);
                } else {
                    if (_booleanShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy._boolean = null;
                    }
                }
            }
            {
                Boolean dateShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.date!= null));
                if (dateShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceDate;
                    sourceDate = this.getDate();
                    ElementTagType copyDate = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "date", sourceDate), sourceDate, (this.date!= null)));
                    copy.setDate(copyDate);
                } else {
                    if (dateShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.date = null;
                    }
                }
            }
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
                Boolean durationShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.duration!= null));
                if (durationShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceDuration;
                    sourceDuration = this.getDuration();
                    ElementTagType copyDuration = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "duration", sourceDuration), sourceDuration, (this.duration!= null)));
                    copy.setDuration(copyDuration);
                } else {
                    if (durationShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.duration = null;
                    }
                }
            }
            {
                Boolean stringShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.string!= null));
                if (stringShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceString;
                    sourceString = this.getString();
                    ElementTagType copyString = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "string", sourceString), sourceString, (this.string!= null)));
                    copy.setString(copyString);
                } else {
                    if (stringShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.string = null;
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
                Boolean scaledNumberShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.scaledNumber!= null));
                if (scaledNumberShouldBeCopiedAndSet == Boolean.TRUE) {
                    ScaledNumberElementsType sourceScaledNumber;
                    sourceScaledNumber = this.getScaledNumber();
                    ScaledNumberElementsType copyScaledNumber = ((ScaledNumberElementsType) strategy.copy(LocatorUtils.property(locator, "scaledNumber", sourceScaledNumber), sourceScaledNumber, (this.scaledNumber!= null)));
                    copy.setScaledNumber(copyScaledNumber);
                } else {
                    if (scaledNumberShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.scaledNumber = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new DeviceConfigurationKeyValueValueElementsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DeviceConfigurationKeyValueValueElementsType that = ((DeviceConfigurationKeyValueValueElementsType) object);
        {
            ElementTagType leftBoolean;
            leftBoolean = this.getBoolean();
            ElementTagType rightBoolean;
            rightBoolean = that.getBoolean();
            if (this._boolean!= null) {
                if (that._boolean!= null) {
                    if (!leftBoolean.equals(rightBoolean)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that._boolean!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftDate;
            leftDate = this.getDate();
            ElementTagType rightDate;
            rightDate = that.getDate();
            if (this.date!= null) {
                if (that.date!= null) {
                    if (!leftDate.equals(rightDate)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.date!= null) {
                    return false;
                }
            }
        }
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
            ElementTagType leftDuration;
            leftDuration = this.getDuration();
            ElementTagType rightDuration;
            rightDuration = that.getDuration();
            if (this.duration!= null) {
                if (that.duration!= null) {
                    if (!leftDuration.equals(rightDuration)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.duration!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftString;
            leftString = this.getString();
            ElementTagType rightString;
            rightString = that.getString();
            if (this.string!= null) {
                if (that.string!= null) {
                    if (!leftString.equals(rightString)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.string!= null) {
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
            ScaledNumberElementsType leftScaledNumber;
            leftScaledNumber = this.getScaledNumber();
            ScaledNumberElementsType rightScaledNumber;
            rightScaledNumber = that.getScaledNumber();
            if (this.scaledNumber!= null) {
                if (that.scaledNumber!= null) {
                    if (!leftScaledNumber.equals(rightScaledNumber)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.scaledNumber!= null) {
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
            ElementTagType theBoolean;
            theBoolean = this.getBoolean();
            if (this._boolean!= null) {
                currentHashCode += theBoolean.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theDate;
            theDate = this.getDate();
            if (this.date!= null) {
                currentHashCode += theDate.hashCode();
            }
        }
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
            ElementTagType theDuration;
            theDuration = this.getDuration();
            if (this.duration!= null) {
                currentHashCode += theDuration.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theString;
            theString = this.getString();
            if (this.string!= null) {
                currentHashCode += theString.hashCode();
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
            ScaledNumberElementsType theScaledNumber;
            theScaledNumber = this.getScaledNumber();
            if (this.scaledNumber!= null) {
                currentHashCode += theScaledNumber.hashCode();
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
            ElementTagType theBoolean;
            theBoolean = this.getBoolean();
            strategy.appendField(locator, this, "_boolean", buffer, theBoolean, (this._boolean!= null));
        }
        {
            ElementTagType theDate;
            theDate = this.getDate();
            strategy.appendField(locator, this, "date", buffer, theDate, (this.date!= null));
        }
        {
            ElementTagType theDateTime;
            theDateTime = this.getDateTime();
            strategy.appendField(locator, this, "dateTime", buffer, theDateTime, (this.dateTime!= null));
        }
        {
            ElementTagType theDuration;
            theDuration = this.getDuration();
            strategy.appendField(locator, this, "duration", buffer, theDuration, (this.duration!= null));
        }
        {
            ElementTagType theString;
            theString = this.getString();
            strategy.appendField(locator, this, "string", buffer, theString, (this.string!= null));
        }
        {
            ElementTagType theTime;
            theTime = this.getTime();
            strategy.appendField(locator, this, "time", buffer, theTime, (this.time!= null));
        }
        {
            ScaledNumberElementsType theScaledNumber;
            theScaledNumber = this.getScaledNumber();
            strategy.appendField(locator, this, "scaledNumber", buffer, theScaledNumber, (this.scaledNumber!= null));
        }
        return buffer;
    }

}
