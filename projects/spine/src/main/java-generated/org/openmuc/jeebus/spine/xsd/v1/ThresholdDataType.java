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
 * <p>Java class for ThresholdDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ThresholdDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="thresholdId" type="{http://docs.eebus.org/spine/xsd/v1}ThresholdIdType" minOccurs="0"/&gt;
 *         &lt;element name="thresholdValue" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ThresholdDataType", propOrder = {
    "thresholdId",
    "thresholdValue"
})
public class ThresholdDataType implements Cloneable, CopyTo, ToString
{

    @XmlSchemaType(name = "unsignedInt")
    protected Long thresholdId;
    protected ScaledNumberType thresholdValue;

    /**
     * Default no-arg constructor
     * 
     */
    public ThresholdDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public ThresholdDataType(final Long thresholdId, final ScaledNumberType thresholdValue) {
        this.thresholdId = thresholdId;
        this.thresholdValue = thresholdValue;
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
     * Gets the value of the thresholdValue property.
     * 
     * @return
     *     possible object is
     *     {@link ScaledNumberType }
     *     
     */
    public ScaledNumberType getThresholdValue() {
        return thresholdValue;
    }

    /**
     * Sets the value of the thresholdValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberType }
     *     
     */
    public void setThresholdValue(ScaledNumberType value) {
        this.thresholdValue = value;
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
    public ThresholdDataType withThresholdId(Long value) {
        setThresholdId(value);
        return this;
    }

    /**
     * Sets the value of the thresholdValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberType }
     * @return
     *     The class instance
     */
    public ThresholdDataType withThresholdValue(ScaledNumberType value) {
        setThresholdValue(value);
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
        if (draftCopy instanceof ThresholdDataType) {
            final ThresholdDataType copy = ((ThresholdDataType) draftCopy);
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
                Boolean thresholdValueShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.thresholdValue!= null));
                if (thresholdValueShouldBeCopiedAndSet == Boolean.TRUE) {
                    ScaledNumberType sourceThresholdValue;
                    sourceThresholdValue = this.getThresholdValue();
                    ScaledNumberType copyThresholdValue = ((ScaledNumberType) strategy.copy(LocatorUtils.property(locator, "thresholdValue", sourceThresholdValue), sourceThresholdValue, (this.thresholdValue!= null)));
                    copy.setThresholdValue(copyThresholdValue);
                } else {
                    if (thresholdValueShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.thresholdValue = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new ThresholdDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ThresholdDataType that = ((ThresholdDataType) object);
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
            ScaledNumberType leftThresholdValue;
            leftThresholdValue = this.getThresholdValue();
            ScaledNumberType rightThresholdValue;
            rightThresholdValue = that.getThresholdValue();
            if (this.thresholdValue!= null) {
                if (that.thresholdValue!= null) {
                    if (!leftThresholdValue.equals(rightThresholdValue)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.thresholdValue!= null) {
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
            Long theThresholdId;
            theThresholdId = this.getThresholdId();
            if (this.thresholdId!= null) {
                currentHashCode += theThresholdId.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ScaledNumberType theThresholdValue;
            theThresholdValue = this.getThresholdValue();
            if (this.thresholdValue!= null) {
                currentHashCode += theThresholdValue.hashCode();
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
            Long theThresholdId;
            theThresholdId = this.getThresholdId();
            strategy.appendField(locator, this, "thresholdId", buffer, theThresholdId, (this.thresholdId!= null));
        }
        {
            ScaledNumberType theThresholdValue;
            theThresholdValue = this.getThresholdValue();
            strategy.appendField(locator, this, "thresholdValue", buffer, theThresholdValue, (this.thresholdValue!= null));
        }
        return buffer;
    }

}
