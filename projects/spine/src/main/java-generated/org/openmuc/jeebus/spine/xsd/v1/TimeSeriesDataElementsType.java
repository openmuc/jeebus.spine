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
 * <p>Java class for TimeSeriesDataElementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeSeriesDataElementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="timeSeriesId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="timePeriod" type="{http://docs.eebus.org/spine/xsd/v1}TimePeriodElementsType" minOccurs="0"/&gt;
 *         &lt;element name="timeSeriesSlot" type="{http://docs.eebus.org/spine/xsd/v1}TimeSeriesSlotElementsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeSeriesDataElementsType", propOrder = {
    "timeSeriesId",
    "timePeriod",
    "timeSeriesSlot"
})
public class TimeSeriesDataElementsType implements Cloneable, CopyTo, ToString
{

    protected ElementTagType timeSeriesId;
    protected TimePeriodElementsType timePeriod;
    protected TimeSeriesSlotElementsType timeSeriesSlot;

    /**
     * Default no-arg constructor
     * 
     */
    public TimeSeriesDataElementsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public TimeSeriesDataElementsType(final ElementTagType timeSeriesId, final TimePeriodElementsType timePeriod, final TimeSeriesSlotElementsType timeSeriesSlot) {
        this.timeSeriesId = timeSeriesId;
        this.timePeriod = timePeriod;
        this.timeSeriesSlot = timeSeriesSlot;
    }

    /**
     * Gets the value of the timeSeriesId property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getTimeSeriesId() {
        return timeSeriesId;
    }

    /**
     * Sets the value of the timeSeriesId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setTimeSeriesId(ElementTagType value) {
        this.timeSeriesId = value;
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
     * Gets the value of the timeSeriesSlot property.
     * 
     * @return
     *     possible object is
     *     {@link TimeSeriesSlotElementsType }
     *     
     */
    public TimeSeriesSlotElementsType getTimeSeriesSlot() {
        return timeSeriesSlot;
    }

    /**
     * Sets the value of the timeSeriesSlot property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeSeriesSlotElementsType }
     *     
     */
    public void setTimeSeriesSlot(TimeSeriesSlotElementsType value) {
        this.timeSeriesSlot = value;
    }

    /**
     * Sets the value of the timeSeriesId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public TimeSeriesDataElementsType withTimeSeriesId(ElementTagType value) {
        setTimeSeriesId(value);
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
    public TimeSeriesDataElementsType withTimePeriod(TimePeriodElementsType value) {
        setTimePeriod(value);
        return this;
    }

    /**
     * Sets the value of the timeSeriesSlot property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeSeriesSlotElementsType }
     * @return
     *     The class instance
     */
    public TimeSeriesDataElementsType withTimeSeriesSlot(TimeSeriesSlotElementsType value) {
        setTimeSeriesSlot(value);
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
        if (draftCopy instanceof TimeSeriesDataElementsType) {
            final TimeSeriesDataElementsType copy = ((TimeSeriesDataElementsType) draftCopy);
            {
                Boolean timeSeriesIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.timeSeriesId!= null));
                if (timeSeriesIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceTimeSeriesId;
                    sourceTimeSeriesId = this.getTimeSeriesId();
                    ElementTagType copyTimeSeriesId = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "timeSeriesId", sourceTimeSeriesId), sourceTimeSeriesId, (this.timeSeriesId!= null)));
                    copy.setTimeSeriesId(copyTimeSeriesId);
                } else {
                    if (timeSeriesIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.timeSeriesId = null;
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
                Boolean timeSeriesSlotShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.timeSeriesSlot!= null));
                if (timeSeriesSlotShouldBeCopiedAndSet == Boolean.TRUE) {
                    TimeSeriesSlotElementsType sourceTimeSeriesSlot;
                    sourceTimeSeriesSlot = this.getTimeSeriesSlot();
                    TimeSeriesSlotElementsType copyTimeSeriesSlot = ((TimeSeriesSlotElementsType) strategy.copy(LocatorUtils.property(locator, "timeSeriesSlot", sourceTimeSeriesSlot), sourceTimeSeriesSlot, (this.timeSeriesSlot!= null)));
                    copy.setTimeSeriesSlot(copyTimeSeriesSlot);
                } else {
                    if (timeSeriesSlotShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.timeSeriesSlot = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new TimeSeriesDataElementsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TimeSeriesDataElementsType that = ((TimeSeriesDataElementsType) object);
        {
            ElementTagType leftTimeSeriesId;
            leftTimeSeriesId = this.getTimeSeriesId();
            ElementTagType rightTimeSeriesId;
            rightTimeSeriesId = that.getTimeSeriesId();
            if (this.timeSeriesId!= null) {
                if (that.timeSeriesId!= null) {
                    if (!leftTimeSeriesId.equals(rightTimeSeriesId)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.timeSeriesId!= null) {
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
            TimeSeriesSlotElementsType leftTimeSeriesSlot;
            leftTimeSeriesSlot = this.getTimeSeriesSlot();
            TimeSeriesSlotElementsType rightTimeSeriesSlot;
            rightTimeSeriesSlot = that.getTimeSeriesSlot();
            if (this.timeSeriesSlot!= null) {
                if (that.timeSeriesSlot!= null) {
                    if (!leftTimeSeriesSlot.equals(rightTimeSeriesSlot)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.timeSeriesSlot!= null) {
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
            ElementTagType theTimeSeriesId;
            theTimeSeriesId = this.getTimeSeriesId();
            if (this.timeSeriesId!= null) {
                currentHashCode += theTimeSeriesId.hashCode();
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
            TimeSeriesSlotElementsType theTimeSeriesSlot;
            theTimeSeriesSlot = this.getTimeSeriesSlot();
            if (this.timeSeriesSlot!= null) {
                currentHashCode += theTimeSeriesSlot.hashCode();
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
            ElementTagType theTimeSeriesId;
            theTimeSeriesId = this.getTimeSeriesId();
            strategy.appendField(locator, this, "timeSeriesId", buffer, theTimeSeriesId, (this.timeSeriesId!= null));
        }
        {
            TimePeriodElementsType theTimePeriod;
            theTimePeriod = this.getTimePeriod();
            strategy.appendField(locator, this, "timePeriod", buffer, theTimePeriod, (this.timePeriod!= null));
        }
        {
            TimeSeriesSlotElementsType theTimeSeriesSlot;
            theTimeSeriesSlot = this.getTimeSeriesSlot();
            strategy.appendField(locator, this, "timeSeriesSlot", buffer, theTimeSeriesSlot, (this.timeSeriesSlot!= null));
        }
        return buffer;
    }

}
