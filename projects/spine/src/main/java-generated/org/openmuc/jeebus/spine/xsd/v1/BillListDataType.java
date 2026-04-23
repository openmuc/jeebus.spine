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
 * <p>Java class for BillListDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BillListDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://docs.eebus.org/spine/xsd/v1}billData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillListDataType", propOrder = {
    "billData"
})
public class BillListDataType implements Cloneable, CopyTo, ToString
{

    protected List<BillDataType> billData;

    /**
     * Default no-arg constructor
     * 
     */
    public BillListDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public BillListDataType(final List<BillDataType> billData) {
        this.billData = billData;
    }

    /**
     * Gets the value of the billData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the billData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BillDataType }
     * 
     * 
     */
    public List<BillDataType> getBillData() {
        if (billData == null) {
            billData = new ArrayList<BillDataType>();
        }
        return this.billData;
    }

    /**
     * Adds objects to the list of BillData using add method
     * 
     * @param values
     *     objects to add to the list BillData
     * @return
     *     The class instance
     */
    public BillListDataType withBillData(BillDataType... values) {
        if (values!= null) {
            for (BillDataType value: values) {
                getBillData().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of BillData using addAll method
     * 
     * @param values
     *     objects to add to the list BillData
     * @return
     *     The class instance
     */
    public BillListDataType withBillData(Collection<BillDataType> values) {
        if (values!= null) {
            getBillData().addAll(values);
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
        if (draftCopy instanceof BillListDataType) {
            final BillListDataType copy = ((BillListDataType) draftCopy);
            {
                Boolean billDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.billData!= null)&&(!this.billData.isEmpty())));
                if (billDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<BillDataType> sourceBillData;
                    sourceBillData = (((this.billData!= null)&&(!this.billData.isEmpty()))?this.getBillData():null);
                    @SuppressWarnings("unchecked")
                    List<BillDataType> copyBillData = ((List<BillDataType> ) strategy.copy(LocatorUtils.property(locator, "billData", sourceBillData), sourceBillData, ((this.billData!= null)&&(!this.billData.isEmpty()))));
                    copy.billData = null;
                    if (copyBillData!= null) {
                        List<BillDataType> uniqueBillDatal = copy.getBillData();
                        uniqueBillDatal.addAll(copyBillData);
                    }
                } else {
                    if (billDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.billData = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new BillListDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final BillListDataType that = ((BillListDataType) object);
        {
            List<BillDataType> leftBillData;
            leftBillData = (((this.billData!= null)&&(!this.billData.isEmpty()))?this.getBillData():null);
            List<BillDataType> rightBillData;
            rightBillData = (((that.billData!= null)&&(!that.billData.isEmpty()))?that.getBillData():null);
            if ((this.billData!= null)&&(!this.billData.isEmpty())) {
                if ((that.billData!= null)&&(!that.billData.isEmpty())) {
                    if (!leftBillData.equals(rightBillData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.billData!= null)&&(!that.billData.isEmpty())) {
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
            List<BillDataType> theBillData;
            theBillData = (((this.billData!= null)&&(!this.billData.isEmpty()))?this.getBillData():null);
            if ((this.billData!= null)&&(!this.billData.isEmpty())) {
                currentHashCode += theBillData.hashCode();
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
            List<BillDataType> theBillData;
            theBillData = (((this.billData!= null)&&(!this.billData.isEmpty()))?this.getBillData():null);
            strategy.appendField(locator, this, "billData", buffer, theBillData, ((this.billData!= null)&&(!this.billData.isEmpty())));
        }
        return buffer;
    }

}
