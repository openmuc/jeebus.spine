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
 * <p>Java class for MeasurementListDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MeasurementListDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://docs.eebus.org/spine/xsd/v1}measurementData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeasurementListDataType", propOrder = {
    "measurementData"
})
public class MeasurementListDataType implements Cloneable, CopyTo, ToString
{

    protected List<MeasurementDataType> measurementData;

    /**
     * Default no-arg constructor
     * 
     */
    public MeasurementListDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public MeasurementListDataType(final List<MeasurementDataType> measurementData) {
        this.measurementData = measurementData;
    }

    /**
     * Gets the value of the measurementData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the measurementData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeasurementData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementDataType }
     * 
     * 
     */
    public List<MeasurementDataType> getMeasurementData() {
        if (measurementData == null) {
            measurementData = new ArrayList<MeasurementDataType>();
        }
        return this.measurementData;
    }

    /**
     * Adds objects to the list of MeasurementData using add method
     * 
     * @param values
     *     objects to add to the list MeasurementData
     * @return
     *     The class instance
     */
    public MeasurementListDataType withMeasurementData(MeasurementDataType... values) {
        if (values!= null) {
            for (MeasurementDataType value: values) {
                getMeasurementData().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of MeasurementData using addAll method
     * 
     * @param values
     *     objects to add to the list MeasurementData
     * @return
     *     The class instance
     */
    public MeasurementListDataType withMeasurementData(Collection<MeasurementDataType> values) {
        if (values!= null) {
            getMeasurementData().addAll(values);
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
        if (draftCopy instanceof MeasurementListDataType) {
            final MeasurementListDataType copy = ((MeasurementListDataType) draftCopy);
            {
                Boolean measurementDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.measurementData!= null)&&(!this.measurementData.isEmpty())));
                if (measurementDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<MeasurementDataType> sourceMeasurementData;
                    sourceMeasurementData = (((this.measurementData!= null)&&(!this.measurementData.isEmpty()))?this.getMeasurementData():null);
                    @SuppressWarnings("unchecked")
                    List<MeasurementDataType> copyMeasurementData = ((List<MeasurementDataType> ) strategy.copy(LocatorUtils.property(locator, "measurementData", sourceMeasurementData), sourceMeasurementData, ((this.measurementData!= null)&&(!this.measurementData.isEmpty()))));
                    copy.measurementData = null;
                    if (copyMeasurementData!= null) {
                        List<MeasurementDataType> uniqueMeasurementDatal = copy.getMeasurementData();
                        uniqueMeasurementDatal.addAll(copyMeasurementData);
                    }
                } else {
                    if (measurementDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.measurementData = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new MeasurementListDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final MeasurementListDataType that = ((MeasurementListDataType) object);
        {
            List<MeasurementDataType> leftMeasurementData;
            leftMeasurementData = (((this.measurementData!= null)&&(!this.measurementData.isEmpty()))?this.getMeasurementData():null);
            List<MeasurementDataType> rightMeasurementData;
            rightMeasurementData = (((that.measurementData!= null)&&(!that.measurementData.isEmpty()))?that.getMeasurementData():null);
            if ((this.measurementData!= null)&&(!this.measurementData.isEmpty())) {
                if ((that.measurementData!= null)&&(!that.measurementData.isEmpty())) {
                    if (!leftMeasurementData.equals(rightMeasurementData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.measurementData!= null)&&(!that.measurementData.isEmpty())) {
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
            List<MeasurementDataType> theMeasurementData;
            theMeasurementData = (((this.measurementData!= null)&&(!this.measurementData.isEmpty()))?this.getMeasurementData():null);
            if ((this.measurementData!= null)&&(!this.measurementData.isEmpty())) {
                currentHashCode += theMeasurementData.hashCode();
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
            List<MeasurementDataType> theMeasurementData;
            theMeasurementData = (((this.measurementData!= null)&&(!this.measurementData.isEmpty()))?this.getMeasurementData():null);
            strategy.appendField(locator, this, "measurementData", buffer, theMeasurementData, ((this.measurementData!= null)&&(!this.measurementData.isEmpty())));
        }
        return buffer;
    }

}
