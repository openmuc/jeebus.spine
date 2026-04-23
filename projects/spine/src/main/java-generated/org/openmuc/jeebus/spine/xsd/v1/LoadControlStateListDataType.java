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
 * <p>Java class for LoadControlStateListDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoadControlStateListDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://docs.eebus.org/spine/xsd/v1}loadControlStateData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoadControlStateListDataType", propOrder = {
    "loadControlStateData"
})
public class LoadControlStateListDataType implements Cloneable, CopyTo, ToString
{

    protected List<LoadControlStateDataType> loadControlStateData;

    /**
     * Default no-arg constructor
     * 
     */
    public LoadControlStateListDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public LoadControlStateListDataType(final List<LoadControlStateDataType> loadControlStateData) {
        this.loadControlStateData = loadControlStateData;
    }

    /**
     * Gets the value of the loadControlStateData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the loadControlStateData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoadControlStateData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoadControlStateDataType }
     * 
     * 
     */
    public List<LoadControlStateDataType> getLoadControlStateData() {
        if (loadControlStateData == null) {
            loadControlStateData = new ArrayList<LoadControlStateDataType>();
        }
        return this.loadControlStateData;
    }

    /**
     * Adds objects to the list of LoadControlStateData using add method
     * 
     * @param values
     *     objects to add to the list LoadControlStateData
     * @return
     *     The class instance
     */
    public LoadControlStateListDataType withLoadControlStateData(LoadControlStateDataType... values) {
        if (values!= null) {
            for (LoadControlStateDataType value: values) {
                getLoadControlStateData().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of LoadControlStateData using addAll method
     * 
     * @param values
     *     objects to add to the list LoadControlStateData
     * @return
     *     The class instance
     */
    public LoadControlStateListDataType withLoadControlStateData(Collection<LoadControlStateDataType> values) {
        if (values!= null) {
            getLoadControlStateData().addAll(values);
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
        if (draftCopy instanceof LoadControlStateListDataType) {
            final LoadControlStateListDataType copy = ((LoadControlStateListDataType) draftCopy);
            {
                Boolean loadControlStateDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.loadControlStateData!= null)&&(!this.loadControlStateData.isEmpty())));
                if (loadControlStateDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<LoadControlStateDataType> sourceLoadControlStateData;
                    sourceLoadControlStateData = (((this.loadControlStateData!= null)&&(!this.loadControlStateData.isEmpty()))?this.getLoadControlStateData():null);
                    @SuppressWarnings("unchecked")
                    List<LoadControlStateDataType> copyLoadControlStateData = ((List<LoadControlStateDataType> ) strategy.copy(LocatorUtils.property(locator, "loadControlStateData", sourceLoadControlStateData), sourceLoadControlStateData, ((this.loadControlStateData!= null)&&(!this.loadControlStateData.isEmpty()))));
                    copy.loadControlStateData = null;
                    if (copyLoadControlStateData!= null) {
                        List<LoadControlStateDataType> uniqueLoadControlStateDatal = copy.getLoadControlStateData();
                        uniqueLoadControlStateDatal.addAll(copyLoadControlStateData);
                    }
                } else {
                    if (loadControlStateDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.loadControlStateData = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new LoadControlStateListDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final LoadControlStateListDataType that = ((LoadControlStateListDataType) object);
        {
            List<LoadControlStateDataType> leftLoadControlStateData;
            leftLoadControlStateData = (((this.loadControlStateData!= null)&&(!this.loadControlStateData.isEmpty()))?this.getLoadControlStateData():null);
            List<LoadControlStateDataType> rightLoadControlStateData;
            rightLoadControlStateData = (((that.loadControlStateData!= null)&&(!that.loadControlStateData.isEmpty()))?that.getLoadControlStateData():null);
            if ((this.loadControlStateData!= null)&&(!this.loadControlStateData.isEmpty())) {
                if ((that.loadControlStateData!= null)&&(!that.loadControlStateData.isEmpty())) {
                    if (!leftLoadControlStateData.equals(rightLoadControlStateData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.loadControlStateData!= null)&&(!that.loadControlStateData.isEmpty())) {
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
            List<LoadControlStateDataType> theLoadControlStateData;
            theLoadControlStateData = (((this.loadControlStateData!= null)&&(!this.loadControlStateData.isEmpty()))?this.getLoadControlStateData():null);
            if ((this.loadControlStateData!= null)&&(!this.loadControlStateData.isEmpty())) {
                currentHashCode += theLoadControlStateData.hashCode();
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
            List<LoadControlStateDataType> theLoadControlStateData;
            theLoadControlStateData = (((this.loadControlStateData!= null)&&(!this.loadControlStateData.isEmpty()))?this.getLoadControlStateData():null);
            strategy.appendField(locator, this, "loadControlStateData", buffer, theLoadControlStateData, ((this.loadControlStateData!= null)&&(!this.loadControlStateData.isEmpty())));
        }
        return buffer;
    }

}
