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
 * <p>Java class for DeviceConfigurationKeyValueConstraintsDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeviceConfigurationKeyValueConstraintsDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="keyId" type="{http://docs.eebus.org/spine/xsd/v1}DeviceConfigurationKeyIdType" minOccurs="0"/&gt;
 *         &lt;element name="valueRangeMin" type="{http://docs.eebus.org/spine/xsd/v1}DeviceConfigurationKeyValueValueType" minOccurs="0"/&gt;
 *         &lt;element name="valueRangeMax" type="{http://docs.eebus.org/spine/xsd/v1}DeviceConfigurationKeyValueValueType" minOccurs="0"/&gt;
 *         &lt;element name="valueStepSize" type="{http://docs.eebus.org/spine/xsd/v1}DeviceConfigurationKeyValueValueType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceConfigurationKeyValueConstraintsDataType", propOrder = {
    "keyId",
    "valueRangeMin",
    "valueRangeMax",
    "valueStepSize"
})
public class DeviceConfigurationKeyValueConstraintsDataType implements Cloneable, CopyTo, ToString
{

    @XmlSchemaType(name = "unsignedInt")
    protected Long keyId;
    protected DeviceConfigurationKeyValueValueType valueRangeMin;
    protected DeviceConfigurationKeyValueValueType valueRangeMax;
    protected DeviceConfigurationKeyValueValueType valueStepSize;

    /**
     * Default no-arg constructor
     * 
     */
    public DeviceConfigurationKeyValueConstraintsDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public DeviceConfigurationKeyValueConstraintsDataType(final Long keyId, final DeviceConfigurationKeyValueValueType valueRangeMin, final DeviceConfigurationKeyValueValueType valueRangeMax, final DeviceConfigurationKeyValueValueType valueStepSize) {
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
     * Gets the value of the valueRangeMin property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceConfigurationKeyValueValueType }
     *     
     */
    public DeviceConfigurationKeyValueValueType getValueRangeMin() {
        return valueRangeMin;
    }

    /**
     * Sets the value of the valueRangeMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceConfigurationKeyValueValueType }
     *     
     */
    public void setValueRangeMin(DeviceConfigurationKeyValueValueType value) {
        this.valueRangeMin = value;
    }

    /**
     * Gets the value of the valueRangeMax property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceConfigurationKeyValueValueType }
     *     
     */
    public DeviceConfigurationKeyValueValueType getValueRangeMax() {
        return valueRangeMax;
    }

    /**
     * Sets the value of the valueRangeMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceConfigurationKeyValueValueType }
     *     
     */
    public void setValueRangeMax(DeviceConfigurationKeyValueValueType value) {
        this.valueRangeMax = value;
    }

    /**
     * Gets the value of the valueStepSize property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceConfigurationKeyValueValueType }
     *     
     */
    public DeviceConfigurationKeyValueValueType getValueStepSize() {
        return valueStepSize;
    }

    /**
     * Sets the value of the valueStepSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceConfigurationKeyValueValueType }
     *     
     */
    public void setValueStepSize(DeviceConfigurationKeyValueValueType value) {
        this.valueStepSize = value;
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
    public DeviceConfigurationKeyValueConstraintsDataType withKeyId(Long value) {
        setKeyId(value);
        return this;
    }

    /**
     * Sets the value of the valueRangeMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceConfigurationKeyValueValueType }
     * @return
     *     The class instance
     */
    public DeviceConfigurationKeyValueConstraintsDataType withValueRangeMin(DeviceConfigurationKeyValueValueType value) {
        setValueRangeMin(value);
        return this;
    }

    /**
     * Sets the value of the valueRangeMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceConfigurationKeyValueValueType }
     * @return
     *     The class instance
     */
    public DeviceConfigurationKeyValueConstraintsDataType withValueRangeMax(DeviceConfigurationKeyValueValueType value) {
        setValueRangeMax(value);
        return this;
    }

    /**
     * Sets the value of the valueStepSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceConfigurationKeyValueValueType }
     * @return
     *     The class instance
     */
    public DeviceConfigurationKeyValueConstraintsDataType withValueStepSize(DeviceConfigurationKeyValueValueType value) {
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
        if (draftCopy instanceof DeviceConfigurationKeyValueConstraintsDataType) {
            final DeviceConfigurationKeyValueConstraintsDataType copy = ((DeviceConfigurationKeyValueConstraintsDataType) draftCopy);
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
                Boolean valueRangeMinShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.valueRangeMin!= null));
                if (valueRangeMinShouldBeCopiedAndSet == Boolean.TRUE) {
                    DeviceConfigurationKeyValueValueType sourceValueRangeMin;
                    sourceValueRangeMin = this.getValueRangeMin();
                    DeviceConfigurationKeyValueValueType copyValueRangeMin = ((DeviceConfigurationKeyValueValueType) strategy.copy(LocatorUtils.property(locator, "valueRangeMin", sourceValueRangeMin), sourceValueRangeMin, (this.valueRangeMin!= null)));
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
                    DeviceConfigurationKeyValueValueType sourceValueRangeMax;
                    sourceValueRangeMax = this.getValueRangeMax();
                    DeviceConfigurationKeyValueValueType copyValueRangeMax = ((DeviceConfigurationKeyValueValueType) strategy.copy(LocatorUtils.property(locator, "valueRangeMax", sourceValueRangeMax), sourceValueRangeMax, (this.valueRangeMax!= null)));
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
                    DeviceConfigurationKeyValueValueType sourceValueStepSize;
                    sourceValueStepSize = this.getValueStepSize();
                    DeviceConfigurationKeyValueValueType copyValueStepSize = ((DeviceConfigurationKeyValueValueType) strategy.copy(LocatorUtils.property(locator, "valueStepSize", sourceValueStepSize), sourceValueStepSize, (this.valueStepSize!= null)));
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
        return new DeviceConfigurationKeyValueConstraintsDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DeviceConfigurationKeyValueConstraintsDataType that = ((DeviceConfigurationKeyValueConstraintsDataType) object);
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
            DeviceConfigurationKeyValueValueType leftValueRangeMin;
            leftValueRangeMin = this.getValueRangeMin();
            DeviceConfigurationKeyValueValueType rightValueRangeMin;
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
            DeviceConfigurationKeyValueValueType leftValueRangeMax;
            leftValueRangeMax = this.getValueRangeMax();
            DeviceConfigurationKeyValueValueType rightValueRangeMax;
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
            DeviceConfigurationKeyValueValueType leftValueStepSize;
            leftValueStepSize = this.getValueStepSize();
            DeviceConfigurationKeyValueValueType rightValueStepSize;
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
            Long theKeyId;
            theKeyId = this.getKeyId();
            if (this.keyId!= null) {
                currentHashCode += theKeyId.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            DeviceConfigurationKeyValueValueType theValueRangeMin;
            theValueRangeMin = this.getValueRangeMin();
            if (this.valueRangeMin!= null) {
                currentHashCode += theValueRangeMin.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            DeviceConfigurationKeyValueValueType theValueRangeMax;
            theValueRangeMax = this.getValueRangeMax();
            if (this.valueRangeMax!= null) {
                currentHashCode += theValueRangeMax.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            DeviceConfigurationKeyValueValueType theValueStepSize;
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
            Long theKeyId;
            theKeyId = this.getKeyId();
            strategy.appendField(locator, this, "keyId", buffer, theKeyId, (this.keyId!= null));
        }
        {
            DeviceConfigurationKeyValueValueType theValueRangeMin;
            theValueRangeMin = this.getValueRangeMin();
            strategy.appendField(locator, this, "valueRangeMin", buffer, theValueRangeMin, (this.valueRangeMin!= null));
        }
        {
            DeviceConfigurationKeyValueValueType theValueRangeMax;
            theValueRangeMax = this.getValueRangeMax();
            strategy.appendField(locator, this, "valueRangeMax", buffer, theValueRangeMax, (this.valueRangeMax!= null));
        }
        {
            DeviceConfigurationKeyValueValueType theValueStepSize;
            theValueStepSize = this.getValueStepSize();
            strategy.appendField(locator, this, "valueStepSize", buffer, theValueStepSize, (this.valueStepSize!= null));
        }
        return buffer;
    }

}
