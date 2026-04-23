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
 * <p>Java class for TimeSeriesSlotType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeSeriesSlotType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="timeSeriesSlotId" type="{http://docs.eebus.org/spine/xsd/v1}TimeSeriesSlotIdType" minOccurs="0"/&gt;
 *         &lt;element name="timePeriod" type="{http://docs.eebus.org/spine/xsd/v1}TimePeriodType" minOccurs="0"/&gt;
 *         &lt;element name="duration" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *         &lt;element name="recurrenceInformation" type="{http://docs.eebus.org/spine/xsd/v1}AbsoluteOrRecurringTimeType" minOccurs="0"/&gt;
 *         &lt;element name="value" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberType" minOccurs="0"/&gt;
 *         &lt;element name="minValue" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberType" minOccurs="0"/&gt;
 *         &lt;element name="maxValue" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeSeriesSlotType", propOrder = {
    "timeSeriesSlotId",
    "timePeriod",
    "duration",
    "recurrenceInformation",
    "value",
    "minValue",
    "maxValue"
})
public class TimeSeriesSlotType implements Cloneable, CopyTo, ToString
{

    @XmlSchemaType(name = "unsignedInt")
    protected Long timeSeriesSlotId;
    protected TimePeriodType timePeriod;
    protected Duration duration;
    protected AbsoluteOrRecurringTimeType recurrenceInformation;
    protected ScaledNumberType value;
    protected ScaledNumberType minValue;
    protected ScaledNumberType maxValue;

    /**
     * Default no-arg constructor
     * 
     */
    public TimeSeriesSlotType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public TimeSeriesSlotType(final Long timeSeriesSlotId, final TimePeriodType timePeriod, final Duration duration, final AbsoluteOrRecurringTimeType recurrenceInformation, final ScaledNumberType value, final ScaledNumberType minValue, final ScaledNumberType maxValue) {
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
     *     {@link Long }
     *     
     */
    public Long getTimeSeriesSlotId() {
        return timeSeriesSlotId;
    }

    /**
     * Sets the value of the timeSeriesSlotId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTimeSeriesSlotId(Long value) {
        this.timeSeriesSlotId = value;
    }

    /**
     * Gets the value of the timePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodType }
     *     
     */
    public TimePeriodType getTimePeriod() {
        return timePeriod;
    }

    /**
     * Sets the value of the timePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodType }
     *     
     */
    public void setTimePeriod(TimePeriodType value) {
        this.timePeriod = value;
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
     * Gets the value of the recurrenceInformation property.
     * 
     * @return
     *     possible object is
     *     {@link AbsoluteOrRecurringTimeType }
     *     
     */
    public AbsoluteOrRecurringTimeType getRecurrenceInformation() {
        return recurrenceInformation;
    }

    /**
     * Sets the value of the recurrenceInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbsoluteOrRecurringTimeType }
     *     
     */
    public void setRecurrenceInformation(AbsoluteOrRecurringTimeType value) {
        this.recurrenceInformation = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link ScaledNumberType }
     *     
     */
    public ScaledNumberType getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberType }
     *     
     */
    public void setValue(ScaledNumberType value) {
        this.value = value;
    }

    /**
     * Gets the value of the minValue property.
     * 
     * @return
     *     possible object is
     *     {@link ScaledNumberType }
     *     
     */
    public ScaledNumberType getMinValue() {
        return minValue;
    }

    /**
     * Sets the value of the minValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberType }
     *     
     */
    public void setMinValue(ScaledNumberType value) {
        this.minValue = value;
    }

    /**
     * Gets the value of the maxValue property.
     * 
     * @return
     *     possible object is
     *     {@link ScaledNumberType }
     *     
     */
    public ScaledNumberType getMaxValue() {
        return maxValue;
    }

    /**
     * Sets the value of the maxValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberType }
     *     
     */
    public void setMaxValue(ScaledNumberType value) {
        this.maxValue = value;
    }

    /**
     * Sets the value of the timeSeriesSlotId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     * @return
     *     The class instance
     */
    public TimeSeriesSlotType withTimeSeriesSlotId(Long value) {
        setTimeSeriesSlotId(value);
        return this;
    }

    /**
     * Sets the value of the timePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodType }
     * @return
     *     The class instance
     */
    public TimeSeriesSlotType withTimePeriod(TimePeriodType value) {
        setTimePeriod(value);
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
    public TimeSeriesSlotType withDuration(Duration value) {
        setDuration(value);
        return this;
    }

    /**
     * Sets the value of the recurrenceInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbsoluteOrRecurringTimeType }
     * @return
     *     The class instance
     */
    public TimeSeriesSlotType withRecurrenceInformation(AbsoluteOrRecurringTimeType value) {
        setRecurrenceInformation(value);
        return this;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberType }
     * @return
     *     The class instance
     */
    public TimeSeriesSlotType withValue(ScaledNumberType value) {
        setValue(value);
        return this;
    }

    /**
     * Sets the value of the minValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberType }
     * @return
     *     The class instance
     */
    public TimeSeriesSlotType withMinValue(ScaledNumberType value) {
        setMinValue(value);
        return this;
    }

    /**
     * Sets the value of the maxValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberType }
     * @return
     *     The class instance
     */
    public TimeSeriesSlotType withMaxValue(ScaledNumberType value) {
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
        if (draftCopy instanceof TimeSeriesSlotType) {
            final TimeSeriesSlotType copy = ((TimeSeriesSlotType) draftCopy);
            {
                Boolean timeSeriesSlotIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.timeSeriesSlotId!= null));
                if (timeSeriesSlotIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceTimeSeriesSlotId;
                    sourceTimeSeriesSlotId = this.getTimeSeriesSlotId();
                    Long copyTimeSeriesSlotId = ((Long) strategy.copy(LocatorUtils.property(locator, "timeSeriesSlotId", sourceTimeSeriesSlotId), sourceTimeSeriesSlotId, (this.timeSeriesSlotId!= null)));
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
                    TimePeriodType sourceTimePeriod;
                    sourceTimePeriod = this.getTimePeriod();
                    TimePeriodType copyTimePeriod = ((TimePeriodType) strategy.copy(LocatorUtils.property(locator, "timePeriod", sourceTimePeriod), sourceTimePeriod, (this.timePeriod!= null)));
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
                Boolean recurrenceInformationShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.recurrenceInformation!= null));
                if (recurrenceInformationShouldBeCopiedAndSet == Boolean.TRUE) {
                    AbsoluteOrRecurringTimeType sourceRecurrenceInformation;
                    sourceRecurrenceInformation = this.getRecurrenceInformation();
                    AbsoluteOrRecurringTimeType copyRecurrenceInformation = ((AbsoluteOrRecurringTimeType) strategy.copy(LocatorUtils.property(locator, "recurrenceInformation", sourceRecurrenceInformation), sourceRecurrenceInformation, (this.recurrenceInformation!= null)));
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
                    ScaledNumberType sourceValue;
                    sourceValue = this.getValue();
                    ScaledNumberType copyValue = ((ScaledNumberType) strategy.copy(LocatorUtils.property(locator, "value", sourceValue), sourceValue, (this.value!= null)));
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
                    ScaledNumberType sourceMinValue;
                    sourceMinValue = this.getMinValue();
                    ScaledNumberType copyMinValue = ((ScaledNumberType) strategy.copy(LocatorUtils.property(locator, "minValue", sourceMinValue), sourceMinValue, (this.minValue!= null)));
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
                    ScaledNumberType sourceMaxValue;
                    sourceMaxValue = this.getMaxValue();
                    ScaledNumberType copyMaxValue = ((ScaledNumberType) strategy.copy(LocatorUtils.property(locator, "maxValue", sourceMaxValue), sourceMaxValue, (this.maxValue!= null)));
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
        return new TimeSeriesSlotType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TimeSeriesSlotType that = ((TimeSeriesSlotType) object);
        {
            Long leftTimeSeriesSlotId;
            leftTimeSeriesSlotId = this.getTimeSeriesSlotId();
            Long rightTimeSeriesSlotId;
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
            TimePeriodType leftTimePeriod;
            leftTimePeriod = this.getTimePeriod();
            TimePeriodType rightTimePeriod;
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
            AbsoluteOrRecurringTimeType leftRecurrenceInformation;
            leftRecurrenceInformation = this.getRecurrenceInformation();
            AbsoluteOrRecurringTimeType rightRecurrenceInformation;
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
            ScaledNumberType leftValue;
            leftValue = this.getValue();
            ScaledNumberType rightValue;
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
            ScaledNumberType leftMinValue;
            leftMinValue = this.getMinValue();
            ScaledNumberType rightMinValue;
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
            ScaledNumberType leftMaxValue;
            leftMaxValue = this.getMaxValue();
            ScaledNumberType rightMaxValue;
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
            Long theTimeSeriesSlotId;
            theTimeSeriesSlotId = this.getTimeSeriesSlotId();
            if (this.timeSeriesSlotId!= null) {
                currentHashCode += theTimeSeriesSlotId.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            TimePeriodType theTimePeriod;
            theTimePeriod = this.getTimePeriod();
            if (this.timePeriod!= null) {
                currentHashCode += theTimePeriod.hashCode();
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
            AbsoluteOrRecurringTimeType theRecurrenceInformation;
            theRecurrenceInformation = this.getRecurrenceInformation();
            if (this.recurrenceInformation!= null) {
                currentHashCode += theRecurrenceInformation.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ScaledNumberType theValue;
            theValue = this.getValue();
            if (this.value!= null) {
                currentHashCode += theValue.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ScaledNumberType theMinValue;
            theMinValue = this.getMinValue();
            if (this.minValue!= null) {
                currentHashCode += theMinValue.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ScaledNumberType theMaxValue;
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
            Long theTimeSeriesSlotId;
            theTimeSeriesSlotId = this.getTimeSeriesSlotId();
            strategy.appendField(locator, this, "timeSeriesSlotId", buffer, theTimeSeriesSlotId, (this.timeSeriesSlotId!= null));
        }
        {
            TimePeriodType theTimePeriod;
            theTimePeriod = this.getTimePeriod();
            strategy.appendField(locator, this, "timePeriod", buffer, theTimePeriod, (this.timePeriod!= null));
        }
        {
            Duration theDuration;
            theDuration = this.getDuration();
            strategy.appendField(locator, this, "duration", buffer, theDuration, (this.duration!= null));
        }
        {
            AbsoluteOrRecurringTimeType theRecurrenceInformation;
            theRecurrenceInformation = this.getRecurrenceInformation();
            strategy.appendField(locator, this, "recurrenceInformation", buffer, theRecurrenceInformation, (this.recurrenceInformation!= null));
        }
        {
            ScaledNumberType theValue;
            theValue = this.getValue();
            strategy.appendField(locator, this, "value", buffer, theValue, (this.value!= null));
        }
        {
            ScaledNumberType theMinValue;
            theMinValue = this.getMinValue();
            strategy.appendField(locator, this, "minValue", buffer, theMinValue, (this.minValue!= null));
        }
        {
            ScaledNumberType theMaxValue;
            theMaxValue = this.getMaxValue();
            strategy.appendField(locator, this, "maxValue", buffer, theMaxValue, (this.maxValue!= null));
        }
        return buffer;
    }

}
