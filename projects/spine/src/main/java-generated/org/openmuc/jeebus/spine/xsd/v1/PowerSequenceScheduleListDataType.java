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
 * <p>Java class for PowerSequenceScheduleListDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PowerSequenceScheduleListDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://docs.eebus.org/spine/xsd/v1}powerSequenceScheduleData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PowerSequenceScheduleListDataType", propOrder = {
    "powerSequenceScheduleData"
})
public class PowerSequenceScheduleListDataType implements Cloneable, CopyTo, ToString
{

    protected List<PowerSequenceScheduleDataType> powerSequenceScheduleData;

    /**
     * Default no-arg constructor
     * 
     */
    public PowerSequenceScheduleListDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public PowerSequenceScheduleListDataType(final List<PowerSequenceScheduleDataType> powerSequenceScheduleData) {
        this.powerSequenceScheduleData = powerSequenceScheduleData;
    }

    /**
     * Gets the value of the powerSequenceScheduleData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the powerSequenceScheduleData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPowerSequenceScheduleData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PowerSequenceScheduleDataType }
     * 
     * 
     */
    public List<PowerSequenceScheduleDataType> getPowerSequenceScheduleData() {
        if (powerSequenceScheduleData == null) {
            powerSequenceScheduleData = new ArrayList<PowerSequenceScheduleDataType>();
        }
        return this.powerSequenceScheduleData;
    }

    /**
     * Adds objects to the list of PowerSequenceScheduleData using add method
     * 
     * @param values
     *     objects to add to the list PowerSequenceScheduleData
     * @return
     *     The class instance
     */
    public PowerSequenceScheduleListDataType withPowerSequenceScheduleData(PowerSequenceScheduleDataType... values) {
        if (values!= null) {
            for (PowerSequenceScheduleDataType value: values) {
                getPowerSequenceScheduleData().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of PowerSequenceScheduleData using addAll method
     * 
     * @param values
     *     objects to add to the list PowerSequenceScheduleData
     * @return
     *     The class instance
     */
    public PowerSequenceScheduleListDataType withPowerSequenceScheduleData(Collection<PowerSequenceScheduleDataType> values) {
        if (values!= null) {
            getPowerSequenceScheduleData().addAll(values);
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
        if (draftCopy instanceof PowerSequenceScheduleListDataType) {
            final PowerSequenceScheduleListDataType copy = ((PowerSequenceScheduleListDataType) draftCopy);
            {
                Boolean powerSequenceScheduleDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.powerSequenceScheduleData!= null)&&(!this.powerSequenceScheduleData.isEmpty())));
                if (powerSequenceScheduleDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<PowerSequenceScheduleDataType> sourcePowerSequenceScheduleData;
                    sourcePowerSequenceScheduleData = (((this.powerSequenceScheduleData!= null)&&(!this.powerSequenceScheduleData.isEmpty()))?this.getPowerSequenceScheduleData():null);
                    @SuppressWarnings("unchecked")
                    List<PowerSequenceScheduleDataType> copyPowerSequenceScheduleData = ((List<PowerSequenceScheduleDataType> ) strategy.copy(LocatorUtils.property(locator, "powerSequenceScheduleData", sourcePowerSequenceScheduleData), sourcePowerSequenceScheduleData, ((this.powerSequenceScheduleData!= null)&&(!this.powerSequenceScheduleData.isEmpty()))));
                    copy.powerSequenceScheduleData = null;
                    if (copyPowerSequenceScheduleData!= null) {
                        List<PowerSequenceScheduleDataType> uniquePowerSequenceScheduleDatal = copy.getPowerSequenceScheduleData();
                        uniquePowerSequenceScheduleDatal.addAll(copyPowerSequenceScheduleData);
                    }
                } else {
                    if (powerSequenceScheduleDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.powerSequenceScheduleData = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new PowerSequenceScheduleListDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final PowerSequenceScheduleListDataType that = ((PowerSequenceScheduleListDataType) object);
        {
            List<PowerSequenceScheduleDataType> leftPowerSequenceScheduleData;
            leftPowerSequenceScheduleData = (((this.powerSequenceScheduleData!= null)&&(!this.powerSequenceScheduleData.isEmpty()))?this.getPowerSequenceScheduleData():null);
            List<PowerSequenceScheduleDataType> rightPowerSequenceScheduleData;
            rightPowerSequenceScheduleData = (((that.powerSequenceScheduleData!= null)&&(!that.powerSequenceScheduleData.isEmpty()))?that.getPowerSequenceScheduleData():null);
            if ((this.powerSequenceScheduleData!= null)&&(!this.powerSequenceScheduleData.isEmpty())) {
                if ((that.powerSequenceScheduleData!= null)&&(!that.powerSequenceScheduleData.isEmpty())) {
                    if (!leftPowerSequenceScheduleData.equals(rightPowerSequenceScheduleData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.powerSequenceScheduleData!= null)&&(!that.powerSequenceScheduleData.isEmpty())) {
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
            List<PowerSequenceScheduleDataType> thePowerSequenceScheduleData;
            thePowerSequenceScheduleData = (((this.powerSequenceScheduleData!= null)&&(!this.powerSequenceScheduleData.isEmpty()))?this.getPowerSequenceScheduleData():null);
            if ((this.powerSequenceScheduleData!= null)&&(!this.powerSequenceScheduleData.isEmpty())) {
                currentHashCode += thePowerSequenceScheduleData.hashCode();
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
            List<PowerSequenceScheduleDataType> thePowerSequenceScheduleData;
            thePowerSequenceScheduleData = (((this.powerSequenceScheduleData!= null)&&(!this.powerSequenceScheduleData.isEmpty()))?this.getPowerSequenceScheduleData():null);
            strategy.appendField(locator, this, "powerSequenceScheduleData", buffer, thePowerSequenceScheduleData, ((this.powerSequenceScheduleData!= null)&&(!this.powerSequenceScheduleData.isEmpty())));
        }
        return buffer;
    }

}
