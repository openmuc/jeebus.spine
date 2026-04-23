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
 * <p>Java class for MeasurementDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MeasurementDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="measurementId" type="{http://docs.eebus.org/spine/xsd/v1}MeasurementIdType" minOccurs="0"/&gt;
 *         &lt;element name="valueType" type="{http://docs.eebus.org/spine/xsd/v1}MeasurementValueTypeType" minOccurs="0"/&gt;
 *         &lt;element name="timestamp" type="{http://docs.eebus.org/spine/xsd/v1}AbsoluteOrRelativeTimeType" minOccurs="0"/&gt;
 *         &lt;element name="value" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberType" minOccurs="0"/&gt;
 *         &lt;element name="evaluationPeriod" type="{http://docs.eebus.org/spine/xsd/v1}TimePeriodType" minOccurs="0"/&gt;
 *         &lt;element name="valueSource" type="{http://docs.eebus.org/spine/xsd/v1}MeasurementValueSourceType" minOccurs="0"/&gt;
 *         &lt;element name="valueTendency" type="{http://docs.eebus.org/spine/xsd/v1}MeasurementValueTendencyType" minOccurs="0"/&gt;
 *         &lt;element name="valueState" type="{http://docs.eebus.org/spine/xsd/v1}MeasurementValueStateType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeasurementDataType", propOrder = {
    "measurementId",
    "valueType",
    "timestamp",
    "value",
    "evaluationPeriod",
    "valueSource",
    "valueTendency",
    "valueState"
})
public class MeasurementDataType implements Cloneable, CopyTo, ToString
{

    @XmlSchemaType(name = "unsignedInt")
    protected Long measurementId;
    protected String valueType;
    protected String timestamp;
    protected ScaledNumberType value;
    protected TimePeriodType evaluationPeriod;
    protected String valueSource;
    protected String valueTendency;
    protected String valueState;

    /**
     * Default no-arg constructor
     * 
     */
    public MeasurementDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public MeasurementDataType(final Long measurementId, final String valueType, final String timestamp, final ScaledNumberType value, final TimePeriodType evaluationPeriod, final String valueSource, final String valueTendency, final String valueState) {
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
     * Gets the value of the valueType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueType() {
        return valueType;
    }

    /**
     * Sets the value of the valueType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueType(String value) {
        this.valueType = value;
    }

    /**
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimestamp(String value) {
        this.timestamp = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link ScaledNumberType }
     *     
     */
    public ScaledNumberType getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberType }
     *     
     */
    public void setValue(ScaledNumberType value) {
        this.value = value;
    }

    /**
     * Gets the value of the evaluationPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodType }
     *     
     */
    public TimePeriodType getEvaluationPeriod() {
        return evaluationPeriod;
    }

    /**
     * Sets the value of the evaluationPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodType }
     *     
     */
    public void setEvaluationPeriod(TimePeriodType value) {
        this.evaluationPeriod = value;
    }

    /**
     * Gets the value of the valueSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueSource() {
        return valueSource;
    }

    /**
     * Sets the value of the valueSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueSource(String value) {
        this.valueSource = value;
    }

    /**
     * Gets the value of the valueTendency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueTendency() {
        return valueTendency;
    }

    /**
     * Sets the value of the valueTendency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueTendency(String value) {
        this.valueTendency = value;
    }

    /**
     * Gets the value of the valueState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueState() {
        return valueState;
    }

    /**
     * Sets the value of the valueState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueState(String value) {
        this.valueState = value;
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
    public MeasurementDataType withMeasurementId(Long value) {
        setMeasurementId(value);
        return this;
    }

    /**
     * Sets the value of the valueType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public MeasurementDataType withValueType(String value) {
        setValueType(value);
        return this;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public MeasurementDataType withTimestamp(String value) {
        setTimestamp(value);
        return this;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberType }
     * @return
     *     The class instance
     */
    public MeasurementDataType withValue(ScaledNumberType value) {
        setValue(value);
        return this;
    }

    /**
     * Sets the value of the evaluationPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodType }
     * @return
     *     The class instance
     */
    public MeasurementDataType withEvaluationPeriod(TimePeriodType value) {
        setEvaluationPeriod(value);
        return this;
    }

    /**
     * Sets the value of the valueSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public MeasurementDataType withValueSource(String value) {
        setValueSource(value);
        return this;
    }

    /**
     * Sets the value of the valueTendency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public MeasurementDataType withValueTendency(String value) {
        setValueTendency(value);
        return this;
    }

    /**
     * Sets the value of the valueState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public MeasurementDataType withValueState(String value) {
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
        if (draftCopy instanceof MeasurementDataType) {
            final MeasurementDataType copy = ((MeasurementDataType) draftCopy);
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
                Boolean valueTypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.valueType!= null));
                if (valueTypeShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceValueType;
                    sourceValueType = this.getValueType();
                    String copyValueType = ((String) strategy.copy(LocatorUtils.property(locator, "valueType", sourceValueType), sourceValueType, (this.valueType!= null)));
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
                    String sourceTimestamp;
                    sourceTimestamp = this.getTimestamp();
                    String copyTimestamp = ((String) strategy.copy(LocatorUtils.property(locator, "timestamp", sourceTimestamp), sourceTimestamp, (this.timestamp!= null)));
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
                    ScaledNumberType sourceValue;
                    sourceValue = this.getValue();
                    ScaledNumberType copyValue = ((ScaledNumberType) strategy.copy(LocatorUtils.property(locator, "value", sourceValue), sourceValue, (this.value!= null)));
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
                    TimePeriodType sourceEvaluationPeriod;
                    sourceEvaluationPeriod = this.getEvaluationPeriod();
                    TimePeriodType copyEvaluationPeriod = ((TimePeriodType) strategy.copy(LocatorUtils.property(locator, "evaluationPeriod", sourceEvaluationPeriod), sourceEvaluationPeriod, (this.evaluationPeriod!= null)));
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
                    String sourceValueSource;
                    sourceValueSource = this.getValueSource();
                    String copyValueSource = ((String) strategy.copy(LocatorUtils.property(locator, "valueSource", sourceValueSource), sourceValueSource, (this.valueSource!= null)));
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
                    String sourceValueTendency;
                    sourceValueTendency = this.getValueTendency();
                    String copyValueTendency = ((String) strategy.copy(LocatorUtils.property(locator, "valueTendency", sourceValueTendency), sourceValueTendency, (this.valueTendency!= null)));
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
                    String sourceValueState;
                    sourceValueState = this.getValueState();
                    String copyValueState = ((String) strategy.copy(LocatorUtils.property(locator, "valueState", sourceValueState), sourceValueState, (this.valueState!= null)));
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
        return new MeasurementDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final MeasurementDataType that = ((MeasurementDataType) object);
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
            String leftValueType;
            leftValueType = this.getValueType();
            String rightValueType;
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
            String leftTimestamp;
            leftTimestamp = this.getTimestamp();
            String rightTimestamp;
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
            ScaledNumberType leftValue;
            leftValue = this.getValue();
            ScaledNumberType rightValue;
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
            TimePeriodType leftEvaluationPeriod;
            leftEvaluationPeriod = this.getEvaluationPeriod();
            TimePeriodType rightEvaluationPeriod;
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
            String leftValueSource;
            leftValueSource = this.getValueSource();
            String rightValueSource;
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
            String leftValueTendency;
            leftValueTendency = this.getValueTendency();
            String rightValueTendency;
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
            String leftValueState;
            leftValueState = this.getValueState();
            String rightValueState;
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
            Long theMeasurementId;
            theMeasurementId = this.getMeasurementId();
            if (this.measurementId!= null) {
                currentHashCode += theMeasurementId.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String theValueType;
            theValueType = this.getValueType();
            if (this.valueType!= null) {
                currentHashCode += theValueType.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String theTimestamp;
            theTimestamp = this.getTimestamp();
            if (this.timestamp!= null) {
                currentHashCode += theTimestamp.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ScaledNumberType theValue;
            theValue = this.getValue();
            if (this.value!= null) {
                currentHashCode += theValue.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            TimePeriodType theEvaluationPeriod;
            theEvaluationPeriod = this.getEvaluationPeriod();
            if (this.evaluationPeriod!= null) {
                currentHashCode += theEvaluationPeriod.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String theValueSource;
            theValueSource = this.getValueSource();
            if (this.valueSource!= null) {
                currentHashCode += theValueSource.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String theValueTendency;
            theValueTendency = this.getValueTendency();
            if (this.valueTendency!= null) {
                currentHashCode += theValueTendency.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String theValueState;
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
            Long theMeasurementId;
            theMeasurementId = this.getMeasurementId();
            strategy.appendField(locator, this, "measurementId", buffer, theMeasurementId, (this.measurementId!= null));
        }
        {
            String theValueType;
            theValueType = this.getValueType();
            strategy.appendField(locator, this, "valueType", buffer, theValueType, (this.valueType!= null));
        }
        {
            String theTimestamp;
            theTimestamp = this.getTimestamp();
            strategy.appendField(locator, this, "timestamp", buffer, theTimestamp, (this.timestamp!= null));
        }
        {
            ScaledNumberType theValue;
            theValue = this.getValue();
            strategy.appendField(locator, this, "value", buffer, theValue, (this.value!= null));
        }
        {
            TimePeriodType theEvaluationPeriod;
            theEvaluationPeriod = this.getEvaluationPeriod();
            strategy.appendField(locator, this, "evaluationPeriod", buffer, theEvaluationPeriod, (this.evaluationPeriod!= null));
        }
        {
            String theValueSource;
            theValueSource = this.getValueSource();
            strategy.appendField(locator, this, "valueSource", buffer, theValueSource, (this.valueSource!= null));
        }
        {
            String theValueTendency;
            theValueTendency = this.getValueTendency();
            strategy.appendField(locator, this, "valueTendency", buffer, theValueTendency, (this.valueTendency!= null));
        }
        {
            String theValueState;
            theValueState = this.getValueState();
            strategy.appendField(locator, this, "valueState", buffer, theValueState, (this.valueState!= null));
        }
        return buffer;
    }

}
