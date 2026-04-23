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
 * <p>Java class for PowerSequenceDescriptionListDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PowerSequenceDescriptionListDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://docs.eebus.org/spine/xsd/v1}powerSequenceDescriptionData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PowerSequenceDescriptionListDataType", propOrder = {
    "powerSequenceDescriptionData"
})
public class PowerSequenceDescriptionListDataType implements Cloneable, CopyTo, ToString
{

    protected List<PowerSequenceDescriptionDataType> powerSequenceDescriptionData;

    /**
     * Default no-arg constructor
     * 
     */
    public PowerSequenceDescriptionListDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public PowerSequenceDescriptionListDataType(final List<PowerSequenceDescriptionDataType> powerSequenceDescriptionData) {
        this.powerSequenceDescriptionData = powerSequenceDescriptionData;
    }

    /**
     * Gets the value of the powerSequenceDescriptionData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the powerSequenceDescriptionData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPowerSequenceDescriptionData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PowerSequenceDescriptionDataType }
     * 
     * 
     */
    public List<PowerSequenceDescriptionDataType> getPowerSequenceDescriptionData() {
        if (powerSequenceDescriptionData == null) {
            powerSequenceDescriptionData = new ArrayList<PowerSequenceDescriptionDataType>();
        }
        return this.powerSequenceDescriptionData;
    }

    /**
     * Adds objects to the list of PowerSequenceDescriptionData using add method
     * 
     * @param values
     *     objects to add to the list PowerSequenceDescriptionData
     * @return
     *     The class instance
     */
    public PowerSequenceDescriptionListDataType withPowerSequenceDescriptionData(PowerSequenceDescriptionDataType... values) {
        if (values!= null) {
            for (PowerSequenceDescriptionDataType value: values) {
                getPowerSequenceDescriptionData().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of PowerSequenceDescriptionData using addAll method
     * 
     * @param values
     *     objects to add to the list PowerSequenceDescriptionData
     * @return
     *     The class instance
     */
    public PowerSequenceDescriptionListDataType withPowerSequenceDescriptionData(Collection<PowerSequenceDescriptionDataType> values) {
        if (values!= null) {
            getPowerSequenceDescriptionData().addAll(values);
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
        if (draftCopy instanceof PowerSequenceDescriptionListDataType) {
            final PowerSequenceDescriptionListDataType copy = ((PowerSequenceDescriptionListDataType) draftCopy);
            {
                Boolean powerSequenceDescriptionDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.powerSequenceDescriptionData!= null)&&(!this.powerSequenceDescriptionData.isEmpty())));
                if (powerSequenceDescriptionDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<PowerSequenceDescriptionDataType> sourcePowerSequenceDescriptionData;
                    sourcePowerSequenceDescriptionData = (((this.powerSequenceDescriptionData!= null)&&(!this.powerSequenceDescriptionData.isEmpty()))?this.getPowerSequenceDescriptionData():null);
                    @SuppressWarnings("unchecked")
                    List<PowerSequenceDescriptionDataType> copyPowerSequenceDescriptionData = ((List<PowerSequenceDescriptionDataType> ) strategy.copy(LocatorUtils.property(locator, "powerSequenceDescriptionData", sourcePowerSequenceDescriptionData), sourcePowerSequenceDescriptionData, ((this.powerSequenceDescriptionData!= null)&&(!this.powerSequenceDescriptionData.isEmpty()))));
                    copy.powerSequenceDescriptionData = null;
                    if (copyPowerSequenceDescriptionData!= null) {
                        List<PowerSequenceDescriptionDataType> uniquePowerSequenceDescriptionDatal = copy.getPowerSequenceDescriptionData();
                        uniquePowerSequenceDescriptionDatal.addAll(copyPowerSequenceDescriptionData);
                    }
                } else {
                    if (powerSequenceDescriptionDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.powerSequenceDescriptionData = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new PowerSequenceDescriptionListDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final PowerSequenceDescriptionListDataType that = ((PowerSequenceDescriptionListDataType) object);
        {
            List<PowerSequenceDescriptionDataType> leftPowerSequenceDescriptionData;
            leftPowerSequenceDescriptionData = (((this.powerSequenceDescriptionData!= null)&&(!this.powerSequenceDescriptionData.isEmpty()))?this.getPowerSequenceDescriptionData():null);
            List<PowerSequenceDescriptionDataType> rightPowerSequenceDescriptionData;
            rightPowerSequenceDescriptionData = (((that.powerSequenceDescriptionData!= null)&&(!that.powerSequenceDescriptionData.isEmpty()))?that.getPowerSequenceDescriptionData():null);
            if ((this.powerSequenceDescriptionData!= null)&&(!this.powerSequenceDescriptionData.isEmpty())) {
                if ((that.powerSequenceDescriptionData!= null)&&(!that.powerSequenceDescriptionData.isEmpty())) {
                    if (!leftPowerSequenceDescriptionData.equals(rightPowerSequenceDescriptionData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.powerSequenceDescriptionData!= null)&&(!that.powerSequenceDescriptionData.isEmpty())) {
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
            List<PowerSequenceDescriptionDataType> thePowerSequenceDescriptionData;
            thePowerSequenceDescriptionData = (((this.powerSequenceDescriptionData!= null)&&(!this.powerSequenceDescriptionData.isEmpty()))?this.getPowerSequenceDescriptionData():null);
            if ((this.powerSequenceDescriptionData!= null)&&(!this.powerSequenceDescriptionData.isEmpty())) {
                currentHashCode += thePowerSequenceDescriptionData.hashCode();
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
            List<PowerSequenceDescriptionDataType> thePowerSequenceDescriptionData;
            thePowerSequenceDescriptionData = (((this.powerSequenceDescriptionData!= null)&&(!this.powerSequenceDescriptionData.isEmpty()))?this.getPowerSequenceDescriptionData():null);
            strategy.appendField(locator, this, "powerSequenceDescriptionData", buffer, thePowerSequenceDescriptionData, ((this.powerSequenceDescriptionData!= null)&&(!this.powerSequenceDescriptionData.isEmpty())));
        }
        return buffer;
    }

}
