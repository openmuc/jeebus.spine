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
 * <p>Java class for ElectricalConnectionDescriptionDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElectricalConnectionDescriptionDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="electricalConnectionId" type="{http://docs.eebus.org/spine/xsd/v1}ElectricalConnectionIdType" minOccurs="0"/&gt;
 *         &lt;element name="powerSupplyType" type="{http://docs.eebus.org/spine/xsd/v1}ElectricalConnectionVoltageTypeType" minOccurs="0"/&gt;
 *         &lt;element name="acConnectedPhases" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="acRmsPeriodDuration" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *         &lt;element name="positiveEnergyDirection" type="{http://docs.eebus.org/spine/xsd/v1}EnergyDirectionType" minOccurs="0"/&gt;
 *         &lt;element name="scopeType" type="{http://docs.eebus.org/spine/xsd/v1}ScopeTypeType" minOccurs="0"/&gt;
 *         &lt;element name="label" type="{http://docs.eebus.org/spine/xsd/v1}LabelType" minOccurs="0"/&gt;
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
@XmlType(name = "ElectricalConnectionDescriptionDataType", propOrder = {
    "electricalConnectionId",
    "powerSupplyType",
    "acConnectedPhases",
    "acRmsPeriodDuration",
    "positiveEnergyDirection",
    "scopeType",
    "label",
    "description"
})
public class ElectricalConnectionDescriptionDataType implements Cloneable, CopyTo, ToString
{

    @XmlSchemaType(name = "unsignedInt")
    protected Long electricalConnectionId;
    protected String powerSupplyType;
    @XmlSchemaType(name = "unsignedInt")
    protected Long acConnectedPhases;
    protected Duration acRmsPeriodDuration;
    protected String positiveEnergyDirection;
    protected String scopeType;
    protected String label;
    protected String description;

    /**
     * Default no-arg constructor
     * 
     */
    public ElectricalConnectionDescriptionDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public ElectricalConnectionDescriptionDataType(final Long electricalConnectionId, final String powerSupplyType, final Long acConnectedPhases, final Duration acRmsPeriodDuration, final String positiveEnergyDirection, final String scopeType, final String label, final String description) {
        this.electricalConnectionId = electricalConnectionId;
        this.powerSupplyType = powerSupplyType;
        this.acConnectedPhases = acConnectedPhases;
        this.acRmsPeriodDuration = acRmsPeriodDuration;
        this.positiveEnergyDirection = positiveEnergyDirection;
        this.scopeType = scopeType;
        this.label = label;
        this.description = description;
    }

    /**
     * Gets the value of the electricalConnectionId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getElectricalConnectionId() {
        return electricalConnectionId;
    }

    /**
     * Sets the value of the electricalConnectionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setElectricalConnectionId(Long value) {
        this.electricalConnectionId = value;
    }

    /**
     * Gets the value of the powerSupplyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPowerSupplyType() {
        return powerSupplyType;
    }

    /**
     * Sets the value of the powerSupplyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPowerSupplyType(String value) {
        this.powerSupplyType = value;
    }

    /**
     * Gets the value of the acConnectedPhases property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAcConnectedPhases() {
        return acConnectedPhases;
    }

    /**
     * Sets the value of the acConnectedPhases property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAcConnectedPhases(Long value) {
        this.acConnectedPhases = value;
    }

    /**
     * Gets the value of the acRmsPeriodDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getAcRmsPeriodDuration() {
        return acRmsPeriodDuration;
    }

    /**
     * Sets the value of the acRmsPeriodDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setAcRmsPeriodDuration(Duration value) {
        this.acRmsPeriodDuration = value;
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
     * Gets the value of the scopeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScopeType() {
        return scopeType;
    }

    /**
     * Sets the value of the scopeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScopeType(String value) {
        this.scopeType = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
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
     * Sets the value of the electricalConnectionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     * @return
     *     The class instance
     */
    public ElectricalConnectionDescriptionDataType withElectricalConnectionId(Long value) {
        setElectricalConnectionId(value);
        return this;
    }

    /**
     * Sets the value of the powerSupplyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public ElectricalConnectionDescriptionDataType withPowerSupplyType(String value) {
        setPowerSupplyType(value);
        return this;
    }

    /**
     * Sets the value of the acConnectedPhases property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     * @return
     *     The class instance
     */
    public ElectricalConnectionDescriptionDataType withAcConnectedPhases(Long value) {
        setAcConnectedPhases(value);
        return this;
    }

    /**
     * Sets the value of the acRmsPeriodDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     * @return
     *     The class instance
     */
    public ElectricalConnectionDescriptionDataType withAcRmsPeriodDuration(Duration value) {
        setAcRmsPeriodDuration(value);
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
    public ElectricalConnectionDescriptionDataType withPositiveEnergyDirection(String value) {
        setPositiveEnergyDirection(value);
        return this;
    }

    /**
     * Sets the value of the scopeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public ElectricalConnectionDescriptionDataType withScopeType(String value) {
        setScopeType(value);
        return this;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public ElectricalConnectionDescriptionDataType withLabel(String value) {
        setLabel(value);
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
    public ElectricalConnectionDescriptionDataType withDescription(String value) {
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
        if (draftCopy instanceof ElectricalConnectionDescriptionDataType) {
            final ElectricalConnectionDescriptionDataType copy = ((ElectricalConnectionDescriptionDataType) draftCopy);
            {
                Boolean electricalConnectionIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.electricalConnectionId!= null));
                if (electricalConnectionIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceElectricalConnectionId;
                    sourceElectricalConnectionId = this.getElectricalConnectionId();
                    Long copyElectricalConnectionId = ((Long) strategy.copy(LocatorUtils.property(locator, "electricalConnectionId", sourceElectricalConnectionId), sourceElectricalConnectionId, (this.electricalConnectionId!= null)));
                    copy.setElectricalConnectionId(copyElectricalConnectionId);
                } else {
                    if (electricalConnectionIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.electricalConnectionId = null;
                    }
                }
            }
            {
                Boolean powerSupplyTypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.powerSupplyType!= null));
                if (powerSupplyTypeShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourcePowerSupplyType;
                    sourcePowerSupplyType = this.getPowerSupplyType();
                    String copyPowerSupplyType = ((String) strategy.copy(LocatorUtils.property(locator, "powerSupplyType", sourcePowerSupplyType), sourcePowerSupplyType, (this.powerSupplyType!= null)));
                    copy.setPowerSupplyType(copyPowerSupplyType);
                } else {
                    if (powerSupplyTypeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.powerSupplyType = null;
                    }
                }
            }
            {
                Boolean acConnectedPhasesShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.acConnectedPhases!= null));
                if (acConnectedPhasesShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceAcConnectedPhases;
                    sourceAcConnectedPhases = this.getAcConnectedPhases();
                    Long copyAcConnectedPhases = ((Long) strategy.copy(LocatorUtils.property(locator, "acConnectedPhases", sourceAcConnectedPhases), sourceAcConnectedPhases, (this.acConnectedPhases!= null)));
                    copy.setAcConnectedPhases(copyAcConnectedPhases);
                } else {
                    if (acConnectedPhasesShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.acConnectedPhases = null;
                    }
                }
            }
            {
                Boolean acRmsPeriodDurationShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.acRmsPeriodDuration!= null));
                if (acRmsPeriodDurationShouldBeCopiedAndSet == Boolean.TRUE) {
                    Duration sourceAcRmsPeriodDuration;
                    sourceAcRmsPeriodDuration = this.getAcRmsPeriodDuration();
                    Duration copyAcRmsPeriodDuration = ((Duration) strategy.copy(LocatorUtils.property(locator, "acRmsPeriodDuration", sourceAcRmsPeriodDuration), sourceAcRmsPeriodDuration, (this.acRmsPeriodDuration!= null)));
                    copy.setAcRmsPeriodDuration(copyAcRmsPeriodDuration);
                } else {
                    if (acRmsPeriodDurationShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.acRmsPeriodDuration = null;
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
                Boolean scopeTypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.scopeType!= null));
                if (scopeTypeShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceScopeType;
                    sourceScopeType = this.getScopeType();
                    String copyScopeType = ((String) strategy.copy(LocatorUtils.property(locator, "scopeType", sourceScopeType), sourceScopeType, (this.scopeType!= null)));
                    copy.setScopeType(copyScopeType);
                } else {
                    if (scopeTypeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.scopeType = null;
                    }
                }
            }
            {
                Boolean labelShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.label!= null));
                if (labelShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceLabel;
                    sourceLabel = this.getLabel();
                    String copyLabel = ((String) strategy.copy(LocatorUtils.property(locator, "label", sourceLabel), sourceLabel, (this.label!= null)));
                    copy.setLabel(copyLabel);
                } else {
                    if (labelShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.label = null;
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
        return new ElectricalConnectionDescriptionDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ElectricalConnectionDescriptionDataType that = ((ElectricalConnectionDescriptionDataType) object);
        {
            Long leftElectricalConnectionId;
            leftElectricalConnectionId = this.getElectricalConnectionId();
            Long rightElectricalConnectionId;
            rightElectricalConnectionId = that.getElectricalConnectionId();
            if (this.electricalConnectionId!= null) {
                if (that.electricalConnectionId!= null) {
                    if (!leftElectricalConnectionId.equals(rightElectricalConnectionId)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.electricalConnectionId!= null) {
                    return false;
                }
            }
        }
        {
            String leftPowerSupplyType;
            leftPowerSupplyType = this.getPowerSupplyType();
            String rightPowerSupplyType;
            rightPowerSupplyType = that.getPowerSupplyType();
            if (this.powerSupplyType!= null) {
                if (that.powerSupplyType!= null) {
                    if (!leftPowerSupplyType.equals(rightPowerSupplyType)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.powerSupplyType!= null) {
                    return false;
                }
            }
        }
        {
            Long leftAcConnectedPhases;
            leftAcConnectedPhases = this.getAcConnectedPhases();
            Long rightAcConnectedPhases;
            rightAcConnectedPhases = that.getAcConnectedPhases();
            if (this.acConnectedPhases!= null) {
                if (that.acConnectedPhases!= null) {
                    if (!leftAcConnectedPhases.equals(rightAcConnectedPhases)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.acConnectedPhases!= null) {
                    return false;
                }
            }
        }
        {
            Duration leftAcRmsPeriodDuration;
            leftAcRmsPeriodDuration = this.getAcRmsPeriodDuration();
            Duration rightAcRmsPeriodDuration;
            rightAcRmsPeriodDuration = that.getAcRmsPeriodDuration();
            if (this.acRmsPeriodDuration!= null) {
                if (that.acRmsPeriodDuration!= null) {
                    if (!leftAcRmsPeriodDuration.equals(rightAcRmsPeriodDuration)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.acRmsPeriodDuration!= null) {
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
            String leftScopeType;
            leftScopeType = this.getScopeType();
            String rightScopeType;
            rightScopeType = that.getScopeType();
            if (this.scopeType!= null) {
                if (that.scopeType!= null) {
                    if (!leftScopeType.equals(rightScopeType)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.scopeType!= null) {
                    return false;
                }
            }
        }
        {
            String leftLabel;
            leftLabel = this.getLabel();
            String rightLabel;
            rightLabel = that.getLabel();
            if (this.label!= null) {
                if (that.label!= null) {
                    if (!leftLabel.equals(rightLabel)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.label!= null) {
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
            Long theElectricalConnectionId;
            theElectricalConnectionId = this.getElectricalConnectionId();
            if (this.electricalConnectionId!= null) {
                currentHashCode += theElectricalConnectionId.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String thePowerSupplyType;
            thePowerSupplyType = this.getPowerSupplyType();
            if (this.powerSupplyType!= null) {
                currentHashCode += thePowerSupplyType.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            Long theAcConnectedPhases;
            theAcConnectedPhases = this.getAcConnectedPhases();
            if (this.acConnectedPhases!= null) {
                currentHashCode += theAcConnectedPhases.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            Duration theAcRmsPeriodDuration;
            theAcRmsPeriodDuration = this.getAcRmsPeriodDuration();
            if (this.acRmsPeriodDuration!= null) {
                currentHashCode += theAcRmsPeriodDuration.hashCode();
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
            String theScopeType;
            theScopeType = this.getScopeType();
            if (this.scopeType!= null) {
                currentHashCode += theScopeType.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String theLabel;
            theLabel = this.getLabel();
            if (this.label!= null) {
                currentHashCode += theLabel.hashCode();
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
            Long theElectricalConnectionId;
            theElectricalConnectionId = this.getElectricalConnectionId();
            strategy.appendField(locator, this, "electricalConnectionId", buffer, theElectricalConnectionId, (this.electricalConnectionId!= null));
        }
        {
            String thePowerSupplyType;
            thePowerSupplyType = this.getPowerSupplyType();
            strategy.appendField(locator, this, "powerSupplyType", buffer, thePowerSupplyType, (this.powerSupplyType!= null));
        }
        {
            Long theAcConnectedPhases;
            theAcConnectedPhases = this.getAcConnectedPhases();
            strategy.appendField(locator, this, "acConnectedPhases", buffer, theAcConnectedPhases, (this.acConnectedPhases!= null));
        }
        {
            Duration theAcRmsPeriodDuration;
            theAcRmsPeriodDuration = this.getAcRmsPeriodDuration();
            strategy.appendField(locator, this, "acRmsPeriodDuration", buffer, theAcRmsPeriodDuration, (this.acRmsPeriodDuration!= null));
        }
        {
            String thePositiveEnergyDirection;
            thePositiveEnergyDirection = this.getPositiveEnergyDirection();
            strategy.appendField(locator, this, "positiveEnergyDirection", buffer, thePositiveEnergyDirection, (this.positiveEnergyDirection!= null));
        }
        {
            String theScopeType;
            theScopeType = this.getScopeType();
            strategy.appendField(locator, this, "scopeType", buffer, theScopeType, (this.scopeType!= null));
        }
        {
            String theLabel;
            theLabel = this.getLabel();
            strategy.appendField(locator, this, "label", buffer, theLabel, (this.label!= null));
        }
        {
            String theDescription;
            theDescription = this.getDescription();
            strategy.appendField(locator, this, "description", buffer, theDescription, (this.description!= null));
        }
        return buffer;
    }

}
