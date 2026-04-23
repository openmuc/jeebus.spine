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
 * <p>Java class for MeasurementThresholdRelationListDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MeasurementThresholdRelationListDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://docs.eebus.org/spine/xsd/v1}measurementThresholdRelationData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeasurementThresholdRelationListDataType", propOrder = {
    "measurementThresholdRelationData"
})
public class MeasurementThresholdRelationListDataType implements Cloneable, CopyTo, ToString
{

    protected List<MeasurementThresholdRelationDataType> measurementThresholdRelationData;

    /**
     * Default no-arg constructor
     * 
     */
    public MeasurementThresholdRelationListDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public MeasurementThresholdRelationListDataType(final List<MeasurementThresholdRelationDataType> measurementThresholdRelationData) {
        this.measurementThresholdRelationData = measurementThresholdRelationData;
    }

    /**
     * Gets the value of the measurementThresholdRelationData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the measurementThresholdRelationData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeasurementThresholdRelationData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementThresholdRelationDataType }
     * 
     * 
     */
    public List<MeasurementThresholdRelationDataType> getMeasurementThresholdRelationData() {
        if (measurementThresholdRelationData == null) {
            measurementThresholdRelationData = new ArrayList<MeasurementThresholdRelationDataType>();
        }
        return this.measurementThresholdRelationData;
    }

    /**
     * Adds objects to the list of MeasurementThresholdRelationData using add method
     * 
     * @param values
     *     objects to add to the list MeasurementThresholdRelationData
     * @return
     *     The class instance
     */
    public MeasurementThresholdRelationListDataType withMeasurementThresholdRelationData(MeasurementThresholdRelationDataType... values) {
        if (values!= null) {
            for (MeasurementThresholdRelationDataType value: values) {
                getMeasurementThresholdRelationData().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of MeasurementThresholdRelationData using addAll method
     * 
     * @param values
     *     objects to add to the list MeasurementThresholdRelationData
     * @return
     *     The class instance
     */
    public MeasurementThresholdRelationListDataType withMeasurementThresholdRelationData(Collection<MeasurementThresholdRelationDataType> values) {
        if (values!= null) {
            getMeasurementThresholdRelationData().addAll(values);
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
        if (draftCopy instanceof MeasurementThresholdRelationListDataType) {
            final MeasurementThresholdRelationListDataType copy = ((MeasurementThresholdRelationListDataType) draftCopy);
            {
                Boolean measurementThresholdRelationDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.measurementThresholdRelationData!= null)&&(!this.measurementThresholdRelationData.isEmpty())));
                if (measurementThresholdRelationDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<MeasurementThresholdRelationDataType> sourceMeasurementThresholdRelationData;
                    sourceMeasurementThresholdRelationData = (((this.measurementThresholdRelationData!= null)&&(!this.measurementThresholdRelationData.isEmpty()))?this.getMeasurementThresholdRelationData():null);
                    @SuppressWarnings("unchecked")
                    List<MeasurementThresholdRelationDataType> copyMeasurementThresholdRelationData = ((List<MeasurementThresholdRelationDataType> ) strategy.copy(LocatorUtils.property(locator, "measurementThresholdRelationData", sourceMeasurementThresholdRelationData), sourceMeasurementThresholdRelationData, ((this.measurementThresholdRelationData!= null)&&(!this.measurementThresholdRelationData.isEmpty()))));
                    copy.measurementThresholdRelationData = null;
                    if (copyMeasurementThresholdRelationData!= null) {
                        List<MeasurementThresholdRelationDataType> uniqueMeasurementThresholdRelationDatal = copy.getMeasurementThresholdRelationData();
                        uniqueMeasurementThresholdRelationDatal.addAll(copyMeasurementThresholdRelationData);
                    }
                } else {
                    if (measurementThresholdRelationDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.measurementThresholdRelationData = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new MeasurementThresholdRelationListDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final MeasurementThresholdRelationListDataType that = ((MeasurementThresholdRelationListDataType) object);
        {
            List<MeasurementThresholdRelationDataType> leftMeasurementThresholdRelationData;
            leftMeasurementThresholdRelationData = (((this.measurementThresholdRelationData!= null)&&(!this.measurementThresholdRelationData.isEmpty()))?this.getMeasurementThresholdRelationData():null);
            List<MeasurementThresholdRelationDataType> rightMeasurementThresholdRelationData;
            rightMeasurementThresholdRelationData = (((that.measurementThresholdRelationData!= null)&&(!that.measurementThresholdRelationData.isEmpty()))?that.getMeasurementThresholdRelationData():null);
            if ((this.measurementThresholdRelationData!= null)&&(!this.measurementThresholdRelationData.isEmpty())) {
                if ((that.measurementThresholdRelationData!= null)&&(!that.measurementThresholdRelationData.isEmpty())) {
                    if (!leftMeasurementThresholdRelationData.equals(rightMeasurementThresholdRelationData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.measurementThresholdRelationData!= null)&&(!that.measurementThresholdRelationData.isEmpty())) {
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
            List<MeasurementThresholdRelationDataType> theMeasurementThresholdRelationData;
            theMeasurementThresholdRelationData = (((this.measurementThresholdRelationData!= null)&&(!this.measurementThresholdRelationData.isEmpty()))?this.getMeasurementThresholdRelationData():null);
            if ((this.measurementThresholdRelationData!= null)&&(!this.measurementThresholdRelationData.isEmpty())) {
                currentHashCode += theMeasurementThresholdRelationData.hashCode();
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
            List<MeasurementThresholdRelationDataType> theMeasurementThresholdRelationData;
            theMeasurementThresholdRelationData = (((this.measurementThresholdRelationData!= null)&&(!this.measurementThresholdRelationData.isEmpty()))?this.getMeasurementThresholdRelationData():null);
            strategy.appendField(locator, this, "measurementThresholdRelationData", buffer, theMeasurementThresholdRelationData, ((this.measurementThresholdRelationData!= null)&&(!this.measurementThresholdRelationData.isEmpty())));
        }
        return buffer;
    }

}
