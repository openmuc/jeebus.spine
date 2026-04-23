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
import jakarta.xml.bind.annotation.XmlSchemaType;
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
 * <p>Java class for TimeTableConstraintsDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeTableConstraintsDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="timeTableId" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="slotCountMin" type="{http://docs.eebus.org/spine/xsd/v1}TimeSlotCountType" minOccurs="0"/&gt;
 *         &lt;element name="slotCountMax" type="{http://docs.eebus.org/spine/xsd/v1}TimeSlotCountType" minOccurs="0"/&gt;
 *         &lt;element name="slotDurationMin" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *         &lt;element name="slotDurationMax" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *         &lt;element name="slotDurationStepSize" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *         &lt;element name="slotShiftStepSize" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *         &lt;element name="firstSlotBeginsAt" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeTableConstraintsDataType", propOrder = {
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
    org.openmuc.jeebus.spine.xsd.v1.IncentiveTableConstraintsType.IncentiveSlotConstraints.class
})
public class TimeTableConstraintsDataType implements Cloneable, CopyTo, ToString
{

    @XmlSchemaType(name = "unsignedInt")
    protected Long timeTableId;
    @XmlSchemaType(name = "unsignedInt")
    protected Long slotCountMin;
    @XmlSchemaType(name = "unsignedInt")
    protected Long slotCountMax;
    protected Duration slotDurationMin;
    protected Duration slotDurationMax;
    protected Duration slotDurationStepSize;
    protected Duration slotShiftStepSize;
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar firstSlotBeginsAt;

    /**
     * Default no-arg constructor
     * 
     */
    public TimeTableConstraintsDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public TimeTableConstraintsDataType(final Long timeTableId, final Long slotCountMin, final Long slotCountMax, final Duration slotDurationMin, final Duration slotDurationMax, final Duration slotDurationStepSize, final Duration slotShiftStepSize, final XMLGregorianCalendar firstSlotBeginsAt) {
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
     *     {@link Long }
     *     
     */
    public Long getTimeTableId() {
        return timeTableId;
    }

    /**
     * Sets the value of the timeTableId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTimeTableId(Long value) {
        this.timeTableId = value;
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
     * Gets the value of the slotShiftStepSize property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getSlotShiftStepSize() {
        return slotShiftStepSize;
    }

    /**
     * Sets the value of the slotShiftStepSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setSlotShiftStepSize(Duration value) {
        this.slotShiftStepSize = value;
    }

    /**
     * Gets the value of the firstSlotBeginsAt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFirstSlotBeginsAt() {
        return firstSlotBeginsAt;
    }

    /**
     * Sets the value of the firstSlotBeginsAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFirstSlotBeginsAt(XMLGregorianCalendar value) {
        this.firstSlotBeginsAt = value;
    }

    /**
     * Sets the value of the timeTableId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     * @return
     *     The class instance
     */
    public TimeTableConstraintsDataType withTimeTableId(Long value) {
        setTimeTableId(value);
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
    public TimeTableConstraintsDataType withSlotCountMin(Long value) {
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
    public TimeTableConstraintsDataType withSlotCountMax(Long value) {
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
    public TimeTableConstraintsDataType withSlotDurationMin(Duration value) {
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
    public TimeTableConstraintsDataType withSlotDurationMax(Duration value) {
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
    public TimeTableConstraintsDataType withSlotDurationStepSize(Duration value) {
        setSlotDurationStepSize(value);
        return this;
    }

    /**
     * Sets the value of the slotShiftStepSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     * @return
     *     The class instance
     */
    public TimeTableConstraintsDataType withSlotShiftStepSize(Duration value) {
        setSlotShiftStepSize(value);
        return this;
    }

    /**
     * Sets the value of the firstSlotBeginsAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     * @return
     *     The class instance
     */
    public TimeTableConstraintsDataType withFirstSlotBeginsAt(XMLGregorianCalendar value) {
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
        if (draftCopy instanceof TimeTableConstraintsDataType) {
            final TimeTableConstraintsDataType copy = ((TimeTableConstraintsDataType) draftCopy);
            {
                Boolean timeTableIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.timeTableId!= null));
                if (timeTableIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceTimeTableId;
                    sourceTimeTableId = this.getTimeTableId();
                    Long copyTimeTableId = ((Long) strategy.copy(LocatorUtils.property(locator, "timeTableId", sourceTimeTableId), sourceTimeTableId, (this.timeTableId!= null)));
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
                Boolean slotShiftStepSizeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.slotShiftStepSize!= null));
                if (slotShiftStepSizeShouldBeCopiedAndSet == Boolean.TRUE) {
                    Duration sourceSlotShiftStepSize;
                    sourceSlotShiftStepSize = this.getSlotShiftStepSize();
                    Duration copySlotShiftStepSize = ((Duration) strategy.copy(LocatorUtils.property(locator, "slotShiftStepSize", sourceSlotShiftStepSize), sourceSlotShiftStepSize, (this.slotShiftStepSize!= null)));
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
                    XMLGregorianCalendar sourceFirstSlotBeginsAt;
                    sourceFirstSlotBeginsAt = this.getFirstSlotBeginsAt();
                    XMLGregorianCalendar copyFirstSlotBeginsAt = ((XMLGregorianCalendar) strategy.copy(LocatorUtils.property(locator, "firstSlotBeginsAt", sourceFirstSlotBeginsAt), sourceFirstSlotBeginsAt, (this.firstSlotBeginsAt!= null)));
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
        return new TimeTableConstraintsDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TimeTableConstraintsDataType that = ((TimeTableConstraintsDataType) object);
        {
            Long leftTimeTableId;
            leftTimeTableId = this.getTimeTableId();
            Long rightTimeTableId;
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
            Duration leftSlotShiftStepSize;
            leftSlotShiftStepSize = this.getSlotShiftStepSize();
            Duration rightSlotShiftStepSize;
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
            XMLGregorianCalendar leftFirstSlotBeginsAt;
            leftFirstSlotBeginsAt = this.getFirstSlotBeginsAt();
            XMLGregorianCalendar rightFirstSlotBeginsAt;
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
            Long theTimeTableId;
            theTimeTableId = this.getTimeTableId();
            if (this.timeTableId!= null) {
                currentHashCode += theTimeTableId.hashCode();
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
            Duration theSlotShiftStepSize;
            theSlotShiftStepSize = this.getSlotShiftStepSize();
            if (this.slotShiftStepSize!= null) {
                currentHashCode += theSlotShiftStepSize.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            XMLGregorianCalendar theFirstSlotBeginsAt;
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
            Long theTimeTableId;
            theTimeTableId = this.getTimeTableId();
            strategy.appendField(locator, this, "timeTableId", buffer, theTimeTableId, (this.timeTableId!= null));
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
            Duration theSlotShiftStepSize;
            theSlotShiftStepSize = this.getSlotShiftStepSize();
            strategy.appendField(locator, this, "slotShiftStepSize", buffer, theSlotShiftStepSize, (this.slotShiftStepSize!= null));
        }
        {
            XMLGregorianCalendar theFirstSlotBeginsAt;
            theFirstSlotBeginsAt = this.getFirstSlotBeginsAt();
            strategy.appendField(locator, this, "firstSlotBeginsAt", buffer, theFirstSlotBeginsAt, (this.firstSlotBeginsAt!= null));
        }
        return buffer;
    }

}
