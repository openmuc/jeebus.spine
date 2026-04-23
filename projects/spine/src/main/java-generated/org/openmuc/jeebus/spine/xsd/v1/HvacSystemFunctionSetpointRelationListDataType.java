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
 * <p>Java class for HvacSystemFunctionSetpointRelationListDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HvacSystemFunctionSetpointRelationListDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://docs.eebus.org/spine/xsd/v1}hvacSystemFunctionSetpointRelationData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HvacSystemFunctionSetpointRelationListDataType", propOrder = {
    "hvacSystemFunctionSetpointRelationData"
})
public class HvacSystemFunctionSetpointRelationListDataType implements Cloneable, CopyTo, ToString
{

    protected List<HvacSystemFunctionSetpointRelationDataType> hvacSystemFunctionSetpointRelationData;

    /**
     * Default no-arg constructor
     * 
     */
    public HvacSystemFunctionSetpointRelationListDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public HvacSystemFunctionSetpointRelationListDataType(final List<HvacSystemFunctionSetpointRelationDataType> hvacSystemFunctionSetpointRelationData) {
        this.hvacSystemFunctionSetpointRelationData = hvacSystemFunctionSetpointRelationData;
    }

    /**
     * Gets the value of the hvacSystemFunctionSetpointRelationData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the hvacSystemFunctionSetpointRelationData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHvacSystemFunctionSetpointRelationData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HvacSystemFunctionSetpointRelationDataType }
     * 
     * 
     */
    public List<HvacSystemFunctionSetpointRelationDataType> getHvacSystemFunctionSetpointRelationData() {
        if (hvacSystemFunctionSetpointRelationData == null) {
            hvacSystemFunctionSetpointRelationData = new ArrayList<HvacSystemFunctionSetpointRelationDataType>();
        }
        return this.hvacSystemFunctionSetpointRelationData;
    }

    /**
     * Adds objects to the list of HvacSystemFunctionSetpointRelationData using add method
     * 
     * @param values
     *     objects to add to the list HvacSystemFunctionSetpointRelationData
     * @return
     *     The class instance
     */
    public HvacSystemFunctionSetpointRelationListDataType withHvacSystemFunctionSetpointRelationData(HvacSystemFunctionSetpointRelationDataType... values) {
        if (values!= null) {
            for (HvacSystemFunctionSetpointRelationDataType value: values) {
                getHvacSystemFunctionSetpointRelationData().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of HvacSystemFunctionSetpointRelationData using addAll method
     * 
     * @param values
     *     objects to add to the list HvacSystemFunctionSetpointRelationData
     * @return
     *     The class instance
     */
    public HvacSystemFunctionSetpointRelationListDataType withHvacSystemFunctionSetpointRelationData(Collection<HvacSystemFunctionSetpointRelationDataType> values) {
        if (values!= null) {
            getHvacSystemFunctionSetpointRelationData().addAll(values);
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
        if (draftCopy instanceof HvacSystemFunctionSetpointRelationListDataType) {
            final HvacSystemFunctionSetpointRelationListDataType copy = ((HvacSystemFunctionSetpointRelationListDataType) draftCopy);
            {
                Boolean hvacSystemFunctionSetpointRelationDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.hvacSystemFunctionSetpointRelationData!= null)&&(!this.hvacSystemFunctionSetpointRelationData.isEmpty())));
                if (hvacSystemFunctionSetpointRelationDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<HvacSystemFunctionSetpointRelationDataType> sourceHvacSystemFunctionSetpointRelationData;
                    sourceHvacSystemFunctionSetpointRelationData = (((this.hvacSystemFunctionSetpointRelationData!= null)&&(!this.hvacSystemFunctionSetpointRelationData.isEmpty()))?this.getHvacSystemFunctionSetpointRelationData():null);
                    @SuppressWarnings("unchecked")
                    List<HvacSystemFunctionSetpointRelationDataType> copyHvacSystemFunctionSetpointRelationData = ((List<HvacSystemFunctionSetpointRelationDataType> ) strategy.copy(LocatorUtils.property(locator, "hvacSystemFunctionSetpointRelationData", sourceHvacSystemFunctionSetpointRelationData), sourceHvacSystemFunctionSetpointRelationData, ((this.hvacSystemFunctionSetpointRelationData!= null)&&(!this.hvacSystemFunctionSetpointRelationData.isEmpty()))));
                    copy.hvacSystemFunctionSetpointRelationData = null;
                    if (copyHvacSystemFunctionSetpointRelationData!= null) {
                        List<HvacSystemFunctionSetpointRelationDataType> uniqueHvacSystemFunctionSetpointRelationDatal = copy.getHvacSystemFunctionSetpointRelationData();
                        uniqueHvacSystemFunctionSetpointRelationDatal.addAll(copyHvacSystemFunctionSetpointRelationData);
                    }
                } else {
                    if (hvacSystemFunctionSetpointRelationDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.hvacSystemFunctionSetpointRelationData = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new HvacSystemFunctionSetpointRelationListDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final HvacSystemFunctionSetpointRelationListDataType that = ((HvacSystemFunctionSetpointRelationListDataType) object);
        {
            List<HvacSystemFunctionSetpointRelationDataType> leftHvacSystemFunctionSetpointRelationData;
            leftHvacSystemFunctionSetpointRelationData = (((this.hvacSystemFunctionSetpointRelationData!= null)&&(!this.hvacSystemFunctionSetpointRelationData.isEmpty()))?this.getHvacSystemFunctionSetpointRelationData():null);
            List<HvacSystemFunctionSetpointRelationDataType> rightHvacSystemFunctionSetpointRelationData;
            rightHvacSystemFunctionSetpointRelationData = (((that.hvacSystemFunctionSetpointRelationData!= null)&&(!that.hvacSystemFunctionSetpointRelationData.isEmpty()))?that.getHvacSystemFunctionSetpointRelationData():null);
            if ((this.hvacSystemFunctionSetpointRelationData!= null)&&(!this.hvacSystemFunctionSetpointRelationData.isEmpty())) {
                if ((that.hvacSystemFunctionSetpointRelationData!= null)&&(!that.hvacSystemFunctionSetpointRelationData.isEmpty())) {
                    if (!leftHvacSystemFunctionSetpointRelationData.equals(rightHvacSystemFunctionSetpointRelationData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.hvacSystemFunctionSetpointRelationData!= null)&&(!that.hvacSystemFunctionSetpointRelationData.isEmpty())) {
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
            List<HvacSystemFunctionSetpointRelationDataType> theHvacSystemFunctionSetpointRelationData;
            theHvacSystemFunctionSetpointRelationData = (((this.hvacSystemFunctionSetpointRelationData!= null)&&(!this.hvacSystemFunctionSetpointRelationData.isEmpty()))?this.getHvacSystemFunctionSetpointRelationData():null);
            if ((this.hvacSystemFunctionSetpointRelationData!= null)&&(!this.hvacSystemFunctionSetpointRelationData.isEmpty())) {
                currentHashCode += theHvacSystemFunctionSetpointRelationData.hashCode();
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
            List<HvacSystemFunctionSetpointRelationDataType> theHvacSystemFunctionSetpointRelationData;
            theHvacSystemFunctionSetpointRelationData = (((this.hvacSystemFunctionSetpointRelationData!= null)&&(!this.hvacSystemFunctionSetpointRelationData.isEmpty()))?this.getHvacSystemFunctionSetpointRelationData():null);
            strategy.appendField(locator, this, "hvacSystemFunctionSetpointRelationData", buffer, theHvacSystemFunctionSetpointRelationData, ((this.hvacSystemFunctionSetpointRelationData!= null)&&(!this.hvacSystemFunctionSetpointRelationData.isEmpty())));
        }
        return buffer;
    }

}
