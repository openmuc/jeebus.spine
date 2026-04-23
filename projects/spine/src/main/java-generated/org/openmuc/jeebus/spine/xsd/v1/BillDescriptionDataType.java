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
 * <p>Java class for BillDescriptionDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BillDescriptionDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="billId" type="{http://docs.eebus.org/spine/xsd/v1}BillIdType" minOccurs="0"/&gt;
 *         &lt;element name="billWriteable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="updateRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="supportedBillType" type="{http://docs.eebus.org/spine/xsd/v1}BillTypeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="sessionId" type="{http://docs.eebus.org/spine/xsd/v1}SessionIdType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillDescriptionDataType", propOrder = {
    "billId",
    "billWriteable",
    "updateRequired",
    "supportedBillType",
    "sessionId"
})
public class BillDescriptionDataType implements Cloneable, CopyTo, ToString
{

    @XmlSchemaType(name = "unsignedInt")
    protected Long billId;
    protected Boolean billWriteable;
    protected Boolean updateRequired;
    protected List<String> supportedBillType;
    @XmlSchemaType(name = "unsignedInt")
    protected Long sessionId;

    /**
     * Default no-arg constructor
     * 
     */
    public BillDescriptionDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public BillDescriptionDataType(final Long billId, final Boolean billWriteable, final Boolean updateRequired, final List<String> supportedBillType, final Long sessionId) {
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
     *     {@link Long }
     *     
     */
    public Long getBillId() {
        return billId;
    }

    /**
     * Sets the value of the billId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBillId(Long value) {
        this.billId = value;
    }

    /**
     * Gets the value of the billWriteable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getBillWriteable() {
        return billWriteable;
    }

    /**
     * Sets the value of the billWriteable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBillWriteable(Boolean value) {
        this.billWriteable = value;
    }

    /**
     * Gets the value of the updateRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getUpdateRequired() {
        return updateRequired;
    }

    /**
     * Sets the value of the updateRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUpdateRequired(Boolean value) {
        this.updateRequired = value;
    }

    /**
     * Gets the value of the supportedBillType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the supportedBillType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupportedBillType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSupportedBillType() {
        if (supportedBillType == null) {
            supportedBillType = new ArrayList<String>();
        }
        return this.supportedBillType;
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
     * Sets the value of the billId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     * @return
     *     The class instance
     */
    public BillDescriptionDataType withBillId(Long value) {
        setBillId(value);
        return this;
    }

    /**
     * Sets the value of the billWriteable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     * @return
     *     The class instance
     */
    public BillDescriptionDataType withBillWriteable(Boolean value) {
        setBillWriteable(value);
        return this;
    }

    /**
     * Sets the value of the updateRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     * @return
     *     The class instance
     */
    public BillDescriptionDataType withUpdateRequired(Boolean value) {
        setUpdateRequired(value);
        return this;
    }

    /**
     * Adds objects to the list of SupportedBillType using add method
     * 
     * @param values
     *     objects to add to the list SupportedBillType
     * @return
     *     The class instance
     */
    public BillDescriptionDataType withSupportedBillType(String... values) {
        if (values!= null) {
            for (String value: values) {
                getSupportedBillType().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of SupportedBillType using addAll method
     * 
     * @param values
     *     objects to add to the list SupportedBillType
     * @return
     *     The class instance
     */
    public BillDescriptionDataType withSupportedBillType(Collection<String> values) {
        if (values!= null) {
            getSupportedBillType().addAll(values);
        }
        return this;
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
    public BillDescriptionDataType withSessionId(Long value) {
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
        if (draftCopy instanceof BillDescriptionDataType) {
            final BillDescriptionDataType copy = ((BillDescriptionDataType) draftCopy);
            {
                Boolean billIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.billId!= null));
                if (billIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceBillId;
                    sourceBillId = this.getBillId();
                    Long copyBillId = ((Long) strategy.copy(LocatorUtils.property(locator, "billId", sourceBillId), sourceBillId, (this.billId!= null)));
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
                    Boolean sourceBillWriteable;
                    sourceBillWriteable = this.getBillWriteable();
                    Boolean copyBillWriteable = ((Boolean) strategy.copy(LocatorUtils.property(locator, "billWriteable", sourceBillWriteable), sourceBillWriteable, (this.billWriteable!= null)));
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
                    Boolean sourceUpdateRequired;
                    sourceUpdateRequired = this.getUpdateRequired();
                    Boolean copyUpdateRequired = ((Boolean) strategy.copy(LocatorUtils.property(locator, "updateRequired", sourceUpdateRequired), sourceUpdateRequired, (this.updateRequired!= null)));
                    copy.setUpdateRequired(copyUpdateRequired);
                } else {
                    if (updateRequiredShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.updateRequired = null;
                    }
                }
            }
            {
                Boolean supportedBillTypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.supportedBillType!= null)&&(!this.supportedBillType.isEmpty())));
                if (supportedBillTypeShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<String> sourceSupportedBillType;
                    sourceSupportedBillType = (((this.supportedBillType!= null)&&(!this.supportedBillType.isEmpty()))?this.getSupportedBillType():null);
                    @SuppressWarnings("unchecked")
                    List<String> copySupportedBillType = ((List<String> ) strategy.copy(LocatorUtils.property(locator, "supportedBillType", sourceSupportedBillType), sourceSupportedBillType, ((this.supportedBillType!= null)&&(!this.supportedBillType.isEmpty()))));
                    copy.supportedBillType = null;
                    if (copySupportedBillType!= null) {
                        List<String> uniqueSupportedBillTypel = copy.getSupportedBillType();
                        uniqueSupportedBillTypel.addAll(copySupportedBillType);
                    }
                } else {
                    if (supportedBillTypeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.supportedBillType = null;
                    }
                }
            }
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
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new BillDescriptionDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final BillDescriptionDataType that = ((BillDescriptionDataType) object);
        {
            Long leftBillId;
            leftBillId = this.getBillId();
            Long rightBillId;
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
            Boolean leftBillWriteable;
            leftBillWriteable = this.getBillWriteable();
            Boolean rightBillWriteable;
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
            Boolean leftUpdateRequired;
            leftUpdateRequired = this.getUpdateRequired();
            Boolean rightUpdateRequired;
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
            List<String> leftSupportedBillType;
            leftSupportedBillType = (((this.supportedBillType!= null)&&(!this.supportedBillType.isEmpty()))?this.getSupportedBillType():null);
            List<String> rightSupportedBillType;
            rightSupportedBillType = (((that.supportedBillType!= null)&&(!that.supportedBillType.isEmpty()))?that.getSupportedBillType():null);
            if ((this.supportedBillType!= null)&&(!this.supportedBillType.isEmpty())) {
                if ((that.supportedBillType!= null)&&(!that.supportedBillType.isEmpty())) {
                    if (!leftSupportedBillType.equals(rightSupportedBillType)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.supportedBillType!= null)&&(!that.supportedBillType.isEmpty())) {
                    return false;
                }
            }
        }
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
        return true;
    }

    @Override
    public int hashCode() {
        int currentHashCode = 1;
        {
            currentHashCode = (currentHashCode* 31);
            Long theBillId;
            theBillId = this.getBillId();
            if (this.billId!= null) {
                currentHashCode += theBillId.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            Boolean theBillWriteable;
            theBillWriteable = this.getBillWriteable();
            if (this.billWriteable!= null) {
                currentHashCode += theBillWriteable.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            Boolean theUpdateRequired;
            theUpdateRequired = this.getUpdateRequired();
            if (this.updateRequired!= null) {
                currentHashCode += theUpdateRequired.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            List<String> theSupportedBillType;
            theSupportedBillType = (((this.supportedBillType!= null)&&(!this.supportedBillType.isEmpty()))?this.getSupportedBillType():null);
            if ((this.supportedBillType!= null)&&(!this.supportedBillType.isEmpty())) {
                currentHashCode += theSupportedBillType.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            Long theSessionId;
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
            Long theBillId;
            theBillId = this.getBillId();
            strategy.appendField(locator, this, "billId", buffer, theBillId, (this.billId!= null));
        }
        {
            Boolean theBillWriteable;
            theBillWriteable = this.getBillWriteable();
            strategy.appendField(locator, this, "billWriteable", buffer, theBillWriteable, (this.billWriteable!= null));
        }
        {
            Boolean theUpdateRequired;
            theUpdateRequired = this.getUpdateRequired();
            strategy.appendField(locator, this, "updateRequired", buffer, theUpdateRequired, (this.updateRequired!= null));
        }
        {
            List<String> theSupportedBillType;
            theSupportedBillType = (((this.supportedBillType!= null)&&(!this.supportedBillType.isEmpty()))?this.getSupportedBillType():null);
            strategy.appendField(locator, this, "supportedBillType", buffer, theSupportedBillType, ((this.supportedBillType!= null)&&(!this.supportedBillType.isEmpty())));
        }
        {
            Long theSessionId;
            theSessionId = this.getSessionId();
            strategy.appendField(locator, this, "sessionId", buffer, theSessionId, (this.sessionId!= null));
        }
        return buffer;
    }

}
