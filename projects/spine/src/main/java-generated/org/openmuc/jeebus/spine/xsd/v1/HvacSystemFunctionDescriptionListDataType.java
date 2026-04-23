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
 * <p>Java class for HvacSystemFunctionDescriptionListDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HvacSystemFunctionDescriptionListDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://docs.eebus.org/spine/xsd/v1}hvacSystemFunctionDescriptionData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HvacSystemFunctionDescriptionListDataType", propOrder = {
    "hvacSystemFunctionDescriptionData"
})
public class HvacSystemFunctionDescriptionListDataType implements Cloneable, CopyTo, ToString
{

    protected List<HvacSystemFunctionDescriptionDataType> hvacSystemFunctionDescriptionData;

    /**
     * Default no-arg constructor
     * 
     */
    public HvacSystemFunctionDescriptionListDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public HvacSystemFunctionDescriptionListDataType(final List<HvacSystemFunctionDescriptionDataType> hvacSystemFunctionDescriptionData) {
        this.hvacSystemFunctionDescriptionData = hvacSystemFunctionDescriptionData;
    }

    /**
     * Gets the value of the hvacSystemFunctionDescriptionData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the hvacSystemFunctionDescriptionData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHvacSystemFunctionDescriptionData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HvacSystemFunctionDescriptionDataType }
     * 
     * 
     */
    public List<HvacSystemFunctionDescriptionDataType> getHvacSystemFunctionDescriptionData() {
        if (hvacSystemFunctionDescriptionData == null) {
            hvacSystemFunctionDescriptionData = new ArrayList<HvacSystemFunctionDescriptionDataType>();
        }
        return this.hvacSystemFunctionDescriptionData;
    }

    /**
     * Adds objects to the list of HvacSystemFunctionDescriptionData using add method
     * 
     * @param values
     *     objects to add to the list HvacSystemFunctionDescriptionData
     * @return
     *     The class instance
     */
    public HvacSystemFunctionDescriptionListDataType withHvacSystemFunctionDescriptionData(HvacSystemFunctionDescriptionDataType... values) {
        if (values!= null) {
            for (HvacSystemFunctionDescriptionDataType value: values) {
                getHvacSystemFunctionDescriptionData().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of HvacSystemFunctionDescriptionData using addAll method
     * 
     * @param values
     *     objects to add to the list HvacSystemFunctionDescriptionData
     * @return
     *     The class instance
     */
    public HvacSystemFunctionDescriptionListDataType withHvacSystemFunctionDescriptionData(Collection<HvacSystemFunctionDescriptionDataType> values) {
        if (values!= null) {
            getHvacSystemFunctionDescriptionData().addAll(values);
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
        if (draftCopy instanceof HvacSystemFunctionDescriptionListDataType) {
            final HvacSystemFunctionDescriptionListDataType copy = ((HvacSystemFunctionDescriptionListDataType) draftCopy);
            {
                Boolean hvacSystemFunctionDescriptionDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.hvacSystemFunctionDescriptionData!= null)&&(!this.hvacSystemFunctionDescriptionData.isEmpty())));
                if (hvacSystemFunctionDescriptionDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<HvacSystemFunctionDescriptionDataType> sourceHvacSystemFunctionDescriptionData;
                    sourceHvacSystemFunctionDescriptionData = (((this.hvacSystemFunctionDescriptionData!= null)&&(!this.hvacSystemFunctionDescriptionData.isEmpty()))?this.getHvacSystemFunctionDescriptionData():null);
                    @SuppressWarnings("unchecked")
                    List<HvacSystemFunctionDescriptionDataType> copyHvacSystemFunctionDescriptionData = ((List<HvacSystemFunctionDescriptionDataType> ) strategy.copy(LocatorUtils.property(locator, "hvacSystemFunctionDescriptionData", sourceHvacSystemFunctionDescriptionData), sourceHvacSystemFunctionDescriptionData, ((this.hvacSystemFunctionDescriptionData!= null)&&(!this.hvacSystemFunctionDescriptionData.isEmpty()))));
                    copy.hvacSystemFunctionDescriptionData = null;
                    if (copyHvacSystemFunctionDescriptionData!= null) {
                        List<HvacSystemFunctionDescriptionDataType> uniqueHvacSystemFunctionDescriptionDatal = copy.getHvacSystemFunctionDescriptionData();
                        uniqueHvacSystemFunctionDescriptionDatal.addAll(copyHvacSystemFunctionDescriptionData);
                    }
                } else {
                    if (hvacSystemFunctionDescriptionDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.hvacSystemFunctionDescriptionData = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new HvacSystemFunctionDescriptionListDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final HvacSystemFunctionDescriptionListDataType that = ((HvacSystemFunctionDescriptionListDataType) object);
        {
            List<HvacSystemFunctionDescriptionDataType> leftHvacSystemFunctionDescriptionData;
            leftHvacSystemFunctionDescriptionData = (((this.hvacSystemFunctionDescriptionData!= null)&&(!this.hvacSystemFunctionDescriptionData.isEmpty()))?this.getHvacSystemFunctionDescriptionData():null);
            List<HvacSystemFunctionDescriptionDataType> rightHvacSystemFunctionDescriptionData;
            rightHvacSystemFunctionDescriptionData = (((that.hvacSystemFunctionDescriptionData!= null)&&(!that.hvacSystemFunctionDescriptionData.isEmpty()))?that.getHvacSystemFunctionDescriptionData():null);
            if ((this.hvacSystemFunctionDescriptionData!= null)&&(!this.hvacSystemFunctionDescriptionData.isEmpty())) {
                if ((that.hvacSystemFunctionDescriptionData!= null)&&(!that.hvacSystemFunctionDescriptionData.isEmpty())) {
                    if (!leftHvacSystemFunctionDescriptionData.equals(rightHvacSystemFunctionDescriptionData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.hvacSystemFunctionDescriptionData!= null)&&(!that.hvacSystemFunctionDescriptionData.isEmpty())) {
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
            List<HvacSystemFunctionDescriptionDataType> theHvacSystemFunctionDescriptionData;
            theHvacSystemFunctionDescriptionData = (((this.hvacSystemFunctionDescriptionData!= null)&&(!this.hvacSystemFunctionDescriptionData.isEmpty()))?this.getHvacSystemFunctionDescriptionData():null);
            if ((this.hvacSystemFunctionDescriptionData!= null)&&(!this.hvacSystemFunctionDescriptionData.isEmpty())) {
                currentHashCode += theHvacSystemFunctionDescriptionData.hashCode();
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
            List<HvacSystemFunctionDescriptionDataType> theHvacSystemFunctionDescriptionData;
            theHvacSystemFunctionDescriptionData = (((this.hvacSystemFunctionDescriptionData!= null)&&(!this.hvacSystemFunctionDescriptionData.isEmpty()))?this.getHvacSystemFunctionDescriptionData():null);
            strategy.appendField(locator, this, "hvacSystemFunctionDescriptionData", buffer, theHvacSystemFunctionDescriptionData, ((this.hvacSystemFunctionDescriptionData!= null)&&(!this.hvacSystemFunctionDescriptionData.isEmpty())));
        }
        return buffer;
    }

}
