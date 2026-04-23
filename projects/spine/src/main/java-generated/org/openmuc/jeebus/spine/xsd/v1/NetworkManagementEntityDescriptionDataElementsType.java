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
 * <p>Java class for NetworkManagementEntityDescriptionDataElementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NetworkManagementEntityDescriptionDataElementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="entityAddress" type="{http://docs.eebus.org/spine/xsd/v1}EntityAddressElementsType" minOccurs="0"/&gt;
 *         &lt;element name="entityType" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="lastStateChange" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="minimumTrustLevel" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
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
@XmlType(name = "NetworkManagementEntityDescriptionDataElementsType", propOrder = {
    "entityAddress",
    "entityType",
    "lastStateChange",
    "minimumTrustLevel",
    "label",
    "description"
})
@XmlSeeAlso({
    org.openmuc.jeebus.spine.xsd.v1.NodeManagementDetailedDiscoveryEntityInformationElementsType.Description.class
})
public class NetworkManagementEntityDescriptionDataElementsType implements Cloneable, CopyTo, ToString
{

    protected EntityAddressElementsType entityAddress;
    protected ElementTagType entityType;
    protected ElementTagType lastStateChange;
    protected ElementTagType minimumTrustLevel;
    protected ElementTagType label;
    protected ElementTagType description;

    /**
     * Default no-arg constructor
     * 
     */
    public NetworkManagementEntityDescriptionDataElementsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public NetworkManagementEntityDescriptionDataElementsType(final EntityAddressElementsType entityAddress, final ElementTagType entityType, final ElementTagType lastStateChange, final ElementTagType minimumTrustLevel, final ElementTagType label, final ElementTagType description) {
        this.entityAddress = entityAddress;
        this.entityType = entityType;
        this.lastStateChange = lastStateChange;
        this.minimumTrustLevel = minimumTrustLevel;
        this.label = label;
        this.description = description;
    }

    /**
     * Gets the value of the entityAddress property.
     * 
     * @return
     *     possible object is
     *     {@link EntityAddressElementsType }
     *     
     */
    public EntityAddressElementsType getEntityAddress() {
        return entityAddress;
    }

    /**
     * Sets the value of the entityAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityAddressElementsType }
     *     
     */
    public void setEntityAddress(EntityAddressElementsType value) {
        this.entityAddress = value;
    }

    /**
     * Gets the value of the entityType property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getEntityType() {
        return entityType;
    }

    /**
     * Sets the value of the entityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setEntityType(ElementTagType value) {
        this.entityType = value;
    }

    /**
     * Gets the value of the lastStateChange property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getLastStateChange() {
        return lastStateChange;
    }

    /**
     * Sets the value of the lastStateChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setLastStateChange(ElementTagType value) {
        this.lastStateChange = value;
    }

    /**
     * Gets the value of the minimumTrustLevel property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getMinimumTrustLevel() {
        return minimumTrustLevel;
    }

    /**
     * Sets the value of the minimumTrustLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setMinimumTrustLevel(ElementTagType value) {
        this.minimumTrustLevel = value;
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
     * Sets the value of the entityAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityAddressElementsType }
     * @return
     *     The class instance
     */
    public NetworkManagementEntityDescriptionDataElementsType withEntityAddress(EntityAddressElementsType value) {
        setEntityAddress(value);
        return this;
    }

    /**
     * Sets the value of the entityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public NetworkManagementEntityDescriptionDataElementsType withEntityType(ElementTagType value) {
        setEntityType(value);
        return this;
    }

    /**
     * Sets the value of the lastStateChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public NetworkManagementEntityDescriptionDataElementsType withLastStateChange(ElementTagType value) {
        setLastStateChange(value);
        return this;
    }

    /**
     * Sets the value of the minimumTrustLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public NetworkManagementEntityDescriptionDataElementsType withMinimumTrustLevel(ElementTagType value) {
        setMinimumTrustLevel(value);
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
    public NetworkManagementEntityDescriptionDataElementsType withLabel(ElementTagType value) {
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
    public NetworkManagementEntityDescriptionDataElementsType withDescription(ElementTagType value) {
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
        if (draftCopy instanceof NetworkManagementEntityDescriptionDataElementsType) {
            final NetworkManagementEntityDescriptionDataElementsType copy = ((NetworkManagementEntityDescriptionDataElementsType) draftCopy);
            {
                Boolean entityAddressShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.entityAddress!= null));
                if (entityAddressShouldBeCopiedAndSet == Boolean.TRUE) {
                    EntityAddressElementsType sourceEntityAddress;
                    sourceEntityAddress = this.getEntityAddress();
                    EntityAddressElementsType copyEntityAddress = ((EntityAddressElementsType) strategy.copy(LocatorUtils.property(locator, "entityAddress", sourceEntityAddress), sourceEntityAddress, (this.entityAddress!= null)));
                    copy.setEntityAddress(copyEntityAddress);
                } else {
                    if (entityAddressShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.entityAddress = null;
                    }
                }
            }
            {
                Boolean entityTypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.entityType!= null));
                if (entityTypeShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceEntityType;
                    sourceEntityType = this.getEntityType();
                    ElementTagType copyEntityType = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "entityType", sourceEntityType), sourceEntityType, (this.entityType!= null)));
                    copy.setEntityType(copyEntityType);
                } else {
                    if (entityTypeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.entityType = null;
                    }
                }
            }
            {
                Boolean lastStateChangeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.lastStateChange!= null));
                if (lastStateChangeShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceLastStateChange;
                    sourceLastStateChange = this.getLastStateChange();
                    ElementTagType copyLastStateChange = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "lastStateChange", sourceLastStateChange), sourceLastStateChange, (this.lastStateChange!= null)));
                    copy.setLastStateChange(copyLastStateChange);
                } else {
                    if (lastStateChangeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.lastStateChange = null;
                    }
                }
            }
            {
                Boolean minimumTrustLevelShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.minimumTrustLevel!= null));
                if (minimumTrustLevelShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceMinimumTrustLevel;
                    sourceMinimumTrustLevel = this.getMinimumTrustLevel();
                    ElementTagType copyMinimumTrustLevel = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "minimumTrustLevel", sourceMinimumTrustLevel), sourceMinimumTrustLevel, (this.minimumTrustLevel!= null)));
                    copy.setMinimumTrustLevel(copyMinimumTrustLevel);
                } else {
                    if (minimumTrustLevelShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.minimumTrustLevel = null;
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
        return new NetworkManagementEntityDescriptionDataElementsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final NetworkManagementEntityDescriptionDataElementsType that = ((NetworkManagementEntityDescriptionDataElementsType) object);
        {
            EntityAddressElementsType leftEntityAddress;
            leftEntityAddress = this.getEntityAddress();
            EntityAddressElementsType rightEntityAddress;
            rightEntityAddress = that.getEntityAddress();
            if (this.entityAddress!= null) {
                if (that.entityAddress!= null) {
                    if (!leftEntityAddress.equals(rightEntityAddress)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.entityAddress!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftEntityType;
            leftEntityType = this.getEntityType();
            ElementTagType rightEntityType;
            rightEntityType = that.getEntityType();
            if (this.entityType!= null) {
                if (that.entityType!= null) {
                    if (!leftEntityType.equals(rightEntityType)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.entityType!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftLastStateChange;
            leftLastStateChange = this.getLastStateChange();
            ElementTagType rightLastStateChange;
            rightLastStateChange = that.getLastStateChange();
            if (this.lastStateChange!= null) {
                if (that.lastStateChange!= null) {
                    if (!leftLastStateChange.equals(rightLastStateChange)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.lastStateChange!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftMinimumTrustLevel;
            leftMinimumTrustLevel = this.getMinimumTrustLevel();
            ElementTagType rightMinimumTrustLevel;
            rightMinimumTrustLevel = that.getMinimumTrustLevel();
            if (this.minimumTrustLevel!= null) {
                if (that.minimumTrustLevel!= null) {
                    if (!leftMinimumTrustLevel.equals(rightMinimumTrustLevel)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.minimumTrustLevel!= null) {
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
            EntityAddressElementsType theEntityAddress;
            theEntityAddress = this.getEntityAddress();
            if (this.entityAddress!= null) {
                currentHashCode += theEntityAddress.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theEntityType;
            theEntityType = this.getEntityType();
            if (this.entityType!= null) {
                currentHashCode += theEntityType.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theLastStateChange;
            theLastStateChange = this.getLastStateChange();
            if (this.lastStateChange!= null) {
                currentHashCode += theLastStateChange.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theMinimumTrustLevel;
            theMinimumTrustLevel = this.getMinimumTrustLevel();
            if (this.minimumTrustLevel!= null) {
                currentHashCode += theMinimumTrustLevel.hashCode();
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
            EntityAddressElementsType theEntityAddress;
            theEntityAddress = this.getEntityAddress();
            strategy.appendField(locator, this, "entityAddress", buffer, theEntityAddress, (this.entityAddress!= null));
        }
        {
            ElementTagType theEntityType;
            theEntityType = this.getEntityType();
            strategy.appendField(locator, this, "entityType", buffer, theEntityType, (this.entityType!= null));
        }
        {
            ElementTagType theLastStateChange;
            theLastStateChange = this.getLastStateChange();
            strategy.appendField(locator, this, "lastStateChange", buffer, theLastStateChange, (this.lastStateChange!= null));
        }
        {
            ElementTagType theMinimumTrustLevel;
            theMinimumTrustLevel = this.getMinimumTrustLevel();
            strategy.appendField(locator, this, "minimumTrustLevel", buffer, theMinimumTrustLevel, (this.minimumTrustLevel!= null));
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
