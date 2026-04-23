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
 * <p>Java class for HvacOverrunDescriptionListDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HvacOverrunDescriptionListDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://docs.eebus.org/spine/xsd/v1}hvacOverrunDescriptionData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HvacOverrunDescriptionListDataType", propOrder = {
    "hvacOverrunDescriptionData"
})
public class HvacOverrunDescriptionListDataType implements Cloneable, CopyTo, ToString
{

    protected List<HvacOverrunDescriptionDataType> hvacOverrunDescriptionData;

    /**
     * Default no-arg constructor
     * 
     */
    public HvacOverrunDescriptionListDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public HvacOverrunDescriptionListDataType(final List<HvacOverrunDescriptionDataType> hvacOverrunDescriptionData) {
        this.hvacOverrunDescriptionData = hvacOverrunDescriptionData;
    }

    /**
     * Gets the value of the hvacOverrunDescriptionData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the hvacOverrunDescriptionData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHvacOverrunDescriptionData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HvacOverrunDescriptionDataType }
     * 
     * 
     */
    public List<HvacOverrunDescriptionDataType> getHvacOverrunDescriptionData() {
        if (hvacOverrunDescriptionData == null) {
            hvacOverrunDescriptionData = new ArrayList<HvacOverrunDescriptionDataType>();
        }
        return this.hvacOverrunDescriptionData;
    }

    /**
     * Adds objects to the list of HvacOverrunDescriptionData using add method
     * 
     * @param values
     *     objects to add to the list HvacOverrunDescriptionData
     * @return
     *     The class instance
     */
    public HvacOverrunDescriptionListDataType withHvacOverrunDescriptionData(HvacOverrunDescriptionDataType... values) {
        if (values!= null) {
            for (HvacOverrunDescriptionDataType value: values) {
                getHvacOverrunDescriptionData().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of HvacOverrunDescriptionData using addAll method
     * 
     * @param values
     *     objects to add to the list HvacOverrunDescriptionData
     * @return
     *     The class instance
     */
    public HvacOverrunDescriptionListDataType withHvacOverrunDescriptionData(Collection<HvacOverrunDescriptionDataType> values) {
        if (values!= null) {
            getHvacOverrunDescriptionData().addAll(values);
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
        if (draftCopy instanceof HvacOverrunDescriptionListDataType) {
            final HvacOverrunDescriptionListDataType copy = ((HvacOverrunDescriptionListDataType) draftCopy);
            {
                Boolean hvacOverrunDescriptionDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.hvacOverrunDescriptionData!= null)&&(!this.hvacOverrunDescriptionData.isEmpty())));
                if (hvacOverrunDescriptionDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<HvacOverrunDescriptionDataType> sourceHvacOverrunDescriptionData;
                    sourceHvacOverrunDescriptionData = (((this.hvacOverrunDescriptionData!= null)&&(!this.hvacOverrunDescriptionData.isEmpty()))?this.getHvacOverrunDescriptionData():null);
                    @SuppressWarnings("unchecked")
                    List<HvacOverrunDescriptionDataType> copyHvacOverrunDescriptionData = ((List<HvacOverrunDescriptionDataType> ) strategy.copy(LocatorUtils.property(locator, "hvacOverrunDescriptionData", sourceHvacOverrunDescriptionData), sourceHvacOverrunDescriptionData, ((this.hvacOverrunDescriptionData!= null)&&(!this.hvacOverrunDescriptionData.isEmpty()))));
                    copy.hvacOverrunDescriptionData = null;
                    if (copyHvacOverrunDescriptionData!= null) {
                        List<HvacOverrunDescriptionDataType> uniqueHvacOverrunDescriptionDatal = copy.getHvacOverrunDescriptionData();
                        uniqueHvacOverrunDescriptionDatal.addAll(copyHvacOverrunDescriptionData);
                    }
                } else {
                    if (hvacOverrunDescriptionDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.hvacOverrunDescriptionData = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new HvacOverrunDescriptionListDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final HvacOverrunDescriptionListDataType that = ((HvacOverrunDescriptionListDataType) object);
        {
            List<HvacOverrunDescriptionDataType> leftHvacOverrunDescriptionData;
            leftHvacOverrunDescriptionData = (((this.hvacOverrunDescriptionData!= null)&&(!this.hvacOverrunDescriptionData.isEmpty()))?this.getHvacOverrunDescriptionData():null);
            List<HvacOverrunDescriptionDataType> rightHvacOverrunDescriptionData;
            rightHvacOverrunDescriptionData = (((that.hvacOverrunDescriptionData!= null)&&(!that.hvacOverrunDescriptionData.isEmpty()))?that.getHvacOverrunDescriptionData():null);
            if ((this.hvacOverrunDescriptionData!= null)&&(!this.hvacOverrunDescriptionData.isEmpty())) {
                if ((that.hvacOverrunDescriptionData!= null)&&(!that.hvacOverrunDescriptionData.isEmpty())) {
                    if (!leftHvacOverrunDescriptionData.equals(rightHvacOverrunDescriptionData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.hvacOverrunDescriptionData!= null)&&(!that.hvacOverrunDescriptionData.isEmpty())) {
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
            List<HvacOverrunDescriptionDataType> theHvacOverrunDescriptionData;
            theHvacOverrunDescriptionData = (((this.hvacOverrunDescriptionData!= null)&&(!this.hvacOverrunDescriptionData.isEmpty()))?this.getHvacOverrunDescriptionData():null);
            if ((this.hvacOverrunDescriptionData!= null)&&(!this.hvacOverrunDescriptionData.isEmpty())) {
                currentHashCode += theHvacOverrunDescriptionData.hashCode();
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
            List<HvacOverrunDescriptionDataType> theHvacOverrunDescriptionData;
            theHvacOverrunDescriptionData = (((this.hvacOverrunDescriptionData!= null)&&(!this.hvacOverrunDescriptionData.isEmpty()))?this.getHvacOverrunDescriptionData():null);
            strategy.appendField(locator, this, "hvacOverrunDescriptionData", buffer, theHvacOverrunDescriptionData, ((this.hvacOverrunDescriptionData!= null)&&(!this.hvacOverrunDescriptionData.isEmpty())));
        }
        return buffer;
    }

}
