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
 * <p>Java class for NodeManagementSubscriptionDeleteCallElementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NodeManagementSubscriptionDeleteCallElementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="subscriptionDelete" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}SubscriptionManagementDeleteCallElementsType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="subscriptionId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *                   &lt;element name="clientAddress" type="{http://docs.eebus.org/spine/xsd/v1}FeatureAddressElementsType" minOccurs="0"/&gt;
 *                   &lt;element name="serverAddress" type="{http://docs.eebus.org/spine/xsd/v1}FeatureAddressElementsType" minOccurs="0"/&gt;
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
@XmlType(name = "NodeManagementSubscriptionDeleteCallElementsType", propOrder = {
    "subscriptionDelete"
})
public class NodeManagementSubscriptionDeleteCallElementsType implements Cloneable, CopyTo, ToString
{

    protected NodeManagementSubscriptionDeleteCallElementsType.SubscriptionDelete subscriptionDelete;

    /**
     * Default no-arg constructor
     * 
     */
    public NodeManagementSubscriptionDeleteCallElementsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public NodeManagementSubscriptionDeleteCallElementsType(final NodeManagementSubscriptionDeleteCallElementsType.SubscriptionDelete subscriptionDelete) {
        this.subscriptionDelete = subscriptionDelete;
    }

    /**
     * Gets the value of the subscriptionDelete property.
     * 
     * @return
     *     possible object is
     *     {@link NodeManagementSubscriptionDeleteCallElementsType.SubscriptionDelete }
     *     
     */
    public NodeManagementSubscriptionDeleteCallElementsType.SubscriptionDelete getSubscriptionDelete() {
        return subscriptionDelete;
    }

    /**
     * Sets the value of the subscriptionDelete property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeManagementSubscriptionDeleteCallElementsType.SubscriptionDelete }
     *     
     */
    public void setSubscriptionDelete(NodeManagementSubscriptionDeleteCallElementsType.SubscriptionDelete value) {
        this.subscriptionDelete = value;
    }

    /**
     * Sets the value of the subscriptionDelete property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeManagementSubscriptionDeleteCallElementsType.SubscriptionDelete }
     * @return
     *     The class instance
     */
    public NodeManagementSubscriptionDeleteCallElementsType withSubscriptionDelete(NodeManagementSubscriptionDeleteCallElementsType.SubscriptionDelete value) {
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
        if (draftCopy instanceof NodeManagementSubscriptionDeleteCallElementsType) {
            final NodeManagementSubscriptionDeleteCallElementsType copy = ((NodeManagementSubscriptionDeleteCallElementsType) draftCopy);
            {
                Boolean subscriptionDeleteShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.subscriptionDelete!= null));
                if (subscriptionDeleteShouldBeCopiedAndSet == Boolean.TRUE) {
                    NodeManagementSubscriptionDeleteCallElementsType.SubscriptionDelete sourceSubscriptionDelete;
                    sourceSubscriptionDelete = this.getSubscriptionDelete();
                    NodeManagementSubscriptionDeleteCallElementsType.SubscriptionDelete copySubscriptionDelete = ((NodeManagementSubscriptionDeleteCallElementsType.SubscriptionDelete) strategy.copy(LocatorUtils.property(locator, "subscriptionDelete", sourceSubscriptionDelete), sourceSubscriptionDelete, (this.subscriptionDelete!= null)));
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
        return new NodeManagementSubscriptionDeleteCallElementsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final NodeManagementSubscriptionDeleteCallElementsType that = ((NodeManagementSubscriptionDeleteCallElementsType) object);
        {
            NodeManagementSubscriptionDeleteCallElementsType.SubscriptionDelete leftSubscriptionDelete;
            leftSubscriptionDelete = this.getSubscriptionDelete();
            NodeManagementSubscriptionDeleteCallElementsType.SubscriptionDelete rightSubscriptionDelete;
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
            NodeManagementSubscriptionDeleteCallElementsType.SubscriptionDelete theSubscriptionDelete;
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
            NodeManagementSubscriptionDeleteCallElementsType.SubscriptionDelete theSubscriptionDelete;
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
     *     &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}SubscriptionManagementDeleteCallElementsType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="subscriptionId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
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
    @XmlType(name = "")
    public static class SubscriptionDelete
        extends SubscriptionManagementDeleteCallElementsType
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
        public SubscriptionDelete(final ElementTagType subscriptionId, final FeatureAddressElementsType clientAddress, final FeatureAddressElementsType serverAddress) {
            super(subscriptionId, clientAddress, serverAddress);
        }

        /**
         * Sets the value of the subscriptionId property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElementTagType }
         * @return
         *     The class instance
         */
        @Override
        public NodeManagementSubscriptionDeleteCallElementsType.SubscriptionDelete withSubscriptionId(ElementTagType value) {
            setSubscriptionId(value);
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
        @Override
        public NodeManagementSubscriptionDeleteCallElementsType.SubscriptionDelete withClientAddress(FeatureAddressElementsType value) {
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
        @Override
        public NodeManagementSubscriptionDeleteCallElementsType.SubscriptionDelete withServerAddress(FeatureAddressElementsType value) {
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
            return new NodeManagementSubscriptionDeleteCallElementsType.SubscriptionDelete();
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
