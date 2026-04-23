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
import org.openmuc.jeebus.spine.impl.parser.CustomToStringStrategy;


/**
 * <p>Java class for ScaledNumberSetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScaledNumberSetType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="value" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="range" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberRangeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScaledNumberSetType", propOrder = {
    "value",
    "range"
})
public class ScaledNumberSetType implements Cloneable, CopyTo, ToString
{

    protected List<ScaledNumberType> value;
    protected List<ScaledNumberRangeType> range;

    /**
     * Default no-arg constructor
     * 
     */
    public ScaledNumberSetType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public ScaledNumberSetType(final List<ScaledNumberType> value, final List<ScaledNumberRangeType> range) {
        this.value = value;
        this.range = range;
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
     * {@link ScaledNumberType }
     * 
     * 
     */
    public List<ScaledNumberType> getValue() {
        if (value == null) {
            value = new ArrayList<ScaledNumberType>();
        }
        return this.value;
    }

    /**
     * Gets the value of the range property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the range property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ScaledNumberRangeType }
     * 
     * 
     */
    public List<ScaledNumberRangeType> getRange() {
        if (range == null) {
            range = new ArrayList<ScaledNumberRangeType>();
        }
        return this.range;
    }

    /**
     * Adds objects to the list of Value using add method
     * 
     * @param values
     *     objects to add to the list Value
     * @return
     *     The class instance
     */
    public ScaledNumberSetType withValue(ScaledNumberType... values) {
        if (values!= null) {
            for (ScaledNumberType value: values) {
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
    public ScaledNumberSetType withValue(Collection<ScaledNumberType> values) {
        if (values!= null) {
            getValue().addAll(values);
        }
        return this;
    }

    /**
     * Adds objects to the list of Range using add method
     * 
     * @param values
     *     objects to add to the list Range
     * @return
     *     The class instance
     */
    public ScaledNumberSetType withRange(ScaledNumberRangeType... values) {
        if (values!= null) {
            for (ScaledNumberRangeType value: values) {
                getRange().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of Range using addAll method
     * 
     * @param values
     *     objects to add to the list Range
     * @return
     *     The class instance
     */
    public ScaledNumberSetType withRange(Collection<ScaledNumberRangeType> values) {
        if (values!= null) {
            getRange().addAll(values);
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
        if (draftCopy instanceof ScaledNumberSetType) {
            final ScaledNumberSetType copy = ((ScaledNumberSetType) draftCopy);
            {
                Boolean valueShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.value!= null)&&(!this.value.isEmpty())));
                if (valueShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<ScaledNumberType> sourceValue;
                    sourceValue = (((this.value!= null)&&(!this.value.isEmpty()))?this.getValue():null);
                    @SuppressWarnings("unchecked")
                    List<ScaledNumberType> copyValue = ((List<ScaledNumberType> ) strategy.copy(LocatorUtils.property(locator, "value", sourceValue), sourceValue, ((this.value!= null)&&(!this.value.isEmpty()))));
                    copy.value = null;
                    if (copyValue!= null) {
                        List<ScaledNumberType> uniqueValuel = copy.getValue();
                        uniqueValuel.addAll(copyValue);
                    }
                } else {
                    if (valueShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.value = null;
                    }
                }
            }
            {
                Boolean rangeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.range!= null)&&(!this.range.isEmpty())));
                if (rangeShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<ScaledNumberRangeType> sourceRange;
                    sourceRange = (((this.range!= null)&&(!this.range.isEmpty()))?this.getRange():null);
                    @SuppressWarnings("unchecked")
                    List<ScaledNumberRangeType> copyRange = ((List<ScaledNumberRangeType> ) strategy.copy(LocatorUtils.property(locator, "range", sourceRange), sourceRange, ((this.range!= null)&&(!this.range.isEmpty()))));
                    copy.range = null;
                    if (copyRange!= null) {
                        List<ScaledNumberRangeType> uniqueRangel = copy.getRange();
                        uniqueRangel.addAll(copyRange);
                    }
                } else {
                    if (rangeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.range = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new ScaledNumberSetType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ScaledNumberSetType that = ((ScaledNumberSetType) object);
        {
            List<ScaledNumberType> leftValue;
            leftValue = (((this.value!= null)&&(!this.value.isEmpty()))?this.getValue():null);
            List<ScaledNumberType> rightValue;
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
        {
            List<ScaledNumberRangeType> leftRange;
            leftRange = (((this.range!= null)&&(!this.range.isEmpty()))?this.getRange():null);
            List<ScaledNumberRangeType> rightRange;
            rightRange = (((that.range!= null)&&(!that.range.isEmpty()))?that.getRange():null);
            if ((this.range!= null)&&(!this.range.isEmpty())) {
                if ((that.range!= null)&&(!that.range.isEmpty())) {
                    if (!leftRange.equals(rightRange)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.range!= null)&&(!that.range.isEmpty())) {
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
            List<ScaledNumberType> theValue;
            theValue = (((this.value!= null)&&(!this.value.isEmpty()))?this.getValue():null);
            if ((this.value!= null)&&(!this.value.isEmpty())) {
                currentHashCode += theValue.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            List<ScaledNumberRangeType> theRange;
            theRange = (((this.range!= null)&&(!this.range.isEmpty()))?this.getRange():null);
            if ((this.range!= null)&&(!this.range.isEmpty())) {
                currentHashCode += theRange.hashCode();
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
            List<ScaledNumberType> theValue;
            theValue = (((this.value!= null)&&(!this.value.isEmpty()))?this.getValue():null);
            strategy.appendField(locator, this, "value", buffer, theValue, ((this.value!= null)&&(!this.value.isEmpty())));
        }
        {
            List<ScaledNumberRangeType> theRange;
            theRange = (((this.range!= null)&&(!this.range.isEmpty()))?this.getRange():null);
            strategy.appendField(locator, this, "range", buffer, theRange, ((this.range!= null)&&(!this.range.isEmpty())));
        }
        return buffer;
    }

}
