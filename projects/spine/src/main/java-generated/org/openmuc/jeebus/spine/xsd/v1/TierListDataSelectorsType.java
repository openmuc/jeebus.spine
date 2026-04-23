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
 * <p>Java class for TierListDataSelectorsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TierListDataSelectorsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tierId" type="{http://docs.eebus.org/spine/xsd/v1}TierIdType" minOccurs="0"/&gt;
 *         &lt;element name="activeIncentiveId" type="{http://docs.eebus.org/spine/xsd/v1}IncentiveIdType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TierListDataSelectorsType", propOrder = {
    "tierId",
    "activeIncentiveId"
})
public class TierListDataSelectorsType implements Cloneable, CopyTo, ToString
{

    @XmlSchemaType(name = "unsignedInt")
    protected Long tierId;
    @XmlSchemaType(name = "unsignedInt")
    protected Long activeIncentiveId;

    /**
     * Default no-arg constructor
     * 
     */
    public TierListDataSelectorsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public TierListDataSelectorsType(final Long tierId, final Long activeIncentiveId) {
        this.tierId = tierId;
        this.activeIncentiveId = activeIncentiveId;
    }

    /**
     * Gets the value of the tierId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTierId() {
        return tierId;
    }

    /**
     * Sets the value of the tierId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTierId(Long value) {
        this.tierId = value;
    }

    /**
     * Gets the value of the activeIncentiveId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getActiveIncentiveId() {
        return activeIncentiveId;
    }

    /**
     * Sets the value of the activeIncentiveId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setActiveIncentiveId(Long value) {
        this.activeIncentiveId = value;
    }

    /**
     * Sets the value of the tierId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     * @return
     *     The class instance
     */
    public TierListDataSelectorsType withTierId(Long value) {
        setTierId(value);
        return this;
    }

    /**
     * Sets the value of the activeIncentiveId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     * @return
     *     The class instance
     */
    public TierListDataSelectorsType withActiveIncentiveId(Long value) {
        setActiveIncentiveId(value);
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
        if (draftCopy instanceof TierListDataSelectorsType) {
            final TierListDataSelectorsType copy = ((TierListDataSelectorsType) draftCopy);
            {
                Boolean tierIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.tierId!= null));
                if (tierIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceTierId;
                    sourceTierId = this.getTierId();
                    Long copyTierId = ((Long) strategy.copy(LocatorUtils.property(locator, "tierId", sourceTierId), sourceTierId, (this.tierId!= null)));
                    copy.setTierId(copyTierId);
                } else {
                    if (tierIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.tierId = null;
                    }
                }
            }
            {
                Boolean activeIncentiveIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.activeIncentiveId!= null));
                if (activeIncentiveIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceActiveIncentiveId;
                    sourceActiveIncentiveId = this.getActiveIncentiveId();
                    Long copyActiveIncentiveId = ((Long) strategy.copy(LocatorUtils.property(locator, "activeIncentiveId", sourceActiveIncentiveId), sourceActiveIncentiveId, (this.activeIncentiveId!= null)));
                    copy.setActiveIncentiveId(copyActiveIncentiveId);
                } else {
                    if (activeIncentiveIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.activeIncentiveId = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new TierListDataSelectorsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TierListDataSelectorsType that = ((TierListDataSelectorsType) object);
        {
            Long leftTierId;
            leftTierId = this.getTierId();
            Long rightTierId;
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
        {
            Long leftActiveIncentiveId;
            leftActiveIncentiveId = this.getActiveIncentiveId();
            Long rightActiveIncentiveId;
            rightActiveIncentiveId = that.getActiveIncentiveId();
            if (this.activeIncentiveId!= null) {
                if (that.activeIncentiveId!= null) {
                    if (!leftActiveIncentiveId.equals(rightActiveIncentiveId)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.activeIncentiveId!= null) {
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
            Long theTierId;
            theTierId = this.getTierId();
            if (this.tierId!= null) {
                currentHashCode += theTierId.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            Long theActiveIncentiveId;
            theActiveIncentiveId = this.getActiveIncentiveId();
            if (this.activeIncentiveId!= null) {
                currentHashCode += theActiveIncentiveId.hashCode();
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
            Long theTierId;
            theTierId = this.getTierId();
            strategy.appendField(locator, this, "tierId", buffer, theTierId, (this.tierId!= null));
        }
        {
            Long theActiveIncentiveId;
            theActiveIncentiveId = this.getActiveIncentiveId();
            strategy.appendField(locator, this, "activeIncentiveId", buffer, theActiveIncentiveId, (this.activeIncentiveId!= null));
        }
        return buffer;
    }

}
