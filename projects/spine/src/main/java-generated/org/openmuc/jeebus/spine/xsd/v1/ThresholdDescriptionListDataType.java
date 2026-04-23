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
 * <p>Java class for ThresholdDescriptionListDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ThresholdDescriptionListDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://docs.eebus.org/spine/xsd/v1}thresholdDescriptionData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ThresholdDescriptionListDataType", propOrder = {
    "thresholdDescriptionData"
})
public class ThresholdDescriptionListDataType implements Cloneable, CopyTo, ToString
{

    protected List<ThresholdDescriptionDataType> thresholdDescriptionData;

    /**
     * Default no-arg constructor
     * 
     */
    public ThresholdDescriptionListDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public ThresholdDescriptionListDataType(final List<ThresholdDescriptionDataType> thresholdDescriptionData) {
        this.thresholdDescriptionData = thresholdDescriptionData;
    }

    /**
     * Gets the value of the thresholdDescriptionData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the thresholdDescriptionData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getThresholdDescriptionData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ThresholdDescriptionDataType }
     * 
     * 
     */
    public List<ThresholdDescriptionDataType> getThresholdDescriptionData() {
        if (thresholdDescriptionData == null) {
            thresholdDescriptionData = new ArrayList<ThresholdDescriptionDataType>();
        }
        return this.thresholdDescriptionData;
    }

    /**
     * Adds objects to the list of ThresholdDescriptionData using add method
     * 
     * @param values
     *     objects to add to the list ThresholdDescriptionData
     * @return
     *     The class instance
     */
    public ThresholdDescriptionListDataType withThresholdDescriptionData(ThresholdDescriptionDataType... values) {
        if (values!= null) {
            for (ThresholdDescriptionDataType value: values) {
                getThresholdDescriptionData().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of ThresholdDescriptionData using addAll method
     * 
     * @param values
     *     objects to add to the list ThresholdDescriptionData
     * @return
     *     The class instance
     */
    public ThresholdDescriptionListDataType withThresholdDescriptionData(Collection<ThresholdDescriptionDataType> values) {
        if (values!= null) {
            getThresholdDescriptionData().addAll(values);
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
        if (draftCopy instanceof ThresholdDescriptionListDataType) {
            final ThresholdDescriptionListDataType copy = ((ThresholdDescriptionListDataType) draftCopy);
            {
                Boolean thresholdDescriptionDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.thresholdDescriptionData!= null)&&(!this.thresholdDescriptionData.isEmpty())));
                if (thresholdDescriptionDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<ThresholdDescriptionDataType> sourceThresholdDescriptionData;
                    sourceThresholdDescriptionData = (((this.thresholdDescriptionData!= null)&&(!this.thresholdDescriptionData.isEmpty()))?this.getThresholdDescriptionData():null);
                    @SuppressWarnings("unchecked")
                    List<ThresholdDescriptionDataType> copyThresholdDescriptionData = ((List<ThresholdDescriptionDataType> ) strategy.copy(LocatorUtils.property(locator, "thresholdDescriptionData", sourceThresholdDescriptionData), sourceThresholdDescriptionData, ((this.thresholdDescriptionData!= null)&&(!this.thresholdDescriptionData.isEmpty()))));
                    copy.thresholdDescriptionData = null;
                    if (copyThresholdDescriptionData!= null) {
                        List<ThresholdDescriptionDataType> uniqueThresholdDescriptionDatal = copy.getThresholdDescriptionData();
                        uniqueThresholdDescriptionDatal.addAll(copyThresholdDescriptionData);
                    }
                } else {
                    if (thresholdDescriptionDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.thresholdDescriptionData = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new ThresholdDescriptionListDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ThresholdDescriptionListDataType that = ((ThresholdDescriptionListDataType) object);
        {
            List<ThresholdDescriptionDataType> leftThresholdDescriptionData;
            leftThresholdDescriptionData = (((this.thresholdDescriptionData!= null)&&(!this.thresholdDescriptionData.isEmpty()))?this.getThresholdDescriptionData():null);
            List<ThresholdDescriptionDataType> rightThresholdDescriptionData;
            rightThresholdDescriptionData = (((that.thresholdDescriptionData!= null)&&(!that.thresholdDescriptionData.isEmpty()))?that.getThresholdDescriptionData():null);
            if ((this.thresholdDescriptionData!= null)&&(!this.thresholdDescriptionData.isEmpty())) {
                if ((that.thresholdDescriptionData!= null)&&(!that.thresholdDescriptionData.isEmpty())) {
                    if (!leftThresholdDescriptionData.equals(rightThresholdDescriptionData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.thresholdDescriptionData!= null)&&(!that.thresholdDescriptionData.isEmpty())) {
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
            List<ThresholdDescriptionDataType> theThresholdDescriptionData;
            theThresholdDescriptionData = (((this.thresholdDescriptionData!= null)&&(!this.thresholdDescriptionData.isEmpty()))?this.getThresholdDescriptionData():null);
            if ((this.thresholdDescriptionData!= null)&&(!this.thresholdDescriptionData.isEmpty())) {
                currentHashCode += theThresholdDescriptionData.hashCode();
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
            List<ThresholdDescriptionDataType> theThresholdDescriptionData;
            theThresholdDescriptionData = (((this.thresholdDescriptionData!= null)&&(!this.thresholdDescriptionData.isEmpty()))?this.getThresholdDescriptionData():null);
            strategy.appendField(locator, this, "thresholdDescriptionData", buffer, theThresholdDescriptionData, ((this.thresholdDescriptionData!= null)&&(!this.thresholdDescriptionData.isEmpty())));
        }
        return buffer;
    }

}
