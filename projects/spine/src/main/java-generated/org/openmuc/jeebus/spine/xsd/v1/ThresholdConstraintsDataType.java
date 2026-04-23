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
 * <p>Java class for ThresholdConstraintsDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ThresholdConstraintsDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="thresholdId" type="{http://docs.eebus.org/spine/xsd/v1}ThresholdIdType" minOccurs="0"/&gt;
 *         &lt;element name="thresholdRangeMin" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberType" minOccurs="0"/&gt;
 *         &lt;element name="thresholdRangeMax" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberType" minOccurs="0"/&gt;
 *         &lt;element name="thresholdStepSize" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ThresholdConstraintsDataType", propOrder = {
    "thresholdId",
    "thresholdRangeMin",
    "thresholdRangeMax",
    "thresholdStepSize"
})
public class ThresholdConstraintsDataType implements Cloneable, CopyTo, ToString
{

    @XmlSchemaType(name = "unsignedInt")
    protected Long thresholdId;
    protected ScaledNumberType thresholdRangeMin;
    protected ScaledNumberType thresholdRangeMax;
    protected ScaledNumberType thresholdStepSize;

    /**
     * Default no-arg constructor
     * 
     */
    public ThresholdConstraintsDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public ThresholdConstraintsDataType(final Long thresholdId, final ScaledNumberType thresholdRangeMin, final ScaledNumberType thresholdRangeMax, final ScaledNumberType thresholdStepSize) {
        this.thresholdId = thresholdId;
        this.thresholdRangeMin = thresholdRangeMin;
        this.thresholdRangeMax = thresholdRangeMax;
        this.thresholdStepSize = thresholdStepSize;
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
     * Gets the value of the thresholdRangeMin property.
     * 
     * @return
     *     possible object is
     *     {@link ScaledNumberType }
     *     
     */
    public ScaledNumberType getThresholdRangeMin() {
        return thresholdRangeMin;
    }

    /**
     * Sets the value of the thresholdRangeMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberType }
     *     
     */
    public void setThresholdRangeMin(ScaledNumberType value) {
        this.thresholdRangeMin = value;
    }

    /**
     * Gets the value of the thresholdRangeMax property.
     * 
     * @return
     *     possible object is
     *     {@link ScaledNumberType }
     *     
     */
    public ScaledNumberType getThresholdRangeMax() {
        return thresholdRangeMax;
    }

    /**
     * Sets the value of the thresholdRangeMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberType }
     *     
     */
    public void setThresholdRangeMax(ScaledNumberType value) {
        this.thresholdRangeMax = value;
    }

    /**
     * Gets the value of the thresholdStepSize property.
     * 
     * @return
     *     possible object is
     *     {@link ScaledNumberType }
     *     
     */
    public ScaledNumberType getThresholdStepSize() {
        return thresholdStepSize;
    }

    /**
     * Sets the value of the thresholdStepSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberType }
     *     
     */
    public void setThresholdStepSize(ScaledNumberType value) {
        this.thresholdStepSize = value;
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
    public ThresholdConstraintsDataType withThresholdId(Long value) {
        setThresholdId(value);
        return this;
    }

    /**
     * Sets the value of the thresholdRangeMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberType }
     * @return
     *     The class instance
     */
    public ThresholdConstraintsDataType withThresholdRangeMin(ScaledNumberType value) {
        setThresholdRangeMin(value);
        return this;
    }

    /**
     * Sets the value of the thresholdRangeMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberType }
     * @return
     *     The class instance
     */
    public ThresholdConstraintsDataType withThresholdRangeMax(ScaledNumberType value) {
        setThresholdRangeMax(value);
        return this;
    }

    /**
     * Sets the value of the thresholdStepSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberType }
     * @return
     *     The class instance
     */
    public ThresholdConstraintsDataType withThresholdStepSize(ScaledNumberType value) {
        setThresholdStepSize(value);
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
        if (draftCopy instanceof ThresholdConstraintsDataType) {
            final ThresholdConstraintsDataType copy = ((ThresholdConstraintsDataType) draftCopy);
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
                Boolean thresholdRangeMinShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.thresholdRangeMin!= null));
                if (thresholdRangeMinShouldBeCopiedAndSet == Boolean.TRUE) {
                    ScaledNumberType sourceThresholdRangeMin;
                    sourceThresholdRangeMin = this.getThresholdRangeMin();
                    ScaledNumberType copyThresholdRangeMin = ((ScaledNumberType) strategy.copy(LocatorUtils.property(locator, "thresholdRangeMin", sourceThresholdRangeMin), sourceThresholdRangeMin, (this.thresholdRangeMin!= null)));
                    copy.setThresholdRangeMin(copyThresholdRangeMin);
                } else {
                    if (thresholdRangeMinShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.thresholdRangeMin = null;
                    }
                }
            }
            {
                Boolean thresholdRangeMaxShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.thresholdRangeMax!= null));
                if (thresholdRangeMaxShouldBeCopiedAndSet == Boolean.TRUE) {
                    ScaledNumberType sourceThresholdRangeMax;
                    sourceThresholdRangeMax = this.getThresholdRangeMax();
                    ScaledNumberType copyThresholdRangeMax = ((ScaledNumberType) strategy.copy(LocatorUtils.property(locator, "thresholdRangeMax", sourceThresholdRangeMax), sourceThresholdRangeMax, (this.thresholdRangeMax!= null)));
                    copy.setThresholdRangeMax(copyThresholdRangeMax);
                } else {
                    if (thresholdRangeMaxShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.thresholdRangeMax = null;
                    }
                }
            }
            {
                Boolean thresholdStepSizeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.thresholdStepSize!= null));
                if (thresholdStepSizeShouldBeCopiedAndSet == Boolean.TRUE) {
                    ScaledNumberType sourceThresholdStepSize;
                    sourceThresholdStepSize = this.getThresholdStepSize();
                    ScaledNumberType copyThresholdStepSize = ((ScaledNumberType) strategy.copy(LocatorUtils.property(locator, "thresholdStepSize", sourceThresholdStepSize), sourceThresholdStepSize, (this.thresholdStepSize!= null)));
                    copy.setThresholdStepSize(copyThresholdStepSize);
                } else {
                    if (thresholdStepSizeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.thresholdStepSize = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new ThresholdConstraintsDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ThresholdConstraintsDataType that = ((ThresholdConstraintsDataType) object);
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
            ScaledNumberType leftThresholdRangeMin;
            leftThresholdRangeMin = this.getThresholdRangeMin();
            ScaledNumberType rightThresholdRangeMin;
            rightThresholdRangeMin = that.getThresholdRangeMin();
            if (this.thresholdRangeMin!= null) {
                if (that.thresholdRangeMin!= null) {
                    if (!leftThresholdRangeMin.equals(rightThresholdRangeMin)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.thresholdRangeMin!= null) {
                    return false;
                }
            }
        }
        {
            ScaledNumberType leftThresholdRangeMax;
            leftThresholdRangeMax = this.getThresholdRangeMax();
            ScaledNumberType rightThresholdRangeMax;
            rightThresholdRangeMax = that.getThresholdRangeMax();
            if (this.thresholdRangeMax!= null) {
                if (that.thresholdRangeMax!= null) {
                    if (!leftThresholdRangeMax.equals(rightThresholdRangeMax)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.thresholdRangeMax!= null) {
                    return false;
                }
            }
        }
        {
            ScaledNumberType leftThresholdStepSize;
            leftThresholdStepSize = this.getThresholdStepSize();
            ScaledNumberType rightThresholdStepSize;
            rightThresholdStepSize = that.getThresholdStepSize();
            if (this.thresholdStepSize!= null) {
                if (that.thresholdStepSize!= null) {
                    if (!leftThresholdStepSize.equals(rightThresholdStepSize)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.thresholdStepSize!= null) {
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
            ScaledNumberType theThresholdRangeMin;
            theThresholdRangeMin = this.getThresholdRangeMin();
            if (this.thresholdRangeMin!= null) {
                currentHashCode += theThresholdRangeMin.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ScaledNumberType theThresholdRangeMax;
            theThresholdRangeMax = this.getThresholdRangeMax();
            if (this.thresholdRangeMax!= null) {
                currentHashCode += theThresholdRangeMax.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ScaledNumberType theThresholdStepSize;
            theThresholdStepSize = this.getThresholdStepSize();
            if (this.thresholdStepSize!= null) {
                currentHashCode += theThresholdStepSize.hashCode();
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
            ScaledNumberType theThresholdRangeMin;
            theThresholdRangeMin = this.getThresholdRangeMin();
            strategy.appendField(locator, this, "thresholdRangeMin", buffer, theThresholdRangeMin, (this.thresholdRangeMin!= null));
        }
        {
            ScaledNumberType theThresholdRangeMax;
            theThresholdRangeMax = this.getThresholdRangeMax();
            strategy.appendField(locator, this, "thresholdRangeMax", buffer, theThresholdRangeMax, (this.thresholdRangeMax!= null));
        }
        {
            ScaledNumberType theThresholdStepSize;
            theThresholdStepSize = this.getThresholdStepSize();
            strategy.appendField(locator, this, "thresholdStepSize", buffer, theThresholdStepSize, (this.thresholdStepSize!= null));
        }
        return buffer;
    }

}
