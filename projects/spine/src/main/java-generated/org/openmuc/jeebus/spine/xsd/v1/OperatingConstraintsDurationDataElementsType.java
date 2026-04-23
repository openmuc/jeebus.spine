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
 * <p>Java class for OperatingConstraintsDurationDataElementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OperatingConstraintsDurationDataElementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sequenceId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="activeDurationMin" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="activeDurationMax" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="pauseDurationMin" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="pauseDurationMax" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="activeDurationSumMin" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="activeDurationSumMax" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperatingConstraintsDurationDataElementsType", propOrder = {
    "sequenceId",
    "activeDurationMin",
    "activeDurationMax",
    "pauseDurationMin",
    "pauseDurationMax",
    "activeDurationSumMin",
    "activeDurationSumMax"
})
@XmlSeeAlso({
    org.openmuc.jeebus.spine.xsd.v1.SmartEnergyManagementPsPowerSequenceElementsType.OperatingConstraintsDuration.class
})
public class OperatingConstraintsDurationDataElementsType implements Cloneable, CopyTo, ToString
{

    protected ElementTagType sequenceId;
    protected ElementTagType activeDurationMin;
    protected ElementTagType activeDurationMax;
    protected ElementTagType pauseDurationMin;
    protected ElementTagType pauseDurationMax;
    protected ElementTagType activeDurationSumMin;
    protected ElementTagType activeDurationSumMax;

    /**
     * Default no-arg constructor
     * 
     */
    public OperatingConstraintsDurationDataElementsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public OperatingConstraintsDurationDataElementsType(final ElementTagType sequenceId, final ElementTagType activeDurationMin, final ElementTagType activeDurationMax, final ElementTagType pauseDurationMin, final ElementTagType pauseDurationMax, final ElementTagType activeDurationSumMin, final ElementTagType activeDurationSumMax) {
        this.sequenceId = sequenceId;
        this.activeDurationMin = activeDurationMin;
        this.activeDurationMax = activeDurationMax;
        this.pauseDurationMin = pauseDurationMin;
        this.pauseDurationMax = pauseDurationMax;
        this.activeDurationSumMin = activeDurationSumMin;
        this.activeDurationSumMax = activeDurationSumMax;
    }

    /**
     * Gets the value of the sequenceId property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getSequenceId() {
        return sequenceId;
    }

    /**
     * Sets the value of the sequenceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setSequenceId(ElementTagType value) {
        this.sequenceId = value;
    }

    /**
     * Gets the value of the activeDurationMin property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getActiveDurationMin() {
        return activeDurationMin;
    }

    /**
     * Sets the value of the activeDurationMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setActiveDurationMin(ElementTagType value) {
        this.activeDurationMin = value;
    }

    /**
     * Gets the value of the activeDurationMax property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getActiveDurationMax() {
        return activeDurationMax;
    }

    /**
     * Sets the value of the activeDurationMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setActiveDurationMax(ElementTagType value) {
        this.activeDurationMax = value;
    }

    /**
     * Gets the value of the pauseDurationMin property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getPauseDurationMin() {
        return pauseDurationMin;
    }

    /**
     * Sets the value of the pauseDurationMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setPauseDurationMin(ElementTagType value) {
        this.pauseDurationMin = value;
    }

    /**
     * Gets the value of the pauseDurationMax property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getPauseDurationMax() {
        return pauseDurationMax;
    }

    /**
     * Sets the value of the pauseDurationMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setPauseDurationMax(ElementTagType value) {
        this.pauseDurationMax = value;
    }

    /**
     * Gets the value of the activeDurationSumMin property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getActiveDurationSumMin() {
        return activeDurationSumMin;
    }

    /**
     * Sets the value of the activeDurationSumMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setActiveDurationSumMin(ElementTagType value) {
        this.activeDurationSumMin = value;
    }

    /**
     * Gets the value of the activeDurationSumMax property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getActiveDurationSumMax() {
        return activeDurationSumMax;
    }

    /**
     * Sets the value of the activeDurationSumMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setActiveDurationSumMax(ElementTagType value) {
        this.activeDurationSumMax = value;
    }

    /**
     * Sets the value of the sequenceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public OperatingConstraintsDurationDataElementsType withSequenceId(ElementTagType value) {
        setSequenceId(value);
        return this;
    }

    /**
     * Sets the value of the activeDurationMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public OperatingConstraintsDurationDataElementsType withActiveDurationMin(ElementTagType value) {
        setActiveDurationMin(value);
        return this;
    }

    /**
     * Sets the value of the activeDurationMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public OperatingConstraintsDurationDataElementsType withActiveDurationMax(ElementTagType value) {
        setActiveDurationMax(value);
        return this;
    }

    /**
     * Sets the value of the pauseDurationMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public OperatingConstraintsDurationDataElementsType withPauseDurationMin(ElementTagType value) {
        setPauseDurationMin(value);
        return this;
    }

    /**
     * Sets the value of the pauseDurationMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public OperatingConstraintsDurationDataElementsType withPauseDurationMax(ElementTagType value) {
        setPauseDurationMax(value);
        return this;
    }

    /**
     * Sets the value of the activeDurationSumMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public OperatingConstraintsDurationDataElementsType withActiveDurationSumMin(ElementTagType value) {
        setActiveDurationSumMin(value);
        return this;
    }

    /**
     * Sets the value of the activeDurationSumMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public OperatingConstraintsDurationDataElementsType withActiveDurationSumMax(ElementTagType value) {
        setActiveDurationSumMax(value);
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
        if (draftCopy instanceof OperatingConstraintsDurationDataElementsType) {
            final OperatingConstraintsDurationDataElementsType copy = ((OperatingConstraintsDurationDataElementsType) draftCopy);
            {
                Boolean sequenceIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.sequenceId!= null));
                if (sequenceIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceSequenceId;
                    sourceSequenceId = this.getSequenceId();
                    ElementTagType copySequenceId = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "sequenceId", sourceSequenceId), sourceSequenceId, (this.sequenceId!= null)));
                    copy.setSequenceId(copySequenceId);
                } else {
                    if (sequenceIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.sequenceId = null;
                    }
                }
            }
            {
                Boolean activeDurationMinShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.activeDurationMin!= null));
                if (activeDurationMinShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceActiveDurationMin;
                    sourceActiveDurationMin = this.getActiveDurationMin();
                    ElementTagType copyActiveDurationMin = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "activeDurationMin", sourceActiveDurationMin), sourceActiveDurationMin, (this.activeDurationMin!= null)));
                    copy.setActiveDurationMin(copyActiveDurationMin);
                } else {
                    if (activeDurationMinShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.activeDurationMin = null;
                    }
                }
            }
            {
                Boolean activeDurationMaxShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.activeDurationMax!= null));
                if (activeDurationMaxShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceActiveDurationMax;
                    sourceActiveDurationMax = this.getActiveDurationMax();
                    ElementTagType copyActiveDurationMax = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "activeDurationMax", sourceActiveDurationMax), sourceActiveDurationMax, (this.activeDurationMax!= null)));
                    copy.setActiveDurationMax(copyActiveDurationMax);
                } else {
                    if (activeDurationMaxShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.activeDurationMax = null;
                    }
                }
            }
            {
                Boolean pauseDurationMinShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.pauseDurationMin!= null));
                if (pauseDurationMinShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourcePauseDurationMin;
                    sourcePauseDurationMin = this.getPauseDurationMin();
                    ElementTagType copyPauseDurationMin = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "pauseDurationMin", sourcePauseDurationMin), sourcePauseDurationMin, (this.pauseDurationMin!= null)));
                    copy.setPauseDurationMin(copyPauseDurationMin);
                } else {
                    if (pauseDurationMinShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.pauseDurationMin = null;
                    }
                }
            }
            {
                Boolean pauseDurationMaxShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.pauseDurationMax!= null));
                if (pauseDurationMaxShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourcePauseDurationMax;
                    sourcePauseDurationMax = this.getPauseDurationMax();
                    ElementTagType copyPauseDurationMax = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "pauseDurationMax", sourcePauseDurationMax), sourcePauseDurationMax, (this.pauseDurationMax!= null)));
                    copy.setPauseDurationMax(copyPauseDurationMax);
                } else {
                    if (pauseDurationMaxShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.pauseDurationMax = null;
                    }
                }
            }
            {
                Boolean activeDurationSumMinShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.activeDurationSumMin!= null));
                if (activeDurationSumMinShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceActiveDurationSumMin;
                    sourceActiveDurationSumMin = this.getActiveDurationSumMin();
                    ElementTagType copyActiveDurationSumMin = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "activeDurationSumMin", sourceActiveDurationSumMin), sourceActiveDurationSumMin, (this.activeDurationSumMin!= null)));
                    copy.setActiveDurationSumMin(copyActiveDurationSumMin);
                } else {
                    if (activeDurationSumMinShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.activeDurationSumMin = null;
                    }
                }
            }
            {
                Boolean activeDurationSumMaxShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.activeDurationSumMax!= null));
                if (activeDurationSumMaxShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceActiveDurationSumMax;
                    sourceActiveDurationSumMax = this.getActiveDurationSumMax();
                    ElementTagType copyActiveDurationSumMax = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "activeDurationSumMax", sourceActiveDurationSumMax), sourceActiveDurationSumMax, (this.activeDurationSumMax!= null)));
                    copy.setActiveDurationSumMax(copyActiveDurationSumMax);
                } else {
                    if (activeDurationSumMaxShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.activeDurationSumMax = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new OperatingConstraintsDurationDataElementsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final OperatingConstraintsDurationDataElementsType that = ((OperatingConstraintsDurationDataElementsType) object);
        {
            ElementTagType leftSequenceId;
            leftSequenceId = this.getSequenceId();
            ElementTagType rightSequenceId;
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
            ElementTagType leftActiveDurationMin;
            leftActiveDurationMin = this.getActiveDurationMin();
            ElementTagType rightActiveDurationMin;
            rightActiveDurationMin = that.getActiveDurationMin();
            if (this.activeDurationMin!= null) {
                if (that.activeDurationMin!= null) {
                    if (!leftActiveDurationMin.equals(rightActiveDurationMin)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.activeDurationMin!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftActiveDurationMax;
            leftActiveDurationMax = this.getActiveDurationMax();
            ElementTagType rightActiveDurationMax;
            rightActiveDurationMax = that.getActiveDurationMax();
            if (this.activeDurationMax!= null) {
                if (that.activeDurationMax!= null) {
                    if (!leftActiveDurationMax.equals(rightActiveDurationMax)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.activeDurationMax!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftPauseDurationMin;
            leftPauseDurationMin = this.getPauseDurationMin();
            ElementTagType rightPauseDurationMin;
            rightPauseDurationMin = that.getPauseDurationMin();
            if (this.pauseDurationMin!= null) {
                if (that.pauseDurationMin!= null) {
                    if (!leftPauseDurationMin.equals(rightPauseDurationMin)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.pauseDurationMin!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftPauseDurationMax;
            leftPauseDurationMax = this.getPauseDurationMax();
            ElementTagType rightPauseDurationMax;
            rightPauseDurationMax = that.getPauseDurationMax();
            if (this.pauseDurationMax!= null) {
                if (that.pauseDurationMax!= null) {
                    if (!leftPauseDurationMax.equals(rightPauseDurationMax)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.pauseDurationMax!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftActiveDurationSumMin;
            leftActiveDurationSumMin = this.getActiveDurationSumMin();
            ElementTagType rightActiveDurationSumMin;
            rightActiveDurationSumMin = that.getActiveDurationSumMin();
            if (this.activeDurationSumMin!= null) {
                if (that.activeDurationSumMin!= null) {
                    if (!leftActiveDurationSumMin.equals(rightActiveDurationSumMin)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.activeDurationSumMin!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftActiveDurationSumMax;
            leftActiveDurationSumMax = this.getActiveDurationSumMax();
            ElementTagType rightActiveDurationSumMax;
            rightActiveDurationSumMax = that.getActiveDurationSumMax();
            if (this.activeDurationSumMax!= null) {
                if (that.activeDurationSumMax!= null) {
                    if (!leftActiveDurationSumMax.equals(rightActiveDurationSumMax)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.activeDurationSumMax!= null) {
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
            ElementTagType theSequenceId;
            theSequenceId = this.getSequenceId();
            if (this.sequenceId!= null) {
                currentHashCode += theSequenceId.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theActiveDurationMin;
            theActiveDurationMin = this.getActiveDurationMin();
            if (this.activeDurationMin!= null) {
                currentHashCode += theActiveDurationMin.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theActiveDurationMax;
            theActiveDurationMax = this.getActiveDurationMax();
            if (this.activeDurationMax!= null) {
                currentHashCode += theActiveDurationMax.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType thePauseDurationMin;
            thePauseDurationMin = this.getPauseDurationMin();
            if (this.pauseDurationMin!= null) {
                currentHashCode += thePauseDurationMin.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType thePauseDurationMax;
            thePauseDurationMax = this.getPauseDurationMax();
            if (this.pauseDurationMax!= null) {
                currentHashCode += thePauseDurationMax.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theActiveDurationSumMin;
            theActiveDurationSumMin = this.getActiveDurationSumMin();
            if (this.activeDurationSumMin!= null) {
                currentHashCode += theActiveDurationSumMin.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theActiveDurationSumMax;
            theActiveDurationSumMax = this.getActiveDurationSumMax();
            if (this.activeDurationSumMax!= null) {
                currentHashCode += theActiveDurationSumMax.hashCode();
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
            ElementTagType theSequenceId;
            theSequenceId = this.getSequenceId();
            strategy.appendField(locator, this, "sequenceId", buffer, theSequenceId, (this.sequenceId!= null));
        }
        {
            ElementTagType theActiveDurationMin;
            theActiveDurationMin = this.getActiveDurationMin();
            strategy.appendField(locator, this, "activeDurationMin", buffer, theActiveDurationMin, (this.activeDurationMin!= null));
        }
        {
            ElementTagType theActiveDurationMax;
            theActiveDurationMax = this.getActiveDurationMax();
            strategy.appendField(locator, this, "activeDurationMax", buffer, theActiveDurationMax, (this.activeDurationMax!= null));
        }
        {
            ElementTagType thePauseDurationMin;
            thePauseDurationMin = this.getPauseDurationMin();
            strategy.appendField(locator, this, "pauseDurationMin", buffer, thePauseDurationMin, (this.pauseDurationMin!= null));
        }
        {
            ElementTagType thePauseDurationMax;
            thePauseDurationMax = this.getPauseDurationMax();
            strategy.appendField(locator, this, "pauseDurationMax", buffer, thePauseDurationMax, (this.pauseDurationMax!= null));
        }
        {
            ElementTagType theActiveDurationSumMin;
            theActiveDurationSumMin = this.getActiveDurationSumMin();
            strategy.appendField(locator, this, "activeDurationSumMin", buffer, theActiveDurationSumMin, (this.activeDurationSumMin!= null));
        }
        {
            ElementTagType theActiveDurationSumMax;
            theActiveDurationSumMax = this.getActiveDurationSumMax();
            strategy.appendField(locator, this, "activeDurationSumMax", buffer, theActiveDurationSumMax, (this.activeDurationSumMax!= null));
        }
        return buffer;
    }

}
