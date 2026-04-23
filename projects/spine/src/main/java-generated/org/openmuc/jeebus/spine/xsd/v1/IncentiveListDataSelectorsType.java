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
 * <p>Java class for IncentiveListDataSelectorsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IncentiveListDataSelectorsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="incentiveId" type="{http://docs.eebus.org/spine/xsd/v1}IncentiveIdType" minOccurs="0"/&gt;
 *         &lt;element name="valueType" type="{http://docs.eebus.org/spine/xsd/v1}IncentiveValueTypeType" minOccurs="0"/&gt;
 *         &lt;element name="timestampInterval" type="{http://docs.eebus.org/spine/xsd/v1}TimestampIntervalType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IncentiveListDataSelectorsType", propOrder = {
    "incentiveId",
    "valueType",
    "timestampInterval"
})
public class IncentiveListDataSelectorsType implements Cloneable, CopyTo, ToString
{

    @XmlSchemaType(name = "unsignedInt")
    protected Long incentiveId;
    protected String valueType;
    protected TimestampIntervalType timestampInterval;

    /**
     * Default no-arg constructor
     * 
     */
    public IncentiveListDataSelectorsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public IncentiveListDataSelectorsType(final Long incentiveId, final String valueType, final TimestampIntervalType timestampInterval) {
        this.incentiveId = incentiveId;
        this.valueType = valueType;
        this.timestampInterval = timestampInterval;
    }

    /**
     * Gets the value of the incentiveId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIncentiveId() {
        return incentiveId;
    }

    /**
     * Sets the value of the incentiveId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIncentiveId(Long value) {
        this.incentiveId = value;
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
     * Gets the value of the timestampInterval property.
     * 
     * @return
     *     possible object is
     *     {@link TimestampIntervalType }
     *     
     */
    public TimestampIntervalType getTimestampInterval() {
        return timestampInterval;
    }

    /**
     * Sets the value of the timestampInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimestampIntervalType }
     *     
     */
    public void setTimestampInterval(TimestampIntervalType value) {
        this.timestampInterval = value;
    }

    /**
     * Sets the value of the incentiveId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     * @return
     *     The class instance
     */
    public IncentiveListDataSelectorsType withIncentiveId(Long value) {
        setIncentiveId(value);
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
    public IncentiveListDataSelectorsType withValueType(String value) {
        setValueType(value);
        return this;
    }

    /**
     * Sets the value of the timestampInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimestampIntervalType }
     * @return
     *     The class instance
     */
    public IncentiveListDataSelectorsType withTimestampInterval(TimestampIntervalType value) {
        setTimestampInterval(value);
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
        if (draftCopy instanceof IncentiveListDataSelectorsType) {
            final IncentiveListDataSelectorsType copy = ((IncentiveListDataSelectorsType) draftCopy);
            {
                Boolean incentiveIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.incentiveId!= null));
                if (incentiveIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceIncentiveId;
                    sourceIncentiveId = this.getIncentiveId();
                    Long copyIncentiveId = ((Long) strategy.copy(LocatorUtils.property(locator, "incentiveId", sourceIncentiveId), sourceIncentiveId, (this.incentiveId!= null)));
                    copy.setIncentiveId(copyIncentiveId);
                } else {
                    if (incentiveIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.incentiveId = null;
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
                Boolean timestampIntervalShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.timestampInterval!= null));
                if (timestampIntervalShouldBeCopiedAndSet == Boolean.TRUE) {
                    TimestampIntervalType sourceTimestampInterval;
                    sourceTimestampInterval = this.getTimestampInterval();
                    TimestampIntervalType copyTimestampInterval = ((TimestampIntervalType) strategy.copy(LocatorUtils.property(locator, "timestampInterval", sourceTimestampInterval), sourceTimestampInterval, (this.timestampInterval!= null)));
                    copy.setTimestampInterval(copyTimestampInterval);
                } else {
                    if (timestampIntervalShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.timestampInterval = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new IncentiveListDataSelectorsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final IncentiveListDataSelectorsType that = ((IncentiveListDataSelectorsType) object);
        {
            Long leftIncentiveId;
            leftIncentiveId = this.getIncentiveId();
            Long rightIncentiveId;
            rightIncentiveId = that.getIncentiveId();
            if (this.incentiveId!= null) {
                if (that.incentiveId!= null) {
                    if (!leftIncentiveId.equals(rightIncentiveId)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.incentiveId!= null) {
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
            TimestampIntervalType leftTimestampInterval;
            leftTimestampInterval = this.getTimestampInterval();
            TimestampIntervalType rightTimestampInterval;
            rightTimestampInterval = that.getTimestampInterval();
            if (this.timestampInterval!= null) {
                if (that.timestampInterval!= null) {
                    if (!leftTimestampInterval.equals(rightTimestampInterval)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.timestampInterval!= null) {
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
            Long theIncentiveId;
            theIncentiveId = this.getIncentiveId();
            if (this.incentiveId!= null) {
                currentHashCode += theIncentiveId.hashCode();
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
            TimestampIntervalType theTimestampInterval;
            theTimestampInterval = this.getTimestampInterval();
            if (this.timestampInterval!= null) {
                currentHashCode += theTimestampInterval.hashCode();
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
            Long theIncentiveId;
            theIncentiveId = this.getIncentiveId();
            strategy.appendField(locator, this, "incentiveId", buffer, theIncentiveId, (this.incentiveId!= null));
        }
        {
            String theValueType;
            theValueType = this.getValueType();
            strategy.appendField(locator, this, "valueType", buffer, theValueType, (this.valueType!= null));
        }
        {
            TimestampIntervalType theTimestampInterval;
            theTimestampInterval = this.getTimestampInterval();
            strategy.appendField(locator, this, "timestampInterval", buffer, theTimestampInterval, (this.timestampInterval!= null));
        }
        return buffer;
    }

}
