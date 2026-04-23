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
 * <p>Java class for PowerTimeSlotScheduleConstraintsListDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PowerTimeSlotScheduleConstraintsListDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://docs.eebus.org/spine/xsd/v1}powerTimeSlotScheduleConstraintsData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PowerTimeSlotScheduleConstraintsListDataType", propOrder = {
    "powerTimeSlotScheduleConstraintsData"
})
public class PowerTimeSlotScheduleConstraintsListDataType implements Cloneable, CopyTo, ToString
{

    protected List<PowerTimeSlotScheduleConstraintsDataType> powerTimeSlotScheduleConstraintsData;

    /**
     * Default no-arg constructor
     * 
     */
    public PowerTimeSlotScheduleConstraintsListDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public PowerTimeSlotScheduleConstraintsListDataType(final List<PowerTimeSlotScheduleConstraintsDataType> powerTimeSlotScheduleConstraintsData) {
        this.powerTimeSlotScheduleConstraintsData = powerTimeSlotScheduleConstraintsData;
    }

    /**
     * Gets the value of the powerTimeSlotScheduleConstraintsData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the powerTimeSlotScheduleConstraintsData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPowerTimeSlotScheduleConstraintsData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PowerTimeSlotScheduleConstraintsDataType }
     * 
     * 
     */
    public List<PowerTimeSlotScheduleConstraintsDataType> getPowerTimeSlotScheduleConstraintsData() {
        if (powerTimeSlotScheduleConstraintsData == null) {
            powerTimeSlotScheduleConstraintsData = new ArrayList<PowerTimeSlotScheduleConstraintsDataType>();
        }
        return this.powerTimeSlotScheduleConstraintsData;
    }

    /**
     * Adds objects to the list of PowerTimeSlotScheduleConstraintsData using add method
     * 
     * @param values
     *     objects to add to the list PowerTimeSlotScheduleConstraintsData
     * @return
     *     The class instance
     */
    public PowerTimeSlotScheduleConstraintsListDataType withPowerTimeSlotScheduleConstraintsData(PowerTimeSlotScheduleConstraintsDataType... values) {
        if (values!= null) {
            for (PowerTimeSlotScheduleConstraintsDataType value: values) {
                getPowerTimeSlotScheduleConstraintsData().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of PowerTimeSlotScheduleConstraintsData using addAll method
     * 
     * @param values
     *     objects to add to the list PowerTimeSlotScheduleConstraintsData
     * @return
     *     The class instance
     */
    public PowerTimeSlotScheduleConstraintsListDataType withPowerTimeSlotScheduleConstraintsData(Collection<PowerTimeSlotScheduleConstraintsDataType> values) {
        if (values!= null) {
            getPowerTimeSlotScheduleConstraintsData().addAll(values);
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
        if (draftCopy instanceof PowerTimeSlotScheduleConstraintsListDataType) {
            final PowerTimeSlotScheduleConstraintsListDataType copy = ((PowerTimeSlotScheduleConstraintsListDataType) draftCopy);
            {
                Boolean powerTimeSlotScheduleConstraintsDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.powerTimeSlotScheduleConstraintsData!= null)&&(!this.powerTimeSlotScheduleConstraintsData.isEmpty())));
                if (powerTimeSlotScheduleConstraintsDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<PowerTimeSlotScheduleConstraintsDataType> sourcePowerTimeSlotScheduleConstraintsData;
                    sourcePowerTimeSlotScheduleConstraintsData = (((this.powerTimeSlotScheduleConstraintsData!= null)&&(!this.powerTimeSlotScheduleConstraintsData.isEmpty()))?this.getPowerTimeSlotScheduleConstraintsData():null);
                    @SuppressWarnings("unchecked")
                    List<PowerTimeSlotScheduleConstraintsDataType> copyPowerTimeSlotScheduleConstraintsData = ((List<PowerTimeSlotScheduleConstraintsDataType> ) strategy.copy(LocatorUtils.property(locator, "powerTimeSlotScheduleConstraintsData", sourcePowerTimeSlotScheduleConstraintsData), sourcePowerTimeSlotScheduleConstraintsData, ((this.powerTimeSlotScheduleConstraintsData!= null)&&(!this.powerTimeSlotScheduleConstraintsData.isEmpty()))));
                    copy.powerTimeSlotScheduleConstraintsData = null;
                    if (copyPowerTimeSlotScheduleConstraintsData!= null) {
                        List<PowerTimeSlotScheduleConstraintsDataType> uniquePowerTimeSlotScheduleConstraintsDatal = copy.getPowerTimeSlotScheduleConstraintsData();
                        uniquePowerTimeSlotScheduleConstraintsDatal.addAll(copyPowerTimeSlotScheduleConstraintsData);
                    }
                } else {
                    if (powerTimeSlotScheduleConstraintsDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.powerTimeSlotScheduleConstraintsData = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new PowerTimeSlotScheduleConstraintsListDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final PowerTimeSlotScheduleConstraintsListDataType that = ((PowerTimeSlotScheduleConstraintsListDataType) object);
        {
            List<PowerTimeSlotScheduleConstraintsDataType> leftPowerTimeSlotScheduleConstraintsData;
            leftPowerTimeSlotScheduleConstraintsData = (((this.powerTimeSlotScheduleConstraintsData!= null)&&(!this.powerTimeSlotScheduleConstraintsData.isEmpty()))?this.getPowerTimeSlotScheduleConstraintsData():null);
            List<PowerTimeSlotScheduleConstraintsDataType> rightPowerTimeSlotScheduleConstraintsData;
            rightPowerTimeSlotScheduleConstraintsData = (((that.powerTimeSlotScheduleConstraintsData!= null)&&(!that.powerTimeSlotScheduleConstraintsData.isEmpty()))?that.getPowerTimeSlotScheduleConstraintsData():null);
            if ((this.powerTimeSlotScheduleConstraintsData!= null)&&(!this.powerTimeSlotScheduleConstraintsData.isEmpty())) {
                if ((that.powerTimeSlotScheduleConstraintsData!= null)&&(!that.powerTimeSlotScheduleConstraintsData.isEmpty())) {
                    if (!leftPowerTimeSlotScheduleConstraintsData.equals(rightPowerTimeSlotScheduleConstraintsData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.powerTimeSlotScheduleConstraintsData!= null)&&(!that.powerTimeSlotScheduleConstraintsData.isEmpty())) {
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
            List<PowerTimeSlotScheduleConstraintsDataType> thePowerTimeSlotScheduleConstraintsData;
            thePowerTimeSlotScheduleConstraintsData = (((this.powerTimeSlotScheduleConstraintsData!= null)&&(!this.powerTimeSlotScheduleConstraintsData.isEmpty()))?this.getPowerTimeSlotScheduleConstraintsData():null);
            if ((this.powerTimeSlotScheduleConstraintsData!= null)&&(!this.powerTimeSlotScheduleConstraintsData.isEmpty())) {
                currentHashCode += thePowerTimeSlotScheduleConstraintsData.hashCode();
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
            List<PowerTimeSlotScheduleConstraintsDataType> thePowerTimeSlotScheduleConstraintsData;
            thePowerTimeSlotScheduleConstraintsData = (((this.powerTimeSlotScheduleConstraintsData!= null)&&(!this.powerTimeSlotScheduleConstraintsData.isEmpty()))?this.getPowerTimeSlotScheduleConstraintsData():null);
            strategy.appendField(locator, this, "powerTimeSlotScheduleConstraintsData", buffer, thePowerTimeSlotScheduleConstraintsData, ((this.powerTimeSlotScheduleConstraintsData!= null)&&(!this.powerTimeSlotScheduleConstraintsData.isEmpty())));
        }
        return buffer;
    }

}
