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
 * <p>Java class for IdentificationDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IdentificationDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="identificationId" type="{http://docs.eebus.org/spine/xsd/v1}IdentificationIdType" minOccurs="0"/&gt;
 *         &lt;element name="identificationType" type="{http://docs.eebus.org/spine/xsd/v1}IdentificationTypeType" minOccurs="0"/&gt;
 *         &lt;element name="identificationValue" type="{http://docs.eebus.org/spine/xsd/v1}IdentificationValueType" minOccurs="0"/&gt;
 *         &lt;element name="authorized" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdentificationDataType", propOrder = {
    "identificationId",
    "identificationType",
    "identificationValue",
    "authorized"
})
public class IdentificationDataType implements Cloneable, CopyTo, ToString
{

    @XmlSchemaType(name = "unsignedInt")
    protected Long identificationId;
    protected String identificationType;
    protected String identificationValue;
    protected Boolean authorized;

    /**
     * Default no-arg constructor
     * 
     */
    public IdentificationDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public IdentificationDataType(final Long identificationId, final String identificationType, final String identificationValue, final Boolean authorized) {
        this.identificationId = identificationId;
        this.identificationType = identificationType;
        this.identificationValue = identificationValue;
        this.authorized = authorized;
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
     * Gets the value of the identificationValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificationValue() {
        return identificationValue;
    }

    /**
     * Sets the value of the identificationValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificationValue(String value) {
        this.identificationValue = value;
    }

    /**
     * Gets the value of the authorized property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getAuthorized() {
        return authorized;
    }

    /**
     * Sets the value of the authorized property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAuthorized(Boolean value) {
        this.authorized = value;
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
    public IdentificationDataType withIdentificationId(Long value) {
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
    public IdentificationDataType withIdentificationType(String value) {
        setIdentificationType(value);
        return this;
    }

    /**
     * Sets the value of the identificationValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public IdentificationDataType withIdentificationValue(String value) {
        setIdentificationValue(value);
        return this;
    }

    /**
     * Sets the value of the authorized property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     * @return
     *     The class instance
     */
    public IdentificationDataType withAuthorized(Boolean value) {
        setAuthorized(value);
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
        if (draftCopy instanceof IdentificationDataType) {
            final IdentificationDataType copy = ((IdentificationDataType) draftCopy);
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
            {
                Boolean identificationValueShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.identificationValue!= null));
                if (identificationValueShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceIdentificationValue;
                    sourceIdentificationValue = this.getIdentificationValue();
                    String copyIdentificationValue = ((String) strategy.copy(LocatorUtils.property(locator, "identificationValue", sourceIdentificationValue), sourceIdentificationValue, (this.identificationValue!= null)));
                    copy.setIdentificationValue(copyIdentificationValue);
                } else {
                    if (identificationValueShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.identificationValue = null;
                    }
                }
            }
            {
                Boolean authorizedShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.authorized!= null));
                if (authorizedShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceAuthorized;
                    sourceAuthorized = this.getAuthorized();
                    Boolean copyAuthorized = ((Boolean) strategy.copy(LocatorUtils.property(locator, "authorized", sourceAuthorized), sourceAuthorized, (this.authorized!= null)));
                    copy.setAuthorized(copyAuthorized);
                } else {
                    if (authorizedShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.authorized = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new IdentificationDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final IdentificationDataType that = ((IdentificationDataType) object);
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
        {
            String leftIdentificationValue;
            leftIdentificationValue = this.getIdentificationValue();
            String rightIdentificationValue;
            rightIdentificationValue = that.getIdentificationValue();
            if (this.identificationValue!= null) {
                if (that.identificationValue!= null) {
                    if (!leftIdentificationValue.equals(rightIdentificationValue)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.identificationValue!= null) {
                    return false;
                }
            }
        }
        {
            Boolean leftAuthorized;
            leftAuthorized = this.getAuthorized();
            Boolean rightAuthorized;
            rightAuthorized = that.getAuthorized();
            if (this.authorized!= null) {
                if (that.authorized!= null) {
                    if (!leftAuthorized.equals(rightAuthorized)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.authorized!= null) {
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
        {
            currentHashCode = (currentHashCode* 31);
            String theIdentificationValue;
            theIdentificationValue = this.getIdentificationValue();
            if (this.identificationValue!= null) {
                currentHashCode += theIdentificationValue.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            Boolean theAuthorized;
            theAuthorized = this.getAuthorized();
            if (this.authorized!= null) {
                currentHashCode += theAuthorized.hashCode();
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
        {
            String theIdentificationValue;
            theIdentificationValue = this.getIdentificationValue();
            strategy.appendField(locator, this, "identificationValue", buffer, theIdentificationValue, (this.identificationValue!= null));
        }
        {
            Boolean theAuthorized;
            theAuthorized = this.getAuthorized();
            strategy.appendField(locator, this, "authorized", buffer, theAuthorized, (this.authorized!= null));
        }
        return buffer;
    }

}
