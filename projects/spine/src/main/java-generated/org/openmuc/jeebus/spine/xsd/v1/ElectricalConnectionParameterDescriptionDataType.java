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
 * <p>Java class for ElectricalConnectionParameterDescriptionDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElectricalConnectionParameterDescriptionDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="electricalConnectionId" type="{http://docs.eebus.org/spine/xsd/v1}ElectricalConnectionIdType" minOccurs="0"/&gt;
 *         &lt;element name="parameterId" type="{http://docs.eebus.org/spine/xsd/v1}ElectricalConnectionParameterIdType" minOccurs="0"/&gt;
 *         &lt;element name="measurementId" type="{http://docs.eebus.org/spine/xsd/v1}MeasurementIdType" minOccurs="0"/&gt;
 *         &lt;element name="voltageType" type="{http://docs.eebus.org/spine/xsd/v1}ElectricalConnectionVoltageTypeType" minOccurs="0"/&gt;
 *         &lt;element name="acMeasuredPhases" type="{http://docs.eebus.org/spine/xsd/v1}ElectricalConnectionPhaseNameType" minOccurs="0"/&gt;
 *         &lt;element name="acMeasuredInReferenceTo" type="{http://docs.eebus.org/spine/xsd/v1}ElectricalConnectionPhaseNameType" minOccurs="0"/&gt;
 *         &lt;element name="acMeasurementType" type="{http://docs.eebus.org/spine/xsd/v1}ElectricalConnectionAcMeasurementTypeType" minOccurs="0"/&gt;
 *         &lt;element name="acMeasurementVariant" type="{http://docs.eebus.org/spine/xsd/v1}ElectricalConnectionMeasurandVariantType" minOccurs="0"/&gt;
 *         &lt;element name="acMeasuredHarmonic" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/&gt;
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
@XmlType(name = "ElectricalConnectionParameterDescriptionDataType", propOrder = {
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
public class ElectricalConnectionParameterDescriptionDataType implements Cloneable, CopyTo, ToString
{

    @XmlSchemaType(name = "unsignedInt")
    protected Long electricalConnectionId;
    @XmlSchemaType(name = "unsignedInt")
    protected Long parameterId;
    @XmlSchemaType(name = "unsignedInt")
    protected Long measurementId;
    protected String voltageType;
    protected String acMeasuredPhases;
    protected String acMeasuredInReferenceTo;
    protected String acMeasurementType;
    protected String acMeasurementVariant;
    @XmlSchemaType(name = "unsignedByte")
    protected Short acMeasuredHarmonic;
    protected String scopeType;
    protected String label;
    protected String description;

    /**
     * Default no-arg constructor
     * 
     */
    public ElectricalConnectionParameterDescriptionDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public ElectricalConnectionParameterDescriptionDataType(final Long electricalConnectionId, final Long parameterId, final Long measurementId, final String voltageType, final String acMeasuredPhases, final String acMeasuredInReferenceTo, final String acMeasurementType, final String acMeasurementVariant, final Short acMeasuredHarmonic, final String scopeType, final String label, final String description) {
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
     * Gets the value of the parameterId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getParameterId() {
        return parameterId;
    }

    /**
     * Sets the value of the parameterId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setParameterId(Long value) {
        this.parameterId = value;
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
     * Gets the value of the voltageType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoltageType() {
        return voltageType;
    }

    /**
     * Sets the value of the voltageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoltageType(String value) {
        this.voltageType = value;
    }

    /**
     * Gets the value of the acMeasuredPhases property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcMeasuredPhases() {
        return acMeasuredPhases;
    }

    /**
     * Sets the value of the acMeasuredPhases property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcMeasuredPhases(String value) {
        this.acMeasuredPhases = value;
    }

    /**
     * Gets the value of the acMeasuredInReferenceTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcMeasuredInReferenceTo() {
        return acMeasuredInReferenceTo;
    }

    /**
     * Sets the value of the acMeasuredInReferenceTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcMeasuredInReferenceTo(String value) {
        this.acMeasuredInReferenceTo = value;
    }

    /**
     * Gets the value of the acMeasurementType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcMeasurementType() {
        return acMeasurementType;
    }

    /**
     * Sets the value of the acMeasurementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcMeasurementType(String value) {
        this.acMeasurementType = value;
    }

    /**
     * Gets the value of the acMeasurementVariant property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcMeasurementVariant() {
        return acMeasurementVariant;
    }

    /**
     * Sets the value of the acMeasurementVariant property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcMeasurementVariant(String value) {
        this.acMeasurementVariant = value;
    }

    /**
     * Gets the value of the acMeasuredHarmonic property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getAcMeasuredHarmonic() {
        return acMeasuredHarmonic;
    }

    /**
     * Sets the value of the acMeasuredHarmonic property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setAcMeasuredHarmonic(Short value) {
        this.acMeasuredHarmonic = value;
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
    public ElectricalConnectionParameterDescriptionDataType withElectricalConnectionId(Long value) {
        setElectricalConnectionId(value);
        return this;
    }

    /**
     * Sets the value of the parameterId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     * @return
     *     The class instance
     */
    public ElectricalConnectionParameterDescriptionDataType withParameterId(Long value) {
        setParameterId(value);
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
    public ElectricalConnectionParameterDescriptionDataType withMeasurementId(Long value) {
        setMeasurementId(value);
        return this;
    }

    /**
     * Sets the value of the voltageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public ElectricalConnectionParameterDescriptionDataType withVoltageType(String value) {
        setVoltageType(value);
        return this;
    }

    /**
     * Sets the value of the acMeasuredPhases property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public ElectricalConnectionParameterDescriptionDataType withAcMeasuredPhases(String value) {
        setAcMeasuredPhases(value);
        return this;
    }

    /**
     * Sets the value of the acMeasuredInReferenceTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public ElectricalConnectionParameterDescriptionDataType withAcMeasuredInReferenceTo(String value) {
        setAcMeasuredInReferenceTo(value);
        return this;
    }

    /**
     * Sets the value of the acMeasurementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public ElectricalConnectionParameterDescriptionDataType withAcMeasurementType(String value) {
        setAcMeasurementType(value);
        return this;
    }

    /**
     * Sets the value of the acMeasurementVariant property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public ElectricalConnectionParameterDescriptionDataType withAcMeasurementVariant(String value) {
        setAcMeasurementVariant(value);
        return this;
    }

    /**
     * Sets the value of the acMeasuredHarmonic property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     * @return
     *     The class instance
     */
    public ElectricalConnectionParameterDescriptionDataType withAcMeasuredHarmonic(Short value) {
        setAcMeasuredHarmonic(value);
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
    public ElectricalConnectionParameterDescriptionDataType withScopeType(String value) {
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
    public ElectricalConnectionParameterDescriptionDataType withLabel(String value) {
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
    public ElectricalConnectionParameterDescriptionDataType withDescription(String value) {
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
        if (draftCopy instanceof ElectricalConnectionParameterDescriptionDataType) {
            final ElectricalConnectionParameterDescriptionDataType copy = ((ElectricalConnectionParameterDescriptionDataType) draftCopy);
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
                Boolean parameterIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.parameterId!= null));
                if (parameterIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceParameterId;
                    sourceParameterId = this.getParameterId();
                    Long copyParameterId = ((Long) strategy.copy(LocatorUtils.property(locator, "parameterId", sourceParameterId), sourceParameterId, (this.parameterId!= null)));
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
                Boolean voltageTypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.voltageType!= null));
                if (voltageTypeShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceVoltageType;
                    sourceVoltageType = this.getVoltageType();
                    String copyVoltageType = ((String) strategy.copy(LocatorUtils.property(locator, "voltageType", sourceVoltageType), sourceVoltageType, (this.voltageType!= null)));
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
                    String sourceAcMeasuredPhases;
                    sourceAcMeasuredPhases = this.getAcMeasuredPhases();
                    String copyAcMeasuredPhases = ((String) strategy.copy(LocatorUtils.property(locator, "acMeasuredPhases", sourceAcMeasuredPhases), sourceAcMeasuredPhases, (this.acMeasuredPhases!= null)));
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
                    String sourceAcMeasuredInReferenceTo;
                    sourceAcMeasuredInReferenceTo = this.getAcMeasuredInReferenceTo();
                    String copyAcMeasuredInReferenceTo = ((String) strategy.copy(LocatorUtils.property(locator, "acMeasuredInReferenceTo", sourceAcMeasuredInReferenceTo), sourceAcMeasuredInReferenceTo, (this.acMeasuredInReferenceTo!= null)));
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
                    String sourceAcMeasurementType;
                    sourceAcMeasurementType = this.getAcMeasurementType();
                    String copyAcMeasurementType = ((String) strategy.copy(LocatorUtils.property(locator, "acMeasurementType", sourceAcMeasurementType), sourceAcMeasurementType, (this.acMeasurementType!= null)));
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
                    String sourceAcMeasurementVariant;
                    sourceAcMeasurementVariant = this.getAcMeasurementVariant();
                    String copyAcMeasurementVariant = ((String) strategy.copy(LocatorUtils.property(locator, "acMeasurementVariant", sourceAcMeasurementVariant), sourceAcMeasurementVariant, (this.acMeasurementVariant!= null)));
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
                    Short sourceAcMeasuredHarmonic;
                    sourceAcMeasuredHarmonic = this.getAcMeasuredHarmonic();
                    Short copyAcMeasuredHarmonic = ((Short) strategy.copy(LocatorUtils.property(locator, "acMeasuredHarmonic", sourceAcMeasuredHarmonic), sourceAcMeasuredHarmonic, (this.acMeasuredHarmonic!= null)));
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
        return new ElectricalConnectionParameterDescriptionDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ElectricalConnectionParameterDescriptionDataType that = ((ElectricalConnectionParameterDescriptionDataType) object);
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
            Long leftParameterId;
            leftParameterId = this.getParameterId();
            Long rightParameterId;
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
            String leftVoltageType;
            leftVoltageType = this.getVoltageType();
            String rightVoltageType;
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
            String leftAcMeasuredPhases;
            leftAcMeasuredPhases = this.getAcMeasuredPhases();
            String rightAcMeasuredPhases;
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
            String leftAcMeasuredInReferenceTo;
            leftAcMeasuredInReferenceTo = this.getAcMeasuredInReferenceTo();
            String rightAcMeasuredInReferenceTo;
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
            String leftAcMeasurementType;
            leftAcMeasurementType = this.getAcMeasurementType();
            String rightAcMeasurementType;
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
            String leftAcMeasurementVariant;
            leftAcMeasurementVariant = this.getAcMeasurementVariant();
            String rightAcMeasurementVariant;
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
            Short leftAcMeasuredHarmonic;
            leftAcMeasuredHarmonic = this.getAcMeasuredHarmonic();
            Short rightAcMeasuredHarmonic;
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
            Long theParameterId;
            theParameterId = this.getParameterId();
            if (this.parameterId!= null) {
                currentHashCode += theParameterId.hashCode();
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
            String theVoltageType;
            theVoltageType = this.getVoltageType();
            if (this.voltageType!= null) {
                currentHashCode += theVoltageType.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String theAcMeasuredPhases;
            theAcMeasuredPhases = this.getAcMeasuredPhases();
            if (this.acMeasuredPhases!= null) {
                currentHashCode += theAcMeasuredPhases.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String theAcMeasuredInReferenceTo;
            theAcMeasuredInReferenceTo = this.getAcMeasuredInReferenceTo();
            if (this.acMeasuredInReferenceTo!= null) {
                currentHashCode += theAcMeasuredInReferenceTo.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String theAcMeasurementType;
            theAcMeasurementType = this.getAcMeasurementType();
            if (this.acMeasurementType!= null) {
                currentHashCode += theAcMeasurementType.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String theAcMeasurementVariant;
            theAcMeasurementVariant = this.getAcMeasurementVariant();
            if (this.acMeasurementVariant!= null) {
                currentHashCode += theAcMeasurementVariant.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            Short theAcMeasuredHarmonic;
            theAcMeasuredHarmonic = this.getAcMeasuredHarmonic();
            if (this.acMeasuredHarmonic!= null) {
                currentHashCode += theAcMeasuredHarmonic.hashCode();
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
            Long theParameterId;
            theParameterId = this.getParameterId();
            strategy.appendField(locator, this, "parameterId", buffer, theParameterId, (this.parameterId!= null));
        }
        {
            Long theMeasurementId;
            theMeasurementId = this.getMeasurementId();
            strategy.appendField(locator, this, "measurementId", buffer, theMeasurementId, (this.measurementId!= null));
        }
        {
            String theVoltageType;
            theVoltageType = this.getVoltageType();
            strategy.appendField(locator, this, "voltageType", buffer, theVoltageType, (this.voltageType!= null));
        }
        {
            String theAcMeasuredPhases;
            theAcMeasuredPhases = this.getAcMeasuredPhases();
            strategy.appendField(locator, this, "acMeasuredPhases", buffer, theAcMeasuredPhases, (this.acMeasuredPhases!= null));
        }
        {
            String theAcMeasuredInReferenceTo;
            theAcMeasuredInReferenceTo = this.getAcMeasuredInReferenceTo();
            strategy.appendField(locator, this, "acMeasuredInReferenceTo", buffer, theAcMeasuredInReferenceTo, (this.acMeasuredInReferenceTo!= null));
        }
        {
            String theAcMeasurementType;
            theAcMeasurementType = this.getAcMeasurementType();
            strategy.appendField(locator, this, "acMeasurementType", buffer, theAcMeasurementType, (this.acMeasurementType!= null));
        }
        {
            String theAcMeasurementVariant;
            theAcMeasurementVariant = this.getAcMeasurementVariant();
            strategy.appendField(locator, this, "acMeasurementVariant", buffer, theAcMeasurementVariant, (this.acMeasurementVariant!= null));
        }
        {
            Short theAcMeasuredHarmonic;
            theAcMeasuredHarmonic = this.getAcMeasuredHarmonic();
            strategy.appendField(locator, this, "acMeasuredHarmonic", buffer, theAcMeasuredHarmonic, (this.acMeasuredHarmonic!= null));
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
