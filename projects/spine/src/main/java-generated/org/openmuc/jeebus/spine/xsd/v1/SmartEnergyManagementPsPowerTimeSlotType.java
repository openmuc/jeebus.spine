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

import javax.xml.datatype.Duration;
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
 * <p>Java class for SmartEnergyManagementPsPowerTimeSlotType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SmartEnergyManagementPsPowerTimeSlotType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="schedule" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}PowerTimeSlotScheduleDataType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="slotNumber" type="{http://docs.eebus.org/spine/xsd/v1}PowerTimeSlotNumberType" minOccurs="0"/&gt;
 *                   &lt;element name="timePeriod" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}TimePeriodType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="startTime" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *                             &lt;element name="endTime" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="defaultDuration" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *                   &lt;element name="durationUncertainty" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *                   &lt;element name="slotActivated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="description" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}DescriptionType"&gt;
 *                         &lt;minLength value="1"/&gt;
 *                         &lt;maxLength value="60"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="valueList" type="{http://docs.eebus.org/spine/xsd/v1}SmartEnergyManagementPsPowerTimeSlotValueListType" minOccurs="0"/&gt;
 *         &lt;element name="scheduleConstraints" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}PowerTimeSlotScheduleConstraintsDataType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="earliestStartTime" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *                   &lt;element name="latestEndTime" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *                   &lt;element name="minDuration" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *                   &lt;element name="maxDuration" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *                   &lt;element name="optionalSlot" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
@XmlType(name = "SmartEnergyManagementPsPowerTimeSlotType", propOrder = {
    "schedule",
    "valueList",
    "scheduleConstraints"
})
public class SmartEnergyManagementPsPowerTimeSlotType implements Cloneable, CopyTo, ToString
{

    protected SmartEnergyManagementPsPowerTimeSlotType.Schedule schedule;
    protected SmartEnergyManagementPsPowerTimeSlotValueListType valueList;
    protected SmartEnergyManagementPsPowerTimeSlotType.ScheduleConstraints scheduleConstraints;

    /**
     * Default no-arg constructor
     * 
     */
    public SmartEnergyManagementPsPowerTimeSlotType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public SmartEnergyManagementPsPowerTimeSlotType(final SmartEnergyManagementPsPowerTimeSlotType.Schedule schedule, final SmartEnergyManagementPsPowerTimeSlotValueListType valueList, final SmartEnergyManagementPsPowerTimeSlotType.ScheduleConstraints scheduleConstraints) {
        this.schedule = schedule;
        this.valueList = valueList;
        this.scheduleConstraints = scheduleConstraints;
    }

    /**
     * Gets the value of the schedule property.
     * 
     * @return
     *     possible object is
     *     {@link SmartEnergyManagementPsPowerTimeSlotType.Schedule }
     *     
     */
    public SmartEnergyManagementPsPowerTimeSlotType.Schedule getSchedule() {
        return schedule;
    }

    /**
     * Sets the value of the schedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmartEnergyManagementPsPowerTimeSlotType.Schedule }
     *     
     */
    public void setSchedule(SmartEnergyManagementPsPowerTimeSlotType.Schedule value) {
        this.schedule = value;
    }

    /**
     * Gets the value of the valueList property.
     * 
     * @return
     *     possible object is
     *     {@link SmartEnergyManagementPsPowerTimeSlotValueListType }
     *     
     */
    public SmartEnergyManagementPsPowerTimeSlotValueListType getValueList() {
        return valueList;
    }

    /**
     * Sets the value of the valueList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmartEnergyManagementPsPowerTimeSlotValueListType }
     *     
     */
    public void setValueList(SmartEnergyManagementPsPowerTimeSlotValueListType value) {
        this.valueList = value;
    }

    /**
     * Gets the value of the scheduleConstraints property.
     * 
     * @return
     *     possible object is
     *     {@link SmartEnergyManagementPsPowerTimeSlotType.ScheduleConstraints }
     *     
     */
    public SmartEnergyManagementPsPowerTimeSlotType.ScheduleConstraints getScheduleConstraints() {
        return scheduleConstraints;
    }

    /**
     * Sets the value of the scheduleConstraints property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmartEnergyManagementPsPowerTimeSlotType.ScheduleConstraints }
     *     
     */
    public void setScheduleConstraints(SmartEnergyManagementPsPowerTimeSlotType.ScheduleConstraints value) {
        this.scheduleConstraints = value;
    }

    /**
     * Sets the value of the schedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmartEnergyManagementPsPowerTimeSlotType.Schedule }
     * @return
     *     The class instance
     */
    public SmartEnergyManagementPsPowerTimeSlotType withSchedule(SmartEnergyManagementPsPowerTimeSlotType.Schedule value) {
        setSchedule(value);
        return this;
    }

    /**
     * Sets the value of the valueList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmartEnergyManagementPsPowerTimeSlotValueListType }
     * @return
     *     The class instance
     */
    public SmartEnergyManagementPsPowerTimeSlotType withValueList(SmartEnergyManagementPsPowerTimeSlotValueListType value) {
        setValueList(value);
        return this;
    }

    /**
     * Sets the value of the scheduleConstraints property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmartEnergyManagementPsPowerTimeSlotType.ScheduleConstraints }
     * @return
     *     The class instance
     */
    public SmartEnergyManagementPsPowerTimeSlotType withScheduleConstraints(SmartEnergyManagementPsPowerTimeSlotType.ScheduleConstraints value) {
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
        if (draftCopy instanceof SmartEnergyManagementPsPowerTimeSlotType) {
            final SmartEnergyManagementPsPowerTimeSlotType copy = ((SmartEnergyManagementPsPowerTimeSlotType) draftCopy);
            {
                Boolean scheduleShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.schedule!= null));
                if (scheduleShouldBeCopiedAndSet == Boolean.TRUE) {
                    SmartEnergyManagementPsPowerTimeSlotType.Schedule sourceSchedule;
                    sourceSchedule = this.getSchedule();
                    SmartEnergyManagementPsPowerTimeSlotType.Schedule copySchedule = ((SmartEnergyManagementPsPowerTimeSlotType.Schedule) strategy.copy(LocatorUtils.property(locator, "schedule", sourceSchedule), sourceSchedule, (this.schedule!= null)));
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
                    SmartEnergyManagementPsPowerTimeSlotValueListType sourceValueList;
                    sourceValueList = this.getValueList();
                    SmartEnergyManagementPsPowerTimeSlotValueListType copyValueList = ((SmartEnergyManagementPsPowerTimeSlotValueListType) strategy.copy(LocatorUtils.property(locator, "valueList", sourceValueList), sourceValueList, (this.valueList!= null)));
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
                    SmartEnergyManagementPsPowerTimeSlotType.ScheduleConstraints sourceScheduleConstraints;
                    sourceScheduleConstraints = this.getScheduleConstraints();
                    SmartEnergyManagementPsPowerTimeSlotType.ScheduleConstraints copyScheduleConstraints = ((SmartEnergyManagementPsPowerTimeSlotType.ScheduleConstraints) strategy.copy(LocatorUtils.property(locator, "scheduleConstraints", sourceScheduleConstraints), sourceScheduleConstraints, (this.scheduleConstraints!= null)));
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
        return new SmartEnergyManagementPsPowerTimeSlotType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final SmartEnergyManagementPsPowerTimeSlotType that = ((SmartEnergyManagementPsPowerTimeSlotType) object);
        {
            SmartEnergyManagementPsPowerTimeSlotType.Schedule leftSchedule;
            leftSchedule = this.getSchedule();
            SmartEnergyManagementPsPowerTimeSlotType.Schedule rightSchedule;
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
            SmartEnergyManagementPsPowerTimeSlotValueListType leftValueList;
            leftValueList = this.getValueList();
            SmartEnergyManagementPsPowerTimeSlotValueListType rightValueList;
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
            SmartEnergyManagementPsPowerTimeSlotType.ScheduleConstraints leftScheduleConstraints;
            leftScheduleConstraints = this.getScheduleConstraints();
            SmartEnergyManagementPsPowerTimeSlotType.ScheduleConstraints rightScheduleConstraints;
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
            SmartEnergyManagementPsPowerTimeSlotType.Schedule theSchedule;
            theSchedule = this.getSchedule();
            if (this.schedule!= null) {
                currentHashCode += theSchedule.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            SmartEnergyManagementPsPowerTimeSlotValueListType theValueList;
            theValueList = this.getValueList();
            if (this.valueList!= null) {
                currentHashCode += theValueList.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            SmartEnergyManagementPsPowerTimeSlotType.ScheduleConstraints theScheduleConstraints;
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
            SmartEnergyManagementPsPowerTimeSlotType.Schedule theSchedule;
            theSchedule = this.getSchedule();
            strategy.appendField(locator, this, "schedule", buffer, theSchedule, (this.schedule!= null));
        }
        {
            SmartEnergyManagementPsPowerTimeSlotValueListType theValueList;
            theValueList = this.getValueList();
            strategy.appendField(locator, this, "valueList", buffer, theValueList, (this.valueList!= null));
        }
        {
            SmartEnergyManagementPsPowerTimeSlotType.ScheduleConstraints theScheduleConstraints;
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
     *     &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}PowerTimeSlotScheduleDataType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="slotNumber" type="{http://docs.eebus.org/spine/xsd/v1}PowerTimeSlotNumberType" minOccurs="0"/&gt;
     *         &lt;element name="timePeriod" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}TimePeriodType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="startTime" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
     *                   &lt;element name="endTime" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="defaultDuration" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
     *         &lt;element name="durationUncertainty" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
     *         &lt;element name="slotActivated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="description" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}DescriptionType"&gt;
     *               &lt;minLength value="1"/&gt;
     *               &lt;maxLength value="60"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
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
    public static class Schedule
        extends PowerTimeSlotScheduleDataType
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
        public Schedule(final Long sequenceId, final Long slotNumber, final TimePeriodType timePeriod, final Duration defaultDuration, final Duration durationUncertainty, final Boolean slotActivated, final String description) {
            super(sequenceId, slotNumber, timePeriod, defaultDuration, durationUncertainty, slotActivated, description);
        }

        /**
         * Sets the value of the sequenceId property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         * @return
         *     The class instance
         */
        @Override
        public SmartEnergyManagementPsPowerTimeSlotType.Schedule withSequenceId(Long value) {
            setSequenceId(value);
            return this;
        }

        /**
         * Sets the value of the slotNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         * @return
         *     The class instance
         */
        @Override
        public SmartEnergyManagementPsPowerTimeSlotType.Schedule withSlotNumber(Long value) {
            setSlotNumber(value);
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
        @Override
        public SmartEnergyManagementPsPowerTimeSlotType.Schedule withTimePeriod(TimePeriodType value) {
            setTimePeriod(value);
            return this;
        }

        /**
         * Sets the value of the defaultDuration property.
         * 
         * @param value
         *     allowed object is
         *     {@link Duration }
         * @return
         *     The class instance
         */
        @Override
        public SmartEnergyManagementPsPowerTimeSlotType.Schedule withDefaultDuration(Duration value) {
            setDefaultDuration(value);
            return this;
        }

        /**
         * Sets the value of the durationUncertainty property.
         * 
         * @param value
         *     allowed object is
         *     {@link Duration }
         * @return
         *     The class instance
         */
        @Override
        public SmartEnergyManagementPsPowerTimeSlotType.Schedule withDurationUncertainty(Duration value) {
            setDurationUncertainty(value);
            return this;
        }

        /**
         * Sets the value of the slotActivated property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         * @return
         *     The class instance
         */
        @Override
        public SmartEnergyManagementPsPowerTimeSlotType.Schedule withSlotActivated(Boolean value) {
            setSlotActivated(value);
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
        public SmartEnergyManagementPsPowerTimeSlotType.Schedule withDescription(String value) {
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
            return new SmartEnergyManagementPsPowerTimeSlotType.Schedule();
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
     *     &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}PowerTimeSlotScheduleConstraintsDataType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="earliestStartTime" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
     *         &lt;element name="latestEndTime" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
     *         &lt;element name="minDuration" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
     *         &lt;element name="maxDuration" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
     *         &lt;element name="optionalSlot" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
        extends PowerTimeSlotScheduleConstraintsDataType
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
        public ScheduleConstraints(final Long sequenceId, final Long slotNumber, final String earliestStartTime, final String latestEndTime, final Duration minDuration, final Duration maxDuration, final Boolean optionalSlot) {
            super(sequenceId, slotNumber, earliestStartTime, latestEndTime, minDuration, maxDuration, optionalSlot);
        }

        /**
         * Sets the value of the sequenceId property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         * @return
         *     The class instance
         */
        @Override
        public SmartEnergyManagementPsPowerTimeSlotType.ScheduleConstraints withSequenceId(Long value) {
            setSequenceId(value);
            return this;
        }

        /**
         * Sets the value of the slotNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         * @return
         *     The class instance
         */
        @Override
        public SmartEnergyManagementPsPowerTimeSlotType.ScheduleConstraints withSlotNumber(Long value) {
            setSlotNumber(value);
            return this;
        }

        /**
         * Sets the value of the earliestStartTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         * @return
         *     The class instance
         */
        @Override
        public SmartEnergyManagementPsPowerTimeSlotType.ScheduleConstraints withEarliestStartTime(String value) {
            setEarliestStartTime(value);
            return this;
        }

        /**
         * Sets the value of the latestEndTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         * @return
         *     The class instance
         */
        @Override
        public SmartEnergyManagementPsPowerTimeSlotType.ScheduleConstraints withLatestEndTime(String value) {
            setLatestEndTime(value);
            return this;
        }

        /**
         * Sets the value of the minDuration property.
         * 
         * @param value
         *     allowed object is
         *     {@link Duration }
         * @return
         *     The class instance
         */
        @Override
        public SmartEnergyManagementPsPowerTimeSlotType.ScheduleConstraints withMinDuration(Duration value) {
            setMinDuration(value);
            return this;
        }

        /**
         * Sets the value of the maxDuration property.
         * 
         * @param value
         *     allowed object is
         *     {@link Duration }
         * @return
         *     The class instance
         */
        @Override
        public SmartEnergyManagementPsPowerTimeSlotType.ScheduleConstraints withMaxDuration(Duration value) {
            setMaxDuration(value);
            return this;
        }

        /**
         * Sets the value of the optionalSlot property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         * @return
         *     The class instance
         */
        @Override
        public SmartEnergyManagementPsPowerTimeSlotType.ScheduleConstraints withOptionalSlot(Boolean value) {
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
            return new SmartEnergyManagementPsPowerTimeSlotType.ScheduleConstraints();
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
