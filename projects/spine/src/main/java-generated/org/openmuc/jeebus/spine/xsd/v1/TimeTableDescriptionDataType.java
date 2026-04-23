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
 * <p>Java class for TimeTableDescriptionDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeTableDescriptionDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="timeTableId" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="timeSlotCountChangeable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="timeSlotTimesChangeable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="timeSlotTimeMode" type="{http://docs.eebus.org/spine/xsd/v1}TimeSlotTimeModeType" minOccurs="0"/&gt;
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
@XmlType(name = "TimeTableDescriptionDataType", propOrder = {
    "timeTableId",
    "timeSlotCountChangeable",
    "timeSlotTimesChangeable",
    "timeSlotTimeMode",
    "label",
    "description"
})
public class TimeTableDescriptionDataType implements Cloneable, CopyTo, ToString
{

    @XmlSchemaType(name = "unsignedInt")
    protected Long timeTableId;
    protected Boolean timeSlotCountChangeable;
    protected Boolean timeSlotTimesChangeable;
    protected String timeSlotTimeMode;
    protected String label;
    protected String description;

    /**
     * Default no-arg constructor
     * 
     */
    public TimeTableDescriptionDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public TimeTableDescriptionDataType(final Long timeTableId, final Boolean timeSlotCountChangeable, final Boolean timeSlotTimesChangeable, final String timeSlotTimeMode, final String label, final String description) {
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
     * Gets the value of the timeSlotCountChangeable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getTimeSlotCountChangeable() {
        return timeSlotCountChangeable;
    }

    /**
     * Sets the value of the timeSlotCountChangeable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTimeSlotCountChangeable(Boolean value) {
        this.timeSlotCountChangeable = value;
    }

    /**
     * Gets the value of the timeSlotTimesChangeable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getTimeSlotTimesChangeable() {
        return timeSlotTimesChangeable;
    }

    /**
     * Sets the value of the timeSlotTimesChangeable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTimeSlotTimesChangeable(Boolean value) {
        this.timeSlotTimesChangeable = value;
    }

    /**
     * Gets the value of the timeSlotTimeMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeSlotTimeMode() {
        return timeSlotTimeMode;
    }

    /**
     * Sets the value of the timeSlotTimeMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeSlotTimeMode(String value) {
        this.timeSlotTimeMode = value;
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
     * Sets the value of the timeTableId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     * @return
     *     The class instance
     */
    public TimeTableDescriptionDataType withTimeTableId(Long value) {
        setTimeTableId(value);
        return this;
    }

    /**
     * Sets the value of the timeSlotCountChangeable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     * @return
     *     The class instance
     */
    public TimeTableDescriptionDataType withTimeSlotCountChangeable(Boolean value) {
        setTimeSlotCountChangeable(value);
        return this;
    }

    /**
     * Sets the value of the timeSlotTimesChangeable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     * @return
     *     The class instance
     */
    public TimeTableDescriptionDataType withTimeSlotTimesChangeable(Boolean value) {
        setTimeSlotTimesChangeable(value);
        return this;
    }

    /**
     * Sets the value of the timeSlotTimeMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public TimeTableDescriptionDataType withTimeSlotTimeMode(String value) {
        setTimeSlotTimeMode(value);
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
    public TimeTableDescriptionDataType withLabel(String value) {
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
    public TimeTableDescriptionDataType withDescription(String value) {
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
        if (draftCopy instanceof TimeTableDescriptionDataType) {
            final TimeTableDescriptionDataType copy = ((TimeTableDescriptionDataType) draftCopy);
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
                Boolean timeSlotCountChangeableShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.timeSlotCountChangeable!= null));
                if (timeSlotCountChangeableShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceTimeSlotCountChangeable;
                    sourceTimeSlotCountChangeable = this.getTimeSlotCountChangeable();
                    Boolean copyTimeSlotCountChangeable = ((Boolean) strategy.copy(LocatorUtils.property(locator, "timeSlotCountChangeable", sourceTimeSlotCountChangeable), sourceTimeSlotCountChangeable, (this.timeSlotCountChangeable!= null)));
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
                    Boolean sourceTimeSlotTimesChangeable;
                    sourceTimeSlotTimesChangeable = this.getTimeSlotTimesChangeable();
                    Boolean copyTimeSlotTimesChangeable = ((Boolean) strategy.copy(LocatorUtils.property(locator, "timeSlotTimesChangeable", sourceTimeSlotTimesChangeable), sourceTimeSlotTimesChangeable, (this.timeSlotTimesChangeable!= null)));
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
                    String sourceTimeSlotTimeMode;
                    sourceTimeSlotTimeMode = this.getTimeSlotTimeMode();
                    String copyTimeSlotTimeMode = ((String) strategy.copy(LocatorUtils.property(locator, "timeSlotTimeMode", sourceTimeSlotTimeMode), sourceTimeSlotTimeMode, (this.timeSlotTimeMode!= null)));
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
        return new TimeTableDescriptionDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TimeTableDescriptionDataType that = ((TimeTableDescriptionDataType) object);
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
            Boolean leftTimeSlotCountChangeable;
            leftTimeSlotCountChangeable = this.getTimeSlotCountChangeable();
            Boolean rightTimeSlotCountChangeable;
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
            Boolean leftTimeSlotTimesChangeable;
            leftTimeSlotTimesChangeable = this.getTimeSlotTimesChangeable();
            Boolean rightTimeSlotTimesChangeable;
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
            String leftTimeSlotTimeMode;
            leftTimeSlotTimeMode = this.getTimeSlotTimeMode();
            String rightTimeSlotTimeMode;
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
            Long theTimeTableId;
            theTimeTableId = this.getTimeTableId();
            if (this.timeTableId!= null) {
                currentHashCode += theTimeTableId.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            Boolean theTimeSlotCountChangeable;
            theTimeSlotCountChangeable = this.getTimeSlotCountChangeable();
            if (this.timeSlotCountChangeable!= null) {
                currentHashCode += theTimeSlotCountChangeable.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            Boolean theTimeSlotTimesChangeable;
            theTimeSlotTimesChangeable = this.getTimeSlotTimesChangeable();
            if (this.timeSlotTimesChangeable!= null) {
                currentHashCode += theTimeSlotTimesChangeable.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String theTimeSlotTimeMode;
            theTimeSlotTimeMode = this.getTimeSlotTimeMode();
            if (this.timeSlotTimeMode!= null) {
                currentHashCode += theTimeSlotTimeMode.hashCode();
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
            Long theTimeTableId;
            theTimeTableId = this.getTimeTableId();
            strategy.appendField(locator, this, "timeTableId", buffer, theTimeTableId, (this.timeTableId!= null));
        }
        {
            Boolean theTimeSlotCountChangeable;
            theTimeSlotCountChangeable = this.getTimeSlotCountChangeable();
            strategy.appendField(locator, this, "timeSlotCountChangeable", buffer, theTimeSlotCountChangeable, (this.timeSlotCountChangeable!= null));
        }
        {
            Boolean theTimeSlotTimesChangeable;
            theTimeSlotTimesChangeable = this.getTimeSlotTimesChangeable();
            strategy.appendField(locator, this, "timeSlotTimesChangeable", buffer, theTimeSlotTimesChangeable, (this.timeSlotTimesChangeable!= null));
        }
        {
            String theTimeSlotTimeMode;
            theTimeSlotTimeMode = this.getTimeSlotTimeMode();
            strategy.appendField(locator, this, "timeSlotTimeMode", buffer, theTimeSlotTimeMode, (this.timeSlotTimeMode!= null));
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
