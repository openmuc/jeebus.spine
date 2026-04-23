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
 * <p>Java class for BillConstraintsDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BillConstraintsDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="billId" type="{http://docs.eebus.org/spine/xsd/v1}BillIdType" minOccurs="0"/&gt;
 *         &lt;element name="positionCountMin" type="{http://docs.eebus.org/spine/xsd/v1}BillPositionCountType" minOccurs="0"/&gt;
 *         &lt;element name="positionCountMax" type="{http://docs.eebus.org/spine/xsd/v1}BillPositionCountType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillConstraintsDataType", propOrder = {
    "billId",
    "positionCountMin",
    "positionCountMax"
})
public class BillConstraintsDataType implements Cloneable, CopyTo, ToString
{

    @XmlSchemaType(name = "unsignedInt")
    protected Long billId;
    @XmlSchemaType(name = "unsignedInt")
    protected Long positionCountMin;
    @XmlSchemaType(name = "unsignedInt")
    protected Long positionCountMax;

    /**
     * Default no-arg constructor
     * 
     */
    public BillConstraintsDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public BillConstraintsDataType(final Long billId, final Long positionCountMin, final Long positionCountMax) {
        this.billId = billId;
        this.positionCountMin = positionCountMin;
        this.positionCountMax = positionCountMax;
    }

    /**
     * Gets the value of the billId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBillId() {
        return billId;
    }

    /**
     * Sets the value of the billId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBillId(Long value) {
        this.billId = value;
    }

    /**
     * Gets the value of the positionCountMin property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPositionCountMin() {
        return positionCountMin;
    }

    /**
     * Sets the value of the positionCountMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPositionCountMin(Long value) {
        this.positionCountMin = value;
    }

    /**
     * Gets the value of the positionCountMax property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPositionCountMax() {
        return positionCountMax;
    }

    /**
     * Sets the value of the positionCountMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPositionCountMax(Long value) {
        this.positionCountMax = value;
    }

    /**
     * Sets the value of the billId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     * @return
     *     The class instance
     */
    public BillConstraintsDataType withBillId(Long value) {
        setBillId(value);
        return this;
    }

    /**
     * Sets the value of the positionCountMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     * @return
     *     The class instance
     */
    public BillConstraintsDataType withPositionCountMin(Long value) {
        setPositionCountMin(value);
        return this;
    }

    /**
     * Sets the value of the positionCountMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     * @return
     *     The class instance
     */
    public BillConstraintsDataType withPositionCountMax(Long value) {
        setPositionCountMax(value);
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
        if (draftCopy instanceof BillConstraintsDataType) {
            final BillConstraintsDataType copy = ((BillConstraintsDataType) draftCopy);
            {
                Boolean billIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.billId!= null));
                if (billIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceBillId;
                    sourceBillId = this.getBillId();
                    Long copyBillId = ((Long) strategy.copy(LocatorUtils.property(locator, "billId", sourceBillId), sourceBillId, (this.billId!= null)));
                    copy.setBillId(copyBillId);
                } else {
                    if (billIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.billId = null;
                    }
                }
            }
            {
                Boolean positionCountMinShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.positionCountMin!= null));
                if (positionCountMinShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourcePositionCountMin;
                    sourcePositionCountMin = this.getPositionCountMin();
                    Long copyPositionCountMin = ((Long) strategy.copy(LocatorUtils.property(locator, "positionCountMin", sourcePositionCountMin), sourcePositionCountMin, (this.positionCountMin!= null)));
                    copy.setPositionCountMin(copyPositionCountMin);
                } else {
                    if (positionCountMinShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.positionCountMin = null;
                    }
                }
            }
            {
                Boolean positionCountMaxShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.positionCountMax!= null));
                if (positionCountMaxShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourcePositionCountMax;
                    sourcePositionCountMax = this.getPositionCountMax();
                    Long copyPositionCountMax = ((Long) strategy.copy(LocatorUtils.property(locator, "positionCountMax", sourcePositionCountMax), sourcePositionCountMax, (this.positionCountMax!= null)));
                    copy.setPositionCountMax(copyPositionCountMax);
                } else {
                    if (positionCountMaxShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.positionCountMax = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new BillConstraintsDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final BillConstraintsDataType that = ((BillConstraintsDataType) object);
        {
            Long leftBillId;
            leftBillId = this.getBillId();
            Long rightBillId;
            rightBillId = that.getBillId();
            if (this.billId!= null) {
                if (that.billId!= null) {
                    if (!leftBillId.equals(rightBillId)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.billId!= null) {
                    return false;
                }
            }
        }
        {
            Long leftPositionCountMin;
            leftPositionCountMin = this.getPositionCountMin();
            Long rightPositionCountMin;
            rightPositionCountMin = that.getPositionCountMin();
            if (this.positionCountMin!= null) {
                if (that.positionCountMin!= null) {
                    if (!leftPositionCountMin.equals(rightPositionCountMin)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.positionCountMin!= null) {
                    return false;
                }
            }
        }
        {
            Long leftPositionCountMax;
            leftPositionCountMax = this.getPositionCountMax();
            Long rightPositionCountMax;
            rightPositionCountMax = that.getPositionCountMax();
            if (this.positionCountMax!= null) {
                if (that.positionCountMax!= null) {
                    if (!leftPositionCountMax.equals(rightPositionCountMax)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.positionCountMax!= null) {
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
            Long theBillId;
            theBillId = this.getBillId();
            if (this.billId!= null) {
                currentHashCode += theBillId.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            Long thePositionCountMin;
            thePositionCountMin = this.getPositionCountMin();
            if (this.positionCountMin!= null) {
                currentHashCode += thePositionCountMin.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            Long thePositionCountMax;
            thePositionCountMax = this.getPositionCountMax();
            if (this.positionCountMax!= null) {
                currentHashCode += thePositionCountMax.hashCode();
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
            Long theBillId;
            theBillId = this.getBillId();
            strategy.appendField(locator, this, "billId", buffer, theBillId, (this.billId!= null));
        }
        {
            Long thePositionCountMin;
            thePositionCountMin = this.getPositionCountMin();
            strategy.appendField(locator, this, "positionCountMin", buffer, thePositionCountMin, (this.positionCountMin!= null));
        }
        {
            Long thePositionCountMax;
            thePositionCountMax = this.getPositionCountMax();
            strategy.appendField(locator, this, "positionCountMax", buffer, thePositionCountMax, (this.positionCountMax!= null));
        }
        return buffer;
    }

}
