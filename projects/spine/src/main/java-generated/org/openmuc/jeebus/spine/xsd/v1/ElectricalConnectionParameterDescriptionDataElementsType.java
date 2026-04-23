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
 * <p>Java class for ElectricalConnectionParameterDescriptionDataElementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElectricalConnectionParameterDescriptionDataElementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="electricalConnectionId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="parameterId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="measurementId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="voltageType" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="acMeasuredPhases" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="acMeasuredInReferenceTo" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="acMeasurementType" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="acMeasurementVariant" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="acMeasuredHarmonic" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
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
@XmlType(name = "ElectricalConnectionParameterDescriptionDataElementsType", propOrder = {
    "electricalConnectionId",
    "parameterId",
    "measurementId",
    "voltageType",
    "acMeasuredPhases",
    "acMeasuredInReferenceTo",
    "acMeasurementType",
    "acMeasurementVariant",
    "acMeasuredHarmonic",
    "scopeType",
    "label",
    "description"
})
public class ElectricalConnectionParameterDescriptionDataElementsType implements Cloneable, CopyTo, ToString
{

    protected ElementTagType electricalConnectionId;
    protected ElementTagType parameterId;
    protected ElementTagType measurementId;
    protected ElementTagType voltageType;
    protected ElementTagType acMeasuredPhases;
    protected ElementTagType acMeasuredInReferenceTo;
    protected ElementTagType acMeasurementType;
    protected ElementTagType acMeasurementVariant;
    protected ElementTagType acMeasuredHarmonic;
    protected ElementTagType scopeType;
    protected ElementTagType label;
    protected ElementTagType description;

    /**
     * Default no-arg constructor
     * 
     */
    public ElectricalConnectionParameterDescriptionDataElementsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public ElectricalConnectionParameterDescriptionDataElementsType(final ElementTagType electricalConnectionId, final ElementTagType parameterId, final ElementTagType measurementId, final ElementTagType voltageType, final ElementTagType acMeasuredPhases, final ElementTagType acMeasuredInReferenceTo, final ElementTagType acMeasurementType, final ElementTagType acMeasurementVariant, final ElementTagType acMeasuredHarmonic, final ElementTagType scopeType, final ElementTagType label, final ElementTagType description) {
        this.electricalConnectionId = electricalConnectionId;
        this.parameterId = parameterId;
        this.measurementId = measurementId;
        this.voltageType = voltageType;
        this.acMeasuredPhases = acMeasuredPhases;
        this.acMeasuredInReferenceTo = acMeasuredInReferenceTo;
        this.acMeasurementType = acMeasurementType;
        this.acMeasurementVariant = acMeasurementVariant;
        this.acMeasuredHarmonic = acMeasuredHarmonic;
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
     * Gets the value of the parameterId property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getParameterId() {
        return parameterId;
    }

    /**
     * Sets the value of the parameterId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setParameterId(ElementTagType value) {
        this.parameterId = value;
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
     * Gets the value of the voltageType property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getVoltageType() {
        return voltageType;
    }

    /**
     * Sets the value of the voltageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setVoltageType(ElementTagType value) {
        this.voltageType = value;
    }

    /**
     * Gets the value of the acMeasuredPhases property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getAcMeasuredPhases() {
        return acMeasuredPhases;
    }

    /**
     * Sets the value of the acMeasuredPhases property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setAcMeasuredPhases(ElementTagType value) {
        this.acMeasuredPhases = value;
    }

    /**
     * Gets the value of the acMeasuredInReferenceTo property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getAcMeasuredInReferenceTo() {
        return acMeasuredInReferenceTo;
    }

    /**
     * Sets the value of the acMeasuredInReferenceTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setAcMeasuredInReferenceTo(ElementTagType value) {
        this.acMeasuredInReferenceTo = value;
    }

    /**
     * Gets the value of the acMeasurementType property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getAcMeasurementType() {
        return acMeasurementType;
    }

    /**
     * Sets the value of the acMeasurementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setAcMeasurementType(ElementTagType value) {
        this.acMeasurementType = value;
    }

    /**
     * Gets the value of the acMeasurementVariant property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getAcMeasurementVariant() {
        return acMeasurementVariant;
    }

    /**
     * Sets the value of the acMeasurementVariant property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setAcMeasurementVariant(ElementTagType value) {
        this.acMeasurementVariant = value;
    }

    /**
     * Gets the value of the acMeasuredHarmonic property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getAcMeasuredHarmonic() {
        return acMeasuredHarmonic;
    }

    /**
     * Sets the value of the acMeasuredHarmonic property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setAcMeasuredHarmonic(ElementTagType value) {
        this.acMeasuredHarmonic = value;
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
    public ElectricalConnectionParameterDescriptionDataElementsType withElectricalConnectionId(ElementTagType value) {
        setElectricalConnectionId(value);
        return this;
    }

    /**
     * Sets the value of the parameterId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public ElectricalConnectionParameterDescriptionDataElementsType withParameterId(ElementTagType value) {
        setParameterId(value);
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
    public ElectricalConnectionParameterDescriptionDataElementsType withMeasurementId(ElementTagType value) {
        setMeasurementId(value);
        return this;
    }

    /**
     * Sets the value of the voltageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public ElectricalConnectionParameterDescriptionDataElementsType withVoltageType(ElementTagType value) {
        setVoltageType(value);
        return this;
    }

    /**
     * Sets the value of the acMeasuredPhases property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public ElectricalConnectionParameterDescriptionDataElementsType withAcMeasuredPhases(ElementTagType value) {
        setAcMeasuredPhases(value);
        return this;
    }

    /**
     * Sets the value of the acMeasuredInReferenceTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public ElectricalConnectionParameterDescriptionDataElementsType withAcMeasuredInReferenceTo(ElementTagType value) {
        setAcMeasuredInReferenceTo(value);
        return this;
    }

    /**
     * Sets the value of the acMeasurementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public ElectricalConnectionParameterDescriptionDataElementsType withAcMeasurementType(ElementTagType value) {
        setAcMeasurementType(value);
        return this;
    }

    /**
     * Sets the value of the acMeasurementVariant property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public ElectricalConnectionParameterDescriptionDataElementsType withAcMeasurementVariant(ElementTagType value) {
        setAcMeasurementVariant(value);
        return this;
    }

    /**
     * Sets the value of the acMeasuredHarmonic property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public ElectricalConnectionParameterDescriptionDataElementsType withAcMeasuredHarmonic(ElementTagType value) {
        setAcMeasuredHarmonic(value);
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
    public ElectricalConnectionParameterDescriptionDataElementsType withScopeType(ElementTagType value) {
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
    public ElectricalConnectionParameterDescriptionDataElementsType withLabel(ElementTagType value) {
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
    public ElectricalConnectionParameterDescriptionDataElementsType withDescription(ElementTagType value) {
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
        if (draftCopy instanceof ElectricalConnectionParameterDescriptionDataElementsType) {
            final ElectricalConnectionParameterDescriptionDataElementsType copy = ((ElectricalConnectionParameterDescriptionDataElementsType) draftCopy);
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
                Boolean parameterIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.parameterId!= null));
                if (parameterIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceParameterId;
                    sourceParameterId = this.getParameterId();
                    ElementTagType copyParameterId = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "parameterId", sourceParameterId), sourceParameterId, (this.parameterId!= null)));
                    copy.setParameterId(copyParameterId);
                } else {
                    if (parameterIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.parameterId = null;
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
                Boolean voltageTypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.voltageType!= null));
                if (voltageTypeShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceVoltageType;
                    sourceVoltageType = this.getVoltageType();
                    ElementTagType copyVoltageType = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "voltageType", sourceVoltageType), sourceVoltageType, (this.voltageType!= null)));
                    copy.setVoltageType(copyVoltageType);
                } else {
                    if (voltageTypeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.voltageType = null;
                    }
                }
            }
            {
                Boolean acMeasuredPhasesShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.acMeasuredPhases!= null));
                if (acMeasuredPhasesShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceAcMeasuredPhases;
                    sourceAcMeasuredPhases = this.getAcMeasuredPhases();
                    ElementTagType copyAcMeasuredPhases = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "acMeasuredPhases", sourceAcMeasuredPhases), sourceAcMeasuredPhases, (this.acMeasuredPhases!= null)));
                    copy.setAcMeasuredPhases(copyAcMeasuredPhases);
                } else {
                    if (acMeasuredPhasesShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.acMeasuredPhases = null;
                    }
                }
            }
            {
                Boolean acMeasuredInReferenceToShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.acMeasuredInReferenceTo!= null));
                if (acMeasuredInReferenceToShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceAcMeasuredInReferenceTo;
                    sourceAcMeasuredInReferenceTo = this.getAcMeasuredInReferenceTo();
                    ElementTagType copyAcMeasuredInReferenceTo = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "acMeasuredInReferenceTo", sourceAcMeasuredInReferenceTo), sourceAcMeasuredInReferenceTo, (this.acMeasuredInReferenceTo!= null)));
                    copy.setAcMeasuredInReferenceTo(copyAcMeasuredInReferenceTo);
                } else {
                    if (acMeasuredInReferenceToShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.acMeasuredInReferenceTo = null;
                    }
                }
            }
            {
                Boolean acMeasurementTypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.acMeasurementType!= null));
                if (acMeasurementTypeShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceAcMeasurementType;
                    sourceAcMeasurementType = this.getAcMeasurementType();
                    ElementTagType copyAcMeasurementType = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "acMeasurementType", sourceAcMeasurementType), sourceAcMeasurementType, (this.acMeasurementType!= null)));
                    copy.setAcMeasurementType(copyAcMeasurementType);
                } else {
                    if (acMeasurementTypeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.acMeasurementType = null;
                    }
                }
            }
            {
                Boolean acMeasurementVariantShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.acMeasurementVariant!= null));
                if (acMeasurementVariantShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceAcMeasurementVariant;
                    sourceAcMeasurementVariant = this.getAcMeasurementVariant();
                    ElementTagType copyAcMeasurementVariant = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "acMeasurementVariant", sourceAcMeasurementVariant), sourceAcMeasurementVariant, (this.acMeasurementVariant!= null)));
                    copy.setAcMeasurementVariant(copyAcMeasurementVariant);
                } else {
                    if (acMeasurementVariantShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.acMeasurementVariant = null;
                    }
                }
            }
            {
                Boolean acMeasuredHarmonicShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.acMeasuredHarmonic!= null));
                if (acMeasuredHarmonicShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceAcMeasuredHarmonic;
                    sourceAcMeasuredHarmonic = this.getAcMeasuredHarmonic();
                    ElementTagType copyAcMeasuredHarmonic = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "acMeasuredHarmonic", sourceAcMeasuredHarmonic), sourceAcMeasuredHarmonic, (this.acMeasuredHarmonic!= null)));
                    copy.setAcMeasuredHarmonic(copyAcMeasuredHarmonic);
                } else {
                    if (acMeasuredHarmonicShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.acMeasuredHarmonic = null;
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
        return new ElectricalConnectionParameterDescriptionDataElementsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ElectricalConnectionParameterDescriptionDataElementsType that = ((ElectricalConnectionParameterDescriptionDataElementsType) object);
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
            ElementTagType leftParameterId;
            leftParameterId = this.getParameterId();
            ElementTagType rightParameterId;
            rightParameterId = that.getParameterId();
            if (this.parameterId!= null) {
                if (that.parameterId!= null) {
                    if (!leftParameterId.equals(rightParameterId)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.parameterId!= null) {
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
            ElementTagType leftVoltageType;
            leftVoltageType = this.getVoltageType();
            ElementTagType rightVoltageType;
            rightVoltageType = that.getVoltageType();
            if (this.voltageType!= null) {
                if (that.voltageType!= null) {
                    if (!leftVoltageType.equals(rightVoltageType)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.voltageType!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftAcMeasuredPhases;
            leftAcMeasuredPhases = this.getAcMeasuredPhases();
            ElementTagType rightAcMeasuredPhases;
            rightAcMeasuredPhases = that.getAcMeasuredPhases();
            if (this.acMeasuredPhases!= null) {
                if (that.acMeasuredPhases!= null) {
                    if (!leftAcMeasuredPhases.equals(rightAcMeasuredPhases)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.acMeasuredPhases!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftAcMeasuredInReferenceTo;
            leftAcMeasuredInReferenceTo = this.getAcMeasuredInReferenceTo();
            ElementTagType rightAcMeasuredInReferenceTo;
            rightAcMeasuredInReferenceTo = that.getAcMeasuredInReferenceTo();
            if (this.acMeasuredInReferenceTo!= null) {
                if (that.acMeasuredInReferenceTo!= null) {
                    if (!leftAcMeasuredInReferenceTo.equals(rightAcMeasuredInReferenceTo)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.acMeasuredInReferenceTo!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftAcMeasurementType;
            leftAcMeasurementType = this.getAcMeasurementType();
            ElementTagType rightAcMeasurementType;
            rightAcMeasurementType = that.getAcMeasurementType();
            if (this.acMeasurementType!= null) {
                if (that.acMeasurementType!= null) {
                    if (!leftAcMeasurementType.equals(rightAcMeasurementType)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.acMeasurementType!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftAcMeasurementVariant;
            leftAcMeasurementVariant = this.getAcMeasurementVariant();
            ElementTagType rightAcMeasurementVariant;
            rightAcMeasurementVariant = that.getAcMeasurementVariant();
            if (this.acMeasurementVariant!= null) {
                if (that.acMeasurementVariant!= null) {
                    if (!leftAcMeasurementVariant.equals(rightAcMeasurementVariant)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.acMeasurementVariant!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftAcMeasuredHarmonic;
            leftAcMeasuredHarmonic = this.getAcMeasuredHarmonic();
            ElementTagType rightAcMeasuredHarmonic;
            rightAcMeasuredHarmonic = that.getAcMeasuredHarmonic();
            if (this.acMeasuredHarmonic!= null) {
                if (that.acMeasuredHarmonic!= null) {
                    if (!leftAcMeasuredHarmonic.equals(rightAcMeasuredHarmonic)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.acMeasuredHarmonic!= null) {
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
            ElementTagType theParameterId;
            theParameterId = this.getParameterId();
            if (this.parameterId!= null) {
                currentHashCode += theParameterId.hashCode();
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
            ElementTagType theVoltageType;
            theVoltageType = this.getVoltageType();
            if (this.voltageType!= null) {
                currentHashCode += theVoltageType.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theAcMeasuredPhases;
            theAcMeasuredPhases = this.getAcMeasuredPhases();
            if (this.acMeasuredPhases!= null) {
                currentHashCode += theAcMeasuredPhases.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theAcMeasuredInReferenceTo;
            theAcMeasuredInReferenceTo = this.getAcMeasuredInReferenceTo();
            if (this.acMeasuredInReferenceTo!= null) {
                currentHashCode += theAcMeasuredInReferenceTo.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theAcMeasurementType;
            theAcMeasurementType = this.getAcMeasurementType();
            if (this.acMeasurementType!= null) {
                currentHashCode += theAcMeasurementType.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theAcMeasurementVariant;
            theAcMeasurementVariant = this.getAcMeasurementVariant();
            if (this.acMeasurementVariant!= null) {
                currentHashCode += theAcMeasurementVariant.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theAcMeasuredHarmonic;
            theAcMeasuredHarmonic = this.getAcMeasuredHarmonic();
            if (this.acMeasuredHarmonic!= null) {
                currentHashCode += theAcMeasuredHarmonic.hashCode();
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
            ElementTagType theParameterId;
            theParameterId = this.getParameterId();
            strategy.appendField(locator, this, "parameterId", buffer, theParameterId, (this.parameterId!= null));
        }
        {
            ElementTagType theMeasurementId;
            theMeasurementId = this.getMeasurementId();
            strategy.appendField(locator, this, "measurementId", buffer, theMeasurementId, (this.measurementId!= null));
        }
        {
            ElementTagType theVoltageType;
            theVoltageType = this.getVoltageType();
            strategy.appendField(locator, this, "voltageType", buffer, theVoltageType, (this.voltageType!= null));
        }
        {
            ElementTagType theAcMeasuredPhases;
            theAcMeasuredPhases = this.getAcMeasuredPhases();
            strategy.appendField(locator, this, "acMeasuredPhases", buffer, theAcMeasuredPhases, (this.acMeasuredPhases!= null));
        }
        {
            ElementTagType theAcMeasuredInReferenceTo;
            theAcMeasuredInReferenceTo = this.getAcMeasuredInReferenceTo();
            strategy.appendField(locator, this, "acMeasuredInReferenceTo", buffer, theAcMeasuredInReferenceTo, (this.acMeasuredInReferenceTo!= null));
        }
        {
            ElementTagType theAcMeasurementType;
            theAcMeasurementType = this.getAcMeasurementType();
            strategy.appendField(locator, this, "acMeasurementType", buffer, theAcMeasurementType, (this.acMeasurementType!= null));
        }
        {
            ElementTagType theAcMeasurementVariant;
            theAcMeasurementVariant = this.getAcMeasurementVariant();
            strategy.appendField(locator, this, "acMeasurementVariant", buffer, theAcMeasurementVariant, (this.acMeasurementVariant!= null));
        }
        {
            ElementTagType theAcMeasuredHarmonic;
            theAcMeasuredHarmonic = this.getAcMeasuredHarmonic();
            strategy.appendField(locator, this, "acMeasuredHarmonic", buffer, theAcMeasuredHarmonic, (this.acMeasuredHarmonic!= null));
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
