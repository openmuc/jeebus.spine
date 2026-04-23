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
 * <p>Java class for MeasurementSeriesDataElementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MeasurementSeriesDataElementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="measurementId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="valueType" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="timestamp" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="value" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberElementsType" minOccurs="0"/&gt;
 *         &lt;element name="evaluationPeriod" type="{http://docs.eebus.org/spine/xsd/v1}TimePeriodElementsType" minOccurs="0"/&gt;
 *         &lt;element name="valueSource" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="valueTendency" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="valueState" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeasurementSeriesDataElementsType", propOrder = {
    "measurementId",
    "valueType",
    "timestamp",
    "value",
    "evaluationPeriod",
    "valueSource",
    "valueTendency",
    "valueState"
})
public class MeasurementSeriesDataElementsType implements Cloneable, CopyTo, ToString
{

    protected ElementTagType measurementId;
    protected ElementTagType valueType;
    protected ElementTagType timestamp;
    protected ScaledNumberElementsType value;
    protected TimePeriodElementsType evaluationPeriod;
    protected ElementTagType valueSource;
    protected ElementTagType valueTendency;
    protected ElementTagType valueState;

    /**
     * Default no-arg constructor
     * 
     */
    public MeasurementSeriesDataElementsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public MeasurementSeriesDataElementsType(final ElementTagType measurementId, final ElementTagType valueType, final ElementTagType timestamp, final ScaledNumberElementsType value, final TimePeriodElementsType evaluationPeriod, final ElementTagType valueSource, final ElementTagType valueTendency, final ElementTagType valueState) {
        this.measurementId = measurementId;
        this.valueType = valueType;
        this.timestamp = timestamp;
        this.value = value;
        this.evaluationPeriod = evaluationPeriod;
        this.valueSource = valueSource;
        this.valueTendency = valueTendency;
        this.valueState = valueState;
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
     * Gets the value of the valueType property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getValueType() {
        return valueType;
    }

    /**
     * Sets the value of the valueType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setValueType(ElementTagType value) {
        this.valueType = value;
    }

    /**
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setTimestamp(ElementTagType value) {
        this.timestamp = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link ScaledNumberElementsType }
     *     
     */
    public ScaledNumberElementsType getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberElementsType }
     *     
     */
    public void setValue(ScaledNumberElementsType value) {
        this.value = value;
    }

    /**
     * Gets the value of the evaluationPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodElementsType }
     *     
     */
    public TimePeriodElementsType getEvaluationPeriod() {
        return evaluationPeriod;
    }

    /**
     * Sets the value of the evaluationPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodElementsType }
     *     
     */
    public void setEvaluationPeriod(TimePeriodElementsType value) {
        this.evaluationPeriod = value;
    }

    /**
     * Gets the value of the valueSource property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getValueSource() {
        return valueSource;
    }

    /**
     * Sets the value of the valueSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setValueSource(ElementTagType value) {
        this.valueSource = value;
    }

    /**
     * Gets the value of the valueTendency property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getValueTendency() {
        return valueTendency;
    }

    /**
     * Sets the value of the valueTendency property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setValueTendency(ElementTagType value) {
        this.valueTendency = value;
    }

    /**
     * Gets the value of the valueState property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getValueState() {
        return valueState;
    }

    /**
     * Sets the value of the valueState property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setValueState(ElementTagType value) {
        this.valueState = value;
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
    public MeasurementSeriesDataElementsType withMeasurementId(ElementTagType value) {
        setMeasurementId(value);
        return this;
    }

    /**
     * Sets the value of the valueType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public MeasurementSeriesDataElementsType withValueType(ElementTagType value) {
        setValueType(value);
        return this;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public MeasurementSeriesDataElementsType withTimestamp(ElementTagType value) {
        setTimestamp(value);
        return this;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberElementsType }
     * @return
     *     The class instance
     */
    public MeasurementSeriesDataElementsType withValue(ScaledNumberElementsType value) {
        setValue(value);
        return this;
    }

    /**
     * Sets the value of the evaluationPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodElementsType }
     * @return
     *     The class instance
     */
    public MeasurementSeriesDataElementsType withEvaluationPeriod(TimePeriodElementsType value) {
        setEvaluationPeriod(value);
        return this;
    }

    /**
     * Sets the value of the valueSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public MeasurementSeriesDataElementsType withValueSource(ElementTagType value) {
        setValueSource(value);
        return this;
    }

    /**
     * Sets the value of the valueTendency property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public MeasurementSeriesDataElementsType withValueTendency(ElementTagType value) {
        setValueTendency(value);
        return this;
    }

    /**
     * Sets the value of the valueState property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public MeasurementSeriesDataElementsType withValueState(ElementTagType value) {
        setValueState(value);
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
        if (draftCopy instanceof MeasurementSeriesDataElementsType) {
            final MeasurementSeriesDataElementsType copy = ((MeasurementSeriesDataElementsType) draftCopy);
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
                Boolean valueTypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.valueType!= null));
                if (valueTypeShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceValueType;
                    sourceValueType = this.getValueType();
                    ElementTagType copyValueType = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "valueType", sourceValueType), sourceValueType, (this.valueType!= null)));
                    copy.setValueType(copyValueType);
                } else {
                    if (valueTypeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.valueType = null;
                    }
                }
            }
            {
                Boolean timestampShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.timestamp!= null));
                if (timestampShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceTimestamp;
                    sourceTimestamp = this.getTimestamp();
                    ElementTagType copyTimestamp = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "timestamp", sourceTimestamp), sourceTimestamp, (this.timestamp!= null)));
                    copy.setTimestamp(copyTimestamp);
                } else {
                    if (timestampShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.timestamp = null;
                    }
                }
            }
            {
                Boolean valueShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.value!= null));
                if (valueShouldBeCopiedAndSet == Boolean.TRUE) {
                    ScaledNumberElementsType sourceValue;
                    sourceValue = this.getValue();
                    ScaledNumberElementsType copyValue = ((ScaledNumberElementsType) strategy.copy(LocatorUtils.property(locator, "value", sourceValue), sourceValue, (this.value!= null)));
                    copy.setValue(copyValue);
                } else {
                    if (valueShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.value = null;
                    }
                }
            }
            {
                Boolean evaluationPeriodShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.evaluationPeriod!= null));
                if (evaluationPeriodShouldBeCopiedAndSet == Boolean.TRUE) {
                    TimePeriodElementsType sourceEvaluationPeriod;
                    sourceEvaluationPeriod = this.getEvaluationPeriod();
                    TimePeriodElementsType copyEvaluationPeriod = ((TimePeriodElementsType) strategy.copy(LocatorUtils.property(locator, "evaluationPeriod", sourceEvaluationPeriod), sourceEvaluationPeriod, (this.evaluationPeriod!= null)));
                    copy.setEvaluationPeriod(copyEvaluationPeriod);
                } else {
                    if (evaluationPeriodShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.evaluationPeriod = null;
                    }
                }
            }
            {
                Boolean valueSourceShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.valueSource!= null));
                if (valueSourceShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceValueSource;
                    sourceValueSource = this.getValueSource();
                    ElementTagType copyValueSource = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "valueSource", sourceValueSource), sourceValueSource, (this.valueSource!= null)));
                    copy.setValueSource(copyValueSource);
                } else {
                    if (valueSourceShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.valueSource = null;
                    }
                }
            }
            {
                Boolean valueTendencyShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.valueTendency!= null));
                if (valueTendencyShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceValueTendency;
                    sourceValueTendency = this.getValueTendency();
                    ElementTagType copyValueTendency = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "valueTendency", sourceValueTendency), sourceValueTendency, (this.valueTendency!= null)));
                    copy.setValueTendency(copyValueTendency);
                } else {
                    if (valueTendencyShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.valueTendency = null;
                    }
                }
            }
            {
                Boolean valueStateShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.valueState!= null));
                if (valueStateShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceValueState;
                    sourceValueState = this.getValueState();
                    ElementTagType copyValueState = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "valueState", sourceValueState), sourceValueState, (this.valueState!= null)));
                    copy.setValueState(copyValueState);
                } else {
                    if (valueStateShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.valueState = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new MeasurementSeriesDataElementsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final MeasurementSeriesDataElementsType that = ((MeasurementSeriesDataElementsType) object);
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
            ElementTagType leftValueType;
            leftValueType = this.getValueType();
            ElementTagType rightValueType;
            rightValueType = that.getValueType();
            if (this.valueType!= null) {
                if (that.valueType!= null) {
                    if (!leftValueType.equals(rightValueType)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.valueType!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftTimestamp;
            leftTimestamp = this.getTimestamp();
            ElementTagType rightTimestamp;
            rightTimestamp = that.getTimestamp();
            if (this.timestamp!= null) {
                if (that.timestamp!= null) {
                    if (!leftTimestamp.equals(rightTimestamp)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.timestamp!= null) {
                    return false;
                }
            }
        }
        {
            ScaledNumberElementsType leftValue;
            leftValue = this.getValue();
            ScaledNumberElementsType rightValue;
            rightValue = that.getValue();
            if (this.value!= null) {
                if (that.value!= null) {
                    if (!leftValue.equals(rightValue)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.value!= null) {
                    return false;
                }
            }
        }
        {
            TimePeriodElementsType leftEvaluationPeriod;
            leftEvaluationPeriod = this.getEvaluationPeriod();
            TimePeriodElementsType rightEvaluationPeriod;
            rightEvaluationPeriod = that.getEvaluationPeriod();
            if (this.evaluationPeriod!= null) {
                if (that.evaluationPeriod!= null) {
                    if (!leftEvaluationPeriod.equals(rightEvaluationPeriod)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.evaluationPeriod!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftValueSource;
            leftValueSource = this.getValueSource();
            ElementTagType rightValueSource;
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
            ElementTagType leftValueTendency;
            leftValueTendency = this.getValueTendency();
            ElementTagType rightValueTendency;
            rightValueTendency = that.getValueTendency();
            if (this.valueTendency!= null) {
                if (that.valueTendency!= null) {
                    if (!leftValueTendency.equals(rightValueTendency)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.valueTendency!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftValueState;
            leftValueState = this.getValueState();
            ElementTagType rightValueState;
            rightValueState = that.getValueState();
            if (this.valueState!= null) {
                if (that.valueState!= null) {
                    if (!leftValueState.equals(rightValueState)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.valueState!= null) {
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
            ElementTagType theMeasurementId;
            theMeasurementId = this.getMeasurementId();
            if (this.measurementId!= null) {
                currentHashCode += theMeasurementId.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theValueType;
            theValueType = this.getValueType();
            if (this.valueType!= null) {
                currentHashCode += theValueType.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theTimestamp;
            theTimestamp = this.getTimestamp();
            if (this.timestamp!= null) {
                currentHashCode += theTimestamp.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ScaledNumberElementsType theValue;
            theValue = this.getValue();
            if (this.value!= null) {
                currentHashCode += theValue.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            TimePeriodElementsType theEvaluationPeriod;
            theEvaluationPeriod = this.getEvaluationPeriod();
            if (this.evaluationPeriod!= null) {
                currentHashCode += theEvaluationPeriod.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theValueSource;
            theValueSource = this.getValueSource();
            if (this.valueSource!= null) {
                currentHashCode += theValueSource.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theValueTendency;
            theValueTendency = this.getValueTendency();
            if (this.valueTendency!= null) {
                currentHashCode += theValueTendency.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theValueState;
            theValueState = this.getValueState();
            if (this.valueState!= null) {
                currentHashCode += theValueState.hashCode();
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
            ElementTagType theMeasurementId;
            theMeasurementId = this.getMeasurementId();
            strategy.appendField(locator, this, "measurementId", buffer, theMeasurementId, (this.measurementId!= null));
        }
        {
            ElementTagType theValueType;
            theValueType = this.getValueType();
            strategy.appendField(locator, this, "valueType", buffer, theValueType, (this.valueType!= null));
        }
        {
            ElementTagType theTimestamp;
            theTimestamp = this.getTimestamp();
            strategy.appendField(locator, this, "timestamp", buffer, theTimestamp, (this.timestamp!= null));
        }
        {
            ScaledNumberElementsType theValue;
            theValue = this.getValue();
            strategy.appendField(locator, this, "value", buffer, theValue, (this.value!= null));
        }
        {
            TimePeriodElementsType theEvaluationPeriod;
            theEvaluationPeriod = this.getEvaluationPeriod();
            strategy.appendField(locator, this, "evaluationPeriod", buffer, theEvaluationPeriod, (this.evaluationPeriod!= null));
        }
        {
            ElementTagType theValueSource;
            theValueSource = this.getValueSource();
            strategy.appendField(locator, this, "valueSource", buffer, theValueSource, (this.valueSource!= null));
        }
        {
            ElementTagType theValueTendency;
            theValueTendency = this.getValueTendency();
            strategy.appendField(locator, this, "valueTendency", buffer, theValueTendency, (this.valueTendency!= null));
        }
        {
            ElementTagType theValueState;
            theValueState = this.getValueState();
            strategy.appendField(locator, this, "valueState", buffer, theValueState, (this.valueState!= null));
        }
        return buffer;
    }

}
