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
 * <p>Java class for SmartEnergyManagementPsPowerTimeSlotValueListElementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SmartEnergyManagementPsPowerTimeSlotValueListElementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="value" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}PowerTimeSlotValueDataElementsType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="valueType" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *                   &lt;element name="value" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberElementsType" minOccurs="0"/&gt;
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
@XmlType(name = "SmartEnergyManagementPsPowerTimeSlotValueListElementsType", propOrder = {
    "value"
})
public class SmartEnergyManagementPsPowerTimeSlotValueListElementsType implements Cloneable, CopyTo, ToString
{

    protected SmartEnergyManagementPsPowerTimeSlotValueListElementsType.Value value;

    /**
     * Default no-arg constructor
     * 
     */
    public SmartEnergyManagementPsPowerTimeSlotValueListElementsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public SmartEnergyManagementPsPowerTimeSlotValueListElementsType(final SmartEnergyManagementPsPowerTimeSlotValueListElementsType.Value value) {
        this.value = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link SmartEnergyManagementPsPowerTimeSlotValueListElementsType.Value }
     *     
     */
    public SmartEnergyManagementPsPowerTimeSlotValueListElementsType.Value getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmartEnergyManagementPsPowerTimeSlotValueListElementsType.Value }
     *     
     */
    public void setValue(SmartEnergyManagementPsPowerTimeSlotValueListElementsType.Value value) {
        this.value = value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmartEnergyManagementPsPowerTimeSlotValueListElementsType.Value }
     * @return
     *     The class instance
     */
    public SmartEnergyManagementPsPowerTimeSlotValueListElementsType withValue(SmartEnergyManagementPsPowerTimeSlotValueListElementsType.Value value) {
        setValue(value);
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
        if (draftCopy instanceof SmartEnergyManagementPsPowerTimeSlotValueListElementsType) {
            final SmartEnergyManagementPsPowerTimeSlotValueListElementsType copy = ((SmartEnergyManagementPsPowerTimeSlotValueListElementsType) draftCopy);
            {
                Boolean valueShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.value!= null));
                if (valueShouldBeCopiedAndSet == Boolean.TRUE) {
                    SmartEnergyManagementPsPowerTimeSlotValueListElementsType.Value sourceValue;
                    sourceValue = this.getValue();
                    SmartEnergyManagementPsPowerTimeSlotValueListElementsType.Value copyValue = ((SmartEnergyManagementPsPowerTimeSlotValueListElementsType.Value) strategy.copy(LocatorUtils.property(locator, "value", sourceValue), sourceValue, (this.value!= null)));
                    copy.setValue(copyValue);
                } else {
                    if (valueShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.value = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new SmartEnergyManagementPsPowerTimeSlotValueListElementsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final SmartEnergyManagementPsPowerTimeSlotValueListElementsType that = ((SmartEnergyManagementPsPowerTimeSlotValueListElementsType) object);
        {
            SmartEnergyManagementPsPowerTimeSlotValueListElementsType.Value leftValue;
            leftValue = this.getValue();
            SmartEnergyManagementPsPowerTimeSlotValueListElementsType.Value rightValue;
            rightValue = that.getValue();
            if (this.value!= null) {
                if (that.value!= null) {
                    if (!leftValue.equals(rightValue)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.value!= null) {
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
            SmartEnergyManagementPsPowerTimeSlotValueListElementsType.Value theValue;
            theValue = this.getValue();
            if (this.value!= null) {
                currentHashCode += theValue.hashCode();
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
            SmartEnergyManagementPsPowerTimeSlotValueListElementsType.Value theValue;
            theValue = this.getValue();
            strategy.appendField(locator, this, "value", buffer, theValue, (this.value!= null));
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
     *     &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}PowerTimeSlotValueDataElementsType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="valueType" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
     *         &lt;element name="value" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberElementsType" minOccurs="0"/&gt;
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
    public static class Value
        extends PowerTimeSlotValueDataElementsType
        implements Cloneable, CopyTo, ToString
    {


        /**
         * Default no-arg constructor
         * 
         */
        public Value() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public Value(final ElementTagType sequenceId, final ElementTagType slotNumber, final ElementTagType valueType, final ScaledNumberElementsType value) {
            super(sequenceId, slotNumber, valueType, value);
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
        public SmartEnergyManagementPsPowerTimeSlotValueListElementsType.Value withSequenceId(ElementTagType value) {
            setSequenceId(value);
            return this;
        }

        /**
         * Sets the value of the slotNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElementTagType }
         * @return
         *     The class instance
         */
        @Override
        public SmartEnergyManagementPsPowerTimeSlotValueListElementsType.Value withSlotNumber(ElementTagType value) {
            setSlotNumber(value);
            return this;
        }

        /**
         * Sets the value of the valueType property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElementTagType }
         * @return
         *     The class instance
         */
        @Override
        public SmartEnergyManagementPsPowerTimeSlotValueListElementsType.Value withValueType(ElementTagType value) {
            setValueType(value);
            return this;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link ScaledNumberElementsType }
         * @return
         *     The class instance
         */
        @Override
        public SmartEnergyManagementPsPowerTimeSlotValueListElementsType.Value withValue(ScaledNumberElementsType value) {
            setValue(value);
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
            return new SmartEnergyManagementPsPowerTimeSlotValueListElementsType.Value();
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
