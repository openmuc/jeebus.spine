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
 * <p>Java class for ScaledNumberType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScaledNumberType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="number" type="{http://docs.eebus.org/spine/xsd/v1}NumberType" minOccurs="0"/&gt;
 *         &lt;element name="scale" type="{http://docs.eebus.org/spine/xsd/v1}ScaleType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScaledNumberType", propOrder = {
    "number",
    "scale"
})
public class ScaledNumberType implements Cloneable, CopyTo, ToString
{

    protected Long number;
    protected Short scale;

    /**
     * Default no-arg constructor
     * 
     */
    public ScaledNumberType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public ScaledNumberType(final Long number, final Short scale) {
        this.number = number;
        this.scale = scale;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumber(Long value) {
        this.number = value;
    }

    /**
     * Gets the value of the scale property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getScale() {
        return scale;
    }

    /**
     * Sets the value of the scale property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setScale(Short value) {
        this.scale = value;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     * @return
     *     The class instance
     */
    public ScaledNumberType withNumber(Long value) {
        setNumber(value);
        return this;
    }

    /**
     * Sets the value of the scale property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     * @return
     *     The class instance
     */
    public ScaledNumberType withScale(Short value) {
        setScale(value);
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
        if (draftCopy instanceof ScaledNumberType) {
            final ScaledNumberType copy = ((ScaledNumberType) draftCopy);
            {
                Boolean numberShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.number!= null));
                if (numberShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceNumber;
                    sourceNumber = this.getNumber();
                    Long copyNumber = ((Long) strategy.copy(LocatorUtils.property(locator, "number", sourceNumber), sourceNumber, (this.number!= null)));
                    copy.setNumber(copyNumber);
                } else {
                    if (numberShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.number = null;
                    }
                }
            }
            {
                Boolean scaleShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.scale!= null));
                if (scaleShouldBeCopiedAndSet == Boolean.TRUE) {
                    Short sourceScale;
                    sourceScale = this.getScale();
                    Short copyScale = ((Short) strategy.copy(LocatorUtils.property(locator, "scale", sourceScale), sourceScale, (this.scale!= null)));
                    copy.setScale(copyScale);
                } else {
                    if (scaleShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.scale = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new ScaledNumberType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ScaledNumberType that = ((ScaledNumberType) object);
        {
            Long leftNumber;
            leftNumber = this.getNumber();
            Long rightNumber;
            rightNumber = that.getNumber();
            if (this.number!= null) {
                if (that.number!= null) {
                    if (!leftNumber.equals(rightNumber)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.number!= null) {
                    return false;
                }
            }
        }
        {
            Short leftScale;
            leftScale = this.getScale();
            Short rightScale;
            rightScale = that.getScale();
            if (this.scale!= null) {
                if (that.scale!= null) {
                    if (!leftScale.equals(rightScale)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.scale!= null) {
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
            Long theNumber;
            theNumber = this.getNumber();
            if (this.number!= null) {
                currentHashCode += theNumber.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            Short theScale;
            theScale = this.getScale();
            if (this.scale!= null) {
                currentHashCode += theScale.hashCode();
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
            Long theNumber;
            theNumber = this.getNumber();
            strategy.appendField(locator, this, "number", buffer, theNumber, (this.number!= null));
        }
        {
            Short theScale;
            theScale = this.getScale();
            strategy.appendField(locator, this, "scale", buffer, theScale, (this.scale!= null));
        }
        return buffer;
    }

}
