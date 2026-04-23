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
 * <p>Java class for PowerSequenceDescriptionDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PowerSequenceDescriptionDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sequenceId" type="{http://docs.eebus.org/spine/xsd/v1}PowerSequenceIdType" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://docs.eebus.org/spine/xsd/v1}DescriptionType" minOccurs="0"/&gt;
 *         &lt;element name="positiveEnergyDirection" type="{http://docs.eebus.org/spine/xsd/v1}EnergyDirectionType" minOccurs="0"/&gt;
 *         &lt;element name="powerUnit" type="{http://docs.eebus.org/spine/xsd/v1}UnitOfMeasurementType" minOccurs="0"/&gt;
 *         &lt;element name="energyUnit" type="{http://docs.eebus.org/spine/xsd/v1}UnitOfMeasurementType" minOccurs="0"/&gt;
 *         &lt;element name="valueSource" type="{http://docs.eebus.org/spine/xsd/v1}MeasurementValueSourceType" minOccurs="0"/&gt;
 *         &lt;element name="scope" type="{http://docs.eebus.org/spine/xsd/v1}PowerSequenceScopeType" minOccurs="0"/&gt;
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
@XmlType(name = "PowerSequenceDescriptionDataType", propOrder = {
    "sequenceId",
    "description",
    "positiveEnergyDirection",
    "powerUnit",
    "energyUnit",
    "valueSource",
    "scope",
    "taskIdentifier",
    "repetitionsTotal"
})
@XmlSeeAlso({
    org.openmuc.jeebus.spine.xsd.v1.SmartEnergyManagementPsPowerSequenceType.Description.class
})
public class PowerSequenceDescriptionDataType implements Cloneable, CopyTo, ToString
{

    @XmlSchemaType(name = "unsignedInt")
    protected Long sequenceId;
    protected String description;
    protected String positiveEnergyDirection;
    protected String powerUnit;
    protected String energyUnit;
    protected String valueSource;
    protected String scope;
    @XmlSchemaType(name = "unsignedInt")
    protected Long taskIdentifier;
    @XmlSchemaType(name = "unsignedInt")
    protected Long repetitionsTotal;

    /**
     * Default no-arg constructor
     * 
     */
    public PowerSequenceDescriptionDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public PowerSequenceDescriptionDataType(final Long sequenceId, final String description, final String positiveEnergyDirection, final String powerUnit, final String energyUnit, final String valueSource, final String scope, final Long taskIdentifier, final Long repetitionsTotal) {
        this.sequenceId = sequenceId;
        this.description = description;
        this.positiveEnergyDirection = positiveEnergyDirection;
        this.powerUnit = powerUnit;
        this.energyUnit = energyUnit;
        this.valueSource = valueSource;
        this.scope = scope;
        this.taskIdentifier = taskIdentifier;
        this.repetitionsTotal = repetitionsTotal;
    }

    /**
     * Gets the value of the sequenceId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSequenceId() {
        return sequenceId;
    }

    /**
     * Sets the value of the sequenceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSequenceId(Long value) {
        this.sequenceId = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the positiveEnergyDirection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPositiveEnergyDirection() {
        return positiveEnergyDirection;
    }

    /**
     * Sets the value of the positiveEnergyDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPositiveEnergyDirection(String value) {
        this.positiveEnergyDirection = value;
    }

    /**
     * Gets the value of the powerUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPowerUnit() {
        return powerUnit;
    }

    /**
     * Sets the value of the powerUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPowerUnit(String value) {
        this.powerUnit = value;
    }

    /**
     * Gets the value of the energyUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnergyUnit() {
        return energyUnit;
    }

    /**
     * Sets the value of the energyUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnergyUnit(String value) {
        this.energyUnit = value;
    }

    /**
     * Gets the value of the valueSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueSource() {
        return valueSource;
    }

    /**
     * Sets the value of the valueSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueSource(String value) {
        this.valueSource = value;
    }

    /**
     * Gets the value of the scope property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScope() {
        return scope;
    }

    /**
     * Sets the value of the scope property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScope(String value) {
        this.scope = value;
    }

    /**
     * Gets the value of the taskIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTaskIdentifier() {
        return taskIdentifier;
    }

    /**
     * Sets the value of the taskIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTaskIdentifier(Long value) {
        this.taskIdentifier = value;
    }

    /**
     * Gets the value of the repetitionsTotal property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRepetitionsTotal() {
        return repetitionsTotal;
    }

    /**
     * Sets the value of the repetitionsTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRepetitionsTotal(Long value) {
        this.repetitionsTotal = value;
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
    public PowerSequenceDescriptionDataType withSequenceId(Long value) {
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
    public PowerSequenceDescriptionDataType withDescription(String value) {
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
    public PowerSequenceDescriptionDataType withPositiveEnergyDirection(String value) {
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
    public PowerSequenceDescriptionDataType withPowerUnit(String value) {
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
    public PowerSequenceDescriptionDataType withEnergyUnit(String value) {
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
    public PowerSequenceDescriptionDataType withValueSource(String value) {
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
    public PowerSequenceDescriptionDataType withScope(String value) {
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
    public PowerSequenceDescriptionDataType withTaskIdentifier(Long value) {
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
    public PowerSequenceDescriptionDataType withRepetitionsTotal(Long value) {
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
        if (draftCopy instanceof PowerSequenceDescriptionDataType) {
            final PowerSequenceDescriptionDataType copy = ((PowerSequenceDescriptionDataType) draftCopy);
            {
                Boolean sequenceIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.sequenceId!= null));
                if (sequenceIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceSequenceId;
                    sourceSequenceId = this.getSequenceId();
                    Long copySequenceId = ((Long) strategy.copy(LocatorUtils.property(locator, "sequenceId", sourceSequenceId), sourceSequenceId, (this.sequenceId!= null)));
                    copy.setSequenceId(copySequenceId);
                } else {
                    if (sequenceIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.sequenceId = null;
                    }
                }
            }
            {
                Boolean descriptionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.description!= null));
                if (descriptionShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceDescription;
                    sourceDescription = this.getDescription();
                    String copyDescription = ((String) strategy.copy(LocatorUtils.property(locator, "description", sourceDescription), sourceDescription, (this.description!= null)));
                    copy.setDescription(copyDescription);
                } else {
                    if (descriptionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.description = null;
                    }
                }
            }
            {
                Boolean positiveEnergyDirectionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.positiveEnergyDirection!= null));
                if (positiveEnergyDirectionShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourcePositiveEnergyDirection;
                    sourcePositiveEnergyDirection = this.getPositiveEnergyDirection();
                    String copyPositiveEnergyDirection = ((String) strategy.copy(LocatorUtils.property(locator, "positiveEnergyDirection", sourcePositiveEnergyDirection), sourcePositiveEnergyDirection, (this.positiveEnergyDirection!= null)));
                    copy.setPositiveEnergyDirection(copyPositiveEnergyDirection);
                } else {
                    if (positiveEnergyDirectionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.positiveEnergyDirection = null;
                    }
                }
            }
            {
                Boolean powerUnitShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.powerUnit!= null));
                if (powerUnitShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourcePowerUnit;
                    sourcePowerUnit = this.getPowerUnit();
                    String copyPowerUnit = ((String) strategy.copy(LocatorUtils.property(locator, "powerUnit", sourcePowerUnit), sourcePowerUnit, (this.powerUnit!= null)));
                    copy.setPowerUnit(copyPowerUnit);
                } else {
                    if (powerUnitShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.powerUnit = null;
                    }
                }
            }
            {
                Boolean energyUnitShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.energyUnit!= null));
                if (energyUnitShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceEnergyUnit;
                    sourceEnergyUnit = this.getEnergyUnit();
                    String copyEnergyUnit = ((String) strategy.copy(LocatorUtils.property(locator, "energyUnit", sourceEnergyUnit), sourceEnergyUnit, (this.energyUnit!= null)));
                    copy.setEnergyUnit(copyEnergyUnit);
                } else {
                    if (energyUnitShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.energyUnit = null;
                    }
                }
            }
            {
                Boolean valueSourceShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.valueSource!= null));
                if (valueSourceShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceValueSource;
                    sourceValueSource = this.getValueSource();
                    String copyValueSource = ((String) strategy.copy(LocatorUtils.property(locator, "valueSource", sourceValueSource), sourceValueSource, (this.valueSource!= null)));
                    copy.setValueSource(copyValueSource);
                } else {
                    if (valueSourceShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.valueSource = null;
                    }
                }
            }
            {
                Boolean scopeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.scope!= null));
                if (scopeShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceScope;
                    sourceScope = this.getScope();
                    String copyScope = ((String) strategy.copy(LocatorUtils.property(locator, "scope", sourceScope), sourceScope, (this.scope!= null)));
                    copy.setScope(copyScope);
                } else {
                    if (scopeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.scope = null;
                    }
                }
            }
            {
                Boolean taskIdentifierShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.taskIdentifier!= null));
                if (taskIdentifierShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceTaskIdentifier;
                    sourceTaskIdentifier = this.getTaskIdentifier();
                    Long copyTaskIdentifier = ((Long) strategy.copy(LocatorUtils.property(locator, "taskIdentifier", sourceTaskIdentifier), sourceTaskIdentifier, (this.taskIdentifier!= null)));
                    copy.setTaskIdentifier(copyTaskIdentifier);
                } else {
                    if (taskIdentifierShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.taskIdentifier = null;
                    }
                }
            }
            {
                Boolean repetitionsTotalShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.repetitionsTotal!= null));
                if (repetitionsTotalShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceRepetitionsTotal;
                    sourceRepetitionsTotal = this.getRepetitionsTotal();
                    Long copyRepetitionsTotal = ((Long) strategy.copy(LocatorUtils.property(locator, "repetitionsTotal", sourceRepetitionsTotal), sourceRepetitionsTotal, (this.repetitionsTotal!= null)));
                    copy.setRepetitionsTotal(copyRepetitionsTotal);
                } else {
                    if (repetitionsTotalShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.repetitionsTotal = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new PowerSequenceDescriptionDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final PowerSequenceDescriptionDataType that = ((PowerSequenceDescriptionDataType) object);
        {
            Long leftSequenceId;
            leftSequenceId = this.getSequenceId();
            Long rightSequenceId;
            rightSequenceId = that.getSequenceId();
            if (this.sequenceId!= null) {
                if (that.sequenceId!= null) {
                    if (!leftSequenceId.equals(rightSequenceId)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.sequenceId!= null) {
                    return false;
                }
            }
        }
        {
            String leftDescription;
            leftDescription = this.getDescription();
            String rightDescription;
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
            String leftPositiveEnergyDirection;
            leftPositiveEnergyDirection = this.getPositiveEnergyDirection();
            String rightPositiveEnergyDirection;
            rightPositiveEnergyDirection = that.getPositiveEnergyDirection();
            if (this.positiveEnergyDirection!= null) {
                if (that.positiveEnergyDirection!= null) {
                    if (!leftPositiveEnergyDirection.equals(rightPositiveEnergyDirection)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.positiveEnergyDirection!= null) {
                    return false;
                }
            }
        }
        {
            String leftPowerUnit;
            leftPowerUnit = this.getPowerUnit();
            String rightPowerUnit;
            rightPowerUnit = that.getPowerUnit();
            if (this.powerUnit!= null) {
                if (that.powerUnit!= null) {
                    if (!leftPowerUnit.equals(rightPowerUnit)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.powerUnit!= null) {
                    return false;
                }
            }
        }
        {
            String leftEnergyUnit;
            leftEnergyUnit = this.getEnergyUnit();
            String rightEnergyUnit;
            rightEnergyUnit = that.getEnergyUnit();
            if (this.energyUnit!= null) {
                if (that.energyUnit!= null) {
                    if (!leftEnergyUnit.equals(rightEnergyUnit)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.energyUnit!= null) {
                    return false;
                }
            }
        }
        {
            String leftValueSource;
            leftValueSource = this.getValueSource();
            String rightValueSource;
            rightValueSource = that.getValueSource();
            if (this.valueSource!= null) {
                if (that.valueSource!= null) {
                    if (!leftValueSource.equals(rightValueSource)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.valueSource!= null) {
                    return false;
                }
            }
        }
        {
            String leftScope;
            leftScope = this.getScope();
            String rightScope;
            rightScope = that.getScope();
            if (this.scope!= null) {
                if (that.scope!= null) {
                    if (!leftScope.equals(rightScope)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.scope!= null) {
                    return false;
                }
            }
        }
        {
            Long leftTaskIdentifier;
            leftTaskIdentifier = this.getTaskIdentifier();
            Long rightTaskIdentifier;
            rightTaskIdentifier = that.getTaskIdentifier();
            if (this.taskIdentifier!= null) {
                if (that.taskIdentifier!= null) {
                    if (!leftTaskIdentifier.equals(rightTaskIdentifier)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.taskIdentifier!= null) {
                    return false;
                }
            }
        }
        {
            Long leftRepetitionsTotal;
            leftRepetitionsTotal = this.getRepetitionsTotal();
            Long rightRepetitionsTotal;
            rightRepetitionsTotal = that.getRepetitionsTotal();
            if (this.repetitionsTotal!= null) {
                if (that.repetitionsTotal!= null) {
                    if (!leftRepetitionsTotal.equals(rightRepetitionsTotal)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.repetitionsTotal!= null) {
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
            Long theSequenceId;
            theSequenceId = this.getSequenceId();
            if (this.sequenceId!= null) {
                currentHashCode += theSequenceId.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String theDescription;
            theDescription = this.getDescription();
            if (this.description!= null) {
                currentHashCode += theDescription.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String thePositiveEnergyDirection;
            thePositiveEnergyDirection = this.getPositiveEnergyDirection();
            if (this.positiveEnergyDirection!= null) {
                currentHashCode += thePositiveEnergyDirection.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String thePowerUnit;
            thePowerUnit = this.getPowerUnit();
            if (this.powerUnit!= null) {
                currentHashCode += thePowerUnit.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String theEnergyUnit;
            theEnergyUnit = this.getEnergyUnit();
            if (this.energyUnit!= null) {
                currentHashCode += theEnergyUnit.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String theValueSource;
            theValueSource = this.getValueSource();
            if (this.valueSource!= null) {
                currentHashCode += theValueSource.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String theScope;
            theScope = this.getScope();
            if (this.scope!= null) {
                currentHashCode += theScope.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            Long theTaskIdentifier;
            theTaskIdentifier = this.getTaskIdentifier();
            if (this.taskIdentifier!= null) {
                currentHashCode += theTaskIdentifier.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            Long theRepetitionsTotal;
            theRepetitionsTotal = this.getRepetitionsTotal();
            if (this.repetitionsTotal!= null) {
                currentHashCode += theRepetitionsTotal.hashCode();
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
            Long theSequenceId;
            theSequenceId = this.getSequenceId();
            strategy.appendField(locator, this, "sequenceId", buffer, theSequenceId, (this.sequenceId!= null));
        }
        {
            String theDescription;
            theDescription = this.getDescription();
            strategy.appendField(locator, this, "description", buffer, theDescription, (this.description!= null));
        }
        {
            String thePositiveEnergyDirection;
            thePositiveEnergyDirection = this.getPositiveEnergyDirection();
            strategy.appendField(locator, this, "positiveEnergyDirection", buffer, thePositiveEnergyDirection, (this.positiveEnergyDirection!= null));
        }
        {
            String thePowerUnit;
            thePowerUnit = this.getPowerUnit();
            strategy.appendField(locator, this, "powerUnit", buffer, thePowerUnit, (this.powerUnit!= null));
        }
        {
            String theEnergyUnit;
            theEnergyUnit = this.getEnergyUnit();
            strategy.appendField(locator, this, "energyUnit", buffer, theEnergyUnit, (this.energyUnit!= null));
        }
        {
            String theValueSource;
            theValueSource = this.getValueSource();
            strategy.appendField(locator, this, "valueSource", buffer, theValueSource, (this.valueSource!= null));
        }
        {
            String theScope;
            theScope = this.getScope();
            strategy.appendField(locator, this, "scope", buffer, theScope, (this.scope!= null));
        }
        {
            Long theTaskIdentifier;
            theTaskIdentifier = this.getTaskIdentifier();
            strategy.appendField(locator, this, "taskIdentifier", buffer, theTaskIdentifier, (this.taskIdentifier!= null));
        }
        {
            Long theRepetitionsTotal;
            theRepetitionsTotal = this.getRepetitionsTotal();
            strategy.appendField(locator, this, "repetitionsTotal", buffer, theRepetitionsTotal, (this.repetitionsTotal!= null));
        }
        return buffer;
    }

}
