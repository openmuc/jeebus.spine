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
 * <p>Java class for CmdControlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CmdControlType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="delete" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="partial" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CmdControlType", propOrder = {
    "delete",
    "partial"
})
public class CmdControlType implements Cloneable, CopyTo, ToString
{

    protected ElementTagType delete;
    protected ElementTagType partial;

    /**
     * Default no-arg constructor
     * 
     */
    public CmdControlType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public CmdControlType(final ElementTagType delete, final ElementTagType partial) {
        this.delete = delete;
        this.partial = partial;
    }

    /**
     * Gets the value of the delete property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getDelete() {
        return delete;
    }

    /**
     * Sets the value of the delete property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setDelete(ElementTagType value) {
        this.delete = value;
    }

    /**
     * Gets the value of the partial property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getPartial() {
        return partial;
    }

    /**
     * Sets the value of the partial property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setPartial(ElementTagType value) {
        this.partial = value;
    }

    /**
     * Sets the value of the delete property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public CmdControlType withDelete(ElementTagType value) {
        setDelete(value);
        return this;
    }

    /**
     * Sets the value of the partial property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public CmdControlType withPartial(ElementTagType value) {
        setPartial(value);
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
        if (draftCopy instanceof CmdControlType) {
            final CmdControlType copy = ((CmdControlType) draftCopy);
            {
                Boolean deleteShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.delete!= null));
                if (deleteShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceDelete;
                    sourceDelete = this.getDelete();
                    ElementTagType copyDelete = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "delete", sourceDelete), sourceDelete, (this.delete!= null)));
                    copy.setDelete(copyDelete);
                } else {
                    if (deleteShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.delete = null;
                    }
                }
            }
            {
                Boolean partialShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.partial!= null));
                if (partialShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourcePartial;
                    sourcePartial = this.getPartial();
                    ElementTagType copyPartial = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "partial", sourcePartial), sourcePartial, (this.partial!= null)));
                    copy.setPartial(copyPartial);
                } else {
                    if (partialShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.partial = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new CmdControlType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final CmdControlType that = ((CmdControlType) object);
        {
            ElementTagType leftDelete;
            leftDelete = this.getDelete();
            ElementTagType rightDelete;
            rightDelete = that.getDelete();
            if (this.delete!= null) {
                if (that.delete!= null) {
                    if (!leftDelete.equals(rightDelete)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.delete!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftPartial;
            leftPartial = this.getPartial();
            ElementTagType rightPartial;
            rightPartial = that.getPartial();
            if (this.partial!= null) {
                if (that.partial!= null) {
                    if (!leftPartial.equals(rightPartial)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.partial!= null) {
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
            ElementTagType theDelete;
            theDelete = this.getDelete();
            if (this.delete!= null) {
                currentHashCode += theDelete.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType thePartial;
            thePartial = this.getPartial();
            if (this.partial!= null) {
                currentHashCode += thePartial.hashCode();
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
            ElementTagType theDelete;
            theDelete = this.getDelete();
            strategy.appendField(locator, this, "delete", buffer, theDelete, (this.delete!= null));
        }
        {
            ElementTagType thePartial;
            thePartial = this.getPartial();
            strategy.appendField(locator, this, "partial", buffer, thePartial, (this.partial!= null));
        }
        return buffer;
    }

}
