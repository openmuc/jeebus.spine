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
 * <p>Java class for SmartEnergyManagementPsPowerSequenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SmartEnergyManagementPsPowerSequenceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="description" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}PowerSequenceDescriptionDataType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="sequenceId" type="{http://docs.eebus.org/spine/xsd/v1}PowerSequenceIdType" minOccurs="0"/&gt;
 *                   &lt;element name="description" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}DescriptionType"&gt;
 *                         &lt;minLength value="1"/&gt;
 *                         &lt;maxLength value="60"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="powerUnit" type="{http://docs.eebus.org/spine/xsd/v1}UnitOfMeasurementType" minOccurs="0"/&gt;
 *                   &lt;element name="energyUnit" type="{http://docs.eebus.org/spine/xsd/v1}UnitOfMeasurementType" minOccurs="0"/&gt;
 *                   &lt;element name="valueSource" type="{http://docs.eebus.org/spine/xsd/v1}MeasurementValueSourceType" minOccurs="0"/&gt;
 *                   &lt;element name="taskIdentifier" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *                   &lt;element name="repetitionsTotal" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="state" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}PowerSequenceStateDataType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="state" type="{http://docs.eebus.org/spine/xsd/v1}PowerSequenceStateType" minOccurs="0"/&gt;
 *                   &lt;element name="activeSlotNumber" type="{http://docs.eebus.org/spine/xsd/v1}PowerTimeSlotNumberType" minOccurs="0"/&gt;
 *                   &lt;element name="elapsedSlotTime" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *                   &lt;element name="remainingSlotTime" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *                   &lt;element name="sequenceRemoteControllable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="activeRepetitionNumber" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *                   &lt;element name="remainingPauseTime" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="schedule" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}PowerSequenceScheduleDataType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="startTime" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *                   &lt;element name="endTime" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="scheduleConstraints" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}PowerSequenceScheduleConstraintsDataType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="earliestStartTime" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *                   &lt;element name="latestEndTime" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="schedulePreference" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}PowerSequenceSchedulePreferenceDataType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="greenest" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="cheapest" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="operatingConstraintsInterrupt" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}OperatingConstraintsInterruptDataType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="isPausable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="isStoppable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="maxCyclesPerDay" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="operatingConstraintsDuration" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}OperatingConstraintsDurationDataType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="activeDurationMin" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *                   &lt;element name="activeDurationMax" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *                   &lt;element name="pauseDurationMin" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *                   &lt;element name="pauseDurationMax" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *                   &lt;element name="activeDurationSumMin" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *                   &lt;element name="activeDurationSumMax" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="operatingConstraintsResumeImplication" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}OperatingConstraintsResumeImplicationDataType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="resumeEnergyEstimated" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberType" minOccurs="0"/&gt;
 *                   &lt;element name="energyUnit" type="{http://docs.eebus.org/spine/xsd/v1}UnitOfMeasurementType" minOccurs="0"/&gt;
 *                   &lt;element name="resumeCostEstimated" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberType" minOccurs="0"/&gt;
 *                   &lt;element name="currency" type="{http://docs.eebus.org/spine/xsd/v1}CurrencyType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="powerTimeSlot" type="{http://docs.eebus.org/spine/xsd/v1}SmartEnergyManagementPsPowerTimeSlotType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SmartEnergyManagementPsPowerSequenceType", propOrder = {
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
public class SmartEnergyManagementPsPowerSequenceType implements Cloneable, CopyTo, ToString
{

    protected SmartEnergyManagementPsPowerSequenceType.Description description;
    protected SmartEnergyManagementPsPowerSequenceType.State state;
    protected SmartEnergyManagementPsPowerSequenceType.Schedule schedule;
    protected SmartEnergyManagementPsPowerSequenceType.ScheduleConstraints scheduleConstraints;
    protected SmartEnergyManagementPsPowerSequenceType.SchedulePreference schedulePreference;
    protected SmartEnergyManagementPsPowerSequenceType.OperatingConstraintsInterrupt operatingConstraintsInterrupt;
    protected SmartEnergyManagementPsPowerSequenceType.OperatingConstraintsDuration operatingConstraintsDuration;
    protected SmartEnergyManagementPsPowerSequenceType.OperatingConstraintsResumeImplication operatingConstraintsResumeImplication;
    protected List<SmartEnergyManagementPsPowerTimeSlotType> powerTimeSlot;

    /**
     * Default no-arg constructor
     * 
     */
    public SmartEnergyManagementPsPowerSequenceType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public SmartEnergyManagementPsPowerSequenceType(final SmartEnergyManagementPsPowerSequenceType.Description description, final SmartEnergyManagementPsPowerSequenceType.State state, final SmartEnergyManagementPsPowerSequenceType.Schedule schedule, final SmartEnergyManagementPsPowerSequenceType.ScheduleConstraints scheduleConstraints, final SmartEnergyManagementPsPowerSequenceType.SchedulePreference schedulePreference, final SmartEnergyManagementPsPowerSequenceType.OperatingConstraintsInterrupt operatingConstraintsInterrupt, final SmartEnergyManagementPsPowerSequenceType.OperatingConstraintsDuration operatingConstraintsDuration, final SmartEnergyManagementPsPowerSequenceType.OperatingConstraintsResumeImplication operatingConstraintsResumeImplication, final List<SmartEnergyManagementPsPowerTimeSlotType> powerTimeSlot) {
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
     *     {@link SmartEnergyManagementPsPowerSequenceType.Description }
     *     
     */
    public SmartEnergyManagementPsPowerSequenceType.Description getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmartEnergyManagementPsPowerSequenceType.Description }
     *     
     */
    public void setDescription(SmartEnergyManagementPsPowerSequenceType.Description value) {
        this.description = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link SmartEnergyManagementPsPowerSequenceType.State }
     *     
     */
    public SmartEnergyManagementPsPowerSequenceType.State getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmartEnergyManagementPsPowerSequenceType.State }
     *     
     */
    public void setState(SmartEnergyManagementPsPowerSequenceType.State value) {
        this.state = value;
    }

    /**
     * Gets the value of the schedule property.
     * 
     * @return
     *     possible object is
     *     {@link SmartEnergyManagementPsPowerSequenceType.Schedule }
     *     
     */
    public SmartEnergyManagementPsPowerSequenceType.Schedule getSchedule() {
        return schedule;
    }

    /**
     * Sets the value of the schedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmartEnergyManagementPsPowerSequenceType.Schedule }
     *     
     */
    public void setSchedule(SmartEnergyManagementPsPowerSequenceType.Schedule value) {
        this.schedule = value;
    }

    /**
     * Gets the value of the scheduleConstraints property.
     * 
     * @return
     *     possible object is
     *     {@link SmartEnergyManagementPsPowerSequenceType.ScheduleConstraints }
     *     
     */
    public SmartEnergyManagementPsPowerSequenceType.ScheduleConstraints getScheduleConstraints() {
        return scheduleConstraints;
    }

    /**
     * Sets the value of the scheduleConstraints property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmartEnergyManagementPsPowerSequenceType.ScheduleConstraints }
     *     
     */
    public void setScheduleConstraints(SmartEnergyManagementPsPowerSequenceType.ScheduleConstraints value) {
        this.scheduleConstraints = value;
    }

    /**
     * Gets the value of the schedulePreference property.
     * 
     * @return
     *     possible object is
     *     {@link SmartEnergyManagementPsPowerSequenceType.SchedulePreference }
     *     
     */
    public SmartEnergyManagementPsPowerSequenceType.SchedulePreference getSchedulePreference() {
        return schedulePreference;
    }

    /**
     * Sets the value of the schedulePreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmartEnergyManagementPsPowerSequenceType.SchedulePreference }
     *     
     */
    public void setSchedulePreference(SmartEnergyManagementPsPowerSequenceType.SchedulePreference value) {
        this.schedulePreference = value;
    }

    /**
     * Gets the value of the operatingConstraintsInterrupt property.
     * 
     * @return
     *     possible object is
     *     {@link SmartEnergyManagementPsPowerSequenceType.OperatingConstraintsInterrupt }
     *     
     */
    public SmartEnergyManagementPsPowerSequenceType.OperatingConstraintsInterrupt getOperatingConstraintsInterrupt() {
        return operatingConstraintsInterrupt;
    }

    /**
     * Sets the value of the operatingConstraintsInterrupt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmartEnergyManagementPsPowerSequenceType.OperatingConstraintsInterrupt }
     *     
     */
    public void setOperatingConstraintsInterrupt(SmartEnergyManagementPsPowerSequenceType.OperatingConstraintsInterrupt value) {
        this.operatingConstraintsInterrupt = value;
    }

    /**
     * Gets the value of the operatingConstraintsDuration property.
     * 
     * @return
     *     possible object is
     *     {@link SmartEnergyManagementPsPowerSequenceType.OperatingConstraintsDuration }
     *     
     */
    public SmartEnergyManagementPsPowerSequenceType.OperatingConstraintsDuration getOperatingConstraintsDuration() {
        return operatingConstraintsDuration;
    }

    /**
     * Sets the value of the operatingConstraintsDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmartEnergyManagementPsPowerSequenceType.OperatingConstraintsDuration }
     *     
     */
    public void setOperatingConstraintsDuration(SmartEnergyManagementPsPowerSequenceType.OperatingConstraintsDuration value) {
        this.operatingConstraintsDuration = value;
    }

    /**
     * Gets the value of the operatingConstraintsResumeImplication property.
     * 
     * @return
     *     possible object is
     *     {@link SmartEnergyManagementPsPowerSequenceType.OperatingConstraintsResumeImplication }
     *     
     */
    public SmartEnergyManagementPsPowerSequenceType.OperatingConstraintsResumeImplication getOperatingConstraintsResumeImplication() {
        return operatingConstraintsResumeImplication;
    }

    /**
     * Sets the value of the operatingConstraintsResumeImplication property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmartEnergyManagementPsPowerSequenceType.OperatingConstraintsResumeImplication }
     *     
     */
    public void setOperatingConstraintsResumeImplication(SmartEnergyManagementPsPowerSequenceType.OperatingConstraintsResumeImplication value) {
        this.operatingConstraintsResumeImplication = value;
    }

    /**
     * Gets the value of the powerTimeSlot property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the powerTimeSlot property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPowerTimeSlot().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SmartEnergyManagementPsPowerTimeSlotType }
     * 
     * 
     */
    public List<SmartEnergyManagementPsPowerTimeSlotType> getPowerTimeSlot() {
        if (powerTimeSlot == null) {
            powerTimeSlot = new ArrayList<SmartEnergyManagementPsPowerTimeSlotType>();
        }
        return this.powerTimeSlot;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmartEnergyManagementPsPowerSequenceType.Description }
     * @return
     *     The class instance
     */
    public SmartEnergyManagementPsPowerSequenceType withDescription(SmartEnergyManagementPsPowerSequenceType.Description value) {
        setDescription(value);
        return this;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmartEnergyManagementPsPowerSequenceType.State }
     * @return
     *     The class instance
     */
    public SmartEnergyManagementPsPowerSequenceType withState(SmartEnergyManagementPsPowerSequenceType.State value) {
        setState(value);
        return this;
    }

    /**
     * Sets the value of the schedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmartEnergyManagementPsPowerSequenceType.Schedule }
     * @return
     *     The class instance
     */
    public SmartEnergyManagementPsPowerSequenceType withSchedule(SmartEnergyManagementPsPowerSequenceType.Schedule value) {
        setSchedule(value);
        return this;
    }

    /**
     * Sets the value of the scheduleConstraints property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmartEnergyManagementPsPowerSequenceType.ScheduleConstraints }
     * @return
     *     The class instance
     */
    public SmartEnergyManagementPsPowerSequenceType withScheduleConstraints(SmartEnergyManagementPsPowerSequenceType.ScheduleConstraints value) {
        setScheduleConstraints(value);
        return this;
    }

    /**
     * Sets the value of the schedulePreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmartEnergyManagementPsPowerSequenceType.SchedulePreference }
     * @return
     *     The class instance
     */
    public SmartEnergyManagementPsPowerSequenceType withSchedulePreference(SmartEnergyManagementPsPowerSequenceType.SchedulePreference value) {
        setSchedulePreference(value);
        return this;
    }

    /**
     * Sets the value of the operatingConstraintsInterrupt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmartEnergyManagementPsPowerSequenceType.OperatingConstraintsInterrupt }
     * @return
     *     The class instance
     */
    public SmartEnergyManagementPsPowerSequenceType withOperatingConstraintsInterrupt(SmartEnergyManagementPsPowerSequenceType.OperatingConstraintsInterrupt value) {
        setOperatingConstraintsInterrupt(value);
        return this;
    }

    /**
     * Sets the value of the operatingConstraintsDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmartEnergyManagementPsPowerSequenceType.OperatingConstraintsDuration }
     * @return
     *     The class instance
     */
    public SmartEnergyManagementPsPowerSequenceType withOperatingConstraintsDuration(SmartEnergyManagementPsPowerSequenceType.OperatingConstraintsDuration value) {
        setOperatingConstraintsDuration(value);
        return this;
    }

    /**
     * Sets the value of the operatingConstraintsResumeImplication property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmartEnergyManagementPsPowerSequenceType.OperatingConstraintsResumeImplication }
     * @return
     *     The class instance
     */
    public SmartEnergyManagementPsPowerSequenceType withOperatingConstraintsResumeImplication(SmartEnergyManagementPsPowerSequenceType.OperatingConstraintsResumeImplication value) {
        setOperatingConstraintsResumeImplication(value);
        return this;
    }

    /**
     * Adds objects to the list of PowerTimeSlot using add method
     * 
     * @param values
     *     objects to add to the list PowerTimeSlot
     * @return
     *     The class instance
     */
    public SmartEnergyManagementPsPowerSequenceType withPowerTimeSlot(SmartEnergyManagementPsPowerTimeSlotType... values) {
        if (values!= null) {
            for (SmartEnergyManagementPsPowerTimeSlotType value: values) {
                getPowerTimeSlot().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of PowerTimeSlot using addAll method
     * 
     * @param values
     *     objects to add to the list PowerTimeSlot
     * @return
     *     The class instance
     */
    public SmartEnergyManagementPsPowerSequenceType withPowerTimeSlot(Collection<SmartEnergyManagementPsPowerTimeSlotType> values) {
        if (values!= null) {
            getPowerTimeSlot().addAll(values);
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
        if (draftCopy instanceof SmartEnergyManagementPsPowerSequenceType) {
            final SmartEnergyManagementPsPowerSequenceType copy = ((SmartEnergyManagementPsPowerSequenceType) draftCopy);
            {
                Boolean descriptionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.description!= null));
                if (descriptionShouldBeCopiedAndSet == Boolean.TRUE) {
                    SmartEnergyManagementPsPowerSequenceType.Description sourceDescription;
                    sourceDescription = this.getDescription();
                    SmartEnergyManagementPsPowerSequenceType.Description copyDescription = ((SmartEnergyManagementPsPowerSequenceType.Description) strategy.copy(LocatorUtils.property(locator, "description", sourceDescription), sourceDescription, (this.description!= null)));
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
                    SmartEnergyManagementPsPowerSequenceType.State sourceState;
                    sourceState = this.getState();
                    SmartEnergyManagementPsPowerSequenceType.State copyState = ((SmartEnergyManagementPsPowerSequenceType.State) strategy.copy(LocatorUtils.property(locator, "state", sourceState), sourceState, (this.state!= null)));
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
                    SmartEnergyManagementPsPowerSequenceType.Schedule sourceSchedule;
                    sourceSchedule = this.getSchedule();
                    SmartEnergyManagementPsPowerSequenceType.Schedule copySchedule = ((SmartEnergyManagementPsPowerSequenceType.Schedule) strategy.copy(LocatorUtils.property(locator, "schedule", sourceSchedule), sourceSchedule, (this.schedule!= null)));
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
                    SmartEnergyManagementPsPowerSequenceType.ScheduleConstraints sourceScheduleConstraints;
                    sourceScheduleConstraints = this.getScheduleConstraints();
                    SmartEnergyManagementPsPowerSequenceType.ScheduleConstraints copyScheduleConstraints = ((SmartEnergyManagementPsPowerSequenceType.ScheduleConstraints) strategy.copy(LocatorUtils.property(locator, "scheduleConstraints", sourceScheduleConstraints), sourceScheduleConstraints, (this.scheduleConstraints!= null)));
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
                    SmartEnergyManagementPsPowerSequenceType.SchedulePreference sourceSchedulePreference;
                    sourceSchedulePreference = this.getSchedulePreference();
                    SmartEnergyManagementPsPowerSequenceType.SchedulePreference copySchedulePreference = ((SmartEnergyManagementPsPowerSequenceType.SchedulePreference) strategy.copy(LocatorUtils.property(locator, "schedulePreference", sourceSchedulePreference), sourceSchedulePreference, (this.schedulePreference!= null)));
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
                    SmartEnergyManagementPsPowerSequenceType.OperatingConstraintsInterrupt sourceOperatingConstraintsInterrupt;
                    sourceOperatingConstraintsInterrupt = this.getOperatingConstraintsInterrupt();
                    SmartEnergyManagementPsPowerSequenceType.OperatingConstraintsInterrupt copyOperatingConstraintsInterrupt = ((SmartEnergyManagementPsPowerSequenceType.OperatingConstraintsInterrupt) strategy.copy(LocatorUtils.property(locator, "operatingConstraintsInterrupt", sourceOperatingConstraintsInterrupt), sourceOperatingConstraintsInterrupt, (this.operatingConstraintsInterrupt!= null)));
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
                    SmartEnergyManagementPsPowerSequenceType.OperatingConstraintsDuration sourceOperatingConstraintsDuration;
                    sourceOperatingConstraintsDuration = this.getOperatingConstraintsDuration();
                    SmartEnergyManagementPsPowerSequenceType.OperatingConstraintsDuration copyOperatingConstraintsDuration = ((SmartEnergyManagementPsPowerSequenceType.OperatingConstraintsDuration) strategy.copy(LocatorUtils.property(locator, "operatingConstraintsDuration", sourceOperatingConstraintsDuration), sourceOperatingConstraintsDuration, (this.operatingConstraintsDuration!= null)));
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
                    SmartEnergyManagementPsPowerSequenceType.OperatingConstraintsResumeImplication sourceOperatingConstraintsResumeImplication;
                    sourceOperatingConstraintsResumeImplication = this.getOperatingConstraintsResumeImplication();
                    SmartEnergyManagementPsPowerSequenceType.OperatingConstraintsResumeImplication copyOperatingConstraintsResumeImplication = ((SmartEnergyManagementPsPowerSequenceType.OperatingConstraintsResumeImplication) strategy.copy(LocatorUtils.property(locator, "operatingConstraintsResumeImplication", sourceOperatingConstraintsResumeImplication), sourceOperatingConstraintsResumeImplication, (this.operatingConstraintsResumeImplication!= null)));
                    copy.setOperatingConstraintsResumeImplication(copyOperatingConstraintsResumeImplication);
                } else {
                    if (operatingConstraintsResumeImplicationShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.operatingConstraintsResumeImplication = null;
                    }
                }
            }
            {
                Boolean powerTimeSlotShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.powerTimeSlot!= null)&&(!this.powerTimeSlot.isEmpty())));
                if (powerTimeSlotShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<SmartEnergyManagementPsPowerTimeSlotType> sourcePowerTimeSlot;
                    sourcePowerTimeSlot = (((this.powerTimeSlot!= null)&&(!this.powerTimeSlot.isEmpty()))?this.getPowerTimeSlot():null);
                    @SuppressWarnings("unchecked")
                    List<SmartEnergyManagementPsPowerTimeSlotType> copyPowerTimeSlot = ((List<SmartEnergyManagementPsPowerTimeSlotType> ) strategy.copy(LocatorUtils.property(locator, "powerTimeSlot", sourcePowerTimeSlot), sourcePowerTimeSlot, ((this.powerTimeSlot!= null)&&(!this.powerTimeSlot.isEmpty()))));
                    copy.powerTimeSlot = null;
                    if (copyPowerTimeSlot!= null) {
                        List<SmartEnergyManagementPsPowerTimeSlotType> uniquePowerTimeSlotl = copy.getPowerTimeSlot();
                        uniquePowerTimeSlotl.addAll(copyPowerTimeSlot);
                    }
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
        return new SmartEnergyManagementPsPowerSequenceType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final SmartEnergyManagementPsPowerSequenceType that = ((SmartEnergyManagementPsPowerSequenceType) object);
        {
            SmartEnergyManagementPsPowerSequenceType.Description leftDescription;
            leftDescription = this.getDescription();
            SmartEnergyManagementPsPowerSequenceType.Description rightDescription;
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
            SmartEnergyManagementPsPowerSequenceType.State leftState;
            leftState = this.getState();
            SmartEnergyManagementPsPowerSequenceType.State rightState;
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
            SmartEnergyManagementPsPowerSequenceType.Schedule leftSchedule;
            leftSchedule = this.getSchedule();
            SmartEnergyManagementPsPowerSequenceType.Schedule rightSchedule;
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
            SmartEnergyManagementPsPowerSequenceType.ScheduleConstraints leftScheduleConstraints;
            leftScheduleConstraints = this.getScheduleConstraints();
            SmartEnergyManagementPsPowerSequenceType.ScheduleConstraints rightScheduleConstraints;
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
            SmartEnergyManagementPsPowerSequenceType.SchedulePreference leftSchedulePreference;
            leftSchedulePreference = this.getSchedulePreference();
            SmartEnergyManagementPsPowerSequenceType.SchedulePreference rightSchedulePreference;
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
            SmartEnergyManagementPsPowerSequenceType.OperatingConstraintsInterrupt leftOperatingConstraintsInterrupt;
            leftOperatingConstraintsInterrupt = this.getOperatingConstraintsInterrupt();
            SmartEnergyManagementPsPowerSequenceType.OperatingConstraintsInterrupt rightOperatingConstraintsInterrupt;
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
            SmartEnergyManagementPsPowerSequenceType.OperatingConstraintsDuration leftOperatingConstraintsDuration;
            leftOperatingConstraintsDuration = this.getOperatingConstraintsDuration();
            SmartEnergyManagementPsPowerSequenceType.OperatingConstraintsDuration rightOperatingConstraintsDuration;
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
            SmartEnergyManagementPsPowerSequenceType.OperatingConstraintsResumeImplication leftOperatingConstraintsResumeImplication;
            leftOperatingConstraintsResumeImplication = this.getOperatingConstraintsResumeImplication();
            SmartEnergyManagementPsPowerSequenceType.OperatingConstraintsResumeImplication rightOperatingConstraintsResumeImplication;
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
            List<SmartEnergyManagementPsPowerTimeSlotType> leftPowerTimeSlot;
            leftPowerTimeSlot = (((this.powerTimeSlot!= null)&&(!this.powerTimeSlot.isEmpty()))?this.getPowerTimeSlot():null);
            List<SmartEnergyManagementPsPowerTimeSlotType> rightPowerTimeSlot;
            rightPowerTimeSlot = (((that.powerTimeSlot!= null)&&(!that.powerTimeSlot.isEmpty()))?that.getPowerTimeSlot():null);
            if ((this.powerTimeSlot!= null)&&(!this.powerTimeSlot.isEmpty())) {
                if ((that.powerTimeSlot!= null)&&(!that.powerTimeSlot.isEmpty())) {
                    if (!leftPowerTimeSlot.equals(rightPowerTimeSlot)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.powerTimeSlot!= null)&&(!that.powerTimeSlot.isEmpty())) {
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
            SmartEnergyManagementPsPowerSequenceType.Description theDescription;
            theDescription = this.getDescription();
            if (this.description!= null) {
                currentHashCode += theDescription.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            SmartEnergyManagementPsPowerSequenceType.State theState;
            theState = this.getState();
            if (this.state!= null) {
                currentHashCode += theState.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            SmartEnergyManagementPsPowerSequenceType.Schedule theSchedule;
            theSchedule = this.getSchedule();
            if (this.schedule!= null) {
                currentHashCode += theSchedule.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            SmartEnergyManagementPsPowerSequenceType.ScheduleConstraints theScheduleConstraints;
            theScheduleConstraints = this.getScheduleConstraints();
            if (this.scheduleConstraints!= null) {
                currentHashCode += theScheduleConstraints.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            SmartEnergyManagementPsPowerSequenceType.SchedulePreference theSchedulePreference;
            theSchedulePreference = this.getSchedulePreference();
            if (this.schedulePreference!= null) {
                currentHashCode += theSchedulePreference.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            SmartEnergyManagementPsPowerSequenceType.OperatingConstraintsInterrupt theOperatingConstraintsInterrupt;
            theOperatingConstraintsInterrupt = this.getOperatingConstraintsInterrupt();
            if (this.operatingConstraintsInterrupt!= null) {
                currentHashCode += theOperatingConstraintsInterrupt.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            SmartEnergyManagementPsPowerSequenceType.OperatingConstraintsDuration theOperatingConstraintsDuration;
            theOperatingConstraintsDuration = this.getOperatingConstraintsDuration();
            if (this.operatingConstraintsDuration!= null) {
                currentHashCode += theOperatingConstraintsDuration.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            SmartEnergyManagementPsPowerSequenceType.OperatingConstraintsResumeImplication theOperatingConstraintsResumeImplication;
            theOperatingConstraintsResumeImplication = this.getOperatingConstraintsResumeImplication();
            if (this.operatingConstraintsResumeImplication!= null) {
                currentHashCode += theOperatingConstraintsResumeImplication.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            List<SmartEnergyManagementPsPowerTimeSlotType> thePowerTimeSlot;
            thePowerTimeSlot = (((this.powerTimeSlot!= null)&&(!this.powerTimeSlot.isEmpty()))?this.getPowerTimeSlot():null);
            if ((this.powerTimeSlot!= null)&&(!this.powerTimeSlot.isEmpty())) {
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
            SmartEnergyManagementPsPowerSequenceType.Description theDescription;
            theDescription = this.getDescription();
            strategy.appendField(locator, this, "description", buffer, theDescription, (this.description!= null));
        }
        {
            SmartEnergyManagementPsPowerSequenceType.State theState;
            theState = this.getState();
            strategy.appendField(locator, this, "state", buffer, theState, (this.state!= null));
        }
        {
            SmartEnergyManagementPsPowerSequenceType.Schedule theSchedule;
            theSchedule = this.getSchedule();
            strategy.appendField(locator, this, "schedule", buffer, theSchedule, (this.schedule!= null));
        }
        {
            SmartEnergyManagementPsPowerSequenceType.ScheduleConstraints theScheduleConstraints;
            theScheduleConstraints = this.getScheduleConstraints();
            strategy.appendField(locator, this, "scheduleConstraints", buffer, theScheduleConstraints, (this.scheduleConstraints!= null));
        }
        {
            SmartEnergyManagementPsPowerSequenceType.SchedulePreference theSchedulePreference;
            theSchedulePreference = this.getSchedulePreference();
            strategy.appendField(locator, this, "schedulePreference", buffer, theSchedulePreference, (this.schedulePreference!= null));
        }
        {
            SmartEnergyManagementPsPowerSequenceType.OperatingConstraintsInterrupt theOperatingConstraintsInterrupt;
            theOperatingConstraintsInterrupt = this.getOperatingConstraintsInterrupt();
            strategy.appendField(locator, this, "operatingConstraintsInterrupt", buffer, theOperatingConstraintsInterrupt, (this.operatingConstraintsInterrupt!= null));
        }
        {
            SmartEnergyManagementPsPowerSequenceType.OperatingConstraintsDuration theOperatingConstraintsDuration;
            theOperatingConstraintsDuration = this.getOperatingConstraintsDuration();
            strategy.appendField(locator, this, "operatingConstraintsDuration", buffer, theOperatingConstraintsDuration, (this.operatingConstraintsDuration!= null));
        }
        {
            SmartEnergyManagementPsPowerSequenceType.OperatingConstraintsResumeImplication theOperatingConstraintsResumeImplication;
            theOperatingConstraintsResumeImplication = this.getOperatingConstraintsResumeImplication();
            strategy.appendField(locator, this, "operatingConstraintsResumeImplication", buffer, theOperatingConstraintsResumeImplication, (this.operatingConstraintsResumeImplication!= null));
        }
        {
            List<SmartEnergyManagementPsPowerTimeSlotType> thePowerTimeSlot;
            thePowerTimeSlot = (((this.powerTimeSlot!= null)&&(!this.powerTimeSlot.isEmpty()))?this.getPowerTimeSlot():null);
            strategy.appendField(locator, this, "powerTimeSlot", buffer, thePowerTimeSlot, ((this.powerTimeSlot!= null)&&(!this.powerTimeSlot.isEmpty())));
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
     *     &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}PowerSequenceDescriptionDataType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="sequenceId" type="{http://docs.eebus.org/spine/xsd/v1}PowerSequenceIdType" minOccurs="0"/&gt;
     *         &lt;element name="description" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}DescriptionType"&gt;
     *               &lt;minLength value="1"/&gt;
     *               &lt;maxLength value="60"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="powerUnit" type="{http://docs.eebus.org/spine/xsd/v1}UnitOfMeasurementType" minOccurs="0"/&gt;
     *         &lt;element name="energyUnit" type="{http://docs.eebus.org/spine/xsd/v1}UnitOfMeasurementType" minOccurs="0"/&gt;
     *         &lt;element name="valueSource" type="{http://docs.eebus.org/spine/xsd/v1}MeasurementValueSourceType" minOccurs="0"/&gt;
     *         &lt;element name="taskIdentifier" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
     *         &lt;element name="repetitionsTotal" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
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
        extends PowerSequenceDescriptionDataType
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
        public Description(final Long sequenceId, final String description, final String positiveEnergyDirection, final String powerUnit, final String energyUnit, final String valueSource, final String scope, final Long taskIdentifier, final Long repetitionsTotal) {
            super(sequenceId, description, positiveEnergyDirection, powerUnit, energyUnit, valueSource, scope, taskIdentifier, repetitionsTotal);
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
        public SmartEnergyManagementPsPowerSequenceType.Description withSequenceId(Long value) {
            setSequenceId(value);
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
        public SmartEnergyManagementPsPowerSequenceType.Description withDescription(String value) {
            setDescription(value);
            return this;
        }

        /**
         * Sets the value of the positiveEnergyDirection property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         * @return
         *     The class instance
         */
        @Override
        public SmartEnergyManagementPsPowerSequenceType.Description withPositiveEnergyDirection(String value) {
            setPositiveEnergyDirection(value);
            return this;
        }

        /**
         * Sets the value of the powerUnit property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         * @return
         *     The class instance
         */
        @Override
        public SmartEnergyManagementPsPowerSequenceType.Description withPowerUnit(String value) {
            setPowerUnit(value);
            return this;
        }

        /**
         * Sets the value of the energyUnit property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         * @return
         *     The class instance
         */
        @Override
        public SmartEnergyManagementPsPowerSequenceType.Description withEnergyUnit(String value) {
            setEnergyUnit(value);
            return this;
        }

        /**
         * Sets the value of the valueSource property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         * @return
         *     The class instance
         */
        @Override
        public SmartEnergyManagementPsPowerSequenceType.Description withValueSource(String value) {
            setValueSource(value);
            return this;
        }

        /**
         * Sets the value of the scope property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         * @return
         *     The class instance
         */
        @Override
        public SmartEnergyManagementPsPowerSequenceType.Description withScope(String value) {
            setScope(value);
            return this;
        }

        /**
         * Sets the value of the taskIdentifier property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         * @return
         *     The class instance
         */
        @Override
        public SmartEnergyManagementPsPowerSequenceType.Description withTaskIdentifier(Long value) {
            setTaskIdentifier(value);
            return this;
        }

        /**
         * Sets the value of the repetitionsTotal property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         * @return
         *     The class instance
         */
        @Override
        public SmartEnergyManagementPsPowerSequenceType.Description withRepetitionsTotal(Long value) {
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
            return new SmartEnergyManagementPsPowerSequenceType.Description();
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
     *     &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}OperatingConstraintsDurationDataType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="activeDurationMin" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
     *         &lt;element name="activeDurationMax" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
     *         &lt;element name="pauseDurationMin" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
     *         &lt;element name="pauseDurationMax" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
     *         &lt;element name="activeDurationSumMin" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
     *         &lt;element name="activeDurationSumMax" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
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
        extends OperatingConstraintsDurationDataType
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
        public OperatingConstraintsDuration(final Long sequenceId, final Duration activeDurationMin, final Duration activeDurationMax, final Duration pauseDurationMin, final Duration pauseDurationMax, final Duration activeDurationSumMin, final Duration activeDurationSumMax) {
            super(sequenceId, activeDurationMin, activeDurationMax, pauseDurationMin, pauseDurationMax, activeDurationSumMin, activeDurationSumMax);
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
        public SmartEnergyManagementPsPowerSequenceType.OperatingConstraintsDuration withSequenceId(Long value) {
            setSequenceId(value);
            return this;
        }

        /**
         * Sets the value of the activeDurationMin property.
         * 
         * @param value
         *     allowed object is
         *     {@link Duration }
         * @return
         *     The class instance
         */
        @Override
        public SmartEnergyManagementPsPowerSequenceType.OperatingConstraintsDuration withActiveDurationMin(Duration value) {
            setActiveDurationMin(value);
            return this;
        }

        /**
         * Sets the value of the activeDurationMax property.
         * 
         * @param value
         *     allowed object is
         *     {@link Duration }
         * @return
         *     The class instance
         */
        @Override
        public SmartEnergyManagementPsPowerSequenceType.OperatingConstraintsDuration withActiveDurationMax(Duration value) {
            setActiveDurationMax(value);
            return this;
        }

        /**
         * Sets the value of the pauseDurationMin property.
         * 
         * @param value
         *     allowed object is
         *     {@link Duration }
         * @return
         *     The class instance
         */
        @Override
        public SmartEnergyManagementPsPowerSequenceType.OperatingConstraintsDuration withPauseDurationMin(Duration value) {
            setPauseDurationMin(value);
            return this;
        }

        /**
         * Sets the value of the pauseDurationMax property.
         * 
         * @param value
         *     allowed object is
         *     {@link Duration }
         * @return
         *     The class instance
         */
        @Override
        public SmartEnergyManagementPsPowerSequenceType.OperatingConstraintsDuration withPauseDurationMax(Duration value) {
            setPauseDurationMax(value);
            return this;
        }

        /**
         * Sets the value of the activeDurationSumMin property.
         * 
         * @param value
         *     allowed object is
         *     {@link Duration }
         * @return
         *     The class instance
         */
        @Override
        public SmartEnergyManagementPsPowerSequenceType.OperatingConstraintsDuration withActiveDurationSumMin(Duration value) {
            setActiveDurationSumMin(value);
            return this;
        }

        /**
         * Sets the value of the activeDurationSumMax property.
         * 
         * @param value
         *     allowed object is
         *     {@link Duration }
         * @return
         *     The class instance
         */
        @Override
        public SmartEnergyManagementPsPowerSequenceType.OperatingConstraintsDuration withActiveDurationSumMax(Duration value) {
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
            return new SmartEnergyManagementPsPowerSequenceType.OperatingConstraintsDuration();
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
     *     &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}OperatingConstraintsInterruptDataType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="isPausable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="isStoppable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="maxCyclesPerDay" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
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
        extends OperatingConstraintsInterruptDataType
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
        public OperatingConstraintsInterrupt(final Long sequenceId, final Boolean isPausable, final Boolean isStoppable, final Boolean notInterruptibleAtHighPower, final Long maxCyclesPerDay) {
            super(sequenceId, isPausable, isStoppable, notInterruptibleAtHighPower, maxCyclesPerDay);
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
        public SmartEnergyManagementPsPowerSequenceType.OperatingConstraintsInterrupt withSequenceId(Long value) {
            setSequenceId(value);
            return this;
        }

        /**
         * Sets the value of the isPausable property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         * @return
         *     The class instance
         */
        @Override
        public SmartEnergyManagementPsPowerSequenceType.OperatingConstraintsInterrupt withIsPausable(Boolean value) {
            setIsPausable(value);
            return this;
        }

        /**
         * Sets the value of the isStoppable property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         * @return
         *     The class instance
         */
        @Override
        public SmartEnergyManagementPsPowerSequenceType.OperatingConstraintsInterrupt withIsStoppable(Boolean value) {
            setIsStoppable(value);
            return this;
        }

        /**
         * Sets the value of the notInterruptibleAtHighPower property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         * @return
         *     The class instance
         */
        @Override
        public SmartEnergyManagementPsPowerSequenceType.OperatingConstraintsInterrupt withNotInterruptibleAtHighPower(Boolean value) {
            setNotInterruptibleAtHighPower(value);
            return this;
        }

        /**
         * Sets the value of the maxCyclesPerDay property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         * @return
         *     The class instance
         */
        @Override
        public SmartEnergyManagementPsPowerSequenceType.OperatingConstraintsInterrupt withMaxCyclesPerDay(Long value) {
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
            return new SmartEnergyManagementPsPowerSequenceType.OperatingConstraintsInterrupt();
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
     *     &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}OperatingConstraintsResumeImplicationDataType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="resumeEnergyEstimated" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberType" minOccurs="0"/&gt;
     *         &lt;element name="energyUnit" type="{http://docs.eebus.org/spine/xsd/v1}UnitOfMeasurementType" minOccurs="0"/&gt;
     *         &lt;element name="resumeCostEstimated" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberType" minOccurs="0"/&gt;
     *         &lt;element name="currency" type="{http://docs.eebus.org/spine/xsd/v1}CurrencyType" minOccurs="0"/&gt;
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
        extends OperatingConstraintsResumeImplicationDataType
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
        public OperatingConstraintsResumeImplication(final Long sequenceId, final ScaledNumberType resumeEnergyEstimated, final String energyUnit, final ScaledNumberType resumeCostEstimated, final String currency) {
            super(sequenceId, resumeEnergyEstimated, energyUnit, resumeCostEstimated, currency);
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
        public SmartEnergyManagementPsPowerSequenceType.OperatingConstraintsResumeImplication withSequenceId(Long value) {
            setSequenceId(value);
            return this;
        }

        /**
         * Sets the value of the resumeEnergyEstimated property.
         * 
         * @param value
         *     allowed object is
         *     {@link ScaledNumberType }
         * @return
         *     The class instance
         */
        @Override
        public SmartEnergyManagementPsPowerSequenceType.OperatingConstraintsResumeImplication withResumeEnergyEstimated(ScaledNumberType value) {
            setResumeEnergyEstimated(value);
            return this;
        }

        /**
         * Sets the value of the energyUnit property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         * @return
         *     The class instance
         */
        @Override
        public SmartEnergyManagementPsPowerSequenceType.OperatingConstraintsResumeImplication withEnergyUnit(String value) {
            setEnergyUnit(value);
            return this;
        }

        /**
         * Sets the value of the resumeCostEstimated property.
         * 
         * @param value
         *     allowed object is
         *     {@link ScaledNumberType }
         * @return
         *     The class instance
         */
        @Override
        public SmartEnergyManagementPsPowerSequenceType.OperatingConstraintsResumeImplication withResumeCostEstimated(ScaledNumberType value) {
            setResumeCostEstimated(value);
            return this;
        }

        /**
         * Sets the value of the currency property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         * @return
         *     The class instance
         */
        @Override
        public SmartEnergyManagementPsPowerSequenceType.OperatingConstraintsResumeImplication withCurrency(String value) {
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
            return new SmartEnergyManagementPsPowerSequenceType.OperatingConstraintsResumeImplication();
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
     *     &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}PowerSequenceScheduleDataType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="startTime" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
     *         &lt;element name="endTime" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
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
        extends PowerSequenceScheduleDataType
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
        public Schedule(final Long sequenceId, final String startTime, final String endTime) {
            super(sequenceId, startTime, endTime);
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
        public SmartEnergyManagementPsPowerSequenceType.Schedule withSequenceId(Long value) {
            setSequenceId(value);
            return this;
        }

        /**
         * Sets the value of the startTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         * @return
         *     The class instance
         */
        @Override
        public SmartEnergyManagementPsPowerSequenceType.Schedule withStartTime(String value) {
            setStartTime(value);
            return this;
        }

        /**
         * Sets the value of the endTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         * @return
         *     The class instance
         */
        @Override
        public SmartEnergyManagementPsPowerSequenceType.Schedule withEndTime(String value) {
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
            return new SmartEnergyManagementPsPowerSequenceType.Schedule();
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
     *     &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}PowerSequenceScheduleConstraintsDataType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="earliestStartTime" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
     *         &lt;element name="latestEndTime" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
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
        extends PowerSequenceScheduleConstraintsDataType
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
        public ScheduleConstraints(final Long sequenceId, final String earliestStartTime, final String latestStartTime, final String earliestEndTime, final String latestEndTime, final Boolean optionalSequence) {
            super(sequenceId, earliestStartTime, latestStartTime, earliestEndTime, latestEndTime, optionalSequence);
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
        public SmartEnergyManagementPsPowerSequenceType.ScheduleConstraints withSequenceId(Long value) {
            setSequenceId(value);
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
        public SmartEnergyManagementPsPowerSequenceType.ScheduleConstraints withEarliestStartTime(String value) {
            setEarliestStartTime(value);
            return this;
        }

        /**
         * Sets the value of the latestStartTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         * @return
         *     The class instance
         */
        @Override
        public SmartEnergyManagementPsPowerSequenceType.ScheduleConstraints withLatestStartTime(String value) {
            setLatestStartTime(value);
            return this;
        }

        /**
         * Sets the value of the earliestEndTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         * @return
         *     The class instance
         */
        @Override
        public SmartEnergyManagementPsPowerSequenceType.ScheduleConstraints withEarliestEndTime(String value) {
            setEarliestEndTime(value);
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
        public SmartEnergyManagementPsPowerSequenceType.ScheduleConstraints withLatestEndTime(String value) {
            setLatestEndTime(value);
            return this;
        }

        /**
         * Sets the value of the optionalSequence property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         * @return
         *     The class instance
         */
        @Override
        public SmartEnergyManagementPsPowerSequenceType.ScheduleConstraints withOptionalSequence(Boolean value) {
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
            return new SmartEnergyManagementPsPowerSequenceType.ScheduleConstraints();
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
     *     &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}PowerSequenceSchedulePreferenceDataType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="greenest" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="cheapest" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
        extends PowerSequenceSchedulePreferenceDataType
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
        public SchedulePreference(final Long sequenceId, final Boolean greenest, final Boolean cheapest) {
            super(sequenceId, greenest, cheapest);
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
        public SmartEnergyManagementPsPowerSequenceType.SchedulePreference withSequenceId(Long value) {
            setSequenceId(value);
            return this;
        }

        /**
         * Sets the value of the greenest property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         * @return
         *     The class instance
         */
        @Override
        public SmartEnergyManagementPsPowerSequenceType.SchedulePreference withGreenest(Boolean value) {
            setGreenest(value);
            return this;
        }

        /**
         * Sets the value of the cheapest property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         * @return
         *     The class instance
         */
        @Override
        public SmartEnergyManagementPsPowerSequenceType.SchedulePreference withCheapest(Boolean value) {
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
            return new SmartEnergyManagementPsPowerSequenceType.SchedulePreference();
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
     *     &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}PowerSequenceStateDataType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="state" type="{http://docs.eebus.org/spine/xsd/v1}PowerSequenceStateType" minOccurs="0"/&gt;
     *         &lt;element name="activeSlotNumber" type="{http://docs.eebus.org/spine/xsd/v1}PowerTimeSlotNumberType" minOccurs="0"/&gt;
     *         &lt;element name="elapsedSlotTime" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
     *         &lt;element name="remainingSlotTime" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
     *         &lt;element name="sequenceRemoteControllable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="activeRepetitionNumber" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
     *         &lt;element name="remainingPauseTime" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
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
        extends PowerSequenceStateDataType
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
        public State(final Long sequenceId, final String state, final Long activeSlotNumber, final Duration elapsedSlotTime, final Duration remainingSlotTime, final Boolean sequenceRemoteControllable, final Long activeRepetitionNumber, final Duration remainingPauseTime) {
            super(sequenceId, state, activeSlotNumber, elapsedSlotTime, remainingSlotTime, sequenceRemoteControllable, activeRepetitionNumber, remainingPauseTime);
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
        public SmartEnergyManagementPsPowerSequenceType.State withSequenceId(Long value) {
            setSequenceId(value);
            return this;
        }

        /**
         * Sets the value of the state property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         * @return
         *     The class instance
         */
        @Override
        public SmartEnergyManagementPsPowerSequenceType.State withState(String value) {
            setState(value);
            return this;
        }

        /**
         * Sets the value of the activeSlotNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         * @return
         *     The class instance
         */
        @Override
        public SmartEnergyManagementPsPowerSequenceType.State withActiveSlotNumber(Long value) {
            setActiveSlotNumber(value);
            return this;
        }

        /**
         * Sets the value of the elapsedSlotTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link Duration }
         * @return
         *     The class instance
         */
        @Override
        public SmartEnergyManagementPsPowerSequenceType.State withElapsedSlotTime(Duration value) {
            setElapsedSlotTime(value);
            return this;
        }

        /**
         * Sets the value of the remainingSlotTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link Duration }
         * @return
         *     The class instance
         */
        @Override
        public SmartEnergyManagementPsPowerSequenceType.State withRemainingSlotTime(Duration value) {
            setRemainingSlotTime(value);
            return this;
        }

        /**
         * Sets the value of the sequenceRemoteControllable property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         * @return
         *     The class instance
         */
        @Override
        public SmartEnergyManagementPsPowerSequenceType.State withSequenceRemoteControllable(Boolean value) {
            setSequenceRemoteControllable(value);
            return this;
        }

        /**
         * Sets the value of the activeRepetitionNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         * @return
         *     The class instance
         */
        @Override
        public SmartEnergyManagementPsPowerSequenceType.State withActiveRepetitionNumber(Long value) {
            setActiveRepetitionNumber(value);
            return this;
        }

        /**
         * Sets the value of the remainingPauseTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link Duration }
         * @return
         *     The class instance
         */
        @Override
        public SmartEnergyManagementPsPowerSequenceType.State withRemainingPauseTime(Duration value) {
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
            return new SmartEnergyManagementPsPowerSequenceType.State();
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
