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
 * <p>Java class for MeasurementConstraintsListDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MeasurementConstraintsListDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://docs.eebus.org/spine/xsd/v1}measurementConstraintsData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeasurementConstraintsListDataType", propOrder = {
    "measurementConstraintsData"
})
public class MeasurementConstraintsListDataType implements Cloneable, CopyTo, ToString
{

    protected List<MeasurementConstraintsDataType> measurementConstraintsData;

    /**
     * Default no-arg constructor
     * 
     */
    public MeasurementConstraintsListDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public MeasurementConstraintsListDataType(final List<MeasurementConstraintsDataType> measurementConstraintsData) {
        this.measurementConstraintsData = measurementConstraintsData;
    }

    /**
     * Gets the value of the measurementConstraintsData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the measurementConstraintsData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeasurementConstraintsData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementConstraintsDataType }
     * 
     * 
     */
    public List<MeasurementConstraintsDataType> getMeasurementConstraintsData() {
        if (measurementConstraintsData == null) {
            measurementConstraintsData = new ArrayList<MeasurementConstraintsDataType>();
        }
        return this.measurementConstraintsData;
    }

    /**
     * Adds objects to the list of MeasurementConstraintsData using add method
     * 
     * @param values
     *     objects to add to the list MeasurementConstraintsData
     * @return
     *     The class instance
     */
    public MeasurementConstraintsListDataType withMeasurementConstraintsData(MeasurementConstraintsDataType... values) {
        if (values!= null) {
            for (MeasurementConstraintsDataType value: values) {
                getMeasurementConstraintsData().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of MeasurementConstraintsData using addAll method
     * 
     * @param values
     *     objects to add to the list MeasurementConstraintsData
     * @return
     *     The class instance
     */
    public MeasurementConstraintsListDataType withMeasurementConstraintsData(Collection<MeasurementConstraintsDataType> values) {
        if (values!= null) {
            getMeasurementConstraintsData().addAll(values);
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
        if (draftCopy instanceof MeasurementConstraintsListDataType) {
            final MeasurementConstraintsListDataType copy = ((MeasurementConstraintsListDataType) draftCopy);
            {
                Boolean measurementConstraintsDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.measurementConstraintsData!= null)&&(!this.measurementConstraintsData.isEmpty())));
                if (measurementConstraintsDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<MeasurementConstraintsDataType> sourceMeasurementConstraintsData;
                    sourceMeasurementConstraintsData = (((this.measurementConstraintsData!= null)&&(!this.measurementConstraintsData.isEmpty()))?this.getMeasurementConstraintsData():null);
                    @SuppressWarnings("unchecked")
                    List<MeasurementConstraintsDataType> copyMeasurementConstraintsData = ((List<MeasurementConstraintsDataType> ) strategy.copy(LocatorUtils.property(locator, "measurementConstraintsData", sourceMeasurementConstraintsData), sourceMeasurementConstraintsData, ((this.measurementConstraintsData!= null)&&(!this.measurementConstraintsData.isEmpty()))));
                    copy.measurementConstraintsData = null;
                    if (copyMeasurementConstraintsData!= null) {
                        List<MeasurementConstraintsDataType> uniqueMeasurementConstraintsDatal = copy.getMeasurementConstraintsData();
                        uniqueMeasurementConstraintsDatal.addAll(copyMeasurementConstraintsData);
                    }
                } else {
                    if (measurementConstraintsDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.measurementConstraintsData = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new MeasurementConstraintsListDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final MeasurementConstraintsListDataType that = ((MeasurementConstraintsListDataType) object);
        {
            List<MeasurementConstraintsDataType> leftMeasurementConstraintsData;
            leftMeasurementConstraintsData = (((this.measurementConstraintsData!= null)&&(!this.measurementConstraintsData.isEmpty()))?this.getMeasurementConstraintsData():null);
            List<MeasurementConstraintsDataType> rightMeasurementConstraintsData;
            rightMeasurementConstraintsData = (((that.measurementConstraintsData!= null)&&(!that.measurementConstraintsData.isEmpty()))?that.getMeasurementConstraintsData():null);
            if ((this.measurementConstraintsData!= null)&&(!this.measurementConstraintsData.isEmpty())) {
                if ((that.measurementConstraintsData!= null)&&(!that.measurementConstraintsData.isEmpty())) {
                    if (!leftMeasurementConstraintsData.equals(rightMeasurementConstraintsData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.measurementConstraintsData!= null)&&(!that.measurementConstraintsData.isEmpty())) {
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
            List<MeasurementConstraintsDataType> theMeasurementConstraintsData;
            theMeasurementConstraintsData = (((this.measurementConstraintsData!= null)&&(!this.measurementConstraintsData.isEmpty()))?this.getMeasurementConstraintsData():null);
            if ((this.measurementConstraintsData!= null)&&(!this.measurementConstraintsData.isEmpty())) {
                currentHashCode += theMeasurementConstraintsData.hashCode();
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
            List<MeasurementConstraintsDataType> theMeasurementConstraintsData;
            theMeasurementConstraintsData = (((this.measurementConstraintsData!= null)&&(!this.measurementConstraintsData.isEmpty()))?this.getMeasurementConstraintsData():null);
            strategy.appendField(locator, this, "measurementConstraintsData", buffer, theMeasurementConstraintsData, ((this.measurementConstraintsData!= null)&&(!this.measurementConstraintsData.isEmpty())));
        }
        return buffer;
    }

}
