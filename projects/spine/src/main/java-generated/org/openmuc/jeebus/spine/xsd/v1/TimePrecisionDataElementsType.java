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
 * <p>Java class for TimePrecisionDataElementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimePrecisionDataElementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="isSynchronised" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="lastSyncAt" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="clockDrift" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimePrecisionDataElementsType", propOrder = {
    "isSynchronised",
    "lastSyncAt",
    "clockDrift"
})
public class TimePrecisionDataElementsType implements Cloneable, CopyTo, ToString
{

    protected ElementTagType isSynchronised;
    protected ElementTagType lastSyncAt;
    protected ElementTagType clockDrift;

    /**
     * Default no-arg constructor
     * 
     */
    public TimePrecisionDataElementsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public TimePrecisionDataElementsType(final ElementTagType isSynchronised, final ElementTagType lastSyncAt, final ElementTagType clockDrift) {
        this.isSynchronised = isSynchronised;
        this.lastSyncAt = lastSyncAt;
        this.clockDrift = clockDrift;
    }

    /**
     * Gets the value of the isSynchronised property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getIsSynchronised() {
        return isSynchronised;
    }

    /**
     * Sets the value of the isSynchronised property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setIsSynchronised(ElementTagType value) {
        this.isSynchronised = value;
    }

    /**
     * Gets the value of the lastSyncAt property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getLastSyncAt() {
        return lastSyncAt;
    }

    /**
     * Sets the value of the lastSyncAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setLastSyncAt(ElementTagType value) {
        this.lastSyncAt = value;
    }

    /**
     * Gets the value of the clockDrift property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getClockDrift() {
        return clockDrift;
    }

    /**
     * Sets the value of the clockDrift property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setClockDrift(ElementTagType value) {
        this.clockDrift = value;
    }

    /**
     * Sets the value of the isSynchronised property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public TimePrecisionDataElementsType withIsSynchronised(ElementTagType value) {
        setIsSynchronised(value);
        return this;
    }

    /**
     * Sets the value of the lastSyncAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public TimePrecisionDataElementsType withLastSyncAt(ElementTagType value) {
        setLastSyncAt(value);
        return this;
    }

    /**
     * Sets the value of the clockDrift property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public TimePrecisionDataElementsType withClockDrift(ElementTagType value) {
        setClockDrift(value);
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
        if (draftCopy instanceof TimePrecisionDataElementsType) {
            final TimePrecisionDataElementsType copy = ((TimePrecisionDataElementsType) draftCopy);
            {
                Boolean isSynchronisedShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.isSynchronised!= null));
                if (isSynchronisedShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceIsSynchronised;
                    sourceIsSynchronised = this.getIsSynchronised();
                    ElementTagType copyIsSynchronised = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "isSynchronised", sourceIsSynchronised), sourceIsSynchronised, (this.isSynchronised!= null)));
                    copy.setIsSynchronised(copyIsSynchronised);
                } else {
                    if (isSynchronisedShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.isSynchronised = null;
                    }
                }
            }
            {
                Boolean lastSyncAtShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.lastSyncAt!= null));
                if (lastSyncAtShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceLastSyncAt;
                    sourceLastSyncAt = this.getLastSyncAt();
                    ElementTagType copyLastSyncAt = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "lastSyncAt", sourceLastSyncAt), sourceLastSyncAt, (this.lastSyncAt!= null)));
                    copy.setLastSyncAt(copyLastSyncAt);
                } else {
                    if (lastSyncAtShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.lastSyncAt = null;
                    }
                }
            }
            {
                Boolean clockDriftShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.clockDrift!= null));
                if (clockDriftShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceClockDrift;
                    sourceClockDrift = this.getClockDrift();
                    ElementTagType copyClockDrift = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "clockDrift", sourceClockDrift), sourceClockDrift, (this.clockDrift!= null)));
                    copy.setClockDrift(copyClockDrift);
                } else {
                    if (clockDriftShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.clockDrift = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new TimePrecisionDataElementsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TimePrecisionDataElementsType that = ((TimePrecisionDataElementsType) object);
        {
            ElementTagType leftIsSynchronised;
            leftIsSynchronised = this.getIsSynchronised();
            ElementTagType rightIsSynchronised;
            rightIsSynchronised = that.getIsSynchronised();
            if (this.isSynchronised!= null) {
                if (that.isSynchronised!= null) {
                    if (!leftIsSynchronised.equals(rightIsSynchronised)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.isSynchronised!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftLastSyncAt;
            leftLastSyncAt = this.getLastSyncAt();
            ElementTagType rightLastSyncAt;
            rightLastSyncAt = that.getLastSyncAt();
            if (this.lastSyncAt!= null) {
                if (that.lastSyncAt!= null) {
                    if (!leftLastSyncAt.equals(rightLastSyncAt)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.lastSyncAt!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftClockDrift;
            leftClockDrift = this.getClockDrift();
            ElementTagType rightClockDrift;
            rightClockDrift = that.getClockDrift();
            if (this.clockDrift!= null) {
                if (that.clockDrift!= null) {
                    if (!leftClockDrift.equals(rightClockDrift)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.clockDrift!= null) {
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
            ElementTagType theIsSynchronised;
            theIsSynchronised = this.getIsSynchronised();
            if (this.isSynchronised!= null) {
                currentHashCode += theIsSynchronised.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theLastSyncAt;
            theLastSyncAt = this.getLastSyncAt();
            if (this.lastSyncAt!= null) {
                currentHashCode += theLastSyncAt.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theClockDrift;
            theClockDrift = this.getClockDrift();
            if (this.clockDrift!= null) {
                currentHashCode += theClockDrift.hashCode();
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
            ElementTagType theIsSynchronised;
            theIsSynchronised = this.getIsSynchronised();
            strategy.appendField(locator, this, "isSynchronised", buffer, theIsSynchronised, (this.isSynchronised!= null));
        }
        {
            ElementTagType theLastSyncAt;
            theLastSyncAt = this.getLastSyncAt();
            strategy.appendField(locator, this, "lastSyncAt", buffer, theLastSyncAt, (this.lastSyncAt!= null));
        }
        {
            ElementTagType theClockDrift;
            theClockDrift = this.getClockDrift();
            strategy.appendField(locator, this, "clockDrift", buffer, theClockDrift, (this.clockDrift!= null));
        }
        return buffer;
    }

}
