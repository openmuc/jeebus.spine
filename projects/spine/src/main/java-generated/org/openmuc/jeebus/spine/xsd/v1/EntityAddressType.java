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

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
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
 * <p>Java class for EntityAddressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityAddressType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://docs.eebus.org/spine/xsd/v1}DeviceAddressType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://docs.eebus.org/spine/xsd/v1}entity" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityAddressType", propOrder = {
    "entity"
})
@XmlSeeAlso({
    FeatureAddressType.class
})
public class EntityAddressType
    extends DeviceAddressType
    implements Cloneable, CopyTo, ToString
{

    @XmlElement(type = Long.class)
    @XmlSchemaType(name = "unsignedInt")
    protected List<Long> entity;

    /**
     * Default no-arg constructor
     * 
     */
    public EntityAddressType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public EntityAddressType(final String device, final List<Long> entity) {
        super(device);
        this.entity = entity;
    }

    /**
     * Gets the value of the entity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the entity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getEntity() {
        if (entity == null) {
            entity = new ArrayList<Long>();
        }
        return this.entity;
    }

    /**
     * Adds objects to the list of Entity using add method
     * 
     * @param values
     *     objects to add to the list Entity
     * @return
     *     The class instance
     */
    public EntityAddressType withEntity(Long... values) {
        if (values!= null) {
            for (Long value: values) {
                getEntity().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of Entity using addAll method
     * 
     * @param values
     *     objects to add to the list Entity
     * @return
     *     The class instance
     */
    public EntityAddressType withEntity(Collection<Long> values) {
        if (values!= null) {
            getEntity().addAll(values);
        }
        return this;
    }

    /**
     * Sets the value of the device property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    @Override
    public EntityAddressType withDevice(String value) {
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
        if (draftCopy instanceof EntityAddressType) {
            final EntityAddressType copy = ((EntityAddressType) draftCopy);
            {
                Boolean entityShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.entity!= null)&&(!this.entity.isEmpty())));
                if (entityShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<Long> sourceEntity;
                    sourceEntity = (((this.entity!= null)&&(!this.entity.isEmpty()))?this.getEntity():null);
                    @SuppressWarnings("unchecked")
                    List<Long> copyEntity = ((List<Long> ) strategy.copy(LocatorUtils.property(locator, "entity", sourceEntity), sourceEntity, ((this.entity!= null)&&(!this.entity.isEmpty()))));
                    copy.entity = null;
                    if (copyEntity!= null) {
                        List<Long> uniqueEntityl = copy.getEntity();
                        uniqueEntityl.addAll(copyEntity);
                    }
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
        return new EntityAddressType();
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
        final EntityAddressType that = ((EntityAddressType) object);
        {
            List<Long> leftEntity;
            leftEntity = (((this.entity!= null)&&(!this.entity.isEmpty()))?this.getEntity():null);
            List<Long> rightEntity;
            rightEntity = (((that.entity!= null)&&(!that.entity.isEmpty()))?that.getEntity():null);
            if ((this.entity!= null)&&(!this.entity.isEmpty())) {
                if ((that.entity!= null)&&(!that.entity.isEmpty())) {
                    if (!leftEntity.equals(rightEntity)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.entity!= null)&&(!that.entity.isEmpty())) {
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
            List<Long> theEntity;
            theEntity = (((this.entity!= null)&&(!this.entity.isEmpty()))?this.getEntity():null);
            if ((this.entity!= null)&&(!this.entity.isEmpty())) {
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
            List<Long> theEntity;
            theEntity = (((this.entity!= null)&&(!this.entity.isEmpty()))?this.getEntity():null);
            strategy.appendField(locator, this, "entity", buffer, theEntity, ((this.entity!= null)&&(!this.entity.isEmpty())));
        }
        return buffer;
    }

}
