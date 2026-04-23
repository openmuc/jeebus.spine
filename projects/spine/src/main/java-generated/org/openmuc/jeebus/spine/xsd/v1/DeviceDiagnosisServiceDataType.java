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
 * <p>Java class for DeviceDiagnosisServiceDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeviceDiagnosisServiceDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="timestamp" type="{http://docs.eebus.org/spine/xsd/v1}AbsoluteOrRelativeTimeType" minOccurs="0"/&gt;
 *         &lt;element name="installationTime" type="{http://docs.eebus.org/spine/xsd/v1}AbsoluteOrRelativeTimeType" minOccurs="0"/&gt;
 *         &lt;element name="bootCounter" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/&gt;
 *         &lt;element name="nextService" type="{http://docs.eebus.org/spine/xsd/v1}AbsoluteOrRelativeTimeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceDiagnosisServiceDataType", propOrder = {
    "timestamp",
    "installationTime",
    "bootCounter",
    "nextService"
})
public class DeviceDiagnosisServiceDataType implements Cloneable, CopyTo, ToString
{

    protected String timestamp;
    protected String installationTime;
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger bootCounter;
    protected String nextService;

    /**
     * Default no-arg constructor
     * 
     */
    public DeviceDiagnosisServiceDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public DeviceDiagnosisServiceDataType(final String timestamp, final String installationTime, final BigInteger bootCounter, final String nextService) {
        this.timestamp = timestamp;
        this.installationTime = installationTime;
        this.bootCounter = bootCounter;
        this.nextService = nextService;
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
     * Gets the value of the installationTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstallationTime() {
        return installationTime;
    }

    /**
     * Sets the value of the installationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstallationTime(String value) {
        this.installationTime = value;
    }

    /**
     * Gets the value of the bootCounter property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBootCounter() {
        return bootCounter;
    }

    /**
     * Sets the value of the bootCounter property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBootCounter(BigInteger value) {
        this.bootCounter = value;
    }

    /**
     * Gets the value of the nextService property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNextService() {
        return nextService;
    }

    /**
     * Sets the value of the nextService property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNextService(String value) {
        this.nextService = value;
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
    public DeviceDiagnosisServiceDataType withTimestamp(String value) {
        setTimestamp(value);
        return this;
    }

    /**
     * Sets the value of the installationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public DeviceDiagnosisServiceDataType withInstallationTime(String value) {
        setInstallationTime(value);
        return this;
    }

    /**
     * Sets the value of the bootCounter property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     * @return
     *     The class instance
     */
    public DeviceDiagnosisServiceDataType withBootCounter(BigInteger value) {
        setBootCounter(value);
        return this;
    }

    /**
     * Sets the value of the nextService property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public DeviceDiagnosisServiceDataType withNextService(String value) {
        setNextService(value);
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
        if (draftCopy instanceof DeviceDiagnosisServiceDataType) {
            final DeviceDiagnosisServiceDataType copy = ((DeviceDiagnosisServiceDataType) draftCopy);
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
                Boolean installationTimeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.installationTime!= null));
                if (installationTimeShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceInstallationTime;
                    sourceInstallationTime = this.getInstallationTime();
                    String copyInstallationTime = ((String) strategy.copy(LocatorUtils.property(locator, "installationTime", sourceInstallationTime), sourceInstallationTime, (this.installationTime!= null)));
                    copy.setInstallationTime(copyInstallationTime);
                } else {
                    if (installationTimeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.installationTime = null;
                    }
                }
            }
            {
                Boolean bootCounterShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.bootCounter!= null));
                if (bootCounterShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigInteger sourceBootCounter;
                    sourceBootCounter = this.getBootCounter();
                    BigInteger copyBootCounter = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "bootCounter", sourceBootCounter), sourceBootCounter, (this.bootCounter!= null)));
                    copy.setBootCounter(copyBootCounter);
                } else {
                    if (bootCounterShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.bootCounter = null;
                    }
                }
            }
            {
                Boolean nextServiceShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.nextService!= null));
                if (nextServiceShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceNextService;
                    sourceNextService = this.getNextService();
                    String copyNextService = ((String) strategy.copy(LocatorUtils.property(locator, "nextService", sourceNextService), sourceNextService, (this.nextService!= null)));
                    copy.setNextService(copyNextService);
                } else {
                    if (nextServiceShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.nextService = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new DeviceDiagnosisServiceDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DeviceDiagnosisServiceDataType that = ((DeviceDiagnosisServiceDataType) object);
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
            String leftInstallationTime;
            leftInstallationTime = this.getInstallationTime();
            String rightInstallationTime;
            rightInstallationTime = that.getInstallationTime();
            if (this.installationTime!= null) {
                if (that.installationTime!= null) {
                    if (!leftInstallationTime.equals(rightInstallationTime)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.installationTime!= null) {
                    return false;
                }
            }
        }
        {
            BigInteger leftBootCounter;
            leftBootCounter = this.getBootCounter();
            BigInteger rightBootCounter;
            rightBootCounter = that.getBootCounter();
            if (this.bootCounter!= null) {
                if (that.bootCounter!= null) {
                    if (!leftBootCounter.equals(rightBootCounter)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.bootCounter!= null) {
                    return false;
                }
            }
        }
        {
            String leftNextService;
            leftNextService = this.getNextService();
            String rightNextService;
            rightNextService = that.getNextService();
            if (this.nextService!= null) {
                if (that.nextService!= null) {
                    if (!leftNextService.equals(rightNextService)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.nextService!= null) {
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
            String theInstallationTime;
            theInstallationTime = this.getInstallationTime();
            if (this.installationTime!= null) {
                currentHashCode += theInstallationTime.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            BigInteger theBootCounter;
            theBootCounter = this.getBootCounter();
            if (this.bootCounter!= null) {
                currentHashCode += theBootCounter.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String theNextService;
            theNextService = this.getNextService();
            if (this.nextService!= null) {
                currentHashCode += theNextService.hashCode();
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
            String theInstallationTime;
            theInstallationTime = this.getInstallationTime();
            strategy.appendField(locator, this, "installationTime", buffer, theInstallationTime, (this.installationTime!= null));
        }
        {
            BigInteger theBootCounter;
            theBootCounter = this.getBootCounter();
            strategy.appendField(locator, this, "bootCounter", buffer, theBootCounter, (this.bootCounter!= null));
        }
        {
            String theNextService;
            theNextService = this.getNextService();
            strategy.appendField(locator, this, "nextService", buffer, theNextService, (this.nextService!= null));
        }
        return buffer;
    }

}
