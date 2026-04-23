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
import jakarta.xml.bind.annotation.XmlSeeAlso;
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
 * <p>Java class for TariffDescriptionDataElementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TariffDescriptionDataElementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tariffId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="commodityId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="measurementId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="tariffWriteable" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="updateRequired" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="scopeType" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="label" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="slotIdSupport" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TariffDescriptionDataElementsType", propOrder = {
    "tariffId",
    "commodityId",
    "measurementId",
    "tariffWriteable",
    "updateRequired",
    "scopeType",
    "label",
    "description",
    "slotIdSupport"
})
@XmlSeeAlso({
    org.openmuc.jeebus.spine.xsd.v1.IncentiveTableDescriptionElementsType.TariffDescription.class
})
public class TariffDescriptionDataElementsType implements Cloneable, CopyTo, ToString
{

    protected ElementTagType tariffId;
    protected ElementTagType commodityId;
    protected ElementTagType measurementId;
    protected ElementTagType tariffWriteable;
    protected ElementTagType updateRequired;
    protected ElementTagType scopeType;
    protected ElementTagType label;
    protected ElementTagType description;
    protected ElementTagType slotIdSupport;

    /**
     * Default no-arg constructor
     * 
     */
    public TariffDescriptionDataElementsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public TariffDescriptionDataElementsType(final ElementTagType tariffId, final ElementTagType commodityId, final ElementTagType measurementId, final ElementTagType tariffWriteable, final ElementTagType updateRequired, final ElementTagType scopeType, final ElementTagType label, final ElementTagType description, final ElementTagType slotIdSupport) {
        this.tariffId = tariffId;
        this.commodityId = commodityId;
        this.measurementId = measurementId;
        this.tariffWriteable = tariffWriteable;
        this.updateRequired = updateRequired;
        this.scopeType = scopeType;
        this.label = label;
        this.description = description;
        this.slotIdSupport = slotIdSupport;
    }

    /**
     * Gets the value of the tariffId property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getTariffId() {
        return tariffId;
    }

    /**
     * Sets the value of the tariffId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setTariffId(ElementTagType value) {
        this.tariffId = value;
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
     * Gets the value of the measurementId property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getMeasurementId() {
        return measurementId;
    }

    /**
     * Sets the value of the measurementId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setMeasurementId(ElementTagType value) {
        this.measurementId = value;
    }

    /**
     * Gets the value of the tariffWriteable property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getTariffWriteable() {
        return tariffWriteable;
    }

    /**
     * Sets the value of the tariffWriteable property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setTariffWriteable(ElementTagType value) {
        this.tariffWriteable = value;
    }

    /**
     * Gets the value of the updateRequired property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getUpdateRequired() {
        return updateRequired;
    }

    /**
     * Sets the value of the updateRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setUpdateRequired(ElementTagType value) {
        this.updateRequired = value;
    }

    /**
     * Gets the value of the scopeType property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getScopeType() {
        return scopeType;
    }

    /**
     * Sets the value of the scopeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setScopeType(ElementTagType value) {
        this.scopeType = value;
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
     * Gets the value of the slotIdSupport property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getSlotIdSupport() {
        return slotIdSupport;
    }

    /**
     * Sets the value of the slotIdSupport property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setSlotIdSupport(ElementTagType value) {
        this.slotIdSupport = value;
    }

    /**
     * Sets the value of the tariffId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public TariffDescriptionDataElementsType withTariffId(ElementTagType value) {
        setTariffId(value);
        return this;
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
    public TariffDescriptionDataElementsType withCommodityId(ElementTagType value) {
        setCommodityId(value);
        return this;
    }

    /**
     * Sets the value of the measurementId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public TariffDescriptionDataElementsType withMeasurementId(ElementTagType value) {
        setMeasurementId(value);
        return this;
    }

    /**
     * Sets the value of the tariffWriteable property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public TariffDescriptionDataElementsType withTariffWriteable(ElementTagType value) {
        setTariffWriteable(value);
        return this;
    }

    /**
     * Sets the value of the updateRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public TariffDescriptionDataElementsType withUpdateRequired(ElementTagType value) {
        setUpdateRequired(value);
        return this;
    }

    /**
     * Sets the value of the scopeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public TariffDescriptionDataElementsType withScopeType(ElementTagType value) {
        setScopeType(value);
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
    public TariffDescriptionDataElementsType withLabel(ElementTagType value) {
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
    public TariffDescriptionDataElementsType withDescription(ElementTagType value) {
        setDescription(value);
        return this;
    }

    /**
     * Sets the value of the slotIdSupport property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public TariffDescriptionDataElementsType withSlotIdSupport(ElementTagType value) {
        setSlotIdSupport(value);
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
        if (draftCopy instanceof TariffDescriptionDataElementsType) {
            final TariffDescriptionDataElementsType copy = ((TariffDescriptionDataElementsType) draftCopy);
            {
                Boolean tariffIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.tariffId!= null));
                if (tariffIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceTariffId;
                    sourceTariffId = this.getTariffId();
                    ElementTagType copyTariffId = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "tariffId", sourceTariffId), sourceTariffId, (this.tariffId!= null)));
                    copy.setTariffId(copyTariffId);
                } else {
                    if (tariffIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.tariffId = null;
                    }
                }
            }
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
                Boolean measurementIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.measurementId!= null));
                if (measurementIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceMeasurementId;
                    sourceMeasurementId = this.getMeasurementId();
                    ElementTagType copyMeasurementId = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "measurementId", sourceMeasurementId), sourceMeasurementId, (this.measurementId!= null)));
                    copy.setMeasurementId(copyMeasurementId);
                } else {
                    if (measurementIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.measurementId = null;
                    }
                }
            }
            {
                Boolean tariffWriteableShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.tariffWriteable!= null));
                if (tariffWriteableShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceTariffWriteable;
                    sourceTariffWriteable = this.getTariffWriteable();
                    ElementTagType copyTariffWriteable = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "tariffWriteable", sourceTariffWriteable), sourceTariffWriteable, (this.tariffWriteable!= null)));
                    copy.setTariffWriteable(copyTariffWriteable);
                } else {
                    if (tariffWriteableShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.tariffWriteable = null;
                    }
                }
            }
            {
                Boolean updateRequiredShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.updateRequired!= null));
                if (updateRequiredShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceUpdateRequired;
                    sourceUpdateRequired = this.getUpdateRequired();
                    ElementTagType copyUpdateRequired = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "updateRequired", sourceUpdateRequired), sourceUpdateRequired, (this.updateRequired!= null)));
                    copy.setUpdateRequired(copyUpdateRequired);
                } else {
                    if (updateRequiredShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.updateRequired = null;
                    }
                }
            }
            {
                Boolean scopeTypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.scopeType!= null));
                if (scopeTypeShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceScopeType;
                    sourceScopeType = this.getScopeType();
                    ElementTagType copyScopeType = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "scopeType", sourceScopeType), sourceScopeType, (this.scopeType!= null)));
                    copy.setScopeType(copyScopeType);
                } else {
                    if (scopeTypeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.scopeType = null;
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
            {
                Boolean slotIdSupportShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.slotIdSupport!= null));
                if (slotIdSupportShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceSlotIdSupport;
                    sourceSlotIdSupport = this.getSlotIdSupport();
                    ElementTagType copySlotIdSupport = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "slotIdSupport", sourceSlotIdSupport), sourceSlotIdSupport, (this.slotIdSupport!= null)));
                    copy.setSlotIdSupport(copySlotIdSupport);
                } else {
                    if (slotIdSupportShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.slotIdSupport = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new TariffDescriptionDataElementsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TariffDescriptionDataElementsType that = ((TariffDescriptionDataElementsType) object);
        {
            ElementTagType leftTariffId;
            leftTariffId = this.getTariffId();
            ElementTagType rightTariffId;
            rightTariffId = that.getTariffId();
            if (this.tariffId!= null) {
                if (that.tariffId!= null) {
                    if (!leftTariffId.equals(rightTariffId)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.tariffId!= null) {
                    return false;
                }
            }
        }
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
            ElementTagType leftMeasurementId;
            leftMeasurementId = this.getMeasurementId();
            ElementTagType rightMeasurementId;
            rightMeasurementId = that.getMeasurementId();
            if (this.measurementId!= null) {
                if (that.measurementId!= null) {
                    if (!leftMeasurementId.equals(rightMeasurementId)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.measurementId!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftTariffWriteable;
            leftTariffWriteable = this.getTariffWriteable();
            ElementTagType rightTariffWriteable;
            rightTariffWriteable = that.getTariffWriteable();
            if (this.tariffWriteable!= null) {
                if (that.tariffWriteable!= null) {
                    if (!leftTariffWriteable.equals(rightTariffWriteable)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.tariffWriteable!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftUpdateRequired;
            leftUpdateRequired = this.getUpdateRequired();
            ElementTagType rightUpdateRequired;
            rightUpdateRequired = that.getUpdateRequired();
            if (this.updateRequired!= null) {
                if (that.updateRequired!= null) {
                    if (!leftUpdateRequired.equals(rightUpdateRequired)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.updateRequired!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftScopeType;
            leftScopeType = this.getScopeType();
            ElementTagType rightScopeType;
            rightScopeType = that.getScopeType();
            if (this.scopeType!= null) {
                if (that.scopeType!= null) {
                    if (!leftScopeType.equals(rightScopeType)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.scopeType!= null) {
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
        {
            ElementTagType leftSlotIdSupport;
            leftSlotIdSupport = this.getSlotIdSupport();
            ElementTagType rightSlotIdSupport;
            rightSlotIdSupport = that.getSlotIdSupport();
            if (this.slotIdSupport!= null) {
                if (that.slotIdSupport!= null) {
                    if (!leftSlotIdSupport.equals(rightSlotIdSupport)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.slotIdSupport!= null) {
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
            ElementTagType theTariffId;
            theTariffId = this.getTariffId();
            if (this.tariffId!= null) {
                currentHashCode += theTariffId.hashCode();
            }
        }
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
            ElementTagType theMeasurementId;
            theMeasurementId = this.getMeasurementId();
            if (this.measurementId!= null) {
                currentHashCode += theMeasurementId.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theTariffWriteable;
            theTariffWriteable = this.getTariffWriteable();
            if (this.tariffWriteable!= null) {
                currentHashCode += theTariffWriteable.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theUpdateRequired;
            theUpdateRequired = this.getUpdateRequired();
            if (this.updateRequired!= null) {
                currentHashCode += theUpdateRequired.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theScopeType;
            theScopeType = this.getScopeType();
            if (this.scopeType!= null) {
                currentHashCode += theScopeType.hashCode();
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
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theSlotIdSupport;
            theSlotIdSupport = this.getSlotIdSupport();
            if (this.slotIdSupport!= null) {
                currentHashCode += theSlotIdSupport.hashCode();
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
            ElementTagType theTariffId;
            theTariffId = this.getTariffId();
            strategy.appendField(locator, this, "tariffId", buffer, theTariffId, (this.tariffId!= null));
        }
        {
            ElementTagType theCommodityId;
            theCommodityId = this.getCommodityId();
            strategy.appendField(locator, this, "commodityId", buffer, theCommodityId, (this.commodityId!= null));
        }
        {
            ElementTagType theMeasurementId;
            theMeasurementId = this.getMeasurementId();
            strategy.appendField(locator, this, "measurementId", buffer, theMeasurementId, (this.measurementId!= null));
        }
        {
            ElementTagType theTariffWriteable;
            theTariffWriteable = this.getTariffWriteable();
            strategy.appendField(locator, this, "tariffWriteable", buffer, theTariffWriteable, (this.tariffWriteable!= null));
        }
        {
            ElementTagType theUpdateRequired;
            theUpdateRequired = this.getUpdateRequired();
            strategy.appendField(locator, this, "updateRequired", buffer, theUpdateRequired, (this.updateRequired!= null));
        }
        {
            ElementTagType theScopeType;
            theScopeType = this.getScopeType();
            strategy.appendField(locator, this, "scopeType", buffer, theScopeType, (this.scopeType!= null));
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
        {
            ElementTagType theSlotIdSupport;
            theSlotIdSupport = this.getSlotIdSupport();
            strategy.appendField(locator, this, "slotIdSupport", buffer, theSlotIdSupport, (this.slotIdSupport!= null));
        }
        return buffer;
    }

}
