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
 * <p>Java class for PowerSequencePriceListDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PowerSequencePriceListDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://docs.eebus.org/spine/xsd/v1}powerSequencePriceData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PowerSequencePriceListDataType", propOrder = {
    "powerSequencePriceData"
})
public class PowerSequencePriceListDataType implements Cloneable, CopyTo, ToString
{

    protected List<PowerSequencePriceDataType> powerSequencePriceData;

    /**
     * Default no-arg constructor
     * 
     */
    public PowerSequencePriceListDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public PowerSequencePriceListDataType(final List<PowerSequencePriceDataType> powerSequencePriceData) {
        this.powerSequencePriceData = powerSequencePriceData;
    }

    /**
     * Gets the value of the powerSequencePriceData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the powerSequencePriceData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPowerSequencePriceData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PowerSequencePriceDataType }
     * 
     * 
     */
    public List<PowerSequencePriceDataType> getPowerSequencePriceData() {
        if (powerSequencePriceData == null) {
            powerSequencePriceData = new ArrayList<PowerSequencePriceDataType>();
        }
        return this.powerSequencePriceData;
    }

    /**
     * Adds objects to the list of PowerSequencePriceData using add method
     * 
     * @param values
     *     objects to add to the list PowerSequencePriceData
     * @return
     *     The class instance
     */
    public PowerSequencePriceListDataType withPowerSequencePriceData(PowerSequencePriceDataType... values) {
        if (values!= null) {
            for (PowerSequencePriceDataType value: values) {
                getPowerSequencePriceData().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of PowerSequencePriceData using addAll method
     * 
     * @param values
     *     objects to add to the list PowerSequencePriceData
     * @return
     *     The class instance
     */
    public PowerSequencePriceListDataType withPowerSequencePriceData(Collection<PowerSequencePriceDataType> values) {
        if (values!= null) {
            getPowerSequencePriceData().addAll(values);
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
        if (draftCopy instanceof PowerSequencePriceListDataType) {
            final PowerSequencePriceListDataType copy = ((PowerSequencePriceListDataType) draftCopy);
            {
                Boolean powerSequencePriceDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.powerSequencePriceData!= null)&&(!this.powerSequencePriceData.isEmpty())));
                if (powerSequencePriceDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<PowerSequencePriceDataType> sourcePowerSequencePriceData;
                    sourcePowerSequencePriceData = (((this.powerSequencePriceData!= null)&&(!this.powerSequencePriceData.isEmpty()))?this.getPowerSequencePriceData():null);
                    @SuppressWarnings("unchecked")
                    List<PowerSequencePriceDataType> copyPowerSequencePriceData = ((List<PowerSequencePriceDataType> ) strategy.copy(LocatorUtils.property(locator, "powerSequencePriceData", sourcePowerSequencePriceData), sourcePowerSequencePriceData, ((this.powerSequencePriceData!= null)&&(!this.powerSequencePriceData.isEmpty()))));
                    copy.powerSequencePriceData = null;
                    if (copyPowerSequencePriceData!= null) {
                        List<PowerSequencePriceDataType> uniquePowerSequencePriceDatal = copy.getPowerSequencePriceData();
                        uniquePowerSequencePriceDatal.addAll(copyPowerSequencePriceData);
                    }
                } else {
                    if (powerSequencePriceDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.powerSequencePriceData = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new PowerSequencePriceListDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final PowerSequencePriceListDataType that = ((PowerSequencePriceListDataType) object);
        {
            List<PowerSequencePriceDataType> leftPowerSequencePriceData;
            leftPowerSequencePriceData = (((this.powerSequencePriceData!= null)&&(!this.powerSequencePriceData.isEmpty()))?this.getPowerSequencePriceData():null);
            List<PowerSequencePriceDataType> rightPowerSequencePriceData;
            rightPowerSequencePriceData = (((that.powerSequencePriceData!= null)&&(!that.powerSequencePriceData.isEmpty()))?that.getPowerSequencePriceData():null);
            if ((this.powerSequencePriceData!= null)&&(!this.powerSequencePriceData.isEmpty())) {
                if ((that.powerSequencePriceData!= null)&&(!that.powerSequencePriceData.isEmpty())) {
                    if (!leftPowerSequencePriceData.equals(rightPowerSequencePriceData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.powerSequencePriceData!= null)&&(!that.powerSequencePriceData.isEmpty())) {
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
            List<PowerSequencePriceDataType> thePowerSequencePriceData;
            thePowerSequencePriceData = (((this.powerSequencePriceData!= null)&&(!this.powerSequencePriceData.isEmpty()))?this.getPowerSequencePriceData():null);
            if ((this.powerSequencePriceData!= null)&&(!this.powerSequencePriceData.isEmpty())) {
                currentHashCode += thePowerSequencePriceData.hashCode();
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
            List<PowerSequencePriceDataType> thePowerSequencePriceData;
            thePowerSequencePriceData = (((this.powerSequencePriceData!= null)&&(!this.powerSequencePriceData.isEmpty()))?this.getPowerSequencePriceData():null);
            strategy.appendField(locator, this, "powerSequencePriceData", buffer, thePowerSequencePriceData, ((this.powerSequencePriceData!= null)&&(!this.powerSequencePriceData.isEmpty())));
        }
        return buffer;
    }

}
