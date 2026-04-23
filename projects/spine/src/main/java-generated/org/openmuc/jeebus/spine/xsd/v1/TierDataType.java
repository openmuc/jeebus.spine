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
import jakarta.xml.bind.annotation.XmlElement;
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
 * <p>Java class for TierDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TierDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tierId" type="{http://docs.eebus.org/spine/xsd/v1}TierIdType" minOccurs="0"/&gt;
 *         &lt;element name="timePeriod" type="{http://docs.eebus.org/spine/xsd/v1}TimePeriodType" minOccurs="0"/&gt;
 *         &lt;element name="timeTableId" type="{http://docs.eebus.org/spine/xsd/v1}TimeTableIdType" minOccurs="0"/&gt;
 *         &lt;element name="activeIncentiveId" type="{http://docs.eebus.org/spine/xsd/v1}IncentiveIdType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TierDataType", propOrder = {
    "tierId",
    "timePeriod",
    "timeTableId",
    "activeIncentiveId"
})
@XmlSeeAlso({
    org.openmuc.jeebus.spine.xsd.v1.IncentiveTableTierType.Tier.class
})
public class TierDataType implements Cloneable, CopyTo, ToString
{

    @XmlSchemaType(name = "unsignedInt")
    protected Long tierId;
    protected TimePeriodType timePeriod;
    @XmlSchemaType(name = "unsignedInt")
    protected Long timeTableId;
    @XmlElement(type = Long.class)
    @XmlSchemaType(name = "unsignedInt")
    protected List<Long> activeIncentiveId;

    /**
     * Default no-arg constructor
     * 
     */
    public TierDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public TierDataType(final Long tierId, final TimePeriodType timePeriod, final Long timeTableId, final List<Long> activeIncentiveId) {
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
     *     {@link Long }
     *     
     */
    public Long getTierId() {
        return tierId;
    }

    /**
     * Sets the value of the tierId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTierId(Long value) {
        this.tierId = value;
    }

    /**
     * Gets the value of the timePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodType }
     *     
     */
    public TimePeriodType getTimePeriod() {
        return timePeriod;
    }

    /**
     * Sets the value of the timePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodType }
     *     
     */
    public void setTimePeriod(TimePeriodType value) {
        this.timePeriod = value;
    }

    /**
     * Gets the value of the timeTableId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTimeTableId() {
        return timeTableId;
    }

    /**
     * Sets the value of the timeTableId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTimeTableId(Long value) {
        this.timeTableId = value;
    }

    /**
     * Gets the value of the activeIncentiveId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the activeIncentiveId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActiveIncentiveId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getActiveIncentiveId() {
        if (activeIncentiveId == null) {
            activeIncentiveId = new ArrayList<Long>();
        }
        return this.activeIncentiveId;
    }

    /**
     * Sets the value of the tierId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     * @return
     *     The class instance
     */
    public TierDataType withTierId(Long value) {
        setTierId(value);
        return this;
    }

    /**
     * Sets the value of the timePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodType }
     * @return
     *     The class instance
     */
    public TierDataType withTimePeriod(TimePeriodType value) {
        setTimePeriod(value);
        return this;
    }

    /**
     * Sets the value of the timeTableId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     * @return
     *     The class instance
     */
    public TierDataType withTimeTableId(Long value) {
        setTimeTableId(value);
        return this;
    }

    /**
     * Adds objects to the list of ActiveIncentiveId using add method
     * 
     * @param values
     *     objects to add to the list ActiveIncentiveId
     * @return
     *     The class instance
     */
    public TierDataType withActiveIncentiveId(Long... values) {
        if (values!= null) {
            for (Long value: values) {
                getActiveIncentiveId().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of ActiveIncentiveId using addAll method
     * 
     * @param values
     *     objects to add to the list ActiveIncentiveId
     * @return
     *     The class instance
     */
    public TierDataType withActiveIncentiveId(Collection<Long> values) {
        if (values!= null) {
            getActiveIncentiveId().addAll(values);
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
        if (draftCopy instanceof TierDataType) {
            final TierDataType copy = ((TierDataType) draftCopy);
            {
                Boolean tierIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.tierId!= null));
                if (tierIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceTierId;
                    sourceTierId = this.getTierId();
                    Long copyTierId = ((Long) strategy.copy(LocatorUtils.property(locator, "tierId", sourceTierId), sourceTierId, (this.tierId!= null)));
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
                    TimePeriodType sourceTimePeriod;
                    sourceTimePeriod = this.getTimePeriod();
                    TimePeriodType copyTimePeriod = ((TimePeriodType) strategy.copy(LocatorUtils.property(locator, "timePeriod", sourceTimePeriod), sourceTimePeriod, (this.timePeriod!= null)));
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
                    Long sourceTimeTableId;
                    sourceTimeTableId = this.getTimeTableId();
                    Long copyTimeTableId = ((Long) strategy.copy(LocatorUtils.property(locator, "timeTableId", sourceTimeTableId), sourceTimeTableId, (this.timeTableId!= null)));
                    copy.setTimeTableId(copyTimeTableId);
                } else {
                    if (timeTableIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.timeTableId = null;
                    }
                }
            }
            {
                Boolean activeIncentiveIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.activeIncentiveId!= null)&&(!this.activeIncentiveId.isEmpty())));
                if (activeIncentiveIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<Long> sourceActiveIncentiveId;
                    sourceActiveIncentiveId = (((this.activeIncentiveId!= null)&&(!this.activeIncentiveId.isEmpty()))?this.getActiveIncentiveId():null);
                    @SuppressWarnings("unchecked")
                    List<Long> copyActiveIncentiveId = ((List<Long> ) strategy.copy(LocatorUtils.property(locator, "activeIncentiveId", sourceActiveIncentiveId), sourceActiveIncentiveId, ((this.activeIncentiveId!= null)&&(!this.activeIncentiveId.isEmpty()))));
                    copy.activeIncentiveId = null;
                    if (copyActiveIncentiveId!= null) {
                        List<Long> uniqueActiveIncentiveIdl = copy.getActiveIncentiveId();
                        uniqueActiveIncentiveIdl.addAll(copyActiveIncentiveId);
                    }
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
        return new TierDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TierDataType that = ((TierDataType) object);
        {
            Long leftTierId;
            leftTierId = this.getTierId();
            Long rightTierId;
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
            TimePeriodType leftTimePeriod;
            leftTimePeriod = this.getTimePeriod();
            TimePeriodType rightTimePeriod;
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
            Long leftTimeTableId;
            leftTimeTableId = this.getTimeTableId();
            Long rightTimeTableId;
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
            List<Long> leftActiveIncentiveId;
            leftActiveIncentiveId = (((this.activeIncentiveId!= null)&&(!this.activeIncentiveId.isEmpty()))?this.getActiveIncentiveId():null);
            List<Long> rightActiveIncentiveId;
            rightActiveIncentiveId = (((that.activeIncentiveId!= null)&&(!that.activeIncentiveId.isEmpty()))?that.getActiveIncentiveId():null);
            if ((this.activeIncentiveId!= null)&&(!this.activeIncentiveId.isEmpty())) {
                if ((that.activeIncentiveId!= null)&&(!that.activeIncentiveId.isEmpty())) {
                    if (!leftActiveIncentiveId.equals(rightActiveIncentiveId)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.activeIncentiveId!= null)&&(!that.activeIncentiveId.isEmpty())) {
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
            Long theTierId;
            theTierId = this.getTierId();
            if (this.tierId!= null) {
                currentHashCode += theTierId.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            TimePeriodType theTimePeriod;
            theTimePeriod = this.getTimePeriod();
            if (this.timePeriod!= null) {
                currentHashCode += theTimePeriod.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            Long theTimeTableId;
            theTimeTableId = this.getTimeTableId();
            if (this.timeTableId!= null) {
                currentHashCode += theTimeTableId.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            List<Long> theActiveIncentiveId;
            theActiveIncentiveId = (((this.activeIncentiveId!= null)&&(!this.activeIncentiveId.isEmpty()))?this.getActiveIncentiveId():null);
            if ((this.activeIncentiveId!= null)&&(!this.activeIncentiveId.isEmpty())) {
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
            Long theTierId;
            theTierId = this.getTierId();
            strategy.appendField(locator, this, "tierId", buffer, theTierId, (this.tierId!= null));
        }
        {
            TimePeriodType theTimePeriod;
            theTimePeriod = this.getTimePeriod();
            strategy.appendField(locator, this, "timePeriod", buffer, theTimePeriod, (this.timePeriod!= null));
        }
        {
            Long theTimeTableId;
            theTimeTableId = this.getTimeTableId();
            strategy.appendField(locator, this, "timeTableId", buffer, theTimeTableId, (this.timeTableId!= null));
        }
        {
            List<Long> theActiveIncentiveId;
            theActiveIncentiveId = (((this.activeIncentiveId!= null)&&(!this.activeIncentiveId.isEmpty()))?this.getActiveIncentiveId():null);
            strategy.appendField(locator, this, "activeIncentiveId", buffer, theActiveIncentiveId, ((this.activeIncentiveId!= null)&&(!this.activeIncentiveId.isEmpty())));
        }
        return buffer;
    }

}
