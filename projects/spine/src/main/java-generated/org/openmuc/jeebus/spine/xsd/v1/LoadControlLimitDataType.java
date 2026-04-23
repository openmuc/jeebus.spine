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
 * <p>Java class for LoadControlLimitDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoadControlLimitDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="limitId" type="{http://docs.eebus.org/spine/xsd/v1}LoadControlLimitIdType" minOccurs="0"/&gt;
 *         &lt;element name="isLimitChangeable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isLimitActive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="timePeriod" type="{http://docs.eebus.org/spine/xsd/v1}TimePeriodType" minOccurs="0"/&gt;
 *         &lt;element name="value" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoadControlLimitDataType", propOrder = {
    "limitId",
    "isLimitChangeable",
    "isLimitActive",
    "timePeriod",
    "value"
})
public class LoadControlLimitDataType implements Cloneable, CopyTo, ToString
{

    @XmlSchemaType(name = "unsignedInt")
    protected Long limitId;
    protected Boolean isLimitChangeable;
    protected Boolean isLimitActive;
    protected TimePeriodType timePeriod;
    protected ScaledNumberType value;

    /**
     * Default no-arg constructor
     * 
     */
    public LoadControlLimitDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public LoadControlLimitDataType(final Long limitId, final Boolean isLimitChangeable, final Boolean isLimitActive, final TimePeriodType timePeriod, final ScaledNumberType value) {
        this.limitId = limitId;
        this.isLimitChangeable = isLimitChangeable;
        this.isLimitActive = isLimitActive;
        this.timePeriod = timePeriod;
        this.value = value;
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
     * Gets the value of the isLimitChangeable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getIsLimitChangeable() {
        return isLimitChangeable;
    }

    /**
     * Sets the value of the isLimitChangeable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsLimitChangeable(Boolean value) {
        this.isLimitChangeable = value;
    }

    /**
     * Gets the value of the isLimitActive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getIsLimitActive() {
        return isLimitActive;
    }

    /**
     * Sets the value of the isLimitActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsLimitActive(Boolean value) {
        this.isLimitActive = value;
    }

    /**
     * Gets the value of the timePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodType }
     *     
     */
    public TimePeriodType getTimePeriod() {
        return timePeriod;
    }

    /**
     * Sets the value of the timePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodType }
     *     
     */
    public void setTimePeriod(TimePeriodType value) {
        this.timePeriod = value;
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
     * Sets the value of the limitId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     * @return
     *     The class instance
     */
    public LoadControlLimitDataType withLimitId(Long value) {
        setLimitId(value);
        return this;
    }

    /**
     * Sets the value of the isLimitChangeable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     * @return
     *     The class instance
     */
    public LoadControlLimitDataType withIsLimitChangeable(Boolean value) {
        setIsLimitChangeable(value);
        return this;
    }

    /**
     * Sets the value of the isLimitActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     * @return
     *     The class instance
     */
    public LoadControlLimitDataType withIsLimitActive(Boolean value) {
        setIsLimitActive(value);
        return this;
    }

    /**
     * Sets the value of the timePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodType }
     * @return
     *     The class instance
     */
    public LoadControlLimitDataType withTimePeriod(TimePeriodType value) {
        setTimePeriod(value);
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
    public LoadControlLimitDataType withValue(ScaledNumberType value) {
        setValue(value);
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
        if (draftCopy instanceof LoadControlLimitDataType) {
            final LoadControlLimitDataType copy = ((LoadControlLimitDataType) draftCopy);
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
                Boolean isLimitChangeableShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.isLimitChangeable!= null));
                if (isLimitChangeableShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceIsLimitChangeable;
                    sourceIsLimitChangeable = this.getIsLimitChangeable();
                    Boolean copyIsLimitChangeable = ((Boolean) strategy.copy(LocatorUtils.property(locator, "isLimitChangeable", sourceIsLimitChangeable), sourceIsLimitChangeable, (this.isLimitChangeable!= null)));
                    copy.setIsLimitChangeable(copyIsLimitChangeable);
                } else {
                    if (isLimitChangeableShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.isLimitChangeable = null;
                    }
                }
            }
            {
                Boolean isLimitActiveShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.isLimitActive!= null));
                if (isLimitActiveShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceIsLimitActive;
                    sourceIsLimitActive = this.getIsLimitActive();
                    Boolean copyIsLimitActive = ((Boolean) strategy.copy(LocatorUtils.property(locator, "isLimitActive", sourceIsLimitActive), sourceIsLimitActive, (this.isLimitActive!= null)));
                    copy.setIsLimitActive(copyIsLimitActive);
                } else {
                    if (isLimitActiveShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.isLimitActive = null;
                    }
                }
            }
            {
                Boolean timePeriodShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.timePeriod!= null));
                if (timePeriodShouldBeCopiedAndSet == Boolean.TRUE) {
                    TimePeriodType sourceTimePeriod;
                    sourceTimePeriod = this.getTimePeriod();
                    TimePeriodType copyTimePeriod = ((TimePeriodType) strategy.copy(LocatorUtils.property(locator, "timePeriod", sourceTimePeriod), sourceTimePeriod, (this.timePeriod!= null)));
                    copy.setTimePeriod(copyTimePeriod);
                } else {
                    if (timePeriodShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.timePeriod = null;
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
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new LoadControlLimitDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final LoadControlLimitDataType that = ((LoadControlLimitDataType) object);
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
            Boolean leftIsLimitChangeable;
            leftIsLimitChangeable = this.getIsLimitChangeable();
            Boolean rightIsLimitChangeable;
            rightIsLimitChangeable = that.getIsLimitChangeable();
            if (this.isLimitChangeable!= null) {
                if (that.isLimitChangeable!= null) {
                    if (!leftIsLimitChangeable.equals(rightIsLimitChangeable)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.isLimitChangeable!= null) {
                    return false;
                }
            }
        }
        {
            Boolean leftIsLimitActive;
            leftIsLimitActive = this.getIsLimitActive();
            Boolean rightIsLimitActive;
            rightIsLimitActive = that.getIsLimitActive();
            if (this.isLimitActive!= null) {
                if (that.isLimitActive!= null) {
                    if (!leftIsLimitActive.equals(rightIsLimitActive)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.isLimitActive!= null) {
                    return false;
                }
            }
        }
        {
            TimePeriodType leftTimePeriod;
            leftTimePeriod = this.getTimePeriod();
            TimePeriodType rightTimePeriod;
            rightTimePeriod = that.getTimePeriod();
            if (this.timePeriod!= null) {
                if (that.timePeriod!= null) {
                    if (!leftTimePeriod.equals(rightTimePeriod)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.timePeriod!= null) {
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
            Boolean theIsLimitChangeable;
            theIsLimitChangeable = this.getIsLimitChangeable();
            if (this.isLimitChangeable!= null) {
                currentHashCode += theIsLimitChangeable.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            Boolean theIsLimitActive;
            theIsLimitActive = this.getIsLimitActive();
            if (this.isLimitActive!= null) {
                currentHashCode += theIsLimitActive.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            TimePeriodType theTimePeriod;
            theTimePeriod = this.getTimePeriod();
            if (this.timePeriod!= null) {
                currentHashCode += theTimePeriod.hashCode();
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
            Boolean theIsLimitChangeable;
            theIsLimitChangeable = this.getIsLimitChangeable();
            strategy.appendField(locator, this, "isLimitChangeable", buffer, theIsLimitChangeable, (this.isLimitChangeable!= null));
        }
        {
            Boolean theIsLimitActive;
            theIsLimitActive = this.getIsLimitActive();
            strategy.appendField(locator, this, "isLimitActive", buffer, theIsLimitActive, (this.isLimitActive!= null));
        }
        {
            TimePeriodType theTimePeriod;
            theTimePeriod = this.getTimePeriod();
            strategy.appendField(locator, this, "timePeriod", buffer, theTimePeriod, (this.timePeriod!= null));
        }
        {
            ScaledNumberType theValue;
            theValue = this.getValue();
            strategy.appendField(locator, this, "value", buffer, theValue, (this.value!= null));
        }
        return buffer;
    }

}
