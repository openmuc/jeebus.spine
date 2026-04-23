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
 * <p>Java class for TimeSeriesDescriptionDataElementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeSeriesDescriptionDataElementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="timeSeriesId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="timeSeriesType" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="timeSeriesWriteable" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="updateRequired" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="measurementId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="currency" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="unit" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="label" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="scopeType" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeSeriesDescriptionDataElementsType", propOrder = {
    "timeSeriesId",
    "timeSeriesType",
    "timeSeriesWriteable",
    "updateRequired",
    "measurementId",
    "currency",
    "unit",
    "label",
    "description",
    "scopeType"
})
public class TimeSeriesDescriptionDataElementsType implements Cloneable, CopyTo, ToString
{

    protected ElementTagType timeSeriesId;
    protected ElementTagType timeSeriesType;
    protected ElementTagType timeSeriesWriteable;
    protected ElementTagType updateRequired;
    protected ElementTagType measurementId;
    protected ElementTagType currency;
    protected ElementTagType unit;
    protected ElementTagType label;
    protected ElementTagType description;
    protected ElementTagType scopeType;

    /**
     * Default no-arg constructor
     * 
     */
    public TimeSeriesDescriptionDataElementsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public TimeSeriesDescriptionDataElementsType(final ElementTagType timeSeriesId, final ElementTagType timeSeriesType, final ElementTagType timeSeriesWriteable, final ElementTagType updateRequired, final ElementTagType measurementId, final ElementTagType currency, final ElementTagType unit, final ElementTagType label, final ElementTagType description, final ElementTagType scopeType) {
        this.timeSeriesId = timeSeriesId;
        this.timeSeriesType = timeSeriesType;
        this.timeSeriesWriteable = timeSeriesWriteable;
        this.updateRequired = updateRequired;
        this.measurementId = measurementId;
        this.currency = currency;
        this.unit = unit;
        this.label = label;
        this.description = description;
        this.scopeType = scopeType;
    }

    /**
     * Gets the value of the timeSeriesId property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getTimeSeriesId() {
        return timeSeriesId;
    }

    /**
     * Sets the value of the timeSeriesId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setTimeSeriesId(ElementTagType value) {
        this.timeSeriesId = value;
    }

    /**
     * Gets the value of the timeSeriesType property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getTimeSeriesType() {
        return timeSeriesType;
    }

    /**
     * Sets the value of the timeSeriesType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setTimeSeriesType(ElementTagType value) {
        this.timeSeriesType = value;
    }

    /**
     * Gets the value of the timeSeriesWriteable property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getTimeSeriesWriteable() {
        return timeSeriesWriteable;
    }

    /**
     * Sets the value of the timeSeriesWriteable property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setTimeSeriesWriteable(ElementTagType value) {
        this.timeSeriesWriteable = value;
    }

    /**
     * Gets the value of the updateRequired property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getUpdateRequired() {
        return updateRequired;
    }

    /**
     * Sets the value of the updateRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setUpdateRequired(ElementTagType value) {
        this.updateRequired = value;
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
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setCurrency(ElementTagType value) {
        this.currency = value;
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
     * Sets the value of the timeSeriesId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public TimeSeriesDescriptionDataElementsType withTimeSeriesId(ElementTagType value) {
        setTimeSeriesId(value);
        return this;
    }

    /**
     * Sets the value of the timeSeriesType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public TimeSeriesDescriptionDataElementsType withTimeSeriesType(ElementTagType value) {
        setTimeSeriesType(value);
        return this;
    }

    /**
     * Sets the value of the timeSeriesWriteable property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public TimeSeriesDescriptionDataElementsType withTimeSeriesWriteable(ElementTagType value) {
        setTimeSeriesWriteable(value);
        return this;
    }

    /**
     * Sets the value of the updateRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public TimeSeriesDescriptionDataElementsType withUpdateRequired(ElementTagType value) {
        setUpdateRequired(value);
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
    public TimeSeriesDescriptionDataElementsType withMeasurementId(ElementTagType value) {
        setMeasurementId(value);
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
    public TimeSeriesDescriptionDataElementsType withCurrency(ElementTagType value) {
        setCurrency(value);
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
    public TimeSeriesDescriptionDataElementsType withUnit(ElementTagType value) {
        setUnit(value);
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
    public TimeSeriesDescriptionDataElementsType withLabel(ElementTagType value) {
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
    public TimeSeriesDescriptionDataElementsType withDescription(ElementTagType value) {
        setDescription(value);
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
    public TimeSeriesDescriptionDataElementsType withScopeType(ElementTagType value) {
        setScopeType(value);
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
        if (draftCopy instanceof TimeSeriesDescriptionDataElementsType) {
            final TimeSeriesDescriptionDataElementsType copy = ((TimeSeriesDescriptionDataElementsType) draftCopy);
            {
                Boolean timeSeriesIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.timeSeriesId!= null));
                if (timeSeriesIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceTimeSeriesId;
                    sourceTimeSeriesId = this.getTimeSeriesId();
                    ElementTagType copyTimeSeriesId = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "timeSeriesId", sourceTimeSeriesId), sourceTimeSeriesId, (this.timeSeriesId!= null)));
                    copy.setTimeSeriesId(copyTimeSeriesId);
                } else {
                    if (timeSeriesIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.timeSeriesId = null;
                    }
                }
            }
            {
                Boolean timeSeriesTypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.timeSeriesType!= null));
                if (timeSeriesTypeShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceTimeSeriesType;
                    sourceTimeSeriesType = this.getTimeSeriesType();
                    ElementTagType copyTimeSeriesType = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "timeSeriesType", sourceTimeSeriesType), sourceTimeSeriesType, (this.timeSeriesType!= null)));
                    copy.setTimeSeriesType(copyTimeSeriesType);
                } else {
                    if (timeSeriesTypeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.timeSeriesType = null;
                    }
                }
            }
            {
                Boolean timeSeriesWriteableShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.timeSeriesWriteable!= null));
                if (timeSeriesWriteableShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceTimeSeriesWriteable;
                    sourceTimeSeriesWriteable = this.getTimeSeriesWriteable();
                    ElementTagType copyTimeSeriesWriteable = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "timeSeriesWriteable", sourceTimeSeriesWriteable), sourceTimeSeriesWriteable, (this.timeSeriesWriteable!= null)));
                    copy.setTimeSeriesWriteable(copyTimeSeriesWriteable);
                } else {
                    if (timeSeriesWriteableShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.timeSeriesWriteable = null;
                    }
                }
            }
            {
                Boolean updateRequiredShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.updateRequired!= null));
                if (updateRequiredShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceUpdateRequired;
                    sourceUpdateRequired = this.getUpdateRequired();
                    ElementTagType copyUpdateRequired = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "updateRequired", sourceUpdateRequired), sourceUpdateRequired, (this.updateRequired!= null)));
                    copy.setUpdateRequired(copyUpdateRequired);
                } else {
                    if (updateRequiredShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.updateRequired = null;
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
                Boolean currencyShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.currency!= null));
                if (currencyShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceCurrency;
                    sourceCurrency = this.getCurrency();
                    ElementTagType copyCurrency = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "currency", sourceCurrency), sourceCurrency, (this.currency!= null)));
                    copy.setCurrency(copyCurrency);
                } else {
                    if (currencyShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.currency = null;
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
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new TimeSeriesDescriptionDataElementsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TimeSeriesDescriptionDataElementsType that = ((TimeSeriesDescriptionDataElementsType) object);
        {
            ElementTagType leftTimeSeriesId;
            leftTimeSeriesId = this.getTimeSeriesId();
            ElementTagType rightTimeSeriesId;
            rightTimeSeriesId = that.getTimeSeriesId();
            if (this.timeSeriesId!= null) {
                if (that.timeSeriesId!= null) {
                    if (!leftTimeSeriesId.equals(rightTimeSeriesId)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.timeSeriesId!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftTimeSeriesType;
            leftTimeSeriesType = this.getTimeSeriesType();
            ElementTagType rightTimeSeriesType;
            rightTimeSeriesType = that.getTimeSeriesType();
            if (this.timeSeriesType!= null) {
                if (that.timeSeriesType!= null) {
                    if (!leftTimeSeriesType.equals(rightTimeSeriesType)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.timeSeriesType!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftTimeSeriesWriteable;
            leftTimeSeriesWriteable = this.getTimeSeriesWriteable();
            ElementTagType rightTimeSeriesWriteable;
            rightTimeSeriesWriteable = that.getTimeSeriesWriteable();
            if (this.timeSeriesWriteable!= null) {
                if (that.timeSeriesWriteable!= null) {
                    if (!leftTimeSeriesWriteable.equals(rightTimeSeriesWriteable)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.timeSeriesWriteable!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftUpdateRequired;
            leftUpdateRequired = this.getUpdateRequired();
            ElementTagType rightUpdateRequired;
            rightUpdateRequired = that.getUpdateRequired();
            if (this.updateRequired!= null) {
                if (that.updateRequired!= null) {
                    if (!leftUpdateRequired.equals(rightUpdateRequired)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.updateRequired!= null) {
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
            ElementTagType leftCurrency;
            leftCurrency = this.getCurrency();
            ElementTagType rightCurrency;
            rightCurrency = that.getCurrency();
            if (this.currency!= null) {
                if (that.currency!= null) {
                    if (!leftCurrency.equals(rightCurrency)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.currency!= null) {
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
        return true;
    }

    @Override
    public int hashCode() {
        int currentHashCode = 1;
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theTimeSeriesId;
            theTimeSeriesId = this.getTimeSeriesId();
            if (this.timeSeriesId!= null) {
                currentHashCode += theTimeSeriesId.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theTimeSeriesType;
            theTimeSeriesType = this.getTimeSeriesType();
            if (this.timeSeriesType!= null) {
                currentHashCode += theTimeSeriesType.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theTimeSeriesWriteable;
            theTimeSeriesWriteable = this.getTimeSeriesWriteable();
            if (this.timeSeriesWriteable!= null) {
                currentHashCode += theTimeSeriesWriteable.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theUpdateRequired;
            theUpdateRequired = this.getUpdateRequired();
            if (this.updateRequired!= null) {
                currentHashCode += theUpdateRequired.hashCode();
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
            ElementTagType theCurrency;
            theCurrency = this.getCurrency();
            if (this.currency!= null) {
                currentHashCode += theCurrency.hashCode();
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
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theScopeType;
            theScopeType = this.getScopeType();
            if (this.scopeType!= null) {
                currentHashCode += theScopeType.hashCode();
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
            ElementTagType theTimeSeriesId;
            theTimeSeriesId = this.getTimeSeriesId();
            strategy.appendField(locator, this, "timeSeriesId", buffer, theTimeSeriesId, (this.timeSeriesId!= null));
        }
        {
            ElementTagType theTimeSeriesType;
            theTimeSeriesType = this.getTimeSeriesType();
            strategy.appendField(locator, this, "timeSeriesType", buffer, theTimeSeriesType, (this.timeSeriesType!= null));
        }
        {
            ElementTagType theTimeSeriesWriteable;
            theTimeSeriesWriteable = this.getTimeSeriesWriteable();
            strategy.appendField(locator, this, "timeSeriesWriteable", buffer, theTimeSeriesWriteable, (this.timeSeriesWriteable!= null));
        }
        {
            ElementTagType theUpdateRequired;
            theUpdateRequired = this.getUpdateRequired();
            strategy.appendField(locator, this, "updateRequired", buffer, theUpdateRequired, (this.updateRequired!= null));
        }
        {
            ElementTagType theMeasurementId;
            theMeasurementId = this.getMeasurementId();
            strategy.appendField(locator, this, "measurementId", buffer, theMeasurementId, (this.measurementId!= null));
        }
        {
            ElementTagType theCurrency;
            theCurrency = this.getCurrency();
            strategy.appendField(locator, this, "currency", buffer, theCurrency, (this.currency!= null));
        }
        {
            ElementTagType theUnit;
            theUnit = this.getUnit();
            strategy.appendField(locator, this, "unit", buffer, theUnit, (this.unit!= null));
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
        {
            ElementTagType theScopeType;
            theScopeType = this.getScopeType();
            strategy.appendField(locator, this, "scopeType", buffer, theScopeType, (this.scopeType!= null));
        }
        return buffer;
    }

}
