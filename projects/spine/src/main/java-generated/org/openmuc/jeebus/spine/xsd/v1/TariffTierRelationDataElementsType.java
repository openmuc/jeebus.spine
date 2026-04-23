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
 * <p>Java class for TariffTierRelationDataElementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TariffTierRelationDataElementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tariffId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="tierId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TariffTierRelationDataElementsType", propOrder = {
    "tariffId",
    "tierId"
})
public class TariffTierRelationDataElementsType implements Cloneable, CopyTo, ToString
{

    protected ElementTagType tariffId;
    protected ElementTagType tierId;

    /**
     * Default no-arg constructor
     * 
     */
    public TariffTierRelationDataElementsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public TariffTierRelationDataElementsType(final ElementTagType tariffId, final ElementTagType tierId) {
        this.tariffId = tariffId;
        this.tierId = tierId;
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
     * Gets the value of the tierId property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getTierId() {
        return tierId;
    }

    /**
     * Sets the value of the tierId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setTierId(ElementTagType value) {
        this.tierId = value;
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
    public TariffTierRelationDataElementsType withTariffId(ElementTagType value) {
        setTariffId(value);
        return this;
    }

    /**
     * Sets the value of the tierId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public TariffTierRelationDataElementsType withTierId(ElementTagType value) {
        setTierId(value);
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
        if (draftCopy instanceof TariffTierRelationDataElementsType) {
            final TariffTierRelationDataElementsType copy = ((TariffTierRelationDataElementsType) draftCopy);
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
                Boolean tierIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.tierId!= null));
                if (tierIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceTierId;
                    sourceTierId = this.getTierId();
                    ElementTagType copyTierId = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "tierId", sourceTierId), sourceTierId, (this.tierId!= null)));
                    copy.setTierId(copyTierId);
                } else {
                    if (tierIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.tierId = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new TariffTierRelationDataElementsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TariffTierRelationDataElementsType that = ((TariffTierRelationDataElementsType) object);
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
            ElementTagType leftTierId;
            leftTierId = this.getTierId();
            ElementTagType rightTierId;
            rightTierId = that.getTierId();
            if (this.tierId!= null) {
                if (that.tierId!= null) {
                    if (!leftTierId.equals(rightTierId)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.tierId!= null) {
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
            ElementTagType theTierId;
            theTierId = this.getTierId();
            if (this.tierId!= null) {
                currentHashCode += theTierId.hashCode();
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
            ElementTagType theTierId;
            theTierId = this.getTierId();
            strategy.appendField(locator, this, "tierId", buffer, theTierId, (this.tierId!= null));
        }
        return buffer;
    }

}
