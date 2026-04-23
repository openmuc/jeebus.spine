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
 * <p>Java class for DirectControlActivityDataElementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DirectControlActivityDataElementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="timestamp" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="activityState" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="isActivityStateChangeable" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="energyMode" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="isEnergyModeChangeable" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="power" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberElementsType" minOccurs="0"/&gt;
 *         &lt;element name="isPowerChangeable" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="energy" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberElementsType" minOccurs="0"/&gt;
 *         &lt;element name="isEnergyChangeable" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="sequenceId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DirectControlActivityDataElementsType", propOrder = {
    "timestamp",
    "activityState",
    "isActivityStateChangeable",
    "energyMode",
    "isEnergyModeChangeable",
    "power",
    "isPowerChangeable",
    "energy",
    "isEnergyChangeable",
    "sequenceId"
})
public class DirectControlActivityDataElementsType implements Cloneable, CopyTo, ToString
{

    protected ElementTagType timestamp;
    protected ElementTagType activityState;
    protected ElementTagType isActivityStateChangeable;
    protected ElementTagType energyMode;
    protected ElementTagType isEnergyModeChangeable;
    protected ScaledNumberElementsType power;
    protected ElementTagType isPowerChangeable;
    protected ScaledNumberElementsType energy;
    protected ElementTagType isEnergyChangeable;
    protected ElementTagType sequenceId;

    /**
     * Default no-arg constructor
     * 
     */
    public DirectControlActivityDataElementsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public DirectControlActivityDataElementsType(final ElementTagType timestamp, final ElementTagType activityState, final ElementTagType isActivityStateChangeable, final ElementTagType energyMode, final ElementTagType isEnergyModeChangeable, final ScaledNumberElementsType power, final ElementTagType isPowerChangeable, final ScaledNumberElementsType energy, final ElementTagType isEnergyChangeable, final ElementTagType sequenceId) {
        this.timestamp = timestamp;
        this.activityState = activityState;
        this.isActivityStateChangeable = isActivityStateChangeable;
        this.energyMode = energyMode;
        this.isEnergyModeChangeable = isEnergyModeChangeable;
        this.power = power;
        this.isPowerChangeable = isPowerChangeable;
        this.energy = energy;
        this.isEnergyChangeable = isEnergyChangeable;
        this.sequenceId = sequenceId;
    }

    /**
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setTimestamp(ElementTagType value) {
        this.timestamp = value;
    }

    /**
     * Gets the value of the activityState property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getActivityState() {
        return activityState;
    }

    /**
     * Sets the value of the activityState property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setActivityState(ElementTagType value) {
        this.activityState = value;
    }

    /**
     * Gets the value of the isActivityStateChangeable property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getIsActivityStateChangeable() {
        return isActivityStateChangeable;
    }

    /**
     * Sets the value of the isActivityStateChangeable property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setIsActivityStateChangeable(ElementTagType value) {
        this.isActivityStateChangeable = value;
    }

    /**
     * Gets the value of the energyMode property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getEnergyMode() {
        return energyMode;
    }

    /**
     * Sets the value of the energyMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setEnergyMode(ElementTagType value) {
        this.energyMode = value;
    }

    /**
     * Gets the value of the isEnergyModeChangeable property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getIsEnergyModeChangeable() {
        return isEnergyModeChangeable;
    }

    /**
     * Sets the value of the isEnergyModeChangeable property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setIsEnergyModeChangeable(ElementTagType value) {
        this.isEnergyModeChangeable = value;
    }

    /**
     * Gets the value of the power property.
     * 
     * @return
     *     possible object is
     *     {@link ScaledNumberElementsType }
     *     
     */
    public ScaledNumberElementsType getPower() {
        return power;
    }

    /**
     * Sets the value of the power property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberElementsType }
     *     
     */
    public void setPower(ScaledNumberElementsType value) {
        this.power = value;
    }

    /**
     * Gets the value of the isPowerChangeable property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getIsPowerChangeable() {
        return isPowerChangeable;
    }

    /**
     * Sets the value of the isPowerChangeable property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setIsPowerChangeable(ElementTagType value) {
        this.isPowerChangeable = value;
    }

    /**
     * Gets the value of the energy property.
     * 
     * @return
     *     possible object is
     *     {@link ScaledNumberElementsType }
     *     
     */
    public ScaledNumberElementsType getEnergy() {
        return energy;
    }

    /**
     * Sets the value of the energy property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberElementsType }
     *     
     */
    public void setEnergy(ScaledNumberElementsType value) {
        this.energy = value;
    }

    /**
     * Gets the value of the isEnergyChangeable property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getIsEnergyChangeable() {
        return isEnergyChangeable;
    }

    /**
     * Sets the value of the isEnergyChangeable property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setIsEnergyChangeable(ElementTagType value) {
        this.isEnergyChangeable = value;
    }

    /**
     * Gets the value of the sequenceId property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getSequenceId() {
        return sequenceId;
    }

    /**
     * Sets the value of the sequenceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setSequenceId(ElementTagType value) {
        this.sequenceId = value;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public DirectControlActivityDataElementsType withTimestamp(ElementTagType value) {
        setTimestamp(value);
        return this;
    }

    /**
     * Sets the value of the activityState property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public DirectControlActivityDataElementsType withActivityState(ElementTagType value) {
        setActivityState(value);
        return this;
    }

    /**
     * Sets the value of the isActivityStateChangeable property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public DirectControlActivityDataElementsType withIsActivityStateChangeable(ElementTagType value) {
        setIsActivityStateChangeable(value);
        return this;
    }

    /**
     * Sets the value of the energyMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public DirectControlActivityDataElementsType withEnergyMode(ElementTagType value) {
        setEnergyMode(value);
        return this;
    }

    /**
     * Sets the value of the isEnergyModeChangeable property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public DirectControlActivityDataElementsType withIsEnergyModeChangeable(ElementTagType value) {
        setIsEnergyModeChangeable(value);
        return this;
    }

    /**
     * Sets the value of the power property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberElementsType }
     * @return
     *     The class instance
     */
    public DirectControlActivityDataElementsType withPower(ScaledNumberElementsType value) {
        setPower(value);
        return this;
    }

    /**
     * Sets the value of the isPowerChangeable property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public DirectControlActivityDataElementsType withIsPowerChangeable(ElementTagType value) {
        setIsPowerChangeable(value);
        return this;
    }

    /**
     * Sets the value of the energy property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberElementsType }
     * @return
     *     The class instance
     */
    public DirectControlActivityDataElementsType withEnergy(ScaledNumberElementsType value) {
        setEnergy(value);
        return this;
    }

    /**
     * Sets the value of the isEnergyChangeable property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public DirectControlActivityDataElementsType withIsEnergyChangeable(ElementTagType value) {
        setIsEnergyChangeable(value);
        return this;
    }

    /**
     * Sets the value of the sequenceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public DirectControlActivityDataElementsType withSequenceId(ElementTagType value) {
        setSequenceId(value);
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
        if (draftCopy instanceof DirectControlActivityDataElementsType) {
            final DirectControlActivityDataElementsType copy = ((DirectControlActivityDataElementsType) draftCopy);
            {
                Boolean timestampShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.timestamp!= null));
                if (timestampShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceTimestamp;
                    sourceTimestamp = this.getTimestamp();
                    ElementTagType copyTimestamp = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "timestamp", sourceTimestamp), sourceTimestamp, (this.timestamp!= null)));
                    copy.setTimestamp(copyTimestamp);
                } else {
                    if (timestampShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.timestamp = null;
                    }
                }
            }
            {
                Boolean activityStateShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.activityState!= null));
                if (activityStateShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceActivityState;
                    sourceActivityState = this.getActivityState();
                    ElementTagType copyActivityState = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "activityState", sourceActivityState), sourceActivityState, (this.activityState!= null)));
                    copy.setActivityState(copyActivityState);
                } else {
                    if (activityStateShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.activityState = null;
                    }
                }
            }
            {
                Boolean isActivityStateChangeableShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.isActivityStateChangeable!= null));
                if (isActivityStateChangeableShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceIsActivityStateChangeable;
                    sourceIsActivityStateChangeable = this.getIsActivityStateChangeable();
                    ElementTagType copyIsActivityStateChangeable = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "isActivityStateChangeable", sourceIsActivityStateChangeable), sourceIsActivityStateChangeable, (this.isActivityStateChangeable!= null)));
                    copy.setIsActivityStateChangeable(copyIsActivityStateChangeable);
                } else {
                    if (isActivityStateChangeableShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.isActivityStateChangeable = null;
                    }
                }
            }
            {
                Boolean energyModeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.energyMode!= null));
                if (energyModeShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceEnergyMode;
                    sourceEnergyMode = this.getEnergyMode();
                    ElementTagType copyEnergyMode = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "energyMode", sourceEnergyMode), sourceEnergyMode, (this.energyMode!= null)));
                    copy.setEnergyMode(copyEnergyMode);
                } else {
                    if (energyModeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.energyMode = null;
                    }
                }
            }
            {
                Boolean isEnergyModeChangeableShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.isEnergyModeChangeable!= null));
                if (isEnergyModeChangeableShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceIsEnergyModeChangeable;
                    sourceIsEnergyModeChangeable = this.getIsEnergyModeChangeable();
                    ElementTagType copyIsEnergyModeChangeable = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "isEnergyModeChangeable", sourceIsEnergyModeChangeable), sourceIsEnergyModeChangeable, (this.isEnergyModeChangeable!= null)));
                    copy.setIsEnergyModeChangeable(copyIsEnergyModeChangeable);
                } else {
                    if (isEnergyModeChangeableShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.isEnergyModeChangeable = null;
                    }
                }
            }
            {
                Boolean powerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.power!= null));
                if (powerShouldBeCopiedAndSet == Boolean.TRUE) {
                    ScaledNumberElementsType sourcePower;
                    sourcePower = this.getPower();
                    ScaledNumberElementsType copyPower = ((ScaledNumberElementsType) strategy.copy(LocatorUtils.property(locator, "power", sourcePower), sourcePower, (this.power!= null)));
                    copy.setPower(copyPower);
                } else {
                    if (powerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.power = null;
                    }
                }
            }
            {
                Boolean isPowerChangeableShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.isPowerChangeable!= null));
                if (isPowerChangeableShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceIsPowerChangeable;
                    sourceIsPowerChangeable = this.getIsPowerChangeable();
                    ElementTagType copyIsPowerChangeable = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "isPowerChangeable", sourceIsPowerChangeable), sourceIsPowerChangeable, (this.isPowerChangeable!= null)));
                    copy.setIsPowerChangeable(copyIsPowerChangeable);
                } else {
                    if (isPowerChangeableShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.isPowerChangeable = null;
                    }
                }
            }
            {
                Boolean energyShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.energy!= null));
                if (energyShouldBeCopiedAndSet == Boolean.TRUE) {
                    ScaledNumberElementsType sourceEnergy;
                    sourceEnergy = this.getEnergy();
                    ScaledNumberElementsType copyEnergy = ((ScaledNumberElementsType) strategy.copy(LocatorUtils.property(locator, "energy", sourceEnergy), sourceEnergy, (this.energy!= null)));
                    copy.setEnergy(copyEnergy);
                } else {
                    if (energyShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.energy = null;
                    }
                }
            }
            {
                Boolean isEnergyChangeableShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.isEnergyChangeable!= null));
                if (isEnergyChangeableShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceIsEnergyChangeable;
                    sourceIsEnergyChangeable = this.getIsEnergyChangeable();
                    ElementTagType copyIsEnergyChangeable = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "isEnergyChangeable", sourceIsEnergyChangeable), sourceIsEnergyChangeable, (this.isEnergyChangeable!= null)));
                    copy.setIsEnergyChangeable(copyIsEnergyChangeable);
                } else {
                    if (isEnergyChangeableShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.isEnergyChangeable = null;
                    }
                }
            }
            {
                Boolean sequenceIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.sequenceId!= null));
                if (sequenceIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceSequenceId;
                    sourceSequenceId = this.getSequenceId();
                    ElementTagType copySequenceId = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "sequenceId", sourceSequenceId), sourceSequenceId, (this.sequenceId!= null)));
                    copy.setSequenceId(copySequenceId);
                } else {
                    if (sequenceIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.sequenceId = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new DirectControlActivityDataElementsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DirectControlActivityDataElementsType that = ((DirectControlActivityDataElementsType) object);
        {
            ElementTagType leftTimestamp;
            leftTimestamp = this.getTimestamp();
            ElementTagType rightTimestamp;
            rightTimestamp = that.getTimestamp();
            if (this.timestamp!= null) {
                if (that.timestamp!= null) {
                    if (!leftTimestamp.equals(rightTimestamp)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.timestamp!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftActivityState;
            leftActivityState = this.getActivityState();
            ElementTagType rightActivityState;
            rightActivityState = that.getActivityState();
            if (this.activityState!= null) {
                if (that.activityState!= null) {
                    if (!leftActivityState.equals(rightActivityState)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.activityState!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftIsActivityStateChangeable;
            leftIsActivityStateChangeable = this.getIsActivityStateChangeable();
            ElementTagType rightIsActivityStateChangeable;
            rightIsActivityStateChangeable = that.getIsActivityStateChangeable();
            if (this.isActivityStateChangeable!= null) {
                if (that.isActivityStateChangeable!= null) {
                    if (!leftIsActivityStateChangeable.equals(rightIsActivityStateChangeable)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.isActivityStateChangeable!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftEnergyMode;
            leftEnergyMode = this.getEnergyMode();
            ElementTagType rightEnergyMode;
            rightEnergyMode = that.getEnergyMode();
            if (this.energyMode!= null) {
                if (that.energyMode!= null) {
                    if (!leftEnergyMode.equals(rightEnergyMode)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.energyMode!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftIsEnergyModeChangeable;
            leftIsEnergyModeChangeable = this.getIsEnergyModeChangeable();
            ElementTagType rightIsEnergyModeChangeable;
            rightIsEnergyModeChangeable = that.getIsEnergyModeChangeable();
            if (this.isEnergyModeChangeable!= null) {
                if (that.isEnergyModeChangeable!= null) {
                    if (!leftIsEnergyModeChangeable.equals(rightIsEnergyModeChangeable)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.isEnergyModeChangeable!= null) {
                    return false;
                }
            }
        }
        {
            ScaledNumberElementsType leftPower;
            leftPower = this.getPower();
            ScaledNumberElementsType rightPower;
            rightPower = that.getPower();
            if (this.power!= null) {
                if (that.power!= null) {
                    if (!leftPower.equals(rightPower)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.power!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftIsPowerChangeable;
            leftIsPowerChangeable = this.getIsPowerChangeable();
            ElementTagType rightIsPowerChangeable;
            rightIsPowerChangeable = that.getIsPowerChangeable();
            if (this.isPowerChangeable!= null) {
                if (that.isPowerChangeable!= null) {
                    if (!leftIsPowerChangeable.equals(rightIsPowerChangeable)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.isPowerChangeable!= null) {
                    return false;
                }
            }
        }
        {
            ScaledNumberElementsType leftEnergy;
            leftEnergy = this.getEnergy();
            ScaledNumberElementsType rightEnergy;
            rightEnergy = that.getEnergy();
            if (this.energy!= null) {
                if (that.energy!= null) {
                    if (!leftEnergy.equals(rightEnergy)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.energy!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftIsEnergyChangeable;
            leftIsEnergyChangeable = this.getIsEnergyChangeable();
            ElementTagType rightIsEnergyChangeable;
            rightIsEnergyChangeable = that.getIsEnergyChangeable();
            if (this.isEnergyChangeable!= null) {
                if (that.isEnergyChangeable!= null) {
                    if (!leftIsEnergyChangeable.equals(rightIsEnergyChangeable)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.isEnergyChangeable!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftSequenceId;
            leftSequenceId = this.getSequenceId();
            ElementTagType rightSequenceId;
            rightSequenceId = that.getSequenceId();
            if (this.sequenceId!= null) {
                if (that.sequenceId!= null) {
                    if (!leftSequenceId.equals(rightSequenceId)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.sequenceId!= null) {
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
            ElementTagType theTimestamp;
            theTimestamp = this.getTimestamp();
            if (this.timestamp!= null) {
                currentHashCode += theTimestamp.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theActivityState;
            theActivityState = this.getActivityState();
            if (this.activityState!= null) {
                currentHashCode += theActivityState.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theIsActivityStateChangeable;
            theIsActivityStateChangeable = this.getIsActivityStateChangeable();
            if (this.isActivityStateChangeable!= null) {
                currentHashCode += theIsActivityStateChangeable.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theEnergyMode;
            theEnergyMode = this.getEnergyMode();
            if (this.energyMode!= null) {
                currentHashCode += theEnergyMode.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theIsEnergyModeChangeable;
            theIsEnergyModeChangeable = this.getIsEnergyModeChangeable();
            if (this.isEnergyModeChangeable!= null) {
                currentHashCode += theIsEnergyModeChangeable.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ScaledNumberElementsType thePower;
            thePower = this.getPower();
            if (this.power!= null) {
                currentHashCode += thePower.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theIsPowerChangeable;
            theIsPowerChangeable = this.getIsPowerChangeable();
            if (this.isPowerChangeable!= null) {
                currentHashCode += theIsPowerChangeable.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ScaledNumberElementsType theEnergy;
            theEnergy = this.getEnergy();
            if (this.energy!= null) {
                currentHashCode += theEnergy.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theIsEnergyChangeable;
            theIsEnergyChangeable = this.getIsEnergyChangeable();
            if (this.isEnergyChangeable!= null) {
                currentHashCode += theIsEnergyChangeable.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theSequenceId;
            theSequenceId = this.getSequenceId();
            if (this.sequenceId!= null) {
                currentHashCode += theSequenceId.hashCode();
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
            ElementTagType theTimestamp;
            theTimestamp = this.getTimestamp();
            strategy.appendField(locator, this, "timestamp", buffer, theTimestamp, (this.timestamp!= null));
        }
        {
            ElementTagType theActivityState;
            theActivityState = this.getActivityState();
            strategy.appendField(locator, this, "activityState", buffer, theActivityState, (this.activityState!= null));
        }
        {
            ElementTagType theIsActivityStateChangeable;
            theIsActivityStateChangeable = this.getIsActivityStateChangeable();
            strategy.appendField(locator, this, "isActivityStateChangeable", buffer, theIsActivityStateChangeable, (this.isActivityStateChangeable!= null));
        }
        {
            ElementTagType theEnergyMode;
            theEnergyMode = this.getEnergyMode();
            strategy.appendField(locator, this, "energyMode", buffer, theEnergyMode, (this.energyMode!= null));
        }
        {
            ElementTagType theIsEnergyModeChangeable;
            theIsEnergyModeChangeable = this.getIsEnergyModeChangeable();
            strategy.appendField(locator, this, "isEnergyModeChangeable", buffer, theIsEnergyModeChangeable, (this.isEnergyModeChangeable!= null));
        }
        {
            ScaledNumberElementsType thePower;
            thePower = this.getPower();
            strategy.appendField(locator, this, "power", buffer, thePower, (this.power!= null));
        }
        {
            ElementTagType theIsPowerChangeable;
            theIsPowerChangeable = this.getIsPowerChangeable();
            strategy.appendField(locator, this, "isPowerChangeable", buffer, theIsPowerChangeable, (this.isPowerChangeable!= null));
        }
        {
            ScaledNumberElementsType theEnergy;
            theEnergy = this.getEnergy();
            strategy.appendField(locator, this, "energy", buffer, theEnergy, (this.energy!= null));
        }
        {
            ElementTagType theIsEnergyChangeable;
            theIsEnergyChangeable = this.getIsEnergyChangeable();
            strategy.appendField(locator, this, "isEnergyChangeable", buffer, theIsEnergyChangeable, (this.isEnergyChangeable!= null));
        }
        {
            ElementTagType theSequenceId;
            theSequenceId = this.getSequenceId();
            strategy.appendField(locator, this, "sequenceId", buffer, theSequenceId, (this.sequenceId!= null));
        }
        return buffer;
    }

}
