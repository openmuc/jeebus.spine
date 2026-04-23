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
 * <p>Java class for LoadControlLimitListDataSelectorsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoadControlLimitListDataSelectorsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="limitId" type="{http://docs.eebus.org/spine/xsd/v1}LoadControlLimitIdType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoadControlLimitListDataSelectorsType", propOrder = {
    "limitId"
})
public class LoadControlLimitListDataSelectorsType implements Cloneable, CopyTo, ToString
{

    @XmlSchemaType(name = "unsignedInt")
    protected Long limitId;

    /**
     * Default no-arg constructor
     * 
     */
    public LoadControlLimitListDataSelectorsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public LoadControlLimitListDataSelectorsType(final Long limitId) {
        this.limitId = limitId;
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
     * Sets the value of the limitId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     * @return
     *     The class instance
     */
    public LoadControlLimitListDataSelectorsType withLimitId(Long value) {
        setLimitId(value);
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
        if (draftCopy instanceof LoadControlLimitListDataSelectorsType) {
            final LoadControlLimitListDataSelectorsType copy = ((LoadControlLimitListDataSelectorsType) draftCopy);
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
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new LoadControlLimitListDataSelectorsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final LoadControlLimitListDataSelectorsType that = ((LoadControlLimitListDataSelectorsType) object);
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
        return buffer;
    }

}
