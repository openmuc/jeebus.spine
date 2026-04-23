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
 * <p>Java class for NetworkManagementScanNetworkCallElementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NetworkManagementScanNetworkCallElementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="scanSetup" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="timeout" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkManagementScanNetworkCallElementsType", propOrder = {
    "scanSetup",
    "timeout"
})
public class NetworkManagementScanNetworkCallElementsType implements Cloneable, CopyTo, ToString
{

    protected ElementTagType scanSetup;
    protected ElementTagType timeout;

    /**
     * Default no-arg constructor
     * 
     */
    public NetworkManagementScanNetworkCallElementsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public NetworkManagementScanNetworkCallElementsType(final ElementTagType scanSetup, final ElementTagType timeout) {
        this.scanSetup = scanSetup;
        this.timeout = timeout;
    }

    /**
     * Gets the value of the scanSetup property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getScanSetup() {
        return scanSetup;
    }

    /**
     * Sets the value of the scanSetup property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setScanSetup(ElementTagType value) {
        this.scanSetup = value;
    }

    /**
     * Gets the value of the timeout property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getTimeout() {
        return timeout;
    }

    /**
     * Sets the value of the timeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setTimeout(ElementTagType value) {
        this.timeout = value;
    }

    /**
     * Sets the value of the scanSetup property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public NetworkManagementScanNetworkCallElementsType withScanSetup(ElementTagType value) {
        setScanSetup(value);
        return this;
    }

    /**
     * Sets the value of the timeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public NetworkManagementScanNetworkCallElementsType withTimeout(ElementTagType value) {
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
        if (draftCopy instanceof NetworkManagementScanNetworkCallElementsType) {
            final NetworkManagementScanNetworkCallElementsType copy = ((NetworkManagementScanNetworkCallElementsType) draftCopy);
            {
                Boolean scanSetupShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.scanSetup!= null));
                if (scanSetupShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceScanSetup;
                    sourceScanSetup = this.getScanSetup();
                    ElementTagType copyScanSetup = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "scanSetup", sourceScanSetup), sourceScanSetup, (this.scanSetup!= null)));
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
                    ElementTagType sourceTimeout;
                    sourceTimeout = this.getTimeout();
                    ElementTagType copyTimeout = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "timeout", sourceTimeout), sourceTimeout, (this.timeout!= null)));
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
        return new NetworkManagementScanNetworkCallElementsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final NetworkManagementScanNetworkCallElementsType that = ((NetworkManagementScanNetworkCallElementsType) object);
        {
            ElementTagType leftScanSetup;
            leftScanSetup = this.getScanSetup();
            ElementTagType rightScanSetup;
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
            ElementTagType leftTimeout;
            leftTimeout = this.getTimeout();
            ElementTagType rightTimeout;
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
            ElementTagType theScanSetup;
            theScanSetup = this.getScanSetup();
            if (this.scanSetup!= null) {
                currentHashCode += theScanSetup.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theTimeout;
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
            ElementTagType theScanSetup;
            theScanSetup = this.getScanSetup();
            strategy.appendField(locator, this, "scanSetup", buffer, theScanSetup, (this.scanSetup!= null));
        }
        {
            ElementTagType theTimeout;
            theTimeout = this.getTimeout();
            strategy.appendField(locator, this, "timeout", buffer, theTimeout, (this.timeout!= null));
        }
        return buffer;
    }

}
