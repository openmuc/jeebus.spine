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
 * <p>Java class for SmartEnergyManagementPsPowerTimeSlotElementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SmartEnergyManagementPsPowerTimeSlotElementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="schedule" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}PowerTimeSlotScheduleDataElementsType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="slotNumber" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *                   &lt;element name="timePeriod" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}TimePeriodElementsType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="startTime" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *                             &lt;element name="endTime" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="defaultDuration" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *                   &lt;element name="durationUncertainty" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *                   &lt;element name="slotActivated" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *                   &lt;element name="description" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="valueList" type="{http://docs.eebus.org/spine/xsd/v1}SmartEnergyManagementPsPowerTimeSlotValueListElementsType" minOccurs="0"/&gt;
 *         &lt;element name="scheduleConstraints" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}PowerTimeSlotScheduleConstraintsDataElementsType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="earliestStartTime" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *                   &lt;element name="latestEndTime" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *                   &lt;element name="minDuration" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *                   &lt;element name="maxDuration" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *                   &lt;element name="optionalSlot" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
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
@XmlType(name = "SmartEnergyManagementPsPowerTimeSlotElementsType", propOrder = {
    "schedule",
    "valueList",
    "scheduleConstraints"
})
public class SmartEnergyManagementPsPowerTimeSlotElementsType implements Cloneable, CopyTo, ToString
{

    protected SmartEnergyManagementPsPowerTimeSlotElementsType.Schedule schedule;
    protected SmartEnergyManagementPsPowerTimeSlotValueListElementsType valueList;
    protected SmartEnergyManagementPsPowerTimeSlotElementsType.ScheduleConstraints scheduleConstraints;

    /**
     * Default no-arg constructor
     * 
     */
    public SmartEnergyManagementPsPowerTimeSlotElementsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public SmartEnergyManagementPsPowerTimeSlotElementsType(final SmartEnergyManagementPsPowerTimeSlotElementsType.Schedule schedule, final SmartEnergyManagementPsPowerTimeSlotValueListElementsType valueList, final SmartEnergyManagementPsPowerTimeSlotElementsType.ScheduleConstraints scheduleConstraints) {
        this.schedule = schedule;
        this.valueList = valueList;
        this.scheduleConstraints = scheduleConstraints;
    }

    /**
     * Gets the value of the schedule property.
     * 
     * @return
     *     possible object is
     *     {@link SmartEnergyManagementPsPowerTimeSlotElementsType.Schedule }
     *     
     */
    public SmartEnergyManagementPsPowerTimeSlotElementsType.Schedule getSchedule() {
        return schedule;
    }

    /**
     * Sets the value of the schedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmartEnergyManagementPsPowerTimeSlotElementsType.Schedule }
     *     
     */
    public void setSchedule(SmartEnergyManagementPsPowerTimeSlotElementsType.Schedule value) {
        this.schedule = value;
    }

    /**
     * Gets the value of the valueList property.
     * 
     * @return
     *     possible object is
     *     {@link SmartEnergyManagementPsPowerTimeSlotValueListElementsType }
     *     
     */
    public SmartEnergyManagementPsPowerTimeSlotValueListElementsType getValueList() {
        return valueList;
    }

    /**
     * Sets the value of the valueList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmartEnergyManagementPsPowerTimeSlotValueListElementsType }
     *     
     */
    public void setValueList(SmartEnergyManagementPsPowerTimeSlotValueListElementsType value) {
        this.valueList = value;
    }

    /**
     * Gets the value of the scheduleConstraints property.
     * 
     * @return
     *     possible object is
     *     {@link SmartEnergyManagementPsPowerTimeSlotElementsType.ScheduleConstraints }
     *     
     */
    public SmartEnergyManagementPsPowerTimeSlotElementsType.ScheduleConstraints getScheduleConstraints() {
        return scheduleConstraints;
    }

    /**
     * Sets the value of the scheduleConstraints property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmartEnergyManagementPsPowerTimeSlotElementsType.ScheduleConstraints }
     *     
     */
    public void setScheduleConstraints(SmartEnergyManagementPsPowerTimeSlotElementsType.ScheduleConstraints value) {
        this.scheduleConstraints = value;
    }

    /**
     * Sets the value of the schedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmartEnergyManagementPsPowerTimeSlotElementsType.Schedule }
     * @return
     *     The class instance
     */
    public SmartEnergyManagementPsPowerTimeSlotElementsType withSchedule(SmartEnergyManagementPsPowerTimeSlotElementsType.Schedule value) {
        setSchedule(value);
        return this;
    }

    /**
     * Sets the value of the valueList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmartEnergyManagementPsPowerTimeSlotValueListElementsType }
     * @return
     *     The class instance
     */
    public SmartEnergyManagementPsPowerTimeSlotElementsType withValueList(SmartEnergyManagementPsPowerTimeSlotValueListElementsType value) {
        setValueList(value);
        return this;
    }

    /**
     * Sets the value of the scheduleConstraints property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmartEnergyManagementPsPowerTimeSlotElementsType.ScheduleConstraints }
     * @return
     *     The class instance
     */
    public SmartEnergyManagementPsPowerTimeSlotElementsType withScheduleConstraints(SmartEnergyManagementPsPowerTimeSlotElementsType.ScheduleConstraints value) {
        setScheduleConstraints(value);
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
        if (draftCopy instanceof SmartEnergyManagementPsPowerTimeSlotElementsType) {
            final SmartEnergyManagementPsPowerTimeSlotElementsType copy = ((SmartEnergyManagementPsPowerTimeSlotElementsType) draftCopy);
            {
                Boolean scheduleShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.schedule!= null));
                if (scheduleShouldBeCopiedAndSet == Boolean.TRUE) {
                    SmartEnergyManagementPsPowerTimeSlotElementsType.Schedule sourceSchedule;
                    sourceSchedule = this.getSchedule();
                    SmartEnergyManagementPsPowerTimeSlotElementsType.Schedule copySchedule = ((SmartEnergyManagementPsPowerTimeSlotElementsType.Schedule) strategy.copy(LocatorUtils.property(locator, "schedule", sourceSchedule), sourceSchedule, (this.schedule!= null)));
                    copy.setSchedule(copySchedule);
                } else {
                    if (scheduleShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.schedule = null;
                    }
                }
            }
            {
                Boolean valueListShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.valueList!= null));
                if (valueListShouldBeCopiedAndSet == Boolean.TRUE) {
                    SmartEnergyManagementPsPowerTimeSlotValueListElementsType sourceValueList;
                    sourceValueList = this.getValueList();
                    SmartEnergyManagementPsPowerTimeSlotValueListElementsType copyValueList = ((SmartEnergyManagementPsPowerTimeSlotValueListElementsType) strategy.copy(LocatorUtils.property(locator, "valueList", sourceValueList), sourceValueList, (this.valueList!= null)));
                    copy.setValueList(copyValueList);
                } else {
                    if (valueListShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.valueList = null;
                    }
                }
            }
            {
                Boolean scheduleConstraintsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.scheduleConstraints!= null));
                if (scheduleConstraintsShouldBeCopiedAndSet == Boolean.TRUE) {
                    SmartEnergyManagementPsPowerTimeSlotElementsType.ScheduleConstraints sourceScheduleConstraints;
                    sourceScheduleConstraints = this.getScheduleConstraints();
                    SmartEnergyManagementPsPowerTimeSlotElementsType.ScheduleConstraints copyScheduleConstraints = ((SmartEnergyManagementPsPowerTimeSlotElementsType.ScheduleConstraints) strategy.copy(LocatorUtils.property(locator, "scheduleConstraints", sourceScheduleConstraints), sourceScheduleConstraints, (this.scheduleConstraints!= null)));
                    copy.setScheduleConstraints(copyScheduleConstraints);
                } else {
                    if (scheduleConstraintsShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.scheduleConstraints = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new SmartEnergyManagementPsPowerTimeSlotElementsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final SmartEnergyManagementPsPowerTimeSlotElementsType that = ((SmartEnergyManagementPsPowerTimeSlotElementsType) object);
        {
            SmartEnergyManagementPsPowerTimeSlotElementsType.Schedule leftSchedule;
            leftSchedule = this.getSchedule();
            SmartEnergyManagementPsPowerTimeSlotElementsType.Schedule rightSchedule;
            rightSchedule = that.getSchedule();
            if (this.schedule!= null) {
                if (that.schedule!= null) {
                    if (!leftSchedule.equals(rightSchedule)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.schedule!= null) {
                    return false;
                }
            }
        }
        {
            SmartEnergyManagementPsPowerTimeSlotValueListElementsType leftValueList;
            leftValueList = this.getValueList();
            SmartEnergyManagementPsPowerTimeSlotValueListElementsType rightValueList;
            rightValueList = that.getValueList();
            if (this.valueList!= null) {
                if (that.valueList!= null) {
                    if (!leftValueList.equals(rightValueList)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.valueList!= null) {
                    return false;
                }
            }
        }
        {
            SmartEnergyManagementPsPowerTimeSlotElementsType.ScheduleConstraints leftScheduleConstraints;
            leftScheduleConstraints = this.getScheduleConstraints();
            SmartEnergyManagementPsPowerTimeSlotElementsType.ScheduleConstraints rightScheduleConstraints;
            rightScheduleConstraints = that.getScheduleConstraints();
            if (this.scheduleConstraints!= null) {
                if (that.scheduleConstraints!= null) {
                    if (!leftScheduleConstraints.equals(rightScheduleConstraints)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.scheduleConstraints!= null) {
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
            SmartEnergyManagementPsPowerTimeSlotElementsType.Schedule theSchedule;
            theSchedule = this.getSchedule();
            if (this.schedule!= null) {
                currentHashCode += theSchedule.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            SmartEnergyManagementPsPowerTimeSlotValueListElementsType theValueList;
            theValueList = this.getValueList();
            if (this.valueList!= null) {
                currentHashCode += theValueList.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            SmartEnergyManagementPsPowerTimeSlotElementsType.ScheduleConstraints theScheduleConstraints;
            theScheduleConstraints = this.getScheduleConstraints();
            if (this.scheduleConstraints!= null) {
                currentHashCode += theScheduleConstraints.hashCode();
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
            SmartEnergyManagementPsPowerTimeSlotElementsType.Schedule theSchedule;
            theSchedule = this.getSchedule();
            strategy.appendField(locator, this, "schedule", buffer, theSchedule, (this.schedule!= null));
        }
        {
            SmartEnergyManagementPsPowerTimeSlotValueListElementsType theValueList;
            theValueList = this.getValueList();
            strategy.appendField(locator, this, "valueList", buffer, theValueList, (this.valueList!= null));
        }
        {
            SmartEnergyManagementPsPowerTimeSlotElementsType.ScheduleConstraints theScheduleConstraints;
            theScheduleConstraints = this.getScheduleConstraints();
            strategy.appendField(locator, this, "scheduleConstraints", buffer, theScheduleConstraints, (this.scheduleConstraints!= null));
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
     *     &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}PowerTimeSlotScheduleDataElementsType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="slotNumber" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
     *         &lt;element name="timePeriod" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}TimePeriodElementsType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="startTime" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
     *                   &lt;element name="endTime" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="defaultDuration" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
     *         &lt;element name="durationUncertainty" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
     *         &lt;element name="slotActivated" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
     *         &lt;element name="description" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
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
    public static class Schedule
        extends PowerTimeSlotScheduleDataElementsType
        implements Cloneable, CopyTo, ToString
    {


        /**
         * Default no-arg constructor
         * 
         */
        public Schedule() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public Schedule(final ElementTagType sequenceId, final ElementTagType slotNumber, final TimePeriodElementsType timePeriod, final ElementTagType defaultDuration, final ElementTagType durationUncertainty, final ElementTagType slotActivated, final ElementTagType description) {
            super(sequenceId, slotNumber, timePeriod, defaultDuration, durationUncertainty, slotActivated, description);
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
        public SmartEnergyManagementPsPowerTimeSlotElementsType.Schedule withSequenceId(ElementTagType value) {
            setSequenceId(value);
            return this;
        }

        /**
         * Sets the value of the slotNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElementTagType }
         * @return
         *     The class instance
         */
        @Override
        public SmartEnergyManagementPsPowerTimeSlotElementsType.Schedule withSlotNumber(ElementTagType value) {
            setSlotNumber(value);
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
        @Override
        public SmartEnergyManagementPsPowerTimeSlotElementsType.Schedule withTimePeriod(TimePeriodElementsType value) {
            setTimePeriod(value);
            return this;
        }

        /**
         * Sets the value of the defaultDuration property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElementTagType }
         * @return
         *     The class instance
         */
        @Override
        public SmartEnergyManagementPsPowerTimeSlotElementsType.Schedule withDefaultDuration(ElementTagType value) {
            setDefaultDuration(value);
            return this;
        }

        /**
         * Sets the value of the durationUncertainty property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElementTagType }
         * @return
         *     The class instance
         */
        @Override
        public SmartEnergyManagementPsPowerTimeSlotElementsType.Schedule withDurationUncertainty(ElementTagType value) {
            setDurationUncertainty(value);
            return this;
        }

        /**
         * Sets the value of the slotActivated property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElementTagType }
         * @return
         *     The class instance
         */
        @Override
        public SmartEnergyManagementPsPowerTimeSlotElementsType.Schedule withSlotActivated(ElementTagType value) {
            setSlotActivated(value);
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
        public SmartEnergyManagementPsPowerTimeSlotElementsType.Schedule withDescription(ElementTagType value) {
            setDescription(value);
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
            return new SmartEnergyManagementPsPowerTimeSlotElementsType.Schedule();
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}PowerTimeSlotScheduleConstraintsDataElementsType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="earliestStartTime" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
     *         &lt;element name="latestEndTime" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
     *         &lt;element name="minDuration" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
     *         &lt;element name="maxDuration" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
     *         &lt;element name="optionalSlot" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
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
    public static class ScheduleConstraints
        extends PowerTimeSlotScheduleConstraintsDataElementsType
        implements Cloneable, CopyTo, ToString
    {


        /**
         * Default no-arg constructor
         * 
         */
        public ScheduleConstraints() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public ScheduleConstraints(final ElementTagType sequenceId, final ElementTagType slotNumber, final ElementTagType earliestStartTime, final ElementTagType latestEndTime, final ElementTagType minDuration, final ElementTagType maxDuration, final ElementTagType optionalSlot) {
            super(sequenceId, slotNumber, earliestStartTime, latestEndTime, minDuration, maxDuration, optionalSlot);
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
        public SmartEnergyManagementPsPowerTimeSlotElementsType.ScheduleConstraints withSequenceId(ElementTagType value) {
            setSequenceId(value);
            return this;
        }

        /**
         * Sets the value of the slotNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElementTagType }
         * @return
         *     The class instance
         */
        @Override
        public SmartEnergyManagementPsPowerTimeSlotElementsType.ScheduleConstraints withSlotNumber(ElementTagType value) {
            setSlotNumber(value);
            return this;
        }

        /**
         * Sets the value of the earliestStartTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElementTagType }
         * @return
         *     The class instance
         */
        @Override
        public SmartEnergyManagementPsPowerTimeSlotElementsType.ScheduleConstraints withEarliestStartTime(ElementTagType value) {
            setEarliestStartTime(value);
            return this;
        }

        /**
         * Sets the value of the latestEndTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElementTagType }
         * @return
         *     The class instance
         */
        @Override
        public SmartEnergyManagementPsPowerTimeSlotElementsType.ScheduleConstraints withLatestEndTime(ElementTagType value) {
            setLatestEndTime(value);
            return this;
        }

        /**
         * Sets the value of the minDuration property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElementTagType }
         * @return
         *     The class instance
         */
        @Override
        public SmartEnergyManagementPsPowerTimeSlotElementsType.ScheduleConstraints withMinDuration(ElementTagType value) {
            setMinDuration(value);
            return this;
        }

        /**
         * Sets the value of the maxDuration property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElementTagType }
         * @return
         *     The class instance
         */
        @Override
        public SmartEnergyManagementPsPowerTimeSlotElementsType.ScheduleConstraints withMaxDuration(ElementTagType value) {
            setMaxDuration(value);
            return this;
        }

        /**
         * Sets the value of the optionalSlot property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElementTagType }
         * @return
         *     The class instance
         */
        @Override
        public SmartEnergyManagementPsPowerTimeSlotElementsType.ScheduleConstraints withOptionalSlot(ElementTagType value) {
            setOptionalSlot(value);
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
            return new SmartEnergyManagementPsPowerTimeSlotElementsType.ScheduleConstraints();
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
