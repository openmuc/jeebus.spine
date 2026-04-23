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
 * <p>Java class for TaskManagementJobRelationDataElementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaskManagementJobRelationDataElementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="jobId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="directControlRelated" type="{http://docs.eebus.org/spine/xsd/v1}TaskManagementDirectControlRelatedElementsType" minOccurs="0"/&gt;
 *         &lt;element name="hvacRelated" type="{http://docs.eebus.org/spine/xsd/v1}TaskManagementHvacRelatedElementsType" minOccurs="0"/&gt;
 *         &lt;element name="loadControlReleated" type="{http://docs.eebus.org/spine/xsd/v1}TaskManagementLoadControlReleatedElementsType" minOccurs="0"/&gt;
 *         &lt;element name="powerSequencesRelated" type="{http://docs.eebus.org/spine/xsd/v1}TaskManagementPowerSequencesRelatedElementsType" minOccurs="0"/&gt;
 *         &lt;element name="smartEnergyManagementPsRelated" type="{http://docs.eebus.org/spine/xsd/v1}TaskManagementSmartEnergyManagementPsRelatedElementsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaskManagementJobRelationDataElementsType", propOrder = {
    "jobId",
    "directControlRelated",
    "hvacRelated",
    "loadControlReleated",
    "powerSequencesRelated",
    "smartEnergyManagementPsRelated"
})
public class TaskManagementJobRelationDataElementsType implements Cloneable, CopyTo, ToString
{

    protected ElementTagType jobId;
    protected TaskManagementDirectControlRelatedElementsType directControlRelated;
    protected TaskManagementHvacRelatedElementsType hvacRelated;
    protected TaskManagementLoadControlReleatedElementsType loadControlReleated;
    protected TaskManagementPowerSequencesRelatedElementsType powerSequencesRelated;
    protected TaskManagementSmartEnergyManagementPsRelatedElementsType smartEnergyManagementPsRelated;

    /**
     * Default no-arg constructor
     * 
     */
    public TaskManagementJobRelationDataElementsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public TaskManagementJobRelationDataElementsType(final ElementTagType jobId, final TaskManagementDirectControlRelatedElementsType directControlRelated, final TaskManagementHvacRelatedElementsType hvacRelated, final TaskManagementLoadControlReleatedElementsType loadControlReleated, final TaskManagementPowerSequencesRelatedElementsType powerSequencesRelated, final TaskManagementSmartEnergyManagementPsRelatedElementsType smartEnergyManagementPsRelated) {
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
     * Gets the value of the directControlRelated property.
     * 
     * @return
     *     possible object is
     *     {@link TaskManagementDirectControlRelatedElementsType }
     *     
     */
    public TaskManagementDirectControlRelatedElementsType getDirectControlRelated() {
        return directControlRelated;
    }

    /**
     * Sets the value of the directControlRelated property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskManagementDirectControlRelatedElementsType }
     *     
     */
    public void setDirectControlRelated(TaskManagementDirectControlRelatedElementsType value) {
        this.directControlRelated = value;
    }

    /**
     * Gets the value of the hvacRelated property.
     * 
     * @return
     *     possible object is
     *     {@link TaskManagementHvacRelatedElementsType }
     *     
     */
    public TaskManagementHvacRelatedElementsType getHvacRelated() {
        return hvacRelated;
    }

    /**
     * Sets the value of the hvacRelated property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskManagementHvacRelatedElementsType }
     *     
     */
    public void setHvacRelated(TaskManagementHvacRelatedElementsType value) {
        this.hvacRelated = value;
    }

    /**
     * Gets the value of the loadControlReleated property.
     * 
     * @return
     *     possible object is
     *     {@link TaskManagementLoadControlReleatedElementsType }
     *     
     */
    public TaskManagementLoadControlReleatedElementsType getLoadControlReleated() {
        return loadControlReleated;
    }

    /**
     * Sets the value of the loadControlReleated property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskManagementLoadControlReleatedElementsType }
     *     
     */
    public void setLoadControlReleated(TaskManagementLoadControlReleatedElementsType value) {
        this.loadControlReleated = value;
    }

    /**
     * Gets the value of the powerSequencesRelated property.
     * 
     * @return
     *     possible object is
     *     {@link TaskManagementPowerSequencesRelatedElementsType }
     *     
     */
    public TaskManagementPowerSequencesRelatedElementsType getPowerSequencesRelated() {
        return powerSequencesRelated;
    }

    /**
     * Sets the value of the powerSequencesRelated property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskManagementPowerSequencesRelatedElementsType }
     *     
     */
    public void setPowerSequencesRelated(TaskManagementPowerSequencesRelatedElementsType value) {
        this.powerSequencesRelated = value;
    }

    /**
     * Gets the value of the smartEnergyManagementPsRelated property.
     * 
     * @return
     *     possible object is
     *     {@link TaskManagementSmartEnergyManagementPsRelatedElementsType }
     *     
     */
    public TaskManagementSmartEnergyManagementPsRelatedElementsType getSmartEnergyManagementPsRelated() {
        return smartEnergyManagementPsRelated;
    }

    /**
     * Sets the value of the smartEnergyManagementPsRelated property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskManagementSmartEnergyManagementPsRelatedElementsType }
     *     
     */
    public void setSmartEnergyManagementPsRelated(TaskManagementSmartEnergyManagementPsRelatedElementsType value) {
        this.smartEnergyManagementPsRelated = value;
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
    public TaskManagementJobRelationDataElementsType withJobId(ElementTagType value) {
        setJobId(value);
        return this;
    }

    /**
     * Sets the value of the directControlRelated property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskManagementDirectControlRelatedElementsType }
     * @return
     *     The class instance
     */
    public TaskManagementJobRelationDataElementsType withDirectControlRelated(TaskManagementDirectControlRelatedElementsType value) {
        setDirectControlRelated(value);
        return this;
    }

    /**
     * Sets the value of the hvacRelated property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskManagementHvacRelatedElementsType }
     * @return
     *     The class instance
     */
    public TaskManagementJobRelationDataElementsType withHvacRelated(TaskManagementHvacRelatedElementsType value) {
        setHvacRelated(value);
        return this;
    }

    /**
     * Sets the value of the loadControlReleated property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskManagementLoadControlReleatedElementsType }
     * @return
     *     The class instance
     */
    public TaskManagementJobRelationDataElementsType withLoadControlReleated(TaskManagementLoadControlReleatedElementsType value) {
        setLoadControlReleated(value);
        return this;
    }

    /**
     * Sets the value of the powerSequencesRelated property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskManagementPowerSequencesRelatedElementsType }
     * @return
     *     The class instance
     */
    public TaskManagementJobRelationDataElementsType withPowerSequencesRelated(TaskManagementPowerSequencesRelatedElementsType value) {
        setPowerSequencesRelated(value);
        return this;
    }

    /**
     * Sets the value of the smartEnergyManagementPsRelated property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskManagementSmartEnergyManagementPsRelatedElementsType }
     * @return
     *     The class instance
     */
    public TaskManagementJobRelationDataElementsType withSmartEnergyManagementPsRelated(TaskManagementSmartEnergyManagementPsRelatedElementsType value) {
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
        if (draftCopy instanceof TaskManagementJobRelationDataElementsType) {
            final TaskManagementJobRelationDataElementsType copy = ((TaskManagementJobRelationDataElementsType) draftCopy);
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
                Boolean directControlRelatedShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.directControlRelated!= null));
                if (directControlRelatedShouldBeCopiedAndSet == Boolean.TRUE) {
                    TaskManagementDirectControlRelatedElementsType sourceDirectControlRelated;
                    sourceDirectControlRelated = this.getDirectControlRelated();
                    TaskManagementDirectControlRelatedElementsType copyDirectControlRelated = ((TaskManagementDirectControlRelatedElementsType) strategy.copy(LocatorUtils.property(locator, "directControlRelated", sourceDirectControlRelated), sourceDirectControlRelated, (this.directControlRelated!= null)));
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
                    TaskManagementHvacRelatedElementsType sourceHvacRelated;
                    sourceHvacRelated = this.getHvacRelated();
                    TaskManagementHvacRelatedElementsType copyHvacRelated = ((TaskManagementHvacRelatedElementsType) strategy.copy(LocatorUtils.property(locator, "hvacRelated", sourceHvacRelated), sourceHvacRelated, (this.hvacRelated!= null)));
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
                    TaskManagementLoadControlReleatedElementsType sourceLoadControlReleated;
                    sourceLoadControlReleated = this.getLoadControlReleated();
                    TaskManagementLoadControlReleatedElementsType copyLoadControlReleated = ((TaskManagementLoadControlReleatedElementsType) strategy.copy(LocatorUtils.property(locator, "loadControlReleated", sourceLoadControlReleated), sourceLoadControlReleated, (this.loadControlReleated!= null)));
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
                    TaskManagementPowerSequencesRelatedElementsType sourcePowerSequencesRelated;
                    sourcePowerSequencesRelated = this.getPowerSequencesRelated();
                    TaskManagementPowerSequencesRelatedElementsType copyPowerSequencesRelated = ((TaskManagementPowerSequencesRelatedElementsType) strategy.copy(LocatorUtils.property(locator, "powerSequencesRelated", sourcePowerSequencesRelated), sourcePowerSequencesRelated, (this.powerSequencesRelated!= null)));
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
                    TaskManagementSmartEnergyManagementPsRelatedElementsType sourceSmartEnergyManagementPsRelated;
                    sourceSmartEnergyManagementPsRelated = this.getSmartEnergyManagementPsRelated();
                    TaskManagementSmartEnergyManagementPsRelatedElementsType copySmartEnergyManagementPsRelated = ((TaskManagementSmartEnergyManagementPsRelatedElementsType) strategy.copy(LocatorUtils.property(locator, "smartEnergyManagementPsRelated", sourceSmartEnergyManagementPsRelated), sourceSmartEnergyManagementPsRelated, (this.smartEnergyManagementPsRelated!= null)));
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
        return new TaskManagementJobRelationDataElementsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TaskManagementJobRelationDataElementsType that = ((TaskManagementJobRelationDataElementsType) object);
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
            TaskManagementDirectControlRelatedElementsType leftDirectControlRelated;
            leftDirectControlRelated = this.getDirectControlRelated();
            TaskManagementDirectControlRelatedElementsType rightDirectControlRelated;
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
            TaskManagementHvacRelatedElementsType leftHvacRelated;
            leftHvacRelated = this.getHvacRelated();
            TaskManagementHvacRelatedElementsType rightHvacRelated;
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
            TaskManagementLoadControlReleatedElementsType leftLoadControlReleated;
            leftLoadControlReleated = this.getLoadControlReleated();
            TaskManagementLoadControlReleatedElementsType rightLoadControlReleated;
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
            TaskManagementPowerSequencesRelatedElementsType leftPowerSequencesRelated;
            leftPowerSequencesRelated = this.getPowerSequencesRelated();
            TaskManagementPowerSequencesRelatedElementsType rightPowerSequencesRelated;
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
            TaskManagementSmartEnergyManagementPsRelatedElementsType leftSmartEnergyManagementPsRelated;
            leftSmartEnergyManagementPsRelated = this.getSmartEnergyManagementPsRelated();
            TaskManagementSmartEnergyManagementPsRelatedElementsType rightSmartEnergyManagementPsRelated;
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
            ElementTagType theJobId;
            theJobId = this.getJobId();
            if (this.jobId!= null) {
                currentHashCode += theJobId.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            TaskManagementDirectControlRelatedElementsType theDirectControlRelated;
            theDirectControlRelated = this.getDirectControlRelated();
            if (this.directControlRelated!= null) {
                currentHashCode += theDirectControlRelated.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            TaskManagementHvacRelatedElementsType theHvacRelated;
            theHvacRelated = this.getHvacRelated();
            if (this.hvacRelated!= null) {
                currentHashCode += theHvacRelated.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            TaskManagementLoadControlReleatedElementsType theLoadControlReleated;
            theLoadControlReleated = this.getLoadControlReleated();
            if (this.loadControlReleated!= null) {
                currentHashCode += theLoadControlReleated.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            TaskManagementPowerSequencesRelatedElementsType thePowerSequencesRelated;
            thePowerSequencesRelated = this.getPowerSequencesRelated();
            if (this.powerSequencesRelated!= null) {
                currentHashCode += thePowerSequencesRelated.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            TaskManagementSmartEnergyManagementPsRelatedElementsType theSmartEnergyManagementPsRelated;
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
            ElementTagType theJobId;
            theJobId = this.getJobId();
            strategy.appendField(locator, this, "jobId", buffer, theJobId, (this.jobId!= null));
        }
        {
            TaskManagementDirectControlRelatedElementsType theDirectControlRelated;
            theDirectControlRelated = this.getDirectControlRelated();
            strategy.appendField(locator, this, "directControlRelated", buffer, theDirectControlRelated, (this.directControlRelated!= null));
        }
        {
            TaskManagementHvacRelatedElementsType theHvacRelated;
            theHvacRelated = this.getHvacRelated();
            strategy.appendField(locator, this, "hvacRelated", buffer, theHvacRelated, (this.hvacRelated!= null));
        }
        {
            TaskManagementLoadControlReleatedElementsType theLoadControlReleated;
            theLoadControlReleated = this.getLoadControlReleated();
            strategy.appendField(locator, this, "loadControlReleated", buffer, theLoadControlReleated, (this.loadControlReleated!= null));
        }
        {
            TaskManagementPowerSequencesRelatedElementsType thePowerSequencesRelated;
            thePowerSequencesRelated = this.getPowerSequencesRelated();
            strategy.appendField(locator, this, "powerSequencesRelated", buffer, thePowerSequencesRelated, (this.powerSequencesRelated!= null));
        }
        {
            TaskManagementSmartEnergyManagementPsRelatedElementsType theSmartEnergyManagementPsRelated;
            theSmartEnergyManagementPsRelated = this.getSmartEnergyManagementPsRelated();
            strategy.appendField(locator, this, "smartEnergyManagementPsRelated", buffer, theSmartEnergyManagementPsRelated, (this.smartEnergyManagementPsRelated!= null));
        }
        return buffer;
    }

}
