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
 * <p>Java class for TimeSeriesListDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeSeriesListDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://docs.eebus.org/spine/xsd/v1}timeSeriesData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeSeriesListDataType", propOrder = {
    "timeSeriesData"
})
public class TimeSeriesListDataType implements Cloneable, CopyTo, ToString
{

    protected List<TimeSeriesDataType> timeSeriesData;

    /**
     * Default no-arg constructor
     * 
     */
    public TimeSeriesListDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public TimeSeriesListDataType(final List<TimeSeriesDataType> timeSeriesData) {
        this.timeSeriesData = timeSeriesData;
    }

    /**
     * Gets the value of the timeSeriesData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the timeSeriesData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimeSeriesData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimeSeriesDataType }
     * 
     * 
     */
    public List<TimeSeriesDataType> getTimeSeriesData() {
        if (timeSeriesData == null) {
            timeSeriesData = new ArrayList<TimeSeriesDataType>();
        }
        return this.timeSeriesData;
    }

    /**
     * Adds objects to the list of TimeSeriesData using add method
     * 
     * @param values
     *     objects to add to the list TimeSeriesData
     * @return
     *     The class instance
     */
    public TimeSeriesListDataType withTimeSeriesData(TimeSeriesDataType... values) {
        if (values!= null) {
            for (TimeSeriesDataType value: values) {
                getTimeSeriesData().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of TimeSeriesData using addAll method
     * 
     * @param values
     *     objects to add to the list TimeSeriesData
     * @return
     *     The class instance
     */
    public TimeSeriesListDataType withTimeSeriesData(Collection<TimeSeriesDataType> values) {
        if (values!= null) {
            getTimeSeriesData().addAll(values);
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
        if (draftCopy instanceof TimeSeriesListDataType) {
            final TimeSeriesListDataType copy = ((TimeSeriesListDataType) draftCopy);
            {
                Boolean timeSeriesDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.timeSeriesData!= null)&&(!this.timeSeriesData.isEmpty())));
                if (timeSeriesDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<TimeSeriesDataType> sourceTimeSeriesData;
                    sourceTimeSeriesData = (((this.timeSeriesData!= null)&&(!this.timeSeriesData.isEmpty()))?this.getTimeSeriesData():null);
                    @SuppressWarnings("unchecked")
                    List<TimeSeriesDataType> copyTimeSeriesData = ((List<TimeSeriesDataType> ) strategy.copy(LocatorUtils.property(locator, "timeSeriesData", sourceTimeSeriesData), sourceTimeSeriesData, ((this.timeSeriesData!= null)&&(!this.timeSeriesData.isEmpty()))));
                    copy.timeSeriesData = null;
                    if (copyTimeSeriesData!= null) {
                        List<TimeSeriesDataType> uniqueTimeSeriesDatal = copy.getTimeSeriesData();
                        uniqueTimeSeriesDatal.addAll(copyTimeSeriesData);
                    }
                } else {
                    if (timeSeriesDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.timeSeriesData = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new TimeSeriesListDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TimeSeriesListDataType that = ((TimeSeriesListDataType) object);
        {
            List<TimeSeriesDataType> leftTimeSeriesData;
            leftTimeSeriesData = (((this.timeSeriesData!= null)&&(!this.timeSeriesData.isEmpty()))?this.getTimeSeriesData():null);
            List<TimeSeriesDataType> rightTimeSeriesData;
            rightTimeSeriesData = (((that.timeSeriesData!= null)&&(!that.timeSeriesData.isEmpty()))?that.getTimeSeriesData():null);
            if ((this.timeSeriesData!= null)&&(!this.timeSeriesData.isEmpty())) {
                if ((that.timeSeriesData!= null)&&(!that.timeSeriesData.isEmpty())) {
                    if (!leftTimeSeriesData.equals(rightTimeSeriesData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.timeSeriesData!= null)&&(!that.timeSeriesData.isEmpty())) {
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
            List<TimeSeriesDataType> theTimeSeriesData;
            theTimeSeriesData = (((this.timeSeriesData!= null)&&(!this.timeSeriesData.isEmpty()))?this.getTimeSeriesData():null);
            if ((this.timeSeriesData!= null)&&(!this.timeSeriesData.isEmpty())) {
                currentHashCode += theTimeSeriesData.hashCode();
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
            List<TimeSeriesDataType> theTimeSeriesData;
            theTimeSeriesData = (((this.timeSeriesData!= null)&&(!this.timeSeriesData.isEmpty()))?this.getTimeSeriesData():null);
            strategy.appendField(locator, this, "timeSeriesData", buffer, theTimeSeriesData, ((this.timeSeriesData!= null)&&(!this.timeSeriesData.isEmpty())));
        }
        return buffer;
    }

}
