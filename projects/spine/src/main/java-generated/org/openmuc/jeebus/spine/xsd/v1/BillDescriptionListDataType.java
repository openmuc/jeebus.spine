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
 * <p>Java class for BillDescriptionListDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BillDescriptionListDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://docs.eebus.org/spine/xsd/v1}billDescriptionData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillDescriptionListDataType", propOrder = {
    "billDescriptionData"
})
public class BillDescriptionListDataType implements Cloneable, CopyTo, ToString
{

    protected List<BillDescriptionDataType> billDescriptionData;

    /**
     * Default no-arg constructor
     * 
     */
    public BillDescriptionListDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public BillDescriptionListDataType(final List<BillDescriptionDataType> billDescriptionData) {
        this.billDescriptionData = billDescriptionData;
    }

    /**
     * Gets the value of the billDescriptionData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the billDescriptionData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillDescriptionData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BillDescriptionDataType }
     * 
     * 
     */
    public List<BillDescriptionDataType> getBillDescriptionData() {
        if (billDescriptionData == null) {
            billDescriptionData = new ArrayList<BillDescriptionDataType>();
        }
        return this.billDescriptionData;
    }

    /**
     * Adds objects to the list of BillDescriptionData using add method
     * 
     * @param values
     *     objects to add to the list BillDescriptionData
     * @return
     *     The class instance
     */
    public BillDescriptionListDataType withBillDescriptionData(BillDescriptionDataType... values) {
        if (values!= null) {
            for (BillDescriptionDataType value: values) {
                getBillDescriptionData().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of BillDescriptionData using addAll method
     * 
     * @param values
     *     objects to add to the list BillDescriptionData
     * @return
     *     The class instance
     */
    public BillDescriptionListDataType withBillDescriptionData(Collection<BillDescriptionDataType> values) {
        if (values!= null) {
            getBillDescriptionData().addAll(values);
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
        if (draftCopy instanceof BillDescriptionListDataType) {
            final BillDescriptionListDataType copy = ((BillDescriptionListDataType) draftCopy);
            {
                Boolean billDescriptionDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.billDescriptionData!= null)&&(!this.billDescriptionData.isEmpty())));
                if (billDescriptionDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<BillDescriptionDataType> sourceBillDescriptionData;
                    sourceBillDescriptionData = (((this.billDescriptionData!= null)&&(!this.billDescriptionData.isEmpty()))?this.getBillDescriptionData():null);
                    @SuppressWarnings("unchecked")
                    List<BillDescriptionDataType> copyBillDescriptionData = ((List<BillDescriptionDataType> ) strategy.copy(LocatorUtils.property(locator, "billDescriptionData", sourceBillDescriptionData), sourceBillDescriptionData, ((this.billDescriptionData!= null)&&(!this.billDescriptionData.isEmpty()))));
                    copy.billDescriptionData = null;
                    if (copyBillDescriptionData!= null) {
                        List<BillDescriptionDataType> uniqueBillDescriptionDatal = copy.getBillDescriptionData();
                        uniqueBillDescriptionDatal.addAll(copyBillDescriptionData);
                    }
                } else {
                    if (billDescriptionDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.billDescriptionData = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new BillDescriptionListDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final BillDescriptionListDataType that = ((BillDescriptionListDataType) object);
        {
            List<BillDescriptionDataType> leftBillDescriptionData;
            leftBillDescriptionData = (((this.billDescriptionData!= null)&&(!this.billDescriptionData.isEmpty()))?this.getBillDescriptionData():null);
            List<BillDescriptionDataType> rightBillDescriptionData;
            rightBillDescriptionData = (((that.billDescriptionData!= null)&&(!that.billDescriptionData.isEmpty()))?that.getBillDescriptionData():null);
            if ((this.billDescriptionData!= null)&&(!this.billDescriptionData.isEmpty())) {
                if ((that.billDescriptionData!= null)&&(!that.billDescriptionData.isEmpty())) {
                    if (!leftBillDescriptionData.equals(rightBillDescriptionData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.billDescriptionData!= null)&&(!that.billDescriptionData.isEmpty())) {
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
            List<BillDescriptionDataType> theBillDescriptionData;
            theBillDescriptionData = (((this.billDescriptionData!= null)&&(!this.billDescriptionData.isEmpty()))?this.getBillDescriptionData():null);
            if ((this.billDescriptionData!= null)&&(!this.billDescriptionData.isEmpty())) {
                currentHashCode += theBillDescriptionData.hashCode();
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
            List<BillDescriptionDataType> theBillDescriptionData;
            theBillDescriptionData = (((this.billDescriptionData!= null)&&(!this.billDescriptionData.isEmpty()))?this.getBillDescriptionData():null);
            strategy.appendField(locator, this, "billDescriptionData", buffer, theBillDescriptionData, ((this.billDescriptionData!= null)&&(!this.billDescriptionData.isEmpty())));
        }
        return buffer;
    }

}
