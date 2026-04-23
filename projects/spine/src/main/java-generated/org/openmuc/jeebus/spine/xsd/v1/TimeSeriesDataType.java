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

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
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
 * <p>Java class for TimeSeriesDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeSeriesDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="timeSeriesId" type="{http://docs.eebus.org/spine/xsd/v1}TimeSeriesIdType" minOccurs="0"/&gt;
 *         &lt;element name="timePeriod" type="{http://docs.eebus.org/spine/xsd/v1}TimePeriodType" minOccurs="0"/&gt;
 *         &lt;element name="timeSeriesSlot" type="{http://docs.eebus.org/spine/xsd/v1}TimeSeriesSlotType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeSeriesDataType", propOrder = {
    "timeSeriesId",
    "timePeriod",
    "timeSeriesSlot"
})
public class TimeSeriesDataType implements Cloneable, CopyTo, ToString
{

    @XmlSchemaType(name = "unsignedInt")
    protected Long timeSeriesId;
    protected TimePeriodType timePeriod;
    protected List<TimeSeriesSlotType> timeSeriesSlot;

    /**
     * Default no-arg constructor
     * 
     */
    public TimeSeriesDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public TimeSeriesDataType(final Long timeSeriesId, final TimePeriodType timePeriod, final List<TimeSeriesSlotType> timeSeriesSlot) {
        this.timeSeriesId = timeSeriesId;
        this.timePeriod = timePeriod;
        this.timeSeriesSlot = timeSeriesSlot;
    }

    /**
     * Gets the value of the timeSeriesId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTimeSeriesId() {
        return timeSeriesId;
    }

    /**
     * Sets the value of the timeSeriesId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTimeSeriesId(Long value) {
        this.timeSeriesId = value;
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
     * Gets the value of the timeSeriesSlot property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the timeSeriesSlot property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimeSeriesSlot().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimeSeriesSlotType }
     * 
     * 
     */
    public List<TimeSeriesSlotType> getTimeSeriesSlot() {
        if (timeSeriesSlot == null) {
            timeSeriesSlot = new ArrayList<TimeSeriesSlotType>();
        }
        return this.timeSeriesSlot;
    }

    /**
     * Sets the value of the timeSeriesId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     * @return
     *     The class instance
     */
    public TimeSeriesDataType withTimeSeriesId(Long value) {
        setTimeSeriesId(value);
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
    public TimeSeriesDataType withTimePeriod(TimePeriodType value) {
        setTimePeriod(value);
        return this;
    }

    /**
     * Adds objects to the list of TimeSeriesSlot using add method
     * 
     * @param values
     *     objects to add to the list TimeSeriesSlot
     * @return
     *     The class instance
     */
    public TimeSeriesDataType withTimeSeriesSlot(TimeSeriesSlotType... values) {
        if (values!= null) {
            for (TimeSeriesSlotType value: values) {
                getTimeSeriesSlot().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of TimeSeriesSlot using addAll method
     * 
     * @param values
     *     objects to add to the list TimeSeriesSlot
     * @return
     *     The class instance
     */
    public TimeSeriesDataType withTimeSeriesSlot(Collection<TimeSeriesSlotType> values) {
        if (values!= null) {
            getTimeSeriesSlot().addAll(values);
        }
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
        if (draftCopy instanceof TimeSeriesDataType) {
            final TimeSeriesDataType copy = ((TimeSeriesDataType) draftCopy);
            {
                Boolean timeSeriesIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.timeSeriesId!= null));
                if (timeSeriesIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceTimeSeriesId;
                    sourceTimeSeriesId = this.getTimeSeriesId();
                    Long copyTimeSeriesId = ((Long) strategy.copy(LocatorUtils.property(locator, "timeSeriesId", sourceTimeSeriesId), sourceTimeSeriesId, (this.timeSeriesId!= null)));
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
                Boolean timeSeriesSlotShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.timeSeriesSlot!= null)&&(!this.timeSeriesSlot.isEmpty())));
                if (timeSeriesSlotShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<TimeSeriesSlotType> sourceTimeSeriesSlot;
                    sourceTimeSeriesSlot = (((this.timeSeriesSlot!= null)&&(!this.timeSeriesSlot.isEmpty()))?this.getTimeSeriesSlot():null);
                    @SuppressWarnings("unchecked")
                    List<TimeSeriesSlotType> copyTimeSeriesSlot = ((List<TimeSeriesSlotType> ) strategy.copy(LocatorUtils.property(locator, "timeSeriesSlot", sourceTimeSeriesSlot), sourceTimeSeriesSlot, ((this.timeSeriesSlot!= null)&&(!this.timeSeriesSlot.isEmpty()))));
                    copy.timeSeriesSlot = null;
                    if (copyTimeSeriesSlot!= null) {
                        List<TimeSeriesSlotType> uniqueTimeSeriesSlotl = copy.getTimeSeriesSlot();
                        uniqueTimeSeriesSlotl.addAll(copyTimeSeriesSlot);
                    }
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
        return new TimeSeriesDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TimeSeriesDataType that = ((TimeSeriesDataType) object);
        {
            Long leftTimeSeriesId;
            leftTimeSeriesId = this.getTimeSeriesId();
            Long rightTimeSeriesId;
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
            List<TimeSeriesSlotType> leftTimeSeriesSlot;
            leftTimeSeriesSlot = (((this.timeSeriesSlot!= null)&&(!this.timeSeriesSlot.isEmpty()))?this.getTimeSeriesSlot():null);
            List<TimeSeriesSlotType> rightTimeSeriesSlot;
            rightTimeSeriesSlot = (((that.timeSeriesSlot!= null)&&(!that.timeSeriesSlot.isEmpty()))?that.getTimeSeriesSlot():null);
            if ((this.timeSeriesSlot!= null)&&(!this.timeSeriesSlot.isEmpty())) {
                if ((that.timeSeriesSlot!= null)&&(!that.timeSeriesSlot.isEmpty())) {
                    if (!leftTimeSeriesSlot.equals(rightTimeSeriesSlot)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.timeSeriesSlot!= null)&&(!that.timeSeriesSlot.isEmpty())) {
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
            Long theTimeSeriesId;
            theTimeSeriesId = this.getTimeSeriesId();
            if (this.timeSeriesId!= null) {
                currentHashCode += theTimeSeriesId.hashCode();
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
            List<TimeSeriesSlotType> theTimeSeriesSlot;
            theTimeSeriesSlot = (((this.timeSeriesSlot!= null)&&(!this.timeSeriesSlot.isEmpty()))?this.getTimeSeriesSlot():null);
            if ((this.timeSeriesSlot!= null)&&(!this.timeSeriesSlot.isEmpty())) {
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
            Long theTimeSeriesId;
            theTimeSeriesId = this.getTimeSeriesId();
            strategy.appendField(locator, this, "timeSeriesId", buffer, theTimeSeriesId, (this.timeSeriesId!= null));
        }
        {
            TimePeriodType theTimePeriod;
            theTimePeriod = this.getTimePeriod();
            strategy.appendField(locator, this, "timePeriod", buffer, theTimePeriod, (this.timePeriod!= null));
        }
        {
            List<TimeSeriesSlotType> theTimeSeriesSlot;
            theTimeSeriesSlot = (((this.timeSeriesSlot!= null)&&(!this.timeSeriesSlot.isEmpty()))?this.getTimeSeriesSlot():null);
            strategy.appendField(locator, this, "timeSeriesSlot", buffer, theTimeSeriesSlot, ((this.timeSeriesSlot!= null)&&(!this.timeSeriesSlot.isEmpty())));
        }
        return buffer;
    }

}
