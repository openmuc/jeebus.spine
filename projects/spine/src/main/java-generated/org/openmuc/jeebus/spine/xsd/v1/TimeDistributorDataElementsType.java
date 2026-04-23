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
 * <p>Java class for TimeDistributorDataElementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeDistributorDataElementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="isTimeDistributor" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="distributorPriority" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeDistributorDataElementsType", propOrder = {
    "isTimeDistributor",
    "distributorPriority"
})
public class TimeDistributorDataElementsType implements Cloneable, CopyTo, ToString
{

    protected ElementTagType isTimeDistributor;
    protected ElementTagType distributorPriority;

    /**
     * Default no-arg constructor
     * 
     */
    public TimeDistributorDataElementsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public TimeDistributorDataElementsType(final ElementTagType isTimeDistributor, final ElementTagType distributorPriority) {
        this.isTimeDistributor = isTimeDistributor;
        this.distributorPriority = distributorPriority;
    }

    /**
     * Gets the value of the isTimeDistributor property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getIsTimeDistributor() {
        return isTimeDistributor;
    }

    /**
     * Sets the value of the isTimeDistributor property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setIsTimeDistributor(ElementTagType value) {
        this.isTimeDistributor = value;
    }

    /**
     * Gets the value of the distributorPriority property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getDistributorPriority() {
        return distributorPriority;
    }

    /**
     * Sets the value of the distributorPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setDistributorPriority(ElementTagType value) {
        this.distributorPriority = value;
    }

    /**
     * Sets the value of the isTimeDistributor property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public TimeDistributorDataElementsType withIsTimeDistributor(ElementTagType value) {
        setIsTimeDistributor(value);
        return this;
    }

    /**
     * Sets the value of the distributorPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public TimeDistributorDataElementsType withDistributorPriority(ElementTagType value) {
        setDistributorPriority(value);
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
        if (draftCopy instanceof TimeDistributorDataElementsType) {
            final TimeDistributorDataElementsType copy = ((TimeDistributorDataElementsType) draftCopy);
            {
                Boolean isTimeDistributorShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.isTimeDistributor!= null));
                if (isTimeDistributorShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceIsTimeDistributor;
                    sourceIsTimeDistributor = this.getIsTimeDistributor();
                    ElementTagType copyIsTimeDistributor = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "isTimeDistributor", sourceIsTimeDistributor), sourceIsTimeDistributor, (this.isTimeDistributor!= null)));
                    copy.setIsTimeDistributor(copyIsTimeDistributor);
                } else {
                    if (isTimeDistributorShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.isTimeDistributor = null;
                    }
                }
            }
            {
                Boolean distributorPriorityShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.distributorPriority!= null));
                if (distributorPriorityShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceDistributorPriority;
                    sourceDistributorPriority = this.getDistributorPriority();
                    ElementTagType copyDistributorPriority = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "distributorPriority", sourceDistributorPriority), sourceDistributorPriority, (this.distributorPriority!= null)));
                    copy.setDistributorPriority(copyDistributorPriority);
                } else {
                    if (distributorPriorityShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.distributorPriority = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new TimeDistributorDataElementsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TimeDistributorDataElementsType that = ((TimeDistributorDataElementsType) object);
        {
            ElementTagType leftIsTimeDistributor;
            leftIsTimeDistributor = this.getIsTimeDistributor();
            ElementTagType rightIsTimeDistributor;
            rightIsTimeDistributor = that.getIsTimeDistributor();
            if (this.isTimeDistributor!= null) {
                if (that.isTimeDistributor!= null) {
                    if (!leftIsTimeDistributor.equals(rightIsTimeDistributor)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.isTimeDistributor!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftDistributorPriority;
            leftDistributorPriority = this.getDistributorPriority();
            ElementTagType rightDistributorPriority;
            rightDistributorPriority = that.getDistributorPriority();
            if (this.distributorPriority!= null) {
                if (that.distributorPriority!= null) {
                    if (!leftDistributorPriority.equals(rightDistributorPriority)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.distributorPriority!= null) {
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
            ElementTagType theIsTimeDistributor;
            theIsTimeDistributor = this.getIsTimeDistributor();
            if (this.isTimeDistributor!= null) {
                currentHashCode += theIsTimeDistributor.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theDistributorPriority;
            theDistributorPriority = this.getDistributorPriority();
            if (this.distributorPriority!= null) {
                currentHashCode += theDistributorPriority.hashCode();
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
            ElementTagType theIsTimeDistributor;
            theIsTimeDistributor = this.getIsTimeDistributor();
            strategy.appendField(locator, this, "isTimeDistributor", buffer, theIsTimeDistributor, (this.isTimeDistributor!= null));
        }
        {
            ElementTagType theDistributorPriority;
            theDistributorPriority = this.getDistributorPriority();
            strategy.appendField(locator, this, "distributorPriority", buffer, theDistributorPriority, (this.distributorPriority!= null));
        }
        return buffer;
    }

}
