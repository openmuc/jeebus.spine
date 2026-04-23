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
 * <p>Java class for DeviceClassificationManufacturerDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeviceClassificationManufacturerDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="deviceName" type="{http://docs.eebus.org/spine/xsd/v1}DeviceClassificationStringType" minOccurs="0"/&gt;
 *         &lt;element name="deviceCode" type="{http://docs.eebus.org/spine/xsd/v1}DeviceClassificationStringType" minOccurs="0"/&gt;
 *         &lt;element name="serialNumber" type="{http://docs.eebus.org/spine/xsd/v1}DeviceClassificationStringType" minOccurs="0"/&gt;
 *         &lt;element name="softwareRevision" type="{http://docs.eebus.org/spine/xsd/v1}DeviceClassificationStringType" minOccurs="0"/&gt;
 *         &lt;element name="hardwareRevision" type="{http://docs.eebus.org/spine/xsd/v1}DeviceClassificationStringType" minOccurs="0"/&gt;
 *         &lt;element name="vendorName" type="{http://docs.eebus.org/spine/xsd/v1}DeviceClassificationStringType" minOccurs="0"/&gt;
 *         &lt;element name="vendorCode" type="{http://docs.eebus.org/spine/xsd/v1}DeviceClassificationStringType" minOccurs="0"/&gt;
 *         &lt;element name="brandName" type="{http://docs.eebus.org/spine/xsd/v1}DeviceClassificationStringType" minOccurs="0"/&gt;
 *         &lt;element name="powerSource" type="{http://docs.eebus.org/spine/xsd/v1}PowerSourceType" minOccurs="0"/&gt;
 *         &lt;element name="manufacturerNodeIdentification" type="{http://docs.eebus.org/spine/xsd/v1}DeviceClassificationStringType" minOccurs="0"/&gt;
 *         &lt;element name="manufacturerLabel" type="{http://docs.eebus.org/spine/xsd/v1}LabelType" minOccurs="0"/&gt;
 *         &lt;element name="manufacturerDescription" type="{http://docs.eebus.org/spine/xsd/v1}DescriptionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceClassificationManufacturerDataType", propOrder = {
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
public class DeviceClassificationManufacturerDataType implements Cloneable, CopyTo, ToString
{

    protected String deviceName;
    protected String deviceCode;
    protected String serialNumber;
    protected String softwareRevision;
    protected String hardwareRevision;
    protected String vendorName;
    protected String vendorCode;
    protected String brandName;
    protected String powerSource;
    protected String manufacturerNodeIdentification;
    protected String manufacturerLabel;
    protected String manufacturerDescription;

    /**
     * Default no-arg constructor
     * 
     */
    public DeviceClassificationManufacturerDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public DeviceClassificationManufacturerDataType(final String deviceName, final String deviceCode, final String serialNumber, final String softwareRevision, final String hardwareRevision, final String vendorName, final String vendorCode, final String brandName, final String powerSource, final String manufacturerNodeIdentification, final String manufacturerLabel, final String manufacturerDescription) {
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
     *     {@link String }
     *     
     */
    public String getDeviceName() {
        return deviceName;
    }

    /**
     * Sets the value of the deviceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceName(String value) {
        this.deviceName = value;
    }

    /**
     * Gets the value of the deviceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceCode() {
        return deviceCode;
    }

    /**
     * Sets the value of the deviceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceCode(String value) {
        this.deviceCode = value;
    }

    /**
     * Gets the value of the serialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the value of the serialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNumber(String value) {
        this.serialNumber = value;
    }

    /**
     * Gets the value of the softwareRevision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoftwareRevision() {
        return softwareRevision;
    }

    /**
     * Sets the value of the softwareRevision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoftwareRevision(String value) {
        this.softwareRevision = value;
    }

    /**
     * Gets the value of the hardwareRevision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHardwareRevision() {
        return hardwareRevision;
    }

    /**
     * Sets the value of the hardwareRevision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHardwareRevision(String value) {
        this.hardwareRevision = value;
    }

    /**
     * Gets the value of the vendorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorName() {
        return vendorName;
    }

    /**
     * Sets the value of the vendorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorName(String value) {
        this.vendorName = value;
    }

    /**
     * Gets the value of the vendorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorCode() {
        return vendorCode;
    }

    /**
     * Sets the value of the vendorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorCode(String value) {
        this.vendorCode = value;
    }

    /**
     * Gets the value of the brandName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrandName() {
        return brandName;
    }

    /**
     * Sets the value of the brandName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrandName(String value) {
        this.brandName = value;
    }

    /**
     * Gets the value of the powerSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPowerSource() {
        return powerSource;
    }

    /**
     * Sets the value of the powerSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPowerSource(String value) {
        this.powerSource = value;
    }

    /**
     * Gets the value of the manufacturerNodeIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturerNodeIdentification() {
        return manufacturerNodeIdentification;
    }

    /**
     * Sets the value of the manufacturerNodeIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturerNodeIdentification(String value) {
        this.manufacturerNodeIdentification = value;
    }

    /**
     * Gets the value of the manufacturerLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturerLabel() {
        return manufacturerLabel;
    }

    /**
     * Sets the value of the manufacturerLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturerLabel(String value) {
        this.manufacturerLabel = value;
    }

    /**
     * Gets the value of the manufacturerDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturerDescription() {
        return manufacturerDescription;
    }

    /**
     * Sets the value of the manufacturerDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturerDescription(String value) {
        this.manufacturerDescription = value;
    }

    /**
     * Sets the value of the deviceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public DeviceClassificationManufacturerDataType withDeviceName(String value) {
        setDeviceName(value);
        return this;
    }

    /**
     * Sets the value of the deviceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public DeviceClassificationManufacturerDataType withDeviceCode(String value) {
        setDeviceCode(value);
        return this;
    }

    /**
     * Sets the value of the serialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public DeviceClassificationManufacturerDataType withSerialNumber(String value) {
        setSerialNumber(value);
        return this;
    }

    /**
     * Sets the value of the softwareRevision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public DeviceClassificationManufacturerDataType withSoftwareRevision(String value) {
        setSoftwareRevision(value);
        return this;
    }

    /**
     * Sets the value of the hardwareRevision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public DeviceClassificationManufacturerDataType withHardwareRevision(String value) {
        setHardwareRevision(value);
        return this;
    }

    /**
     * Sets the value of the vendorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public DeviceClassificationManufacturerDataType withVendorName(String value) {
        setVendorName(value);
        return this;
    }

    /**
     * Sets the value of the vendorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public DeviceClassificationManufacturerDataType withVendorCode(String value) {
        setVendorCode(value);
        return this;
    }

    /**
     * Sets the value of the brandName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public DeviceClassificationManufacturerDataType withBrandName(String value) {
        setBrandName(value);
        return this;
    }

    /**
     * Sets the value of the powerSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public DeviceClassificationManufacturerDataType withPowerSource(String value) {
        setPowerSource(value);
        return this;
    }

    /**
     * Sets the value of the manufacturerNodeIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public DeviceClassificationManufacturerDataType withManufacturerNodeIdentification(String value) {
        setManufacturerNodeIdentification(value);
        return this;
    }

    /**
     * Sets the value of the manufacturerLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public DeviceClassificationManufacturerDataType withManufacturerLabel(String value) {
        setManufacturerLabel(value);
        return this;
    }

    /**
     * Sets the value of the manufacturerDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public DeviceClassificationManufacturerDataType withManufacturerDescription(String value) {
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
        if (draftCopy instanceof DeviceClassificationManufacturerDataType) {
            final DeviceClassificationManufacturerDataType copy = ((DeviceClassificationManufacturerDataType) draftCopy);
            {
                Boolean deviceNameShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.deviceName!= null));
                if (deviceNameShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceDeviceName;
                    sourceDeviceName = this.getDeviceName();
                    String copyDeviceName = ((String) strategy.copy(LocatorUtils.property(locator, "deviceName", sourceDeviceName), sourceDeviceName, (this.deviceName!= null)));
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
                    String sourceDeviceCode;
                    sourceDeviceCode = this.getDeviceCode();
                    String copyDeviceCode = ((String) strategy.copy(LocatorUtils.property(locator, "deviceCode", sourceDeviceCode), sourceDeviceCode, (this.deviceCode!= null)));
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
                    String sourceSerialNumber;
                    sourceSerialNumber = this.getSerialNumber();
                    String copySerialNumber = ((String) strategy.copy(LocatorUtils.property(locator, "serialNumber", sourceSerialNumber), sourceSerialNumber, (this.serialNumber!= null)));
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
                    String sourceSoftwareRevision;
                    sourceSoftwareRevision = this.getSoftwareRevision();
                    String copySoftwareRevision = ((String) strategy.copy(LocatorUtils.property(locator, "softwareRevision", sourceSoftwareRevision), sourceSoftwareRevision, (this.softwareRevision!= null)));
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
                    String sourceHardwareRevision;
                    sourceHardwareRevision = this.getHardwareRevision();
                    String copyHardwareRevision = ((String) strategy.copy(LocatorUtils.property(locator, "hardwareRevision", sourceHardwareRevision), sourceHardwareRevision, (this.hardwareRevision!= null)));
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
                    String sourceVendorName;
                    sourceVendorName = this.getVendorName();
                    String copyVendorName = ((String) strategy.copy(LocatorUtils.property(locator, "vendorName", sourceVendorName), sourceVendorName, (this.vendorName!= null)));
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
                    String sourceVendorCode;
                    sourceVendorCode = this.getVendorCode();
                    String copyVendorCode = ((String) strategy.copy(LocatorUtils.property(locator, "vendorCode", sourceVendorCode), sourceVendorCode, (this.vendorCode!= null)));
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
                    String sourceBrandName;
                    sourceBrandName = this.getBrandName();
                    String copyBrandName = ((String) strategy.copy(LocatorUtils.property(locator, "brandName", sourceBrandName), sourceBrandName, (this.brandName!= null)));
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
                    String sourcePowerSource;
                    sourcePowerSource = this.getPowerSource();
                    String copyPowerSource = ((String) strategy.copy(LocatorUtils.property(locator, "powerSource", sourcePowerSource), sourcePowerSource, (this.powerSource!= null)));
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
                    String sourceManufacturerNodeIdentification;
                    sourceManufacturerNodeIdentification = this.getManufacturerNodeIdentification();
                    String copyManufacturerNodeIdentification = ((String) strategy.copy(LocatorUtils.property(locator, "manufacturerNodeIdentification", sourceManufacturerNodeIdentification), sourceManufacturerNodeIdentification, (this.manufacturerNodeIdentification!= null)));
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
                    String sourceManufacturerLabel;
                    sourceManufacturerLabel = this.getManufacturerLabel();
                    String copyManufacturerLabel = ((String) strategy.copy(LocatorUtils.property(locator, "manufacturerLabel", sourceManufacturerLabel), sourceManufacturerLabel, (this.manufacturerLabel!= null)));
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
                    String sourceManufacturerDescription;
                    sourceManufacturerDescription = this.getManufacturerDescription();
                    String copyManufacturerDescription = ((String) strategy.copy(LocatorUtils.property(locator, "manufacturerDescription", sourceManufacturerDescription), sourceManufacturerDescription, (this.manufacturerDescription!= null)));
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
        return new DeviceClassificationManufacturerDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DeviceClassificationManufacturerDataType that = ((DeviceClassificationManufacturerDataType) object);
        {
            String leftDeviceName;
            leftDeviceName = this.getDeviceName();
            String rightDeviceName;
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
            String leftDeviceCode;
            leftDeviceCode = this.getDeviceCode();
            String rightDeviceCode;
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
            String leftSerialNumber;
            leftSerialNumber = this.getSerialNumber();
            String rightSerialNumber;
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
            String leftSoftwareRevision;
            leftSoftwareRevision = this.getSoftwareRevision();
            String rightSoftwareRevision;
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
            String leftHardwareRevision;
            leftHardwareRevision = this.getHardwareRevision();
            String rightHardwareRevision;
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
            String leftVendorName;
            leftVendorName = this.getVendorName();
            String rightVendorName;
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
            String leftVendorCode;
            leftVendorCode = this.getVendorCode();
            String rightVendorCode;
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
            String leftBrandName;
            leftBrandName = this.getBrandName();
            String rightBrandName;
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
            String leftPowerSource;
            leftPowerSource = this.getPowerSource();
            String rightPowerSource;
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
            String leftManufacturerNodeIdentification;
            leftManufacturerNodeIdentification = this.getManufacturerNodeIdentification();
            String rightManufacturerNodeIdentification;
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
            String leftManufacturerLabel;
            leftManufacturerLabel = this.getManufacturerLabel();
            String rightManufacturerLabel;
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
            String leftManufacturerDescription;
            leftManufacturerDescription = this.getManufacturerDescription();
            String rightManufacturerDescription;
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
            String theDeviceName;
            theDeviceName = this.getDeviceName();
            if (this.deviceName!= null) {
                currentHashCode += theDeviceName.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String theDeviceCode;
            theDeviceCode = this.getDeviceCode();
            if (this.deviceCode!= null) {
                currentHashCode += theDeviceCode.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String theSerialNumber;
            theSerialNumber = this.getSerialNumber();
            if (this.serialNumber!= null) {
                currentHashCode += theSerialNumber.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String theSoftwareRevision;
            theSoftwareRevision = this.getSoftwareRevision();
            if (this.softwareRevision!= null) {
                currentHashCode += theSoftwareRevision.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String theHardwareRevision;
            theHardwareRevision = this.getHardwareRevision();
            if (this.hardwareRevision!= null) {
                currentHashCode += theHardwareRevision.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String theVendorName;
            theVendorName = this.getVendorName();
            if (this.vendorName!= null) {
                currentHashCode += theVendorName.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String theVendorCode;
            theVendorCode = this.getVendorCode();
            if (this.vendorCode!= null) {
                currentHashCode += theVendorCode.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String theBrandName;
            theBrandName = this.getBrandName();
            if (this.brandName!= null) {
                currentHashCode += theBrandName.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String thePowerSource;
            thePowerSource = this.getPowerSource();
            if (this.powerSource!= null) {
                currentHashCode += thePowerSource.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String theManufacturerNodeIdentification;
            theManufacturerNodeIdentification = this.getManufacturerNodeIdentification();
            if (this.manufacturerNodeIdentification!= null) {
                currentHashCode += theManufacturerNodeIdentification.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String theManufacturerLabel;
            theManufacturerLabel = this.getManufacturerLabel();
            if (this.manufacturerLabel!= null) {
                currentHashCode += theManufacturerLabel.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String theManufacturerDescription;
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
            String theDeviceName;
            theDeviceName = this.getDeviceName();
            strategy.appendField(locator, this, "deviceName", buffer, theDeviceName, (this.deviceName!= null));
        }
        {
            String theDeviceCode;
            theDeviceCode = this.getDeviceCode();
            strategy.appendField(locator, this, "deviceCode", buffer, theDeviceCode, (this.deviceCode!= null));
        }
        {
            String theSerialNumber;
            theSerialNumber = this.getSerialNumber();
            strategy.appendField(locator, this, "serialNumber", buffer, theSerialNumber, (this.serialNumber!= null));
        }
        {
            String theSoftwareRevision;
            theSoftwareRevision = this.getSoftwareRevision();
            strategy.appendField(locator, this, "softwareRevision", buffer, theSoftwareRevision, (this.softwareRevision!= null));
        }
        {
            String theHardwareRevision;
            theHardwareRevision = this.getHardwareRevision();
            strategy.appendField(locator, this, "hardwareRevision", buffer, theHardwareRevision, (this.hardwareRevision!= null));
        }
        {
            String theVendorName;
            theVendorName = this.getVendorName();
            strategy.appendField(locator, this, "vendorName", buffer, theVendorName, (this.vendorName!= null));
        }
        {
            String theVendorCode;
            theVendorCode = this.getVendorCode();
            strategy.appendField(locator, this, "vendorCode", buffer, theVendorCode, (this.vendorCode!= null));
        }
        {
            String theBrandName;
            theBrandName = this.getBrandName();
            strategy.appendField(locator, this, "brandName", buffer, theBrandName, (this.brandName!= null));
        }
        {
            String thePowerSource;
            thePowerSource = this.getPowerSource();
            strategy.appendField(locator, this, "powerSource", buffer, thePowerSource, (this.powerSource!= null));
        }
        {
            String theManufacturerNodeIdentification;
            theManufacturerNodeIdentification = this.getManufacturerNodeIdentification();
            strategy.appendField(locator, this, "manufacturerNodeIdentification", buffer, theManufacturerNodeIdentification, (this.manufacturerNodeIdentification!= null));
        }
        {
            String theManufacturerLabel;
            theManufacturerLabel = this.getManufacturerLabel();
            strategy.appendField(locator, this, "manufacturerLabel", buffer, theManufacturerLabel, (this.manufacturerLabel!= null));
        }
        {
            String theManufacturerDescription;
            theManufacturerDescription = this.getManufacturerDescription();
            strategy.appendField(locator, this, "manufacturerDescription", buffer, theManufacturerDescription, (this.manufacturerDescription!= null));
        }
        return buffer;
    }

}
