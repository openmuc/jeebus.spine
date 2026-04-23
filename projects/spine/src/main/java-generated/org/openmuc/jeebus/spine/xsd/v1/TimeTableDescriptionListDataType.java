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
 * <p>Java class for TimeTableDescriptionListDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeTableDescriptionListDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://docs.eebus.org/spine/xsd/v1}timeTableDescriptionData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeTableDescriptionListDataType", propOrder = {
    "timeTableDescriptionData"
})
public class TimeTableDescriptionListDataType implements Cloneable, CopyTo, ToString
{

    protected List<TimeTableDescriptionDataType> timeTableDescriptionData;

    /**
     * Default no-arg constructor
     * 
     */
    public TimeTableDescriptionListDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public TimeTableDescriptionListDataType(final List<TimeTableDescriptionDataType> timeTableDescriptionData) {
        this.timeTableDescriptionData = timeTableDescriptionData;
    }

    /**
     * Gets the value of the timeTableDescriptionData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the timeTableDescriptionData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimeTableDescriptionData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimeTableDescriptionDataType }
     * 
     * 
     */
    public List<TimeTableDescriptionDataType> getTimeTableDescriptionData() {
        if (timeTableDescriptionData == null) {
            timeTableDescriptionData = new ArrayList<TimeTableDescriptionDataType>();
        }
        return this.timeTableDescriptionData;
    }

    /**
     * Adds objects to the list of TimeTableDescriptionData using add method
     * 
     * @param values
     *     objects to add to the list TimeTableDescriptionData
     * @return
     *     The class instance
     */
    public TimeTableDescriptionListDataType withTimeTableDescriptionData(TimeTableDescriptionDataType... values) {
        if (values!= null) {
            for (TimeTableDescriptionDataType value: values) {
                getTimeTableDescriptionData().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of TimeTableDescriptionData using addAll method
     * 
     * @param values
     *     objects to add to the list TimeTableDescriptionData
     * @return
     *     The class instance
     */
    public TimeTableDescriptionListDataType withTimeTableDescriptionData(Collection<TimeTableDescriptionDataType> values) {
        if (values!= null) {
            getTimeTableDescriptionData().addAll(values);
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
        if (draftCopy instanceof TimeTableDescriptionListDataType) {
            final TimeTableDescriptionListDataType copy = ((TimeTableDescriptionListDataType) draftCopy);
            {
                Boolean timeTableDescriptionDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.timeTableDescriptionData!= null)&&(!this.timeTableDescriptionData.isEmpty())));
                if (timeTableDescriptionDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<TimeTableDescriptionDataType> sourceTimeTableDescriptionData;
                    sourceTimeTableDescriptionData = (((this.timeTableDescriptionData!= null)&&(!this.timeTableDescriptionData.isEmpty()))?this.getTimeTableDescriptionData():null);
                    @SuppressWarnings("unchecked")
                    List<TimeTableDescriptionDataType> copyTimeTableDescriptionData = ((List<TimeTableDescriptionDataType> ) strategy.copy(LocatorUtils.property(locator, "timeTableDescriptionData", sourceTimeTableDescriptionData), sourceTimeTableDescriptionData, ((this.timeTableDescriptionData!= null)&&(!this.timeTableDescriptionData.isEmpty()))));
                    copy.timeTableDescriptionData = null;
                    if (copyTimeTableDescriptionData!= null) {
                        List<TimeTableDescriptionDataType> uniqueTimeTableDescriptionDatal = copy.getTimeTableDescriptionData();
                        uniqueTimeTableDescriptionDatal.addAll(copyTimeTableDescriptionData);
                    }
                } else {
                    if (timeTableDescriptionDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.timeTableDescriptionData = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new TimeTableDescriptionListDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TimeTableDescriptionListDataType that = ((TimeTableDescriptionListDataType) object);
        {
            List<TimeTableDescriptionDataType> leftTimeTableDescriptionData;
            leftTimeTableDescriptionData = (((this.timeTableDescriptionData!= null)&&(!this.timeTableDescriptionData.isEmpty()))?this.getTimeTableDescriptionData():null);
            List<TimeTableDescriptionDataType> rightTimeTableDescriptionData;
            rightTimeTableDescriptionData = (((that.timeTableDescriptionData!= null)&&(!that.timeTableDescriptionData.isEmpty()))?that.getTimeTableDescriptionData():null);
            if ((this.timeTableDescriptionData!= null)&&(!this.timeTableDescriptionData.isEmpty())) {
                if ((that.timeTableDescriptionData!= null)&&(!that.timeTableDescriptionData.isEmpty())) {
                    if (!leftTimeTableDescriptionData.equals(rightTimeTableDescriptionData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.timeTableDescriptionData!= null)&&(!that.timeTableDescriptionData.isEmpty())) {
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
            List<TimeTableDescriptionDataType> theTimeTableDescriptionData;
            theTimeTableDescriptionData = (((this.timeTableDescriptionData!= null)&&(!this.timeTableDescriptionData.isEmpty()))?this.getTimeTableDescriptionData():null);
            if ((this.timeTableDescriptionData!= null)&&(!this.timeTableDescriptionData.isEmpty())) {
                currentHashCode += theTimeTableDescriptionData.hashCode();
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
            List<TimeTableDescriptionDataType> theTimeTableDescriptionData;
            theTimeTableDescriptionData = (((this.timeTableDescriptionData!= null)&&(!this.timeTableDescriptionData.isEmpty()))?this.getTimeTableDescriptionData():null);
            strategy.appendField(locator, this, "timeTableDescriptionData", buffer, theTimeTableDescriptionData, ((this.timeTableDescriptionData!= null)&&(!this.timeTableDescriptionData.isEmpty())));
        }
        return buffer;
    }

}
