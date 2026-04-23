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
 * <p>Java class for IdentificationListDataSelectorsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IdentificationListDataSelectorsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="identificationId" type="{http://docs.eebus.org/spine/xsd/v1}IdentificationIdType" minOccurs="0"/&gt;
 *         &lt;element name="identificationType" type="{http://docs.eebus.org/spine/xsd/v1}IdentificationTypeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdentificationListDataSelectorsType", propOrder = {
    "identificationId",
    "identificationType"
})
public class IdentificationListDataSelectorsType implements Cloneable, CopyTo, ToString
{

    @XmlSchemaType(name = "unsignedInt")
    protected Long identificationId;
    protected String identificationType;

    /**
     * Default no-arg constructor
     * 
     */
    public IdentificationListDataSelectorsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public IdentificationListDataSelectorsType(final Long identificationId, final String identificationType) {
        this.identificationId = identificationId;
        this.identificationType = identificationType;
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
     * Gets the value of the identificationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificationType() {
        return identificationType;
    }

    /**
     * Sets the value of the identificationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificationType(String value) {
        this.identificationType = value;
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
    public IdentificationListDataSelectorsType withIdentificationId(Long value) {
        setIdentificationId(value);
        return this;
    }

    /**
     * Sets the value of the identificationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public IdentificationListDataSelectorsType withIdentificationType(String value) {
        setIdentificationType(value);
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
        if (draftCopy instanceof IdentificationListDataSelectorsType) {
            final IdentificationListDataSelectorsType copy = ((IdentificationListDataSelectorsType) draftCopy);
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
                Boolean identificationTypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.identificationType!= null));
                if (identificationTypeShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceIdentificationType;
                    sourceIdentificationType = this.getIdentificationType();
                    String copyIdentificationType = ((String) strategy.copy(LocatorUtils.property(locator, "identificationType", sourceIdentificationType), sourceIdentificationType, (this.identificationType!= null)));
                    copy.setIdentificationType(copyIdentificationType);
                } else {
                    if (identificationTypeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.identificationType = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new IdentificationListDataSelectorsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final IdentificationListDataSelectorsType that = ((IdentificationListDataSelectorsType) object);
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
            String leftIdentificationType;
            leftIdentificationType = this.getIdentificationType();
            String rightIdentificationType;
            rightIdentificationType = that.getIdentificationType();
            if (this.identificationType!= null) {
                if (that.identificationType!= null) {
                    if (!leftIdentificationType.equals(rightIdentificationType)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.identificationType!= null) {
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
            Long theIdentificationId;
            theIdentificationId = this.getIdentificationId();
            if (this.identificationId!= null) {
                currentHashCode += theIdentificationId.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String theIdentificationType;
            theIdentificationType = this.getIdentificationType();
            if (this.identificationType!= null) {
                currentHashCode += theIdentificationType.hashCode();
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
            Long theIdentificationId;
            theIdentificationId = this.getIdentificationId();
            strategy.appendField(locator, this, "identificationId", buffer, theIdentificationId, (this.identificationId!= null));
        }
        {
            String theIdentificationType;
            theIdentificationType = this.getIdentificationType();
            strategy.appendField(locator, this, "identificationType", buffer, theIdentificationType, (this.identificationType!= null));
        }
        return buffer;
    }

}
