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
 * <p>Java class for IncentiveTableTierElementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IncentiveTableTierElementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tier" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}TierDataElementsType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="tierId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="boundary" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}TierBoundaryDataElementsType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="boundaryId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *                   &lt;element name="lowerBoundaryValue" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberElementsType" minOccurs="0"/&gt;
 *                   &lt;element name="upperBoundaryValue" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberElementsType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="incentive" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}IncentiveDataElementsType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="incentiveId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *                   &lt;element name="value" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
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
@XmlType(name = "IncentiveTableTierElementsType", propOrder = {
    "tier",
    "boundary",
    "incentive"
})
public class IncentiveTableTierElementsType implements Cloneable, CopyTo, ToString
{

    protected IncentiveTableTierElementsType.Tier tier;
    protected IncentiveTableTierElementsType.Boundary boundary;
    protected IncentiveTableTierElementsType.Incentive incentive;

    /**
     * Default no-arg constructor
     * 
     */
    public IncentiveTableTierElementsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public IncentiveTableTierElementsType(final IncentiveTableTierElementsType.Tier tier, final IncentiveTableTierElementsType.Boundary boundary, final IncentiveTableTierElementsType.Incentive incentive) {
        this.tier = tier;
        this.boundary = boundary;
        this.incentive = incentive;
    }

    /**
     * Gets the value of the tier property.
     * 
     * @return
     *     possible object is
     *     {@link IncentiveTableTierElementsType.Tier }
     *     
     */
    public IncentiveTableTierElementsType.Tier getTier() {
        return tier;
    }

    /**
     * Sets the value of the tier property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncentiveTableTierElementsType.Tier }
     *     
     */
    public void setTier(IncentiveTableTierElementsType.Tier value) {
        this.tier = value;
    }

    /**
     * Gets the value of the boundary property.
     * 
     * @return
     *     possible object is
     *     {@link IncentiveTableTierElementsType.Boundary }
     *     
     */
    public IncentiveTableTierElementsType.Boundary getBoundary() {
        return boundary;
    }

    /**
     * Sets the value of the boundary property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncentiveTableTierElementsType.Boundary }
     *     
     */
    public void setBoundary(IncentiveTableTierElementsType.Boundary value) {
        this.boundary = value;
    }

    /**
     * Gets the value of the incentive property.
     * 
     * @return
     *     possible object is
     *     {@link IncentiveTableTierElementsType.Incentive }
     *     
     */
    public IncentiveTableTierElementsType.Incentive getIncentive() {
        return incentive;
    }

    /**
     * Sets the value of the incentive property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncentiveTableTierElementsType.Incentive }
     *     
     */
    public void setIncentive(IncentiveTableTierElementsType.Incentive value) {
        this.incentive = value;
    }

    /**
     * Sets the value of the tier property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncentiveTableTierElementsType.Tier }
     * @return
     *     The class instance
     */
    public IncentiveTableTierElementsType withTier(IncentiveTableTierElementsType.Tier value) {
        setTier(value);
        return this;
    }

    /**
     * Sets the value of the boundary property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncentiveTableTierElementsType.Boundary }
     * @return
     *     The class instance
     */
    public IncentiveTableTierElementsType withBoundary(IncentiveTableTierElementsType.Boundary value) {
        setBoundary(value);
        return this;
    }

    /**
     * Sets the value of the incentive property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncentiveTableTierElementsType.Incentive }
     * @return
     *     The class instance
     */
    public IncentiveTableTierElementsType withIncentive(IncentiveTableTierElementsType.Incentive value) {
        setIncentive(value);
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
        if (draftCopy instanceof IncentiveTableTierElementsType) {
            final IncentiveTableTierElementsType copy = ((IncentiveTableTierElementsType) draftCopy);
            {
                Boolean tierShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.tier!= null));
                if (tierShouldBeCopiedAndSet == Boolean.TRUE) {
                    IncentiveTableTierElementsType.Tier sourceTier;
                    sourceTier = this.getTier();
                    IncentiveTableTierElementsType.Tier copyTier = ((IncentiveTableTierElementsType.Tier) strategy.copy(LocatorUtils.property(locator, "tier", sourceTier), sourceTier, (this.tier!= null)));
                    copy.setTier(copyTier);
                } else {
                    if (tierShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.tier = null;
                    }
                }
            }
            {
                Boolean boundaryShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.boundary!= null));
                if (boundaryShouldBeCopiedAndSet == Boolean.TRUE) {
                    IncentiveTableTierElementsType.Boundary sourceBoundary;
                    sourceBoundary = this.getBoundary();
                    IncentiveTableTierElementsType.Boundary copyBoundary = ((IncentiveTableTierElementsType.Boundary) strategy.copy(LocatorUtils.property(locator, "boundary", sourceBoundary), sourceBoundary, (this.boundary!= null)));
                    copy.setBoundary(copyBoundary);
                } else {
                    if (boundaryShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.boundary = null;
                    }
                }
            }
            {
                Boolean incentiveShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.incentive!= null));
                if (incentiveShouldBeCopiedAndSet == Boolean.TRUE) {
                    IncentiveTableTierElementsType.Incentive sourceIncentive;
                    sourceIncentive = this.getIncentive();
                    IncentiveTableTierElementsType.Incentive copyIncentive = ((IncentiveTableTierElementsType.Incentive) strategy.copy(LocatorUtils.property(locator, "incentive", sourceIncentive), sourceIncentive, (this.incentive!= null)));
                    copy.setIncentive(copyIncentive);
                } else {
                    if (incentiveShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.incentive = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new IncentiveTableTierElementsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final IncentiveTableTierElementsType that = ((IncentiveTableTierElementsType) object);
        {
            IncentiveTableTierElementsType.Tier leftTier;
            leftTier = this.getTier();
            IncentiveTableTierElementsType.Tier rightTier;
            rightTier = that.getTier();
            if (this.tier!= null) {
                if (that.tier!= null) {
                    if (!leftTier.equals(rightTier)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.tier!= null) {
                    return false;
                }
            }
        }
        {
            IncentiveTableTierElementsType.Boundary leftBoundary;
            leftBoundary = this.getBoundary();
            IncentiveTableTierElementsType.Boundary rightBoundary;
            rightBoundary = that.getBoundary();
            if (this.boundary!= null) {
                if (that.boundary!= null) {
                    if (!leftBoundary.equals(rightBoundary)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.boundary!= null) {
                    return false;
                }
            }
        }
        {
            IncentiveTableTierElementsType.Incentive leftIncentive;
            leftIncentive = this.getIncentive();
            IncentiveTableTierElementsType.Incentive rightIncentive;
            rightIncentive = that.getIncentive();
            if (this.incentive!= null) {
                if (that.incentive!= null) {
                    if (!leftIncentive.equals(rightIncentive)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.incentive!= null) {
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
            IncentiveTableTierElementsType.Tier theTier;
            theTier = this.getTier();
            if (this.tier!= null) {
                currentHashCode += theTier.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            IncentiveTableTierElementsType.Boundary theBoundary;
            theBoundary = this.getBoundary();
            if (this.boundary!= null) {
                currentHashCode += theBoundary.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            IncentiveTableTierElementsType.Incentive theIncentive;
            theIncentive = this.getIncentive();
            if (this.incentive!= null) {
                currentHashCode += theIncentive.hashCode();
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
            IncentiveTableTierElementsType.Tier theTier;
            theTier = this.getTier();
            strategy.appendField(locator, this, "tier", buffer, theTier, (this.tier!= null));
        }
        {
            IncentiveTableTierElementsType.Boundary theBoundary;
            theBoundary = this.getBoundary();
            strategy.appendField(locator, this, "boundary", buffer, theBoundary, (this.boundary!= null));
        }
        {
            IncentiveTableTierElementsType.Incentive theIncentive;
            theIncentive = this.getIncentive();
            strategy.appendField(locator, this, "incentive", buffer, theIncentive, (this.incentive!= null));
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
     *     &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}TierBoundaryDataElementsType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="boundaryId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
     *         &lt;element name="lowerBoundaryValue" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberElementsType" minOccurs="0"/&gt;
     *         &lt;element name="upperBoundaryValue" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberElementsType" minOccurs="0"/&gt;
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
    public static class Boundary
        extends TierBoundaryDataElementsType
        implements Cloneable, CopyTo, ToString
    {


        /**
         * Default no-arg constructor
         * 
         */
        public Boundary() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public Boundary(final ElementTagType boundaryId, final TimePeriodElementsType timePeriod, final ElementTagType timeTableId, final ScaledNumberElementsType lowerBoundaryValue, final ScaledNumberElementsType upperBoundaryValue) {
            super(boundaryId, timePeriod, timeTableId, lowerBoundaryValue, upperBoundaryValue);
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
        public IncentiveTableTierElementsType.Boundary withBoundaryId(ElementTagType value) {
            setBoundaryId(value);
            return this;
        }

        /**
         * Sets the value of the timePeriod property.
         * 
         * @param value
         *     allowed object is
         *     {@link TimePeriodElementsType }
         * @return
         *     The class instance
         */
        @Override
        public IncentiveTableTierElementsType.Boundary withTimePeriod(TimePeriodElementsType value) {
            setTimePeriod(value);
            return this;
        }

        /**
         * Sets the value of the timeTableId property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElementTagType }
         * @return
         *     The class instance
         */
        @Override
        public IncentiveTableTierElementsType.Boundary withTimeTableId(ElementTagType value) {
            setTimeTableId(value);
            return this;
        }

        /**
         * Sets the value of the lowerBoundaryValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link ScaledNumberElementsType }
         * @return
         *     The class instance
         */
        @Override
        public IncentiveTableTierElementsType.Boundary withLowerBoundaryValue(ScaledNumberElementsType value) {
            setLowerBoundaryValue(value);
            return this;
        }

        /**
         * Sets the value of the upperBoundaryValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link ScaledNumberElementsType }
         * @return
         *     The class instance
         */
        @Override
        public IncentiveTableTierElementsType.Boundary withUpperBoundaryValue(ScaledNumberElementsType value) {
            setUpperBoundaryValue(value);
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
            return new IncentiveTableTierElementsType.Boundary();
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
     *     &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}IncentiveDataElementsType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="incentiveId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
     *         &lt;element name="value" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
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
    public static class Incentive
        extends IncentiveDataElementsType
        implements Cloneable, CopyTo, ToString
    {


        /**
         * Default no-arg constructor
         * 
         */
        public Incentive() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public Incentive(final ElementTagType incentiveId, final ElementTagType valueType, final ElementTagType timestamp, final TimePeriodElementsType timePeriod, final ElementTagType timeTableId, final ElementTagType value) {
            super(incentiveId, valueType, timestamp, timePeriod, timeTableId, value);
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
        public IncentiveTableTierElementsType.Incentive withIncentiveId(ElementTagType value) {
            setIncentiveId(value);
            return this;
        }

        /**
         * Sets the value of the valueType property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElementTagType }
         * @return
         *     The class instance
         */
        @Override
        public IncentiveTableTierElementsType.Incentive withValueType(ElementTagType value) {
            setValueType(value);
            return this;
        }

        /**
         * Sets the value of the timestamp property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElementTagType }
         * @return
         *     The class instance
         */
        @Override
        public IncentiveTableTierElementsType.Incentive withTimestamp(ElementTagType value) {
            setTimestamp(value);
            return this;
        }

        /**
         * Sets the value of the timePeriod property.
         * 
         * @param value
         *     allowed object is
         *     {@link TimePeriodElementsType }
         * @return
         *     The class instance
         */
        @Override
        public IncentiveTableTierElementsType.Incentive withTimePeriod(TimePeriodElementsType value) {
            setTimePeriod(value);
            return this;
        }

        /**
         * Sets the value of the timeTableId property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElementTagType }
         * @return
         *     The class instance
         */
        @Override
        public IncentiveTableTierElementsType.Incentive withTimeTableId(ElementTagType value) {
            setTimeTableId(value);
            return this;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElementTagType }
         * @return
         *     The class instance
         */
        @Override
        public IncentiveTableTierElementsType.Incentive withValue(ElementTagType value) {
            setValue(value);
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
            return new IncentiveTableTierElementsType.Incentive();
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
     *     &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}TierDataElementsType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="tierId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
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
    public static class Tier
        extends TierDataElementsType
        implements Cloneable, CopyTo, ToString
    {


        /**
         * Default no-arg constructor
         * 
         */
        public Tier() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public Tier(final ElementTagType tierId, final TimePeriodElementsType timePeriod, final ElementTagType timeTableId, final ElementTagType activeIncentiveId) {
            super(tierId, timePeriod, timeTableId, activeIncentiveId);
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
        public IncentiveTableTierElementsType.Tier withTierId(ElementTagType value) {
            setTierId(value);
            return this;
        }

        /**
         * Sets the value of the timePeriod property.
         * 
         * @param value
         *     allowed object is
         *     {@link TimePeriodElementsType }
         * @return
         *     The class instance
         */
        @Override
        public IncentiveTableTierElementsType.Tier withTimePeriod(TimePeriodElementsType value) {
            setTimePeriod(value);
            return this;
        }

        /**
         * Sets the value of the timeTableId property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElementTagType }
         * @return
         *     The class instance
         */
        @Override
        public IncentiveTableTierElementsType.Tier withTimeTableId(ElementTagType value) {
            setTimeTableId(value);
            return this;
        }

        /**
         * Sets the value of the activeIncentiveId property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElementTagType }
         * @return
         *     The class instance
         */
        @Override
        public IncentiveTableTierElementsType.Tier withActiveIncentiveId(ElementTagType value) {
            setActiveIncentiveId(value);
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
            return new IncentiveTableTierElementsType.Tier();
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
