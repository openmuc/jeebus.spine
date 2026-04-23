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
 * <p>Java class for NodeManagementDestinationDataElementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NodeManagementDestinationDataElementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="deviceDescription" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}NetworkManagementDeviceDescriptionDataElementsType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="deviceAddress" type="{http://docs.eebus.org/spine/xsd/v1}DeviceAddressElementsType" minOccurs="0"/&gt;
 *                   &lt;element name="communicationsTechnologyInformation" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *                   &lt;element name="networkFeatureSet" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *                   &lt;element name="lastStateChange" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *                   &lt;element name="label" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
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
@XmlType(name = "NodeManagementDestinationDataElementsType", propOrder = {
    "deviceDescription"
})
public class NodeManagementDestinationDataElementsType implements Cloneable, CopyTo, ToString
{

    protected NodeManagementDestinationDataElementsType.DeviceDescription deviceDescription;

    /**
     * Default no-arg constructor
     * 
     */
    public NodeManagementDestinationDataElementsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public NodeManagementDestinationDataElementsType(final NodeManagementDestinationDataElementsType.DeviceDescription deviceDescription) {
        this.deviceDescription = deviceDescription;
    }

    /**
     * Gets the value of the deviceDescription property.
     * 
     * @return
     *     possible object is
     *     {@link NodeManagementDestinationDataElementsType.DeviceDescription }
     *     
     */
    public NodeManagementDestinationDataElementsType.DeviceDescription getDeviceDescription() {
        return deviceDescription;
    }

    /**
     * Sets the value of the deviceDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeManagementDestinationDataElementsType.DeviceDescription }
     *     
     */
    public void setDeviceDescription(NodeManagementDestinationDataElementsType.DeviceDescription value) {
        this.deviceDescription = value;
    }

    /**
     * Sets the value of the deviceDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeManagementDestinationDataElementsType.DeviceDescription }
     * @return
     *     The class instance
     */
    public NodeManagementDestinationDataElementsType withDeviceDescription(NodeManagementDestinationDataElementsType.DeviceDescription value) {
        setDeviceDescription(value);
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
        if (draftCopy instanceof NodeManagementDestinationDataElementsType) {
            final NodeManagementDestinationDataElementsType copy = ((NodeManagementDestinationDataElementsType) draftCopy);
            {
                Boolean deviceDescriptionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.deviceDescription!= null));
                if (deviceDescriptionShouldBeCopiedAndSet == Boolean.TRUE) {
                    NodeManagementDestinationDataElementsType.DeviceDescription sourceDeviceDescription;
                    sourceDeviceDescription = this.getDeviceDescription();
                    NodeManagementDestinationDataElementsType.DeviceDescription copyDeviceDescription = ((NodeManagementDestinationDataElementsType.DeviceDescription) strategy.copy(LocatorUtils.property(locator, "deviceDescription", sourceDeviceDescription), sourceDeviceDescription, (this.deviceDescription!= null)));
                    copy.setDeviceDescription(copyDeviceDescription);
                } else {
                    if (deviceDescriptionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.deviceDescription = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new NodeManagementDestinationDataElementsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final NodeManagementDestinationDataElementsType that = ((NodeManagementDestinationDataElementsType) object);
        {
            NodeManagementDestinationDataElementsType.DeviceDescription leftDeviceDescription;
            leftDeviceDescription = this.getDeviceDescription();
            NodeManagementDestinationDataElementsType.DeviceDescription rightDeviceDescription;
            rightDeviceDescription = that.getDeviceDescription();
            if (this.deviceDescription!= null) {
                if (that.deviceDescription!= null) {
                    if (!leftDeviceDescription.equals(rightDeviceDescription)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.deviceDescription!= null) {
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
            NodeManagementDestinationDataElementsType.DeviceDescription theDeviceDescription;
            theDeviceDescription = this.getDeviceDescription();
            if (this.deviceDescription!= null) {
                currentHashCode += theDeviceDescription.hashCode();
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
            NodeManagementDestinationDataElementsType.DeviceDescription theDeviceDescription;
            theDeviceDescription = this.getDeviceDescription();
            strategy.appendField(locator, this, "deviceDescription", buffer, theDeviceDescription, (this.deviceDescription!= null));
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
     *     &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}NetworkManagementDeviceDescriptionDataElementsType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="deviceAddress" type="{http://docs.eebus.org/spine/xsd/v1}DeviceAddressElementsType" minOccurs="0"/&gt;
     *         &lt;element name="communicationsTechnologyInformation" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
     *         &lt;element name="networkFeatureSet" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
     *         &lt;element name="lastStateChange" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
     *         &lt;element name="label" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
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
    public static class DeviceDescription
        extends NetworkManagementDeviceDescriptionDataElementsType
        implements Cloneable, CopyTo, ToString
    {


        /**
         * Default no-arg constructor
         * 
         */
        public DeviceDescription() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public DeviceDescription(final DeviceAddressElementsType deviceAddress, final ElementTagType deviceType, final ElementTagType networkManagementResponsibleAddress, final ElementTagType nativeSetup, final ElementTagType technologyAddress, final ElementTagType communicationsTechnologyInformation, final ElementTagType networkFeatureSet, final ElementTagType lastStateChange, final ElementTagType minimumTrustLevel, final ElementTagType label, final ElementTagType description) {
            super(deviceAddress, deviceType, networkManagementResponsibleAddress, nativeSetup, technologyAddress, communicationsTechnologyInformation, networkFeatureSet, lastStateChange, minimumTrustLevel, label, description);
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
        @Override
        public NodeManagementDestinationDataElementsType.DeviceDescription withDeviceAddress(DeviceAddressElementsType value) {
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
        @Override
        public NodeManagementDestinationDataElementsType.DeviceDescription withDeviceType(ElementTagType value) {
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
        @Override
        public NodeManagementDestinationDataElementsType.DeviceDescription withNetworkManagementResponsibleAddress(ElementTagType value) {
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
        @Override
        public NodeManagementDestinationDataElementsType.DeviceDescription withNativeSetup(ElementTagType value) {
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
        @Override
        public NodeManagementDestinationDataElementsType.DeviceDescription withTechnologyAddress(ElementTagType value) {
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
        @Override
        public NodeManagementDestinationDataElementsType.DeviceDescription withCommunicationsTechnologyInformation(ElementTagType value) {
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
        @Override
        public NodeManagementDestinationDataElementsType.DeviceDescription withNetworkFeatureSet(ElementTagType value) {
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
        @Override
        public NodeManagementDestinationDataElementsType.DeviceDescription withLastStateChange(ElementTagType value) {
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
        @Override
        public NodeManagementDestinationDataElementsType.DeviceDescription withMinimumTrustLevel(ElementTagType value) {
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
        @Override
        public NodeManagementDestinationDataElementsType.DeviceDescription withLabel(ElementTagType value) {
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
        @Override
        public NodeManagementDestinationDataElementsType.DeviceDescription withDescription(ElementTagType value) {
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
            return new NodeManagementDestinationDataElementsType.DeviceDescription();
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
