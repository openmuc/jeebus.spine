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
 * <p>Java class for IncentiveTableTierType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IncentiveTableTierType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tier" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}TierDataType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="tierId" type="{http://docs.eebus.org/spine/xsd/v1}TierIdType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="boundary" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}TierBoundaryDataType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="boundaryId" type="{http://docs.eebus.org/spine/xsd/v1}TierBoundaryIdType" minOccurs="0"/&gt;
 *                   &lt;element name="lowerBoundaryValue" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberType" minOccurs="0"/&gt;
 *                   &lt;element name="upperBoundaryValue" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="incentive" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}IncentiveDataType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="incentiveId" type="{http://docs.eebus.org/spine/xsd/v1}IncentiveIdType" minOccurs="0"/&gt;
 *                   &lt;element name="value" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberType" minOccurs="0"/&gt;
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
@XmlType(name = "IncentiveTableTierType", propOrder = {
    "tier",
    "boundary",
    "incentive"
})
public class IncentiveTableTierType implements Cloneable, CopyTo, ToString
{

    protected IncentiveTableTierType.Tier tier;
    protected List<IncentiveTableTierType.Boundary> boundary;
    protected List<IncentiveTableTierType.Incentive> incentive;

    /**
     * Default no-arg constructor
     * 
     */
    public IncentiveTableTierType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public IncentiveTableTierType(final IncentiveTableTierType.Tier tier, final List<IncentiveTableTierType.Boundary> boundary, final List<IncentiveTableTierType.Incentive> incentive) {
        this.tier = tier;
        this.boundary = boundary;
        this.incentive = incentive;
    }

    /**
     * Gets the value of the tier property.
     * 
     * @return
     *     possible object is
     *     {@link IncentiveTableTierType.Tier }
     *     
     */
    public IncentiveTableTierType.Tier getTier() {
        return tier;
    }

    /**
     * Sets the value of the tier property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncentiveTableTierType.Tier }
     *     
     */
    public void setTier(IncentiveTableTierType.Tier value) {
        this.tier = value;
    }

    /**
     * Gets the value of the boundary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the boundary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBoundary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IncentiveTableTierType.Boundary }
     * 
     * 
     */
    public List<IncentiveTableTierType.Boundary> getBoundary() {
        if (boundary == null) {
            boundary = new ArrayList<IncentiveTableTierType.Boundary>();
        }
        return this.boundary;
    }

    /**
     * Gets the value of the incentive property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the incentive property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncentive().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IncentiveTableTierType.Incentive }
     * 
     * 
     */
    public List<IncentiveTableTierType.Incentive> getIncentive() {
        if (incentive == null) {
            incentive = new ArrayList<IncentiveTableTierType.Incentive>();
        }
        return this.incentive;
    }

    /**
     * Sets the value of the tier property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncentiveTableTierType.Tier }
     * @return
     *     The class instance
     */
    public IncentiveTableTierType withTier(IncentiveTableTierType.Tier value) {
        setTier(value);
        return this;
    }

    /**
     * Adds objects to the list of Boundary using add method
     * 
     * @param values
     *     objects to add to the list Boundary
     * @return
     *     The class instance
     */
    public IncentiveTableTierType withBoundary(IncentiveTableTierType.Boundary... values) {
        if (values!= null) {
            for (IncentiveTableTierType.Boundary value: values) {
                getBoundary().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of Boundary using addAll method
     * 
     * @param values
     *     objects to add to the list Boundary
     * @return
     *     The class instance
     */
    public IncentiveTableTierType withBoundary(Collection<IncentiveTableTierType.Boundary> values) {
        if (values!= null) {
            getBoundary().addAll(values);
        }
        return this;
    }

    /**
     * Adds objects to the list of Incentive using add method
     * 
     * @param values
     *     objects to add to the list Incentive
     * @return
     *     The class instance
     */
    public IncentiveTableTierType withIncentive(IncentiveTableTierType.Incentive... values) {
        if (values!= null) {
            for (IncentiveTableTierType.Incentive value: values) {
                getIncentive().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of Incentive using addAll method
     * 
     * @param values
     *     objects to add to the list Incentive
     * @return
     *     The class instance
     */
    public IncentiveTableTierType withIncentive(Collection<IncentiveTableTierType.Incentive> values) {
        if (values!= null) {
            getIncentive().addAll(values);
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
        if (draftCopy instanceof IncentiveTableTierType) {
            final IncentiveTableTierType copy = ((IncentiveTableTierType) draftCopy);
            {
                Boolean tierShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.tier!= null));
                if (tierShouldBeCopiedAndSet == Boolean.TRUE) {
                    IncentiveTableTierType.Tier sourceTier;
                    sourceTier = this.getTier();
                    IncentiveTableTierType.Tier copyTier = ((IncentiveTableTierType.Tier) strategy.copy(LocatorUtils.property(locator, "tier", sourceTier), sourceTier, (this.tier!= null)));
                    copy.setTier(copyTier);
                } else {
                    if (tierShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.tier = null;
                    }
                }
            }
            {
                Boolean boundaryShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.boundary!= null)&&(!this.boundary.isEmpty())));
                if (boundaryShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<IncentiveTableTierType.Boundary> sourceBoundary;
                    sourceBoundary = (((this.boundary!= null)&&(!this.boundary.isEmpty()))?this.getBoundary():null);
                    @SuppressWarnings("unchecked")
                    List<IncentiveTableTierType.Boundary> copyBoundary = ((List<IncentiveTableTierType.Boundary> ) strategy.copy(LocatorUtils.property(locator, "boundary", sourceBoundary), sourceBoundary, ((this.boundary!= null)&&(!this.boundary.isEmpty()))));
                    copy.boundary = null;
                    if (copyBoundary!= null) {
                        List<IncentiveTableTierType.Boundary> uniqueBoundaryl = copy.getBoundary();
                        uniqueBoundaryl.addAll(copyBoundary);
                    }
                } else {
                    if (boundaryShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.boundary = null;
                    }
                }
            }
            {
                Boolean incentiveShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.incentive!= null)&&(!this.incentive.isEmpty())));
                if (incentiveShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<IncentiveTableTierType.Incentive> sourceIncentive;
                    sourceIncentive = (((this.incentive!= null)&&(!this.incentive.isEmpty()))?this.getIncentive():null);
                    @SuppressWarnings("unchecked")
                    List<IncentiveTableTierType.Incentive> copyIncentive = ((List<IncentiveTableTierType.Incentive> ) strategy.copy(LocatorUtils.property(locator, "incentive", sourceIncentive), sourceIncentive, ((this.incentive!= null)&&(!this.incentive.isEmpty()))));
                    copy.incentive = null;
                    if (copyIncentive!= null) {
                        List<IncentiveTableTierType.Incentive> uniqueIncentivel = copy.getIncentive();
                        uniqueIncentivel.addAll(copyIncentive);
                    }
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
        return new IncentiveTableTierType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final IncentiveTableTierType that = ((IncentiveTableTierType) object);
        {
            IncentiveTableTierType.Tier leftTier;
            leftTier = this.getTier();
            IncentiveTableTierType.Tier rightTier;
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
            List<IncentiveTableTierType.Boundary> leftBoundary;
            leftBoundary = (((this.boundary!= null)&&(!this.boundary.isEmpty()))?this.getBoundary():null);
            List<IncentiveTableTierType.Boundary> rightBoundary;
            rightBoundary = (((that.boundary!= null)&&(!that.boundary.isEmpty()))?that.getBoundary():null);
            if ((this.boundary!= null)&&(!this.boundary.isEmpty())) {
                if ((that.boundary!= null)&&(!that.boundary.isEmpty())) {
                    if (!leftBoundary.equals(rightBoundary)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.boundary!= null)&&(!that.boundary.isEmpty())) {
                    return false;
                }
            }
        }
        {
            List<IncentiveTableTierType.Incentive> leftIncentive;
            leftIncentive = (((this.incentive!= null)&&(!this.incentive.isEmpty()))?this.getIncentive():null);
            List<IncentiveTableTierType.Incentive> rightIncentive;
            rightIncentive = (((that.incentive!= null)&&(!that.incentive.isEmpty()))?that.getIncentive():null);
            if ((this.incentive!= null)&&(!this.incentive.isEmpty())) {
                if ((that.incentive!= null)&&(!that.incentive.isEmpty())) {
                    if (!leftIncentive.equals(rightIncentive)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.incentive!= null)&&(!that.incentive.isEmpty())) {
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
            IncentiveTableTierType.Tier theTier;
            theTier = this.getTier();
            if (this.tier!= null) {
                currentHashCode += theTier.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            List<IncentiveTableTierType.Boundary> theBoundary;
            theBoundary = (((this.boundary!= null)&&(!this.boundary.isEmpty()))?this.getBoundary():null);
            if ((this.boundary!= null)&&(!this.boundary.isEmpty())) {
                currentHashCode += theBoundary.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            List<IncentiveTableTierType.Incentive> theIncentive;
            theIncentive = (((this.incentive!= null)&&(!this.incentive.isEmpty()))?this.getIncentive():null);
            if ((this.incentive!= null)&&(!this.incentive.isEmpty())) {
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
            IncentiveTableTierType.Tier theTier;
            theTier = this.getTier();
            strategy.appendField(locator, this, "tier", buffer, theTier, (this.tier!= null));
        }
        {
            List<IncentiveTableTierType.Boundary> theBoundary;
            theBoundary = (((this.boundary!= null)&&(!this.boundary.isEmpty()))?this.getBoundary():null);
            strategy.appendField(locator, this, "boundary", buffer, theBoundary, ((this.boundary!= null)&&(!this.boundary.isEmpty())));
        }
        {
            List<IncentiveTableTierType.Incentive> theIncentive;
            theIncentive = (((this.incentive!= null)&&(!this.incentive.isEmpty()))?this.getIncentive():null);
            strategy.appendField(locator, this, "incentive", buffer, theIncentive, ((this.incentive!= null)&&(!this.incentive.isEmpty())));
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
     *     &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}TierBoundaryDataType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="boundaryId" type="{http://docs.eebus.org/spine/xsd/v1}TierBoundaryIdType" minOccurs="0"/&gt;
     *         &lt;element name="lowerBoundaryValue" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberType" minOccurs="0"/&gt;
     *         &lt;element name="upperBoundaryValue" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberType" minOccurs="0"/&gt;
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
        extends TierBoundaryDataType
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
        public Boundary(final Long boundaryId, final TimePeriodType timePeriod, final Long timeTableId, final ScaledNumberType lowerBoundaryValue, final ScaledNumberType upperBoundaryValue) {
            super(boundaryId, timePeriod, timeTableId, lowerBoundaryValue, upperBoundaryValue);
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
        public IncentiveTableTierType.Boundary withBoundaryId(Long value) {
            setBoundaryId(value);
            return this;
        }

        /**
         * Sets the value of the timePeriod property.
         * 
         * @param value
         *     allowed object is
         *     {@link TimePeriodType }
         * @return
         *     The class instance
         */
        @Override
        public IncentiveTableTierType.Boundary withTimePeriod(TimePeriodType value) {
            setTimePeriod(value);
            return this;
        }

        /**
         * Sets the value of the timeTableId property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         * @return
         *     The class instance
         */
        @Override
        public IncentiveTableTierType.Boundary withTimeTableId(Long value) {
            setTimeTableId(value);
            return this;
        }

        /**
         * Sets the value of the lowerBoundaryValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link ScaledNumberType }
         * @return
         *     The class instance
         */
        @Override
        public IncentiveTableTierType.Boundary withLowerBoundaryValue(ScaledNumberType value) {
            setLowerBoundaryValue(value);
            return this;
        }

        /**
         * Sets the value of the upperBoundaryValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link ScaledNumberType }
         * @return
         *     The class instance
         */
        @Override
        public IncentiveTableTierType.Boundary withUpperBoundaryValue(ScaledNumberType value) {
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
            return new IncentiveTableTierType.Boundary();
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
     *     &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}IncentiveDataType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="incentiveId" type="{http://docs.eebus.org/spine/xsd/v1}IncentiveIdType" minOccurs="0"/&gt;
     *         &lt;element name="value" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberType" minOccurs="0"/&gt;
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
        extends IncentiveDataType
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
        public Incentive(final Long incentiveId, final String valueType, final String timestamp, final TimePeriodType timePeriod, final Long timeTableId, final ScaledNumberType value) {
            super(incentiveId, valueType, timestamp, timePeriod, timeTableId, value);
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
        public IncentiveTableTierType.Incentive withIncentiveId(Long value) {
            setIncentiveId(value);
            return this;
        }

        /**
         * Sets the value of the valueType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         * @return
         *     The class instance
         */
        @Override
        public IncentiveTableTierType.Incentive withValueType(String value) {
            setValueType(value);
            return this;
        }

        /**
         * Sets the value of the timestamp property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         * @return
         *     The class instance
         */
        @Override
        public IncentiveTableTierType.Incentive withTimestamp(String value) {
            setTimestamp(value);
            return this;
        }

        /**
         * Sets the value of the timePeriod property.
         * 
         * @param value
         *     allowed object is
         *     {@link TimePeriodType }
         * @return
         *     The class instance
         */
        @Override
        public IncentiveTableTierType.Incentive withTimePeriod(TimePeriodType value) {
            setTimePeriod(value);
            return this;
        }

        /**
         * Sets the value of the timeTableId property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         * @return
         *     The class instance
         */
        @Override
        public IncentiveTableTierType.Incentive withTimeTableId(Long value) {
            setTimeTableId(value);
            return this;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link ScaledNumberType }
         * @return
         *     The class instance
         */
        @Override
        public IncentiveTableTierType.Incentive withValue(ScaledNumberType value) {
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
            return new IncentiveTableTierType.Incentive();
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
     *     &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}TierDataType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="tierId" type="{http://docs.eebus.org/spine/xsd/v1}TierIdType" minOccurs="0"/&gt;
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
        extends TierDataType
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
        public Tier(final Long tierId, final TimePeriodType timePeriod, final Long timeTableId, final List<Long> activeIncentiveId) {
            super(tierId, timePeriod, timeTableId, activeIncentiveId);
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
        public IncentiveTableTierType.Tier withTierId(Long value) {
            setTierId(value);
            return this;
        }

        /**
         * Sets the value of the timePeriod property.
         * 
         * @param value
         *     allowed object is
         *     {@link TimePeriodType }
         * @return
         *     The class instance
         */
        @Override
        public IncentiveTableTierType.Tier withTimePeriod(TimePeriodType value) {
            setTimePeriod(value);
            return this;
        }

        /**
         * Sets the value of the timeTableId property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         * @return
         *     The class instance
         */
        @Override
        public IncentiveTableTierType.Tier withTimeTableId(Long value) {
            setTimeTableId(value);
            return this;
        }

        /**
         * Adds objects to the list of ActiveIncentiveId using add method
         * 
         * @param values
         *     objects to add to the list ActiveIncentiveId
         * @return
         *     The class instance
         */
        @Override
        public IncentiveTableTierType.Tier withActiveIncentiveId(Long... values) {
            if (values!= null) {
                for (Long value: values) {
                    getActiveIncentiveId().add(value);
                }
            }
            return this;
        }

        /**
         * Adds objects to the list of ActiveIncentiveId using addAll method
         * 
         * @param values
         *     objects to add to the list ActiveIncentiveId
         * @return
         *     The class instance
         */
        @Override
        public IncentiveTableTierType.Tier withActiveIncentiveId(Collection<Long> values) {
            if (values!= null) {
                getActiveIncentiveId().addAll(values);
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
            return new IncentiveTableTierType.Tier();
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
