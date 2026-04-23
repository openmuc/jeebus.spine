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
 * <p>Java class for TimeSeriesConstraintsDataElementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeSeriesConstraintsDataElementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="timeSeriesId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="slotCountMin" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="slotCountMax" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="slotDurationMin" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="slotDurationMax" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="slotDurationStepSize" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="earliestTimeSeriesStartTime" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="latestTimeSeriesEndTime" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="slotValueMin" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberElementsType" minOccurs="0"/&gt;
 *         &lt;element name="slotValueMax" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberElementsType" minOccurs="0"/&gt;
 *         &lt;element name="slotValueStepSize" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberElementsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeSeriesConstraintsDataElementsType", propOrder = {
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
public class TimeSeriesConstraintsDataElementsType implements Cloneable, CopyTo, ToString
{

    protected ElementTagType timeSeriesId;
    protected ElementTagType slotCountMin;
    protected ElementTagType slotCountMax;
    protected ElementTagType slotDurationMin;
    protected ElementTagType slotDurationMax;
    protected ElementTagType slotDurationStepSize;
    protected ElementTagType earliestTimeSeriesStartTime;
    protected ElementTagType latestTimeSeriesEndTime;
    protected ScaledNumberElementsType slotValueMin;
    protected ScaledNumberElementsType slotValueMax;
    protected ScaledNumberElementsType slotValueStepSize;

    /**
     * Default no-arg constructor
     * 
     */
    public TimeSeriesConstraintsDataElementsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public TimeSeriesConstraintsDataElementsType(final ElementTagType timeSeriesId, final ElementTagType slotCountMin, final ElementTagType slotCountMax, final ElementTagType slotDurationMin, final ElementTagType slotDurationMax, final ElementTagType slotDurationStepSize, final ElementTagType earliestTimeSeriesStartTime, final ElementTagType latestTimeSeriesEndTime, final ScaledNumberElementsType slotValueMin, final ScaledNumberElementsType slotValueMax, final ScaledNumberElementsType slotValueStepSize) {
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
     * Gets the value of the slotCountMin property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getSlotCountMin() {
        return slotCountMin;
    }

    /**
     * Sets the value of the slotCountMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setSlotCountMin(ElementTagType value) {
        this.slotCountMin = value;
    }

    /**
     * Gets the value of the slotCountMax property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getSlotCountMax() {
        return slotCountMax;
    }

    /**
     * Sets the value of the slotCountMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setSlotCountMax(ElementTagType value) {
        this.slotCountMax = value;
    }

    /**
     * Gets the value of the slotDurationMin property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getSlotDurationMin() {
        return slotDurationMin;
    }

    /**
     * Sets the value of the slotDurationMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setSlotDurationMin(ElementTagType value) {
        this.slotDurationMin = value;
    }

    /**
     * Gets the value of the slotDurationMax property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getSlotDurationMax() {
        return slotDurationMax;
    }

    /**
     * Sets the value of the slotDurationMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setSlotDurationMax(ElementTagType value) {
        this.slotDurationMax = value;
    }

    /**
     * Gets the value of the slotDurationStepSize property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getSlotDurationStepSize() {
        return slotDurationStepSize;
    }

    /**
     * Sets the value of the slotDurationStepSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setSlotDurationStepSize(ElementTagType value) {
        this.slotDurationStepSize = value;
    }

    /**
     * Gets the value of the earliestTimeSeriesStartTime property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getEarliestTimeSeriesStartTime() {
        return earliestTimeSeriesStartTime;
    }

    /**
     * Sets the value of the earliestTimeSeriesStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setEarliestTimeSeriesStartTime(ElementTagType value) {
        this.earliestTimeSeriesStartTime = value;
    }

    /**
     * Gets the value of the latestTimeSeriesEndTime property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getLatestTimeSeriesEndTime() {
        return latestTimeSeriesEndTime;
    }

    /**
     * Sets the value of the latestTimeSeriesEndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setLatestTimeSeriesEndTime(ElementTagType value) {
        this.latestTimeSeriesEndTime = value;
    }

    /**
     * Gets the value of the slotValueMin property.
     * 
     * @return
     *     possible object is
     *     {@link ScaledNumberElementsType }
     *     
     */
    public ScaledNumberElementsType getSlotValueMin() {
        return slotValueMin;
    }

    /**
     * Sets the value of the slotValueMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberElementsType }
     *     
     */
    public void setSlotValueMin(ScaledNumberElementsType value) {
        this.slotValueMin = value;
    }

    /**
     * Gets the value of the slotValueMax property.
     * 
     * @return
     *     possible object is
     *     {@link ScaledNumberElementsType }
     *     
     */
    public ScaledNumberElementsType getSlotValueMax() {
        return slotValueMax;
    }

    /**
     * Sets the value of the slotValueMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberElementsType }
     *     
     */
    public void setSlotValueMax(ScaledNumberElementsType value) {
        this.slotValueMax = value;
    }

    /**
     * Gets the value of the slotValueStepSize property.
     * 
     * @return
     *     possible object is
     *     {@link ScaledNumberElementsType }
     *     
     */
    public ScaledNumberElementsType getSlotValueStepSize() {
        return slotValueStepSize;
    }

    /**
     * Sets the value of the slotValueStepSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberElementsType }
     *     
     */
    public void setSlotValueStepSize(ScaledNumberElementsType value) {
        this.slotValueStepSize = value;
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
    public TimeSeriesConstraintsDataElementsType withTimeSeriesId(ElementTagType value) {
        setTimeSeriesId(value);
        return this;
    }

    /**
     * Sets the value of the slotCountMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public TimeSeriesConstraintsDataElementsType withSlotCountMin(ElementTagType value) {
        setSlotCountMin(value);
        return this;
    }

    /**
     * Sets the value of the slotCountMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public TimeSeriesConstraintsDataElementsType withSlotCountMax(ElementTagType value) {
        setSlotCountMax(value);
        return this;
    }

    /**
     * Sets the value of the slotDurationMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public TimeSeriesConstraintsDataElementsType withSlotDurationMin(ElementTagType value) {
        setSlotDurationMin(value);
        return this;
    }

    /**
     * Sets the value of the slotDurationMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public TimeSeriesConstraintsDataElementsType withSlotDurationMax(ElementTagType value) {
        setSlotDurationMax(value);
        return this;
    }

    /**
     * Sets the value of the slotDurationStepSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public TimeSeriesConstraintsDataElementsType withSlotDurationStepSize(ElementTagType value) {
        setSlotDurationStepSize(value);
        return this;
    }

    /**
     * Sets the value of the earliestTimeSeriesStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public TimeSeriesConstraintsDataElementsType withEarliestTimeSeriesStartTime(ElementTagType value) {
        setEarliestTimeSeriesStartTime(value);
        return this;
    }

    /**
     * Sets the value of the latestTimeSeriesEndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public TimeSeriesConstraintsDataElementsType withLatestTimeSeriesEndTime(ElementTagType value) {
        setLatestTimeSeriesEndTime(value);
        return this;
    }

    /**
     * Sets the value of the slotValueMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberElementsType }
     * @return
     *     The class instance
     */
    public TimeSeriesConstraintsDataElementsType withSlotValueMin(ScaledNumberElementsType value) {
        setSlotValueMin(value);
        return this;
    }

    /**
     * Sets the value of the slotValueMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberElementsType }
     * @return
     *     The class instance
     */
    public TimeSeriesConstraintsDataElementsType withSlotValueMax(ScaledNumberElementsType value) {
        setSlotValueMax(value);
        return this;
    }

    /**
     * Sets the value of the slotValueStepSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberElementsType }
     * @return
     *     The class instance
     */
    public TimeSeriesConstraintsDataElementsType withSlotValueStepSize(ScaledNumberElementsType value) {
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
        if (draftCopy instanceof TimeSeriesConstraintsDataElementsType) {
            final TimeSeriesConstraintsDataElementsType copy = ((TimeSeriesConstraintsDataElementsType) draftCopy);
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
                Boolean slotCountMinShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.slotCountMin!= null));
                if (slotCountMinShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceSlotCountMin;
                    sourceSlotCountMin = this.getSlotCountMin();
                    ElementTagType copySlotCountMin = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "slotCountMin", sourceSlotCountMin), sourceSlotCountMin, (this.slotCountMin!= null)));
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
                    ElementTagType sourceSlotCountMax;
                    sourceSlotCountMax = this.getSlotCountMax();
                    ElementTagType copySlotCountMax = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "slotCountMax", sourceSlotCountMax), sourceSlotCountMax, (this.slotCountMax!= null)));
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
                    ElementTagType sourceSlotDurationMin;
                    sourceSlotDurationMin = this.getSlotDurationMin();
                    ElementTagType copySlotDurationMin = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "slotDurationMin", sourceSlotDurationMin), sourceSlotDurationMin, (this.slotDurationMin!= null)));
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
                    ElementTagType sourceSlotDurationMax;
                    sourceSlotDurationMax = this.getSlotDurationMax();
                    ElementTagType copySlotDurationMax = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "slotDurationMax", sourceSlotDurationMax), sourceSlotDurationMax, (this.slotDurationMax!= null)));
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
                    ElementTagType sourceSlotDurationStepSize;
                    sourceSlotDurationStepSize = this.getSlotDurationStepSize();
                    ElementTagType copySlotDurationStepSize = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "slotDurationStepSize", sourceSlotDurationStepSize), sourceSlotDurationStepSize, (this.slotDurationStepSize!= null)));
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
                    ElementTagType sourceEarliestTimeSeriesStartTime;
                    sourceEarliestTimeSeriesStartTime = this.getEarliestTimeSeriesStartTime();
                    ElementTagType copyEarliestTimeSeriesStartTime = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "earliestTimeSeriesStartTime", sourceEarliestTimeSeriesStartTime), sourceEarliestTimeSeriesStartTime, (this.earliestTimeSeriesStartTime!= null)));
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
                    ElementTagType sourceLatestTimeSeriesEndTime;
                    sourceLatestTimeSeriesEndTime = this.getLatestTimeSeriesEndTime();
                    ElementTagType copyLatestTimeSeriesEndTime = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "latestTimeSeriesEndTime", sourceLatestTimeSeriesEndTime), sourceLatestTimeSeriesEndTime, (this.latestTimeSeriesEndTime!= null)));
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
                    ScaledNumberElementsType sourceSlotValueMin;
                    sourceSlotValueMin = this.getSlotValueMin();
                    ScaledNumberElementsType copySlotValueMin = ((ScaledNumberElementsType) strategy.copy(LocatorUtils.property(locator, "slotValueMin", sourceSlotValueMin), sourceSlotValueMin, (this.slotValueMin!= null)));
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
                    ScaledNumberElementsType sourceSlotValueMax;
                    sourceSlotValueMax = this.getSlotValueMax();
                    ScaledNumberElementsType copySlotValueMax = ((ScaledNumberElementsType) strategy.copy(LocatorUtils.property(locator, "slotValueMax", sourceSlotValueMax), sourceSlotValueMax, (this.slotValueMax!= null)));
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
                    ScaledNumberElementsType sourceSlotValueStepSize;
                    sourceSlotValueStepSize = this.getSlotValueStepSize();
                    ScaledNumberElementsType copySlotValueStepSize = ((ScaledNumberElementsType) strategy.copy(LocatorUtils.property(locator, "slotValueStepSize", sourceSlotValueStepSize), sourceSlotValueStepSize, (this.slotValueStepSize!= null)));
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
        return new TimeSeriesConstraintsDataElementsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TimeSeriesConstraintsDataElementsType that = ((TimeSeriesConstraintsDataElementsType) object);
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
            ElementTagType leftSlotCountMin;
            leftSlotCountMin = this.getSlotCountMin();
            ElementTagType rightSlotCountMin;
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
            ElementTagType leftSlotCountMax;
            leftSlotCountMax = this.getSlotCountMax();
            ElementTagType rightSlotCountMax;
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
            ElementTagType leftSlotDurationMin;
            leftSlotDurationMin = this.getSlotDurationMin();
            ElementTagType rightSlotDurationMin;
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
            ElementTagType leftSlotDurationMax;
            leftSlotDurationMax = this.getSlotDurationMax();
            ElementTagType rightSlotDurationMax;
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
            ElementTagType leftSlotDurationStepSize;
            leftSlotDurationStepSize = this.getSlotDurationStepSize();
            ElementTagType rightSlotDurationStepSize;
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
            ElementTagType leftEarliestTimeSeriesStartTime;
            leftEarliestTimeSeriesStartTime = this.getEarliestTimeSeriesStartTime();
            ElementTagType rightEarliestTimeSeriesStartTime;
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
            ElementTagType leftLatestTimeSeriesEndTime;
            leftLatestTimeSeriesEndTime = this.getLatestTimeSeriesEndTime();
            ElementTagType rightLatestTimeSeriesEndTime;
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
            ScaledNumberElementsType leftSlotValueMin;
            leftSlotValueMin = this.getSlotValueMin();
            ScaledNumberElementsType rightSlotValueMin;
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
            ScaledNumberElementsType leftSlotValueMax;
            leftSlotValueMax = this.getSlotValueMax();
            ScaledNumberElementsType rightSlotValueMax;
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
            ScaledNumberElementsType leftSlotValueStepSize;
            leftSlotValueStepSize = this.getSlotValueStepSize();
            ScaledNumberElementsType rightSlotValueStepSize;
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
            ElementTagType theTimeSeriesId;
            theTimeSeriesId = this.getTimeSeriesId();
            if (this.timeSeriesId!= null) {
                currentHashCode += theTimeSeriesId.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theSlotCountMin;
            theSlotCountMin = this.getSlotCountMin();
            if (this.slotCountMin!= null) {
                currentHashCode += theSlotCountMin.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theSlotCountMax;
            theSlotCountMax = this.getSlotCountMax();
            if (this.slotCountMax!= null) {
                currentHashCode += theSlotCountMax.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theSlotDurationMin;
            theSlotDurationMin = this.getSlotDurationMin();
            if (this.slotDurationMin!= null) {
                currentHashCode += theSlotDurationMin.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theSlotDurationMax;
            theSlotDurationMax = this.getSlotDurationMax();
            if (this.slotDurationMax!= null) {
                currentHashCode += theSlotDurationMax.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theSlotDurationStepSize;
            theSlotDurationStepSize = this.getSlotDurationStepSize();
            if (this.slotDurationStepSize!= null) {
                currentHashCode += theSlotDurationStepSize.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theEarliestTimeSeriesStartTime;
            theEarliestTimeSeriesStartTime = this.getEarliestTimeSeriesStartTime();
            if (this.earliestTimeSeriesStartTime!= null) {
                currentHashCode += theEarliestTimeSeriesStartTime.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theLatestTimeSeriesEndTime;
            theLatestTimeSeriesEndTime = this.getLatestTimeSeriesEndTime();
            if (this.latestTimeSeriesEndTime!= null) {
                currentHashCode += theLatestTimeSeriesEndTime.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ScaledNumberElementsType theSlotValueMin;
            theSlotValueMin = this.getSlotValueMin();
            if (this.slotValueMin!= null) {
                currentHashCode += theSlotValueMin.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ScaledNumberElementsType theSlotValueMax;
            theSlotValueMax = this.getSlotValueMax();
            if (this.slotValueMax!= null) {
                currentHashCode += theSlotValueMax.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ScaledNumberElementsType theSlotValueStepSize;
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
            ElementTagType theTimeSeriesId;
            theTimeSeriesId = this.getTimeSeriesId();
            strategy.appendField(locator, this, "timeSeriesId", buffer, theTimeSeriesId, (this.timeSeriesId!= null));
        }
        {
            ElementTagType theSlotCountMin;
            theSlotCountMin = this.getSlotCountMin();
            strategy.appendField(locator, this, "slotCountMin", buffer, theSlotCountMin, (this.slotCountMin!= null));
        }
        {
            ElementTagType theSlotCountMax;
            theSlotCountMax = this.getSlotCountMax();
            strategy.appendField(locator, this, "slotCountMax", buffer, theSlotCountMax, (this.slotCountMax!= null));
        }
        {
            ElementTagType theSlotDurationMin;
            theSlotDurationMin = this.getSlotDurationMin();
            strategy.appendField(locator, this, "slotDurationMin", buffer, theSlotDurationMin, (this.slotDurationMin!= null));
        }
        {
            ElementTagType theSlotDurationMax;
            theSlotDurationMax = this.getSlotDurationMax();
            strategy.appendField(locator, this, "slotDurationMax", buffer, theSlotDurationMax, (this.slotDurationMax!= null));
        }
        {
            ElementTagType theSlotDurationStepSize;
            theSlotDurationStepSize = this.getSlotDurationStepSize();
            strategy.appendField(locator, this, "slotDurationStepSize", buffer, theSlotDurationStepSize, (this.slotDurationStepSize!= null));
        }
        {
            ElementTagType theEarliestTimeSeriesStartTime;
            theEarliestTimeSeriesStartTime = this.getEarliestTimeSeriesStartTime();
            strategy.appendField(locator, this, "earliestTimeSeriesStartTime", buffer, theEarliestTimeSeriesStartTime, (this.earliestTimeSeriesStartTime!= null));
        }
        {
            ElementTagType theLatestTimeSeriesEndTime;
            theLatestTimeSeriesEndTime = this.getLatestTimeSeriesEndTime();
            strategy.appendField(locator, this, "latestTimeSeriesEndTime", buffer, theLatestTimeSeriesEndTime, (this.latestTimeSeriesEndTime!= null));
        }
        {
            ScaledNumberElementsType theSlotValueMin;
            theSlotValueMin = this.getSlotValueMin();
            strategy.appendField(locator, this, "slotValueMin", buffer, theSlotValueMin, (this.slotValueMin!= null));
        }
        {
            ScaledNumberElementsType theSlotValueMax;
            theSlotValueMax = this.getSlotValueMax();
            strategy.appendField(locator, this, "slotValueMax", buffer, theSlotValueMax, (this.slotValueMax!= null));
        }
        {
            ScaledNumberElementsType theSlotValueStepSize;
            theSlotValueStepSize = this.getSlotValueStepSize();
            strategy.appendField(locator, this, "slotValueStepSize", buffer, theSlotValueStepSize, (this.slotValueStepSize!= null));
        }
        return buffer;
    }

}
