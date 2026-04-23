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
 * <p>Java class for HvacSystemFunctionPowerSequenceRelationListDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HvacSystemFunctionPowerSequenceRelationListDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://docs.eebus.org/spine/xsd/v1}hvacSystemFunctionPowerSequenceRelationData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HvacSystemFunctionPowerSequenceRelationListDataType", propOrder = {
    "hvacSystemFunctionPowerSequenceRelationData"
})
public class HvacSystemFunctionPowerSequenceRelationListDataType implements Cloneable, CopyTo, ToString
{

    protected List<HvacSystemFunctionPowerSequenceRelationDataType> hvacSystemFunctionPowerSequenceRelationData;

    /**
     * Default no-arg constructor
     * 
     */
    public HvacSystemFunctionPowerSequenceRelationListDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public HvacSystemFunctionPowerSequenceRelationListDataType(final List<HvacSystemFunctionPowerSequenceRelationDataType> hvacSystemFunctionPowerSequenceRelationData) {
        this.hvacSystemFunctionPowerSequenceRelationData = hvacSystemFunctionPowerSequenceRelationData;
    }

    /**
     * Gets the value of the hvacSystemFunctionPowerSequenceRelationData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the hvacSystemFunctionPowerSequenceRelationData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHvacSystemFunctionPowerSequenceRelationData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HvacSystemFunctionPowerSequenceRelationDataType }
     * 
     * 
     */
    public List<HvacSystemFunctionPowerSequenceRelationDataType> getHvacSystemFunctionPowerSequenceRelationData() {
        if (hvacSystemFunctionPowerSequenceRelationData == null) {
            hvacSystemFunctionPowerSequenceRelationData = new ArrayList<HvacSystemFunctionPowerSequenceRelationDataType>();
        }
        return this.hvacSystemFunctionPowerSequenceRelationData;
    }

    /**
     * Adds objects to the list of HvacSystemFunctionPowerSequenceRelationData using add method
     * 
     * @param values
     *     objects to add to the list HvacSystemFunctionPowerSequenceRelationData
     * @return
     *     The class instance
     */
    public HvacSystemFunctionPowerSequenceRelationListDataType withHvacSystemFunctionPowerSequenceRelationData(HvacSystemFunctionPowerSequenceRelationDataType... values) {
        if (values!= null) {
            for (HvacSystemFunctionPowerSequenceRelationDataType value: values) {
                getHvacSystemFunctionPowerSequenceRelationData().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of HvacSystemFunctionPowerSequenceRelationData using addAll method
     * 
     * @param values
     *     objects to add to the list HvacSystemFunctionPowerSequenceRelationData
     * @return
     *     The class instance
     */
    public HvacSystemFunctionPowerSequenceRelationListDataType withHvacSystemFunctionPowerSequenceRelationData(Collection<HvacSystemFunctionPowerSequenceRelationDataType> values) {
        if (values!= null) {
            getHvacSystemFunctionPowerSequenceRelationData().addAll(values);
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
        if (draftCopy instanceof HvacSystemFunctionPowerSequenceRelationListDataType) {
            final HvacSystemFunctionPowerSequenceRelationListDataType copy = ((HvacSystemFunctionPowerSequenceRelationListDataType) draftCopy);
            {
                Boolean hvacSystemFunctionPowerSequenceRelationDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.hvacSystemFunctionPowerSequenceRelationData!= null)&&(!this.hvacSystemFunctionPowerSequenceRelationData.isEmpty())));
                if (hvacSystemFunctionPowerSequenceRelationDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<HvacSystemFunctionPowerSequenceRelationDataType> sourceHvacSystemFunctionPowerSequenceRelationData;
                    sourceHvacSystemFunctionPowerSequenceRelationData = (((this.hvacSystemFunctionPowerSequenceRelationData!= null)&&(!this.hvacSystemFunctionPowerSequenceRelationData.isEmpty()))?this.getHvacSystemFunctionPowerSequenceRelationData():null);
                    @SuppressWarnings("unchecked")
                    List<HvacSystemFunctionPowerSequenceRelationDataType> copyHvacSystemFunctionPowerSequenceRelationData = ((List<HvacSystemFunctionPowerSequenceRelationDataType> ) strategy.copy(LocatorUtils.property(locator, "hvacSystemFunctionPowerSequenceRelationData", sourceHvacSystemFunctionPowerSequenceRelationData), sourceHvacSystemFunctionPowerSequenceRelationData, ((this.hvacSystemFunctionPowerSequenceRelationData!= null)&&(!this.hvacSystemFunctionPowerSequenceRelationData.isEmpty()))));
                    copy.hvacSystemFunctionPowerSequenceRelationData = null;
                    if (copyHvacSystemFunctionPowerSequenceRelationData!= null) {
                        List<HvacSystemFunctionPowerSequenceRelationDataType> uniqueHvacSystemFunctionPowerSequenceRelationDatal = copy.getHvacSystemFunctionPowerSequenceRelationData();
                        uniqueHvacSystemFunctionPowerSequenceRelationDatal.addAll(copyHvacSystemFunctionPowerSequenceRelationData);
                    }
                } else {
                    if (hvacSystemFunctionPowerSequenceRelationDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.hvacSystemFunctionPowerSequenceRelationData = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new HvacSystemFunctionPowerSequenceRelationListDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final HvacSystemFunctionPowerSequenceRelationListDataType that = ((HvacSystemFunctionPowerSequenceRelationListDataType) object);
        {
            List<HvacSystemFunctionPowerSequenceRelationDataType> leftHvacSystemFunctionPowerSequenceRelationData;
            leftHvacSystemFunctionPowerSequenceRelationData = (((this.hvacSystemFunctionPowerSequenceRelationData!= null)&&(!this.hvacSystemFunctionPowerSequenceRelationData.isEmpty()))?this.getHvacSystemFunctionPowerSequenceRelationData():null);
            List<HvacSystemFunctionPowerSequenceRelationDataType> rightHvacSystemFunctionPowerSequenceRelationData;
            rightHvacSystemFunctionPowerSequenceRelationData = (((that.hvacSystemFunctionPowerSequenceRelationData!= null)&&(!that.hvacSystemFunctionPowerSequenceRelationData.isEmpty()))?that.getHvacSystemFunctionPowerSequenceRelationData():null);
            if ((this.hvacSystemFunctionPowerSequenceRelationData!= null)&&(!this.hvacSystemFunctionPowerSequenceRelationData.isEmpty())) {
                if ((that.hvacSystemFunctionPowerSequenceRelationData!= null)&&(!that.hvacSystemFunctionPowerSequenceRelationData.isEmpty())) {
                    if (!leftHvacSystemFunctionPowerSequenceRelationData.equals(rightHvacSystemFunctionPowerSequenceRelationData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.hvacSystemFunctionPowerSequenceRelationData!= null)&&(!that.hvacSystemFunctionPowerSequenceRelationData.isEmpty())) {
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
            List<HvacSystemFunctionPowerSequenceRelationDataType> theHvacSystemFunctionPowerSequenceRelationData;
            theHvacSystemFunctionPowerSequenceRelationData = (((this.hvacSystemFunctionPowerSequenceRelationData!= null)&&(!this.hvacSystemFunctionPowerSequenceRelationData.isEmpty()))?this.getHvacSystemFunctionPowerSequenceRelationData():null);
            if ((this.hvacSystemFunctionPowerSequenceRelationData!= null)&&(!this.hvacSystemFunctionPowerSequenceRelationData.isEmpty())) {
                currentHashCode += theHvacSystemFunctionPowerSequenceRelationData.hashCode();
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
            List<HvacSystemFunctionPowerSequenceRelationDataType> theHvacSystemFunctionPowerSequenceRelationData;
            theHvacSystemFunctionPowerSequenceRelationData = (((this.hvacSystemFunctionPowerSequenceRelationData!= null)&&(!this.hvacSystemFunctionPowerSequenceRelationData.isEmpty()))?this.getHvacSystemFunctionPowerSequenceRelationData():null);
            strategy.appendField(locator, this, "hvacSystemFunctionPowerSequenceRelationData", buffer, theHvacSystemFunctionPowerSequenceRelationData, ((this.hvacSystemFunctionPowerSequenceRelationData!= null)&&(!this.hvacSystemFunctionPowerSequenceRelationData.isEmpty())));
        }
        return buffer;
    }

}
