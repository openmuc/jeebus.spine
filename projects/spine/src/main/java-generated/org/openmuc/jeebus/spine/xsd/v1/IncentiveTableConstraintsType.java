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

import java.util.Collection;
import java.util.List;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
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
 * <p>Java class for IncentiveTableConstraintsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IncentiveTableConstraintsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tariff" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}TariffDataType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="tariffId" type="{http://docs.eebus.org/spine/xsd/v1}TariffIdType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="tariffConstraints" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}TariffOverallConstraintsDataType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="maxTiersPerTariff" type="{http://docs.eebus.org/spine/xsd/v1}TierCountType" minOccurs="0"/&gt;
 *                   &lt;element name="maxBoundariesPerTier" type="{http://docs.eebus.org/spine/xsd/v1}TierBoundaryCountType" minOccurs="0"/&gt;
 *                   &lt;element name="maxIncentivesPerTier" type="{http://docs.eebus.org/spine/xsd/v1}IncentiveCountType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="incentiveSlotConstraints" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}TimeTableConstraintsDataType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="slotCountMax" type="{http://docs.eebus.org/spine/xsd/v1}TimeSlotCountType" minOccurs="0"/&gt;
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
@XmlType(name = "IncentiveTableConstraintsType", propOrder = {
    "tariff",
    "tariffConstraints",
    "incentiveSlotConstraints"
})
public class IncentiveTableConstraintsType implements Cloneable, CopyTo, ToString
{

    protected IncentiveTableConstraintsType.Tariff tariff;
    protected IncentiveTableConstraintsType.TariffConstraints tariffConstraints;
    protected IncentiveTableConstraintsType.IncentiveSlotConstraints incentiveSlotConstraints;

    /**
     * Default no-arg constructor
     * 
     */
    public IncentiveTableConstraintsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public IncentiveTableConstraintsType(final IncentiveTableConstraintsType.Tariff tariff, final IncentiveTableConstraintsType.TariffConstraints tariffConstraints, final IncentiveTableConstraintsType.IncentiveSlotConstraints incentiveSlotConstraints) {
        this.tariff = tariff;
        this.tariffConstraints = tariffConstraints;
        this.incentiveSlotConstraints = incentiveSlotConstraints;
    }

    /**
     * Gets the value of the tariff property.
     * 
     * @return
     *     possible object is
     *     {@link IncentiveTableConstraintsType.Tariff }
     *     
     */
    public IncentiveTableConstraintsType.Tariff getTariff() {
        return tariff;
    }

    /**
     * Sets the value of the tariff property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncentiveTableConstraintsType.Tariff }
     *     
     */
    public void setTariff(IncentiveTableConstraintsType.Tariff value) {
        this.tariff = value;
    }

    /**
     * Gets the value of the tariffConstraints property.
     * 
     * @return
     *     possible object is
     *     {@link IncentiveTableConstraintsType.TariffConstraints }
     *     
     */
    public IncentiveTableConstraintsType.TariffConstraints getTariffConstraints() {
        return tariffConstraints;
    }

    /**
     * Sets the value of the tariffConstraints property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncentiveTableConstraintsType.TariffConstraints }
     *     
     */
    public void setTariffConstraints(IncentiveTableConstraintsType.TariffConstraints value) {
        this.tariffConstraints = value;
    }

    /**
     * Gets the value of the incentiveSlotConstraints property.
     * 
     * @return
     *     possible object is
     *     {@link IncentiveTableConstraintsType.IncentiveSlotConstraints }
     *     
     */
    public IncentiveTableConstraintsType.IncentiveSlotConstraints getIncentiveSlotConstraints() {
        return incentiveSlotConstraints;
    }

    /**
     * Sets the value of the incentiveSlotConstraints property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncentiveTableConstraintsType.IncentiveSlotConstraints }
     *     
     */
    public void setIncentiveSlotConstraints(IncentiveTableConstraintsType.IncentiveSlotConstraints value) {
        this.incentiveSlotConstraints = value;
    }

    /**
     * Sets the value of the tariff property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncentiveTableConstraintsType.Tariff }
     * @return
     *     The class instance
     */
    public IncentiveTableConstraintsType withTariff(IncentiveTableConstraintsType.Tariff value) {
        setTariff(value);
        return this;
    }

    /**
     * Sets the value of the tariffConstraints property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncentiveTableConstraintsType.TariffConstraints }
     * @return
     *     The class instance
     */
    public IncentiveTableConstraintsType withTariffConstraints(IncentiveTableConstraintsType.TariffConstraints value) {
        setTariffConstraints(value);
        return this;
    }

    /**
     * Sets the value of the incentiveSlotConstraints property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncentiveTableConstraintsType.IncentiveSlotConstraints }
     * @return
     *     The class instance
     */
    public IncentiveTableConstraintsType withIncentiveSlotConstraints(IncentiveTableConstraintsType.IncentiveSlotConstraints value) {
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
        if (draftCopy instanceof IncentiveTableConstraintsType) {
            final IncentiveTableConstraintsType copy = ((IncentiveTableConstraintsType) draftCopy);
            {
                Boolean tariffShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.tariff!= null));
                if (tariffShouldBeCopiedAndSet == Boolean.TRUE) {
                    IncentiveTableConstraintsType.Tariff sourceTariff;
                    sourceTariff = this.getTariff();
                    IncentiveTableConstraintsType.Tariff copyTariff = ((IncentiveTableConstraintsType.Tariff) strategy.copy(LocatorUtils.property(locator, "tariff", sourceTariff), sourceTariff, (this.tariff!= null)));
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
                    IncentiveTableConstraintsType.TariffConstraints sourceTariffConstraints;
                    sourceTariffConstraints = this.getTariffConstraints();
                    IncentiveTableConstraintsType.TariffConstraints copyTariffConstraints = ((IncentiveTableConstraintsType.TariffConstraints) strategy.copy(LocatorUtils.property(locator, "tariffConstraints", sourceTariffConstraints), sourceTariffConstraints, (this.tariffConstraints!= null)));
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
                    IncentiveTableConstraintsType.IncentiveSlotConstraints sourceIncentiveSlotConstraints;
                    sourceIncentiveSlotConstraints = this.getIncentiveSlotConstraints();
                    IncentiveTableConstraintsType.IncentiveSlotConstraints copyIncentiveSlotConstraints = ((IncentiveTableConstraintsType.IncentiveSlotConstraints) strategy.copy(LocatorUtils.property(locator, "incentiveSlotConstraints", sourceIncentiveSlotConstraints), sourceIncentiveSlotConstraints, (this.incentiveSlotConstraints!= null)));
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
        return new IncentiveTableConstraintsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final IncentiveTableConstraintsType that = ((IncentiveTableConstraintsType) object);
        {
            IncentiveTableConstraintsType.Tariff leftTariff;
            leftTariff = this.getTariff();
            IncentiveTableConstraintsType.Tariff rightTariff;
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
            IncentiveTableConstraintsType.TariffConstraints leftTariffConstraints;
            leftTariffConstraints = this.getTariffConstraints();
            IncentiveTableConstraintsType.TariffConstraints rightTariffConstraints;
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
            IncentiveTableConstraintsType.IncentiveSlotConstraints leftIncentiveSlotConstraints;
            leftIncentiveSlotConstraints = this.getIncentiveSlotConstraints();
            IncentiveTableConstraintsType.IncentiveSlotConstraints rightIncentiveSlotConstraints;
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
            IncentiveTableConstraintsType.Tariff theTariff;
            theTariff = this.getTariff();
            if (this.tariff!= null) {
                currentHashCode += theTariff.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            IncentiveTableConstraintsType.TariffConstraints theTariffConstraints;
            theTariffConstraints = this.getTariffConstraints();
            if (this.tariffConstraints!= null) {
                currentHashCode += theTariffConstraints.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            IncentiveTableConstraintsType.IncentiveSlotConstraints theIncentiveSlotConstraints;
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
            IncentiveTableConstraintsType.Tariff theTariff;
            theTariff = this.getTariff();
            strategy.appendField(locator, this, "tariff", buffer, theTariff, (this.tariff!= null));
        }
        {
            IncentiveTableConstraintsType.TariffConstraints theTariffConstraints;
            theTariffConstraints = this.getTariffConstraints();
            strategy.appendField(locator, this, "tariffConstraints", buffer, theTariffConstraints, (this.tariffConstraints!= null));
        }
        {
            IncentiveTableConstraintsType.IncentiveSlotConstraints theIncentiveSlotConstraints;
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
     *     &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}TimeTableConstraintsDataType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="slotCountMax" type="{http://docs.eebus.org/spine/xsd/v1}TimeSlotCountType" minOccurs="0"/&gt;
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
        extends TimeTableConstraintsDataType
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
        public IncentiveSlotConstraints(final Long timeTableId, final Long slotCountMin, final Long slotCountMax, final Duration slotDurationMin, final Duration slotDurationMax, final Duration slotDurationStepSize, final Duration slotShiftStepSize, final XMLGregorianCalendar firstSlotBeginsAt) {
            super(timeTableId, slotCountMin, slotCountMax, slotDurationMin, slotDurationMax, slotDurationStepSize, slotShiftStepSize, firstSlotBeginsAt);
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
        public IncentiveTableConstraintsType.IncentiveSlotConstraints withTimeTableId(Long value) {
            setTimeTableId(value);
            return this;
        }

        /**
         * Sets the value of the slotCountMin property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         * @return
         *     The class instance
         */
        @Override
        public IncentiveTableConstraintsType.IncentiveSlotConstraints withSlotCountMin(Long value) {
            setSlotCountMin(value);
            return this;
        }

        /**
         * Sets the value of the slotCountMax property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         * @return
         *     The class instance
         */
        @Override
        public IncentiveTableConstraintsType.IncentiveSlotConstraints withSlotCountMax(Long value) {
            setSlotCountMax(value);
            return this;
        }

        /**
         * Sets the value of the slotDurationMin property.
         * 
         * @param value
         *     allowed object is
         *     {@link Duration }
         * @return
         *     The class instance
         */
        @Override
        public IncentiveTableConstraintsType.IncentiveSlotConstraints withSlotDurationMin(Duration value) {
            setSlotDurationMin(value);
            return this;
        }

        /**
         * Sets the value of the slotDurationMax property.
         * 
         * @param value
         *     allowed object is
         *     {@link Duration }
         * @return
         *     The class instance
         */
        @Override
        public IncentiveTableConstraintsType.IncentiveSlotConstraints withSlotDurationMax(Duration value) {
            setSlotDurationMax(value);
            return this;
        }

        /**
         * Sets the value of the slotDurationStepSize property.
         * 
         * @param value
         *     allowed object is
         *     {@link Duration }
         * @return
         *     The class instance
         */
        @Override
        public IncentiveTableConstraintsType.IncentiveSlotConstraints withSlotDurationStepSize(Duration value) {
            setSlotDurationStepSize(value);
            return this;
        }

        /**
         * Sets the value of the slotShiftStepSize property.
         * 
         * @param value
         *     allowed object is
         *     {@link Duration }
         * @return
         *     The class instance
         */
        @Override
        public IncentiveTableConstraintsType.IncentiveSlotConstraints withSlotShiftStepSize(Duration value) {
            setSlotShiftStepSize(value);
            return this;
        }

        /**
         * Sets the value of the firstSlotBeginsAt property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         * @return
         *     The class instance
         */
        @Override
        public IncentiveTableConstraintsType.IncentiveSlotConstraints withFirstSlotBeginsAt(XMLGregorianCalendar value) {
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
            return new IncentiveTableConstraintsType.IncentiveSlotConstraints();
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
     *     &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}TariffDataType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="tariffId" type="{http://docs.eebus.org/spine/xsd/v1}TariffIdType" minOccurs="0"/&gt;
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
        extends TariffDataType
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
        public Tariff(final Long tariffId, final List<Long> activeTierId) {
            super(tariffId, activeTierId);
        }

        /**
         * Sets the value of the tariffId property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         * @return
         *     The class instance
         */
        @Override
        public IncentiveTableConstraintsType.Tariff withTariffId(Long value) {
            setTariffId(value);
            return this;
        }

        /**
         * Adds objects to the list of ActiveTierId using add method
         * 
         * @param values
         *     objects to add to the list ActiveTierId
         * @return
         *     The class instance
         */
        @Override
        public IncentiveTableConstraintsType.Tariff withActiveTierId(Long... values) {
            if (values!= null) {
                for (Long value: values) {
                    getActiveTierId().add(value);
                }
            }
            return this;
        }

        /**
         * Adds objects to the list of ActiveTierId using addAll method
         * 
         * @param values
         *     objects to add to the list ActiveTierId
         * @return
         *     The class instance
         */
        @Override
        public IncentiveTableConstraintsType.Tariff withActiveTierId(Collection<Long> values) {
            if (values!= null) {
                getActiveTierId().addAll(values);
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
            return new IncentiveTableConstraintsType.Tariff();
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
     *     &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}TariffOverallConstraintsDataType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="maxTiersPerTariff" type="{http://docs.eebus.org/spine/xsd/v1}TierCountType" minOccurs="0"/&gt;
     *         &lt;element name="maxBoundariesPerTier" type="{http://docs.eebus.org/spine/xsd/v1}TierBoundaryCountType" minOccurs="0"/&gt;
     *         &lt;element name="maxIncentivesPerTier" type="{http://docs.eebus.org/spine/xsd/v1}IncentiveCountType" minOccurs="0"/&gt;
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
        extends TariffOverallConstraintsDataType
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
        public TariffConstraints(final Long maxTariffCount, final Long maxBoundaryCount, final Long maxTierCount, final Long maxIncentiveCount, final Long maxBoundariesPerTariff, final Long maxTiersPerTariff, final Long maxBoundariesPerTier, final Long maxIncentivesPerTier) {
            super(maxTariffCount, maxBoundaryCount, maxTierCount, maxIncentiveCount, maxBoundariesPerTariff, maxTiersPerTariff, maxBoundariesPerTier, maxIncentivesPerTier);
        }

        /**
         * Sets the value of the maxTariffCount property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         * @return
         *     The class instance
         */
        @Override
        public IncentiveTableConstraintsType.TariffConstraints withMaxTariffCount(Long value) {
            setMaxTariffCount(value);
            return this;
        }

        /**
         * Sets the value of the maxBoundaryCount property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         * @return
         *     The class instance
         */
        @Override
        public IncentiveTableConstraintsType.TariffConstraints withMaxBoundaryCount(Long value) {
            setMaxBoundaryCount(value);
            return this;
        }

        /**
         * Sets the value of the maxTierCount property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         * @return
         *     The class instance
         */
        @Override
        public IncentiveTableConstraintsType.TariffConstraints withMaxTierCount(Long value) {
            setMaxTierCount(value);
            return this;
        }

        /**
         * Sets the value of the maxIncentiveCount property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         * @return
         *     The class instance
         */
        @Override
        public IncentiveTableConstraintsType.TariffConstraints withMaxIncentiveCount(Long value) {
            setMaxIncentiveCount(value);
            return this;
        }

        /**
         * Sets the value of the maxBoundariesPerTariff property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         * @return
         *     The class instance
         */
        @Override
        public IncentiveTableConstraintsType.TariffConstraints withMaxBoundariesPerTariff(Long value) {
            setMaxBoundariesPerTariff(value);
            return this;
        }

        /**
         * Sets the value of the maxTiersPerTariff property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         * @return
         *     The class instance
         */
        @Override
        public IncentiveTableConstraintsType.TariffConstraints withMaxTiersPerTariff(Long value) {
            setMaxTiersPerTariff(value);
            return this;
        }

        /**
         * Sets the value of the maxBoundariesPerTier property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         * @return
         *     The class instance
         */
        @Override
        public IncentiveTableConstraintsType.TariffConstraints withMaxBoundariesPerTier(Long value) {
            setMaxBoundariesPerTier(value);
            return this;
        }

        /**
         * Sets the value of the maxIncentivesPerTier property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         * @return
         *     The class instance
         */
        @Override
        public IncentiveTableConstraintsType.TariffConstraints withMaxIncentivesPerTier(Long value) {
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
            return new IncentiveTableConstraintsType.TariffConstraints();
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
