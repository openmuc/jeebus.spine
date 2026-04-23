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
 * <p>Java class for MeasurementConstraintsDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MeasurementConstraintsDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="measurementId" type="{http://docs.eebus.org/spine/xsd/v1}MeasurementIdType" minOccurs="0"/&gt;
 *         &lt;element name="valueRangeMin" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberType" minOccurs="0"/&gt;
 *         &lt;element name="valueRangeMax" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberType" minOccurs="0"/&gt;
 *         &lt;element name="valueStepSize" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeasurementConstraintsDataType", propOrder = {
    "measurementId",
    "valueRangeMin",
    "valueRangeMax",
    "valueStepSize"
})
public class MeasurementConstraintsDataType implements Cloneable, CopyTo, ToString
{

    @XmlSchemaType(name = "unsignedInt")
    protected Long measurementId;
    protected ScaledNumberType valueRangeMin;
    protected ScaledNumberType valueRangeMax;
    protected ScaledNumberType valueStepSize;

    /**
     * Default no-arg constructor
     * 
     */
    public MeasurementConstraintsDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public MeasurementConstraintsDataType(final Long measurementId, final ScaledNumberType valueRangeMin, final ScaledNumberType valueRangeMax, final ScaledNumberType valueStepSize) {
        this.measurementId = measurementId;
        this.valueRangeMin = valueRangeMin;
        this.valueRangeMax = valueRangeMax;
        this.valueStepSize = valueStepSize;
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
     * Gets the value of the valueRangeMin property.
     * 
     * @return
     *     possible object is
     *     {@link ScaledNumberType }
     *     
     */
    public ScaledNumberType getValueRangeMin() {
        return valueRangeMin;
    }

    /**
     * Sets the value of the valueRangeMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberType }
     *     
     */
    public void setValueRangeMin(ScaledNumberType value) {
        this.valueRangeMin = value;
    }

    /**
     * Gets the value of the valueRangeMax property.
     * 
     * @return
     *     possible object is
     *     {@link ScaledNumberType }
     *     
     */
    public ScaledNumberType getValueRangeMax() {
        return valueRangeMax;
    }

    /**
     * Sets the value of the valueRangeMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberType }
     *     
     */
    public void setValueRangeMax(ScaledNumberType value) {
        this.valueRangeMax = value;
    }

    /**
     * Gets the value of the valueStepSize property.
     * 
     * @return
     *     possible object is
     *     {@link ScaledNumberType }
     *     
     */
    public ScaledNumberType getValueStepSize() {
        return valueStepSize;
    }

    /**
     * Sets the value of the valueStepSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberType }
     *     
     */
    public void setValueStepSize(ScaledNumberType value) {
        this.valueStepSize = value;
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
    public MeasurementConstraintsDataType withMeasurementId(Long value) {
        setMeasurementId(value);
        return this;
    }

    /**
     * Sets the value of the valueRangeMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberType }
     * @return
     *     The class instance
     */
    public MeasurementConstraintsDataType withValueRangeMin(ScaledNumberType value) {
        setValueRangeMin(value);
        return this;
    }

    /**
     * Sets the value of the valueRangeMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberType }
     * @return
     *     The class instance
     */
    public MeasurementConstraintsDataType withValueRangeMax(ScaledNumberType value) {
        setValueRangeMax(value);
        return this;
    }

    /**
     * Sets the value of the valueStepSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberType }
     * @return
     *     The class instance
     */
    public MeasurementConstraintsDataType withValueStepSize(ScaledNumberType value) {
        setValueStepSize(value);
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
        if (draftCopy instanceof MeasurementConstraintsDataType) {
            final MeasurementConstraintsDataType copy = ((MeasurementConstraintsDataType) draftCopy);
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
                Boolean valueRangeMinShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.valueRangeMin!= null));
                if (valueRangeMinShouldBeCopiedAndSet == Boolean.TRUE) {
                    ScaledNumberType sourceValueRangeMin;
                    sourceValueRangeMin = this.getValueRangeMin();
                    ScaledNumberType copyValueRangeMin = ((ScaledNumberType) strategy.copy(LocatorUtils.property(locator, "valueRangeMin", sourceValueRangeMin), sourceValueRangeMin, (this.valueRangeMin!= null)));
                    copy.setValueRangeMin(copyValueRangeMin);
                } else {
                    if (valueRangeMinShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.valueRangeMin = null;
                    }
                }
            }
            {
                Boolean valueRangeMaxShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.valueRangeMax!= null));
                if (valueRangeMaxShouldBeCopiedAndSet == Boolean.TRUE) {
                    ScaledNumberType sourceValueRangeMax;
                    sourceValueRangeMax = this.getValueRangeMax();
                    ScaledNumberType copyValueRangeMax = ((ScaledNumberType) strategy.copy(LocatorUtils.property(locator, "valueRangeMax", sourceValueRangeMax), sourceValueRangeMax, (this.valueRangeMax!= null)));
                    copy.setValueRangeMax(copyValueRangeMax);
                } else {
                    if (valueRangeMaxShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.valueRangeMax = null;
                    }
                }
            }
            {
                Boolean valueStepSizeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.valueStepSize!= null));
                if (valueStepSizeShouldBeCopiedAndSet == Boolean.TRUE) {
                    ScaledNumberType sourceValueStepSize;
                    sourceValueStepSize = this.getValueStepSize();
                    ScaledNumberType copyValueStepSize = ((ScaledNumberType) strategy.copy(LocatorUtils.property(locator, "valueStepSize", sourceValueStepSize), sourceValueStepSize, (this.valueStepSize!= null)));
                    copy.setValueStepSize(copyValueStepSize);
                } else {
                    if (valueStepSizeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.valueStepSize = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new MeasurementConstraintsDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final MeasurementConstraintsDataType that = ((MeasurementConstraintsDataType) object);
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
            ScaledNumberType leftValueRangeMin;
            leftValueRangeMin = this.getValueRangeMin();
            ScaledNumberType rightValueRangeMin;
            rightValueRangeMin = that.getValueRangeMin();
            if (this.valueRangeMin!= null) {
                if (that.valueRangeMin!= null) {
                    if (!leftValueRangeMin.equals(rightValueRangeMin)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.valueRangeMin!= null) {
                    return false;
                }
            }
        }
        {
            ScaledNumberType leftValueRangeMax;
            leftValueRangeMax = this.getValueRangeMax();
            ScaledNumberType rightValueRangeMax;
            rightValueRangeMax = that.getValueRangeMax();
            if (this.valueRangeMax!= null) {
                if (that.valueRangeMax!= null) {
                    if (!leftValueRangeMax.equals(rightValueRangeMax)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.valueRangeMax!= null) {
                    return false;
                }
            }
        }
        {
            ScaledNumberType leftValueStepSize;
            leftValueStepSize = this.getValueStepSize();
            ScaledNumberType rightValueStepSize;
            rightValueStepSize = that.getValueStepSize();
            if (this.valueStepSize!= null) {
                if (that.valueStepSize!= null) {
                    if (!leftValueStepSize.equals(rightValueStepSize)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.valueStepSize!= null) {
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
            ScaledNumberType theValueRangeMin;
            theValueRangeMin = this.getValueRangeMin();
            if (this.valueRangeMin!= null) {
                currentHashCode += theValueRangeMin.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ScaledNumberType theValueRangeMax;
            theValueRangeMax = this.getValueRangeMax();
            if (this.valueRangeMax!= null) {
                currentHashCode += theValueRangeMax.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ScaledNumberType theValueStepSize;
            theValueStepSize = this.getValueStepSize();
            if (this.valueStepSize!= null) {
                currentHashCode += theValueStepSize.hashCode();
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
            ScaledNumberType theValueRangeMin;
            theValueRangeMin = this.getValueRangeMin();
            strategy.appendField(locator, this, "valueRangeMin", buffer, theValueRangeMin, (this.valueRangeMin!= null));
        }
        {
            ScaledNumberType theValueRangeMax;
            theValueRangeMax = this.getValueRangeMax();
            strategy.appendField(locator, this, "valueRangeMax", buffer, theValueRangeMax, (this.valueRangeMax!= null));
        }
        {
            ScaledNumberType theValueStepSize;
            theValueStepSize = this.getValueStepSize();
            strategy.appendField(locator, this, "valueStepSize", buffer, theValueStepSize, (this.valueStepSize!= null));
        }
        return buffer;
    }

}
