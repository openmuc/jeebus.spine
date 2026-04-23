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
 * <p>Java class for AlarmDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlarmDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="alarmId" type="{http://docs.eebus.org/spine/xsd/v1}AlarmIdType" minOccurs="0"/&gt;
 *         &lt;element name="thresholdId" type="{http://docs.eebus.org/spine/xsd/v1}ThresholdIdType" minOccurs="0"/&gt;
 *         &lt;element name="timestamp" type="{http://docs.eebus.org/spine/xsd/v1}AbsoluteOrRelativeTimeType" minOccurs="0"/&gt;
 *         &lt;element name="alarmType" type="{http://docs.eebus.org/spine/xsd/v1}AlarmTypeType" minOccurs="0"/&gt;
 *         &lt;element name="measuredValue" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberType" minOccurs="0"/&gt;
 *         &lt;element name="evaluationPeriod" type="{http://docs.eebus.org/spine/xsd/v1}TimePeriodType" minOccurs="0"/&gt;
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
@XmlType(name = "AlarmDataType", propOrder = {
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
public class AlarmDataType implements Cloneable, CopyTo, ToString
{

    @XmlSchemaType(name = "unsignedInt")
    protected Long alarmId;
    @XmlSchemaType(name = "unsignedInt")
    protected Long thresholdId;
    protected String timestamp;
    protected String alarmType;
    protected ScaledNumberType measuredValue;
    protected TimePeriodType evaluationPeriod;
    protected String scopeType;
    protected String label;
    protected String description;

    /**
     * Default no-arg constructor
     * 
     */
    public AlarmDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public AlarmDataType(final Long alarmId, final Long thresholdId, final String timestamp, final String alarmType, final ScaledNumberType measuredValue, final TimePeriodType evaluationPeriod, final String scopeType, final String label, final String description) {
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
     *     {@link Long }
     *     
     */
    public Long getAlarmId() {
        return alarmId;
    }

    /**
     * Sets the value of the alarmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAlarmId(Long value) {
        this.alarmId = value;
    }

    /**
     * Gets the value of the thresholdId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getThresholdId() {
        return thresholdId;
    }

    /**
     * Sets the value of the thresholdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setThresholdId(Long value) {
        this.thresholdId = value;
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
     * Gets the value of the alarmType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlarmType() {
        return alarmType;
    }

    /**
     * Sets the value of the alarmType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlarmType(String value) {
        this.alarmType = value;
    }

    /**
     * Gets the value of the measuredValue property.
     * 
     * @return
     *     possible object is
     *     {@link ScaledNumberType }
     *     
     */
    public ScaledNumberType getMeasuredValue() {
        return measuredValue;
    }

    /**
     * Sets the value of the measuredValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberType }
     *     
     */
    public void setMeasuredValue(ScaledNumberType value) {
        this.measuredValue = value;
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
     * Sets the value of the alarmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     * @return
     *     The class instance
     */
    public AlarmDataType withAlarmId(Long value) {
        setAlarmId(value);
        return this;
    }

    /**
     * Sets the value of the thresholdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     * @return
     *     The class instance
     */
    public AlarmDataType withThresholdId(Long value) {
        setThresholdId(value);
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
    public AlarmDataType withTimestamp(String value) {
        setTimestamp(value);
        return this;
    }

    /**
     * Sets the value of the alarmType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public AlarmDataType withAlarmType(String value) {
        setAlarmType(value);
        return this;
    }

    /**
     * Sets the value of the measuredValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberType }
     * @return
     *     The class instance
     */
    public AlarmDataType withMeasuredValue(ScaledNumberType value) {
        setMeasuredValue(value);
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
    public AlarmDataType withEvaluationPeriod(TimePeriodType value) {
        setEvaluationPeriod(value);
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
    public AlarmDataType withScopeType(String value) {
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
    public AlarmDataType withLabel(String value) {
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
    public AlarmDataType withDescription(String value) {
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
        if (draftCopy instanceof AlarmDataType) {
            final AlarmDataType copy = ((AlarmDataType) draftCopy);
            {
                Boolean alarmIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.alarmId!= null));
                if (alarmIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceAlarmId;
                    sourceAlarmId = this.getAlarmId();
                    Long copyAlarmId = ((Long) strategy.copy(LocatorUtils.property(locator, "alarmId", sourceAlarmId), sourceAlarmId, (this.alarmId!= null)));
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
                    Long sourceThresholdId;
                    sourceThresholdId = this.getThresholdId();
                    Long copyThresholdId = ((Long) strategy.copy(LocatorUtils.property(locator, "thresholdId", sourceThresholdId), sourceThresholdId, (this.thresholdId!= null)));
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
                Boolean alarmTypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.alarmType!= null));
                if (alarmTypeShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceAlarmType;
                    sourceAlarmType = this.getAlarmType();
                    String copyAlarmType = ((String) strategy.copy(LocatorUtils.property(locator, "alarmType", sourceAlarmType), sourceAlarmType, (this.alarmType!= null)));
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
                    ScaledNumberType sourceMeasuredValue;
                    sourceMeasuredValue = this.getMeasuredValue();
                    ScaledNumberType copyMeasuredValue = ((ScaledNumberType) strategy.copy(LocatorUtils.property(locator, "measuredValue", sourceMeasuredValue), sourceMeasuredValue, (this.measuredValue!= null)));
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
        return new AlarmDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final AlarmDataType that = ((AlarmDataType) object);
        {
            Long leftAlarmId;
            leftAlarmId = this.getAlarmId();
            Long rightAlarmId;
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
            Long leftThresholdId;
            leftThresholdId = this.getThresholdId();
            Long rightThresholdId;
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
            String leftAlarmType;
            leftAlarmType = this.getAlarmType();
            String rightAlarmType;
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
            ScaledNumberType leftMeasuredValue;
            leftMeasuredValue = this.getMeasuredValue();
            ScaledNumberType rightMeasuredValue;
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
            Long theAlarmId;
            theAlarmId = this.getAlarmId();
            if (this.alarmId!= null) {
                currentHashCode += theAlarmId.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            Long theThresholdId;
            theThresholdId = this.getThresholdId();
            if (this.thresholdId!= null) {
                currentHashCode += theThresholdId.hashCode();
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
            String theAlarmType;
            theAlarmType = this.getAlarmType();
            if (this.alarmType!= null) {
                currentHashCode += theAlarmType.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ScaledNumberType theMeasuredValue;
            theMeasuredValue = this.getMeasuredValue();
            if (this.measuredValue!= null) {
                currentHashCode += theMeasuredValue.hashCode();
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
            Long theAlarmId;
            theAlarmId = this.getAlarmId();
            strategy.appendField(locator, this, "alarmId", buffer, theAlarmId, (this.alarmId!= null));
        }
        {
            Long theThresholdId;
            theThresholdId = this.getThresholdId();
            strategy.appendField(locator, this, "thresholdId", buffer, theThresholdId, (this.thresholdId!= null));
        }
        {
            String theTimestamp;
            theTimestamp = this.getTimestamp();
            strategy.appendField(locator, this, "timestamp", buffer, theTimestamp, (this.timestamp!= null));
        }
        {
            String theAlarmType;
            theAlarmType = this.getAlarmType();
            strategy.appendField(locator, this, "alarmType", buffer, theAlarmType, (this.alarmType!= null));
        }
        {
            ScaledNumberType theMeasuredValue;
            theMeasuredValue = this.getMeasuredValue();
            strategy.appendField(locator, this, "measuredValue", buffer, theMeasuredValue, (this.measuredValue!= null));
        }
        {
            TimePeriodType theEvaluationPeriod;
            theEvaluationPeriod = this.getEvaluationPeriod();
            strategy.appendField(locator, this, "evaluationPeriod", buffer, theEvaluationPeriod, (this.evaluationPeriod!= null));
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
