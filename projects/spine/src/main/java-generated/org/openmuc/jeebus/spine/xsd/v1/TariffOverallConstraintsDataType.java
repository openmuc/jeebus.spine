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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import org.jvnet.jaxb.lang.CopyStrategy;
import org.jvnet.jaxb.lang.CopyTo;
import org.jvnet.jaxb.lang.JAXBCopyStrategy;
import org.jvnet.jaxb.lang.ToString;
import org.jvnet.jaxb.lang.ToStringStrategy;
import org.jvnet.jaxb.locator.ObjectLocator;
import org.jvnet.jaxb.locator.util.LocatorUtils;
import org.openmuc.jeebus.spine.impl.parser.CustomToStringStrategy;


/**
 * <p>Java class for TariffOverallConstraintsDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TariffOverallConstraintsDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="maxTariffCount" type="{http://docs.eebus.org/spine/xsd/v1}TariffCountType" minOccurs="0"/&gt;
 *         &lt;element name="maxBoundaryCount" type="{http://docs.eebus.org/spine/xsd/v1}TierBoundaryCountType" minOccurs="0"/&gt;
 *         &lt;element name="maxTierCount" type="{http://docs.eebus.org/spine/xsd/v1}TierCountType" minOccurs="0"/&gt;
 *         &lt;element name="maxIncentiveCount" type="{http://docs.eebus.org/spine/xsd/v1}IncentiveCountType" minOccurs="0"/&gt;
 *         &lt;element name="maxBoundariesPerTariff" type="{http://docs.eebus.org/spine/xsd/v1}TierBoundaryCountType" minOccurs="0"/&gt;
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
@XmlType(name = "TariffOverallConstraintsDataType", propOrder = {
    "maxTariffCount",
    "maxBoundaryCount",
    "maxTierCount",
    "maxIncentiveCount",
    "maxBoundariesPerTariff",
    "maxTiersPerTariff",
    "maxBoundariesPerTier",
    "maxIncentivesPerTier"
})
@XmlSeeAlso({
    org.openmuc.jeebus.spine.xsd.v1.IncentiveTableConstraintsType.TariffConstraints.class
})
public class TariffOverallConstraintsDataType implements Cloneable, CopyTo, ToString
{

    @XmlSchemaType(name = "unsignedInt")
    protected Long maxTariffCount;
    @XmlSchemaType(name = "unsignedInt")
    protected Long maxBoundaryCount;
    @XmlSchemaType(name = "unsignedInt")
    protected Long maxTierCount;
    @XmlSchemaType(name = "unsignedInt")
    protected Long maxIncentiveCount;
    @XmlSchemaType(name = "unsignedInt")
    protected Long maxBoundariesPerTariff;
    @XmlSchemaType(name = "unsignedInt")
    protected Long maxTiersPerTariff;
    @XmlSchemaType(name = "unsignedInt")
    protected Long maxBoundariesPerTier;
    @XmlSchemaType(name = "unsignedInt")
    protected Long maxIncentivesPerTier;

    /**
     * Default no-arg constructor
     * 
     */
    public TariffOverallConstraintsDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public TariffOverallConstraintsDataType(final Long maxTariffCount, final Long maxBoundaryCount, final Long maxTierCount, final Long maxIncentiveCount, final Long maxBoundariesPerTariff, final Long maxTiersPerTariff, final Long maxBoundariesPerTier, final Long maxIncentivesPerTier) {
        this.maxTariffCount = maxTariffCount;
        this.maxBoundaryCount = maxBoundaryCount;
        this.maxTierCount = maxTierCount;
        this.maxIncentiveCount = maxIncentiveCount;
        this.maxBoundariesPerTariff = maxBoundariesPerTariff;
        this.maxTiersPerTariff = maxTiersPerTariff;
        this.maxBoundariesPerTier = maxBoundariesPerTier;
        this.maxIncentivesPerTier = maxIncentivesPerTier;
    }

    /**
     * Gets the value of the maxTariffCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxTariffCount() {
        return maxTariffCount;
    }

    /**
     * Sets the value of the maxTariffCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxTariffCount(Long value) {
        this.maxTariffCount = value;
    }

    /**
     * Gets the value of the maxBoundaryCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxBoundaryCount() {
        return maxBoundaryCount;
    }

    /**
     * Sets the value of the maxBoundaryCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxBoundaryCount(Long value) {
        this.maxBoundaryCount = value;
    }

    /**
     * Gets the value of the maxTierCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxTierCount() {
        return maxTierCount;
    }

    /**
     * Sets the value of the maxTierCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxTierCount(Long value) {
        this.maxTierCount = value;
    }

    /**
     * Gets the value of the maxIncentiveCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxIncentiveCount() {
        return maxIncentiveCount;
    }

    /**
     * Sets the value of the maxIncentiveCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxIncentiveCount(Long value) {
        this.maxIncentiveCount = value;
    }

    /**
     * Gets the value of the maxBoundariesPerTariff property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxBoundariesPerTariff() {
        return maxBoundariesPerTariff;
    }

    /**
     * Sets the value of the maxBoundariesPerTariff property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxBoundariesPerTariff(Long value) {
        this.maxBoundariesPerTariff = value;
    }

    /**
     * Gets the value of the maxTiersPerTariff property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxTiersPerTariff() {
        return maxTiersPerTariff;
    }

    /**
     * Sets the value of the maxTiersPerTariff property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxTiersPerTariff(Long value) {
        this.maxTiersPerTariff = value;
    }

    /**
     * Gets the value of the maxBoundariesPerTier property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxBoundariesPerTier() {
        return maxBoundariesPerTier;
    }

    /**
     * Sets the value of the maxBoundariesPerTier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxBoundariesPerTier(Long value) {
        this.maxBoundariesPerTier = value;
    }

    /**
     * Gets the value of the maxIncentivesPerTier property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxIncentivesPerTier() {
        return maxIncentivesPerTier;
    }

    /**
     * Sets the value of the maxIncentivesPerTier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxIncentivesPerTier(Long value) {
        this.maxIncentivesPerTier = value;
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
    public TariffOverallConstraintsDataType withMaxTariffCount(Long value) {
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
    public TariffOverallConstraintsDataType withMaxBoundaryCount(Long value) {
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
    public TariffOverallConstraintsDataType withMaxTierCount(Long value) {
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
    public TariffOverallConstraintsDataType withMaxIncentiveCount(Long value) {
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
    public TariffOverallConstraintsDataType withMaxBoundariesPerTariff(Long value) {
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
    public TariffOverallConstraintsDataType withMaxTiersPerTariff(Long value) {
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
    public TariffOverallConstraintsDataType withMaxBoundariesPerTier(Long value) {
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
    public TariffOverallConstraintsDataType withMaxIncentivesPerTier(Long value) {
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
        if (draftCopy instanceof TariffOverallConstraintsDataType) {
            final TariffOverallConstraintsDataType copy = ((TariffOverallConstraintsDataType) draftCopy);
            {
                Boolean maxTariffCountShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.maxTariffCount!= null));
                if (maxTariffCountShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceMaxTariffCount;
                    sourceMaxTariffCount = this.getMaxTariffCount();
                    Long copyMaxTariffCount = ((Long) strategy.copy(LocatorUtils.property(locator, "maxTariffCount", sourceMaxTariffCount), sourceMaxTariffCount, (this.maxTariffCount!= null)));
                    copy.setMaxTariffCount(copyMaxTariffCount);
                } else {
                    if (maxTariffCountShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.maxTariffCount = null;
                    }
                }
            }
            {
                Boolean maxBoundaryCountShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.maxBoundaryCount!= null));
                if (maxBoundaryCountShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceMaxBoundaryCount;
                    sourceMaxBoundaryCount = this.getMaxBoundaryCount();
                    Long copyMaxBoundaryCount = ((Long) strategy.copy(LocatorUtils.property(locator, "maxBoundaryCount", sourceMaxBoundaryCount), sourceMaxBoundaryCount, (this.maxBoundaryCount!= null)));
                    copy.setMaxBoundaryCount(copyMaxBoundaryCount);
                } else {
                    if (maxBoundaryCountShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.maxBoundaryCount = null;
                    }
                }
            }
            {
                Boolean maxTierCountShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.maxTierCount!= null));
                if (maxTierCountShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceMaxTierCount;
                    sourceMaxTierCount = this.getMaxTierCount();
                    Long copyMaxTierCount = ((Long) strategy.copy(LocatorUtils.property(locator, "maxTierCount", sourceMaxTierCount), sourceMaxTierCount, (this.maxTierCount!= null)));
                    copy.setMaxTierCount(copyMaxTierCount);
                } else {
                    if (maxTierCountShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.maxTierCount = null;
                    }
                }
            }
            {
                Boolean maxIncentiveCountShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.maxIncentiveCount!= null));
                if (maxIncentiveCountShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceMaxIncentiveCount;
                    sourceMaxIncentiveCount = this.getMaxIncentiveCount();
                    Long copyMaxIncentiveCount = ((Long) strategy.copy(LocatorUtils.property(locator, "maxIncentiveCount", sourceMaxIncentiveCount), sourceMaxIncentiveCount, (this.maxIncentiveCount!= null)));
                    copy.setMaxIncentiveCount(copyMaxIncentiveCount);
                } else {
                    if (maxIncentiveCountShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.maxIncentiveCount = null;
                    }
                }
            }
            {
                Boolean maxBoundariesPerTariffShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.maxBoundariesPerTariff!= null));
                if (maxBoundariesPerTariffShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceMaxBoundariesPerTariff;
                    sourceMaxBoundariesPerTariff = this.getMaxBoundariesPerTariff();
                    Long copyMaxBoundariesPerTariff = ((Long) strategy.copy(LocatorUtils.property(locator, "maxBoundariesPerTariff", sourceMaxBoundariesPerTariff), sourceMaxBoundariesPerTariff, (this.maxBoundariesPerTariff!= null)));
                    copy.setMaxBoundariesPerTariff(copyMaxBoundariesPerTariff);
                } else {
                    if (maxBoundariesPerTariffShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.maxBoundariesPerTariff = null;
                    }
                }
            }
            {
                Boolean maxTiersPerTariffShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.maxTiersPerTariff!= null));
                if (maxTiersPerTariffShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceMaxTiersPerTariff;
                    sourceMaxTiersPerTariff = this.getMaxTiersPerTariff();
                    Long copyMaxTiersPerTariff = ((Long) strategy.copy(LocatorUtils.property(locator, "maxTiersPerTariff", sourceMaxTiersPerTariff), sourceMaxTiersPerTariff, (this.maxTiersPerTariff!= null)));
                    copy.setMaxTiersPerTariff(copyMaxTiersPerTariff);
                } else {
                    if (maxTiersPerTariffShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.maxTiersPerTariff = null;
                    }
                }
            }
            {
                Boolean maxBoundariesPerTierShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.maxBoundariesPerTier!= null));
                if (maxBoundariesPerTierShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceMaxBoundariesPerTier;
                    sourceMaxBoundariesPerTier = this.getMaxBoundariesPerTier();
                    Long copyMaxBoundariesPerTier = ((Long) strategy.copy(LocatorUtils.property(locator, "maxBoundariesPerTier", sourceMaxBoundariesPerTier), sourceMaxBoundariesPerTier, (this.maxBoundariesPerTier!= null)));
                    copy.setMaxBoundariesPerTier(copyMaxBoundariesPerTier);
                } else {
                    if (maxBoundariesPerTierShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.maxBoundariesPerTier = null;
                    }
                }
            }
            {
                Boolean maxIncentivesPerTierShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.maxIncentivesPerTier!= null));
                if (maxIncentivesPerTierShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceMaxIncentivesPerTier;
                    sourceMaxIncentivesPerTier = this.getMaxIncentivesPerTier();
                    Long copyMaxIncentivesPerTier = ((Long) strategy.copy(LocatorUtils.property(locator, "maxIncentivesPerTier", sourceMaxIncentivesPerTier), sourceMaxIncentivesPerTier, (this.maxIncentivesPerTier!= null)));
                    copy.setMaxIncentivesPerTier(copyMaxIncentivesPerTier);
                } else {
                    if (maxIncentivesPerTierShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.maxIncentivesPerTier = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new TariffOverallConstraintsDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TariffOverallConstraintsDataType that = ((TariffOverallConstraintsDataType) object);
        {
            Long leftMaxTariffCount;
            leftMaxTariffCount = this.getMaxTariffCount();
            Long rightMaxTariffCount;
            rightMaxTariffCount = that.getMaxTariffCount();
            if (this.maxTariffCount!= null) {
                if (that.maxTariffCount!= null) {
                    if (!leftMaxTariffCount.equals(rightMaxTariffCount)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.maxTariffCount!= null) {
                    return false;
                }
            }
        }
        {
            Long leftMaxBoundaryCount;
            leftMaxBoundaryCount = this.getMaxBoundaryCount();
            Long rightMaxBoundaryCount;
            rightMaxBoundaryCount = that.getMaxBoundaryCount();
            if (this.maxBoundaryCount!= null) {
                if (that.maxBoundaryCount!= null) {
                    if (!leftMaxBoundaryCount.equals(rightMaxBoundaryCount)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.maxBoundaryCount!= null) {
                    return false;
                }
            }
        }
        {
            Long leftMaxTierCount;
            leftMaxTierCount = this.getMaxTierCount();
            Long rightMaxTierCount;
            rightMaxTierCount = that.getMaxTierCount();
            if (this.maxTierCount!= null) {
                if (that.maxTierCount!= null) {
                    if (!leftMaxTierCount.equals(rightMaxTierCount)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.maxTierCount!= null) {
                    return false;
                }
            }
        }
        {
            Long leftMaxIncentiveCount;
            leftMaxIncentiveCount = this.getMaxIncentiveCount();
            Long rightMaxIncentiveCount;
            rightMaxIncentiveCount = that.getMaxIncentiveCount();
            if (this.maxIncentiveCount!= null) {
                if (that.maxIncentiveCount!= null) {
                    if (!leftMaxIncentiveCount.equals(rightMaxIncentiveCount)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.maxIncentiveCount!= null) {
                    return false;
                }
            }
        }
        {
            Long leftMaxBoundariesPerTariff;
            leftMaxBoundariesPerTariff = this.getMaxBoundariesPerTariff();
            Long rightMaxBoundariesPerTariff;
            rightMaxBoundariesPerTariff = that.getMaxBoundariesPerTariff();
            if (this.maxBoundariesPerTariff!= null) {
                if (that.maxBoundariesPerTariff!= null) {
                    if (!leftMaxBoundariesPerTariff.equals(rightMaxBoundariesPerTariff)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.maxBoundariesPerTariff!= null) {
                    return false;
                }
            }
        }
        {
            Long leftMaxTiersPerTariff;
            leftMaxTiersPerTariff = this.getMaxTiersPerTariff();
            Long rightMaxTiersPerTariff;
            rightMaxTiersPerTariff = that.getMaxTiersPerTariff();
            if (this.maxTiersPerTariff!= null) {
                if (that.maxTiersPerTariff!= null) {
                    if (!leftMaxTiersPerTariff.equals(rightMaxTiersPerTariff)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.maxTiersPerTariff!= null) {
                    return false;
                }
            }
        }
        {
            Long leftMaxBoundariesPerTier;
            leftMaxBoundariesPerTier = this.getMaxBoundariesPerTier();
            Long rightMaxBoundariesPerTier;
            rightMaxBoundariesPerTier = that.getMaxBoundariesPerTier();
            if (this.maxBoundariesPerTier!= null) {
                if (that.maxBoundariesPerTier!= null) {
                    if (!leftMaxBoundariesPerTier.equals(rightMaxBoundariesPerTier)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.maxBoundariesPerTier!= null) {
                    return false;
                }
            }
        }
        {
            Long leftMaxIncentivesPerTier;
            leftMaxIncentivesPerTier = this.getMaxIncentivesPerTier();
            Long rightMaxIncentivesPerTier;
            rightMaxIncentivesPerTier = that.getMaxIncentivesPerTier();
            if (this.maxIncentivesPerTier!= null) {
                if (that.maxIncentivesPerTier!= null) {
                    if (!leftMaxIncentivesPerTier.equals(rightMaxIncentivesPerTier)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.maxIncentivesPerTier!= null) {
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
            Long theMaxTariffCount;
            theMaxTariffCount = this.getMaxTariffCount();
            if (this.maxTariffCount!= null) {
                currentHashCode += theMaxTariffCount.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            Long theMaxBoundaryCount;
            theMaxBoundaryCount = this.getMaxBoundaryCount();
            if (this.maxBoundaryCount!= null) {
                currentHashCode += theMaxBoundaryCount.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            Long theMaxTierCount;
            theMaxTierCount = this.getMaxTierCount();
            if (this.maxTierCount!= null) {
                currentHashCode += theMaxTierCount.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            Long theMaxIncentiveCount;
            theMaxIncentiveCount = this.getMaxIncentiveCount();
            if (this.maxIncentiveCount!= null) {
                currentHashCode += theMaxIncentiveCount.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            Long theMaxBoundariesPerTariff;
            theMaxBoundariesPerTariff = this.getMaxBoundariesPerTariff();
            if (this.maxBoundariesPerTariff!= null) {
                currentHashCode += theMaxBoundariesPerTariff.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            Long theMaxTiersPerTariff;
            theMaxTiersPerTariff = this.getMaxTiersPerTariff();
            if (this.maxTiersPerTariff!= null) {
                currentHashCode += theMaxTiersPerTariff.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            Long theMaxBoundariesPerTier;
            theMaxBoundariesPerTier = this.getMaxBoundariesPerTier();
            if (this.maxBoundariesPerTier!= null) {
                currentHashCode += theMaxBoundariesPerTier.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            Long theMaxIncentivesPerTier;
            theMaxIncentivesPerTier = this.getMaxIncentivesPerTier();
            if (this.maxIncentivesPerTier!= null) {
                currentHashCode += theMaxIncentivesPerTier.hashCode();
            }
        }
        return currentHashCode;
    }

    @Override
    public String toString() {
        final ToStringStrategy strategy = new CustomToStringStrategy();
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
            Long theMaxTariffCount;
            theMaxTariffCount = this.getMaxTariffCount();
            strategy.appendField(locator, this, "maxTariffCount", buffer, theMaxTariffCount, (this.maxTariffCount!= null));
        }
        {
            Long theMaxBoundaryCount;
            theMaxBoundaryCount = this.getMaxBoundaryCount();
            strategy.appendField(locator, this, "maxBoundaryCount", buffer, theMaxBoundaryCount, (this.maxBoundaryCount!= null));
        }
        {
            Long theMaxTierCount;
            theMaxTierCount = this.getMaxTierCount();
            strategy.appendField(locator, this, "maxTierCount", buffer, theMaxTierCount, (this.maxTierCount!= null));
        }
        {
            Long theMaxIncentiveCount;
            theMaxIncentiveCount = this.getMaxIncentiveCount();
            strategy.appendField(locator, this, "maxIncentiveCount", buffer, theMaxIncentiveCount, (this.maxIncentiveCount!= null));
        }
        {
            Long theMaxBoundariesPerTariff;
            theMaxBoundariesPerTariff = this.getMaxBoundariesPerTariff();
            strategy.appendField(locator, this, "maxBoundariesPerTariff", buffer, theMaxBoundariesPerTariff, (this.maxBoundariesPerTariff!= null));
        }
        {
            Long theMaxTiersPerTariff;
            theMaxTiersPerTariff = this.getMaxTiersPerTariff();
            strategy.appendField(locator, this, "maxTiersPerTariff", buffer, theMaxTiersPerTariff, (this.maxTiersPerTariff!= null));
        }
        {
            Long theMaxBoundariesPerTier;
            theMaxBoundariesPerTier = this.getMaxBoundariesPerTier();
            strategy.appendField(locator, this, "maxBoundariesPerTier", buffer, theMaxBoundariesPerTier, (this.maxBoundariesPerTier!= null));
        }
        {
            Long theMaxIncentivesPerTier;
            theMaxIncentivesPerTier = this.getMaxIncentivesPerTier();
            strategy.appendField(locator, this, "maxIncentivesPerTier", buffer, theMaxIncentivesPerTier, (this.maxIncentivesPerTier!= null));
        }
        return buffer;
    }

}
