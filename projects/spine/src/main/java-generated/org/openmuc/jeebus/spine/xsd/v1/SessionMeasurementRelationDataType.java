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
 * <p>Java class for SessionMeasurementRelationDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SessionMeasurementRelationDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sessionId" type="{http://docs.eebus.org/spine/xsd/v1}SessionIdType" minOccurs="0"/&gt;
 *         &lt;element name="measurementId" type="{http://docs.eebus.org/spine/xsd/v1}MeasurementIdType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SessionMeasurementRelationDataType", propOrder = {
    "sessionId",
    "measurementId"
})
public class SessionMeasurementRelationDataType implements Cloneable, CopyTo, ToString
{

    @XmlSchemaType(name = "unsignedInt")
    protected Long sessionId;
    @XmlElement(type = Long.class)
    @XmlSchemaType(name = "unsignedInt")
    protected List<Long> measurementId;

    /**
     * Default no-arg constructor
     * 
     */
    public SessionMeasurementRelationDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public SessionMeasurementRelationDataType(final Long sessionId, final List<Long> measurementId) {
        this.sessionId = sessionId;
        this.measurementId = measurementId;
    }

    /**
     * Gets the value of the sessionId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSessionId() {
        return sessionId;
    }

    /**
     * Sets the value of the sessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSessionId(Long value) {
        this.sessionId = value;
    }

    /**
     * Gets the value of the measurementId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the measurementId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeasurementId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getMeasurementId() {
        if (measurementId == null) {
            measurementId = new ArrayList<Long>();
        }
        return this.measurementId;
    }

    /**
     * Sets the value of the sessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     * @return
     *     The class instance
     */
    public SessionMeasurementRelationDataType withSessionId(Long value) {
        setSessionId(value);
        return this;
    }

    /**
     * Adds objects to the list of MeasurementId using add method
     * 
     * @param values
     *     objects to add to the list MeasurementId
     * @return
     *     The class instance
     */
    public SessionMeasurementRelationDataType withMeasurementId(Long... values) {
        if (values!= null) {
            for (Long value: values) {
                getMeasurementId().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of MeasurementId using addAll method
     * 
     * @param values
     *     objects to add to the list MeasurementId
     * @return
     *     The class instance
     */
    public SessionMeasurementRelationDataType withMeasurementId(Collection<Long> values) {
        if (values!= null) {
            getMeasurementId().addAll(values);
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
        if (draftCopy instanceof SessionMeasurementRelationDataType) {
            final SessionMeasurementRelationDataType copy = ((SessionMeasurementRelationDataType) draftCopy);
            {
                Boolean sessionIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.sessionId!= null));
                if (sessionIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceSessionId;
                    sourceSessionId = this.getSessionId();
                    Long copySessionId = ((Long) strategy.copy(LocatorUtils.property(locator, "sessionId", sourceSessionId), sourceSessionId, (this.sessionId!= null)));
                    copy.setSessionId(copySessionId);
                } else {
                    if (sessionIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.sessionId = null;
                    }
                }
            }
            {
                Boolean measurementIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.measurementId!= null)&&(!this.measurementId.isEmpty())));
                if (measurementIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<Long> sourceMeasurementId;
                    sourceMeasurementId = (((this.measurementId!= null)&&(!this.measurementId.isEmpty()))?this.getMeasurementId():null);
                    @SuppressWarnings("unchecked")
                    List<Long> copyMeasurementId = ((List<Long> ) strategy.copy(LocatorUtils.property(locator, "measurementId", sourceMeasurementId), sourceMeasurementId, ((this.measurementId!= null)&&(!this.measurementId.isEmpty()))));
                    copy.measurementId = null;
                    if (copyMeasurementId!= null) {
                        List<Long> uniqueMeasurementIdl = copy.getMeasurementId();
                        uniqueMeasurementIdl.addAll(copyMeasurementId);
                    }
                } else {
                    if (measurementIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.measurementId = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new SessionMeasurementRelationDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final SessionMeasurementRelationDataType that = ((SessionMeasurementRelationDataType) object);
        {
            Long leftSessionId;
            leftSessionId = this.getSessionId();
            Long rightSessionId;
            rightSessionId = that.getSessionId();
            if (this.sessionId!= null) {
                if (that.sessionId!= null) {
                    if (!leftSessionId.equals(rightSessionId)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.sessionId!= null) {
                    return false;
                }
            }
        }
        {
            List<Long> leftMeasurementId;
            leftMeasurementId = (((this.measurementId!= null)&&(!this.measurementId.isEmpty()))?this.getMeasurementId():null);
            List<Long> rightMeasurementId;
            rightMeasurementId = (((that.measurementId!= null)&&(!that.measurementId.isEmpty()))?that.getMeasurementId():null);
            if ((this.measurementId!= null)&&(!this.measurementId.isEmpty())) {
                if ((that.measurementId!= null)&&(!that.measurementId.isEmpty())) {
                    if (!leftMeasurementId.equals(rightMeasurementId)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.measurementId!= null)&&(!that.measurementId.isEmpty())) {
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
            Long theSessionId;
            theSessionId = this.getSessionId();
            if (this.sessionId!= null) {
                currentHashCode += theSessionId.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            List<Long> theMeasurementId;
            theMeasurementId = (((this.measurementId!= null)&&(!this.measurementId.isEmpty()))?this.getMeasurementId():null);
            if ((this.measurementId!= null)&&(!this.measurementId.isEmpty())) {
                currentHashCode += theMeasurementId.hashCode();
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
            Long theSessionId;
            theSessionId = this.getSessionId();
            strategy.appendField(locator, this, "sessionId", buffer, theSessionId, (this.sessionId!= null));
        }
        {
            List<Long> theMeasurementId;
            theMeasurementId = (((this.measurementId!= null)&&(!this.measurementId.isEmpty()))?this.getMeasurementId():null);
            strategy.appendField(locator, this, "measurementId", buffer, theMeasurementId, ((this.measurementId!= null)&&(!this.measurementId.isEmpty())));
        }
        return buffer;
    }

}
