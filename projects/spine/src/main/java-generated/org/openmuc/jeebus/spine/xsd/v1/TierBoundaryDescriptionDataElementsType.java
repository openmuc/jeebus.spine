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
 * <p>Java class for TierBoundaryDescriptionDataElementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TierBoundaryDescriptionDataElementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="boundaryId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="boundaryType" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="validForTierId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="switchToTierIdWhenLower" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="switchToTierIdWhenHigher" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="boundaryUnit" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
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
@XmlType(name = "TierBoundaryDescriptionDataElementsType", propOrder = {
    "boundaryId",
    "boundaryType",
    "validForTierId",
    "switchToTierIdWhenLower",
    "switchToTierIdWhenHigher",
    "boundaryUnit",
    "label",
    "description"
})
@XmlSeeAlso({
    org.openmuc.jeebus.spine.xsd.v1.IncentiveTableDescriptionTierElementsType.BoundaryDescription.class
})
public class TierBoundaryDescriptionDataElementsType implements Cloneable, CopyTo, ToString
{

    protected ElementTagType boundaryId;
    protected ElementTagType boundaryType;
    protected ElementTagType validForTierId;
    protected ElementTagType switchToTierIdWhenLower;
    protected ElementTagType switchToTierIdWhenHigher;
    protected ElementTagType boundaryUnit;
    protected ElementTagType label;
    protected ElementTagType description;

    /**
     * Default no-arg constructor
     * 
     */
    public TierBoundaryDescriptionDataElementsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public TierBoundaryDescriptionDataElementsType(final ElementTagType boundaryId, final ElementTagType boundaryType, final ElementTagType validForTierId, final ElementTagType switchToTierIdWhenLower, final ElementTagType switchToTierIdWhenHigher, final ElementTagType boundaryUnit, final ElementTagType label, final ElementTagType description) {
        this.boundaryId = boundaryId;
        this.boundaryType = boundaryType;
        this.validForTierId = validForTierId;
        this.switchToTierIdWhenLower = switchToTierIdWhenLower;
        this.switchToTierIdWhenHigher = switchToTierIdWhenHigher;
        this.boundaryUnit = boundaryUnit;
        this.label = label;
        this.description = description;
    }

    /**
     * Gets the value of the boundaryId property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getBoundaryId() {
        return boundaryId;
    }

    /**
     * Sets the value of the boundaryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setBoundaryId(ElementTagType value) {
        this.boundaryId = value;
    }

    /**
     * Gets the value of the boundaryType property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getBoundaryType() {
        return boundaryType;
    }

    /**
     * Sets the value of the boundaryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setBoundaryType(ElementTagType value) {
        this.boundaryType = value;
    }

    /**
     * Gets the value of the validForTierId property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getValidForTierId() {
        return validForTierId;
    }

    /**
     * Sets the value of the validForTierId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setValidForTierId(ElementTagType value) {
        this.validForTierId = value;
    }

    /**
     * Gets the value of the switchToTierIdWhenLower property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getSwitchToTierIdWhenLower() {
        return switchToTierIdWhenLower;
    }

    /**
     * Sets the value of the switchToTierIdWhenLower property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setSwitchToTierIdWhenLower(ElementTagType value) {
        this.switchToTierIdWhenLower = value;
    }

    /**
     * Gets the value of the switchToTierIdWhenHigher property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getSwitchToTierIdWhenHigher() {
        return switchToTierIdWhenHigher;
    }

    /**
     * Sets the value of the switchToTierIdWhenHigher property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setSwitchToTierIdWhenHigher(ElementTagType value) {
        this.switchToTierIdWhenHigher = value;
    }

    /**
     * Gets the value of the boundaryUnit property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getBoundaryUnit() {
        return boundaryUnit;
    }

    /**
     * Sets the value of the boundaryUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setBoundaryUnit(ElementTagType value) {
        this.boundaryUnit = value;
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
     * Sets the value of the boundaryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public TierBoundaryDescriptionDataElementsType withBoundaryId(ElementTagType value) {
        setBoundaryId(value);
        return this;
    }

    /**
     * Sets the value of the boundaryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public TierBoundaryDescriptionDataElementsType withBoundaryType(ElementTagType value) {
        setBoundaryType(value);
        return this;
    }

    /**
     * Sets the value of the validForTierId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public TierBoundaryDescriptionDataElementsType withValidForTierId(ElementTagType value) {
        setValidForTierId(value);
        return this;
    }

    /**
     * Sets the value of the switchToTierIdWhenLower property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public TierBoundaryDescriptionDataElementsType withSwitchToTierIdWhenLower(ElementTagType value) {
        setSwitchToTierIdWhenLower(value);
        return this;
    }

    /**
     * Sets the value of the switchToTierIdWhenHigher property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public TierBoundaryDescriptionDataElementsType withSwitchToTierIdWhenHigher(ElementTagType value) {
        setSwitchToTierIdWhenHigher(value);
        return this;
    }

    /**
     * Sets the value of the boundaryUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public TierBoundaryDescriptionDataElementsType withBoundaryUnit(ElementTagType value) {
        setBoundaryUnit(value);
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
    public TierBoundaryDescriptionDataElementsType withLabel(ElementTagType value) {
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
    public TierBoundaryDescriptionDataElementsType withDescription(ElementTagType value) {
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
        if (draftCopy instanceof TierBoundaryDescriptionDataElementsType) {
            final TierBoundaryDescriptionDataElementsType copy = ((TierBoundaryDescriptionDataElementsType) draftCopy);
            {
                Boolean boundaryIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.boundaryId!= null));
                if (boundaryIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceBoundaryId;
                    sourceBoundaryId = this.getBoundaryId();
                    ElementTagType copyBoundaryId = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "boundaryId", sourceBoundaryId), sourceBoundaryId, (this.boundaryId!= null)));
                    copy.setBoundaryId(copyBoundaryId);
                } else {
                    if (boundaryIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.boundaryId = null;
                    }
                }
            }
            {
                Boolean boundaryTypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.boundaryType!= null));
                if (boundaryTypeShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceBoundaryType;
                    sourceBoundaryType = this.getBoundaryType();
                    ElementTagType copyBoundaryType = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "boundaryType", sourceBoundaryType), sourceBoundaryType, (this.boundaryType!= null)));
                    copy.setBoundaryType(copyBoundaryType);
                } else {
                    if (boundaryTypeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.boundaryType = null;
                    }
                }
            }
            {
                Boolean validForTierIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.validForTierId!= null));
                if (validForTierIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceValidForTierId;
                    sourceValidForTierId = this.getValidForTierId();
                    ElementTagType copyValidForTierId = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "validForTierId", sourceValidForTierId), sourceValidForTierId, (this.validForTierId!= null)));
                    copy.setValidForTierId(copyValidForTierId);
                } else {
                    if (validForTierIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.validForTierId = null;
                    }
                }
            }
            {
                Boolean switchToTierIdWhenLowerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.switchToTierIdWhenLower!= null));
                if (switchToTierIdWhenLowerShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceSwitchToTierIdWhenLower;
                    sourceSwitchToTierIdWhenLower = this.getSwitchToTierIdWhenLower();
                    ElementTagType copySwitchToTierIdWhenLower = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "switchToTierIdWhenLower", sourceSwitchToTierIdWhenLower), sourceSwitchToTierIdWhenLower, (this.switchToTierIdWhenLower!= null)));
                    copy.setSwitchToTierIdWhenLower(copySwitchToTierIdWhenLower);
                } else {
                    if (switchToTierIdWhenLowerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.switchToTierIdWhenLower = null;
                    }
                }
            }
            {
                Boolean switchToTierIdWhenHigherShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.switchToTierIdWhenHigher!= null));
                if (switchToTierIdWhenHigherShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceSwitchToTierIdWhenHigher;
                    sourceSwitchToTierIdWhenHigher = this.getSwitchToTierIdWhenHigher();
                    ElementTagType copySwitchToTierIdWhenHigher = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "switchToTierIdWhenHigher", sourceSwitchToTierIdWhenHigher), sourceSwitchToTierIdWhenHigher, (this.switchToTierIdWhenHigher!= null)));
                    copy.setSwitchToTierIdWhenHigher(copySwitchToTierIdWhenHigher);
                } else {
                    if (switchToTierIdWhenHigherShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.switchToTierIdWhenHigher = null;
                    }
                }
            }
            {
                Boolean boundaryUnitShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.boundaryUnit!= null));
                if (boundaryUnitShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceBoundaryUnit;
                    sourceBoundaryUnit = this.getBoundaryUnit();
                    ElementTagType copyBoundaryUnit = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "boundaryUnit", sourceBoundaryUnit), sourceBoundaryUnit, (this.boundaryUnit!= null)));
                    copy.setBoundaryUnit(copyBoundaryUnit);
                } else {
                    if (boundaryUnitShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.boundaryUnit = null;
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
        return new TierBoundaryDescriptionDataElementsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TierBoundaryDescriptionDataElementsType that = ((TierBoundaryDescriptionDataElementsType) object);
        {
            ElementTagType leftBoundaryId;
            leftBoundaryId = this.getBoundaryId();
            ElementTagType rightBoundaryId;
            rightBoundaryId = that.getBoundaryId();
            if (this.boundaryId!= null) {
                if (that.boundaryId!= null) {
                    if (!leftBoundaryId.equals(rightBoundaryId)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.boundaryId!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftBoundaryType;
            leftBoundaryType = this.getBoundaryType();
            ElementTagType rightBoundaryType;
            rightBoundaryType = that.getBoundaryType();
            if (this.boundaryType!= null) {
                if (that.boundaryType!= null) {
                    if (!leftBoundaryType.equals(rightBoundaryType)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.boundaryType!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftValidForTierId;
            leftValidForTierId = this.getValidForTierId();
            ElementTagType rightValidForTierId;
            rightValidForTierId = that.getValidForTierId();
            if (this.validForTierId!= null) {
                if (that.validForTierId!= null) {
                    if (!leftValidForTierId.equals(rightValidForTierId)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.validForTierId!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftSwitchToTierIdWhenLower;
            leftSwitchToTierIdWhenLower = this.getSwitchToTierIdWhenLower();
            ElementTagType rightSwitchToTierIdWhenLower;
            rightSwitchToTierIdWhenLower = that.getSwitchToTierIdWhenLower();
            if (this.switchToTierIdWhenLower!= null) {
                if (that.switchToTierIdWhenLower!= null) {
                    if (!leftSwitchToTierIdWhenLower.equals(rightSwitchToTierIdWhenLower)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.switchToTierIdWhenLower!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftSwitchToTierIdWhenHigher;
            leftSwitchToTierIdWhenHigher = this.getSwitchToTierIdWhenHigher();
            ElementTagType rightSwitchToTierIdWhenHigher;
            rightSwitchToTierIdWhenHigher = that.getSwitchToTierIdWhenHigher();
            if (this.switchToTierIdWhenHigher!= null) {
                if (that.switchToTierIdWhenHigher!= null) {
                    if (!leftSwitchToTierIdWhenHigher.equals(rightSwitchToTierIdWhenHigher)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.switchToTierIdWhenHigher!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftBoundaryUnit;
            leftBoundaryUnit = this.getBoundaryUnit();
            ElementTagType rightBoundaryUnit;
            rightBoundaryUnit = that.getBoundaryUnit();
            if (this.boundaryUnit!= null) {
                if (that.boundaryUnit!= null) {
                    if (!leftBoundaryUnit.equals(rightBoundaryUnit)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.boundaryUnit!= null) {
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
            ElementTagType theBoundaryId;
            theBoundaryId = this.getBoundaryId();
            if (this.boundaryId!= null) {
                currentHashCode += theBoundaryId.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theBoundaryType;
            theBoundaryType = this.getBoundaryType();
            if (this.boundaryType!= null) {
                currentHashCode += theBoundaryType.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theValidForTierId;
            theValidForTierId = this.getValidForTierId();
            if (this.validForTierId!= null) {
                currentHashCode += theValidForTierId.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theSwitchToTierIdWhenLower;
            theSwitchToTierIdWhenLower = this.getSwitchToTierIdWhenLower();
            if (this.switchToTierIdWhenLower!= null) {
                currentHashCode += theSwitchToTierIdWhenLower.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theSwitchToTierIdWhenHigher;
            theSwitchToTierIdWhenHigher = this.getSwitchToTierIdWhenHigher();
            if (this.switchToTierIdWhenHigher!= null) {
                currentHashCode += theSwitchToTierIdWhenHigher.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theBoundaryUnit;
            theBoundaryUnit = this.getBoundaryUnit();
            if (this.boundaryUnit!= null) {
                currentHashCode += theBoundaryUnit.hashCode();
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
            ElementTagType theBoundaryId;
            theBoundaryId = this.getBoundaryId();
            strategy.appendField(locator, this, "boundaryId", buffer, theBoundaryId, (this.boundaryId!= null));
        }
        {
            ElementTagType theBoundaryType;
            theBoundaryType = this.getBoundaryType();
            strategy.appendField(locator, this, "boundaryType", buffer, theBoundaryType, (this.boundaryType!= null));
        }
        {
            ElementTagType theValidForTierId;
            theValidForTierId = this.getValidForTierId();
            strategy.appendField(locator, this, "validForTierId", buffer, theValidForTierId, (this.validForTierId!= null));
        }
        {
            ElementTagType theSwitchToTierIdWhenLower;
            theSwitchToTierIdWhenLower = this.getSwitchToTierIdWhenLower();
            strategy.appendField(locator, this, "switchToTierIdWhenLower", buffer, theSwitchToTierIdWhenLower, (this.switchToTierIdWhenLower!= null));
        }
        {
            ElementTagType theSwitchToTierIdWhenHigher;
            theSwitchToTierIdWhenHigher = this.getSwitchToTierIdWhenHigher();
            strategy.appendField(locator, this, "switchToTierIdWhenHigher", buffer, theSwitchToTierIdWhenHigher, (this.switchToTierIdWhenHigher!= null));
        }
        {
            ElementTagType theBoundaryUnit;
            theBoundaryUnit = this.getBoundaryUnit();
            strategy.appendField(locator, this, "boundaryUnit", buffer, theBoundaryUnit, (this.boundaryUnit!= null));
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
