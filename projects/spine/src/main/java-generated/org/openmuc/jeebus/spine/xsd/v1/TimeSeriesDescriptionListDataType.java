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
 * <p>Java class for TimeSeriesDescriptionListDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeSeriesDescriptionListDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://docs.eebus.org/spine/xsd/v1}timeSeriesDescriptionData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeSeriesDescriptionListDataType", propOrder = {
    "timeSeriesDescriptionData"
})
public class TimeSeriesDescriptionListDataType implements Cloneable, CopyTo, ToString
{

    protected List<TimeSeriesDescriptionDataType> timeSeriesDescriptionData;

    /**
     * Default no-arg constructor
     * 
     */
    public TimeSeriesDescriptionListDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public TimeSeriesDescriptionListDataType(final List<TimeSeriesDescriptionDataType> timeSeriesDescriptionData) {
        this.timeSeriesDescriptionData = timeSeriesDescriptionData;
    }

    /**
     * Gets the value of the timeSeriesDescriptionData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the timeSeriesDescriptionData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimeSeriesDescriptionData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimeSeriesDescriptionDataType }
     * 
     * 
     */
    public List<TimeSeriesDescriptionDataType> getTimeSeriesDescriptionData() {
        if (timeSeriesDescriptionData == null) {
            timeSeriesDescriptionData = new ArrayList<TimeSeriesDescriptionDataType>();
        }
        return this.timeSeriesDescriptionData;
    }

    /**
     * Adds objects to the list of TimeSeriesDescriptionData using add method
     * 
     * @param values
     *     objects to add to the list TimeSeriesDescriptionData
     * @return
     *     The class instance
     */
    public TimeSeriesDescriptionListDataType withTimeSeriesDescriptionData(TimeSeriesDescriptionDataType... values) {
        if (values!= null) {
            for (TimeSeriesDescriptionDataType value: values) {
                getTimeSeriesDescriptionData().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of TimeSeriesDescriptionData using addAll method
     * 
     * @param values
     *     objects to add to the list TimeSeriesDescriptionData
     * @return
     *     The class instance
     */
    public TimeSeriesDescriptionListDataType withTimeSeriesDescriptionData(Collection<TimeSeriesDescriptionDataType> values) {
        if (values!= null) {
            getTimeSeriesDescriptionData().addAll(values);
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
        if (draftCopy instanceof TimeSeriesDescriptionListDataType) {
            final TimeSeriesDescriptionListDataType copy = ((TimeSeriesDescriptionListDataType) draftCopy);
            {
                Boolean timeSeriesDescriptionDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.timeSeriesDescriptionData!= null)&&(!this.timeSeriesDescriptionData.isEmpty())));
                if (timeSeriesDescriptionDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<TimeSeriesDescriptionDataType> sourceTimeSeriesDescriptionData;
                    sourceTimeSeriesDescriptionData = (((this.timeSeriesDescriptionData!= null)&&(!this.timeSeriesDescriptionData.isEmpty()))?this.getTimeSeriesDescriptionData():null);
                    @SuppressWarnings("unchecked")
                    List<TimeSeriesDescriptionDataType> copyTimeSeriesDescriptionData = ((List<TimeSeriesDescriptionDataType> ) strategy.copy(LocatorUtils.property(locator, "timeSeriesDescriptionData", sourceTimeSeriesDescriptionData), sourceTimeSeriesDescriptionData, ((this.timeSeriesDescriptionData!= null)&&(!this.timeSeriesDescriptionData.isEmpty()))));
                    copy.timeSeriesDescriptionData = null;
                    if (copyTimeSeriesDescriptionData!= null) {
                        List<TimeSeriesDescriptionDataType> uniqueTimeSeriesDescriptionDatal = copy.getTimeSeriesDescriptionData();
                        uniqueTimeSeriesDescriptionDatal.addAll(copyTimeSeriesDescriptionData);
                    }
                } else {
                    if (timeSeriesDescriptionDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.timeSeriesDescriptionData = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new TimeSeriesDescriptionListDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TimeSeriesDescriptionListDataType that = ((TimeSeriesDescriptionListDataType) object);
        {
            List<TimeSeriesDescriptionDataType> leftTimeSeriesDescriptionData;
            leftTimeSeriesDescriptionData = (((this.timeSeriesDescriptionData!= null)&&(!this.timeSeriesDescriptionData.isEmpty()))?this.getTimeSeriesDescriptionData():null);
            List<TimeSeriesDescriptionDataType> rightTimeSeriesDescriptionData;
            rightTimeSeriesDescriptionData = (((that.timeSeriesDescriptionData!= null)&&(!that.timeSeriesDescriptionData.isEmpty()))?that.getTimeSeriesDescriptionData():null);
            if ((this.timeSeriesDescriptionData!= null)&&(!this.timeSeriesDescriptionData.isEmpty())) {
                if ((that.timeSeriesDescriptionData!= null)&&(!that.timeSeriesDescriptionData.isEmpty())) {
                    if (!leftTimeSeriesDescriptionData.equals(rightTimeSeriesDescriptionData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.timeSeriesDescriptionData!= null)&&(!that.timeSeriesDescriptionData.isEmpty())) {
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
            List<TimeSeriesDescriptionDataType> theTimeSeriesDescriptionData;
            theTimeSeriesDescriptionData = (((this.timeSeriesDescriptionData!= null)&&(!this.timeSeriesDescriptionData.isEmpty()))?this.getTimeSeriesDescriptionData():null);
            if ((this.timeSeriesDescriptionData!= null)&&(!this.timeSeriesDescriptionData.isEmpty())) {
                currentHashCode += theTimeSeriesDescriptionData.hashCode();
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
            List<TimeSeriesDescriptionDataType> theTimeSeriesDescriptionData;
            theTimeSeriesDescriptionData = (((this.timeSeriesDescriptionData!= null)&&(!this.timeSeriesDescriptionData.isEmpty()))?this.getTimeSeriesDescriptionData():null);
            strategy.appendField(locator, this, "timeSeriesDescriptionData", buffer, theTimeSeriesDescriptionData, ((this.timeSeriesDescriptionData!= null)&&(!this.timeSeriesDescriptionData.isEmpty())));
        }
        return buffer;
    }

}
