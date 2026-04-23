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
import jakarta.xml.bind.annotation.XmlElement;
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
 * <p>Java class for TierIncentiveRelationDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TierIncentiveRelationDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tierId" type="{http://docs.eebus.org/spine/xsd/v1}TierIdType" minOccurs="0"/&gt;
 *         &lt;element name="incentiveId" type="{http://docs.eebus.org/spine/xsd/v1}IncentiveIdType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TierIncentiveRelationDataType", propOrder = {
    "tierId",
    "incentiveId"
})
public class TierIncentiveRelationDataType implements Cloneable, CopyTo, ToString
{

    @XmlSchemaType(name = "unsignedInt")
    protected Long tierId;
    @XmlElement(type = Long.class)
    @XmlSchemaType(name = "unsignedInt")
    protected List<Long> incentiveId;

    /**
     * Default no-arg constructor
     * 
     */
    public TierIncentiveRelationDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public TierIncentiveRelationDataType(final Long tierId, final List<Long> incentiveId) {
        this.tierId = tierId;
        this.incentiveId = incentiveId;
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
     * Gets the value of the incentiveId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the incentiveId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncentiveId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getIncentiveId() {
        if (incentiveId == null) {
            incentiveId = new ArrayList<Long>();
        }
        return this.incentiveId;
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
    public TierIncentiveRelationDataType withTierId(Long value) {
        setTierId(value);
        return this;
    }

    /**
     * Adds objects to the list of IncentiveId using add method
     * 
     * @param values
     *     objects to add to the list IncentiveId
     * @return
     *     The class instance
     */
    public TierIncentiveRelationDataType withIncentiveId(Long... values) {
        if (values!= null) {
            for (Long value: values) {
                getIncentiveId().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of IncentiveId using addAll method
     * 
     * @param values
     *     objects to add to the list IncentiveId
     * @return
     *     The class instance
     */
    public TierIncentiveRelationDataType withIncentiveId(Collection<Long> values) {
        if (values!= null) {
            getIncentiveId().addAll(values);
        }
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
        if (draftCopy instanceof TierIncentiveRelationDataType) {
            final TierIncentiveRelationDataType copy = ((TierIncentiveRelationDataType) draftCopy);
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
                Boolean incentiveIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.incentiveId!= null)&&(!this.incentiveId.isEmpty())));
                if (incentiveIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<Long> sourceIncentiveId;
                    sourceIncentiveId = (((this.incentiveId!= null)&&(!this.incentiveId.isEmpty()))?this.getIncentiveId():null);
                    @SuppressWarnings("unchecked")
                    List<Long> copyIncentiveId = ((List<Long> ) strategy.copy(LocatorUtils.property(locator, "incentiveId", sourceIncentiveId), sourceIncentiveId, ((this.incentiveId!= null)&&(!this.incentiveId.isEmpty()))));
                    copy.incentiveId = null;
                    if (copyIncentiveId!= null) {
                        List<Long> uniqueIncentiveIdl = copy.getIncentiveId();
                        uniqueIncentiveIdl.addAll(copyIncentiveId);
                    }
                } else {
                    if (incentiveIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.incentiveId = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new TierIncentiveRelationDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TierIncentiveRelationDataType that = ((TierIncentiveRelationDataType) object);
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
            List<Long> leftIncentiveId;
            leftIncentiveId = (((this.incentiveId!= null)&&(!this.incentiveId.isEmpty()))?this.getIncentiveId():null);
            List<Long> rightIncentiveId;
            rightIncentiveId = (((that.incentiveId!= null)&&(!that.incentiveId.isEmpty()))?that.getIncentiveId():null);
            if ((this.incentiveId!= null)&&(!this.incentiveId.isEmpty())) {
                if ((that.incentiveId!= null)&&(!that.incentiveId.isEmpty())) {
                    if (!leftIncentiveId.equals(rightIncentiveId)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.incentiveId!= null)&&(!that.incentiveId.isEmpty())) {
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
            List<Long> theIncentiveId;
            theIncentiveId = (((this.incentiveId!= null)&&(!this.incentiveId.isEmpty()))?this.getIncentiveId():null);
            if ((this.incentiveId!= null)&&(!this.incentiveId.isEmpty())) {
                currentHashCode += theIncentiveId.hashCode();
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
            List<Long> theIncentiveId;
            theIncentiveId = (((this.incentiveId!= null)&&(!this.incentiveId.isEmpty()))?this.getIncentiveId():null);
            strategy.appendField(locator, this, "incentiveId", buffer, theIncentiveId, ((this.incentiveId!= null)&&(!this.incentiveId.isEmpty())));
        }
        return buffer;
    }

}
