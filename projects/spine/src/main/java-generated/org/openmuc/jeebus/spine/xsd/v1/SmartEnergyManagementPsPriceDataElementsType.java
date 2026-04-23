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
 * <p>Java class for SmartEnergyManagementPsPriceDataElementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SmartEnergyManagementPsPriceDataElementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="price" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}PowerSequencePriceDataElementsType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="sequenceId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *                   &lt;element name="price" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberElementsType" minOccurs="0"/&gt;
 *                   &lt;element name="currency" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
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
@XmlType(name = "SmartEnergyManagementPsPriceDataElementsType", propOrder = {
    "price"
})
public class SmartEnergyManagementPsPriceDataElementsType implements Cloneable, CopyTo, ToString
{

    protected SmartEnergyManagementPsPriceDataElementsType.Price price;

    /**
     * Default no-arg constructor
     * 
     */
    public SmartEnergyManagementPsPriceDataElementsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public SmartEnergyManagementPsPriceDataElementsType(final SmartEnergyManagementPsPriceDataElementsType.Price price) {
        this.price = price;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link SmartEnergyManagementPsPriceDataElementsType.Price }
     *     
     */
    public SmartEnergyManagementPsPriceDataElementsType.Price getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmartEnergyManagementPsPriceDataElementsType.Price }
     *     
     */
    public void setPrice(SmartEnergyManagementPsPriceDataElementsType.Price value) {
        this.price = value;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmartEnergyManagementPsPriceDataElementsType.Price }
     * @return
     *     The class instance
     */
    public SmartEnergyManagementPsPriceDataElementsType withPrice(SmartEnergyManagementPsPriceDataElementsType.Price value) {
        setPrice(value);
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
        if (draftCopy instanceof SmartEnergyManagementPsPriceDataElementsType) {
            final SmartEnergyManagementPsPriceDataElementsType copy = ((SmartEnergyManagementPsPriceDataElementsType) draftCopy);
            {
                Boolean priceShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.price!= null));
                if (priceShouldBeCopiedAndSet == Boolean.TRUE) {
                    SmartEnergyManagementPsPriceDataElementsType.Price sourcePrice;
                    sourcePrice = this.getPrice();
                    SmartEnergyManagementPsPriceDataElementsType.Price copyPrice = ((SmartEnergyManagementPsPriceDataElementsType.Price) strategy.copy(LocatorUtils.property(locator, "price", sourcePrice), sourcePrice, (this.price!= null)));
                    copy.setPrice(copyPrice);
                } else {
                    if (priceShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.price = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new SmartEnergyManagementPsPriceDataElementsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final SmartEnergyManagementPsPriceDataElementsType that = ((SmartEnergyManagementPsPriceDataElementsType) object);
        {
            SmartEnergyManagementPsPriceDataElementsType.Price leftPrice;
            leftPrice = this.getPrice();
            SmartEnergyManagementPsPriceDataElementsType.Price rightPrice;
            rightPrice = that.getPrice();
            if (this.price!= null) {
                if (that.price!= null) {
                    if (!leftPrice.equals(rightPrice)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.price!= null) {
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
            SmartEnergyManagementPsPriceDataElementsType.Price thePrice;
            thePrice = this.getPrice();
            if (this.price!= null) {
                currentHashCode += thePrice.hashCode();
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
            SmartEnergyManagementPsPriceDataElementsType.Price thePrice;
            thePrice = this.getPrice();
            strategy.appendField(locator, this, "price", buffer, thePrice, (this.price!= null));
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
     *     &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}PowerSequencePriceDataElementsType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="sequenceId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
     *         &lt;element name="price" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberElementsType" minOccurs="0"/&gt;
     *         &lt;element name="currency" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
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
    public static class Price
        extends PowerSequencePriceDataElementsType
        implements Cloneable, CopyTo, ToString
    {


        /**
         * Default no-arg constructor
         * 
         */
        public Price() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public Price(final ElementTagType sequenceId, final ElementTagType potentialStartTime, final ScaledNumberElementsType price, final ElementTagType currency) {
            super(sequenceId, potentialStartTime, price, currency);
        }

        /**
         * Sets the value of the sequenceId property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElementTagType }
         * @return
         *     The class instance
         */
        @Override
        public SmartEnergyManagementPsPriceDataElementsType.Price withSequenceId(ElementTagType value) {
            setSequenceId(value);
            return this;
        }

        /**
         * Sets the value of the potentialStartTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElementTagType }
         * @return
         *     The class instance
         */
        @Override
        public SmartEnergyManagementPsPriceDataElementsType.Price withPotentialStartTime(ElementTagType value) {
            setPotentialStartTime(value);
            return this;
        }

        /**
         * Sets the value of the price property.
         * 
         * @param value
         *     allowed object is
         *     {@link ScaledNumberElementsType }
         * @return
         *     The class instance
         */
        @Override
        public SmartEnergyManagementPsPriceDataElementsType.Price withPrice(ScaledNumberElementsType value) {
            setPrice(value);
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
        public SmartEnergyManagementPsPriceDataElementsType.Price withCurrency(ElementTagType value) {
            setCurrency(value);
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
            return new SmartEnergyManagementPsPriceDataElementsType.Price();
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
