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
 * <p>Java class for HvacOperationModeDescriptionDataElementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HvacOperationModeDescriptionDataElementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="operationModeId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="operationModeType" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="label" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HvacOperationModeDescriptionDataElementsType", propOrder = {
    "operationModeId",
    "operationModeType",
    "label",
    "description"
})
public class HvacOperationModeDescriptionDataElementsType implements Cloneable, CopyTo, ToString
{

    protected ElementTagType operationModeId;
    protected ElementTagType operationModeType;
    protected ElementTagType label;
    protected ElementTagType description;

    /**
     * Default no-arg constructor
     * 
     */
    public HvacOperationModeDescriptionDataElementsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public HvacOperationModeDescriptionDataElementsType(final ElementTagType operationModeId, final ElementTagType operationModeType, final ElementTagType label, final ElementTagType description) {
        this.operationModeId = operationModeId;
        this.operationModeType = operationModeType;
        this.label = label;
        this.description = description;
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
     * Gets the value of the operationModeType property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getOperationModeType() {
        return operationModeType;
    }

    /**
     * Sets the value of the operationModeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setOperationModeType(ElementTagType value) {
        this.operationModeType = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setLabel(ElementTagType value) {
        this.label = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setDescription(ElementTagType value) {
        this.description = value;
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
    public HvacOperationModeDescriptionDataElementsType withOperationModeId(ElementTagType value) {
        setOperationModeId(value);
        return this;
    }

    /**
     * Sets the value of the operationModeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public HvacOperationModeDescriptionDataElementsType withOperationModeType(ElementTagType value) {
        setOperationModeType(value);
        return this;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public HvacOperationModeDescriptionDataElementsType withLabel(ElementTagType value) {
        setLabel(value);
        return this;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public HvacOperationModeDescriptionDataElementsType withDescription(ElementTagType value) {
        setDescription(value);
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
        if (draftCopy instanceof HvacOperationModeDescriptionDataElementsType) {
            final HvacOperationModeDescriptionDataElementsType copy = ((HvacOperationModeDescriptionDataElementsType) draftCopy);
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
                Boolean operationModeTypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.operationModeType!= null));
                if (operationModeTypeShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceOperationModeType;
                    sourceOperationModeType = this.getOperationModeType();
                    ElementTagType copyOperationModeType = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "operationModeType", sourceOperationModeType), sourceOperationModeType, (this.operationModeType!= null)));
                    copy.setOperationModeType(copyOperationModeType);
                } else {
                    if (operationModeTypeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.operationModeType = null;
                    }
                }
            }
            {
                Boolean labelShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.label!= null));
                if (labelShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceLabel;
                    sourceLabel = this.getLabel();
                    ElementTagType copyLabel = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "label", sourceLabel), sourceLabel, (this.label!= null)));
                    copy.setLabel(copyLabel);
                } else {
                    if (labelShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.label = null;
                    }
                }
            }
            {
                Boolean descriptionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.description!= null));
                if (descriptionShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceDescription;
                    sourceDescription = this.getDescription();
                    ElementTagType copyDescription = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "description", sourceDescription), sourceDescription, (this.description!= null)));
                    copy.setDescription(copyDescription);
                } else {
                    if (descriptionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.description = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new HvacOperationModeDescriptionDataElementsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final HvacOperationModeDescriptionDataElementsType that = ((HvacOperationModeDescriptionDataElementsType) object);
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
            ElementTagType leftOperationModeType;
            leftOperationModeType = this.getOperationModeType();
            ElementTagType rightOperationModeType;
            rightOperationModeType = that.getOperationModeType();
            if (this.operationModeType!= null) {
                if (that.operationModeType!= null) {
                    if (!leftOperationModeType.equals(rightOperationModeType)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.operationModeType!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftLabel;
            leftLabel = this.getLabel();
            ElementTagType rightLabel;
            rightLabel = that.getLabel();
            if (this.label!= null) {
                if (that.label!= null) {
                    if (!leftLabel.equals(rightLabel)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.label!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftDescription;
            leftDescription = this.getDescription();
            ElementTagType rightDescription;
            rightDescription = that.getDescription();
            if (this.description!= null) {
                if (that.description!= null) {
                    if (!leftDescription.equals(rightDescription)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.description!= null) {
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
            ElementTagType theOperationModeId;
            theOperationModeId = this.getOperationModeId();
            if (this.operationModeId!= null) {
                currentHashCode += theOperationModeId.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theOperationModeType;
            theOperationModeType = this.getOperationModeType();
            if (this.operationModeType!= null) {
                currentHashCode += theOperationModeType.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theLabel;
            theLabel = this.getLabel();
            if (this.label!= null) {
                currentHashCode += theLabel.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theDescription;
            theDescription = this.getDescription();
            if (this.description!= null) {
                currentHashCode += theDescription.hashCode();
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
            ElementTagType theOperationModeId;
            theOperationModeId = this.getOperationModeId();
            strategy.appendField(locator, this, "operationModeId", buffer, theOperationModeId, (this.operationModeId!= null));
        }
        {
            ElementTagType theOperationModeType;
            theOperationModeType = this.getOperationModeType();
            strategy.appendField(locator, this, "operationModeType", buffer, theOperationModeType, (this.operationModeType!= null));
        }
        {
            ElementTagType theLabel;
            theLabel = this.getLabel();
            strategy.appendField(locator, this, "label", buffer, theLabel, (this.label!= null));
        }
        {
            ElementTagType theDescription;
            theDescription = this.getDescription();
            strategy.appendField(locator, this, "description", buffer, theDescription, (this.description!= null));
        }
        return buffer;
    }

}
