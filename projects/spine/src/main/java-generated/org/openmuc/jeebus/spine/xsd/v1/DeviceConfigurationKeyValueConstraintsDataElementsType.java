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
 * <p>Java class for DeviceConfigurationKeyValueConstraintsDataElementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeviceConfigurationKeyValueConstraintsDataElementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="keyId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="valueRangeMin" type="{http://docs.eebus.org/spine/xsd/v1}DeviceConfigurationKeyValueValueElementsType" minOccurs="0"/&gt;
 *         &lt;element name="valueRangeMax" type="{http://docs.eebus.org/spine/xsd/v1}DeviceConfigurationKeyValueValueElementsType" minOccurs="0"/&gt;
 *         &lt;element name="valueStepSize" type="{http://docs.eebus.org/spine/xsd/v1}DeviceConfigurationKeyValueValueElementsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceConfigurationKeyValueConstraintsDataElementsType", propOrder = {
    "keyId",
    "valueRangeMin",
    "valueRangeMax",
    "valueStepSize"
})
public class DeviceConfigurationKeyValueConstraintsDataElementsType implements Cloneable, CopyTo, ToString
{

    protected ElementTagType keyId;
    protected DeviceConfigurationKeyValueValueElementsType valueRangeMin;
    protected DeviceConfigurationKeyValueValueElementsType valueRangeMax;
    protected DeviceConfigurationKeyValueValueElementsType valueStepSize;

    /**
     * Default no-arg constructor
     * 
     */
    public DeviceConfigurationKeyValueConstraintsDataElementsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public DeviceConfigurationKeyValueConstraintsDataElementsType(final ElementTagType keyId, final DeviceConfigurationKeyValueValueElementsType valueRangeMin, final DeviceConfigurationKeyValueValueElementsType valueRangeMax, final DeviceConfigurationKeyValueValueElementsType valueStepSize) {
        this.keyId = keyId;
        this.valueRangeMin = valueRangeMin;
        this.valueRangeMax = valueRangeMax;
        this.valueStepSize = valueStepSize;
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
     * Gets the value of the valueRangeMin property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceConfigurationKeyValueValueElementsType }
     *     
     */
    public DeviceConfigurationKeyValueValueElementsType getValueRangeMin() {
        return valueRangeMin;
    }

    /**
     * Sets the value of the valueRangeMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceConfigurationKeyValueValueElementsType }
     *     
     */
    public void setValueRangeMin(DeviceConfigurationKeyValueValueElementsType value) {
        this.valueRangeMin = value;
    }

    /**
     * Gets the value of the valueRangeMax property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceConfigurationKeyValueValueElementsType }
     *     
     */
    public DeviceConfigurationKeyValueValueElementsType getValueRangeMax() {
        return valueRangeMax;
    }

    /**
     * Sets the value of the valueRangeMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceConfigurationKeyValueValueElementsType }
     *     
     */
    public void setValueRangeMax(DeviceConfigurationKeyValueValueElementsType value) {
        this.valueRangeMax = value;
    }

    /**
     * Gets the value of the valueStepSize property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceConfigurationKeyValueValueElementsType }
     *     
     */
    public DeviceConfigurationKeyValueValueElementsType getValueStepSize() {
        return valueStepSize;
    }

    /**
     * Sets the value of the valueStepSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceConfigurationKeyValueValueElementsType }
     *     
     */
    public void setValueStepSize(DeviceConfigurationKeyValueValueElementsType value) {
        this.valueStepSize = value;
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
    public DeviceConfigurationKeyValueConstraintsDataElementsType withKeyId(ElementTagType value) {
        setKeyId(value);
        return this;
    }

    /**
     * Sets the value of the valueRangeMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceConfigurationKeyValueValueElementsType }
     * @return
     *     The class instance
     */
    public DeviceConfigurationKeyValueConstraintsDataElementsType withValueRangeMin(DeviceConfigurationKeyValueValueElementsType value) {
        setValueRangeMin(value);
        return this;
    }

    /**
     * Sets the value of the valueRangeMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceConfigurationKeyValueValueElementsType }
     * @return
     *     The class instance
     */
    public DeviceConfigurationKeyValueConstraintsDataElementsType withValueRangeMax(DeviceConfigurationKeyValueValueElementsType value) {
        setValueRangeMax(value);
        return this;
    }

    /**
     * Sets the value of the valueStepSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceConfigurationKeyValueValueElementsType }
     * @return
     *     The class instance
     */
    public DeviceConfigurationKeyValueConstraintsDataElementsType withValueStepSize(DeviceConfigurationKeyValueValueElementsType value) {
        setValueStepSize(value);
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
        if (draftCopy instanceof DeviceConfigurationKeyValueConstraintsDataElementsType) {
            final DeviceConfigurationKeyValueConstraintsDataElementsType copy = ((DeviceConfigurationKeyValueConstraintsDataElementsType) draftCopy);
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
                Boolean valueRangeMinShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.valueRangeMin!= null));
                if (valueRangeMinShouldBeCopiedAndSet == Boolean.TRUE) {
                    DeviceConfigurationKeyValueValueElementsType sourceValueRangeMin;
                    sourceValueRangeMin = this.getValueRangeMin();
                    DeviceConfigurationKeyValueValueElementsType copyValueRangeMin = ((DeviceConfigurationKeyValueValueElementsType) strategy.copy(LocatorUtils.property(locator, "valueRangeMin", sourceValueRangeMin), sourceValueRangeMin, (this.valueRangeMin!= null)));
                    copy.setValueRangeMin(copyValueRangeMin);
                } else {
                    if (valueRangeMinShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.valueRangeMin = null;
                    }
                }
            }
            {
                Boolean valueRangeMaxShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.valueRangeMax!= null));
                if (valueRangeMaxShouldBeCopiedAndSet == Boolean.TRUE) {
                    DeviceConfigurationKeyValueValueElementsType sourceValueRangeMax;
                    sourceValueRangeMax = this.getValueRangeMax();
                    DeviceConfigurationKeyValueValueElementsType copyValueRangeMax = ((DeviceConfigurationKeyValueValueElementsType) strategy.copy(LocatorUtils.property(locator, "valueRangeMax", sourceValueRangeMax), sourceValueRangeMax, (this.valueRangeMax!= null)));
                    copy.setValueRangeMax(copyValueRangeMax);
                } else {
                    if (valueRangeMaxShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.valueRangeMax = null;
                    }
                }
            }
            {
                Boolean valueStepSizeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.valueStepSize!= null));
                if (valueStepSizeShouldBeCopiedAndSet == Boolean.TRUE) {
                    DeviceConfigurationKeyValueValueElementsType sourceValueStepSize;
                    sourceValueStepSize = this.getValueStepSize();
                    DeviceConfigurationKeyValueValueElementsType copyValueStepSize = ((DeviceConfigurationKeyValueValueElementsType) strategy.copy(LocatorUtils.property(locator, "valueStepSize", sourceValueStepSize), sourceValueStepSize, (this.valueStepSize!= null)));
                    copy.setValueStepSize(copyValueStepSize);
                } else {
                    if (valueStepSizeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.valueStepSize = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new DeviceConfigurationKeyValueConstraintsDataElementsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DeviceConfigurationKeyValueConstraintsDataElementsType that = ((DeviceConfigurationKeyValueConstraintsDataElementsType) object);
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
            DeviceConfigurationKeyValueValueElementsType leftValueRangeMin;
            leftValueRangeMin = this.getValueRangeMin();
            DeviceConfigurationKeyValueValueElementsType rightValueRangeMin;
            rightValueRangeMin = that.getValueRangeMin();
            if (this.valueRangeMin!= null) {
                if (that.valueRangeMin!= null) {
                    if (!leftValueRangeMin.equals(rightValueRangeMin)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.valueRangeMin!= null) {
                    return false;
                }
            }
        }
        {
            DeviceConfigurationKeyValueValueElementsType leftValueRangeMax;
            leftValueRangeMax = this.getValueRangeMax();
            DeviceConfigurationKeyValueValueElementsType rightValueRangeMax;
            rightValueRangeMax = that.getValueRangeMax();
            if (this.valueRangeMax!= null) {
                if (that.valueRangeMax!= null) {
                    if (!leftValueRangeMax.equals(rightValueRangeMax)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.valueRangeMax!= null) {
                    return false;
                }
            }
        }
        {
            DeviceConfigurationKeyValueValueElementsType leftValueStepSize;
            leftValueStepSize = this.getValueStepSize();
            DeviceConfigurationKeyValueValueElementsType rightValueStepSize;
            rightValueStepSize = that.getValueStepSize();
            if (this.valueStepSize!= null) {
                if (that.valueStepSize!= null) {
                    if (!leftValueStepSize.equals(rightValueStepSize)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.valueStepSize!= null) {
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
            DeviceConfigurationKeyValueValueElementsType theValueRangeMin;
            theValueRangeMin = this.getValueRangeMin();
            if (this.valueRangeMin!= null) {
                currentHashCode += theValueRangeMin.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            DeviceConfigurationKeyValueValueElementsType theValueRangeMax;
            theValueRangeMax = this.getValueRangeMax();
            if (this.valueRangeMax!= null) {
                currentHashCode += theValueRangeMax.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            DeviceConfigurationKeyValueValueElementsType theValueStepSize;
            theValueStepSize = this.getValueStepSize();
            if (this.valueStepSize!= null) {
                currentHashCode += theValueStepSize.hashCode();
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
            DeviceConfigurationKeyValueValueElementsType theValueRangeMin;
            theValueRangeMin = this.getValueRangeMin();
            strategy.appendField(locator, this, "valueRangeMin", buffer, theValueRangeMin, (this.valueRangeMin!= null));
        }
        {
            DeviceConfigurationKeyValueValueElementsType theValueRangeMax;
            theValueRangeMax = this.getValueRangeMax();
            strategy.appendField(locator, this, "valueRangeMax", buffer, theValueRangeMax, (this.valueRangeMax!= null));
        }
        {
            DeviceConfigurationKeyValueValueElementsType theValueStepSize;
            theValueStepSize = this.getValueStepSize();
            strategy.appendField(locator, this, "valueStepSize", buffer, theValueStepSize, (this.valueStepSize!= null));
        }
        return buffer;
    }

}
