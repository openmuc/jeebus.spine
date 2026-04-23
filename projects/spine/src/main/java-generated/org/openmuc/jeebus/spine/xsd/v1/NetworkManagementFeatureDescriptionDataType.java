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
import java.util.ListIterator;
import javax.xml.datatype.Duration;
import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
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
 * <p>Java class for NetworkManagementFeatureDescriptionDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NetworkManagementFeatureDescriptionDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="featureAddress" type="{http://docs.eebus.org/spine/xsd/v1}FeatureAddressType" minOccurs="0"/&gt;
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
@XmlType(name = "NetworkManagementFeatureDescriptionDataType", propOrder = {
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
    org.openmuc.jeebus.spine.xsd.v1.NodeManagementDetailedDiscoveryFeatureInformationType.Description.class
})
public class NetworkManagementFeatureDescriptionDataType implements Cloneable, CopyTo, ToString
{

    protected FeatureAddressType featureAddress;
    protected String featureType;
    @XmlElementRef(name = "specificUsage", namespace = "http://docs.eebus.org/spine/xsd/v1", type = JAXBElement.class, required = false)
    protected List<JAXBElement<List<String>>> specificUsage;
    protected String featureGroup;
    @XmlSchemaType(name = "string")
    protected RoleType role;
    protected List<FunctionPropertyType> supportedFunction;
    @XmlSchemaType(name = "string")
    protected NetworkManagementStateChangeType lastStateChange;
    protected String minimumTrustLevel;
    protected String label;
    protected String description;
    protected Duration maxResponseDelay;

    /**
     * Default no-arg constructor
     * 
     */
    public NetworkManagementFeatureDescriptionDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public NetworkManagementFeatureDescriptionDataType(final FeatureAddressType featureAddress, final String featureType, final List<JAXBElement<List<String>>> specificUsage, final String featureGroup, final RoleType role, final List<FunctionPropertyType> supportedFunction, final NetworkManagementStateChangeType lastStateChange, final String minimumTrustLevel, final String label, final String description, final Duration maxResponseDelay) {
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
     *     {@link FeatureAddressType }
     *     
     */
    public FeatureAddressType getFeatureAddress() {
        return featureAddress;
    }

    /**
     * Sets the value of the featureAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeatureAddressType }
     *     
     */
    public void setFeatureAddress(FeatureAddressType value) {
        this.featureAddress = value;
    }

    /**
     * Gets the value of the featureType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeatureType() {
        return featureType;
    }

    /**
     * Sets the value of the featureType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeatureType(String value) {
        this.featureType = value;
    }

    /**
     * Gets the value of the specificUsage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the specificUsage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecificUsage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}
     * 
     * 
     */
    public List<JAXBElement<List<String>>> getSpecificUsage() {
        if (specificUsage == null) {
            specificUsage = new ArrayList<JAXBElement<List<String>>>();
        }
        return this.specificUsage;
    }

    /**
     * Gets the value of the featureGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeatureGroup() {
        return featureGroup;
    }

    /**
     * Sets the value of the featureGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeatureGroup(String value) {
        this.featureGroup = value;
    }

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link RoleType }
     *     
     */
    public RoleType getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoleType }
     *     
     */
    public void setRole(RoleType value) {
        this.role = value;
    }

    /**
     * Gets the value of the supportedFunction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the supportedFunction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupportedFunction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FunctionPropertyType }
     * 
     * 
     */
    public List<FunctionPropertyType> getSupportedFunction() {
        if (supportedFunction == null) {
            supportedFunction = new ArrayList<FunctionPropertyType>();
        }
        return this.supportedFunction;
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
     * Gets the value of the maxResponseDelay property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMaxResponseDelay() {
        return maxResponseDelay;
    }

    /**
     * Sets the value of the maxResponseDelay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setMaxResponseDelay(Duration value) {
        this.maxResponseDelay = value;
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
    public NetworkManagementFeatureDescriptionDataType withFeatureAddress(FeatureAddressType value) {
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
    public NetworkManagementFeatureDescriptionDataType withFeatureType(String value) {
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
    public NetworkManagementFeatureDescriptionDataType withSpecificUsage(JAXBElement<List<String>> ... values) {
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
    public NetworkManagementFeatureDescriptionDataType withSpecificUsage(Collection<JAXBElement<List<String>>> values) {
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
    public NetworkManagementFeatureDescriptionDataType withFeatureGroup(String value) {
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
    public NetworkManagementFeatureDescriptionDataType withRole(RoleType value) {
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
    public NetworkManagementFeatureDescriptionDataType withSupportedFunction(FunctionPropertyType... values) {
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
    public NetworkManagementFeatureDescriptionDataType withSupportedFunction(Collection<FunctionPropertyType> values) {
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
    public NetworkManagementFeatureDescriptionDataType withLastStateChange(NetworkManagementStateChangeType value) {
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
    public NetworkManagementFeatureDescriptionDataType withMinimumTrustLevel(String value) {
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
    public NetworkManagementFeatureDescriptionDataType withLabel(String value) {
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
    public NetworkManagementFeatureDescriptionDataType withDescription(String value) {
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
    public NetworkManagementFeatureDescriptionDataType withMaxResponseDelay(Duration value) {
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
        if (draftCopy instanceof NetworkManagementFeatureDescriptionDataType) {
            final NetworkManagementFeatureDescriptionDataType copy = ((NetworkManagementFeatureDescriptionDataType) draftCopy);
            {
                Boolean featureAddressShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.featureAddress!= null));
                if (featureAddressShouldBeCopiedAndSet == Boolean.TRUE) {
                    FeatureAddressType sourceFeatureAddress;
                    sourceFeatureAddress = this.getFeatureAddress();
                    FeatureAddressType copyFeatureAddress = ((FeatureAddressType) strategy.copy(LocatorUtils.property(locator, "featureAddress", sourceFeatureAddress), sourceFeatureAddress, (this.featureAddress!= null)));
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
                    String sourceFeatureType;
                    sourceFeatureType = this.getFeatureType();
                    String copyFeatureType = ((String) strategy.copy(LocatorUtils.property(locator, "featureType", sourceFeatureType), sourceFeatureType, (this.featureType!= null)));
                    copy.setFeatureType(copyFeatureType);
                } else {
                    if (featureTypeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.featureType = null;
                    }
                }
            }
            {
                Boolean specificUsageShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.specificUsage!= null)&&(!this.specificUsage.isEmpty())));
                if (specificUsageShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<JAXBElement<List<String>>> sourceSpecificUsage;
                    sourceSpecificUsage = (((this.specificUsage!= null)&&(!this.specificUsage.isEmpty()))?this.getSpecificUsage():null);
                    @SuppressWarnings("unchecked")
                    List<JAXBElement<List<String>>> copySpecificUsage = ((List<JAXBElement<List<String>>> ) strategy.copy(LocatorUtils.property(locator, "specificUsage", sourceSpecificUsage), sourceSpecificUsage, ((this.specificUsage!= null)&&(!this.specificUsage.isEmpty()))));
                    copy.specificUsage = null;
                    if (copySpecificUsage!= null) {
                        List<JAXBElement<List<String>>> uniqueSpecificUsagel = copy.getSpecificUsage();
                        uniqueSpecificUsagel.addAll(copySpecificUsage);
                    }
                } else {
                    if (specificUsageShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.specificUsage = null;
                    }
                }
            }
            {
                Boolean featureGroupShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.featureGroup!= null));
                if (featureGroupShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceFeatureGroup;
                    sourceFeatureGroup = this.getFeatureGroup();
                    String copyFeatureGroup = ((String) strategy.copy(LocatorUtils.property(locator, "featureGroup", sourceFeatureGroup), sourceFeatureGroup, (this.featureGroup!= null)));
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
                    RoleType sourceRole;
                    sourceRole = this.getRole();
                    RoleType copyRole = ((RoleType) strategy.copy(LocatorUtils.property(locator, "role", sourceRole), sourceRole, (this.role!= null)));
                    copy.setRole(copyRole);
                } else {
                    if (roleShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.role = null;
                    }
                }
            }
            {
                Boolean supportedFunctionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.supportedFunction!= null)&&(!this.supportedFunction.isEmpty())));
                if (supportedFunctionShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<FunctionPropertyType> sourceSupportedFunction;
                    sourceSupportedFunction = (((this.supportedFunction!= null)&&(!this.supportedFunction.isEmpty()))?this.getSupportedFunction():null);
                    @SuppressWarnings("unchecked")
                    List<FunctionPropertyType> copySupportedFunction = ((List<FunctionPropertyType> ) strategy.copy(LocatorUtils.property(locator, "supportedFunction", sourceSupportedFunction), sourceSupportedFunction, ((this.supportedFunction!= null)&&(!this.supportedFunction.isEmpty()))));
                    copy.supportedFunction = null;
                    if (copySupportedFunction!= null) {
                        List<FunctionPropertyType> uniqueSupportedFunctionl = copy.getSupportedFunction();
                        uniqueSupportedFunctionl.addAll(copySupportedFunction);
                    }
                } else {
                    if (supportedFunctionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.supportedFunction = null;
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
            {
                Boolean maxResponseDelayShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.maxResponseDelay!= null));
                if (maxResponseDelayShouldBeCopiedAndSet == Boolean.TRUE) {
                    Duration sourceMaxResponseDelay;
                    sourceMaxResponseDelay = this.getMaxResponseDelay();
                    Duration copyMaxResponseDelay = ((Duration) strategy.copy(LocatorUtils.property(locator, "maxResponseDelay", sourceMaxResponseDelay), sourceMaxResponseDelay, (this.maxResponseDelay!= null)));
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
        return new NetworkManagementFeatureDescriptionDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final NetworkManagementFeatureDescriptionDataType that = ((NetworkManagementFeatureDescriptionDataType) object);
        {
            FeatureAddressType leftFeatureAddress;
            leftFeatureAddress = this.getFeatureAddress();
            FeatureAddressType rightFeatureAddress;
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
            String leftFeatureType;
            leftFeatureType = this.getFeatureType();
            String rightFeatureType;
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
            List<JAXBElement<List<String>>> leftSpecificUsage;
            leftSpecificUsage = (((this.specificUsage!= null)&&(!this.specificUsage.isEmpty()))?this.getSpecificUsage():null);
            List<JAXBElement<List<String>>> rightSpecificUsage;
            rightSpecificUsage = (((that.specificUsage!= null)&&(!that.specificUsage.isEmpty()))?that.getSpecificUsage():null);
            if ((this.specificUsage!= null)&&(!this.specificUsage.isEmpty())) {
                if ((that.specificUsage!= null)&&(!that.specificUsage.isEmpty())) {
                    final ListIterator<JAXBElement<List<String>>> leftSpecificUsageListIterator = leftSpecificUsage.listIterator();
                    final ListIterator<JAXBElement<List<String>>> rightSpecificUsageListIterator = rightSpecificUsage.listIterator();
                    while (rightSpecificUsageListIterator.hasNext()&&leftSpecificUsageListIterator.hasNext()) {
                        final JAXBElement<List<String>> rightSpecificUsageListIteratorElement = rightSpecificUsageListIterator.next();
                        final JAXBElement<List<String>> leftSpecificUsageListIteratorElement = leftSpecificUsageListIterator.next();
                        if (rightSpecificUsageListIteratorElement!= null) {
                            if (leftSpecificUsageListIteratorElement!= null) {
                                {
                                    final QName rightSpecificUsageListIteratorElementName = rightSpecificUsageListIteratorElement.getName();
                                    final QName leftSpecificUsageListIteratorElementName = leftSpecificUsageListIteratorElement.getName();
                                    if (rightSpecificUsageListIteratorElementName!= null) {
                                        if (leftSpecificUsageListIteratorElementName!= null) {
                                            if (!rightSpecificUsageListIteratorElementName.equals(leftSpecificUsageListIteratorElementName)) {
                                                return false;
                                            }
                                        } else {
                                            return false;
                                        }
                                    } else {
                                        if (leftSpecificUsageListIteratorElementName!= null) {
                                            return false;
                                        }
                                    }
                                }
                                {
                                    final List<String> rightSpecificUsageListIteratorElementValue = rightSpecificUsageListIteratorElement.getValue();
                                    final List<String> leftSpecificUsageListIteratorElementValue = leftSpecificUsageListIteratorElement.getValue();
                                    if (rightSpecificUsageListIteratorElementValue!= null) {
                                        if (leftSpecificUsageListIteratorElementValue!= null) {
                                            if (!rightSpecificUsageListIteratorElementValue.equals(leftSpecificUsageListIteratorElementValue)) {
                                                return false;
                                            }
                                        } else {
                                            return false;
                                        }
                                    } else {
                                        if (leftSpecificUsageListIteratorElementValue!= null) {
                                            return false;
                                        }
                                    }
                                }
                                {
                                    final Class<List<String>> rightSpecificUsageListIteratorElementDeclaredType = rightSpecificUsageListIteratorElement.getDeclaredType();
                                    final Class<List<String>> leftSpecificUsageListIteratorElementDeclaredType = leftSpecificUsageListIteratorElement.getDeclaredType();
                                    if (rightSpecificUsageListIteratorElementDeclaredType!= null) {
                                        if (leftSpecificUsageListIteratorElementDeclaredType!= null) {
                                            if (!rightSpecificUsageListIteratorElementDeclaredType.equals(leftSpecificUsageListIteratorElementDeclaredType)) {
                                                return false;
                                            }
                                        } else {
                                            return false;
                                        }
                                    } else {
                                        if (leftSpecificUsageListIteratorElementDeclaredType!= null) {
                                            return false;
                                        }
                                    }
                                }
                                {
                                    final Class<?> rightSpecificUsageListIteratorElementScope = rightSpecificUsageListIteratorElement.getScope();
                                    final Class<?> leftSpecificUsageListIteratorElementScope = leftSpecificUsageListIteratorElement.getScope();
                                    if (rightSpecificUsageListIteratorElementScope!= null) {
                                        if (leftSpecificUsageListIteratorElementScope!= null) {
                                            if (!rightSpecificUsageListIteratorElementScope.equals(leftSpecificUsageListIteratorElementScope)) {
                                                return false;
                                            }
                                        } else {
                                            return false;
                                        }
                                    } else {
                                        if (leftSpecificUsageListIteratorElementScope!= null) {
                                            return false;
                                        }
                                    }
                                }
                                {
                                    final boolean rightSpecificUsageListIteratorElementNil = rightSpecificUsageListIteratorElement.isNil();
                                    final boolean leftSpecificUsageListIteratorElementNil = leftSpecificUsageListIteratorElement.isNil();
                                    if (rightSpecificUsageListIteratorElementNil!= leftSpecificUsageListIteratorElementNil) {
                                        return false;
                                    }
                                }
                            } else {
                                return false;
                            }
                        } else {
                            if (leftSpecificUsageListIteratorElement!= null) {
                                return false;
                            }
                        }
                    }
                    if (rightSpecificUsageListIterator.hasNext()||leftSpecificUsageListIterator.hasNext()) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.specificUsage!= null)&&(!that.specificUsage.isEmpty())) {
                    return false;
                }
            }
        }
        {
            String leftFeatureGroup;
            leftFeatureGroup = this.getFeatureGroup();
            String rightFeatureGroup;
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
            RoleType leftRole;
            leftRole = this.getRole();
            RoleType rightRole;
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
            List<FunctionPropertyType> leftSupportedFunction;
            leftSupportedFunction = (((this.supportedFunction!= null)&&(!this.supportedFunction.isEmpty()))?this.getSupportedFunction():null);
            List<FunctionPropertyType> rightSupportedFunction;
            rightSupportedFunction = (((that.supportedFunction!= null)&&(!that.supportedFunction.isEmpty()))?that.getSupportedFunction():null);
            if ((this.supportedFunction!= null)&&(!this.supportedFunction.isEmpty())) {
                if ((that.supportedFunction!= null)&&(!that.supportedFunction.isEmpty())) {
                    if (!leftSupportedFunction.equals(rightSupportedFunction)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.supportedFunction!= null)&&(!that.supportedFunction.isEmpty())) {
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
        {
            Duration leftMaxResponseDelay;
            leftMaxResponseDelay = this.getMaxResponseDelay();
            Duration rightMaxResponseDelay;
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
            FeatureAddressType theFeatureAddress;
            theFeatureAddress = this.getFeatureAddress();
            if (this.featureAddress!= null) {
                currentHashCode += theFeatureAddress.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String theFeatureType;
            theFeatureType = this.getFeatureType();
            if (this.featureType!= null) {
                currentHashCode += theFeatureType.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            List<JAXBElement<List<String>>> theSpecificUsage;
            theSpecificUsage = (((this.specificUsage!= null)&&(!this.specificUsage.isEmpty()))?this.getSpecificUsage():null);
            if ((this.specificUsage!= null)&&(!this.specificUsage.isEmpty())) {
                final ListIterator<JAXBElement<List<String>>> theSpecificUsageListIterator = theSpecificUsage.listIterator();
                while (theSpecificUsageListIterator.hasNext()) {
                    currentHashCode = (currentHashCode* 31);
                    final JAXBElement<List<String>> theSpecificUsageListIteratorElement = theSpecificUsageListIterator.next();
                    if (theSpecificUsageListIteratorElement!= null) {
                        {
                            currentHashCode = (currentHashCode* 31);
                            final QName theSpecificUsageListIteratorElementName = theSpecificUsageListIteratorElement.getName();
                            if (theSpecificUsageListIteratorElementName!= null) {
                                currentHashCode += theSpecificUsageListIteratorElementName.hashCode();
                            }
                        }
                        {
                            currentHashCode = (currentHashCode* 31);
                            final List<String> theSpecificUsageListIteratorElementValue = theSpecificUsageListIteratorElement.getValue();
                            if (theSpecificUsageListIteratorElementValue!= null) {
                                currentHashCode += theSpecificUsageListIteratorElementValue.hashCode();
                            }
                        }
                        {
                            currentHashCode = (currentHashCode* 31);
                            final Class<List<String>> theSpecificUsageListIteratorElementDeclaredType = theSpecificUsageListIteratorElement.getDeclaredType();
                            if (theSpecificUsageListIteratorElementDeclaredType!= null) {
                                currentHashCode += theSpecificUsageListIteratorElementDeclaredType.hashCode();
                            }
                        }
                        {
                            currentHashCode = (currentHashCode* 31);
                            final Class<?> theSpecificUsageListIteratorElementScope = theSpecificUsageListIteratorElement.getScope();
                            if (theSpecificUsageListIteratorElementScope!= null) {
                                currentHashCode += theSpecificUsageListIteratorElementScope.hashCode();
                            }
                        }
                        {
                            currentHashCode = (currentHashCode* 31);
                            final boolean theSpecificUsageListIteratorElementNil = theSpecificUsageListIteratorElement.isNil();
                            currentHashCode += (theSpecificUsageListIteratorElementNil? 1231 : 1237);
                        }
                    }
                }
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String theFeatureGroup;
            theFeatureGroup = this.getFeatureGroup();
            if (this.featureGroup!= null) {
                currentHashCode += theFeatureGroup.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            RoleType theRole;
            theRole = this.getRole();
            if (this.role!= null) {
                currentHashCode += theRole.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            List<FunctionPropertyType> theSupportedFunction;
            theSupportedFunction = (((this.supportedFunction!= null)&&(!this.supportedFunction.isEmpty()))?this.getSupportedFunction():null);
            if ((this.supportedFunction!= null)&&(!this.supportedFunction.isEmpty())) {
                currentHashCode += theSupportedFunction.hashCode();
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
        {
            currentHashCode = (currentHashCode* 31);
            Duration theMaxResponseDelay;
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
            FeatureAddressType theFeatureAddress;
            theFeatureAddress = this.getFeatureAddress();
            strategy.appendField(locator, this, "featureAddress", buffer, theFeatureAddress, (this.featureAddress!= null));
        }
        {
            String theFeatureType;
            theFeatureType = this.getFeatureType();
            strategy.appendField(locator, this, "featureType", buffer, theFeatureType, (this.featureType!= null));
        }
        {
            List<JAXBElement<List<String>>> theSpecificUsage;
            theSpecificUsage = (((this.specificUsage!= null)&&(!this.specificUsage.isEmpty()))?this.getSpecificUsage():null);
            strategy.appendField(locator, this, "specificUsage", buffer, theSpecificUsage, ((this.specificUsage!= null)&&(!this.specificUsage.isEmpty())));
        }
        {
            String theFeatureGroup;
            theFeatureGroup = this.getFeatureGroup();
            strategy.appendField(locator, this, "featureGroup", buffer, theFeatureGroup, (this.featureGroup!= null));
        }
        {
            RoleType theRole;
            theRole = this.getRole();
            strategy.appendField(locator, this, "role", buffer, theRole, (this.role!= null));
        }
        {
            List<FunctionPropertyType> theSupportedFunction;
            theSupportedFunction = (((this.supportedFunction!= null)&&(!this.supportedFunction.isEmpty()))?this.getSupportedFunction():null);
            strategy.appendField(locator, this, "supportedFunction", buffer, theSupportedFunction, ((this.supportedFunction!= null)&&(!this.supportedFunction.isEmpty())));
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
        {
            Duration theMaxResponseDelay;
            theMaxResponseDelay = this.getMaxResponseDelay();
            strategy.appendField(locator, this, "maxResponseDelay", buffer, theMaxResponseDelay, (this.maxResponseDelay!= null));
        }
        return buffer;
    }

}
