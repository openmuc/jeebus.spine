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
 * <p>Java class for TimeDistributorDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeDistributorDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="isTimeDistributor" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="distributorPriority" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeDistributorDataType", propOrder = {
    "isTimeDistributor",
    "distributorPriority"
})
public class TimeDistributorDataType implements Cloneable, CopyTo, ToString
{

    protected Boolean isTimeDistributor;
    @XmlSchemaType(name = "unsignedInt")
    protected Long distributorPriority;

    /**
     * Default no-arg constructor
     * 
     */
    public TimeDistributorDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public TimeDistributorDataType(final Boolean isTimeDistributor, final Long distributorPriority) {
        this.isTimeDistributor = isTimeDistributor;
        this.distributorPriority = distributorPriority;
    }

    /**
     * Gets the value of the isTimeDistributor property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getIsTimeDistributor() {
        return isTimeDistributor;
    }

    /**
     * Sets the value of the isTimeDistributor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTimeDistributor(Boolean value) {
        this.isTimeDistributor = value;
    }

    /**
     * Gets the value of the distributorPriority property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDistributorPriority() {
        return distributorPriority;
    }

    /**
     * Sets the value of the distributorPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDistributorPriority(Long value) {
        this.distributorPriority = value;
    }

    /**
     * Sets the value of the isTimeDistributor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     * @return
     *     The class instance
     */
    public TimeDistributorDataType withIsTimeDistributor(Boolean value) {
        setIsTimeDistributor(value);
        return this;
    }

    /**
     * Sets the value of the distributorPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     * @return
     *     The class instance
     */
    public TimeDistributorDataType withDistributorPriority(Long value) {
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
        if (draftCopy instanceof TimeDistributorDataType) {
            final TimeDistributorDataType copy = ((TimeDistributorDataType) draftCopy);
            {
                Boolean isTimeDistributorShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.isTimeDistributor!= null));
                if (isTimeDistributorShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceIsTimeDistributor;
                    sourceIsTimeDistributor = this.getIsTimeDistributor();
                    Boolean copyIsTimeDistributor = ((Boolean) strategy.copy(LocatorUtils.property(locator, "isTimeDistributor", sourceIsTimeDistributor), sourceIsTimeDistributor, (this.isTimeDistributor!= null)));
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
                    Long sourceDistributorPriority;
                    sourceDistributorPriority = this.getDistributorPriority();
                    Long copyDistributorPriority = ((Long) strategy.copy(LocatorUtils.property(locator, "distributorPriority", sourceDistributorPriority), sourceDistributorPriority, (this.distributorPriority!= null)));
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
        return new TimeDistributorDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TimeDistributorDataType that = ((TimeDistributorDataType) object);
        {
            Boolean leftIsTimeDistributor;
            leftIsTimeDistributor = this.getIsTimeDistributor();
            Boolean rightIsTimeDistributor;
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
            Long leftDistributorPriority;
            leftDistributorPriority = this.getDistributorPriority();
            Long rightDistributorPriority;
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
            Boolean theIsTimeDistributor;
            theIsTimeDistributor = this.getIsTimeDistributor();
            if (this.isTimeDistributor!= null) {
                currentHashCode += theIsTimeDistributor.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            Long theDistributorPriority;
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
            Boolean theIsTimeDistributor;
            theIsTimeDistributor = this.getIsTimeDistributor();
            strategy.appendField(locator, this, "isTimeDistributor", buffer, theIsTimeDistributor, (this.isTimeDistributor!= null));
        }
        {
            Long theDistributorPriority;
            theDistributorPriority = this.getDistributorPriority();
            strategy.appendField(locator, this, "distributorPriority", buffer, theDistributorPriority, (this.distributorPriority!= null));
        }
        return buffer;
    }

}
