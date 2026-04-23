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
 * <p>Java class for LoadControlLimitDescriptionDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoadControlLimitDescriptionDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="limitId" type="{http://docs.eebus.org/spine/xsd/v1}LoadControlLimitIdType" minOccurs="0"/&gt;
 *         &lt;element name="limitType" type="{http://docs.eebus.org/spine/xsd/v1}LoadControlLimitTypeType" minOccurs="0"/&gt;
 *         &lt;element name="limitCategory" type="{http://docs.eebus.org/spine/xsd/v1}LoadControlCategoryType" minOccurs="0"/&gt;
 *         &lt;element name="limitDirection" type="{http://docs.eebus.org/spine/xsd/v1}EnergyDirectionType" minOccurs="0"/&gt;
 *         &lt;element name="measurementId" type="{http://docs.eebus.org/spine/xsd/v1}MeasurementIdType" minOccurs="0"/&gt;
 *         &lt;element name="unit" type="{http://docs.eebus.org/spine/xsd/v1}UnitOfMeasurementType" minOccurs="0"/&gt;
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
@XmlType(name = "LoadControlLimitDescriptionDataType", propOrder = {
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
public class LoadControlLimitDescriptionDataType implements Cloneable, CopyTo, ToString
{

    @XmlSchemaType(name = "unsignedInt")
    protected Long limitId;
    protected String limitType;
    protected String limitCategory;
    protected String limitDirection;
    @XmlSchemaType(name = "unsignedInt")
    protected Long measurementId;
    protected String unit;
    protected String scopeType;
    protected String label;
    protected String description;

    /**
     * Default no-arg constructor
     * 
     */
    public LoadControlLimitDescriptionDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public LoadControlLimitDescriptionDataType(final Long limitId, final String limitType, final String limitCategory, final String limitDirection, final Long measurementId, final String unit, final String scopeType, final String label, final String description) {
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
     *     {@link Long }
     *     
     */
    public Long getLimitId() {
        return limitId;
    }

    /**
     * Sets the value of the limitId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLimitId(Long value) {
        this.limitId = value;
    }

    /**
     * Gets the value of the limitType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLimitType() {
        return limitType;
    }

    /**
     * Sets the value of the limitType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLimitType(String value) {
        this.limitType = value;
    }

    /**
     * Gets the value of the limitCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLimitCategory() {
        return limitCategory;
    }

    /**
     * Sets the value of the limitCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLimitCategory(String value) {
        this.limitCategory = value;
    }

    /**
     * Gets the value of the limitDirection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLimitDirection() {
        return limitDirection;
    }

    /**
     * Sets the value of the limitDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLimitDirection(String value) {
        this.limitDirection = value;
    }

    /**
     * Gets the value of the measurementId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMeasurementId() {
        return measurementId;
    }

    /**
     * Sets the value of the measurementId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMeasurementId(Long value) {
        this.measurementId = value;
    }

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnit(String value) {
        this.unit = value;
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
     * Sets the value of the limitId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     * @return
     *     The class instance
     */
    public LoadControlLimitDescriptionDataType withLimitId(Long value) {
        setLimitId(value);
        return this;
    }

    /**
     * Sets the value of the limitType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public LoadControlLimitDescriptionDataType withLimitType(String value) {
        setLimitType(value);
        return this;
    }

    /**
     * Sets the value of the limitCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public LoadControlLimitDescriptionDataType withLimitCategory(String value) {
        setLimitCategory(value);
        return this;
    }

    /**
     * Sets the value of the limitDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public LoadControlLimitDescriptionDataType withLimitDirection(String value) {
        setLimitDirection(value);
        return this;
    }

    /**
     * Sets the value of the measurementId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     * @return
     *     The class instance
     */
    public LoadControlLimitDescriptionDataType withMeasurementId(Long value) {
        setMeasurementId(value);
        return this;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public LoadControlLimitDescriptionDataType withUnit(String value) {
        setUnit(value);
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
    public LoadControlLimitDescriptionDataType withScopeType(String value) {
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
    public LoadControlLimitDescriptionDataType withLabel(String value) {
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
    public LoadControlLimitDescriptionDataType withDescription(String value) {
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
        if (draftCopy instanceof LoadControlLimitDescriptionDataType) {
            final LoadControlLimitDescriptionDataType copy = ((LoadControlLimitDescriptionDataType) draftCopy);
            {
                Boolean limitIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.limitId!= null));
                if (limitIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceLimitId;
                    sourceLimitId = this.getLimitId();
                    Long copyLimitId = ((Long) strategy.copy(LocatorUtils.property(locator, "limitId", sourceLimitId), sourceLimitId, (this.limitId!= null)));
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
                    String sourceLimitType;
                    sourceLimitType = this.getLimitType();
                    String copyLimitType = ((String) strategy.copy(LocatorUtils.property(locator, "limitType", sourceLimitType), sourceLimitType, (this.limitType!= null)));
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
                    String sourceLimitCategory;
                    sourceLimitCategory = this.getLimitCategory();
                    String copyLimitCategory = ((String) strategy.copy(LocatorUtils.property(locator, "limitCategory", sourceLimitCategory), sourceLimitCategory, (this.limitCategory!= null)));
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
                    String sourceLimitDirection;
                    sourceLimitDirection = this.getLimitDirection();
                    String copyLimitDirection = ((String) strategy.copy(LocatorUtils.property(locator, "limitDirection", sourceLimitDirection), sourceLimitDirection, (this.limitDirection!= null)));
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
                    Long sourceMeasurementId;
                    sourceMeasurementId = this.getMeasurementId();
                    Long copyMeasurementId = ((Long) strategy.copy(LocatorUtils.property(locator, "measurementId", sourceMeasurementId), sourceMeasurementId, (this.measurementId!= null)));
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
                    String sourceUnit;
                    sourceUnit = this.getUnit();
                    String copyUnit = ((String) strategy.copy(LocatorUtils.property(locator, "unit", sourceUnit), sourceUnit, (this.unit!= null)));
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
        return new LoadControlLimitDescriptionDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final LoadControlLimitDescriptionDataType that = ((LoadControlLimitDescriptionDataType) object);
        {
            Long leftLimitId;
            leftLimitId = this.getLimitId();
            Long rightLimitId;
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
            String leftLimitType;
            leftLimitType = this.getLimitType();
            String rightLimitType;
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
            String leftLimitCategory;
            leftLimitCategory = this.getLimitCategory();
            String rightLimitCategory;
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
            String leftLimitDirection;
            leftLimitDirection = this.getLimitDirection();
            String rightLimitDirection;
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
            Long leftMeasurementId;
            leftMeasurementId = this.getMeasurementId();
            Long rightMeasurementId;
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
            String leftUnit;
            leftUnit = this.getUnit();
            String rightUnit;
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
            Long theLimitId;
            theLimitId = this.getLimitId();
            if (this.limitId!= null) {
                currentHashCode += theLimitId.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String theLimitType;
            theLimitType = this.getLimitType();
            if (this.limitType!= null) {
                currentHashCode += theLimitType.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String theLimitCategory;
            theLimitCategory = this.getLimitCategory();
            if (this.limitCategory!= null) {
                currentHashCode += theLimitCategory.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String theLimitDirection;
            theLimitDirection = this.getLimitDirection();
            if (this.limitDirection!= null) {
                currentHashCode += theLimitDirection.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            Long theMeasurementId;
            theMeasurementId = this.getMeasurementId();
            if (this.measurementId!= null) {
                currentHashCode += theMeasurementId.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String theUnit;
            theUnit = this.getUnit();
            if (this.unit!= null) {
                currentHashCode += theUnit.hashCode();
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
            Long theLimitId;
            theLimitId = this.getLimitId();
            strategy.appendField(locator, this, "limitId", buffer, theLimitId, (this.limitId!= null));
        }
        {
            String theLimitType;
            theLimitType = this.getLimitType();
            strategy.appendField(locator, this, "limitType", buffer, theLimitType, (this.limitType!= null));
        }
        {
            String theLimitCategory;
            theLimitCategory = this.getLimitCategory();
            strategy.appendField(locator, this, "limitCategory", buffer, theLimitCategory, (this.limitCategory!= null));
        }
        {
            String theLimitDirection;
            theLimitDirection = this.getLimitDirection();
            strategy.appendField(locator, this, "limitDirection", buffer, theLimitDirection, (this.limitDirection!= null));
        }
        {
            Long theMeasurementId;
            theMeasurementId = this.getMeasurementId();
            strategy.appendField(locator, this, "measurementId", buffer, theMeasurementId, (this.measurementId!= null));
        }
        {
            String theUnit;
            theUnit = this.getUnit();
            strategy.appendField(locator, this, "unit", buffer, theUnit, (this.unit!= null));
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
