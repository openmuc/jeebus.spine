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
 * <p>Java class for HvacOverrunListDataSelectorsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HvacOverrunListDataSelectorsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="overrunId" type="{http://docs.eebus.org/spine/xsd/v1}HvacOverrunIdType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HvacOverrunListDataSelectorsType", propOrder = {
    "overrunId"
})
public class HvacOverrunListDataSelectorsType implements Cloneable, CopyTo, ToString
{

    @XmlSchemaType(name = "unsignedInt")
    protected Long overrunId;

    /**
     * Default no-arg constructor
     * 
     */
    public HvacOverrunListDataSelectorsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public HvacOverrunListDataSelectorsType(final Long overrunId) {
        this.overrunId = overrunId;
    }

    /**
     * Gets the value of the overrunId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOverrunId() {
        return overrunId;
    }

    /**
     * Sets the value of the overrunId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOverrunId(Long value) {
        this.overrunId = value;
    }

    /**
     * Sets the value of the overrunId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     * @return
     *     The class instance
     */
    public HvacOverrunListDataSelectorsType withOverrunId(Long value) {
        setOverrunId(value);
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
        if (draftCopy instanceof HvacOverrunListDataSelectorsType) {
            final HvacOverrunListDataSelectorsType copy = ((HvacOverrunListDataSelectorsType) draftCopy);
            {
                Boolean overrunIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.overrunId!= null));
                if (overrunIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceOverrunId;
                    sourceOverrunId = this.getOverrunId();
                    Long copyOverrunId = ((Long) strategy.copy(LocatorUtils.property(locator, "overrunId", sourceOverrunId), sourceOverrunId, (this.overrunId!= null)));
                    copy.setOverrunId(copyOverrunId);
                } else {
                    if (overrunIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.overrunId = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new HvacOverrunListDataSelectorsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final HvacOverrunListDataSelectorsType that = ((HvacOverrunListDataSelectorsType) object);
        {
            Long leftOverrunId;
            leftOverrunId = this.getOverrunId();
            Long rightOverrunId;
            rightOverrunId = that.getOverrunId();
            if (this.overrunId!= null) {
                if (that.overrunId!= null) {
                    if (!leftOverrunId.equals(rightOverrunId)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.overrunId!= null) {
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
            Long theOverrunId;
            theOverrunId = this.getOverrunId();
            if (this.overrunId!= null) {
                currentHashCode += theOverrunId.hashCode();
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
            Long theOverrunId;
            theOverrunId = this.getOverrunId();
            strategy.appendField(locator, this, "overrunId", buffer, theOverrunId, (this.overrunId!= null));
        }
        return buffer;
    }

}
