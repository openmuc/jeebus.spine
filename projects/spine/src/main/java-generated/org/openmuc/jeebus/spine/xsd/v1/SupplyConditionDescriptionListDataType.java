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
 * <p>Java class for SupplyConditionDescriptionListDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SupplyConditionDescriptionListDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://docs.eebus.org/spine/xsd/v1}supplyConditionDescriptionData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupplyConditionDescriptionListDataType", propOrder = {
    "supplyConditionDescriptionData"
})
public class SupplyConditionDescriptionListDataType implements Cloneable, CopyTo, ToString
{

    protected List<SupplyConditionDescriptionDataType> supplyConditionDescriptionData;

    /**
     * Default no-arg constructor
     * 
     */
    public SupplyConditionDescriptionListDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public SupplyConditionDescriptionListDataType(final List<SupplyConditionDescriptionDataType> supplyConditionDescriptionData) {
        this.supplyConditionDescriptionData = supplyConditionDescriptionData;
    }

    /**
     * Gets the value of the supplyConditionDescriptionData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the supplyConditionDescriptionData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupplyConditionDescriptionData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplyConditionDescriptionDataType }
     * 
     * 
     */
    public List<SupplyConditionDescriptionDataType> getSupplyConditionDescriptionData() {
        if (supplyConditionDescriptionData == null) {
            supplyConditionDescriptionData = new ArrayList<SupplyConditionDescriptionDataType>();
        }
        return this.supplyConditionDescriptionData;
    }

    /**
     * Adds objects to the list of SupplyConditionDescriptionData using add method
     * 
     * @param values
     *     objects to add to the list SupplyConditionDescriptionData
     * @return
     *     The class instance
     */
    public SupplyConditionDescriptionListDataType withSupplyConditionDescriptionData(SupplyConditionDescriptionDataType... values) {
        if (values!= null) {
            for (SupplyConditionDescriptionDataType value: values) {
                getSupplyConditionDescriptionData().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of SupplyConditionDescriptionData using addAll method
     * 
     * @param values
     *     objects to add to the list SupplyConditionDescriptionData
     * @return
     *     The class instance
     */
    public SupplyConditionDescriptionListDataType withSupplyConditionDescriptionData(Collection<SupplyConditionDescriptionDataType> values) {
        if (values!= null) {
            getSupplyConditionDescriptionData().addAll(values);
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
        if (draftCopy instanceof SupplyConditionDescriptionListDataType) {
            final SupplyConditionDescriptionListDataType copy = ((SupplyConditionDescriptionListDataType) draftCopy);
            {
                Boolean supplyConditionDescriptionDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.supplyConditionDescriptionData!= null)&&(!this.supplyConditionDescriptionData.isEmpty())));
                if (supplyConditionDescriptionDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<SupplyConditionDescriptionDataType> sourceSupplyConditionDescriptionData;
                    sourceSupplyConditionDescriptionData = (((this.supplyConditionDescriptionData!= null)&&(!this.supplyConditionDescriptionData.isEmpty()))?this.getSupplyConditionDescriptionData():null);
                    @SuppressWarnings("unchecked")
                    List<SupplyConditionDescriptionDataType> copySupplyConditionDescriptionData = ((List<SupplyConditionDescriptionDataType> ) strategy.copy(LocatorUtils.property(locator, "supplyConditionDescriptionData", sourceSupplyConditionDescriptionData), sourceSupplyConditionDescriptionData, ((this.supplyConditionDescriptionData!= null)&&(!this.supplyConditionDescriptionData.isEmpty()))));
                    copy.supplyConditionDescriptionData = null;
                    if (copySupplyConditionDescriptionData!= null) {
                        List<SupplyConditionDescriptionDataType> uniqueSupplyConditionDescriptionDatal = copy.getSupplyConditionDescriptionData();
                        uniqueSupplyConditionDescriptionDatal.addAll(copySupplyConditionDescriptionData);
                    }
                } else {
                    if (supplyConditionDescriptionDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.supplyConditionDescriptionData = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new SupplyConditionDescriptionListDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final SupplyConditionDescriptionListDataType that = ((SupplyConditionDescriptionListDataType) object);
        {
            List<SupplyConditionDescriptionDataType> leftSupplyConditionDescriptionData;
            leftSupplyConditionDescriptionData = (((this.supplyConditionDescriptionData!= null)&&(!this.supplyConditionDescriptionData.isEmpty()))?this.getSupplyConditionDescriptionData():null);
            List<SupplyConditionDescriptionDataType> rightSupplyConditionDescriptionData;
            rightSupplyConditionDescriptionData = (((that.supplyConditionDescriptionData!= null)&&(!that.supplyConditionDescriptionData.isEmpty()))?that.getSupplyConditionDescriptionData():null);
            if ((this.supplyConditionDescriptionData!= null)&&(!this.supplyConditionDescriptionData.isEmpty())) {
                if ((that.supplyConditionDescriptionData!= null)&&(!that.supplyConditionDescriptionData.isEmpty())) {
                    if (!leftSupplyConditionDescriptionData.equals(rightSupplyConditionDescriptionData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.supplyConditionDescriptionData!= null)&&(!that.supplyConditionDescriptionData.isEmpty())) {
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
            List<SupplyConditionDescriptionDataType> theSupplyConditionDescriptionData;
            theSupplyConditionDescriptionData = (((this.supplyConditionDescriptionData!= null)&&(!this.supplyConditionDescriptionData.isEmpty()))?this.getSupplyConditionDescriptionData():null);
            if ((this.supplyConditionDescriptionData!= null)&&(!this.supplyConditionDescriptionData.isEmpty())) {
                currentHashCode += theSupplyConditionDescriptionData.hashCode();
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
            List<SupplyConditionDescriptionDataType> theSupplyConditionDescriptionData;
            theSupplyConditionDescriptionData = (((this.supplyConditionDescriptionData!= null)&&(!this.supplyConditionDescriptionData.isEmpty()))?this.getSupplyConditionDescriptionData():null);
            strategy.appendField(locator, this, "supplyConditionDescriptionData", buffer, theSupplyConditionDescriptionData, ((this.supplyConditionDescriptionData!= null)&&(!this.supplyConditionDescriptionData.isEmpty())));
        }
        return buffer;
    }

}
