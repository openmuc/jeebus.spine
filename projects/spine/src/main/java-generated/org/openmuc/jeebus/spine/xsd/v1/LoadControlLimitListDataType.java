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
 * <p>Java class for LoadControlLimitListDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoadControlLimitListDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://docs.eebus.org/spine/xsd/v1}loadControlLimitData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoadControlLimitListDataType", propOrder = {
    "loadControlLimitData"
})
public class LoadControlLimitListDataType implements Cloneable, CopyTo, ToString
{

    protected List<LoadControlLimitDataType> loadControlLimitData;

    /**
     * Default no-arg constructor
     * 
     */
    public LoadControlLimitListDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public LoadControlLimitListDataType(final List<LoadControlLimitDataType> loadControlLimitData) {
        this.loadControlLimitData = loadControlLimitData;
    }

    /**
     * Gets the value of the loadControlLimitData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the loadControlLimitData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoadControlLimitData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoadControlLimitDataType }
     * 
     * 
     */
    public List<LoadControlLimitDataType> getLoadControlLimitData() {
        if (loadControlLimitData == null) {
            loadControlLimitData = new ArrayList<LoadControlLimitDataType>();
        }
        return this.loadControlLimitData;
    }

    /**
     * Adds objects to the list of LoadControlLimitData using add method
     * 
     * @param values
     *     objects to add to the list LoadControlLimitData
     * @return
     *     The class instance
     */
    public LoadControlLimitListDataType withLoadControlLimitData(LoadControlLimitDataType... values) {
        if (values!= null) {
            for (LoadControlLimitDataType value: values) {
                getLoadControlLimitData().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of LoadControlLimitData using addAll method
     * 
     * @param values
     *     objects to add to the list LoadControlLimitData
     * @return
     *     The class instance
     */
    public LoadControlLimitListDataType withLoadControlLimitData(Collection<LoadControlLimitDataType> values) {
        if (values!= null) {
            getLoadControlLimitData().addAll(values);
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
        if (draftCopy instanceof LoadControlLimitListDataType) {
            final LoadControlLimitListDataType copy = ((LoadControlLimitListDataType) draftCopy);
            {
                Boolean loadControlLimitDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.loadControlLimitData!= null)&&(!this.loadControlLimitData.isEmpty())));
                if (loadControlLimitDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<LoadControlLimitDataType> sourceLoadControlLimitData;
                    sourceLoadControlLimitData = (((this.loadControlLimitData!= null)&&(!this.loadControlLimitData.isEmpty()))?this.getLoadControlLimitData():null);
                    @SuppressWarnings("unchecked")
                    List<LoadControlLimitDataType> copyLoadControlLimitData = ((List<LoadControlLimitDataType> ) strategy.copy(LocatorUtils.property(locator, "loadControlLimitData", sourceLoadControlLimitData), sourceLoadControlLimitData, ((this.loadControlLimitData!= null)&&(!this.loadControlLimitData.isEmpty()))));
                    copy.loadControlLimitData = null;
                    if (copyLoadControlLimitData!= null) {
                        List<LoadControlLimitDataType> uniqueLoadControlLimitDatal = copy.getLoadControlLimitData();
                        uniqueLoadControlLimitDatal.addAll(copyLoadControlLimitData);
                    }
                } else {
                    if (loadControlLimitDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.loadControlLimitData = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new LoadControlLimitListDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final LoadControlLimitListDataType that = ((LoadControlLimitListDataType) object);
        {
            List<LoadControlLimitDataType> leftLoadControlLimitData;
            leftLoadControlLimitData = (((this.loadControlLimitData!= null)&&(!this.loadControlLimitData.isEmpty()))?this.getLoadControlLimitData():null);
            List<LoadControlLimitDataType> rightLoadControlLimitData;
            rightLoadControlLimitData = (((that.loadControlLimitData!= null)&&(!that.loadControlLimitData.isEmpty()))?that.getLoadControlLimitData():null);
            if ((this.loadControlLimitData!= null)&&(!this.loadControlLimitData.isEmpty())) {
                if ((that.loadControlLimitData!= null)&&(!that.loadControlLimitData.isEmpty())) {
                    if (!leftLoadControlLimitData.equals(rightLoadControlLimitData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.loadControlLimitData!= null)&&(!that.loadControlLimitData.isEmpty())) {
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
            List<LoadControlLimitDataType> theLoadControlLimitData;
            theLoadControlLimitData = (((this.loadControlLimitData!= null)&&(!this.loadControlLimitData.isEmpty()))?this.getLoadControlLimitData():null);
            if ((this.loadControlLimitData!= null)&&(!this.loadControlLimitData.isEmpty())) {
                currentHashCode += theLoadControlLimitData.hashCode();
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
            List<LoadControlLimitDataType> theLoadControlLimitData;
            theLoadControlLimitData = (((this.loadControlLimitData!= null)&&(!this.loadControlLimitData.isEmpty()))?this.getLoadControlLimitData():null);
            strategy.appendField(locator, this, "loadControlLimitData", buffer, theLoadControlLimitData, ((this.loadControlLimitData!= null)&&(!this.loadControlLimitData.isEmpty())));
        }
        return buffer;
    }

}
