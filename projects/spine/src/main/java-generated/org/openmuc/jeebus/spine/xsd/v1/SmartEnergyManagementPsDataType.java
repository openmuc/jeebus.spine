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
 * <p>Java class for SmartEnergyManagementPsDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SmartEnergyManagementPsDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nodeScheduleInformation" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}PowerSequenceNodeScheduleInformationDataType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="nodeRemoteControllable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="supportsSingleSlotSchedulingOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="alternativesCount" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *                   &lt;element name="totalSequencesCountMax" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *                   &lt;element name="supportsReselection" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="alternatives" type="{http://docs.eebus.org/spine/xsd/v1}SmartEnergyManagementPsAlternativesType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SmartEnergyManagementPsDataType", propOrder = {
    "nodeScheduleInformation",
    "alternatives"
})
public class SmartEnergyManagementPsDataType implements Cloneable, CopyTo, ToString
{

    protected SmartEnergyManagementPsDataType.NodeScheduleInformation nodeScheduleInformation;
    protected List<SmartEnergyManagementPsAlternativesType> alternatives;

    /**
     * Default no-arg constructor
     * 
     */
    public SmartEnergyManagementPsDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public SmartEnergyManagementPsDataType(final SmartEnergyManagementPsDataType.NodeScheduleInformation nodeScheduleInformation, final List<SmartEnergyManagementPsAlternativesType> alternatives) {
        this.nodeScheduleInformation = nodeScheduleInformation;
        this.alternatives = alternatives;
    }

    /**
     * Gets the value of the nodeScheduleInformation property.
     * 
     * @return
     *     possible object is
     *     {@link SmartEnergyManagementPsDataType.NodeScheduleInformation }
     *     
     */
    public SmartEnergyManagementPsDataType.NodeScheduleInformation getNodeScheduleInformation() {
        return nodeScheduleInformation;
    }

    /**
     * Sets the value of the nodeScheduleInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmartEnergyManagementPsDataType.NodeScheduleInformation }
     *     
     */
    public void setNodeScheduleInformation(SmartEnergyManagementPsDataType.NodeScheduleInformation value) {
        this.nodeScheduleInformation = value;
    }

    /**
     * Gets the value of the alternatives property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the alternatives property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlternatives().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SmartEnergyManagementPsAlternativesType }
     * 
     * 
     */
    public List<SmartEnergyManagementPsAlternativesType> getAlternatives() {
        if (alternatives == null) {
            alternatives = new ArrayList<SmartEnergyManagementPsAlternativesType>();
        }
        return this.alternatives;
    }

    /**
     * Sets the value of the nodeScheduleInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmartEnergyManagementPsDataType.NodeScheduleInformation }
     * @return
     *     The class instance
     */
    public SmartEnergyManagementPsDataType withNodeScheduleInformation(SmartEnergyManagementPsDataType.NodeScheduleInformation value) {
        setNodeScheduleInformation(value);
        return this;
    }

    /**
     * Adds objects to the list of Alternatives using add method
     * 
     * @param values
     *     objects to add to the list Alternatives
     * @return
     *     The class instance
     */
    public SmartEnergyManagementPsDataType withAlternatives(SmartEnergyManagementPsAlternativesType... values) {
        if (values!= null) {
            for (SmartEnergyManagementPsAlternativesType value: values) {
                getAlternatives().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of Alternatives using addAll method
     * 
     * @param values
     *     objects to add to the list Alternatives
     * @return
     *     The class instance
     */
    public SmartEnergyManagementPsDataType withAlternatives(Collection<SmartEnergyManagementPsAlternativesType> values) {
        if (values!= null) {
            getAlternatives().addAll(values);
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
        if (draftCopy instanceof SmartEnergyManagementPsDataType) {
            final SmartEnergyManagementPsDataType copy = ((SmartEnergyManagementPsDataType) draftCopy);
            {
                Boolean nodeScheduleInformationShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.nodeScheduleInformation!= null));
                if (nodeScheduleInformationShouldBeCopiedAndSet == Boolean.TRUE) {
                    SmartEnergyManagementPsDataType.NodeScheduleInformation sourceNodeScheduleInformation;
                    sourceNodeScheduleInformation = this.getNodeScheduleInformation();
                    SmartEnergyManagementPsDataType.NodeScheduleInformation copyNodeScheduleInformation = ((SmartEnergyManagementPsDataType.NodeScheduleInformation) strategy.copy(LocatorUtils.property(locator, "nodeScheduleInformation", sourceNodeScheduleInformation), sourceNodeScheduleInformation, (this.nodeScheduleInformation!= null)));
                    copy.setNodeScheduleInformation(copyNodeScheduleInformation);
                } else {
                    if (nodeScheduleInformationShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.nodeScheduleInformation = null;
                    }
                }
            }
            {
                Boolean alternativesShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.alternatives!= null)&&(!this.alternatives.isEmpty())));
                if (alternativesShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<SmartEnergyManagementPsAlternativesType> sourceAlternatives;
                    sourceAlternatives = (((this.alternatives!= null)&&(!this.alternatives.isEmpty()))?this.getAlternatives():null);
                    @SuppressWarnings("unchecked")
                    List<SmartEnergyManagementPsAlternativesType> copyAlternatives = ((List<SmartEnergyManagementPsAlternativesType> ) strategy.copy(LocatorUtils.property(locator, "alternatives", sourceAlternatives), sourceAlternatives, ((this.alternatives!= null)&&(!this.alternatives.isEmpty()))));
                    copy.alternatives = null;
                    if (copyAlternatives!= null) {
                        List<SmartEnergyManagementPsAlternativesType> uniqueAlternativesl = copy.getAlternatives();
                        uniqueAlternativesl.addAll(copyAlternatives);
                    }
                } else {
                    if (alternativesShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.alternatives = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new SmartEnergyManagementPsDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final SmartEnergyManagementPsDataType that = ((SmartEnergyManagementPsDataType) object);
        {
            SmartEnergyManagementPsDataType.NodeScheduleInformation leftNodeScheduleInformation;
            leftNodeScheduleInformation = this.getNodeScheduleInformation();
            SmartEnergyManagementPsDataType.NodeScheduleInformation rightNodeScheduleInformation;
            rightNodeScheduleInformation = that.getNodeScheduleInformation();
            if (this.nodeScheduleInformation!= null) {
                if (that.nodeScheduleInformation!= null) {
                    if (!leftNodeScheduleInformation.equals(rightNodeScheduleInformation)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.nodeScheduleInformation!= null) {
                    return false;
                }
            }
        }
        {
            List<SmartEnergyManagementPsAlternativesType> leftAlternatives;
            leftAlternatives = (((this.alternatives!= null)&&(!this.alternatives.isEmpty()))?this.getAlternatives():null);
            List<SmartEnergyManagementPsAlternativesType> rightAlternatives;
            rightAlternatives = (((that.alternatives!= null)&&(!that.alternatives.isEmpty()))?that.getAlternatives():null);
            if ((this.alternatives!= null)&&(!this.alternatives.isEmpty())) {
                if ((that.alternatives!= null)&&(!that.alternatives.isEmpty())) {
                    if (!leftAlternatives.equals(rightAlternatives)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.alternatives!= null)&&(!that.alternatives.isEmpty())) {
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
            SmartEnergyManagementPsDataType.NodeScheduleInformation theNodeScheduleInformation;
            theNodeScheduleInformation = this.getNodeScheduleInformation();
            if (this.nodeScheduleInformation!= null) {
                currentHashCode += theNodeScheduleInformation.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            List<SmartEnergyManagementPsAlternativesType> theAlternatives;
            theAlternatives = (((this.alternatives!= null)&&(!this.alternatives.isEmpty()))?this.getAlternatives():null);
            if ((this.alternatives!= null)&&(!this.alternatives.isEmpty())) {
                currentHashCode += theAlternatives.hashCode();
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
            SmartEnergyManagementPsDataType.NodeScheduleInformation theNodeScheduleInformation;
            theNodeScheduleInformation = this.getNodeScheduleInformation();
            strategy.appendField(locator, this, "nodeScheduleInformation", buffer, theNodeScheduleInformation, (this.nodeScheduleInformation!= null));
        }
        {
            List<SmartEnergyManagementPsAlternativesType> theAlternatives;
            theAlternatives = (((this.alternatives!= null)&&(!this.alternatives.isEmpty()))?this.getAlternatives():null);
            strategy.appendField(locator, this, "alternatives", buffer, theAlternatives, ((this.alternatives!= null)&&(!this.alternatives.isEmpty())));
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
     *     &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}PowerSequenceNodeScheduleInformationDataType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="nodeRemoteControllable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="supportsSingleSlotSchedulingOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="alternativesCount" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
     *         &lt;element name="totalSequencesCountMax" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
     *         &lt;element name="supportsReselection" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
    public static class NodeScheduleInformation
        extends PowerSequenceNodeScheduleInformationDataType
        implements Cloneable, CopyTo, ToString
    {


        /**
         * Default no-arg constructor
         * 
         */
        public NodeScheduleInformation() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public NodeScheduleInformation(final Boolean nodeRemoteControllable, final Boolean supportsSingleSlotSchedulingOnly, final Long alternativesCount, final Long totalSequencesCountMax, final Boolean supportsReselection) {
            super(nodeRemoteControllable, supportsSingleSlotSchedulingOnly, alternativesCount, totalSequencesCountMax, supportsReselection);
        }

        /**
         * Sets the value of the nodeRemoteControllable property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         * @return
         *     The class instance
         */
        @Override
        public SmartEnergyManagementPsDataType.NodeScheduleInformation withNodeRemoteControllable(Boolean value) {
            setNodeRemoteControllable(value);
            return this;
        }

        /**
         * Sets the value of the supportsSingleSlotSchedulingOnly property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         * @return
         *     The class instance
         */
        @Override
        public SmartEnergyManagementPsDataType.NodeScheduleInformation withSupportsSingleSlotSchedulingOnly(Boolean value) {
            setSupportsSingleSlotSchedulingOnly(value);
            return this;
        }

        /**
         * Sets the value of the alternativesCount property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         * @return
         *     The class instance
         */
        @Override
        public SmartEnergyManagementPsDataType.NodeScheduleInformation withAlternativesCount(Long value) {
            setAlternativesCount(value);
            return this;
        }

        /**
         * Sets the value of the totalSequencesCountMax property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         * @return
         *     The class instance
         */
        @Override
        public SmartEnergyManagementPsDataType.NodeScheduleInformation withTotalSequencesCountMax(Long value) {
            setTotalSequencesCountMax(value);
            return this;
        }

        /**
         * Sets the value of the supportsReselection property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         * @return
         *     The class instance
         */
        @Override
        public SmartEnergyManagementPsDataType.NodeScheduleInformation withSupportsReselection(Boolean value) {
            setSupportsReselection(value);
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
            return new SmartEnergyManagementPsDataType.NodeScheduleInformation();
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
