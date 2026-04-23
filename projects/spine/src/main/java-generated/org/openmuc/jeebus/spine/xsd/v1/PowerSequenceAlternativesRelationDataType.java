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
 * <p>Java class for PowerSequenceAlternativesRelationDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PowerSequenceAlternativesRelationDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="alternativesId" type="{http://docs.eebus.org/spine/xsd/v1}AlternativesIdType" minOccurs="0"/&gt;
 *         &lt;element name="sequenceId" type="{http://docs.eebus.org/spine/xsd/v1}PowerSequenceIdType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PowerSequenceAlternativesRelationDataType", propOrder = {
    "alternativesId",
    "sequenceId"
})
@XmlSeeAlso({
    SmartEnergyManagementPsAlternativesRelationType.class
})
public class PowerSequenceAlternativesRelationDataType implements Cloneable, CopyTo, ToString
{

    @XmlSchemaType(name = "unsignedInt")
    protected Long alternativesId;
    @XmlElement(type = Long.class)
    @XmlSchemaType(name = "unsignedInt")
    protected List<Long> sequenceId;

    /**
     * Default no-arg constructor
     * 
     */
    public PowerSequenceAlternativesRelationDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public PowerSequenceAlternativesRelationDataType(final Long alternativesId, final List<Long> sequenceId) {
        this.alternativesId = alternativesId;
        this.sequenceId = sequenceId;
    }

    /**
     * Gets the value of the alternativesId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAlternativesId() {
        return alternativesId;
    }

    /**
     * Sets the value of the alternativesId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAlternativesId(Long value) {
        this.alternativesId = value;
    }

    /**
     * Gets the value of the sequenceId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the sequenceId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSequenceId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getSequenceId() {
        if (sequenceId == null) {
            sequenceId = new ArrayList<Long>();
        }
        return this.sequenceId;
    }

    /**
     * Sets the value of the alternativesId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     * @return
     *     The class instance
     */
    public PowerSequenceAlternativesRelationDataType withAlternativesId(Long value) {
        setAlternativesId(value);
        return this;
    }

    /**
     * Adds objects to the list of SequenceId using add method
     * 
     * @param values
     *     objects to add to the list SequenceId
     * @return
     *     The class instance
     */
    public PowerSequenceAlternativesRelationDataType withSequenceId(Long... values) {
        if (values!= null) {
            for (Long value: values) {
                getSequenceId().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of SequenceId using addAll method
     * 
     * @param values
     *     objects to add to the list SequenceId
     * @return
     *     The class instance
     */
    public PowerSequenceAlternativesRelationDataType withSequenceId(Collection<Long> values) {
        if (values!= null) {
            getSequenceId().addAll(values);
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
        if (draftCopy instanceof PowerSequenceAlternativesRelationDataType) {
            final PowerSequenceAlternativesRelationDataType copy = ((PowerSequenceAlternativesRelationDataType) draftCopy);
            {
                Boolean alternativesIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.alternativesId!= null));
                if (alternativesIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceAlternativesId;
                    sourceAlternativesId = this.getAlternativesId();
                    Long copyAlternativesId = ((Long) strategy.copy(LocatorUtils.property(locator, "alternativesId", sourceAlternativesId), sourceAlternativesId, (this.alternativesId!= null)));
                    copy.setAlternativesId(copyAlternativesId);
                } else {
                    if (alternativesIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.alternativesId = null;
                    }
                }
            }
            {
                Boolean sequenceIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.sequenceId!= null)&&(!this.sequenceId.isEmpty())));
                if (sequenceIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<Long> sourceSequenceId;
                    sourceSequenceId = (((this.sequenceId!= null)&&(!this.sequenceId.isEmpty()))?this.getSequenceId():null);
                    @SuppressWarnings("unchecked")
                    List<Long> copySequenceId = ((List<Long> ) strategy.copy(LocatorUtils.property(locator, "sequenceId", sourceSequenceId), sourceSequenceId, ((this.sequenceId!= null)&&(!this.sequenceId.isEmpty()))));
                    copy.sequenceId = null;
                    if (copySequenceId!= null) {
                        List<Long> uniqueSequenceIdl = copy.getSequenceId();
                        uniqueSequenceIdl.addAll(copySequenceId);
                    }
                } else {
                    if (sequenceIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.sequenceId = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new PowerSequenceAlternativesRelationDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final PowerSequenceAlternativesRelationDataType that = ((PowerSequenceAlternativesRelationDataType) object);
        {
            Long leftAlternativesId;
            leftAlternativesId = this.getAlternativesId();
            Long rightAlternativesId;
            rightAlternativesId = that.getAlternativesId();
            if (this.alternativesId!= null) {
                if (that.alternativesId!= null) {
                    if (!leftAlternativesId.equals(rightAlternativesId)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.alternativesId!= null) {
                    return false;
                }
            }
        }
        {
            List<Long> leftSequenceId;
            leftSequenceId = (((this.sequenceId!= null)&&(!this.sequenceId.isEmpty()))?this.getSequenceId():null);
            List<Long> rightSequenceId;
            rightSequenceId = (((that.sequenceId!= null)&&(!that.sequenceId.isEmpty()))?that.getSequenceId():null);
            if ((this.sequenceId!= null)&&(!this.sequenceId.isEmpty())) {
                if ((that.sequenceId!= null)&&(!that.sequenceId.isEmpty())) {
                    if (!leftSequenceId.equals(rightSequenceId)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.sequenceId!= null)&&(!that.sequenceId.isEmpty())) {
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
            Long theAlternativesId;
            theAlternativesId = this.getAlternativesId();
            if (this.alternativesId!= null) {
                currentHashCode += theAlternativesId.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            List<Long> theSequenceId;
            theSequenceId = (((this.sequenceId!= null)&&(!this.sequenceId.isEmpty()))?this.getSequenceId():null);
            if ((this.sequenceId!= null)&&(!this.sequenceId.isEmpty())) {
                currentHashCode += theSequenceId.hashCode();
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
            Long theAlternativesId;
            theAlternativesId = this.getAlternativesId();
            strategy.appendField(locator, this, "alternativesId", buffer, theAlternativesId, (this.alternativesId!= null));
        }
        {
            List<Long> theSequenceId;
            theSequenceId = (((this.sequenceId!= null)&&(!this.sequenceId.isEmpty()))?this.getSequenceId():null);
            strategy.appendField(locator, this, "sequenceId", buffer, theSequenceId, ((this.sequenceId!= null)&&(!this.sequenceId.isEmpty())));
        }
        return buffer;
    }

}
