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
 * <p>Java class for NodeManagementBindingDataSelectorsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NodeManagementBindingDataSelectorsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bindingEntry" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}BindingManagementEntryListDataSelectorsType"&gt;
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
@XmlType(name = "NodeManagementBindingDataSelectorsType", propOrder = {
    "bindingEntry"
})
public class NodeManagementBindingDataSelectorsType implements Cloneable, CopyTo, ToString
{

    protected NodeManagementBindingDataSelectorsType.BindingEntry bindingEntry;

    /**
     * Default no-arg constructor
     * 
     */
    public NodeManagementBindingDataSelectorsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public NodeManagementBindingDataSelectorsType(final NodeManagementBindingDataSelectorsType.BindingEntry bindingEntry) {
        this.bindingEntry = bindingEntry;
    }

    /**
     * Gets the value of the bindingEntry property.
     * 
     * @return
     *     possible object is
     *     {@link NodeManagementBindingDataSelectorsType.BindingEntry }
     *     
     */
    public NodeManagementBindingDataSelectorsType.BindingEntry getBindingEntry() {
        return bindingEntry;
    }

    /**
     * Sets the value of the bindingEntry property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeManagementBindingDataSelectorsType.BindingEntry }
     *     
     */
    public void setBindingEntry(NodeManagementBindingDataSelectorsType.BindingEntry value) {
        this.bindingEntry = value;
    }

    /**
     * Sets the value of the bindingEntry property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeManagementBindingDataSelectorsType.BindingEntry }
     * @return
     *     The class instance
     */
    public NodeManagementBindingDataSelectorsType withBindingEntry(NodeManagementBindingDataSelectorsType.BindingEntry value) {
        setBindingEntry(value);
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
        if (draftCopy instanceof NodeManagementBindingDataSelectorsType) {
            final NodeManagementBindingDataSelectorsType copy = ((NodeManagementBindingDataSelectorsType) draftCopy);
            {
                Boolean bindingEntryShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.bindingEntry!= null));
                if (bindingEntryShouldBeCopiedAndSet == Boolean.TRUE) {
                    NodeManagementBindingDataSelectorsType.BindingEntry sourceBindingEntry;
                    sourceBindingEntry = this.getBindingEntry();
                    NodeManagementBindingDataSelectorsType.BindingEntry copyBindingEntry = ((NodeManagementBindingDataSelectorsType.BindingEntry) strategy.copy(LocatorUtils.property(locator, "bindingEntry", sourceBindingEntry), sourceBindingEntry, (this.bindingEntry!= null)));
                    copy.setBindingEntry(copyBindingEntry);
                } else {
                    if (bindingEntryShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.bindingEntry = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new NodeManagementBindingDataSelectorsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final NodeManagementBindingDataSelectorsType that = ((NodeManagementBindingDataSelectorsType) object);
        {
            NodeManagementBindingDataSelectorsType.BindingEntry leftBindingEntry;
            leftBindingEntry = this.getBindingEntry();
            NodeManagementBindingDataSelectorsType.BindingEntry rightBindingEntry;
            rightBindingEntry = that.getBindingEntry();
            if (this.bindingEntry!= null) {
                if (that.bindingEntry!= null) {
                    if (!leftBindingEntry.equals(rightBindingEntry)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.bindingEntry!= null) {
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
            NodeManagementBindingDataSelectorsType.BindingEntry theBindingEntry;
            theBindingEntry = this.getBindingEntry();
            if (this.bindingEntry!= null) {
                currentHashCode += theBindingEntry.hashCode();
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
            NodeManagementBindingDataSelectorsType.BindingEntry theBindingEntry;
            theBindingEntry = this.getBindingEntry();
            strategy.appendField(locator, this, "bindingEntry", buffer, theBindingEntry, (this.bindingEntry!= null));
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
     *     &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}BindingManagementEntryListDataSelectorsType"&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class BindingEntry
        extends BindingManagementEntryListDataSelectorsType
        implements Cloneable, CopyTo, ToString
    {


        /**
         * Default no-arg constructor
         * 
         */
        public BindingEntry() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public BindingEntry(final Long bindingId, final FeatureAddressType clientAddress, final FeatureAddressType serverAddress) {
            super(bindingId, clientAddress, serverAddress);
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
        @Override
        public NodeManagementBindingDataSelectorsType.BindingEntry withBindingId(Long value) {
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
        @Override
        public NodeManagementBindingDataSelectorsType.BindingEntry withClientAddress(FeatureAddressType value) {
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
        public NodeManagementBindingDataSelectorsType.BindingEntry withServerAddress(FeatureAddressType value) {
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
            return new NodeManagementBindingDataSelectorsType.BindingEntry();
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
