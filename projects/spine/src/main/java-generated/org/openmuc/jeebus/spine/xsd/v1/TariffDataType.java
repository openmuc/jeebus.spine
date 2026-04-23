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
 * <p>Java class for TariffDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TariffDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tariffId" type="{http://docs.eebus.org/spine/xsd/v1}TariffIdType" minOccurs="0"/&gt;
 *         &lt;element name="activeTierId" type="{http://docs.eebus.org/spine/xsd/v1}TierIdType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TariffDataType", propOrder = {
    "tariffId",
    "activeTierId"
})
@XmlSeeAlso({
    org.openmuc.jeebus.spine.xsd.v1.IncentiveTableType.Tariff.class,
    org.openmuc.jeebus.spine.xsd.v1.IncentiveTableConstraintsType.Tariff.class
})
public class TariffDataType implements Cloneable, CopyTo, ToString
{

    @XmlSchemaType(name = "unsignedInt")
    protected Long tariffId;
    @XmlElement(type = Long.class)
    @XmlSchemaType(name = "unsignedInt")
    protected List<Long> activeTierId;

    /**
     * Default no-arg constructor
     * 
     */
    public TariffDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public TariffDataType(final Long tariffId, final List<Long> activeTierId) {
        this.tariffId = tariffId;
        this.activeTierId = activeTierId;
    }

    /**
     * Gets the value of the tariffId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTariffId() {
        return tariffId;
    }

    /**
     * Sets the value of the tariffId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTariffId(Long value) {
        this.tariffId = value;
    }

    /**
     * Gets the value of the activeTierId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the activeTierId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActiveTierId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getActiveTierId() {
        if (activeTierId == null) {
            activeTierId = new ArrayList<Long>();
        }
        return this.activeTierId;
    }

    /**
     * Sets the value of the tariffId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     * @return
     *     The class instance
     */
    public TariffDataType withTariffId(Long value) {
        setTariffId(value);
        return this;
    }

    /**
     * Adds objects to the list of ActiveTierId using add method
     * 
     * @param values
     *     objects to add to the list ActiveTierId
     * @return
     *     The class instance
     */
    public TariffDataType withActiveTierId(Long... values) {
        if (values!= null) {
            for (Long value: values) {
                getActiveTierId().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of ActiveTierId using addAll method
     * 
     * @param values
     *     objects to add to the list ActiveTierId
     * @return
     *     The class instance
     */
    public TariffDataType withActiveTierId(Collection<Long> values) {
        if (values!= null) {
            getActiveTierId().addAll(values);
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
        if (draftCopy instanceof TariffDataType) {
            final TariffDataType copy = ((TariffDataType) draftCopy);
            {
                Boolean tariffIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.tariffId!= null));
                if (tariffIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceTariffId;
                    sourceTariffId = this.getTariffId();
                    Long copyTariffId = ((Long) strategy.copy(LocatorUtils.property(locator, "tariffId", sourceTariffId), sourceTariffId, (this.tariffId!= null)));
                    copy.setTariffId(copyTariffId);
                } else {
                    if (tariffIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.tariffId = null;
                    }
                }
            }
            {
                Boolean activeTierIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.activeTierId!= null)&&(!this.activeTierId.isEmpty())));
                if (activeTierIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<Long> sourceActiveTierId;
                    sourceActiveTierId = (((this.activeTierId!= null)&&(!this.activeTierId.isEmpty()))?this.getActiveTierId():null);
                    @SuppressWarnings("unchecked")
                    List<Long> copyActiveTierId = ((List<Long> ) strategy.copy(LocatorUtils.property(locator, "activeTierId", sourceActiveTierId), sourceActiveTierId, ((this.activeTierId!= null)&&(!this.activeTierId.isEmpty()))));
                    copy.activeTierId = null;
                    if (copyActiveTierId!= null) {
                        List<Long> uniqueActiveTierIdl = copy.getActiveTierId();
                        uniqueActiveTierIdl.addAll(copyActiveTierId);
                    }
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
        return new TariffDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TariffDataType that = ((TariffDataType) object);
        {
            Long leftTariffId;
            leftTariffId = this.getTariffId();
            Long rightTariffId;
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
            List<Long> leftActiveTierId;
            leftActiveTierId = (((this.activeTierId!= null)&&(!this.activeTierId.isEmpty()))?this.getActiveTierId():null);
            List<Long> rightActiveTierId;
            rightActiveTierId = (((that.activeTierId!= null)&&(!that.activeTierId.isEmpty()))?that.getActiveTierId():null);
            if ((this.activeTierId!= null)&&(!this.activeTierId.isEmpty())) {
                if ((that.activeTierId!= null)&&(!that.activeTierId.isEmpty())) {
                    if (!leftActiveTierId.equals(rightActiveTierId)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.activeTierId!= null)&&(!that.activeTierId.isEmpty())) {
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
            Long theTariffId;
            theTariffId = this.getTariffId();
            if (this.tariffId!= null) {
                currentHashCode += theTariffId.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            List<Long> theActiveTierId;
            theActiveTierId = (((this.activeTierId!= null)&&(!this.activeTierId.isEmpty()))?this.getActiveTierId():null);
            if ((this.activeTierId!= null)&&(!this.activeTierId.isEmpty())) {
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
            Long theTariffId;
            theTariffId = this.getTariffId();
            strategy.appendField(locator, this, "tariffId", buffer, theTariffId, (this.tariffId!= null));
        }
        {
            List<Long> theActiveTierId;
            theActiveTierId = (((this.activeTierId!= null)&&(!this.activeTierId.isEmpty()))?this.getActiveTierId():null);
            strategy.appendField(locator, this, "activeTierId", buffer, theActiveTierId, ((this.activeTierId!= null)&&(!this.activeTierId.isEmpty())));
        }
        return buffer;
    }

}
