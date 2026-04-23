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
 * <p>Java class for LoadControlLimitDescriptionListDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoadControlLimitDescriptionListDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://docs.eebus.org/spine/xsd/v1}loadControlLimitDescriptionData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoadControlLimitDescriptionListDataType", propOrder = {
    "loadControlLimitDescriptionData"
})
public class LoadControlLimitDescriptionListDataType implements Cloneable, CopyTo, ToString
{

    protected List<LoadControlLimitDescriptionDataType> loadControlLimitDescriptionData;

    /**
     * Default no-arg constructor
     * 
     */
    public LoadControlLimitDescriptionListDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public LoadControlLimitDescriptionListDataType(final List<LoadControlLimitDescriptionDataType> loadControlLimitDescriptionData) {
        this.loadControlLimitDescriptionData = loadControlLimitDescriptionData;
    }

    /**
     * Gets the value of the loadControlLimitDescriptionData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the loadControlLimitDescriptionData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoadControlLimitDescriptionData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoadControlLimitDescriptionDataType }
     * 
     * 
     */
    public List<LoadControlLimitDescriptionDataType> getLoadControlLimitDescriptionData() {
        if (loadControlLimitDescriptionData == null) {
            loadControlLimitDescriptionData = new ArrayList<LoadControlLimitDescriptionDataType>();
        }
        return this.loadControlLimitDescriptionData;
    }

    /**
     * Adds objects to the list of LoadControlLimitDescriptionData using add method
     * 
     * @param values
     *     objects to add to the list LoadControlLimitDescriptionData
     * @return
     *     The class instance
     */
    public LoadControlLimitDescriptionListDataType withLoadControlLimitDescriptionData(LoadControlLimitDescriptionDataType... values) {
        if (values!= null) {
            for (LoadControlLimitDescriptionDataType value: values) {
                getLoadControlLimitDescriptionData().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of LoadControlLimitDescriptionData using addAll method
     * 
     * @param values
     *     objects to add to the list LoadControlLimitDescriptionData
     * @return
     *     The class instance
     */
    public LoadControlLimitDescriptionListDataType withLoadControlLimitDescriptionData(Collection<LoadControlLimitDescriptionDataType> values) {
        if (values!= null) {
            getLoadControlLimitDescriptionData().addAll(values);
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
        if (draftCopy instanceof LoadControlLimitDescriptionListDataType) {
            final LoadControlLimitDescriptionListDataType copy = ((LoadControlLimitDescriptionListDataType) draftCopy);
            {
                Boolean loadControlLimitDescriptionDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.loadControlLimitDescriptionData!= null)&&(!this.loadControlLimitDescriptionData.isEmpty())));
                if (loadControlLimitDescriptionDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<LoadControlLimitDescriptionDataType> sourceLoadControlLimitDescriptionData;
                    sourceLoadControlLimitDescriptionData = (((this.loadControlLimitDescriptionData!= null)&&(!this.loadControlLimitDescriptionData.isEmpty()))?this.getLoadControlLimitDescriptionData():null);
                    @SuppressWarnings("unchecked")
                    List<LoadControlLimitDescriptionDataType> copyLoadControlLimitDescriptionData = ((List<LoadControlLimitDescriptionDataType> ) strategy.copy(LocatorUtils.property(locator, "loadControlLimitDescriptionData", sourceLoadControlLimitDescriptionData), sourceLoadControlLimitDescriptionData, ((this.loadControlLimitDescriptionData!= null)&&(!this.loadControlLimitDescriptionData.isEmpty()))));
                    copy.loadControlLimitDescriptionData = null;
                    if (copyLoadControlLimitDescriptionData!= null) {
                        List<LoadControlLimitDescriptionDataType> uniqueLoadControlLimitDescriptionDatal = copy.getLoadControlLimitDescriptionData();
                        uniqueLoadControlLimitDescriptionDatal.addAll(copyLoadControlLimitDescriptionData);
                    }
                } else {
                    if (loadControlLimitDescriptionDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.loadControlLimitDescriptionData = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new LoadControlLimitDescriptionListDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final LoadControlLimitDescriptionListDataType that = ((LoadControlLimitDescriptionListDataType) object);
        {
            List<LoadControlLimitDescriptionDataType> leftLoadControlLimitDescriptionData;
            leftLoadControlLimitDescriptionData = (((this.loadControlLimitDescriptionData!= null)&&(!this.loadControlLimitDescriptionData.isEmpty()))?this.getLoadControlLimitDescriptionData():null);
            List<LoadControlLimitDescriptionDataType> rightLoadControlLimitDescriptionData;
            rightLoadControlLimitDescriptionData = (((that.loadControlLimitDescriptionData!= null)&&(!that.loadControlLimitDescriptionData.isEmpty()))?that.getLoadControlLimitDescriptionData():null);
            if ((this.loadControlLimitDescriptionData!= null)&&(!this.loadControlLimitDescriptionData.isEmpty())) {
                if ((that.loadControlLimitDescriptionData!= null)&&(!that.loadControlLimitDescriptionData.isEmpty())) {
                    if (!leftLoadControlLimitDescriptionData.equals(rightLoadControlLimitDescriptionData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.loadControlLimitDescriptionData!= null)&&(!that.loadControlLimitDescriptionData.isEmpty())) {
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
            List<LoadControlLimitDescriptionDataType> theLoadControlLimitDescriptionData;
            theLoadControlLimitDescriptionData = (((this.loadControlLimitDescriptionData!= null)&&(!this.loadControlLimitDescriptionData.isEmpty()))?this.getLoadControlLimitDescriptionData():null);
            if ((this.loadControlLimitDescriptionData!= null)&&(!this.loadControlLimitDescriptionData.isEmpty())) {
                currentHashCode += theLoadControlLimitDescriptionData.hashCode();
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
            List<LoadControlLimitDescriptionDataType> theLoadControlLimitDescriptionData;
            theLoadControlLimitDescriptionData = (((this.loadControlLimitDescriptionData!= null)&&(!this.loadControlLimitDescriptionData.isEmpty()))?this.getLoadControlLimitDescriptionData():null);
            strategy.appendField(locator, this, "loadControlLimitDescriptionData", buffer, theLoadControlLimitDescriptionData, ((this.loadControlLimitDescriptionData!= null)&&(!this.loadControlLimitDescriptionData.isEmpty())));
        }
        return buffer;
    }

}
