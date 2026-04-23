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
 * <p>Java class for TierDataElementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TierDataElementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tierId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="timePeriod" type="{http://docs.eebus.org/spine/xsd/v1}TimePeriodElementsType" minOccurs="0"/&gt;
 *         &lt;element name="timeTableId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="activeIncentiveId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TierDataElementsType", propOrder = {
    "tierId",
    "timePeriod",
    "timeTableId",
    "activeIncentiveId"
})
@XmlSeeAlso({
    org.openmuc.jeebus.spine.xsd.v1.IncentiveTableTierElementsType.Tier.class
})
public class TierDataElementsType implements Cloneable, CopyTo, ToString
{

    protected ElementTagType tierId;
    protected TimePeriodElementsType timePeriod;
    protected ElementTagType timeTableId;
    protected ElementTagType activeIncentiveId;

    /**
     * Default no-arg constructor
     * 
     */
    public TierDataElementsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public TierDataElementsType(final ElementTagType tierId, final TimePeriodElementsType timePeriod, final ElementTagType timeTableId, final ElementTagType activeIncentiveId) {
        this.tierId = tierId;
        this.timePeriod = timePeriod;
        this.timeTableId = timeTableId;
        this.activeIncentiveId = activeIncentiveId;
    }

    /**
     * Gets the value of the tierId property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getTierId() {
        return tierId;
    }

    /**
     * Sets the value of the tierId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setTierId(ElementTagType value) {
        this.tierId = value;
    }

    /**
     * Gets the value of the timePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodElementsType }
     *     
     */
    public TimePeriodElementsType getTimePeriod() {
        return timePeriod;
    }

    /**
     * Sets the value of the timePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodElementsType }
     *     
     */
    public void setTimePeriod(TimePeriodElementsType value) {
        this.timePeriod = value;
    }

    /**
     * Gets the value of the timeTableId property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getTimeTableId() {
        return timeTableId;
    }

    /**
     * Sets the value of the timeTableId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setTimeTableId(ElementTagType value) {
        this.timeTableId = value;
    }

    /**
     * Gets the value of the activeIncentiveId property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getActiveIncentiveId() {
        return activeIncentiveId;
    }

    /**
     * Sets the value of the activeIncentiveId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setActiveIncentiveId(ElementTagType value) {
        this.activeIncentiveId = value;
    }

    /**
     * Sets the value of the tierId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public TierDataElementsType withTierId(ElementTagType value) {
        setTierId(value);
        return this;
    }

    /**
     * Sets the value of the timePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodElementsType }
     * @return
     *     The class instance
     */
    public TierDataElementsType withTimePeriod(TimePeriodElementsType value) {
        setTimePeriod(value);
        return this;
    }

    /**
     * Sets the value of the timeTableId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public TierDataElementsType withTimeTableId(ElementTagType value) {
        setTimeTableId(value);
        return this;
    }

    /**
     * Sets the value of the activeIncentiveId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public TierDataElementsType withActiveIncentiveId(ElementTagType value) {
        setActiveIncentiveId(value);
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
        if (draftCopy instanceof TierDataElementsType) {
            final TierDataElementsType copy = ((TierDataElementsType) draftCopy);
            {
                Boolean tierIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.tierId!= null));
                if (tierIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceTierId;
                    sourceTierId = this.getTierId();
                    ElementTagType copyTierId = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "tierId", sourceTierId), sourceTierId, (this.tierId!= null)));
                    copy.setTierId(copyTierId);
                } else {
                    if (tierIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.tierId = null;
                    }
                }
            }
            {
                Boolean timePeriodShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.timePeriod!= null));
                if (timePeriodShouldBeCopiedAndSet == Boolean.TRUE) {
                    TimePeriodElementsType sourceTimePeriod;
                    sourceTimePeriod = this.getTimePeriod();
                    TimePeriodElementsType copyTimePeriod = ((TimePeriodElementsType) strategy.copy(LocatorUtils.property(locator, "timePeriod", sourceTimePeriod), sourceTimePeriod, (this.timePeriod!= null)));
                    copy.setTimePeriod(copyTimePeriod);
                } else {
                    if (timePeriodShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.timePeriod = null;
                    }
                }
            }
            {
                Boolean timeTableIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.timeTableId!= null));
                if (timeTableIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceTimeTableId;
                    sourceTimeTableId = this.getTimeTableId();
                    ElementTagType copyTimeTableId = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "timeTableId", sourceTimeTableId), sourceTimeTableId, (this.timeTableId!= null)));
                    copy.setTimeTableId(copyTimeTableId);
                } else {
                    if (timeTableIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.timeTableId = null;
                    }
                }
            }
            {
                Boolean activeIncentiveIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.activeIncentiveId!= null));
                if (activeIncentiveIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceActiveIncentiveId;
                    sourceActiveIncentiveId = this.getActiveIncentiveId();
                    ElementTagType copyActiveIncentiveId = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "activeIncentiveId", sourceActiveIncentiveId), sourceActiveIncentiveId, (this.activeIncentiveId!= null)));
                    copy.setActiveIncentiveId(copyActiveIncentiveId);
                } else {
                    if (activeIncentiveIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.activeIncentiveId = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new TierDataElementsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TierDataElementsType that = ((TierDataElementsType) object);
        {
            ElementTagType leftTierId;
            leftTierId = this.getTierId();
            ElementTagType rightTierId;
            rightTierId = that.getTierId();
            if (this.tierId!= null) {
                if (that.tierId!= null) {
                    if (!leftTierId.equals(rightTierId)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.tierId!= null) {
                    return false;
                }
            }
        }
        {
            TimePeriodElementsType leftTimePeriod;
            leftTimePeriod = this.getTimePeriod();
            TimePeriodElementsType rightTimePeriod;
            rightTimePeriod = that.getTimePeriod();
            if (this.timePeriod!= null) {
                if (that.timePeriod!= null) {
                    if (!leftTimePeriod.equals(rightTimePeriod)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.timePeriod!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftTimeTableId;
            leftTimeTableId = this.getTimeTableId();
            ElementTagType rightTimeTableId;
            rightTimeTableId = that.getTimeTableId();
            if (this.timeTableId!= null) {
                if (that.timeTableId!= null) {
                    if (!leftTimeTableId.equals(rightTimeTableId)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.timeTableId!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftActiveIncentiveId;
            leftActiveIncentiveId = this.getActiveIncentiveId();
            ElementTagType rightActiveIncentiveId;
            rightActiveIncentiveId = that.getActiveIncentiveId();
            if (this.activeIncentiveId!= null) {
                if (that.activeIncentiveId!= null) {
                    if (!leftActiveIncentiveId.equals(rightActiveIncentiveId)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.activeIncentiveId!= null) {
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
            ElementTagType theTierId;
            theTierId = this.getTierId();
            if (this.tierId!= null) {
                currentHashCode += theTierId.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            TimePeriodElementsType theTimePeriod;
            theTimePeriod = this.getTimePeriod();
            if (this.timePeriod!= null) {
                currentHashCode += theTimePeriod.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theTimeTableId;
            theTimeTableId = this.getTimeTableId();
            if (this.timeTableId!= null) {
                currentHashCode += theTimeTableId.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theActiveIncentiveId;
            theActiveIncentiveId = this.getActiveIncentiveId();
            if (this.activeIncentiveId!= null) {
                currentHashCode += theActiveIncentiveId.hashCode();
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
            ElementTagType theTierId;
            theTierId = this.getTierId();
            strategy.appendField(locator, this, "tierId", buffer, theTierId, (this.tierId!= null));
        }
        {
            TimePeriodElementsType theTimePeriod;
            theTimePeriod = this.getTimePeriod();
            strategy.appendField(locator, this, "timePeriod", buffer, theTimePeriod, (this.timePeriod!= null));
        }
        {
            ElementTagType theTimeTableId;
            theTimeTableId = this.getTimeTableId();
            strategy.appendField(locator, this, "timeTableId", buffer, theTimeTableId, (this.timeTableId!= null));
        }
        {
            ElementTagType theActiveIncentiveId;
            theActiveIncentiveId = this.getActiveIncentiveId();
            strategy.appendField(locator, this, "activeIncentiveId", buffer, theActiveIncentiveId, (this.activeIncentiveId!= null));
        }
        return buffer;
    }

}
