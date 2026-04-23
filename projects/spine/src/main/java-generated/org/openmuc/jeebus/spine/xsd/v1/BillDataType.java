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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.jvnet.jaxb.lang.CopyStrategy;
import org.jvnet.jaxb.lang.CopyTo;
import org.jvnet.jaxb.lang.JAXBCopyStrategy;
import org.jvnet.jaxb.lang.ToString;
import org.jvnet.jaxb.lang.ToStringStrategy;
import org.jvnet.jaxb.locator.ObjectLocator;
import org.jvnet.jaxb.locator.util.LocatorUtils;


/**
 * <p>Java class for BillDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BillDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="billId" type="{http://docs.eebus.org/spine/xsd/v1}BillIdType" minOccurs="0"/&gt;
 *         &lt;element name="billType" type="{http://docs.eebus.org/spine/xsd/v1}BillTypeType" minOccurs="0"/&gt;
 *         &lt;element name="scopeType" type="{http://docs.eebus.org/spine/xsd/v1}ScopeTypeType" minOccurs="0"/&gt;
 *         &lt;element name="total" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}BillPositionType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="timePeriod" type="{http://docs.eebus.org/spine/xsd/v1}TimePeriodType" minOccurs="0"/&gt;
 *                   &lt;element name="value" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}BillValueType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="valueId" type="{http://docs.eebus.org/spine/xsd/v1}BillValueIdType" minOccurs="0"/&gt;
 *                             &lt;element name="unit" type="{http://docs.eebus.org/spine/xsd/v1}UnitOfMeasurementType" minOccurs="0"/&gt;
 *                             &lt;element name="value" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberType" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="cost" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}BillCostType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="costId" type="{http://docs.eebus.org/spine/xsd/v1}BillCostIdType" minOccurs="0"/&gt;
 *                             &lt;element name="costType" type="{http://docs.eebus.org/spine/xsd/v1}BillCostTypeType" minOccurs="0"/&gt;
 *                             &lt;element name="valueId" type="{http://docs.eebus.org/spine/xsd/v1}BillValueIdType" minOccurs="0"/&gt;
 *                             &lt;element name="unit" type="{http://docs.eebus.org/spine/xsd/v1}UnitOfMeasurementType" minOccurs="0"/&gt;
 *                             &lt;element name="currency" type="{http://docs.eebus.org/spine/xsd/v1}CurrencyType" minOccurs="0"/&gt;
 *                             &lt;element name="cost" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberType" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="label" type="{http://docs.eebus.org/spine/xsd/v1}LabelType" minOccurs="0"/&gt;
 *                   &lt;element name="description" type="{http://docs.eebus.org/spine/xsd/v1}DescriptionType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="position" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}BillPositionType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="positionId" type="{http://docs.eebus.org/spine/xsd/v1}BillPositionIdType" minOccurs="0"/&gt;
 *                   &lt;element name="positionType" type="{http://docs.eebus.org/spine/xsd/v1}BillPositionTypeType" minOccurs="0"/&gt;
 *                   &lt;element name="timePeriod" type="{http://docs.eebus.org/spine/xsd/v1}TimePeriodType" minOccurs="0"/&gt;
 *                   &lt;element name="value" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}BillValueType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="valueId" type="{http://docs.eebus.org/spine/xsd/v1}BillValueIdType" minOccurs="0"/&gt;
 *                             &lt;element name="value" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberType" minOccurs="0"/&gt;
 *                             &lt;element name="valuePercentage" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberType" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="cost" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}BillCostType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="costId" type="{http://docs.eebus.org/spine/xsd/v1}BillCostIdType" minOccurs="0"/&gt;
 *                             &lt;element name="cost" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberType" minOccurs="0"/&gt;
 *                             &lt;element name="costPercentage" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberType" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="label" type="{http://docs.eebus.org/spine/xsd/v1}LabelType" minOccurs="0"/&gt;
 *                   &lt;element name="description" type="{http://docs.eebus.org/spine/xsd/v1}DescriptionType" minOccurs="0"/&gt;
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
@XmlType(name = "BillDataType", propOrder = {
    "billId",
    "billType",
    "scopeType",
    "total",
    "position"
})
public class BillDataType implements Cloneable, CopyTo, ToString
{

    @XmlSchemaType(name = "unsignedInt")
    protected Long billId;
    protected String billType;
    protected String scopeType;
    protected BillDataType.Total total;
    protected List<BillDataType.Position> position;

    /**
     * Default no-arg constructor
     * 
     */
    public BillDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public BillDataType(final Long billId, final String billType, final String scopeType, final BillDataType.Total total, final List<BillDataType.Position> position) {
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
     * Gets the value of the billType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillType() {
        return billType;
    }

    /**
     * Sets the value of the billType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillType(String value) {
        this.billType = value;
    }

    /**
     * Gets the value of the scopeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScopeType() {
        return scopeType;
    }

    /**
     * Sets the value of the scopeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScopeType(String value) {
        this.scopeType = value;
    }

    /**
     * Gets the value of the total property.
     * 
     * @return
     *     possible object is
     *     {@link BillDataType.Total }
     *     
     */
    public BillDataType.Total getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillDataType.Total }
     *     
     */
    public void setTotal(BillDataType.Total value) {
        this.total = value;
    }

    /**
     * Gets the value of the position property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the position property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPosition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BillDataType.Position }
     * 
     * 
     */
    public List<BillDataType.Position> getPosition() {
        if (position == null) {
            position = new ArrayList<BillDataType.Position>();
        }
        return this.position;
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
    public BillDataType withBillId(Long value) {
        setBillId(value);
        return this;
    }

    /**
     * Sets the value of the billType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public BillDataType withBillType(String value) {
        setBillType(value);
        return this;
    }

    /**
     * Sets the value of the scopeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public BillDataType withScopeType(String value) {
        setScopeType(value);
        return this;
    }

    /**
     * Sets the value of the total property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillDataType.Total }
     * @return
     *     The class instance
     */
    public BillDataType withTotal(BillDataType.Total value) {
        setTotal(value);
        return this;
    }

    /**
     * Adds objects to the list of Position using add method
     * 
     * @param values
     *     objects to add to the list Position
     * @return
     *     The class instance
     */
    public BillDataType withPosition(BillDataType.Position... values) {
        if (values!= null) {
            for (BillDataType.Position value: values) {
                getPosition().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of Position using addAll method
     * 
     * @param values
     *     objects to add to the list Position
     * @return
     *     The class instance
     */
    public BillDataType withPosition(Collection<BillDataType.Position> values) {
        if (values!= null) {
            getPosition().addAll(values);
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
        if (draftCopy instanceof BillDataType) {
            final BillDataType copy = ((BillDataType) draftCopy);
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
                Boolean billTypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.billType!= null));
                if (billTypeShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceBillType;
                    sourceBillType = this.getBillType();
                    String copyBillType = ((String) strategy.copy(LocatorUtils.property(locator, "billType", sourceBillType), sourceBillType, (this.billType!= null)));
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
                    String sourceScopeType;
                    sourceScopeType = this.getScopeType();
                    String copyScopeType = ((String) strategy.copy(LocatorUtils.property(locator, "scopeType", sourceScopeType), sourceScopeType, (this.scopeType!= null)));
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
                    BillDataType.Total sourceTotal;
                    sourceTotal = this.getTotal();
                    BillDataType.Total copyTotal = ((BillDataType.Total) strategy.copy(LocatorUtils.property(locator, "total", sourceTotal), sourceTotal, (this.total!= null)));
                    copy.setTotal(copyTotal);
                } else {
                    if (totalShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.total = null;
                    }
                }
            }
            {
                Boolean positionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.position!= null)&&(!this.position.isEmpty())));
                if (positionShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<BillDataType.Position> sourcePosition;
                    sourcePosition = (((this.position!= null)&&(!this.position.isEmpty()))?this.getPosition():null);
                    @SuppressWarnings("unchecked")
                    List<BillDataType.Position> copyPosition = ((List<BillDataType.Position> ) strategy.copy(LocatorUtils.property(locator, "position", sourcePosition), sourcePosition, ((this.position!= null)&&(!this.position.isEmpty()))));
                    copy.position = null;
                    if (copyPosition!= null) {
                        List<BillDataType.Position> uniquePositionl = copy.getPosition();
                        uniquePositionl.addAll(copyPosition);
                    }
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
        return new BillDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final BillDataType that = ((BillDataType) object);
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
            String leftBillType;
            leftBillType = this.getBillType();
            String rightBillType;
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
            String leftScopeType;
            leftScopeType = this.getScopeType();
            String rightScopeType;
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
            BillDataType.Total leftTotal;
            leftTotal = this.getTotal();
            BillDataType.Total rightTotal;
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
            List<BillDataType.Position> leftPosition;
            leftPosition = (((this.position!= null)&&(!this.position.isEmpty()))?this.getPosition():null);
            List<BillDataType.Position> rightPosition;
            rightPosition = (((that.position!= null)&&(!that.position.isEmpty()))?that.getPosition():null);
            if ((this.position!= null)&&(!this.position.isEmpty())) {
                if ((that.position!= null)&&(!that.position.isEmpty())) {
                    if (!leftPosition.equals(rightPosition)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.position!= null)&&(!that.position.isEmpty())) {
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
            String theBillType;
            theBillType = this.getBillType();
            if (this.billType!= null) {
                currentHashCode += theBillType.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String theScopeType;
            theScopeType = this.getScopeType();
            if (this.scopeType!= null) {
                currentHashCode += theScopeType.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            BillDataType.Total theTotal;
            theTotal = this.getTotal();
            if (this.total!= null) {
                currentHashCode += theTotal.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            List<BillDataType.Position> thePosition;
            thePosition = (((this.position!= null)&&(!this.position.isEmpty()))?this.getPosition():null);
            if ((this.position!= null)&&(!this.position.isEmpty())) {
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
            Long theBillId;
            theBillId = this.getBillId();
            strategy.appendField(locator, this, "billId", buffer, theBillId, (this.billId!= null));
        }
        {
            String theBillType;
            theBillType = this.getBillType();
            strategy.appendField(locator, this, "billType", buffer, theBillType, (this.billType!= null));
        }
        {
            String theScopeType;
            theScopeType = this.getScopeType();
            strategy.appendField(locator, this, "scopeType", buffer, theScopeType, (this.scopeType!= null));
        }
        {
            BillDataType.Total theTotal;
            theTotal = this.getTotal();
            strategy.appendField(locator, this, "total", buffer, theTotal, (this.total!= null));
        }
        {
            List<BillDataType.Position> thePosition;
            thePosition = (((this.position!= null)&&(!this.position.isEmpty()))?this.getPosition():null);
            strategy.appendField(locator, this, "position", buffer, thePosition, ((this.position!= null)&&(!this.position.isEmpty())));
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
     *     &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}BillPositionType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="positionId" type="{http://docs.eebus.org/spine/xsd/v1}BillPositionIdType" minOccurs="0"/&gt;
     *         &lt;element name="positionType" type="{http://docs.eebus.org/spine/xsd/v1}BillPositionTypeType" minOccurs="0"/&gt;
     *         &lt;element name="timePeriod" type="{http://docs.eebus.org/spine/xsd/v1}TimePeriodType" minOccurs="0"/&gt;
     *         &lt;element name="value" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}BillValueType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="valueId" type="{http://docs.eebus.org/spine/xsd/v1}BillValueIdType" minOccurs="0"/&gt;
     *                   &lt;element name="value" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberType" minOccurs="0"/&gt;
     *                   &lt;element name="valuePercentage" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberType" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="cost" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}BillCostType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="costId" type="{http://docs.eebus.org/spine/xsd/v1}BillCostIdType" minOccurs="0"/&gt;
     *                   &lt;element name="cost" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberType" minOccurs="0"/&gt;
     *                   &lt;element name="costPercentage" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberType" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
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
    @XmlType(name = "")
    public static class Position
        extends BillPositionType
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
        public Position(final Long positionId, final String positionType, final TimePeriodType timePeriod, final List<BillValueType> value, final List<BillCostType> cost, final String label, final String description) {
            super(positionId, positionType, timePeriod, value, cost, label, description);
        }

        /**
         * Sets the value of the positionId property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         * @return
         *     The class instance
         */
        @Override
        public BillDataType.Position withPositionId(Long value) {
            setPositionId(value);
            return this;
        }

        /**
         * Sets the value of the positionType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         * @return
         *     The class instance
         */
        @Override
        public BillDataType.Position withPositionType(String value) {
            setPositionType(value);
            return this;
        }

        /**
         * Sets the value of the timePeriod property.
         * 
         * @param value
         *     allowed object is
         *     {@link TimePeriodType }
         * @return
         *     The class instance
         */
        @Override
        public BillDataType.Position withTimePeriod(TimePeriodType value) {
            setTimePeriod(value);
            return this;
        }

        /**
         * Adds objects to the list of Value using add method
         * 
         * @param values
         *     objects to add to the list Value
         * @return
         *     The class instance
         */
        @Override
        public BillDataType.Position withValue(BillValueType... values) {
            if (values!= null) {
                for (BillValueType value: values) {
                    getValue().add(value);
                }
            }
            return this;
        }

        /**
         * Adds objects to the list of Value using addAll method
         * 
         * @param values
         *     objects to add to the list Value
         * @return
         *     The class instance
         */
        @Override
        public BillDataType.Position withValue(Collection<BillValueType> values) {
            if (values!= null) {
                getValue().addAll(values);
            }
            return this;
        }

        /**
         * Adds objects to the list of Cost using add method
         * 
         * @param values
         *     objects to add to the list Cost
         * @return
         *     The class instance
         */
        @Override
        public BillDataType.Position withCost(BillCostType... values) {
            if (values!= null) {
                for (BillCostType value: values) {
                    getCost().add(value);
                }
            }
            return this;
        }

        /**
         * Adds objects to the list of Cost using addAll method
         * 
         * @param values
         *     objects to add to the list Cost
         * @return
         *     The class instance
         */
        @Override
        public BillDataType.Position withCost(Collection<BillCostType> values) {
            if (values!= null) {
                getCost().addAll(values);
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
        @Override
        public BillDataType.Position withLabel(String value) {
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
        @Override
        public BillDataType.Position withDescription(String value) {
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
            return new BillDataType.Position();
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
     *     &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}BillPositionType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="timePeriod" type="{http://docs.eebus.org/spine/xsd/v1}TimePeriodType" minOccurs="0"/&gt;
     *         &lt;element name="value" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}BillValueType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="valueId" type="{http://docs.eebus.org/spine/xsd/v1}BillValueIdType" minOccurs="0"/&gt;
     *                   &lt;element name="unit" type="{http://docs.eebus.org/spine/xsd/v1}UnitOfMeasurementType" minOccurs="0"/&gt;
     *                   &lt;element name="value" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberType" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="cost" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}BillCostType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="costId" type="{http://docs.eebus.org/spine/xsd/v1}BillCostIdType" minOccurs="0"/&gt;
     *                   &lt;element name="costType" type="{http://docs.eebus.org/spine/xsd/v1}BillCostTypeType" minOccurs="0"/&gt;
     *                   &lt;element name="valueId" type="{http://docs.eebus.org/spine/xsd/v1}BillValueIdType" minOccurs="0"/&gt;
     *                   &lt;element name="unit" type="{http://docs.eebus.org/spine/xsd/v1}UnitOfMeasurementType" minOccurs="0"/&gt;
     *                   &lt;element name="currency" type="{http://docs.eebus.org/spine/xsd/v1}CurrencyType" minOccurs="0"/&gt;
     *                   &lt;element name="cost" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberType" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
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
    @XmlType(name = "")
    public static class Total
        extends BillPositionType
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
        public Total(final Long positionId, final String positionType, final TimePeriodType timePeriod, final List<BillValueType> value, final List<BillCostType> cost, final String label, final String description) {
            super(positionId, positionType, timePeriod, value, cost, label, description);
        }

        /**
         * Sets the value of the positionId property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         * @return
         *     The class instance
         */
        @Override
        public BillDataType.Total withPositionId(Long value) {
            setPositionId(value);
            return this;
        }

        /**
         * Sets the value of the positionType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         * @return
         *     The class instance
         */
        @Override
        public BillDataType.Total withPositionType(String value) {
            setPositionType(value);
            return this;
        }

        /**
         * Sets the value of the timePeriod property.
         * 
         * @param value
         *     allowed object is
         *     {@link TimePeriodType }
         * @return
         *     The class instance
         */
        @Override
        public BillDataType.Total withTimePeriod(TimePeriodType value) {
            setTimePeriod(value);
            return this;
        }

        /**
         * Adds objects to the list of Value using add method
         * 
         * @param values
         *     objects to add to the list Value
         * @return
         *     The class instance
         */
        @Override
        public BillDataType.Total withValue(BillValueType... values) {
            if (values!= null) {
                for (BillValueType value: values) {
                    getValue().add(value);
                }
            }
            return this;
        }

        /**
         * Adds objects to the list of Value using addAll method
         * 
         * @param values
         *     objects to add to the list Value
         * @return
         *     The class instance
         */
        @Override
        public BillDataType.Total withValue(Collection<BillValueType> values) {
            if (values!= null) {
                getValue().addAll(values);
            }
            return this;
        }

        /**
         * Adds objects to the list of Cost using add method
         * 
         * @param values
         *     objects to add to the list Cost
         * @return
         *     The class instance
         */
        @Override
        public BillDataType.Total withCost(BillCostType... values) {
            if (values!= null) {
                for (BillCostType value: values) {
                    getCost().add(value);
                }
            }
            return this;
        }

        /**
         * Adds objects to the list of Cost using addAll method
         * 
         * @param values
         *     objects to add to the list Cost
         * @return
         *     The class instance
         */
        @Override
        public BillDataType.Total withCost(Collection<BillCostType> values) {
            if (values!= null) {
                getCost().addAll(values);
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
        @Override
        public BillDataType.Total withLabel(String value) {
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
        @Override
        public BillDataType.Total withDescription(String value) {
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
            return new BillDataType.Total();
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
