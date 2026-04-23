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
 * <p>Java class for OperatingConstraintsResumeImplicationDataElementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OperatingConstraintsResumeImplicationDataElementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sequenceId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="resumeEnergyEstimated" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberElementsType" minOccurs="0"/&gt;
 *         &lt;element name="energyUnit" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="resumeCostEstimated" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberElementsType" minOccurs="0"/&gt;
 *         &lt;element name="currency" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperatingConstraintsResumeImplicationDataElementsType", propOrder = {
    "sequenceId",
    "resumeEnergyEstimated",
    "energyUnit",
    "resumeCostEstimated",
    "currency"
})
@XmlSeeAlso({
    org.openmuc.jeebus.spine.xsd.v1.SmartEnergyManagementPsPowerSequenceElementsType.OperatingConstraintsResumeImplication.class
})
public class OperatingConstraintsResumeImplicationDataElementsType implements Cloneable, CopyTo, ToString
{

    protected ElementTagType sequenceId;
    protected ScaledNumberElementsType resumeEnergyEstimated;
    protected ElementTagType energyUnit;
    protected ScaledNumberElementsType resumeCostEstimated;
    protected ElementTagType currency;

    /**
     * Default no-arg constructor
     * 
     */
    public OperatingConstraintsResumeImplicationDataElementsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public OperatingConstraintsResumeImplicationDataElementsType(final ElementTagType sequenceId, final ScaledNumberElementsType resumeEnergyEstimated, final ElementTagType energyUnit, final ScaledNumberElementsType resumeCostEstimated, final ElementTagType currency) {
        this.sequenceId = sequenceId;
        this.resumeEnergyEstimated = resumeEnergyEstimated;
        this.energyUnit = energyUnit;
        this.resumeCostEstimated = resumeCostEstimated;
        this.currency = currency;
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
     * Gets the value of the resumeEnergyEstimated property.
     * 
     * @return
     *     possible object is
     *     {@link ScaledNumberElementsType }
     *     
     */
    public ScaledNumberElementsType getResumeEnergyEstimated() {
        return resumeEnergyEstimated;
    }

    /**
     * Sets the value of the resumeEnergyEstimated property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberElementsType }
     *     
     */
    public void setResumeEnergyEstimated(ScaledNumberElementsType value) {
        this.resumeEnergyEstimated = value;
    }

    /**
     * Gets the value of the energyUnit property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getEnergyUnit() {
        return energyUnit;
    }

    /**
     * Sets the value of the energyUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setEnergyUnit(ElementTagType value) {
        this.energyUnit = value;
    }

    /**
     * Gets the value of the resumeCostEstimated property.
     * 
     * @return
     *     possible object is
     *     {@link ScaledNumberElementsType }
     *     
     */
    public ScaledNumberElementsType getResumeCostEstimated() {
        return resumeCostEstimated;
    }

    /**
     * Sets the value of the resumeCostEstimated property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberElementsType }
     *     
     */
    public void setResumeCostEstimated(ScaledNumberElementsType value) {
        this.resumeCostEstimated = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setCurrency(ElementTagType value) {
        this.currency = value;
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
    public OperatingConstraintsResumeImplicationDataElementsType withSequenceId(ElementTagType value) {
        setSequenceId(value);
        return this;
    }

    /**
     * Sets the value of the resumeEnergyEstimated property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberElementsType }
     * @return
     *     The class instance
     */
    public OperatingConstraintsResumeImplicationDataElementsType withResumeEnergyEstimated(ScaledNumberElementsType value) {
        setResumeEnergyEstimated(value);
        return this;
    }

    /**
     * Sets the value of the energyUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public OperatingConstraintsResumeImplicationDataElementsType withEnergyUnit(ElementTagType value) {
        setEnergyUnit(value);
        return this;
    }

    /**
     * Sets the value of the resumeCostEstimated property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberElementsType }
     * @return
     *     The class instance
     */
    public OperatingConstraintsResumeImplicationDataElementsType withResumeCostEstimated(ScaledNumberElementsType value) {
        setResumeCostEstimated(value);
        return this;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public OperatingConstraintsResumeImplicationDataElementsType withCurrency(ElementTagType value) {
        setCurrency(value);
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
        if (draftCopy instanceof OperatingConstraintsResumeImplicationDataElementsType) {
            final OperatingConstraintsResumeImplicationDataElementsType copy = ((OperatingConstraintsResumeImplicationDataElementsType) draftCopy);
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
                Boolean resumeEnergyEstimatedShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.resumeEnergyEstimated!= null));
                if (resumeEnergyEstimatedShouldBeCopiedAndSet == Boolean.TRUE) {
                    ScaledNumberElementsType sourceResumeEnergyEstimated;
                    sourceResumeEnergyEstimated = this.getResumeEnergyEstimated();
                    ScaledNumberElementsType copyResumeEnergyEstimated = ((ScaledNumberElementsType) strategy.copy(LocatorUtils.property(locator, "resumeEnergyEstimated", sourceResumeEnergyEstimated), sourceResumeEnergyEstimated, (this.resumeEnergyEstimated!= null)));
                    copy.setResumeEnergyEstimated(copyResumeEnergyEstimated);
                } else {
                    if (resumeEnergyEstimatedShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.resumeEnergyEstimated = null;
                    }
                }
            }
            {
                Boolean energyUnitShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.energyUnit!= null));
                if (energyUnitShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceEnergyUnit;
                    sourceEnergyUnit = this.getEnergyUnit();
                    ElementTagType copyEnergyUnit = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "energyUnit", sourceEnergyUnit), sourceEnergyUnit, (this.energyUnit!= null)));
                    copy.setEnergyUnit(copyEnergyUnit);
                } else {
                    if (energyUnitShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.energyUnit = null;
                    }
                }
            }
            {
                Boolean resumeCostEstimatedShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.resumeCostEstimated!= null));
                if (resumeCostEstimatedShouldBeCopiedAndSet == Boolean.TRUE) {
                    ScaledNumberElementsType sourceResumeCostEstimated;
                    sourceResumeCostEstimated = this.getResumeCostEstimated();
                    ScaledNumberElementsType copyResumeCostEstimated = ((ScaledNumberElementsType) strategy.copy(LocatorUtils.property(locator, "resumeCostEstimated", sourceResumeCostEstimated), sourceResumeCostEstimated, (this.resumeCostEstimated!= null)));
                    copy.setResumeCostEstimated(copyResumeCostEstimated);
                } else {
                    if (resumeCostEstimatedShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.resumeCostEstimated = null;
                    }
                }
            }
            {
                Boolean currencyShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.currency!= null));
                if (currencyShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceCurrency;
                    sourceCurrency = this.getCurrency();
                    ElementTagType copyCurrency = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "currency", sourceCurrency), sourceCurrency, (this.currency!= null)));
                    copy.setCurrency(copyCurrency);
                } else {
                    if (currencyShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.currency = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new OperatingConstraintsResumeImplicationDataElementsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final OperatingConstraintsResumeImplicationDataElementsType that = ((OperatingConstraintsResumeImplicationDataElementsType) object);
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
            ScaledNumberElementsType leftResumeEnergyEstimated;
            leftResumeEnergyEstimated = this.getResumeEnergyEstimated();
            ScaledNumberElementsType rightResumeEnergyEstimated;
            rightResumeEnergyEstimated = that.getResumeEnergyEstimated();
            if (this.resumeEnergyEstimated!= null) {
                if (that.resumeEnergyEstimated!= null) {
                    if (!leftResumeEnergyEstimated.equals(rightResumeEnergyEstimated)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.resumeEnergyEstimated!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftEnergyUnit;
            leftEnergyUnit = this.getEnergyUnit();
            ElementTagType rightEnergyUnit;
            rightEnergyUnit = that.getEnergyUnit();
            if (this.energyUnit!= null) {
                if (that.energyUnit!= null) {
                    if (!leftEnergyUnit.equals(rightEnergyUnit)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.energyUnit!= null) {
                    return false;
                }
            }
        }
        {
            ScaledNumberElementsType leftResumeCostEstimated;
            leftResumeCostEstimated = this.getResumeCostEstimated();
            ScaledNumberElementsType rightResumeCostEstimated;
            rightResumeCostEstimated = that.getResumeCostEstimated();
            if (this.resumeCostEstimated!= null) {
                if (that.resumeCostEstimated!= null) {
                    if (!leftResumeCostEstimated.equals(rightResumeCostEstimated)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.resumeCostEstimated!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftCurrency;
            leftCurrency = this.getCurrency();
            ElementTagType rightCurrency;
            rightCurrency = that.getCurrency();
            if (this.currency!= null) {
                if (that.currency!= null) {
                    if (!leftCurrency.equals(rightCurrency)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.currency!= null) {
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
            ScaledNumberElementsType theResumeEnergyEstimated;
            theResumeEnergyEstimated = this.getResumeEnergyEstimated();
            if (this.resumeEnergyEstimated!= null) {
                currentHashCode += theResumeEnergyEstimated.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theEnergyUnit;
            theEnergyUnit = this.getEnergyUnit();
            if (this.energyUnit!= null) {
                currentHashCode += theEnergyUnit.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ScaledNumberElementsType theResumeCostEstimated;
            theResumeCostEstimated = this.getResumeCostEstimated();
            if (this.resumeCostEstimated!= null) {
                currentHashCode += theResumeCostEstimated.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theCurrency;
            theCurrency = this.getCurrency();
            if (this.currency!= null) {
                currentHashCode += theCurrency.hashCode();
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
            ScaledNumberElementsType theResumeEnergyEstimated;
            theResumeEnergyEstimated = this.getResumeEnergyEstimated();
            strategy.appendField(locator, this, "resumeEnergyEstimated", buffer, theResumeEnergyEstimated, (this.resumeEnergyEstimated!= null));
        }
        {
            ElementTagType theEnergyUnit;
            theEnergyUnit = this.getEnergyUnit();
            strategy.appendField(locator, this, "energyUnit", buffer, theEnergyUnit, (this.energyUnit!= null));
        }
        {
            ScaledNumberElementsType theResumeCostEstimated;
            theResumeCostEstimated = this.getResumeCostEstimated();
            strategy.appendField(locator, this, "resumeCostEstimated", buffer, theResumeCostEstimated, (this.resumeCostEstimated!= null));
        }
        {
            ElementTagType theCurrency;
            theCurrency = this.getCurrency();
            strategy.appendField(locator, this, "currency", buffer, theCurrency, (this.currency!= null));
        }
        return buffer;
    }

}
