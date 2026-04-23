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
 * <p>Java class for LoadControlLimitConstraintsDataElementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoadControlLimitConstraintsDataElementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="limitId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="valueRangeMin" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberElementsType" minOccurs="0"/&gt;
 *         &lt;element name="valueRangeMax" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberElementsType" minOccurs="0"/&gt;
 *         &lt;element name="valueStepSize" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberElementsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoadControlLimitConstraintsDataElementsType", propOrder = {
    "limitId",
    "valueRangeMin",
    "valueRangeMax",
    "valueStepSize"
})
public class LoadControlLimitConstraintsDataElementsType implements Cloneable, CopyTo, ToString
{

    protected ElementTagType limitId;
    protected ScaledNumberElementsType valueRangeMin;
    protected ScaledNumberElementsType valueRangeMax;
    protected ScaledNumberElementsType valueStepSize;

    /**
     * Default no-arg constructor
     * 
     */
    public LoadControlLimitConstraintsDataElementsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public LoadControlLimitConstraintsDataElementsType(final ElementTagType limitId, final ScaledNumberElementsType valueRangeMin, final ScaledNumberElementsType valueRangeMax, final ScaledNumberElementsType valueStepSize) {
        this.limitId = limitId;
        this.valueRangeMin = valueRangeMin;
        this.valueRangeMax = valueRangeMax;
        this.valueStepSize = valueStepSize;
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
     * Gets the value of the valueRangeMin property.
     * 
     * @return
     *     possible object is
     *     {@link ScaledNumberElementsType }
     *     
     */
    public ScaledNumberElementsType getValueRangeMin() {
        return valueRangeMin;
    }

    /**
     * Sets the value of the valueRangeMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberElementsType }
     *     
     */
    public void setValueRangeMin(ScaledNumberElementsType value) {
        this.valueRangeMin = value;
    }

    /**
     * Gets the value of the valueRangeMax property.
     * 
     * @return
     *     possible object is
     *     {@link ScaledNumberElementsType }
     *     
     */
    public ScaledNumberElementsType getValueRangeMax() {
        return valueRangeMax;
    }

    /**
     * Sets the value of the valueRangeMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberElementsType }
     *     
     */
    public void setValueRangeMax(ScaledNumberElementsType value) {
        this.valueRangeMax = value;
    }

    /**
     * Gets the value of the valueStepSize property.
     * 
     * @return
     *     possible object is
     *     {@link ScaledNumberElementsType }
     *     
     */
    public ScaledNumberElementsType getValueStepSize() {
        return valueStepSize;
    }

    /**
     * Sets the value of the valueStepSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberElementsType }
     *     
     */
    public void setValueStepSize(ScaledNumberElementsType value) {
        this.valueStepSize = value;
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
    public LoadControlLimitConstraintsDataElementsType withLimitId(ElementTagType value) {
        setLimitId(value);
        return this;
    }

    /**
     * Sets the value of the valueRangeMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberElementsType }
     * @return
     *     The class instance
     */
    public LoadControlLimitConstraintsDataElementsType withValueRangeMin(ScaledNumberElementsType value) {
        setValueRangeMin(value);
        return this;
    }

    /**
     * Sets the value of the valueRangeMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberElementsType }
     * @return
     *     The class instance
     */
    public LoadControlLimitConstraintsDataElementsType withValueRangeMax(ScaledNumberElementsType value) {
        setValueRangeMax(value);
        return this;
    }

    /**
     * Sets the value of the valueStepSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberElementsType }
     * @return
     *     The class instance
     */
    public LoadControlLimitConstraintsDataElementsType withValueStepSize(ScaledNumberElementsType value) {
        setValueStepSize(value);
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
        if (draftCopy instanceof LoadControlLimitConstraintsDataElementsType) {
            final LoadControlLimitConstraintsDataElementsType copy = ((LoadControlLimitConstraintsDataElementsType) draftCopy);
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
                Boolean valueRangeMinShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.valueRangeMin!= null));
                if (valueRangeMinShouldBeCopiedAndSet == Boolean.TRUE) {
                    ScaledNumberElementsType sourceValueRangeMin;
                    sourceValueRangeMin = this.getValueRangeMin();
                    ScaledNumberElementsType copyValueRangeMin = ((ScaledNumberElementsType) strategy.copy(LocatorUtils.property(locator, "valueRangeMin", sourceValueRangeMin), sourceValueRangeMin, (this.valueRangeMin!= null)));
                    copy.setValueRangeMin(copyValueRangeMin);
                } else {
                    if (valueRangeMinShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.valueRangeMin = null;
                    }
                }
            }
            {
                Boolean valueRangeMaxShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.valueRangeMax!= null));
                if (valueRangeMaxShouldBeCopiedAndSet == Boolean.TRUE) {
                    ScaledNumberElementsType sourceValueRangeMax;
                    sourceValueRangeMax = this.getValueRangeMax();
                    ScaledNumberElementsType copyValueRangeMax = ((ScaledNumberElementsType) strategy.copy(LocatorUtils.property(locator, "valueRangeMax", sourceValueRangeMax), sourceValueRangeMax, (this.valueRangeMax!= null)));
                    copy.setValueRangeMax(copyValueRangeMax);
                } else {
                    if (valueRangeMaxShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.valueRangeMax = null;
                    }
                }
            }
            {
                Boolean valueStepSizeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.valueStepSize!= null));
                if (valueStepSizeShouldBeCopiedAndSet == Boolean.TRUE) {
                    ScaledNumberElementsType sourceValueStepSize;
                    sourceValueStepSize = this.getValueStepSize();
                    ScaledNumberElementsType copyValueStepSize = ((ScaledNumberElementsType) strategy.copy(LocatorUtils.property(locator, "valueStepSize", sourceValueStepSize), sourceValueStepSize, (this.valueStepSize!= null)));
                    copy.setValueStepSize(copyValueStepSize);
                } else {
                    if (valueStepSizeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.valueStepSize = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new LoadControlLimitConstraintsDataElementsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final LoadControlLimitConstraintsDataElementsType that = ((LoadControlLimitConstraintsDataElementsType) object);
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
            ScaledNumberElementsType leftValueRangeMin;
            leftValueRangeMin = this.getValueRangeMin();
            ScaledNumberElementsType rightValueRangeMin;
            rightValueRangeMin = that.getValueRangeMin();
            if (this.valueRangeMin!= null) {
                if (that.valueRangeMin!= null) {
                    if (!leftValueRangeMin.equals(rightValueRangeMin)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.valueRangeMin!= null) {
                    return false;
                }
            }
        }
        {
            ScaledNumberElementsType leftValueRangeMax;
            leftValueRangeMax = this.getValueRangeMax();
            ScaledNumberElementsType rightValueRangeMax;
            rightValueRangeMax = that.getValueRangeMax();
            if (this.valueRangeMax!= null) {
                if (that.valueRangeMax!= null) {
                    if (!leftValueRangeMax.equals(rightValueRangeMax)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.valueRangeMax!= null) {
                    return false;
                }
            }
        }
        {
            ScaledNumberElementsType leftValueStepSize;
            leftValueStepSize = this.getValueStepSize();
            ScaledNumberElementsType rightValueStepSize;
            rightValueStepSize = that.getValueStepSize();
            if (this.valueStepSize!= null) {
                if (that.valueStepSize!= null) {
                    if (!leftValueStepSize.equals(rightValueStepSize)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.valueStepSize!= null) {
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
            ScaledNumberElementsType theValueRangeMin;
            theValueRangeMin = this.getValueRangeMin();
            if (this.valueRangeMin!= null) {
                currentHashCode += theValueRangeMin.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ScaledNumberElementsType theValueRangeMax;
            theValueRangeMax = this.getValueRangeMax();
            if (this.valueRangeMax!= null) {
                currentHashCode += theValueRangeMax.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ScaledNumberElementsType theValueStepSize;
            theValueStepSize = this.getValueStepSize();
            if (this.valueStepSize!= null) {
                currentHashCode += theValueStepSize.hashCode();
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
            ScaledNumberElementsType theValueRangeMin;
            theValueRangeMin = this.getValueRangeMin();
            strategy.appendField(locator, this, "valueRangeMin", buffer, theValueRangeMin, (this.valueRangeMin!= null));
        }
        {
            ScaledNumberElementsType theValueRangeMax;
            theValueRangeMax = this.getValueRangeMax();
            strategy.appendField(locator, this, "valueRangeMax", buffer, theValueRangeMax, (this.valueRangeMax!= null));
        }
        {
            ScaledNumberElementsType theValueStepSize;
            theValueStepSize = this.getValueStepSize();
            strategy.appendField(locator, this, "valueStepSize", buffer, theValueStepSize, (this.valueStepSize!= null));
        }
        return buffer;
    }

}
