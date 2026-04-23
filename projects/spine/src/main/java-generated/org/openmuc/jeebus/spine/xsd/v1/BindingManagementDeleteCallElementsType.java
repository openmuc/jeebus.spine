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
 * <p>Java class for BindingManagementDeleteCallElementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BindingManagementDeleteCallElementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bindingId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="clientAddress" type="{http://docs.eebus.org/spine/xsd/v1}FeatureAddressElementsType" minOccurs="0"/&gt;
 *         &lt;element name="serverAddress" type="{http://docs.eebus.org/spine/xsd/v1}FeatureAddressElementsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BindingManagementDeleteCallElementsType", propOrder = {
    "bindingId",
    "clientAddress",
    "serverAddress"
})
@XmlSeeAlso({
    org.openmuc.jeebus.spine.xsd.v1.NodeManagementBindingDeleteCallElementsType.BindingDelete.class
})
public class BindingManagementDeleteCallElementsType implements Cloneable, CopyTo, ToString
{

    protected ElementTagType bindingId;
    protected FeatureAddressElementsType clientAddress;
    protected FeatureAddressElementsType serverAddress;

    /**
     * Default no-arg constructor
     * 
     */
    public BindingManagementDeleteCallElementsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public BindingManagementDeleteCallElementsType(final ElementTagType bindingId, final FeatureAddressElementsType clientAddress, final FeatureAddressElementsType serverAddress) {
        this.bindingId = bindingId;
        this.clientAddress = clientAddress;
        this.serverAddress = serverAddress;
    }

    /**
     * Gets the value of the bindingId property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getBindingId() {
        return bindingId;
    }

    /**
     * Sets the value of the bindingId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setBindingId(ElementTagType value) {
        this.bindingId = value;
    }

    /**
     * Gets the value of the clientAddress property.
     * 
     * @return
     *     possible object is
     *     {@link FeatureAddressElementsType }
     *     
     */
    public FeatureAddressElementsType getClientAddress() {
        return clientAddress;
    }

    /**
     * Sets the value of the clientAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeatureAddressElementsType }
     *     
     */
    public void setClientAddress(FeatureAddressElementsType value) {
        this.clientAddress = value;
    }

    /**
     * Gets the value of the serverAddress property.
     * 
     * @return
     *     possible object is
     *     {@link FeatureAddressElementsType }
     *     
     */
    public FeatureAddressElementsType getServerAddress() {
        return serverAddress;
    }

    /**
     * Sets the value of the serverAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeatureAddressElementsType }
     *     
     */
    public void setServerAddress(FeatureAddressElementsType value) {
        this.serverAddress = value;
    }

    /**
     * Sets the value of the bindingId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public BindingManagementDeleteCallElementsType withBindingId(ElementTagType value) {
        setBindingId(value);
        return this;
    }

    /**
     * Sets the value of the clientAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeatureAddressElementsType }
     * @return
     *     The class instance
     */
    public BindingManagementDeleteCallElementsType withClientAddress(FeatureAddressElementsType value) {
        setClientAddress(value);
        return this;
    }

    /**
     * Sets the value of the serverAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeatureAddressElementsType }
     * @return
     *     The class instance
     */
    public BindingManagementDeleteCallElementsType withServerAddress(FeatureAddressElementsType value) {
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
        if (draftCopy instanceof BindingManagementDeleteCallElementsType) {
            final BindingManagementDeleteCallElementsType copy = ((BindingManagementDeleteCallElementsType) draftCopy);
            {
                Boolean bindingIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.bindingId!= null));
                if (bindingIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceBindingId;
                    sourceBindingId = this.getBindingId();
                    ElementTagType copyBindingId = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "bindingId", sourceBindingId), sourceBindingId, (this.bindingId!= null)));
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
                    FeatureAddressElementsType sourceClientAddress;
                    sourceClientAddress = this.getClientAddress();
                    FeatureAddressElementsType copyClientAddress = ((FeatureAddressElementsType) strategy.copy(LocatorUtils.property(locator, "clientAddress", sourceClientAddress), sourceClientAddress, (this.clientAddress!= null)));
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
                    FeatureAddressElementsType sourceServerAddress;
                    sourceServerAddress = this.getServerAddress();
                    FeatureAddressElementsType copyServerAddress = ((FeatureAddressElementsType) strategy.copy(LocatorUtils.property(locator, "serverAddress", sourceServerAddress), sourceServerAddress, (this.serverAddress!= null)));
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
        return new BindingManagementDeleteCallElementsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final BindingManagementDeleteCallElementsType that = ((BindingManagementDeleteCallElementsType) object);
        {
            ElementTagType leftBindingId;
            leftBindingId = this.getBindingId();
            ElementTagType rightBindingId;
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
            FeatureAddressElementsType leftClientAddress;
            leftClientAddress = this.getClientAddress();
            FeatureAddressElementsType rightClientAddress;
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
            FeatureAddressElementsType leftServerAddress;
            leftServerAddress = this.getServerAddress();
            FeatureAddressElementsType rightServerAddress;
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
            ElementTagType theBindingId;
            theBindingId = this.getBindingId();
            if (this.bindingId!= null) {
                currentHashCode += theBindingId.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            FeatureAddressElementsType theClientAddress;
            theClientAddress = this.getClientAddress();
            if (this.clientAddress!= null) {
                currentHashCode += theClientAddress.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            FeatureAddressElementsType theServerAddress;
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
            ElementTagType theBindingId;
            theBindingId = this.getBindingId();
            strategy.appendField(locator, this, "bindingId", buffer, theBindingId, (this.bindingId!= null));
        }
        {
            FeatureAddressElementsType theClientAddress;
            theClientAddress = this.getClientAddress();
            strategy.appendField(locator, this, "clientAddress", buffer, theClientAddress, (this.clientAddress!= null));
        }
        {
            FeatureAddressElementsType theServerAddress;
            theServerAddress = this.getServerAddress();
            strategy.appendField(locator, this, "serverAddress", buffer, theServerAddress, (this.serverAddress!= null));
        }
        return buffer;
    }

}
