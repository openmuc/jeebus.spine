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
 * <p>Java class for OperatingConstraintsPowerRangeListDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OperatingConstraintsPowerRangeListDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://docs.eebus.org/spine/xsd/v1}operatingConstraintsPowerRangeData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperatingConstraintsPowerRangeListDataType", propOrder = {
    "operatingConstraintsPowerRangeData"
})
public class OperatingConstraintsPowerRangeListDataType implements Cloneable, CopyTo, ToString
{

    protected List<OperatingConstraintsPowerRangeDataType> operatingConstraintsPowerRangeData;

    /**
     * Default no-arg constructor
     * 
     */
    public OperatingConstraintsPowerRangeListDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public OperatingConstraintsPowerRangeListDataType(final List<OperatingConstraintsPowerRangeDataType> operatingConstraintsPowerRangeData) {
        this.operatingConstraintsPowerRangeData = operatingConstraintsPowerRangeData;
    }

    /**
     * Gets the value of the operatingConstraintsPowerRangeData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the operatingConstraintsPowerRangeData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperatingConstraintsPowerRangeData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OperatingConstraintsPowerRangeDataType }
     * 
     * 
     */
    public List<OperatingConstraintsPowerRangeDataType> getOperatingConstraintsPowerRangeData() {
        if (operatingConstraintsPowerRangeData == null) {
            operatingConstraintsPowerRangeData = new ArrayList<OperatingConstraintsPowerRangeDataType>();
        }
        return this.operatingConstraintsPowerRangeData;
    }

    /**
     * Adds objects to the list of OperatingConstraintsPowerRangeData using add method
     * 
     * @param values
     *     objects to add to the list OperatingConstraintsPowerRangeData
     * @return
     *     The class instance
     */
    public OperatingConstraintsPowerRangeListDataType withOperatingConstraintsPowerRangeData(OperatingConstraintsPowerRangeDataType... values) {
        if (values!= null) {
            for (OperatingConstraintsPowerRangeDataType value: values) {
                getOperatingConstraintsPowerRangeData().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of OperatingConstraintsPowerRangeData using addAll method
     * 
     * @param values
     *     objects to add to the list OperatingConstraintsPowerRangeData
     * @return
     *     The class instance
     */
    public OperatingConstraintsPowerRangeListDataType withOperatingConstraintsPowerRangeData(Collection<OperatingConstraintsPowerRangeDataType> values) {
        if (values!= null) {
            getOperatingConstraintsPowerRangeData().addAll(values);
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
        if (draftCopy instanceof OperatingConstraintsPowerRangeListDataType) {
            final OperatingConstraintsPowerRangeListDataType copy = ((OperatingConstraintsPowerRangeListDataType) draftCopy);
            {
                Boolean operatingConstraintsPowerRangeDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.operatingConstraintsPowerRangeData!= null)&&(!this.operatingConstraintsPowerRangeData.isEmpty())));
                if (operatingConstraintsPowerRangeDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<OperatingConstraintsPowerRangeDataType> sourceOperatingConstraintsPowerRangeData;
                    sourceOperatingConstraintsPowerRangeData = (((this.operatingConstraintsPowerRangeData!= null)&&(!this.operatingConstraintsPowerRangeData.isEmpty()))?this.getOperatingConstraintsPowerRangeData():null);
                    @SuppressWarnings("unchecked")
                    List<OperatingConstraintsPowerRangeDataType> copyOperatingConstraintsPowerRangeData = ((List<OperatingConstraintsPowerRangeDataType> ) strategy.copy(LocatorUtils.property(locator, "operatingConstraintsPowerRangeData", sourceOperatingConstraintsPowerRangeData), sourceOperatingConstraintsPowerRangeData, ((this.operatingConstraintsPowerRangeData!= null)&&(!this.operatingConstraintsPowerRangeData.isEmpty()))));
                    copy.operatingConstraintsPowerRangeData = null;
                    if (copyOperatingConstraintsPowerRangeData!= null) {
                        List<OperatingConstraintsPowerRangeDataType> uniqueOperatingConstraintsPowerRangeDatal = copy.getOperatingConstraintsPowerRangeData();
                        uniqueOperatingConstraintsPowerRangeDatal.addAll(copyOperatingConstraintsPowerRangeData);
                    }
                } else {
                    if (operatingConstraintsPowerRangeDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.operatingConstraintsPowerRangeData = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new OperatingConstraintsPowerRangeListDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final OperatingConstraintsPowerRangeListDataType that = ((OperatingConstraintsPowerRangeListDataType) object);
        {
            List<OperatingConstraintsPowerRangeDataType> leftOperatingConstraintsPowerRangeData;
            leftOperatingConstraintsPowerRangeData = (((this.operatingConstraintsPowerRangeData!= null)&&(!this.operatingConstraintsPowerRangeData.isEmpty()))?this.getOperatingConstraintsPowerRangeData():null);
            List<OperatingConstraintsPowerRangeDataType> rightOperatingConstraintsPowerRangeData;
            rightOperatingConstraintsPowerRangeData = (((that.operatingConstraintsPowerRangeData!= null)&&(!that.operatingConstraintsPowerRangeData.isEmpty()))?that.getOperatingConstraintsPowerRangeData():null);
            if ((this.operatingConstraintsPowerRangeData!= null)&&(!this.operatingConstraintsPowerRangeData.isEmpty())) {
                if ((that.operatingConstraintsPowerRangeData!= null)&&(!that.operatingConstraintsPowerRangeData.isEmpty())) {
                    if (!leftOperatingConstraintsPowerRangeData.equals(rightOperatingConstraintsPowerRangeData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.operatingConstraintsPowerRangeData!= null)&&(!that.operatingConstraintsPowerRangeData.isEmpty())) {
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
            List<OperatingConstraintsPowerRangeDataType> theOperatingConstraintsPowerRangeData;
            theOperatingConstraintsPowerRangeData = (((this.operatingConstraintsPowerRangeData!= null)&&(!this.operatingConstraintsPowerRangeData.isEmpty()))?this.getOperatingConstraintsPowerRangeData():null);
            if ((this.operatingConstraintsPowerRangeData!= null)&&(!this.operatingConstraintsPowerRangeData.isEmpty())) {
                currentHashCode += theOperatingConstraintsPowerRangeData.hashCode();
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
            List<OperatingConstraintsPowerRangeDataType> theOperatingConstraintsPowerRangeData;
            theOperatingConstraintsPowerRangeData = (((this.operatingConstraintsPowerRangeData!= null)&&(!this.operatingConstraintsPowerRangeData.isEmpty()))?this.getOperatingConstraintsPowerRangeData():null);
            strategy.appendField(locator, this, "operatingConstraintsPowerRangeData", buffer, theOperatingConstraintsPowerRangeData, ((this.operatingConstraintsPowerRangeData!= null)&&(!this.operatingConstraintsPowerRangeData.isEmpty())));
        }
        return buffer;
    }

}
