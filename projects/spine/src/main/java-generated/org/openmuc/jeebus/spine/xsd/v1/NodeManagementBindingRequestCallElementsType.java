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
 * <p>Java class for NodeManagementBindingRequestCallElementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NodeManagementBindingRequestCallElementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bindingRequest" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}BindingManagementRequestCallElementsType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="clientAddress" type="{http://docs.eebus.org/spine/xsd/v1}FeatureAddressElementsType" minOccurs="0"/&gt;
 *                   &lt;element name="serverAddress" type="{http://docs.eebus.org/spine/xsd/v1}FeatureAddressElementsType" minOccurs="0"/&gt;
 *                   &lt;element name="serverFeatureType" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
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
@XmlType(name = "NodeManagementBindingRequestCallElementsType", propOrder = {
    "bindingRequest"
})
public class NodeManagementBindingRequestCallElementsType implements Cloneable, CopyTo, ToString
{

    protected NodeManagementBindingRequestCallElementsType.BindingRequest bindingRequest;

    /**
     * Default no-arg constructor
     * 
     */
    public NodeManagementBindingRequestCallElementsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public NodeManagementBindingRequestCallElementsType(final NodeManagementBindingRequestCallElementsType.BindingRequest bindingRequest) {
        this.bindingRequest = bindingRequest;
    }

    /**
     * Gets the value of the bindingRequest property.
     * 
     * @return
     *     possible object is
     *     {@link NodeManagementBindingRequestCallElementsType.BindingRequest }
     *     
     */
    public NodeManagementBindingRequestCallElementsType.BindingRequest getBindingRequest() {
        return bindingRequest;
    }

    /**
     * Sets the value of the bindingRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeManagementBindingRequestCallElementsType.BindingRequest }
     *     
     */
    public void setBindingRequest(NodeManagementBindingRequestCallElementsType.BindingRequest value) {
        this.bindingRequest = value;
    }

    /**
     * Sets the value of the bindingRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeManagementBindingRequestCallElementsType.BindingRequest }
     * @return
     *     The class instance
     */
    public NodeManagementBindingRequestCallElementsType withBindingRequest(NodeManagementBindingRequestCallElementsType.BindingRequest value) {
        setBindingRequest(value);
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
        if (draftCopy instanceof NodeManagementBindingRequestCallElementsType) {
            final NodeManagementBindingRequestCallElementsType copy = ((NodeManagementBindingRequestCallElementsType) draftCopy);
            {
                Boolean bindingRequestShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.bindingRequest!= null));
                if (bindingRequestShouldBeCopiedAndSet == Boolean.TRUE) {
                    NodeManagementBindingRequestCallElementsType.BindingRequest sourceBindingRequest;
                    sourceBindingRequest = this.getBindingRequest();
                    NodeManagementBindingRequestCallElementsType.BindingRequest copyBindingRequest = ((NodeManagementBindingRequestCallElementsType.BindingRequest) strategy.copy(LocatorUtils.property(locator, "bindingRequest", sourceBindingRequest), sourceBindingRequest, (this.bindingRequest!= null)));
                    copy.setBindingRequest(copyBindingRequest);
                } else {
                    if (bindingRequestShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.bindingRequest = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new NodeManagementBindingRequestCallElementsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final NodeManagementBindingRequestCallElementsType that = ((NodeManagementBindingRequestCallElementsType) object);
        {
            NodeManagementBindingRequestCallElementsType.BindingRequest leftBindingRequest;
            leftBindingRequest = this.getBindingRequest();
            NodeManagementBindingRequestCallElementsType.BindingRequest rightBindingRequest;
            rightBindingRequest = that.getBindingRequest();
            if (this.bindingRequest!= null) {
                if (that.bindingRequest!= null) {
                    if (!leftBindingRequest.equals(rightBindingRequest)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.bindingRequest!= null) {
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
            NodeManagementBindingRequestCallElementsType.BindingRequest theBindingRequest;
            theBindingRequest = this.getBindingRequest();
            if (this.bindingRequest!= null) {
                currentHashCode += theBindingRequest.hashCode();
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
            NodeManagementBindingRequestCallElementsType.BindingRequest theBindingRequest;
            theBindingRequest = this.getBindingRequest();
            strategy.appendField(locator, this, "bindingRequest", buffer, theBindingRequest, (this.bindingRequest!= null));
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
     *     &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}BindingManagementRequestCallElementsType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="clientAddress" type="{http://docs.eebus.org/spine/xsd/v1}FeatureAddressElementsType" minOccurs="0"/&gt;
     *         &lt;element name="serverAddress" type="{http://docs.eebus.org/spine/xsd/v1}FeatureAddressElementsType" minOccurs="0"/&gt;
     *         &lt;element name="serverFeatureType" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
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
    public static class BindingRequest
        extends BindingManagementRequestCallElementsType
        implements Cloneable, CopyTo, ToString
    {


        /**
         * Default no-arg constructor
         * 
         */
        public BindingRequest() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public BindingRequest(final FeatureAddressElementsType clientAddress, final FeatureAddressElementsType serverAddress, final ElementTagType serverFeatureType) {
            super(clientAddress, serverAddress, serverFeatureType);
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
        public NodeManagementBindingRequestCallElementsType.BindingRequest withClientAddress(FeatureAddressElementsType value) {
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
        public NodeManagementBindingRequestCallElementsType.BindingRequest withServerAddress(FeatureAddressElementsType value) {
            setServerAddress(value);
            return this;
        }

        /**
         * Sets the value of the serverFeatureType property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElementTagType }
         * @return
         *     The class instance
         */
        @Override
        public NodeManagementBindingRequestCallElementsType.BindingRequest withServerFeatureType(ElementTagType value) {
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
            return new NodeManagementBindingRequestCallElementsType.BindingRequest();
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
