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
 * <p>Java class for BillDescriptionDataElementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BillDescriptionDataElementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="billId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="billWriteable" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="updateRequired" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="supportedBillType" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="sessionId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillDescriptionDataElementsType", propOrder = {
    "billId",
    "billWriteable",
    "updateRequired",
    "supportedBillType",
    "sessionId"
})
public class BillDescriptionDataElementsType implements Cloneable, CopyTo, ToString
{

    protected ElementTagType billId;
    protected ElementTagType billWriteable;
    protected ElementTagType updateRequired;
    protected ElementTagType supportedBillType;
    protected ElementTagType sessionId;

    /**
     * Default no-arg constructor
     * 
     */
    public BillDescriptionDataElementsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public BillDescriptionDataElementsType(final ElementTagType billId, final ElementTagType billWriteable, final ElementTagType updateRequired, final ElementTagType supportedBillType, final ElementTagType sessionId) {
        this.billId = billId;
        this.billWriteable = billWriteable;
        this.updateRequired = updateRequired;
        this.supportedBillType = supportedBillType;
        this.sessionId = sessionId;
    }

    /**
     * Gets the value of the billId property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getBillId() {
        return billId;
    }

    /**
     * Sets the value of the billId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setBillId(ElementTagType value) {
        this.billId = value;
    }

    /**
     * Gets the value of the billWriteable property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getBillWriteable() {
        return billWriteable;
    }

    /**
     * Sets the value of the billWriteable property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setBillWriteable(ElementTagType value) {
        this.billWriteable = value;
    }

    /**
     * Gets the value of the updateRequired property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getUpdateRequired() {
        return updateRequired;
    }

    /**
     * Sets the value of the updateRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setUpdateRequired(ElementTagType value) {
        this.updateRequired = value;
    }

    /**
     * Gets the value of the supportedBillType property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getSupportedBillType() {
        return supportedBillType;
    }

    /**
     * Sets the value of the supportedBillType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setSupportedBillType(ElementTagType value) {
        this.supportedBillType = value;
    }

    /**
     * Gets the value of the sessionId property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getSessionId() {
        return sessionId;
    }

    /**
     * Sets the value of the sessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setSessionId(ElementTagType value) {
        this.sessionId = value;
    }

    /**
     * Sets the value of the billId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public BillDescriptionDataElementsType withBillId(ElementTagType value) {
        setBillId(value);
        return this;
    }

    /**
     * Sets the value of the billWriteable property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public BillDescriptionDataElementsType withBillWriteable(ElementTagType value) {
        setBillWriteable(value);
        return this;
    }

    /**
     * Sets the value of the updateRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public BillDescriptionDataElementsType withUpdateRequired(ElementTagType value) {
        setUpdateRequired(value);
        return this;
    }

    /**
     * Sets the value of the supportedBillType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public BillDescriptionDataElementsType withSupportedBillType(ElementTagType value) {
        setSupportedBillType(value);
        return this;
    }

    /**
     * Sets the value of the sessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public BillDescriptionDataElementsType withSessionId(ElementTagType value) {
        setSessionId(value);
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
        if (draftCopy instanceof BillDescriptionDataElementsType) {
            final BillDescriptionDataElementsType copy = ((BillDescriptionDataElementsType) draftCopy);
            {
                Boolean billIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.billId!= null));
                if (billIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceBillId;
                    sourceBillId = this.getBillId();
                    ElementTagType copyBillId = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "billId", sourceBillId), sourceBillId, (this.billId!= null)));
                    copy.setBillId(copyBillId);
                } else {
                    if (billIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.billId = null;
                    }
                }
            }
            {
                Boolean billWriteableShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.billWriteable!= null));
                if (billWriteableShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceBillWriteable;
                    sourceBillWriteable = this.getBillWriteable();
                    ElementTagType copyBillWriteable = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "billWriteable", sourceBillWriteable), sourceBillWriteable, (this.billWriteable!= null)));
                    copy.setBillWriteable(copyBillWriteable);
                } else {
                    if (billWriteableShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.billWriteable = null;
                    }
                }
            }
            {
                Boolean updateRequiredShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.updateRequired!= null));
                if (updateRequiredShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceUpdateRequired;
                    sourceUpdateRequired = this.getUpdateRequired();
                    ElementTagType copyUpdateRequired = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "updateRequired", sourceUpdateRequired), sourceUpdateRequired, (this.updateRequired!= null)));
                    copy.setUpdateRequired(copyUpdateRequired);
                } else {
                    if (updateRequiredShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.updateRequired = null;
                    }
                }
            }
            {
                Boolean supportedBillTypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.supportedBillType!= null));
                if (supportedBillTypeShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceSupportedBillType;
                    sourceSupportedBillType = this.getSupportedBillType();
                    ElementTagType copySupportedBillType = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "supportedBillType", sourceSupportedBillType), sourceSupportedBillType, (this.supportedBillType!= null)));
                    copy.setSupportedBillType(copySupportedBillType);
                } else {
                    if (supportedBillTypeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.supportedBillType = null;
                    }
                }
            }
            {
                Boolean sessionIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.sessionId!= null));
                if (sessionIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceSessionId;
                    sourceSessionId = this.getSessionId();
                    ElementTagType copySessionId = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "sessionId", sourceSessionId), sourceSessionId, (this.sessionId!= null)));
                    copy.setSessionId(copySessionId);
                } else {
                    if (sessionIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.sessionId = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new BillDescriptionDataElementsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final BillDescriptionDataElementsType that = ((BillDescriptionDataElementsType) object);
        {
            ElementTagType leftBillId;
            leftBillId = this.getBillId();
            ElementTagType rightBillId;
            rightBillId = that.getBillId();
            if (this.billId!= null) {
                if (that.billId!= null) {
                    if (!leftBillId.equals(rightBillId)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.billId!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftBillWriteable;
            leftBillWriteable = this.getBillWriteable();
            ElementTagType rightBillWriteable;
            rightBillWriteable = that.getBillWriteable();
            if (this.billWriteable!= null) {
                if (that.billWriteable!= null) {
                    if (!leftBillWriteable.equals(rightBillWriteable)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.billWriteable!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftUpdateRequired;
            leftUpdateRequired = this.getUpdateRequired();
            ElementTagType rightUpdateRequired;
            rightUpdateRequired = that.getUpdateRequired();
            if (this.updateRequired!= null) {
                if (that.updateRequired!= null) {
                    if (!leftUpdateRequired.equals(rightUpdateRequired)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.updateRequired!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftSupportedBillType;
            leftSupportedBillType = this.getSupportedBillType();
            ElementTagType rightSupportedBillType;
            rightSupportedBillType = that.getSupportedBillType();
            if (this.supportedBillType!= null) {
                if (that.supportedBillType!= null) {
                    if (!leftSupportedBillType.equals(rightSupportedBillType)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.supportedBillType!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftSessionId;
            leftSessionId = this.getSessionId();
            ElementTagType rightSessionId;
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
        return true;
    }

    @Override
    public int hashCode() {
        int currentHashCode = 1;
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theBillId;
            theBillId = this.getBillId();
            if (this.billId!= null) {
                currentHashCode += theBillId.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theBillWriteable;
            theBillWriteable = this.getBillWriteable();
            if (this.billWriteable!= null) {
                currentHashCode += theBillWriteable.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theUpdateRequired;
            theUpdateRequired = this.getUpdateRequired();
            if (this.updateRequired!= null) {
                currentHashCode += theUpdateRequired.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theSupportedBillType;
            theSupportedBillType = this.getSupportedBillType();
            if (this.supportedBillType!= null) {
                currentHashCode += theSupportedBillType.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theSessionId;
            theSessionId = this.getSessionId();
            if (this.sessionId!= null) {
                currentHashCode += theSessionId.hashCode();
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
            ElementTagType theBillId;
            theBillId = this.getBillId();
            strategy.appendField(locator, this, "billId", buffer, theBillId, (this.billId!= null));
        }
        {
            ElementTagType theBillWriteable;
            theBillWriteable = this.getBillWriteable();
            strategy.appendField(locator, this, "billWriteable", buffer, theBillWriteable, (this.billWriteable!= null));
        }
        {
            ElementTagType theUpdateRequired;
            theUpdateRequired = this.getUpdateRequired();
            strategy.appendField(locator, this, "updateRequired", buffer, theUpdateRequired, (this.updateRequired!= null));
        }
        {
            ElementTagType theSupportedBillType;
            theSupportedBillType = this.getSupportedBillType();
            strategy.appendField(locator, this, "supportedBillType", buffer, theSupportedBillType, (this.supportedBillType!= null));
        }
        {
            ElementTagType theSessionId;
            theSessionId = this.getSessionId();
            strategy.appendField(locator, this, "sessionId", buffer, theSessionId, (this.sessionId!= null));
        }
        return buffer;
    }

}
