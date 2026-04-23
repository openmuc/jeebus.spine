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
 * <p>Java class for TierBoundaryDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TierBoundaryDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="boundaryId" type="{http://docs.eebus.org/spine/xsd/v1}TierBoundaryIdType" minOccurs="0"/&gt;
 *         &lt;element name="timePeriod" type="{http://docs.eebus.org/spine/xsd/v1}TimePeriodType" minOccurs="0"/&gt;
 *         &lt;element name="timeTableId" type="{http://docs.eebus.org/spine/xsd/v1}TimeTableIdType" minOccurs="0"/&gt;
 *         &lt;element name="lowerBoundaryValue" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberType" minOccurs="0"/&gt;
 *         &lt;element name="upperBoundaryValue" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TierBoundaryDataType", propOrder = {
    "boundaryId",
    "timePeriod",
    "timeTableId",
    "lowerBoundaryValue",
    "upperBoundaryValue"
})
@XmlSeeAlso({
    org.openmuc.jeebus.spine.xsd.v1.IncentiveTableTierType.Boundary.class
})
public class TierBoundaryDataType implements Cloneable, CopyTo, ToString
{

    @XmlSchemaType(name = "unsignedInt")
    protected Long boundaryId;
    protected TimePeriodType timePeriod;
    @XmlSchemaType(name = "unsignedInt")
    protected Long timeTableId;
    protected ScaledNumberType lowerBoundaryValue;
    protected ScaledNumberType upperBoundaryValue;

    /**
     * Default no-arg constructor
     * 
     */
    public TierBoundaryDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public TierBoundaryDataType(final Long boundaryId, final TimePeriodType timePeriod, final Long timeTableId, final ScaledNumberType lowerBoundaryValue, final ScaledNumberType upperBoundaryValue) {
        this.boundaryId = boundaryId;
        this.timePeriod = timePeriod;
        this.timeTableId = timeTableId;
        this.lowerBoundaryValue = lowerBoundaryValue;
        this.upperBoundaryValue = upperBoundaryValue;
    }

    /**
     * Gets the value of the boundaryId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBoundaryId() {
        return boundaryId;
    }

    /**
     * Sets the value of the boundaryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBoundaryId(Long value) {
        this.boundaryId = value;
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
     * Gets the value of the lowerBoundaryValue property.
     * 
     * @return
     *     possible object is
     *     {@link ScaledNumberType }
     *     
     */
    public ScaledNumberType getLowerBoundaryValue() {
        return lowerBoundaryValue;
    }

    /**
     * Sets the value of the lowerBoundaryValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberType }
     *     
     */
    public void setLowerBoundaryValue(ScaledNumberType value) {
        this.lowerBoundaryValue = value;
    }

    /**
     * Gets the value of the upperBoundaryValue property.
     * 
     * @return
     *     possible object is
     *     {@link ScaledNumberType }
     *     
     */
    public ScaledNumberType getUpperBoundaryValue() {
        return upperBoundaryValue;
    }

    /**
     * Sets the value of the upperBoundaryValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberType }
     *     
     */
    public void setUpperBoundaryValue(ScaledNumberType value) {
        this.upperBoundaryValue = value;
    }

    /**
     * Sets the value of the boundaryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     * @return
     *     The class instance
     */
    public TierBoundaryDataType withBoundaryId(Long value) {
        setBoundaryId(value);
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
    public TierBoundaryDataType withTimePeriod(TimePeriodType value) {
        setTimePeriod(value);
        return this;
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
    public TierBoundaryDataType withTimeTableId(Long value) {
        setTimeTableId(value);
        return this;
    }

    /**
     * Sets the value of the lowerBoundaryValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberType }
     * @return
     *     The class instance
     */
    public TierBoundaryDataType withLowerBoundaryValue(ScaledNumberType value) {
        setLowerBoundaryValue(value);
        return this;
    }

    /**
     * Sets the value of the upperBoundaryValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberType }
     * @return
     *     The class instance
     */
    public TierBoundaryDataType withUpperBoundaryValue(ScaledNumberType value) {
        setUpperBoundaryValue(value);
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
        if (draftCopy instanceof TierBoundaryDataType) {
            final TierBoundaryDataType copy = ((TierBoundaryDataType) draftCopy);
            {
                Boolean boundaryIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.boundaryId!= null));
                if (boundaryIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceBoundaryId;
                    sourceBoundaryId = this.getBoundaryId();
                    Long copyBoundaryId = ((Long) strategy.copy(LocatorUtils.property(locator, "boundaryId", sourceBoundaryId), sourceBoundaryId, (this.boundaryId!= null)));
                    copy.setBoundaryId(copyBoundaryId);
                } else {
                    if (boundaryIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.boundaryId = null;
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
                Boolean lowerBoundaryValueShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.lowerBoundaryValue!= null));
                if (lowerBoundaryValueShouldBeCopiedAndSet == Boolean.TRUE) {
                    ScaledNumberType sourceLowerBoundaryValue;
                    sourceLowerBoundaryValue = this.getLowerBoundaryValue();
                    ScaledNumberType copyLowerBoundaryValue = ((ScaledNumberType) strategy.copy(LocatorUtils.property(locator, "lowerBoundaryValue", sourceLowerBoundaryValue), sourceLowerBoundaryValue, (this.lowerBoundaryValue!= null)));
                    copy.setLowerBoundaryValue(copyLowerBoundaryValue);
                } else {
                    if (lowerBoundaryValueShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.lowerBoundaryValue = null;
                    }
                }
            }
            {
                Boolean upperBoundaryValueShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.upperBoundaryValue!= null));
                if (upperBoundaryValueShouldBeCopiedAndSet == Boolean.TRUE) {
                    ScaledNumberType sourceUpperBoundaryValue;
                    sourceUpperBoundaryValue = this.getUpperBoundaryValue();
                    ScaledNumberType copyUpperBoundaryValue = ((ScaledNumberType) strategy.copy(LocatorUtils.property(locator, "upperBoundaryValue", sourceUpperBoundaryValue), sourceUpperBoundaryValue, (this.upperBoundaryValue!= null)));
                    copy.setUpperBoundaryValue(copyUpperBoundaryValue);
                } else {
                    if (upperBoundaryValueShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.upperBoundaryValue = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new TierBoundaryDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TierBoundaryDataType that = ((TierBoundaryDataType) object);
        {
            Long leftBoundaryId;
            leftBoundaryId = this.getBoundaryId();
            Long rightBoundaryId;
            rightBoundaryId = that.getBoundaryId();
            if (this.boundaryId!= null) {
                if (that.boundaryId!= null) {
                    if (!leftBoundaryId.equals(rightBoundaryId)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.boundaryId!= null) {
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
            ScaledNumberType leftLowerBoundaryValue;
            leftLowerBoundaryValue = this.getLowerBoundaryValue();
            ScaledNumberType rightLowerBoundaryValue;
            rightLowerBoundaryValue = that.getLowerBoundaryValue();
            if (this.lowerBoundaryValue!= null) {
                if (that.lowerBoundaryValue!= null) {
                    if (!leftLowerBoundaryValue.equals(rightLowerBoundaryValue)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.lowerBoundaryValue!= null) {
                    return false;
                }
            }
        }
        {
            ScaledNumberType leftUpperBoundaryValue;
            leftUpperBoundaryValue = this.getUpperBoundaryValue();
            ScaledNumberType rightUpperBoundaryValue;
            rightUpperBoundaryValue = that.getUpperBoundaryValue();
            if (this.upperBoundaryValue!= null) {
                if (that.upperBoundaryValue!= null) {
                    if (!leftUpperBoundaryValue.equals(rightUpperBoundaryValue)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.upperBoundaryValue!= null) {
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
            Long theBoundaryId;
            theBoundaryId = this.getBoundaryId();
            if (this.boundaryId!= null) {
                currentHashCode += theBoundaryId.hashCode();
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
            Long theTimeTableId;
            theTimeTableId = this.getTimeTableId();
            if (this.timeTableId!= null) {
                currentHashCode += theTimeTableId.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ScaledNumberType theLowerBoundaryValue;
            theLowerBoundaryValue = this.getLowerBoundaryValue();
            if (this.lowerBoundaryValue!= null) {
                currentHashCode += theLowerBoundaryValue.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ScaledNumberType theUpperBoundaryValue;
            theUpperBoundaryValue = this.getUpperBoundaryValue();
            if (this.upperBoundaryValue!= null) {
                currentHashCode += theUpperBoundaryValue.hashCode();
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
            Long theBoundaryId;
            theBoundaryId = this.getBoundaryId();
            strategy.appendField(locator, this, "boundaryId", buffer, theBoundaryId, (this.boundaryId!= null));
        }
        {
            TimePeriodType theTimePeriod;
            theTimePeriod = this.getTimePeriod();
            strategy.appendField(locator, this, "timePeriod", buffer, theTimePeriod, (this.timePeriod!= null));
        }
        {
            Long theTimeTableId;
            theTimeTableId = this.getTimeTableId();
            strategy.appendField(locator, this, "timeTableId", buffer, theTimeTableId, (this.timeTableId!= null));
        }
        {
            ScaledNumberType theLowerBoundaryValue;
            theLowerBoundaryValue = this.getLowerBoundaryValue();
            strategy.appendField(locator, this, "lowerBoundaryValue", buffer, theLowerBoundaryValue, (this.lowerBoundaryValue!= null));
        }
        {
            ScaledNumberType theUpperBoundaryValue;
            theUpperBoundaryValue = this.getUpperBoundaryValue();
            strategy.appendField(locator, this, "upperBoundaryValue", buffer, theUpperBoundaryValue, (this.upperBoundaryValue!= null));
        }
        return buffer;
    }

}
