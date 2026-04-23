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
 * <p>Java class for NodeManagementSubscriptionDataElementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NodeManagementSubscriptionDataElementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="subscriptionEntry" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}SubscriptionManagementEntryDataElementsType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="subscriptionId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *                   &lt;element name="clientAddress" type="{http://docs.eebus.org/spine/xsd/v1}FeatureAddressElementsType" minOccurs="0"/&gt;
 *                   &lt;element name="serverAddress" type="{http://docs.eebus.org/spine/xsd/v1}FeatureAddressElementsType" minOccurs="0"/&gt;
 *                   &lt;element name="label" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *                   &lt;element name="description" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
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
@XmlType(name = "NodeManagementSubscriptionDataElementsType", propOrder = {
    "subscriptionEntry"
})
public class NodeManagementSubscriptionDataElementsType implements Cloneable, CopyTo, ToString
{

    protected NodeManagementSubscriptionDataElementsType.SubscriptionEntry subscriptionEntry;

    /**
     * Default no-arg constructor
     * 
     */
    public NodeManagementSubscriptionDataElementsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public NodeManagementSubscriptionDataElementsType(final NodeManagementSubscriptionDataElementsType.SubscriptionEntry subscriptionEntry) {
        this.subscriptionEntry = subscriptionEntry;
    }

    /**
     * Gets the value of the subscriptionEntry property.
     * 
     * @return
     *     possible object is
     *     {@link NodeManagementSubscriptionDataElementsType.SubscriptionEntry }
     *     
     */
    public NodeManagementSubscriptionDataElementsType.SubscriptionEntry getSubscriptionEntry() {
        return subscriptionEntry;
    }

    /**
     * Sets the value of the subscriptionEntry property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeManagementSubscriptionDataElementsType.SubscriptionEntry }
     *     
     */
    public void setSubscriptionEntry(NodeManagementSubscriptionDataElementsType.SubscriptionEntry value) {
        this.subscriptionEntry = value;
    }

    /**
     * Sets the value of the subscriptionEntry property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeManagementSubscriptionDataElementsType.SubscriptionEntry }
     * @return
     *     The class instance
     */
    public NodeManagementSubscriptionDataElementsType withSubscriptionEntry(NodeManagementSubscriptionDataElementsType.SubscriptionEntry value) {
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
        if (draftCopy instanceof NodeManagementSubscriptionDataElementsType) {
            final NodeManagementSubscriptionDataElementsType copy = ((NodeManagementSubscriptionDataElementsType) draftCopy);
            {
                Boolean subscriptionEntryShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.subscriptionEntry!= null));
                if (subscriptionEntryShouldBeCopiedAndSet == Boolean.TRUE) {
                    NodeManagementSubscriptionDataElementsType.SubscriptionEntry sourceSubscriptionEntry;
                    sourceSubscriptionEntry = this.getSubscriptionEntry();
                    NodeManagementSubscriptionDataElementsType.SubscriptionEntry copySubscriptionEntry = ((NodeManagementSubscriptionDataElementsType.SubscriptionEntry) strategy.copy(LocatorUtils.property(locator, "subscriptionEntry", sourceSubscriptionEntry), sourceSubscriptionEntry, (this.subscriptionEntry!= null)));
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
        return new NodeManagementSubscriptionDataElementsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final NodeManagementSubscriptionDataElementsType that = ((NodeManagementSubscriptionDataElementsType) object);
        {
            NodeManagementSubscriptionDataElementsType.SubscriptionEntry leftSubscriptionEntry;
            leftSubscriptionEntry = this.getSubscriptionEntry();
            NodeManagementSubscriptionDataElementsType.SubscriptionEntry rightSubscriptionEntry;
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
            NodeManagementSubscriptionDataElementsType.SubscriptionEntry theSubscriptionEntry;
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
            NodeManagementSubscriptionDataElementsType.SubscriptionEntry theSubscriptionEntry;
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
     *     &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}SubscriptionManagementEntryDataElementsType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="subscriptionId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
     *         &lt;element name="clientAddress" type="{http://docs.eebus.org/spine/xsd/v1}FeatureAddressElementsType" minOccurs="0"/&gt;
     *         &lt;element name="serverAddress" type="{http://docs.eebus.org/spine/xsd/v1}FeatureAddressElementsType" minOccurs="0"/&gt;
     *         &lt;element name="label" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
     *         &lt;element name="description" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
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
        extends SubscriptionManagementEntryDataElementsType
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
        public SubscriptionEntry(final ElementTagType subscriptionId, final FeatureAddressElementsType clientAddress, final FeatureAddressElementsType serverAddress, final ElementTagType label, final ElementTagType description) {
            super(subscriptionId, clientAddress, serverAddress, label, description);
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
        public NodeManagementSubscriptionDataElementsType.SubscriptionEntry withSubscriptionId(ElementTagType value) {
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
        public NodeManagementSubscriptionDataElementsType.SubscriptionEntry withClientAddress(FeatureAddressElementsType value) {
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
        public NodeManagementSubscriptionDataElementsType.SubscriptionEntry withServerAddress(FeatureAddressElementsType value) {
            setServerAddress(value);
            return this;
        }

        /**
         * Sets the value of the label property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElementTagType }
         * @return
         *     The class instance
         */
        @Override
        public NodeManagementSubscriptionDataElementsType.SubscriptionEntry withLabel(ElementTagType value) {
            setLabel(value);
            return this;
        }

        /**
         * Sets the value of the description property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElementTagType }
         * @return
         *     The class instance
         */
        @Override
        public NodeManagementSubscriptionDataElementsType.SubscriptionEntry withDescription(ElementTagType value) {
            setDescription(value);
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
            return new NodeManagementSubscriptionDataElementsType.SubscriptionEntry();
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
