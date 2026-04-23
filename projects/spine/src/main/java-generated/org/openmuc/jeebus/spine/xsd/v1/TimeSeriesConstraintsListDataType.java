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
 * <p>Java class for TimeSeriesConstraintsListDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeSeriesConstraintsListDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://docs.eebus.org/spine/xsd/v1}timeSeriesConstraintsData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeSeriesConstraintsListDataType", propOrder = {
    "timeSeriesConstraintsData"
})
public class TimeSeriesConstraintsListDataType implements Cloneable, CopyTo, ToString
{

    protected List<TimeSeriesConstraintsDataType> timeSeriesConstraintsData;

    /**
     * Default no-arg constructor
     * 
     */
    public TimeSeriesConstraintsListDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public TimeSeriesConstraintsListDataType(final List<TimeSeriesConstraintsDataType> timeSeriesConstraintsData) {
        this.timeSeriesConstraintsData = timeSeriesConstraintsData;
    }

    /**
     * Gets the value of the timeSeriesConstraintsData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the timeSeriesConstraintsData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimeSeriesConstraintsData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimeSeriesConstraintsDataType }
     * 
     * 
     */
    public List<TimeSeriesConstraintsDataType> getTimeSeriesConstraintsData() {
        if (timeSeriesConstraintsData == null) {
            timeSeriesConstraintsData = new ArrayList<TimeSeriesConstraintsDataType>();
        }
        return this.timeSeriesConstraintsData;
    }

    /**
     * Adds objects to the list of TimeSeriesConstraintsData using add method
     * 
     * @param values
     *     objects to add to the list TimeSeriesConstraintsData
     * @return
     *     The class instance
     */
    public TimeSeriesConstraintsListDataType withTimeSeriesConstraintsData(TimeSeriesConstraintsDataType... values) {
        if (values!= null) {
            for (TimeSeriesConstraintsDataType value: values) {
                getTimeSeriesConstraintsData().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of TimeSeriesConstraintsData using addAll method
     * 
     * @param values
     *     objects to add to the list TimeSeriesConstraintsData
     * @return
     *     The class instance
     */
    public TimeSeriesConstraintsListDataType withTimeSeriesConstraintsData(Collection<TimeSeriesConstraintsDataType> values) {
        if (values!= null) {
            getTimeSeriesConstraintsData().addAll(values);
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
        if (draftCopy instanceof TimeSeriesConstraintsListDataType) {
            final TimeSeriesConstraintsListDataType copy = ((TimeSeriesConstraintsListDataType) draftCopy);
            {
                Boolean timeSeriesConstraintsDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.timeSeriesConstraintsData!= null)&&(!this.timeSeriesConstraintsData.isEmpty())));
                if (timeSeriesConstraintsDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<TimeSeriesConstraintsDataType> sourceTimeSeriesConstraintsData;
                    sourceTimeSeriesConstraintsData = (((this.timeSeriesConstraintsData!= null)&&(!this.timeSeriesConstraintsData.isEmpty()))?this.getTimeSeriesConstraintsData():null);
                    @SuppressWarnings("unchecked")
                    List<TimeSeriesConstraintsDataType> copyTimeSeriesConstraintsData = ((List<TimeSeriesConstraintsDataType> ) strategy.copy(LocatorUtils.property(locator, "timeSeriesConstraintsData", sourceTimeSeriesConstraintsData), sourceTimeSeriesConstraintsData, ((this.timeSeriesConstraintsData!= null)&&(!this.timeSeriesConstraintsData.isEmpty()))));
                    copy.timeSeriesConstraintsData = null;
                    if (copyTimeSeriesConstraintsData!= null) {
                        List<TimeSeriesConstraintsDataType> uniqueTimeSeriesConstraintsDatal = copy.getTimeSeriesConstraintsData();
                        uniqueTimeSeriesConstraintsDatal.addAll(copyTimeSeriesConstraintsData);
                    }
                } else {
                    if (timeSeriesConstraintsDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.timeSeriesConstraintsData = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new TimeSeriesConstraintsListDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TimeSeriesConstraintsListDataType that = ((TimeSeriesConstraintsListDataType) object);
        {
            List<TimeSeriesConstraintsDataType> leftTimeSeriesConstraintsData;
            leftTimeSeriesConstraintsData = (((this.timeSeriesConstraintsData!= null)&&(!this.timeSeriesConstraintsData.isEmpty()))?this.getTimeSeriesConstraintsData():null);
            List<TimeSeriesConstraintsDataType> rightTimeSeriesConstraintsData;
            rightTimeSeriesConstraintsData = (((that.timeSeriesConstraintsData!= null)&&(!that.timeSeriesConstraintsData.isEmpty()))?that.getTimeSeriesConstraintsData():null);
            if ((this.timeSeriesConstraintsData!= null)&&(!this.timeSeriesConstraintsData.isEmpty())) {
                if ((that.timeSeriesConstraintsData!= null)&&(!that.timeSeriesConstraintsData.isEmpty())) {
                    if (!leftTimeSeriesConstraintsData.equals(rightTimeSeriesConstraintsData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.timeSeriesConstraintsData!= null)&&(!that.timeSeriesConstraintsData.isEmpty())) {
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
            List<TimeSeriesConstraintsDataType> theTimeSeriesConstraintsData;
            theTimeSeriesConstraintsData = (((this.timeSeriesConstraintsData!= null)&&(!this.timeSeriesConstraintsData.isEmpty()))?this.getTimeSeriesConstraintsData():null);
            if ((this.timeSeriesConstraintsData!= null)&&(!this.timeSeriesConstraintsData.isEmpty())) {
                currentHashCode += theTimeSeriesConstraintsData.hashCode();
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
            List<TimeSeriesConstraintsDataType> theTimeSeriesConstraintsData;
            theTimeSeriesConstraintsData = (((this.timeSeriesConstraintsData!= null)&&(!this.timeSeriesConstraintsData.isEmpty()))?this.getTimeSeriesConstraintsData():null);
            strategy.appendField(locator, this, "timeSeriesConstraintsData", buffer, theTimeSeriesConstraintsData, ((this.timeSeriesConstraintsData!= null)&&(!this.timeSeriesConstraintsData.isEmpty())));
        }
        return buffer;
    }

}
