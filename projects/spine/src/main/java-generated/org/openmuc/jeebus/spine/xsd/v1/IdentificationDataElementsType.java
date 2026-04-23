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
 * <p>Java class for IdentificationDataElementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IdentificationDataElementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="identificationId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="identificationType" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="identificationValue" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="authorized" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdentificationDataElementsType", propOrder = {
    "identificationId",
    "identificationType",
    "identificationValue",
    "authorized"
})
public class IdentificationDataElementsType implements Cloneable, CopyTo, ToString
{

    protected ElementTagType identificationId;
    protected ElementTagType identificationType;
    protected ElementTagType identificationValue;
    protected ElementTagType authorized;

    /**
     * Default no-arg constructor
     * 
     */
    public IdentificationDataElementsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public IdentificationDataElementsType(final ElementTagType identificationId, final ElementTagType identificationType, final ElementTagType identificationValue, final ElementTagType authorized) {
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
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getIdentificationId() {
        return identificationId;
    }

    /**
     * Sets the value of the identificationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setIdentificationId(ElementTagType value) {
        this.identificationId = value;
    }

    /**
     * Gets the value of the identificationType property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getIdentificationType() {
        return identificationType;
    }

    /**
     * Sets the value of the identificationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setIdentificationType(ElementTagType value) {
        this.identificationType = value;
    }

    /**
     * Gets the value of the identificationValue property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getIdentificationValue() {
        return identificationValue;
    }

    /**
     * Sets the value of the identificationValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setIdentificationValue(ElementTagType value) {
        this.identificationValue = value;
    }

    /**
     * Gets the value of the authorized property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getAuthorized() {
        return authorized;
    }

    /**
     * Sets the value of the authorized property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setAuthorized(ElementTagType value) {
        this.authorized = value;
    }

    /**
     * Sets the value of the identificationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public IdentificationDataElementsType withIdentificationId(ElementTagType value) {
        setIdentificationId(value);
        return this;
    }

    /**
     * Sets the value of the identificationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public IdentificationDataElementsType withIdentificationType(ElementTagType value) {
        setIdentificationType(value);
        return this;
    }

    /**
     * Sets the value of the identificationValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public IdentificationDataElementsType withIdentificationValue(ElementTagType value) {
        setIdentificationValue(value);
        return this;
    }

    /**
     * Sets the value of the authorized property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public IdentificationDataElementsType withAuthorized(ElementTagType value) {
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
        if (draftCopy instanceof IdentificationDataElementsType) {
            final IdentificationDataElementsType copy = ((IdentificationDataElementsType) draftCopy);
            {
                Boolean identificationIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.identificationId!= null));
                if (identificationIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceIdentificationId;
                    sourceIdentificationId = this.getIdentificationId();
                    ElementTagType copyIdentificationId = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "identificationId", sourceIdentificationId), sourceIdentificationId, (this.identificationId!= null)));
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
                    ElementTagType sourceIdentificationType;
                    sourceIdentificationType = this.getIdentificationType();
                    ElementTagType copyIdentificationType = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "identificationType", sourceIdentificationType), sourceIdentificationType, (this.identificationType!= null)));
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
                    ElementTagType sourceIdentificationValue;
                    sourceIdentificationValue = this.getIdentificationValue();
                    ElementTagType copyIdentificationValue = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "identificationValue", sourceIdentificationValue), sourceIdentificationValue, (this.identificationValue!= null)));
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
                    ElementTagType sourceAuthorized;
                    sourceAuthorized = this.getAuthorized();
                    ElementTagType copyAuthorized = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "authorized", sourceAuthorized), sourceAuthorized, (this.authorized!= null)));
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
        return new IdentificationDataElementsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final IdentificationDataElementsType that = ((IdentificationDataElementsType) object);
        {
            ElementTagType leftIdentificationId;
            leftIdentificationId = this.getIdentificationId();
            ElementTagType rightIdentificationId;
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
            ElementTagType leftIdentificationType;
            leftIdentificationType = this.getIdentificationType();
            ElementTagType rightIdentificationType;
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
            ElementTagType leftIdentificationValue;
            leftIdentificationValue = this.getIdentificationValue();
            ElementTagType rightIdentificationValue;
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
            ElementTagType leftAuthorized;
            leftAuthorized = this.getAuthorized();
            ElementTagType rightAuthorized;
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
            ElementTagType theIdentificationId;
            theIdentificationId = this.getIdentificationId();
            if (this.identificationId!= null) {
                currentHashCode += theIdentificationId.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theIdentificationType;
            theIdentificationType = this.getIdentificationType();
            if (this.identificationType!= null) {
                currentHashCode += theIdentificationType.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theIdentificationValue;
            theIdentificationValue = this.getIdentificationValue();
            if (this.identificationValue!= null) {
                currentHashCode += theIdentificationValue.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theAuthorized;
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
            ElementTagType theIdentificationId;
            theIdentificationId = this.getIdentificationId();
            strategy.appendField(locator, this, "identificationId", buffer, theIdentificationId, (this.identificationId!= null));
        }
        {
            ElementTagType theIdentificationType;
            theIdentificationType = this.getIdentificationType();
            strategy.appendField(locator, this, "identificationType", buffer, theIdentificationType, (this.identificationType!= null));
        }
        {
            ElementTagType theIdentificationValue;
            theIdentificationValue = this.getIdentificationValue();
            strategy.appendField(locator, this, "identificationValue", buffer, theIdentificationValue, (this.identificationValue!= null));
        }
        {
            ElementTagType theAuthorized;
            theAuthorized = this.getAuthorized();
            strategy.appendField(locator, this, "authorized", buffer, theAuthorized, (this.authorized!= null));
        }
        return buffer;
    }

}
