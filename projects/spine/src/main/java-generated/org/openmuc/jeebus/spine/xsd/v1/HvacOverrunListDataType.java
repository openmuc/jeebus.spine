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
 * <p>Java class for HvacOverrunListDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HvacOverrunListDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://docs.eebus.org/spine/xsd/v1}hvacOverrunData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HvacOverrunListDataType", propOrder = {
    "hvacOverrunData"
})
public class HvacOverrunListDataType implements Cloneable, CopyTo, ToString
{

    protected List<HvacOverrunDataType> hvacOverrunData;

    /**
     * Default no-arg constructor
     * 
     */
    public HvacOverrunListDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public HvacOverrunListDataType(final List<HvacOverrunDataType> hvacOverrunData) {
        this.hvacOverrunData = hvacOverrunData;
    }

    /**
     * Gets the value of the hvacOverrunData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the hvacOverrunData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHvacOverrunData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HvacOverrunDataType }
     * 
     * 
     */
    public List<HvacOverrunDataType> getHvacOverrunData() {
        if (hvacOverrunData == null) {
            hvacOverrunData = new ArrayList<HvacOverrunDataType>();
        }
        return this.hvacOverrunData;
    }

    /**
     * Adds objects to the list of HvacOverrunData using add method
     * 
     * @param values
     *     objects to add to the list HvacOverrunData
     * @return
     *     The class instance
     */
    public HvacOverrunListDataType withHvacOverrunData(HvacOverrunDataType... values) {
        if (values!= null) {
            for (HvacOverrunDataType value: values) {
                getHvacOverrunData().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of HvacOverrunData using addAll method
     * 
     * @param values
     *     objects to add to the list HvacOverrunData
     * @return
     *     The class instance
     */
    public HvacOverrunListDataType withHvacOverrunData(Collection<HvacOverrunDataType> values) {
        if (values!= null) {
            getHvacOverrunData().addAll(values);
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
        if (draftCopy instanceof HvacOverrunListDataType) {
            final HvacOverrunListDataType copy = ((HvacOverrunListDataType) draftCopy);
            {
                Boolean hvacOverrunDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.hvacOverrunData!= null)&&(!this.hvacOverrunData.isEmpty())));
                if (hvacOverrunDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<HvacOverrunDataType> sourceHvacOverrunData;
                    sourceHvacOverrunData = (((this.hvacOverrunData!= null)&&(!this.hvacOverrunData.isEmpty()))?this.getHvacOverrunData():null);
                    @SuppressWarnings("unchecked")
                    List<HvacOverrunDataType> copyHvacOverrunData = ((List<HvacOverrunDataType> ) strategy.copy(LocatorUtils.property(locator, "hvacOverrunData", sourceHvacOverrunData), sourceHvacOverrunData, ((this.hvacOverrunData!= null)&&(!this.hvacOverrunData.isEmpty()))));
                    copy.hvacOverrunData = null;
                    if (copyHvacOverrunData!= null) {
                        List<HvacOverrunDataType> uniqueHvacOverrunDatal = copy.getHvacOverrunData();
                        uniqueHvacOverrunDatal.addAll(copyHvacOverrunData);
                    }
                } else {
                    if (hvacOverrunDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.hvacOverrunData = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new HvacOverrunListDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final HvacOverrunListDataType that = ((HvacOverrunListDataType) object);
        {
            List<HvacOverrunDataType> leftHvacOverrunData;
            leftHvacOverrunData = (((this.hvacOverrunData!= null)&&(!this.hvacOverrunData.isEmpty()))?this.getHvacOverrunData():null);
            List<HvacOverrunDataType> rightHvacOverrunData;
            rightHvacOverrunData = (((that.hvacOverrunData!= null)&&(!that.hvacOverrunData.isEmpty()))?that.getHvacOverrunData():null);
            if ((this.hvacOverrunData!= null)&&(!this.hvacOverrunData.isEmpty())) {
                if ((that.hvacOverrunData!= null)&&(!that.hvacOverrunData.isEmpty())) {
                    if (!leftHvacOverrunData.equals(rightHvacOverrunData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.hvacOverrunData!= null)&&(!that.hvacOverrunData.isEmpty())) {
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
            List<HvacOverrunDataType> theHvacOverrunData;
            theHvacOverrunData = (((this.hvacOverrunData!= null)&&(!this.hvacOverrunData.isEmpty()))?this.getHvacOverrunData():null);
            if ((this.hvacOverrunData!= null)&&(!this.hvacOverrunData.isEmpty())) {
                currentHashCode += theHvacOverrunData.hashCode();
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
            List<HvacOverrunDataType> theHvacOverrunData;
            theHvacOverrunData = (((this.hvacOverrunData!= null)&&(!this.hvacOverrunData.isEmpty()))?this.getHvacOverrunData():null);
            strategy.appendField(locator, this, "hvacOverrunData", buffer, theHvacOverrunData, ((this.hvacOverrunData!= null)&&(!this.hvacOverrunData.isEmpty())));
        }
        return buffer;
    }

}
