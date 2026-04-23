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
 * <p>Java class for SubscriptionManagementEntryListDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubscriptionManagementEntryListDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://docs.eebus.org/spine/xsd/v1}subscriptionManagementEntryData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriptionManagementEntryListDataType", propOrder = {
    "subscriptionManagementEntryData"
})
public class SubscriptionManagementEntryListDataType implements Cloneable, CopyTo, ToString
{

    protected List<SubscriptionManagementEntryDataType> subscriptionManagementEntryData;

    /**
     * Default no-arg constructor
     * 
     */
    public SubscriptionManagementEntryListDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public SubscriptionManagementEntryListDataType(final List<SubscriptionManagementEntryDataType> subscriptionManagementEntryData) {
        this.subscriptionManagementEntryData = subscriptionManagementEntryData;
    }

    /**
     * Gets the value of the subscriptionManagementEntryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the subscriptionManagementEntryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubscriptionManagementEntryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubscriptionManagementEntryDataType }
     * 
     * 
     */
    public List<SubscriptionManagementEntryDataType> getSubscriptionManagementEntryData() {
        if (subscriptionManagementEntryData == null) {
            subscriptionManagementEntryData = new ArrayList<SubscriptionManagementEntryDataType>();
        }
        return this.subscriptionManagementEntryData;
    }

    /**
     * Adds objects to the list of SubscriptionManagementEntryData using add method
     * 
     * @param values
     *     objects to add to the list SubscriptionManagementEntryData
     * @return
     *     The class instance
     */
    public SubscriptionManagementEntryListDataType withSubscriptionManagementEntryData(SubscriptionManagementEntryDataType... values) {
        if (values!= null) {
            for (SubscriptionManagementEntryDataType value: values) {
                getSubscriptionManagementEntryData().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of SubscriptionManagementEntryData using addAll method
     * 
     * @param values
     *     objects to add to the list SubscriptionManagementEntryData
     * @return
     *     The class instance
     */
    public SubscriptionManagementEntryListDataType withSubscriptionManagementEntryData(Collection<SubscriptionManagementEntryDataType> values) {
        if (values!= null) {
            getSubscriptionManagementEntryData().addAll(values);
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
        if (draftCopy instanceof SubscriptionManagementEntryListDataType) {
            final SubscriptionManagementEntryListDataType copy = ((SubscriptionManagementEntryListDataType) draftCopy);
            {
                Boolean subscriptionManagementEntryDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.subscriptionManagementEntryData!= null)&&(!this.subscriptionManagementEntryData.isEmpty())));
                if (subscriptionManagementEntryDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<SubscriptionManagementEntryDataType> sourceSubscriptionManagementEntryData;
                    sourceSubscriptionManagementEntryData = (((this.subscriptionManagementEntryData!= null)&&(!this.subscriptionManagementEntryData.isEmpty()))?this.getSubscriptionManagementEntryData():null);
                    @SuppressWarnings("unchecked")
                    List<SubscriptionManagementEntryDataType> copySubscriptionManagementEntryData = ((List<SubscriptionManagementEntryDataType> ) strategy.copy(LocatorUtils.property(locator, "subscriptionManagementEntryData", sourceSubscriptionManagementEntryData), sourceSubscriptionManagementEntryData, ((this.subscriptionManagementEntryData!= null)&&(!this.subscriptionManagementEntryData.isEmpty()))));
                    copy.subscriptionManagementEntryData = null;
                    if (copySubscriptionManagementEntryData!= null) {
                        List<SubscriptionManagementEntryDataType> uniqueSubscriptionManagementEntryDatal = copy.getSubscriptionManagementEntryData();
                        uniqueSubscriptionManagementEntryDatal.addAll(copySubscriptionManagementEntryData);
                    }
                } else {
                    if (subscriptionManagementEntryDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.subscriptionManagementEntryData = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new SubscriptionManagementEntryListDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final SubscriptionManagementEntryListDataType that = ((SubscriptionManagementEntryListDataType) object);
        {
            List<SubscriptionManagementEntryDataType> leftSubscriptionManagementEntryData;
            leftSubscriptionManagementEntryData = (((this.subscriptionManagementEntryData!= null)&&(!this.subscriptionManagementEntryData.isEmpty()))?this.getSubscriptionManagementEntryData():null);
            List<SubscriptionManagementEntryDataType> rightSubscriptionManagementEntryData;
            rightSubscriptionManagementEntryData = (((that.subscriptionManagementEntryData!= null)&&(!that.subscriptionManagementEntryData.isEmpty()))?that.getSubscriptionManagementEntryData():null);
            if ((this.subscriptionManagementEntryData!= null)&&(!this.subscriptionManagementEntryData.isEmpty())) {
                if ((that.subscriptionManagementEntryData!= null)&&(!that.subscriptionManagementEntryData.isEmpty())) {
                    if (!leftSubscriptionManagementEntryData.equals(rightSubscriptionManagementEntryData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.subscriptionManagementEntryData!= null)&&(!that.subscriptionManagementEntryData.isEmpty())) {
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
            List<SubscriptionManagementEntryDataType> theSubscriptionManagementEntryData;
            theSubscriptionManagementEntryData = (((this.subscriptionManagementEntryData!= null)&&(!this.subscriptionManagementEntryData.isEmpty()))?this.getSubscriptionManagementEntryData():null);
            if ((this.subscriptionManagementEntryData!= null)&&(!this.subscriptionManagementEntryData.isEmpty())) {
                currentHashCode += theSubscriptionManagementEntryData.hashCode();
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
            List<SubscriptionManagementEntryDataType> theSubscriptionManagementEntryData;
            theSubscriptionManagementEntryData = (((this.subscriptionManagementEntryData!= null)&&(!this.subscriptionManagementEntryData.isEmpty()))?this.getSubscriptionManagementEntryData():null);
            strategy.appendField(locator, this, "subscriptionManagementEntryData", buffer, theSubscriptionManagementEntryData, ((this.subscriptionManagementEntryData!= null)&&(!this.subscriptionManagementEntryData.isEmpty())));
        }
        return buffer;
    }

}
