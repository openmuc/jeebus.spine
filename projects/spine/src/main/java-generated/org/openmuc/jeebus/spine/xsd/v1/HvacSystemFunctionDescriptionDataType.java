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
 * <p>Java class for HvacSystemFunctionDescriptionDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HvacSystemFunctionDescriptionDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="systemFunctionId" type="{http://docs.eebus.org/spine/xsd/v1}HvacSystemFunctionIdType" minOccurs="0"/&gt;
 *         &lt;element name="systemFunctionType" type="{http://docs.eebus.org/spine/xsd/v1}HvacSystemFunctionTypeType" minOccurs="0"/&gt;
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
@XmlType(name = "HvacSystemFunctionDescriptionDataType", propOrder = {
    "systemFunctionId",
    "systemFunctionType",
    "label",
    "description"
})
public class HvacSystemFunctionDescriptionDataType implements Cloneable, CopyTo, ToString
{

    @XmlSchemaType(name = "unsignedInt")
    protected Long systemFunctionId;
    protected String systemFunctionType;
    protected String label;
    protected String description;

    /**
     * Default no-arg constructor
     * 
     */
    public HvacSystemFunctionDescriptionDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public HvacSystemFunctionDescriptionDataType(final Long systemFunctionId, final String systemFunctionType, final String label, final String description) {
        this.systemFunctionId = systemFunctionId;
        this.systemFunctionType = systemFunctionType;
        this.label = label;
        this.description = description;
    }

    /**
     * Gets the value of the systemFunctionId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSystemFunctionId() {
        return systemFunctionId;
    }

    /**
     * Sets the value of the systemFunctionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSystemFunctionId(Long value) {
        this.systemFunctionId = value;
    }

    /**
     * Gets the value of the systemFunctionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemFunctionType() {
        return systemFunctionType;
    }

    /**
     * Sets the value of the systemFunctionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemFunctionType(String value) {
        this.systemFunctionType = value;
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
     * Sets the value of the systemFunctionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     * @return
     *     The class instance
     */
    public HvacSystemFunctionDescriptionDataType withSystemFunctionId(Long value) {
        setSystemFunctionId(value);
        return this;
    }

    /**
     * Sets the value of the systemFunctionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public HvacSystemFunctionDescriptionDataType withSystemFunctionType(String value) {
        setSystemFunctionType(value);
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
    public HvacSystemFunctionDescriptionDataType withLabel(String value) {
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
    public HvacSystemFunctionDescriptionDataType withDescription(String value) {
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
        if (draftCopy instanceof HvacSystemFunctionDescriptionDataType) {
            final HvacSystemFunctionDescriptionDataType copy = ((HvacSystemFunctionDescriptionDataType) draftCopy);
            {
                Boolean systemFunctionIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.systemFunctionId!= null));
                if (systemFunctionIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceSystemFunctionId;
                    sourceSystemFunctionId = this.getSystemFunctionId();
                    Long copySystemFunctionId = ((Long) strategy.copy(LocatorUtils.property(locator, "systemFunctionId", sourceSystemFunctionId), sourceSystemFunctionId, (this.systemFunctionId!= null)));
                    copy.setSystemFunctionId(copySystemFunctionId);
                } else {
                    if (systemFunctionIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.systemFunctionId = null;
                    }
                }
            }
            {
                Boolean systemFunctionTypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.systemFunctionType!= null));
                if (systemFunctionTypeShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceSystemFunctionType;
                    sourceSystemFunctionType = this.getSystemFunctionType();
                    String copySystemFunctionType = ((String) strategy.copy(LocatorUtils.property(locator, "systemFunctionType", sourceSystemFunctionType), sourceSystemFunctionType, (this.systemFunctionType!= null)));
                    copy.setSystemFunctionType(copySystemFunctionType);
                } else {
                    if (systemFunctionTypeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.systemFunctionType = null;
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
        return new HvacSystemFunctionDescriptionDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final HvacSystemFunctionDescriptionDataType that = ((HvacSystemFunctionDescriptionDataType) object);
        {
            Long leftSystemFunctionId;
            leftSystemFunctionId = this.getSystemFunctionId();
            Long rightSystemFunctionId;
            rightSystemFunctionId = that.getSystemFunctionId();
            if (this.systemFunctionId!= null) {
                if (that.systemFunctionId!= null) {
                    if (!leftSystemFunctionId.equals(rightSystemFunctionId)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.systemFunctionId!= null) {
                    return false;
                }
            }
        }
        {
            String leftSystemFunctionType;
            leftSystemFunctionType = this.getSystemFunctionType();
            String rightSystemFunctionType;
            rightSystemFunctionType = that.getSystemFunctionType();
            if (this.systemFunctionType!= null) {
                if (that.systemFunctionType!= null) {
                    if (!leftSystemFunctionType.equals(rightSystemFunctionType)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.systemFunctionType!= null) {
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
            Long theSystemFunctionId;
            theSystemFunctionId = this.getSystemFunctionId();
            if (this.systemFunctionId!= null) {
                currentHashCode += theSystemFunctionId.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String theSystemFunctionType;
            theSystemFunctionType = this.getSystemFunctionType();
            if (this.systemFunctionType!= null) {
                currentHashCode += theSystemFunctionType.hashCode();
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
            Long theSystemFunctionId;
            theSystemFunctionId = this.getSystemFunctionId();
            strategy.appendField(locator, this, "systemFunctionId", buffer, theSystemFunctionId, (this.systemFunctionId!= null));
        }
        {
            String theSystemFunctionType;
            theSystemFunctionType = this.getSystemFunctionType();
            strategy.appendField(locator, this, "systemFunctionType", buffer, theSystemFunctionType, (this.systemFunctionType!= null));
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
