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
 * <p>Java class for NodeManagementUseCaseDataSelectorsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NodeManagementUseCaseDataSelectorsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="useCaseInformation" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}UseCaseInformationListDataSelectorsType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="address" type="{http://docs.eebus.org/spine/xsd/v1}FeatureAddressType" minOccurs="0"/&gt;
 *                   &lt;element name="actor" type="{http://docs.eebus.org/spine/xsd/v1}UseCaseActorType" minOccurs="0"/&gt;
 *                   &lt;element name="useCaseSupport" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}UseCaseSupportSelectorsType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="useCaseName" type="{http://docs.eebus.org/spine/xsd/v1}UseCaseNameType" minOccurs="0"/&gt;
 *                             &lt;element name="useCaseVersion" type="{http://docs.eebus.org/spine/xsd/v1}SpecificationVersionType" minOccurs="0"/&gt;
 *                             &lt;element name="scenarioSupport" type="{http://docs.eebus.org/spine/xsd/v1}UseCaseScenarioSupportType" minOccurs="0"/&gt;
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
@XmlType(name = "NodeManagementUseCaseDataSelectorsType", propOrder = {
    "useCaseInformation"
})
public class NodeManagementUseCaseDataSelectorsType implements Cloneable, CopyTo, ToString
{

    protected NodeManagementUseCaseDataSelectorsType.UseCaseInformation useCaseInformation;

    /**
     * Default no-arg constructor
     * 
     */
    public NodeManagementUseCaseDataSelectorsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public NodeManagementUseCaseDataSelectorsType(final NodeManagementUseCaseDataSelectorsType.UseCaseInformation useCaseInformation) {
        this.useCaseInformation = useCaseInformation;
    }

    /**
     * Gets the value of the useCaseInformation property.
     * 
     * @return
     *     possible object is
     *     {@link NodeManagementUseCaseDataSelectorsType.UseCaseInformation }
     *     
     */
    public NodeManagementUseCaseDataSelectorsType.UseCaseInformation getUseCaseInformation() {
        return useCaseInformation;
    }

    /**
     * Sets the value of the useCaseInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeManagementUseCaseDataSelectorsType.UseCaseInformation }
     *     
     */
    public void setUseCaseInformation(NodeManagementUseCaseDataSelectorsType.UseCaseInformation value) {
        this.useCaseInformation = value;
    }

    /**
     * Sets the value of the useCaseInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeManagementUseCaseDataSelectorsType.UseCaseInformation }
     * @return
     *     The class instance
     */
    public NodeManagementUseCaseDataSelectorsType withUseCaseInformation(NodeManagementUseCaseDataSelectorsType.UseCaseInformation value) {
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
        if (draftCopy instanceof NodeManagementUseCaseDataSelectorsType) {
            final NodeManagementUseCaseDataSelectorsType copy = ((NodeManagementUseCaseDataSelectorsType) draftCopy);
            {
                Boolean useCaseInformationShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.useCaseInformation!= null));
                if (useCaseInformationShouldBeCopiedAndSet == Boolean.TRUE) {
                    NodeManagementUseCaseDataSelectorsType.UseCaseInformation sourceUseCaseInformation;
                    sourceUseCaseInformation = this.getUseCaseInformation();
                    NodeManagementUseCaseDataSelectorsType.UseCaseInformation copyUseCaseInformation = ((NodeManagementUseCaseDataSelectorsType.UseCaseInformation) strategy.copy(LocatorUtils.property(locator, "useCaseInformation", sourceUseCaseInformation), sourceUseCaseInformation, (this.useCaseInformation!= null)));
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
        return new NodeManagementUseCaseDataSelectorsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final NodeManagementUseCaseDataSelectorsType that = ((NodeManagementUseCaseDataSelectorsType) object);
        {
            NodeManagementUseCaseDataSelectorsType.UseCaseInformation leftUseCaseInformation;
            leftUseCaseInformation = this.getUseCaseInformation();
            NodeManagementUseCaseDataSelectorsType.UseCaseInformation rightUseCaseInformation;
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
            NodeManagementUseCaseDataSelectorsType.UseCaseInformation theUseCaseInformation;
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
            NodeManagementUseCaseDataSelectorsType.UseCaseInformation theUseCaseInformation;
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
     *     &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}UseCaseInformationListDataSelectorsType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="address" type="{http://docs.eebus.org/spine/xsd/v1}FeatureAddressType" minOccurs="0"/&gt;
     *         &lt;element name="actor" type="{http://docs.eebus.org/spine/xsd/v1}UseCaseActorType" minOccurs="0"/&gt;
     *         &lt;element name="useCaseSupport" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}UseCaseSupportSelectorsType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="useCaseName" type="{http://docs.eebus.org/spine/xsd/v1}UseCaseNameType" minOccurs="0"/&gt;
     *                   &lt;element name="useCaseVersion" type="{http://docs.eebus.org/spine/xsd/v1}SpecificationVersionType" minOccurs="0"/&gt;
     *                   &lt;element name="scenarioSupport" type="{http://docs.eebus.org/spine/xsd/v1}UseCaseScenarioSupportType" minOccurs="0"/&gt;
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
        extends UseCaseInformationListDataSelectorsType
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
        public UseCaseInformation(final FeatureAddressType address, final String actor, final UseCaseSupportSelectorsType useCaseSupport) {
            super(address, actor, useCaseSupport);
        }

        /**
         * Sets the value of the address property.
         * 
         * @param value
         *     allowed object is
         *     {@link FeatureAddressType }
         * @return
         *     The class instance
         */
        @Override
        public NodeManagementUseCaseDataSelectorsType.UseCaseInformation withAddress(FeatureAddressType value) {
            setAddress(value);
            return this;
        }

        /**
         * Sets the value of the actor property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         * @return
         *     The class instance
         */
        @Override
        public NodeManagementUseCaseDataSelectorsType.UseCaseInformation withActor(String value) {
            setActor(value);
            return this;
        }

        /**
         * Sets the value of the useCaseSupport property.
         * 
         * @param value
         *     allowed object is
         *     {@link UseCaseSupportSelectorsType }
         * @return
         *     The class instance
         */
        @Override
        public NodeManagementUseCaseDataSelectorsType.UseCaseInformation withUseCaseSupport(UseCaseSupportSelectorsType value) {
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
            return new NodeManagementUseCaseDataSelectorsType.UseCaseInformation();
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
