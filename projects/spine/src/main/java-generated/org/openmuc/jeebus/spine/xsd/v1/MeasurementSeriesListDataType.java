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
 * <p>Java class for MeasurementSeriesListDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MeasurementSeriesListDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://docs.eebus.org/spine/xsd/v1}measurementSeriesData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeasurementSeriesListDataType", propOrder = {
    "measurementSeriesData"
})
public class MeasurementSeriesListDataType implements Cloneable, CopyTo, ToString
{

    protected List<MeasurementSeriesDataType> measurementSeriesData;

    /**
     * Default no-arg constructor
     * 
     */
    public MeasurementSeriesListDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public MeasurementSeriesListDataType(final List<MeasurementSeriesDataType> measurementSeriesData) {
        this.measurementSeriesData = measurementSeriesData;
    }

    /**
     * Gets the value of the measurementSeriesData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the measurementSeriesData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeasurementSeriesData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementSeriesDataType }
     * 
     * 
     */
    public List<MeasurementSeriesDataType> getMeasurementSeriesData() {
        if (measurementSeriesData == null) {
            measurementSeriesData = new ArrayList<MeasurementSeriesDataType>();
        }
        return this.measurementSeriesData;
    }

    /**
     * Adds objects to the list of MeasurementSeriesData using add method
     * 
     * @param values
     *     objects to add to the list MeasurementSeriesData
     * @return
     *     The class instance
     */
    public MeasurementSeriesListDataType withMeasurementSeriesData(MeasurementSeriesDataType... values) {
        if (values!= null) {
            for (MeasurementSeriesDataType value: values) {
                getMeasurementSeriesData().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of MeasurementSeriesData using addAll method
     * 
     * @param values
     *     objects to add to the list MeasurementSeriesData
     * @return
     *     The class instance
     */
    public MeasurementSeriesListDataType withMeasurementSeriesData(Collection<MeasurementSeriesDataType> values) {
        if (values!= null) {
            getMeasurementSeriesData().addAll(values);
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
        if (draftCopy instanceof MeasurementSeriesListDataType) {
            final MeasurementSeriesListDataType copy = ((MeasurementSeriesListDataType) draftCopy);
            {
                Boolean measurementSeriesDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.measurementSeriesData!= null)&&(!this.measurementSeriesData.isEmpty())));
                if (measurementSeriesDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<MeasurementSeriesDataType> sourceMeasurementSeriesData;
                    sourceMeasurementSeriesData = (((this.measurementSeriesData!= null)&&(!this.measurementSeriesData.isEmpty()))?this.getMeasurementSeriesData():null);
                    @SuppressWarnings("unchecked")
                    List<MeasurementSeriesDataType> copyMeasurementSeriesData = ((List<MeasurementSeriesDataType> ) strategy.copy(LocatorUtils.property(locator, "measurementSeriesData", sourceMeasurementSeriesData), sourceMeasurementSeriesData, ((this.measurementSeriesData!= null)&&(!this.measurementSeriesData.isEmpty()))));
                    copy.measurementSeriesData = null;
                    if (copyMeasurementSeriesData!= null) {
                        List<MeasurementSeriesDataType> uniqueMeasurementSeriesDatal = copy.getMeasurementSeriesData();
                        uniqueMeasurementSeriesDatal.addAll(copyMeasurementSeriesData);
                    }
                } else {
                    if (measurementSeriesDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.measurementSeriesData = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new MeasurementSeriesListDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final MeasurementSeriesListDataType that = ((MeasurementSeriesListDataType) object);
        {
            List<MeasurementSeriesDataType> leftMeasurementSeriesData;
            leftMeasurementSeriesData = (((this.measurementSeriesData!= null)&&(!this.measurementSeriesData.isEmpty()))?this.getMeasurementSeriesData():null);
            List<MeasurementSeriesDataType> rightMeasurementSeriesData;
            rightMeasurementSeriesData = (((that.measurementSeriesData!= null)&&(!that.measurementSeriesData.isEmpty()))?that.getMeasurementSeriesData():null);
            if ((this.measurementSeriesData!= null)&&(!this.measurementSeriesData.isEmpty())) {
                if ((that.measurementSeriesData!= null)&&(!that.measurementSeriesData.isEmpty())) {
                    if (!leftMeasurementSeriesData.equals(rightMeasurementSeriesData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.measurementSeriesData!= null)&&(!that.measurementSeriesData.isEmpty())) {
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
            List<MeasurementSeriesDataType> theMeasurementSeriesData;
            theMeasurementSeriesData = (((this.measurementSeriesData!= null)&&(!this.measurementSeriesData.isEmpty()))?this.getMeasurementSeriesData():null);
            if ((this.measurementSeriesData!= null)&&(!this.measurementSeriesData.isEmpty())) {
                currentHashCode += theMeasurementSeriesData.hashCode();
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
            List<MeasurementSeriesDataType> theMeasurementSeriesData;
            theMeasurementSeriesData = (((this.measurementSeriesData!= null)&&(!this.measurementSeriesData.isEmpty()))?this.getMeasurementSeriesData():null);
            strategy.appendField(locator, this, "measurementSeriesData", buffer, theMeasurementSeriesData, ((this.measurementSeriesData!= null)&&(!this.measurementSeriesData.isEmpty())));
        }
        return buffer;
    }

}
