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
 * <p>Java class for BindingManagementEntryListDataSelectorsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BindingManagementEntryListDataSelectorsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bindingId" type="{http://docs.eebus.org/spine/xsd/v1}BindingIdType" minOccurs="0"/&gt;
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
@XmlType(name = "BindingManagementEntryListDataSelectorsType", propOrder = {
    "bindingId",
    "clientAddress",
    "serverAddress"
})
@XmlSeeAlso({
    org.openmuc.jeebus.spine.xsd.v1.NodeManagementBindingDataSelectorsType.BindingEntry.class
})
public class BindingManagementEntryListDataSelectorsType implements Cloneable, CopyTo, ToString
{

    @XmlSchemaType(name = "unsignedInt")
    protected Long bindingId;
    protected FeatureAddressType clientAddress;
    protected FeatureAddressType serverAddress;

    /**
     * Default no-arg constructor
     * 
     */
    public BindingManagementEntryListDataSelectorsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public BindingManagementEntryListDataSelectorsType(final Long bindingId, final FeatureAddressType clientAddress, final FeatureAddressType serverAddress) {
        this.bindingId = bindingId;
        this.clientAddress = clientAddress;
        this.serverAddress = serverAddress;
    }

    /**
     * Gets the value of the bindingId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBindingId() {
        return bindingId;
    }

    /**
     * Sets the value of the bindingId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBindingId(Long value) {
        this.bindingId = value;
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
     * Sets the value of the bindingId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     * @return
     *     The class instance
     */
    public BindingManagementEntryListDataSelectorsType withBindingId(Long value) {
        setBindingId(value);
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
    public BindingManagementEntryListDataSelectorsType withClientAddress(FeatureAddressType value) {
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
    public BindingManagementEntryListDataSelectorsType withServerAddress(FeatureAddressType value) {
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
        if (draftCopy instanceof BindingManagementEntryListDataSelectorsType) {
            final BindingManagementEntryListDataSelectorsType copy = ((BindingManagementEntryListDataSelectorsType) draftCopy);
            {
                Boolean bindingIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.bindingId!= null));
                if (bindingIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceBindingId;
                    sourceBindingId = this.getBindingId();
                    Long copyBindingId = ((Long) strategy.copy(LocatorUtils.property(locator, "bindingId", sourceBindingId), sourceBindingId, (this.bindingId!= null)));
                    copy.setBindingId(copyBindingId);
                } else {
                    if (bindingIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.bindingId = null;
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
        return new BindingManagementEntryListDataSelectorsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final BindingManagementEntryListDataSelectorsType that = ((BindingManagementEntryListDataSelectorsType) object);
        {
            Long leftBindingId;
            leftBindingId = this.getBindingId();
            Long rightBindingId;
            rightBindingId = that.getBindingId();
            if (this.bindingId!= null) {
                if (that.bindingId!= null) {
                    if (!leftBindingId.equals(rightBindingId)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.bindingId!= null) {
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
            Long theBindingId;
            theBindingId = this.getBindingId();
            if (this.bindingId!= null) {
                currentHashCode += theBindingId.hashCode();
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
            Long theBindingId;
            theBindingId = this.getBindingId();
            strategy.appendField(locator, this, "bindingId", buffer, theBindingId, (this.bindingId!= null));
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
