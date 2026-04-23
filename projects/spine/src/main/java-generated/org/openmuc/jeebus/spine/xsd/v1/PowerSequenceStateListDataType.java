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
 * <p>Java class for PowerSequenceStateListDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PowerSequenceStateListDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://docs.eebus.org/spine/xsd/v1}powerSequenceStateData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PowerSequenceStateListDataType", propOrder = {
    "powerSequenceStateData"
})
public class PowerSequenceStateListDataType implements Cloneable, CopyTo, ToString
{

    protected List<PowerSequenceStateDataType> powerSequenceStateData;

    /**
     * Default no-arg constructor
     * 
     */
    public PowerSequenceStateListDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public PowerSequenceStateListDataType(final List<PowerSequenceStateDataType> powerSequenceStateData) {
        this.powerSequenceStateData = powerSequenceStateData;
    }

    /**
     * Gets the value of the powerSequenceStateData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the powerSequenceStateData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPowerSequenceStateData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PowerSequenceStateDataType }
     * 
     * 
     */
    public List<PowerSequenceStateDataType> getPowerSequenceStateData() {
        if (powerSequenceStateData == null) {
            powerSequenceStateData = new ArrayList<PowerSequenceStateDataType>();
        }
        return this.powerSequenceStateData;
    }

    /**
     * Adds objects to the list of PowerSequenceStateData using add method
     * 
     * @param values
     *     objects to add to the list PowerSequenceStateData
     * @return
     *     The class instance
     */
    public PowerSequenceStateListDataType withPowerSequenceStateData(PowerSequenceStateDataType... values) {
        if (values!= null) {
            for (PowerSequenceStateDataType value: values) {
                getPowerSequenceStateData().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of PowerSequenceStateData using addAll method
     * 
     * @param values
     *     objects to add to the list PowerSequenceStateData
     * @return
     *     The class instance
     */
    public PowerSequenceStateListDataType withPowerSequenceStateData(Collection<PowerSequenceStateDataType> values) {
        if (values!= null) {
            getPowerSequenceStateData().addAll(values);
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
        if (draftCopy instanceof PowerSequenceStateListDataType) {
            final PowerSequenceStateListDataType copy = ((PowerSequenceStateListDataType) draftCopy);
            {
                Boolean powerSequenceStateDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.powerSequenceStateData!= null)&&(!this.powerSequenceStateData.isEmpty())));
                if (powerSequenceStateDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<PowerSequenceStateDataType> sourcePowerSequenceStateData;
                    sourcePowerSequenceStateData = (((this.powerSequenceStateData!= null)&&(!this.powerSequenceStateData.isEmpty()))?this.getPowerSequenceStateData():null);
                    @SuppressWarnings("unchecked")
                    List<PowerSequenceStateDataType> copyPowerSequenceStateData = ((List<PowerSequenceStateDataType> ) strategy.copy(LocatorUtils.property(locator, "powerSequenceStateData", sourcePowerSequenceStateData), sourcePowerSequenceStateData, ((this.powerSequenceStateData!= null)&&(!this.powerSequenceStateData.isEmpty()))));
                    copy.powerSequenceStateData = null;
                    if (copyPowerSequenceStateData!= null) {
                        List<PowerSequenceStateDataType> uniquePowerSequenceStateDatal = copy.getPowerSequenceStateData();
                        uniquePowerSequenceStateDatal.addAll(copyPowerSequenceStateData);
                    }
                } else {
                    if (powerSequenceStateDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.powerSequenceStateData = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new PowerSequenceStateListDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final PowerSequenceStateListDataType that = ((PowerSequenceStateListDataType) object);
        {
            List<PowerSequenceStateDataType> leftPowerSequenceStateData;
            leftPowerSequenceStateData = (((this.powerSequenceStateData!= null)&&(!this.powerSequenceStateData.isEmpty()))?this.getPowerSequenceStateData():null);
            List<PowerSequenceStateDataType> rightPowerSequenceStateData;
            rightPowerSequenceStateData = (((that.powerSequenceStateData!= null)&&(!that.powerSequenceStateData.isEmpty()))?that.getPowerSequenceStateData():null);
            if ((this.powerSequenceStateData!= null)&&(!this.powerSequenceStateData.isEmpty())) {
                if ((that.powerSequenceStateData!= null)&&(!that.powerSequenceStateData.isEmpty())) {
                    if (!leftPowerSequenceStateData.equals(rightPowerSequenceStateData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.powerSequenceStateData!= null)&&(!that.powerSequenceStateData.isEmpty())) {
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
            List<PowerSequenceStateDataType> thePowerSequenceStateData;
            thePowerSequenceStateData = (((this.powerSequenceStateData!= null)&&(!this.powerSequenceStateData.isEmpty()))?this.getPowerSequenceStateData():null);
            if ((this.powerSequenceStateData!= null)&&(!this.powerSequenceStateData.isEmpty())) {
                currentHashCode += thePowerSequenceStateData.hashCode();
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
            List<PowerSequenceStateDataType> thePowerSequenceStateData;
            thePowerSequenceStateData = (((this.powerSequenceStateData!= null)&&(!this.powerSequenceStateData.isEmpty()))?this.getPowerSequenceStateData():null);
            strategy.appendField(locator, this, "powerSequenceStateData", buffer, thePowerSequenceStateData, ((this.powerSequenceStateData!= null)&&(!this.powerSequenceStateData.isEmpty())));
        }
        return buffer;
    }

}
