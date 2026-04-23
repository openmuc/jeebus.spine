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

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
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
 * <p>Java class for HvacOverrunDescriptionDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HvacOverrunDescriptionDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="overrunId" type="{http://docs.eebus.org/spine/xsd/v1}HvacOverrunIdType" minOccurs="0"/&gt;
 *         &lt;element name="overrunType" type="{http://docs.eebus.org/spine/xsd/v1}HvacOverrunTypeType" minOccurs="0"/&gt;
 *         &lt;element name="affectedSystemFunctionId" type="{http://docs.eebus.org/spine/xsd/v1}HvacSystemFunctionIdType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "HvacOverrunDescriptionDataType", propOrder = {
    "overrunId",
    "overrunType",
    "affectedSystemFunctionId",
    "label",
    "description"
})
public class HvacOverrunDescriptionDataType implements Cloneable, CopyTo, ToString
{

    @XmlSchemaType(name = "unsignedInt")
    protected Long overrunId;
    protected String overrunType;
    @XmlElement(type = Long.class)
    @XmlSchemaType(name = "unsignedInt")
    protected List<Long> affectedSystemFunctionId;
    protected String label;
    protected String description;

    /**
     * Default no-arg constructor
     * 
     */
    public HvacOverrunDescriptionDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public HvacOverrunDescriptionDataType(final Long overrunId, final String overrunType, final List<Long> affectedSystemFunctionId, final String label, final String description) {
        this.overrunId = overrunId;
        this.overrunType = overrunType;
        this.affectedSystemFunctionId = affectedSystemFunctionId;
        this.label = label;
        this.description = description;
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
     * Gets the value of the overrunType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverrunType() {
        return overrunType;
    }

    /**
     * Sets the value of the overrunType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverrunType(String value) {
        this.overrunType = value;
    }

    /**
     * Gets the value of the affectedSystemFunctionId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the affectedSystemFunctionId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAffectedSystemFunctionId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getAffectedSystemFunctionId() {
        if (affectedSystemFunctionId == null) {
            affectedSystemFunctionId = new ArrayList<Long>();
        }
        return this.affectedSystemFunctionId;
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
     * Sets the value of the overrunId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     * @return
     *     The class instance
     */
    public HvacOverrunDescriptionDataType withOverrunId(Long value) {
        setOverrunId(value);
        return this;
    }

    /**
     * Sets the value of the overrunType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public HvacOverrunDescriptionDataType withOverrunType(String value) {
        setOverrunType(value);
        return this;
    }

    /**
     * Adds objects to the list of AffectedSystemFunctionId using add method
     * 
     * @param values
     *     objects to add to the list AffectedSystemFunctionId
     * @return
     *     The class instance
     */
    public HvacOverrunDescriptionDataType withAffectedSystemFunctionId(Long... values) {
        if (values!= null) {
            for (Long value: values) {
                getAffectedSystemFunctionId().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of AffectedSystemFunctionId using addAll method
     * 
     * @param values
     *     objects to add to the list AffectedSystemFunctionId
     * @return
     *     The class instance
     */
    public HvacOverrunDescriptionDataType withAffectedSystemFunctionId(Collection<Long> values) {
        if (values!= null) {
            getAffectedSystemFunctionId().addAll(values);
        }
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
    public HvacOverrunDescriptionDataType withLabel(String value) {
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
    public HvacOverrunDescriptionDataType withDescription(String value) {
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
        if (draftCopy instanceof HvacOverrunDescriptionDataType) {
            final HvacOverrunDescriptionDataType copy = ((HvacOverrunDescriptionDataType) draftCopy);
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
                Boolean overrunTypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.overrunType!= null));
                if (overrunTypeShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceOverrunType;
                    sourceOverrunType = this.getOverrunType();
                    String copyOverrunType = ((String) strategy.copy(LocatorUtils.property(locator, "overrunType", sourceOverrunType), sourceOverrunType, (this.overrunType!= null)));
                    copy.setOverrunType(copyOverrunType);
                } else {
                    if (overrunTypeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.overrunType = null;
                    }
                }
            }
            {
                Boolean affectedSystemFunctionIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.affectedSystemFunctionId!= null)&&(!this.affectedSystemFunctionId.isEmpty())));
                if (affectedSystemFunctionIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<Long> sourceAffectedSystemFunctionId;
                    sourceAffectedSystemFunctionId = (((this.affectedSystemFunctionId!= null)&&(!this.affectedSystemFunctionId.isEmpty()))?this.getAffectedSystemFunctionId():null);
                    @SuppressWarnings("unchecked")
                    List<Long> copyAffectedSystemFunctionId = ((List<Long> ) strategy.copy(LocatorUtils.property(locator, "affectedSystemFunctionId", sourceAffectedSystemFunctionId), sourceAffectedSystemFunctionId, ((this.affectedSystemFunctionId!= null)&&(!this.affectedSystemFunctionId.isEmpty()))));
                    copy.affectedSystemFunctionId = null;
                    if (copyAffectedSystemFunctionId!= null) {
                        List<Long> uniqueAffectedSystemFunctionIdl = copy.getAffectedSystemFunctionId();
                        uniqueAffectedSystemFunctionIdl.addAll(copyAffectedSystemFunctionId);
                    }
                } else {
                    if (affectedSystemFunctionIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.affectedSystemFunctionId = null;
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
        return new HvacOverrunDescriptionDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final HvacOverrunDescriptionDataType that = ((HvacOverrunDescriptionDataType) object);
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
            String leftOverrunType;
            leftOverrunType = this.getOverrunType();
            String rightOverrunType;
            rightOverrunType = that.getOverrunType();
            if (this.overrunType!= null) {
                if (that.overrunType!= null) {
                    if (!leftOverrunType.equals(rightOverrunType)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.overrunType!= null) {
                    return false;
                }
            }
        }
        {
            List<Long> leftAffectedSystemFunctionId;
            leftAffectedSystemFunctionId = (((this.affectedSystemFunctionId!= null)&&(!this.affectedSystemFunctionId.isEmpty()))?this.getAffectedSystemFunctionId():null);
            List<Long> rightAffectedSystemFunctionId;
            rightAffectedSystemFunctionId = (((that.affectedSystemFunctionId!= null)&&(!that.affectedSystemFunctionId.isEmpty()))?that.getAffectedSystemFunctionId():null);
            if ((this.affectedSystemFunctionId!= null)&&(!this.affectedSystemFunctionId.isEmpty())) {
                if ((that.affectedSystemFunctionId!= null)&&(!that.affectedSystemFunctionId.isEmpty())) {
                    if (!leftAffectedSystemFunctionId.equals(rightAffectedSystemFunctionId)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.affectedSystemFunctionId!= null)&&(!that.affectedSystemFunctionId.isEmpty())) {
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
            Long theOverrunId;
            theOverrunId = this.getOverrunId();
            if (this.overrunId!= null) {
                currentHashCode += theOverrunId.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String theOverrunType;
            theOverrunType = this.getOverrunType();
            if (this.overrunType!= null) {
                currentHashCode += theOverrunType.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            List<Long> theAffectedSystemFunctionId;
            theAffectedSystemFunctionId = (((this.affectedSystemFunctionId!= null)&&(!this.affectedSystemFunctionId.isEmpty()))?this.getAffectedSystemFunctionId():null);
            if ((this.affectedSystemFunctionId!= null)&&(!this.affectedSystemFunctionId.isEmpty())) {
                currentHashCode += theAffectedSystemFunctionId.hashCode();
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
            Long theOverrunId;
            theOverrunId = this.getOverrunId();
            strategy.appendField(locator, this, "overrunId", buffer, theOverrunId, (this.overrunId!= null));
        }
        {
            String theOverrunType;
            theOverrunType = this.getOverrunType();
            strategy.appendField(locator, this, "overrunType", buffer, theOverrunType, (this.overrunType!= null));
        }
        {
            List<Long> theAffectedSystemFunctionId;
            theAffectedSystemFunctionId = (((this.affectedSystemFunctionId!= null)&&(!this.affectedSystemFunctionId.isEmpty()))?this.getAffectedSystemFunctionId():null);
            strategy.appendField(locator, this, "affectedSystemFunctionId", buffer, theAffectedSystemFunctionId, ((this.affectedSystemFunctionId!= null)&&(!this.affectedSystemFunctionId.isEmpty())));
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
