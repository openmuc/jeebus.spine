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
 * <p>Java class for TaskManagementJobListDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaskManagementJobListDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://docs.eebus.org/spine/xsd/v1}taskManagementJobData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaskManagementJobListDataType", propOrder = {
    "taskManagementJobData"
})
public class TaskManagementJobListDataType implements Cloneable, CopyTo, ToString
{

    protected List<TaskManagementJobDataType> taskManagementJobData;

    /**
     * Default no-arg constructor
     * 
     */
    public TaskManagementJobListDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public TaskManagementJobListDataType(final List<TaskManagementJobDataType> taskManagementJobData) {
        this.taskManagementJobData = taskManagementJobData;
    }

    /**
     * Gets the value of the taskManagementJobData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the taskManagementJobData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaskManagementJobData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaskManagementJobDataType }
     * 
     * 
     */
    public List<TaskManagementJobDataType> getTaskManagementJobData() {
        if (taskManagementJobData == null) {
            taskManagementJobData = new ArrayList<TaskManagementJobDataType>();
        }
        return this.taskManagementJobData;
    }

    /**
     * Adds objects to the list of TaskManagementJobData using add method
     * 
     * @param values
     *     objects to add to the list TaskManagementJobData
     * @return
     *     The class instance
     */
    public TaskManagementJobListDataType withTaskManagementJobData(TaskManagementJobDataType... values) {
        if (values!= null) {
            for (TaskManagementJobDataType value: values) {
                getTaskManagementJobData().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of TaskManagementJobData using addAll method
     * 
     * @param values
     *     objects to add to the list TaskManagementJobData
     * @return
     *     The class instance
     */
    public TaskManagementJobListDataType withTaskManagementJobData(Collection<TaskManagementJobDataType> values) {
        if (values!= null) {
            getTaskManagementJobData().addAll(values);
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
        if (draftCopy instanceof TaskManagementJobListDataType) {
            final TaskManagementJobListDataType copy = ((TaskManagementJobListDataType) draftCopy);
            {
                Boolean taskManagementJobDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.taskManagementJobData!= null)&&(!this.taskManagementJobData.isEmpty())));
                if (taskManagementJobDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<TaskManagementJobDataType> sourceTaskManagementJobData;
                    sourceTaskManagementJobData = (((this.taskManagementJobData!= null)&&(!this.taskManagementJobData.isEmpty()))?this.getTaskManagementJobData():null);
                    @SuppressWarnings("unchecked")
                    List<TaskManagementJobDataType> copyTaskManagementJobData = ((List<TaskManagementJobDataType> ) strategy.copy(LocatorUtils.property(locator, "taskManagementJobData", sourceTaskManagementJobData), sourceTaskManagementJobData, ((this.taskManagementJobData!= null)&&(!this.taskManagementJobData.isEmpty()))));
                    copy.taskManagementJobData = null;
                    if (copyTaskManagementJobData!= null) {
                        List<TaskManagementJobDataType> uniqueTaskManagementJobDatal = copy.getTaskManagementJobData();
                        uniqueTaskManagementJobDatal.addAll(copyTaskManagementJobData);
                    }
                } else {
                    if (taskManagementJobDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.taskManagementJobData = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new TaskManagementJobListDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TaskManagementJobListDataType that = ((TaskManagementJobListDataType) object);
        {
            List<TaskManagementJobDataType> leftTaskManagementJobData;
            leftTaskManagementJobData = (((this.taskManagementJobData!= null)&&(!this.taskManagementJobData.isEmpty()))?this.getTaskManagementJobData():null);
            List<TaskManagementJobDataType> rightTaskManagementJobData;
            rightTaskManagementJobData = (((that.taskManagementJobData!= null)&&(!that.taskManagementJobData.isEmpty()))?that.getTaskManagementJobData():null);
            if ((this.taskManagementJobData!= null)&&(!this.taskManagementJobData.isEmpty())) {
                if ((that.taskManagementJobData!= null)&&(!that.taskManagementJobData.isEmpty())) {
                    if (!leftTaskManagementJobData.equals(rightTaskManagementJobData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.taskManagementJobData!= null)&&(!that.taskManagementJobData.isEmpty())) {
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
            List<TaskManagementJobDataType> theTaskManagementJobData;
            theTaskManagementJobData = (((this.taskManagementJobData!= null)&&(!this.taskManagementJobData.isEmpty()))?this.getTaskManagementJobData():null);
            if ((this.taskManagementJobData!= null)&&(!this.taskManagementJobData.isEmpty())) {
                currentHashCode += theTaskManagementJobData.hashCode();
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
            List<TaskManagementJobDataType> theTaskManagementJobData;
            theTaskManagementJobData = (((this.taskManagementJobData!= null)&&(!this.taskManagementJobData.isEmpty()))?this.getTaskManagementJobData():null);
            strategy.appendField(locator, this, "taskManagementJobData", buffer, theTaskManagementJobData, ((this.taskManagementJobData!= null)&&(!this.taskManagementJobData.isEmpty())));
        }
        return buffer;
    }

}
