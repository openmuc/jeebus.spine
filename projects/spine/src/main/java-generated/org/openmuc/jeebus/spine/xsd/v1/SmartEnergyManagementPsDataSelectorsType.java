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
 * <p>Java class for SmartEnergyManagementPsDataSelectorsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SmartEnergyManagementPsDataSelectorsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="alternativesRelation" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}PowerSequenceAlternativesRelationListDataSelectorsType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="alternativesId" type="{http://docs.eebus.org/spine/xsd/v1}AlternativesIdType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="powerSequenceDescription" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}PowerSequenceDescriptionListDataSelectorsType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="sequenceId" type="{http://docs.eebus.org/spine/xsd/v1}PowerSequenceIdType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="powerTimeSlotSchedule" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}PowerTimeSlotScheduleListDataSelectorsType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="slotNumber" type="{http://docs.eebus.org/spine/xsd/v1}PowerTimeSlotNumberType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="powerTimeSlotValue" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}PowerTimeSlotValueListDataSelectorsType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="valueType" type="{http://docs.eebus.org/spine/xsd/v1}PowerTimeSlotValueTypeType" minOccurs="0"/&gt;
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
@XmlType(name = "SmartEnergyManagementPsDataSelectorsType", propOrder = {
    "alternativesRelation",
    "powerSequenceDescription",
    "powerTimeSlotSchedule",
    "powerTimeSlotValue"
})
public class SmartEnergyManagementPsDataSelectorsType implements Cloneable, CopyTo, ToString
{

    protected SmartEnergyManagementPsDataSelectorsType.AlternativesRelation alternativesRelation;
    protected SmartEnergyManagementPsDataSelectorsType.PowerSequenceDescription powerSequenceDescription;
    protected SmartEnergyManagementPsDataSelectorsType.PowerTimeSlotSchedule powerTimeSlotSchedule;
    protected SmartEnergyManagementPsDataSelectorsType.PowerTimeSlotValue powerTimeSlotValue;

    /**
     * Default no-arg constructor
     * 
     */
    public SmartEnergyManagementPsDataSelectorsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public SmartEnergyManagementPsDataSelectorsType(final SmartEnergyManagementPsDataSelectorsType.AlternativesRelation alternativesRelation, final SmartEnergyManagementPsDataSelectorsType.PowerSequenceDescription powerSequenceDescription, final SmartEnergyManagementPsDataSelectorsType.PowerTimeSlotSchedule powerTimeSlotSchedule, final SmartEnergyManagementPsDataSelectorsType.PowerTimeSlotValue powerTimeSlotValue) {
        this.alternativesRelation = alternativesRelation;
        this.powerSequenceDescription = powerSequenceDescription;
        this.powerTimeSlotSchedule = powerTimeSlotSchedule;
        this.powerTimeSlotValue = powerTimeSlotValue;
    }

    /**
     * Gets the value of the alternativesRelation property.
     * 
     * @return
     *     possible object is
     *     {@link SmartEnergyManagementPsDataSelectorsType.AlternativesRelation }
     *     
     */
    public SmartEnergyManagementPsDataSelectorsType.AlternativesRelation getAlternativesRelation() {
        return alternativesRelation;
    }

    /**
     * Sets the value of the alternativesRelation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmartEnergyManagementPsDataSelectorsType.AlternativesRelation }
     *     
     */
    public void setAlternativesRelation(SmartEnergyManagementPsDataSelectorsType.AlternativesRelation value) {
        this.alternativesRelation = value;
    }

    /**
     * Gets the value of the powerSequenceDescription property.
     * 
     * @return
     *     possible object is
     *     {@link SmartEnergyManagementPsDataSelectorsType.PowerSequenceDescription }
     *     
     */
    public SmartEnergyManagementPsDataSelectorsType.PowerSequenceDescription getPowerSequenceDescription() {
        return powerSequenceDescription;
    }

    /**
     * Sets the value of the powerSequenceDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmartEnergyManagementPsDataSelectorsType.PowerSequenceDescription }
     *     
     */
    public void setPowerSequenceDescription(SmartEnergyManagementPsDataSelectorsType.PowerSequenceDescription value) {
        this.powerSequenceDescription = value;
    }

    /**
     * Gets the value of the powerTimeSlotSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link SmartEnergyManagementPsDataSelectorsType.PowerTimeSlotSchedule }
     *     
     */
    public SmartEnergyManagementPsDataSelectorsType.PowerTimeSlotSchedule getPowerTimeSlotSchedule() {
        return powerTimeSlotSchedule;
    }

    /**
     * Sets the value of the powerTimeSlotSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmartEnergyManagementPsDataSelectorsType.PowerTimeSlotSchedule }
     *     
     */
    public void setPowerTimeSlotSchedule(SmartEnergyManagementPsDataSelectorsType.PowerTimeSlotSchedule value) {
        this.powerTimeSlotSchedule = value;
    }

    /**
     * Gets the value of the powerTimeSlotValue property.
     * 
     * @return
     *     possible object is
     *     {@link SmartEnergyManagementPsDataSelectorsType.PowerTimeSlotValue }
     *     
     */
    public SmartEnergyManagementPsDataSelectorsType.PowerTimeSlotValue getPowerTimeSlotValue() {
        return powerTimeSlotValue;
    }

    /**
     * Sets the value of the powerTimeSlotValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmartEnergyManagementPsDataSelectorsType.PowerTimeSlotValue }
     *     
     */
    public void setPowerTimeSlotValue(SmartEnergyManagementPsDataSelectorsType.PowerTimeSlotValue value) {
        this.powerTimeSlotValue = value;
    }

    /**
     * Sets the value of the alternativesRelation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmartEnergyManagementPsDataSelectorsType.AlternativesRelation }
     * @return
     *     The class instance
     */
    public SmartEnergyManagementPsDataSelectorsType withAlternativesRelation(SmartEnergyManagementPsDataSelectorsType.AlternativesRelation value) {
        setAlternativesRelation(value);
        return this;
    }

    /**
     * Sets the value of the powerSequenceDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmartEnergyManagementPsDataSelectorsType.PowerSequenceDescription }
     * @return
     *     The class instance
     */
    public SmartEnergyManagementPsDataSelectorsType withPowerSequenceDescription(SmartEnergyManagementPsDataSelectorsType.PowerSequenceDescription value) {
        setPowerSequenceDescription(value);
        return this;
    }

    /**
     * Sets the value of the powerTimeSlotSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmartEnergyManagementPsDataSelectorsType.PowerTimeSlotSchedule }
     * @return
     *     The class instance
     */
    public SmartEnergyManagementPsDataSelectorsType withPowerTimeSlotSchedule(SmartEnergyManagementPsDataSelectorsType.PowerTimeSlotSchedule value) {
        setPowerTimeSlotSchedule(value);
        return this;
    }

    /**
     * Sets the value of the powerTimeSlotValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmartEnergyManagementPsDataSelectorsType.PowerTimeSlotValue }
     * @return
     *     The class instance
     */
    public SmartEnergyManagementPsDataSelectorsType withPowerTimeSlotValue(SmartEnergyManagementPsDataSelectorsType.PowerTimeSlotValue value) {
        setPowerTimeSlotValue(value);
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
        if (draftCopy instanceof SmartEnergyManagementPsDataSelectorsType) {
            final SmartEnergyManagementPsDataSelectorsType copy = ((SmartEnergyManagementPsDataSelectorsType) draftCopy);
            {
                Boolean alternativesRelationShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.alternativesRelation!= null));
                if (alternativesRelationShouldBeCopiedAndSet == Boolean.TRUE) {
                    SmartEnergyManagementPsDataSelectorsType.AlternativesRelation sourceAlternativesRelation;
                    sourceAlternativesRelation = this.getAlternativesRelation();
                    SmartEnergyManagementPsDataSelectorsType.AlternativesRelation copyAlternativesRelation = ((SmartEnergyManagementPsDataSelectorsType.AlternativesRelation) strategy.copy(LocatorUtils.property(locator, "alternativesRelation", sourceAlternativesRelation), sourceAlternativesRelation, (this.alternativesRelation!= null)));
                    copy.setAlternativesRelation(copyAlternativesRelation);
                } else {
                    if (alternativesRelationShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.alternativesRelation = null;
                    }
                }
            }
            {
                Boolean powerSequenceDescriptionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.powerSequenceDescription!= null));
                if (powerSequenceDescriptionShouldBeCopiedAndSet == Boolean.TRUE) {
                    SmartEnergyManagementPsDataSelectorsType.PowerSequenceDescription sourcePowerSequenceDescription;
                    sourcePowerSequenceDescription = this.getPowerSequenceDescription();
                    SmartEnergyManagementPsDataSelectorsType.PowerSequenceDescription copyPowerSequenceDescription = ((SmartEnergyManagementPsDataSelectorsType.PowerSequenceDescription) strategy.copy(LocatorUtils.property(locator, "powerSequenceDescription", sourcePowerSequenceDescription), sourcePowerSequenceDescription, (this.powerSequenceDescription!= null)));
                    copy.setPowerSequenceDescription(copyPowerSequenceDescription);
                } else {
                    if (powerSequenceDescriptionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.powerSequenceDescription = null;
                    }
                }
            }
            {
                Boolean powerTimeSlotScheduleShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.powerTimeSlotSchedule!= null));
                if (powerTimeSlotScheduleShouldBeCopiedAndSet == Boolean.TRUE) {
                    SmartEnergyManagementPsDataSelectorsType.PowerTimeSlotSchedule sourcePowerTimeSlotSchedule;
                    sourcePowerTimeSlotSchedule = this.getPowerTimeSlotSchedule();
                    SmartEnergyManagementPsDataSelectorsType.PowerTimeSlotSchedule copyPowerTimeSlotSchedule = ((SmartEnergyManagementPsDataSelectorsType.PowerTimeSlotSchedule) strategy.copy(LocatorUtils.property(locator, "powerTimeSlotSchedule", sourcePowerTimeSlotSchedule), sourcePowerTimeSlotSchedule, (this.powerTimeSlotSchedule!= null)));
                    copy.setPowerTimeSlotSchedule(copyPowerTimeSlotSchedule);
                } else {
                    if (powerTimeSlotScheduleShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.powerTimeSlotSchedule = null;
                    }
                }
            }
            {
                Boolean powerTimeSlotValueShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.powerTimeSlotValue!= null));
                if (powerTimeSlotValueShouldBeCopiedAndSet == Boolean.TRUE) {
                    SmartEnergyManagementPsDataSelectorsType.PowerTimeSlotValue sourcePowerTimeSlotValue;
                    sourcePowerTimeSlotValue = this.getPowerTimeSlotValue();
                    SmartEnergyManagementPsDataSelectorsType.PowerTimeSlotValue copyPowerTimeSlotValue = ((SmartEnergyManagementPsDataSelectorsType.PowerTimeSlotValue) strategy.copy(LocatorUtils.property(locator, "powerTimeSlotValue", sourcePowerTimeSlotValue), sourcePowerTimeSlotValue, (this.powerTimeSlotValue!= null)));
                    copy.setPowerTimeSlotValue(copyPowerTimeSlotValue);
                } else {
                    if (powerTimeSlotValueShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.powerTimeSlotValue = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new SmartEnergyManagementPsDataSelectorsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final SmartEnergyManagementPsDataSelectorsType that = ((SmartEnergyManagementPsDataSelectorsType) object);
        {
            SmartEnergyManagementPsDataSelectorsType.AlternativesRelation leftAlternativesRelation;
            leftAlternativesRelation = this.getAlternativesRelation();
            SmartEnergyManagementPsDataSelectorsType.AlternativesRelation rightAlternativesRelation;
            rightAlternativesRelation = that.getAlternativesRelation();
            if (this.alternativesRelation!= null) {
                if (that.alternativesRelation!= null) {
                    if (!leftAlternativesRelation.equals(rightAlternativesRelation)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.alternativesRelation!= null) {
                    return false;
                }
            }
        }
        {
            SmartEnergyManagementPsDataSelectorsType.PowerSequenceDescription leftPowerSequenceDescription;
            leftPowerSequenceDescription = this.getPowerSequenceDescription();
            SmartEnergyManagementPsDataSelectorsType.PowerSequenceDescription rightPowerSequenceDescription;
            rightPowerSequenceDescription = that.getPowerSequenceDescription();
            if (this.powerSequenceDescription!= null) {
                if (that.powerSequenceDescription!= null) {
                    if (!leftPowerSequenceDescription.equals(rightPowerSequenceDescription)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.powerSequenceDescription!= null) {
                    return false;
                }
            }
        }
        {
            SmartEnergyManagementPsDataSelectorsType.PowerTimeSlotSchedule leftPowerTimeSlotSchedule;
            leftPowerTimeSlotSchedule = this.getPowerTimeSlotSchedule();
            SmartEnergyManagementPsDataSelectorsType.PowerTimeSlotSchedule rightPowerTimeSlotSchedule;
            rightPowerTimeSlotSchedule = that.getPowerTimeSlotSchedule();
            if (this.powerTimeSlotSchedule!= null) {
                if (that.powerTimeSlotSchedule!= null) {
                    if (!leftPowerTimeSlotSchedule.equals(rightPowerTimeSlotSchedule)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.powerTimeSlotSchedule!= null) {
                    return false;
                }
            }
        }
        {
            SmartEnergyManagementPsDataSelectorsType.PowerTimeSlotValue leftPowerTimeSlotValue;
            leftPowerTimeSlotValue = this.getPowerTimeSlotValue();
            SmartEnergyManagementPsDataSelectorsType.PowerTimeSlotValue rightPowerTimeSlotValue;
            rightPowerTimeSlotValue = that.getPowerTimeSlotValue();
            if (this.powerTimeSlotValue!= null) {
                if (that.powerTimeSlotValue!= null) {
                    if (!leftPowerTimeSlotValue.equals(rightPowerTimeSlotValue)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.powerTimeSlotValue!= null) {
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
            SmartEnergyManagementPsDataSelectorsType.AlternativesRelation theAlternativesRelation;
            theAlternativesRelation = this.getAlternativesRelation();
            if (this.alternativesRelation!= null) {
                currentHashCode += theAlternativesRelation.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            SmartEnergyManagementPsDataSelectorsType.PowerSequenceDescription thePowerSequenceDescription;
            thePowerSequenceDescription = this.getPowerSequenceDescription();
            if (this.powerSequenceDescription!= null) {
                currentHashCode += thePowerSequenceDescription.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            SmartEnergyManagementPsDataSelectorsType.PowerTimeSlotSchedule thePowerTimeSlotSchedule;
            thePowerTimeSlotSchedule = this.getPowerTimeSlotSchedule();
            if (this.powerTimeSlotSchedule!= null) {
                currentHashCode += thePowerTimeSlotSchedule.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            SmartEnergyManagementPsDataSelectorsType.PowerTimeSlotValue thePowerTimeSlotValue;
            thePowerTimeSlotValue = this.getPowerTimeSlotValue();
            if (this.powerTimeSlotValue!= null) {
                currentHashCode += thePowerTimeSlotValue.hashCode();
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
            SmartEnergyManagementPsDataSelectorsType.AlternativesRelation theAlternativesRelation;
            theAlternativesRelation = this.getAlternativesRelation();
            strategy.appendField(locator, this, "alternativesRelation", buffer, theAlternativesRelation, (this.alternativesRelation!= null));
        }
        {
            SmartEnergyManagementPsDataSelectorsType.PowerSequenceDescription thePowerSequenceDescription;
            thePowerSequenceDescription = this.getPowerSequenceDescription();
            strategy.appendField(locator, this, "powerSequenceDescription", buffer, thePowerSequenceDescription, (this.powerSequenceDescription!= null));
        }
        {
            SmartEnergyManagementPsDataSelectorsType.PowerTimeSlotSchedule thePowerTimeSlotSchedule;
            thePowerTimeSlotSchedule = this.getPowerTimeSlotSchedule();
            strategy.appendField(locator, this, "powerTimeSlotSchedule", buffer, thePowerTimeSlotSchedule, (this.powerTimeSlotSchedule!= null));
        }
        {
            SmartEnergyManagementPsDataSelectorsType.PowerTimeSlotValue thePowerTimeSlotValue;
            thePowerTimeSlotValue = this.getPowerTimeSlotValue();
            strategy.appendField(locator, this, "powerTimeSlotValue", buffer, thePowerTimeSlotValue, (this.powerTimeSlotValue!= null));
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
     *     &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}PowerSequenceAlternativesRelationListDataSelectorsType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="alternativesId" type="{http://docs.eebus.org/spine/xsd/v1}AlternativesIdType" minOccurs="0"/&gt;
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
    public static class AlternativesRelation
        extends PowerSequenceAlternativesRelationListDataSelectorsType
        implements Cloneable, CopyTo, ToString
    {


        /**
         * Default no-arg constructor
         * 
         */
        public AlternativesRelation() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public AlternativesRelation(final Long alternativesId, final Long sequenceId) {
            super(alternativesId, sequenceId);
        }

        /**
         * Sets the value of the alternativesId property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         * @return
         *     The class instance
         */
        @Override
        public SmartEnergyManagementPsDataSelectorsType.AlternativesRelation withAlternativesId(Long value) {
            setAlternativesId(value);
            return this;
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
        public SmartEnergyManagementPsDataSelectorsType.AlternativesRelation withSequenceId(Long value) {
            setSequenceId(value);
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
            return new SmartEnergyManagementPsDataSelectorsType.AlternativesRelation();
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
     *     &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}PowerSequenceDescriptionListDataSelectorsType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="sequenceId" type="{http://docs.eebus.org/spine/xsd/v1}PowerSequenceIdType" minOccurs="0"/&gt;
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
    public static class PowerSequenceDescription
        extends PowerSequenceDescriptionListDataSelectorsType
        implements Cloneable, CopyTo, ToString
    {


        /**
         * Default no-arg constructor
         * 
         */
        public PowerSequenceDescription() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public PowerSequenceDescription(final Long sequenceId) {
            super(sequenceId);
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
        public SmartEnergyManagementPsDataSelectorsType.PowerSequenceDescription withSequenceId(Long value) {
            setSequenceId(value);
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
            return new SmartEnergyManagementPsDataSelectorsType.PowerSequenceDescription();
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
     *     &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}PowerTimeSlotScheduleListDataSelectorsType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="slotNumber" type="{http://docs.eebus.org/spine/xsd/v1}PowerTimeSlotNumberType" minOccurs="0"/&gt;
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
    public static class PowerTimeSlotSchedule
        extends PowerTimeSlotScheduleListDataSelectorsType
        implements Cloneable, CopyTo, ToString
    {


        /**
         * Default no-arg constructor
         * 
         */
        public PowerTimeSlotSchedule() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public PowerTimeSlotSchedule(final Long sequenceId, final Long slotNumber) {
            super(sequenceId, slotNumber);
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
        public SmartEnergyManagementPsDataSelectorsType.PowerTimeSlotSchedule withSequenceId(Long value) {
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
        public SmartEnergyManagementPsDataSelectorsType.PowerTimeSlotSchedule withSlotNumber(Long value) {
            setSlotNumber(value);
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
            return new SmartEnergyManagementPsDataSelectorsType.PowerTimeSlotSchedule();
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
     *     &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}PowerTimeSlotValueListDataSelectorsType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="valueType" type="{http://docs.eebus.org/spine/xsd/v1}PowerTimeSlotValueTypeType" minOccurs="0"/&gt;
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
    public static class PowerTimeSlotValue
        extends PowerTimeSlotValueListDataSelectorsType
        implements Cloneable, CopyTo, ToString
    {


        /**
         * Default no-arg constructor
         * 
         */
        public PowerTimeSlotValue() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public PowerTimeSlotValue(final Long sequenceId, final Long slotNumber, final String valueType) {
            super(sequenceId, slotNumber, valueType);
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
        public SmartEnergyManagementPsDataSelectorsType.PowerTimeSlotValue withSequenceId(Long value) {
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
        public SmartEnergyManagementPsDataSelectorsType.PowerTimeSlotValue withSlotNumber(Long value) {
            setSlotNumber(value);
            return this;
        }

        /**
         * Sets the value of the valueType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         * @return
         *     The class instance
         */
        @Override
        public SmartEnergyManagementPsDataSelectorsType.PowerTimeSlotValue withValueType(String value) {
            setValueType(value);
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
            return new SmartEnergyManagementPsDataSelectorsType.PowerTimeSlotValue();
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
