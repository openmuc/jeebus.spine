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
 * <p>Java class for BillValueType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BillValueType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="valueId" type="{http://docs.eebus.org/spine/xsd/v1}BillValueIdType" minOccurs="0"/&gt;
 *         &lt;element name="unit" type="{http://docs.eebus.org/spine/xsd/v1}UnitOfMeasurementType" minOccurs="0"/&gt;
 *         &lt;element name="value" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberType" minOccurs="0"/&gt;
 *         &lt;element name="valuePercentage" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillValueType", propOrder = {
    "valueId",
    "unit",
    "value",
    "valuePercentage"
})
public class BillValueType implements Cloneable, CopyTo, ToString
{

    @XmlSchemaType(name = "unsignedInt")
    protected Long valueId;
    protected String unit;
    protected ScaledNumberType value;
    protected ScaledNumberType valuePercentage;

    /**
     * Default no-arg constructor
     * 
     */
    public BillValueType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public BillValueType(final Long valueId, final String unit, final ScaledNumberType value, final ScaledNumberType valuePercentage) {
        this.valueId = valueId;
        this.unit = unit;
        this.value = value;
        this.valuePercentage = valuePercentage;
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
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link ScaledNumberType }
     *     
     */
    public ScaledNumberType getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberType }
     *     
     */
    public void setValue(ScaledNumberType value) {
        this.value = value;
    }

    /**
     * Gets the value of the valuePercentage property.
     * 
     * @return
     *     possible object is
     *     {@link ScaledNumberType }
     *     
     */
    public ScaledNumberType getValuePercentage() {
        return valuePercentage;
    }

    /**
     * Sets the value of the valuePercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberType }
     *     
     */
    public void setValuePercentage(ScaledNumberType value) {
        this.valuePercentage = value;
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
    public BillValueType withValueId(Long value) {
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
    public BillValueType withUnit(String value) {
        setUnit(value);
        return this;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberType }
     * @return
     *     The class instance
     */
    public BillValueType withValue(ScaledNumberType value) {
        setValue(value);
        return this;
    }

    /**
     * Sets the value of the valuePercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberType }
     * @return
     *     The class instance
     */
    public BillValueType withValuePercentage(ScaledNumberType value) {
        setValuePercentage(value);
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
        if (draftCopy instanceof BillValueType) {
            final BillValueType copy = ((BillValueType) draftCopy);
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
                Boolean valueShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.value!= null));
                if (valueShouldBeCopiedAndSet == Boolean.TRUE) {
                    ScaledNumberType sourceValue;
                    sourceValue = this.getValue();
                    ScaledNumberType copyValue = ((ScaledNumberType) strategy.copy(LocatorUtils.property(locator, "value", sourceValue), sourceValue, (this.value!= null)));
                    copy.setValue(copyValue);
                } else {
                    if (valueShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.value = null;
                    }
                }
            }
            {
                Boolean valuePercentageShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.valuePercentage!= null));
                if (valuePercentageShouldBeCopiedAndSet == Boolean.TRUE) {
                    ScaledNumberType sourceValuePercentage;
                    sourceValuePercentage = this.getValuePercentage();
                    ScaledNumberType copyValuePercentage = ((ScaledNumberType) strategy.copy(LocatorUtils.property(locator, "valuePercentage", sourceValuePercentage), sourceValuePercentage, (this.valuePercentage!= null)));
                    copy.setValuePercentage(copyValuePercentage);
                } else {
                    if (valuePercentageShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.valuePercentage = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new BillValueType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final BillValueType that = ((BillValueType) object);
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
            ScaledNumberType leftValue;
            leftValue = this.getValue();
            ScaledNumberType rightValue;
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
            ScaledNumberType leftValuePercentage;
            leftValuePercentage = this.getValuePercentage();
            ScaledNumberType rightValuePercentage;
            rightValuePercentage = that.getValuePercentage();
            if (this.valuePercentage!= null) {
                if (that.valuePercentage!= null) {
                    if (!leftValuePercentage.equals(rightValuePercentage)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.valuePercentage!= null) {
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
            ScaledNumberType theValue;
            theValue = this.getValue();
            if (this.value!= null) {
                currentHashCode += theValue.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ScaledNumberType theValuePercentage;
            theValuePercentage = this.getValuePercentage();
            if (this.valuePercentage!= null) {
                currentHashCode += theValuePercentage.hashCode();
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
            ScaledNumberType theValue;
            theValue = this.getValue();
            strategy.appendField(locator, this, "value", buffer, theValue, (this.value!= null));
        }
        {
            ScaledNumberType theValuePercentage;
            theValuePercentage = this.getValuePercentage();
            strategy.appendField(locator, this, "valuePercentage", buffer, theValuePercentage, (this.valuePercentage!= null));
        }
        return buffer;
    }

}
