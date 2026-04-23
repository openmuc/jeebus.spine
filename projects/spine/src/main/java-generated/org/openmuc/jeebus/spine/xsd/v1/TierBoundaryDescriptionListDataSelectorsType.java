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
 * <p>Java class for TierBoundaryDescriptionListDataSelectorsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TierBoundaryDescriptionListDataSelectorsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="boundaryId" type="{http://docs.eebus.org/spine/xsd/v1}TierBoundaryIdType" minOccurs="0"/&gt;
 *         &lt;element name="boundaryType" type="{http://docs.eebus.org/spine/xsd/v1}TierBoundaryTypeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TierBoundaryDescriptionListDataSelectorsType", propOrder = {
    "boundaryId",
    "boundaryType"
})
public class TierBoundaryDescriptionListDataSelectorsType implements Cloneable, CopyTo, ToString
{

    @XmlSchemaType(name = "unsignedInt")
    protected Long boundaryId;
    protected String boundaryType;

    /**
     * Default no-arg constructor
     * 
     */
    public TierBoundaryDescriptionListDataSelectorsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public TierBoundaryDescriptionListDataSelectorsType(final Long boundaryId, final String boundaryType) {
        this.boundaryId = boundaryId;
        this.boundaryType = boundaryType;
    }

    /**
     * Gets the value of the boundaryId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBoundaryId() {
        return boundaryId;
    }

    /**
     * Sets the value of the boundaryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBoundaryId(Long value) {
        this.boundaryId = value;
    }

    /**
     * Gets the value of the boundaryType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoundaryType() {
        return boundaryType;
    }

    /**
     * Sets the value of the boundaryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoundaryType(String value) {
        this.boundaryType = value;
    }

    /**
     * Sets the value of the boundaryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     * @return
     *     The class instance
     */
    public TierBoundaryDescriptionListDataSelectorsType withBoundaryId(Long value) {
        setBoundaryId(value);
        return this;
    }

    /**
     * Sets the value of the boundaryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public TierBoundaryDescriptionListDataSelectorsType withBoundaryType(String value) {
        setBoundaryType(value);
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
        if (draftCopy instanceof TierBoundaryDescriptionListDataSelectorsType) {
            final TierBoundaryDescriptionListDataSelectorsType copy = ((TierBoundaryDescriptionListDataSelectorsType) draftCopy);
            {
                Boolean boundaryIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.boundaryId!= null));
                if (boundaryIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceBoundaryId;
                    sourceBoundaryId = this.getBoundaryId();
                    Long copyBoundaryId = ((Long) strategy.copy(LocatorUtils.property(locator, "boundaryId", sourceBoundaryId), sourceBoundaryId, (this.boundaryId!= null)));
                    copy.setBoundaryId(copyBoundaryId);
                } else {
                    if (boundaryIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.boundaryId = null;
                    }
                }
            }
            {
                Boolean boundaryTypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.boundaryType!= null));
                if (boundaryTypeShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceBoundaryType;
                    sourceBoundaryType = this.getBoundaryType();
                    String copyBoundaryType = ((String) strategy.copy(LocatorUtils.property(locator, "boundaryType", sourceBoundaryType), sourceBoundaryType, (this.boundaryType!= null)));
                    copy.setBoundaryType(copyBoundaryType);
                } else {
                    if (boundaryTypeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.boundaryType = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new TierBoundaryDescriptionListDataSelectorsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TierBoundaryDescriptionListDataSelectorsType that = ((TierBoundaryDescriptionListDataSelectorsType) object);
        {
            Long leftBoundaryId;
            leftBoundaryId = this.getBoundaryId();
            Long rightBoundaryId;
            rightBoundaryId = that.getBoundaryId();
            if (this.boundaryId!= null) {
                if (that.boundaryId!= null) {
                    if (!leftBoundaryId.equals(rightBoundaryId)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.boundaryId!= null) {
                    return false;
                }
            }
        }
        {
            String leftBoundaryType;
            leftBoundaryType = this.getBoundaryType();
            String rightBoundaryType;
            rightBoundaryType = that.getBoundaryType();
            if (this.boundaryType!= null) {
                if (that.boundaryType!= null) {
                    if (!leftBoundaryType.equals(rightBoundaryType)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.boundaryType!= null) {
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
            Long theBoundaryId;
            theBoundaryId = this.getBoundaryId();
            if (this.boundaryId!= null) {
                currentHashCode += theBoundaryId.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String theBoundaryType;
            theBoundaryType = this.getBoundaryType();
            if (this.boundaryType!= null) {
                currentHashCode += theBoundaryType.hashCode();
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
            Long theBoundaryId;
            theBoundaryId = this.getBoundaryId();
            strategy.appendField(locator, this, "boundaryId", buffer, theBoundaryId, (this.boundaryId!= null));
        }
        {
            String theBoundaryType;
            theBoundaryType = this.getBoundaryType();
            strategy.appendField(locator, this, "boundaryType", buffer, theBoundaryType, (this.boundaryType!= null));
        }
        return buffer;
    }

}
