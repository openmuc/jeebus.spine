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
 * <p>Java class for BindingManagementRequestCallType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BindingManagementRequestCallType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="clientAddress" type="{http://docs.eebus.org/spine/xsd/v1}FeatureAddressType" minOccurs="0"/&gt;
 *         &lt;element name="serverAddress" type="{http://docs.eebus.org/spine/xsd/v1}FeatureAddressType" minOccurs="0"/&gt;
 *         &lt;element name="serverFeatureType" type="{http://docs.eebus.org/spine/xsd/v1}FeatureTypeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BindingManagementRequestCallType", propOrder = {
    "clientAddress",
    "serverAddress",
    "serverFeatureType"
})
@XmlSeeAlso({
    org.openmuc.jeebus.spine.xsd.v1.NodeManagementBindingRequestCallType.BindingRequest.class
})
public class BindingManagementRequestCallType implements Cloneable, CopyTo, ToString
{

    protected FeatureAddressType clientAddress;
    protected FeatureAddressType serverAddress;
    protected String serverFeatureType;

    /**
     * Default no-arg constructor
     * 
     */
    public BindingManagementRequestCallType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public BindingManagementRequestCallType(final FeatureAddressType clientAddress, final FeatureAddressType serverAddress, final String serverFeatureType) {
        this.clientAddress = clientAddress;
        this.serverAddress = serverAddress;
        this.serverFeatureType = serverFeatureType;
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
     * Gets the value of the serverFeatureType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServerFeatureType() {
        return serverFeatureType;
    }

    /**
     * Sets the value of the serverFeatureType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServerFeatureType(String value) {
        this.serverFeatureType = value;
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
    public BindingManagementRequestCallType withClientAddress(FeatureAddressType value) {
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
    public BindingManagementRequestCallType withServerAddress(FeatureAddressType value) {
        setServerAddress(value);
        return this;
    }

    /**
     * Sets the value of the serverFeatureType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public BindingManagementRequestCallType withServerFeatureType(String value) {
        setServerFeatureType(value);
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
        if (draftCopy instanceof BindingManagementRequestCallType) {
            final BindingManagementRequestCallType copy = ((BindingManagementRequestCallType) draftCopy);
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
            {
                Boolean serverFeatureTypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.serverFeatureType!= null));
                if (serverFeatureTypeShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceServerFeatureType;
                    sourceServerFeatureType = this.getServerFeatureType();
                    String copyServerFeatureType = ((String) strategy.copy(LocatorUtils.property(locator, "serverFeatureType", sourceServerFeatureType), sourceServerFeatureType, (this.serverFeatureType!= null)));
                    copy.setServerFeatureType(copyServerFeatureType);
                } else {
                    if (serverFeatureTypeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.serverFeatureType = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new BindingManagementRequestCallType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final BindingManagementRequestCallType that = ((BindingManagementRequestCallType) object);
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
        {
            String leftServerFeatureType;
            leftServerFeatureType = this.getServerFeatureType();
            String rightServerFeatureType;
            rightServerFeatureType = that.getServerFeatureType();
            if (this.serverFeatureType!= null) {
                if (that.serverFeatureType!= null) {
                    if (!leftServerFeatureType.equals(rightServerFeatureType)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.serverFeatureType!= null) {
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
        {
            currentHashCode = (currentHashCode* 31);
            String theServerFeatureType;
            theServerFeatureType = this.getServerFeatureType();
            if (this.serverFeatureType!= null) {
                currentHashCode += theServerFeatureType.hashCode();
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
            FeatureAddressType theClientAddress;
            theClientAddress = this.getClientAddress();
            strategy.appendField(locator, this, "clientAddress", buffer, theClientAddress, (this.clientAddress!= null));
        }
        {
            FeatureAddressType theServerAddress;
            theServerAddress = this.getServerAddress();
            strategy.appendField(locator, this, "serverAddress", buffer, theServerAddress, (this.serverAddress!= null));
        }
        {
            String theServerFeatureType;
            theServerFeatureType = this.getServerFeatureType();
            strategy.appendField(locator, this, "serverFeatureType", buffer, theServerFeatureType, (this.serverFeatureType!= null));
        }
        return buffer;
    }

}
