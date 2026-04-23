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
 * <p>Java class for DeviceConfigurationKeyValueListDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeviceConfigurationKeyValueListDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://docs.eebus.org/spine/xsd/v1}deviceConfigurationKeyValueData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceConfigurationKeyValueListDataType", propOrder = {
    "deviceConfigurationKeyValueData"
})
public class DeviceConfigurationKeyValueListDataType implements Cloneable, CopyTo, ToString
{

    protected List<DeviceConfigurationKeyValueDataType> deviceConfigurationKeyValueData;

    /**
     * Default no-arg constructor
     * 
     */
    public DeviceConfigurationKeyValueListDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public DeviceConfigurationKeyValueListDataType(final List<DeviceConfigurationKeyValueDataType> deviceConfigurationKeyValueData) {
        this.deviceConfigurationKeyValueData = deviceConfigurationKeyValueData;
    }

    /**
     * Gets the value of the deviceConfigurationKeyValueData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the deviceConfigurationKeyValueData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeviceConfigurationKeyValueData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeviceConfigurationKeyValueDataType }
     * 
     * 
     */
    public List<DeviceConfigurationKeyValueDataType> getDeviceConfigurationKeyValueData() {
        if (deviceConfigurationKeyValueData == null) {
            deviceConfigurationKeyValueData = new ArrayList<DeviceConfigurationKeyValueDataType>();
        }
        return this.deviceConfigurationKeyValueData;
    }

    /**
     * Adds objects to the list of DeviceConfigurationKeyValueData using add method
     * 
     * @param values
     *     objects to add to the list DeviceConfigurationKeyValueData
     * @return
     *     The class instance
     */
    public DeviceConfigurationKeyValueListDataType withDeviceConfigurationKeyValueData(DeviceConfigurationKeyValueDataType... values) {
        if (values!= null) {
            for (DeviceConfigurationKeyValueDataType value: values) {
                getDeviceConfigurationKeyValueData().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of DeviceConfigurationKeyValueData using addAll method
     * 
     * @param values
     *     objects to add to the list DeviceConfigurationKeyValueData
     * @return
     *     The class instance
     */
    public DeviceConfigurationKeyValueListDataType withDeviceConfigurationKeyValueData(Collection<DeviceConfigurationKeyValueDataType> values) {
        if (values!= null) {
            getDeviceConfigurationKeyValueData().addAll(values);
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
        if (draftCopy instanceof DeviceConfigurationKeyValueListDataType) {
            final DeviceConfigurationKeyValueListDataType copy = ((DeviceConfigurationKeyValueListDataType) draftCopy);
            {
                Boolean deviceConfigurationKeyValueDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.deviceConfigurationKeyValueData!= null)&&(!this.deviceConfigurationKeyValueData.isEmpty())));
                if (deviceConfigurationKeyValueDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<DeviceConfigurationKeyValueDataType> sourceDeviceConfigurationKeyValueData;
                    sourceDeviceConfigurationKeyValueData = (((this.deviceConfigurationKeyValueData!= null)&&(!this.deviceConfigurationKeyValueData.isEmpty()))?this.getDeviceConfigurationKeyValueData():null);
                    @SuppressWarnings("unchecked")
                    List<DeviceConfigurationKeyValueDataType> copyDeviceConfigurationKeyValueData = ((List<DeviceConfigurationKeyValueDataType> ) strategy.copy(LocatorUtils.property(locator, "deviceConfigurationKeyValueData", sourceDeviceConfigurationKeyValueData), sourceDeviceConfigurationKeyValueData, ((this.deviceConfigurationKeyValueData!= null)&&(!this.deviceConfigurationKeyValueData.isEmpty()))));
                    copy.deviceConfigurationKeyValueData = null;
                    if (copyDeviceConfigurationKeyValueData!= null) {
                        List<DeviceConfigurationKeyValueDataType> uniqueDeviceConfigurationKeyValueDatal = copy.getDeviceConfigurationKeyValueData();
                        uniqueDeviceConfigurationKeyValueDatal.addAll(copyDeviceConfigurationKeyValueData);
                    }
                } else {
                    if (deviceConfigurationKeyValueDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.deviceConfigurationKeyValueData = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new DeviceConfigurationKeyValueListDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DeviceConfigurationKeyValueListDataType that = ((DeviceConfigurationKeyValueListDataType) object);
        {
            List<DeviceConfigurationKeyValueDataType> leftDeviceConfigurationKeyValueData;
            leftDeviceConfigurationKeyValueData = (((this.deviceConfigurationKeyValueData!= null)&&(!this.deviceConfigurationKeyValueData.isEmpty()))?this.getDeviceConfigurationKeyValueData():null);
            List<DeviceConfigurationKeyValueDataType> rightDeviceConfigurationKeyValueData;
            rightDeviceConfigurationKeyValueData = (((that.deviceConfigurationKeyValueData!= null)&&(!that.deviceConfigurationKeyValueData.isEmpty()))?that.getDeviceConfigurationKeyValueData():null);
            if ((this.deviceConfigurationKeyValueData!= null)&&(!this.deviceConfigurationKeyValueData.isEmpty())) {
                if ((that.deviceConfigurationKeyValueData!= null)&&(!that.deviceConfigurationKeyValueData.isEmpty())) {
                    if (!leftDeviceConfigurationKeyValueData.equals(rightDeviceConfigurationKeyValueData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.deviceConfigurationKeyValueData!= null)&&(!that.deviceConfigurationKeyValueData.isEmpty())) {
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
            List<DeviceConfigurationKeyValueDataType> theDeviceConfigurationKeyValueData;
            theDeviceConfigurationKeyValueData = (((this.deviceConfigurationKeyValueData!= null)&&(!this.deviceConfigurationKeyValueData.isEmpty()))?this.getDeviceConfigurationKeyValueData():null);
            if ((this.deviceConfigurationKeyValueData!= null)&&(!this.deviceConfigurationKeyValueData.isEmpty())) {
                currentHashCode += theDeviceConfigurationKeyValueData.hashCode();
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
            List<DeviceConfigurationKeyValueDataType> theDeviceConfigurationKeyValueData;
            theDeviceConfigurationKeyValueData = (((this.deviceConfigurationKeyValueData!= null)&&(!this.deviceConfigurationKeyValueData.isEmpty()))?this.getDeviceConfigurationKeyValueData():null);
            strategy.appendField(locator, this, "deviceConfigurationKeyValueData", buffer, theDeviceConfigurationKeyValueData, ((this.deviceConfigurationKeyValueData!= null)&&(!this.deviceConfigurationKeyValueData.isEmpty())));
        }
        return buffer;
    }

}
