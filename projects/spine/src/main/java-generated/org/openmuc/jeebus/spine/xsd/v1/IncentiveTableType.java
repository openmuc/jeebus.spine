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
 * <p>Java class for IncentiveTableType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IncentiveTableType"&gt;
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
 *         &lt;element name="incentiveSlot" type="{http://docs.eebus.org/spine/xsd/v1}IncentiveTableIncentiveSlotType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IncentiveTableType", propOrder = {
    "tariff",
    "incentiveSlot"
})
public class IncentiveTableType implements Cloneable, CopyTo, ToString
{

    protected IncentiveTableType.Tariff tariff;
    protected List<IncentiveTableIncentiveSlotType> incentiveSlot;

    /**
     * Default no-arg constructor
     * 
     */
    public IncentiveTableType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public IncentiveTableType(final IncentiveTableType.Tariff tariff, final List<IncentiveTableIncentiveSlotType> incentiveSlot) {
        this.tariff = tariff;
        this.incentiveSlot = incentiveSlot;
    }

    /**
     * Gets the value of the tariff property.
     * 
     * @return
     *     possible object is
     *     {@link IncentiveTableType.Tariff }
     *     
     */
    public IncentiveTableType.Tariff getTariff() {
        return tariff;
    }

    /**
     * Sets the value of the tariff property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncentiveTableType.Tariff }
     *     
     */
    public void setTariff(IncentiveTableType.Tariff value) {
        this.tariff = value;
    }

    /**
     * Gets the value of the incentiveSlot property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the incentiveSlot property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncentiveSlot().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IncentiveTableIncentiveSlotType }
     * 
     * 
     */
    public List<IncentiveTableIncentiveSlotType> getIncentiveSlot() {
        if (incentiveSlot == null) {
            incentiveSlot = new ArrayList<IncentiveTableIncentiveSlotType>();
        }
        return this.incentiveSlot;
    }

    /**
     * Sets the value of the tariff property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncentiveTableType.Tariff }
     * @return
     *     The class instance
     */
    public IncentiveTableType withTariff(IncentiveTableType.Tariff value) {
        setTariff(value);
        return this;
    }

    /**
     * Adds objects to the list of IncentiveSlot using add method
     * 
     * @param values
     *     objects to add to the list IncentiveSlot
     * @return
     *     The class instance
     */
    public IncentiveTableType withIncentiveSlot(IncentiveTableIncentiveSlotType... values) {
        if (values!= null) {
            for (IncentiveTableIncentiveSlotType value: values) {
                getIncentiveSlot().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of IncentiveSlot using addAll method
     * 
     * @param values
     *     objects to add to the list IncentiveSlot
     * @return
     *     The class instance
     */
    public IncentiveTableType withIncentiveSlot(Collection<IncentiveTableIncentiveSlotType> values) {
        if (values!= null) {
            getIncentiveSlot().addAll(values);
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
        if (draftCopy instanceof IncentiveTableType) {
            final IncentiveTableType copy = ((IncentiveTableType) draftCopy);
            {
                Boolean tariffShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.tariff!= null));
                if (tariffShouldBeCopiedAndSet == Boolean.TRUE) {
                    IncentiveTableType.Tariff sourceTariff;
                    sourceTariff = this.getTariff();
                    IncentiveTableType.Tariff copyTariff = ((IncentiveTableType.Tariff) strategy.copy(LocatorUtils.property(locator, "tariff", sourceTariff), sourceTariff, (this.tariff!= null)));
                    copy.setTariff(copyTariff);
                } else {
                    if (tariffShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.tariff = null;
                    }
                }
            }
            {
                Boolean incentiveSlotShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.incentiveSlot!= null)&&(!this.incentiveSlot.isEmpty())));
                if (incentiveSlotShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<IncentiveTableIncentiveSlotType> sourceIncentiveSlot;
                    sourceIncentiveSlot = (((this.incentiveSlot!= null)&&(!this.incentiveSlot.isEmpty()))?this.getIncentiveSlot():null);
                    @SuppressWarnings("unchecked")
                    List<IncentiveTableIncentiveSlotType> copyIncentiveSlot = ((List<IncentiveTableIncentiveSlotType> ) strategy.copy(LocatorUtils.property(locator, "incentiveSlot", sourceIncentiveSlot), sourceIncentiveSlot, ((this.incentiveSlot!= null)&&(!this.incentiveSlot.isEmpty()))));
                    copy.incentiveSlot = null;
                    if (copyIncentiveSlot!= null) {
                        List<IncentiveTableIncentiveSlotType> uniqueIncentiveSlotl = copy.getIncentiveSlot();
                        uniqueIncentiveSlotl.addAll(copyIncentiveSlot);
                    }
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
        return new IncentiveTableType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final IncentiveTableType that = ((IncentiveTableType) object);
        {
            IncentiveTableType.Tariff leftTariff;
            leftTariff = this.getTariff();
            IncentiveTableType.Tariff rightTariff;
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
            List<IncentiveTableIncentiveSlotType> leftIncentiveSlot;
            leftIncentiveSlot = (((this.incentiveSlot!= null)&&(!this.incentiveSlot.isEmpty()))?this.getIncentiveSlot():null);
            List<IncentiveTableIncentiveSlotType> rightIncentiveSlot;
            rightIncentiveSlot = (((that.incentiveSlot!= null)&&(!that.incentiveSlot.isEmpty()))?that.getIncentiveSlot():null);
            if ((this.incentiveSlot!= null)&&(!this.incentiveSlot.isEmpty())) {
                if ((that.incentiveSlot!= null)&&(!that.incentiveSlot.isEmpty())) {
                    if (!leftIncentiveSlot.equals(rightIncentiveSlot)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.incentiveSlot!= null)&&(!that.incentiveSlot.isEmpty())) {
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
            IncentiveTableType.Tariff theTariff;
            theTariff = this.getTariff();
            if (this.tariff!= null) {
                currentHashCode += theTariff.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            List<IncentiveTableIncentiveSlotType> theIncentiveSlot;
            theIncentiveSlot = (((this.incentiveSlot!= null)&&(!this.incentiveSlot.isEmpty()))?this.getIncentiveSlot():null);
            if ((this.incentiveSlot!= null)&&(!this.incentiveSlot.isEmpty())) {
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
            IncentiveTableType.Tariff theTariff;
            theTariff = this.getTariff();
            strategy.appendField(locator, this, "tariff", buffer, theTariff, (this.tariff!= null));
        }
        {
            List<IncentiveTableIncentiveSlotType> theIncentiveSlot;
            theIncentiveSlot = (((this.incentiveSlot!= null)&&(!this.incentiveSlot.isEmpty()))?this.getIncentiveSlot():null);
            strategy.appendField(locator, this, "incentiveSlot", buffer, theIncentiveSlot, ((this.incentiveSlot!= null)&&(!this.incentiveSlot.isEmpty())));
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
        public IncentiveTableType.Tariff withTariffId(Long value) {
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
        public IncentiveTableType.Tariff withActiveTierId(Long... values) {
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
        public IncentiveTableType.Tariff withActiveTierId(Collection<Long> values) {
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
            return new IncentiveTableType.Tariff();
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
