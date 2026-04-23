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
 * <p>Java class for IncentiveTableIncentiveSlotType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IncentiveTableIncentiveSlotType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="timeInterval" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}TimeTableDataType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="timeSlotId" type="{http://docs.eebus.org/spine/xsd/v1}TimeSlotIdType" minOccurs="0"/&gt;
 *                   &lt;element name="startTime" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}AbsoluteOrRecurringTimeType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="dateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *                             &lt;element name="relative" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="endTime" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}AbsoluteOrRecurringTimeType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="dateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *                             &lt;element name="relative" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="tier" type="{http://docs.eebus.org/spine/xsd/v1}IncentiveTableTierType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IncentiveTableIncentiveSlotType", propOrder = {
    "timeInterval",
    "tier"
})
public class IncentiveTableIncentiveSlotType implements Cloneable, CopyTo, ToString
{

    protected IncentiveTableIncentiveSlotType.TimeInterval timeInterval;
    protected List<IncentiveTableTierType> tier;

    /**
     * Default no-arg constructor
     * 
     */
    public IncentiveTableIncentiveSlotType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public IncentiveTableIncentiveSlotType(final IncentiveTableIncentiveSlotType.TimeInterval timeInterval, final List<IncentiveTableTierType> tier) {
        this.timeInterval = timeInterval;
        this.tier = tier;
    }

    /**
     * Gets the value of the timeInterval property.
     * 
     * @return
     *     possible object is
     *     {@link IncentiveTableIncentiveSlotType.TimeInterval }
     *     
     */
    public IncentiveTableIncentiveSlotType.TimeInterval getTimeInterval() {
        return timeInterval;
    }

    /**
     * Sets the value of the timeInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncentiveTableIncentiveSlotType.TimeInterval }
     *     
     */
    public void setTimeInterval(IncentiveTableIncentiveSlotType.TimeInterval value) {
        this.timeInterval = value;
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
     * {@link IncentiveTableTierType }
     * 
     * 
     */
    public List<IncentiveTableTierType> getTier() {
        if (tier == null) {
            tier = new ArrayList<IncentiveTableTierType>();
        }
        return this.tier;
    }

    /**
     * Sets the value of the timeInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncentiveTableIncentiveSlotType.TimeInterval }
     * @return
     *     The class instance
     */
    public IncentiveTableIncentiveSlotType withTimeInterval(IncentiveTableIncentiveSlotType.TimeInterval value) {
        setTimeInterval(value);
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
    public IncentiveTableIncentiveSlotType withTier(IncentiveTableTierType... values) {
        if (values!= null) {
            for (IncentiveTableTierType value: values) {
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
    public IncentiveTableIncentiveSlotType withTier(Collection<IncentiveTableTierType> values) {
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
        if (draftCopy instanceof IncentiveTableIncentiveSlotType) {
            final IncentiveTableIncentiveSlotType copy = ((IncentiveTableIncentiveSlotType) draftCopy);
            {
                Boolean timeIntervalShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.timeInterval!= null));
                if (timeIntervalShouldBeCopiedAndSet == Boolean.TRUE) {
                    IncentiveTableIncentiveSlotType.TimeInterval sourceTimeInterval;
                    sourceTimeInterval = this.getTimeInterval();
                    IncentiveTableIncentiveSlotType.TimeInterval copyTimeInterval = ((IncentiveTableIncentiveSlotType.TimeInterval) strategy.copy(LocatorUtils.property(locator, "timeInterval", sourceTimeInterval), sourceTimeInterval, (this.timeInterval!= null)));
                    copy.setTimeInterval(copyTimeInterval);
                } else {
                    if (timeIntervalShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.timeInterval = null;
                    }
                }
            }
            {
                Boolean tierShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.tier!= null)&&(!this.tier.isEmpty())));
                if (tierShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<IncentiveTableTierType> sourceTier;
                    sourceTier = (((this.tier!= null)&&(!this.tier.isEmpty()))?this.getTier():null);
                    @SuppressWarnings("unchecked")
                    List<IncentiveTableTierType> copyTier = ((List<IncentiveTableTierType> ) strategy.copy(LocatorUtils.property(locator, "tier", sourceTier), sourceTier, ((this.tier!= null)&&(!this.tier.isEmpty()))));
                    copy.tier = null;
                    if (copyTier!= null) {
                        List<IncentiveTableTierType> uniqueTierl = copy.getTier();
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
        return new IncentiveTableIncentiveSlotType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final IncentiveTableIncentiveSlotType that = ((IncentiveTableIncentiveSlotType) object);
        {
            IncentiveTableIncentiveSlotType.TimeInterval leftTimeInterval;
            leftTimeInterval = this.getTimeInterval();
            IncentiveTableIncentiveSlotType.TimeInterval rightTimeInterval;
            rightTimeInterval = that.getTimeInterval();
            if (this.timeInterval!= null) {
                if (that.timeInterval!= null) {
                    if (!leftTimeInterval.equals(rightTimeInterval)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.timeInterval!= null) {
                    return false;
                }
            }
        }
        {
            List<IncentiveTableTierType> leftTier;
            leftTier = (((this.tier!= null)&&(!this.tier.isEmpty()))?this.getTier():null);
            List<IncentiveTableTierType> rightTier;
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
            IncentiveTableIncentiveSlotType.TimeInterval theTimeInterval;
            theTimeInterval = this.getTimeInterval();
            if (this.timeInterval!= null) {
                currentHashCode += theTimeInterval.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            List<IncentiveTableTierType> theTier;
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
            IncentiveTableIncentiveSlotType.TimeInterval theTimeInterval;
            theTimeInterval = this.getTimeInterval();
            strategy.appendField(locator, this, "timeInterval", buffer, theTimeInterval, (this.timeInterval!= null));
        }
        {
            List<IncentiveTableTierType> theTier;
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
     *     &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}TimeTableDataType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="timeSlotId" type="{http://docs.eebus.org/spine/xsd/v1}TimeSlotIdType" minOccurs="0"/&gt;
     *         &lt;element name="startTime" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}AbsoluteOrRecurringTimeType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="dateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
     *                   &lt;element name="relative" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="endTime" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}AbsoluteOrRecurringTimeType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="dateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
     *                   &lt;element name="relative" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
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
    @XmlType(name = "")
    public static class TimeInterval
        extends TimeTableDataType
        implements Cloneable, CopyTo, ToString
    {


        /**
         * Default no-arg constructor
         * 
         */
        public TimeInterval() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public TimeInterval(final Long timeTableId, final Long timeSlotId, final RecurrenceInformationType recurrenceInformation, final AbsoluteOrRecurringTimeType startTime, final AbsoluteOrRecurringTimeType endTime) {
            super(timeTableId, timeSlotId, recurrenceInformation, startTime, endTime);
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
        @Override
        public IncentiveTableIncentiveSlotType.TimeInterval withTimeTableId(Long value) {
            setTimeTableId(value);
            return this;
        }

        /**
         * Sets the value of the timeSlotId property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         * @return
         *     The class instance
         */
        @Override
        public IncentiveTableIncentiveSlotType.TimeInterval withTimeSlotId(Long value) {
            setTimeSlotId(value);
            return this;
        }

        /**
         * Sets the value of the recurrenceInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link RecurrenceInformationType }
         * @return
         *     The class instance
         */
        @Override
        public IncentiveTableIncentiveSlotType.TimeInterval withRecurrenceInformation(RecurrenceInformationType value) {
            setRecurrenceInformation(value);
            return this;
        }

        /**
         * Sets the value of the startTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link AbsoluteOrRecurringTimeType }
         * @return
         *     The class instance
         */
        @Override
        public IncentiveTableIncentiveSlotType.TimeInterval withStartTime(AbsoluteOrRecurringTimeType value) {
            setStartTime(value);
            return this;
        }

        /**
         * Sets the value of the endTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link AbsoluteOrRecurringTimeType }
         * @return
         *     The class instance
         */
        @Override
        public IncentiveTableIncentiveSlotType.TimeInterval withEndTime(AbsoluteOrRecurringTimeType value) {
            setEndTime(value);
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
            return new IncentiveTableIncentiveSlotType.TimeInterval();
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
