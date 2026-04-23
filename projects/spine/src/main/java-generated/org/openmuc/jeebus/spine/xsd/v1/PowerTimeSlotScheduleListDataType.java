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
 * <p>Java class for PowerTimeSlotScheduleListDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PowerTimeSlotScheduleListDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://docs.eebus.org/spine/xsd/v1}powerTimeSlotScheduleData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PowerTimeSlotScheduleListDataType", propOrder = {
    "powerTimeSlotScheduleData"
})
public class PowerTimeSlotScheduleListDataType implements Cloneable, CopyTo, ToString
{

    protected List<PowerTimeSlotScheduleDataType> powerTimeSlotScheduleData;

    /**
     * Default no-arg constructor
     * 
     */
    public PowerTimeSlotScheduleListDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public PowerTimeSlotScheduleListDataType(final List<PowerTimeSlotScheduleDataType> powerTimeSlotScheduleData) {
        this.powerTimeSlotScheduleData = powerTimeSlotScheduleData;
    }

    /**
     * Gets the value of the powerTimeSlotScheduleData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the powerTimeSlotScheduleData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPowerTimeSlotScheduleData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PowerTimeSlotScheduleDataType }
     * 
     * 
     */
    public List<PowerTimeSlotScheduleDataType> getPowerTimeSlotScheduleData() {
        if (powerTimeSlotScheduleData == null) {
            powerTimeSlotScheduleData = new ArrayList<PowerTimeSlotScheduleDataType>();
        }
        return this.powerTimeSlotScheduleData;
    }

    /**
     * Adds objects to the list of PowerTimeSlotScheduleData using add method
     * 
     * @param values
     *     objects to add to the list PowerTimeSlotScheduleData
     * @return
     *     The class instance
     */
    public PowerTimeSlotScheduleListDataType withPowerTimeSlotScheduleData(PowerTimeSlotScheduleDataType... values) {
        if (values!= null) {
            for (PowerTimeSlotScheduleDataType value: values) {
                getPowerTimeSlotScheduleData().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of PowerTimeSlotScheduleData using addAll method
     * 
     * @param values
     *     objects to add to the list PowerTimeSlotScheduleData
     * @return
     *     The class instance
     */
    public PowerTimeSlotScheduleListDataType withPowerTimeSlotScheduleData(Collection<PowerTimeSlotScheduleDataType> values) {
        if (values!= null) {
            getPowerTimeSlotScheduleData().addAll(values);
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
        if (draftCopy instanceof PowerTimeSlotScheduleListDataType) {
            final PowerTimeSlotScheduleListDataType copy = ((PowerTimeSlotScheduleListDataType) draftCopy);
            {
                Boolean powerTimeSlotScheduleDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.powerTimeSlotScheduleData!= null)&&(!this.powerTimeSlotScheduleData.isEmpty())));
                if (powerTimeSlotScheduleDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<PowerTimeSlotScheduleDataType> sourcePowerTimeSlotScheduleData;
                    sourcePowerTimeSlotScheduleData = (((this.powerTimeSlotScheduleData!= null)&&(!this.powerTimeSlotScheduleData.isEmpty()))?this.getPowerTimeSlotScheduleData():null);
                    @SuppressWarnings("unchecked")
                    List<PowerTimeSlotScheduleDataType> copyPowerTimeSlotScheduleData = ((List<PowerTimeSlotScheduleDataType> ) strategy.copy(LocatorUtils.property(locator, "powerTimeSlotScheduleData", sourcePowerTimeSlotScheduleData), sourcePowerTimeSlotScheduleData, ((this.powerTimeSlotScheduleData!= null)&&(!this.powerTimeSlotScheduleData.isEmpty()))));
                    copy.powerTimeSlotScheduleData = null;
                    if (copyPowerTimeSlotScheduleData!= null) {
                        List<PowerTimeSlotScheduleDataType> uniquePowerTimeSlotScheduleDatal = copy.getPowerTimeSlotScheduleData();
                        uniquePowerTimeSlotScheduleDatal.addAll(copyPowerTimeSlotScheduleData);
                    }
                } else {
                    if (powerTimeSlotScheduleDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.powerTimeSlotScheduleData = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new PowerTimeSlotScheduleListDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final PowerTimeSlotScheduleListDataType that = ((PowerTimeSlotScheduleListDataType) object);
        {
            List<PowerTimeSlotScheduleDataType> leftPowerTimeSlotScheduleData;
            leftPowerTimeSlotScheduleData = (((this.powerTimeSlotScheduleData!= null)&&(!this.powerTimeSlotScheduleData.isEmpty()))?this.getPowerTimeSlotScheduleData():null);
            List<PowerTimeSlotScheduleDataType> rightPowerTimeSlotScheduleData;
            rightPowerTimeSlotScheduleData = (((that.powerTimeSlotScheduleData!= null)&&(!that.powerTimeSlotScheduleData.isEmpty()))?that.getPowerTimeSlotScheduleData():null);
            if ((this.powerTimeSlotScheduleData!= null)&&(!this.powerTimeSlotScheduleData.isEmpty())) {
                if ((that.powerTimeSlotScheduleData!= null)&&(!that.powerTimeSlotScheduleData.isEmpty())) {
                    if (!leftPowerTimeSlotScheduleData.equals(rightPowerTimeSlotScheduleData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.powerTimeSlotScheduleData!= null)&&(!that.powerTimeSlotScheduleData.isEmpty())) {
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
            List<PowerTimeSlotScheduleDataType> thePowerTimeSlotScheduleData;
            thePowerTimeSlotScheduleData = (((this.powerTimeSlotScheduleData!= null)&&(!this.powerTimeSlotScheduleData.isEmpty()))?this.getPowerTimeSlotScheduleData():null);
            if ((this.powerTimeSlotScheduleData!= null)&&(!this.powerTimeSlotScheduleData.isEmpty())) {
                currentHashCode += thePowerTimeSlotScheduleData.hashCode();
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
            List<PowerTimeSlotScheduleDataType> thePowerTimeSlotScheduleData;
            thePowerTimeSlotScheduleData = (((this.powerTimeSlotScheduleData!= null)&&(!this.powerTimeSlotScheduleData.isEmpty()))?this.getPowerTimeSlotScheduleData():null);
            strategy.appendField(locator, this, "powerTimeSlotScheduleData", buffer, thePowerTimeSlotScheduleData, ((this.powerTimeSlotScheduleData!= null)&&(!this.powerTimeSlotScheduleData.isEmpty())));
        }
        return buffer;
    }

}
