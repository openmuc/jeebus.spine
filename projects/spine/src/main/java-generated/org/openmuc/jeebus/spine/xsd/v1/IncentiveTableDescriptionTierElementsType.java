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
 * <p>Java class for IncentiveTableDescriptionTierElementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IncentiveTableDescriptionTierElementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tierDescription" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}TierDescriptionDataElementsType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="tierId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *                   &lt;element name="tierType" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *                   &lt;element name="label" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *                   &lt;element name="description" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="boundaryDescription" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}TierBoundaryDescriptionDataElementsType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="boundaryId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *                   &lt;element name="boundaryType" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *                   &lt;element name="switchToTierIdWhenLower" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *                   &lt;element name="switchToTierIdWhenHigher" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *                   &lt;element name="boundaryUnit" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="incentiveDescription" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}IncentiveDescriptionDataElementsType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="incentiveId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *                   &lt;element name="incentiveType" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *                   &lt;element name="incentivePriority" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *                   &lt;element name="currency" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *                   &lt;element name="unit" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
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
@XmlType(name = "IncentiveTableDescriptionTierElementsType", propOrder = {
    "tierDescription",
    "boundaryDescription",
    "incentiveDescription"
})
public class IncentiveTableDescriptionTierElementsType implements Cloneable, CopyTo, ToString
{

    protected IncentiveTableDescriptionTierElementsType.TierDescription tierDescription;
    protected IncentiveTableDescriptionTierElementsType.BoundaryDescription boundaryDescription;
    protected IncentiveTableDescriptionTierElementsType.IncentiveDescription incentiveDescription;

    /**
     * Default no-arg constructor
     * 
     */
    public IncentiveTableDescriptionTierElementsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public IncentiveTableDescriptionTierElementsType(final IncentiveTableDescriptionTierElementsType.TierDescription tierDescription, final IncentiveTableDescriptionTierElementsType.BoundaryDescription boundaryDescription, final IncentiveTableDescriptionTierElementsType.IncentiveDescription incentiveDescription) {
        this.tierDescription = tierDescription;
        this.boundaryDescription = boundaryDescription;
        this.incentiveDescription = incentiveDescription;
    }

    /**
     * Gets the value of the tierDescription property.
     * 
     * @return
     *     possible object is
     *     {@link IncentiveTableDescriptionTierElementsType.TierDescription }
     *     
     */
    public IncentiveTableDescriptionTierElementsType.TierDescription getTierDescription() {
        return tierDescription;
    }

    /**
     * Sets the value of the tierDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncentiveTableDescriptionTierElementsType.TierDescription }
     *     
     */
    public void setTierDescription(IncentiveTableDescriptionTierElementsType.TierDescription value) {
        this.tierDescription = value;
    }

    /**
     * Gets the value of the boundaryDescription property.
     * 
     * @return
     *     possible object is
     *     {@link IncentiveTableDescriptionTierElementsType.BoundaryDescription }
     *     
     */
    public IncentiveTableDescriptionTierElementsType.BoundaryDescription getBoundaryDescription() {
        return boundaryDescription;
    }

    /**
     * Sets the value of the boundaryDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncentiveTableDescriptionTierElementsType.BoundaryDescription }
     *     
     */
    public void setBoundaryDescription(IncentiveTableDescriptionTierElementsType.BoundaryDescription value) {
        this.boundaryDescription = value;
    }

    /**
     * Gets the value of the incentiveDescription property.
     * 
     * @return
     *     possible object is
     *     {@link IncentiveTableDescriptionTierElementsType.IncentiveDescription }
     *     
     */
    public IncentiveTableDescriptionTierElementsType.IncentiveDescription getIncentiveDescription() {
        return incentiveDescription;
    }

    /**
     * Sets the value of the incentiveDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncentiveTableDescriptionTierElementsType.IncentiveDescription }
     *     
     */
    public void setIncentiveDescription(IncentiveTableDescriptionTierElementsType.IncentiveDescription value) {
        this.incentiveDescription = value;
    }

    /**
     * Sets the value of the tierDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncentiveTableDescriptionTierElementsType.TierDescription }
     * @return
     *     The class instance
     */
    public IncentiveTableDescriptionTierElementsType withTierDescription(IncentiveTableDescriptionTierElementsType.TierDescription value) {
        setTierDescription(value);
        return this;
    }

    /**
     * Sets the value of the boundaryDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncentiveTableDescriptionTierElementsType.BoundaryDescription }
     * @return
     *     The class instance
     */
    public IncentiveTableDescriptionTierElementsType withBoundaryDescription(IncentiveTableDescriptionTierElementsType.BoundaryDescription value) {
        setBoundaryDescription(value);
        return this;
    }

    /**
     * Sets the value of the incentiveDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncentiveTableDescriptionTierElementsType.IncentiveDescription }
     * @return
     *     The class instance
     */
    public IncentiveTableDescriptionTierElementsType withIncentiveDescription(IncentiveTableDescriptionTierElementsType.IncentiveDescription value) {
        setIncentiveDescription(value);
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
        if (draftCopy instanceof IncentiveTableDescriptionTierElementsType) {
            final IncentiveTableDescriptionTierElementsType copy = ((IncentiveTableDescriptionTierElementsType) draftCopy);
            {
                Boolean tierDescriptionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.tierDescription!= null));
                if (tierDescriptionShouldBeCopiedAndSet == Boolean.TRUE) {
                    IncentiveTableDescriptionTierElementsType.TierDescription sourceTierDescription;
                    sourceTierDescription = this.getTierDescription();
                    IncentiveTableDescriptionTierElementsType.TierDescription copyTierDescription = ((IncentiveTableDescriptionTierElementsType.TierDescription) strategy.copy(LocatorUtils.property(locator, "tierDescription", sourceTierDescription), sourceTierDescription, (this.tierDescription!= null)));
                    copy.setTierDescription(copyTierDescription);
                } else {
                    if (tierDescriptionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.tierDescription = null;
                    }
                }
            }
            {
                Boolean boundaryDescriptionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.boundaryDescription!= null));
                if (boundaryDescriptionShouldBeCopiedAndSet == Boolean.TRUE) {
                    IncentiveTableDescriptionTierElementsType.BoundaryDescription sourceBoundaryDescription;
                    sourceBoundaryDescription = this.getBoundaryDescription();
                    IncentiveTableDescriptionTierElementsType.BoundaryDescription copyBoundaryDescription = ((IncentiveTableDescriptionTierElementsType.BoundaryDescription) strategy.copy(LocatorUtils.property(locator, "boundaryDescription", sourceBoundaryDescription), sourceBoundaryDescription, (this.boundaryDescription!= null)));
                    copy.setBoundaryDescription(copyBoundaryDescription);
                } else {
                    if (boundaryDescriptionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.boundaryDescription = null;
                    }
                }
            }
            {
                Boolean incentiveDescriptionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.incentiveDescription!= null));
                if (incentiveDescriptionShouldBeCopiedAndSet == Boolean.TRUE) {
                    IncentiveTableDescriptionTierElementsType.IncentiveDescription sourceIncentiveDescription;
                    sourceIncentiveDescription = this.getIncentiveDescription();
                    IncentiveTableDescriptionTierElementsType.IncentiveDescription copyIncentiveDescription = ((IncentiveTableDescriptionTierElementsType.IncentiveDescription) strategy.copy(LocatorUtils.property(locator, "incentiveDescription", sourceIncentiveDescription), sourceIncentiveDescription, (this.incentiveDescription!= null)));
                    copy.setIncentiveDescription(copyIncentiveDescription);
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
        return new IncentiveTableDescriptionTierElementsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final IncentiveTableDescriptionTierElementsType that = ((IncentiveTableDescriptionTierElementsType) object);
        {
            IncentiveTableDescriptionTierElementsType.TierDescription leftTierDescription;
            leftTierDescription = this.getTierDescription();
            IncentiveTableDescriptionTierElementsType.TierDescription rightTierDescription;
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
            IncentiveTableDescriptionTierElementsType.BoundaryDescription leftBoundaryDescription;
            leftBoundaryDescription = this.getBoundaryDescription();
            IncentiveTableDescriptionTierElementsType.BoundaryDescription rightBoundaryDescription;
            rightBoundaryDescription = that.getBoundaryDescription();
            if (this.boundaryDescription!= null) {
                if (that.boundaryDescription!= null) {
                    if (!leftBoundaryDescription.equals(rightBoundaryDescription)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.boundaryDescription!= null) {
                    return false;
                }
            }
        }
        {
            IncentiveTableDescriptionTierElementsType.IncentiveDescription leftIncentiveDescription;
            leftIncentiveDescription = this.getIncentiveDescription();
            IncentiveTableDescriptionTierElementsType.IncentiveDescription rightIncentiveDescription;
            rightIncentiveDescription = that.getIncentiveDescription();
            if (this.incentiveDescription!= null) {
                if (that.incentiveDescription!= null) {
                    if (!leftIncentiveDescription.equals(rightIncentiveDescription)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.incentiveDescription!= null) {
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
            IncentiveTableDescriptionTierElementsType.TierDescription theTierDescription;
            theTierDescription = this.getTierDescription();
            if (this.tierDescription!= null) {
                currentHashCode += theTierDescription.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            IncentiveTableDescriptionTierElementsType.BoundaryDescription theBoundaryDescription;
            theBoundaryDescription = this.getBoundaryDescription();
            if (this.boundaryDescription!= null) {
                currentHashCode += theBoundaryDescription.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            IncentiveTableDescriptionTierElementsType.IncentiveDescription theIncentiveDescription;
            theIncentiveDescription = this.getIncentiveDescription();
            if (this.incentiveDescription!= null) {
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
            IncentiveTableDescriptionTierElementsType.TierDescription theTierDescription;
            theTierDescription = this.getTierDescription();
            strategy.appendField(locator, this, "tierDescription", buffer, theTierDescription, (this.tierDescription!= null));
        }
        {
            IncentiveTableDescriptionTierElementsType.BoundaryDescription theBoundaryDescription;
            theBoundaryDescription = this.getBoundaryDescription();
            strategy.appendField(locator, this, "boundaryDescription", buffer, theBoundaryDescription, (this.boundaryDescription!= null));
        }
        {
            IncentiveTableDescriptionTierElementsType.IncentiveDescription theIncentiveDescription;
            theIncentiveDescription = this.getIncentiveDescription();
            strategy.appendField(locator, this, "incentiveDescription", buffer, theIncentiveDescription, (this.incentiveDescription!= null));
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
     *     &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}TierBoundaryDescriptionDataElementsType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="boundaryId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
     *         &lt;element name="boundaryType" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
     *         &lt;element name="switchToTierIdWhenLower" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
     *         &lt;element name="switchToTierIdWhenHigher" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
     *         &lt;element name="boundaryUnit" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
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
        extends TierBoundaryDescriptionDataElementsType
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
        public BoundaryDescription(final ElementTagType boundaryId, final ElementTagType boundaryType, final ElementTagType validForTierId, final ElementTagType switchToTierIdWhenLower, final ElementTagType switchToTierIdWhenHigher, final ElementTagType boundaryUnit, final ElementTagType label, final ElementTagType description) {
            super(boundaryId, boundaryType, validForTierId, switchToTierIdWhenLower, switchToTierIdWhenHigher, boundaryUnit, label, description);
        }

        /**
         * Sets the value of the boundaryId property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElementTagType }
         * @return
         *     The class instance
         */
        @Override
        public IncentiveTableDescriptionTierElementsType.BoundaryDescription withBoundaryId(ElementTagType value) {
            setBoundaryId(value);
            return this;
        }

        /**
         * Sets the value of the boundaryType property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElementTagType }
         * @return
         *     The class instance
         */
        @Override
        public IncentiveTableDescriptionTierElementsType.BoundaryDescription withBoundaryType(ElementTagType value) {
            setBoundaryType(value);
            return this;
        }

        /**
         * Sets the value of the validForTierId property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElementTagType }
         * @return
         *     The class instance
         */
        @Override
        public IncentiveTableDescriptionTierElementsType.BoundaryDescription withValidForTierId(ElementTagType value) {
            setValidForTierId(value);
            return this;
        }

        /**
         * Sets the value of the switchToTierIdWhenLower property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElementTagType }
         * @return
         *     The class instance
         */
        @Override
        public IncentiveTableDescriptionTierElementsType.BoundaryDescription withSwitchToTierIdWhenLower(ElementTagType value) {
            setSwitchToTierIdWhenLower(value);
            return this;
        }

        /**
         * Sets the value of the switchToTierIdWhenHigher property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElementTagType }
         * @return
         *     The class instance
         */
        @Override
        public IncentiveTableDescriptionTierElementsType.BoundaryDescription withSwitchToTierIdWhenHigher(ElementTagType value) {
            setSwitchToTierIdWhenHigher(value);
            return this;
        }

        /**
         * Sets the value of the boundaryUnit property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElementTagType }
         * @return
         *     The class instance
         */
        @Override
        public IncentiveTableDescriptionTierElementsType.BoundaryDescription withBoundaryUnit(ElementTagType value) {
            setBoundaryUnit(value);
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
        public IncentiveTableDescriptionTierElementsType.BoundaryDescription withLabel(ElementTagType value) {
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
        public IncentiveTableDescriptionTierElementsType.BoundaryDescription withDescription(ElementTagType value) {
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
            return new IncentiveTableDescriptionTierElementsType.BoundaryDescription();
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
     *     &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}IncentiveDescriptionDataElementsType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="incentiveId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
     *         &lt;element name="incentiveType" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
     *         &lt;element name="incentivePriority" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
     *         &lt;element name="currency" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
     *         &lt;element name="unit" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
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
    public static class IncentiveDescription
        extends IncentiveDescriptionDataElementsType
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
        public IncentiveDescription(final ElementTagType incentiveId, final ElementTagType incentiveType, final ElementTagType incentivePriority, final ElementTagType currency, final ElementTagType unit, final ElementTagType label, final ElementTagType description) {
            super(incentiveId, incentiveType, incentivePriority, currency, unit, label, description);
        }

        /**
         * Sets the value of the incentiveId property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElementTagType }
         * @return
         *     The class instance
         */
        @Override
        public IncentiveTableDescriptionTierElementsType.IncentiveDescription withIncentiveId(ElementTagType value) {
            setIncentiveId(value);
            return this;
        }

        /**
         * Sets the value of the incentiveType property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElementTagType }
         * @return
         *     The class instance
         */
        @Override
        public IncentiveTableDescriptionTierElementsType.IncentiveDescription withIncentiveType(ElementTagType value) {
            setIncentiveType(value);
            return this;
        }

        /**
         * Sets the value of the incentivePriority property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElementTagType }
         * @return
         *     The class instance
         */
        @Override
        public IncentiveTableDescriptionTierElementsType.IncentiveDescription withIncentivePriority(ElementTagType value) {
            setIncentivePriority(value);
            return this;
        }

        /**
         * Sets the value of the currency property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElementTagType }
         * @return
         *     The class instance
         */
        @Override
        public IncentiveTableDescriptionTierElementsType.IncentiveDescription withCurrency(ElementTagType value) {
            setCurrency(value);
            return this;
        }

        /**
         * Sets the value of the unit property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElementTagType }
         * @return
         *     The class instance
         */
        @Override
        public IncentiveTableDescriptionTierElementsType.IncentiveDescription withUnit(ElementTagType value) {
            setUnit(value);
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
        public IncentiveTableDescriptionTierElementsType.IncentiveDescription withLabel(ElementTagType value) {
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
        public IncentiveTableDescriptionTierElementsType.IncentiveDescription withDescription(ElementTagType value) {
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
            return new IncentiveTableDescriptionTierElementsType.IncentiveDescription();
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
     *     &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}TierDescriptionDataElementsType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="tierId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
     *         &lt;element name="tierType" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
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
    public static class TierDescription
        extends TierDescriptionDataElementsType
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
        public TierDescription(final ElementTagType tierId, final ElementTagType tierType, final ElementTagType label, final ElementTagType description) {
            super(tierId, tierType, label, description);
        }

        /**
         * Sets the value of the tierId property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElementTagType }
         * @return
         *     The class instance
         */
        @Override
        public IncentiveTableDescriptionTierElementsType.TierDescription withTierId(ElementTagType value) {
            setTierId(value);
            return this;
        }

        /**
         * Sets the value of the tierType property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElementTagType }
         * @return
         *     The class instance
         */
        @Override
        public IncentiveTableDescriptionTierElementsType.TierDescription withTierType(ElementTagType value) {
            setTierType(value);
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
        public IncentiveTableDescriptionTierElementsType.TierDescription withLabel(ElementTagType value) {
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
        public IncentiveTableDescriptionTierElementsType.TierDescription withDescription(ElementTagType value) {
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
            return new IncentiveTableDescriptionTierElementsType.TierDescription();
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
