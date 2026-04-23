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
 * <p>Java class for PowerTimeSlotValueListDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PowerTimeSlotValueListDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://docs.eebus.org/spine/xsd/v1}powerTimeSlotValueData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PowerTimeSlotValueListDataType", propOrder = {
    "powerTimeSlotValueData"
})
public class PowerTimeSlotValueListDataType implements Cloneable, CopyTo, ToString
{

    protected List<PowerTimeSlotValueDataType> powerTimeSlotValueData;

    /**
     * Default no-arg constructor
     * 
     */
    public PowerTimeSlotValueListDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public PowerTimeSlotValueListDataType(final List<PowerTimeSlotValueDataType> powerTimeSlotValueData) {
        this.powerTimeSlotValueData = powerTimeSlotValueData;
    }

    /**
     * Gets the value of the powerTimeSlotValueData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the powerTimeSlotValueData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPowerTimeSlotValueData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PowerTimeSlotValueDataType }
     * 
     * 
     */
    public List<PowerTimeSlotValueDataType> getPowerTimeSlotValueData() {
        if (powerTimeSlotValueData == null) {
            powerTimeSlotValueData = new ArrayList<PowerTimeSlotValueDataType>();
        }
        return this.powerTimeSlotValueData;
    }

    /**
     * Adds objects to the list of PowerTimeSlotValueData using add method
     * 
     * @param values
     *     objects to add to the list PowerTimeSlotValueData
     * @return
     *     The class instance
     */
    public PowerTimeSlotValueListDataType withPowerTimeSlotValueData(PowerTimeSlotValueDataType... values) {
        if (values!= null) {
            for (PowerTimeSlotValueDataType value: values) {
                getPowerTimeSlotValueData().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of PowerTimeSlotValueData using addAll method
     * 
     * @param values
     *     objects to add to the list PowerTimeSlotValueData
     * @return
     *     The class instance
     */
    public PowerTimeSlotValueListDataType withPowerTimeSlotValueData(Collection<PowerTimeSlotValueDataType> values) {
        if (values!= null) {
            getPowerTimeSlotValueData().addAll(values);
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
        if (draftCopy instanceof PowerTimeSlotValueListDataType) {
            final PowerTimeSlotValueListDataType copy = ((PowerTimeSlotValueListDataType) draftCopy);
            {
                Boolean powerTimeSlotValueDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.powerTimeSlotValueData!= null)&&(!this.powerTimeSlotValueData.isEmpty())));
                if (powerTimeSlotValueDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<PowerTimeSlotValueDataType> sourcePowerTimeSlotValueData;
                    sourcePowerTimeSlotValueData = (((this.powerTimeSlotValueData!= null)&&(!this.powerTimeSlotValueData.isEmpty()))?this.getPowerTimeSlotValueData():null);
                    @SuppressWarnings("unchecked")
                    List<PowerTimeSlotValueDataType> copyPowerTimeSlotValueData = ((List<PowerTimeSlotValueDataType> ) strategy.copy(LocatorUtils.property(locator, "powerTimeSlotValueData", sourcePowerTimeSlotValueData), sourcePowerTimeSlotValueData, ((this.powerTimeSlotValueData!= null)&&(!this.powerTimeSlotValueData.isEmpty()))));
                    copy.powerTimeSlotValueData = null;
                    if (copyPowerTimeSlotValueData!= null) {
                        List<PowerTimeSlotValueDataType> uniquePowerTimeSlotValueDatal = copy.getPowerTimeSlotValueData();
                        uniquePowerTimeSlotValueDatal.addAll(copyPowerTimeSlotValueData);
                    }
                } else {
                    if (powerTimeSlotValueDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.powerTimeSlotValueData = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new PowerTimeSlotValueListDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final PowerTimeSlotValueListDataType that = ((PowerTimeSlotValueListDataType) object);
        {
            List<PowerTimeSlotValueDataType> leftPowerTimeSlotValueData;
            leftPowerTimeSlotValueData = (((this.powerTimeSlotValueData!= null)&&(!this.powerTimeSlotValueData.isEmpty()))?this.getPowerTimeSlotValueData():null);
            List<PowerTimeSlotValueDataType> rightPowerTimeSlotValueData;
            rightPowerTimeSlotValueData = (((that.powerTimeSlotValueData!= null)&&(!that.powerTimeSlotValueData.isEmpty()))?that.getPowerTimeSlotValueData():null);
            if ((this.powerTimeSlotValueData!= null)&&(!this.powerTimeSlotValueData.isEmpty())) {
                if ((that.powerTimeSlotValueData!= null)&&(!that.powerTimeSlotValueData.isEmpty())) {
                    if (!leftPowerTimeSlotValueData.equals(rightPowerTimeSlotValueData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.powerTimeSlotValueData!= null)&&(!that.powerTimeSlotValueData.isEmpty())) {
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
            List<PowerTimeSlotValueDataType> thePowerTimeSlotValueData;
            thePowerTimeSlotValueData = (((this.powerTimeSlotValueData!= null)&&(!this.powerTimeSlotValueData.isEmpty()))?this.getPowerTimeSlotValueData():null);
            if ((this.powerTimeSlotValueData!= null)&&(!this.powerTimeSlotValueData.isEmpty())) {
                currentHashCode += thePowerTimeSlotValueData.hashCode();
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
            List<PowerTimeSlotValueDataType> thePowerTimeSlotValueData;
            thePowerTimeSlotValueData = (((this.powerTimeSlotValueData!= null)&&(!this.powerTimeSlotValueData.isEmpty()))?this.getPowerTimeSlotValueData():null);
            strategy.appendField(locator, this, "powerTimeSlotValueData", buffer, thePowerTimeSlotValueData, ((this.powerTimeSlotValueData!= null)&&(!this.powerTimeSlotValueData.isEmpty())));
        }
        return buffer;
    }

}
