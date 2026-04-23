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


/**
 * <p>Java class for NodeManagementDetailedDiscoveryDeviceInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NodeManagementDetailedDiscoveryDeviceInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="description" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}NetworkManagementDeviceDescriptionDataType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="deviceAddress" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}DeviceAddressType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element ref="{http://docs.eebus.org/spine/xsd/v1}device" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="deviceType" type="{http://docs.eebus.org/spine/xsd/v1}DeviceTypeType" minOccurs="0"/&gt;
 *                   &lt;element name="networkManagementResponsibleAddress" type="{http://docs.eebus.org/spine/xsd/v1}FeatureAddressType" minOccurs="0"/&gt;
 *                   &lt;element name="nativeSetup" type="{http://docs.eebus.org/spine/xsd/v1}NetworkManagementNativeSetupType" minOccurs="0"/&gt;
 *                   &lt;element name="technologyAddress" type="{http://docs.eebus.org/spine/xsd/v1}NetworkManagementTechnologyAddressType" minOccurs="0"/&gt;
 *                   &lt;element name="communicationsTechnologyInformation" type="{http://docs.eebus.org/spine/xsd/v1}NetworkManagementCommunicationsTechnologyInformationType" minOccurs="0"/&gt;
 *                   &lt;element name="networkFeatureSet" type="{http://docs.eebus.org/spine/xsd/v1}NetworkManagementFeatureSetType" minOccurs="0"/&gt;
 *                   &lt;element name="lastStateChange" type="{http://docs.eebus.org/spine/xsd/v1}NetworkManagementStateChangeType" minOccurs="0"/&gt;
 *                   &lt;element name="minimumTrustLevel" type="{http://docs.eebus.org/spine/xsd/v1}NetworkManagementMinimumTrustLevelType" minOccurs="0"/&gt;
 *                   &lt;element name="label" type="{http://docs.eebus.org/spine/xsd/v1}LabelType" minOccurs="0"/&gt;
 *                   &lt;element name="description" type="{http://docs.eebus.org/spine/xsd/v1}DescriptionType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NodeManagementDetailedDiscoveryDeviceInformationType", propOrder = {
    "description"
})
public class NodeManagementDetailedDiscoveryDeviceInformationType implements Cloneable, CopyTo, ToString
{

    protected NodeManagementDetailedDiscoveryDeviceInformationType.Description description;

    /**
     * Default no-arg constructor
     * 
     */
    public NodeManagementDetailedDiscoveryDeviceInformationType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public NodeManagementDetailedDiscoveryDeviceInformationType(final NodeManagementDetailedDiscoveryDeviceInformationType.Description description) {
        this.description = description;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link NodeManagementDetailedDiscoveryDeviceInformationType.Description }
     *     
     */
    public NodeManagementDetailedDiscoveryDeviceInformationType.Description getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeManagementDetailedDiscoveryDeviceInformationType.Description }
     *     
     */
    public void setDescription(NodeManagementDetailedDiscoveryDeviceInformationType.Description value) {
        this.description = value;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeManagementDetailedDiscoveryDeviceInformationType.Description }
     * @return
     *     The class instance
     */
    public NodeManagementDetailedDiscoveryDeviceInformationType withDescription(NodeManagementDetailedDiscoveryDeviceInformationType.Description value) {
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
        if (draftCopy instanceof NodeManagementDetailedDiscoveryDeviceInformationType) {
            final NodeManagementDetailedDiscoveryDeviceInformationType copy = ((NodeManagementDetailedDiscoveryDeviceInformationType) draftCopy);
            {
                Boolean descriptionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.description!= null));
                if (descriptionShouldBeCopiedAndSet == Boolean.TRUE) {
                    NodeManagementDetailedDiscoveryDeviceInformationType.Description sourceDescription;
                    sourceDescription = this.getDescription();
                    NodeManagementDetailedDiscoveryDeviceInformationType.Description copyDescription = ((NodeManagementDetailedDiscoveryDeviceInformationType.Description) strategy.copy(LocatorUtils.property(locator, "description", sourceDescription), sourceDescription, (this.description!= null)));
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
        return new NodeManagementDetailedDiscoveryDeviceInformationType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final NodeManagementDetailedDiscoveryDeviceInformationType that = ((NodeManagementDetailedDiscoveryDeviceInformationType) object);
        {
            NodeManagementDetailedDiscoveryDeviceInformationType.Description leftDescription;
            leftDescription = this.getDescription();
            NodeManagementDetailedDiscoveryDeviceInformationType.Description rightDescription;
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
            NodeManagementDetailedDiscoveryDeviceInformationType.Description theDescription;
            theDescription = this.getDescription();
            if (this.description!= null) {
                currentHashCode += theDescription.hashCode();
            }
        }
        return currentHashCode;
    }

    @Override
    public String toString() {
        final ToStringStrategy strategy = new org.openmuc.jeebus.spine.impl.parser.CustomToStringStrategy();
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
            NodeManagementDetailedDiscoveryDeviceInformationType.Description theDescription;
            theDescription = this.getDescription();
            strategy.appendField(locator, this, "description", buffer, theDescription, (this.description!= null));
        }
        return buffer;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}NetworkManagementDeviceDescriptionDataType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="deviceAddress" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}DeviceAddressType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element ref="{http://docs.eebus.org/spine/xsd/v1}device" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
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
    @XmlType(name = "")
    public static class Description
        extends NetworkManagementDeviceDescriptionDataType
        implements Cloneable, CopyTo, ToString
    {


        /**
         * Default no-arg constructor
         * 
         */
        public Description() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public Description(final DeviceAddressType deviceAddress, final String deviceType, final FeatureAddressType networkManagementResponsibleAddress, final String nativeSetup, final String technologyAddress, final String communicationsTechnologyInformation, final NetworkManagementFeatureSetType networkFeatureSet, final NetworkManagementStateChangeType lastStateChange, final String minimumTrustLevel, final String label, final String description) {
            super(deviceAddress, deviceType, networkManagementResponsibleAddress, nativeSetup, technologyAddress, communicationsTechnologyInformation, networkFeatureSet, lastStateChange, minimumTrustLevel, label, description);
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
        @Override
        public NodeManagementDetailedDiscoveryDeviceInformationType.Description withDeviceAddress(DeviceAddressType value) {
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
        @Override
        public NodeManagementDetailedDiscoveryDeviceInformationType.Description withDeviceType(String value) {
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
        @Override
        public NodeManagementDetailedDiscoveryDeviceInformationType.Description withNetworkManagementResponsibleAddress(FeatureAddressType value) {
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
        @Override
        public NodeManagementDetailedDiscoveryDeviceInformationType.Description withNativeSetup(String value) {
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
        @Override
        public NodeManagementDetailedDiscoveryDeviceInformationType.Description withTechnologyAddress(String value) {
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
        @Override
        public NodeManagementDetailedDiscoveryDeviceInformationType.Description withCommunicationsTechnologyInformation(String value) {
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
        @Override
        public NodeManagementDetailedDiscoveryDeviceInformationType.Description withNetworkFeatureSet(NetworkManagementFeatureSetType value) {
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
        @Override
        public NodeManagementDetailedDiscoveryDeviceInformationType.Description withLastStateChange(NetworkManagementStateChangeType value) {
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
        @Override
        public NodeManagementDetailedDiscoveryDeviceInformationType.Description withMinimumTrustLevel(String value) {
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
        @Override
        public NodeManagementDetailedDiscoveryDeviceInformationType.Description withLabel(String value) {
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
        @Override
        public NodeManagementDetailedDiscoveryDeviceInformationType.Description withDescription(String value) {
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
            super.copyTo(locator, draftCopy, strategy);
            return draftCopy;
        }

        @Override
        public Object createNewInstance() {
            return new NodeManagementDetailedDiscoveryDeviceInformationType.Description();
        }

        @Override
        public boolean equals(Object object) {
            if ((object == null)||(this.getClass()!= object.getClass())) {
                return false;
            }
            if (this == object) {
                return true;
            }
            if (!super.equals(object)) {
                return false;
            }
            return true;
        }

        @Override
        public int hashCode() {
            int currentHashCode = 1;
            currentHashCode = ((currentHashCode* 31)+ super.hashCode());
            return currentHashCode;
        }

        @Override
        public String toString() {
            final ToStringStrategy strategy = new org.openmuc.jeebus.spine.impl.parser.CustomToStringStrategy();
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
            super.appendFields(locator, buffer, strategy);
            return buffer;
        }

    }

}
