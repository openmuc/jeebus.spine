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
 * <p>Java class for DeviceDiagnosisServiceDataElementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeviceDiagnosisServiceDataElementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="timestamp" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="installationTime" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="bootCounter" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="nextService" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceDiagnosisServiceDataElementsType", propOrder = {
    "timestamp",
    "installationTime",
    "bootCounter",
    "nextService"
})
public class DeviceDiagnosisServiceDataElementsType implements Cloneable, CopyTo, ToString
{

    protected ElementTagType timestamp;
    protected ElementTagType installationTime;
    protected ElementTagType bootCounter;
    protected ElementTagType nextService;

    /**
     * Default no-arg constructor
     * 
     */
    public DeviceDiagnosisServiceDataElementsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public DeviceDiagnosisServiceDataElementsType(final ElementTagType timestamp, final ElementTagType installationTime, final ElementTagType bootCounter, final ElementTagType nextService) {
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
     * Gets the value of the installationTime property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getInstallationTime() {
        return installationTime;
    }

    /**
     * Sets the value of the installationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setInstallationTime(ElementTagType value) {
        this.installationTime = value;
    }

    /**
     * Gets the value of the bootCounter property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getBootCounter() {
        return bootCounter;
    }

    /**
     * Sets the value of the bootCounter property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setBootCounter(ElementTagType value) {
        this.bootCounter = value;
    }

    /**
     * Gets the value of the nextService property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getNextService() {
        return nextService;
    }

    /**
     * Sets the value of the nextService property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setNextService(ElementTagType value) {
        this.nextService = value;
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
    public DeviceDiagnosisServiceDataElementsType withTimestamp(ElementTagType value) {
        setTimestamp(value);
        return this;
    }

    /**
     * Sets the value of the installationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public DeviceDiagnosisServiceDataElementsType withInstallationTime(ElementTagType value) {
        setInstallationTime(value);
        return this;
    }

    /**
     * Sets the value of the bootCounter property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public DeviceDiagnosisServiceDataElementsType withBootCounter(ElementTagType value) {
        setBootCounter(value);
        return this;
    }

    /**
     * Sets the value of the nextService property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public DeviceDiagnosisServiceDataElementsType withNextService(ElementTagType value) {
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
        if (draftCopy instanceof DeviceDiagnosisServiceDataElementsType) {
            final DeviceDiagnosisServiceDataElementsType copy = ((DeviceDiagnosisServiceDataElementsType) draftCopy);
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
                Boolean installationTimeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.installationTime!= null));
                if (installationTimeShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceInstallationTime;
                    sourceInstallationTime = this.getInstallationTime();
                    ElementTagType copyInstallationTime = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "installationTime", sourceInstallationTime), sourceInstallationTime, (this.installationTime!= null)));
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
                    ElementTagType sourceBootCounter;
                    sourceBootCounter = this.getBootCounter();
                    ElementTagType copyBootCounter = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "bootCounter", sourceBootCounter), sourceBootCounter, (this.bootCounter!= null)));
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
                    ElementTagType sourceNextService;
                    sourceNextService = this.getNextService();
                    ElementTagType copyNextService = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "nextService", sourceNextService), sourceNextService, (this.nextService!= null)));
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
        return new DeviceDiagnosisServiceDataElementsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DeviceDiagnosisServiceDataElementsType that = ((DeviceDiagnosisServiceDataElementsType) object);
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
            ElementTagType leftInstallationTime;
            leftInstallationTime = this.getInstallationTime();
            ElementTagType rightInstallationTime;
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
            ElementTagType leftBootCounter;
            leftBootCounter = this.getBootCounter();
            ElementTagType rightBootCounter;
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
            ElementTagType leftNextService;
            leftNextService = this.getNextService();
            ElementTagType rightNextService;
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
            ElementTagType theTimestamp;
            theTimestamp = this.getTimestamp();
            if (this.timestamp!= null) {
                currentHashCode += theTimestamp.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theInstallationTime;
            theInstallationTime = this.getInstallationTime();
            if (this.installationTime!= null) {
                currentHashCode += theInstallationTime.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theBootCounter;
            theBootCounter = this.getBootCounter();
            if (this.bootCounter!= null) {
                currentHashCode += theBootCounter.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theNextService;
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
            ElementTagType theTimestamp;
            theTimestamp = this.getTimestamp();
            strategy.appendField(locator, this, "timestamp", buffer, theTimestamp, (this.timestamp!= null));
        }
        {
            ElementTagType theInstallationTime;
            theInstallationTime = this.getInstallationTime();
            strategy.appendField(locator, this, "installationTime", buffer, theInstallationTime, (this.installationTime!= null));
        }
        {
            ElementTagType theBootCounter;
            theBootCounter = this.getBootCounter();
            strategy.appendField(locator, this, "bootCounter", buffer, theBootCounter, (this.bootCounter!= null));
        }
        {
            ElementTagType theNextService;
            theNextService = this.getNextService();
            strategy.appendField(locator, this, "nextService", buffer, theNextService, (this.nextService!= null));
        }
        return buffer;
    }

}
