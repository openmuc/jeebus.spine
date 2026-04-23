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
 * <p>Java class for LoadControlNodeDataElementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoadControlNodeDataElementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="isNodeRemoteControllable" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoadControlNodeDataElementsType", propOrder = {
    "isNodeRemoteControllable"
})
public class LoadControlNodeDataElementsType implements Cloneable, CopyTo, ToString
{

    protected ElementTagType isNodeRemoteControllable;

    /**
     * Default no-arg constructor
     * 
     */
    public LoadControlNodeDataElementsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public LoadControlNodeDataElementsType(final ElementTagType isNodeRemoteControllable) {
        this.isNodeRemoteControllable = isNodeRemoteControllable;
    }

    /**
     * Gets the value of the isNodeRemoteControllable property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getIsNodeRemoteControllable() {
        return isNodeRemoteControllable;
    }

    /**
     * Sets the value of the isNodeRemoteControllable property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setIsNodeRemoteControllable(ElementTagType value) {
        this.isNodeRemoteControllable = value;
    }

    /**
     * Sets the value of the isNodeRemoteControllable property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public LoadControlNodeDataElementsType withIsNodeRemoteControllable(ElementTagType value) {
        setIsNodeRemoteControllable(value);
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
        if (draftCopy instanceof LoadControlNodeDataElementsType) {
            final LoadControlNodeDataElementsType copy = ((LoadControlNodeDataElementsType) draftCopy);
            {
                Boolean isNodeRemoteControllableShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.isNodeRemoteControllable!= null));
                if (isNodeRemoteControllableShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceIsNodeRemoteControllable;
                    sourceIsNodeRemoteControllable = this.getIsNodeRemoteControllable();
                    ElementTagType copyIsNodeRemoteControllable = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "isNodeRemoteControllable", sourceIsNodeRemoteControllable), sourceIsNodeRemoteControllable, (this.isNodeRemoteControllable!= null)));
                    copy.setIsNodeRemoteControllable(copyIsNodeRemoteControllable);
                } else {
                    if (isNodeRemoteControllableShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.isNodeRemoteControllable = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new LoadControlNodeDataElementsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final LoadControlNodeDataElementsType that = ((LoadControlNodeDataElementsType) object);
        {
            ElementTagType leftIsNodeRemoteControllable;
            leftIsNodeRemoteControllable = this.getIsNodeRemoteControllable();
            ElementTagType rightIsNodeRemoteControllable;
            rightIsNodeRemoteControllable = that.getIsNodeRemoteControllable();
            if (this.isNodeRemoteControllable!= null) {
                if (that.isNodeRemoteControllable!= null) {
                    if (!leftIsNodeRemoteControllable.equals(rightIsNodeRemoteControllable)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.isNodeRemoteControllable!= null) {
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
            ElementTagType theIsNodeRemoteControllable;
            theIsNodeRemoteControllable = this.getIsNodeRemoteControllable();
            if (this.isNodeRemoteControllable!= null) {
                currentHashCode += theIsNodeRemoteControllable.hashCode();
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
            ElementTagType theIsNodeRemoteControllable;
            theIsNodeRemoteControllable = this.getIsNodeRemoteControllable();
            strategy.appendField(locator, this, "isNodeRemoteControllable", buffer, theIsNodeRemoteControllable, (this.isNodeRemoteControllable!= null));
        }
        return buffer;
    }

}
