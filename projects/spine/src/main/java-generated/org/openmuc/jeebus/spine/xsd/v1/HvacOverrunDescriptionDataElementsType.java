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
 * <p>Java class for HvacOverrunDescriptionDataElementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HvacOverrunDescriptionDataElementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="overrunId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="overrunType" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="affectedSystemFunctionId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
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
@XmlType(name = "HvacOverrunDescriptionDataElementsType", propOrder = {
    "overrunId",
    "overrunType",
    "affectedSystemFunctionId",
    "label",
    "description"
})
public class HvacOverrunDescriptionDataElementsType implements Cloneable, CopyTo, ToString
{

    protected ElementTagType overrunId;
    protected ElementTagType overrunType;
    protected ElementTagType affectedSystemFunctionId;
    protected ElementTagType label;
    protected ElementTagType description;

    /**
     * Default no-arg constructor
     * 
     */
    public HvacOverrunDescriptionDataElementsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public HvacOverrunDescriptionDataElementsType(final ElementTagType overrunId, final ElementTagType overrunType, final ElementTagType affectedSystemFunctionId, final ElementTagType label, final ElementTagType description) {
        this.overrunId = overrunId;
        this.overrunType = overrunType;
        this.affectedSystemFunctionId = affectedSystemFunctionId;
        this.label = label;
        this.description = description;
    }

    /**
     * Gets the value of the overrunId property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getOverrunId() {
        return overrunId;
    }

    /**
     * Sets the value of the overrunId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setOverrunId(ElementTagType value) {
        this.overrunId = value;
    }

    /**
     * Gets the value of the overrunType property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getOverrunType() {
        return overrunType;
    }

    /**
     * Sets the value of the overrunType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setOverrunType(ElementTagType value) {
        this.overrunType = value;
    }

    /**
     * Gets the value of the affectedSystemFunctionId property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getAffectedSystemFunctionId() {
        return affectedSystemFunctionId;
    }

    /**
     * Sets the value of the affectedSystemFunctionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setAffectedSystemFunctionId(ElementTagType value) {
        this.affectedSystemFunctionId = value;
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
     * Sets the value of the overrunId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public HvacOverrunDescriptionDataElementsType withOverrunId(ElementTagType value) {
        setOverrunId(value);
        return this;
    }

    /**
     * Sets the value of the overrunType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public HvacOverrunDescriptionDataElementsType withOverrunType(ElementTagType value) {
        setOverrunType(value);
        return this;
    }

    /**
     * Sets the value of the affectedSystemFunctionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public HvacOverrunDescriptionDataElementsType withAffectedSystemFunctionId(ElementTagType value) {
        setAffectedSystemFunctionId(value);
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
    public HvacOverrunDescriptionDataElementsType withLabel(ElementTagType value) {
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
    public HvacOverrunDescriptionDataElementsType withDescription(ElementTagType value) {
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
        if (draftCopy instanceof HvacOverrunDescriptionDataElementsType) {
            final HvacOverrunDescriptionDataElementsType copy = ((HvacOverrunDescriptionDataElementsType) draftCopy);
            {
                Boolean overrunIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.overrunId!= null));
                if (overrunIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceOverrunId;
                    sourceOverrunId = this.getOverrunId();
                    ElementTagType copyOverrunId = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "overrunId", sourceOverrunId), sourceOverrunId, (this.overrunId!= null)));
                    copy.setOverrunId(copyOverrunId);
                } else {
                    if (overrunIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.overrunId = null;
                    }
                }
            }
            {
                Boolean overrunTypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.overrunType!= null));
                if (overrunTypeShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceOverrunType;
                    sourceOverrunType = this.getOverrunType();
                    ElementTagType copyOverrunType = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "overrunType", sourceOverrunType), sourceOverrunType, (this.overrunType!= null)));
                    copy.setOverrunType(copyOverrunType);
                } else {
                    if (overrunTypeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.overrunType = null;
                    }
                }
            }
            {
                Boolean affectedSystemFunctionIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.affectedSystemFunctionId!= null));
                if (affectedSystemFunctionIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceAffectedSystemFunctionId;
                    sourceAffectedSystemFunctionId = this.getAffectedSystemFunctionId();
                    ElementTagType copyAffectedSystemFunctionId = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "affectedSystemFunctionId", sourceAffectedSystemFunctionId), sourceAffectedSystemFunctionId, (this.affectedSystemFunctionId!= null)));
                    copy.setAffectedSystemFunctionId(copyAffectedSystemFunctionId);
                } else {
                    if (affectedSystemFunctionIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.affectedSystemFunctionId = null;
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
        return new HvacOverrunDescriptionDataElementsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final HvacOverrunDescriptionDataElementsType that = ((HvacOverrunDescriptionDataElementsType) object);
        {
            ElementTagType leftOverrunId;
            leftOverrunId = this.getOverrunId();
            ElementTagType rightOverrunId;
            rightOverrunId = that.getOverrunId();
            if (this.overrunId!= null) {
                if (that.overrunId!= null) {
                    if (!leftOverrunId.equals(rightOverrunId)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.overrunId!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftOverrunType;
            leftOverrunType = this.getOverrunType();
            ElementTagType rightOverrunType;
            rightOverrunType = that.getOverrunType();
            if (this.overrunType!= null) {
                if (that.overrunType!= null) {
                    if (!leftOverrunType.equals(rightOverrunType)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.overrunType!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftAffectedSystemFunctionId;
            leftAffectedSystemFunctionId = this.getAffectedSystemFunctionId();
            ElementTagType rightAffectedSystemFunctionId;
            rightAffectedSystemFunctionId = that.getAffectedSystemFunctionId();
            if (this.affectedSystemFunctionId!= null) {
                if (that.affectedSystemFunctionId!= null) {
                    if (!leftAffectedSystemFunctionId.equals(rightAffectedSystemFunctionId)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.affectedSystemFunctionId!= null) {
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
            ElementTagType theOverrunId;
            theOverrunId = this.getOverrunId();
            if (this.overrunId!= null) {
                currentHashCode += theOverrunId.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theOverrunType;
            theOverrunType = this.getOverrunType();
            if (this.overrunType!= null) {
                currentHashCode += theOverrunType.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theAffectedSystemFunctionId;
            theAffectedSystemFunctionId = this.getAffectedSystemFunctionId();
            if (this.affectedSystemFunctionId!= null) {
                currentHashCode += theAffectedSystemFunctionId.hashCode();
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
            ElementTagType theOverrunId;
            theOverrunId = this.getOverrunId();
            strategy.appendField(locator, this, "overrunId", buffer, theOverrunId, (this.overrunId!= null));
        }
        {
            ElementTagType theOverrunType;
            theOverrunType = this.getOverrunType();
            strategy.appendField(locator, this, "overrunType", buffer, theOverrunType, (this.overrunType!= null));
        }
        {
            ElementTagType theAffectedSystemFunctionId;
            theAffectedSystemFunctionId = this.getAffectedSystemFunctionId();
            strategy.appendField(locator, this, "affectedSystemFunctionId", buffer, theAffectedSystemFunctionId, (this.affectedSystemFunctionId!= null));
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
