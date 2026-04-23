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
 * <p>Java class for ElectricalConnectionPermittedValueSetListDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElectricalConnectionPermittedValueSetListDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://docs.eebus.org/spine/xsd/v1}electricalConnectionPermittedValueSetData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElectricalConnectionPermittedValueSetListDataType", propOrder = {
    "electricalConnectionPermittedValueSetData"
})
public class ElectricalConnectionPermittedValueSetListDataType implements Cloneable, CopyTo, ToString
{

    protected List<ElectricalConnectionPermittedValueSetDataType> electricalConnectionPermittedValueSetData;

    /**
     * Default no-arg constructor
     * 
     */
    public ElectricalConnectionPermittedValueSetListDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public ElectricalConnectionPermittedValueSetListDataType(final List<ElectricalConnectionPermittedValueSetDataType> electricalConnectionPermittedValueSetData) {
        this.electricalConnectionPermittedValueSetData = electricalConnectionPermittedValueSetData;
    }

    /**
     * Gets the value of the electricalConnectionPermittedValueSetData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the electricalConnectionPermittedValueSetData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElectricalConnectionPermittedValueSetData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ElectricalConnectionPermittedValueSetDataType }
     * 
     * 
     */
    public List<ElectricalConnectionPermittedValueSetDataType> getElectricalConnectionPermittedValueSetData() {
        if (electricalConnectionPermittedValueSetData == null) {
            electricalConnectionPermittedValueSetData = new ArrayList<ElectricalConnectionPermittedValueSetDataType>();
        }
        return this.electricalConnectionPermittedValueSetData;
    }

    /**
     * Adds objects to the list of ElectricalConnectionPermittedValueSetData using add method
     * 
     * @param values
     *     objects to add to the list ElectricalConnectionPermittedValueSetData
     * @return
     *     The class instance
     */
    public ElectricalConnectionPermittedValueSetListDataType withElectricalConnectionPermittedValueSetData(ElectricalConnectionPermittedValueSetDataType... values) {
        if (values!= null) {
            for (ElectricalConnectionPermittedValueSetDataType value: values) {
                getElectricalConnectionPermittedValueSetData().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of ElectricalConnectionPermittedValueSetData using addAll method
     * 
     * @param values
     *     objects to add to the list ElectricalConnectionPermittedValueSetData
     * @return
     *     The class instance
     */
    public ElectricalConnectionPermittedValueSetListDataType withElectricalConnectionPermittedValueSetData(Collection<ElectricalConnectionPermittedValueSetDataType> values) {
        if (values!= null) {
            getElectricalConnectionPermittedValueSetData().addAll(values);
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
        if (draftCopy instanceof ElectricalConnectionPermittedValueSetListDataType) {
            final ElectricalConnectionPermittedValueSetListDataType copy = ((ElectricalConnectionPermittedValueSetListDataType) draftCopy);
            {
                Boolean electricalConnectionPermittedValueSetDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.electricalConnectionPermittedValueSetData!= null)&&(!this.electricalConnectionPermittedValueSetData.isEmpty())));
                if (electricalConnectionPermittedValueSetDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<ElectricalConnectionPermittedValueSetDataType> sourceElectricalConnectionPermittedValueSetData;
                    sourceElectricalConnectionPermittedValueSetData = (((this.electricalConnectionPermittedValueSetData!= null)&&(!this.electricalConnectionPermittedValueSetData.isEmpty()))?this.getElectricalConnectionPermittedValueSetData():null);
                    @SuppressWarnings("unchecked")
                    List<ElectricalConnectionPermittedValueSetDataType> copyElectricalConnectionPermittedValueSetData = ((List<ElectricalConnectionPermittedValueSetDataType> ) strategy.copy(LocatorUtils.property(locator, "electricalConnectionPermittedValueSetData", sourceElectricalConnectionPermittedValueSetData), sourceElectricalConnectionPermittedValueSetData, ((this.electricalConnectionPermittedValueSetData!= null)&&(!this.electricalConnectionPermittedValueSetData.isEmpty()))));
                    copy.electricalConnectionPermittedValueSetData = null;
                    if (copyElectricalConnectionPermittedValueSetData!= null) {
                        List<ElectricalConnectionPermittedValueSetDataType> uniqueElectricalConnectionPermittedValueSetDatal = copy.getElectricalConnectionPermittedValueSetData();
                        uniqueElectricalConnectionPermittedValueSetDatal.addAll(copyElectricalConnectionPermittedValueSetData);
                    }
                } else {
                    if (electricalConnectionPermittedValueSetDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.electricalConnectionPermittedValueSetData = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new ElectricalConnectionPermittedValueSetListDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ElectricalConnectionPermittedValueSetListDataType that = ((ElectricalConnectionPermittedValueSetListDataType) object);
        {
            List<ElectricalConnectionPermittedValueSetDataType> leftElectricalConnectionPermittedValueSetData;
            leftElectricalConnectionPermittedValueSetData = (((this.electricalConnectionPermittedValueSetData!= null)&&(!this.electricalConnectionPermittedValueSetData.isEmpty()))?this.getElectricalConnectionPermittedValueSetData():null);
            List<ElectricalConnectionPermittedValueSetDataType> rightElectricalConnectionPermittedValueSetData;
            rightElectricalConnectionPermittedValueSetData = (((that.electricalConnectionPermittedValueSetData!= null)&&(!that.electricalConnectionPermittedValueSetData.isEmpty()))?that.getElectricalConnectionPermittedValueSetData():null);
            if ((this.electricalConnectionPermittedValueSetData!= null)&&(!this.electricalConnectionPermittedValueSetData.isEmpty())) {
                if ((that.electricalConnectionPermittedValueSetData!= null)&&(!that.electricalConnectionPermittedValueSetData.isEmpty())) {
                    if (!leftElectricalConnectionPermittedValueSetData.equals(rightElectricalConnectionPermittedValueSetData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.electricalConnectionPermittedValueSetData!= null)&&(!that.electricalConnectionPermittedValueSetData.isEmpty())) {
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
            List<ElectricalConnectionPermittedValueSetDataType> theElectricalConnectionPermittedValueSetData;
            theElectricalConnectionPermittedValueSetData = (((this.electricalConnectionPermittedValueSetData!= null)&&(!this.electricalConnectionPermittedValueSetData.isEmpty()))?this.getElectricalConnectionPermittedValueSetData():null);
            if ((this.electricalConnectionPermittedValueSetData!= null)&&(!this.electricalConnectionPermittedValueSetData.isEmpty())) {
                currentHashCode += theElectricalConnectionPermittedValueSetData.hashCode();
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
            List<ElectricalConnectionPermittedValueSetDataType> theElectricalConnectionPermittedValueSetData;
            theElectricalConnectionPermittedValueSetData = (((this.electricalConnectionPermittedValueSetData!= null)&&(!this.electricalConnectionPermittedValueSetData.isEmpty()))?this.getElectricalConnectionPermittedValueSetData():null);
            strategy.appendField(locator, this, "electricalConnectionPermittedValueSetData", buffer, theElectricalConnectionPermittedValueSetData, ((this.electricalConnectionPermittedValueSetData!= null)&&(!this.electricalConnectionPermittedValueSetData.isEmpty())));
        }
        return buffer;
    }

}
