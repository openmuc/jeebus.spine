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
import jakarta.xml.bind.annotation.XmlSchemaType;
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
 * <p>Java class for TariffDescriptionDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TariffDescriptionDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tariffId" type="{http://docs.eebus.org/spine/xsd/v1}TariffIdType" minOccurs="0"/&gt;
 *         &lt;element name="commodityId" type="{http://docs.eebus.org/spine/xsd/v1}CommodityIdType" minOccurs="0"/&gt;
 *         &lt;element name="measurementId" type="{http://docs.eebus.org/spine/xsd/v1}MeasurementIdType" minOccurs="0"/&gt;
 *         &lt;element name="tariffWriteable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="updateRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="scopeType" type="{http://docs.eebus.org/spine/xsd/v1}ScopeTypeType" minOccurs="0"/&gt;
 *         &lt;element name="label" type="{http://docs.eebus.org/spine/xsd/v1}LabelType" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://docs.eebus.org/spine/xsd/v1}DescriptionType" minOccurs="0"/&gt;
 *         &lt;element name="slotIdSupport" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TariffDescriptionDataType", propOrder = {
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
    org.openmuc.jeebus.spine.xsd.v1.IncentiveTableDescriptionType.TariffDescription.class
})
public class TariffDescriptionDataType implements Cloneable, CopyTo, ToString
{

    @XmlSchemaType(name = "unsignedInt")
    protected Long tariffId;
    @XmlSchemaType(name = "unsignedInt")
    protected Long commodityId;
    @XmlSchemaType(name = "unsignedInt")
    protected Long measurementId;
    protected Boolean tariffWriteable;
    protected Boolean updateRequired;
    protected String scopeType;
    protected String label;
    protected String description;
    protected Boolean slotIdSupport;

    /**
     * Default no-arg constructor
     * 
     */
    public TariffDescriptionDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public TariffDescriptionDataType(final Long tariffId, final Long commodityId, final Long measurementId, final Boolean tariffWriteable, final Boolean updateRequired, final String scopeType, final String label, final String description, final Boolean slotIdSupport) {
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
     *     {@link Long }
     *     
     */
    public Long getTariffId() {
        return tariffId;
    }

    /**
     * Sets the value of the tariffId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTariffId(Long value) {
        this.tariffId = value;
    }

    /**
     * Gets the value of the commodityId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCommodityId() {
        return commodityId;
    }

    /**
     * Sets the value of the commodityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCommodityId(Long value) {
        this.commodityId = value;
    }

    /**
     * Gets the value of the measurementId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMeasurementId() {
        return measurementId;
    }

    /**
     * Sets the value of the measurementId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMeasurementId(Long value) {
        this.measurementId = value;
    }

    /**
     * Gets the value of the tariffWriteable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getTariffWriteable() {
        return tariffWriteable;
    }

    /**
     * Sets the value of the tariffWriteable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTariffWriteable(Boolean value) {
        this.tariffWriteable = value;
    }

    /**
     * Gets the value of the updateRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getUpdateRequired() {
        return updateRequired;
    }

    /**
     * Sets the value of the updateRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUpdateRequired(Boolean value) {
        this.updateRequired = value;
    }

    /**
     * Gets the value of the scopeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScopeType() {
        return scopeType;
    }

    /**
     * Sets the value of the scopeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScopeType(String value) {
        this.scopeType = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the slotIdSupport property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getSlotIdSupport() {
        return slotIdSupport;
    }

    /**
     * Sets the value of the slotIdSupport property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSlotIdSupport(Boolean value) {
        this.slotIdSupport = value;
    }

    /**
     * Sets the value of the tariffId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     * @return
     *     The class instance
     */
    public TariffDescriptionDataType withTariffId(Long value) {
        setTariffId(value);
        return this;
    }

    /**
     * Sets the value of the commodityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     * @return
     *     The class instance
     */
    public TariffDescriptionDataType withCommodityId(Long value) {
        setCommodityId(value);
        return this;
    }

    /**
     * Sets the value of the measurementId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     * @return
     *     The class instance
     */
    public TariffDescriptionDataType withMeasurementId(Long value) {
        setMeasurementId(value);
        return this;
    }

    /**
     * Sets the value of the tariffWriteable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     * @return
     *     The class instance
     */
    public TariffDescriptionDataType withTariffWriteable(Boolean value) {
        setTariffWriteable(value);
        return this;
    }

    /**
     * Sets the value of the updateRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     * @return
     *     The class instance
     */
    public TariffDescriptionDataType withUpdateRequired(Boolean value) {
        setUpdateRequired(value);
        return this;
    }

    /**
     * Sets the value of the scopeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public TariffDescriptionDataType withScopeType(String value) {
        setScopeType(value);
        return this;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public TariffDescriptionDataType withLabel(String value) {
        setLabel(value);
        return this;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public TariffDescriptionDataType withDescription(String value) {
        setDescription(value);
        return this;
    }

    /**
     * Sets the value of the slotIdSupport property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     * @return
     *     The class instance
     */
    public TariffDescriptionDataType withSlotIdSupport(Boolean value) {
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
        if (draftCopy instanceof TariffDescriptionDataType) {
            final TariffDescriptionDataType copy = ((TariffDescriptionDataType) draftCopy);
            {
                Boolean tariffIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.tariffId!= null));
                if (tariffIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceTariffId;
                    sourceTariffId = this.getTariffId();
                    Long copyTariffId = ((Long) strategy.copy(LocatorUtils.property(locator, "tariffId", sourceTariffId), sourceTariffId, (this.tariffId!= null)));
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
                    Long sourceCommodityId;
                    sourceCommodityId = this.getCommodityId();
                    Long copyCommodityId = ((Long) strategy.copy(LocatorUtils.property(locator, "commodityId", sourceCommodityId), sourceCommodityId, (this.commodityId!= null)));
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
                    Long sourceMeasurementId;
                    sourceMeasurementId = this.getMeasurementId();
                    Long copyMeasurementId = ((Long) strategy.copy(LocatorUtils.property(locator, "measurementId", sourceMeasurementId), sourceMeasurementId, (this.measurementId!= null)));
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
                    Boolean sourceTariffWriteable;
                    sourceTariffWriteable = this.getTariffWriteable();
                    Boolean copyTariffWriteable = ((Boolean) strategy.copy(LocatorUtils.property(locator, "tariffWriteable", sourceTariffWriteable), sourceTariffWriteable, (this.tariffWriteable!= null)));
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
                    Boolean sourceUpdateRequired;
                    sourceUpdateRequired = this.getUpdateRequired();
                    Boolean copyUpdateRequired = ((Boolean) strategy.copy(LocatorUtils.property(locator, "updateRequired", sourceUpdateRequired), sourceUpdateRequired, (this.updateRequired!= null)));
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
                    String sourceScopeType;
                    sourceScopeType = this.getScopeType();
                    String copyScopeType = ((String) strategy.copy(LocatorUtils.property(locator, "scopeType", sourceScopeType), sourceScopeType, (this.scopeType!= null)));
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
                    String sourceLabel;
                    sourceLabel = this.getLabel();
                    String copyLabel = ((String) strategy.copy(LocatorUtils.property(locator, "label", sourceLabel), sourceLabel, (this.label!= null)));
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
                    String sourceDescription;
                    sourceDescription = this.getDescription();
                    String copyDescription = ((String) strategy.copy(LocatorUtils.property(locator, "description", sourceDescription), sourceDescription, (this.description!= null)));
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
                    Boolean sourceSlotIdSupport;
                    sourceSlotIdSupport = this.getSlotIdSupport();
                    Boolean copySlotIdSupport = ((Boolean) strategy.copy(LocatorUtils.property(locator, "slotIdSupport", sourceSlotIdSupport), sourceSlotIdSupport, (this.slotIdSupport!= null)));
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
        return new TariffDescriptionDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TariffDescriptionDataType that = ((TariffDescriptionDataType) object);
        {
            Long leftTariffId;
            leftTariffId = this.getTariffId();
            Long rightTariffId;
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
            Long leftCommodityId;
            leftCommodityId = this.getCommodityId();
            Long rightCommodityId;
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
            Long leftMeasurementId;
            leftMeasurementId = this.getMeasurementId();
            Long rightMeasurementId;
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
            Boolean leftTariffWriteable;
            leftTariffWriteable = this.getTariffWriteable();
            Boolean rightTariffWriteable;
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
            Boolean leftUpdateRequired;
            leftUpdateRequired = this.getUpdateRequired();
            Boolean rightUpdateRequired;
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
            String leftScopeType;
            leftScopeType = this.getScopeType();
            String rightScopeType;
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
            String leftLabel;
            leftLabel = this.getLabel();
            String rightLabel;
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
            String leftDescription;
            leftDescription = this.getDescription();
            String rightDescription;
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
            Boolean leftSlotIdSupport;
            leftSlotIdSupport = this.getSlotIdSupport();
            Boolean rightSlotIdSupport;
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
            Long theTariffId;
            theTariffId = this.getTariffId();
            if (this.tariffId!= null) {
                currentHashCode += theTariffId.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            Long theCommodityId;
            theCommodityId = this.getCommodityId();
            if (this.commodityId!= null) {
                currentHashCode += theCommodityId.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            Long theMeasurementId;
            theMeasurementId = this.getMeasurementId();
            if (this.measurementId!= null) {
                currentHashCode += theMeasurementId.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            Boolean theTariffWriteable;
            theTariffWriteable = this.getTariffWriteable();
            if (this.tariffWriteable!= null) {
                currentHashCode += theTariffWriteable.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            Boolean theUpdateRequired;
            theUpdateRequired = this.getUpdateRequired();
            if (this.updateRequired!= null) {
                currentHashCode += theUpdateRequired.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String theScopeType;
            theScopeType = this.getScopeType();
            if (this.scopeType!= null) {
                currentHashCode += theScopeType.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String theLabel;
            theLabel = this.getLabel();
            if (this.label!= null) {
                currentHashCode += theLabel.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String theDescription;
            theDescription = this.getDescription();
            if (this.description!= null) {
                currentHashCode += theDescription.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            Boolean theSlotIdSupport;
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
            Long theTariffId;
            theTariffId = this.getTariffId();
            strategy.appendField(locator, this, "tariffId", buffer, theTariffId, (this.tariffId!= null));
        }
        {
            Long theCommodityId;
            theCommodityId = this.getCommodityId();
            strategy.appendField(locator, this, "commodityId", buffer, theCommodityId, (this.commodityId!= null));
        }
        {
            Long theMeasurementId;
            theMeasurementId = this.getMeasurementId();
            strategy.appendField(locator, this, "measurementId", buffer, theMeasurementId, (this.measurementId!= null));
        }
        {
            Boolean theTariffWriteable;
            theTariffWriteable = this.getTariffWriteable();
            strategy.appendField(locator, this, "tariffWriteable", buffer, theTariffWriteable, (this.tariffWriteable!= null));
        }
        {
            Boolean theUpdateRequired;
            theUpdateRequired = this.getUpdateRequired();
            strategy.appendField(locator, this, "updateRequired", buffer, theUpdateRequired, (this.updateRequired!= null));
        }
        {
            String theScopeType;
            theScopeType = this.getScopeType();
            strategy.appendField(locator, this, "scopeType", buffer, theScopeType, (this.scopeType!= null));
        }
        {
            String theLabel;
            theLabel = this.getLabel();
            strategy.appendField(locator, this, "label", buffer, theLabel, (this.label!= null));
        }
        {
            String theDescription;
            theDescription = this.getDescription();
            strategy.appendField(locator, this, "description", buffer, theDescription, (this.description!= null));
        }
        {
            Boolean theSlotIdSupport;
            theSlotIdSupport = this.getSlotIdSupport();
            strategy.appendField(locator, this, "slotIdSupport", buffer, theSlotIdSupport, (this.slotIdSupport!= null));
        }
        return buffer;
    }

}
