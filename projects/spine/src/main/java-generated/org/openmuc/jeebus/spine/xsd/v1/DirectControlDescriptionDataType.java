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
 * <p>Java class for DirectControlDescriptionDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DirectControlDescriptionDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="positiveEnergyDirection" type="{http://docs.eebus.org/spine/xsd/v1}EnergyDirectionType" minOccurs="0"/&gt;
 *         &lt;element name="powerUnit" type="{http://docs.eebus.org/spine/xsd/v1}UnitOfMeasurementType" minOccurs="0"/&gt;
 *         &lt;element name="energyUnit" type="{http://docs.eebus.org/spine/xsd/v1}UnitOfMeasurementType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DirectControlDescriptionDataType", propOrder = {
    "positiveEnergyDirection",
    "powerUnit",
    "energyUnit"
})
public class DirectControlDescriptionDataType implements Cloneable, CopyTo, ToString
{

    protected String positiveEnergyDirection;
    protected String powerUnit;
    protected String energyUnit;

    /**
     * Default no-arg constructor
     * 
     */
    public DirectControlDescriptionDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public DirectControlDescriptionDataType(final String positiveEnergyDirection, final String powerUnit, final String energyUnit) {
        this.positiveEnergyDirection = positiveEnergyDirection;
        this.powerUnit = powerUnit;
        this.energyUnit = energyUnit;
    }

    /**
     * Gets the value of the positiveEnergyDirection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPositiveEnergyDirection() {
        return positiveEnergyDirection;
    }

    /**
     * Sets the value of the positiveEnergyDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPositiveEnergyDirection(String value) {
        this.positiveEnergyDirection = value;
    }

    /**
     * Gets the value of the powerUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPowerUnit() {
        return powerUnit;
    }

    /**
     * Sets the value of the powerUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPowerUnit(String value) {
        this.powerUnit = value;
    }

    /**
     * Gets the value of the energyUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnergyUnit() {
        return energyUnit;
    }

    /**
     * Sets the value of the energyUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnergyUnit(String value) {
        this.energyUnit = value;
    }

    /**
     * Sets the value of the positiveEnergyDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public DirectControlDescriptionDataType withPositiveEnergyDirection(String value) {
        setPositiveEnergyDirection(value);
        return this;
    }

    /**
     * Sets the value of the powerUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public DirectControlDescriptionDataType withPowerUnit(String value) {
        setPowerUnit(value);
        return this;
    }

    /**
     * Sets the value of the energyUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public DirectControlDescriptionDataType withEnergyUnit(String value) {
        setEnergyUnit(value);
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
        if (draftCopy instanceof DirectControlDescriptionDataType) {
            final DirectControlDescriptionDataType copy = ((DirectControlDescriptionDataType) draftCopy);
            {
                Boolean positiveEnergyDirectionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.positiveEnergyDirection!= null));
                if (positiveEnergyDirectionShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourcePositiveEnergyDirection;
                    sourcePositiveEnergyDirection = this.getPositiveEnergyDirection();
                    String copyPositiveEnergyDirection = ((String) strategy.copy(LocatorUtils.property(locator, "positiveEnergyDirection", sourcePositiveEnergyDirection), sourcePositiveEnergyDirection, (this.positiveEnergyDirection!= null)));
                    copy.setPositiveEnergyDirection(copyPositiveEnergyDirection);
                } else {
                    if (positiveEnergyDirectionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.positiveEnergyDirection = null;
                    }
                }
            }
            {
                Boolean powerUnitShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.powerUnit!= null));
                if (powerUnitShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourcePowerUnit;
                    sourcePowerUnit = this.getPowerUnit();
                    String copyPowerUnit = ((String) strategy.copy(LocatorUtils.property(locator, "powerUnit", sourcePowerUnit), sourcePowerUnit, (this.powerUnit!= null)));
                    copy.setPowerUnit(copyPowerUnit);
                } else {
                    if (powerUnitShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.powerUnit = null;
                    }
                }
            }
            {
                Boolean energyUnitShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.energyUnit!= null));
                if (energyUnitShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceEnergyUnit;
                    sourceEnergyUnit = this.getEnergyUnit();
                    String copyEnergyUnit = ((String) strategy.copy(LocatorUtils.property(locator, "energyUnit", sourceEnergyUnit), sourceEnergyUnit, (this.energyUnit!= null)));
                    copy.setEnergyUnit(copyEnergyUnit);
                } else {
                    if (energyUnitShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.energyUnit = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new DirectControlDescriptionDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DirectControlDescriptionDataType that = ((DirectControlDescriptionDataType) object);
        {
            String leftPositiveEnergyDirection;
            leftPositiveEnergyDirection = this.getPositiveEnergyDirection();
            String rightPositiveEnergyDirection;
            rightPositiveEnergyDirection = that.getPositiveEnergyDirection();
            if (this.positiveEnergyDirection!= null) {
                if (that.positiveEnergyDirection!= null) {
                    if (!leftPositiveEnergyDirection.equals(rightPositiveEnergyDirection)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.positiveEnergyDirection!= null) {
                    return false;
                }
            }
        }
        {
            String leftPowerUnit;
            leftPowerUnit = this.getPowerUnit();
            String rightPowerUnit;
            rightPowerUnit = that.getPowerUnit();
            if (this.powerUnit!= null) {
                if (that.powerUnit!= null) {
                    if (!leftPowerUnit.equals(rightPowerUnit)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.powerUnit!= null) {
                    return false;
                }
            }
        }
        {
            String leftEnergyUnit;
            leftEnergyUnit = this.getEnergyUnit();
            String rightEnergyUnit;
            rightEnergyUnit = that.getEnergyUnit();
            if (this.energyUnit!= null) {
                if (that.energyUnit!= null) {
                    if (!leftEnergyUnit.equals(rightEnergyUnit)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.energyUnit!= null) {
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
            String thePositiveEnergyDirection;
            thePositiveEnergyDirection = this.getPositiveEnergyDirection();
            if (this.positiveEnergyDirection!= null) {
                currentHashCode += thePositiveEnergyDirection.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String thePowerUnit;
            thePowerUnit = this.getPowerUnit();
            if (this.powerUnit!= null) {
                currentHashCode += thePowerUnit.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String theEnergyUnit;
            theEnergyUnit = this.getEnergyUnit();
            if (this.energyUnit!= null) {
                currentHashCode += theEnergyUnit.hashCode();
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
            String thePositiveEnergyDirection;
            thePositiveEnergyDirection = this.getPositiveEnergyDirection();
            strategy.appendField(locator, this, "positiveEnergyDirection", buffer, thePositiveEnergyDirection, (this.positiveEnergyDirection!= null));
        }
        {
            String thePowerUnit;
            thePowerUnit = this.getPowerUnit();
            strategy.appendField(locator, this, "powerUnit", buffer, thePowerUnit, (this.powerUnit!= null));
        }
        {
            String theEnergyUnit;
            theEnergyUnit = this.getEnergyUnit();
            strategy.appendField(locator, this, "energyUnit", buffer, theEnergyUnit, (this.energyUnit!= null));
        }
        return buffer;
    }

}
