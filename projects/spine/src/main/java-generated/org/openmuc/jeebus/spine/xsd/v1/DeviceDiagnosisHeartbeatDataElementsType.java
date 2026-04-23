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
 * <p>Java class for DeviceDiagnosisHeartbeatDataElementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeviceDiagnosisHeartbeatDataElementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="timestamp" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="heartbeatCounter" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="heartbeatTimeout" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceDiagnosisHeartbeatDataElementsType", propOrder = {
    "timestamp",
    "heartbeatCounter",
    "heartbeatTimeout"
})
public class DeviceDiagnosisHeartbeatDataElementsType implements Cloneable, CopyTo, ToString
{

    protected ElementTagType timestamp;
    protected ElementTagType heartbeatCounter;
    protected ElementTagType heartbeatTimeout;

    /**
     * Default no-arg constructor
     * 
     */
    public DeviceDiagnosisHeartbeatDataElementsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public DeviceDiagnosisHeartbeatDataElementsType(final ElementTagType timestamp, final ElementTagType heartbeatCounter, final ElementTagType heartbeatTimeout) {
        this.timestamp = timestamp;
        this.heartbeatCounter = heartbeatCounter;
        this.heartbeatTimeout = heartbeatTimeout;
    }

    /**
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setTimestamp(ElementTagType value) {
        this.timestamp = value;
    }

    /**
     * Gets the value of the heartbeatCounter property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getHeartbeatCounter() {
        return heartbeatCounter;
    }

    /**
     * Sets the value of the heartbeatCounter property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setHeartbeatCounter(ElementTagType value) {
        this.heartbeatCounter = value;
    }

    /**
     * Gets the value of the heartbeatTimeout property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getHeartbeatTimeout() {
        return heartbeatTimeout;
    }

    /**
     * Sets the value of the heartbeatTimeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setHeartbeatTimeout(ElementTagType value) {
        this.heartbeatTimeout = value;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public DeviceDiagnosisHeartbeatDataElementsType withTimestamp(ElementTagType value) {
        setTimestamp(value);
        return this;
    }

    /**
     * Sets the value of the heartbeatCounter property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public DeviceDiagnosisHeartbeatDataElementsType withHeartbeatCounter(ElementTagType value) {
        setHeartbeatCounter(value);
        return this;
    }

    /**
     * Sets the value of the heartbeatTimeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public DeviceDiagnosisHeartbeatDataElementsType withHeartbeatTimeout(ElementTagType value) {
        setHeartbeatTimeout(value);
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
        if (draftCopy instanceof DeviceDiagnosisHeartbeatDataElementsType) {
            final DeviceDiagnosisHeartbeatDataElementsType copy = ((DeviceDiagnosisHeartbeatDataElementsType) draftCopy);
            {
                Boolean timestampShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.timestamp!= null));
                if (timestampShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceTimestamp;
                    sourceTimestamp = this.getTimestamp();
                    ElementTagType copyTimestamp = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "timestamp", sourceTimestamp), sourceTimestamp, (this.timestamp!= null)));
                    copy.setTimestamp(copyTimestamp);
                } else {
                    if (timestampShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.timestamp = null;
                    }
                }
            }
            {
                Boolean heartbeatCounterShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.heartbeatCounter!= null));
                if (heartbeatCounterShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceHeartbeatCounter;
                    sourceHeartbeatCounter = this.getHeartbeatCounter();
                    ElementTagType copyHeartbeatCounter = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "heartbeatCounter", sourceHeartbeatCounter), sourceHeartbeatCounter, (this.heartbeatCounter!= null)));
                    copy.setHeartbeatCounter(copyHeartbeatCounter);
                } else {
                    if (heartbeatCounterShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.heartbeatCounter = null;
                    }
                }
            }
            {
                Boolean heartbeatTimeoutShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.heartbeatTimeout!= null));
                if (heartbeatTimeoutShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceHeartbeatTimeout;
                    sourceHeartbeatTimeout = this.getHeartbeatTimeout();
                    ElementTagType copyHeartbeatTimeout = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "heartbeatTimeout", sourceHeartbeatTimeout), sourceHeartbeatTimeout, (this.heartbeatTimeout!= null)));
                    copy.setHeartbeatTimeout(copyHeartbeatTimeout);
                } else {
                    if (heartbeatTimeoutShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.heartbeatTimeout = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new DeviceDiagnosisHeartbeatDataElementsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DeviceDiagnosisHeartbeatDataElementsType that = ((DeviceDiagnosisHeartbeatDataElementsType) object);
        {
            ElementTagType leftTimestamp;
            leftTimestamp = this.getTimestamp();
            ElementTagType rightTimestamp;
            rightTimestamp = that.getTimestamp();
            if (this.timestamp!= null) {
                if (that.timestamp!= null) {
                    if (!leftTimestamp.equals(rightTimestamp)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.timestamp!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftHeartbeatCounter;
            leftHeartbeatCounter = this.getHeartbeatCounter();
            ElementTagType rightHeartbeatCounter;
            rightHeartbeatCounter = that.getHeartbeatCounter();
            if (this.heartbeatCounter!= null) {
                if (that.heartbeatCounter!= null) {
                    if (!leftHeartbeatCounter.equals(rightHeartbeatCounter)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.heartbeatCounter!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftHeartbeatTimeout;
            leftHeartbeatTimeout = this.getHeartbeatTimeout();
            ElementTagType rightHeartbeatTimeout;
            rightHeartbeatTimeout = that.getHeartbeatTimeout();
            if (this.heartbeatTimeout!= null) {
                if (that.heartbeatTimeout!= null) {
                    if (!leftHeartbeatTimeout.equals(rightHeartbeatTimeout)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.heartbeatTimeout!= null) {
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
            ElementTagType theTimestamp;
            theTimestamp = this.getTimestamp();
            if (this.timestamp!= null) {
                currentHashCode += theTimestamp.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theHeartbeatCounter;
            theHeartbeatCounter = this.getHeartbeatCounter();
            if (this.heartbeatCounter!= null) {
                currentHashCode += theHeartbeatCounter.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theHeartbeatTimeout;
            theHeartbeatTimeout = this.getHeartbeatTimeout();
            if (this.heartbeatTimeout!= null) {
                currentHashCode += theHeartbeatTimeout.hashCode();
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
            ElementTagType theTimestamp;
            theTimestamp = this.getTimestamp();
            strategy.appendField(locator, this, "timestamp", buffer, theTimestamp, (this.timestamp!= null));
        }
        {
            ElementTagType theHeartbeatCounter;
            theHeartbeatCounter = this.getHeartbeatCounter();
            strategy.appendField(locator, this, "heartbeatCounter", buffer, theHeartbeatCounter, (this.heartbeatCounter!= null));
        }
        {
            ElementTagType theHeartbeatTimeout;
            theHeartbeatTimeout = this.getHeartbeatTimeout();
            strategy.appendField(locator, this, "heartbeatTimeout", buffer, theHeartbeatTimeout, (this.heartbeatTimeout!= null));
        }
        return buffer;
    }

}
