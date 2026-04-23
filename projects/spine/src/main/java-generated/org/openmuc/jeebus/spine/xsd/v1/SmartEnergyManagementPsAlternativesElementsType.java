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
 * <p>Java class for SmartEnergyManagementPsAlternativesElementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SmartEnergyManagementPsAlternativesElementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="relation" type="{http://docs.eebus.org/spine/xsd/v1}SmartEnergyManagementPsAlternativesRelationElementsType" minOccurs="0"/&gt;
 *         &lt;element name="powerSequence" type="{http://docs.eebus.org/spine/xsd/v1}SmartEnergyManagementPsPowerSequenceElementsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SmartEnergyManagementPsAlternativesElementsType", propOrder = {
    "relation",
    "powerSequence"
})
public class SmartEnergyManagementPsAlternativesElementsType implements Cloneable, CopyTo, ToString
{

    protected SmartEnergyManagementPsAlternativesRelationElementsType relation;
    protected SmartEnergyManagementPsPowerSequenceElementsType powerSequence;

    /**
     * Default no-arg constructor
     * 
     */
    public SmartEnergyManagementPsAlternativesElementsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public SmartEnergyManagementPsAlternativesElementsType(final SmartEnergyManagementPsAlternativesRelationElementsType relation, final SmartEnergyManagementPsPowerSequenceElementsType powerSequence) {
        this.relation = relation;
        this.powerSequence = powerSequence;
    }

    /**
     * Gets the value of the relation property.
     * 
     * @return
     *     possible object is
     *     {@link SmartEnergyManagementPsAlternativesRelationElementsType }
     *     
     */
    public SmartEnergyManagementPsAlternativesRelationElementsType getRelation() {
        return relation;
    }

    /**
     * Sets the value of the relation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmartEnergyManagementPsAlternativesRelationElementsType }
     *     
     */
    public void setRelation(SmartEnergyManagementPsAlternativesRelationElementsType value) {
        this.relation = value;
    }

    /**
     * Gets the value of the powerSequence property.
     * 
     * @return
     *     possible object is
     *     {@link SmartEnergyManagementPsPowerSequenceElementsType }
     *     
     */
    public SmartEnergyManagementPsPowerSequenceElementsType getPowerSequence() {
        return powerSequence;
    }

    /**
     * Sets the value of the powerSequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmartEnergyManagementPsPowerSequenceElementsType }
     *     
     */
    public void setPowerSequence(SmartEnergyManagementPsPowerSequenceElementsType value) {
        this.powerSequence = value;
    }

    /**
     * Sets the value of the relation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmartEnergyManagementPsAlternativesRelationElementsType }
     * @return
     *     The class instance
     */
    public SmartEnergyManagementPsAlternativesElementsType withRelation(SmartEnergyManagementPsAlternativesRelationElementsType value) {
        setRelation(value);
        return this;
    }

    /**
     * Sets the value of the powerSequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmartEnergyManagementPsPowerSequenceElementsType }
     * @return
     *     The class instance
     */
    public SmartEnergyManagementPsAlternativesElementsType withPowerSequence(SmartEnergyManagementPsPowerSequenceElementsType value) {
        setPowerSequence(value);
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
        if (draftCopy instanceof SmartEnergyManagementPsAlternativesElementsType) {
            final SmartEnergyManagementPsAlternativesElementsType copy = ((SmartEnergyManagementPsAlternativesElementsType) draftCopy);
            {
                Boolean relationShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.relation!= null));
                if (relationShouldBeCopiedAndSet == Boolean.TRUE) {
                    SmartEnergyManagementPsAlternativesRelationElementsType sourceRelation;
                    sourceRelation = this.getRelation();
                    SmartEnergyManagementPsAlternativesRelationElementsType copyRelation = ((SmartEnergyManagementPsAlternativesRelationElementsType) strategy.copy(LocatorUtils.property(locator, "relation", sourceRelation), sourceRelation, (this.relation!= null)));
                    copy.setRelation(copyRelation);
                } else {
                    if (relationShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.relation = null;
                    }
                }
            }
            {
                Boolean powerSequenceShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.powerSequence!= null));
                if (powerSequenceShouldBeCopiedAndSet == Boolean.TRUE) {
                    SmartEnergyManagementPsPowerSequenceElementsType sourcePowerSequence;
                    sourcePowerSequence = this.getPowerSequence();
                    SmartEnergyManagementPsPowerSequenceElementsType copyPowerSequence = ((SmartEnergyManagementPsPowerSequenceElementsType) strategy.copy(LocatorUtils.property(locator, "powerSequence", sourcePowerSequence), sourcePowerSequence, (this.powerSequence!= null)));
                    copy.setPowerSequence(copyPowerSequence);
                } else {
                    if (powerSequenceShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.powerSequence = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new SmartEnergyManagementPsAlternativesElementsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final SmartEnergyManagementPsAlternativesElementsType that = ((SmartEnergyManagementPsAlternativesElementsType) object);
        {
            SmartEnergyManagementPsAlternativesRelationElementsType leftRelation;
            leftRelation = this.getRelation();
            SmartEnergyManagementPsAlternativesRelationElementsType rightRelation;
            rightRelation = that.getRelation();
            if (this.relation!= null) {
                if (that.relation!= null) {
                    if (!leftRelation.equals(rightRelation)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.relation!= null) {
                    return false;
                }
            }
        }
        {
            SmartEnergyManagementPsPowerSequenceElementsType leftPowerSequence;
            leftPowerSequence = this.getPowerSequence();
            SmartEnergyManagementPsPowerSequenceElementsType rightPowerSequence;
            rightPowerSequence = that.getPowerSequence();
            if (this.powerSequence!= null) {
                if (that.powerSequence!= null) {
                    if (!leftPowerSequence.equals(rightPowerSequence)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.powerSequence!= null) {
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
            SmartEnergyManagementPsAlternativesRelationElementsType theRelation;
            theRelation = this.getRelation();
            if (this.relation!= null) {
                currentHashCode += theRelation.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            SmartEnergyManagementPsPowerSequenceElementsType thePowerSequence;
            thePowerSequence = this.getPowerSequence();
            if (this.powerSequence!= null) {
                currentHashCode += thePowerSequence.hashCode();
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
            SmartEnergyManagementPsAlternativesRelationElementsType theRelation;
            theRelation = this.getRelation();
            strategy.appendField(locator, this, "relation", buffer, theRelation, (this.relation!= null));
        }
        {
            SmartEnergyManagementPsPowerSequenceElementsType thePowerSequence;
            thePowerSequence = this.getPowerSequence();
            strategy.appendField(locator, this, "powerSequence", buffer, thePowerSequence, (this.powerSequence!= null));
        }
        return buffer;
    }

}
