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
 * <p>Java class for LoadControlEventListDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoadControlEventListDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://docs.eebus.org/spine/xsd/v1}loadControlEventData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoadControlEventListDataType", propOrder = {
    "loadControlEventData"
})
public class LoadControlEventListDataType implements Cloneable, CopyTo, ToString
{

    protected List<LoadControlEventDataType> loadControlEventData;

    /**
     * Default no-arg constructor
     * 
     */
    public LoadControlEventListDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public LoadControlEventListDataType(final List<LoadControlEventDataType> loadControlEventData) {
        this.loadControlEventData = loadControlEventData;
    }

    /**
     * Gets the value of the loadControlEventData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the loadControlEventData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoadControlEventData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoadControlEventDataType }
     * 
     * 
     */
    public List<LoadControlEventDataType> getLoadControlEventData() {
        if (loadControlEventData == null) {
            loadControlEventData = new ArrayList<LoadControlEventDataType>();
        }
        return this.loadControlEventData;
    }

    /**
     * Adds objects to the list of LoadControlEventData using add method
     * 
     * @param values
     *     objects to add to the list LoadControlEventData
     * @return
     *     The class instance
     */
    public LoadControlEventListDataType withLoadControlEventData(LoadControlEventDataType... values) {
        if (values!= null) {
            for (LoadControlEventDataType value: values) {
                getLoadControlEventData().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of LoadControlEventData using addAll method
     * 
     * @param values
     *     objects to add to the list LoadControlEventData
     * @return
     *     The class instance
     */
    public LoadControlEventListDataType withLoadControlEventData(Collection<LoadControlEventDataType> values) {
        if (values!= null) {
            getLoadControlEventData().addAll(values);
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
        if (draftCopy instanceof LoadControlEventListDataType) {
            final LoadControlEventListDataType copy = ((LoadControlEventListDataType) draftCopy);
            {
                Boolean loadControlEventDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.loadControlEventData!= null)&&(!this.loadControlEventData.isEmpty())));
                if (loadControlEventDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<LoadControlEventDataType> sourceLoadControlEventData;
                    sourceLoadControlEventData = (((this.loadControlEventData!= null)&&(!this.loadControlEventData.isEmpty()))?this.getLoadControlEventData():null);
                    @SuppressWarnings("unchecked")
                    List<LoadControlEventDataType> copyLoadControlEventData = ((List<LoadControlEventDataType> ) strategy.copy(LocatorUtils.property(locator, "loadControlEventData", sourceLoadControlEventData), sourceLoadControlEventData, ((this.loadControlEventData!= null)&&(!this.loadControlEventData.isEmpty()))));
                    copy.loadControlEventData = null;
                    if (copyLoadControlEventData!= null) {
                        List<LoadControlEventDataType> uniqueLoadControlEventDatal = copy.getLoadControlEventData();
                        uniqueLoadControlEventDatal.addAll(copyLoadControlEventData);
                    }
                } else {
                    if (loadControlEventDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.loadControlEventData = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new LoadControlEventListDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final LoadControlEventListDataType that = ((LoadControlEventListDataType) object);
        {
            List<LoadControlEventDataType> leftLoadControlEventData;
            leftLoadControlEventData = (((this.loadControlEventData!= null)&&(!this.loadControlEventData.isEmpty()))?this.getLoadControlEventData():null);
            List<LoadControlEventDataType> rightLoadControlEventData;
            rightLoadControlEventData = (((that.loadControlEventData!= null)&&(!that.loadControlEventData.isEmpty()))?that.getLoadControlEventData():null);
            if ((this.loadControlEventData!= null)&&(!this.loadControlEventData.isEmpty())) {
                if ((that.loadControlEventData!= null)&&(!that.loadControlEventData.isEmpty())) {
                    if (!leftLoadControlEventData.equals(rightLoadControlEventData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.loadControlEventData!= null)&&(!that.loadControlEventData.isEmpty())) {
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
            List<LoadControlEventDataType> theLoadControlEventData;
            theLoadControlEventData = (((this.loadControlEventData!= null)&&(!this.loadControlEventData.isEmpty()))?this.getLoadControlEventData():null);
            if ((this.loadControlEventData!= null)&&(!this.loadControlEventData.isEmpty())) {
                currentHashCode += theLoadControlEventData.hashCode();
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
            List<LoadControlEventDataType> theLoadControlEventData;
            theLoadControlEventData = (((this.loadControlEventData!= null)&&(!this.loadControlEventData.isEmpty()))?this.getLoadControlEventData():null);
            strategy.appendField(locator, this, "loadControlEventData", buffer, theLoadControlEventData, ((this.loadControlEventData!= null)&&(!this.loadControlEventData.isEmpty())));
        }
        return buffer;
    }

}
