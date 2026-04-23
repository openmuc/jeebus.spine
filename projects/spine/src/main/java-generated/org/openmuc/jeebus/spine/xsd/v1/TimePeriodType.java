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
 * <p>Java class for TimePeriodType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimePeriodType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="startTime" type="{http://docs.eebus.org/spine/xsd/v1}AbsoluteOrRelativeTimeType" minOccurs="0"/&gt;
 *         &lt;element name="endTime" type="{http://docs.eebus.org/spine/xsd/v1}AbsoluteOrRelativeTimeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimePeriodType", propOrder = {
    "startTime",
    "endTime"
})
public class TimePeriodType implements Cloneable, CopyTo, ToString
{

    protected String startTime;
    protected String endTime;

    /**
     * Default no-arg constructor
     * 
     */
    public TimePeriodType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public TimePeriodType(final String startTime, final String endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartTime(String value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the endTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * Sets the value of the endTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndTime(String value) {
        this.endTime = value;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public TimePeriodType withStartTime(String value) {
        setStartTime(value);
        return this;
    }

    /**
     * Sets the value of the endTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public TimePeriodType withEndTime(String value) {
        setEndTime(value);
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
        if (draftCopy instanceof TimePeriodType) {
            final TimePeriodType copy = ((TimePeriodType) draftCopy);
            {
                Boolean startTimeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.startTime!= null));
                if (startTimeShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceStartTime;
                    sourceStartTime = this.getStartTime();
                    String copyStartTime = ((String) strategy.copy(LocatorUtils.property(locator, "startTime", sourceStartTime), sourceStartTime, (this.startTime!= null)));
                    copy.setStartTime(copyStartTime);
                } else {
                    if (startTimeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.startTime = null;
                    }
                }
            }
            {
                Boolean endTimeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.endTime!= null));
                if (endTimeShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceEndTime;
                    sourceEndTime = this.getEndTime();
                    String copyEndTime = ((String) strategy.copy(LocatorUtils.property(locator, "endTime", sourceEndTime), sourceEndTime, (this.endTime!= null)));
                    copy.setEndTime(copyEndTime);
                } else {
                    if (endTimeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.endTime = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new TimePeriodType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TimePeriodType that = ((TimePeriodType) object);
        {
            String leftStartTime;
            leftStartTime = this.getStartTime();
            String rightStartTime;
            rightStartTime = that.getStartTime();
            if (this.startTime!= null) {
                if (that.startTime!= null) {
                    if (!leftStartTime.equals(rightStartTime)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.startTime!= null) {
                    return false;
                }
            }
        }
        {
            String leftEndTime;
            leftEndTime = this.getEndTime();
            String rightEndTime;
            rightEndTime = that.getEndTime();
            if (this.endTime!= null) {
                if (that.endTime!= null) {
                    if (!leftEndTime.equals(rightEndTime)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.endTime!= null) {
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
            String theStartTime;
            theStartTime = this.getStartTime();
            if (this.startTime!= null) {
                currentHashCode += theStartTime.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String theEndTime;
            theEndTime = this.getEndTime();
            if (this.endTime!= null) {
                currentHashCode += theEndTime.hashCode();
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
            String theStartTime;
            theStartTime = this.getStartTime();
            strategy.appendField(locator, this, "startTime", buffer, theStartTime, (this.startTime!= null));
        }
        {
            String theEndTime;
            theEndTime = this.getEndTime();
            strategy.appendField(locator, this, "endTime", buffer, theEndTime, (this.endTime!= null));
        }
        return buffer;
    }

}
