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
 * <p>Java class for HvacOverrunDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HvacOverrunDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="overrunId" type="{http://docs.eebus.org/spine/xsd/v1}HvacOverrunIdType" minOccurs="0"/&gt;
 *         &lt;element name="overrunStatus" type="{http://docs.eebus.org/spine/xsd/v1}HvacOverrunStatusType" minOccurs="0"/&gt;
 *         &lt;element name="timeTableId" type="{http://docs.eebus.org/spine/xsd/v1}TimeTableIdType" minOccurs="0"/&gt;
 *         &lt;element name="isOverrunStatusChangeable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HvacOverrunDataType", propOrder = {
    "overrunId",
    "overrunStatus",
    "timeTableId",
    "isOverrunStatusChangeable"
})
public class HvacOverrunDataType implements Cloneable, CopyTo, ToString
{

    @XmlSchemaType(name = "unsignedInt")
    protected Long overrunId;
    protected String overrunStatus;
    @XmlSchemaType(name = "unsignedInt")
    protected Long timeTableId;
    protected Boolean isOverrunStatusChangeable;

    /**
     * Default no-arg constructor
     * 
     */
    public HvacOverrunDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public HvacOverrunDataType(final Long overrunId, final String overrunStatus, final Long timeTableId, final Boolean isOverrunStatusChangeable) {
        this.overrunId = overrunId;
        this.overrunStatus = overrunStatus;
        this.timeTableId = timeTableId;
        this.isOverrunStatusChangeable = isOverrunStatusChangeable;
    }

    /**
     * Gets the value of the overrunId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOverrunId() {
        return overrunId;
    }

    /**
     * Sets the value of the overrunId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOverrunId(Long value) {
        this.overrunId = value;
    }

    /**
     * Gets the value of the overrunStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverrunStatus() {
        return overrunStatus;
    }

    /**
     * Sets the value of the overrunStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverrunStatus(String value) {
        this.overrunStatus = value;
    }

    /**
     * Gets the value of the timeTableId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTimeTableId() {
        return timeTableId;
    }

    /**
     * Sets the value of the timeTableId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTimeTableId(Long value) {
        this.timeTableId = value;
    }

    /**
     * Gets the value of the isOverrunStatusChangeable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getIsOverrunStatusChangeable() {
        return isOverrunStatusChangeable;
    }

    /**
     * Sets the value of the isOverrunStatusChangeable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsOverrunStatusChangeable(Boolean value) {
        this.isOverrunStatusChangeable = value;
    }

    /**
     * Sets the value of the overrunId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     * @return
     *     The class instance
     */
    public HvacOverrunDataType withOverrunId(Long value) {
        setOverrunId(value);
        return this;
    }

    /**
     * Sets the value of the overrunStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public HvacOverrunDataType withOverrunStatus(String value) {
        setOverrunStatus(value);
        return this;
    }

    /**
     * Sets the value of the timeTableId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     * @return
     *     The class instance
     */
    public HvacOverrunDataType withTimeTableId(Long value) {
        setTimeTableId(value);
        return this;
    }

    /**
     * Sets the value of the isOverrunStatusChangeable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     * @return
     *     The class instance
     */
    public HvacOverrunDataType withIsOverrunStatusChangeable(Boolean value) {
        setIsOverrunStatusChangeable(value);
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
        if (draftCopy instanceof HvacOverrunDataType) {
            final HvacOverrunDataType copy = ((HvacOverrunDataType) draftCopy);
            {
                Boolean overrunIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.overrunId!= null));
                if (overrunIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceOverrunId;
                    sourceOverrunId = this.getOverrunId();
                    Long copyOverrunId = ((Long) strategy.copy(LocatorUtils.property(locator, "overrunId", sourceOverrunId), sourceOverrunId, (this.overrunId!= null)));
                    copy.setOverrunId(copyOverrunId);
                } else {
                    if (overrunIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.overrunId = null;
                    }
                }
            }
            {
                Boolean overrunStatusShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.overrunStatus!= null));
                if (overrunStatusShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceOverrunStatus;
                    sourceOverrunStatus = this.getOverrunStatus();
                    String copyOverrunStatus = ((String) strategy.copy(LocatorUtils.property(locator, "overrunStatus", sourceOverrunStatus), sourceOverrunStatus, (this.overrunStatus!= null)));
                    copy.setOverrunStatus(copyOverrunStatus);
                } else {
                    if (overrunStatusShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.overrunStatus = null;
                    }
                }
            }
            {
                Boolean timeTableIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.timeTableId!= null));
                if (timeTableIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceTimeTableId;
                    sourceTimeTableId = this.getTimeTableId();
                    Long copyTimeTableId = ((Long) strategy.copy(LocatorUtils.property(locator, "timeTableId", sourceTimeTableId), sourceTimeTableId, (this.timeTableId!= null)));
                    copy.setTimeTableId(copyTimeTableId);
                } else {
                    if (timeTableIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.timeTableId = null;
                    }
                }
            }
            {
                Boolean isOverrunStatusChangeableShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.isOverrunStatusChangeable!= null));
                if (isOverrunStatusChangeableShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceIsOverrunStatusChangeable;
                    sourceIsOverrunStatusChangeable = this.getIsOverrunStatusChangeable();
                    Boolean copyIsOverrunStatusChangeable = ((Boolean) strategy.copy(LocatorUtils.property(locator, "isOverrunStatusChangeable", sourceIsOverrunStatusChangeable), sourceIsOverrunStatusChangeable, (this.isOverrunStatusChangeable!= null)));
                    copy.setIsOverrunStatusChangeable(copyIsOverrunStatusChangeable);
                } else {
                    if (isOverrunStatusChangeableShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.isOverrunStatusChangeable = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new HvacOverrunDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final HvacOverrunDataType that = ((HvacOverrunDataType) object);
        {
            Long leftOverrunId;
            leftOverrunId = this.getOverrunId();
            Long rightOverrunId;
            rightOverrunId = that.getOverrunId();
            if (this.overrunId!= null) {
                if (that.overrunId!= null) {
                    if (!leftOverrunId.equals(rightOverrunId)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.overrunId!= null) {
                    return false;
                }
            }
        }
        {
            String leftOverrunStatus;
            leftOverrunStatus = this.getOverrunStatus();
            String rightOverrunStatus;
            rightOverrunStatus = that.getOverrunStatus();
            if (this.overrunStatus!= null) {
                if (that.overrunStatus!= null) {
                    if (!leftOverrunStatus.equals(rightOverrunStatus)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.overrunStatus!= null) {
                    return false;
                }
            }
        }
        {
            Long leftTimeTableId;
            leftTimeTableId = this.getTimeTableId();
            Long rightTimeTableId;
            rightTimeTableId = that.getTimeTableId();
            if (this.timeTableId!= null) {
                if (that.timeTableId!= null) {
                    if (!leftTimeTableId.equals(rightTimeTableId)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.timeTableId!= null) {
                    return false;
                }
            }
        }
        {
            Boolean leftIsOverrunStatusChangeable;
            leftIsOverrunStatusChangeable = this.getIsOverrunStatusChangeable();
            Boolean rightIsOverrunStatusChangeable;
            rightIsOverrunStatusChangeable = that.getIsOverrunStatusChangeable();
            if (this.isOverrunStatusChangeable!= null) {
                if (that.isOverrunStatusChangeable!= null) {
                    if (!leftIsOverrunStatusChangeable.equals(rightIsOverrunStatusChangeable)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.isOverrunStatusChangeable!= null) {
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
            Long theOverrunId;
            theOverrunId = this.getOverrunId();
            if (this.overrunId!= null) {
                currentHashCode += theOverrunId.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String theOverrunStatus;
            theOverrunStatus = this.getOverrunStatus();
            if (this.overrunStatus!= null) {
                currentHashCode += theOverrunStatus.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            Long theTimeTableId;
            theTimeTableId = this.getTimeTableId();
            if (this.timeTableId!= null) {
                currentHashCode += theTimeTableId.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            Boolean theIsOverrunStatusChangeable;
            theIsOverrunStatusChangeable = this.getIsOverrunStatusChangeable();
            if (this.isOverrunStatusChangeable!= null) {
                currentHashCode += theIsOverrunStatusChangeable.hashCode();
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
            Long theOverrunId;
            theOverrunId = this.getOverrunId();
            strategy.appendField(locator, this, "overrunId", buffer, theOverrunId, (this.overrunId!= null));
        }
        {
            String theOverrunStatus;
            theOverrunStatus = this.getOverrunStatus();
            strategy.appendField(locator, this, "overrunStatus", buffer, theOverrunStatus, (this.overrunStatus!= null));
        }
        {
            Long theTimeTableId;
            theTimeTableId = this.getTimeTableId();
            strategy.appendField(locator, this, "timeTableId", buffer, theTimeTableId, (this.timeTableId!= null));
        }
        {
            Boolean theIsOverrunStatusChangeable;
            theIsOverrunStatusChangeable = this.getIsOverrunStatusChangeable();
            strategy.appendField(locator, this, "isOverrunStatusChangeable", buffer, theIsOverrunStatusChangeable, (this.isOverrunStatusChangeable!= null));
        }
        return buffer;
    }

}
