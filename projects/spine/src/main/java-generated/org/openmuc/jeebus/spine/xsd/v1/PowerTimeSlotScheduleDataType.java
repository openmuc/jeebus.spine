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
 * <p>Java class for PowerTimeSlotScheduleDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PowerTimeSlotScheduleDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sequenceId" type="{http://docs.eebus.org/spine/xsd/v1}PowerSequenceIdType" minOccurs="0"/&gt;
 *         &lt;element name="slotNumber" type="{http://docs.eebus.org/spine/xsd/v1}PowerTimeSlotNumberType" minOccurs="0"/&gt;
 *         &lt;element name="timePeriod" type="{http://docs.eebus.org/spine/xsd/v1}TimePeriodType" minOccurs="0"/&gt;
 *         &lt;element name="defaultDuration" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *         &lt;element name="durationUncertainty" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *         &lt;element name="slotActivated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://docs.eebus.org/spine/xsd/v1}DescriptionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PowerTimeSlotScheduleDataType", propOrder = {
    "sequenceId",
    "slotNumber",
    "timePeriod",
    "defaultDuration",
    "durationUncertainty",
    "slotActivated",
    "description"
})
@XmlSeeAlso({
    org.openmuc.jeebus.spine.xsd.v1.SmartEnergyManagementPsPowerTimeSlotType.Schedule.class
})
public class PowerTimeSlotScheduleDataType implements Cloneable, CopyTo, ToString
{

    @XmlSchemaType(name = "unsignedInt")
    protected Long sequenceId;
    @XmlSchemaType(name = "unsignedInt")
    protected Long slotNumber;
    protected TimePeriodType timePeriod;
    protected Duration defaultDuration;
    protected Duration durationUncertainty;
    protected Boolean slotActivated;
    protected String description;

    /**
     * Default no-arg constructor
     * 
     */
    public PowerTimeSlotScheduleDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public PowerTimeSlotScheduleDataType(final Long sequenceId, final Long slotNumber, final TimePeriodType timePeriod, final Duration defaultDuration, final Duration durationUncertainty, final Boolean slotActivated, final String description) {
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
     * Gets the value of the slotNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSlotNumber() {
        return slotNumber;
    }

    /**
     * Sets the value of the slotNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSlotNumber(Long value) {
        this.slotNumber = value;
    }

    /**
     * Gets the value of the timePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodType }
     *     
     */
    public TimePeriodType getTimePeriod() {
        return timePeriod;
    }

    /**
     * Sets the value of the timePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodType }
     *     
     */
    public void setTimePeriod(TimePeriodType value) {
        this.timePeriod = value;
    }

    /**
     * Gets the value of the defaultDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getDefaultDuration() {
        return defaultDuration;
    }

    /**
     * Sets the value of the defaultDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setDefaultDuration(Duration value) {
        this.defaultDuration = value;
    }

    /**
     * Gets the value of the durationUncertainty property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getDurationUncertainty() {
        return durationUncertainty;
    }

    /**
     * Sets the value of the durationUncertainty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setDurationUncertainty(Duration value) {
        this.durationUncertainty = value;
    }

    /**
     * Gets the value of the slotActivated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getSlotActivated() {
        return slotActivated;
    }

    /**
     * Sets the value of the slotActivated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSlotActivated(Boolean value) {
        this.slotActivated = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
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
    public PowerTimeSlotScheduleDataType withSequenceId(Long value) {
        setSequenceId(value);
        return this;
    }

    /**
     * Sets the value of the slotNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     * @return
     *     The class instance
     */
    public PowerTimeSlotScheduleDataType withSlotNumber(Long value) {
        setSlotNumber(value);
        return this;
    }

    /**
     * Sets the value of the timePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodType }
     * @return
     *     The class instance
     */
    public PowerTimeSlotScheduleDataType withTimePeriod(TimePeriodType value) {
        setTimePeriod(value);
        return this;
    }

    /**
     * Sets the value of the defaultDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     * @return
     *     The class instance
     */
    public PowerTimeSlotScheduleDataType withDefaultDuration(Duration value) {
        setDefaultDuration(value);
        return this;
    }

    /**
     * Sets the value of the durationUncertainty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     * @return
     *     The class instance
     */
    public PowerTimeSlotScheduleDataType withDurationUncertainty(Duration value) {
        setDurationUncertainty(value);
        return this;
    }

    /**
     * Sets the value of the slotActivated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     * @return
     *     The class instance
     */
    public PowerTimeSlotScheduleDataType withSlotActivated(Boolean value) {
        setSlotActivated(value);
        return this;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public PowerTimeSlotScheduleDataType withDescription(String value) {
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
        if (draftCopy instanceof PowerTimeSlotScheduleDataType) {
            final PowerTimeSlotScheduleDataType copy = ((PowerTimeSlotScheduleDataType) draftCopy);
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
                Boolean slotNumberShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.slotNumber!= null));
                if (slotNumberShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceSlotNumber;
                    sourceSlotNumber = this.getSlotNumber();
                    Long copySlotNumber = ((Long) strategy.copy(LocatorUtils.property(locator, "slotNumber", sourceSlotNumber), sourceSlotNumber, (this.slotNumber!= null)));
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
                    TimePeriodType sourceTimePeriod;
                    sourceTimePeriod = this.getTimePeriod();
                    TimePeriodType copyTimePeriod = ((TimePeriodType) strategy.copy(LocatorUtils.property(locator, "timePeriod", sourceTimePeriod), sourceTimePeriod, (this.timePeriod!= null)));
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
                    Duration sourceDefaultDuration;
                    sourceDefaultDuration = this.getDefaultDuration();
                    Duration copyDefaultDuration = ((Duration) strategy.copy(LocatorUtils.property(locator, "defaultDuration", sourceDefaultDuration), sourceDefaultDuration, (this.defaultDuration!= null)));
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
                    Duration sourceDurationUncertainty;
                    sourceDurationUncertainty = this.getDurationUncertainty();
                    Duration copyDurationUncertainty = ((Duration) strategy.copy(LocatorUtils.property(locator, "durationUncertainty", sourceDurationUncertainty), sourceDurationUncertainty, (this.durationUncertainty!= null)));
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
                    Boolean sourceSlotActivated;
                    sourceSlotActivated = this.getSlotActivated();
                    Boolean copySlotActivated = ((Boolean) strategy.copy(LocatorUtils.property(locator, "slotActivated", sourceSlotActivated), sourceSlotActivated, (this.slotActivated!= null)));
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
                    String sourceDescription;
                    sourceDescription = this.getDescription();
                    String copyDescription = ((String) strategy.copy(LocatorUtils.property(locator, "description", sourceDescription), sourceDescription, (this.description!= null)));
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
        return new PowerTimeSlotScheduleDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final PowerTimeSlotScheduleDataType that = ((PowerTimeSlotScheduleDataType) object);
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
            Long leftSlotNumber;
            leftSlotNumber = this.getSlotNumber();
            Long rightSlotNumber;
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
            TimePeriodType leftTimePeriod;
            leftTimePeriod = this.getTimePeriod();
            TimePeriodType rightTimePeriod;
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
            Duration leftDefaultDuration;
            leftDefaultDuration = this.getDefaultDuration();
            Duration rightDefaultDuration;
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
            Duration leftDurationUncertainty;
            leftDurationUncertainty = this.getDurationUncertainty();
            Duration rightDurationUncertainty;
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
            Boolean leftSlotActivated;
            leftSlotActivated = this.getSlotActivated();
            Boolean rightSlotActivated;
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
            String leftDescription;
            leftDescription = this.getDescription();
            String rightDescription;
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
            Long theSequenceId;
            theSequenceId = this.getSequenceId();
            if (this.sequenceId!= null) {
                currentHashCode += theSequenceId.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            Long theSlotNumber;
            theSlotNumber = this.getSlotNumber();
            if (this.slotNumber!= null) {
                currentHashCode += theSlotNumber.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            TimePeriodType theTimePeriod;
            theTimePeriod = this.getTimePeriod();
            if (this.timePeriod!= null) {
                currentHashCode += theTimePeriod.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            Duration theDefaultDuration;
            theDefaultDuration = this.getDefaultDuration();
            if (this.defaultDuration!= null) {
                currentHashCode += theDefaultDuration.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            Duration theDurationUncertainty;
            theDurationUncertainty = this.getDurationUncertainty();
            if (this.durationUncertainty!= null) {
                currentHashCode += theDurationUncertainty.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            Boolean theSlotActivated;
            theSlotActivated = this.getSlotActivated();
            if (this.slotActivated!= null) {
                currentHashCode += theSlotActivated.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String theDescription;
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
            Long theSequenceId;
            theSequenceId = this.getSequenceId();
            strategy.appendField(locator, this, "sequenceId", buffer, theSequenceId, (this.sequenceId!= null));
        }
        {
            Long theSlotNumber;
            theSlotNumber = this.getSlotNumber();
            strategy.appendField(locator, this, "slotNumber", buffer, theSlotNumber, (this.slotNumber!= null));
        }
        {
            TimePeriodType theTimePeriod;
            theTimePeriod = this.getTimePeriod();
            strategy.appendField(locator, this, "timePeriod", buffer, theTimePeriod, (this.timePeriod!= null));
        }
        {
            Duration theDefaultDuration;
            theDefaultDuration = this.getDefaultDuration();
            strategy.appendField(locator, this, "defaultDuration", buffer, theDefaultDuration, (this.defaultDuration!= null));
        }
        {
            Duration theDurationUncertainty;
            theDurationUncertainty = this.getDurationUncertainty();
            strategy.appendField(locator, this, "durationUncertainty", buffer, theDurationUncertainty, (this.durationUncertainty!= null));
        }
        {
            Boolean theSlotActivated;
            theSlotActivated = this.getSlotActivated();
            strategy.appendField(locator, this, "slotActivated", buffer, theSlotActivated, (this.slotActivated!= null));
        }
        {
            String theDescription;
            theDescription = this.getDescription();
            strategy.appendField(locator, this, "description", buffer, theDescription, (this.description!= null));
        }
        return buffer;
    }

}
