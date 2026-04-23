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
 * <p>Java class for HvacOperationModeDescriptionDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HvacOperationModeDescriptionDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="operationModeId" type="{http://docs.eebus.org/spine/xsd/v1}HvacOperationModeIdType" minOccurs="0"/&gt;
 *         &lt;element name="operationModeType" type="{http://docs.eebus.org/spine/xsd/v1}HvacOperationModeTypeType" minOccurs="0"/&gt;
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
@XmlType(name = "HvacOperationModeDescriptionDataType", propOrder = {
    "operationModeId",
    "operationModeType",
    "label",
    "description"
})
public class HvacOperationModeDescriptionDataType implements Cloneable, CopyTo, ToString
{

    @XmlSchemaType(name = "unsignedInt")
    protected Long operationModeId;
    protected String operationModeType;
    protected String label;
    protected String description;

    /**
     * Default no-arg constructor
     * 
     */
    public HvacOperationModeDescriptionDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public HvacOperationModeDescriptionDataType(final Long operationModeId, final String operationModeType, final String label, final String description) {
        this.operationModeId = operationModeId;
        this.operationModeType = operationModeType;
        this.label = label;
        this.description = description;
    }

    /**
     * Gets the value of the operationModeId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOperationModeId() {
        return operationModeId;
    }

    /**
     * Sets the value of the operationModeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOperationModeId(Long value) {
        this.operationModeId = value;
    }

    /**
     * Gets the value of the operationModeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationModeType() {
        return operationModeType;
    }

    /**
     * Sets the value of the operationModeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationModeType(String value) {
        this.operationModeType = value;
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
     * Sets the value of the operationModeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     * @return
     *     The class instance
     */
    public HvacOperationModeDescriptionDataType withOperationModeId(Long value) {
        setOperationModeId(value);
        return this;
    }

    /**
     * Sets the value of the operationModeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public HvacOperationModeDescriptionDataType withOperationModeType(String value) {
        setOperationModeType(value);
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
    public HvacOperationModeDescriptionDataType withLabel(String value) {
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
    public HvacOperationModeDescriptionDataType withDescription(String value) {
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
        if (draftCopy instanceof HvacOperationModeDescriptionDataType) {
            final HvacOperationModeDescriptionDataType copy = ((HvacOperationModeDescriptionDataType) draftCopy);
            {
                Boolean operationModeIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.operationModeId!= null));
                if (operationModeIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceOperationModeId;
                    sourceOperationModeId = this.getOperationModeId();
                    Long copyOperationModeId = ((Long) strategy.copy(LocatorUtils.property(locator, "operationModeId", sourceOperationModeId), sourceOperationModeId, (this.operationModeId!= null)));
                    copy.setOperationModeId(copyOperationModeId);
                } else {
                    if (operationModeIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.operationModeId = null;
                    }
                }
            }
            {
                Boolean operationModeTypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.operationModeType!= null));
                if (operationModeTypeShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceOperationModeType;
                    sourceOperationModeType = this.getOperationModeType();
                    String copyOperationModeType = ((String) strategy.copy(LocatorUtils.property(locator, "operationModeType", sourceOperationModeType), sourceOperationModeType, (this.operationModeType!= null)));
                    copy.setOperationModeType(copyOperationModeType);
                } else {
                    if (operationModeTypeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.operationModeType = null;
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
        return new HvacOperationModeDescriptionDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final HvacOperationModeDescriptionDataType that = ((HvacOperationModeDescriptionDataType) object);
        {
            Long leftOperationModeId;
            leftOperationModeId = this.getOperationModeId();
            Long rightOperationModeId;
            rightOperationModeId = that.getOperationModeId();
            if (this.operationModeId!= null) {
                if (that.operationModeId!= null) {
                    if (!leftOperationModeId.equals(rightOperationModeId)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.operationModeId!= null) {
                    return false;
                }
            }
        }
        {
            String leftOperationModeType;
            leftOperationModeType = this.getOperationModeType();
            String rightOperationModeType;
            rightOperationModeType = that.getOperationModeType();
            if (this.operationModeType!= null) {
                if (that.operationModeType!= null) {
                    if (!leftOperationModeType.equals(rightOperationModeType)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.operationModeType!= null) {
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
            Long theOperationModeId;
            theOperationModeId = this.getOperationModeId();
            if (this.operationModeId!= null) {
                currentHashCode += theOperationModeId.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String theOperationModeType;
            theOperationModeType = this.getOperationModeType();
            if (this.operationModeType!= null) {
                currentHashCode += theOperationModeType.hashCode();
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
            Long theOperationModeId;
            theOperationModeId = this.getOperationModeId();
            strategy.appendField(locator, this, "operationModeId", buffer, theOperationModeId, (this.operationModeId!= null));
        }
        {
            String theOperationModeType;
            theOperationModeType = this.getOperationModeType();
            strategy.appendField(locator, this, "operationModeType", buffer, theOperationModeType, (this.operationModeType!= null));
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
