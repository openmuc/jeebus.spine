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

import javax.xml.datatype.Duration;
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
 * <p>Java class for NetworkManagementScanNetworkCallType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NetworkManagementScanNetworkCallType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="scanSetup" type="{http://docs.eebus.org/spine/xsd/v1}NetworkManagementScanSetupType" minOccurs="0"/&gt;
 *         &lt;element name="timeout" type="{http://docs.eebus.org/spine/xsd/v1}NetworkManagementProcessTimeoutType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkManagementScanNetworkCallType", propOrder = {
    "scanSetup",
    "timeout"
})
public class NetworkManagementScanNetworkCallType implements Cloneable, CopyTo, ToString
{

    protected String scanSetup;
    protected Duration timeout;

    /**
     * Default no-arg constructor
     * 
     */
    public NetworkManagementScanNetworkCallType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public NetworkManagementScanNetworkCallType(final String scanSetup, final Duration timeout) {
        this.scanSetup = scanSetup;
        this.timeout = timeout;
    }

    /**
     * Gets the value of the scanSetup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScanSetup() {
        return scanSetup;
    }

    /**
     * Sets the value of the scanSetup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScanSetup(String value) {
        this.scanSetup = value;
    }

    /**
     * Gets the value of the timeout property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getTimeout() {
        return timeout;
    }

    /**
     * Sets the value of the timeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setTimeout(Duration value) {
        this.timeout = value;
    }

    /**
     * Sets the value of the scanSetup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public NetworkManagementScanNetworkCallType withScanSetup(String value) {
        setScanSetup(value);
        return this;
    }

    /**
     * Sets the value of the timeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     * @return
     *     The class instance
     */
    public NetworkManagementScanNetworkCallType withTimeout(Duration value) {
        setTimeout(value);
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
        if (draftCopy instanceof NetworkManagementScanNetworkCallType) {
            final NetworkManagementScanNetworkCallType copy = ((NetworkManagementScanNetworkCallType) draftCopy);
            {
                Boolean scanSetupShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.scanSetup!= null));
                if (scanSetupShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceScanSetup;
                    sourceScanSetup = this.getScanSetup();
                    String copyScanSetup = ((String) strategy.copy(LocatorUtils.property(locator, "scanSetup", sourceScanSetup), sourceScanSetup, (this.scanSetup!= null)));
                    copy.setScanSetup(copyScanSetup);
                } else {
                    if (scanSetupShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.scanSetup = null;
                    }
                }
            }
            {
                Boolean timeoutShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.timeout!= null));
                if (timeoutShouldBeCopiedAndSet == Boolean.TRUE) {
                    Duration sourceTimeout;
                    sourceTimeout = this.getTimeout();
                    Duration copyTimeout = ((Duration) strategy.copy(LocatorUtils.property(locator, "timeout", sourceTimeout), sourceTimeout, (this.timeout!= null)));
                    copy.setTimeout(copyTimeout);
                } else {
                    if (timeoutShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.timeout = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new NetworkManagementScanNetworkCallType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final NetworkManagementScanNetworkCallType that = ((NetworkManagementScanNetworkCallType) object);
        {
            String leftScanSetup;
            leftScanSetup = this.getScanSetup();
            String rightScanSetup;
            rightScanSetup = that.getScanSetup();
            if (this.scanSetup!= null) {
                if (that.scanSetup!= null) {
                    if (!leftScanSetup.equals(rightScanSetup)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.scanSetup!= null) {
                    return false;
                }
            }
        }
        {
            Duration leftTimeout;
            leftTimeout = this.getTimeout();
            Duration rightTimeout;
            rightTimeout = that.getTimeout();
            if (this.timeout!= null) {
                if (that.timeout!= null) {
                    if (!leftTimeout.equals(rightTimeout)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.timeout!= null) {
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
            String theScanSetup;
            theScanSetup = this.getScanSetup();
            if (this.scanSetup!= null) {
                currentHashCode += theScanSetup.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            Duration theTimeout;
            theTimeout = this.getTimeout();
            if (this.timeout!= null) {
                currentHashCode += theTimeout.hashCode();
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
            String theScanSetup;
            theScanSetup = this.getScanSetup();
            strategy.appendField(locator, this, "scanSetup", buffer, theScanSetup, (this.scanSetup!= null));
        }
        {
            Duration theTimeout;
            theTimeout = this.getTimeout();
            strategy.appendField(locator, this, "timeout", buffer, theTimeout, (this.timeout!= null));
        }
        return buffer;
    }

}
