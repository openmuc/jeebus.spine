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
 * <p>Java class for TierBoundaryDescriptionDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TierBoundaryDescriptionDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="boundaryId" type="{http://docs.eebus.org/spine/xsd/v1}TierBoundaryIdType" minOccurs="0"/&gt;
 *         &lt;element name="boundaryType" type="{http://docs.eebus.org/spine/xsd/v1}TierBoundaryTypeType" minOccurs="0"/&gt;
 *         &lt;element name="validForTierId" type="{http://docs.eebus.org/spine/xsd/v1}TierIdType" minOccurs="0"/&gt;
 *         &lt;element name="switchToTierIdWhenLower" type="{http://docs.eebus.org/spine/xsd/v1}TierIdType" minOccurs="0"/&gt;
 *         &lt;element name="switchToTierIdWhenHigher" type="{http://docs.eebus.org/spine/xsd/v1}TierIdType" minOccurs="0"/&gt;
 *         &lt;element name="boundaryUnit" type="{http://docs.eebus.org/spine/xsd/v1}UnitOfMeasurementType" minOccurs="0"/&gt;
 *         &lt;element name="label" type="{http://docs.eebus.org/spine/xsd/v1}LabelType" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://docs.eebus.org/spine/xsd/v1}DescriptionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TierBoundaryDescriptionDataType", propOrder = {
    "boundaryId",
    "boundaryType",
    "validForTierId",
    "switchToTierIdWhenLower",
    "switchToTierIdWhenHigher",
    "boundaryUnit",
    "label",
    "description"
})
@XmlSeeAlso({
    org.openmuc.jeebus.spine.xsd.v1.IncentiveTableDescriptionTierType.BoundaryDescription.class
})
public class TierBoundaryDescriptionDataType implements Cloneable, CopyTo, ToString
{

    @XmlSchemaType(name = "unsignedInt")
    protected Long boundaryId;
    protected String boundaryType;
    @XmlSchemaType(name = "unsignedInt")
    protected Long validForTierId;
    @XmlSchemaType(name = "unsignedInt")
    protected Long switchToTierIdWhenLower;
    @XmlSchemaType(name = "unsignedInt")
    protected Long switchToTierIdWhenHigher;
    protected String boundaryUnit;
    protected String label;
    protected String description;

    /**
     * Default no-arg constructor
     * 
     */
    public TierBoundaryDescriptionDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public TierBoundaryDescriptionDataType(final Long boundaryId, final String boundaryType, final Long validForTierId, final Long switchToTierIdWhenLower, final Long switchToTierIdWhenHigher, final String boundaryUnit, final String label, final String description) {
        this.boundaryId = boundaryId;
        this.boundaryType = boundaryType;
        this.validForTierId = validForTierId;
        this.switchToTierIdWhenLower = switchToTierIdWhenLower;
        this.switchToTierIdWhenHigher = switchToTierIdWhenHigher;
        this.boundaryUnit = boundaryUnit;
        this.label = label;
        this.description = description;
    }

    /**
     * Gets the value of the boundaryId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBoundaryId() {
        return boundaryId;
    }

    /**
     * Sets the value of the boundaryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBoundaryId(Long value) {
        this.boundaryId = value;
    }

    /**
     * Gets the value of the boundaryType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoundaryType() {
        return boundaryType;
    }

    /**
     * Sets the value of the boundaryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoundaryType(String value) {
        this.boundaryType = value;
    }

    /**
     * Gets the value of the validForTierId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getValidForTierId() {
        return validForTierId;
    }

    /**
     * Sets the value of the validForTierId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setValidForTierId(Long value) {
        this.validForTierId = value;
    }

    /**
     * Gets the value of the switchToTierIdWhenLower property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSwitchToTierIdWhenLower() {
        return switchToTierIdWhenLower;
    }

    /**
     * Sets the value of the switchToTierIdWhenLower property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSwitchToTierIdWhenLower(Long value) {
        this.switchToTierIdWhenLower = value;
    }

    /**
     * Gets the value of the switchToTierIdWhenHigher property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSwitchToTierIdWhenHigher() {
        return switchToTierIdWhenHigher;
    }

    /**
     * Sets the value of the switchToTierIdWhenHigher property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSwitchToTierIdWhenHigher(Long value) {
        this.switchToTierIdWhenHigher = value;
    }

    /**
     * Gets the value of the boundaryUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoundaryUnit() {
        return boundaryUnit;
    }

    /**
     * Sets the value of the boundaryUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoundaryUnit(String value) {
        this.boundaryUnit = value;
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
     * Sets the value of the boundaryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     * @return
     *     The class instance
     */
    public TierBoundaryDescriptionDataType withBoundaryId(Long value) {
        setBoundaryId(value);
        return this;
    }

    /**
     * Sets the value of the boundaryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public TierBoundaryDescriptionDataType withBoundaryType(String value) {
        setBoundaryType(value);
        return this;
    }

    /**
     * Sets the value of the validForTierId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     * @return
     *     The class instance
     */
    public TierBoundaryDescriptionDataType withValidForTierId(Long value) {
        setValidForTierId(value);
        return this;
    }

    /**
     * Sets the value of the switchToTierIdWhenLower property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     * @return
     *     The class instance
     */
    public TierBoundaryDescriptionDataType withSwitchToTierIdWhenLower(Long value) {
        setSwitchToTierIdWhenLower(value);
        return this;
    }

    /**
     * Sets the value of the switchToTierIdWhenHigher property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     * @return
     *     The class instance
     */
    public TierBoundaryDescriptionDataType withSwitchToTierIdWhenHigher(Long value) {
        setSwitchToTierIdWhenHigher(value);
        return this;
    }

    /**
     * Sets the value of the boundaryUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public TierBoundaryDescriptionDataType withBoundaryUnit(String value) {
        setBoundaryUnit(value);
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
    public TierBoundaryDescriptionDataType withLabel(String value) {
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
    public TierBoundaryDescriptionDataType withDescription(String value) {
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
        if (draftCopy instanceof TierBoundaryDescriptionDataType) {
            final TierBoundaryDescriptionDataType copy = ((TierBoundaryDescriptionDataType) draftCopy);
            {
                Boolean boundaryIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.boundaryId!= null));
                if (boundaryIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceBoundaryId;
                    sourceBoundaryId = this.getBoundaryId();
                    Long copyBoundaryId = ((Long) strategy.copy(LocatorUtils.property(locator, "boundaryId", sourceBoundaryId), sourceBoundaryId, (this.boundaryId!= null)));
                    copy.setBoundaryId(copyBoundaryId);
                } else {
                    if (boundaryIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.boundaryId = null;
                    }
                }
            }
            {
                Boolean boundaryTypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.boundaryType!= null));
                if (boundaryTypeShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceBoundaryType;
                    sourceBoundaryType = this.getBoundaryType();
                    String copyBoundaryType = ((String) strategy.copy(LocatorUtils.property(locator, "boundaryType", sourceBoundaryType), sourceBoundaryType, (this.boundaryType!= null)));
                    copy.setBoundaryType(copyBoundaryType);
                } else {
                    if (boundaryTypeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.boundaryType = null;
                    }
                }
            }
            {
                Boolean validForTierIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.validForTierId!= null));
                if (validForTierIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceValidForTierId;
                    sourceValidForTierId = this.getValidForTierId();
                    Long copyValidForTierId = ((Long) strategy.copy(LocatorUtils.property(locator, "validForTierId", sourceValidForTierId), sourceValidForTierId, (this.validForTierId!= null)));
                    copy.setValidForTierId(copyValidForTierId);
                } else {
                    if (validForTierIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.validForTierId = null;
                    }
                }
            }
            {
                Boolean switchToTierIdWhenLowerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.switchToTierIdWhenLower!= null));
                if (switchToTierIdWhenLowerShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceSwitchToTierIdWhenLower;
                    sourceSwitchToTierIdWhenLower = this.getSwitchToTierIdWhenLower();
                    Long copySwitchToTierIdWhenLower = ((Long) strategy.copy(LocatorUtils.property(locator, "switchToTierIdWhenLower", sourceSwitchToTierIdWhenLower), sourceSwitchToTierIdWhenLower, (this.switchToTierIdWhenLower!= null)));
                    copy.setSwitchToTierIdWhenLower(copySwitchToTierIdWhenLower);
                } else {
                    if (switchToTierIdWhenLowerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.switchToTierIdWhenLower = null;
                    }
                }
            }
            {
                Boolean switchToTierIdWhenHigherShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.switchToTierIdWhenHigher!= null));
                if (switchToTierIdWhenHigherShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceSwitchToTierIdWhenHigher;
                    sourceSwitchToTierIdWhenHigher = this.getSwitchToTierIdWhenHigher();
                    Long copySwitchToTierIdWhenHigher = ((Long) strategy.copy(LocatorUtils.property(locator, "switchToTierIdWhenHigher", sourceSwitchToTierIdWhenHigher), sourceSwitchToTierIdWhenHigher, (this.switchToTierIdWhenHigher!= null)));
                    copy.setSwitchToTierIdWhenHigher(copySwitchToTierIdWhenHigher);
                } else {
                    if (switchToTierIdWhenHigherShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.switchToTierIdWhenHigher = null;
                    }
                }
            }
            {
                Boolean boundaryUnitShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.boundaryUnit!= null));
                if (boundaryUnitShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceBoundaryUnit;
                    sourceBoundaryUnit = this.getBoundaryUnit();
                    String copyBoundaryUnit = ((String) strategy.copy(LocatorUtils.property(locator, "boundaryUnit", sourceBoundaryUnit), sourceBoundaryUnit, (this.boundaryUnit!= null)));
                    copy.setBoundaryUnit(copyBoundaryUnit);
                } else {
                    if (boundaryUnitShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.boundaryUnit = null;
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
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new TierBoundaryDescriptionDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TierBoundaryDescriptionDataType that = ((TierBoundaryDescriptionDataType) object);
        {
            Long leftBoundaryId;
            leftBoundaryId = this.getBoundaryId();
            Long rightBoundaryId;
            rightBoundaryId = that.getBoundaryId();
            if (this.boundaryId!= null) {
                if (that.boundaryId!= null) {
                    if (!leftBoundaryId.equals(rightBoundaryId)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.boundaryId!= null) {
                    return false;
                }
            }
        }
        {
            String leftBoundaryType;
            leftBoundaryType = this.getBoundaryType();
            String rightBoundaryType;
            rightBoundaryType = that.getBoundaryType();
            if (this.boundaryType!= null) {
                if (that.boundaryType!= null) {
                    if (!leftBoundaryType.equals(rightBoundaryType)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.boundaryType!= null) {
                    return false;
                }
            }
        }
        {
            Long leftValidForTierId;
            leftValidForTierId = this.getValidForTierId();
            Long rightValidForTierId;
            rightValidForTierId = that.getValidForTierId();
            if (this.validForTierId!= null) {
                if (that.validForTierId!= null) {
                    if (!leftValidForTierId.equals(rightValidForTierId)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.validForTierId!= null) {
                    return false;
                }
            }
        }
        {
            Long leftSwitchToTierIdWhenLower;
            leftSwitchToTierIdWhenLower = this.getSwitchToTierIdWhenLower();
            Long rightSwitchToTierIdWhenLower;
            rightSwitchToTierIdWhenLower = that.getSwitchToTierIdWhenLower();
            if (this.switchToTierIdWhenLower!= null) {
                if (that.switchToTierIdWhenLower!= null) {
                    if (!leftSwitchToTierIdWhenLower.equals(rightSwitchToTierIdWhenLower)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.switchToTierIdWhenLower!= null) {
                    return false;
                }
            }
        }
        {
            Long leftSwitchToTierIdWhenHigher;
            leftSwitchToTierIdWhenHigher = this.getSwitchToTierIdWhenHigher();
            Long rightSwitchToTierIdWhenHigher;
            rightSwitchToTierIdWhenHigher = that.getSwitchToTierIdWhenHigher();
            if (this.switchToTierIdWhenHigher!= null) {
                if (that.switchToTierIdWhenHigher!= null) {
                    if (!leftSwitchToTierIdWhenHigher.equals(rightSwitchToTierIdWhenHigher)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.switchToTierIdWhenHigher!= null) {
                    return false;
                }
            }
        }
        {
            String leftBoundaryUnit;
            leftBoundaryUnit = this.getBoundaryUnit();
            String rightBoundaryUnit;
            rightBoundaryUnit = that.getBoundaryUnit();
            if (this.boundaryUnit!= null) {
                if (that.boundaryUnit!= null) {
                    if (!leftBoundaryUnit.equals(rightBoundaryUnit)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.boundaryUnit!= null) {
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
        return true;
    }

    @Override
    public int hashCode() {
        int currentHashCode = 1;
        {
            currentHashCode = (currentHashCode* 31);
            Long theBoundaryId;
            theBoundaryId = this.getBoundaryId();
            if (this.boundaryId!= null) {
                currentHashCode += theBoundaryId.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String theBoundaryType;
            theBoundaryType = this.getBoundaryType();
            if (this.boundaryType!= null) {
                currentHashCode += theBoundaryType.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            Long theValidForTierId;
            theValidForTierId = this.getValidForTierId();
            if (this.validForTierId!= null) {
                currentHashCode += theValidForTierId.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            Long theSwitchToTierIdWhenLower;
            theSwitchToTierIdWhenLower = this.getSwitchToTierIdWhenLower();
            if (this.switchToTierIdWhenLower!= null) {
                currentHashCode += theSwitchToTierIdWhenLower.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            Long theSwitchToTierIdWhenHigher;
            theSwitchToTierIdWhenHigher = this.getSwitchToTierIdWhenHigher();
            if (this.switchToTierIdWhenHigher!= null) {
                currentHashCode += theSwitchToTierIdWhenHigher.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String theBoundaryUnit;
            theBoundaryUnit = this.getBoundaryUnit();
            if (this.boundaryUnit!= null) {
                currentHashCode += theBoundaryUnit.hashCode();
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
            Long theBoundaryId;
            theBoundaryId = this.getBoundaryId();
            strategy.appendField(locator, this, "boundaryId", buffer, theBoundaryId, (this.boundaryId!= null));
        }
        {
            String theBoundaryType;
            theBoundaryType = this.getBoundaryType();
            strategy.appendField(locator, this, "boundaryType", buffer, theBoundaryType, (this.boundaryType!= null));
        }
        {
            Long theValidForTierId;
            theValidForTierId = this.getValidForTierId();
            strategy.appendField(locator, this, "validForTierId", buffer, theValidForTierId, (this.validForTierId!= null));
        }
        {
            Long theSwitchToTierIdWhenLower;
            theSwitchToTierIdWhenLower = this.getSwitchToTierIdWhenLower();
            strategy.appendField(locator, this, "switchToTierIdWhenLower", buffer, theSwitchToTierIdWhenLower, (this.switchToTierIdWhenLower!= null));
        }
        {
            Long theSwitchToTierIdWhenHigher;
            theSwitchToTierIdWhenHigher = this.getSwitchToTierIdWhenHigher();
            strategy.appendField(locator, this, "switchToTierIdWhenHigher", buffer, theSwitchToTierIdWhenHigher, (this.switchToTierIdWhenHigher!= null));
        }
        {
            String theBoundaryUnit;
            theBoundaryUnit = this.getBoundaryUnit();
            strategy.appendField(locator, this, "boundaryUnit", buffer, theBoundaryUnit, (this.boundaryUnit!= null));
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
        return buffer;
    }

}
