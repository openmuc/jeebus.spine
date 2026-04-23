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
 * <p>Java class for PowerTimeSlotScheduleConstraintsDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PowerTimeSlotScheduleConstraintsDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sequenceId" type="{http://docs.eebus.org/spine/xsd/v1}PowerSequenceIdType" minOccurs="0"/&gt;
 *         &lt;element name="slotNumber" type="{http://docs.eebus.org/spine/xsd/v1}PowerTimeSlotNumberType" minOccurs="0"/&gt;
 *         &lt;element name="earliestStartTime" type="{http://docs.eebus.org/spine/xsd/v1}AbsoluteOrRelativeTimeType" minOccurs="0"/&gt;
 *         &lt;element name="latestEndTime" type="{http://docs.eebus.org/spine/xsd/v1}AbsoluteOrRelativeTimeType" minOccurs="0"/&gt;
 *         &lt;element name="minDuration" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *         &lt;element name="maxDuration" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *         &lt;element name="optionalSlot" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PowerTimeSlotScheduleConstraintsDataType", propOrder = {
    "sequenceId",
    "slotNumber",
    "earliestStartTime",
    "latestEndTime",
    "minDuration",
    "maxDuration",
    "optionalSlot"
})
@XmlSeeAlso({
    org.openmuc.jeebus.spine.xsd.v1.SmartEnergyManagementPsPowerTimeSlotType.ScheduleConstraints.class
})
public class PowerTimeSlotScheduleConstraintsDataType implements Cloneable, CopyTo, ToString
{

    @XmlSchemaType(name = "unsignedInt")
    protected Long sequenceId;
    @XmlSchemaType(name = "unsignedInt")
    protected Long slotNumber;
    protected String earliestStartTime;
    protected String latestEndTime;
    protected Duration minDuration;
    protected Duration maxDuration;
    protected Boolean optionalSlot;

    /**
     * Default no-arg constructor
     * 
     */
    public PowerTimeSlotScheduleConstraintsDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public PowerTimeSlotScheduleConstraintsDataType(final Long sequenceId, final Long slotNumber, final String earliestStartTime, final String latestEndTime, final Duration minDuration, final Duration maxDuration, final Boolean optionalSlot) {
        this.sequenceId = sequenceId;
        this.slotNumber = slotNumber;
        this.earliestStartTime = earliestStartTime;
        this.latestEndTime = latestEndTime;
        this.minDuration = minDuration;
        this.maxDuration = maxDuration;
        this.optionalSlot = optionalSlot;
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
     * Gets the value of the earliestStartTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEarliestStartTime() {
        return earliestStartTime;
    }

    /**
     * Sets the value of the earliestStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEarliestStartTime(String value) {
        this.earliestStartTime = value;
    }

    /**
     * Gets the value of the latestEndTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLatestEndTime() {
        return latestEndTime;
    }

    /**
     * Sets the value of the latestEndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatestEndTime(String value) {
        this.latestEndTime = value;
    }

    /**
     * Gets the value of the minDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMinDuration() {
        return minDuration;
    }

    /**
     * Sets the value of the minDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setMinDuration(Duration value) {
        this.minDuration = value;
    }

    /**
     * Gets the value of the maxDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMaxDuration() {
        return maxDuration;
    }

    /**
     * Sets the value of the maxDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setMaxDuration(Duration value) {
        this.maxDuration = value;
    }

    /**
     * Gets the value of the optionalSlot property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getOptionalSlot() {
        return optionalSlot;
    }

    /**
     * Sets the value of the optionalSlot property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOptionalSlot(Boolean value) {
        this.optionalSlot = value;
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
    public PowerTimeSlotScheduleConstraintsDataType withSequenceId(Long value) {
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
    public PowerTimeSlotScheduleConstraintsDataType withSlotNumber(Long value) {
        setSlotNumber(value);
        return this;
    }

    /**
     * Sets the value of the earliestStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public PowerTimeSlotScheduleConstraintsDataType withEarliestStartTime(String value) {
        setEarliestStartTime(value);
        return this;
    }

    /**
     * Sets the value of the latestEndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public PowerTimeSlotScheduleConstraintsDataType withLatestEndTime(String value) {
        setLatestEndTime(value);
        return this;
    }

    /**
     * Sets the value of the minDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     * @return
     *     The class instance
     */
    public PowerTimeSlotScheduleConstraintsDataType withMinDuration(Duration value) {
        setMinDuration(value);
        return this;
    }

    /**
     * Sets the value of the maxDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     * @return
     *     The class instance
     */
    public PowerTimeSlotScheduleConstraintsDataType withMaxDuration(Duration value) {
        setMaxDuration(value);
        return this;
    }

    /**
     * Sets the value of the optionalSlot property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     * @return
     *     The class instance
     */
    public PowerTimeSlotScheduleConstraintsDataType withOptionalSlot(Boolean value) {
        setOptionalSlot(value);
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
        if (draftCopy instanceof PowerTimeSlotScheduleConstraintsDataType) {
            final PowerTimeSlotScheduleConstraintsDataType copy = ((PowerTimeSlotScheduleConstraintsDataType) draftCopy);
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
                Boolean earliestStartTimeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.earliestStartTime!= null));
                if (earliestStartTimeShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceEarliestStartTime;
                    sourceEarliestStartTime = this.getEarliestStartTime();
                    String copyEarliestStartTime = ((String) strategy.copy(LocatorUtils.property(locator, "earliestStartTime", sourceEarliestStartTime), sourceEarliestStartTime, (this.earliestStartTime!= null)));
                    copy.setEarliestStartTime(copyEarliestStartTime);
                } else {
                    if (earliestStartTimeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.earliestStartTime = null;
                    }
                }
            }
            {
                Boolean latestEndTimeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.latestEndTime!= null));
                if (latestEndTimeShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceLatestEndTime;
                    sourceLatestEndTime = this.getLatestEndTime();
                    String copyLatestEndTime = ((String) strategy.copy(LocatorUtils.property(locator, "latestEndTime", sourceLatestEndTime), sourceLatestEndTime, (this.latestEndTime!= null)));
                    copy.setLatestEndTime(copyLatestEndTime);
                } else {
                    if (latestEndTimeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.latestEndTime = null;
                    }
                }
            }
            {
                Boolean minDurationShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.minDuration!= null));
                if (minDurationShouldBeCopiedAndSet == Boolean.TRUE) {
                    Duration sourceMinDuration;
                    sourceMinDuration = this.getMinDuration();
                    Duration copyMinDuration = ((Duration) strategy.copy(LocatorUtils.property(locator, "minDuration", sourceMinDuration), sourceMinDuration, (this.minDuration!= null)));
                    copy.setMinDuration(copyMinDuration);
                } else {
                    if (minDurationShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.minDuration = null;
                    }
                }
            }
            {
                Boolean maxDurationShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.maxDuration!= null));
                if (maxDurationShouldBeCopiedAndSet == Boolean.TRUE) {
                    Duration sourceMaxDuration;
                    sourceMaxDuration = this.getMaxDuration();
                    Duration copyMaxDuration = ((Duration) strategy.copy(LocatorUtils.property(locator, "maxDuration", sourceMaxDuration), sourceMaxDuration, (this.maxDuration!= null)));
                    copy.setMaxDuration(copyMaxDuration);
                } else {
                    if (maxDurationShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.maxDuration = null;
                    }
                }
            }
            {
                Boolean optionalSlotShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.optionalSlot!= null));
                if (optionalSlotShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceOptionalSlot;
                    sourceOptionalSlot = this.getOptionalSlot();
                    Boolean copyOptionalSlot = ((Boolean) strategy.copy(LocatorUtils.property(locator, "optionalSlot", sourceOptionalSlot), sourceOptionalSlot, (this.optionalSlot!= null)));
                    copy.setOptionalSlot(copyOptionalSlot);
                } else {
                    if (optionalSlotShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.optionalSlot = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new PowerTimeSlotScheduleConstraintsDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final PowerTimeSlotScheduleConstraintsDataType that = ((PowerTimeSlotScheduleConstraintsDataType) object);
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
            String leftEarliestStartTime;
            leftEarliestStartTime = this.getEarliestStartTime();
            String rightEarliestStartTime;
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
            String leftLatestEndTime;
            leftLatestEndTime = this.getLatestEndTime();
            String rightLatestEndTime;
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
            Duration leftMinDuration;
            leftMinDuration = this.getMinDuration();
            Duration rightMinDuration;
            rightMinDuration = that.getMinDuration();
            if (this.minDuration!= null) {
                if (that.minDuration!= null) {
                    if (!leftMinDuration.equals(rightMinDuration)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.minDuration!= null) {
                    return false;
                }
            }
        }
        {
            Duration leftMaxDuration;
            leftMaxDuration = this.getMaxDuration();
            Duration rightMaxDuration;
            rightMaxDuration = that.getMaxDuration();
            if (this.maxDuration!= null) {
                if (that.maxDuration!= null) {
                    if (!leftMaxDuration.equals(rightMaxDuration)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.maxDuration!= null) {
                    return false;
                }
            }
        }
        {
            Boolean leftOptionalSlot;
            leftOptionalSlot = this.getOptionalSlot();
            Boolean rightOptionalSlot;
            rightOptionalSlot = that.getOptionalSlot();
            if (this.optionalSlot!= null) {
                if (that.optionalSlot!= null) {
                    if (!leftOptionalSlot.equals(rightOptionalSlot)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.optionalSlot!= null) {
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
            String theEarliestStartTime;
            theEarliestStartTime = this.getEarliestStartTime();
            if (this.earliestStartTime!= null) {
                currentHashCode += theEarliestStartTime.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String theLatestEndTime;
            theLatestEndTime = this.getLatestEndTime();
            if (this.latestEndTime!= null) {
                currentHashCode += theLatestEndTime.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            Duration theMinDuration;
            theMinDuration = this.getMinDuration();
            if (this.minDuration!= null) {
                currentHashCode += theMinDuration.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            Duration theMaxDuration;
            theMaxDuration = this.getMaxDuration();
            if (this.maxDuration!= null) {
                currentHashCode += theMaxDuration.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            Boolean theOptionalSlot;
            theOptionalSlot = this.getOptionalSlot();
            if (this.optionalSlot!= null) {
                currentHashCode += theOptionalSlot.hashCode();
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
            String theEarliestStartTime;
            theEarliestStartTime = this.getEarliestStartTime();
            strategy.appendField(locator, this, "earliestStartTime", buffer, theEarliestStartTime, (this.earliestStartTime!= null));
        }
        {
            String theLatestEndTime;
            theLatestEndTime = this.getLatestEndTime();
            strategy.appendField(locator, this, "latestEndTime", buffer, theLatestEndTime, (this.latestEndTime!= null));
        }
        {
            Duration theMinDuration;
            theMinDuration = this.getMinDuration();
            strategy.appendField(locator, this, "minDuration", buffer, theMinDuration, (this.minDuration!= null));
        }
        {
            Duration theMaxDuration;
            theMaxDuration = this.getMaxDuration();
            strategy.appendField(locator, this, "maxDuration", buffer, theMaxDuration, (this.maxDuration!= null));
        }
        {
            Boolean theOptionalSlot;
            theOptionalSlot = this.getOptionalSlot();
            strategy.appendField(locator, this, "optionalSlot", buffer, theOptionalSlot, (this.optionalSlot!= null));
        }
        return buffer;
    }

}
