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
 * <p>Java class for TimeTableDescriptionDataElementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeTableDescriptionDataElementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="timeTableId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="timeSlotCountChangeable" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="timeSlotTimesChangeable" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="timeSlotTimeMode" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="label" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeTableDescriptionDataElementsType", propOrder = {
    "timeTableId",
    "timeSlotCountChangeable",
    "timeSlotTimesChangeable",
    "timeSlotTimeMode",
    "label",
    "description"
})
public class TimeTableDescriptionDataElementsType implements Cloneable, CopyTo, ToString
{

    protected ElementTagType timeTableId;
    protected ElementTagType timeSlotCountChangeable;
    protected ElementTagType timeSlotTimesChangeable;
    protected ElementTagType timeSlotTimeMode;
    protected ElementTagType label;
    protected ElementTagType description;

    /**
     * Default no-arg constructor
     * 
     */
    public TimeTableDescriptionDataElementsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public TimeTableDescriptionDataElementsType(final ElementTagType timeTableId, final ElementTagType timeSlotCountChangeable, final ElementTagType timeSlotTimesChangeable, final ElementTagType timeSlotTimeMode, final ElementTagType label, final ElementTagType description) {
        this.timeTableId = timeTableId;
        this.timeSlotCountChangeable = timeSlotCountChangeable;
        this.timeSlotTimesChangeable = timeSlotTimesChangeable;
        this.timeSlotTimeMode = timeSlotTimeMode;
        this.label = label;
        this.description = description;
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
     * Gets the value of the timeSlotCountChangeable property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getTimeSlotCountChangeable() {
        return timeSlotCountChangeable;
    }

    /**
     * Sets the value of the timeSlotCountChangeable property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setTimeSlotCountChangeable(ElementTagType value) {
        this.timeSlotCountChangeable = value;
    }

    /**
     * Gets the value of the timeSlotTimesChangeable property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getTimeSlotTimesChangeable() {
        return timeSlotTimesChangeable;
    }

    /**
     * Sets the value of the timeSlotTimesChangeable property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setTimeSlotTimesChangeable(ElementTagType value) {
        this.timeSlotTimesChangeable = value;
    }

    /**
     * Gets the value of the timeSlotTimeMode property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getTimeSlotTimeMode() {
        return timeSlotTimeMode;
    }

    /**
     * Sets the value of the timeSlotTimeMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setTimeSlotTimeMode(ElementTagType value) {
        this.timeSlotTimeMode = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setLabel(ElementTagType value) {
        this.label = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setDescription(ElementTagType value) {
        this.description = value;
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
    public TimeTableDescriptionDataElementsType withTimeTableId(ElementTagType value) {
        setTimeTableId(value);
        return this;
    }

    /**
     * Sets the value of the timeSlotCountChangeable property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public TimeTableDescriptionDataElementsType withTimeSlotCountChangeable(ElementTagType value) {
        setTimeSlotCountChangeable(value);
        return this;
    }

    /**
     * Sets the value of the timeSlotTimesChangeable property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public TimeTableDescriptionDataElementsType withTimeSlotTimesChangeable(ElementTagType value) {
        setTimeSlotTimesChangeable(value);
        return this;
    }

    /**
     * Sets the value of the timeSlotTimeMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public TimeTableDescriptionDataElementsType withTimeSlotTimeMode(ElementTagType value) {
        setTimeSlotTimeMode(value);
        return this;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public TimeTableDescriptionDataElementsType withLabel(ElementTagType value) {
        setLabel(value);
        return this;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public TimeTableDescriptionDataElementsType withDescription(ElementTagType value) {
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
        if (draftCopy instanceof TimeTableDescriptionDataElementsType) {
            final TimeTableDescriptionDataElementsType copy = ((TimeTableDescriptionDataElementsType) draftCopy);
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
                Boolean timeSlotCountChangeableShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.timeSlotCountChangeable!= null));
                if (timeSlotCountChangeableShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceTimeSlotCountChangeable;
                    sourceTimeSlotCountChangeable = this.getTimeSlotCountChangeable();
                    ElementTagType copyTimeSlotCountChangeable = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "timeSlotCountChangeable", sourceTimeSlotCountChangeable), sourceTimeSlotCountChangeable, (this.timeSlotCountChangeable!= null)));
                    copy.setTimeSlotCountChangeable(copyTimeSlotCountChangeable);
                } else {
                    if (timeSlotCountChangeableShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.timeSlotCountChangeable = null;
                    }
                }
            }
            {
                Boolean timeSlotTimesChangeableShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.timeSlotTimesChangeable!= null));
                if (timeSlotTimesChangeableShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceTimeSlotTimesChangeable;
                    sourceTimeSlotTimesChangeable = this.getTimeSlotTimesChangeable();
                    ElementTagType copyTimeSlotTimesChangeable = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "timeSlotTimesChangeable", sourceTimeSlotTimesChangeable), sourceTimeSlotTimesChangeable, (this.timeSlotTimesChangeable!= null)));
                    copy.setTimeSlotTimesChangeable(copyTimeSlotTimesChangeable);
                } else {
                    if (timeSlotTimesChangeableShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.timeSlotTimesChangeable = null;
                    }
                }
            }
            {
                Boolean timeSlotTimeModeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.timeSlotTimeMode!= null));
                if (timeSlotTimeModeShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceTimeSlotTimeMode;
                    sourceTimeSlotTimeMode = this.getTimeSlotTimeMode();
                    ElementTagType copyTimeSlotTimeMode = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "timeSlotTimeMode", sourceTimeSlotTimeMode), sourceTimeSlotTimeMode, (this.timeSlotTimeMode!= null)));
                    copy.setTimeSlotTimeMode(copyTimeSlotTimeMode);
                } else {
                    if (timeSlotTimeModeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.timeSlotTimeMode = null;
                    }
                }
            }
            {
                Boolean labelShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.label!= null));
                if (labelShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceLabel;
                    sourceLabel = this.getLabel();
                    ElementTagType copyLabel = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "label", sourceLabel), sourceLabel, (this.label!= null)));
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
                    ElementTagType sourceDescription;
                    sourceDescription = this.getDescription();
                    ElementTagType copyDescription = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "description", sourceDescription), sourceDescription, (this.description!= null)));
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
        return new TimeTableDescriptionDataElementsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TimeTableDescriptionDataElementsType that = ((TimeTableDescriptionDataElementsType) object);
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
            ElementTagType leftTimeSlotCountChangeable;
            leftTimeSlotCountChangeable = this.getTimeSlotCountChangeable();
            ElementTagType rightTimeSlotCountChangeable;
            rightTimeSlotCountChangeable = that.getTimeSlotCountChangeable();
            if (this.timeSlotCountChangeable!= null) {
                if (that.timeSlotCountChangeable!= null) {
                    if (!leftTimeSlotCountChangeable.equals(rightTimeSlotCountChangeable)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.timeSlotCountChangeable!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftTimeSlotTimesChangeable;
            leftTimeSlotTimesChangeable = this.getTimeSlotTimesChangeable();
            ElementTagType rightTimeSlotTimesChangeable;
            rightTimeSlotTimesChangeable = that.getTimeSlotTimesChangeable();
            if (this.timeSlotTimesChangeable!= null) {
                if (that.timeSlotTimesChangeable!= null) {
                    if (!leftTimeSlotTimesChangeable.equals(rightTimeSlotTimesChangeable)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.timeSlotTimesChangeable!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftTimeSlotTimeMode;
            leftTimeSlotTimeMode = this.getTimeSlotTimeMode();
            ElementTagType rightTimeSlotTimeMode;
            rightTimeSlotTimeMode = that.getTimeSlotTimeMode();
            if (this.timeSlotTimeMode!= null) {
                if (that.timeSlotTimeMode!= null) {
                    if (!leftTimeSlotTimeMode.equals(rightTimeSlotTimeMode)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.timeSlotTimeMode!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftLabel;
            leftLabel = this.getLabel();
            ElementTagType rightLabel;
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
            ElementTagType leftDescription;
            leftDescription = this.getDescription();
            ElementTagType rightDescription;
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
            ElementTagType theTimeTableId;
            theTimeTableId = this.getTimeTableId();
            if (this.timeTableId!= null) {
                currentHashCode += theTimeTableId.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theTimeSlotCountChangeable;
            theTimeSlotCountChangeable = this.getTimeSlotCountChangeable();
            if (this.timeSlotCountChangeable!= null) {
                currentHashCode += theTimeSlotCountChangeable.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theTimeSlotTimesChangeable;
            theTimeSlotTimesChangeable = this.getTimeSlotTimesChangeable();
            if (this.timeSlotTimesChangeable!= null) {
                currentHashCode += theTimeSlotTimesChangeable.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theTimeSlotTimeMode;
            theTimeSlotTimeMode = this.getTimeSlotTimeMode();
            if (this.timeSlotTimeMode!= null) {
                currentHashCode += theTimeSlotTimeMode.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theLabel;
            theLabel = this.getLabel();
            if (this.label!= null) {
                currentHashCode += theLabel.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theDescription;
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
            ElementTagType theTimeTableId;
            theTimeTableId = this.getTimeTableId();
            strategy.appendField(locator, this, "timeTableId", buffer, theTimeTableId, (this.timeTableId!= null));
        }
        {
            ElementTagType theTimeSlotCountChangeable;
            theTimeSlotCountChangeable = this.getTimeSlotCountChangeable();
            strategy.appendField(locator, this, "timeSlotCountChangeable", buffer, theTimeSlotCountChangeable, (this.timeSlotCountChangeable!= null));
        }
        {
            ElementTagType theTimeSlotTimesChangeable;
            theTimeSlotTimesChangeable = this.getTimeSlotTimesChangeable();
            strategy.appendField(locator, this, "timeSlotTimesChangeable", buffer, theTimeSlotTimesChangeable, (this.timeSlotTimesChangeable!= null));
        }
        {
            ElementTagType theTimeSlotTimeMode;
            theTimeSlotTimeMode = this.getTimeSlotTimeMode();
            strategy.appendField(locator, this, "timeSlotTimeMode", buffer, theTimeSlotTimeMode, (this.timeSlotTimeMode!= null));
        }
        {
            ElementTagType theLabel;
            theLabel = this.getLabel();
            strategy.appendField(locator, this, "label", buffer, theLabel, (this.label!= null));
        }
        {
            ElementTagType theDescription;
            theDescription = this.getDescription();
            strategy.appendField(locator, this, "description", buffer, theDescription, (this.description!= null));
        }
        return buffer;
    }

}
