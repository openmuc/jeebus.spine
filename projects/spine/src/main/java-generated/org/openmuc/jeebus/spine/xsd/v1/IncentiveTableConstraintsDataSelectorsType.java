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
 * <p>Java class for IncentiveTableConstraintsDataSelectorsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IncentiveTableConstraintsDataSelectorsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tariff" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}TariffListDataSelectorsType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="tariffId" type="{http://docs.eebus.org/spine/xsd/v1}TariffIdType" minOccurs="0"/&gt;
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
@XmlType(name = "IncentiveTableConstraintsDataSelectorsType", propOrder = {
    "tariff"
})
public class IncentiveTableConstraintsDataSelectorsType implements Cloneable, CopyTo, ToString
{

    protected IncentiveTableConstraintsDataSelectorsType.Tariff tariff;

    /**
     * Default no-arg constructor
     * 
     */
    public IncentiveTableConstraintsDataSelectorsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public IncentiveTableConstraintsDataSelectorsType(final IncentiveTableConstraintsDataSelectorsType.Tariff tariff) {
        this.tariff = tariff;
    }

    /**
     * Gets the value of the tariff property.
     * 
     * @return
     *     possible object is
     *     {@link IncentiveTableConstraintsDataSelectorsType.Tariff }
     *     
     */
    public IncentiveTableConstraintsDataSelectorsType.Tariff getTariff() {
        return tariff;
    }

    /**
     * Sets the value of the tariff property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncentiveTableConstraintsDataSelectorsType.Tariff }
     *     
     */
    public void setTariff(IncentiveTableConstraintsDataSelectorsType.Tariff value) {
        this.tariff = value;
    }

    /**
     * Sets the value of the tariff property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncentiveTableConstraintsDataSelectorsType.Tariff }
     * @return
     *     The class instance
     */
    public IncentiveTableConstraintsDataSelectorsType withTariff(IncentiveTableConstraintsDataSelectorsType.Tariff value) {
        setTariff(value);
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
        if (draftCopy instanceof IncentiveTableConstraintsDataSelectorsType) {
            final IncentiveTableConstraintsDataSelectorsType copy = ((IncentiveTableConstraintsDataSelectorsType) draftCopy);
            {
                Boolean tariffShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.tariff!= null));
                if (tariffShouldBeCopiedAndSet == Boolean.TRUE) {
                    IncentiveTableConstraintsDataSelectorsType.Tariff sourceTariff;
                    sourceTariff = this.getTariff();
                    IncentiveTableConstraintsDataSelectorsType.Tariff copyTariff = ((IncentiveTableConstraintsDataSelectorsType.Tariff) strategy.copy(LocatorUtils.property(locator, "tariff", sourceTariff), sourceTariff, (this.tariff!= null)));
                    copy.setTariff(copyTariff);
                } else {
                    if (tariffShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.tariff = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new IncentiveTableConstraintsDataSelectorsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final IncentiveTableConstraintsDataSelectorsType that = ((IncentiveTableConstraintsDataSelectorsType) object);
        {
            IncentiveTableConstraintsDataSelectorsType.Tariff leftTariff;
            leftTariff = this.getTariff();
            IncentiveTableConstraintsDataSelectorsType.Tariff rightTariff;
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
        return true;
    }

    @Override
    public int hashCode() {
        int currentHashCode = 1;
        {
            currentHashCode = (currentHashCode* 31);
            IncentiveTableConstraintsDataSelectorsType.Tariff theTariff;
            theTariff = this.getTariff();
            if (this.tariff!= null) {
                currentHashCode += theTariff.hashCode();
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
            IncentiveTableConstraintsDataSelectorsType.Tariff theTariff;
            theTariff = this.getTariff();
            strategy.appendField(locator, this, "tariff", buffer, theTariff, (this.tariff!= null));
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
     *     &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}TariffListDataSelectorsType"&gt;
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
        extends TariffListDataSelectorsType
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
        public Tariff(final Long tariffId, final Long activeTierId) {
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
        public IncentiveTableConstraintsDataSelectorsType.Tariff withTariffId(Long value) {
            setTariffId(value);
            return this;
        }

        /**
         * Sets the value of the activeTierId property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         * @return
         *     The class instance
         */
        @Override
        public IncentiveTableConstraintsDataSelectorsType.Tariff withActiveTierId(Long value) {
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
            return new IncentiveTableConstraintsDataSelectorsType.Tariff();
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
