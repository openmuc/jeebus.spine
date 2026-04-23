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
 * <p>Java class for NodeManagementUseCaseDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NodeManagementUseCaseDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="useCaseInformation" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}UseCaseInformationDataType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="address" type="{http://docs.eebus.org/spine/xsd/v1}FeatureAddressType" minOccurs="0"/&gt;
 *                   &lt;element name="actor" type="{http://docs.eebus.org/spine/xsd/v1}UseCaseActorType" minOccurs="0"/&gt;
 *                   &lt;element name="useCaseSupport" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}UseCaseSupportType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="useCaseName" type="{http://docs.eebus.org/spine/xsd/v1}UseCaseNameType" minOccurs="0"/&gt;
 *                             &lt;element name="useCaseVersion" type="{http://docs.eebus.org/spine/xsd/v1}SpecificationVersionType" minOccurs="0"/&gt;
 *                             &lt;element name="useCaseAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                             &lt;element name="scenarioSupport" type="{http://docs.eebus.org/spine/xsd/v1}UseCaseScenarioSupportType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                             &lt;element name="useCaseDocumentSubRevision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "NodeManagementUseCaseDataType", propOrder = {
    "useCaseInformation"
})
public class NodeManagementUseCaseDataType implements Cloneable, CopyTo, ToString
{

    protected List<NodeManagementUseCaseDataType.UseCaseInformation> useCaseInformation;

    /**
     * Default no-arg constructor
     * 
     */
    public NodeManagementUseCaseDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public NodeManagementUseCaseDataType(final List<NodeManagementUseCaseDataType.UseCaseInformation> useCaseInformation) {
        this.useCaseInformation = useCaseInformation;
    }

    /**
     * Gets the value of the useCaseInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the useCaseInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUseCaseInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NodeManagementUseCaseDataType.UseCaseInformation }
     * 
     * 
     */
    public List<NodeManagementUseCaseDataType.UseCaseInformation> getUseCaseInformation() {
        if (useCaseInformation == null) {
            useCaseInformation = new ArrayList<NodeManagementUseCaseDataType.UseCaseInformation>();
        }
        return this.useCaseInformation;
    }

    /**
     * Adds objects to the list of UseCaseInformation using add method
     * 
     * @param values
     *     objects to add to the list UseCaseInformation
     * @return
     *     The class instance
     */
    public NodeManagementUseCaseDataType withUseCaseInformation(NodeManagementUseCaseDataType.UseCaseInformation... values) {
        if (values!= null) {
            for (NodeManagementUseCaseDataType.UseCaseInformation value: values) {
                getUseCaseInformation().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of UseCaseInformation using addAll method
     * 
     * @param values
     *     objects to add to the list UseCaseInformation
     * @return
     *     The class instance
     */
    public NodeManagementUseCaseDataType withUseCaseInformation(Collection<NodeManagementUseCaseDataType.UseCaseInformation> values) {
        if (values!= null) {
            getUseCaseInformation().addAll(values);
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
        if (draftCopy instanceof NodeManagementUseCaseDataType) {
            final NodeManagementUseCaseDataType copy = ((NodeManagementUseCaseDataType) draftCopy);
            {
                Boolean useCaseInformationShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.useCaseInformation!= null)&&(!this.useCaseInformation.isEmpty())));
                if (useCaseInformationShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<NodeManagementUseCaseDataType.UseCaseInformation> sourceUseCaseInformation;
                    sourceUseCaseInformation = (((this.useCaseInformation!= null)&&(!this.useCaseInformation.isEmpty()))?this.getUseCaseInformation():null);
                    @SuppressWarnings("unchecked")
                    List<NodeManagementUseCaseDataType.UseCaseInformation> copyUseCaseInformation = ((List<NodeManagementUseCaseDataType.UseCaseInformation> ) strategy.copy(LocatorUtils.property(locator, "useCaseInformation", sourceUseCaseInformation), sourceUseCaseInformation, ((this.useCaseInformation!= null)&&(!this.useCaseInformation.isEmpty()))));
                    copy.useCaseInformation = null;
                    if (copyUseCaseInformation!= null) {
                        List<NodeManagementUseCaseDataType.UseCaseInformation> uniqueUseCaseInformationl = copy.getUseCaseInformation();
                        uniqueUseCaseInformationl.addAll(copyUseCaseInformation);
                    }
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
        return new NodeManagementUseCaseDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final NodeManagementUseCaseDataType that = ((NodeManagementUseCaseDataType) object);
        {
            List<NodeManagementUseCaseDataType.UseCaseInformation> leftUseCaseInformation;
            leftUseCaseInformation = (((this.useCaseInformation!= null)&&(!this.useCaseInformation.isEmpty()))?this.getUseCaseInformation():null);
            List<NodeManagementUseCaseDataType.UseCaseInformation> rightUseCaseInformation;
            rightUseCaseInformation = (((that.useCaseInformation!= null)&&(!that.useCaseInformation.isEmpty()))?that.getUseCaseInformation():null);
            if ((this.useCaseInformation!= null)&&(!this.useCaseInformation.isEmpty())) {
                if ((that.useCaseInformation!= null)&&(!that.useCaseInformation.isEmpty())) {
                    if (!leftUseCaseInformation.equals(rightUseCaseInformation)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.useCaseInformation!= null)&&(!that.useCaseInformation.isEmpty())) {
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
            List<NodeManagementUseCaseDataType.UseCaseInformation> theUseCaseInformation;
            theUseCaseInformation = (((this.useCaseInformation!= null)&&(!this.useCaseInformation.isEmpty()))?this.getUseCaseInformation():null);
            if ((this.useCaseInformation!= null)&&(!this.useCaseInformation.isEmpty())) {
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
            List<NodeManagementUseCaseDataType.UseCaseInformation> theUseCaseInformation;
            theUseCaseInformation = (((this.useCaseInformation!= null)&&(!this.useCaseInformation.isEmpty()))?this.getUseCaseInformation():null);
            strategy.appendField(locator, this, "useCaseInformation", buffer, theUseCaseInformation, ((this.useCaseInformation!= null)&&(!this.useCaseInformation.isEmpty())));
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
     *     &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}UseCaseInformationDataType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="address" type="{http://docs.eebus.org/spine/xsd/v1}FeatureAddressType" minOccurs="0"/&gt;
     *         &lt;element name="actor" type="{http://docs.eebus.org/spine/xsd/v1}UseCaseActorType" minOccurs="0"/&gt;
     *         &lt;element name="useCaseSupport" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}UseCaseSupportType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="useCaseName" type="{http://docs.eebus.org/spine/xsd/v1}UseCaseNameType" minOccurs="0"/&gt;
     *                   &lt;element name="useCaseVersion" type="{http://docs.eebus.org/spine/xsd/v1}SpecificationVersionType" minOccurs="0"/&gt;
     *                   &lt;element name="useCaseAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *                   &lt;element name="scenarioSupport" type="{http://docs.eebus.org/spine/xsd/v1}UseCaseScenarioSupportType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                   &lt;element name="useCaseDocumentSubRevision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        extends UseCaseInformationDataType
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
        public UseCaseInformation(final FeatureAddressType address, final String actor, final List<UseCaseSupportType> useCaseSupport) {
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
        public NodeManagementUseCaseDataType.UseCaseInformation withAddress(FeatureAddressType value) {
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
        public NodeManagementUseCaseDataType.UseCaseInformation withActor(String value) {
            setActor(value);
            return this;
        }

        /**
         * Adds objects to the list of UseCaseSupport using add method
         * 
         * @param values
         *     objects to add to the list UseCaseSupport
         * @return
         *     The class instance
         */
        @Override
        public NodeManagementUseCaseDataType.UseCaseInformation withUseCaseSupport(UseCaseSupportType... values) {
            if (values!= null) {
                for (UseCaseSupportType value: values) {
                    getUseCaseSupport().add(value);
                }
            }
            return this;
        }

        /**
         * Adds objects to the list of UseCaseSupport using addAll method
         * 
         * @param values
         *     objects to add to the list UseCaseSupport
         * @return
         *     The class instance
         */
        @Override
        public NodeManagementUseCaseDataType.UseCaseInformation withUseCaseSupport(Collection<UseCaseSupportType> values) {
            if (values!= null) {
                getUseCaseSupport().addAll(values);
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
            super.copyTo(locator, draftCopy, strategy);
            return draftCopy;
        }

        @Override
        public Object createNewInstance() {
            return new NodeManagementUseCaseDataType.UseCaseInformation();
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
