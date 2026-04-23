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
 * <p>Java class for NodeManagementBindingDataElementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NodeManagementBindingDataElementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bindingEntry" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}BindingManagementEntryDataElementsType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="bindingId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
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
@XmlType(name = "NodeManagementBindingDataElementsType", propOrder = {
    "bindingEntry"
})
public class NodeManagementBindingDataElementsType implements Cloneable, CopyTo, ToString
{

    protected NodeManagementBindingDataElementsType.BindingEntry bindingEntry;

    /**
     * Default no-arg constructor
     * 
     */
    public NodeManagementBindingDataElementsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public NodeManagementBindingDataElementsType(final NodeManagementBindingDataElementsType.BindingEntry bindingEntry) {
        this.bindingEntry = bindingEntry;
    }

    /**
     * Gets the value of the bindingEntry property.
     * 
     * @return
     *     possible object is
     *     {@link NodeManagementBindingDataElementsType.BindingEntry }
     *     
     */
    public NodeManagementBindingDataElementsType.BindingEntry getBindingEntry() {
        return bindingEntry;
    }

    /**
     * Sets the value of the bindingEntry property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeManagementBindingDataElementsType.BindingEntry }
     *     
     */
    public void setBindingEntry(NodeManagementBindingDataElementsType.BindingEntry value) {
        this.bindingEntry = value;
    }

    /**
     * Sets the value of the bindingEntry property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeManagementBindingDataElementsType.BindingEntry }
     * @return
     *     The class instance
     */
    public NodeManagementBindingDataElementsType withBindingEntry(NodeManagementBindingDataElementsType.BindingEntry value) {
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
        if (draftCopy instanceof NodeManagementBindingDataElementsType) {
            final NodeManagementBindingDataElementsType copy = ((NodeManagementBindingDataElementsType) draftCopy);
            {
                Boolean bindingEntryShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.bindingEntry!= null));
                if (bindingEntryShouldBeCopiedAndSet == Boolean.TRUE) {
                    NodeManagementBindingDataElementsType.BindingEntry sourceBindingEntry;
                    sourceBindingEntry = this.getBindingEntry();
                    NodeManagementBindingDataElementsType.BindingEntry copyBindingEntry = ((NodeManagementBindingDataElementsType.BindingEntry) strategy.copy(LocatorUtils.property(locator, "bindingEntry", sourceBindingEntry), sourceBindingEntry, (this.bindingEntry!= null)));
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
        return new NodeManagementBindingDataElementsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final NodeManagementBindingDataElementsType that = ((NodeManagementBindingDataElementsType) object);
        {
            NodeManagementBindingDataElementsType.BindingEntry leftBindingEntry;
            leftBindingEntry = this.getBindingEntry();
            NodeManagementBindingDataElementsType.BindingEntry rightBindingEntry;
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
            NodeManagementBindingDataElementsType.BindingEntry theBindingEntry;
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
            NodeManagementBindingDataElementsType.BindingEntry theBindingEntry;
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
     *     &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}BindingManagementEntryDataElementsType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="bindingId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
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
    public static class BindingEntry
        extends BindingManagementEntryDataElementsType
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
        public BindingEntry(final ElementTagType bindingId, final FeatureAddressElementsType clientAddress, final FeatureAddressElementsType serverAddress, final ElementTagType label, final ElementTagType description) {
            super(bindingId, clientAddress, serverAddress, label, description);
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
        @Override
        public NodeManagementBindingDataElementsType.BindingEntry withBindingId(ElementTagType value) {
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
        @Override
        public NodeManagementBindingDataElementsType.BindingEntry withClientAddress(FeatureAddressElementsType value) {
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
        public NodeManagementBindingDataElementsType.BindingEntry withServerAddress(FeatureAddressElementsType value) {
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
        public NodeManagementBindingDataElementsType.BindingEntry withLabel(ElementTagType value) {
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
        public NodeManagementBindingDataElementsType.BindingEntry withDescription(ElementTagType value) {
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
            return new NodeManagementBindingDataElementsType.BindingEntry();
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
