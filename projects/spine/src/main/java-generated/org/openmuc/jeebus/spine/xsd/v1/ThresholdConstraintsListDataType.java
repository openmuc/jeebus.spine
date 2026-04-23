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
 * <p>Java class for ThresholdConstraintsListDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ThresholdConstraintsListDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://docs.eebus.org/spine/xsd/v1}thresholdConstraintsData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ThresholdConstraintsListDataType", propOrder = {
    "thresholdConstraintsData"
})
public class ThresholdConstraintsListDataType implements Cloneable, CopyTo, ToString
{

    protected List<ThresholdConstraintsDataType> thresholdConstraintsData;

    /**
     * Default no-arg constructor
     * 
     */
    public ThresholdConstraintsListDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public ThresholdConstraintsListDataType(final List<ThresholdConstraintsDataType> thresholdConstraintsData) {
        this.thresholdConstraintsData = thresholdConstraintsData;
    }

    /**
     * Gets the value of the thresholdConstraintsData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the thresholdConstraintsData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getThresholdConstraintsData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ThresholdConstraintsDataType }
     * 
     * 
     */
    public List<ThresholdConstraintsDataType> getThresholdConstraintsData() {
        if (thresholdConstraintsData == null) {
            thresholdConstraintsData = new ArrayList<ThresholdConstraintsDataType>();
        }
        return this.thresholdConstraintsData;
    }

    /**
     * Adds objects to the list of ThresholdConstraintsData using add method
     * 
     * @param values
     *     objects to add to the list ThresholdConstraintsData
     * @return
     *     The class instance
     */
    public ThresholdConstraintsListDataType withThresholdConstraintsData(ThresholdConstraintsDataType... values) {
        if (values!= null) {
            for (ThresholdConstraintsDataType value: values) {
                getThresholdConstraintsData().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of ThresholdConstraintsData using addAll method
     * 
     * @param values
     *     objects to add to the list ThresholdConstraintsData
     * @return
     *     The class instance
     */
    public ThresholdConstraintsListDataType withThresholdConstraintsData(Collection<ThresholdConstraintsDataType> values) {
        if (values!= null) {
            getThresholdConstraintsData().addAll(values);
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
        if (draftCopy instanceof ThresholdConstraintsListDataType) {
            final ThresholdConstraintsListDataType copy = ((ThresholdConstraintsListDataType) draftCopy);
            {
                Boolean thresholdConstraintsDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.thresholdConstraintsData!= null)&&(!this.thresholdConstraintsData.isEmpty())));
                if (thresholdConstraintsDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<ThresholdConstraintsDataType> sourceThresholdConstraintsData;
                    sourceThresholdConstraintsData = (((this.thresholdConstraintsData!= null)&&(!this.thresholdConstraintsData.isEmpty()))?this.getThresholdConstraintsData():null);
                    @SuppressWarnings("unchecked")
                    List<ThresholdConstraintsDataType> copyThresholdConstraintsData = ((List<ThresholdConstraintsDataType> ) strategy.copy(LocatorUtils.property(locator, "thresholdConstraintsData", sourceThresholdConstraintsData), sourceThresholdConstraintsData, ((this.thresholdConstraintsData!= null)&&(!this.thresholdConstraintsData.isEmpty()))));
                    copy.thresholdConstraintsData = null;
                    if (copyThresholdConstraintsData!= null) {
                        List<ThresholdConstraintsDataType> uniqueThresholdConstraintsDatal = copy.getThresholdConstraintsData();
                        uniqueThresholdConstraintsDatal.addAll(copyThresholdConstraintsData);
                    }
                } else {
                    if (thresholdConstraintsDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.thresholdConstraintsData = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new ThresholdConstraintsListDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ThresholdConstraintsListDataType that = ((ThresholdConstraintsListDataType) object);
        {
            List<ThresholdConstraintsDataType> leftThresholdConstraintsData;
            leftThresholdConstraintsData = (((this.thresholdConstraintsData!= null)&&(!this.thresholdConstraintsData.isEmpty()))?this.getThresholdConstraintsData():null);
            List<ThresholdConstraintsDataType> rightThresholdConstraintsData;
            rightThresholdConstraintsData = (((that.thresholdConstraintsData!= null)&&(!that.thresholdConstraintsData.isEmpty()))?that.getThresholdConstraintsData():null);
            if ((this.thresholdConstraintsData!= null)&&(!this.thresholdConstraintsData.isEmpty())) {
                if ((that.thresholdConstraintsData!= null)&&(!that.thresholdConstraintsData.isEmpty())) {
                    if (!leftThresholdConstraintsData.equals(rightThresholdConstraintsData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.thresholdConstraintsData!= null)&&(!that.thresholdConstraintsData.isEmpty())) {
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
            List<ThresholdConstraintsDataType> theThresholdConstraintsData;
            theThresholdConstraintsData = (((this.thresholdConstraintsData!= null)&&(!this.thresholdConstraintsData.isEmpty()))?this.getThresholdConstraintsData():null);
            if ((this.thresholdConstraintsData!= null)&&(!this.thresholdConstraintsData.isEmpty())) {
                currentHashCode += theThresholdConstraintsData.hashCode();
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
            List<ThresholdConstraintsDataType> theThresholdConstraintsData;
            theThresholdConstraintsData = (((this.thresholdConstraintsData!= null)&&(!this.thresholdConstraintsData.isEmpty()))?this.getThresholdConstraintsData():null);
            strategy.appendField(locator, this, "thresholdConstraintsData", buffer, theThresholdConstraintsData, ((this.thresholdConstraintsData!= null)&&(!this.thresholdConstraintsData.isEmpty())));
        }
        return buffer;
    }

}
