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
 * <p>Java class for SmartEnergyManagementPsPriceDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SmartEnergyManagementPsPriceDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="price" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}PowerSequencePriceDataType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="sequenceId" type="{http://docs.eebus.org/spine/xsd/v1}PowerSequenceIdType" minOccurs="0"/&gt;
 *                   &lt;element name="price" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberType" minOccurs="0"/&gt;
 *                   &lt;element name="currency" type="{http://docs.eebus.org/spine/xsd/v1}CurrencyType" minOccurs="0"/&gt;
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
@XmlType(name = "SmartEnergyManagementPsPriceDataType", propOrder = {
    "price"
})
public class SmartEnergyManagementPsPriceDataType implements Cloneable, CopyTo, ToString
{

    protected List<SmartEnergyManagementPsPriceDataType.Price> price;

    /**
     * Default no-arg constructor
     * 
     */
    public SmartEnergyManagementPsPriceDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public SmartEnergyManagementPsPriceDataType(final List<SmartEnergyManagementPsPriceDataType.Price> price) {
        this.price = price;
    }

    /**
     * Gets the value of the price property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the price property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SmartEnergyManagementPsPriceDataType.Price }
     * 
     * 
     */
    public List<SmartEnergyManagementPsPriceDataType.Price> getPrice() {
        if (price == null) {
            price = new ArrayList<SmartEnergyManagementPsPriceDataType.Price>();
        }
        return this.price;
    }

    /**
     * Adds objects to the list of Price using add method
     * 
     * @param values
     *     objects to add to the list Price
     * @return
     *     The class instance
     */
    public SmartEnergyManagementPsPriceDataType withPrice(SmartEnergyManagementPsPriceDataType.Price... values) {
        if (values!= null) {
            for (SmartEnergyManagementPsPriceDataType.Price value: values) {
                getPrice().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of Price using addAll method
     * 
     * @param values
     *     objects to add to the list Price
     * @return
     *     The class instance
     */
    public SmartEnergyManagementPsPriceDataType withPrice(Collection<SmartEnergyManagementPsPriceDataType.Price> values) {
        if (values!= null) {
            getPrice().addAll(values);
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
        if (draftCopy instanceof SmartEnergyManagementPsPriceDataType) {
            final SmartEnergyManagementPsPriceDataType copy = ((SmartEnergyManagementPsPriceDataType) draftCopy);
            {
                Boolean priceShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.price!= null)&&(!this.price.isEmpty())));
                if (priceShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<SmartEnergyManagementPsPriceDataType.Price> sourcePrice;
                    sourcePrice = (((this.price!= null)&&(!this.price.isEmpty()))?this.getPrice():null);
                    @SuppressWarnings("unchecked")
                    List<SmartEnergyManagementPsPriceDataType.Price> copyPrice = ((List<SmartEnergyManagementPsPriceDataType.Price> ) strategy.copy(LocatorUtils.property(locator, "price", sourcePrice), sourcePrice, ((this.price!= null)&&(!this.price.isEmpty()))));
                    copy.price = null;
                    if (copyPrice!= null) {
                        List<SmartEnergyManagementPsPriceDataType.Price> uniquePricel = copy.getPrice();
                        uniquePricel.addAll(copyPrice);
                    }
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
        return new SmartEnergyManagementPsPriceDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final SmartEnergyManagementPsPriceDataType that = ((SmartEnergyManagementPsPriceDataType) object);
        {
            List<SmartEnergyManagementPsPriceDataType.Price> leftPrice;
            leftPrice = (((this.price!= null)&&(!this.price.isEmpty()))?this.getPrice():null);
            List<SmartEnergyManagementPsPriceDataType.Price> rightPrice;
            rightPrice = (((that.price!= null)&&(!that.price.isEmpty()))?that.getPrice():null);
            if ((this.price!= null)&&(!this.price.isEmpty())) {
                if ((that.price!= null)&&(!that.price.isEmpty())) {
                    if (!leftPrice.equals(rightPrice)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.price!= null)&&(!that.price.isEmpty())) {
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
            List<SmartEnergyManagementPsPriceDataType.Price> thePrice;
            thePrice = (((this.price!= null)&&(!this.price.isEmpty()))?this.getPrice():null);
            if ((this.price!= null)&&(!this.price.isEmpty())) {
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
            List<SmartEnergyManagementPsPriceDataType.Price> thePrice;
            thePrice = (((this.price!= null)&&(!this.price.isEmpty()))?this.getPrice():null);
            strategy.appendField(locator, this, "price", buffer, thePrice, ((this.price!= null)&&(!this.price.isEmpty())));
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
     *     &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}PowerSequencePriceDataType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="sequenceId" type="{http://docs.eebus.org/spine/xsd/v1}PowerSequenceIdType" minOccurs="0"/&gt;
     *         &lt;element name="price" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberType" minOccurs="0"/&gt;
     *         &lt;element name="currency" type="{http://docs.eebus.org/spine/xsd/v1}CurrencyType" minOccurs="0"/&gt;
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
        extends PowerSequencePriceDataType
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
        public Price(final Long sequenceId, final String potentialStartTime, final ScaledNumberType price, final String currency) {
            super(sequenceId, potentialStartTime, price, currency);
        }

        /**
         * Sets the value of the sequenceId property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         * @return
         *     The class instance
         */
        @Override
        public SmartEnergyManagementPsPriceDataType.Price withSequenceId(Long value) {
            setSequenceId(value);
            return this;
        }

        /**
         * Sets the value of the potentialStartTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         * @return
         *     The class instance
         */
        @Override
        public SmartEnergyManagementPsPriceDataType.Price withPotentialStartTime(String value) {
            setPotentialStartTime(value);
            return this;
        }

        /**
         * Sets the value of the price property.
         * 
         * @param value
         *     allowed object is
         *     {@link ScaledNumberType }
         * @return
         *     The class instance
         */
        @Override
        public SmartEnergyManagementPsPriceDataType.Price withPrice(ScaledNumberType value) {
            setPrice(value);
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
        public SmartEnergyManagementPsPriceDataType.Price withCurrency(String value) {
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
            return new SmartEnergyManagementPsPriceDataType.Price();
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
