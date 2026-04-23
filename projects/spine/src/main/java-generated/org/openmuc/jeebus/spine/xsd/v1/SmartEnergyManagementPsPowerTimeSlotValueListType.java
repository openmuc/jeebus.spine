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
import jakarta.xml.bind.annotation.XmlType;
import org.jvnet.jaxb.lang.CopyStrategy;
import org.jvnet.jaxb.lang.CopyTo;
import org.jvnet.jaxb.lang.JAXBCopyStrategy;
import org.jvnet.jaxb.lang.ToString;
import org.jvnet.jaxb.lang.ToStringStrategy;
import org.jvnet.jaxb.locator.ObjectLocator;
import org.jvnet.jaxb.locator.util.LocatorUtils;


/**
 * <p>Java class for SmartEnergyManagementPsPowerTimeSlotValueListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SmartEnergyManagementPsPowerTimeSlotValueListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="value" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}PowerTimeSlotValueDataType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="valueType" type="{http://docs.eebus.org/spine/xsd/v1}PowerTimeSlotValueTypeType" minOccurs="0"/&gt;
 *                   &lt;element name="value" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberType" minOccurs="0"/&gt;
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
@XmlType(name = "SmartEnergyManagementPsPowerTimeSlotValueListType", propOrder = {
    "value"
})
public class SmartEnergyManagementPsPowerTimeSlotValueListType implements Cloneable, CopyTo, ToString
{

    protected List<SmartEnergyManagementPsPowerTimeSlotValueListType.Value> value;

    /**
     * Default no-arg constructor
     * 
     */
    public SmartEnergyManagementPsPowerTimeSlotValueListType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public SmartEnergyManagementPsPowerTimeSlotValueListType(final List<SmartEnergyManagementPsPowerTimeSlotValueListType.Value> value) {
        this.value = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the value property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SmartEnergyManagementPsPowerTimeSlotValueListType.Value }
     * 
     * 
     */
    public List<SmartEnergyManagementPsPowerTimeSlotValueListType.Value> getValue() {
        if (value == null) {
            value = new ArrayList<SmartEnergyManagementPsPowerTimeSlotValueListType.Value>();
        }
        return this.value;
    }

    /**
     * Adds objects to the list of Value using add method
     * 
     * @param values
     *     objects to add to the list Value
     * @return
     *     The class instance
     */
    public SmartEnergyManagementPsPowerTimeSlotValueListType withValue(SmartEnergyManagementPsPowerTimeSlotValueListType.Value... values) {
        if (values!= null) {
            for (SmartEnergyManagementPsPowerTimeSlotValueListType.Value value: values) {
                getValue().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of Value using addAll method
     * 
     * @param values
     *     objects to add to the list Value
     * @return
     *     The class instance
     */
    public SmartEnergyManagementPsPowerTimeSlotValueListType withValue(Collection<SmartEnergyManagementPsPowerTimeSlotValueListType.Value> values) {
        if (values!= null) {
            getValue().addAll(values);
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
        if (draftCopy instanceof SmartEnergyManagementPsPowerTimeSlotValueListType) {
            final SmartEnergyManagementPsPowerTimeSlotValueListType copy = ((SmartEnergyManagementPsPowerTimeSlotValueListType) draftCopy);
            {
                Boolean valueShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.value!= null)&&(!this.value.isEmpty())));
                if (valueShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<SmartEnergyManagementPsPowerTimeSlotValueListType.Value> sourceValue;
                    sourceValue = (((this.value!= null)&&(!this.value.isEmpty()))?this.getValue():null);
                    @SuppressWarnings("unchecked")
                    List<SmartEnergyManagementPsPowerTimeSlotValueListType.Value> copyValue = ((List<SmartEnergyManagementPsPowerTimeSlotValueListType.Value> ) strategy.copy(LocatorUtils.property(locator, "value", sourceValue), sourceValue, ((this.value!= null)&&(!this.value.isEmpty()))));
                    copy.value = null;
                    if (copyValue!= null) {
                        List<SmartEnergyManagementPsPowerTimeSlotValueListType.Value> uniqueValuel = copy.getValue();
                        uniqueValuel.addAll(copyValue);
                    }
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
        return new SmartEnergyManagementPsPowerTimeSlotValueListType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final SmartEnergyManagementPsPowerTimeSlotValueListType that = ((SmartEnergyManagementPsPowerTimeSlotValueListType) object);
        {
            List<SmartEnergyManagementPsPowerTimeSlotValueListType.Value> leftValue;
            leftValue = (((this.value!= null)&&(!this.value.isEmpty()))?this.getValue():null);
            List<SmartEnergyManagementPsPowerTimeSlotValueListType.Value> rightValue;
            rightValue = (((that.value!= null)&&(!that.value.isEmpty()))?that.getValue():null);
            if ((this.value!= null)&&(!this.value.isEmpty())) {
                if ((that.value!= null)&&(!that.value.isEmpty())) {
                    if (!leftValue.equals(rightValue)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.value!= null)&&(!that.value.isEmpty())) {
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
            List<SmartEnergyManagementPsPowerTimeSlotValueListType.Value> theValue;
            theValue = (((this.value!= null)&&(!this.value.isEmpty()))?this.getValue():null);
            if ((this.value!= null)&&(!this.value.isEmpty())) {
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
            List<SmartEnergyManagementPsPowerTimeSlotValueListType.Value> theValue;
            theValue = (((this.value!= null)&&(!this.value.isEmpty()))?this.getValue():null);
            strategy.appendField(locator, this, "value", buffer, theValue, ((this.value!= null)&&(!this.value.isEmpty())));
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
     *     &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}PowerTimeSlotValueDataType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="valueType" type="{http://docs.eebus.org/spine/xsd/v1}PowerTimeSlotValueTypeType" minOccurs="0"/&gt;
     *         &lt;element name="value" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberType" minOccurs="0"/&gt;
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
        extends PowerTimeSlotValueDataType
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
        public Value(final Long sequenceId, final Long slotNumber, final String valueType, final ScaledNumberType value) {
            super(sequenceId, slotNumber, valueType, value);
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
        @Override
        public SmartEnergyManagementPsPowerTimeSlotValueListType.Value withSequenceId(Long value) {
            setSequenceId(value);
            return this;
        }

        /**
         * Sets the value of the slotNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         * @return
         *     The class instance
         */
        @Override
        public SmartEnergyManagementPsPowerTimeSlotValueListType.Value withSlotNumber(Long value) {
            setSlotNumber(value);
            return this;
        }

        /**
         * Sets the value of the valueType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         * @return
         *     The class instance
         */
        @Override
        public SmartEnergyManagementPsPowerTimeSlotValueListType.Value withValueType(String value) {
            setValueType(value);
            return this;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link ScaledNumberType }
         * @return
         *     The class instance
         */
        @Override
        public SmartEnergyManagementPsPowerTimeSlotValueListType.Value withValue(ScaledNumberType value) {
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
            return new SmartEnergyManagementPsPowerTimeSlotValueListType.Value();
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
