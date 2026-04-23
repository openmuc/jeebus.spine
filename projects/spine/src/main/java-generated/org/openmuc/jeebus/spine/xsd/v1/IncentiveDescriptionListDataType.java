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
 * <p>Java class for IncentiveDescriptionListDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IncentiveDescriptionListDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://docs.eebus.org/spine/xsd/v1}incentiveDescriptionData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IncentiveDescriptionListDataType", propOrder = {
    "incentiveDescriptionData"
})
public class IncentiveDescriptionListDataType implements Cloneable, CopyTo, ToString
{

    protected List<IncentiveDescriptionDataType> incentiveDescriptionData;

    /**
     * Default no-arg constructor
     * 
     */
    public IncentiveDescriptionListDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public IncentiveDescriptionListDataType(final List<IncentiveDescriptionDataType> incentiveDescriptionData) {
        this.incentiveDescriptionData = incentiveDescriptionData;
    }

    /**
     * Gets the value of the incentiveDescriptionData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the incentiveDescriptionData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncentiveDescriptionData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IncentiveDescriptionDataType }
     * 
     * 
     */
    public List<IncentiveDescriptionDataType> getIncentiveDescriptionData() {
        if (incentiveDescriptionData == null) {
            incentiveDescriptionData = new ArrayList<IncentiveDescriptionDataType>();
        }
        return this.incentiveDescriptionData;
    }

    /**
     * Adds objects to the list of IncentiveDescriptionData using add method
     * 
     * @param values
     *     objects to add to the list IncentiveDescriptionData
     * @return
     *     The class instance
     */
    public IncentiveDescriptionListDataType withIncentiveDescriptionData(IncentiveDescriptionDataType... values) {
        if (values!= null) {
            for (IncentiveDescriptionDataType value: values) {
                getIncentiveDescriptionData().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of IncentiveDescriptionData using addAll method
     * 
     * @param values
     *     objects to add to the list IncentiveDescriptionData
     * @return
     *     The class instance
     */
    public IncentiveDescriptionListDataType withIncentiveDescriptionData(Collection<IncentiveDescriptionDataType> values) {
        if (values!= null) {
            getIncentiveDescriptionData().addAll(values);
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
        if (draftCopy instanceof IncentiveDescriptionListDataType) {
            final IncentiveDescriptionListDataType copy = ((IncentiveDescriptionListDataType) draftCopy);
            {
                Boolean incentiveDescriptionDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.incentiveDescriptionData!= null)&&(!this.incentiveDescriptionData.isEmpty())));
                if (incentiveDescriptionDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<IncentiveDescriptionDataType> sourceIncentiveDescriptionData;
                    sourceIncentiveDescriptionData = (((this.incentiveDescriptionData!= null)&&(!this.incentiveDescriptionData.isEmpty()))?this.getIncentiveDescriptionData():null);
                    @SuppressWarnings("unchecked")
                    List<IncentiveDescriptionDataType> copyIncentiveDescriptionData = ((List<IncentiveDescriptionDataType> ) strategy.copy(LocatorUtils.property(locator, "incentiveDescriptionData", sourceIncentiveDescriptionData), sourceIncentiveDescriptionData, ((this.incentiveDescriptionData!= null)&&(!this.incentiveDescriptionData.isEmpty()))));
                    copy.incentiveDescriptionData = null;
                    if (copyIncentiveDescriptionData!= null) {
                        List<IncentiveDescriptionDataType> uniqueIncentiveDescriptionDatal = copy.getIncentiveDescriptionData();
                        uniqueIncentiveDescriptionDatal.addAll(copyIncentiveDescriptionData);
                    }
                } else {
                    if (incentiveDescriptionDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.incentiveDescriptionData = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new IncentiveDescriptionListDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final IncentiveDescriptionListDataType that = ((IncentiveDescriptionListDataType) object);
        {
            List<IncentiveDescriptionDataType> leftIncentiveDescriptionData;
            leftIncentiveDescriptionData = (((this.incentiveDescriptionData!= null)&&(!this.incentiveDescriptionData.isEmpty()))?this.getIncentiveDescriptionData():null);
            List<IncentiveDescriptionDataType> rightIncentiveDescriptionData;
            rightIncentiveDescriptionData = (((that.incentiveDescriptionData!= null)&&(!that.incentiveDescriptionData.isEmpty()))?that.getIncentiveDescriptionData():null);
            if ((this.incentiveDescriptionData!= null)&&(!this.incentiveDescriptionData.isEmpty())) {
                if ((that.incentiveDescriptionData!= null)&&(!that.incentiveDescriptionData.isEmpty())) {
                    if (!leftIncentiveDescriptionData.equals(rightIncentiveDescriptionData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.incentiveDescriptionData!= null)&&(!that.incentiveDescriptionData.isEmpty())) {
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
            List<IncentiveDescriptionDataType> theIncentiveDescriptionData;
            theIncentiveDescriptionData = (((this.incentiveDescriptionData!= null)&&(!this.incentiveDescriptionData.isEmpty()))?this.getIncentiveDescriptionData():null);
            if ((this.incentiveDescriptionData!= null)&&(!this.incentiveDescriptionData.isEmpty())) {
                currentHashCode += theIncentiveDescriptionData.hashCode();
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
            List<IncentiveDescriptionDataType> theIncentiveDescriptionData;
            theIncentiveDescriptionData = (((this.incentiveDescriptionData!= null)&&(!this.incentiveDescriptionData.isEmpty()))?this.getIncentiveDescriptionData():null);
            strategy.appendField(locator, this, "incentiveDescriptionData", buffer, theIncentiveDescriptionData, ((this.incentiveDescriptionData!= null)&&(!this.incentiveDescriptionData.isEmpty())));
        }
        return buffer;
    }

}
