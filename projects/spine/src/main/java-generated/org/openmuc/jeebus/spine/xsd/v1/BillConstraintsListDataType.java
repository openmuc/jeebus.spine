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
 * <p>Java class for BillConstraintsListDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BillConstraintsListDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://docs.eebus.org/spine/xsd/v1}billConstraintsData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillConstraintsListDataType", propOrder = {
    "billConstraintsData"
})
public class BillConstraintsListDataType implements Cloneable, CopyTo, ToString
{

    protected List<BillConstraintsDataType> billConstraintsData;

    /**
     * Default no-arg constructor
     * 
     */
    public BillConstraintsListDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public BillConstraintsListDataType(final List<BillConstraintsDataType> billConstraintsData) {
        this.billConstraintsData = billConstraintsData;
    }

    /**
     * Gets the value of the billConstraintsData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the billConstraintsData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillConstraintsData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BillConstraintsDataType }
     * 
     * 
     */
    public List<BillConstraintsDataType> getBillConstraintsData() {
        if (billConstraintsData == null) {
            billConstraintsData = new ArrayList<BillConstraintsDataType>();
        }
        return this.billConstraintsData;
    }

    /**
     * Adds objects to the list of BillConstraintsData using add method
     * 
     * @param values
     *     objects to add to the list BillConstraintsData
     * @return
     *     The class instance
     */
    public BillConstraintsListDataType withBillConstraintsData(BillConstraintsDataType... values) {
        if (values!= null) {
            for (BillConstraintsDataType value: values) {
                getBillConstraintsData().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of BillConstraintsData using addAll method
     * 
     * @param values
     *     objects to add to the list BillConstraintsData
     * @return
     *     The class instance
     */
    public BillConstraintsListDataType withBillConstraintsData(Collection<BillConstraintsDataType> values) {
        if (values!= null) {
            getBillConstraintsData().addAll(values);
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
        if (draftCopy instanceof BillConstraintsListDataType) {
            final BillConstraintsListDataType copy = ((BillConstraintsListDataType) draftCopy);
            {
                Boolean billConstraintsDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.billConstraintsData!= null)&&(!this.billConstraintsData.isEmpty())));
                if (billConstraintsDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<BillConstraintsDataType> sourceBillConstraintsData;
                    sourceBillConstraintsData = (((this.billConstraintsData!= null)&&(!this.billConstraintsData.isEmpty()))?this.getBillConstraintsData():null);
                    @SuppressWarnings("unchecked")
                    List<BillConstraintsDataType> copyBillConstraintsData = ((List<BillConstraintsDataType> ) strategy.copy(LocatorUtils.property(locator, "billConstraintsData", sourceBillConstraintsData), sourceBillConstraintsData, ((this.billConstraintsData!= null)&&(!this.billConstraintsData.isEmpty()))));
                    copy.billConstraintsData = null;
                    if (copyBillConstraintsData!= null) {
                        List<BillConstraintsDataType> uniqueBillConstraintsDatal = copy.getBillConstraintsData();
                        uniqueBillConstraintsDatal.addAll(copyBillConstraintsData);
                    }
                } else {
                    if (billConstraintsDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.billConstraintsData = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new BillConstraintsListDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final BillConstraintsListDataType that = ((BillConstraintsListDataType) object);
        {
            List<BillConstraintsDataType> leftBillConstraintsData;
            leftBillConstraintsData = (((this.billConstraintsData!= null)&&(!this.billConstraintsData.isEmpty()))?this.getBillConstraintsData():null);
            List<BillConstraintsDataType> rightBillConstraintsData;
            rightBillConstraintsData = (((that.billConstraintsData!= null)&&(!that.billConstraintsData.isEmpty()))?that.getBillConstraintsData():null);
            if ((this.billConstraintsData!= null)&&(!this.billConstraintsData.isEmpty())) {
                if ((that.billConstraintsData!= null)&&(!that.billConstraintsData.isEmpty())) {
                    if (!leftBillConstraintsData.equals(rightBillConstraintsData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.billConstraintsData!= null)&&(!that.billConstraintsData.isEmpty())) {
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
            List<BillConstraintsDataType> theBillConstraintsData;
            theBillConstraintsData = (((this.billConstraintsData!= null)&&(!this.billConstraintsData.isEmpty()))?this.getBillConstraintsData():null);
            if ((this.billConstraintsData!= null)&&(!this.billConstraintsData.isEmpty())) {
                currentHashCode += theBillConstraintsData.hashCode();
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
            List<BillConstraintsDataType> theBillConstraintsData;
            theBillConstraintsData = (((this.billConstraintsData!= null)&&(!this.billConstraintsData.isEmpty()))?this.getBillConstraintsData():null);
            strategy.appendField(locator, this, "billConstraintsData", buffer, theBillConstraintsData, ((this.billConstraintsData!= null)&&(!this.billConstraintsData.isEmpty())));
        }
        return buffer;
    }

}
