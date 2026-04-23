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
 * <p>Java class for NetworkManagementFeatureDescriptionDataElementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NetworkManagementFeatureDescriptionDataElementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="featureAddress" type="{http://docs.eebus.org/spine/xsd/v1}FeatureAddressElementsType" minOccurs="0"/&gt;
 *         &lt;element name="featureType" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="specificUsage" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="featureGroup" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="role" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="supportedFunction" type="{http://docs.eebus.org/spine/xsd/v1}FunctionPropertyElementsType" minOccurs="0"/&gt;
 *         &lt;element name="lastStateChange" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="minimumTrustLevel" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="label" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="maxResponseDelay" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkManagementFeatureDescriptionDataElementsType", propOrder = {
    "featureAddress",
    "featureType",
    "specificUsage",
    "featureGroup",
    "role",
    "supportedFunction",
    "lastStateChange",
    "minimumTrustLevel",
    "label",
    "description",
    "maxResponseDelay"
})
@XmlSeeAlso({
    org.openmuc.jeebus.spine.xsd.v1.NodeManagementDetailedDiscoveryFeatureInformationElementsType.Description.class
})
public class NetworkManagementFeatureDescriptionDataElementsType implements Cloneable, CopyTo, ToString
{

    protected FeatureAddressElementsType featureAddress;
    protected ElementTagType featureType;
    protected ElementTagType specificUsage;
    protected ElementTagType featureGroup;
    protected ElementTagType role;
    protected FunctionPropertyElementsType supportedFunction;
    protected ElementTagType lastStateChange;
    protected ElementTagType minimumTrustLevel;
    protected ElementTagType label;
    protected ElementTagType description;
    protected ElementTagType maxResponseDelay;

    /**
     * Default no-arg constructor
     * 
     */
    public NetworkManagementFeatureDescriptionDataElementsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public NetworkManagementFeatureDescriptionDataElementsType(final FeatureAddressElementsType featureAddress, final ElementTagType featureType, final ElementTagType specificUsage, final ElementTagType featureGroup, final ElementTagType role, final FunctionPropertyElementsType supportedFunction, final ElementTagType lastStateChange, final ElementTagType minimumTrustLevel, final ElementTagType label, final ElementTagType description, final ElementTagType maxResponseDelay) {
        this.featureAddress = featureAddress;
        this.featureType = featureType;
        this.specificUsage = specificUsage;
        this.featureGroup = featureGroup;
        this.role = role;
        this.supportedFunction = supportedFunction;
        this.lastStateChange = lastStateChange;
        this.minimumTrustLevel = minimumTrustLevel;
        this.label = label;
        this.description = description;
        this.maxResponseDelay = maxResponseDelay;
    }

    /**
     * Gets the value of the featureAddress property.
     * 
     * @return
     *     possible object is
     *     {@link FeatureAddressElementsType }
     *     
     */
    public FeatureAddressElementsType getFeatureAddress() {
        return featureAddress;
    }

    /**
     * Sets the value of the featureAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeatureAddressElementsType }
     *     
     */
    public void setFeatureAddress(FeatureAddressElementsType value) {
        this.featureAddress = value;
    }

    /**
     * Gets the value of the featureType property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getFeatureType() {
        return featureType;
    }

    /**
     * Sets the value of the featureType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setFeatureType(ElementTagType value) {
        this.featureType = value;
    }

    /**
     * Gets the value of the specificUsage property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getSpecificUsage() {
        return specificUsage;
    }

    /**
     * Sets the value of the specificUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setSpecificUsage(ElementTagType value) {
        this.specificUsage = value;
    }

    /**
     * Gets the value of the featureGroup property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getFeatureGroup() {
        return featureGroup;
    }

    /**
     * Sets the value of the featureGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setFeatureGroup(ElementTagType value) {
        this.featureGroup = value;
    }

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setRole(ElementTagType value) {
        this.role = value;
    }

    /**
     * Gets the value of the supportedFunction property.
     * 
     * @return
     *     possible object is
     *     {@link FunctionPropertyElementsType }
     *     
     */
    public FunctionPropertyElementsType getSupportedFunction() {
        return supportedFunction;
    }

    /**
     * Sets the value of the supportedFunction property.
     * 
     * @param value
     *     allowed object is
     *     {@link FunctionPropertyElementsType }
     *     
     */
    public void setSupportedFunction(FunctionPropertyElementsType value) {
        this.supportedFunction = value;
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
     * Gets the value of the maxResponseDelay property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getMaxResponseDelay() {
        return maxResponseDelay;
    }

    /**
     * Sets the value of the maxResponseDelay property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setMaxResponseDelay(ElementTagType value) {
        this.maxResponseDelay = value;
    }

    /**
     * Sets the value of the featureAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeatureAddressElementsType }
     * @return
     *     The class instance
     */
    public NetworkManagementFeatureDescriptionDataElementsType withFeatureAddress(FeatureAddressElementsType value) {
        setFeatureAddress(value);
        return this;
    }

    /**
     * Sets the value of the featureType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public NetworkManagementFeatureDescriptionDataElementsType withFeatureType(ElementTagType value) {
        setFeatureType(value);
        return this;
    }

    /**
     * Sets the value of the specificUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public NetworkManagementFeatureDescriptionDataElementsType withSpecificUsage(ElementTagType value) {
        setSpecificUsage(value);
        return this;
    }

    /**
     * Sets the value of the featureGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public NetworkManagementFeatureDescriptionDataElementsType withFeatureGroup(ElementTagType value) {
        setFeatureGroup(value);
        return this;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public NetworkManagementFeatureDescriptionDataElementsType withRole(ElementTagType value) {
        setRole(value);
        return this;
    }

    /**
     * Sets the value of the supportedFunction property.
     * 
     * @param value
     *     allowed object is
     *     {@link FunctionPropertyElementsType }
     * @return
     *     The class instance
     */
    public NetworkManagementFeatureDescriptionDataElementsType withSupportedFunction(FunctionPropertyElementsType value) {
        setSupportedFunction(value);
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
    public NetworkManagementFeatureDescriptionDataElementsType withLastStateChange(ElementTagType value) {
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
    public NetworkManagementFeatureDescriptionDataElementsType withMinimumTrustLevel(ElementTagType value) {
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
    public NetworkManagementFeatureDescriptionDataElementsType withLabel(ElementTagType value) {
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
    public NetworkManagementFeatureDescriptionDataElementsType withDescription(ElementTagType value) {
        setDescription(value);
        return this;
    }

    /**
     * Sets the value of the maxResponseDelay property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public NetworkManagementFeatureDescriptionDataElementsType withMaxResponseDelay(ElementTagType value) {
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
        if (draftCopy instanceof NetworkManagementFeatureDescriptionDataElementsType) {
            final NetworkManagementFeatureDescriptionDataElementsType copy = ((NetworkManagementFeatureDescriptionDataElementsType) draftCopy);
            {
                Boolean featureAddressShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.featureAddress!= null));
                if (featureAddressShouldBeCopiedAndSet == Boolean.TRUE) {
                    FeatureAddressElementsType sourceFeatureAddress;
                    sourceFeatureAddress = this.getFeatureAddress();
                    FeatureAddressElementsType copyFeatureAddress = ((FeatureAddressElementsType) strategy.copy(LocatorUtils.property(locator, "featureAddress", sourceFeatureAddress), sourceFeatureAddress, (this.featureAddress!= null)));
                    copy.setFeatureAddress(copyFeatureAddress);
                } else {
                    if (featureAddressShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.featureAddress = null;
                    }
                }
            }
            {
                Boolean featureTypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.featureType!= null));
                if (featureTypeShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceFeatureType;
                    sourceFeatureType = this.getFeatureType();
                    ElementTagType copyFeatureType = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "featureType", sourceFeatureType), sourceFeatureType, (this.featureType!= null)));
                    copy.setFeatureType(copyFeatureType);
                } else {
                    if (featureTypeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.featureType = null;
                    }
                }
            }
            {
                Boolean specificUsageShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.specificUsage!= null));
                if (specificUsageShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceSpecificUsage;
                    sourceSpecificUsage = this.getSpecificUsage();
                    ElementTagType copySpecificUsage = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "specificUsage", sourceSpecificUsage), sourceSpecificUsage, (this.specificUsage!= null)));
                    copy.setSpecificUsage(copySpecificUsage);
                } else {
                    if (specificUsageShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.specificUsage = null;
                    }
                }
            }
            {
                Boolean featureGroupShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.featureGroup!= null));
                if (featureGroupShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceFeatureGroup;
                    sourceFeatureGroup = this.getFeatureGroup();
                    ElementTagType copyFeatureGroup = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "featureGroup", sourceFeatureGroup), sourceFeatureGroup, (this.featureGroup!= null)));
                    copy.setFeatureGroup(copyFeatureGroup);
                } else {
                    if (featureGroupShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.featureGroup = null;
                    }
                }
            }
            {
                Boolean roleShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.role!= null));
                if (roleShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceRole;
                    sourceRole = this.getRole();
                    ElementTagType copyRole = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "role", sourceRole), sourceRole, (this.role!= null)));
                    copy.setRole(copyRole);
                } else {
                    if (roleShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.role = null;
                    }
                }
            }
            {
                Boolean supportedFunctionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.supportedFunction!= null));
                if (supportedFunctionShouldBeCopiedAndSet == Boolean.TRUE) {
                    FunctionPropertyElementsType sourceSupportedFunction;
                    sourceSupportedFunction = this.getSupportedFunction();
                    FunctionPropertyElementsType copySupportedFunction = ((FunctionPropertyElementsType) strategy.copy(LocatorUtils.property(locator, "supportedFunction", sourceSupportedFunction), sourceSupportedFunction, (this.supportedFunction!= null)));
                    copy.setSupportedFunction(copySupportedFunction);
                } else {
                    if (supportedFunctionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.supportedFunction = null;
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
            {
                Boolean maxResponseDelayShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.maxResponseDelay!= null));
                if (maxResponseDelayShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceMaxResponseDelay;
                    sourceMaxResponseDelay = this.getMaxResponseDelay();
                    ElementTagType copyMaxResponseDelay = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "maxResponseDelay", sourceMaxResponseDelay), sourceMaxResponseDelay, (this.maxResponseDelay!= null)));
                    copy.setMaxResponseDelay(copyMaxResponseDelay);
                } else {
                    if (maxResponseDelayShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.maxResponseDelay = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new NetworkManagementFeatureDescriptionDataElementsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final NetworkManagementFeatureDescriptionDataElementsType that = ((NetworkManagementFeatureDescriptionDataElementsType) object);
        {
            FeatureAddressElementsType leftFeatureAddress;
            leftFeatureAddress = this.getFeatureAddress();
            FeatureAddressElementsType rightFeatureAddress;
            rightFeatureAddress = that.getFeatureAddress();
            if (this.featureAddress!= null) {
                if (that.featureAddress!= null) {
                    if (!leftFeatureAddress.equals(rightFeatureAddress)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.featureAddress!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftFeatureType;
            leftFeatureType = this.getFeatureType();
            ElementTagType rightFeatureType;
            rightFeatureType = that.getFeatureType();
            if (this.featureType!= null) {
                if (that.featureType!= null) {
                    if (!leftFeatureType.equals(rightFeatureType)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.featureType!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftSpecificUsage;
            leftSpecificUsage = this.getSpecificUsage();
            ElementTagType rightSpecificUsage;
            rightSpecificUsage = that.getSpecificUsage();
            if (this.specificUsage!= null) {
                if (that.specificUsage!= null) {
                    if (!leftSpecificUsage.equals(rightSpecificUsage)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.specificUsage!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftFeatureGroup;
            leftFeatureGroup = this.getFeatureGroup();
            ElementTagType rightFeatureGroup;
            rightFeatureGroup = that.getFeatureGroup();
            if (this.featureGroup!= null) {
                if (that.featureGroup!= null) {
                    if (!leftFeatureGroup.equals(rightFeatureGroup)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.featureGroup!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftRole;
            leftRole = this.getRole();
            ElementTagType rightRole;
            rightRole = that.getRole();
            if (this.role!= null) {
                if (that.role!= null) {
                    if (!leftRole.equals(rightRole)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.role!= null) {
                    return false;
                }
            }
        }
        {
            FunctionPropertyElementsType leftSupportedFunction;
            leftSupportedFunction = this.getSupportedFunction();
            FunctionPropertyElementsType rightSupportedFunction;
            rightSupportedFunction = that.getSupportedFunction();
            if (this.supportedFunction!= null) {
                if (that.supportedFunction!= null) {
                    if (!leftSupportedFunction.equals(rightSupportedFunction)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.supportedFunction!= null) {
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
        {
            ElementTagType leftMaxResponseDelay;
            leftMaxResponseDelay = this.getMaxResponseDelay();
            ElementTagType rightMaxResponseDelay;
            rightMaxResponseDelay = that.getMaxResponseDelay();
            if (this.maxResponseDelay!= null) {
                if (that.maxResponseDelay!= null) {
                    if (!leftMaxResponseDelay.equals(rightMaxResponseDelay)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.maxResponseDelay!= null) {
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
            FeatureAddressElementsType theFeatureAddress;
            theFeatureAddress = this.getFeatureAddress();
            if (this.featureAddress!= null) {
                currentHashCode += theFeatureAddress.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theFeatureType;
            theFeatureType = this.getFeatureType();
            if (this.featureType!= null) {
                currentHashCode += theFeatureType.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theSpecificUsage;
            theSpecificUsage = this.getSpecificUsage();
            if (this.specificUsage!= null) {
                currentHashCode += theSpecificUsage.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theFeatureGroup;
            theFeatureGroup = this.getFeatureGroup();
            if (this.featureGroup!= null) {
                currentHashCode += theFeatureGroup.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theRole;
            theRole = this.getRole();
            if (this.role!= null) {
                currentHashCode += theRole.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            FunctionPropertyElementsType theSupportedFunction;
            theSupportedFunction = this.getSupportedFunction();
            if (this.supportedFunction!= null) {
                currentHashCode += theSupportedFunction.hashCode();
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
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theMaxResponseDelay;
            theMaxResponseDelay = this.getMaxResponseDelay();
            if (this.maxResponseDelay!= null) {
                currentHashCode += theMaxResponseDelay.hashCode();
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
            FeatureAddressElementsType theFeatureAddress;
            theFeatureAddress = this.getFeatureAddress();
            strategy.appendField(locator, this, "featureAddress", buffer, theFeatureAddress, (this.featureAddress!= null));
        }
        {
            ElementTagType theFeatureType;
            theFeatureType = this.getFeatureType();
            strategy.appendField(locator, this, "featureType", buffer, theFeatureType, (this.featureType!= null));
        }
        {
            ElementTagType theSpecificUsage;
            theSpecificUsage = this.getSpecificUsage();
            strategy.appendField(locator, this, "specificUsage", buffer, theSpecificUsage, (this.specificUsage!= null));
        }
        {
            ElementTagType theFeatureGroup;
            theFeatureGroup = this.getFeatureGroup();
            strategy.appendField(locator, this, "featureGroup", buffer, theFeatureGroup, (this.featureGroup!= null));
        }
        {
            ElementTagType theRole;
            theRole = this.getRole();
            strategy.appendField(locator, this, "role", buffer, theRole, (this.role!= null));
        }
        {
            FunctionPropertyElementsType theSupportedFunction;
            theSupportedFunction = this.getSupportedFunction();
            strategy.appendField(locator, this, "supportedFunction", buffer, theSupportedFunction, (this.supportedFunction!= null));
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
        {
            ElementTagType theMaxResponseDelay;
            theMaxResponseDelay = this.getMaxResponseDelay();
            strategy.appendField(locator, this, "maxResponseDelay", buffer, theMaxResponseDelay, (this.maxResponseDelay!= null));
        }
        return buffer;
    }

}
