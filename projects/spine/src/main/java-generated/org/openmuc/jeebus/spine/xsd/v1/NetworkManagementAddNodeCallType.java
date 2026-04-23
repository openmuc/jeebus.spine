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
 * <p>Java class for NetworkManagementAddNodeCallType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NetworkManagementAddNodeCallType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nodeAddress" type="{http://docs.eebus.org/spine/xsd/v1}FeatureAddressType" minOccurs="0"/&gt;
 *         &lt;element name="nativeSetup" type="{http://docs.eebus.org/spine/xsd/v1}NetworkManagementNativeSetupType" minOccurs="0"/&gt;
 *         &lt;element name="timeout" type="{http://docs.eebus.org/spine/xsd/v1}NetworkManagementProcessTimeoutType" minOccurs="0"/&gt;
 *         &lt;element name="label" type="{http://docs.eebus.org/spine/xsd/v1}LabelType" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://docs.eebus.org/spine/xsd/v1}DescriptionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkManagementAddNodeCallType", propOrder = {
    "nodeAddress",
    "nativeSetup",
    "timeout",
    "label",
    "description"
})
public class NetworkManagementAddNodeCallType implements Cloneable, CopyTo, ToString
{

    protected FeatureAddressType nodeAddress;
    protected String nativeSetup;
    protected Duration timeout;
    protected String label;
    protected String description;

    /**
     * Default no-arg constructor
     * 
     */
    public NetworkManagementAddNodeCallType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public NetworkManagementAddNodeCallType(final FeatureAddressType nodeAddress, final String nativeSetup, final Duration timeout, final String label, final String description) {
        this.nodeAddress = nodeAddress;
        this.nativeSetup = nativeSetup;
        this.timeout = timeout;
        this.label = label;
        this.description = description;
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
     * Gets the value of the nativeSetup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNativeSetup() {
        return nativeSetup;
    }

    /**
     * Sets the value of the nativeSetup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNativeSetup(String value) {
        this.nativeSetup = value;
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
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
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
    public NetworkManagementAddNodeCallType withNodeAddress(FeatureAddressType value) {
        setNodeAddress(value);
        return this;
    }

    /**
     * Sets the value of the nativeSetup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public NetworkManagementAddNodeCallType withNativeSetup(String value) {
        setNativeSetup(value);
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
    public NetworkManagementAddNodeCallType withTimeout(Duration value) {
        setTimeout(value);
        return this;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public NetworkManagementAddNodeCallType withLabel(String value) {
        setLabel(value);
        return this;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public NetworkManagementAddNodeCallType withDescription(String value) {
        setDescription(value);
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
        if (draftCopy instanceof NetworkManagementAddNodeCallType) {
            final NetworkManagementAddNodeCallType copy = ((NetworkManagementAddNodeCallType) draftCopy);
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
                Boolean nativeSetupShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.nativeSetup!= null));
                if (nativeSetupShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceNativeSetup;
                    sourceNativeSetup = this.getNativeSetup();
                    String copyNativeSetup = ((String) strategy.copy(LocatorUtils.property(locator, "nativeSetup", sourceNativeSetup), sourceNativeSetup, (this.nativeSetup!= null)));
                    copy.setNativeSetup(copyNativeSetup);
                } else {
                    if (nativeSetupShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.nativeSetup = null;
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
            {
                Boolean labelShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.label!= null));
                if (labelShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceLabel;
                    sourceLabel = this.getLabel();
                    String copyLabel = ((String) strategy.copy(LocatorUtils.property(locator, "label", sourceLabel), sourceLabel, (this.label!= null)));
                    copy.setLabel(copyLabel);
                } else {
                    if (labelShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.label = null;
                    }
                }
            }
            {
                Boolean descriptionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.description!= null));
                if (descriptionShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceDescription;
                    sourceDescription = this.getDescription();
                    String copyDescription = ((String) strategy.copy(LocatorUtils.property(locator, "description", sourceDescription), sourceDescription, (this.description!= null)));
                    copy.setDescription(copyDescription);
                } else {
                    if (descriptionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.description = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new NetworkManagementAddNodeCallType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final NetworkManagementAddNodeCallType that = ((NetworkManagementAddNodeCallType) object);
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
            String leftNativeSetup;
            leftNativeSetup = this.getNativeSetup();
            String rightNativeSetup;
            rightNativeSetup = that.getNativeSetup();
            if (this.nativeSetup!= null) {
                if (that.nativeSetup!= null) {
                    if (!leftNativeSetup.equals(rightNativeSetup)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.nativeSetup!= null) {
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
        {
            String leftLabel;
            leftLabel = this.getLabel();
            String rightLabel;
            rightLabel = that.getLabel();
            if (this.label!= null) {
                if (that.label!= null) {
                    if (!leftLabel.equals(rightLabel)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.label!= null) {
                    return false;
                }
            }
        }
        {
            String leftDescription;
            leftDescription = this.getDescription();
            String rightDescription;
            rightDescription = that.getDescription();
            if (this.description!= null) {
                if (that.description!= null) {
                    if (!leftDescription.equals(rightDescription)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.description!= null) {
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
            String theNativeSetup;
            theNativeSetup = this.getNativeSetup();
            if (this.nativeSetup!= null) {
                currentHashCode += theNativeSetup.hashCode();
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
        {
            currentHashCode = (currentHashCode* 31);
            String theLabel;
            theLabel = this.getLabel();
            if (this.label!= null) {
                currentHashCode += theLabel.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String theDescription;
            theDescription = this.getDescription();
            if (this.description!= null) {
                currentHashCode += theDescription.hashCode();
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
            String theNativeSetup;
            theNativeSetup = this.getNativeSetup();
            strategy.appendField(locator, this, "nativeSetup", buffer, theNativeSetup, (this.nativeSetup!= null));
        }
        {
            Duration theTimeout;
            theTimeout = this.getTimeout();
            strategy.appendField(locator, this, "timeout", buffer, theTimeout, (this.timeout!= null));
        }
        {
            String theLabel;
            theLabel = this.getLabel();
            strategy.appendField(locator, this, "label", buffer, theLabel, (this.label!= null));
        }
        {
            String theDescription;
            theDescription = this.getDescription();
            strategy.appendField(locator, this, "description", buffer, theDescription, (this.description!= null));
        }
        return buffer;
    }

}
