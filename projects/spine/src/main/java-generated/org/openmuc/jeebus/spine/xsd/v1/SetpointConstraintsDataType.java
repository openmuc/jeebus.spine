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
 * <p>Java class for SetpointConstraintsDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SetpointConstraintsDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="setpointId" type="{http://docs.eebus.org/spine/xsd/v1}SetpointIdType" minOccurs="0"/&gt;
 *         &lt;element name="setpointRangeMin" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberType" minOccurs="0"/&gt;
 *         &lt;element name="setpointRangeMax" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberType" minOccurs="0"/&gt;
 *         &lt;element name="setpointStepSize" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetpointConstraintsDataType", propOrder = {
    "setpointId",
    "setpointRangeMin",
    "setpointRangeMax",
    "setpointStepSize"
})
public class SetpointConstraintsDataType implements Cloneable, CopyTo, ToString
{

    @XmlSchemaType(name = "unsignedInt")
    protected Long setpointId;
    protected ScaledNumberType setpointRangeMin;
    protected ScaledNumberType setpointRangeMax;
    protected ScaledNumberType setpointStepSize;

    /**
     * Default no-arg constructor
     * 
     */
    public SetpointConstraintsDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public SetpointConstraintsDataType(final Long setpointId, final ScaledNumberType setpointRangeMin, final ScaledNumberType setpointRangeMax, final ScaledNumberType setpointStepSize) {
        this.setpointId = setpointId;
        this.setpointRangeMin = setpointRangeMin;
        this.setpointRangeMax = setpointRangeMax;
        this.setpointStepSize = setpointStepSize;
    }

    /**
     * Gets the value of the setpointId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSetpointId() {
        return setpointId;
    }

    /**
     * Sets the value of the setpointId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSetpointId(Long value) {
        this.setpointId = value;
    }

    /**
     * Gets the value of the setpointRangeMin property.
     * 
     * @return
     *     possible object is
     *     {@link ScaledNumberType }
     *     
     */
    public ScaledNumberType getSetpointRangeMin() {
        return setpointRangeMin;
    }

    /**
     * Sets the value of the setpointRangeMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberType }
     *     
     */
    public void setSetpointRangeMin(ScaledNumberType value) {
        this.setpointRangeMin = value;
    }

    /**
     * Gets the value of the setpointRangeMax property.
     * 
     * @return
     *     possible object is
     *     {@link ScaledNumberType }
     *     
     */
    public ScaledNumberType getSetpointRangeMax() {
        return setpointRangeMax;
    }

    /**
     * Sets the value of the setpointRangeMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberType }
     *     
     */
    public void setSetpointRangeMax(ScaledNumberType value) {
        this.setpointRangeMax = value;
    }

    /**
     * Gets the value of the setpointStepSize property.
     * 
     * @return
     *     possible object is
     *     {@link ScaledNumberType }
     *     
     */
    public ScaledNumberType getSetpointStepSize() {
        return setpointStepSize;
    }

    /**
     * Sets the value of the setpointStepSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberType }
     *     
     */
    public void setSetpointStepSize(ScaledNumberType value) {
        this.setpointStepSize = value;
    }

    /**
     * Sets the value of the setpointId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     * @return
     *     The class instance
     */
    public SetpointConstraintsDataType withSetpointId(Long value) {
        setSetpointId(value);
        return this;
    }

    /**
     * Sets the value of the setpointRangeMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberType }
     * @return
     *     The class instance
     */
    public SetpointConstraintsDataType withSetpointRangeMin(ScaledNumberType value) {
        setSetpointRangeMin(value);
        return this;
    }

    /**
     * Sets the value of the setpointRangeMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberType }
     * @return
     *     The class instance
     */
    public SetpointConstraintsDataType withSetpointRangeMax(ScaledNumberType value) {
        setSetpointRangeMax(value);
        return this;
    }

    /**
     * Sets the value of the setpointStepSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberType }
     * @return
     *     The class instance
     */
    public SetpointConstraintsDataType withSetpointStepSize(ScaledNumberType value) {
        setSetpointStepSize(value);
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
        if (draftCopy instanceof SetpointConstraintsDataType) {
            final SetpointConstraintsDataType copy = ((SetpointConstraintsDataType) draftCopy);
            {
                Boolean setpointIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.setpointId!= null));
                if (setpointIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceSetpointId;
                    sourceSetpointId = this.getSetpointId();
                    Long copySetpointId = ((Long) strategy.copy(LocatorUtils.property(locator, "setpointId", sourceSetpointId), sourceSetpointId, (this.setpointId!= null)));
                    copy.setSetpointId(copySetpointId);
                } else {
                    if (setpointIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.setpointId = null;
                    }
                }
            }
            {
                Boolean setpointRangeMinShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.setpointRangeMin!= null));
                if (setpointRangeMinShouldBeCopiedAndSet == Boolean.TRUE) {
                    ScaledNumberType sourceSetpointRangeMin;
                    sourceSetpointRangeMin = this.getSetpointRangeMin();
                    ScaledNumberType copySetpointRangeMin = ((ScaledNumberType) strategy.copy(LocatorUtils.property(locator, "setpointRangeMin", sourceSetpointRangeMin), sourceSetpointRangeMin, (this.setpointRangeMin!= null)));
                    copy.setSetpointRangeMin(copySetpointRangeMin);
                } else {
                    if (setpointRangeMinShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.setpointRangeMin = null;
                    }
                }
            }
            {
                Boolean setpointRangeMaxShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.setpointRangeMax!= null));
                if (setpointRangeMaxShouldBeCopiedAndSet == Boolean.TRUE) {
                    ScaledNumberType sourceSetpointRangeMax;
                    sourceSetpointRangeMax = this.getSetpointRangeMax();
                    ScaledNumberType copySetpointRangeMax = ((ScaledNumberType) strategy.copy(LocatorUtils.property(locator, "setpointRangeMax", sourceSetpointRangeMax), sourceSetpointRangeMax, (this.setpointRangeMax!= null)));
                    copy.setSetpointRangeMax(copySetpointRangeMax);
                } else {
                    if (setpointRangeMaxShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.setpointRangeMax = null;
                    }
                }
            }
            {
                Boolean setpointStepSizeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.setpointStepSize!= null));
                if (setpointStepSizeShouldBeCopiedAndSet == Boolean.TRUE) {
                    ScaledNumberType sourceSetpointStepSize;
                    sourceSetpointStepSize = this.getSetpointStepSize();
                    ScaledNumberType copySetpointStepSize = ((ScaledNumberType) strategy.copy(LocatorUtils.property(locator, "setpointStepSize", sourceSetpointStepSize), sourceSetpointStepSize, (this.setpointStepSize!= null)));
                    copy.setSetpointStepSize(copySetpointStepSize);
                } else {
                    if (setpointStepSizeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.setpointStepSize = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new SetpointConstraintsDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final SetpointConstraintsDataType that = ((SetpointConstraintsDataType) object);
        {
            Long leftSetpointId;
            leftSetpointId = this.getSetpointId();
            Long rightSetpointId;
            rightSetpointId = that.getSetpointId();
            if (this.setpointId!= null) {
                if (that.setpointId!= null) {
                    if (!leftSetpointId.equals(rightSetpointId)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.setpointId!= null) {
                    return false;
                }
            }
        }
        {
            ScaledNumberType leftSetpointRangeMin;
            leftSetpointRangeMin = this.getSetpointRangeMin();
            ScaledNumberType rightSetpointRangeMin;
            rightSetpointRangeMin = that.getSetpointRangeMin();
            if (this.setpointRangeMin!= null) {
                if (that.setpointRangeMin!= null) {
                    if (!leftSetpointRangeMin.equals(rightSetpointRangeMin)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.setpointRangeMin!= null) {
                    return false;
                }
            }
        }
        {
            ScaledNumberType leftSetpointRangeMax;
            leftSetpointRangeMax = this.getSetpointRangeMax();
            ScaledNumberType rightSetpointRangeMax;
            rightSetpointRangeMax = that.getSetpointRangeMax();
            if (this.setpointRangeMax!= null) {
                if (that.setpointRangeMax!= null) {
                    if (!leftSetpointRangeMax.equals(rightSetpointRangeMax)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.setpointRangeMax!= null) {
                    return false;
                }
            }
        }
        {
            ScaledNumberType leftSetpointStepSize;
            leftSetpointStepSize = this.getSetpointStepSize();
            ScaledNumberType rightSetpointStepSize;
            rightSetpointStepSize = that.getSetpointStepSize();
            if (this.setpointStepSize!= null) {
                if (that.setpointStepSize!= null) {
                    if (!leftSetpointStepSize.equals(rightSetpointStepSize)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.setpointStepSize!= null) {
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
            Long theSetpointId;
            theSetpointId = this.getSetpointId();
            if (this.setpointId!= null) {
                currentHashCode += theSetpointId.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ScaledNumberType theSetpointRangeMin;
            theSetpointRangeMin = this.getSetpointRangeMin();
            if (this.setpointRangeMin!= null) {
                currentHashCode += theSetpointRangeMin.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ScaledNumberType theSetpointRangeMax;
            theSetpointRangeMax = this.getSetpointRangeMax();
            if (this.setpointRangeMax!= null) {
                currentHashCode += theSetpointRangeMax.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ScaledNumberType theSetpointStepSize;
            theSetpointStepSize = this.getSetpointStepSize();
            if (this.setpointStepSize!= null) {
                currentHashCode += theSetpointStepSize.hashCode();
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
            Long theSetpointId;
            theSetpointId = this.getSetpointId();
            strategy.appendField(locator, this, "setpointId", buffer, theSetpointId, (this.setpointId!= null));
        }
        {
            ScaledNumberType theSetpointRangeMin;
            theSetpointRangeMin = this.getSetpointRangeMin();
            strategy.appendField(locator, this, "setpointRangeMin", buffer, theSetpointRangeMin, (this.setpointRangeMin!= null));
        }
        {
            ScaledNumberType theSetpointRangeMax;
            theSetpointRangeMax = this.getSetpointRangeMax();
            strategy.appendField(locator, this, "setpointRangeMax", buffer, theSetpointRangeMax, (this.setpointRangeMax!= null));
        }
        {
            ScaledNumberType theSetpointStepSize;
            theSetpointStepSize = this.getSetpointStepSize();
            strategy.appendField(locator, this, "setpointStepSize", buffer, theSetpointStepSize, (this.setpointStepSize!= null));
        }
        return buffer;
    }

}
