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
 * <p>Java class for DataTunnelingHeaderElementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataTunnelingHeaderElementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="purposeId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="channelId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
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
@XmlType(name = "DataTunnelingHeaderElementsType", propOrder = {
    "purposeId",
    "channelId",
    "sequenceId"
})
public class DataTunnelingHeaderElementsType implements Cloneable, CopyTo, ToString
{

    protected ElementTagType purposeId;
    protected ElementTagType channelId;
    protected ElementTagType sequenceId;

    /**
     * Default no-arg constructor
     * 
     */
    public DataTunnelingHeaderElementsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public DataTunnelingHeaderElementsType(final ElementTagType purposeId, final ElementTagType channelId, final ElementTagType sequenceId) {
        this.purposeId = purposeId;
        this.channelId = channelId;
        this.sequenceId = sequenceId;
    }

    /**
     * Gets the value of the purposeId property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getPurposeId() {
        return purposeId;
    }

    /**
     * Sets the value of the purposeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setPurposeId(ElementTagType value) {
        this.purposeId = value;
    }

    /**
     * Gets the value of the channelId property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getChannelId() {
        return channelId;
    }

    /**
     * Sets the value of the channelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setChannelId(ElementTagType value) {
        this.channelId = value;
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
     * Sets the value of the purposeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public DataTunnelingHeaderElementsType withPurposeId(ElementTagType value) {
        setPurposeId(value);
        return this;
    }

    /**
     * Sets the value of the channelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public DataTunnelingHeaderElementsType withChannelId(ElementTagType value) {
        setChannelId(value);
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
    public DataTunnelingHeaderElementsType withSequenceId(ElementTagType value) {
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
        if (draftCopy instanceof DataTunnelingHeaderElementsType) {
            final DataTunnelingHeaderElementsType copy = ((DataTunnelingHeaderElementsType) draftCopy);
            {
                Boolean purposeIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.purposeId!= null));
                if (purposeIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourcePurposeId;
                    sourcePurposeId = this.getPurposeId();
                    ElementTagType copyPurposeId = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "purposeId", sourcePurposeId), sourcePurposeId, (this.purposeId!= null)));
                    copy.setPurposeId(copyPurposeId);
                } else {
                    if (purposeIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.purposeId = null;
                    }
                }
            }
            {
                Boolean channelIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.channelId!= null));
                if (channelIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceChannelId;
                    sourceChannelId = this.getChannelId();
                    ElementTagType copyChannelId = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "channelId", sourceChannelId), sourceChannelId, (this.channelId!= null)));
                    copy.setChannelId(copyChannelId);
                } else {
                    if (channelIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.channelId = null;
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
        return new DataTunnelingHeaderElementsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DataTunnelingHeaderElementsType that = ((DataTunnelingHeaderElementsType) object);
        {
            ElementTagType leftPurposeId;
            leftPurposeId = this.getPurposeId();
            ElementTagType rightPurposeId;
            rightPurposeId = that.getPurposeId();
            if (this.purposeId!= null) {
                if (that.purposeId!= null) {
                    if (!leftPurposeId.equals(rightPurposeId)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.purposeId!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftChannelId;
            leftChannelId = this.getChannelId();
            ElementTagType rightChannelId;
            rightChannelId = that.getChannelId();
            if (this.channelId!= null) {
                if (that.channelId!= null) {
                    if (!leftChannelId.equals(rightChannelId)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.channelId!= null) {
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
            ElementTagType thePurposeId;
            thePurposeId = this.getPurposeId();
            if (this.purposeId!= null) {
                currentHashCode += thePurposeId.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theChannelId;
            theChannelId = this.getChannelId();
            if (this.channelId!= null) {
                currentHashCode += theChannelId.hashCode();
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
            ElementTagType thePurposeId;
            thePurposeId = this.getPurposeId();
            strategy.appendField(locator, this, "purposeId", buffer, thePurposeId, (this.purposeId!= null));
        }
        {
            ElementTagType theChannelId;
            theChannelId = this.getChannelId();
            strategy.appendField(locator, this, "channelId", buffer, theChannelId, (this.channelId!= null));
        }
        {
            ElementTagType theSequenceId;
            theSequenceId = this.getSequenceId();
            strategy.appendField(locator, this, "sequenceId", buffer, theSequenceId, (this.sequenceId!= null));
        }
        return buffer;
    }

}
