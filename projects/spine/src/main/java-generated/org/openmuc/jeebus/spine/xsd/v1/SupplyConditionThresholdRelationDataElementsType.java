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
 * <p>Java class for SupplyConditionThresholdRelationDataElementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SupplyConditionThresholdRelationDataElementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="conditionId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="thresholdId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupplyConditionThresholdRelationDataElementsType", propOrder = {
    "conditionId",
    "thresholdId"
})
public class SupplyConditionThresholdRelationDataElementsType implements Cloneable, CopyTo, ToString
{

    protected ElementTagType conditionId;
    protected ElementTagType thresholdId;

    /**
     * Default no-arg constructor
     * 
     */
    public SupplyConditionThresholdRelationDataElementsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public SupplyConditionThresholdRelationDataElementsType(final ElementTagType conditionId, final ElementTagType thresholdId) {
        this.conditionId = conditionId;
        this.thresholdId = thresholdId;
    }

    /**
     * Gets the value of the conditionId property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getConditionId() {
        return conditionId;
    }

    /**
     * Sets the value of the conditionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setConditionId(ElementTagType value) {
        this.conditionId = value;
    }

    /**
     * Gets the value of the thresholdId property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getThresholdId() {
        return thresholdId;
    }

    /**
     * Sets the value of the thresholdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setThresholdId(ElementTagType value) {
        this.thresholdId = value;
    }

    /**
     * Sets the value of the conditionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public SupplyConditionThresholdRelationDataElementsType withConditionId(ElementTagType value) {
        setConditionId(value);
        return this;
    }

    /**
     * Sets the value of the thresholdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public SupplyConditionThresholdRelationDataElementsType withThresholdId(ElementTagType value) {
        setThresholdId(value);
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
        if (draftCopy instanceof SupplyConditionThresholdRelationDataElementsType) {
            final SupplyConditionThresholdRelationDataElementsType copy = ((SupplyConditionThresholdRelationDataElementsType) draftCopy);
            {
                Boolean conditionIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.conditionId!= null));
                if (conditionIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceConditionId;
                    sourceConditionId = this.getConditionId();
                    ElementTagType copyConditionId = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "conditionId", sourceConditionId), sourceConditionId, (this.conditionId!= null)));
                    copy.setConditionId(copyConditionId);
                } else {
                    if (conditionIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.conditionId = null;
                    }
                }
            }
            {
                Boolean thresholdIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.thresholdId!= null));
                if (thresholdIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceThresholdId;
                    sourceThresholdId = this.getThresholdId();
                    ElementTagType copyThresholdId = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "thresholdId", sourceThresholdId), sourceThresholdId, (this.thresholdId!= null)));
                    copy.setThresholdId(copyThresholdId);
                } else {
                    if (thresholdIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.thresholdId = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new SupplyConditionThresholdRelationDataElementsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final SupplyConditionThresholdRelationDataElementsType that = ((SupplyConditionThresholdRelationDataElementsType) object);
        {
            ElementTagType leftConditionId;
            leftConditionId = this.getConditionId();
            ElementTagType rightConditionId;
            rightConditionId = that.getConditionId();
            if (this.conditionId!= null) {
                if (that.conditionId!= null) {
                    if (!leftConditionId.equals(rightConditionId)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.conditionId!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftThresholdId;
            leftThresholdId = this.getThresholdId();
            ElementTagType rightThresholdId;
            rightThresholdId = that.getThresholdId();
            if (this.thresholdId!= null) {
                if (that.thresholdId!= null) {
                    if (!leftThresholdId.equals(rightThresholdId)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.thresholdId!= null) {
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
            ElementTagType theConditionId;
            theConditionId = this.getConditionId();
            if (this.conditionId!= null) {
                currentHashCode += theConditionId.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theThresholdId;
            theThresholdId = this.getThresholdId();
            if (this.thresholdId!= null) {
                currentHashCode += theThresholdId.hashCode();
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
            ElementTagType theConditionId;
            theConditionId = this.getConditionId();
            strategy.appendField(locator, this, "conditionId", buffer, theConditionId, (this.conditionId!= null));
        }
        {
            ElementTagType theThresholdId;
            theThresholdId = this.getThresholdId();
            strategy.appendField(locator, this, "thresholdId", buffer, theThresholdId, (this.thresholdId!= null));
        }
        return buffer;
    }

}
