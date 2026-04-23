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
 * <p>Java class for NetworkManagementDeviceDescriptionListDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NetworkManagementDeviceDescriptionListDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://docs.eebus.org/spine/xsd/v1}networkManagementDeviceDescriptionData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkManagementDeviceDescriptionListDataType", propOrder = {
    "networkManagementDeviceDescriptionData"
})
public class NetworkManagementDeviceDescriptionListDataType implements Cloneable, CopyTo, ToString
{

    protected List<NetworkManagementDeviceDescriptionDataType> networkManagementDeviceDescriptionData;

    /**
     * Default no-arg constructor
     * 
     */
    public NetworkManagementDeviceDescriptionListDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public NetworkManagementDeviceDescriptionListDataType(final List<NetworkManagementDeviceDescriptionDataType> networkManagementDeviceDescriptionData) {
        this.networkManagementDeviceDescriptionData = networkManagementDeviceDescriptionData;
    }

    /**
     * Gets the value of the networkManagementDeviceDescriptionData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the networkManagementDeviceDescriptionData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNetworkManagementDeviceDescriptionData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NetworkManagementDeviceDescriptionDataType }
     * 
     * 
     */
    public List<NetworkManagementDeviceDescriptionDataType> getNetworkManagementDeviceDescriptionData() {
        if (networkManagementDeviceDescriptionData == null) {
            networkManagementDeviceDescriptionData = new ArrayList<NetworkManagementDeviceDescriptionDataType>();
        }
        return this.networkManagementDeviceDescriptionData;
    }

    /**
     * Adds objects to the list of NetworkManagementDeviceDescriptionData using add method
     * 
     * @param values
     *     objects to add to the list NetworkManagementDeviceDescriptionData
     * @return
     *     The class instance
     */
    public NetworkManagementDeviceDescriptionListDataType withNetworkManagementDeviceDescriptionData(NetworkManagementDeviceDescriptionDataType... values) {
        if (values!= null) {
            for (NetworkManagementDeviceDescriptionDataType value: values) {
                getNetworkManagementDeviceDescriptionData().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of NetworkManagementDeviceDescriptionData using addAll method
     * 
     * @param values
     *     objects to add to the list NetworkManagementDeviceDescriptionData
     * @return
     *     The class instance
     */
    public NetworkManagementDeviceDescriptionListDataType withNetworkManagementDeviceDescriptionData(Collection<NetworkManagementDeviceDescriptionDataType> values) {
        if (values!= null) {
            getNetworkManagementDeviceDescriptionData().addAll(values);
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
        if (draftCopy instanceof NetworkManagementDeviceDescriptionListDataType) {
            final NetworkManagementDeviceDescriptionListDataType copy = ((NetworkManagementDeviceDescriptionListDataType) draftCopy);
            {
                Boolean networkManagementDeviceDescriptionDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.networkManagementDeviceDescriptionData!= null)&&(!this.networkManagementDeviceDescriptionData.isEmpty())));
                if (networkManagementDeviceDescriptionDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<NetworkManagementDeviceDescriptionDataType> sourceNetworkManagementDeviceDescriptionData;
                    sourceNetworkManagementDeviceDescriptionData = (((this.networkManagementDeviceDescriptionData!= null)&&(!this.networkManagementDeviceDescriptionData.isEmpty()))?this.getNetworkManagementDeviceDescriptionData():null);
                    @SuppressWarnings("unchecked")
                    List<NetworkManagementDeviceDescriptionDataType> copyNetworkManagementDeviceDescriptionData = ((List<NetworkManagementDeviceDescriptionDataType> ) strategy.copy(LocatorUtils.property(locator, "networkManagementDeviceDescriptionData", sourceNetworkManagementDeviceDescriptionData), sourceNetworkManagementDeviceDescriptionData, ((this.networkManagementDeviceDescriptionData!= null)&&(!this.networkManagementDeviceDescriptionData.isEmpty()))));
                    copy.networkManagementDeviceDescriptionData = null;
                    if (copyNetworkManagementDeviceDescriptionData!= null) {
                        List<NetworkManagementDeviceDescriptionDataType> uniqueNetworkManagementDeviceDescriptionDatal = copy.getNetworkManagementDeviceDescriptionData();
                        uniqueNetworkManagementDeviceDescriptionDatal.addAll(copyNetworkManagementDeviceDescriptionData);
                    }
                } else {
                    if (networkManagementDeviceDescriptionDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.networkManagementDeviceDescriptionData = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new NetworkManagementDeviceDescriptionListDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final NetworkManagementDeviceDescriptionListDataType that = ((NetworkManagementDeviceDescriptionListDataType) object);
        {
            List<NetworkManagementDeviceDescriptionDataType> leftNetworkManagementDeviceDescriptionData;
            leftNetworkManagementDeviceDescriptionData = (((this.networkManagementDeviceDescriptionData!= null)&&(!this.networkManagementDeviceDescriptionData.isEmpty()))?this.getNetworkManagementDeviceDescriptionData():null);
            List<NetworkManagementDeviceDescriptionDataType> rightNetworkManagementDeviceDescriptionData;
            rightNetworkManagementDeviceDescriptionData = (((that.networkManagementDeviceDescriptionData!= null)&&(!that.networkManagementDeviceDescriptionData.isEmpty()))?that.getNetworkManagementDeviceDescriptionData():null);
            if ((this.networkManagementDeviceDescriptionData!= null)&&(!this.networkManagementDeviceDescriptionData.isEmpty())) {
                if ((that.networkManagementDeviceDescriptionData!= null)&&(!that.networkManagementDeviceDescriptionData.isEmpty())) {
                    if (!leftNetworkManagementDeviceDescriptionData.equals(rightNetworkManagementDeviceDescriptionData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.networkManagementDeviceDescriptionData!= null)&&(!that.networkManagementDeviceDescriptionData.isEmpty())) {
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
            List<NetworkManagementDeviceDescriptionDataType> theNetworkManagementDeviceDescriptionData;
            theNetworkManagementDeviceDescriptionData = (((this.networkManagementDeviceDescriptionData!= null)&&(!this.networkManagementDeviceDescriptionData.isEmpty()))?this.getNetworkManagementDeviceDescriptionData():null);
            if ((this.networkManagementDeviceDescriptionData!= null)&&(!this.networkManagementDeviceDescriptionData.isEmpty())) {
                currentHashCode += theNetworkManagementDeviceDescriptionData.hashCode();
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
            List<NetworkManagementDeviceDescriptionDataType> theNetworkManagementDeviceDescriptionData;
            theNetworkManagementDeviceDescriptionData = (((this.networkManagementDeviceDescriptionData!= null)&&(!this.networkManagementDeviceDescriptionData.isEmpty()))?this.getNetworkManagementDeviceDescriptionData():null);
            strategy.appendField(locator, this, "networkManagementDeviceDescriptionData", buffer, theNetworkManagementDeviceDescriptionData, ((this.networkManagementDeviceDescriptionData!= null)&&(!this.networkManagementDeviceDescriptionData.isEmpty())));
        }
        return buffer;
    }

}
