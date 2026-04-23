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


/**
 * <p>Java class for BillDataElementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BillDataElementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="billId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="billType" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="scopeType" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="total" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}BillPositionElementsType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="timePeriod" type="{http://docs.eebus.org/spine/xsd/v1}TimePeriodElementsType" minOccurs="0"/&gt;
 *                   &lt;element name="value" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}BillValueElementsType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="valueId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *                             &lt;element name="unit" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *                             &lt;element name="value" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberElementsType" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="cost" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}BillCostElementsType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="costId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *                             &lt;element name="costType" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *                             &lt;element name="valueId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *                             &lt;element name="unit" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *                             &lt;element name="currency" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *                             &lt;element name="cost" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberElementsType" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="label" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *                   &lt;element name="description" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="position" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}BillPositionElementsType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="positionId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *                   &lt;element name="positionType" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *                   &lt;element name="timePeriod" type="{http://docs.eebus.org/spine/xsd/v1}TimePeriodElementsType" minOccurs="0"/&gt;
 *                   &lt;element name="value" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}BillValueElementsType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="valueId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *                             &lt;element name="value" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberElementsType" minOccurs="0"/&gt;
 *                             &lt;element name="valuePercentage" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberElementsType" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="cost" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}BillCostElementsType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="costId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *                             &lt;element name="cost" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberElementsType" minOccurs="0"/&gt;
 *                             &lt;element name="costPercentage" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberElementsType" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="label" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *                   &lt;element name="description" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillDataElementsType", propOrder = {
    "billId",
    "billType",
    "scopeType",
    "total",
    "position"
})
public class BillDataElementsType implements Cloneable, CopyTo, ToString
{

    protected ElementTagType billId;
    protected ElementTagType billType;
    protected ElementTagType scopeType;
    protected BillDataElementsType.Total total;
    protected BillDataElementsType.Position position;

    /**
     * Default no-arg constructor
     * 
     */
    public BillDataElementsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public BillDataElementsType(final ElementTagType billId, final ElementTagType billType, final ElementTagType scopeType, final BillDataElementsType.Total total, final BillDataElementsType.Position position) {
        this.billId = billId;
        this.billType = billType;
        this.scopeType = scopeType;
        this.total = total;
        this.position = position;
    }

    /**
     * Gets the value of the billId property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getBillId() {
        return billId;
    }

    /**
     * Sets the value of the billId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setBillId(ElementTagType value) {
        this.billId = value;
    }

    /**
     * Gets the value of the billType property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getBillType() {
        return billType;
    }

    /**
     * Sets the value of the billType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setBillType(ElementTagType value) {
        this.billType = value;
    }

    /**
     * Gets the value of the scopeType property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getScopeType() {
        return scopeType;
    }

    /**
     * Sets the value of the scopeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setScopeType(ElementTagType value) {
        this.scopeType = value;
    }

    /**
     * Gets the value of the total property.
     * 
     * @return
     *     possible object is
     *     {@link BillDataElementsType.Total }
     *     
     */
    public BillDataElementsType.Total getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillDataElementsType.Total }
     *     
     */
    public void setTotal(BillDataElementsType.Total value) {
        this.total = value;
    }

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link BillDataElementsType.Position }
     *     
     */
    public BillDataElementsType.Position getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillDataElementsType.Position }
     *     
     */
    public void setPosition(BillDataElementsType.Position value) {
        this.position = value;
    }

    /**
     * Sets the value of the billId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public BillDataElementsType withBillId(ElementTagType value) {
        setBillId(value);
        return this;
    }

    /**
     * Sets the value of the billType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public BillDataElementsType withBillType(ElementTagType value) {
        setBillType(value);
        return this;
    }

    /**
     * Sets the value of the scopeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public BillDataElementsType withScopeType(ElementTagType value) {
        setScopeType(value);
        return this;
    }

    /**
     * Sets the value of the total property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillDataElementsType.Total }
     * @return
     *     The class instance
     */
    public BillDataElementsType withTotal(BillDataElementsType.Total value) {
        setTotal(value);
        return this;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillDataElementsType.Position }
     * @return
     *     The class instance
     */
    public BillDataElementsType withPosition(BillDataElementsType.Position value) {
        setPosition(value);
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
        if (draftCopy instanceof BillDataElementsType) {
            final BillDataElementsType copy = ((BillDataElementsType) draftCopy);
            {
                Boolean billIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.billId!= null));
                if (billIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceBillId;
                    sourceBillId = this.getBillId();
                    ElementTagType copyBillId = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "billId", sourceBillId), sourceBillId, (this.billId!= null)));
                    copy.setBillId(copyBillId);
                } else {
                    if (billIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.billId = null;
                    }
                }
            }
            {
                Boolean billTypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.billType!= null));
                if (billTypeShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceBillType;
                    sourceBillType = this.getBillType();
                    ElementTagType copyBillType = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "billType", sourceBillType), sourceBillType, (this.billType!= null)));
                    copy.setBillType(copyBillType);
                } else {
                    if (billTypeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.billType = null;
                    }
                }
            }
            {
                Boolean scopeTypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.scopeType!= null));
                if (scopeTypeShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceScopeType;
                    sourceScopeType = this.getScopeType();
                    ElementTagType copyScopeType = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "scopeType", sourceScopeType), sourceScopeType, (this.scopeType!= null)));
                    copy.setScopeType(copyScopeType);
                } else {
                    if (scopeTypeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.scopeType = null;
                    }
                }
            }
            {
                Boolean totalShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.total!= null));
                if (totalShouldBeCopiedAndSet == Boolean.TRUE) {
                    BillDataElementsType.Total sourceTotal;
                    sourceTotal = this.getTotal();
                    BillDataElementsType.Total copyTotal = ((BillDataElementsType.Total) strategy.copy(LocatorUtils.property(locator, "total", sourceTotal), sourceTotal, (this.total!= null)));
                    copy.setTotal(copyTotal);
                } else {
                    if (totalShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.total = null;
                    }
                }
            }
            {
                Boolean positionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.position!= null));
                if (positionShouldBeCopiedAndSet == Boolean.TRUE) {
                    BillDataElementsType.Position sourcePosition;
                    sourcePosition = this.getPosition();
                    BillDataElementsType.Position copyPosition = ((BillDataElementsType.Position) strategy.copy(LocatorUtils.property(locator, "position", sourcePosition), sourcePosition, (this.position!= null)));
                    copy.setPosition(copyPosition);
                } else {
                    if (positionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.position = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new BillDataElementsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final BillDataElementsType that = ((BillDataElementsType) object);
        {
            ElementTagType leftBillId;
            leftBillId = this.getBillId();
            ElementTagType rightBillId;
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
            ElementTagType leftBillType;
            leftBillType = this.getBillType();
            ElementTagType rightBillType;
            rightBillType = that.getBillType();
            if (this.billType!= null) {
                if (that.billType!= null) {
                    if (!leftBillType.equals(rightBillType)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.billType!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftScopeType;
            leftScopeType = this.getScopeType();
            ElementTagType rightScopeType;
            rightScopeType = that.getScopeType();
            if (this.scopeType!= null) {
                if (that.scopeType!= null) {
                    if (!leftScopeType.equals(rightScopeType)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.scopeType!= null) {
                    return false;
                }
            }
        }
        {
            BillDataElementsType.Total leftTotal;
            leftTotal = this.getTotal();
            BillDataElementsType.Total rightTotal;
            rightTotal = that.getTotal();
            if (this.total!= null) {
                if (that.total!= null) {
                    if (!leftTotal.equals(rightTotal)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.total!= null) {
                    return false;
                }
            }
        }
        {
            BillDataElementsType.Position leftPosition;
            leftPosition = this.getPosition();
            BillDataElementsType.Position rightPosition;
            rightPosition = that.getPosition();
            if (this.position!= null) {
                if (that.position!= null) {
                    if (!leftPosition.equals(rightPosition)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.position!= null) {
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
            ElementTagType theBillId;
            theBillId = this.getBillId();
            if (this.billId!= null) {
                currentHashCode += theBillId.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theBillType;
            theBillType = this.getBillType();
            if (this.billType!= null) {
                currentHashCode += theBillType.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theScopeType;
            theScopeType = this.getScopeType();
            if (this.scopeType!= null) {
                currentHashCode += theScopeType.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            BillDataElementsType.Total theTotal;
            theTotal = this.getTotal();
            if (this.total!= null) {
                currentHashCode += theTotal.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            BillDataElementsType.Position thePosition;
            thePosition = this.getPosition();
            if (this.position!= null) {
                currentHashCode += thePosition.hashCode();
            }
        }
        return currentHashCode;
    }

    @Override
    public String toString() {
        final ToStringStrategy strategy = new org.openmuc.jeebus.spine.impl.parser.CustomToStringStrategy();
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
            ElementTagType theBillId;
            theBillId = this.getBillId();
            strategy.appendField(locator, this, "billId", buffer, theBillId, (this.billId!= null));
        }
        {
            ElementTagType theBillType;
            theBillType = this.getBillType();
            strategy.appendField(locator, this, "billType", buffer, theBillType, (this.billType!= null));
        }
        {
            ElementTagType theScopeType;
            theScopeType = this.getScopeType();
            strategy.appendField(locator, this, "scopeType", buffer, theScopeType, (this.scopeType!= null));
        }
        {
            BillDataElementsType.Total theTotal;
            theTotal = this.getTotal();
            strategy.appendField(locator, this, "total", buffer, theTotal, (this.total!= null));
        }
        {
            BillDataElementsType.Position thePosition;
            thePosition = this.getPosition();
            strategy.appendField(locator, this, "position", buffer, thePosition, (this.position!= null));
        }
        return buffer;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}BillPositionElementsType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="positionId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
     *         &lt;element name="positionType" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
     *         &lt;element name="timePeriod" type="{http://docs.eebus.org/spine/xsd/v1}TimePeriodElementsType" minOccurs="0"/&gt;
     *         &lt;element name="value" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}BillValueElementsType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="valueId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
     *                   &lt;element name="value" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberElementsType" minOccurs="0"/&gt;
     *                   &lt;element name="valuePercentage" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberElementsType" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="cost" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}BillCostElementsType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="costId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
     *                   &lt;element name="cost" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberElementsType" minOccurs="0"/&gt;
     *                   &lt;element name="costPercentage" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberElementsType" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
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
    @XmlType(name = "")
    public static class Position
        extends BillPositionElementsType
        implements Cloneable, CopyTo, ToString
    {


        /**
         * Default no-arg constructor
         * 
         */
        public Position() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public Position(final ElementTagType positionId, final ElementTagType positionType, final TimePeriodElementsType timePeriod, final BillValueElementsType value, final BillCostElementsType cost, final ElementTagType label, final ElementTagType description) {
            super(positionId, positionType, timePeriod, value, cost, label, description);
        }

        /**
         * Sets the value of the positionId property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElementTagType }
         * @return
         *     The class instance
         */
        @Override
        public BillDataElementsType.Position withPositionId(ElementTagType value) {
            setPositionId(value);
            return this;
        }

        /**
         * Sets the value of the positionType property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElementTagType }
         * @return
         *     The class instance
         */
        @Override
        public BillDataElementsType.Position withPositionType(ElementTagType value) {
            setPositionType(value);
            return this;
        }

        /**
         * Sets the value of the timePeriod property.
         * 
         * @param value
         *     allowed object is
         *     {@link TimePeriodElementsType }
         * @return
         *     The class instance
         */
        @Override
        public BillDataElementsType.Position withTimePeriod(TimePeriodElementsType value) {
            setTimePeriod(value);
            return this;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link BillValueElementsType }
         * @return
         *     The class instance
         */
        @Override
        public BillDataElementsType.Position withValue(BillValueElementsType value) {
            setValue(value);
            return this;
        }

        /**
         * Sets the value of the cost property.
         * 
         * @param value
         *     allowed object is
         *     {@link BillCostElementsType }
         * @return
         *     The class instance
         */
        @Override
        public BillDataElementsType.Position withCost(BillCostElementsType value) {
            setCost(value);
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
        @Override
        public BillDataElementsType.Position withLabel(ElementTagType value) {
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
        @Override
        public BillDataElementsType.Position withDescription(ElementTagType value) {
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
            super.copyTo(locator, draftCopy, strategy);
            return draftCopy;
        }

        @Override
        public Object createNewInstance() {
            return new BillDataElementsType.Position();
        }

        @Override
        public boolean equals(Object object) {
            if ((object == null)||(this.getClass()!= object.getClass())) {
                return false;
            }
            if (this == object) {
                return true;
            }
            if (!super.equals(object)) {
                return false;
            }
            return true;
        }

        @Override
        public int hashCode() {
            int currentHashCode = 1;
            currentHashCode = ((currentHashCode* 31)+ super.hashCode());
            return currentHashCode;
        }

        @Override
        public String toString() {
            final ToStringStrategy strategy = new org.openmuc.jeebus.spine.impl.parser.CustomToStringStrategy();
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
            super.appendFields(locator, buffer, strategy);
            return buffer;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}BillPositionElementsType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="timePeriod" type="{http://docs.eebus.org/spine/xsd/v1}TimePeriodElementsType" minOccurs="0"/&gt;
     *         &lt;element name="value" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}BillValueElementsType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="valueId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
     *                   &lt;element name="unit" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
     *                   &lt;element name="value" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberElementsType" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="cost" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}BillCostElementsType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="costId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
     *                   &lt;element name="costType" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
     *                   &lt;element name="valueId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
     *                   &lt;element name="unit" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
     *                   &lt;element name="currency" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
     *                   &lt;element name="cost" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberElementsType" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
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
    @XmlType(name = "")
    public static class Total
        extends BillPositionElementsType
        implements Cloneable, CopyTo, ToString
    {


        /**
         * Default no-arg constructor
         * 
         */
        public Total() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public Total(final ElementTagType positionId, final ElementTagType positionType, final TimePeriodElementsType timePeriod, final BillValueElementsType value, final BillCostElementsType cost, final ElementTagType label, final ElementTagType description) {
            super(positionId, positionType, timePeriod, value, cost, label, description);
        }

        /**
         * Sets the value of the positionId property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElementTagType }
         * @return
         *     The class instance
         */
        @Override
        public BillDataElementsType.Total withPositionId(ElementTagType value) {
            setPositionId(value);
            return this;
        }

        /**
         * Sets the value of the positionType property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElementTagType }
         * @return
         *     The class instance
         */
        @Override
        public BillDataElementsType.Total withPositionType(ElementTagType value) {
            setPositionType(value);
            return this;
        }

        /**
         * Sets the value of the timePeriod property.
         * 
         * @param value
         *     allowed object is
         *     {@link TimePeriodElementsType }
         * @return
         *     The class instance
         */
        @Override
        public BillDataElementsType.Total withTimePeriod(TimePeriodElementsType value) {
            setTimePeriod(value);
            return this;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link BillValueElementsType }
         * @return
         *     The class instance
         */
        @Override
        public BillDataElementsType.Total withValue(BillValueElementsType value) {
            setValue(value);
            return this;
        }

        /**
         * Sets the value of the cost property.
         * 
         * @param value
         *     allowed object is
         *     {@link BillCostElementsType }
         * @return
         *     The class instance
         */
        @Override
        public BillDataElementsType.Total withCost(BillCostElementsType value) {
            setCost(value);
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
        @Override
        public BillDataElementsType.Total withLabel(ElementTagType value) {
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
        @Override
        public BillDataElementsType.Total withDescription(ElementTagType value) {
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
            super.copyTo(locator, draftCopy, strategy);
            return draftCopy;
        }

        @Override
        public Object createNewInstance() {
            return new BillDataElementsType.Total();
        }

        @Override
        public boolean equals(Object object) {
            if ((object == null)||(this.getClass()!= object.getClass())) {
                return false;
            }
            if (this == object) {
                return true;
            }
            if (!super.equals(object)) {
                return false;
            }
            return true;
        }

        @Override
        public int hashCode() {
            int currentHashCode = 1;
            currentHashCode = ((currentHashCode* 31)+ super.hashCode());
            return currentHashCode;
        }

        @Override
        public String toString() {
            final ToStringStrategy strategy = new org.openmuc.jeebus.spine.impl.parser.CustomToStringStrategy();
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
            super.appendFields(locator, buffer, strategy);
            return buffer;
        }

    }

}
