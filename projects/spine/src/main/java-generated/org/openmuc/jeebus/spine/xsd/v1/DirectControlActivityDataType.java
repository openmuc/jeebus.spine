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
 * <p>Java class for DirectControlActivityDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DirectControlActivityDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="timestamp" type="{http://docs.eebus.org/spine/xsd/v1}AbsoluteOrRelativeTimeType" minOccurs="0"/&gt;
 *         &lt;element name="activityState" type="{http://docs.eebus.org/spine/xsd/v1}DirectControlActivityStateType" minOccurs="0"/&gt;
 *         &lt;element name="isActivityStateChangeable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="energyMode" type="{http://docs.eebus.org/spine/xsd/v1}EnergyModeType" minOccurs="0"/&gt;
 *         &lt;element name="isEnergyModeChangeable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="power" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberType" minOccurs="0"/&gt;
 *         &lt;element name="isPowerChangeable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="energy" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberType" minOccurs="0"/&gt;
 *         &lt;element name="isEnergyChangeable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="sequenceId" type="{http://docs.eebus.org/spine/xsd/v1}PowerSequenceIdType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DirectControlActivityDataType", propOrder = {
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
public class DirectControlActivityDataType implements Cloneable, CopyTo, ToString
{

    protected String timestamp;
    protected String activityState;
    protected Boolean isActivityStateChangeable;
    protected String energyMode;
    protected Boolean isEnergyModeChangeable;
    protected ScaledNumberType power;
    protected Boolean isPowerChangeable;
    protected ScaledNumberType energy;
    protected Boolean isEnergyChangeable;
    @XmlSchemaType(name = "unsignedInt")
    protected Long sequenceId;

    /**
     * Default no-arg constructor
     * 
     */
    public DirectControlActivityDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public DirectControlActivityDataType(final String timestamp, final String activityState, final Boolean isActivityStateChangeable, final String energyMode, final Boolean isEnergyModeChangeable, final ScaledNumberType power, final Boolean isPowerChangeable, final ScaledNumberType energy, final Boolean isEnergyChangeable, final Long sequenceId) {
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
     *     {@link String }
     *     
     */
    public String getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimestamp(String value) {
        this.timestamp = value;
    }

    /**
     * Gets the value of the activityState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivityState() {
        return activityState;
    }

    /**
     * Sets the value of the activityState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivityState(String value) {
        this.activityState = value;
    }

    /**
     * Gets the value of the isActivityStateChangeable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getIsActivityStateChangeable() {
        return isActivityStateChangeable;
    }

    /**
     * Sets the value of the isActivityStateChangeable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsActivityStateChangeable(Boolean value) {
        this.isActivityStateChangeable = value;
    }

    /**
     * Gets the value of the energyMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnergyMode() {
        return energyMode;
    }

    /**
     * Sets the value of the energyMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnergyMode(String value) {
        this.energyMode = value;
    }

    /**
     * Gets the value of the isEnergyModeChangeable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getIsEnergyModeChangeable() {
        return isEnergyModeChangeable;
    }

    /**
     * Sets the value of the isEnergyModeChangeable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsEnergyModeChangeable(Boolean value) {
        this.isEnergyModeChangeable = value;
    }

    /**
     * Gets the value of the power property.
     * 
     * @return
     *     possible object is
     *     {@link ScaledNumberType }
     *     
     */
    public ScaledNumberType getPower() {
        return power;
    }

    /**
     * Sets the value of the power property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberType }
     *     
     */
    public void setPower(ScaledNumberType value) {
        this.power = value;
    }

    /**
     * Gets the value of the isPowerChangeable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getIsPowerChangeable() {
        return isPowerChangeable;
    }

    /**
     * Sets the value of the isPowerChangeable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPowerChangeable(Boolean value) {
        this.isPowerChangeable = value;
    }

    /**
     * Gets the value of the energy property.
     * 
     * @return
     *     possible object is
     *     {@link ScaledNumberType }
     *     
     */
    public ScaledNumberType getEnergy() {
        return energy;
    }

    /**
     * Sets the value of the energy property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberType }
     *     
     */
    public void setEnergy(ScaledNumberType value) {
        this.energy = value;
    }

    /**
     * Gets the value of the isEnergyChangeable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getIsEnergyChangeable() {
        return isEnergyChangeable;
    }

    /**
     * Sets the value of the isEnergyChangeable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsEnergyChangeable(Boolean value) {
        this.isEnergyChangeable = value;
    }

    /**
     * Gets the value of the sequenceId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSequenceId() {
        return sequenceId;
    }

    /**
     * Sets the value of the sequenceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSequenceId(Long value) {
        this.sequenceId = value;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public DirectControlActivityDataType withTimestamp(String value) {
        setTimestamp(value);
        return this;
    }

    /**
     * Sets the value of the activityState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public DirectControlActivityDataType withActivityState(String value) {
        setActivityState(value);
        return this;
    }

    /**
     * Sets the value of the isActivityStateChangeable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     * @return
     *     The class instance
     */
    public DirectControlActivityDataType withIsActivityStateChangeable(Boolean value) {
        setIsActivityStateChangeable(value);
        return this;
    }

    /**
     * Sets the value of the energyMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public DirectControlActivityDataType withEnergyMode(String value) {
        setEnergyMode(value);
        return this;
    }

    /**
     * Sets the value of the isEnergyModeChangeable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     * @return
     *     The class instance
     */
    public DirectControlActivityDataType withIsEnergyModeChangeable(Boolean value) {
        setIsEnergyModeChangeable(value);
        return this;
    }

    /**
     * Sets the value of the power property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberType }
     * @return
     *     The class instance
     */
    public DirectControlActivityDataType withPower(ScaledNumberType value) {
        setPower(value);
        return this;
    }

    /**
     * Sets the value of the isPowerChangeable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     * @return
     *     The class instance
     */
    public DirectControlActivityDataType withIsPowerChangeable(Boolean value) {
        setIsPowerChangeable(value);
        return this;
    }

    /**
     * Sets the value of the energy property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberType }
     * @return
     *     The class instance
     */
    public DirectControlActivityDataType withEnergy(ScaledNumberType value) {
        setEnergy(value);
        return this;
    }

    /**
     * Sets the value of the isEnergyChangeable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     * @return
     *     The class instance
     */
    public DirectControlActivityDataType withIsEnergyChangeable(Boolean value) {
        setIsEnergyChangeable(value);
        return this;
    }

    /**
     * Sets the value of the sequenceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     * @return
     *     The class instance
     */
    public DirectControlActivityDataType withSequenceId(Long value) {
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
        if (draftCopy instanceof DirectControlActivityDataType) {
            final DirectControlActivityDataType copy = ((DirectControlActivityDataType) draftCopy);
            {
                Boolean timestampShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.timestamp!= null));
                if (timestampShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceTimestamp;
                    sourceTimestamp = this.getTimestamp();
                    String copyTimestamp = ((String) strategy.copy(LocatorUtils.property(locator, "timestamp", sourceTimestamp), sourceTimestamp, (this.timestamp!= null)));
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
                    String sourceActivityState;
                    sourceActivityState = this.getActivityState();
                    String copyActivityState = ((String) strategy.copy(LocatorUtils.property(locator, "activityState", sourceActivityState), sourceActivityState, (this.activityState!= null)));
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
                    Boolean sourceIsActivityStateChangeable;
                    sourceIsActivityStateChangeable = this.getIsActivityStateChangeable();
                    Boolean copyIsActivityStateChangeable = ((Boolean) strategy.copy(LocatorUtils.property(locator, "isActivityStateChangeable", sourceIsActivityStateChangeable), sourceIsActivityStateChangeable, (this.isActivityStateChangeable!= null)));
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
                    String sourceEnergyMode;
                    sourceEnergyMode = this.getEnergyMode();
                    String copyEnergyMode = ((String) strategy.copy(LocatorUtils.property(locator, "energyMode", sourceEnergyMode), sourceEnergyMode, (this.energyMode!= null)));
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
                    Boolean sourceIsEnergyModeChangeable;
                    sourceIsEnergyModeChangeable = this.getIsEnergyModeChangeable();
                    Boolean copyIsEnergyModeChangeable = ((Boolean) strategy.copy(LocatorUtils.property(locator, "isEnergyModeChangeable", sourceIsEnergyModeChangeable), sourceIsEnergyModeChangeable, (this.isEnergyModeChangeable!= null)));
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
                    ScaledNumberType sourcePower;
                    sourcePower = this.getPower();
                    ScaledNumberType copyPower = ((ScaledNumberType) strategy.copy(LocatorUtils.property(locator, "power", sourcePower), sourcePower, (this.power!= null)));
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
                    Boolean sourceIsPowerChangeable;
                    sourceIsPowerChangeable = this.getIsPowerChangeable();
                    Boolean copyIsPowerChangeable = ((Boolean) strategy.copy(LocatorUtils.property(locator, "isPowerChangeable", sourceIsPowerChangeable), sourceIsPowerChangeable, (this.isPowerChangeable!= null)));
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
                    ScaledNumberType sourceEnergy;
                    sourceEnergy = this.getEnergy();
                    ScaledNumberType copyEnergy = ((ScaledNumberType) strategy.copy(LocatorUtils.property(locator, "energy", sourceEnergy), sourceEnergy, (this.energy!= null)));
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
                    Boolean sourceIsEnergyChangeable;
                    sourceIsEnergyChangeable = this.getIsEnergyChangeable();
                    Boolean copyIsEnergyChangeable = ((Boolean) strategy.copy(LocatorUtils.property(locator, "isEnergyChangeable", sourceIsEnergyChangeable), sourceIsEnergyChangeable, (this.isEnergyChangeable!= null)));
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
                    Long sourceSequenceId;
                    sourceSequenceId = this.getSequenceId();
                    Long copySequenceId = ((Long) strategy.copy(LocatorUtils.property(locator, "sequenceId", sourceSequenceId), sourceSequenceId, (this.sequenceId!= null)));
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
        return new DirectControlActivityDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DirectControlActivityDataType that = ((DirectControlActivityDataType) object);
        {
            String leftTimestamp;
            leftTimestamp = this.getTimestamp();
            String rightTimestamp;
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
            String leftActivityState;
            leftActivityState = this.getActivityState();
            String rightActivityState;
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
            Boolean leftIsActivityStateChangeable;
            leftIsActivityStateChangeable = this.getIsActivityStateChangeable();
            Boolean rightIsActivityStateChangeable;
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
            String leftEnergyMode;
            leftEnergyMode = this.getEnergyMode();
            String rightEnergyMode;
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
            Boolean leftIsEnergyModeChangeable;
            leftIsEnergyModeChangeable = this.getIsEnergyModeChangeable();
            Boolean rightIsEnergyModeChangeable;
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
            ScaledNumberType leftPower;
            leftPower = this.getPower();
            ScaledNumberType rightPower;
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
            Boolean leftIsPowerChangeable;
            leftIsPowerChangeable = this.getIsPowerChangeable();
            Boolean rightIsPowerChangeable;
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
            ScaledNumberType leftEnergy;
            leftEnergy = this.getEnergy();
            ScaledNumberType rightEnergy;
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
            Boolean leftIsEnergyChangeable;
            leftIsEnergyChangeable = this.getIsEnergyChangeable();
            Boolean rightIsEnergyChangeable;
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
            Long leftSequenceId;
            leftSequenceId = this.getSequenceId();
            Long rightSequenceId;
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
            String theTimestamp;
            theTimestamp = this.getTimestamp();
            if (this.timestamp!= null) {
                currentHashCode += theTimestamp.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String theActivityState;
            theActivityState = this.getActivityState();
            if (this.activityState!= null) {
                currentHashCode += theActivityState.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            Boolean theIsActivityStateChangeable;
            theIsActivityStateChangeable = this.getIsActivityStateChangeable();
            if (this.isActivityStateChangeable!= null) {
                currentHashCode += theIsActivityStateChangeable.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String theEnergyMode;
            theEnergyMode = this.getEnergyMode();
            if (this.energyMode!= null) {
                currentHashCode += theEnergyMode.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            Boolean theIsEnergyModeChangeable;
            theIsEnergyModeChangeable = this.getIsEnergyModeChangeable();
            if (this.isEnergyModeChangeable!= null) {
                currentHashCode += theIsEnergyModeChangeable.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ScaledNumberType thePower;
            thePower = this.getPower();
            if (this.power!= null) {
                currentHashCode += thePower.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            Boolean theIsPowerChangeable;
            theIsPowerChangeable = this.getIsPowerChangeable();
            if (this.isPowerChangeable!= null) {
                currentHashCode += theIsPowerChangeable.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ScaledNumberType theEnergy;
            theEnergy = this.getEnergy();
            if (this.energy!= null) {
                currentHashCode += theEnergy.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            Boolean theIsEnergyChangeable;
            theIsEnergyChangeable = this.getIsEnergyChangeable();
            if (this.isEnergyChangeable!= null) {
                currentHashCode += theIsEnergyChangeable.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            Long theSequenceId;
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
            String theTimestamp;
            theTimestamp = this.getTimestamp();
            strategy.appendField(locator, this, "timestamp", buffer, theTimestamp, (this.timestamp!= null));
        }
        {
            String theActivityState;
            theActivityState = this.getActivityState();
            strategy.appendField(locator, this, "activityState", buffer, theActivityState, (this.activityState!= null));
        }
        {
            Boolean theIsActivityStateChangeable;
            theIsActivityStateChangeable = this.getIsActivityStateChangeable();
            strategy.appendField(locator, this, "isActivityStateChangeable", buffer, theIsActivityStateChangeable, (this.isActivityStateChangeable!= null));
        }
        {
            String theEnergyMode;
            theEnergyMode = this.getEnergyMode();
            strategy.appendField(locator, this, "energyMode", buffer, theEnergyMode, (this.energyMode!= null));
        }
        {
            Boolean theIsEnergyModeChangeable;
            theIsEnergyModeChangeable = this.getIsEnergyModeChangeable();
            strategy.appendField(locator, this, "isEnergyModeChangeable", buffer, theIsEnergyModeChangeable, (this.isEnergyModeChangeable!= null));
        }
        {
            ScaledNumberType thePower;
            thePower = this.getPower();
            strategy.appendField(locator, this, "power", buffer, thePower, (this.power!= null));
        }
        {
            Boolean theIsPowerChangeable;
            theIsPowerChangeable = this.getIsPowerChangeable();
            strategy.appendField(locator, this, "isPowerChangeable", buffer, theIsPowerChangeable, (this.isPowerChangeable!= null));
        }
        {
            ScaledNumberType theEnergy;
            theEnergy = this.getEnergy();
            strategy.appendField(locator, this, "energy", buffer, theEnergy, (this.energy!= null));
        }
        {
            Boolean theIsEnergyChangeable;
            theIsEnergyChangeable = this.getIsEnergyChangeable();
            strategy.appendField(locator, this, "isEnergyChangeable", buffer, theIsEnergyChangeable, (this.isEnergyChangeable!= null));
        }
        {
            Long theSequenceId;
            theSequenceId = this.getSequenceId();
            strategy.appendField(locator, this, "sequenceId", buffer, theSequenceId, (this.sequenceId!= null));
        }
        return buffer;
    }

}
