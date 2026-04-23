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
 * <p>Java class for BindingManagementEntryListDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BindingManagementEntryListDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://docs.eebus.org/spine/xsd/v1}bindingManagementEntryData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BindingManagementEntryListDataType", propOrder = {
    "bindingManagementEntryData"
})
public class BindingManagementEntryListDataType implements Cloneable, CopyTo, ToString
{

    protected List<BindingManagementEntryDataType> bindingManagementEntryData;

    /**
     * Default no-arg constructor
     * 
     */
    public BindingManagementEntryListDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public BindingManagementEntryListDataType(final List<BindingManagementEntryDataType> bindingManagementEntryData) {
        this.bindingManagementEntryData = bindingManagementEntryData;
    }

    /**
     * Gets the value of the bindingManagementEntryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the bindingManagementEntryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBindingManagementEntryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BindingManagementEntryDataType }
     * 
     * 
     */
    public List<BindingManagementEntryDataType> getBindingManagementEntryData() {
        if (bindingManagementEntryData == null) {
            bindingManagementEntryData = new ArrayList<BindingManagementEntryDataType>();
        }
        return this.bindingManagementEntryData;
    }

    /**
     * Adds objects to the list of BindingManagementEntryData using add method
     * 
     * @param values
     *     objects to add to the list BindingManagementEntryData
     * @return
     *     The class instance
     */
    public BindingManagementEntryListDataType withBindingManagementEntryData(BindingManagementEntryDataType... values) {
        if (values!= null) {
            for (BindingManagementEntryDataType value: values) {
                getBindingManagementEntryData().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of BindingManagementEntryData using addAll method
     * 
     * @param values
     *     objects to add to the list BindingManagementEntryData
     * @return
     *     The class instance
     */
    public BindingManagementEntryListDataType withBindingManagementEntryData(Collection<BindingManagementEntryDataType> values) {
        if (values!= null) {
            getBindingManagementEntryData().addAll(values);
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
        if (draftCopy instanceof BindingManagementEntryListDataType) {
            final BindingManagementEntryListDataType copy = ((BindingManagementEntryListDataType) draftCopy);
            {
                Boolean bindingManagementEntryDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.bindingManagementEntryData!= null)&&(!this.bindingManagementEntryData.isEmpty())));
                if (bindingManagementEntryDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<BindingManagementEntryDataType> sourceBindingManagementEntryData;
                    sourceBindingManagementEntryData = (((this.bindingManagementEntryData!= null)&&(!this.bindingManagementEntryData.isEmpty()))?this.getBindingManagementEntryData():null);
                    @SuppressWarnings("unchecked")
                    List<BindingManagementEntryDataType> copyBindingManagementEntryData = ((List<BindingManagementEntryDataType> ) strategy.copy(LocatorUtils.property(locator, "bindingManagementEntryData", sourceBindingManagementEntryData), sourceBindingManagementEntryData, ((this.bindingManagementEntryData!= null)&&(!this.bindingManagementEntryData.isEmpty()))));
                    copy.bindingManagementEntryData = null;
                    if (copyBindingManagementEntryData!= null) {
                        List<BindingManagementEntryDataType> uniqueBindingManagementEntryDatal = copy.getBindingManagementEntryData();
                        uniqueBindingManagementEntryDatal.addAll(copyBindingManagementEntryData);
                    }
                } else {
                    if (bindingManagementEntryDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.bindingManagementEntryData = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new BindingManagementEntryListDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final BindingManagementEntryListDataType that = ((BindingManagementEntryListDataType) object);
        {
            List<BindingManagementEntryDataType> leftBindingManagementEntryData;
            leftBindingManagementEntryData = (((this.bindingManagementEntryData!= null)&&(!this.bindingManagementEntryData.isEmpty()))?this.getBindingManagementEntryData():null);
            List<BindingManagementEntryDataType> rightBindingManagementEntryData;
            rightBindingManagementEntryData = (((that.bindingManagementEntryData!= null)&&(!that.bindingManagementEntryData.isEmpty()))?that.getBindingManagementEntryData():null);
            if ((this.bindingManagementEntryData!= null)&&(!this.bindingManagementEntryData.isEmpty())) {
                if ((that.bindingManagementEntryData!= null)&&(!that.bindingManagementEntryData.isEmpty())) {
                    if (!leftBindingManagementEntryData.equals(rightBindingManagementEntryData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.bindingManagementEntryData!= null)&&(!that.bindingManagementEntryData.isEmpty())) {
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
            List<BindingManagementEntryDataType> theBindingManagementEntryData;
            theBindingManagementEntryData = (((this.bindingManagementEntryData!= null)&&(!this.bindingManagementEntryData.isEmpty()))?this.getBindingManagementEntryData():null);
            if ((this.bindingManagementEntryData!= null)&&(!this.bindingManagementEntryData.isEmpty())) {
                currentHashCode += theBindingManagementEntryData.hashCode();
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
            List<BindingManagementEntryDataType> theBindingManagementEntryData;
            theBindingManagementEntryData = (((this.bindingManagementEntryData!= null)&&(!this.bindingManagementEntryData.isEmpty()))?this.getBindingManagementEntryData():null);
            strategy.appendField(locator, this, "bindingManagementEntryData", buffer, theBindingManagementEntryData, ((this.bindingManagementEntryData!= null)&&(!this.bindingManagementEntryData.isEmpty())));
        }
        return buffer;
    }

}
