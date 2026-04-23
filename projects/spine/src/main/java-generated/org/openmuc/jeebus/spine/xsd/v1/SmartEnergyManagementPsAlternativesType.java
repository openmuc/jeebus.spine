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
 * <p>Java class for SmartEnergyManagementPsAlternativesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SmartEnergyManagementPsAlternativesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="relation" type="{http://docs.eebus.org/spine/xsd/v1}SmartEnergyManagementPsAlternativesRelationType" minOccurs="0"/&gt;
 *         &lt;element name="powerSequence" type="{http://docs.eebus.org/spine/xsd/v1}SmartEnergyManagementPsPowerSequenceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SmartEnergyManagementPsAlternativesType", propOrder = {
    "relation",
    "powerSequence"
})
public class SmartEnergyManagementPsAlternativesType implements Cloneable, CopyTo, ToString
{

    protected SmartEnergyManagementPsAlternativesRelationType relation;
    protected List<SmartEnergyManagementPsPowerSequenceType> powerSequence;

    /**
     * Default no-arg constructor
     * 
     */
    public SmartEnergyManagementPsAlternativesType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public SmartEnergyManagementPsAlternativesType(final SmartEnergyManagementPsAlternativesRelationType relation, final List<SmartEnergyManagementPsPowerSequenceType> powerSequence) {
        this.relation = relation;
        this.powerSequence = powerSequence;
    }

    /**
     * Gets the value of the relation property.
     * 
     * @return
     *     possible object is
     *     {@link SmartEnergyManagementPsAlternativesRelationType }
     *     
     */
    public SmartEnergyManagementPsAlternativesRelationType getRelation() {
        return relation;
    }

    /**
     * Sets the value of the relation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmartEnergyManagementPsAlternativesRelationType }
     *     
     */
    public void setRelation(SmartEnergyManagementPsAlternativesRelationType value) {
        this.relation = value;
    }

    /**
     * Gets the value of the powerSequence property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the powerSequence property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPowerSequence().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SmartEnergyManagementPsPowerSequenceType }
     * 
     * 
     */
    public List<SmartEnergyManagementPsPowerSequenceType> getPowerSequence() {
        if (powerSequence == null) {
            powerSequence = new ArrayList<SmartEnergyManagementPsPowerSequenceType>();
        }
        return this.powerSequence;
    }

    /**
     * Sets the value of the relation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmartEnergyManagementPsAlternativesRelationType }
     * @return
     *     The class instance
     */
    public SmartEnergyManagementPsAlternativesType withRelation(SmartEnergyManagementPsAlternativesRelationType value) {
        setRelation(value);
        return this;
    }

    /**
     * Adds objects to the list of PowerSequence using add method
     * 
     * @param values
     *     objects to add to the list PowerSequence
     * @return
     *     The class instance
     */
    public SmartEnergyManagementPsAlternativesType withPowerSequence(SmartEnergyManagementPsPowerSequenceType... values) {
        if (values!= null) {
            for (SmartEnergyManagementPsPowerSequenceType value: values) {
                getPowerSequence().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of PowerSequence using addAll method
     * 
     * @param values
     *     objects to add to the list PowerSequence
     * @return
     *     The class instance
     */
    public SmartEnergyManagementPsAlternativesType withPowerSequence(Collection<SmartEnergyManagementPsPowerSequenceType> values) {
        if (values!= null) {
            getPowerSequence().addAll(values);
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
        if (draftCopy instanceof SmartEnergyManagementPsAlternativesType) {
            final SmartEnergyManagementPsAlternativesType copy = ((SmartEnergyManagementPsAlternativesType) draftCopy);
            {
                Boolean relationShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.relation!= null));
                if (relationShouldBeCopiedAndSet == Boolean.TRUE) {
                    SmartEnergyManagementPsAlternativesRelationType sourceRelation;
                    sourceRelation = this.getRelation();
                    SmartEnergyManagementPsAlternativesRelationType copyRelation = ((SmartEnergyManagementPsAlternativesRelationType) strategy.copy(LocatorUtils.property(locator, "relation", sourceRelation), sourceRelation, (this.relation!= null)));
                    copy.setRelation(copyRelation);
                } else {
                    if (relationShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.relation = null;
                    }
                }
            }
            {
                Boolean powerSequenceShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.powerSequence!= null)&&(!this.powerSequence.isEmpty())));
                if (powerSequenceShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<SmartEnergyManagementPsPowerSequenceType> sourcePowerSequence;
                    sourcePowerSequence = (((this.powerSequence!= null)&&(!this.powerSequence.isEmpty()))?this.getPowerSequence():null);
                    @SuppressWarnings("unchecked")
                    List<SmartEnergyManagementPsPowerSequenceType> copyPowerSequence = ((List<SmartEnergyManagementPsPowerSequenceType> ) strategy.copy(LocatorUtils.property(locator, "powerSequence", sourcePowerSequence), sourcePowerSequence, ((this.powerSequence!= null)&&(!this.powerSequence.isEmpty()))));
                    copy.powerSequence = null;
                    if (copyPowerSequence!= null) {
                        List<SmartEnergyManagementPsPowerSequenceType> uniquePowerSequencel = copy.getPowerSequence();
                        uniquePowerSequencel.addAll(copyPowerSequence);
                    }
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
        return new SmartEnergyManagementPsAlternativesType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final SmartEnergyManagementPsAlternativesType that = ((SmartEnergyManagementPsAlternativesType) object);
        {
            SmartEnergyManagementPsAlternativesRelationType leftRelation;
            leftRelation = this.getRelation();
            SmartEnergyManagementPsAlternativesRelationType rightRelation;
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
            List<SmartEnergyManagementPsPowerSequenceType> leftPowerSequence;
            leftPowerSequence = (((this.powerSequence!= null)&&(!this.powerSequence.isEmpty()))?this.getPowerSequence():null);
            List<SmartEnergyManagementPsPowerSequenceType> rightPowerSequence;
            rightPowerSequence = (((that.powerSequence!= null)&&(!that.powerSequence.isEmpty()))?that.getPowerSequence():null);
            if ((this.powerSequence!= null)&&(!this.powerSequence.isEmpty())) {
                if ((that.powerSequence!= null)&&(!that.powerSequence.isEmpty())) {
                    if (!leftPowerSequence.equals(rightPowerSequence)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.powerSequence!= null)&&(!that.powerSequence.isEmpty())) {
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
            SmartEnergyManagementPsAlternativesRelationType theRelation;
            theRelation = this.getRelation();
            if (this.relation!= null) {
                currentHashCode += theRelation.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            List<SmartEnergyManagementPsPowerSequenceType> thePowerSequence;
            thePowerSequence = (((this.powerSequence!= null)&&(!this.powerSequence.isEmpty()))?this.getPowerSequence():null);
            if ((this.powerSequence!= null)&&(!this.powerSequence.isEmpty())) {
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
            SmartEnergyManagementPsAlternativesRelationType theRelation;
            theRelation = this.getRelation();
            strategy.appendField(locator, this, "relation", buffer, theRelation, (this.relation!= null));
        }
        {
            List<SmartEnergyManagementPsPowerSequenceType> thePowerSequence;
            thePowerSequence = (((this.powerSequence!= null)&&(!this.powerSequence.isEmpty()))?this.getPowerSequence():null);
            strategy.appendField(locator, this, "powerSequence", buffer, thePowerSequence, ((this.powerSequence!= null)&&(!this.powerSequence.isEmpty())));
        }
        return buffer;
    }

}
