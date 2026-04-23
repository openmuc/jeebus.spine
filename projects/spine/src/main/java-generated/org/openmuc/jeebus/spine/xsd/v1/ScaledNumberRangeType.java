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
 * <p>Java class for ScaledNumberRangeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScaledNumberRangeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="min" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberType" minOccurs="0"/&gt;
 *         &lt;element name="max" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScaledNumberRangeType", propOrder = {
    "min",
    "max"
})
public class ScaledNumberRangeType implements Cloneable, CopyTo, ToString
{

    protected ScaledNumberType min;
    protected ScaledNumberType max;

    /**
     * Default no-arg constructor
     * 
     */
    public ScaledNumberRangeType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public ScaledNumberRangeType(final ScaledNumberType min, final ScaledNumberType max) {
        this.min = min;
        this.max = max;
    }

    /**
     * Gets the value of the min property.
     * 
     * @return
     *     possible object is
     *     {@link ScaledNumberType }
     *     
     */
    public ScaledNumberType getMin() {
        return min;
    }

    /**
     * Sets the value of the min property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberType }
     *     
     */
    public void setMin(ScaledNumberType value) {
        this.min = value;
    }

    /**
     * Gets the value of the max property.
     * 
     * @return
     *     possible object is
     *     {@link ScaledNumberType }
     *     
     */
    public ScaledNumberType getMax() {
        return max;
    }

    /**
     * Sets the value of the max property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberType }
     *     
     */
    public void setMax(ScaledNumberType value) {
        this.max = value;
    }

    /**
     * Sets the value of the min property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberType }
     * @return
     *     The class instance
     */
    public ScaledNumberRangeType withMin(ScaledNumberType value) {
        setMin(value);
        return this;
    }

    /**
     * Sets the value of the max property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberType }
     * @return
     *     The class instance
     */
    public ScaledNumberRangeType withMax(ScaledNumberType value) {
        setMax(value);
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
        if (draftCopy instanceof ScaledNumberRangeType) {
            final ScaledNumberRangeType copy = ((ScaledNumberRangeType) draftCopy);
            {
                Boolean minShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.min!= null));
                if (minShouldBeCopiedAndSet == Boolean.TRUE) {
                    ScaledNumberType sourceMin;
                    sourceMin = this.getMin();
                    ScaledNumberType copyMin = ((ScaledNumberType) strategy.copy(LocatorUtils.property(locator, "min", sourceMin), sourceMin, (this.min!= null)));
                    copy.setMin(copyMin);
                } else {
                    if (minShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.min = null;
                    }
                }
            }
            {
                Boolean maxShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.max!= null));
                if (maxShouldBeCopiedAndSet == Boolean.TRUE) {
                    ScaledNumberType sourceMax;
                    sourceMax = this.getMax();
                    ScaledNumberType copyMax = ((ScaledNumberType) strategy.copy(LocatorUtils.property(locator, "max", sourceMax), sourceMax, (this.max!= null)));
                    copy.setMax(copyMax);
                } else {
                    if (maxShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.max = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new ScaledNumberRangeType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ScaledNumberRangeType that = ((ScaledNumberRangeType) object);
        {
            ScaledNumberType leftMin;
            leftMin = this.getMin();
            ScaledNumberType rightMin;
            rightMin = that.getMin();
            if (this.min!= null) {
                if (that.min!= null) {
                    if (!leftMin.equals(rightMin)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.min!= null) {
                    return false;
                }
            }
        }
        {
            ScaledNumberType leftMax;
            leftMax = this.getMax();
            ScaledNumberType rightMax;
            rightMax = that.getMax();
            if (this.max!= null) {
                if (that.max!= null) {
                    if (!leftMax.equals(rightMax)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.max!= null) {
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
            ScaledNumberType theMin;
            theMin = this.getMin();
            if (this.min!= null) {
                currentHashCode += theMin.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ScaledNumberType theMax;
            theMax = this.getMax();
            if (this.max!= null) {
                currentHashCode += theMax.hashCode();
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
            ScaledNumberType theMin;
            theMin = this.getMin();
            strategy.appendField(locator, this, "min", buffer, theMin, (this.min!= null));
        }
        {
            ScaledNumberType theMax;
            theMax = this.getMax();
            strategy.appendField(locator, this, "max", buffer, theMax, (this.max!= null));
        }
        return buffer;
    }

}
