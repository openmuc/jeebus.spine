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
 * <p>Java class for NetworkManagementDeviceDescriptionListDataSelectorsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NetworkManagementDeviceDescriptionListDataSelectorsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="deviceAddress" type="{http://docs.eebus.org/spine/xsd/v1}DeviceAddressType" minOccurs="0"/&gt;
 *         &lt;element name="deviceType" type="{http://docs.eebus.org/spine/xsd/v1}DeviceTypeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkManagementDeviceDescriptionListDataSelectorsType", propOrder = {
    "deviceAddress",
    "deviceType"
})
@XmlSeeAlso({
    org.openmuc.jeebus.spine.xsd.v1.NodeManagementDetailedDiscoveryDataSelectorsType.DeviceInformation.class,
    org.openmuc.jeebus.spine.xsd.v1.NodeManagementDestinationListDataSelectorsType.DeviceDescription.class
})
public class NetworkManagementDeviceDescriptionListDataSelectorsType implements Cloneable, CopyTo, ToString
{

    protected DeviceAddressType deviceAddress;
    protected String deviceType;

    /**
     * Default no-arg constructor
     * 
     */
    public NetworkManagementDeviceDescriptionListDataSelectorsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public NetworkManagementDeviceDescriptionListDataSelectorsType(final DeviceAddressType deviceAddress, final String deviceType) {
        this.deviceAddress = deviceAddress;
        this.deviceType = deviceType;
    }

    /**
     * Gets the value of the deviceAddress property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceAddressType }
     *     
     */
    public DeviceAddressType getDeviceAddress() {
        return deviceAddress;
    }

    /**
     * Sets the value of the deviceAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceAddressType }
     *     
     */
    public void setDeviceAddress(DeviceAddressType value) {
        this.deviceAddress = value;
    }

    /**
     * Gets the value of the deviceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceType() {
        return deviceType;
    }

    /**
     * Sets the value of the deviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceType(String value) {
        this.deviceType = value;
    }

    /**
     * Sets the value of the deviceAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceAddressType }
     * @return
     *     The class instance
     */
    public NetworkManagementDeviceDescriptionListDataSelectorsType withDeviceAddress(DeviceAddressType value) {
        setDeviceAddress(value);
        return this;
    }

    /**
     * Sets the value of the deviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public NetworkManagementDeviceDescriptionListDataSelectorsType withDeviceType(String value) {
        setDeviceType(value);
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
        if (draftCopy instanceof NetworkManagementDeviceDescriptionListDataSelectorsType) {
            final NetworkManagementDeviceDescriptionListDataSelectorsType copy = ((NetworkManagementDeviceDescriptionListDataSelectorsType) draftCopy);
            {
                Boolean deviceAddressShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.deviceAddress!= null));
                if (deviceAddressShouldBeCopiedAndSet == Boolean.TRUE) {
                    DeviceAddressType sourceDeviceAddress;
                    sourceDeviceAddress = this.getDeviceAddress();
                    DeviceAddressType copyDeviceAddress = ((DeviceAddressType) strategy.copy(LocatorUtils.property(locator, "deviceAddress", sourceDeviceAddress), sourceDeviceAddress, (this.deviceAddress!= null)));
                    copy.setDeviceAddress(copyDeviceAddress);
                } else {
                    if (deviceAddressShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.deviceAddress = null;
                    }
                }
            }
            {
                Boolean deviceTypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.deviceType!= null));
                if (deviceTypeShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceDeviceType;
                    sourceDeviceType = this.getDeviceType();
                    String copyDeviceType = ((String) strategy.copy(LocatorUtils.property(locator, "deviceType", sourceDeviceType), sourceDeviceType, (this.deviceType!= null)));
                    copy.setDeviceType(copyDeviceType);
                } else {
                    if (deviceTypeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.deviceType = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new NetworkManagementDeviceDescriptionListDataSelectorsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final NetworkManagementDeviceDescriptionListDataSelectorsType that = ((NetworkManagementDeviceDescriptionListDataSelectorsType) object);
        {
            DeviceAddressType leftDeviceAddress;
            leftDeviceAddress = this.getDeviceAddress();
            DeviceAddressType rightDeviceAddress;
            rightDeviceAddress = that.getDeviceAddress();
            if (this.deviceAddress!= null) {
                if (that.deviceAddress!= null) {
                    if (!leftDeviceAddress.equals(rightDeviceAddress)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.deviceAddress!= null) {
                    return false;
                }
            }
        }
        {
            String leftDeviceType;
            leftDeviceType = this.getDeviceType();
            String rightDeviceType;
            rightDeviceType = that.getDeviceType();
            if (this.deviceType!= null) {
                if (that.deviceType!= null) {
                    if (!leftDeviceType.equals(rightDeviceType)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.deviceType!= null) {
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
            DeviceAddressType theDeviceAddress;
            theDeviceAddress = this.getDeviceAddress();
            if (this.deviceAddress!= null) {
                currentHashCode += theDeviceAddress.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String theDeviceType;
            theDeviceType = this.getDeviceType();
            if (this.deviceType!= null) {
                currentHashCode += theDeviceType.hashCode();
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
            DeviceAddressType theDeviceAddress;
            theDeviceAddress = this.getDeviceAddress();
            strategy.appendField(locator, this, "deviceAddress", buffer, theDeviceAddress, (this.deviceAddress!= null));
        }
        {
            String theDeviceType;
            theDeviceType = this.getDeviceType();
            strategy.appendField(locator, this, "deviceType", buffer, theDeviceType, (this.deviceType!= null));
        }
        return buffer;
    }

}
