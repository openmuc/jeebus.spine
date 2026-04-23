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
 * <p>Java class for PossibleOperationsElementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PossibleOperationsElementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="read" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="write" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PossibleOperationsElementsType", propOrder = {
    "read",
    "write"
})
public class PossibleOperationsElementsType implements Cloneable, CopyTo, ToString
{

    protected ElementTagType read;
    protected ElementTagType write;

    /**
     * Default no-arg constructor
     * 
     */
    public PossibleOperationsElementsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public PossibleOperationsElementsType(final ElementTagType read, final ElementTagType write) {
        this.read = read;
        this.write = write;
    }

    /**
     * Gets the value of the read property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getRead() {
        return read;
    }

    /**
     * Sets the value of the read property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setRead(ElementTagType value) {
        this.read = value;
    }

    /**
     * Gets the value of the write property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getWrite() {
        return write;
    }

    /**
     * Sets the value of the write property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setWrite(ElementTagType value) {
        this.write = value;
    }

    /**
     * Sets the value of the read property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public PossibleOperationsElementsType withRead(ElementTagType value) {
        setRead(value);
        return this;
    }

    /**
     * Sets the value of the write property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public PossibleOperationsElementsType withWrite(ElementTagType value) {
        setWrite(value);
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
        if (draftCopy instanceof PossibleOperationsElementsType) {
            final PossibleOperationsElementsType copy = ((PossibleOperationsElementsType) draftCopy);
            {
                Boolean readShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.read!= null));
                if (readShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceRead;
                    sourceRead = this.getRead();
                    ElementTagType copyRead = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "read", sourceRead), sourceRead, (this.read!= null)));
                    copy.setRead(copyRead);
                } else {
                    if (readShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.read = null;
                    }
                }
            }
            {
                Boolean writeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.write!= null));
                if (writeShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceWrite;
                    sourceWrite = this.getWrite();
                    ElementTagType copyWrite = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "write", sourceWrite), sourceWrite, (this.write!= null)));
                    copy.setWrite(copyWrite);
                } else {
                    if (writeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.write = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new PossibleOperationsElementsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final PossibleOperationsElementsType that = ((PossibleOperationsElementsType) object);
        {
            ElementTagType leftRead;
            leftRead = this.getRead();
            ElementTagType rightRead;
            rightRead = that.getRead();
            if (this.read!= null) {
                if (that.read!= null) {
                    if (!leftRead.equals(rightRead)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.read!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftWrite;
            leftWrite = this.getWrite();
            ElementTagType rightWrite;
            rightWrite = that.getWrite();
            if (this.write!= null) {
                if (that.write!= null) {
                    if (!leftWrite.equals(rightWrite)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.write!= null) {
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
            ElementTagType theRead;
            theRead = this.getRead();
            if (this.read!= null) {
                currentHashCode += theRead.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theWrite;
            theWrite = this.getWrite();
            if (this.write!= null) {
                currentHashCode += theWrite.hashCode();
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
            ElementTagType theRead;
            theRead = this.getRead();
            strategy.appendField(locator, this, "read", buffer, theRead, (this.read!= null));
        }
        {
            ElementTagType theWrite;
            theWrite = this.getWrite();
            strategy.appendField(locator, this, "write", buffer, theWrite, (this.write!= null));
        }
        return buffer;
    }

}
