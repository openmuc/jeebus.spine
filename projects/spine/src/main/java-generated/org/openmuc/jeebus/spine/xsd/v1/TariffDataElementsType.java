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
import jakarta.xml.bind.annotation.XmlSeeAlso;
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
 * <p>Java class for TariffDataElementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TariffDataElementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tariffId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="activeTierId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TariffDataElementsType", propOrder = {
    "tariffId",
    "activeTierId"
})
@XmlSeeAlso({
    org.openmuc.jeebus.spine.xsd.v1.IncentiveTableElementsType.Tariff.class,
    org.openmuc.jeebus.spine.xsd.v1.IncentiveTableConstraintsElementsType.Tariff.class
})
public class TariffDataElementsType implements Cloneable, CopyTo, ToString
{

    protected ElementTagType tariffId;
    protected ElementTagType activeTierId;

    /**
     * Default no-arg constructor
     * 
     */
    public TariffDataElementsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public TariffDataElementsType(final ElementTagType tariffId, final ElementTagType activeTierId) {
        this.tariffId = tariffId;
        this.activeTierId = activeTierId;
    }

    /**
     * Gets the value of the tariffId property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getTariffId() {
        return tariffId;
    }

    /**
     * Sets the value of the tariffId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setTariffId(ElementTagType value) {
        this.tariffId = value;
    }

    /**
     * Gets the value of the activeTierId property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getActiveTierId() {
        return activeTierId;
    }

    /**
     * Sets the value of the activeTierId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setActiveTierId(ElementTagType value) {
        this.activeTierId = value;
    }

    /**
     * Sets the value of the tariffId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public TariffDataElementsType withTariffId(ElementTagType value) {
        setTariffId(value);
        return this;
    }

    /**
     * Sets the value of the activeTierId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public TariffDataElementsType withActiveTierId(ElementTagType value) {
        setActiveTierId(value);
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
        if (draftCopy instanceof TariffDataElementsType) {
            final TariffDataElementsType copy = ((TariffDataElementsType) draftCopy);
            {
                Boolean tariffIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.tariffId!= null));
                if (tariffIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceTariffId;
                    sourceTariffId = this.getTariffId();
                    ElementTagType copyTariffId = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "tariffId", sourceTariffId), sourceTariffId, (this.tariffId!= null)));
                    copy.setTariffId(copyTariffId);
                } else {
                    if (tariffIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.tariffId = null;
                    }
                }
            }
            {
                Boolean activeTierIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.activeTierId!= null));
                if (activeTierIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceActiveTierId;
                    sourceActiveTierId = this.getActiveTierId();
                    ElementTagType copyActiveTierId = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "activeTierId", sourceActiveTierId), sourceActiveTierId, (this.activeTierId!= null)));
                    copy.setActiveTierId(copyActiveTierId);
                } else {
                    if (activeTierIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.activeTierId = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new TariffDataElementsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TariffDataElementsType that = ((TariffDataElementsType) object);
        {
            ElementTagType leftTariffId;
            leftTariffId = this.getTariffId();
            ElementTagType rightTariffId;
            rightTariffId = that.getTariffId();
            if (this.tariffId!= null) {
                if (that.tariffId!= null) {
                    if (!leftTariffId.equals(rightTariffId)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.tariffId!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftActiveTierId;
            leftActiveTierId = this.getActiveTierId();
            ElementTagType rightActiveTierId;
            rightActiveTierId = that.getActiveTierId();
            if (this.activeTierId!= null) {
                if (that.activeTierId!= null) {
                    if (!leftActiveTierId.equals(rightActiveTierId)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.activeTierId!= null) {
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
            ElementTagType theTariffId;
            theTariffId = this.getTariffId();
            if (this.tariffId!= null) {
                currentHashCode += theTariffId.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theActiveTierId;
            theActiveTierId = this.getActiveTierId();
            if (this.activeTierId!= null) {
                currentHashCode += theActiveTierId.hashCode();
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
            ElementTagType theTariffId;
            theTariffId = this.getTariffId();
            strategy.appendField(locator, this, "tariffId", buffer, theTariffId, (this.tariffId!= null));
        }
        {
            ElementTagType theActiveTierId;
            theActiveTierId = this.getActiveTierId();
            strategy.appendField(locator, this, "activeTierId", buffer, theActiveTierId, (this.activeTierId!= null));
        }
        return buffer;
    }

}
