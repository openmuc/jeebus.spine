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
 * <p>Java class for NetworkManagementDiscoverCallElementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NetworkManagementDiscoverCallElementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="discoverAddress" type="{http://docs.eebus.org/spine/xsd/v1}FeatureAddressElementsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkManagementDiscoverCallElementsType", propOrder = {
    "discoverAddress"
})
public class NetworkManagementDiscoverCallElementsType implements Cloneable, CopyTo, ToString
{

    protected FeatureAddressElementsType discoverAddress;

    /**
     * Default no-arg constructor
     * 
     */
    public NetworkManagementDiscoverCallElementsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public NetworkManagementDiscoverCallElementsType(final FeatureAddressElementsType discoverAddress) {
        this.discoverAddress = discoverAddress;
    }

    /**
     * Gets the value of the discoverAddress property.
     * 
     * @return
     *     possible object is
     *     {@link FeatureAddressElementsType }
     *     
     */
    public FeatureAddressElementsType getDiscoverAddress() {
        return discoverAddress;
    }

    /**
     * Sets the value of the discoverAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeatureAddressElementsType }
     *     
     */
    public void setDiscoverAddress(FeatureAddressElementsType value) {
        this.discoverAddress = value;
    }

    /**
     * Sets the value of the discoverAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeatureAddressElementsType }
     * @return
     *     The class instance
     */
    public NetworkManagementDiscoverCallElementsType withDiscoverAddress(FeatureAddressElementsType value) {
        setDiscoverAddress(value);
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
        if (draftCopy instanceof NetworkManagementDiscoverCallElementsType) {
            final NetworkManagementDiscoverCallElementsType copy = ((NetworkManagementDiscoverCallElementsType) draftCopy);
            {
                Boolean discoverAddressShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.discoverAddress!= null));
                if (discoverAddressShouldBeCopiedAndSet == Boolean.TRUE) {
                    FeatureAddressElementsType sourceDiscoverAddress;
                    sourceDiscoverAddress = this.getDiscoverAddress();
                    FeatureAddressElementsType copyDiscoverAddress = ((FeatureAddressElementsType) strategy.copy(LocatorUtils.property(locator, "discoverAddress", sourceDiscoverAddress), sourceDiscoverAddress, (this.discoverAddress!= null)));
                    copy.setDiscoverAddress(copyDiscoverAddress);
                } else {
                    if (discoverAddressShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.discoverAddress = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new NetworkManagementDiscoverCallElementsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final NetworkManagementDiscoverCallElementsType that = ((NetworkManagementDiscoverCallElementsType) object);
        {
            FeatureAddressElementsType leftDiscoverAddress;
            leftDiscoverAddress = this.getDiscoverAddress();
            FeatureAddressElementsType rightDiscoverAddress;
            rightDiscoverAddress = that.getDiscoverAddress();
            if (this.discoverAddress!= null) {
                if (that.discoverAddress!= null) {
                    if (!leftDiscoverAddress.equals(rightDiscoverAddress)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.discoverAddress!= null) {
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
            FeatureAddressElementsType theDiscoverAddress;
            theDiscoverAddress = this.getDiscoverAddress();
            if (this.discoverAddress!= null) {
                currentHashCode += theDiscoverAddress.hashCode();
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
            FeatureAddressElementsType theDiscoverAddress;
            theDiscoverAddress = this.getDiscoverAddress();
            strategy.appendField(locator, this, "discoverAddress", buffer, theDiscoverAddress, (this.discoverAddress!= null));
        }
        return buffer;
    }

}
