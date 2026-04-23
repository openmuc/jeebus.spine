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
 * <p>Java class for TariffBoundaryRelationDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TariffBoundaryRelationDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tariffId" type="{http://docs.eebus.org/spine/xsd/v1}TariffIdType" minOccurs="0"/&gt;
 *         &lt;element name="boundaryId" type="{http://docs.eebus.org/spine/xsd/v1}TierBoundaryIdType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TariffBoundaryRelationDataType", propOrder = {
    "tariffId",
    "boundaryId"
})
public class TariffBoundaryRelationDataType implements Cloneable, CopyTo, ToString
{

    @XmlSchemaType(name = "unsignedInt")
    protected Long tariffId;
    @XmlElement(type = Long.class)
    @XmlSchemaType(name = "unsignedInt")
    protected List<Long> boundaryId;

    /**
     * Default no-arg constructor
     * 
     */
    public TariffBoundaryRelationDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public TariffBoundaryRelationDataType(final Long tariffId, final List<Long> boundaryId) {
        this.tariffId = tariffId;
        this.boundaryId = boundaryId;
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
     * Gets the value of the boundaryId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the boundaryId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBoundaryId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getBoundaryId() {
        if (boundaryId == null) {
            boundaryId = new ArrayList<Long>();
        }
        return this.boundaryId;
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
    public TariffBoundaryRelationDataType withTariffId(Long value) {
        setTariffId(value);
        return this;
    }

    /**
     * Adds objects to the list of BoundaryId using add method
     * 
     * @param values
     *     objects to add to the list BoundaryId
     * @return
     *     The class instance
     */
    public TariffBoundaryRelationDataType withBoundaryId(Long... values) {
        if (values!= null) {
            for (Long value: values) {
                getBoundaryId().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of BoundaryId using addAll method
     * 
     * @param values
     *     objects to add to the list BoundaryId
     * @return
     *     The class instance
     */
    public TariffBoundaryRelationDataType withBoundaryId(Collection<Long> values) {
        if (values!= null) {
            getBoundaryId().addAll(values);
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
        if (draftCopy instanceof TariffBoundaryRelationDataType) {
            final TariffBoundaryRelationDataType copy = ((TariffBoundaryRelationDataType) draftCopy);
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
                Boolean boundaryIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.boundaryId!= null)&&(!this.boundaryId.isEmpty())));
                if (boundaryIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<Long> sourceBoundaryId;
                    sourceBoundaryId = (((this.boundaryId!= null)&&(!this.boundaryId.isEmpty()))?this.getBoundaryId():null);
                    @SuppressWarnings("unchecked")
                    List<Long> copyBoundaryId = ((List<Long> ) strategy.copy(LocatorUtils.property(locator, "boundaryId", sourceBoundaryId), sourceBoundaryId, ((this.boundaryId!= null)&&(!this.boundaryId.isEmpty()))));
                    copy.boundaryId = null;
                    if (copyBoundaryId!= null) {
                        List<Long> uniqueBoundaryIdl = copy.getBoundaryId();
                        uniqueBoundaryIdl.addAll(copyBoundaryId);
                    }
                } else {
                    if (boundaryIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.boundaryId = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new TariffBoundaryRelationDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TariffBoundaryRelationDataType that = ((TariffBoundaryRelationDataType) object);
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
            List<Long> leftBoundaryId;
            leftBoundaryId = (((this.boundaryId!= null)&&(!this.boundaryId.isEmpty()))?this.getBoundaryId():null);
            List<Long> rightBoundaryId;
            rightBoundaryId = (((that.boundaryId!= null)&&(!that.boundaryId.isEmpty()))?that.getBoundaryId():null);
            if ((this.boundaryId!= null)&&(!this.boundaryId.isEmpty())) {
                if ((that.boundaryId!= null)&&(!that.boundaryId.isEmpty())) {
                    if (!leftBoundaryId.equals(rightBoundaryId)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.boundaryId!= null)&&(!that.boundaryId.isEmpty())) {
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
            List<Long> theBoundaryId;
            theBoundaryId = (((this.boundaryId!= null)&&(!this.boundaryId.isEmpty()))?this.getBoundaryId():null);
            if ((this.boundaryId!= null)&&(!this.boundaryId.isEmpty())) {
                currentHashCode += theBoundaryId.hashCode();
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
            List<Long> theBoundaryId;
            theBoundaryId = (((this.boundaryId!= null)&&(!this.boundaryId.isEmpty()))?this.getBoundaryId():null);
            strategy.appendField(locator, this, "boundaryId", buffer, theBoundaryId, ((this.boundaryId!= null)&&(!this.boundaryId.isEmpty())));
        }
        return buffer;
    }

}
