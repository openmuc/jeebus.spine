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
 * <p>Java class for SupplyConditionThresholdRelationListDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SupplyConditionThresholdRelationListDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://docs.eebus.org/spine/xsd/v1}supplyConditionThresholdRelationData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupplyConditionThresholdRelationListDataType", propOrder = {
    "supplyConditionThresholdRelationData"
})
public class SupplyConditionThresholdRelationListDataType implements Cloneable, CopyTo, ToString
{

    protected List<SupplyConditionThresholdRelationDataType> supplyConditionThresholdRelationData;

    /**
     * Default no-arg constructor
     * 
     */
    public SupplyConditionThresholdRelationListDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public SupplyConditionThresholdRelationListDataType(final List<SupplyConditionThresholdRelationDataType> supplyConditionThresholdRelationData) {
        this.supplyConditionThresholdRelationData = supplyConditionThresholdRelationData;
    }

    /**
     * Gets the value of the supplyConditionThresholdRelationData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the supplyConditionThresholdRelationData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupplyConditionThresholdRelationData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplyConditionThresholdRelationDataType }
     * 
     * 
     */
    public List<SupplyConditionThresholdRelationDataType> getSupplyConditionThresholdRelationData() {
        if (supplyConditionThresholdRelationData == null) {
            supplyConditionThresholdRelationData = new ArrayList<SupplyConditionThresholdRelationDataType>();
        }
        return this.supplyConditionThresholdRelationData;
    }

    /**
     * Adds objects to the list of SupplyConditionThresholdRelationData using add method
     * 
     * @param values
     *     objects to add to the list SupplyConditionThresholdRelationData
     * @return
     *     The class instance
     */
    public SupplyConditionThresholdRelationListDataType withSupplyConditionThresholdRelationData(SupplyConditionThresholdRelationDataType... values) {
        if (values!= null) {
            for (SupplyConditionThresholdRelationDataType value: values) {
                getSupplyConditionThresholdRelationData().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of SupplyConditionThresholdRelationData using addAll method
     * 
     * @param values
     *     objects to add to the list SupplyConditionThresholdRelationData
     * @return
     *     The class instance
     */
    public SupplyConditionThresholdRelationListDataType withSupplyConditionThresholdRelationData(Collection<SupplyConditionThresholdRelationDataType> values) {
        if (values!= null) {
            getSupplyConditionThresholdRelationData().addAll(values);
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
        if (draftCopy instanceof SupplyConditionThresholdRelationListDataType) {
            final SupplyConditionThresholdRelationListDataType copy = ((SupplyConditionThresholdRelationListDataType) draftCopy);
            {
                Boolean supplyConditionThresholdRelationDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.supplyConditionThresholdRelationData!= null)&&(!this.supplyConditionThresholdRelationData.isEmpty())));
                if (supplyConditionThresholdRelationDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<SupplyConditionThresholdRelationDataType> sourceSupplyConditionThresholdRelationData;
                    sourceSupplyConditionThresholdRelationData = (((this.supplyConditionThresholdRelationData!= null)&&(!this.supplyConditionThresholdRelationData.isEmpty()))?this.getSupplyConditionThresholdRelationData():null);
                    @SuppressWarnings("unchecked")
                    List<SupplyConditionThresholdRelationDataType> copySupplyConditionThresholdRelationData = ((List<SupplyConditionThresholdRelationDataType> ) strategy.copy(LocatorUtils.property(locator, "supplyConditionThresholdRelationData", sourceSupplyConditionThresholdRelationData), sourceSupplyConditionThresholdRelationData, ((this.supplyConditionThresholdRelationData!= null)&&(!this.supplyConditionThresholdRelationData.isEmpty()))));
                    copy.supplyConditionThresholdRelationData = null;
                    if (copySupplyConditionThresholdRelationData!= null) {
                        List<SupplyConditionThresholdRelationDataType> uniqueSupplyConditionThresholdRelationDatal = copy.getSupplyConditionThresholdRelationData();
                        uniqueSupplyConditionThresholdRelationDatal.addAll(copySupplyConditionThresholdRelationData);
                    }
                } else {
                    if (supplyConditionThresholdRelationDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.supplyConditionThresholdRelationData = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new SupplyConditionThresholdRelationListDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final SupplyConditionThresholdRelationListDataType that = ((SupplyConditionThresholdRelationListDataType) object);
        {
            List<SupplyConditionThresholdRelationDataType> leftSupplyConditionThresholdRelationData;
            leftSupplyConditionThresholdRelationData = (((this.supplyConditionThresholdRelationData!= null)&&(!this.supplyConditionThresholdRelationData.isEmpty()))?this.getSupplyConditionThresholdRelationData():null);
            List<SupplyConditionThresholdRelationDataType> rightSupplyConditionThresholdRelationData;
            rightSupplyConditionThresholdRelationData = (((that.supplyConditionThresholdRelationData!= null)&&(!that.supplyConditionThresholdRelationData.isEmpty()))?that.getSupplyConditionThresholdRelationData():null);
            if ((this.supplyConditionThresholdRelationData!= null)&&(!this.supplyConditionThresholdRelationData.isEmpty())) {
                if ((that.supplyConditionThresholdRelationData!= null)&&(!that.supplyConditionThresholdRelationData.isEmpty())) {
                    if (!leftSupplyConditionThresholdRelationData.equals(rightSupplyConditionThresholdRelationData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.supplyConditionThresholdRelationData!= null)&&(!that.supplyConditionThresholdRelationData.isEmpty())) {
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
            List<SupplyConditionThresholdRelationDataType> theSupplyConditionThresholdRelationData;
            theSupplyConditionThresholdRelationData = (((this.supplyConditionThresholdRelationData!= null)&&(!this.supplyConditionThresholdRelationData.isEmpty()))?this.getSupplyConditionThresholdRelationData():null);
            if ((this.supplyConditionThresholdRelationData!= null)&&(!this.supplyConditionThresholdRelationData.isEmpty())) {
                currentHashCode += theSupplyConditionThresholdRelationData.hashCode();
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
            List<SupplyConditionThresholdRelationDataType> theSupplyConditionThresholdRelationData;
            theSupplyConditionThresholdRelationData = (((this.supplyConditionThresholdRelationData!= null)&&(!this.supplyConditionThresholdRelationData.isEmpty()))?this.getSupplyConditionThresholdRelationData():null);
            strategy.appendField(locator, this, "supplyConditionThresholdRelationData", buffer, theSupplyConditionThresholdRelationData, ((this.supplyConditionThresholdRelationData!= null)&&(!this.supplyConditionThresholdRelationData.isEmpty())));
        }
        return buffer;
    }

}
