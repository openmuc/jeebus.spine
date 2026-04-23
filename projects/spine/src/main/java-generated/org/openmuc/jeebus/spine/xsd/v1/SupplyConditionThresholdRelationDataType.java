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
 * <p>Java class for SupplyConditionThresholdRelationDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SupplyConditionThresholdRelationDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="conditionId" type="{http://docs.eebus.org/spine/xsd/v1}ConditionIdType" minOccurs="0"/&gt;
 *         &lt;element name="thresholdId" type="{http://docs.eebus.org/spine/xsd/v1}ThresholdIdType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupplyConditionThresholdRelationDataType", propOrder = {
    "conditionId",
    "thresholdId"
})
public class SupplyConditionThresholdRelationDataType implements Cloneable, CopyTo, ToString
{

    @XmlSchemaType(name = "unsignedInt")
    protected Long conditionId;
    @XmlElement(type = Long.class)
    @XmlSchemaType(name = "unsignedInt")
    protected List<Long> thresholdId;

    /**
     * Default no-arg constructor
     * 
     */
    public SupplyConditionThresholdRelationDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public SupplyConditionThresholdRelationDataType(final Long conditionId, final List<Long> thresholdId) {
        this.conditionId = conditionId;
        this.thresholdId = thresholdId;
    }

    /**
     * Gets the value of the conditionId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getConditionId() {
        return conditionId;
    }

    /**
     * Sets the value of the conditionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setConditionId(Long value) {
        this.conditionId = value;
    }

    /**
     * Gets the value of the thresholdId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the thresholdId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getThresholdId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getThresholdId() {
        if (thresholdId == null) {
            thresholdId = new ArrayList<Long>();
        }
        return this.thresholdId;
    }

    /**
     * Sets the value of the conditionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     * @return
     *     The class instance
     */
    public SupplyConditionThresholdRelationDataType withConditionId(Long value) {
        setConditionId(value);
        return this;
    }

    /**
     * Adds objects to the list of ThresholdId using add method
     * 
     * @param values
     *     objects to add to the list ThresholdId
     * @return
     *     The class instance
     */
    public SupplyConditionThresholdRelationDataType withThresholdId(Long... values) {
        if (values!= null) {
            for (Long value: values) {
                getThresholdId().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of ThresholdId using addAll method
     * 
     * @param values
     *     objects to add to the list ThresholdId
     * @return
     *     The class instance
     */
    public SupplyConditionThresholdRelationDataType withThresholdId(Collection<Long> values) {
        if (values!= null) {
            getThresholdId().addAll(values);
        }
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
        if (draftCopy instanceof SupplyConditionThresholdRelationDataType) {
            final SupplyConditionThresholdRelationDataType copy = ((SupplyConditionThresholdRelationDataType) draftCopy);
            {
                Boolean conditionIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.conditionId!= null));
                if (conditionIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceConditionId;
                    sourceConditionId = this.getConditionId();
                    Long copyConditionId = ((Long) strategy.copy(LocatorUtils.property(locator, "conditionId", sourceConditionId), sourceConditionId, (this.conditionId!= null)));
                    copy.setConditionId(copyConditionId);
                } else {
                    if (conditionIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.conditionId = null;
                    }
                }
            }
            {
                Boolean thresholdIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.thresholdId!= null)&&(!this.thresholdId.isEmpty())));
                if (thresholdIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<Long> sourceThresholdId;
                    sourceThresholdId = (((this.thresholdId!= null)&&(!this.thresholdId.isEmpty()))?this.getThresholdId():null);
                    @SuppressWarnings("unchecked")
                    List<Long> copyThresholdId = ((List<Long> ) strategy.copy(LocatorUtils.property(locator, "thresholdId", sourceThresholdId), sourceThresholdId, ((this.thresholdId!= null)&&(!this.thresholdId.isEmpty()))));
                    copy.thresholdId = null;
                    if (copyThresholdId!= null) {
                        List<Long> uniqueThresholdIdl = copy.getThresholdId();
                        uniqueThresholdIdl.addAll(copyThresholdId);
                    }
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
        return new SupplyConditionThresholdRelationDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final SupplyConditionThresholdRelationDataType that = ((SupplyConditionThresholdRelationDataType) object);
        {
            Long leftConditionId;
            leftConditionId = this.getConditionId();
            Long rightConditionId;
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
            List<Long> leftThresholdId;
            leftThresholdId = (((this.thresholdId!= null)&&(!this.thresholdId.isEmpty()))?this.getThresholdId():null);
            List<Long> rightThresholdId;
            rightThresholdId = (((that.thresholdId!= null)&&(!that.thresholdId.isEmpty()))?that.getThresholdId():null);
            if ((this.thresholdId!= null)&&(!this.thresholdId.isEmpty())) {
                if ((that.thresholdId!= null)&&(!that.thresholdId.isEmpty())) {
                    if (!leftThresholdId.equals(rightThresholdId)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.thresholdId!= null)&&(!that.thresholdId.isEmpty())) {
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
            Long theConditionId;
            theConditionId = this.getConditionId();
            if (this.conditionId!= null) {
                currentHashCode += theConditionId.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            List<Long> theThresholdId;
            theThresholdId = (((this.thresholdId!= null)&&(!this.thresholdId.isEmpty()))?this.getThresholdId():null);
            if ((this.thresholdId!= null)&&(!this.thresholdId.isEmpty())) {
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
            Long theConditionId;
            theConditionId = this.getConditionId();
            strategy.appendField(locator, this, "conditionId", buffer, theConditionId, (this.conditionId!= null));
        }
        {
            List<Long> theThresholdId;
            theThresholdId = (((this.thresholdId!= null)&&(!this.thresholdId.isEmpty()))?this.getThresholdId():null);
            strategy.appendField(locator, this, "thresholdId", buffer, theThresholdId, ((this.thresholdId!= null)&&(!this.thresholdId.isEmpty())));
        }
        return buffer;
    }

}
