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
 * <p>Java class for SupplyConditionListDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SupplyConditionListDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://docs.eebus.org/spine/xsd/v1}supplyConditionData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupplyConditionListDataType", propOrder = {
    "supplyConditionData"
})
public class SupplyConditionListDataType implements Cloneable, CopyTo, ToString
{

    protected List<SupplyConditionDataType> supplyConditionData;

    /**
     * Default no-arg constructor
     * 
     */
    public SupplyConditionListDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public SupplyConditionListDataType(final List<SupplyConditionDataType> supplyConditionData) {
        this.supplyConditionData = supplyConditionData;
    }

    /**
     * Gets the value of the supplyConditionData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the supplyConditionData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupplyConditionData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplyConditionDataType }
     * 
     * 
     */
    public List<SupplyConditionDataType> getSupplyConditionData() {
        if (supplyConditionData == null) {
            supplyConditionData = new ArrayList<SupplyConditionDataType>();
        }
        return this.supplyConditionData;
    }

    /**
     * Adds objects to the list of SupplyConditionData using add method
     * 
     * @param values
     *     objects to add to the list SupplyConditionData
     * @return
     *     The class instance
     */
    public SupplyConditionListDataType withSupplyConditionData(SupplyConditionDataType... values) {
        if (values!= null) {
            for (SupplyConditionDataType value: values) {
                getSupplyConditionData().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of SupplyConditionData using addAll method
     * 
     * @param values
     *     objects to add to the list SupplyConditionData
     * @return
     *     The class instance
     */
    public SupplyConditionListDataType withSupplyConditionData(Collection<SupplyConditionDataType> values) {
        if (values!= null) {
            getSupplyConditionData().addAll(values);
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
        if (draftCopy instanceof SupplyConditionListDataType) {
            final SupplyConditionListDataType copy = ((SupplyConditionListDataType) draftCopy);
            {
                Boolean supplyConditionDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.supplyConditionData!= null)&&(!this.supplyConditionData.isEmpty())));
                if (supplyConditionDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<SupplyConditionDataType> sourceSupplyConditionData;
                    sourceSupplyConditionData = (((this.supplyConditionData!= null)&&(!this.supplyConditionData.isEmpty()))?this.getSupplyConditionData():null);
                    @SuppressWarnings("unchecked")
                    List<SupplyConditionDataType> copySupplyConditionData = ((List<SupplyConditionDataType> ) strategy.copy(LocatorUtils.property(locator, "supplyConditionData", sourceSupplyConditionData), sourceSupplyConditionData, ((this.supplyConditionData!= null)&&(!this.supplyConditionData.isEmpty()))));
                    copy.supplyConditionData = null;
                    if (copySupplyConditionData!= null) {
                        List<SupplyConditionDataType> uniqueSupplyConditionDatal = copy.getSupplyConditionData();
                        uniqueSupplyConditionDatal.addAll(copySupplyConditionData);
                    }
                } else {
                    if (supplyConditionDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.supplyConditionData = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new SupplyConditionListDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final SupplyConditionListDataType that = ((SupplyConditionListDataType) object);
        {
            List<SupplyConditionDataType> leftSupplyConditionData;
            leftSupplyConditionData = (((this.supplyConditionData!= null)&&(!this.supplyConditionData.isEmpty()))?this.getSupplyConditionData():null);
            List<SupplyConditionDataType> rightSupplyConditionData;
            rightSupplyConditionData = (((that.supplyConditionData!= null)&&(!that.supplyConditionData.isEmpty()))?that.getSupplyConditionData():null);
            if ((this.supplyConditionData!= null)&&(!this.supplyConditionData.isEmpty())) {
                if ((that.supplyConditionData!= null)&&(!that.supplyConditionData.isEmpty())) {
                    if (!leftSupplyConditionData.equals(rightSupplyConditionData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.supplyConditionData!= null)&&(!that.supplyConditionData.isEmpty())) {
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
            List<SupplyConditionDataType> theSupplyConditionData;
            theSupplyConditionData = (((this.supplyConditionData!= null)&&(!this.supplyConditionData.isEmpty()))?this.getSupplyConditionData():null);
            if ((this.supplyConditionData!= null)&&(!this.supplyConditionData.isEmpty())) {
                currentHashCode += theSupplyConditionData.hashCode();
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
            List<SupplyConditionDataType> theSupplyConditionData;
            theSupplyConditionData = (((this.supplyConditionData!= null)&&(!this.supplyConditionData.isEmpty()))?this.getSupplyConditionData():null);
            strategy.appendField(locator, this, "supplyConditionData", buffer, theSupplyConditionData, ((this.supplyConditionData!= null)&&(!this.supplyConditionData.isEmpty())));
        }
        return buffer;
    }

}
