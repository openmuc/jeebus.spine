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
import org.openmuc.jeebus.spine.impl.parser.CustomToStringStrategy;


/**
 * <p>Java class for ElectricalConnectionDescriptionDataElementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElectricalConnectionDescriptionDataElementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="electricalConnectionId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="powerSupplyType" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="acConnectedPhases" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="acRmsPeriodDuration" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="positiveEnergyDirection" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="scopeType" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="label" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
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
@XmlType(name = "ElectricalConnectionDescriptionDataElementsType", propOrder = {
    "electricalConnectionId",
    "powerSupplyType",
    "acConnectedPhases",
    "acRmsPeriodDuration",
    "positiveEnergyDirection",
    "scopeType",
    "label",
    "description"
})
public class ElectricalConnectionDescriptionDataElementsType implements Cloneable, CopyTo, ToString
{

    protected ElementTagType electricalConnectionId;
    protected ElementTagType powerSupplyType;
    protected ElementTagType acConnectedPhases;
    protected ElementTagType acRmsPeriodDuration;
    protected ElementTagType positiveEnergyDirection;
    protected ElementTagType scopeType;
    protected ElementTagType label;
    protected ElementTagType description;

    /**
     * Default no-arg constructor
     * 
     */
    public ElectricalConnectionDescriptionDataElementsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public ElectricalConnectionDescriptionDataElementsType(final ElementTagType electricalConnectionId, final ElementTagType powerSupplyType, final ElementTagType acConnectedPhases, final ElementTagType acRmsPeriodDuration, final ElementTagType positiveEnergyDirection, final ElementTagType scopeType, final ElementTagType label, final ElementTagType description) {
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
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getElectricalConnectionId() {
        return electricalConnectionId;
    }

    /**
     * Sets the value of the electricalConnectionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setElectricalConnectionId(ElementTagType value) {
        this.electricalConnectionId = value;
    }

    /**
     * Gets the value of the powerSupplyType property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getPowerSupplyType() {
        return powerSupplyType;
    }

    /**
     * Sets the value of the powerSupplyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setPowerSupplyType(ElementTagType value) {
        this.powerSupplyType = value;
    }

    /**
     * Gets the value of the acConnectedPhases property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getAcConnectedPhases() {
        return acConnectedPhases;
    }

    /**
     * Sets the value of the acConnectedPhases property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setAcConnectedPhases(ElementTagType value) {
        this.acConnectedPhases = value;
    }

    /**
     * Gets the value of the acRmsPeriodDuration property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getAcRmsPeriodDuration() {
        return acRmsPeriodDuration;
    }

    /**
     * Sets the value of the acRmsPeriodDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setAcRmsPeriodDuration(ElementTagType value) {
        this.acRmsPeriodDuration = value;
    }

    /**
     * Gets the value of the positiveEnergyDirection property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getPositiveEnergyDirection() {
        return positiveEnergyDirection;
    }

    /**
     * Sets the value of the positiveEnergyDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setPositiveEnergyDirection(ElementTagType value) {
        this.positiveEnergyDirection = value;
    }

    /**
     * Gets the value of the scopeType property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getScopeType() {
        return scopeType;
    }

    /**
     * Sets the value of the scopeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setScopeType(ElementTagType value) {
        this.scopeType = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setLabel(ElementTagType value) {
        this.label = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setDescription(ElementTagType value) {
        this.description = value;
    }

    /**
     * Sets the value of the electricalConnectionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public ElectricalConnectionDescriptionDataElementsType withElectricalConnectionId(ElementTagType value) {
        setElectricalConnectionId(value);
        return this;
    }

    /**
     * Sets the value of the powerSupplyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public ElectricalConnectionDescriptionDataElementsType withPowerSupplyType(ElementTagType value) {
        setPowerSupplyType(value);
        return this;
    }

    /**
     * Sets the value of the acConnectedPhases property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public ElectricalConnectionDescriptionDataElementsType withAcConnectedPhases(ElementTagType value) {
        setAcConnectedPhases(value);
        return this;
    }

    /**
     * Sets the value of the acRmsPeriodDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public ElectricalConnectionDescriptionDataElementsType withAcRmsPeriodDuration(ElementTagType value) {
        setAcRmsPeriodDuration(value);
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
    public ElectricalConnectionDescriptionDataElementsType withPositiveEnergyDirection(ElementTagType value) {
        setPositiveEnergyDirection(value);
        return this;
    }

    /**
     * Sets the value of the scopeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public ElectricalConnectionDescriptionDataElementsType withScopeType(ElementTagType value) {
        setScopeType(value);
        return this;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public ElectricalConnectionDescriptionDataElementsType withLabel(ElementTagType value) {
        setLabel(value);
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
    public ElectricalConnectionDescriptionDataElementsType withDescription(ElementTagType value) {
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
        if (draftCopy instanceof ElectricalConnectionDescriptionDataElementsType) {
            final ElectricalConnectionDescriptionDataElementsType copy = ((ElectricalConnectionDescriptionDataElementsType) draftCopy);
            {
                Boolean electricalConnectionIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.electricalConnectionId!= null));
                if (electricalConnectionIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceElectricalConnectionId;
                    sourceElectricalConnectionId = this.getElectricalConnectionId();
                    ElementTagType copyElectricalConnectionId = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "electricalConnectionId", sourceElectricalConnectionId), sourceElectricalConnectionId, (this.electricalConnectionId!= null)));
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
                    ElementTagType sourcePowerSupplyType;
                    sourcePowerSupplyType = this.getPowerSupplyType();
                    ElementTagType copyPowerSupplyType = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "powerSupplyType", sourcePowerSupplyType), sourcePowerSupplyType, (this.powerSupplyType!= null)));
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
                    ElementTagType sourceAcConnectedPhases;
                    sourceAcConnectedPhases = this.getAcConnectedPhases();
                    ElementTagType copyAcConnectedPhases = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "acConnectedPhases", sourceAcConnectedPhases), sourceAcConnectedPhases, (this.acConnectedPhases!= null)));
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
                    ElementTagType sourceAcRmsPeriodDuration;
                    sourceAcRmsPeriodDuration = this.getAcRmsPeriodDuration();
                    ElementTagType copyAcRmsPeriodDuration = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "acRmsPeriodDuration", sourceAcRmsPeriodDuration), sourceAcRmsPeriodDuration, (this.acRmsPeriodDuration!= null)));
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
                    ElementTagType sourcePositiveEnergyDirection;
                    sourcePositiveEnergyDirection = this.getPositiveEnergyDirection();
                    ElementTagType copyPositiveEnergyDirection = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "positiveEnergyDirection", sourcePositiveEnergyDirection), sourcePositiveEnergyDirection, (this.positiveEnergyDirection!= null)));
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
                    ElementTagType sourceScopeType;
                    sourceScopeType = this.getScopeType();
                    ElementTagType copyScopeType = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "scopeType", sourceScopeType), sourceScopeType, (this.scopeType!= null)));
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
                    ElementTagType sourceLabel;
                    sourceLabel = this.getLabel();
                    ElementTagType copyLabel = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "label", sourceLabel), sourceLabel, (this.label!= null)));
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
                    ElementTagType sourceDescription;
                    sourceDescription = this.getDescription();
                    ElementTagType copyDescription = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "description", sourceDescription), sourceDescription, (this.description!= null)));
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
        return new ElectricalConnectionDescriptionDataElementsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ElectricalConnectionDescriptionDataElementsType that = ((ElectricalConnectionDescriptionDataElementsType) object);
        {
            ElementTagType leftElectricalConnectionId;
            leftElectricalConnectionId = this.getElectricalConnectionId();
            ElementTagType rightElectricalConnectionId;
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
            ElementTagType leftPowerSupplyType;
            leftPowerSupplyType = this.getPowerSupplyType();
            ElementTagType rightPowerSupplyType;
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
            ElementTagType leftAcConnectedPhases;
            leftAcConnectedPhases = this.getAcConnectedPhases();
            ElementTagType rightAcConnectedPhases;
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
            ElementTagType leftAcRmsPeriodDuration;
            leftAcRmsPeriodDuration = this.getAcRmsPeriodDuration();
            ElementTagType rightAcRmsPeriodDuration;
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
            ElementTagType leftPositiveEnergyDirection;
            leftPositiveEnergyDirection = this.getPositiveEnergyDirection();
            ElementTagType rightPositiveEnergyDirection;
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
            ElementTagType leftScopeType;
            leftScopeType = this.getScopeType();
            ElementTagType rightScopeType;
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
            ElementTagType leftLabel;
            leftLabel = this.getLabel();
            ElementTagType rightLabel;
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
            ElementTagType leftDescription;
            leftDescription = this.getDescription();
            ElementTagType rightDescription;
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
            ElementTagType theElectricalConnectionId;
            theElectricalConnectionId = this.getElectricalConnectionId();
            if (this.electricalConnectionId!= null) {
                currentHashCode += theElectricalConnectionId.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType thePowerSupplyType;
            thePowerSupplyType = this.getPowerSupplyType();
            if (this.powerSupplyType!= null) {
                currentHashCode += thePowerSupplyType.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theAcConnectedPhases;
            theAcConnectedPhases = this.getAcConnectedPhases();
            if (this.acConnectedPhases!= null) {
                currentHashCode += theAcConnectedPhases.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theAcRmsPeriodDuration;
            theAcRmsPeriodDuration = this.getAcRmsPeriodDuration();
            if (this.acRmsPeriodDuration!= null) {
                currentHashCode += theAcRmsPeriodDuration.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType thePositiveEnergyDirection;
            thePositiveEnergyDirection = this.getPositiveEnergyDirection();
            if (this.positiveEnergyDirection!= null) {
                currentHashCode += thePositiveEnergyDirection.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theScopeType;
            theScopeType = this.getScopeType();
            if (this.scopeType!= null) {
                currentHashCode += theScopeType.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theLabel;
            theLabel = this.getLabel();
            if (this.label!= null) {
                currentHashCode += theLabel.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theDescription;
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
            ElementTagType theElectricalConnectionId;
            theElectricalConnectionId = this.getElectricalConnectionId();
            strategy.appendField(locator, this, "electricalConnectionId", buffer, theElectricalConnectionId, (this.electricalConnectionId!= null));
        }
        {
            ElementTagType thePowerSupplyType;
            thePowerSupplyType = this.getPowerSupplyType();
            strategy.appendField(locator, this, "powerSupplyType", buffer, thePowerSupplyType, (this.powerSupplyType!= null));
        }
        {
            ElementTagType theAcConnectedPhases;
            theAcConnectedPhases = this.getAcConnectedPhases();
            strategy.appendField(locator, this, "acConnectedPhases", buffer, theAcConnectedPhases, (this.acConnectedPhases!= null));
        }
        {
            ElementTagType theAcRmsPeriodDuration;
            theAcRmsPeriodDuration = this.getAcRmsPeriodDuration();
            strategy.appendField(locator, this, "acRmsPeriodDuration", buffer, theAcRmsPeriodDuration, (this.acRmsPeriodDuration!= null));
        }
        {
            ElementTagType thePositiveEnergyDirection;
            thePositiveEnergyDirection = this.getPositiveEnergyDirection();
            strategy.appendField(locator, this, "positiveEnergyDirection", buffer, thePositiveEnergyDirection, (this.positiveEnergyDirection!= null));
        }
        {
            ElementTagType theScopeType;
            theScopeType = this.getScopeType();
            strategy.appendField(locator, this, "scopeType", buffer, theScopeType, (this.scopeType!= null));
        }
        {
            ElementTagType theLabel;
            theLabel = this.getLabel();
            strategy.appendField(locator, this, "label", buffer, theLabel, (this.label!= null));
        }
        {
            ElementTagType theDescription;
            theDescription = this.getDescription();
            strategy.appendField(locator, this, "description", buffer, theDescription, (this.description!= null));
        }
        return buffer;
    }

}
