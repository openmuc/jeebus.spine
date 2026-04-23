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
 * <p>Java class for PowerSequenceScheduleConstraintsDataElementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PowerSequenceScheduleConstraintsDataElementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sequenceId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="earliestStartTime" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="latestStartTime" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="earliestEndTime" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="latestEndTime" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="optionalSequence" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PowerSequenceScheduleConstraintsDataElementsType", propOrder = {
    "sequenceId",
    "earliestStartTime",
    "latestStartTime",
    "earliestEndTime",
    "latestEndTime",
    "optionalSequence"
})
@XmlSeeAlso({
    org.openmuc.jeebus.spine.xsd.v1.SmartEnergyManagementPsPowerSequenceElementsType.ScheduleConstraints.class
})
public class PowerSequenceScheduleConstraintsDataElementsType implements Cloneable, CopyTo, ToString
{

    protected ElementTagType sequenceId;
    protected ElementTagType earliestStartTime;
    protected ElementTagType latestStartTime;
    protected ElementTagType earliestEndTime;
    protected ElementTagType latestEndTime;
    protected ElementTagType optionalSequence;

    /**
     * Default no-arg constructor
     * 
     */
    public PowerSequenceScheduleConstraintsDataElementsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public PowerSequenceScheduleConstraintsDataElementsType(final ElementTagType sequenceId, final ElementTagType earliestStartTime, final ElementTagType latestStartTime, final ElementTagType earliestEndTime, final ElementTagType latestEndTime, final ElementTagType optionalSequence) {
        this.sequenceId = sequenceId;
        this.earliestStartTime = earliestStartTime;
        this.latestStartTime = latestStartTime;
        this.earliestEndTime = earliestEndTime;
        this.latestEndTime = latestEndTime;
        this.optionalSequence = optionalSequence;
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
     * Gets the value of the earliestStartTime property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getEarliestStartTime() {
        return earliestStartTime;
    }

    /**
     * Sets the value of the earliestStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setEarliestStartTime(ElementTagType value) {
        this.earliestStartTime = value;
    }

    /**
     * Gets the value of the latestStartTime property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getLatestStartTime() {
        return latestStartTime;
    }

    /**
     * Sets the value of the latestStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setLatestStartTime(ElementTagType value) {
        this.latestStartTime = value;
    }

    /**
     * Gets the value of the earliestEndTime property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getEarliestEndTime() {
        return earliestEndTime;
    }

    /**
     * Sets the value of the earliestEndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setEarliestEndTime(ElementTagType value) {
        this.earliestEndTime = value;
    }

    /**
     * Gets the value of the latestEndTime property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getLatestEndTime() {
        return latestEndTime;
    }

    /**
     * Sets the value of the latestEndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setLatestEndTime(ElementTagType value) {
        this.latestEndTime = value;
    }

    /**
     * Gets the value of the optionalSequence property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getOptionalSequence() {
        return optionalSequence;
    }

    /**
     * Sets the value of the optionalSequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setOptionalSequence(ElementTagType value) {
        this.optionalSequence = value;
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
    public PowerSequenceScheduleConstraintsDataElementsType withSequenceId(ElementTagType value) {
        setSequenceId(value);
        return this;
    }

    /**
     * Sets the value of the earliestStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public PowerSequenceScheduleConstraintsDataElementsType withEarliestStartTime(ElementTagType value) {
        setEarliestStartTime(value);
        return this;
    }

    /**
     * Sets the value of the latestStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public PowerSequenceScheduleConstraintsDataElementsType withLatestStartTime(ElementTagType value) {
        setLatestStartTime(value);
        return this;
    }

    /**
     * Sets the value of the earliestEndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public PowerSequenceScheduleConstraintsDataElementsType withEarliestEndTime(ElementTagType value) {
        setEarliestEndTime(value);
        return this;
    }

    /**
     * Sets the value of the latestEndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public PowerSequenceScheduleConstraintsDataElementsType withLatestEndTime(ElementTagType value) {
        setLatestEndTime(value);
        return this;
    }

    /**
     * Sets the value of the optionalSequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public PowerSequenceScheduleConstraintsDataElementsType withOptionalSequence(ElementTagType value) {
        setOptionalSequence(value);
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
        if (draftCopy instanceof PowerSequenceScheduleConstraintsDataElementsType) {
            final PowerSequenceScheduleConstraintsDataElementsType copy = ((PowerSequenceScheduleConstraintsDataElementsType) draftCopy);
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
                Boolean earliestStartTimeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.earliestStartTime!= null));
                if (earliestStartTimeShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceEarliestStartTime;
                    sourceEarliestStartTime = this.getEarliestStartTime();
                    ElementTagType copyEarliestStartTime = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "earliestStartTime", sourceEarliestStartTime), sourceEarliestStartTime, (this.earliestStartTime!= null)));
                    copy.setEarliestStartTime(copyEarliestStartTime);
                } else {
                    if (earliestStartTimeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.earliestStartTime = null;
                    }
                }
            }
            {
                Boolean latestStartTimeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.latestStartTime!= null));
                if (latestStartTimeShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceLatestStartTime;
                    sourceLatestStartTime = this.getLatestStartTime();
                    ElementTagType copyLatestStartTime = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "latestStartTime", sourceLatestStartTime), sourceLatestStartTime, (this.latestStartTime!= null)));
                    copy.setLatestStartTime(copyLatestStartTime);
                } else {
                    if (latestStartTimeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.latestStartTime = null;
                    }
                }
            }
            {
                Boolean earliestEndTimeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.earliestEndTime!= null));
                if (earliestEndTimeShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceEarliestEndTime;
                    sourceEarliestEndTime = this.getEarliestEndTime();
                    ElementTagType copyEarliestEndTime = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "earliestEndTime", sourceEarliestEndTime), sourceEarliestEndTime, (this.earliestEndTime!= null)));
                    copy.setEarliestEndTime(copyEarliestEndTime);
                } else {
                    if (earliestEndTimeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.earliestEndTime = null;
                    }
                }
            }
            {
                Boolean latestEndTimeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.latestEndTime!= null));
                if (latestEndTimeShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceLatestEndTime;
                    sourceLatestEndTime = this.getLatestEndTime();
                    ElementTagType copyLatestEndTime = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "latestEndTime", sourceLatestEndTime), sourceLatestEndTime, (this.latestEndTime!= null)));
                    copy.setLatestEndTime(copyLatestEndTime);
                } else {
                    if (latestEndTimeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.latestEndTime = null;
                    }
                }
            }
            {
                Boolean optionalSequenceShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.optionalSequence!= null));
                if (optionalSequenceShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceOptionalSequence;
                    sourceOptionalSequence = this.getOptionalSequence();
                    ElementTagType copyOptionalSequence = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "optionalSequence", sourceOptionalSequence), sourceOptionalSequence, (this.optionalSequence!= null)));
                    copy.setOptionalSequence(copyOptionalSequence);
                } else {
                    if (optionalSequenceShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.optionalSequence = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new PowerSequenceScheduleConstraintsDataElementsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final PowerSequenceScheduleConstraintsDataElementsType that = ((PowerSequenceScheduleConstraintsDataElementsType) object);
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
            ElementTagType leftEarliestStartTime;
            leftEarliestStartTime = this.getEarliestStartTime();
            ElementTagType rightEarliestStartTime;
            rightEarliestStartTime = that.getEarliestStartTime();
            if (this.earliestStartTime!= null) {
                if (that.earliestStartTime!= null) {
                    if (!leftEarliestStartTime.equals(rightEarliestStartTime)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.earliestStartTime!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftLatestStartTime;
            leftLatestStartTime = this.getLatestStartTime();
            ElementTagType rightLatestStartTime;
            rightLatestStartTime = that.getLatestStartTime();
            if (this.latestStartTime!= null) {
                if (that.latestStartTime!= null) {
                    if (!leftLatestStartTime.equals(rightLatestStartTime)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.latestStartTime!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftEarliestEndTime;
            leftEarliestEndTime = this.getEarliestEndTime();
            ElementTagType rightEarliestEndTime;
            rightEarliestEndTime = that.getEarliestEndTime();
            if (this.earliestEndTime!= null) {
                if (that.earliestEndTime!= null) {
                    if (!leftEarliestEndTime.equals(rightEarliestEndTime)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.earliestEndTime!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftLatestEndTime;
            leftLatestEndTime = this.getLatestEndTime();
            ElementTagType rightLatestEndTime;
            rightLatestEndTime = that.getLatestEndTime();
            if (this.latestEndTime!= null) {
                if (that.latestEndTime!= null) {
                    if (!leftLatestEndTime.equals(rightLatestEndTime)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.latestEndTime!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftOptionalSequence;
            leftOptionalSequence = this.getOptionalSequence();
            ElementTagType rightOptionalSequence;
            rightOptionalSequence = that.getOptionalSequence();
            if (this.optionalSequence!= null) {
                if (that.optionalSequence!= null) {
                    if (!leftOptionalSequence.equals(rightOptionalSequence)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.optionalSequence!= null) {
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
            ElementTagType theEarliestStartTime;
            theEarliestStartTime = this.getEarliestStartTime();
            if (this.earliestStartTime!= null) {
                currentHashCode += theEarliestStartTime.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theLatestStartTime;
            theLatestStartTime = this.getLatestStartTime();
            if (this.latestStartTime!= null) {
                currentHashCode += theLatestStartTime.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theEarliestEndTime;
            theEarliestEndTime = this.getEarliestEndTime();
            if (this.earliestEndTime!= null) {
                currentHashCode += theEarliestEndTime.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theLatestEndTime;
            theLatestEndTime = this.getLatestEndTime();
            if (this.latestEndTime!= null) {
                currentHashCode += theLatestEndTime.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theOptionalSequence;
            theOptionalSequence = this.getOptionalSequence();
            if (this.optionalSequence!= null) {
                currentHashCode += theOptionalSequence.hashCode();
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
            ElementTagType theEarliestStartTime;
            theEarliestStartTime = this.getEarliestStartTime();
            strategy.appendField(locator, this, "earliestStartTime", buffer, theEarliestStartTime, (this.earliestStartTime!= null));
        }
        {
            ElementTagType theLatestStartTime;
            theLatestStartTime = this.getLatestStartTime();
            strategy.appendField(locator, this, "latestStartTime", buffer, theLatestStartTime, (this.latestStartTime!= null));
        }
        {
            ElementTagType theEarliestEndTime;
            theEarliestEndTime = this.getEarliestEndTime();
            strategy.appendField(locator, this, "earliestEndTime", buffer, theEarliestEndTime, (this.earliestEndTime!= null));
        }
        {
            ElementTagType theLatestEndTime;
            theLatestEndTime = this.getLatestEndTime();
            strategy.appendField(locator, this, "latestEndTime", buffer, theLatestEndTime, (this.latestEndTime!= null));
        }
        {
            ElementTagType theOptionalSequence;
            theOptionalSequence = this.getOptionalSequence();
            strategy.appendField(locator, this, "optionalSequence", buffer, theOptionalSequence, (this.optionalSequence!= null));
        }
        return buffer;
    }

}
