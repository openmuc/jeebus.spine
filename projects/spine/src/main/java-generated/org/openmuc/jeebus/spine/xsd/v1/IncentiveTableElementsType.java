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
 * <p>Java class for IncentiveTableElementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IncentiveTableElementsType"&gt;
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
 *         &lt;element name="incentiveSlot" type="{http://docs.eebus.org/spine/xsd/v1}IncentiveTableIncentiveSlotElementsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IncentiveTableElementsType", propOrder = {
    "tariff",
    "incentiveSlot"
})
public class IncentiveTableElementsType implements Cloneable, CopyTo, ToString
{

    protected IncentiveTableElementsType.Tariff tariff;
    protected IncentiveTableIncentiveSlotElementsType incentiveSlot;

    /**
     * Default no-arg constructor
     * 
     */
    public IncentiveTableElementsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public IncentiveTableElementsType(final IncentiveTableElementsType.Tariff tariff, final IncentiveTableIncentiveSlotElementsType incentiveSlot) {
        this.tariff = tariff;
        this.incentiveSlot = incentiveSlot;
    }

    /**
     * Gets the value of the tariff property.
     * 
     * @return
     *     possible object is
     *     {@link IncentiveTableElementsType.Tariff }
     *     
     */
    public IncentiveTableElementsType.Tariff getTariff() {
        return tariff;
    }

    /**
     * Sets the value of the tariff property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncentiveTableElementsType.Tariff }
     *     
     */
    public void setTariff(IncentiveTableElementsType.Tariff value) {
        this.tariff = value;
    }

    /**
     * Gets the value of the incentiveSlot property.
     * 
     * @return
     *     possible object is
     *     {@link IncentiveTableIncentiveSlotElementsType }
     *     
     */
    public IncentiveTableIncentiveSlotElementsType getIncentiveSlot() {
        return incentiveSlot;
    }

    /**
     * Sets the value of the incentiveSlot property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncentiveTableIncentiveSlotElementsType }
     *     
     */
    public void setIncentiveSlot(IncentiveTableIncentiveSlotElementsType value) {
        this.incentiveSlot = value;
    }

    /**
     * Sets the value of the tariff property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncentiveTableElementsType.Tariff }
     * @return
     *     The class instance
     */
    public IncentiveTableElementsType withTariff(IncentiveTableElementsType.Tariff value) {
        setTariff(value);
        return this;
    }

    /**
     * Sets the value of the incentiveSlot property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncentiveTableIncentiveSlotElementsType }
     * @return
     *     The class instance
     */
    public IncentiveTableElementsType withIncentiveSlot(IncentiveTableIncentiveSlotElementsType value) {
        setIncentiveSlot(value);
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
        if (draftCopy instanceof IncentiveTableElementsType) {
            final IncentiveTableElementsType copy = ((IncentiveTableElementsType) draftCopy);
            {
                Boolean tariffShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.tariff!= null));
                if (tariffShouldBeCopiedAndSet == Boolean.TRUE) {
                    IncentiveTableElementsType.Tariff sourceTariff;
                    sourceTariff = this.getTariff();
                    IncentiveTableElementsType.Tariff copyTariff = ((IncentiveTableElementsType.Tariff) strategy.copy(LocatorUtils.property(locator, "tariff", sourceTariff), sourceTariff, (this.tariff!= null)));
                    copy.setTariff(copyTariff);
                } else {
                    if (tariffShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.tariff = null;
                    }
                }
            }
            {
                Boolean incentiveSlotShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.incentiveSlot!= null));
                if (incentiveSlotShouldBeCopiedAndSet == Boolean.TRUE) {
                    IncentiveTableIncentiveSlotElementsType sourceIncentiveSlot;
                    sourceIncentiveSlot = this.getIncentiveSlot();
                    IncentiveTableIncentiveSlotElementsType copyIncentiveSlot = ((IncentiveTableIncentiveSlotElementsType) strategy.copy(LocatorUtils.property(locator, "incentiveSlot", sourceIncentiveSlot), sourceIncentiveSlot, (this.incentiveSlot!= null)));
                    copy.setIncentiveSlot(copyIncentiveSlot);
                } else {
                    if (incentiveSlotShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.incentiveSlot = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new IncentiveTableElementsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final IncentiveTableElementsType that = ((IncentiveTableElementsType) object);
        {
            IncentiveTableElementsType.Tariff leftTariff;
            leftTariff = this.getTariff();
            IncentiveTableElementsType.Tariff rightTariff;
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
            IncentiveTableIncentiveSlotElementsType leftIncentiveSlot;
            leftIncentiveSlot = this.getIncentiveSlot();
            IncentiveTableIncentiveSlotElementsType rightIncentiveSlot;
            rightIncentiveSlot = that.getIncentiveSlot();
            if (this.incentiveSlot!= null) {
                if (that.incentiveSlot!= null) {
                    if (!leftIncentiveSlot.equals(rightIncentiveSlot)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.incentiveSlot!= null) {
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
            IncentiveTableElementsType.Tariff theTariff;
            theTariff = this.getTariff();
            if (this.tariff!= null) {
                currentHashCode += theTariff.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            IncentiveTableIncentiveSlotElementsType theIncentiveSlot;
            theIncentiveSlot = this.getIncentiveSlot();
            if (this.incentiveSlot!= null) {
                currentHashCode += theIncentiveSlot.hashCode();
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
            IncentiveTableElementsType.Tariff theTariff;
            theTariff = this.getTariff();
            strategy.appendField(locator, this, "tariff", buffer, theTariff, (this.tariff!= null));
        }
        {
            IncentiveTableIncentiveSlotElementsType theIncentiveSlot;
            theIncentiveSlot = this.getIncentiveSlot();
            strategy.appendField(locator, this, "incentiveSlot", buffer, theIncentiveSlot, (this.incentiveSlot!= null));
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
        public IncentiveTableElementsType.Tariff withTariffId(ElementTagType value) {
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
        public IncentiveTableElementsType.Tariff withActiveTierId(ElementTagType value) {
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
            return new IncentiveTableElementsType.Tariff();
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
