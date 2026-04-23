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
 * <p>Java class for NodeManagementBindingDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NodeManagementBindingDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bindingEntry" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}BindingManagementEntryDataType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="bindingId" type="{http://docs.eebus.org/spine/xsd/v1}BindingIdType" minOccurs="0"/&gt;
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
@XmlType(name = "NodeManagementBindingDataType", propOrder = {
    "bindingEntry"
})
public class NodeManagementBindingDataType implements Cloneable, CopyTo, ToString
{

    protected List<NodeManagementBindingDataType.BindingEntry> bindingEntry;

    /**
     * Default no-arg constructor
     * 
     */
    public NodeManagementBindingDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public NodeManagementBindingDataType(final List<NodeManagementBindingDataType.BindingEntry> bindingEntry) {
        this.bindingEntry = bindingEntry;
    }

    /**
     * Gets the value of the bindingEntry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the bindingEntry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBindingEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NodeManagementBindingDataType.BindingEntry }
     * 
     * 
     */
    public List<NodeManagementBindingDataType.BindingEntry> getBindingEntry() {
        if (bindingEntry == null) {
            bindingEntry = new ArrayList<NodeManagementBindingDataType.BindingEntry>();
        }
        return this.bindingEntry;
    }

    /**
     * Adds objects to the list of BindingEntry using add method
     * 
     * @param values
     *     objects to add to the list BindingEntry
     * @return
     *     The class instance
     */
    public NodeManagementBindingDataType withBindingEntry(NodeManagementBindingDataType.BindingEntry... values) {
        if (values!= null) {
            for (NodeManagementBindingDataType.BindingEntry value: values) {
                getBindingEntry().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of BindingEntry using addAll method
     * 
     * @param values
     *     objects to add to the list BindingEntry
     * @return
     *     The class instance
     */
    public NodeManagementBindingDataType withBindingEntry(Collection<NodeManagementBindingDataType.BindingEntry> values) {
        if (values!= null) {
            getBindingEntry().addAll(values);
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
        if (draftCopy instanceof NodeManagementBindingDataType) {
            final NodeManagementBindingDataType copy = ((NodeManagementBindingDataType) draftCopy);
            {
                Boolean bindingEntryShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.bindingEntry!= null)&&(!this.bindingEntry.isEmpty())));
                if (bindingEntryShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<NodeManagementBindingDataType.BindingEntry> sourceBindingEntry;
                    sourceBindingEntry = (((this.bindingEntry!= null)&&(!this.bindingEntry.isEmpty()))?this.getBindingEntry():null);
                    @SuppressWarnings("unchecked")
                    List<NodeManagementBindingDataType.BindingEntry> copyBindingEntry = ((List<NodeManagementBindingDataType.BindingEntry> ) strategy.copy(LocatorUtils.property(locator, "bindingEntry", sourceBindingEntry), sourceBindingEntry, ((this.bindingEntry!= null)&&(!this.bindingEntry.isEmpty()))));
                    copy.bindingEntry = null;
                    if (copyBindingEntry!= null) {
                        List<NodeManagementBindingDataType.BindingEntry> uniqueBindingEntryl = copy.getBindingEntry();
                        uniqueBindingEntryl.addAll(copyBindingEntry);
                    }
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
        return new NodeManagementBindingDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final NodeManagementBindingDataType that = ((NodeManagementBindingDataType) object);
        {
            List<NodeManagementBindingDataType.BindingEntry> leftBindingEntry;
            leftBindingEntry = (((this.bindingEntry!= null)&&(!this.bindingEntry.isEmpty()))?this.getBindingEntry():null);
            List<NodeManagementBindingDataType.BindingEntry> rightBindingEntry;
            rightBindingEntry = (((that.bindingEntry!= null)&&(!that.bindingEntry.isEmpty()))?that.getBindingEntry():null);
            if ((this.bindingEntry!= null)&&(!this.bindingEntry.isEmpty())) {
                if ((that.bindingEntry!= null)&&(!that.bindingEntry.isEmpty())) {
                    if (!leftBindingEntry.equals(rightBindingEntry)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.bindingEntry!= null)&&(!that.bindingEntry.isEmpty())) {
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
            List<NodeManagementBindingDataType.BindingEntry> theBindingEntry;
            theBindingEntry = (((this.bindingEntry!= null)&&(!this.bindingEntry.isEmpty()))?this.getBindingEntry():null);
            if ((this.bindingEntry!= null)&&(!this.bindingEntry.isEmpty())) {
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
            List<NodeManagementBindingDataType.BindingEntry> theBindingEntry;
            theBindingEntry = (((this.bindingEntry!= null)&&(!this.bindingEntry.isEmpty()))?this.getBindingEntry():null);
            strategy.appendField(locator, this, "bindingEntry", buffer, theBindingEntry, ((this.bindingEntry!= null)&&(!this.bindingEntry.isEmpty())));
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
     *     &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}BindingManagementEntryDataType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="bindingId" type="{http://docs.eebus.org/spine/xsd/v1}BindingIdType" minOccurs="0"/&gt;
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
    public static class BindingEntry
        extends BindingManagementEntryDataType
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
        public BindingEntry(final Long bindingId, final FeatureAddressType clientAddress, final FeatureAddressType serverAddress, final String label, final String description) {
            super(bindingId, clientAddress, serverAddress, label, description);
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
        public NodeManagementBindingDataType.BindingEntry withBindingId(Long value) {
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
        public NodeManagementBindingDataType.BindingEntry withClientAddress(FeatureAddressType value) {
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
        public NodeManagementBindingDataType.BindingEntry withServerAddress(FeatureAddressType value) {
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
        public NodeManagementBindingDataType.BindingEntry withLabel(String value) {
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
        public NodeManagementBindingDataType.BindingEntry withDescription(String value) {
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
            return new NodeManagementBindingDataType.BindingEntry();
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
