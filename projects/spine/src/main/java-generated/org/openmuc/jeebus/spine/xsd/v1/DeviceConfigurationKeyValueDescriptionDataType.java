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
 * <p>Java class for DeviceConfigurationKeyValueDescriptionDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeviceConfigurationKeyValueDescriptionDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="keyId" type="{http://docs.eebus.org/spine/xsd/v1}DeviceConfigurationKeyIdType" minOccurs="0"/&gt;
 *         &lt;element name="keyName" type="{http://docs.eebus.org/spine/xsd/v1}DeviceConfigurationKeyNameType" minOccurs="0"/&gt;
 *         &lt;element name="valueType" type="{http://docs.eebus.org/spine/xsd/v1}DeviceConfigurationKeyValueTypeType" minOccurs="0"/&gt;
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
@XmlType(name = "DeviceConfigurationKeyValueDescriptionDataType", propOrder = {
    "keyId",
    "keyName",
    "valueType",
    "unit",
    "label",
    "description"
})
public class DeviceConfigurationKeyValueDescriptionDataType implements Cloneable, CopyTo, ToString
{

    @XmlSchemaType(name = "unsignedInt")
    protected Long keyId;
    protected String keyName;
    @XmlSchemaType(name = "string")
    protected DeviceConfigurationKeyValueTypeType valueType;
    protected String unit;
    protected String label;
    protected String description;

    /**
     * Default no-arg constructor
     * 
     */
    public DeviceConfigurationKeyValueDescriptionDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public DeviceConfigurationKeyValueDescriptionDataType(final Long keyId, final String keyName, final DeviceConfigurationKeyValueTypeType valueType, final String unit, final String label, final String description) {
        this.keyId = keyId;
        this.keyName = keyName;
        this.valueType = valueType;
        this.unit = unit;
        this.label = label;
        this.description = description;
    }

    /**
     * Gets the value of the keyId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getKeyId() {
        return keyId;
    }

    /**
     * Sets the value of the keyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setKeyId(Long value) {
        this.keyId = value;
    }

    /**
     * Gets the value of the keyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyName() {
        return keyName;
    }

    /**
     * Sets the value of the keyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyName(String value) {
        this.keyName = value;
    }

    /**
     * Gets the value of the valueType property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceConfigurationKeyValueTypeType }
     *     
     */
    public DeviceConfigurationKeyValueTypeType getValueType() {
        return valueType;
    }

    /**
     * Sets the value of the valueType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceConfigurationKeyValueTypeType }
     *     
     */
    public void setValueType(DeviceConfigurationKeyValueTypeType value) {
        this.valueType = value;
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
     * Sets the value of the keyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     * @return
     *     The class instance
     */
    public DeviceConfigurationKeyValueDescriptionDataType withKeyId(Long value) {
        setKeyId(value);
        return this;
    }

    /**
     * Sets the value of the keyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public DeviceConfigurationKeyValueDescriptionDataType withKeyName(String value) {
        setKeyName(value);
        return this;
    }

    /**
     * Sets the value of the valueType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceConfigurationKeyValueTypeType }
     * @return
     *     The class instance
     */
    public DeviceConfigurationKeyValueDescriptionDataType withValueType(DeviceConfigurationKeyValueTypeType value) {
        setValueType(value);
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
    public DeviceConfigurationKeyValueDescriptionDataType withUnit(String value) {
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
    public DeviceConfigurationKeyValueDescriptionDataType withLabel(String value) {
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
    public DeviceConfigurationKeyValueDescriptionDataType withDescription(String value) {
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
        if (draftCopy instanceof DeviceConfigurationKeyValueDescriptionDataType) {
            final DeviceConfigurationKeyValueDescriptionDataType copy = ((DeviceConfigurationKeyValueDescriptionDataType) draftCopy);
            {
                Boolean keyIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.keyId!= null));
                if (keyIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceKeyId;
                    sourceKeyId = this.getKeyId();
                    Long copyKeyId = ((Long) strategy.copy(LocatorUtils.property(locator, "keyId", sourceKeyId), sourceKeyId, (this.keyId!= null)));
                    copy.setKeyId(copyKeyId);
                } else {
                    if (keyIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.keyId = null;
                    }
                }
            }
            {
                Boolean keyNameShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.keyName!= null));
                if (keyNameShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceKeyName;
                    sourceKeyName = this.getKeyName();
                    String copyKeyName = ((String) strategy.copy(LocatorUtils.property(locator, "keyName", sourceKeyName), sourceKeyName, (this.keyName!= null)));
                    copy.setKeyName(copyKeyName);
                } else {
                    if (keyNameShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.keyName = null;
                    }
                }
            }
            {
                Boolean valueTypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.valueType!= null));
                if (valueTypeShouldBeCopiedAndSet == Boolean.TRUE) {
                    DeviceConfigurationKeyValueTypeType sourceValueType;
                    sourceValueType = this.getValueType();
                    DeviceConfigurationKeyValueTypeType copyValueType = ((DeviceConfigurationKeyValueTypeType) strategy.copy(LocatorUtils.property(locator, "valueType", sourceValueType), sourceValueType, (this.valueType!= null)));
                    copy.setValueType(copyValueType);
                } else {
                    if (valueTypeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.valueType = null;
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
        return new DeviceConfigurationKeyValueDescriptionDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DeviceConfigurationKeyValueDescriptionDataType that = ((DeviceConfigurationKeyValueDescriptionDataType) object);
        {
            Long leftKeyId;
            leftKeyId = this.getKeyId();
            Long rightKeyId;
            rightKeyId = that.getKeyId();
            if (this.keyId!= null) {
                if (that.keyId!= null) {
                    if (!leftKeyId.equals(rightKeyId)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.keyId!= null) {
                    return false;
                }
            }
        }
        {
            String leftKeyName;
            leftKeyName = this.getKeyName();
            String rightKeyName;
            rightKeyName = that.getKeyName();
            if (this.keyName!= null) {
                if (that.keyName!= null) {
                    if (!leftKeyName.equals(rightKeyName)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.keyName!= null) {
                    return false;
                }
            }
        }
        {
            DeviceConfigurationKeyValueTypeType leftValueType;
            leftValueType = this.getValueType();
            DeviceConfigurationKeyValueTypeType rightValueType;
            rightValueType = that.getValueType();
            if (this.valueType!= null) {
                if (that.valueType!= null) {
                    if (!leftValueType.equals(rightValueType)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.valueType!= null) {
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
            Long theKeyId;
            theKeyId = this.getKeyId();
            if (this.keyId!= null) {
                currentHashCode += theKeyId.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String theKeyName;
            theKeyName = this.getKeyName();
            if (this.keyName!= null) {
                currentHashCode += theKeyName.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            DeviceConfigurationKeyValueTypeType theValueType;
            theValueType = this.getValueType();
            if (this.valueType!= null) {
                currentHashCode += theValueType.hashCode();
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
            Long theKeyId;
            theKeyId = this.getKeyId();
            strategy.appendField(locator, this, "keyId", buffer, theKeyId, (this.keyId!= null));
        }
        {
            String theKeyName;
            theKeyName = this.getKeyName();
            strategy.appendField(locator, this, "keyName", buffer, theKeyName, (this.keyName!= null));
        }
        {
            DeviceConfigurationKeyValueTypeType theValueType;
            theValueType = this.getValueType();
            strategy.appendField(locator, this, "valueType", buffer, theValueType, (this.valueType!= null));
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
