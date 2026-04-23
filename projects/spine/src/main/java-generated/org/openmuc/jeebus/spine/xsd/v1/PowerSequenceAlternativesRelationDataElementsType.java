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
 * <p>Java class for PowerSequenceAlternativesRelationDataElementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PowerSequenceAlternativesRelationDataElementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="alternativesId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="sequenceId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PowerSequenceAlternativesRelationDataElementsType", propOrder = {
    "alternativesId",
    "sequenceId"
})
@XmlSeeAlso({
    SmartEnergyManagementPsAlternativesRelationElementsType.class
})
public class PowerSequenceAlternativesRelationDataElementsType implements Cloneable, CopyTo, ToString
{

    protected ElementTagType alternativesId;
    protected ElementTagType sequenceId;

    /**
     * Default no-arg constructor
     * 
     */
    public PowerSequenceAlternativesRelationDataElementsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public PowerSequenceAlternativesRelationDataElementsType(final ElementTagType alternativesId, final ElementTagType sequenceId) {
        this.alternativesId = alternativesId;
        this.sequenceId = sequenceId;
    }

    /**
     * Gets the value of the alternativesId property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getAlternativesId() {
        return alternativesId;
    }

    /**
     * Sets the value of the alternativesId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setAlternativesId(ElementTagType value) {
        this.alternativesId = value;
    }

    /**
     * Gets the value of the sequenceId property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getSequenceId() {
        return sequenceId;
    }

    /**
     * Sets the value of the sequenceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setSequenceId(ElementTagType value) {
        this.sequenceId = value;
    }

    /**
     * Sets the value of the alternativesId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public PowerSequenceAlternativesRelationDataElementsType withAlternativesId(ElementTagType value) {
        setAlternativesId(value);
        return this;
    }

    /**
     * Sets the value of the sequenceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public PowerSequenceAlternativesRelationDataElementsType withSequenceId(ElementTagType value) {
        setSequenceId(value);
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
        if (draftCopy instanceof PowerSequenceAlternativesRelationDataElementsType) {
            final PowerSequenceAlternativesRelationDataElementsType copy = ((PowerSequenceAlternativesRelationDataElementsType) draftCopy);
            {
                Boolean alternativesIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.alternativesId!= null));
                if (alternativesIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceAlternativesId;
                    sourceAlternativesId = this.getAlternativesId();
                    ElementTagType copyAlternativesId = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "alternativesId", sourceAlternativesId), sourceAlternativesId, (this.alternativesId!= null)));
                    copy.setAlternativesId(copyAlternativesId);
                } else {
                    if (alternativesIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.alternativesId = null;
                    }
                }
            }
            {
                Boolean sequenceIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.sequenceId!= null));
                if (sequenceIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceSequenceId;
                    sourceSequenceId = this.getSequenceId();
                    ElementTagType copySequenceId = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "sequenceId", sourceSequenceId), sourceSequenceId, (this.sequenceId!= null)));
                    copy.setSequenceId(copySequenceId);
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
        return new PowerSequenceAlternativesRelationDataElementsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final PowerSequenceAlternativesRelationDataElementsType that = ((PowerSequenceAlternativesRelationDataElementsType) object);
        {
            ElementTagType leftAlternativesId;
            leftAlternativesId = this.getAlternativesId();
            ElementTagType rightAlternativesId;
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
            ElementTagType leftSequenceId;
            leftSequenceId = this.getSequenceId();
            ElementTagType rightSequenceId;
            rightSequenceId = that.getSequenceId();
            if (this.sequenceId!= null) {
                if (that.sequenceId!= null) {
                    if (!leftSequenceId.equals(rightSequenceId)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.sequenceId!= null) {
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
            ElementTagType theAlternativesId;
            theAlternativesId = this.getAlternativesId();
            if (this.alternativesId!= null) {
                currentHashCode += theAlternativesId.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theSequenceId;
            theSequenceId = this.getSequenceId();
            if (this.sequenceId!= null) {
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
            ElementTagType theAlternativesId;
            theAlternativesId = this.getAlternativesId();
            strategy.appendField(locator, this, "alternativesId", buffer, theAlternativesId, (this.alternativesId!= null));
        }
        {
            ElementTagType theSequenceId;
            theSequenceId = this.getSequenceId();
            strategy.appendField(locator, this, "sequenceId", buffer, theSequenceId, (this.sequenceId!= null));
        }
        return buffer;
    }

}
