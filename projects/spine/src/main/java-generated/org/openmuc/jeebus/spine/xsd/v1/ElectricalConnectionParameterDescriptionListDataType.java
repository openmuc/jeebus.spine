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
 * <p>Java class for ElectricalConnectionParameterDescriptionListDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElectricalConnectionParameterDescriptionListDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://docs.eebus.org/spine/xsd/v1}electricalConnectionParameterDescriptionData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElectricalConnectionParameterDescriptionListDataType", propOrder = {
    "electricalConnectionParameterDescriptionData"
})
public class ElectricalConnectionParameterDescriptionListDataType implements Cloneable, CopyTo, ToString
{

    protected List<ElectricalConnectionParameterDescriptionDataType> electricalConnectionParameterDescriptionData;

    /**
     * Default no-arg constructor
     * 
     */
    public ElectricalConnectionParameterDescriptionListDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public ElectricalConnectionParameterDescriptionListDataType(final List<ElectricalConnectionParameterDescriptionDataType> electricalConnectionParameterDescriptionData) {
        this.electricalConnectionParameterDescriptionData = electricalConnectionParameterDescriptionData;
    }

    /**
     * Gets the value of the electricalConnectionParameterDescriptionData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the electricalConnectionParameterDescriptionData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElectricalConnectionParameterDescriptionData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ElectricalConnectionParameterDescriptionDataType }
     * 
     * 
     */
    public List<ElectricalConnectionParameterDescriptionDataType> getElectricalConnectionParameterDescriptionData() {
        if (electricalConnectionParameterDescriptionData == null) {
            electricalConnectionParameterDescriptionData = new ArrayList<ElectricalConnectionParameterDescriptionDataType>();
        }
        return this.electricalConnectionParameterDescriptionData;
    }

    /**
     * Adds objects to the list of ElectricalConnectionParameterDescriptionData using add method
     * 
     * @param values
     *     objects to add to the list ElectricalConnectionParameterDescriptionData
     * @return
     *     The class instance
     */
    public ElectricalConnectionParameterDescriptionListDataType withElectricalConnectionParameterDescriptionData(ElectricalConnectionParameterDescriptionDataType... values) {
        if (values!= null) {
            for (ElectricalConnectionParameterDescriptionDataType value: values) {
                getElectricalConnectionParameterDescriptionData().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of ElectricalConnectionParameterDescriptionData using addAll method
     * 
     * @param values
     *     objects to add to the list ElectricalConnectionParameterDescriptionData
     * @return
     *     The class instance
     */
    public ElectricalConnectionParameterDescriptionListDataType withElectricalConnectionParameterDescriptionData(Collection<ElectricalConnectionParameterDescriptionDataType> values) {
        if (values!= null) {
            getElectricalConnectionParameterDescriptionData().addAll(values);
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
        if (draftCopy instanceof ElectricalConnectionParameterDescriptionListDataType) {
            final ElectricalConnectionParameterDescriptionListDataType copy = ((ElectricalConnectionParameterDescriptionListDataType) draftCopy);
            {
                Boolean electricalConnectionParameterDescriptionDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.electricalConnectionParameterDescriptionData!= null)&&(!this.electricalConnectionParameterDescriptionData.isEmpty())));
                if (electricalConnectionParameterDescriptionDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<ElectricalConnectionParameterDescriptionDataType> sourceElectricalConnectionParameterDescriptionData;
                    sourceElectricalConnectionParameterDescriptionData = (((this.electricalConnectionParameterDescriptionData!= null)&&(!this.electricalConnectionParameterDescriptionData.isEmpty()))?this.getElectricalConnectionParameterDescriptionData():null);
                    @SuppressWarnings("unchecked")
                    List<ElectricalConnectionParameterDescriptionDataType> copyElectricalConnectionParameterDescriptionData = ((List<ElectricalConnectionParameterDescriptionDataType> ) strategy.copy(LocatorUtils.property(locator, "electricalConnectionParameterDescriptionData", sourceElectricalConnectionParameterDescriptionData), sourceElectricalConnectionParameterDescriptionData, ((this.electricalConnectionParameterDescriptionData!= null)&&(!this.electricalConnectionParameterDescriptionData.isEmpty()))));
                    copy.electricalConnectionParameterDescriptionData = null;
                    if (copyElectricalConnectionParameterDescriptionData!= null) {
                        List<ElectricalConnectionParameterDescriptionDataType> uniqueElectricalConnectionParameterDescriptionDatal = copy.getElectricalConnectionParameterDescriptionData();
                        uniqueElectricalConnectionParameterDescriptionDatal.addAll(copyElectricalConnectionParameterDescriptionData);
                    }
                } else {
                    if (electricalConnectionParameterDescriptionDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.electricalConnectionParameterDescriptionData = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new ElectricalConnectionParameterDescriptionListDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ElectricalConnectionParameterDescriptionListDataType that = ((ElectricalConnectionParameterDescriptionListDataType) object);
        {
            List<ElectricalConnectionParameterDescriptionDataType> leftElectricalConnectionParameterDescriptionData;
            leftElectricalConnectionParameterDescriptionData = (((this.electricalConnectionParameterDescriptionData!= null)&&(!this.electricalConnectionParameterDescriptionData.isEmpty()))?this.getElectricalConnectionParameterDescriptionData():null);
            List<ElectricalConnectionParameterDescriptionDataType> rightElectricalConnectionParameterDescriptionData;
            rightElectricalConnectionParameterDescriptionData = (((that.electricalConnectionParameterDescriptionData!= null)&&(!that.electricalConnectionParameterDescriptionData.isEmpty()))?that.getElectricalConnectionParameterDescriptionData():null);
            if ((this.electricalConnectionParameterDescriptionData!= null)&&(!this.electricalConnectionParameterDescriptionData.isEmpty())) {
                if ((that.electricalConnectionParameterDescriptionData!= null)&&(!that.electricalConnectionParameterDescriptionData.isEmpty())) {
                    if (!leftElectricalConnectionParameterDescriptionData.equals(rightElectricalConnectionParameterDescriptionData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.electricalConnectionParameterDescriptionData!= null)&&(!that.electricalConnectionParameterDescriptionData.isEmpty())) {
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
            List<ElectricalConnectionParameterDescriptionDataType> theElectricalConnectionParameterDescriptionData;
            theElectricalConnectionParameterDescriptionData = (((this.electricalConnectionParameterDescriptionData!= null)&&(!this.electricalConnectionParameterDescriptionData.isEmpty()))?this.getElectricalConnectionParameterDescriptionData():null);
            if ((this.electricalConnectionParameterDescriptionData!= null)&&(!this.electricalConnectionParameterDescriptionData.isEmpty())) {
                currentHashCode += theElectricalConnectionParameterDescriptionData.hashCode();
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
            List<ElectricalConnectionParameterDescriptionDataType> theElectricalConnectionParameterDescriptionData;
            theElectricalConnectionParameterDescriptionData = (((this.electricalConnectionParameterDescriptionData!= null)&&(!this.electricalConnectionParameterDescriptionData.isEmpty()))?this.getElectricalConnectionParameterDescriptionData():null);
            strategy.appendField(locator, this, "electricalConnectionParameterDescriptionData", buffer, theElectricalConnectionParameterDescriptionData, ((this.electricalConnectionParameterDescriptionData!= null)&&(!this.electricalConnectionParameterDescriptionData.isEmpty())));
        }
        return buffer;
    }

}
