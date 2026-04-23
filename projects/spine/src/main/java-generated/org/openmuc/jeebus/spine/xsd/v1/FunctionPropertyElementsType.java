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
 * <p>Java class for FunctionPropertyElementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FunctionPropertyElementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="function" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="possibleOperations" type="{http://docs.eebus.org/spine/xsd/v1}PossibleOperationsElementsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FunctionPropertyElementsType", propOrder = {
    "function",
    "possibleOperations"
})
public class FunctionPropertyElementsType implements Cloneable, CopyTo, ToString
{

    protected ElementTagType function;
    protected PossibleOperationsElementsType possibleOperations;

    /**
     * Default no-arg constructor
     * 
     */
    public FunctionPropertyElementsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public FunctionPropertyElementsType(final ElementTagType function, final PossibleOperationsElementsType possibleOperations) {
        this.function = function;
        this.possibleOperations = possibleOperations;
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
     * Gets the value of the possibleOperations property.
     * 
     * @return
     *     possible object is
     *     {@link PossibleOperationsElementsType }
     *     
     */
    public PossibleOperationsElementsType getPossibleOperations() {
        return possibleOperations;
    }

    /**
     * Sets the value of the possibleOperations property.
     * 
     * @param value
     *     allowed object is
     *     {@link PossibleOperationsElementsType }
     *     
     */
    public void setPossibleOperations(PossibleOperationsElementsType value) {
        this.possibleOperations = value;
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
    public FunctionPropertyElementsType withFunction(ElementTagType value) {
        setFunction(value);
        return this;
    }

    /**
     * Sets the value of the possibleOperations property.
     * 
     * @param value
     *     allowed object is
     *     {@link PossibleOperationsElementsType }
     * @return
     *     The class instance
     */
    public FunctionPropertyElementsType withPossibleOperations(PossibleOperationsElementsType value) {
        setPossibleOperations(value);
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
        if (draftCopy instanceof FunctionPropertyElementsType) {
            final FunctionPropertyElementsType copy = ((FunctionPropertyElementsType) draftCopy);
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
                Boolean possibleOperationsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.possibleOperations!= null));
                if (possibleOperationsShouldBeCopiedAndSet == Boolean.TRUE) {
                    PossibleOperationsElementsType sourcePossibleOperations;
                    sourcePossibleOperations = this.getPossibleOperations();
                    PossibleOperationsElementsType copyPossibleOperations = ((PossibleOperationsElementsType) strategy.copy(LocatorUtils.property(locator, "possibleOperations", sourcePossibleOperations), sourcePossibleOperations, (this.possibleOperations!= null)));
                    copy.setPossibleOperations(copyPossibleOperations);
                } else {
                    if (possibleOperationsShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.possibleOperations = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new FunctionPropertyElementsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final FunctionPropertyElementsType that = ((FunctionPropertyElementsType) object);
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
            PossibleOperationsElementsType leftPossibleOperations;
            leftPossibleOperations = this.getPossibleOperations();
            PossibleOperationsElementsType rightPossibleOperations;
            rightPossibleOperations = that.getPossibleOperations();
            if (this.possibleOperations!= null) {
                if (that.possibleOperations!= null) {
                    if (!leftPossibleOperations.equals(rightPossibleOperations)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.possibleOperations!= null) {
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
            PossibleOperationsElementsType thePossibleOperations;
            thePossibleOperations = this.getPossibleOperations();
            if (this.possibleOperations!= null) {
                currentHashCode += thePossibleOperations.hashCode();
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
            PossibleOperationsElementsType thePossibleOperations;
            thePossibleOperations = this.getPossibleOperations();
            strategy.appendField(locator, this, "possibleOperations", buffer, thePossibleOperations, (this.possibleOperations!= null));
        }
        return buffer;
    }

}
