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
 * <p>Java class for TimeSeriesConstraintsDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeSeriesConstraintsDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="timeSeriesId" type="{http://docs.eebus.org/spine/xsd/v1}TimeSeriesIdType" minOccurs="0"/&gt;
 *         &lt;element name="slotCountMin" type="{http://docs.eebus.org/spine/xsd/v1}TimeSeriesSlotCountType" minOccurs="0"/&gt;
 *         &lt;element name="slotCountMax" type="{http://docs.eebus.org/spine/xsd/v1}TimeSeriesSlotCountType" minOccurs="0"/&gt;
 *         &lt;element name="slotDurationMin" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *         &lt;element name="slotDurationMax" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *         &lt;element name="slotDurationStepSize" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *         &lt;element name="earliestTimeSeriesStartTime" type="{http://docs.eebus.org/spine/xsd/v1}AbsoluteOrRelativeTimeType" minOccurs="0"/&gt;
 *         &lt;element name="latestTimeSeriesEndTime" type="{http://docs.eebus.org/spine/xsd/v1}AbsoluteOrRelativeTimeType" minOccurs="0"/&gt;
 *         &lt;element name="slotValueMin" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberType" minOccurs="0"/&gt;
 *         &lt;element name="slotValueMax" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberType" minOccurs="0"/&gt;
 *         &lt;element name="slotValueStepSize" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeSeriesConstraintsDataType", propOrder = {
    "timeSeriesId",
    "slotCountMin",
    "slotCountMax",
    "slotDurationMin",
    "slotDurationMax",
    "slotDurationStepSize",
    "earliestTimeSeriesStartTime",
    "latestTimeSeriesEndTime",
    "slotValueMin",
    "slotValueMax",
    "slotValueStepSize"
})
public class TimeSeriesConstraintsDataType implements Cloneable, CopyTo, ToString
{

    @XmlSchemaType(name = "unsignedInt")
    protected Long timeSeriesId;
    @XmlSchemaType(name = "unsignedInt")
    protected Long slotCountMin;
    @XmlSchemaType(name = "unsignedInt")
    protected Long slotCountMax;
    protected Duration slotDurationMin;
    protected Duration slotDurationMax;
    protected Duration slotDurationStepSize;
    protected String earliestTimeSeriesStartTime;
    protected String latestTimeSeriesEndTime;
    protected ScaledNumberType slotValueMin;
    protected ScaledNumberType slotValueMax;
    protected ScaledNumberType slotValueStepSize;

    /**
     * Default no-arg constructor
     * 
     */
    public TimeSeriesConstraintsDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public TimeSeriesConstraintsDataType(final Long timeSeriesId, final Long slotCountMin, final Long slotCountMax, final Duration slotDurationMin, final Duration slotDurationMax, final Duration slotDurationStepSize, final String earliestTimeSeriesStartTime, final String latestTimeSeriesEndTime, final ScaledNumberType slotValueMin, final ScaledNumberType slotValueMax, final ScaledNumberType slotValueStepSize) {
        this.timeSeriesId = timeSeriesId;
        this.slotCountMin = slotCountMin;
        this.slotCountMax = slotCountMax;
        this.slotDurationMin = slotDurationMin;
        this.slotDurationMax = slotDurationMax;
        this.slotDurationStepSize = slotDurationStepSize;
        this.earliestTimeSeriesStartTime = earliestTimeSeriesStartTime;
        this.latestTimeSeriesEndTime = latestTimeSeriesEndTime;
        this.slotValueMin = slotValueMin;
        this.slotValueMax = slotValueMax;
        this.slotValueStepSize = slotValueStepSize;
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
     * Gets the value of the slotCountMin property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSlotCountMin() {
        return slotCountMin;
    }

    /**
     * Sets the value of the slotCountMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSlotCountMin(Long value) {
        this.slotCountMin = value;
    }

    /**
     * Gets the value of the slotCountMax property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSlotCountMax() {
        return slotCountMax;
    }

    /**
     * Sets the value of the slotCountMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSlotCountMax(Long value) {
        this.slotCountMax = value;
    }

    /**
     * Gets the value of the slotDurationMin property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getSlotDurationMin() {
        return slotDurationMin;
    }

    /**
     * Sets the value of the slotDurationMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setSlotDurationMin(Duration value) {
        this.slotDurationMin = value;
    }

    /**
     * Gets the value of the slotDurationMax property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getSlotDurationMax() {
        return slotDurationMax;
    }

    /**
     * Sets the value of the slotDurationMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setSlotDurationMax(Duration value) {
        this.slotDurationMax = value;
    }

    /**
     * Gets the value of the slotDurationStepSize property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getSlotDurationStepSize() {
        return slotDurationStepSize;
    }

    /**
     * Sets the value of the slotDurationStepSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setSlotDurationStepSize(Duration value) {
        this.slotDurationStepSize = value;
    }

    /**
     * Gets the value of the earliestTimeSeriesStartTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEarliestTimeSeriesStartTime() {
        return earliestTimeSeriesStartTime;
    }

    /**
     * Sets the value of the earliestTimeSeriesStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEarliestTimeSeriesStartTime(String value) {
        this.earliestTimeSeriesStartTime = value;
    }

    /**
     * Gets the value of the latestTimeSeriesEndTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLatestTimeSeriesEndTime() {
        return latestTimeSeriesEndTime;
    }

    /**
     * Sets the value of the latestTimeSeriesEndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatestTimeSeriesEndTime(String value) {
        this.latestTimeSeriesEndTime = value;
    }

    /**
     * Gets the value of the slotValueMin property.
     * 
     * @return
     *     possible object is
     *     {@link ScaledNumberType }
     *     
     */
    public ScaledNumberType getSlotValueMin() {
        return slotValueMin;
    }

    /**
     * Sets the value of the slotValueMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberType }
     *     
     */
    public void setSlotValueMin(ScaledNumberType value) {
        this.slotValueMin = value;
    }

    /**
     * Gets the value of the slotValueMax property.
     * 
     * @return
     *     possible object is
     *     {@link ScaledNumberType }
     *     
     */
    public ScaledNumberType getSlotValueMax() {
        return slotValueMax;
    }

    /**
     * Sets the value of the slotValueMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberType }
     *     
     */
    public void setSlotValueMax(ScaledNumberType value) {
        this.slotValueMax = value;
    }

    /**
     * Gets the value of the slotValueStepSize property.
     * 
     * @return
     *     possible object is
     *     {@link ScaledNumberType }
     *     
     */
    public ScaledNumberType getSlotValueStepSize() {
        return slotValueStepSize;
    }

    /**
     * Sets the value of the slotValueStepSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberType }
     *     
     */
    public void setSlotValueStepSize(ScaledNumberType value) {
        this.slotValueStepSize = value;
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
    public TimeSeriesConstraintsDataType withTimeSeriesId(Long value) {
        setTimeSeriesId(value);
        return this;
    }

    /**
     * Sets the value of the slotCountMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     * @return
     *     The class instance
     */
    public TimeSeriesConstraintsDataType withSlotCountMin(Long value) {
        setSlotCountMin(value);
        return this;
    }

    /**
     * Sets the value of the slotCountMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     * @return
     *     The class instance
     */
    public TimeSeriesConstraintsDataType withSlotCountMax(Long value) {
        setSlotCountMax(value);
        return this;
    }

    /**
     * Sets the value of the slotDurationMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     * @return
     *     The class instance
     */
    public TimeSeriesConstraintsDataType withSlotDurationMin(Duration value) {
        setSlotDurationMin(value);
        return this;
    }

    /**
     * Sets the value of the slotDurationMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     * @return
     *     The class instance
     */
    public TimeSeriesConstraintsDataType withSlotDurationMax(Duration value) {
        setSlotDurationMax(value);
        return this;
    }

    /**
     * Sets the value of the slotDurationStepSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     * @return
     *     The class instance
     */
    public TimeSeriesConstraintsDataType withSlotDurationStepSize(Duration value) {
        setSlotDurationStepSize(value);
        return this;
    }

    /**
     * Sets the value of the earliestTimeSeriesStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public TimeSeriesConstraintsDataType withEarliestTimeSeriesStartTime(String value) {
        setEarliestTimeSeriesStartTime(value);
        return this;
    }

    /**
     * Sets the value of the latestTimeSeriesEndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public TimeSeriesConstraintsDataType withLatestTimeSeriesEndTime(String value) {
        setLatestTimeSeriesEndTime(value);
        return this;
    }

    /**
     * Sets the value of the slotValueMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberType }
     * @return
     *     The class instance
     */
    public TimeSeriesConstraintsDataType withSlotValueMin(ScaledNumberType value) {
        setSlotValueMin(value);
        return this;
    }

    /**
     * Sets the value of the slotValueMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberType }
     * @return
     *     The class instance
     */
    public TimeSeriesConstraintsDataType withSlotValueMax(ScaledNumberType value) {
        setSlotValueMax(value);
        return this;
    }

    /**
     * Sets the value of the slotValueStepSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberType }
     * @return
     *     The class instance
     */
    public TimeSeriesConstraintsDataType withSlotValueStepSize(ScaledNumberType value) {
        setSlotValueStepSize(value);
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
        if (draftCopy instanceof TimeSeriesConstraintsDataType) {
            final TimeSeriesConstraintsDataType copy = ((TimeSeriesConstraintsDataType) draftCopy);
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
                Boolean slotCountMinShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.slotCountMin!= null));
                if (slotCountMinShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceSlotCountMin;
                    sourceSlotCountMin = this.getSlotCountMin();
                    Long copySlotCountMin = ((Long) strategy.copy(LocatorUtils.property(locator, "slotCountMin", sourceSlotCountMin), sourceSlotCountMin, (this.slotCountMin!= null)));
                    copy.setSlotCountMin(copySlotCountMin);
                } else {
                    if (slotCountMinShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.slotCountMin = null;
                    }
                }
            }
            {
                Boolean slotCountMaxShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.slotCountMax!= null));
                if (slotCountMaxShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceSlotCountMax;
                    sourceSlotCountMax = this.getSlotCountMax();
                    Long copySlotCountMax = ((Long) strategy.copy(LocatorUtils.property(locator, "slotCountMax", sourceSlotCountMax), sourceSlotCountMax, (this.slotCountMax!= null)));
                    copy.setSlotCountMax(copySlotCountMax);
                } else {
                    if (slotCountMaxShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.slotCountMax = null;
                    }
                }
            }
            {
                Boolean slotDurationMinShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.slotDurationMin!= null));
                if (slotDurationMinShouldBeCopiedAndSet == Boolean.TRUE) {
                    Duration sourceSlotDurationMin;
                    sourceSlotDurationMin = this.getSlotDurationMin();
                    Duration copySlotDurationMin = ((Duration) strategy.copy(LocatorUtils.property(locator, "slotDurationMin", sourceSlotDurationMin), sourceSlotDurationMin, (this.slotDurationMin!= null)));
                    copy.setSlotDurationMin(copySlotDurationMin);
                } else {
                    if (slotDurationMinShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.slotDurationMin = null;
                    }
                }
            }
            {
                Boolean slotDurationMaxShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.slotDurationMax!= null));
                if (slotDurationMaxShouldBeCopiedAndSet == Boolean.TRUE) {
                    Duration sourceSlotDurationMax;
                    sourceSlotDurationMax = this.getSlotDurationMax();
                    Duration copySlotDurationMax = ((Duration) strategy.copy(LocatorUtils.property(locator, "slotDurationMax", sourceSlotDurationMax), sourceSlotDurationMax, (this.slotDurationMax!= null)));
                    copy.setSlotDurationMax(copySlotDurationMax);
                } else {
                    if (slotDurationMaxShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.slotDurationMax = null;
                    }
                }
            }
            {
                Boolean slotDurationStepSizeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.slotDurationStepSize!= null));
                if (slotDurationStepSizeShouldBeCopiedAndSet == Boolean.TRUE) {
                    Duration sourceSlotDurationStepSize;
                    sourceSlotDurationStepSize = this.getSlotDurationStepSize();
                    Duration copySlotDurationStepSize = ((Duration) strategy.copy(LocatorUtils.property(locator, "slotDurationStepSize", sourceSlotDurationStepSize), sourceSlotDurationStepSize, (this.slotDurationStepSize!= null)));
                    copy.setSlotDurationStepSize(copySlotDurationStepSize);
                } else {
                    if (slotDurationStepSizeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.slotDurationStepSize = null;
                    }
                }
            }
            {
                Boolean earliestTimeSeriesStartTimeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.earliestTimeSeriesStartTime!= null));
                if (earliestTimeSeriesStartTimeShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceEarliestTimeSeriesStartTime;
                    sourceEarliestTimeSeriesStartTime = this.getEarliestTimeSeriesStartTime();
                    String copyEarliestTimeSeriesStartTime = ((String) strategy.copy(LocatorUtils.property(locator, "earliestTimeSeriesStartTime", sourceEarliestTimeSeriesStartTime), sourceEarliestTimeSeriesStartTime, (this.earliestTimeSeriesStartTime!= null)));
                    copy.setEarliestTimeSeriesStartTime(copyEarliestTimeSeriesStartTime);
                } else {
                    if (earliestTimeSeriesStartTimeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.earliestTimeSeriesStartTime = null;
                    }
                }
            }
            {
                Boolean latestTimeSeriesEndTimeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.latestTimeSeriesEndTime!= null));
                if (latestTimeSeriesEndTimeShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceLatestTimeSeriesEndTime;
                    sourceLatestTimeSeriesEndTime = this.getLatestTimeSeriesEndTime();
                    String copyLatestTimeSeriesEndTime = ((String) strategy.copy(LocatorUtils.property(locator, "latestTimeSeriesEndTime", sourceLatestTimeSeriesEndTime), sourceLatestTimeSeriesEndTime, (this.latestTimeSeriesEndTime!= null)));
                    copy.setLatestTimeSeriesEndTime(copyLatestTimeSeriesEndTime);
                } else {
                    if (latestTimeSeriesEndTimeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.latestTimeSeriesEndTime = null;
                    }
                }
            }
            {
                Boolean slotValueMinShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.slotValueMin!= null));
                if (slotValueMinShouldBeCopiedAndSet == Boolean.TRUE) {
                    ScaledNumberType sourceSlotValueMin;
                    sourceSlotValueMin = this.getSlotValueMin();
                    ScaledNumberType copySlotValueMin = ((ScaledNumberType) strategy.copy(LocatorUtils.property(locator, "slotValueMin", sourceSlotValueMin), sourceSlotValueMin, (this.slotValueMin!= null)));
                    copy.setSlotValueMin(copySlotValueMin);
                } else {
                    if (slotValueMinShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.slotValueMin = null;
                    }
                }
            }
            {
                Boolean slotValueMaxShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.slotValueMax!= null));
                if (slotValueMaxShouldBeCopiedAndSet == Boolean.TRUE) {
                    ScaledNumberType sourceSlotValueMax;
                    sourceSlotValueMax = this.getSlotValueMax();
                    ScaledNumberType copySlotValueMax = ((ScaledNumberType) strategy.copy(LocatorUtils.property(locator, "slotValueMax", sourceSlotValueMax), sourceSlotValueMax, (this.slotValueMax!= null)));
                    copy.setSlotValueMax(copySlotValueMax);
                } else {
                    if (slotValueMaxShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.slotValueMax = null;
                    }
                }
            }
            {
                Boolean slotValueStepSizeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.slotValueStepSize!= null));
                if (slotValueStepSizeShouldBeCopiedAndSet == Boolean.TRUE) {
                    ScaledNumberType sourceSlotValueStepSize;
                    sourceSlotValueStepSize = this.getSlotValueStepSize();
                    ScaledNumberType copySlotValueStepSize = ((ScaledNumberType) strategy.copy(LocatorUtils.property(locator, "slotValueStepSize", sourceSlotValueStepSize), sourceSlotValueStepSize, (this.slotValueStepSize!= null)));
                    copy.setSlotValueStepSize(copySlotValueStepSize);
                } else {
                    if (slotValueStepSizeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.slotValueStepSize = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new TimeSeriesConstraintsDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TimeSeriesConstraintsDataType that = ((TimeSeriesConstraintsDataType) object);
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
            Long leftSlotCountMin;
            leftSlotCountMin = this.getSlotCountMin();
            Long rightSlotCountMin;
            rightSlotCountMin = that.getSlotCountMin();
            if (this.slotCountMin!= null) {
                if (that.slotCountMin!= null) {
                    if (!leftSlotCountMin.equals(rightSlotCountMin)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.slotCountMin!= null) {
                    return false;
                }
            }
        }
        {
            Long leftSlotCountMax;
            leftSlotCountMax = this.getSlotCountMax();
            Long rightSlotCountMax;
            rightSlotCountMax = that.getSlotCountMax();
            if (this.slotCountMax!= null) {
                if (that.slotCountMax!= null) {
                    if (!leftSlotCountMax.equals(rightSlotCountMax)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.slotCountMax!= null) {
                    return false;
                }
            }
        }
        {
            Duration leftSlotDurationMin;
            leftSlotDurationMin = this.getSlotDurationMin();
            Duration rightSlotDurationMin;
            rightSlotDurationMin = that.getSlotDurationMin();
            if (this.slotDurationMin!= null) {
                if (that.slotDurationMin!= null) {
                    if (!leftSlotDurationMin.equals(rightSlotDurationMin)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.slotDurationMin!= null) {
                    return false;
                }
            }
        }
        {
            Duration leftSlotDurationMax;
            leftSlotDurationMax = this.getSlotDurationMax();
            Duration rightSlotDurationMax;
            rightSlotDurationMax = that.getSlotDurationMax();
            if (this.slotDurationMax!= null) {
                if (that.slotDurationMax!= null) {
                    if (!leftSlotDurationMax.equals(rightSlotDurationMax)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.slotDurationMax!= null) {
                    return false;
                }
            }
        }
        {
            Duration leftSlotDurationStepSize;
            leftSlotDurationStepSize = this.getSlotDurationStepSize();
            Duration rightSlotDurationStepSize;
            rightSlotDurationStepSize = that.getSlotDurationStepSize();
            if (this.slotDurationStepSize!= null) {
                if (that.slotDurationStepSize!= null) {
                    if (!leftSlotDurationStepSize.equals(rightSlotDurationStepSize)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.slotDurationStepSize!= null) {
                    return false;
                }
            }
        }
        {
            String leftEarliestTimeSeriesStartTime;
            leftEarliestTimeSeriesStartTime = this.getEarliestTimeSeriesStartTime();
            String rightEarliestTimeSeriesStartTime;
            rightEarliestTimeSeriesStartTime = that.getEarliestTimeSeriesStartTime();
            if (this.earliestTimeSeriesStartTime!= null) {
                if (that.earliestTimeSeriesStartTime!= null) {
                    if (!leftEarliestTimeSeriesStartTime.equals(rightEarliestTimeSeriesStartTime)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.earliestTimeSeriesStartTime!= null) {
                    return false;
                }
            }
        }
        {
            String leftLatestTimeSeriesEndTime;
            leftLatestTimeSeriesEndTime = this.getLatestTimeSeriesEndTime();
            String rightLatestTimeSeriesEndTime;
            rightLatestTimeSeriesEndTime = that.getLatestTimeSeriesEndTime();
            if (this.latestTimeSeriesEndTime!= null) {
                if (that.latestTimeSeriesEndTime!= null) {
                    if (!leftLatestTimeSeriesEndTime.equals(rightLatestTimeSeriesEndTime)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.latestTimeSeriesEndTime!= null) {
                    return false;
                }
            }
        }
        {
            ScaledNumberType leftSlotValueMin;
            leftSlotValueMin = this.getSlotValueMin();
            ScaledNumberType rightSlotValueMin;
            rightSlotValueMin = that.getSlotValueMin();
            if (this.slotValueMin!= null) {
                if (that.slotValueMin!= null) {
                    if (!leftSlotValueMin.equals(rightSlotValueMin)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.slotValueMin!= null) {
                    return false;
                }
            }
        }
        {
            ScaledNumberType leftSlotValueMax;
            leftSlotValueMax = this.getSlotValueMax();
            ScaledNumberType rightSlotValueMax;
            rightSlotValueMax = that.getSlotValueMax();
            if (this.slotValueMax!= null) {
                if (that.slotValueMax!= null) {
                    if (!leftSlotValueMax.equals(rightSlotValueMax)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.slotValueMax!= null) {
                    return false;
                }
            }
        }
        {
            ScaledNumberType leftSlotValueStepSize;
            leftSlotValueStepSize = this.getSlotValueStepSize();
            ScaledNumberType rightSlotValueStepSize;
            rightSlotValueStepSize = that.getSlotValueStepSize();
            if (this.slotValueStepSize!= null) {
                if (that.slotValueStepSize!= null) {
                    if (!leftSlotValueStepSize.equals(rightSlotValueStepSize)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.slotValueStepSize!= null) {
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
            Long theSlotCountMin;
            theSlotCountMin = this.getSlotCountMin();
            if (this.slotCountMin!= null) {
                currentHashCode += theSlotCountMin.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            Long theSlotCountMax;
            theSlotCountMax = this.getSlotCountMax();
            if (this.slotCountMax!= null) {
                currentHashCode += theSlotCountMax.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            Duration theSlotDurationMin;
            theSlotDurationMin = this.getSlotDurationMin();
            if (this.slotDurationMin!= null) {
                currentHashCode += theSlotDurationMin.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            Duration theSlotDurationMax;
            theSlotDurationMax = this.getSlotDurationMax();
            if (this.slotDurationMax!= null) {
                currentHashCode += theSlotDurationMax.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            Duration theSlotDurationStepSize;
            theSlotDurationStepSize = this.getSlotDurationStepSize();
            if (this.slotDurationStepSize!= null) {
                currentHashCode += theSlotDurationStepSize.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String theEarliestTimeSeriesStartTime;
            theEarliestTimeSeriesStartTime = this.getEarliestTimeSeriesStartTime();
            if (this.earliestTimeSeriesStartTime!= null) {
                currentHashCode += theEarliestTimeSeriesStartTime.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String theLatestTimeSeriesEndTime;
            theLatestTimeSeriesEndTime = this.getLatestTimeSeriesEndTime();
            if (this.latestTimeSeriesEndTime!= null) {
                currentHashCode += theLatestTimeSeriesEndTime.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ScaledNumberType theSlotValueMin;
            theSlotValueMin = this.getSlotValueMin();
            if (this.slotValueMin!= null) {
                currentHashCode += theSlotValueMin.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ScaledNumberType theSlotValueMax;
            theSlotValueMax = this.getSlotValueMax();
            if (this.slotValueMax!= null) {
                currentHashCode += theSlotValueMax.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ScaledNumberType theSlotValueStepSize;
            theSlotValueStepSize = this.getSlotValueStepSize();
            if (this.slotValueStepSize!= null) {
                currentHashCode += theSlotValueStepSize.hashCode();
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
            Long theSlotCountMin;
            theSlotCountMin = this.getSlotCountMin();
            strategy.appendField(locator, this, "slotCountMin", buffer, theSlotCountMin, (this.slotCountMin!= null));
        }
        {
            Long theSlotCountMax;
            theSlotCountMax = this.getSlotCountMax();
            strategy.appendField(locator, this, "slotCountMax", buffer, theSlotCountMax, (this.slotCountMax!= null));
        }
        {
            Duration theSlotDurationMin;
            theSlotDurationMin = this.getSlotDurationMin();
            strategy.appendField(locator, this, "slotDurationMin", buffer, theSlotDurationMin, (this.slotDurationMin!= null));
        }
        {
            Duration theSlotDurationMax;
            theSlotDurationMax = this.getSlotDurationMax();
            strategy.appendField(locator, this, "slotDurationMax", buffer, theSlotDurationMax, (this.slotDurationMax!= null));
        }
        {
            Duration theSlotDurationStepSize;
            theSlotDurationStepSize = this.getSlotDurationStepSize();
            strategy.appendField(locator, this, "slotDurationStepSize", buffer, theSlotDurationStepSize, (this.slotDurationStepSize!= null));
        }
        {
            String theEarliestTimeSeriesStartTime;
            theEarliestTimeSeriesStartTime = this.getEarliestTimeSeriesStartTime();
            strategy.appendField(locator, this, "earliestTimeSeriesStartTime", buffer, theEarliestTimeSeriesStartTime, (this.earliestTimeSeriesStartTime!= null));
        }
        {
            String theLatestTimeSeriesEndTime;
            theLatestTimeSeriesEndTime = this.getLatestTimeSeriesEndTime();
            strategy.appendField(locator, this, "latestTimeSeriesEndTime", buffer, theLatestTimeSeriesEndTime, (this.latestTimeSeriesEndTime!= null));
        }
        {
            ScaledNumberType theSlotValueMin;
            theSlotValueMin = this.getSlotValueMin();
            strategy.appendField(locator, this, "slotValueMin", buffer, theSlotValueMin, (this.slotValueMin!= null));
        }
        {
            ScaledNumberType theSlotValueMax;
            theSlotValueMax = this.getSlotValueMax();
            strategy.appendField(locator, this, "slotValueMax", buffer, theSlotValueMax, (this.slotValueMax!= null));
        }
        {
            ScaledNumberType theSlotValueStepSize;
            theSlotValueStepSize = this.getSlotValueStepSize();
            strategy.appendField(locator, this, "slotValueStepSize", buffer, theSlotValueStepSize, (this.slotValueStepSize!= null));
        }
        return buffer;
    }

}
