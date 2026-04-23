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
 * <p>Java class for SessionIdentificationListDataSelectorsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SessionIdentificationListDataSelectorsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sessionId" type="{http://docs.eebus.org/spine/xsd/v1}SessionIdType" minOccurs="0"/&gt;
 *         &lt;element name="identificationId" type="{http://docs.eebus.org/spine/xsd/v1}IdentificationIdType" minOccurs="0"/&gt;
 *         &lt;element name="isLatestSession" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="timePeriod" type="{http://docs.eebus.org/spine/xsd/v1}TimePeriodType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SessionIdentificationListDataSelectorsType", propOrder = {
    "sessionId",
    "identificationId",
    "isLatestSession",
    "timePeriod"
})
public class SessionIdentificationListDataSelectorsType implements Cloneable, CopyTo, ToString
{

    @XmlSchemaType(name = "unsignedInt")
    protected Long sessionId;
    @XmlSchemaType(name = "unsignedInt")
    protected Long identificationId;
    protected Boolean isLatestSession;
    protected TimePeriodType timePeriod;

    /**
     * Default no-arg constructor
     * 
     */
    public SessionIdentificationListDataSelectorsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public SessionIdentificationListDataSelectorsType(final Long sessionId, final Long identificationId, final Boolean isLatestSession, final TimePeriodType timePeriod) {
        this.sessionId = sessionId;
        this.identificationId = identificationId;
        this.isLatestSession = isLatestSession;
        this.timePeriod = timePeriod;
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
     * Gets the value of the identificationId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdentificationId() {
        return identificationId;
    }

    /**
     * Sets the value of the identificationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdentificationId(Long value) {
        this.identificationId = value;
    }

    /**
     * Gets the value of the isLatestSession property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getIsLatestSession() {
        return isLatestSession;
    }

    /**
     * Sets the value of the isLatestSession property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsLatestSession(Boolean value) {
        this.isLatestSession = value;
    }

    /**
     * Gets the value of the timePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodType }
     *     
     */
    public TimePeriodType getTimePeriod() {
        return timePeriod;
    }

    /**
     * Sets the value of the timePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodType }
     *     
     */
    public void setTimePeriod(TimePeriodType value) {
        this.timePeriod = value;
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
    public SessionIdentificationListDataSelectorsType withSessionId(Long value) {
        setSessionId(value);
        return this;
    }

    /**
     * Sets the value of the identificationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     * @return
     *     The class instance
     */
    public SessionIdentificationListDataSelectorsType withIdentificationId(Long value) {
        setIdentificationId(value);
        return this;
    }

    /**
     * Sets the value of the isLatestSession property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     * @return
     *     The class instance
     */
    public SessionIdentificationListDataSelectorsType withIsLatestSession(Boolean value) {
        setIsLatestSession(value);
        return this;
    }

    /**
     * Sets the value of the timePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodType }
     * @return
     *     The class instance
     */
    public SessionIdentificationListDataSelectorsType withTimePeriod(TimePeriodType value) {
        setTimePeriod(value);
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
        if (draftCopy instanceof SessionIdentificationListDataSelectorsType) {
            final SessionIdentificationListDataSelectorsType copy = ((SessionIdentificationListDataSelectorsType) draftCopy);
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
                Boolean identificationIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.identificationId!= null));
                if (identificationIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceIdentificationId;
                    sourceIdentificationId = this.getIdentificationId();
                    Long copyIdentificationId = ((Long) strategy.copy(LocatorUtils.property(locator, "identificationId", sourceIdentificationId), sourceIdentificationId, (this.identificationId!= null)));
                    copy.setIdentificationId(copyIdentificationId);
                } else {
                    if (identificationIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.identificationId = null;
                    }
                }
            }
            {
                Boolean isLatestSessionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.isLatestSession!= null));
                if (isLatestSessionShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceIsLatestSession;
                    sourceIsLatestSession = this.getIsLatestSession();
                    Boolean copyIsLatestSession = ((Boolean) strategy.copy(LocatorUtils.property(locator, "isLatestSession", sourceIsLatestSession), sourceIsLatestSession, (this.isLatestSession!= null)));
                    copy.setIsLatestSession(copyIsLatestSession);
                } else {
                    if (isLatestSessionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.isLatestSession = null;
                    }
                }
            }
            {
                Boolean timePeriodShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.timePeriod!= null));
                if (timePeriodShouldBeCopiedAndSet == Boolean.TRUE) {
                    TimePeriodType sourceTimePeriod;
                    sourceTimePeriod = this.getTimePeriod();
                    TimePeriodType copyTimePeriod = ((TimePeriodType) strategy.copy(LocatorUtils.property(locator, "timePeriod", sourceTimePeriod), sourceTimePeriod, (this.timePeriod!= null)));
                    copy.setTimePeriod(copyTimePeriod);
                } else {
                    if (timePeriodShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.timePeriod = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new SessionIdentificationListDataSelectorsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final SessionIdentificationListDataSelectorsType that = ((SessionIdentificationListDataSelectorsType) object);
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
            Long leftIdentificationId;
            leftIdentificationId = this.getIdentificationId();
            Long rightIdentificationId;
            rightIdentificationId = that.getIdentificationId();
            if (this.identificationId!= null) {
                if (that.identificationId!= null) {
                    if (!leftIdentificationId.equals(rightIdentificationId)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.identificationId!= null) {
                    return false;
                }
            }
        }
        {
            Boolean leftIsLatestSession;
            leftIsLatestSession = this.getIsLatestSession();
            Boolean rightIsLatestSession;
            rightIsLatestSession = that.getIsLatestSession();
            if (this.isLatestSession!= null) {
                if (that.isLatestSession!= null) {
                    if (!leftIsLatestSession.equals(rightIsLatestSession)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.isLatestSession!= null) {
                    return false;
                }
            }
        }
        {
            TimePeriodType leftTimePeriod;
            leftTimePeriod = this.getTimePeriod();
            TimePeriodType rightTimePeriod;
            rightTimePeriod = that.getTimePeriod();
            if (this.timePeriod!= null) {
                if (that.timePeriod!= null) {
                    if (!leftTimePeriod.equals(rightTimePeriod)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.timePeriod!= null) {
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
            Long theIdentificationId;
            theIdentificationId = this.getIdentificationId();
            if (this.identificationId!= null) {
                currentHashCode += theIdentificationId.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            Boolean theIsLatestSession;
            theIsLatestSession = this.getIsLatestSession();
            if (this.isLatestSession!= null) {
                currentHashCode += theIsLatestSession.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            TimePeriodType theTimePeriod;
            theTimePeriod = this.getTimePeriod();
            if (this.timePeriod!= null) {
                currentHashCode += theTimePeriod.hashCode();
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
            Long theIdentificationId;
            theIdentificationId = this.getIdentificationId();
            strategy.appendField(locator, this, "identificationId", buffer, theIdentificationId, (this.identificationId!= null));
        }
        {
            Boolean theIsLatestSession;
            theIsLatestSession = this.getIsLatestSession();
            strategy.appendField(locator, this, "isLatestSession", buffer, theIsLatestSession, (this.isLatestSession!= null));
        }
        {
            TimePeriodType theTimePeriod;
            theTimePeriod = this.getTimePeriod();
            strategy.appendField(locator, this, "timePeriod", buffer, theTimePeriod, (this.timePeriod!= null));
        }
        return buffer;
    }

}
