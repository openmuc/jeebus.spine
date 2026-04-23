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
 * <p>Java class for DeviceConfigurationKeyValueDescriptionListDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeviceConfigurationKeyValueDescriptionListDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://docs.eebus.org/spine/xsd/v1}deviceConfigurationKeyValueDescriptionData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceConfigurationKeyValueDescriptionListDataType", propOrder = {
    "deviceConfigurationKeyValueDescriptionData"
})
public class DeviceConfigurationKeyValueDescriptionListDataType implements Cloneable, CopyTo, ToString
{

    protected List<DeviceConfigurationKeyValueDescriptionDataType> deviceConfigurationKeyValueDescriptionData;

    /**
     * Default no-arg constructor
     * 
     */
    public DeviceConfigurationKeyValueDescriptionListDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public DeviceConfigurationKeyValueDescriptionListDataType(final List<DeviceConfigurationKeyValueDescriptionDataType> deviceConfigurationKeyValueDescriptionData) {
        this.deviceConfigurationKeyValueDescriptionData = deviceConfigurationKeyValueDescriptionData;
    }

    /**
     * Gets the value of the deviceConfigurationKeyValueDescriptionData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the deviceConfigurationKeyValueDescriptionData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeviceConfigurationKeyValueDescriptionData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeviceConfigurationKeyValueDescriptionDataType }
     * 
     * 
     */
    public List<DeviceConfigurationKeyValueDescriptionDataType> getDeviceConfigurationKeyValueDescriptionData() {
        if (deviceConfigurationKeyValueDescriptionData == null) {
            deviceConfigurationKeyValueDescriptionData = new ArrayList<DeviceConfigurationKeyValueDescriptionDataType>();
        }
        return this.deviceConfigurationKeyValueDescriptionData;
    }

    /**
     * Adds objects to the list of DeviceConfigurationKeyValueDescriptionData using add method
     * 
     * @param values
     *     objects to add to the list DeviceConfigurationKeyValueDescriptionData
     * @return
     *     The class instance
     */
    public DeviceConfigurationKeyValueDescriptionListDataType withDeviceConfigurationKeyValueDescriptionData(DeviceConfigurationKeyValueDescriptionDataType... values) {
        if (values!= null) {
            for (DeviceConfigurationKeyValueDescriptionDataType value: values) {
                getDeviceConfigurationKeyValueDescriptionData().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of DeviceConfigurationKeyValueDescriptionData using addAll method
     * 
     * @param values
     *     objects to add to the list DeviceConfigurationKeyValueDescriptionData
     * @return
     *     The class instance
     */
    public DeviceConfigurationKeyValueDescriptionListDataType withDeviceConfigurationKeyValueDescriptionData(Collection<DeviceConfigurationKeyValueDescriptionDataType> values) {
        if (values!= null) {
            getDeviceConfigurationKeyValueDescriptionData().addAll(values);
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
        if (draftCopy instanceof DeviceConfigurationKeyValueDescriptionListDataType) {
            final DeviceConfigurationKeyValueDescriptionListDataType copy = ((DeviceConfigurationKeyValueDescriptionListDataType) draftCopy);
            {
                Boolean deviceConfigurationKeyValueDescriptionDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.deviceConfigurationKeyValueDescriptionData!= null)&&(!this.deviceConfigurationKeyValueDescriptionData.isEmpty())));
                if (deviceConfigurationKeyValueDescriptionDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<DeviceConfigurationKeyValueDescriptionDataType> sourceDeviceConfigurationKeyValueDescriptionData;
                    sourceDeviceConfigurationKeyValueDescriptionData = (((this.deviceConfigurationKeyValueDescriptionData!= null)&&(!this.deviceConfigurationKeyValueDescriptionData.isEmpty()))?this.getDeviceConfigurationKeyValueDescriptionData():null);
                    @SuppressWarnings("unchecked")
                    List<DeviceConfigurationKeyValueDescriptionDataType> copyDeviceConfigurationKeyValueDescriptionData = ((List<DeviceConfigurationKeyValueDescriptionDataType> ) strategy.copy(LocatorUtils.property(locator, "deviceConfigurationKeyValueDescriptionData", sourceDeviceConfigurationKeyValueDescriptionData), sourceDeviceConfigurationKeyValueDescriptionData, ((this.deviceConfigurationKeyValueDescriptionData!= null)&&(!this.deviceConfigurationKeyValueDescriptionData.isEmpty()))));
                    copy.deviceConfigurationKeyValueDescriptionData = null;
                    if (copyDeviceConfigurationKeyValueDescriptionData!= null) {
                        List<DeviceConfigurationKeyValueDescriptionDataType> uniqueDeviceConfigurationKeyValueDescriptionDatal = copy.getDeviceConfigurationKeyValueDescriptionData();
                        uniqueDeviceConfigurationKeyValueDescriptionDatal.addAll(copyDeviceConfigurationKeyValueDescriptionData);
                    }
                } else {
                    if (deviceConfigurationKeyValueDescriptionDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.deviceConfigurationKeyValueDescriptionData = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new DeviceConfigurationKeyValueDescriptionListDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DeviceConfigurationKeyValueDescriptionListDataType that = ((DeviceConfigurationKeyValueDescriptionListDataType) object);
        {
            List<DeviceConfigurationKeyValueDescriptionDataType> leftDeviceConfigurationKeyValueDescriptionData;
            leftDeviceConfigurationKeyValueDescriptionData = (((this.deviceConfigurationKeyValueDescriptionData!= null)&&(!this.deviceConfigurationKeyValueDescriptionData.isEmpty()))?this.getDeviceConfigurationKeyValueDescriptionData():null);
            List<DeviceConfigurationKeyValueDescriptionDataType> rightDeviceConfigurationKeyValueDescriptionData;
            rightDeviceConfigurationKeyValueDescriptionData = (((that.deviceConfigurationKeyValueDescriptionData!= null)&&(!that.deviceConfigurationKeyValueDescriptionData.isEmpty()))?that.getDeviceConfigurationKeyValueDescriptionData():null);
            if ((this.deviceConfigurationKeyValueDescriptionData!= null)&&(!this.deviceConfigurationKeyValueDescriptionData.isEmpty())) {
                if ((that.deviceConfigurationKeyValueDescriptionData!= null)&&(!that.deviceConfigurationKeyValueDescriptionData.isEmpty())) {
                    if (!leftDeviceConfigurationKeyValueDescriptionData.equals(rightDeviceConfigurationKeyValueDescriptionData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.deviceConfigurationKeyValueDescriptionData!= null)&&(!that.deviceConfigurationKeyValueDescriptionData.isEmpty())) {
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
            List<DeviceConfigurationKeyValueDescriptionDataType> theDeviceConfigurationKeyValueDescriptionData;
            theDeviceConfigurationKeyValueDescriptionData = (((this.deviceConfigurationKeyValueDescriptionData!= null)&&(!this.deviceConfigurationKeyValueDescriptionData.isEmpty()))?this.getDeviceConfigurationKeyValueDescriptionData():null);
            if ((this.deviceConfigurationKeyValueDescriptionData!= null)&&(!this.deviceConfigurationKeyValueDescriptionData.isEmpty())) {
                currentHashCode += theDeviceConfigurationKeyValueDescriptionData.hashCode();
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
            List<DeviceConfigurationKeyValueDescriptionDataType> theDeviceConfigurationKeyValueDescriptionData;
            theDeviceConfigurationKeyValueDescriptionData = (((this.deviceConfigurationKeyValueDescriptionData!= null)&&(!this.deviceConfigurationKeyValueDescriptionData.isEmpty()))?this.getDeviceConfigurationKeyValueDescriptionData():null);
            strategy.appendField(locator, this, "deviceConfigurationKeyValueDescriptionData", buffer, theDeviceConfigurationKeyValueDescriptionData, ((this.deviceConfigurationKeyValueDescriptionData!= null)&&(!this.deviceConfigurationKeyValueDescriptionData.isEmpty())));
        }
        return buffer;
    }

}
