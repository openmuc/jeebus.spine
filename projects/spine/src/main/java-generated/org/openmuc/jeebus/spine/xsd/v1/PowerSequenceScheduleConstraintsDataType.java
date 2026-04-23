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
 * <p>Java class for PowerSequenceScheduleConstraintsDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PowerSequenceScheduleConstraintsDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sequenceId" type="{http://docs.eebus.org/spine/xsd/v1}PowerSequenceIdType" minOccurs="0"/&gt;
 *         &lt;element name="earliestStartTime" type="{http://docs.eebus.org/spine/xsd/v1}AbsoluteOrRelativeTimeType" minOccurs="0"/&gt;
 *         &lt;element name="latestStartTime" type="{http://docs.eebus.org/spine/xsd/v1}AbsoluteOrRelativeTimeType" minOccurs="0"/&gt;
 *         &lt;element name="earliestEndTime" type="{http://docs.eebus.org/spine/xsd/v1}AbsoluteOrRelativeTimeType" minOccurs="0"/&gt;
 *         &lt;element name="latestEndTime" type="{http://docs.eebus.org/spine/xsd/v1}AbsoluteOrRelativeTimeType" minOccurs="0"/&gt;
 *         &lt;element name="optionalSequence" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PowerSequenceScheduleConstraintsDataType", propOrder = {
    "sequenceId",
    "earliestStartTime",
    "latestStartTime",
    "earliestEndTime",
    "latestEndTime",
    "optionalSequence"
})
@XmlSeeAlso({
    org.openmuc.jeebus.spine.xsd.v1.SmartEnergyManagementPsPowerSequenceType.ScheduleConstraints.class
})
public class PowerSequenceScheduleConstraintsDataType implements Cloneable, CopyTo, ToString
{

    @XmlSchemaType(name = "unsignedInt")
    protected Long sequenceId;
    protected String earliestStartTime;
    protected String latestStartTime;
    protected String earliestEndTime;
    protected String latestEndTime;
    protected Boolean optionalSequence;

    /**
     * Default no-arg constructor
     * 
     */
    public PowerSequenceScheduleConstraintsDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public PowerSequenceScheduleConstraintsDataType(final Long sequenceId, final String earliestStartTime, final String latestStartTime, final String earliestEndTime, final String latestEndTime, final Boolean optionalSequence) {
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
     * Gets the value of the latestStartTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLatestStartTime() {
        return latestStartTime;
    }

    /**
     * Sets the value of the latestStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatestStartTime(String value) {
        this.latestStartTime = value;
    }

    /**
     * Gets the value of the earliestEndTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEarliestEndTime() {
        return earliestEndTime;
    }

    /**
     * Sets the value of the earliestEndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEarliestEndTime(String value) {
        this.earliestEndTime = value;
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
     * Gets the value of the optionalSequence property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getOptionalSequence() {
        return optionalSequence;
    }

    /**
     * Sets the value of the optionalSequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOptionalSequence(Boolean value) {
        this.optionalSequence = value;
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
    public PowerSequenceScheduleConstraintsDataType withSequenceId(Long value) {
        setSequenceId(value);
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
    public PowerSequenceScheduleConstraintsDataType withEarliestStartTime(String value) {
        setEarliestStartTime(value);
        return this;
    }

    /**
     * Sets the value of the latestStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public PowerSequenceScheduleConstraintsDataType withLatestStartTime(String value) {
        setLatestStartTime(value);
        return this;
    }

    /**
     * Sets the value of the earliestEndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public PowerSequenceScheduleConstraintsDataType withEarliestEndTime(String value) {
        setEarliestEndTime(value);
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
    public PowerSequenceScheduleConstraintsDataType withLatestEndTime(String value) {
        setLatestEndTime(value);
        return this;
    }

    /**
     * Sets the value of the optionalSequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     * @return
     *     The class instance
     */
    public PowerSequenceScheduleConstraintsDataType withOptionalSequence(Boolean value) {
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
        if (draftCopy instanceof PowerSequenceScheduleConstraintsDataType) {
            final PowerSequenceScheduleConstraintsDataType copy = ((PowerSequenceScheduleConstraintsDataType) draftCopy);
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
                Boolean latestStartTimeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.latestStartTime!= null));
                if (latestStartTimeShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceLatestStartTime;
                    sourceLatestStartTime = this.getLatestStartTime();
                    String copyLatestStartTime = ((String) strategy.copy(LocatorUtils.property(locator, "latestStartTime", sourceLatestStartTime), sourceLatestStartTime, (this.latestStartTime!= null)));
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
                    String sourceEarliestEndTime;
                    sourceEarliestEndTime = this.getEarliestEndTime();
                    String copyEarliestEndTime = ((String) strategy.copy(LocatorUtils.property(locator, "earliestEndTime", sourceEarliestEndTime), sourceEarliestEndTime, (this.earliestEndTime!= null)));
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
                Boolean optionalSequenceShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.optionalSequence!= null));
                if (optionalSequenceShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceOptionalSequence;
                    sourceOptionalSequence = this.getOptionalSequence();
                    Boolean copyOptionalSequence = ((Boolean) strategy.copy(LocatorUtils.property(locator, "optionalSequence", sourceOptionalSequence), sourceOptionalSequence, (this.optionalSequence!= null)));
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
        return new PowerSequenceScheduleConstraintsDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final PowerSequenceScheduleConstraintsDataType that = ((PowerSequenceScheduleConstraintsDataType) object);
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
            String leftLatestStartTime;
            leftLatestStartTime = this.getLatestStartTime();
            String rightLatestStartTime;
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
            String leftEarliestEndTime;
            leftEarliestEndTime = this.getEarliestEndTime();
            String rightEarliestEndTime;
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
            Boolean leftOptionalSequence;
            leftOptionalSequence = this.getOptionalSequence();
            Boolean rightOptionalSequence;
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
            Long theSequenceId;
            theSequenceId = this.getSequenceId();
            if (this.sequenceId!= null) {
                currentHashCode += theSequenceId.hashCode();
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
            String theLatestStartTime;
            theLatestStartTime = this.getLatestStartTime();
            if (this.latestStartTime!= null) {
                currentHashCode += theLatestStartTime.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String theEarliestEndTime;
            theEarliestEndTime = this.getEarliestEndTime();
            if (this.earliestEndTime!= null) {
                currentHashCode += theEarliestEndTime.hashCode();
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
            Boolean theOptionalSequence;
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
            Long theSequenceId;
            theSequenceId = this.getSequenceId();
            strategy.appendField(locator, this, "sequenceId", buffer, theSequenceId, (this.sequenceId!= null));
        }
        {
            String theEarliestStartTime;
            theEarliestStartTime = this.getEarliestStartTime();
            strategy.appendField(locator, this, "earliestStartTime", buffer, theEarliestStartTime, (this.earliestStartTime!= null));
        }
        {
            String theLatestStartTime;
            theLatestStartTime = this.getLatestStartTime();
            strategy.appendField(locator, this, "latestStartTime", buffer, theLatestStartTime, (this.latestStartTime!= null));
        }
        {
            String theEarliestEndTime;
            theEarliestEndTime = this.getEarliestEndTime();
            strategy.appendField(locator, this, "earliestEndTime", buffer, theEarliestEndTime, (this.earliestEndTime!= null));
        }
        {
            String theLatestEndTime;
            theLatestEndTime = this.getLatestEndTime();
            strategy.appendField(locator, this, "latestEndTime", buffer, theLatestEndTime, (this.latestEndTime!= null));
        }
        {
            Boolean theOptionalSequence;
            theOptionalSequence = this.getOptionalSequence();
            strategy.appendField(locator, this, "optionalSequence", buffer, theOptionalSequence, (this.optionalSequence!= null));
        }
        return buffer;
    }

}
