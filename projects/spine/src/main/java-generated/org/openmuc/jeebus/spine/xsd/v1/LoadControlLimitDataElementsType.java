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
 * <p>Java class for LoadControlLimitDataElementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoadControlLimitDataElementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="limitId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="isLimitChangeable" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="isLimitActive" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="timePeriod" type="{http://docs.eebus.org/spine/xsd/v1}TimePeriodElementsType" minOccurs="0"/&gt;
 *         &lt;element name="value" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberElementsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoadControlLimitDataElementsType", propOrder = {
    "limitId",
    "isLimitChangeable",
    "isLimitActive",
    "timePeriod",
    "value"
})
public class LoadControlLimitDataElementsType implements Cloneable, CopyTo, ToString
{

    protected ElementTagType limitId;
    protected ElementTagType isLimitChangeable;
    protected ElementTagType isLimitActive;
    protected TimePeriodElementsType timePeriod;
    protected ScaledNumberElementsType value;

    /**
     * Default no-arg constructor
     * 
     */
    public LoadControlLimitDataElementsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public LoadControlLimitDataElementsType(final ElementTagType limitId, final ElementTagType isLimitChangeable, final ElementTagType isLimitActive, final TimePeriodElementsType timePeriod, final ScaledNumberElementsType value) {
        this.limitId = limitId;
        this.isLimitChangeable = isLimitChangeable;
        this.isLimitActive = isLimitActive;
        this.timePeriod = timePeriod;
        this.value = value;
    }

    /**
     * Gets the value of the limitId property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getLimitId() {
        return limitId;
    }

    /**
     * Sets the value of the limitId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setLimitId(ElementTagType value) {
        this.limitId = value;
    }

    /**
     * Gets the value of the isLimitChangeable property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getIsLimitChangeable() {
        return isLimitChangeable;
    }

    /**
     * Sets the value of the isLimitChangeable property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setIsLimitChangeable(ElementTagType value) {
        this.isLimitChangeable = value;
    }

    /**
     * Gets the value of the isLimitActive property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getIsLimitActive() {
        return isLimitActive;
    }

    /**
     * Sets the value of the isLimitActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setIsLimitActive(ElementTagType value) {
        this.isLimitActive = value;
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
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link ScaledNumberElementsType }
     *     
     */
    public ScaledNumberElementsType getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberElementsType }
     *     
     */
    public void setValue(ScaledNumberElementsType value) {
        this.value = value;
    }

    /**
     * Sets the value of the limitId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public LoadControlLimitDataElementsType withLimitId(ElementTagType value) {
        setLimitId(value);
        return this;
    }

    /**
     * Sets the value of the isLimitChangeable property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public LoadControlLimitDataElementsType withIsLimitChangeable(ElementTagType value) {
        setIsLimitChangeable(value);
        return this;
    }

    /**
     * Sets the value of the isLimitActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public LoadControlLimitDataElementsType withIsLimitActive(ElementTagType value) {
        setIsLimitActive(value);
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
    public LoadControlLimitDataElementsType withTimePeriod(TimePeriodElementsType value) {
        setTimePeriod(value);
        return this;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberElementsType }
     * @return
     *     The class instance
     */
    public LoadControlLimitDataElementsType withValue(ScaledNumberElementsType value) {
        setValue(value);
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
        if (draftCopy instanceof LoadControlLimitDataElementsType) {
            final LoadControlLimitDataElementsType copy = ((LoadControlLimitDataElementsType) draftCopy);
            {
                Boolean limitIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.limitId!= null));
                if (limitIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceLimitId;
                    sourceLimitId = this.getLimitId();
                    ElementTagType copyLimitId = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "limitId", sourceLimitId), sourceLimitId, (this.limitId!= null)));
                    copy.setLimitId(copyLimitId);
                } else {
                    if (limitIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.limitId = null;
                    }
                }
            }
            {
                Boolean isLimitChangeableShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.isLimitChangeable!= null));
                if (isLimitChangeableShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceIsLimitChangeable;
                    sourceIsLimitChangeable = this.getIsLimitChangeable();
                    ElementTagType copyIsLimitChangeable = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "isLimitChangeable", sourceIsLimitChangeable), sourceIsLimitChangeable, (this.isLimitChangeable!= null)));
                    copy.setIsLimitChangeable(copyIsLimitChangeable);
                } else {
                    if (isLimitChangeableShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.isLimitChangeable = null;
                    }
                }
            }
            {
                Boolean isLimitActiveShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.isLimitActive!= null));
                if (isLimitActiveShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceIsLimitActive;
                    sourceIsLimitActive = this.getIsLimitActive();
                    ElementTagType copyIsLimitActive = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "isLimitActive", sourceIsLimitActive), sourceIsLimitActive, (this.isLimitActive!= null)));
                    copy.setIsLimitActive(copyIsLimitActive);
                } else {
                    if (isLimitActiveShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.isLimitActive = null;
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
                Boolean valueShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.value!= null));
                if (valueShouldBeCopiedAndSet == Boolean.TRUE) {
                    ScaledNumberElementsType sourceValue;
                    sourceValue = this.getValue();
                    ScaledNumberElementsType copyValue = ((ScaledNumberElementsType) strategy.copy(LocatorUtils.property(locator, "value", sourceValue), sourceValue, (this.value!= null)));
                    copy.setValue(copyValue);
                } else {
                    if (valueShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.value = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new LoadControlLimitDataElementsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final LoadControlLimitDataElementsType that = ((LoadControlLimitDataElementsType) object);
        {
            ElementTagType leftLimitId;
            leftLimitId = this.getLimitId();
            ElementTagType rightLimitId;
            rightLimitId = that.getLimitId();
            if (this.limitId!= null) {
                if (that.limitId!= null) {
                    if (!leftLimitId.equals(rightLimitId)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.limitId!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftIsLimitChangeable;
            leftIsLimitChangeable = this.getIsLimitChangeable();
            ElementTagType rightIsLimitChangeable;
            rightIsLimitChangeable = that.getIsLimitChangeable();
            if (this.isLimitChangeable!= null) {
                if (that.isLimitChangeable!= null) {
                    if (!leftIsLimitChangeable.equals(rightIsLimitChangeable)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.isLimitChangeable!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftIsLimitActive;
            leftIsLimitActive = this.getIsLimitActive();
            ElementTagType rightIsLimitActive;
            rightIsLimitActive = that.getIsLimitActive();
            if (this.isLimitActive!= null) {
                if (that.isLimitActive!= null) {
                    if (!leftIsLimitActive.equals(rightIsLimitActive)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.isLimitActive!= null) {
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
            ScaledNumberElementsType leftValue;
            leftValue = this.getValue();
            ScaledNumberElementsType rightValue;
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
        return true;
    }

    @Override
    public int hashCode() {
        int currentHashCode = 1;
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theLimitId;
            theLimitId = this.getLimitId();
            if (this.limitId!= null) {
                currentHashCode += theLimitId.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theIsLimitChangeable;
            theIsLimitChangeable = this.getIsLimitChangeable();
            if (this.isLimitChangeable!= null) {
                currentHashCode += theIsLimitChangeable.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theIsLimitActive;
            theIsLimitActive = this.getIsLimitActive();
            if (this.isLimitActive!= null) {
                currentHashCode += theIsLimitActive.hashCode();
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
            ScaledNumberElementsType theValue;
            theValue = this.getValue();
            if (this.value!= null) {
                currentHashCode += theValue.hashCode();
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
            ElementTagType theLimitId;
            theLimitId = this.getLimitId();
            strategy.appendField(locator, this, "limitId", buffer, theLimitId, (this.limitId!= null));
        }
        {
            ElementTagType theIsLimitChangeable;
            theIsLimitChangeable = this.getIsLimitChangeable();
            strategy.appendField(locator, this, "isLimitChangeable", buffer, theIsLimitChangeable, (this.isLimitChangeable!= null));
        }
        {
            ElementTagType theIsLimitActive;
            theIsLimitActive = this.getIsLimitActive();
            strategy.appendField(locator, this, "isLimitActive", buffer, theIsLimitActive, (this.isLimitActive!= null));
        }
        {
            TimePeriodElementsType theTimePeriod;
            theTimePeriod = this.getTimePeriod();
            strategy.appendField(locator, this, "timePeriod", buffer, theTimePeriod, (this.timePeriod!= null));
        }
        {
            ScaledNumberElementsType theValue;
            theValue = this.getValue();
            strategy.appendField(locator, this, "value", buffer, theValue, (this.value!= null));
        }
        return buffer;
    }

}
