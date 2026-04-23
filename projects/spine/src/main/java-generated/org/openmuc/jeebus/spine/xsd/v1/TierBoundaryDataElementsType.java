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
 * <p>Java class for TierBoundaryDataElementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TierBoundaryDataElementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="boundaryId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="timePeriod" type="{http://docs.eebus.org/spine/xsd/v1}TimePeriodElementsType" minOccurs="0"/&gt;
 *         &lt;element name="timeTableId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="lowerBoundaryValue" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberElementsType" minOccurs="0"/&gt;
 *         &lt;element name="upperBoundaryValue" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberElementsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TierBoundaryDataElementsType", propOrder = {
    "boundaryId",
    "timePeriod",
    "timeTableId",
    "lowerBoundaryValue",
    "upperBoundaryValue"
})
@XmlSeeAlso({
    org.openmuc.jeebus.spine.xsd.v1.IncentiveTableTierElementsType.Boundary.class
})
public class TierBoundaryDataElementsType implements Cloneable, CopyTo, ToString
{

    protected ElementTagType boundaryId;
    protected TimePeriodElementsType timePeriod;
    protected ElementTagType timeTableId;
    protected ScaledNumberElementsType lowerBoundaryValue;
    protected ScaledNumberElementsType upperBoundaryValue;

    /**
     * Default no-arg constructor
     * 
     */
    public TierBoundaryDataElementsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public TierBoundaryDataElementsType(final ElementTagType boundaryId, final TimePeriodElementsType timePeriod, final ElementTagType timeTableId, final ScaledNumberElementsType lowerBoundaryValue, final ScaledNumberElementsType upperBoundaryValue) {
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
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getBoundaryId() {
        return boundaryId;
    }

    /**
     * Sets the value of the boundaryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setBoundaryId(ElementTagType value) {
        this.boundaryId = value;
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
     * Gets the value of the lowerBoundaryValue property.
     * 
     * @return
     *     possible object is
     *     {@link ScaledNumberElementsType }
     *     
     */
    public ScaledNumberElementsType getLowerBoundaryValue() {
        return lowerBoundaryValue;
    }

    /**
     * Sets the value of the lowerBoundaryValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberElementsType }
     *     
     */
    public void setLowerBoundaryValue(ScaledNumberElementsType value) {
        this.lowerBoundaryValue = value;
    }

    /**
     * Gets the value of the upperBoundaryValue property.
     * 
     * @return
     *     possible object is
     *     {@link ScaledNumberElementsType }
     *     
     */
    public ScaledNumberElementsType getUpperBoundaryValue() {
        return upperBoundaryValue;
    }

    /**
     * Sets the value of the upperBoundaryValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberElementsType }
     *     
     */
    public void setUpperBoundaryValue(ScaledNumberElementsType value) {
        this.upperBoundaryValue = value;
    }

    /**
     * Sets the value of the boundaryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public TierBoundaryDataElementsType withBoundaryId(ElementTagType value) {
        setBoundaryId(value);
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
    public TierBoundaryDataElementsType withTimePeriod(TimePeriodElementsType value) {
        setTimePeriod(value);
        return this;
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
    public TierBoundaryDataElementsType withTimeTableId(ElementTagType value) {
        setTimeTableId(value);
        return this;
    }

    /**
     * Sets the value of the lowerBoundaryValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberElementsType }
     * @return
     *     The class instance
     */
    public TierBoundaryDataElementsType withLowerBoundaryValue(ScaledNumberElementsType value) {
        setLowerBoundaryValue(value);
        return this;
    }

    /**
     * Sets the value of the upperBoundaryValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberElementsType }
     * @return
     *     The class instance
     */
    public TierBoundaryDataElementsType withUpperBoundaryValue(ScaledNumberElementsType value) {
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
        if (draftCopy instanceof TierBoundaryDataElementsType) {
            final TierBoundaryDataElementsType copy = ((TierBoundaryDataElementsType) draftCopy);
            {
                Boolean boundaryIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.boundaryId!= null));
                if (boundaryIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceBoundaryId;
                    sourceBoundaryId = this.getBoundaryId();
                    ElementTagType copyBoundaryId = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "boundaryId", sourceBoundaryId), sourceBoundaryId, (this.boundaryId!= null)));
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
                Boolean lowerBoundaryValueShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.lowerBoundaryValue!= null));
                if (lowerBoundaryValueShouldBeCopiedAndSet == Boolean.TRUE) {
                    ScaledNumberElementsType sourceLowerBoundaryValue;
                    sourceLowerBoundaryValue = this.getLowerBoundaryValue();
                    ScaledNumberElementsType copyLowerBoundaryValue = ((ScaledNumberElementsType) strategy.copy(LocatorUtils.property(locator, "lowerBoundaryValue", sourceLowerBoundaryValue), sourceLowerBoundaryValue, (this.lowerBoundaryValue!= null)));
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
                    ScaledNumberElementsType sourceUpperBoundaryValue;
                    sourceUpperBoundaryValue = this.getUpperBoundaryValue();
                    ScaledNumberElementsType copyUpperBoundaryValue = ((ScaledNumberElementsType) strategy.copy(LocatorUtils.property(locator, "upperBoundaryValue", sourceUpperBoundaryValue), sourceUpperBoundaryValue, (this.upperBoundaryValue!= null)));
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
        return new TierBoundaryDataElementsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TierBoundaryDataElementsType that = ((TierBoundaryDataElementsType) object);
        {
            ElementTagType leftBoundaryId;
            leftBoundaryId = this.getBoundaryId();
            ElementTagType rightBoundaryId;
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
            ScaledNumberElementsType leftLowerBoundaryValue;
            leftLowerBoundaryValue = this.getLowerBoundaryValue();
            ScaledNumberElementsType rightLowerBoundaryValue;
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
            ScaledNumberElementsType leftUpperBoundaryValue;
            leftUpperBoundaryValue = this.getUpperBoundaryValue();
            ScaledNumberElementsType rightUpperBoundaryValue;
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
            ElementTagType theBoundaryId;
            theBoundaryId = this.getBoundaryId();
            if (this.boundaryId!= null) {
                currentHashCode += theBoundaryId.hashCode();
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
            ElementTagType theTimeTableId;
            theTimeTableId = this.getTimeTableId();
            if (this.timeTableId!= null) {
                currentHashCode += theTimeTableId.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ScaledNumberElementsType theLowerBoundaryValue;
            theLowerBoundaryValue = this.getLowerBoundaryValue();
            if (this.lowerBoundaryValue!= null) {
                currentHashCode += theLowerBoundaryValue.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ScaledNumberElementsType theUpperBoundaryValue;
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
            ElementTagType theBoundaryId;
            theBoundaryId = this.getBoundaryId();
            strategy.appendField(locator, this, "boundaryId", buffer, theBoundaryId, (this.boundaryId!= null));
        }
        {
            TimePeriodElementsType theTimePeriod;
            theTimePeriod = this.getTimePeriod();
            strategy.appendField(locator, this, "timePeriod", buffer, theTimePeriod, (this.timePeriod!= null));
        }
        {
            ElementTagType theTimeTableId;
            theTimeTableId = this.getTimeTableId();
            strategy.appendField(locator, this, "timeTableId", buffer, theTimeTableId, (this.timeTableId!= null));
        }
        {
            ScaledNumberElementsType theLowerBoundaryValue;
            theLowerBoundaryValue = this.getLowerBoundaryValue();
            strategy.appendField(locator, this, "lowerBoundaryValue", buffer, theLowerBoundaryValue, (this.lowerBoundaryValue!= null));
        }
        {
            ScaledNumberElementsType theUpperBoundaryValue;
            theUpperBoundaryValue = this.getUpperBoundaryValue();
            strategy.appendField(locator, this, "upperBoundaryValue", buffer, theUpperBoundaryValue, (this.upperBoundaryValue!= null));
        }
        return buffer;
    }

}
