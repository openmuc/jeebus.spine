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

import javax.xml.datatype.Duration;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
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
 * <p>Java class for OperatingConstraintsDurationDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OperatingConstraintsDurationDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sequenceId" type="{http://docs.eebus.org/spine/xsd/v1}PowerSequenceIdType" minOccurs="0"/&gt;
 *         &lt;element name="activeDurationMin" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *         &lt;element name="activeDurationMax" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *         &lt;element name="pauseDurationMin" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *         &lt;element name="pauseDurationMax" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *         &lt;element name="activeDurationSumMin" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *         &lt;element name="activeDurationSumMax" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperatingConstraintsDurationDataType", propOrder = {
    "sequenceId",
    "activeDurationMin",
    "activeDurationMax",
    "pauseDurationMin",
    "pauseDurationMax",
    "activeDurationSumMin",
    "activeDurationSumMax"
})
@XmlSeeAlso({
    org.openmuc.jeebus.spine.xsd.v1.SmartEnergyManagementPsPowerSequenceType.OperatingConstraintsDuration.class
})
public class OperatingConstraintsDurationDataType implements Cloneable, CopyTo, ToString
{

    @XmlSchemaType(name = "unsignedInt")
    protected Long sequenceId;
    protected Duration activeDurationMin;
    protected Duration activeDurationMax;
    protected Duration pauseDurationMin;
    protected Duration pauseDurationMax;
    protected Duration activeDurationSumMin;
    protected Duration activeDurationSumMax;

    /**
     * Default no-arg constructor
     * 
     */
    public OperatingConstraintsDurationDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public OperatingConstraintsDurationDataType(final Long sequenceId, final Duration activeDurationMin, final Duration activeDurationMax, final Duration pauseDurationMin, final Duration pauseDurationMax, final Duration activeDurationSumMin, final Duration activeDurationSumMax) {
        this.sequenceId = sequenceId;
        this.activeDurationMin = activeDurationMin;
        this.activeDurationMax = activeDurationMax;
        this.pauseDurationMin = pauseDurationMin;
        this.pauseDurationMax = pauseDurationMax;
        this.activeDurationSumMin = activeDurationSumMin;
        this.activeDurationSumMax = activeDurationSumMax;
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
     * Gets the value of the activeDurationMin property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getActiveDurationMin() {
        return activeDurationMin;
    }

    /**
     * Sets the value of the activeDurationMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setActiveDurationMin(Duration value) {
        this.activeDurationMin = value;
    }

    /**
     * Gets the value of the activeDurationMax property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getActiveDurationMax() {
        return activeDurationMax;
    }

    /**
     * Sets the value of the activeDurationMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setActiveDurationMax(Duration value) {
        this.activeDurationMax = value;
    }

    /**
     * Gets the value of the pauseDurationMin property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getPauseDurationMin() {
        return pauseDurationMin;
    }

    /**
     * Sets the value of the pauseDurationMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setPauseDurationMin(Duration value) {
        this.pauseDurationMin = value;
    }

    /**
     * Gets the value of the pauseDurationMax property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getPauseDurationMax() {
        return pauseDurationMax;
    }

    /**
     * Sets the value of the pauseDurationMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setPauseDurationMax(Duration value) {
        this.pauseDurationMax = value;
    }

    /**
     * Gets the value of the activeDurationSumMin property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getActiveDurationSumMin() {
        return activeDurationSumMin;
    }

    /**
     * Sets the value of the activeDurationSumMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setActiveDurationSumMin(Duration value) {
        this.activeDurationSumMin = value;
    }

    /**
     * Gets the value of the activeDurationSumMax property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getActiveDurationSumMax() {
        return activeDurationSumMax;
    }

    /**
     * Sets the value of the activeDurationSumMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setActiveDurationSumMax(Duration value) {
        this.activeDurationSumMax = value;
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
    public OperatingConstraintsDurationDataType withSequenceId(Long value) {
        setSequenceId(value);
        return this;
    }

    /**
     * Sets the value of the activeDurationMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     * @return
     *     The class instance
     */
    public OperatingConstraintsDurationDataType withActiveDurationMin(Duration value) {
        setActiveDurationMin(value);
        return this;
    }

    /**
     * Sets the value of the activeDurationMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     * @return
     *     The class instance
     */
    public OperatingConstraintsDurationDataType withActiveDurationMax(Duration value) {
        setActiveDurationMax(value);
        return this;
    }

    /**
     * Sets the value of the pauseDurationMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     * @return
     *     The class instance
     */
    public OperatingConstraintsDurationDataType withPauseDurationMin(Duration value) {
        setPauseDurationMin(value);
        return this;
    }

    /**
     * Sets the value of the pauseDurationMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     * @return
     *     The class instance
     */
    public OperatingConstraintsDurationDataType withPauseDurationMax(Duration value) {
        setPauseDurationMax(value);
        return this;
    }

    /**
     * Sets the value of the activeDurationSumMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     * @return
     *     The class instance
     */
    public OperatingConstraintsDurationDataType withActiveDurationSumMin(Duration value) {
        setActiveDurationSumMin(value);
        return this;
    }

    /**
     * Sets the value of the activeDurationSumMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     * @return
     *     The class instance
     */
    public OperatingConstraintsDurationDataType withActiveDurationSumMax(Duration value) {
        setActiveDurationSumMax(value);
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
        if (draftCopy instanceof OperatingConstraintsDurationDataType) {
            final OperatingConstraintsDurationDataType copy = ((OperatingConstraintsDurationDataType) draftCopy);
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
                Boolean activeDurationMinShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.activeDurationMin!= null));
                if (activeDurationMinShouldBeCopiedAndSet == Boolean.TRUE) {
                    Duration sourceActiveDurationMin;
                    sourceActiveDurationMin = this.getActiveDurationMin();
                    Duration copyActiveDurationMin = ((Duration) strategy.copy(LocatorUtils.property(locator, "activeDurationMin", sourceActiveDurationMin), sourceActiveDurationMin, (this.activeDurationMin!= null)));
                    copy.setActiveDurationMin(copyActiveDurationMin);
                } else {
                    if (activeDurationMinShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.activeDurationMin = null;
                    }
                }
            }
            {
                Boolean activeDurationMaxShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.activeDurationMax!= null));
                if (activeDurationMaxShouldBeCopiedAndSet == Boolean.TRUE) {
                    Duration sourceActiveDurationMax;
                    sourceActiveDurationMax = this.getActiveDurationMax();
                    Duration copyActiveDurationMax = ((Duration) strategy.copy(LocatorUtils.property(locator, "activeDurationMax", sourceActiveDurationMax), sourceActiveDurationMax, (this.activeDurationMax!= null)));
                    copy.setActiveDurationMax(copyActiveDurationMax);
                } else {
                    if (activeDurationMaxShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.activeDurationMax = null;
                    }
                }
            }
            {
                Boolean pauseDurationMinShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.pauseDurationMin!= null));
                if (pauseDurationMinShouldBeCopiedAndSet == Boolean.TRUE) {
                    Duration sourcePauseDurationMin;
                    sourcePauseDurationMin = this.getPauseDurationMin();
                    Duration copyPauseDurationMin = ((Duration) strategy.copy(LocatorUtils.property(locator, "pauseDurationMin", sourcePauseDurationMin), sourcePauseDurationMin, (this.pauseDurationMin!= null)));
                    copy.setPauseDurationMin(copyPauseDurationMin);
                } else {
                    if (pauseDurationMinShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.pauseDurationMin = null;
                    }
                }
            }
            {
                Boolean pauseDurationMaxShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.pauseDurationMax!= null));
                if (pauseDurationMaxShouldBeCopiedAndSet == Boolean.TRUE) {
                    Duration sourcePauseDurationMax;
                    sourcePauseDurationMax = this.getPauseDurationMax();
                    Duration copyPauseDurationMax = ((Duration) strategy.copy(LocatorUtils.property(locator, "pauseDurationMax", sourcePauseDurationMax), sourcePauseDurationMax, (this.pauseDurationMax!= null)));
                    copy.setPauseDurationMax(copyPauseDurationMax);
                } else {
                    if (pauseDurationMaxShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.pauseDurationMax = null;
                    }
                }
            }
            {
                Boolean activeDurationSumMinShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.activeDurationSumMin!= null));
                if (activeDurationSumMinShouldBeCopiedAndSet == Boolean.TRUE) {
                    Duration sourceActiveDurationSumMin;
                    sourceActiveDurationSumMin = this.getActiveDurationSumMin();
                    Duration copyActiveDurationSumMin = ((Duration) strategy.copy(LocatorUtils.property(locator, "activeDurationSumMin", sourceActiveDurationSumMin), sourceActiveDurationSumMin, (this.activeDurationSumMin!= null)));
                    copy.setActiveDurationSumMin(copyActiveDurationSumMin);
                } else {
                    if (activeDurationSumMinShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.activeDurationSumMin = null;
                    }
                }
            }
            {
                Boolean activeDurationSumMaxShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.activeDurationSumMax!= null));
                if (activeDurationSumMaxShouldBeCopiedAndSet == Boolean.TRUE) {
                    Duration sourceActiveDurationSumMax;
                    sourceActiveDurationSumMax = this.getActiveDurationSumMax();
                    Duration copyActiveDurationSumMax = ((Duration) strategy.copy(LocatorUtils.property(locator, "activeDurationSumMax", sourceActiveDurationSumMax), sourceActiveDurationSumMax, (this.activeDurationSumMax!= null)));
                    copy.setActiveDurationSumMax(copyActiveDurationSumMax);
                } else {
                    if (activeDurationSumMaxShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.activeDurationSumMax = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new OperatingConstraintsDurationDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final OperatingConstraintsDurationDataType that = ((OperatingConstraintsDurationDataType) object);
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
            Duration leftActiveDurationMin;
            leftActiveDurationMin = this.getActiveDurationMin();
            Duration rightActiveDurationMin;
            rightActiveDurationMin = that.getActiveDurationMin();
            if (this.activeDurationMin!= null) {
                if (that.activeDurationMin!= null) {
                    if (!leftActiveDurationMin.equals(rightActiveDurationMin)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.activeDurationMin!= null) {
                    return false;
                }
            }
        }
        {
            Duration leftActiveDurationMax;
            leftActiveDurationMax = this.getActiveDurationMax();
            Duration rightActiveDurationMax;
            rightActiveDurationMax = that.getActiveDurationMax();
            if (this.activeDurationMax!= null) {
                if (that.activeDurationMax!= null) {
                    if (!leftActiveDurationMax.equals(rightActiveDurationMax)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.activeDurationMax!= null) {
                    return false;
                }
            }
        }
        {
            Duration leftPauseDurationMin;
            leftPauseDurationMin = this.getPauseDurationMin();
            Duration rightPauseDurationMin;
            rightPauseDurationMin = that.getPauseDurationMin();
            if (this.pauseDurationMin!= null) {
                if (that.pauseDurationMin!= null) {
                    if (!leftPauseDurationMin.equals(rightPauseDurationMin)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.pauseDurationMin!= null) {
                    return false;
                }
            }
        }
        {
            Duration leftPauseDurationMax;
            leftPauseDurationMax = this.getPauseDurationMax();
            Duration rightPauseDurationMax;
            rightPauseDurationMax = that.getPauseDurationMax();
            if (this.pauseDurationMax!= null) {
                if (that.pauseDurationMax!= null) {
                    if (!leftPauseDurationMax.equals(rightPauseDurationMax)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.pauseDurationMax!= null) {
                    return false;
                }
            }
        }
        {
            Duration leftActiveDurationSumMin;
            leftActiveDurationSumMin = this.getActiveDurationSumMin();
            Duration rightActiveDurationSumMin;
            rightActiveDurationSumMin = that.getActiveDurationSumMin();
            if (this.activeDurationSumMin!= null) {
                if (that.activeDurationSumMin!= null) {
                    if (!leftActiveDurationSumMin.equals(rightActiveDurationSumMin)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.activeDurationSumMin!= null) {
                    return false;
                }
            }
        }
        {
            Duration leftActiveDurationSumMax;
            leftActiveDurationSumMax = this.getActiveDurationSumMax();
            Duration rightActiveDurationSumMax;
            rightActiveDurationSumMax = that.getActiveDurationSumMax();
            if (this.activeDurationSumMax!= null) {
                if (that.activeDurationSumMax!= null) {
                    if (!leftActiveDurationSumMax.equals(rightActiveDurationSumMax)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.activeDurationSumMax!= null) {
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
            Duration theActiveDurationMin;
            theActiveDurationMin = this.getActiveDurationMin();
            if (this.activeDurationMin!= null) {
                currentHashCode += theActiveDurationMin.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            Duration theActiveDurationMax;
            theActiveDurationMax = this.getActiveDurationMax();
            if (this.activeDurationMax!= null) {
                currentHashCode += theActiveDurationMax.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            Duration thePauseDurationMin;
            thePauseDurationMin = this.getPauseDurationMin();
            if (this.pauseDurationMin!= null) {
                currentHashCode += thePauseDurationMin.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            Duration thePauseDurationMax;
            thePauseDurationMax = this.getPauseDurationMax();
            if (this.pauseDurationMax!= null) {
                currentHashCode += thePauseDurationMax.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            Duration theActiveDurationSumMin;
            theActiveDurationSumMin = this.getActiveDurationSumMin();
            if (this.activeDurationSumMin!= null) {
                currentHashCode += theActiveDurationSumMin.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            Duration theActiveDurationSumMax;
            theActiveDurationSumMax = this.getActiveDurationSumMax();
            if (this.activeDurationSumMax!= null) {
                currentHashCode += theActiveDurationSumMax.hashCode();
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
            Duration theActiveDurationMin;
            theActiveDurationMin = this.getActiveDurationMin();
            strategy.appendField(locator, this, "activeDurationMin", buffer, theActiveDurationMin, (this.activeDurationMin!= null));
        }
        {
            Duration theActiveDurationMax;
            theActiveDurationMax = this.getActiveDurationMax();
            strategy.appendField(locator, this, "activeDurationMax", buffer, theActiveDurationMax, (this.activeDurationMax!= null));
        }
        {
            Duration thePauseDurationMin;
            thePauseDurationMin = this.getPauseDurationMin();
            strategy.appendField(locator, this, "pauseDurationMin", buffer, thePauseDurationMin, (this.pauseDurationMin!= null));
        }
        {
            Duration thePauseDurationMax;
            thePauseDurationMax = this.getPauseDurationMax();
            strategy.appendField(locator, this, "pauseDurationMax", buffer, thePauseDurationMax, (this.pauseDurationMax!= null));
        }
        {
            Duration theActiveDurationSumMin;
            theActiveDurationSumMin = this.getActiveDurationSumMin();
            strategy.appendField(locator, this, "activeDurationSumMin", buffer, theActiveDurationSumMin, (this.activeDurationSumMin!= null));
        }
        {
            Duration theActiveDurationSumMax;
            theActiveDurationSumMax = this.getActiveDurationSumMax();
            strategy.appendField(locator, this, "activeDurationSumMax", buffer, theActiveDurationSumMax, (this.activeDurationSumMax!= null));
        }
        return buffer;
    }

}
