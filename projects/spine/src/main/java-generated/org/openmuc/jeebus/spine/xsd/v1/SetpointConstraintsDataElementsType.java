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
 * <p>Java class for SetpointConstraintsDataElementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SetpointConstraintsDataElementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="setpointId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="setpointRangeMin" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberElementsType" minOccurs="0"/&gt;
 *         &lt;element name="setpointRangeMax" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberElementsType" minOccurs="0"/&gt;
 *         &lt;element name="setpointStepSize" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberElementsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetpointConstraintsDataElementsType", propOrder = {
    "setpointId",
    "setpointRangeMin",
    "setpointRangeMax",
    "setpointStepSize"
})
public class SetpointConstraintsDataElementsType implements Cloneable, CopyTo, ToString
{

    protected ElementTagType setpointId;
    protected ScaledNumberElementsType setpointRangeMin;
    protected ScaledNumberElementsType setpointRangeMax;
    protected ScaledNumberElementsType setpointStepSize;

    /**
     * Default no-arg constructor
     * 
     */
    public SetpointConstraintsDataElementsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public SetpointConstraintsDataElementsType(final ElementTagType setpointId, final ScaledNumberElementsType setpointRangeMin, final ScaledNumberElementsType setpointRangeMax, final ScaledNumberElementsType setpointStepSize) {
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
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getSetpointId() {
        return setpointId;
    }

    /**
     * Sets the value of the setpointId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setSetpointId(ElementTagType value) {
        this.setpointId = value;
    }

    /**
     * Gets the value of the setpointRangeMin property.
     * 
     * @return
     *     possible object is
     *     {@link ScaledNumberElementsType }
     *     
     */
    public ScaledNumberElementsType getSetpointRangeMin() {
        return setpointRangeMin;
    }

    /**
     * Sets the value of the setpointRangeMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberElementsType }
     *     
     */
    public void setSetpointRangeMin(ScaledNumberElementsType value) {
        this.setpointRangeMin = value;
    }

    /**
     * Gets the value of the setpointRangeMax property.
     * 
     * @return
     *     possible object is
     *     {@link ScaledNumberElementsType }
     *     
     */
    public ScaledNumberElementsType getSetpointRangeMax() {
        return setpointRangeMax;
    }

    /**
     * Sets the value of the setpointRangeMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberElementsType }
     *     
     */
    public void setSetpointRangeMax(ScaledNumberElementsType value) {
        this.setpointRangeMax = value;
    }

    /**
     * Gets the value of the setpointStepSize property.
     * 
     * @return
     *     possible object is
     *     {@link ScaledNumberElementsType }
     *     
     */
    public ScaledNumberElementsType getSetpointStepSize() {
        return setpointStepSize;
    }

    /**
     * Sets the value of the setpointStepSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberElementsType }
     *     
     */
    public void setSetpointStepSize(ScaledNumberElementsType value) {
        this.setpointStepSize = value;
    }

    /**
     * Sets the value of the setpointId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public SetpointConstraintsDataElementsType withSetpointId(ElementTagType value) {
        setSetpointId(value);
        return this;
    }

    /**
     * Sets the value of the setpointRangeMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberElementsType }
     * @return
     *     The class instance
     */
    public SetpointConstraintsDataElementsType withSetpointRangeMin(ScaledNumberElementsType value) {
        setSetpointRangeMin(value);
        return this;
    }

    /**
     * Sets the value of the setpointRangeMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberElementsType }
     * @return
     *     The class instance
     */
    public SetpointConstraintsDataElementsType withSetpointRangeMax(ScaledNumberElementsType value) {
        setSetpointRangeMax(value);
        return this;
    }

    /**
     * Sets the value of the setpointStepSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberElementsType }
     * @return
     *     The class instance
     */
    public SetpointConstraintsDataElementsType withSetpointStepSize(ScaledNumberElementsType value) {
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
        if (draftCopy instanceof SetpointConstraintsDataElementsType) {
            final SetpointConstraintsDataElementsType copy = ((SetpointConstraintsDataElementsType) draftCopy);
            {
                Boolean setpointIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.setpointId!= null));
                if (setpointIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceSetpointId;
                    sourceSetpointId = this.getSetpointId();
                    ElementTagType copySetpointId = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "setpointId", sourceSetpointId), sourceSetpointId, (this.setpointId!= null)));
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
                    ScaledNumberElementsType sourceSetpointRangeMin;
                    sourceSetpointRangeMin = this.getSetpointRangeMin();
                    ScaledNumberElementsType copySetpointRangeMin = ((ScaledNumberElementsType) strategy.copy(LocatorUtils.property(locator, "setpointRangeMin", sourceSetpointRangeMin), sourceSetpointRangeMin, (this.setpointRangeMin!= null)));
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
                    ScaledNumberElementsType sourceSetpointRangeMax;
                    sourceSetpointRangeMax = this.getSetpointRangeMax();
                    ScaledNumberElementsType copySetpointRangeMax = ((ScaledNumberElementsType) strategy.copy(LocatorUtils.property(locator, "setpointRangeMax", sourceSetpointRangeMax), sourceSetpointRangeMax, (this.setpointRangeMax!= null)));
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
                    ScaledNumberElementsType sourceSetpointStepSize;
                    sourceSetpointStepSize = this.getSetpointStepSize();
                    ScaledNumberElementsType copySetpointStepSize = ((ScaledNumberElementsType) strategy.copy(LocatorUtils.property(locator, "setpointStepSize", sourceSetpointStepSize), sourceSetpointStepSize, (this.setpointStepSize!= null)));
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
        return new SetpointConstraintsDataElementsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final SetpointConstraintsDataElementsType that = ((SetpointConstraintsDataElementsType) object);
        {
            ElementTagType leftSetpointId;
            leftSetpointId = this.getSetpointId();
            ElementTagType rightSetpointId;
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
            ScaledNumberElementsType leftSetpointRangeMin;
            leftSetpointRangeMin = this.getSetpointRangeMin();
            ScaledNumberElementsType rightSetpointRangeMin;
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
            ScaledNumberElementsType leftSetpointRangeMax;
            leftSetpointRangeMax = this.getSetpointRangeMax();
            ScaledNumberElementsType rightSetpointRangeMax;
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
            ScaledNumberElementsType leftSetpointStepSize;
            leftSetpointStepSize = this.getSetpointStepSize();
            ScaledNumberElementsType rightSetpointStepSize;
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
            ElementTagType theSetpointId;
            theSetpointId = this.getSetpointId();
            if (this.setpointId!= null) {
                currentHashCode += theSetpointId.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ScaledNumberElementsType theSetpointRangeMin;
            theSetpointRangeMin = this.getSetpointRangeMin();
            if (this.setpointRangeMin!= null) {
                currentHashCode += theSetpointRangeMin.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ScaledNumberElementsType theSetpointRangeMax;
            theSetpointRangeMax = this.getSetpointRangeMax();
            if (this.setpointRangeMax!= null) {
                currentHashCode += theSetpointRangeMax.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ScaledNumberElementsType theSetpointStepSize;
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
            ElementTagType theSetpointId;
            theSetpointId = this.getSetpointId();
            strategy.appendField(locator, this, "setpointId", buffer, theSetpointId, (this.setpointId!= null));
        }
        {
            ScaledNumberElementsType theSetpointRangeMin;
            theSetpointRangeMin = this.getSetpointRangeMin();
            strategy.appendField(locator, this, "setpointRangeMin", buffer, theSetpointRangeMin, (this.setpointRangeMin!= null));
        }
        {
            ScaledNumberElementsType theSetpointRangeMax;
            theSetpointRangeMax = this.getSetpointRangeMax();
            strategy.appendField(locator, this, "setpointRangeMax", buffer, theSetpointRangeMax, (this.setpointRangeMax!= null));
        }
        {
            ScaledNumberElementsType theSetpointStepSize;
            theSetpointStepSize = this.getSetpointStepSize();
            strategy.appendField(locator, this, "setpointStepSize", buffer, theSetpointStepSize, (this.setpointStepSize!= null));
        }
        return buffer;
    }

}
