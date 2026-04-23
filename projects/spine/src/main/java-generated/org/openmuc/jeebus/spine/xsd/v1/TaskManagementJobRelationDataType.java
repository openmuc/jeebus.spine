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
 * <p>Java class for TaskManagementJobRelationDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaskManagementJobRelationDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="jobId" type="{http://docs.eebus.org/spine/xsd/v1}TaskManagementJobIdType" minOccurs="0"/&gt;
 *         &lt;element name="directControlRelated" type="{http://docs.eebus.org/spine/xsd/v1}TaskManagementDirectControlRelatedType" minOccurs="0"/&gt;
 *         &lt;element name="hvacRelated" type="{http://docs.eebus.org/spine/xsd/v1}TaskManagementHvacRelatedType" minOccurs="0"/&gt;
 *         &lt;element name="loadControlReleated" type="{http://docs.eebus.org/spine/xsd/v1}TaskManagementLoadControlReleatedType" minOccurs="0"/&gt;
 *         &lt;element name="powerSequencesRelated" type="{http://docs.eebus.org/spine/xsd/v1}TaskManagementPowerSequencesRelatedType" minOccurs="0"/&gt;
 *         &lt;element name="smartEnergyManagementPsRelated" type="{http://docs.eebus.org/spine/xsd/v1}TaskManagementSmartEnergyManagementPsRelatedType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaskManagementJobRelationDataType", propOrder = {
    "jobId",
    "directControlRelated",
    "hvacRelated",
    "loadControlReleated",
    "powerSequencesRelated",
    "smartEnergyManagementPsRelated"
})
public class TaskManagementJobRelationDataType implements Cloneable, CopyTo, ToString
{

    @XmlSchemaType(name = "unsignedInt")
    protected Long jobId;
    protected TaskManagementDirectControlRelatedType directControlRelated;
    protected TaskManagementHvacRelatedType hvacRelated;
    protected TaskManagementLoadControlReleatedType loadControlReleated;
    protected TaskManagementPowerSequencesRelatedType powerSequencesRelated;
    protected TaskManagementSmartEnergyManagementPsRelatedType smartEnergyManagementPsRelated;

    /**
     * Default no-arg constructor
     * 
     */
    public TaskManagementJobRelationDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public TaskManagementJobRelationDataType(final Long jobId, final TaskManagementDirectControlRelatedType directControlRelated, final TaskManagementHvacRelatedType hvacRelated, final TaskManagementLoadControlReleatedType loadControlReleated, final TaskManagementPowerSequencesRelatedType powerSequencesRelated, final TaskManagementSmartEnergyManagementPsRelatedType smartEnergyManagementPsRelated) {
        this.jobId = jobId;
        this.directControlRelated = directControlRelated;
        this.hvacRelated = hvacRelated;
        this.loadControlReleated = loadControlReleated;
        this.powerSequencesRelated = powerSequencesRelated;
        this.smartEnergyManagementPsRelated = smartEnergyManagementPsRelated;
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
     * Gets the value of the directControlRelated property.
     * 
     * @return
     *     possible object is
     *     {@link TaskManagementDirectControlRelatedType }
     *     
     */
    public TaskManagementDirectControlRelatedType getDirectControlRelated() {
        return directControlRelated;
    }

    /**
     * Sets the value of the directControlRelated property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskManagementDirectControlRelatedType }
     *     
     */
    public void setDirectControlRelated(TaskManagementDirectControlRelatedType value) {
        this.directControlRelated = value;
    }

    /**
     * Gets the value of the hvacRelated property.
     * 
     * @return
     *     possible object is
     *     {@link TaskManagementHvacRelatedType }
     *     
     */
    public TaskManagementHvacRelatedType getHvacRelated() {
        return hvacRelated;
    }

    /**
     * Sets the value of the hvacRelated property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskManagementHvacRelatedType }
     *     
     */
    public void setHvacRelated(TaskManagementHvacRelatedType value) {
        this.hvacRelated = value;
    }

    /**
     * Gets the value of the loadControlReleated property.
     * 
     * @return
     *     possible object is
     *     {@link TaskManagementLoadControlReleatedType }
     *     
     */
    public TaskManagementLoadControlReleatedType getLoadControlReleated() {
        return loadControlReleated;
    }

    /**
     * Sets the value of the loadControlReleated property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskManagementLoadControlReleatedType }
     *     
     */
    public void setLoadControlReleated(TaskManagementLoadControlReleatedType value) {
        this.loadControlReleated = value;
    }

    /**
     * Gets the value of the powerSequencesRelated property.
     * 
     * @return
     *     possible object is
     *     {@link TaskManagementPowerSequencesRelatedType }
     *     
     */
    public TaskManagementPowerSequencesRelatedType getPowerSequencesRelated() {
        return powerSequencesRelated;
    }

    /**
     * Sets the value of the powerSequencesRelated property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskManagementPowerSequencesRelatedType }
     *     
     */
    public void setPowerSequencesRelated(TaskManagementPowerSequencesRelatedType value) {
        this.powerSequencesRelated = value;
    }

    /**
     * Gets the value of the smartEnergyManagementPsRelated property.
     * 
     * @return
     *     possible object is
     *     {@link TaskManagementSmartEnergyManagementPsRelatedType }
     *     
     */
    public TaskManagementSmartEnergyManagementPsRelatedType getSmartEnergyManagementPsRelated() {
        return smartEnergyManagementPsRelated;
    }

    /**
     * Sets the value of the smartEnergyManagementPsRelated property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskManagementSmartEnergyManagementPsRelatedType }
     *     
     */
    public void setSmartEnergyManagementPsRelated(TaskManagementSmartEnergyManagementPsRelatedType value) {
        this.smartEnergyManagementPsRelated = value;
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
    public TaskManagementJobRelationDataType withJobId(Long value) {
        setJobId(value);
        return this;
    }

    /**
     * Sets the value of the directControlRelated property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskManagementDirectControlRelatedType }
     * @return
     *     The class instance
     */
    public TaskManagementJobRelationDataType withDirectControlRelated(TaskManagementDirectControlRelatedType value) {
        setDirectControlRelated(value);
        return this;
    }

    /**
     * Sets the value of the hvacRelated property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskManagementHvacRelatedType }
     * @return
     *     The class instance
     */
    public TaskManagementJobRelationDataType withHvacRelated(TaskManagementHvacRelatedType value) {
        setHvacRelated(value);
        return this;
    }

    /**
     * Sets the value of the loadControlReleated property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskManagementLoadControlReleatedType }
     * @return
     *     The class instance
     */
    public TaskManagementJobRelationDataType withLoadControlReleated(TaskManagementLoadControlReleatedType value) {
        setLoadControlReleated(value);
        return this;
    }

    /**
     * Sets the value of the powerSequencesRelated property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskManagementPowerSequencesRelatedType }
     * @return
     *     The class instance
     */
    public TaskManagementJobRelationDataType withPowerSequencesRelated(TaskManagementPowerSequencesRelatedType value) {
        setPowerSequencesRelated(value);
        return this;
    }

    /**
     * Sets the value of the smartEnergyManagementPsRelated property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskManagementSmartEnergyManagementPsRelatedType }
     * @return
     *     The class instance
     */
    public TaskManagementJobRelationDataType withSmartEnergyManagementPsRelated(TaskManagementSmartEnergyManagementPsRelatedType value) {
        setSmartEnergyManagementPsRelated(value);
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
        if (draftCopy instanceof TaskManagementJobRelationDataType) {
            final TaskManagementJobRelationDataType copy = ((TaskManagementJobRelationDataType) draftCopy);
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
                Boolean directControlRelatedShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.directControlRelated!= null));
                if (directControlRelatedShouldBeCopiedAndSet == Boolean.TRUE) {
                    TaskManagementDirectControlRelatedType sourceDirectControlRelated;
                    sourceDirectControlRelated = this.getDirectControlRelated();
                    TaskManagementDirectControlRelatedType copyDirectControlRelated = ((TaskManagementDirectControlRelatedType) strategy.copy(LocatorUtils.property(locator, "directControlRelated", sourceDirectControlRelated), sourceDirectControlRelated, (this.directControlRelated!= null)));
                    copy.setDirectControlRelated(copyDirectControlRelated);
                } else {
                    if (directControlRelatedShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.directControlRelated = null;
                    }
                }
            }
            {
                Boolean hvacRelatedShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.hvacRelated!= null));
                if (hvacRelatedShouldBeCopiedAndSet == Boolean.TRUE) {
                    TaskManagementHvacRelatedType sourceHvacRelated;
                    sourceHvacRelated = this.getHvacRelated();
                    TaskManagementHvacRelatedType copyHvacRelated = ((TaskManagementHvacRelatedType) strategy.copy(LocatorUtils.property(locator, "hvacRelated", sourceHvacRelated), sourceHvacRelated, (this.hvacRelated!= null)));
                    copy.setHvacRelated(copyHvacRelated);
                } else {
                    if (hvacRelatedShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.hvacRelated = null;
                    }
                }
            }
            {
                Boolean loadControlReleatedShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.loadControlReleated!= null));
                if (loadControlReleatedShouldBeCopiedAndSet == Boolean.TRUE) {
                    TaskManagementLoadControlReleatedType sourceLoadControlReleated;
                    sourceLoadControlReleated = this.getLoadControlReleated();
                    TaskManagementLoadControlReleatedType copyLoadControlReleated = ((TaskManagementLoadControlReleatedType) strategy.copy(LocatorUtils.property(locator, "loadControlReleated", sourceLoadControlReleated), sourceLoadControlReleated, (this.loadControlReleated!= null)));
                    copy.setLoadControlReleated(copyLoadControlReleated);
                } else {
                    if (loadControlReleatedShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.loadControlReleated = null;
                    }
                }
            }
            {
                Boolean powerSequencesRelatedShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.powerSequencesRelated!= null));
                if (powerSequencesRelatedShouldBeCopiedAndSet == Boolean.TRUE) {
                    TaskManagementPowerSequencesRelatedType sourcePowerSequencesRelated;
                    sourcePowerSequencesRelated = this.getPowerSequencesRelated();
                    TaskManagementPowerSequencesRelatedType copyPowerSequencesRelated = ((TaskManagementPowerSequencesRelatedType) strategy.copy(LocatorUtils.property(locator, "powerSequencesRelated", sourcePowerSequencesRelated), sourcePowerSequencesRelated, (this.powerSequencesRelated!= null)));
                    copy.setPowerSequencesRelated(copyPowerSequencesRelated);
                } else {
                    if (powerSequencesRelatedShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.powerSequencesRelated = null;
                    }
                }
            }
            {
                Boolean smartEnergyManagementPsRelatedShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.smartEnergyManagementPsRelated!= null));
                if (smartEnergyManagementPsRelatedShouldBeCopiedAndSet == Boolean.TRUE) {
                    TaskManagementSmartEnergyManagementPsRelatedType sourceSmartEnergyManagementPsRelated;
                    sourceSmartEnergyManagementPsRelated = this.getSmartEnergyManagementPsRelated();
                    TaskManagementSmartEnergyManagementPsRelatedType copySmartEnergyManagementPsRelated = ((TaskManagementSmartEnergyManagementPsRelatedType) strategy.copy(LocatorUtils.property(locator, "smartEnergyManagementPsRelated", sourceSmartEnergyManagementPsRelated), sourceSmartEnergyManagementPsRelated, (this.smartEnergyManagementPsRelated!= null)));
                    copy.setSmartEnergyManagementPsRelated(copySmartEnergyManagementPsRelated);
                } else {
                    if (smartEnergyManagementPsRelatedShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.smartEnergyManagementPsRelated = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new TaskManagementJobRelationDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TaskManagementJobRelationDataType that = ((TaskManagementJobRelationDataType) object);
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
            TaskManagementDirectControlRelatedType leftDirectControlRelated;
            leftDirectControlRelated = this.getDirectControlRelated();
            TaskManagementDirectControlRelatedType rightDirectControlRelated;
            rightDirectControlRelated = that.getDirectControlRelated();
            if (this.directControlRelated!= null) {
                if (that.directControlRelated!= null) {
                    if (!leftDirectControlRelated.equals(rightDirectControlRelated)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.directControlRelated!= null) {
                    return false;
                }
            }
        }
        {
            TaskManagementHvacRelatedType leftHvacRelated;
            leftHvacRelated = this.getHvacRelated();
            TaskManagementHvacRelatedType rightHvacRelated;
            rightHvacRelated = that.getHvacRelated();
            if (this.hvacRelated!= null) {
                if (that.hvacRelated!= null) {
                    if (!leftHvacRelated.equals(rightHvacRelated)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.hvacRelated!= null) {
                    return false;
                }
            }
        }
        {
            TaskManagementLoadControlReleatedType leftLoadControlReleated;
            leftLoadControlReleated = this.getLoadControlReleated();
            TaskManagementLoadControlReleatedType rightLoadControlReleated;
            rightLoadControlReleated = that.getLoadControlReleated();
            if (this.loadControlReleated!= null) {
                if (that.loadControlReleated!= null) {
                    if (!leftLoadControlReleated.equals(rightLoadControlReleated)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.loadControlReleated!= null) {
                    return false;
                }
            }
        }
        {
            TaskManagementPowerSequencesRelatedType leftPowerSequencesRelated;
            leftPowerSequencesRelated = this.getPowerSequencesRelated();
            TaskManagementPowerSequencesRelatedType rightPowerSequencesRelated;
            rightPowerSequencesRelated = that.getPowerSequencesRelated();
            if (this.powerSequencesRelated!= null) {
                if (that.powerSequencesRelated!= null) {
                    if (!leftPowerSequencesRelated.equals(rightPowerSequencesRelated)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.powerSequencesRelated!= null) {
                    return false;
                }
            }
        }
        {
            TaskManagementSmartEnergyManagementPsRelatedType leftSmartEnergyManagementPsRelated;
            leftSmartEnergyManagementPsRelated = this.getSmartEnergyManagementPsRelated();
            TaskManagementSmartEnergyManagementPsRelatedType rightSmartEnergyManagementPsRelated;
            rightSmartEnergyManagementPsRelated = that.getSmartEnergyManagementPsRelated();
            if (this.smartEnergyManagementPsRelated!= null) {
                if (that.smartEnergyManagementPsRelated!= null) {
                    if (!leftSmartEnergyManagementPsRelated.equals(rightSmartEnergyManagementPsRelated)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.smartEnergyManagementPsRelated!= null) {
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
            TaskManagementDirectControlRelatedType theDirectControlRelated;
            theDirectControlRelated = this.getDirectControlRelated();
            if (this.directControlRelated!= null) {
                currentHashCode += theDirectControlRelated.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            TaskManagementHvacRelatedType theHvacRelated;
            theHvacRelated = this.getHvacRelated();
            if (this.hvacRelated!= null) {
                currentHashCode += theHvacRelated.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            TaskManagementLoadControlReleatedType theLoadControlReleated;
            theLoadControlReleated = this.getLoadControlReleated();
            if (this.loadControlReleated!= null) {
                currentHashCode += theLoadControlReleated.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            TaskManagementPowerSequencesRelatedType thePowerSequencesRelated;
            thePowerSequencesRelated = this.getPowerSequencesRelated();
            if (this.powerSequencesRelated!= null) {
                currentHashCode += thePowerSequencesRelated.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            TaskManagementSmartEnergyManagementPsRelatedType theSmartEnergyManagementPsRelated;
            theSmartEnergyManagementPsRelated = this.getSmartEnergyManagementPsRelated();
            if (this.smartEnergyManagementPsRelated!= null) {
                currentHashCode += theSmartEnergyManagementPsRelated.hashCode();
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
            TaskManagementDirectControlRelatedType theDirectControlRelated;
            theDirectControlRelated = this.getDirectControlRelated();
            strategy.appendField(locator, this, "directControlRelated", buffer, theDirectControlRelated, (this.directControlRelated!= null));
        }
        {
            TaskManagementHvacRelatedType theHvacRelated;
            theHvacRelated = this.getHvacRelated();
            strategy.appendField(locator, this, "hvacRelated", buffer, theHvacRelated, (this.hvacRelated!= null));
        }
        {
            TaskManagementLoadControlReleatedType theLoadControlReleated;
            theLoadControlReleated = this.getLoadControlReleated();
            strategy.appendField(locator, this, "loadControlReleated", buffer, theLoadControlReleated, (this.loadControlReleated!= null));
        }
        {
            TaskManagementPowerSequencesRelatedType thePowerSequencesRelated;
            thePowerSequencesRelated = this.getPowerSequencesRelated();
            strategy.appendField(locator, this, "powerSequencesRelated", buffer, thePowerSequencesRelated, (this.powerSequencesRelated!= null));
        }
        {
            TaskManagementSmartEnergyManagementPsRelatedType theSmartEnergyManagementPsRelated;
            theSmartEnergyManagementPsRelated = this.getSmartEnergyManagementPsRelated();
            strategy.appendField(locator, this, "smartEnergyManagementPsRelated", buffer, theSmartEnergyManagementPsRelated, (this.smartEnergyManagementPsRelated!= null));
        }
        return buffer;
    }

}
