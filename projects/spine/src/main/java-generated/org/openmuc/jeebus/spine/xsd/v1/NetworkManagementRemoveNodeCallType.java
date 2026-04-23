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
 * <p>Java class for NetworkManagementRemoveNodeCallType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NetworkManagementRemoveNodeCallType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nodeAddress" type="{http://docs.eebus.org/spine/xsd/v1}FeatureAddressType" minOccurs="0"/&gt;
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
@XmlType(name = "NetworkManagementRemoveNodeCallType", propOrder = {
    "nodeAddress",
    "timeout"
})
public class NetworkManagementRemoveNodeCallType implements Cloneable, CopyTo, ToString
{

    protected FeatureAddressType nodeAddress;
    protected Duration timeout;

    /**
     * Default no-arg constructor
     * 
     */
    public NetworkManagementRemoveNodeCallType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public NetworkManagementRemoveNodeCallType(final FeatureAddressType nodeAddress, final Duration timeout) {
        this.nodeAddress = nodeAddress;
        this.timeout = timeout;
    }

    /**
     * Gets the value of the nodeAddress property.
     * 
     * @return
     *     possible object is
     *     {@link FeatureAddressType }
     *     
     */
    public FeatureAddressType getNodeAddress() {
        return nodeAddress;
    }

    /**
     * Sets the value of the nodeAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeatureAddressType }
     *     
     */
    public void setNodeAddress(FeatureAddressType value) {
        this.nodeAddress = value;
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
     * Sets the value of the nodeAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeatureAddressType }
     * @return
     *     The class instance
     */
    public NetworkManagementRemoveNodeCallType withNodeAddress(FeatureAddressType value) {
        setNodeAddress(value);
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
    public NetworkManagementRemoveNodeCallType withTimeout(Duration value) {
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
        if (draftCopy instanceof NetworkManagementRemoveNodeCallType) {
            final NetworkManagementRemoveNodeCallType copy = ((NetworkManagementRemoveNodeCallType) draftCopy);
            {
                Boolean nodeAddressShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.nodeAddress!= null));
                if (nodeAddressShouldBeCopiedAndSet == Boolean.TRUE) {
                    FeatureAddressType sourceNodeAddress;
                    sourceNodeAddress = this.getNodeAddress();
                    FeatureAddressType copyNodeAddress = ((FeatureAddressType) strategy.copy(LocatorUtils.property(locator, "nodeAddress", sourceNodeAddress), sourceNodeAddress, (this.nodeAddress!= null)));
                    copy.setNodeAddress(copyNodeAddress);
                } else {
                    if (nodeAddressShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.nodeAddress = null;
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
        return new NetworkManagementRemoveNodeCallType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final NetworkManagementRemoveNodeCallType that = ((NetworkManagementRemoveNodeCallType) object);
        {
            FeatureAddressType leftNodeAddress;
            leftNodeAddress = this.getNodeAddress();
            FeatureAddressType rightNodeAddress;
            rightNodeAddress = that.getNodeAddress();
            if (this.nodeAddress!= null) {
                if (that.nodeAddress!= null) {
                    if (!leftNodeAddress.equals(rightNodeAddress)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.nodeAddress!= null) {
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
            FeatureAddressType theNodeAddress;
            theNodeAddress = this.getNodeAddress();
            if (this.nodeAddress!= null) {
                currentHashCode += theNodeAddress.hashCode();
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
            FeatureAddressType theNodeAddress;
            theNodeAddress = this.getNodeAddress();
            strategy.appendField(locator, this, "nodeAddress", buffer, theNodeAddress, (this.nodeAddress!= null));
        }
        {
            Duration theTimeout;
            theTimeout = this.getTimeout();
            strategy.appendField(locator, this, "timeout", buffer, theTimeout, (this.timeout!= null));
        }
        return buffer;
    }

}
