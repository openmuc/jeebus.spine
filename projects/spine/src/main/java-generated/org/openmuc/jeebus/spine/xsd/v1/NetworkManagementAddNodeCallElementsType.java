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
 * <p>Java class for NetworkManagementAddNodeCallElementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NetworkManagementAddNodeCallElementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nodeAddress" type="{http://docs.eebus.org/spine/xsd/v1}FeatureAddressElementsType" minOccurs="0"/&gt;
 *         &lt;element name="nativeSetup" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="timeout" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
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
@XmlType(name = "NetworkManagementAddNodeCallElementsType", propOrder = {
    "nodeAddress",
    "nativeSetup",
    "timeout",
    "label",
    "description"
})
public class NetworkManagementAddNodeCallElementsType implements Cloneable, CopyTo, ToString
{

    protected FeatureAddressElementsType nodeAddress;
    protected ElementTagType nativeSetup;
    protected ElementTagType timeout;
    protected ElementTagType label;
    protected ElementTagType description;

    /**
     * Default no-arg constructor
     * 
     */
    public NetworkManagementAddNodeCallElementsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public NetworkManagementAddNodeCallElementsType(final FeatureAddressElementsType nodeAddress, final ElementTagType nativeSetup, final ElementTagType timeout, final ElementTagType label, final ElementTagType description) {
        this.nodeAddress = nodeAddress;
        this.nativeSetup = nativeSetup;
        this.timeout = timeout;
        this.label = label;
        this.description = description;
    }

    /**
     * Gets the value of the nodeAddress property.
     * 
     * @return
     *     possible object is
     *     {@link FeatureAddressElementsType }
     *     
     */
    public FeatureAddressElementsType getNodeAddress() {
        return nodeAddress;
    }

    /**
     * Sets the value of the nodeAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeatureAddressElementsType }
     *     
     */
    public void setNodeAddress(FeatureAddressElementsType value) {
        this.nodeAddress = value;
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
     * Gets the value of the timeout property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getTimeout() {
        return timeout;
    }

    /**
     * Sets the value of the timeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setTimeout(ElementTagType value) {
        this.timeout = value;
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
     * Sets the value of the nodeAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeatureAddressElementsType }
     * @return
     *     The class instance
     */
    public NetworkManagementAddNodeCallElementsType withNodeAddress(FeatureAddressElementsType value) {
        setNodeAddress(value);
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
    public NetworkManagementAddNodeCallElementsType withNativeSetup(ElementTagType value) {
        setNativeSetup(value);
        return this;
    }

    /**
     * Sets the value of the timeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public NetworkManagementAddNodeCallElementsType withTimeout(ElementTagType value) {
        setTimeout(value);
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
    public NetworkManagementAddNodeCallElementsType withLabel(ElementTagType value) {
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
    public NetworkManagementAddNodeCallElementsType withDescription(ElementTagType value) {
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
        if (draftCopy instanceof NetworkManagementAddNodeCallElementsType) {
            final NetworkManagementAddNodeCallElementsType copy = ((NetworkManagementAddNodeCallElementsType) draftCopy);
            {
                Boolean nodeAddressShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.nodeAddress!= null));
                if (nodeAddressShouldBeCopiedAndSet == Boolean.TRUE) {
                    FeatureAddressElementsType sourceNodeAddress;
                    sourceNodeAddress = this.getNodeAddress();
                    FeatureAddressElementsType copyNodeAddress = ((FeatureAddressElementsType) strategy.copy(LocatorUtils.property(locator, "nodeAddress", sourceNodeAddress), sourceNodeAddress, (this.nodeAddress!= null)));
                    copy.setNodeAddress(copyNodeAddress);
                } else {
                    if (nodeAddressShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.nodeAddress = null;
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
                Boolean timeoutShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.timeout!= null));
                if (timeoutShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceTimeout;
                    sourceTimeout = this.getTimeout();
                    ElementTagType copyTimeout = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "timeout", sourceTimeout), sourceTimeout, (this.timeout!= null)));
                    copy.setTimeout(copyTimeout);
                } else {
                    if (timeoutShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.timeout = null;
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
        return new NetworkManagementAddNodeCallElementsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final NetworkManagementAddNodeCallElementsType that = ((NetworkManagementAddNodeCallElementsType) object);
        {
            FeatureAddressElementsType leftNodeAddress;
            leftNodeAddress = this.getNodeAddress();
            FeatureAddressElementsType rightNodeAddress;
            rightNodeAddress = that.getNodeAddress();
            if (this.nodeAddress!= null) {
                if (that.nodeAddress!= null) {
                    if (!leftNodeAddress.equals(rightNodeAddress)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.nodeAddress!= null) {
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
            ElementTagType leftTimeout;
            leftTimeout = this.getTimeout();
            ElementTagType rightTimeout;
            rightTimeout = that.getTimeout();
            if (this.timeout!= null) {
                if (that.timeout!= null) {
                    if (!leftTimeout.equals(rightTimeout)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.timeout!= null) {
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
            FeatureAddressElementsType theNodeAddress;
            theNodeAddress = this.getNodeAddress();
            if (this.nodeAddress!= null) {
                currentHashCode += theNodeAddress.hashCode();
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
            ElementTagType theTimeout;
            theTimeout = this.getTimeout();
            if (this.timeout!= null) {
                currentHashCode += theTimeout.hashCode();
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
            FeatureAddressElementsType theNodeAddress;
            theNodeAddress = this.getNodeAddress();
            strategy.appendField(locator, this, "nodeAddress", buffer, theNodeAddress, (this.nodeAddress!= null));
        }
        {
            ElementTagType theNativeSetup;
            theNativeSetup = this.getNativeSetup();
            strategy.appendField(locator, this, "nativeSetup", buffer, theNativeSetup, (this.nativeSetup!= null));
        }
        {
            ElementTagType theTimeout;
            theTimeout = this.getTimeout();
            strategy.appendField(locator, this, "timeout", buffer, theTimeout, (this.timeout!= null));
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
