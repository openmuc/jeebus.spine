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
 * <p>Java class for ElectricalConnectionDescriptionListDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElectricalConnectionDescriptionListDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://docs.eebus.org/spine/xsd/v1}electricalConnectionDescriptionData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElectricalConnectionDescriptionListDataType", propOrder = {
    "electricalConnectionDescriptionData"
})
public class ElectricalConnectionDescriptionListDataType implements Cloneable, CopyTo, ToString
{

    protected List<ElectricalConnectionDescriptionDataType> electricalConnectionDescriptionData;

    /**
     * Default no-arg constructor
     * 
     */
    public ElectricalConnectionDescriptionListDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public ElectricalConnectionDescriptionListDataType(final List<ElectricalConnectionDescriptionDataType> electricalConnectionDescriptionData) {
        this.electricalConnectionDescriptionData = electricalConnectionDescriptionData;
    }

    /**
     * Gets the value of the electricalConnectionDescriptionData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the electricalConnectionDescriptionData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElectricalConnectionDescriptionData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ElectricalConnectionDescriptionDataType }
     * 
     * 
     */
    public List<ElectricalConnectionDescriptionDataType> getElectricalConnectionDescriptionData() {
        if (electricalConnectionDescriptionData == null) {
            electricalConnectionDescriptionData = new ArrayList<ElectricalConnectionDescriptionDataType>();
        }
        return this.electricalConnectionDescriptionData;
    }

    /**
     * Adds objects to the list of ElectricalConnectionDescriptionData using add method
     * 
     * @param values
     *     objects to add to the list ElectricalConnectionDescriptionData
     * @return
     *     The class instance
     */
    public ElectricalConnectionDescriptionListDataType withElectricalConnectionDescriptionData(ElectricalConnectionDescriptionDataType... values) {
        if (values!= null) {
            for (ElectricalConnectionDescriptionDataType value: values) {
                getElectricalConnectionDescriptionData().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of ElectricalConnectionDescriptionData using addAll method
     * 
     * @param values
     *     objects to add to the list ElectricalConnectionDescriptionData
     * @return
     *     The class instance
     */
    public ElectricalConnectionDescriptionListDataType withElectricalConnectionDescriptionData(Collection<ElectricalConnectionDescriptionDataType> values) {
        if (values!= null) {
            getElectricalConnectionDescriptionData().addAll(values);
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
        if (draftCopy instanceof ElectricalConnectionDescriptionListDataType) {
            final ElectricalConnectionDescriptionListDataType copy = ((ElectricalConnectionDescriptionListDataType) draftCopy);
            {
                Boolean electricalConnectionDescriptionDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.electricalConnectionDescriptionData!= null)&&(!this.electricalConnectionDescriptionData.isEmpty())));
                if (electricalConnectionDescriptionDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<ElectricalConnectionDescriptionDataType> sourceElectricalConnectionDescriptionData;
                    sourceElectricalConnectionDescriptionData = (((this.electricalConnectionDescriptionData!= null)&&(!this.electricalConnectionDescriptionData.isEmpty()))?this.getElectricalConnectionDescriptionData():null);
                    @SuppressWarnings("unchecked")
                    List<ElectricalConnectionDescriptionDataType> copyElectricalConnectionDescriptionData = ((List<ElectricalConnectionDescriptionDataType> ) strategy.copy(LocatorUtils.property(locator, "electricalConnectionDescriptionData", sourceElectricalConnectionDescriptionData), sourceElectricalConnectionDescriptionData, ((this.electricalConnectionDescriptionData!= null)&&(!this.electricalConnectionDescriptionData.isEmpty()))));
                    copy.electricalConnectionDescriptionData = null;
                    if (copyElectricalConnectionDescriptionData!= null) {
                        List<ElectricalConnectionDescriptionDataType> uniqueElectricalConnectionDescriptionDatal = copy.getElectricalConnectionDescriptionData();
                        uniqueElectricalConnectionDescriptionDatal.addAll(copyElectricalConnectionDescriptionData);
                    }
                } else {
                    if (electricalConnectionDescriptionDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.electricalConnectionDescriptionData = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new ElectricalConnectionDescriptionListDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ElectricalConnectionDescriptionListDataType that = ((ElectricalConnectionDescriptionListDataType) object);
        {
            List<ElectricalConnectionDescriptionDataType> leftElectricalConnectionDescriptionData;
            leftElectricalConnectionDescriptionData = (((this.electricalConnectionDescriptionData!= null)&&(!this.electricalConnectionDescriptionData.isEmpty()))?this.getElectricalConnectionDescriptionData():null);
            List<ElectricalConnectionDescriptionDataType> rightElectricalConnectionDescriptionData;
            rightElectricalConnectionDescriptionData = (((that.electricalConnectionDescriptionData!= null)&&(!that.electricalConnectionDescriptionData.isEmpty()))?that.getElectricalConnectionDescriptionData():null);
            if ((this.electricalConnectionDescriptionData!= null)&&(!this.electricalConnectionDescriptionData.isEmpty())) {
                if ((that.electricalConnectionDescriptionData!= null)&&(!that.electricalConnectionDescriptionData.isEmpty())) {
                    if (!leftElectricalConnectionDescriptionData.equals(rightElectricalConnectionDescriptionData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.electricalConnectionDescriptionData!= null)&&(!that.electricalConnectionDescriptionData.isEmpty())) {
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
            List<ElectricalConnectionDescriptionDataType> theElectricalConnectionDescriptionData;
            theElectricalConnectionDescriptionData = (((this.electricalConnectionDescriptionData!= null)&&(!this.electricalConnectionDescriptionData.isEmpty()))?this.getElectricalConnectionDescriptionData():null);
            if ((this.electricalConnectionDescriptionData!= null)&&(!this.electricalConnectionDescriptionData.isEmpty())) {
                currentHashCode += theElectricalConnectionDescriptionData.hashCode();
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
            List<ElectricalConnectionDescriptionDataType> theElectricalConnectionDescriptionData;
            theElectricalConnectionDescriptionData = (((this.electricalConnectionDescriptionData!= null)&&(!this.electricalConnectionDescriptionData.isEmpty()))?this.getElectricalConnectionDescriptionData():null);
            strategy.appendField(locator, this, "electricalConnectionDescriptionData", buffer, theElectricalConnectionDescriptionData, ((this.electricalConnectionDescriptionData!= null)&&(!this.electricalConnectionDescriptionData.isEmpty())));
        }
        return buffer;
    }

}
