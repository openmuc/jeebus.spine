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

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
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
 * <p>Java class for NodeManagementSubscriptionDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NodeManagementSubscriptionDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="subscriptionEntry" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}SubscriptionManagementEntryDataType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="subscriptionId" type="{http://docs.eebus.org/spine/xsd/v1}SubscriptionIdType" minOccurs="0"/&gt;
 *                   &lt;element name="clientAddress" type="{http://docs.eebus.org/spine/xsd/v1}FeatureAddressType" minOccurs="0"/&gt;
 *                   &lt;element name="serverAddress" type="{http://docs.eebus.org/spine/xsd/v1}FeatureAddressType" minOccurs="0"/&gt;
 *                   &lt;element name="label" type="{http://docs.eebus.org/spine/xsd/v1}LabelType" minOccurs="0"/&gt;
 *                   &lt;element name="description" type="{http://docs.eebus.org/spine/xsd/v1}DescriptionType" minOccurs="0"/&gt;
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
@XmlType(name = "NodeManagementSubscriptionDataType", propOrder = {
    "subscriptionEntry"
})
public class NodeManagementSubscriptionDataType implements Cloneable, CopyTo, ToString
{

    protected List<NodeManagementSubscriptionDataType.SubscriptionEntry> subscriptionEntry;

    /**
     * Default no-arg constructor
     * 
     */
    public NodeManagementSubscriptionDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public NodeManagementSubscriptionDataType(final List<NodeManagementSubscriptionDataType.SubscriptionEntry> subscriptionEntry) {
        this.subscriptionEntry = subscriptionEntry;
    }

    /**
     * Gets the value of the subscriptionEntry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the subscriptionEntry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubscriptionEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NodeManagementSubscriptionDataType.SubscriptionEntry }
     * 
     * 
     */
    public List<NodeManagementSubscriptionDataType.SubscriptionEntry> getSubscriptionEntry() {
        if (subscriptionEntry == null) {
            subscriptionEntry = new ArrayList<NodeManagementSubscriptionDataType.SubscriptionEntry>();
        }
        return this.subscriptionEntry;
    }

    /**
     * Adds objects to the list of SubscriptionEntry using add method
     * 
     * @param values
     *     objects to add to the list SubscriptionEntry
     * @return
     *     The class instance
     */
    public NodeManagementSubscriptionDataType withSubscriptionEntry(NodeManagementSubscriptionDataType.SubscriptionEntry... values) {
        if (values!= null) {
            for (NodeManagementSubscriptionDataType.SubscriptionEntry value: values) {
                getSubscriptionEntry().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of SubscriptionEntry using addAll method
     * 
     * @param values
     *     objects to add to the list SubscriptionEntry
     * @return
     *     The class instance
     */
    public NodeManagementSubscriptionDataType withSubscriptionEntry(Collection<NodeManagementSubscriptionDataType.SubscriptionEntry> values) {
        if (values!= null) {
            getSubscriptionEntry().addAll(values);
        }
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
        if (draftCopy instanceof NodeManagementSubscriptionDataType) {
            final NodeManagementSubscriptionDataType copy = ((NodeManagementSubscriptionDataType) draftCopy);
            {
                Boolean subscriptionEntryShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.subscriptionEntry!= null)&&(!this.subscriptionEntry.isEmpty())));
                if (subscriptionEntryShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<NodeManagementSubscriptionDataType.SubscriptionEntry> sourceSubscriptionEntry;
                    sourceSubscriptionEntry = (((this.subscriptionEntry!= null)&&(!this.subscriptionEntry.isEmpty()))?this.getSubscriptionEntry():null);
                    @SuppressWarnings("unchecked")
                    List<NodeManagementSubscriptionDataType.SubscriptionEntry> copySubscriptionEntry = ((List<NodeManagementSubscriptionDataType.SubscriptionEntry> ) strategy.copy(LocatorUtils.property(locator, "subscriptionEntry", sourceSubscriptionEntry), sourceSubscriptionEntry, ((this.subscriptionEntry!= null)&&(!this.subscriptionEntry.isEmpty()))));
                    copy.subscriptionEntry = null;
                    if (copySubscriptionEntry!= null) {
                        List<NodeManagementSubscriptionDataType.SubscriptionEntry> uniqueSubscriptionEntryl = copy.getSubscriptionEntry();
                        uniqueSubscriptionEntryl.addAll(copySubscriptionEntry);
                    }
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
        return new NodeManagementSubscriptionDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final NodeManagementSubscriptionDataType that = ((NodeManagementSubscriptionDataType) object);
        {
            List<NodeManagementSubscriptionDataType.SubscriptionEntry> leftSubscriptionEntry;
            leftSubscriptionEntry = (((this.subscriptionEntry!= null)&&(!this.subscriptionEntry.isEmpty()))?this.getSubscriptionEntry():null);
            List<NodeManagementSubscriptionDataType.SubscriptionEntry> rightSubscriptionEntry;
            rightSubscriptionEntry = (((that.subscriptionEntry!= null)&&(!that.subscriptionEntry.isEmpty()))?that.getSubscriptionEntry():null);
            if ((this.subscriptionEntry!= null)&&(!this.subscriptionEntry.isEmpty())) {
                if ((that.subscriptionEntry!= null)&&(!that.subscriptionEntry.isEmpty())) {
                    if (!leftSubscriptionEntry.equals(rightSubscriptionEntry)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.subscriptionEntry!= null)&&(!that.subscriptionEntry.isEmpty())) {
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
            List<NodeManagementSubscriptionDataType.SubscriptionEntry> theSubscriptionEntry;
            theSubscriptionEntry = (((this.subscriptionEntry!= null)&&(!this.subscriptionEntry.isEmpty()))?this.getSubscriptionEntry():null);
            if ((this.subscriptionEntry!= null)&&(!this.subscriptionEntry.isEmpty())) {
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
            List<NodeManagementSubscriptionDataType.SubscriptionEntry> theSubscriptionEntry;
            theSubscriptionEntry = (((this.subscriptionEntry!= null)&&(!this.subscriptionEntry.isEmpty()))?this.getSubscriptionEntry():null);
            strategy.appendField(locator, this, "subscriptionEntry", buffer, theSubscriptionEntry, ((this.subscriptionEntry!= null)&&(!this.subscriptionEntry.isEmpty())));
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
     *     &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}SubscriptionManagementEntryDataType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="subscriptionId" type="{http://docs.eebus.org/spine/xsd/v1}SubscriptionIdType" minOccurs="0"/&gt;
     *         &lt;element name="clientAddress" type="{http://docs.eebus.org/spine/xsd/v1}FeatureAddressType" minOccurs="0"/&gt;
     *         &lt;element name="serverAddress" type="{http://docs.eebus.org/spine/xsd/v1}FeatureAddressType" minOccurs="0"/&gt;
     *         &lt;element name="label" type="{http://docs.eebus.org/spine/xsd/v1}LabelType" minOccurs="0"/&gt;
     *         &lt;element name="description" type="{http://docs.eebus.org/spine/xsd/v1}DescriptionType" minOccurs="0"/&gt;
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
        extends SubscriptionManagementEntryDataType
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
        public SubscriptionEntry(final Long subscriptionId, final FeatureAddressType clientAddress, final FeatureAddressType serverAddress, final String label, final String description) {
            super(subscriptionId, clientAddress, serverAddress, label, description);
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
        public NodeManagementSubscriptionDataType.SubscriptionEntry withSubscriptionId(Long value) {
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
        public NodeManagementSubscriptionDataType.SubscriptionEntry withClientAddress(FeatureAddressType value) {
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
        public NodeManagementSubscriptionDataType.SubscriptionEntry withServerAddress(FeatureAddressType value) {
            setServerAddress(value);
            return this;
        }

        /**
         * Sets the value of the label property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         * @return
         *     The class instance
         */
        @Override
        public NodeManagementSubscriptionDataType.SubscriptionEntry withLabel(String value) {
            setLabel(value);
            return this;
        }

        /**
         * Sets the value of the description property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         * @return
         *     The class instance
         */
        @Override
        public NodeManagementSubscriptionDataType.SubscriptionEntry withDescription(String value) {
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
            return new NodeManagementSubscriptionDataType.SubscriptionEntry();
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
