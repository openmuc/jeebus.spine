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
import jakarta.xml.bind.annotation.XmlSchemaType;
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
 * <p>Java class for OperatingConstraintsPowerLevelDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OperatingConstraintsPowerLevelDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sequenceId" type="{http://docs.eebus.org/spine/xsd/v1}PowerSequenceIdType" minOccurs="0"/&gt;
 *         &lt;element name="power" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperatingConstraintsPowerLevelDataType", propOrder = {
    "sequenceId",
    "power"
})
public class OperatingConstraintsPowerLevelDataType implements Cloneable, CopyTo, ToString
{

    @XmlSchemaType(name = "unsignedInt")
    protected Long sequenceId;
    protected List<ScaledNumberType> power;

    /**
     * Default no-arg constructor
     * 
     */
    public OperatingConstraintsPowerLevelDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public OperatingConstraintsPowerLevelDataType(final Long sequenceId, final List<ScaledNumberType> power) {
        this.sequenceId = sequenceId;
        this.power = power;
    }

    /**
     * Gets the value of the sequenceId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSequenceId() {
        return sequenceId;
    }

    /**
     * Sets the value of the sequenceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSequenceId(Long value) {
        this.sequenceId = value;
    }

    /**
     * Gets the value of the power property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the power property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPower().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ScaledNumberType }
     * 
     * 
     */
    public List<ScaledNumberType> getPower() {
        if (power == null) {
            power = new ArrayList<ScaledNumberType>();
        }
        return this.power;
    }

    /**
     * Sets the value of the sequenceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     * @return
     *     The class instance
     */
    public OperatingConstraintsPowerLevelDataType withSequenceId(Long value) {
        setSequenceId(value);
        return this;
    }

    /**
     * Adds objects to the list of Power using add method
     * 
     * @param values
     *     objects to add to the list Power
     * @return
     *     The class instance
     */
    public OperatingConstraintsPowerLevelDataType withPower(ScaledNumberType... values) {
        if (values!= null) {
            for (ScaledNumberType value: values) {
                getPower().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of Power using addAll method
     * 
     * @param values
     *     objects to add to the list Power
     * @return
     *     The class instance
     */
    public OperatingConstraintsPowerLevelDataType withPower(Collection<ScaledNumberType> values) {
        if (values!= null) {
            getPower().addAll(values);
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
        if (draftCopy instanceof OperatingConstraintsPowerLevelDataType) {
            final OperatingConstraintsPowerLevelDataType copy = ((OperatingConstraintsPowerLevelDataType) draftCopy);
            {
                Boolean sequenceIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.sequenceId!= null));
                if (sequenceIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceSequenceId;
                    sourceSequenceId = this.getSequenceId();
                    Long copySequenceId = ((Long) strategy.copy(LocatorUtils.property(locator, "sequenceId", sourceSequenceId), sourceSequenceId, (this.sequenceId!= null)));
                    copy.setSequenceId(copySequenceId);
                } else {
                    if (sequenceIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.sequenceId = null;
                    }
                }
            }
            {
                Boolean powerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.power!= null)&&(!this.power.isEmpty())));
                if (powerShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<ScaledNumberType> sourcePower;
                    sourcePower = (((this.power!= null)&&(!this.power.isEmpty()))?this.getPower():null);
                    @SuppressWarnings("unchecked")
                    List<ScaledNumberType> copyPower = ((List<ScaledNumberType> ) strategy.copy(LocatorUtils.property(locator, "power", sourcePower), sourcePower, ((this.power!= null)&&(!this.power.isEmpty()))));
                    copy.power = null;
                    if (copyPower!= null) {
                        List<ScaledNumberType> uniquePowerl = copy.getPower();
                        uniquePowerl.addAll(copyPower);
                    }
                } else {
                    if (powerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.power = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new OperatingConstraintsPowerLevelDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final OperatingConstraintsPowerLevelDataType that = ((OperatingConstraintsPowerLevelDataType) object);
        {
            Long leftSequenceId;
            leftSequenceId = this.getSequenceId();
            Long rightSequenceId;
            rightSequenceId = that.getSequenceId();
            if (this.sequenceId!= null) {
                if (that.sequenceId!= null) {
                    if (!leftSequenceId.equals(rightSequenceId)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.sequenceId!= null) {
                    return false;
                }
            }
        }
        {
            List<ScaledNumberType> leftPower;
            leftPower = (((this.power!= null)&&(!this.power.isEmpty()))?this.getPower():null);
            List<ScaledNumberType> rightPower;
            rightPower = (((that.power!= null)&&(!that.power.isEmpty()))?that.getPower():null);
            if ((this.power!= null)&&(!this.power.isEmpty())) {
                if ((that.power!= null)&&(!that.power.isEmpty())) {
                    if (!leftPower.equals(rightPower)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.power!= null)&&(!that.power.isEmpty())) {
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
            Long theSequenceId;
            theSequenceId = this.getSequenceId();
            if (this.sequenceId!= null) {
                currentHashCode += theSequenceId.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            List<ScaledNumberType> thePower;
            thePower = (((this.power!= null)&&(!this.power.isEmpty()))?this.getPower():null);
            if ((this.power!= null)&&(!this.power.isEmpty())) {
                currentHashCode += thePower.hashCode();
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
            Long theSequenceId;
            theSequenceId = this.getSequenceId();
            strategy.appendField(locator, this, "sequenceId", buffer, theSequenceId, (this.sequenceId!= null));
        }
        {
            List<ScaledNumberType> thePower;
            thePower = (((this.power!= null)&&(!this.power.isEmpty()))?this.getPower():null);
            strategy.appendField(locator, this, "power", buffer, thePower, ((this.power!= null)&&(!this.power.isEmpty())));
        }
        return buffer;
    }

}
