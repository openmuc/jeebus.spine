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
 * <p>Java class for NetworkManagementEntityDescriptionListDataSelectorsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NetworkManagementEntityDescriptionListDataSelectorsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="entityAddress" type="{http://docs.eebus.org/spine/xsd/v1}EntityAddressType" minOccurs="0"/&gt;
 *         &lt;element name="entityType" type="{http://docs.eebus.org/spine/xsd/v1}EntityTypeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkManagementEntityDescriptionListDataSelectorsType", propOrder = {
    "entityAddress",
    "entityType"
})
@XmlSeeAlso({
    org.openmuc.jeebus.spine.xsd.v1.NodeManagementDetailedDiscoveryDataSelectorsType.EntityInformation.class
})
public class NetworkManagementEntityDescriptionListDataSelectorsType implements Cloneable, CopyTo, ToString
{

    protected EntityAddressType entityAddress;
    protected String entityType;

    /**
     * Default no-arg constructor
     * 
     */
    public NetworkManagementEntityDescriptionListDataSelectorsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public NetworkManagementEntityDescriptionListDataSelectorsType(final EntityAddressType entityAddress, final String entityType) {
        this.entityAddress = entityAddress;
        this.entityType = entityType;
    }

    /**
     * Gets the value of the entityAddress property.
     * 
     * @return
     *     possible object is
     *     {@link EntityAddressType }
     *     
     */
    public EntityAddressType getEntityAddress() {
        return entityAddress;
    }

    /**
     * Sets the value of the entityAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityAddressType }
     *     
     */
    public void setEntityAddress(EntityAddressType value) {
        this.entityAddress = value;
    }

    /**
     * Gets the value of the entityType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityType() {
        return entityType;
    }

    /**
     * Sets the value of the entityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityType(String value) {
        this.entityType = value;
    }

    /**
     * Sets the value of the entityAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityAddressType }
     * @return
     *     The class instance
     */
    public NetworkManagementEntityDescriptionListDataSelectorsType withEntityAddress(EntityAddressType value) {
        setEntityAddress(value);
        return this;
    }

    /**
     * Sets the value of the entityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public NetworkManagementEntityDescriptionListDataSelectorsType withEntityType(String value) {
        setEntityType(value);
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
        if (draftCopy instanceof NetworkManagementEntityDescriptionListDataSelectorsType) {
            final NetworkManagementEntityDescriptionListDataSelectorsType copy = ((NetworkManagementEntityDescriptionListDataSelectorsType) draftCopy);
            {
                Boolean entityAddressShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.entityAddress!= null));
                if (entityAddressShouldBeCopiedAndSet == Boolean.TRUE) {
                    EntityAddressType sourceEntityAddress;
                    sourceEntityAddress = this.getEntityAddress();
                    EntityAddressType copyEntityAddress = ((EntityAddressType) strategy.copy(LocatorUtils.property(locator, "entityAddress", sourceEntityAddress), sourceEntityAddress, (this.entityAddress!= null)));
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
                    String sourceEntityType;
                    sourceEntityType = this.getEntityType();
                    String copyEntityType = ((String) strategy.copy(LocatorUtils.property(locator, "entityType", sourceEntityType), sourceEntityType, (this.entityType!= null)));
                    copy.setEntityType(copyEntityType);
                } else {
                    if (entityTypeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.entityType = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new NetworkManagementEntityDescriptionListDataSelectorsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final NetworkManagementEntityDescriptionListDataSelectorsType that = ((NetworkManagementEntityDescriptionListDataSelectorsType) object);
        {
            EntityAddressType leftEntityAddress;
            leftEntityAddress = this.getEntityAddress();
            EntityAddressType rightEntityAddress;
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
            String leftEntityType;
            leftEntityType = this.getEntityType();
            String rightEntityType;
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
        return true;
    }

    @Override
    public int hashCode() {
        int currentHashCode = 1;
        {
            currentHashCode = (currentHashCode* 31);
            EntityAddressType theEntityAddress;
            theEntityAddress = this.getEntityAddress();
            if (this.entityAddress!= null) {
                currentHashCode += theEntityAddress.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String theEntityType;
            theEntityType = this.getEntityType();
            if (this.entityType!= null) {
                currentHashCode += theEntityType.hashCode();
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
            EntityAddressType theEntityAddress;
            theEntityAddress = this.getEntityAddress();
            strategy.appendField(locator, this, "entityAddress", buffer, theEntityAddress, (this.entityAddress!= null));
        }
        {
            String theEntityType;
            theEntityType = this.getEntityType();
            strategy.appendField(locator, this, "entityType", buffer, theEntityType, (this.entityType!= null));
        }
        return buffer;
    }

}
