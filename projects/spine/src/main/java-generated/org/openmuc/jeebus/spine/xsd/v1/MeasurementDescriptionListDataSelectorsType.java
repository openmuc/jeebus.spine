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
 * <p>Java class for MeasurementDescriptionListDataSelectorsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MeasurementDescriptionListDataSelectorsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="measurementId" type="{http://docs.eebus.org/spine/xsd/v1}MeasurementIdType" minOccurs="0"/&gt;
 *         &lt;element name="measurementType" type="{http://docs.eebus.org/spine/xsd/v1}MeasurementTypeType" minOccurs="0"/&gt;
 *         &lt;element name="commodityType" type="{http://docs.eebus.org/spine/xsd/v1}CommodityTypeType" minOccurs="0"/&gt;
 *         &lt;element name="scopeType" type="{http://docs.eebus.org/spine/xsd/v1}ScopeTypeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeasurementDescriptionListDataSelectorsType", propOrder = {
    "measurementId",
    "measurementType",
    "commodityType",
    "scopeType"
})
public class MeasurementDescriptionListDataSelectorsType implements Cloneable, CopyTo, ToString
{

    @XmlSchemaType(name = "unsignedInt")
    protected Long measurementId;
    protected String measurementType;
    protected String commodityType;
    protected String scopeType;

    /**
     * Default no-arg constructor
     * 
     */
    public MeasurementDescriptionListDataSelectorsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public MeasurementDescriptionListDataSelectorsType(final Long measurementId, final String measurementType, final String commodityType, final String scopeType) {
        this.measurementId = measurementId;
        this.measurementType = measurementType;
        this.commodityType = commodityType;
        this.scopeType = scopeType;
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
     * Gets the value of the measurementType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeasurementType() {
        return measurementType;
    }

    /**
     * Sets the value of the measurementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeasurementType(String value) {
        this.measurementType = value;
    }

    /**
     * Gets the value of the commodityType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommodityType() {
        return commodityType;
    }

    /**
     * Sets the value of the commodityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommodityType(String value) {
        this.commodityType = value;
    }

    /**
     * Gets the value of the scopeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScopeType() {
        return scopeType;
    }

    /**
     * Sets the value of the scopeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScopeType(String value) {
        this.scopeType = value;
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
    public MeasurementDescriptionListDataSelectorsType withMeasurementId(Long value) {
        setMeasurementId(value);
        return this;
    }

    /**
     * Sets the value of the measurementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public MeasurementDescriptionListDataSelectorsType withMeasurementType(String value) {
        setMeasurementType(value);
        return this;
    }

    /**
     * Sets the value of the commodityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public MeasurementDescriptionListDataSelectorsType withCommodityType(String value) {
        setCommodityType(value);
        return this;
    }

    /**
     * Sets the value of the scopeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public MeasurementDescriptionListDataSelectorsType withScopeType(String value) {
        setScopeType(value);
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
        if (draftCopy instanceof MeasurementDescriptionListDataSelectorsType) {
            final MeasurementDescriptionListDataSelectorsType copy = ((MeasurementDescriptionListDataSelectorsType) draftCopy);
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
                Boolean measurementTypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.measurementType!= null));
                if (measurementTypeShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceMeasurementType;
                    sourceMeasurementType = this.getMeasurementType();
                    String copyMeasurementType = ((String) strategy.copy(LocatorUtils.property(locator, "measurementType", sourceMeasurementType), sourceMeasurementType, (this.measurementType!= null)));
                    copy.setMeasurementType(copyMeasurementType);
                } else {
                    if (measurementTypeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.measurementType = null;
                    }
                }
            }
            {
                Boolean commodityTypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.commodityType!= null));
                if (commodityTypeShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceCommodityType;
                    sourceCommodityType = this.getCommodityType();
                    String copyCommodityType = ((String) strategy.copy(LocatorUtils.property(locator, "commodityType", sourceCommodityType), sourceCommodityType, (this.commodityType!= null)));
                    copy.setCommodityType(copyCommodityType);
                } else {
                    if (commodityTypeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.commodityType = null;
                    }
                }
            }
            {
                Boolean scopeTypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.scopeType!= null));
                if (scopeTypeShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceScopeType;
                    sourceScopeType = this.getScopeType();
                    String copyScopeType = ((String) strategy.copy(LocatorUtils.property(locator, "scopeType", sourceScopeType), sourceScopeType, (this.scopeType!= null)));
                    copy.setScopeType(copyScopeType);
                } else {
                    if (scopeTypeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.scopeType = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new MeasurementDescriptionListDataSelectorsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final MeasurementDescriptionListDataSelectorsType that = ((MeasurementDescriptionListDataSelectorsType) object);
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
            String leftMeasurementType;
            leftMeasurementType = this.getMeasurementType();
            String rightMeasurementType;
            rightMeasurementType = that.getMeasurementType();
            if (this.measurementType!= null) {
                if (that.measurementType!= null) {
                    if (!leftMeasurementType.equals(rightMeasurementType)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.measurementType!= null) {
                    return false;
                }
            }
        }
        {
            String leftCommodityType;
            leftCommodityType = this.getCommodityType();
            String rightCommodityType;
            rightCommodityType = that.getCommodityType();
            if (this.commodityType!= null) {
                if (that.commodityType!= null) {
                    if (!leftCommodityType.equals(rightCommodityType)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.commodityType!= null) {
                    return false;
                }
            }
        }
        {
            String leftScopeType;
            leftScopeType = this.getScopeType();
            String rightScopeType;
            rightScopeType = that.getScopeType();
            if (this.scopeType!= null) {
                if (that.scopeType!= null) {
                    if (!leftScopeType.equals(rightScopeType)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.scopeType!= null) {
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
            String theMeasurementType;
            theMeasurementType = this.getMeasurementType();
            if (this.measurementType!= null) {
                currentHashCode += theMeasurementType.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String theCommodityType;
            theCommodityType = this.getCommodityType();
            if (this.commodityType!= null) {
                currentHashCode += theCommodityType.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String theScopeType;
            theScopeType = this.getScopeType();
            if (this.scopeType!= null) {
                currentHashCode += theScopeType.hashCode();
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
            String theMeasurementType;
            theMeasurementType = this.getMeasurementType();
            strategy.appendField(locator, this, "measurementType", buffer, theMeasurementType, (this.measurementType!= null));
        }
        {
            String theCommodityType;
            theCommodityType = this.getCommodityType();
            strategy.appendField(locator, this, "commodityType", buffer, theCommodityType, (this.commodityType!= null));
        }
        {
            String theScopeType;
            theScopeType = this.getScopeType();
            strategy.appendField(locator, this, "scopeType", buffer, theScopeType, (this.scopeType!= null));
        }
        return buffer;
    }

}
