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
 * <p>Java class for NetworkManagementDeviceDescriptionDataElementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NetworkManagementDeviceDescriptionDataElementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="deviceAddress" type="{http://docs.eebus.org/spine/xsd/v1}DeviceAddressElementsType" minOccurs="0"/&gt;
 *         &lt;element name="deviceType" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="networkManagementResponsibleAddress" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="nativeSetup" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="technologyAddress" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="communicationsTechnologyInformation" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="networkFeatureSet" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="lastStateChange" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="minimumTrustLevel" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="label" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkManagementDeviceDescriptionDataElementsType", propOrder = {
    "deviceAddress",
    "deviceType",
    "networkManagementResponsibleAddress",
    "nativeSetup",
    "technologyAddress",
    "communicationsTechnologyInformation",
    "networkFeatureSet",
    "lastStateChange",
    "minimumTrustLevel",
    "label",
    "description"
})
@XmlSeeAlso({
    org.openmuc.jeebus.spine.xsd.v1.NodeManagementDestinationDataElementsType.DeviceDescription.class,
    org.openmuc.jeebus.spine.xsd.v1.NodeManagementDetailedDiscoveryDeviceInformationElementsType.Description.class
})
public class NetworkManagementDeviceDescriptionDataElementsType implements Cloneable, CopyTo, ToString
{

    protected DeviceAddressElementsType deviceAddress;
    protected ElementTagType deviceType;
    protected ElementTagType networkManagementResponsibleAddress;
    protected ElementTagType nativeSetup;
    protected ElementTagType technologyAddress;
    protected ElementTagType communicationsTechnologyInformation;
    protected ElementTagType networkFeatureSet;
    protected ElementTagType lastStateChange;
    protected ElementTagType minimumTrustLevel;
    protected ElementTagType label;
    protected ElementTagType description;

    /**
     * Default no-arg constructor
     * 
     */
    public NetworkManagementDeviceDescriptionDataElementsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public NetworkManagementDeviceDescriptionDataElementsType(final DeviceAddressElementsType deviceAddress, final ElementTagType deviceType, final ElementTagType networkManagementResponsibleAddress, final ElementTagType nativeSetup, final ElementTagType technologyAddress, final ElementTagType communicationsTechnologyInformation, final ElementTagType networkFeatureSet, final ElementTagType lastStateChange, final ElementTagType minimumTrustLevel, final ElementTagType label, final ElementTagType description) {
        this.deviceAddress = deviceAddress;
        this.deviceType = deviceType;
        this.networkManagementResponsibleAddress = networkManagementResponsibleAddress;
        this.nativeSetup = nativeSetup;
        this.technologyAddress = technologyAddress;
        this.communicationsTechnologyInformation = communicationsTechnologyInformation;
        this.networkFeatureSet = networkFeatureSet;
        this.lastStateChange = lastStateChange;
        this.minimumTrustLevel = minimumTrustLevel;
        this.label = label;
        this.description = description;
    }

    /**
     * Gets the value of the deviceAddress property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceAddressElementsType }
     *     
     */
    public DeviceAddressElementsType getDeviceAddress() {
        return deviceAddress;
    }

    /**
     * Sets the value of the deviceAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceAddressElementsType }
     *     
     */
    public void setDeviceAddress(DeviceAddressElementsType value) {
        this.deviceAddress = value;
    }

    /**
     * Gets the value of the deviceType property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getDeviceType() {
        return deviceType;
    }

    /**
     * Sets the value of the deviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setDeviceType(ElementTagType value) {
        this.deviceType = value;
    }

    /**
     * Gets the value of the networkManagementResponsibleAddress property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getNetworkManagementResponsibleAddress() {
        return networkManagementResponsibleAddress;
    }

    /**
     * Sets the value of the networkManagementResponsibleAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setNetworkManagementResponsibleAddress(ElementTagType value) {
        this.networkManagementResponsibleAddress = value;
    }

    /**
     * Gets the value of the nativeSetup property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getNativeSetup() {
        return nativeSetup;
    }

    /**
     * Sets the value of the nativeSetup property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setNativeSetup(ElementTagType value) {
        this.nativeSetup = value;
    }

    /**
     * Gets the value of the technologyAddress property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getTechnologyAddress() {
        return technologyAddress;
    }

    /**
     * Sets the value of the technologyAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setTechnologyAddress(ElementTagType value) {
        this.technologyAddress = value;
    }

    /**
     * Gets the value of the communicationsTechnologyInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getCommunicationsTechnologyInformation() {
        return communicationsTechnologyInformation;
    }

    /**
     * Sets the value of the communicationsTechnologyInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setCommunicationsTechnologyInformation(ElementTagType value) {
        this.communicationsTechnologyInformation = value;
    }

    /**
     * Gets the value of the networkFeatureSet property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getNetworkFeatureSet() {
        return networkFeatureSet;
    }

    /**
     * Sets the value of the networkFeatureSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setNetworkFeatureSet(ElementTagType value) {
        this.networkFeatureSet = value;
    }

    /**
     * Gets the value of the lastStateChange property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getLastStateChange() {
        return lastStateChange;
    }

    /**
     * Sets the value of the lastStateChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setLastStateChange(ElementTagType value) {
        this.lastStateChange = value;
    }

    /**
     * Gets the value of the minimumTrustLevel property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getMinimumTrustLevel() {
        return minimumTrustLevel;
    }

    /**
     * Sets the value of the minimumTrustLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setMinimumTrustLevel(ElementTagType value) {
        this.minimumTrustLevel = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setLabel(ElementTagType value) {
        this.label = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setDescription(ElementTagType value) {
        this.description = value;
    }

    /**
     * Sets the value of the deviceAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceAddressElementsType }
     * @return
     *     The class instance
     */
    public NetworkManagementDeviceDescriptionDataElementsType withDeviceAddress(DeviceAddressElementsType value) {
        setDeviceAddress(value);
        return this;
    }

    /**
     * Sets the value of the deviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public NetworkManagementDeviceDescriptionDataElementsType withDeviceType(ElementTagType value) {
        setDeviceType(value);
        return this;
    }

    /**
     * Sets the value of the networkManagementResponsibleAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public NetworkManagementDeviceDescriptionDataElementsType withNetworkManagementResponsibleAddress(ElementTagType value) {
        setNetworkManagementResponsibleAddress(value);
        return this;
    }

    /**
     * Sets the value of the nativeSetup property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public NetworkManagementDeviceDescriptionDataElementsType withNativeSetup(ElementTagType value) {
        setNativeSetup(value);
        return this;
    }

    /**
     * Sets the value of the technologyAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public NetworkManagementDeviceDescriptionDataElementsType withTechnologyAddress(ElementTagType value) {
        setTechnologyAddress(value);
        return this;
    }

    /**
     * Sets the value of the communicationsTechnologyInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public NetworkManagementDeviceDescriptionDataElementsType withCommunicationsTechnologyInformation(ElementTagType value) {
        setCommunicationsTechnologyInformation(value);
        return this;
    }

    /**
     * Sets the value of the networkFeatureSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public NetworkManagementDeviceDescriptionDataElementsType withNetworkFeatureSet(ElementTagType value) {
        setNetworkFeatureSet(value);
        return this;
    }

    /**
     * Sets the value of the lastStateChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public NetworkManagementDeviceDescriptionDataElementsType withLastStateChange(ElementTagType value) {
        setLastStateChange(value);
        return this;
    }

    /**
     * Sets the value of the minimumTrustLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public NetworkManagementDeviceDescriptionDataElementsType withMinimumTrustLevel(ElementTagType value) {
        setMinimumTrustLevel(value);
        return this;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public NetworkManagementDeviceDescriptionDataElementsType withLabel(ElementTagType value) {
        setLabel(value);
        return this;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public NetworkManagementDeviceDescriptionDataElementsType withDescription(ElementTagType value) {
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
        if (draftCopy instanceof NetworkManagementDeviceDescriptionDataElementsType) {
            final NetworkManagementDeviceDescriptionDataElementsType copy = ((NetworkManagementDeviceDescriptionDataElementsType) draftCopy);
            {
                Boolean deviceAddressShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.deviceAddress!= null));
                if (deviceAddressShouldBeCopiedAndSet == Boolean.TRUE) {
                    DeviceAddressElementsType sourceDeviceAddress;
                    sourceDeviceAddress = this.getDeviceAddress();
                    DeviceAddressElementsType copyDeviceAddress = ((DeviceAddressElementsType) strategy.copy(LocatorUtils.property(locator, "deviceAddress", sourceDeviceAddress), sourceDeviceAddress, (this.deviceAddress!= null)));
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
                    ElementTagType sourceDeviceType;
                    sourceDeviceType = this.getDeviceType();
                    ElementTagType copyDeviceType = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "deviceType", sourceDeviceType), sourceDeviceType, (this.deviceType!= null)));
                    copy.setDeviceType(copyDeviceType);
                } else {
                    if (deviceTypeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.deviceType = null;
                    }
                }
            }
            {
                Boolean networkManagementResponsibleAddressShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.networkManagementResponsibleAddress!= null));
                if (networkManagementResponsibleAddressShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceNetworkManagementResponsibleAddress;
                    sourceNetworkManagementResponsibleAddress = this.getNetworkManagementResponsibleAddress();
                    ElementTagType copyNetworkManagementResponsibleAddress = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "networkManagementResponsibleAddress", sourceNetworkManagementResponsibleAddress), sourceNetworkManagementResponsibleAddress, (this.networkManagementResponsibleAddress!= null)));
                    copy.setNetworkManagementResponsibleAddress(copyNetworkManagementResponsibleAddress);
                } else {
                    if (networkManagementResponsibleAddressShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.networkManagementResponsibleAddress = null;
                    }
                }
            }
            {
                Boolean nativeSetupShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.nativeSetup!= null));
                if (nativeSetupShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceNativeSetup;
                    sourceNativeSetup = this.getNativeSetup();
                    ElementTagType copyNativeSetup = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "nativeSetup", sourceNativeSetup), sourceNativeSetup, (this.nativeSetup!= null)));
                    copy.setNativeSetup(copyNativeSetup);
                } else {
                    if (nativeSetupShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.nativeSetup = null;
                    }
                }
            }
            {
                Boolean technologyAddressShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.technologyAddress!= null));
                if (technologyAddressShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceTechnologyAddress;
                    sourceTechnologyAddress = this.getTechnologyAddress();
                    ElementTagType copyTechnologyAddress = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "technologyAddress", sourceTechnologyAddress), sourceTechnologyAddress, (this.technologyAddress!= null)));
                    copy.setTechnologyAddress(copyTechnologyAddress);
                } else {
                    if (technologyAddressShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.technologyAddress = null;
                    }
                }
            }
            {
                Boolean communicationsTechnologyInformationShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.communicationsTechnologyInformation!= null));
                if (communicationsTechnologyInformationShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceCommunicationsTechnologyInformation;
                    sourceCommunicationsTechnologyInformation = this.getCommunicationsTechnologyInformation();
                    ElementTagType copyCommunicationsTechnologyInformation = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "communicationsTechnologyInformation", sourceCommunicationsTechnologyInformation), sourceCommunicationsTechnologyInformation, (this.communicationsTechnologyInformation!= null)));
                    copy.setCommunicationsTechnologyInformation(copyCommunicationsTechnologyInformation);
                } else {
                    if (communicationsTechnologyInformationShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.communicationsTechnologyInformation = null;
                    }
                }
            }
            {
                Boolean networkFeatureSetShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.networkFeatureSet!= null));
                if (networkFeatureSetShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceNetworkFeatureSet;
                    sourceNetworkFeatureSet = this.getNetworkFeatureSet();
                    ElementTagType copyNetworkFeatureSet = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "networkFeatureSet", sourceNetworkFeatureSet), sourceNetworkFeatureSet, (this.networkFeatureSet!= null)));
                    copy.setNetworkFeatureSet(copyNetworkFeatureSet);
                } else {
                    if (networkFeatureSetShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.networkFeatureSet = null;
                    }
                }
            }
            {
                Boolean lastStateChangeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.lastStateChange!= null));
                if (lastStateChangeShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceLastStateChange;
                    sourceLastStateChange = this.getLastStateChange();
                    ElementTagType copyLastStateChange = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "lastStateChange", sourceLastStateChange), sourceLastStateChange, (this.lastStateChange!= null)));
                    copy.setLastStateChange(copyLastStateChange);
                } else {
                    if (lastStateChangeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.lastStateChange = null;
                    }
                }
            }
            {
                Boolean minimumTrustLevelShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.minimumTrustLevel!= null));
                if (minimumTrustLevelShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceMinimumTrustLevel;
                    sourceMinimumTrustLevel = this.getMinimumTrustLevel();
                    ElementTagType copyMinimumTrustLevel = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "minimumTrustLevel", sourceMinimumTrustLevel), sourceMinimumTrustLevel, (this.minimumTrustLevel!= null)));
                    copy.setMinimumTrustLevel(copyMinimumTrustLevel);
                } else {
                    if (minimumTrustLevelShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.minimumTrustLevel = null;
                    }
                }
            }
            {
                Boolean labelShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.label!= null));
                if (labelShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceLabel;
                    sourceLabel = this.getLabel();
                    ElementTagType copyLabel = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "label", sourceLabel), sourceLabel, (this.label!= null)));
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
                    ElementTagType sourceDescription;
                    sourceDescription = this.getDescription();
                    ElementTagType copyDescription = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "description", sourceDescription), sourceDescription, (this.description!= null)));
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
        return new NetworkManagementDeviceDescriptionDataElementsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final NetworkManagementDeviceDescriptionDataElementsType that = ((NetworkManagementDeviceDescriptionDataElementsType) object);
        {
            DeviceAddressElementsType leftDeviceAddress;
            leftDeviceAddress = this.getDeviceAddress();
            DeviceAddressElementsType rightDeviceAddress;
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
            ElementTagType leftDeviceType;
            leftDeviceType = this.getDeviceType();
            ElementTagType rightDeviceType;
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
        {
            ElementTagType leftNetworkManagementResponsibleAddress;
            leftNetworkManagementResponsibleAddress = this.getNetworkManagementResponsibleAddress();
            ElementTagType rightNetworkManagementResponsibleAddress;
            rightNetworkManagementResponsibleAddress = that.getNetworkManagementResponsibleAddress();
            if (this.networkManagementResponsibleAddress!= null) {
                if (that.networkManagementResponsibleAddress!= null) {
                    if (!leftNetworkManagementResponsibleAddress.equals(rightNetworkManagementResponsibleAddress)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.networkManagementResponsibleAddress!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftNativeSetup;
            leftNativeSetup = this.getNativeSetup();
            ElementTagType rightNativeSetup;
            rightNativeSetup = that.getNativeSetup();
            if (this.nativeSetup!= null) {
                if (that.nativeSetup!= null) {
                    if (!leftNativeSetup.equals(rightNativeSetup)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.nativeSetup!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftTechnologyAddress;
            leftTechnologyAddress = this.getTechnologyAddress();
            ElementTagType rightTechnologyAddress;
            rightTechnologyAddress = that.getTechnologyAddress();
            if (this.technologyAddress!= null) {
                if (that.technologyAddress!= null) {
                    if (!leftTechnologyAddress.equals(rightTechnologyAddress)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.technologyAddress!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftCommunicationsTechnologyInformation;
            leftCommunicationsTechnologyInformation = this.getCommunicationsTechnologyInformation();
            ElementTagType rightCommunicationsTechnologyInformation;
            rightCommunicationsTechnologyInformation = that.getCommunicationsTechnologyInformation();
            if (this.communicationsTechnologyInformation!= null) {
                if (that.communicationsTechnologyInformation!= null) {
                    if (!leftCommunicationsTechnologyInformation.equals(rightCommunicationsTechnologyInformation)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.communicationsTechnologyInformation!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftNetworkFeatureSet;
            leftNetworkFeatureSet = this.getNetworkFeatureSet();
            ElementTagType rightNetworkFeatureSet;
            rightNetworkFeatureSet = that.getNetworkFeatureSet();
            if (this.networkFeatureSet!= null) {
                if (that.networkFeatureSet!= null) {
                    if (!leftNetworkFeatureSet.equals(rightNetworkFeatureSet)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.networkFeatureSet!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftLastStateChange;
            leftLastStateChange = this.getLastStateChange();
            ElementTagType rightLastStateChange;
            rightLastStateChange = that.getLastStateChange();
            if (this.lastStateChange!= null) {
                if (that.lastStateChange!= null) {
                    if (!leftLastStateChange.equals(rightLastStateChange)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.lastStateChange!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftMinimumTrustLevel;
            leftMinimumTrustLevel = this.getMinimumTrustLevel();
            ElementTagType rightMinimumTrustLevel;
            rightMinimumTrustLevel = that.getMinimumTrustLevel();
            if (this.minimumTrustLevel!= null) {
                if (that.minimumTrustLevel!= null) {
                    if (!leftMinimumTrustLevel.equals(rightMinimumTrustLevel)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.minimumTrustLevel!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftLabel;
            leftLabel = this.getLabel();
            ElementTagType rightLabel;
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
            ElementTagType leftDescription;
            leftDescription = this.getDescription();
            ElementTagType rightDescription;
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
            DeviceAddressElementsType theDeviceAddress;
            theDeviceAddress = this.getDeviceAddress();
            if (this.deviceAddress!= null) {
                currentHashCode += theDeviceAddress.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theDeviceType;
            theDeviceType = this.getDeviceType();
            if (this.deviceType!= null) {
                currentHashCode += theDeviceType.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theNetworkManagementResponsibleAddress;
            theNetworkManagementResponsibleAddress = this.getNetworkManagementResponsibleAddress();
            if (this.networkManagementResponsibleAddress!= null) {
                currentHashCode += theNetworkManagementResponsibleAddress.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theNativeSetup;
            theNativeSetup = this.getNativeSetup();
            if (this.nativeSetup!= null) {
                currentHashCode += theNativeSetup.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theTechnologyAddress;
            theTechnologyAddress = this.getTechnologyAddress();
            if (this.technologyAddress!= null) {
                currentHashCode += theTechnologyAddress.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theCommunicationsTechnologyInformation;
            theCommunicationsTechnologyInformation = this.getCommunicationsTechnologyInformation();
            if (this.communicationsTechnologyInformation!= null) {
                currentHashCode += theCommunicationsTechnologyInformation.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theNetworkFeatureSet;
            theNetworkFeatureSet = this.getNetworkFeatureSet();
            if (this.networkFeatureSet!= null) {
                currentHashCode += theNetworkFeatureSet.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theLastStateChange;
            theLastStateChange = this.getLastStateChange();
            if (this.lastStateChange!= null) {
                currentHashCode += theLastStateChange.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theMinimumTrustLevel;
            theMinimumTrustLevel = this.getMinimumTrustLevel();
            if (this.minimumTrustLevel!= null) {
                currentHashCode += theMinimumTrustLevel.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theLabel;
            theLabel = this.getLabel();
            if (this.label!= null) {
                currentHashCode += theLabel.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theDescription;
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
            DeviceAddressElementsType theDeviceAddress;
            theDeviceAddress = this.getDeviceAddress();
            strategy.appendField(locator, this, "deviceAddress", buffer, theDeviceAddress, (this.deviceAddress!= null));
        }
        {
            ElementTagType theDeviceType;
            theDeviceType = this.getDeviceType();
            strategy.appendField(locator, this, "deviceType", buffer, theDeviceType, (this.deviceType!= null));
        }
        {
            ElementTagType theNetworkManagementResponsibleAddress;
            theNetworkManagementResponsibleAddress = this.getNetworkManagementResponsibleAddress();
            strategy.appendField(locator, this, "networkManagementResponsibleAddress", buffer, theNetworkManagementResponsibleAddress, (this.networkManagementResponsibleAddress!= null));
        }
        {
            ElementTagType theNativeSetup;
            theNativeSetup = this.getNativeSetup();
            strategy.appendField(locator, this, "nativeSetup", buffer, theNativeSetup, (this.nativeSetup!= null));
        }
        {
            ElementTagType theTechnologyAddress;
            theTechnologyAddress = this.getTechnologyAddress();
            strategy.appendField(locator, this, "technologyAddress", buffer, theTechnologyAddress, (this.technologyAddress!= null));
        }
        {
            ElementTagType theCommunicationsTechnologyInformation;
            theCommunicationsTechnologyInformation = this.getCommunicationsTechnologyInformation();
            strategy.appendField(locator, this, "communicationsTechnologyInformation", buffer, theCommunicationsTechnologyInformation, (this.communicationsTechnologyInformation!= null));
        }
        {
            ElementTagType theNetworkFeatureSet;
            theNetworkFeatureSet = this.getNetworkFeatureSet();
            strategy.appendField(locator, this, "networkFeatureSet", buffer, theNetworkFeatureSet, (this.networkFeatureSet!= null));
        }
        {
            ElementTagType theLastStateChange;
            theLastStateChange = this.getLastStateChange();
            strategy.appendField(locator, this, "lastStateChange", buffer, theLastStateChange, (this.lastStateChange!= null));
        }
        {
            ElementTagType theMinimumTrustLevel;
            theMinimumTrustLevel = this.getMinimumTrustLevel();
            strategy.appendField(locator, this, "minimumTrustLevel", buffer, theMinimumTrustLevel, (this.minimumTrustLevel!= null));
        }
        {
            ElementTagType theLabel;
            theLabel = this.getLabel();
            strategy.appendField(locator, this, "label", buffer, theLabel, (this.label!= null));
        }
        {
            ElementTagType theDescription;
            theDescription = this.getDescription();
            strategy.appendField(locator, this, "description", buffer, theDescription, (this.description!= null));
        }
        return buffer;
    }

}
