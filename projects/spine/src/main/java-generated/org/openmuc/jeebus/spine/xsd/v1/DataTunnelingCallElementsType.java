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
 * <p>Java class for DataTunnelingCallElementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataTunnelingCallElementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="header" type="{http://docs.eebus.org/spine/xsd/v1}DataTunnelingHeaderElementsType" minOccurs="0"/&gt;
 *         &lt;element name="payload" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataTunnelingCallElementsType", propOrder = {
    "header",
    "payload"
})
public class DataTunnelingCallElementsType implements Cloneable, CopyTo, ToString
{

    protected DataTunnelingHeaderElementsType header;
    protected ElementTagType payload;

    /**
     * Default no-arg constructor
     * 
     */
    public DataTunnelingCallElementsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public DataTunnelingCallElementsType(final DataTunnelingHeaderElementsType header, final ElementTagType payload) {
        this.header = header;
        this.payload = payload;
    }

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link DataTunnelingHeaderElementsType }
     *     
     */
    public DataTunnelingHeaderElementsType getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataTunnelingHeaderElementsType }
     *     
     */
    public void setHeader(DataTunnelingHeaderElementsType value) {
        this.header = value;
    }

    /**
     * Gets the value of the payload property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getPayload() {
        return payload;
    }

    /**
     * Sets the value of the payload property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setPayload(ElementTagType value) {
        this.payload = value;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataTunnelingHeaderElementsType }
     * @return
     *     The class instance
     */
    public DataTunnelingCallElementsType withHeader(DataTunnelingHeaderElementsType value) {
        setHeader(value);
        return this;
    }

    /**
     * Sets the value of the payload property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public DataTunnelingCallElementsType withPayload(ElementTagType value) {
        setPayload(value);
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
        if (draftCopy instanceof DataTunnelingCallElementsType) {
            final DataTunnelingCallElementsType copy = ((DataTunnelingCallElementsType) draftCopy);
            {
                Boolean headerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.header!= null));
                if (headerShouldBeCopiedAndSet == Boolean.TRUE) {
                    DataTunnelingHeaderElementsType sourceHeader;
                    sourceHeader = this.getHeader();
                    DataTunnelingHeaderElementsType copyHeader = ((DataTunnelingHeaderElementsType) strategy.copy(LocatorUtils.property(locator, "header", sourceHeader), sourceHeader, (this.header!= null)));
                    copy.setHeader(copyHeader);
                } else {
                    if (headerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.header = null;
                    }
                }
            }
            {
                Boolean payloadShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.payload!= null));
                if (payloadShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourcePayload;
                    sourcePayload = this.getPayload();
                    ElementTagType copyPayload = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "payload", sourcePayload), sourcePayload, (this.payload!= null)));
                    copy.setPayload(copyPayload);
                } else {
                    if (payloadShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.payload = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new DataTunnelingCallElementsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DataTunnelingCallElementsType that = ((DataTunnelingCallElementsType) object);
        {
            DataTunnelingHeaderElementsType leftHeader;
            leftHeader = this.getHeader();
            DataTunnelingHeaderElementsType rightHeader;
            rightHeader = that.getHeader();
            if (this.header!= null) {
                if (that.header!= null) {
                    if (!leftHeader.equals(rightHeader)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.header!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftPayload;
            leftPayload = this.getPayload();
            ElementTagType rightPayload;
            rightPayload = that.getPayload();
            if (this.payload!= null) {
                if (that.payload!= null) {
                    if (!leftPayload.equals(rightPayload)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.payload!= null) {
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
            DataTunnelingHeaderElementsType theHeader;
            theHeader = this.getHeader();
            if (this.header!= null) {
                currentHashCode += theHeader.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType thePayload;
            thePayload = this.getPayload();
            if (this.payload!= null) {
                currentHashCode += thePayload.hashCode();
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
            DataTunnelingHeaderElementsType theHeader;
            theHeader = this.getHeader();
            strategy.appendField(locator, this, "header", buffer, theHeader, (this.header!= null));
        }
        {
            ElementTagType thePayload;
            thePayload = this.getPayload();
            strategy.appendField(locator, this, "payload", buffer, thePayload, (this.payload!= null));
        }
        return buffer;
    }

}
