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
 * <p>Java class for ThresholdListDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ThresholdListDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://docs.eebus.org/spine/xsd/v1}thresholdData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ThresholdListDataType", propOrder = {
    "thresholdData"
})
public class ThresholdListDataType implements Cloneable, CopyTo, ToString
{

    protected List<ThresholdDataType> thresholdData;

    /**
     * Default no-arg constructor
     * 
     */
    public ThresholdListDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public ThresholdListDataType(final List<ThresholdDataType> thresholdData) {
        this.thresholdData = thresholdData;
    }

    /**
     * Gets the value of the thresholdData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the thresholdData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getThresholdData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ThresholdDataType }
     * 
     * 
     */
    public List<ThresholdDataType> getThresholdData() {
        if (thresholdData == null) {
            thresholdData = new ArrayList<ThresholdDataType>();
        }
        return this.thresholdData;
    }

    /**
     * Adds objects to the list of ThresholdData using add method
     * 
     * @param values
     *     objects to add to the list ThresholdData
     * @return
     *     The class instance
     */
    public ThresholdListDataType withThresholdData(ThresholdDataType... values) {
        if (values!= null) {
            for (ThresholdDataType value: values) {
                getThresholdData().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of ThresholdData using addAll method
     * 
     * @param values
     *     objects to add to the list ThresholdData
     * @return
     *     The class instance
     */
    public ThresholdListDataType withThresholdData(Collection<ThresholdDataType> values) {
        if (values!= null) {
            getThresholdData().addAll(values);
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
        if (draftCopy instanceof ThresholdListDataType) {
            final ThresholdListDataType copy = ((ThresholdListDataType) draftCopy);
            {
                Boolean thresholdDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.thresholdData!= null)&&(!this.thresholdData.isEmpty())));
                if (thresholdDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<ThresholdDataType> sourceThresholdData;
                    sourceThresholdData = (((this.thresholdData!= null)&&(!this.thresholdData.isEmpty()))?this.getThresholdData():null);
                    @SuppressWarnings("unchecked")
                    List<ThresholdDataType> copyThresholdData = ((List<ThresholdDataType> ) strategy.copy(LocatorUtils.property(locator, "thresholdData", sourceThresholdData), sourceThresholdData, ((this.thresholdData!= null)&&(!this.thresholdData.isEmpty()))));
                    copy.thresholdData = null;
                    if (copyThresholdData!= null) {
                        List<ThresholdDataType> uniqueThresholdDatal = copy.getThresholdData();
                        uniqueThresholdDatal.addAll(copyThresholdData);
                    }
                } else {
                    if (thresholdDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.thresholdData = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new ThresholdListDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ThresholdListDataType that = ((ThresholdListDataType) object);
        {
            List<ThresholdDataType> leftThresholdData;
            leftThresholdData = (((this.thresholdData!= null)&&(!this.thresholdData.isEmpty()))?this.getThresholdData():null);
            List<ThresholdDataType> rightThresholdData;
            rightThresholdData = (((that.thresholdData!= null)&&(!that.thresholdData.isEmpty()))?that.getThresholdData():null);
            if ((this.thresholdData!= null)&&(!this.thresholdData.isEmpty())) {
                if ((that.thresholdData!= null)&&(!that.thresholdData.isEmpty())) {
                    if (!leftThresholdData.equals(rightThresholdData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.thresholdData!= null)&&(!that.thresholdData.isEmpty())) {
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
            List<ThresholdDataType> theThresholdData;
            theThresholdData = (((this.thresholdData!= null)&&(!this.thresholdData.isEmpty()))?this.getThresholdData():null);
            if ((this.thresholdData!= null)&&(!this.thresholdData.isEmpty())) {
                currentHashCode += theThresholdData.hashCode();
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
            List<ThresholdDataType> theThresholdData;
            theThresholdData = (((this.thresholdData!= null)&&(!this.thresholdData.isEmpty()))?this.getThresholdData():null);
            strategy.appendField(locator, this, "thresholdData", buffer, theThresholdData, ((this.thresholdData!= null)&&(!this.thresholdData.isEmpty())));
        }
        return buffer;
    }

}
