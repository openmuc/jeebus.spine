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
 * <p>Java class for NetworkManagementFeatureDescriptionListDataSelectorsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NetworkManagementFeatureDescriptionListDataSelectorsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
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
@XmlType(name = "NetworkManagementFeatureDescriptionListDataSelectorsType", propOrder = {
    "featureAddress",
    "featureType"
})
@XmlSeeAlso({
    org.openmuc.jeebus.spine.xsd.v1.NodeManagementDetailedDiscoveryDataSelectorsType.FeatureInformation.class
})
public class NetworkManagementFeatureDescriptionListDataSelectorsType implements Cloneable, CopyTo, ToString
{

    protected FeatureAddressType featureAddress;
    protected String featureType;

    /**
     * Default no-arg constructor
     * 
     */
    public NetworkManagementFeatureDescriptionListDataSelectorsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public NetworkManagementFeatureDescriptionListDataSelectorsType(final FeatureAddressType featureAddress, final String featureType) {
        this.featureAddress = featureAddress;
        this.featureType = featureType;
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
     * Sets the value of the featureAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeatureAddressType }
     * @return
     *     The class instance
     */
    public NetworkManagementFeatureDescriptionListDataSelectorsType withFeatureAddress(FeatureAddressType value) {
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
    public NetworkManagementFeatureDescriptionListDataSelectorsType withFeatureType(String value) {
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
        if (draftCopy instanceof NetworkManagementFeatureDescriptionListDataSelectorsType) {
            final NetworkManagementFeatureDescriptionListDataSelectorsType copy = ((NetworkManagementFeatureDescriptionListDataSelectorsType) draftCopy);
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
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new NetworkManagementFeatureDescriptionListDataSelectorsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final NetworkManagementFeatureDescriptionListDataSelectorsType that = ((NetworkManagementFeatureDescriptionListDataSelectorsType) object);
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
        return buffer;
    }

}
