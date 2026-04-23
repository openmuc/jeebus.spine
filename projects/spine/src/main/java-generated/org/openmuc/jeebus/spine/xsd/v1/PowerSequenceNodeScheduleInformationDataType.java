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
 * <p>Java class for PowerSequenceNodeScheduleInformationDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PowerSequenceNodeScheduleInformationDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nodeRemoteControllable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="supportsSingleSlotSchedulingOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="alternativesCount" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="totalSequencesCountMax" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="supportsReselection" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PowerSequenceNodeScheduleInformationDataType", propOrder = {
    "nodeRemoteControllable",
    "supportsSingleSlotSchedulingOnly",
    "alternativesCount",
    "totalSequencesCountMax",
    "supportsReselection"
})
@XmlSeeAlso({
    org.openmuc.jeebus.spine.xsd.v1.SmartEnergyManagementPsDataType.NodeScheduleInformation.class
})
public class PowerSequenceNodeScheduleInformationDataType implements Cloneable, CopyTo, ToString
{

    protected Boolean nodeRemoteControllable;
    protected Boolean supportsSingleSlotSchedulingOnly;
    @XmlSchemaType(name = "unsignedInt")
    protected Long alternativesCount;
    @XmlSchemaType(name = "unsignedInt")
    protected Long totalSequencesCountMax;
    protected Boolean supportsReselection;

    /**
     * Default no-arg constructor
     * 
     */
    public PowerSequenceNodeScheduleInformationDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public PowerSequenceNodeScheduleInformationDataType(final Boolean nodeRemoteControllable, final Boolean supportsSingleSlotSchedulingOnly, final Long alternativesCount, final Long totalSequencesCountMax, final Boolean supportsReselection) {
        this.nodeRemoteControllable = nodeRemoteControllable;
        this.supportsSingleSlotSchedulingOnly = supportsSingleSlotSchedulingOnly;
        this.alternativesCount = alternativesCount;
        this.totalSequencesCountMax = totalSequencesCountMax;
        this.supportsReselection = supportsReselection;
    }

    /**
     * Gets the value of the nodeRemoteControllable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getNodeRemoteControllable() {
        return nodeRemoteControllable;
    }

    /**
     * Sets the value of the nodeRemoteControllable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNodeRemoteControllable(Boolean value) {
        this.nodeRemoteControllable = value;
    }

    /**
     * Gets the value of the supportsSingleSlotSchedulingOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getSupportsSingleSlotSchedulingOnly() {
        return supportsSingleSlotSchedulingOnly;
    }

    /**
     * Sets the value of the supportsSingleSlotSchedulingOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSupportsSingleSlotSchedulingOnly(Boolean value) {
        this.supportsSingleSlotSchedulingOnly = value;
    }

    /**
     * Gets the value of the alternativesCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAlternativesCount() {
        return alternativesCount;
    }

    /**
     * Sets the value of the alternativesCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAlternativesCount(Long value) {
        this.alternativesCount = value;
    }

    /**
     * Gets the value of the totalSequencesCountMax property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalSequencesCountMax() {
        return totalSequencesCountMax;
    }

    /**
     * Sets the value of the totalSequencesCountMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalSequencesCountMax(Long value) {
        this.totalSequencesCountMax = value;
    }

    /**
     * Gets the value of the supportsReselection property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getSupportsReselection() {
        return supportsReselection;
    }

    /**
     * Sets the value of the supportsReselection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSupportsReselection(Boolean value) {
        this.supportsReselection = value;
    }

    /**
     * Sets the value of the nodeRemoteControllable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     * @return
     *     The class instance
     */
    public PowerSequenceNodeScheduleInformationDataType withNodeRemoteControllable(Boolean value) {
        setNodeRemoteControllable(value);
        return this;
    }

    /**
     * Sets the value of the supportsSingleSlotSchedulingOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     * @return
     *     The class instance
     */
    public PowerSequenceNodeScheduleInformationDataType withSupportsSingleSlotSchedulingOnly(Boolean value) {
        setSupportsSingleSlotSchedulingOnly(value);
        return this;
    }

    /**
     * Sets the value of the alternativesCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     * @return
     *     The class instance
     */
    public PowerSequenceNodeScheduleInformationDataType withAlternativesCount(Long value) {
        setAlternativesCount(value);
        return this;
    }

    /**
     * Sets the value of the totalSequencesCountMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     * @return
     *     The class instance
     */
    public PowerSequenceNodeScheduleInformationDataType withTotalSequencesCountMax(Long value) {
        setTotalSequencesCountMax(value);
        return this;
    }

    /**
     * Sets the value of the supportsReselection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     * @return
     *     The class instance
     */
    public PowerSequenceNodeScheduleInformationDataType withSupportsReselection(Boolean value) {
        setSupportsReselection(value);
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
        if (draftCopy instanceof PowerSequenceNodeScheduleInformationDataType) {
            final PowerSequenceNodeScheduleInformationDataType copy = ((PowerSequenceNodeScheduleInformationDataType) draftCopy);
            {
                Boolean nodeRemoteControllableShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.nodeRemoteControllable!= null));
                if (nodeRemoteControllableShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceNodeRemoteControllable;
                    sourceNodeRemoteControllable = this.getNodeRemoteControllable();
                    Boolean copyNodeRemoteControllable = ((Boolean) strategy.copy(LocatorUtils.property(locator, "nodeRemoteControllable", sourceNodeRemoteControllable), sourceNodeRemoteControllable, (this.nodeRemoteControllable!= null)));
                    copy.setNodeRemoteControllable(copyNodeRemoteControllable);
                } else {
                    if (nodeRemoteControllableShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.nodeRemoteControllable = null;
                    }
                }
            }
            {
                Boolean supportsSingleSlotSchedulingOnlyShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.supportsSingleSlotSchedulingOnly!= null));
                if (supportsSingleSlotSchedulingOnlyShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceSupportsSingleSlotSchedulingOnly;
                    sourceSupportsSingleSlotSchedulingOnly = this.getSupportsSingleSlotSchedulingOnly();
                    Boolean copySupportsSingleSlotSchedulingOnly = ((Boolean) strategy.copy(LocatorUtils.property(locator, "supportsSingleSlotSchedulingOnly", sourceSupportsSingleSlotSchedulingOnly), sourceSupportsSingleSlotSchedulingOnly, (this.supportsSingleSlotSchedulingOnly!= null)));
                    copy.setSupportsSingleSlotSchedulingOnly(copySupportsSingleSlotSchedulingOnly);
                } else {
                    if (supportsSingleSlotSchedulingOnlyShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.supportsSingleSlotSchedulingOnly = null;
                    }
                }
            }
            {
                Boolean alternativesCountShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.alternativesCount!= null));
                if (alternativesCountShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceAlternativesCount;
                    sourceAlternativesCount = this.getAlternativesCount();
                    Long copyAlternativesCount = ((Long) strategy.copy(LocatorUtils.property(locator, "alternativesCount", sourceAlternativesCount), sourceAlternativesCount, (this.alternativesCount!= null)));
                    copy.setAlternativesCount(copyAlternativesCount);
                } else {
                    if (alternativesCountShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.alternativesCount = null;
                    }
                }
            }
            {
                Boolean totalSequencesCountMaxShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.totalSequencesCountMax!= null));
                if (totalSequencesCountMaxShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceTotalSequencesCountMax;
                    sourceTotalSequencesCountMax = this.getTotalSequencesCountMax();
                    Long copyTotalSequencesCountMax = ((Long) strategy.copy(LocatorUtils.property(locator, "totalSequencesCountMax", sourceTotalSequencesCountMax), sourceTotalSequencesCountMax, (this.totalSequencesCountMax!= null)));
                    copy.setTotalSequencesCountMax(copyTotalSequencesCountMax);
                } else {
                    if (totalSequencesCountMaxShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.totalSequencesCountMax = null;
                    }
                }
            }
            {
                Boolean supportsReselectionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.supportsReselection!= null));
                if (supportsReselectionShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceSupportsReselection;
                    sourceSupportsReselection = this.getSupportsReselection();
                    Boolean copySupportsReselection = ((Boolean) strategy.copy(LocatorUtils.property(locator, "supportsReselection", sourceSupportsReselection), sourceSupportsReselection, (this.supportsReselection!= null)));
                    copy.setSupportsReselection(copySupportsReselection);
                } else {
                    if (supportsReselectionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.supportsReselection = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new PowerSequenceNodeScheduleInformationDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final PowerSequenceNodeScheduleInformationDataType that = ((PowerSequenceNodeScheduleInformationDataType) object);
        {
            Boolean leftNodeRemoteControllable;
            leftNodeRemoteControllable = this.getNodeRemoteControllable();
            Boolean rightNodeRemoteControllable;
            rightNodeRemoteControllable = that.getNodeRemoteControllable();
            if (this.nodeRemoteControllable!= null) {
                if (that.nodeRemoteControllable!= null) {
                    if (!leftNodeRemoteControllable.equals(rightNodeRemoteControllable)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.nodeRemoteControllable!= null) {
                    return false;
                }
            }
        }
        {
            Boolean leftSupportsSingleSlotSchedulingOnly;
            leftSupportsSingleSlotSchedulingOnly = this.getSupportsSingleSlotSchedulingOnly();
            Boolean rightSupportsSingleSlotSchedulingOnly;
            rightSupportsSingleSlotSchedulingOnly = that.getSupportsSingleSlotSchedulingOnly();
            if (this.supportsSingleSlotSchedulingOnly!= null) {
                if (that.supportsSingleSlotSchedulingOnly!= null) {
                    if (!leftSupportsSingleSlotSchedulingOnly.equals(rightSupportsSingleSlotSchedulingOnly)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.supportsSingleSlotSchedulingOnly!= null) {
                    return false;
                }
            }
        }
        {
            Long leftAlternativesCount;
            leftAlternativesCount = this.getAlternativesCount();
            Long rightAlternativesCount;
            rightAlternativesCount = that.getAlternativesCount();
            if (this.alternativesCount!= null) {
                if (that.alternativesCount!= null) {
                    if (!leftAlternativesCount.equals(rightAlternativesCount)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.alternativesCount!= null) {
                    return false;
                }
            }
        }
        {
            Long leftTotalSequencesCountMax;
            leftTotalSequencesCountMax = this.getTotalSequencesCountMax();
            Long rightTotalSequencesCountMax;
            rightTotalSequencesCountMax = that.getTotalSequencesCountMax();
            if (this.totalSequencesCountMax!= null) {
                if (that.totalSequencesCountMax!= null) {
                    if (!leftTotalSequencesCountMax.equals(rightTotalSequencesCountMax)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.totalSequencesCountMax!= null) {
                    return false;
                }
            }
        }
        {
            Boolean leftSupportsReselection;
            leftSupportsReselection = this.getSupportsReselection();
            Boolean rightSupportsReselection;
            rightSupportsReselection = that.getSupportsReselection();
            if (this.supportsReselection!= null) {
                if (that.supportsReselection!= null) {
                    if (!leftSupportsReselection.equals(rightSupportsReselection)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.supportsReselection!= null) {
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
            Boolean theNodeRemoteControllable;
            theNodeRemoteControllable = this.getNodeRemoteControllable();
            if (this.nodeRemoteControllable!= null) {
                currentHashCode += theNodeRemoteControllable.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            Boolean theSupportsSingleSlotSchedulingOnly;
            theSupportsSingleSlotSchedulingOnly = this.getSupportsSingleSlotSchedulingOnly();
            if (this.supportsSingleSlotSchedulingOnly!= null) {
                currentHashCode += theSupportsSingleSlotSchedulingOnly.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            Long theAlternativesCount;
            theAlternativesCount = this.getAlternativesCount();
            if (this.alternativesCount!= null) {
                currentHashCode += theAlternativesCount.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            Long theTotalSequencesCountMax;
            theTotalSequencesCountMax = this.getTotalSequencesCountMax();
            if (this.totalSequencesCountMax!= null) {
                currentHashCode += theTotalSequencesCountMax.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            Boolean theSupportsReselection;
            theSupportsReselection = this.getSupportsReselection();
            if (this.supportsReselection!= null) {
                currentHashCode += theSupportsReselection.hashCode();
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
            Boolean theNodeRemoteControllable;
            theNodeRemoteControllable = this.getNodeRemoteControllable();
            strategy.appendField(locator, this, "nodeRemoteControllable", buffer, theNodeRemoteControllable, (this.nodeRemoteControllable!= null));
        }
        {
            Boolean theSupportsSingleSlotSchedulingOnly;
            theSupportsSingleSlotSchedulingOnly = this.getSupportsSingleSlotSchedulingOnly();
            strategy.appendField(locator, this, "supportsSingleSlotSchedulingOnly", buffer, theSupportsSingleSlotSchedulingOnly, (this.supportsSingleSlotSchedulingOnly!= null));
        }
        {
            Long theAlternativesCount;
            theAlternativesCount = this.getAlternativesCount();
            strategy.appendField(locator, this, "alternativesCount", buffer, theAlternativesCount, (this.alternativesCount!= null));
        }
        {
            Long theTotalSequencesCountMax;
            theTotalSequencesCountMax = this.getTotalSequencesCountMax();
            strategy.appendField(locator, this, "totalSequencesCountMax", buffer, theTotalSequencesCountMax, (this.totalSequencesCountMax!= null));
        }
        {
            Boolean theSupportsReselection;
            theSupportsReselection = this.getSupportsReselection();
            strategy.appendField(locator, this, "supportsReselection", buffer, theSupportsReselection, (this.supportsReselection!= null));
        }
        return buffer;
    }

}
