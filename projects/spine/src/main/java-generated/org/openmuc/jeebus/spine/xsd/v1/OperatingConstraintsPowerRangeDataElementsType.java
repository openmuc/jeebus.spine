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
 * <p>Java class for OperatingConstraintsPowerRangeDataElementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OperatingConstraintsPowerRangeDataElementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sequenceId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="powerMin" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberElementsType" minOccurs="0"/&gt;
 *         &lt;element name="powerMax" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberElementsType" minOccurs="0"/&gt;
 *         &lt;element name="energyMin" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberElementsType" minOccurs="0"/&gt;
 *         &lt;element name="energyMax" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberElementsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperatingConstraintsPowerRangeDataElementsType", propOrder = {
    "sequenceId",
    "powerMin",
    "powerMax",
    "energyMin",
    "energyMax"
})
public class OperatingConstraintsPowerRangeDataElementsType implements Cloneable, CopyTo, ToString
{

    protected ElementTagType sequenceId;
    protected ScaledNumberElementsType powerMin;
    protected ScaledNumberElementsType powerMax;
    protected ScaledNumberElementsType energyMin;
    protected ScaledNumberElementsType energyMax;

    /**
     * Default no-arg constructor
     * 
     */
    public OperatingConstraintsPowerRangeDataElementsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public OperatingConstraintsPowerRangeDataElementsType(final ElementTagType sequenceId, final ScaledNumberElementsType powerMin, final ScaledNumberElementsType powerMax, final ScaledNumberElementsType energyMin, final ScaledNumberElementsType energyMax) {
        this.sequenceId = sequenceId;
        this.powerMin = powerMin;
        this.powerMax = powerMax;
        this.energyMin = energyMin;
        this.energyMax = energyMax;
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
     * Gets the value of the powerMin property.
     * 
     * @return
     *     possible object is
     *     {@link ScaledNumberElementsType }
     *     
     */
    public ScaledNumberElementsType getPowerMin() {
        return powerMin;
    }

    /**
     * Sets the value of the powerMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberElementsType }
     *     
     */
    public void setPowerMin(ScaledNumberElementsType value) {
        this.powerMin = value;
    }

    /**
     * Gets the value of the powerMax property.
     * 
     * @return
     *     possible object is
     *     {@link ScaledNumberElementsType }
     *     
     */
    public ScaledNumberElementsType getPowerMax() {
        return powerMax;
    }

    /**
     * Sets the value of the powerMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberElementsType }
     *     
     */
    public void setPowerMax(ScaledNumberElementsType value) {
        this.powerMax = value;
    }

    /**
     * Gets the value of the energyMin property.
     * 
     * @return
     *     possible object is
     *     {@link ScaledNumberElementsType }
     *     
     */
    public ScaledNumberElementsType getEnergyMin() {
        return energyMin;
    }

    /**
     * Sets the value of the energyMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberElementsType }
     *     
     */
    public void setEnergyMin(ScaledNumberElementsType value) {
        this.energyMin = value;
    }

    /**
     * Gets the value of the energyMax property.
     * 
     * @return
     *     possible object is
     *     {@link ScaledNumberElementsType }
     *     
     */
    public ScaledNumberElementsType getEnergyMax() {
        return energyMax;
    }

    /**
     * Sets the value of the energyMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberElementsType }
     *     
     */
    public void setEnergyMax(ScaledNumberElementsType value) {
        this.energyMax = value;
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
    public OperatingConstraintsPowerRangeDataElementsType withSequenceId(ElementTagType value) {
        setSequenceId(value);
        return this;
    }

    /**
     * Sets the value of the powerMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberElementsType }
     * @return
     *     The class instance
     */
    public OperatingConstraintsPowerRangeDataElementsType withPowerMin(ScaledNumberElementsType value) {
        setPowerMin(value);
        return this;
    }

    /**
     * Sets the value of the powerMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberElementsType }
     * @return
     *     The class instance
     */
    public OperatingConstraintsPowerRangeDataElementsType withPowerMax(ScaledNumberElementsType value) {
        setPowerMax(value);
        return this;
    }

    /**
     * Sets the value of the energyMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberElementsType }
     * @return
     *     The class instance
     */
    public OperatingConstraintsPowerRangeDataElementsType withEnergyMin(ScaledNumberElementsType value) {
        setEnergyMin(value);
        return this;
    }

    /**
     * Sets the value of the energyMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberElementsType }
     * @return
     *     The class instance
     */
    public OperatingConstraintsPowerRangeDataElementsType withEnergyMax(ScaledNumberElementsType value) {
        setEnergyMax(value);
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
        if (draftCopy instanceof OperatingConstraintsPowerRangeDataElementsType) {
            final OperatingConstraintsPowerRangeDataElementsType copy = ((OperatingConstraintsPowerRangeDataElementsType) draftCopy);
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
                Boolean powerMinShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.powerMin!= null));
                if (powerMinShouldBeCopiedAndSet == Boolean.TRUE) {
                    ScaledNumberElementsType sourcePowerMin;
                    sourcePowerMin = this.getPowerMin();
                    ScaledNumberElementsType copyPowerMin = ((ScaledNumberElementsType) strategy.copy(LocatorUtils.property(locator, "powerMin", sourcePowerMin), sourcePowerMin, (this.powerMin!= null)));
                    copy.setPowerMin(copyPowerMin);
                } else {
                    if (powerMinShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.powerMin = null;
                    }
                }
            }
            {
                Boolean powerMaxShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.powerMax!= null));
                if (powerMaxShouldBeCopiedAndSet == Boolean.TRUE) {
                    ScaledNumberElementsType sourcePowerMax;
                    sourcePowerMax = this.getPowerMax();
                    ScaledNumberElementsType copyPowerMax = ((ScaledNumberElementsType) strategy.copy(LocatorUtils.property(locator, "powerMax", sourcePowerMax), sourcePowerMax, (this.powerMax!= null)));
                    copy.setPowerMax(copyPowerMax);
                } else {
                    if (powerMaxShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.powerMax = null;
                    }
                }
            }
            {
                Boolean energyMinShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.energyMin!= null));
                if (energyMinShouldBeCopiedAndSet == Boolean.TRUE) {
                    ScaledNumberElementsType sourceEnergyMin;
                    sourceEnergyMin = this.getEnergyMin();
                    ScaledNumberElementsType copyEnergyMin = ((ScaledNumberElementsType) strategy.copy(LocatorUtils.property(locator, "energyMin", sourceEnergyMin), sourceEnergyMin, (this.energyMin!= null)));
                    copy.setEnergyMin(copyEnergyMin);
                } else {
                    if (energyMinShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.energyMin = null;
                    }
                }
            }
            {
                Boolean energyMaxShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.energyMax!= null));
                if (energyMaxShouldBeCopiedAndSet == Boolean.TRUE) {
                    ScaledNumberElementsType sourceEnergyMax;
                    sourceEnergyMax = this.getEnergyMax();
                    ScaledNumberElementsType copyEnergyMax = ((ScaledNumberElementsType) strategy.copy(LocatorUtils.property(locator, "energyMax", sourceEnergyMax), sourceEnergyMax, (this.energyMax!= null)));
                    copy.setEnergyMax(copyEnergyMax);
                } else {
                    if (energyMaxShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.energyMax = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new OperatingConstraintsPowerRangeDataElementsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final OperatingConstraintsPowerRangeDataElementsType that = ((OperatingConstraintsPowerRangeDataElementsType) object);
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
            ScaledNumberElementsType leftPowerMin;
            leftPowerMin = this.getPowerMin();
            ScaledNumberElementsType rightPowerMin;
            rightPowerMin = that.getPowerMin();
            if (this.powerMin!= null) {
                if (that.powerMin!= null) {
                    if (!leftPowerMin.equals(rightPowerMin)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.powerMin!= null) {
                    return false;
                }
            }
        }
        {
            ScaledNumberElementsType leftPowerMax;
            leftPowerMax = this.getPowerMax();
            ScaledNumberElementsType rightPowerMax;
            rightPowerMax = that.getPowerMax();
            if (this.powerMax!= null) {
                if (that.powerMax!= null) {
                    if (!leftPowerMax.equals(rightPowerMax)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.powerMax!= null) {
                    return false;
                }
            }
        }
        {
            ScaledNumberElementsType leftEnergyMin;
            leftEnergyMin = this.getEnergyMin();
            ScaledNumberElementsType rightEnergyMin;
            rightEnergyMin = that.getEnergyMin();
            if (this.energyMin!= null) {
                if (that.energyMin!= null) {
                    if (!leftEnergyMin.equals(rightEnergyMin)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.energyMin!= null) {
                    return false;
                }
            }
        }
        {
            ScaledNumberElementsType leftEnergyMax;
            leftEnergyMax = this.getEnergyMax();
            ScaledNumberElementsType rightEnergyMax;
            rightEnergyMax = that.getEnergyMax();
            if (this.energyMax!= null) {
                if (that.energyMax!= null) {
                    if (!leftEnergyMax.equals(rightEnergyMax)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.energyMax!= null) {
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
            ScaledNumberElementsType thePowerMin;
            thePowerMin = this.getPowerMin();
            if (this.powerMin!= null) {
                currentHashCode += thePowerMin.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ScaledNumberElementsType thePowerMax;
            thePowerMax = this.getPowerMax();
            if (this.powerMax!= null) {
                currentHashCode += thePowerMax.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ScaledNumberElementsType theEnergyMin;
            theEnergyMin = this.getEnergyMin();
            if (this.energyMin!= null) {
                currentHashCode += theEnergyMin.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ScaledNumberElementsType theEnergyMax;
            theEnergyMax = this.getEnergyMax();
            if (this.energyMax!= null) {
                currentHashCode += theEnergyMax.hashCode();
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
            ScaledNumberElementsType thePowerMin;
            thePowerMin = this.getPowerMin();
            strategy.appendField(locator, this, "powerMin", buffer, thePowerMin, (this.powerMin!= null));
        }
        {
            ScaledNumberElementsType thePowerMax;
            thePowerMax = this.getPowerMax();
            strategy.appendField(locator, this, "powerMax", buffer, thePowerMax, (this.powerMax!= null));
        }
        {
            ScaledNumberElementsType theEnergyMin;
            theEnergyMin = this.getEnergyMin();
            strategy.appendField(locator, this, "energyMin", buffer, theEnergyMin, (this.energyMin!= null));
        }
        {
            ScaledNumberElementsType theEnergyMax;
            theEnergyMax = this.getEnergyMax();
            strategy.appendField(locator, this, "energyMax", buffer, theEnergyMax, (this.energyMax!= null));
        }
        return buffer;
    }

}
