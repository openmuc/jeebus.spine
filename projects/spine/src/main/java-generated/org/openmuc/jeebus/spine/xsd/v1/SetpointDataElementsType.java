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
 * <p>Java class for SetpointDataElementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SetpointDataElementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="setpointId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="value" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberElementsType" minOccurs="0"/&gt;
 *         &lt;element name="valueMin" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberElementsType" minOccurs="0"/&gt;
 *         &lt;element name="valueMax" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberElementsType" minOccurs="0"/&gt;
 *         &lt;element name="valueToleranceAbsolute" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberElementsType" minOccurs="0"/&gt;
 *         &lt;element name="valueTolerancePercentage" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberElementsType" minOccurs="0"/&gt;
 *         &lt;element name="isSetpointChangeable" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="isSetpointActive" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="timePeriod" type="{http://docs.eebus.org/spine/xsd/v1}TimePeriodElementsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetpointDataElementsType", propOrder = {
    "setpointId",
    "value",
    "valueMin",
    "valueMax",
    "valueToleranceAbsolute",
    "valueTolerancePercentage",
    "isSetpointChangeable",
    "isSetpointActive",
    "timePeriod"
})
public class SetpointDataElementsType implements Cloneable, CopyTo, ToString
{

    protected ElementTagType setpointId;
    protected ScaledNumberElementsType value;
    protected ScaledNumberElementsType valueMin;
    protected ScaledNumberElementsType valueMax;
    protected ScaledNumberElementsType valueToleranceAbsolute;
    protected ScaledNumberElementsType valueTolerancePercentage;
    protected ElementTagType isSetpointChangeable;
    protected ElementTagType isSetpointActive;
    protected TimePeriodElementsType timePeriod;

    /**
     * Default no-arg constructor
     * 
     */
    public SetpointDataElementsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public SetpointDataElementsType(final ElementTagType setpointId, final ScaledNumberElementsType value, final ScaledNumberElementsType valueMin, final ScaledNumberElementsType valueMax, final ScaledNumberElementsType valueToleranceAbsolute, final ScaledNumberElementsType valueTolerancePercentage, final ElementTagType isSetpointChangeable, final ElementTagType isSetpointActive, final TimePeriodElementsType timePeriod) {
        this.setpointId = setpointId;
        this.value = value;
        this.valueMin = valueMin;
        this.valueMax = valueMax;
        this.valueToleranceAbsolute = valueToleranceAbsolute;
        this.valueTolerancePercentage = valueTolerancePercentage;
        this.isSetpointChangeable = isSetpointChangeable;
        this.isSetpointActive = isSetpointActive;
        this.timePeriod = timePeriod;
    }

    /**
     * Gets the value of the setpointId property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getSetpointId() {
        return setpointId;
    }

    /**
     * Sets the value of the setpointId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setSetpointId(ElementTagType value) {
        this.setpointId = value;
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
     * Gets the value of the valueMin property.
     * 
     * @return
     *     possible object is
     *     {@link ScaledNumberElementsType }
     *     
     */
    public ScaledNumberElementsType getValueMin() {
        return valueMin;
    }

    /**
     * Sets the value of the valueMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberElementsType }
     *     
     */
    public void setValueMin(ScaledNumberElementsType value) {
        this.valueMin = value;
    }

    /**
     * Gets the value of the valueMax property.
     * 
     * @return
     *     possible object is
     *     {@link ScaledNumberElementsType }
     *     
     */
    public ScaledNumberElementsType getValueMax() {
        return valueMax;
    }

    /**
     * Sets the value of the valueMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberElementsType }
     *     
     */
    public void setValueMax(ScaledNumberElementsType value) {
        this.valueMax = value;
    }

    /**
     * Gets the value of the valueToleranceAbsolute property.
     * 
     * @return
     *     possible object is
     *     {@link ScaledNumberElementsType }
     *     
     */
    public ScaledNumberElementsType getValueToleranceAbsolute() {
        return valueToleranceAbsolute;
    }

    /**
     * Sets the value of the valueToleranceAbsolute property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberElementsType }
     *     
     */
    public void setValueToleranceAbsolute(ScaledNumberElementsType value) {
        this.valueToleranceAbsolute = value;
    }

    /**
     * Gets the value of the valueTolerancePercentage property.
     * 
     * @return
     *     possible object is
     *     {@link ScaledNumberElementsType }
     *     
     */
    public ScaledNumberElementsType getValueTolerancePercentage() {
        return valueTolerancePercentage;
    }

    /**
     * Sets the value of the valueTolerancePercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberElementsType }
     *     
     */
    public void setValueTolerancePercentage(ScaledNumberElementsType value) {
        this.valueTolerancePercentage = value;
    }

    /**
     * Gets the value of the isSetpointChangeable property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getIsSetpointChangeable() {
        return isSetpointChangeable;
    }

    /**
     * Sets the value of the isSetpointChangeable property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setIsSetpointChangeable(ElementTagType value) {
        this.isSetpointChangeable = value;
    }

    /**
     * Gets the value of the isSetpointActive property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getIsSetpointActive() {
        return isSetpointActive;
    }

    /**
     * Sets the value of the isSetpointActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setIsSetpointActive(ElementTagType value) {
        this.isSetpointActive = value;
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
     * Sets the value of the setpointId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public SetpointDataElementsType withSetpointId(ElementTagType value) {
        setSetpointId(value);
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
    public SetpointDataElementsType withValue(ScaledNumberElementsType value) {
        setValue(value);
        return this;
    }

    /**
     * Sets the value of the valueMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberElementsType }
     * @return
     *     The class instance
     */
    public SetpointDataElementsType withValueMin(ScaledNumberElementsType value) {
        setValueMin(value);
        return this;
    }

    /**
     * Sets the value of the valueMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberElementsType }
     * @return
     *     The class instance
     */
    public SetpointDataElementsType withValueMax(ScaledNumberElementsType value) {
        setValueMax(value);
        return this;
    }

    /**
     * Sets the value of the valueToleranceAbsolute property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberElementsType }
     * @return
     *     The class instance
     */
    public SetpointDataElementsType withValueToleranceAbsolute(ScaledNumberElementsType value) {
        setValueToleranceAbsolute(value);
        return this;
    }

    /**
     * Sets the value of the valueTolerancePercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberElementsType }
     * @return
     *     The class instance
     */
    public SetpointDataElementsType withValueTolerancePercentage(ScaledNumberElementsType value) {
        setValueTolerancePercentage(value);
        return this;
    }

    /**
     * Sets the value of the isSetpointChangeable property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public SetpointDataElementsType withIsSetpointChangeable(ElementTagType value) {
        setIsSetpointChangeable(value);
        return this;
    }

    /**
     * Sets the value of the isSetpointActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public SetpointDataElementsType withIsSetpointActive(ElementTagType value) {
        setIsSetpointActive(value);
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
    public SetpointDataElementsType withTimePeriod(TimePeriodElementsType value) {
        setTimePeriod(value);
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
        if (draftCopy instanceof SetpointDataElementsType) {
            final SetpointDataElementsType copy = ((SetpointDataElementsType) draftCopy);
            {
                Boolean setpointIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.setpointId!= null));
                if (setpointIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceSetpointId;
                    sourceSetpointId = this.getSetpointId();
                    ElementTagType copySetpointId = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "setpointId", sourceSetpointId), sourceSetpointId, (this.setpointId!= null)));
                    copy.setSetpointId(copySetpointId);
                } else {
                    if (setpointIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.setpointId = null;
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
            {
                Boolean valueMinShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.valueMin!= null));
                if (valueMinShouldBeCopiedAndSet == Boolean.TRUE) {
                    ScaledNumberElementsType sourceValueMin;
                    sourceValueMin = this.getValueMin();
                    ScaledNumberElementsType copyValueMin = ((ScaledNumberElementsType) strategy.copy(LocatorUtils.property(locator, "valueMin", sourceValueMin), sourceValueMin, (this.valueMin!= null)));
                    copy.setValueMin(copyValueMin);
                } else {
                    if (valueMinShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.valueMin = null;
                    }
                }
            }
            {
                Boolean valueMaxShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.valueMax!= null));
                if (valueMaxShouldBeCopiedAndSet == Boolean.TRUE) {
                    ScaledNumberElementsType sourceValueMax;
                    sourceValueMax = this.getValueMax();
                    ScaledNumberElementsType copyValueMax = ((ScaledNumberElementsType) strategy.copy(LocatorUtils.property(locator, "valueMax", sourceValueMax), sourceValueMax, (this.valueMax!= null)));
                    copy.setValueMax(copyValueMax);
                } else {
                    if (valueMaxShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.valueMax = null;
                    }
                }
            }
            {
                Boolean valueToleranceAbsoluteShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.valueToleranceAbsolute!= null));
                if (valueToleranceAbsoluteShouldBeCopiedAndSet == Boolean.TRUE) {
                    ScaledNumberElementsType sourceValueToleranceAbsolute;
                    sourceValueToleranceAbsolute = this.getValueToleranceAbsolute();
                    ScaledNumberElementsType copyValueToleranceAbsolute = ((ScaledNumberElementsType) strategy.copy(LocatorUtils.property(locator, "valueToleranceAbsolute", sourceValueToleranceAbsolute), sourceValueToleranceAbsolute, (this.valueToleranceAbsolute!= null)));
                    copy.setValueToleranceAbsolute(copyValueToleranceAbsolute);
                } else {
                    if (valueToleranceAbsoluteShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.valueToleranceAbsolute = null;
                    }
                }
            }
            {
                Boolean valueTolerancePercentageShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.valueTolerancePercentage!= null));
                if (valueTolerancePercentageShouldBeCopiedAndSet == Boolean.TRUE) {
                    ScaledNumberElementsType sourceValueTolerancePercentage;
                    sourceValueTolerancePercentage = this.getValueTolerancePercentage();
                    ScaledNumberElementsType copyValueTolerancePercentage = ((ScaledNumberElementsType) strategy.copy(LocatorUtils.property(locator, "valueTolerancePercentage", sourceValueTolerancePercentage), sourceValueTolerancePercentage, (this.valueTolerancePercentage!= null)));
                    copy.setValueTolerancePercentage(copyValueTolerancePercentage);
                } else {
                    if (valueTolerancePercentageShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.valueTolerancePercentage = null;
                    }
                }
            }
            {
                Boolean isSetpointChangeableShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.isSetpointChangeable!= null));
                if (isSetpointChangeableShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceIsSetpointChangeable;
                    sourceIsSetpointChangeable = this.getIsSetpointChangeable();
                    ElementTagType copyIsSetpointChangeable = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "isSetpointChangeable", sourceIsSetpointChangeable), sourceIsSetpointChangeable, (this.isSetpointChangeable!= null)));
                    copy.setIsSetpointChangeable(copyIsSetpointChangeable);
                } else {
                    if (isSetpointChangeableShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.isSetpointChangeable = null;
                    }
                }
            }
            {
                Boolean isSetpointActiveShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.isSetpointActive!= null));
                if (isSetpointActiveShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceIsSetpointActive;
                    sourceIsSetpointActive = this.getIsSetpointActive();
                    ElementTagType copyIsSetpointActive = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "isSetpointActive", sourceIsSetpointActive), sourceIsSetpointActive, (this.isSetpointActive!= null)));
                    copy.setIsSetpointActive(copyIsSetpointActive);
                } else {
                    if (isSetpointActiveShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.isSetpointActive = null;
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
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new SetpointDataElementsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final SetpointDataElementsType that = ((SetpointDataElementsType) object);
        {
            ElementTagType leftSetpointId;
            leftSetpointId = this.getSetpointId();
            ElementTagType rightSetpointId;
            rightSetpointId = that.getSetpointId();
            if (this.setpointId!= null) {
                if (that.setpointId!= null) {
                    if (!leftSetpointId.equals(rightSetpointId)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.setpointId!= null) {
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
        {
            ScaledNumberElementsType leftValueMin;
            leftValueMin = this.getValueMin();
            ScaledNumberElementsType rightValueMin;
            rightValueMin = that.getValueMin();
            if (this.valueMin!= null) {
                if (that.valueMin!= null) {
                    if (!leftValueMin.equals(rightValueMin)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.valueMin!= null) {
                    return false;
                }
            }
        }
        {
            ScaledNumberElementsType leftValueMax;
            leftValueMax = this.getValueMax();
            ScaledNumberElementsType rightValueMax;
            rightValueMax = that.getValueMax();
            if (this.valueMax!= null) {
                if (that.valueMax!= null) {
                    if (!leftValueMax.equals(rightValueMax)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.valueMax!= null) {
                    return false;
                }
            }
        }
        {
            ScaledNumberElementsType leftValueToleranceAbsolute;
            leftValueToleranceAbsolute = this.getValueToleranceAbsolute();
            ScaledNumberElementsType rightValueToleranceAbsolute;
            rightValueToleranceAbsolute = that.getValueToleranceAbsolute();
            if (this.valueToleranceAbsolute!= null) {
                if (that.valueToleranceAbsolute!= null) {
                    if (!leftValueToleranceAbsolute.equals(rightValueToleranceAbsolute)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.valueToleranceAbsolute!= null) {
                    return false;
                }
            }
        }
        {
            ScaledNumberElementsType leftValueTolerancePercentage;
            leftValueTolerancePercentage = this.getValueTolerancePercentage();
            ScaledNumberElementsType rightValueTolerancePercentage;
            rightValueTolerancePercentage = that.getValueTolerancePercentage();
            if (this.valueTolerancePercentage!= null) {
                if (that.valueTolerancePercentage!= null) {
                    if (!leftValueTolerancePercentage.equals(rightValueTolerancePercentage)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.valueTolerancePercentage!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftIsSetpointChangeable;
            leftIsSetpointChangeable = this.getIsSetpointChangeable();
            ElementTagType rightIsSetpointChangeable;
            rightIsSetpointChangeable = that.getIsSetpointChangeable();
            if (this.isSetpointChangeable!= null) {
                if (that.isSetpointChangeable!= null) {
                    if (!leftIsSetpointChangeable.equals(rightIsSetpointChangeable)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.isSetpointChangeable!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftIsSetpointActive;
            leftIsSetpointActive = this.getIsSetpointActive();
            ElementTagType rightIsSetpointActive;
            rightIsSetpointActive = that.getIsSetpointActive();
            if (this.isSetpointActive!= null) {
                if (that.isSetpointActive!= null) {
                    if (!leftIsSetpointActive.equals(rightIsSetpointActive)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.isSetpointActive!= null) {
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
        return true;
    }

    @Override
    public int hashCode() {
        int currentHashCode = 1;
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theSetpointId;
            theSetpointId = this.getSetpointId();
            if (this.setpointId!= null) {
                currentHashCode += theSetpointId.hashCode();
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
        {
            currentHashCode = (currentHashCode* 31);
            ScaledNumberElementsType theValueMin;
            theValueMin = this.getValueMin();
            if (this.valueMin!= null) {
                currentHashCode += theValueMin.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ScaledNumberElementsType theValueMax;
            theValueMax = this.getValueMax();
            if (this.valueMax!= null) {
                currentHashCode += theValueMax.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ScaledNumberElementsType theValueToleranceAbsolute;
            theValueToleranceAbsolute = this.getValueToleranceAbsolute();
            if (this.valueToleranceAbsolute!= null) {
                currentHashCode += theValueToleranceAbsolute.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ScaledNumberElementsType theValueTolerancePercentage;
            theValueTolerancePercentage = this.getValueTolerancePercentage();
            if (this.valueTolerancePercentage!= null) {
                currentHashCode += theValueTolerancePercentage.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theIsSetpointChangeable;
            theIsSetpointChangeable = this.getIsSetpointChangeable();
            if (this.isSetpointChangeable!= null) {
                currentHashCode += theIsSetpointChangeable.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theIsSetpointActive;
            theIsSetpointActive = this.getIsSetpointActive();
            if (this.isSetpointActive!= null) {
                currentHashCode += theIsSetpointActive.hashCode();
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
            ElementTagType theSetpointId;
            theSetpointId = this.getSetpointId();
            strategy.appendField(locator, this, "setpointId", buffer, theSetpointId, (this.setpointId!= null));
        }
        {
            ScaledNumberElementsType theValue;
            theValue = this.getValue();
            strategy.appendField(locator, this, "value", buffer, theValue, (this.value!= null));
        }
        {
            ScaledNumberElementsType theValueMin;
            theValueMin = this.getValueMin();
            strategy.appendField(locator, this, "valueMin", buffer, theValueMin, (this.valueMin!= null));
        }
        {
            ScaledNumberElementsType theValueMax;
            theValueMax = this.getValueMax();
            strategy.appendField(locator, this, "valueMax", buffer, theValueMax, (this.valueMax!= null));
        }
        {
            ScaledNumberElementsType theValueToleranceAbsolute;
            theValueToleranceAbsolute = this.getValueToleranceAbsolute();
            strategy.appendField(locator, this, "valueToleranceAbsolute", buffer, theValueToleranceAbsolute, (this.valueToleranceAbsolute!= null));
        }
        {
            ScaledNumberElementsType theValueTolerancePercentage;
            theValueTolerancePercentage = this.getValueTolerancePercentage();
            strategy.appendField(locator, this, "valueTolerancePercentage", buffer, theValueTolerancePercentage, (this.valueTolerancePercentage!= null));
        }
        {
            ElementTagType theIsSetpointChangeable;
            theIsSetpointChangeable = this.getIsSetpointChangeable();
            strategy.appendField(locator, this, "isSetpointChangeable", buffer, theIsSetpointChangeable, (this.isSetpointChangeable!= null));
        }
        {
            ElementTagType theIsSetpointActive;
            theIsSetpointActive = this.getIsSetpointActive();
            strategy.appendField(locator, this, "isSetpointActive", buffer, theIsSetpointActive, (this.isSetpointActive!= null));
        }
        {
            TimePeriodElementsType theTimePeriod;
            theTimePeriod = this.getTimePeriod();
            strategy.appendField(locator, this, "timePeriod", buffer, theTimePeriod, (this.timePeriod!= null));
        }
        return buffer;
    }

}
