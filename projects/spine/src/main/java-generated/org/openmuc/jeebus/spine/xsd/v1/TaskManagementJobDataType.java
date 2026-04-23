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
 * <p>Java class for TaskManagementJobDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaskManagementJobDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="jobId" type="{http://docs.eebus.org/spine/xsd/v1}TaskManagementJobIdType" minOccurs="0"/&gt;
 *         &lt;element name="timestamp" type="{http://docs.eebus.org/spine/xsd/v1}AbsoluteOrRelativeTimeType" minOccurs="0"/&gt;
 *         &lt;element name="jobState" type="{http://docs.eebus.org/spine/xsd/v1}TaskManagementJobStateType" minOccurs="0"/&gt;
 *         &lt;element name="elapsedTime" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *         &lt;element name="remainingTime" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaskManagementJobDataType", propOrder = {
    "jobId",
    "timestamp",
    "jobState",
    "elapsedTime",
    "remainingTime"
})
public class TaskManagementJobDataType implements Cloneable, CopyTo, ToString
{

    @XmlSchemaType(name = "unsignedInt")
    protected Long jobId;
    protected String timestamp;
    protected String jobState;
    protected Duration elapsedTime;
    protected Duration remainingTime;

    /**
     * Default no-arg constructor
     * 
     */
    public TaskManagementJobDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public TaskManagementJobDataType(final Long jobId, final String timestamp, final String jobState, final Duration elapsedTime, final Duration remainingTime) {
        this.jobId = jobId;
        this.timestamp = timestamp;
        this.jobState = jobState;
        this.elapsedTime = elapsedTime;
        this.remainingTime = remainingTime;
    }

    /**
     * Gets the value of the jobId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getJobId() {
        return jobId;
    }

    /**
     * Sets the value of the jobId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setJobId(Long value) {
        this.jobId = value;
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
     * Gets the value of the jobState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobState() {
        return jobState;
    }

    /**
     * Sets the value of the jobState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobState(String value) {
        this.jobState = value;
    }

    /**
     * Gets the value of the elapsedTime property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getElapsedTime() {
        return elapsedTime;
    }

    /**
     * Sets the value of the elapsedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setElapsedTime(Duration value) {
        this.elapsedTime = value;
    }

    /**
     * Gets the value of the remainingTime property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getRemainingTime() {
        return remainingTime;
    }

    /**
     * Sets the value of the remainingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setRemainingTime(Duration value) {
        this.remainingTime = value;
    }

    /**
     * Sets the value of the jobId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     * @return
     *     The class instance
     */
    public TaskManagementJobDataType withJobId(Long value) {
        setJobId(value);
        return this;
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
    public TaskManagementJobDataType withTimestamp(String value) {
        setTimestamp(value);
        return this;
    }

    /**
     * Sets the value of the jobState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public TaskManagementJobDataType withJobState(String value) {
        setJobState(value);
        return this;
    }

    /**
     * Sets the value of the elapsedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     * @return
     *     The class instance
     */
    public TaskManagementJobDataType withElapsedTime(Duration value) {
        setElapsedTime(value);
        return this;
    }

    /**
     * Sets the value of the remainingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     * @return
     *     The class instance
     */
    public TaskManagementJobDataType withRemainingTime(Duration value) {
        setRemainingTime(value);
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
        if (draftCopy instanceof TaskManagementJobDataType) {
            final TaskManagementJobDataType copy = ((TaskManagementJobDataType) draftCopy);
            {
                Boolean jobIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.jobId!= null));
                if (jobIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceJobId;
                    sourceJobId = this.getJobId();
                    Long copyJobId = ((Long) strategy.copy(LocatorUtils.property(locator, "jobId", sourceJobId), sourceJobId, (this.jobId!= null)));
                    copy.setJobId(copyJobId);
                } else {
                    if (jobIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.jobId = null;
                    }
                }
            }
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
                Boolean jobStateShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.jobState!= null));
                if (jobStateShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceJobState;
                    sourceJobState = this.getJobState();
                    String copyJobState = ((String) strategy.copy(LocatorUtils.property(locator, "jobState", sourceJobState), sourceJobState, (this.jobState!= null)));
                    copy.setJobState(copyJobState);
                } else {
                    if (jobStateShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.jobState = null;
                    }
                }
            }
            {
                Boolean elapsedTimeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.elapsedTime!= null));
                if (elapsedTimeShouldBeCopiedAndSet == Boolean.TRUE) {
                    Duration sourceElapsedTime;
                    sourceElapsedTime = this.getElapsedTime();
                    Duration copyElapsedTime = ((Duration) strategy.copy(LocatorUtils.property(locator, "elapsedTime", sourceElapsedTime), sourceElapsedTime, (this.elapsedTime!= null)));
                    copy.setElapsedTime(copyElapsedTime);
                } else {
                    if (elapsedTimeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.elapsedTime = null;
                    }
                }
            }
            {
                Boolean remainingTimeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.remainingTime!= null));
                if (remainingTimeShouldBeCopiedAndSet == Boolean.TRUE) {
                    Duration sourceRemainingTime;
                    sourceRemainingTime = this.getRemainingTime();
                    Duration copyRemainingTime = ((Duration) strategy.copy(LocatorUtils.property(locator, "remainingTime", sourceRemainingTime), sourceRemainingTime, (this.remainingTime!= null)));
                    copy.setRemainingTime(copyRemainingTime);
                } else {
                    if (remainingTimeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.remainingTime = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new TaskManagementJobDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TaskManagementJobDataType that = ((TaskManagementJobDataType) object);
        {
            Long leftJobId;
            leftJobId = this.getJobId();
            Long rightJobId;
            rightJobId = that.getJobId();
            if (this.jobId!= null) {
                if (that.jobId!= null) {
                    if (!leftJobId.equals(rightJobId)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.jobId!= null) {
                    return false;
                }
            }
        }
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
            String leftJobState;
            leftJobState = this.getJobState();
            String rightJobState;
            rightJobState = that.getJobState();
            if (this.jobState!= null) {
                if (that.jobState!= null) {
                    if (!leftJobState.equals(rightJobState)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.jobState!= null) {
                    return false;
                }
            }
        }
        {
            Duration leftElapsedTime;
            leftElapsedTime = this.getElapsedTime();
            Duration rightElapsedTime;
            rightElapsedTime = that.getElapsedTime();
            if (this.elapsedTime!= null) {
                if (that.elapsedTime!= null) {
                    if (!leftElapsedTime.equals(rightElapsedTime)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.elapsedTime!= null) {
                    return false;
                }
            }
        }
        {
            Duration leftRemainingTime;
            leftRemainingTime = this.getRemainingTime();
            Duration rightRemainingTime;
            rightRemainingTime = that.getRemainingTime();
            if (this.remainingTime!= null) {
                if (that.remainingTime!= null) {
                    if (!leftRemainingTime.equals(rightRemainingTime)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.remainingTime!= null) {
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
            Long theJobId;
            theJobId = this.getJobId();
            if (this.jobId!= null) {
                currentHashCode += theJobId.hashCode();
            }
        }
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
            String theJobState;
            theJobState = this.getJobState();
            if (this.jobState!= null) {
                currentHashCode += theJobState.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            Duration theElapsedTime;
            theElapsedTime = this.getElapsedTime();
            if (this.elapsedTime!= null) {
                currentHashCode += theElapsedTime.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            Duration theRemainingTime;
            theRemainingTime = this.getRemainingTime();
            if (this.remainingTime!= null) {
                currentHashCode += theRemainingTime.hashCode();
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
            Long theJobId;
            theJobId = this.getJobId();
            strategy.appendField(locator, this, "jobId", buffer, theJobId, (this.jobId!= null));
        }
        {
            String theTimestamp;
            theTimestamp = this.getTimestamp();
            strategy.appendField(locator, this, "timestamp", buffer, theTimestamp, (this.timestamp!= null));
        }
        {
            String theJobState;
            theJobState = this.getJobState();
            strategy.appendField(locator, this, "jobState", buffer, theJobState, (this.jobState!= null));
        }
        {
            Duration theElapsedTime;
            theElapsedTime = this.getElapsedTime();
            strategy.appendField(locator, this, "elapsedTime", buffer, theElapsedTime, (this.elapsedTime!= null));
        }
        {
            Duration theRemainingTime;
            theRemainingTime = this.getRemainingTime();
            strategy.appendField(locator, this, "remainingTime", buffer, theRemainingTime, (this.remainingTime!= null));
        }
        return buffer;
    }

}
