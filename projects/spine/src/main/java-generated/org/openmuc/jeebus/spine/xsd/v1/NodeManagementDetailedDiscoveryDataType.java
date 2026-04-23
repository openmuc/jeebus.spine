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

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
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
 * <p>Java class for NodeManagementDetailedDiscoveryDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NodeManagementDetailedDiscoveryDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="specificationVersionList" type="{http://docs.eebus.org/spine/xsd/v1}NodeManagementSpecificationVersionListType" minOccurs="0"/&gt;
 *         &lt;element name="deviceInformation" type="{http://docs.eebus.org/spine/xsd/v1}NodeManagementDetailedDiscoveryDeviceInformationType" minOccurs="0"/&gt;
 *         &lt;element name="entityInformation" type="{http://docs.eebus.org/spine/xsd/v1}NodeManagementDetailedDiscoveryEntityInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="featureInformation" type="{http://docs.eebus.org/spine/xsd/v1}NodeManagementDetailedDiscoveryFeatureInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NodeManagementDetailedDiscoveryDataType", propOrder = {
    "specificationVersionList",
    "deviceInformation",
    "entityInformation",
    "featureInformation"
})
public class NodeManagementDetailedDiscoveryDataType implements Cloneable, CopyTo, ToString
{

    protected NodeManagementSpecificationVersionListType specificationVersionList;
    protected NodeManagementDetailedDiscoveryDeviceInformationType deviceInformation;
    protected List<NodeManagementDetailedDiscoveryEntityInformationType> entityInformation;
    protected List<NodeManagementDetailedDiscoveryFeatureInformationType> featureInformation;

    /**
     * Default no-arg constructor
     * 
     */
    public NodeManagementDetailedDiscoveryDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public NodeManagementDetailedDiscoveryDataType(final NodeManagementSpecificationVersionListType specificationVersionList, final NodeManagementDetailedDiscoveryDeviceInformationType deviceInformation, final List<NodeManagementDetailedDiscoveryEntityInformationType> entityInformation, final List<NodeManagementDetailedDiscoveryFeatureInformationType> featureInformation) {
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
     *     {@link NodeManagementSpecificationVersionListType }
     *     
     */
    public NodeManagementSpecificationVersionListType getSpecificationVersionList() {
        return specificationVersionList;
    }

    /**
     * Sets the value of the specificationVersionList property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeManagementSpecificationVersionListType }
     *     
     */
    public void setSpecificationVersionList(NodeManagementSpecificationVersionListType value) {
        this.specificationVersionList = value;
    }

    /**
     * Gets the value of the deviceInformation property.
     * 
     * @return
     *     possible object is
     *     {@link NodeManagementDetailedDiscoveryDeviceInformationType }
     *     
     */
    public NodeManagementDetailedDiscoveryDeviceInformationType getDeviceInformation() {
        return deviceInformation;
    }

    /**
     * Sets the value of the deviceInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeManagementDetailedDiscoveryDeviceInformationType }
     *     
     */
    public void setDeviceInformation(NodeManagementDetailedDiscoveryDeviceInformationType value) {
        this.deviceInformation = value;
    }

    /**
     * Gets the value of the entityInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the entityInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntityInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NodeManagementDetailedDiscoveryEntityInformationType }
     * 
     * 
     */
    public List<NodeManagementDetailedDiscoveryEntityInformationType> getEntityInformation() {
        if (entityInformation == null) {
            entityInformation = new ArrayList<NodeManagementDetailedDiscoveryEntityInformationType>();
        }
        return this.entityInformation;
    }

    /**
     * Gets the value of the featureInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the featureInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeatureInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NodeManagementDetailedDiscoveryFeatureInformationType }
     * 
     * 
     */
    public List<NodeManagementDetailedDiscoveryFeatureInformationType> getFeatureInformation() {
        if (featureInformation == null) {
            featureInformation = new ArrayList<NodeManagementDetailedDiscoveryFeatureInformationType>();
        }
        return this.featureInformation;
    }

    /**
     * Sets the value of the specificationVersionList property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeManagementSpecificationVersionListType }
     * @return
     *     The class instance
     */
    public NodeManagementDetailedDiscoveryDataType withSpecificationVersionList(NodeManagementSpecificationVersionListType value) {
        setSpecificationVersionList(value);
        return this;
    }

    /**
     * Sets the value of the deviceInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeManagementDetailedDiscoveryDeviceInformationType }
     * @return
     *     The class instance
     */
    public NodeManagementDetailedDiscoveryDataType withDeviceInformation(NodeManagementDetailedDiscoveryDeviceInformationType value) {
        setDeviceInformation(value);
        return this;
    }

    /**
     * Adds objects to the list of EntityInformation using add method
     * 
     * @param values
     *     objects to add to the list EntityInformation
     * @return
     *     The class instance
     */
    public NodeManagementDetailedDiscoveryDataType withEntityInformation(NodeManagementDetailedDiscoveryEntityInformationType... values) {
        if (values!= null) {
            for (NodeManagementDetailedDiscoveryEntityInformationType value: values) {
                getEntityInformation().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of EntityInformation using addAll method
     * 
     * @param values
     *     objects to add to the list EntityInformation
     * @return
     *     The class instance
     */
    public NodeManagementDetailedDiscoveryDataType withEntityInformation(Collection<NodeManagementDetailedDiscoveryEntityInformationType> values) {
        if (values!= null) {
            getEntityInformation().addAll(values);
        }
        return this;
    }

    /**
     * Adds objects to the list of FeatureInformation using add method
     * 
     * @param values
     *     objects to add to the list FeatureInformation
     * @return
     *     The class instance
     */
    public NodeManagementDetailedDiscoveryDataType withFeatureInformation(NodeManagementDetailedDiscoveryFeatureInformationType... values) {
        if (values!= null) {
            for (NodeManagementDetailedDiscoveryFeatureInformationType value: values) {
                getFeatureInformation().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of FeatureInformation using addAll method
     * 
     * @param values
     *     objects to add to the list FeatureInformation
     * @return
     *     The class instance
     */
    public NodeManagementDetailedDiscoveryDataType withFeatureInformation(Collection<NodeManagementDetailedDiscoveryFeatureInformationType> values) {
        if (values!= null) {
            getFeatureInformation().addAll(values);
        }
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
        if (draftCopy instanceof NodeManagementDetailedDiscoveryDataType) {
            final NodeManagementDetailedDiscoveryDataType copy = ((NodeManagementDetailedDiscoveryDataType) draftCopy);
            {
                Boolean specificationVersionListShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.specificationVersionList!= null));
                if (specificationVersionListShouldBeCopiedAndSet == Boolean.TRUE) {
                    NodeManagementSpecificationVersionListType sourceSpecificationVersionList;
                    sourceSpecificationVersionList = this.getSpecificationVersionList();
                    NodeManagementSpecificationVersionListType copySpecificationVersionList = ((NodeManagementSpecificationVersionListType) strategy.copy(LocatorUtils.property(locator, "specificationVersionList", sourceSpecificationVersionList), sourceSpecificationVersionList, (this.specificationVersionList!= null)));
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
                    NodeManagementDetailedDiscoveryDeviceInformationType sourceDeviceInformation;
                    sourceDeviceInformation = this.getDeviceInformation();
                    NodeManagementDetailedDiscoveryDeviceInformationType copyDeviceInformation = ((NodeManagementDetailedDiscoveryDeviceInformationType) strategy.copy(LocatorUtils.property(locator, "deviceInformation", sourceDeviceInformation), sourceDeviceInformation, (this.deviceInformation!= null)));
                    copy.setDeviceInformation(copyDeviceInformation);
                } else {
                    if (deviceInformationShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.deviceInformation = null;
                    }
                }
            }
            {
                Boolean entityInformationShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.entityInformation!= null)&&(!this.entityInformation.isEmpty())));
                if (entityInformationShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<NodeManagementDetailedDiscoveryEntityInformationType> sourceEntityInformation;
                    sourceEntityInformation = (((this.entityInformation!= null)&&(!this.entityInformation.isEmpty()))?this.getEntityInformation():null);
                    @SuppressWarnings("unchecked")
                    List<NodeManagementDetailedDiscoveryEntityInformationType> copyEntityInformation = ((List<NodeManagementDetailedDiscoveryEntityInformationType> ) strategy.copy(LocatorUtils.property(locator, "entityInformation", sourceEntityInformation), sourceEntityInformation, ((this.entityInformation!= null)&&(!this.entityInformation.isEmpty()))));
                    copy.entityInformation = null;
                    if (copyEntityInformation!= null) {
                        List<NodeManagementDetailedDiscoveryEntityInformationType> uniqueEntityInformationl = copy.getEntityInformation();
                        uniqueEntityInformationl.addAll(copyEntityInformation);
                    }
                } else {
                    if (entityInformationShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.entityInformation = null;
                    }
                }
            }
            {
                Boolean featureInformationShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.featureInformation!= null)&&(!this.featureInformation.isEmpty())));
                if (featureInformationShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<NodeManagementDetailedDiscoveryFeatureInformationType> sourceFeatureInformation;
                    sourceFeatureInformation = (((this.featureInformation!= null)&&(!this.featureInformation.isEmpty()))?this.getFeatureInformation():null);
                    @SuppressWarnings("unchecked")
                    List<NodeManagementDetailedDiscoveryFeatureInformationType> copyFeatureInformation = ((List<NodeManagementDetailedDiscoveryFeatureInformationType> ) strategy.copy(LocatorUtils.property(locator, "featureInformation", sourceFeatureInformation), sourceFeatureInformation, ((this.featureInformation!= null)&&(!this.featureInformation.isEmpty()))));
                    copy.featureInformation = null;
                    if (copyFeatureInformation!= null) {
                        List<NodeManagementDetailedDiscoveryFeatureInformationType> uniqueFeatureInformationl = copy.getFeatureInformation();
                        uniqueFeatureInformationl.addAll(copyFeatureInformation);
                    }
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
        return new NodeManagementDetailedDiscoveryDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final NodeManagementDetailedDiscoveryDataType that = ((NodeManagementDetailedDiscoveryDataType) object);
        {
            NodeManagementSpecificationVersionListType leftSpecificationVersionList;
            leftSpecificationVersionList = this.getSpecificationVersionList();
            NodeManagementSpecificationVersionListType rightSpecificationVersionList;
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
            NodeManagementDetailedDiscoveryDeviceInformationType leftDeviceInformation;
            leftDeviceInformation = this.getDeviceInformation();
            NodeManagementDetailedDiscoveryDeviceInformationType rightDeviceInformation;
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
            List<NodeManagementDetailedDiscoveryEntityInformationType> leftEntityInformation;
            leftEntityInformation = (((this.entityInformation!= null)&&(!this.entityInformation.isEmpty()))?this.getEntityInformation():null);
            List<NodeManagementDetailedDiscoveryEntityInformationType> rightEntityInformation;
            rightEntityInformation = (((that.entityInformation!= null)&&(!that.entityInformation.isEmpty()))?that.getEntityInformation():null);
            if ((this.entityInformation!= null)&&(!this.entityInformation.isEmpty())) {
                if ((that.entityInformation!= null)&&(!that.entityInformation.isEmpty())) {
                    if (!leftEntityInformation.equals(rightEntityInformation)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.entityInformation!= null)&&(!that.entityInformation.isEmpty())) {
                    return false;
                }
            }
        }
        {
            List<NodeManagementDetailedDiscoveryFeatureInformationType> leftFeatureInformation;
            leftFeatureInformation = (((this.featureInformation!= null)&&(!this.featureInformation.isEmpty()))?this.getFeatureInformation():null);
            List<NodeManagementDetailedDiscoveryFeatureInformationType> rightFeatureInformation;
            rightFeatureInformation = (((that.featureInformation!= null)&&(!that.featureInformation.isEmpty()))?that.getFeatureInformation():null);
            if ((this.featureInformation!= null)&&(!this.featureInformation.isEmpty())) {
                if ((that.featureInformation!= null)&&(!that.featureInformation.isEmpty())) {
                    if (!leftFeatureInformation.equals(rightFeatureInformation)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.featureInformation!= null)&&(!that.featureInformation.isEmpty())) {
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
            NodeManagementSpecificationVersionListType theSpecificationVersionList;
            theSpecificationVersionList = this.getSpecificationVersionList();
            if (this.specificationVersionList!= null) {
                currentHashCode += theSpecificationVersionList.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            NodeManagementDetailedDiscoveryDeviceInformationType theDeviceInformation;
            theDeviceInformation = this.getDeviceInformation();
            if (this.deviceInformation!= null) {
                currentHashCode += theDeviceInformation.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            List<NodeManagementDetailedDiscoveryEntityInformationType> theEntityInformation;
            theEntityInformation = (((this.entityInformation!= null)&&(!this.entityInformation.isEmpty()))?this.getEntityInformation():null);
            if ((this.entityInformation!= null)&&(!this.entityInformation.isEmpty())) {
                currentHashCode += theEntityInformation.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            List<NodeManagementDetailedDiscoveryFeatureInformationType> theFeatureInformation;
            theFeatureInformation = (((this.featureInformation!= null)&&(!this.featureInformation.isEmpty()))?this.getFeatureInformation():null);
            if ((this.featureInformation!= null)&&(!this.featureInformation.isEmpty())) {
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
            NodeManagementSpecificationVersionListType theSpecificationVersionList;
            theSpecificationVersionList = this.getSpecificationVersionList();
            strategy.appendField(locator, this, "specificationVersionList", buffer, theSpecificationVersionList, (this.specificationVersionList!= null));
        }
        {
            NodeManagementDetailedDiscoveryDeviceInformationType theDeviceInformation;
            theDeviceInformation = this.getDeviceInformation();
            strategy.appendField(locator, this, "deviceInformation", buffer, theDeviceInformation, (this.deviceInformation!= null));
        }
        {
            List<NodeManagementDetailedDiscoveryEntityInformationType> theEntityInformation;
            theEntityInformation = (((this.entityInformation!= null)&&(!this.entityInformation.isEmpty()))?this.getEntityInformation():null);
            strategy.appendField(locator, this, "entityInformation", buffer, theEntityInformation, ((this.entityInformation!= null)&&(!this.entityInformation.isEmpty())));
        }
        {
            List<NodeManagementDetailedDiscoveryFeatureInformationType> theFeatureInformation;
            theFeatureInformation = (((this.featureInformation!= null)&&(!this.featureInformation.isEmpty()))?this.getFeatureInformation():null);
            strategy.appendField(locator, this, "featureInformation", buffer, theFeatureInformation, ((this.featureInformation!= null)&&(!this.featureInformation.isEmpty())));
        }
        return buffer;
    }

}
