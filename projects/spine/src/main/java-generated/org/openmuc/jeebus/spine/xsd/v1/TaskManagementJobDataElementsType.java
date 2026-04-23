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
 * <p>Java class for TaskManagementJobDataElementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaskManagementJobDataElementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="jobId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="timestamp" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="jobState" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="elapsedTime" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="remainingTime" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaskManagementJobDataElementsType", propOrder = {
    "jobId",
    "timestamp",
    "jobState",
    "elapsedTime",
    "remainingTime"
})
public class TaskManagementJobDataElementsType implements Cloneable, CopyTo, ToString
{

    protected ElementTagType jobId;
    protected ElementTagType timestamp;
    protected ElementTagType jobState;
    protected ElementTagType elapsedTime;
    protected ElementTagType remainingTime;

    /**
     * Default no-arg constructor
     * 
     */
    public TaskManagementJobDataElementsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public TaskManagementJobDataElementsType(final ElementTagType jobId, final ElementTagType timestamp, final ElementTagType jobState, final ElementTagType elapsedTime, final ElementTagType remainingTime) {
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
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getJobId() {
        return jobId;
    }

    /**
     * Sets the value of the jobId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setJobId(ElementTagType value) {
        this.jobId = value;
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
     * Gets the value of the jobState property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getJobState() {
        return jobState;
    }

    /**
     * Sets the value of the jobState property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setJobState(ElementTagType value) {
        this.jobState = value;
    }

    /**
     * Gets the value of the elapsedTime property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getElapsedTime() {
        return elapsedTime;
    }

    /**
     * Sets the value of the elapsedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setElapsedTime(ElementTagType value) {
        this.elapsedTime = value;
    }

    /**
     * Gets the value of the remainingTime property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getRemainingTime() {
        return remainingTime;
    }

    /**
     * Sets the value of the remainingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setRemainingTime(ElementTagType value) {
        this.remainingTime = value;
    }

    /**
     * Sets the value of the jobId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public TaskManagementJobDataElementsType withJobId(ElementTagType value) {
        setJobId(value);
        return this;
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
    public TaskManagementJobDataElementsType withTimestamp(ElementTagType value) {
        setTimestamp(value);
        return this;
    }

    /**
     * Sets the value of the jobState property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public TaskManagementJobDataElementsType withJobState(ElementTagType value) {
        setJobState(value);
        return this;
    }

    /**
     * Sets the value of the elapsedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public TaskManagementJobDataElementsType withElapsedTime(ElementTagType value) {
        setElapsedTime(value);
        return this;
    }

    /**
     * Sets the value of the remainingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public TaskManagementJobDataElementsType withRemainingTime(ElementTagType value) {
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
        if (draftCopy instanceof TaskManagementJobDataElementsType) {
            final TaskManagementJobDataElementsType copy = ((TaskManagementJobDataElementsType) draftCopy);
            {
                Boolean jobIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.jobId!= null));
                if (jobIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceJobId;
                    sourceJobId = this.getJobId();
                    ElementTagType copyJobId = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "jobId", sourceJobId), sourceJobId, (this.jobId!= null)));
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
                Boolean jobStateShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.jobState!= null));
                if (jobStateShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceJobState;
                    sourceJobState = this.getJobState();
                    ElementTagType copyJobState = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "jobState", sourceJobState), sourceJobState, (this.jobState!= null)));
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
                    ElementTagType sourceElapsedTime;
                    sourceElapsedTime = this.getElapsedTime();
                    ElementTagType copyElapsedTime = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "elapsedTime", sourceElapsedTime), sourceElapsedTime, (this.elapsedTime!= null)));
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
                    ElementTagType sourceRemainingTime;
                    sourceRemainingTime = this.getRemainingTime();
                    ElementTagType copyRemainingTime = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "remainingTime", sourceRemainingTime), sourceRemainingTime, (this.remainingTime!= null)));
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
        return new TaskManagementJobDataElementsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TaskManagementJobDataElementsType that = ((TaskManagementJobDataElementsType) object);
        {
            ElementTagType leftJobId;
            leftJobId = this.getJobId();
            ElementTagType rightJobId;
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
            ElementTagType leftJobState;
            leftJobState = this.getJobState();
            ElementTagType rightJobState;
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
            ElementTagType leftElapsedTime;
            leftElapsedTime = this.getElapsedTime();
            ElementTagType rightElapsedTime;
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
            ElementTagType leftRemainingTime;
            leftRemainingTime = this.getRemainingTime();
            ElementTagType rightRemainingTime;
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
            ElementTagType theJobId;
            theJobId = this.getJobId();
            if (this.jobId!= null) {
                currentHashCode += theJobId.hashCode();
            }
        }
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
            ElementTagType theJobState;
            theJobState = this.getJobState();
            if (this.jobState!= null) {
                currentHashCode += theJobState.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theElapsedTime;
            theElapsedTime = this.getElapsedTime();
            if (this.elapsedTime!= null) {
                currentHashCode += theElapsedTime.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theRemainingTime;
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
            ElementTagType theJobId;
            theJobId = this.getJobId();
            strategy.appendField(locator, this, "jobId", buffer, theJobId, (this.jobId!= null));
        }
        {
            ElementTagType theTimestamp;
            theTimestamp = this.getTimestamp();
            strategy.appendField(locator, this, "timestamp", buffer, theTimestamp, (this.timestamp!= null));
        }
        {
            ElementTagType theJobState;
            theJobState = this.getJobState();
            strategy.appendField(locator, this, "jobState", buffer, theJobState, (this.jobState!= null));
        }
        {
            ElementTagType theElapsedTime;
            theElapsedTime = this.getElapsedTime();
            strategy.appendField(locator, this, "elapsedTime", buffer, theElapsedTime, (this.elapsedTime!= null));
        }
        {
            ElementTagType theRemainingTime;
            theRemainingTime = this.getRemainingTime();
            strategy.appendField(locator, this, "remainingTime", buffer, theRemainingTime, (this.remainingTime!= null));
        }
        return buffer;
    }

}
