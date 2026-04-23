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
 * <p>Java class for DeviceAddressElementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeviceAddressElementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="device" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceAddressElementsType", propOrder = {
    "device"
})
@XmlSeeAlso({
    EntityAddressElementsType.class
})
public class DeviceAddressElementsType implements Cloneable, CopyTo, ToString
{

    protected ElementTagType device;

    /**
     * Default no-arg constructor
     * 
     */
    public DeviceAddressElementsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public DeviceAddressElementsType(final ElementTagType device) {
        this.device = device;
    }

    /**
     * Gets the value of the device property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getDevice() {
        return device;
    }

    /**
     * Sets the value of the device property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setDevice(ElementTagType value) {
        this.device = value;
    }

    /**
     * Sets the value of the device property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public DeviceAddressElementsType withDevice(ElementTagType value) {
        setDevice(value);
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
        if (draftCopy instanceof DeviceAddressElementsType) {
            final DeviceAddressElementsType copy = ((DeviceAddressElementsType) draftCopy);
            {
                Boolean deviceShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.device!= null));
                if (deviceShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceDevice;
                    sourceDevice = this.getDevice();
                    ElementTagType copyDevice = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "device", sourceDevice), sourceDevice, (this.device!= null)));
                    copy.setDevice(copyDevice);
                } else {
                    if (deviceShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.device = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new DeviceAddressElementsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DeviceAddressElementsType that = ((DeviceAddressElementsType) object);
        {
            ElementTagType leftDevice;
            leftDevice = this.getDevice();
            ElementTagType rightDevice;
            rightDevice = that.getDevice();
            if (this.device!= null) {
                if (that.device!= null) {
                    if (!leftDevice.equals(rightDevice)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.device!= null) {
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
            ElementTagType theDevice;
            theDevice = this.getDevice();
            if (this.device!= null) {
                currentHashCode += theDevice.hashCode();
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
            ElementTagType theDevice;
            theDevice = this.getDevice();
            strategy.appendField(locator, this, "device", buffer, theDevice, (this.device!= null));
        }
        return buffer;
    }

}
