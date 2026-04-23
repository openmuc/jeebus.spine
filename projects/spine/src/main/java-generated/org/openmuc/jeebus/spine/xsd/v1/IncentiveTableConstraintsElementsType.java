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
 * <p>Java class for IncentiveTableConstraintsElementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IncentiveTableConstraintsElementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tariff" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}TariffDataElementsType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="tariffId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="tariffConstraints" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}TariffOverallConstraintsDataElementsType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="maxTiersPerTariff" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *                   &lt;element name="maxBoundariesPerTier" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *                   &lt;element name="maxIncentivesPerTier" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="incentiveSlotConstraints" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}TimeTableConstraintsDataElementsType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="slotCountMax" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
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
@XmlType(name = "IncentiveTableConstraintsElementsType", propOrder = {
    "tariff",
    "tariffConstraints",
    "incentiveSlotConstraints"
})
public class IncentiveTableConstraintsElementsType implements Cloneable, CopyTo, ToString
{

    protected IncentiveTableConstraintsElementsType.Tariff tariff;
    protected IncentiveTableConstraintsElementsType.TariffConstraints tariffConstraints;
    protected IncentiveTableConstraintsElementsType.IncentiveSlotConstraints incentiveSlotConstraints;

    /**
     * Default no-arg constructor
     * 
     */
    public IncentiveTableConstraintsElementsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public IncentiveTableConstraintsElementsType(final IncentiveTableConstraintsElementsType.Tariff tariff, final IncentiveTableConstraintsElementsType.TariffConstraints tariffConstraints, final IncentiveTableConstraintsElementsType.IncentiveSlotConstraints incentiveSlotConstraints) {
        this.tariff = tariff;
        this.tariffConstraints = tariffConstraints;
        this.incentiveSlotConstraints = incentiveSlotConstraints;
    }

    /**
     * Gets the value of the tariff property.
     * 
     * @return
     *     possible object is
     *     {@link IncentiveTableConstraintsElementsType.Tariff }
     *     
     */
    public IncentiveTableConstraintsElementsType.Tariff getTariff() {
        return tariff;
    }

    /**
     * Sets the value of the tariff property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncentiveTableConstraintsElementsType.Tariff }
     *     
     */
    public void setTariff(IncentiveTableConstraintsElementsType.Tariff value) {
        this.tariff = value;
    }

    /**
     * Gets the value of the tariffConstraints property.
     * 
     * @return
     *     possible object is
     *     {@link IncentiveTableConstraintsElementsType.TariffConstraints }
     *     
     */
    public IncentiveTableConstraintsElementsType.TariffConstraints getTariffConstraints() {
        return tariffConstraints;
    }

    /**
     * Sets the value of the tariffConstraints property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncentiveTableConstraintsElementsType.TariffConstraints }
     *     
     */
    public void setTariffConstraints(IncentiveTableConstraintsElementsType.TariffConstraints value) {
        this.tariffConstraints = value;
    }

    /**
     * Gets the value of the incentiveSlotConstraints property.
     * 
     * @return
     *     possible object is
     *     {@link IncentiveTableConstraintsElementsType.IncentiveSlotConstraints }
     *     
     */
    public IncentiveTableConstraintsElementsType.IncentiveSlotConstraints getIncentiveSlotConstraints() {
        return incentiveSlotConstraints;
    }

    /**
     * Sets the value of the incentiveSlotConstraints property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncentiveTableConstraintsElementsType.IncentiveSlotConstraints }
     *     
     */
    public void setIncentiveSlotConstraints(IncentiveTableConstraintsElementsType.IncentiveSlotConstraints value) {
        this.incentiveSlotConstraints = value;
    }

    /**
     * Sets the value of the tariff property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncentiveTableConstraintsElementsType.Tariff }
     * @return
     *     The class instance
     */
    public IncentiveTableConstraintsElementsType withTariff(IncentiveTableConstraintsElementsType.Tariff value) {
        setTariff(value);
        return this;
    }

    /**
     * Sets the value of the tariffConstraints property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncentiveTableConstraintsElementsType.TariffConstraints }
     * @return
     *     The class instance
     */
    public IncentiveTableConstraintsElementsType withTariffConstraints(IncentiveTableConstraintsElementsType.TariffConstraints value) {
        setTariffConstraints(value);
        return this;
    }

    /**
     * Sets the value of the incentiveSlotConstraints property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncentiveTableConstraintsElementsType.IncentiveSlotConstraints }
     * @return
     *     The class instance
     */
    public IncentiveTableConstraintsElementsType withIncentiveSlotConstraints(IncentiveTableConstraintsElementsType.IncentiveSlotConstraints value) {
        setIncentiveSlotConstraints(value);
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
        if (draftCopy instanceof IncentiveTableConstraintsElementsType) {
            final IncentiveTableConstraintsElementsType copy = ((IncentiveTableConstraintsElementsType) draftCopy);
            {
                Boolean tariffShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.tariff!= null));
                if (tariffShouldBeCopiedAndSet == Boolean.TRUE) {
                    IncentiveTableConstraintsElementsType.Tariff sourceTariff;
                    sourceTariff = this.getTariff();
                    IncentiveTableConstraintsElementsType.Tariff copyTariff = ((IncentiveTableConstraintsElementsType.Tariff) strategy.copy(LocatorUtils.property(locator, "tariff", sourceTariff), sourceTariff, (this.tariff!= null)));
                    copy.setTariff(copyTariff);
                } else {
                    if (tariffShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.tariff = null;
                    }
                }
            }
            {
                Boolean tariffConstraintsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.tariffConstraints!= null));
                if (tariffConstraintsShouldBeCopiedAndSet == Boolean.TRUE) {
                    IncentiveTableConstraintsElementsType.TariffConstraints sourceTariffConstraints;
                    sourceTariffConstraints = this.getTariffConstraints();
                    IncentiveTableConstraintsElementsType.TariffConstraints copyTariffConstraints = ((IncentiveTableConstraintsElementsType.TariffConstraints) strategy.copy(LocatorUtils.property(locator, "tariffConstraints", sourceTariffConstraints), sourceTariffConstraints, (this.tariffConstraints!= null)));
                    copy.setTariffConstraints(copyTariffConstraints);
                } else {
                    if (tariffConstraintsShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.tariffConstraints = null;
                    }
                }
            }
            {
                Boolean incentiveSlotConstraintsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.incentiveSlotConstraints!= null));
                if (incentiveSlotConstraintsShouldBeCopiedAndSet == Boolean.TRUE) {
                    IncentiveTableConstraintsElementsType.IncentiveSlotConstraints sourceIncentiveSlotConstraints;
                    sourceIncentiveSlotConstraints = this.getIncentiveSlotConstraints();
                    IncentiveTableConstraintsElementsType.IncentiveSlotConstraints copyIncentiveSlotConstraints = ((IncentiveTableConstraintsElementsType.IncentiveSlotConstraints) strategy.copy(LocatorUtils.property(locator, "incentiveSlotConstraints", sourceIncentiveSlotConstraints), sourceIncentiveSlotConstraints, (this.incentiveSlotConstraints!= null)));
                    copy.setIncentiveSlotConstraints(copyIncentiveSlotConstraints);
                } else {
                    if (incentiveSlotConstraintsShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.incentiveSlotConstraints = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new IncentiveTableConstraintsElementsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final IncentiveTableConstraintsElementsType that = ((IncentiveTableConstraintsElementsType) object);
        {
            IncentiveTableConstraintsElementsType.Tariff leftTariff;
            leftTariff = this.getTariff();
            IncentiveTableConstraintsElementsType.Tariff rightTariff;
            rightTariff = that.getTariff();
            if (this.tariff!= null) {
                if (that.tariff!= null) {
                    if (!leftTariff.equals(rightTariff)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.tariff!= null) {
                    return false;
                }
            }
        }
        {
            IncentiveTableConstraintsElementsType.TariffConstraints leftTariffConstraints;
            leftTariffConstraints = this.getTariffConstraints();
            IncentiveTableConstraintsElementsType.TariffConstraints rightTariffConstraints;
            rightTariffConstraints = that.getTariffConstraints();
            if (this.tariffConstraints!= null) {
                if (that.tariffConstraints!= null) {
                    if (!leftTariffConstraints.equals(rightTariffConstraints)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.tariffConstraints!= null) {
                    return false;
                }
            }
        }
        {
            IncentiveTableConstraintsElementsType.IncentiveSlotConstraints leftIncentiveSlotConstraints;
            leftIncentiveSlotConstraints = this.getIncentiveSlotConstraints();
            IncentiveTableConstraintsElementsType.IncentiveSlotConstraints rightIncentiveSlotConstraints;
            rightIncentiveSlotConstraints = that.getIncentiveSlotConstraints();
            if (this.incentiveSlotConstraints!= null) {
                if (that.incentiveSlotConstraints!= null) {
                    if (!leftIncentiveSlotConstraints.equals(rightIncentiveSlotConstraints)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.incentiveSlotConstraints!= null) {
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
            IncentiveTableConstraintsElementsType.Tariff theTariff;
            theTariff = this.getTariff();
            if (this.tariff!= null) {
                currentHashCode += theTariff.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            IncentiveTableConstraintsElementsType.TariffConstraints theTariffConstraints;
            theTariffConstraints = this.getTariffConstraints();
            if (this.tariffConstraints!= null) {
                currentHashCode += theTariffConstraints.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            IncentiveTableConstraintsElementsType.IncentiveSlotConstraints theIncentiveSlotConstraints;
            theIncentiveSlotConstraints = this.getIncentiveSlotConstraints();
            if (this.incentiveSlotConstraints!= null) {
                currentHashCode += theIncentiveSlotConstraints.hashCode();
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
            IncentiveTableConstraintsElementsType.Tariff theTariff;
            theTariff = this.getTariff();
            strategy.appendField(locator, this, "tariff", buffer, theTariff, (this.tariff!= null));
        }
        {
            IncentiveTableConstraintsElementsType.TariffConstraints theTariffConstraints;
            theTariffConstraints = this.getTariffConstraints();
            strategy.appendField(locator, this, "tariffConstraints", buffer, theTariffConstraints, (this.tariffConstraints!= null));
        }
        {
            IncentiveTableConstraintsElementsType.IncentiveSlotConstraints theIncentiveSlotConstraints;
            theIncentiveSlotConstraints = this.getIncentiveSlotConstraints();
            strategy.appendField(locator, this, "incentiveSlotConstraints", buffer, theIncentiveSlotConstraints, (this.incentiveSlotConstraints!= null));
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
     *     &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}TimeTableConstraintsDataElementsType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="slotCountMax" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
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
    public static class IncentiveSlotConstraints
        extends TimeTableConstraintsDataElementsType
        implements Cloneable, CopyTo, ToString
    {


        /**
         * Default no-arg constructor
         * 
         */
        public IncentiveSlotConstraints() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public IncentiveSlotConstraints(final ElementTagType timeTableId, final ElementTagType slotCountMin, final ElementTagType slotCountMax, final ElementTagType slotDurationMin, final ElementTagType slotDurationMax, final ElementTagType slotDurationStepSize, final ElementTagType slotShiftStepSize, final ElementTagType firstSlotBeginsAt) {
            super(timeTableId, slotCountMin, slotCountMax, slotDurationMin, slotDurationMax, slotDurationStepSize, slotShiftStepSize, firstSlotBeginsAt);
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
        public IncentiveTableConstraintsElementsType.IncentiveSlotConstraints withTimeTableId(ElementTagType value) {
            setTimeTableId(value);
            return this;
        }

        /**
         * Sets the value of the slotCountMin property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElementTagType }
         * @return
         *     The class instance
         */
        @Override
        public IncentiveTableConstraintsElementsType.IncentiveSlotConstraints withSlotCountMin(ElementTagType value) {
            setSlotCountMin(value);
            return this;
        }

        /**
         * Sets the value of the slotCountMax property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElementTagType }
         * @return
         *     The class instance
         */
        @Override
        public IncentiveTableConstraintsElementsType.IncentiveSlotConstraints withSlotCountMax(ElementTagType value) {
            setSlotCountMax(value);
            return this;
        }

        /**
         * Sets the value of the slotDurationMin property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElementTagType }
         * @return
         *     The class instance
         */
        @Override
        public IncentiveTableConstraintsElementsType.IncentiveSlotConstraints withSlotDurationMin(ElementTagType value) {
            setSlotDurationMin(value);
            return this;
        }

        /**
         * Sets the value of the slotDurationMax property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElementTagType }
         * @return
         *     The class instance
         */
        @Override
        public IncentiveTableConstraintsElementsType.IncentiveSlotConstraints withSlotDurationMax(ElementTagType value) {
            setSlotDurationMax(value);
            return this;
        }

        /**
         * Sets the value of the slotDurationStepSize property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElementTagType }
         * @return
         *     The class instance
         */
        @Override
        public IncentiveTableConstraintsElementsType.IncentiveSlotConstraints withSlotDurationStepSize(ElementTagType value) {
            setSlotDurationStepSize(value);
            return this;
        }

        /**
         * Sets the value of the slotShiftStepSize property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElementTagType }
         * @return
         *     The class instance
         */
        @Override
        public IncentiveTableConstraintsElementsType.IncentiveSlotConstraints withSlotShiftStepSize(ElementTagType value) {
            setSlotShiftStepSize(value);
            return this;
        }

        /**
         * Sets the value of the firstSlotBeginsAt property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElementTagType }
         * @return
         *     The class instance
         */
        @Override
        public IncentiveTableConstraintsElementsType.IncentiveSlotConstraints withFirstSlotBeginsAt(ElementTagType value) {
            setFirstSlotBeginsAt(value);
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
            return new IncentiveTableConstraintsElementsType.IncentiveSlotConstraints();
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
     *     &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}TariffDataElementsType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="tariffId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
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
    public static class Tariff
        extends TariffDataElementsType
        implements Cloneable, CopyTo, ToString
    {


        /**
         * Default no-arg constructor
         * 
         */
        public Tariff() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public Tariff(final ElementTagType tariffId, final ElementTagType activeTierId) {
            super(tariffId, activeTierId);
        }

        /**
         * Sets the value of the tariffId property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElementTagType }
         * @return
         *     The class instance
         */
        @Override
        public IncentiveTableConstraintsElementsType.Tariff withTariffId(ElementTagType value) {
            setTariffId(value);
            return this;
        }

        /**
         * Sets the value of the activeTierId property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElementTagType }
         * @return
         *     The class instance
         */
        @Override
        public IncentiveTableConstraintsElementsType.Tariff withActiveTierId(ElementTagType value) {
            setActiveTierId(value);
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
            return new IncentiveTableConstraintsElementsType.Tariff();
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
     *     &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}TariffOverallConstraintsDataElementsType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="maxTiersPerTariff" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
     *         &lt;element name="maxBoundariesPerTier" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
     *         &lt;element name="maxIncentivesPerTier" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
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
    public static class TariffConstraints
        extends TariffOverallConstraintsDataElementsType
        implements Cloneable, CopyTo, ToString
    {


        /**
         * Default no-arg constructor
         * 
         */
        public TariffConstraints() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public TariffConstraints(final ElementTagType maxTariffCount, final ElementTagType maxBoundaryCount, final ElementTagType maxTierCount, final ElementTagType maxIncentiveCount, final ElementTagType maxBoundariesPerTariff, final ElementTagType maxTiersPerTariff, final ElementTagType maxBoundariesPerTier, final ElementTagType maxIncentivesPerTier) {
            super(maxTariffCount, maxBoundaryCount, maxTierCount, maxIncentiveCount, maxBoundariesPerTariff, maxTiersPerTariff, maxBoundariesPerTier, maxIncentivesPerTier);
        }

        /**
         * Sets the value of the maxTariffCount property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElementTagType }
         * @return
         *     The class instance
         */
        @Override
        public IncentiveTableConstraintsElementsType.TariffConstraints withMaxTariffCount(ElementTagType value) {
            setMaxTariffCount(value);
            return this;
        }

        /**
         * Sets the value of the maxBoundaryCount property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElementTagType }
         * @return
         *     The class instance
         */
        @Override
        public IncentiveTableConstraintsElementsType.TariffConstraints withMaxBoundaryCount(ElementTagType value) {
            setMaxBoundaryCount(value);
            return this;
        }

        /**
         * Sets the value of the maxTierCount property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElementTagType }
         * @return
         *     The class instance
         */
        @Override
        public IncentiveTableConstraintsElementsType.TariffConstraints withMaxTierCount(ElementTagType value) {
            setMaxTierCount(value);
            return this;
        }

        /**
         * Sets the value of the maxIncentiveCount property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElementTagType }
         * @return
         *     The class instance
         */
        @Override
        public IncentiveTableConstraintsElementsType.TariffConstraints withMaxIncentiveCount(ElementTagType value) {
            setMaxIncentiveCount(value);
            return this;
        }

        /**
         * Sets the value of the maxBoundariesPerTariff property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElementTagType }
         * @return
         *     The class instance
         */
        @Override
        public IncentiveTableConstraintsElementsType.TariffConstraints withMaxBoundariesPerTariff(ElementTagType value) {
            setMaxBoundariesPerTariff(value);
            return this;
        }

        /**
         * Sets the value of the maxTiersPerTariff property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElementTagType }
         * @return
         *     The class instance
         */
        @Override
        public IncentiveTableConstraintsElementsType.TariffConstraints withMaxTiersPerTariff(ElementTagType value) {
            setMaxTiersPerTariff(value);
            return this;
        }

        /**
         * Sets the value of the maxBoundariesPerTier property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElementTagType }
         * @return
         *     The class instance
         */
        @Override
        public IncentiveTableConstraintsElementsType.TariffConstraints withMaxBoundariesPerTier(ElementTagType value) {
            setMaxBoundariesPerTier(value);
            return this;
        }

        /**
         * Sets the value of the maxIncentivesPerTier property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElementTagType }
         * @return
         *     The class instance
         */
        @Override
        public IncentiveTableConstraintsElementsType.TariffConstraints withMaxIncentivesPerTier(ElementTagType value) {
            setMaxIncentivesPerTier(value);
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
            return new IncentiveTableConstraintsElementsType.TariffConstraints();
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
