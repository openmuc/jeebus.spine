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
 * <p>Java class for TimeTableListDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeTableListDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://docs.eebus.org/spine/xsd/v1}timeTableData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeTableListDataType", propOrder = {
    "timeTableData"
})
public class TimeTableListDataType implements Cloneable, CopyTo, ToString
{

    protected List<TimeTableDataType> timeTableData;

    /**
     * Default no-arg constructor
     * 
     */
    public TimeTableListDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public TimeTableListDataType(final List<TimeTableDataType> timeTableData) {
        this.timeTableData = timeTableData;
    }

    /**
     * Gets the value of the timeTableData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the timeTableData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimeTableData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimeTableDataType }
     * 
     * 
     */
    public List<TimeTableDataType> getTimeTableData() {
        if (timeTableData == null) {
            timeTableData = new ArrayList<TimeTableDataType>();
        }
        return this.timeTableData;
    }

    /**
     * Adds objects to the list of TimeTableData using add method
     * 
     * @param values
     *     objects to add to the list TimeTableData
     * @return
     *     The class instance
     */
    public TimeTableListDataType withTimeTableData(TimeTableDataType... values) {
        if (values!= null) {
            for (TimeTableDataType value: values) {
                getTimeTableData().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of TimeTableData using addAll method
     * 
     * @param values
     *     objects to add to the list TimeTableData
     * @return
     *     The class instance
     */
    public TimeTableListDataType withTimeTableData(Collection<TimeTableDataType> values) {
        if (values!= null) {
            getTimeTableData().addAll(values);
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
        if (draftCopy instanceof TimeTableListDataType) {
            final TimeTableListDataType copy = ((TimeTableListDataType) draftCopy);
            {
                Boolean timeTableDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.timeTableData!= null)&&(!this.timeTableData.isEmpty())));
                if (timeTableDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<TimeTableDataType> sourceTimeTableData;
                    sourceTimeTableData = (((this.timeTableData!= null)&&(!this.timeTableData.isEmpty()))?this.getTimeTableData():null);
                    @SuppressWarnings("unchecked")
                    List<TimeTableDataType> copyTimeTableData = ((List<TimeTableDataType> ) strategy.copy(LocatorUtils.property(locator, "timeTableData", sourceTimeTableData), sourceTimeTableData, ((this.timeTableData!= null)&&(!this.timeTableData.isEmpty()))));
                    copy.timeTableData = null;
                    if (copyTimeTableData!= null) {
                        List<TimeTableDataType> uniqueTimeTableDatal = copy.getTimeTableData();
                        uniqueTimeTableDatal.addAll(copyTimeTableData);
                    }
                } else {
                    if (timeTableDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.timeTableData = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new TimeTableListDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TimeTableListDataType that = ((TimeTableListDataType) object);
        {
            List<TimeTableDataType> leftTimeTableData;
            leftTimeTableData = (((this.timeTableData!= null)&&(!this.timeTableData.isEmpty()))?this.getTimeTableData():null);
            List<TimeTableDataType> rightTimeTableData;
            rightTimeTableData = (((that.timeTableData!= null)&&(!that.timeTableData.isEmpty()))?that.getTimeTableData():null);
            if ((this.timeTableData!= null)&&(!this.timeTableData.isEmpty())) {
                if ((that.timeTableData!= null)&&(!that.timeTableData.isEmpty())) {
                    if (!leftTimeTableData.equals(rightTimeTableData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.timeTableData!= null)&&(!that.timeTableData.isEmpty())) {
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
            List<TimeTableDataType> theTimeTableData;
            theTimeTableData = (((this.timeTableData!= null)&&(!this.timeTableData.isEmpty()))?this.getTimeTableData():null);
            if ((this.timeTableData!= null)&&(!this.timeTableData.isEmpty())) {
                currentHashCode += theTimeTableData.hashCode();
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
            List<TimeTableDataType> theTimeTableData;
            theTimeTableData = (((this.timeTableData!= null)&&(!this.timeTableData.isEmpty()))?this.getTimeTableData():null);
            strategy.appendField(locator, this, "timeTableData", buffer, theTimeTableData, ((this.timeTableData!= null)&&(!this.timeTableData.isEmpty())));
        }
        return buffer;
    }

}
