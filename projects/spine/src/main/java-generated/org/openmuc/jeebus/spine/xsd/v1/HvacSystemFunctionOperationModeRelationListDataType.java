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
 * <p>Java class for HvacSystemFunctionOperationModeRelationListDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HvacSystemFunctionOperationModeRelationListDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://docs.eebus.org/spine/xsd/v1}hvacSystemFunctionOperationModeRelationData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HvacSystemFunctionOperationModeRelationListDataType", propOrder = {
    "hvacSystemFunctionOperationModeRelationData"
})
public class HvacSystemFunctionOperationModeRelationListDataType implements Cloneable, CopyTo, ToString
{

    protected List<HvacSystemFunctionOperationModeRelationDataType> hvacSystemFunctionOperationModeRelationData;

    /**
     * Default no-arg constructor
     * 
     */
    public HvacSystemFunctionOperationModeRelationListDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public HvacSystemFunctionOperationModeRelationListDataType(final List<HvacSystemFunctionOperationModeRelationDataType> hvacSystemFunctionOperationModeRelationData) {
        this.hvacSystemFunctionOperationModeRelationData = hvacSystemFunctionOperationModeRelationData;
    }

    /**
     * Gets the value of the hvacSystemFunctionOperationModeRelationData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the hvacSystemFunctionOperationModeRelationData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHvacSystemFunctionOperationModeRelationData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HvacSystemFunctionOperationModeRelationDataType }
     * 
     * 
     */
    public List<HvacSystemFunctionOperationModeRelationDataType> getHvacSystemFunctionOperationModeRelationData() {
        if (hvacSystemFunctionOperationModeRelationData == null) {
            hvacSystemFunctionOperationModeRelationData = new ArrayList<HvacSystemFunctionOperationModeRelationDataType>();
        }
        return this.hvacSystemFunctionOperationModeRelationData;
    }

    /**
     * Adds objects to the list of HvacSystemFunctionOperationModeRelationData using add method
     * 
     * @param values
     *     objects to add to the list HvacSystemFunctionOperationModeRelationData
     * @return
     *     The class instance
     */
    public HvacSystemFunctionOperationModeRelationListDataType withHvacSystemFunctionOperationModeRelationData(HvacSystemFunctionOperationModeRelationDataType... values) {
        if (values!= null) {
            for (HvacSystemFunctionOperationModeRelationDataType value: values) {
                getHvacSystemFunctionOperationModeRelationData().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of HvacSystemFunctionOperationModeRelationData using addAll method
     * 
     * @param values
     *     objects to add to the list HvacSystemFunctionOperationModeRelationData
     * @return
     *     The class instance
     */
    public HvacSystemFunctionOperationModeRelationListDataType withHvacSystemFunctionOperationModeRelationData(Collection<HvacSystemFunctionOperationModeRelationDataType> values) {
        if (values!= null) {
            getHvacSystemFunctionOperationModeRelationData().addAll(values);
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
        if (draftCopy instanceof HvacSystemFunctionOperationModeRelationListDataType) {
            final HvacSystemFunctionOperationModeRelationListDataType copy = ((HvacSystemFunctionOperationModeRelationListDataType) draftCopy);
            {
                Boolean hvacSystemFunctionOperationModeRelationDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.hvacSystemFunctionOperationModeRelationData!= null)&&(!this.hvacSystemFunctionOperationModeRelationData.isEmpty())));
                if (hvacSystemFunctionOperationModeRelationDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<HvacSystemFunctionOperationModeRelationDataType> sourceHvacSystemFunctionOperationModeRelationData;
                    sourceHvacSystemFunctionOperationModeRelationData = (((this.hvacSystemFunctionOperationModeRelationData!= null)&&(!this.hvacSystemFunctionOperationModeRelationData.isEmpty()))?this.getHvacSystemFunctionOperationModeRelationData():null);
                    @SuppressWarnings("unchecked")
                    List<HvacSystemFunctionOperationModeRelationDataType> copyHvacSystemFunctionOperationModeRelationData = ((List<HvacSystemFunctionOperationModeRelationDataType> ) strategy.copy(LocatorUtils.property(locator, "hvacSystemFunctionOperationModeRelationData", sourceHvacSystemFunctionOperationModeRelationData), sourceHvacSystemFunctionOperationModeRelationData, ((this.hvacSystemFunctionOperationModeRelationData!= null)&&(!this.hvacSystemFunctionOperationModeRelationData.isEmpty()))));
                    copy.hvacSystemFunctionOperationModeRelationData = null;
                    if (copyHvacSystemFunctionOperationModeRelationData!= null) {
                        List<HvacSystemFunctionOperationModeRelationDataType> uniqueHvacSystemFunctionOperationModeRelationDatal = copy.getHvacSystemFunctionOperationModeRelationData();
                        uniqueHvacSystemFunctionOperationModeRelationDatal.addAll(copyHvacSystemFunctionOperationModeRelationData);
                    }
                } else {
                    if (hvacSystemFunctionOperationModeRelationDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.hvacSystemFunctionOperationModeRelationData = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new HvacSystemFunctionOperationModeRelationListDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final HvacSystemFunctionOperationModeRelationListDataType that = ((HvacSystemFunctionOperationModeRelationListDataType) object);
        {
            List<HvacSystemFunctionOperationModeRelationDataType> leftHvacSystemFunctionOperationModeRelationData;
            leftHvacSystemFunctionOperationModeRelationData = (((this.hvacSystemFunctionOperationModeRelationData!= null)&&(!this.hvacSystemFunctionOperationModeRelationData.isEmpty()))?this.getHvacSystemFunctionOperationModeRelationData():null);
            List<HvacSystemFunctionOperationModeRelationDataType> rightHvacSystemFunctionOperationModeRelationData;
            rightHvacSystemFunctionOperationModeRelationData = (((that.hvacSystemFunctionOperationModeRelationData!= null)&&(!that.hvacSystemFunctionOperationModeRelationData.isEmpty()))?that.getHvacSystemFunctionOperationModeRelationData():null);
            if ((this.hvacSystemFunctionOperationModeRelationData!= null)&&(!this.hvacSystemFunctionOperationModeRelationData.isEmpty())) {
                if ((that.hvacSystemFunctionOperationModeRelationData!= null)&&(!that.hvacSystemFunctionOperationModeRelationData.isEmpty())) {
                    if (!leftHvacSystemFunctionOperationModeRelationData.equals(rightHvacSystemFunctionOperationModeRelationData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.hvacSystemFunctionOperationModeRelationData!= null)&&(!that.hvacSystemFunctionOperationModeRelationData.isEmpty())) {
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
            List<HvacSystemFunctionOperationModeRelationDataType> theHvacSystemFunctionOperationModeRelationData;
            theHvacSystemFunctionOperationModeRelationData = (((this.hvacSystemFunctionOperationModeRelationData!= null)&&(!this.hvacSystemFunctionOperationModeRelationData.isEmpty()))?this.getHvacSystemFunctionOperationModeRelationData():null);
            if ((this.hvacSystemFunctionOperationModeRelationData!= null)&&(!this.hvacSystemFunctionOperationModeRelationData.isEmpty())) {
                currentHashCode += theHvacSystemFunctionOperationModeRelationData.hashCode();
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
            List<HvacSystemFunctionOperationModeRelationDataType> theHvacSystemFunctionOperationModeRelationData;
            theHvacSystemFunctionOperationModeRelationData = (((this.hvacSystemFunctionOperationModeRelationData!= null)&&(!this.hvacSystemFunctionOperationModeRelationData.isEmpty()))?this.getHvacSystemFunctionOperationModeRelationData():null);
            strategy.appendField(locator, this, "hvacSystemFunctionOperationModeRelationData", buffer, theHvacSystemFunctionOperationModeRelationData, ((this.hvacSystemFunctionOperationModeRelationData!= null)&&(!this.hvacSystemFunctionOperationModeRelationData.isEmpty())));
        }
        return buffer;
    }

}
