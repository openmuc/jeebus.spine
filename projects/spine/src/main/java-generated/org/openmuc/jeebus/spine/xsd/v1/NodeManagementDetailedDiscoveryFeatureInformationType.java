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

import java.util.Collection;
import java.util.List;
import javax.xml.datatype.Duration;
import jakarta.xml.bind.JAXBElement;
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
 * <p>Java class for NodeManagementDetailedDiscoveryFeatureInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NodeManagementDetailedDiscoveryFeatureInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="description" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}NetworkManagementFeatureDescriptionDataType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="featureAddress" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}FeatureAddressType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;sequence&gt;
 *                               &lt;element ref="{http://docs.eebus.org/spine/xsd/v1}entity" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                             &lt;/sequence&gt;
 *                             &lt;sequence&gt;
 *                               &lt;element ref="{http://docs.eebus.org/spine/xsd/v1}feature" minOccurs="0"/&gt;
 *                             &lt;/sequence&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="featureType" type="{http://docs.eebus.org/spine/xsd/v1}FeatureTypeType" minOccurs="0"/&gt;
 *                   &lt;element name="specificUsage" type="{http://docs.eebus.org/spine/xsd/v1}FeatureSpecificUsageType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="featureGroup" type="{http://docs.eebus.org/spine/xsd/v1}FeatureGroupType" minOccurs="0"/&gt;
 *                   &lt;element name="role" type="{http://docs.eebus.org/spine/xsd/v1}RoleType" minOccurs="0"/&gt;
 *                   &lt;element name="supportedFunction" type="{http://docs.eebus.org/spine/xsd/v1}FunctionPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="lastStateChange" type="{http://docs.eebus.org/spine/xsd/v1}NetworkManagementStateChangeType" minOccurs="0"/&gt;
 *                   &lt;element name="minimumTrustLevel" type="{http://docs.eebus.org/spine/xsd/v1}NetworkManagementMinimumTrustLevelType" minOccurs="0"/&gt;
 *                   &lt;element name="label" type="{http://docs.eebus.org/spine/xsd/v1}LabelType" minOccurs="0"/&gt;
 *                   &lt;element name="description" type="{http://docs.eebus.org/spine/xsd/v1}DescriptionType" minOccurs="0"/&gt;
 *                   &lt;element name="maxResponseDelay" type="{http://docs.eebus.org/spine/xsd/v1}MaxResponseDelayType" minOccurs="0"/&gt;
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
@XmlType(name = "NodeManagementDetailedDiscoveryFeatureInformationType", propOrder = {
    "description"
})
public class NodeManagementDetailedDiscoveryFeatureInformationType implements Cloneable, CopyTo, ToString
{

    protected NodeManagementDetailedDiscoveryFeatureInformationType.Description description;

    /**
     * Default no-arg constructor
     * 
     */
    public NodeManagementDetailedDiscoveryFeatureInformationType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public NodeManagementDetailedDiscoveryFeatureInformationType(final NodeManagementDetailedDiscoveryFeatureInformationType.Description description) {
        this.description = description;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link NodeManagementDetailedDiscoveryFeatureInformationType.Description }
     *     
     */
    public NodeManagementDetailedDiscoveryFeatureInformationType.Description getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeManagementDetailedDiscoveryFeatureInformationType.Description }
     *     
     */
    public void setDescription(NodeManagementDetailedDiscoveryFeatureInformationType.Description value) {
        this.description = value;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeManagementDetailedDiscoveryFeatureInformationType.Description }
     * @return
     *     The class instance
     */
    public NodeManagementDetailedDiscoveryFeatureInformationType withDescription(NodeManagementDetailedDiscoveryFeatureInformationType.Description value) {
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
        if (draftCopy instanceof NodeManagementDetailedDiscoveryFeatureInformationType) {
            final NodeManagementDetailedDiscoveryFeatureInformationType copy = ((NodeManagementDetailedDiscoveryFeatureInformationType) draftCopy);
            {
                Boolean descriptionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.description!= null));
                if (descriptionShouldBeCopiedAndSet == Boolean.TRUE) {
                    NodeManagementDetailedDiscoveryFeatureInformationType.Description sourceDescription;
                    sourceDescription = this.getDescription();
                    NodeManagementDetailedDiscoveryFeatureInformationType.Description copyDescription = ((NodeManagementDetailedDiscoveryFeatureInformationType.Description) strategy.copy(LocatorUtils.property(locator, "description", sourceDescription), sourceDescription, (this.description!= null)));
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
        return new NodeManagementDetailedDiscoveryFeatureInformationType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final NodeManagementDetailedDiscoveryFeatureInformationType that = ((NodeManagementDetailedDiscoveryFeatureInformationType) object);
        {
            NodeManagementDetailedDiscoveryFeatureInformationType.Description leftDescription;
            leftDescription = this.getDescription();
            NodeManagementDetailedDiscoveryFeatureInformationType.Description rightDescription;
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
            NodeManagementDetailedDiscoveryFeatureInformationType.Description theDescription;
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
            NodeManagementDetailedDiscoveryFeatureInformationType.Description theDescription;
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
     *     &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}NetworkManagementFeatureDescriptionDataType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="featureAddress" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}FeatureAddressType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;sequence&gt;
     *                     &lt;element ref="{http://docs.eebus.org/spine/xsd/v1}entity" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                   &lt;/sequence&gt;
     *                   &lt;sequence&gt;
     *                     &lt;element ref="{http://docs.eebus.org/spine/xsd/v1}feature" minOccurs="0"/&gt;
     *                   &lt;/sequence&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="featureType" type="{http://docs.eebus.org/spine/xsd/v1}FeatureTypeType" minOccurs="0"/&gt;
     *         &lt;element name="specificUsage" type="{http://docs.eebus.org/spine/xsd/v1}FeatureSpecificUsageType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="featureGroup" type="{http://docs.eebus.org/spine/xsd/v1}FeatureGroupType" minOccurs="0"/&gt;
     *         &lt;element name="role" type="{http://docs.eebus.org/spine/xsd/v1}RoleType" minOccurs="0"/&gt;
     *         &lt;element name="supportedFunction" type="{http://docs.eebus.org/spine/xsd/v1}FunctionPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="lastStateChange" type="{http://docs.eebus.org/spine/xsd/v1}NetworkManagementStateChangeType" minOccurs="0"/&gt;
     *         &lt;element name="minimumTrustLevel" type="{http://docs.eebus.org/spine/xsd/v1}NetworkManagementMinimumTrustLevelType" minOccurs="0"/&gt;
     *         &lt;element name="label" type="{http://docs.eebus.org/spine/xsd/v1}LabelType" minOccurs="0"/&gt;
     *         &lt;element name="description" type="{http://docs.eebus.org/spine/xsd/v1}DescriptionType" minOccurs="0"/&gt;
     *         &lt;element name="maxResponseDelay" type="{http://docs.eebus.org/spine/xsd/v1}MaxResponseDelayType" minOccurs="0"/&gt;
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
        extends NetworkManagementFeatureDescriptionDataType
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
        public Description(final FeatureAddressType featureAddress, final String featureType, final List<JAXBElement<List<String>>> specificUsage, final String featureGroup, final RoleType role, final List<FunctionPropertyType> supportedFunction, final NetworkManagementStateChangeType lastStateChange, final String minimumTrustLevel, final String label, final String description, final Duration maxResponseDelay) {
            super(featureAddress, featureType, specificUsage, featureGroup, role, supportedFunction, lastStateChange, minimumTrustLevel, label, description, maxResponseDelay);
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
        public NodeManagementDetailedDiscoveryFeatureInformationType.Description withFeatureAddress(FeatureAddressType value) {
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
        public NodeManagementDetailedDiscoveryFeatureInformationType.Description withFeatureType(String value) {
            setFeatureType(value);
            return this;
        }

        /**
         * Adds objects to the list of SpecificUsage using add method
         * 
         * @param values
         *     objects to add to the list SpecificUsage
         * @return
         *     The class instance
         */
        @Override
        public NodeManagementDetailedDiscoveryFeatureInformationType.Description withSpecificUsage(JAXBElement<List<String>> ... values) {
            if (values!= null) {
                for (JAXBElement<List<String>> value: values) {
                    getSpecificUsage().add(value);
                }
            }
            return this;
        }

        /**
         * Adds objects to the list of SpecificUsage using addAll method
         * 
         * @param values
         *     objects to add to the list SpecificUsage
         * @return
         *     The class instance
         */
        @Override
        public NodeManagementDetailedDiscoveryFeatureInformationType.Description withSpecificUsage(Collection<JAXBElement<List<String>>> values) {
            if (values!= null) {
                getSpecificUsage().addAll(values);
            }
            return this;
        }

        /**
         * Sets the value of the featureGroup property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         * @return
         *     The class instance
         */
        @Override
        public NodeManagementDetailedDiscoveryFeatureInformationType.Description withFeatureGroup(String value) {
            setFeatureGroup(value);
            return this;
        }

        /**
         * Sets the value of the role property.
         * 
         * @param value
         *     allowed object is
         *     {@link RoleType }
         * @return
         *     The class instance
         */
        @Override
        public NodeManagementDetailedDiscoveryFeatureInformationType.Description withRole(RoleType value) {
            setRole(value);
            return this;
        }

        /**
         * Adds objects to the list of SupportedFunction using add method
         * 
         * @param values
         *     objects to add to the list SupportedFunction
         * @return
         *     The class instance
         */
        @Override
        public NodeManagementDetailedDiscoveryFeatureInformationType.Description withSupportedFunction(FunctionPropertyType... values) {
            if (values!= null) {
                for (FunctionPropertyType value: values) {
                    getSupportedFunction().add(value);
                }
            }
            return this;
        }

        /**
         * Adds objects to the list of SupportedFunction using addAll method
         * 
         * @param values
         *     objects to add to the list SupportedFunction
         * @return
         *     The class instance
         */
        @Override
        public NodeManagementDetailedDiscoveryFeatureInformationType.Description withSupportedFunction(Collection<FunctionPropertyType> values) {
            if (values!= null) {
                getSupportedFunction().addAll(values);
            }
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
        public NodeManagementDetailedDiscoveryFeatureInformationType.Description withLastStateChange(NetworkManagementStateChangeType value) {
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
        public NodeManagementDetailedDiscoveryFeatureInformationType.Description withMinimumTrustLevel(String value) {
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
        public NodeManagementDetailedDiscoveryFeatureInformationType.Description withLabel(String value) {
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
        public NodeManagementDetailedDiscoveryFeatureInformationType.Description withDescription(String value) {
            setDescription(value);
            return this;
        }

        /**
         * Sets the value of the maxResponseDelay property.
         * 
         * @param value
         *     allowed object is
         *     {@link Duration }
         * @return
         *     The class instance
         */
        @Override
        public NodeManagementDetailedDiscoveryFeatureInformationType.Description withMaxResponseDelay(Duration value) {
            setMaxResponseDelay(value);
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
            return new NodeManagementDetailedDiscoveryFeatureInformationType.Description();
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
