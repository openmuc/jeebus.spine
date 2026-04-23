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
 * <p>Java class for TimeSeriesListDataSelectorsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeSeriesListDataSelectorsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="timeSeriesId" type="{http://docs.eebus.org/spine/xsd/v1}TimeSeriesIdType" minOccurs="0"/&gt;
 *         &lt;element name="timeSeriesSlotId" type="{http://docs.eebus.org/spine/xsd/v1}TimeSeriesSlotIdType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeSeriesListDataSelectorsType", propOrder = {
    "timeSeriesId",
    "timeSeriesSlotId"
})
public class TimeSeriesListDataSelectorsType implements Cloneable, CopyTo, ToString
{

    @XmlSchemaType(name = "unsignedInt")
    protected Long timeSeriesId;
    @XmlSchemaType(name = "unsignedInt")
    protected Long timeSeriesSlotId;

    /**
     * Default no-arg constructor
     * 
     */
    public TimeSeriesListDataSelectorsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public TimeSeriesListDataSelectorsType(final Long timeSeriesId, final Long timeSeriesSlotId) {
        this.timeSeriesId = timeSeriesId;
        this.timeSeriesSlotId = timeSeriesSlotId;
    }

    /**
     * Gets the value of the timeSeriesId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTimeSeriesId() {
        return timeSeriesId;
    }

    /**
     * Sets the value of the timeSeriesId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTimeSeriesId(Long value) {
        this.timeSeriesId = value;
    }

    /**
     * Gets the value of the timeSeriesSlotId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTimeSeriesSlotId() {
        return timeSeriesSlotId;
    }

    /**
     * Sets the value of the timeSeriesSlotId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTimeSeriesSlotId(Long value) {
        this.timeSeriesSlotId = value;
    }

    /**
     * Sets the value of the timeSeriesId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     * @return
     *     The class instance
     */
    public TimeSeriesListDataSelectorsType withTimeSeriesId(Long value) {
        setTimeSeriesId(value);
        return this;
    }

    /**
     * Sets the value of the timeSeriesSlotId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     * @return
     *     The class instance
     */
    public TimeSeriesListDataSelectorsType withTimeSeriesSlotId(Long value) {
        setTimeSeriesSlotId(value);
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
        if (draftCopy instanceof TimeSeriesListDataSelectorsType) {
            final TimeSeriesListDataSelectorsType copy = ((TimeSeriesListDataSelectorsType) draftCopy);
            {
                Boolean timeSeriesIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.timeSeriesId!= null));
                if (timeSeriesIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceTimeSeriesId;
                    sourceTimeSeriesId = this.getTimeSeriesId();
                    Long copyTimeSeriesId = ((Long) strategy.copy(LocatorUtils.property(locator, "timeSeriesId", sourceTimeSeriesId), sourceTimeSeriesId, (this.timeSeriesId!= null)));
                    copy.setTimeSeriesId(copyTimeSeriesId);
                } else {
                    if (timeSeriesIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.timeSeriesId = null;
                    }
                }
            }
            {
                Boolean timeSeriesSlotIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.timeSeriesSlotId!= null));
                if (timeSeriesSlotIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceTimeSeriesSlotId;
                    sourceTimeSeriesSlotId = this.getTimeSeriesSlotId();
                    Long copyTimeSeriesSlotId = ((Long) strategy.copy(LocatorUtils.property(locator, "timeSeriesSlotId", sourceTimeSeriesSlotId), sourceTimeSeriesSlotId, (this.timeSeriesSlotId!= null)));
                    copy.setTimeSeriesSlotId(copyTimeSeriesSlotId);
                } else {
                    if (timeSeriesSlotIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.timeSeriesSlotId = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new TimeSeriesListDataSelectorsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TimeSeriesListDataSelectorsType that = ((TimeSeriesListDataSelectorsType) object);
        {
            Long leftTimeSeriesId;
            leftTimeSeriesId = this.getTimeSeriesId();
            Long rightTimeSeriesId;
            rightTimeSeriesId = that.getTimeSeriesId();
            if (this.timeSeriesId!= null) {
                if (that.timeSeriesId!= null) {
                    if (!leftTimeSeriesId.equals(rightTimeSeriesId)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.timeSeriesId!= null) {
                    return false;
                }
            }
        }
        {
            Long leftTimeSeriesSlotId;
            leftTimeSeriesSlotId = this.getTimeSeriesSlotId();
            Long rightTimeSeriesSlotId;
            rightTimeSeriesSlotId = that.getTimeSeriesSlotId();
            if (this.timeSeriesSlotId!= null) {
                if (that.timeSeriesSlotId!= null) {
                    if (!leftTimeSeriesSlotId.equals(rightTimeSeriesSlotId)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.timeSeriesSlotId!= null) {
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
            Long theTimeSeriesId;
            theTimeSeriesId = this.getTimeSeriesId();
            if (this.timeSeriesId!= null) {
                currentHashCode += theTimeSeriesId.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            Long theTimeSeriesSlotId;
            theTimeSeriesSlotId = this.getTimeSeriesSlotId();
            if (this.timeSeriesSlotId!= null) {
                currentHashCode += theTimeSeriesSlotId.hashCode();
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
            Long theTimeSeriesId;
            theTimeSeriesId = this.getTimeSeriesId();
            strategy.appendField(locator, this, "timeSeriesId", buffer, theTimeSeriesId, (this.timeSeriesId!= null));
        }
        {
            Long theTimeSeriesSlotId;
            theTimeSeriesSlotId = this.getTimeSeriesSlotId();
            strategy.appendField(locator, this, "timeSeriesSlotId", buffer, theTimeSeriesSlotId, (this.timeSeriesSlotId!= null));
        }
        return buffer;
    }

}
