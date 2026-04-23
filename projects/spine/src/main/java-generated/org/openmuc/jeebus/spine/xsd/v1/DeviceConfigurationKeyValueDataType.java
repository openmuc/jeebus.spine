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
 * <p>Java class for DeviceConfigurationKeyValueDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeviceConfigurationKeyValueDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="keyId" type="{http://docs.eebus.org/spine/xsd/v1}DeviceConfigurationKeyIdType" minOccurs="0"/&gt;
 *         &lt;element name="value" type="{http://docs.eebus.org/spine/xsd/v1}DeviceConfigurationKeyValueValueType" minOccurs="0"/&gt;
 *         &lt;element name="isValueChangeable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceConfigurationKeyValueDataType", propOrder = {
    "keyId",
    "value",
    "isValueChangeable"
})
public class DeviceConfigurationKeyValueDataType implements Cloneable, CopyTo, ToString
{

    @XmlSchemaType(name = "unsignedInt")
    protected Long keyId;
    protected DeviceConfigurationKeyValueValueType value;
    protected Boolean isValueChangeable;

    /**
     * Default no-arg constructor
     * 
     */
    public DeviceConfigurationKeyValueDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public DeviceConfigurationKeyValueDataType(final Long keyId, final DeviceConfigurationKeyValueValueType value, final Boolean isValueChangeable) {
        this.keyId = keyId;
        this.value = value;
        this.isValueChangeable = isValueChangeable;
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
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceConfigurationKeyValueValueType }
     *     
     */
    public DeviceConfigurationKeyValueValueType getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceConfigurationKeyValueValueType }
     *     
     */
    public void setValue(DeviceConfigurationKeyValueValueType value) {
        this.value = value;
    }

    /**
     * Gets the value of the isValueChangeable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getIsValueChangeable() {
        return isValueChangeable;
    }

    /**
     * Sets the value of the isValueChangeable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsValueChangeable(Boolean value) {
        this.isValueChangeable = value;
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
    public DeviceConfigurationKeyValueDataType withKeyId(Long value) {
        setKeyId(value);
        return this;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceConfigurationKeyValueValueType }
     * @return
     *     The class instance
     */
    public DeviceConfigurationKeyValueDataType withValue(DeviceConfigurationKeyValueValueType value) {
        setValue(value);
        return this;
    }

    /**
     * Sets the value of the isValueChangeable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     * @return
     *     The class instance
     */
    public DeviceConfigurationKeyValueDataType withIsValueChangeable(Boolean value) {
        setIsValueChangeable(value);
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
        if (draftCopy instanceof DeviceConfigurationKeyValueDataType) {
            final DeviceConfigurationKeyValueDataType copy = ((DeviceConfigurationKeyValueDataType) draftCopy);
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
                Boolean valueShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.value!= null));
                if (valueShouldBeCopiedAndSet == Boolean.TRUE) {
                    DeviceConfigurationKeyValueValueType sourceValue;
                    sourceValue = this.getValue();
                    DeviceConfigurationKeyValueValueType copyValue = ((DeviceConfigurationKeyValueValueType) strategy.copy(LocatorUtils.property(locator, "value", sourceValue), sourceValue, (this.value!= null)));
                    copy.setValue(copyValue);
                } else {
                    if (valueShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.value = null;
                    }
                }
            }
            {
                Boolean isValueChangeableShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.isValueChangeable!= null));
                if (isValueChangeableShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceIsValueChangeable;
                    sourceIsValueChangeable = this.getIsValueChangeable();
                    Boolean copyIsValueChangeable = ((Boolean) strategy.copy(LocatorUtils.property(locator, "isValueChangeable", sourceIsValueChangeable), sourceIsValueChangeable, (this.isValueChangeable!= null)));
                    copy.setIsValueChangeable(copyIsValueChangeable);
                } else {
                    if (isValueChangeableShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.isValueChangeable = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new DeviceConfigurationKeyValueDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DeviceConfigurationKeyValueDataType that = ((DeviceConfigurationKeyValueDataType) object);
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
            DeviceConfigurationKeyValueValueType leftValue;
            leftValue = this.getValue();
            DeviceConfigurationKeyValueValueType rightValue;
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
            Boolean leftIsValueChangeable;
            leftIsValueChangeable = this.getIsValueChangeable();
            Boolean rightIsValueChangeable;
            rightIsValueChangeable = that.getIsValueChangeable();
            if (this.isValueChangeable!= null) {
                if (that.isValueChangeable!= null) {
                    if (!leftIsValueChangeable.equals(rightIsValueChangeable)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.isValueChangeable!= null) {
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
            DeviceConfigurationKeyValueValueType theValue;
            theValue = this.getValue();
            if (this.value!= null) {
                currentHashCode += theValue.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            Boolean theIsValueChangeable;
            theIsValueChangeable = this.getIsValueChangeable();
            if (this.isValueChangeable!= null) {
                currentHashCode += theIsValueChangeable.hashCode();
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
            DeviceConfigurationKeyValueValueType theValue;
            theValue = this.getValue();
            strategy.appendField(locator, this, "value", buffer, theValue, (this.value!= null));
        }
        {
            Boolean theIsValueChangeable;
            theIsValueChangeable = this.getIsValueChangeable();
            strategy.appendField(locator, this, "isValueChangeable", buffer, theIsValueChangeable, (this.isValueChangeable!= null));
        }
        return buffer;
    }

}
