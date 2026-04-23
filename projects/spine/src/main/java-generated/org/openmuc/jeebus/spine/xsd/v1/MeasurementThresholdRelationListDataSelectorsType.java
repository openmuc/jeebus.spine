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
 * <p>Java class for MeasurementThresholdRelationListDataSelectorsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MeasurementThresholdRelationListDataSelectorsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="measurementId" type="{http://docs.eebus.org/spine/xsd/v1}MeasurementIdType" minOccurs="0"/&gt;
 *         &lt;element name="thresholdId" type="{http://docs.eebus.org/spine/xsd/v1}ThresholdIdType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeasurementThresholdRelationListDataSelectorsType", propOrder = {
    "measurementId",
    "thresholdId"
})
public class MeasurementThresholdRelationListDataSelectorsType implements Cloneable, CopyTo, ToString
{

    @XmlSchemaType(name = "unsignedInt")
    protected Long measurementId;
    @XmlSchemaType(name = "unsignedInt")
    protected Long thresholdId;

    /**
     * Default no-arg constructor
     * 
     */
    public MeasurementThresholdRelationListDataSelectorsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public MeasurementThresholdRelationListDataSelectorsType(final Long measurementId, final Long thresholdId) {
        this.measurementId = measurementId;
        this.thresholdId = thresholdId;
    }

    /**
     * Gets the value of the measurementId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMeasurementId() {
        return measurementId;
    }

    /**
     * Sets the value of the measurementId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMeasurementId(Long value) {
        this.measurementId = value;
    }

    /**
     * Gets the value of the thresholdId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getThresholdId() {
        return thresholdId;
    }

    /**
     * Sets the value of the thresholdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setThresholdId(Long value) {
        this.thresholdId = value;
    }

    /**
     * Sets the value of the measurementId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     * @return
     *     The class instance
     */
    public MeasurementThresholdRelationListDataSelectorsType withMeasurementId(Long value) {
        setMeasurementId(value);
        return this;
    }

    /**
     * Sets the value of the thresholdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     * @return
     *     The class instance
     */
    public MeasurementThresholdRelationListDataSelectorsType withThresholdId(Long value) {
        setThresholdId(value);
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
        if (draftCopy instanceof MeasurementThresholdRelationListDataSelectorsType) {
            final MeasurementThresholdRelationListDataSelectorsType copy = ((MeasurementThresholdRelationListDataSelectorsType) draftCopy);
            {
                Boolean measurementIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.measurementId!= null));
                if (measurementIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceMeasurementId;
                    sourceMeasurementId = this.getMeasurementId();
                    Long copyMeasurementId = ((Long) strategy.copy(LocatorUtils.property(locator, "measurementId", sourceMeasurementId), sourceMeasurementId, (this.measurementId!= null)));
                    copy.setMeasurementId(copyMeasurementId);
                } else {
                    if (measurementIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.measurementId = null;
                    }
                }
            }
            {
                Boolean thresholdIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.thresholdId!= null));
                if (thresholdIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceThresholdId;
                    sourceThresholdId = this.getThresholdId();
                    Long copyThresholdId = ((Long) strategy.copy(LocatorUtils.property(locator, "thresholdId", sourceThresholdId), sourceThresholdId, (this.thresholdId!= null)));
                    copy.setThresholdId(copyThresholdId);
                } else {
                    if (thresholdIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.thresholdId = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new MeasurementThresholdRelationListDataSelectorsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final MeasurementThresholdRelationListDataSelectorsType that = ((MeasurementThresholdRelationListDataSelectorsType) object);
        {
            Long leftMeasurementId;
            leftMeasurementId = this.getMeasurementId();
            Long rightMeasurementId;
            rightMeasurementId = that.getMeasurementId();
            if (this.measurementId!= null) {
                if (that.measurementId!= null) {
                    if (!leftMeasurementId.equals(rightMeasurementId)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.measurementId!= null) {
                    return false;
                }
            }
        }
        {
            Long leftThresholdId;
            leftThresholdId = this.getThresholdId();
            Long rightThresholdId;
            rightThresholdId = that.getThresholdId();
            if (this.thresholdId!= null) {
                if (that.thresholdId!= null) {
                    if (!leftThresholdId.equals(rightThresholdId)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.thresholdId!= null) {
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
            Long theMeasurementId;
            theMeasurementId = this.getMeasurementId();
            if (this.measurementId!= null) {
                currentHashCode += theMeasurementId.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            Long theThresholdId;
            theThresholdId = this.getThresholdId();
            if (this.thresholdId!= null) {
                currentHashCode += theThresholdId.hashCode();
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
            Long theMeasurementId;
            theMeasurementId = this.getMeasurementId();
            strategy.appendField(locator, this, "measurementId", buffer, theMeasurementId, (this.measurementId!= null));
        }
        {
            Long theThresholdId;
            theThresholdId = this.getThresholdId();
            strategy.appendField(locator, this, "thresholdId", buffer, theThresholdId, (this.thresholdId!= null));
        }
        return buffer;
    }

}
