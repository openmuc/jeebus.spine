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
 * <p>Java class for LoadControlLimitDescriptionListDataSelectorsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoadControlLimitDescriptionListDataSelectorsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="limitId" type="{http://docs.eebus.org/spine/xsd/v1}LoadControlLimitIdType" minOccurs="0"/&gt;
 *         &lt;element name="limitType" type="{http://docs.eebus.org/spine/xsd/v1}LoadControlLimitTypeType" minOccurs="0"/&gt;
 *         &lt;element name="limitDirection" type="{http://docs.eebus.org/spine/xsd/v1}EnergyDirectionType" minOccurs="0"/&gt;
 *         &lt;element name="measurementId" type="{http://docs.eebus.org/spine/xsd/v1}MeasurementIdType" minOccurs="0"/&gt;
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
@XmlType(name = "LoadControlLimitDescriptionListDataSelectorsType", propOrder = {
    "limitId",
    "limitType",
    "limitDirection",
    "measurementId",
    "scopeType"
})
public class LoadControlLimitDescriptionListDataSelectorsType implements Cloneable, CopyTo, ToString
{

    @XmlSchemaType(name = "unsignedInt")
    protected Long limitId;
    protected String limitType;
    protected String limitDirection;
    @XmlSchemaType(name = "unsignedInt")
    protected Long measurementId;
    protected String scopeType;

    /**
     * Default no-arg constructor
     * 
     */
    public LoadControlLimitDescriptionListDataSelectorsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public LoadControlLimitDescriptionListDataSelectorsType(final Long limitId, final String limitType, final String limitDirection, final Long measurementId, final String scopeType) {
        this.limitId = limitId;
        this.limitType = limitType;
        this.limitDirection = limitDirection;
        this.measurementId = measurementId;
        this.scopeType = scopeType;
    }

    /**
     * Gets the value of the limitId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLimitId() {
        return limitId;
    }

    /**
     * Sets the value of the limitId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLimitId(Long value) {
        this.limitId = value;
    }

    /**
     * Gets the value of the limitType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLimitType() {
        return limitType;
    }

    /**
     * Sets the value of the limitType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLimitType(String value) {
        this.limitType = value;
    }

    /**
     * Gets the value of the limitDirection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLimitDirection() {
        return limitDirection;
    }

    /**
     * Sets the value of the limitDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLimitDirection(String value) {
        this.limitDirection = value;
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
     * Sets the value of the limitId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     * @return
     *     The class instance
     */
    public LoadControlLimitDescriptionListDataSelectorsType withLimitId(Long value) {
        setLimitId(value);
        return this;
    }

    /**
     * Sets the value of the limitType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public LoadControlLimitDescriptionListDataSelectorsType withLimitType(String value) {
        setLimitType(value);
        return this;
    }

    /**
     * Sets the value of the limitDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public LoadControlLimitDescriptionListDataSelectorsType withLimitDirection(String value) {
        setLimitDirection(value);
        return this;
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
    public LoadControlLimitDescriptionListDataSelectorsType withMeasurementId(Long value) {
        setMeasurementId(value);
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
    public LoadControlLimitDescriptionListDataSelectorsType withScopeType(String value) {
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
        if (draftCopy instanceof LoadControlLimitDescriptionListDataSelectorsType) {
            final LoadControlLimitDescriptionListDataSelectorsType copy = ((LoadControlLimitDescriptionListDataSelectorsType) draftCopy);
            {
                Boolean limitIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.limitId!= null));
                if (limitIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceLimitId;
                    sourceLimitId = this.getLimitId();
                    Long copyLimitId = ((Long) strategy.copy(LocatorUtils.property(locator, "limitId", sourceLimitId), sourceLimitId, (this.limitId!= null)));
                    copy.setLimitId(copyLimitId);
                } else {
                    if (limitIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.limitId = null;
                    }
                }
            }
            {
                Boolean limitTypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.limitType!= null));
                if (limitTypeShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceLimitType;
                    sourceLimitType = this.getLimitType();
                    String copyLimitType = ((String) strategy.copy(LocatorUtils.property(locator, "limitType", sourceLimitType), sourceLimitType, (this.limitType!= null)));
                    copy.setLimitType(copyLimitType);
                } else {
                    if (limitTypeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.limitType = null;
                    }
                }
            }
            {
                Boolean limitDirectionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.limitDirection!= null));
                if (limitDirectionShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceLimitDirection;
                    sourceLimitDirection = this.getLimitDirection();
                    String copyLimitDirection = ((String) strategy.copy(LocatorUtils.property(locator, "limitDirection", sourceLimitDirection), sourceLimitDirection, (this.limitDirection!= null)));
                    copy.setLimitDirection(copyLimitDirection);
                } else {
                    if (limitDirectionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.limitDirection = null;
                    }
                }
            }
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
        return new LoadControlLimitDescriptionListDataSelectorsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final LoadControlLimitDescriptionListDataSelectorsType that = ((LoadControlLimitDescriptionListDataSelectorsType) object);
        {
            Long leftLimitId;
            leftLimitId = this.getLimitId();
            Long rightLimitId;
            rightLimitId = that.getLimitId();
            if (this.limitId!= null) {
                if (that.limitId!= null) {
                    if (!leftLimitId.equals(rightLimitId)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.limitId!= null) {
                    return false;
                }
            }
        }
        {
            String leftLimitType;
            leftLimitType = this.getLimitType();
            String rightLimitType;
            rightLimitType = that.getLimitType();
            if (this.limitType!= null) {
                if (that.limitType!= null) {
                    if (!leftLimitType.equals(rightLimitType)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.limitType!= null) {
                    return false;
                }
            }
        }
        {
            String leftLimitDirection;
            leftLimitDirection = this.getLimitDirection();
            String rightLimitDirection;
            rightLimitDirection = that.getLimitDirection();
            if (this.limitDirection!= null) {
                if (that.limitDirection!= null) {
                    if (!leftLimitDirection.equals(rightLimitDirection)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.limitDirection!= null) {
                    return false;
                }
            }
        }
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
            Long theLimitId;
            theLimitId = this.getLimitId();
            if (this.limitId!= null) {
                currentHashCode += theLimitId.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String theLimitType;
            theLimitType = this.getLimitType();
            if (this.limitType!= null) {
                currentHashCode += theLimitType.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String theLimitDirection;
            theLimitDirection = this.getLimitDirection();
            if (this.limitDirection!= null) {
                currentHashCode += theLimitDirection.hashCode();
            }
        }
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
            Long theLimitId;
            theLimitId = this.getLimitId();
            strategy.appendField(locator, this, "limitId", buffer, theLimitId, (this.limitId!= null));
        }
        {
            String theLimitType;
            theLimitType = this.getLimitType();
            strategy.appendField(locator, this, "limitType", buffer, theLimitType, (this.limitType!= null));
        }
        {
            String theLimitDirection;
            theLimitDirection = this.getLimitDirection();
            strategy.appendField(locator, this, "limitDirection", buffer, theLimitDirection, (this.limitDirection!= null));
        }
        {
            Long theMeasurementId;
            theMeasurementId = this.getMeasurementId();
            strategy.appendField(locator, this, "measurementId", buffer, theMeasurementId, (this.measurementId!= null));
        }
        {
            String theScopeType;
            theScopeType = this.getScopeType();
            strategy.appendField(locator, this, "scopeType", buffer, theScopeType, (this.scopeType!= null));
        }
        return buffer;
    }

}
