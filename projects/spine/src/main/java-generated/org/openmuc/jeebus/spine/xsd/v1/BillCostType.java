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
 * <p>Java class for BillCostType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BillCostType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="costId" type="{http://docs.eebus.org/spine/xsd/v1}BillCostIdType" minOccurs="0"/&gt;
 *         &lt;element name="costType" type="{http://docs.eebus.org/spine/xsd/v1}BillCostTypeType" minOccurs="0"/&gt;
 *         &lt;element name="valueId" type="{http://docs.eebus.org/spine/xsd/v1}BillValueIdType" minOccurs="0"/&gt;
 *         &lt;element name="unit" type="{http://docs.eebus.org/spine/xsd/v1}UnitOfMeasurementType" minOccurs="0"/&gt;
 *         &lt;element name="currency" type="{http://docs.eebus.org/spine/xsd/v1}CurrencyType" minOccurs="0"/&gt;
 *         &lt;element name="cost" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberType" minOccurs="0"/&gt;
 *         &lt;element name="costPercentage" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillCostType", propOrder = {
    "costId",
    "costType",
    "valueId",
    "unit",
    "currency",
    "cost",
    "costPercentage"
})
public class BillCostType implements Cloneable, CopyTo, ToString
{

    @XmlSchemaType(name = "unsignedInt")
    protected Long costId;
    protected String costType;
    @XmlSchemaType(name = "unsignedInt")
    protected Long valueId;
    protected String unit;
    protected String currency;
    protected ScaledNumberType cost;
    protected ScaledNumberType costPercentage;

    /**
     * Default no-arg constructor
     * 
     */
    public BillCostType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public BillCostType(final Long costId, final String costType, final Long valueId, final String unit, final String currency, final ScaledNumberType cost, final ScaledNumberType costPercentage) {
        this.costId = costId;
        this.costType = costType;
        this.valueId = valueId;
        this.unit = unit;
        this.currency = currency;
        this.cost = cost;
        this.costPercentage = costPercentage;
    }

    /**
     * Gets the value of the costId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCostId() {
        return costId;
    }

    /**
     * Sets the value of the costId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCostId(Long value) {
        this.costId = value;
    }

    /**
     * Gets the value of the costType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostType() {
        return costType;
    }

    /**
     * Sets the value of the costType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCostType(String value) {
        this.costType = value;
    }

    /**
     * Gets the value of the valueId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getValueId() {
        return valueId;
    }

    /**
     * Sets the value of the valueId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setValueId(Long value) {
        this.valueId = value;
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
     * Gets the value of the cost property.
     * 
     * @return
     *     possible object is
     *     {@link ScaledNumberType }
     *     
     */
    public ScaledNumberType getCost() {
        return cost;
    }

    /**
     * Sets the value of the cost property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberType }
     *     
     */
    public void setCost(ScaledNumberType value) {
        this.cost = value;
    }

    /**
     * Gets the value of the costPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link ScaledNumberType }
     *     
     */
    public ScaledNumberType getCostPercentage() {
        return costPercentage;
    }

    /**
     * Sets the value of the costPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberType }
     *     
     */
    public void setCostPercentage(ScaledNumberType value) {
        this.costPercentage = value;
    }

    /**
     * Sets the value of the costId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     * @return
     *     The class instance
     */
    public BillCostType withCostId(Long value) {
        setCostId(value);
        return this;
    }

    /**
     * Sets the value of the costType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public BillCostType withCostType(String value) {
        setCostType(value);
        return this;
    }

    /**
     * Sets the value of the valueId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     * @return
     *     The class instance
     */
    public BillCostType withValueId(Long value) {
        setValueId(value);
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
    public BillCostType withUnit(String value) {
        setUnit(value);
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
    public BillCostType withCurrency(String value) {
        setCurrency(value);
        return this;
    }

    /**
     * Sets the value of the cost property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberType }
     * @return
     *     The class instance
     */
    public BillCostType withCost(ScaledNumberType value) {
        setCost(value);
        return this;
    }

    /**
     * Sets the value of the costPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberType }
     * @return
     *     The class instance
     */
    public BillCostType withCostPercentage(ScaledNumberType value) {
        setCostPercentage(value);
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
        if (draftCopy instanceof BillCostType) {
            final BillCostType copy = ((BillCostType) draftCopy);
            {
                Boolean costIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.costId!= null));
                if (costIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceCostId;
                    sourceCostId = this.getCostId();
                    Long copyCostId = ((Long) strategy.copy(LocatorUtils.property(locator, "costId", sourceCostId), sourceCostId, (this.costId!= null)));
                    copy.setCostId(copyCostId);
                } else {
                    if (costIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.costId = null;
                    }
                }
            }
            {
                Boolean costTypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.costType!= null));
                if (costTypeShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceCostType;
                    sourceCostType = this.getCostType();
                    String copyCostType = ((String) strategy.copy(LocatorUtils.property(locator, "costType", sourceCostType), sourceCostType, (this.costType!= null)));
                    copy.setCostType(copyCostType);
                } else {
                    if (costTypeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.costType = null;
                    }
                }
            }
            {
                Boolean valueIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.valueId!= null));
                if (valueIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceValueId;
                    sourceValueId = this.getValueId();
                    Long copyValueId = ((Long) strategy.copy(LocatorUtils.property(locator, "valueId", sourceValueId), sourceValueId, (this.valueId!= null)));
                    copy.setValueId(copyValueId);
                } else {
                    if (valueIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.valueId = null;
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
                Boolean costShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.cost!= null));
                if (costShouldBeCopiedAndSet == Boolean.TRUE) {
                    ScaledNumberType sourceCost;
                    sourceCost = this.getCost();
                    ScaledNumberType copyCost = ((ScaledNumberType) strategy.copy(LocatorUtils.property(locator, "cost", sourceCost), sourceCost, (this.cost!= null)));
                    copy.setCost(copyCost);
                } else {
                    if (costShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.cost = null;
                    }
                }
            }
            {
                Boolean costPercentageShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.costPercentage!= null));
                if (costPercentageShouldBeCopiedAndSet == Boolean.TRUE) {
                    ScaledNumberType sourceCostPercentage;
                    sourceCostPercentage = this.getCostPercentage();
                    ScaledNumberType copyCostPercentage = ((ScaledNumberType) strategy.copy(LocatorUtils.property(locator, "costPercentage", sourceCostPercentage), sourceCostPercentage, (this.costPercentage!= null)));
                    copy.setCostPercentage(copyCostPercentage);
                } else {
                    if (costPercentageShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.costPercentage = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new BillCostType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final BillCostType that = ((BillCostType) object);
        {
            Long leftCostId;
            leftCostId = this.getCostId();
            Long rightCostId;
            rightCostId = that.getCostId();
            if (this.costId!= null) {
                if (that.costId!= null) {
                    if (!leftCostId.equals(rightCostId)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.costId!= null) {
                    return false;
                }
            }
        }
        {
            String leftCostType;
            leftCostType = this.getCostType();
            String rightCostType;
            rightCostType = that.getCostType();
            if (this.costType!= null) {
                if (that.costType!= null) {
                    if (!leftCostType.equals(rightCostType)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.costType!= null) {
                    return false;
                }
            }
        }
        {
            Long leftValueId;
            leftValueId = this.getValueId();
            Long rightValueId;
            rightValueId = that.getValueId();
            if (this.valueId!= null) {
                if (that.valueId!= null) {
                    if (!leftValueId.equals(rightValueId)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.valueId!= null) {
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
            ScaledNumberType leftCost;
            leftCost = this.getCost();
            ScaledNumberType rightCost;
            rightCost = that.getCost();
            if (this.cost!= null) {
                if (that.cost!= null) {
                    if (!leftCost.equals(rightCost)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.cost!= null) {
                    return false;
                }
            }
        }
        {
            ScaledNumberType leftCostPercentage;
            leftCostPercentage = this.getCostPercentage();
            ScaledNumberType rightCostPercentage;
            rightCostPercentage = that.getCostPercentage();
            if (this.costPercentage!= null) {
                if (that.costPercentage!= null) {
                    if (!leftCostPercentage.equals(rightCostPercentage)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.costPercentage!= null) {
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
            Long theCostId;
            theCostId = this.getCostId();
            if (this.costId!= null) {
                currentHashCode += theCostId.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String theCostType;
            theCostType = this.getCostType();
            if (this.costType!= null) {
                currentHashCode += theCostType.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            Long theValueId;
            theValueId = this.getValueId();
            if (this.valueId!= null) {
                currentHashCode += theValueId.hashCode();
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
            String theCurrency;
            theCurrency = this.getCurrency();
            if (this.currency!= null) {
                currentHashCode += theCurrency.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ScaledNumberType theCost;
            theCost = this.getCost();
            if (this.cost!= null) {
                currentHashCode += theCost.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ScaledNumberType theCostPercentage;
            theCostPercentage = this.getCostPercentage();
            if (this.costPercentage!= null) {
                currentHashCode += theCostPercentage.hashCode();
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
            Long theCostId;
            theCostId = this.getCostId();
            strategy.appendField(locator, this, "costId", buffer, theCostId, (this.costId!= null));
        }
        {
            String theCostType;
            theCostType = this.getCostType();
            strategy.appendField(locator, this, "costType", buffer, theCostType, (this.costType!= null));
        }
        {
            Long theValueId;
            theValueId = this.getValueId();
            strategy.appendField(locator, this, "valueId", buffer, theValueId, (this.valueId!= null));
        }
        {
            String theUnit;
            theUnit = this.getUnit();
            strategy.appendField(locator, this, "unit", buffer, theUnit, (this.unit!= null));
        }
        {
            String theCurrency;
            theCurrency = this.getCurrency();
            strategy.appendField(locator, this, "currency", buffer, theCurrency, (this.currency!= null));
        }
        {
            ScaledNumberType theCost;
            theCost = this.getCost();
            strategy.appendField(locator, this, "cost", buffer, theCost, (this.cost!= null));
        }
        {
            ScaledNumberType theCostPercentage;
            theCostPercentage = this.getCostPercentage();
            strategy.appendField(locator, this, "costPercentage", buffer, theCostPercentage, (this.costPercentage!= null));
        }
        return buffer;
    }

}
