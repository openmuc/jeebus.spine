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
 * <p>Java class for OperatingConstraintsResumeImplicationDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OperatingConstraintsResumeImplicationDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sequenceId" type="{http://docs.eebus.org/spine/xsd/v1}PowerSequenceIdType" minOccurs="0"/&gt;
 *         &lt;element name="resumeEnergyEstimated" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberType" minOccurs="0"/&gt;
 *         &lt;element name="energyUnit" type="{http://docs.eebus.org/spine/xsd/v1}UnitOfMeasurementType" minOccurs="0"/&gt;
 *         &lt;element name="resumeCostEstimated" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberType" minOccurs="0"/&gt;
 *         &lt;element name="currency" type="{http://docs.eebus.org/spine/xsd/v1}CurrencyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperatingConstraintsResumeImplicationDataType", propOrder = {
    "sequenceId",
    "resumeEnergyEstimated",
    "energyUnit",
    "resumeCostEstimated",
    "currency"
})
@XmlSeeAlso({
    org.openmuc.jeebus.spine.xsd.v1.SmartEnergyManagementPsPowerSequenceType.OperatingConstraintsResumeImplication.class
})
public class OperatingConstraintsResumeImplicationDataType implements Cloneable, CopyTo, ToString
{

    @XmlSchemaType(name = "unsignedInt")
    protected Long sequenceId;
    protected ScaledNumberType resumeEnergyEstimated;
    protected String energyUnit;
    protected ScaledNumberType resumeCostEstimated;
    protected String currency;

    /**
     * Default no-arg constructor
     * 
     */
    public OperatingConstraintsResumeImplicationDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public OperatingConstraintsResumeImplicationDataType(final Long sequenceId, final ScaledNumberType resumeEnergyEstimated, final String energyUnit, final ScaledNumberType resumeCostEstimated, final String currency) {
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
     *     {@link Long }
     *     
     */
    public Long getSequenceId() {
        return sequenceId;
    }

    /**
     * Sets the value of the sequenceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSequenceId(Long value) {
        this.sequenceId = value;
    }

    /**
     * Gets the value of the resumeEnergyEstimated property.
     * 
     * @return
     *     possible object is
     *     {@link ScaledNumberType }
     *     
     */
    public ScaledNumberType getResumeEnergyEstimated() {
        return resumeEnergyEstimated;
    }

    /**
     * Sets the value of the resumeEnergyEstimated property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberType }
     *     
     */
    public void setResumeEnergyEstimated(ScaledNumberType value) {
        this.resumeEnergyEstimated = value;
    }

    /**
     * Gets the value of the energyUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnergyUnit() {
        return energyUnit;
    }

    /**
     * Sets the value of the energyUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnergyUnit(String value) {
        this.energyUnit = value;
    }

    /**
     * Gets the value of the resumeCostEstimated property.
     * 
     * @return
     *     possible object is
     *     {@link ScaledNumberType }
     *     
     */
    public ScaledNumberType getResumeCostEstimated() {
        return resumeCostEstimated;
    }

    /**
     * Sets the value of the resumeCostEstimated property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberType }
     *     
     */
    public void setResumeCostEstimated(ScaledNumberType value) {
        this.resumeCostEstimated = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Sets the value of the sequenceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     * @return
     *     The class instance
     */
    public OperatingConstraintsResumeImplicationDataType withSequenceId(Long value) {
        setSequenceId(value);
        return this;
    }

    /**
     * Sets the value of the resumeEnergyEstimated property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberType }
     * @return
     *     The class instance
     */
    public OperatingConstraintsResumeImplicationDataType withResumeEnergyEstimated(ScaledNumberType value) {
        setResumeEnergyEstimated(value);
        return this;
    }

    /**
     * Sets the value of the energyUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public OperatingConstraintsResumeImplicationDataType withEnergyUnit(String value) {
        setEnergyUnit(value);
        return this;
    }

    /**
     * Sets the value of the resumeCostEstimated property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberType }
     * @return
     *     The class instance
     */
    public OperatingConstraintsResumeImplicationDataType withResumeCostEstimated(ScaledNumberType value) {
        setResumeCostEstimated(value);
        return this;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public OperatingConstraintsResumeImplicationDataType withCurrency(String value) {
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
        if (draftCopy instanceof OperatingConstraintsResumeImplicationDataType) {
            final OperatingConstraintsResumeImplicationDataType copy = ((OperatingConstraintsResumeImplicationDataType) draftCopy);
            {
                Boolean sequenceIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.sequenceId!= null));
                if (sequenceIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceSequenceId;
                    sourceSequenceId = this.getSequenceId();
                    Long copySequenceId = ((Long) strategy.copy(LocatorUtils.property(locator, "sequenceId", sourceSequenceId), sourceSequenceId, (this.sequenceId!= null)));
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
                    ScaledNumberType sourceResumeEnergyEstimated;
                    sourceResumeEnergyEstimated = this.getResumeEnergyEstimated();
                    ScaledNumberType copyResumeEnergyEstimated = ((ScaledNumberType) strategy.copy(LocatorUtils.property(locator, "resumeEnergyEstimated", sourceResumeEnergyEstimated), sourceResumeEnergyEstimated, (this.resumeEnergyEstimated!= null)));
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
                    String sourceEnergyUnit;
                    sourceEnergyUnit = this.getEnergyUnit();
                    String copyEnergyUnit = ((String) strategy.copy(LocatorUtils.property(locator, "energyUnit", sourceEnergyUnit), sourceEnergyUnit, (this.energyUnit!= null)));
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
                    ScaledNumberType sourceResumeCostEstimated;
                    sourceResumeCostEstimated = this.getResumeCostEstimated();
                    ScaledNumberType copyResumeCostEstimated = ((ScaledNumberType) strategy.copy(LocatorUtils.property(locator, "resumeCostEstimated", sourceResumeCostEstimated), sourceResumeCostEstimated, (this.resumeCostEstimated!= null)));
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
                    String sourceCurrency;
                    sourceCurrency = this.getCurrency();
                    String copyCurrency = ((String) strategy.copy(LocatorUtils.property(locator, "currency", sourceCurrency), sourceCurrency, (this.currency!= null)));
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
        return new OperatingConstraintsResumeImplicationDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final OperatingConstraintsResumeImplicationDataType that = ((OperatingConstraintsResumeImplicationDataType) object);
        {
            Long leftSequenceId;
            leftSequenceId = this.getSequenceId();
            Long rightSequenceId;
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
            ScaledNumberType leftResumeEnergyEstimated;
            leftResumeEnergyEstimated = this.getResumeEnergyEstimated();
            ScaledNumberType rightResumeEnergyEstimated;
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
            String leftEnergyUnit;
            leftEnergyUnit = this.getEnergyUnit();
            String rightEnergyUnit;
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
            ScaledNumberType leftResumeCostEstimated;
            leftResumeCostEstimated = this.getResumeCostEstimated();
            ScaledNumberType rightResumeCostEstimated;
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
            String leftCurrency;
            leftCurrency = this.getCurrency();
            String rightCurrency;
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
            Long theSequenceId;
            theSequenceId = this.getSequenceId();
            if (this.sequenceId!= null) {
                currentHashCode += theSequenceId.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ScaledNumberType theResumeEnergyEstimated;
            theResumeEnergyEstimated = this.getResumeEnergyEstimated();
            if (this.resumeEnergyEstimated!= null) {
                currentHashCode += theResumeEnergyEstimated.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String theEnergyUnit;
            theEnergyUnit = this.getEnergyUnit();
            if (this.energyUnit!= null) {
                currentHashCode += theEnergyUnit.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ScaledNumberType theResumeCostEstimated;
            theResumeCostEstimated = this.getResumeCostEstimated();
            if (this.resumeCostEstimated!= null) {
                currentHashCode += theResumeCostEstimated.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String theCurrency;
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
            Long theSequenceId;
            theSequenceId = this.getSequenceId();
            strategy.appendField(locator, this, "sequenceId", buffer, theSequenceId, (this.sequenceId!= null));
        }
        {
            ScaledNumberType theResumeEnergyEstimated;
            theResumeEnergyEstimated = this.getResumeEnergyEstimated();
            strategy.appendField(locator, this, "resumeEnergyEstimated", buffer, theResumeEnergyEstimated, (this.resumeEnergyEstimated!= null));
        }
        {
            String theEnergyUnit;
            theEnergyUnit = this.getEnergyUnit();
            strategy.appendField(locator, this, "energyUnit", buffer, theEnergyUnit, (this.energyUnit!= null));
        }
        {
            ScaledNumberType theResumeCostEstimated;
            theResumeCostEstimated = this.getResumeCostEstimated();
            strategy.appendField(locator, this, "resumeCostEstimated", buffer, theResumeCostEstimated, (this.resumeCostEstimated!= null));
        }
        {
            String theCurrency;
            theCurrency = this.getCurrency();
            strategy.appendField(locator, this, "currency", buffer, theCurrency, (this.currency!= null));
        }
        return buffer;
    }

}
