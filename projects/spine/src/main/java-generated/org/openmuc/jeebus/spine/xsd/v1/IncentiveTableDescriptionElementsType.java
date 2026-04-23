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
 * <p>Java class for IncentiveTableDescriptionElementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IncentiveTableDescriptionElementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tariffDescription" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}TariffDescriptionDataElementsType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="tariffId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *                   &lt;element name="measurementId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *                   &lt;element name="tariffWriteable" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *                   &lt;element name="updateRequired" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *                   &lt;element name="scopeType" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *                   &lt;element name="label" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *                   &lt;element name="description" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *                   &lt;element name="slotIdSupport" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="tier" type="{http://docs.eebus.org/spine/xsd/v1}IncentiveTableDescriptionTierElementsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IncentiveTableDescriptionElementsType", propOrder = {
    "tariffDescription",
    "tier"
})
public class IncentiveTableDescriptionElementsType implements Cloneable, CopyTo, ToString
{

    protected IncentiveTableDescriptionElementsType.TariffDescription tariffDescription;
    protected IncentiveTableDescriptionTierElementsType tier;

    /**
     * Default no-arg constructor
     * 
     */
    public IncentiveTableDescriptionElementsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public IncentiveTableDescriptionElementsType(final IncentiveTableDescriptionElementsType.TariffDescription tariffDescription, final IncentiveTableDescriptionTierElementsType tier) {
        this.tariffDescription = tariffDescription;
        this.tier = tier;
    }

    /**
     * Gets the value of the tariffDescription property.
     * 
     * @return
     *     possible object is
     *     {@link IncentiveTableDescriptionElementsType.TariffDescription }
     *     
     */
    public IncentiveTableDescriptionElementsType.TariffDescription getTariffDescription() {
        return tariffDescription;
    }

    /**
     * Sets the value of the tariffDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncentiveTableDescriptionElementsType.TariffDescription }
     *     
     */
    public void setTariffDescription(IncentiveTableDescriptionElementsType.TariffDescription value) {
        this.tariffDescription = value;
    }

    /**
     * Gets the value of the tier property.
     * 
     * @return
     *     possible object is
     *     {@link IncentiveTableDescriptionTierElementsType }
     *     
     */
    public IncentiveTableDescriptionTierElementsType getTier() {
        return tier;
    }

    /**
     * Sets the value of the tier property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncentiveTableDescriptionTierElementsType }
     *     
     */
    public void setTier(IncentiveTableDescriptionTierElementsType value) {
        this.tier = value;
    }

    /**
     * Sets the value of the tariffDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncentiveTableDescriptionElementsType.TariffDescription }
     * @return
     *     The class instance
     */
    public IncentiveTableDescriptionElementsType withTariffDescription(IncentiveTableDescriptionElementsType.TariffDescription value) {
        setTariffDescription(value);
        return this;
    }

    /**
     * Sets the value of the tier property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncentiveTableDescriptionTierElementsType }
     * @return
     *     The class instance
     */
    public IncentiveTableDescriptionElementsType withTier(IncentiveTableDescriptionTierElementsType value) {
        setTier(value);
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
        if (draftCopy instanceof IncentiveTableDescriptionElementsType) {
            final IncentiveTableDescriptionElementsType copy = ((IncentiveTableDescriptionElementsType) draftCopy);
            {
                Boolean tariffDescriptionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.tariffDescription!= null));
                if (tariffDescriptionShouldBeCopiedAndSet == Boolean.TRUE) {
                    IncentiveTableDescriptionElementsType.TariffDescription sourceTariffDescription;
                    sourceTariffDescription = this.getTariffDescription();
                    IncentiveTableDescriptionElementsType.TariffDescription copyTariffDescription = ((IncentiveTableDescriptionElementsType.TariffDescription) strategy.copy(LocatorUtils.property(locator, "tariffDescription", sourceTariffDescription), sourceTariffDescription, (this.tariffDescription!= null)));
                    copy.setTariffDescription(copyTariffDescription);
                } else {
                    if (tariffDescriptionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.tariffDescription = null;
                    }
                }
            }
            {
                Boolean tierShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.tier!= null));
                if (tierShouldBeCopiedAndSet == Boolean.TRUE) {
                    IncentiveTableDescriptionTierElementsType sourceTier;
                    sourceTier = this.getTier();
                    IncentiveTableDescriptionTierElementsType copyTier = ((IncentiveTableDescriptionTierElementsType) strategy.copy(LocatorUtils.property(locator, "tier", sourceTier), sourceTier, (this.tier!= null)));
                    copy.setTier(copyTier);
                } else {
                    if (tierShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.tier = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new IncentiveTableDescriptionElementsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final IncentiveTableDescriptionElementsType that = ((IncentiveTableDescriptionElementsType) object);
        {
            IncentiveTableDescriptionElementsType.TariffDescription leftTariffDescription;
            leftTariffDescription = this.getTariffDescription();
            IncentiveTableDescriptionElementsType.TariffDescription rightTariffDescription;
            rightTariffDescription = that.getTariffDescription();
            if (this.tariffDescription!= null) {
                if (that.tariffDescription!= null) {
                    if (!leftTariffDescription.equals(rightTariffDescription)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.tariffDescription!= null) {
                    return false;
                }
            }
        }
        {
            IncentiveTableDescriptionTierElementsType leftTier;
            leftTier = this.getTier();
            IncentiveTableDescriptionTierElementsType rightTier;
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
        return true;
    }

    @Override
    public int hashCode() {
        int currentHashCode = 1;
        {
            currentHashCode = (currentHashCode* 31);
            IncentiveTableDescriptionElementsType.TariffDescription theTariffDescription;
            theTariffDescription = this.getTariffDescription();
            if (this.tariffDescription!= null) {
                currentHashCode += theTariffDescription.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            IncentiveTableDescriptionTierElementsType theTier;
            theTier = this.getTier();
            if (this.tier!= null) {
                currentHashCode += theTier.hashCode();
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
            IncentiveTableDescriptionElementsType.TariffDescription theTariffDescription;
            theTariffDescription = this.getTariffDescription();
            strategy.appendField(locator, this, "tariffDescription", buffer, theTariffDescription, (this.tariffDescription!= null));
        }
        {
            IncentiveTableDescriptionTierElementsType theTier;
            theTier = this.getTier();
            strategy.appendField(locator, this, "tier", buffer, theTier, (this.tier!= null));
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
     *     &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}TariffDescriptionDataElementsType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="tariffId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
     *         &lt;element name="measurementId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
     *         &lt;element name="tariffWriteable" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
     *         &lt;element name="updateRequired" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
     *         &lt;element name="scopeType" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
     *         &lt;element name="label" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
     *         &lt;element name="description" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
     *         &lt;element name="slotIdSupport" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
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
    public static class TariffDescription
        extends TariffDescriptionDataElementsType
        implements Cloneable, CopyTo, ToString
    {


        /**
         * Default no-arg constructor
         * 
         */
        public TariffDescription() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public TariffDescription(final ElementTagType tariffId, final ElementTagType commodityId, final ElementTagType measurementId, final ElementTagType tariffWriteable, final ElementTagType updateRequired, final ElementTagType scopeType, final ElementTagType label, final ElementTagType description, final ElementTagType slotIdSupport) {
            super(tariffId, commodityId, measurementId, tariffWriteable, updateRequired, scopeType, label, description, slotIdSupport);
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
        public IncentiveTableDescriptionElementsType.TariffDescription withTariffId(ElementTagType value) {
            setTariffId(value);
            return this;
        }

        /**
         * Sets the value of the commodityId property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElementTagType }
         * @return
         *     The class instance
         */
        @Override
        public IncentiveTableDescriptionElementsType.TariffDescription withCommodityId(ElementTagType value) {
            setCommodityId(value);
            return this;
        }

        /**
         * Sets the value of the measurementId property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElementTagType }
         * @return
         *     The class instance
         */
        @Override
        public IncentiveTableDescriptionElementsType.TariffDescription withMeasurementId(ElementTagType value) {
            setMeasurementId(value);
            return this;
        }

        /**
         * Sets the value of the tariffWriteable property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElementTagType }
         * @return
         *     The class instance
         */
        @Override
        public IncentiveTableDescriptionElementsType.TariffDescription withTariffWriteable(ElementTagType value) {
            setTariffWriteable(value);
            return this;
        }

        /**
         * Sets the value of the updateRequired property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElementTagType }
         * @return
         *     The class instance
         */
        @Override
        public IncentiveTableDescriptionElementsType.TariffDescription withUpdateRequired(ElementTagType value) {
            setUpdateRequired(value);
            return this;
        }

        /**
         * Sets the value of the scopeType property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElementTagType }
         * @return
         *     The class instance
         */
        @Override
        public IncentiveTableDescriptionElementsType.TariffDescription withScopeType(ElementTagType value) {
            setScopeType(value);
            return this;
        }

        /**
         * Sets the value of the label property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElementTagType }
         * @return
         *     The class instance
         */
        @Override
        public IncentiveTableDescriptionElementsType.TariffDescription withLabel(ElementTagType value) {
            setLabel(value);
            return this;
        }

        /**
         * Sets the value of the description property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElementTagType }
         * @return
         *     The class instance
         */
        @Override
        public IncentiveTableDescriptionElementsType.TariffDescription withDescription(ElementTagType value) {
            setDescription(value);
            return this;
        }

        /**
         * Sets the value of the slotIdSupport property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElementTagType }
         * @return
         *     The class instance
         */
        @Override
        public IncentiveTableDescriptionElementsType.TariffDescription withSlotIdSupport(ElementTagType value) {
            setSlotIdSupport(value);
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
            return new IncentiveTableDescriptionElementsType.TariffDescription();
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
