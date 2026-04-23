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
 * <p>Java class for SupplyConditionDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SupplyConditionDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="conditionId" type="{http://docs.eebus.org/spine/xsd/v1}ConditionIdType" minOccurs="0"/&gt;
 *         &lt;element name="timestamp" type="{http://docs.eebus.org/spine/xsd/v1}AbsoluteOrRelativeTimeType" minOccurs="0"/&gt;
 *         &lt;element name="eventType" type="{http://docs.eebus.org/spine/xsd/v1}SupplyConditionEventTypeType" minOccurs="0"/&gt;
 *         &lt;element name="originator" type="{http://docs.eebus.org/spine/xsd/v1}SupplyConditionOriginatorType" minOccurs="0"/&gt;
 *         &lt;element name="thresholdId" type="{http://docs.eebus.org/spine/xsd/v1}ThresholdIdType" minOccurs="0"/&gt;
 *         &lt;element name="thresholdPercentage" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberType" minOccurs="0"/&gt;
 *         &lt;element name="relevantPeriod" type="{http://docs.eebus.org/spine/xsd/v1}TimePeriodType" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://docs.eebus.org/spine/xsd/v1}DescriptionType" minOccurs="0"/&gt;
 *         &lt;element name="gridCondition" type="{http://docs.eebus.org/spine/xsd/v1}GridConditionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupplyConditionDataType", propOrder = {
    "conditionId",
    "timestamp",
    "eventType",
    "originator",
    "thresholdId",
    "thresholdPercentage",
    "relevantPeriod",
    "description",
    "gridCondition"
})
public class SupplyConditionDataType implements Cloneable, CopyTo, ToString
{

    @XmlSchemaType(name = "unsignedInt")
    protected Long conditionId;
    protected String timestamp;
    protected String eventType;
    protected String originator;
    @XmlSchemaType(name = "unsignedInt")
    protected Long thresholdId;
    protected ScaledNumberType thresholdPercentage;
    protected TimePeriodType relevantPeriod;
    protected String description;
    protected String gridCondition;

    /**
     * Default no-arg constructor
     * 
     */
    public SupplyConditionDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public SupplyConditionDataType(final Long conditionId, final String timestamp, final String eventType, final String originator, final Long thresholdId, final ScaledNumberType thresholdPercentage, final TimePeriodType relevantPeriod, final String description, final String gridCondition) {
        this.conditionId = conditionId;
        this.timestamp = timestamp;
        this.eventType = eventType;
        this.originator = originator;
        this.thresholdId = thresholdId;
        this.thresholdPercentage = thresholdPercentage;
        this.relevantPeriod = relevantPeriod;
        this.description = description;
        this.gridCondition = gridCondition;
    }

    /**
     * Gets the value of the conditionId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getConditionId() {
        return conditionId;
    }

    /**
     * Sets the value of the conditionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setConditionId(Long value) {
        this.conditionId = value;
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
     * Gets the value of the eventType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventType() {
        return eventType;
    }

    /**
     * Sets the value of the eventType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventType(String value) {
        this.eventType = value;
    }

    /**
     * Gets the value of the originator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginator() {
        return originator;
    }

    /**
     * Sets the value of the originator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginator(String value) {
        this.originator = value;
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
     * Gets the value of the thresholdPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link ScaledNumberType }
     *     
     */
    public ScaledNumberType getThresholdPercentage() {
        return thresholdPercentage;
    }

    /**
     * Sets the value of the thresholdPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberType }
     *     
     */
    public void setThresholdPercentage(ScaledNumberType value) {
        this.thresholdPercentage = value;
    }

    /**
     * Gets the value of the relevantPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodType }
     *     
     */
    public TimePeriodType getRelevantPeriod() {
        return relevantPeriod;
    }

    /**
     * Sets the value of the relevantPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodType }
     *     
     */
    public void setRelevantPeriod(TimePeriodType value) {
        this.relevantPeriod = value;
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
     * Gets the value of the gridCondition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGridCondition() {
        return gridCondition;
    }

    /**
     * Sets the value of the gridCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGridCondition(String value) {
        this.gridCondition = value;
    }

    /**
     * Sets the value of the conditionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     * @return
     *     The class instance
     */
    public SupplyConditionDataType withConditionId(Long value) {
        setConditionId(value);
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
    public SupplyConditionDataType withTimestamp(String value) {
        setTimestamp(value);
        return this;
    }

    /**
     * Sets the value of the eventType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public SupplyConditionDataType withEventType(String value) {
        setEventType(value);
        return this;
    }

    /**
     * Sets the value of the originator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public SupplyConditionDataType withOriginator(String value) {
        setOriginator(value);
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
    public SupplyConditionDataType withThresholdId(Long value) {
        setThresholdId(value);
        return this;
    }

    /**
     * Sets the value of the thresholdPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberType }
     * @return
     *     The class instance
     */
    public SupplyConditionDataType withThresholdPercentage(ScaledNumberType value) {
        setThresholdPercentage(value);
        return this;
    }

    /**
     * Sets the value of the relevantPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodType }
     * @return
     *     The class instance
     */
    public SupplyConditionDataType withRelevantPeriod(TimePeriodType value) {
        setRelevantPeriod(value);
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
    public SupplyConditionDataType withDescription(String value) {
        setDescription(value);
        return this;
    }

    /**
     * Sets the value of the gridCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public SupplyConditionDataType withGridCondition(String value) {
        setGridCondition(value);
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
        if (draftCopy instanceof SupplyConditionDataType) {
            final SupplyConditionDataType copy = ((SupplyConditionDataType) draftCopy);
            {
                Boolean conditionIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.conditionId!= null));
                if (conditionIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceConditionId;
                    sourceConditionId = this.getConditionId();
                    Long copyConditionId = ((Long) strategy.copy(LocatorUtils.property(locator, "conditionId", sourceConditionId), sourceConditionId, (this.conditionId!= null)));
                    copy.setConditionId(copyConditionId);
                } else {
                    if (conditionIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.conditionId = null;
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
                Boolean eventTypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.eventType!= null));
                if (eventTypeShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceEventType;
                    sourceEventType = this.getEventType();
                    String copyEventType = ((String) strategy.copy(LocatorUtils.property(locator, "eventType", sourceEventType), sourceEventType, (this.eventType!= null)));
                    copy.setEventType(copyEventType);
                } else {
                    if (eventTypeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.eventType = null;
                    }
                }
            }
            {
                Boolean originatorShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.originator!= null));
                if (originatorShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceOriginator;
                    sourceOriginator = this.getOriginator();
                    String copyOriginator = ((String) strategy.copy(LocatorUtils.property(locator, "originator", sourceOriginator), sourceOriginator, (this.originator!= null)));
                    copy.setOriginator(copyOriginator);
                } else {
                    if (originatorShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.originator = null;
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
                Boolean thresholdPercentageShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.thresholdPercentage!= null));
                if (thresholdPercentageShouldBeCopiedAndSet == Boolean.TRUE) {
                    ScaledNumberType sourceThresholdPercentage;
                    sourceThresholdPercentage = this.getThresholdPercentage();
                    ScaledNumberType copyThresholdPercentage = ((ScaledNumberType) strategy.copy(LocatorUtils.property(locator, "thresholdPercentage", sourceThresholdPercentage), sourceThresholdPercentage, (this.thresholdPercentage!= null)));
                    copy.setThresholdPercentage(copyThresholdPercentage);
                } else {
                    if (thresholdPercentageShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.thresholdPercentage = null;
                    }
                }
            }
            {
                Boolean relevantPeriodShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.relevantPeriod!= null));
                if (relevantPeriodShouldBeCopiedAndSet == Boolean.TRUE) {
                    TimePeriodType sourceRelevantPeriod;
                    sourceRelevantPeriod = this.getRelevantPeriod();
                    TimePeriodType copyRelevantPeriod = ((TimePeriodType) strategy.copy(LocatorUtils.property(locator, "relevantPeriod", sourceRelevantPeriod), sourceRelevantPeriod, (this.relevantPeriod!= null)));
                    copy.setRelevantPeriod(copyRelevantPeriod);
                } else {
                    if (relevantPeriodShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.relevantPeriod = null;
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
            {
                Boolean gridConditionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.gridCondition!= null));
                if (gridConditionShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceGridCondition;
                    sourceGridCondition = this.getGridCondition();
                    String copyGridCondition = ((String) strategy.copy(LocatorUtils.property(locator, "gridCondition", sourceGridCondition), sourceGridCondition, (this.gridCondition!= null)));
                    copy.setGridCondition(copyGridCondition);
                } else {
                    if (gridConditionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.gridCondition = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new SupplyConditionDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final SupplyConditionDataType that = ((SupplyConditionDataType) object);
        {
            Long leftConditionId;
            leftConditionId = this.getConditionId();
            Long rightConditionId;
            rightConditionId = that.getConditionId();
            if (this.conditionId!= null) {
                if (that.conditionId!= null) {
                    if (!leftConditionId.equals(rightConditionId)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.conditionId!= null) {
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
            String leftEventType;
            leftEventType = this.getEventType();
            String rightEventType;
            rightEventType = that.getEventType();
            if (this.eventType!= null) {
                if (that.eventType!= null) {
                    if (!leftEventType.equals(rightEventType)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.eventType!= null) {
                    return false;
                }
            }
        }
        {
            String leftOriginator;
            leftOriginator = this.getOriginator();
            String rightOriginator;
            rightOriginator = that.getOriginator();
            if (this.originator!= null) {
                if (that.originator!= null) {
                    if (!leftOriginator.equals(rightOriginator)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.originator!= null) {
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
            ScaledNumberType leftThresholdPercentage;
            leftThresholdPercentage = this.getThresholdPercentage();
            ScaledNumberType rightThresholdPercentage;
            rightThresholdPercentage = that.getThresholdPercentage();
            if (this.thresholdPercentage!= null) {
                if (that.thresholdPercentage!= null) {
                    if (!leftThresholdPercentage.equals(rightThresholdPercentage)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.thresholdPercentage!= null) {
                    return false;
                }
            }
        }
        {
            TimePeriodType leftRelevantPeriod;
            leftRelevantPeriod = this.getRelevantPeriod();
            TimePeriodType rightRelevantPeriod;
            rightRelevantPeriod = that.getRelevantPeriod();
            if (this.relevantPeriod!= null) {
                if (that.relevantPeriod!= null) {
                    if (!leftRelevantPeriod.equals(rightRelevantPeriod)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.relevantPeriod!= null) {
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
        {
            String leftGridCondition;
            leftGridCondition = this.getGridCondition();
            String rightGridCondition;
            rightGridCondition = that.getGridCondition();
            if (this.gridCondition!= null) {
                if (that.gridCondition!= null) {
                    if (!leftGridCondition.equals(rightGridCondition)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.gridCondition!= null) {
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
            Long theConditionId;
            theConditionId = this.getConditionId();
            if (this.conditionId!= null) {
                currentHashCode += theConditionId.hashCode();
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
            String theEventType;
            theEventType = this.getEventType();
            if (this.eventType!= null) {
                currentHashCode += theEventType.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String theOriginator;
            theOriginator = this.getOriginator();
            if (this.originator!= null) {
                currentHashCode += theOriginator.hashCode();
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
            ScaledNumberType theThresholdPercentage;
            theThresholdPercentage = this.getThresholdPercentage();
            if (this.thresholdPercentage!= null) {
                currentHashCode += theThresholdPercentage.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            TimePeriodType theRelevantPeriod;
            theRelevantPeriod = this.getRelevantPeriod();
            if (this.relevantPeriod!= null) {
                currentHashCode += theRelevantPeriod.hashCode();
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
        {
            currentHashCode = (currentHashCode* 31);
            String theGridCondition;
            theGridCondition = this.getGridCondition();
            if (this.gridCondition!= null) {
                currentHashCode += theGridCondition.hashCode();
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
            Long theConditionId;
            theConditionId = this.getConditionId();
            strategy.appendField(locator, this, "conditionId", buffer, theConditionId, (this.conditionId!= null));
        }
        {
            String theTimestamp;
            theTimestamp = this.getTimestamp();
            strategy.appendField(locator, this, "timestamp", buffer, theTimestamp, (this.timestamp!= null));
        }
        {
            String theEventType;
            theEventType = this.getEventType();
            strategy.appendField(locator, this, "eventType", buffer, theEventType, (this.eventType!= null));
        }
        {
            String theOriginator;
            theOriginator = this.getOriginator();
            strategy.appendField(locator, this, "originator", buffer, theOriginator, (this.originator!= null));
        }
        {
            Long theThresholdId;
            theThresholdId = this.getThresholdId();
            strategy.appendField(locator, this, "thresholdId", buffer, theThresholdId, (this.thresholdId!= null));
        }
        {
            ScaledNumberType theThresholdPercentage;
            theThresholdPercentage = this.getThresholdPercentage();
            strategy.appendField(locator, this, "thresholdPercentage", buffer, theThresholdPercentage, (this.thresholdPercentage!= null));
        }
        {
            TimePeriodType theRelevantPeriod;
            theRelevantPeriod = this.getRelevantPeriod();
            strategy.appendField(locator, this, "relevantPeriod", buffer, theRelevantPeriod, (this.relevantPeriod!= null));
        }
        {
            String theDescription;
            theDescription = this.getDescription();
            strategy.appendField(locator, this, "description", buffer, theDescription, (this.description!= null));
        }
        {
            String theGridCondition;
            theGridCondition = this.getGridCondition();
            strategy.appendField(locator, this, "gridCondition", buffer, theGridCondition, (this.gridCondition!= null));
        }
        return buffer;
    }

}
