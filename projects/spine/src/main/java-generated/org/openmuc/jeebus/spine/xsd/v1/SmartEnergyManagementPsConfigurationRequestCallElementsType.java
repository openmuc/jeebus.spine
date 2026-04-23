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


/**
 * <p>Java class for SmartEnergyManagementPsConfigurationRequestCallElementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SmartEnergyManagementPsConfigurationRequestCallElementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="scheduleConfigurationRequest" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}PowerSequenceScheduleConfigurationRequestCallElementsType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="sequenceId" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SmartEnergyManagementPsConfigurationRequestCallElementsType", propOrder = {
    "scheduleConfigurationRequest"
})
public class SmartEnergyManagementPsConfigurationRequestCallElementsType implements Cloneable, CopyTo, ToString
{

    protected SmartEnergyManagementPsConfigurationRequestCallElementsType.ScheduleConfigurationRequest scheduleConfigurationRequest;

    /**
     * Default no-arg constructor
     * 
     */
    public SmartEnergyManagementPsConfigurationRequestCallElementsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public SmartEnergyManagementPsConfigurationRequestCallElementsType(final SmartEnergyManagementPsConfigurationRequestCallElementsType.ScheduleConfigurationRequest scheduleConfigurationRequest) {
        this.scheduleConfigurationRequest = scheduleConfigurationRequest;
    }

    /**
     * Gets the value of the scheduleConfigurationRequest property.
     * 
     * @return
     *     possible object is
     *     {@link SmartEnergyManagementPsConfigurationRequestCallElementsType.ScheduleConfigurationRequest }
     *     
     */
    public SmartEnergyManagementPsConfigurationRequestCallElementsType.ScheduleConfigurationRequest getScheduleConfigurationRequest() {
        return scheduleConfigurationRequest;
    }

    /**
     * Sets the value of the scheduleConfigurationRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmartEnergyManagementPsConfigurationRequestCallElementsType.ScheduleConfigurationRequest }
     *     
     */
    public void setScheduleConfigurationRequest(SmartEnergyManagementPsConfigurationRequestCallElementsType.ScheduleConfigurationRequest value) {
        this.scheduleConfigurationRequest = value;
    }

    /**
     * Sets the value of the scheduleConfigurationRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmartEnergyManagementPsConfigurationRequestCallElementsType.ScheduleConfigurationRequest }
     * @return
     *     The class instance
     */
    public SmartEnergyManagementPsConfigurationRequestCallElementsType withScheduleConfigurationRequest(SmartEnergyManagementPsConfigurationRequestCallElementsType.ScheduleConfigurationRequest value) {
        setScheduleConfigurationRequest(value);
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
        if (draftCopy instanceof SmartEnergyManagementPsConfigurationRequestCallElementsType) {
            final SmartEnergyManagementPsConfigurationRequestCallElementsType copy = ((SmartEnergyManagementPsConfigurationRequestCallElementsType) draftCopy);
            {
                Boolean scheduleConfigurationRequestShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.scheduleConfigurationRequest!= null));
                if (scheduleConfigurationRequestShouldBeCopiedAndSet == Boolean.TRUE) {
                    SmartEnergyManagementPsConfigurationRequestCallElementsType.ScheduleConfigurationRequest sourceScheduleConfigurationRequest;
                    sourceScheduleConfigurationRequest = this.getScheduleConfigurationRequest();
                    SmartEnergyManagementPsConfigurationRequestCallElementsType.ScheduleConfigurationRequest copyScheduleConfigurationRequest = ((SmartEnergyManagementPsConfigurationRequestCallElementsType.ScheduleConfigurationRequest) strategy.copy(LocatorUtils.property(locator, "scheduleConfigurationRequest", sourceScheduleConfigurationRequest), sourceScheduleConfigurationRequest, (this.scheduleConfigurationRequest!= null)));
                    copy.setScheduleConfigurationRequest(copyScheduleConfigurationRequest);
                } else {
                    if (scheduleConfigurationRequestShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.scheduleConfigurationRequest = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new SmartEnergyManagementPsConfigurationRequestCallElementsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final SmartEnergyManagementPsConfigurationRequestCallElementsType that = ((SmartEnergyManagementPsConfigurationRequestCallElementsType) object);
        {
            SmartEnergyManagementPsConfigurationRequestCallElementsType.ScheduleConfigurationRequest leftScheduleConfigurationRequest;
            leftScheduleConfigurationRequest = this.getScheduleConfigurationRequest();
            SmartEnergyManagementPsConfigurationRequestCallElementsType.ScheduleConfigurationRequest rightScheduleConfigurationRequest;
            rightScheduleConfigurationRequest = that.getScheduleConfigurationRequest();
            if (this.scheduleConfigurationRequest!= null) {
                if (that.scheduleConfigurationRequest!= null) {
                    if (!leftScheduleConfigurationRequest.equals(rightScheduleConfigurationRequest)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.scheduleConfigurationRequest!= null) {
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
            SmartEnergyManagementPsConfigurationRequestCallElementsType.ScheduleConfigurationRequest theScheduleConfigurationRequest;
            theScheduleConfigurationRequest = this.getScheduleConfigurationRequest();
            if (this.scheduleConfigurationRequest!= null) {
                currentHashCode += theScheduleConfigurationRequest.hashCode();
            }
        }
        return currentHashCode;
    }

    @Override
    public String toString() {
        final ToStringStrategy strategy = new org.openmuc.jeebus.spine.impl.parser.CustomToStringStrategy();
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
            SmartEnergyManagementPsConfigurationRequestCallElementsType.ScheduleConfigurationRequest theScheduleConfigurationRequest;
            theScheduleConfigurationRequest = this.getScheduleConfigurationRequest();
            strategy.appendField(locator, this, "scheduleConfigurationRequest", buffer, theScheduleConfigurationRequest, (this.scheduleConfigurationRequest!= null));
        }
        return buffer;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}PowerSequenceScheduleConfigurationRequestCallElementsType"&gt;
     *       &lt;sequence&gt;
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
    @XmlType(name = "")
    public static class ScheduleConfigurationRequest
        extends PowerSequenceScheduleConfigurationRequestCallElementsType
        implements Cloneable, CopyTo, ToString
    {


        /**
         * Default no-arg constructor
         * 
         */
        public ScheduleConfigurationRequest() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public ScheduleConfigurationRequest(final ElementTagType sequenceId) {
            super(sequenceId);
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
        @Override
        public SmartEnergyManagementPsConfigurationRequestCallElementsType.ScheduleConfigurationRequest withSequenceId(ElementTagType value) {
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
            super.copyTo(locator, draftCopy, strategy);
            return draftCopy;
        }

        @Override
        public Object createNewInstance() {
            return new SmartEnergyManagementPsConfigurationRequestCallElementsType.ScheduleConfigurationRequest();
        }

        @Override
        public boolean equals(Object object) {
            if ((object == null)||(this.getClass()!= object.getClass())) {
                return false;
            }
            if (this == object) {
                return true;
            }
            if (!super.equals(object)) {
                return false;
            }
            return true;
        }

        @Override
        public int hashCode() {
            int currentHashCode = 1;
            currentHashCode = ((currentHashCode* 31)+ super.hashCode());
            return currentHashCode;
        }

        @Override
        public String toString() {
            final ToStringStrategy strategy = new org.openmuc.jeebus.spine.impl.parser.CustomToStringStrategy();
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
            super.appendFields(locator, buffer, strategy);
            return buffer;
        }

    }

}
