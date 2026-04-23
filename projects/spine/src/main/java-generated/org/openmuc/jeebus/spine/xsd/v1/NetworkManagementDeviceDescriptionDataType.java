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
 * <p>Java class for NetworkManagementDeviceDescriptionDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NetworkManagementDeviceDescriptionDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="deviceAddress" type="{http://docs.eebus.org/spine/xsd/v1}DeviceAddressType" minOccurs="0"/&gt;
 *         &lt;element name="deviceType" type="{http://docs.eebus.org/spine/xsd/v1}DeviceTypeType" minOccurs="0"/&gt;
 *         &lt;element name="networkManagementResponsibleAddress" type="{http://docs.eebus.org/spine/xsd/v1}FeatureAddressType" minOccurs="0"/&gt;
 *         &lt;element name="nativeSetup" type="{http://docs.eebus.org/spine/xsd/v1}NetworkManagementNativeSetupType" minOccurs="0"/&gt;
 *         &lt;element name="technologyAddress" type="{http://docs.eebus.org/spine/xsd/v1}NetworkManagementTechnologyAddressType" minOccurs="0"/&gt;
 *         &lt;element name="communicationsTechnologyInformation" type="{http://docs.eebus.org/spine/xsd/v1}NetworkManagementCommunicationsTechnologyInformationType" minOccurs="0"/&gt;
 *         &lt;element name="networkFeatureSet" type="{http://docs.eebus.org/spine/xsd/v1}NetworkManagementFeatureSetType" minOccurs="0"/&gt;
 *         &lt;element name="lastStateChange" type="{http://docs.eebus.org/spine/xsd/v1}NetworkManagementStateChangeType" minOccurs="0"/&gt;
 *         &lt;element name="minimumTrustLevel" type="{http://docs.eebus.org/spine/xsd/v1}NetworkManagementMinimumTrustLevelType" minOccurs="0"/&gt;
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
@XmlType(name = "NetworkManagementDeviceDescriptionDataType", propOrder = {
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
    org.openmuc.jeebus.spine.xsd.v1.NodeManagementDestinationDataType.DeviceDescription.class,
    org.openmuc.jeebus.spine.xsd.v1.NodeManagementDetailedDiscoveryDeviceInformationType.Description.class
})
public class NetworkManagementDeviceDescriptionDataType implements Cloneable, CopyTo, ToString
{

    protected DeviceAddressType deviceAddress;
    protected String deviceType;
    protected FeatureAddressType networkManagementResponsibleAddress;
    protected String nativeSetup;
    protected String technologyAddress;
    protected String communicationsTechnologyInformation;
    @XmlSchemaType(name = "string")
    protected NetworkManagementFeatureSetType networkFeatureSet;
    @XmlSchemaType(name = "string")
    protected NetworkManagementStateChangeType lastStateChange;
    protected String minimumTrustLevel;
    protected String label;
    protected String description;

    /**
     * Default no-arg constructor
     * 
     */
    public NetworkManagementDeviceDescriptionDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public NetworkManagementDeviceDescriptionDataType(final DeviceAddressType deviceAddress, final String deviceType, final FeatureAddressType networkManagementResponsibleAddress, final String nativeSetup, final String technologyAddress, final String communicationsTechnologyInformation, final NetworkManagementFeatureSetType networkFeatureSet, final NetworkManagementStateChangeType lastStateChange, final String minimumTrustLevel, final String label, final String description) {
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
     * Gets the value of the networkManagementResponsibleAddress property.
     * 
     * @return
     *     possible object is
     *     {@link FeatureAddressType }
     *     
     */
    public FeatureAddressType getNetworkManagementResponsibleAddress() {
        return networkManagementResponsibleAddress;
    }

    /**
     * Sets the value of the networkManagementResponsibleAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeatureAddressType }
     *     
     */
    public void setNetworkManagementResponsibleAddress(FeatureAddressType value) {
        this.networkManagementResponsibleAddress = value;
    }

    /**
     * Gets the value of the nativeSetup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNativeSetup() {
        return nativeSetup;
    }

    /**
     * Sets the value of the nativeSetup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNativeSetup(String value) {
        this.nativeSetup = value;
    }

    /**
     * Gets the value of the technologyAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTechnologyAddress() {
        return technologyAddress;
    }

    /**
     * Sets the value of the technologyAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTechnologyAddress(String value) {
        this.technologyAddress = value;
    }

    /**
     * Gets the value of the communicationsTechnologyInformation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommunicationsTechnologyInformation() {
        return communicationsTechnologyInformation;
    }

    /**
     * Sets the value of the communicationsTechnologyInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommunicationsTechnologyInformation(String value) {
        this.communicationsTechnologyInformation = value;
    }

    /**
     * Gets the value of the networkFeatureSet property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkManagementFeatureSetType }
     *     
     */
    public NetworkManagementFeatureSetType getNetworkFeatureSet() {
        return networkFeatureSet;
    }

    /**
     * Sets the value of the networkFeatureSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkManagementFeatureSetType }
     *     
     */
    public void setNetworkFeatureSet(NetworkManagementFeatureSetType value) {
        this.networkFeatureSet = value;
    }

    /**
     * Gets the value of the lastStateChange property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkManagementStateChangeType }
     *     
     */
    public NetworkManagementStateChangeType getLastStateChange() {
        return lastStateChange;
    }

    /**
     * Sets the value of the lastStateChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkManagementStateChangeType }
     *     
     */
    public void setLastStateChange(NetworkManagementStateChangeType value) {
        this.lastStateChange = value;
    }

    /**
     * Gets the value of the minimumTrustLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinimumTrustLevel() {
        return minimumTrustLevel;
    }

    /**
     * Sets the value of the minimumTrustLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinimumTrustLevel(String value) {
        this.minimumTrustLevel = value;
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
     * Sets the value of the deviceAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceAddressType }
     * @return
     *     The class instance
     */
    public NetworkManagementDeviceDescriptionDataType withDeviceAddress(DeviceAddressType value) {
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
    public NetworkManagementDeviceDescriptionDataType withDeviceType(String value) {
        setDeviceType(value);
        return this;
    }

    /**
     * Sets the value of the networkManagementResponsibleAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeatureAddressType }
     * @return
     *     The class instance
     */
    public NetworkManagementDeviceDescriptionDataType withNetworkManagementResponsibleAddress(FeatureAddressType value) {
        setNetworkManagementResponsibleAddress(value);
        return this;
    }

    /**
     * Sets the value of the nativeSetup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public NetworkManagementDeviceDescriptionDataType withNativeSetup(String value) {
        setNativeSetup(value);
        return this;
    }

    /**
     * Sets the value of the technologyAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public NetworkManagementDeviceDescriptionDataType withTechnologyAddress(String value) {
        setTechnologyAddress(value);
        return this;
    }

    /**
     * Sets the value of the communicationsTechnologyInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public NetworkManagementDeviceDescriptionDataType withCommunicationsTechnologyInformation(String value) {
        setCommunicationsTechnologyInformation(value);
        return this;
    }

    /**
     * Sets the value of the networkFeatureSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkManagementFeatureSetType }
     * @return
     *     The class instance
     */
    public NetworkManagementDeviceDescriptionDataType withNetworkFeatureSet(NetworkManagementFeatureSetType value) {
        setNetworkFeatureSet(value);
        return this;
    }

    /**
     * Sets the value of the lastStateChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkManagementStateChangeType }
     * @return
     *     The class instance
     */
    public NetworkManagementDeviceDescriptionDataType withLastStateChange(NetworkManagementStateChangeType value) {
        setLastStateChange(value);
        return this;
    }

    /**
     * Sets the value of the minimumTrustLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public NetworkManagementDeviceDescriptionDataType withMinimumTrustLevel(String value) {
        setMinimumTrustLevel(value);
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
    public NetworkManagementDeviceDescriptionDataType withLabel(String value) {
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
    public NetworkManagementDeviceDescriptionDataType withDescription(String value) {
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
        if (draftCopy instanceof NetworkManagementDeviceDescriptionDataType) {
            final NetworkManagementDeviceDescriptionDataType copy = ((NetworkManagementDeviceDescriptionDataType) draftCopy);
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
            {
                Boolean networkManagementResponsibleAddressShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.networkManagementResponsibleAddress!= null));
                if (networkManagementResponsibleAddressShouldBeCopiedAndSet == Boolean.TRUE) {
                    FeatureAddressType sourceNetworkManagementResponsibleAddress;
                    sourceNetworkManagementResponsibleAddress = this.getNetworkManagementResponsibleAddress();
                    FeatureAddressType copyNetworkManagementResponsibleAddress = ((FeatureAddressType) strategy.copy(LocatorUtils.property(locator, "networkManagementResponsibleAddress", sourceNetworkManagementResponsibleAddress), sourceNetworkManagementResponsibleAddress, (this.networkManagementResponsibleAddress!= null)));
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
                    String sourceNativeSetup;
                    sourceNativeSetup = this.getNativeSetup();
                    String copyNativeSetup = ((String) strategy.copy(LocatorUtils.property(locator, "nativeSetup", sourceNativeSetup), sourceNativeSetup, (this.nativeSetup!= null)));
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
                    String sourceTechnologyAddress;
                    sourceTechnologyAddress = this.getTechnologyAddress();
                    String copyTechnologyAddress = ((String) strategy.copy(LocatorUtils.property(locator, "technologyAddress", sourceTechnologyAddress), sourceTechnologyAddress, (this.technologyAddress!= null)));
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
                    String sourceCommunicationsTechnologyInformation;
                    sourceCommunicationsTechnologyInformation = this.getCommunicationsTechnologyInformation();
                    String copyCommunicationsTechnologyInformation = ((String) strategy.copy(LocatorUtils.property(locator, "communicationsTechnologyInformation", sourceCommunicationsTechnologyInformation), sourceCommunicationsTechnologyInformation, (this.communicationsTechnologyInformation!= null)));
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
                    NetworkManagementFeatureSetType sourceNetworkFeatureSet;
                    sourceNetworkFeatureSet = this.getNetworkFeatureSet();
                    NetworkManagementFeatureSetType copyNetworkFeatureSet = ((NetworkManagementFeatureSetType) strategy.copy(LocatorUtils.property(locator, "networkFeatureSet", sourceNetworkFeatureSet), sourceNetworkFeatureSet, (this.networkFeatureSet!= null)));
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
                    NetworkManagementStateChangeType sourceLastStateChange;
                    sourceLastStateChange = this.getLastStateChange();
                    NetworkManagementStateChangeType copyLastStateChange = ((NetworkManagementStateChangeType) strategy.copy(LocatorUtils.property(locator, "lastStateChange", sourceLastStateChange), sourceLastStateChange, (this.lastStateChange!= null)));
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
                    String sourceMinimumTrustLevel;
                    sourceMinimumTrustLevel = this.getMinimumTrustLevel();
                    String copyMinimumTrustLevel = ((String) strategy.copy(LocatorUtils.property(locator, "minimumTrustLevel", sourceMinimumTrustLevel), sourceMinimumTrustLevel, (this.minimumTrustLevel!= null)));
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
        return new NetworkManagementDeviceDescriptionDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final NetworkManagementDeviceDescriptionDataType that = ((NetworkManagementDeviceDescriptionDataType) object);
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
        {
            FeatureAddressType leftNetworkManagementResponsibleAddress;
            leftNetworkManagementResponsibleAddress = this.getNetworkManagementResponsibleAddress();
            FeatureAddressType rightNetworkManagementResponsibleAddress;
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
            String leftNativeSetup;
            leftNativeSetup = this.getNativeSetup();
            String rightNativeSetup;
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
            String leftTechnologyAddress;
            leftTechnologyAddress = this.getTechnologyAddress();
            String rightTechnologyAddress;
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
            String leftCommunicationsTechnologyInformation;
            leftCommunicationsTechnologyInformation = this.getCommunicationsTechnologyInformation();
            String rightCommunicationsTechnologyInformation;
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
            NetworkManagementFeatureSetType leftNetworkFeatureSet;
            leftNetworkFeatureSet = this.getNetworkFeatureSet();
            NetworkManagementFeatureSetType rightNetworkFeatureSet;
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
            NetworkManagementStateChangeType leftLastStateChange;
            leftLastStateChange = this.getLastStateChange();
            NetworkManagementStateChangeType rightLastStateChange;
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
            String leftMinimumTrustLevel;
            leftMinimumTrustLevel = this.getMinimumTrustLevel();
            String rightMinimumTrustLevel;
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
        {
            currentHashCode = (currentHashCode* 31);
            FeatureAddressType theNetworkManagementResponsibleAddress;
            theNetworkManagementResponsibleAddress = this.getNetworkManagementResponsibleAddress();
            if (this.networkManagementResponsibleAddress!= null) {
                currentHashCode += theNetworkManagementResponsibleAddress.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String theNativeSetup;
            theNativeSetup = this.getNativeSetup();
            if (this.nativeSetup!= null) {
                currentHashCode += theNativeSetup.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String theTechnologyAddress;
            theTechnologyAddress = this.getTechnologyAddress();
            if (this.technologyAddress!= null) {
                currentHashCode += theTechnologyAddress.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String theCommunicationsTechnologyInformation;
            theCommunicationsTechnologyInformation = this.getCommunicationsTechnologyInformation();
            if (this.communicationsTechnologyInformation!= null) {
                currentHashCode += theCommunicationsTechnologyInformation.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            NetworkManagementFeatureSetType theNetworkFeatureSet;
            theNetworkFeatureSet = this.getNetworkFeatureSet();
            if (this.networkFeatureSet!= null) {
                currentHashCode += theNetworkFeatureSet.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            NetworkManagementStateChangeType theLastStateChange;
            theLastStateChange = this.getLastStateChange();
            if (this.lastStateChange!= null) {
                currentHashCode += theLastStateChange.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String theMinimumTrustLevel;
            theMinimumTrustLevel = this.getMinimumTrustLevel();
            if (this.minimumTrustLevel!= null) {
                currentHashCode += theMinimumTrustLevel.hashCode();
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
            DeviceAddressType theDeviceAddress;
            theDeviceAddress = this.getDeviceAddress();
            strategy.appendField(locator, this, "deviceAddress", buffer, theDeviceAddress, (this.deviceAddress!= null));
        }
        {
            String theDeviceType;
            theDeviceType = this.getDeviceType();
            strategy.appendField(locator, this, "deviceType", buffer, theDeviceType, (this.deviceType!= null));
        }
        {
            FeatureAddressType theNetworkManagementResponsibleAddress;
            theNetworkManagementResponsibleAddress = this.getNetworkManagementResponsibleAddress();
            strategy.appendField(locator, this, "networkManagementResponsibleAddress", buffer, theNetworkManagementResponsibleAddress, (this.networkManagementResponsibleAddress!= null));
        }
        {
            String theNativeSetup;
            theNativeSetup = this.getNativeSetup();
            strategy.appendField(locator, this, "nativeSetup", buffer, theNativeSetup, (this.nativeSetup!= null));
        }
        {
            String theTechnologyAddress;
            theTechnologyAddress = this.getTechnologyAddress();
            strategy.appendField(locator, this, "technologyAddress", buffer, theTechnologyAddress, (this.technologyAddress!= null));
        }
        {
            String theCommunicationsTechnologyInformation;
            theCommunicationsTechnologyInformation = this.getCommunicationsTechnologyInformation();
            strategy.appendField(locator, this, "communicationsTechnologyInformation", buffer, theCommunicationsTechnologyInformation, (this.communicationsTechnologyInformation!= null));
        }
        {
            NetworkManagementFeatureSetType theNetworkFeatureSet;
            theNetworkFeatureSet = this.getNetworkFeatureSet();
            strategy.appendField(locator, this, "networkFeatureSet", buffer, theNetworkFeatureSet, (this.networkFeatureSet!= null));
        }
        {
            NetworkManagementStateChangeType theLastStateChange;
            theLastStateChange = this.getLastStateChange();
            strategy.appendField(locator, this, "lastStateChange", buffer, theLastStateChange, (this.lastStateChange!= null));
        }
        {
            String theMinimumTrustLevel;
            theMinimumTrustLevel = this.getMinimumTrustLevel();
            strategy.appendField(locator, this, "minimumTrustLevel", buffer, theMinimumTrustLevel, (this.minimumTrustLevel!= null));
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
