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
 * <p>Java class for SupplyConditionDescriptionListDataSelectorsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SupplyConditionDescriptionListDataSelectorsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="conditionId" type="{http://docs.eebus.org/spine/xsd/v1}ConditionIdType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupplyConditionDescriptionListDataSelectorsType", propOrder = {
    "conditionId"
})
public class SupplyConditionDescriptionListDataSelectorsType implements Cloneable, CopyTo, ToString
{

    @XmlSchemaType(name = "unsignedInt")
    protected Long conditionId;

    /**
     * Default no-arg constructor
     * 
     */
    public SupplyConditionDescriptionListDataSelectorsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public SupplyConditionDescriptionListDataSelectorsType(final Long conditionId) {
        this.conditionId = conditionId;
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
     * Sets the value of the conditionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     * @return
     *     The class instance
     */
    public SupplyConditionDescriptionListDataSelectorsType withConditionId(Long value) {
        setConditionId(value);
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
        if (draftCopy instanceof SupplyConditionDescriptionListDataSelectorsType) {
            final SupplyConditionDescriptionListDataSelectorsType copy = ((SupplyConditionDescriptionListDataSelectorsType) draftCopy);
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
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new SupplyConditionDescriptionListDataSelectorsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final SupplyConditionDescriptionListDataSelectorsType that = ((SupplyConditionDescriptionListDataSelectorsType) object);
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
        return buffer;
    }

}
