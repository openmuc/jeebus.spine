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
 * <p>Java class for ScaledNumberElementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScaledNumberElementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="number" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="scale" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScaledNumberElementsType", propOrder = {
    "number",
    "scale"
})
public class ScaledNumberElementsType implements Cloneable, CopyTo, ToString
{

    protected ElementTagType number;
    protected ElementTagType scale;

    /**
     * Default no-arg constructor
     * 
     */
    public ScaledNumberElementsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public ScaledNumberElementsType(final ElementTagType number, final ElementTagType scale) {
        this.number = number;
        this.scale = scale;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setNumber(ElementTagType value) {
        this.number = value;
    }

    /**
     * Gets the value of the scale property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getScale() {
        return scale;
    }

    /**
     * Sets the value of the scale property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setScale(ElementTagType value) {
        this.scale = value;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public ScaledNumberElementsType withNumber(ElementTagType value) {
        setNumber(value);
        return this;
    }

    /**
     * Sets the value of the scale property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public ScaledNumberElementsType withScale(ElementTagType value) {
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
        if (draftCopy instanceof ScaledNumberElementsType) {
            final ScaledNumberElementsType copy = ((ScaledNumberElementsType) draftCopy);
            {
                Boolean numberShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.number!= null));
                if (numberShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceNumber;
                    sourceNumber = this.getNumber();
                    ElementTagType copyNumber = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "number", sourceNumber), sourceNumber, (this.number!= null)));
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
                    ElementTagType sourceScale;
                    sourceScale = this.getScale();
                    ElementTagType copyScale = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "scale", sourceScale), sourceScale, (this.scale!= null)));
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
        return new ScaledNumberElementsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ScaledNumberElementsType that = ((ScaledNumberElementsType) object);
        {
            ElementTagType leftNumber;
            leftNumber = this.getNumber();
            ElementTagType rightNumber;
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
            ElementTagType leftScale;
            leftScale = this.getScale();
            ElementTagType rightScale;
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
            ElementTagType theNumber;
            theNumber = this.getNumber();
            if (this.number!= null) {
                currentHashCode += theNumber.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theScale;
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
            ElementTagType theNumber;
            theNumber = this.getNumber();
            strategy.appendField(locator, this, "number", buffer, theNumber, (this.number!= null));
        }
        {
            ElementTagType theScale;
            theScale = this.getScale();
            strategy.appendField(locator, this, "scale", buffer, theScale, (this.scale!= null));
        }
        return buffer;
    }

}
