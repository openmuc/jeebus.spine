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
 * <p>Java class for NodeManagementSubscriptionDataSelectorsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NodeManagementSubscriptionDataSelectorsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="subscriptionEntry" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}SubscriptionManagementEntryListDataSelectorsType"&gt;
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
@XmlType(name = "NodeManagementSubscriptionDataSelectorsType", propOrder = {
    "subscriptionEntry"
})
public class NodeManagementSubscriptionDataSelectorsType implements Cloneable, CopyTo, ToString
{

    protected NodeManagementSubscriptionDataSelectorsType.SubscriptionEntry subscriptionEntry;

    /**
     * Default no-arg constructor
     * 
     */
    public NodeManagementSubscriptionDataSelectorsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public NodeManagementSubscriptionDataSelectorsType(final NodeManagementSubscriptionDataSelectorsType.SubscriptionEntry subscriptionEntry) {
        this.subscriptionEntry = subscriptionEntry;
    }

    /**
     * Gets the value of the subscriptionEntry property.
     * 
     * @return
     *     possible object is
     *     {@link NodeManagementSubscriptionDataSelectorsType.SubscriptionEntry }
     *     
     */
    public NodeManagementSubscriptionDataSelectorsType.SubscriptionEntry getSubscriptionEntry() {
        return subscriptionEntry;
    }

    /**
     * Sets the value of the subscriptionEntry property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeManagementSubscriptionDataSelectorsType.SubscriptionEntry }
     *     
     */
    public void setSubscriptionEntry(NodeManagementSubscriptionDataSelectorsType.SubscriptionEntry value) {
        this.subscriptionEntry = value;
    }

    /**
     * Sets the value of the subscriptionEntry property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeManagementSubscriptionDataSelectorsType.SubscriptionEntry }
     * @return
     *     The class instance
     */
    public NodeManagementSubscriptionDataSelectorsType withSubscriptionEntry(NodeManagementSubscriptionDataSelectorsType.SubscriptionEntry value) {
        setSubscriptionEntry(value);
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
        if (draftCopy instanceof NodeManagementSubscriptionDataSelectorsType) {
            final NodeManagementSubscriptionDataSelectorsType copy = ((NodeManagementSubscriptionDataSelectorsType) draftCopy);
            {
                Boolean subscriptionEntryShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.subscriptionEntry!= null));
                if (subscriptionEntryShouldBeCopiedAndSet == Boolean.TRUE) {
                    NodeManagementSubscriptionDataSelectorsType.SubscriptionEntry sourceSubscriptionEntry;
                    sourceSubscriptionEntry = this.getSubscriptionEntry();
                    NodeManagementSubscriptionDataSelectorsType.SubscriptionEntry copySubscriptionEntry = ((NodeManagementSubscriptionDataSelectorsType.SubscriptionEntry) strategy.copy(LocatorUtils.property(locator, "subscriptionEntry", sourceSubscriptionEntry), sourceSubscriptionEntry, (this.subscriptionEntry!= null)));
                    copy.setSubscriptionEntry(copySubscriptionEntry);
                } else {
                    if (subscriptionEntryShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.subscriptionEntry = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new NodeManagementSubscriptionDataSelectorsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final NodeManagementSubscriptionDataSelectorsType that = ((NodeManagementSubscriptionDataSelectorsType) object);
        {
            NodeManagementSubscriptionDataSelectorsType.SubscriptionEntry leftSubscriptionEntry;
            leftSubscriptionEntry = this.getSubscriptionEntry();
            NodeManagementSubscriptionDataSelectorsType.SubscriptionEntry rightSubscriptionEntry;
            rightSubscriptionEntry = that.getSubscriptionEntry();
            if (this.subscriptionEntry!= null) {
                if (that.subscriptionEntry!= null) {
                    if (!leftSubscriptionEntry.equals(rightSubscriptionEntry)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.subscriptionEntry!= null) {
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
            NodeManagementSubscriptionDataSelectorsType.SubscriptionEntry theSubscriptionEntry;
            theSubscriptionEntry = this.getSubscriptionEntry();
            if (this.subscriptionEntry!= null) {
                currentHashCode += theSubscriptionEntry.hashCode();
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
            NodeManagementSubscriptionDataSelectorsType.SubscriptionEntry theSubscriptionEntry;
            theSubscriptionEntry = this.getSubscriptionEntry();
            strategy.appendField(locator, this, "subscriptionEntry", buffer, theSubscriptionEntry, (this.subscriptionEntry!= null));
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
     *     &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}SubscriptionManagementEntryListDataSelectorsType"&gt;
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
    public static class SubscriptionEntry
        extends SubscriptionManagementEntryListDataSelectorsType
        implements Cloneable, CopyTo, ToString
    {


        /**
         * Default no-arg constructor
         * 
         */
        public SubscriptionEntry() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public SubscriptionEntry(final Long subscriptionId, final FeatureAddressType clientAddress, final FeatureAddressType serverAddress) {
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
        public NodeManagementSubscriptionDataSelectorsType.SubscriptionEntry withSubscriptionId(Long value) {
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
        public NodeManagementSubscriptionDataSelectorsType.SubscriptionEntry withClientAddress(FeatureAddressType value) {
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
        public NodeManagementSubscriptionDataSelectorsType.SubscriptionEntry withServerAddress(FeatureAddressType value) {
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
            return new NodeManagementSubscriptionDataSelectorsType.SubscriptionEntry();
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
