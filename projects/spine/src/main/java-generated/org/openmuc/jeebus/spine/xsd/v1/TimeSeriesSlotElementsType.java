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
 * <p>Java class for TimeSeriesSlotElementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeSeriesSlotElementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="timeSeriesSlotId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="timePeriod" type="{http://docs.eebus.org/spine/xsd/v1}TimePeriodElementsType" minOccurs="0"/&gt;
 *         &lt;element name="duration" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="recurrenceInformation" type="{http://docs.eebus.org/spine/xsd/v1}AbsoluteOrRecurringTimeElementsType" minOccurs="0"/&gt;
 *         &lt;element name="value" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="minValue" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="maxValue" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeSeriesSlotElementsType", propOrder = {
    "timeSeriesSlotId",
    "timePeriod",
    "duration",
    "recurrenceInformation",
    "value",
    "minValue",
    "maxValue"
})
public class TimeSeriesSlotElementsType implements Cloneable, CopyTo, ToString
{

    protected ElementTagType timeSeriesSlotId;
    protected TimePeriodElementsType timePeriod;
    protected ElementTagType duration;
    protected AbsoluteOrRecurringTimeElementsType recurrenceInformation;
    protected ElementTagType value;
    protected ElementTagType minValue;
    protected ElementTagType maxValue;

    /**
     * Default no-arg constructor
     * 
     */
    public TimeSeriesSlotElementsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public TimeSeriesSlotElementsType(final ElementTagType timeSeriesSlotId, final TimePeriodElementsType timePeriod, final ElementTagType duration, final AbsoluteOrRecurringTimeElementsType recurrenceInformation, final ElementTagType value, final ElementTagType minValue, final ElementTagType maxValue) {
        this.timeSeriesSlotId = timeSeriesSlotId;
        this.timePeriod = timePeriod;
        this.duration = duration;
        this.recurrenceInformation = recurrenceInformation;
        this.value = value;
        this.minValue = minValue;
        this.maxValue = maxValue;
    }

    /**
     * Gets the value of the timeSeriesSlotId property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getTimeSeriesSlotId() {
        return timeSeriesSlotId;
    }

    /**
     * Sets the value of the timeSeriesSlotId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setTimeSeriesSlotId(ElementTagType value) {
        this.timeSeriesSlotId = value;
    }

    /**
     * Gets the value of the timePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodElementsType }
     *     
     */
    public TimePeriodElementsType getTimePeriod() {
        return timePeriod;
    }

    /**
     * Sets the value of the timePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodElementsType }
     *     
     */
    public void setTimePeriod(TimePeriodElementsType value) {
        this.timePeriod = value;
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
     * Gets the value of the recurrenceInformation property.
     * 
     * @return
     *     possible object is
     *     {@link AbsoluteOrRecurringTimeElementsType }
     *     
     */
    public AbsoluteOrRecurringTimeElementsType getRecurrenceInformation() {
        return recurrenceInformation;
    }

    /**
     * Sets the value of the recurrenceInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbsoluteOrRecurringTimeElementsType }
     *     
     */
    public void setRecurrenceInformation(AbsoluteOrRecurringTimeElementsType value) {
        this.recurrenceInformation = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setValue(ElementTagType value) {
        this.value = value;
    }

    /**
     * Gets the value of the minValue property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getMinValue() {
        return minValue;
    }

    /**
     * Sets the value of the minValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setMinValue(ElementTagType value) {
        this.minValue = value;
    }

    /**
     * Gets the value of the maxValue property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getMaxValue() {
        return maxValue;
    }

    /**
     * Sets the value of the maxValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setMaxValue(ElementTagType value) {
        this.maxValue = value;
    }

    /**
     * Sets the value of the timeSeriesSlotId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public TimeSeriesSlotElementsType withTimeSeriesSlotId(ElementTagType value) {
        setTimeSeriesSlotId(value);
        return this;
    }

    /**
     * Sets the value of the timePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodElementsType }
     * @return
     *     The class instance
     */
    public TimeSeriesSlotElementsType withTimePeriod(TimePeriodElementsType value) {
        setTimePeriod(value);
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
    public TimeSeriesSlotElementsType withDuration(ElementTagType value) {
        setDuration(value);
        return this;
    }

    /**
     * Sets the value of the recurrenceInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbsoluteOrRecurringTimeElementsType }
     * @return
     *     The class instance
     */
    public TimeSeriesSlotElementsType withRecurrenceInformation(AbsoluteOrRecurringTimeElementsType value) {
        setRecurrenceInformation(value);
        return this;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public TimeSeriesSlotElementsType withValue(ElementTagType value) {
        setValue(value);
        return this;
    }

    /**
     * Sets the value of the minValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public TimeSeriesSlotElementsType withMinValue(ElementTagType value) {
        setMinValue(value);
        return this;
    }

    /**
     * Sets the value of the maxValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public TimeSeriesSlotElementsType withMaxValue(ElementTagType value) {
        setMaxValue(value);
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
        if (draftCopy instanceof TimeSeriesSlotElementsType) {
            final TimeSeriesSlotElementsType copy = ((TimeSeriesSlotElementsType) draftCopy);
            {
                Boolean timeSeriesSlotIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.timeSeriesSlotId!= null));
                if (timeSeriesSlotIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceTimeSeriesSlotId;
                    sourceTimeSeriesSlotId = this.getTimeSeriesSlotId();
                    ElementTagType copyTimeSeriesSlotId = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "timeSeriesSlotId", sourceTimeSeriesSlotId), sourceTimeSeriesSlotId, (this.timeSeriesSlotId!= null)));
                    copy.setTimeSeriesSlotId(copyTimeSeriesSlotId);
                } else {
                    if (timeSeriesSlotIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.timeSeriesSlotId = null;
                    }
                }
            }
            {
                Boolean timePeriodShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.timePeriod!= null));
                if (timePeriodShouldBeCopiedAndSet == Boolean.TRUE) {
                    TimePeriodElementsType sourceTimePeriod;
                    sourceTimePeriod = this.getTimePeriod();
                    TimePeriodElementsType copyTimePeriod = ((TimePeriodElementsType) strategy.copy(LocatorUtils.property(locator, "timePeriod", sourceTimePeriod), sourceTimePeriod, (this.timePeriod!= null)));
                    copy.setTimePeriod(copyTimePeriod);
                } else {
                    if (timePeriodShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.timePeriod = null;
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
                Boolean recurrenceInformationShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.recurrenceInformation!= null));
                if (recurrenceInformationShouldBeCopiedAndSet == Boolean.TRUE) {
                    AbsoluteOrRecurringTimeElementsType sourceRecurrenceInformation;
                    sourceRecurrenceInformation = this.getRecurrenceInformation();
                    AbsoluteOrRecurringTimeElementsType copyRecurrenceInformation = ((AbsoluteOrRecurringTimeElementsType) strategy.copy(LocatorUtils.property(locator, "recurrenceInformation", sourceRecurrenceInformation), sourceRecurrenceInformation, (this.recurrenceInformation!= null)));
                    copy.setRecurrenceInformation(copyRecurrenceInformation);
                } else {
                    if (recurrenceInformationShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.recurrenceInformation = null;
                    }
                }
            }
            {
                Boolean valueShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.value!= null));
                if (valueShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceValue;
                    sourceValue = this.getValue();
                    ElementTagType copyValue = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "value", sourceValue), sourceValue, (this.value!= null)));
                    copy.setValue(copyValue);
                } else {
                    if (valueShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.value = null;
                    }
                }
            }
            {
                Boolean minValueShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.minValue!= null));
                if (minValueShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceMinValue;
                    sourceMinValue = this.getMinValue();
                    ElementTagType copyMinValue = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "minValue", sourceMinValue), sourceMinValue, (this.minValue!= null)));
                    copy.setMinValue(copyMinValue);
                } else {
                    if (minValueShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.minValue = null;
                    }
                }
            }
            {
                Boolean maxValueShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.maxValue!= null));
                if (maxValueShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceMaxValue;
                    sourceMaxValue = this.getMaxValue();
                    ElementTagType copyMaxValue = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "maxValue", sourceMaxValue), sourceMaxValue, (this.maxValue!= null)));
                    copy.setMaxValue(copyMaxValue);
                } else {
                    if (maxValueShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.maxValue = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new TimeSeriesSlotElementsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TimeSeriesSlotElementsType that = ((TimeSeriesSlotElementsType) object);
        {
            ElementTagType leftTimeSeriesSlotId;
            leftTimeSeriesSlotId = this.getTimeSeriesSlotId();
            ElementTagType rightTimeSeriesSlotId;
            rightTimeSeriesSlotId = that.getTimeSeriesSlotId();
            if (this.timeSeriesSlotId!= null) {
                if (that.timeSeriesSlotId!= null) {
                    if (!leftTimeSeriesSlotId.equals(rightTimeSeriesSlotId)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.timeSeriesSlotId!= null) {
                    return false;
                }
            }
        }
        {
            TimePeriodElementsType leftTimePeriod;
            leftTimePeriod = this.getTimePeriod();
            TimePeriodElementsType rightTimePeriod;
            rightTimePeriod = that.getTimePeriod();
            if (this.timePeriod!= null) {
                if (that.timePeriod!= null) {
                    if (!leftTimePeriod.equals(rightTimePeriod)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.timePeriod!= null) {
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
            AbsoluteOrRecurringTimeElementsType leftRecurrenceInformation;
            leftRecurrenceInformation = this.getRecurrenceInformation();
            AbsoluteOrRecurringTimeElementsType rightRecurrenceInformation;
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
            ElementTagType leftValue;
            leftValue = this.getValue();
            ElementTagType rightValue;
            rightValue = that.getValue();
            if (this.value!= null) {
                if (that.value!= null) {
                    if (!leftValue.equals(rightValue)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.value!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftMinValue;
            leftMinValue = this.getMinValue();
            ElementTagType rightMinValue;
            rightMinValue = that.getMinValue();
            if (this.minValue!= null) {
                if (that.minValue!= null) {
                    if (!leftMinValue.equals(rightMinValue)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.minValue!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftMaxValue;
            leftMaxValue = this.getMaxValue();
            ElementTagType rightMaxValue;
            rightMaxValue = that.getMaxValue();
            if (this.maxValue!= null) {
                if (that.maxValue!= null) {
                    if (!leftMaxValue.equals(rightMaxValue)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.maxValue!= null) {
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
            ElementTagType theTimeSeriesSlotId;
            theTimeSeriesSlotId = this.getTimeSeriesSlotId();
            if (this.timeSeriesSlotId!= null) {
                currentHashCode += theTimeSeriesSlotId.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            TimePeriodElementsType theTimePeriod;
            theTimePeriod = this.getTimePeriod();
            if (this.timePeriod!= null) {
                currentHashCode += theTimePeriod.hashCode();
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
            AbsoluteOrRecurringTimeElementsType theRecurrenceInformation;
            theRecurrenceInformation = this.getRecurrenceInformation();
            if (this.recurrenceInformation!= null) {
                currentHashCode += theRecurrenceInformation.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theValue;
            theValue = this.getValue();
            if (this.value!= null) {
                currentHashCode += theValue.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theMinValue;
            theMinValue = this.getMinValue();
            if (this.minValue!= null) {
                currentHashCode += theMinValue.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theMaxValue;
            theMaxValue = this.getMaxValue();
            if (this.maxValue!= null) {
                currentHashCode += theMaxValue.hashCode();
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
            ElementTagType theTimeSeriesSlotId;
            theTimeSeriesSlotId = this.getTimeSeriesSlotId();
            strategy.appendField(locator, this, "timeSeriesSlotId", buffer, theTimeSeriesSlotId, (this.timeSeriesSlotId!= null));
        }
        {
            TimePeriodElementsType theTimePeriod;
            theTimePeriod = this.getTimePeriod();
            strategy.appendField(locator, this, "timePeriod", buffer, theTimePeriod, (this.timePeriod!= null));
        }
        {
            ElementTagType theDuration;
            theDuration = this.getDuration();
            strategy.appendField(locator, this, "duration", buffer, theDuration, (this.duration!= null));
        }
        {
            AbsoluteOrRecurringTimeElementsType theRecurrenceInformation;
            theRecurrenceInformation = this.getRecurrenceInformation();
            strategy.appendField(locator, this, "recurrenceInformation", buffer, theRecurrenceInformation, (this.recurrenceInformation!= null));
        }
        {
            ElementTagType theValue;
            theValue = this.getValue();
            strategy.appendField(locator, this, "value", buffer, theValue, (this.value!= null));
        }
        {
            ElementTagType theMinValue;
            theMinValue = this.getMinValue();
            strategy.appendField(locator, this, "minValue", buffer, theMinValue, (this.minValue!= null));
        }
        {
            ElementTagType theMaxValue;
            theMaxValue = this.getMaxValue();
            strategy.appendField(locator, this, "maxValue", buffer, theMaxValue, (this.maxValue!= null));
        }
        return buffer;
    }

}
