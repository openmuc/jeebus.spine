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
 * <p>Java class for HvacOverrunDataElementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HvacOverrunDataElementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="overrunId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="overrunStatus" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="timeTableId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="isOverrunStatusChangeable" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HvacOverrunDataElementsType", propOrder = {
    "overrunId",
    "overrunStatus",
    "timeTableId",
    "isOverrunStatusChangeable"
})
public class HvacOverrunDataElementsType implements Cloneable, CopyTo, ToString
{

    protected ElementTagType overrunId;
    protected ElementTagType overrunStatus;
    protected ElementTagType timeTableId;
    protected ElementTagType isOverrunStatusChangeable;

    /**
     * Default no-arg constructor
     * 
     */
    public HvacOverrunDataElementsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public HvacOverrunDataElementsType(final ElementTagType overrunId, final ElementTagType overrunStatus, final ElementTagType timeTableId, final ElementTagType isOverrunStatusChangeable) {
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
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getOverrunId() {
        return overrunId;
    }

    /**
     * Sets the value of the overrunId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setOverrunId(ElementTagType value) {
        this.overrunId = value;
    }

    /**
     * Gets the value of the overrunStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getOverrunStatus() {
        return overrunStatus;
    }

    /**
     * Sets the value of the overrunStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setOverrunStatus(ElementTagType value) {
        this.overrunStatus = value;
    }

    /**
     * Gets the value of the timeTableId property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getTimeTableId() {
        return timeTableId;
    }

    /**
     * Sets the value of the timeTableId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setTimeTableId(ElementTagType value) {
        this.timeTableId = value;
    }

    /**
     * Gets the value of the isOverrunStatusChangeable property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getIsOverrunStatusChangeable() {
        return isOverrunStatusChangeable;
    }

    /**
     * Sets the value of the isOverrunStatusChangeable property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setIsOverrunStatusChangeable(ElementTagType value) {
        this.isOverrunStatusChangeable = value;
    }

    /**
     * Sets the value of the overrunId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public HvacOverrunDataElementsType withOverrunId(ElementTagType value) {
        setOverrunId(value);
        return this;
    }

    /**
     * Sets the value of the overrunStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public HvacOverrunDataElementsType withOverrunStatus(ElementTagType value) {
        setOverrunStatus(value);
        return this;
    }

    /**
     * Sets the value of the timeTableId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public HvacOverrunDataElementsType withTimeTableId(ElementTagType value) {
        setTimeTableId(value);
        return this;
    }

    /**
     * Sets the value of the isOverrunStatusChangeable property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public HvacOverrunDataElementsType withIsOverrunStatusChangeable(ElementTagType value) {
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
        if (draftCopy instanceof HvacOverrunDataElementsType) {
            final HvacOverrunDataElementsType copy = ((HvacOverrunDataElementsType) draftCopy);
            {
                Boolean overrunIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.overrunId!= null));
                if (overrunIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceOverrunId;
                    sourceOverrunId = this.getOverrunId();
                    ElementTagType copyOverrunId = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "overrunId", sourceOverrunId), sourceOverrunId, (this.overrunId!= null)));
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
                    ElementTagType sourceOverrunStatus;
                    sourceOverrunStatus = this.getOverrunStatus();
                    ElementTagType copyOverrunStatus = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "overrunStatus", sourceOverrunStatus), sourceOverrunStatus, (this.overrunStatus!= null)));
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
                    ElementTagType sourceTimeTableId;
                    sourceTimeTableId = this.getTimeTableId();
                    ElementTagType copyTimeTableId = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "timeTableId", sourceTimeTableId), sourceTimeTableId, (this.timeTableId!= null)));
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
                    ElementTagType sourceIsOverrunStatusChangeable;
                    sourceIsOverrunStatusChangeable = this.getIsOverrunStatusChangeable();
                    ElementTagType copyIsOverrunStatusChangeable = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "isOverrunStatusChangeable", sourceIsOverrunStatusChangeable), sourceIsOverrunStatusChangeable, (this.isOverrunStatusChangeable!= null)));
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
        return new HvacOverrunDataElementsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final HvacOverrunDataElementsType that = ((HvacOverrunDataElementsType) object);
        {
            ElementTagType leftOverrunId;
            leftOverrunId = this.getOverrunId();
            ElementTagType rightOverrunId;
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
            ElementTagType leftOverrunStatus;
            leftOverrunStatus = this.getOverrunStatus();
            ElementTagType rightOverrunStatus;
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
            ElementTagType leftTimeTableId;
            leftTimeTableId = this.getTimeTableId();
            ElementTagType rightTimeTableId;
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
            ElementTagType leftIsOverrunStatusChangeable;
            leftIsOverrunStatusChangeable = this.getIsOverrunStatusChangeable();
            ElementTagType rightIsOverrunStatusChangeable;
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
            ElementTagType theOverrunId;
            theOverrunId = this.getOverrunId();
            if (this.overrunId!= null) {
                currentHashCode += theOverrunId.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theOverrunStatus;
            theOverrunStatus = this.getOverrunStatus();
            if (this.overrunStatus!= null) {
                currentHashCode += theOverrunStatus.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theTimeTableId;
            theTimeTableId = this.getTimeTableId();
            if (this.timeTableId!= null) {
                currentHashCode += theTimeTableId.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theIsOverrunStatusChangeable;
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
            ElementTagType theOverrunId;
            theOverrunId = this.getOverrunId();
            strategy.appendField(locator, this, "overrunId", buffer, theOverrunId, (this.overrunId!= null));
        }
        {
            ElementTagType theOverrunStatus;
            theOverrunStatus = this.getOverrunStatus();
            strategy.appendField(locator, this, "overrunStatus", buffer, theOverrunStatus, (this.overrunStatus!= null));
        }
        {
            ElementTagType theTimeTableId;
            theTimeTableId = this.getTimeTableId();
            strategy.appendField(locator, this, "timeTableId", buffer, theTimeTableId, (this.timeTableId!= null));
        }
        {
            ElementTagType theIsOverrunStatusChangeable;
            theIsOverrunStatusChangeable = this.getIsOverrunStatusChangeable();
            strategy.appendField(locator, this, "isOverrunStatusChangeable", buffer, theIsOverrunStatusChangeable, (this.isOverrunStatusChangeable!= null));
        }
        return buffer;
    }

}
