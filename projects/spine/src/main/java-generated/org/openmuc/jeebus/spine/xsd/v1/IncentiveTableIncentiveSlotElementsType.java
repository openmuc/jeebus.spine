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
 * <p>Java class for IncentiveTableIncentiveSlotElementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IncentiveTableIncentiveSlotElementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="timeInterval" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}TimeTableDataElementsType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="timeSlotId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *                   &lt;element name="startTime" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}AbsoluteOrRecurringTimeElementsType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="dateTime" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *                             &lt;element name="relative" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="endTime" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}AbsoluteOrRecurringTimeElementsType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="dateTime" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *                             &lt;element name="relative" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
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
 *         &lt;element name="tier" type="{http://docs.eebus.org/spine/xsd/v1}IncentiveTableTierElementsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IncentiveTableIncentiveSlotElementsType", propOrder = {
    "timeInterval",
    "tier"
})
public class IncentiveTableIncentiveSlotElementsType implements Cloneable, CopyTo, ToString
{

    protected IncentiveTableIncentiveSlotElementsType.TimeInterval timeInterval;
    protected IncentiveTableTierElementsType tier;

    /**
     * Default no-arg constructor
     * 
     */
    public IncentiveTableIncentiveSlotElementsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public IncentiveTableIncentiveSlotElementsType(final IncentiveTableIncentiveSlotElementsType.TimeInterval timeInterval, final IncentiveTableTierElementsType tier) {
        this.timeInterval = timeInterval;
        this.tier = tier;
    }

    /**
     * Gets the value of the timeInterval property.
     * 
     * @return
     *     possible object is
     *     {@link IncentiveTableIncentiveSlotElementsType.TimeInterval }
     *     
     */
    public IncentiveTableIncentiveSlotElementsType.TimeInterval getTimeInterval() {
        return timeInterval;
    }

    /**
     * Sets the value of the timeInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncentiveTableIncentiveSlotElementsType.TimeInterval }
     *     
     */
    public void setTimeInterval(IncentiveTableIncentiveSlotElementsType.TimeInterval value) {
        this.timeInterval = value;
    }

    /**
     * Gets the value of the tier property.
     * 
     * @return
     *     possible object is
     *     {@link IncentiveTableTierElementsType }
     *     
     */
    public IncentiveTableTierElementsType getTier() {
        return tier;
    }

    /**
     * Sets the value of the tier property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncentiveTableTierElementsType }
     *     
     */
    public void setTier(IncentiveTableTierElementsType value) {
        this.tier = value;
    }

    /**
     * Sets the value of the timeInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncentiveTableIncentiveSlotElementsType.TimeInterval }
     * @return
     *     The class instance
     */
    public IncentiveTableIncentiveSlotElementsType withTimeInterval(IncentiveTableIncentiveSlotElementsType.TimeInterval value) {
        setTimeInterval(value);
        return this;
    }

    /**
     * Sets the value of the tier property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncentiveTableTierElementsType }
     * @return
     *     The class instance
     */
    public IncentiveTableIncentiveSlotElementsType withTier(IncentiveTableTierElementsType value) {
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
        if (draftCopy instanceof IncentiveTableIncentiveSlotElementsType) {
            final IncentiveTableIncentiveSlotElementsType copy = ((IncentiveTableIncentiveSlotElementsType) draftCopy);
            {
                Boolean timeIntervalShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.timeInterval!= null));
                if (timeIntervalShouldBeCopiedAndSet == Boolean.TRUE) {
                    IncentiveTableIncentiveSlotElementsType.TimeInterval sourceTimeInterval;
                    sourceTimeInterval = this.getTimeInterval();
                    IncentiveTableIncentiveSlotElementsType.TimeInterval copyTimeInterval = ((IncentiveTableIncentiveSlotElementsType.TimeInterval) strategy.copy(LocatorUtils.property(locator, "timeInterval", sourceTimeInterval), sourceTimeInterval, (this.timeInterval!= null)));
                    copy.setTimeInterval(copyTimeInterval);
                } else {
                    if (timeIntervalShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.timeInterval = null;
                    }
                }
            }
            {
                Boolean tierShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.tier!= null));
                if (tierShouldBeCopiedAndSet == Boolean.TRUE) {
                    IncentiveTableTierElementsType sourceTier;
                    sourceTier = this.getTier();
                    IncentiveTableTierElementsType copyTier = ((IncentiveTableTierElementsType) strategy.copy(LocatorUtils.property(locator, "tier", sourceTier), sourceTier, (this.tier!= null)));
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
        return new IncentiveTableIncentiveSlotElementsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final IncentiveTableIncentiveSlotElementsType that = ((IncentiveTableIncentiveSlotElementsType) object);
        {
            IncentiveTableIncentiveSlotElementsType.TimeInterval leftTimeInterval;
            leftTimeInterval = this.getTimeInterval();
            IncentiveTableIncentiveSlotElementsType.TimeInterval rightTimeInterval;
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
            IncentiveTableTierElementsType leftTier;
            leftTier = this.getTier();
            IncentiveTableTierElementsType rightTier;
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
            IncentiveTableIncentiveSlotElementsType.TimeInterval theTimeInterval;
            theTimeInterval = this.getTimeInterval();
            if (this.timeInterval!= null) {
                currentHashCode += theTimeInterval.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            IncentiveTableTierElementsType theTier;
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
            IncentiveTableIncentiveSlotElementsType.TimeInterval theTimeInterval;
            theTimeInterval = this.getTimeInterval();
            strategy.appendField(locator, this, "timeInterval", buffer, theTimeInterval, (this.timeInterval!= null));
        }
        {
            IncentiveTableTierElementsType theTier;
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
     *     &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}TimeTableDataElementsType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="timeSlotId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
     *         &lt;element name="startTime" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}AbsoluteOrRecurringTimeElementsType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="dateTime" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
     *                   &lt;element name="relative" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="endTime" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}AbsoluteOrRecurringTimeElementsType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="dateTime" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
     *                   &lt;element name="relative" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
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
        extends TimeTableDataElementsType
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
        public TimeInterval(final ElementTagType timeTableId, final ElementTagType timeSlotId, final RecurrenceInformationElementsType recurrenceInformation, final AbsoluteOrRecurringTimeElementsType startTime, final AbsoluteOrRecurringTimeElementsType endTime) {
            super(timeTableId, timeSlotId, recurrenceInformation, startTime, endTime);
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
        @Override
        public IncentiveTableIncentiveSlotElementsType.TimeInterval withTimeTableId(ElementTagType value) {
            setTimeTableId(value);
            return this;
        }

        /**
         * Sets the value of the timeSlotId property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElementTagType }
         * @return
         *     The class instance
         */
        @Override
        public IncentiveTableIncentiveSlotElementsType.TimeInterval withTimeSlotId(ElementTagType value) {
            setTimeSlotId(value);
            return this;
        }

        /**
         * Sets the value of the recurrenceInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link RecurrenceInformationElementsType }
         * @return
         *     The class instance
         */
        @Override
        public IncentiveTableIncentiveSlotElementsType.TimeInterval withRecurrenceInformation(RecurrenceInformationElementsType value) {
            setRecurrenceInformation(value);
            return this;
        }

        /**
         * Sets the value of the startTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link AbsoluteOrRecurringTimeElementsType }
         * @return
         *     The class instance
         */
        @Override
        public IncentiveTableIncentiveSlotElementsType.TimeInterval withStartTime(AbsoluteOrRecurringTimeElementsType value) {
            setStartTime(value);
            return this;
        }

        /**
         * Sets the value of the endTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link AbsoluteOrRecurringTimeElementsType }
         * @return
         *     The class instance
         */
        @Override
        public IncentiveTableIncentiveSlotElementsType.TimeInterval withEndTime(AbsoluteOrRecurringTimeElementsType value) {
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
            return new IncentiveTableIncentiveSlotElementsType.TimeInterval();
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
