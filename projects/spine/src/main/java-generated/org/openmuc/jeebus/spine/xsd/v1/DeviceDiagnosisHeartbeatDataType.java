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

import java.math.BigInteger;
import javax.xml.datatype.Duration;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
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
 * <p>Java class for DeviceDiagnosisHeartbeatDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeviceDiagnosisHeartbeatDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="timestamp" type="{http://docs.eebus.org/spine/xsd/v1}AbsoluteOrRelativeTimeType" minOccurs="0"/&gt;
 *         &lt;element name="heartbeatCounter" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/&gt;
 *         &lt;element name="heartbeatTimeout" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceDiagnosisHeartbeatDataType", propOrder = {
    "timestamp",
    "heartbeatCounter",
    "heartbeatTimeout"
})
public class DeviceDiagnosisHeartbeatDataType implements Cloneable, CopyTo, ToString
{

    protected String timestamp;
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger heartbeatCounter;
    protected Duration heartbeatTimeout;

    /**
     * Default no-arg constructor
     * 
     */
    public DeviceDiagnosisHeartbeatDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public DeviceDiagnosisHeartbeatDataType(final String timestamp, final BigInteger heartbeatCounter, final Duration heartbeatTimeout) {
        this.timestamp = timestamp;
        this.heartbeatCounter = heartbeatCounter;
        this.heartbeatTimeout = heartbeatTimeout;
    }

    /**
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimestamp(String value) {
        this.timestamp = value;
    }

    /**
     * Gets the value of the heartbeatCounter property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHeartbeatCounter() {
        return heartbeatCounter;
    }

    /**
     * Sets the value of the heartbeatCounter property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHeartbeatCounter(BigInteger value) {
        this.heartbeatCounter = value;
    }

    /**
     * Gets the value of the heartbeatTimeout property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getHeartbeatTimeout() {
        return heartbeatTimeout;
    }

    /**
     * Sets the value of the heartbeatTimeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setHeartbeatTimeout(Duration value) {
        this.heartbeatTimeout = value;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public DeviceDiagnosisHeartbeatDataType withTimestamp(String value) {
        setTimestamp(value);
        return this;
    }

    /**
     * Sets the value of the heartbeatCounter property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     * @return
     *     The class instance
     */
    public DeviceDiagnosisHeartbeatDataType withHeartbeatCounter(BigInteger value) {
        setHeartbeatCounter(value);
        return this;
    }

    /**
     * Sets the value of the heartbeatTimeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     * @return
     *     The class instance
     */
    public DeviceDiagnosisHeartbeatDataType withHeartbeatTimeout(Duration value) {
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
        if (draftCopy instanceof DeviceDiagnosisHeartbeatDataType) {
            final DeviceDiagnosisHeartbeatDataType copy = ((DeviceDiagnosisHeartbeatDataType) draftCopy);
            {
                Boolean timestampShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.timestamp!= null));
                if (timestampShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceTimestamp;
                    sourceTimestamp = this.getTimestamp();
                    String copyTimestamp = ((String) strategy.copy(LocatorUtils.property(locator, "timestamp", sourceTimestamp), sourceTimestamp, (this.timestamp!= null)));
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
                    BigInteger sourceHeartbeatCounter;
                    sourceHeartbeatCounter = this.getHeartbeatCounter();
                    BigInteger copyHeartbeatCounter = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "heartbeatCounter", sourceHeartbeatCounter), sourceHeartbeatCounter, (this.heartbeatCounter!= null)));
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
                    Duration sourceHeartbeatTimeout;
                    sourceHeartbeatTimeout = this.getHeartbeatTimeout();
                    Duration copyHeartbeatTimeout = ((Duration) strategy.copy(LocatorUtils.property(locator, "heartbeatTimeout", sourceHeartbeatTimeout), sourceHeartbeatTimeout, (this.heartbeatTimeout!= null)));
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
        return new DeviceDiagnosisHeartbeatDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DeviceDiagnosisHeartbeatDataType that = ((DeviceDiagnosisHeartbeatDataType) object);
        {
            String leftTimestamp;
            leftTimestamp = this.getTimestamp();
            String rightTimestamp;
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
            BigInteger leftHeartbeatCounter;
            leftHeartbeatCounter = this.getHeartbeatCounter();
            BigInteger rightHeartbeatCounter;
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
            Duration leftHeartbeatTimeout;
            leftHeartbeatTimeout = this.getHeartbeatTimeout();
            Duration rightHeartbeatTimeout;
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
            String theTimestamp;
            theTimestamp = this.getTimestamp();
            if (this.timestamp!= null) {
                currentHashCode += theTimestamp.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            BigInteger theHeartbeatCounter;
            theHeartbeatCounter = this.getHeartbeatCounter();
            if (this.heartbeatCounter!= null) {
                currentHashCode += theHeartbeatCounter.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            Duration theHeartbeatTimeout;
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
            String theTimestamp;
            theTimestamp = this.getTimestamp();
            strategy.appendField(locator, this, "timestamp", buffer, theTimestamp, (this.timestamp!= null));
        }
        {
            BigInteger theHeartbeatCounter;
            theHeartbeatCounter = this.getHeartbeatCounter();
            strategy.appendField(locator, this, "heartbeatCounter", buffer, theHeartbeatCounter, (this.heartbeatCounter!= null));
        }
        {
            Duration theHeartbeatTimeout;
            theHeartbeatTimeout = this.getHeartbeatTimeout();
            strategy.appendField(locator, this, "heartbeatTimeout", buffer, theHeartbeatTimeout, (this.heartbeatTimeout!= null));
        }
        return buffer;
    }

}
