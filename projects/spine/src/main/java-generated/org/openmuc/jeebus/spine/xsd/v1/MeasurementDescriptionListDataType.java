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
 * <p>Java class for MeasurementDescriptionListDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MeasurementDescriptionListDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://docs.eebus.org/spine/xsd/v1}measurementDescriptionData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeasurementDescriptionListDataType", propOrder = {
    "measurementDescriptionData"
})
public class MeasurementDescriptionListDataType implements Cloneable, CopyTo, ToString
{

    protected List<MeasurementDescriptionDataType> measurementDescriptionData;

    /**
     * Default no-arg constructor
     * 
     */
    public MeasurementDescriptionListDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public MeasurementDescriptionListDataType(final List<MeasurementDescriptionDataType> measurementDescriptionData) {
        this.measurementDescriptionData = measurementDescriptionData;
    }

    /**
     * Gets the value of the measurementDescriptionData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the measurementDescriptionData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeasurementDescriptionData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementDescriptionDataType }
     * 
     * 
     */
    public List<MeasurementDescriptionDataType> getMeasurementDescriptionData() {
        if (measurementDescriptionData == null) {
            measurementDescriptionData = new ArrayList<MeasurementDescriptionDataType>();
        }
        return this.measurementDescriptionData;
    }

    /**
     * Adds objects to the list of MeasurementDescriptionData using add method
     * 
     * @param values
     *     objects to add to the list MeasurementDescriptionData
     * @return
     *     The class instance
     */
    public MeasurementDescriptionListDataType withMeasurementDescriptionData(MeasurementDescriptionDataType... values) {
        if (values!= null) {
            for (MeasurementDescriptionDataType value: values) {
                getMeasurementDescriptionData().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of MeasurementDescriptionData using addAll method
     * 
     * @param values
     *     objects to add to the list MeasurementDescriptionData
     * @return
     *     The class instance
     */
    public MeasurementDescriptionListDataType withMeasurementDescriptionData(Collection<MeasurementDescriptionDataType> values) {
        if (values!= null) {
            getMeasurementDescriptionData().addAll(values);
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
        if (draftCopy instanceof MeasurementDescriptionListDataType) {
            final MeasurementDescriptionListDataType copy = ((MeasurementDescriptionListDataType) draftCopy);
            {
                Boolean measurementDescriptionDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.measurementDescriptionData!= null)&&(!this.measurementDescriptionData.isEmpty())));
                if (measurementDescriptionDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<MeasurementDescriptionDataType> sourceMeasurementDescriptionData;
                    sourceMeasurementDescriptionData = (((this.measurementDescriptionData!= null)&&(!this.measurementDescriptionData.isEmpty()))?this.getMeasurementDescriptionData():null);
                    @SuppressWarnings("unchecked")
                    List<MeasurementDescriptionDataType> copyMeasurementDescriptionData = ((List<MeasurementDescriptionDataType> ) strategy.copy(LocatorUtils.property(locator, "measurementDescriptionData", sourceMeasurementDescriptionData), sourceMeasurementDescriptionData, ((this.measurementDescriptionData!= null)&&(!this.measurementDescriptionData.isEmpty()))));
                    copy.measurementDescriptionData = null;
                    if (copyMeasurementDescriptionData!= null) {
                        List<MeasurementDescriptionDataType> uniqueMeasurementDescriptionDatal = copy.getMeasurementDescriptionData();
                        uniqueMeasurementDescriptionDatal.addAll(copyMeasurementDescriptionData);
                    }
                } else {
                    if (measurementDescriptionDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.measurementDescriptionData = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new MeasurementDescriptionListDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final MeasurementDescriptionListDataType that = ((MeasurementDescriptionListDataType) object);
        {
            List<MeasurementDescriptionDataType> leftMeasurementDescriptionData;
            leftMeasurementDescriptionData = (((this.measurementDescriptionData!= null)&&(!this.measurementDescriptionData.isEmpty()))?this.getMeasurementDescriptionData():null);
            List<MeasurementDescriptionDataType> rightMeasurementDescriptionData;
            rightMeasurementDescriptionData = (((that.measurementDescriptionData!= null)&&(!that.measurementDescriptionData.isEmpty()))?that.getMeasurementDescriptionData():null);
            if ((this.measurementDescriptionData!= null)&&(!this.measurementDescriptionData.isEmpty())) {
                if ((that.measurementDescriptionData!= null)&&(!that.measurementDescriptionData.isEmpty())) {
                    if (!leftMeasurementDescriptionData.equals(rightMeasurementDescriptionData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.measurementDescriptionData!= null)&&(!that.measurementDescriptionData.isEmpty())) {
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
            List<MeasurementDescriptionDataType> theMeasurementDescriptionData;
            theMeasurementDescriptionData = (((this.measurementDescriptionData!= null)&&(!this.measurementDescriptionData.isEmpty()))?this.getMeasurementDescriptionData():null);
            if ((this.measurementDescriptionData!= null)&&(!this.measurementDescriptionData.isEmpty())) {
                currentHashCode += theMeasurementDescriptionData.hashCode();
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
            List<MeasurementDescriptionDataType> theMeasurementDescriptionData;
            theMeasurementDescriptionData = (((this.measurementDescriptionData!= null)&&(!this.measurementDescriptionData.isEmpty()))?this.getMeasurementDescriptionData():null);
            strategy.appendField(locator, this, "measurementDescriptionData", buffer, theMeasurementDescriptionData, ((this.measurementDescriptionData!= null)&&(!this.measurementDescriptionData.isEmpty())));
        }
        return buffer;
    }

}
