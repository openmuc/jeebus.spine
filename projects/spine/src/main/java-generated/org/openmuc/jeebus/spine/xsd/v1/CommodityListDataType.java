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
 * <p>Java class for CommodityListDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommodityListDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://docs.eebus.org/spine/xsd/v1}commodityData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommodityListDataType", propOrder = {
    "commodityData"
})
public class CommodityListDataType implements Cloneable, CopyTo, ToString
{

    protected List<CommodityDataType> commodityData;

    /**
     * Default no-arg constructor
     * 
     */
    public CommodityListDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public CommodityListDataType(final List<CommodityDataType> commodityData) {
        this.commodityData = commodityData;
    }

    /**
     * Gets the value of the commodityData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the commodityData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommodityData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommodityDataType }
     * 
     * 
     */
    public List<CommodityDataType> getCommodityData() {
        if (commodityData == null) {
            commodityData = new ArrayList<CommodityDataType>();
        }
        return this.commodityData;
    }

    /**
     * Adds objects to the list of CommodityData using add method
     * 
     * @param values
     *     objects to add to the list CommodityData
     * @return
     *     The class instance
     */
    public CommodityListDataType withCommodityData(CommodityDataType... values) {
        if (values!= null) {
            for (CommodityDataType value: values) {
                getCommodityData().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of CommodityData using addAll method
     * 
     * @param values
     *     objects to add to the list CommodityData
     * @return
     *     The class instance
     */
    public CommodityListDataType withCommodityData(Collection<CommodityDataType> values) {
        if (values!= null) {
            getCommodityData().addAll(values);
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
        if (draftCopy instanceof CommodityListDataType) {
            final CommodityListDataType copy = ((CommodityListDataType) draftCopy);
            {
                Boolean commodityDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.commodityData!= null)&&(!this.commodityData.isEmpty())));
                if (commodityDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<CommodityDataType> sourceCommodityData;
                    sourceCommodityData = (((this.commodityData!= null)&&(!this.commodityData.isEmpty()))?this.getCommodityData():null);
                    @SuppressWarnings("unchecked")
                    List<CommodityDataType> copyCommodityData = ((List<CommodityDataType> ) strategy.copy(LocatorUtils.property(locator, "commodityData", sourceCommodityData), sourceCommodityData, ((this.commodityData!= null)&&(!this.commodityData.isEmpty()))));
                    copy.commodityData = null;
                    if (copyCommodityData!= null) {
                        List<CommodityDataType> uniqueCommodityDatal = copy.getCommodityData();
                        uniqueCommodityDatal.addAll(copyCommodityData);
                    }
                } else {
                    if (commodityDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.commodityData = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new CommodityListDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final CommodityListDataType that = ((CommodityListDataType) object);
        {
            List<CommodityDataType> leftCommodityData;
            leftCommodityData = (((this.commodityData!= null)&&(!this.commodityData.isEmpty()))?this.getCommodityData():null);
            List<CommodityDataType> rightCommodityData;
            rightCommodityData = (((that.commodityData!= null)&&(!that.commodityData.isEmpty()))?that.getCommodityData():null);
            if ((this.commodityData!= null)&&(!this.commodityData.isEmpty())) {
                if ((that.commodityData!= null)&&(!that.commodityData.isEmpty())) {
                    if (!leftCommodityData.equals(rightCommodityData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.commodityData!= null)&&(!that.commodityData.isEmpty())) {
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
            List<CommodityDataType> theCommodityData;
            theCommodityData = (((this.commodityData!= null)&&(!this.commodityData.isEmpty()))?this.getCommodityData():null);
            if ((this.commodityData!= null)&&(!this.commodityData.isEmpty())) {
                currentHashCode += theCommodityData.hashCode();
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
            List<CommodityDataType> theCommodityData;
            theCommodityData = (((this.commodityData!= null)&&(!this.commodityData.isEmpty()))?this.getCommodityData():null);
            strategy.appendField(locator, this, "commodityData", buffer, theCommodityData, ((this.commodityData!= null)&&(!this.commodityData.isEmpty())));
        }
        return buffer;
    }

}
