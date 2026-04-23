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
 * <p>Java class for NodeManagementUseCaseDataElementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NodeManagementUseCaseDataElementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="useCaseInformation" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}UseCaseInformationDataElementsType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="address" type="{http://docs.eebus.org/spine/xsd/v1}FeatureAddressElementsType" minOccurs="0"/&gt;
 *                   &lt;element name="actor" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *                   &lt;element name="useCaseSupport" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}UseCaseSupportElementsType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="useCaseName" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *                             &lt;element name="useCaseVersion" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *                             &lt;element name="useCaseAvailable" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *                             &lt;element name="scenarioSupport" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *                             &lt;element name="useCaseDocumentSubRevision" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
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
@XmlType(name = "NodeManagementUseCaseDataElementsType", propOrder = {
    "useCaseInformation"
})
public class NodeManagementUseCaseDataElementsType implements Cloneable, CopyTo, ToString
{

    protected NodeManagementUseCaseDataElementsType.UseCaseInformation useCaseInformation;

    /**
     * Default no-arg constructor
     * 
     */
    public NodeManagementUseCaseDataElementsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public NodeManagementUseCaseDataElementsType(final NodeManagementUseCaseDataElementsType.UseCaseInformation useCaseInformation) {
        this.useCaseInformation = useCaseInformation;
    }

    /**
     * Gets the value of the useCaseInformation property.
     * 
     * @return
     *     possible object is
     *     {@link NodeManagementUseCaseDataElementsType.UseCaseInformation }
     *     
     */
    public NodeManagementUseCaseDataElementsType.UseCaseInformation getUseCaseInformation() {
        return useCaseInformation;
    }

    /**
     * Sets the value of the useCaseInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeManagementUseCaseDataElementsType.UseCaseInformation }
     *     
     */
    public void setUseCaseInformation(NodeManagementUseCaseDataElementsType.UseCaseInformation value) {
        this.useCaseInformation = value;
    }

    /**
     * Sets the value of the useCaseInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeManagementUseCaseDataElementsType.UseCaseInformation }
     * @return
     *     The class instance
     */
    public NodeManagementUseCaseDataElementsType withUseCaseInformation(NodeManagementUseCaseDataElementsType.UseCaseInformation value) {
        setUseCaseInformation(value);
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
        if (draftCopy instanceof NodeManagementUseCaseDataElementsType) {
            final NodeManagementUseCaseDataElementsType copy = ((NodeManagementUseCaseDataElementsType) draftCopy);
            {
                Boolean useCaseInformationShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.useCaseInformation!= null));
                if (useCaseInformationShouldBeCopiedAndSet == Boolean.TRUE) {
                    NodeManagementUseCaseDataElementsType.UseCaseInformation sourceUseCaseInformation;
                    sourceUseCaseInformation = this.getUseCaseInformation();
                    NodeManagementUseCaseDataElementsType.UseCaseInformation copyUseCaseInformation = ((NodeManagementUseCaseDataElementsType.UseCaseInformation) strategy.copy(LocatorUtils.property(locator, "useCaseInformation", sourceUseCaseInformation), sourceUseCaseInformation, (this.useCaseInformation!= null)));
                    copy.setUseCaseInformation(copyUseCaseInformation);
                } else {
                    if (useCaseInformationShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.useCaseInformation = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new NodeManagementUseCaseDataElementsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final NodeManagementUseCaseDataElementsType that = ((NodeManagementUseCaseDataElementsType) object);
        {
            NodeManagementUseCaseDataElementsType.UseCaseInformation leftUseCaseInformation;
            leftUseCaseInformation = this.getUseCaseInformation();
            NodeManagementUseCaseDataElementsType.UseCaseInformation rightUseCaseInformation;
            rightUseCaseInformation = that.getUseCaseInformation();
            if (this.useCaseInformation!= null) {
                if (that.useCaseInformation!= null) {
                    if (!leftUseCaseInformation.equals(rightUseCaseInformation)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.useCaseInformation!= null) {
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
            NodeManagementUseCaseDataElementsType.UseCaseInformation theUseCaseInformation;
            theUseCaseInformation = this.getUseCaseInformation();
            if (this.useCaseInformation!= null) {
                currentHashCode += theUseCaseInformation.hashCode();
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
            NodeManagementUseCaseDataElementsType.UseCaseInformation theUseCaseInformation;
            theUseCaseInformation = this.getUseCaseInformation();
            strategy.appendField(locator, this, "useCaseInformation", buffer, theUseCaseInformation, (this.useCaseInformation!= null));
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
     *     &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}UseCaseInformationDataElementsType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="address" type="{http://docs.eebus.org/spine/xsd/v1}FeatureAddressElementsType" minOccurs="0"/&gt;
     *         &lt;element name="actor" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
     *         &lt;element name="useCaseSupport" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}UseCaseSupportElementsType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="useCaseName" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
     *                   &lt;element name="useCaseVersion" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
     *                   &lt;element name="useCaseAvailable" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
     *                   &lt;element name="scenarioSupport" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
     *                   &lt;element name="useCaseDocumentSubRevision" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
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
    @XmlType(name = "")
    public static class UseCaseInformation
        extends UseCaseInformationDataElementsType
        implements Cloneable, CopyTo, ToString
    {


        /**
         * Default no-arg constructor
         * 
         */
        public UseCaseInformation() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public UseCaseInformation(final FeatureAddressElementsType address, final ElementTagType actor, final UseCaseSupportElementsType useCaseSupport) {
            super(address, actor, useCaseSupport);
        }

        /**
         * Sets the value of the address property.
         * 
         * @param value
         *     allowed object is
         *     {@link FeatureAddressElementsType }
         * @return
         *     The class instance
         */
        @Override
        public NodeManagementUseCaseDataElementsType.UseCaseInformation withAddress(FeatureAddressElementsType value) {
            setAddress(value);
            return this;
        }

        /**
         * Sets the value of the actor property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElementTagType }
         * @return
         *     The class instance
         */
        @Override
        public NodeManagementUseCaseDataElementsType.UseCaseInformation withActor(ElementTagType value) {
            setActor(value);
            return this;
        }

        /**
         * Sets the value of the useCaseSupport property.
         * 
         * @param value
         *     allowed object is
         *     {@link UseCaseSupportElementsType }
         * @return
         *     The class instance
         */
        @Override
        public NodeManagementUseCaseDataElementsType.UseCaseInformation withUseCaseSupport(UseCaseSupportElementsType value) {
            setUseCaseSupport(value);
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
            return new NodeManagementUseCaseDataElementsType.UseCaseInformation();
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
