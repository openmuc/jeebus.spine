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
 * <p>Java class for PowerSequenceAlternativesRelationListDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PowerSequenceAlternativesRelationListDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://docs.eebus.org/spine/xsd/v1}powerSequenceAlternativesRelationData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PowerSequenceAlternativesRelationListDataType", propOrder = {
    "powerSequenceAlternativesRelationData"
})
public class PowerSequenceAlternativesRelationListDataType implements Cloneable, CopyTo, ToString
{

    protected List<PowerSequenceAlternativesRelationDataType> powerSequenceAlternativesRelationData;

    /**
     * Default no-arg constructor
     * 
     */
    public PowerSequenceAlternativesRelationListDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public PowerSequenceAlternativesRelationListDataType(final List<PowerSequenceAlternativesRelationDataType> powerSequenceAlternativesRelationData) {
        this.powerSequenceAlternativesRelationData = powerSequenceAlternativesRelationData;
    }

    /**
     * Gets the value of the powerSequenceAlternativesRelationData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the powerSequenceAlternativesRelationData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPowerSequenceAlternativesRelationData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PowerSequenceAlternativesRelationDataType }
     * 
     * 
     */
    public List<PowerSequenceAlternativesRelationDataType> getPowerSequenceAlternativesRelationData() {
        if (powerSequenceAlternativesRelationData == null) {
            powerSequenceAlternativesRelationData = new ArrayList<PowerSequenceAlternativesRelationDataType>();
        }
        return this.powerSequenceAlternativesRelationData;
    }

    /**
     * Adds objects to the list of PowerSequenceAlternativesRelationData using add method
     * 
     * @param values
     *     objects to add to the list PowerSequenceAlternativesRelationData
     * @return
     *     The class instance
     */
    public PowerSequenceAlternativesRelationListDataType withPowerSequenceAlternativesRelationData(PowerSequenceAlternativesRelationDataType... values) {
        if (values!= null) {
            for (PowerSequenceAlternativesRelationDataType value: values) {
                getPowerSequenceAlternativesRelationData().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of PowerSequenceAlternativesRelationData using addAll method
     * 
     * @param values
     *     objects to add to the list PowerSequenceAlternativesRelationData
     * @return
     *     The class instance
     */
    public PowerSequenceAlternativesRelationListDataType withPowerSequenceAlternativesRelationData(Collection<PowerSequenceAlternativesRelationDataType> values) {
        if (values!= null) {
            getPowerSequenceAlternativesRelationData().addAll(values);
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
        if (draftCopy instanceof PowerSequenceAlternativesRelationListDataType) {
            final PowerSequenceAlternativesRelationListDataType copy = ((PowerSequenceAlternativesRelationListDataType) draftCopy);
            {
                Boolean powerSequenceAlternativesRelationDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.powerSequenceAlternativesRelationData!= null)&&(!this.powerSequenceAlternativesRelationData.isEmpty())));
                if (powerSequenceAlternativesRelationDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<PowerSequenceAlternativesRelationDataType> sourcePowerSequenceAlternativesRelationData;
                    sourcePowerSequenceAlternativesRelationData = (((this.powerSequenceAlternativesRelationData!= null)&&(!this.powerSequenceAlternativesRelationData.isEmpty()))?this.getPowerSequenceAlternativesRelationData():null);
                    @SuppressWarnings("unchecked")
                    List<PowerSequenceAlternativesRelationDataType> copyPowerSequenceAlternativesRelationData = ((List<PowerSequenceAlternativesRelationDataType> ) strategy.copy(LocatorUtils.property(locator, "powerSequenceAlternativesRelationData", sourcePowerSequenceAlternativesRelationData), sourcePowerSequenceAlternativesRelationData, ((this.powerSequenceAlternativesRelationData!= null)&&(!this.powerSequenceAlternativesRelationData.isEmpty()))));
                    copy.powerSequenceAlternativesRelationData = null;
                    if (copyPowerSequenceAlternativesRelationData!= null) {
                        List<PowerSequenceAlternativesRelationDataType> uniquePowerSequenceAlternativesRelationDatal = copy.getPowerSequenceAlternativesRelationData();
                        uniquePowerSequenceAlternativesRelationDatal.addAll(copyPowerSequenceAlternativesRelationData);
                    }
                } else {
                    if (powerSequenceAlternativesRelationDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.powerSequenceAlternativesRelationData = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new PowerSequenceAlternativesRelationListDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final PowerSequenceAlternativesRelationListDataType that = ((PowerSequenceAlternativesRelationListDataType) object);
        {
            List<PowerSequenceAlternativesRelationDataType> leftPowerSequenceAlternativesRelationData;
            leftPowerSequenceAlternativesRelationData = (((this.powerSequenceAlternativesRelationData!= null)&&(!this.powerSequenceAlternativesRelationData.isEmpty()))?this.getPowerSequenceAlternativesRelationData():null);
            List<PowerSequenceAlternativesRelationDataType> rightPowerSequenceAlternativesRelationData;
            rightPowerSequenceAlternativesRelationData = (((that.powerSequenceAlternativesRelationData!= null)&&(!that.powerSequenceAlternativesRelationData.isEmpty()))?that.getPowerSequenceAlternativesRelationData():null);
            if ((this.powerSequenceAlternativesRelationData!= null)&&(!this.powerSequenceAlternativesRelationData.isEmpty())) {
                if ((that.powerSequenceAlternativesRelationData!= null)&&(!that.powerSequenceAlternativesRelationData.isEmpty())) {
                    if (!leftPowerSequenceAlternativesRelationData.equals(rightPowerSequenceAlternativesRelationData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.powerSequenceAlternativesRelationData!= null)&&(!that.powerSequenceAlternativesRelationData.isEmpty())) {
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
            List<PowerSequenceAlternativesRelationDataType> thePowerSequenceAlternativesRelationData;
            thePowerSequenceAlternativesRelationData = (((this.powerSequenceAlternativesRelationData!= null)&&(!this.powerSequenceAlternativesRelationData.isEmpty()))?this.getPowerSequenceAlternativesRelationData():null);
            if ((this.powerSequenceAlternativesRelationData!= null)&&(!this.powerSequenceAlternativesRelationData.isEmpty())) {
                currentHashCode += thePowerSequenceAlternativesRelationData.hashCode();
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
            List<PowerSequenceAlternativesRelationDataType> thePowerSequenceAlternativesRelationData;
            thePowerSequenceAlternativesRelationData = (((this.powerSequenceAlternativesRelationData!= null)&&(!this.powerSequenceAlternativesRelationData.isEmpty()))?this.getPowerSequenceAlternativesRelationData():null);
            strategy.appendField(locator, this, "powerSequenceAlternativesRelationData", buffer, thePowerSequenceAlternativesRelationData, ((this.powerSequenceAlternativesRelationData!= null)&&(!this.powerSequenceAlternativesRelationData.isEmpty())));
        }
        return buffer;
    }

}
