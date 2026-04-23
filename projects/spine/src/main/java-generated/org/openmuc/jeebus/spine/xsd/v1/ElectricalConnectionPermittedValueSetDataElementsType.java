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
 * <p>Java class for ElectricalConnectionPermittedValueSetDataElementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElectricalConnectionPermittedValueSetDataElementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="electricalConnectionId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="parameterId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="permittedValueSet" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberSetElementsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElectricalConnectionPermittedValueSetDataElementsType", propOrder = {
    "electricalConnectionId",
    "parameterId",
    "permittedValueSet"
})
public class ElectricalConnectionPermittedValueSetDataElementsType implements Cloneable, CopyTo, ToString
{

    protected ElementTagType electricalConnectionId;
    protected ElementTagType parameterId;
    protected ScaledNumberSetElementsType permittedValueSet;

    /**
     * Default no-arg constructor
     * 
     */
    public ElectricalConnectionPermittedValueSetDataElementsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public ElectricalConnectionPermittedValueSetDataElementsType(final ElementTagType electricalConnectionId, final ElementTagType parameterId, final ScaledNumberSetElementsType permittedValueSet) {
        this.electricalConnectionId = electricalConnectionId;
        this.parameterId = parameterId;
        this.permittedValueSet = permittedValueSet;
    }

    /**
     * Gets the value of the electricalConnectionId property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getElectricalConnectionId() {
        return electricalConnectionId;
    }

    /**
     * Sets the value of the electricalConnectionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setElectricalConnectionId(ElementTagType value) {
        this.electricalConnectionId = value;
    }

    /**
     * Gets the value of the parameterId property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getParameterId() {
        return parameterId;
    }

    /**
     * Sets the value of the parameterId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setParameterId(ElementTagType value) {
        this.parameterId = value;
    }

    /**
     * Gets the value of the permittedValueSet property.
     * 
     * @return
     *     possible object is
     *     {@link ScaledNumberSetElementsType }
     *     
     */
    public ScaledNumberSetElementsType getPermittedValueSet() {
        return permittedValueSet;
    }

    /**
     * Sets the value of the permittedValueSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberSetElementsType }
     *     
     */
    public void setPermittedValueSet(ScaledNumberSetElementsType value) {
        this.permittedValueSet = value;
    }

    /**
     * Sets the value of the electricalConnectionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public ElectricalConnectionPermittedValueSetDataElementsType withElectricalConnectionId(ElementTagType value) {
        setElectricalConnectionId(value);
        return this;
    }

    /**
     * Sets the value of the parameterId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public ElectricalConnectionPermittedValueSetDataElementsType withParameterId(ElementTagType value) {
        setParameterId(value);
        return this;
    }

    /**
     * Sets the value of the permittedValueSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledNumberSetElementsType }
     * @return
     *     The class instance
     */
    public ElectricalConnectionPermittedValueSetDataElementsType withPermittedValueSet(ScaledNumberSetElementsType value) {
        setPermittedValueSet(value);
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
        if (draftCopy instanceof ElectricalConnectionPermittedValueSetDataElementsType) {
            final ElectricalConnectionPermittedValueSetDataElementsType copy = ((ElectricalConnectionPermittedValueSetDataElementsType) draftCopy);
            {
                Boolean electricalConnectionIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.electricalConnectionId!= null));
                if (electricalConnectionIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceElectricalConnectionId;
                    sourceElectricalConnectionId = this.getElectricalConnectionId();
                    ElementTagType copyElectricalConnectionId = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "electricalConnectionId", sourceElectricalConnectionId), sourceElectricalConnectionId, (this.electricalConnectionId!= null)));
                    copy.setElectricalConnectionId(copyElectricalConnectionId);
                } else {
                    if (electricalConnectionIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.electricalConnectionId = null;
                    }
                }
            }
            {
                Boolean parameterIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.parameterId!= null));
                if (parameterIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceParameterId;
                    sourceParameterId = this.getParameterId();
                    ElementTagType copyParameterId = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "parameterId", sourceParameterId), sourceParameterId, (this.parameterId!= null)));
                    copy.setParameterId(copyParameterId);
                } else {
                    if (parameterIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.parameterId = null;
                    }
                }
            }
            {
                Boolean permittedValueSetShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.permittedValueSet!= null));
                if (permittedValueSetShouldBeCopiedAndSet == Boolean.TRUE) {
                    ScaledNumberSetElementsType sourcePermittedValueSet;
                    sourcePermittedValueSet = this.getPermittedValueSet();
                    ScaledNumberSetElementsType copyPermittedValueSet = ((ScaledNumberSetElementsType) strategy.copy(LocatorUtils.property(locator, "permittedValueSet", sourcePermittedValueSet), sourcePermittedValueSet, (this.permittedValueSet!= null)));
                    copy.setPermittedValueSet(copyPermittedValueSet);
                } else {
                    if (permittedValueSetShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.permittedValueSet = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new ElectricalConnectionPermittedValueSetDataElementsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ElectricalConnectionPermittedValueSetDataElementsType that = ((ElectricalConnectionPermittedValueSetDataElementsType) object);
        {
            ElementTagType leftElectricalConnectionId;
            leftElectricalConnectionId = this.getElectricalConnectionId();
            ElementTagType rightElectricalConnectionId;
            rightElectricalConnectionId = that.getElectricalConnectionId();
            if (this.electricalConnectionId!= null) {
                if (that.electricalConnectionId!= null) {
                    if (!leftElectricalConnectionId.equals(rightElectricalConnectionId)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.electricalConnectionId!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftParameterId;
            leftParameterId = this.getParameterId();
            ElementTagType rightParameterId;
            rightParameterId = that.getParameterId();
            if (this.parameterId!= null) {
                if (that.parameterId!= null) {
                    if (!leftParameterId.equals(rightParameterId)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.parameterId!= null) {
                    return false;
                }
            }
        }
        {
            ScaledNumberSetElementsType leftPermittedValueSet;
            leftPermittedValueSet = this.getPermittedValueSet();
            ScaledNumberSetElementsType rightPermittedValueSet;
            rightPermittedValueSet = that.getPermittedValueSet();
            if (this.permittedValueSet!= null) {
                if (that.permittedValueSet!= null) {
                    if (!leftPermittedValueSet.equals(rightPermittedValueSet)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.permittedValueSet!= null) {
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
            ElementTagType theElectricalConnectionId;
            theElectricalConnectionId = this.getElectricalConnectionId();
            if (this.electricalConnectionId!= null) {
                currentHashCode += theElectricalConnectionId.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theParameterId;
            theParameterId = this.getParameterId();
            if (this.parameterId!= null) {
                currentHashCode += theParameterId.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ScaledNumberSetElementsType thePermittedValueSet;
            thePermittedValueSet = this.getPermittedValueSet();
            if (this.permittedValueSet!= null) {
                currentHashCode += thePermittedValueSet.hashCode();
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
            ElementTagType theElectricalConnectionId;
            theElectricalConnectionId = this.getElectricalConnectionId();
            strategy.appendField(locator, this, "electricalConnectionId", buffer, theElectricalConnectionId, (this.electricalConnectionId!= null));
        }
        {
            ElementTagType theParameterId;
            theParameterId = this.getParameterId();
            strategy.appendField(locator, this, "parameterId", buffer, theParameterId, (this.parameterId!= null));
        }
        {
            ScaledNumberSetElementsType thePermittedValueSet;
            thePermittedValueSet = this.getPermittedValueSet();
            strategy.appendField(locator, this, "permittedValueSet", buffer, thePermittedValueSet, (this.permittedValueSet!= null));
        }
        return buffer;
    }

}
