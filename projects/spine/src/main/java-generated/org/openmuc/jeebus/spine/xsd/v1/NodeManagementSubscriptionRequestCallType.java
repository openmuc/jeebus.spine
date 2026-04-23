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


/**
 * <p>Java class for NodeManagementSubscriptionRequestCallType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NodeManagementSubscriptionRequestCallType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="subscriptionRequest" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}SubscriptionManagementRequestCallType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="clientAddress" type="{http://docs.eebus.org/spine/xsd/v1}FeatureAddressType" minOccurs="0"/&gt;
 *                   &lt;element name="serverAddress" type="{http://docs.eebus.org/spine/xsd/v1}FeatureAddressType" minOccurs="0"/&gt;
 *                   &lt;element name="serverFeatureType" type="{http://docs.eebus.org/spine/xsd/v1}FeatureTypeType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NodeManagementSubscriptionRequestCallType", propOrder = {
    "subscriptionRequest"
})
public class NodeManagementSubscriptionRequestCallType implements Cloneable, CopyTo, ToString
{

    protected NodeManagementSubscriptionRequestCallType.SubscriptionRequest subscriptionRequest;

    /**
     * Default no-arg constructor
     * 
     */
    public NodeManagementSubscriptionRequestCallType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public NodeManagementSubscriptionRequestCallType(final NodeManagementSubscriptionRequestCallType.SubscriptionRequest subscriptionRequest) {
        this.subscriptionRequest = subscriptionRequest;
    }

    /**
     * Gets the value of the subscriptionRequest property.
     * 
     * @return
     *     possible object is
     *     {@link NodeManagementSubscriptionRequestCallType.SubscriptionRequest }
     *     
     */
    public NodeManagementSubscriptionRequestCallType.SubscriptionRequest getSubscriptionRequest() {
        return subscriptionRequest;
    }

    /**
     * Sets the value of the subscriptionRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeManagementSubscriptionRequestCallType.SubscriptionRequest }
     *     
     */
    public void setSubscriptionRequest(NodeManagementSubscriptionRequestCallType.SubscriptionRequest value) {
        this.subscriptionRequest = value;
    }

    /**
     * Sets the value of the subscriptionRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeManagementSubscriptionRequestCallType.SubscriptionRequest }
     * @return
     *     The class instance
     */
    public NodeManagementSubscriptionRequestCallType withSubscriptionRequest(NodeManagementSubscriptionRequestCallType.SubscriptionRequest value) {
        setSubscriptionRequest(value);
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
        if (draftCopy instanceof NodeManagementSubscriptionRequestCallType) {
            final NodeManagementSubscriptionRequestCallType copy = ((NodeManagementSubscriptionRequestCallType) draftCopy);
            {
                Boolean subscriptionRequestShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.subscriptionRequest!= null));
                if (subscriptionRequestShouldBeCopiedAndSet == Boolean.TRUE) {
                    NodeManagementSubscriptionRequestCallType.SubscriptionRequest sourceSubscriptionRequest;
                    sourceSubscriptionRequest = this.getSubscriptionRequest();
                    NodeManagementSubscriptionRequestCallType.SubscriptionRequest copySubscriptionRequest = ((NodeManagementSubscriptionRequestCallType.SubscriptionRequest) strategy.copy(LocatorUtils.property(locator, "subscriptionRequest", sourceSubscriptionRequest), sourceSubscriptionRequest, (this.subscriptionRequest!= null)));
                    copy.setSubscriptionRequest(copySubscriptionRequest);
                } else {
                    if (subscriptionRequestShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.subscriptionRequest = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new NodeManagementSubscriptionRequestCallType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final NodeManagementSubscriptionRequestCallType that = ((NodeManagementSubscriptionRequestCallType) object);
        {
            NodeManagementSubscriptionRequestCallType.SubscriptionRequest leftSubscriptionRequest;
            leftSubscriptionRequest = this.getSubscriptionRequest();
            NodeManagementSubscriptionRequestCallType.SubscriptionRequest rightSubscriptionRequest;
            rightSubscriptionRequest = that.getSubscriptionRequest();
            if (this.subscriptionRequest!= null) {
                if (that.subscriptionRequest!= null) {
                    if (!leftSubscriptionRequest.equals(rightSubscriptionRequest)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.subscriptionRequest!= null) {
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
            NodeManagementSubscriptionRequestCallType.SubscriptionRequest theSubscriptionRequest;
            theSubscriptionRequest = this.getSubscriptionRequest();
            if (this.subscriptionRequest!= null) {
                currentHashCode += theSubscriptionRequest.hashCode();
            }
        }
        return currentHashCode;
    }

    @Override
    public String toString() {
        final ToStringStrategy strategy = new org.openmuc.jeebus.spine.impl.parser.CustomToStringStrategy();
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
            NodeManagementSubscriptionRequestCallType.SubscriptionRequest theSubscriptionRequest;
            theSubscriptionRequest = this.getSubscriptionRequest();
            strategy.appendField(locator, this, "subscriptionRequest", buffer, theSubscriptionRequest, (this.subscriptionRequest!= null));
        }
        return buffer;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}SubscriptionManagementRequestCallType"&gt;
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
    @XmlType(name = "")
    public static class SubscriptionRequest
        extends SubscriptionManagementRequestCallType
        implements Cloneable, CopyTo, ToString
    {


        /**
         * Default no-arg constructor
         * 
         */
        public SubscriptionRequest() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public SubscriptionRequest(final FeatureAddressType clientAddress, final FeatureAddressType serverAddress, final String serverFeatureType) {
            super(clientAddress, serverAddress, serverFeatureType);
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
        @Override
        public NodeManagementSubscriptionRequestCallType.SubscriptionRequest withClientAddress(FeatureAddressType value) {
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
        @Override
        public NodeManagementSubscriptionRequestCallType.SubscriptionRequest withServerAddress(FeatureAddressType value) {
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
        @Override
        public NodeManagementSubscriptionRequestCallType.SubscriptionRequest withServerFeatureType(String value) {
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
            super.copyTo(locator, draftCopy, strategy);
            return draftCopy;
        }

        @Override
        public Object createNewInstance() {
            return new NodeManagementSubscriptionRequestCallType.SubscriptionRequest();
        }

        @Override
        public boolean equals(Object object) {
            if ((object == null)||(this.getClass()!= object.getClass())) {
                return false;
            }
            if (this == object) {
                return true;
            }
            if (!super.equals(object)) {
                return false;
            }
            return true;
        }

        @Override
        public int hashCode() {
            int currentHashCode = 1;
            currentHashCode = ((currentHashCode* 31)+ super.hashCode());
            return currentHashCode;
        }

        @Override
        public String toString() {
            final ToStringStrategy strategy = new org.openmuc.jeebus.spine.impl.parser.CustomToStringStrategy();
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
            super.appendFields(locator, buffer, strategy);
            return buffer;
        }

    }

}
