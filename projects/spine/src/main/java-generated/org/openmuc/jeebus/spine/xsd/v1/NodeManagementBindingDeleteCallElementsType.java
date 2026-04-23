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
 * <p>Java class for NodeManagementBindingDeleteCallElementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NodeManagementBindingDeleteCallElementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bindingDelete" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}BindingManagementDeleteCallElementsType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="bindingId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
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
@XmlType(name = "NodeManagementBindingDeleteCallElementsType", propOrder = {
    "bindingDelete"
})
public class NodeManagementBindingDeleteCallElementsType implements Cloneable, CopyTo, ToString
{

    protected NodeManagementBindingDeleteCallElementsType.BindingDelete bindingDelete;

    /**
     * Default no-arg constructor
     * 
     */
    public NodeManagementBindingDeleteCallElementsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public NodeManagementBindingDeleteCallElementsType(final NodeManagementBindingDeleteCallElementsType.BindingDelete bindingDelete) {
        this.bindingDelete = bindingDelete;
    }

    /**
     * Gets the value of the bindingDelete property.
     * 
     * @return
     *     possible object is
     *     {@link NodeManagementBindingDeleteCallElementsType.BindingDelete }
     *     
     */
    public NodeManagementBindingDeleteCallElementsType.BindingDelete getBindingDelete() {
        return bindingDelete;
    }

    /**
     * Sets the value of the bindingDelete property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeManagementBindingDeleteCallElementsType.BindingDelete }
     *     
     */
    public void setBindingDelete(NodeManagementBindingDeleteCallElementsType.BindingDelete value) {
        this.bindingDelete = value;
    }

    /**
     * Sets the value of the bindingDelete property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeManagementBindingDeleteCallElementsType.BindingDelete }
     * @return
     *     The class instance
     */
    public NodeManagementBindingDeleteCallElementsType withBindingDelete(NodeManagementBindingDeleteCallElementsType.BindingDelete value) {
        setBindingDelete(value);
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
        if (draftCopy instanceof NodeManagementBindingDeleteCallElementsType) {
            final NodeManagementBindingDeleteCallElementsType copy = ((NodeManagementBindingDeleteCallElementsType) draftCopy);
            {
                Boolean bindingDeleteShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.bindingDelete!= null));
                if (bindingDeleteShouldBeCopiedAndSet == Boolean.TRUE) {
                    NodeManagementBindingDeleteCallElementsType.BindingDelete sourceBindingDelete;
                    sourceBindingDelete = this.getBindingDelete();
                    NodeManagementBindingDeleteCallElementsType.BindingDelete copyBindingDelete = ((NodeManagementBindingDeleteCallElementsType.BindingDelete) strategy.copy(LocatorUtils.property(locator, "bindingDelete", sourceBindingDelete), sourceBindingDelete, (this.bindingDelete!= null)));
                    copy.setBindingDelete(copyBindingDelete);
                } else {
                    if (bindingDeleteShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.bindingDelete = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new NodeManagementBindingDeleteCallElementsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final NodeManagementBindingDeleteCallElementsType that = ((NodeManagementBindingDeleteCallElementsType) object);
        {
            NodeManagementBindingDeleteCallElementsType.BindingDelete leftBindingDelete;
            leftBindingDelete = this.getBindingDelete();
            NodeManagementBindingDeleteCallElementsType.BindingDelete rightBindingDelete;
            rightBindingDelete = that.getBindingDelete();
            if (this.bindingDelete!= null) {
                if (that.bindingDelete!= null) {
                    if (!leftBindingDelete.equals(rightBindingDelete)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.bindingDelete!= null) {
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
            NodeManagementBindingDeleteCallElementsType.BindingDelete theBindingDelete;
            theBindingDelete = this.getBindingDelete();
            if (this.bindingDelete!= null) {
                currentHashCode += theBindingDelete.hashCode();
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
            NodeManagementBindingDeleteCallElementsType.BindingDelete theBindingDelete;
            theBindingDelete = this.getBindingDelete();
            strategy.appendField(locator, this, "bindingDelete", buffer, theBindingDelete, (this.bindingDelete!= null));
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
     *     &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}BindingManagementDeleteCallElementsType"&gt;
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
    @XmlType(name = "")
    public static class BindingDelete
        extends BindingManagementDeleteCallElementsType
        implements Cloneable, CopyTo, ToString
    {


        /**
         * Default no-arg constructor
         * 
         */
        public BindingDelete() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public BindingDelete(final ElementTagType bindingId, final FeatureAddressElementsType clientAddress, final FeatureAddressElementsType serverAddress) {
            super(bindingId, clientAddress, serverAddress);
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
        public NodeManagementBindingDeleteCallElementsType.BindingDelete withBindingId(ElementTagType value) {
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
        public NodeManagementBindingDeleteCallElementsType.BindingDelete withClientAddress(FeatureAddressElementsType value) {
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
        public NodeManagementBindingDeleteCallElementsType.BindingDelete withServerAddress(FeatureAddressElementsType value) {
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
            return new NodeManagementBindingDeleteCallElementsType.BindingDelete();
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
