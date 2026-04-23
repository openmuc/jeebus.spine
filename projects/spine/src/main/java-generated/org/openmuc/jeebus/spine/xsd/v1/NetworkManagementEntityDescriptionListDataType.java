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
 * <p>Java class for NetworkManagementEntityDescriptionListDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NetworkManagementEntityDescriptionListDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://docs.eebus.org/spine/xsd/v1}networkManagementEntityDescriptionData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkManagementEntityDescriptionListDataType", propOrder = {
    "networkManagementEntityDescriptionData"
})
public class NetworkManagementEntityDescriptionListDataType implements Cloneable, CopyTo, ToString
{

    protected List<NetworkManagementEntityDescriptionDataType> networkManagementEntityDescriptionData;

    /**
     * Default no-arg constructor
     * 
     */
    public NetworkManagementEntityDescriptionListDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public NetworkManagementEntityDescriptionListDataType(final List<NetworkManagementEntityDescriptionDataType> networkManagementEntityDescriptionData) {
        this.networkManagementEntityDescriptionData = networkManagementEntityDescriptionData;
    }

    /**
     * Gets the value of the networkManagementEntityDescriptionData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the networkManagementEntityDescriptionData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNetworkManagementEntityDescriptionData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NetworkManagementEntityDescriptionDataType }
     * 
     * 
     */
    public List<NetworkManagementEntityDescriptionDataType> getNetworkManagementEntityDescriptionData() {
        if (networkManagementEntityDescriptionData == null) {
            networkManagementEntityDescriptionData = new ArrayList<NetworkManagementEntityDescriptionDataType>();
        }
        return this.networkManagementEntityDescriptionData;
    }

    /**
     * Adds objects to the list of NetworkManagementEntityDescriptionData using add method
     * 
     * @param values
     *     objects to add to the list NetworkManagementEntityDescriptionData
     * @return
     *     The class instance
     */
    public NetworkManagementEntityDescriptionListDataType withNetworkManagementEntityDescriptionData(NetworkManagementEntityDescriptionDataType... values) {
        if (values!= null) {
            for (NetworkManagementEntityDescriptionDataType value: values) {
                getNetworkManagementEntityDescriptionData().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of NetworkManagementEntityDescriptionData using addAll method
     * 
     * @param values
     *     objects to add to the list NetworkManagementEntityDescriptionData
     * @return
     *     The class instance
     */
    public NetworkManagementEntityDescriptionListDataType withNetworkManagementEntityDescriptionData(Collection<NetworkManagementEntityDescriptionDataType> values) {
        if (values!= null) {
            getNetworkManagementEntityDescriptionData().addAll(values);
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
        if (draftCopy instanceof NetworkManagementEntityDescriptionListDataType) {
            final NetworkManagementEntityDescriptionListDataType copy = ((NetworkManagementEntityDescriptionListDataType) draftCopy);
            {
                Boolean networkManagementEntityDescriptionDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.networkManagementEntityDescriptionData!= null)&&(!this.networkManagementEntityDescriptionData.isEmpty())));
                if (networkManagementEntityDescriptionDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<NetworkManagementEntityDescriptionDataType> sourceNetworkManagementEntityDescriptionData;
                    sourceNetworkManagementEntityDescriptionData = (((this.networkManagementEntityDescriptionData!= null)&&(!this.networkManagementEntityDescriptionData.isEmpty()))?this.getNetworkManagementEntityDescriptionData():null);
                    @SuppressWarnings("unchecked")
                    List<NetworkManagementEntityDescriptionDataType> copyNetworkManagementEntityDescriptionData = ((List<NetworkManagementEntityDescriptionDataType> ) strategy.copy(LocatorUtils.property(locator, "networkManagementEntityDescriptionData", sourceNetworkManagementEntityDescriptionData), sourceNetworkManagementEntityDescriptionData, ((this.networkManagementEntityDescriptionData!= null)&&(!this.networkManagementEntityDescriptionData.isEmpty()))));
                    copy.networkManagementEntityDescriptionData = null;
                    if (copyNetworkManagementEntityDescriptionData!= null) {
                        List<NetworkManagementEntityDescriptionDataType> uniqueNetworkManagementEntityDescriptionDatal = copy.getNetworkManagementEntityDescriptionData();
                        uniqueNetworkManagementEntityDescriptionDatal.addAll(copyNetworkManagementEntityDescriptionData);
                    }
                } else {
                    if (networkManagementEntityDescriptionDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.networkManagementEntityDescriptionData = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new NetworkManagementEntityDescriptionListDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final NetworkManagementEntityDescriptionListDataType that = ((NetworkManagementEntityDescriptionListDataType) object);
        {
            List<NetworkManagementEntityDescriptionDataType> leftNetworkManagementEntityDescriptionData;
            leftNetworkManagementEntityDescriptionData = (((this.networkManagementEntityDescriptionData!= null)&&(!this.networkManagementEntityDescriptionData.isEmpty()))?this.getNetworkManagementEntityDescriptionData():null);
            List<NetworkManagementEntityDescriptionDataType> rightNetworkManagementEntityDescriptionData;
            rightNetworkManagementEntityDescriptionData = (((that.networkManagementEntityDescriptionData!= null)&&(!that.networkManagementEntityDescriptionData.isEmpty()))?that.getNetworkManagementEntityDescriptionData():null);
            if ((this.networkManagementEntityDescriptionData!= null)&&(!this.networkManagementEntityDescriptionData.isEmpty())) {
                if ((that.networkManagementEntityDescriptionData!= null)&&(!that.networkManagementEntityDescriptionData.isEmpty())) {
                    if (!leftNetworkManagementEntityDescriptionData.equals(rightNetworkManagementEntityDescriptionData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.networkManagementEntityDescriptionData!= null)&&(!that.networkManagementEntityDescriptionData.isEmpty())) {
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
            List<NetworkManagementEntityDescriptionDataType> theNetworkManagementEntityDescriptionData;
            theNetworkManagementEntityDescriptionData = (((this.networkManagementEntityDescriptionData!= null)&&(!this.networkManagementEntityDescriptionData.isEmpty()))?this.getNetworkManagementEntityDescriptionData():null);
            if ((this.networkManagementEntityDescriptionData!= null)&&(!this.networkManagementEntityDescriptionData.isEmpty())) {
                currentHashCode += theNetworkManagementEntityDescriptionData.hashCode();
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
            List<NetworkManagementEntityDescriptionDataType> theNetworkManagementEntityDescriptionData;
            theNetworkManagementEntityDescriptionData = (((this.networkManagementEntityDescriptionData!= null)&&(!this.networkManagementEntityDescriptionData.isEmpty()))?this.getNetworkManagementEntityDescriptionData():null);
            strategy.appendField(locator, this, "networkManagementEntityDescriptionData", buffer, theNetworkManagementEntityDescriptionData, ((this.networkManagementEntityDescriptionData!= null)&&(!this.networkManagementEntityDescriptionData.isEmpty())));
        }
        return buffer;
    }

}
