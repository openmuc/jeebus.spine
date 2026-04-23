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
 * <p>Java class for HvacSystemFunctionDataElementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HvacSystemFunctionDataElementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="systemFunctionId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="currentOperationModeId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="isOperationModeIdChangeable" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="currentSetpointId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="isSetpointIdChangeable" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="isOverrunActive" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HvacSystemFunctionDataElementsType", propOrder = {
    "systemFunctionId",
    "currentOperationModeId",
    "isOperationModeIdChangeable",
    "currentSetpointId",
    "isSetpointIdChangeable",
    "isOverrunActive"
})
public class HvacSystemFunctionDataElementsType implements Cloneable, CopyTo, ToString
{

    protected ElementTagType systemFunctionId;
    protected ElementTagType currentOperationModeId;
    protected ElementTagType isOperationModeIdChangeable;
    protected ElementTagType currentSetpointId;
    protected ElementTagType isSetpointIdChangeable;
    protected ElementTagType isOverrunActive;

    /**
     * Default no-arg constructor
     * 
     */
    public HvacSystemFunctionDataElementsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public HvacSystemFunctionDataElementsType(final ElementTagType systemFunctionId, final ElementTagType currentOperationModeId, final ElementTagType isOperationModeIdChangeable, final ElementTagType currentSetpointId, final ElementTagType isSetpointIdChangeable, final ElementTagType isOverrunActive) {
        this.systemFunctionId = systemFunctionId;
        this.currentOperationModeId = currentOperationModeId;
        this.isOperationModeIdChangeable = isOperationModeIdChangeable;
        this.currentSetpointId = currentSetpointId;
        this.isSetpointIdChangeable = isSetpointIdChangeable;
        this.isOverrunActive = isOverrunActive;
    }

    /**
     * Gets the value of the systemFunctionId property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getSystemFunctionId() {
        return systemFunctionId;
    }

    /**
     * Sets the value of the systemFunctionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setSystemFunctionId(ElementTagType value) {
        this.systemFunctionId = value;
    }

    /**
     * Gets the value of the currentOperationModeId property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getCurrentOperationModeId() {
        return currentOperationModeId;
    }

    /**
     * Sets the value of the currentOperationModeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setCurrentOperationModeId(ElementTagType value) {
        this.currentOperationModeId = value;
    }

    /**
     * Gets the value of the isOperationModeIdChangeable property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getIsOperationModeIdChangeable() {
        return isOperationModeIdChangeable;
    }

    /**
     * Sets the value of the isOperationModeIdChangeable property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setIsOperationModeIdChangeable(ElementTagType value) {
        this.isOperationModeIdChangeable = value;
    }

    /**
     * Gets the value of the currentSetpointId property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getCurrentSetpointId() {
        return currentSetpointId;
    }

    /**
     * Sets the value of the currentSetpointId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setCurrentSetpointId(ElementTagType value) {
        this.currentSetpointId = value;
    }

    /**
     * Gets the value of the isSetpointIdChangeable property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getIsSetpointIdChangeable() {
        return isSetpointIdChangeable;
    }

    /**
     * Sets the value of the isSetpointIdChangeable property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setIsSetpointIdChangeable(ElementTagType value) {
        this.isSetpointIdChangeable = value;
    }

    /**
     * Gets the value of the isOverrunActive property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getIsOverrunActive() {
        return isOverrunActive;
    }

    /**
     * Sets the value of the isOverrunActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setIsOverrunActive(ElementTagType value) {
        this.isOverrunActive = value;
    }

    /**
     * Sets the value of the systemFunctionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public HvacSystemFunctionDataElementsType withSystemFunctionId(ElementTagType value) {
        setSystemFunctionId(value);
        return this;
    }

    /**
     * Sets the value of the currentOperationModeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public HvacSystemFunctionDataElementsType withCurrentOperationModeId(ElementTagType value) {
        setCurrentOperationModeId(value);
        return this;
    }

    /**
     * Sets the value of the isOperationModeIdChangeable property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public HvacSystemFunctionDataElementsType withIsOperationModeIdChangeable(ElementTagType value) {
        setIsOperationModeIdChangeable(value);
        return this;
    }

    /**
     * Sets the value of the currentSetpointId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public HvacSystemFunctionDataElementsType withCurrentSetpointId(ElementTagType value) {
        setCurrentSetpointId(value);
        return this;
    }

    /**
     * Sets the value of the isSetpointIdChangeable property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public HvacSystemFunctionDataElementsType withIsSetpointIdChangeable(ElementTagType value) {
        setIsSetpointIdChangeable(value);
        return this;
    }

    /**
     * Sets the value of the isOverrunActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public HvacSystemFunctionDataElementsType withIsOverrunActive(ElementTagType value) {
        setIsOverrunActive(value);
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
        if (draftCopy instanceof HvacSystemFunctionDataElementsType) {
            final HvacSystemFunctionDataElementsType copy = ((HvacSystemFunctionDataElementsType) draftCopy);
            {
                Boolean systemFunctionIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.systemFunctionId!= null));
                if (systemFunctionIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceSystemFunctionId;
                    sourceSystemFunctionId = this.getSystemFunctionId();
                    ElementTagType copySystemFunctionId = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "systemFunctionId", sourceSystemFunctionId), sourceSystemFunctionId, (this.systemFunctionId!= null)));
                    copy.setSystemFunctionId(copySystemFunctionId);
                } else {
                    if (systemFunctionIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.systemFunctionId = null;
                    }
                }
            }
            {
                Boolean currentOperationModeIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.currentOperationModeId!= null));
                if (currentOperationModeIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceCurrentOperationModeId;
                    sourceCurrentOperationModeId = this.getCurrentOperationModeId();
                    ElementTagType copyCurrentOperationModeId = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "currentOperationModeId", sourceCurrentOperationModeId), sourceCurrentOperationModeId, (this.currentOperationModeId!= null)));
                    copy.setCurrentOperationModeId(copyCurrentOperationModeId);
                } else {
                    if (currentOperationModeIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.currentOperationModeId = null;
                    }
                }
            }
            {
                Boolean isOperationModeIdChangeableShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.isOperationModeIdChangeable!= null));
                if (isOperationModeIdChangeableShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceIsOperationModeIdChangeable;
                    sourceIsOperationModeIdChangeable = this.getIsOperationModeIdChangeable();
                    ElementTagType copyIsOperationModeIdChangeable = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "isOperationModeIdChangeable", sourceIsOperationModeIdChangeable), sourceIsOperationModeIdChangeable, (this.isOperationModeIdChangeable!= null)));
                    copy.setIsOperationModeIdChangeable(copyIsOperationModeIdChangeable);
                } else {
                    if (isOperationModeIdChangeableShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.isOperationModeIdChangeable = null;
                    }
                }
            }
            {
                Boolean currentSetpointIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.currentSetpointId!= null));
                if (currentSetpointIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceCurrentSetpointId;
                    sourceCurrentSetpointId = this.getCurrentSetpointId();
                    ElementTagType copyCurrentSetpointId = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "currentSetpointId", sourceCurrentSetpointId), sourceCurrentSetpointId, (this.currentSetpointId!= null)));
                    copy.setCurrentSetpointId(copyCurrentSetpointId);
                } else {
                    if (currentSetpointIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.currentSetpointId = null;
                    }
                }
            }
            {
                Boolean isSetpointIdChangeableShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.isSetpointIdChangeable!= null));
                if (isSetpointIdChangeableShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceIsSetpointIdChangeable;
                    sourceIsSetpointIdChangeable = this.getIsSetpointIdChangeable();
                    ElementTagType copyIsSetpointIdChangeable = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "isSetpointIdChangeable", sourceIsSetpointIdChangeable), sourceIsSetpointIdChangeable, (this.isSetpointIdChangeable!= null)));
                    copy.setIsSetpointIdChangeable(copyIsSetpointIdChangeable);
                } else {
                    if (isSetpointIdChangeableShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.isSetpointIdChangeable = null;
                    }
                }
            }
            {
                Boolean isOverrunActiveShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.isOverrunActive!= null));
                if (isOverrunActiveShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceIsOverrunActive;
                    sourceIsOverrunActive = this.getIsOverrunActive();
                    ElementTagType copyIsOverrunActive = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "isOverrunActive", sourceIsOverrunActive), sourceIsOverrunActive, (this.isOverrunActive!= null)));
                    copy.setIsOverrunActive(copyIsOverrunActive);
                } else {
                    if (isOverrunActiveShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.isOverrunActive = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new HvacSystemFunctionDataElementsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final HvacSystemFunctionDataElementsType that = ((HvacSystemFunctionDataElementsType) object);
        {
            ElementTagType leftSystemFunctionId;
            leftSystemFunctionId = this.getSystemFunctionId();
            ElementTagType rightSystemFunctionId;
            rightSystemFunctionId = that.getSystemFunctionId();
            if (this.systemFunctionId!= null) {
                if (that.systemFunctionId!= null) {
                    if (!leftSystemFunctionId.equals(rightSystemFunctionId)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.systemFunctionId!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftCurrentOperationModeId;
            leftCurrentOperationModeId = this.getCurrentOperationModeId();
            ElementTagType rightCurrentOperationModeId;
            rightCurrentOperationModeId = that.getCurrentOperationModeId();
            if (this.currentOperationModeId!= null) {
                if (that.currentOperationModeId!= null) {
                    if (!leftCurrentOperationModeId.equals(rightCurrentOperationModeId)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.currentOperationModeId!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftIsOperationModeIdChangeable;
            leftIsOperationModeIdChangeable = this.getIsOperationModeIdChangeable();
            ElementTagType rightIsOperationModeIdChangeable;
            rightIsOperationModeIdChangeable = that.getIsOperationModeIdChangeable();
            if (this.isOperationModeIdChangeable!= null) {
                if (that.isOperationModeIdChangeable!= null) {
                    if (!leftIsOperationModeIdChangeable.equals(rightIsOperationModeIdChangeable)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.isOperationModeIdChangeable!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftCurrentSetpointId;
            leftCurrentSetpointId = this.getCurrentSetpointId();
            ElementTagType rightCurrentSetpointId;
            rightCurrentSetpointId = that.getCurrentSetpointId();
            if (this.currentSetpointId!= null) {
                if (that.currentSetpointId!= null) {
                    if (!leftCurrentSetpointId.equals(rightCurrentSetpointId)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.currentSetpointId!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftIsSetpointIdChangeable;
            leftIsSetpointIdChangeable = this.getIsSetpointIdChangeable();
            ElementTagType rightIsSetpointIdChangeable;
            rightIsSetpointIdChangeable = that.getIsSetpointIdChangeable();
            if (this.isSetpointIdChangeable!= null) {
                if (that.isSetpointIdChangeable!= null) {
                    if (!leftIsSetpointIdChangeable.equals(rightIsSetpointIdChangeable)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.isSetpointIdChangeable!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftIsOverrunActive;
            leftIsOverrunActive = this.getIsOverrunActive();
            ElementTagType rightIsOverrunActive;
            rightIsOverrunActive = that.getIsOverrunActive();
            if (this.isOverrunActive!= null) {
                if (that.isOverrunActive!= null) {
                    if (!leftIsOverrunActive.equals(rightIsOverrunActive)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.isOverrunActive!= null) {
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
            ElementTagType theSystemFunctionId;
            theSystemFunctionId = this.getSystemFunctionId();
            if (this.systemFunctionId!= null) {
                currentHashCode += theSystemFunctionId.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theCurrentOperationModeId;
            theCurrentOperationModeId = this.getCurrentOperationModeId();
            if (this.currentOperationModeId!= null) {
                currentHashCode += theCurrentOperationModeId.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theIsOperationModeIdChangeable;
            theIsOperationModeIdChangeable = this.getIsOperationModeIdChangeable();
            if (this.isOperationModeIdChangeable!= null) {
                currentHashCode += theIsOperationModeIdChangeable.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theCurrentSetpointId;
            theCurrentSetpointId = this.getCurrentSetpointId();
            if (this.currentSetpointId!= null) {
                currentHashCode += theCurrentSetpointId.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theIsSetpointIdChangeable;
            theIsSetpointIdChangeable = this.getIsSetpointIdChangeable();
            if (this.isSetpointIdChangeable!= null) {
                currentHashCode += theIsSetpointIdChangeable.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theIsOverrunActive;
            theIsOverrunActive = this.getIsOverrunActive();
            if (this.isOverrunActive!= null) {
                currentHashCode += theIsOverrunActive.hashCode();
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
            ElementTagType theSystemFunctionId;
            theSystemFunctionId = this.getSystemFunctionId();
            strategy.appendField(locator, this, "systemFunctionId", buffer, theSystemFunctionId, (this.systemFunctionId!= null));
        }
        {
            ElementTagType theCurrentOperationModeId;
            theCurrentOperationModeId = this.getCurrentOperationModeId();
            strategy.appendField(locator, this, "currentOperationModeId", buffer, theCurrentOperationModeId, (this.currentOperationModeId!= null));
        }
        {
            ElementTagType theIsOperationModeIdChangeable;
            theIsOperationModeIdChangeable = this.getIsOperationModeIdChangeable();
            strategy.appendField(locator, this, "isOperationModeIdChangeable", buffer, theIsOperationModeIdChangeable, (this.isOperationModeIdChangeable!= null));
        }
        {
            ElementTagType theCurrentSetpointId;
            theCurrentSetpointId = this.getCurrentSetpointId();
            strategy.appendField(locator, this, "currentSetpointId", buffer, theCurrentSetpointId, (this.currentSetpointId!= null));
        }
        {
            ElementTagType theIsSetpointIdChangeable;
            theIsSetpointIdChangeable = this.getIsSetpointIdChangeable();
            strategy.appendField(locator, this, "isSetpointIdChangeable", buffer, theIsSetpointIdChangeable, (this.isSetpointIdChangeable!= null));
        }
        {
            ElementTagType theIsOverrunActive;
            theIsOverrunActive = this.getIsOverrunActive();
            strategy.appendField(locator, this, "isOverrunActive", buffer, theIsOverrunActive, (this.isOverrunActive!= null));
        }
        return buffer;
    }

}
