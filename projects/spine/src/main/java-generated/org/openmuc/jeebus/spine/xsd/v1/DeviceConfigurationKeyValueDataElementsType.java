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
 * <p>Java class for DeviceConfigurationKeyValueDataElementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeviceConfigurationKeyValueDataElementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="keyId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="value" type="{http://docs.eebus.org/spine/xsd/v1}DeviceConfigurationKeyValueValueElementsType" minOccurs="0"/&gt;
 *         &lt;element name="isValueChangeable" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceConfigurationKeyValueDataElementsType", propOrder = {
    "keyId",
    "value",
    "isValueChangeable"
})
public class DeviceConfigurationKeyValueDataElementsType implements Cloneable, CopyTo, ToString
{

    protected ElementTagType keyId;
    protected DeviceConfigurationKeyValueValueElementsType value;
    protected ElementTagType isValueChangeable;

    /**
     * Default no-arg constructor
     * 
     */
    public DeviceConfigurationKeyValueDataElementsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public DeviceConfigurationKeyValueDataElementsType(final ElementTagType keyId, final DeviceConfigurationKeyValueValueElementsType value, final ElementTagType isValueChangeable) {
        this.keyId = keyId;
        this.value = value;
        this.isValueChangeable = isValueChangeable;
    }

    /**
     * Gets the value of the keyId property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getKeyId() {
        return keyId;
    }

    /**
     * Sets the value of the keyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setKeyId(ElementTagType value) {
        this.keyId = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceConfigurationKeyValueValueElementsType }
     *     
     */
    public DeviceConfigurationKeyValueValueElementsType getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceConfigurationKeyValueValueElementsType }
     *     
     */
    public void setValue(DeviceConfigurationKeyValueValueElementsType value) {
        this.value = value;
    }

    /**
     * Gets the value of the isValueChangeable property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getIsValueChangeable() {
        return isValueChangeable;
    }

    /**
     * Sets the value of the isValueChangeable property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setIsValueChangeable(ElementTagType value) {
        this.isValueChangeable = value;
    }

    /**
     * Sets the value of the keyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public DeviceConfigurationKeyValueDataElementsType withKeyId(ElementTagType value) {
        setKeyId(value);
        return this;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceConfigurationKeyValueValueElementsType }
     * @return
     *     The class instance
     */
    public DeviceConfigurationKeyValueDataElementsType withValue(DeviceConfigurationKeyValueValueElementsType value) {
        setValue(value);
        return this;
    }

    /**
     * Sets the value of the isValueChangeable property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public DeviceConfigurationKeyValueDataElementsType withIsValueChangeable(ElementTagType value) {
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
        if (draftCopy instanceof DeviceConfigurationKeyValueDataElementsType) {
            final DeviceConfigurationKeyValueDataElementsType copy = ((DeviceConfigurationKeyValueDataElementsType) draftCopy);
            {
                Boolean keyIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.keyId!= null));
                if (keyIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceKeyId;
                    sourceKeyId = this.getKeyId();
                    ElementTagType copyKeyId = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "keyId", sourceKeyId), sourceKeyId, (this.keyId!= null)));
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
                    DeviceConfigurationKeyValueValueElementsType sourceValue;
                    sourceValue = this.getValue();
                    DeviceConfigurationKeyValueValueElementsType copyValue = ((DeviceConfigurationKeyValueValueElementsType) strategy.copy(LocatorUtils.property(locator, "value", sourceValue), sourceValue, (this.value!= null)));
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
                    ElementTagType sourceIsValueChangeable;
                    sourceIsValueChangeable = this.getIsValueChangeable();
                    ElementTagType copyIsValueChangeable = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "isValueChangeable", sourceIsValueChangeable), sourceIsValueChangeable, (this.isValueChangeable!= null)));
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
        return new DeviceConfigurationKeyValueDataElementsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DeviceConfigurationKeyValueDataElementsType that = ((DeviceConfigurationKeyValueDataElementsType) object);
        {
            ElementTagType leftKeyId;
            leftKeyId = this.getKeyId();
            ElementTagType rightKeyId;
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
            DeviceConfigurationKeyValueValueElementsType leftValue;
            leftValue = this.getValue();
            DeviceConfigurationKeyValueValueElementsType rightValue;
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
            ElementTagType leftIsValueChangeable;
            leftIsValueChangeable = this.getIsValueChangeable();
            ElementTagType rightIsValueChangeable;
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
            ElementTagType theKeyId;
            theKeyId = this.getKeyId();
            if (this.keyId!= null) {
                currentHashCode += theKeyId.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            DeviceConfigurationKeyValueValueElementsType theValue;
            theValue = this.getValue();
            if (this.value!= null) {
                currentHashCode += theValue.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theIsValueChangeable;
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
            ElementTagType theKeyId;
            theKeyId = this.getKeyId();
            strategy.appendField(locator, this, "keyId", buffer, theKeyId, (this.keyId!= null));
        }
        {
            DeviceConfigurationKeyValueValueElementsType theValue;
            theValue = this.getValue();
            strategy.appendField(locator, this, "value", buffer, theValue, (this.value!= null));
        }
        {
            ElementTagType theIsValueChangeable;
            theIsValueChangeable = this.getIsValueChangeable();
            strategy.appendField(locator, this, "isValueChangeable", buffer, theIsValueChangeable, (this.isValueChangeable!= null));
        }
        return buffer;
    }

}
