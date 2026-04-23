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
 * <p>Java class for AlarmListDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlarmListDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://docs.eebus.org/spine/xsd/v1}alarmData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlarmListDataType", propOrder = {
    "alarmData"
})
public class AlarmListDataType implements Cloneable, CopyTo, ToString
{

    protected List<AlarmDataType> alarmData;

    /**
     * Default no-arg constructor
     * 
     */
    public AlarmListDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public AlarmListDataType(final List<AlarmDataType> alarmData) {
        this.alarmData = alarmData;
    }

    /**
     * Gets the value of the alarmData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the alarmData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlarmData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlarmDataType }
     * 
     * 
     */
    public List<AlarmDataType> getAlarmData() {
        if (alarmData == null) {
            alarmData = new ArrayList<AlarmDataType>();
        }
        return this.alarmData;
    }

    /**
     * Adds objects to the list of AlarmData using add method
     * 
     * @param values
     *     objects to add to the list AlarmData
     * @return
     *     The class instance
     */
    public AlarmListDataType withAlarmData(AlarmDataType... values) {
        if (values!= null) {
            for (AlarmDataType value: values) {
                getAlarmData().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of AlarmData using addAll method
     * 
     * @param values
     *     objects to add to the list AlarmData
     * @return
     *     The class instance
     */
    public AlarmListDataType withAlarmData(Collection<AlarmDataType> values) {
        if (values!= null) {
            getAlarmData().addAll(values);
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
        if (draftCopy instanceof AlarmListDataType) {
            final AlarmListDataType copy = ((AlarmListDataType) draftCopy);
            {
                Boolean alarmDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.alarmData!= null)&&(!this.alarmData.isEmpty())));
                if (alarmDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<AlarmDataType> sourceAlarmData;
                    sourceAlarmData = (((this.alarmData!= null)&&(!this.alarmData.isEmpty()))?this.getAlarmData():null);
                    @SuppressWarnings("unchecked")
                    List<AlarmDataType> copyAlarmData = ((List<AlarmDataType> ) strategy.copy(LocatorUtils.property(locator, "alarmData", sourceAlarmData), sourceAlarmData, ((this.alarmData!= null)&&(!this.alarmData.isEmpty()))));
                    copy.alarmData = null;
                    if (copyAlarmData!= null) {
                        List<AlarmDataType> uniqueAlarmDatal = copy.getAlarmData();
                        uniqueAlarmDatal.addAll(copyAlarmData);
                    }
                } else {
                    if (alarmDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.alarmData = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new AlarmListDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final AlarmListDataType that = ((AlarmListDataType) object);
        {
            List<AlarmDataType> leftAlarmData;
            leftAlarmData = (((this.alarmData!= null)&&(!this.alarmData.isEmpty()))?this.getAlarmData():null);
            List<AlarmDataType> rightAlarmData;
            rightAlarmData = (((that.alarmData!= null)&&(!that.alarmData.isEmpty()))?that.getAlarmData():null);
            if ((this.alarmData!= null)&&(!this.alarmData.isEmpty())) {
                if ((that.alarmData!= null)&&(!that.alarmData.isEmpty())) {
                    if (!leftAlarmData.equals(rightAlarmData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.alarmData!= null)&&(!that.alarmData.isEmpty())) {
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
            List<AlarmDataType> theAlarmData;
            theAlarmData = (((this.alarmData!= null)&&(!this.alarmData.isEmpty()))?this.getAlarmData():null);
            if ((this.alarmData!= null)&&(!this.alarmData.isEmpty())) {
                currentHashCode += theAlarmData.hashCode();
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
            List<AlarmDataType> theAlarmData;
            theAlarmData = (((this.alarmData!= null)&&(!this.alarmData.isEmpty()))?this.getAlarmData():null);
            strategy.appendField(locator, this, "alarmData", buffer, theAlarmData, ((this.alarmData!= null)&&(!this.alarmData.isEmpty())));
        }
        return buffer;
    }

}
