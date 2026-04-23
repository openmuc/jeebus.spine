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
 * <p>Java class for PowerSequenceStateDataElementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PowerSequenceStateDataElementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sequenceId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="state" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="activeSlotNumber" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="elapsedSlotTime" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="remainingSlotTime" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="sequenceRemoteControllable" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="activeRepetitionNumber" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="remainingPauseTime" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PowerSequenceStateDataElementsType", propOrder = {
    "sequenceId",
    "state",
    "activeSlotNumber",
    "elapsedSlotTime",
    "remainingSlotTime",
    "sequenceRemoteControllable",
    "activeRepetitionNumber",
    "remainingPauseTime"
})
@XmlSeeAlso({
    org.openmuc.jeebus.spine.xsd.v1.SmartEnergyManagementPsPowerSequenceElementsType.State.class
})
public class PowerSequenceStateDataElementsType implements Cloneable, CopyTo, ToString
{

    protected ElementTagType sequenceId;
    protected ElementTagType state;
    protected ElementTagType activeSlotNumber;
    protected ElementTagType elapsedSlotTime;
    protected ElementTagType remainingSlotTime;
    protected ElementTagType sequenceRemoteControllable;
    protected ElementTagType activeRepetitionNumber;
    protected ElementTagType remainingPauseTime;

    /**
     * Default no-arg constructor
     * 
     */
    public PowerSequenceStateDataElementsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public PowerSequenceStateDataElementsType(final ElementTagType sequenceId, final ElementTagType state, final ElementTagType activeSlotNumber, final ElementTagType elapsedSlotTime, final ElementTagType remainingSlotTime, final ElementTagType sequenceRemoteControllable, final ElementTagType activeRepetitionNumber, final ElementTagType remainingPauseTime) {
        this.sequenceId = sequenceId;
        this.state = state;
        this.activeSlotNumber = activeSlotNumber;
        this.elapsedSlotTime = elapsedSlotTime;
        this.remainingSlotTime = remainingSlotTime;
        this.sequenceRemoteControllable = sequenceRemoteControllable;
        this.activeRepetitionNumber = activeRepetitionNumber;
        this.remainingPauseTime = remainingPauseTime;
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
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setState(ElementTagType value) {
        this.state = value;
    }

    /**
     * Gets the value of the activeSlotNumber property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getActiveSlotNumber() {
        return activeSlotNumber;
    }

    /**
     * Sets the value of the activeSlotNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setActiveSlotNumber(ElementTagType value) {
        this.activeSlotNumber = value;
    }

    /**
     * Gets the value of the elapsedSlotTime property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getElapsedSlotTime() {
        return elapsedSlotTime;
    }

    /**
     * Sets the value of the elapsedSlotTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setElapsedSlotTime(ElementTagType value) {
        this.elapsedSlotTime = value;
    }

    /**
     * Gets the value of the remainingSlotTime property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getRemainingSlotTime() {
        return remainingSlotTime;
    }

    /**
     * Sets the value of the remainingSlotTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setRemainingSlotTime(ElementTagType value) {
        this.remainingSlotTime = value;
    }

    /**
     * Gets the value of the sequenceRemoteControllable property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getSequenceRemoteControllable() {
        return sequenceRemoteControllable;
    }

    /**
     * Sets the value of the sequenceRemoteControllable property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setSequenceRemoteControllable(ElementTagType value) {
        this.sequenceRemoteControllable = value;
    }

    /**
     * Gets the value of the activeRepetitionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getActiveRepetitionNumber() {
        return activeRepetitionNumber;
    }

    /**
     * Sets the value of the activeRepetitionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setActiveRepetitionNumber(ElementTagType value) {
        this.activeRepetitionNumber = value;
    }

    /**
     * Gets the value of the remainingPauseTime property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getRemainingPauseTime() {
        return remainingPauseTime;
    }

    /**
     * Sets the value of the remainingPauseTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setRemainingPauseTime(ElementTagType value) {
        this.remainingPauseTime = value;
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
    public PowerSequenceStateDataElementsType withSequenceId(ElementTagType value) {
        setSequenceId(value);
        return this;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public PowerSequenceStateDataElementsType withState(ElementTagType value) {
        setState(value);
        return this;
    }

    /**
     * Sets the value of the activeSlotNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public PowerSequenceStateDataElementsType withActiveSlotNumber(ElementTagType value) {
        setActiveSlotNumber(value);
        return this;
    }

    /**
     * Sets the value of the elapsedSlotTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public PowerSequenceStateDataElementsType withElapsedSlotTime(ElementTagType value) {
        setElapsedSlotTime(value);
        return this;
    }

    /**
     * Sets the value of the remainingSlotTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public PowerSequenceStateDataElementsType withRemainingSlotTime(ElementTagType value) {
        setRemainingSlotTime(value);
        return this;
    }

    /**
     * Sets the value of the sequenceRemoteControllable property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public PowerSequenceStateDataElementsType withSequenceRemoteControllable(ElementTagType value) {
        setSequenceRemoteControllable(value);
        return this;
    }

    /**
     * Sets the value of the activeRepetitionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public PowerSequenceStateDataElementsType withActiveRepetitionNumber(ElementTagType value) {
        setActiveRepetitionNumber(value);
        return this;
    }

    /**
     * Sets the value of the remainingPauseTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public PowerSequenceStateDataElementsType withRemainingPauseTime(ElementTagType value) {
        setRemainingPauseTime(value);
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
        if (draftCopy instanceof PowerSequenceStateDataElementsType) {
            final PowerSequenceStateDataElementsType copy = ((PowerSequenceStateDataElementsType) draftCopy);
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
            {
                Boolean stateShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.state!= null));
                if (stateShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceState;
                    sourceState = this.getState();
                    ElementTagType copyState = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "state", sourceState), sourceState, (this.state!= null)));
                    copy.setState(copyState);
                } else {
                    if (stateShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.state = null;
                    }
                }
            }
            {
                Boolean activeSlotNumberShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.activeSlotNumber!= null));
                if (activeSlotNumberShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceActiveSlotNumber;
                    sourceActiveSlotNumber = this.getActiveSlotNumber();
                    ElementTagType copyActiveSlotNumber = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "activeSlotNumber", sourceActiveSlotNumber), sourceActiveSlotNumber, (this.activeSlotNumber!= null)));
                    copy.setActiveSlotNumber(copyActiveSlotNumber);
                } else {
                    if (activeSlotNumberShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.activeSlotNumber = null;
                    }
                }
            }
            {
                Boolean elapsedSlotTimeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.elapsedSlotTime!= null));
                if (elapsedSlotTimeShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceElapsedSlotTime;
                    sourceElapsedSlotTime = this.getElapsedSlotTime();
                    ElementTagType copyElapsedSlotTime = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "elapsedSlotTime", sourceElapsedSlotTime), sourceElapsedSlotTime, (this.elapsedSlotTime!= null)));
                    copy.setElapsedSlotTime(copyElapsedSlotTime);
                } else {
                    if (elapsedSlotTimeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.elapsedSlotTime = null;
                    }
                }
            }
            {
                Boolean remainingSlotTimeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.remainingSlotTime!= null));
                if (remainingSlotTimeShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceRemainingSlotTime;
                    sourceRemainingSlotTime = this.getRemainingSlotTime();
                    ElementTagType copyRemainingSlotTime = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "remainingSlotTime", sourceRemainingSlotTime), sourceRemainingSlotTime, (this.remainingSlotTime!= null)));
                    copy.setRemainingSlotTime(copyRemainingSlotTime);
                } else {
                    if (remainingSlotTimeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.remainingSlotTime = null;
                    }
                }
            }
            {
                Boolean sequenceRemoteControllableShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.sequenceRemoteControllable!= null));
                if (sequenceRemoteControllableShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceSequenceRemoteControllable;
                    sourceSequenceRemoteControllable = this.getSequenceRemoteControllable();
                    ElementTagType copySequenceRemoteControllable = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "sequenceRemoteControllable", sourceSequenceRemoteControllable), sourceSequenceRemoteControllable, (this.sequenceRemoteControllable!= null)));
                    copy.setSequenceRemoteControllable(copySequenceRemoteControllable);
                } else {
                    if (sequenceRemoteControllableShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.sequenceRemoteControllable = null;
                    }
                }
            }
            {
                Boolean activeRepetitionNumberShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.activeRepetitionNumber!= null));
                if (activeRepetitionNumberShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceActiveRepetitionNumber;
                    sourceActiveRepetitionNumber = this.getActiveRepetitionNumber();
                    ElementTagType copyActiveRepetitionNumber = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "activeRepetitionNumber", sourceActiveRepetitionNumber), sourceActiveRepetitionNumber, (this.activeRepetitionNumber!= null)));
                    copy.setActiveRepetitionNumber(copyActiveRepetitionNumber);
                } else {
                    if (activeRepetitionNumberShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.activeRepetitionNumber = null;
                    }
                }
            }
            {
                Boolean remainingPauseTimeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.remainingPauseTime!= null));
                if (remainingPauseTimeShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceRemainingPauseTime;
                    sourceRemainingPauseTime = this.getRemainingPauseTime();
                    ElementTagType copyRemainingPauseTime = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "remainingPauseTime", sourceRemainingPauseTime), sourceRemainingPauseTime, (this.remainingPauseTime!= null)));
                    copy.setRemainingPauseTime(copyRemainingPauseTime);
                } else {
                    if (remainingPauseTimeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.remainingPauseTime = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new PowerSequenceStateDataElementsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final PowerSequenceStateDataElementsType that = ((PowerSequenceStateDataElementsType) object);
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
        {
            ElementTagType leftState;
            leftState = this.getState();
            ElementTagType rightState;
            rightState = that.getState();
            if (this.state!= null) {
                if (that.state!= null) {
                    if (!leftState.equals(rightState)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.state!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftActiveSlotNumber;
            leftActiveSlotNumber = this.getActiveSlotNumber();
            ElementTagType rightActiveSlotNumber;
            rightActiveSlotNumber = that.getActiveSlotNumber();
            if (this.activeSlotNumber!= null) {
                if (that.activeSlotNumber!= null) {
                    if (!leftActiveSlotNumber.equals(rightActiveSlotNumber)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.activeSlotNumber!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftElapsedSlotTime;
            leftElapsedSlotTime = this.getElapsedSlotTime();
            ElementTagType rightElapsedSlotTime;
            rightElapsedSlotTime = that.getElapsedSlotTime();
            if (this.elapsedSlotTime!= null) {
                if (that.elapsedSlotTime!= null) {
                    if (!leftElapsedSlotTime.equals(rightElapsedSlotTime)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.elapsedSlotTime!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftRemainingSlotTime;
            leftRemainingSlotTime = this.getRemainingSlotTime();
            ElementTagType rightRemainingSlotTime;
            rightRemainingSlotTime = that.getRemainingSlotTime();
            if (this.remainingSlotTime!= null) {
                if (that.remainingSlotTime!= null) {
                    if (!leftRemainingSlotTime.equals(rightRemainingSlotTime)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.remainingSlotTime!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftSequenceRemoteControllable;
            leftSequenceRemoteControllable = this.getSequenceRemoteControllable();
            ElementTagType rightSequenceRemoteControllable;
            rightSequenceRemoteControllable = that.getSequenceRemoteControllable();
            if (this.sequenceRemoteControllable!= null) {
                if (that.sequenceRemoteControllable!= null) {
                    if (!leftSequenceRemoteControllable.equals(rightSequenceRemoteControllable)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.sequenceRemoteControllable!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftActiveRepetitionNumber;
            leftActiveRepetitionNumber = this.getActiveRepetitionNumber();
            ElementTagType rightActiveRepetitionNumber;
            rightActiveRepetitionNumber = that.getActiveRepetitionNumber();
            if (this.activeRepetitionNumber!= null) {
                if (that.activeRepetitionNumber!= null) {
                    if (!leftActiveRepetitionNumber.equals(rightActiveRepetitionNumber)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.activeRepetitionNumber!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftRemainingPauseTime;
            leftRemainingPauseTime = this.getRemainingPauseTime();
            ElementTagType rightRemainingPauseTime;
            rightRemainingPauseTime = that.getRemainingPauseTime();
            if (this.remainingPauseTime!= null) {
                if (that.remainingPauseTime!= null) {
                    if (!leftRemainingPauseTime.equals(rightRemainingPauseTime)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.remainingPauseTime!= null) {
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
            ElementTagType theSequenceId;
            theSequenceId = this.getSequenceId();
            if (this.sequenceId!= null) {
                currentHashCode += theSequenceId.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theState;
            theState = this.getState();
            if (this.state!= null) {
                currentHashCode += theState.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theActiveSlotNumber;
            theActiveSlotNumber = this.getActiveSlotNumber();
            if (this.activeSlotNumber!= null) {
                currentHashCode += theActiveSlotNumber.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theElapsedSlotTime;
            theElapsedSlotTime = this.getElapsedSlotTime();
            if (this.elapsedSlotTime!= null) {
                currentHashCode += theElapsedSlotTime.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theRemainingSlotTime;
            theRemainingSlotTime = this.getRemainingSlotTime();
            if (this.remainingSlotTime!= null) {
                currentHashCode += theRemainingSlotTime.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theSequenceRemoteControllable;
            theSequenceRemoteControllable = this.getSequenceRemoteControllable();
            if (this.sequenceRemoteControllable!= null) {
                currentHashCode += theSequenceRemoteControllable.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theActiveRepetitionNumber;
            theActiveRepetitionNumber = this.getActiveRepetitionNumber();
            if (this.activeRepetitionNumber!= null) {
                currentHashCode += theActiveRepetitionNumber.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theRemainingPauseTime;
            theRemainingPauseTime = this.getRemainingPauseTime();
            if (this.remainingPauseTime!= null) {
                currentHashCode += theRemainingPauseTime.hashCode();
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
            ElementTagType theSequenceId;
            theSequenceId = this.getSequenceId();
            strategy.appendField(locator, this, "sequenceId", buffer, theSequenceId, (this.sequenceId!= null));
        }
        {
            ElementTagType theState;
            theState = this.getState();
            strategy.appendField(locator, this, "state", buffer, theState, (this.state!= null));
        }
        {
            ElementTagType theActiveSlotNumber;
            theActiveSlotNumber = this.getActiveSlotNumber();
            strategy.appendField(locator, this, "activeSlotNumber", buffer, theActiveSlotNumber, (this.activeSlotNumber!= null));
        }
        {
            ElementTagType theElapsedSlotTime;
            theElapsedSlotTime = this.getElapsedSlotTime();
            strategy.appendField(locator, this, "elapsedSlotTime", buffer, theElapsedSlotTime, (this.elapsedSlotTime!= null));
        }
        {
            ElementTagType theRemainingSlotTime;
            theRemainingSlotTime = this.getRemainingSlotTime();
            strategy.appendField(locator, this, "remainingSlotTime", buffer, theRemainingSlotTime, (this.remainingSlotTime!= null));
        }
        {
            ElementTagType theSequenceRemoteControllable;
            theSequenceRemoteControllable = this.getSequenceRemoteControllable();
            strategy.appendField(locator, this, "sequenceRemoteControllable", buffer, theSequenceRemoteControllable, (this.sequenceRemoteControllable!= null));
        }
        {
            ElementTagType theActiveRepetitionNumber;
            theActiveRepetitionNumber = this.getActiveRepetitionNumber();
            strategy.appendField(locator, this, "activeRepetitionNumber", buffer, theActiveRepetitionNumber, (this.activeRepetitionNumber!= null));
        }
        {
            ElementTagType theRemainingPauseTime;
            theRemainingPauseTime = this.getRemainingPauseTime();
            strategy.appendField(locator, this, "remainingPauseTime", buffer, theRemainingPauseTime, (this.remainingPauseTime!= null));
        }
        return buffer;
    }

}
