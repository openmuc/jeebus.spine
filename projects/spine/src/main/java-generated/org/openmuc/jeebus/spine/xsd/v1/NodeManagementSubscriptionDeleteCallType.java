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
 * <p>Java class for NodeManagementSubscriptionDeleteCallType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NodeManagementSubscriptionDeleteCallType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="subscriptionDelete" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}SubscriptionManagementDeleteCallType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="subscriptionId" type="{http://docs.eebus.org/spine/xsd/v1}SubscriptionIdType" minOccurs="0"/&gt;
 *                   &lt;element name="clientAddress" type="{http://docs.eebus.org/spine/xsd/v1}FeatureAddressType" minOccurs="0"/&gt;
 *                   &lt;element name="serverAddress" type="{http://docs.eebus.org/spine/xsd/v1}FeatureAddressType" minOccurs="0"/&gt;
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
@XmlType(name = "NodeManagementSubscriptionDeleteCallType", propOrder = {
    "subscriptionDelete"
})
public class NodeManagementSubscriptionDeleteCallType implements Cloneable, CopyTo, ToString
{

    protected NodeManagementSubscriptionDeleteCallType.SubscriptionDelete subscriptionDelete;

    /**
     * Default no-arg constructor
     * 
     */
    public NodeManagementSubscriptionDeleteCallType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public NodeManagementSubscriptionDeleteCallType(final NodeManagementSubscriptionDeleteCallType.SubscriptionDelete subscriptionDelete) {
        this.subscriptionDelete = subscriptionDelete;
    }

    /**
     * Gets the value of the subscriptionDelete property.
     * 
     * @return
     *     possible object is
     *     {@link NodeManagementSubscriptionDeleteCallType.SubscriptionDelete }
     *     
     */
    public NodeManagementSubscriptionDeleteCallType.SubscriptionDelete getSubscriptionDelete() {
        return subscriptionDelete;
    }

    /**
     * Sets the value of the subscriptionDelete property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeManagementSubscriptionDeleteCallType.SubscriptionDelete }
     *     
     */
    public void setSubscriptionDelete(NodeManagementSubscriptionDeleteCallType.SubscriptionDelete value) {
        this.subscriptionDelete = value;
    }

    /**
     * Sets the value of the subscriptionDelete property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeManagementSubscriptionDeleteCallType.SubscriptionDelete }
     * @return
     *     The class instance
     */
    public NodeManagementSubscriptionDeleteCallType withSubscriptionDelete(NodeManagementSubscriptionDeleteCallType.SubscriptionDelete value) {
        setSubscriptionDelete(value);
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
        if (draftCopy instanceof NodeManagementSubscriptionDeleteCallType) {
            final NodeManagementSubscriptionDeleteCallType copy = ((NodeManagementSubscriptionDeleteCallType) draftCopy);
            {
                Boolean subscriptionDeleteShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.subscriptionDelete!= null));
                if (subscriptionDeleteShouldBeCopiedAndSet == Boolean.TRUE) {
                    NodeManagementSubscriptionDeleteCallType.SubscriptionDelete sourceSubscriptionDelete;
                    sourceSubscriptionDelete = this.getSubscriptionDelete();
                    NodeManagementSubscriptionDeleteCallType.SubscriptionDelete copySubscriptionDelete = ((NodeManagementSubscriptionDeleteCallType.SubscriptionDelete) strategy.copy(LocatorUtils.property(locator, "subscriptionDelete", sourceSubscriptionDelete), sourceSubscriptionDelete, (this.subscriptionDelete!= null)));
                    copy.setSubscriptionDelete(copySubscriptionDelete);
                } else {
                    if (subscriptionDeleteShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.subscriptionDelete = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new NodeManagementSubscriptionDeleteCallType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final NodeManagementSubscriptionDeleteCallType that = ((NodeManagementSubscriptionDeleteCallType) object);
        {
            NodeManagementSubscriptionDeleteCallType.SubscriptionDelete leftSubscriptionDelete;
            leftSubscriptionDelete = this.getSubscriptionDelete();
            NodeManagementSubscriptionDeleteCallType.SubscriptionDelete rightSubscriptionDelete;
            rightSubscriptionDelete = that.getSubscriptionDelete();
            if (this.subscriptionDelete!= null) {
                if (that.subscriptionDelete!= null) {
                    if (!leftSubscriptionDelete.equals(rightSubscriptionDelete)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.subscriptionDelete!= null) {
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
            NodeManagementSubscriptionDeleteCallType.SubscriptionDelete theSubscriptionDelete;
            theSubscriptionDelete = this.getSubscriptionDelete();
            if (this.subscriptionDelete!= null) {
                currentHashCode += theSubscriptionDelete.hashCode();
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
            NodeManagementSubscriptionDeleteCallType.SubscriptionDelete theSubscriptionDelete;
            theSubscriptionDelete = this.getSubscriptionDelete();
            strategy.appendField(locator, this, "subscriptionDelete", buffer, theSubscriptionDelete, (this.subscriptionDelete!= null));
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
     *     &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}SubscriptionManagementDeleteCallType"&gt;
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
    @XmlType(name = "")
    public static class SubscriptionDelete
        extends SubscriptionManagementDeleteCallType
        implements Cloneable, CopyTo, ToString
    {


        /**
         * Default no-arg constructor
         * 
         */
        public SubscriptionDelete() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public SubscriptionDelete(final Long subscriptionId, final FeatureAddressType clientAddress, final FeatureAddressType serverAddress) {
            super(subscriptionId, clientAddress, serverAddress);
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
        @Override
        public NodeManagementSubscriptionDeleteCallType.SubscriptionDelete withSubscriptionId(Long value) {
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
        @Override
        public NodeManagementSubscriptionDeleteCallType.SubscriptionDelete withClientAddress(FeatureAddressType value) {
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
        public NodeManagementSubscriptionDeleteCallType.SubscriptionDelete withServerAddress(FeatureAddressType value) {
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
            super.copyTo(locator, draftCopy, strategy);
            return draftCopy;
        }

        @Override
        public Object createNewInstance() {
            return new NodeManagementSubscriptionDeleteCallType.SubscriptionDelete();
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
