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
 * <p>Java class for ActuatorLevelDataElementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActuatorLevelDataElementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="function" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="value" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberElementsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActuatorLevelDataElementsType", propOrder = {
    "function",
    "value"
})
public class ActuatorLevelDataElementsType implements Cloneable, CopyTo, ToString
{

    protected ElementTagType function;
    protected ScaledNumberElementsType value;

    /**
     * Default no-arg constructor
     * 
     */
    public ActuatorLevelDataElementsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public ActuatorLevelDataElementsType(final ElementTagType function, final ScaledNumberElementsType value) {
        this.function = function;
        this.value = value;
    }

    /**
     * Gets the value of the function property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getFunction() {
        return function;
    }

    /**
     * Sets the value of the function property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setFunction(ElementTagType value) {
        this.function = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link ScaledNumberElementsType }
     *     
     */
    public ScaledNumberElementsType getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberElementsType }
     *     
     */
    public void setValue(ScaledNumberElementsType value) {
        this.value = value;
    }

    /**
     * Sets the value of the function property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public ActuatorLevelDataElementsType withFunction(ElementTagType value) {
        setFunction(value);
        return this;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberElementsType }
     * @return
     *     The class instance
     */
    public ActuatorLevelDataElementsType withValue(ScaledNumberElementsType value) {
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
        if (draftCopy instanceof ActuatorLevelDataElementsType) {
            final ActuatorLevelDataElementsType copy = ((ActuatorLevelDataElementsType) draftCopy);
            {
                Boolean functionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.function!= null));
                if (functionShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceFunction;
                    sourceFunction = this.getFunction();
                    ElementTagType copyFunction = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "function", sourceFunction), sourceFunction, (this.function!= null)));
                    copy.setFunction(copyFunction);
                } else {
                    if (functionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.function = null;
                    }
                }
            }
            {
                Boolean valueShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.value!= null));
                if (valueShouldBeCopiedAndSet == Boolean.TRUE) {
                    ScaledNumberElementsType sourceValue;
                    sourceValue = this.getValue();
                    ScaledNumberElementsType copyValue = ((ScaledNumberElementsType) strategy.copy(LocatorUtils.property(locator, "value", sourceValue), sourceValue, (this.value!= null)));
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
        return new ActuatorLevelDataElementsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ActuatorLevelDataElementsType that = ((ActuatorLevelDataElementsType) object);
        {
            ElementTagType leftFunction;
            leftFunction = this.getFunction();
            ElementTagType rightFunction;
            rightFunction = that.getFunction();
            if (this.function!= null) {
                if (that.function!= null) {
                    if (!leftFunction.equals(rightFunction)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.function!= null) {
                    return false;
                }
            }
        }
        {
            ScaledNumberElementsType leftValue;
            leftValue = this.getValue();
            ScaledNumberElementsType rightValue;
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
            ElementTagType theFunction;
            theFunction = this.getFunction();
            if (this.function!= null) {
                currentHashCode += theFunction.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ScaledNumberElementsType theValue;
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
            ElementTagType theFunction;
            theFunction = this.getFunction();
            strategy.appendField(locator, this, "function", buffer, theFunction, (this.function!= null));
        }
        {
            ScaledNumberElementsType theValue;
            theValue = this.getValue();
            strategy.appendField(locator, this, "value", buffer, theValue, (this.value!= null));
        }
        return buffer;
    }

}
