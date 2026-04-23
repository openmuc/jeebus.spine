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
 * <p>Java class for TaskManagementJobDescriptionListDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaskManagementJobDescriptionListDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://docs.eebus.org/spine/xsd/v1}taskManagementJobDescriptionData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaskManagementJobDescriptionListDataType", propOrder = {
    "taskManagementJobDescriptionData"
})
public class TaskManagementJobDescriptionListDataType implements Cloneable, CopyTo, ToString
{

    protected List<TaskManagementJobDescriptionDataType> taskManagementJobDescriptionData;

    /**
     * Default no-arg constructor
     * 
     */
    public TaskManagementJobDescriptionListDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public TaskManagementJobDescriptionListDataType(final List<TaskManagementJobDescriptionDataType> taskManagementJobDescriptionData) {
        this.taskManagementJobDescriptionData = taskManagementJobDescriptionData;
    }

    /**
     * Gets the value of the taskManagementJobDescriptionData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the taskManagementJobDescriptionData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaskManagementJobDescriptionData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaskManagementJobDescriptionDataType }
     * 
     * 
     */
    public List<TaskManagementJobDescriptionDataType> getTaskManagementJobDescriptionData() {
        if (taskManagementJobDescriptionData == null) {
            taskManagementJobDescriptionData = new ArrayList<TaskManagementJobDescriptionDataType>();
        }
        return this.taskManagementJobDescriptionData;
    }

    /**
     * Adds objects to the list of TaskManagementJobDescriptionData using add method
     * 
     * @param values
     *     objects to add to the list TaskManagementJobDescriptionData
     * @return
     *     The class instance
     */
    public TaskManagementJobDescriptionListDataType withTaskManagementJobDescriptionData(TaskManagementJobDescriptionDataType... values) {
        if (values!= null) {
            for (TaskManagementJobDescriptionDataType value: values) {
                getTaskManagementJobDescriptionData().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of TaskManagementJobDescriptionData using addAll method
     * 
     * @param values
     *     objects to add to the list TaskManagementJobDescriptionData
     * @return
     *     The class instance
     */
    public TaskManagementJobDescriptionListDataType withTaskManagementJobDescriptionData(Collection<TaskManagementJobDescriptionDataType> values) {
        if (values!= null) {
            getTaskManagementJobDescriptionData().addAll(values);
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
        if (draftCopy instanceof TaskManagementJobDescriptionListDataType) {
            final TaskManagementJobDescriptionListDataType copy = ((TaskManagementJobDescriptionListDataType) draftCopy);
            {
                Boolean taskManagementJobDescriptionDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.taskManagementJobDescriptionData!= null)&&(!this.taskManagementJobDescriptionData.isEmpty())));
                if (taskManagementJobDescriptionDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<TaskManagementJobDescriptionDataType> sourceTaskManagementJobDescriptionData;
                    sourceTaskManagementJobDescriptionData = (((this.taskManagementJobDescriptionData!= null)&&(!this.taskManagementJobDescriptionData.isEmpty()))?this.getTaskManagementJobDescriptionData():null);
                    @SuppressWarnings("unchecked")
                    List<TaskManagementJobDescriptionDataType> copyTaskManagementJobDescriptionData = ((List<TaskManagementJobDescriptionDataType> ) strategy.copy(LocatorUtils.property(locator, "taskManagementJobDescriptionData", sourceTaskManagementJobDescriptionData), sourceTaskManagementJobDescriptionData, ((this.taskManagementJobDescriptionData!= null)&&(!this.taskManagementJobDescriptionData.isEmpty()))));
                    copy.taskManagementJobDescriptionData = null;
                    if (copyTaskManagementJobDescriptionData!= null) {
                        List<TaskManagementJobDescriptionDataType> uniqueTaskManagementJobDescriptionDatal = copy.getTaskManagementJobDescriptionData();
                        uniqueTaskManagementJobDescriptionDatal.addAll(copyTaskManagementJobDescriptionData);
                    }
                } else {
                    if (taskManagementJobDescriptionDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.taskManagementJobDescriptionData = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new TaskManagementJobDescriptionListDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TaskManagementJobDescriptionListDataType that = ((TaskManagementJobDescriptionListDataType) object);
        {
            List<TaskManagementJobDescriptionDataType> leftTaskManagementJobDescriptionData;
            leftTaskManagementJobDescriptionData = (((this.taskManagementJobDescriptionData!= null)&&(!this.taskManagementJobDescriptionData.isEmpty()))?this.getTaskManagementJobDescriptionData():null);
            List<TaskManagementJobDescriptionDataType> rightTaskManagementJobDescriptionData;
            rightTaskManagementJobDescriptionData = (((that.taskManagementJobDescriptionData!= null)&&(!that.taskManagementJobDescriptionData.isEmpty()))?that.getTaskManagementJobDescriptionData():null);
            if ((this.taskManagementJobDescriptionData!= null)&&(!this.taskManagementJobDescriptionData.isEmpty())) {
                if ((that.taskManagementJobDescriptionData!= null)&&(!that.taskManagementJobDescriptionData.isEmpty())) {
                    if (!leftTaskManagementJobDescriptionData.equals(rightTaskManagementJobDescriptionData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.taskManagementJobDescriptionData!= null)&&(!that.taskManagementJobDescriptionData.isEmpty())) {
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
            List<TaskManagementJobDescriptionDataType> theTaskManagementJobDescriptionData;
            theTaskManagementJobDescriptionData = (((this.taskManagementJobDescriptionData!= null)&&(!this.taskManagementJobDescriptionData.isEmpty()))?this.getTaskManagementJobDescriptionData():null);
            if ((this.taskManagementJobDescriptionData!= null)&&(!this.taskManagementJobDescriptionData.isEmpty())) {
                currentHashCode += theTaskManagementJobDescriptionData.hashCode();
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
            List<TaskManagementJobDescriptionDataType> theTaskManagementJobDescriptionData;
            theTaskManagementJobDescriptionData = (((this.taskManagementJobDescriptionData!= null)&&(!this.taskManagementJobDescriptionData.isEmpty()))?this.getTaskManagementJobDescriptionData():null);
            strategy.appendField(locator, this, "taskManagementJobDescriptionData", buffer, theTaskManagementJobDescriptionData, ((this.taskManagementJobDescriptionData!= null)&&(!this.taskManagementJobDescriptionData.isEmpty())));
        }
        return buffer;
    }

}
