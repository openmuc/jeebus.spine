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
import jakarta.xml.bind.annotation.XmlElement;
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
 * <p>Java class for DatagramType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DatagramType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://docs.eebus.org/spine/xsd/v1}header"/&gt;
 *         &lt;element ref="{http://docs.eebus.org/spine/xsd/v1}payload"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatagramType", propOrder = {
    "header",
    "payload"
})
public class DatagramType implements Cloneable, CopyTo, ToString
{

    @XmlElement(required = true)
    protected HeaderType header;
    @XmlElement(required = true)
    protected PayloadType payload;

    /**
     * Default no-arg constructor
     * 
     */
    public DatagramType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public DatagramType(final HeaderType header, final PayloadType payload) {
        this.header = header;
        this.payload = payload;
    }

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link HeaderType }
     *     
     */
    public HeaderType getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link HeaderType }
     *     
     */
    public void setHeader(HeaderType value) {
        this.header = value;
    }

    /**
     * Gets the value of the payload property.
     * 
     * @return
     *     possible object is
     *     {@link PayloadType }
     *     
     */
    public PayloadType getPayload() {
        return payload;
    }

    /**
     * Sets the value of the payload property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayloadType }
     *     
     */
    public void setPayload(PayloadType value) {
        this.payload = value;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link HeaderType }
     * @return
     *     The class instance
     */
    public DatagramType withHeader(HeaderType value) {
        setHeader(value);
        return this;
    }

    /**
     * Sets the value of the payload property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayloadType }
     * @return
     *     The class instance
     */
    public DatagramType withPayload(PayloadType value) {
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
        if (draftCopy instanceof DatagramType) {
            final DatagramType copy = ((DatagramType) draftCopy);
            {
                Boolean headerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.header!= null));
                if (headerShouldBeCopiedAndSet == Boolean.TRUE) {
                    HeaderType sourceHeader;
                    sourceHeader = this.getHeader();
                    HeaderType copyHeader = ((HeaderType) strategy.copy(LocatorUtils.property(locator, "header", sourceHeader), sourceHeader, (this.header!= null)));
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
                    PayloadType sourcePayload;
                    sourcePayload = this.getPayload();
                    PayloadType copyPayload = ((PayloadType) strategy.copy(LocatorUtils.property(locator, "payload", sourcePayload), sourcePayload, (this.payload!= null)));
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
        return new DatagramType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DatagramType that = ((DatagramType) object);
        {
            HeaderType leftHeader;
            leftHeader = this.getHeader();
            HeaderType rightHeader;
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
            PayloadType leftPayload;
            leftPayload = this.getPayload();
            PayloadType rightPayload;
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
            HeaderType theHeader;
            theHeader = this.getHeader();
            if (this.header!= null) {
                currentHashCode += theHeader.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            PayloadType thePayload;
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
            HeaderType theHeader;
            theHeader = this.getHeader();
            strategy.appendField(locator, this, "header", buffer, theHeader, (this.header!= null));
        }
        {
            PayloadType thePayload;
            thePayload = this.getPayload();
            strategy.appendField(locator, this, "payload", buffer, thePayload, (this.payload!= null));
        }
        return buffer;
    }

}
