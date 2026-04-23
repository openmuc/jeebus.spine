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
 * <p>Java class for BillPositionElementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BillPositionElementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="positionId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="positionType" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="timePeriod" type="{http://docs.eebus.org/spine/xsd/v1}TimePeriodElementsType" minOccurs="0"/&gt;
 *         &lt;element name="value" type="{http://docs.eebus.org/spine/xsd/v1}BillValueElementsType" minOccurs="0"/&gt;
 *         &lt;element name="cost" type="{http://docs.eebus.org/spine/xsd/v1}BillCostElementsType" minOccurs="0"/&gt;
 *         &lt;element name="label" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillPositionElementsType", propOrder = {
    "positionId",
    "positionType",
    "timePeriod",
    "value",
    "cost",
    "label",
    "description"
})
@XmlSeeAlso({
    org.openmuc.jeebus.spine.xsd.v1.BillDataElementsType.Total.class,
    org.openmuc.jeebus.spine.xsd.v1.BillDataElementsType.Position.class
})
public class BillPositionElementsType implements Cloneable, CopyTo, ToString
{

    protected ElementTagType positionId;
    protected ElementTagType positionType;
    protected TimePeriodElementsType timePeriod;
    protected BillValueElementsType value;
    protected BillCostElementsType cost;
    protected ElementTagType label;
    protected ElementTagType description;

    /**
     * Default no-arg constructor
     * 
     */
    public BillPositionElementsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public BillPositionElementsType(final ElementTagType positionId, final ElementTagType positionType, final TimePeriodElementsType timePeriod, final BillValueElementsType value, final BillCostElementsType cost, final ElementTagType label, final ElementTagType description) {
        this.positionId = positionId;
        this.positionType = positionType;
        this.timePeriod = timePeriod;
        this.value = value;
        this.cost = cost;
        this.label = label;
        this.description = description;
    }

    /**
     * Gets the value of the positionId property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getPositionId() {
        return positionId;
    }

    /**
     * Sets the value of the positionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setPositionId(ElementTagType value) {
        this.positionId = value;
    }

    /**
     * Gets the value of the positionType property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getPositionType() {
        return positionType;
    }

    /**
     * Sets the value of the positionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setPositionType(ElementTagType value) {
        this.positionType = value;
    }

    /**
     * Gets the value of the timePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodElementsType }
     *     
     */
    public TimePeriodElementsType getTimePeriod() {
        return timePeriod;
    }

    /**
     * Sets the value of the timePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodElementsType }
     *     
     */
    public void setTimePeriod(TimePeriodElementsType value) {
        this.timePeriod = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link BillValueElementsType }
     *     
     */
    public BillValueElementsType getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillValueElementsType }
     *     
     */
    public void setValue(BillValueElementsType value) {
        this.value = value;
    }

    /**
     * Gets the value of the cost property.
     * 
     * @return
     *     possible object is
     *     {@link BillCostElementsType }
     *     
     */
    public BillCostElementsType getCost() {
        return cost;
    }

    /**
     * Sets the value of the cost property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillCostElementsType }
     *     
     */
    public void setCost(BillCostElementsType value) {
        this.cost = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setLabel(ElementTagType value) {
        this.label = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setDescription(ElementTagType value) {
        this.description = value;
    }

    /**
     * Sets the value of the positionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public BillPositionElementsType withPositionId(ElementTagType value) {
        setPositionId(value);
        return this;
    }

    /**
     * Sets the value of the positionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public BillPositionElementsType withPositionType(ElementTagType value) {
        setPositionType(value);
        return this;
    }

    /**
     * Sets the value of the timePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodElementsType }
     * @return
     *     The class instance
     */
    public BillPositionElementsType withTimePeriod(TimePeriodElementsType value) {
        setTimePeriod(value);
        return this;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillValueElementsType }
     * @return
     *     The class instance
     */
    public BillPositionElementsType withValue(BillValueElementsType value) {
        setValue(value);
        return this;
    }

    /**
     * Sets the value of the cost property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillCostElementsType }
     * @return
     *     The class instance
     */
    public BillPositionElementsType withCost(BillCostElementsType value) {
        setCost(value);
        return this;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public BillPositionElementsType withLabel(ElementTagType value) {
        setLabel(value);
        return this;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public BillPositionElementsType withDescription(ElementTagType value) {
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
        if (draftCopy instanceof BillPositionElementsType) {
            final BillPositionElementsType copy = ((BillPositionElementsType) draftCopy);
            {
                Boolean positionIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.positionId!= null));
                if (positionIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourcePositionId;
                    sourcePositionId = this.getPositionId();
                    ElementTagType copyPositionId = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "positionId", sourcePositionId), sourcePositionId, (this.positionId!= null)));
                    copy.setPositionId(copyPositionId);
                } else {
                    if (positionIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.positionId = null;
                    }
                }
            }
            {
                Boolean positionTypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.positionType!= null));
                if (positionTypeShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourcePositionType;
                    sourcePositionType = this.getPositionType();
                    ElementTagType copyPositionType = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "positionType", sourcePositionType), sourcePositionType, (this.positionType!= null)));
                    copy.setPositionType(copyPositionType);
                } else {
                    if (positionTypeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.positionType = null;
                    }
                }
            }
            {
                Boolean timePeriodShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.timePeriod!= null));
                if (timePeriodShouldBeCopiedAndSet == Boolean.TRUE) {
                    TimePeriodElementsType sourceTimePeriod;
                    sourceTimePeriod = this.getTimePeriod();
                    TimePeriodElementsType copyTimePeriod = ((TimePeriodElementsType) strategy.copy(LocatorUtils.property(locator, "timePeriod", sourceTimePeriod), sourceTimePeriod, (this.timePeriod!= null)));
                    copy.setTimePeriod(copyTimePeriod);
                } else {
                    if (timePeriodShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.timePeriod = null;
                    }
                }
            }
            {
                Boolean valueShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.value!= null));
                if (valueShouldBeCopiedAndSet == Boolean.TRUE) {
                    BillValueElementsType sourceValue;
                    sourceValue = this.getValue();
                    BillValueElementsType copyValue = ((BillValueElementsType) strategy.copy(LocatorUtils.property(locator, "value", sourceValue), sourceValue, (this.value!= null)));
                    copy.setValue(copyValue);
                } else {
                    if (valueShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.value = null;
                    }
                }
            }
            {
                Boolean costShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.cost!= null));
                if (costShouldBeCopiedAndSet == Boolean.TRUE) {
                    BillCostElementsType sourceCost;
                    sourceCost = this.getCost();
                    BillCostElementsType copyCost = ((BillCostElementsType) strategy.copy(LocatorUtils.property(locator, "cost", sourceCost), sourceCost, (this.cost!= null)));
                    copy.setCost(copyCost);
                } else {
                    if (costShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.cost = null;
                    }
                }
            }
            {
                Boolean labelShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.label!= null));
                if (labelShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceLabel;
                    sourceLabel = this.getLabel();
                    ElementTagType copyLabel = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "label", sourceLabel), sourceLabel, (this.label!= null)));
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
                    ElementTagType sourceDescription;
                    sourceDescription = this.getDescription();
                    ElementTagType copyDescription = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "description", sourceDescription), sourceDescription, (this.description!= null)));
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
        return new BillPositionElementsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final BillPositionElementsType that = ((BillPositionElementsType) object);
        {
            ElementTagType leftPositionId;
            leftPositionId = this.getPositionId();
            ElementTagType rightPositionId;
            rightPositionId = that.getPositionId();
            if (this.positionId!= null) {
                if (that.positionId!= null) {
                    if (!leftPositionId.equals(rightPositionId)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.positionId!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftPositionType;
            leftPositionType = this.getPositionType();
            ElementTagType rightPositionType;
            rightPositionType = that.getPositionType();
            if (this.positionType!= null) {
                if (that.positionType!= null) {
                    if (!leftPositionType.equals(rightPositionType)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.positionType!= null) {
                    return false;
                }
            }
        }
        {
            TimePeriodElementsType leftTimePeriod;
            leftTimePeriod = this.getTimePeriod();
            TimePeriodElementsType rightTimePeriod;
            rightTimePeriod = that.getTimePeriod();
            if (this.timePeriod!= null) {
                if (that.timePeriod!= null) {
                    if (!leftTimePeriod.equals(rightTimePeriod)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.timePeriod!= null) {
                    return false;
                }
            }
        }
        {
            BillValueElementsType leftValue;
            leftValue = this.getValue();
            BillValueElementsType rightValue;
            rightValue = that.getValue();
            if (this.value!= null) {
                if (that.value!= null) {
                    if (!leftValue.equals(rightValue)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.value!= null) {
                    return false;
                }
            }
        }
        {
            BillCostElementsType leftCost;
            leftCost = this.getCost();
            BillCostElementsType rightCost;
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
            ElementTagType leftLabel;
            leftLabel = this.getLabel();
            ElementTagType rightLabel;
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
            ElementTagType leftDescription;
            leftDescription = this.getDescription();
            ElementTagType rightDescription;
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
            ElementTagType thePositionId;
            thePositionId = this.getPositionId();
            if (this.positionId!= null) {
                currentHashCode += thePositionId.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType thePositionType;
            thePositionType = this.getPositionType();
            if (this.positionType!= null) {
                currentHashCode += thePositionType.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            TimePeriodElementsType theTimePeriod;
            theTimePeriod = this.getTimePeriod();
            if (this.timePeriod!= null) {
                currentHashCode += theTimePeriod.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            BillValueElementsType theValue;
            theValue = this.getValue();
            if (this.value!= null) {
                currentHashCode += theValue.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            BillCostElementsType theCost;
            theCost = this.getCost();
            if (this.cost!= null) {
                currentHashCode += theCost.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theLabel;
            theLabel = this.getLabel();
            if (this.label!= null) {
                currentHashCode += theLabel.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theDescription;
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
            ElementTagType thePositionId;
            thePositionId = this.getPositionId();
            strategy.appendField(locator, this, "positionId", buffer, thePositionId, (this.positionId!= null));
        }
        {
            ElementTagType thePositionType;
            thePositionType = this.getPositionType();
            strategy.appendField(locator, this, "positionType", buffer, thePositionType, (this.positionType!= null));
        }
        {
            TimePeriodElementsType theTimePeriod;
            theTimePeriod = this.getTimePeriod();
            strategy.appendField(locator, this, "timePeriod", buffer, theTimePeriod, (this.timePeriod!= null));
        }
        {
            BillValueElementsType theValue;
            theValue = this.getValue();
            strategy.appendField(locator, this, "value", buffer, theValue, (this.value!= null));
        }
        {
            BillCostElementsType theCost;
            theCost = this.getCost();
            strategy.appendField(locator, this, "cost", buffer, theCost, (this.cost!= null));
        }
        {
            ElementTagType theLabel;
            theLabel = this.getLabel();
            strategy.appendField(locator, this, "label", buffer, theLabel, (this.label!= null));
        }
        {
            ElementTagType theDescription;
            theDescription = this.getDescription();
            strategy.appendField(locator, this, "description", buffer, theDescription, (this.description!= null));
        }
        return buffer;
    }

}
