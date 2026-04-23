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
 * <p>Java class for DeviceClassificationManufacturerDataElementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeviceClassificationManufacturerDataElementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="deviceName" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="deviceCode" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="serialNumber" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="softwareRevision" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="hardwareRevision" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="vendorName" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="vendorCode" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="brandName" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="powerSource" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="manufacturerNodeIdentification" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="manufacturerLabel" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="manufacturerDescription" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceClassificationManufacturerDataElementsType", propOrder = {
    "deviceName",
    "deviceCode",
    "serialNumber",
    "softwareRevision",
    "hardwareRevision",
    "vendorName",
    "vendorCode",
    "brandName",
    "powerSource",
    "manufacturerNodeIdentification",
    "manufacturerLabel",
    "manufacturerDescription"
})
public class DeviceClassificationManufacturerDataElementsType implements Cloneable, CopyTo, ToString
{

    protected ElementTagType deviceName;
    protected ElementTagType deviceCode;
    protected ElementTagType serialNumber;
    protected ElementTagType softwareRevision;
    protected ElementTagType hardwareRevision;
    protected ElementTagType vendorName;
    protected ElementTagType vendorCode;
    protected ElementTagType brandName;
    protected ElementTagType powerSource;
    protected ElementTagType manufacturerNodeIdentification;
    protected ElementTagType manufacturerLabel;
    protected ElementTagType manufacturerDescription;

    /**
     * Default no-arg constructor
     * 
     */
    public DeviceClassificationManufacturerDataElementsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public DeviceClassificationManufacturerDataElementsType(final ElementTagType deviceName, final ElementTagType deviceCode, final ElementTagType serialNumber, final ElementTagType softwareRevision, final ElementTagType hardwareRevision, final ElementTagType vendorName, final ElementTagType vendorCode, final ElementTagType brandName, final ElementTagType powerSource, final ElementTagType manufacturerNodeIdentification, final ElementTagType manufacturerLabel, final ElementTagType manufacturerDescription) {
        this.deviceName = deviceName;
        this.deviceCode = deviceCode;
        this.serialNumber = serialNumber;
        this.softwareRevision = softwareRevision;
        this.hardwareRevision = hardwareRevision;
        this.vendorName = vendorName;
        this.vendorCode = vendorCode;
        this.brandName = brandName;
        this.powerSource = powerSource;
        this.manufacturerNodeIdentification = manufacturerNodeIdentification;
        this.manufacturerLabel = manufacturerLabel;
        this.manufacturerDescription = manufacturerDescription;
    }

    /**
     * Gets the value of the deviceName property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getDeviceName() {
        return deviceName;
    }

    /**
     * Sets the value of the deviceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setDeviceName(ElementTagType value) {
        this.deviceName = value;
    }

    /**
     * Gets the value of the deviceCode property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getDeviceCode() {
        return deviceCode;
    }

    /**
     * Sets the value of the deviceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setDeviceCode(ElementTagType value) {
        this.deviceCode = value;
    }

    /**
     * Gets the value of the serialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the value of the serialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setSerialNumber(ElementTagType value) {
        this.serialNumber = value;
    }

    /**
     * Gets the value of the softwareRevision property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getSoftwareRevision() {
        return softwareRevision;
    }

    /**
     * Sets the value of the softwareRevision property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setSoftwareRevision(ElementTagType value) {
        this.softwareRevision = value;
    }

    /**
     * Gets the value of the hardwareRevision property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getHardwareRevision() {
        return hardwareRevision;
    }

    /**
     * Sets the value of the hardwareRevision property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setHardwareRevision(ElementTagType value) {
        this.hardwareRevision = value;
    }

    /**
     * Gets the value of the vendorName property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getVendorName() {
        return vendorName;
    }

    /**
     * Sets the value of the vendorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setVendorName(ElementTagType value) {
        this.vendorName = value;
    }

    /**
     * Gets the value of the vendorCode property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getVendorCode() {
        return vendorCode;
    }

    /**
     * Sets the value of the vendorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setVendorCode(ElementTagType value) {
        this.vendorCode = value;
    }

    /**
     * Gets the value of the brandName property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getBrandName() {
        return brandName;
    }

    /**
     * Sets the value of the brandName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setBrandName(ElementTagType value) {
        this.brandName = value;
    }

    /**
     * Gets the value of the powerSource property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getPowerSource() {
        return powerSource;
    }

    /**
     * Sets the value of the powerSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setPowerSource(ElementTagType value) {
        this.powerSource = value;
    }

    /**
     * Gets the value of the manufacturerNodeIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getManufacturerNodeIdentification() {
        return manufacturerNodeIdentification;
    }

    /**
     * Sets the value of the manufacturerNodeIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setManufacturerNodeIdentification(ElementTagType value) {
        this.manufacturerNodeIdentification = value;
    }

    /**
     * Gets the value of the manufacturerLabel property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getManufacturerLabel() {
        return manufacturerLabel;
    }

    /**
     * Sets the value of the manufacturerLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setManufacturerLabel(ElementTagType value) {
        this.manufacturerLabel = value;
    }

    /**
     * Gets the value of the manufacturerDescription property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getManufacturerDescription() {
        return manufacturerDescription;
    }

    /**
     * Sets the value of the manufacturerDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setManufacturerDescription(ElementTagType value) {
        this.manufacturerDescription = value;
    }

    /**
     * Sets the value of the deviceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public DeviceClassificationManufacturerDataElementsType withDeviceName(ElementTagType value) {
        setDeviceName(value);
        return this;
    }

    /**
     * Sets the value of the deviceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public DeviceClassificationManufacturerDataElementsType withDeviceCode(ElementTagType value) {
        setDeviceCode(value);
        return this;
    }

    /**
     * Sets the value of the serialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public DeviceClassificationManufacturerDataElementsType withSerialNumber(ElementTagType value) {
        setSerialNumber(value);
        return this;
    }

    /**
     * Sets the value of the softwareRevision property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public DeviceClassificationManufacturerDataElementsType withSoftwareRevision(ElementTagType value) {
        setSoftwareRevision(value);
        return this;
    }

    /**
     * Sets the value of the hardwareRevision property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public DeviceClassificationManufacturerDataElementsType withHardwareRevision(ElementTagType value) {
        setHardwareRevision(value);
        return this;
    }

    /**
     * Sets the value of the vendorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public DeviceClassificationManufacturerDataElementsType withVendorName(ElementTagType value) {
        setVendorName(value);
        return this;
    }

    /**
     * Sets the value of the vendorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public DeviceClassificationManufacturerDataElementsType withVendorCode(ElementTagType value) {
        setVendorCode(value);
        return this;
    }

    /**
     * Sets the value of the brandName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public DeviceClassificationManufacturerDataElementsType withBrandName(ElementTagType value) {
        setBrandName(value);
        return this;
    }

    /**
     * Sets the value of the powerSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public DeviceClassificationManufacturerDataElementsType withPowerSource(ElementTagType value) {
        setPowerSource(value);
        return this;
    }

    /**
     * Sets the value of the manufacturerNodeIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public DeviceClassificationManufacturerDataElementsType withManufacturerNodeIdentification(ElementTagType value) {
        setManufacturerNodeIdentification(value);
        return this;
    }

    /**
     * Sets the value of the manufacturerLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public DeviceClassificationManufacturerDataElementsType withManufacturerLabel(ElementTagType value) {
        setManufacturerLabel(value);
        return this;
    }

    /**
     * Sets the value of the manufacturerDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public DeviceClassificationManufacturerDataElementsType withManufacturerDescription(ElementTagType value) {
        setManufacturerDescription(value);
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
        if (draftCopy instanceof DeviceClassificationManufacturerDataElementsType) {
            final DeviceClassificationManufacturerDataElementsType copy = ((DeviceClassificationManufacturerDataElementsType) draftCopy);
            {
                Boolean deviceNameShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.deviceName!= null));
                if (deviceNameShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceDeviceName;
                    sourceDeviceName = this.getDeviceName();
                    ElementTagType copyDeviceName = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "deviceName", sourceDeviceName), sourceDeviceName, (this.deviceName!= null)));
                    copy.setDeviceName(copyDeviceName);
                } else {
                    if (deviceNameShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.deviceName = null;
                    }
                }
            }
            {
                Boolean deviceCodeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.deviceCode!= null));
                if (deviceCodeShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceDeviceCode;
                    sourceDeviceCode = this.getDeviceCode();
                    ElementTagType copyDeviceCode = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "deviceCode", sourceDeviceCode), sourceDeviceCode, (this.deviceCode!= null)));
                    copy.setDeviceCode(copyDeviceCode);
                } else {
                    if (deviceCodeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.deviceCode = null;
                    }
                }
            }
            {
                Boolean serialNumberShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.serialNumber!= null));
                if (serialNumberShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceSerialNumber;
                    sourceSerialNumber = this.getSerialNumber();
                    ElementTagType copySerialNumber = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "serialNumber", sourceSerialNumber), sourceSerialNumber, (this.serialNumber!= null)));
                    copy.setSerialNumber(copySerialNumber);
                } else {
                    if (serialNumberShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.serialNumber = null;
                    }
                }
            }
            {
                Boolean softwareRevisionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.softwareRevision!= null));
                if (softwareRevisionShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceSoftwareRevision;
                    sourceSoftwareRevision = this.getSoftwareRevision();
                    ElementTagType copySoftwareRevision = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "softwareRevision", sourceSoftwareRevision), sourceSoftwareRevision, (this.softwareRevision!= null)));
                    copy.setSoftwareRevision(copySoftwareRevision);
                } else {
                    if (softwareRevisionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.softwareRevision = null;
                    }
                }
            }
            {
                Boolean hardwareRevisionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.hardwareRevision!= null));
                if (hardwareRevisionShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceHardwareRevision;
                    sourceHardwareRevision = this.getHardwareRevision();
                    ElementTagType copyHardwareRevision = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "hardwareRevision", sourceHardwareRevision), sourceHardwareRevision, (this.hardwareRevision!= null)));
                    copy.setHardwareRevision(copyHardwareRevision);
                } else {
                    if (hardwareRevisionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.hardwareRevision = null;
                    }
                }
            }
            {
                Boolean vendorNameShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.vendorName!= null));
                if (vendorNameShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceVendorName;
                    sourceVendorName = this.getVendorName();
                    ElementTagType copyVendorName = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "vendorName", sourceVendorName), sourceVendorName, (this.vendorName!= null)));
                    copy.setVendorName(copyVendorName);
                } else {
                    if (vendorNameShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.vendorName = null;
                    }
                }
            }
            {
                Boolean vendorCodeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.vendorCode!= null));
                if (vendorCodeShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceVendorCode;
                    sourceVendorCode = this.getVendorCode();
                    ElementTagType copyVendorCode = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "vendorCode", sourceVendorCode), sourceVendorCode, (this.vendorCode!= null)));
                    copy.setVendorCode(copyVendorCode);
                } else {
                    if (vendorCodeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.vendorCode = null;
                    }
                }
            }
            {
                Boolean brandNameShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.brandName!= null));
                if (brandNameShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceBrandName;
                    sourceBrandName = this.getBrandName();
                    ElementTagType copyBrandName = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "brandName", sourceBrandName), sourceBrandName, (this.brandName!= null)));
                    copy.setBrandName(copyBrandName);
                } else {
                    if (brandNameShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.brandName = null;
                    }
                }
            }
            {
                Boolean powerSourceShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.powerSource!= null));
                if (powerSourceShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourcePowerSource;
                    sourcePowerSource = this.getPowerSource();
                    ElementTagType copyPowerSource = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "powerSource", sourcePowerSource), sourcePowerSource, (this.powerSource!= null)));
                    copy.setPowerSource(copyPowerSource);
                } else {
                    if (powerSourceShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.powerSource = null;
                    }
                }
            }
            {
                Boolean manufacturerNodeIdentificationShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.manufacturerNodeIdentification!= null));
                if (manufacturerNodeIdentificationShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceManufacturerNodeIdentification;
                    sourceManufacturerNodeIdentification = this.getManufacturerNodeIdentification();
                    ElementTagType copyManufacturerNodeIdentification = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "manufacturerNodeIdentification", sourceManufacturerNodeIdentification), sourceManufacturerNodeIdentification, (this.manufacturerNodeIdentification!= null)));
                    copy.setManufacturerNodeIdentification(copyManufacturerNodeIdentification);
                } else {
                    if (manufacturerNodeIdentificationShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.manufacturerNodeIdentification = null;
                    }
                }
            }
            {
                Boolean manufacturerLabelShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.manufacturerLabel!= null));
                if (manufacturerLabelShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceManufacturerLabel;
                    sourceManufacturerLabel = this.getManufacturerLabel();
                    ElementTagType copyManufacturerLabel = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "manufacturerLabel", sourceManufacturerLabel), sourceManufacturerLabel, (this.manufacturerLabel!= null)));
                    copy.setManufacturerLabel(copyManufacturerLabel);
                } else {
                    if (manufacturerLabelShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.manufacturerLabel = null;
                    }
                }
            }
            {
                Boolean manufacturerDescriptionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.manufacturerDescription!= null));
                if (manufacturerDescriptionShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceManufacturerDescription;
                    sourceManufacturerDescription = this.getManufacturerDescription();
                    ElementTagType copyManufacturerDescription = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "manufacturerDescription", sourceManufacturerDescription), sourceManufacturerDescription, (this.manufacturerDescription!= null)));
                    copy.setManufacturerDescription(copyManufacturerDescription);
                } else {
                    if (manufacturerDescriptionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.manufacturerDescription = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new DeviceClassificationManufacturerDataElementsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DeviceClassificationManufacturerDataElementsType that = ((DeviceClassificationManufacturerDataElementsType) object);
        {
            ElementTagType leftDeviceName;
            leftDeviceName = this.getDeviceName();
            ElementTagType rightDeviceName;
            rightDeviceName = that.getDeviceName();
            if (this.deviceName!= null) {
                if (that.deviceName!= null) {
                    if (!leftDeviceName.equals(rightDeviceName)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.deviceName!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftDeviceCode;
            leftDeviceCode = this.getDeviceCode();
            ElementTagType rightDeviceCode;
            rightDeviceCode = that.getDeviceCode();
            if (this.deviceCode!= null) {
                if (that.deviceCode!= null) {
                    if (!leftDeviceCode.equals(rightDeviceCode)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.deviceCode!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftSerialNumber;
            leftSerialNumber = this.getSerialNumber();
            ElementTagType rightSerialNumber;
            rightSerialNumber = that.getSerialNumber();
            if (this.serialNumber!= null) {
                if (that.serialNumber!= null) {
                    if (!leftSerialNumber.equals(rightSerialNumber)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.serialNumber!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftSoftwareRevision;
            leftSoftwareRevision = this.getSoftwareRevision();
            ElementTagType rightSoftwareRevision;
            rightSoftwareRevision = that.getSoftwareRevision();
            if (this.softwareRevision!= null) {
                if (that.softwareRevision!= null) {
                    if (!leftSoftwareRevision.equals(rightSoftwareRevision)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.softwareRevision!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftHardwareRevision;
            leftHardwareRevision = this.getHardwareRevision();
            ElementTagType rightHardwareRevision;
            rightHardwareRevision = that.getHardwareRevision();
            if (this.hardwareRevision!= null) {
                if (that.hardwareRevision!= null) {
                    if (!leftHardwareRevision.equals(rightHardwareRevision)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.hardwareRevision!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftVendorName;
            leftVendorName = this.getVendorName();
            ElementTagType rightVendorName;
            rightVendorName = that.getVendorName();
            if (this.vendorName!= null) {
                if (that.vendorName!= null) {
                    if (!leftVendorName.equals(rightVendorName)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.vendorName!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftVendorCode;
            leftVendorCode = this.getVendorCode();
            ElementTagType rightVendorCode;
            rightVendorCode = that.getVendorCode();
            if (this.vendorCode!= null) {
                if (that.vendorCode!= null) {
                    if (!leftVendorCode.equals(rightVendorCode)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.vendorCode!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftBrandName;
            leftBrandName = this.getBrandName();
            ElementTagType rightBrandName;
            rightBrandName = that.getBrandName();
            if (this.brandName!= null) {
                if (that.brandName!= null) {
                    if (!leftBrandName.equals(rightBrandName)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.brandName!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftPowerSource;
            leftPowerSource = this.getPowerSource();
            ElementTagType rightPowerSource;
            rightPowerSource = that.getPowerSource();
            if (this.powerSource!= null) {
                if (that.powerSource!= null) {
                    if (!leftPowerSource.equals(rightPowerSource)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.powerSource!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftManufacturerNodeIdentification;
            leftManufacturerNodeIdentification = this.getManufacturerNodeIdentification();
            ElementTagType rightManufacturerNodeIdentification;
            rightManufacturerNodeIdentification = that.getManufacturerNodeIdentification();
            if (this.manufacturerNodeIdentification!= null) {
                if (that.manufacturerNodeIdentification!= null) {
                    if (!leftManufacturerNodeIdentification.equals(rightManufacturerNodeIdentification)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.manufacturerNodeIdentification!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftManufacturerLabel;
            leftManufacturerLabel = this.getManufacturerLabel();
            ElementTagType rightManufacturerLabel;
            rightManufacturerLabel = that.getManufacturerLabel();
            if (this.manufacturerLabel!= null) {
                if (that.manufacturerLabel!= null) {
                    if (!leftManufacturerLabel.equals(rightManufacturerLabel)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.manufacturerLabel!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftManufacturerDescription;
            leftManufacturerDescription = this.getManufacturerDescription();
            ElementTagType rightManufacturerDescription;
            rightManufacturerDescription = that.getManufacturerDescription();
            if (this.manufacturerDescription!= null) {
                if (that.manufacturerDescription!= null) {
                    if (!leftManufacturerDescription.equals(rightManufacturerDescription)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.manufacturerDescription!= null) {
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
            ElementTagType theDeviceName;
            theDeviceName = this.getDeviceName();
            if (this.deviceName!= null) {
                currentHashCode += theDeviceName.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theDeviceCode;
            theDeviceCode = this.getDeviceCode();
            if (this.deviceCode!= null) {
                currentHashCode += theDeviceCode.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theSerialNumber;
            theSerialNumber = this.getSerialNumber();
            if (this.serialNumber!= null) {
                currentHashCode += theSerialNumber.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theSoftwareRevision;
            theSoftwareRevision = this.getSoftwareRevision();
            if (this.softwareRevision!= null) {
                currentHashCode += theSoftwareRevision.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theHardwareRevision;
            theHardwareRevision = this.getHardwareRevision();
            if (this.hardwareRevision!= null) {
                currentHashCode += theHardwareRevision.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theVendorName;
            theVendorName = this.getVendorName();
            if (this.vendorName!= null) {
                currentHashCode += theVendorName.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theVendorCode;
            theVendorCode = this.getVendorCode();
            if (this.vendorCode!= null) {
                currentHashCode += theVendorCode.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theBrandName;
            theBrandName = this.getBrandName();
            if (this.brandName!= null) {
                currentHashCode += theBrandName.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType thePowerSource;
            thePowerSource = this.getPowerSource();
            if (this.powerSource!= null) {
                currentHashCode += thePowerSource.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theManufacturerNodeIdentification;
            theManufacturerNodeIdentification = this.getManufacturerNodeIdentification();
            if (this.manufacturerNodeIdentification!= null) {
                currentHashCode += theManufacturerNodeIdentification.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theManufacturerLabel;
            theManufacturerLabel = this.getManufacturerLabel();
            if (this.manufacturerLabel!= null) {
                currentHashCode += theManufacturerLabel.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theManufacturerDescription;
            theManufacturerDescription = this.getManufacturerDescription();
            if (this.manufacturerDescription!= null) {
                currentHashCode += theManufacturerDescription.hashCode();
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
            ElementTagType theDeviceName;
            theDeviceName = this.getDeviceName();
            strategy.appendField(locator, this, "deviceName", buffer, theDeviceName, (this.deviceName!= null));
        }
        {
            ElementTagType theDeviceCode;
            theDeviceCode = this.getDeviceCode();
            strategy.appendField(locator, this, "deviceCode", buffer, theDeviceCode, (this.deviceCode!= null));
        }
        {
            ElementTagType theSerialNumber;
            theSerialNumber = this.getSerialNumber();
            strategy.appendField(locator, this, "serialNumber", buffer, theSerialNumber, (this.serialNumber!= null));
        }
        {
            ElementTagType theSoftwareRevision;
            theSoftwareRevision = this.getSoftwareRevision();
            strategy.appendField(locator, this, "softwareRevision", buffer, theSoftwareRevision, (this.softwareRevision!= null));
        }
        {
            ElementTagType theHardwareRevision;
            theHardwareRevision = this.getHardwareRevision();
            strategy.appendField(locator, this, "hardwareRevision", buffer, theHardwareRevision, (this.hardwareRevision!= null));
        }
        {
            ElementTagType theVendorName;
            theVendorName = this.getVendorName();
            strategy.appendField(locator, this, "vendorName", buffer, theVendorName, (this.vendorName!= null));
        }
        {
            ElementTagType theVendorCode;
            theVendorCode = this.getVendorCode();
            strategy.appendField(locator, this, "vendorCode", buffer, theVendorCode, (this.vendorCode!= null));
        }
        {
            ElementTagType theBrandName;
            theBrandName = this.getBrandName();
            strategy.appendField(locator, this, "brandName", buffer, theBrandName, (this.brandName!= null));
        }
        {
            ElementTagType thePowerSource;
            thePowerSource = this.getPowerSource();
            strategy.appendField(locator, this, "powerSource", buffer, thePowerSource, (this.powerSource!= null));
        }
        {
            ElementTagType theManufacturerNodeIdentification;
            theManufacturerNodeIdentification = this.getManufacturerNodeIdentification();
            strategy.appendField(locator, this, "manufacturerNodeIdentification", buffer, theManufacturerNodeIdentification, (this.manufacturerNodeIdentification!= null));
        }
        {
            ElementTagType theManufacturerLabel;
            theManufacturerLabel = this.getManufacturerLabel();
            strategy.appendField(locator, this, "manufacturerLabel", buffer, theManufacturerLabel, (this.manufacturerLabel!= null));
        }
        {
            ElementTagType theManufacturerDescription;
            theManufacturerDescription = this.getManufacturerDescription();
            strategy.appendField(locator, this, "manufacturerDescription", buffer, theManufacturerDescription, (this.manufacturerDescription!= null));
        }
        return buffer;
    }

}
