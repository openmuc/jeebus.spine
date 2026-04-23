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
 * <p>Java class for IncentiveTableDescriptionDataSelectorsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IncentiveTableDescriptionDataSelectorsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tariffDescription" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}TariffDescriptionListDataSelectorsType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="tariffId" type="{http://docs.eebus.org/spine/xsd/v1}TariffIdType" minOccurs="0"/&gt;
 *                   &lt;element name="scopeType" type="{http://docs.eebus.org/spine/xsd/v1}ScopeTypeType" minOccurs="0"/&gt;
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
@XmlType(name = "IncentiveTableDescriptionDataSelectorsType", propOrder = {
    "tariffDescription"
})
public class IncentiveTableDescriptionDataSelectorsType implements Cloneable, CopyTo, ToString
{

    protected IncentiveTableDescriptionDataSelectorsType.TariffDescription tariffDescription;

    /**
     * Default no-arg constructor
     * 
     */
    public IncentiveTableDescriptionDataSelectorsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public IncentiveTableDescriptionDataSelectorsType(final IncentiveTableDescriptionDataSelectorsType.TariffDescription tariffDescription) {
        this.tariffDescription = tariffDescription;
    }

    /**
     * Gets the value of the tariffDescription property.
     * 
     * @return
     *     possible object is
     *     {@link IncentiveTableDescriptionDataSelectorsType.TariffDescription }
     *     
     */
    public IncentiveTableDescriptionDataSelectorsType.TariffDescription getTariffDescription() {
        return tariffDescription;
    }

    /**
     * Sets the value of the tariffDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncentiveTableDescriptionDataSelectorsType.TariffDescription }
     *     
     */
    public void setTariffDescription(IncentiveTableDescriptionDataSelectorsType.TariffDescription value) {
        this.tariffDescription = value;
    }

    /**
     * Sets the value of the tariffDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncentiveTableDescriptionDataSelectorsType.TariffDescription }
     * @return
     *     The class instance
     */
    public IncentiveTableDescriptionDataSelectorsType withTariffDescription(IncentiveTableDescriptionDataSelectorsType.TariffDescription value) {
        setTariffDescription(value);
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
        if (draftCopy instanceof IncentiveTableDescriptionDataSelectorsType) {
            final IncentiveTableDescriptionDataSelectorsType copy = ((IncentiveTableDescriptionDataSelectorsType) draftCopy);
            {
                Boolean tariffDescriptionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.tariffDescription!= null));
                if (tariffDescriptionShouldBeCopiedAndSet == Boolean.TRUE) {
                    IncentiveTableDescriptionDataSelectorsType.TariffDescription sourceTariffDescription;
                    sourceTariffDescription = this.getTariffDescription();
                    IncentiveTableDescriptionDataSelectorsType.TariffDescription copyTariffDescription = ((IncentiveTableDescriptionDataSelectorsType.TariffDescription) strategy.copy(LocatorUtils.property(locator, "tariffDescription", sourceTariffDescription), sourceTariffDescription, (this.tariffDescription!= null)));
                    copy.setTariffDescription(copyTariffDescription);
                } else {
                    if (tariffDescriptionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.tariffDescription = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new IncentiveTableDescriptionDataSelectorsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final IncentiveTableDescriptionDataSelectorsType that = ((IncentiveTableDescriptionDataSelectorsType) object);
        {
            IncentiveTableDescriptionDataSelectorsType.TariffDescription leftTariffDescription;
            leftTariffDescription = this.getTariffDescription();
            IncentiveTableDescriptionDataSelectorsType.TariffDescription rightTariffDescription;
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
        return true;
    }

    @Override
    public int hashCode() {
        int currentHashCode = 1;
        {
            currentHashCode = (currentHashCode* 31);
            IncentiveTableDescriptionDataSelectorsType.TariffDescription theTariffDescription;
            theTariffDescription = this.getTariffDescription();
            if (this.tariffDescription!= null) {
                currentHashCode += theTariffDescription.hashCode();
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
            IncentiveTableDescriptionDataSelectorsType.TariffDescription theTariffDescription;
            theTariffDescription = this.getTariffDescription();
            strategy.appendField(locator, this, "tariffDescription", buffer, theTariffDescription, (this.tariffDescription!= null));
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
     *     &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}TariffDescriptionListDataSelectorsType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="tariffId" type="{http://docs.eebus.org/spine/xsd/v1}TariffIdType" minOccurs="0"/&gt;
     *         &lt;element name="scopeType" type="{http://docs.eebus.org/spine/xsd/v1}ScopeTypeType" minOccurs="0"/&gt;
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
        extends TariffDescriptionListDataSelectorsType
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
        public TariffDescription(final Long tariffId, final Long commodityId, final Long measurementId, final String scopeType) {
            super(tariffId, commodityId, measurementId, scopeType);
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
        public IncentiveTableDescriptionDataSelectorsType.TariffDescription withTariffId(Long value) {
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
        public IncentiveTableDescriptionDataSelectorsType.TariffDescription withCommodityId(Long value) {
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
        public IncentiveTableDescriptionDataSelectorsType.TariffDescription withMeasurementId(Long value) {
            setMeasurementId(value);
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
        public IncentiveTableDescriptionDataSelectorsType.TariffDescription withScopeType(String value) {
            setScopeType(value);
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
            return new IncentiveTableDescriptionDataSelectorsType.TariffDescription();
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
