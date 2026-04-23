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
 * <p>Java class for LoadControlLimitDescriptionDataElementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoadControlLimitDescriptionDataElementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="limitId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="limitType" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="limitCategory" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="limitDirection" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="measurementId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="unit" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
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
@XmlType(name = "LoadControlLimitDescriptionDataElementsType", propOrder = {
    "limitId",
    "limitType",
    "limitCategory",
    "limitDirection",
    "measurementId",
    "unit",
    "scopeType",
    "label",
    "description"
})
public class LoadControlLimitDescriptionDataElementsType implements Cloneable, CopyTo, ToString
{

    protected ElementTagType limitId;
    protected ElementTagType limitType;
    protected ElementTagType limitCategory;
    protected ElementTagType limitDirection;
    protected ElementTagType measurementId;
    protected ElementTagType unit;
    protected ElementTagType scopeType;
    protected ElementTagType label;
    protected ElementTagType description;

    /**
     * Default no-arg constructor
     * 
     */
    public LoadControlLimitDescriptionDataElementsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public LoadControlLimitDescriptionDataElementsType(final ElementTagType limitId, final ElementTagType limitType, final ElementTagType limitCategory, final ElementTagType limitDirection, final ElementTagType measurementId, final ElementTagType unit, final ElementTagType scopeType, final ElementTagType label, final ElementTagType description) {
        this.limitId = limitId;
        this.limitType = limitType;
        this.limitCategory = limitCategory;
        this.limitDirection = limitDirection;
        this.measurementId = measurementId;
        this.unit = unit;
        this.scopeType = scopeType;
        this.label = label;
        this.description = description;
    }

    /**
     * Gets the value of the limitId property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getLimitId() {
        return limitId;
    }

    /**
     * Sets the value of the limitId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setLimitId(ElementTagType value) {
        this.limitId = value;
    }

    /**
     * Gets the value of the limitType property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getLimitType() {
        return limitType;
    }

    /**
     * Sets the value of the limitType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setLimitType(ElementTagType value) {
        this.limitType = value;
    }

    /**
     * Gets the value of the limitCategory property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getLimitCategory() {
        return limitCategory;
    }

    /**
     * Sets the value of the limitCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setLimitCategory(ElementTagType value) {
        this.limitCategory = value;
    }

    /**
     * Gets the value of the limitDirection property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getLimitDirection() {
        return limitDirection;
    }

    /**
     * Sets the value of the limitDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setLimitDirection(ElementTagType value) {
        this.limitDirection = value;
    }

    /**
     * Gets the value of the measurementId property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getMeasurementId() {
        return measurementId;
    }

    /**
     * Sets the value of the measurementId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setMeasurementId(ElementTagType value) {
        this.measurementId = value;
    }

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setUnit(ElementTagType value) {
        this.unit = value;
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
     * Sets the value of the limitId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public LoadControlLimitDescriptionDataElementsType withLimitId(ElementTagType value) {
        setLimitId(value);
        return this;
    }

    /**
     * Sets the value of the limitType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public LoadControlLimitDescriptionDataElementsType withLimitType(ElementTagType value) {
        setLimitType(value);
        return this;
    }

    /**
     * Sets the value of the limitCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public LoadControlLimitDescriptionDataElementsType withLimitCategory(ElementTagType value) {
        setLimitCategory(value);
        return this;
    }

    /**
     * Sets the value of the limitDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public LoadControlLimitDescriptionDataElementsType withLimitDirection(ElementTagType value) {
        setLimitDirection(value);
        return this;
    }

    /**
     * Sets the value of the measurementId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public LoadControlLimitDescriptionDataElementsType withMeasurementId(ElementTagType value) {
        setMeasurementId(value);
        return this;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public LoadControlLimitDescriptionDataElementsType withUnit(ElementTagType value) {
        setUnit(value);
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
    public LoadControlLimitDescriptionDataElementsType withScopeType(ElementTagType value) {
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
    public LoadControlLimitDescriptionDataElementsType withLabel(ElementTagType value) {
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
    public LoadControlLimitDescriptionDataElementsType withDescription(ElementTagType value) {
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
        if (draftCopy instanceof LoadControlLimitDescriptionDataElementsType) {
            final LoadControlLimitDescriptionDataElementsType copy = ((LoadControlLimitDescriptionDataElementsType) draftCopy);
            {
                Boolean limitIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.limitId!= null));
                if (limitIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceLimitId;
                    sourceLimitId = this.getLimitId();
                    ElementTagType copyLimitId = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "limitId", sourceLimitId), sourceLimitId, (this.limitId!= null)));
                    copy.setLimitId(copyLimitId);
                } else {
                    if (limitIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.limitId = null;
                    }
                }
            }
            {
                Boolean limitTypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.limitType!= null));
                if (limitTypeShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceLimitType;
                    sourceLimitType = this.getLimitType();
                    ElementTagType copyLimitType = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "limitType", sourceLimitType), sourceLimitType, (this.limitType!= null)));
                    copy.setLimitType(copyLimitType);
                } else {
                    if (limitTypeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.limitType = null;
                    }
                }
            }
            {
                Boolean limitCategoryShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.limitCategory!= null));
                if (limitCategoryShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceLimitCategory;
                    sourceLimitCategory = this.getLimitCategory();
                    ElementTagType copyLimitCategory = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "limitCategory", sourceLimitCategory), sourceLimitCategory, (this.limitCategory!= null)));
                    copy.setLimitCategory(copyLimitCategory);
                } else {
                    if (limitCategoryShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.limitCategory = null;
                    }
                }
            }
            {
                Boolean limitDirectionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.limitDirection!= null));
                if (limitDirectionShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceLimitDirection;
                    sourceLimitDirection = this.getLimitDirection();
                    ElementTagType copyLimitDirection = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "limitDirection", sourceLimitDirection), sourceLimitDirection, (this.limitDirection!= null)));
                    copy.setLimitDirection(copyLimitDirection);
                } else {
                    if (limitDirectionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.limitDirection = null;
                    }
                }
            }
            {
                Boolean measurementIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.measurementId!= null));
                if (measurementIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceMeasurementId;
                    sourceMeasurementId = this.getMeasurementId();
                    ElementTagType copyMeasurementId = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "measurementId", sourceMeasurementId), sourceMeasurementId, (this.measurementId!= null)));
                    copy.setMeasurementId(copyMeasurementId);
                } else {
                    if (measurementIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.measurementId = null;
                    }
                }
            }
            {
                Boolean unitShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.unit!= null));
                if (unitShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceUnit;
                    sourceUnit = this.getUnit();
                    ElementTagType copyUnit = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "unit", sourceUnit), sourceUnit, (this.unit!= null)));
                    copy.setUnit(copyUnit);
                } else {
                    if (unitShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.unit = null;
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
        return new LoadControlLimitDescriptionDataElementsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final LoadControlLimitDescriptionDataElementsType that = ((LoadControlLimitDescriptionDataElementsType) object);
        {
            ElementTagType leftLimitId;
            leftLimitId = this.getLimitId();
            ElementTagType rightLimitId;
            rightLimitId = that.getLimitId();
            if (this.limitId!= null) {
                if (that.limitId!= null) {
                    if (!leftLimitId.equals(rightLimitId)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.limitId!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftLimitType;
            leftLimitType = this.getLimitType();
            ElementTagType rightLimitType;
            rightLimitType = that.getLimitType();
            if (this.limitType!= null) {
                if (that.limitType!= null) {
                    if (!leftLimitType.equals(rightLimitType)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.limitType!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftLimitCategory;
            leftLimitCategory = this.getLimitCategory();
            ElementTagType rightLimitCategory;
            rightLimitCategory = that.getLimitCategory();
            if (this.limitCategory!= null) {
                if (that.limitCategory!= null) {
                    if (!leftLimitCategory.equals(rightLimitCategory)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.limitCategory!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftLimitDirection;
            leftLimitDirection = this.getLimitDirection();
            ElementTagType rightLimitDirection;
            rightLimitDirection = that.getLimitDirection();
            if (this.limitDirection!= null) {
                if (that.limitDirection!= null) {
                    if (!leftLimitDirection.equals(rightLimitDirection)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.limitDirection!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftMeasurementId;
            leftMeasurementId = this.getMeasurementId();
            ElementTagType rightMeasurementId;
            rightMeasurementId = that.getMeasurementId();
            if (this.measurementId!= null) {
                if (that.measurementId!= null) {
                    if (!leftMeasurementId.equals(rightMeasurementId)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.measurementId!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftUnit;
            leftUnit = this.getUnit();
            ElementTagType rightUnit;
            rightUnit = that.getUnit();
            if (this.unit!= null) {
                if (that.unit!= null) {
                    if (!leftUnit.equals(rightUnit)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.unit!= null) {
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
            ElementTagType theLimitId;
            theLimitId = this.getLimitId();
            if (this.limitId!= null) {
                currentHashCode += theLimitId.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theLimitType;
            theLimitType = this.getLimitType();
            if (this.limitType!= null) {
                currentHashCode += theLimitType.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theLimitCategory;
            theLimitCategory = this.getLimitCategory();
            if (this.limitCategory!= null) {
                currentHashCode += theLimitCategory.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theLimitDirection;
            theLimitDirection = this.getLimitDirection();
            if (this.limitDirection!= null) {
                currentHashCode += theLimitDirection.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theMeasurementId;
            theMeasurementId = this.getMeasurementId();
            if (this.measurementId!= null) {
                currentHashCode += theMeasurementId.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theUnit;
            theUnit = this.getUnit();
            if (this.unit!= null) {
                currentHashCode += theUnit.hashCode();
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
            ElementTagType theLimitId;
            theLimitId = this.getLimitId();
            strategy.appendField(locator, this, "limitId", buffer, theLimitId, (this.limitId!= null));
        }
        {
            ElementTagType theLimitType;
            theLimitType = this.getLimitType();
            strategy.appendField(locator, this, "limitType", buffer, theLimitType, (this.limitType!= null));
        }
        {
            ElementTagType theLimitCategory;
            theLimitCategory = this.getLimitCategory();
            strategy.appendField(locator, this, "limitCategory", buffer, theLimitCategory, (this.limitCategory!= null));
        }
        {
            ElementTagType theLimitDirection;
            theLimitDirection = this.getLimitDirection();
            strategy.appendField(locator, this, "limitDirection", buffer, theLimitDirection, (this.limitDirection!= null));
        }
        {
            ElementTagType theMeasurementId;
            theMeasurementId = this.getMeasurementId();
            strategy.appendField(locator, this, "measurementId", buffer, theMeasurementId, (this.measurementId!= null));
        }
        {
            ElementTagType theUnit;
            theUnit = this.getUnit();
            strategy.appendField(locator, this, "unit", buffer, theUnit, (this.unit!= null));
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
