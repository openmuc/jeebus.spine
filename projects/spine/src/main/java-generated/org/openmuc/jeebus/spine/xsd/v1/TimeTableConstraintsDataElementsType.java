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
import jakarta.xml.bind.annotation.XmlSeeAlso;
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
 * <p>Java class for TimeTableConstraintsDataElementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeTableConstraintsDataElementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="timeTableId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="slotCountMin" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="slotCountMax" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="slotDurationMin" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="slotDurationMax" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="slotDurationStepSize" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="slotShiftStepSize" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="firstSlotBeginsAt" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeTableConstraintsDataElementsType", propOrder = {
    "timeTableId",
    "slotCountMin",
    "slotCountMax",
    "slotDurationMin",
    "slotDurationMax",
    "slotDurationStepSize",
    "slotShiftStepSize",
    "firstSlotBeginsAt"
})
@XmlSeeAlso({
    org.openmuc.jeebus.spine.xsd.v1.IncentiveTableConstraintsElementsType.IncentiveSlotConstraints.class
})
public class TimeTableConstraintsDataElementsType implements Cloneable, CopyTo, ToString
{

    protected ElementTagType timeTableId;
    protected ElementTagType slotCountMin;
    protected ElementTagType slotCountMax;
    protected ElementTagType slotDurationMin;
    protected ElementTagType slotDurationMax;
    protected ElementTagType slotDurationStepSize;
    protected ElementTagType slotShiftStepSize;
    protected ElementTagType firstSlotBeginsAt;

    /**
     * Default no-arg constructor
     * 
     */
    public TimeTableConstraintsDataElementsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public TimeTableConstraintsDataElementsType(final ElementTagType timeTableId, final ElementTagType slotCountMin, final ElementTagType slotCountMax, final ElementTagType slotDurationMin, final ElementTagType slotDurationMax, final ElementTagType slotDurationStepSize, final ElementTagType slotShiftStepSize, final ElementTagType firstSlotBeginsAt) {
        this.timeTableId = timeTableId;
        this.slotCountMin = slotCountMin;
        this.slotCountMax = slotCountMax;
        this.slotDurationMin = slotDurationMin;
        this.slotDurationMax = slotDurationMax;
        this.slotDurationStepSize = slotDurationStepSize;
        this.slotShiftStepSize = slotShiftStepSize;
        this.firstSlotBeginsAt = firstSlotBeginsAt;
    }

    /**
     * Gets the value of the timeTableId property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getTimeTableId() {
        return timeTableId;
    }

    /**
     * Sets the value of the timeTableId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setTimeTableId(ElementTagType value) {
        this.timeTableId = value;
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
     * Gets the value of the slotShiftStepSize property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getSlotShiftStepSize() {
        return slotShiftStepSize;
    }

    /**
     * Sets the value of the slotShiftStepSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setSlotShiftStepSize(ElementTagType value) {
        this.slotShiftStepSize = value;
    }

    /**
     * Gets the value of the firstSlotBeginsAt property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getFirstSlotBeginsAt() {
        return firstSlotBeginsAt;
    }

    /**
     * Sets the value of the firstSlotBeginsAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setFirstSlotBeginsAt(ElementTagType value) {
        this.firstSlotBeginsAt = value;
    }

    /**
     * Sets the value of the timeTableId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public TimeTableConstraintsDataElementsType withTimeTableId(ElementTagType value) {
        setTimeTableId(value);
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
    public TimeTableConstraintsDataElementsType withSlotCountMin(ElementTagType value) {
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
    public TimeTableConstraintsDataElementsType withSlotCountMax(ElementTagType value) {
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
    public TimeTableConstraintsDataElementsType withSlotDurationMin(ElementTagType value) {
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
    public TimeTableConstraintsDataElementsType withSlotDurationMax(ElementTagType value) {
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
    public TimeTableConstraintsDataElementsType withSlotDurationStepSize(ElementTagType value) {
        setSlotDurationStepSize(value);
        return this;
    }

    /**
     * Sets the value of the slotShiftStepSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public TimeTableConstraintsDataElementsType withSlotShiftStepSize(ElementTagType value) {
        setSlotShiftStepSize(value);
        return this;
    }

    /**
     * Sets the value of the firstSlotBeginsAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public TimeTableConstraintsDataElementsType withFirstSlotBeginsAt(ElementTagType value) {
        setFirstSlotBeginsAt(value);
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
        if (draftCopy instanceof TimeTableConstraintsDataElementsType) {
            final TimeTableConstraintsDataElementsType copy = ((TimeTableConstraintsDataElementsType) draftCopy);
            {
                Boolean timeTableIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.timeTableId!= null));
                if (timeTableIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceTimeTableId;
                    sourceTimeTableId = this.getTimeTableId();
                    ElementTagType copyTimeTableId = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "timeTableId", sourceTimeTableId), sourceTimeTableId, (this.timeTableId!= null)));
                    copy.setTimeTableId(copyTimeTableId);
                } else {
                    if (timeTableIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.timeTableId = null;
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
                Boolean slotShiftStepSizeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.slotShiftStepSize!= null));
                if (slotShiftStepSizeShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceSlotShiftStepSize;
                    sourceSlotShiftStepSize = this.getSlotShiftStepSize();
                    ElementTagType copySlotShiftStepSize = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "slotShiftStepSize", sourceSlotShiftStepSize), sourceSlotShiftStepSize, (this.slotShiftStepSize!= null)));
                    copy.setSlotShiftStepSize(copySlotShiftStepSize);
                } else {
                    if (slotShiftStepSizeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.slotShiftStepSize = null;
                    }
                }
            }
            {
                Boolean firstSlotBeginsAtShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.firstSlotBeginsAt!= null));
                if (firstSlotBeginsAtShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceFirstSlotBeginsAt;
                    sourceFirstSlotBeginsAt = this.getFirstSlotBeginsAt();
                    ElementTagType copyFirstSlotBeginsAt = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "firstSlotBeginsAt", sourceFirstSlotBeginsAt), sourceFirstSlotBeginsAt, (this.firstSlotBeginsAt!= null)));
                    copy.setFirstSlotBeginsAt(copyFirstSlotBeginsAt);
                } else {
                    if (firstSlotBeginsAtShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.firstSlotBeginsAt = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new TimeTableConstraintsDataElementsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TimeTableConstraintsDataElementsType that = ((TimeTableConstraintsDataElementsType) object);
        {
            ElementTagType leftTimeTableId;
            leftTimeTableId = this.getTimeTableId();
            ElementTagType rightTimeTableId;
            rightTimeTableId = that.getTimeTableId();
            if (this.timeTableId!= null) {
                if (that.timeTableId!= null) {
                    if (!leftTimeTableId.equals(rightTimeTableId)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.timeTableId!= null) {
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
            ElementTagType leftSlotShiftStepSize;
            leftSlotShiftStepSize = this.getSlotShiftStepSize();
            ElementTagType rightSlotShiftStepSize;
            rightSlotShiftStepSize = that.getSlotShiftStepSize();
            if (this.slotShiftStepSize!= null) {
                if (that.slotShiftStepSize!= null) {
                    if (!leftSlotShiftStepSize.equals(rightSlotShiftStepSize)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.slotShiftStepSize!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftFirstSlotBeginsAt;
            leftFirstSlotBeginsAt = this.getFirstSlotBeginsAt();
            ElementTagType rightFirstSlotBeginsAt;
            rightFirstSlotBeginsAt = that.getFirstSlotBeginsAt();
            if (this.firstSlotBeginsAt!= null) {
                if (that.firstSlotBeginsAt!= null) {
                    if (!leftFirstSlotBeginsAt.equals(rightFirstSlotBeginsAt)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.firstSlotBeginsAt!= null) {
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
            ElementTagType theTimeTableId;
            theTimeTableId = this.getTimeTableId();
            if (this.timeTableId!= null) {
                currentHashCode += theTimeTableId.hashCode();
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
            ElementTagType theSlotShiftStepSize;
            theSlotShiftStepSize = this.getSlotShiftStepSize();
            if (this.slotShiftStepSize!= null) {
                currentHashCode += theSlotShiftStepSize.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theFirstSlotBeginsAt;
            theFirstSlotBeginsAt = this.getFirstSlotBeginsAt();
            if (this.firstSlotBeginsAt!= null) {
                currentHashCode += theFirstSlotBeginsAt.hashCode();
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
            ElementTagType theTimeTableId;
            theTimeTableId = this.getTimeTableId();
            strategy.appendField(locator, this, "timeTableId", buffer, theTimeTableId, (this.timeTableId!= null));
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
            ElementTagType theSlotShiftStepSize;
            theSlotShiftStepSize = this.getSlotShiftStepSize();
            strategy.appendField(locator, this, "slotShiftStepSize", buffer, theSlotShiftStepSize, (this.slotShiftStepSize!= null));
        }
        {
            ElementTagType theFirstSlotBeginsAt;
            theFirstSlotBeginsAt = this.getFirstSlotBeginsAt();
            strategy.appendField(locator, this, "firstSlotBeginsAt", buffer, theFirstSlotBeginsAt, (this.firstSlotBeginsAt!= null));
        }
        return buffer;
    }

}
