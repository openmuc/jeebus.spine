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
 * <p>Java class for NetworkManagementFeatureDescriptionListDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NetworkManagementFeatureDescriptionListDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://docs.eebus.org/spine/xsd/v1}networkManagementFeatureDescriptionData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkManagementFeatureDescriptionListDataType", propOrder = {
    "networkManagementFeatureDescriptionData"
})
public class NetworkManagementFeatureDescriptionListDataType implements Cloneable, CopyTo, ToString
{

    protected List<NetworkManagementFeatureDescriptionDataType> networkManagementFeatureDescriptionData;

    /**
     * Default no-arg constructor
     * 
     */
    public NetworkManagementFeatureDescriptionListDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public NetworkManagementFeatureDescriptionListDataType(final List<NetworkManagementFeatureDescriptionDataType> networkManagementFeatureDescriptionData) {
        this.networkManagementFeatureDescriptionData = networkManagementFeatureDescriptionData;
    }

    /**
     * Gets the value of the networkManagementFeatureDescriptionData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the networkManagementFeatureDescriptionData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNetworkManagementFeatureDescriptionData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NetworkManagementFeatureDescriptionDataType }
     * 
     * 
     */
    public List<NetworkManagementFeatureDescriptionDataType> getNetworkManagementFeatureDescriptionData() {
        if (networkManagementFeatureDescriptionData == null) {
            networkManagementFeatureDescriptionData = new ArrayList<NetworkManagementFeatureDescriptionDataType>();
        }
        return this.networkManagementFeatureDescriptionData;
    }

    /**
     * Adds objects to the list of NetworkManagementFeatureDescriptionData using add method
     * 
     * @param values
     *     objects to add to the list NetworkManagementFeatureDescriptionData
     * @return
     *     The class instance
     */
    public NetworkManagementFeatureDescriptionListDataType withNetworkManagementFeatureDescriptionData(NetworkManagementFeatureDescriptionDataType... values) {
        if (values!= null) {
            for (NetworkManagementFeatureDescriptionDataType value: values) {
                getNetworkManagementFeatureDescriptionData().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of NetworkManagementFeatureDescriptionData using addAll method
     * 
     * @param values
     *     objects to add to the list NetworkManagementFeatureDescriptionData
     * @return
     *     The class instance
     */
    public NetworkManagementFeatureDescriptionListDataType withNetworkManagementFeatureDescriptionData(Collection<NetworkManagementFeatureDescriptionDataType> values) {
        if (values!= null) {
            getNetworkManagementFeatureDescriptionData().addAll(values);
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
        if (draftCopy instanceof NetworkManagementFeatureDescriptionListDataType) {
            final NetworkManagementFeatureDescriptionListDataType copy = ((NetworkManagementFeatureDescriptionListDataType) draftCopy);
            {
                Boolean networkManagementFeatureDescriptionDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.networkManagementFeatureDescriptionData!= null)&&(!this.networkManagementFeatureDescriptionData.isEmpty())));
                if (networkManagementFeatureDescriptionDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<NetworkManagementFeatureDescriptionDataType> sourceNetworkManagementFeatureDescriptionData;
                    sourceNetworkManagementFeatureDescriptionData = (((this.networkManagementFeatureDescriptionData!= null)&&(!this.networkManagementFeatureDescriptionData.isEmpty()))?this.getNetworkManagementFeatureDescriptionData():null);
                    @SuppressWarnings("unchecked")
                    List<NetworkManagementFeatureDescriptionDataType> copyNetworkManagementFeatureDescriptionData = ((List<NetworkManagementFeatureDescriptionDataType> ) strategy.copy(LocatorUtils.property(locator, "networkManagementFeatureDescriptionData", sourceNetworkManagementFeatureDescriptionData), sourceNetworkManagementFeatureDescriptionData, ((this.networkManagementFeatureDescriptionData!= null)&&(!this.networkManagementFeatureDescriptionData.isEmpty()))));
                    copy.networkManagementFeatureDescriptionData = null;
                    if (copyNetworkManagementFeatureDescriptionData!= null) {
                        List<NetworkManagementFeatureDescriptionDataType> uniqueNetworkManagementFeatureDescriptionDatal = copy.getNetworkManagementFeatureDescriptionData();
                        uniqueNetworkManagementFeatureDescriptionDatal.addAll(copyNetworkManagementFeatureDescriptionData);
                    }
                } else {
                    if (networkManagementFeatureDescriptionDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.networkManagementFeatureDescriptionData = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new NetworkManagementFeatureDescriptionListDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final NetworkManagementFeatureDescriptionListDataType that = ((NetworkManagementFeatureDescriptionListDataType) object);
        {
            List<NetworkManagementFeatureDescriptionDataType> leftNetworkManagementFeatureDescriptionData;
            leftNetworkManagementFeatureDescriptionData = (((this.networkManagementFeatureDescriptionData!= null)&&(!this.networkManagementFeatureDescriptionData.isEmpty()))?this.getNetworkManagementFeatureDescriptionData():null);
            List<NetworkManagementFeatureDescriptionDataType> rightNetworkManagementFeatureDescriptionData;
            rightNetworkManagementFeatureDescriptionData = (((that.networkManagementFeatureDescriptionData!= null)&&(!that.networkManagementFeatureDescriptionData.isEmpty()))?that.getNetworkManagementFeatureDescriptionData():null);
            if ((this.networkManagementFeatureDescriptionData!= null)&&(!this.networkManagementFeatureDescriptionData.isEmpty())) {
                if ((that.networkManagementFeatureDescriptionData!= null)&&(!that.networkManagementFeatureDescriptionData.isEmpty())) {
                    if (!leftNetworkManagementFeatureDescriptionData.equals(rightNetworkManagementFeatureDescriptionData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.networkManagementFeatureDescriptionData!= null)&&(!that.networkManagementFeatureDescriptionData.isEmpty())) {
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
            List<NetworkManagementFeatureDescriptionDataType> theNetworkManagementFeatureDescriptionData;
            theNetworkManagementFeatureDescriptionData = (((this.networkManagementFeatureDescriptionData!= null)&&(!this.networkManagementFeatureDescriptionData.isEmpty()))?this.getNetworkManagementFeatureDescriptionData():null);
            if ((this.networkManagementFeatureDescriptionData!= null)&&(!this.networkManagementFeatureDescriptionData.isEmpty())) {
                currentHashCode += theNetworkManagementFeatureDescriptionData.hashCode();
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
            List<NetworkManagementFeatureDescriptionDataType> theNetworkManagementFeatureDescriptionData;
            theNetworkManagementFeatureDescriptionData = (((this.networkManagementFeatureDescriptionData!= null)&&(!this.networkManagementFeatureDescriptionData.isEmpty()))?this.getNetworkManagementFeatureDescriptionData():null);
            strategy.appendField(locator, this, "networkManagementFeatureDescriptionData", buffer, theNetworkManagementFeatureDescriptionData, ((this.networkManagementFeatureDescriptionData!= null)&&(!this.networkManagementFeatureDescriptionData.isEmpty())));
        }
        return buffer;
    }

}
