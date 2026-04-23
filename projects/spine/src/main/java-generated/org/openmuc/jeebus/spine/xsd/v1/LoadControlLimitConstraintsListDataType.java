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
 * <p>Java class for LoadControlLimitConstraintsListDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoadControlLimitConstraintsListDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://docs.eebus.org/spine/xsd/v1}loadControlLimitConstraintsData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoadControlLimitConstraintsListDataType", propOrder = {
    "loadControlLimitConstraintsData"
})
public class LoadControlLimitConstraintsListDataType implements Cloneable, CopyTo, ToString
{

    protected List<LoadControlLimitConstraintsDataType> loadControlLimitConstraintsData;

    /**
     * Default no-arg constructor
     * 
     */
    public LoadControlLimitConstraintsListDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public LoadControlLimitConstraintsListDataType(final List<LoadControlLimitConstraintsDataType> loadControlLimitConstraintsData) {
        this.loadControlLimitConstraintsData = loadControlLimitConstraintsData;
    }

    /**
     * Gets the value of the loadControlLimitConstraintsData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the loadControlLimitConstraintsData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoadControlLimitConstraintsData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoadControlLimitConstraintsDataType }
     * 
     * 
     */
    public List<LoadControlLimitConstraintsDataType> getLoadControlLimitConstraintsData() {
        if (loadControlLimitConstraintsData == null) {
            loadControlLimitConstraintsData = new ArrayList<LoadControlLimitConstraintsDataType>();
        }
        return this.loadControlLimitConstraintsData;
    }

    /**
     * Adds objects to the list of LoadControlLimitConstraintsData using add method
     * 
     * @param values
     *     objects to add to the list LoadControlLimitConstraintsData
     * @return
     *     The class instance
     */
    public LoadControlLimitConstraintsListDataType withLoadControlLimitConstraintsData(LoadControlLimitConstraintsDataType... values) {
        if (values!= null) {
            for (LoadControlLimitConstraintsDataType value: values) {
                getLoadControlLimitConstraintsData().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of LoadControlLimitConstraintsData using addAll method
     * 
     * @param values
     *     objects to add to the list LoadControlLimitConstraintsData
     * @return
     *     The class instance
     */
    public LoadControlLimitConstraintsListDataType withLoadControlLimitConstraintsData(Collection<LoadControlLimitConstraintsDataType> values) {
        if (values!= null) {
            getLoadControlLimitConstraintsData().addAll(values);
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
        if (draftCopy instanceof LoadControlLimitConstraintsListDataType) {
            final LoadControlLimitConstraintsListDataType copy = ((LoadControlLimitConstraintsListDataType) draftCopy);
            {
                Boolean loadControlLimitConstraintsDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.loadControlLimitConstraintsData!= null)&&(!this.loadControlLimitConstraintsData.isEmpty())));
                if (loadControlLimitConstraintsDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<LoadControlLimitConstraintsDataType> sourceLoadControlLimitConstraintsData;
                    sourceLoadControlLimitConstraintsData = (((this.loadControlLimitConstraintsData!= null)&&(!this.loadControlLimitConstraintsData.isEmpty()))?this.getLoadControlLimitConstraintsData():null);
                    @SuppressWarnings("unchecked")
                    List<LoadControlLimitConstraintsDataType> copyLoadControlLimitConstraintsData = ((List<LoadControlLimitConstraintsDataType> ) strategy.copy(LocatorUtils.property(locator, "loadControlLimitConstraintsData", sourceLoadControlLimitConstraintsData), sourceLoadControlLimitConstraintsData, ((this.loadControlLimitConstraintsData!= null)&&(!this.loadControlLimitConstraintsData.isEmpty()))));
                    copy.loadControlLimitConstraintsData = null;
                    if (copyLoadControlLimitConstraintsData!= null) {
                        List<LoadControlLimitConstraintsDataType> uniqueLoadControlLimitConstraintsDatal = copy.getLoadControlLimitConstraintsData();
                        uniqueLoadControlLimitConstraintsDatal.addAll(copyLoadControlLimitConstraintsData);
                    }
                } else {
                    if (loadControlLimitConstraintsDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.loadControlLimitConstraintsData = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new LoadControlLimitConstraintsListDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final LoadControlLimitConstraintsListDataType that = ((LoadControlLimitConstraintsListDataType) object);
        {
            List<LoadControlLimitConstraintsDataType> leftLoadControlLimitConstraintsData;
            leftLoadControlLimitConstraintsData = (((this.loadControlLimitConstraintsData!= null)&&(!this.loadControlLimitConstraintsData.isEmpty()))?this.getLoadControlLimitConstraintsData():null);
            List<LoadControlLimitConstraintsDataType> rightLoadControlLimitConstraintsData;
            rightLoadControlLimitConstraintsData = (((that.loadControlLimitConstraintsData!= null)&&(!that.loadControlLimitConstraintsData.isEmpty()))?that.getLoadControlLimitConstraintsData():null);
            if ((this.loadControlLimitConstraintsData!= null)&&(!this.loadControlLimitConstraintsData.isEmpty())) {
                if ((that.loadControlLimitConstraintsData!= null)&&(!that.loadControlLimitConstraintsData.isEmpty())) {
                    if (!leftLoadControlLimitConstraintsData.equals(rightLoadControlLimitConstraintsData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.loadControlLimitConstraintsData!= null)&&(!that.loadControlLimitConstraintsData.isEmpty())) {
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
            List<LoadControlLimitConstraintsDataType> theLoadControlLimitConstraintsData;
            theLoadControlLimitConstraintsData = (((this.loadControlLimitConstraintsData!= null)&&(!this.loadControlLimitConstraintsData.isEmpty()))?this.getLoadControlLimitConstraintsData():null);
            if ((this.loadControlLimitConstraintsData!= null)&&(!this.loadControlLimitConstraintsData.isEmpty())) {
                currentHashCode += theLoadControlLimitConstraintsData.hashCode();
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
            List<LoadControlLimitConstraintsDataType> theLoadControlLimitConstraintsData;
            theLoadControlLimitConstraintsData = (((this.loadControlLimitConstraintsData!= null)&&(!this.loadControlLimitConstraintsData.isEmpty()))?this.getLoadControlLimitConstraintsData():null);
            strategy.appendField(locator, this, "loadControlLimitConstraintsData", buffer, theLoadControlLimitConstraintsData, ((this.loadControlLimitConstraintsData!= null)&&(!this.loadControlLimitConstraintsData.isEmpty())));
        }
        return buffer;
    }

}
