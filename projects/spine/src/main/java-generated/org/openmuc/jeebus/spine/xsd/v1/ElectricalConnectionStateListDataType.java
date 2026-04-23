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
 * <p>Java class for ElectricalConnectionStateListDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElectricalConnectionStateListDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://docs.eebus.org/spine/xsd/v1}electricalConnectionStateData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElectricalConnectionStateListDataType", propOrder = {
    "electricalConnectionStateData"
})
public class ElectricalConnectionStateListDataType implements Cloneable, CopyTo, ToString
{

    protected List<ElectricalConnectionStateDataType> electricalConnectionStateData;

    /**
     * Default no-arg constructor
     * 
     */
    public ElectricalConnectionStateListDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public ElectricalConnectionStateListDataType(final List<ElectricalConnectionStateDataType> electricalConnectionStateData) {
        this.electricalConnectionStateData = electricalConnectionStateData;
    }

    /**
     * Gets the value of the electricalConnectionStateData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the electricalConnectionStateData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElectricalConnectionStateData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ElectricalConnectionStateDataType }
     * 
     * 
     */
    public List<ElectricalConnectionStateDataType> getElectricalConnectionStateData() {
        if (electricalConnectionStateData == null) {
            electricalConnectionStateData = new ArrayList<ElectricalConnectionStateDataType>();
        }
        return this.electricalConnectionStateData;
    }

    /**
     * Adds objects to the list of ElectricalConnectionStateData using add method
     * 
     * @param values
     *     objects to add to the list ElectricalConnectionStateData
     * @return
     *     The class instance
     */
    public ElectricalConnectionStateListDataType withElectricalConnectionStateData(ElectricalConnectionStateDataType... values) {
        if (values!= null) {
            for (ElectricalConnectionStateDataType value: values) {
                getElectricalConnectionStateData().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of ElectricalConnectionStateData using addAll method
     * 
     * @param values
     *     objects to add to the list ElectricalConnectionStateData
     * @return
     *     The class instance
     */
    public ElectricalConnectionStateListDataType withElectricalConnectionStateData(Collection<ElectricalConnectionStateDataType> values) {
        if (values!= null) {
            getElectricalConnectionStateData().addAll(values);
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
        if (draftCopy instanceof ElectricalConnectionStateListDataType) {
            final ElectricalConnectionStateListDataType copy = ((ElectricalConnectionStateListDataType) draftCopy);
            {
                Boolean electricalConnectionStateDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.electricalConnectionStateData!= null)&&(!this.electricalConnectionStateData.isEmpty())));
                if (electricalConnectionStateDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<ElectricalConnectionStateDataType> sourceElectricalConnectionStateData;
                    sourceElectricalConnectionStateData = (((this.electricalConnectionStateData!= null)&&(!this.electricalConnectionStateData.isEmpty()))?this.getElectricalConnectionStateData():null);
                    @SuppressWarnings("unchecked")
                    List<ElectricalConnectionStateDataType> copyElectricalConnectionStateData = ((List<ElectricalConnectionStateDataType> ) strategy.copy(LocatorUtils.property(locator, "electricalConnectionStateData", sourceElectricalConnectionStateData), sourceElectricalConnectionStateData, ((this.electricalConnectionStateData!= null)&&(!this.electricalConnectionStateData.isEmpty()))));
                    copy.electricalConnectionStateData = null;
                    if (copyElectricalConnectionStateData!= null) {
                        List<ElectricalConnectionStateDataType> uniqueElectricalConnectionStateDatal = copy.getElectricalConnectionStateData();
                        uniqueElectricalConnectionStateDatal.addAll(copyElectricalConnectionStateData);
                    }
                } else {
                    if (electricalConnectionStateDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.electricalConnectionStateData = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new ElectricalConnectionStateListDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ElectricalConnectionStateListDataType that = ((ElectricalConnectionStateListDataType) object);
        {
            List<ElectricalConnectionStateDataType> leftElectricalConnectionStateData;
            leftElectricalConnectionStateData = (((this.electricalConnectionStateData!= null)&&(!this.electricalConnectionStateData.isEmpty()))?this.getElectricalConnectionStateData():null);
            List<ElectricalConnectionStateDataType> rightElectricalConnectionStateData;
            rightElectricalConnectionStateData = (((that.electricalConnectionStateData!= null)&&(!that.electricalConnectionStateData.isEmpty()))?that.getElectricalConnectionStateData():null);
            if ((this.electricalConnectionStateData!= null)&&(!this.electricalConnectionStateData.isEmpty())) {
                if ((that.electricalConnectionStateData!= null)&&(!that.electricalConnectionStateData.isEmpty())) {
                    if (!leftElectricalConnectionStateData.equals(rightElectricalConnectionStateData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.electricalConnectionStateData!= null)&&(!that.electricalConnectionStateData.isEmpty())) {
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
            List<ElectricalConnectionStateDataType> theElectricalConnectionStateData;
            theElectricalConnectionStateData = (((this.electricalConnectionStateData!= null)&&(!this.electricalConnectionStateData.isEmpty()))?this.getElectricalConnectionStateData():null);
            if ((this.electricalConnectionStateData!= null)&&(!this.electricalConnectionStateData.isEmpty())) {
                currentHashCode += theElectricalConnectionStateData.hashCode();
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
            List<ElectricalConnectionStateDataType> theElectricalConnectionStateData;
            theElectricalConnectionStateData = (((this.electricalConnectionStateData!= null)&&(!this.electricalConnectionStateData.isEmpty()))?this.getElectricalConnectionStateData():null);
            strategy.appendField(locator, this, "electricalConnectionStateData", buffer, theElectricalConnectionStateData, ((this.electricalConnectionStateData!= null)&&(!this.electricalConnectionStateData.isEmpty())));
        }
        return buffer;
    }

}
