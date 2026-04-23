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
 * <p>Java class for HvacSystemFunctionSetpointRelationDataElementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HvacSystemFunctionSetpointRelationDataElementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="systemFunctionId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="operationModeId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="setpointId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HvacSystemFunctionSetpointRelationDataElementsType", propOrder = {
    "systemFunctionId",
    "operationModeId",
    "setpointId"
})
public class HvacSystemFunctionSetpointRelationDataElementsType implements Cloneable, CopyTo, ToString
{

    protected ElementTagType systemFunctionId;
    protected ElementTagType operationModeId;
    protected ElementTagType setpointId;

    /**
     * Default no-arg constructor
     * 
     */
    public HvacSystemFunctionSetpointRelationDataElementsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public HvacSystemFunctionSetpointRelationDataElementsType(final ElementTagType systemFunctionId, final ElementTagType operationModeId, final ElementTagType setpointId) {
        this.systemFunctionId = systemFunctionId;
        this.operationModeId = operationModeId;
        this.setpointId = setpointId;
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
     * Gets the value of the operationModeId property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getOperationModeId() {
        return operationModeId;
    }

    /**
     * Sets the value of the operationModeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setOperationModeId(ElementTagType value) {
        this.operationModeId = value;
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
     * Sets the value of the systemFunctionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public HvacSystemFunctionSetpointRelationDataElementsType withSystemFunctionId(ElementTagType value) {
        setSystemFunctionId(value);
        return this;
    }

    /**
     * Sets the value of the operationModeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public HvacSystemFunctionSetpointRelationDataElementsType withOperationModeId(ElementTagType value) {
        setOperationModeId(value);
        return this;
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
    public HvacSystemFunctionSetpointRelationDataElementsType withSetpointId(ElementTagType value) {
        setSetpointId(value);
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
        if (draftCopy instanceof HvacSystemFunctionSetpointRelationDataElementsType) {
            final HvacSystemFunctionSetpointRelationDataElementsType copy = ((HvacSystemFunctionSetpointRelationDataElementsType) draftCopy);
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
                Boolean operationModeIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.operationModeId!= null));
                if (operationModeIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceOperationModeId;
                    sourceOperationModeId = this.getOperationModeId();
                    ElementTagType copyOperationModeId = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "operationModeId", sourceOperationModeId), sourceOperationModeId, (this.operationModeId!= null)));
                    copy.setOperationModeId(copyOperationModeId);
                } else {
                    if (operationModeIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.operationModeId = null;
                    }
                }
            }
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
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new HvacSystemFunctionSetpointRelationDataElementsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final HvacSystemFunctionSetpointRelationDataElementsType that = ((HvacSystemFunctionSetpointRelationDataElementsType) object);
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
            ElementTagType leftOperationModeId;
            leftOperationModeId = this.getOperationModeId();
            ElementTagType rightOperationModeId;
            rightOperationModeId = that.getOperationModeId();
            if (this.operationModeId!= null) {
                if (that.operationModeId!= null) {
                    if (!leftOperationModeId.equals(rightOperationModeId)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.operationModeId!= null) {
                    return false;
                }
            }
        }
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
            ElementTagType theOperationModeId;
            theOperationModeId = this.getOperationModeId();
            if (this.operationModeId!= null) {
                currentHashCode += theOperationModeId.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theSetpointId;
            theSetpointId = this.getSetpointId();
            if (this.setpointId!= null) {
                currentHashCode += theSetpointId.hashCode();
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
            ElementTagType theOperationModeId;
            theOperationModeId = this.getOperationModeId();
            strategy.appendField(locator, this, "operationModeId", buffer, theOperationModeId, (this.operationModeId!= null));
        }
        {
            ElementTagType theSetpointId;
            theSetpointId = this.getSetpointId();
            strategy.appendField(locator, this, "setpointId", buffer, theSetpointId, (this.setpointId!= null));
        }
        return buffer;
    }

}
