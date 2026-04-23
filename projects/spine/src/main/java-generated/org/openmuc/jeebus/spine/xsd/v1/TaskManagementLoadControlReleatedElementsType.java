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
 * <p>Java class for TaskManagementLoadControlReleatedElementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaskManagementLoadControlReleatedElementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="eventId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaskManagementLoadControlReleatedElementsType", propOrder = {
    "eventId"
})
public class TaskManagementLoadControlReleatedElementsType implements Cloneable, CopyTo, ToString
{

    protected ElementTagType eventId;

    /**
     * Default no-arg constructor
     * 
     */
    public TaskManagementLoadControlReleatedElementsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public TaskManagementLoadControlReleatedElementsType(final ElementTagType eventId) {
        this.eventId = eventId;
    }

    /**
     * Gets the value of the eventId property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getEventId() {
        return eventId;
    }

    /**
     * Sets the value of the eventId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setEventId(ElementTagType value) {
        this.eventId = value;
    }

    /**
     * Sets the value of the eventId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public TaskManagementLoadControlReleatedElementsType withEventId(ElementTagType value) {
        setEventId(value);
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
        if (draftCopy instanceof TaskManagementLoadControlReleatedElementsType) {
            final TaskManagementLoadControlReleatedElementsType copy = ((TaskManagementLoadControlReleatedElementsType) draftCopy);
            {
                Boolean eventIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.eventId!= null));
                if (eventIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceEventId;
                    sourceEventId = this.getEventId();
                    ElementTagType copyEventId = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "eventId", sourceEventId), sourceEventId, (this.eventId!= null)));
                    copy.setEventId(copyEventId);
                } else {
                    if (eventIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.eventId = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new TaskManagementLoadControlReleatedElementsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TaskManagementLoadControlReleatedElementsType that = ((TaskManagementLoadControlReleatedElementsType) object);
        {
            ElementTagType leftEventId;
            leftEventId = this.getEventId();
            ElementTagType rightEventId;
            rightEventId = that.getEventId();
            if (this.eventId!= null) {
                if (that.eventId!= null) {
                    if (!leftEventId.equals(rightEventId)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.eventId!= null) {
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
            ElementTagType theEventId;
            theEventId = this.getEventId();
            if (this.eventId!= null) {
                currentHashCode += theEventId.hashCode();
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
            ElementTagType theEventId;
            theEventId = this.getEventId();
            strategy.appendField(locator, this, "eventId", buffer, theEventId, (this.eventId!= null));
        }
        return buffer;
    }

}
