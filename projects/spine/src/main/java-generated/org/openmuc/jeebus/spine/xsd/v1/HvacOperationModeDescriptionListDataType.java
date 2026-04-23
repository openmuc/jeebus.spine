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
 * <p>Java class for HvacOperationModeDescriptionListDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HvacOperationModeDescriptionListDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://docs.eebus.org/spine/xsd/v1}hvacOperationModeDescriptionData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HvacOperationModeDescriptionListDataType", propOrder = {
    "hvacOperationModeDescriptionData"
})
public class HvacOperationModeDescriptionListDataType implements Cloneable, CopyTo, ToString
{

    protected List<HvacOperationModeDescriptionDataType> hvacOperationModeDescriptionData;

    /**
     * Default no-arg constructor
     * 
     */
    public HvacOperationModeDescriptionListDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public HvacOperationModeDescriptionListDataType(final List<HvacOperationModeDescriptionDataType> hvacOperationModeDescriptionData) {
        this.hvacOperationModeDescriptionData = hvacOperationModeDescriptionData;
    }

    /**
     * Gets the value of the hvacOperationModeDescriptionData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the hvacOperationModeDescriptionData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHvacOperationModeDescriptionData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HvacOperationModeDescriptionDataType }
     * 
     * 
     */
    public List<HvacOperationModeDescriptionDataType> getHvacOperationModeDescriptionData() {
        if (hvacOperationModeDescriptionData == null) {
            hvacOperationModeDescriptionData = new ArrayList<HvacOperationModeDescriptionDataType>();
        }
        return this.hvacOperationModeDescriptionData;
    }

    /**
     * Adds objects to the list of HvacOperationModeDescriptionData using add method
     * 
     * @param values
     *     objects to add to the list HvacOperationModeDescriptionData
     * @return
     *     The class instance
     */
    public HvacOperationModeDescriptionListDataType withHvacOperationModeDescriptionData(HvacOperationModeDescriptionDataType... values) {
        if (values!= null) {
            for (HvacOperationModeDescriptionDataType value: values) {
                getHvacOperationModeDescriptionData().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of HvacOperationModeDescriptionData using addAll method
     * 
     * @param values
     *     objects to add to the list HvacOperationModeDescriptionData
     * @return
     *     The class instance
     */
    public HvacOperationModeDescriptionListDataType withHvacOperationModeDescriptionData(Collection<HvacOperationModeDescriptionDataType> values) {
        if (values!= null) {
            getHvacOperationModeDescriptionData().addAll(values);
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
        if (draftCopy instanceof HvacOperationModeDescriptionListDataType) {
            final HvacOperationModeDescriptionListDataType copy = ((HvacOperationModeDescriptionListDataType) draftCopy);
            {
                Boolean hvacOperationModeDescriptionDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.hvacOperationModeDescriptionData!= null)&&(!this.hvacOperationModeDescriptionData.isEmpty())));
                if (hvacOperationModeDescriptionDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<HvacOperationModeDescriptionDataType> sourceHvacOperationModeDescriptionData;
                    sourceHvacOperationModeDescriptionData = (((this.hvacOperationModeDescriptionData!= null)&&(!this.hvacOperationModeDescriptionData.isEmpty()))?this.getHvacOperationModeDescriptionData():null);
                    @SuppressWarnings("unchecked")
                    List<HvacOperationModeDescriptionDataType> copyHvacOperationModeDescriptionData = ((List<HvacOperationModeDescriptionDataType> ) strategy.copy(LocatorUtils.property(locator, "hvacOperationModeDescriptionData", sourceHvacOperationModeDescriptionData), sourceHvacOperationModeDescriptionData, ((this.hvacOperationModeDescriptionData!= null)&&(!this.hvacOperationModeDescriptionData.isEmpty()))));
                    copy.hvacOperationModeDescriptionData = null;
                    if (copyHvacOperationModeDescriptionData!= null) {
                        List<HvacOperationModeDescriptionDataType> uniqueHvacOperationModeDescriptionDatal = copy.getHvacOperationModeDescriptionData();
                        uniqueHvacOperationModeDescriptionDatal.addAll(copyHvacOperationModeDescriptionData);
                    }
                } else {
                    if (hvacOperationModeDescriptionDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.hvacOperationModeDescriptionData = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new HvacOperationModeDescriptionListDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final HvacOperationModeDescriptionListDataType that = ((HvacOperationModeDescriptionListDataType) object);
        {
            List<HvacOperationModeDescriptionDataType> leftHvacOperationModeDescriptionData;
            leftHvacOperationModeDescriptionData = (((this.hvacOperationModeDescriptionData!= null)&&(!this.hvacOperationModeDescriptionData.isEmpty()))?this.getHvacOperationModeDescriptionData():null);
            List<HvacOperationModeDescriptionDataType> rightHvacOperationModeDescriptionData;
            rightHvacOperationModeDescriptionData = (((that.hvacOperationModeDescriptionData!= null)&&(!that.hvacOperationModeDescriptionData.isEmpty()))?that.getHvacOperationModeDescriptionData():null);
            if ((this.hvacOperationModeDescriptionData!= null)&&(!this.hvacOperationModeDescriptionData.isEmpty())) {
                if ((that.hvacOperationModeDescriptionData!= null)&&(!that.hvacOperationModeDescriptionData.isEmpty())) {
                    if (!leftHvacOperationModeDescriptionData.equals(rightHvacOperationModeDescriptionData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.hvacOperationModeDescriptionData!= null)&&(!that.hvacOperationModeDescriptionData.isEmpty())) {
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
            List<HvacOperationModeDescriptionDataType> theHvacOperationModeDescriptionData;
            theHvacOperationModeDescriptionData = (((this.hvacOperationModeDescriptionData!= null)&&(!this.hvacOperationModeDescriptionData.isEmpty()))?this.getHvacOperationModeDescriptionData():null);
            if ((this.hvacOperationModeDescriptionData!= null)&&(!this.hvacOperationModeDescriptionData.isEmpty())) {
                currentHashCode += theHvacOperationModeDescriptionData.hashCode();
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
            List<HvacOperationModeDescriptionDataType> theHvacOperationModeDescriptionData;
            theHvacOperationModeDescriptionData = (((this.hvacOperationModeDescriptionData!= null)&&(!this.hvacOperationModeDescriptionData.isEmpty()))?this.getHvacOperationModeDescriptionData():null);
            strategy.appendField(locator, this, "hvacOperationModeDescriptionData", buffer, theHvacOperationModeDescriptionData, ((this.hvacOperationModeDescriptionData!= null)&&(!this.hvacOperationModeDescriptionData.isEmpty())));
        }
        return buffer;
    }

}
