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
 * <p>Java class for IncentiveTableDescriptionTierType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IncentiveTableDescriptionTierType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tierDescription" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}TierDescriptionDataType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="tierId" type="{http://docs.eebus.org/spine/xsd/v1}TierIdType" minOccurs="0"/&gt;
 *                   &lt;element name="tierType" type="{http://docs.eebus.org/spine/xsd/v1}TierTypeType" minOccurs="0"/&gt;
 *                   &lt;element name="label" type="{http://docs.eebus.org/spine/xsd/v1}LabelType" minOccurs="0"/&gt;
 *                   &lt;element name="description" type="{http://docs.eebus.org/spine/xsd/v1}DescriptionType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="boundaryDescription" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}TierBoundaryDescriptionDataType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="boundaryId" type="{http://docs.eebus.org/spine/xsd/v1}TierBoundaryIdType" minOccurs="0"/&gt;
 *                   &lt;element name="boundaryType" type="{http://docs.eebus.org/spine/xsd/v1}TierBoundaryTypeType" minOccurs="0"/&gt;
 *                   &lt;element name="switchToTierIdWhenLower" type="{http://docs.eebus.org/spine/xsd/v1}TierIdType" minOccurs="0"/&gt;
 *                   &lt;element name="switchToTierIdWhenHigher" type="{http://docs.eebus.org/spine/xsd/v1}TierIdType" minOccurs="0"/&gt;
 *                   &lt;element name="boundaryUnit" type="{http://docs.eebus.org/spine/xsd/v1}UnitOfMeasurementType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="incentiveDescription" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}IncentiveDescriptionDataType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="incentiveId" type="{http://docs.eebus.org/spine/xsd/v1}IncentiveIdType" minOccurs="0"/&gt;
 *                   &lt;element name="incentiveType" type="{http://docs.eebus.org/spine/xsd/v1}IncentiveTypeType" minOccurs="0"/&gt;
 *                   &lt;element name="incentivePriority" type="{http://docs.eebus.org/spine/xsd/v1}IncentivePriorityType" minOccurs="0"/&gt;
 *                   &lt;element name="currency" type="{http://docs.eebus.org/spine/xsd/v1}CurrencyType" minOccurs="0"/&gt;
 *                   &lt;element name="unit" type="{http://docs.eebus.org/spine/xsd/v1}UnitOfMeasurementType" minOccurs="0"/&gt;
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
@XmlType(name = "IncentiveTableDescriptionTierType", propOrder = {
    "tierDescription",
    "boundaryDescription",
    "incentiveDescription"
})
public class IncentiveTableDescriptionTierType implements Cloneable, CopyTo, ToString
{

    protected IncentiveTableDescriptionTierType.TierDescription tierDescription;
    protected List<IncentiveTableDescriptionTierType.BoundaryDescription> boundaryDescription;
    protected List<IncentiveTableDescriptionTierType.IncentiveDescription> incentiveDescription;

    /**
     * Default no-arg constructor
     * 
     */
    public IncentiveTableDescriptionTierType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public IncentiveTableDescriptionTierType(final IncentiveTableDescriptionTierType.TierDescription tierDescription, final List<IncentiveTableDescriptionTierType.BoundaryDescription> boundaryDescription, final List<IncentiveTableDescriptionTierType.IncentiveDescription> incentiveDescription) {
        this.tierDescription = tierDescription;
        this.boundaryDescription = boundaryDescription;
        this.incentiveDescription = incentiveDescription;
    }

    /**
     * Gets the value of the tierDescription property.
     * 
     * @return
     *     possible object is
     *     {@link IncentiveTableDescriptionTierType.TierDescription }
     *     
     */
    public IncentiveTableDescriptionTierType.TierDescription getTierDescription() {
        return tierDescription;
    }

    /**
     * Sets the value of the tierDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncentiveTableDescriptionTierType.TierDescription }
     *     
     */
    public void setTierDescription(IncentiveTableDescriptionTierType.TierDescription value) {
        this.tierDescription = value;
    }

    /**
     * Gets the value of the boundaryDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the boundaryDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBoundaryDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IncentiveTableDescriptionTierType.BoundaryDescription }
     * 
     * 
     */
    public List<IncentiveTableDescriptionTierType.BoundaryDescription> getBoundaryDescription() {
        if (boundaryDescription == null) {
            boundaryDescription = new ArrayList<IncentiveTableDescriptionTierType.BoundaryDescription>();
        }
        return this.boundaryDescription;
    }

    /**
     * Gets the value of the incentiveDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the incentiveDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncentiveDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IncentiveTableDescriptionTierType.IncentiveDescription }
     * 
     * 
     */
    public List<IncentiveTableDescriptionTierType.IncentiveDescription> getIncentiveDescription() {
        if (incentiveDescription == null) {
            incentiveDescription = new ArrayList<IncentiveTableDescriptionTierType.IncentiveDescription>();
        }
        return this.incentiveDescription;
    }

    /**
     * Sets the value of the tierDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncentiveTableDescriptionTierType.TierDescription }
     * @return
     *     The class instance
     */
    public IncentiveTableDescriptionTierType withTierDescription(IncentiveTableDescriptionTierType.TierDescription value) {
        setTierDescription(value);
        return this;
    }

    /**
     * Adds objects to the list of BoundaryDescription using add method
     * 
     * @param values
     *     objects to add to the list BoundaryDescription
     * @return
     *     The class instance
     */
    public IncentiveTableDescriptionTierType withBoundaryDescription(IncentiveTableDescriptionTierType.BoundaryDescription... values) {
        if (values!= null) {
            for (IncentiveTableDescriptionTierType.BoundaryDescription value: values) {
                getBoundaryDescription().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of BoundaryDescription using addAll method
     * 
     * @param values
     *     objects to add to the list BoundaryDescription
     * @return
     *     The class instance
     */
    public IncentiveTableDescriptionTierType withBoundaryDescription(Collection<IncentiveTableDescriptionTierType.BoundaryDescription> values) {
        if (values!= null) {
            getBoundaryDescription().addAll(values);
        }
        return this;
    }

    /**
     * Adds objects to the list of IncentiveDescription using add method
     * 
     * @param values
     *     objects to add to the list IncentiveDescription
     * @return
     *     The class instance
     */
    public IncentiveTableDescriptionTierType withIncentiveDescription(IncentiveTableDescriptionTierType.IncentiveDescription... values) {
        if (values!= null) {
            for (IncentiveTableDescriptionTierType.IncentiveDescription value: values) {
                getIncentiveDescription().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of IncentiveDescription using addAll method
     * 
     * @param values
     *     objects to add to the list IncentiveDescription
     * @return
     *     The class instance
     */
    public IncentiveTableDescriptionTierType withIncentiveDescription(Collection<IncentiveTableDescriptionTierType.IncentiveDescription> values) {
        if (values!= null) {
            getIncentiveDescription().addAll(values);
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
        if (draftCopy instanceof IncentiveTableDescriptionTierType) {
            final IncentiveTableDescriptionTierType copy = ((IncentiveTableDescriptionTierType) draftCopy);
            {
                Boolean tierDescriptionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.tierDescription!= null));
                if (tierDescriptionShouldBeCopiedAndSet == Boolean.TRUE) {
                    IncentiveTableDescriptionTierType.TierDescription sourceTierDescription;
                    sourceTierDescription = this.getTierDescription();
                    IncentiveTableDescriptionTierType.TierDescription copyTierDescription = ((IncentiveTableDescriptionTierType.TierDescription) strategy.copy(LocatorUtils.property(locator, "tierDescription", sourceTierDescription), sourceTierDescription, (this.tierDescription!= null)));
                    copy.setTierDescription(copyTierDescription);
                } else {
                    if (tierDescriptionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.tierDescription = null;
                    }
                }
            }
            {
                Boolean boundaryDescriptionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.boundaryDescription!= null)&&(!this.boundaryDescription.isEmpty())));
                if (boundaryDescriptionShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<IncentiveTableDescriptionTierType.BoundaryDescription> sourceBoundaryDescription;
                    sourceBoundaryDescription = (((this.boundaryDescription!= null)&&(!this.boundaryDescription.isEmpty()))?this.getBoundaryDescription():null);
                    @SuppressWarnings("unchecked")
                    List<IncentiveTableDescriptionTierType.BoundaryDescription> copyBoundaryDescription = ((List<IncentiveTableDescriptionTierType.BoundaryDescription> ) strategy.copy(LocatorUtils.property(locator, "boundaryDescription", sourceBoundaryDescription), sourceBoundaryDescription, ((this.boundaryDescription!= null)&&(!this.boundaryDescription.isEmpty()))));
                    copy.boundaryDescription = null;
                    if (copyBoundaryDescription!= null) {
                        List<IncentiveTableDescriptionTierType.BoundaryDescription> uniqueBoundaryDescriptionl = copy.getBoundaryDescription();
                        uniqueBoundaryDescriptionl.addAll(copyBoundaryDescription);
                    }
                } else {
                    if (boundaryDescriptionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.boundaryDescription = null;
                    }
                }
            }
            {
                Boolean incentiveDescriptionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.incentiveDescription!= null)&&(!this.incentiveDescription.isEmpty())));
                if (incentiveDescriptionShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<IncentiveTableDescriptionTierType.IncentiveDescription> sourceIncentiveDescription;
                    sourceIncentiveDescription = (((this.incentiveDescription!= null)&&(!this.incentiveDescription.isEmpty()))?this.getIncentiveDescription():null);
                    @SuppressWarnings("unchecked")
                    List<IncentiveTableDescriptionTierType.IncentiveDescription> copyIncentiveDescription = ((List<IncentiveTableDescriptionTierType.IncentiveDescription> ) strategy.copy(LocatorUtils.property(locator, "incentiveDescription", sourceIncentiveDescription), sourceIncentiveDescription, ((this.incentiveDescription!= null)&&(!this.incentiveDescription.isEmpty()))));
                    copy.incentiveDescription = null;
                    if (copyIncentiveDescription!= null) {
                        List<IncentiveTableDescriptionTierType.IncentiveDescription> uniqueIncentiveDescriptionl = copy.getIncentiveDescription();
                        uniqueIncentiveDescriptionl.addAll(copyIncentiveDescription);
                    }
                } else {
                    if (incentiveDescriptionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.incentiveDescription = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new IncentiveTableDescriptionTierType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final IncentiveTableDescriptionTierType that = ((IncentiveTableDescriptionTierType) object);
        {
            IncentiveTableDescriptionTierType.TierDescription leftTierDescription;
            leftTierDescription = this.getTierDescription();
            IncentiveTableDescriptionTierType.TierDescription rightTierDescription;
            rightTierDescription = that.getTierDescription();
            if (this.tierDescription!= null) {
                if (that.tierDescription!= null) {
                    if (!leftTierDescription.equals(rightTierDescription)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.tierDescription!= null) {
                    return false;
                }
            }
        }
        {
            List<IncentiveTableDescriptionTierType.BoundaryDescription> leftBoundaryDescription;
            leftBoundaryDescription = (((this.boundaryDescription!= null)&&(!this.boundaryDescription.isEmpty()))?this.getBoundaryDescription():null);
            List<IncentiveTableDescriptionTierType.BoundaryDescription> rightBoundaryDescription;
            rightBoundaryDescription = (((that.boundaryDescription!= null)&&(!that.boundaryDescription.isEmpty()))?that.getBoundaryDescription():null);
            if ((this.boundaryDescription!= null)&&(!this.boundaryDescription.isEmpty())) {
                if ((that.boundaryDescription!= null)&&(!that.boundaryDescription.isEmpty())) {
                    if (!leftBoundaryDescription.equals(rightBoundaryDescription)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.boundaryDescription!= null)&&(!that.boundaryDescription.isEmpty())) {
                    return false;
                }
            }
        }
        {
            List<IncentiveTableDescriptionTierType.IncentiveDescription> leftIncentiveDescription;
            leftIncentiveDescription = (((this.incentiveDescription!= null)&&(!this.incentiveDescription.isEmpty()))?this.getIncentiveDescription():null);
            List<IncentiveTableDescriptionTierType.IncentiveDescription> rightIncentiveDescription;
            rightIncentiveDescription = (((that.incentiveDescription!= null)&&(!that.incentiveDescription.isEmpty()))?that.getIncentiveDescription():null);
            if ((this.incentiveDescription!= null)&&(!this.incentiveDescription.isEmpty())) {
                if ((that.incentiveDescription!= null)&&(!that.incentiveDescription.isEmpty())) {
                    if (!leftIncentiveDescription.equals(rightIncentiveDescription)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.incentiveDescription!= null)&&(!that.incentiveDescription.isEmpty())) {
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
            IncentiveTableDescriptionTierType.TierDescription theTierDescription;
            theTierDescription = this.getTierDescription();
            if (this.tierDescription!= null) {
                currentHashCode += theTierDescription.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            List<IncentiveTableDescriptionTierType.BoundaryDescription> theBoundaryDescription;
            theBoundaryDescription = (((this.boundaryDescription!= null)&&(!this.boundaryDescription.isEmpty()))?this.getBoundaryDescription():null);
            if ((this.boundaryDescription!= null)&&(!this.boundaryDescription.isEmpty())) {
                currentHashCode += theBoundaryDescription.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            List<IncentiveTableDescriptionTierType.IncentiveDescription> theIncentiveDescription;
            theIncentiveDescription = (((this.incentiveDescription!= null)&&(!this.incentiveDescription.isEmpty()))?this.getIncentiveDescription():null);
            if ((this.incentiveDescription!= null)&&(!this.incentiveDescription.isEmpty())) {
                currentHashCode += theIncentiveDescription.hashCode();
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
            IncentiveTableDescriptionTierType.TierDescription theTierDescription;
            theTierDescription = this.getTierDescription();
            strategy.appendField(locator, this, "tierDescription", buffer, theTierDescription, (this.tierDescription!= null));
        }
        {
            List<IncentiveTableDescriptionTierType.BoundaryDescription> theBoundaryDescription;
            theBoundaryDescription = (((this.boundaryDescription!= null)&&(!this.boundaryDescription.isEmpty()))?this.getBoundaryDescription():null);
            strategy.appendField(locator, this, "boundaryDescription", buffer, theBoundaryDescription, ((this.boundaryDescription!= null)&&(!this.boundaryDescription.isEmpty())));
        }
        {
            List<IncentiveTableDescriptionTierType.IncentiveDescription> theIncentiveDescription;
            theIncentiveDescription = (((this.incentiveDescription!= null)&&(!this.incentiveDescription.isEmpty()))?this.getIncentiveDescription():null);
            strategy.appendField(locator, this, "incentiveDescription", buffer, theIncentiveDescription, ((this.incentiveDescription!= null)&&(!this.incentiveDescription.isEmpty())));
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
     *     &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}TierBoundaryDescriptionDataType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="boundaryId" type="{http://docs.eebus.org/spine/xsd/v1}TierBoundaryIdType" minOccurs="0"/&gt;
     *         &lt;element name="boundaryType" type="{http://docs.eebus.org/spine/xsd/v1}TierBoundaryTypeType" minOccurs="0"/&gt;
     *         &lt;element name="switchToTierIdWhenLower" type="{http://docs.eebus.org/spine/xsd/v1}TierIdType" minOccurs="0"/&gt;
     *         &lt;element name="switchToTierIdWhenHigher" type="{http://docs.eebus.org/spine/xsd/v1}TierIdType" minOccurs="0"/&gt;
     *         &lt;element name="boundaryUnit" type="{http://docs.eebus.org/spine/xsd/v1}UnitOfMeasurementType" minOccurs="0"/&gt;
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
    public static class BoundaryDescription
        extends TierBoundaryDescriptionDataType
        implements Cloneable, CopyTo, ToString
    {


        /**
         * Default no-arg constructor
         * 
         */
        public BoundaryDescription() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public BoundaryDescription(final Long boundaryId, final String boundaryType, final Long validForTierId, final Long switchToTierIdWhenLower, final Long switchToTierIdWhenHigher, final String boundaryUnit, final String label, final String description) {
            super(boundaryId, boundaryType, validForTierId, switchToTierIdWhenLower, switchToTierIdWhenHigher, boundaryUnit, label, description);
        }

        /**
         * Sets the value of the boundaryId property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         * @return
         *     The class instance
         */
        @Override
        public IncentiveTableDescriptionTierType.BoundaryDescription withBoundaryId(Long value) {
            setBoundaryId(value);
            return this;
        }

        /**
         * Sets the value of the boundaryType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         * @return
         *     The class instance
         */
        @Override
        public IncentiveTableDescriptionTierType.BoundaryDescription withBoundaryType(String value) {
            setBoundaryType(value);
            return this;
        }

        /**
         * Sets the value of the validForTierId property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         * @return
         *     The class instance
         */
        @Override
        public IncentiveTableDescriptionTierType.BoundaryDescription withValidForTierId(Long value) {
            setValidForTierId(value);
            return this;
        }

        /**
         * Sets the value of the switchToTierIdWhenLower property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         * @return
         *     The class instance
         */
        @Override
        public IncentiveTableDescriptionTierType.BoundaryDescription withSwitchToTierIdWhenLower(Long value) {
            setSwitchToTierIdWhenLower(value);
            return this;
        }

        /**
         * Sets the value of the switchToTierIdWhenHigher property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         * @return
         *     The class instance
         */
        @Override
        public IncentiveTableDescriptionTierType.BoundaryDescription withSwitchToTierIdWhenHigher(Long value) {
            setSwitchToTierIdWhenHigher(value);
            return this;
        }

        /**
         * Sets the value of the boundaryUnit property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         * @return
         *     The class instance
         */
        @Override
        public IncentiveTableDescriptionTierType.BoundaryDescription withBoundaryUnit(String value) {
            setBoundaryUnit(value);
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
        public IncentiveTableDescriptionTierType.BoundaryDescription withLabel(String value) {
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
        public IncentiveTableDescriptionTierType.BoundaryDescription withDescription(String value) {
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
            return new IncentiveTableDescriptionTierType.BoundaryDescription();
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}IncentiveDescriptionDataType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="incentiveId" type="{http://docs.eebus.org/spine/xsd/v1}IncentiveIdType" minOccurs="0"/&gt;
     *         &lt;element name="incentiveType" type="{http://docs.eebus.org/spine/xsd/v1}IncentiveTypeType" minOccurs="0"/&gt;
     *         &lt;element name="incentivePriority" type="{http://docs.eebus.org/spine/xsd/v1}IncentivePriorityType" minOccurs="0"/&gt;
     *         &lt;element name="currency" type="{http://docs.eebus.org/spine/xsd/v1}CurrencyType" minOccurs="0"/&gt;
     *         &lt;element name="unit" type="{http://docs.eebus.org/spine/xsd/v1}UnitOfMeasurementType" minOccurs="0"/&gt;
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
    public static class IncentiveDescription
        extends IncentiveDescriptionDataType
        implements Cloneable, CopyTo, ToString
    {


        /**
         * Default no-arg constructor
         * 
         */
        public IncentiveDescription() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public IncentiveDescription(final Long incentiveId, final String incentiveType, final Long incentivePriority, final String currency, final String unit, final String label, final String description) {
            super(incentiveId, incentiveType, incentivePriority, currency, unit, label, description);
        }

        /**
         * Sets the value of the incentiveId property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         * @return
         *     The class instance
         */
        @Override
        public IncentiveTableDescriptionTierType.IncentiveDescription withIncentiveId(Long value) {
            setIncentiveId(value);
            return this;
        }

        /**
         * Sets the value of the incentiveType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         * @return
         *     The class instance
         */
        @Override
        public IncentiveTableDescriptionTierType.IncentiveDescription withIncentiveType(String value) {
            setIncentiveType(value);
            return this;
        }

        /**
         * Sets the value of the incentivePriority property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         * @return
         *     The class instance
         */
        @Override
        public IncentiveTableDescriptionTierType.IncentiveDescription withIncentivePriority(Long value) {
            setIncentivePriority(value);
            return this;
        }

        /**
         * Sets the value of the currency property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         * @return
         *     The class instance
         */
        @Override
        public IncentiveTableDescriptionTierType.IncentiveDescription withCurrency(String value) {
            setCurrency(value);
            return this;
        }

        /**
         * Sets the value of the unit property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         * @return
         *     The class instance
         */
        @Override
        public IncentiveTableDescriptionTierType.IncentiveDescription withUnit(String value) {
            setUnit(value);
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
        public IncentiveTableDescriptionTierType.IncentiveDescription withLabel(String value) {
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
        public IncentiveTableDescriptionTierType.IncentiveDescription withDescription(String value) {
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
            return new IncentiveTableDescriptionTierType.IncentiveDescription();
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}TierDescriptionDataType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="tierId" type="{http://docs.eebus.org/spine/xsd/v1}TierIdType" minOccurs="0"/&gt;
     *         &lt;element name="tierType" type="{http://docs.eebus.org/spine/xsd/v1}TierTypeType" minOccurs="0"/&gt;
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
    public static class TierDescription
        extends TierDescriptionDataType
        implements Cloneable, CopyTo, ToString
    {


        /**
         * Default no-arg constructor
         * 
         */
        public TierDescription() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public TierDescription(final Long tierId, final String tierType, final String label, final String description) {
            super(tierId, tierType, label, description);
        }

        /**
         * Sets the value of the tierId property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         * @return
         *     The class instance
         */
        @Override
        public IncentiveTableDescriptionTierType.TierDescription withTierId(Long value) {
            setTierId(value);
            return this;
        }

        /**
         * Sets the value of the tierType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         * @return
         *     The class instance
         */
        @Override
        public IncentiveTableDescriptionTierType.TierDescription withTierType(String value) {
            setTierType(value);
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
        public IncentiveTableDescriptionTierType.TierDescription withLabel(String value) {
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
        public IncentiveTableDescriptionTierType.TierDescription withDescription(String value) {
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
            return new IncentiveTableDescriptionTierType.TierDescription();
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
