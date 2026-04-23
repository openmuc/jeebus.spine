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
 * <p>Java class for TaskManagementOverviewDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaskManagementOverviewDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="remoteControllable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="jobsActive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaskManagementOverviewDataType", propOrder = {
    "remoteControllable",
    "jobsActive"
})
public class TaskManagementOverviewDataType implements Cloneable, CopyTo, ToString
{

    protected Boolean remoteControllable;
    protected Boolean jobsActive;

    /**
     * Default no-arg constructor
     * 
     */
    public TaskManagementOverviewDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public TaskManagementOverviewDataType(final Boolean remoteControllable, final Boolean jobsActive) {
        this.remoteControllable = remoteControllable;
        this.jobsActive = jobsActive;
    }

    /**
     * Gets the value of the remoteControllable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getRemoteControllable() {
        return remoteControllable;
    }

    /**
     * Sets the value of the remoteControllable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRemoteControllable(Boolean value) {
        this.remoteControllable = value;
    }

    /**
     * Gets the value of the jobsActive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getJobsActive() {
        return jobsActive;
    }

    /**
     * Sets the value of the jobsActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setJobsActive(Boolean value) {
        this.jobsActive = value;
    }

    /**
     * Sets the value of the remoteControllable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     * @return
     *     The class instance
     */
    public TaskManagementOverviewDataType withRemoteControllable(Boolean value) {
        setRemoteControllable(value);
        return this;
    }

    /**
     * Sets the value of the jobsActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     * @return
     *     The class instance
     */
    public TaskManagementOverviewDataType withJobsActive(Boolean value) {
        setJobsActive(value);
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
        if (draftCopy instanceof TaskManagementOverviewDataType) {
            final TaskManagementOverviewDataType copy = ((TaskManagementOverviewDataType) draftCopy);
            {
                Boolean remoteControllableShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.remoteControllable!= null));
                if (remoteControllableShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceRemoteControllable;
                    sourceRemoteControllable = this.getRemoteControllable();
                    Boolean copyRemoteControllable = ((Boolean) strategy.copy(LocatorUtils.property(locator, "remoteControllable", sourceRemoteControllable), sourceRemoteControllable, (this.remoteControllable!= null)));
                    copy.setRemoteControllable(copyRemoteControllable);
                } else {
                    if (remoteControllableShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.remoteControllable = null;
                    }
                }
            }
            {
                Boolean jobsActiveShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.jobsActive!= null));
                if (jobsActiveShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceJobsActive;
                    sourceJobsActive = this.getJobsActive();
                    Boolean copyJobsActive = ((Boolean) strategy.copy(LocatorUtils.property(locator, "jobsActive", sourceJobsActive), sourceJobsActive, (this.jobsActive!= null)));
                    copy.setJobsActive(copyJobsActive);
                } else {
                    if (jobsActiveShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.jobsActive = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new TaskManagementOverviewDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TaskManagementOverviewDataType that = ((TaskManagementOverviewDataType) object);
        {
            Boolean leftRemoteControllable;
            leftRemoteControllable = this.getRemoteControllable();
            Boolean rightRemoteControllable;
            rightRemoteControllable = that.getRemoteControllable();
            if (this.remoteControllable!= null) {
                if (that.remoteControllable!= null) {
                    if (!leftRemoteControllable.equals(rightRemoteControllable)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.remoteControllable!= null) {
                    return false;
                }
            }
        }
        {
            Boolean leftJobsActive;
            leftJobsActive = this.getJobsActive();
            Boolean rightJobsActive;
            rightJobsActive = that.getJobsActive();
            if (this.jobsActive!= null) {
                if (that.jobsActive!= null) {
                    if (!leftJobsActive.equals(rightJobsActive)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.jobsActive!= null) {
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
            Boolean theRemoteControllable;
            theRemoteControllable = this.getRemoteControllable();
            if (this.remoteControllable!= null) {
                currentHashCode += theRemoteControllable.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            Boolean theJobsActive;
            theJobsActive = this.getJobsActive();
            if (this.jobsActive!= null) {
                currentHashCode += theJobsActive.hashCode();
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
            Boolean theRemoteControllable;
            theRemoteControllable = this.getRemoteControllable();
            strategy.appendField(locator, this, "remoteControllable", buffer, theRemoteControllable, (this.remoteControllable!= null));
        }
        {
            Boolean theJobsActive;
            theJobsActive = this.getJobsActive();
            strategy.appendField(locator, this, "jobsActive", buffer, theJobsActive, (this.jobsActive!= null));
        }
        return buffer;
    }

}
