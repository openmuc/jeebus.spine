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
 * <p>Java class for IncentiveListDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IncentiveListDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://docs.eebus.org/spine/xsd/v1}incentiveData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IncentiveListDataType", propOrder = {
    "incentiveData"
})
public class IncentiveListDataType implements Cloneable, CopyTo, ToString
{

    protected List<IncentiveDataType> incentiveData;

    /**
     * Default no-arg constructor
     * 
     */
    public IncentiveListDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public IncentiveListDataType(final List<IncentiveDataType> incentiveData) {
        this.incentiveData = incentiveData;
    }

    /**
     * Gets the value of the incentiveData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the incentiveData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncentiveData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IncentiveDataType }
     * 
     * 
     */
    public List<IncentiveDataType> getIncentiveData() {
        if (incentiveData == null) {
            incentiveData = new ArrayList<IncentiveDataType>();
        }
        return this.incentiveData;
    }

    /**
     * Adds objects to the list of IncentiveData using add method
     * 
     * @param values
     *     objects to add to the list IncentiveData
     * @return
     *     The class instance
     */
    public IncentiveListDataType withIncentiveData(IncentiveDataType... values) {
        if (values!= null) {
            for (IncentiveDataType value: values) {
                getIncentiveData().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of IncentiveData using addAll method
     * 
     * @param values
     *     objects to add to the list IncentiveData
     * @return
     *     The class instance
     */
    public IncentiveListDataType withIncentiveData(Collection<IncentiveDataType> values) {
        if (values!= null) {
            getIncentiveData().addAll(values);
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
        if (draftCopy instanceof IncentiveListDataType) {
            final IncentiveListDataType copy = ((IncentiveListDataType) draftCopy);
            {
                Boolean incentiveDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.incentiveData!= null)&&(!this.incentiveData.isEmpty())));
                if (incentiveDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<IncentiveDataType> sourceIncentiveData;
                    sourceIncentiveData = (((this.incentiveData!= null)&&(!this.incentiveData.isEmpty()))?this.getIncentiveData():null);
                    @SuppressWarnings("unchecked")
                    List<IncentiveDataType> copyIncentiveData = ((List<IncentiveDataType> ) strategy.copy(LocatorUtils.property(locator, "incentiveData", sourceIncentiveData), sourceIncentiveData, ((this.incentiveData!= null)&&(!this.incentiveData.isEmpty()))));
                    copy.incentiveData = null;
                    if (copyIncentiveData!= null) {
                        List<IncentiveDataType> uniqueIncentiveDatal = copy.getIncentiveData();
                        uniqueIncentiveDatal.addAll(copyIncentiveData);
                    }
                } else {
                    if (incentiveDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.incentiveData = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new IncentiveListDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final IncentiveListDataType that = ((IncentiveListDataType) object);
        {
            List<IncentiveDataType> leftIncentiveData;
            leftIncentiveData = (((this.incentiveData!= null)&&(!this.incentiveData.isEmpty()))?this.getIncentiveData():null);
            List<IncentiveDataType> rightIncentiveData;
            rightIncentiveData = (((that.incentiveData!= null)&&(!that.incentiveData.isEmpty()))?that.getIncentiveData():null);
            if ((this.incentiveData!= null)&&(!this.incentiveData.isEmpty())) {
                if ((that.incentiveData!= null)&&(!that.incentiveData.isEmpty())) {
                    if (!leftIncentiveData.equals(rightIncentiveData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.incentiveData!= null)&&(!that.incentiveData.isEmpty())) {
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
            List<IncentiveDataType> theIncentiveData;
            theIncentiveData = (((this.incentiveData!= null)&&(!this.incentiveData.isEmpty()))?this.getIncentiveData():null);
            if ((this.incentiveData!= null)&&(!this.incentiveData.isEmpty())) {
                currentHashCode += theIncentiveData.hashCode();
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
            List<IncentiveDataType> theIncentiveData;
            theIncentiveData = (((this.incentiveData!= null)&&(!this.incentiveData.isEmpty()))?this.getIncentiveData():null);
            strategy.appendField(locator, this, "incentiveData", buffer, theIncentiveData, ((this.incentiveData!= null)&&(!this.incentiveData.isEmpty())));
        }
        return buffer;
    }

}
