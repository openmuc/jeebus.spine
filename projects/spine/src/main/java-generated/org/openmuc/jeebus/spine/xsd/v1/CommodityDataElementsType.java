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
 * <p>Java class for CommodityDataElementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommodityDataElementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="commodityId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="commodityType" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="positiveEnergyDirection" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
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
@XmlType(name = "CommodityDataElementsType", propOrder = {
    "commodityId",
    "commodityType",
    "positiveEnergyDirection",
    "label",
    "description"
})
public class CommodityDataElementsType implements Cloneable, CopyTo, ToString
{

    protected ElementTagType commodityId;
    protected ElementTagType commodityType;
    protected ElementTagType positiveEnergyDirection;
    protected ElementTagType label;
    protected ElementTagType description;

    /**
     * Default no-arg constructor
     * 
     */
    public CommodityDataElementsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public CommodityDataElementsType(final ElementTagType commodityId, final ElementTagType commodityType, final ElementTagType positiveEnergyDirection, final ElementTagType label, final ElementTagType description) {
        this.commodityId = commodityId;
        this.commodityType = commodityType;
        this.positiveEnergyDirection = positiveEnergyDirection;
        this.label = label;
        this.description = description;
    }

    /**
     * Gets the value of the commodityId property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getCommodityId() {
        return commodityId;
    }

    /**
     * Sets the value of the commodityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setCommodityId(ElementTagType value) {
        this.commodityId = value;
    }

    /**
     * Gets the value of the commodityType property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getCommodityType() {
        return commodityType;
    }

    /**
     * Sets the value of the commodityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setCommodityType(ElementTagType value) {
        this.commodityType = value;
    }

    /**
     * Gets the value of the positiveEnergyDirection property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getPositiveEnergyDirection() {
        return positiveEnergyDirection;
    }

    /**
     * Sets the value of the positiveEnergyDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setPositiveEnergyDirection(ElementTagType value) {
        this.positiveEnergyDirection = value;
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
     * Sets the value of the commodityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public CommodityDataElementsType withCommodityId(ElementTagType value) {
        setCommodityId(value);
        return this;
    }

    /**
     * Sets the value of the commodityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public CommodityDataElementsType withCommodityType(ElementTagType value) {
        setCommodityType(value);
        return this;
    }

    /**
     * Sets the value of the positiveEnergyDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public CommodityDataElementsType withPositiveEnergyDirection(ElementTagType value) {
        setPositiveEnergyDirection(value);
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
    public CommodityDataElementsType withLabel(ElementTagType value) {
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
    public CommodityDataElementsType withDescription(ElementTagType value) {
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
        if (draftCopy instanceof CommodityDataElementsType) {
            final CommodityDataElementsType copy = ((CommodityDataElementsType) draftCopy);
            {
                Boolean commodityIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.commodityId!= null));
                if (commodityIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceCommodityId;
                    sourceCommodityId = this.getCommodityId();
                    ElementTagType copyCommodityId = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "commodityId", sourceCommodityId), sourceCommodityId, (this.commodityId!= null)));
                    copy.setCommodityId(copyCommodityId);
                } else {
                    if (commodityIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.commodityId = null;
                    }
                }
            }
            {
                Boolean commodityTypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.commodityType!= null));
                if (commodityTypeShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceCommodityType;
                    sourceCommodityType = this.getCommodityType();
                    ElementTagType copyCommodityType = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "commodityType", sourceCommodityType), sourceCommodityType, (this.commodityType!= null)));
                    copy.setCommodityType(copyCommodityType);
                } else {
                    if (commodityTypeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.commodityType = null;
                    }
                }
            }
            {
                Boolean positiveEnergyDirectionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.positiveEnergyDirection!= null));
                if (positiveEnergyDirectionShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourcePositiveEnergyDirection;
                    sourcePositiveEnergyDirection = this.getPositiveEnergyDirection();
                    ElementTagType copyPositiveEnergyDirection = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "positiveEnergyDirection", sourcePositiveEnergyDirection), sourcePositiveEnergyDirection, (this.positiveEnergyDirection!= null)));
                    copy.setPositiveEnergyDirection(copyPositiveEnergyDirection);
                } else {
                    if (positiveEnergyDirectionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.positiveEnergyDirection = null;
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
        return new CommodityDataElementsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final CommodityDataElementsType that = ((CommodityDataElementsType) object);
        {
            ElementTagType leftCommodityId;
            leftCommodityId = this.getCommodityId();
            ElementTagType rightCommodityId;
            rightCommodityId = that.getCommodityId();
            if (this.commodityId!= null) {
                if (that.commodityId!= null) {
                    if (!leftCommodityId.equals(rightCommodityId)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.commodityId!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftCommodityType;
            leftCommodityType = this.getCommodityType();
            ElementTagType rightCommodityType;
            rightCommodityType = that.getCommodityType();
            if (this.commodityType!= null) {
                if (that.commodityType!= null) {
                    if (!leftCommodityType.equals(rightCommodityType)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.commodityType!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftPositiveEnergyDirection;
            leftPositiveEnergyDirection = this.getPositiveEnergyDirection();
            ElementTagType rightPositiveEnergyDirection;
            rightPositiveEnergyDirection = that.getPositiveEnergyDirection();
            if (this.positiveEnergyDirection!= null) {
                if (that.positiveEnergyDirection!= null) {
                    if (!leftPositiveEnergyDirection.equals(rightPositiveEnergyDirection)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.positiveEnergyDirection!= null) {
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
            ElementTagType theCommodityId;
            theCommodityId = this.getCommodityId();
            if (this.commodityId!= null) {
                currentHashCode += theCommodityId.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theCommodityType;
            theCommodityType = this.getCommodityType();
            if (this.commodityType!= null) {
                currentHashCode += theCommodityType.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType thePositiveEnergyDirection;
            thePositiveEnergyDirection = this.getPositiveEnergyDirection();
            if (this.positiveEnergyDirection!= null) {
                currentHashCode += thePositiveEnergyDirection.hashCode();
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
            ElementTagType theCommodityId;
            theCommodityId = this.getCommodityId();
            strategy.appendField(locator, this, "commodityId", buffer, theCommodityId, (this.commodityId!= null));
        }
        {
            ElementTagType theCommodityType;
            theCommodityType = this.getCommodityType();
            strategy.appendField(locator, this, "commodityType", buffer, theCommodityType, (this.commodityType!= null));
        }
        {
            ElementTagType thePositiveEnergyDirection;
            thePositiveEnergyDirection = this.getPositiveEnergyDirection();
            strategy.appendField(locator, this, "positiveEnergyDirection", buffer, thePositiveEnergyDirection, (this.positiveEnergyDirection!= null));
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
