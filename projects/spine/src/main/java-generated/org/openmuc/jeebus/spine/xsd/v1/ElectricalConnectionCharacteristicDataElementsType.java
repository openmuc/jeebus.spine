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
 * <p>Java class for ElectricalConnectionCharacteristicDataElementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElectricalConnectionCharacteristicDataElementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="electricalConnectionId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="parameterId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="characteristicId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="characteristicContext" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="characteristicType" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="value" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberElementsType" minOccurs="0"/&gt;
 *         &lt;element name="unit" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElectricalConnectionCharacteristicDataElementsType", propOrder = {
    "electricalConnectionId",
    "parameterId",
    "characteristicId",
    "characteristicContext",
    "characteristicType",
    "value",
    "unit"
})
public class ElectricalConnectionCharacteristicDataElementsType implements Cloneable, CopyTo, ToString
{

    protected ElementTagType electricalConnectionId;
    protected ElementTagType parameterId;
    protected ElementTagType characteristicId;
    protected ElementTagType characteristicContext;
    protected ElementTagType characteristicType;
    protected ScaledNumberElementsType value;
    protected ElementTagType unit;

    /**
     * Default no-arg constructor
     * 
     */
    public ElectricalConnectionCharacteristicDataElementsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public ElectricalConnectionCharacteristicDataElementsType(final ElementTagType electricalConnectionId, final ElementTagType parameterId, final ElementTagType characteristicId, final ElementTagType characteristicContext, final ElementTagType characteristicType, final ScaledNumberElementsType value, final ElementTagType unit) {
        this.electricalConnectionId = electricalConnectionId;
        this.parameterId = parameterId;
        this.characteristicId = characteristicId;
        this.characteristicContext = characteristicContext;
        this.characteristicType = characteristicType;
        this.value = value;
        this.unit = unit;
    }

    /**
     * Gets the value of the electricalConnectionId property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getElectricalConnectionId() {
        return electricalConnectionId;
    }

    /**
     * Sets the value of the electricalConnectionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setElectricalConnectionId(ElementTagType value) {
        this.electricalConnectionId = value;
    }

    /**
     * Gets the value of the parameterId property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getParameterId() {
        return parameterId;
    }

    /**
     * Sets the value of the parameterId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setParameterId(ElementTagType value) {
        this.parameterId = value;
    }

    /**
     * Gets the value of the characteristicId property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getCharacteristicId() {
        return characteristicId;
    }

    /**
     * Sets the value of the characteristicId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setCharacteristicId(ElementTagType value) {
        this.characteristicId = value;
    }

    /**
     * Gets the value of the characteristicContext property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getCharacteristicContext() {
        return characteristicContext;
    }

    /**
     * Sets the value of the characteristicContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setCharacteristicContext(ElementTagType value) {
        this.characteristicContext = value;
    }

    /**
     * Gets the value of the characteristicType property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getCharacteristicType() {
        return characteristicType;
    }

    /**
     * Sets the value of the characteristicType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setCharacteristicType(ElementTagType value) {
        this.characteristicType = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link ScaledNumberElementsType }
     *     
     */
    public ScaledNumberElementsType getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberElementsType }
     *     
     */
    public void setValue(ScaledNumberElementsType value) {
        this.value = value;
    }

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setUnit(ElementTagType value) {
        this.unit = value;
    }

    /**
     * Sets the value of the electricalConnectionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public ElectricalConnectionCharacteristicDataElementsType withElectricalConnectionId(ElementTagType value) {
        setElectricalConnectionId(value);
        return this;
    }

    /**
     * Sets the value of the parameterId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public ElectricalConnectionCharacteristicDataElementsType withParameterId(ElementTagType value) {
        setParameterId(value);
        return this;
    }

    /**
     * Sets the value of the characteristicId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public ElectricalConnectionCharacteristicDataElementsType withCharacteristicId(ElementTagType value) {
        setCharacteristicId(value);
        return this;
    }

    /**
     * Sets the value of the characteristicContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public ElectricalConnectionCharacteristicDataElementsType withCharacteristicContext(ElementTagType value) {
        setCharacteristicContext(value);
        return this;
    }

    /**
     * Sets the value of the characteristicType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public ElectricalConnectionCharacteristicDataElementsType withCharacteristicType(ElementTagType value) {
        setCharacteristicType(value);
        return this;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberElementsType }
     * @return
     *     The class instance
     */
    public ElectricalConnectionCharacteristicDataElementsType withValue(ScaledNumberElementsType value) {
        setValue(value);
        return this;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public ElectricalConnectionCharacteristicDataElementsType withUnit(ElementTagType value) {
        setUnit(value);
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
        if (draftCopy instanceof ElectricalConnectionCharacteristicDataElementsType) {
            final ElectricalConnectionCharacteristicDataElementsType copy = ((ElectricalConnectionCharacteristicDataElementsType) draftCopy);
            {
                Boolean electricalConnectionIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.electricalConnectionId!= null));
                if (electricalConnectionIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceElectricalConnectionId;
                    sourceElectricalConnectionId = this.getElectricalConnectionId();
                    ElementTagType copyElectricalConnectionId = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "electricalConnectionId", sourceElectricalConnectionId), sourceElectricalConnectionId, (this.electricalConnectionId!= null)));
                    copy.setElectricalConnectionId(copyElectricalConnectionId);
                } else {
                    if (electricalConnectionIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.electricalConnectionId = null;
                    }
                }
            }
            {
                Boolean parameterIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.parameterId!= null));
                if (parameterIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceParameterId;
                    sourceParameterId = this.getParameterId();
                    ElementTagType copyParameterId = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "parameterId", sourceParameterId), sourceParameterId, (this.parameterId!= null)));
                    copy.setParameterId(copyParameterId);
                } else {
                    if (parameterIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.parameterId = null;
                    }
                }
            }
            {
                Boolean characteristicIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.characteristicId!= null));
                if (characteristicIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceCharacteristicId;
                    sourceCharacteristicId = this.getCharacteristicId();
                    ElementTagType copyCharacteristicId = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "characteristicId", sourceCharacteristicId), sourceCharacteristicId, (this.characteristicId!= null)));
                    copy.setCharacteristicId(copyCharacteristicId);
                } else {
                    if (characteristicIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.characteristicId = null;
                    }
                }
            }
            {
                Boolean characteristicContextShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.characteristicContext!= null));
                if (characteristicContextShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceCharacteristicContext;
                    sourceCharacteristicContext = this.getCharacteristicContext();
                    ElementTagType copyCharacteristicContext = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "characteristicContext", sourceCharacteristicContext), sourceCharacteristicContext, (this.characteristicContext!= null)));
                    copy.setCharacteristicContext(copyCharacteristicContext);
                } else {
                    if (characteristicContextShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.characteristicContext = null;
                    }
                }
            }
            {
                Boolean characteristicTypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.characteristicType!= null));
                if (characteristicTypeShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceCharacteristicType;
                    sourceCharacteristicType = this.getCharacteristicType();
                    ElementTagType copyCharacteristicType = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "characteristicType", sourceCharacteristicType), sourceCharacteristicType, (this.characteristicType!= null)));
                    copy.setCharacteristicType(copyCharacteristicType);
                } else {
                    if (characteristicTypeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.characteristicType = null;
                    }
                }
            }
            {
                Boolean valueShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.value!= null));
                if (valueShouldBeCopiedAndSet == Boolean.TRUE) {
                    ScaledNumberElementsType sourceValue;
                    sourceValue = this.getValue();
                    ScaledNumberElementsType copyValue = ((ScaledNumberElementsType) strategy.copy(LocatorUtils.property(locator, "value", sourceValue), sourceValue, (this.value!= null)));
                    copy.setValue(copyValue);
                } else {
                    if (valueShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.value = null;
                    }
                }
            }
            {
                Boolean unitShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.unit!= null));
                if (unitShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceUnit;
                    sourceUnit = this.getUnit();
                    ElementTagType copyUnit = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "unit", sourceUnit), sourceUnit, (this.unit!= null)));
                    copy.setUnit(copyUnit);
                } else {
                    if (unitShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.unit = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new ElectricalConnectionCharacteristicDataElementsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ElectricalConnectionCharacteristicDataElementsType that = ((ElectricalConnectionCharacteristicDataElementsType) object);
        {
            ElementTagType leftElectricalConnectionId;
            leftElectricalConnectionId = this.getElectricalConnectionId();
            ElementTagType rightElectricalConnectionId;
            rightElectricalConnectionId = that.getElectricalConnectionId();
            if (this.electricalConnectionId!= null) {
                if (that.electricalConnectionId!= null) {
                    if (!leftElectricalConnectionId.equals(rightElectricalConnectionId)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.electricalConnectionId!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftParameterId;
            leftParameterId = this.getParameterId();
            ElementTagType rightParameterId;
            rightParameterId = that.getParameterId();
            if (this.parameterId!= null) {
                if (that.parameterId!= null) {
                    if (!leftParameterId.equals(rightParameterId)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.parameterId!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftCharacteristicId;
            leftCharacteristicId = this.getCharacteristicId();
            ElementTagType rightCharacteristicId;
            rightCharacteristicId = that.getCharacteristicId();
            if (this.characteristicId!= null) {
                if (that.characteristicId!= null) {
                    if (!leftCharacteristicId.equals(rightCharacteristicId)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.characteristicId!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftCharacteristicContext;
            leftCharacteristicContext = this.getCharacteristicContext();
            ElementTagType rightCharacteristicContext;
            rightCharacteristicContext = that.getCharacteristicContext();
            if (this.characteristicContext!= null) {
                if (that.characteristicContext!= null) {
                    if (!leftCharacteristicContext.equals(rightCharacteristicContext)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.characteristicContext!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftCharacteristicType;
            leftCharacteristicType = this.getCharacteristicType();
            ElementTagType rightCharacteristicType;
            rightCharacteristicType = that.getCharacteristicType();
            if (this.characteristicType!= null) {
                if (that.characteristicType!= null) {
                    if (!leftCharacteristicType.equals(rightCharacteristicType)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.characteristicType!= null) {
                    return false;
                }
            }
        }
        {
            ScaledNumberElementsType leftValue;
            leftValue = this.getValue();
            ScaledNumberElementsType rightValue;
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
            ElementTagType leftUnit;
            leftUnit = this.getUnit();
            ElementTagType rightUnit;
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
        return true;
    }

    @Override
    public int hashCode() {
        int currentHashCode = 1;
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theElectricalConnectionId;
            theElectricalConnectionId = this.getElectricalConnectionId();
            if (this.electricalConnectionId!= null) {
                currentHashCode += theElectricalConnectionId.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theParameterId;
            theParameterId = this.getParameterId();
            if (this.parameterId!= null) {
                currentHashCode += theParameterId.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theCharacteristicId;
            theCharacteristicId = this.getCharacteristicId();
            if (this.characteristicId!= null) {
                currentHashCode += theCharacteristicId.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theCharacteristicContext;
            theCharacteristicContext = this.getCharacteristicContext();
            if (this.characteristicContext!= null) {
                currentHashCode += theCharacteristicContext.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theCharacteristicType;
            theCharacteristicType = this.getCharacteristicType();
            if (this.characteristicType!= null) {
                currentHashCode += theCharacteristicType.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ScaledNumberElementsType theValue;
            theValue = this.getValue();
            if (this.value!= null) {
                currentHashCode += theValue.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theUnit;
            theUnit = this.getUnit();
            if (this.unit!= null) {
                currentHashCode += theUnit.hashCode();
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
            ElementTagType theElectricalConnectionId;
            theElectricalConnectionId = this.getElectricalConnectionId();
            strategy.appendField(locator, this, "electricalConnectionId", buffer, theElectricalConnectionId, (this.electricalConnectionId!= null));
        }
        {
            ElementTagType theParameterId;
            theParameterId = this.getParameterId();
            strategy.appendField(locator, this, "parameterId", buffer, theParameterId, (this.parameterId!= null));
        }
        {
            ElementTagType theCharacteristicId;
            theCharacteristicId = this.getCharacteristicId();
            strategy.appendField(locator, this, "characteristicId", buffer, theCharacteristicId, (this.characteristicId!= null));
        }
        {
            ElementTagType theCharacteristicContext;
            theCharacteristicContext = this.getCharacteristicContext();
            strategy.appendField(locator, this, "characteristicContext", buffer, theCharacteristicContext, (this.characteristicContext!= null));
        }
        {
            ElementTagType theCharacteristicType;
            theCharacteristicType = this.getCharacteristicType();
            strategy.appendField(locator, this, "characteristicType", buffer, theCharacteristicType, (this.characteristicType!= null));
        }
        {
            ScaledNumberElementsType theValue;
            theValue = this.getValue();
            strategy.appendField(locator, this, "value", buffer, theValue, (this.value!= null));
        }
        {
            ElementTagType theUnit;
            theUnit = this.getUnit();
            strategy.appendField(locator, this, "unit", buffer, theUnit, (this.unit!= null));
        }
        return buffer;
    }

}
