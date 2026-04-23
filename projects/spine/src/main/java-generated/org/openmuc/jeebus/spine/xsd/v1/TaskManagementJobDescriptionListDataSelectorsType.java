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
 * <p>Java class for TaskManagementJobDescriptionListDataSelectorsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaskManagementJobDescriptionListDataSelectorsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="jobId" type="{http://docs.eebus.org/spine/xsd/v1}TaskManagementJobIdType" minOccurs="0"/&gt;
 *         &lt;element name="jobSource" type="{http://docs.eebus.org/spine/xsd/v1}TaskManagementJobSourceType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaskManagementJobDescriptionListDataSelectorsType", propOrder = {
    "jobId",
    "jobSource"
})
public class TaskManagementJobDescriptionListDataSelectorsType implements Cloneable, CopyTo, ToString
{

    @XmlSchemaType(name = "unsignedInt")
    protected Long jobId;
    protected String jobSource;

    /**
     * Default no-arg constructor
     * 
     */
    public TaskManagementJobDescriptionListDataSelectorsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public TaskManagementJobDescriptionListDataSelectorsType(final Long jobId, final String jobSource) {
        this.jobId = jobId;
        this.jobSource = jobSource;
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
     * Gets the value of the jobSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobSource() {
        return jobSource;
    }

    /**
     * Sets the value of the jobSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobSource(String value) {
        this.jobSource = value;
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
    public TaskManagementJobDescriptionListDataSelectorsType withJobId(Long value) {
        setJobId(value);
        return this;
    }

    /**
     * Sets the value of the jobSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public TaskManagementJobDescriptionListDataSelectorsType withJobSource(String value) {
        setJobSource(value);
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
        if (draftCopy instanceof TaskManagementJobDescriptionListDataSelectorsType) {
            final TaskManagementJobDescriptionListDataSelectorsType copy = ((TaskManagementJobDescriptionListDataSelectorsType) draftCopy);
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
                Boolean jobSourceShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.jobSource!= null));
                if (jobSourceShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceJobSource;
                    sourceJobSource = this.getJobSource();
                    String copyJobSource = ((String) strategy.copy(LocatorUtils.property(locator, "jobSource", sourceJobSource), sourceJobSource, (this.jobSource!= null)));
                    copy.setJobSource(copyJobSource);
                } else {
                    if (jobSourceShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.jobSource = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new TaskManagementJobDescriptionListDataSelectorsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TaskManagementJobDescriptionListDataSelectorsType that = ((TaskManagementJobDescriptionListDataSelectorsType) object);
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
            String leftJobSource;
            leftJobSource = this.getJobSource();
            String rightJobSource;
            rightJobSource = that.getJobSource();
            if (this.jobSource!= null) {
                if (that.jobSource!= null) {
                    if (!leftJobSource.equals(rightJobSource)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.jobSource!= null) {
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
            String theJobSource;
            theJobSource = this.getJobSource();
            if (this.jobSource!= null) {
                currentHashCode += theJobSource.hashCode();
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
            String theJobSource;
            theJobSource = this.getJobSource();
            strategy.appendField(locator, this, "jobSource", buffer, theJobSource, (this.jobSource!= null));
        }
        return buffer;
    }

}
