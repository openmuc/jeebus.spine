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
 * <p>Java class for SmartEnergyManagementPsPriceCalculationRequestCallElementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SmartEnergyManagementPsPriceCalculationRequestCallElementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="priceCalculationRequest" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}PowerSequencePriceCalculationRequestCallElementsType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="sequenceId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
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
@XmlType(name = "SmartEnergyManagementPsPriceCalculationRequestCallElementsType", propOrder = {
    "priceCalculationRequest"
})
public class SmartEnergyManagementPsPriceCalculationRequestCallElementsType implements Cloneable, CopyTo, ToString
{

    protected SmartEnergyManagementPsPriceCalculationRequestCallElementsType.PriceCalculationRequest priceCalculationRequest;

    /**
     * Default no-arg constructor
     * 
     */
    public SmartEnergyManagementPsPriceCalculationRequestCallElementsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public SmartEnergyManagementPsPriceCalculationRequestCallElementsType(final SmartEnergyManagementPsPriceCalculationRequestCallElementsType.PriceCalculationRequest priceCalculationRequest) {
        this.priceCalculationRequest = priceCalculationRequest;
    }

    /**
     * Gets the value of the priceCalculationRequest property.
     * 
     * @return
     *     possible object is
     *     {@link SmartEnergyManagementPsPriceCalculationRequestCallElementsType.PriceCalculationRequest }
     *     
     */
    public SmartEnergyManagementPsPriceCalculationRequestCallElementsType.PriceCalculationRequest getPriceCalculationRequest() {
        return priceCalculationRequest;
    }

    /**
     * Sets the value of the priceCalculationRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmartEnergyManagementPsPriceCalculationRequestCallElementsType.PriceCalculationRequest }
     *     
     */
    public void setPriceCalculationRequest(SmartEnergyManagementPsPriceCalculationRequestCallElementsType.PriceCalculationRequest value) {
        this.priceCalculationRequest = value;
    }

    /**
     * Sets the value of the priceCalculationRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmartEnergyManagementPsPriceCalculationRequestCallElementsType.PriceCalculationRequest }
     * @return
     *     The class instance
     */
    public SmartEnergyManagementPsPriceCalculationRequestCallElementsType withPriceCalculationRequest(SmartEnergyManagementPsPriceCalculationRequestCallElementsType.PriceCalculationRequest value) {
        setPriceCalculationRequest(value);
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
        if (draftCopy instanceof SmartEnergyManagementPsPriceCalculationRequestCallElementsType) {
            final SmartEnergyManagementPsPriceCalculationRequestCallElementsType copy = ((SmartEnergyManagementPsPriceCalculationRequestCallElementsType) draftCopy);
            {
                Boolean priceCalculationRequestShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.priceCalculationRequest!= null));
                if (priceCalculationRequestShouldBeCopiedAndSet == Boolean.TRUE) {
                    SmartEnergyManagementPsPriceCalculationRequestCallElementsType.PriceCalculationRequest sourcePriceCalculationRequest;
                    sourcePriceCalculationRequest = this.getPriceCalculationRequest();
                    SmartEnergyManagementPsPriceCalculationRequestCallElementsType.PriceCalculationRequest copyPriceCalculationRequest = ((SmartEnergyManagementPsPriceCalculationRequestCallElementsType.PriceCalculationRequest) strategy.copy(LocatorUtils.property(locator, "priceCalculationRequest", sourcePriceCalculationRequest), sourcePriceCalculationRequest, (this.priceCalculationRequest!= null)));
                    copy.setPriceCalculationRequest(copyPriceCalculationRequest);
                } else {
                    if (priceCalculationRequestShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.priceCalculationRequest = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new SmartEnergyManagementPsPriceCalculationRequestCallElementsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final SmartEnergyManagementPsPriceCalculationRequestCallElementsType that = ((SmartEnergyManagementPsPriceCalculationRequestCallElementsType) object);
        {
            SmartEnergyManagementPsPriceCalculationRequestCallElementsType.PriceCalculationRequest leftPriceCalculationRequest;
            leftPriceCalculationRequest = this.getPriceCalculationRequest();
            SmartEnergyManagementPsPriceCalculationRequestCallElementsType.PriceCalculationRequest rightPriceCalculationRequest;
            rightPriceCalculationRequest = that.getPriceCalculationRequest();
            if (this.priceCalculationRequest!= null) {
                if (that.priceCalculationRequest!= null) {
                    if (!leftPriceCalculationRequest.equals(rightPriceCalculationRequest)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.priceCalculationRequest!= null) {
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
            SmartEnergyManagementPsPriceCalculationRequestCallElementsType.PriceCalculationRequest thePriceCalculationRequest;
            thePriceCalculationRequest = this.getPriceCalculationRequest();
            if (this.priceCalculationRequest!= null) {
                currentHashCode += thePriceCalculationRequest.hashCode();
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
            SmartEnergyManagementPsPriceCalculationRequestCallElementsType.PriceCalculationRequest thePriceCalculationRequest;
            thePriceCalculationRequest = this.getPriceCalculationRequest();
            strategy.appendField(locator, this, "priceCalculationRequest", buffer, thePriceCalculationRequest, (this.priceCalculationRequest!= null));
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
     *     &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}PowerSequencePriceCalculationRequestCallElementsType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="sequenceId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
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
    public static class PriceCalculationRequest
        extends PowerSequencePriceCalculationRequestCallElementsType
        implements Cloneable, CopyTo, ToString
    {


        /**
         * Default no-arg constructor
         * 
         */
        public PriceCalculationRequest() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public PriceCalculationRequest(final ElementTagType sequenceId, final ElementTagType potentialStartTime) {
            super(sequenceId, potentialStartTime);
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
        public SmartEnergyManagementPsPriceCalculationRequestCallElementsType.PriceCalculationRequest withSequenceId(ElementTagType value) {
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
        public SmartEnergyManagementPsPriceCalculationRequestCallElementsType.PriceCalculationRequest withPotentialStartTime(ElementTagType value) {
            setPotentialStartTime(value);
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
            return new SmartEnergyManagementPsPriceCalculationRequestCallElementsType.PriceCalculationRequest();
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
