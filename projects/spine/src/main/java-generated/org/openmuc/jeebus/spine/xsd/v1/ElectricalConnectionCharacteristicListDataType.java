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
 * <p>Java class for ElectricalConnectionCharacteristicListDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElectricalConnectionCharacteristicListDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://docs.eebus.org/spine/xsd/v1}electricalConnectionCharacteristicData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElectricalConnectionCharacteristicListDataType", propOrder = {
    "electricalConnectionCharacteristicData"
})
public class ElectricalConnectionCharacteristicListDataType implements Cloneable, CopyTo, ToString
{

    protected List<ElectricalConnectionCharacteristicDataType> electricalConnectionCharacteristicData;

    /**
     * Default no-arg constructor
     * 
     */
    public ElectricalConnectionCharacteristicListDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public ElectricalConnectionCharacteristicListDataType(final List<ElectricalConnectionCharacteristicDataType> electricalConnectionCharacteristicData) {
        this.electricalConnectionCharacteristicData = electricalConnectionCharacteristicData;
    }

    /**
     * Gets the value of the electricalConnectionCharacteristicData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the electricalConnectionCharacteristicData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElectricalConnectionCharacteristicData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ElectricalConnectionCharacteristicDataType }
     * 
     * 
     */
    public List<ElectricalConnectionCharacteristicDataType> getElectricalConnectionCharacteristicData() {
        if (electricalConnectionCharacteristicData == null) {
            electricalConnectionCharacteristicData = new ArrayList<ElectricalConnectionCharacteristicDataType>();
        }
        return this.electricalConnectionCharacteristicData;
    }

    /**
     * Adds objects to the list of ElectricalConnectionCharacteristicData using add method
     * 
     * @param values
     *     objects to add to the list ElectricalConnectionCharacteristicData
     * @return
     *     The class instance
     */
    public ElectricalConnectionCharacteristicListDataType withElectricalConnectionCharacteristicData(ElectricalConnectionCharacteristicDataType... values) {
        if (values!= null) {
            for (ElectricalConnectionCharacteristicDataType value: values) {
                getElectricalConnectionCharacteristicData().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of ElectricalConnectionCharacteristicData using addAll method
     * 
     * @param values
     *     objects to add to the list ElectricalConnectionCharacteristicData
     * @return
     *     The class instance
     */
    public ElectricalConnectionCharacteristicListDataType withElectricalConnectionCharacteristicData(Collection<ElectricalConnectionCharacteristicDataType> values) {
        if (values!= null) {
            getElectricalConnectionCharacteristicData().addAll(values);
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
        if (draftCopy instanceof ElectricalConnectionCharacteristicListDataType) {
            final ElectricalConnectionCharacteristicListDataType copy = ((ElectricalConnectionCharacteristicListDataType) draftCopy);
            {
                Boolean electricalConnectionCharacteristicDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.electricalConnectionCharacteristicData!= null)&&(!this.electricalConnectionCharacteristicData.isEmpty())));
                if (electricalConnectionCharacteristicDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<ElectricalConnectionCharacteristicDataType> sourceElectricalConnectionCharacteristicData;
                    sourceElectricalConnectionCharacteristicData = (((this.electricalConnectionCharacteristicData!= null)&&(!this.electricalConnectionCharacteristicData.isEmpty()))?this.getElectricalConnectionCharacteristicData():null);
                    @SuppressWarnings("unchecked")
                    List<ElectricalConnectionCharacteristicDataType> copyElectricalConnectionCharacteristicData = ((List<ElectricalConnectionCharacteristicDataType> ) strategy.copy(LocatorUtils.property(locator, "electricalConnectionCharacteristicData", sourceElectricalConnectionCharacteristicData), sourceElectricalConnectionCharacteristicData, ((this.electricalConnectionCharacteristicData!= null)&&(!this.electricalConnectionCharacteristicData.isEmpty()))));
                    copy.electricalConnectionCharacteristicData = null;
                    if (copyElectricalConnectionCharacteristicData!= null) {
                        List<ElectricalConnectionCharacteristicDataType> uniqueElectricalConnectionCharacteristicDatal = copy.getElectricalConnectionCharacteristicData();
                        uniqueElectricalConnectionCharacteristicDatal.addAll(copyElectricalConnectionCharacteristicData);
                    }
                } else {
                    if (electricalConnectionCharacteristicDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.electricalConnectionCharacteristicData = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new ElectricalConnectionCharacteristicListDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ElectricalConnectionCharacteristicListDataType that = ((ElectricalConnectionCharacteristicListDataType) object);
        {
            List<ElectricalConnectionCharacteristicDataType> leftElectricalConnectionCharacteristicData;
            leftElectricalConnectionCharacteristicData = (((this.electricalConnectionCharacteristicData!= null)&&(!this.electricalConnectionCharacteristicData.isEmpty()))?this.getElectricalConnectionCharacteristicData():null);
            List<ElectricalConnectionCharacteristicDataType> rightElectricalConnectionCharacteristicData;
            rightElectricalConnectionCharacteristicData = (((that.electricalConnectionCharacteristicData!= null)&&(!that.electricalConnectionCharacteristicData.isEmpty()))?that.getElectricalConnectionCharacteristicData():null);
            if ((this.electricalConnectionCharacteristicData!= null)&&(!this.electricalConnectionCharacteristicData.isEmpty())) {
                if ((that.electricalConnectionCharacteristicData!= null)&&(!that.electricalConnectionCharacteristicData.isEmpty())) {
                    if (!leftElectricalConnectionCharacteristicData.equals(rightElectricalConnectionCharacteristicData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.electricalConnectionCharacteristicData!= null)&&(!that.electricalConnectionCharacteristicData.isEmpty())) {
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
            List<ElectricalConnectionCharacteristicDataType> theElectricalConnectionCharacteristicData;
            theElectricalConnectionCharacteristicData = (((this.electricalConnectionCharacteristicData!= null)&&(!this.electricalConnectionCharacteristicData.isEmpty()))?this.getElectricalConnectionCharacteristicData():null);
            if ((this.electricalConnectionCharacteristicData!= null)&&(!this.electricalConnectionCharacteristicData.isEmpty())) {
                currentHashCode += theElectricalConnectionCharacteristicData.hashCode();
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
            List<ElectricalConnectionCharacteristicDataType> theElectricalConnectionCharacteristicData;
            theElectricalConnectionCharacteristicData = (((this.electricalConnectionCharacteristicData!= null)&&(!this.electricalConnectionCharacteristicData.isEmpty()))?this.getElectricalConnectionCharacteristicData():null);
            strategy.appendField(locator, this, "electricalConnectionCharacteristicData", buffer, theElectricalConnectionCharacteristicData, ((this.electricalConnectionCharacteristicData!= null)&&(!this.electricalConnectionCharacteristicData.isEmpty())));
        }
        return buffer;
    }

}
