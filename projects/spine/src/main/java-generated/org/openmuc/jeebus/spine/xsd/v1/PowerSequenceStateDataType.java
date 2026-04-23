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
 * <p>Java class for PowerSequenceStateDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PowerSequenceStateDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sequenceId" type="{http://docs.eebus.org/spine/xsd/v1}PowerSequenceIdType" minOccurs="0"/&gt;
 *         &lt;element name="state" type="{http://docs.eebus.org/spine/xsd/v1}PowerSequenceStateType" minOccurs="0"/&gt;
 *         &lt;element name="activeSlotNumber" type="{http://docs.eebus.org/spine/xsd/v1}PowerTimeSlotNumberType" minOccurs="0"/&gt;
 *         &lt;element name="elapsedSlotTime" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *         &lt;element name="remainingSlotTime" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *         &lt;element name="sequenceRemoteControllable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="activeRepetitionNumber" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="remainingPauseTime" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PowerSequenceStateDataType", propOrder = {
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
    org.openmuc.jeebus.spine.xsd.v1.SmartEnergyManagementPsPowerSequenceType.State.class
})
public class PowerSequenceStateDataType implements Cloneable, CopyTo, ToString
{

    @XmlSchemaType(name = "unsignedInt")
    protected Long sequenceId;
    protected String state;
    @XmlSchemaType(name = "unsignedInt")
    protected Long activeSlotNumber;
    protected Duration elapsedSlotTime;
    protected Duration remainingSlotTime;
    protected Boolean sequenceRemoteControllable;
    @XmlSchemaType(name = "unsignedInt")
    protected Long activeRepetitionNumber;
    protected Duration remainingPauseTime;

    /**
     * Default no-arg constructor
     * 
     */
    public PowerSequenceStateDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public PowerSequenceStateDataType(final Long sequenceId, final String state, final Long activeSlotNumber, final Duration elapsedSlotTime, final Duration remainingSlotTime, final Boolean sequenceRemoteControllable, final Long activeRepetitionNumber, final Duration remainingPauseTime) {
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
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the activeSlotNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getActiveSlotNumber() {
        return activeSlotNumber;
    }

    /**
     * Sets the value of the activeSlotNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setActiveSlotNumber(Long value) {
        this.activeSlotNumber = value;
    }

    /**
     * Gets the value of the elapsedSlotTime property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getElapsedSlotTime() {
        return elapsedSlotTime;
    }

    /**
     * Sets the value of the elapsedSlotTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setElapsedSlotTime(Duration value) {
        this.elapsedSlotTime = value;
    }

    /**
     * Gets the value of the remainingSlotTime property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getRemainingSlotTime() {
        return remainingSlotTime;
    }

    /**
     * Sets the value of the remainingSlotTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setRemainingSlotTime(Duration value) {
        this.remainingSlotTime = value;
    }

    /**
     * Gets the value of the sequenceRemoteControllable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getSequenceRemoteControllable() {
        return sequenceRemoteControllable;
    }

    /**
     * Sets the value of the sequenceRemoteControllable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSequenceRemoteControllable(Boolean value) {
        this.sequenceRemoteControllable = value;
    }

    /**
     * Gets the value of the activeRepetitionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getActiveRepetitionNumber() {
        return activeRepetitionNumber;
    }

    /**
     * Sets the value of the activeRepetitionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setActiveRepetitionNumber(Long value) {
        this.activeRepetitionNumber = value;
    }

    /**
     * Gets the value of the remainingPauseTime property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getRemainingPauseTime() {
        return remainingPauseTime;
    }

    /**
     * Sets the value of the remainingPauseTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setRemainingPauseTime(Duration value) {
        this.remainingPauseTime = value;
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
    public PowerSequenceStateDataType withSequenceId(Long value) {
        setSequenceId(value);
        return this;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public PowerSequenceStateDataType withState(String value) {
        setState(value);
        return this;
    }

    /**
     * Sets the value of the activeSlotNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     * @return
     *     The class instance
     */
    public PowerSequenceStateDataType withActiveSlotNumber(Long value) {
        setActiveSlotNumber(value);
        return this;
    }

    /**
     * Sets the value of the elapsedSlotTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     * @return
     *     The class instance
     */
    public PowerSequenceStateDataType withElapsedSlotTime(Duration value) {
        setElapsedSlotTime(value);
        return this;
    }

    /**
     * Sets the value of the remainingSlotTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     * @return
     *     The class instance
     */
    public PowerSequenceStateDataType withRemainingSlotTime(Duration value) {
        setRemainingSlotTime(value);
        return this;
    }

    /**
     * Sets the value of the sequenceRemoteControllable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     * @return
     *     The class instance
     */
    public PowerSequenceStateDataType withSequenceRemoteControllable(Boolean value) {
        setSequenceRemoteControllable(value);
        return this;
    }

    /**
     * Sets the value of the activeRepetitionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     * @return
     *     The class instance
     */
    public PowerSequenceStateDataType withActiveRepetitionNumber(Long value) {
        setActiveRepetitionNumber(value);
        return this;
    }

    /**
     * Sets the value of the remainingPauseTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     * @return
     *     The class instance
     */
    public PowerSequenceStateDataType withRemainingPauseTime(Duration value) {
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
        if (draftCopy instanceof PowerSequenceStateDataType) {
            final PowerSequenceStateDataType copy = ((PowerSequenceStateDataType) draftCopy);
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
            {
                Boolean stateShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.state!= null));
                if (stateShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceState;
                    sourceState = this.getState();
                    String copyState = ((String) strategy.copy(LocatorUtils.property(locator, "state", sourceState), sourceState, (this.state!= null)));
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
                    Long sourceActiveSlotNumber;
                    sourceActiveSlotNumber = this.getActiveSlotNumber();
                    Long copyActiveSlotNumber = ((Long) strategy.copy(LocatorUtils.property(locator, "activeSlotNumber", sourceActiveSlotNumber), sourceActiveSlotNumber, (this.activeSlotNumber!= null)));
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
                    Duration sourceElapsedSlotTime;
                    sourceElapsedSlotTime = this.getElapsedSlotTime();
                    Duration copyElapsedSlotTime = ((Duration) strategy.copy(LocatorUtils.property(locator, "elapsedSlotTime", sourceElapsedSlotTime), sourceElapsedSlotTime, (this.elapsedSlotTime!= null)));
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
                    Duration sourceRemainingSlotTime;
                    sourceRemainingSlotTime = this.getRemainingSlotTime();
                    Duration copyRemainingSlotTime = ((Duration) strategy.copy(LocatorUtils.property(locator, "remainingSlotTime", sourceRemainingSlotTime), sourceRemainingSlotTime, (this.remainingSlotTime!= null)));
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
                    Boolean sourceSequenceRemoteControllable;
                    sourceSequenceRemoteControllable = this.getSequenceRemoteControllable();
                    Boolean copySequenceRemoteControllable = ((Boolean) strategy.copy(LocatorUtils.property(locator, "sequenceRemoteControllable", sourceSequenceRemoteControllable), sourceSequenceRemoteControllable, (this.sequenceRemoteControllable!= null)));
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
                    Long sourceActiveRepetitionNumber;
                    sourceActiveRepetitionNumber = this.getActiveRepetitionNumber();
                    Long copyActiveRepetitionNumber = ((Long) strategy.copy(LocatorUtils.property(locator, "activeRepetitionNumber", sourceActiveRepetitionNumber), sourceActiveRepetitionNumber, (this.activeRepetitionNumber!= null)));
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
                    Duration sourceRemainingPauseTime;
                    sourceRemainingPauseTime = this.getRemainingPauseTime();
                    Duration copyRemainingPauseTime = ((Duration) strategy.copy(LocatorUtils.property(locator, "remainingPauseTime", sourceRemainingPauseTime), sourceRemainingPauseTime, (this.remainingPauseTime!= null)));
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
        return new PowerSequenceStateDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final PowerSequenceStateDataType that = ((PowerSequenceStateDataType) object);
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
        {
            String leftState;
            leftState = this.getState();
            String rightState;
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
            Long leftActiveSlotNumber;
            leftActiveSlotNumber = this.getActiveSlotNumber();
            Long rightActiveSlotNumber;
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
            Duration leftElapsedSlotTime;
            leftElapsedSlotTime = this.getElapsedSlotTime();
            Duration rightElapsedSlotTime;
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
            Duration leftRemainingSlotTime;
            leftRemainingSlotTime = this.getRemainingSlotTime();
            Duration rightRemainingSlotTime;
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
            Boolean leftSequenceRemoteControllable;
            leftSequenceRemoteControllable = this.getSequenceRemoteControllable();
            Boolean rightSequenceRemoteControllable;
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
            Long leftActiveRepetitionNumber;
            leftActiveRepetitionNumber = this.getActiveRepetitionNumber();
            Long rightActiveRepetitionNumber;
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
            Duration leftRemainingPauseTime;
            leftRemainingPauseTime = this.getRemainingPauseTime();
            Duration rightRemainingPauseTime;
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
            Long theSequenceId;
            theSequenceId = this.getSequenceId();
            if (this.sequenceId!= null) {
                currentHashCode += theSequenceId.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String theState;
            theState = this.getState();
            if (this.state!= null) {
                currentHashCode += theState.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            Long theActiveSlotNumber;
            theActiveSlotNumber = this.getActiveSlotNumber();
            if (this.activeSlotNumber!= null) {
                currentHashCode += theActiveSlotNumber.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            Duration theElapsedSlotTime;
            theElapsedSlotTime = this.getElapsedSlotTime();
            if (this.elapsedSlotTime!= null) {
                currentHashCode += theElapsedSlotTime.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            Duration theRemainingSlotTime;
            theRemainingSlotTime = this.getRemainingSlotTime();
            if (this.remainingSlotTime!= null) {
                currentHashCode += theRemainingSlotTime.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            Boolean theSequenceRemoteControllable;
            theSequenceRemoteControllable = this.getSequenceRemoteControllable();
            if (this.sequenceRemoteControllable!= null) {
                currentHashCode += theSequenceRemoteControllable.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            Long theActiveRepetitionNumber;
            theActiveRepetitionNumber = this.getActiveRepetitionNumber();
            if (this.activeRepetitionNumber!= null) {
                currentHashCode += theActiveRepetitionNumber.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            Duration theRemainingPauseTime;
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
            Long theSequenceId;
            theSequenceId = this.getSequenceId();
            strategy.appendField(locator, this, "sequenceId", buffer, theSequenceId, (this.sequenceId!= null));
        }
        {
            String theState;
            theState = this.getState();
            strategy.appendField(locator, this, "state", buffer, theState, (this.state!= null));
        }
        {
            Long theActiveSlotNumber;
            theActiveSlotNumber = this.getActiveSlotNumber();
            strategy.appendField(locator, this, "activeSlotNumber", buffer, theActiveSlotNumber, (this.activeSlotNumber!= null));
        }
        {
            Duration theElapsedSlotTime;
            theElapsedSlotTime = this.getElapsedSlotTime();
            strategy.appendField(locator, this, "elapsedSlotTime", buffer, theElapsedSlotTime, (this.elapsedSlotTime!= null));
        }
        {
            Duration theRemainingSlotTime;
            theRemainingSlotTime = this.getRemainingSlotTime();
            strategy.appendField(locator, this, "remainingSlotTime", buffer, theRemainingSlotTime, (this.remainingSlotTime!= null));
        }
        {
            Boolean theSequenceRemoteControllable;
            theSequenceRemoteControllable = this.getSequenceRemoteControllable();
            strategy.appendField(locator, this, "sequenceRemoteControllable", buffer, theSequenceRemoteControllable, (this.sequenceRemoteControllable!= null));
        }
        {
            Long theActiveRepetitionNumber;
            theActiveRepetitionNumber = this.getActiveRepetitionNumber();
            strategy.appendField(locator, this, "activeRepetitionNumber", buffer, theActiveRepetitionNumber, (this.activeRepetitionNumber!= null));
        }
        {
            Duration theRemainingPauseTime;
            theRemainingPauseTime = this.getRemainingPauseTime();
            strategy.appendField(locator, this, "remainingPauseTime", buffer, theRemainingPauseTime, (this.remainingPauseTime!= null));
        }
        return buffer;
    }

}
