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
 * <p>Java class for PowerSequenceNodeScheduleInformationDataElementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PowerSequenceNodeScheduleInformationDataElementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nodeRemoteControllable" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="supportsSingleSlotSchedulingOnly" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="alternativesCount" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="totalSequencesCountMax" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="supportsReselection" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PowerSequenceNodeScheduleInformationDataElementsType", propOrder = {
    "nodeRemoteControllable",
    "supportsSingleSlotSchedulingOnly",
    "alternativesCount",
    "totalSequencesCountMax",
    "supportsReselection"
})
@XmlSeeAlso({
    org.openmuc.jeebus.spine.xsd.v1.SmartEnergyManagementPsDataElementsType.NodeScheduleInformation.class
})
public class PowerSequenceNodeScheduleInformationDataElementsType implements Cloneable, CopyTo, ToString
{

    protected ElementTagType nodeRemoteControllable;
    protected ElementTagType supportsSingleSlotSchedulingOnly;
    protected ElementTagType alternativesCount;
    protected ElementTagType totalSequencesCountMax;
    protected ElementTagType supportsReselection;

    /**
     * Default no-arg constructor
     * 
     */
    public PowerSequenceNodeScheduleInformationDataElementsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public PowerSequenceNodeScheduleInformationDataElementsType(final ElementTagType nodeRemoteControllable, final ElementTagType supportsSingleSlotSchedulingOnly, final ElementTagType alternativesCount, final ElementTagType totalSequencesCountMax, final ElementTagType supportsReselection) {
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
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getNodeRemoteControllable() {
        return nodeRemoteControllable;
    }

    /**
     * Sets the value of the nodeRemoteControllable property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setNodeRemoteControllable(ElementTagType value) {
        this.nodeRemoteControllable = value;
    }

    /**
     * Gets the value of the supportsSingleSlotSchedulingOnly property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getSupportsSingleSlotSchedulingOnly() {
        return supportsSingleSlotSchedulingOnly;
    }

    /**
     * Sets the value of the supportsSingleSlotSchedulingOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setSupportsSingleSlotSchedulingOnly(ElementTagType value) {
        this.supportsSingleSlotSchedulingOnly = value;
    }

    /**
     * Gets the value of the alternativesCount property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getAlternativesCount() {
        return alternativesCount;
    }

    /**
     * Sets the value of the alternativesCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setAlternativesCount(ElementTagType value) {
        this.alternativesCount = value;
    }

    /**
     * Gets the value of the totalSequencesCountMax property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getTotalSequencesCountMax() {
        return totalSequencesCountMax;
    }

    /**
     * Sets the value of the totalSequencesCountMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setTotalSequencesCountMax(ElementTagType value) {
        this.totalSequencesCountMax = value;
    }

    /**
     * Gets the value of the supportsReselection property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getSupportsReselection() {
        return supportsReselection;
    }

    /**
     * Sets the value of the supportsReselection property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setSupportsReselection(ElementTagType value) {
        this.supportsReselection = value;
    }

    /**
     * Sets the value of the nodeRemoteControllable property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public PowerSequenceNodeScheduleInformationDataElementsType withNodeRemoteControllable(ElementTagType value) {
        setNodeRemoteControllable(value);
        return this;
    }

    /**
     * Sets the value of the supportsSingleSlotSchedulingOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public PowerSequenceNodeScheduleInformationDataElementsType withSupportsSingleSlotSchedulingOnly(ElementTagType value) {
        setSupportsSingleSlotSchedulingOnly(value);
        return this;
    }

    /**
     * Sets the value of the alternativesCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public PowerSequenceNodeScheduleInformationDataElementsType withAlternativesCount(ElementTagType value) {
        setAlternativesCount(value);
        return this;
    }

    /**
     * Sets the value of the totalSequencesCountMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public PowerSequenceNodeScheduleInformationDataElementsType withTotalSequencesCountMax(ElementTagType value) {
        setTotalSequencesCountMax(value);
        return this;
    }

    /**
     * Sets the value of the supportsReselection property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public PowerSequenceNodeScheduleInformationDataElementsType withSupportsReselection(ElementTagType value) {
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
        if (draftCopy instanceof PowerSequenceNodeScheduleInformationDataElementsType) {
            final PowerSequenceNodeScheduleInformationDataElementsType copy = ((PowerSequenceNodeScheduleInformationDataElementsType) draftCopy);
            {
                Boolean nodeRemoteControllableShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.nodeRemoteControllable!= null));
                if (nodeRemoteControllableShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceNodeRemoteControllable;
                    sourceNodeRemoteControllable = this.getNodeRemoteControllable();
                    ElementTagType copyNodeRemoteControllable = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "nodeRemoteControllable", sourceNodeRemoteControllable), sourceNodeRemoteControllable, (this.nodeRemoteControllable!= null)));
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
                    ElementTagType sourceSupportsSingleSlotSchedulingOnly;
                    sourceSupportsSingleSlotSchedulingOnly = this.getSupportsSingleSlotSchedulingOnly();
                    ElementTagType copySupportsSingleSlotSchedulingOnly = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "supportsSingleSlotSchedulingOnly", sourceSupportsSingleSlotSchedulingOnly), sourceSupportsSingleSlotSchedulingOnly, (this.supportsSingleSlotSchedulingOnly!= null)));
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
                    ElementTagType sourceAlternativesCount;
                    sourceAlternativesCount = this.getAlternativesCount();
                    ElementTagType copyAlternativesCount = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "alternativesCount", sourceAlternativesCount), sourceAlternativesCount, (this.alternativesCount!= null)));
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
                    ElementTagType sourceTotalSequencesCountMax;
                    sourceTotalSequencesCountMax = this.getTotalSequencesCountMax();
                    ElementTagType copyTotalSequencesCountMax = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "totalSequencesCountMax", sourceTotalSequencesCountMax), sourceTotalSequencesCountMax, (this.totalSequencesCountMax!= null)));
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
                    ElementTagType sourceSupportsReselection;
                    sourceSupportsReselection = this.getSupportsReselection();
                    ElementTagType copySupportsReselection = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "supportsReselection", sourceSupportsReselection), sourceSupportsReselection, (this.supportsReselection!= null)));
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
        return new PowerSequenceNodeScheduleInformationDataElementsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final PowerSequenceNodeScheduleInformationDataElementsType that = ((PowerSequenceNodeScheduleInformationDataElementsType) object);
        {
            ElementTagType leftNodeRemoteControllable;
            leftNodeRemoteControllable = this.getNodeRemoteControllable();
            ElementTagType rightNodeRemoteControllable;
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
            ElementTagType leftSupportsSingleSlotSchedulingOnly;
            leftSupportsSingleSlotSchedulingOnly = this.getSupportsSingleSlotSchedulingOnly();
            ElementTagType rightSupportsSingleSlotSchedulingOnly;
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
            ElementTagType leftAlternativesCount;
            leftAlternativesCount = this.getAlternativesCount();
            ElementTagType rightAlternativesCount;
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
            ElementTagType leftTotalSequencesCountMax;
            leftTotalSequencesCountMax = this.getTotalSequencesCountMax();
            ElementTagType rightTotalSequencesCountMax;
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
            ElementTagType leftSupportsReselection;
            leftSupportsReselection = this.getSupportsReselection();
            ElementTagType rightSupportsReselection;
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
            ElementTagType theNodeRemoteControllable;
            theNodeRemoteControllable = this.getNodeRemoteControllable();
            if (this.nodeRemoteControllable!= null) {
                currentHashCode += theNodeRemoteControllable.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theSupportsSingleSlotSchedulingOnly;
            theSupportsSingleSlotSchedulingOnly = this.getSupportsSingleSlotSchedulingOnly();
            if (this.supportsSingleSlotSchedulingOnly!= null) {
                currentHashCode += theSupportsSingleSlotSchedulingOnly.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theAlternativesCount;
            theAlternativesCount = this.getAlternativesCount();
            if (this.alternativesCount!= null) {
                currentHashCode += theAlternativesCount.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theTotalSequencesCountMax;
            theTotalSequencesCountMax = this.getTotalSequencesCountMax();
            if (this.totalSequencesCountMax!= null) {
                currentHashCode += theTotalSequencesCountMax.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theSupportsReselection;
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
            ElementTagType theNodeRemoteControllable;
            theNodeRemoteControllable = this.getNodeRemoteControllable();
            strategy.appendField(locator, this, "nodeRemoteControllable", buffer, theNodeRemoteControllable, (this.nodeRemoteControllable!= null));
        }
        {
            ElementTagType theSupportsSingleSlotSchedulingOnly;
            theSupportsSingleSlotSchedulingOnly = this.getSupportsSingleSlotSchedulingOnly();
            strategy.appendField(locator, this, "supportsSingleSlotSchedulingOnly", buffer, theSupportsSingleSlotSchedulingOnly, (this.supportsSingleSlotSchedulingOnly!= null));
        }
        {
            ElementTagType theAlternativesCount;
            theAlternativesCount = this.getAlternativesCount();
            strategy.appendField(locator, this, "alternativesCount", buffer, theAlternativesCount, (this.alternativesCount!= null));
        }
        {
            ElementTagType theTotalSequencesCountMax;
            theTotalSequencesCountMax = this.getTotalSequencesCountMax();
            strategy.appendField(locator, this, "totalSequencesCountMax", buffer, theTotalSequencesCountMax, (this.totalSequencesCountMax!= null));
        }
        {
            ElementTagType theSupportsReselection;
            theSupportsReselection = this.getSupportsReselection();
            strategy.appendField(locator, this, "supportsReselection", buffer, theSupportsReselection, (this.supportsReselection!= null));
        }
        return buffer;
    }

}
