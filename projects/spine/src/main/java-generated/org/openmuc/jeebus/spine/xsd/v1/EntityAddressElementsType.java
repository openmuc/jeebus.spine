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
 * <p>Java class for EntityAddressElementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityAddressElementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://docs.eebus.org/spine/xsd/v1}DeviceAddressElementsType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="entity" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityAddressElementsType", propOrder = {
    "entity"
})
@XmlSeeAlso({
    FeatureAddressElementsType.class
})
public class EntityAddressElementsType
    extends DeviceAddressElementsType
    implements Cloneable, CopyTo, ToString
{

    protected ElementTagType entity;

    /**
     * Default no-arg constructor
     * 
     */
    public EntityAddressElementsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public EntityAddressElementsType(final ElementTagType device, final ElementTagType entity) {
        super(device);
        this.entity = entity;
    }

    /**
     * Gets the value of the entity property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getEntity() {
        return entity;
    }

    /**
     * Sets the value of the entity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setEntity(ElementTagType value) {
        this.entity = value;
    }

    /**
     * Sets the value of the entity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public EntityAddressElementsType withEntity(ElementTagType value) {
        setEntity(value);
        return this;
    }

    /**
     * Sets the value of the device property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    @Override
    public EntityAddressElementsType withDevice(ElementTagType value) {
        setDevice(value);
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
        super.copyTo(locator, draftCopy, strategy);
        if (draftCopy instanceof EntityAddressElementsType) {
            final EntityAddressElementsType copy = ((EntityAddressElementsType) draftCopy);
            {
                Boolean entityShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.entity!= null));
                if (entityShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceEntity;
                    sourceEntity = this.getEntity();
                    ElementTagType copyEntity = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "entity", sourceEntity), sourceEntity, (this.entity!= null)));
                    copy.setEntity(copyEntity);
                } else {
                    if (entityShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.entity = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new EntityAddressElementsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(object)) {
            return false;
        }
        final EntityAddressElementsType that = ((EntityAddressElementsType) object);
        {
            ElementTagType leftEntity;
            leftEntity = this.getEntity();
            ElementTagType rightEntity;
            rightEntity = that.getEntity();
            if (this.entity!= null) {
                if (that.entity!= null) {
                    if (!leftEntity.equals(rightEntity)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.entity!= null) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        int currentHashCode = 1;
        currentHashCode = ((currentHashCode* 31)+ super.hashCode());
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theEntity;
            theEntity = this.getEntity();
            if (this.entity!= null) {
                currentHashCode += theEntity.hashCode();
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
        super.appendFields(locator, buffer, strategy);
        {
            ElementTagType theEntity;
            theEntity = this.getEntity();
            strategy.appendField(locator, this, "entity", buffer, theEntity, (this.entity!= null));
        }
        return buffer;
    }

}
