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
 * <p>Java class for PowerTimeSlotScheduleDataElementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PowerTimeSlotScheduleDataElementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sequenceId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="slotNumber" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="timePeriod" type="{http://docs.eebus.org/spine/xsd/v1}TimePeriodElementsType" minOccurs="0"/&gt;
 *         &lt;element name="defaultDuration" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="durationUncertainty" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="slotActivated" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PowerTimeSlotScheduleDataElementsType", propOrder = {
    "sequenceId",
    "slotNumber",
    "timePeriod",
    "defaultDuration",
    "durationUncertainty",
    "slotActivated",
    "description"
})
@XmlSeeAlso({
    org.openmuc.jeebus.spine.xsd.v1.SmartEnergyManagementPsPowerTimeSlotElementsType.Schedule.class
})
public class PowerTimeSlotScheduleDataElementsType implements Cloneable, CopyTo, ToString
{

    protected ElementTagType sequenceId;
    protected ElementTagType slotNumber;
    protected TimePeriodElementsType timePeriod;
    protected ElementTagType defaultDuration;
    protected ElementTagType durationUncertainty;
    protected ElementTagType slotActivated;
    protected ElementTagType description;

    /**
     * Default no-arg constructor
     * 
     */
    public PowerTimeSlotScheduleDataElementsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public PowerTimeSlotScheduleDataElementsType(final ElementTagType sequenceId, final ElementTagType slotNumber, final TimePeriodElementsType timePeriod, final ElementTagType defaultDuration, final ElementTagType durationUncertainty, final ElementTagType slotActivated, final ElementTagType description) {
        this.sequenceId = sequenceId;
        this.slotNumber = slotNumber;
        this.timePeriod = timePeriod;
        this.defaultDuration = defaultDuration;
        this.durationUncertainty = durationUncertainty;
        this.slotActivated = slotActivated;
        this.description = description;
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
     * Gets the value of the slotNumber property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getSlotNumber() {
        return slotNumber;
    }

    /**
     * Sets the value of the slotNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setSlotNumber(ElementTagType value) {
        this.slotNumber = value;
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
     * Gets the value of the defaultDuration property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getDefaultDuration() {
        return defaultDuration;
    }

    /**
     * Sets the value of the defaultDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setDefaultDuration(ElementTagType value) {
        this.defaultDuration = value;
    }

    /**
     * Gets the value of the durationUncertainty property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getDurationUncertainty() {
        return durationUncertainty;
    }

    /**
     * Sets the value of the durationUncertainty property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setDurationUncertainty(ElementTagType value) {
        this.durationUncertainty = value;
    }

    /**
     * Gets the value of the slotActivated property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getSlotActivated() {
        return slotActivated;
    }

    /**
     * Sets the value of the slotActivated property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setSlotActivated(ElementTagType value) {
        this.slotActivated = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setDescription(ElementTagType value) {
        this.description = value;
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
    public PowerTimeSlotScheduleDataElementsType withSequenceId(ElementTagType value) {
        setSequenceId(value);
        return this;
    }

    /**
     * Sets the value of the slotNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public PowerTimeSlotScheduleDataElementsType withSlotNumber(ElementTagType value) {
        setSlotNumber(value);
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
    public PowerTimeSlotScheduleDataElementsType withTimePeriod(TimePeriodElementsType value) {
        setTimePeriod(value);
        return this;
    }

    /**
     * Sets the value of the defaultDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public PowerTimeSlotScheduleDataElementsType withDefaultDuration(ElementTagType value) {
        setDefaultDuration(value);
        return this;
    }

    /**
     * Sets the value of the durationUncertainty property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public PowerTimeSlotScheduleDataElementsType withDurationUncertainty(ElementTagType value) {
        setDurationUncertainty(value);
        return this;
    }

    /**
     * Sets the value of the slotActivated property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public PowerTimeSlotScheduleDataElementsType withSlotActivated(ElementTagType value) {
        setSlotActivated(value);
        return this;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public PowerTimeSlotScheduleDataElementsType withDescription(ElementTagType value) {
        setDescription(value);
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
        if (draftCopy instanceof PowerTimeSlotScheduleDataElementsType) {
            final PowerTimeSlotScheduleDataElementsType copy = ((PowerTimeSlotScheduleDataElementsType) draftCopy);
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
                Boolean slotNumberShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.slotNumber!= null));
                if (slotNumberShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceSlotNumber;
                    sourceSlotNumber = this.getSlotNumber();
                    ElementTagType copySlotNumber = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "slotNumber", sourceSlotNumber), sourceSlotNumber, (this.slotNumber!= null)));
                    copy.setSlotNumber(copySlotNumber);
                } else {
                    if (slotNumberShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.slotNumber = null;
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
                Boolean defaultDurationShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.defaultDuration!= null));
                if (defaultDurationShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceDefaultDuration;
                    sourceDefaultDuration = this.getDefaultDuration();
                    ElementTagType copyDefaultDuration = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "defaultDuration", sourceDefaultDuration), sourceDefaultDuration, (this.defaultDuration!= null)));
                    copy.setDefaultDuration(copyDefaultDuration);
                } else {
                    if (defaultDurationShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.defaultDuration = null;
                    }
                }
            }
            {
                Boolean durationUncertaintyShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.durationUncertainty!= null));
                if (durationUncertaintyShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceDurationUncertainty;
                    sourceDurationUncertainty = this.getDurationUncertainty();
                    ElementTagType copyDurationUncertainty = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "durationUncertainty", sourceDurationUncertainty), sourceDurationUncertainty, (this.durationUncertainty!= null)));
                    copy.setDurationUncertainty(copyDurationUncertainty);
                } else {
                    if (durationUncertaintyShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.durationUncertainty = null;
                    }
                }
            }
            {
                Boolean slotActivatedShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.slotActivated!= null));
                if (slotActivatedShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceSlotActivated;
                    sourceSlotActivated = this.getSlotActivated();
                    ElementTagType copySlotActivated = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "slotActivated", sourceSlotActivated), sourceSlotActivated, (this.slotActivated!= null)));
                    copy.setSlotActivated(copySlotActivated);
                } else {
                    if (slotActivatedShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.slotActivated = null;
                    }
                }
            }
            {
                Boolean descriptionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.description!= null));
                if (descriptionShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceDescription;
                    sourceDescription = this.getDescription();
                    ElementTagType copyDescription = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "description", sourceDescription), sourceDescription, (this.description!= null)));
                    copy.setDescription(copyDescription);
                } else {
                    if (descriptionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.description = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new PowerTimeSlotScheduleDataElementsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final PowerTimeSlotScheduleDataElementsType that = ((PowerTimeSlotScheduleDataElementsType) object);
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
            ElementTagType leftSlotNumber;
            leftSlotNumber = this.getSlotNumber();
            ElementTagType rightSlotNumber;
            rightSlotNumber = that.getSlotNumber();
            if (this.slotNumber!= null) {
                if (that.slotNumber!= null) {
                    if (!leftSlotNumber.equals(rightSlotNumber)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.slotNumber!= null) {
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
            ElementTagType leftDefaultDuration;
            leftDefaultDuration = this.getDefaultDuration();
            ElementTagType rightDefaultDuration;
            rightDefaultDuration = that.getDefaultDuration();
            if (this.defaultDuration!= null) {
                if (that.defaultDuration!= null) {
                    if (!leftDefaultDuration.equals(rightDefaultDuration)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.defaultDuration!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftDurationUncertainty;
            leftDurationUncertainty = this.getDurationUncertainty();
            ElementTagType rightDurationUncertainty;
            rightDurationUncertainty = that.getDurationUncertainty();
            if (this.durationUncertainty!= null) {
                if (that.durationUncertainty!= null) {
                    if (!leftDurationUncertainty.equals(rightDurationUncertainty)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.durationUncertainty!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftSlotActivated;
            leftSlotActivated = this.getSlotActivated();
            ElementTagType rightSlotActivated;
            rightSlotActivated = that.getSlotActivated();
            if (this.slotActivated!= null) {
                if (that.slotActivated!= null) {
                    if (!leftSlotActivated.equals(rightSlotActivated)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.slotActivated!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftDescription;
            leftDescription = this.getDescription();
            ElementTagType rightDescription;
            rightDescription = that.getDescription();
            if (this.description!= null) {
                if (that.description!= null) {
                    if (!leftDescription.equals(rightDescription)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.description!= null) {
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
            ElementTagType theSlotNumber;
            theSlotNumber = this.getSlotNumber();
            if (this.slotNumber!= null) {
                currentHashCode += theSlotNumber.hashCode();
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
            ElementTagType theDefaultDuration;
            theDefaultDuration = this.getDefaultDuration();
            if (this.defaultDuration!= null) {
                currentHashCode += theDefaultDuration.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theDurationUncertainty;
            theDurationUncertainty = this.getDurationUncertainty();
            if (this.durationUncertainty!= null) {
                currentHashCode += theDurationUncertainty.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theSlotActivated;
            theSlotActivated = this.getSlotActivated();
            if (this.slotActivated!= null) {
                currentHashCode += theSlotActivated.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theDescription;
            theDescription = this.getDescription();
            if (this.description!= null) {
                currentHashCode += theDescription.hashCode();
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
            ElementTagType theSlotNumber;
            theSlotNumber = this.getSlotNumber();
            strategy.appendField(locator, this, "slotNumber", buffer, theSlotNumber, (this.slotNumber!= null));
        }
        {
            TimePeriodElementsType theTimePeriod;
            theTimePeriod = this.getTimePeriod();
            strategy.appendField(locator, this, "timePeriod", buffer, theTimePeriod, (this.timePeriod!= null));
        }
        {
            ElementTagType theDefaultDuration;
            theDefaultDuration = this.getDefaultDuration();
            strategy.appendField(locator, this, "defaultDuration", buffer, theDefaultDuration, (this.defaultDuration!= null));
        }
        {
            ElementTagType theDurationUncertainty;
            theDurationUncertainty = this.getDurationUncertainty();
            strategy.appendField(locator, this, "durationUncertainty", buffer, theDurationUncertainty, (this.durationUncertainty!= null));
        }
        {
            ElementTagType theSlotActivated;
            theSlotActivated = this.getSlotActivated();
            strategy.appendField(locator, this, "slotActivated", buffer, theSlotActivated, (this.slotActivated!= null));
        }
        {
            ElementTagType theDescription;
            theDescription = this.getDescription();
            strategy.appendField(locator, this, "description", buffer, theDescription, (this.description!= null));
        }
        return buffer;
    }

}
