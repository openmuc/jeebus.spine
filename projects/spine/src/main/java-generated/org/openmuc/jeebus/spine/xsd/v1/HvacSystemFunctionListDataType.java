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
 * <p>Java class for HvacSystemFunctionListDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HvacSystemFunctionListDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://docs.eebus.org/spine/xsd/v1}hvacSystemFunctionData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HvacSystemFunctionListDataType", propOrder = {
    "hvacSystemFunctionData"
})
public class HvacSystemFunctionListDataType implements Cloneable, CopyTo, ToString
{

    protected List<HvacSystemFunctionDataType> hvacSystemFunctionData;

    /**
     * Default no-arg constructor
     * 
     */
    public HvacSystemFunctionListDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public HvacSystemFunctionListDataType(final List<HvacSystemFunctionDataType> hvacSystemFunctionData) {
        this.hvacSystemFunctionData = hvacSystemFunctionData;
    }

    /**
     * Gets the value of the hvacSystemFunctionData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the hvacSystemFunctionData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHvacSystemFunctionData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HvacSystemFunctionDataType }
     * 
     * 
     */
    public List<HvacSystemFunctionDataType> getHvacSystemFunctionData() {
        if (hvacSystemFunctionData == null) {
            hvacSystemFunctionData = new ArrayList<HvacSystemFunctionDataType>();
        }
        return this.hvacSystemFunctionData;
    }

    /**
     * Adds objects to the list of HvacSystemFunctionData using add method
     * 
     * @param values
     *     objects to add to the list HvacSystemFunctionData
     * @return
     *     The class instance
     */
    public HvacSystemFunctionListDataType withHvacSystemFunctionData(HvacSystemFunctionDataType... values) {
        if (values!= null) {
            for (HvacSystemFunctionDataType value: values) {
                getHvacSystemFunctionData().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of HvacSystemFunctionData using addAll method
     * 
     * @param values
     *     objects to add to the list HvacSystemFunctionData
     * @return
     *     The class instance
     */
    public HvacSystemFunctionListDataType withHvacSystemFunctionData(Collection<HvacSystemFunctionDataType> values) {
        if (values!= null) {
            getHvacSystemFunctionData().addAll(values);
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
        if (draftCopy instanceof HvacSystemFunctionListDataType) {
            final HvacSystemFunctionListDataType copy = ((HvacSystemFunctionListDataType) draftCopy);
            {
                Boolean hvacSystemFunctionDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.hvacSystemFunctionData!= null)&&(!this.hvacSystemFunctionData.isEmpty())));
                if (hvacSystemFunctionDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<HvacSystemFunctionDataType> sourceHvacSystemFunctionData;
                    sourceHvacSystemFunctionData = (((this.hvacSystemFunctionData!= null)&&(!this.hvacSystemFunctionData.isEmpty()))?this.getHvacSystemFunctionData():null);
                    @SuppressWarnings("unchecked")
                    List<HvacSystemFunctionDataType> copyHvacSystemFunctionData = ((List<HvacSystemFunctionDataType> ) strategy.copy(LocatorUtils.property(locator, "hvacSystemFunctionData", sourceHvacSystemFunctionData), sourceHvacSystemFunctionData, ((this.hvacSystemFunctionData!= null)&&(!this.hvacSystemFunctionData.isEmpty()))));
                    copy.hvacSystemFunctionData = null;
                    if (copyHvacSystemFunctionData!= null) {
                        List<HvacSystemFunctionDataType> uniqueHvacSystemFunctionDatal = copy.getHvacSystemFunctionData();
                        uniqueHvacSystemFunctionDatal.addAll(copyHvacSystemFunctionData);
                    }
                } else {
                    if (hvacSystemFunctionDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.hvacSystemFunctionData = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new HvacSystemFunctionListDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final HvacSystemFunctionListDataType that = ((HvacSystemFunctionListDataType) object);
        {
            List<HvacSystemFunctionDataType> leftHvacSystemFunctionData;
            leftHvacSystemFunctionData = (((this.hvacSystemFunctionData!= null)&&(!this.hvacSystemFunctionData.isEmpty()))?this.getHvacSystemFunctionData():null);
            List<HvacSystemFunctionDataType> rightHvacSystemFunctionData;
            rightHvacSystemFunctionData = (((that.hvacSystemFunctionData!= null)&&(!that.hvacSystemFunctionData.isEmpty()))?that.getHvacSystemFunctionData():null);
            if ((this.hvacSystemFunctionData!= null)&&(!this.hvacSystemFunctionData.isEmpty())) {
                if ((that.hvacSystemFunctionData!= null)&&(!that.hvacSystemFunctionData.isEmpty())) {
                    if (!leftHvacSystemFunctionData.equals(rightHvacSystemFunctionData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.hvacSystemFunctionData!= null)&&(!that.hvacSystemFunctionData.isEmpty())) {
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
            List<HvacSystemFunctionDataType> theHvacSystemFunctionData;
            theHvacSystemFunctionData = (((this.hvacSystemFunctionData!= null)&&(!this.hvacSystemFunctionData.isEmpty()))?this.getHvacSystemFunctionData():null);
            if ((this.hvacSystemFunctionData!= null)&&(!this.hvacSystemFunctionData.isEmpty())) {
                currentHashCode += theHvacSystemFunctionData.hashCode();
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
            List<HvacSystemFunctionDataType> theHvacSystemFunctionData;
            theHvacSystemFunctionData = (((this.hvacSystemFunctionData!= null)&&(!this.hvacSystemFunctionData.isEmpty()))?this.getHvacSystemFunctionData():null);
            strategy.appendField(locator, this, "hvacSystemFunctionData", buffer, theHvacSystemFunctionData, ((this.hvacSystemFunctionData!= null)&&(!this.hvacSystemFunctionData.isEmpty())));
        }
        return buffer;
    }

}
