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
import jakarta.xml.bind.annotation.XmlElement;
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
 * <p>Java class for MeasurementThresholdRelationDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MeasurementThresholdRelationDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="measurementId" type="{http://docs.eebus.org/spine/xsd/v1}MeasurementIdType" minOccurs="0"/&gt;
 *         &lt;element name="thresholdId" type="{http://docs.eebus.org/spine/xsd/v1}ThresholdIdType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeasurementThresholdRelationDataType", propOrder = {
    "measurementId",
    "thresholdId"
})
public class MeasurementThresholdRelationDataType implements Cloneable, CopyTo, ToString
{

    @XmlSchemaType(name = "unsignedInt")
    protected Long measurementId;
    @XmlElement(type = Long.class)
    @XmlSchemaType(name = "unsignedInt")
    protected List<Long> thresholdId;

    /**
     * Default no-arg constructor
     * 
     */
    public MeasurementThresholdRelationDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public MeasurementThresholdRelationDataType(final Long measurementId, final List<Long> thresholdId) {
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
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the thresholdId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getThresholdId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getThresholdId() {
        if (thresholdId == null) {
            thresholdId = new ArrayList<Long>();
        }
        return this.thresholdId;
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
    public MeasurementThresholdRelationDataType withMeasurementId(Long value) {
        setMeasurementId(value);
        return this;
    }

    /**
     * Adds objects to the list of ThresholdId using add method
     * 
     * @param values
     *     objects to add to the list ThresholdId
     * @return
     *     The class instance
     */
    public MeasurementThresholdRelationDataType withThresholdId(Long... values) {
        if (values!= null) {
            for (Long value: values) {
                getThresholdId().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of ThresholdId using addAll method
     * 
     * @param values
     *     objects to add to the list ThresholdId
     * @return
     *     The class instance
     */
    public MeasurementThresholdRelationDataType withThresholdId(Collection<Long> values) {
        if (values!= null) {
            getThresholdId().addAll(values);
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
        if (draftCopy instanceof MeasurementThresholdRelationDataType) {
            final MeasurementThresholdRelationDataType copy = ((MeasurementThresholdRelationDataType) draftCopy);
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
                Boolean thresholdIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.thresholdId!= null)&&(!this.thresholdId.isEmpty())));
                if (thresholdIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<Long> sourceThresholdId;
                    sourceThresholdId = (((this.thresholdId!= null)&&(!this.thresholdId.isEmpty()))?this.getThresholdId():null);
                    @SuppressWarnings("unchecked")
                    List<Long> copyThresholdId = ((List<Long> ) strategy.copy(LocatorUtils.property(locator, "thresholdId", sourceThresholdId), sourceThresholdId, ((this.thresholdId!= null)&&(!this.thresholdId.isEmpty()))));
                    copy.thresholdId = null;
                    if (copyThresholdId!= null) {
                        List<Long> uniqueThresholdIdl = copy.getThresholdId();
                        uniqueThresholdIdl.addAll(copyThresholdId);
                    }
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
        return new MeasurementThresholdRelationDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final MeasurementThresholdRelationDataType that = ((MeasurementThresholdRelationDataType) object);
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
            List<Long> leftThresholdId;
            leftThresholdId = (((this.thresholdId!= null)&&(!this.thresholdId.isEmpty()))?this.getThresholdId():null);
            List<Long> rightThresholdId;
            rightThresholdId = (((that.thresholdId!= null)&&(!that.thresholdId.isEmpty()))?that.getThresholdId():null);
            if ((this.thresholdId!= null)&&(!this.thresholdId.isEmpty())) {
                if ((that.thresholdId!= null)&&(!that.thresholdId.isEmpty())) {
                    if (!leftThresholdId.equals(rightThresholdId)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.thresholdId!= null)&&(!that.thresholdId.isEmpty())) {
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
            List<Long> theThresholdId;
            theThresholdId = (((this.thresholdId!= null)&&(!this.thresholdId.isEmpty()))?this.getThresholdId():null);
            if ((this.thresholdId!= null)&&(!this.thresholdId.isEmpty())) {
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
            List<Long> theThresholdId;
            theThresholdId = (((this.thresholdId!= null)&&(!this.thresholdId.isEmpty()))?this.getThresholdId():null);
            strategy.appendField(locator, this, "thresholdId", buffer, theThresholdId, ((this.thresholdId!= null)&&(!this.thresholdId.isEmpty())));
        }
        return buffer;
    }

}
