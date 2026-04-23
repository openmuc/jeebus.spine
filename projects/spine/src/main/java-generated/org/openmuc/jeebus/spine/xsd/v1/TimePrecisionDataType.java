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
import javax.xml.datatype.XMLGregorianCalendar;
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
 * <p>Java class for TimePrecisionDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimePrecisionDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="isSynchronised" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="lastSyncAt" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="clockDrift" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimePrecisionDataType", propOrder = {
    "isSynchronised",
    "lastSyncAt",
    "clockDrift"
})
public class TimePrecisionDataType implements Cloneable, CopyTo, ToString
{

    protected Boolean isSynchronised;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastSyncAt;
    protected BigInteger clockDrift;

    /**
     * Default no-arg constructor
     * 
     */
    public TimePrecisionDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public TimePrecisionDataType(final Boolean isSynchronised, final XMLGregorianCalendar lastSyncAt, final BigInteger clockDrift) {
        this.isSynchronised = isSynchronised;
        this.lastSyncAt = lastSyncAt;
        this.clockDrift = clockDrift;
    }

    /**
     * Gets the value of the isSynchronised property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getIsSynchronised() {
        return isSynchronised;
    }

    /**
     * Sets the value of the isSynchronised property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSynchronised(Boolean value) {
        this.isSynchronised = value;
    }

    /**
     * Gets the value of the lastSyncAt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastSyncAt() {
        return lastSyncAt;
    }

    /**
     * Sets the value of the lastSyncAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastSyncAt(XMLGregorianCalendar value) {
        this.lastSyncAt = value;
    }

    /**
     * Gets the value of the clockDrift property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getClockDrift() {
        return clockDrift;
    }

    /**
     * Sets the value of the clockDrift property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setClockDrift(BigInteger value) {
        this.clockDrift = value;
    }

    /**
     * Sets the value of the isSynchronised property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     * @return
     *     The class instance
     */
    public TimePrecisionDataType withIsSynchronised(Boolean value) {
        setIsSynchronised(value);
        return this;
    }

    /**
     * Sets the value of the lastSyncAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     * @return
     *     The class instance
     */
    public TimePrecisionDataType withLastSyncAt(XMLGregorianCalendar value) {
        setLastSyncAt(value);
        return this;
    }

    /**
     * Sets the value of the clockDrift property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     * @return
     *     The class instance
     */
    public TimePrecisionDataType withClockDrift(BigInteger value) {
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
        if (draftCopy instanceof TimePrecisionDataType) {
            final TimePrecisionDataType copy = ((TimePrecisionDataType) draftCopy);
            {
                Boolean isSynchronisedShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.isSynchronised!= null));
                if (isSynchronisedShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceIsSynchronised;
                    sourceIsSynchronised = this.getIsSynchronised();
                    Boolean copyIsSynchronised = ((Boolean) strategy.copy(LocatorUtils.property(locator, "isSynchronised", sourceIsSynchronised), sourceIsSynchronised, (this.isSynchronised!= null)));
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
                    XMLGregorianCalendar sourceLastSyncAt;
                    sourceLastSyncAt = this.getLastSyncAt();
                    XMLGregorianCalendar copyLastSyncAt = ((XMLGregorianCalendar) strategy.copy(LocatorUtils.property(locator, "lastSyncAt", sourceLastSyncAt), sourceLastSyncAt, (this.lastSyncAt!= null)));
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
                    BigInteger sourceClockDrift;
                    sourceClockDrift = this.getClockDrift();
                    BigInteger copyClockDrift = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "clockDrift", sourceClockDrift), sourceClockDrift, (this.clockDrift!= null)));
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
        return new TimePrecisionDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TimePrecisionDataType that = ((TimePrecisionDataType) object);
        {
            Boolean leftIsSynchronised;
            leftIsSynchronised = this.getIsSynchronised();
            Boolean rightIsSynchronised;
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
            XMLGregorianCalendar leftLastSyncAt;
            leftLastSyncAt = this.getLastSyncAt();
            XMLGregorianCalendar rightLastSyncAt;
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
            BigInteger leftClockDrift;
            leftClockDrift = this.getClockDrift();
            BigInteger rightClockDrift;
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
            Boolean theIsSynchronised;
            theIsSynchronised = this.getIsSynchronised();
            if (this.isSynchronised!= null) {
                currentHashCode += theIsSynchronised.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            XMLGregorianCalendar theLastSyncAt;
            theLastSyncAt = this.getLastSyncAt();
            if (this.lastSyncAt!= null) {
                currentHashCode += theLastSyncAt.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            BigInteger theClockDrift;
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
            Boolean theIsSynchronised;
            theIsSynchronised = this.getIsSynchronised();
            strategy.appendField(locator, this, "isSynchronised", buffer, theIsSynchronised, (this.isSynchronised!= null));
        }
        {
            XMLGregorianCalendar theLastSyncAt;
            theLastSyncAt = this.getLastSyncAt();
            strategy.appendField(locator, this, "lastSyncAt", buffer, theLastSyncAt, (this.lastSyncAt!= null));
        }
        {
            BigInteger theClockDrift;
            theClockDrift = this.getClockDrift();
            strategy.appendField(locator, this, "clockDrift", buffer, theClockDrift, (this.clockDrift!= null));
        }
        return buffer;
    }

}
