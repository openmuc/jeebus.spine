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
 * <p>Java class for HeaderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HeaderType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="specificationVersion" type="{http://docs.eebus.org/spine/xsd/v1}SpecificationVersionType" minOccurs="0"/&gt;
 *         &lt;element name="addressSource" type="{http://docs.eebus.org/spine/xsd/v1}FeatureAddressType" minOccurs="0"/&gt;
 *         &lt;element name="addressDestination" type="{http://docs.eebus.org/spine/xsd/v1}FeatureAddressType" minOccurs="0"/&gt;
 *         &lt;element name="addressOriginator" type="{http://docs.eebus.org/spine/xsd/v1}FeatureAddressType" minOccurs="0"/&gt;
 *         &lt;element name="msgCounter" type="{http://docs.eebus.org/spine/xsd/v1}MsgCounterType" minOccurs="0"/&gt;
 *         &lt;element name="msgCounterReference" type="{http://docs.eebus.org/spine/xsd/v1}MsgCounterType" minOccurs="0"/&gt;
 *         &lt;element name="cmdClassifier" type="{http://docs.eebus.org/spine/xsd/v1}CmdClassifierType" minOccurs="0"/&gt;
 *         &lt;element name="ackRequest" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="timestamp" type="{http://docs.eebus.org/spine/xsd/v1}AbsoluteOrRelativeTimeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HeaderType", propOrder = {
    "specificationVersion",
    "addressSource",
    "addressDestination",
    "addressOriginator",
    "msgCounter",
    "msgCounterReference",
    "cmdClassifier",
    "ackRequest",
    "timestamp"
})
public class HeaderType implements Cloneable, CopyTo, ToString
{

    protected String specificationVersion;
    protected FeatureAddressType addressSource;
    protected FeatureAddressType addressDestination;
    protected FeatureAddressType addressOriginator;
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger msgCounter;
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger msgCounterReference;
    @XmlSchemaType(name = "string")
    protected CmdClassifierType cmdClassifier;
    protected Boolean ackRequest;
    protected String timestamp;

    /**
     * Default no-arg constructor
     * 
     */
    public HeaderType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public HeaderType(final String specificationVersion, final FeatureAddressType addressSource, final FeatureAddressType addressDestination, final FeatureAddressType addressOriginator, final BigInteger msgCounter, final BigInteger msgCounterReference, final CmdClassifierType cmdClassifier, final Boolean ackRequest, final String timestamp) {
        this.specificationVersion = specificationVersion;
        this.addressSource = addressSource;
        this.addressDestination = addressDestination;
        this.addressOriginator = addressOriginator;
        this.msgCounter = msgCounter;
        this.msgCounterReference = msgCounterReference;
        this.cmdClassifier = cmdClassifier;
        this.ackRequest = ackRequest;
        this.timestamp = timestamp;
    }

    /**
     * Gets the value of the specificationVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecificationVersion() {
        return specificationVersion;
    }

    /**
     * Sets the value of the specificationVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecificationVersion(String value) {
        this.specificationVersion = value;
    }

    /**
     * Gets the value of the addressSource property.
     * 
     * @return
     *     possible object is
     *     {@link FeatureAddressType }
     *     
     */
    public FeatureAddressType getAddressSource() {
        return addressSource;
    }

    /**
     * Sets the value of the addressSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeatureAddressType }
     *     
     */
    public void setAddressSource(FeatureAddressType value) {
        this.addressSource = value;
    }

    /**
     * Gets the value of the addressDestination property.
     * 
     * @return
     *     possible object is
     *     {@link FeatureAddressType }
     *     
     */
    public FeatureAddressType getAddressDestination() {
        return addressDestination;
    }

    /**
     * Sets the value of the addressDestination property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeatureAddressType }
     *     
     */
    public void setAddressDestination(FeatureAddressType value) {
        this.addressDestination = value;
    }

    /**
     * Gets the value of the addressOriginator property.
     * 
     * @return
     *     possible object is
     *     {@link FeatureAddressType }
     *     
     */
    public FeatureAddressType getAddressOriginator() {
        return addressOriginator;
    }

    /**
     * Sets the value of the addressOriginator property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeatureAddressType }
     *     
     */
    public void setAddressOriginator(FeatureAddressType value) {
        this.addressOriginator = value;
    }

    /**
     * Gets the value of the msgCounter property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMsgCounter() {
        return msgCounter;
    }

    /**
     * Sets the value of the msgCounter property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMsgCounter(BigInteger value) {
        this.msgCounter = value;
    }

    /**
     * Gets the value of the msgCounterReference property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMsgCounterReference() {
        return msgCounterReference;
    }

    /**
     * Sets the value of the msgCounterReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMsgCounterReference(BigInteger value) {
        this.msgCounterReference = value;
    }

    /**
     * Gets the value of the cmdClassifier property.
     * 
     * @return
     *     possible object is
     *     {@link CmdClassifierType }
     *     
     */
    public CmdClassifierType getCmdClassifier() {
        return cmdClassifier;
    }

    /**
     * Sets the value of the cmdClassifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link CmdClassifierType }
     *     
     */
    public void setCmdClassifier(CmdClassifierType value) {
        this.cmdClassifier = value;
    }

    /**
     * Gets the value of the ackRequest property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getAckRequest() {
        return ackRequest;
    }

    /**
     * Sets the value of the ackRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAckRequest(Boolean value) {
        this.ackRequest = value;
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
     * Sets the value of the specificationVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public HeaderType withSpecificationVersion(String value) {
        setSpecificationVersion(value);
        return this;
    }

    /**
     * Sets the value of the addressSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeatureAddressType }
     * @return
     *     The class instance
     */
    public HeaderType withAddressSource(FeatureAddressType value) {
        setAddressSource(value);
        return this;
    }

    /**
     * Sets the value of the addressDestination property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeatureAddressType }
     * @return
     *     The class instance
     */
    public HeaderType withAddressDestination(FeatureAddressType value) {
        setAddressDestination(value);
        return this;
    }

    /**
     * Sets the value of the addressOriginator property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeatureAddressType }
     * @return
     *     The class instance
     */
    public HeaderType withAddressOriginator(FeatureAddressType value) {
        setAddressOriginator(value);
        return this;
    }

    /**
     * Sets the value of the msgCounter property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     * @return
     *     The class instance
     */
    public HeaderType withMsgCounter(BigInteger value) {
        setMsgCounter(value);
        return this;
    }

    /**
     * Sets the value of the msgCounterReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     * @return
     *     The class instance
     */
    public HeaderType withMsgCounterReference(BigInteger value) {
        setMsgCounterReference(value);
        return this;
    }

    /**
     * Sets the value of the cmdClassifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link CmdClassifierType }
     * @return
     *     The class instance
     */
    public HeaderType withCmdClassifier(CmdClassifierType value) {
        setCmdClassifier(value);
        return this;
    }

    /**
     * Sets the value of the ackRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     * @return
     *     The class instance
     */
    public HeaderType withAckRequest(Boolean value) {
        setAckRequest(value);
        return this;
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
    public HeaderType withTimestamp(String value) {
        setTimestamp(value);
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
        if (draftCopy instanceof HeaderType) {
            final HeaderType copy = ((HeaderType) draftCopy);
            {
                Boolean specificationVersionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.specificationVersion!= null));
                if (specificationVersionShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceSpecificationVersion;
                    sourceSpecificationVersion = this.getSpecificationVersion();
                    String copySpecificationVersion = ((String) strategy.copy(LocatorUtils.property(locator, "specificationVersion", sourceSpecificationVersion), sourceSpecificationVersion, (this.specificationVersion!= null)));
                    copy.setSpecificationVersion(copySpecificationVersion);
                } else {
                    if (specificationVersionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.specificationVersion = null;
                    }
                }
            }
            {
                Boolean addressSourceShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.addressSource!= null));
                if (addressSourceShouldBeCopiedAndSet == Boolean.TRUE) {
                    FeatureAddressType sourceAddressSource;
                    sourceAddressSource = this.getAddressSource();
                    FeatureAddressType copyAddressSource = ((FeatureAddressType) strategy.copy(LocatorUtils.property(locator, "addressSource", sourceAddressSource), sourceAddressSource, (this.addressSource!= null)));
                    copy.setAddressSource(copyAddressSource);
                } else {
                    if (addressSourceShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.addressSource = null;
                    }
                }
            }
            {
                Boolean addressDestinationShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.addressDestination!= null));
                if (addressDestinationShouldBeCopiedAndSet == Boolean.TRUE) {
                    FeatureAddressType sourceAddressDestination;
                    sourceAddressDestination = this.getAddressDestination();
                    FeatureAddressType copyAddressDestination = ((FeatureAddressType) strategy.copy(LocatorUtils.property(locator, "addressDestination", sourceAddressDestination), sourceAddressDestination, (this.addressDestination!= null)));
                    copy.setAddressDestination(copyAddressDestination);
                } else {
                    if (addressDestinationShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.addressDestination = null;
                    }
                }
            }
            {
                Boolean addressOriginatorShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.addressOriginator!= null));
                if (addressOriginatorShouldBeCopiedAndSet == Boolean.TRUE) {
                    FeatureAddressType sourceAddressOriginator;
                    sourceAddressOriginator = this.getAddressOriginator();
                    FeatureAddressType copyAddressOriginator = ((FeatureAddressType) strategy.copy(LocatorUtils.property(locator, "addressOriginator", sourceAddressOriginator), sourceAddressOriginator, (this.addressOriginator!= null)));
                    copy.setAddressOriginator(copyAddressOriginator);
                } else {
                    if (addressOriginatorShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.addressOriginator = null;
                    }
                }
            }
            {
                Boolean msgCounterShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.msgCounter!= null));
                if (msgCounterShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigInteger sourceMsgCounter;
                    sourceMsgCounter = this.getMsgCounter();
                    BigInteger copyMsgCounter = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "msgCounter", sourceMsgCounter), sourceMsgCounter, (this.msgCounter!= null)));
                    copy.setMsgCounter(copyMsgCounter);
                } else {
                    if (msgCounterShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.msgCounter = null;
                    }
                }
            }
            {
                Boolean msgCounterReferenceShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.msgCounterReference!= null));
                if (msgCounterReferenceShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigInteger sourceMsgCounterReference;
                    sourceMsgCounterReference = this.getMsgCounterReference();
                    BigInteger copyMsgCounterReference = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "msgCounterReference", sourceMsgCounterReference), sourceMsgCounterReference, (this.msgCounterReference!= null)));
                    copy.setMsgCounterReference(copyMsgCounterReference);
                } else {
                    if (msgCounterReferenceShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.msgCounterReference = null;
                    }
                }
            }
            {
                Boolean cmdClassifierShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.cmdClassifier!= null));
                if (cmdClassifierShouldBeCopiedAndSet == Boolean.TRUE) {
                    CmdClassifierType sourceCmdClassifier;
                    sourceCmdClassifier = this.getCmdClassifier();
                    CmdClassifierType copyCmdClassifier = ((CmdClassifierType) strategy.copy(LocatorUtils.property(locator, "cmdClassifier", sourceCmdClassifier), sourceCmdClassifier, (this.cmdClassifier!= null)));
                    copy.setCmdClassifier(copyCmdClassifier);
                } else {
                    if (cmdClassifierShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.cmdClassifier = null;
                    }
                }
            }
            {
                Boolean ackRequestShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.ackRequest!= null));
                if (ackRequestShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceAckRequest;
                    sourceAckRequest = this.getAckRequest();
                    Boolean copyAckRequest = ((Boolean) strategy.copy(LocatorUtils.property(locator, "ackRequest", sourceAckRequest), sourceAckRequest, (this.ackRequest!= null)));
                    copy.setAckRequest(copyAckRequest);
                } else {
                    if (ackRequestShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.ackRequest = null;
                    }
                }
            }
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
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new HeaderType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final HeaderType that = ((HeaderType) object);
        {
            String leftSpecificationVersion;
            leftSpecificationVersion = this.getSpecificationVersion();
            String rightSpecificationVersion;
            rightSpecificationVersion = that.getSpecificationVersion();
            if (this.specificationVersion!= null) {
                if (that.specificationVersion!= null) {
                    if (!leftSpecificationVersion.equals(rightSpecificationVersion)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.specificationVersion!= null) {
                    return false;
                }
            }
        }
        {
            FeatureAddressType leftAddressSource;
            leftAddressSource = this.getAddressSource();
            FeatureAddressType rightAddressSource;
            rightAddressSource = that.getAddressSource();
            if (this.addressSource!= null) {
                if (that.addressSource!= null) {
                    if (!leftAddressSource.equals(rightAddressSource)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.addressSource!= null) {
                    return false;
                }
            }
        }
        {
            FeatureAddressType leftAddressDestination;
            leftAddressDestination = this.getAddressDestination();
            FeatureAddressType rightAddressDestination;
            rightAddressDestination = that.getAddressDestination();
            if (this.addressDestination!= null) {
                if (that.addressDestination!= null) {
                    if (!leftAddressDestination.equals(rightAddressDestination)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.addressDestination!= null) {
                    return false;
                }
            }
        }
        {
            FeatureAddressType leftAddressOriginator;
            leftAddressOriginator = this.getAddressOriginator();
            FeatureAddressType rightAddressOriginator;
            rightAddressOriginator = that.getAddressOriginator();
            if (this.addressOriginator!= null) {
                if (that.addressOriginator!= null) {
                    if (!leftAddressOriginator.equals(rightAddressOriginator)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.addressOriginator!= null) {
                    return false;
                }
            }
        }
        {
            BigInteger leftMsgCounter;
            leftMsgCounter = this.getMsgCounter();
            BigInteger rightMsgCounter;
            rightMsgCounter = that.getMsgCounter();
            if (this.msgCounter!= null) {
                if (that.msgCounter!= null) {
                    if (!leftMsgCounter.equals(rightMsgCounter)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.msgCounter!= null) {
                    return false;
                }
            }
        }
        {
            BigInteger leftMsgCounterReference;
            leftMsgCounterReference = this.getMsgCounterReference();
            BigInteger rightMsgCounterReference;
            rightMsgCounterReference = that.getMsgCounterReference();
            if (this.msgCounterReference!= null) {
                if (that.msgCounterReference!= null) {
                    if (!leftMsgCounterReference.equals(rightMsgCounterReference)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.msgCounterReference!= null) {
                    return false;
                }
            }
        }
        {
            CmdClassifierType leftCmdClassifier;
            leftCmdClassifier = this.getCmdClassifier();
            CmdClassifierType rightCmdClassifier;
            rightCmdClassifier = that.getCmdClassifier();
            if (this.cmdClassifier!= null) {
                if (that.cmdClassifier!= null) {
                    if (!leftCmdClassifier.equals(rightCmdClassifier)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.cmdClassifier!= null) {
                    return false;
                }
            }
        }
        {
            Boolean leftAckRequest;
            leftAckRequest = this.getAckRequest();
            Boolean rightAckRequest;
            rightAckRequest = that.getAckRequest();
            if (this.ackRequest!= null) {
                if (that.ackRequest!= null) {
                    if (!leftAckRequest.equals(rightAckRequest)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.ackRequest!= null) {
                    return false;
                }
            }
        }
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
        return true;
    }

    @Override
    public int hashCode() {
        int currentHashCode = 1;
        {
            currentHashCode = (currentHashCode* 31);
            String theSpecificationVersion;
            theSpecificationVersion = this.getSpecificationVersion();
            if (this.specificationVersion!= null) {
                currentHashCode += theSpecificationVersion.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            FeatureAddressType theAddressSource;
            theAddressSource = this.getAddressSource();
            if (this.addressSource!= null) {
                currentHashCode += theAddressSource.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            FeatureAddressType theAddressDestination;
            theAddressDestination = this.getAddressDestination();
            if (this.addressDestination!= null) {
                currentHashCode += theAddressDestination.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            FeatureAddressType theAddressOriginator;
            theAddressOriginator = this.getAddressOriginator();
            if (this.addressOriginator!= null) {
                currentHashCode += theAddressOriginator.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            BigInteger theMsgCounter;
            theMsgCounter = this.getMsgCounter();
            if (this.msgCounter!= null) {
                currentHashCode += theMsgCounter.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            BigInteger theMsgCounterReference;
            theMsgCounterReference = this.getMsgCounterReference();
            if (this.msgCounterReference!= null) {
                currentHashCode += theMsgCounterReference.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            CmdClassifierType theCmdClassifier;
            theCmdClassifier = this.getCmdClassifier();
            if (this.cmdClassifier!= null) {
                currentHashCode += theCmdClassifier.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            Boolean theAckRequest;
            theAckRequest = this.getAckRequest();
            if (this.ackRequest!= null) {
                currentHashCode += theAckRequest.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String theTimestamp;
            theTimestamp = this.getTimestamp();
            if (this.timestamp!= null) {
                currentHashCode += theTimestamp.hashCode();
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
            String theSpecificationVersion;
            theSpecificationVersion = this.getSpecificationVersion();
            strategy.appendField(locator, this, "specificationVersion", buffer, theSpecificationVersion, (this.specificationVersion!= null));
        }
        {
            FeatureAddressType theAddressSource;
            theAddressSource = this.getAddressSource();
            strategy.appendField(locator, this, "addressSource", buffer, theAddressSource, (this.addressSource!= null));
        }
        {
            FeatureAddressType theAddressDestination;
            theAddressDestination = this.getAddressDestination();
            strategy.appendField(locator, this, "addressDestination", buffer, theAddressDestination, (this.addressDestination!= null));
        }
        {
            FeatureAddressType theAddressOriginator;
            theAddressOriginator = this.getAddressOriginator();
            strategy.appendField(locator, this, "addressOriginator", buffer, theAddressOriginator, (this.addressOriginator!= null));
        }
        {
            BigInteger theMsgCounter;
            theMsgCounter = this.getMsgCounter();
            strategy.appendField(locator, this, "msgCounter", buffer, theMsgCounter, (this.msgCounter!= null));
        }
        {
            BigInteger theMsgCounterReference;
            theMsgCounterReference = this.getMsgCounterReference();
            strategy.appendField(locator, this, "msgCounterReference", buffer, theMsgCounterReference, (this.msgCounterReference!= null));
        }
        {
            CmdClassifierType theCmdClassifier;
            theCmdClassifier = this.getCmdClassifier();
            strategy.appendField(locator, this, "cmdClassifier", buffer, theCmdClassifier, (this.cmdClassifier!= null));
        }
        {
            Boolean theAckRequest;
            theAckRequest = this.getAckRequest();
            strategy.appendField(locator, this, "ackRequest", buffer, theAckRequest, (this.ackRequest!= null));
        }
        {
            String theTimestamp;
            theTimestamp = this.getTimestamp();
            strategy.appendField(locator, this, "timestamp", buffer, theTimestamp, (this.timestamp!= null));
        }
        return buffer;
    }

}
