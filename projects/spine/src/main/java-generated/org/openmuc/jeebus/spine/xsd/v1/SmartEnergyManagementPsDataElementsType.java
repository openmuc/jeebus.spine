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
 * <p>Java class for SmartEnergyManagementPsDataElementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SmartEnergyManagementPsDataElementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nodeScheduleInformation" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}PowerSequenceNodeScheduleInformationDataElementsType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="nodeRemoteControllable" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *                   &lt;element name="supportsSingleSlotSchedulingOnly" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *                   &lt;element name="alternativesCount" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *                   &lt;element name="totalSequencesCountMax" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *                   &lt;element name="supportsReselection" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="alternatives" type="{http://docs.eebus.org/spine/xsd/v1}SmartEnergyManagementPsAlternativesElementsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SmartEnergyManagementPsDataElementsType", propOrder = {
    "nodeScheduleInformation",
    "alternatives"
})
public class SmartEnergyManagementPsDataElementsType implements Cloneable, CopyTo, ToString
{

    protected SmartEnergyManagementPsDataElementsType.NodeScheduleInformation nodeScheduleInformation;
    protected SmartEnergyManagementPsAlternativesElementsType alternatives;

    /**
     * Default no-arg constructor
     * 
     */
    public SmartEnergyManagementPsDataElementsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public SmartEnergyManagementPsDataElementsType(final SmartEnergyManagementPsDataElementsType.NodeScheduleInformation nodeScheduleInformation, final SmartEnergyManagementPsAlternativesElementsType alternatives) {
        this.nodeScheduleInformation = nodeScheduleInformation;
        this.alternatives = alternatives;
    }

    /**
     * Gets the value of the nodeScheduleInformation property.
     * 
     * @return
     *     possible object is
     *     {@link SmartEnergyManagementPsDataElementsType.NodeScheduleInformation }
     *     
     */
    public SmartEnergyManagementPsDataElementsType.NodeScheduleInformation getNodeScheduleInformation() {
        return nodeScheduleInformation;
    }

    /**
     * Sets the value of the nodeScheduleInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmartEnergyManagementPsDataElementsType.NodeScheduleInformation }
     *     
     */
    public void setNodeScheduleInformation(SmartEnergyManagementPsDataElementsType.NodeScheduleInformation value) {
        this.nodeScheduleInformation = value;
    }

    /**
     * Gets the value of the alternatives property.
     * 
     * @return
     *     possible object is
     *     {@link SmartEnergyManagementPsAlternativesElementsType }
     *     
     */
    public SmartEnergyManagementPsAlternativesElementsType getAlternatives() {
        return alternatives;
    }

    /**
     * Sets the value of the alternatives property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmartEnergyManagementPsAlternativesElementsType }
     *     
     */
    public void setAlternatives(SmartEnergyManagementPsAlternativesElementsType value) {
        this.alternatives = value;
    }

    /**
     * Sets the value of the nodeScheduleInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmartEnergyManagementPsDataElementsType.NodeScheduleInformation }
     * @return
     *     The class instance
     */
    public SmartEnergyManagementPsDataElementsType withNodeScheduleInformation(SmartEnergyManagementPsDataElementsType.NodeScheduleInformation value) {
        setNodeScheduleInformation(value);
        return this;
    }

    /**
     * Sets the value of the alternatives property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmartEnergyManagementPsAlternativesElementsType }
     * @return
     *     The class instance
     */
    public SmartEnergyManagementPsDataElementsType withAlternatives(SmartEnergyManagementPsAlternativesElementsType value) {
        setAlternatives(value);
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
        if (draftCopy instanceof SmartEnergyManagementPsDataElementsType) {
            final SmartEnergyManagementPsDataElementsType copy = ((SmartEnergyManagementPsDataElementsType) draftCopy);
            {
                Boolean nodeScheduleInformationShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.nodeScheduleInformation!= null));
                if (nodeScheduleInformationShouldBeCopiedAndSet == Boolean.TRUE) {
                    SmartEnergyManagementPsDataElementsType.NodeScheduleInformation sourceNodeScheduleInformation;
                    sourceNodeScheduleInformation = this.getNodeScheduleInformation();
                    SmartEnergyManagementPsDataElementsType.NodeScheduleInformation copyNodeScheduleInformation = ((SmartEnergyManagementPsDataElementsType.NodeScheduleInformation) strategy.copy(LocatorUtils.property(locator, "nodeScheduleInformation", sourceNodeScheduleInformation), sourceNodeScheduleInformation, (this.nodeScheduleInformation!= null)));
                    copy.setNodeScheduleInformation(copyNodeScheduleInformation);
                } else {
                    if (nodeScheduleInformationShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.nodeScheduleInformation = null;
                    }
                }
            }
            {
                Boolean alternativesShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.alternatives!= null));
                if (alternativesShouldBeCopiedAndSet == Boolean.TRUE) {
                    SmartEnergyManagementPsAlternativesElementsType sourceAlternatives;
                    sourceAlternatives = this.getAlternatives();
                    SmartEnergyManagementPsAlternativesElementsType copyAlternatives = ((SmartEnergyManagementPsAlternativesElementsType) strategy.copy(LocatorUtils.property(locator, "alternatives", sourceAlternatives), sourceAlternatives, (this.alternatives!= null)));
                    copy.setAlternatives(copyAlternatives);
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
        return new SmartEnergyManagementPsDataElementsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final SmartEnergyManagementPsDataElementsType that = ((SmartEnergyManagementPsDataElementsType) object);
        {
            SmartEnergyManagementPsDataElementsType.NodeScheduleInformation leftNodeScheduleInformation;
            leftNodeScheduleInformation = this.getNodeScheduleInformation();
            SmartEnergyManagementPsDataElementsType.NodeScheduleInformation rightNodeScheduleInformation;
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
            SmartEnergyManagementPsAlternativesElementsType leftAlternatives;
            leftAlternatives = this.getAlternatives();
            SmartEnergyManagementPsAlternativesElementsType rightAlternatives;
            rightAlternatives = that.getAlternatives();
            if (this.alternatives!= null) {
                if (that.alternatives!= null) {
                    if (!leftAlternatives.equals(rightAlternatives)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.alternatives!= null) {
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
            SmartEnergyManagementPsDataElementsType.NodeScheduleInformation theNodeScheduleInformation;
            theNodeScheduleInformation = this.getNodeScheduleInformation();
            if (this.nodeScheduleInformation!= null) {
                currentHashCode += theNodeScheduleInformation.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            SmartEnergyManagementPsAlternativesElementsType theAlternatives;
            theAlternatives = this.getAlternatives();
            if (this.alternatives!= null) {
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
            SmartEnergyManagementPsDataElementsType.NodeScheduleInformation theNodeScheduleInformation;
            theNodeScheduleInformation = this.getNodeScheduleInformation();
            strategy.appendField(locator, this, "nodeScheduleInformation", buffer, theNodeScheduleInformation, (this.nodeScheduleInformation!= null));
        }
        {
            SmartEnergyManagementPsAlternativesElementsType theAlternatives;
            theAlternatives = this.getAlternatives();
            strategy.appendField(locator, this, "alternatives", buffer, theAlternatives, (this.alternatives!= null));
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
     *     &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}PowerSequenceNodeScheduleInformationDataElementsType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="nodeRemoteControllable" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
     *         &lt;element name="supportsSingleSlotSchedulingOnly" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
     *         &lt;element name="alternativesCount" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
     *         &lt;element name="totalSequencesCountMax" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
     *         &lt;element name="supportsReselection" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
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
        extends PowerSequenceNodeScheduleInformationDataElementsType
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
        public NodeScheduleInformation(final ElementTagType nodeRemoteControllable, final ElementTagType supportsSingleSlotSchedulingOnly, final ElementTagType alternativesCount, final ElementTagType totalSequencesCountMax, final ElementTagType supportsReselection) {
            super(nodeRemoteControllable, supportsSingleSlotSchedulingOnly, alternativesCount, totalSequencesCountMax, supportsReselection);
        }

        /**
         * Sets the value of the nodeRemoteControllable property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElementTagType }
         * @return
         *     The class instance
         */
        @Override
        public SmartEnergyManagementPsDataElementsType.NodeScheduleInformation withNodeRemoteControllable(ElementTagType value) {
            setNodeRemoteControllable(value);
            return this;
        }

        /**
         * Sets the value of the supportsSingleSlotSchedulingOnly property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElementTagType }
         * @return
         *     The class instance
         */
        @Override
        public SmartEnergyManagementPsDataElementsType.NodeScheduleInformation withSupportsSingleSlotSchedulingOnly(ElementTagType value) {
            setSupportsSingleSlotSchedulingOnly(value);
            return this;
        }

        /**
         * Sets the value of the alternativesCount property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElementTagType }
         * @return
         *     The class instance
         */
        @Override
        public SmartEnergyManagementPsDataElementsType.NodeScheduleInformation withAlternativesCount(ElementTagType value) {
            setAlternativesCount(value);
            return this;
        }

        /**
         * Sets the value of the totalSequencesCountMax property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElementTagType }
         * @return
         *     The class instance
         */
        @Override
        public SmartEnergyManagementPsDataElementsType.NodeScheduleInformation withTotalSequencesCountMax(ElementTagType value) {
            setTotalSequencesCountMax(value);
            return this;
        }

        /**
         * Sets the value of the supportsReselection property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElementTagType }
         * @return
         *     The class instance
         */
        @Override
        public SmartEnergyManagementPsDataElementsType.NodeScheduleInformation withSupportsReselection(ElementTagType value) {
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
            return new SmartEnergyManagementPsDataElementsType.NodeScheduleInformation();
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
