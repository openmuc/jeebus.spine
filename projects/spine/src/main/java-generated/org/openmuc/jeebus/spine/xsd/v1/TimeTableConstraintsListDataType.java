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
 * <p>Java class for TimeTableConstraintsListDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeTableConstraintsListDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://docs.eebus.org/spine/xsd/v1}timeTableConstraintsData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeTableConstraintsListDataType", propOrder = {
    "timeTableConstraintsData"
})
public class TimeTableConstraintsListDataType implements Cloneable, CopyTo, ToString
{

    protected List<TimeTableConstraintsDataType> timeTableConstraintsData;

    /**
     * Default no-arg constructor
     * 
     */
    public TimeTableConstraintsListDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public TimeTableConstraintsListDataType(final List<TimeTableConstraintsDataType> timeTableConstraintsData) {
        this.timeTableConstraintsData = timeTableConstraintsData;
    }

    /**
     * Gets the value of the timeTableConstraintsData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the timeTableConstraintsData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimeTableConstraintsData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimeTableConstraintsDataType }
     * 
     * 
     */
    public List<TimeTableConstraintsDataType> getTimeTableConstraintsData() {
        if (timeTableConstraintsData == null) {
            timeTableConstraintsData = new ArrayList<TimeTableConstraintsDataType>();
        }
        return this.timeTableConstraintsData;
    }

    /**
     * Adds objects to the list of TimeTableConstraintsData using add method
     * 
     * @param values
     *     objects to add to the list TimeTableConstraintsData
     * @return
     *     The class instance
     */
    public TimeTableConstraintsListDataType withTimeTableConstraintsData(TimeTableConstraintsDataType... values) {
        if (values!= null) {
            for (TimeTableConstraintsDataType value: values) {
                getTimeTableConstraintsData().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of TimeTableConstraintsData using addAll method
     * 
     * @param values
     *     objects to add to the list TimeTableConstraintsData
     * @return
     *     The class instance
     */
    public TimeTableConstraintsListDataType withTimeTableConstraintsData(Collection<TimeTableConstraintsDataType> values) {
        if (values!= null) {
            getTimeTableConstraintsData().addAll(values);
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
        if (draftCopy instanceof TimeTableConstraintsListDataType) {
            final TimeTableConstraintsListDataType copy = ((TimeTableConstraintsListDataType) draftCopy);
            {
                Boolean timeTableConstraintsDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.timeTableConstraintsData!= null)&&(!this.timeTableConstraintsData.isEmpty())));
                if (timeTableConstraintsDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<TimeTableConstraintsDataType> sourceTimeTableConstraintsData;
                    sourceTimeTableConstraintsData = (((this.timeTableConstraintsData!= null)&&(!this.timeTableConstraintsData.isEmpty()))?this.getTimeTableConstraintsData():null);
                    @SuppressWarnings("unchecked")
                    List<TimeTableConstraintsDataType> copyTimeTableConstraintsData = ((List<TimeTableConstraintsDataType> ) strategy.copy(LocatorUtils.property(locator, "timeTableConstraintsData", sourceTimeTableConstraintsData), sourceTimeTableConstraintsData, ((this.timeTableConstraintsData!= null)&&(!this.timeTableConstraintsData.isEmpty()))));
                    copy.timeTableConstraintsData = null;
                    if (copyTimeTableConstraintsData!= null) {
                        List<TimeTableConstraintsDataType> uniqueTimeTableConstraintsDatal = copy.getTimeTableConstraintsData();
                        uniqueTimeTableConstraintsDatal.addAll(copyTimeTableConstraintsData);
                    }
                } else {
                    if (timeTableConstraintsDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.timeTableConstraintsData = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new TimeTableConstraintsListDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TimeTableConstraintsListDataType that = ((TimeTableConstraintsListDataType) object);
        {
            List<TimeTableConstraintsDataType> leftTimeTableConstraintsData;
            leftTimeTableConstraintsData = (((this.timeTableConstraintsData!= null)&&(!this.timeTableConstraintsData.isEmpty()))?this.getTimeTableConstraintsData():null);
            List<TimeTableConstraintsDataType> rightTimeTableConstraintsData;
            rightTimeTableConstraintsData = (((that.timeTableConstraintsData!= null)&&(!that.timeTableConstraintsData.isEmpty()))?that.getTimeTableConstraintsData():null);
            if ((this.timeTableConstraintsData!= null)&&(!this.timeTableConstraintsData.isEmpty())) {
                if ((that.timeTableConstraintsData!= null)&&(!that.timeTableConstraintsData.isEmpty())) {
                    if (!leftTimeTableConstraintsData.equals(rightTimeTableConstraintsData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.timeTableConstraintsData!= null)&&(!that.timeTableConstraintsData.isEmpty())) {
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
            List<TimeTableConstraintsDataType> theTimeTableConstraintsData;
            theTimeTableConstraintsData = (((this.timeTableConstraintsData!= null)&&(!this.timeTableConstraintsData.isEmpty()))?this.getTimeTableConstraintsData():null);
            if ((this.timeTableConstraintsData!= null)&&(!this.timeTableConstraintsData.isEmpty())) {
                currentHashCode += theTimeTableConstraintsData.hashCode();
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
            List<TimeTableConstraintsDataType> theTimeTableConstraintsData;
            theTimeTableConstraintsData = (((this.timeTableConstraintsData!= null)&&(!this.timeTableConstraintsData.isEmpty()))?this.getTimeTableConstraintsData():null);
            strategy.appendField(locator, this, "timeTableConstraintsData", buffer, theTimeTableConstraintsData, ((this.timeTableConstraintsData!= null)&&(!this.timeTableConstraintsData.isEmpty())));
        }
        return buffer;
    }

}
