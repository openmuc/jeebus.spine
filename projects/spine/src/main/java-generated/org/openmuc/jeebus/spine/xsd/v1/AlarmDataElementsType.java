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
 * <p>Java class for AlarmDataElementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlarmDataElementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="alarmId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="thresholdId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="timestamp" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="alarmType" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="measuredValue" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberElementsType" minOccurs="0"/&gt;
 *         &lt;element name="evaluationPeriod" type="{http://docs.eebus.org/spine/xsd/v1}TimePeriodElementsType" minOccurs="0"/&gt;
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
@XmlType(name = "AlarmDataElementsType", propOrder = {
    "alarmId",
    "thresholdId",
    "timestamp",
    "alarmType",
    "measuredValue",
    "evaluationPeriod",
    "scopeType",
    "label",
    "description"
})
public class AlarmDataElementsType implements Cloneable, CopyTo, ToString
{

    protected ElementTagType alarmId;
    protected ElementTagType thresholdId;
    protected ElementTagType timestamp;
    protected ElementTagType alarmType;
    protected ScaledNumberElementsType measuredValue;
    protected TimePeriodElementsType evaluationPeriod;
    protected ElementTagType scopeType;
    protected ElementTagType label;
    protected ElementTagType description;

    /**
     * Default no-arg constructor
     * 
     */
    public AlarmDataElementsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public AlarmDataElementsType(final ElementTagType alarmId, final ElementTagType thresholdId, final ElementTagType timestamp, final ElementTagType alarmType, final ScaledNumberElementsType measuredValue, final TimePeriodElementsType evaluationPeriod, final ElementTagType scopeType, final ElementTagType label, final ElementTagType description) {
        this.alarmId = alarmId;
        this.thresholdId = thresholdId;
        this.timestamp = timestamp;
        this.alarmType = alarmType;
        this.measuredValue = measuredValue;
        this.evaluationPeriod = evaluationPeriod;
        this.scopeType = scopeType;
        this.label = label;
        this.description = description;
    }

    /**
     * Gets the value of the alarmId property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getAlarmId() {
        return alarmId;
    }

    /**
     * Sets the value of the alarmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setAlarmId(ElementTagType value) {
        this.alarmId = value;
    }

    /**
     * Gets the value of the thresholdId property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getThresholdId() {
        return thresholdId;
    }

    /**
     * Sets the value of the thresholdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setThresholdId(ElementTagType value) {
        this.thresholdId = value;
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
     * Gets the value of the alarmType property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getAlarmType() {
        return alarmType;
    }

    /**
     * Sets the value of the alarmType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setAlarmType(ElementTagType value) {
        this.alarmType = value;
    }

    /**
     * Gets the value of the measuredValue property.
     * 
     * @return
     *     possible object is
     *     {@link ScaledNumberElementsType }
     *     
     */
    public ScaledNumberElementsType getMeasuredValue() {
        return measuredValue;
    }

    /**
     * Sets the value of the measuredValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberElementsType }
     *     
     */
    public void setMeasuredValue(ScaledNumberElementsType value) {
        this.measuredValue = value;
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
     * Sets the value of the alarmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public AlarmDataElementsType withAlarmId(ElementTagType value) {
        setAlarmId(value);
        return this;
    }

    /**
     * Sets the value of the thresholdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public AlarmDataElementsType withThresholdId(ElementTagType value) {
        setThresholdId(value);
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
    public AlarmDataElementsType withTimestamp(ElementTagType value) {
        setTimestamp(value);
        return this;
    }

    /**
     * Sets the value of the alarmType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public AlarmDataElementsType withAlarmType(ElementTagType value) {
        setAlarmType(value);
        return this;
    }

    /**
     * Sets the value of the measuredValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberElementsType }
     * @return
     *     The class instance
     */
    public AlarmDataElementsType withMeasuredValue(ScaledNumberElementsType value) {
        setMeasuredValue(value);
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
    public AlarmDataElementsType withEvaluationPeriod(TimePeriodElementsType value) {
        setEvaluationPeriod(value);
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
    public AlarmDataElementsType withScopeType(ElementTagType value) {
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
    public AlarmDataElementsType withLabel(ElementTagType value) {
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
    public AlarmDataElementsType withDescription(ElementTagType value) {
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
        if (draftCopy instanceof AlarmDataElementsType) {
            final AlarmDataElementsType copy = ((AlarmDataElementsType) draftCopy);
            {
                Boolean alarmIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.alarmId!= null));
                if (alarmIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceAlarmId;
                    sourceAlarmId = this.getAlarmId();
                    ElementTagType copyAlarmId = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "alarmId", sourceAlarmId), sourceAlarmId, (this.alarmId!= null)));
                    copy.setAlarmId(copyAlarmId);
                } else {
                    if (alarmIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.alarmId = null;
                    }
                }
            }
            {
                Boolean thresholdIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.thresholdId!= null));
                if (thresholdIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceThresholdId;
                    sourceThresholdId = this.getThresholdId();
                    ElementTagType copyThresholdId = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "thresholdId", sourceThresholdId), sourceThresholdId, (this.thresholdId!= null)));
                    copy.setThresholdId(copyThresholdId);
                } else {
                    if (thresholdIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.thresholdId = null;
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
                Boolean alarmTypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.alarmType!= null));
                if (alarmTypeShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceAlarmType;
                    sourceAlarmType = this.getAlarmType();
                    ElementTagType copyAlarmType = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "alarmType", sourceAlarmType), sourceAlarmType, (this.alarmType!= null)));
                    copy.setAlarmType(copyAlarmType);
                } else {
                    if (alarmTypeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.alarmType = null;
                    }
                }
            }
            {
                Boolean measuredValueShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.measuredValue!= null));
                if (measuredValueShouldBeCopiedAndSet == Boolean.TRUE) {
                    ScaledNumberElementsType sourceMeasuredValue;
                    sourceMeasuredValue = this.getMeasuredValue();
                    ScaledNumberElementsType copyMeasuredValue = ((ScaledNumberElementsType) strategy.copy(LocatorUtils.property(locator, "measuredValue", sourceMeasuredValue), sourceMeasuredValue, (this.measuredValue!= null)));
                    copy.setMeasuredValue(copyMeasuredValue);
                } else {
                    if (measuredValueShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.measuredValue = null;
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
        return new AlarmDataElementsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final AlarmDataElementsType that = ((AlarmDataElementsType) object);
        {
            ElementTagType leftAlarmId;
            leftAlarmId = this.getAlarmId();
            ElementTagType rightAlarmId;
            rightAlarmId = that.getAlarmId();
            if (this.alarmId!= null) {
                if (that.alarmId!= null) {
                    if (!leftAlarmId.equals(rightAlarmId)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.alarmId!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftThresholdId;
            leftThresholdId = this.getThresholdId();
            ElementTagType rightThresholdId;
            rightThresholdId = that.getThresholdId();
            if (this.thresholdId!= null) {
                if (that.thresholdId!= null) {
                    if (!leftThresholdId.equals(rightThresholdId)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.thresholdId!= null) {
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
            ElementTagType leftAlarmType;
            leftAlarmType = this.getAlarmType();
            ElementTagType rightAlarmType;
            rightAlarmType = that.getAlarmType();
            if (this.alarmType!= null) {
                if (that.alarmType!= null) {
                    if (!leftAlarmType.equals(rightAlarmType)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.alarmType!= null) {
                    return false;
                }
            }
        }
        {
            ScaledNumberElementsType leftMeasuredValue;
            leftMeasuredValue = this.getMeasuredValue();
            ScaledNumberElementsType rightMeasuredValue;
            rightMeasuredValue = that.getMeasuredValue();
            if (this.measuredValue!= null) {
                if (that.measuredValue!= null) {
                    if (!leftMeasuredValue.equals(rightMeasuredValue)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.measuredValue!= null) {
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
            ElementTagType theAlarmId;
            theAlarmId = this.getAlarmId();
            if (this.alarmId!= null) {
                currentHashCode += theAlarmId.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theThresholdId;
            theThresholdId = this.getThresholdId();
            if (this.thresholdId!= null) {
                currentHashCode += theThresholdId.hashCode();
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
            ElementTagType theAlarmType;
            theAlarmType = this.getAlarmType();
            if (this.alarmType!= null) {
                currentHashCode += theAlarmType.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ScaledNumberElementsType theMeasuredValue;
            theMeasuredValue = this.getMeasuredValue();
            if (this.measuredValue!= null) {
                currentHashCode += theMeasuredValue.hashCode();
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
            ElementTagType theAlarmId;
            theAlarmId = this.getAlarmId();
            strategy.appendField(locator, this, "alarmId", buffer, theAlarmId, (this.alarmId!= null));
        }
        {
            ElementTagType theThresholdId;
            theThresholdId = this.getThresholdId();
            strategy.appendField(locator, this, "thresholdId", buffer, theThresholdId, (this.thresholdId!= null));
        }
        {
            ElementTagType theTimestamp;
            theTimestamp = this.getTimestamp();
            strategy.appendField(locator, this, "timestamp", buffer, theTimestamp, (this.timestamp!= null));
        }
        {
            ElementTagType theAlarmType;
            theAlarmType = this.getAlarmType();
            strategy.appendField(locator, this, "alarmType", buffer, theAlarmType, (this.alarmType!= null));
        }
        {
            ScaledNumberElementsType theMeasuredValue;
            theMeasuredValue = this.getMeasuredValue();
            strategy.appendField(locator, this, "measuredValue", buffer, theMeasuredValue, (this.measuredValue!= null));
        }
        {
            TimePeriodElementsType theEvaluationPeriod;
            theEvaluationPeriod = this.getEvaluationPeriod();
            strategy.appendField(locator, this, "evaluationPeriod", buffer, theEvaluationPeriod, (this.evaluationPeriod!= null));
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
