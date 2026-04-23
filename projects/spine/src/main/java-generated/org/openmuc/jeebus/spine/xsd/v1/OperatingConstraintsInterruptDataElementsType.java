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
 * <p>Java class for OperatingConstraintsInterruptDataElementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OperatingConstraintsInterruptDataElementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sequenceId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="isPausable" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="isStoppable" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="notInterruptibleAtHighPower" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="maxCyclesPerDay" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperatingConstraintsInterruptDataElementsType", propOrder = {
    "sequenceId",
    "isPausable",
    "isStoppable",
    "notInterruptibleAtHighPower",
    "maxCyclesPerDay"
})
@XmlSeeAlso({
    org.openmuc.jeebus.spine.xsd.v1.SmartEnergyManagementPsPowerSequenceElementsType.OperatingConstraintsInterrupt.class
})
public class OperatingConstraintsInterruptDataElementsType implements Cloneable, CopyTo, ToString
{

    protected ElementTagType sequenceId;
    protected ElementTagType isPausable;
    protected ElementTagType isStoppable;
    protected ElementTagType notInterruptibleAtHighPower;
    protected ElementTagType maxCyclesPerDay;

    /**
     * Default no-arg constructor
     * 
     */
    public OperatingConstraintsInterruptDataElementsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public OperatingConstraintsInterruptDataElementsType(final ElementTagType sequenceId, final ElementTagType isPausable, final ElementTagType isStoppable, final ElementTagType notInterruptibleAtHighPower, final ElementTagType maxCyclesPerDay) {
        this.sequenceId = sequenceId;
        this.isPausable = isPausable;
        this.isStoppable = isStoppable;
        this.notInterruptibleAtHighPower = notInterruptibleAtHighPower;
        this.maxCyclesPerDay = maxCyclesPerDay;
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
     * Gets the value of the isPausable property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getIsPausable() {
        return isPausable;
    }

    /**
     * Sets the value of the isPausable property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setIsPausable(ElementTagType value) {
        this.isPausable = value;
    }

    /**
     * Gets the value of the isStoppable property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getIsStoppable() {
        return isStoppable;
    }

    /**
     * Sets the value of the isStoppable property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setIsStoppable(ElementTagType value) {
        this.isStoppable = value;
    }

    /**
     * Gets the value of the notInterruptibleAtHighPower property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getNotInterruptibleAtHighPower() {
        return notInterruptibleAtHighPower;
    }

    /**
     * Sets the value of the notInterruptibleAtHighPower property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setNotInterruptibleAtHighPower(ElementTagType value) {
        this.notInterruptibleAtHighPower = value;
    }

    /**
     * Gets the value of the maxCyclesPerDay property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getMaxCyclesPerDay() {
        return maxCyclesPerDay;
    }

    /**
     * Sets the value of the maxCyclesPerDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setMaxCyclesPerDay(ElementTagType value) {
        this.maxCyclesPerDay = value;
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
    public OperatingConstraintsInterruptDataElementsType withSequenceId(ElementTagType value) {
        setSequenceId(value);
        return this;
    }

    /**
     * Sets the value of the isPausable property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public OperatingConstraintsInterruptDataElementsType withIsPausable(ElementTagType value) {
        setIsPausable(value);
        return this;
    }

    /**
     * Sets the value of the isStoppable property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public OperatingConstraintsInterruptDataElementsType withIsStoppable(ElementTagType value) {
        setIsStoppable(value);
        return this;
    }

    /**
     * Sets the value of the notInterruptibleAtHighPower property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public OperatingConstraintsInterruptDataElementsType withNotInterruptibleAtHighPower(ElementTagType value) {
        setNotInterruptibleAtHighPower(value);
        return this;
    }

    /**
     * Sets the value of the maxCyclesPerDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public OperatingConstraintsInterruptDataElementsType withMaxCyclesPerDay(ElementTagType value) {
        setMaxCyclesPerDay(value);
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
        if (draftCopy instanceof OperatingConstraintsInterruptDataElementsType) {
            final OperatingConstraintsInterruptDataElementsType copy = ((OperatingConstraintsInterruptDataElementsType) draftCopy);
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
                Boolean isPausableShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.isPausable!= null));
                if (isPausableShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceIsPausable;
                    sourceIsPausable = this.getIsPausable();
                    ElementTagType copyIsPausable = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "isPausable", sourceIsPausable), sourceIsPausable, (this.isPausable!= null)));
                    copy.setIsPausable(copyIsPausable);
                } else {
                    if (isPausableShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.isPausable = null;
                    }
                }
            }
            {
                Boolean isStoppableShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.isStoppable!= null));
                if (isStoppableShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceIsStoppable;
                    sourceIsStoppable = this.getIsStoppable();
                    ElementTagType copyIsStoppable = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "isStoppable", sourceIsStoppable), sourceIsStoppable, (this.isStoppable!= null)));
                    copy.setIsStoppable(copyIsStoppable);
                } else {
                    if (isStoppableShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.isStoppable = null;
                    }
                }
            }
            {
                Boolean notInterruptibleAtHighPowerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.notInterruptibleAtHighPower!= null));
                if (notInterruptibleAtHighPowerShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceNotInterruptibleAtHighPower;
                    sourceNotInterruptibleAtHighPower = this.getNotInterruptibleAtHighPower();
                    ElementTagType copyNotInterruptibleAtHighPower = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "notInterruptibleAtHighPower", sourceNotInterruptibleAtHighPower), sourceNotInterruptibleAtHighPower, (this.notInterruptibleAtHighPower!= null)));
                    copy.setNotInterruptibleAtHighPower(copyNotInterruptibleAtHighPower);
                } else {
                    if (notInterruptibleAtHighPowerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.notInterruptibleAtHighPower = null;
                    }
                }
            }
            {
                Boolean maxCyclesPerDayShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.maxCyclesPerDay!= null));
                if (maxCyclesPerDayShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceMaxCyclesPerDay;
                    sourceMaxCyclesPerDay = this.getMaxCyclesPerDay();
                    ElementTagType copyMaxCyclesPerDay = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "maxCyclesPerDay", sourceMaxCyclesPerDay), sourceMaxCyclesPerDay, (this.maxCyclesPerDay!= null)));
                    copy.setMaxCyclesPerDay(copyMaxCyclesPerDay);
                } else {
                    if (maxCyclesPerDayShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.maxCyclesPerDay = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new OperatingConstraintsInterruptDataElementsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final OperatingConstraintsInterruptDataElementsType that = ((OperatingConstraintsInterruptDataElementsType) object);
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
            ElementTagType leftIsPausable;
            leftIsPausable = this.getIsPausable();
            ElementTagType rightIsPausable;
            rightIsPausable = that.getIsPausable();
            if (this.isPausable!= null) {
                if (that.isPausable!= null) {
                    if (!leftIsPausable.equals(rightIsPausable)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.isPausable!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftIsStoppable;
            leftIsStoppable = this.getIsStoppable();
            ElementTagType rightIsStoppable;
            rightIsStoppable = that.getIsStoppable();
            if (this.isStoppable!= null) {
                if (that.isStoppable!= null) {
                    if (!leftIsStoppable.equals(rightIsStoppable)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.isStoppable!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftNotInterruptibleAtHighPower;
            leftNotInterruptibleAtHighPower = this.getNotInterruptibleAtHighPower();
            ElementTagType rightNotInterruptibleAtHighPower;
            rightNotInterruptibleAtHighPower = that.getNotInterruptibleAtHighPower();
            if (this.notInterruptibleAtHighPower!= null) {
                if (that.notInterruptibleAtHighPower!= null) {
                    if (!leftNotInterruptibleAtHighPower.equals(rightNotInterruptibleAtHighPower)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.notInterruptibleAtHighPower!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftMaxCyclesPerDay;
            leftMaxCyclesPerDay = this.getMaxCyclesPerDay();
            ElementTagType rightMaxCyclesPerDay;
            rightMaxCyclesPerDay = that.getMaxCyclesPerDay();
            if (this.maxCyclesPerDay!= null) {
                if (that.maxCyclesPerDay!= null) {
                    if (!leftMaxCyclesPerDay.equals(rightMaxCyclesPerDay)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.maxCyclesPerDay!= null) {
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
            ElementTagType theIsPausable;
            theIsPausable = this.getIsPausable();
            if (this.isPausable!= null) {
                currentHashCode += theIsPausable.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theIsStoppable;
            theIsStoppable = this.getIsStoppable();
            if (this.isStoppable!= null) {
                currentHashCode += theIsStoppable.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theNotInterruptibleAtHighPower;
            theNotInterruptibleAtHighPower = this.getNotInterruptibleAtHighPower();
            if (this.notInterruptibleAtHighPower!= null) {
                currentHashCode += theNotInterruptibleAtHighPower.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theMaxCyclesPerDay;
            theMaxCyclesPerDay = this.getMaxCyclesPerDay();
            if (this.maxCyclesPerDay!= null) {
                currentHashCode += theMaxCyclesPerDay.hashCode();
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
            ElementTagType theIsPausable;
            theIsPausable = this.getIsPausable();
            strategy.appendField(locator, this, "isPausable", buffer, theIsPausable, (this.isPausable!= null));
        }
        {
            ElementTagType theIsStoppable;
            theIsStoppable = this.getIsStoppable();
            strategy.appendField(locator, this, "isStoppable", buffer, theIsStoppable, (this.isStoppable!= null));
        }
        {
            ElementTagType theNotInterruptibleAtHighPower;
            theNotInterruptibleAtHighPower = this.getNotInterruptibleAtHighPower();
            strategy.appendField(locator, this, "notInterruptibleAtHighPower", buffer, theNotInterruptibleAtHighPower, (this.notInterruptibleAtHighPower!= null));
        }
        {
            ElementTagType theMaxCyclesPerDay;
            theMaxCyclesPerDay = this.getMaxCyclesPerDay();
            strategy.appendField(locator, this, "maxCyclesPerDay", buffer, theMaxCyclesPerDay, (this.maxCyclesPerDay!= null));
        }
        return buffer;
    }

}
