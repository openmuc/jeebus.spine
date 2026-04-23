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

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
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
 * <p>Java class for BillPositionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BillPositionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="positionId" type="{http://docs.eebus.org/spine/xsd/v1}BillPositionIdType" minOccurs="0"/&gt;
 *         &lt;element name="positionType" type="{http://docs.eebus.org/spine/xsd/v1}BillPositionTypeType" minOccurs="0"/&gt;
 *         &lt;element name="timePeriod" type="{http://docs.eebus.org/spine/xsd/v1}TimePeriodType" minOccurs="0"/&gt;
 *         &lt;element name="value" type="{http://docs.eebus.org/spine/xsd/v1}BillValueType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="cost" type="{http://docs.eebus.org/spine/xsd/v1}BillCostType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "BillPositionType", propOrder = {
    "positionId",
    "positionType",
    "timePeriod",
    "value",
    "cost",
    "label",
    "description"
})
@XmlSeeAlso({
    org.openmuc.jeebus.spine.xsd.v1.BillDataType.Total.class,
    org.openmuc.jeebus.spine.xsd.v1.BillDataType.Position.class
})
public class BillPositionType implements Cloneable, CopyTo, ToString
{

    @XmlSchemaType(name = "unsignedInt")
    protected Long positionId;
    protected String positionType;
    protected TimePeriodType timePeriod;
    protected List<BillValueType> value;
    protected List<BillCostType> cost;
    protected String label;
    protected String description;

    /**
     * Default no-arg constructor
     * 
     */
    public BillPositionType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public BillPositionType(final Long positionId, final String positionType, final TimePeriodType timePeriod, final List<BillValueType> value, final List<BillCostType> cost, final String label, final String description) {
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
     *     {@link Long }
     *     
     */
    public Long getPositionId() {
        return positionId;
    }

    /**
     * Sets the value of the positionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPositionId(Long value) {
        this.positionId = value;
    }

    /**
     * Gets the value of the positionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPositionType() {
        return positionType;
    }

    /**
     * Sets the value of the positionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPositionType(String value) {
        this.positionType = value;
    }

    /**
     * Gets the value of the timePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodType }
     *     
     */
    public TimePeriodType getTimePeriod() {
        return timePeriod;
    }

    /**
     * Sets the value of the timePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodType }
     *     
     */
    public void setTimePeriod(TimePeriodType value) {
        this.timePeriod = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the value property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BillValueType }
     * 
     * 
     */
    public List<BillValueType> getValue() {
        if (value == null) {
            value = new ArrayList<BillValueType>();
        }
        return this.value;
    }

    /**
     * Gets the value of the cost property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the cost property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCost().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BillCostType }
     * 
     * 
     */
    public List<BillCostType> getCost() {
        if (cost == null) {
            cost = new ArrayList<BillCostType>();
        }
        return this.cost;
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
     * Sets the value of the positionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     * @return
     *     The class instance
     */
    public BillPositionType withPositionId(Long value) {
        setPositionId(value);
        return this;
    }

    /**
     * Sets the value of the positionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public BillPositionType withPositionType(String value) {
        setPositionType(value);
        return this;
    }

    /**
     * Sets the value of the timePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodType }
     * @return
     *     The class instance
     */
    public BillPositionType withTimePeriod(TimePeriodType value) {
        setTimePeriod(value);
        return this;
    }

    /**
     * Adds objects to the list of Value using add method
     * 
     * @param values
     *     objects to add to the list Value
     * @return
     *     The class instance
     */
    public BillPositionType withValue(BillValueType... values) {
        if (values!= null) {
            for (BillValueType value: values) {
                getValue().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of Value using addAll method
     * 
     * @param values
     *     objects to add to the list Value
     * @return
     *     The class instance
     */
    public BillPositionType withValue(Collection<BillValueType> values) {
        if (values!= null) {
            getValue().addAll(values);
        }
        return this;
    }

    /**
     * Adds objects to the list of Cost using add method
     * 
     * @param values
     *     objects to add to the list Cost
     * @return
     *     The class instance
     */
    public BillPositionType withCost(BillCostType... values) {
        if (values!= null) {
            for (BillCostType value: values) {
                getCost().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of Cost using addAll method
     * 
     * @param values
     *     objects to add to the list Cost
     * @return
     *     The class instance
     */
    public BillPositionType withCost(Collection<BillCostType> values) {
        if (values!= null) {
            getCost().addAll(values);
        }
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
    public BillPositionType withLabel(String value) {
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
    public BillPositionType withDescription(String value) {
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
        if (draftCopy instanceof BillPositionType) {
            final BillPositionType copy = ((BillPositionType) draftCopy);
            {
                Boolean positionIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.positionId!= null));
                if (positionIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourcePositionId;
                    sourcePositionId = this.getPositionId();
                    Long copyPositionId = ((Long) strategy.copy(LocatorUtils.property(locator, "positionId", sourcePositionId), sourcePositionId, (this.positionId!= null)));
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
                    String sourcePositionType;
                    sourcePositionType = this.getPositionType();
                    String copyPositionType = ((String) strategy.copy(LocatorUtils.property(locator, "positionType", sourcePositionType), sourcePositionType, (this.positionType!= null)));
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
                    TimePeriodType sourceTimePeriod;
                    sourceTimePeriod = this.getTimePeriod();
                    TimePeriodType copyTimePeriod = ((TimePeriodType) strategy.copy(LocatorUtils.property(locator, "timePeriod", sourceTimePeriod), sourceTimePeriod, (this.timePeriod!= null)));
                    copy.setTimePeriod(copyTimePeriod);
                } else {
                    if (timePeriodShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.timePeriod = null;
                    }
                }
            }
            {
                Boolean valueShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.value!= null)&&(!this.value.isEmpty())));
                if (valueShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<BillValueType> sourceValue;
                    sourceValue = (((this.value!= null)&&(!this.value.isEmpty()))?this.getValue():null);
                    @SuppressWarnings("unchecked")
                    List<BillValueType> copyValue = ((List<BillValueType> ) strategy.copy(LocatorUtils.property(locator, "value", sourceValue), sourceValue, ((this.value!= null)&&(!this.value.isEmpty()))));
                    copy.value = null;
                    if (copyValue!= null) {
                        List<BillValueType> uniqueValuel = copy.getValue();
                        uniqueValuel.addAll(copyValue);
                    }
                } else {
                    if (valueShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.value = null;
                    }
                }
            }
            {
                Boolean costShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.cost!= null)&&(!this.cost.isEmpty())));
                if (costShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<BillCostType> sourceCost;
                    sourceCost = (((this.cost!= null)&&(!this.cost.isEmpty()))?this.getCost():null);
                    @SuppressWarnings("unchecked")
                    List<BillCostType> copyCost = ((List<BillCostType> ) strategy.copy(LocatorUtils.property(locator, "cost", sourceCost), sourceCost, ((this.cost!= null)&&(!this.cost.isEmpty()))));
                    copy.cost = null;
                    if (copyCost!= null) {
                        List<BillCostType> uniqueCostl = copy.getCost();
                        uniqueCostl.addAll(copyCost);
                    }
                } else {
                    if (costShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.cost = null;
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
        return new BillPositionType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final BillPositionType that = ((BillPositionType) object);
        {
            Long leftPositionId;
            leftPositionId = this.getPositionId();
            Long rightPositionId;
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
            String leftPositionType;
            leftPositionType = this.getPositionType();
            String rightPositionType;
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
            TimePeriodType leftTimePeriod;
            leftTimePeriod = this.getTimePeriod();
            TimePeriodType rightTimePeriod;
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
            List<BillValueType> leftValue;
            leftValue = (((this.value!= null)&&(!this.value.isEmpty()))?this.getValue():null);
            List<BillValueType> rightValue;
            rightValue = (((that.value!= null)&&(!that.value.isEmpty()))?that.getValue():null);
            if ((this.value!= null)&&(!this.value.isEmpty())) {
                if ((that.value!= null)&&(!that.value.isEmpty())) {
                    if (!leftValue.equals(rightValue)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.value!= null)&&(!that.value.isEmpty())) {
                    return false;
                }
            }
        }
        {
            List<BillCostType> leftCost;
            leftCost = (((this.cost!= null)&&(!this.cost.isEmpty()))?this.getCost():null);
            List<BillCostType> rightCost;
            rightCost = (((that.cost!= null)&&(!that.cost.isEmpty()))?that.getCost():null);
            if ((this.cost!= null)&&(!this.cost.isEmpty())) {
                if ((that.cost!= null)&&(!that.cost.isEmpty())) {
                    if (!leftCost.equals(rightCost)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.cost!= null)&&(!that.cost.isEmpty())) {
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
            Long thePositionId;
            thePositionId = this.getPositionId();
            if (this.positionId!= null) {
                currentHashCode += thePositionId.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String thePositionType;
            thePositionType = this.getPositionType();
            if (this.positionType!= null) {
                currentHashCode += thePositionType.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            TimePeriodType theTimePeriod;
            theTimePeriod = this.getTimePeriod();
            if (this.timePeriod!= null) {
                currentHashCode += theTimePeriod.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            List<BillValueType> theValue;
            theValue = (((this.value!= null)&&(!this.value.isEmpty()))?this.getValue():null);
            if ((this.value!= null)&&(!this.value.isEmpty())) {
                currentHashCode += theValue.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            List<BillCostType> theCost;
            theCost = (((this.cost!= null)&&(!this.cost.isEmpty()))?this.getCost():null);
            if ((this.cost!= null)&&(!this.cost.isEmpty())) {
                currentHashCode += theCost.hashCode();
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
            Long thePositionId;
            thePositionId = this.getPositionId();
            strategy.appendField(locator, this, "positionId", buffer, thePositionId, (this.positionId!= null));
        }
        {
            String thePositionType;
            thePositionType = this.getPositionType();
            strategy.appendField(locator, this, "positionType", buffer, thePositionType, (this.positionType!= null));
        }
        {
            TimePeriodType theTimePeriod;
            theTimePeriod = this.getTimePeriod();
            strategy.appendField(locator, this, "timePeriod", buffer, theTimePeriod, (this.timePeriod!= null));
        }
        {
            List<BillValueType> theValue;
            theValue = (((this.value!= null)&&(!this.value.isEmpty()))?this.getValue():null);
            strategy.appendField(locator, this, "value", buffer, theValue, ((this.value!= null)&&(!this.value.isEmpty())));
        }
        {
            List<BillCostType> theCost;
            theCost = (((this.cost!= null)&&(!this.cost.isEmpty()))?this.getCost():null);
            strategy.appendField(locator, this, "cost", buffer, theCost, ((this.cost!= null)&&(!this.cost.isEmpty())));
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
