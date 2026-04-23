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
 * <p>Java class for NodeManagementDestinationListDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NodeManagementDestinationListDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://docs.eebus.org/spine/xsd/v1}nodeManagementDestinationData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NodeManagementDestinationListDataType", propOrder = {
    "nodeManagementDestinationData"
})
public class NodeManagementDestinationListDataType implements Cloneable, CopyTo, ToString
{

    protected List<NodeManagementDestinationDataType> nodeManagementDestinationData;

    /**
     * Default no-arg constructor
     * 
     */
    public NodeManagementDestinationListDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public NodeManagementDestinationListDataType(final List<NodeManagementDestinationDataType> nodeManagementDestinationData) {
        this.nodeManagementDestinationData = nodeManagementDestinationData;
    }

    /**
     * Gets the value of the nodeManagementDestinationData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the nodeManagementDestinationData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNodeManagementDestinationData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NodeManagementDestinationDataType }
     * 
     * 
     */
    public List<NodeManagementDestinationDataType> getNodeManagementDestinationData() {
        if (nodeManagementDestinationData == null) {
            nodeManagementDestinationData = new ArrayList<NodeManagementDestinationDataType>();
        }
        return this.nodeManagementDestinationData;
    }

    /**
     * Adds objects to the list of NodeManagementDestinationData using add method
     * 
     * @param values
     *     objects to add to the list NodeManagementDestinationData
     * @return
     *     The class instance
     */
    public NodeManagementDestinationListDataType withNodeManagementDestinationData(NodeManagementDestinationDataType... values) {
        if (values!= null) {
            for (NodeManagementDestinationDataType value: values) {
                getNodeManagementDestinationData().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of NodeManagementDestinationData using addAll method
     * 
     * @param values
     *     objects to add to the list NodeManagementDestinationData
     * @return
     *     The class instance
     */
    public NodeManagementDestinationListDataType withNodeManagementDestinationData(Collection<NodeManagementDestinationDataType> values) {
        if (values!= null) {
            getNodeManagementDestinationData().addAll(values);
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
        if (draftCopy instanceof NodeManagementDestinationListDataType) {
            final NodeManagementDestinationListDataType copy = ((NodeManagementDestinationListDataType) draftCopy);
            {
                Boolean nodeManagementDestinationDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.nodeManagementDestinationData!= null)&&(!this.nodeManagementDestinationData.isEmpty())));
                if (nodeManagementDestinationDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<NodeManagementDestinationDataType> sourceNodeManagementDestinationData;
                    sourceNodeManagementDestinationData = (((this.nodeManagementDestinationData!= null)&&(!this.nodeManagementDestinationData.isEmpty()))?this.getNodeManagementDestinationData():null);
                    @SuppressWarnings("unchecked")
                    List<NodeManagementDestinationDataType> copyNodeManagementDestinationData = ((List<NodeManagementDestinationDataType> ) strategy.copy(LocatorUtils.property(locator, "nodeManagementDestinationData", sourceNodeManagementDestinationData), sourceNodeManagementDestinationData, ((this.nodeManagementDestinationData!= null)&&(!this.nodeManagementDestinationData.isEmpty()))));
                    copy.nodeManagementDestinationData = null;
                    if (copyNodeManagementDestinationData!= null) {
                        List<NodeManagementDestinationDataType> uniqueNodeManagementDestinationDatal = copy.getNodeManagementDestinationData();
                        uniqueNodeManagementDestinationDatal.addAll(copyNodeManagementDestinationData);
                    }
                } else {
                    if (nodeManagementDestinationDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.nodeManagementDestinationData = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new NodeManagementDestinationListDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final NodeManagementDestinationListDataType that = ((NodeManagementDestinationListDataType) object);
        {
            List<NodeManagementDestinationDataType> leftNodeManagementDestinationData;
            leftNodeManagementDestinationData = (((this.nodeManagementDestinationData!= null)&&(!this.nodeManagementDestinationData.isEmpty()))?this.getNodeManagementDestinationData():null);
            List<NodeManagementDestinationDataType> rightNodeManagementDestinationData;
            rightNodeManagementDestinationData = (((that.nodeManagementDestinationData!= null)&&(!that.nodeManagementDestinationData.isEmpty()))?that.getNodeManagementDestinationData():null);
            if ((this.nodeManagementDestinationData!= null)&&(!this.nodeManagementDestinationData.isEmpty())) {
                if ((that.nodeManagementDestinationData!= null)&&(!that.nodeManagementDestinationData.isEmpty())) {
                    if (!leftNodeManagementDestinationData.equals(rightNodeManagementDestinationData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.nodeManagementDestinationData!= null)&&(!that.nodeManagementDestinationData.isEmpty())) {
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
            List<NodeManagementDestinationDataType> theNodeManagementDestinationData;
            theNodeManagementDestinationData = (((this.nodeManagementDestinationData!= null)&&(!this.nodeManagementDestinationData.isEmpty()))?this.getNodeManagementDestinationData():null);
            if ((this.nodeManagementDestinationData!= null)&&(!this.nodeManagementDestinationData.isEmpty())) {
                currentHashCode += theNodeManagementDestinationData.hashCode();
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
            List<NodeManagementDestinationDataType> theNodeManagementDestinationData;
            theNodeManagementDestinationData = (((this.nodeManagementDestinationData!= null)&&(!this.nodeManagementDestinationData.isEmpty()))?this.getNodeManagementDestinationData():null);
            strategy.appendField(locator, this, "nodeManagementDestinationData", buffer, theNodeManagementDestinationData, ((this.nodeManagementDestinationData!= null)&&(!this.nodeManagementDestinationData.isEmpty())));
        }
        return buffer;
    }

}
