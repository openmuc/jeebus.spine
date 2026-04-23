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
 * <p>Java class for IncentiveTableDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IncentiveTableDescriptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tariffDescription" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}TariffDescriptionDataType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="tariffId" type="{http://docs.eebus.org/spine/xsd/v1}TariffIdType" minOccurs="0"/&gt;
 *                   &lt;element name="measurementId" type="{http://docs.eebus.org/spine/xsd/v1}MeasurementIdType" minOccurs="0"/&gt;
 *                   &lt;element name="tariffWriteable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="updateRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="scopeType" type="{http://docs.eebus.org/spine/xsd/v1}ScopeTypeType" minOccurs="0"/&gt;
 *                   &lt;element name="label" type="{http://docs.eebus.org/spine/xsd/v1}LabelType" minOccurs="0"/&gt;
 *                   &lt;element name="description" type="{http://docs.eebus.org/spine/xsd/v1}DescriptionType" minOccurs="0"/&gt;
 *                   &lt;element name="slotIdSupport" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="tier" type="{http://docs.eebus.org/spine/xsd/v1}IncentiveTableDescriptionTierType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IncentiveTableDescriptionType", propOrder = {
    "tariffDescription",
    "tier"
})
public class IncentiveTableDescriptionType implements Cloneable, CopyTo, ToString
{

    protected IncentiveTableDescriptionType.TariffDescription tariffDescription;
    protected List<IncentiveTableDescriptionTierType> tier;

    /**
     * Default no-arg constructor
     * 
     */
    public IncentiveTableDescriptionType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public IncentiveTableDescriptionType(final IncentiveTableDescriptionType.TariffDescription tariffDescription, final List<IncentiveTableDescriptionTierType> tier) {
        this.tariffDescription = tariffDescription;
        this.tier = tier;
    }

    /**
     * Gets the value of the tariffDescription property.
     * 
     * @return
     *     possible object is
     *     {@link IncentiveTableDescriptionType.TariffDescription }
     *     
     */
    public IncentiveTableDescriptionType.TariffDescription getTariffDescription() {
        return tariffDescription;
    }

    /**
     * Sets the value of the tariffDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncentiveTableDescriptionType.TariffDescription }
     *     
     */
    public void setTariffDescription(IncentiveTableDescriptionType.TariffDescription value) {
        this.tariffDescription = value;
    }

    /**
     * Gets the value of the tier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the tier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IncentiveTableDescriptionTierType }
     * 
     * 
     */
    public List<IncentiveTableDescriptionTierType> getTier() {
        if (tier == null) {
            tier = new ArrayList<IncentiveTableDescriptionTierType>();
        }
        return this.tier;
    }

    /**
     * Sets the value of the tariffDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncentiveTableDescriptionType.TariffDescription }
     * @return
     *     The class instance
     */
    public IncentiveTableDescriptionType withTariffDescription(IncentiveTableDescriptionType.TariffDescription value) {
        setTariffDescription(value);
        return this;
    }

    /**
     * Adds objects to the list of Tier using add method
     * 
     * @param values
     *     objects to add to the list Tier
     * @return
     *     The class instance
     */
    public IncentiveTableDescriptionType withTier(IncentiveTableDescriptionTierType... values) {
        if (values!= null) {
            for (IncentiveTableDescriptionTierType value: values) {
                getTier().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of Tier using addAll method
     * 
     * @param values
     *     objects to add to the list Tier
     * @return
     *     The class instance
     */
    public IncentiveTableDescriptionType withTier(Collection<IncentiveTableDescriptionTierType> values) {
        if (values!= null) {
            getTier().addAll(values);
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
        if (draftCopy instanceof IncentiveTableDescriptionType) {
            final IncentiveTableDescriptionType copy = ((IncentiveTableDescriptionType) draftCopy);
            {
                Boolean tariffDescriptionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.tariffDescription!= null));
                if (tariffDescriptionShouldBeCopiedAndSet == Boolean.TRUE) {
                    IncentiveTableDescriptionType.TariffDescription sourceTariffDescription;
                    sourceTariffDescription = this.getTariffDescription();
                    IncentiveTableDescriptionType.TariffDescription copyTariffDescription = ((IncentiveTableDescriptionType.TariffDescription) strategy.copy(LocatorUtils.property(locator, "tariffDescription", sourceTariffDescription), sourceTariffDescription, (this.tariffDescription!= null)));
                    copy.setTariffDescription(copyTariffDescription);
                } else {
                    if (tariffDescriptionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.tariffDescription = null;
                    }
                }
            }
            {
                Boolean tierShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.tier!= null)&&(!this.tier.isEmpty())));
                if (tierShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<IncentiveTableDescriptionTierType> sourceTier;
                    sourceTier = (((this.tier!= null)&&(!this.tier.isEmpty()))?this.getTier():null);
                    @SuppressWarnings("unchecked")
                    List<IncentiveTableDescriptionTierType> copyTier = ((List<IncentiveTableDescriptionTierType> ) strategy.copy(LocatorUtils.property(locator, "tier", sourceTier), sourceTier, ((this.tier!= null)&&(!this.tier.isEmpty()))));
                    copy.tier = null;
                    if (copyTier!= null) {
                        List<IncentiveTableDescriptionTierType> uniqueTierl = copy.getTier();
                        uniqueTierl.addAll(copyTier);
                    }
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
        return new IncentiveTableDescriptionType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final IncentiveTableDescriptionType that = ((IncentiveTableDescriptionType) object);
        {
            IncentiveTableDescriptionType.TariffDescription leftTariffDescription;
            leftTariffDescription = this.getTariffDescription();
            IncentiveTableDescriptionType.TariffDescription rightTariffDescription;
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
            List<IncentiveTableDescriptionTierType> leftTier;
            leftTier = (((this.tier!= null)&&(!this.tier.isEmpty()))?this.getTier():null);
            List<IncentiveTableDescriptionTierType> rightTier;
            rightTier = (((that.tier!= null)&&(!that.tier.isEmpty()))?that.getTier():null);
            if ((this.tier!= null)&&(!this.tier.isEmpty())) {
                if ((that.tier!= null)&&(!that.tier.isEmpty())) {
                    if (!leftTier.equals(rightTier)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.tier!= null)&&(!that.tier.isEmpty())) {
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
            IncentiveTableDescriptionType.TariffDescription theTariffDescription;
            theTariffDescription = this.getTariffDescription();
            if (this.tariffDescription!= null) {
                currentHashCode += theTariffDescription.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            List<IncentiveTableDescriptionTierType> theTier;
            theTier = (((this.tier!= null)&&(!this.tier.isEmpty()))?this.getTier():null);
            if ((this.tier!= null)&&(!this.tier.isEmpty())) {
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
            IncentiveTableDescriptionType.TariffDescription theTariffDescription;
            theTariffDescription = this.getTariffDescription();
            strategy.appendField(locator, this, "tariffDescription", buffer, theTariffDescription, (this.tariffDescription!= null));
        }
        {
            List<IncentiveTableDescriptionTierType> theTier;
            theTier = (((this.tier!= null)&&(!this.tier.isEmpty()))?this.getTier():null);
            strategy.appendField(locator, this, "tier", buffer, theTier, ((this.tier!= null)&&(!this.tier.isEmpty())));
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
     *     &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}TariffDescriptionDataType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="tariffId" type="{http://docs.eebus.org/spine/xsd/v1}TariffIdType" minOccurs="0"/&gt;
     *         &lt;element name="measurementId" type="{http://docs.eebus.org/spine/xsd/v1}MeasurementIdType" minOccurs="0"/&gt;
     *         &lt;element name="tariffWriteable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="updateRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="scopeType" type="{http://docs.eebus.org/spine/xsd/v1}ScopeTypeType" minOccurs="0"/&gt;
     *         &lt;element name="label" type="{http://docs.eebus.org/spine/xsd/v1}LabelType" minOccurs="0"/&gt;
     *         &lt;element name="description" type="{http://docs.eebus.org/spine/xsd/v1}DescriptionType" minOccurs="0"/&gt;
     *         &lt;element name="slotIdSupport" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
        extends TariffDescriptionDataType
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
        public TariffDescription(final Long tariffId, final Long commodityId, final Long measurementId, final Boolean tariffWriteable, final Boolean updateRequired, final String scopeType, final String label, final String description, final Boolean slotIdSupport) {
            super(tariffId, commodityId, measurementId, tariffWriteable, updateRequired, scopeType, label, description, slotIdSupport);
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
        public IncentiveTableDescriptionType.TariffDescription withTariffId(Long value) {
            setTariffId(value);
            return this;
        }

        /**
         * Sets the value of the commodityId property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         * @return
         *     The class instance
         */
        @Override
        public IncentiveTableDescriptionType.TariffDescription withCommodityId(Long value) {
            setCommodityId(value);
            return this;
        }

        /**
         * Sets the value of the measurementId property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         * @return
         *     The class instance
         */
        @Override
        public IncentiveTableDescriptionType.TariffDescription withMeasurementId(Long value) {
            setMeasurementId(value);
            return this;
        }

        /**
         * Sets the value of the tariffWriteable property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         * @return
         *     The class instance
         */
        @Override
        public IncentiveTableDescriptionType.TariffDescription withTariffWriteable(Boolean value) {
            setTariffWriteable(value);
            return this;
        }

        /**
         * Sets the value of the updateRequired property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         * @return
         *     The class instance
         */
        @Override
        public IncentiveTableDescriptionType.TariffDescription withUpdateRequired(Boolean value) {
            setUpdateRequired(value);
            return this;
        }

        /**
         * Sets the value of the scopeType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         * @return
         *     The class instance
         */
        @Override
        public IncentiveTableDescriptionType.TariffDescription withScopeType(String value) {
            setScopeType(value);
            return this;
        }

        /**
         * Sets the value of the label property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         * @return
         *     The class instance
         */
        @Override
        public IncentiveTableDescriptionType.TariffDescription withLabel(String value) {
            setLabel(value);
            return this;
        }

        /**
         * Sets the value of the description property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         * @return
         *     The class instance
         */
        @Override
        public IncentiveTableDescriptionType.TariffDescription withDescription(String value) {
            setDescription(value);
            return this;
        }

        /**
         * Sets the value of the slotIdSupport property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         * @return
         *     The class instance
         */
        @Override
        public IncentiveTableDescriptionType.TariffDescription withSlotIdSupport(Boolean value) {
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
            return new IncentiveTableDescriptionType.TariffDescription();
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
