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
 * <p>Java class for TaskManagementJobRelationListDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaskManagementJobRelationListDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://docs.eebus.org/spine/xsd/v1}taskManagementJobRelationData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaskManagementJobRelationListDataType", propOrder = {
    "taskManagementJobRelationData"
})
public class TaskManagementJobRelationListDataType implements Cloneable, CopyTo, ToString
{

    protected List<TaskManagementJobRelationDataType> taskManagementJobRelationData;

    /**
     * Default no-arg constructor
     * 
     */
    public TaskManagementJobRelationListDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public TaskManagementJobRelationListDataType(final List<TaskManagementJobRelationDataType> taskManagementJobRelationData) {
        this.taskManagementJobRelationData = taskManagementJobRelationData;
    }

    /**
     * Gets the value of the taskManagementJobRelationData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the taskManagementJobRelationData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaskManagementJobRelationData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaskManagementJobRelationDataType }
     * 
     * 
     */
    public List<TaskManagementJobRelationDataType> getTaskManagementJobRelationData() {
        if (taskManagementJobRelationData == null) {
            taskManagementJobRelationData = new ArrayList<TaskManagementJobRelationDataType>();
        }
        return this.taskManagementJobRelationData;
    }

    /**
     * Adds objects to the list of TaskManagementJobRelationData using add method
     * 
     * @param values
     *     objects to add to the list TaskManagementJobRelationData
     * @return
     *     The class instance
     */
    public TaskManagementJobRelationListDataType withTaskManagementJobRelationData(TaskManagementJobRelationDataType... values) {
        if (values!= null) {
            for (TaskManagementJobRelationDataType value: values) {
                getTaskManagementJobRelationData().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of TaskManagementJobRelationData using addAll method
     * 
     * @param values
     *     objects to add to the list TaskManagementJobRelationData
     * @return
     *     The class instance
     */
    public TaskManagementJobRelationListDataType withTaskManagementJobRelationData(Collection<TaskManagementJobRelationDataType> values) {
        if (values!= null) {
            getTaskManagementJobRelationData().addAll(values);
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
        if (draftCopy instanceof TaskManagementJobRelationListDataType) {
            final TaskManagementJobRelationListDataType copy = ((TaskManagementJobRelationListDataType) draftCopy);
            {
                Boolean taskManagementJobRelationDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.taskManagementJobRelationData!= null)&&(!this.taskManagementJobRelationData.isEmpty())));
                if (taskManagementJobRelationDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<TaskManagementJobRelationDataType> sourceTaskManagementJobRelationData;
                    sourceTaskManagementJobRelationData = (((this.taskManagementJobRelationData!= null)&&(!this.taskManagementJobRelationData.isEmpty()))?this.getTaskManagementJobRelationData():null);
                    @SuppressWarnings("unchecked")
                    List<TaskManagementJobRelationDataType> copyTaskManagementJobRelationData = ((List<TaskManagementJobRelationDataType> ) strategy.copy(LocatorUtils.property(locator, "taskManagementJobRelationData", sourceTaskManagementJobRelationData), sourceTaskManagementJobRelationData, ((this.taskManagementJobRelationData!= null)&&(!this.taskManagementJobRelationData.isEmpty()))));
                    copy.taskManagementJobRelationData = null;
                    if (copyTaskManagementJobRelationData!= null) {
                        List<TaskManagementJobRelationDataType> uniqueTaskManagementJobRelationDatal = copy.getTaskManagementJobRelationData();
                        uniqueTaskManagementJobRelationDatal.addAll(copyTaskManagementJobRelationData);
                    }
                } else {
                    if (taskManagementJobRelationDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.taskManagementJobRelationData = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new TaskManagementJobRelationListDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TaskManagementJobRelationListDataType that = ((TaskManagementJobRelationListDataType) object);
        {
            List<TaskManagementJobRelationDataType> leftTaskManagementJobRelationData;
            leftTaskManagementJobRelationData = (((this.taskManagementJobRelationData!= null)&&(!this.taskManagementJobRelationData.isEmpty()))?this.getTaskManagementJobRelationData():null);
            List<TaskManagementJobRelationDataType> rightTaskManagementJobRelationData;
            rightTaskManagementJobRelationData = (((that.taskManagementJobRelationData!= null)&&(!that.taskManagementJobRelationData.isEmpty()))?that.getTaskManagementJobRelationData():null);
            if ((this.taskManagementJobRelationData!= null)&&(!this.taskManagementJobRelationData.isEmpty())) {
                if ((that.taskManagementJobRelationData!= null)&&(!that.taskManagementJobRelationData.isEmpty())) {
                    if (!leftTaskManagementJobRelationData.equals(rightTaskManagementJobRelationData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.taskManagementJobRelationData!= null)&&(!that.taskManagementJobRelationData.isEmpty())) {
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
            List<TaskManagementJobRelationDataType> theTaskManagementJobRelationData;
            theTaskManagementJobRelationData = (((this.taskManagementJobRelationData!= null)&&(!this.taskManagementJobRelationData.isEmpty()))?this.getTaskManagementJobRelationData():null);
            if ((this.taskManagementJobRelationData!= null)&&(!this.taskManagementJobRelationData.isEmpty())) {
                currentHashCode += theTaskManagementJobRelationData.hashCode();
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
            List<TaskManagementJobRelationDataType> theTaskManagementJobRelationData;
            theTaskManagementJobRelationData = (((this.taskManagementJobRelationData!= null)&&(!this.taskManagementJobRelationData.isEmpty()))?this.getTaskManagementJobRelationData():null);
            strategy.appendField(locator, this, "taskManagementJobRelationData", buffer, theTaskManagementJobRelationData, ((this.taskManagementJobRelationData!= null)&&(!this.taskManagementJobRelationData.isEmpty())));
        }
        return buffer;
    }

}
