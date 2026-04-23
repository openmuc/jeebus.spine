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
 * <p>Java class for PowerSequenceSchedulePreferenceDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PowerSequenceSchedulePreferenceDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sequenceId" type="{http://docs.eebus.org/spine/xsd/v1}PowerSequenceIdType" minOccurs="0"/&gt;
 *         &lt;element name="greenest" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="cheapest" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PowerSequenceSchedulePreferenceDataType", propOrder = {
    "sequenceId",
    "greenest",
    "cheapest"
})
@XmlSeeAlso({
    org.openmuc.jeebus.spine.xsd.v1.SmartEnergyManagementPsPowerSequenceType.SchedulePreference.class
})
public class PowerSequenceSchedulePreferenceDataType implements Cloneable, CopyTo, ToString
{

    @XmlSchemaType(name = "unsignedInt")
    protected Long sequenceId;
    protected Boolean greenest;
    protected Boolean cheapest;

    /**
     * Default no-arg constructor
     * 
     */
    public PowerSequenceSchedulePreferenceDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public PowerSequenceSchedulePreferenceDataType(final Long sequenceId, final Boolean greenest, final Boolean cheapest) {
        this.sequenceId = sequenceId;
        this.greenest = greenest;
        this.cheapest = cheapest;
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
     * Gets the value of the greenest property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getGreenest() {
        return greenest;
    }

    /**
     * Sets the value of the greenest property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGreenest(Boolean value) {
        this.greenest = value;
    }

    /**
     * Gets the value of the cheapest property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getCheapest() {
        return cheapest;
    }

    /**
     * Sets the value of the cheapest property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCheapest(Boolean value) {
        this.cheapest = value;
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
    public PowerSequenceSchedulePreferenceDataType withSequenceId(Long value) {
        setSequenceId(value);
        return this;
    }

    /**
     * Sets the value of the greenest property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     * @return
     *     The class instance
     */
    public PowerSequenceSchedulePreferenceDataType withGreenest(Boolean value) {
        setGreenest(value);
        return this;
    }

    /**
     * Sets the value of the cheapest property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     * @return
     *     The class instance
     */
    public PowerSequenceSchedulePreferenceDataType withCheapest(Boolean value) {
        setCheapest(value);
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
        if (draftCopy instanceof PowerSequenceSchedulePreferenceDataType) {
            final PowerSequenceSchedulePreferenceDataType copy = ((PowerSequenceSchedulePreferenceDataType) draftCopy);
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
                Boolean greenestShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.greenest!= null));
                if (greenestShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceGreenest;
                    sourceGreenest = this.getGreenest();
                    Boolean copyGreenest = ((Boolean) strategy.copy(LocatorUtils.property(locator, "greenest", sourceGreenest), sourceGreenest, (this.greenest!= null)));
                    copy.setGreenest(copyGreenest);
                } else {
                    if (greenestShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.greenest = null;
                    }
                }
            }
            {
                Boolean cheapestShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.cheapest!= null));
                if (cheapestShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceCheapest;
                    sourceCheapest = this.getCheapest();
                    Boolean copyCheapest = ((Boolean) strategy.copy(LocatorUtils.property(locator, "cheapest", sourceCheapest), sourceCheapest, (this.cheapest!= null)));
                    copy.setCheapest(copyCheapest);
                } else {
                    if (cheapestShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.cheapest = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new PowerSequenceSchedulePreferenceDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final PowerSequenceSchedulePreferenceDataType that = ((PowerSequenceSchedulePreferenceDataType) object);
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
            Boolean leftGreenest;
            leftGreenest = this.getGreenest();
            Boolean rightGreenest;
            rightGreenest = that.getGreenest();
            if (this.greenest!= null) {
                if (that.greenest!= null) {
                    if (!leftGreenest.equals(rightGreenest)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.greenest!= null) {
                    return false;
                }
            }
        }
        {
            Boolean leftCheapest;
            leftCheapest = this.getCheapest();
            Boolean rightCheapest;
            rightCheapest = that.getCheapest();
            if (this.cheapest!= null) {
                if (that.cheapest!= null) {
                    if (!leftCheapest.equals(rightCheapest)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.cheapest!= null) {
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
            Boolean theGreenest;
            theGreenest = this.getGreenest();
            if (this.greenest!= null) {
                currentHashCode += theGreenest.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            Boolean theCheapest;
            theCheapest = this.getCheapest();
            if (this.cheapest!= null) {
                currentHashCode += theCheapest.hashCode();
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
            Boolean theGreenest;
            theGreenest = this.getGreenest();
            strategy.appendField(locator, this, "greenest", buffer, theGreenest, (this.greenest!= null));
        }
        {
            Boolean theCheapest;
            theCheapest = this.getCheapest();
            strategy.appendField(locator, this, "cheapest", buffer, theCheapest, (this.cheapest!= null));
        }
        return buffer;
    }

}
