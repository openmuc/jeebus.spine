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
 * <p>Java class for NodeManagementDetailedDiscoveryDataSelectorsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NodeManagementDetailedDiscoveryDataSelectorsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="deviceInformation" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}NetworkManagementDeviceDescriptionListDataSelectorsType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="deviceAddress" type="{http://docs.eebus.org/spine/xsd/v1}DeviceAddressType" minOccurs="0"/&gt;
 *                   &lt;element name="deviceType" type="{http://docs.eebus.org/spine/xsd/v1}DeviceTypeType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="entityInformation" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}NetworkManagementEntityDescriptionListDataSelectorsType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="entityAddress" type="{http://docs.eebus.org/spine/xsd/v1}EntityAddressType" minOccurs="0"/&gt;
 *                   &lt;element name="entityType" type="{http://docs.eebus.org/spine/xsd/v1}EntityTypeType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="featureInformation" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}NetworkManagementFeatureDescriptionListDataSelectorsType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="featureAddress" type="{http://docs.eebus.org/spine/xsd/v1}FeatureAddressType" minOccurs="0"/&gt;
 *                   &lt;element name="featureType" type="{http://docs.eebus.org/spine/xsd/v1}FeatureTypeType" minOccurs="0"/&gt;
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
@XmlType(name = "NodeManagementDetailedDiscoveryDataSelectorsType", propOrder = {
    "deviceInformation",
    "entityInformation",
    "featureInformation"
})
public class NodeManagementDetailedDiscoveryDataSelectorsType implements Cloneable, CopyTo, ToString
{

    protected NodeManagementDetailedDiscoveryDataSelectorsType.DeviceInformation deviceInformation;
    protected NodeManagementDetailedDiscoveryDataSelectorsType.EntityInformation entityInformation;
    protected NodeManagementDetailedDiscoveryDataSelectorsType.FeatureInformation featureInformation;

    /**
     * Default no-arg constructor
     * 
     */
    public NodeManagementDetailedDiscoveryDataSelectorsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public NodeManagementDetailedDiscoveryDataSelectorsType(final NodeManagementDetailedDiscoveryDataSelectorsType.DeviceInformation deviceInformation, final NodeManagementDetailedDiscoveryDataSelectorsType.EntityInformation entityInformation, final NodeManagementDetailedDiscoveryDataSelectorsType.FeatureInformation featureInformation) {
        this.deviceInformation = deviceInformation;
        this.entityInformation = entityInformation;
        this.featureInformation = featureInformation;
    }

    /**
     * Gets the value of the deviceInformation property.
     * 
     * @return
     *     possible object is
     *     {@link NodeManagementDetailedDiscoveryDataSelectorsType.DeviceInformation }
     *     
     */
    public NodeManagementDetailedDiscoveryDataSelectorsType.DeviceInformation getDeviceInformation() {
        return deviceInformation;
    }

    /**
     * Sets the value of the deviceInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeManagementDetailedDiscoveryDataSelectorsType.DeviceInformation }
     *     
     */
    public void setDeviceInformation(NodeManagementDetailedDiscoveryDataSelectorsType.DeviceInformation value) {
        this.deviceInformation = value;
    }

    /**
     * Gets the value of the entityInformation property.
     * 
     * @return
     *     possible object is
     *     {@link NodeManagementDetailedDiscoveryDataSelectorsType.EntityInformation }
     *     
     */
    public NodeManagementDetailedDiscoveryDataSelectorsType.EntityInformation getEntityInformation() {
        return entityInformation;
    }

    /**
     * Sets the value of the entityInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeManagementDetailedDiscoveryDataSelectorsType.EntityInformation }
     *     
     */
    public void setEntityInformation(NodeManagementDetailedDiscoveryDataSelectorsType.EntityInformation value) {
        this.entityInformation = value;
    }

    /**
     * Gets the value of the featureInformation property.
     * 
     * @return
     *     possible object is
     *     {@link NodeManagementDetailedDiscoveryDataSelectorsType.FeatureInformation }
     *     
     */
    public NodeManagementDetailedDiscoveryDataSelectorsType.FeatureInformation getFeatureInformation() {
        return featureInformation;
    }

    /**
     * Sets the value of the featureInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeManagementDetailedDiscoveryDataSelectorsType.FeatureInformation }
     *     
     */
    public void setFeatureInformation(NodeManagementDetailedDiscoveryDataSelectorsType.FeatureInformation value) {
        this.featureInformation = value;
    }

    /**
     * Sets the value of the deviceInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeManagementDetailedDiscoveryDataSelectorsType.DeviceInformation }
     * @return
     *     The class instance
     */
    public NodeManagementDetailedDiscoveryDataSelectorsType withDeviceInformation(NodeManagementDetailedDiscoveryDataSelectorsType.DeviceInformation value) {
        setDeviceInformation(value);
        return this;
    }

    /**
     * Sets the value of the entityInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeManagementDetailedDiscoveryDataSelectorsType.EntityInformation }
     * @return
     *     The class instance
     */
    public NodeManagementDetailedDiscoveryDataSelectorsType withEntityInformation(NodeManagementDetailedDiscoveryDataSelectorsType.EntityInformation value) {
        setEntityInformation(value);
        return this;
    }

    /**
     * Sets the value of the featureInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeManagementDetailedDiscoveryDataSelectorsType.FeatureInformation }
     * @return
     *     The class instance
     */
    public NodeManagementDetailedDiscoveryDataSelectorsType withFeatureInformation(NodeManagementDetailedDiscoveryDataSelectorsType.FeatureInformation value) {
        setFeatureInformation(value);
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
        if (draftCopy instanceof NodeManagementDetailedDiscoveryDataSelectorsType) {
            final NodeManagementDetailedDiscoveryDataSelectorsType copy = ((NodeManagementDetailedDiscoveryDataSelectorsType) draftCopy);
            {
                Boolean deviceInformationShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.deviceInformation!= null));
                if (deviceInformationShouldBeCopiedAndSet == Boolean.TRUE) {
                    NodeManagementDetailedDiscoveryDataSelectorsType.DeviceInformation sourceDeviceInformation;
                    sourceDeviceInformation = this.getDeviceInformation();
                    NodeManagementDetailedDiscoveryDataSelectorsType.DeviceInformation copyDeviceInformation = ((NodeManagementDetailedDiscoveryDataSelectorsType.DeviceInformation) strategy.copy(LocatorUtils.property(locator, "deviceInformation", sourceDeviceInformation), sourceDeviceInformation, (this.deviceInformation!= null)));
                    copy.setDeviceInformation(copyDeviceInformation);
                } else {
                    if (deviceInformationShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.deviceInformation = null;
                    }
                }
            }
            {
                Boolean entityInformationShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.entityInformation!= null));
                if (entityInformationShouldBeCopiedAndSet == Boolean.TRUE) {
                    NodeManagementDetailedDiscoveryDataSelectorsType.EntityInformation sourceEntityInformation;
                    sourceEntityInformation = this.getEntityInformation();
                    NodeManagementDetailedDiscoveryDataSelectorsType.EntityInformation copyEntityInformation = ((NodeManagementDetailedDiscoveryDataSelectorsType.EntityInformation) strategy.copy(LocatorUtils.property(locator, "entityInformation", sourceEntityInformation), sourceEntityInformation, (this.entityInformation!= null)));
                    copy.setEntityInformation(copyEntityInformation);
                } else {
                    if (entityInformationShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.entityInformation = null;
                    }
                }
            }
            {
                Boolean featureInformationShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.featureInformation!= null));
                if (featureInformationShouldBeCopiedAndSet == Boolean.TRUE) {
                    NodeManagementDetailedDiscoveryDataSelectorsType.FeatureInformation sourceFeatureInformation;
                    sourceFeatureInformation = this.getFeatureInformation();
                    NodeManagementDetailedDiscoveryDataSelectorsType.FeatureInformation copyFeatureInformation = ((NodeManagementDetailedDiscoveryDataSelectorsType.FeatureInformation) strategy.copy(LocatorUtils.property(locator, "featureInformation", sourceFeatureInformation), sourceFeatureInformation, (this.featureInformation!= null)));
                    copy.setFeatureInformation(copyFeatureInformation);
                } else {
                    if (featureInformationShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.featureInformation = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new NodeManagementDetailedDiscoveryDataSelectorsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final NodeManagementDetailedDiscoveryDataSelectorsType that = ((NodeManagementDetailedDiscoveryDataSelectorsType) object);
        {
            NodeManagementDetailedDiscoveryDataSelectorsType.DeviceInformation leftDeviceInformation;
            leftDeviceInformation = this.getDeviceInformation();
            NodeManagementDetailedDiscoveryDataSelectorsType.DeviceInformation rightDeviceInformation;
            rightDeviceInformation = that.getDeviceInformation();
            if (this.deviceInformation!= null) {
                if (that.deviceInformation!= null) {
                    if (!leftDeviceInformation.equals(rightDeviceInformation)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.deviceInformation!= null) {
                    return false;
                }
            }
        }
        {
            NodeManagementDetailedDiscoveryDataSelectorsType.EntityInformation leftEntityInformation;
            leftEntityInformation = this.getEntityInformation();
            NodeManagementDetailedDiscoveryDataSelectorsType.EntityInformation rightEntityInformation;
            rightEntityInformation = that.getEntityInformation();
            if (this.entityInformation!= null) {
                if (that.entityInformation!= null) {
                    if (!leftEntityInformation.equals(rightEntityInformation)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.entityInformation!= null) {
                    return false;
                }
            }
        }
        {
            NodeManagementDetailedDiscoveryDataSelectorsType.FeatureInformation leftFeatureInformation;
            leftFeatureInformation = this.getFeatureInformation();
            NodeManagementDetailedDiscoveryDataSelectorsType.FeatureInformation rightFeatureInformation;
            rightFeatureInformation = that.getFeatureInformation();
            if (this.featureInformation!= null) {
                if (that.featureInformation!= null) {
                    if (!leftFeatureInformation.equals(rightFeatureInformation)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.featureInformation!= null) {
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
            NodeManagementDetailedDiscoveryDataSelectorsType.DeviceInformation theDeviceInformation;
            theDeviceInformation = this.getDeviceInformation();
            if (this.deviceInformation!= null) {
                currentHashCode += theDeviceInformation.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            NodeManagementDetailedDiscoveryDataSelectorsType.EntityInformation theEntityInformation;
            theEntityInformation = this.getEntityInformation();
            if (this.entityInformation!= null) {
                currentHashCode += theEntityInformation.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            NodeManagementDetailedDiscoveryDataSelectorsType.FeatureInformation theFeatureInformation;
            theFeatureInformation = this.getFeatureInformation();
            if (this.featureInformation!= null) {
                currentHashCode += theFeatureInformation.hashCode();
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
            NodeManagementDetailedDiscoveryDataSelectorsType.DeviceInformation theDeviceInformation;
            theDeviceInformation = this.getDeviceInformation();
            strategy.appendField(locator, this, "deviceInformation", buffer, theDeviceInformation, (this.deviceInformation!= null));
        }
        {
            NodeManagementDetailedDiscoveryDataSelectorsType.EntityInformation theEntityInformation;
            theEntityInformation = this.getEntityInformation();
            strategy.appendField(locator, this, "entityInformation", buffer, theEntityInformation, (this.entityInformation!= null));
        }
        {
            NodeManagementDetailedDiscoveryDataSelectorsType.FeatureInformation theFeatureInformation;
            theFeatureInformation = this.getFeatureInformation();
            strategy.appendField(locator, this, "featureInformation", buffer, theFeatureInformation, (this.featureInformation!= null));
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
     *     &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}NetworkManagementDeviceDescriptionListDataSelectorsType"&gt;
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
    @XmlType(name = "")
    public static class DeviceInformation
        extends NetworkManagementDeviceDescriptionListDataSelectorsType
        implements Cloneable, CopyTo, ToString
    {


        /**
         * Default no-arg constructor
         * 
         */
        public DeviceInformation() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public DeviceInformation(final DeviceAddressType deviceAddress, final String deviceType) {
            super(deviceAddress, deviceType);
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
        public NodeManagementDetailedDiscoveryDataSelectorsType.DeviceInformation withDeviceAddress(DeviceAddressType value) {
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
        public NodeManagementDetailedDiscoveryDataSelectorsType.DeviceInformation withDeviceType(String value) {
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
            super.copyTo(locator, draftCopy, strategy);
            return draftCopy;
        }

        @Override
        public Object createNewInstance() {
            return new NodeManagementDetailedDiscoveryDataSelectorsType.DeviceInformation();
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}NetworkManagementEntityDescriptionListDataSelectorsType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="entityAddress" type="{http://docs.eebus.org/spine/xsd/v1}EntityAddressType" minOccurs="0"/&gt;
     *         &lt;element name="entityType" type="{http://docs.eebus.org/spine/xsd/v1}EntityTypeType" minOccurs="0"/&gt;
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
    public static class EntityInformation
        extends NetworkManagementEntityDescriptionListDataSelectorsType
        implements Cloneable, CopyTo, ToString
    {


        /**
         * Default no-arg constructor
         * 
         */
        public EntityInformation() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public EntityInformation(final EntityAddressType entityAddress, final String entityType) {
            super(entityAddress, entityType);
        }

        /**
         * Sets the value of the entityAddress property.
         * 
         * @param value
         *     allowed object is
         *     {@link EntityAddressType }
         * @return
         *     The class instance
         */
        @Override
        public NodeManagementDetailedDiscoveryDataSelectorsType.EntityInformation withEntityAddress(EntityAddressType value) {
            setEntityAddress(value);
            return this;
        }

        /**
         * Sets the value of the entityType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         * @return
         *     The class instance
         */
        @Override
        public NodeManagementDetailedDiscoveryDataSelectorsType.EntityInformation withEntityType(String value) {
            setEntityType(value);
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
            return new NodeManagementDetailedDiscoveryDataSelectorsType.EntityInformation();
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}NetworkManagementFeatureDescriptionListDataSelectorsType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="featureAddress" type="{http://docs.eebus.org/spine/xsd/v1}FeatureAddressType" minOccurs="0"/&gt;
     *         &lt;element name="featureType" type="{http://docs.eebus.org/spine/xsd/v1}FeatureTypeType" minOccurs="0"/&gt;
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
    public static class FeatureInformation
        extends NetworkManagementFeatureDescriptionListDataSelectorsType
        implements Cloneable, CopyTo, ToString
    {


        /**
         * Default no-arg constructor
         * 
         */
        public FeatureInformation() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public FeatureInformation(final FeatureAddressType featureAddress, final String featureType) {
            super(featureAddress, featureType);
        }

        /**
         * Sets the value of the featureAddress property.
         * 
         * @param value
         *     allowed object is
         *     {@link FeatureAddressType }
         * @return
         *     The class instance
         */
        @Override
        public NodeManagementDetailedDiscoveryDataSelectorsType.FeatureInformation withFeatureAddress(FeatureAddressType value) {
            setFeatureAddress(value);
            return this;
        }

        /**
         * Sets the value of the featureType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         * @return
         *     The class instance
         */
        @Override
        public NodeManagementDetailedDiscoveryDataSelectorsType.FeatureInformation withFeatureType(String value) {
            setFeatureType(value);
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
            return new NodeManagementDetailedDiscoveryDataSelectorsType.FeatureInformation();
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
