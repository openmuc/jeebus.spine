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
 * <p>Java class for SmartEnergyManagementPsPowerSequenceElementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SmartEnergyManagementPsPowerSequenceElementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="description" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}PowerSequenceDescriptionDataElementsType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="sequenceId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *                   &lt;element name="description" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *                   &lt;element name="powerUnit" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *                   &lt;element name="energyUnit" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *                   &lt;element name="valueSource" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *                   &lt;element name="taskIdentifier" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *                   &lt;element name="repetitionsTotal" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="state" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}PowerSequenceStateDataElementsType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="state" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *                   &lt;element name="activeSlotNumber" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *                   &lt;element name="elapsedSlotTime" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *                   &lt;element name="remainingSlotTime" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *                   &lt;element name="sequenceRemoteControllable" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *                   &lt;element name="activeRepetitionNumber" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *                   &lt;element name="remainingPauseTime" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="schedule" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}PowerSequenceScheduleDataElementsType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="startTime" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *                   &lt;element name="endTime" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="scheduleConstraints" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}PowerSequenceScheduleConstraintsDataElementsType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="earliestStartTime" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *                   &lt;element name="latestEndTime" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="schedulePreference" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}PowerSequenceSchedulePreferenceDataElementsType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="greenest" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *                   &lt;element name="cheapest" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="operatingConstraintsInterrupt" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}OperatingConstraintsInterruptDataElementsType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="isPausable" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *                   &lt;element name="isStoppable" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *                   &lt;element name="maxCyclesPerDay" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="operatingConstraintsDuration" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}OperatingConstraintsDurationDataElementsType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="activeDurationMin" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *                   &lt;element name="activeDurationMax" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *                   &lt;element name="pauseDurationMin" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *                   &lt;element name="pauseDurationMax" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *                   &lt;element name="activeDurationSumMin" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *                   &lt;element name="activeDurationSumMax" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="operatingConstraintsResumeImplication" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}OperatingConstraintsResumeImplicationDataElementsType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="resumeEnergyEstimated" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberElementsType" minOccurs="0"/&gt;
 *                   &lt;element name="energyUnit" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *                   &lt;element name="resumeCostEstimated" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberElementsType" minOccurs="0"/&gt;
 *                   &lt;element name="currency" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="powerTimeSlot" type="{http://docs.eebus.org/spine/xsd/v1}SmartEnergyManagementPsPowerTimeSlotElementsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SmartEnergyManagementPsPowerSequenceElementsType", propOrder = {
    "description",
    "state",
    "schedule",
    "scheduleConstraints",
    "schedulePreference",
    "operatingConstraintsInterrupt",
    "operatingConstraintsDuration",
    "operatingConstraintsResumeImplication",
    "powerTimeSlot"
})
public class SmartEnergyManagementPsPowerSequenceElementsType implements Cloneable, CopyTo, ToString
{

    protected SmartEnergyManagementPsPowerSequenceElementsType.Description description;
    protected SmartEnergyManagementPsPowerSequenceElementsType.State state;
    protected SmartEnergyManagementPsPowerSequenceElementsType.Schedule schedule;
    protected SmartEnergyManagementPsPowerSequenceElementsType.ScheduleConstraints scheduleConstraints;
    protected SmartEnergyManagementPsPowerSequenceElementsType.SchedulePreference schedulePreference;
    protected SmartEnergyManagementPsPowerSequenceElementsType.OperatingConstraintsInterrupt operatingConstraintsInterrupt;
    protected SmartEnergyManagementPsPowerSequenceElementsType.OperatingConstraintsDuration operatingConstraintsDuration;
    protected SmartEnergyManagementPsPowerSequenceElementsType.OperatingConstraintsResumeImplication operatingConstraintsResumeImplication;
    protected SmartEnergyManagementPsPowerTimeSlotElementsType powerTimeSlot;

    /**
     * Default no-arg constructor
     * 
     */
    public SmartEnergyManagementPsPowerSequenceElementsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public SmartEnergyManagementPsPowerSequenceElementsType(final SmartEnergyManagementPsPowerSequenceElementsType.Description description, final SmartEnergyManagementPsPowerSequenceElementsType.State state, final SmartEnergyManagementPsPowerSequenceElementsType.Schedule schedule, final SmartEnergyManagementPsPowerSequenceElementsType.ScheduleConstraints scheduleConstraints, final SmartEnergyManagementPsPowerSequenceElementsType.SchedulePreference schedulePreference, final SmartEnergyManagementPsPowerSequenceElementsType.OperatingConstraintsInterrupt operatingConstraintsInterrupt, final SmartEnergyManagementPsPowerSequenceElementsType.OperatingConstraintsDuration operatingConstraintsDuration, final SmartEnergyManagementPsPowerSequenceElementsType.OperatingConstraintsResumeImplication operatingConstraintsResumeImplication, final SmartEnergyManagementPsPowerTimeSlotElementsType powerTimeSlot) {
        this.description = description;
        this.state = state;
        this.schedule = schedule;
        this.scheduleConstraints = scheduleConstraints;
        this.schedulePreference = schedulePreference;
        this.operatingConstraintsInterrupt = operatingConstraintsInterrupt;
        this.operatingConstraintsDuration = operatingConstraintsDuration;
        this.operatingConstraintsResumeImplication = operatingConstraintsResumeImplication;
        this.powerTimeSlot = powerTimeSlot;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link SmartEnergyManagementPsPowerSequenceElementsType.Description }
     *     
     */
    public SmartEnergyManagementPsPowerSequenceElementsType.Description getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmartEnergyManagementPsPowerSequenceElementsType.Description }
     *     
     */
    public void setDescription(SmartEnergyManagementPsPowerSequenceElementsType.Description value) {
        this.description = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link SmartEnergyManagementPsPowerSequenceElementsType.State }
     *     
     */
    public SmartEnergyManagementPsPowerSequenceElementsType.State getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmartEnergyManagementPsPowerSequenceElementsType.State }
     *     
     */
    public void setState(SmartEnergyManagementPsPowerSequenceElementsType.State value) {
        this.state = value;
    }

    /**
     * Gets the value of the schedule property.
     * 
     * @return
     *     possible object is
     *     {@link SmartEnergyManagementPsPowerSequenceElementsType.Schedule }
     *     
     */
    public SmartEnergyManagementPsPowerSequenceElementsType.Schedule getSchedule() {
        return schedule;
    }

    /**
     * Sets the value of the schedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmartEnergyManagementPsPowerSequenceElementsType.Schedule }
     *     
     */
    public void setSchedule(SmartEnergyManagementPsPowerSequenceElementsType.Schedule value) {
        this.schedule = value;
    }

    /**
     * Gets the value of the scheduleConstraints property.
     * 
     * @return
     *     possible object is
     *     {@link SmartEnergyManagementPsPowerSequenceElementsType.ScheduleConstraints }
     *     
     */
    public SmartEnergyManagementPsPowerSequenceElementsType.ScheduleConstraints getScheduleConstraints() {
        return scheduleConstraints;
    }

    /**
     * Sets the value of the scheduleConstraints property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmartEnergyManagementPsPowerSequenceElementsType.ScheduleConstraints }
     *     
     */
    public void setScheduleConstraints(SmartEnergyManagementPsPowerSequenceElementsType.ScheduleConstraints value) {
        this.scheduleConstraints = value;
    }

    /**
     * Gets the value of the schedulePreference property.
     * 
     * @return
     *     possible object is
     *     {@link SmartEnergyManagementPsPowerSequenceElementsType.SchedulePreference }
     *     
     */
    public SmartEnergyManagementPsPowerSequenceElementsType.SchedulePreference getSchedulePreference() {
        return schedulePreference;
    }

    /**
     * Sets the value of the schedulePreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmartEnergyManagementPsPowerSequenceElementsType.SchedulePreference }
     *     
     */
    public void setSchedulePreference(SmartEnergyManagementPsPowerSequenceElementsType.SchedulePreference value) {
        this.schedulePreference = value;
    }

    /**
     * Gets the value of the operatingConstraintsInterrupt property.
     * 
     * @return
     *     possible object is
     *     {@link SmartEnergyManagementPsPowerSequenceElementsType.OperatingConstraintsInterrupt }
     *     
     */
    public SmartEnergyManagementPsPowerSequenceElementsType.OperatingConstraintsInterrupt getOperatingConstraintsInterrupt() {
        return operatingConstraintsInterrupt;
    }

    /**
     * Sets the value of the operatingConstraintsInterrupt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmartEnergyManagementPsPowerSequenceElementsType.OperatingConstraintsInterrupt }
     *     
     */
    public void setOperatingConstraintsInterrupt(SmartEnergyManagementPsPowerSequenceElementsType.OperatingConstraintsInterrupt value) {
        this.operatingConstraintsInterrupt = value;
    }

    /**
     * Gets the value of the operatingConstraintsDuration property.
     * 
     * @return
     *     possible object is
     *     {@link SmartEnergyManagementPsPowerSequenceElementsType.OperatingConstraintsDuration }
     *     
     */
    public SmartEnergyManagementPsPowerSequenceElementsType.OperatingConstraintsDuration getOperatingConstraintsDuration() {
        return operatingConstraintsDuration;
    }

    /**
     * Sets the value of the operatingConstraintsDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmartEnergyManagementPsPowerSequenceElementsType.OperatingConstraintsDuration }
     *     
     */
    public void setOperatingConstraintsDuration(SmartEnergyManagementPsPowerSequenceElementsType.OperatingConstraintsDuration value) {
        this.operatingConstraintsDuration = value;
    }

    /**
     * Gets the value of the operatingConstraintsResumeImplication property.
     * 
     * @return
     *     possible object is
     *     {@link SmartEnergyManagementPsPowerSequenceElementsType.OperatingConstraintsResumeImplication }
     *     
     */
    public SmartEnergyManagementPsPowerSequenceElementsType.OperatingConstraintsResumeImplication getOperatingConstraintsResumeImplication() {
        return operatingConstraintsResumeImplication;
    }

    /**
     * Sets the value of the operatingConstraintsResumeImplication property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmartEnergyManagementPsPowerSequenceElementsType.OperatingConstraintsResumeImplication }
     *     
     */
    public void setOperatingConstraintsResumeImplication(SmartEnergyManagementPsPowerSequenceElementsType.OperatingConstraintsResumeImplication value) {
        this.operatingConstraintsResumeImplication = value;
    }

    /**
     * Gets the value of the powerTimeSlot property.
     * 
     * @return
     *     possible object is
     *     {@link SmartEnergyManagementPsPowerTimeSlotElementsType }
     *     
     */
    public SmartEnergyManagementPsPowerTimeSlotElementsType getPowerTimeSlot() {
        return powerTimeSlot;
    }

    /**
     * Sets the value of the powerTimeSlot property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmartEnergyManagementPsPowerTimeSlotElementsType }
     *     
     */
    public void setPowerTimeSlot(SmartEnergyManagementPsPowerTimeSlotElementsType value) {
        this.powerTimeSlot = value;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmartEnergyManagementPsPowerSequenceElementsType.Description }
     * @return
     *     The class instance
     */
    public SmartEnergyManagementPsPowerSequenceElementsType withDescription(SmartEnergyManagementPsPowerSequenceElementsType.Description value) {
        setDescription(value);
        return this;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmartEnergyManagementPsPowerSequenceElementsType.State }
     * @return
     *     The class instance
     */
    public SmartEnergyManagementPsPowerSequenceElementsType withState(SmartEnergyManagementPsPowerSequenceElementsType.State value) {
        setState(value);
        return this;
    }

    /**
     * Sets the value of the schedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmartEnergyManagementPsPowerSequenceElementsType.Schedule }
     * @return
     *     The class instance
     */
    public SmartEnergyManagementPsPowerSequenceElementsType withSchedule(SmartEnergyManagementPsPowerSequenceElementsType.Schedule value) {
        setSchedule(value);
        return this;
    }

    /**
     * Sets the value of the scheduleConstraints property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmartEnergyManagementPsPowerSequenceElementsType.ScheduleConstraints }
     * @return
     *     The class instance
     */
    public SmartEnergyManagementPsPowerSequenceElementsType withScheduleConstraints(SmartEnergyManagementPsPowerSequenceElementsType.ScheduleConstraints value) {
        setScheduleConstraints(value);
        return this;
    }

    /**
     * Sets the value of the schedulePreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmartEnergyManagementPsPowerSequenceElementsType.SchedulePreference }
     * @return
     *     The class instance
     */
    public SmartEnergyManagementPsPowerSequenceElementsType withSchedulePreference(SmartEnergyManagementPsPowerSequenceElementsType.SchedulePreference value) {
        setSchedulePreference(value);
        return this;
    }

    /**
     * Sets the value of the operatingConstraintsInterrupt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmartEnergyManagementPsPowerSequenceElementsType.OperatingConstraintsInterrupt }
     * @return
     *     The class instance
     */
    public SmartEnergyManagementPsPowerSequenceElementsType withOperatingConstraintsInterrupt(SmartEnergyManagementPsPowerSequenceElementsType.OperatingConstraintsInterrupt value) {
        setOperatingConstraintsInterrupt(value);
        return this;
    }

    /**
     * Sets the value of the operatingConstraintsDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmartEnergyManagementPsPowerSequenceElementsType.OperatingConstraintsDuration }
     * @return
     *     The class instance
     */
    public SmartEnergyManagementPsPowerSequenceElementsType withOperatingConstraintsDuration(SmartEnergyManagementPsPowerSequenceElementsType.OperatingConstraintsDuration value) {
        setOperatingConstraintsDuration(value);
        return this;
    }

    /**
     * Sets the value of the operatingConstraintsResumeImplication property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmartEnergyManagementPsPowerSequenceElementsType.OperatingConstraintsResumeImplication }
     * @return
     *     The class instance
     */
    public SmartEnergyManagementPsPowerSequenceElementsType withOperatingConstraintsResumeImplication(SmartEnergyManagementPsPowerSequenceElementsType.OperatingConstraintsResumeImplication value) {
        setOperatingConstraintsResumeImplication(value);
        return this;
    }

    /**
     * Sets the value of the powerTimeSlot property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmartEnergyManagementPsPowerTimeSlotElementsType }
     * @return
     *     The class instance
     */
    public SmartEnergyManagementPsPowerSequenceElementsType withPowerTimeSlot(SmartEnergyManagementPsPowerTimeSlotElementsType value) {
        setPowerTimeSlot(value);
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
        if (draftCopy instanceof SmartEnergyManagementPsPowerSequenceElementsType) {
            final SmartEnergyManagementPsPowerSequenceElementsType copy = ((SmartEnergyManagementPsPowerSequenceElementsType) draftCopy);
            {
                Boolean descriptionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.description!= null));
                if (descriptionShouldBeCopiedAndSet == Boolean.TRUE) {
                    SmartEnergyManagementPsPowerSequenceElementsType.Description sourceDescription;
                    sourceDescription = this.getDescription();
                    SmartEnergyManagementPsPowerSequenceElementsType.Description copyDescription = ((SmartEnergyManagementPsPowerSequenceElementsType.Description) strategy.copy(LocatorUtils.property(locator, "description", sourceDescription), sourceDescription, (this.description!= null)));
                    copy.setDescription(copyDescription);
                } else {
                    if (descriptionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.description = null;
                    }
                }
            }
            {
                Boolean stateShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.state!= null));
                if (stateShouldBeCopiedAndSet == Boolean.TRUE) {
                    SmartEnergyManagementPsPowerSequenceElementsType.State sourceState;
                    sourceState = this.getState();
                    SmartEnergyManagementPsPowerSequenceElementsType.State copyState = ((SmartEnergyManagementPsPowerSequenceElementsType.State) strategy.copy(LocatorUtils.property(locator, "state", sourceState), sourceState, (this.state!= null)));
                    copy.setState(copyState);
                } else {
                    if (stateShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.state = null;
                    }
                }
            }
            {
                Boolean scheduleShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.schedule!= null));
                if (scheduleShouldBeCopiedAndSet == Boolean.TRUE) {
                    SmartEnergyManagementPsPowerSequenceElementsType.Schedule sourceSchedule;
                    sourceSchedule = this.getSchedule();
                    SmartEnergyManagementPsPowerSequenceElementsType.Schedule copySchedule = ((SmartEnergyManagementPsPowerSequenceElementsType.Schedule) strategy.copy(LocatorUtils.property(locator, "schedule", sourceSchedule), sourceSchedule, (this.schedule!= null)));
                    copy.setSchedule(copySchedule);
                } else {
                    if (scheduleShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.schedule = null;
                    }
                }
            }
            {
                Boolean scheduleConstraintsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.scheduleConstraints!= null));
                if (scheduleConstraintsShouldBeCopiedAndSet == Boolean.TRUE) {
                    SmartEnergyManagementPsPowerSequenceElementsType.ScheduleConstraints sourceScheduleConstraints;
                    sourceScheduleConstraints = this.getScheduleConstraints();
                    SmartEnergyManagementPsPowerSequenceElementsType.ScheduleConstraints copyScheduleConstraints = ((SmartEnergyManagementPsPowerSequenceElementsType.ScheduleConstraints) strategy.copy(LocatorUtils.property(locator, "scheduleConstraints", sourceScheduleConstraints), sourceScheduleConstraints, (this.scheduleConstraints!= null)));
                    copy.setScheduleConstraints(copyScheduleConstraints);
                } else {
                    if (scheduleConstraintsShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.scheduleConstraints = null;
                    }
                }
            }
            {
                Boolean schedulePreferenceShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.schedulePreference!= null));
                if (schedulePreferenceShouldBeCopiedAndSet == Boolean.TRUE) {
                    SmartEnergyManagementPsPowerSequenceElementsType.SchedulePreference sourceSchedulePreference;
                    sourceSchedulePreference = this.getSchedulePreference();
                    SmartEnergyManagementPsPowerSequenceElementsType.SchedulePreference copySchedulePreference = ((SmartEnergyManagementPsPowerSequenceElementsType.SchedulePreference) strategy.copy(LocatorUtils.property(locator, "schedulePreference", sourceSchedulePreference), sourceSchedulePreference, (this.schedulePreference!= null)));
                    copy.setSchedulePreference(copySchedulePreference);
                } else {
                    if (schedulePreferenceShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.schedulePreference = null;
                    }
                }
            }
            {
                Boolean operatingConstraintsInterruptShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.operatingConstraintsInterrupt!= null));
                if (operatingConstraintsInterruptShouldBeCopiedAndSet == Boolean.TRUE) {
                    SmartEnergyManagementPsPowerSequenceElementsType.OperatingConstraintsInterrupt sourceOperatingConstraintsInterrupt;
                    sourceOperatingConstraintsInterrupt = this.getOperatingConstraintsInterrupt();
                    SmartEnergyManagementPsPowerSequenceElementsType.OperatingConstraintsInterrupt copyOperatingConstraintsInterrupt = ((SmartEnergyManagementPsPowerSequenceElementsType.OperatingConstraintsInterrupt) strategy.copy(LocatorUtils.property(locator, "operatingConstraintsInterrupt", sourceOperatingConstraintsInterrupt), sourceOperatingConstraintsInterrupt, (this.operatingConstraintsInterrupt!= null)));
                    copy.setOperatingConstraintsInterrupt(copyOperatingConstraintsInterrupt);
                } else {
                    if (operatingConstraintsInterruptShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.operatingConstraintsInterrupt = null;
                    }
                }
            }
            {
                Boolean operatingConstraintsDurationShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.operatingConstraintsDuration!= null));
                if (operatingConstraintsDurationShouldBeCopiedAndSet == Boolean.TRUE) {
                    SmartEnergyManagementPsPowerSequenceElementsType.OperatingConstraintsDuration sourceOperatingConstraintsDuration;
                    sourceOperatingConstraintsDuration = this.getOperatingConstraintsDuration();
                    SmartEnergyManagementPsPowerSequenceElementsType.OperatingConstraintsDuration copyOperatingConstraintsDuration = ((SmartEnergyManagementPsPowerSequenceElementsType.OperatingConstraintsDuration) strategy.copy(LocatorUtils.property(locator, "operatingConstraintsDuration", sourceOperatingConstraintsDuration), sourceOperatingConstraintsDuration, (this.operatingConstraintsDuration!= null)));
                    copy.setOperatingConstraintsDuration(copyOperatingConstraintsDuration);
                } else {
                    if (operatingConstraintsDurationShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.operatingConstraintsDuration = null;
                    }
                }
            }
            {
                Boolean operatingConstraintsResumeImplicationShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.operatingConstraintsResumeImplication!= null));
                if (operatingConstraintsResumeImplicationShouldBeCopiedAndSet == Boolean.TRUE) {
                    SmartEnergyManagementPsPowerSequenceElementsType.OperatingConstraintsResumeImplication sourceOperatingConstraintsResumeImplication;
                    sourceOperatingConstraintsResumeImplication = this.getOperatingConstraintsResumeImplication();
                    SmartEnergyManagementPsPowerSequenceElementsType.OperatingConstraintsResumeImplication copyOperatingConstraintsResumeImplication = ((SmartEnergyManagementPsPowerSequenceElementsType.OperatingConstraintsResumeImplication) strategy.copy(LocatorUtils.property(locator, "operatingConstraintsResumeImplication", sourceOperatingConstraintsResumeImplication), sourceOperatingConstraintsResumeImplication, (this.operatingConstraintsResumeImplication!= null)));
                    copy.setOperatingConstraintsResumeImplication(copyOperatingConstraintsResumeImplication);
                } else {
                    if (operatingConstraintsResumeImplicationShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.operatingConstraintsResumeImplication = null;
                    }
                }
            }
            {
                Boolean powerTimeSlotShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.powerTimeSlot!= null));
                if (powerTimeSlotShouldBeCopiedAndSet == Boolean.TRUE) {
                    SmartEnergyManagementPsPowerTimeSlotElementsType sourcePowerTimeSlot;
                    sourcePowerTimeSlot = this.getPowerTimeSlot();
                    SmartEnergyManagementPsPowerTimeSlotElementsType copyPowerTimeSlot = ((SmartEnergyManagementPsPowerTimeSlotElementsType) strategy.copy(LocatorUtils.property(locator, "powerTimeSlot", sourcePowerTimeSlot), sourcePowerTimeSlot, (this.powerTimeSlot!= null)));
                    copy.setPowerTimeSlot(copyPowerTimeSlot);
                } else {
                    if (powerTimeSlotShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.powerTimeSlot = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new SmartEnergyManagementPsPowerSequenceElementsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final SmartEnergyManagementPsPowerSequenceElementsType that = ((SmartEnergyManagementPsPowerSequenceElementsType) object);
        {
            SmartEnergyManagementPsPowerSequenceElementsType.Description leftDescription;
            leftDescription = this.getDescription();
            SmartEnergyManagementPsPowerSequenceElementsType.Description rightDescription;
            rightDescription = that.getDescription();
            if (this.description!= null) {
                if (that.description!= null) {
                    if (!leftDescription.equals(rightDescription)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.description!= null) {
                    return false;
                }
            }
        }
        {
            SmartEnergyManagementPsPowerSequenceElementsType.State leftState;
            leftState = this.getState();
            SmartEnergyManagementPsPowerSequenceElementsType.State rightState;
            rightState = that.getState();
            if (this.state!= null) {
                if (that.state!= null) {
                    if (!leftState.equals(rightState)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.state!= null) {
                    return false;
                }
            }
        }
        {
            SmartEnergyManagementPsPowerSequenceElementsType.Schedule leftSchedule;
            leftSchedule = this.getSchedule();
            SmartEnergyManagementPsPowerSequenceElementsType.Schedule rightSchedule;
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
            SmartEnergyManagementPsPowerSequenceElementsType.ScheduleConstraints leftScheduleConstraints;
            leftScheduleConstraints = this.getScheduleConstraints();
            SmartEnergyManagementPsPowerSequenceElementsType.ScheduleConstraints rightScheduleConstraints;
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
        {
            SmartEnergyManagementPsPowerSequenceElementsType.SchedulePreference leftSchedulePreference;
            leftSchedulePreference = this.getSchedulePreference();
            SmartEnergyManagementPsPowerSequenceElementsType.SchedulePreference rightSchedulePreference;
            rightSchedulePreference = that.getSchedulePreference();
            if (this.schedulePreference!= null) {
                if (that.schedulePreference!= null) {
                    if (!leftSchedulePreference.equals(rightSchedulePreference)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.schedulePreference!= null) {
                    return false;
                }
            }
        }
        {
            SmartEnergyManagementPsPowerSequenceElementsType.OperatingConstraintsInterrupt leftOperatingConstraintsInterrupt;
            leftOperatingConstraintsInterrupt = this.getOperatingConstraintsInterrupt();
            SmartEnergyManagementPsPowerSequenceElementsType.OperatingConstraintsInterrupt rightOperatingConstraintsInterrupt;
            rightOperatingConstraintsInterrupt = that.getOperatingConstraintsInterrupt();
            if (this.operatingConstraintsInterrupt!= null) {
                if (that.operatingConstraintsInterrupt!= null) {
                    if (!leftOperatingConstraintsInterrupt.equals(rightOperatingConstraintsInterrupt)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.operatingConstraintsInterrupt!= null) {
                    return false;
                }
            }
        }
        {
            SmartEnergyManagementPsPowerSequenceElementsType.OperatingConstraintsDuration leftOperatingConstraintsDuration;
            leftOperatingConstraintsDuration = this.getOperatingConstraintsDuration();
            SmartEnergyManagementPsPowerSequenceElementsType.OperatingConstraintsDuration rightOperatingConstraintsDuration;
            rightOperatingConstraintsDuration = that.getOperatingConstraintsDuration();
            if (this.operatingConstraintsDuration!= null) {
                if (that.operatingConstraintsDuration!= null) {
                    if (!leftOperatingConstraintsDuration.equals(rightOperatingConstraintsDuration)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.operatingConstraintsDuration!= null) {
                    return false;
                }
            }
        }
        {
            SmartEnergyManagementPsPowerSequenceElementsType.OperatingConstraintsResumeImplication leftOperatingConstraintsResumeImplication;
            leftOperatingConstraintsResumeImplication = this.getOperatingConstraintsResumeImplication();
            SmartEnergyManagementPsPowerSequenceElementsType.OperatingConstraintsResumeImplication rightOperatingConstraintsResumeImplication;
            rightOperatingConstraintsResumeImplication = that.getOperatingConstraintsResumeImplication();
            if (this.operatingConstraintsResumeImplication!= null) {
                if (that.operatingConstraintsResumeImplication!= null) {
                    if (!leftOperatingConstraintsResumeImplication.equals(rightOperatingConstraintsResumeImplication)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.operatingConstraintsResumeImplication!= null) {
                    return false;
                }
            }
        }
        {
            SmartEnergyManagementPsPowerTimeSlotElementsType leftPowerTimeSlot;
            leftPowerTimeSlot = this.getPowerTimeSlot();
            SmartEnergyManagementPsPowerTimeSlotElementsType rightPowerTimeSlot;
            rightPowerTimeSlot = that.getPowerTimeSlot();
            if (this.powerTimeSlot!= null) {
                if (that.powerTimeSlot!= null) {
                    if (!leftPowerTimeSlot.equals(rightPowerTimeSlot)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.powerTimeSlot!= null) {
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
            SmartEnergyManagementPsPowerSequenceElementsType.Description theDescription;
            theDescription = this.getDescription();
            if (this.description!= null) {
                currentHashCode += theDescription.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            SmartEnergyManagementPsPowerSequenceElementsType.State theState;
            theState = this.getState();
            if (this.state!= null) {
                currentHashCode += theState.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            SmartEnergyManagementPsPowerSequenceElementsType.Schedule theSchedule;
            theSchedule = this.getSchedule();
            if (this.schedule!= null) {
                currentHashCode += theSchedule.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            SmartEnergyManagementPsPowerSequenceElementsType.ScheduleConstraints theScheduleConstraints;
            theScheduleConstraints = this.getScheduleConstraints();
            if (this.scheduleConstraints!= null) {
                currentHashCode += theScheduleConstraints.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            SmartEnergyManagementPsPowerSequenceElementsType.SchedulePreference theSchedulePreference;
            theSchedulePreference = this.getSchedulePreference();
            if (this.schedulePreference!= null) {
                currentHashCode += theSchedulePreference.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            SmartEnergyManagementPsPowerSequenceElementsType.OperatingConstraintsInterrupt theOperatingConstraintsInterrupt;
            theOperatingConstraintsInterrupt = this.getOperatingConstraintsInterrupt();
            if (this.operatingConstraintsInterrupt!= null) {
                currentHashCode += theOperatingConstraintsInterrupt.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            SmartEnergyManagementPsPowerSequenceElementsType.OperatingConstraintsDuration theOperatingConstraintsDuration;
            theOperatingConstraintsDuration = this.getOperatingConstraintsDuration();
            if (this.operatingConstraintsDuration!= null) {
                currentHashCode += theOperatingConstraintsDuration.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            SmartEnergyManagementPsPowerSequenceElementsType.OperatingConstraintsResumeImplication theOperatingConstraintsResumeImplication;
            theOperatingConstraintsResumeImplication = this.getOperatingConstraintsResumeImplication();
            if (this.operatingConstraintsResumeImplication!= null) {
                currentHashCode += theOperatingConstraintsResumeImplication.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            SmartEnergyManagementPsPowerTimeSlotElementsType thePowerTimeSlot;
            thePowerTimeSlot = this.getPowerTimeSlot();
            if (this.powerTimeSlot!= null) {
                currentHashCode += thePowerTimeSlot.hashCode();
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
            SmartEnergyManagementPsPowerSequenceElementsType.Description theDescription;
            theDescription = this.getDescription();
            strategy.appendField(locator, this, "description", buffer, theDescription, (this.description!= null));
        }
        {
            SmartEnergyManagementPsPowerSequenceElementsType.State theState;
            theState = this.getState();
            strategy.appendField(locator, this, "state", buffer, theState, (this.state!= null));
        }
        {
            SmartEnergyManagementPsPowerSequenceElementsType.Schedule theSchedule;
            theSchedule = this.getSchedule();
            strategy.appendField(locator, this, "schedule", buffer, theSchedule, (this.schedule!= null));
        }
        {
            SmartEnergyManagementPsPowerSequenceElementsType.ScheduleConstraints theScheduleConstraints;
            theScheduleConstraints = this.getScheduleConstraints();
            strategy.appendField(locator, this, "scheduleConstraints", buffer, theScheduleConstraints, (this.scheduleConstraints!= null));
        }
        {
            SmartEnergyManagementPsPowerSequenceElementsType.SchedulePreference theSchedulePreference;
            theSchedulePreference = this.getSchedulePreference();
            strategy.appendField(locator, this, "schedulePreference", buffer, theSchedulePreference, (this.schedulePreference!= null));
        }
        {
            SmartEnergyManagementPsPowerSequenceElementsType.OperatingConstraintsInterrupt theOperatingConstraintsInterrupt;
            theOperatingConstraintsInterrupt = this.getOperatingConstraintsInterrupt();
            strategy.appendField(locator, this, "operatingConstraintsInterrupt", buffer, theOperatingConstraintsInterrupt, (this.operatingConstraintsInterrupt!= null));
        }
        {
            SmartEnergyManagementPsPowerSequenceElementsType.OperatingConstraintsDuration theOperatingConstraintsDuration;
            theOperatingConstraintsDuration = this.getOperatingConstraintsDuration();
            strategy.appendField(locator, this, "operatingConstraintsDuration", buffer, theOperatingConstraintsDuration, (this.operatingConstraintsDuration!= null));
        }
        {
            SmartEnergyManagementPsPowerSequenceElementsType.OperatingConstraintsResumeImplication theOperatingConstraintsResumeImplication;
            theOperatingConstraintsResumeImplication = this.getOperatingConstraintsResumeImplication();
            strategy.appendField(locator, this, "operatingConstraintsResumeImplication", buffer, theOperatingConstraintsResumeImplication, (this.operatingConstraintsResumeImplication!= null));
        }
        {
            SmartEnergyManagementPsPowerTimeSlotElementsType thePowerTimeSlot;
            thePowerTimeSlot = this.getPowerTimeSlot();
            strategy.appendField(locator, this, "powerTimeSlot", buffer, thePowerTimeSlot, (this.powerTimeSlot!= null));
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
     *     &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}PowerSequenceDescriptionDataElementsType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="sequenceId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
     *         &lt;element name="description" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
     *         &lt;element name="powerUnit" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
     *         &lt;element name="energyUnit" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
     *         &lt;element name="valueSource" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
     *         &lt;element name="taskIdentifier" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
     *         &lt;element name="repetitionsTotal" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
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
    public static class Description
        extends PowerSequenceDescriptionDataElementsType
        implements Cloneable, CopyTo, ToString
    {


        /**
         * Default no-arg constructor
         * 
         */
        public Description() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public Description(final ElementTagType sequenceId, final ElementTagType description, final ElementTagType positiveEnergyDirection, final ElementTagType powerUnit, final ElementTagType energyUnit, final ElementTagType valueSource, final ElementTagType scope, final ElementTagType taskIdentifier, final ElementTagType repetitionsTotal) {
            super(sequenceId, description, positiveEnergyDirection, powerUnit, energyUnit, valueSource, scope, taskIdentifier, repetitionsTotal);
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
        public SmartEnergyManagementPsPowerSequenceElementsType.Description withSequenceId(ElementTagType value) {
            setSequenceId(value);
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
        public SmartEnergyManagementPsPowerSequenceElementsType.Description withDescription(ElementTagType value) {
            setDescription(value);
            return this;
        }

        /**
         * Sets the value of the positiveEnergyDirection property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElementTagType }
         * @return
         *     The class instance
         */
        @Override
        public SmartEnergyManagementPsPowerSequenceElementsType.Description withPositiveEnergyDirection(ElementTagType value) {
            setPositiveEnergyDirection(value);
            return this;
        }

        /**
         * Sets the value of the powerUnit property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElementTagType }
         * @return
         *     The class instance
         */
        @Override
        public SmartEnergyManagementPsPowerSequenceElementsType.Description withPowerUnit(ElementTagType value) {
            setPowerUnit(value);
            return this;
        }

        /**
         * Sets the value of the energyUnit property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElementTagType }
         * @return
         *     The class instance
         */
        @Override
        public SmartEnergyManagementPsPowerSequenceElementsType.Description withEnergyUnit(ElementTagType value) {
            setEnergyUnit(value);
            return this;
        }

        /**
         * Sets the value of the valueSource property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElementTagType }
         * @return
         *     The class instance
         */
        @Override
        public SmartEnergyManagementPsPowerSequenceElementsType.Description withValueSource(ElementTagType value) {
            setValueSource(value);
            return this;
        }

        /**
         * Sets the value of the scope property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElementTagType }
         * @return
         *     The class instance
         */
        @Override
        public SmartEnergyManagementPsPowerSequenceElementsType.Description withScope(ElementTagType value) {
            setScope(value);
            return this;
        }

        /**
         * Sets the value of the taskIdentifier property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElementTagType }
         * @return
         *     The class instance
         */
        @Override
        public SmartEnergyManagementPsPowerSequenceElementsType.Description withTaskIdentifier(ElementTagType value) {
            setTaskIdentifier(value);
            return this;
        }

        /**
         * Sets the value of the repetitionsTotal property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElementTagType }
         * @return
         *     The class instance
         */
        @Override
        public SmartEnergyManagementPsPowerSequenceElementsType.Description withRepetitionsTotal(ElementTagType value) {
            setRepetitionsTotal(value);
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
            return new SmartEnergyManagementPsPowerSequenceElementsType.Description();
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
     *     &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}OperatingConstraintsDurationDataElementsType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="activeDurationMin" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
     *         &lt;element name="activeDurationMax" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
     *         &lt;element name="pauseDurationMin" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
     *         &lt;element name="pauseDurationMax" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
     *         &lt;element name="activeDurationSumMin" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
     *         &lt;element name="activeDurationSumMax" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
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
    public static class OperatingConstraintsDuration
        extends OperatingConstraintsDurationDataElementsType
        implements Cloneable, CopyTo, ToString
    {


        /**
         * Default no-arg constructor
         * 
         */
        public OperatingConstraintsDuration() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public OperatingConstraintsDuration(final ElementTagType sequenceId, final ElementTagType activeDurationMin, final ElementTagType activeDurationMax, final ElementTagType pauseDurationMin, final ElementTagType pauseDurationMax, final ElementTagType activeDurationSumMin, final ElementTagType activeDurationSumMax) {
            super(sequenceId, activeDurationMin, activeDurationMax, pauseDurationMin, pauseDurationMax, activeDurationSumMin, activeDurationSumMax);
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
        public SmartEnergyManagementPsPowerSequenceElementsType.OperatingConstraintsDuration withSequenceId(ElementTagType value) {
            setSequenceId(value);
            return this;
        }

        /**
         * Sets the value of the activeDurationMin property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElementTagType }
         * @return
         *     The class instance
         */
        @Override
        public SmartEnergyManagementPsPowerSequenceElementsType.OperatingConstraintsDuration withActiveDurationMin(ElementTagType value) {
            setActiveDurationMin(value);
            return this;
        }

        /**
         * Sets the value of the activeDurationMax property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElementTagType }
         * @return
         *     The class instance
         */
        @Override
        public SmartEnergyManagementPsPowerSequenceElementsType.OperatingConstraintsDuration withActiveDurationMax(ElementTagType value) {
            setActiveDurationMax(value);
            return this;
        }

        /**
         * Sets the value of the pauseDurationMin property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElementTagType }
         * @return
         *     The class instance
         */
        @Override
        public SmartEnergyManagementPsPowerSequenceElementsType.OperatingConstraintsDuration withPauseDurationMin(ElementTagType value) {
            setPauseDurationMin(value);
            return this;
        }

        /**
         * Sets the value of the pauseDurationMax property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElementTagType }
         * @return
         *     The class instance
         */
        @Override
        public SmartEnergyManagementPsPowerSequenceElementsType.OperatingConstraintsDuration withPauseDurationMax(ElementTagType value) {
            setPauseDurationMax(value);
            return this;
        }

        /**
         * Sets the value of the activeDurationSumMin property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElementTagType }
         * @return
         *     The class instance
         */
        @Override
        public SmartEnergyManagementPsPowerSequenceElementsType.OperatingConstraintsDuration withActiveDurationSumMin(ElementTagType value) {
            setActiveDurationSumMin(value);
            return this;
        }

        /**
         * Sets the value of the activeDurationSumMax property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElementTagType }
         * @return
         *     The class instance
         */
        @Override
        public SmartEnergyManagementPsPowerSequenceElementsType.OperatingConstraintsDuration withActiveDurationSumMax(ElementTagType value) {
            setActiveDurationSumMax(value);
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
            return new SmartEnergyManagementPsPowerSequenceElementsType.OperatingConstraintsDuration();
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
     *     &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}OperatingConstraintsInterruptDataElementsType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="isPausable" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
     *         &lt;element name="isStoppable" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
     *         &lt;element name="maxCyclesPerDay" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
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
    public static class OperatingConstraintsInterrupt
        extends OperatingConstraintsInterruptDataElementsType
        implements Cloneable, CopyTo, ToString
    {


        /**
         * Default no-arg constructor
         * 
         */
        public OperatingConstraintsInterrupt() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public OperatingConstraintsInterrupt(final ElementTagType sequenceId, final ElementTagType isPausable, final ElementTagType isStoppable, final ElementTagType notInterruptibleAtHighPower, final ElementTagType maxCyclesPerDay) {
            super(sequenceId, isPausable, isStoppable, notInterruptibleAtHighPower, maxCyclesPerDay);
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
        public SmartEnergyManagementPsPowerSequenceElementsType.OperatingConstraintsInterrupt withSequenceId(ElementTagType value) {
            setSequenceId(value);
            return this;
        }

        /**
         * Sets the value of the isPausable property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElementTagType }
         * @return
         *     The class instance
         */
        @Override
        public SmartEnergyManagementPsPowerSequenceElementsType.OperatingConstraintsInterrupt withIsPausable(ElementTagType value) {
            setIsPausable(value);
            return this;
        }

        /**
         * Sets the value of the isStoppable property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElementTagType }
         * @return
         *     The class instance
         */
        @Override
        public SmartEnergyManagementPsPowerSequenceElementsType.OperatingConstraintsInterrupt withIsStoppable(ElementTagType value) {
            setIsStoppable(value);
            return this;
        }

        /**
         * Sets the value of the notInterruptibleAtHighPower property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElementTagType }
         * @return
         *     The class instance
         */
        @Override
        public SmartEnergyManagementPsPowerSequenceElementsType.OperatingConstraintsInterrupt withNotInterruptibleAtHighPower(ElementTagType value) {
            setNotInterruptibleAtHighPower(value);
            return this;
        }

        /**
         * Sets the value of the maxCyclesPerDay property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElementTagType }
         * @return
         *     The class instance
         */
        @Override
        public SmartEnergyManagementPsPowerSequenceElementsType.OperatingConstraintsInterrupt withMaxCyclesPerDay(ElementTagType value) {
            setMaxCyclesPerDay(value);
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
            return new SmartEnergyManagementPsPowerSequenceElementsType.OperatingConstraintsInterrupt();
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
     *     &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}OperatingConstraintsResumeImplicationDataElementsType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="resumeEnergyEstimated" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberElementsType" minOccurs="0"/&gt;
     *         &lt;element name="energyUnit" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
     *         &lt;element name="resumeCostEstimated" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberElementsType" minOccurs="0"/&gt;
     *         &lt;element name="currency" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
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
    public static class OperatingConstraintsResumeImplication
        extends OperatingConstraintsResumeImplicationDataElementsType
        implements Cloneable, CopyTo, ToString
    {


        /**
         * Default no-arg constructor
         * 
         */
        public OperatingConstraintsResumeImplication() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public OperatingConstraintsResumeImplication(final ElementTagType sequenceId, final ScaledNumberElementsType resumeEnergyEstimated, final ElementTagType energyUnit, final ScaledNumberElementsType resumeCostEstimated, final ElementTagType currency) {
            super(sequenceId, resumeEnergyEstimated, energyUnit, resumeCostEstimated, currency);
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
        public SmartEnergyManagementPsPowerSequenceElementsType.OperatingConstraintsResumeImplication withSequenceId(ElementTagType value) {
            setSequenceId(value);
            return this;
        }

        /**
         * Sets the value of the resumeEnergyEstimated property.
         * 
         * @param value
         *     allowed object is
         *     {@link ScaledNumberElementsType }
         * @return
         *     The class instance
         */
        @Override
        public SmartEnergyManagementPsPowerSequenceElementsType.OperatingConstraintsResumeImplication withResumeEnergyEstimated(ScaledNumberElementsType value) {
            setResumeEnergyEstimated(value);
            return this;
        }

        /**
         * Sets the value of the energyUnit property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElementTagType }
         * @return
         *     The class instance
         */
        @Override
        public SmartEnergyManagementPsPowerSequenceElementsType.OperatingConstraintsResumeImplication withEnergyUnit(ElementTagType value) {
            setEnergyUnit(value);
            return this;
        }

        /**
         * Sets the value of the resumeCostEstimated property.
         * 
         * @param value
         *     allowed object is
         *     {@link ScaledNumberElementsType }
         * @return
         *     The class instance
         */
        @Override
        public SmartEnergyManagementPsPowerSequenceElementsType.OperatingConstraintsResumeImplication withResumeCostEstimated(ScaledNumberElementsType value) {
            setResumeCostEstimated(value);
            return this;
        }

        /**
         * Sets the value of the currency property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElementTagType }
         * @return
         *     The class instance
         */
        @Override
        public SmartEnergyManagementPsPowerSequenceElementsType.OperatingConstraintsResumeImplication withCurrency(ElementTagType value) {
            setCurrency(value);
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
            return new SmartEnergyManagementPsPowerSequenceElementsType.OperatingConstraintsResumeImplication();
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
     *     &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}PowerSequenceScheduleDataElementsType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="startTime" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
     *         &lt;element name="endTime" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
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
        extends PowerSequenceScheduleDataElementsType
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
        public Schedule(final ElementTagType sequenceId, final ElementTagType startTime, final ElementTagType endTime) {
            super(sequenceId, startTime, endTime);
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
        public SmartEnergyManagementPsPowerSequenceElementsType.Schedule withSequenceId(ElementTagType value) {
            setSequenceId(value);
            return this;
        }

        /**
         * Sets the value of the startTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElementTagType }
         * @return
         *     The class instance
         */
        @Override
        public SmartEnergyManagementPsPowerSequenceElementsType.Schedule withStartTime(ElementTagType value) {
            setStartTime(value);
            return this;
        }

        /**
         * Sets the value of the endTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElementTagType }
         * @return
         *     The class instance
         */
        @Override
        public SmartEnergyManagementPsPowerSequenceElementsType.Schedule withEndTime(ElementTagType value) {
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
            return new SmartEnergyManagementPsPowerSequenceElementsType.Schedule();
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
     *     &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}PowerSequenceScheduleConstraintsDataElementsType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="earliestStartTime" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
     *         &lt;element name="latestEndTime" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
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
        extends PowerSequenceScheduleConstraintsDataElementsType
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
        public ScheduleConstraints(final ElementTagType sequenceId, final ElementTagType earliestStartTime, final ElementTagType latestStartTime, final ElementTagType earliestEndTime, final ElementTagType latestEndTime, final ElementTagType optionalSequence) {
            super(sequenceId, earliestStartTime, latestStartTime, earliestEndTime, latestEndTime, optionalSequence);
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
        public SmartEnergyManagementPsPowerSequenceElementsType.ScheduleConstraints withSequenceId(ElementTagType value) {
            setSequenceId(value);
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
        public SmartEnergyManagementPsPowerSequenceElementsType.ScheduleConstraints withEarliestStartTime(ElementTagType value) {
            setEarliestStartTime(value);
            return this;
        }

        /**
         * Sets the value of the latestStartTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElementTagType }
         * @return
         *     The class instance
         */
        @Override
        public SmartEnergyManagementPsPowerSequenceElementsType.ScheduleConstraints withLatestStartTime(ElementTagType value) {
            setLatestStartTime(value);
            return this;
        }

        /**
         * Sets the value of the earliestEndTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElementTagType }
         * @return
         *     The class instance
         */
        @Override
        public SmartEnergyManagementPsPowerSequenceElementsType.ScheduleConstraints withEarliestEndTime(ElementTagType value) {
            setEarliestEndTime(value);
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
        public SmartEnergyManagementPsPowerSequenceElementsType.ScheduleConstraints withLatestEndTime(ElementTagType value) {
            setLatestEndTime(value);
            return this;
        }

        /**
         * Sets the value of the optionalSequence property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElementTagType }
         * @return
         *     The class instance
         */
        @Override
        public SmartEnergyManagementPsPowerSequenceElementsType.ScheduleConstraints withOptionalSequence(ElementTagType value) {
            setOptionalSequence(value);
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
            return new SmartEnergyManagementPsPowerSequenceElementsType.ScheduleConstraints();
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
     *     &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}PowerSequenceSchedulePreferenceDataElementsType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="greenest" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
     *         &lt;element name="cheapest" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
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
    public static class SchedulePreference
        extends PowerSequenceSchedulePreferenceDataElementsType
        implements Cloneable, CopyTo, ToString
    {


        /**
         * Default no-arg constructor
         * 
         */
        public SchedulePreference() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public SchedulePreference(final ElementTagType sequenceId, final ElementTagType greenest, final ElementTagType cheapest) {
            super(sequenceId, greenest, cheapest);
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
        public SmartEnergyManagementPsPowerSequenceElementsType.SchedulePreference withSequenceId(ElementTagType value) {
            setSequenceId(value);
            return this;
        }

        /**
         * Sets the value of the greenest property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElementTagType }
         * @return
         *     The class instance
         */
        @Override
        public SmartEnergyManagementPsPowerSequenceElementsType.SchedulePreference withGreenest(ElementTagType value) {
            setGreenest(value);
            return this;
        }

        /**
         * Sets the value of the cheapest property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElementTagType }
         * @return
         *     The class instance
         */
        @Override
        public SmartEnergyManagementPsPowerSequenceElementsType.SchedulePreference withCheapest(ElementTagType value) {
            setCheapest(value);
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
            return new SmartEnergyManagementPsPowerSequenceElementsType.SchedulePreference();
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
     *     &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}PowerSequenceStateDataElementsType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="state" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
     *         &lt;element name="activeSlotNumber" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
     *         &lt;element name="elapsedSlotTime" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
     *         &lt;element name="remainingSlotTime" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
     *         &lt;element name="sequenceRemoteControllable" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
     *         &lt;element name="activeRepetitionNumber" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
     *         &lt;element name="remainingPauseTime" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
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
    public static class State
        extends PowerSequenceStateDataElementsType
        implements Cloneable, CopyTo, ToString
    {


        /**
         * Default no-arg constructor
         * 
         */
        public State() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public State(final ElementTagType sequenceId, final ElementTagType state, final ElementTagType activeSlotNumber, final ElementTagType elapsedSlotTime, final ElementTagType remainingSlotTime, final ElementTagType sequenceRemoteControllable, final ElementTagType activeRepetitionNumber, final ElementTagType remainingPauseTime) {
            super(sequenceId, state, activeSlotNumber, elapsedSlotTime, remainingSlotTime, sequenceRemoteControllable, activeRepetitionNumber, remainingPauseTime);
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
        public SmartEnergyManagementPsPowerSequenceElementsType.State withSequenceId(ElementTagType value) {
            setSequenceId(value);
            return this;
        }

        /**
         * Sets the value of the state property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElementTagType }
         * @return
         *     The class instance
         */
        @Override
        public SmartEnergyManagementPsPowerSequenceElementsType.State withState(ElementTagType value) {
            setState(value);
            return this;
        }

        /**
         * Sets the value of the activeSlotNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElementTagType }
         * @return
         *     The class instance
         */
        @Override
        public SmartEnergyManagementPsPowerSequenceElementsType.State withActiveSlotNumber(ElementTagType value) {
            setActiveSlotNumber(value);
            return this;
        }

        /**
         * Sets the value of the elapsedSlotTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElementTagType }
         * @return
         *     The class instance
         */
        @Override
        public SmartEnergyManagementPsPowerSequenceElementsType.State withElapsedSlotTime(ElementTagType value) {
            setElapsedSlotTime(value);
            return this;
        }

        /**
         * Sets the value of the remainingSlotTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElementTagType }
         * @return
         *     The class instance
         */
        @Override
        public SmartEnergyManagementPsPowerSequenceElementsType.State withRemainingSlotTime(ElementTagType value) {
            setRemainingSlotTime(value);
            return this;
        }

        /**
         * Sets the value of the sequenceRemoteControllable property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElementTagType }
         * @return
         *     The class instance
         */
        @Override
        public SmartEnergyManagementPsPowerSequenceElementsType.State withSequenceRemoteControllable(ElementTagType value) {
            setSequenceRemoteControllable(value);
            return this;
        }

        /**
         * Sets the value of the activeRepetitionNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElementTagType }
         * @return
         *     The class instance
         */
        @Override
        public SmartEnergyManagementPsPowerSequenceElementsType.State withActiveRepetitionNumber(ElementTagType value) {
            setActiveRepetitionNumber(value);
            return this;
        }

        /**
         * Sets the value of the remainingPauseTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElementTagType }
         * @return
         *     The class instance
         */
        @Override
        public SmartEnergyManagementPsPowerSequenceElementsType.State withRemainingPauseTime(ElementTagType value) {
            setRemainingPauseTime(value);
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
            return new SmartEnergyManagementPsPowerSequenceElementsType.State();
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
