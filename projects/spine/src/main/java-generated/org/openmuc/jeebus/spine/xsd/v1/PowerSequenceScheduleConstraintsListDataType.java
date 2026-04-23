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
 * <p>Java class for PowerSequenceScheduleConstraintsListDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PowerSequenceScheduleConstraintsListDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://docs.eebus.org/spine/xsd/v1}powerSequenceScheduleConstraintsData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PowerSequenceScheduleConstraintsListDataType", propOrder = {
    "powerSequenceScheduleConstraintsData"
})
public class PowerSequenceScheduleConstraintsListDataType implements Cloneable, CopyTo, ToString
{

    protected List<PowerSequenceScheduleConstraintsDataType> powerSequenceScheduleConstraintsData;

    /**
     * Default no-arg constructor
     * 
     */
    public PowerSequenceScheduleConstraintsListDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public PowerSequenceScheduleConstraintsListDataType(final List<PowerSequenceScheduleConstraintsDataType> powerSequenceScheduleConstraintsData) {
        this.powerSequenceScheduleConstraintsData = powerSequenceScheduleConstraintsData;
    }

    /**
     * Gets the value of the powerSequenceScheduleConstraintsData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the powerSequenceScheduleConstraintsData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPowerSequenceScheduleConstraintsData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PowerSequenceScheduleConstraintsDataType }
     * 
     * 
     */
    public List<PowerSequenceScheduleConstraintsDataType> getPowerSequenceScheduleConstraintsData() {
        if (powerSequenceScheduleConstraintsData == null) {
            powerSequenceScheduleConstraintsData = new ArrayList<PowerSequenceScheduleConstraintsDataType>();
        }
        return this.powerSequenceScheduleConstraintsData;
    }

    /**
     * Adds objects to the list of PowerSequenceScheduleConstraintsData using add method
     * 
     * @param values
     *     objects to add to the list PowerSequenceScheduleConstraintsData
     * @return
     *     The class instance
     */
    public PowerSequenceScheduleConstraintsListDataType withPowerSequenceScheduleConstraintsData(PowerSequenceScheduleConstraintsDataType... values) {
        if (values!= null) {
            for (PowerSequenceScheduleConstraintsDataType value: values) {
                getPowerSequenceScheduleConstraintsData().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of PowerSequenceScheduleConstraintsData using addAll method
     * 
     * @param values
     *     objects to add to the list PowerSequenceScheduleConstraintsData
     * @return
     *     The class instance
     */
    public PowerSequenceScheduleConstraintsListDataType withPowerSequenceScheduleConstraintsData(Collection<PowerSequenceScheduleConstraintsDataType> values) {
        if (values!= null) {
            getPowerSequenceScheduleConstraintsData().addAll(values);
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
        if (draftCopy instanceof PowerSequenceScheduleConstraintsListDataType) {
            final PowerSequenceScheduleConstraintsListDataType copy = ((PowerSequenceScheduleConstraintsListDataType) draftCopy);
            {
                Boolean powerSequenceScheduleConstraintsDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.powerSequenceScheduleConstraintsData!= null)&&(!this.powerSequenceScheduleConstraintsData.isEmpty())));
                if (powerSequenceScheduleConstraintsDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<PowerSequenceScheduleConstraintsDataType> sourcePowerSequenceScheduleConstraintsData;
                    sourcePowerSequenceScheduleConstraintsData = (((this.powerSequenceScheduleConstraintsData!= null)&&(!this.powerSequenceScheduleConstraintsData.isEmpty()))?this.getPowerSequenceScheduleConstraintsData():null);
                    @SuppressWarnings("unchecked")
                    List<PowerSequenceScheduleConstraintsDataType> copyPowerSequenceScheduleConstraintsData = ((List<PowerSequenceScheduleConstraintsDataType> ) strategy.copy(LocatorUtils.property(locator, "powerSequenceScheduleConstraintsData", sourcePowerSequenceScheduleConstraintsData), sourcePowerSequenceScheduleConstraintsData, ((this.powerSequenceScheduleConstraintsData!= null)&&(!this.powerSequenceScheduleConstraintsData.isEmpty()))));
                    copy.powerSequenceScheduleConstraintsData = null;
                    if (copyPowerSequenceScheduleConstraintsData!= null) {
                        List<PowerSequenceScheduleConstraintsDataType> uniquePowerSequenceScheduleConstraintsDatal = copy.getPowerSequenceScheduleConstraintsData();
                        uniquePowerSequenceScheduleConstraintsDatal.addAll(copyPowerSequenceScheduleConstraintsData);
                    }
                } else {
                    if (powerSequenceScheduleConstraintsDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.powerSequenceScheduleConstraintsData = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new PowerSequenceScheduleConstraintsListDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final PowerSequenceScheduleConstraintsListDataType that = ((PowerSequenceScheduleConstraintsListDataType) object);
        {
            List<PowerSequenceScheduleConstraintsDataType> leftPowerSequenceScheduleConstraintsData;
            leftPowerSequenceScheduleConstraintsData = (((this.powerSequenceScheduleConstraintsData!= null)&&(!this.powerSequenceScheduleConstraintsData.isEmpty()))?this.getPowerSequenceScheduleConstraintsData():null);
            List<PowerSequenceScheduleConstraintsDataType> rightPowerSequenceScheduleConstraintsData;
            rightPowerSequenceScheduleConstraintsData = (((that.powerSequenceScheduleConstraintsData!= null)&&(!that.powerSequenceScheduleConstraintsData.isEmpty()))?that.getPowerSequenceScheduleConstraintsData():null);
            if ((this.powerSequenceScheduleConstraintsData!= null)&&(!this.powerSequenceScheduleConstraintsData.isEmpty())) {
                if ((that.powerSequenceScheduleConstraintsData!= null)&&(!that.powerSequenceScheduleConstraintsData.isEmpty())) {
                    if (!leftPowerSequenceScheduleConstraintsData.equals(rightPowerSequenceScheduleConstraintsData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.powerSequenceScheduleConstraintsData!= null)&&(!that.powerSequenceScheduleConstraintsData.isEmpty())) {
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
            List<PowerSequenceScheduleConstraintsDataType> thePowerSequenceScheduleConstraintsData;
            thePowerSequenceScheduleConstraintsData = (((this.powerSequenceScheduleConstraintsData!= null)&&(!this.powerSequenceScheduleConstraintsData.isEmpty()))?this.getPowerSequenceScheduleConstraintsData():null);
            if ((this.powerSequenceScheduleConstraintsData!= null)&&(!this.powerSequenceScheduleConstraintsData.isEmpty())) {
                currentHashCode += thePowerSequenceScheduleConstraintsData.hashCode();
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
            List<PowerSequenceScheduleConstraintsDataType> thePowerSequenceScheduleConstraintsData;
            thePowerSequenceScheduleConstraintsData = (((this.powerSequenceScheduleConstraintsData!= null)&&(!this.powerSequenceScheduleConstraintsData.isEmpty()))?this.getPowerSequenceScheduleConstraintsData():null);
            strategy.appendField(locator, this, "powerSequenceScheduleConstraintsData", buffer, thePowerSequenceScheduleConstraintsData, ((this.powerSequenceScheduleConstraintsData!= null)&&(!this.powerSequenceScheduleConstraintsData.isEmpty())));
        }
        return buffer;
    }

}
