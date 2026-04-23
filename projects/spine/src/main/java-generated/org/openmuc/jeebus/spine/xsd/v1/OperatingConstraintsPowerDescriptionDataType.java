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
 * <p>Java class for OperatingConstraintsPowerDescriptionDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OperatingConstraintsPowerDescriptionDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sequenceId" type="{http://docs.eebus.org/spine/xsd/v1}PowerSequenceIdType" minOccurs="0"/&gt;
 *         &lt;element name="positiveEnergyDirection" type="{http://docs.eebus.org/spine/xsd/v1}EnergyDirectionType" minOccurs="0"/&gt;
 *         &lt;element name="powerUnit" type="{http://docs.eebus.org/spine/xsd/v1}UnitOfMeasurementType" minOccurs="0"/&gt;
 *         &lt;element name="energyUnit" type="{http://docs.eebus.org/spine/xsd/v1}UnitOfMeasurementType" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://docs.eebus.org/spine/xsd/v1}DescriptionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperatingConstraintsPowerDescriptionDataType", propOrder = {
    "sequenceId",
    "positiveEnergyDirection",
    "powerUnit",
    "energyUnit",
    "description"
})
public class OperatingConstraintsPowerDescriptionDataType implements Cloneable, CopyTo, ToString
{

    @XmlSchemaType(name = "unsignedInt")
    protected Long sequenceId;
    protected String positiveEnergyDirection;
    protected String powerUnit;
    protected String energyUnit;
    protected String description;

    /**
     * Default no-arg constructor
     * 
     */
    public OperatingConstraintsPowerDescriptionDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public OperatingConstraintsPowerDescriptionDataType(final Long sequenceId, final String positiveEnergyDirection, final String powerUnit, final String energyUnit, final String description) {
        this.sequenceId = sequenceId;
        this.positiveEnergyDirection = positiveEnergyDirection;
        this.powerUnit = powerUnit;
        this.energyUnit = energyUnit;
        this.description = description;
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
     * Sets the value of the sequenceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     * @return
     *     The class instance
     */
    public OperatingConstraintsPowerDescriptionDataType withSequenceId(Long value) {
        setSequenceId(value);
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
    public OperatingConstraintsPowerDescriptionDataType withPositiveEnergyDirection(String value) {
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
    public OperatingConstraintsPowerDescriptionDataType withPowerUnit(String value) {
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
    public OperatingConstraintsPowerDescriptionDataType withEnergyUnit(String value) {
        setEnergyUnit(value);
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
    public OperatingConstraintsPowerDescriptionDataType withDescription(String value) {
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
        if (draftCopy instanceof OperatingConstraintsPowerDescriptionDataType) {
            final OperatingConstraintsPowerDescriptionDataType copy = ((OperatingConstraintsPowerDescriptionDataType) draftCopy);
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
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new OperatingConstraintsPowerDescriptionDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final OperatingConstraintsPowerDescriptionDataType that = ((OperatingConstraintsPowerDescriptionDataType) object);
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
            String theDescription;
            theDescription = this.getDescription();
            if (this.description!= null) {
                currentHashCode += theDescription.hashCode();
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
            String theDescription;
            theDescription = this.getDescription();
            strategy.appendField(locator, this, "description", buffer, theDescription, (this.description!= null));
        }
        return buffer;
    }

}
