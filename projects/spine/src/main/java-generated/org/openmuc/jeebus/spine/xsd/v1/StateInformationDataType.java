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
 * <p>Java class for StateInformationDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StateInformationDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="stateInformationId" type="{http://docs.eebus.org/spine/xsd/v1}stateInformationIdType" minOccurs="0"/&gt;
 *         &lt;element name="stateInformation" type="{http://docs.eebus.org/spine/xsd/v1}StateInformationType" minOccurs="0"/&gt;
 *         &lt;element name="isActive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="category" type="{http://docs.eebus.org/spine/xsd/v1}StateInformationCategoryType" minOccurs="0"/&gt;
 *         &lt;element name="timeOfLastChange" type="{http://docs.eebus.org/spine/xsd/v1}AbsoluteOrRelativeTimeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StateInformationDataType", propOrder = {
    "stateInformationId",
    "stateInformation",
    "isActive",
    "category",
    "timeOfLastChange"
})
public class StateInformationDataType implements Cloneable, CopyTo, ToString
{

    @XmlSchemaType(name = "unsignedInt")
    protected Long stateInformationId;
    protected String stateInformation;
    protected Boolean isActive;
    protected String category;
    protected String timeOfLastChange;

    /**
     * Default no-arg constructor
     * 
     */
    public StateInformationDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public StateInformationDataType(final Long stateInformationId, final String stateInformation, final Boolean isActive, final String category, final String timeOfLastChange) {
        this.stateInformationId = stateInformationId;
        this.stateInformation = stateInformation;
        this.isActive = isActive;
        this.category = category;
        this.timeOfLastChange = timeOfLastChange;
    }

    /**
     * Gets the value of the stateInformationId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getStateInformationId() {
        return stateInformationId;
    }

    /**
     * Sets the value of the stateInformationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setStateInformationId(Long value) {
        this.stateInformationId = value;
    }

    /**
     * Gets the value of the stateInformation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateInformation() {
        return stateInformation;
    }

    /**
     * Sets the value of the stateInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateInformation(String value) {
        this.stateInformation = value;
    }

    /**
     * Gets the value of the isActive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getIsActive() {
        return isActive;
    }

    /**
     * Sets the value of the isActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsActive(Boolean value) {
        this.isActive = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
    }

    /**
     * Gets the value of the timeOfLastChange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeOfLastChange() {
        return timeOfLastChange;
    }

    /**
     * Sets the value of the timeOfLastChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeOfLastChange(String value) {
        this.timeOfLastChange = value;
    }

    /**
     * Sets the value of the stateInformationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     * @return
     *     The class instance
     */
    public StateInformationDataType withStateInformationId(Long value) {
        setStateInformationId(value);
        return this;
    }

    /**
     * Sets the value of the stateInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public StateInformationDataType withStateInformation(String value) {
        setStateInformation(value);
        return this;
    }

    /**
     * Sets the value of the isActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     * @return
     *     The class instance
     */
    public StateInformationDataType withIsActive(Boolean value) {
        setIsActive(value);
        return this;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public StateInformationDataType withCategory(String value) {
        setCategory(value);
        return this;
    }

    /**
     * Sets the value of the timeOfLastChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public StateInformationDataType withTimeOfLastChange(String value) {
        setTimeOfLastChange(value);
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
        if (draftCopy instanceof StateInformationDataType) {
            final StateInformationDataType copy = ((StateInformationDataType) draftCopy);
            {
                Boolean stateInformationIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.stateInformationId!= null));
                if (stateInformationIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceStateInformationId;
                    sourceStateInformationId = this.getStateInformationId();
                    Long copyStateInformationId = ((Long) strategy.copy(LocatorUtils.property(locator, "stateInformationId", sourceStateInformationId), sourceStateInformationId, (this.stateInformationId!= null)));
                    copy.setStateInformationId(copyStateInformationId);
                } else {
                    if (stateInformationIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.stateInformationId = null;
                    }
                }
            }
            {
                Boolean stateInformationShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.stateInformation!= null));
                if (stateInformationShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceStateInformation;
                    sourceStateInformation = this.getStateInformation();
                    String copyStateInformation = ((String) strategy.copy(LocatorUtils.property(locator, "stateInformation", sourceStateInformation), sourceStateInformation, (this.stateInformation!= null)));
                    copy.setStateInformation(copyStateInformation);
                } else {
                    if (stateInformationShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.stateInformation = null;
                    }
                }
            }
            {
                Boolean isActiveShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.isActive!= null));
                if (isActiveShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceIsActive;
                    sourceIsActive = this.getIsActive();
                    Boolean copyIsActive = ((Boolean) strategy.copy(LocatorUtils.property(locator, "isActive", sourceIsActive), sourceIsActive, (this.isActive!= null)));
                    copy.setIsActive(copyIsActive);
                } else {
                    if (isActiveShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.isActive = null;
                    }
                }
            }
            {
                Boolean categoryShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.category!= null));
                if (categoryShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceCategory;
                    sourceCategory = this.getCategory();
                    String copyCategory = ((String) strategy.copy(LocatorUtils.property(locator, "category", sourceCategory), sourceCategory, (this.category!= null)));
                    copy.setCategory(copyCategory);
                } else {
                    if (categoryShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.category = null;
                    }
                }
            }
            {
                Boolean timeOfLastChangeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.timeOfLastChange!= null));
                if (timeOfLastChangeShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceTimeOfLastChange;
                    sourceTimeOfLastChange = this.getTimeOfLastChange();
                    String copyTimeOfLastChange = ((String) strategy.copy(LocatorUtils.property(locator, "timeOfLastChange", sourceTimeOfLastChange), sourceTimeOfLastChange, (this.timeOfLastChange!= null)));
                    copy.setTimeOfLastChange(copyTimeOfLastChange);
                } else {
                    if (timeOfLastChangeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.timeOfLastChange = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new StateInformationDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final StateInformationDataType that = ((StateInformationDataType) object);
        {
            Long leftStateInformationId;
            leftStateInformationId = this.getStateInformationId();
            Long rightStateInformationId;
            rightStateInformationId = that.getStateInformationId();
            if (this.stateInformationId!= null) {
                if (that.stateInformationId!= null) {
                    if (!leftStateInformationId.equals(rightStateInformationId)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.stateInformationId!= null) {
                    return false;
                }
            }
        }
        {
            String leftStateInformation;
            leftStateInformation = this.getStateInformation();
            String rightStateInformation;
            rightStateInformation = that.getStateInformation();
            if (this.stateInformation!= null) {
                if (that.stateInformation!= null) {
                    if (!leftStateInformation.equals(rightStateInformation)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.stateInformation!= null) {
                    return false;
                }
            }
        }
        {
            Boolean leftIsActive;
            leftIsActive = this.getIsActive();
            Boolean rightIsActive;
            rightIsActive = that.getIsActive();
            if (this.isActive!= null) {
                if (that.isActive!= null) {
                    if (!leftIsActive.equals(rightIsActive)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.isActive!= null) {
                    return false;
                }
            }
        }
        {
            String leftCategory;
            leftCategory = this.getCategory();
            String rightCategory;
            rightCategory = that.getCategory();
            if (this.category!= null) {
                if (that.category!= null) {
                    if (!leftCategory.equals(rightCategory)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.category!= null) {
                    return false;
                }
            }
        }
        {
            String leftTimeOfLastChange;
            leftTimeOfLastChange = this.getTimeOfLastChange();
            String rightTimeOfLastChange;
            rightTimeOfLastChange = that.getTimeOfLastChange();
            if (this.timeOfLastChange!= null) {
                if (that.timeOfLastChange!= null) {
                    if (!leftTimeOfLastChange.equals(rightTimeOfLastChange)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.timeOfLastChange!= null) {
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
            Long theStateInformationId;
            theStateInformationId = this.getStateInformationId();
            if (this.stateInformationId!= null) {
                currentHashCode += theStateInformationId.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String theStateInformation;
            theStateInformation = this.getStateInformation();
            if (this.stateInformation!= null) {
                currentHashCode += theStateInformation.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            Boolean theIsActive;
            theIsActive = this.getIsActive();
            if (this.isActive!= null) {
                currentHashCode += theIsActive.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String theCategory;
            theCategory = this.getCategory();
            if (this.category!= null) {
                currentHashCode += theCategory.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String theTimeOfLastChange;
            theTimeOfLastChange = this.getTimeOfLastChange();
            if (this.timeOfLastChange!= null) {
                currentHashCode += theTimeOfLastChange.hashCode();
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
            Long theStateInformationId;
            theStateInformationId = this.getStateInformationId();
            strategy.appendField(locator, this, "stateInformationId", buffer, theStateInformationId, (this.stateInformationId!= null));
        }
        {
            String theStateInformation;
            theStateInformation = this.getStateInformation();
            strategy.appendField(locator, this, "stateInformation", buffer, theStateInformation, (this.stateInformation!= null));
        }
        {
            Boolean theIsActive;
            theIsActive = this.getIsActive();
            strategy.appendField(locator, this, "isActive", buffer, theIsActive, (this.isActive!= null));
        }
        {
            String theCategory;
            theCategory = this.getCategory();
            strategy.appendField(locator, this, "category", buffer, theCategory, (this.category!= null));
        }
        {
            String theTimeOfLastChange;
            theTimeOfLastChange = this.getTimeOfLastChange();
            strategy.appendField(locator, this, "timeOfLastChange", buffer, theTimeOfLastChange, (this.timeOfLastChange!= null));
        }
        return buffer;
    }

}
