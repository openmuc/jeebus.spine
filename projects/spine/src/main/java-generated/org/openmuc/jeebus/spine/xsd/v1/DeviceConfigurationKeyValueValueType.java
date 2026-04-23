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
import jakarta.xml.bind.annotation.XmlElement;
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
 * <p>Java class for DeviceConfigurationKeyValueValueType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeviceConfigurationKeyValueValueType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="boolean" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="dateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="duration" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *         &lt;element name="string" type="{http://docs.eebus.org/spine/xsd/v1}DeviceConfigurationKeyValueStringType" minOccurs="0"/&gt;
 *         &lt;element name="time" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/&gt;
 *         &lt;element name="scaledNumber" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberType" minOccurs="0"/&gt;
 *         &lt;element name="integer" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceConfigurationKeyValueValueType", propOrder = {
    "_boolean",
    "date",
    "dateTime",
    "duration",
    "string",
    "time",
    "scaledNumber",
    "integer"
})
public class DeviceConfigurationKeyValueValueType implements Cloneable, CopyTo, ToString
{

    @XmlElement(name = "boolean")
    protected Boolean _boolean;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar date;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTime;
    protected Duration duration;
    protected String string;
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar time;
    protected ScaledNumberType scaledNumber;
    protected Long integer;

    /**
     * Default no-arg constructor
     * 
     */
    public DeviceConfigurationKeyValueValueType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public DeviceConfigurationKeyValueValueType(final Boolean _boolean, final XMLGregorianCalendar date, final XMLGregorianCalendar dateTime, final Duration duration, final String string, final XMLGregorianCalendar time, final ScaledNumberType scaledNumber, final Long integer) {
        this._boolean = _boolean;
        this.date = date;
        this.dateTime = dateTime;
        this.duration = duration;
        this.string = string;
        this.time = time;
        this.scaledNumber = scaledNumber;
        this.integer = integer;
    }

    /**
     * Gets the value of the boolean property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getBoolean() {
        return _boolean;
    }

    /**
     * Sets the value of the boolean property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBoolean(Boolean value) {
        this._boolean = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
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
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setDuration(Duration value) {
        this.duration = value;
    }

    /**
     * Gets the value of the string property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getString() {
        return string;
    }

    /**
     * Sets the value of the string property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setString(String value) {
        this.string = value;
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
     * Gets the value of the scaledNumber property.
     * 
     * @return
     *     possible object is
     *     {@link ScaledNumberType }
     *     
     */
    public ScaledNumberType getScaledNumber() {
        return scaledNumber;
    }

    /**
     * Sets the value of the scaledNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberType }
     *     
     */
    public void setScaledNumber(ScaledNumberType value) {
        this.scaledNumber = value;
    }

    /**
     * Gets the value of the integer property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInteger() {
        return integer;
    }

    /**
     * Sets the value of the integer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInteger(Long value) {
        this.integer = value;
    }

    /**
     * Sets the value of the boolean property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     * @return
     *     The class instance
     */
    public DeviceConfigurationKeyValueValueType withBoolean(Boolean value) {
        setBoolean(value);
        return this;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     * @return
     *     The class instance
     */
    public DeviceConfigurationKeyValueValueType withDate(XMLGregorianCalendar value) {
        setDate(value);
        return this;
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
    public DeviceConfigurationKeyValueValueType withDateTime(XMLGregorianCalendar value) {
        setDateTime(value);
        return this;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     * @return
     *     The class instance
     */
    public DeviceConfigurationKeyValueValueType withDuration(Duration value) {
        setDuration(value);
        return this;
    }

    /**
     * Sets the value of the string property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public DeviceConfigurationKeyValueValueType withString(String value) {
        setString(value);
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
    public DeviceConfigurationKeyValueValueType withTime(XMLGregorianCalendar value) {
        setTime(value);
        return this;
    }

    /**
     * Sets the value of the scaledNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberType }
     * @return
     *     The class instance
     */
    public DeviceConfigurationKeyValueValueType withScaledNumber(ScaledNumberType value) {
        setScaledNumber(value);
        return this;
    }

    /**
     * Sets the value of the integer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     * @return
     *     The class instance
     */
    public DeviceConfigurationKeyValueValueType withInteger(Long value) {
        setInteger(value);
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
        if (draftCopy instanceof DeviceConfigurationKeyValueValueType) {
            final DeviceConfigurationKeyValueValueType copy = ((DeviceConfigurationKeyValueValueType) draftCopy);
            {
                Boolean _booleanShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this._boolean!= null));
                if (_booleanShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceBoolean;
                    sourceBoolean = this.getBoolean();
                    Boolean copyBoolean = ((Boolean) strategy.copy(LocatorUtils.property(locator, "_boolean", sourceBoolean), sourceBoolean, (this._boolean!= null)));
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
                    XMLGregorianCalendar sourceDate;
                    sourceDate = this.getDate();
                    XMLGregorianCalendar copyDate = ((XMLGregorianCalendar) strategy.copy(LocatorUtils.property(locator, "date", sourceDate), sourceDate, (this.date!= null)));
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
                Boolean durationShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.duration!= null));
                if (durationShouldBeCopiedAndSet == Boolean.TRUE) {
                    Duration sourceDuration;
                    sourceDuration = this.getDuration();
                    Duration copyDuration = ((Duration) strategy.copy(LocatorUtils.property(locator, "duration", sourceDuration), sourceDuration, (this.duration!= null)));
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
                    String sourceString;
                    sourceString = this.getString();
                    String copyString = ((String) strategy.copy(LocatorUtils.property(locator, "string", sourceString), sourceString, (this.string!= null)));
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
                Boolean scaledNumberShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.scaledNumber!= null));
                if (scaledNumberShouldBeCopiedAndSet == Boolean.TRUE) {
                    ScaledNumberType sourceScaledNumber;
                    sourceScaledNumber = this.getScaledNumber();
                    ScaledNumberType copyScaledNumber = ((ScaledNumberType) strategy.copy(LocatorUtils.property(locator, "scaledNumber", sourceScaledNumber), sourceScaledNumber, (this.scaledNumber!= null)));
                    copy.setScaledNumber(copyScaledNumber);
                } else {
                    if (scaledNumberShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.scaledNumber = null;
                    }
                }
            }
            {
                Boolean integerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.integer!= null));
                if (integerShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceInteger;
                    sourceInteger = this.getInteger();
                    Long copyInteger = ((Long) strategy.copy(LocatorUtils.property(locator, "integer", sourceInteger), sourceInteger, (this.integer!= null)));
                    copy.setInteger(copyInteger);
                } else {
                    if (integerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.integer = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new DeviceConfigurationKeyValueValueType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DeviceConfigurationKeyValueValueType that = ((DeviceConfigurationKeyValueValueType) object);
        {
            Boolean leftBoolean;
            leftBoolean = this.getBoolean();
            Boolean rightBoolean;
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
            XMLGregorianCalendar leftDate;
            leftDate = this.getDate();
            XMLGregorianCalendar rightDate;
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
            Duration leftDuration;
            leftDuration = this.getDuration();
            Duration rightDuration;
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
            String leftString;
            leftString = this.getString();
            String rightString;
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
            ScaledNumberType leftScaledNumber;
            leftScaledNumber = this.getScaledNumber();
            ScaledNumberType rightScaledNumber;
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
        {
            Long leftInteger;
            leftInteger = this.getInteger();
            Long rightInteger;
            rightInteger = that.getInteger();
            if (this.integer!= null) {
                if (that.integer!= null) {
                    if (!leftInteger.equals(rightInteger)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.integer!= null) {
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
            Boolean theBoolean;
            theBoolean = this.getBoolean();
            if (this._boolean!= null) {
                currentHashCode += theBoolean.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            XMLGregorianCalendar theDate;
            theDate = this.getDate();
            if (this.date!= null) {
                currentHashCode += theDate.hashCode();
            }
        }
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
            Duration theDuration;
            theDuration = this.getDuration();
            if (this.duration!= null) {
                currentHashCode += theDuration.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String theString;
            theString = this.getString();
            if (this.string!= null) {
                currentHashCode += theString.hashCode();
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
            ScaledNumberType theScaledNumber;
            theScaledNumber = this.getScaledNumber();
            if (this.scaledNumber!= null) {
                currentHashCode += theScaledNumber.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            Long theInteger;
            theInteger = this.getInteger();
            if (this.integer!= null) {
                currentHashCode += theInteger.hashCode();
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
            Boolean theBoolean;
            theBoolean = this.getBoolean();
            strategy.appendField(locator, this, "_boolean", buffer, theBoolean, (this._boolean!= null));
        }
        {
            XMLGregorianCalendar theDate;
            theDate = this.getDate();
            strategy.appendField(locator, this, "date", buffer, theDate, (this.date!= null));
        }
        {
            XMLGregorianCalendar theDateTime;
            theDateTime = this.getDateTime();
            strategy.appendField(locator, this, "dateTime", buffer, theDateTime, (this.dateTime!= null));
        }
        {
            Duration theDuration;
            theDuration = this.getDuration();
            strategy.appendField(locator, this, "duration", buffer, theDuration, (this.duration!= null));
        }
        {
            String theString;
            theString = this.getString();
            strategy.appendField(locator, this, "string", buffer, theString, (this.string!= null));
        }
        {
            XMLGregorianCalendar theTime;
            theTime = this.getTime();
            strategy.appendField(locator, this, "time", buffer, theTime, (this.time!= null));
        }
        {
            ScaledNumberType theScaledNumber;
            theScaledNumber = this.getScaledNumber();
            strategy.appendField(locator, this, "scaledNumber", buffer, theScaledNumber, (this.scaledNumber!= null));
        }
        {
            Long theInteger;
            theInteger = this.getInteger();
            strategy.appendField(locator, this, "integer", buffer, theInteger, (this.integer!= null));
        }
        return buffer;
    }

}
