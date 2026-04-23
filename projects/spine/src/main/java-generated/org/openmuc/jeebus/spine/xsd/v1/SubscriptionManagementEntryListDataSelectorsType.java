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
 * <p>Java class for SubscriptionManagementEntryListDataSelectorsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubscriptionManagementEntryListDataSelectorsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="subscriptionId" type="{http://docs.eebus.org/spine/xsd/v1}SubscriptionIdType" minOccurs="0"/&gt;
 *         &lt;element name="clientAddress" type="{http://docs.eebus.org/spine/xsd/v1}FeatureAddressType" minOccurs="0"/&gt;
 *         &lt;element name="serverAddress" type="{http://docs.eebus.org/spine/xsd/v1}FeatureAddressType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriptionManagementEntryListDataSelectorsType", propOrder = {
    "subscriptionId",
    "clientAddress",
    "serverAddress"
})
@XmlSeeAlso({
    org.openmuc.jeebus.spine.xsd.v1.NodeManagementSubscriptionDataSelectorsType.SubscriptionEntry.class
})
public class SubscriptionManagementEntryListDataSelectorsType implements Cloneable, CopyTo, ToString
{

    @XmlSchemaType(name = "unsignedInt")
    protected Long subscriptionId;
    protected FeatureAddressType clientAddress;
    protected FeatureAddressType serverAddress;

    /**
     * Default no-arg constructor
     * 
     */
    public SubscriptionManagementEntryListDataSelectorsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public SubscriptionManagementEntryListDataSelectorsType(final Long subscriptionId, final FeatureAddressType clientAddress, final FeatureAddressType serverAddress) {
        this.subscriptionId = subscriptionId;
        this.clientAddress = clientAddress;
        this.serverAddress = serverAddress;
    }

    /**
     * Gets the value of the subscriptionId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSubscriptionId() {
        return subscriptionId;
    }

    /**
     * Sets the value of the subscriptionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSubscriptionId(Long value) {
        this.subscriptionId = value;
    }

    /**
     * Gets the value of the clientAddress property.
     * 
     * @return
     *     possible object is
     *     {@link FeatureAddressType }
     *     
     */
    public FeatureAddressType getClientAddress() {
        return clientAddress;
    }

    /**
     * Sets the value of the clientAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeatureAddressType }
     *     
     */
    public void setClientAddress(FeatureAddressType value) {
        this.clientAddress = value;
    }

    /**
     * Gets the value of the serverAddress property.
     * 
     * @return
     *     possible object is
     *     {@link FeatureAddressType }
     *     
     */
    public FeatureAddressType getServerAddress() {
        return serverAddress;
    }

    /**
     * Sets the value of the serverAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeatureAddressType }
     *     
     */
    public void setServerAddress(FeatureAddressType value) {
        this.serverAddress = value;
    }

    /**
     * Sets the value of the subscriptionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     * @return
     *     The class instance
     */
    public SubscriptionManagementEntryListDataSelectorsType withSubscriptionId(Long value) {
        setSubscriptionId(value);
        return this;
    }

    /**
     * Sets the value of the clientAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeatureAddressType }
     * @return
     *     The class instance
     */
    public SubscriptionManagementEntryListDataSelectorsType withClientAddress(FeatureAddressType value) {
        setClientAddress(value);
        return this;
    }

    /**
     * Sets the value of the serverAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeatureAddressType }
     * @return
     *     The class instance
     */
    public SubscriptionManagementEntryListDataSelectorsType withServerAddress(FeatureAddressType value) {
        setServerAddress(value);
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
        if (draftCopy instanceof SubscriptionManagementEntryListDataSelectorsType) {
            final SubscriptionManagementEntryListDataSelectorsType copy = ((SubscriptionManagementEntryListDataSelectorsType) draftCopy);
            {
                Boolean subscriptionIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.subscriptionId!= null));
                if (subscriptionIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceSubscriptionId;
                    sourceSubscriptionId = this.getSubscriptionId();
                    Long copySubscriptionId = ((Long) strategy.copy(LocatorUtils.property(locator, "subscriptionId", sourceSubscriptionId), sourceSubscriptionId, (this.subscriptionId!= null)));
                    copy.setSubscriptionId(copySubscriptionId);
                } else {
                    if (subscriptionIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.subscriptionId = null;
                    }
                }
            }
            {
                Boolean clientAddressShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.clientAddress!= null));
                if (clientAddressShouldBeCopiedAndSet == Boolean.TRUE) {
                    FeatureAddressType sourceClientAddress;
                    sourceClientAddress = this.getClientAddress();
                    FeatureAddressType copyClientAddress = ((FeatureAddressType) strategy.copy(LocatorUtils.property(locator, "clientAddress", sourceClientAddress), sourceClientAddress, (this.clientAddress!= null)));
                    copy.setClientAddress(copyClientAddress);
                } else {
                    if (clientAddressShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.clientAddress = null;
                    }
                }
            }
            {
                Boolean serverAddressShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.serverAddress!= null));
                if (serverAddressShouldBeCopiedAndSet == Boolean.TRUE) {
                    FeatureAddressType sourceServerAddress;
                    sourceServerAddress = this.getServerAddress();
                    FeatureAddressType copyServerAddress = ((FeatureAddressType) strategy.copy(LocatorUtils.property(locator, "serverAddress", sourceServerAddress), sourceServerAddress, (this.serverAddress!= null)));
                    copy.setServerAddress(copyServerAddress);
                } else {
                    if (serverAddressShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.serverAddress = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new SubscriptionManagementEntryListDataSelectorsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final SubscriptionManagementEntryListDataSelectorsType that = ((SubscriptionManagementEntryListDataSelectorsType) object);
        {
            Long leftSubscriptionId;
            leftSubscriptionId = this.getSubscriptionId();
            Long rightSubscriptionId;
            rightSubscriptionId = that.getSubscriptionId();
            if (this.subscriptionId!= null) {
                if (that.subscriptionId!= null) {
                    if (!leftSubscriptionId.equals(rightSubscriptionId)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.subscriptionId!= null) {
                    return false;
                }
            }
        }
        {
            FeatureAddressType leftClientAddress;
            leftClientAddress = this.getClientAddress();
            FeatureAddressType rightClientAddress;
            rightClientAddress = that.getClientAddress();
            if (this.clientAddress!= null) {
                if (that.clientAddress!= null) {
                    if (!leftClientAddress.equals(rightClientAddress)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.clientAddress!= null) {
                    return false;
                }
            }
        }
        {
            FeatureAddressType leftServerAddress;
            leftServerAddress = this.getServerAddress();
            FeatureAddressType rightServerAddress;
            rightServerAddress = that.getServerAddress();
            if (this.serverAddress!= null) {
                if (that.serverAddress!= null) {
                    if (!leftServerAddress.equals(rightServerAddress)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.serverAddress!= null) {
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
            Long theSubscriptionId;
            theSubscriptionId = this.getSubscriptionId();
            if (this.subscriptionId!= null) {
                currentHashCode += theSubscriptionId.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            FeatureAddressType theClientAddress;
            theClientAddress = this.getClientAddress();
            if (this.clientAddress!= null) {
                currentHashCode += theClientAddress.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            FeatureAddressType theServerAddress;
            theServerAddress = this.getServerAddress();
            if (this.serverAddress!= null) {
                currentHashCode += theServerAddress.hashCode();
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
            Long theSubscriptionId;
            theSubscriptionId = this.getSubscriptionId();
            strategy.appendField(locator, this, "subscriptionId", buffer, theSubscriptionId, (this.subscriptionId!= null));
        }
        {
            FeatureAddressType theClientAddress;
            theClientAddress = this.getClientAddress();
            strategy.appendField(locator, this, "clientAddress", buffer, theClientAddress, (this.clientAddress!= null));
        }
        {
            FeatureAddressType theServerAddress;
            theServerAddress = this.getServerAddress();
            strategy.appendField(locator, this, "serverAddress", buffer, theServerAddress, (this.serverAddress!= null));
        }
        return buffer;
    }

}
