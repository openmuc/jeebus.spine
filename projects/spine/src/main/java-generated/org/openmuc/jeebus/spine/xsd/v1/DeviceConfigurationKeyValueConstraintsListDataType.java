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
 * <p>Java class for DeviceConfigurationKeyValueConstraintsListDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeviceConfigurationKeyValueConstraintsListDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://docs.eebus.org/spine/xsd/v1}deviceConfigurationKeyValueConstraintsData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceConfigurationKeyValueConstraintsListDataType", propOrder = {
    "deviceConfigurationKeyValueConstraintsData"
})
public class DeviceConfigurationKeyValueConstraintsListDataType implements Cloneable, CopyTo, ToString
{

    protected List<DeviceConfigurationKeyValueConstraintsDataType> deviceConfigurationKeyValueConstraintsData;

    /**
     * Default no-arg constructor
     * 
     */
    public DeviceConfigurationKeyValueConstraintsListDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public DeviceConfigurationKeyValueConstraintsListDataType(final List<DeviceConfigurationKeyValueConstraintsDataType> deviceConfigurationKeyValueConstraintsData) {
        this.deviceConfigurationKeyValueConstraintsData = deviceConfigurationKeyValueConstraintsData;
    }

    /**
     * Gets the value of the deviceConfigurationKeyValueConstraintsData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the deviceConfigurationKeyValueConstraintsData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeviceConfigurationKeyValueConstraintsData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeviceConfigurationKeyValueConstraintsDataType }
     * 
     * 
     */
    public List<DeviceConfigurationKeyValueConstraintsDataType> getDeviceConfigurationKeyValueConstraintsData() {
        if (deviceConfigurationKeyValueConstraintsData == null) {
            deviceConfigurationKeyValueConstraintsData = new ArrayList<DeviceConfigurationKeyValueConstraintsDataType>();
        }
        return this.deviceConfigurationKeyValueConstraintsData;
    }

    /**
     * Adds objects to the list of DeviceConfigurationKeyValueConstraintsData using add method
     * 
     * @param values
     *     objects to add to the list DeviceConfigurationKeyValueConstraintsData
     * @return
     *     The class instance
     */
    public DeviceConfigurationKeyValueConstraintsListDataType withDeviceConfigurationKeyValueConstraintsData(DeviceConfigurationKeyValueConstraintsDataType... values) {
        if (values!= null) {
            for (DeviceConfigurationKeyValueConstraintsDataType value: values) {
                getDeviceConfigurationKeyValueConstraintsData().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of DeviceConfigurationKeyValueConstraintsData using addAll method
     * 
     * @param values
     *     objects to add to the list DeviceConfigurationKeyValueConstraintsData
     * @return
     *     The class instance
     */
    public DeviceConfigurationKeyValueConstraintsListDataType withDeviceConfigurationKeyValueConstraintsData(Collection<DeviceConfigurationKeyValueConstraintsDataType> values) {
        if (values!= null) {
            getDeviceConfigurationKeyValueConstraintsData().addAll(values);
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
        if (draftCopy instanceof DeviceConfigurationKeyValueConstraintsListDataType) {
            final DeviceConfigurationKeyValueConstraintsListDataType copy = ((DeviceConfigurationKeyValueConstraintsListDataType) draftCopy);
            {
                Boolean deviceConfigurationKeyValueConstraintsDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.deviceConfigurationKeyValueConstraintsData!= null)&&(!this.deviceConfigurationKeyValueConstraintsData.isEmpty())));
                if (deviceConfigurationKeyValueConstraintsDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<DeviceConfigurationKeyValueConstraintsDataType> sourceDeviceConfigurationKeyValueConstraintsData;
                    sourceDeviceConfigurationKeyValueConstraintsData = (((this.deviceConfigurationKeyValueConstraintsData!= null)&&(!this.deviceConfigurationKeyValueConstraintsData.isEmpty()))?this.getDeviceConfigurationKeyValueConstraintsData():null);
                    @SuppressWarnings("unchecked")
                    List<DeviceConfigurationKeyValueConstraintsDataType> copyDeviceConfigurationKeyValueConstraintsData = ((List<DeviceConfigurationKeyValueConstraintsDataType> ) strategy.copy(LocatorUtils.property(locator, "deviceConfigurationKeyValueConstraintsData", sourceDeviceConfigurationKeyValueConstraintsData), sourceDeviceConfigurationKeyValueConstraintsData, ((this.deviceConfigurationKeyValueConstraintsData!= null)&&(!this.deviceConfigurationKeyValueConstraintsData.isEmpty()))));
                    copy.deviceConfigurationKeyValueConstraintsData = null;
                    if (copyDeviceConfigurationKeyValueConstraintsData!= null) {
                        List<DeviceConfigurationKeyValueConstraintsDataType> uniqueDeviceConfigurationKeyValueConstraintsDatal = copy.getDeviceConfigurationKeyValueConstraintsData();
                        uniqueDeviceConfigurationKeyValueConstraintsDatal.addAll(copyDeviceConfigurationKeyValueConstraintsData);
                    }
                } else {
                    if (deviceConfigurationKeyValueConstraintsDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.deviceConfigurationKeyValueConstraintsData = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new DeviceConfigurationKeyValueConstraintsListDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DeviceConfigurationKeyValueConstraintsListDataType that = ((DeviceConfigurationKeyValueConstraintsListDataType) object);
        {
            List<DeviceConfigurationKeyValueConstraintsDataType> leftDeviceConfigurationKeyValueConstraintsData;
            leftDeviceConfigurationKeyValueConstraintsData = (((this.deviceConfigurationKeyValueConstraintsData!= null)&&(!this.deviceConfigurationKeyValueConstraintsData.isEmpty()))?this.getDeviceConfigurationKeyValueConstraintsData():null);
            List<DeviceConfigurationKeyValueConstraintsDataType> rightDeviceConfigurationKeyValueConstraintsData;
            rightDeviceConfigurationKeyValueConstraintsData = (((that.deviceConfigurationKeyValueConstraintsData!= null)&&(!that.deviceConfigurationKeyValueConstraintsData.isEmpty()))?that.getDeviceConfigurationKeyValueConstraintsData():null);
            if ((this.deviceConfigurationKeyValueConstraintsData!= null)&&(!this.deviceConfigurationKeyValueConstraintsData.isEmpty())) {
                if ((that.deviceConfigurationKeyValueConstraintsData!= null)&&(!that.deviceConfigurationKeyValueConstraintsData.isEmpty())) {
                    if (!leftDeviceConfigurationKeyValueConstraintsData.equals(rightDeviceConfigurationKeyValueConstraintsData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.deviceConfigurationKeyValueConstraintsData!= null)&&(!that.deviceConfigurationKeyValueConstraintsData.isEmpty())) {
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
            List<DeviceConfigurationKeyValueConstraintsDataType> theDeviceConfigurationKeyValueConstraintsData;
            theDeviceConfigurationKeyValueConstraintsData = (((this.deviceConfigurationKeyValueConstraintsData!= null)&&(!this.deviceConfigurationKeyValueConstraintsData.isEmpty()))?this.getDeviceConfigurationKeyValueConstraintsData():null);
            if ((this.deviceConfigurationKeyValueConstraintsData!= null)&&(!this.deviceConfigurationKeyValueConstraintsData.isEmpty())) {
                currentHashCode += theDeviceConfigurationKeyValueConstraintsData.hashCode();
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
            List<DeviceConfigurationKeyValueConstraintsDataType> theDeviceConfigurationKeyValueConstraintsData;
            theDeviceConfigurationKeyValueConstraintsData = (((this.deviceConfigurationKeyValueConstraintsData!= null)&&(!this.deviceConfigurationKeyValueConstraintsData.isEmpty()))?this.getDeviceConfigurationKeyValueConstraintsData():null);
            strategy.appendField(locator, this, "deviceConfigurationKeyValueConstraintsData", buffer, theDeviceConfigurationKeyValueConstraintsData, ((this.deviceConfigurationKeyValueConstraintsData!= null)&&(!this.deviceConfigurationKeyValueConstraintsData.isEmpty())));
        }
        return buffer;
    }

}
