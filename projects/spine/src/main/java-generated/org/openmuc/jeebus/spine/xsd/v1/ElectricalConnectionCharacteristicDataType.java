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
 * <p>Java class for ElectricalConnectionCharacteristicDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElectricalConnectionCharacteristicDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="electricalConnectionId" type="{http://docs.eebus.org/spine/xsd/v1}ElectricalConnectionIdType" minOccurs="0"/&gt;
 *         &lt;element name="parameterId" type="{http://docs.eebus.org/spine/xsd/v1}ElectricalConnectionParameterIdType" minOccurs="0"/&gt;
 *         &lt;element name="characteristicId" type="{http://docs.eebus.org/spine/xsd/v1}ElectricalConnectionCharacteristicIdType" minOccurs="0"/&gt;
 *         &lt;element name="characteristicContext" type="{http://docs.eebus.org/spine/xsd/v1}ElectricalConnectionCharacteristicContextType" minOccurs="0"/&gt;
 *         &lt;element name="characteristicType" type="{http://docs.eebus.org/spine/xsd/v1}ElectricalConnectionCharacteristicTypeType" minOccurs="0"/&gt;
 *         &lt;element name="value" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberType" minOccurs="0"/&gt;
 *         &lt;element name="unit" type="{http://docs.eebus.org/spine/xsd/v1}UnitOfMeasurementType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElectricalConnectionCharacteristicDataType", propOrder = {
    "electricalConnectionId",
    "parameterId",
    "characteristicId",
    "characteristicContext",
    "characteristicType",
    "value",
    "unit"
})
public class ElectricalConnectionCharacteristicDataType implements Cloneable, CopyTo, ToString
{

    @XmlSchemaType(name = "unsignedInt")
    protected Long electricalConnectionId;
    @XmlSchemaType(name = "unsignedInt")
    protected Long parameterId;
    @XmlSchemaType(name = "unsignedInt")
    protected Long characteristicId;
    protected String characteristicContext;
    protected String characteristicType;
    protected ScaledNumberType value;
    protected String unit;

    /**
     * Default no-arg constructor
     * 
     */
    public ElectricalConnectionCharacteristicDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public ElectricalConnectionCharacteristicDataType(final Long electricalConnectionId, final Long parameterId, final Long characteristicId, final String characteristicContext, final String characteristicType, final ScaledNumberType value, final String unit) {
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
     *     {@link Long }
     *     
     */
    public Long getElectricalConnectionId() {
        return electricalConnectionId;
    }

    /**
     * Sets the value of the electricalConnectionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setElectricalConnectionId(Long value) {
        this.electricalConnectionId = value;
    }

    /**
     * Gets the value of the parameterId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getParameterId() {
        return parameterId;
    }

    /**
     * Sets the value of the parameterId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setParameterId(Long value) {
        this.parameterId = value;
    }

    /**
     * Gets the value of the characteristicId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCharacteristicId() {
        return characteristicId;
    }

    /**
     * Sets the value of the characteristicId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCharacteristicId(Long value) {
        this.characteristicId = value;
    }

    /**
     * Gets the value of the characteristicContext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharacteristicContext() {
        return characteristicContext;
    }

    /**
     * Sets the value of the characteristicContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCharacteristicContext(String value) {
        this.characteristicContext = value;
    }

    /**
     * Gets the value of the characteristicType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharacteristicType() {
        return characteristicType;
    }

    /**
     * Sets the value of the characteristicType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCharacteristicType(String value) {
        this.characteristicType = value;
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
     * Sets the value of the electricalConnectionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     * @return
     *     The class instance
     */
    public ElectricalConnectionCharacteristicDataType withElectricalConnectionId(Long value) {
        setElectricalConnectionId(value);
        return this;
    }

    /**
     * Sets the value of the parameterId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     * @return
     *     The class instance
     */
    public ElectricalConnectionCharacteristicDataType withParameterId(Long value) {
        setParameterId(value);
        return this;
    }

    /**
     * Sets the value of the characteristicId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     * @return
     *     The class instance
     */
    public ElectricalConnectionCharacteristicDataType withCharacteristicId(Long value) {
        setCharacteristicId(value);
        return this;
    }

    /**
     * Sets the value of the characteristicContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public ElectricalConnectionCharacteristicDataType withCharacteristicContext(String value) {
        setCharacteristicContext(value);
        return this;
    }

    /**
     * Sets the value of the characteristicType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public ElectricalConnectionCharacteristicDataType withCharacteristicType(String value) {
        setCharacteristicType(value);
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
    public ElectricalConnectionCharacteristicDataType withValue(ScaledNumberType value) {
        setValue(value);
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
    public ElectricalConnectionCharacteristicDataType withUnit(String value) {
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
        if (draftCopy instanceof ElectricalConnectionCharacteristicDataType) {
            final ElectricalConnectionCharacteristicDataType copy = ((ElectricalConnectionCharacteristicDataType) draftCopy);
            {
                Boolean electricalConnectionIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.electricalConnectionId!= null));
                if (electricalConnectionIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceElectricalConnectionId;
                    sourceElectricalConnectionId = this.getElectricalConnectionId();
                    Long copyElectricalConnectionId = ((Long) strategy.copy(LocatorUtils.property(locator, "electricalConnectionId", sourceElectricalConnectionId), sourceElectricalConnectionId, (this.electricalConnectionId!= null)));
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
                    Long sourceParameterId;
                    sourceParameterId = this.getParameterId();
                    Long copyParameterId = ((Long) strategy.copy(LocatorUtils.property(locator, "parameterId", sourceParameterId), sourceParameterId, (this.parameterId!= null)));
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
                    Long sourceCharacteristicId;
                    sourceCharacteristicId = this.getCharacteristicId();
                    Long copyCharacteristicId = ((Long) strategy.copy(LocatorUtils.property(locator, "characteristicId", sourceCharacteristicId), sourceCharacteristicId, (this.characteristicId!= null)));
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
                    String sourceCharacteristicContext;
                    sourceCharacteristicContext = this.getCharacteristicContext();
                    String copyCharacteristicContext = ((String) strategy.copy(LocatorUtils.property(locator, "characteristicContext", sourceCharacteristicContext), sourceCharacteristicContext, (this.characteristicContext!= null)));
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
                    String sourceCharacteristicType;
                    sourceCharacteristicType = this.getCharacteristicType();
                    String copyCharacteristicType = ((String) strategy.copy(LocatorUtils.property(locator, "characteristicType", sourceCharacteristicType), sourceCharacteristicType, (this.characteristicType!= null)));
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
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new ElectricalConnectionCharacteristicDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ElectricalConnectionCharacteristicDataType that = ((ElectricalConnectionCharacteristicDataType) object);
        {
            Long leftElectricalConnectionId;
            leftElectricalConnectionId = this.getElectricalConnectionId();
            Long rightElectricalConnectionId;
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
            Long leftParameterId;
            leftParameterId = this.getParameterId();
            Long rightParameterId;
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
            Long leftCharacteristicId;
            leftCharacteristicId = this.getCharacteristicId();
            Long rightCharacteristicId;
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
            String leftCharacteristicContext;
            leftCharacteristicContext = this.getCharacteristicContext();
            String rightCharacteristicContext;
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
            String leftCharacteristicType;
            leftCharacteristicType = this.getCharacteristicType();
            String rightCharacteristicType;
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
        return true;
    }

    @Override
    public int hashCode() {
        int currentHashCode = 1;
        {
            currentHashCode = (currentHashCode* 31);
            Long theElectricalConnectionId;
            theElectricalConnectionId = this.getElectricalConnectionId();
            if (this.electricalConnectionId!= null) {
                currentHashCode += theElectricalConnectionId.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            Long theParameterId;
            theParameterId = this.getParameterId();
            if (this.parameterId!= null) {
                currentHashCode += theParameterId.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            Long theCharacteristicId;
            theCharacteristicId = this.getCharacteristicId();
            if (this.characteristicId!= null) {
                currentHashCode += theCharacteristicId.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String theCharacteristicContext;
            theCharacteristicContext = this.getCharacteristicContext();
            if (this.characteristicContext!= null) {
                currentHashCode += theCharacteristicContext.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String theCharacteristicType;
            theCharacteristicType = this.getCharacteristicType();
            if (this.characteristicType!= null) {
                currentHashCode += theCharacteristicType.hashCode();
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
            String theUnit;
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
            Long theElectricalConnectionId;
            theElectricalConnectionId = this.getElectricalConnectionId();
            strategy.appendField(locator, this, "electricalConnectionId", buffer, theElectricalConnectionId, (this.electricalConnectionId!= null));
        }
        {
            Long theParameterId;
            theParameterId = this.getParameterId();
            strategy.appendField(locator, this, "parameterId", buffer, theParameterId, (this.parameterId!= null));
        }
        {
            Long theCharacteristicId;
            theCharacteristicId = this.getCharacteristicId();
            strategy.appendField(locator, this, "characteristicId", buffer, theCharacteristicId, (this.characteristicId!= null));
        }
        {
            String theCharacteristicContext;
            theCharacteristicContext = this.getCharacteristicContext();
            strategy.appendField(locator, this, "characteristicContext", buffer, theCharacteristicContext, (this.characteristicContext!= null));
        }
        {
            String theCharacteristicType;
            theCharacteristicType = this.getCharacteristicType();
            strategy.appendField(locator, this, "characteristicType", buffer, theCharacteristicType, (this.characteristicType!= null));
        }
        {
            ScaledNumberType theValue;
            theValue = this.getValue();
            strategy.appendField(locator, this, "value", buffer, theValue, (this.value!= null));
        }
        {
            String theUnit;
            theUnit = this.getUnit();
            strategy.appendField(locator, this, "unit", buffer, theUnit, (this.unit!= null));
        }
        return buffer;
    }

}
