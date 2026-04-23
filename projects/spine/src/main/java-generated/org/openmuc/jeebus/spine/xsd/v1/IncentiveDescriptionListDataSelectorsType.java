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
 * <p>Java class for IncentiveDescriptionListDataSelectorsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IncentiveDescriptionListDataSelectorsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="incentiveId" type="{http://docs.eebus.org/spine/xsd/v1}IncentiveIdType" minOccurs="0"/&gt;
 *         &lt;element name="incentiveType" type="{http://docs.eebus.org/spine/xsd/v1}IncentiveTypeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IncentiveDescriptionListDataSelectorsType", propOrder = {
    "incentiveId",
    "incentiveType"
})
public class IncentiveDescriptionListDataSelectorsType implements Cloneable, CopyTo, ToString
{

    @XmlSchemaType(name = "unsignedInt")
    protected Long incentiveId;
    protected String incentiveType;

    /**
     * Default no-arg constructor
     * 
     */
    public IncentiveDescriptionListDataSelectorsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public IncentiveDescriptionListDataSelectorsType(final Long incentiveId, final String incentiveType) {
        this.incentiveId = incentiveId;
        this.incentiveType = incentiveType;
    }

    /**
     * Gets the value of the incentiveId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIncentiveId() {
        return incentiveId;
    }

    /**
     * Sets the value of the incentiveId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIncentiveId(Long value) {
        this.incentiveId = value;
    }

    /**
     * Gets the value of the incentiveType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncentiveType() {
        return incentiveType;
    }

    /**
     * Sets the value of the incentiveType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncentiveType(String value) {
        this.incentiveType = value;
    }

    /**
     * Sets the value of the incentiveId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     * @return
     *     The class instance
     */
    public IncentiveDescriptionListDataSelectorsType withIncentiveId(Long value) {
        setIncentiveId(value);
        return this;
    }

    /**
     * Sets the value of the incentiveType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public IncentiveDescriptionListDataSelectorsType withIncentiveType(String value) {
        setIncentiveType(value);
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
        if (draftCopy instanceof IncentiveDescriptionListDataSelectorsType) {
            final IncentiveDescriptionListDataSelectorsType copy = ((IncentiveDescriptionListDataSelectorsType) draftCopy);
            {
                Boolean incentiveIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.incentiveId!= null));
                if (incentiveIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceIncentiveId;
                    sourceIncentiveId = this.getIncentiveId();
                    Long copyIncentiveId = ((Long) strategy.copy(LocatorUtils.property(locator, "incentiveId", sourceIncentiveId), sourceIncentiveId, (this.incentiveId!= null)));
                    copy.setIncentiveId(copyIncentiveId);
                } else {
                    if (incentiveIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.incentiveId = null;
                    }
                }
            }
            {
                Boolean incentiveTypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.incentiveType!= null));
                if (incentiveTypeShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceIncentiveType;
                    sourceIncentiveType = this.getIncentiveType();
                    String copyIncentiveType = ((String) strategy.copy(LocatorUtils.property(locator, "incentiveType", sourceIncentiveType), sourceIncentiveType, (this.incentiveType!= null)));
                    copy.setIncentiveType(copyIncentiveType);
                } else {
                    if (incentiveTypeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.incentiveType = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new IncentiveDescriptionListDataSelectorsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final IncentiveDescriptionListDataSelectorsType that = ((IncentiveDescriptionListDataSelectorsType) object);
        {
            Long leftIncentiveId;
            leftIncentiveId = this.getIncentiveId();
            Long rightIncentiveId;
            rightIncentiveId = that.getIncentiveId();
            if (this.incentiveId!= null) {
                if (that.incentiveId!= null) {
                    if (!leftIncentiveId.equals(rightIncentiveId)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.incentiveId!= null) {
                    return false;
                }
            }
        }
        {
            String leftIncentiveType;
            leftIncentiveType = this.getIncentiveType();
            String rightIncentiveType;
            rightIncentiveType = that.getIncentiveType();
            if (this.incentiveType!= null) {
                if (that.incentiveType!= null) {
                    if (!leftIncentiveType.equals(rightIncentiveType)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.incentiveType!= null) {
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
            Long theIncentiveId;
            theIncentiveId = this.getIncentiveId();
            if (this.incentiveId!= null) {
                currentHashCode += theIncentiveId.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String theIncentiveType;
            theIncentiveType = this.getIncentiveType();
            if (this.incentiveType!= null) {
                currentHashCode += theIncentiveType.hashCode();
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
            Long theIncentiveId;
            theIncentiveId = this.getIncentiveId();
            strategy.appendField(locator, this, "incentiveId", buffer, theIncentiveId, (this.incentiveId!= null));
        }
        {
            String theIncentiveType;
            theIncentiveType = this.getIncentiveType();
            strategy.appendField(locator, this, "incentiveType", buffer, theIncentiveType, (this.incentiveType!= null));
        }
        return buffer;
    }

}
