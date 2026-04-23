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
 * <p>Java class for IncentiveDescriptionDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IncentiveDescriptionDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="incentiveId" type="{http://docs.eebus.org/spine/xsd/v1}IncentiveIdType" minOccurs="0"/&gt;
 *         &lt;element name="incentiveType" type="{http://docs.eebus.org/spine/xsd/v1}IncentiveTypeType" minOccurs="0"/&gt;
 *         &lt;element name="incentivePriority" type="{http://docs.eebus.org/spine/xsd/v1}IncentivePriorityType" minOccurs="0"/&gt;
 *         &lt;element name="currency" type="{http://docs.eebus.org/spine/xsd/v1}CurrencyType" minOccurs="0"/&gt;
 *         &lt;element name="unit" type="{http://docs.eebus.org/spine/xsd/v1}UnitOfMeasurementType" minOccurs="0"/&gt;
 *         &lt;element name="label" type="{http://docs.eebus.org/spine/xsd/v1}LabelType" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://docs.eebus.org/spine/xsd/v1}DescriptionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IncentiveDescriptionDataType", propOrder = {
    "incentiveId",
    "incentiveType",
    "incentivePriority",
    "currency",
    "unit",
    "label",
    "description"
})
@XmlSeeAlso({
    org.openmuc.jeebus.spine.xsd.v1.IncentiveTableDescriptionTierType.IncentiveDescription.class
})
public class IncentiveDescriptionDataType implements Cloneable, CopyTo, ToString
{

    @XmlSchemaType(name = "unsignedInt")
    protected Long incentiveId;
    protected String incentiveType;
    @XmlSchemaType(name = "unsignedInt")
    protected Long incentivePriority;
    protected String currency;
    protected String unit;
    protected String label;
    protected String description;

    /**
     * Default no-arg constructor
     * 
     */
    public IncentiveDescriptionDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public IncentiveDescriptionDataType(final Long incentiveId, final String incentiveType, final Long incentivePriority, final String currency, final String unit, final String label, final String description) {
        this.incentiveId = incentiveId;
        this.incentiveType = incentiveType;
        this.incentivePriority = incentivePriority;
        this.currency = currency;
        this.unit = unit;
        this.label = label;
        this.description = description;
    }

    /**
     * Gets the value of the incentiveId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIncentiveId() {
        return incentiveId;
    }

    /**
     * Sets the value of the incentiveId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIncentiveId(Long value) {
        this.incentiveId = value;
    }

    /**
     * Gets the value of the incentiveType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncentiveType() {
        return incentiveType;
    }

    /**
     * Sets the value of the incentiveType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncentiveType(String value) {
        this.incentiveType = value;
    }

    /**
     * Gets the value of the incentivePriority property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIncentivePriority() {
        return incentivePriority;
    }

    /**
     * Sets the value of the incentivePriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIncentivePriority(Long value) {
        this.incentivePriority = value;
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
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnit(String value) {
        this.unit = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Sets the value of the incentiveId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     * @return
     *     The class instance
     */
    public IncentiveDescriptionDataType withIncentiveId(Long value) {
        setIncentiveId(value);
        return this;
    }

    /**
     * Sets the value of the incentiveType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public IncentiveDescriptionDataType withIncentiveType(String value) {
        setIncentiveType(value);
        return this;
    }

    /**
     * Sets the value of the incentivePriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     * @return
     *     The class instance
     */
    public IncentiveDescriptionDataType withIncentivePriority(Long value) {
        setIncentivePriority(value);
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
    public IncentiveDescriptionDataType withCurrency(String value) {
        setCurrency(value);
        return this;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public IncentiveDescriptionDataType withUnit(String value) {
        setUnit(value);
        return this;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public IncentiveDescriptionDataType withLabel(String value) {
        setLabel(value);
        return this;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public IncentiveDescriptionDataType withDescription(String value) {
        setDescription(value);
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
        if (draftCopy instanceof IncentiveDescriptionDataType) {
            final IncentiveDescriptionDataType copy = ((IncentiveDescriptionDataType) draftCopy);
            {
                Boolean incentiveIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.incentiveId!= null));
                if (incentiveIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceIncentiveId;
                    sourceIncentiveId = this.getIncentiveId();
                    Long copyIncentiveId = ((Long) strategy.copy(LocatorUtils.property(locator, "incentiveId", sourceIncentiveId), sourceIncentiveId, (this.incentiveId!= null)));
                    copy.setIncentiveId(copyIncentiveId);
                } else {
                    if (incentiveIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.incentiveId = null;
                    }
                }
            }
            {
                Boolean incentiveTypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.incentiveType!= null));
                if (incentiveTypeShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceIncentiveType;
                    sourceIncentiveType = this.getIncentiveType();
                    String copyIncentiveType = ((String) strategy.copy(LocatorUtils.property(locator, "incentiveType", sourceIncentiveType), sourceIncentiveType, (this.incentiveType!= null)));
                    copy.setIncentiveType(copyIncentiveType);
                } else {
                    if (incentiveTypeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.incentiveType = null;
                    }
                }
            }
            {
                Boolean incentivePriorityShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.incentivePriority!= null));
                if (incentivePriorityShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceIncentivePriority;
                    sourceIncentivePriority = this.getIncentivePriority();
                    Long copyIncentivePriority = ((Long) strategy.copy(LocatorUtils.property(locator, "incentivePriority", sourceIncentivePriority), sourceIncentivePriority, (this.incentivePriority!= null)));
                    copy.setIncentivePriority(copyIncentivePriority);
                } else {
                    if (incentivePriorityShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.incentivePriority = null;
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
            {
                Boolean unitShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.unit!= null));
                if (unitShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceUnit;
                    sourceUnit = this.getUnit();
                    String copyUnit = ((String) strategy.copy(LocatorUtils.property(locator, "unit", sourceUnit), sourceUnit, (this.unit!= null)));
                    copy.setUnit(copyUnit);
                } else {
                    if (unitShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.unit = null;
                    }
                }
            }
            {
                Boolean labelShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.label!= null));
                if (labelShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceLabel;
                    sourceLabel = this.getLabel();
                    String copyLabel = ((String) strategy.copy(LocatorUtils.property(locator, "label", sourceLabel), sourceLabel, (this.label!= null)));
                    copy.setLabel(copyLabel);
                } else {
                    if (labelShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.label = null;
                    }
                }
            }
            {
                Boolean descriptionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.description!= null));
                if (descriptionShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceDescription;
                    sourceDescription = this.getDescription();
                    String copyDescription = ((String) strategy.copy(LocatorUtils.property(locator, "description", sourceDescription), sourceDescription, (this.description!= null)));
                    copy.setDescription(copyDescription);
                } else {
                    if (descriptionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.description = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new IncentiveDescriptionDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final IncentiveDescriptionDataType that = ((IncentiveDescriptionDataType) object);
        {
            Long leftIncentiveId;
            leftIncentiveId = this.getIncentiveId();
            Long rightIncentiveId;
            rightIncentiveId = that.getIncentiveId();
            if (this.incentiveId!= null) {
                if (that.incentiveId!= null) {
                    if (!leftIncentiveId.equals(rightIncentiveId)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.incentiveId!= null) {
                    return false;
                }
            }
        }
        {
            String leftIncentiveType;
            leftIncentiveType = this.getIncentiveType();
            String rightIncentiveType;
            rightIncentiveType = that.getIncentiveType();
            if (this.incentiveType!= null) {
                if (that.incentiveType!= null) {
                    if (!leftIncentiveType.equals(rightIncentiveType)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.incentiveType!= null) {
                    return false;
                }
            }
        }
        {
            Long leftIncentivePriority;
            leftIncentivePriority = this.getIncentivePriority();
            Long rightIncentivePriority;
            rightIncentivePriority = that.getIncentivePriority();
            if (this.incentivePriority!= null) {
                if (that.incentivePriority!= null) {
                    if (!leftIncentivePriority.equals(rightIncentivePriority)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.incentivePriority!= null) {
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
        {
            String leftUnit;
            leftUnit = this.getUnit();
            String rightUnit;
            rightUnit = that.getUnit();
            if (this.unit!= null) {
                if (that.unit!= null) {
                    if (!leftUnit.equals(rightUnit)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.unit!= null) {
                    return false;
                }
            }
        }
        {
            String leftLabel;
            leftLabel = this.getLabel();
            String rightLabel;
            rightLabel = that.getLabel();
            if (this.label!= null) {
                if (that.label!= null) {
                    if (!leftLabel.equals(rightLabel)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.label!= null) {
                    return false;
                }
            }
        }
        {
            String leftDescription;
            leftDescription = this.getDescription();
            String rightDescription;
            rightDescription = that.getDescription();
            if (this.description!= null) {
                if (that.description!= null) {
                    if (!leftDescription.equals(rightDescription)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.description!= null) {
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
            Long theIncentiveId;
            theIncentiveId = this.getIncentiveId();
            if (this.incentiveId!= null) {
                currentHashCode += theIncentiveId.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String theIncentiveType;
            theIncentiveType = this.getIncentiveType();
            if (this.incentiveType!= null) {
                currentHashCode += theIncentiveType.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            Long theIncentivePriority;
            theIncentivePriority = this.getIncentivePriority();
            if (this.incentivePriority!= null) {
                currentHashCode += theIncentivePriority.hashCode();
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
        {
            currentHashCode = (currentHashCode* 31);
            String theUnit;
            theUnit = this.getUnit();
            if (this.unit!= null) {
                currentHashCode += theUnit.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String theLabel;
            theLabel = this.getLabel();
            if (this.label!= null) {
                currentHashCode += theLabel.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String theDescription;
            theDescription = this.getDescription();
            if (this.description!= null) {
                currentHashCode += theDescription.hashCode();
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
            Long theIncentiveId;
            theIncentiveId = this.getIncentiveId();
            strategy.appendField(locator, this, "incentiveId", buffer, theIncentiveId, (this.incentiveId!= null));
        }
        {
            String theIncentiveType;
            theIncentiveType = this.getIncentiveType();
            strategy.appendField(locator, this, "incentiveType", buffer, theIncentiveType, (this.incentiveType!= null));
        }
        {
            Long theIncentivePriority;
            theIncentivePriority = this.getIncentivePriority();
            strategy.appendField(locator, this, "incentivePriority", buffer, theIncentivePriority, (this.incentivePriority!= null));
        }
        {
            String theCurrency;
            theCurrency = this.getCurrency();
            strategy.appendField(locator, this, "currency", buffer, theCurrency, (this.currency!= null));
        }
        {
            String theUnit;
            theUnit = this.getUnit();
            strategy.appendField(locator, this, "unit", buffer, theUnit, (this.unit!= null));
        }
        {
            String theLabel;
            theLabel = this.getLabel();
            strategy.appendField(locator, this, "label", buffer, theLabel, (this.label!= null));
        }
        {
            String theDescription;
            theDescription = this.getDescription();
            strategy.appendField(locator, this, "description", buffer, theDescription, (this.description!= null));
        }
        return buffer;
    }

}
