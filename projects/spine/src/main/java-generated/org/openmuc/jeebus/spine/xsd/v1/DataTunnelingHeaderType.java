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
 * <p>Java class for DataTunnelingHeaderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataTunnelingHeaderType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="purposeId" type="{http://docs.eebus.org/spine/xsd/v1}PurposeIdType" minOccurs="0"/&gt;
 *         &lt;element name="channelId" type="{http://docs.eebus.org/spine/xsd/v1}ChannelIdType" minOccurs="0"/&gt;
 *         &lt;element name="sequenceId" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataTunnelingHeaderType", propOrder = {
    "purposeId",
    "channelId",
    "sequenceId"
})
public class DataTunnelingHeaderType implements Cloneable, CopyTo, ToString
{

    protected String purposeId;
    @XmlSchemaType(name = "unsignedInt")
    protected Long channelId;
    @XmlSchemaType(name = "unsignedInt")
    protected Long sequenceId;

    /**
     * Default no-arg constructor
     * 
     */
    public DataTunnelingHeaderType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public DataTunnelingHeaderType(final String purposeId, final Long channelId, final Long sequenceId) {
        this.purposeId = purposeId;
        this.channelId = channelId;
        this.sequenceId = sequenceId;
    }

    /**
     * Gets the value of the purposeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurposeId() {
        return purposeId;
    }

    /**
     * Sets the value of the purposeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurposeId(String value) {
        this.purposeId = value;
    }

    /**
     * Gets the value of the channelId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getChannelId() {
        return channelId;
    }

    /**
     * Sets the value of the channelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setChannelId(Long value) {
        this.channelId = value;
    }

    /**
     * Gets the value of the sequenceId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSequenceId() {
        return sequenceId;
    }

    /**
     * Sets the value of the sequenceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSequenceId(Long value) {
        this.sequenceId = value;
    }

    /**
     * Sets the value of the purposeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public DataTunnelingHeaderType withPurposeId(String value) {
        setPurposeId(value);
        return this;
    }

    /**
     * Sets the value of the channelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     * @return
     *     The class instance
     */
    public DataTunnelingHeaderType withChannelId(Long value) {
        setChannelId(value);
        return this;
    }

    /**
     * Sets the value of the sequenceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     * @return
     *     The class instance
     */
    public DataTunnelingHeaderType withSequenceId(Long value) {
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
        if (draftCopy instanceof DataTunnelingHeaderType) {
            final DataTunnelingHeaderType copy = ((DataTunnelingHeaderType) draftCopy);
            {
                Boolean purposeIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.purposeId!= null));
                if (purposeIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourcePurposeId;
                    sourcePurposeId = this.getPurposeId();
                    String copyPurposeId = ((String) strategy.copy(LocatorUtils.property(locator, "purposeId", sourcePurposeId), sourcePurposeId, (this.purposeId!= null)));
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
                    Long sourceChannelId;
                    sourceChannelId = this.getChannelId();
                    Long copyChannelId = ((Long) strategy.copy(LocatorUtils.property(locator, "channelId", sourceChannelId), sourceChannelId, (this.channelId!= null)));
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
                    Long sourceSequenceId;
                    sourceSequenceId = this.getSequenceId();
                    Long copySequenceId = ((Long) strategy.copy(LocatorUtils.property(locator, "sequenceId", sourceSequenceId), sourceSequenceId, (this.sequenceId!= null)));
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
        return new DataTunnelingHeaderType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DataTunnelingHeaderType that = ((DataTunnelingHeaderType) object);
        {
            String leftPurposeId;
            leftPurposeId = this.getPurposeId();
            String rightPurposeId;
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
            Long leftChannelId;
            leftChannelId = this.getChannelId();
            Long rightChannelId;
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
            Long leftSequenceId;
            leftSequenceId = this.getSequenceId();
            Long rightSequenceId;
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
            String thePurposeId;
            thePurposeId = this.getPurposeId();
            if (this.purposeId!= null) {
                currentHashCode += thePurposeId.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            Long theChannelId;
            theChannelId = this.getChannelId();
            if (this.channelId!= null) {
                currentHashCode += theChannelId.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            Long theSequenceId;
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
            String thePurposeId;
            thePurposeId = this.getPurposeId();
            strategy.appendField(locator, this, "purposeId", buffer, thePurposeId, (this.purposeId!= null));
        }
        {
            Long theChannelId;
            theChannelId = this.getChannelId();
            strategy.appendField(locator, this, "channelId", buffer, theChannelId, (this.channelId!= null));
        }
        {
            Long theSequenceId;
            theSequenceId = this.getSequenceId();
            strategy.appendField(locator, this, "sequenceId", buffer, theSequenceId, (this.sequenceId!= null));
        }
        return buffer;
    }

}
