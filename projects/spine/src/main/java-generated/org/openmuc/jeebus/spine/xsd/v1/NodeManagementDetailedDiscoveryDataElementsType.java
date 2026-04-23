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
 * <p>Java class for NodeManagementDetailedDiscoveryDataElementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NodeManagementDetailedDiscoveryDataElementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="specificationVersionList" type="{http://docs.eebus.org/spine/xsd/v1}NodeManagementSpecificationVersionListElementsType" minOccurs="0"/&gt;
 *         &lt;element name="deviceInformation" type="{http://docs.eebus.org/spine/xsd/v1}NodeManagementDetailedDiscoveryDeviceInformationElementsType" minOccurs="0"/&gt;
 *         &lt;element name="entityInformation" type="{http://docs.eebus.org/spine/xsd/v1}NodeManagementDetailedDiscoveryEntityInformationElementsType" minOccurs="0"/&gt;
 *         &lt;element name="featureInformation" type="{http://docs.eebus.org/spine/xsd/v1}NodeManagementDetailedDiscoveryFeatureInformationElementsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NodeManagementDetailedDiscoveryDataElementsType", propOrder = {
    "specificationVersionList",
    "deviceInformation",
    "entityInformation",
    "featureInformation"
})
public class NodeManagementDetailedDiscoveryDataElementsType implements Cloneable, CopyTo, ToString
{

    protected NodeManagementSpecificationVersionListElementsType specificationVersionList;
    protected NodeManagementDetailedDiscoveryDeviceInformationElementsType deviceInformation;
    protected NodeManagementDetailedDiscoveryEntityInformationElementsType entityInformation;
    protected NodeManagementDetailedDiscoveryFeatureInformationElementsType featureInformation;

    /**
     * Default no-arg constructor
     * 
     */
    public NodeManagementDetailedDiscoveryDataElementsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public NodeManagementDetailedDiscoveryDataElementsType(final NodeManagementSpecificationVersionListElementsType specificationVersionList, final NodeManagementDetailedDiscoveryDeviceInformationElementsType deviceInformation, final NodeManagementDetailedDiscoveryEntityInformationElementsType entityInformation, final NodeManagementDetailedDiscoveryFeatureInformationElementsType featureInformation) {
        this.specificationVersionList = specificationVersionList;
        this.deviceInformation = deviceInformation;
        this.entityInformation = entityInformation;
        this.featureInformation = featureInformation;
    }

    /**
     * Gets the value of the specificationVersionList property.
     * 
     * @return
     *     possible object is
     *     {@link NodeManagementSpecificationVersionListElementsType }
     *     
     */
    public NodeManagementSpecificationVersionListElementsType getSpecificationVersionList() {
        return specificationVersionList;
    }

    /**
     * Sets the value of the specificationVersionList property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeManagementSpecificationVersionListElementsType }
     *     
     */
    public void setSpecificationVersionList(NodeManagementSpecificationVersionListElementsType value) {
        this.specificationVersionList = value;
    }

    /**
     * Gets the value of the deviceInformation property.
     * 
     * @return
     *     possible object is
     *     {@link NodeManagementDetailedDiscoveryDeviceInformationElementsType }
     *     
     */
    public NodeManagementDetailedDiscoveryDeviceInformationElementsType getDeviceInformation() {
        return deviceInformation;
    }

    /**
     * Sets the value of the deviceInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeManagementDetailedDiscoveryDeviceInformationElementsType }
     *     
     */
    public void setDeviceInformation(NodeManagementDetailedDiscoveryDeviceInformationElementsType value) {
        this.deviceInformation = value;
    }

    /**
     * Gets the value of the entityInformation property.
     * 
     * @return
     *     possible object is
     *     {@link NodeManagementDetailedDiscoveryEntityInformationElementsType }
     *     
     */
    public NodeManagementDetailedDiscoveryEntityInformationElementsType getEntityInformation() {
        return entityInformation;
    }

    /**
     * Sets the value of the entityInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeManagementDetailedDiscoveryEntityInformationElementsType }
     *     
     */
    public void setEntityInformation(NodeManagementDetailedDiscoveryEntityInformationElementsType value) {
        this.entityInformation = value;
    }

    /**
     * Gets the value of the featureInformation property.
     * 
     * @return
     *     possible object is
     *     {@link NodeManagementDetailedDiscoveryFeatureInformationElementsType }
     *     
     */
    public NodeManagementDetailedDiscoveryFeatureInformationElementsType getFeatureInformation() {
        return featureInformation;
    }

    /**
     * Sets the value of the featureInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeManagementDetailedDiscoveryFeatureInformationElementsType }
     *     
     */
    public void setFeatureInformation(NodeManagementDetailedDiscoveryFeatureInformationElementsType value) {
        this.featureInformation = value;
    }

    /**
     * Sets the value of the specificationVersionList property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeManagementSpecificationVersionListElementsType }
     * @return
     *     The class instance
     */
    public NodeManagementDetailedDiscoveryDataElementsType withSpecificationVersionList(NodeManagementSpecificationVersionListElementsType value) {
        setSpecificationVersionList(value);
        return this;
    }

    /**
     * Sets the value of the deviceInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeManagementDetailedDiscoveryDeviceInformationElementsType }
     * @return
     *     The class instance
     */
    public NodeManagementDetailedDiscoveryDataElementsType withDeviceInformation(NodeManagementDetailedDiscoveryDeviceInformationElementsType value) {
        setDeviceInformation(value);
        return this;
    }

    /**
     * Sets the value of the entityInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeManagementDetailedDiscoveryEntityInformationElementsType }
     * @return
     *     The class instance
     */
    public NodeManagementDetailedDiscoveryDataElementsType withEntityInformation(NodeManagementDetailedDiscoveryEntityInformationElementsType value) {
        setEntityInformation(value);
        return this;
    }

    /**
     * Sets the value of the featureInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeManagementDetailedDiscoveryFeatureInformationElementsType }
     * @return
     *     The class instance
     */
    public NodeManagementDetailedDiscoveryDataElementsType withFeatureInformation(NodeManagementDetailedDiscoveryFeatureInformationElementsType value) {
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
        if (draftCopy instanceof NodeManagementDetailedDiscoveryDataElementsType) {
            final NodeManagementDetailedDiscoveryDataElementsType copy = ((NodeManagementDetailedDiscoveryDataElementsType) draftCopy);
            {
                Boolean specificationVersionListShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.specificationVersionList!= null));
                if (specificationVersionListShouldBeCopiedAndSet == Boolean.TRUE) {
                    NodeManagementSpecificationVersionListElementsType sourceSpecificationVersionList;
                    sourceSpecificationVersionList = this.getSpecificationVersionList();
                    NodeManagementSpecificationVersionListElementsType copySpecificationVersionList = ((NodeManagementSpecificationVersionListElementsType) strategy.copy(LocatorUtils.property(locator, "specificationVersionList", sourceSpecificationVersionList), sourceSpecificationVersionList, (this.specificationVersionList!= null)));
                    copy.setSpecificationVersionList(copySpecificationVersionList);
                } else {
                    if (specificationVersionListShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.specificationVersionList = null;
                    }
                }
            }
            {
                Boolean deviceInformationShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.deviceInformation!= null));
                if (deviceInformationShouldBeCopiedAndSet == Boolean.TRUE) {
                    NodeManagementDetailedDiscoveryDeviceInformationElementsType sourceDeviceInformation;
                    sourceDeviceInformation = this.getDeviceInformation();
                    NodeManagementDetailedDiscoveryDeviceInformationElementsType copyDeviceInformation = ((NodeManagementDetailedDiscoveryDeviceInformationElementsType) strategy.copy(LocatorUtils.property(locator, "deviceInformation", sourceDeviceInformation), sourceDeviceInformation, (this.deviceInformation!= null)));
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
                    NodeManagementDetailedDiscoveryEntityInformationElementsType sourceEntityInformation;
                    sourceEntityInformation = this.getEntityInformation();
                    NodeManagementDetailedDiscoveryEntityInformationElementsType copyEntityInformation = ((NodeManagementDetailedDiscoveryEntityInformationElementsType) strategy.copy(LocatorUtils.property(locator, "entityInformation", sourceEntityInformation), sourceEntityInformation, (this.entityInformation!= null)));
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
                    NodeManagementDetailedDiscoveryFeatureInformationElementsType sourceFeatureInformation;
                    sourceFeatureInformation = this.getFeatureInformation();
                    NodeManagementDetailedDiscoveryFeatureInformationElementsType copyFeatureInformation = ((NodeManagementDetailedDiscoveryFeatureInformationElementsType) strategy.copy(LocatorUtils.property(locator, "featureInformation", sourceFeatureInformation), sourceFeatureInformation, (this.featureInformation!= null)));
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
        return new NodeManagementDetailedDiscoveryDataElementsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final NodeManagementDetailedDiscoveryDataElementsType that = ((NodeManagementDetailedDiscoveryDataElementsType) object);
        {
            NodeManagementSpecificationVersionListElementsType leftSpecificationVersionList;
            leftSpecificationVersionList = this.getSpecificationVersionList();
            NodeManagementSpecificationVersionListElementsType rightSpecificationVersionList;
            rightSpecificationVersionList = that.getSpecificationVersionList();
            if (this.specificationVersionList!= null) {
                if (that.specificationVersionList!= null) {
                    if (!leftSpecificationVersionList.equals(rightSpecificationVersionList)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.specificationVersionList!= null) {
                    return false;
                }
            }
        }
        {
            NodeManagementDetailedDiscoveryDeviceInformationElementsType leftDeviceInformation;
            leftDeviceInformation = this.getDeviceInformation();
            NodeManagementDetailedDiscoveryDeviceInformationElementsType rightDeviceInformation;
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
            NodeManagementDetailedDiscoveryEntityInformationElementsType leftEntityInformation;
            leftEntityInformation = this.getEntityInformation();
            NodeManagementDetailedDiscoveryEntityInformationElementsType rightEntityInformation;
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
            NodeManagementDetailedDiscoveryFeatureInformationElementsType leftFeatureInformation;
            leftFeatureInformation = this.getFeatureInformation();
            NodeManagementDetailedDiscoveryFeatureInformationElementsType rightFeatureInformation;
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
            NodeManagementSpecificationVersionListElementsType theSpecificationVersionList;
            theSpecificationVersionList = this.getSpecificationVersionList();
            if (this.specificationVersionList!= null) {
                currentHashCode += theSpecificationVersionList.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            NodeManagementDetailedDiscoveryDeviceInformationElementsType theDeviceInformation;
            theDeviceInformation = this.getDeviceInformation();
            if (this.deviceInformation!= null) {
                currentHashCode += theDeviceInformation.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            NodeManagementDetailedDiscoveryEntityInformationElementsType theEntityInformation;
            theEntityInformation = this.getEntityInformation();
            if (this.entityInformation!= null) {
                currentHashCode += theEntityInformation.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            NodeManagementDetailedDiscoveryFeatureInformationElementsType theFeatureInformation;
            theFeatureInformation = this.getFeatureInformation();
            if (this.featureInformation!= null) {
                currentHashCode += theFeatureInformation.hashCode();
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
            NodeManagementSpecificationVersionListElementsType theSpecificationVersionList;
            theSpecificationVersionList = this.getSpecificationVersionList();
            strategy.appendField(locator, this, "specificationVersionList", buffer, theSpecificationVersionList, (this.specificationVersionList!= null));
        }
        {
            NodeManagementDetailedDiscoveryDeviceInformationElementsType theDeviceInformation;
            theDeviceInformation = this.getDeviceInformation();
            strategy.appendField(locator, this, "deviceInformation", buffer, theDeviceInformation, (this.deviceInformation!= null));
        }
        {
            NodeManagementDetailedDiscoveryEntityInformationElementsType theEntityInformation;
            theEntityInformation = this.getEntityInformation();
            strategy.appendField(locator, this, "entityInformation", buffer, theEntityInformation, (this.entityInformation!= null));
        }
        {
            NodeManagementDetailedDiscoveryFeatureInformationElementsType theFeatureInformation;
            theFeatureInformation = this.getFeatureInformation();
            strategy.appendField(locator, this, "featureInformation", buffer, theFeatureInformation, (this.featureInformation!= null));
        }
        return buffer;
    }

}
